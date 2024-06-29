import java.applet.Applet;
import java.awt.Component;
import java.awt.EventQueue;
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

@OriginalClass("client!tl")
public class class69 implements Runnable {

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "Z")
    private boolean field1095 = false;

    @OriginalMember(owner = "client!tl", name = "k", descriptor = "Lnh;")
    public class56 field1104 = null;

    @OriginalMember(owner = "client!tl", name = "e", descriptor = "Lkc;")
    private class301 field1098 = null;

    @OriginalMember(owner = "client!tl", name = "f", descriptor = "Lnh;")
    public class56 field1099 = null;

    @OriginalMember(owner = "client!tl", name = "l", descriptor = "Ljava/applet/Applet;")
    public Applet field1105 = null;

    @OriginalMember(owner = "client!tl", name = "o", descriptor = "Lnh;")
    public class56 field1108 = null;

    @OriginalMember(owner = "client!tl", name = "r", descriptor = "Lkc;")
    private class301 field1111 = null;

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field1096;

    @OriginalMember(owner = "client!tl", name = "n", descriptor = "Ljava/lang/Thread;")
    private Thread field1107;

    @OriginalMember(owner = "client!tl", name = "s", descriptor = "I")
    public static int field1112 = 3;

    @OriginalMember(owner = "client!tl", name = "t", descriptor = "J")
    public static volatile long field1113;

    @OriginalMember(owner = "client!tl", name = "j", descriptor = "Lsb;")
    private class245 field1103;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "Ljava/lang/String;")
    public static String field1094;

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "Ljava/lang/String;")
    public static String field1097;

    @OriginalMember(owner = "client!tl", name = "g", descriptor = "Ljava/lang/String;")
    private static String field1100;

    @OriginalMember(owner = "client!tl", name = "h", descriptor = "Ljava/lang/String;")
    public static String field1101;

    @OriginalMember(owner = "client!tl", name = "m", descriptor = "Ljava/lang/String;")
    public static String field1106;

    @OriginalMember(owner = "client!tl", name = "p", descriptor = "Ljava/lang/String;")
    public static String field1109;

    @OriginalMember(owner = "client!tl", name = "q", descriptor = "Ljava/lang/String;")
    public static String field1110;

    @OriginalMember(owner = "client!tl", name = "u", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field1114;

    @OriginalMember(owner = "client!tl", name = "v", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field1115;

    @OriginalMember(owner = "client!tl", name = "i", descriptor = "[Lnh;")
    public class56[] field1102;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Ljava/lang/String;Z)Lkc;")
    public final class301 method470(String arg0, boolean arg1) {
        if (!arg1) {
            field1113 = 82L;
        }
        return this.method488(16, 0, 0, 0, arg0);
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(ILjava/lang/String;I)Lkc;")
    public final class301 method471(int arg0, String arg1, int arg2) {
        if (arg0 != 22874) {
            this.field1098 = null;
        }
        return this.method488(1, 0, arg2, 0, arg1);
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IBILjava/awt/Component;)Lkc;")
    public final class301 method472(int arg0, byte arg1, int arg2, Component arg3) {
        Point var5 = arg3.getLocationOnScreen();
        int var6 = -83 / ((-arg1 - 56) / 37);
        return this.method488(14, 0, var5.x + arg0, var5.y + arg2, (Object) null);
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Z)Lkc;")
    public final class301 method473(boolean arg0) {
        if (arg0) {
            this.method474(-29, 48);
        }
        return this.method488(18, 0, 0, 0, (Object) null);
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(II)Lkc;")
    public final class301 method474(int arg0, int arg1) {
        int var3 = 115 / ((-arg1 - 2) / 37);
        return this.method488(3, 0, arg0, 0, (Object) null);
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "([Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;I)Lkc;")
    public final class301 method475(Class[] arg0, Class arg1, String arg2, int arg3) {
        if (arg3 != 0) {
            this.method477((URL) null, -36);
        }
        return this.method488(8, 0, 0, 0, new Object[] { arg1, arg2, arg0 });
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Ljava/lang/Class;B)Lkc;")
    public final class301 method476(Class arg0, byte arg1) {
        if (arg1 >= -117) {
            this.method488(42, -6, -34, 1, (Object) null);
        }
        return this.method488(11, 0, 0, 0, arg0);
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Ljava/net/URL;I)Lkc;")
    public final class301 method477(URL arg0, int arg1) {
        return arg1 <= 97 ? null : this.method488(4, 0, 0, 0, arg0);
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(I)V")
    public final void method478(int arg0) {
        field1113 = class264.method1778(6573) + (long) arg0;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(ZLjava/lang/String;)Lkc;")
    public final class301 method479(boolean arg0, String arg1) {
        return arg0 ? this.method488(12, 0, 0, 0, arg1) : null;
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(I)Lsb;")
    public final class245 method480(int arg0) {
        int var2 = 26 % ((arg0 - 39) / 54);
        return this.field1103;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(ILjava/lang/Class;)Lkc;")
    public final class301 method481(int arg0, Class arg1) {
        if (arg0 > -122) {
            this.method488(87, 90, 20, -4, (Object) null);
        }
        return this.method488(20, 0, 0, 0, arg1);
    }

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "(I)V")
    public final void method482(int arg0) {
        synchronized (this) {
            if (arg0 != 0) {
                return;
            }
            this.field1095 = true;
            this.notifyAll();
        }
        try {
            this.field1107.join();
        } catch (InterruptedException var10) {
        }
        if (this.field1108 != null) {
            try {
                this.field1108.method360(-22922);
            } catch (IOException var9) {
            }
        }
        if (this.field1099 != null) {
            try {
                this.field1099.method360(arg0 ^ 0xFFFFA676);
            } catch (IOException var8) {
            }
        }
        if (this.field1102 != null) {
            for (int var3 = 0; var3 < this.field1102.length; var3++) {
                if (this.field1102[var3] != null) {
                    try {
                        this.field1102[var3].method360(-22922);
                    } catch (IOException var7) {
                    }
                }
            }
        }
        if (this.field1104 != null) {
            try {
                this.field1104.method360(-22922);
            } catch (IOException var6) {
            }
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Ljava/awt/Component;ZI)Lkc;")
    public final class301 method483(Component arg0, boolean arg1, int arg2) {
        return arg2 == 26233 ? this.method488(15, 0, arg1 ? 1 : 0, 0, arg0) : null;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Ljava/awt/Point;I[IIBLjava/awt/Component;)Lkc;")
    public final class301 method484(Point arg0, int arg1, int[] arg2, int arg3, byte arg4, Component arg5) {
        return arg4 == 107 ? this.method488(17, arg4 - 107, arg3, arg1, new Object[] { arg5, arg2, arg0 }) : null;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(ILjava/awt/datatransfer/Transferable;)Lkc;")
    public final class301 method485(int arg0, Transferable arg1) {
        if (arg0 != -9263) {
            this.method483((Component) null, false, -89);
        }
        return this.method488(19, 0, 0, 0, arg1);
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;I)Lkc;")
    public final class301 method486(String arg0, Class arg1, int arg2) {
        if (arg2 != 9) {
            this.field1108 = null;
        }
        return this.method488(9, 0, 0, 0, new Object[] { arg1, arg0 });
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IILjava/lang/Runnable;)Lkc;")
    public final class301 method487(int arg0, int arg1, Runnable arg2) {
        if (arg0 != -20349) {
            field1094 = null;
        }
        return this.method488(2, 0, arg1, 0, arg2);
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IIIILjava/lang/Object;)Lkc;")
    private final class301 method488(int arg0, int arg1, int arg2, int arg3, Object arg4) {
        class301 var6 = new class301();
        var6.field4934 = arg2;
        if (arg1 != 0) {
            field1109 = null;
        }
        var6.field4931 = arg0;
        var6.field4933 = arg4;
        synchronized (this) {
            if (this.field1098 == null) {
                this.field1098 = this.field1111 = var6;
            } else {
                this.field1098.field4932 = var6;
                this.field1098 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!tl", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
    public class69(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        field1110 = "1.1";
        field1097 = "Unknown";
        this.field1105 = arg0;
        try {
            field1097 = System.getProperty("java.vendor");
            field1110 = System.getProperty("java.version");
        } catch (Exception var12) {
        }
        try {
            field1106 = System.getProperty("os.name");
        } catch (Exception var11) {
            field1106 = "Unknown";
        }
        field1109 = field1106.toLowerCase();
        try {
            field1101 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var10) {
            field1101 = "";
        }
        try {
            field1094 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var9) {
            field1094 = "";
        }
        try {
            field1100 = System.getProperty("user.home");
            if (field1100 != null) {
                field1100 = field1100 + "/";
            }
        } catch (Exception var8) {
        }
        if (field1100 == null) {
            field1100 = "~/";
        }
        try {
            this.field1096 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var7) {
        }
        try {
            if (arg0 == null) {
                field1115 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field1115 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        try {
            if (arg0 == null) {
                field1114 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field1114 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var5) {
        }
        this.field1095 = false;
        this.field1107 = new Thread(this);
        this.field1107.setPriority(10);
        this.field1107.setDaemon(true);
        this.field1107.start();
    }

    @OriginalMember(owner = "client!tl", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class301 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1095) {
                        return;
                    }
                    if (this.field1111 != null) {
                        var2 = this.field1111;
                        this.field1111 = this.field1111.field4932;
                        if (this.field1111 == null) {
                            this.field1098 = null;
                        }
                        break;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var15) {
                    }
                }
            }
            try {
                int var3 = var2.field4931;
                if (var3 == 1) {
                    if (class264.method1778(6573) < field1113) {
                        throw new IOException();
                    }
                    var2.field4930 = new Socket(InetAddress.getByName((String) var2.field4933), var2.field4934);
                } else if (var3 == 2) {
                    Thread var9 = new Thread((Runnable) var2.field4933);
                    var9.setDaemon(true);
                    var9.start();
                    var9.setPriority(var2.field4934);
                    var2.field4930 = var9;
                } else if (var3 == 4) {
                    if (class264.method1778(6573) < field1113) {
                        throw new IOException();
                    }
                    var2.field4930 = new DataInputStream(((URL) var2.field4933).openStream());
                } else if (var3 == 8) {
                    Object[] var4 = (Object[]) var2.field4933;
                    var2.field4930 = ((Class) var4[0]).getDeclaredMethod((String) var4[1], (Class[]) var4[2]);
                } else if (var3 == 9) {
                    Object[] var8 = (Object[]) var2.field4933;
                    var2.field4930 = ((Class) var8[0]).getDeclaredField((String) var8[1]);
                } else if (var3 == 18) {
                    Clipboard var7 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var2.field4930 = var7.getContents((Object) null);
                } else if (var3 == 19) {
                    Transferable var5 = (Transferable) var2.field4933;
                    Clipboard var6 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var6.setContents(var5, (ClipboardOwner) null);
                } else {
                    throw new Exception();
                }
                var2.field4929 = 1;
            } catch (ThreadDeath var13) {
                throw var13;
            } catch (Throwable var14) {
                var2.field4929 = 2;
            }
        }
    }

    static {
        new Hashtable(16);
        field1113 = 0L;
    }
}
