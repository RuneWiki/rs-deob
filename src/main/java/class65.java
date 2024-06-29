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

@OriginalClass("client!is")
public class class65 implements Runnable {

    @OriginalMember(owner = "client!is", name = "b", descriptor = "Lor;")
    private class275 field944 = null;

    @OriginalMember(owner = "client!is", name = "c", descriptor = "Lbt;")
    public class324 field945 = null;

    @OriginalMember(owner = "client!is", name = "f", descriptor = "Lbt;")
    public class324 field948 = null;

    @OriginalMember(owner = "client!is", name = "a", descriptor = "Z")
    private boolean field943 = false;

    @OriginalMember(owner = "client!is", name = "d", descriptor = "Lbt;")
    public class324 field946 = null;

    @OriginalMember(owner = "client!is", name = "k", descriptor = "Lor;")
    private class275 field953 = null;

    @OriginalMember(owner = "client!is", name = "r", descriptor = "Ljava/applet/Applet;")
    public Applet field960 = null;

    @OriginalMember(owner = "client!is", name = "m", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field955;

    @OriginalMember(owner = "client!is", name = "n", descriptor = "Ljava/lang/Thread;")
    private Thread field956;

    @OriginalMember(owner = "client!is", name = "s", descriptor = "I")
    public static int field961 = 3;

    @OriginalMember(owner = "client!is", name = "u", descriptor = "J")
    public static volatile long field963;

    @OriginalMember(owner = "client!is", name = "o", descriptor = "Luf;")
    private class322 field957;

    @OriginalMember(owner = "client!is", name = "e", descriptor = "Ljava/lang/String;")
    public static String field947;

    @OriginalMember(owner = "client!is", name = "h", descriptor = "Ljava/lang/String;")
    private static String field950;

    @OriginalMember(owner = "client!is", name = "i", descriptor = "Ljava/lang/String;")
    public static String field951;

    @OriginalMember(owner = "client!is", name = "j", descriptor = "Ljava/lang/String;")
    public static String field952;

    @OriginalMember(owner = "client!is", name = "l", descriptor = "Ljava/lang/String;")
    public static String field954;

    @OriginalMember(owner = "client!is", name = "p", descriptor = "Ljava/lang/String;")
    public static String field958;

    @OriginalMember(owner = "client!is", name = "q", descriptor = "Ljava/lang/String;")
    public static String field959;

    @OriginalMember(owner = "client!is", name = "t", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field962;

    @OriginalMember(owner = "client!is", name = "v", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field964;

    @OriginalMember(owner = "client!is", name = "g", descriptor = "[Lbt;")
    public class324[] field949;

    static {
        new Hashtable(16);
        field963 = 0L;
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;B)Lor;", line = 3)
    public final class275 method593(String arg0, Class arg1, byte arg2) {
        if (arg2 > -94) {
            this.method614(-40);
        }
        return this.method609(9, true, 0, 0, new Object[] { arg1, arg0 });
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(I)V", line = 14)
    public final void method594(int arg0) {
        field963 = class10.method51(-3183) + (long) arg0;
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(IBLjava/lang/String;)Lor;", line = 21)
    public final class275 method595(int arg0, byte arg1, String arg2) {
        if (arg1 != 87) {
            this.method593((String) null, (Class) null, (byte) -101);
        }
        return this.method609(1, true, arg0, 0, arg2);
    }

    @OriginalMember(owner = "client!is", name = "b", descriptor = "(I)Lor;", line = 32)
    public final class275 method596(int arg0) {
        return arg0 == 0 ? this.method609(13, true, 0, 0, (Object) null) : null;
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(ILjava/awt/Frame;)Lor;", line = 42)
    public final class275 method597(int arg0, Frame arg1) {
        if (arg0 != 10479) {
            field958 = null;
        }
        return this.method609(7, true, 0, 0, arg1);
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(Z)Lor;", line = 52)
    public final class275 method598(boolean arg0) {
        if (!arg0) {
            this.method599((Class) null, (Class[]) null, (String) null, (byte) 49);
        }
        return this.method609(18, true, 0, 0, (Object) null);
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(Ljava/lang/Class;[Ljava/lang/Class;Ljava/lang/String;B)Lor;", line = 62)
    public final class275 method599(Class arg0, Class[] arg1, String arg2, byte arg3) {
        return arg3 <= 60 ? null : this.method609(8, true, 0, 0, new Object[] { arg0, arg2, arg1 });
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(ILjava/lang/Class;)Lor;", line = 73)
    public final class275 method600(int arg0, Class arg1) {
        if (arg0 != 0) {
            this.method617(-1, (Object) null, 127, -35, 104);
        }
        return this.method609(11, true, 0, 0, arg1);
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(Ljava/lang/Class;B)Lor;", line = 83)
    public final class275 method601(Class arg0, byte arg1) {
        int var3 = 36 % ((-arg1 - 90) / 35);
        return this.method609(20, true, 0, 0, arg0);
    }

    @OriginalMember(owner = "client!is", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V", line = 579)
    public class65(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        this.field960 = arg0;
        field954 = "1.1";
        field958 = "Unknown";
        try {
            field958 = System.getProperty("java.vendor");
            field954 = System.getProperty("java.version");
        } catch (Exception var12) {
        }
        try {
            field947 = System.getProperty("os.name");
        } catch (Exception var11) {
            field947 = "Unknown";
        }
        field959 = field947.toLowerCase();
        try {
            field952 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var10) {
            field952 = "";
        }
        try {
            field951 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var9) {
            field951 = "";
        }
        try {
            field950 = System.getProperty("user.home");
            if (field950 != null) {
                field950 = field950 + "/";
            }
        } catch (Exception var8) {
        }
        if (field950 == null) {
            field950 = "~/";
        }
        try {
            this.field955 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var7) {
        }
        try {
            if (arg0 == null) {
                field964 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field964 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        try {
            if (arg0 == null) {
                field962 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field962 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var5) {
        }
        this.field943 = false;
        this.field956 = new Thread(this);
        this.field956.setPriority(10);
        this.field956.setDaemon(true);
        this.field956.start();
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(ILjava/lang/String;)Lor;", line = 98)
    public final class275 method602(int arg0, String arg1) {
        int var3 = 25 / ((3 - arg0) / 57);
        return this.method609(16, true, 0, 0, arg1);
    }

    @OriginalMember(owner = "client!is", name = "c", descriptor = "(I)V", line = 108)
    public final void method603(int arg0) {
        synchronized (this) {
            this.field943 = true;
            this.notifyAll();
        }
        try {
            this.field956.join();
        } catch (InterruptedException var8) {
        }
        if (this.field948 != null) {
            try {
                this.field948.method2049(61);
            } catch (IOException var7) {
            }
        }
        if (arg0 >= -72) {
            this.field956 = null;
        }
        if (this.field946 != null) {
            try {
                this.field946.method2049(110);
            } catch (IOException var6) {
            }
        }
        if (this.field949 != null) {
            for (int var3 = 0; var3 < this.field949.length; var3++) {
                if (this.field949[var3] != null) {
                    try {
                        this.field949[var3].method2049(91);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field945 != null) {
            try {
                this.field945.method2049(-82);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(BLjava/awt/datatransfer/Transferable;)Lor;", line = 169)
    public final class275 method604(byte arg0, Transferable arg1) {
        int var3 = 69 % ((arg0 + 41) / 54);
        return this.method609(19, true, 0, 0, arg1);
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(Ljava/lang/String;I)Lor;", line = 181)
    public final class275 method605(String arg0, int arg1) {
        return arg1 == 21 ? this.method609(21, true, 0, 0, arg0) : null;
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(ILjava/awt/Component;BI)Lor;", line = 194)
    public final class275 method606(int arg0, Component arg1, byte arg2, int arg3) {
        if (arg2 != -14) {
            this.method596(-46);
        }
        Point var5 = arg1.getLocationOnScreen();
        return this.method609(14, true, var5.x + arg0, var5.y + arg3, (Object) null);
    }

    @OriginalMember(owner = "client!is", name = "run", descriptor = "()V", line = 207)
    public final void run() {
        while (true) {
            class275 var2;
            synchronized (this) {
                while (true) {
                    if (this.field943) {
                        return;
                    }
                    if (this.field953 != null) {
                        var2 = this.field953;
                        this.field953 = this.field953.field3981;
                        if (this.field953 == null) {
                            this.field944 = null;
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
                int var3 = var2.field3980;
                if (var3 == 1) {
                    if (field963 > class10.method51(-3183)) {
                        throw new IOException();
                    }
                    var2.field3984 = new Socket(InetAddress.getByName((String) var2.field3983), var2.field3982);
                } else if (var3 == 2) {
                    Thread var9 = new Thread((Runnable) var2.field3983);
                    var9.setDaemon(true);
                    var9.start();
                    var9.setPriority(var2.field3982);
                    var2.field3984 = var9;
                } else if (var3 == 4) {
                    if (class10.method51(-3183) < field963) {
                        throw new IOException();
                    }
                    var2.field3984 = new DataInputStream(((URL) var2.field3983).openStream());
                } else if (var3 == 8) {
                    Object[] var4 = (Object[]) var2.field3983;
                    var2.field3984 = ((Class) var4[0]).getDeclaredMethod((String) var4[1], (Class[]) var4[2]);
                } else if (var3 == 9) {
                    Object[] var8 = (Object[]) var2.field3983;
                    var2.field3984 = ((Class) var8[0]).getDeclaredField((String) var8[1]);
                } else if (var3 == 18) {
                    Clipboard var7 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var2.field3984 = var7.getContents((Object) null);
                } else if (var3 == 19) {
                    Transferable var5 = (Transferable) var2.field3983;
                    Clipboard var6 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var6.setContents(var5, (ClipboardOwner) null);
                } else {
                    throw new Exception("");
                }
                var2.field3979 = 1;
            } catch (ThreadDeath var15) {
                throw var15;
            } catch (Throwable var16) {
                var2.field3979 = 2;
            }
            synchronized (var2) {
                var2.notify();
            }
        }
    }

    @OriginalMember(owner = "client!is", name = "d", descriptor = "(I)Z", line = 328)
    public final boolean method607(int arg0) {
        int var2 = -110 / ((-arg0 - 66) / 45);
        return false;
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(Ljava/net/URL;B)Lor;", line = 343)
    public final class275 method608(URL arg0, byte arg1) {
        return arg1 <= 22 ? null : this.method609(4, true, 0, 0, arg0);
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(IZIILjava/lang/Object;)Lor;", line = 363)
    private final class275 method609(int arg0, boolean arg1, int arg2, int arg3, Object arg4) {
        class275 var6 = new class275();
        var6.field3982 = arg2;
        var6.field3983 = arg4;
        if (!arg1) {
            return null;
        }
        var6.field3980 = arg0;
        synchronized (this) {
            if (this.field944 == null) {
                this.field944 = this.field953 = var6;
            } else {
                this.field944.field3981 = var6;
                this.field944 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(IIIII)Lor;", line = 398)
    public final class275 method610(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return arg0 == 0 ? this.method609(6, true, (arg3 << 16) + arg4, (arg2 << 16) + arg1, (Object) null) : null;
    }

    @OriginalMember(owner = "client!is", name = "b", descriptor = "(Z)Lor;", line = 419)
    public final class275 method611(boolean arg0) {
        if (!arg0) {
            this.field948 = null;
        }
        return this.method609(12, true, 0, 0, (Object) null);
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(Ljava/lang/Class;Z)Lor;", line = 430)
    public final class275 method612(Class arg0, boolean arg1) {
        if (arg1) {
            this.method613((Component) null, -20, (Point) null, (int[]) null, -126, -23);
        }
        return this.method609(10, true, 0, 0, arg0);
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(Ljava/awt/Component;ILjava/awt/Point;[III)Lor;", line = 440)
    public final class275 method613(Component arg0, int arg1, Point arg2, int[] arg3, int arg4, int arg5) {
        if (arg4 != -29482) {
            this.method608((URL) null, (byte) 24);
        }
        return this.method609(17, true, arg5, arg1, new Object[] { arg0, arg3, arg2 });
    }

    @OriginalMember(owner = "client!is", name = "e", descriptor = "(I)Luf;", line = 451)
    public final class322 method614(int arg0) {
        int var2 = -64 % ((49 - arg0) / 47);
        return this.field957;
    }

    @OriginalMember(owner = "client!is", name = "f", descriptor = "(I)Lor;", line = 460)
    public final class275 method615(int arg0) {
        if (arg0 != 5712) {
            this.method595(98, (byte) 126, (String) null);
        }
        return this.method609(5, true, 0, 0, (Object) null);
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(Ljava/lang/Runnable;II)Lor;", line = 481)
    public final class275 method616(Runnable arg0, int arg1, int arg2) {
        return arg1 == 1 ? this.method609(2, true, arg2, 0, arg0) : null;
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(ILjava/lang/Object;III)Lor;", line = 492)
    private final class275 method617(int arg0, Object arg1, int arg2, int arg3, int arg4) {
        class275 var6 = new class275();
        if (arg2 >= -113) {
            return null;
        }
        synchronized (var6) {
            var6.field3983 = arg1;
            var6.field3982 = arg3;
            var6.field3980 = arg4;
            synchronized (this) {
                if (this.field944 == null) {
                    this.field944 = this.field953 = var6;
                } else {
                    this.field944.field3981 = var6;
                    this.field944 = var6;
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

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(II)Lor;", line = 530)
    public final class275 method618(int arg0, int arg1) {
        if (arg1 != 0) {
            this.run();
        }
        return this.method609(3, true, arg0, 0, (Object) null);
    }

    @OriginalMember(owner = "client!is", name = "b", descriptor = "(ILjava/lang/String;)[B", line = 542)
    public final byte[] method619(int arg0, String arg1) {
        class275 var3 = this.method617(0, arg1, -125, 0, 21);
        return arg0 == 32222 ? (byte[]) var3.field3984 : null;
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(Ljava/awt/Component;ZI)Lor;", line = 555)
    public final class275 method620(Component arg0, boolean arg1, int arg2) {
        return arg2 == 15 ? this.method609(15, true, arg1 ? 1 : 0, 0, arg0) : null;
    }
}
