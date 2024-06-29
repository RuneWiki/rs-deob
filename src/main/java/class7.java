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

@OriginalClass("client!bh")
public class class7 implements Runnable {

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "Llg;")
    public class13 field60 = null;

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "Llg;")
    public class13 field58 = null;

    @OriginalMember(owner = "client!bh", name = "n", descriptor = "Lh;")
    private class278 field70 = null;

    @OriginalMember(owner = "client!bh", name = "g", descriptor = "Ljava/applet/Applet;")
    public Applet field63 = null;

    @OriginalMember(owner = "client!bh", name = "p", descriptor = "Z")
    private boolean field72 = false;

    @OriginalMember(owner = "client!bh", name = "h", descriptor = "Lh;")
    private class278 field64 = null;

    @OriginalMember(owner = "client!bh", name = "m", descriptor = "Llg;")
    public class13 field69 = null;

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field59;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "Ljava/lang/Thread;")
    private Thread field57;

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "I")
    public static int field62 = 3;

    @OriginalMember(owner = "client!bh", name = "u", descriptor = "J")
    public static volatile long field77;

    @OriginalMember(owner = "client!bh", name = "j", descriptor = "Lfe;")
    private class261 field66;

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "Ljava/lang/String;")
    public static String field61;

    @OriginalMember(owner = "client!bh", name = "i", descriptor = "Ljava/lang/String;")
    public static String field65;

    @OriginalMember(owner = "client!bh", name = "k", descriptor = "Ljava/lang/String;")
    public static String field67;

    @OriginalMember(owner = "client!bh", name = "l", descriptor = "Ljava/lang/String;")
    public static String field68;

    @OriginalMember(owner = "client!bh", name = "o", descriptor = "Ljava/lang/String;")
    public static String field71;

    @OriginalMember(owner = "client!bh", name = "q", descriptor = "Ljava/lang/String;")
    public static String field73;

    @OriginalMember(owner = "client!bh", name = "s", descriptor = "Ljava/lang/String;")
    private static String field75;

    @OriginalMember(owner = "client!bh", name = "t", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field76;

    @OriginalMember(owner = "client!bh", name = "v", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field78;

    @OriginalMember(owner = "client!bh", name = "r", descriptor = "[Llg;")
    public class13[] field74;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;I[Ljava/lang/Class;)Lh;")
    public final class278 method39(Class arg0, String arg1, int arg2, Class[] arg3) {
        if (arg2 != -8959) {
            this.run();
        }
        return this.method43(0, new Object[] { arg0, arg1, arg3 }, 8, (byte) -127, 0);
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(I)Lh;")
    public final class278 method40(int arg0) {
        if (arg0 != 0) {
            field68 = null;
        }
        return this.method43(0, (Object) null, 18, (byte) -128, 0);
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Ljava/lang/String;I)Lh;")
    public final class278 method41(String arg0, int arg1) {
        if (arg1 != 0) {
            this.method39((Class) null, (String) null, 66, (Class[]) null);
        }
        return this.method43(0, arg0, 12, (byte) -127, 0);
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(BLjava/awt/datatransfer/Transferable;)Lh;")
    public final class278 method42(byte arg0, Transferable arg1) {
        if (arg0 != 96) {
            this.field70 = null;
        }
        return this.method43(0, arg1, 19, (byte) -128, 0);
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(ILjava/lang/Object;IBI)Lh;")
    private final class278 method43(int arg0, Object arg1, int arg2, byte arg3, int arg4) {
        class278 var6 = new class278();
        var6.field4448 = arg0;
        var6.field4447 = arg2;
        var6.field4445 = arg1;
        if (arg3 > -126) {
            this.method54(true, -78, (Component) null);
        }
        synchronized (this) {
            if (this.field70 == null) {
                this.field70 = this.field64 = var6;
            } else {
                this.field70.field4446 = var6;
                this.field70 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "([ILjava/awt/Component;Ljava/awt/Point;IBI)Lh;")
    public final class278 method44(int[] arg0, Component arg1, Point arg2, int arg3, byte arg4, int arg5) {
        if (arg4 != -26) {
            this.method43(-33, (Object) null, 63, (byte) -32, -1);
        }
        return this.method43(arg5, new Object[] { arg1, arg0, arg2 }, 17, (byte) -128, arg3);
    }

    @OriginalMember(owner = "client!bh", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class278 var2;
            synchronized (this) {
                while (true) {
                    if (this.field72) {
                        return;
                    }
                    if (this.field64 != null) {
                        var2 = this.field64;
                        this.field64 = this.field64.field4446;
                        if (this.field64 == null) {
                            this.field70 = null;
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
                int var3 = var2.field4447;
                if (var3 == 1) {
                    if (field77 > class197.method1454((byte) -104)) {
                        throw new IOException();
                    }
                    var2.field4449 = new Socket(InetAddress.getByName((String) var2.field4445), var2.field4448);
                } else if (var3 == 2) {
                    Thread var4 = new Thread((Runnable) var2.field4445);
                    var4.setDaemon(true);
                    var4.start();
                    var4.setPriority(var2.field4448);
                    var2.field4449 = var4;
                } else if (var3 == 4) {
                    if (class197.method1454((byte) -104) < field77) {
                        throw new IOException();
                    }
                    var2.field4449 = new DataInputStream(((URL) var2.field4445).openStream());
                } else if (var3 == 8) {
                    Object[] var9 = (Object[]) var2.field4445;
                    var2.field4449 = ((Class) var9[0]).getDeclaredMethod((String) var9[1], (Class[]) var9[2]);
                } else if (var3 == 9) {
                    Object[] var8 = (Object[]) var2.field4445;
                    var2.field4449 = ((Class) var8[0]).getDeclaredField((String) var8[1]);
                } else if (var3 == 18) {
                    Clipboard var7 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var2.field4449 = var7.getContents((Object) null);
                } else if (var3 == 19) {
                    Transferable var5 = (Transferable) var2.field4445;
                    Clipboard var6 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var6.setContents(var5, (ClipboardOwner) null);
                } else {
                    throw new Exception();
                }
                var2.field4450 = 1;
            } catch (ThreadDeath var13) {
                throw var13;
            } catch (Throwable var14) {
                var2.field4450 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Ljava/lang/Class;ILjava/lang/String;)Lh;")
    public final class278 method45(Class arg0, int arg1, String arg2) {
        if (arg1 != 0) {
            this.method54(true, -78, (Component) null);
        }
        return this.method43(0, new Object[] { arg0, arg2 }, 9, (byte) -127, 0);
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(I)V")
    public final void method46(int arg0) {
        synchronized (this) {
            this.field72 = true;
            this.notifyAll();
        }
        try {
            this.field57.join();
        } catch (InterruptedException var8) {
        }
        if (this.field60 != null) {
            try {
                this.field60.method100(arg0 ^ 0xFFFFFFE0);
            } catch (IOException var7) {
            }
        }
        if (this.field69 != null) {
            try {
                this.field69.method100(127);
            } catch (IOException var6) {
            }
        }
        if (arg0 != 18) {
            field65 = null;
        }
        if (this.field74 != null) {
            for (int var3 = 0; var3 < this.field74.length; var3++) {
                if (this.field74[var3] != null) {
                    try {
                        this.field74[var3].method100(arg0 - 12);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field58 != null) {
            try {
                this.field58.method100(125);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IILjava/lang/String;)Lh;")
    public final class278 method47(int arg0, int arg1, String arg2) {
        if (arg1 < 79) {
            this.field64 = null;
        }
        return this.method43(arg0, arg2, 1, (byte) -128, 0);
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(II)Lh;")
    public final class278 method48(int arg0, int arg1) {
        return arg1 <= 119 ? null : this.method43(arg0, (Object) null, 3, (byte) -128, 0);
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(B)Lfe;")
    public final class261 method49(byte arg0) {
        if (arg0 != 90) {
            this.field59 = null;
        }
        return this.field66;
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(B)V")
    public final void method50(byte arg0) {
        int var2 = 73 / ((arg0 + 83) / 38);
        field77 = class197.method1454((byte) -104) + 5000L;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(ILjava/awt/Component;II)Lh;")
    public final class278 method51(int arg0, Component arg1, int arg2, int arg3) {
        if (arg0 != -8657) {
            this.field66 = null;
        }
        Point var5 = arg1.getLocationOnScreen();
        return this.method43(var5.x + arg3, (Object) null, 14, (byte) -128, var5.y + arg2);
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(Ljava/lang/String;I)Lh;")
    public final class278 method52(String arg0, int arg1) {
        return arg1 >= -30 ? null : this.method43(0, arg0, 16, (byte) -127, 0);
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(ILjava/lang/Runnable;I)Lh;")
    public final class278 method53(int arg0, Runnable arg1, int arg2) {
        int var4 = 27 % ((arg2 - 55) / 61);
        return this.method43(arg0, arg1, 2, (byte) -127, 0);
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(ZILjava/awt/Component;)Lh;")
    public final class278 method54(boolean arg0, int arg1, Component arg2) {
        if (arg1 != 0) {
            this.method41((String) null, -28);
        }
        return this.method43(arg0 ? 1 : 0, arg2, 15, (byte) -128, 0);
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Ljava/net/URL;I)Lh;")
    public final class278 method55(URL arg0, int arg1) {
        return arg1 == 0 ? this.method43(0, arg0, 4, (byte) -128, 0) : null;
    }

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
    public class7(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        this.field63 = arg0;
        field67 = "Unknown";
        field68 = "1.1";
        try {
            field67 = System.getProperty("java.vendor");
            field68 = System.getProperty("java.version");
        } catch (Exception var12) {
        }
        try {
            field61 = System.getProperty("os.name");
        } catch (Exception var11) {
            field61 = "Unknown";
        }
        field73 = field61.toLowerCase();
        try {
            field71 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var10) {
            field71 = "";
        }
        try {
            field65 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var9) {
            field65 = "";
        }
        try {
            field75 = System.getProperty("user.home");
            if (field75 != null) {
                field75 = field75 + "/";
            }
        } catch (Exception var8) {
        }
        if (field75 == null) {
            field75 = "~/";
        }
        try {
            this.field59 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var7) {
        }
        try {
            if (arg0 == null) {
                field76 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field76 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        try {
            if (arg0 == null) {
                field78 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field78 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var5) {
        }
        this.field72 = false;
        this.field57 = new Thread(this);
        this.field57.setPriority(10);
        this.field57.setDaemon(true);
        this.field57.start();
    }

    static {
        new Hashtable(16);
        field77 = 0L;
    }
}
