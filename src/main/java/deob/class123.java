package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("de")
public class class123 implements Runnable {

    @ObfuscatedName("de.a")
    public class47 field1921;

    @ObfuscatedName("de.y")
    public class133 field1922 = null;

    @ObfuscatedName("de.i")
    public class133 field1919 = null;

    @ObfuscatedName("de.b")
    public Thread field1930;

    @ObfuscatedName("de.s")
    public boolean field1925 = false;

    @ObfuscatedName("de.q")
    public EventQueue field1926;

    public class123() {
        Statics.field1927 = "Unknown";
        Statics.field1924 = "1.1";
        try {
            Statics.field1927 = System.getProperty("java.vendor");
            Statics.field1924 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field1926 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field1925 = false;
        this.field1930 = new Thread(this);
        this.field1930.setPriority(10);
        this.field1930.setDaemon(true);
        this.field1930.start();
    }

    @ObfuscatedName("de.a(B)V")
    public final void method2480() {
        synchronized (this) {
            this.field1925 = true;
            this.notifyAll();
        }
        try {
            this.field1930.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class133 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1925) {
                        return;
                    }
                    if (this.field1922 != null) {
                        var2 = this.field1922;
                        this.field1922 = this.field1922.field2061;
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
                int var5 = var2.field2053;
                if (var5 == 1) {
                    var2.field2058 = new Socket(InetAddress.getByName((String) var2.field2055), var2.field2059);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2055);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2059);
                    var2.field2058 = var6;
                } else if (var5 == 4) {
                    var2.field2058 = new DataInputStream(((URL) var2.field2055).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field2059 >> 24 & 0xFF) + "." + (var2.field2059 >> 16 & 0xFF) + "." + (var2.field2059 >> 8 & 0xFF) + "." + (var2.field2059 & 0xFF);
                    var2.field2058 = InetAddress.getByName(var7).getHostName();
                }
                var2.field2057 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field2057 = 2;
            }
        }
    }

    @ObfuscatedName("de.y(IIILjava/lang/Object;I)Lec;")
    public final class133 method2501(int arg0, int arg1, int arg2, Object arg3) {
        class133 var5 = new class133();
        var5.field2053 = arg0;
        var5.field2059 = arg1;
        var5.field2055 = arg3;
        synchronized (this) {
            if (this.field1919 == null) {
                this.field1919 = this.field1922 = var5;
            } else {
                this.field1919.field2061 = var5;
                this.field1919 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("de.i(Ljava/lang/String;II)Lec;")
    public final class133 method2482(String arg0, int arg1) {
        return this.method2501(1, arg1, 0, arg0);
    }

    @ObfuscatedName("de.b(Ljava/lang/Runnable;II)Lec;")
    public final class133 method2484(Runnable arg0, int arg1) {
        return this.method2501(2, arg1, 0, arg0);
    }

    @ObfuscatedName("de.s(II)Lec;")
    public final class133 method2499(int arg0) {
        return this.method2501(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("de.q(Ljava/net/URL;I)Lec;")
    public final class133 method2483(URL arg0) {
        return this.method2501(4, 0, 0, arg0);
    }

    @ObfuscatedName("de.p(B)Lam;")
    public final class47 method2486() {
        return this.field1921;
    }
}
