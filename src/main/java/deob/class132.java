package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("en")
public final class class132 implements Runnable {

    @ObfuscatedName("en.g")
    public InputStream field2032;

    @ObfuscatedName("en.j")
    public OutputStream field2021;

    @ObfuscatedName("en.z")
    public Socket field2029;

    @ObfuscatedName("en.b")
    public boolean field2030 = false;

    @ObfuscatedName("en.k")
    public class125 field2024;

    @ObfuscatedName("en.c")
    public class135 field2025;

    @ObfuscatedName("en.w")
    public byte[] field2026;

    @ObfuscatedName("en.l")
    public int field2027 = 0;

    @ObfuscatedName("en.n")
    public int field2028 = 0;

    @ObfuscatedName("en.d")
    public boolean field2023 = false;

    public class132(Socket arg0, class125 arg1) throws IOException {
        this.field2024 = arg1;
        this.field2029 = arg0;
        this.field2029.setSoTimeout(30000);
        this.field2029.setTcpNoDelay(true);
        this.field2032 = this.field2029.getInputStream();
        this.field2021 = this.field2029.getOutputStream();
    }

    @ObfuscatedName("en.b(I)V")
    public void method2537() {
        if (this.field2030) {
            return;
        }
        synchronized (this) {
            this.field2030 = true;
            this.notifyAll();
        }
        if (this.field2025 != null) {
            while (this.field2025.field2055 == 0) {
                class116.method154(1L);
            }
            if (this.field2025.field2055 == 1) {
                try {
                    ((Thread) this.field2025.field2059).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2025 = null;
    }

    public void finalize() {
        this.method2537();
    }

    @ObfuscatedName("en.k(I)I")
    public int method2533() throws IOException {
        return this.field2030 ? 0 : this.field2032.read();
    }

    @ObfuscatedName("en.c(I)I")
    public int method2530() throws IOException {
        return this.field2030 ? 0 : this.field2032.available();
    }

    @ObfuscatedName("en.w([BIIB)V")
    public void method2531(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2030) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field2032.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("en.l([BIII)V")
    public void method2532(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2030) {
            return;
        }
        if (this.field2023) {
            this.field2023 = false;
            throw new IOException();
        }
        if (this.field2026 == null) {
            this.field2026 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2026[this.field2028] = arg0[arg1 + var5];
                this.field2028 = (this.field2028 + 1) % 5000;
                if ((this.field2027 + 4900) % 5000 == this.field2028) {
                    throw new IOException();
                }
            }
            if (this.field2025 == null) {
                this.field2025 = this.field2024.method2442(this, 3);
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
                        if (this.field2028 == this.field2027) {
                            if (this.field2030) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2027;
                        if (this.field2028 >= this.field2027) {
                            var4 = this.field2028 - this.field2027;
                        } else {
                            var4 = 5000 - this.field2027;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2021.write(this.field2026, var3, var4);
                    } catch (IOException var12) {
                        this.field2023 = true;
                    }
                    this.field2027 = (this.field2027 + var4) % 5000;
                    try {
                        if (this.field2028 == this.field2027) {
                            this.field2021.flush();
                        }
                    } catch (IOException var11) {
                        this.field2023 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2032 != null) {
                        this.field2032.close();
                    }
                    if (this.field2021 != null) {
                        this.field2021.close();
                    }
                    if (this.field2029 != null) {
                        this.field2029.close();
                    }
                } catch (IOException var10) {
                }
                this.field2026 = null;
                break;
            }
        } catch (Exception var15) {
            class137.method2362((String) null, var15);
        }
    }
}
