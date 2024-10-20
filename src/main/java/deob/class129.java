package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("bb")
public final class class129 implements Runnable {

    @ObfuscatedName("bb.f")
    public int field2057 = 0;

    @ObfuscatedName("bb.d")
    public class152 field2063;

    @ObfuscatedName("bb.b")
    public InputStream field2058;

    @ObfuscatedName("bb.l")
    public byte[] field2054;

    @ObfuscatedName("bb.j")
    public boolean field2060 = false;

    @ObfuscatedName("bb.k")
    public Socket field2052;

    @ObfuscatedName("bb.h")
    public OutputStream field2051;

    @ObfuscatedName("bb.w")
    public boolean field2053 = false;

    @ObfuscatedName("bb.t")
    public class116 field2055;

    @ObfuscatedName("bb.s")
    public int field2059 = 0;

    @ObfuscatedName("bb.k(I)V")
    public void method2290() {
        if (this.field2053) {
            return;
        }
        synchronized (this) {
            this.field2053 = true;
            this.notifyAll();
        }
        if (this.field2063 != null) {
            while (this.field2063.field2270 == 0) {
                class134.method600(1L);
            }
            if (this.field2063.field2270 == 1) {
                try {
                    ((Thread) this.field2063.field2274).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2063 = null;
    }

    public void finalize() {
        this.method2290();
    }

    public class129(Socket arg0, class116 arg1) throws IOException {
        this.field2055 = arg1;
        this.field2052 = arg0;
        this.field2052.setSoTimeout(30000);
        this.field2052.setTcpNoDelay(true);
        this.field2058 = this.field2052.getInputStream();
        this.field2051 = this.field2052.getOutputStream();
    }

    @ObfuscatedName("bb.t(S)I")
    public int method2291() throws IOException {
        return this.field2053 ? 0 : this.field2058.available();
    }

    @ObfuscatedName("bb.l([BIIB)V")
    public void method2293(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2053) {
            return;
        }
        if (this.field2060) {
            this.field2060 = false;
            throw new IOException();
        }
        if (this.field2054 == null) {
            this.field2054 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2054[this.field2059] = arg0[arg1 + var5];
                this.field2059 = (this.field2059 + 1) % 5000;
                if ((this.field2057 + 4900) % 5000 == this.field2059) {
                    throw new IOException();
                }
            }
            if (this.field2063 == null) {
                this.field2063 = this.field2055.method2077(this, 3);
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
                        if (this.field2059 == this.field2057) {
                            if (this.field2053) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2057;
                        if (this.field2059 >= this.field2057) {
                            var4 = this.field2059 - this.field2057;
                        } else {
                            var4 = 5000 - this.field2057;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2051.write(this.field2054, var3, var4);
                    } catch (IOException var12) {
                        this.field2060 = true;
                    }
                    this.field2057 = (this.field2057 + var4) % 5000;
                    try {
                        if (this.field2059 == this.field2057) {
                            this.field2051.flush();
                        }
                    } catch (IOException var11) {
                        this.field2060 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2058 != null) {
                        this.field2058.close();
                    }
                    if (this.field2051 != null) {
                        this.field2051.close();
                    }
                    if (this.field2052 != null) {
                        this.field2052.close();
                    }
                } catch (IOException var10) {
                }
                this.field2054 = null;
                break;
            }
        } catch (Exception var15) {
            class136.method1127((String) null, var15);
        }
    }

    @ObfuscatedName("bb.d([BIIB)V")
    public void method2299(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2053) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field2058.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("bb.w(I)I")
    public int method2305() throws IOException {
        return this.field2053 ? 0 : this.field2058.read();
    }
}
