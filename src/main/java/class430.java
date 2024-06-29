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

@OriginalClass("client!mj")
public class class430 implements Runnable {

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "Lia;")
    public class383 field6010 = null;

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "Lkj;")
    private class366 field6012 = null;

    @OriginalMember(owner = "client!mj", name = "i", descriptor = "Z")
    private boolean field6017 = false;

    @OriginalMember(owner = "client!mj", name = "h", descriptor = "Lia;")
    public class383 field6016 = null;

    @OriginalMember(owner = "client!mj", name = "m", descriptor = "Ljava/applet/Applet;")
    public Applet field6021 = null;

    @OriginalMember(owner = "client!mj", name = "p", descriptor = "Lkj;")
    private class366 field6024 = null;

    @OriginalMember(owner = "client!mj", name = "n", descriptor = "Lia;")
    public class383 field6022 = null;

    @OriginalMember(owner = "client!mj", name = "f", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field6014;

    @OriginalMember(owner = "client!mj", name = "r", descriptor = "Ljava/lang/Thread;")
    private Thread field6026;

    @OriginalMember(owner = "client!mj", name = "o", descriptor = "I")
    public static int field6023 = 3;

    @OriginalMember(owner = "client!mj", name = "u", descriptor = "J")
    public static volatile long field6029;

    @OriginalMember(owner = "client!mj", name = "g", descriptor = "Lqg;")
    private class296 field6015;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "Ljava/lang/String;")
    public static String field6009;

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "Ljava/lang/String;")
    public static String field6011;

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "Ljava/lang/String;")
    private static String field6013;

    @OriginalMember(owner = "client!mj", name = "j", descriptor = "Ljava/lang/String;")
    public static String field6018;

    @OriginalMember(owner = "client!mj", name = "k", descriptor = "Ljava/lang/String;")
    public static String field6019;

    @OriginalMember(owner = "client!mj", name = "q", descriptor = "Ljava/lang/String;")
    public static String field6025;

    @OriginalMember(owner = "client!mj", name = "s", descriptor = "Ljava/lang/String;")
    public static String field6027;

    @OriginalMember(owner = "client!mj", name = "t", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field6028;

    @OriginalMember(owner = "client!mj", name = "v", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field6030;

    @OriginalMember(owner = "client!mj", name = "l", descriptor = "[Lia;")
    public class383[] field6020;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(BLjava/awt/Frame;)Lkj;")
    public final class366 method2522(byte arg0, Frame arg1) {
        int var3 = 112 % ((-arg0 - 50) / 48);
        return this.method2529(7, arg1, (byte) 9, 0, 0);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILjava/net/URL;)Lkj;")
    public final class366 method2523(int arg0, URL arg1) {
        if (arg0 >= -74) {
            field6009 = null;
        }
        return this.method2529(4, arg1, (byte) 60, 0, 0);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(B)Lkj;")
    public final class366 method2524(byte arg0) {
        if (arg0 < 2) {
            this.method2527((String) null, (byte) -76, 30);
        }
        return this.method2529(18, (Object) null, (byte) 95, 0, 0);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)Lkj;")
    public final class366 method2525(int arg0) {
        if (arg0 <= 122) {
            field6023 = -122;
        }
        return this.method2529(5, (Object) null, (byte) 25, 0, 0);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIZI)Lkj;")
    public final class366 method2526(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        return arg3 ? this.method2529(6, (Object) null, (byte) 100, (arg0 << 16) + arg1, (arg4 << 16) + arg2) : null;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Ljava/lang/String;BI)Lkj;")
    public final class366 method2527(String arg0, byte arg1, int arg2) {
        if (arg1 > -124) {
            this.method2531(68, (Class) null);
        }
        return this.method2529(1, arg0, (byte) 79, arg2, 0);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILjava/awt/Component;Z)Lkj;")
    public final class366 method2528(int arg0, Component arg1, boolean arg2) {
        if (arg0 != 0) {
            this.field6014 = null;
        }
        return this.method2529(15, arg1, (byte) 82, arg2 ? 1 : 0, 0);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILjava/lang/Object;BII)Lkj;")
    private final class366 method2529(int arg0, Object arg1, byte arg2, int arg3, int arg4) {
        class366 var6 = new class366();
        var6.field5258 = arg0;
        if (arg2 < 4) {
            this.field6015 = null;
        }
        var6.field5256 = arg1;
        var6.field5257 = arg3;
        synchronized (this) {
            if (this.field6012 == null) {
                this.field6012 = this.field6024 = var6;
            } else {
                this.field6012.field5254 = var6;
                this.field6012 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Z)Lkj;")
    public final class366 method2530(boolean arg0) {
        if (arg0) {
            this.method2548((String) null, (byte) 20);
        }
        return this.method2529(13, (Object) null, (byte) 95, 0, 0);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILjava/lang/Class;)Lkj;")
    public final class366 method2531(int arg0, Class arg1) {
        int var3 = -32 / ((46 - arg0) / 42);
        return this.method2529(10, arg1, (byte) 94, 0, 0);
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(B)V")
    public final void method2532(byte arg0) {
        synchronized (this) {
            this.field6017 = true;
            this.notifyAll();
        }
        try {
            this.field6026.join();
            if (arg0 < 115) {
                this.method2525(-22);
            }
        } catch (InterruptedException var8) {
        }
        if (this.field6010 != null) {
            try {
                this.field6010.method2311((byte) -127);
            } catch (IOException var7) {
            }
        }
        if (this.field6022 != null) {
            try {
                this.field6022.method2311((byte) -127);
            } catch (IOException var6) {
            }
        }
        if (this.field6020 != null) {
            for (int var3 = 0; var3 < this.field6020.length; var3++) {
                if (this.field6020[var3] != null) {
                    try {
                        this.field6020[var3].method2311((byte) -127);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field6016 != null) {
            try {
                this.field6016.method2311((byte) -127);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILjava/lang/String;)[B")
    public final byte[] method2533(int arg0, String arg1) {
        class366 var3 = this.method2542(21, 0, arg1, true, arg0);
        return (byte[]) var3.field5255;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILjava/awt/datatransfer/Transferable;)Lkj;")
    public final class366 method2534(int arg0, Transferable arg1) {
        if (arg0 >= -26) {
            this.method2548((String) null, (byte) 114);
        }
        return this.method2529(19, arg1, (byte) 111, 0, 0);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(BLjava/lang/Class;)Lkj;")
    public final class366 method2535(byte arg0, Class arg1) {
        if (arg0 >= -26) {
            field6013 = null;
        }
        return this.method2529(20, arg1, (byte) 55, 0, 0);
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(ILjava/lang/String;)Lkj;")
    public final class366 method2536(int arg0, String arg1) {
        if (arg0 != 0) {
            this.field6017 = true;
        }
        return this.method2529(21, arg1, (byte) 78, 0, 0);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(II)Lkj;")
    public final class366 method2537(int arg0, int arg1) {
        if (arg0 != 0) {
            this.method2533(95, (String) null);
        }
        return this.method2529(3, (Object) null, (byte) 64, arg1, 0);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "([Ljava/lang/Class;BLjava/lang/String;Ljava/lang/Class;)Lkj;")
    public final class366 method2538(Class[] arg0, byte arg1, String arg2, Class arg3) {
        if (arg1 != -41) {
            field6019 = null;
        }
        return this.method2529(8, new Object[] { arg3, arg2, arg0 }, (byte) 40, 0, 0);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(BLjava/lang/Class;Ljava/lang/String;)Lkj;")
    public final class366 method2539(byte arg0, Class arg1, String arg2) {
        if (arg0 != -24) {
            field6023 = 89;
        }
        return this.method2529(9, new Object[] { arg1, arg2 }, (byte) 38, 0, 0);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Ljava/lang/Class;I)Lkj;")
    public final class366 method2540(Class arg0, int arg1) {
        if (arg1 != 11) {
            this.method2534(-95, (Transferable) null);
        }
        return this.method2529(11, arg0, (byte) 83, 0, 0);
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(I)Lkj;")
    public final class366 method2541(int arg0) {
        if (arg0 != 0) {
            this.method2529(25, (Object) null, (byte) -45, 99, -5);
        }
        return this.method2529(12, (Object) null, (byte) 96, 0, 0);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IILjava/lang/Object;ZI)Lkj;")
    private final class366 method2542(int arg0, int arg1, Object arg2, boolean arg3, int arg4) {
        class366 var6 = new class366();
        synchronized (var6) {
            var6.field5257 = arg1;
            var6.field5256 = arg2;
            var6.field5258 = arg0;
            synchronized (this) {
                if (this.field6012 == null) {
                    this.field6012 = this.field6024 = var6;
                } else {
                    this.field6012.field5254 = var6;
                    this.field6012 = var6;
                }
                this.notify();
            }
            try {
                var6.wait();
            } catch (InterruptedException var9) {
            }
        }
        if (!arg3) {
            this.method2546((byte) -7);
        }
        return var6;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Ljava/lang/Runnable;IB)Lkj;")
    public final class366 method2543(Runnable arg0, int arg1, byte arg2) {
        int var4 = -13 % ((54 - arg2) / 59);
        return this.method2529(2, arg0, (byte) 97, arg1, 0);
    }

    @OriginalMember(owner = "client!mj", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class366 var2;
            synchronized (this) {
                while (true) {
                    if (this.field6017) {
                        return;
                    }
                    if (this.field6024 != null) {
                        var2 = this.field6024;
                        this.field6024 = this.field6024.field5254;
                        if (this.field6024 == null) {
                            this.field6012 = null;
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
                int var3 = var2.field5258;
                if (var3 == 1) {
                    if (class433.method2562(-2039) < field6029) {
                        throw new IOException();
                    }
                    var2.field5255 = new Socket(InetAddress.getByName((String) var2.field5256), var2.field5257);
                } else if (var3 == 2) {
                    Thread var9 = new Thread((Runnable) var2.field5256);
                    var9.setDaemon(true);
                    var9.start();
                    var9.setPriority(var2.field5257);
                    var2.field5255 = var9;
                } else if (var3 == 4) {
                    if (field6029 > class433.method2562(-2039)) {
                        throw new IOException();
                    }
                    var2.field5255 = new DataInputStream(((URL) var2.field5256).openStream());
                } else if (var3 == 8) {
                    Object[] var8 = (Object[]) var2.field5256;
                    var2.field5255 = ((Class) var8[0]).getDeclaredMethod((String) var8[1], (Class[]) var8[2]);
                } else if (var3 == 9) {
                    Object[] var4 = (Object[]) var2.field5256;
                    var2.field5255 = ((Class) var4[0]).getDeclaredField((String) var4[1]);
                } else if (var3 == 18) {
                    Clipboard var7 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var2.field5255 = var7.getContents((Object) null);
                } else if (var3 == 19) {
                    Transferable var5 = (Transferable) var2.field5256;
                    Clipboard var6 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var6.setContents(var5, (ClipboardOwner) null);
                } else {
                    throw new Exception("");
                }
                var2.field5253 = 1;
            } catch (ThreadDeath var15) {
                throw var15;
            } catch (Throwable var16) {
                var2.field5253 = 2;
            }
            synchronized (var2) {
                var2.notify();
            }
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Ljava/awt/Point;I[IBILjava/awt/Component;)Lkj;")
    public final class366 method2544(Point arg0, int arg1, int[] arg2, byte arg3, int arg4, Component arg5) {
        int var7 = -108 % ((7 - arg3) / 58);
        return this.method2529(17, new Object[] { arg5, arg2, arg0 }, (byte) 105, arg1, arg4);
    }

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "(I)Lqg;")
    public final class296 method2545(int arg0) {
        if (arg0 != 19950) {
            this.method2530(false);
        }
        return this.field6015;
    }

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "(B)Z")
    public final boolean method2546(byte arg0) {
        if (arg0 <= 104) {
            field6030 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIILjava/awt/Component;)Lkj;")
    public final class366 method2547(int arg0, int arg1, int arg2, Component arg3) {
        Point var5 = arg3.getLocationOnScreen();
        if (arg1 != 14) {
            this.field6021 = null;
        }
        return this.method2529(14, (Object) null, (byte) 78, var5.x + arg2, var5.y + arg0);
    }

    @OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
    public class430(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        this.field6021 = arg0;
        field6009 = "1.1";
        field6025 = "Unknown";
        try {
            field6025 = System.getProperty("java.vendor");
            field6009 = System.getProperty("java.version");
        } catch (Exception var12) {
        }
        try {
            field6027 = System.getProperty("os.name");
        } catch (Exception var11) {
            field6027 = "Unknown";
        }
        field6011 = field6027.toLowerCase();
        try {
            field6018 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var10) {
            field6018 = "";
        }
        try {
            field6019 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var9) {
            field6019 = "";
        }
        try {
            field6013 = System.getProperty("user.home");
            if (field6013 != null) {
                field6013 = field6013 + "/";
            }
        } catch (Exception var8) {
        }
        if (field6013 == null) {
            field6013 = "~/";
        }
        try {
            this.field6014 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var7) {
        }
        try {
            if (arg0 == null) {
                field6028 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field6028 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        try {
            if (arg0 == null) {
                field6030 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field6030 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var5) {
        }
        this.field6017 = false;
        this.field6026 = new Thread(this);
        this.field6026.setPriority(10);
        this.field6026.setDaemon(true);
        this.field6026.start();
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Ljava/lang/String;B)Lkj;")
    public final class366 method2548(String arg0, byte arg1) {
        if (arg1 <= 43) {
            this.method2534(72, (Transferable) null);
        }
        return this.method2529(16, arg0, (byte) 28, 0, 0);
    }

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "(I)V")
    public final void method2549(int arg0) {
        if (arg0 >= 22) {
            field6029 = class433.method2562(-2039) + 5000L;
        }
    }

    static {
        new Hashtable(16);
        field6029 = 0L;
    }
}
