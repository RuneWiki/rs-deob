package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("df")
public final class class130 implements Runnable {

    @ObfuscatedName("df.j")
    public InputStream field2042;

    @ObfuscatedName("df.z")
    public OutputStream field2045;

    @ObfuscatedName("df.y")
    public Socket field2047;

    @ObfuscatedName("df.h")
    public boolean field2050 = false;

    @ObfuscatedName("df.r")
    public class123 field2044;

    @ObfuscatedName("df.e")
    public class133 field2046;

    @ObfuscatedName("df.k")
    public byte[] field2043;

    @ObfuscatedName("df.b")
    public int field2048 = 0;

    @ObfuscatedName("df.n")
    public int field2049 = 0;

    @ObfuscatedName("df.a")
    public boolean field2041 = false;

    public class130(Socket arg0, class123 arg1) throws IOException {
        this.field2044 = arg1;
        this.field2047 = arg0;
        this.field2047.setSoTimeout(30000);
        this.field2047.setTcpNoDelay(true);
        this.field2042 = this.field2047.getInputStream();
        this.field2045 = this.field2047.getOutputStream();
    }

    @ObfuscatedName("df.z(B)V")
    public void method2627() {
        if (this.field2050) {
            return;
        }
        synchronized (this) {
            this.field2050 = true;
            this.notifyAll();
        }
        if (this.field2046 != null) {
            while (this.field2046.field2071 == 0) {
                class114.method589(1L);
            }
            if (this.field2046.field2071 == 1) {
                try {
                    ((Thread) this.field2046.field2075).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2046 = null;
    }

    public void finalize() {
        this.method2627();
    }

    @ObfuscatedName("df.y(B)I")
    public int method2612() throws IOException {
        return this.field2050 ? 0 : this.field2042.read();
    }

    @ObfuscatedName("df.h(B)I")
    public int method2607() throws IOException {
        return this.field2050 ? 0 : this.field2042.available();
    }

    @ObfuscatedName("df.r([BIII)V")
    public void method2608(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2050) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field2042.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("df.e([BIII)V")
    public void method2613(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2050) {
            return;
        }
        if (this.field2041) {
            this.field2041 = false;
            throw new IOException();
        }
        if (this.field2043 == null) {
            this.field2043 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2043[this.field2049] = arg0[arg1 + var5];
                this.field2049 = (this.field2049 + 1) % 5000;
                if ((this.field2048 + 4900) % 5000 == this.field2049) {
                    throw new IOException();
                }
            }
            if (this.field2046 == null) {
                this.field2046 = this.field2044.method2492(this, 3);
            }
            this.notifyAll();
        }
    }

    public void run() {
        try {
            while (true) {
                label84: {
                    int var3;
                    int var4;
                    synchronized (this) {
                        if (this.field2049 == this.field2048) {
                            if (this.field2050) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2048;
                        if (this.field2049 >= this.field2048) {
                            var4 = this.field2049 - this.field2048;
                        } else {
                            var4 = 5000 - this.field2048;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2045.write(this.field2043, var3, var4);
                    } catch (IOException var12) {
                        this.field2041 = true;
                    }
                    this.field2048 = (this.field2048 + var4) % 5000;
                    try {
                        if (this.field2049 == this.field2048) {
                            this.field2045.flush();
                        }
                    } catch (IOException var11) {
                        this.field2041 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2042 != null) {
                        this.field2042.close();
                    }
                    if (this.field2045 != null) {
                        this.field2045.close();
                    }
                    if (this.field2047 != null) {
                        this.field2047.close();
                    }
                } catch (IOException var10) {
                }
                this.field2043 = null;
                break;
            }
        } catch (Exception var15) {
            class135.method495((String) null, var15);
        }
    }
}
