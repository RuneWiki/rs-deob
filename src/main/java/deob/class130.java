package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("do")
public final class class130 implements Runnable {

    @ObfuscatedName("do.b")
    public InputStream field2048;

    @ObfuscatedName("do.u")
    public OutputStream field2038;

    @ObfuscatedName("do.x")
    public Socket field2036;

    @ObfuscatedName("do.j")
    public boolean field2039 = false;

    @ObfuscatedName("do.o")
    public class123 field2040;

    @ObfuscatedName("do.n")
    public class133 field2041;

    @ObfuscatedName("do.y")
    public byte[] field2042;

    @ObfuscatedName("do.f")
    public int field2045 = 0;

    @ObfuscatedName("do.p")
    public int field2044 = 0;

    @ObfuscatedName("do.l")
    public boolean field2037 = false;

    public class130(Socket arg0, class123 arg1) throws IOException {
        this.field2040 = arg1;
        this.field2036 = arg0;
        this.field2036.setSoTimeout(30000);
        this.field2036.setTcpNoDelay(true);
        this.field2048 = this.field2036.getInputStream();
        this.field2038 = this.field2036.getOutputStream();
    }

    @ObfuscatedName("do.u(I)V")
    public void method2591() {
        if (this.field2039) {
            return;
        }
        synchronized (this) {
            this.field2039 = true;
            this.notifyAll();
        }
        if (this.field2041 != null) {
            while (this.field2041.field2070 == 0) {
                class114.method2914(1L);
            }
            if (this.field2041.field2070 == 1) {
                try {
                    ((Thread) this.field2041.field2069).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2041 = null;
    }

    public void finalize() {
        this.method2591();
    }

    @ObfuscatedName("do.x(I)I")
    public int method2587() throws IOException {
        return this.field2039 ? 0 : this.field2048.read();
    }

    @ObfuscatedName("do.j(I)I")
    public int method2585() throws IOException {
        return this.field2039 ? 0 : this.field2048.available();
    }

    @ObfuscatedName("do.o([BIII)V")
    public void method2586(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2039) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field2048.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("do.n([BIII)V")
    public void method2584(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2039) {
            return;
        }
        if (this.field2037) {
            this.field2037 = false;
            throw new IOException();
        }
        if (this.field2042 == null) {
            this.field2042 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2042[this.field2044] = arg0[arg1 + var5];
                this.field2044 = (this.field2044 + 1) % 5000;
                if ((this.field2045 + 4900) % 5000 == this.field2044) {
                    throw new IOException();
                }
            }
            if (this.field2041 == null) {
                this.field2041 = this.field2040.method2487(this, 3);
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
                        if (this.field2045 == this.field2044) {
                            if (this.field2039) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2045;
                        if (this.field2044 >= this.field2045) {
                            var4 = this.field2044 - this.field2045;
                        } else {
                            var4 = 5000 - this.field2045;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2038.write(this.field2042, var3, var4);
                    } catch (IOException var12) {
                        this.field2037 = true;
                    }
                    this.field2045 = (this.field2045 + var4) % 5000;
                    try {
                        if (this.field2045 == this.field2044) {
                            this.field2038.flush();
                        }
                    } catch (IOException var11) {
                        this.field2037 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2048 != null) {
                        this.field2048.close();
                    }
                    if (this.field2038 != null) {
                        this.field2038.close();
                    }
                    if (this.field2036 != null) {
                        this.field2036.close();
                    }
                } catch (IOException var10) {
                }
                this.field2042 = null;
                break;
            }
        } catch (Exception var15) {
            class135.method3292((String) null, var15);
        }
    }
}
