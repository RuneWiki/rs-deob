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

@OriginalClass("client!ll")
public class class156 implements Runnable {

    @OriginalMember(owner = "client!ll", name = "g", descriptor = "Lqm;")
    public class231 field2429 = null;

    @OriginalMember(owner = "client!ll", name = "i", descriptor = "Ljava/applet/Applet;")
    public Applet field2431 = null;

    @OriginalMember(owner = "client!ll", name = "d", descriptor = "Lqm;")
    public class231 field2426 = null;

    @OriginalMember(owner = "client!ll", name = "f", descriptor = "Z")
    private boolean field2428 = false;

    @OriginalMember(owner = "client!ll", name = "v", descriptor = "Lim;")
    private class180 field2444 = null;

    @OriginalMember(owner = "client!ll", name = "t", descriptor = "Lim;")
    private class180 field2442 = null;

    @OriginalMember(owner = "client!ll", name = "h", descriptor = "Lqm;")
    public class231 field2430 = null;

    @OriginalMember(owner = "client!ll", name = "k", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field2433;

    @OriginalMember(owner = "client!ll", name = "s", descriptor = "Ljava/lang/Thread;")
    private Thread field2441;

    @OriginalMember(owner = "client!ll", name = "e", descriptor = "I")
    public static int field2427 = 3;

    @OriginalMember(owner = "client!ll", name = "q", descriptor = "J")
    public static volatile long field2439;

    @OriginalMember(owner = "client!ll", name = "p", descriptor = "Lai;")
    private class125 field2438;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "Ljava/lang/String;")
    public static String field2423;

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "Ljava/lang/String;")
    public static String field2424;

    @OriginalMember(owner = "client!ll", name = "j", descriptor = "Ljava/lang/String;")
    public static String field2432;

    @OriginalMember(owner = "client!ll", name = "l", descriptor = "Ljava/lang/String;")
    public static String field2434;

    @OriginalMember(owner = "client!ll", name = "m", descriptor = "Ljava/lang/String;")
    private static String field2435;

    @OriginalMember(owner = "client!ll", name = "n", descriptor = "Ljava/lang/String;")
    public static String field2436;

    @OriginalMember(owner = "client!ll", name = "o", descriptor = "Ljava/lang/String;")
    public static String field2437;

    @OriginalMember(owner = "client!ll", name = "r", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field2440;

    @OriginalMember(owner = "client!ll", name = "u", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field2443;

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "[Lqm;")
    public class231[] field2425;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Ljava/lang/String;Z)Lim;", line = 6)
    public final class180 method1049(String arg0, boolean arg1) {
        return arg1 ? this.method1069(0, -16574, arg0, 16, 0) : (class180) null;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(B)Lim;", line = 17)
    public final class180 method1050(byte arg0) {
        if (arg0 < 7) {
            this.field2426 = (class231) null;
        }
        return this.method1069(0, -16574, (Object) null, 5, 0);
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(I)V", line = 29)
    public final void method1051(int arg0) {
        field2439 = class128.method869((byte) -55) + 5000L;
        if (arg0 != 0) {
            this.method1059((Class) null, 56);
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Ljava/lang/String;I)Lim;", line = 42)
    public final class180 method1052(String arg0, int arg1) {
        if (arg1 != 12) {
            this.run();
        }
        return this.method1069(0, -16574, arg0, 12, 0);
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(ZILjava/awt/Component;)Lim;", line = 56)
    public final class180 method1053(boolean arg0, int arg1, Component arg2) {
        int var4 = 15 / ((-arg1 - 10) / 52);
        return this.method1069(0, -16574, arg2, 15, arg0 ? 1 : 0);
    }

    @OriginalMember(owner = "client!ll", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V", line = 466)
    public class156(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        field2423 = "Unknown";
        field2437 = "1.1";
        this.field2431 = arg0;
        try {
            field2423 = System.getProperty("java.vendor");
            field2437 = System.getProperty("java.version");
        } catch (Exception var20) {
        }
        try {
            field2434 = System.getProperty("os.name");
        } catch (Exception var19) {
            field2434 = "Unknown";
        }
        field2436 = field2434.toLowerCase();
        try {
            field2424 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var18) {
            field2424 = "";
        }
        try {
            field2432 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var17) {
            field2432 = "";
        }
        try {
            field2435 = System.getProperty("user.home");
            if (field2435 != null) {
                field2435 = field2435 + "/";
            }
        } catch (Exception var16) {
        }
        if (field2435 == null) {
            field2435 = "~/";
        }
        try {
            this.field2433 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var15) {
        }
        try {
            if (arg0 == null) {
                field2440 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field2440 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var14) {
        }
        try {
            if (arg0 == null) {
                field2443 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field2443 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var13) {
        }
        this.field2428 = false;
        this.field2441 = new Thread(this);
        this.field2441.setPriority(10);
        this.field2441.setDaemon(true);
        this.field2441.start();
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IILjava/lang/Runnable;)Lim;", line = 74)
    public final class180 method1054(int arg0, int arg1, Runnable arg2) {
        if (arg0 != 0) {
            this.field2429 = (class231) null;
        }
        return this.method1069(0, -16574, arg2, 2, arg1);
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(ILjava/lang/Class;)Lim;", line = 84)
    public final class180 method1055(int arg0, Class arg1) {
        if (arg0 > -13) {
            this.field2438 = (class125) null;
        }
        return this.method1069(0, -16574, arg1, 10, 0);
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(BLjava/lang/String;I)Lim;", line = 94)
    public final class180 method1056(byte arg0, String arg1, int arg2) {
        if (arg0 != 8) {
            this.method1065(-97, -52, (Component) null, 16);
        }
        return this.method1069(0, -16574, arg1, 1, arg2);
    }

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "(I)V", line = 104)
    public final void method1057(int arg0) {
        synchronized (this) {
            this.field2428 = true;
            this.notifyAll();
        }
        try {
            this.field2441.join();
        } catch (InterruptedException var14) {
        }
        if (this.field2429 != null) {
            try {
                this.field2429.method1555(1);
            } catch (IOException var13) {
            }
        }
        if (arg0 != 0) {
            field2423 = (String) null;
        }
        if (this.field2430 != null) {
            try {
                this.field2430.method1555(1);
            } catch (IOException var12) {
            }
        }
        if (this.field2425 != null) {
            for (int var7 = 0; var7 < this.field2425.length; var7++) {
                if (this.field2425[var7] != null) {
                    try {
                        this.field2425[var7].method1555(1);
                    } catch (IOException var11) {
                    }
                }
            }
        }
        if (this.field2426 != null) {
            try {
                this.field2426.method1555(arg0 + 1);
            } catch (IOException var10) {
            }
        }
    }

    @OriginalMember(owner = "client!ll", name = "run", descriptor = "()V", line = 162)
    public final void run() {
        while (true) {
            class180 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2428) {
                        return;
                    }
                    if (this.field2442 != null) {
                        var2 = this.field2442;
                        this.field2442 = this.field2442.field2809;
                        if (this.field2442 == null) {
                            this.field2444 = null;
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
                int var5 = var2.field2813;
                if (var5 == 1) {
                    if (class128.method869((byte) -55) < field2439) {
                        throw new IOException();
                    }
                    var2.field2812 = new Socket(InetAddress.getByName((String) var2.field2810), var2.field2808);
                } else if (var5 == 2) {
                    Thread var8 = new Thread((Runnable) var2.field2810);
                    var8.setDaemon(true);
                    var8.start();
                    var8.setPriority(var2.field2808);
                    var2.field2812 = var8;
                } else if (var5 == 4) {
                    if (class128.method869((byte) -55) < field2439) {
                        throw new IOException();
                    }
                    var2.field2812 = new DataInputStream(((URL) var2.field2810).openStream());
                } else if (var5 == 8) {
                    Object[] var6 = (Object[]) ((Object[]) var2.field2810);
                    var2.field2812 = ((Class) var6[0]).getDeclaredMethod((String) var6[1], (Class[]) ((Class[]) var6[2]));
                } else if (var5 == 9) {
                    Object[] var7 = (Object[]) ((Object[]) var2.field2810);
                    var2.field2812 = ((Class) var7[0]).getDeclaredField((String) var7[1]);
                } else {
                    throw new Exception();
                }
                var2.field2811 = 1;
            } catch (ThreadDeath var11) {
                throw var11;
            } catch (Throwable var12) {
                var2.field2811 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "([IIILjava/awt/Component;Ljava/awt/Point;I)Lim;", line = 257)
    public final class180 method1058(int[] arg0, int arg1, int arg2, Component arg3, Point arg4, int arg5) {
        if (arg1 != 10000) {
            this.field2426 = (class231) null;
        }
        return this.method1069(arg5, -16574, new Object[] { arg3, arg0, arg4 }, 17, arg2);
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Ljava/lang/Class;I)Lim;", line = 272)
    public final class180 method1059(Class arg0, int arg1) {
        return arg1 == 0 ? this.method1069(0, -16574, arg0, 11, 0) : (class180) null;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIIII)Lim;", line = 284)
    public final class180 method1060(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = -103 % ((arg4 - 4) / 53);
        return this.method1069((arg1 << 16) + arg0, -16574, (Object) null, 6, (arg3 << 16) + arg2);
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(ZLjava/net/URL;)Lim;", line = 293)
    public final class180 method1061(boolean arg0, URL arg1) {
        return arg0 ? (class180) null : this.method1069(0, -16574, arg1, 4, 0);
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(II)Lim;", line = 308)
    public final class180 method1062(int arg0, int arg1) {
        if (arg0 != 3) {
            this.method1063((byte) 73);
        }
        return this.method1069(0, -16574, (Object) null, 3, arg1);
    }

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "(B)Lai;", line = 322)
    public final class125 method1063(byte arg0) {
        return arg0 <= 71 ? (class125) null : this.field2438;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Ljava/lang/Class;[Ljava/lang/Class;ILjava/lang/String;)Lim;", line = 343)
    public final class180 method1064(Class arg0, Class[] arg1, int arg2, String arg3) {
        if (arg2 >= -7) {
            this.method1053(true, -118, (Component) null);
        }
        return this.method1069(0, -16574, new Object[] { arg0, arg3, arg1 }, 8, 0);
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IILjava/awt/Component;I)Lim;", line = 353)
    public final class180 method1065(int arg0, int arg1, Component arg2, int arg3) {
        if (arg0 == 14) {
            Point var5 = arg2.getLocationOnScreen();
            return this.method1069(var5.y + arg3, -16574, (Object) null, 14, var5.x + arg1);
        } else {
            return (class180) null;
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Z)Z", line = 368)
    public final boolean method1066(boolean arg0) {
        if (arg0) {
            this.method1062(-23, 86);
        }
        return false;
    }

    static {
        new Hashtable(16);
        field2439 = 0L;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Ljava/awt/Frame;I)Lim;", line = 386)
    public final class180 method1067(Frame arg0, int arg1) {
        if (arg1 <= 78) {
            this.method1052((String) null, -91);
        }
        return this.method1069(0, -16574, arg0, 7, 0);
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Class;)Lim;", line = 399)
    public final class180 method1068(int arg0, String arg1, Class arg2) {
        if (arg0 > -39) {
            field2443 = (Method) null;
        }
        return this.method1069(0, -16574, new Object[] { arg2, arg1 }, 9, 0);
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IILjava/lang/Object;II)Lim;", line = 428)
    private final class180 method1069(int arg0, int arg1, Object arg2, int arg3, int arg4) {
        class180 var6 = new class180();
        if (arg1 != -16574) {
            return (class180) null;
        }
        var6.field2810 = arg2;
        var6.field2813 = arg3;
        var6.field2808 = arg4;
        synchronized (this) {
            if (this.field2444 == null) {
                this.field2444 = this.field2442 = var6;
            } else {
                this.field2444.field2809 = var6;
                this.field2444 = var6;
            }
            this.notify();
            return var6;
        }
    }
}
