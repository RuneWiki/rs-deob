import java.applet.Applet;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.Transferable;
import java.io.DataInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public class class274 implements Runnable {

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "Lsc;")
    private class158 field4501 = null;

    @OriginalMember(owner = "client!uo", name = "f", descriptor = "Leo;")
    public class133 field4506 = null;

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "Z")
    private boolean field4502 = false;

    @OriginalMember(owner = "client!uo", name = "j", descriptor = "Lsc;")
    private class158 field4510 = null;

    @OriginalMember(owner = "client!uo", name = "o", descriptor = "Ljava/applet/Applet;")
    public Applet field4515 = null;

    @OriginalMember(owner = "client!uo", name = "s", descriptor = "Leo;")
    public class133 field4519 = null;

    @OriginalMember(owner = "client!uo", name = "p", descriptor = "Leo;")
    public class133 field4516 = null;

    @OriginalMember(owner = "client!uo", name = "n", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field4514;

    @OriginalMember(owner = "client!uo", name = "l", descriptor = "Ljava/lang/Thread;")
    private Thread field4512;

    @OriginalMember(owner = "client!uo", name = "i", descriptor = "I")
    public static int field4509 = 3;

    @OriginalMember(owner = "client!uo", name = "v", descriptor = "J")
    public static volatile long field4522;

    @OriginalMember(owner = "client!uo", name = "d", descriptor = "Lfl;")
    private class354 field4504;

    @OriginalMember(owner = "client!uo", name = "c", descriptor = "Ljava/lang/String;")
    public static String field4503;

    @OriginalMember(owner = "client!uo", name = "e", descriptor = "Ljava/lang/String;")
    public static String field4505;

    @OriginalMember(owner = "client!uo", name = "h", descriptor = "Ljava/lang/String;")
    public static String field4508;

    @OriginalMember(owner = "client!uo", name = "k", descriptor = "Ljava/lang/String;")
    private static String field4511;

    @OriginalMember(owner = "client!uo", name = "m", descriptor = "Ljava/lang/String;")
    public static String field4513;

    @OriginalMember(owner = "client!uo", name = "q", descriptor = "Ljava/lang/String;")
    public static String field4517;

    @OriginalMember(owner = "client!uo", name = "r", descriptor = "Ljava/lang/String;")
    public static String field4518;

    @OriginalMember(owner = "client!uo", name = "t", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field4520;

    @OriginalMember(owner = "client!uo", name = "u", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field4521;

    @OriginalMember(owner = "client!uo", name = "g", descriptor = "[Leo;")
    public class133[] field4507;

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(B)V", line = 5)
    public final void method1938(byte arg0) {
        synchronized (this) {
            this.field4502 = true;
            this.notifyAll();
        }
        try {
            if (arg0 <= 68) {
                return;
            }
            this.field4512.join();
        } catch (InterruptedException var14) {
        }
        if (this.field4519 != null) {
            try {
                this.field4519.method865((byte) -113);
            } catch (IOException var13) {
            }
        }
        if (this.field4516 != null) {
            try {
                this.field4516.method865((byte) -113);
            } catch (IOException var12) {
            }
        }
        if (this.field4507 != null) {
            for (int var7 = 0; var7 < this.field4507.length; var7++) {
                if (this.field4507[var7] != null) {
                    try {
                        this.field4507[var7].method865((byte) -113);
                    } catch (IOException var11) {
                    }
                }
            }
        }
        if (this.field4506 != null) {
            try {
                this.field4506.method865((byte) -113);
            } catch (IOException var10) {
            }
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Class;)Lsc;", line = 67)
    public final class158 method1939(int arg0, String arg1, Class arg2) {
        if (arg0 <= 82) {
            this.field4506 = (class133) null;
        }
        return this.method1948(0, 0, 120, new Object[] { arg2, arg1 }, 9);
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIIIB)Lsc;", line = 80)
    public final class158 method1940(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        return arg4 > -77 ? (class158) null : this.method1948((arg3 << 16) + arg2, (arg0 << 16) + arg1, 108, (Object) null, 6);
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(Ljava/awt/Component;III)Lsc;", line = 95)
    public final class158 method1941(Component arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 0) {
            Point var5 = arg0.getLocationOnScreen();
            return this.method1948(var5.x + arg1, var5.y + arg3, arg2 + 106, (Object) null, 14);
        } else {
            return (class158) null;
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(Ljava/lang/String;B)Lsc;", line = 110)
    public final class158 method1942(String arg0, byte arg1) {
        int var3 = 45 % ((33 - arg1) / 50);
        return this.method1948(0, 0, 98, arg0, 16);
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(ZLjava/lang/Class;)Lsc;", line = 121)
    public final class158 method1943(boolean arg0, Class arg1) {
        return arg0 ? (class158) null : this.method1948(0, 0, 113, arg1, 11);
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(ILjava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;)Lsc;", line = 133)
    public final class158 method1944(int arg0, String arg1, Class[] arg2, Class arg3) {
        if (arg0 != 8) {
            this.field4501 = (class158) null;
        }
        return this.method1948(0, 0, 103, new Object[] { arg3, arg1, arg2 }, 8);
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(ILjava/net/URL;)Lsc;", line = 145)
    public final class158 method1945(int arg0, URL arg1) {
        int var3 = -103 % ((-arg0 - 21) / 45);
        return this.method1948(0, 0, 96, arg1, 4);
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(I)Lsc;", line = 153)
    public final class158 method1946(int arg0) {
        return arg0 == 20563 ? this.method1948(0, 0, 88, (Object) null, 5) : (class158) null;
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(ILjava/awt/Frame;)Lsc;", line = 166)
    public final class158 method1947(int arg0, Frame arg1) {
        return arg0 > -52 ? (class158) null : this.method1948(0, 0, 114, arg1, 7);
    }

    @OriginalMember(owner = "client!uo", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V", line = 513)
    public class274(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        field4513 = "Unknown";
        this.field4515 = arg0;
        field4505 = "1.1";
        try {
            field4513 = System.getProperty("java.vendor");
            field4505 = System.getProperty("java.version");
        } catch (Exception var20) {
        }
        try {
            field4503 = System.getProperty("os.name");
        } catch (Exception var19) {
            field4503 = "Unknown";
        }
        field4518 = field4503.toLowerCase();
        try {
            field4517 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var18) {
            field4517 = "";
        }
        try {
            field4508 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var17) {
            field4508 = "";
        }
        try {
            field4511 = System.getProperty("user.home");
            if (field4511 != null) {
                field4511 = field4511 + "/";
            }
        } catch (Exception var16) {
        }
        if (field4511 == null) {
            field4511 = "~/";
        }
        try {
            this.field4514 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var15) {
        }
        try {
            if (arg0 == null) {
                field4520 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field4520 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var14) {
        }
        try {
            if (arg0 == null) {
                field4521 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field4521 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var13) {
        }
        this.field4502 = false;
        this.field4512 = new Thread(this);
        this.field4512.setPriority(10);
        this.field4512.setDaemon(true);
        this.field4512.start();
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIILjava/lang/Object;I)Lsc;", line = 183)
    private final class158 method1948(int arg0, int arg1, int arg2, Object arg3, int arg4) {
        class158 var6 = new class158();
        var6.field2539 = arg3;
        if (arg2 < 82) {
            this.method1953((byte) 79);
        }
        var6.field2541 = arg0;
        var6.field2537 = arg4;
        synchronized (this) {
            if (this.field4510 == null) {
                this.field4510 = this.field4501 = var6;
            } else {
                this.field4510.field2540 = var6;
                this.field4510 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(BLjava/awt/Component;Z)Lsc;", line = 215)
    public final class158 method1949(byte arg0, Component arg1, boolean arg2) {
        int var4 = -68 / ((-arg0 - 57) / 61);
        return this.method1948(arg2 ? 1 : 0, 0, 117, arg1, 15);
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(Ljava/lang/String;II)Lsc;", line = 229)
    public final class158 method1950(String arg0, int arg1, int arg2) {
        int var4 = 119 / ((9 - arg2) / 50);
        return this.method1948(arg1, 0, 100, arg0, 1);
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(ZLjava/awt/datatransfer/Transferable;)Lsc;", line = 237)
    public final class158 method1951(boolean arg0, Transferable arg1) {
        if (!arg0) {
            this.field4507 = (class133[]) null;
        }
        return this.method1948(0, 0, 91, arg1, 19);
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(IILjava/lang/Runnable;)Lsc;", line = 247)
    public final class158 method1952(int arg0, int arg1, Runnable arg2) {
        if (arg0 != 0) {
            this.method1957(26, (String) null);
        }
        return this.method1948(arg1, 0, 122, arg2, 2);
    }

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "(B)Lfl;", line = 259)
    public final class354 method1953(byte arg0) {
        int var2 = -59 % ((26 - arg0) / 54);
        return this.field4504;
    }

    @OriginalMember(owner = "client!uo", name = "c", descriptor = "(B)Z", line = 277)
    public final boolean method1954(byte arg0) {
        if (arg0 <= 32) {
            this.method1940(-122, 32, -37, -108, (byte) 67);
        }
        return false;
    }

    @OriginalMember(owner = "client!uo", name = "run", descriptor = "()V", line = 292)
    public final void run() {
        while (true) {
            class158 var2;
            synchronized (this) {
                while (true) {
                    if (this.field4502) {
                        return;
                    }
                    if (this.field4501 != null) {
                        var2 = this.field4501;
                        this.field4501 = this.field4501.field2540;
                        if (this.field4501 == null) {
                            this.field4510 = null;
                        }
                        break;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var16) {
                    }
                }
            }
            try {
                int var5 = var2.field2537;
                if (var5 == 1) {
                    if (class19.method122(-12169) < field4522) {
                        throw new IOException();
                    }
                    var2.field2538 = new Socket(InetAddress.getByName((String) var2.field2539), var2.field2541);
                } else if (var5 == 2) {
                    Thread var11 = new Thread((Runnable) var2.field2539);
                    var11.setDaemon(true);
                    var11.start();
                    var11.setPriority(var2.field2541);
                    var2.field2538 = var11;
                } else if (var5 == 4) {
                    if (field4522 > class19.method122(-12169)) {
                        throw new IOException();
                    }
                    var2.field2538 = new DataInputStream(((URL) var2.field2539).openStream());
                } else if (var5 == 8) {
                    Object[] var6 = (Object[]) ((Object[]) var2.field2539);
                    var2.field2538 = ((Class) var6[0]).getDeclaredMethod((String) var6[1], (Class[]) ((Class[]) var6[2]));
                } else if (var5 == 9) {
                    Object[] var10 = (Object[]) ((Object[]) var2.field2539);
                    var2.field2538 = ((Class) var10[0]).getDeclaredField((String) var10[1]);
                } else if (var5 == 18) {
                    Clipboard var7 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var2.field2538 = var7.getContents((Object) null);
                } else if (var5 == 19) {
                    Transferable var8 = (Transferable) var2.field2539;
                    Clipboard var9 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var9.setContents(var8, (ClipboardOwner) null);
                } else {
                    throw new Exception();
                }
                var2.field2542 = 1;
            } catch (ThreadDeath var14) {
                throw var14;
            } catch (Throwable var15) {
                var2.field2542 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(Ljava/lang/Class;I)Lsc;", line = 407)
    public final class158 method1955(Class arg0, int arg1) {
        return arg1 >= -99 ? (class158) null : this.method1948(0, 0, 114, arg0, 20);
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(II)Lsc;", line = 418)
    public final class158 method1956(int arg0, int arg1) {
        return arg1 == 0 ? this.method1948(arg0, 0, arg1 + 125, (Object) null, 3) : (class158) null;
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(ILjava/lang/String;)Lsc;", line = 433)
    public final class158 method1957(int arg0, String arg1) {
        if (arg0 != 10) {
            this.method1941((Component) null, -59, 89, -15);
        }
        return this.method1948(0, 0, 115, arg1, 12);
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(BLjava/lang/Class;)Lsc;", line = 447)
    public final class158 method1958(byte arg0, Class arg1) {
        if (arg0 > -73) {
            this.field4501 = (class158) null;
        }
        return this.method1948(0, 0, 87, arg1, 10);
    }

    @OriginalMember(owner = "client!uo", name = "d", descriptor = "(B)V", line = 464)
    public final void method1959(byte arg0) {
        if (arg0 == 72) {
            field4522 = class19.method122(arg0 ^ 0xFFFFD03F) + 5000L;
        }
    }

    static {
        new Hashtable(16);
        field4522 = 0L;
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(Ljava/awt/Point;III[ILjava/awt/Component;)Lsc;", line = 481)
    public final class158 method1960(Point arg0, int arg1, int arg2, int arg3, int[] arg4, Component arg5) {
        return arg2 <= 68 ? (class158) null : this.method1948(arg3, arg1, 84, new Object[] { arg5, arg4, arg0 }, 17);
    }

    @OriginalMember(owner = "client!uo", name = "e", descriptor = "(B)Lsc;", line = 491)
    public final class158 method1961(byte arg0) {
        if (arg0 != 109) {
            this.method1958((byte) 74, (Class) null);
        }
        return this.method1948(0, 0, 96, (Object) null, 18);
    }
}
