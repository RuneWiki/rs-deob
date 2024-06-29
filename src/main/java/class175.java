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

@OriginalClass("client!im")
public class class175 implements Runnable {

    @OriginalMember(owner = "client!im", name = "h", descriptor = "Lph;")
    public class315 field2867 = null;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "Loh;")
    private class257 field2860 = null;

    @OriginalMember(owner = "client!im", name = "b", descriptor = "Lph;")
    public class315 field2861 = null;

    @OriginalMember(owner = "client!im", name = "k", descriptor = "Ljava/applet/Applet;")
    public Applet field2870 = null;

    @OriginalMember(owner = "client!im", name = "p", descriptor = "Loh;")
    private class257 field2875 = null;

    @OriginalMember(owner = "client!im", name = "s", descriptor = "Z")
    private boolean field2878 = false;

    @OriginalMember(owner = "client!im", name = "f", descriptor = "Lph;")
    public class315 field2865 = null;

    @OriginalMember(owner = "client!im", name = "d", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field2863;

    @OriginalMember(owner = "client!im", name = "i", descriptor = "Ljava/lang/Thread;")
    private Thread field2868;

    @OriginalMember(owner = "client!im", name = "r", descriptor = "I")
    public static int field2877 = 3;

    @OriginalMember(owner = "client!im", name = "u", descriptor = "J")
    public static volatile long field2880;

    @OriginalMember(owner = "client!im", name = "n", descriptor = "Lll;")
    private class220 field2873;

    @OriginalMember(owner = "client!im", name = "e", descriptor = "Ljava/lang/String;")
    public static String field2864;

    @OriginalMember(owner = "client!im", name = "g", descriptor = "Ljava/lang/String;")
    public static String field2866;

    @OriginalMember(owner = "client!im", name = "j", descriptor = "Ljava/lang/String;")
    private static String field2869;

    @OriginalMember(owner = "client!im", name = "l", descriptor = "Ljava/lang/String;")
    public static String field2871;

    @OriginalMember(owner = "client!im", name = "m", descriptor = "Ljava/lang/String;")
    public static String field2872;

    @OriginalMember(owner = "client!im", name = "o", descriptor = "Ljava/lang/String;")
    public static String field2874;

    @OriginalMember(owner = "client!im", name = "q", descriptor = "Ljava/lang/String;")
    public static String field2876;

    @OriginalMember(owner = "client!im", name = "t", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field2879;

    @OriginalMember(owner = "client!im", name = "v", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field2881;

    @OriginalMember(owner = "client!im", name = "c", descriptor = "[Lph;")
    public class315[] field2862;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(B)V", line = 5)
    public final void method1285(byte arg0) {
        if (arg0 == -9) {
            field2880 = class205.method1451(106) + 5000L;
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(I)Z", line = 21)
    public final boolean method1286(int arg0) {
        if (arg0 != 5513) {
            this.method1297(-101, (String) null, (Class) null);
        }
        return false;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(Ljava/lang/Class;[Ljava/lang/Class;ILjava/lang/String;)Loh;", line = 33)
    public final class257 method1287(Class arg0, Class[] arg1, int arg2, String arg3) {
        return arg2 == 0 ? this.method1289(new Object[] { arg0, arg3, arg1 }, 0, -13124, 0, 8) : (class257) null;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(IIIII)Loh;", line = 44)
    public final class257 method1288(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = -47 % ((53 - arg4) / 41);
        return this.method1289((Object) null, (arg0 << 16) + arg1, -13124, (arg2 << 16) + arg3, 6);
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(Ljava/lang/Object;IIII)Loh;", line = 54)
    private final class257 method1289(Object arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 != -13124) {
            this.method1290(-107, (Runnable) null, -81);
        }
        class257 var6 = new class257();
        var6.field4257 = arg0;
        var6.field4258 = arg1;
        var6.field4254 = arg4;
        synchronized (this) {
            if (this.field2875 == null) {
                this.field2875 = this.field2860 = var6;
            } else {
                this.field2875.field4253 = var6;
                this.field2875 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(ILjava/lang/Runnable;I)Loh;", line = 85)
    public final class257 method1290(int arg0, Runnable arg1, int arg2) {
        int var4 = 97 / ((arg2 + 13) / 62);
        return this.method1289(arg1, arg0, -13124, 0, 2);
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(Ljava/lang/Class;B)Loh;", line = 93)
    public final class257 method1291(Class arg0, byte arg1) {
        return arg1 <= 94 ? (class257) null : this.method1289(arg0, 0, -13124, 0, 11);
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(Z)V", line = 103)
    public final void method1292(boolean arg0) {
        synchronized (this) {
            this.field2878 = arg0;
            this.notifyAll();
        }
        try {
            this.field2868.join();
        } catch (InterruptedException var14) {
        }
        if (this.field2861 != null) {
            try {
                this.field2861.method2169((byte) 86);
            } catch (IOException var13) {
            }
        }
        if (this.field2867 != null) {
            try {
                this.field2867.method2169((byte) -58);
            } catch (IOException var12) {
            }
        }
        if (this.field2862 != null) {
            for (int var7 = 0; var7 < this.field2862.length; var7++) {
                if (this.field2862[var7] != null) {
                    try {
                        this.field2862[var7].method2169((byte) 71);
                    } catch (IOException var11) {
                    }
                }
            }
        }
        if (this.field2865 != null) {
            try {
                this.field2865.method2169((byte) 86);
            } catch (IOException var10) {
            }
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(Ljava/lang/String;BI)Loh;", line = 169)
    public final class257 method1293(String arg0, byte arg1, int arg2) {
        if (arg1 <= 54) {
            this.method1286(-26);
        }
        return this.method1289(arg0, arg2, -13124, 0, 1);
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(IILjava/awt/Component;B)Loh;", line = 184)
    public final class257 method1294(int arg0, int arg1, Component arg2, byte arg3) {
        if (arg3 != 15) {
            this.field2867 = (class315) null;
        }
        Point var5 = arg2.getLocationOnScreen();
        return this.method1289((Object) null, arg0 + var5.x, -13124, arg1 - -var5.y, 14);
    }

    @OriginalMember(owner = "client!im", name = "run", descriptor = "()V", line = 199)
    public final void run() {
        while (true) {
            class257 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2878) {
                        return;
                    }
                    if (this.field2860 != null) {
                        var2 = this.field2860;
                        this.field2860 = this.field2860.field4253;
                        if (this.field2860 == null) {
                            this.field2875 = null;
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
                int var5 = var2.field4254;
                if (var5 == 1) {
                    if (class205.method1451(-117) < field2880) {
                        throw new IOException();
                    }
                    var2.field4255 = new Socket(InetAddress.getByName((String) var2.field4257), var2.field4258);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field4257);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field4258);
                    var2.field4255 = var6;
                } else if (var5 == 4) {
                    if (field2880 > class205.method1451(75)) {
                        throw new IOException();
                    }
                    var2.field4255 = new DataInputStream(((URL) var2.field4257).openStream());
                } else if (var5 == 8) {
                    Object[] var8 = (Object[]) ((Object[]) var2.field4257);
                    var2.field4255 = ((Class) var8[0]).getDeclaredMethod((String) var8[1], (Class[]) ((Class[]) var8[2]));
                } else if (var5 == 9) {
                    Object[] var7 = (Object[]) ((Object[]) var2.field4257);
                    var2.field4255 = ((Class) var7[0]).getDeclaredField((String) var7[1]);
                } else {
                    throw new Exception();
                }
                var2.field4256 = 1;
            } catch (ThreadDeath var11) {
                throw var11;
            } catch (Throwable var12) {
                var2.field4256 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(BZLjava/awt/Component;)Loh;", line = 298)
    public final class257 method1295(byte arg0, boolean arg1, Component arg2) {
        if (arg0 != 80) {
            this.method1295((byte) 68, false, (Component) null);
        }
        return this.method1289(arg2, arg1 ? 1 : 0, -13124, 0, 15);
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(BLjava/net/URL;)Loh;", line = 308)
    public final class257 method1296(byte arg0, URL arg1) {
        if (arg0 != 85) {
            this.method1304((Class) null, 61);
        }
        return this.method1289(arg1, 0, -13124, 0, 4);
    }

    @OriginalMember(owner = "client!im", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V", line = 441)
    public class175(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        this.field2870 = arg0;
        field2872 = "Unknown";
        field2876 = "1.1";
        try {
            field2872 = System.getProperty("java.vendor");
            field2876 = System.getProperty("java.version");
        } catch (Exception var20) {
        }
        try {
            field2866 = System.getProperty("os.name");
        } catch (Exception var19) {
            field2866 = "Unknown";
        }
        field2864 = field2866.toLowerCase();
        try {
            field2871 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var18) {
            field2871 = "";
        }
        try {
            field2874 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var17) {
            field2874 = "";
        }
        try {
            field2869 = System.getProperty("user.home");
            if (field2869 != null) {
                field2869 = field2869 + "/";
            }
        } catch (Exception var16) {
        }
        if (field2869 == null) {
            field2869 = "~/";
        }
        try {
            this.field2863 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var15) {
        }
        try {
            if (arg0 == null) {
                field2879 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field2879 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var14) {
        }
        try {
            if (arg0 == null) {
                field2881 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field2881 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var13) {
        }
        this.field2878 = false;
        this.field2868 = new Thread(this);
        this.field2868.setPriority(10);
        this.field2868.setDaemon(true);
        this.field2868.start();
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Class;)Loh;", line = 330)
    public final class257 method1297(int arg0, String arg1, Class arg2) {
        return arg0 == 9 ? this.method1289(new Object[] { arg2, arg1 }, 0, -13124, 0, 9) : (class257) null;
    }

    @OriginalMember(owner = "client!im", name = "b", descriptor = "(B)Loh;", line = 342)
    public final class257 method1298(byte arg0) {
        if (arg0 != 32) {
            field2876 = (String) null;
        }
        return this.method1289((Object) null, 0, -13124, 0, 5);
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(ILjava/awt/Frame;)Loh;", line = 359)
    public final class257 method1299(int arg0, Frame arg1) {
        if (arg0 != -20648) {
            this.method1304((Class) null, -8);
        }
        return this.method1289(arg1, 0, -13124, 0, 7);
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(Ljava/lang/String;B)Loh;", line = 369)
    public final class257 method1300(String arg0, byte arg1) {
        return arg1 < 67 ? (class257) null : this.method1289(arg0, 0, -13124, 0, 12);
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(II)Loh;", line = 380)
    public final class257 method1301(int arg0, int arg1) {
        return arg0 == 3 ? this.method1289((Object) null, arg1, -13124, 0, 3) : (class257) null;
    }

    @OriginalMember(owner = "client!im", name = "b", descriptor = "(I)Lll;", line = 390)
    public final class220 method1302(int arg0) {
        if (arg0 != 0) {
            field2881 = (Method) null;
        }
        return this.field2873;
    }

    @OriginalMember(owner = "client!im", name = "b", descriptor = "(Ljava/lang/String;B)Loh;", line = 400)
    public final class257 method1303(String arg0, byte arg1) {
        if (arg1 < 38) {
            this.field2861 = (class315) null;
        }
        return this.method1289(arg0, 0, -13124, 0, 16);
    }

    static {
        new Hashtable(16);
        field2880 = 0L;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(Ljava/lang/Class;I)Loh;", line = 522)
    public final class257 method1304(Class arg0, int arg1) {
        if (arg1 <= 88) {
            field2876 = (String) null;
        }
        return this.method1289(arg0, 0, -13124, 0, 10);
    }
}
