package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("bt")
public class class116 implements Runnable {

    @ObfuscatedName("bt.f")
    public EventQueue field1921;

    @ObfuscatedName("bt.d")
    public Thread field1919;

    @ObfuscatedName("bt.l")
    public boolean field1917 = false;

    @ObfuscatedName("bt.k")
    public class172 field1916;

    @ObfuscatedName("bt.w")
    public class152 field1920 = null;

    @ObfuscatedName("bt.t")
    public class152 field1918 = null;

    public class116() {
        Statics.field1923 = "Unknown";
        Statics.field1924 = "1.1";
        try {
            Statics.field1923 = System.getProperty("java.vendor");
            Statics.field1924 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field1921 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field1917 = false;
        this.field1919 = new Thread(this);
        this.field1919.setPriority(10);
        this.field1919.setDaemon(true);
        this.field1919.start();
    }

    @ObfuscatedName("bt.t(Ljava/lang/String;II)Lci;")
    public final class152 method2070(String arg0, int arg1) {
        return this.method2084(1, arg1, 0, arg0);
    }

    @ObfuscatedName("bt.k(I)V")
    public final void method2071() {
        synchronized (this) {
            this.field1917 = true;
            this.notifyAll();
        }
        try {
            this.field1919.join();
        } catch (InterruptedException var4) {
        }
    }

    @ObfuscatedName("bt.l(II)Lci;")
    public final class152 method2072(int arg0) {
        return this.method2084(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("bt.f(Ljava/net/URL;B)Lci;")
    public final class152 method2073(URL arg0) {
        return this.method2084(4, 0, 0, arg0);
    }

    @ObfuscatedName("bt.s(I)Lal;")
    public final class172 method2074() {
        return this.field1916;
    }

    @ObfuscatedName("bt.d(Ljava/lang/Runnable;II)Lci;")
    public final class152 method2077(Runnable arg0, int arg1) {
        return this.method2084(2, arg1, 0, arg0);
    }

    @ObfuscatedName("bt.w(IIILjava/lang/Object;B)Lci;")
    public final class152 method2084(int arg0, int arg1, int arg2, Object arg3) {
        class152 var5 = new class152();
        var5.field2271 = arg0;
        var5.field2266 = arg1;
        var5.field2272 = arg3;
        synchronized (this) {
            if (this.field1918 == null) {
                this.field1918 = this.field1920 = var5;
            } else {
                this.field1918.field2268 = var5;
                this.field1918 = var5;
            }
            this.notify();
            return var5;
        }
    }

    public final void run() {
        while (true) {
            class152 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1917) {
                        return;
                    }
                    if (this.field1920 != null) {
                        var2 = this.field1920;
                        this.field1920 = this.field1920.field2268;
                        if (this.field1920 == null) {
                            this.field1918 = null;
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
                int var5 = var2.field2271;
                if (var5 == 1) {
                    var2.field2274 = new Socket(InetAddress.getByName((String) var2.field2272), var2.field2266);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2272);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2266);
                    var2.field2274 = var6;
                } else if (var5 == 4) {
                    var2.field2274 = new DataInputStream(((URL) var2.field2272).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field2266 >> 24 & 0xFF) + "." + (var2.field2266 >> 16 & 0xFF) + "." + (var2.field2266 >> 8 & 0xFF) + "." + (var2.field2266 & 0xFF);
                    var2.field2274 = InetAddress.getByName(var7).getHostName();
                }
                var2.field2270 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field2270 = 2;
            }
        }
    }
}
