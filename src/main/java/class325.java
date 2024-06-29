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

@OriginalClass("client!oj")
public class class325 implements Runnable {

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "Lan;")
    public class322 field5037 = null;

    @OriginalMember(owner = "client!oj", name = "j", descriptor = "Lan;")
    public class322 field5044 = null;

    @OriginalMember(owner = "client!oj", name = "l", descriptor = "Lub;")
    private class21 field5046 = null;

    @OriginalMember(owner = "client!oj", name = "f", descriptor = "Z")
    private boolean field5040 = false;

    @OriginalMember(owner = "client!oj", name = "i", descriptor = "Lan;")
    public class322 field5043 = null;

    @OriginalMember(owner = "client!oj", name = "v", descriptor = "Lub;")
    private class21 field5056 = null;

    @OriginalMember(owner = "client!oj", name = "r", descriptor = "Ljava/applet/Applet;")
    public Applet field5052 = null;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field5035;

    @OriginalMember(owner = "client!oj", name = "g", descriptor = "Ljava/lang/Thread;")
    private Thread field5041;

    @OriginalMember(owner = "client!oj", name = "n", descriptor = "I")
    public static int field5048 = 3;

    @OriginalMember(owner = "client!oj", name = "t", descriptor = "J")
    public static volatile long field5054;

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "Luj;")
    private class142 field5036;

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "Ljava/lang/String;")
    public static String field5038;

    @OriginalMember(owner = "client!oj", name = "e", descriptor = "Ljava/lang/String;")
    private static String field5039;

    @OriginalMember(owner = "client!oj", name = "h", descriptor = "Ljava/lang/String;")
    public static String field5042;

    @OriginalMember(owner = "client!oj", name = "k", descriptor = "Ljava/lang/String;")
    public static String field5045;

    @OriginalMember(owner = "client!oj", name = "m", descriptor = "Ljava/lang/String;")
    public static String field5047;

    @OriginalMember(owner = "client!oj", name = "o", descriptor = "Ljava/lang/String;")
    public static String field5049;

    @OriginalMember(owner = "client!oj", name = "q", descriptor = "Ljava/lang/String;")
    public static String field5051;

    @OriginalMember(owner = "client!oj", name = "s", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field5053;

    @OriginalMember(owner = "client!oj", name = "u", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field5055;

    @OriginalMember(owner = "client!oj", name = "p", descriptor = "[Lan;")
    public class322[] field5050;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(II)Lub;", line = 9)
    public final class21 method2217(int arg0, int arg1) {
        if (arg0 <= 50) {
            this.method2223((Class) null, -122);
        }
        return this.method2226(arg1, false, 3, 0, (Object) null);
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Ljava/lang/String;Z)Lub;", line = 21)
    public final class21 method2218(String arg0, boolean arg1) {
        if (arg1) {
            this.method2231((Frame) null, -23);
        }
        return this.method2226(0, false, 16, 0, arg0);
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;[Ljava/lang/Class;I)Lub;", line = 31)
    public final class21 method2219(String arg0, Class arg1, Class[] arg2, int arg3) {
        if (arg3 != 27739) {
            this.field5040 = false;
        }
        return this.method2226(0, false, 8, 0, new Object[] { arg1, arg0, arg2 });
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Ljava/awt/Component;ZI)Lub;", line = 44)
    public final class21 method2220(Component arg0, boolean arg1, int arg2) {
        if (arg2 != 1) {
            this.method2217(-96, 96);
        }
        return this.method2226(arg1 ? 1 : 0, false, 15, 0, arg0);
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IBIII)Lub;", line = 55)
    public final class21 method2221(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (arg1 < 87) {
            field5051 = (String) null;
        }
        return this.method2226((arg2 << 16) + arg4, false, 6, (arg3 << 16) + arg0, (Object) null);
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IILjava/awt/Component;I[ILjava/awt/Point;)Lub;", line = 69)
    public final class21 method2222(int arg0, int arg1, Component arg2, int arg3, int[] arg4, Point arg5) {
        if (arg3 != 2) {
            field5042 = (String) null;
        }
        return this.method2226(arg0, false, 17, arg1, new Object[] { arg2, arg4, arg5 });
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Ljava/lang/Class;I)Lub;", line = 79)
    public final class21 method2223(Class arg0, int arg1) {
        if (arg1 < 31) {
            this.field5041 = (Thread) null;
        }
        return this.method2226(0, false, 10, 0, arg0);
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(ILjava/lang/String;I)Lub;", line = 91)
    public final class21 method2224(int arg0, String arg1, int arg2) {
        int var4 = -66 / ((-arg2 - 14) / 32);
        return this.method2226(arg0, false, 1, 0, arg1);
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IILjava/awt/Component;I)Lub;", line = 100)
    public final class21 method2225(int arg0, int arg1, Component arg2, int arg3) {
        if (arg1 == 24239) {
            Point var5 = arg2.getLocationOnScreen();
            return this.method2226(var5.x + arg0, false, 14, var5.y + arg3, (Object) null);
        } else {
            return (class21) null;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IZIILjava/lang/Object;)Lub;", line = 113)
    private final class21 method2226(int arg0, boolean arg1, int arg2, int arg3, Object arg4) {
        class21 var6 = new class21();
        var6.field386 = arg0;
        var6.field389 = arg2;
        var6.field388 = arg4;
        synchronized (this) {
            if (arg1) {
                field5049 = (String) null;
            }
            if (this.field5056 == null) {
                this.field5056 = this.field5046 = var6;
            } else {
                this.field5056.field390 = var6;
                this.field5056 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(I)V", line = 142)
    public final void method2227(int arg0) {
        synchronized (this) {
            this.field5040 = true;
            this.notifyAll();
        }
        try {
            this.field5041.join();
            if (arg0 != 0) {
                field5039 = (String) null;
            }
        } catch (InterruptedException var14) {
        }
        if (this.field5037 != null) {
            try {
                this.field5037.method2200(1);
            } catch (IOException var13) {
            }
        }
        if (this.field5043 != null) {
            try {
                this.field5043.method2200(1);
            } catch (IOException var12) {
            }
        }
        if (this.field5050 != null) {
            for (int var7 = 0; var7 < this.field5050.length; var7++) {
                if (this.field5050[var7] != null) {
                    try {
                        this.field5050[var7].method2200(arg0 + 1);
                    } catch (IOException var11) {
                    }
                }
            }
        }
        if (this.field5044 != null) {
            try {
                this.field5044.method2200(1);
            } catch (IOException var10) {
            }
        }
    }

    @OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V", line = 470)
    public class325(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        field5047 = "1.1";
        field5045 = "Unknown";
        this.field5052 = arg0;
        try {
            field5045 = System.getProperty("java.vendor");
            field5047 = System.getProperty("java.version");
        } catch (Exception var20) {
        }
        try {
            field5038 = System.getProperty("os.name");
        } catch (Exception var19) {
            field5038 = "Unknown";
        }
        field5042 = field5038.toLowerCase();
        try {
            field5049 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var18) {
            field5049 = "";
        }
        try {
            field5051 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var17) {
            field5051 = "";
        }
        try {
            field5039 = System.getProperty("user.home");
            if (field5039 != null) {
                field5039 = field5039 + "/";
            }
        } catch (Exception var16) {
        }
        if (field5039 == null) {
            field5039 = "~/";
        }
        try {
            this.field5035 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var15) {
        }
        try {
            if (arg0 == null) {
                field5053 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field5053 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var14) {
        }
        try {
            if (arg0 == null) {
                field5055 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field5055 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var13) {
        }
        this.field5040 = false;
        this.field5041 = new Thread(this);
        this.field5041.setPriority(10);
        this.field5041.setDaemon(true);
        this.field5041.start();
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(I)V", line = 206)
    public final void method2228(int arg0) {
        if (arg0 >= -81) {
            this.method2226(-52, false, -16, -32, (Object) null);
        }
        field5054 = class154.method1172((byte) 100) + 5000L;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(B)Luj;", line = 218)
    public final class142 method2229(byte arg0) {
        return arg0 < 14 ? (class142) null : this.field5036;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(ILjava/lang/String;)Lub;", line = 230)
    public final class21 method2230(int arg0, String arg1) {
        if (arg0 != 8) {
            field5039 = (String) null;
        }
        return this.method2226(0, false, 12, 0, arg1);
    }

    @OriginalMember(owner = "client!oj", name = "run", descriptor = "()V", line = 246)
    public final void run() {
        while (true) {
            class21 var2;
            synchronized (this) {
                while (true) {
                    if (this.field5040) {
                        return;
                    }
                    if (this.field5046 != null) {
                        var2 = this.field5046;
                        this.field5046 = this.field5046.field390;
                        if (this.field5046 == null) {
                            this.field5056 = null;
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
                int var5 = var2.field389;
                if (var5 == 1) {
                    if (class154.method1172((byte) 121) < field5054) {
                        throw new IOException();
                    }
                    var2.field391 = new Socket(InetAddress.getByName((String) var2.field388), var2.field386);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field388);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field386);
                    var2.field391 = var6;
                } else if (var5 == 4) {
                    if (class154.method1172((byte) 115) < field5054) {
                        throw new IOException();
                    }
                    var2.field391 = new DataInputStream(((URL) var2.field388).openStream());
                } else if (var5 == 8) {
                    Object[] var7 = (Object[]) ((Object[]) var2.field388);
                    var2.field391 = ((Class) var7[0]).getDeclaredMethod((String) var7[1], (Class[]) ((Class[]) var7[2]));
                } else if (var5 == 9) {
                    Object[] var8 = (Object[]) ((Object[]) var2.field388);
                    var2.field391 = ((Class) var8[0]).getDeclaredField((String) var8[1]);
                } else {
                    throw new Exception();
                }
                var2.field387 = 1;
            } catch (ThreadDeath var11) {
                throw var11;
            } catch (Throwable var12) {
                var2.field387 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Ljava/awt/Frame;I)Lub;", line = 345)
    public final class21 method2231(Frame arg0, int arg1) {
        return arg1 == 1 ? this.method2226(0, false, 7, 0, arg0) : (class21) null;
    }

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "(I)Lub;", line = 355)
    public final class21 method2232(int arg0) {
        if (arg0 != -19926) {
            this.method2224(-108, (String) null, -13);
        }
        return this.method2226(0, false, 5, 0, (Object) null);
    }

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "(I)Z", line = 369)
    public final boolean method2233(int arg0) {
        if (arg0 != -22152) {
            field5048 = 29;
        }
        return false;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Ljava/lang/Class;Z)Lub;", line = 390)
    public final class21 method2234(Class arg0, boolean arg1) {
        return arg1 ? (class21) null : this.method2226(0, false, 11, 0, arg0);
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(BLjava/lang/Class;Ljava/lang/String;)Lub;", line = 405)
    public final class21 method2235(byte arg0, Class arg1, String arg2) {
        return arg0 == -6 ? this.method2226(0, false, 9, 0, new Object[] { arg1, arg2 }) : (class21) null;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(ILjava/net/URL;)Lub;", line = 419)
    public final class21 method2236(int arg0, URL arg1) {
        if (arg0 < 35) {
            this.method2233(-60);
        }
        return this.method2226(0, false, 4, 0, arg1);
    }

    static {
        new Hashtable(16);
        field5054 = 0L;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(ILjava/lang/Runnable;B)Lub;", line = 444)
    public final class21 method2237(int arg0, Runnable arg1, byte arg2) {
        if (arg2 < 18) {
            this.field5052 = (Applet) null;
        }
        return this.method2226(arg0, false, 2, 0, arg1);
    }
}
