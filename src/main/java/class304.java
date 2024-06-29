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

@OriginalClass("client!bd")
public class class304 implements Runnable {

    @OriginalMember(owner = "client!bd", name = "i", descriptor = "Ljava/applet/Applet;")
    public Applet field4117 = null;

    @OriginalMember(owner = "client!bd", name = "h", descriptor = "Lid;")
    private class242 field4116 = null;

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "Z")
    private boolean field4112 = false;

    @OriginalMember(owner = "client!bd", name = "n", descriptor = "Lid;")
    private class242 field4122 = null;

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "Lvk;")
    public class56 field4114 = null;

    @OriginalMember(owner = "client!bd", name = "o", descriptor = "Lvk;")
    public class56 field4123 = null;

    @OriginalMember(owner = "client!bd", name = "u", descriptor = "Lvk;")
    public class56 field4129 = null;

    @OriginalMember(owner = "client!bd", name = "g", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field4115;

    @OriginalMember(owner = "client!bd", name = "q", descriptor = "Ljava/lang/Thread;")
    private Thread field4125;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "I")
    public static int field4109 = 3;

    @OriginalMember(owner = "client!bd", name = "v", descriptor = "J")
    public static volatile long field4130;

    @OriginalMember(owner = "client!bd", name = "s", descriptor = "Lro;")
    private class250 field4127;

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "Ljava/lang/String;")
    public static String field4110;

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "Ljava/lang/String;")
    private static String field4111;

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "Ljava/lang/String;")
    public static String field4113;

    @OriginalMember(owner = "client!bd", name = "j", descriptor = "Ljava/lang/String;")
    public static String field4118;

    @OriginalMember(owner = "client!bd", name = "l", descriptor = "Ljava/lang/String;")
    public static String field4120;

    @OriginalMember(owner = "client!bd", name = "m", descriptor = "Ljava/lang/String;")
    public static String field4121;

    @OriginalMember(owner = "client!bd", name = "p", descriptor = "Ljava/lang/String;")
    public static String field4124;

    @OriginalMember(owner = "client!bd", name = "r", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field4126;

    @OriginalMember(owner = "client!bd", name = "t", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field4128;

    @OriginalMember(owner = "client!bd", name = "k", descriptor = "[Lvk;")
    public class56[] field4119;

    static {
        new Hashtable(16);
        field4130 = 0L;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Ljava/net/URL;I)Lid;", line = 3)
    public final class242 method1939(URL arg0, int arg1) {
        if (arg1 != 4) {
            this.method1945((Component) null, (byte) 97, -21, 106);
        }
        return this.method1962(4, arg0, 0, arg1 ^ 0x4, 0);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)Lid;", line = 18)
    public final class242 method1940(int arg0) {
        if (arg0 >= -103) {
            this.method1955(-124, (String) null, 105);
        }
        return this.method1962(5, (Object) null, 0, 0, 0);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILjava/lang/String;)Lid;", line = 28)
    public final class242 method1941(int arg0, String arg1) {
        if (arg0 != 21) {
            this.method1950(-28, 61, (Runnable) null);
        }
        return this.method1962(21, arg1, 0, 0, 0);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(BZLjava/awt/Component;)Lid;", line = 41)
    public final class242 method1942(byte arg0, boolean arg1, Component arg2) {
        if (arg0 > -18) {
            this.method1955(64, (String) null, 88);
        }
        return this.method1962(15, arg2, arg1 ? 1 : 0, 0, 0);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Ljava/lang/String;Z)[B", line = 54)
    public final byte[] method1943(String arg0, boolean arg1) {
        if (!arg1) {
            this.field4125 = null;
        }
        class242 var3 = this.method1946(0, 21, arg0, 0, (byte) -42);
        return (byte[]) var3.field3341;
    }

    @OriginalMember(owner = "client!bd", name = "run", descriptor = "()V", line = 69)
    public final void run() {
        while (true) {
            class242 var2;
            synchronized (this) {
                while (true) {
                    if (this.field4112) {
                        return;
                    }
                    if (this.field4116 != null) {
                        var2 = this.field4116;
                        this.field4116 = this.field4116.field3343;
                        if (this.field4116 == null) {
                            this.field4122 = null;
                        }
                        break;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var17) {
                    }
                }
            }
            try {
                int var3 = var2.field3344;
                if (var3 == 1) {
                    if (field4130 > class108.method902((byte) -93)) {
                        throw new IOException();
                    }
                    var2.field3341 = new Socket(InetAddress.getByName((String) var2.field3342), var2.field3340);
                } else if (var3 == 2) {
                    Thread var9 = new Thread((Runnable) var2.field3342);
                    var9.setDaemon(true);
                    var9.start();
                    var9.setPriority(var2.field3340);
                    var2.field3341 = var9;
                } else if (var3 == 4) {
                    if (field4130 > class108.method902((byte) -93)) {
                        throw new IOException();
                    }
                    var2.field3341 = new DataInputStream(((URL) var2.field3342).openStream());
                } else if (var3 == 8) {
                    Object[] var4 = (Object[]) var2.field3342;
                    var2.field3341 = ((Class) var4[0]).getDeclaredMethod((String) var4[1], (Class[]) var4[2]);
                } else if (var3 == 9) {
                    Object[] var8 = (Object[]) var2.field3342;
                    var2.field3341 = ((Class) var8[0]).getDeclaredField((String) var8[1]);
                } else if (var3 == 18) {
                    Clipboard var5 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var2.field3341 = var5.getContents((Object) null);
                } else if (var3 == 19) {
                    Transferable var6 = (Transferable) var2.field3342;
                    Clipboard var7 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var7.setContents(var6, (ClipboardOwner) null);
                } else {
                    throw new Exception("");
                }
                var2.field3345 = 1;
            } catch (ThreadDeath var15) {
                throw var15;
            } catch (Throwable var16) {
                var2.field3345 = 2;
            }
            synchronized (var2) {
                var2.notify();
            }
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(BLjava/lang/Class;)Lid;", line = 190)
    public final class242 method1944(byte arg0, Class arg1) {
        if (arg0 >= -70) {
            this.method1957(true);
        }
        return this.method1962(20, arg1, 0, 0, 0);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Ljava/awt/Component;BII)Lid;", line = 200)
    public final class242 method1945(Component arg0, byte arg1, int arg2, int arg3) {
        if (arg1 == -44) {
            Point var5 = arg0.getLocationOnScreen();
            return this.method1962(14, (Object) null, arg2 + var5.x, 0, var5.y + arg3);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IILjava/lang/Object;IB)Lid;", line = 212)
    private final class242 method1946(int arg0, int arg1, Object arg2, int arg3, byte arg4) {
        class242 var6 = new class242();
        synchronized (var6) {
            var6.field3340 = arg3;
            var6.field3342 = arg2;
            var6.field3344 = arg1;
            synchronized (this) {
                if (this.field4122 == null) {
                    this.field4122 = this.field4116 = var6;
                } else {
                    this.field4122.field3343 = var6;
                    this.field4122 = var6;
                }
                if (arg4 != -42) {
                    field4120 = null;
                }
                this.notify();
            }
            try {
                var6.wait();
            } catch (InterruptedException var9) {
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)Lid;", line = 250)
    public final class242 method1947(byte arg0) {
        return arg0 == -41 ? this.method1962(13, (Object) null, 0, 0, 0) : null;
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(B)Z", line = 267)
    public final boolean method1948(byte arg0) {
        if (arg0 != -53) {
            field4113 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILjava/lang/Class;)Lid;", line = 284)
    public final class242 method1949(int arg0, Class arg1) {
        if (arg0 != 0) {
            this.method1946(48, 61, (Object) null, 60, (byte) -92);
        }
        return this.method1962(10, arg1, 0, arg0, 0);
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V", line = 590)
    public class304(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        field4118 = "1.1";
        field4121 = "Unknown";
        this.field4117 = arg0;
        try {
            field4121 = System.getProperty("java.vendor");
            field4118 = System.getProperty("java.version");
        } catch (Exception var12) {
        }
        try {
            field4110 = System.getProperty("os.name");
        } catch (Exception var11) {
            field4110 = "Unknown";
        }
        field4113 = field4110.toLowerCase();
        try {
            field4120 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var10) {
            field4120 = "";
        }
        try {
            field4124 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var9) {
            field4124 = "";
        }
        try {
            field4111 = System.getProperty("user.home");
            if (field4111 != null) {
                field4111 = field4111 + "/";
            }
        } catch (Exception var8) {
        }
        if (field4111 == null) {
            field4111 = "~/";
        }
        try {
            this.field4115 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var7) {
        }
        try {
            if (arg0 == null) {
                field4128 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field4128 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        try {
            if (arg0 == null) {
                field4126 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field4126 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var5) {
        }
        this.field4112 = false;
        this.field4125 = new Thread(this);
        this.field4125.setPriority(10);
        this.field4125.setDaemon(true);
        this.field4125.start();
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IILjava/lang/Runnable;)Lid;", line = 299)
    public final class242 method1950(int arg0, int arg1, Runnable arg2) {
        int var4 = -7 / ((arg0 - 29) / 45);
        return this.method1962(2, arg2, arg1, 0, 0);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Ljava/awt/Frame;I)Lid;", line = 309)
    public final class242 method1951(Frame arg0, int arg1) {
        return arg1 == 0 ? this.method1962(7, arg0, 0, 0, 0) : null;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(BIIII)Lid;", line = 321)
    public final class242 method1952(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 <= 108) {
            field4130 = -49L;
        }
        return this.method1962(6, (Object) null, (arg4 << 16) + arg1, 0, (arg3 << 16) + arg2);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(II)Lid;", line = 339)
    public final class242 method1953(int arg0, int arg1) {
        if (arg0 != 28006) {
            this.method1940(-34);
        }
        return this.method1962(3, (Object) null, arg1, 0, 0);
    }

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "(B)V", line = 351)
    public final void method1954(byte arg0) {
        if (arg0 < 78) {
            this.field4119 = null;
        }
        field4130 = class108.method902((byte) -93) + 5000L;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILjava/lang/String;I)Lid;", line = 361)
    public final class242 method1955(int arg0, String arg1, int arg2) {
        return arg2 >= -16 ? null : this.method1962(1, arg1, arg0, 0, 0);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILjava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;)Lid;", line = 372)
    public final class242 method1956(int arg0, String arg1, Class[] arg2, Class arg3) {
        if (arg0 != 8156) {
            this.method1939((URL) null, -45);
        }
        return this.method1962(8, new Object[] { arg3, arg1, arg2 }, 0, 0, 0);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Z)Lro;", line = 384)
    public final class250 method1957(boolean arg0) {
        return arg0 ? this.field4127 : null;
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(I)Lid;", line = 397)
    public final class242 method1958(int arg0) {
        if (arg0 != -8476) {
            field4128 = null;
        }
        return this.method1962(18, (Object) null, 0, 0, 0);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;I)Lid;", line = 411)
    public final class242 method1959(Class arg0, String arg1, int arg2) {
        return arg2 == 0 ? this.method1962(9, new Object[] { arg0, arg1 }, 0, 0, 0) : null;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Ljava/awt/datatransfer/Transferable;B)Lid;", line = 426)
    public final class242 method1960(Transferable arg0, byte arg1) {
        if (arg1 != -80) {
            this.method1959((Class) null, (String) null, -60);
        }
        return this.method1962(19, arg0, 0, 0, 0);
    }

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "(I)Lid;", line = 449)
    public final class242 method1961(int arg0) {
        if (arg0 != 12) {
            this.field4129 = null;
        }
        return this.method1962(12, (Object) null, 0, arg0 ^ 0xC, 0);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILjava/lang/Object;III)Lid;", line = 468)
    private final class242 method1962(int arg0, Object arg1, int arg2, int arg3, int arg4) {
        class242 var6 = new class242();
        var6.field3340 = arg2;
        if (arg3 != 0) {
            return null;
        }
        var6.field3344 = arg0;
        var6.field3342 = arg1;
        synchronized (this) {
            if (this.field4122 == null) {
                this.field4122 = this.field4116 = var6;
            } else {
                this.field4122.field3343 = var6;
                this.field4122 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Ljava/lang/Class;I)Lid;", line = 498)
    public final class242 method1963(Class arg0, int arg1) {
        if (arg1 > -4) {
            this.field4127 = null;
        }
        return this.method1962(11, arg0, 0, 0, 0);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IILjava/awt/Point;I[ILjava/awt/Component;)Lid;", line = 513)
    public final class242 method1964(int arg0, int arg1, Point arg2, int arg3, int[] arg4, Component arg5) {
        if (arg3 != 0) {
            this.field4129 = null;
        }
        return this.method1962(17, new Object[] { arg5, arg4, arg2 }, arg1, 0, arg0);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Ljava/lang/String;B)Lid;", line = 527)
    public final class242 method1965(String arg0, byte arg1) {
        if (arg1 != 23) {
            field4118 = null;
        }
        return this.method1962(16, arg0, 0, 0, 0);
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(Z)V", line = 537)
    public final void method1966(boolean arg0) {
        synchronized (this) {
            this.field4112 = arg0;
            this.notifyAll();
        }
        try {
            this.field4125.join();
        } catch (InterruptedException var8) {
        }
        if (this.field4123 != null) {
            try {
                this.field4123.method526(-19635);
            } catch (IOException var7) {
            }
        }
        if (this.field4114 != null) {
            try {
                this.field4114.method526(-19635);
            } catch (IOException var6) {
            }
        }
        if (this.field4119 != null) {
            for (int var3 = 0; var3 < this.field4119.length; var3++) {
                if (this.field4119[var3] != null) {
                    try {
                        this.field4119[var3].method526(-19635);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field4129 != null) {
            try {
                this.field4129.method526(-19635);
            } catch (IOException var4) {
            }
        }
    }
}
