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

@OriginalClass("client!di")
public class class151 implements Runnable {

    @OriginalMember(owner = "client!di", name = "h", descriptor = "Lla;")
    public class138 field2354 = null;

    @OriginalMember(owner = "client!di", name = "b", descriptor = "Z")
    private boolean field2348 = false;

    @OriginalMember(owner = "client!di", name = "j", descriptor = "Lla;")
    public class138 field2356 = null;

    @OriginalMember(owner = "client!di", name = "s", descriptor = "Lla;")
    public class138 field2365 = null;

    @OriginalMember(owner = "client!di", name = "q", descriptor = "Lka;")
    private class188 field2363 = null;

    @OriginalMember(owner = "client!di", name = "m", descriptor = "Ljava/applet/Applet;")
    public Applet field2359 = null;

    @OriginalMember(owner = "client!di", name = "n", descriptor = "Lka;")
    private class188 field2360 = null;

    @OriginalMember(owner = "client!di", name = "l", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field2358;

    @OriginalMember(owner = "client!di", name = "i", descriptor = "Ljava/lang/Thread;")
    private Thread field2355;

    @OriginalMember(owner = "client!di", name = "o", descriptor = "I")
    public static int field2361 = 3;

    @OriginalMember(owner = "client!di", name = "u", descriptor = "J")
    public static volatile long field2367;

    @OriginalMember(owner = "client!di", name = "e", descriptor = "Lsj;")
    private class56 field2351;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "Ljava/lang/String;")
    private static String field2347;

    @OriginalMember(owner = "client!di", name = "c", descriptor = "Ljava/lang/String;")
    public static String field2349;

    @OriginalMember(owner = "client!di", name = "d", descriptor = "Ljava/lang/String;")
    public static String field2350;

    @OriginalMember(owner = "client!di", name = "f", descriptor = "Ljava/lang/String;")
    public static String field2352;

    @OriginalMember(owner = "client!di", name = "g", descriptor = "Ljava/lang/String;")
    public static String field2353;

    @OriginalMember(owner = "client!di", name = "k", descriptor = "Ljava/lang/String;")
    public static String field2357;

    @OriginalMember(owner = "client!di", name = "p", descriptor = "Ljava/lang/String;")
    public static String field2362;

    @OriginalMember(owner = "client!di", name = "t", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field2366;

    @OriginalMember(owner = "client!di", name = "v", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field2368;

    @OriginalMember(owner = "client!di", name = "r", descriptor = "[Lla;")
    public class138[] field2364;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(ILjava/lang/Object;III)Lka;", line = 9)
    private final class188 method952(int arg0, Object arg1, int arg2, int arg3, int arg4) {
        class188 var6 = new class188();
        var6.field2978 = arg0;
        var6.field2981 = arg1;
        var6.field2979 = arg3;
        synchronized (this) {
            if (this.field2360 == null) {
                this.field2360 = this.field2363 = var6;
            } else {
                this.field2360.field2982 = var6;
                this.field2360 = var6;
            }
            this.notify();
            if (arg2 != 0) {
                this.method954(51);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(I)Z", line = 41)
    public final boolean method953(int arg0) {
        if (arg0 != -6801) {
            this.field2364 = (class138[]) null;
        }
        return false;
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(I)Lsj;", line = 56)
    public final class56 method954(int arg0) {
        int var2 = -73 / ((arg0 - 37) / 39);
        return this.field2351;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(ILjava/net/URL;)Lka;", line = 65)
    public final class188 method955(int arg0, URL arg1) {
        return arg0 == 0 ? this.method952(4, arg1, 0, 0, 0) : (class188) null;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IILjava/lang/Runnable;)Lka;", line = 77)
    public final class188 method956(int arg0, int arg1, Runnable arg2) {
        if (arg1 != 0) {
            this.field2348 = true;
        }
        return this.method952(2, arg2, 0, arg0, 0);
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Ljava/awt/Component;IIZ[ILjava/awt/Point;)Lka;", line = 94)
    public final class188 method957(Component arg0, int arg1, int arg2, boolean arg3, int[] arg4, Point arg5) {
        return arg3 ? (class188) null : this.method952(17, new Object[] { arg0, arg4, arg5 }, 0, arg2, arg1);
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Ljava/awt/Frame;B)Lka;", line = 104)
    public final class188 method958(Frame arg0, byte arg1) {
        return arg1 <= 69 ? (class188) null : this.method952(7, arg0, 0, 0, 0);
    }

    @OriginalMember(owner = "client!di", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V", line = 466)
    public class151(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        this.field2359 = arg0;
        field2349 = "Unknown";
        field2362 = "1.1";
        try {
            field2349 = System.getProperty("java.vendor");
            field2362 = System.getProperty("java.version");
        } catch (Exception var20) {
        }
        try {
            field2353 = System.getProperty("os.name");
        } catch (Exception var19) {
            field2353 = "Unknown";
        }
        field2350 = field2353.toLowerCase();
        try {
            field2352 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var18) {
            field2352 = "";
        }
        try {
            field2357 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var17) {
            field2357 = "";
        }
        try {
            field2347 = System.getProperty("user.home");
            if (field2347 != null) {
                field2347 = field2347 + "/";
            }
        } catch (Exception var16) {
        }
        if (field2347 == null) {
            field2347 = "~/";
        }
        try {
            this.field2358 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var15) {
        }
        try {
            if (arg0 == null) {
                field2366 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field2366 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var14) {
        }
        try {
            if (arg0 == null) {
                field2368 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field2368 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var13) {
        }
        this.field2348 = false;
        this.field2355 = new Thread(this);
        this.field2355.setPriority(10);
        this.field2355.setDaemon(true);
        this.field2355.start();
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(ILjava/awt/Component;II)Lka;", line = 131)
    public final class188 method959(int arg0, Component arg1, int arg2, int arg3) {
        if (arg3 <= 18) {
            return (class188) null;
        } else {
            Point var5 = arg1.getLocationOnScreen();
            return this.method952(14, (Object) null, 0, arg2 + var5.x, var5.y + arg0);
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(ILjava/lang/String;)Lka;", line = 146)
    public final class188 method960(int arg0, String arg1) {
        if (arg0 != 0) {
            field2367 = 116L;
        }
        return this.method952(12, arg1, 0, 0, 0);
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(BLjava/awt/Component;Z)Lka;", line = 157)
    public final class188 method961(byte arg0, Component arg1, boolean arg2) {
        return arg0 == 94 ? this.method952(15, arg1, arg0 - 94, arg2 ? 1 : 0, 0) : (class188) null;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(ILjava/lang/String;B)Lka;", line = 170)
    public final class188 method962(int arg0, String arg1, byte arg2) {
        if (arg2 != -71) {
            field2347 = (String) null;
        }
        return this.method952(1, arg1, 0, arg0, 0);
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(B)V", line = 180)
    public final void method963(byte arg0) {
        if (arg0 <= 26) {
            this.method967(-5, (String) null);
        }
        field2367 = class76.method507(-30994) + 5000L;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(II)Lka;", line = 197)
    public final class188 method964(int arg0, int arg1) {
        if (arg0 != 3) {
            this.run();
        }
        return this.method952(3, (Object) null, arg0 ^ 0x3, arg1, 0);
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Z)V", line = 211)
    public final void method965(boolean arg0) {
        synchronized (this) {
            this.field2348 = true;
            this.notifyAll();
        }
        try {
            this.field2355.join();
        } catch (InterruptedException var14) {
        }
        if (this.field2365 != null) {
            try {
                this.field2365.method874(-128);
            } catch (IOException var13) {
            }
        }
        if (this.field2354 != null) {
            try {
                this.field2354.method874(-117);
            } catch (IOException var12) {
            }
        }
        if (arg0) {
            return;
        }
        if (this.field2364 != null) {
            for (int var7 = 0; var7 < this.field2364.length; var7++) {
                if (this.field2364[var7] != null) {
                    try {
                        this.field2364[var7].method874(-123);
                    } catch (IOException var11) {
                    }
                }
            }
        }
        if (this.field2356 != null) {
            try {
                this.field2356.method874(-120);
            } catch (IOException var10) {
            }
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(BLjava/lang/Class;)Lka;", line = 268)
    public final class188 method966(byte arg0, Class arg1) {
        return arg0 == -127 ? this.method952(10, arg1, 0, 0, 0) : (class188) null;
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(ILjava/lang/String;)Lka;", line = 278)
    public final class188 method967(int arg0, String arg1) {
        if (arg0 != 0) {
            this.field2358 = (EventQueue) null;
        }
        return this.method952(16, arg1, arg0 ^ 0x0, 0, 0);
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IIIIB)Lka;", line = 288)
    public final class188 method968(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (arg4 != -70) {
            this.field2354 = (class138) null;
        }
        return this.method952(6, (Object) null, 0, (arg0 << 16) + arg3, (arg2 << 16) + arg1);
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Ljava/lang/Class;I)Lka;", line = 300)
    public final class188 method969(Class arg0, int arg1) {
        return arg1 == -17159 ? this.method952(11, arg0, arg1 ^ 0xFFFFBCF9, 0, 0) : (class188) null;
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(Z)Lka;", line = 313)
    public final class188 method970(boolean arg0) {
        if (!arg0) {
            field2350 = (String) null;
        }
        return this.method952(5, (Object) null, 0, 0, 0);
    }

    static {
        new Hashtable(16);
        field2367 = 0L;
    }

    @OriginalMember(owner = "client!di", name = "run", descriptor = "()V", line = 330)
    public final void run() {
        while (true) {
            class188 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2348) {
                        return;
                    }
                    if (this.field2363 != null) {
                        var2 = this.field2363;
                        this.field2363 = this.field2363.field2982;
                        if (this.field2363 == null) {
                            this.field2360 = null;
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
                int var5 = var2.field2978;
                if (var5 == 1) {
                    if (field2367 > class76.method507(-30994)) {
                        throw new IOException();
                    }
                    var2.field2977 = new Socket(InetAddress.getByName((String) var2.field2981), var2.field2979);
                } else if (var5 == 2) {
                    Thread var8 = new Thread((Runnable) var2.field2981);
                    var8.setDaemon(true);
                    var8.start();
                    var8.setPriority(var2.field2979);
                    var2.field2977 = var8;
                } else if (var5 == 4) {
                    if (class76.method507(-30994) < field2367) {
                        throw new IOException();
                    }
                    var2.field2977 = new DataInputStream(((URL) var2.field2981).openStream());
                } else if (var5 == 8) {
                    Object[] var6 = (Object[]) ((Object[]) var2.field2981);
                    var2.field2977 = ((Class) var6[0]).getDeclaredMethod((String) var6[1], (Class[]) ((Class[]) var6[2]));
                } else if (var5 == 9) {
                    Object[] var7 = (Object[]) ((Object[]) var2.field2981);
                    var2.field2977 = ((Class) var7[0]).getDeclaredField((String) var7[1]);
                } else {
                    throw new Exception();
                }
                var2.field2980 = 1;
            } catch (ThreadDeath var11) {
                throw var11;
            } catch (Throwable var12) {
                var2.field2980 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Ljava/lang/Class;ILjava/lang/String;)Lka;", line = 445)
    public final class188 method971(Class arg0, int arg1, String arg2) {
        if (arg1 != 14401) {
            field2366 = (Method) null;
        }
        return this.method952(9, new Object[] { arg0, arg2 }, arg1 ^ 0x3841, 0, 0);
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/Class;[Ljava/lang/Class;)Lka;", line = 455)
    public final class188 method972(String arg0, boolean arg1, Class arg2, Class[] arg3) {
        if (!arg1) {
            this.field2358 = (EventQueue) null;
        }
        return this.method952(8, new Object[] { arg2, arg0, arg3 }, 0, 0, 0);
    }
}
