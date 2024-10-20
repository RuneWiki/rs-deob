package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("dc")
public final class class127 implements Runnable {

    @ObfuscatedName("dc.m")
    public InputStream field2001;

    @ObfuscatedName("dc.k")
    public OutputStream field2000;

    @ObfuscatedName("dc.y")
    public Socket field1999;

    @ObfuscatedName("dc.g")
    public boolean field2009 = false;

    @ObfuscatedName("dc.r")
    public class120 field2003;

    @ObfuscatedName("dc.i")
    public class130 field2004;

    @ObfuscatedName("dc.f")
    public byte[] field2005;

    @ObfuscatedName("dc.a")
    public int field2007 = 0;

    @ObfuscatedName("dc.w")
    public int field2002 = 0;

    @ObfuscatedName("dc.u")
    public boolean field2008 = false;

    public class127(Socket arg0, class120 arg1) throws IOException {
        this.field2003 = arg1;
        this.field1999 = arg0;
        this.field1999.setSoTimeout(30000);
        this.field1999.setTcpNoDelay(true);
        this.field2001 = this.field1999.getInputStream();
        this.field2000 = this.field1999.getOutputStream();
    }

    @ObfuscatedName("dc.y(B)V")
    public void method2560() {
        if (this.field2009) {
            return;
        }
        synchronized (this) {
            this.field2009 = true;
            this.notifyAll();
        }
        if (this.field2004 != null) {
            while (this.field2004.field2037 == 0) {
                class111.method59(1L);
            }
            if (this.field2004.field2037 == 1) {
                try {
                    ((Thread) this.field2004.field2041).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2004 = null;
    }

    public void finalize() {
        this.method2560();
    }

    @ObfuscatedName("dc.g(I)I")
    public int method2571() throws IOException {
        return this.field2009 ? 0 : this.field2001.read();
    }

    @ObfuscatedName("dc.r(I)I")
    public int method2562() throws IOException {
        return this.field2009 ? 0 : this.field2001.available();
    }

    @ObfuscatedName("dc.i([BIII)V")
    public void method2563(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2009) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field2001.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("dc.f([BIIB)V")
    public void method2564(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2009) {
            return;
        }
        if (this.field2008) {
            this.field2008 = false;
            throw new IOException();
        }
        if (this.field2005 == null) {
            this.field2005 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2005[this.field2002] = arg0[arg1 + var5];
                this.field2002 = (this.field2002 + 1) % 5000;
                if ((this.field2007 + 4900) % 5000 == this.field2002) {
                    throw new IOException();
                }
            }
            if (this.field2004 == null) {
                this.field2004 = this.field2003.method2468(this, 3);
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
                        if (this.field2007 == this.field2002) {
                            if (this.field2009) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2007;
                        if (this.field2002 >= this.field2007) {
                            var4 = this.field2002 - this.field2007;
                        } else {
                            var4 = 5000 - this.field2007;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2000.write(this.field2005, var3, var4);
                    } catch (IOException var12) {
                        this.field2008 = true;
                    }
                    this.field2007 = (this.field2007 + var4) % 5000;
                    try {
                        if (this.field2007 == this.field2002) {
                            this.field2000.flush();
                        }
                    } catch (IOException var11) {
                        this.field2008 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2001 != null) {
                        this.field2001.close();
                    }
                    if (this.field2000 != null) {
                        this.field2000.close();
                    }
                    if (this.field1999 != null) {
                        this.field1999.close();
                    }
                } catch (IOException var10) {
                }
                this.field2005 = null;
                break;
            }
        } catch (Exception var15) {
            class132.method130((String) null, var15);
        }
    }
}
