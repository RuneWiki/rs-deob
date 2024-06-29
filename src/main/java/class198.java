import java.applet.Applet;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Point;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public class class198 implements Runnable {

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "Lum;")
    public class145 field3450 = null;

    @OriginalMember(owner = "client!kn", name = "n", descriptor = "Ldn;")
    private class231 field3463 = null;

    @OriginalMember(owner = "client!kn", name = "j", descriptor = "Z")
    private boolean field3459 = false;

    @OriginalMember(owner = "client!kn", name = "c", descriptor = "Lum;")
    public class145 field3452 = null;

    @OriginalMember(owner = "client!kn", name = "r", descriptor = "Ldn;")
    private class231 field3467 = null;

    @OriginalMember(owner = "client!kn", name = "i", descriptor = "Lum;")
    public class145 field3458 = null;

    @OriginalMember(owner = "client!kn", name = "l", descriptor = "Ljava/applet/Applet;")
    public Applet field3461 = null;

    @OriginalMember(owner = "client!kn", name = "p", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field3465;

    @OriginalMember(owner = "client!kn", name = "k", descriptor = "Ljava/lang/Thread;")
    private Thread field3460;

    @OriginalMember(owner = "client!kn", name = "f", descriptor = "I")
    public static int field3455 = 3;

    @OriginalMember(owner = "client!kn", name = "v", descriptor = "J")
    public static volatile long field3471;

    @OriginalMember(owner = "client!kn", name = "q", descriptor = "Ldg;")
    private class322 field3466;

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "Ljava/lang/String;")
    public static String field3451;

    @OriginalMember(owner = "client!kn", name = "d", descriptor = "Ljava/lang/String;")
    public static String field3453;

    @OriginalMember(owner = "client!kn", name = "e", descriptor = "Ljava/lang/String;")
    public static String field3454;

    @OriginalMember(owner = "client!kn", name = "g", descriptor = "Ljava/lang/String;")
    private static String field3456;

    @OriginalMember(owner = "client!kn", name = "h", descriptor = "Ljava/lang/String;")
    public static String field3457;

    @OriginalMember(owner = "client!kn", name = "m", descriptor = "Ljava/lang/String;")
    public static String field3462;

    @OriginalMember(owner = "client!kn", name = "s", descriptor = "Ljava/lang/String;")
    public static String field3468;

    @OriginalMember(owner = "client!kn", name = "t", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field3469;

    @OriginalMember(owner = "client!kn", name = "u", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field3470;

    @OriginalMember(owner = "client!kn", name = "o", descriptor = "[Lum;")
    public class145[] field3464;

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(ILjava/awt/Frame;)Ldn;", line = 7)
    public final class231 method1369(int arg0, Frame arg1) {
        int var3 = -91 / ((38 - arg0) / 40);
        return this.method1386(0, 0, 4, arg1, 7);
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(I)Ldn;", line = 18)
    public final class231 method1370(int arg0) {
        if (arg0 != -3997) {
            this.field3464 = (class145[]) null;
        }
        return this.method1386(0, 0, 4, (Object) null, 5);
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(ILjava/lang/String;)Ldn;", line = 30)
    public final class231 method1371(int arg0, String arg1) {
        int var3 = -67 % ((-arg0 - 29) / 38);
        return this.method1386(0, 0, 4, arg1, 16);
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(IB)Ldn;", line = 39)
    public final class231 method1372(int arg0, byte arg1) {
        if (arg1 != 114) {
            this.field3459 = true;
        }
        return this.method1386(arg0, 0, 4, (Object) null, 3);
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(Ljava/lang/Runnable;II)Ldn;", line = 49)
    public final class231 method1373(Runnable arg0, int arg1, int arg2) {
        if (arg1 != 4) {
            this.method1373((Runnable) null, 115, 77);
        }
        return this.method1386(arg2, 0, 4, arg0, 2);
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(Ljava/awt/Component;BZ)Ldn;", line = 59)
    public final class231 method1374(Component arg0, byte arg1, boolean arg2) {
        if (arg1 <= 123) {
            this.method1375(72, 44, 98, 15, (byte) 82);
        }
        return this.method1386(arg2 ? 1 : 0, 0, 4, arg0, 15);
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(IIIIB)Ldn;", line = 70)
    public final class231 method1375(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (arg4 <= 41) {
            this.method1381(74, (Class) null, (String) null);
        }
        return this.method1386((arg0 << 16) + arg3, (arg2 << 16) + arg1, 4, (Object) null, 6);
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(Ljava/lang/String;II)Ldn;", line = 80)
    public final class231 method1376(String arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            this.method1374((Component) null, (byte) -9, false);
        }
        return this.method1386(arg2, 0, 4, arg0, 1);
    }

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "(I)Z", line = 98)
    public final boolean method1377(int arg0) {
        int var2 = -3 / ((-arg0 - 50) / 51);
        return false;
    }

    @OriginalMember(owner = "client!kn", name = "run", descriptor = "()V", line = 110)
    public final void run() {
        while (true) {
            class231 var2;
            synchronized (this) {
                while (true) {
                    if (this.field3459) {
                        return;
                    }
                    if (this.field3467 != null) {
                        var2 = this.field3467;
                        this.field3467 = this.field3467.field4006;
                        if (this.field3467 == null) {
                            this.field3463 = null;
                        }
                        break;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var13) {
                    }
                }
            }
            try {
                int var5 = var2.field4010;
                if (var5 == 1) {
                    if (field3471 > class153.method1032(103)) {
                        throw new IOException();
                    }
                    var2.field4009 = new Socket(InetAddress.getByName((String) var2.field4007), var2.field4008);
                } else if (var5 == 2) {
                    Thread var8 = new Thread((Runnable) var2.field4007);
                    var8.setDaemon(true);
                    var8.start();
                    var8.setPriority(var2.field4008);
                    var2.field4009 = var8;
                } else if (var5 == 4) {
                    if (class153.method1032(105) < field3471) {
                        throw new IOException();
                    }
                    var2.field4009 = new DataInputStream(((URL) var2.field4007).openStream());
                } else if (var5 == 8) {
                    Object[] var6 = (Object[]) ((Object[]) var2.field4007);
                    var2.field4009 = ((Class) var6[0]).getDeclaredMethod((String) var6[1], (Class[]) ((Class[]) var6[2]));
                } else if (var5 == 9) {
                    Object[] var7 = (Object[]) ((Object[]) var2.field4007);
                    var2.field4009 = ((Class) var7[0]).getDeclaredField((String) var7[1]);
                } else {
                    throw new Exception();
                }
                var2.field4011 = 1;
            } catch (ThreadDeath var11) {
                throw var11;
            } catch (Throwable var12) {
                var2.field4011 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(B)V", line = 204)
    public final void method1378(byte arg0) {
        if (arg0 > -59) {
            this.run();
        }
        field3471 = class153.method1032(118) + 5000L;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(Ljava/lang/Class;I)Ldn;", line = 216)
    public final class231 method1379(Class arg0, int arg1) {
        int var3 = -100 / ((23 - arg1) / 56);
        return this.method1386(0, 0, 4, arg0, 10);
    }

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "(Ljava/lang/Class;I)Ldn;", line = 224)
    public final class231 method1380(Class arg0, int arg1) {
        if (arg1 <= 28) {
            field3454 = (String) null;
        }
        return this.method1386(0, 0, 4, arg0, 11);
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(ILjava/lang/Class;Ljava/lang/String;)Ldn;", line = 236)
    public final class231 method1381(int arg0, Class arg1, String arg2) {
        if (arg0 <= 73) {
            this.field3458 = (class145) null;
        }
        return this.method1386(0, 0, 4, new Object[] { arg1, arg2 }, 9);
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(Ljava/net/URL;I)Ldn;", line = 250)
    public final class231 method1382(URL arg0, int arg1) {
        return arg1 == -1 ? this.method1386(0, 0, 4, arg0, 4) : (class231) null;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(IIILjava/awt/Component;)Ldn;", line = 262)
    public final class231 method1383(int arg0, int arg1, int arg2, Component arg3) {
        if (arg2 != -10) {
            this.field3460 = (Thread) null;
        }
        Point var5 = arg3.getLocationOnScreen();
        return this.method1386(arg1 + var5.x, var5.y + arg0, 4, (Object) null, 14);
    }

    static {
        new Hashtable(16);
        field3471 = 0L;
    }

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "(B)V", line = 284)
    public final void method1384(byte arg0) {
        synchronized (this) {
            this.field3459 = true;
            this.notifyAll();
        }
        try {
            this.field3460.join();
        } catch (InterruptedException var14) {
        }
        if (this.field3458 != null) {
            try {
                this.field3458.method1009(0);
            } catch (IOException var13) {
            }
        }
        if (this.field3452 != null) {
            try {
                this.field3452.method1009(0);
            } catch (IOException var12) {
            }
        }
        if (this.field3464 != null) {
            for (int var7 = 0; var7 < this.field3464.length; var7++) {
                if (this.field3464[var7] != null) {
                    try {
                        this.field3464[var7].method1009(0);
                    } catch (IOException var11) {
                    }
                }
            }
        }
        if (this.field3450 != null) {
            try {
                this.field3450.method1009(0);
            } catch (IOException var10) {
            }
        }
        if (arg0 <= 66) {
            this.method1379((Class) null, 50);
        }
    }

    @OriginalMember(owner = "client!kn", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V", line = 445)
    public class198(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        field3457 = "1.1";
        field3454 = "Unknown";
        this.field3461 = arg0;
        try {
            field3454 = System.getProperty("java.vendor");
            field3457 = System.getProperty("java.version");
        } catch (Exception var20) {
        }
        try {
            field3468 = System.getProperty("os.name");
        } catch (Exception var19) {
            field3468 = "Unknown";
        }
        field3453 = field3468.toLowerCase();
        try {
            field3462 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var18) {
            field3462 = "";
        }
        try {
            field3451 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var17) {
            field3451 = "";
        }
        try {
            field3456 = System.getProperty("user.home");
            if (field3456 != null) {
                field3456 = field3456 + "/";
            }
        } catch (Exception var16) {
        }
        if (field3456 == null) {
            field3456 = "~/";
        }
        try {
            this.field3465 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var15) {
        }
        try {
            if (arg0 == null) {
                field3469 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field3469 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var14) {
        }
        try {
            if (arg0 == null) {
                field3470 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field3470 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var13) {
        }
        this.field3459 = false;
        this.field3460 = new Thread(this);
        this.field3460.setPriority(10);
        this.field3460.setDaemon(true);
        this.field3460.start();
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(Ljava/lang/String;[Ljava/lang/Class;BLjava/lang/Class;)Ldn;", line = 345)
    public final class231 method1385(String arg0, Class[] arg1, byte arg2, Class arg3) {
        if (arg2 != -58) {
            this.method1383(62, 26, -44, (Component) null);
        }
        return this.method1386(0, 0, 4, new Object[] { arg3, arg0, arg1 }, 8);
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(IIILjava/lang/Object;I)Ldn;", line = 359)
    private final class231 method1386(int arg0, int arg1, int arg2, Object arg3, int arg4) {
        class231 var6 = new class231();
        var6.field4007 = arg3;
        var6.field4010 = arg4;
        if (arg2 != 4) {
            this.method1375(67, -67, 46, 50, (byte) -32);
        }
        var6.field4008 = arg0;
        synchronized (this) {
            if (this.field3463 == null) {
                this.field3463 = this.field3467 = var6;
            } else {
                this.field3463.field4006 = var6;
                this.field3463 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!kn", name = "c", descriptor = "(I)Ldg;", line = 392)
    public final class322 method1387(int arg0) {
        if (arg0 != -2014543856) {
            field3470 = (Method) null;
        }
        return this.field3466;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(ZLjava/lang/String;)Ldn;", line = 429)
    public final class231 method1388(boolean arg0, String arg1) {
        if (arg0) {
            this.method1385((String) null, (Class[]) null, (byte) 57, (Class) null);
        }
        return this.method1386(0, 0, 4, arg1, 12);
    }
}
