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

@OriginalClass("client!lh")
public class class286 implements Runnable {

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "Ljava/applet/Applet;")
    public Applet field5113 = null;

    @OriginalMember(owner = "client!lh", name = "i", descriptor = "Lwd;")
    private class22 field5118 = null;

    @OriginalMember(owner = "client!lh", name = "h", descriptor = "Lfg;")
    public class12 field5117 = null;

    @OriginalMember(owner = "client!lh", name = "k", descriptor = "Lfg;")
    public class12 field5120 = null;

    @OriginalMember(owner = "client!lh", name = "o", descriptor = "Lwd;")
    private class22 field5124 = null;

    @OriginalMember(owner = "client!lh", name = "s", descriptor = "Z")
    private boolean field5128 = false;

    @OriginalMember(owner = "client!lh", name = "n", descriptor = "Lfg;")
    public class12 field5123 = null;

    @OriginalMember(owner = "client!lh", name = "p", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field5125;

    @OriginalMember(owner = "client!lh", name = "r", descriptor = "Ljava/lang/Thread;")
    private Thread field5127;

    @OriginalMember(owner = "client!lh", name = "m", descriptor = "I")
    public static int field5122 = 3;

    @OriginalMember(owner = "client!lh", name = "t", descriptor = "J")
    public static volatile long field5129;

    @OriginalMember(owner = "client!lh", name = "g", descriptor = "Luk;")
    private class98 field5116;

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "Ljava/lang/String;")
    public static String field5111;

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "Ljava/lang/String;")
    public static String field5112;

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "Ljava/lang/String;")
    public static String field5114;

    @OriginalMember(owner = "client!lh", name = "f", descriptor = "Ljava/lang/String;")
    private static String field5115;

    @OriginalMember(owner = "client!lh", name = "j", descriptor = "Ljava/lang/String;")
    public static String field5119;

    @OriginalMember(owner = "client!lh", name = "l", descriptor = "Ljava/lang/String;")
    public static String field5121;

    @OriginalMember(owner = "client!lh", name = "q", descriptor = "Ljava/lang/String;")
    public static String field5126;

    @OriginalMember(owner = "client!lh", name = "u", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field5130;

    @OriginalMember(owner = "client!lh", name = "v", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field5131;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "[Lfg;")
    public class12[] field5110;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(ILjava/net/URL;)Lwd;")
    public final class22 method1951(int arg0, URL arg1) {
        if (arg0 != 2828) {
            this.method1961((byte) 114, (String) null);
        }
        return this.method1957(4, 0, (byte) -71, 0, arg1);
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)Luk;")
    public final class98 method1952(int arg0) {
        return arg0 == -7407 ? this.field5116 : null;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "([Ljava/lang/Class;Ljava/lang/Class;ZLjava/lang/String;)Lwd;")
    public final class22 method1953(Class[] arg0, Class arg1, boolean arg2, String arg3) {
        return arg2 ? null : this.method1957(8, 0, (byte) -71, 0, new Object[] { arg1, arg3, arg0 });
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IZLjava/awt/Component;)Lwd;")
    public final class22 method1954(int arg0, boolean arg1, Component arg2) {
        if (arg0 != -23259) {
            this.field5118 = null;
        }
        return this.method1957(15, 0, (byte) -71, arg1 ? 1 : 0, arg2);
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Z)V")
    public final void method1955(boolean arg0) {
        synchronized (this) {
            this.field5128 = true;
            if (arg0) {
                return;
            }
            this.notifyAll();
        }
        try {
            this.field5127.join();
        } catch (InterruptedException var10) {
        }
        if (this.field5123 != null) {
            try {
                this.field5123.method52(-7802);
            } catch (IOException var9) {
            }
        }
        if (this.field5120 != null) {
            try {
                this.field5120.method52(-7802);
            } catch (IOException var8) {
            }
        }
        if (this.field5110 != null) {
            for (int var3 = 0; var3 < this.field5110.length; var3++) {
                if (this.field5110[var3] != null) {
                    try {
                        this.field5110[var3].method52(-7802);
                    } catch (IOException var7) {
                    }
                }
            }
        }
        if (this.field5117 != null) {
            try {
                this.field5117.method52(-7802);
            } catch (IOException var6) {
            }
        }
    }

    @OriginalMember(owner = "client!lh", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class22 var2;
            synchronized (this) {
                while (true) {
                    if (this.field5128) {
                        return;
                    }
                    if (this.field5118 != null) {
                        var2 = this.field5118;
                        this.field5118 = this.field5118.field288;
                        if (this.field5118 == null) {
                            this.field5124 = null;
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
                int var3 = var2.field287;
                if (var3 == 1) {
                    if (class28.method155((byte) 119) < field5129) {
                        throw new IOException();
                    }
                    var2.field292 = new Socket(InetAddress.getByName((String) var2.field289), var2.field291);
                } else if (var3 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field289);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field291);
                    var2.field292 = var6;
                } else if (var3 == 4) {
                    if (class28.method155((byte) 100) < field5129) {
                        throw new IOException();
                    }
                    var2.field292 = new DataInputStream(((URL) var2.field289).openStream());
                } else if (var3 == 8) {
                    Object[] var4 = (Object[]) var2.field289;
                    var2.field292 = ((Class) var4[0]).getDeclaredMethod((String) var4[1], (Class[]) var4[2]);
                } else if (var3 == 9) {
                    Object[] var5 = (Object[]) var2.field289;
                    var2.field292 = ((Class) var5[0]).getDeclaredField((String) var5[1]);
                } else {
                    throw new Exception();
                }
                var2.field290 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field290 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Ljava/awt/Component;IBI)Lwd;")
    public final class22 method1956(Component arg0, int arg1, byte arg2, int arg3) {
        if (arg2 < 48) {
            return null;
        } else {
            Point var5 = arg0.getLocationOnScreen();
            return this.method1957(14, var5.y + arg3, (byte) -71, arg1 + var5.x, (Object) null);
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIBILjava/lang/Object;)Lwd;")
    private final class22 method1957(int arg0, int arg1, byte arg2, int arg3, Object arg4) {
        class22 var6 = new class22();
        var6.field291 = arg3;
        var6.field289 = arg4;
        var6.field287 = arg0;
        synchronized (this) {
            if (this.field5124 == null) {
                this.field5124 = this.field5118 = var6;
            } else {
                this.field5124.field288 = var6;
                this.field5124 = var6;
            }
            if (arg2 != -71) {
                this.field5113 = null;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(II)Lwd;")
    public final class22 method1958(int arg0, int arg1) {
        return arg0 > -13 ? null : this.method1957(3, 0, (byte) -71, arg1, (Object) null);
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(BILjava/lang/String;)Lwd;")
    public final class22 method1959(byte arg0, int arg1, String arg2) {
        int var4 = -77 % ((arg0 - 67) / 51);
        return this.method1957(1, 0, (byte) -71, arg1, arg2);
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(ILjava/lang/Runnable;B)Lwd;")
    public final class22 method1960(int arg0, Runnable arg1, byte arg2) {
        return arg2 > -22 ? null : this.method1957(2, 0, (byte) -71, arg0, arg1);
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(BLjava/lang/String;)Lwd;")
    public final class22 method1961(byte arg0, String arg1) {
        if (arg0 < 38) {
            this.method1963((Class) null, -79, (String) null);
        }
        return this.method1957(12, 0, (byte) -71, 0, arg1);
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Ljava/awt/Component;III[ILjava/awt/Point;)Lwd;")
    public final class22 method1962(Component arg0, int arg1, int arg2, int arg3, int[] arg4, Point arg5) {
        if (arg3 != 5292) {
            this.field5125 = null;
        }
        return this.method1957(17, arg1, (byte) -71, arg2, new Object[] { arg0, arg4, arg5 });
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Ljava/lang/Class;ILjava/lang/String;)Lwd;")
    public final class22 method1963(Class arg0, int arg1, String arg2) {
        if (arg1 != 0) {
            this.method1959((byte) 100, 47, (String) null);
        }
        return this.method1957(9, 0, (byte) -71, 0, new Object[] { arg0, arg2 });
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(ILjava/lang/String;)Lwd;")
    public final class22 method1964(int arg0, String arg1) {
        if (arg0 != 2) {
            this.field5116 = null;
        }
        return this.method1957(16, 0, (byte) -71, 0, arg1);
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(I)V")
    public final void method1965(int arg0) {
        if (arg0 < 41) {
            field5114 = null;
        }
        field5129 = class28.method155((byte) -64) + 5000L;
    }

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
    public class286(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        field5114 = "1.1";
        this.field5113 = arg0;
        field5126 = "Unknown";
        try {
            field5126 = System.getProperty("java.vendor");
            field5114 = System.getProperty("java.version");
        } catch (Exception var12) {
        }
        try {
            field5119 = System.getProperty("os.name");
        } catch (Exception var11) {
            field5119 = "Unknown";
        }
        field5121 = field5119.toLowerCase();
        try {
            field5111 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var10) {
            field5111 = "";
        }
        try {
            field5112 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var9) {
            field5112 = "";
        }
        try {
            field5115 = System.getProperty("user.home");
            if (field5115 != null) {
                field5115 = field5115 + "/";
            }
        } catch (Exception var8) {
        }
        if (field5115 == null) {
            field5115 = "~/";
        }
        try {
            this.field5125 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var7) {
        }
        try {
            if (arg0 == null) {
                field5130 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field5130 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        try {
            if (arg0 == null) {
                field5131 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field5131 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var5) {
        }
        this.field5128 = false;
        this.field5127 = new Thread(this);
        this.field5127.setPriority(10);
        this.field5127.setDaemon(true);
        this.field5127.start();
    }

    static {
        new Hashtable(16);
        field5129 = 0L;
    }
}
