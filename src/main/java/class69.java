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

@OriginalClass("client!pm")
public class class69 implements Runnable {

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "Lkd;")
    public class77 field872 = null;

    @OriginalMember(owner = "client!pm", name = "i", descriptor = "Lkd;")
    public class77 field879 = null;

    @OriginalMember(owner = "client!pm", name = "h", descriptor = "Lvk;")
    private class188 field878 = null;

    @OriginalMember(owner = "client!pm", name = "k", descriptor = "Lvk;")
    private class188 field881 = null;

    @OriginalMember(owner = "client!pm", name = "j", descriptor = "Lkd;")
    public class77 field880 = null;

    @OriginalMember(owner = "client!pm", name = "p", descriptor = "Z")
    private boolean field886 = false;

    @OriginalMember(owner = "client!pm", name = "m", descriptor = "Ljava/applet/Applet;")
    public Applet field883 = null;

    @OriginalMember(owner = "client!pm", name = "v", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field892;

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "Ljava/lang/Thread;")
    private Thread field873;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "I")
    public static int field871 = 3;

    @OriginalMember(owner = "client!pm", name = "s", descriptor = "J")
    public static volatile long field889;

    @OriginalMember(owner = "client!pm", name = "q", descriptor = "Lle;")
    private class278 field887;

    @OriginalMember(owner = "client!pm", name = "d", descriptor = "Ljava/lang/String;")
    public static String field874;

    @OriginalMember(owner = "client!pm", name = "e", descriptor = "Ljava/lang/String;")
    private static String field875;

    @OriginalMember(owner = "client!pm", name = "f", descriptor = "Ljava/lang/String;")
    public static String field876;

    @OriginalMember(owner = "client!pm", name = "g", descriptor = "Ljava/lang/String;")
    public static String field877;

    @OriginalMember(owner = "client!pm", name = "l", descriptor = "Ljava/lang/String;")
    public static String field882;

    @OriginalMember(owner = "client!pm", name = "n", descriptor = "Ljava/lang/String;")
    public static String field884;

    @OriginalMember(owner = "client!pm", name = "o", descriptor = "Ljava/lang/String;")
    public static String field885;

    @OriginalMember(owner = "client!pm", name = "r", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field888;

    @OriginalMember(owner = "client!pm", name = "t", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field890;

    @OriginalMember(owner = "client!pm", name = "u", descriptor = "[Lkd;")
    public class77[] field891;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIILjava/awt/Component;)Lvk;", line = 7)
    public final class188 method490(int arg0, int arg1, int arg2, Component arg3) {
        if (arg1 == 14) {
            Point var5 = arg3.getLocationOnScreen();
            return this.method513(14, var5.x + arg0, (Object) null, arg1 ^ 0x64F6, var5.y + arg2);
        } else {
            return (class188) null;
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(ZLjava/lang/String;Ljava/lang/Class;)Lvk;", line = 19)
    public final class188 method491(boolean arg0, String arg1, Class arg2) {
        return arg0 ? this.method513(9, 0, new Object[] { arg2, arg1 }, 25848, 0) : (class188) null;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIIBI)Lvk;", line = 32)
    public final class188 method492(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        int var6 = -88 / ((-arg3 - 20) / 60);
        return this.method513(6, (arg1 << 16) + arg2, (Object) null, 25848, (arg4 << 16) + arg0);
    }

    static {
        new Hashtable(16);
        field889 = 0L;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Ljava/awt/Frame;Z)Lvk;", line = 47)
    public final class188 method493(Frame arg0, boolean arg1) {
        return arg1 ? (class188) null : this.method513(7, 0, arg0, 25848, 0);
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IZLjava/lang/Runnable;)Lvk;", line = 61)
    public final class188 method494(int arg0, boolean arg1, Runnable arg2) {
        return arg1 ? this.method513(2, arg0, arg2, 25848, 0) : (class188) null;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(ILjava/lang/Class;)Lvk;", line = 73)
    public final class188 method495(int arg0, Class arg1) {
        int var3 = -55 / ((-arg0 - 8) / 61);
        return this.method513(10, 0, arg1, 25848, 0);
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(ILjava/awt/datatransfer/Transferable;)Lvk;", line = 85)
    public final class188 method496(int arg0, Transferable arg1) {
        if (arg0 != 0) {
            this.method497((byte) 103);
        }
        return this.method513(19, 0, arg1, arg0 ^ 0x64F8, 0);
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(B)V", line = 96)
    public final void method497(byte arg0) {
        synchronized (this) {
            this.field886 = true;
            int var3 = -109 % ((arg0 - 13) / 35);
            this.notifyAll();
        }
        try {
            this.field873.join();
        } catch (InterruptedException var15) {
        }
        if (this.field879 != null) {
            try {
                this.field879.method554(-1);
            } catch (IOException var14) {
            }
        }
        if (this.field872 != null) {
            try {
                this.field872.method554(-1);
            } catch (IOException var13) {
            }
        }
        if (this.field891 != null) {
            for (int var8 = 0; var8 < this.field891.length; var8++) {
                if (this.field891[var8] != null) {
                    try {
                        this.field891[var8].method554(-1);
                    } catch (IOException var12) {
                    }
                }
            }
        }
        if (this.field880 != null) {
            try {
                this.field880.method554(-1);
            } catch (IOException var11) {
            }
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Ljava/lang/Class;I)Lvk;", line = 158)
    public final class188 method498(Class arg0, int arg1) {
        int var3 = 52 % ((arg1 - 15) / 34);
        return this.method513(11, 0, arg0, 25848, 0);
    }

    @OriginalMember(owner = "client!pm", name = "run", descriptor = "()V", line = 169)
    public final void run() {
        while (true) {
            class188 var2;
            synchronized (this) {
                while (true) {
                    if (this.field886) {
                        return;
                    }
                    if (this.field878 != null) {
                        var2 = this.field878;
                        this.field878 = this.field878.field2607;
                        if (this.field878 == null) {
                            this.field881 = null;
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
                int var5 = var2.field2609;
                if (var5 == 1) {
                    if (class6.method37(10828) < field889) {
                        throw new IOException();
                    }
                    var2.field2606 = new Socket(InetAddress.getByName((String) var2.field2604), var2.field2605);
                } else if (var5 == 2) {
                    Thread var11 = new Thread((Runnable) var2.field2604);
                    var11.setDaemon(true);
                    var11.start();
                    var11.setPriority(var2.field2605);
                    var2.field2606 = var11;
                } else if (var5 == 4) {
                    if (field889 > class6.method37(10828)) {
                        throw new IOException();
                    }
                    var2.field2606 = new DataInputStream(((URL) var2.field2604).openStream());
                } else if (var5 == 8) {
                    Object[] var6 = (Object[]) ((Object[]) var2.field2604);
                    var2.field2606 = ((Class) var6[0]).getDeclaredMethod((String) var6[1], (Class[]) ((Class[]) var6[2]));
                } else if (var5 == 9) {
                    Object[] var7 = (Object[]) ((Object[]) var2.field2604);
                    var2.field2606 = ((Class) var7[0]).getDeclaredField((String) var7[1]);
                } else if (var5 == 18) {
                    Clipboard var8 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var2.field2606 = var8.getContents((Object) null);
                } else if (var5 == 19) {
                    Transferable var9 = (Transferable) var2.field2604;
                    Clipboard var10 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var10.setContents(var9, (ClipboardOwner) null);
                } else {
                    throw new Exception();
                }
                var2.field2608 = 1;
            } catch (ThreadDeath var14) {
                throw var14;
            } catch (Throwable var15) {
                var2.field2608 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(BI)Lvk;", line = 286)
    public final class188 method499(byte arg0, int arg1) {
        return arg0 == -73 ? this.method513(3, arg1, (Object) null, arg0 + 25921, 0) : (class188) null;
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(B)Lvk;", line = 296)
    public final class188 method500(byte arg0) {
        if (arg0 > -107) {
            this.field887 = (class278) null;
        }
        return this.method513(18, 0, (Object) null, 25848, 0);
    }

    @OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V", line = 515)
    public class69(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        field877 = "1.1";
        this.field883 = arg0;
        field885 = "Unknown";
        try {
            field885 = System.getProperty("java.vendor");
            field877 = System.getProperty("java.version");
        } catch (Exception var20) {
        }
        try {
            field876 = System.getProperty("os.name");
        } catch (Exception var19) {
            field876 = "Unknown";
        }
        field882 = field876.toLowerCase();
        try {
            field874 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var18) {
            field874 = "";
        }
        try {
            field884 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var17) {
            field884 = "";
        }
        try {
            field875 = System.getProperty("user.home");
            if (field875 != null) {
                field875 = field875 + "/";
            }
        } catch (Exception var16) {
        }
        if (field875 == null) {
            field875 = "~/";
        }
        try {
            this.field892 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var15) {
        }
        try {
            if (arg0 == null) {
                field890 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field890 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var14) {
        }
        try {
            if (arg0 == null) {
                field888 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field888 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var13) {
        }
        this.field886 = false;
        this.field873 = new Thread(this);
        this.field873.setPriority(10);
        this.field873.setDaemon(true);
        this.field873.start();
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Ljava/awt/Component;ZI)Lvk;", line = 310)
    public final class188 method501(Component arg0, boolean arg1, int arg2) {
        if (arg2 >= -15) {
            this.method504((String) null, (byte) -125);
        }
        return this.method513(15, arg1 ? 1 : 0, arg0, 25848, 0);
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/Class;[Ljava/lang/Class;)Lvk;", line = 330)
    public final class188 method502(String arg0, byte arg1, Class arg2, Class[] arg3) {
        return arg1 < 26 ? (class188) null : this.method513(8, 0, new Object[] { arg2, arg0, arg3 }, 25848, 0);
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(Ljava/lang/Class;I)Lvk;", line = 342)
    public final class188 method503(Class arg0, int arg1) {
        if (arg1 >= -48) {
            this.method509((byte) 59);
        }
        return this.method513(20, 0, arg0, 25848, 0);
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Ljava/lang/String;B)Lvk;", line = 354)
    public final class188 method504(String arg0, byte arg1) {
        return arg1 == -88 ? this.method513(16, 0, arg0, 25848, 0) : (class188) null;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(ILjava/lang/String;I)Lvk;", line = 374)
    public final class188 method505(int arg0, String arg1, int arg2) {
        if (arg0 != 19) {
            this.method509((byte) 121);
        }
        return this.method513(1, arg2, arg1, 25848, 0);
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(I)Lvk;", line = 385)
    public final class188 method506(int arg0) {
        if (arg0 != -4785) {
            this.field887 = (class278) null;
        }
        return this.method513(5, 0, (Object) null, arg0 + 30633, 0);
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Ljava/net/URL;I)Lvk;", line = 396)
    public final class188 method507(URL arg0, int arg1) {
        return arg1 < 66 ? (class188) null : this.method513(4, 0, arg0, 25848, 0);
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(Ljava/lang/String;B)Lvk;", line = 406)
    public final class188 method508(String arg0, byte arg1) {
        return arg1 == -92 ? this.method513(12, 0, arg0, 25848, 0) : (class188) null;
    }

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "(B)Z", line = 428)
    public final boolean method509(byte arg0) {
        int var2 = 60 % ((arg0 + 34) / 54);
        return false;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(BLjava/awt/Point;I[IILjava/awt/Component;)Lvk;", line = 437)
    public final class188 method510(byte arg0, Point arg1, int arg2, int[] arg3, int arg4, Component arg5) {
        int var7 = 81 / ((68 - arg0) / 58);
        return this.method513(17, arg4, new Object[] { arg5, arg3, arg1 }, 25848, arg2);
    }

    @OriginalMember(owner = "client!pm", name = "d", descriptor = "(B)Lle;", line = 469)
    public final class278 method511(byte arg0) {
        if (arg0 <= 82) {
            this.method502((String) null, (byte) 117, (Class) null, (Class[]) null);
        }
        return this.field887;
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(I)V", line = 480)
    public final void method512(int arg0) {
        field889 = (long) arg0 + class6.method37(10828);
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IILjava/lang/Object;II)Lvk;", line = 488)
    private final class188 method513(int arg0, int arg1, Object arg2, int arg3, int arg4) {
        class188 var6 = new class188();
        var6.field2609 = arg0;
        var6.field2605 = arg1;
        var6.field2604 = arg2;
        if (arg3 != 25848) {
            this.method502((String) null, (byte) -55, (Class) null, (Class[]) null);
        }
        synchronized (this) {
            if (this.field881 == null) {
                this.field881 = this.field878 = var6;
            } else {
                this.field881.field2607 = var6;
                this.field881 = var6;
            }
            this.notify();
            return var6;
        }
    }
}
