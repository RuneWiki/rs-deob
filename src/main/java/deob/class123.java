package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("da")
public class class123 implements Runnable {

    @ObfuscatedName("da.e")
    public class47 field1952;

    @ObfuscatedName("da.i")
    public class133 field1958 = null;

    @ObfuscatedName("da.t")
    public class133 field1953 = null;

    @ObfuscatedName("da.z")
    public Thread field1949;

    @ObfuscatedName("da.g")
    public boolean field1955 = false;

    @ObfuscatedName("da.c")
    public EventQueue field1951;

    public class123() {
        Statics.field1956 = "Unknown";
        Statics.field1950 = "1.1";
        try {
            Statics.field1956 = System.getProperty("java.vendor");
            Statics.field1950 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field1951 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field1955 = false;
        this.field1949 = new Thread(this);
        this.field1949.setPriority(10);
        this.field1949.setDaemon(true);
        this.field1949.start();
    }

    @ObfuscatedName("da.i(I)V")
    public final void method2460() {
        synchronized (this) {
            this.field1955 = true;
            this.notifyAll();
        }
        try {
            this.field1949.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class133 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1955) {
                        return;
                    }
                    if (this.field1958 != null) {
                        var2 = this.field1958;
                        this.field1958 = this.field1958.field2077;
                        if (this.field1958 == null) {
                            this.field1953 = null;
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
                int var5 = var2.field2074;
                if (var5 == 1) {
                    var2.field2070 = new Socket(InetAddress.getByName((String) var2.field2076), var2.field2075);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2076);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2075);
                    var2.field2070 = var6;
                } else if (var5 == 4) {
                    var2.field2070 = new DataInputStream(((URL) var2.field2076).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field2075 >> 24 & 0xFF) + "." + (var2.field2075 >> 16 & 0xFF) + "." + (var2.field2075 >> 8 & 0xFF) + "." + (var2.field2075 & 0xFF);
                    var2.field2070 = InetAddress.getByName(var7).getHostName();
                }
                var2.field2069 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field2069 = 2;
            }
        }
    }

    @ObfuscatedName("da.t(IIILjava/lang/Object;I)Leg;")
    public final class133 method2461(int arg0, int arg1, int arg2, Object arg3) {
        class133 var5 = new class133();
        var5.field2074 = arg0;
        var5.field2075 = arg1;
        var5.field2076 = arg3;
        synchronized (this) {
            if (this.field1953 == null) {
                this.field1953 = this.field1958 = var5;
            } else {
                this.field1953.field2077 = var5;
                this.field1953 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("da.z(Ljava/lang/String;IB)Leg;")
    public final class133 method2477(String arg0, int arg1) {
        return this.method2461(1, arg1, 0, arg0);
    }

    @ObfuscatedName("da.g(Ljava/lang/Runnable;IB)Leg;")
    public final class133 method2463(Runnable arg0, int arg1) {
        return this.method2461(2, arg1, 0, arg0);
    }

    @ObfuscatedName("da.c(II)Leg;")
    public final class133 method2464(int arg0) {
        return this.method2461(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("da.o(Ljava/net/URL;I)Leg;")
    public final class133 method2465(URL arg0) {
        return this.method2461(4, 0, 0, arg0);
    }

    @ObfuscatedName("da.q(I)Lac;")
    public final class47 method2473() {
        return this.field1952;
    }
}
