package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("dy")
public final class class130 implements Runnable {

    @ObfuscatedName("dy.k")
    public InputStream field2040;

    @ObfuscatedName("dy.r")
    public OutputStream field2036;

    @ObfuscatedName("dy.y")
    public Socket field2035;

    @ObfuscatedName("dy.w")
    public boolean field2034 = false;

    @ObfuscatedName("dy.m")
    public class123 field2037;

    @ObfuscatedName("dy.j")
    public class133 field2043;

    @ObfuscatedName("dy.g")
    public byte[] field2039;

    @ObfuscatedName("dy.p")
    public int field2038 = 0;

    @ObfuscatedName("dy.o")
    public int field2041 = 0;

    @ObfuscatedName("dy.b")
    public boolean field2042 = false;

    public class130(Socket arg0, class123 arg1) throws IOException {
        this.field2037 = arg1;
        this.field2035 = arg0;
        this.field2035.setSoTimeout(30000);
        this.field2035.setTcpNoDelay(true);
        this.field2040 = this.field2035.getInputStream();
        this.field2036 = this.field2035.getOutputStream();
    }

    @ObfuscatedName("dy.m(I)V")
    public void method2552() {
        if (this.field2034) {
            return;
        }
        synchronized (this) {
            this.field2034 = true;
            this.notifyAll();
        }
        if (this.field2043 != null) {
            while (this.field2043.field2066 == 0) {
                class114.method2808(1L);
            }
            if (this.field2043.field2066 == 1) {
                try {
                    ((Thread) this.field2043.field2070).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2043 = null;
    }

    public void finalize() {
        this.method2552();
    }

    @ObfuscatedName("dy.j(I)I")
    public int method2554() throws IOException {
        return this.field2034 ? 0 : this.field2040.read();
    }

    @ObfuscatedName("dy.g(I)I")
    public int method2555() throws IOException {
        return this.field2034 ? 0 : this.field2040.available();
    }

    @ObfuscatedName("dy.p([BIII)V")
    public void method2567(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2034) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field2040.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("dy.o([BIIB)V")
    public void method2556(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2034) {
            return;
        }
        if (this.field2042) {
            this.field2042 = false;
            throw new IOException();
        }
        if (this.field2039 == null) {
            this.field2039 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2039[this.field2041] = arg0[arg1 + var5];
                this.field2041 = (this.field2041 + 1) % 5000;
                if ((this.field2038 + 4900) % 5000 == this.field2041) {
                    throw new IOException();
                }
            }
            if (this.field2043 == null) {
                this.field2043 = this.field2037.method2463(this, 3);
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
                        if (this.field2041 == this.field2038) {
                            if (this.field2034) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2038;
                        if (this.field2041 >= this.field2038) {
                            var4 = this.field2041 - this.field2038;
                        } else {
                            var4 = 5000 - this.field2038;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2036.write(this.field2039, var3, var4);
                    } catch (IOException var12) {
                        this.field2042 = true;
                    }
                    this.field2038 = (this.field2038 + var4) % 5000;
                    try {
                        if (this.field2041 == this.field2038) {
                            this.field2036.flush();
                        }
                    } catch (IOException var11) {
                        this.field2042 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2040 != null) {
                        this.field2040.close();
                    }
                    if (this.field2036 != null) {
                        this.field2036.close();
                    }
                    if (this.field2035 != null) {
                        this.field2035.close();
                    }
                } catch (IOException var10) {
                }
                this.field2039 = null;
                break;
            }
        } catch (Exception var15) {
            class135.method1963((String) null, var15);
        }
    }
}
