package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("du")
public class class120 implements Runnable {

    @ObfuscatedName("du.u")
    public class44 field1920;

    @ObfuscatedName("du.t")
    public class130 field1922 = null;

    @ObfuscatedName("du.e")
    public class130 field1919 = null;

    @ObfuscatedName("du.a")
    public Thread field1928;

    @ObfuscatedName("du.l")
    public boolean field1924 = false;

    @ObfuscatedName("du.v")
    public EventQueue field1921;

    public class120() {
        Statics.field1925 = "Unknown";
        Statics.field1918 = "1.1";
        try {
            Statics.field1925 = System.getProperty("java.vendor");
            Statics.field1918 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field1921 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field1924 = false;
        this.field1928 = new Thread(this);
        this.field1928.setPriority(10);
        this.field1928.setDaemon(true);
        this.field1928.start();
    }

    @ObfuscatedName("du.u(B)V")
    public final void method2503() {
        synchronized (this) {
            this.field1924 = true;
            this.notifyAll();
        }
        try {
            this.field1928.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class130 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1924) {
                        return;
                    }
                    if (this.field1922 != null) {
                        var2 = this.field1922;
                        this.field1922 = this.field1922.field2053;
                        if (this.field1922 == null) {
                            this.field1919 = null;
                        }
                        break;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var12) {
                    }
                }
            }
            try {
                int var5 = var2.field2056;
                if (var5 == 1) {
                    var2.field2059 = new Socket(InetAddress.getByName((String) var2.field2058), var2.field2051);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2058);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2051);
                    var2.field2059 = var6;
                } else if (var5 == 4) {
                    var2.field2059 = new DataInputStream(((URL) var2.field2058).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field2051 >> 24 & 0xFF) + "." + (var2.field2051 >> 16 & 0xFF) + "." + (var2.field2051 >> 8 & 0xFF) + "." + (var2.field2051 & 0xFF);
                    var2.field2059 = InetAddress.getByName(var7).getHostName();
                }
                var2.field2055 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field2055 = 2;
            }
        }
    }

    @ObfuscatedName("du.t(IIILjava/lang/Object;I)Ldf;")
    public final class130 method2504(int arg0, int arg1, int arg2, Object arg3) {
        class130 var5 = new class130();
        var5.field2056 = arg0;
        var5.field2051 = arg1;
        var5.field2058 = arg3;
        synchronized (this) {
            if (this.field1919 == null) {
                this.field1919 = this.field1922 = var5;
            } else {
                this.field1919.field2053 = var5;
                this.field1919 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("du.e(Ljava/lang/String;II)Ldf;")
    public final class130 method2505(String arg0, int arg1) {
        return this.method2504(1, arg1, 0, arg0);
    }

    @ObfuscatedName("du.a(Ljava/lang/Runnable;IB)Ldf;")
    public final class130 method2523(Runnable arg0, int arg1) {
        return this.method2504(2, arg1, 0, arg0);
    }

    @ObfuscatedName("du.l(II)Ldf;")
    public final class130 method2507(int arg0) {
        return this.method2504(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("du.v(Ljava/net/URL;B)Ldf;")
    public final class130 method2528(URL arg0) {
        return this.method2504(4, 0, 0, arg0);
    }

    @ObfuscatedName("du.j(B)Lab;")
    public final class44 method2508() {
        return this.field1920;
    }
}
