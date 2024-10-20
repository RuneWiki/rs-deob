package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("ea")
public final class class132 implements Runnable {

    @ObfuscatedName("ea.c")
    public InputStream field2027;

    @ObfuscatedName("ea.j")
    public OutputStream field2023;

    @ObfuscatedName("ea.y")
    public Socket field2024;

    @ObfuscatedName("ea.r")
    public boolean field2025 = false;

    @ObfuscatedName("ea.f")
    public class125 field2026;

    @ObfuscatedName("ea.l")
    public class135 field2022;

    @ObfuscatedName("ea.b")
    public byte[] field2028;

    @ObfuscatedName("ea.k")
    public int field2029 = 0;

    @ObfuscatedName("ea.g")
    public int field2030 = 0;

    @ObfuscatedName("ea.v")
    public boolean field2031 = false;

    public class132(Socket arg0, class125 arg1) throws IOException {
        this.field2026 = arg1;
        this.field2024 = arg0;
        this.field2024.setSoTimeout(30000);
        this.field2024.setTcpNoDelay(true);
        this.field2027 = this.field2024.getInputStream();
        this.field2023 = this.field2024.getOutputStream();
    }

    @ObfuscatedName("ea.r(I)V")
    public void method2601() {
        if (this.field2025) {
            return;
        }
        synchronized (this) {
            this.field2025 = true;
            this.notifyAll();
        }
        if (this.field2022 != null) {
            while (this.field2022.field2059 == 0) {
                class116.method2713(1L);
            }
            if (this.field2022.field2059 == 1) {
                try {
                    ((Thread) this.field2022.field2062).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2022 = null;
    }

    public void finalize() {
        this.method2601();
    }

    @ObfuscatedName("ea.f(I)I")
    public int method2603() throws IOException {
        return this.field2025 ? 0 : this.field2027.read();
    }

    @ObfuscatedName("ea.l(I)I")
    public int method2604() throws IOException {
        return this.field2025 ? 0 : this.field2027.available();
    }

    @ObfuscatedName("ea.b([BIII)V")
    public void method2605(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2025) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field2027.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("ea.k([BIIB)V")
    public void method2618(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2025) {
            return;
        }
        if (this.field2031) {
            this.field2031 = false;
            throw new IOException();
        }
        if (this.field2028 == null) {
            this.field2028 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2028[this.field2030] = arg0[arg1 + var5];
                this.field2030 = (this.field2030 + 1) % 5000;
                if ((this.field2029 + 4900) % 5000 == this.field2030) {
                    throw new IOException();
                }
            }
            if (this.field2022 == null) {
                this.field2022 = this.field2026.method2500(this, 3);
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
                        if (this.field2030 == this.field2029) {
                            if (this.field2025) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2029;
                        if (this.field2030 >= this.field2029) {
                            var4 = this.field2030 - this.field2029;
                        } else {
                            var4 = 5000 - this.field2029;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2023.write(this.field2028, var3, var4);
                    } catch (IOException var12) {
                        this.field2031 = true;
                    }
                    this.field2029 = (this.field2029 + var4) % 5000;
                    try {
                        if (this.field2030 == this.field2029) {
                            this.field2023.flush();
                        }
                    } catch (IOException var11) {
                        this.field2031 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2027 != null) {
                        this.field2027.close();
                    }
                    if (this.field2023 != null) {
                        this.field2023.close();
                    }
                    if (this.field2024 != null) {
                        this.field2024.close();
                    }
                } catch (IOException var10) {
                }
                this.field2028 = null;
                break;
            }
        } catch (Exception var15) {
            class137.method880((String) null, var15);
        }
    }
}
