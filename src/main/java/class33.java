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

@OriginalClass("client!d")
public class class33 implements Runnable {

    @OriginalMember(owner = "client!d", name = "a", descriptor = "Lnc;")
    private class141 field712 = null;

    @OriginalMember(owner = "client!d", name = "c", descriptor = "Ljava/io/File;")
    public File field714 = null;

    @OriginalMember(owner = "client!d", name = "m", descriptor = "Lwh;")
    public class236 field724 = null;

    @OriginalMember(owner = "client!d", name = "p", descriptor = "Lnc;")
    private class141 field727 = null;

    @OriginalMember(owner = "client!d", name = "l", descriptor = "Z")
    private boolean field723 = false;

    @OriginalMember(owner = "client!d", name = "h", descriptor = "Lwh;")
    public class236 field719 = null;

    @OriginalMember(owner = "client!d", name = "o", descriptor = "Ljava/io/File;")
    private File field726 = null;

    @OriginalMember(owner = "client!d", name = "k", descriptor = "Lwh;")
    public class236 field722 = null;

    @OriginalMember(owner = "client!d", name = "s", descriptor = "Ljava/applet/Applet;")
    public Applet field730 = null;

    @OriginalMember(owner = "client!d", name = "f", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field717;

    @OriginalMember(owner = "client!d", name = "i", descriptor = "Ljava/lang/Thread;")
    private Thread field720;

    @OriginalMember(owner = "client!d", name = "j", descriptor = "I")
    public static int field721 = 3;

    @OriginalMember(owner = "client!d", name = "e", descriptor = "Lpf;")
    private class164 field716;

    @OriginalMember(owner = "client!d", name = "d", descriptor = "Ljava/lang/String;")
    public static String field715;

    @OriginalMember(owner = "client!d", name = "q", descriptor = "Ljava/lang/String;")
    private static String field728;

    @OriginalMember(owner = "client!d", name = "r", descriptor = "Ljava/lang/String;")
    public static String field729;

    @OriginalMember(owner = "client!d", name = "b", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field713;

    @OriginalMember(owner = "client!d", name = "g", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field718;

    @OriginalMember(owner = "client!d", name = "n", descriptor = "[Lwh;")
    public class236[] field725;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IBLjava/lang/String;)Lnc;")
    public final class141 method278(int arg0, byte arg1, String arg2) {
        if (arg1 != 124) {
            field721 = -123;
        }
        return this.method287(0, arg0, 1, arg2, 0);
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Ljava/net/URL;B)Lnc;")
    public final class141 method279(URL arg0, byte arg1) {
        return arg1 == 124 ? this.method287(0, 0, 4, arg0, 0) : null;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(I)Lpf;")
    public final class164 method280(int arg0) {
        if (arg0 != 1) {
            this.field725 = null;
        }
        return this.field716;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Z)V")
    public final void method281(boolean arg0) {
        synchronized (this) {
            this.field723 = arg0;
            this.notifyAll();
        }
        try {
            this.field720.join();
        } catch (InterruptedException var8) {
        }
        if (this.field724 != null) {
            try {
                this.field724.method1536((byte) 70);
            } catch (IOException var7) {
            }
        }
        if (this.field722 != null) {
            try {
                this.field722.method1536((byte) 70);
            } catch (IOException var6) {
            }
        }
        if (this.field725 != null) {
            for (int var3 = 0; var3 < this.field725.length; var3++) {
                if (this.field725[var3] != null) {
                    try {
                        this.field725[var3].method1536((byte) 70);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field719 != null) {
            try {
                this.field719.method1536((byte) 70);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(II)Lnc;")
    public final class141 method282(int arg0, int arg1) {
        if (arg0 != 0) {
            this.method281(false);
        }
        return this.method287(0, arg1, 3, null, 0);
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Ljava/lang/Runnable;II)Lnc;")
    public final class141 method283(Runnable arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            this.method279(null, (byte) 125);
        }
        return this.method287(0, arg1, 2, arg0, arg2);
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(BLjava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Lnc;")
    public final class141 method284(byte arg0, Class arg1, String arg2, Class[] arg3) {
        if (arg0 <= 80) {
            this.method279(null, (byte) 15);
        }
        return this.method287(0, 0, 8, new Object[] { arg1, arg2, arg3 }, 0);
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(ILjava/lang/String;BI)V")
    private final void method285(int arg0, String arg1, byte arg2, int arg3) {
        if (arg3 < 32 || arg3 > 34) {
            arg3 = 32;
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field728, "/tmp/", "" };
        if (arg2 != 38) {
            return;
        }
        String[] var6 = new String[] { ".jagex_cache_" + arg3, ".file_store_" + arg3 };
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
                        if (this.field719 == null) {
                            try {
                                File var13 = new File(var11, "random.dat");
                                if (var7 == 1 || var13.exists()) {
                                    this.field719 = new class236(var13, "rw", 25L);
                                }
                            } catch (Exception var21) {
                                this.field719 = null;
                            }
                        }
                        if (this.field726 == null) {
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
                                this.field724 = new class236(var16, "rw", 104857600L);
                                this.field725 = new class236[arg0];
                                for (int var17 = 0; var17 < arg0; var17++) {
                                    this.field725[var17] = new class236(new File(var14, "main_file_cache.idx" + var17), "rw", 1048576L);
                                }
                                this.field722 = new class236(new File(var14, "main_file_cache.idx255"), "rw", 1048576L);
                                this.field714 = this.field726 = var14;
                            } catch (Exception var20) {
                                try {
                                    this.field724.method1536((byte) 70);
                                    for (int var18 = 0; var18 < arg0; var18++) {
                                        this.field725[var18].method1536((byte) 70);
                                    }
                                    this.field722.method1536((byte) 70);
                                } catch (Exception var19) {
                                }
                                this.field725 = null;
                                this.field724 = this.field722 = null;
                                this.field714 = this.field726 = null;
                            }
                        }
                    } catch (Exception var22) {
                    }
                    if (this.field719 != null && this.field726 != null) {
                        return;
                    }
                }
            }
        }
        if (this.field726 == null) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(ILjava/lang/Class;Ljava/lang/String;)Lnc;")
    public final class141 method286(int arg0, Class arg1, String arg2) {
        if (arg0 != 9) {
            this.method286(-42, null, null);
        }
        return this.method287(0, 0, 9, new Object[] { arg1, arg2 }, 0);
    }

    @OriginalMember(owner = "client!d", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class141 var2;
            synchronized (this) {
                while (true) {
                    if (this.field723) {
                        return;
                    }
                    if (this.field727 != null) {
                        var2 = this.field727;
                        this.field727 = this.field727.field2713;
                        if (this.field727 == null) {
                            this.field712 = null;
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
                int var3 = var2.field2711;
                if (var3 == 1) {
                    var2.field2714 = new Socket(InetAddress.getByName((String) var2.field2715), var2.field2712);
                } else if (var3 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2715);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2712);
                    var2.field2714 = var6;
                } else if (var3 == 4) {
                    var2.field2714 = new DataInputStream(((URL) var2.field2715).openStream());
                } else if (var3 == 8) {
                    Object[] var5 = (Object[]) var2.field2715;
                    var2.field2714 = ((Class) var5[0]).getDeclaredMethod((String) var5[1], (Class[]) var5[2]);
                } else if (var3 == 9) {
                    Object[] var4 = (Object[]) var2.field2715;
                    var2.field2714 = ((Class) var4[0]).getDeclaredField((String) var4[1]);
                } else {
                    throw new Exception();
                }
                var2.field2716 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field2716 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIILjava/lang/Object;I)Lnc;")
    private final class141 method287(int arg0, int arg1, int arg2, Object arg3, int arg4) {
        class141 var6 = new class141();
        var6.field2712 = arg1;
        var6.field2715 = arg3;
        var6.field2711 = arg2;
        synchronized (this) {
            if (this.field712 == null) {
                this.field712 = this.field727 = var6;
            } else {
                this.field712.field2713 = var6;
                this.field712 = var6;
            }
            this.notify();
        }
        if (arg4 != 0) {
            this.field719 = null;
        }
        return var6;
    }

    @OriginalMember(owner = "client!d", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
    public class33(boolean arg0, Applet arg1, int arg2, String arg3, int arg4) {
        field729 = "Unknown";
        field715 = "1.1";
        this.field730 = arg1;
        try {
            field729 = System.getProperty("java.vendor");
            field715 = System.getProperty("java.version");
        } catch (Exception var10) {
        }
        try {
            field728 = System.getProperty("user.home");
            if (field728 != null) {
                field728 = field728 + "/";
            }
        } catch (Exception var9) {
        }
        if (field728 == null) {
            field728 = "~/";
        }
        try {
            this.field717 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var8) {
        }
        try {
            if (arg1 == null) {
                field718 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field718 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var7) {
        }
        try {
            if (arg1 == null) {
                field713 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field713 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        if (arg0) {
            this.method285(arg4, arg3, (byte) 38, arg2);
        }
        this.field723 = false;
        this.field720 = new Thread(this);
        this.field720.setPriority(10);
        this.field720.setDaemon(true);
        this.field720.start();
    }
}
