package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("dq")
public final class class130 implements Runnable {

    @ObfuscatedName("dq.e")
    public InputStream field2037;

    @ObfuscatedName("dq.o")
    public Socket field2033;

    @ObfuscatedName("dq.y")
    public OutputStream field2032;

    @ObfuscatedName("dq.b")
    public boolean field2041 = false;

    @ObfuscatedName("dq.w")
    public class123 field2035;

    @ObfuscatedName("dq.r")
    public class133 field2036;

    @ObfuscatedName("dq.l")
    public byte[] field2031;

    @ObfuscatedName("dq.s")
    public int field2034 = 0;

    @ObfuscatedName("dq.f")
    public int field2039 = 0;

    @ObfuscatedName("dq.x")
    public boolean field2040 = false;

    public class130(Socket arg0, class123 arg1) throws IOException {
        this.field2035 = arg1;
        this.field2033 = arg0;
        this.field2033.setSoTimeout(30000);
        this.field2033.setTcpNoDelay(true);
        this.field2037 = this.field2033.getInputStream();
        this.field2032 = this.field2033.getOutputStream();
    }

    @ObfuscatedName("dq.o(I)V")
    public void method2504() {
        if (this.field2041) {
            return;
        }
        synchronized (this) {
            this.field2041 = true;
            this.notifyAll();
        }
        if (this.field2036 != null) {
            while (this.field2036.field2064 == 0) {
                class114.method134(1L);
            }
            if (this.field2036.field2064 == 1) {
                try {
                    ((Thread) this.field2036.field2067).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2036 = null;
    }

    public void finalize() {
        this.method2504();
    }

    @ObfuscatedName("dq.y(I)I")
    public int method2522() throws IOException {
        return this.field2041 ? 0 : this.field2037.read();
    }

    @ObfuscatedName("dq.b(S)I")
    public int method2507() throws IOException {
        return this.field2041 ? 0 : this.field2037.available();
    }

    @ObfuscatedName("dq.w([BIIB)V")
    public void method2508(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2041) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field2037.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("dq.r([BIIB)V")
    public void method2509(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2041) {
            return;
        }
        if (this.field2040) {
            this.field2040 = false;
            throw new IOException();
        }
        if (this.field2031 == null) {
            this.field2031 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2031[this.field2039] = arg0[arg1 + var5];
                this.field2039 = (this.field2039 + 1) % 5000;
                if ((this.field2034 + 4900) % 5000 == this.field2039) {
                    throw new IOException();
                }
            }
            if (this.field2036 == null) {
                this.field2036 = this.field2035.method2414(this, 3);
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
                        if (this.field2039 == this.field2034) {
                            if (this.field2041) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2034;
                        if (this.field2039 >= this.field2034) {
                            var4 = this.field2039 - this.field2034;
                        } else {
                            var4 = 5000 - this.field2034;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2032.write(this.field2031, var3, var4);
                    } catch (IOException var12) {
                        this.field2040 = true;
                    }
                    this.field2034 = (this.field2034 + var4) % 5000;
                    try {
                        if (this.field2039 == this.field2034) {
                            this.field2032.flush();
                        }
                    } catch (IOException var11) {
                        this.field2040 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2037 != null) {
                        this.field2037.close();
                    }
                    if (this.field2032 != null) {
                        this.field2032.close();
                    }
                    if (this.field2033 != null) {
                        this.field2033.close();
                    }
                } catch (IOException var10) {
                }
                this.field2031 = null;
                break;
            }
        } catch (Exception var15) {
            class135.method1996((String) null, var15);
        }
    }
}
