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

@OriginalClass("client!lh")
public class class450 implements Runnable {

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "Ldj;")
    private class304 field6534 = null;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "Ljava/applet/Applet;")
    public Applet field6532 = null;

    @OriginalMember(owner = "client!lh", name = "f", descriptor = "Lvk;")
    public class55 field6537 = null;

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "Lvk;")
    public class55 field6533 = null;

    @OriginalMember(owner = "client!lh", name = "m", descriptor = "Ldj;")
    private class304 field6544 = null;

    @OriginalMember(owner = "client!lh", name = "n", descriptor = "Lvk;")
    public class55 field6545 = null;

    @OriginalMember(owner = "client!lh", name = "p", descriptor = "Z")
    private boolean field6547 = false;

    @OriginalMember(owner = "client!lh", name = "v", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field6553;

    @OriginalMember(owner = "client!lh", name = "q", descriptor = "Ljava/lang/Thread;")
    private Thread field6548;

    @OriginalMember(owner = "client!lh", name = "r", descriptor = "I")
    public static int field6549 = 3;

    @OriginalMember(owner = "client!lh", name = "s", descriptor = "J")
    public static volatile long field6550;

    @OriginalMember(owner = "client!lh", name = "k", descriptor = "Lpl;")
    private class446 field6542;

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "Ljava/lang/String;")
    public static String field6535;

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "Ljava/lang/String;")
    private static String field6536;

    @OriginalMember(owner = "client!lh", name = "h", descriptor = "Ljava/lang/String;")
    public static String field6539;

    @OriginalMember(owner = "client!lh", name = "i", descriptor = "Ljava/lang/String;")
    public static String field6540;

    @OriginalMember(owner = "client!lh", name = "j", descriptor = "Ljava/lang/String;")
    public static String field6541;

    @OriginalMember(owner = "client!lh", name = "l", descriptor = "Ljava/lang/String;")
    public static String field6543;

    @OriginalMember(owner = "client!lh", name = "o", descriptor = "Ljava/lang/String;")
    public static String field6546;

    @OriginalMember(owner = "client!lh", name = "t", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field6551;

    @OriginalMember(owner = "client!lh", name = "u", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field6552;

    @OriginalMember(owner = "client!lh", name = "g", descriptor = "[Lvk;")
    public class55[] field6538;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIBILjava/lang/Object;)Ldj;")
    private final class304 method2772(int arg0, int arg1, byte arg2, int arg3, Object arg4) {
        class304 var6 = new class304();
        var6.field4127 = arg4;
        if (arg2 != -66) {
            this.field6545 = null;
        }
        var6.field4128 = arg0;
        var6.field4124 = arg1;
        synchronized (this) {
            if (this.field6534 == null) {
                this.field6534 = this.field6544 = var6;
            } else {
                this.field6534.field4125 = var6;
                this.field6534 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Z)V")
    public final void method2773(boolean arg0) {
        field6550 = class442.method2730(25207) + 5000L;
        if (arg0) {
            this.method2772(28, 60, (byte) -97, -109, (Object) null);
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Ljava/net/URL;I)Ldj;")
    public final class304 method2774(URL arg0, int arg1) {
        if (arg1 != 26648) {
            this.field6544 = null;
        }
        return this.method2772(4, 0, (byte) -66, 0, arg0);
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Ljava/awt/datatransfer/Transferable;I)Ldj;")
    public final class304 method2775(Transferable arg0, int arg1) {
        return arg1 > -112 ? null : this.method2772(19, 0, (byte) -66, 0, arg0);
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Ljava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;I)Ldj;")
    public final class304 method2776(String arg0, Class[] arg1, Class arg2, int arg3) {
        if (arg3 != 0) {
            this.method2773(false);
        }
        return this.method2772(8, 0, (byte) -66, 0, new Object[] { arg2, arg0, arg1 });
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(BLjava/lang/String;)Ldj;")
    public final class304 method2777(byte arg0, String arg1) {
        if (arg0 != -36) {
            this.field6537 = null;
        }
        return this.method2772(16, 0, (byte) -66, 0, arg1);
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(ILjava/lang/Class;)Ldj;")
    public final class304 method2778(int arg0, Class arg1) {
        if (arg0 < 117) {
            field6550 = -48L;
        }
        return this.method2772(10, 0, (byte) -66, 0, arg1);
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)Ldj;")
    public final class304 method2779(int arg0) {
        if (arg0 != 12178) {
            this.field6542 = null;
        }
        return this.method2772(13, 0, (byte) -66, 0, (Object) null);
    }

    @OriginalMember(owner = "client!lh", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class304 var2;
            synchronized (this) {
                while (true) {
                    if (this.field6547) {
                        return;
                    }
                    if (this.field6544 != null) {
                        var2 = this.field6544;
                        this.field6544 = this.field6544.field4125;
                        if (this.field6544 == null) {
                            this.field6534 = null;
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
                int var3 = var2.field4128;
                if (var3 == 1) {
                    if (class442.method2730(25207) < field6550) {
                        throw new IOException();
                    }
                    var2.field4126 = new Socket(InetAddress.getByName((String) var2.field4127), var2.field4124);
                } else if (var3 == 2) {
                    Thread var4 = new Thread((Runnable) var2.field4127);
                    var4.setDaemon(true);
                    var4.start();
                    var4.setPriority(var2.field4124);
                    var2.field4126 = var4;
                } else if (var3 == 4) {
                    if (class442.method2730(25207) < field6550) {
                        throw new IOException();
                    }
                    var2.field4126 = new DataInputStream(((URL) var2.field4127).openStream());
                } else if (var3 == 8) {
                    Object[] var5 = (Object[]) var2.field4127;
                    var2.field4126 = ((Class) var5[0]).getDeclaredMethod((String) var5[1], (Class[]) var5[2]);
                } else if (var3 == 9) {
                    Object[] var9 = (Object[]) var2.field4127;
                    var2.field4126 = ((Class) var9[0]).getDeclaredField((String) var9[1]);
                } else if (var3 == 18) {
                    Clipboard var6 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var2.field4126 = var6.getContents((Object) null);
                } else if (var3 == 19) {
                    Transferable var7 = (Transferable) var2.field4127;
                    Clipboard var8 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var8.setContents(var7, (ClipboardOwner) null);
                } else {
                    throw new Exception("");
                }
                var2.field4123 = 1;
            } catch (ThreadDeath var15) {
                throw var15;
            } catch (Throwable var16) {
                var2.field4123 = 2;
            }
            synchronized (var2) {
                var2.notify();
            }
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(ZILjava/awt/Component;)Ldj;")
    public final class304 method2780(boolean arg0, int arg1, Component arg2) {
        int var4 = 36 / ((arg1 + 46) / 60);
        return this.method2772(15, arg0 ? 1 : 0, (byte) -66, 0, arg2);
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(BLjava/awt/Frame;)Ldj;")
    public final class304 method2781(byte arg0, Frame arg1) {
        int var3 = -64 / ((arg0 + 51) / 43);
        return this.method2772(7, 0, (byte) -66, 0, arg1);
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(I)Ldj;")
    public final class304 method2782(int arg0) {
        if (arg0 != 5) {
            this.field6553 = null;
        }
        return this.method2772(5, 0, (byte) -66, 0, (Object) null);
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IILjava/lang/String;)Ldj;")
    public final class304 method2783(int arg0, int arg1, String arg2) {
        return arg1 == 0 ? this.method2772(1, arg0, (byte) -66, 0, arg2) : null;
    }

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "(I)Lpl;")
    public final class446 method2784(int arg0) {
        if (arg0 != 19) {
            field6540 = null;
        }
        return this.field6542;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIILjava/awt/Component;)Ldj;")
    public final class304 method2785(int arg0, int arg1, int arg2, Component arg3) {
        if (arg0 != 14736) {
            this.method2774((URL) null, 68);
        }
        Point var5 = arg3.getLocationOnScreen();
        return this.method2772(14, var5.x + arg1, (byte) -66, var5.y + arg2, (Object) null);
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIIII)Ldj;")
    public final class304 method2786(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != 1414295824) {
            this.field6545 = null;
        }
        return this.method2772(6, (arg2 << 16) + arg4, (byte) -66, (arg3 << 16) + arg1, (Object) null);
    }

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "(I)Ldj;")
    public final class304 method2787(int arg0) {
        if (arg0 > -84) {
            field6543 = null;
        }
        return this.method2772(12, 0, (byte) -66, 0, (Object) null);
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Ljava/lang/Runnable;II)Ldj;")
    public final class304 method2788(Runnable arg0, int arg1, int arg2) {
        int var4 = -17 / ((arg2 + 36) / 33);
        return this.method2772(2, arg1, (byte) -66, 0, arg0);
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(B)V")
    public final void method2789(byte arg0) {
        synchronized (this) {
            this.field6547 = true;
            this.notifyAll();
        }
        try {
            this.field6548.join();
        } catch (InterruptedException var8) {
        }
        if (this.field6533 != null) {
            try {
                this.field6533.method285(0);
            } catch (IOException var7) {
            }
        }
        if (arg0 != 108) {
            this.field6553 = null;
        }
        if (this.field6537 != null) {
            try {
                this.field6537.method285(0);
            } catch (IOException var6) {
            }
        }
        if (this.field6538 != null) {
            for (int var3 = 0; var3 < this.field6538.length; var3++) {
                if (this.field6538[var3] != null) {
                    try {
                        this.field6538[var3].method285(arg0 - 108);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field6545 != null) {
            try {
                this.field6545.method285(0);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IILjava/lang/Object;IZ)Ldj;")
    private final class304 method2790(int arg0, int arg1, Object arg2, int arg3, boolean arg4) {
        class304 var6 = new class304();
        synchronized (var6) {
            var6.field4128 = arg0;
            var6.field4127 = arg2;
            var6.field4124 = arg1;
            if (!arg4) {
                return null;
            }
            synchronized (this) {
                if (this.field6534 == null) {
                    this.field6534 = this.field6544 = var6;
                } else {
                    this.field6534.field4125 = var6;
                    this.field6534 = var6;
                }
                this.notify();
            }
            try {
                var6.wait();
            } catch (InterruptedException var12) {
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(ZLjava/lang/String;)Ldj;")
    public final class304 method2791(boolean arg0, String arg1) {
        return arg0 ? null : this.method2772(21, 0, (byte) -66, 0, arg1);
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(II)Ldj;")
    public final class304 method2792(int arg0, int arg1) {
        if (arg1 != -34) {
            this.field6548 = null;
        }
        return this.method2772(3, arg0, (byte) -66, 0, (Object) null);
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(B)Ldj;")
    public final class304 method2793(byte arg0) {
        int var2 = 60 / ((arg0 + 55) / 50);
        return this.method2772(18, 0, (byte) -66, 0, (Object) null);
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(ILjava/lang/Class;)Ldj;")
    public final class304 method2794(int arg0, Class arg1) {
        return arg0 == 200 ? this.method2772(11, 0, (byte) -66, 0, arg1) : null;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Ljava/lang/Class;I)Ldj;")
    public final class304 method2795(Class arg0, int arg1) {
        if (arg1 != 21) {
            this.method2797((byte) -83, (String) null);
        }
        return this.method2772(20, 0, (byte) -66, 0, arg0);
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(Z)Z")
    public final boolean method2796(boolean arg0) {
        if (arg0) {
            this.method2774((URL) null, -109);
        }
        return false;
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(BLjava/lang/String;)[B")
    public final byte[] method2797(byte arg0, String arg1) {
        int var3 = 126 % ((29 - arg0) / 48);
        class304 var4 = this.method2790(21, 0, arg1, 0, true);
        return (byte[]) var4.field4126;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;I)Ldj;")
    public final class304 method2798(Class arg0, String arg1, int arg2) {
        return arg2 == -19372 ? this.method2772(9, 0, (byte) -66, 0, new Object[] { arg0, arg1 }) : null;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(II[IILjava/awt/Component;Ljava/awt/Point;)Ldj;")
    public final class304 method2799(int arg0, int arg1, int[] arg2, int arg3, Component arg4, Point arg5) {
        if (arg1 > -112) {
            this.method2799(-2, 101, (int[]) null, 107, (Component) null, (Point) null);
        }
        return this.method2772(17, arg3, (byte) -66, arg0, new Object[] { arg4, arg2, arg5 });
    }

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
    public class450(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        field6535 = "Unknown";
        field6541 = "1.1";
        this.field6532 = arg0;
        try {
            field6535 = System.getProperty("java.vendor");
            field6541 = System.getProperty("java.version");
        } catch (Exception var12) {
        }
        try {
            field6543 = System.getProperty("os.name");
        } catch (Exception var11) {
            field6543 = "Unknown";
        }
        field6539 = field6543.toLowerCase();
        try {
            field6540 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var10) {
            field6540 = "";
        }
        try {
            field6546 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var9) {
            field6546 = "";
        }
        try {
            field6536 = System.getProperty("user.home");
            if (field6536 != null) {
                field6536 = field6536 + "/";
            }
        } catch (Exception var8) {
        }
        if (field6536 == null) {
            field6536 = "~/";
        }
        try {
            this.field6553 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var7) {
        }
        try {
            if (arg0 == null) {
                field6552 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field6552 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        try {
            if (arg0 == null) {
                field6551 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field6551 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var5) {
        }
        this.field6547 = false;
        this.field6548 = new Thread(this);
        this.field6548.setPriority(10);
        this.field6548.setDaemon(true);
        this.field6548.start();
    }

    static {
        new Hashtable(16);
        field6550 = 0L;
    }
}
