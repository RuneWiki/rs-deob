import java.applet.Applet;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class229 implements Runnable {

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "Lqe;")
    private class176 field4288 = null;

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "Ljava/io/File;")
    public File field4290 = null;

    @OriginalMember(owner = "client!vi", name = "o", descriptor = "Lqe;")
    private class176 field4302 = null;

    @OriginalMember(owner = "client!vi", name = "e", descriptor = "Ljava/io/File;")
    private File field4292 = null;

    @OriginalMember(owner = "client!vi", name = "j", descriptor = "Lkd;")
    public class113 field4297 = null;

    @OriginalMember(owner = "client!vi", name = "l", descriptor = "Lkd;")
    public class113 field4299 = null;

    @OriginalMember(owner = "client!vi", name = "m", descriptor = "Z")
    private boolean field4300 = false;

    @OriginalMember(owner = "client!vi", name = "n", descriptor = "Ljava/applet/Applet;")
    public Applet field4301 = null;

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "Lkd;")
    public class113 field4289 = null;

    @OriginalMember(owner = "client!vi", name = "k", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field4298;

    @OriginalMember(owner = "client!vi", name = "h", descriptor = "Ljava/lang/Thread;")
    private Thread field4295;

    @OriginalMember(owner = "client!vi", name = "s", descriptor = "I")
    public static int field4306 = 3;

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "Ldi;")
    private class43 field4291;

    @OriginalMember(owner = "client!vi", name = "g", descriptor = "Ljava/lang/String;")
    public static String field4294;

    @OriginalMember(owner = "client!vi", name = "i", descriptor = "Ljava/lang/String;")
    private static String field4296;

    @OriginalMember(owner = "client!vi", name = "p", descriptor = "Ljava/lang/String;")
    public static String field4303;

    @OriginalMember(owner = "client!vi", name = "q", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field4304;

    @OriginalMember(owner = "client!vi", name = "r", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field4305;

    @OriginalMember(owner = "client!vi", name = "f", descriptor = "[Lkd;")
    public class113[] field4293;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(B)Ldi;")
    public final class43 method1497(byte arg0) {
        int var2 = -79 / ((arg0 - 10) / 57);
        return this.field4291;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(ILjava/net/URL;)Lqe;")
    public final class176 method1498(int arg0, URL arg1) {
        int var3 = 115 / ((arg0 - 2) / 35);
        return this.method1506(0, (byte) -90, arg1, 4, 0);
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "([Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;Z)Lqe;")
    public final class176 method1499(Class[] arg0, String arg1, Class arg2, boolean arg3) {
        if (arg3) {
            this.method1497((byte) -123);
        }
        return this.method1506(0, (byte) -91, new Object[] { arg2, arg1, arg0 }, 8, 0);
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(B)V")
    public final void method1500(byte arg0) {
        synchronized (this) {
            this.field4300 = true;
            if (arg0 != 39) {
                this.method1503(-55, (byte) 105, null, -34);
            }
            this.notifyAll();
        }
        try {
            this.field4295.join();
        } catch (InterruptedException var8) {
        }
        if (this.field4297 != null) {
            try {
                this.field4297.method797(arg0 ^ 0xFFFFFFA8);
            } catch (IOException var7) {
            }
        }
        if (this.field4289 != null) {
            try {
                this.field4289.method797(-112);
            } catch (IOException var6) {
            }
        }
        if (this.field4293 != null) {
            for (int var3 = 0; var3 < this.field4293.length; var3++) {
                if (this.field4293[var3] != null) {
                    try {
                        this.field4293[var3].method797(arg0 - 167);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field4299 != null) {
            try {
                this.field4299.method797(arg0 - 140);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!vi", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class176 var2;
            synchronized (this) {
                while (true) {
                    if (this.field4300) {
                        return;
                    }
                    if (this.field4302 != null) {
                        var2 = this.field4302;
                        this.field4302 = this.field4302.field3045;
                        if (this.field4302 == null) {
                            this.field4288 = null;
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
                int var3 = var2.field3044;
                if (var3 == 1) {
                    var2.field3040 = new Socket(InetAddress.getByName((String) var2.field3042), var2.field3041);
                } else if (var3 == 2) {
                    Thread var4 = new Thread((Runnable) var2.field3042);
                    var4.setDaemon(true);
                    var4.start();
                    var4.setPriority(var2.field3041);
                    var2.field3040 = var4;
                } else if (var3 == 4) {
                    var2.field3040 = new DataInputStream(((URL) var2.field3042).openStream());
                } else if (var3 == 8) {
                    Object[] var6 = (Object[]) var2.field3042;
                    var2.field3040 = ((Class) var6[0]).getDeclaredMethod((String) var6[1], (Class[]) var6[2]);
                } else if (var3 == 9) {
                    Object[] var5 = (Object[]) var2.field3042;
                    var2.field3040 = ((Class) var5[0]).getDeclaredField((String) var5[1]);
                } else {
                    throw new Exception();
                }
                var2.field3043 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field3043 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(ILjava/lang/Runnable;Z)Lqe;")
    public final class176 method1501(int arg0, Runnable arg1, boolean arg2) {
        if (arg2) {
            this.method1506(117, (byte) 80, null, 63, 115);
        }
        return this.method1506(0, (byte) -122, arg1, 2, arg0);
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Ljava/lang/String;II)Lqe;")
    public final class176 method1502(String arg0, int arg1, int arg2) {
        if (arg2 != -17012) {
            this.field4288 = null;
        }
        return this.method1506(0, (byte) -117, arg0, 1, arg1);
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IBLjava/lang/String;I)V")
    private final void method1503(int arg0, byte arg1, String arg2, int arg3) {
        if (arg0 < 32 || arg0 > 34) {
            arg0 = 32;
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field4296, "/tmp/", "" };
        String[] var6 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
        int var7 = 0;
        int var8 = -7 / ((-arg1 - 79) / 45);
        while (var7 < 2) {
            for (int var9 = 0; var9 < var6.length; var9++) {
                for (int var10 = 0; var10 < var5.length; var10++) {
                    try {
                        String var11 = var5[var10];
                        if (var11.length() > 0 && !(new File(var11)).exists()) {
                            continue;
                        }
                        File var12 = new File(var11 + var6[var9]);
                        if (var7 == 1 && !var12.exists()) {
                            boolean var13 = var12.mkdir();
                            if (!var13) {
                                continue;
                            }
                        }
                        if (this.field4299 == null) {
                            try {
                                File var14 = new File(var12, "random.dat");
                                if (var7 == 1 || var14.exists()) {
                                    this.field4299 = new class113(var14, "rw", 25L);
                                }
                            } catch (Exception var22) {
                                this.field4299 = null;
                            }
                        }
                        if (this.field4292 == null) {
                            try {
                                File var15 = new File(var12, arg2);
                                if (var7 == 1 && !var15.exists()) {
                                    boolean var16 = var15.mkdir();
                                    if (!var16) {
                                        continue;
                                    }
                                }
                                File var17 = new File(var15, "main_file_cache.dat2");
                                if (var7 == 0 && !var17.exists()) {
                                    continue;
                                }
                                this.field4297 = new class113(var17, "rw", 104857600L);
                                this.field4293 = new class113[arg3];
                                for (int var18 = 0; var18 < arg3; var18++) {
                                    this.field4293[var18] = new class113(new File(var15, "main_file_cache.idx" + var18), "rw", 1048576L);
                                }
                                this.field4289 = new class113(new File(var15, "main_file_cache.idx255"), "rw", 1048576L);
                                this.field4290 = this.field4292 = var15;
                            } catch (Exception var21) {
                                try {
                                    this.field4297.method797(-105);
                                    for (int var19 = 0; var19 < arg3; var19++) {
                                        this.field4293[var19].method797(-116);
                                    }
                                    this.field4289.method797(-121);
                                } catch (Exception var20) {
                                }
                                this.field4297 = this.field4289 = null;
                                this.field4290 = this.field4292 = null;
                                this.field4293 = null;
                            }
                        }
                    } catch (Exception var23) {
                    }
                    if (this.field4299 != null && this.field4292 != null) {
                        return;
                    }
                }
            }
            var7++;
        }
        if (this.field4292 == null) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(BI)Lqe;")
    public final class176 method1504(byte arg0, int arg1) {
        return arg0 == 65 ? this.method1506(0, (byte) -128, null, 3, arg1) : null;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/Class;)Lqe;")
    public final class176 method1505(byte arg0, String arg1, Class arg2) {
        if (arg0 != 10) {
            this.method1504((byte) 48, 42);
        }
        return this.method1506(0, (byte) -102, new Object[] { arg2, arg1 }, 9, 0);
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IBLjava/lang/Object;II)Lqe;")
    private final class176 method1506(int arg0, byte arg1, Object arg2, int arg3, int arg4) {
        if (arg1 >= -78) {
            this.method1498(6, null);
        }
        class176 var6 = new class176();
        var6.field3044 = arg3;
        var6.field3041 = arg4;
        var6.field3042 = arg2;
        synchronized (this) {
            if (this.field4288 == null) {
                this.field4288 = this.field4302 = var6;
            } else {
                this.field4288.field3045 = var6;
                this.field4288 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
    public class229(boolean arg0, Applet arg1, int arg2, String arg3, int arg4) {
        field4294 = "Unknown";
        field4303 = "1.1";
        this.field4301 = arg1;
        try {
            field4294 = System.getProperty("java.vendor");
            field4303 = System.getProperty("java.version");
        } catch (Exception var10) {
        }
        try {
            field4296 = System.getProperty("user.home");
            if (field4296 != null) {
                field4296 = field4296 + "/";
            }
        } catch (Exception var9) {
        }
        if (field4296 == null) {
            field4296 = "~/";
        }
        try {
            this.field4298 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var8) {
        }
        try {
            if (arg1 == null) {
                field4304 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field4304 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var7) {
        }
        try {
            if (arg1 == null) {
                field4305 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field4305 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        if (arg0) {
            this.method1503(arg2, (byte) -125, arg3, arg4);
        }
        this.field4300 = false;
        this.field4295 = new Thread(this);
        this.field4295.setPriority(10);
        this.field4295.setDaemon(true);
        this.field4295.start();
    }
}
