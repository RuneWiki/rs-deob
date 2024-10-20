package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("bj")
public final class class121 implements Runnable {

    @ObfuscatedName("bj.g")
    public boolean field1858 = false;

    @ObfuscatedName("bj.d")
    public int field1856 = 0;

    @ObfuscatedName("bj.b")
    public Socket field1851;

    @ObfuscatedName("bj.c")
    public OutputStream field1850;

    @ObfuscatedName("bj.m")
    public class130 field1853;

    @ObfuscatedName("bj.j")
    public int field1857 = 0;

    @ObfuscatedName("bj.i")
    public boolean field1849 = false;

    @ObfuscatedName("bj.v")
    public InputStream field1859;

    @ObfuscatedName("bj.z")
    public class157 field1854;

    @ObfuscatedName("bj.x")
    public byte[] field1855;

    public void finalize() {
        this.method2148();
    }

    @ObfuscatedName("bj.x(I)I")
    public int method2136() throws IOException {
        return this.field1849 ? 0 : this.field1859.available();
    }

    @ObfuscatedName("bj.z(I)I")
    public int method2137() throws IOException {
        return this.field1849 ? 0 : this.field1859.read();
    }

    @ObfuscatedName("bj.d([BIII)V")
    public void method2139(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1849) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field1859.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    public class121(Socket arg0, class130 arg1) throws IOException {
        this.field1853 = arg1;
        this.field1851 = arg0;
        this.field1851.setSoTimeout(30000);
        this.field1851.setTcpNoDelay(true);
        this.field1859 = this.field1851.getInputStream();
        this.field1850 = this.field1851.getOutputStream();
    }

    public void run() {
        try {
            while (true) {
                label84: {
                    int var3;
                    int var4;
                    synchronized (this) {
                        if (this.field1857 == this.field1856) {
                            if (this.field1849) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field1856;
                        if (this.field1857 >= this.field1856) {
                            var4 = this.field1857 - this.field1856;
                        } else {
                            var4 = 5000 - this.field1856;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field1850.write(this.field1855, var3, var4);
                    } catch (IOException var12) {
                        this.field1858 = true;
                    }
                    this.field1856 = (this.field1856 + var4) % 5000;
                    try {
                        if (this.field1857 == this.field1856) {
                            this.field1850.flush();
                        }
                    } catch (IOException var11) {
                        this.field1858 = true;
                    }
                    continue;
                }
                try {
                    if (this.field1859 != null) {
                        this.field1859.close();
                    }
                    if (this.field1850 != null) {
                        this.field1850.close();
                    }
                    if (this.field1851 != null) {
                        this.field1851.close();
                    }
                } catch (IOException var10) {
                }
                this.field1855 = null;
                break;
            }
        } catch (Exception var15) {
            class136.method1295((String) null, var15);
        }
    }

    @ObfuscatedName("bj.m(B)V")
    public void method2148() {
        if (this.field1849) {
            return;
        }
        synchronized (this) {
            this.field1849 = true;
            this.notifyAll();
        }
        if (this.field1854 != null) {
            while (this.field1854.field2364 == 0) {
                class134.method1468(1L);
            }
            if (this.field1854.field2364 == 1) {
                try {
                    ((Thread) this.field1854.field2360).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field1854 = null;
    }

    @ObfuscatedName("bj.j([BIII)V")
    public void method2153(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1849) {
            return;
        }
        if (this.field1858) {
            this.field1858 = false;
            throw new IOException();
        }
        if (this.field1855 == null) {
            this.field1855 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field1855[this.field1857] = arg0[arg1 + var5];
                this.field1857 = (this.field1857 + 1) % 5000;
                if ((this.field1856 + 4900) % 5000 == this.field1857) {
                    throw new IOException();
                }
            }
            if (this.field1854 == null) {
                this.field1854 = this.field1853.method2224(this, 3);
            }
            this.notifyAll();
        }
    }
}
