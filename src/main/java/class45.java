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

@OriginalClass("client!rm")
public class class45 implements Runnable {

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "Lai;")
    public class210 field745 = null;

    @OriginalMember(owner = "client!rm", name = "e", descriptor = "Lai;")
    public class210 field748 = null;

    @OriginalMember(owner = "client!rm", name = "g", descriptor = "Lai;")
    public class210 field750 = null;

    @OriginalMember(owner = "client!rm", name = "h", descriptor = "Ljava/applet/Applet;")
    public Applet field751 = null;

    @OriginalMember(owner = "client!rm", name = "d", descriptor = "Lbg;")
    private class172 field747 = null;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "Z")
    private boolean field744 = false;

    @OriginalMember(owner = "client!rm", name = "r", descriptor = "Lbg;")
    private class172 field761 = null;

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field746;

    @OriginalMember(owner = "client!rm", name = "l", descriptor = "Ljava/lang/Thread;")
    private Thread field755;

    @OriginalMember(owner = "client!rm", name = "p", descriptor = "I")
    public static int field759 = 3;

    @OriginalMember(owner = "client!rm", name = "t", descriptor = "J")
    public static volatile long field763;

    @OriginalMember(owner = "client!rm", name = "o", descriptor = "Lei;")
    private class164 field758;

    @OriginalMember(owner = "client!rm", name = "f", descriptor = "Ljava/lang/String;")
    public static String field749;

    @OriginalMember(owner = "client!rm", name = "j", descriptor = "Ljava/lang/String;")
    public static String field753;

    @OriginalMember(owner = "client!rm", name = "k", descriptor = "Ljava/lang/String;")
    public static String field754;

    @OriginalMember(owner = "client!rm", name = "m", descriptor = "Ljava/lang/String;")
    public static String field756;

    @OriginalMember(owner = "client!rm", name = "n", descriptor = "Ljava/lang/String;")
    public static String field757;

    @OriginalMember(owner = "client!rm", name = "q", descriptor = "Ljava/lang/String;")
    public static String field760;

    @OriginalMember(owner = "client!rm", name = "s", descriptor = "Ljava/lang/String;")
    private static String field762;

    @OriginalMember(owner = "client!rm", name = "u", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field764;

    @OriginalMember(owner = "client!rm", name = "v", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field765;

    @OriginalMember(owner = "client!rm", name = "i", descriptor = "[Lai;")
    public class210[] field752;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(BLjava/awt/Component;II)Lbg;")
    public final class172 method310(byte arg0, Component arg1, int arg2, int arg3) {
        if (arg0 != -76) {
            this.field750 = null;
        }
        Point var5 = arg1.getLocationOnScreen();
        return this.method318(14, arg3 + var5.x, (byte) -93, (Object) null, arg2 + var5.y);
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(I)V")
    public final void method311(int arg0) {
        synchronized (this) {
            this.field744 = true;
            this.notifyAll();
        }
        try {
            this.field755.join();
        } catch (InterruptedException var8) {
        }
        if (this.field750 != null) {
            try {
                this.field750.method1462((byte) 86);
            } catch (IOException var7) {
            }
        }
        if (this.field745 != null) {
            try {
                this.field745.method1462((byte) 83);
            } catch (IOException var6) {
            }
        }
        if (this.field752 != null) {
            for (int var3 = 0; var3 < this.field752.length; var3++) {
                if (this.field752[var3] != null) {
                    try {
                        this.field752[var3].method1462((byte) 94);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field748 != null) {
            try {
                this.field748.method1462((byte) 96);
            } catch (IOException var4) {
            }
        }
        if (arg0 > -85) {
            this.method312((Class[]) null, (String) null, (Class) null, (byte) -15);
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "([Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;B)Lbg;")
    public final class172 method312(Class[] arg0, String arg1, Class arg2, byte arg3) {
        int var5 = 100 / ((arg3 + 40) / 39);
        return this.method318(8, 0, (byte) -97, new Object[] { arg2, arg1, arg0 }, 0);
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(Ljava/lang/String;B)Lbg;")
    public final class172 method313(String arg0, byte arg1) {
        if (arg1 != -78) {
            this.method323((Transferable) null, -105);
        }
        return this.method318(12, 0, (byte) -102, arg0, 0);
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(Ljava/net/URL;B)Lbg;")
    public final class172 method314(URL arg0, byte arg1) {
        int var3 = -118 / ((arg1 - 48) / 45);
        return this.method318(4, 0, (byte) -122, arg0, 0);
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(B)V")
    public final void method315(byte arg0) {
        field763 = class191.method1350((byte) 87) + 5000L;
        int var2 = 94 % ((arg0 - 63) / 40);
    }

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "(I)Lbg;")
    public final class172 method316(int arg0) {
        return arg0 == 2 ? this.method318(18, 0, (byte) -93, (Object) null, 0) : null;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(Ljava/lang/String;I)Lbg;")
    public final class172 method317(String arg0, int arg1) {
        int var3 = -19 / ((-arg1 - 77) / 35);
        return this.method318(16, 0, (byte) -84, arg0, 0);
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IIBLjava/lang/Object;I)Lbg;")
    private final class172 method318(int arg0, int arg1, byte arg2, Object arg3, int arg4) {
        class172 var6 = new class172();
        var6.field2815 = arg1;
        var6.field2816 = arg0;
        var6.field2812 = arg3;
        synchronized (this) {
            if (this.field747 == null) {
                this.field747 = this.field761 = var6;
            } else {
                this.field747.field2813 = var6;
                this.field747 = var6;
            }
            this.notify();
            if (arg2 > -81) {
                this.method325((Class) null, 92);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!rm", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class172 var2;
            synchronized (this) {
                while (true) {
                    if (this.field744) {
                        return;
                    }
                    if (this.field761 != null) {
                        var2 = this.field761;
                        this.field761 = this.field761.field2813;
                        if (this.field761 == null) {
                            this.field747 = null;
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
                int var3 = var2.field2816;
                if (var3 == 1) {
                    if (class191.method1350((byte) -111) < field763) {
                        throw new IOException();
                    }
                    var2.field2817 = new Socket(InetAddress.getByName((String) var2.field2812), var2.field2815);
                } else if (var3 == 2) {
                    Thread var9 = new Thread((Runnable) var2.field2812);
                    var9.setDaemon(true);
                    var9.start();
                    var9.setPriority(var2.field2815);
                    var2.field2817 = var9;
                } else if (var3 == 4) {
                    if (class191.method1350((byte) -116) < field763) {
                        throw new IOException();
                    }
                    var2.field2817 = new DataInputStream(((URL) var2.field2812).openStream());
                } else if (var3 == 8) {
                    Object[] var8 = (Object[]) var2.field2812;
                    var2.field2817 = ((Class) var8[0]).getDeclaredMethod((String) var8[1], (Class[]) var8[2]);
                } else if (var3 == 9) {
                    Object[] var7 = (Object[]) var2.field2812;
                    var2.field2817 = ((Class) var7[0]).getDeclaredField((String) var7[1]);
                } else if (var3 == 18) {
                    Clipboard var4 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var2.field2817 = var4.getContents((Object) null);
                } else if (var3 == 19) {
                    Transferable var5 = (Transferable) var2.field2812;
                    Clipboard var6 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var6.setContents(var5, (ClipboardOwner) null);
                } else {
                    throw new Exception();
                }
                var2.field2814 = 1;
            } catch (ThreadDeath var13) {
                throw var13;
            } catch (Throwable var14) {
                var2.field2814 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(ILjava/lang/Runnable;B)Lbg;")
    public final class172 method319(int arg0, Runnable arg1, byte arg2) {
        return arg2 >= -24 ? null : this.method318(2, arg0, (byte) -113, arg1, 0);
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IB)Lbg;")
    public final class172 method320(int arg0, byte arg1) {
        if (arg1 != 102) {
            this.method319(-93, (Runnable) null, (byte) -35);
        }
        return this.method318(3, arg0, (byte) -117, (Object) null, 0);
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(Ljava/lang/Class;B)Lbg;")
    public final class172 method321(Class arg0, byte arg1) {
        return arg1 < 73 ? null : this.method318(20, 0, (byte) -122, arg0, 0);
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(Ljava/awt/Component;IZ)Lbg;")
    public final class172 method322(Component arg0, int arg1, boolean arg2) {
        return arg1 == 8 ? this.method318(15, arg2 ? 1 : 0, (byte) -104, arg0, 0) : null;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(Ljava/awt/datatransfer/Transferable;I)Lbg;")
    public final class172 method323(Transferable arg0, int arg1) {
        return arg1 == 21788 ? this.method318(19, 0, (byte) -121, arg0, 0) : null;
    }

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "(I)Lei;")
    public final class164 method324(int arg0) {
        return arg0 == 0 ? this.field758 : null;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(Ljava/lang/Class;I)Lbg;")
    public final class172 method325(Class arg0, int arg1) {
        int var3 = -82 / ((arg1 + 77) / 38);
        return this.method318(11, 0, (byte) -86, arg0, 0);
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(ZLjava/lang/String;I)Lbg;")
    public final class172 method326(boolean arg0, String arg1, int arg2) {
        return arg0 ? this.method318(1, arg2, (byte) -114, arg1, 0) : null;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(Ljava/awt/Point;IIBLjava/awt/Component;[I)Lbg;")
    public final class172 method327(Point arg0, int arg1, int arg2, byte arg3, Component arg4, int[] arg5) {
        if (arg3 <= 83) {
            this.method313((String) null, (byte) -109);
        }
        return this.method318(17, arg1, (byte) -105, new Object[] { arg4, arg5, arg0 }, arg2);
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Class;)Lbg;")
    public final class172 method328(String arg0, int arg1, Class arg2) {
        return arg1 == 0 ? this.method318(9, 0, (byte) -103, new Object[] { arg2, arg0 }, 0) : null;
    }

    @OriginalMember(owner = "client!rm", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
    public class45(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        field754 = "Unknown";
        field753 = "1.1";
        this.field751 = arg0;
        try {
            field754 = System.getProperty("java.vendor");
            field753 = System.getProperty("java.version");
        } catch (Exception var12) {
        }
        try {
            field749 = System.getProperty("os.name");
        } catch (Exception var11) {
            field749 = "Unknown";
        }
        field760 = field749.toLowerCase();
        try {
            field757 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var10) {
            field757 = "";
        }
        try {
            field756 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var9) {
            field756 = "";
        }
        try {
            field762 = System.getProperty("user.home");
            if (field762 != null) {
                field762 = field762 + "/";
            }
        } catch (Exception var8) {
        }
        if (field762 == null) {
            field762 = "~/";
        }
        try {
            this.field746 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var7) {
        }
        try {
            if (arg0 == null) {
                field764 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field764 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        try {
            if (arg0 == null) {
                field765 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field765 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var5) {
        }
        this.field744 = false;
        this.field755 = new Thread(this);
        this.field755.setPriority(10);
        this.field755.setDaemon(true);
        this.field755.start();
    }

    static {
        new Hashtable(16);
        field763 = 0L;
    }
}
