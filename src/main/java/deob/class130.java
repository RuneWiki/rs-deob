package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("dj")
public final class class130 implements Runnable {

    @ObfuscatedName("dj.k")
    public InputStream field2047;

    @ObfuscatedName("dj.b")
    public OutputStream field2040;

    @ObfuscatedName("dj.e")
    public Socket field2044;

    @ObfuscatedName("dj.i")
    public boolean field2042 = false;

    @ObfuscatedName("dj.t")
    public class123 field2043;

    @ObfuscatedName("dj.z")
    public class133 field2039;

    @ObfuscatedName("dj.g")
    public byte[] field2045;

    @ObfuscatedName("dj.c")
    public int field2046 = 0;

    @ObfuscatedName("dj.o")
    public int field2048 = 0;

    @ObfuscatedName("dj.q")
    public boolean field2041 = false;

    public class130(Socket arg0, class123 arg1) throws IOException {
        this.field2043 = arg1;
        this.field2044 = arg0;
        this.field2044.setSoTimeout(30000);
        this.field2044.setTcpNoDelay(true);
        this.field2047 = this.field2044.getInputStream();
        this.field2040 = this.field2044.getOutputStream();
    }

    @ObfuscatedName("dj.i(B)V")
    public void method2567() {
        if (this.field2042) {
            return;
        }
        synchronized (this) {
            this.field2042 = true;
            this.notifyAll();
        }
        if (this.field2039 != null) {
            while (this.field2039.field2069 == 0) {
                class114.method500(1L);
            }
            if (this.field2039.field2069 == 1) {
                try {
                    ((Thread) this.field2039.field2070).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2039 = null;
    }

    public void finalize() {
        this.method2567();
    }

    @ObfuscatedName("dj.t(B)I")
    public int method2564() throws IOException {
        return this.field2042 ? 0 : this.field2047.read();
    }

    @ObfuscatedName("dj.z(B)I")
    public int method2565() throws IOException {
        return this.field2042 ? 0 : this.field2047.available();
    }

    @ObfuscatedName("dj.g([BIIB)V")
    public void method2577(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2042) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field2047.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("dj.c([BIII)V")
    public void method2563(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2042) {
            return;
        }
        if (this.field2041) {
            this.field2041 = false;
            throw new IOException();
        }
        if (this.field2045 == null) {
            this.field2045 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2045[this.field2048] = arg0[arg1 + var5];
                this.field2048 = (this.field2048 + 1) % 5000;
                if ((this.field2046 + 4900) % 5000 == this.field2048) {
                    throw new IOException();
                }
            }
            if (this.field2039 == null) {
                this.field2039 = this.field2043.method2463(this, 3);
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
                        if (this.field2048 == this.field2046) {
                            if (this.field2042) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2046;
                        if (this.field2048 >= this.field2046) {
                            var4 = this.field2048 - this.field2046;
                        } else {
                            var4 = 5000 - this.field2046;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2040.write(this.field2045, var3, var4);
                    } catch (IOException var12) {
                        this.field2041 = true;
                    }
                    this.field2046 = (this.field2046 + var4) % 5000;
                    try {
                        if (this.field2048 == this.field2046) {
                            this.field2040.flush();
                        }
                    } catch (IOException var11) {
                        this.field2041 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2047 != null) {
                        this.field2047.close();
                    }
                    if (this.field2040 != null) {
                        this.field2040.close();
                    }
                    if (this.field2044 != null) {
                        this.field2044.close();
                    }
                } catch (IOException var10) {
                }
                this.field2045 = null;
                break;
            }
        } catch (Exception var15) {
            class135.method2560((String) null, var15);
        }
    }
}
