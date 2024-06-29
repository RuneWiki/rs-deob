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

@OriginalClass("mapview!h")
public class class14 implements Runnable {

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "Ljava/io/File;")
    public File field134 = null;

    @OriginalMember(owner = "mapview!h", name = "k", descriptor = "Ljava/io/File;")
    private File field144 = null;

    @OriginalMember(owner = "mapview!h", name = "m", descriptor = "Z")
    private boolean field146 = false;

    @OriginalMember(owner = "mapview!h", name = "l", descriptor = "Lia;")
    public class17 field145 = null;

    @OriginalMember(owner = "mapview!h", name = "b", descriptor = "Lia;")
    public class17 field135 = null;

    @OriginalMember(owner = "mapview!h", name = "i", descriptor = "Ljava/applet/Applet;")
    public Applet field142 = null;

    @OriginalMember(owner = "mapview!h", name = "g", descriptor = "Lda;")
    private class7 field140 = null;

    @OriginalMember(owner = "mapview!h", name = "p", descriptor = "Lia;")
    public class17 field149 = null;

    @OriginalMember(owner = "mapview!h", name = "q", descriptor = "Lda;")
    private class7 field150 = null;

    @OriginalMember(owner = "mapview!h", name = "n", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field147;

    @OriginalMember(owner = "mapview!h", name = "j", descriptor = "Ljava/lang/Thread;")
    private Thread field143;

    @OriginalMember(owner = "mapview!h", name = "d", descriptor = "I")
    public static int field137 = 3;

    @OriginalMember(owner = "mapview!h", name = "e", descriptor = "Ljava/lang/String;")
    public static String field138;

    @OriginalMember(owner = "mapview!h", name = "h", descriptor = "Ljava/lang/String;")
    public static String field141;

    @OriginalMember(owner = "mapview!h", name = "o", descriptor = "Ljava/lang/String;")
    private static String field148;

    @OriginalMember(owner = "mapview!h", name = "c", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field136;

    @OriginalMember(owner = "mapview!h", name = "f", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field139;

    @OriginalMember(owner = "mapview!h", name = "r", descriptor = "[Lia;")
    public class17[] field151;

    @OriginalMember(owner = "mapview!h", name = "run", descriptor = "()V", line = 18)
    public final void run() {
        while (true) {
            class7 var2;
            synchronized (this) {
                while (true) {
                    if (this.field146) {
                        return;
                    }
                    if (this.field140 != null) {
                        var2 = this.field140;
                        this.field140 = this.field140.field71;
                        if (this.field140 == null) {
                            this.field150 = null;
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
                int var5 = var2.field72;
                if (var5 == 1) {
                    var2.field75 = new Socket(InetAddress.getByName((String) var2.field76), var2.field73);
                } else if (var5 == 2) {
                    Thread var8 = new Thread((Runnable) var2.field76);
                    var8.setDaemon(true);
                    var8.start();
                    var8.setPriority(var2.field73);
                    var2.field75 = var8;
                } else if (var5 == 4) {
                    var2.field75 = new DataInputStream(((URL) var2.field76).openStream());
                } else if (var5 == 8) {
                    Object[] var6 = (Object[]) var2.field76;
                    var2.field75 = ((Class) var6[0]).getDeclaredMethod((String) var6[1], (Class[]) var6[2]);
                } else if (var5 == 9) {
                    Object[] var7 = (Object[]) var2.field76;
                    var2.field75 = ((Class) var7[0]).getDeclaredField((String) var7[1]);
                } else {
                    throw new Exception();
                }
                var2.field74 = 1;
            } catch (ThreadDeath var11) {
                throw var11;
            } catch (Throwable var12) {
                var2.field74 = 2;
            }
        }
    }

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "([Ljava/lang/Class;Ljava/lang/String;ILjava/lang/Class;)Lda;", line = 109)
    public final class7 method77(Class[] arg0, String arg1, int arg2, Class arg3) {
        if (arg2 != 17391) {
            field138 = null;
        }
        return this.method84((byte) 62, 8, 0, 0, new Object[] { arg3, arg1, arg0 });
    }

    @OriginalMember(owner = "mapview!h", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V", line = 482)
    public class14(boolean arg0, Applet arg1, int arg2, String arg3, int arg4) {
        field141 = "Unknown";
        field138 = "1.1";
        this.field142 = arg1;
        try {
            field141 = System.getProperty("java.vendor");
            field138 = System.getProperty("java.version");
        } catch (Exception var15) {
        }
        try {
            field148 = System.getProperty("user.home");
            if (field148 != null) {
                field148 = field148 + "/";
            }
        } catch (Exception var14) {
        }
        if (field148 == null) {
            field148 = "~/";
        }
        try {
            this.field147 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var13) {
        }
        try {
            if (arg1 == null) {
                field139 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field139 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var12) {
        }
        try {
            if (arg1 == null) {
                field136 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field136 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var11) {
        }
        if (arg0) {
            this.method78(arg3, arg4, 2, arg2);
        }
        this.field146 = false;
        this.field143 = new Thread(this);
        this.field143.setPriority(10);
        this.field143.setDaemon(true);
        this.field143.start();
    }

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "(Ljava/lang/String;III)V", line = 136)
    private final void method78(String arg0, int arg1, int arg2, int arg3) {
        if (arg3 < 32 || arg3 > 34) {
            arg3 = 32;
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field148, "/tmp/", "" };
        String[] var6 = new String[] { ".jagex_cache_" + arg3, ".file_store_" + arg3 };
        if (arg2 != 2) {
            this.method77(null, null, 16, null);
        }
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
                        if (this.field145 == null) {
                            try {
                                File var13 = new File(var11, "random.dat");
                                if (var7 == 1 || var13.exists()) {
                                    this.field145 = new class17(var13, "rw", 25L);
                                }
                            } catch (Exception var25) {
                                this.field145 = null;
                            }
                        }
                        if (this.field144 == null) {
                            try {
                                File var15 = new File(var11, arg0);
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
                                this.field149 = new class17(var17, "rw", 104857600L);
                                this.field151 = new class17[arg1];
                                for (int var18 = 0; var18 < arg1; var18++) {
                                    this.field151[var18] = new class17(new File(var15, "main_file_cache.idx" + var18), "rw", 1048576L);
                                }
                                this.field135 = new class17(new File(var15, "main_file_cache.idx255"), "rw", 1048576L);
                                this.field134 = this.field144 = var15;
                            } catch (Exception var24) {
                                try {
                                    this.field149.method90((byte) -108);
                                    for (int var20 = 0; var20 < arg1; var20++) {
                                        this.field151[var20].method90((byte) -122);
                                    }
                                    this.field135.method90((byte) -125);
                                } catch (Exception var23) {
                                }
                                this.field134 = this.field144 = null;
                                this.field149 = this.field135 = null;
                                this.field151 = null;
                            }
                        }
                    } catch (Exception var26) {
                    }
                    if (this.field145 != null && this.field144 != null) {
                        return;
                    }
                }
            }
        }
        if (this.field144 == null) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "(ILjava/net/URL;)Lda;", line = 310)
    public final class7 method79(int arg0, URL arg1) {
        if (arg0 >= -85) {
            field138 = null;
        }
        return this.method84((byte) -127, 4, 0, 0, arg1);
    }

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "(Ljava/lang/Class;ILjava/lang/String;)Lda;", line = 323)
    public final class7 method80(Class arg0, int arg1, String arg2) {
        if (arg1 != -12743) {
            this.field140 = null;
        }
        return this.method84((byte) 116, 9, 0, 0, new Object[] { arg0, arg2 });
    }

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "(BILjava/lang/Runnable;)Lda;", line = 333)
    public final class7 method81(byte arg0, int arg1, Runnable arg2) {
        if (arg0 != 115) {
            this.method79(121, null);
        }
        return this.method84((byte) -118, 2, 0, arg1, arg2);
    }

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "(II)Lda;", line = 344)
    public final class7 method82(int arg0, int arg1) {
        return arg0 == 21601 ? this.method84((byte) 65, 3, 0, arg1, null) : (class7) null;
    }

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "(I)V", line = 359)
    public final void method83(int arg0) {
        synchronized (this) {
            this.field146 = true;
            this.notifyAll();
        }
        try {
            if (arg0 != 7555) {
                this.method80(null, -83, null);
            }
            this.field143.join();
        } catch (InterruptedException var14) {
        }
        if (this.field149 != null) {
            try {
                this.field149.method90((byte) -74);
            } catch (IOException var13) {
            }
        }
        if (this.field135 != null) {
            try {
                this.field135.method90((byte) -66);
            } catch (IOException var12) {
            }
        }
        if (this.field151 != null) {
            for (int var7 = 0; var7 < this.field151.length; var7++) {
                if (this.field151[var7] != null) {
                    try {
                        this.field151[var7].method90((byte) -90);
                    } catch (IOException var11) {
                    }
                }
            }
        }
        if (this.field145 != null) {
            try {
                this.field145.method90((byte) -103);
            } catch (IOException var10) {
            }
        }
    }

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "(BIIILjava/lang/Object;)Lda;", line = 432)
    private final class7 method84(byte arg0, int arg1, int arg2, int arg3, Object arg4) {
        int var6 = 104 / ((-arg0 - 58) / 60);
        class7 var7 = new class7();
        var7.field72 = arg1;
        var7.field73 = arg3;
        var7.field76 = arg4;
        synchronized (this) {
            if (this.field150 == null) {
                this.field150 = this.field140 = var7;
            } else {
                this.field150.field71 = var7;
                this.field150 = var7;
            }
            this.notify();
            return var7;
        }
    }

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "(ILjava/lang/String;I)Lda;", line = 466)
    public final class7 method85(int arg0, String arg1, int arg2) {
        if (arg0 != 2) {
            this.field150 = null;
        }
        return this.method84((byte) -122, 1, 0, arg2, arg1);
    }
}
