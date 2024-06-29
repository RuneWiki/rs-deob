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

@OriginalClass("client!rd")
public class class185 implements Runnable {

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "Lts;")
    private class315 field2672 = null;

    @OriginalMember(owner = "client!rd", name = "m", descriptor = "Lts;")
    private class315 field2684 = null;

    @OriginalMember(owner = "client!rd", name = "q", descriptor = "Z")
    private boolean field2688 = false;

    @OriginalMember(owner = "client!rd", name = "n", descriptor = "Ljava/applet/Applet;")
    public Applet field2685 = null;

    @OriginalMember(owner = "client!rd", name = "l", descriptor = "Lmi;")
    public class287 field2683 = null;

    @OriginalMember(owner = "client!rd", name = "r", descriptor = "Lmi;")
    public class287 field2689 = null;

    @OriginalMember(owner = "client!rd", name = "s", descriptor = "Lmi;")
    public class287 field2690 = null;

    @OriginalMember(owner = "client!rd", name = "k", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field2682;

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "Ljava/lang/Thread;")
    private Thread field2676;

    @OriginalMember(owner = "client!rd", name = "o", descriptor = "I")
    public static int field2686 = 3;

    @OriginalMember(owner = "client!rd", name = "v", descriptor = "J")
    public static volatile long field2693;

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "Lmf;")
    private class239 field2673;

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "Ljava/lang/String;")
    public static String field2674;

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "Ljava/lang/String;")
    private static String field2675;

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "Ljava/lang/String;")
    public static String field2677;

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "Ljava/lang/String;")
    public static String field2678;

    @OriginalMember(owner = "client!rd", name = "h", descriptor = "Ljava/lang/String;")
    public static String field2679;

    @OriginalMember(owner = "client!rd", name = "j", descriptor = "Ljava/lang/String;")
    public static String field2681;

    @OriginalMember(owner = "client!rd", name = "p", descriptor = "Ljava/lang/String;")
    public static String field2687;

    @OriginalMember(owner = "client!rd", name = "t", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field2691;

    @OriginalMember(owner = "client!rd", name = "u", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field2692;

    @OriginalMember(owner = "client!rd", name = "i", descriptor = "[Lmi;")
    public class287[] field2680;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Ljava/lang/Object;BIII)Lts;")
    private final class315 method1249(Object arg0, byte arg1, int arg2, int arg3, int arg4) {
        class315 var6 = new class315();
        synchronized (var6) {
            var6.field4496 = arg3;
            if (arg1 < 59) {
                this.run();
            }
            var6.field4499 = arg4;
            var6.field4494 = arg0;
            synchronized (this) {
                if (this.field2684 == null) {
                    this.field2684 = this.field2672 = var6;
                } else {
                    this.field2684.field4495 = var6;
                    this.field2684 = var6;
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

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)Lts;")
    public final class315 method1250(int arg0) {
        return arg0 == -24216 ? this.method1275((Object) null, arg0 + 24273, 0, 0, 18) : null;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IZLjava/awt/Component;)Lts;")
    public final class315 method1251(int arg0, boolean arg1, Component arg2) {
        if (arg0 != -4496) {
            this.method1257((Class) null, 18);
        }
        return this.method1275(arg2, arg0 + 4538, arg1 ? 1 : 0, 0, 15);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILjava/awt/Frame;)Lts;")
    public final class315 method1252(int arg0, Frame arg1) {
        int var3 = -119 / ((arg0 + 38) / 37);
        return this.method1275(arg1, 41, 0, 0, 7);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Ljava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;Z)Lts;")
    public final class315 method1253(String arg0, Class[] arg1, Class arg2, boolean arg3) {
        if (!arg3) {
            this.field2688 = true;
        }
        return this.method1275(new Object[] { arg2, arg0, arg1 }, 89, 0, 0, 8);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILjava/lang/String;)Lts;")
    public final class315 method1254(int arg0, String arg1) {
        if (arg0 != 16) {
            this.method1268((String) null, (byte) 71, 13);
        }
        return this.method1275(arg1, 58, 0, 0, 16);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/Class;)Lts;")
    public final class315 method1255(String arg0, byte arg1, Class arg2) {
        return arg1 == 124 ? this.method1275(new Object[] { arg2, arg0 }, 53, 0, 0, 9) : null;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)Lts;")
    public final class315 method1256(byte arg0) {
        if (arg0 > -2) {
            this.method1264(true);
        }
        return this.method1275((Object) null, 114, 0, 0, 12);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Ljava/lang/Class;I)Lts;")
    public final class315 method1257(Class arg0, int arg1) {
        if (arg1 >= -89) {
            this.method1271((Transferable) null, (byte) -21);
        }
        return this.method1275(arg0, 87, 0, 0, 20);
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(I)V")
    public final void method1258(int arg0) {
        synchronized (this) {
            this.field2688 = true;
            this.notifyAll();
        }
        if (arg0 >= -97) {
            this.field2690 = null;
        }
        try {
            this.field2676.join();
        } catch (InterruptedException var8) {
        }
        if (this.field2683 != null) {
            try {
                this.field2683.method1877(0);
            } catch (IOException var7) {
            }
        }
        if (this.field2690 != null) {
            try {
                this.field2690.method1877(0);
            } catch (IOException var6) {
            }
        }
        if (this.field2680 != null) {
            for (int var3 = 0; var3 < this.field2680.length; var3++) {
                if (this.field2680[var3] != null) {
                    try {
                        this.field2680[var3].method1877(0);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field2689 != null) {
            try {
                this.field2689.method1877(0);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "(I)Lmf;")
    public final class239 method1259(int arg0) {
        return arg0 >= -43 ? null : this.field2673;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(II)Lts;")
    public final class315 method1260(int arg0, int arg1) {
        if (arg0 != 8859) {
            this.run();
        }
        return this.method1275((Object) null, 36, arg1, 0, 3);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIBII)Lts;")
    public final class315 method1261(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg2 <= 16) {
            field2678 = null;
        }
        return this.method1275((Object) null, 127, (arg0 << 16) + arg4, (arg3 << 16) + arg1, 6);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "([ILjava/awt/Point;ILjava/awt/Component;II)Lts;")
    public final class315 method1262(int[] arg0, Point arg1, int arg2, Component arg3, int arg4, int arg5) {
        int var7 = -96 / ((arg5 + 48) / 35);
        return this.method1275(new Object[] { arg3, arg0, arg1 }, 121, arg4, arg2, 17);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(BLjava/lang/String;)Lts;")
    public final class315 method1263(byte arg0, String arg1) {
        if (arg0 != -112) {
            this.field2673 = null;
        }
        return this.method1275(arg1, 75, 0, 0, 21);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Z)Lts;")
    public final class315 method1264(boolean arg0) {
        return arg0 ? this.method1275((Object) null, 93, 0, 0, 13) : null;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIILjava/awt/Component;)Lts;")
    public final class315 method1265(int arg0, int arg1, int arg2, Component arg3) {
        if (arg1 > -81) {
            this.field2672 = null;
        }
        Point var5 = arg3.getLocationOnScreen();
        return this.method1275((Object) null, 83, var5.x + arg2, arg0 - -var5.y, 14);
    }

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "(I)Z")
    public final boolean method1266(int arg0) {
        return arg0 != 21;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Ljava/lang/Class;B)Lts;")
    public final class315 method1267(Class arg0, byte arg1) {
        if (arg1 > -18) {
            this.field2690 = null;
        }
        return this.method1275(arg0, 47, 0, 0, 11);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Ljava/lang/String;BI)Lts;")
    public final class315 method1268(String arg0, byte arg1, int arg2) {
        return arg1 >= -76 ? null : this.method1275(arg0, 47, arg2, 0, 1);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Ljava/lang/String;B)[B")
    public final byte[] method1269(String arg0, byte arg1) {
        if (arg1 != -80) {
            this.method1268((String) null, (byte) -16, -107);
        }
        class315 var3 = this.method1249(arg0, (byte) 67, 0, 21, 0);
        return (byte[]) var3.field4497;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Ljava/net/URL;B)Lts;")
    public final class315 method1270(URL arg0, byte arg1) {
        int var3 = -98 % ((30 - arg1) / 55);
        return this.method1275(arg0, 95, 0, 0, 4);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Ljava/awt/datatransfer/Transferable;B)Lts;")
    public final class315 method1271(Transferable arg0, byte arg1) {
        return arg1 < 33 ? null : this.method1275(arg0, 91, 0, 0, 19);
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(B)Lts;")
    public final class315 method1272(byte arg0) {
        int var2 = 7 % ((arg0 + 86) / 38);
        return this.method1275((Object) null, 72, 0, 0, 5);
    }

    @OriginalMember(owner = "client!rd", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class315 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2688) {
                        return;
                    }
                    if (this.field2672 != null) {
                        var2 = this.field2672;
                        this.field2672 = this.field2672.field4495;
                        if (this.field2672 == null) {
                            this.field2684 = null;
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
                int var3 = var2.field4496;
                if (var3 == 1) {
                    if (field2693 > class175.method1195(127)) {
                        throw new IOException();
                    }
                    var2.field4497 = new Socket(InetAddress.getByName((String) var2.field4494), var2.field4499);
                } else if (var3 == 2) {
                    Thread var9 = new Thread((Runnable) var2.field4494);
                    var9.setDaemon(true);
                    var9.start();
                    var9.setPriority(var2.field4499);
                    var2.field4497 = var9;
                } else if (var3 == 4) {
                    if (class175.method1195(96) < field2693) {
                        throw new IOException();
                    }
                    var2.field4497 = new DataInputStream(((URL) var2.field4494).openStream());
                } else if (var3 == 8) {
                    Object[] var4 = (Object[]) var2.field4494;
                    var2.field4497 = ((Class) var4[0]).getDeclaredMethod((String) var4[1], (Class[]) var4[2]);
                } else if (var3 == 9) {
                    Object[] var8 = (Object[]) var2.field4494;
                    var2.field4497 = ((Class) var8[0]).getDeclaredField((String) var8[1]);
                } else if (var3 == 18) {
                    Clipboard var5 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var2.field4497 = var5.getContents((Object) null);
                } else if (var3 == 19) {
                    Transferable var6 = (Transferable) var2.field4494;
                    Clipboard var7 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var7.setContents(var6, (ClipboardOwner) null);
                } else {
                    throw new Exception("");
                }
                var2.field4498 = 1;
            } catch (ThreadDeath var15) {
                throw var15;
            } catch (Throwable var16) {
                var2.field4498 = 2;
            }
            synchronized (var2) {
                var2.notify();
            }
        }
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(Z)V")
    public final void method1273(boolean arg0) {
        field2693 = class175.method1195(95) + 5000L;
        if (arg0) {
            field2686 = 53;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ZLjava/lang/Class;)Lts;")
    public final class315 method1274(boolean arg0, Class arg1) {
        if (arg0) {
            this.field2672 = null;
        }
        return this.method1275(arg1, 97, 0, 0, 10);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Ljava/lang/Object;IIII)Lts;")
    private final class315 method1275(Object arg0, int arg1, int arg2, int arg3, int arg4) {
        class315 var6 = new class315();
        var6.field4496 = arg4;
        if (arg1 <= 28) {
            this.field2673 = null;
        }
        var6.field4494 = arg0;
        var6.field4499 = arg2;
        synchronized (this) {
            if (this.field2684 == null) {
                this.field2684 = this.field2672 = var6;
            } else {
                this.field2684.field4495 = var6;
                this.field2684 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Ljava/lang/Runnable;IB)Lts;")
    public final class315 method1276(Runnable arg0, int arg1, byte arg2) {
        int var4 = 95 % ((arg2 + 14) / 60);
        return this.method1275(arg0, 54, arg1, 0, 2);
    }

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
    public class185(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        field2681 = "Unknown";
        field2677 = "1.1";
        this.field2685 = arg0;
        try {
            field2681 = System.getProperty("java.vendor");
            field2677 = System.getProperty("java.version");
        } catch (Exception var12) {
        }
        try {
            field2679 = System.getProperty("os.name");
        } catch (Exception var11) {
            field2679 = "Unknown";
        }
        field2678 = field2679.toLowerCase();
        try {
            field2687 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var10) {
            field2687 = "";
        }
        try {
            field2674 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var9) {
            field2674 = "";
        }
        try {
            field2675 = System.getProperty("user.home");
            if (field2675 != null) {
                field2675 = field2675 + "/";
            }
        } catch (Exception var8) {
        }
        if (field2675 == null) {
            field2675 = "~/";
        }
        try {
            this.field2682 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var7) {
        }
        try {
            if (arg0 == null) {
                field2691 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field2691 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        try {
            if (arg0 == null) {
                field2692 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field2692 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var5) {
        }
        this.field2688 = false;
        this.field2676 = new Thread(this);
        this.field2676.setPriority(10);
        this.field2676.setDaemon(true);
        this.field2676.start();
    }

    static {
        new Hashtable(16);
        field2693 = 0L;
    }
}
