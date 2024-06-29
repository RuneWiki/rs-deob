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

@OriginalClass("client!sc")
public class class239 implements Runnable {

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "Lbl;")
    private class211 field3576 = null;

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "Lvn;")
    public class235 field3578 = null;

    @OriginalMember(owner = "client!sc", name = "l", descriptor = "Lbl;")
    private class211 field3582 = null;

    @OriginalMember(owner = "client!sc", name = "m", descriptor = "Ljava/applet/Applet;")
    public Applet field3583 = null;

    @OriginalMember(owner = "client!sc", name = "o", descriptor = "Z")
    private boolean field3585 = false;

    @OriginalMember(owner = "client!sc", name = "q", descriptor = "Lvn;")
    public class235 field3587 = null;

    @OriginalMember(owner = "client!sc", name = "s", descriptor = "Lvn;")
    public class235 field3589 = null;

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field3573;

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "Ljava/lang/Thread;")
    private Thread field3577;

    @OriginalMember(owner = "client!sc", name = "n", descriptor = "I")
    public static int field3584 = 3;

    @OriginalMember(owner = "client!sc", name = "u", descriptor = "J")
    public static volatile long field3591;

    @OriginalMember(owner = "client!sc", name = "j", descriptor = "Lea;")
    private class101 field3580;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "Ljava/lang/String;")
    public static String field3571;

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "Ljava/lang/String;")
    public static String field3574;

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "Ljava/lang/String;")
    public static String field3575;

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "Ljava/lang/String;")
    public static String field3579;

    @OriginalMember(owner = "client!sc", name = "k", descriptor = "Ljava/lang/String;")
    public static String field3581;

    @OriginalMember(owner = "client!sc", name = "p", descriptor = "Ljava/lang/String;")
    private static String field3586;

    @OriginalMember(owner = "client!sc", name = "r", descriptor = "Ljava/lang/String;")
    public static String field3588;

    @OriginalMember(owner = "client!sc", name = "t", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field3590;

    @OriginalMember(owner = "client!sc", name = "v", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field3592;

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "[Lvn;")
    public class235[] field3572;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Z)Z")
    public final boolean method1437(boolean arg0) {
        if (!arg0) {
            this.method1445(123, (String) null, (Class[]) null, (Class) null);
        }
        return false;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ZILjava/lang/Runnable;)Lbl;")
    public final class211 method1438(boolean arg0, int arg1, Runnable arg2) {
        return arg0 ? null : this.method1455(0, 2, false, arg1, arg2);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Ljava/net/URL;B)Lbl;")
    public final class211 method1439(URL arg0, byte arg1) {
        if (arg1 != 65) {
            this.field3583 = null;
        }
        return this.method1455(0, 4, false, 0, arg0);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(BLjava/lang/Class;)Lbl;")
    public final class211 method1440(byte arg0, Class arg1) {
        if (arg0 != 85) {
            this.method1451(false);
        }
        return this.method1455(0, 11, false, 0, arg1);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Ljava/awt/Point;[IZIILjava/awt/Component;)Lbl;")
    public final class211 method1441(Point arg0, int[] arg1, boolean arg2, int arg3, int arg4, Component arg5) {
        if (!arg2) {
            field3591 = 99L;
        }
        return this.method1455(arg4, 17, false, arg3, new Object[] { arg5, arg1, arg0 });
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Ljava/awt/datatransfer/Transferable;B)Lbl;")
    public final class211 method1442(Transferable arg0, byte arg1) {
        if (arg1 >= -45) {
            field3571 = null;
        }
        return this.method1455(0, 19, false, 0, arg0);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(BLjava/awt/Frame;)Lbl;")
    public final class211 method1443(byte arg0, Frame arg1) {
        if (arg0 != -29) {
            this.method1440((byte) -45, (Class) null);
        }
        return this.method1455(0, 7, false, 0, arg1);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)Lbl;")
    public final class211 method1444(int arg0) {
        if (arg0 != 21) {
            this.method1438(true, -106, (Runnable) null);
        }
        return this.method1455(0, 18, false, 0, (Object) null);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILjava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;)Lbl;")
    public final class211 method1445(int arg0, String arg1, Class[] arg2, Class arg3) {
        if (arg0 != 0) {
            this.method1455(-10, -2, true, 1, (Object) null);
        }
        return this.method1455(0, 8, false, 0, new Object[] { arg3, arg1, arg2 });
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(I)Lea;")
    public final class101 method1446(int arg0) {
        if (arg0 != -31623) {
            this.method1445(112, (String) null, (Class[]) null, (Class) null);
        }
        return this.field3580;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IILjava/awt/Component;B)Lbl;")
    public final class211 method1447(int arg0, int arg1, Component arg2, byte arg3) {
        Point var5 = arg2.getLocationOnScreen();
        if (arg3 != -73) {
            this.field3578 = null;
        }
        return this.method1455(var5.y + arg1, 14, false, var5.x + arg0, (Object) null);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)Lbl;")
    public final class211 method1448(byte arg0) {
        if (arg0 > -85) {
            this.run();
        }
        return this.method1455(0, 12, false, 0, (Object) null);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IZ)Lbl;")
    public final class211 method1449(int arg0, boolean arg1) {
        if (arg1) {
            field3574 = null;
        }
        return this.method1455(0, 3, false, arg0, (Object) null);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(BILjava/lang/String;)Lbl;")
    public final class211 method1450(byte arg0, int arg1, String arg2) {
        if (arg0 != -71) {
            this.method1438(true, 108, (Runnable) null);
        }
        return this.method1455(0, 1, false, arg1, arg2);
    }

    @OriginalMember(owner = "client!sc", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class211 var2;
            synchronized (this) {
                while (true) {
                    if (this.field3585) {
                        return;
                    }
                    if (this.field3576 != null) {
                        var2 = this.field3576;
                        this.field3576 = this.field3576.field3174;
                        if (this.field3576 == null) {
                            this.field3582 = null;
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
                int var3 = var2.field3173;
                if (var3 == 1) {
                    if (field3591 > class445.method2750(-27580)) {
                        throw new IOException();
                    }
                    var2.field3175 = new Socket(InetAddress.getByName((String) var2.field3176), var2.field3177);
                } else if (var3 == 2) {
                    Thread var9 = new Thread((Runnable) var2.field3176);
                    var9.setDaemon(true);
                    var9.start();
                    var9.setPriority(var2.field3177);
                    var2.field3175 = var9;
                } else if (var3 == 4) {
                    if (field3591 > class445.method2750(-27580)) {
                        throw new IOException();
                    }
                    var2.field3175 = new DataInputStream(((URL) var2.field3176).openStream());
                } else if (var3 == 8) {
                    Object[] var4 = (Object[]) var2.field3176;
                    var2.field3175 = ((Class) var4[0]).getDeclaredMethod((String) var4[1], (Class[]) var4[2]);
                } else if (var3 == 9) {
                    Object[] var5 = (Object[]) var2.field3176;
                    var2.field3175 = ((Class) var5[0]).getDeclaredField((String) var5[1]);
                } else if (var3 == 18) {
                    Clipboard var8 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var2.field3175 = var8.getContents((Object) null);
                } else if (var3 == 19) {
                    Transferable var6 = (Transferable) var2.field3176;
                    Clipboard var7 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var7.setContents(var6, (ClipboardOwner) null);
                } else {
                    throw new Exception("");
                }
                var2.field3172 = 1;
            } catch (ThreadDeath var15) {
                throw var15;
            } catch (Throwable var16) {
                var2.field3172 = 2;
            }
            synchronized (var2) {
                var2.notify();
            }
        }
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(Z)V")
    public final void method1451(boolean arg0) {
        if (arg0) {
            this.field3587 = null;
        }
        field3591 = class445.method2750(-27580) + 5000L;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Ljava/lang/Class;I)Lbl;")
    public final class211 method1452(Class arg0, int arg1) {
        if (arg1 != 0) {
            field3574 = null;
        }
        return this.method1455(0, 20, false, 0, arg0);
    }

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "(I)Lbl;")
    public final class211 method1453(int arg0) {
        return arg0 == 19204 ? this.method1455(0, 13, false, 0, (Object) null) : null;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Ljava/lang/Object;IIII)Lbl;")
    private final class211 method1454(Object arg0, int arg1, int arg2, int arg3, int arg4) {
        class211 var6 = new class211();
        synchronized (var6) {
            var6.field3173 = arg3;
            var6.field3176 = arg0;
            var6.field3177 = arg4;
            synchronized (this) {
                if (this.field3582 == null) {
                    this.field3582 = this.field3576 = var6;
                } else {
                    this.field3582.field3174 = var6;
                    this.field3582 = var6;
                }
                this.notify();
            }
            try {
                var6.wait();
            } catch (InterruptedException var9) {
            }
        }
        if (arg2 != 21) {
            this.method1463((String) null, -118);
        }
        return var6;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIZILjava/lang/Object;)Lbl;")
    private final class211 method1455(int arg0, int arg1, boolean arg2, int arg3, Object arg4) {
        class211 var6 = new class211();
        var6.field3177 = arg3;
        if (arg2) {
            return null;
        }
        var6.field3173 = arg1;
        var6.field3176 = arg4;
        synchronized (this) {
            if (this.field3582 == null) {
                this.field3582 = this.field3576 = var6;
            } else {
                this.field3582.field3174 = var6;
                this.field3582 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Ljava/lang/String;Z)Lbl;")
    public final class211 method1456(String arg0, boolean arg1) {
        if (arg1) {
            this.method1454((Object) null, 61, -114, 33, 60);
        }
        return this.method1455(0, 21, false, 0, arg0);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILjava/lang/Class;)Lbl;")
    public final class211 method1457(int arg0, Class arg1) {
        if (arg0 != -11733) {
            this.field3573 = null;
        }
        return this.method1455(0, 10, false, 0, arg1);
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(Ljava/lang/String;Z)Lbl;")
    public final class211 method1458(String arg0, boolean arg1) {
        if (!arg1) {
            field3591 = -86L;
        }
        return this.method1455(0, 16, false, 0, arg0);
    }

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "(I)V")
    public final void method1459(int arg0) {
        synchronized (this) {
            this.field3585 = true;
            this.notifyAll();
        }
        try {
            if (arg0 != 0) {
                return;
            }
            this.field3577.join();
        } catch (InterruptedException var8) {
        }
        if (this.field3587 != null) {
            try {
                this.field3587.method1420((byte) 73);
            } catch (IOException var7) {
            }
        }
        if (this.field3578 != null) {
            try {
                this.field3578.method1420((byte) 73);
            } catch (IOException var6) {
            }
        }
        if (this.field3572 != null) {
            for (int var3 = 0; var3 < this.field3572.length; var3++) {
                if (this.field3572[var3] != null) {
                    try {
                        this.field3572[var3].method1420((byte) 73);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field3589 != null) {
            try {
                this.field3589.method1420((byte) 73);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(B)Lbl;")
    public final class211 method1460(byte arg0) {
        int var2 = 1 / ((1 - arg0) / 44);
        return this.method1455(0, 5, false, 0, (Object) null);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Ljava/awt/Component;IZ)Lbl;")
    public final class211 method1461(Component arg0, int arg1, boolean arg2) {
        return arg1 == 15 ? this.method1455(0, 15, false, arg2 ? 1 : 0, arg0) : null;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Class;)Lbl;")
    public final class211 method1462(int arg0, String arg1, Class arg2) {
        if (arg0 != 0) {
            this.method1440((byte) 19, (Class) null);
        }
        return this.method1455(0, 9, false, 0, new Object[] { arg2, arg1 });
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Ljava/lang/String;I)[B")
    public final byte[] method1463(String arg0, int arg1) {
        int var3 = 59 % ((arg1 - 31) / 46);
        class211 var4 = this.method1454(arg0, 0, 21, 21, 0);
        return (byte[]) var4.field3175;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIIB)Lbl;")
    public final class211 method1464(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        return arg4 == -36 ? this.method1455((arg0 << 16) + arg3, 6, false, (arg1 << 16) + arg2, (Object) null) : null;
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
    public class239(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        this.field3583 = arg0;
        field3575 = "Unknown";
        field3571 = "1.1";
        try {
            field3575 = System.getProperty("java.vendor");
            field3571 = System.getProperty("java.version");
        } catch (Exception var12) {
        }
        try {
            field3588 = System.getProperty("os.name");
        } catch (Exception var11) {
            field3588 = "Unknown";
        }
        field3574 = field3588.toLowerCase();
        try {
            field3581 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var10) {
            field3581 = "";
        }
        try {
            field3579 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var9) {
            field3579 = "";
        }
        try {
            field3586 = System.getProperty("user.home");
            if (field3586 != null) {
                field3586 = field3586 + "/";
            }
        } catch (Exception var8) {
        }
        if (field3586 == null) {
            field3586 = "~/";
        }
        try {
            this.field3573 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var7) {
        }
        try {
            if (arg0 == null) {
                field3590 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field3590 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        try {
            if (arg0 == null) {
                field3592 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field3592 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var5) {
        }
        this.field3585 = false;
        this.field3577 = new Thread(this);
        this.field3577.setPriority(10);
        this.field3577.setDaemon(true);
        this.field3577.start();
    }

    static {
        new Hashtable(16);
        field3591 = 0L;
    }
}
