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

@OriginalClass("client!vj")
public class class177 implements Runnable {

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "Lue;")
    private class131 field2634 = null;

    @OriginalMember(owner = "client!vj", name = "f", descriptor = "Ljava/applet/Applet;")
    public Applet field2639 = null;

    @OriginalMember(owner = "client!vj", name = "h", descriptor = "Lum;")
    public class184 field2641 = null;

    @OriginalMember(owner = "client!vj", name = "k", descriptor = "Z")
    private boolean field2644 = false;

    @OriginalMember(owner = "client!vj", name = "r", descriptor = "Lum;")
    public class184 field2651 = null;

    @OriginalMember(owner = "client!vj", name = "p", descriptor = "Lum;")
    public class184 field2649 = null;

    @OriginalMember(owner = "client!vj", name = "n", descriptor = "Lue;")
    private class131 field2647 = null;

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field2638;

    @OriginalMember(owner = "client!vj", name = "q", descriptor = "Ljava/lang/Thread;")
    private Thread field2650;

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "I")
    public static int field2636 = 3;

    @OriginalMember(owner = "client!vj", name = "u", descriptor = "J")
    public static volatile long field2654;

    @OriginalMember(owner = "client!vj", name = "o", descriptor = "Lpg;")
    private class112 field2648;

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "Ljava/lang/String;")
    public static String field2635;

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "Ljava/lang/String;")
    private static String field2637;

    @OriginalMember(owner = "client!vj", name = "g", descriptor = "Ljava/lang/String;")
    public static String field2640;

    @OriginalMember(owner = "client!vj", name = "j", descriptor = "Ljava/lang/String;")
    public static String field2643;

    @OriginalMember(owner = "client!vj", name = "l", descriptor = "Ljava/lang/String;")
    public static String field2645;

    @OriginalMember(owner = "client!vj", name = "m", descriptor = "Ljava/lang/String;")
    public static String field2646;

    @OriginalMember(owner = "client!vj", name = "s", descriptor = "Ljava/lang/String;")
    public static String field2652;

    @OriginalMember(owner = "client!vj", name = "t", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field2653;

    @OriginalMember(owner = "client!vj", name = "v", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field2655;

    @OriginalMember(owner = "client!vj", name = "i", descriptor = "[Lum;")
    public class184[] field2642;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(B)Lue;")
    public final class131 method1366(byte arg0) {
        return arg0 == 41 ? this.method1385(5, 24336, 0, 0, (Object) null) : null;
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(B)Lue;")
    public final class131 method1367(byte arg0) {
        if (arg0 != -124) {
            this.method1373(12, -67);
        }
        return this.method1385(13, 24336, 0, 0, (Object) null);
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Ljava/lang/String;B)Lue;")
    public final class131 method1368(String arg0, byte arg1) {
        int var3 = 120 % ((19 - arg1) / 51);
        return this.method1385(16, 24336, 0, 0, arg0);
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Ljava/lang/Class;B)Lue;")
    public final class131 method1369(Class arg0, byte arg1) {
        if (arg1 != -14) {
            field2646 = null;
        }
        return this.method1385(20, 24336, 0, 0, arg0);
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(I)V")
    public final void method1370(int arg0) {
        if (arg0 != -27103) {
            return;
        }
        synchronized (this) {
            this.field2644 = true;
            this.notifyAll();
        }
        try {
            this.field2650.join();
        } catch (InterruptedException var8) {
        }
        if (this.field2641 != null) {
            try {
                this.field2641.method1431(-1);
            } catch (IOException var7) {
            }
        }
        if (this.field2651 != null) {
            try {
                this.field2651.method1431(-1);
            } catch (IOException var6) {
            }
        }
        if (this.field2642 != null) {
            for (int var3 = 0; var3 < this.field2642.length; var3++) {
                if (this.field2642[var3] != null) {
                    try {
                        this.field2642[var3].method1431(-1);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field2649 != null) {
            try {
                this.field2649.method1431(arg0 + 27102);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(ILjava/awt/Frame;)Lue;")
    public final class131 method1371(int arg0, Frame arg1) {
        return arg0 == 1 ? this.method1385(7, 24336, 0, 0, arg1) : null;
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(I)Lue;")
    public final class131 method1372(int arg0) {
        if (arg0 != -19491) {
            field2637 = null;
        }
        return this.method1385(18, 24336, 0, 0, (Object) null);
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(II)Lue;")
    public final class131 method1373(int arg0, int arg1) {
        if (arg1 != 3) {
            this.method1373(-19, -44);
        }
        return this.method1385(3, 24336, 0, arg0, (Object) null);
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Ljava/lang/String;I)Lue;")
    public final class131 method1374(String arg0, int arg1) {
        if (arg1 < 96) {
            this.field2639 = null;
        }
        return this.method1385(21, 24336, 0, 0, arg0);
    }

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "(B)Lue;")
    public final class131 method1375(byte arg0) {
        if (arg0 < 113) {
            this.method1377((Class) null, -107);
        }
        return this.method1385(12, 24336, 0, 0, (Object) null);
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(ZLjava/net/URL;)Lue;")
    public final class131 method1376(boolean arg0, URL arg1) {
        if (!arg0) {
            this.method1391((byte) 116, (Class) null);
        }
        return this.method1385(4, 24336, 0, 0, arg1);
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Ljava/lang/Class;I)Lue;")
    public final class131 method1377(Class arg0, int arg1) {
        if (arg1 != 0) {
            this.method1380(-42, (Point) null, (int[]) null, (byte) 111, 46, (Component) null);
        }
        return this.method1385(10, 24336, 0, 0, arg0);
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;I)Lue;")
    public final class131 method1378(String arg0, Class arg1, int arg2) {
        if (arg2 >= -73) {
            field2655 = null;
        }
        return this.method1385(9, 24336, 0, 0, new Object[] { arg1, arg0 });
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIILjava/lang/Object;I)Lue;")
    private final class131 method1379(int arg0, int arg1, int arg2, Object arg3, int arg4) {
        class131 var6 = new class131();
        synchronized (var6) {
            var6.field2123 = arg2;
            if (arg0 != 13143) {
                this.method1373(91, -66);
            }
            var6.field2124 = arg4;
            var6.field2122 = arg3;
            synchronized (this) {
                if (this.field2647 == null) {
                    this.field2647 = this.field2634 = var6;
                } else {
                    this.field2647.field2120 = var6;
                    this.field2647 = var6;
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

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(ILjava/awt/Point;[IBILjava/awt/Component;)Lue;")
    public final class131 method1380(int arg0, Point arg1, int[] arg2, byte arg3, int arg4, Component arg5) {
        return arg3 == 48 ? this.method1385(17, 24336, arg4, arg0, new Object[] { arg5, arg2, arg1 }) : null;
    }

    @OriginalMember(owner = "client!vj", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class131 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2644) {
                        return;
                    }
                    if (this.field2634 != null) {
                        var2 = this.field2634;
                        this.field2634 = this.field2634.field2120;
                        if (this.field2634 == null) {
                            this.field2647 = null;
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
                int var3 = var2.field2123;
                if (var3 == 1) {
                    if (field2654 > class10.method63(-21149)) {
                        throw new IOException();
                    }
                    var2.field2125 = new Socket(InetAddress.getByName((String) var2.field2122), var2.field2124);
                } else if (var3 == 2) {
                    Thread var4 = new Thread((Runnable) var2.field2122);
                    var4.setDaemon(true);
                    var4.start();
                    var4.setPriority(var2.field2124);
                    var2.field2125 = var4;
                } else if (var3 == 4) {
                    if (class10.method63(-21149) < field2654) {
                        throw new IOException();
                    }
                    var2.field2125 = new DataInputStream(((URL) var2.field2122).openStream());
                } else if (var3 == 8) {
                    Object[] var5 = (Object[]) var2.field2122;
                    var2.field2125 = ((Class) var5[0]).getDeclaredMethod((String) var5[1], (Class[]) var5[2]);
                } else if (var3 == 9) {
                    Object[] var9 = (Object[]) var2.field2122;
                    var2.field2125 = ((Class) var9[0]).getDeclaredField((String) var9[1]);
                } else if (var3 == 18) {
                    Clipboard var6 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var2.field2125 = var6.getContents((Object) null);
                } else if (var3 == 19) {
                    Transferable var7 = (Transferable) var2.field2122;
                    Clipboard var8 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var8.setContents(var7, (ClipboardOwner) null);
                } else {
                    throw new Exception("");
                }
                var2.field2121 = 1;
            } catch (ThreadDeath var15) {
                throw var15;
            } catch (Throwable var16) {
                var2.field2121 = 2;
            }
            synchronized (var2) {
                var2.notify();
            }
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(ILjava/awt/Component;Z)Lue;")
    public final class131 method1381(int arg0, Component arg1, boolean arg2) {
        if (arg0 != 1) {
            field2645 = null;
        }
        return this.method1385(15, 24336, 0, arg2 ? 1 : 0, arg1);
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(Ljava/lang/String;I)[B")
    public final byte[] method1382(String arg0, int arg1) {
        class131 var3 = this.method1379(13143, 0, 21, arg0, arg1);
        return (byte[]) var3.field2125;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IZLjava/lang/String;)Lue;")
    public final class131 method1383(int arg0, boolean arg1, String arg2) {
        return arg1 ? this.method1385(1, 24336, 0, arg0, arg2) : null;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Ljava/lang/Runnable;ZI)Lue;")
    public final class131 method1384(Runnable arg0, boolean arg1, int arg2) {
        return arg1 ? this.method1385(2, 24336, 0, arg2, arg0) : null;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIIILjava/lang/Object;)Lue;")
    private final class131 method1385(int arg0, int arg1, int arg2, int arg3, Object arg4) {
        class131 var6 = new class131();
        var6.field2123 = arg0;
        var6.field2122 = arg4;
        var6.field2124 = arg3;
        if (arg1 != 24336) {
            field2655 = null;
        }
        synchronized (this) {
            if (this.field2647 == null) {
                this.field2647 = this.field2634 = var6;
            } else {
                this.field2647.field2120 = var6;
                this.field2647 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Ljava/awt/Component;III)Lue;")
    public final class131 method1386(Component arg0, int arg1, int arg2, int arg3) {
        if (arg3 > -24) {
            this.field2641 = null;
        }
        Point var5 = arg0.getLocationOnScreen();
        return this.method1385(14, 24336, var5.y + arg1, var5.x + arg2, (Object) null);
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Class;[Ljava/lang/Class;)Lue;")
    public final class131 method1387(String arg0, int arg1, Class arg2, Class[] arg3) {
        if (arg1 != 9) {
            this.method1372(21);
        }
        return this.method1385(8, 24336, 0, 0, new Object[] { arg2, arg0, arg3 });
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Ljava/awt/datatransfer/Transferable;B)Lue;")
    public final class131 method1388(Transferable arg0, byte arg1) {
        if (arg1 != 50) {
            this.method1378((String) null, (Class) null, -87);
        }
        return this.method1385(19, 24336, 0, 0, arg0);
    }

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "(B)Z")
    public final boolean method1389(byte arg0) {
        if (arg0 != -78) {
            this.method1368((String) null, (byte) 40);
        }
        return false;
    }

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "(I)V")
    public final void method1390(int arg0) {
        field2654 = class10.method63(-21149) + 5000L;
        if (arg0 <= 48) {
            this.method1369((Class) null, (byte) 100);
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(BLjava/lang/Class;)Lue;")
    public final class131 method1391(byte arg0, Class arg1) {
        int var3 = -11 % ((40 - arg0) / 53);
        return this.method1385(11, 24336, 0, 0, arg1);
    }

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "(I)Lpg;")
    public final class112 method1392(int arg0) {
        if (arg0 != -1) {
            this.field2638 = null;
        }
        return this.field2648;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIBII)Lue;")
    public final class131 method1393(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg2 >= -1) {
            this.method1380(-87, (Point) null, (int[]) null, (byte) -121, -54, (Component) null);
        }
        return this.method1385(6, 24336, (arg1 << 16) + arg4, (arg3 << 16) + arg0, (Object) null);
    }

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
    public class177(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        field2646 = "1.1";
        field2645 = "Unknown";
        this.field2639 = arg0;
        try {
            field2645 = System.getProperty("java.vendor");
            field2646 = System.getProperty("java.version");
        } catch (Exception var12) {
        }
        try {
            field2643 = System.getProperty("os.name");
        } catch (Exception var11) {
            field2643 = "Unknown";
        }
        field2652 = field2643.toLowerCase();
        try {
            field2635 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var10) {
            field2635 = "";
        }
        try {
            field2640 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var9) {
            field2640 = "";
        }
        try {
            field2637 = System.getProperty("user.home");
            if (field2637 != null) {
                field2637 = field2637 + "/";
            }
        } catch (Exception var8) {
        }
        if (field2637 == null) {
            field2637 = "~/";
        }
        try {
            this.field2638 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var7) {
        }
        try {
            if (arg0 == null) {
                field2655 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field2655 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        try {
            if (arg0 == null) {
                field2653 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field2653 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var5) {
        }
        this.field2644 = false;
        this.field2650 = new Thread(this);
        this.field2650.setPriority(10);
        this.field2650.setDaemon(true);
        this.field2650.start();
    }

    static {
        new Hashtable(16);
        field2654 = 0L;
    }
}
