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

@OriginalClass("client!gd")
public class class123 implements Runnable {

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "Ljava/applet/Applet;")
    public Applet field2277 = null;

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "Lcj;")
    public class261 field2280 = null;

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "Lic;")
    private class263 field2276 = null;

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "Lic;")
    private class263 field2279 = null;

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "Lcj;")
    public class261 field2274 = null;

    @OriginalMember(owner = "client!gd", name = "l", descriptor = "Lcj;")
    public class261 field2284 = null;

    @OriginalMember(owner = "client!gd", name = "i", descriptor = "Z")
    private boolean field2281 = false;

    @OriginalMember(owner = "client!gd", name = "j", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field2282;

    @OriginalMember(owner = "client!gd", name = "v", descriptor = "Ljava/lang/Thread;")
    private Thread field2294;

    @OriginalMember(owner = "client!gd", name = "p", descriptor = "I")
    public static int field2288 = 3;

    @OriginalMember(owner = "client!gd", name = "u", descriptor = "J")
    public static volatile long field2293;

    @OriginalMember(owner = "client!gd", name = "m", descriptor = "Llh;")
    private class191 field2285;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "Ljava/lang/String;")
    public static String field2273;

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "Ljava/lang/String;")
    public static String field2275;

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "Ljava/lang/String;")
    public static String field2278;

    @OriginalMember(owner = "client!gd", name = "k", descriptor = "Ljava/lang/String;")
    private static String field2283;

    @OriginalMember(owner = "client!gd", name = "n", descriptor = "Ljava/lang/String;")
    public static String field2286;

    @OriginalMember(owner = "client!gd", name = "q", descriptor = "Ljava/lang/String;")
    public static String field2289;

    @OriginalMember(owner = "client!gd", name = "r", descriptor = "Ljava/lang/String;")
    public static String field2290;

    @OriginalMember(owner = "client!gd", name = "s", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field2291;

    @OriginalMember(owner = "client!gd", name = "t", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field2292;

    @OriginalMember(owner = "client!gd", name = "o", descriptor = "[Lcj;")
    public class261[] field2287;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Ljava/lang/String;I)Lic;")
    public final class263 method940(String arg0, int arg1) {
        return arg1 == 0 ? this.method944(0, 16, arg0, arg1 + 6, 0) : null;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)Llh;")
    public final class191 method941(byte arg0) {
        if (arg0 < 56) {
            this.field2282 = null;
        }
        return this.field2285;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILjava/lang/String;I)Lic;")
    public final class263 method942(int arg0, String arg1, int arg2) {
        if (arg2 != 11) {
            this.field2287 = null;
        }
        return this.method944(0, 1, arg1, 6, arg0);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V")
    public final void method943(int arg0) {
        if (arg0 >= -31) {
            this.method948((Component) null, true, 76);
        }
        field2293 = class155.method1133(124) + 5000L;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IILjava/lang/Object;II)Lic;")
    private final class263 method944(int arg0, int arg1, Object arg2, int arg3, int arg4) {
        class263 var6 = new class263();
        var6.field4603 = arg1;
        var6.field4600 = arg2;
        if (arg3 != 6) {
            return null;
        }
        var6.field4602 = arg4;
        synchronized (this) {
            if (this.field2279 == null) {
                this.field2279 = this.field2276 = var6;
            } else {
                this.field2279.field4601 = var6;
                this.field2279 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(I)V")
    public final void method945(int arg0) {
        synchronized (this) {
            this.field2281 = true;
            this.notifyAll();
        }
        try {
            this.field2294.join();
        } catch (InterruptedException var8) {
        }
        if (this.field2274 != null) {
            try {
                this.field2274.method1804(0);
            } catch (IOException var7) {
            }
        }
        if (arg0 != -2637) {
            return;
        }
        if (this.field2284 != null) {
            try {
                this.field2284.method1804(0);
            } catch (IOException var6) {
            }
        }
        if (this.field2287 != null) {
            for (int var3 = 0; var3 < this.field2287.length; var3++) {
                if (this.field2287[var3] != null) {
                    try {
                        this.field2287[var3].method1804(0);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field2280 != null) {
            try {
                this.field2280.method1804(arg0 + 2637);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IILjava/lang/Runnable;)Lic;")
    public final class263 method946(int arg0, int arg1, Runnable arg2) {
        if (arg1 != 0) {
            this.field2294 = null;
        }
        return this.method944(0, 2, arg2, arg1 ^ 0x6, arg0);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Ljava/lang/Class;BLjava/lang/String;)Lic;")
    public final class263 method947(Class arg0, byte arg1, String arg2) {
        return arg1 == 73 ? this.method944(0, 9, new Object[] { arg0, arg2 }, 6, 0) : null;
    }

    @OriginalMember(owner = "client!gd", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class263 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2281) {
                        return;
                    }
                    if (this.field2276 != null) {
                        var2 = this.field2276;
                        this.field2276 = this.field2276.field4601;
                        if (this.field2276 == null) {
                            this.field2279 = null;
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
                int var3 = var2.field4603;
                if (var3 == 1) {
                    if (field2293 > class155.method1133(127)) {
                        throw new IOException();
                    }
                    var2.field4604 = new Socket(InetAddress.getByName((String) var2.field4600), var2.field4602);
                } else if (var3 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field4600);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field4602);
                    var2.field4604 = var6;
                } else if (var3 == 4) {
                    if (field2293 > class155.method1133(126)) {
                        throw new IOException();
                    }
                    var2.field4604 = new DataInputStream(((URL) var2.field4600).openStream());
                } else if (var3 == 8) {
                    Object[] var4 = (Object[]) var2.field4600;
                    var2.field4604 = ((Class) var4[0]).getDeclaredMethod((String) var4[1], (Class[]) var4[2]);
                } else if (var3 == 9) {
                    Object[] var5 = (Object[]) var2.field4600;
                    var2.field4604 = ((Class) var5[0]).getDeclaredField((String) var5[1]);
                } else {
                    throw new Exception();
                }
                var2.field4605 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field4605 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Ljava/awt/Component;ZI)Lic;")
    public final class263 method948(Component arg0, boolean arg1, int arg2) {
        if (arg2 != 1) {
            this.method942(-36, (String) null, -85);
        }
        return this.method944(0, 15, arg0, 6, arg1 ? 1 : 0);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IILjava/awt/Component;I)Lic;")
    public final class263 method949(int arg0, int arg1, Component arg2, int arg3) {
        if (arg0 >= -117) {
            this.method951(25, 102);
        }
        Point var5 = arg2.getLocationOnScreen();
        return this.method944(var5.y + arg1, 14, (Object) null, 6, var5.x + arg3);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Ljava/net/URL;I)Lic;")
    public final class263 method950(URL arg0, int arg1) {
        if (arg1 >= -10) {
            field2288 = -60;
        }
        return this.method944(0, 4, arg0, 6, 0);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(II)Lic;")
    public final class263 method951(int arg0, int arg1) {
        if (arg1 != -20064) {
            field2275 = null;
        }
        return this.method944(0, 3, (Object) null, 6, arg0);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/Class;[Ljava/lang/Class;)Lic;")
    public final class263 method952(byte arg0, String arg1, Class arg2, Class[] arg3) {
        return arg0 >= -103 ? null : this.method944(0, 8, new Object[] { arg2, arg1, arg3 }, 6, 0);
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(Ljava/lang/String;I)Lic;")
    public final class263 method953(String arg0, int arg1) {
        return arg1 == 0 ? this.method944(0, 12, arg0, 6, 0) : null;
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
    public class123(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        field2278 = "Unknown";
        field2286 = "1.1";
        this.field2277 = arg0;
        try {
            field2278 = System.getProperty("java.vendor");
            field2286 = System.getProperty("java.version");
        } catch (Exception var12) {
        }
        try {
            field2275 = System.getProperty("os.name");
        } catch (Exception var11) {
            field2275 = "Unknown";
        }
        field2273 = field2275.toLowerCase();
        try {
            field2290 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var10) {
            field2290 = "";
        }
        try {
            field2289 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var9) {
            field2289 = "";
        }
        try {
            field2283 = System.getProperty("user.home");
            if (field2283 != null) {
                field2283 = field2283 + "/";
            }
        } catch (Exception var8) {
        }
        if (field2283 == null) {
            field2283 = "~/";
        }
        try {
            this.field2282 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var7) {
        }
        try {
            if (arg0 == null) {
                field2291 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field2291 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        try {
            if (arg0 == null) {
                field2292 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field2292 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var5) {
        }
        this.field2281 = false;
        this.field2294 = new Thread(this);
        this.field2294.setPriority(10);
        this.field2294.setDaemon(true);
        this.field2294.start();
    }

    static {
        new Hashtable(16);
        field2293 = 0L;
    }
}
