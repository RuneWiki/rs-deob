package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("dw")
public final class class130 implements Runnable {

    @ObfuscatedName("dw.g")
    public InputStream field2049;

    @ObfuscatedName("dw.i")
    public OutputStream field2038;

    @ObfuscatedName("dw.k")
    public Socket field2046;

    @ObfuscatedName("dw.e")
    public boolean field2043 = false;

    @ObfuscatedName("dw.w")
    public class123 field2041;

    @ObfuscatedName("dw.m")
    public class133 field2042;

    @ObfuscatedName("dw.u")
    public byte[] field2047;

    @ObfuscatedName("dw.j")
    public int field2044 = 0;

    @ObfuscatedName("dw.o")
    public int field2045 = 0;

    @ObfuscatedName("dw.h")
    public boolean field2040 = false;

    public class130(Socket arg0, class123 arg1) throws IOException {
        this.field2041 = arg1;
        this.field2046 = arg0;
        this.field2046.setSoTimeout(30000);
        this.field2046.setTcpNoDelay(true);
        this.field2049 = this.field2046.getInputStream();
        this.field2038 = this.field2046.getOutputStream();
    }

    @ObfuscatedName("dw.k(I)V")
    public void method2553() {
        if (this.field2043) {
            return;
        }
        synchronized (this) {
            this.field2043 = true;
            this.notifyAll();
        }
        if (this.field2042 != null) {
            while (this.field2042.field2070 == 0) {
                class114.method1935(1L);
            }
            if (this.field2042.field2070 == 1) {
                try {
                    ((Thread) this.field2042.field2077).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2042 = null;
    }

    public void finalize() {
        this.method2553();
    }

    @ObfuscatedName("dw.e(B)I")
    public int method2550() throws IOException {
        return this.field2043 ? 0 : this.field2049.read();
    }

    @ObfuscatedName("dw.w(I)I")
    public int method2551() throws IOException {
        return this.field2043 ? 0 : this.field2049.available();
    }

    @ObfuscatedName("dw.m([BIII)V")
    public void method2557(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2043) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field2049.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("dw.u([BIII)V")
    public void method2568(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2043) {
            return;
        }
        if (this.field2040) {
            this.field2040 = false;
            throw new IOException();
        }
        if (this.field2047 == null) {
            this.field2047 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2047[this.field2045] = arg0[arg1 + var5];
                this.field2045 = (this.field2045 + 1) % 5000;
                if ((this.field2044 + 4900) % 5000 == this.field2045) {
                    throw new IOException();
                }
            }
            if (this.field2042 == null) {
                this.field2042 = this.field2041.method2461(this, 3);
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
                            if (this.field2043) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2044;
                        if (this.field2045 >= this.field2044) {
                            var4 = this.field2045 - this.field2044;
                        } else {
                            var4 = 5000 - this.field2044;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2038.write(this.field2047, var3, var4);
                    } catch (IOException var12) {
                        this.field2040 = true;
                    }
                    this.field2044 = (this.field2044 + var4) % 5000;
                    try {
                        if (this.field2045 == this.field2044) {
                            this.field2038.flush();
                        }
                    } catch (IOException var11) {
                        this.field2040 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2049 != null) {
                        this.field2049.close();
                    }
                    if (this.field2038 != null) {
                        this.field2038.close();
                    }
                    if (this.field2046 != null) {
                        this.field2046.close();
                    }
                } catch (IOException var10) {
                }
                this.field2047 = null;
                break;
            }
        } catch (Exception var15) {
            class135.method33((String) null, var15);
        }
    }
}
