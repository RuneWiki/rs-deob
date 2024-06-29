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

@OriginalClass("client!j")
public class class165 implements Runnable {

    @OriginalMember(owner = "client!j", name = "b", descriptor = "Lsg;")
    private class163 field2607 = null;

    @OriginalMember(owner = "client!j", name = "f", descriptor = "Z")
    private boolean field2611 = false;

    @OriginalMember(owner = "client!j", name = "g", descriptor = "Lsg;")
    private class163 field2612 = null;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "Ldc;")
    public class237 field2606 = null;

    @OriginalMember(owner = "client!j", name = "o", descriptor = "Ljava/applet/Applet;")
    public Applet field2620 = null;

    @OriginalMember(owner = "client!j", name = "r", descriptor = "Ldc;")
    public class237 field2623 = null;

    @OriginalMember(owner = "client!j", name = "c", descriptor = "Ldc;")
    public class237 field2608 = null;

    @OriginalMember(owner = "client!j", name = "q", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field2622;

    @OriginalMember(owner = "client!j", name = "l", descriptor = "Ljava/lang/Thread;")
    private Thread field2617;

    @OriginalMember(owner = "client!j", name = "d", descriptor = "I")
    public static int field2609 = 3;

    @OriginalMember(owner = "client!j", name = "u", descriptor = "J")
    public static volatile long field2626;

    @OriginalMember(owner = "client!j", name = "m", descriptor = "Lal;")
    private class232 field2618;

    @OriginalMember(owner = "client!j", name = "e", descriptor = "Ljava/lang/String;")
    public static String field2610;

    @OriginalMember(owner = "client!j", name = "h", descriptor = "Ljava/lang/String;")
    public static String field2613;

    @OriginalMember(owner = "client!j", name = "i", descriptor = "Ljava/lang/String;")
    public static String field2614;

    @OriginalMember(owner = "client!j", name = "j", descriptor = "Ljava/lang/String;")
    public static String field2615;

    @OriginalMember(owner = "client!j", name = "k", descriptor = "Ljava/lang/String;")
    private static String field2616;

    @OriginalMember(owner = "client!j", name = "n", descriptor = "Ljava/lang/String;")
    public static String field2619;

    @OriginalMember(owner = "client!j", name = "s", descriptor = "Ljava/lang/String;")
    public static String field2624;

    @OriginalMember(owner = "client!j", name = "t", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field2625;

    @OriginalMember(owner = "client!j", name = "v", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field2627;

    @OriginalMember(owner = "client!j", name = "p", descriptor = "[Ldc;")
    public class237[] field2621;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIBILjava/lang/Object;)Lsg;")
    private final class163 method1132(int arg0, int arg1, byte arg2, int arg3, Object arg4) {
        class163 var6 = new class163();
        var6.field2591 = arg4;
        if (arg2 != -98) {
            this.method1138((byte) 65, (String) null, (Class) null);
        }
        var6.field2592 = arg3;
        var6.field2590 = arg0;
        synchronized (this) {
            if (this.field2612 == null) {
                this.field2612 = this.field2607 = var6;
            } else {
                this.field2612.field2593 = var6;
                this.field2612 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(ILjava/lang/Runnable;B)Lsg;")
    public final class163 method1133(int arg0, Runnable arg1, byte arg2) {
        return arg2 < 83 ? null : this.method1132(2, 0, (byte) -98, arg0, arg1);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/Class;[Ljava/lang/Class;)Lsg;")
    public final class163 method1134(String arg0, byte arg1, Class arg2, Class[] arg3) {
        if (arg1 >= -108) {
            this.field2621 = null;
        }
        return this.method1132(8, 0, (byte) -98, 0, new Object[] { arg2, arg0, arg3 });
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(ILjava/lang/String;I)Lsg;")
    public final class163 method1135(int arg0, String arg1, int arg2) {
        int var4 = -117 % ((arg0 + 62) / 46);
        return this.method1132(1, 0, (byte) -98, arg2, arg1);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Ljava/lang/String;B)Lsg;")
    public final class163 method1136(String arg0, byte arg1) {
        return arg1 == -101 ? this.method1132(12, 0, (byte) -98, 0, arg0) : null;
    }

    @OriginalMember(owner = "client!j", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class163 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2611) {
                        return;
                    }
                    if (this.field2607 != null) {
                        var2 = this.field2607;
                        this.field2607 = this.field2607.field2593;
                        if (this.field2607 == null) {
                            this.field2612 = null;
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
                int var3 = var2.field2590;
                if (var3 == 1) {
                    if (field2626 > class276.method1861((byte) 122)) {
                        throw new IOException();
                    }
                    var2.field2594 = new Socket(InetAddress.getByName((String) var2.field2591), var2.field2592);
                } else if (var3 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2591);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2592);
                    var2.field2594 = var6;
                } else if (var3 == 4) {
                    if (field2626 > class276.method1861((byte) 122)) {
                        throw new IOException();
                    }
                    var2.field2594 = new DataInputStream(((URL) var2.field2591).openStream());
                } else if (var3 == 8) {
                    Object[] var5 = (Object[]) var2.field2591;
                    var2.field2594 = ((Class) var5[0]).getDeclaredMethod((String) var5[1], (Class[]) var5[2]);
                } else if (var3 == 9) {
                    Object[] var4 = (Object[]) var2.field2591;
                    var2.field2594 = ((Class) var4[0]).getDeclaredField((String) var4[1]);
                } else {
                    throw new Exception();
                }
                var2.field2589 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field2589 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IBILjava/awt/Point;[ILjava/awt/Component;)Lsg;")
    public final class163 method1137(int arg0, byte arg1, int arg2, Point arg3, int[] arg4, Component arg5) {
        int var7 = -110 / ((arg1 + 41) / 35);
        return this.method1132(17, arg0, (byte) -98, arg2, new Object[] { arg5, arg4, arg3 });
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/Class;)Lsg;")
    public final class163 method1138(byte arg0, String arg1, Class arg2) {
        int var4 = 77 / ((-arg0 - 60) / 47);
        return this.method1132(9, 0, (byte) -98, 0, new Object[] { arg2, arg1 });
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Ljava/lang/String;I)Lsg;")
    public final class163 method1139(String arg0, int arg1) {
        if (arg1 > -61) {
            field2626 = 104L;
        }
        return this.method1132(16, 0, (byte) -98, 0, arg0);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IILjava/awt/Component;I)Lsg;")
    public final class163 method1140(int arg0, int arg1, Component arg2, int arg3) {
        Point var5 = arg2.getLocationOnScreen();
        int var6 = 99 / ((arg1 - 69) / 46);
        return this.method1132(14, var5.y + arg3, (byte) -98, var5.x + arg0, (Object) null);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(I)Lal;")
    public final class232 method1141(int arg0) {
        if (arg0 != 6) {
            field2614 = null;
        }
        return this.field2618;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(II)Lsg;")
    public final class163 method1142(int arg0, int arg1) {
        return arg0 == 0 ? this.method1132(3, 0, (byte) -98, arg1, (Object) null) : null;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(BLjava/net/URL;)Lsg;")
    public final class163 method1143(byte arg0, URL arg1) {
        return arg0 == -30 ? this.method1132(4, 0, (byte) -98, 0, arg1) : null;
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(I)V")
    public final void method1144(int arg0) {
        if (arg0 != 5000) {
            field2626 = 103L;
        }
        field2626 = class276.method1861((byte) 122) + 5000L;
    }

    @OriginalMember(owner = "client!j", name = "c", descriptor = "(I)V")
    public final void method1145(int arg0) {
        synchronized (this) {
            this.field2611 = true;
            this.notifyAll();
        }
        try {
            if (arg0 != 9) {
                return;
            }
            this.field2617.join();
        } catch (InterruptedException var8) {
        }
        if (this.field2606 != null) {
            try {
                this.field2606.method1646(arg0 - 9);
            } catch (IOException var7) {
            }
        }
        if (this.field2608 != null) {
            try {
                this.field2608.method1646(0);
            } catch (IOException var6) {
            }
        }
        if (this.field2621 != null) {
            for (int var3 = 0; var3 < this.field2621.length; var3++) {
                if (this.field2621[var3] != null) {
                    try {
                        this.field2621[var3].method1646(0);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field2623 != null) {
            try {
                this.field2623.method1646(0);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(BLjava/awt/Component;Z)Lsg;")
    public final class163 method1146(byte arg0, Component arg1, boolean arg2) {
        if (arg0 != 46) {
            field2625 = null;
        }
        return this.method1132(15, 0, (byte) -98, arg2 ? 1 : 0, arg1);
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
    public class165(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        field2613 = "1.1";
        field2614 = "Unknown";
        this.field2620 = arg0;
        try {
            field2614 = System.getProperty("java.vendor");
            field2613 = System.getProperty("java.version");
        } catch (Exception var12) {
        }
        try {
            field2615 = System.getProperty("os.name");
        } catch (Exception var11) {
            field2615 = "Unknown";
        }
        field2624 = field2615.toLowerCase();
        try {
            field2619 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var10) {
            field2619 = "";
        }
        try {
            field2610 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var9) {
            field2610 = "";
        }
        try {
            field2616 = System.getProperty("user.home");
            if (field2616 != null) {
                field2616 = field2616 + "/";
            }
        } catch (Exception var8) {
        }
        if (field2616 == null) {
            field2616 = "~/";
        }
        try {
            this.field2622 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var7) {
        }
        try {
            if (arg0 == null) {
                field2627 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field2627 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        try {
            if (arg0 == null) {
                field2625 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field2625 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var5) {
        }
        this.field2611 = false;
        this.field2617 = new Thread(this);
        this.field2617.setPriority(10);
        this.field2617.setDaemon(true);
        this.field2617.start();
    }

    static {
        new Hashtable(16);
        field2626 = 0L;
    }
}
