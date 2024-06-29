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

@OriginalClass("client!gj")
public class class255 implements Runnable {

    @OriginalMember(owner = "client!gj", name = "j", descriptor = "Lkb;")
    private class54 field4210 = null;

    @OriginalMember(owner = "client!gj", name = "k", descriptor = "Ljava/applet/Applet;")
    public Applet field4211 = null;

    @OriginalMember(owner = "client!gj", name = "f", descriptor = "Lck;")
    public class238 field4206 = null;

    @OriginalMember(owner = "client!gj", name = "l", descriptor = "Lkb;")
    private class54 field4212 = null;

    @OriginalMember(owner = "client!gj", name = "e", descriptor = "Lck;")
    public class238 field4205 = null;

    @OriginalMember(owner = "client!gj", name = "r", descriptor = "Z")
    private boolean field4218 = false;

    @OriginalMember(owner = "client!gj", name = "s", descriptor = "Lck;")
    public class238 field4219 = null;

    @OriginalMember(owner = "client!gj", name = "i", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field4209;

    @OriginalMember(owner = "client!gj", name = "p", descriptor = "Ljava/lang/Thread;")
    private Thread field4216;

    @OriginalMember(owner = "client!gj", name = "q", descriptor = "I")
    public static int field4217 = 3;

    @OriginalMember(owner = "client!gj", name = "v", descriptor = "J")
    public static volatile long field4222;

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "Lod;")
    private class95 field4202;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "Ljava/lang/String;")
    private static String field4201;

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "Ljava/lang/String;")
    public static String field4203;

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "Ljava/lang/String;")
    public static String field4204;

    @OriginalMember(owner = "client!gj", name = "h", descriptor = "Ljava/lang/String;")
    public static String field4208;

    @OriginalMember(owner = "client!gj", name = "m", descriptor = "Ljava/lang/String;")
    public static String field4213;

    @OriginalMember(owner = "client!gj", name = "n", descriptor = "Ljava/lang/String;")
    public static String field4214;

    @OriginalMember(owner = "client!gj", name = "o", descriptor = "Ljava/lang/String;")
    public static String field4215;

    @OriginalMember(owner = "client!gj", name = "t", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field4220;

    @OriginalMember(owner = "client!gj", name = "u", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field4221;

    @OriginalMember(owner = "client!gj", name = "g", descriptor = "[Lck;")
    public class238[] field4207;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(ILjava/net/URL;)Lkb;")
    public final class54 method1768(int arg0, URL arg1) {
        if (arg0 <= 80) {
            this.method1773(37, -34);
        }
        return this.method1775(arg1, 4, 0, -3, 0);
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIILjava/awt/Component;)Lkb;")
    public final class54 method1769(int arg0, int arg1, int arg2, Component arg3) {
        Point var5 = arg3.getLocationOnScreen();
        int var6 = 111 / ((65 - arg2) / 58);
        return this.method1775((Object) null, 14, var5.y + arg1, 105, var5.x + arg0);
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(B)V")
    public final void method1770(byte arg0) {
        if (arg0 != 122) {
            this.run();
        }
        field4222 = class267.method1841((byte) 100) + 5000L;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Z)Lod;")
    public final class95 method1771(boolean arg0) {
        if (!arg0) {
            field4201 = null;
        }
        return this.field4202;
    }

    @OriginalMember(owner = "client!gj", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class54 var2;
            synchronized (this) {
                while (true) {
                    if (this.field4218) {
                        return;
                    }
                    if (this.field4210 != null) {
                        var2 = this.field4210;
                        this.field4210 = this.field4210.field726;
                        if (this.field4210 == null) {
                            this.field4212 = null;
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
                int var3 = var2.field721;
                if (var3 == 1) {
                    if (field4222 > class267.method1841((byte) 102)) {
                        throw new IOException();
                    }
                    var2.field723 = new Socket(InetAddress.getByName((String) var2.field722), var2.field724);
                } else if (var3 == 2) {
                    Thread var4 = new Thread((Runnable) var2.field722);
                    var4.setDaemon(true);
                    var4.start();
                    var4.setPriority(var2.field724);
                    var2.field723 = var4;
                } else if (var3 == 4) {
                    if (field4222 > class267.method1841((byte) 102)) {
                        throw new IOException();
                    }
                    var2.field723 = new DataInputStream(((URL) var2.field722).openStream());
                } else if (var3 == 8) {
                    Object[] var9 = (Object[]) var2.field722;
                    var2.field723 = ((Class) var9[0]).getDeclaredMethod((String) var9[1], (Class[]) var9[2]);
                } else if (var3 == 9) {
                    Object[] var5 = (Object[]) var2.field722;
                    var2.field723 = ((Class) var5[0]).getDeclaredField((String) var5[1]);
                } else if (var3 == 18) {
                    Clipboard var8 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var2.field723 = var8.getContents((Object) null);
                } else if (var3 == 19) {
                    Transferable var6 = (Transferable) var2.field722;
                    Clipboard var7 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var7.setContents(var6, (ClipboardOwner) null);
                } else {
                    throw new Exception();
                }
                var2.field725 = 1;
            } catch (ThreadDeath var13) {
                throw var13;
            } catch (Throwable var14) {
                var2.field725 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Ljava/awt/Component;Ljava/awt/Point;II[IB)Lkb;")
    public final class54 method1772(Component arg0, Point arg1, int arg2, int arg3, int[] arg4, byte arg5) {
        return arg5 == 54 ? this.method1775(new Object[] { arg0, arg4, arg1 }, 17, arg2, 31, arg3) : null;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(II)Lkb;")
    public final class54 method1773(int arg0, int arg1) {
        return arg1 == 0 ? this.method1775((Object) null, 3, 0, 19, arg0) : null;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(I)Lkb;")
    public final class54 method1774(int arg0) {
        if (arg0 != 1) {
            this.field4211 = null;
        }
        return this.method1775((Object) null, 18, 0, 113, 0);
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Ljava/lang/Object;IIII)Lkb;")
    private final class54 method1775(Object arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = -127 / ((arg3 + 42) / 34);
        class54 var7 = new class54();
        var7.field724 = arg4;
        var7.field721 = arg1;
        var7.field722 = arg0;
        synchronized (this) {
            if (this.field4212 == null) {
                this.field4212 = this.field4210 = var7;
            } else {
                this.field4212.field726 = var7;
                this.field4212 = var7;
            }
            this.notify();
            return var7;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(ILjava/lang/String;B)Lkb;")
    public final class54 method1776(int arg0, String arg1, byte arg2) {
        if (arg2 > -30) {
            field4220 = null;
        }
        return this.method1775(arg1, 1, 0, 54, arg0);
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(ILjava/lang/Runnable;I)Lkb;")
    public final class54 method1777(int arg0, Runnable arg1, int arg2) {
        if (arg2 != 2) {
            this.method1774(12);
        }
        return this.method1775(arg1, 2, 0, -104, arg0);
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Ljava/awt/Component;ZB)Lkb;")
    public final class54 method1778(Component arg0, boolean arg1, byte arg2) {
        if (arg2 >= -67) {
            this.run();
        }
        return this.method1775(arg0, 15, 0, 38, arg1 ? 1 : 0);
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(BLjava/lang/Class;Ljava/lang/String;)Lkb;")
    public final class54 method1779(byte arg0, Class arg1, String arg2) {
        return arg0 < 107 ? null : this.method1775(new Object[] { arg1, arg2 }, 9, 0, -3, 0);
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(I)V")
    public final void method1780(int arg0) {
        synchronized (this) {
            this.field4218 = true;
            this.notifyAll();
        }
        try {
            this.field4216.join();
        } catch (InterruptedException var8) {
        }
        if (this.field4219 != null) {
            try {
                this.field4219.method1660((byte) -100);
            } catch (IOException var7) {
            }
        }
        if (this.field4206 != null) {
            try {
                this.field4206.method1660((byte) -110);
            } catch (IOException var6) {
            }
        }
        if (this.field4207 != null) {
            for (int var3 = 0; var3 < this.field4207.length; var3++) {
                if (this.field4207[var3] != null) {
                    try {
                        this.field4207[var3].method1660((byte) -43);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field4205 != null) {
            try {
                this.field4205.method1660((byte) -102);
            } catch (IOException var4) {
            }
        }
        if (arg0 >= -48) {
            field4221 = null;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Ljava/lang/String;I)Lkb;")
    public final class54 method1781(String arg0, int arg1) {
        if (arg1 != 0) {
            this.field4210 = null;
        }
        return this.method1775(arg0, 12, 0, -117, 0);
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Ljava/lang/Class;[Ljava/lang/Class;BLjava/lang/String;)Lkb;")
    public final class54 method1782(Class arg0, Class[] arg1, byte arg2, String arg3) {
        return arg2 == -76 ? this.method1775(new Object[] { arg0, arg3, arg1 }, 8, 0, arg2 + 147, 0) : null;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Ljava/lang/Class;B)Lkb;")
    public final class54 method1783(Class arg0, byte arg1) {
        if (arg1 > -30) {
            this.method1777(-92, (Runnable) null, 84);
        }
        return this.method1775(arg0, 20, 0, 21, 0);
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(ILjava/lang/Class;)Lkb;")
    public final class54 method1784(int arg0, Class arg1) {
        if (arg0 != -26948) {
            field4203 = null;
        }
        return this.method1775(arg1, 11, 0, -90, 0);
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Ljava/awt/datatransfer/Transferable;I)Lkb;")
    public final class54 method1785(Transferable arg0, int arg1) {
        if (arg1 != 31057) {
            this.method1782((Class) null, (Class[]) null, (byte) 95, (String) null);
        }
        return this.method1775(arg0, 19, 0, -120, 0);
    }

    @OriginalMember(owner = "client!gj", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
    public class255(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        field4215 = "1.1";
        this.field4211 = arg0;
        field4208 = "Unknown";
        try {
            field4208 = System.getProperty("java.vendor");
            field4215 = System.getProperty("java.version");
        } catch (Exception var12) {
        }
        try {
            field4204 = System.getProperty("os.name");
        } catch (Exception var11) {
            field4204 = "Unknown";
        }
        field4203 = field4204.toLowerCase();
        try {
            field4214 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var10) {
            field4214 = "";
        }
        try {
            field4213 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var9) {
            field4213 = "";
        }
        try {
            field4201 = System.getProperty("user.home");
            if (field4201 != null) {
                field4201 = field4201 + "/";
            }
        } catch (Exception var8) {
        }
        if (field4201 == null) {
            field4201 = "~/";
        }
        try {
            this.field4209 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var7) {
        }
        try {
            if (arg0 == null) {
                field4220 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field4220 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        try {
            if (arg0 == null) {
                field4221 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field4221 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var5) {
        }
        this.field4218 = false;
        this.field4216 = new Thread(this);
        this.field4216.setPriority(10);
        this.field4216.setDaemon(true);
        this.field4216.start();
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(ILjava/lang/String;)Lkb;")
    public final class54 method1786(int arg0, String arg1) {
        if (arg0 < 67) {
            this.method1782((Class) null, (Class[]) null, (byte) 89, (String) null);
        }
        return this.method1775(arg1, 16, 0, 38, 0);
    }

    static {
        new Hashtable(16);
        field4222 = 0L;
    }
}
