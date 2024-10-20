package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("dk")
public final class class130 implements Runnable {

    @ObfuscatedName("dk.g")
    public InputStream field2058;

    @ObfuscatedName("dk.v")
    public OutputStream field2046;

    @ObfuscatedName("dk.z")
    public Socket field2047;

    @ObfuscatedName("dk.h")
    public boolean field2055 = false;

    @ObfuscatedName("dk.k")
    public class123 field2049;

    @ObfuscatedName("dk.l")
    public class133 field2050;

    @ObfuscatedName("dk.e")
    public byte[] field2051;

    @ObfuscatedName("dk.j")
    public int field2053 = 0;

    @ObfuscatedName("dk.n")
    public int field2048 = 0;

    @ObfuscatedName("dk.f")
    public boolean field2052 = false;

    public class130(Socket arg0, class123 arg1) throws IOException {
        this.field2049 = arg1;
        this.field2047 = arg0;
        this.field2047.setSoTimeout(30000);
        this.field2047.setTcpNoDelay(true);
        this.field2058 = this.field2047.getInputStream();
        this.field2046 = this.field2047.getOutputStream();
    }

    @ObfuscatedName("dk.z(I)V")
    public void method2575() {
        if (this.field2055) {
            return;
        }
        synchronized (this) {
            this.field2055 = true;
            this.notifyAll();
        }
        if (this.field2050 != null) {
            while (this.field2050.field2081 == 0) {
                class114.method2962(1L);
            }
            if (this.field2050.field2081 == 1) {
                try {
                    ((Thread) this.field2050.field2083).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2050 = null;
    }

    public void finalize() {
        this.method2575();
    }

    @ObfuscatedName("dk.h(I)I")
    public int method2584() throws IOException {
        return this.field2055 ? 0 : this.field2058.read();
    }

    @ObfuscatedName("dk.k(I)I")
    public int method2568() throws IOException {
        return this.field2055 ? 0 : this.field2058.available();
    }

    @ObfuscatedName("dk.l([BIIB)V")
    public void method2569(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2055) {
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

    @ObfuscatedName("dk.e([BIII)V")
    public void method2570(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2055) {
            return;
        }
        if (this.field2052) {
            this.field2052 = false;
            throw new IOException();
        }
        if (this.field2051 == null) {
            this.field2051 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2051[this.field2048] = arg0[arg1 + var5];
                this.field2048 = (this.field2048 + 1) % 5000;
                if ((this.field2053 + 4900) % 5000 == this.field2048) {
                    throw new IOException();
                }
            }
            if (this.field2050 == null) {
                this.field2050 = this.field2049.method2472(this, 3);
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
                        if (this.field2053 == this.field2048) {
                            if (this.field2055) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2053;
                        if (this.field2048 >= this.field2053) {
                            var4 = this.field2048 - this.field2053;
                        } else {
                            var4 = 5000 - this.field2053;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2046.write(this.field2051, var3, var4);
                    } catch (IOException var12) {
                        this.field2052 = true;
                    }
                    this.field2053 = (this.field2053 + var4) % 5000;
                    try {
                        if (this.field2053 == this.field2048) {
                            this.field2046.flush();
                        }
                    } catch (IOException var11) {
                        this.field2052 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2058 != null) {
                        this.field2058.close();
                    }
                    if (this.field2046 != null) {
                        this.field2046.close();
                    }
                    if (this.field2047 != null) {
                        this.field2047.close();
                    }
                } catch (IOException var10) {
                }
                this.field2051 = null;
                break;
            }
        } catch (Exception var15) {
            class135.method495((String) null, var15);
        }
    }
}
