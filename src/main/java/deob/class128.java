package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("ds")
public class class128 implements Runnable {

    @ObfuscatedName("ds.i")
    public class49 field1985;

    @ObfuscatedName("ds.e")
    public class138 field1979 = null;

    @ObfuscatedName("ds.h")
    public class138 field1980 = null;

    @ObfuscatedName("ds.q")
    public Thread field1981;

    @ObfuscatedName("ds.l")
    public boolean field1978 = false;

    @ObfuscatedName("ds.c")
    public EventQueue field1983;

    public class128() {
        Statics.field1931 = "Unknown";
        Statics.field3028 = "1.1";
        try {
            Statics.field1931 = System.getProperty("java.vendor");
            Statics.field3028 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field1983 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field1978 = false;
        this.field1981 = new Thread(this);
        this.field1981.setPriority(10);
        this.field1981.setDaemon(true);
        this.field1981.start();
    }

    @ObfuscatedName("ds.h(I)V")
    public final void method2531() {
        synchronized (this) {
            this.field1978 = true;
            this.notifyAll();
        }
        try {
            this.field1981.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class138 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1978) {
                        return;
                    }
                    if (this.field1979 != null) {
                        var2 = this.field1979;
                        this.field1979 = this.field1979.field2102;
                        if (this.field1979 == null) {
                            this.field1980 = null;
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
                int var5 = var2.field2104;
                if (var5 == 1) {
                    var2.field2106 = new Socket(InetAddress.getByName((String) var2.field2105), var2.field2098);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2105);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2098);
                    var2.field2106 = var6;
                } else if (var5 == 4) {
                    var2.field2106 = new DataInputStream(((URL) var2.field2105).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field2098 >> 24 & 0xFF) + "." + (var2.field2098 >> 16 & 0xFF) + "." + (var2.field2098 >> 8 & 0xFF) + "." + (var2.field2098 & 0xFF);
                    var2.field2106 = InetAddress.getByName(var7).getHostName();
                }
                var2.field2103 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field2103 = 2;
            }
        }
    }

    @ObfuscatedName("ds.q(IIILjava/lang/Object;I)Ley;")
    public final class138 method2521(int arg0, int arg1, int arg2, Object arg3) {
        class138 var5 = new class138();
        var5.field2104 = arg0;
        var5.field2098 = arg1;
        var5.field2105 = arg3;
        synchronized (this) {
            if (this.field1980 == null) {
                this.field1980 = this.field1979 = var5;
            } else {
                this.field1980.field2102 = var5;
                this.field1980 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("ds.l(Ljava/lang/String;II)Ley;")
    public final class138 method2522(String arg0, int arg1) {
        return this.method2521(1, arg1, 0, arg0);
    }

    @ObfuscatedName("ds.c(Ljava/lang/Runnable;IB)Ley;")
    public final class138 method2523(Runnable arg0, int arg1) {
        return this.method2521(2, arg1, 0, arg0);
    }

    @ObfuscatedName("ds.f(IB)Ley;")
    public final class138 method2524(int arg0) {
        return this.method2521(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("ds.s(Ljava/net/URL;I)Ley;")
    public final class138 method2529(URL arg0) {
        return this.method2521(4, 0, 0, arg0);
    }

    @ObfuscatedName("ds.m(B)Lax;")
    public final class49 method2526() {
        return this.field1985;
    }
}
