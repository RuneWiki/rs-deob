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

@OriginalClass("client!bd")
public class class305 implements Runnable {

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "Lc;")
    public class303 field5410 = null;

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "Lc;")
    public class303 field5411 = null;

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "Lia;")
    private class206 field5408 = null;

    @OriginalMember(owner = "client!bd", name = "i", descriptor = "Z")
    private boolean field5414 = false;

    @OriginalMember(owner = "client!bd", name = "m", descriptor = "Ljava/applet/Applet;")
    public Applet field5418 = null;

    @OriginalMember(owner = "client!bd", name = "o", descriptor = "Lc;")
    public class303 field5420 = null;

    @OriginalMember(owner = "client!bd", name = "l", descriptor = "Lia;")
    private class206 field5417 = null;

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field5409;

    @OriginalMember(owner = "client!bd", name = "n", descriptor = "Ljava/lang/Thread;")
    private Thread field5419;

    @OriginalMember(owner = "client!bd", name = "j", descriptor = "I")
    public static int field5415 = 3;

    @OriginalMember(owner = "client!bd", name = "t", descriptor = "J")
    public static volatile long field5425;

    @OriginalMember(owner = "client!bd", name = "r", descriptor = "Luf;")
    private class22 field5423;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "Ljava/lang/String;")
    public static String field5406;

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "Ljava/lang/String;")
    private static String field5407;

    @OriginalMember(owner = "client!bd", name = "g", descriptor = "Ljava/lang/String;")
    public static String field5412;

    @OriginalMember(owner = "client!bd", name = "h", descriptor = "Ljava/lang/String;")
    public static String field5413;

    @OriginalMember(owner = "client!bd", name = "k", descriptor = "Ljava/lang/String;")
    public static String field5416;

    @OriginalMember(owner = "client!bd", name = "q", descriptor = "Ljava/lang/String;")
    public static String field5422;

    @OriginalMember(owner = "client!bd", name = "s", descriptor = "Ljava/lang/String;")
    public static String field5424;

    @OriginalMember(owner = "client!bd", name = "u", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field5426;

    @OriginalMember(owner = "client!bd", name = "v", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field5427;

    @OriginalMember(owner = "client!bd", name = "p", descriptor = "[Lc;")
    public class303[] field5421;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Ljava/awt/Frame;B)Lia;", line = 5)
    public final class206 method2154(Frame arg0, byte arg1) {
        if (arg1 != 26) {
            this.method2159(-66);
        }
        return this.method2156(0, arg0, 0, -1, 7);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)Luf;", line = 15)
    public final class22 method2155(byte arg0) {
        return arg0 >= -60 ? (class22) null : this.field5423;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILjava/lang/Object;III)Lia;", line = 28)
    private final class206 method2156(int arg0, Object arg1, int arg2, int arg3, int arg4) {
        class206 var6 = new class206();
        var6.field3660 = arg1;
        if (arg3 != -1) {
            this.field5417 = (class206) null;
        }
        var6.field3656 = arg4;
        var6.field3658 = arg2;
        synchronized (this) {
            if (this.field5417 == null) {
                this.field5417 = this.field5408 = var6;
            } else {
                this.field5417.field3659 = var6;
                this.field5417 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(BLjava/lang/String;)Lia;", line = 61)
    public final class206 method2157(byte arg0, String arg1) {
        int var3 = -90 % ((59 - arg0) / 61);
        return this.method2156(0, arg1, 0, -1, 16);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Class;)Lia;", line = 69)
    public final class206 method2158(int arg0, String arg1, Class arg2) {
        if (arg0 != 0) {
            this.method2165((Class) null, (byte) -80);
        }
        return this.method2156(0, new Object[] { arg2, arg1 }, 0, -1, 9);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V", line = 80)
    public final void method2159(int arg0) {
        if (arg0 != 16128) {
            this.field5414 = false;
        }
        field5425 = class127.method1015(21504) + 5000L;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIILjava/awt/Component;)Lia;", line = 103)
    public final class206 method2160(int arg0, int arg1, int arg2, Component arg3) {
        Point var5 = arg3.getLocationOnScreen();
        int var6 = 80 % ((arg0 + 5) / 52);
        return this.method2156(var5.y + arg2, (Object) null, var5.x + arg1, -1, 14);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "([IBLjava/awt/Point;ILjava/awt/Component;I)Lia;", line = 113)
    public final class206 method2161(int[] arg0, byte arg1, Point arg2, int arg3, Component arg4, int arg5) {
        if (arg1 < 39) {
            field5427 = (Method) null;
        }
        return this.method2156(arg3, new Object[] { arg4, arg0, arg2 }, arg5, -1, 17);
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(I)V", line = 125)
    public final void method2162(int arg0) {
        synchronized (this) {
            this.field5414 = true;
            this.notifyAll();
            if (arg0 != -21496) {
                this.method2156(30, (Object) null, -27, 96, -97);
            }
        }
        try {
            this.field5419.join();
        } catch (InterruptedException var14) {
        }
        if (this.field5410 != null) {
            try {
                this.field5410.method2149(true);
            } catch (IOException var13) {
            }
        }
        if (this.field5420 != null) {
            try {
                this.field5420.method2149(true);
            } catch (IOException var12) {
            }
        }
        if (this.field5421 != null) {
            for (int var7 = 0; var7 < this.field5421.length; var7++) {
                if (this.field5421[var7] != null) {
                    try {
                        this.field5421[var7].method2149(true);
                    } catch (IOException var11) {
                    }
                }
            }
        }
        if (this.field5411 != null) {
            try {
                this.field5411.method2149(true);
            } catch (IOException var10) {
            }
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Ljava/lang/Runnable;II)Lia;", line = 180)
    public final class206 method2163(Runnable arg0, int arg1, int arg2) {
        return arg2 == 7159 ? this.method2156(0, arg0, arg1, arg2 ^ 0xFFFFE408, 2) : (class206) null;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILjava/lang/String;I)Lia;", line = 190)
    public final class206 method2164(int arg0, String arg1, int arg2) {
        if (arg0 != 0) {
            this.method2157((byte) 12, (String) null);
        }
        return this.method2156(0, arg1, arg2, -1, 1);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Ljava/lang/Class;B)Lia;", line = 202)
    public final class206 method2165(Class arg0, byte arg1) {
        if (arg1 != 105) {
            this.method2164(106, (String) null, -107);
        }
        return this.method2156(0, arg0, 0, arg1 ^ 0xFFFFFF96, 11);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Ljava/lang/String;B)Lia;", line = 213)
    public final class206 method2166(String arg0, byte arg1) {
        if (arg1 < 14) {
            field5416 = (String) null;
        }
        return this.method2156(0, arg0, 0, -1, 12);
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(Ljava/lang/Class;B)Lia;", line = 224)
    public final class206 method2167(Class arg0, byte arg1) {
        if (arg1 != 26) {
            this.field5409 = (EventQueue) null;
        }
        return this.method2156(0, arg0, 0, -1, 10);
    }

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "(I)Z", line = 239)
    public final boolean method2168(int arg0) {
        if (arg0 != 15) {
            field5407 = (String) null;
        }
        return false;
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V", line = 455)
    public class305(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        field5413 = "1.1";
        this.field5418 = arg0;
        field5424 = "Unknown";
        try {
            field5424 = System.getProperty("java.vendor");
            field5413 = System.getProperty("java.version");
        } catch (Exception var20) {
        }
        try {
            field5406 = System.getProperty("os.name");
        } catch (Exception var19) {
            field5406 = "Unknown";
        }
        field5416 = field5406.toLowerCase();
        try {
            field5422 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var18) {
            field5422 = "";
        }
        try {
            field5412 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var17) {
            field5412 = "";
        }
        try {
            field5407 = System.getProperty("user.home");
            if (field5407 != null) {
                field5407 = field5407 + "/";
            }
        } catch (Exception var16) {
        }
        if (field5407 == null) {
            field5407 = "~/";
        }
        try {
            this.field5409 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var15) {
        }
        try {
            if (arg0 == null) {
                field5427 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field5427 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var14) {
        }
        try {
            if (arg0 == null) {
                field5426 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field5426 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var13) {
        }
        this.field5414 = false;
        this.field5419 = new Thread(this);
        this.field5419.setPriority(10);
        this.field5419.setDaemon(true);
        this.field5419.start();
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IB)Lia;", line = 262)
    public final class206 method2169(int arg0, byte arg1) {
        if (arg1 != 39) {
            this.field5408 = (class206) null;
        }
        return this.method2156(0, (Object) null, arg0, -1, 3);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(BLjava/net/URL;)Lia;", line = 272)
    public final class206 method2170(byte arg0, URL arg1) {
        if (arg0 <= 107) {
            field5425 = 7L;
        }
        return this.method2156(0, arg1, 0, -1, 4);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIIII)Lia;", line = 291)
    public final class206 method2171(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 >= -71) {
            this.field5414 = true;
        }
        return this.method2156((arg1 << 16) + arg4, (Object) null, (arg2 << 16) + arg3, -1, 6);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(ZZLjava/awt/Component;)Lia;", line = 305)
    public final class206 method2172(boolean arg0, boolean arg1, Component arg2) {
        if (arg0) {
            field5406 = (String) null;
        }
        return this.method2156(0, arg2, arg1 ? 1 : 0, -1, 15);
    }

    @OriginalMember(owner = "client!bd", name = "run", descriptor = "()V", line = 318)
    public final void run() {
        while (true) {
            class206 var2;
            synchronized (this) {
                while (true) {
                    if (this.field5414) {
                        return;
                    }
                    if (this.field5408 != null) {
                        var2 = this.field5408;
                        this.field5408 = this.field5408.field3659;
                        if (this.field5408 == null) {
                            this.field5417 = null;
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
                int var5 = var2.field3656;
                if (var5 == 1) {
                    if (field5425 > class127.method1015(21504)) {
                        throw new IOException();
                    }
                    var2.field3657 = new Socket(InetAddress.getByName((String) var2.field3660), var2.field3658);
                } else if (var5 == 2) {
                    Thread var8 = new Thread((Runnable) var2.field3660);
                    var8.setDaemon(true);
                    var8.start();
                    var8.setPriority(var2.field3658);
                    var2.field3657 = var8;
                } else if (var5 == 4) {
                    if (class127.method1015(21504) < field5425) {
                        throw new IOException();
                    }
                    var2.field3657 = new DataInputStream(((URL) var2.field3660).openStream());
                } else if (var5 == 8) {
                    Object[] var7 = (Object[]) ((Object[]) var2.field3660);
                    var2.field3657 = ((Class) var7[0]).getDeclaredMethod((String) var7[1], (Class[]) ((Class[]) var7[2]));
                } else if (var5 == 9) {
                    Object[] var6 = (Object[]) ((Object[]) var2.field3660);
                    var2.field3657 = ((Class) var6[0]).getDeclaredField((String) var6[1]);
                } else {
                    throw new Exception();
                }
                var2.field3655 = 1;
            } catch (ThreadDeath var11) {
                throw var11;
            } catch (Throwable var12) {
                var2.field3655 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;Z[Ljava/lang/Class;)Lia;", line = 414)
    public final class206 method2173(String arg0, Class arg1, boolean arg2, Class[] arg3) {
        if (arg2) {
            this.method2158(7, (String) null, (Class) null);
        }
        return this.method2156(0, new Object[] { arg1, arg0, arg3 }, 0, -1, 8);
    }

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "(I)Lia;", line = 430)
    public final class206 method2174(int arg0) {
        if (arg0 != 24317) {
            this.field5419 = (Thread) null;
        }
        return this.method2156(0, (Object) null, 0, -1, 5);
    }

    static {
        new Hashtable(16);
        field5425 = 0L;
    }
}
