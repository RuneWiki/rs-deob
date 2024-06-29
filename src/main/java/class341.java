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

@OriginalClass("client!gt")
public class class341 implements Runnable {

    @OriginalMember(owner = "client!gt", name = "d", descriptor = "Lri;")
    public class101 field5010 = null;

    @OriginalMember(owner = "client!gt", name = "o", descriptor = "Llf;")
    private class350 field5021 = null;

    @OriginalMember(owner = "client!gt", name = "c", descriptor = "Llf;")
    private class350 field5009 = null;

    @OriginalMember(owner = "client!gt", name = "g", descriptor = "Z")
    private boolean field5013 = false;

    @OriginalMember(owner = "client!gt", name = "m", descriptor = "Lri;")
    public class101 field5019 = null;

    @OriginalMember(owner = "client!gt", name = "e", descriptor = "Lri;")
    public class101 field5011 = null;

    @OriginalMember(owner = "client!gt", name = "q", descriptor = "Ljava/applet/Applet;")
    public Applet field5023 = null;

    @OriginalMember(owner = "client!gt", name = "t", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field5026;

    @OriginalMember(owner = "client!gt", name = "r", descriptor = "Ljava/lang/Thread;")
    private Thread field5024;

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "I")
    public static int field5007 = 3;

    @OriginalMember(owner = "client!gt", name = "v", descriptor = "J")
    public static volatile long field5028;

    @OriginalMember(owner = "client!gt", name = "h", descriptor = "Lkc;")
    private class448 field5014;

    @OriginalMember(owner = "client!gt", name = "b", descriptor = "Ljava/lang/String;")
    private static String field5008;

    @OriginalMember(owner = "client!gt", name = "f", descriptor = "Ljava/lang/String;")
    public static String field5012;

    @OriginalMember(owner = "client!gt", name = "j", descriptor = "Ljava/lang/String;")
    public static String field5016;

    @OriginalMember(owner = "client!gt", name = "k", descriptor = "Ljava/lang/String;")
    public static String field5017;

    @OriginalMember(owner = "client!gt", name = "l", descriptor = "Ljava/lang/String;")
    public static String field5018;

    @OriginalMember(owner = "client!gt", name = "n", descriptor = "Ljava/lang/String;")
    public static String field5020;

    @OriginalMember(owner = "client!gt", name = "p", descriptor = "Ljava/lang/String;")
    public static String field5022;

    @OriginalMember(owner = "client!gt", name = "s", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field5025;

    @OriginalMember(owner = "client!gt", name = "u", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field5027;

    @OriginalMember(owner = "client!gt", name = "i", descriptor = "[Lri;")
    public class101[] field5015;

    static {
        new Hashtable(16);
        field5028 = 0L;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(B)Llf;", line = 3)
    public final class350 method2195(byte arg0) {
        int var2 = 44 / ((58 - arg0) / 38);
        return this.method2218(3, 5, 0, (Object) null, 0);
    }

    @OriginalMember(owner = "client!gt", name = "run", descriptor = "()V", line = 12)
    public final void run() {
        while (true) {
            class350 var2;
            synchronized (this) {
                while (true) {
                    if (this.field5013) {
                        return;
                    }
                    if (this.field5021 != null) {
                        var2 = this.field5021;
                        this.field5021 = this.field5021.field5133;
                        if (this.field5021 == null) {
                            this.field5009 = null;
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
                int var3 = var2.field5131;
                if (var3 == 1) {
                    if (class43.method364(-16756) < field5028) {
                        throw new IOException();
                    }
                    var2.field5129 = new Socket(InetAddress.getByName((String) var2.field5130), var2.field5132);
                } else if (var3 == 2) {
                    Thread var9 = new Thread((Runnable) var2.field5130);
                    var9.setDaemon(true);
                    var9.start();
                    var9.setPriority(var2.field5132);
                    var2.field5129 = var9;
                } else if (var3 == 4) {
                    if (class43.method364(-16756) < field5028) {
                        throw new IOException();
                    }
                    var2.field5129 = new DataInputStream(((URL) var2.field5130).openStream());
                } else if (var3 == 8) {
                    Object[] var8 = (Object[]) var2.field5130;
                    var2.field5129 = ((Class) var8[0]).getDeclaredMethod((String) var8[1], (Class[]) var8[2]);
                } else if (var3 == 9) {
                    Object[] var4 = (Object[]) var2.field5130;
                    var2.field5129 = ((Class) var4[0]).getDeclaredField((String) var4[1]);
                } else if (var3 == 18) {
                    Clipboard var5 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var2.field5129 = var5.getContents((Object) null);
                } else if (var3 == 19) {
                    Transferable var6 = (Transferable) var2.field5130;
                    Clipboard var7 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var7.setContents(var6, (ClipboardOwner) null);
                } else {
                    throw new Exception("");
                }
                var2.field5134 = 1;
            } catch (ThreadDeath var15) {
                throw var15;
            } catch (Throwable var16) {
                var2.field5134 = 2;
            }
            synchronized (var2) {
                var2.notify();
            }
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(Ljava/awt/Point;BLjava/awt/Component;[III)Llf;", line = 132)
    public final class350 method2196(Point arg0, byte arg1, Component arg2, int[] arg3, int arg4, int arg5) {
        int var7 = 79 / ((-arg1 - 29) / 37);
        return this.method2218(3, 17, arg4, new Object[] { arg2, arg3, arg0 }, arg5);
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(I)Lkc;", line = 141)
    public final class448 method2197(int arg0) {
        int var2 = -39 % ((22 - arg0) / 56);
        return this.field5014;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(Ljava/lang/String;I)Llf;", line = 150)
    public final class350 method2198(String arg0, int arg1) {
        if (arg1 != 0) {
            this.method2212(67);
        }
        return this.method2218(arg1 ^ 0x3, 16, 0, arg0, 0);
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(Ljava/awt/Component;IBI)Llf;", line = 166)
    public final class350 method2199(Component arg0, int arg1, byte arg2, int arg3) {
        if (arg2 != 97) {
            field5008 = null;
        }
        Point var5 = arg0.getLocationOnScreen();
        return this.method2218(3, 14, var5.y + arg1, (Object) null, arg3 + var5.x);
    }

    @OriginalMember(owner = "client!gt", name = "b", descriptor = "(I)Llf;", line = 179)
    public final class350 method2200(int arg0) {
        return arg0 == 2 ? this.method2218(arg0 ^ 0x1, 13, 0, (Object) null, 0) : null;
    }

    @OriginalMember(owner = "client!gt", name = "c", descriptor = "(I)V", line = 192)
    public final void method2201(int arg0) {
        if (arg0 != 10000) {
            field5008 = null;
        }
        synchronized (this) {
            this.field5013 = true;
            this.notifyAll();
        }
        try {
            this.field5024.join();
        } catch (InterruptedException var8) {
        }
        if (this.field5010 != null) {
            try {
                this.field5010.method681((byte) 65);
            } catch (IOException var7) {
            }
        }
        if (this.field5011 != null) {
            try {
                this.field5011.method681((byte) 65);
            } catch (IOException var6) {
            }
        }
        if (this.field5015 != null) {
            for (int var3 = 0; var3 < this.field5015.length; var3++) {
                if (this.field5015[var3] != null) {
                    try {
                        this.field5015[var3].method681((byte) 65);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field5019 != null) {
            try {
                this.field5019.method681((byte) 65);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!gt", name = "d", descriptor = "(I)V", line = 248)
    public final void method2202(int arg0) {
        if (arg0 != 27901) {
            this.method2215(33, (String) null, (Class[]) null, (Class) null);
        }
        field5028 = class43.method364(arg0 ^ 0xFFFFD271) + 5000L;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(IBIII)Llf;", line = 261)
    public final class350 method2203(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        int var6 = -44 % ((-arg1 - 60) / 35);
        return this.method2218(3, 6, (arg0 << 16) + arg4, (Object) null, (arg2 << 16) + arg3);
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(IB)Llf;", line = 271)
    public final class350 method2204(int arg0, byte arg1) {
        int var3 = 8 / ((arg1 - 27) / 48);
        return this.method2218(3, 3, 0, (Object) null, arg0);
    }

    @OriginalMember(owner = "client!gt", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V", line = 585)
    public class341(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        this.field5023 = arg0;
        field5020 = "Unknown";
        field5018 = "1.1";
        try {
            field5020 = System.getProperty("java.vendor");
            field5018 = System.getProperty("java.version");
        } catch (Exception var12) {
        }
        try {
            field5022 = System.getProperty("os.name");
        } catch (Exception var11) {
            field5022 = "Unknown";
        }
        field5017 = field5022.toLowerCase();
        try {
            field5016 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var10) {
            field5016 = "";
        }
        try {
            field5012 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var9) {
            field5012 = "";
        }
        try {
            field5008 = System.getProperty("user.home");
            if (field5008 != null) {
                field5008 = field5008 + "/";
            }
        } catch (Exception var8) {
        }
        if (field5008 == null) {
            field5008 = "~/";
        }
        try {
            this.field5026 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var7) {
        }
        try {
            if (arg0 == null) {
                field5027 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field5027 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        try {
            if (arg0 == null) {
                field5025 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field5025 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var5) {
        }
        this.field5013 = false;
        this.field5024 = new Thread(this);
        this.field5024.setPriority(10);
        this.field5024.setDaemon(true);
        this.field5024.start();
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(IBLjava/lang/Object;II)Llf;", line = 289)
    private final class350 method2205(int arg0, byte arg1, Object arg2, int arg3, int arg4) {
        class350 var6 = new class350();
        synchronized (var6) {
            var6.field5132 = arg4;
            var6.field5130 = arg2;
            var6.field5131 = arg0;
            synchronized (this) {
                if (this.field5009 == null) {
                    this.field5009 = this.field5021 = var6;
                } else {
                    this.field5009.field5133 = var6;
                    this.field5009 = var6;
                }
                this.notify();
            }
            if (arg1 <= 93) {
                this.method2201(52);
            }
            try {
                var6.wait();
            } catch (InterruptedException var9) {
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(Ljava/lang/String;IZ)Llf;", line = 326)
    public final class350 method2206(String arg0, int arg1, boolean arg2) {
        if (!arg2) {
            field5020 = null;
        }
        return this.method2218(3, 1, 0, arg0, arg1);
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(ILjava/lang/Class;)Llf;", line = 339)
    public final class350 method2207(int arg0, Class arg1) {
        return arg0 == 0 ? this.method2218(3, 20, 0, arg1, 0) : null;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(BLjava/awt/Frame;)Llf;", line = 350)
    public final class350 method2208(byte arg0, Frame arg1) {
        if (arg0 != 83) {
            this.method2220(-93, (String) null, (Class) null);
        }
        return this.method2218(3, 7, 0, arg1, 0);
    }

    @OriginalMember(owner = "client!gt", name = "b", descriptor = "(Ljava/lang/String;I)Llf;", line = 361)
    public final class350 method2209(String arg0, int arg1) {
        return arg1 < 45 ? null : this.method2218(3, 21, 0, arg0, 0);
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(Ljava/awt/datatransfer/Transferable;B)Llf;", line = 371)
    public final class350 method2210(Transferable arg0, byte arg1) {
        int var3 = -88 / ((arg1 - 18) / 59);
        return this.method2218(3, 19, 0, arg0, 0);
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(Ljava/lang/Class;B)Llf;", line = 384)
    public final class350 method2211(Class arg0, byte arg1) {
        if (arg1 != -56) {
            this.field5021 = null;
        }
        return this.method2218(3, 11, 0, arg0, 0);
    }

    @OriginalMember(owner = "client!gt", name = "e", descriptor = "(I)Z", line = 402)
    public final boolean method2212(int arg0) {
        if (arg0 != -335) {
            field5007 = -24;
        }
        return false;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(ILjava/lang/Runnable;I)Llf;", line = 419)
    public final class350 method2213(int arg0, Runnable arg1, int arg2) {
        if (arg2 != 26744) {
            this.method2221(36, (String) null);
        }
        return this.method2218(3, 2, 0, arg1, arg0);
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(Ljava/net/URL;I)Llf;", line = 433)
    public final class350 method2214(URL arg0, int arg1) {
        if (arg1 != 0) {
            this.method2204(-12, (byte) 18);
        }
        return this.method2218(arg1 ^ 0x3, 4, 0, arg0, 0);
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(ILjava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;)Llf;", line = 444)
    public final class350 method2215(int arg0, String arg1, Class[] arg2, Class arg3) {
        return arg0 == 0 ? this.method2218(arg0 ^ 0x3, 8, 0, new Object[] { arg3, arg1, arg2 }, 0) : null;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(BLjava/lang/Class;)Llf;", line = 455)
    public final class350 method2216(byte arg0, Class arg1) {
        if (arg0 != 62) {
            this.method2207(-79, (Class) null);
        }
        return this.method2218(3, 10, 0, arg1, 0);
    }

    @OriginalMember(owner = "client!gt", name = "f", descriptor = "(I)Llf;", line = 486)
    public final class350 method2217(int arg0) {
        return arg0 >= -93 ? null : this.method2218(3, 12, 0, (Object) null, 0);
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(IIILjava/lang/Object;I)Llf;", line = 499)
    private final class350 method2218(int arg0, int arg1, int arg2, Object arg3, int arg4) {
        class350 var6 = new class350();
        var6.field5130 = arg3;
        if (arg0 != 3) {
            this.method2200(114);
        }
        var6.field5132 = arg4;
        var6.field5131 = arg1;
        synchronized (this) {
            if (this.field5009 == null) {
                this.field5009 = this.field5021 = var6;
            } else {
                this.field5009.field5133 = var6;
                this.field5009 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(IZLjava/awt/Component;)Llf;", line = 537)
    public final class350 method2219(int arg0, boolean arg1, Component arg2) {
        return arg0 == 24717 ? this.method2218(3, 15, 0, arg2, arg1 ? 1 : 0) : null;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Class;)Llf;", line = 551)
    public final class350 method2220(int arg0, String arg1, Class arg2) {
        return arg0 == 0 ? this.method2218(3, 9, 0, new Object[] { arg2, arg1 }, 0) : null;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(ILjava/lang/String;)[B", line = 561)
    public final byte[] method2221(int arg0, String arg1) {
        if (arg0 == 7) {
            class350 var3 = this.method2205(21, (byte) 112, arg1, 0, 0);
            return (byte[]) var3.field5129;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gt", name = "b", descriptor = "(B)Llf;", line = 573)
    public final class350 method2222(byte arg0) {
        int var2 = 83 % ((arg0 - 71) / 53);
        return this.method2218(3, 18, 0, (Object) null, 0);
    }
}
