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

@OriginalClass("client!gn")
public class class6 implements Runnable {

    @OriginalMember(owner = "client!gn", name = "j", descriptor = "Lea;")
    private class217 field70 = null;

    @OriginalMember(owner = "client!gn", name = "k", descriptor = "Lea;")
    private class217 field71 = null;

    @OriginalMember(owner = "client!gn", name = "i", descriptor = "Lma;")
    public class301 field69 = null;

    @OriginalMember(owner = "client!gn", name = "h", descriptor = "Ljava/applet/Applet;")
    public Applet field68 = null;

    @OriginalMember(owner = "client!gn", name = "r", descriptor = "Z")
    private boolean field78 = false;

    @OriginalMember(owner = "client!gn", name = "m", descriptor = "Lma;")
    public class301 field73 = null;

    @OriginalMember(owner = "client!gn", name = "v", descriptor = "Lma;")
    public class301 field82 = null;

    @OriginalMember(owner = "client!gn", name = "q", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field77;

    @OriginalMember(owner = "client!gn", name = "g", descriptor = "Ljava/lang/Thread;")
    private Thread field67;

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "I")
    public static int field62 = 3;

    @OriginalMember(owner = "client!gn", name = "s", descriptor = "J")
    public static volatile long field79;

    @OriginalMember(owner = "client!gn", name = "p", descriptor = "Lpk;")
    private class120 field76;

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "Ljava/lang/String;")
    public static String field61;

    @OriginalMember(owner = "client!gn", name = "c", descriptor = "Ljava/lang/String;")
    public static String field63;

    @OriginalMember(owner = "client!gn", name = "d", descriptor = "Ljava/lang/String;")
    private static String field64;

    @OriginalMember(owner = "client!gn", name = "e", descriptor = "Ljava/lang/String;")
    public static String field65;

    @OriginalMember(owner = "client!gn", name = "l", descriptor = "Ljava/lang/String;")
    public static String field72;

    @OriginalMember(owner = "client!gn", name = "n", descriptor = "Ljava/lang/String;")
    public static String field74;

    @OriginalMember(owner = "client!gn", name = "o", descriptor = "Ljava/lang/String;")
    public static String field75;

    @OriginalMember(owner = "client!gn", name = "t", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field80;

    @OriginalMember(owner = "client!gn", name = "u", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field81;

    @OriginalMember(owner = "client!gn", name = "f", descriptor = "[Lma;")
    public class301[] field66;

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(I)V", line = 8)
    public final void method27(int arg0) {
        if (arg0 != -6309) {
            this.method40(30, (Runnable) null, -37);
        }
        field79 = class304.method2128((byte) -93) + 5000L;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(Ljava/awt/Component;III)Lea;", line = 18)
    public final class217 method28(Component arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 14) {
            this.field71 = (class217) null;
        }
        Point var5 = arg0.getLocationOnScreen();
        return this.method46(var5.y + arg3, (byte) 68, var5.x + arg1, (Object) null, 14);
    }

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "(I)Lea;", line = 33)
    public final class217 method29(int arg0) {
        if (arg0 != 0) {
            field81 = (Method) null;
        }
        return this.method46(0, (byte) 68, 0, (Object) null, 5);
    }

    @OriginalMember(owner = "client!gn", name = "run", descriptor = "()V", line = 58)
    public final void run() {
        while (true) {
            class217 var2;
            synchronized (this) {
                while (true) {
                    if (this.field78) {
                        return;
                    }
                    if (this.field71 != null) {
                        var2 = this.field71;
                        this.field71 = this.field71.field3493;
                        if (this.field71 == null) {
                            this.field70 = null;
                        }
                        break;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var16) {
                    }
                }
            }
            try {
                int var5 = var2.field3489;
                if (var5 == 1) {
                    if (field79 > class304.method2128((byte) -104)) {
                        throw new IOException();
                    }
                    var2.field3490 = new Socket(InetAddress.getByName((String) var2.field3491), var2.field3492);
                } else if (var5 == 2) {
                    Thread var11 = new Thread((Runnable) var2.field3491);
                    var11.setDaemon(true);
                    var11.start();
                    var11.setPriority(var2.field3492);
                    var2.field3490 = var11;
                } else if (var5 == 4) {
                    if (class304.method2128((byte) -107) < field79) {
                        throw new IOException();
                    }
                    var2.field3490 = new DataInputStream(((URL) var2.field3491).openStream());
                } else if (var5 == 8) {
                    Object[] var10 = (Object[]) ((Object[]) var2.field3491);
                    var2.field3490 = ((Class) var10[0]).getDeclaredMethod((String) var10[1], (Class[]) ((Class[]) var10[2]));
                } else if (var5 == 9) {
                    Object[] var9 = (Object[]) ((Object[]) var2.field3491);
                    var2.field3490 = ((Class) var9[0]).getDeclaredField((String) var9[1]);
                } else if (var5 == 18) {
                    Clipboard var6 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var2.field3490 = var6.getContents((Object) null);
                } else if (var5 == 19) {
                    Transferable var7 = (Transferable) var2.field3491;
                    Clipboard var8 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var8.setContents(var7, (ClipboardOwner) null);
                } else {
                    throw new Exception();
                }
                var2.field3488 = 1;
            } catch (ThreadDeath var14) {
                throw var14;
            } catch (Throwable var15) {
                var2.field3488 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(Ljava/lang/String;I)Lea;", line = 175)
    public final class217 method30(String arg0, int arg1) {
        if (arg1 > -8) {
            this.field76 = (class120) null;
        }
        return this.method46(0, (byte) 68, 0, arg0, 16);
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(BLjava/lang/String;)Lea;", line = 188)
    public final class217 method31(byte arg0, String arg1) {
        if (arg0 >= -46) {
            this.method39((byte) 73, (String) null, (Class) null);
        }
        return this.method46(0, (byte) 68, 0, arg1, 12);
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(ILjava/lang/Class;)Lea;", line = 198)
    public final class217 method32(int arg0, Class arg1) {
        if (arg0 != 0) {
            field75 = (String) null;
        }
        return this.method46(0, (byte) 68, 0, arg1, 10);
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(Ljava/awt/Frame;I)Lea;", line = 209)
    public final class217 method33(Frame arg0, int arg1) {
        if (arg1 != -18369) {
            this.method37(-55, (Component) null, false);
        }
        return this.method46(0, (byte) 68, 0, arg0, 7);
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(ILjava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;)Lea;", line = 221)
    public final class217 method34(int arg0, String arg1, Class[] arg2, Class arg3) {
        if (arg0 != 22252) {
            this.field66 = (class301[]) null;
        }
        return this.method46(0, (byte) 68, 0, new Object[] { arg3, arg1, arg2 }, 8);
    }

    @OriginalMember(owner = "client!gn", name = "c", descriptor = "(I)Z", line = 236)
    public final boolean method35(int arg0) {
        if (arg0 <= 16) {
            this.field71 = (class217) null;
        }
        return false;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(ZLjava/net/URL;)Lea;", line = 249)
    public final class217 method36(boolean arg0, URL arg1) {
        if (!arg0) {
            this.method42((Transferable) null, -77);
        }
        return this.method46(0, (byte) 68, 0, arg1, 4);
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(ILjava/awt/Component;Z)Lea;", line = 259)
    public final class217 method37(int arg0, Component arg1, boolean arg2) {
        return arg0 < 38 ? (class217) null : this.method46(0, (byte) 68, arg2 ? 1 : 0, arg1, 15);
    }

    @OriginalMember(owner = "client!gn", name = "d", descriptor = "(I)V", line = 271)
    public final void method38(int arg0) {
        synchronized (this) {
            this.field78 = true;
            this.notifyAll();
        }
        try {
            this.field67.join();
        } catch (InterruptedException var14) {
        }
        if (this.field82 != null) {
            try {
                this.field82.method2106((byte) -126);
            } catch (IOException var13) {
            }
        }
        if (this.field73 != null) {
            try {
                this.field73.method2106((byte) 36);
            } catch (IOException var12) {
            }
        }
        if (this.field66 != null) {
            for (int var7 = 0; var7 < this.field66.length; var7++) {
                if (this.field66[var7] != null) {
                    try {
                        this.field66[var7].method2106((byte) 57);
                    } catch (IOException var11) {
                    }
                }
            }
        }
        if (this.field69 != null) {
            try {
                this.field69.method2106((byte) 29);
            } catch (IOException var10) {
            }
        }
        if (arg0 != -30896) {
            field79 = 72L;
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/Class;)Lea;", line = 325)
    public final class217 method39(byte arg0, String arg1, Class arg2) {
        if (arg0 != 55) {
            this.method44((int[]) null, -67, 70, (Component) null, (Point) null, -18);
        }
        return this.method46(0, (byte) 68, 0, new Object[] { arg2, arg1 }, 9);
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(ILjava/lang/Runnable;I)Lea;", line = 338)
    public final class217 method40(int arg0, Runnable arg1, int arg2) {
        if (arg2 > -24) {
            this.method46(8, (byte) -119, -87, (Object) null, 46);
        }
        return this.method46(0, (byte) 68, arg0, arg1, 2);
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(ILjava/lang/String;I)Lea;", line = 348)
    public final class217 method41(int arg0, String arg1, int arg2) {
        if (arg2 != -1) {
            this.method37(40, (Component) null, true);
        }
        return this.method46(0, (byte) 68, arg0, arg1, 1);
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(Ljava/awt/datatransfer/Transferable;I)Lea;", line = 360)
    public final class217 method42(Transferable arg0, int arg1) {
        if (arg1 != 19) {
            field65 = (String) null;
        }
        return this.method46(0, (byte) 68, 0, arg0, 19);
    }

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "(ILjava/lang/Class;)Lea;", line = 370)
    public final class217 method43(int arg0, Class arg1) {
        if (arg0 != 1) {
            this.method29(79);
        }
        return this.method46(0, (byte) 68, 0, arg1, 11);
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "([IIILjava/awt/Component;Ljava/awt/Point;I)Lea;", line = 383)
    public final class217 method44(int[] arg0, int arg1, int arg2, Component arg3, Point arg4, int arg5) {
        int var7 = 61 / ((arg1 - 49) / 43);
        return this.method46(arg2, (byte) 68, arg5, new Object[] { arg3, arg0, arg4 }, 17);
    }

    @OriginalMember(owner = "client!gn", name = "e", descriptor = "(I)Lpk;", line = 391)
    public final class120 method45(int arg0) {
        if (arg0 != 1) {
            this.method28((Component) null, -62, -20, 46);
        }
        return this.field76;
    }

    @OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V", line = 507)
    public class6(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        field72 = "Unknown";
        field61 = "1.1";
        this.field68 = arg0;
        try {
            field72 = System.getProperty("java.vendor");
            field61 = System.getProperty("java.version");
        } catch (Exception var20) {
        }
        try {
            field75 = System.getProperty("os.name");
        } catch (Exception var19) {
            field75 = "Unknown";
        }
        field65 = field75.toLowerCase();
        try {
            field63 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var18) {
            field63 = "";
        }
        try {
            field74 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var17) {
            field74 = "";
        }
        try {
            field64 = System.getProperty("user.home");
            if (field64 != null) {
                field64 = field64 + "/";
            }
        } catch (Exception var16) {
        }
        if (field64 == null) {
            field64 = "~/";
        }
        try {
            this.field77 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var15) {
        }
        try {
            if (arg0 == null) {
                field81 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field81 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var14) {
        }
        try {
            if (arg0 == null) {
                field80 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field80 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var13) {
        }
        this.field78 = false;
        this.field67 = new Thread(this);
        this.field67.setPriority(10);
        this.field67.setDaemon(true);
        this.field67.start();
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(IBILjava/lang/Object;I)Lea;", line = 419)
    private final class217 method46(int arg0, byte arg1, int arg2, Object arg3, int arg4) {
        class217 var6 = new class217();
        var6.field3489 = arg4;
        if (arg1 != 68) {
            return (class217) null;
        }
        var6.field3492 = arg2;
        var6.field3491 = arg3;
        synchronized (this) {
            if (this.field70 == null) {
                this.field70 = this.field71 = var6;
            } else {
                this.field70.field3493 = var6;
                this.field70 = var6;
            }
            this.notify();
            return var6;
        }
    }

    static {
        new Hashtable(16);
        field79 = 0L;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(BIIII)Lea;", line = 474)
    public final class217 method47(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        return arg0 == 7 ? this.method46((arg3 << 16) + arg2, (byte) 68, (arg4 << 16) + arg1, (Object) null, 6) : (class217) null;
    }

    @OriginalMember(owner = "client!gn", name = "f", descriptor = "(I)Lea;", line = 485)
    public final class217 method48(int arg0) {
        int var2 = 19 % ((arg0 - 25) / 50);
        return this.method46(0, (byte) 68, 0, (Object) null, 18);
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(II)Lea;", line = 494)
    public final class217 method49(int arg0, int arg1) {
        return arg0 == 3 ? this.method46(0, (byte) 68, arg1, (Object) null, 3) : (class217) null;
    }
}
