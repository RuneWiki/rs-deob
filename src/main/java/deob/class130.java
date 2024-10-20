package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("di")
public final class class130 implements Runnable {

    @ObfuscatedName("di.t")
    public InputStream field2006;

    @ObfuscatedName("di.o")
    public Socket field2005;

    @ObfuscatedName("di.i")
    public OutputStream field2004;

    @ObfuscatedName("di.p")
    public boolean field2014 = false;

    @ObfuscatedName("di.c")
    public class123 field2007;

    @ObfuscatedName("di.y")
    public class133 field2003;

    @ObfuscatedName("di.g")
    public byte[] field2009;

    @ObfuscatedName("di.l")
    public int field2010 = 0;

    @ObfuscatedName("di.h")
    public int field2011 = 0;

    @ObfuscatedName("di.n")
    public boolean field2012 = false;

    public class130(Socket arg0, class123 arg1) throws IOException {
        this.field2007 = arg1;
        this.field2005 = arg0;
        this.field2005.setSoTimeout(30000);
        this.field2005.setTcpNoDelay(true);
        this.field2006 = this.field2005.getInputStream();
        this.field2004 = this.field2005.getOutputStream();
    }

    @ObfuscatedName("di.i(B)V")
    public void method2554() {
        if (this.field2014) {
            return;
        }
        synchronized (this) {
            this.field2014 = true;
            this.notifyAll();
        }
        if (this.field2003 != null) {
            while (this.field2003.field2036 == 0) {
                class114.method1854(1L);
            }
            if (this.field2003.field2036 == 1) {
                try {
                    ((Thread) this.field2003.field2039).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2003 = null;
    }

    public void finalize() {
        this.method2554();
    }

    @ObfuscatedName("di.p(I)I")
    public int method2561() throws IOException {
        return this.field2014 ? 0 : this.field2006.read();
    }

    @ObfuscatedName("di.c(S)I")
    public int method2555() throws IOException {
        return this.field2014 ? 0 : this.field2006.available();
    }

    @ObfuscatedName("di.y([BIII)V")
    public void method2559(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2014) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field2006.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("di.g([BIII)V")
    public void method2557(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2014) {
            return;
        }
        if (this.field2012) {
            this.field2012 = false;
            throw new IOException();
        }
        if (this.field2009 == null) {
            this.field2009 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2009[this.field2011] = arg0[arg1 + var5];
                this.field2011 = (this.field2011 + 1) % 5000;
                if ((this.field2010 + 4900) % 5000 == this.field2011) {
                    throw new IOException();
                }
            }
            if (this.field2003 == null) {
                this.field2003 = this.field2007.method2458(this, 3);
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
                        if (this.field2011 == this.field2010) {
                            if (this.field2014) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2010;
                        if (this.field2011 >= this.field2010) {
                            var4 = this.field2011 - this.field2010;
                        } else {
                            var4 = 5000 - this.field2010;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2004.write(this.field2009, var3, var4);
                    } catch (IOException var12) {
                        this.field2012 = true;
                    }
                    this.field2010 = (this.field2010 + var4) % 5000;
                    try {
                        if (this.field2011 == this.field2010) {
                            this.field2004.flush();
                        }
                    } catch (IOException var11) {
                        this.field2012 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2006 != null) {
                        this.field2006.close();
                    }
                    if (this.field2004 != null) {
                        this.field2004.close();
                    }
                    if (this.field2005 != null) {
                        this.field2005.close();
                    }
                } catch (IOException var10) {
                }
                this.field2009 = null;
                break;
            }
        } catch (Exception var15) {
            class135.method1362((String) null, var15);
        }
    }
}
