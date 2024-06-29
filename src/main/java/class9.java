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

@OriginalClass("client!rc")
public class class9 implements Runnable {

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "Lmc;")
    private class165 field145 = null;

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "Ljava/applet/Applet;")
    public Applet field143 = null;

    @OriginalMember(owner = "client!rc", name = "h", descriptor = "Z")
    private boolean field149 = false;

    @OriginalMember(owner = "client!rc", name = "m", descriptor = "Lmc;")
    private class165 field154 = null;

    @OriginalMember(owner = "client!rc", name = "l", descriptor = "Ltk;")
    public class159 field153 = null;

    @OriginalMember(owner = "client!rc", name = "o", descriptor = "Ltk;")
    public class159 field156 = null;

    @OriginalMember(owner = "client!rc", name = "p", descriptor = "Ltk;")
    public class159 field157 = null;

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field146;

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "Ljava/lang/Thread;")
    private Thread field144;

    @OriginalMember(owner = "client!rc", name = "s", descriptor = "I")
    public static int field160 = 3;

    @OriginalMember(owner = "client!rc", name = "v", descriptor = "J")
    public static volatile long field163;

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "Lfh;")
    private class101 field147;

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "Ljava/lang/String;")
    public static String field148;

    @OriginalMember(owner = "client!rc", name = "i", descriptor = "Ljava/lang/String;")
    public static String field150;

    @OriginalMember(owner = "client!rc", name = "j", descriptor = "Ljava/lang/String;")
    public static String field151;

    @OriginalMember(owner = "client!rc", name = "k", descriptor = "Ljava/lang/String;")
    public static String field152;

    @OriginalMember(owner = "client!rc", name = "n", descriptor = "Ljava/lang/String;")
    public static String field155;

    @OriginalMember(owner = "client!rc", name = "q", descriptor = "Ljava/lang/String;")
    private static String field158;

    @OriginalMember(owner = "client!rc", name = "r", descriptor = "Ljava/lang/String;")
    public static String field159;

    @OriginalMember(owner = "client!rc", name = "t", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field161;

    @OriginalMember(owner = "client!rc", name = "u", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field162;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "[Ltk;")
    public class159[] field142;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Ljava/lang/Object;BIII)Lmc;")
    private final class165 method35(Object arg0, byte arg1, int arg2, int arg3, int arg4) {
        class165 var6 = new class165();
        var6.field2922 = arg3;
        var6.field2926 = arg2;
        var6.field2923 = arg0;
        synchronized (this) {
            if (this.field154 == null) {
                this.field154 = this.field145 = var6;
            } else {
                this.field154.field2924 = var6;
                this.field154 = var6;
            }
            this.notify();
            if (arg1 > -91) {
                this.method37((Class) null, (Class[]) null, (String) null, true);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Ljava/lang/Runnable;II)Lmc;")
    public final class165 method36(Runnable arg0, int arg1, int arg2) {
        int var4 = -64 / ((arg1 + 9) / 53);
        return this.method35(arg0, (byte) -109, 2, arg2, 0);
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Ljava/lang/Class;[Ljava/lang/Class;Ljava/lang/String;Z)Lmc;")
    public final class165 method37(Class arg0, Class[] arg1, String arg2, boolean arg3) {
        if (arg3) {
            this.method43((String) null, (byte) 118, (Class) null);
        }
        return this.method35(new Object[] { arg0, arg2, arg1 }, (byte) -119, 8, 0, 0);
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILjava/awt/Component;II)Lmc;")
    public final class165 method38(int arg0, Component arg1, int arg2, int arg3) {
        if (arg2 != -10815) {
            this.method45(false);
        }
        Point var5 = arg1.getLocationOnScreen();
        return this.method35((Object) null, (byte) -110, 14, var5.x + arg3, var5.y + arg0);
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(II)Lmc;")
    public final class165 method39(int arg0, int arg1) {
        return arg1 > -107 ? null : this.method35((Object) null, (byte) -110, 3, arg0, 0);
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(B)Lfh;")
    public final class101 method40(byte arg0) {
        int var2 = 110 % ((-arg0 - 55) / 56);
        return this.field147;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Ljava/lang/String;B)Lmc;")
    public final class165 method41(String arg0, byte arg1) {
        return arg1 < 46 ? null : this.method35(arg0, (byte) -114, 12, 0, 0);
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILjava/lang/String;)Lmc;")
    public final class165 method42(int arg0, String arg1) {
        if (arg0 != -21016) {
            this.field144 = null;
        }
        return this.method35(arg1, (byte) -123, 16, 0, 0);
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/Class;)Lmc;")
    public final class165 method43(String arg0, byte arg1, Class arg2) {
        return arg1 == 8 ? this.method35(new Object[] { arg2, arg0 }, (byte) -103, 9, 0, 0) : null;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(ZLjava/awt/Component;I)Lmc;")
    public final class165 method44(boolean arg0, Component arg1, int arg2) {
        return arg2 <= 42 ? null : this.method35(arg1, (byte) -117, 15, arg0 ? 1 : 0, 0);
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Z)V")
    public final void method45(boolean arg0) {
        synchronized (this) {
            this.field149 = arg0;
            this.notifyAll();
        }
        try {
            this.field144.join();
        } catch (InterruptedException var8) {
        }
        if (this.field157 != null) {
            try {
                this.field157.method1163(false);
            } catch (IOException var7) {
            }
        }
        if (this.field156 != null) {
            try {
                this.field156.method1163(false);
            } catch (IOException var6) {
            }
        }
        if (this.field142 != null) {
            for (int var3 = 0; var3 < this.field142.length; var3++) {
                if (this.field142[var3] != null) {
                    try {
                        this.field142[var3].method1163(false);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field153 != null) {
            try {
                this.field153.method1163(false);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(B)V")
    public final void method46(byte arg0) {
        field163 = class223.method1537(-26619) + 5000L;
        if (arg0 != 92) {
            this.method35((Object) null, (byte) 55, 106, -125, -102);
        }
    }

    @OriginalMember(owner = "client!rc", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class165 var2;
            synchronized (this) {
                while (true) {
                    if (this.field149) {
                        return;
                    }
                    if (this.field145 != null) {
                        var2 = this.field145;
                        this.field145 = this.field145.field2924;
                        if (this.field145 == null) {
                            this.field154 = null;
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
                int var3 = var2.field2926;
                if (var3 == 1) {
                    if (class223.method1537(-26619) < field163) {
                        throw new IOException();
                    }
                    var2.field2921 = new Socket(InetAddress.getByName((String) var2.field2923), var2.field2922);
                } else if (var3 == 2) {
                    Thread var4 = new Thread((Runnable) var2.field2923);
                    var4.setDaemon(true);
                    var4.start();
                    var4.setPriority(var2.field2922);
                    var2.field2921 = var4;
                } else if (var3 == 4) {
                    if (class223.method1537(-26619) < field163) {
                        throw new IOException();
                    }
                    var2.field2921 = new DataInputStream(((URL) var2.field2923).openStream());
                } else if (var3 == 8) {
                    Object[] var5 = (Object[]) var2.field2923;
                    var2.field2921 = ((Class) var5[0]).getDeclaredMethod((String) var5[1], (Class[]) var5[2]);
                } else if (var3 == 9) {
                    Object[] var6 = (Object[]) var2.field2923;
                    var2.field2921 = ((Class) var6[0]).getDeclaredField((String) var6[1]);
                } else {
                    throw new Exception();
                }
                var2.field2925 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field2925 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Ljava/net/URL;Z)Lmc;")
    public final class165 method47(URL arg0, boolean arg1) {
        return arg1 ? this.method35(arg0, (byte) -110, 4, 0, 0) : null;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILjava/lang/String;I)Lmc;")
    public final class165 method48(int arg0, String arg1, int arg2) {
        return arg2 == 0 ? this.method35(arg1, (byte) -107, 1, arg0, 0) : null;
    }

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
    public class9(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        field155 = "1.1";
        field152 = "Unknown";
        this.field143 = arg0;
        try {
            field152 = System.getProperty("java.vendor");
            field155 = System.getProperty("java.version");
        } catch (Exception var12) {
        }
        try {
            field151 = System.getProperty("os.name");
        } catch (Exception var11) {
            field151 = "Unknown";
        }
        field150 = field151.toLowerCase();
        try {
            field148 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var10) {
            field148 = "";
        }
        try {
            field159 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var9) {
            field159 = "";
        }
        try {
            field158 = System.getProperty("user.home");
            if (field158 != null) {
                field158 = field158 + "/";
            }
        } catch (Exception var8) {
        }
        if (field158 == null) {
            field158 = "~/";
        }
        try {
            this.field146 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var7) {
        }
        try {
            if (arg0 == null) {
                field161 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field161 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        try {
            if (arg0 == null) {
                field162 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field162 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var5) {
        }
        this.field149 = false;
        this.field144 = new Thread(this);
        this.field144.setPriority(10);
        this.field144.setDaemon(true);
        this.field144.start();
    }

    static {
        new Hashtable(16);
        field163 = 0L;
    }
}
