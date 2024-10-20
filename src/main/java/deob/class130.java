package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("dk")
public final class class130 implements Runnable {

    @ObfuscatedName("dk.k")
    public InputStream field2048;

    @ObfuscatedName("dk.y")
    public OutputStream field2046;

    @ObfuscatedName("dk.s")
    public Socket field2038;

    @ObfuscatedName("dk.g")
    public boolean field2039 = false;

    @ObfuscatedName("dk.h")
    public class123 field2049;

    @ObfuscatedName("dk.l")
    public class133 field2036;

    @ObfuscatedName("dk.e")
    public byte[] field2042;

    @ObfuscatedName("dk.u")
    public int field2043 = 0;

    @ObfuscatedName("dk.j")
    public int field2037 = 0;

    @ObfuscatedName("dk.c")
    public boolean field2040 = false;

    public class130(Socket arg0, class123 arg1) throws IOException {
        this.field2049 = arg1;
        this.field2038 = arg0;
        this.field2038.setSoTimeout(30000);
        this.field2038.setTcpNoDelay(true);
        this.field2048 = this.field2038.getInputStream();
        this.field2046 = this.field2038.getOutputStream();
    }

    @ObfuscatedName("dk.l(I)V")
    public void method2584() {
        if (this.field2039) {
            return;
        }
        synchronized (this) {
            this.field2039 = true;
            this.notifyAll();
        }
        if (this.field2036 != null) {
            while (this.field2036.field2072 == 0) {
                class114.method1888(1L);
            }
            if (this.field2036.field2072 == 1) {
                try {
                    ((Thread) this.field2036.field2068).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2036 = null;
    }

    public void finalize() {
        this.method2584();
    }

    @ObfuscatedName("dk.e(I)I")
    public int method2568() throws IOException {
        return this.field2039 ? 0 : this.field2048.read();
    }

    @ObfuscatedName("dk.u(I)I")
    public int method2585() throws IOException {
        return this.field2039 ? 0 : this.field2048.available();
    }

    @ObfuscatedName("dk.j([BIIB)V")
    public void method2569(byte[] arg0, int arg1, int arg2) throws IOException {
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

    @ObfuscatedName("dk.c([BIII)V")
    public void method2571(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2039) {
            return;
        }
        if (this.field2040) {
            this.field2040 = false;
            throw new IOException();
        }
        if (this.field2042 == null) {
            this.field2042 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2042[this.field2037] = arg0[arg1 + var5];
                this.field2037 = (this.field2037 + 1) % 5000;
                if ((this.field2043 + 4900) % 5000 == this.field2037) {
                    throw new IOException();
                }
            }
            if (this.field2036 == null) {
                this.field2036 = this.field2049.method2481(this, 3);
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
                        if (this.field2043 == this.field2037) {
                            if (this.field2039) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2043;
                        if (this.field2037 >= this.field2043) {
                            var4 = this.field2037 - this.field2043;
                        } else {
                            var4 = 5000 - this.field2043;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2046.write(this.field2042, var3, var4);
                    } catch (IOException var12) {
                        this.field2040 = true;
                    }
                    this.field2043 = (this.field2043 + var4) % 5000;
                    try {
                        if (this.field2043 == this.field2037) {
                            this.field2046.flush();
                        }
                    } catch (IOException var11) {
                        this.field2040 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2048 != null) {
                        this.field2048.close();
                    }
                    if (this.field2046 != null) {
                        this.field2046.close();
                    }
                    if (this.field2038 != null) {
                        this.field2038.close();
                    }
                } catch (IOException var10) {
                }
                this.field2042 = null;
                break;
            }
        } catch (Exception var15) {
            class135.method2083((String) null, var15);
        }
    }
}
