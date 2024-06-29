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

@OriginalClass("client!gl")
public class class262 implements Runnable {

    @OriginalMember(owner = "client!gl", name = "f", descriptor = "Lbf;")
    private class227 field3962 = null;

    @OriginalMember(owner = "client!gl", name = "g", descriptor = "Ljava/applet/Applet;")
    public Applet field3963 = null;

    @OriginalMember(owner = "client!gl", name = "e", descriptor = "Lcf;")
    public class264 field3961 = null;

    @OriginalMember(owner = "client!gl", name = "h", descriptor = "Lbf;")
    private class227 field3964 = null;

    @OriginalMember(owner = "client!gl", name = "r", descriptor = "Lcf;")
    public class264 field3974 = null;

    @OriginalMember(owner = "client!gl", name = "m", descriptor = "Lcf;")
    public class264 field3969 = null;

    @OriginalMember(owner = "client!gl", name = "n", descriptor = "Z")
    private boolean field3970 = false;

    @OriginalMember(owner = "client!gl", name = "q", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field3973;

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "Ljava/lang/Thread;")
    private Thread field3958;

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "I")
    public static int field3960 = 3;

    @OriginalMember(owner = "client!gl", name = "t", descriptor = "J")
    public static volatile long field3976;

    @OriginalMember(owner = "client!gl", name = "o", descriptor = "Lwl;")
    private class173 field3971;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "Ljava/lang/String;")
    public static String field3957;

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "Ljava/lang/String;")
    public static String field3959;

    @OriginalMember(owner = "client!gl", name = "i", descriptor = "Ljava/lang/String;")
    public static String field3965;

    @OriginalMember(owner = "client!gl", name = "j", descriptor = "Ljava/lang/String;")
    public static String field3966;

    @OriginalMember(owner = "client!gl", name = "k", descriptor = "Ljava/lang/String;")
    public static String field3967;

    @OriginalMember(owner = "client!gl", name = "p", descriptor = "Ljava/lang/String;")
    public static String field3972;

    @OriginalMember(owner = "client!gl", name = "s", descriptor = "Ljava/lang/String;")
    private static String field3975;

    @OriginalMember(owner = "client!gl", name = "u", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field3977;

    @OriginalMember(owner = "client!gl", name = "v", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field3978;

    @OriginalMember(owner = "client!gl", name = "l", descriptor = "[Lcf;")
    public class264[] field3968;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(B[Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Lbf;", line = 7)
    public final class227 method1766(byte arg0, Class[] arg1, Class arg2, String arg3) {
        return arg0 > -20 ? (class227) null : this.method1776(new Object[] { arg2, arg3, arg1 }, 7205, 0, 0, 8);
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Ljava/lang/String;I)Lbf;", line = 19)
    public final class227 method1767(String arg0, int arg1) {
        if (arg1 != -6225) {
            this.method1786(true, (Component) null, -17);
        }
        return this.method1776(arg0, 7205, 0, 0, 16);
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(B)Z", line = 31)
    public final boolean method1768(byte arg0) {
        int var2 = 10 / ((-arg0 - 51) / 34);
        return false;
    }

    @OriginalMember(owner = "client!gl", name = "run", descriptor = "()V", line = 46)
    public final void run() {
        while (true) {
            class227 var2;
            synchronized (this) {
                while (true) {
                    if (this.field3970) {
                        return;
                    }
                    if (this.field3964 != null) {
                        var2 = this.field3964;
                        this.field3964 = this.field3964.field3454;
                        if (this.field3964 == null) {
                            this.field3962 = null;
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
                int var5 = var2.field3455;
                if (var5 == 1) {
                    if (field3976 > class231.method1594(-20375)) {
                        throw new IOException();
                    }
                    var2.field3452 = new Socket(InetAddress.getByName((String) var2.field3453), var2.field3457);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field3453);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field3457);
                    var2.field3452 = var6;
                } else if (var5 == 4) {
                    if (class231.method1594(-20375) < field3976) {
                        throw new IOException();
                    }
                    var2.field3452 = new DataInputStream(((URL) var2.field3453).openStream());
                } else if (var5 == 8) {
                    Object[] var8 = (Object[]) ((Object[]) var2.field3453);
                    var2.field3452 = ((Class) var8[0]).getDeclaredMethod((String) var8[1], (Class[]) ((Class[]) var8[2]));
                } else if (var5 == 9) {
                    Object[] var7 = (Object[]) ((Object[]) var2.field3453);
                    var2.field3452 = ((Class) var7[0]).getDeclaredField((String) var7[1]);
                } else {
                    throw new Exception();
                }
                var2.field3456 = 1;
            } catch (ThreadDeath var11) {
                throw var11;
            } catch (Throwable var12) {
                var2.field3456 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(BLjava/net/URL;)Lbf;", line = 147)
    public final class227 method1769(byte arg0, URL arg1) {
        return arg0 == -84 ? this.method1776(arg1, 7205, 0, 0, 4) : (class227) null;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(BILjava/lang/Runnable;)Lbf;", line = 164)
    public final class227 method1770(byte arg0, int arg1, Runnable arg2) {
        if (arg0 < 47) {
            this.run();
        }
        return this.method1776(arg2, 7205, 0, arg1, 2);
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIIII)Lbf;", line = 175)
    public final class227 method1771(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return arg3 == 13691 ? this.method1776((Object) null, 7205, (arg4 << 16) + arg1, (arg0 << 16) + arg2, 6) : (class227) null;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IILjava/awt/Point;[ILjava/awt/Component;I)Lbf;", line = 186)
    public final class227 method1772(int arg0, int arg1, Point arg2, int[] arg3, Component arg4, int arg5) {
        return arg1 > -25 ? (class227) null : this.method1776(new Object[] { arg4, arg3, arg2 }, 7205, arg0, arg5, 17);
    }

    @OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V", line = 448)
    public class262(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        field3965 = "Unknown";
        field3957 = "1.1";
        this.field3963 = arg0;
        try {
            field3965 = System.getProperty("java.vendor");
            field3957 = System.getProperty("java.version");
        } catch (Exception var20) {
        }
        try {
            field3959 = System.getProperty("os.name");
        } catch (Exception var19) {
            field3959 = "Unknown";
        }
        field3966 = field3959.toLowerCase();
        try {
            field3967 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var18) {
            field3967 = "";
        }
        try {
            field3972 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var17) {
            field3972 = "";
        }
        try {
            field3975 = System.getProperty("user.home");
            if (field3975 != null) {
                field3975 = field3975 + "/";
            }
        } catch (Exception var16) {
        }
        if (field3975 == null) {
            field3975 = "~/";
        }
        try {
            this.field3973 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var15) {
        }
        try {
            if (arg0 == null) {
                field3977 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field3977 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var14) {
        }
        try {
            if (arg0 == null) {
                field3978 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field3978 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var13) {
        }
        this.field3970 = false;
        this.field3958 = new Thread(this);
        this.field3958.setPriority(10);
        this.field3958.setDaemon(true);
        this.field3958.start();
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Ljava/lang/Class;I)Lbf;", line = 199)
    public final class227 method1773(Class arg0, int arg1) {
        if (arg1 >= -66) {
            field3975 = (String) null;
        }
        return this.method1776(arg0, 7205, 0, 0, 11);
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IBILjava/awt/Component;)Lbf;", line = 220)
    public final class227 method1774(int arg0, byte arg1, int arg2, Component arg3) {
        int var5 = -107 % ((-arg1 - 24) / 60);
        Point var6 = arg3.getLocationOnScreen();
        return this.method1776((Object) null, 7205, var6.y + arg2, var6.x + arg0, 14);
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Ljava/lang/String;B)Lbf;", line = 231)
    public final class227 method1775(String arg0, byte arg1) {
        if (arg1 != -21) {
            this.field3961 = (class264) null;
        }
        return this.method1776(arg0, 7205, 0, 0, 12);
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Ljava/lang/Object;IIII)Lbf;", line = 248)
    private final class227 method1776(Object arg0, int arg1, int arg2, int arg3, int arg4) {
        class227 var6 = new class227();
        var6.field3455 = arg4;
        var6.field3453 = arg0;
        var6.field3457 = arg3;
        synchronized (this) {
            if (arg1 != 7205) {
                this.field3973 = (EventQueue) null;
            }
            if (this.field3962 == null) {
                this.field3962 = this.field3964 = var6;
            } else {
                this.field3962.field3454 = var6;
                this.field3962 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Ljava/lang/String;II)Lbf;", line = 277)
    public final class227 method1777(String arg0, int arg1, int arg2) {
        return arg1 == 0 ? this.method1776(arg0, arg1 + 7205, 0, arg2, 1) : (class227) null;
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(B)Lbf;", line = 287)
    public final class227 method1778(byte arg0) {
        if (arg0 < 110) {
            field3965 = (String) null;
        }
        return this.method1776((Object) null, 7205, 0, 0, 5);
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(BLjava/lang/Class;)Lbf;", line = 298)
    public final class227 method1779(byte arg0, Class arg1) {
        return arg0 == 8 ? this.method1776(arg1, 7205, 0, 0, 10) : (class227) null;
    }

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "(B)Lwl;", line = 317)
    public final class173 method1780(byte arg0) {
        int var2 = -35 / ((arg0 + 28) / 47);
        return this.field3971;
    }

    static {
        new Hashtable(16);
        field3976 = 0L;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;B)Lbf;", line = 329)
    public final class227 method1781(Class arg0, String arg1, byte arg2) {
        if (arg2 != -79) {
            field3959 = (String) null;
        }
        return this.method1776(new Object[] { arg0, arg1 }, 7205, 0, 0, 9);
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(II)Lbf;", line = 348)
    public final class227 method1782(int arg0, int arg1) {
        if (arg0 != 3) {
            this.method1785((byte) -114);
        }
        return this.method1776((Object) null, arg0 ^ 0x1C26, 0, arg1, 3);
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(BLjava/awt/Frame;)Lbf;", line = 363)
    public final class227 method1783(byte arg0, Frame arg1) {
        return arg0 <= 86 ? (class227) null : this.method1776(arg1, 7205, 0, 0, 7);
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(I)V", line = 375)
    public final void method1784(int arg0) {
        if (arg0 != 10000) {
            field3975 = (String) null;
        }
        field3976 = class231.method1594(-20375) + 5000L;
    }

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "(B)V", line = 385)
    public final void method1785(byte arg0) {
        synchronized (this) {
            this.field3970 = true;
            this.notifyAll();
        }
        int var4 = -27 % ((-arg0 - 77) / 48);
        try {
            this.field3958.join();
        } catch (InterruptedException var15) {
        }
        if (this.field3961 != null) {
            try {
                this.field3961.method1855(0);
            } catch (IOException var14) {
            }
        }
        if (this.field3969 != null) {
            try {
                this.field3969.method1855(0);
            } catch (IOException var13) {
            }
        }
        if (this.field3968 != null) {
            for (int var8 = 0; var8 < this.field3968.length; var8++) {
                if (this.field3968[var8] != null) {
                    try {
                        this.field3968[var8].method1855(0);
                    } catch (IOException var12) {
                    }
                }
            }
        }
        if (this.field3974 != null) {
            try {
                this.field3974.method1855(0);
            } catch (IOException var11) {
            }
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(ZLjava/awt/Component;I)Lbf;", line = 534)
    public final class227 method1786(boolean arg0, Component arg1, int arg2) {
        int var4 = -109 % ((-arg2 - 53) / 39);
        return this.method1776(arg1, 7205, 0, arg0 ? 1 : 0, 15);
    }
}
