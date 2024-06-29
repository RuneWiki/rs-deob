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

@OriginalClass("client!qd")
public class class149 implements Runnable {

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "Lec;")
    public class42 field2866 = null;

    @OriginalMember(owner = "client!qd", name = "l", descriptor = "Lec;")
    public class42 field2877 = null;

    @OriginalMember(owner = "client!qd", name = "h", descriptor = "Ljava/applet/Applet;")
    public Applet field2873 = null;

    @OriginalMember(owner = "client!qd", name = "o", descriptor = "Ljava/io/File;")
    public File field2880 = null;

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "Lca;")
    private class22 field2867 = null;

    @OriginalMember(owner = "client!qd", name = "n", descriptor = "Ljava/io/File;")
    private File field2879 = null;

    @OriginalMember(owner = "client!qd", name = "j", descriptor = "Z")
    private boolean field2875 = false;

    @OriginalMember(owner = "client!qd", name = "s", descriptor = "Lca;")
    private class22 field2884 = null;

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "Lec;")
    public class42 field2871 = null;

    @OriginalMember(owner = "client!qd", name = "i", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field2874;

    @OriginalMember(owner = "client!qd", name = "k", descriptor = "Ljava/lang/Thread;")
    private Thread field2876;

    @OriginalMember(owner = "client!qd", name = "q", descriptor = "I")
    public static int field2882 = 3;

    @OriginalMember(owner = "client!qd", name = "g", descriptor = "Lda;")
    private class31 field2872;

    @OriginalMember(owner = "client!qd", name = "m", descriptor = "Ljava/lang/String;")
    public static String field2878;

    @OriginalMember(owner = "client!qd", name = "p", descriptor = "Ljava/lang/String;")
    private static String field2881;

    @OriginalMember(owner = "client!qd", name = "r", descriptor = "Ljava/lang/String;")
    public static String field2883;

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field2868;

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field2869;

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "[Lec;")
    public class42[] field2870;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(B)V")
    public final void method907(byte arg0) {
        synchronized (this) {
            this.field2875 = true;
            this.notifyAll();
        }
        try {
            this.field2876.join();
        } catch (InterruptedException var8) {
        }
        if (this.field2877 != null) {
            try {
                this.field2877.method228((byte) 45);
            } catch (IOException var7) {
            }
        }
        if (this.field2866 != null) {
            try {
                this.field2866.method228((byte) 45);
            } catch (IOException var6) {
            }
        }
        if (this.field2870 != null) {
            for (int var3 = 0; var3 < this.field2870.length; var3++) {
                if (this.field2870[var3] != null) {
                    try {
                        this.field2870[var3].method228((byte) 45);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (arg0 == -66 && this.field2871 != null) {
            try {
                this.field2871.method228((byte) 45);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)Lda;")
    public final class31 method908(int arg0) {
        return arg0 == -1558882160 ? this.field2872 : null;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILjava/lang/Runnable;I)Lca;")
    public final class22 method909(int arg0, Runnable arg1, int arg2) {
        if (arg0 != -5836) {
            this.field2877 = null;
        }
        return this.method910(0, arg2, arg0 ^ 0xFFFFE936, arg1, 2);
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIILjava/lang/Object;I)Lca;")
    private final class22 method910(int arg0, int arg1, int arg2, Object arg3, int arg4) {
        if (arg2 != 2) {
            this.method912(null, 35, null);
        }
        class22 var6 = new class22();
        var6.field343 = arg1;
        var6.field345 = arg4;
        var6.field347 = arg3;
        synchronized (this) {
            if (this.field2867 == null) {
                this.field2867 = this.field2884 = var6;
            } else {
                this.field2867.field346 = var6;
                this.field2867 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILjava/net/URL;)Lca;")
    public final class22 method911(int arg0, URL arg1) {
        return arg0 == 0 ? this.method910(0, 0, 2, arg1, 4) : null;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Class;)Lca;")
    public final class22 method912(String arg0, int arg1, Class arg2) {
        int var4 = -120 / ((-arg1 - 57) / 40);
        return this.method910(0, 0, 2, new Object[] { arg2, arg0 }, 9);
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILjava/lang/String;II)V")
    private final void method913(int arg0, String arg1, int arg2, int arg3) {
        if (arg2 < 32 || arg2 > 34) {
            arg2 = 32;
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field2881, "/tmp/", "" };
        String[] var6 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
        for (int var7 = arg0; var7 < 2; var7++) {
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
                        if (this.field2871 == null) {
                            try {
                                File var13 = new File(var11, "random.dat");
                                if (var7 == 1 || var13.exists()) {
                                    this.field2871 = new class42(var13, "rw", 25L);
                                }
                            } catch (Exception var21) {
                                this.field2871 = null;
                            }
                        }
                        if (this.field2879 == null) {
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
                                this.field2877 = new class42(var16, "rw", 104857600L);
                                this.field2870 = new class42[arg3];
                                for (int var17 = 0; var17 < arg3; var17++) {
                                    this.field2870[var17] = new class42(new File(var14, "main_file_cache.idx" + var17), "rw", 1048576L);
                                }
                                this.field2866 = new class42(new File(var14, "main_file_cache.idx255"), "rw", 1048576L);
                                this.field2880 = this.field2879 = var14;
                            } catch (Exception var20) {
                                try {
                                    this.field2877.method228((byte) 45);
                                    for (int var18 = 0; var18 < arg3; var18++) {
                                        this.field2870[var18].method228((byte) 45);
                                    }
                                    this.field2866.method228((byte) 45);
                                } catch (Exception var19) {
                                }
                                this.field2877 = this.field2866 = null;
                                this.field2870 = null;
                                this.field2880 = this.field2879 = null;
                            }
                        }
                    } catch (Exception var22) {
                    }
                    if (this.field2871 != null && this.field2879 != null) {
                        return;
                    }
                }
            }
        }
        if (this.field2879 == null) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "([Ljava/lang/Class;BLjava/lang/String;Ljava/lang/Class;)Lca;")
    public final class22 method914(Class[] arg0, byte arg1, String arg2, Class arg3) {
        return arg1 == -5 ? this.method910(0, 0, 2, new Object[] { arg3, arg2, arg0 }, 8) : null;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Ljava/lang/String;II)Lca;")
    public final class22 method915(String arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            field2881 = null;
        }
        return this.method910(0, arg2, arg1 ^ 0x2, arg0, 1);
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(II)Lca;")
    public final class22 method916(int arg0, int arg1) {
        int var3 = 21 / ((arg1 + 40) / 42);
        return this.method910(0, arg0, 2, null, 3);
    }

    @OriginalMember(owner = "client!qd", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class22 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2875) {
                        return;
                    }
                    if (this.field2884 != null) {
                        var2 = this.field2884;
                        this.field2884 = this.field2884.field346;
                        if (this.field2884 == null) {
                            this.field2867 = null;
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
                int var3 = var2.field345;
                if (var3 == 1) {
                    var2.field342 = new Socket(InetAddress.getByName((String) var2.field347), var2.field343);
                } else if (var3 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field347);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field343);
                    var2.field342 = var6;
                } else if (var3 == 4) {
                    var2.field342 = new DataInputStream(((URL) var2.field347).openStream());
                } else if (var3 == 8) {
                    Object[] var4 = (Object[]) var2.field347;
                    var2.field342 = ((Class) var4[0]).getDeclaredMethod((String) var4[1], (Class[]) var4[2]);
                } else if (var3 == 9) {
                    Object[] var5 = (Object[]) var2.field347;
                    var2.field342 = ((Class) var5[0]).getDeclaredField((String) var5[1]);
                } else {
                    throw new Exception();
                }
                var2.field344 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field344 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
    public class149(boolean arg0, Applet arg1, int arg2, String arg3, int arg4) {
        field2883 = "1.1";
        field2878 = "Unknown";
        this.field2873 = arg1;
        try {
            field2878 = System.getProperty("java.vendor");
            field2883 = System.getProperty("java.version");
        } catch (Exception var10) {
        }
        try {
            field2881 = System.getProperty("user.home");
            if (field2881 != null) {
                field2881 = field2881 + "/";
            }
        } catch (Exception var9) {
        }
        if (field2881 == null) {
            field2881 = "~/";
        }
        try {
            this.field2874 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var8) {
        }
        try {
            if (arg1 == null) {
                field2869 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field2869 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var7) {
        }
        try {
            if (arg1 == null) {
                field2868 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field2868 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        if (arg0) {
            this.method913(0, arg3, arg2, arg4);
        }
        this.field2875 = false;
        this.field2876 = new Thread(this);
        this.field2876.setPriority(10);
        this.field2876.setDaemon(true);
        this.field2876.start();
    }
}
