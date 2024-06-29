import java.applet.Applet;
import java.awt.Component;
import java.awt.EventQueue;
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

@OriginalClass("client!uc")
public class class160 implements Runnable {

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "Lkc;")
    private class29 field3017 = null;

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "Ljava/applet/Applet;")
    public Applet field3022 = null;

    @OriginalMember(owner = "client!uc", name = "n", descriptor = "Lag;")
    public class95 field3030 = null;

    @OriginalMember(owner = "client!uc", name = "k", descriptor = "Z")
    private boolean field3027 = false;

    @OriginalMember(owner = "client!uc", name = "t", descriptor = "Lag;")
    public class95 field3036 = null;

    @OriginalMember(owner = "client!uc", name = "q", descriptor = "Lkc;")
    private class29 field3033 = null;

    @OriginalMember(owner = "client!uc", name = "u", descriptor = "Lag;")
    public class95 field3037 = null;

    @OriginalMember(owner = "client!uc", name = "l", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field3028;

    @OriginalMember(owner = "client!uc", name = "m", descriptor = "Ljava/lang/Thread;")
    private Thread field3029;

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "I")
    public static int field3018 = 3;

    @OriginalMember(owner = "client!uc", name = "v", descriptor = "J")
    public static volatile long field3038;

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "Lqd;")
    private class35 field3023;

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "Ljava/lang/String;")
    public static String field3019;

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "Ljava/lang/String;")
    public static String field3020;

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "Ljava/lang/String;")
    public static String field3021;

    @OriginalMember(owner = "client!uc", name = "h", descriptor = "Ljava/lang/String;")
    private static String field3024;

    @OriginalMember(owner = "client!uc", name = "j", descriptor = "Ljava/lang/String;")
    public static String field3026;

    @OriginalMember(owner = "client!uc", name = "o", descriptor = "Ljava/lang/String;")
    public static String field3031;

    @OriginalMember(owner = "client!uc", name = "p", descriptor = "Ljava/lang/String;")
    public static String field3032;

    @OriginalMember(owner = "client!uc", name = "r", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field3034;

    @OriginalMember(owner = "client!uc", name = "s", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field3035;

    @OriginalMember(owner = "client!uc", name = "i", descriptor = "[Lag;")
    public class95[] field3025;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ILjava/lang/Object;BII)Lkc;")
    private final class29 method1150(int arg0, Object arg1, byte arg2, int arg3, int arg4) {
        class29 var6 = new class29();
        var6.field489 = arg3;
        var6.field490 = arg4;
        var6.field491 = arg1;
        synchronized (this) {
            if (this.field3033 == null) {
                this.field3033 = this.field3017 = var6;
            } else {
                this.field3033.field488 = var6;
                this.field3033 = var6;
            }
            this.notify();
            int var8 = 9 % ((44 - arg2) / 42);
            return var6;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)V")
    public final void method1151(byte arg0) {
        int var2 = 56 % ((26 - arg0) / 35);
        field3038 = class244.method1644((byte) -53) + 5000L;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Ljava/lang/Runnable;BI)Lkc;")
    public final class29 method1152(Runnable arg0, byte arg1, int arg2) {
        if (arg1 != -47) {
            field3024 = null;
        }
        return this.method1150(0, arg0, (byte) -39, arg2, 2);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IILjava/awt/Component;I)Lkc;")
    public final class29 method1153(int arg0, int arg1, Component arg2, int arg3) {
        Point var5 = arg2.getLocationOnScreen();
        return arg0 == 14 ? this.method1150(var5.y + arg1, (Object) null, (byte) -14, var5.x + arg3, 14) : null;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V")
    public final void method1154(int arg0) {
        synchronized (this) {
            this.field3027 = true;
            if (arg0 != 0) {
                this.method1160((Class) null, 85, (String) null);
            }
            this.notifyAll();
        }
        try {
            this.field3029.join();
        } catch (InterruptedException var8) {
        }
        if (this.field3036 != null) {
            try {
                this.field3036.method617((byte) -110);
            } catch (IOException var7) {
            }
        }
        if (this.field3037 != null) {
            try {
                this.field3037.method617((byte) -110);
            } catch (IOException var6) {
            }
        }
        if (this.field3025 != null) {
            for (int var3 = 0; var3 < this.field3025.length; var3++) {
                if (this.field3025[var3] != null) {
                    try {
                        this.field3025[var3].method617((byte) -110);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field3030 != null) {
            try {
                this.field3030.method617((byte) -110);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Ljava/lang/String;B)Lkc;")
    public final class29 method1155(String arg0, byte arg1) {
        if (arg1 > -71) {
            this.method1150(-58, (Object) null, (byte) -62, 44, 60);
        }
        return this.method1150(0, arg0, (byte) 90, 0, 12);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Ljava/lang/Class;[Ljava/lang/Class;BLjava/lang/String;)Lkc;")
    public final class29 method1156(Class arg0, Class[] arg1, byte arg2, String arg3) {
        return arg2 < 67 ? null : this.method1150(0, new Object[] { arg0, arg3, arg1 }, (byte) -108, 0, 8);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ILjava/net/URL;)Lkc;")
    public final class29 method1157(int arg0, URL arg1) {
        return arg0 == 0 ? this.method1150(0, arg1, (byte) -55, 0, 4) : null;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Z)Lqd;")
    public final class35 method1158(boolean arg0) {
        if (arg0) {
            this.method1159((byte) 13, (String) null);
        }
        return this.field3023;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(BLjava/lang/String;)Lkc;")
    public final class29 method1159(byte arg0, String arg1) {
        return arg0 >= -66 ? null : this.method1150(0, arg1, (byte) -127, 0, 16);
    }

    @OriginalMember(owner = "client!uc", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class29 var2;
            synchronized (this) {
                while (true) {
                    if (this.field3027) {
                        return;
                    }
                    if (this.field3017 != null) {
                        var2 = this.field3017;
                        this.field3017 = this.field3017.field488;
                        if (this.field3017 == null) {
                            this.field3033 = null;
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
                int var3 = var2.field490;
                if (var3 == 1) {
                    if (field3038 > class244.method1644((byte) -56)) {
                        throw new IOException();
                    }
                    var2.field486 = new Socket(InetAddress.getByName((String) var2.field491), var2.field489);
                } else if (var3 == 2) {
                    Thread var4 = new Thread((Runnable) var2.field491);
                    var4.setDaemon(true);
                    var4.start();
                    var4.setPriority(var2.field489);
                    var2.field486 = var4;
                } else if (var3 == 4) {
                    if (class244.method1644((byte) -54) < field3038) {
                        throw new IOException();
                    }
                    var2.field486 = new DataInputStream(((URL) var2.field491).openStream());
                } else if (var3 == 8) {
                    Object[] var6 = (Object[]) var2.field491;
                    var2.field486 = ((Class) var6[0]).getDeclaredMethod((String) var6[1], (Class[]) var6[2]);
                } else if (var3 == 9) {
                    Object[] var5 = (Object[]) var2.field491;
                    var2.field486 = ((Class) var5[0]).getDeclaredField((String) var5[1]);
                } else {
                    throw new Exception();
                }
                var2.field487 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field487 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Ljava/lang/Class;ILjava/lang/String;)Lkc;")
    public final class29 method1160(Class arg0, int arg1, String arg2) {
        if (arg1 != 29529) {
            field3018 = -116;
        }
        return this.method1150(0, new Object[] { arg0, arg2 }, (byte) -109, 0, 9);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Ljava/awt/Component;IZ)Lkc;")
    public final class29 method1161(Component arg0, int arg1, boolean arg2) {
        if (arg1 != 1) {
            this.method1151((byte) -127);
        }
        return this.method1150(0, arg0, (byte) 101, arg2 ? 1 : 0, 15);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(BI)Lkc;")
    public final class29 method1162(byte arg0, int arg1) {
        if (arg0 != 110) {
            this.method1163((byte) -87, -122, (String) null);
        }
        return this.method1150(0, (Object) null, (byte) -23, arg1, 3);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(BILjava/lang/String;)Lkc;")
    public final class29 method1163(byte arg0, int arg1, String arg2) {
        if (arg0 != -91) {
            this.method1151((byte) 95);
        }
        return this.method1150(0, arg2, (byte) -58, arg1, 1);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ILjava/awt/Point;[ILjava/awt/Component;BI)Lkc;")
    public final class29 method1164(int arg0, Point arg1, int[] arg2, Component arg3, byte arg4, int arg5) {
        if (arg4 < 5) {
            this.method1153(-10, -29, (Component) null, 52);
        }
        return this.method1150(arg5, new Object[] { arg3, arg2, arg1 }, (byte) 121, arg0, 17);
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
    public class160(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        field3019 = "1.1";
        field3031 = "Unknown";
        this.field3022 = arg0;
        try {
            field3031 = System.getProperty("java.vendor");
            field3019 = System.getProperty("java.version");
        } catch (Exception var12) {
        }
        try {
            field3020 = System.getProperty("os.name");
        } catch (Exception var11) {
            field3020 = "Unknown";
        }
        field3026 = field3020.toLowerCase();
        try {
            field3032 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var10) {
            field3032 = "";
        }
        try {
            field3021 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var9) {
            field3021 = "";
        }
        try {
            field3024 = System.getProperty("user.home");
            if (field3024 != null) {
                field3024 = field3024 + "/";
            }
        } catch (Exception var8) {
        }
        if (field3024 == null) {
            field3024 = "~/";
        }
        try {
            this.field3028 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var7) {
        }
        try {
            if (arg0 == null) {
                field3035 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field3035 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        try {
            if (arg0 == null) {
                field3034 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field3034 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var5) {
        }
        this.field3027 = false;
        this.field3029 = new Thread(this);
        this.field3029.setPriority(10);
        this.field3029.setDaemon(true);
        this.field3029.start();
    }

    static {
        new Hashtable(16);
        field3038 = 0L;
    }
}
