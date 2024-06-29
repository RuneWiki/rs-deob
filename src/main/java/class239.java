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

@OriginalClass("client!gj")
public class class239 implements Runnable {

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "Lme;")
    public class20 field4084 = null;

    @OriginalMember(owner = "client!gj", name = "f", descriptor = "Ljava/applet/Applet;")
    public Applet field4088 = null;

    @OriginalMember(owner = "client!gj", name = "i", descriptor = "Lme;")
    public class20 field4091 = null;

    @OriginalMember(owner = "client!gj", name = "j", descriptor = "Z")
    private boolean field4092 = false;

    @OriginalMember(owner = "client!gj", name = "l", descriptor = "Leg;")
    private class5 field4094 = null;

    @OriginalMember(owner = "client!gj", name = "h", descriptor = "Ljava/io/File;")
    private File field4090 = null;

    @OriginalMember(owner = "client!gj", name = "t", descriptor = "Lme;")
    public class20 field4102 = null;

    @OriginalMember(owner = "client!gj", name = "k", descriptor = "Leg;")
    private class5 field4093 = null;

    @OriginalMember(owner = "client!gj", name = "s", descriptor = "Ljava/io/File;")
    public File field4101 = null;

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field4085;

    @OriginalMember(owner = "client!gj", name = "r", descriptor = "Ljava/lang/Thread;")
    private Thread field4100;

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "I")
    public static int field4086 = 3;

    @OriginalMember(owner = "client!gj", name = "m", descriptor = "Lmb;")
    private class140 field4095;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "Ljava/lang/String;")
    public static String field4083;

    @OriginalMember(owner = "client!gj", name = "g", descriptor = "Ljava/lang/String;")
    private static String field4089;

    @OriginalMember(owner = "client!gj", name = "o", descriptor = "Ljava/lang/String;")
    public static String field4097;

    @OriginalMember(owner = "client!gj", name = "q", descriptor = "Ljava/lang/String;")
    public static String field4099;

    @OriginalMember(owner = "client!gj", name = "e", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field4087;

    @OriginalMember(owner = "client!gj", name = "n", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field4096;

    @OriginalMember(owner = "client!gj", name = "p", descriptor = "[Lme;")
    public class20[] field4098;

    @OriginalMember(owner = "client!gj", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class5 var2;
            synchronized (this) {
                while (true) {
                    if (this.field4092) {
                        return;
                    }
                    if (this.field4094 != null) {
                        var2 = this.field4094;
                        this.field4094 = this.field4094.field62;
                        if (this.field4094 == null) {
                            this.field4093 = null;
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
                int var3 = var2.field60;
                if (var3 == 1) {
                    var2.field59 = new Socket(InetAddress.getByName((String) var2.field58), var2.field61);
                } else if (var3 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field58);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field61);
                    var2.field59 = var6;
                } else if (var3 == 4) {
                    var2.field59 = new DataInputStream(((URL) var2.field58).openStream());
                } else if (var3 == 8) {
                    Object[] var5 = (Object[]) var2.field58;
                    var2.field59 = ((Class) var5[0]).getDeclaredMethod((String) var5[1], (Class[]) var5[2]);
                } else if (var3 == 9) {
                    Object[] var4 = (Object[]) var2.field58;
                    var2.field59 = ((Class) var4[0]).getDeclaredField((String) var4[1]);
                } else {
                    throw new Exception();
                }
                var2.field57 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field57 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(BILjava/lang/Runnable;)Leg;")
    public final class5 method1553(byte arg0, int arg1, Runnable arg2) {
        return arg0 < 15 ? null : this.method1561(2, 0, (byte) -25, arg2, arg1);
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/Class;)Leg;")
    public final class5 method1554(byte arg0, String arg1, Class arg2) {
        if (arg0 >= -66) {
            this.field4095 = null;
        }
        return this.method1561(9, 0, (byte) -46, new Object[] { arg2, arg1 }, 0);
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(I)V")
    public final void method1555(int arg0) {
        synchronized (this) {
            this.field4092 = true;
            this.notifyAll();
        }
        try {
            this.field4100.join();
        } catch (InterruptedException var8) {
        }
        if (arg0 != 27890) {
            this.method1563(-91, 89, 46, null);
        }
        if (this.field4102 != null) {
            try {
                this.field4102.method104(-116);
            } catch (IOException var7) {
            }
        }
        if (this.field4084 != null) {
            try {
                this.field4084.method104(arg0 - 28015);
            } catch (IOException var6) {
            }
        }
        if (this.field4098 != null) {
            for (int var3 = 0; var3 < this.field4098.length; var3++) {
                if (this.field4098[var3] != null) {
                    try {
                        this.field4098[var3].method104(arg0 - 28001);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field4091 != null) {
            try {
                this.field4091.method104(-123);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Ljava/lang/String;B)Leg;")
    public final class5 method1556(String arg0, byte arg1) {
        int var3 = -47 / ((18 - arg1) / 56);
        return this.method1561(12, 0, (byte) -16, arg0, 0);
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IB)Leg;")
    public final class5 method1557(int arg0, byte arg1) {
        int var3 = -82 / ((arg1 - 32) / 58);
        return this.method1561(3, 0, (byte) 127, null, arg0);
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(ZLjava/lang/String;I)Leg;")
    public final class5 method1558(boolean arg0, String arg1, int arg2) {
        if (!arg0) {
            this.field4094 = null;
        }
        return this.method1561(1, 0, (byte) 122, arg1, arg2);
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Ljava/lang/Class;I)Leg;")
    public final class5 method1559(Class arg0, int arg1) {
        if (arg1 > -14) {
            this.method1560(null, -6);
        }
        return this.method1561(13, 0, (byte) -41, arg0, 0);
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(Ljava/lang/Class;I)Leg;")
    public final class5 method1560(Class arg0, int arg1) {
        if (arg1 != -25852) {
            this.field4092 = false;
        }
        return this.method1561(11, 0, (byte) -105, arg0, 0);
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIBLjava/lang/Object;I)Leg;")
    private final class5 method1561(int arg0, int arg1, byte arg2, Object arg3, int arg4) {
        class5 var6 = new class5();
        int var7 = -98 % ((61 - arg2) / 59);
        var6.field61 = arg4;
        var6.field58 = arg3;
        var6.field60 = arg0;
        synchronized (this) {
            if (this.field4093 == null) {
                this.field4093 = this.field4094 = var6;
            } else {
                this.field4093.field62 = var6;
                this.field4093 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(B)Lmb;")
    public final class140 method1562(byte arg0) {
        int var2 = 66 % ((-arg0 - 25) / 37);
        return this.field4095;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIILjava/lang/String;)V")
    private final void method1563(int arg0, int arg1, int arg2, String arg3) {
        if (arg2 < 32 || arg2 > 34) {
            arg2 = 32;
        }
        if (arg0 != -15063) {
            this.field4091 = null;
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field4089, "/tmp/", "" };
        String[] var6 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < var6.length; var8++) {
                for (int var9 = 0; var9 < var5.length; var9++) {
                    try {
                        String var10 = var5[var9];
                        if (var10.length() > 0 && !(new File(var10)).exists()) {
                            continue;
                        }
                        File var11 = new File(var10 + var6[var8]);
                        if (var7 == 1 && !var11.exists()) {
                            boolean var12 = var11.mkdir();
                            if (!var12) {
                                continue;
                            }
                        }
                        if (this.field4091 == null) {
                            try {
                                File var13 = new File(var11, "random.dat");
                                if (var7 == 1 || var13.exists()) {
                                    this.field4091 = new class20(var13, "rw", 25L);
                                }
                            } catch (Exception var21) {
                                this.field4091 = null;
                            }
                        }
                        if (this.field4090 == null) {
                            try {
                                File var14 = new File(var11, arg3);
                                if (var7 == 1 && !var14.exists()) {
                                    boolean var15 = var14.mkdir();
                                    if (!var15) {
                                        continue;
                                    }
                                }
                                File var16 = new File(var14, "main_file_cache.dat2");
                                if (var7 == 0 && !var16.exists()) {
                                    continue;
                                }
                                this.field4102 = new class20(var16, "rw", 104857600L);
                                this.field4098 = new class20[arg1];
                                for (int var17 = 0; var17 < arg1; var17++) {
                                    this.field4098[var17] = new class20(new File(var14, "main_file_cache.idx" + var17), "rw", 1048576L);
                                }
                                this.field4084 = new class20(new File(var14, "main_file_cache.idx255"), "rw", 1048576L);
                                this.field4101 = this.field4090 = var14;
                            } catch (Exception var20) {
                                try {
                                    this.field4102.method104(arg0 ^ 0x3AA9);
                                    for (int var18 = 0; var18 < arg1; var18++) {
                                        this.field4098[var18].method104(arg0 ^ 0x3AAD);
                                    }
                                    this.field4084.method104(arg0 + 14944);
                                } catch (Exception var19) {
                                }
                                this.field4101 = this.field4090 = null;
                                this.field4098 = null;
                                this.field4102 = this.field4084 = null;
                            }
                        }
                    } catch (Exception var22) {
                    }
                    if (this.field4091 != null && this.field4090 != null) {
                        return;
                    }
                }
            }
        }
        if (this.field4090 == null) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Ljava/net/URL;B)Leg;")
    public final class5 method1564(URL arg0, byte arg1) {
        if (arg1 <= 105) {
            field4097 = null;
        }
        return this.method1561(4, 0, (byte) -34, arg0, 0);
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "([Ljava/lang/Class;Ljava/lang/String;ZLjava/lang/Class;)Leg;")
    public final class5 method1565(Class[] arg0, String arg1, boolean arg2, Class arg3) {
        return arg2 ? this.method1561(8, 0, (byte) -65, new Object[] { arg3, arg1, arg0 }, 0) : null;
    }

    @OriginalMember(owner = "client!gj", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
    public class239(boolean arg0, Applet arg1, int arg2, String arg3, int arg4) {
        field4083 = "1.1";
        this.field4088 = arg1;
        field4099 = "Unknown";
        try {
            field4099 = System.getProperty("java.vendor");
            field4083 = System.getProperty("java.version");
        } catch (Exception var11) {
        }
        try {
            field4097 = System.getProperty("os.name").toLowerCase();
        } catch (Exception var10) {
            field4097 = "unknown";
        }
        try {
            field4089 = System.getProperty("user.home");
            if (field4089 != null) {
                field4089 = field4089 + "/";
            }
        } catch (Exception var9) {
        }
        if (field4089 == null) {
            field4089 = "~/";
        }
        try {
            this.field4085 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var8) {
        }
        try {
            if (arg1 == null) {
                field4096 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field4096 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var7) {
        }
        try {
            if (arg1 == null) {
                field4087 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field4087 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        if (arg0) {
            this.method1563(-15063, arg4, arg2, arg3);
        }
        this.field4092 = false;
        this.field4100 = new Thread(this);
        this.field4100.setPriority(10);
        this.field4100.setDaemon(true);
        this.field4100.start();
    }
}
