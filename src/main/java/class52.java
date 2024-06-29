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

@OriginalClass("client!fk")
public class class52 implements Runnable {

    @OriginalMember(owner = "client!fk", name = "f", descriptor = "Z")
    private boolean field732 = false;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "Lui;")
    private class286 field727 = null;

    @OriginalMember(owner = "client!fk", name = "i", descriptor = "Lth;")
    public class125 field735 = null;

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "Lth;")
    public class125 field730 = null;

    @OriginalMember(owner = "client!fk", name = "l", descriptor = "Lui;")
    private class286 field738 = null;

    @OriginalMember(owner = "client!fk", name = "k", descriptor = "Lth;")
    public class125 field737 = null;

    @OriginalMember(owner = "client!fk", name = "r", descriptor = "Ljava/applet/Applet;")
    public Applet field744 = null;

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field728;

    @OriginalMember(owner = "client!fk", name = "q", descriptor = "Ljava/lang/Thread;")
    private Thread field743;

    @OriginalMember(owner = "client!fk", name = "s", descriptor = "I")
    public static int field745 = 3;

    @OriginalMember(owner = "client!fk", name = "u", descriptor = "J")
    public static volatile long field747;

    @OriginalMember(owner = "client!fk", name = "e", descriptor = "Lck;")
    private class1 field731;

    @OriginalMember(owner = "client!fk", name = "g", descriptor = "Ljava/lang/String;")
    public static String field733;

    @OriginalMember(owner = "client!fk", name = "h", descriptor = "Ljava/lang/String;")
    public static String field734;

    @OriginalMember(owner = "client!fk", name = "j", descriptor = "Ljava/lang/String;")
    public static String field736;

    @OriginalMember(owner = "client!fk", name = "m", descriptor = "Ljava/lang/String;")
    public static String field739;

    @OriginalMember(owner = "client!fk", name = "n", descriptor = "Ljava/lang/String;")
    public static String field740;

    @OriginalMember(owner = "client!fk", name = "o", descriptor = "Ljava/lang/String;")
    private static String field741;

    @OriginalMember(owner = "client!fk", name = "p", descriptor = "Ljava/lang/String;")
    public static String field742;

    @OriginalMember(owner = "client!fk", name = "t", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field746;

    @OriginalMember(owner = "client!fk", name = "v", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field748;

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "[Lth;")
    public class125[] field729;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(BI)Lui;")
    public final class286 method316(byte arg0, int arg1) {
        if (arg0 != -62) {
            field745 = -9;
        }
        return this.method324(0, (Object) null, 3, arg1, 0);
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(I)V")
    public final void method317(int arg0) {
        synchronized (this) {
            this.field732 = true;
            this.notifyAll();
        }
        try {
            this.field743.join();
        } catch (InterruptedException var8) {
        }
        if (arg0 <= 55) {
            field747 = 1L;
        }
        if (this.field737 != null) {
            try {
                this.field737.method802(0);
            } catch (IOException var7) {
            }
        }
        if (this.field730 != null) {
            try {
                this.field730.method802(0);
            } catch (IOException var6) {
            }
        }
        if (this.field729 != null) {
            for (int var3 = 0; var3 < this.field729.length; var3++) {
                if (this.field729[var3] != null) {
                    try {
                        this.field729[var3].method802(0);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field735 != null) {
            try {
                this.field735.method802(0);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Ljava/lang/String;II)Lui;")
    public final class286 method318(String arg0, int arg1, int arg2) {
        return arg1 == 0 ? this.method324(arg1, arg0, 1, arg2, 0) : null;
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(I)V")
    public final void method319(int arg0) {
        field747 = class299.method2006(9594) + 5000L;
        if (arg0 > -39) {
            this.method318((String) null, 89, 123);
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;Z[Ljava/lang/Class;)Lui;")
    public final class286 method320(String arg0, Class arg1, boolean arg2, Class[] arg3) {
        if (arg2) {
            this.method325((byte) 100, (Runnable) null, -73);
        }
        return this.method324(0, new Object[] { arg1, arg0, arg3 }, 8, 0, 0);
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(B)Lck;")
    public final class1 method321(byte arg0) {
        if (arg0 >= -82) {
            this.method324(17, (Object) null, 17, 126, 84);
        }
        return this.field731;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Ljava/awt/Component;BZ)Lui;")
    public final class286 method322(Component arg0, byte arg1, boolean arg2) {
        if (arg1 < 32) {
            field734 = null;
        }
        return this.method324(0, arg0, 15, arg2 ? 1 : 0, 0);
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Ljava/lang/Class;Z)Lui;")
    public final class286 method323(Class arg0, boolean arg1) {
        return arg1 ? null : this.method324(0, arg0, 11, 0, 0);
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(ILjava/lang/Object;III)Lui;")
    private final class286 method324(int arg0, Object arg1, int arg2, int arg3, int arg4) {
        class286 var6 = new class286();
        var6.field4571 = arg2;
        var6.field4572 = arg1;
        var6.field4569 = arg3;
        if (arg0 != 0) {
            this.field731 = null;
        }
        synchronized (this) {
            if (this.field727 == null) {
                this.field727 = this.field738 = var6;
            } else {
                this.field727.field4568 = var6;
                this.field727 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(BLjava/lang/Runnable;I)Lui;")
    public final class286 method325(byte arg0, Runnable arg1, int arg2) {
        if (arg0 > -74) {
            field741 = null;
        }
        return this.method324(0, arg1, 2, arg2, 0);
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(ILjava/lang/String;)Lui;")
    public final class286 method326(int arg0, String arg1) {
        return arg0 == 23521 ? this.method324(0, arg1, 16, 0, 0) : null;
    }

    @OriginalMember(owner = "client!fk", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class286 var2;
            synchronized (this) {
                while (true) {
                    if (this.field732) {
                        return;
                    }
                    if (this.field738 != null) {
                        var2 = this.field738;
                        this.field738 = this.field738.field4568;
                        if (this.field738 == null) {
                            this.field727 = null;
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
                int var3 = var2.field4571;
                if (var3 == 1) {
                    if (field747 > class299.method2006(9594)) {
                        throw new IOException();
                    }
                    var2.field4567 = new Socket(InetAddress.getByName((String) var2.field4572), var2.field4569);
                } else if (var3 == 2) {
                    Thread var9 = new Thread((Runnable) var2.field4572);
                    var9.setDaemon(true);
                    var9.start();
                    var9.setPriority(var2.field4569);
                    var2.field4567 = var9;
                } else if (var3 == 4) {
                    if (field747 > class299.method2006(9594)) {
                        throw new IOException();
                    }
                    var2.field4567 = new DataInputStream(((URL) var2.field4572).openStream());
                } else if (var3 == 8) {
                    Object[] var4 = (Object[]) var2.field4572;
                    var2.field4567 = ((Class) var4[0]).getDeclaredMethod((String) var4[1], (Class[]) var4[2]);
                } else if (var3 == 9) {
                    Object[] var5 = (Object[]) var2.field4572;
                    var2.field4567 = ((Class) var5[0]).getDeclaredField((String) var5[1]);
                } else if (var3 == 18) {
                    Clipboard var8 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var2.field4567 = var8.getContents((Object) null);
                } else if (var3 == 19) {
                    Transferable var6 = (Transferable) var2.field4572;
                    Clipboard var7 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var7.setContents(var6, (ClipboardOwner) null);
                } else {
                    throw new Exception();
                }
                var2.field4570 = 1;
            } catch (ThreadDeath var13) {
                throw var13;
            } catch (Throwable var14) {
                var2.field4570 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(ILjava/lang/Class;)Lui;")
    public final class286 method327(int arg0, Class arg1) {
        if (arg0 != 20) {
            this.method320((String) null, (Class) null, true, (Class[]) null);
        }
        return this.method324(arg0 ^ 0x14, arg1, 20, 0, 0);
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Ljava/net/URL;I)Lui;")
    public final class286 method328(URL arg0, int arg1) {
        if (arg1 != 0) {
            this.field732 = true;
        }
        return this.method324(0, arg0, 4, 0, 0);
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Class;)Lui;")
    public final class286 method329(String arg0, int arg1, Class arg2) {
        return arg1 == 9 ? this.method324(0, new Object[] { arg2, arg0 }, 9, 0, 0) : null;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IBLjava/awt/Component;I)Lui;")
    public final class286 method330(int arg0, byte arg1, Component arg2, int arg3) {
        if (arg1 == 59) {
            Point var5 = arg2.getLocationOnScreen();
            return this.method324(arg1 - 59, (Object) null, 14, var5.x + arg0, var5.y + arg3);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Ljava/lang/String;I)Lui;")
    public final class286 method331(String arg0, int arg1) {
        if (arg1 >= -12) {
            this.method323((Class) null, true);
        }
        return this.method324(0, arg0, 12, 0, 0);
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Z)Lui;")
    public final class286 method332(boolean arg0) {
        if (!arg0) {
            this.method323((Class) null, true);
        }
        return this.method324(0, (Object) null, 18, 0, 0);
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Ljava/awt/datatransfer/Transferable;I)Lui;")
    public final class286 method333(Transferable arg0, int arg1) {
        if (arg1 != 8870) {
            this.field729 = null;
        }
        return this.method324(0, arg0, 19, 0, 0);
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(BIILjava/awt/Point;Ljava/awt/Component;[I)Lui;")
    public final class286 method334(byte arg0, int arg1, int arg2, Point arg3, Component arg4, int[] arg5) {
        if (arg0 > -80) {
            field736 = null;
        }
        return this.method324(0, new Object[] { arg4, arg5, arg3 }, 17, arg2, arg1);
    }

    @OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
    public class52(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        this.field744 = arg0;
        field739 = "Unknown";
        field742 = "1.1";
        try {
            field739 = System.getProperty("java.vendor");
            field742 = System.getProperty("java.version");
        } catch (Exception var12) {
        }
        try {
            field733 = System.getProperty("os.name");
        } catch (Exception var11) {
            field733 = "Unknown";
        }
        field736 = field733.toLowerCase();
        try {
            field734 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var10) {
            field734 = "";
        }
        try {
            field740 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var9) {
            field740 = "";
        }
        try {
            field741 = System.getProperty("user.home");
            if (field741 != null) {
                field741 = field741 + "/";
            }
        } catch (Exception var8) {
        }
        if (field741 == null) {
            field741 = "~/";
        }
        try {
            this.field728 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var7) {
        }
        try {
            if (arg0 == null) {
                field746 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field746 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        try {
            if (arg0 == null) {
                field748 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field748 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var5) {
        }
        this.field732 = false;
        this.field743 = new Thread(this);
        this.field743.setPriority(10);
        this.field743.setDaemon(true);
        this.field743.start();
    }

    static {
        new Hashtable(16);
        field747 = 0L;
    }
}
