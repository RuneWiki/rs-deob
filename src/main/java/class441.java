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

@OriginalClass("client!nh")
public class class441 implements Runnable {

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "Ljava/applet/Applet;")
    public Applet field6077 = null;

    @OriginalMember(owner = "client!nh", name = "l", descriptor = "Lib;")
    public class7 field6086 = null;

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "Lib;")
    public class7 field6079 = null;

    @OriginalMember(owner = "client!nh", name = "h", descriptor = "Lph;")
    private class315 field6082 = null;

    @OriginalMember(owner = "client!nh", name = "j", descriptor = "Z")
    private boolean field6084 = false;

    @OriginalMember(owner = "client!nh", name = "r", descriptor = "Lph;")
    private class315 field6092 = null;

    @OriginalMember(owner = "client!nh", name = "k", descriptor = "Lib;")
    public class7 field6085 = null;

    @OriginalMember(owner = "client!nh", name = "p", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field6090;

    @OriginalMember(owner = "client!nh", name = "q", descriptor = "Ljava/lang/Thread;")
    private Thread field6091;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "I")
    public static int field6075 = 3;

    @OriginalMember(owner = "client!nh", name = "t", descriptor = "J")
    public static volatile long field6094;

    @OriginalMember(owner = "client!nh", name = "n", descriptor = "Lfq;")
    private class83 field6088;

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "Ljava/lang/String;")
    public static String field6076;

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "Ljava/lang/String;")
    public static String field6078;

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "Ljava/lang/String;")
    public static String field6080;

    @OriginalMember(owner = "client!nh", name = "g", descriptor = "Ljava/lang/String;")
    public static String field6081;

    @OriginalMember(owner = "client!nh", name = "i", descriptor = "Ljava/lang/String;")
    private static String field6083;

    @OriginalMember(owner = "client!nh", name = "o", descriptor = "Ljava/lang/String;")
    public static String field6089;

    @OriginalMember(owner = "client!nh", name = "s", descriptor = "Ljava/lang/String;")
    public static String field6093;

    @OriginalMember(owner = "client!nh", name = "u", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field6095;

    @OriginalMember(owner = "client!nh", name = "v", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field6096;

    @OriginalMember(owner = "client!nh", name = "m", descriptor = "[Lib;")
    public class7[] field6087;

    @OriginalMember(owner = "client!nh", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class315 var2;
            synchronized (this) {
                while (true) {
                    if (this.field6084) {
                        return;
                    }
                    if (this.field6082 != null) {
                        var2 = this.field6082;
                        this.field6082 = this.field6082.field4240;
                        if (this.field6082 == null) {
                            this.field6092 = null;
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
                int var3 = var2.field4239;
                if (var3 == 1) {
                    if (class164.method1038(8635) < field6094) {
                        throw new IOException();
                    }
                    var2.field4243 = new Socket(InetAddress.getByName((String) var2.field4241), var2.field4242);
                } else if (var3 == 2) {
                    Thread var9 = new Thread((Runnable) var2.field4241);
                    var9.setDaemon(true);
                    var9.start();
                    var9.setPriority(var2.field4242);
                    var2.field4243 = var9;
                } else if (var3 == 4) {
                    if (class164.method1038(8635) < field6094) {
                        throw new IOException();
                    }
                    var2.field4243 = new DataInputStream(((URL) var2.field4241).openStream());
                } else if (var3 == 8) {
                    Object[] var8 = (Object[]) var2.field4241;
                    var2.field4243 = ((Class) var8[0]).getDeclaredMethod((String) var8[1], (Class[]) var8[2]);
                } else if (var3 == 9) {
                    Object[] var4 = (Object[]) var2.field4241;
                    var2.field4243 = ((Class) var4[0]).getDeclaredField((String) var4[1]);
                } else if (var3 == 18) {
                    Clipboard var5 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var2.field4243 = var5.getContents((Object) null);
                } else if (var3 == 19) {
                    Transferable var6 = (Transferable) var2.field4241;
                    Clipboard var7 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var7.setContents(var6, (ClipboardOwner) null);
                } else {
                    throw new Exception("");
                }
                var2.field4244 = 1;
            } catch (ThreadDeath var15) {
                throw var15;
            } catch (Throwable var16) {
                var2.field4244 = 2;
            }
            synchronized (var2) {
                var2.notify();
            }
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)Lph;")
    public final class315 method2710(int arg0) {
        return arg0 == 0 ? this.method2737((Object) null, 0, 13, arg0 - 108, 0) : null;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIILjava/lang/Object;I)Lph;")
    private final class315 method2711(int arg0, int arg1, int arg2, Object arg3, int arg4) {
        class315 var6 = new class315();
        synchronized (var6) {
            int var8 = 111 % ((-arg4 - 20) / 50);
            var6.field4242 = arg2;
            var6.field4241 = arg3;
            var6.field4239 = arg0;
            synchronized (this) {
                if (this.field6092 == null) {
                    this.field6092 = this.field6082 = var6;
                } else {
                    this.field6092.field4240 = var6;
                    this.field6092 = var6;
                }
                this.notify();
            }
            try {
                var6.wait();
            } catch (InterruptedException var10) {
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILjava/lang/Class;)Lph;")
    public final class315 method2712(int arg0, Class arg1) {
        int var3 = -46 % ((arg0 + 16) / 49);
        return this.method2737(arg1, 0, 10, -85, 0);
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(I)Lph;")
    public final class315 method2713(int arg0) {
        if (arg0 != 21) {
            this.method2726(-76);
        }
        return this.method2737((Object) null, 0, 5, 88, 0);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IZLjava/lang/String;)Lph;")
    public final class315 method2714(int arg0, boolean arg1, String arg2) {
        return arg1 ? null : this.method2737(arg2, 0, 1, 90, arg0);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Ljava/lang/Class;Z)Lph;")
    public final class315 method2715(Class arg0, boolean arg1) {
        return arg1 ? this.method2737(arg0, 0, 11, 113, 0) : null;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(BLjava/awt/Component;II)Lph;")
    public final class315 method2716(byte arg0, Component arg1, int arg2, int arg3) {
        Point var5 = arg1.getLocationOnScreen();
        return arg0 < 96 ? null : this.method2737((Object) null, arg3 + var5.y, 14, -91, var5.x + arg2);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Ljava/awt/datatransfer/Transferable;I)Lph;")
    public final class315 method2717(Transferable arg0, int arg1) {
        if (arg1 != 0) {
            field6075 = -8;
        }
        return this.method2737(arg0, 0, 19, 83, 0);
    }

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "(I)V")
    public final void method2718(int arg0) {
        if (arg0 != 18220) {
            field6078 = null;
        }
        field6094 = class164.method1038(8635) + 5000L;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(BLjava/net/URL;)Lph;")
    public final class315 method2719(byte arg0, URL arg1) {
        if (arg0 != -53) {
            this.method2726(86);
        }
        return this.method2737(arg1, 0, 4, 100, 0);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Z)Z")
    public final boolean method2720(boolean arg0) {
        if (arg0) {
            this.method2725(true);
        }
        return false;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ZBLjava/awt/Component;)Lph;")
    public final class315 method2721(boolean arg0, byte arg1, Component arg2) {
        return arg1 >= -125 ? null : this.method2737(arg2, 0, 15, -103, arg0 ? 1 : 0);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Ljava/lang/String;B)[B")
    public final byte[] method2722(String arg0, byte arg1) {
        class315 var3 = this.method2711(21, 0, 0, arg0, -91);
        return arg1 >= -65 ? null : (byte[]) var3.field4243;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Ljava/lang/Class;[Ljava/lang/Class;Ljava/lang/String;I)Lph;")
    public final class315 method2723(Class arg0, Class[] arg1, String arg2, int arg3) {
        if (arg3 != 10) {
            field6094 = -109L;
        }
        return this.method2737(new Object[] { arg0, arg2, arg1 }, 0, 8, arg3 - 116, 0);
    }

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "(I)Lph;")
    public final class315 method2724(int arg0) {
        if (arg0 != 0) {
            this.method2721(false, (byte) -8, (Component) null);
        }
        return this.method2737((Object) null, 0, 12, 75, 0);
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(Z)Lph;")
    public final class315 method2725(boolean arg0) {
        if (arg0) {
            field6089 = null;
        }
        return this.method2737((Object) null, 0, 18, 87, 0);
    }

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "(I)Lfq;")
    public final class83 method2726(int arg0) {
        if (arg0 >= -59) {
            this.method2722((String) null, (byte) 31);
        }
        return this.field6088;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ZLjava/awt/Frame;)Lph;")
    public final class315 method2727(boolean arg0, Frame arg1) {
        return arg0 ? this.method2737(arg1, 0, 7, 83, 0) : null;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIII)Lph;")
    public final class315 method2728(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = -27 / ((arg4 + 28) / 36);
        return this.method2737((Object) null, (arg3 << 16) + arg1, 6, -46, (arg2 << 16) + arg0);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILjava/awt/Point;II[ILjava/awt/Component;)Lph;")
    public final class315 method2729(int arg0, Point arg1, int arg2, int arg3, int[] arg4, Component arg5) {
        if (arg3 != 0) {
            this.method2731((String) null, -49);
        }
        return this.method2737(new Object[] { arg5, arg4, arg1 }, arg0, 17, -30, arg2);
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(ILjava/lang/Class;)Lph;")
    public final class315 method2730(int arg0, Class arg1) {
        return arg0 < 76 ? null : this.method2737(arg1, 0, 20, -100, 0);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Ljava/lang/String;I)Lph;")
    public final class315 method2731(String arg0, int arg1) {
        if (arg1 != 0) {
            this.method2717((Transferable) null, 67);
        }
        return this.method2737(arg0, 0, 21, -36, 0);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(B)V")
    public final void method2732(byte arg0) {
        synchronized (this) {
            this.field6084 = true;
            this.notifyAll();
        }
        try {
            this.field6091.join();
        } catch (InterruptedException var8) {
        }
        if (this.field6086 != null) {
            try {
                this.field6086.method32((byte) -72);
            } catch (IOException var7) {
            }
        }
        if (this.field6085 != null) {
            try {
                this.field6085.method32((byte) -128);
            } catch (IOException var6) {
            }
        }
        if (arg0 <= 53) {
            return;
        }
        if (this.field6087 != null) {
            for (int var3 = 0; var3 < this.field6087.length; var3++) {
                if (this.field6087[var3] != null) {
                    try {
                        this.field6087[var3].method32((byte) -80);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field6079 != null) {
            try {
                this.field6079.method32((byte) -114);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILjava/lang/Runnable;I)Lph;")
    public final class315 method2733(int arg0, Runnable arg1, int arg2) {
        return arg0 == 0 ? this.method2737(arg1, 0, 2, arg0 - 56, arg2) : null;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(II)Lph;")
    public final class315 method2734(int arg0, int arg1) {
        return arg1 == 0 ? this.method2737((Object) null, 0, 3, arg1 ^ 0x6A, arg0) : null;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ZLjava/lang/Class;Ljava/lang/String;)Lph;")
    public final class315 method2735(boolean arg0, Class arg1, String arg2) {
        if (!arg0) {
            this.method2719((byte) -41, (URL) null);
        }
        return this.method2737(new Object[] { arg1, arg2 }, 0, 9, -113, 0);
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(Ljava/lang/String;B)Lph;")
    public final class315 method2736(String arg0, byte arg1) {
        int var3 = 45 % ((arg1 + 51) / 60);
        return this.method2737(arg0, 0, 16, -41, 0);
    }

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
    public class441(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        this.field6077 = arg0;
        field6076 = "Unknown";
        field6078 = "1.1";
        try {
            field6076 = System.getProperty("java.vendor");
            field6078 = System.getProperty("java.version");
        } catch (Exception var12) {
        }
        try {
            field6081 = System.getProperty("os.name");
        } catch (Exception var11) {
            field6081 = "Unknown";
        }
        field6080 = field6081.toLowerCase();
        try {
            field6089 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var10) {
            field6089 = "";
        }
        try {
            field6093 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var9) {
            field6093 = "";
        }
        try {
            field6083 = System.getProperty("user.home");
            if (field6083 != null) {
                field6083 = field6083 + "/";
            }
        } catch (Exception var8) {
        }
        if (field6083 == null) {
            field6083 = "~/";
        }
        try {
            this.field6090 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var7) {
        }
        try {
            if (arg0 == null) {
                field6096 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field6096 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        try {
            if (arg0 == null) {
                field6095 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field6095 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var5) {
        }
        this.field6084 = false;
        this.field6091 = new Thread(this);
        this.field6091.setPriority(10);
        this.field6091.setDaemon(true);
        this.field6091.start();
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Ljava/lang/Object;IIII)Lph;")
    private final class315 method2737(Object arg0, int arg1, int arg2, int arg3, int arg4) {
        class315 var6 = new class315();
        var6.field4241 = arg0;
        var6.field4242 = arg4;
        var6.field4239 = arg2;
        synchronized (this) {
            if (this.field6092 == null) {
                this.field6092 = this.field6082 = var6;
            } else {
                this.field6092.field4240 = var6;
                this.field6092 = var6;
            }
            this.notify();
        }
        int var8 = 88 % ((29 - arg3) / 46);
        return var6;
    }

    static {
        new Hashtable(16);
        field6094 = 0L;
    }
}
