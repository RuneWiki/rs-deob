import java.applet.Applet;
import java.awt.Component;
import java.awt.EventQueue;
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

@OriginalClass("client!fh")
public class class129 implements Runnable {

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "Lo;")
    public class235 field2312 = null;

    @OriginalMember(owner = "client!fh", name = "n", descriptor = "Z")
    private boolean field2325 = false;

    @OriginalMember(owner = "client!fh", name = "i", descriptor = "Ljava/applet/Applet;")
    public Applet field2320 = null;

    @OriginalMember(owner = "client!fh", name = "k", descriptor = "Lug;")
    private class193 field2322 = null;

    @OriginalMember(owner = "client!fh", name = "r", descriptor = "Lo;")
    public class235 field2329 = null;

    @OriginalMember(owner = "client!fh", name = "q", descriptor = "Lo;")
    public class235 field2328 = null;

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "Lug;")
    private class193 field2313 = null;

    @OriginalMember(owner = "client!fh", name = "p", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field2327;

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "Ljava/lang/Thread;")
    private Thread field2315;

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "I")
    public static int field2314 = 3;

    @OriginalMember(owner = "client!fh", name = "o", descriptor = "Lqi;")
    private class126 field2326;

    @OriginalMember(owner = "client!fh", name = "e", descriptor = "Ljava/lang/String;")
    private static String field2316;

    @OriginalMember(owner = "client!fh", name = "f", descriptor = "Ljava/lang/String;")
    public static String field2317;

    @OriginalMember(owner = "client!fh", name = "h", descriptor = "Ljava/lang/String;")
    public static String field2319;

    @OriginalMember(owner = "client!fh", name = "j", descriptor = "Ljava/lang/String;")
    public static String field2321;

    @OriginalMember(owner = "client!fh", name = "l", descriptor = "Ljava/lang/String;")
    public static String field2323;

    @OriginalMember(owner = "client!fh", name = "m", descriptor = "Ljava/lang/String;")
    public static String field2324;

    @OriginalMember(owner = "client!fh", name = "s", descriptor = "Ljava/lang/String;")
    public static String field2330;

    @OriginalMember(owner = "client!fh", name = "t", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field2331;

    @OriginalMember(owner = "client!fh", name = "u", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field2332;

    @OriginalMember(owner = "client!fh", name = "g", descriptor = "[Lo;")
    public class235[] field2318;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(II)Lug;")
    public final class193 method1012(int arg0, int arg1) {
        return arg0 == 2 ? this.method1022(3, arg1, (Object) null, 0, true) : null;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Z)Lqi;")
    public final class126 method1013(boolean arg0) {
        return arg0 ? this.field2326 : null;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Class;[Ljava/lang/Class;)Lug;")
    public final class193 method1014(String arg0, int arg1, Class arg2, Class[] arg3) {
        return arg1 < 40 ? null : this.method1022(8, 0, new Object[] { arg2, arg0, arg3 }, 0, true);
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/Class;)Lug;")
    public final class193 method1015(byte arg0, String arg1, Class arg2) {
        if (arg0 > -65) {
            this.method1021((byte) 45, (URL) null);
        }
        return this.method1022(9, 0, new Object[] { arg2, arg1 }, 0, true);
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)V")
    public final void method1016(int arg0) {
        synchronized (this) {
            this.field2325 = true;
            this.notifyAll();
        }
        try {
            this.field2315.join();
            if (arg0 != 0) {
                this.method1023(-102, 32, 7, (Component) null);
            }
        } catch (InterruptedException var8) {
        }
        if (this.field2312 != null) {
            try {
                this.field2312.method1654(arg0 + 110);
            } catch (IOException var7) {
            }
        }
        if (this.field2328 != null) {
            try {
                this.field2328.method1654(67);
            } catch (IOException var6) {
            }
        }
        if (this.field2318 != null) {
            for (int var3 = 0; var3 < this.field2318.length; var3++) {
                if (this.field2318[var3] != null) {
                    try {
                        this.field2318[var3].method1654(arg0 ^ 0x36);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field2329 != null) {
            try {
                this.field2329.method1654(44);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(BLjava/lang/String;)Lug;")
    public final class193 method1017(byte arg0, String arg1) {
        if (arg0 != -54) {
            this.method1023(-83, -118, 87, (Component) null);
        }
        return this.method1022(16, 0, arg1, 0, true);
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(ZILjava/awt/Component;)Lug;")
    public final class193 method1018(boolean arg0, int arg1, Component arg2) {
        if (arg1 > -107) {
            this.field2327 = null;
        }
        return this.method1022(15, arg0 ? 1 : 0, arg2, 0, true);
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Ljava/lang/Runnable;BI)Lug;")
    public final class193 method1019(Runnable arg0, byte arg1, int arg2) {
        int var4 = -121 % ((arg1 - 7) / 56);
        return this.method1022(2, arg2, arg0, 0, true);
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(ILjava/lang/String;)Lug;")
    public final class193 method1020(int arg0, String arg1) {
        if (arg0 != 0) {
            this.method1019((Runnable) null, (byte) -75, -12);
        }
        return this.method1022(12, 0, arg1, 0, true);
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(BLjava/net/URL;)Lug;")
    public final class193 method1021(byte arg0, URL arg1) {
        if (arg0 < 20) {
            field2317 = null;
        }
        return this.method1022(4, 0, arg1, 0, true);
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IILjava/lang/Object;IZ)Lug;")
    private final class193 method1022(int arg0, int arg1, Object arg2, int arg3, boolean arg4) {
        if (!arg4) {
            field2323 = null;
        }
        class193 var6 = new class193();
        var6.field3420 = arg1;
        var6.field3422 = arg2;
        var6.field3425 = arg0;
        synchronized (this) {
            if (this.field2322 == null) {
                this.field2322 = this.field2313 = var6;
            } else {
                this.field2322.field3424 = var6;
                this.field2322 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIILjava/awt/Component;)Lug;")
    public final class193 method1023(int arg0, int arg1, int arg2, Component arg3) {
        if (arg1 < 84) {
            return null;
        } else {
            Point var5 = arg3.getLocationOnScreen();
            return this.method1022(14, var5.x + arg2, (Object) null, var5.y + arg0, true);
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(BLjava/lang/String;I)Lug;")
    public final class193 method1024(byte arg0, String arg1, int arg2) {
        if (arg0 != -65) {
            this.method1022(119, 106, (Object) null, -1, false);
        }
        return this.method1022(1, arg2, arg1, 0, true);
    }

    @OriginalMember(owner = "client!fh", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class193 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2325) {
                        return;
                    }
                    if (this.field2313 != null) {
                        var2 = this.field2313;
                        this.field2313 = this.field2313.field3424;
                        if (this.field2313 == null) {
                            this.field2322 = null;
                        }
                        break;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var12) {
                    }
                }
            }
            try {
                int var3 = var2.field3425;
                if (var3 == 1) {
                    var2.field3423 = new Socket(InetAddress.getByName((String) var2.field3422), var2.field3420);
                } else if (var3 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field3422);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field3420);
                    var2.field3423 = var6;
                } else if (var3 == 4) {
                    var2.field3423 = new DataInputStream(((URL) var2.field3422).openStream());
                } else if (var3 == 8) {
                    Object[] var5 = (Object[]) var2.field3422;
                    var2.field3423 = ((Class) var5[0]).getDeclaredMethod((String) var5[1], (Class[]) var5[2]);
                } else if (var3 == 9) {
                    Object[] var4 = (Object[]) var2.field3422;
                    var2.field3423 = ((Class) var4[0]).getDeclaredField((String) var4[1]);
                } else {
                    throw new Exception();
                }
                var2.field3421 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field3421 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
    public class129(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        field2323 = "1.1";
        this.field2320 = arg0;
        field2324 = "Unknown";
        try {
            field2324 = System.getProperty("java.vendor");
            field2323 = System.getProperty("java.version");
        } catch (Exception var12) {
        }
        try {
            field2321 = System.getProperty("os.name");
        } catch (Exception var11) {
            field2321 = "Unknown";
        }
        field2330 = field2321.toLowerCase();
        try {
            field2319 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var10) {
            field2319 = "";
        }
        try {
            field2317 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var9) {
            field2317 = "";
        }
        try {
            field2316 = System.getProperty("user.home");
            if (field2316 != null) {
                field2316 = field2316 + "/";
            }
        } catch (Exception var8) {
        }
        if (field2316 == null) {
            field2316 = "~/";
        }
        try {
            this.field2327 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var7) {
        }
        try {
            if (arg0 == null) {
                field2331 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field2331 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        try {
            if (arg0 == null) {
                field2332 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field2332 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var5) {
        }
        this.field2325 = false;
        this.field2315 = new Thread(this);
        this.field2315.setPriority(10);
        this.field2315.setDaemon(true);
        this.field2315.start();
    }

    static {
        new Hashtable(16);
    }
}
