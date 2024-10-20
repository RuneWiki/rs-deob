package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("de")
public final class class130 implements Runnable {

    @ObfuscatedName("de.e")
    public InputStream field2038;

    @ObfuscatedName("de.v")
    public OutputStream field2031;

    @ObfuscatedName("de.i")
    public Socket field2030;

    @ObfuscatedName("de.g")
    public boolean field2032 = false;

    @ObfuscatedName("de.x")
    public class123 field2034;

    @ObfuscatedName("de.b")
    public class133 field2033;

    @ObfuscatedName("de.q")
    public byte[] field2028;

    @ObfuscatedName("de.l")
    public int field2035 = 0;

    @ObfuscatedName("de.m")
    public int field2036 = 0;

    @ObfuscatedName("de.u")
    public boolean field2037 = false;

    public class130(Socket arg0, class123 arg1) throws IOException {
        this.field2034 = arg1;
        this.field2030 = arg0;
        this.field2030.setSoTimeout(30000);
        this.field2030.setTcpNoDelay(true);
        this.field2038 = this.field2030.getInputStream();
        this.field2031 = this.field2030.getOutputStream();
    }

    @ObfuscatedName("de.g(I)V")
    public void method2571() {
        if (this.field2032) {
            return;
        }
        synchronized (this) {
            this.field2032 = true;
            this.notifyAll();
        }
        if (this.field2033 != null) {
            while (this.field2033.field2063 == 0) {
                class114.method2357(1L);
            }
            if (this.field2033.field2063 == 1) {
                try {
                    ((Thread) this.field2033.field2060).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2033 = null;
    }

    public void finalize() {
        this.method2571();
    }

    @ObfuscatedName("de.x(I)I")
    public int method2553() throws IOException {
        return this.field2032 ? 0 : this.field2038.read();
    }

    @ObfuscatedName("de.b(I)I")
    public int method2554() throws IOException {
        return this.field2032 ? 0 : this.field2038.available();
    }

    @ObfuscatedName("de.q([BIII)V")
    public void method2555(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2032) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field2038.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("de.l([BIIB)V")
    public void method2556(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2032) {
            return;
        }
        if (this.field2037) {
            this.field2037 = false;
            throw new IOException();
        }
        if (this.field2028 == null) {
            this.field2028 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2028[this.field2036] = arg0[arg1 + var5];
                this.field2036 = (this.field2036 + 1) % 5000;
                if ((this.field2035 + 4900) % 5000 == this.field2036) {
                    throw new IOException();
                }
            }
            if (this.field2033 == null) {
                this.field2033 = this.field2034.method2463(this, 3);
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
                        if (this.field2036 == this.field2035) {
                            if (this.field2032) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2035;
                        if (this.field2036 >= this.field2035) {
                            var4 = this.field2036 - this.field2035;
                        } else {
                            var4 = 5000 - this.field2035;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2031.write(this.field2028, var3, var4);
                    } catch (IOException var12) {
                        this.field2037 = true;
                    }
                    this.field2035 = (this.field2035 + var4) % 5000;
                    try {
                        if (this.field2036 == this.field2035) {
                            this.field2031.flush();
                        }
                    } catch (IOException var11) {
                        this.field2037 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2038 != null) {
                        this.field2038.close();
                    }
                    if (this.field2031 != null) {
                        this.field2031.close();
                    }
                    if (this.field2030 != null) {
                        this.field2030.close();
                    }
                } catch (IOException var10) {
                }
                this.field2028 = null;
                break;
            }
        } catch (Exception var15) {
            class135.method457((String) null, var15);
        }
    }
}
