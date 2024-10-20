package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("dy")
public class class128 implements Runnable {

    @ObfuscatedName("dy.a")
    public class49 field2000;

    @ObfuscatedName("dy.m")
    public class138 field1998 = null;

    @ObfuscatedName("dy.s")
    public class138 field2002 = null;

    @ObfuscatedName("dy.j")
    public Thread field2003;

    @ObfuscatedName("dy.f")
    public boolean field2004 = false;

    @ObfuscatedName("dy.b")
    public EventQueue field2005;

    public class128() {
        Statics.field2001 = "Unknown";
        Statics.field1999 = "1.1";
        try {
            Statics.field2001 = System.getProperty("java.vendor");
            Statics.field1999 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field2005 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field2004 = false;
        this.field2003 = new Thread(this);
        this.field2003.setPriority(10);
        this.field2003.setDaemon(true);
        this.field2003.start();
    }

    @ObfuscatedName("dy.a(B)V")
    public final void method2571() {
        synchronized (this) {
            this.field2004 = true;
            this.notifyAll();
        }
        try {
            this.field2003.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class138 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2004) {
                        return;
                    }
                    if (this.field1998 != null) {
                        var2 = this.field1998;
                        this.field1998 = this.field1998.field2121;
                        if (this.field1998 == null) {
                            this.field2002 = null;
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
                int var5 = var2.field2124;
                if (var5 == 1) {
                    var2.field2123 = new Socket(InetAddress.getByName((String) var2.field2126), var2.field2125);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2126);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2125);
                    var2.field2123 = var6;
                } else if (var5 == 4) {
                    var2.field2123 = new DataInputStream(((URL) var2.field2126).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field2125 >> 24 & 0xFF) + "." + (var2.field2125 >> 16 & 0xFF) + "." + (var2.field2125 >> 8 & 0xFF) + "." + (var2.field2125 & 0xFF);
                    var2.field2123 = InetAddress.getByName(var7).getHostName();
                }
                var2.field2127 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field2127 = 2;
            }
        }
    }

    @ObfuscatedName("dy.m(IIILjava/lang/Object;I)Leo;")
    public final class138 method2572(int arg0, int arg1, int arg2, Object arg3) {
        class138 var5 = new class138();
        var5.field2124 = arg0;
        var5.field2125 = arg1;
        var5.field2126 = arg3;
        synchronized (this) {
            if (this.field2002 == null) {
                this.field2002 = this.field1998 = var5;
            } else {
                this.field2002.field2121 = var5;
                this.field2002 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("dy.s(Ljava/lang/String;II)Leo;")
    public final class138 method2599(String arg0, int arg1) {
        return this.method2572(1, arg1, 0, arg0);
    }

    @ObfuscatedName("dy.j(Ljava/lang/Runnable;II)Leo;")
    public final class138 method2581(Runnable arg0, int arg1) {
        return this.method2572(2, arg1, 0, arg0);
    }

    @ObfuscatedName("dy.f(II)Leo;")
    public final class138 method2575(int arg0) {
        return this.method2572(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("dy.b(Ljava/net/URL;S)Leo;")
    public final class138 method2570(URL arg0) {
        return this.method2572(4, 0, 0, arg0);
    }

    @ObfuscatedName("dy.t(I)Lac;")
    public final class49 method2576() {
        return this.field2000;
    }
}
