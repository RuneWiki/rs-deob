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

@OriginalClass("client!q")
public class class111 implements Runnable {

    @OriginalMember(owner = "client!q", name = "e", descriptor = "Ljava/applet/Applet;")
    public Applet field2500 = null;

    @OriginalMember(owner = "client!q", name = "d", descriptor = "Ljava/io/File;")
    public File field2499 = null;

    @OriginalMember(owner = "client!q", name = "c", descriptor = "Lg;")
    private class43 field2498 = null;

    @OriginalMember(owner = "client!q", name = "q", descriptor = "Lv;")
    public class146 field2512 = null;

    @OriginalMember(owner = "client!q", name = "b", descriptor = "Lg;")
    private class43 field2497 = null;

    @OriginalMember(owner = "client!q", name = "l", descriptor = "Z")
    private boolean field2507 = false;

    @OriginalMember(owner = "client!q", name = "g", descriptor = "Lv;")
    public class146 field2502 = null;

    @OriginalMember(owner = "client!q", name = "m", descriptor = "Lv;")
    public class146 field2508 = null;

    @OriginalMember(owner = "client!q", name = "s", descriptor = "Ljava/io/File;")
    private File field2514 = null;

    @OriginalMember(owner = "client!q", name = "n", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field2509;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "Ljava/lang/Thread;")
    private Thread field2496;

    @OriginalMember(owner = "client!q", name = "f", descriptor = "I")
    public static int field2501 = 3;

    @OriginalMember(owner = "client!q", name = "j", descriptor = "Lbc;")
    private class11 field2505;

    @OriginalMember(owner = "client!q", name = "h", descriptor = "Ljava/lang/String;")
    private static String field2503;

    @OriginalMember(owner = "client!q", name = "i", descriptor = "Ljava/lang/String;")
    public static String field2504;

    @OriginalMember(owner = "client!q", name = "k", descriptor = "Ljava/lang/String;")
    public static String field2506;

    @OriginalMember(owner = "client!q", name = "o", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field2510;

    @OriginalMember(owner = "client!q", name = "r", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field2513;

    @OriginalMember(owner = "client!q", name = "p", descriptor = "[Lv;")
    public class146[] field2511;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(BLjava/lang/String;I)Lg;")
    public final class43 method873(byte arg0, String arg1, int arg2) {
        if (arg0 >= -45) {
            field2503 = null;
        }
        return this.method877(1, arg2, arg1, (byte) -119, 0);
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(II)Lg;")
    public final class43 method874(int arg0, int arg1) {
        return arg0 == 5 ? this.method877(3, arg1, null, (byte) 29, 0) : null;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(ILjava/lang/Runnable;I)Lg;")
    public final class43 method875(int arg0, Runnable arg1, int arg2) {
        if (arg2 != 2) {
            this.field2500 = null;
        }
        return this.method877(2, arg0, arg1, (byte) 125, 0);
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "([Ljava/lang/Class;ILjava/lang/Class;Ljava/lang/String;)Lg;")
    public final class43 method876(Class[] arg0, int arg1, Class arg2, String arg3) {
        int var5 = 94 / ((arg1 - 29) / 60);
        return this.method877(8, 0, new Object[] { arg2, arg3, arg0 }, (byte) 92, 0);
    }

    @OriginalMember(owner = "client!q", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class43 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2507) {
                        return;
                    }
                    if (this.field2497 != null) {
                        var2 = this.field2497;
                        this.field2497 = this.field2497.field810;
                        if (this.field2497 == null) {
                            this.field2498 = null;
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
                int var3 = var2.field811;
                if (var3 == 1) {
                    var2.field808 = new Socket(InetAddress.getByName((String) var2.field807), var2.field809);
                } else if (var3 == 2) {
                    Thread var4 = new Thread((Runnable) var2.field807);
                    var4.setDaemon(true);
                    var4.start();
                    var4.setPriority(var2.field809);
                    var2.field808 = var4;
                } else if (var3 == 4) {
                    var2.field808 = new DataInputStream(((URL) var2.field807).openStream());
                } else if (var3 == 8) {
                    Object[] var5 = (Object[]) var2.field807;
                    var2.field808 = ((Class) var5[0]).getDeclaredMethod((String) var5[1], (Class[]) var5[2]);
                } else if (var3 == 9) {
                    Object[] var6 = (Object[]) var2.field807;
                    var2.field808 = ((Class) var6[0]).getDeclaredField((String) var6[1]);
                } else {
                    throw new Exception();
                }
                var2.field806 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field806 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IILjava/lang/Object;BI)Lg;")
    private final class43 method877(int arg0, int arg1, Object arg2, byte arg3, int arg4) {
        class43 var6 = new class43();
        var6.field807 = arg2;
        var6.field811 = arg0;
        var6.field809 = arg1;
        synchronized (this) {
            int var8 = -97 / ((arg3 + 54) / 35);
            if (this.field2498 == null) {
                this.field2498 = this.field2497 = var6;
            } else {
                this.field2498.field810 = var6;
                this.field2498 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(I)Lbc;")
    public final class11 method878(int arg0) {
        int var2 = 44 % ((arg0 - 50) / 49);
        return this.field2505;
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(I)V")
    public final void method879(int arg0) {
        if (arg0 != 2830) {
            return;
        }
        synchronized (this) {
            this.field2507 = true;
            this.notifyAll();
        }
        try {
            this.field2496.join();
        } catch (InterruptedException var8) {
        }
        if (this.field2512 != null) {
            try {
                this.field2512.method1126((byte) -111);
            } catch (IOException var7) {
            }
        }
        if (this.field2508 != null) {
            try {
                this.field2508.method1126((byte) -125);
            } catch (IOException var6) {
            }
        }
        if (this.field2511 != null) {
            for (int var3 = 0; var3 < this.field2511.length; var3++) {
                if (this.field2511[var3] != null) {
                    try {
                        this.field2511[var3].method1126((byte) -116);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field2502 != null) {
            try {
                this.field2502.method1126((byte) -116);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Class;)Lg;")
    public final class43 method880(int arg0, String arg1, Class arg2) {
        return arg0 == 4 ? this.method877(9, 0, new Object[] { arg2, arg1 }, (byte) -116, 0) : null;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(ZLjava/lang/String;II)V")
    private final void method881(boolean arg0, String arg1, int arg2, int arg3) {
        if (arg0) {
            this.method877(73, 107, null, (byte) -78, 47);
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field2503, "/tmp/", "" };
        if (arg2 < 32 || arg2 > 34) {
            arg2 = 32;
        }
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
                        if (this.field2502 == null) {
                            try {
                                File var13 = new File(var11, "random.dat");
                                if (var7 == 1 || var13.exists()) {
                                    this.field2502 = new class146(var13, "rw", 25L);
                                }
                            } catch (Exception var21) {
                                this.field2502 = null;
                            }
                        }
                        if (this.field2514 == null) {
                            try {
                                File var14 = new File(var11, arg1);
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
                                this.field2512 = new class146(var16, "rw", 52428800L);
                                this.field2511 = new class146[arg3];
                                for (int var17 = 0; var17 < arg3; var17++) {
                                    this.field2511[var17] = new class146(new File(var14, "main_file_cache.idx" + var17), "rw", 1048576L);
                                }
                                this.field2508 = new class146(new File(var14, "main_file_cache.idx255"), "rw", 1048576L);
                                this.field2499 = this.field2514 = var14;
                            } catch (Exception var20) {
                                try {
                                    this.field2512.method1126((byte) -113);
                                    for (int var18 = 0; var18 < arg3; var18++) {
                                        this.field2511[var18].method1126((byte) -111);
                                    }
                                    this.field2508.method1126((byte) -116);
                                } catch (Exception var19) {
                                }
                                this.field2511 = null;
                                this.field2512 = this.field2508 = null;
                                this.field2499 = this.field2514 = null;
                            }
                        }
                    } catch (Exception var22) {
                    }
                    if (this.field2502 != null && this.field2514 != null) {
                        return;
                    }
                }
            }
        }
        if (this.field2514 == null) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Ljava/net/URL;I)Lg;")
    public final class43 method882(URL arg0, int arg1) {
        int var3 = 74 / ((-arg1 - 25) / 54);
        return this.method877(4, 0, arg0, (byte) -105, 0);
    }

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
    public class111(boolean arg0, Applet arg1, int arg2, String arg3, int arg4) {
        field2506 = "Unknown";
        this.field2500 = arg1;
        field2504 = "1.1";
        try {
            field2506 = System.getProperty("java.vendor");
            field2504 = System.getProperty("java.version");
        } catch (Exception var10) {
        }
        try {
            field2503 = System.getProperty("user.home");
            if (field2503 != null) {
                field2503 = field2503 + "/";
            }
        } catch (Exception var9) {
        }
        if (field2503 == null) {
            field2503 = "~/";
        }
        try {
            this.field2509 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var8) {
        }
        try {
            if (arg1 == null) {
                field2513 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field2513 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var7) {
        }
        try {
            if (arg1 == null) {
                field2510 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field2510 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        if (arg0) {
            this.method881(false, arg3, arg2, arg4);
        }
        this.field2507 = false;
        this.field2496 = new Thread(this);
        this.field2496.setPriority(10);
        this.field2496.setDaemon(true);
        this.field2496.start();
    }
}
