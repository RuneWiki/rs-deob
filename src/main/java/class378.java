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

@OriginalClass("client!am")
public class class378 implements Runnable {

    @OriginalMember(owner = "client!am", name = "e", descriptor = "Lle;")
    public class167 field5547 = null;

    @OriginalMember(owner = "client!am", name = "i", descriptor = "Z")
    private boolean field5551 = false;

    @OriginalMember(owner = "client!am", name = "c", descriptor = "Lle;")
    public class167 field5545 = null;

    @OriginalMember(owner = "client!am", name = "q", descriptor = "Ljava/applet/Applet;")
    public Applet field5559 = null;

    @OriginalMember(owner = "client!am", name = "r", descriptor = "Lep;")
    private class241 field5560 = null;

    @OriginalMember(owner = "client!am", name = "s", descriptor = "Lle;")
    public class167 field5561 = null;

    @OriginalMember(owner = "client!am", name = "o", descriptor = "Lep;")
    private class241 field5557 = null;

    @OriginalMember(owner = "client!am", name = "p", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field5558;

    @OriginalMember(owner = "client!am", name = "m", descriptor = "Ljava/lang/Thread;")
    private Thread field5555;

    @OriginalMember(owner = "client!am", name = "k", descriptor = "I")
    public static int field5553 = 3;

    @OriginalMember(owner = "client!am", name = "v", descriptor = "J")
    public static volatile long field5564;

    @OriginalMember(owner = "client!am", name = "j", descriptor = "Lie;")
    private class4 field5552;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "Ljava/lang/String;")
    public static String field5543;

    @OriginalMember(owner = "client!am", name = "b", descriptor = "Ljava/lang/String;")
    public static String field5544;

    @OriginalMember(owner = "client!am", name = "f", descriptor = "Ljava/lang/String;")
    public static String field5548;

    @OriginalMember(owner = "client!am", name = "g", descriptor = "Ljava/lang/String;")
    public static String field5549;

    @OriginalMember(owner = "client!am", name = "h", descriptor = "Ljava/lang/String;")
    private static String field5550;

    @OriginalMember(owner = "client!am", name = "l", descriptor = "Ljava/lang/String;")
    public static String field5554;

    @OriginalMember(owner = "client!am", name = "n", descriptor = "Ljava/lang/String;")
    public static String field5556;

    @OriginalMember(owner = "client!am", name = "t", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field5562;

    @OriginalMember(owner = "client!am", name = "u", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field5563;

    @OriginalMember(owner = "client!am", name = "d", descriptor = "[Lle;")
    public class167[] field5546;

    static {
        new Hashtable(16);
        field5564 = 0L;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Z)Lep;", line = 3)
    public final class241 method2379(boolean arg0) {
        if (!arg0) {
            this.field5547 = null;
        }
        return this.method2403(13, (Object) null, 0, (byte) -91, 0);
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IILjava/lang/String;)Lep;", line = 14)
    public final class241 method2380(int arg0, int arg1, String arg2) {
        if (arg1 >= -9) {
            this.method2402(5);
        }
        return this.method2403(1, arg2, 0, (byte) -91, arg0);
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(ILjava/awt/Frame;)Lep;", line = 26)
    public final class241 method2381(int arg0, Frame arg1) {
        return arg0 == 0 ? this.method2403(7, arg1, 0, (byte) -91, 0) : null;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(ILjava/net/URL;)Lep;", line = 37)
    public final class241 method2382(int arg0, URL arg1) {
        return arg0 == -16704 ? this.method2403(4, arg1, 0, (byte) -91, 0) : null;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(I)Z", line = 48)
    public final boolean method2383(int arg0) {
        if (arg0 != 0) {
            this.method2399(false);
        }
        return false;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IIIZLjava/lang/Object;)Lep;", line = 63)
    private final class241 method2384(int arg0, int arg1, int arg2, boolean arg3, Object arg4) {
        if (!arg3) {
            this.method2404((String) null, (Class) null, -16);
        }
        class241 var6 = new class241();
        synchronized (var6) {
            var6.field3267 = arg2;
            var6.field3266 = arg4;
            var6.field3269 = arg1;
            synchronized (this) {
                if (this.field5557 == null) {
                    this.field5557 = this.field5560 = var6;
                } else {
                    this.field5557.field3265 = var6;
                    this.field5557 = var6;
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

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(Z)Lep;", line = 99)
    public final class241 method2385(boolean arg0) {
        return arg0 ? null : this.method2403(5, (Object) null, 0, (byte) -91, 0);
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(ILjava/lang/Runnable;B)Lep;", line = 113)
    public final class241 method2386(int arg0, Runnable arg1, byte arg2) {
        if (arg2 != -55) {
            this.method2391((byte) -77, (Class) null);
        }
        return this.method2403(2, arg1, 0, (byte) -91, arg0);
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(ILjava/lang/Class;)Lep;", line = 123)
    public final class241 method2387(int arg0, Class arg1) {
        if (arg0 != 19) {
            field5554 = null;
        }
        return this.method2403(20, arg1, 0, (byte) -91, 0);
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Ljava/lang/String;I)Lep;", line = 133)
    public final class241 method2388(String arg0, int arg1) {
        if (arg1 != 0) {
            field5553 = -11;
        }
        return this.method2403(16, arg0, 0, (byte) -91, 0);
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IZLjava/awt/Component;)Lep;", line = 143)
    public final class241 method2389(int arg0, boolean arg1, Component arg2) {
        if (arg0 <= 111) {
            this.method2403(-114, (Object) null, 118, (byte) -77, 116);
        }
        return this.method2403(15, arg2, 0, (byte) -91, arg1 ? 1 : 0);
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IIIII)Lep;", line = 154)
    public final class241 method2390(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 != 2548) {
            this.method2400((String) null, (byte) -105);
        }
        return this.method2403(6, (Object) null, (arg3 << 16) + arg2, (byte) -91, (arg4 << 16) + arg0);
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(BLjava/lang/Class;)Lep;", line = 170)
    public final class241 method2391(byte arg0, Class arg1) {
        if (arg0 > -125) {
            field5556 = null;
        }
        return this.method2403(10, arg1, 0, (byte) -91, 0);
    }

    @OriginalMember(owner = "client!am", name = "c", descriptor = "(Z)Lie;", line = 184)
    public final class4 method2392(boolean arg0) {
        if (arg0) {
            this.field5547 = null;
        }
        return this.field5552;
    }

    @OriginalMember(owner = "client!am", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V", line = 581)
    public class378(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        field5554 = "1.1";
        this.field5559 = arg0;
        field5556 = "Unknown";
        try {
            field5556 = System.getProperty("java.vendor");
            field5554 = System.getProperty("java.version");
        } catch (Exception var12) {
        }
        try {
            field5544 = System.getProperty("os.name");
        } catch (Exception var11) {
            field5544 = "Unknown";
        }
        field5549 = field5544.toLowerCase();
        try {
            field5548 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var10) {
            field5548 = "";
        }
        try {
            field5543 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var9) {
            field5543 = "";
        }
        try {
            field5550 = System.getProperty("user.home");
            if (field5550 != null) {
                field5550 = field5550 + "/";
            }
        } catch (Exception var8) {
        }
        if (field5550 == null) {
            field5550 = "~/";
        }
        try {
            this.field5558 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var7) {
        }
        try {
            if (arg0 == null) {
                field5563 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field5563 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        try {
            if (arg0 == null) {
                field5562 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field5562 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var5) {
        }
        this.field5551 = false;
        this.field5555 = new Thread(this);
        this.field5555.setPriority(10);
        this.field5555.setDaemon(true);
        this.field5555.start();
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(I)Lep;", line = 198)
    public final class241 method2393(int arg0) {
        if (arg0 != 0) {
            this.method2387(-2, (Class) null);
        }
        return this.method2403(18, (Object) null, 0, (byte) -91, 0);
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IILjava/awt/Component;Ljava/awt/Point;I[I)Lep;", line = 209)
    public final class241 method2394(int arg0, int arg1, Component arg2, Point arg3, int arg4, int[] arg5) {
        if (arg0 >= -102) {
            field5564 = 41L;
        }
        return this.method2403(17, new Object[] { arg2, arg5, arg3 }, arg1, (byte) -91, arg4);
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(ILjava/awt/Component;II)Lep;", line = 221)
    public final class241 method2395(int arg0, Component arg1, int arg2, int arg3) {
        Point var5 = arg1.getLocationOnScreen();
        int var6 = -113 % ((arg2 - 73) / 38);
        return this.method2403(14, (Object) null, var5.y + arg3, (byte) -91, var5.x + arg0);
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IB)Lep;", line = 235)
    public final class241 method2396(int arg0, byte arg1) {
        int var3 = 59 % ((arg1 + 5) / 49);
        return this.method2403(3, (Object) null, 0, (byte) -91, arg0);
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Ljava/lang/String;B)Lep;", line = 246)
    public final class241 method2397(String arg0, byte arg1) {
        return arg1 == -79 ? this.method2403(21, arg0, 0, (byte) -91, 0) : null;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(B)Lep;", line = 256)
    public final class241 method2398(byte arg0) {
        int var2 = 68 / ((27 - arg0) / 43);
        return this.method2403(12, (Object) null, 0, (byte) -91, 0);
    }

    @OriginalMember(owner = "client!am", name = "d", descriptor = "(Z)V", line = 265)
    public final void method2399(boolean arg0) {
        if (!arg0) {
            field5564 = class203.method1299((byte) 5) + 5000L;
        }
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(Ljava/lang/String;B)[B", line = 281)
    public final byte[] method2400(String arg0, byte arg1) {
        if (arg1 < 77) {
            return null;
        } else {
            class241 var3 = this.method2384(0, 21, 0, true, arg0);
            return (byte[]) var3.field3270;
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Ljava/lang/Class;I)Lep;", line = 301)
    public final class241 method2401(Class arg0, int arg1) {
        if (arg1 < 7) {
            this.run();
        }
        return this.method2403(11, arg0, 0, (byte) -91, 0);
    }

    @OriginalMember(owner = "client!am", name = "c", descriptor = "(I)V", line = 313)
    public final void method2402(int arg0) {
        synchronized (this) {
            this.field5551 = true;
            this.notifyAll();
        }
        try {
            this.field5555.join();
            if (arg0 != 2) {
                field5543 = null;
            }
        } catch (InterruptedException var8) {
        }
        if (this.field5561 != null) {
            try {
                this.field5561.method1107((byte) -118);
            } catch (IOException var7) {
            }
        }
        if (this.field5545 != null) {
            try {
                this.field5545.method1107((byte) -110);
            } catch (IOException var6) {
            }
        }
        if (this.field5546 != null) {
            for (int var3 = 0; var3 < this.field5546.length; var3++) {
                if (this.field5546[var3] != null) {
                    try {
                        this.field5546[var3].method1107((byte) -106);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field5547 != null) {
            try {
                this.field5547.method1107((byte) -106);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(ILjava/lang/Object;IBI)Lep;", line = 373)
    private final class241 method2403(int arg0, Object arg1, int arg2, byte arg3, int arg4) {
        if (arg3 != -91) {
            return null;
        }
        class241 var6 = new class241();
        var6.field3266 = arg1;
        var6.field3269 = arg0;
        var6.field3267 = arg4;
        synchronized (this) {
            if (this.field5557 == null) {
                this.field5557 = this.field5560 = var6;
            } else {
                this.field5557.field3265 = var6;
                this.field5557 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!am", name = "run", descriptor = "()V", line = 408)
    public final void run() {
        while (true) {
            class241 var2;
            synchronized (this) {
                while (true) {
                    if (this.field5551) {
                        return;
                    }
                    if (this.field5560 != null) {
                        var2 = this.field5560;
                        this.field5560 = this.field5560.field3265;
                        if (this.field5560 == null) {
                            this.field5557 = null;
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
                int var3 = var2.field3269;
                if (var3 == 1) {
                    if (field5564 > class203.method1299((byte) 5)) {
                        throw new IOException();
                    }
                    var2.field3270 = new Socket(InetAddress.getByName((String) var2.field3266), var2.field3267);
                } else if (var3 == 2) {
                    Thread var4 = new Thread((Runnable) var2.field3266);
                    var4.setDaemon(true);
                    var4.start();
                    var4.setPriority(var2.field3267);
                    var2.field3270 = var4;
                } else if (var3 == 4) {
                    if (field5564 > class203.method1299((byte) 5)) {
                        throw new IOException();
                    }
                    var2.field3270 = new DataInputStream(((URL) var2.field3266).openStream());
                } else if (var3 == 8) {
                    Object[] var9 = (Object[]) var2.field3266;
                    var2.field3270 = ((Class) var9[0]).getDeclaredMethod((String) var9[1], (Class[]) var9[2]);
                } else if (var3 == 9) {
                    Object[] var5 = (Object[]) var2.field3266;
                    var2.field3270 = ((Class) var5[0]).getDeclaredField((String) var5[1]);
                } else if (var3 == 18) {
                    Clipboard var6 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var2.field3270 = var6.getContents((Object) null);
                } else if (var3 == 19) {
                    Transferable var7 = (Transferable) var2.field3266;
                    Clipboard var8 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var8.setContents(var7, (ClipboardOwner) null);
                } else {
                    throw new Exception("");
                }
                var2.field3268 = 1;
            } catch (ThreadDeath var15) {
                throw var15;
            } catch (Throwable var16) {
                var2.field3268 = 2;
            }
            synchronized (var2) {
                var2.notify();
            }
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;I)Lep;", line = 546)
    public final class241 method2404(String arg0, Class arg1, int arg2) {
        return arg2 < 98 ? null : this.method2403(9, new Object[] { arg1, arg0 }, 0, (byte) -91, 0);
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(ZLjava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;)Lep;", line = 556)
    public final class241 method2405(boolean arg0, String arg1, Class[] arg2, Class arg3) {
        return arg0 ? this.method2403(8, new Object[] { arg3, arg1, arg2 }, 0, (byte) -91, 0) : null;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Ljava/awt/datatransfer/Transferable;I)Lep;", line = 659)
    public final class241 method2406(Transferable arg0, int arg1) {
        int var3 = 59 / ((arg1 - 66) / 54);
        return this.method2403(19, arg0, 0, (byte) -91, 0);
    }
}
