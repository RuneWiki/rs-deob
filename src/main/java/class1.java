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

@OriginalClass("client!a")
public class class1 implements Runnable {

    @OriginalMember(owner = "client!a", name = "g", descriptor = "Ljava/applet/Applet;")
    public Applet field7 = null;

    @OriginalMember(owner = "client!a", name = "d", descriptor = "Lcd;")
    private class26 field4 = null;

    @OriginalMember(owner = "client!a", name = "f", descriptor = "Lpg;")
    public class170 field6 = null;

    @OriginalMember(owner = "client!a", name = "j", descriptor = "Lpg;")
    public class170 field10 = null;

    @OriginalMember(owner = "client!a", name = "k", descriptor = "Lpg;")
    public class170 field11 = null;

    @OriginalMember(owner = "client!a", name = "r", descriptor = "Lcd;")
    private class26 field18 = null;

    @OriginalMember(owner = "client!a", name = "q", descriptor = "Z")
    private boolean field17 = false;

    @OriginalMember(owner = "client!a", name = "p", descriptor = "Ljava/io/File;")
    private File field16 = null;

    @OriginalMember(owner = "client!a", name = "s", descriptor = "Ljava/io/File;")
    public File field19 = null;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field1;

    @OriginalMember(owner = "client!a", name = "b", descriptor = "Ljava/lang/Thread;")
    private Thread field2;

    @OriginalMember(owner = "client!a", name = "n", descriptor = "I")
    public static int field14 = 3;

    @OriginalMember(owner = "client!a", name = "c", descriptor = "Lea;")
    private class45 field3;

    @OriginalMember(owner = "client!a", name = "l", descriptor = "Ljava/lang/String;")
    public static String field12;

    @OriginalMember(owner = "client!a", name = "m", descriptor = "Ljava/lang/String;")
    public static String field13;

    @OriginalMember(owner = "client!a", name = "e", descriptor = "Ljava/lang/String;")
    private static String field5;

    @OriginalMember(owner = "client!a", name = "o", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field15;

    @OriginalMember(owner = "client!a", name = "h", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field8;

    @OriginalMember(owner = "client!a", name = "i", descriptor = "[Lpg;")
    public class170[] field9;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Ljava/lang/String;II)Lcd;")
    public final class26 method1(String arg0, int arg1, int arg2) {
        return arg2 == -6138 ? this.method2(9, arg1, 0, 1, arg0) : null;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIILjava/lang/Object;)Lcd;")
    private final class26 method2(int arg0, int arg1, int arg2, int arg3, Object arg4) {
        class26 var6 = new class26();
        var6.field593 = arg1;
        if (arg0 != 9) {
            this.field9 = null;
        }
        var6.field592 = arg3;
        var6.field596 = arg4;
        synchronized (this) {
            if (this.field4 == null) {
                this.field4 = this.field18 = var6;
            } else {
                this.field4.field594 = var6;
                this.field4 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Ljava/net/URL;B)Lcd;")
    public final class26 method3(URL arg0, byte arg1) {
        if (arg1 < 29) {
            this.method6(true, 33, null, 0);
        }
        return this.method2(9, 0, 0, 4, arg0);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;I)Lcd;")
    public final class26 method4(Class arg0, String arg1, int arg2) {
        return arg2 == 0 ? this.method2(9, 0, 0, 9, new Object[] { arg0, arg1 }) : null;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(I)Lea;")
    public final class45 method5(int arg0) {
        if (arg0 != 0) {
            this.method8(115, null, -29);
        }
        return this.field3;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(ZILjava/lang/String;I)V")
    private final void method6(boolean arg0, int arg1, String arg2, int arg3) {
        if (arg1 < 32 || arg1 > 34) {
            arg1 = 32;
        }
        if (!arg0) {
            this.method3(null, (byte) -4);
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field5, "/tmp/", "" };
        String[] var6 = new String[] { ".jagex_cache_" + arg1, ".file_store_" + arg1 };
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
                        if (this.field6 == null) {
                            try {
                                File var13 = new File(var11, "random.dat");
                                if (var7 == 1 || var13.exists()) {
                                    this.field6 = new class170(var13, "rw", 25L);
                                }
                            } catch (Exception var21) {
                                this.field6 = null;
                            }
                        }
                        if (this.field16 == null) {
                            try {
                                File var14 = new File(var11, arg2);
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
                                this.field11 = new class170(var16, "rw", 104857600L);
                                this.field9 = new class170[arg3];
                                for (int var17 = 0; var17 < arg3; var17++) {
                                    this.field9[var17] = new class170(new File(var14, "main_file_cache.idx" + var17), "rw", 1048576L);
                                }
                                this.field10 = new class170(new File(var14, "main_file_cache.idx255"), "rw", 1048576L);
                                this.field19 = this.field16 = var14;
                            } catch (Exception var20) {
                                try {
                                    this.field11.method1079((byte) -54);
                                    for (int var18 = 0; var18 < arg3; var18++) {
                                        this.field9[var18].method1079((byte) -54);
                                    }
                                    this.field10.method1079((byte) -54);
                                } catch (Exception var19) {
                                }
                                this.field11 = this.field10 = null;
                                this.field19 = this.field16 = null;
                                this.field9 = null;
                            }
                        }
                    } catch (Exception var22) {
                    }
                    if (this.field6 != null && this.field16 != null) {
                        return;
                    }
                }
            }
        }
        if (this.field16 == null) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Ljava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;I)Lcd;")
    public final class26 method7(String arg0, Class[] arg1, Class arg2, int arg3) {
        return arg3 == 8 ? this.method2(arg3 + 1, 0, 0, 8, new Object[] { arg2, arg0, arg1 }) : null;
    }

    @OriginalMember(owner = "client!a", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class26 var2;
            synchronized (this) {
                while (true) {
                    if (this.field17) {
                        return;
                    }
                    if (this.field18 != null) {
                        var2 = this.field18;
                        this.field18 = this.field18.field594;
                        if (this.field18 == null) {
                            this.field4 = null;
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
                int var3 = var2.field592;
                if (var3 == 1) {
                    var2.field591 = new Socket(InetAddress.getByName((String) var2.field596), var2.field593);
                } else if (var3 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field596);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field593);
                    var2.field591 = var6;
                } else if (var3 == 4) {
                    var2.field591 = new DataInputStream(((URL) var2.field596).openStream());
                } else if (var3 == 8) {
                    Object[] var5 = (Object[]) var2.field596;
                    var2.field591 = ((Class) var5[0]).getDeclaredMethod((String) var5[1], (Class[]) var5[2]);
                } else if (var3 == 9) {
                    Object[] var4 = (Object[]) var2.field596;
                    var2.field591 = ((Class) var4[0]).getDeclaredField((String) var4[1]);
                } else {
                    throw new Exception();
                }
                var2.field595 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field595 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(ILjava/lang/Runnable;I)Lcd;")
    public final class26 method8(int arg0, Runnable arg1, int arg2) {
        return arg0 == 0 ? this.method2(arg0 + 9, arg2, 0, 2, arg1) : null;
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(I)V")
    public final void method9(int arg0) {
        synchronized (this) {
            this.field17 = true;
            this.notifyAll();
        }
        try {
            this.field2.join();
        } catch (InterruptedException var8) {
        }
        if (this.field11 != null) {
            try {
                this.field11.method1079((byte) -54);
            } catch (IOException var7) {
            }
        }
        if (this.field10 != null) {
            try {
                this.field10.method1079((byte) -54);
            } catch (IOException var6) {
            }
        }
        if (arg0 != 14336) {
            field8 = null;
        }
        if (this.field9 != null) {
            for (int var3 = 0; var3 < this.field9.length; var3++) {
                if (this.field9[var3] != null) {
                    try {
                        this.field9[var3].method1079((byte) -54);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field6 != null) {
            try {
                this.field6.method1079((byte) -54);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IB)Lcd;")
    public final class26 method10(int arg0, byte arg1) {
        return arg1 > -3 ? null : this.method2(9, arg0, 0, 3, null);
    }

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
    public class1(boolean arg0, Applet arg1, int arg2, String arg3, int arg4) {
        this.field7 = arg1;
        field13 = "Unknown";
        field12 = "1.1";
        try {
            field13 = System.getProperty("java.vendor");
            field12 = System.getProperty("java.version");
        } catch (Exception var10) {
        }
        try {
            field5 = System.getProperty("user.home");
            if (field5 != null) {
                field5 = field5 + "/";
            }
        } catch (Exception var9) {
        }
        if (field5 == null) {
            field5 = "~/";
        }
        try {
            this.field1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var8) {
        }
        try {
            if (arg1 == null) {
                field15 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field15 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var7) {
        }
        try {
            if (arg1 == null) {
                field8 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field8 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        if (arg0) {
            this.method6(true, arg2, arg3, arg4);
        }
        this.field17 = false;
        this.field2 = new Thread(this);
        this.field2.setPriority(10);
        this.field2.setDaemon(true);
        this.field2.start();
    }
}
