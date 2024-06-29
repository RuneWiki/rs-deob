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

@OriginalClass("client!fg")
public class class12 implements Runnable {

    @OriginalMember(owner = "client!fg", name = "f", descriptor = "Lng;")
    private class78 field153 = null;

    @OriginalMember(owner = "client!fg", name = "g", descriptor = "Lce;")
    public class222 field154 = null;

    @OriginalMember(owner = "client!fg", name = "i", descriptor = "Lng;")
    private class78 field156 = null;

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "Ljava/applet/Applet;")
    public Applet field150 = null;

    @OriginalMember(owner = "client!fg", name = "n", descriptor = "Lce;")
    public class222 field161 = null;

    @OriginalMember(owner = "client!fg", name = "p", descriptor = "Z")
    private boolean field163 = false;

    @OriginalMember(owner = "client!fg", name = "q", descriptor = "Lce;")
    public class222 field164 = null;

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field149;

    @OriginalMember(owner = "client!fg", name = "k", descriptor = "Ljava/lang/Thread;")
    private Thread field158;

    @OriginalMember(owner = "client!fg", name = "r", descriptor = "I")
    public static int field165 = 3;

    @OriginalMember(owner = "client!fg", name = "u", descriptor = "J")
    public static volatile long field168;

    @OriginalMember(owner = "client!fg", name = "m", descriptor = "Lgj;")
    private class240 field160;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "Ljava/lang/String;")
    public static String field148;

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "Ljava/lang/String;")
    public static String field151;

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "Ljava/lang/String;")
    public static String field152;

    @OriginalMember(owner = "client!fg", name = "h", descriptor = "Ljava/lang/String;")
    public static String field155;

    @OriginalMember(owner = "client!fg", name = "j", descriptor = "Ljava/lang/String;")
    public static String field157;

    @OriginalMember(owner = "client!fg", name = "l", descriptor = "Ljava/lang/String;")
    public static String field159;

    @OriginalMember(owner = "client!fg", name = "o", descriptor = "Ljava/lang/String;")
    private static String field162;

    @OriginalMember(owner = "client!fg", name = "t", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field167;

    @OriginalMember(owner = "client!fg", name = "v", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field169;

    @OriginalMember(owner = "client!fg", name = "s", descriptor = "[Lce;")
    public class222[] field166;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IILjava/awt/Component;Z)Lng;")
    public final class78 method55(int arg0, int arg1, Component arg2, boolean arg3) {
        if (arg3) {
            this.method58(1);
        }
        Point var5 = arg2.getLocationOnScreen();
        return this.method64((Object) null, var5.x + arg1, 72, var5.y + arg0, 14);
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IZ)Lng;")
    public final class78 method56(int arg0, boolean arg1) {
        return arg1 ? this.method64((Object) null, arg0, 45, 0, 3) : null;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(I)Lgj;")
    public final class240 method57(int arg0) {
        return arg0 == 0 ? this.field160 : null;
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(I)Lng;")
    public final class78 method58(int arg0) {
        int var2 = -45 / ((arg0 + 60) / 43);
        return this.method64((Object) null, 0, 45, 0, 18);
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(BLjava/lang/String;)Lng;")
    public final class78 method59(byte arg0, String arg1) {
        if (arg0 >= -25) {
            field151 = null;
        }
        return this.method64(arg1, 0, 94, 0, 12);
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(B)V")
    public final void method60(byte arg0) {
        synchronized (this) {
            int var3 = -15 / ((-arg0 - 72) / 46);
            this.field163 = true;
            this.notifyAll();
        }
        try {
            this.field158.join();
        } catch (InterruptedException var9) {
        }
        if (this.field161 != null) {
            try {
                this.field161.method1422(-1);
            } catch (IOException var8) {
            }
        }
        if (this.field164 != null) {
            try {
                this.field164.method1422(-1);
            } catch (IOException var7) {
            }
        }
        if (this.field166 != null) {
            for (int var4 = 0; var4 < this.field166.length; var4++) {
                if (this.field166[var4] != null) {
                    try {
                        this.field166[var4].method1422(-1);
                    } catch (IOException var6) {
                    }
                }
            }
        }
        if (this.field154 != null) {
            try {
                this.field154.method1422(-1);
            } catch (IOException var5) {
            }
        }
    }

    @OriginalMember(owner = "client!fg", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class78 var2;
            synchronized (this) {
                while (true) {
                    if (this.field163) {
                        return;
                    }
                    if (this.field153 != null) {
                        var2 = this.field153;
                        this.field153 = this.field153.field1248;
                        if (this.field153 == null) {
                            this.field156 = null;
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
                int var3 = var2.field1251;
                if (var3 == 1) {
                    if (class263.method1754(127) < field168) {
                        throw new IOException();
                    }
                    var2.field1250 = new Socket(InetAddress.getByName((String) var2.field1253), var2.field1252);
                } else if (var3 == 2) {
                    Thread var4 = new Thread((Runnable) var2.field1253);
                    var4.setDaemon(true);
                    var4.start();
                    var4.setPriority(var2.field1252);
                    var2.field1250 = var4;
                } else if (var3 == 4) {
                    if (field168 > class263.method1754(126)) {
                        throw new IOException();
                    }
                    var2.field1250 = new DataInputStream(((URL) var2.field1253).openStream());
                } else if (var3 == 8) {
                    Object[] var9 = (Object[]) var2.field1253;
                    var2.field1250 = ((Class) var9[0]).getDeclaredMethod((String) var9[1], (Class[]) var9[2]);
                } else if (var3 == 9) {
                    Object[] var8 = (Object[]) var2.field1253;
                    var2.field1250 = ((Class) var8[0]).getDeclaredField((String) var8[1]);
                } else if (var3 == 18) {
                    Clipboard var7 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var2.field1250 = var7.getContents((Object) null);
                } else if (var3 == 19) {
                    Transferable var5 = (Transferable) var2.field1253;
                    Clipboard var6 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var6.setContents(var5, (ClipboardOwner) null);
                } else {
                    throw new Exception();
                }
                var2.field1249 = 1;
            } catch (ThreadDeath var13) {
                throw var13;
            } catch (Throwable var14) {
                var2.field1249 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(B)V")
    public final void method61(byte arg0) {
        field168 = class263.method1754(127) + 5000L;
        if (arg0 < 98) {
            this.field153 = null;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Ljava/awt/Point;[IIIILjava/awt/Component;)Lng;")
    public final class78 method62(Point arg0, int[] arg1, int arg2, int arg3, int arg4, Component arg5) {
        if (arg4 != 17) {
            this.method71(56, -38, (Runnable) null);
        }
        return this.method64(new Object[] { arg5, arg1, arg0 }, arg3, arg4 ^ 0x6F, arg2, 17);
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;B)Lng;")
    public final class78 method63(Class arg0, String arg1, byte arg2) {
        int var4 = 6 % ((arg2 + 88) / 38);
        return this.method64(new Object[] { arg0, arg1 }, 0, 123, 0, 9);
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Ljava/lang/Object;IIII)Lng;")
    private final class78 method64(Object arg0, int arg1, int arg2, int arg3, int arg4) {
        class78 var6 = new class78();
        var6.field1253 = arg0;
        if (arg2 <= 44) {
            field169 = null;
        }
        var6.field1252 = arg1;
        var6.field1251 = arg4;
        synchronized (this) {
            if (this.field156 == null) {
                this.field156 = this.field153 = var6;
            } else {
                this.field156.field1248 = var6;
                this.field156 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Ljava/awt/datatransfer/Transferable;B)Lng;")
    public final class78 method65(Transferable arg0, byte arg1) {
        return arg1 >= -3 ? null : this.method64(arg0, 0, 63, 0, 19);
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(ILjava/lang/String;)Lng;")
    public final class78 method66(int arg0, String arg1) {
        int var3 = -21 / ((arg0 + 45) / 48);
        return this.method64(arg1, 0, 93, 0, 16);
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(ZLjava/awt/Component;Z)Lng;")
    public final class78 method67(boolean arg0, Component arg1, boolean arg2) {
        if (arg0) {
            this.field166 = null;
        }
        return this.method64(arg1, arg2 ? 1 : 0, 68, 0, 15);
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Ljava/lang/String;II)Lng;")
    public final class78 method68(String arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            this.field149 = null;
        }
        return this.method64(arg0, arg2, 118, 0, 1);
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "([Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;I)Lng;")
    public final class78 method69(Class[] arg0, String arg1, Class arg2, int arg3) {
        if (arg3 != 22853) {
            this.method68((String) null, 19, 65);
        }
        return this.method64(new Object[] { arg2, arg1, arg0 }, 0, 61, 0, 8);
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(ILjava/net/URL;)Lng;")
    public final class78 method70(int arg0, URL arg1) {
        return arg0 >= -42 ? null : this.method64(arg1, 0, 113, 0, 4);
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IILjava/lang/Runnable;)Lng;")
    public final class78 method71(int arg0, int arg1, Runnable arg2) {
        return arg0 == 2 ? this.method64(arg2, arg1, arg0 + 98, 0, 2) : null;
    }

    @OriginalMember(owner = "client!fg", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
    public class12(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        this.field150 = arg0;
        field151 = "1.1";
        field157 = "Unknown";
        try {
            field157 = System.getProperty("java.vendor");
            field151 = System.getProperty("java.version");
        } catch (Exception var12) {
        }
        try {
            field159 = System.getProperty("os.name");
        } catch (Exception var11) {
            field159 = "Unknown";
        }
        field155 = field159.toLowerCase();
        try {
            field152 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var10) {
            field152 = "";
        }
        try {
            field148 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var9) {
            field148 = "";
        }
        try {
            field162 = System.getProperty("user.home");
            if (field162 != null) {
                field162 = field162 + "/";
            }
        } catch (Exception var8) {
        }
        if (field162 == null) {
            field162 = "~/";
        }
        try {
            this.field149 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var7) {
        }
        try {
            if (arg0 == null) {
                field169 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field169 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        try {
            if (arg0 == null) {
                field167 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field167 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var5) {
        }
        this.field163 = false;
        this.field158 = new Thread(this);
        this.field158.setPriority(10);
        this.field158.setDaemon(true);
        this.field158.start();
    }

    static {
        new Hashtable(16);
        field168 = 0L;
    }
}
