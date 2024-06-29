import java.applet.Applet;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Frame;
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

@OriginalClass("client!me")
public class class295 implements Runnable {

    @OriginalMember(owner = "client!me", name = "d", descriptor = "Ljava/applet/Applet;")
    public Applet field5061 = null;

    @OriginalMember(owner = "client!me", name = "g", descriptor = "Z")
    private boolean field5064 = false;

    @OriginalMember(owner = "client!me", name = "h", descriptor = "Ltd;")
    public class222 field5065 = null;

    @OriginalMember(owner = "client!me", name = "j", descriptor = "Ltd;")
    public class222 field5067 = null;

    @OriginalMember(owner = "client!me", name = "i", descriptor = "Lke;")
    private class116 field5066 = null;

    @OriginalMember(owner = "client!me", name = "o", descriptor = "Ltd;")
    public class222 field5072 = null;

    @OriginalMember(owner = "client!me", name = "q", descriptor = "Lke;")
    private class116 field5074 = null;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field5058;

    @OriginalMember(owner = "client!me", name = "n", descriptor = "Ljava/lang/Thread;")
    private Thread field5071;

    @OriginalMember(owner = "client!me", name = "e", descriptor = "I")
    public static int field5062 = 3;

    @OriginalMember(owner = "client!me", name = "s", descriptor = "J")
    public static volatile long field5076;

    @OriginalMember(owner = "client!me", name = "l", descriptor = "Ldd;")
    private class278 field5069;

    @OriginalMember(owner = "client!me", name = "b", descriptor = "Ljava/lang/String;")
    public static String field5059;

    @OriginalMember(owner = "client!me", name = "c", descriptor = "Ljava/lang/String;")
    public static String field5060;

    @OriginalMember(owner = "client!me", name = "f", descriptor = "Ljava/lang/String;")
    public static String field5063;

    @OriginalMember(owner = "client!me", name = "k", descriptor = "Ljava/lang/String;")
    public static String field5068;

    @OriginalMember(owner = "client!me", name = "m", descriptor = "Ljava/lang/String;")
    private static String field5070;

    @OriginalMember(owner = "client!me", name = "p", descriptor = "Ljava/lang/String;")
    public static String field5073;

    @OriginalMember(owner = "client!me", name = "r", descriptor = "Ljava/lang/String;")
    public static String field5075;

    @OriginalMember(owner = "client!me", name = "t", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field5077;

    @OriginalMember(owner = "client!me", name = "v", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field5079;

    @OriginalMember(owner = "client!me", name = "u", descriptor = "[Ltd;")
    public class222[] field5078;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(ZLjava/lang/String;)Lke;", line = 8)
    public final class116 method2062(boolean arg0, String arg1) {
        if (!arg0) {
            this.method2064((Component) null, -125, false, -128);
        }
        return this.method2066(0, 16, (byte) 28, arg1, 0);
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Ljava/lang/Class;ZLjava/lang/String;[Ljava/lang/Class;)Lke;", line = 19)
    public final class116 method2063(Class arg0, boolean arg1, String arg2, Class[] arg3) {
        return arg1 ? this.method2066(0, 8, (byte) 45, new Object[] { arg0, arg2, arg3 }, 0) : (class116) null;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Ljava/awt/Component;IZI)Lke;", line = 34)
    public final class116 method2064(Component arg0, int arg1, boolean arg2, int arg3) {
        Point var5 = arg0.getLocationOnScreen();
        if (arg2) {
            this.method2072(-91, (Class) null);
        }
        return this.method2066(arg3 + var5.y, 14, (byte) 66, (Object) null, var5.x + arg1);
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(I)V", line = 53)
    public final void method2065(int arg0) {
        synchronized (this) {
            this.field5064 = true;
            this.notifyAll();
        }
        try {
            if (arg0 != 1958) {
                this.method2075(-81, (byte) 45);
            }
            this.field5071.join();
        } catch (InterruptedException var14) {
        }
        if (this.field5072 != null) {
            try {
                this.field5072.method1501(true);
            } catch (IOException var13) {
            }
        }
        if (this.field5067 != null) {
            try {
                this.field5067.method1501(true);
            } catch (IOException var12) {
            }
        }
        if (this.field5078 != null) {
            for (int var7 = 0; var7 < this.field5078.length; var7++) {
                if (this.field5078[var7] != null) {
                    try {
                        this.field5078[var7].method1501(true);
                    } catch (IOException var11) {
                    }
                }
            }
        }
        if (this.field5065 != null) {
            try {
                this.field5065.method1501(true);
            } catch (IOException var10) {
            }
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IIBLjava/lang/Object;I)Lke;", line = 116)
    private final class116 method2066(int arg0, int arg1, byte arg2, Object arg3, int arg4) {
        class116 var6 = new class116();
        var6.field2066 = arg1;
        var6.field2068 = arg4;
        var6.field2065 = arg3;
        synchronized (this) {
            if (this.field5074 == null) {
                this.field5074 = this.field5066 = var6;
            } else {
                this.field5074.field2064 = var6;
                this.field5074 = var6;
            }
            this.notify();
            int var8 = -22 / ((-arg2 - 41) / 52);
            return var6;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(B)V", line = 143)
    public final void method2067(byte arg0) {
        int var2 = -114 / ((arg0 + 14) / 43);
        field5076 = class25.method197(-3418) + 5000L;
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V", line = 442)
    public class295(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        this.field5061 = arg0;
        field5075 = "Unknown";
        field5073 = "1.1";
        try {
            field5075 = System.getProperty("java.vendor");
            field5073 = System.getProperty("java.version");
        } catch (Exception var20) {
        }
        try {
            field5059 = System.getProperty("os.name");
        } catch (Exception var19) {
            field5059 = "Unknown";
        }
        field5060 = field5059.toLowerCase();
        try {
            field5068 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var18) {
            field5068 = "";
        }
        try {
            field5063 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var17) {
            field5063 = "";
        }
        try {
            field5070 = System.getProperty("user.home");
            if (field5070 != null) {
                field5070 = field5070 + "/";
            }
        } catch (Exception var16) {
        }
        if (field5070 == null) {
            field5070 = "~/";
        }
        try {
            this.field5058 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var15) {
        }
        try {
            if (arg0 == null) {
                field5077 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field5077 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var14) {
        }
        try {
            if (arg0 == null) {
                field5079 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field5079 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var13) {
        }
        this.field5064 = false;
        this.field5071 = new Thread(this);
        this.field5071.setPriority(10);
        this.field5071.setDaemon(true);
        this.field5071.start();
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Ljava/awt/Component;ZI)Lke;", line = 159)
    public final class116 method2068(Component arg0, boolean arg1, int arg2) {
        return arg2 == -31739 ? this.method2066(0, 15, (byte) -105, arg0, arg1 ? 1 : 0) : (class116) null;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(ILjava/lang/String;)Lke;", line = 169)
    public final class116 method2069(int arg0, String arg1) {
        if (arg0 != 0) {
            this.field5065 = (class222) null;
        }
        return this.method2066(0, 12, (byte) -98, arg1, 0);
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(ILjava/lang/Runnable;I)Lke;", line = 182)
    public final class116 method2070(int arg0, Runnable arg1, int arg2) {
        return arg2 > -98 ? (class116) null : this.method2066(0, 2, (byte) 123, arg1, arg0);
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(ILjava/net/URL;)Lke;", line = 195)
    public final class116 method2071(int arg0, URL arg1) {
        if (arg0 != 4) {
            this.field5066 = (class116) null;
        }
        return this.method2066(0, 4, (byte) 37, arg1, 0);
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(ILjava/lang/Class;)Lke;", line = 205)
    public final class116 method2072(int arg0, Class arg1) {
        if (arg0 != 11) {
            this.method2077(69, (String) null, (Class) null);
        }
        return this.method2066(0, 11, (byte) -119, arg1, 0);
    }

    static {
        new Hashtable(16);
        field5076 = 0L;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Ljava/lang/String;II)Lke;", line = 224)
    public final class116 method2073(String arg0, int arg1, int arg2) {
        if (arg1 != -30885) {
            this.method2080((Frame) null, false);
        }
        return this.method2066(0, 1, (byte) -120, arg0, arg2);
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(I)Ldd;", line = 241)
    public final class278 method2074(int arg0) {
        if (arg0 != 0) {
            this.field5072 = (class222) null;
        }
        return this.field5069;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IB)Lke;", line = 251)
    public final class116 method2075(int arg0, byte arg1) {
        if (arg1 != 42) {
            this.method2072(-12, (Class) null);
        }
        return this.method2066(0, 3, (byte) -114, (Object) null, arg0);
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IIIII)Lke;", line = 273)
    public final class116 method2076(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = 106 / ((arg1 + 64) / 55);
        return this.method2066((arg2 << 16) + arg4, 6, (byte) 101, (Object) null, (arg3 << 16) + arg0);
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Class;)Lke;", line = 281)
    public final class116 method2077(int arg0, String arg1, Class arg2) {
        if (arg0 != 5836) {
            this.method2072(46, (Class) null);
        }
        return this.method2066(0, 9, (byte) 42, new Object[] { arg2, arg1 }, 0);
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Z)Lke;", line = 294)
    public final class116 method2078(boolean arg0) {
        return arg0 ? (class116) null : this.method2066(0, 5, (byte) 118, (Object) null, 0);
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Ljava/lang/Class;B)Lke;", line = 309)
    public final class116 method2079(Class arg0, byte arg1) {
        if (arg1 != -3) {
            this.method2080((Frame) null, false);
        }
        return this.method2066(0, 10, (byte) -98, arg0, 0);
    }

    @OriginalMember(owner = "client!me", name = "run", descriptor = "()V", line = 331)
    public final void run() {
        while (true) {
            class116 var2;
            synchronized (this) {
                while (true) {
                    if (this.field5064) {
                        return;
                    }
                    if (this.field5066 != null) {
                        var2 = this.field5066;
                        this.field5066 = this.field5066.field2064;
                        if (this.field5066 == null) {
                            this.field5074 = null;
                        }
                        break;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var13) {
                    }
                }
            }
            try {
                int var5 = var2.field2066;
                if (var5 == 1) {
                    if (field5076 > class25.method197(-3418)) {
                        throw new IOException();
                    }
                    var2.field2063 = new Socket(InetAddress.getByName((String) var2.field2065), var2.field2068);
                } else if (var5 == 2) {
                    Thread var8 = new Thread((Runnable) var2.field2065);
                    var8.setDaemon(true);
                    var8.start();
                    var8.setPriority(var2.field2068);
                    var2.field2063 = var8;
                } else if (var5 == 4) {
                    if (class25.method197(-3418) < field5076) {
                        throw new IOException();
                    }
                    var2.field2063 = new DataInputStream(((URL) var2.field2065).openStream());
                } else if (var5 == 8) {
                    Object[] var6 = (Object[]) ((Object[]) var2.field2065);
                    var2.field2063 = ((Class) var6[0]).getDeclaredMethod((String) var6[1], (Class[]) ((Class[]) var6[2]));
                } else if (var5 == 9) {
                    Object[] var7 = (Object[]) ((Object[]) var2.field2065);
                    var2.field2063 = ((Class) var7[0]).getDeclaredField((String) var7[1]);
                } else {
                    throw new Exception();
                }
                var2.field2067 = 1;
            } catch (ThreadDeath var11) {
                throw var11;
            } catch (Throwable var12) {
                var2.field2067 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Ljava/awt/Frame;Z)Lke;", line = 427)
    public final class116 method2080(Frame arg0, boolean arg1) {
        if (arg1) {
            field5068 = (String) null;
        }
        return this.method2066(0, 7, (byte) -112, arg0, 0);
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(B)Z", line = 524)
    public final boolean method2081(byte arg0) {
        if (arg0 > -113) {
            this.field5061 = (Applet) null;
        }
        return false;
    }
}
