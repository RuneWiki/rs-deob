package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("dd")
public final class class130 implements Runnable {

    @ObfuscatedName("dd.n")
    public InputStream field2019;

    @ObfuscatedName("dd.x")
    public OutputStream field2023;

    @ObfuscatedName("dd.k")
    public Socket field2017;

    @ObfuscatedName("dd.i")
    public boolean field2016 = false;

    @ObfuscatedName("dd.d")
    public class123 field2014;

    @ObfuscatedName("dd.q")
    public class133 field2018;

    @ObfuscatedName("dd.m")
    public byte[] field2015;

    @ObfuscatedName("dd.a")
    public int field2020 = 0;

    @ObfuscatedName("dd.w")
    public int field2021 = 0;

    @ObfuscatedName("dd.e")
    public boolean field2013 = false;

    public class130(Socket arg0, class123 arg1) throws IOException {
        this.field2014 = arg1;
        this.field2017 = arg0;
        this.field2017.setSoTimeout(30000);
        this.field2017.setTcpNoDelay(true);
        this.field2019 = this.field2017.getInputStream();
        this.field2023 = this.field2017.getOutputStream();
    }

    @ObfuscatedName("dd.i(I)V")
    public void method2548() {
        if (this.field2016) {
            return;
        }
        synchronized (this) {
            this.field2016 = true;
            this.notifyAll();
        }
        if (this.field2018 != null) {
            while (this.field2018.field2045 == 0) {
                class114.method25(1L);
            }
            if (this.field2018.field2045 == 1) {
                try {
                    ((Thread) this.field2018.field2049).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2018 = null;
    }

    public void finalize() {
        this.method2548();
    }

    @ObfuscatedName("dd.d(B)I")
    public int method2556() throws IOException {
        return this.field2016 ? 0 : this.field2019.read();
    }

    @ObfuscatedName("dd.q(I)I")
    public int method2550() throws IOException {
        return this.field2016 ? 0 : this.field2019.available();
    }

    @ObfuscatedName("dd.m([BIII)V")
    public void method2551(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2016) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field2019.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("dd.a([BIII)V")
    public void method2552(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2016) {
            return;
        }
        if (this.field2013) {
            this.field2013 = false;
            throw new IOException();
        }
        if (this.field2015 == null) {
            this.field2015 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2015[this.field2021] = arg0[arg1 + var5];
                this.field2021 = (this.field2021 + 1) % 5000;
                if ((this.field2020 + 4900) % 5000 == this.field2021) {
                    throw new IOException();
                }
            }
            if (this.field2018 == null) {
                this.field2018 = this.field2014.method2458(this, 3);
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
                        if (this.field2021 == this.field2020) {
                            if (this.field2016) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2020;
                        if (this.field2021 >= this.field2020) {
                            var4 = this.field2021 - this.field2020;
                        } else {
                            var4 = 5000 - this.field2020;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2023.write(this.field2015, var3, var4);
                    } catch (IOException var12) {
                        this.field2013 = true;
                    }
                    this.field2020 = (this.field2020 + var4) % 5000;
                    try {
                        if (this.field2021 == this.field2020) {
                            this.field2023.flush();
                        }
                    } catch (IOException var11) {
                        this.field2013 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2019 != null) {
                        this.field2019.close();
                    }
                    if (this.field2023 != null) {
                        this.field2023.close();
                    }
                    if (this.field2017 != null) {
                        this.field2017.close();
                    }
                } catch (IOException var10) {
                }
                this.field2015 = null;
                break;
            }
        } catch (Exception var15) {
            Statics.method3084((String) null, var15);
        }
    }
}
