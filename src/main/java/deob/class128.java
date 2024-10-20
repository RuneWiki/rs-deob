package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("de")
public class class128 implements Runnable {

    @ObfuscatedName("de.a")
    public class49 field2003;

    @ObfuscatedName("de.k")
    public class138 field1995 = null;

    @ObfuscatedName("de.p")
    public class138 field1993 = null;

    @ObfuscatedName("de.l")
    public Thread field1992;

    @ObfuscatedName("de.u")
    public boolean field1998 = false;

    @ObfuscatedName("de.o")
    public EventQueue field1999;

    public class128() {
        Statics.field1997 = "Unknown";
        Statics.field1994 = "1.1";
        try {
            Statics.field1997 = System.getProperty("java.vendor");
            Statics.field1994 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field1999 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field1998 = false;
        this.field1992 = new Thread(this);
        this.field1992.setPriority(10);
        this.field1992.setDaemon(true);
        this.field1992.start();
    }

    @ObfuscatedName("de.a(B)V")
    public final void method2496() {
        synchronized (this) {
            this.field1998 = true;
            this.notifyAll();
        }
        try {
            this.field1992.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class138 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1998) {
                        return;
                    }
                    if (this.field1995 != null) {
                        var2 = this.field1995;
                        this.field1995 = this.field1995.field2120;
                        if (this.field1995 == null) {
                            this.field1993 = null;
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
                int var5 = var2.field2117;
                if (var5 == 1) {
                    var2.field2115 = new Socket(InetAddress.getByName((String) var2.field2119), var2.field2118);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2119);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2118);
                    var2.field2115 = var6;
                } else if (var5 == 4) {
                    var2.field2115 = new DataInputStream(((URL) var2.field2119).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field2118 >> 24 & 0xFF) + "." + (var2.field2118 >> 16 & 0xFF) + "." + (var2.field2118 >> 8 & 0xFF) + "." + (var2.field2118 & 0xFF);
                    var2.field2115 = InetAddress.getByName(var7).getHostName();
                }
                var2.field2116 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field2116 = 2;
            }
        }
    }

    @ObfuscatedName("de.k(IIILjava/lang/Object;B)Leg;")
    public final class138 method2518(int arg0, int arg1, int arg2, Object arg3) {
        class138 var5 = new class138();
        var5.field2117 = arg0;
        var5.field2118 = arg1;
        var5.field2119 = arg3;
        synchronized (this) {
            if (this.field1993 == null) {
                this.field1993 = this.field1995 = var5;
            } else {
                this.field1993.field2120 = var5;
                this.field1993 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("de.p(Ljava/lang/String;IB)Leg;")
    public final class138 method2509(String arg0, int arg1) {
        return this.method2518(1, arg1, 0, arg0);
    }

    @ObfuscatedName("de.l(Ljava/lang/Runnable;II)Leg;")
    public final class138 method2507(Runnable arg0, int arg1) {
        return this.method2518(2, arg1, 0, arg0);
    }

    @ObfuscatedName("de.u(II)Leg;")
    public final class138 method2499(int arg0) {
        return this.method2518(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("de.o(Ljava/net/URL;I)Leg;")
    public final class138 method2501(URL arg0) {
        return this.method2518(4, 0, 0, arg0);
    }

    @ObfuscatedName("de.m(B)Lab;")
    public final class49 method2514() {
        return this.field2003;
    }
}
