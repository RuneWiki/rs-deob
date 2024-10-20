package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("dv")
public class class120 implements Runnable {

    @ObfuscatedName("dv.y")
    public class44 field1903;

    @ObfuscatedName("dv.g")
    public class130 field1902 = null;

    @ObfuscatedName("dv.r")
    public class130 field1909 = null;

    @ObfuscatedName("dv.i")
    public Thread field1904;

    @ObfuscatedName("dv.f")
    public boolean field1905 = false;

    @ObfuscatedName("dv.a")
    public EventQueue field1906;

    public class120() {
        Statics.field1901 = "Unknown";
        Statics.field1900 = "1.1";
        try {
            Statics.field1901 = System.getProperty("java.vendor");
            Statics.field1900 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field1906 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field1905 = false;
        this.field1904 = new Thread(this);
        this.field1904.setPriority(10);
        this.field1904.setDaemon(true);
        this.field1904.start();
    }

    @ObfuscatedName("dv.y(I)V")
    public final void method2467() {
        synchronized (this) {
            this.field1905 = true;
            this.notifyAll();
        }
        try {
            this.field1904.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class130 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1905) {
                        return;
                    }
                    if (this.field1902 != null) {
                        var2 = this.field1902;
                        this.field1902 = this.field1902.field2036;
                        if (this.field1902 == null) {
                            this.field1909 = null;
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
                int var5 = var2.field2038;
                if (var5 == 1) {
                    var2.field2041 = new Socket(InetAddress.getByName((String) var2.field2040), var2.field2039);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2040);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2039);
                    var2.field2041 = var6;
                } else if (var5 == 4) {
                    var2.field2041 = new DataInputStream(((URL) var2.field2040).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field2039 >> 24 & 0xFF) + "." + (var2.field2039 >> 16 & 0xFF) + "." + (var2.field2039 >> 8 & 0xFF) + "." + (var2.field2039 & 0xFF);
                    var2.field2041 = InetAddress.getByName(var7).getHostName();
                }
                var2.field2037 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field2037 = 2;
            }
        }
    }

    @ObfuscatedName("dv.g(IIILjava/lang/Object;I)Ldm;")
    public final class130 method2469(int arg0, int arg1, int arg2, Object arg3) {
        class130 var5 = new class130();
        var5.field2038 = arg0;
        var5.field2039 = arg1;
        var5.field2040 = arg3;
        synchronized (this) {
            if (this.field1909 == null) {
                this.field1909 = this.field1902 = var5;
            } else {
                this.field1909.field2036 = var5;
                this.field1909 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("dv.r(Ljava/lang/String;IB)Ldm;")
    public final class130 method2470(String arg0, int arg1) {
        return this.method2469(1, arg1, 0, arg0);
    }

    @ObfuscatedName("dv.i(Ljava/lang/Runnable;II)Ldm;")
    public final class130 method2468(Runnable arg0, int arg1) {
        return this.method2469(2, arg1, 0, arg0);
    }

    @ObfuscatedName("dv.f(II)Ldm;")
    public final class130 method2471(int arg0) {
        return this.method2469(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("dv.a(Ljava/net/URL;B)Ldm;")
    public final class130 method2472(URL arg0) {
        return this.method2469(4, 0, 0, arg0);
    }

    @ObfuscatedName("dv.w(B)Lap;")
    public final class44 method2480() {
        return this.field1903;
    }
}
