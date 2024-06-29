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

@OriginalClass("mapview!ca")
public class class6 implements Runnable {

    @OriginalMember(owner = "mapview!ca", name = "e", descriptor = "Lba;")
    public class4 field41 = null;

    @OriginalMember(owner = "mapview!ca", name = "c", descriptor = "Z")
    private boolean field39 = false;

    @OriginalMember(owner = "mapview!ca", name = "m", descriptor = "Ljava/io/File;")
    private File field49 = null;

    @OriginalMember(owner = "mapview!ca", name = "n", descriptor = "Ljava/applet/Applet;")
    public Applet field50 = null;

    @OriginalMember(owner = "mapview!ca", name = "i", descriptor = "Lb;")
    private class3 field45 = null;

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "Lba;")
    public class4 field37 = null;

    @OriginalMember(owner = "mapview!ca", name = "l", descriptor = "Lb;")
    private class3 field48 = null;

    @OriginalMember(owner = "mapview!ca", name = "p", descriptor = "Lba;")
    public class4 field52 = null;

    @OriginalMember(owner = "mapview!ca", name = "q", descriptor = "Ljava/io/File;")
    public File field53 = null;

    @OriginalMember(owner = "mapview!ca", name = "k", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field47;

    @OriginalMember(owner = "mapview!ca", name = "o", descriptor = "Ljava/lang/Thread;")
    private Thread field51;

    @OriginalMember(owner = "mapview!ca", name = "g", descriptor = "I")
    public static int field43 = 3;

    @OriginalMember(owner = "mapview!ca", name = "b", descriptor = "Ljava/lang/String;")
    public static String field38;

    @OriginalMember(owner = "mapview!ca", name = "d", descriptor = "Ljava/lang/String;")
    public static String field40;

    @OriginalMember(owner = "mapview!ca", name = "j", descriptor = "Ljava/lang/String;")
    private static String field46;

    @OriginalMember(owner = "mapview!ca", name = "f", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field42;

    @OriginalMember(owner = "mapview!ca", name = "h", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field44;

    @OriginalMember(owner = "mapview!ca", name = "r", descriptor = "[Lba;")
    public class4[] field54;

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "(BIILjava/lang/String;)V", line = 13)
    private final void method18(byte arg0, int arg1, int arg2, String arg3) {
        if (arg0 != -65) {
            return;
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field46, "/tmp/", "" };
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
                        if (this.field37 == null) {
                            try {
                                File var13 = new File(var11, "random.dat");
                                if (var7 == 1 || var13.exists()) {
                                    this.field37 = new class4(var13, "rw", 25L);
                                }
                            } catch (Exception var25) {
                                this.field37 = null;
                            }
                        }
                        if (this.field49 == null) {
                            try {
                                File var15 = new File(var11, arg3);
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
                                this.field41 = new class4(var17, "rw", 52428800L);
                                this.field54 = new class4[arg1];
                                for (int var18 = 0; var18 < arg1; var18++) {
                                    this.field54[var18] = new class4(new File(var15, "main_file_cache.idx" + var18), "rw", 1048576L);
                                }
                                this.field52 = new class4(new File(var15, "main_file_cache.idx255"), "rw", 1048576L);
                                this.field53 = this.field49 = var15;
                            } catch (Exception var24) {
                                try {
                                    this.field41.method9(1);
                                    for (int var20 = 0; var20 < arg1; var20++) {
                                        this.field54[var20].method9(1);
                                    }
                                    this.field52.method9(1);
                                } catch (Exception var23) {
                                }
                                this.field53 = this.field49 = null;
                                this.field54 = null;
                                this.field41 = this.field52 = null;
                            }
                        }
                    } catch (Exception var26) {
                    }
                    if (this.field37 != null && this.field49 != null) {
                        return;
                    }
                }
            }
        }
        if (this.field49 == null) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "(II)Lb;", line = 182)
    public final class3 method19(int arg0, int arg1) {
        if (arg1 != 1) {
            this.method23(-113, 126, null);
        }
        return this.method20(3, null, 0, arg0, 2643);
    }

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "(ILjava/lang/Object;III)Lb;", line = 196)
    private final class3 method20(int arg0, Object arg1, int arg2, int arg3, int arg4) {
        if (arg4 != 2643) {
            field43 = -99;
        }
        class3 var6 = new class3();
        var6.field14 = arg1;
        var6.field17 = arg3;
        var6.field15 = arg0;
        synchronized (this) {
            if (this.field48 == null) {
                this.field48 = this.field45 = var6;
            } else {
                this.field48.field13 = var6;
                this.field48 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "mapview!ca", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V", line = 484)
    public class6(boolean arg0, Applet arg1, int arg2, String arg3, int arg4) {
        this.field50 = arg1;
        field38 = "1.1";
        field40 = "Unknown";
        try {
            field40 = System.getProperty("java.vendor");
            field38 = System.getProperty("java.version");
        } catch (Exception var15) {
        }
        try {
            field46 = System.getProperty("user.home");
            if (field46 != null) {
                field46 = field46 + "/";
            }
        } catch (Exception var14) {
        }
        if (field46 == null) {
            field46 = "~/";
        }
        try {
            this.field47 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var13) {
        }
        try {
            if (arg1 == null) {
                field44 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field44 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var12) {
        }
        try {
            if (arg1 == null) {
                field42 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field42 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var11) {
        }
        if (arg0) {
            this.method18((byte) -65, arg4, arg2, arg3);
        }
        this.field39 = false;
        this.field51 = new Thread(this);
        this.field51.setPriority(10);
        this.field51.setDaemon(true);
        this.field51.start();
    }

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "(Ljava/lang/Class;ILjava/lang/String;[Ljava/lang/Class;)Lb;", line = 230)
    public final class3 method21(Class arg0, int arg1, String arg2, Class[] arg3) {
        if (arg1 != 4559) {
            this.method21(null, -40, null, null);
        }
        return this.method20(8, new Object[] { arg0, arg2, arg3 }, 0, 0, 2643);
    }

    @OriginalMember(owner = "mapview!ca", name = "run", descriptor = "()V", line = 243)
    public final void run() {
        while (true) {
            class3 var2;
            synchronized (this) {
                while (true) {
                    if (this.field39) {
                        return;
                    }
                    if (this.field45 != null) {
                        var2 = this.field45;
                        this.field45 = this.field45.field13;
                        if (this.field45 == null) {
                            this.field48 = null;
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
                int var5 = var2.field15;
                if (var5 == 1) {
                    var2.field16 = new Socket(InetAddress.getByName((String) var2.field14), var2.field17);
                } else if (var5 == 2) {
                    Thread var8 = new Thread((Runnable) var2.field14);
                    var8.setDaemon(true);
                    var8.start();
                    var8.setPriority(var2.field17);
                    var2.field16 = var8;
                } else if (var5 == 4) {
                    var2.field16 = new DataInputStream(((URL) var2.field14).openStream());
                } else if (var5 == 8) {
                    Object[] var7 = (Object[]) var2.field14;
                    var2.field16 = ((Class) var7[0]).getDeclaredMethod((String) var7[1], (Class[]) var7[2]);
                } else if (var5 == 9) {
                    Object[] var6 = (Object[]) var2.field14;
                    var2.field16 = ((Class) var6[0]).getDeclaredField((String) var6[1]);
                } else {
                    throw new Exception();
                }
                var2.field18 = 1;
            } catch (ThreadDeath var11) {
                throw var11;
            } catch (Throwable var12) {
                var2.field18 = 2;
            }
        }
    }

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "(ILjava/lang/String;B)Lb;", line = 337)
    public final class3 method22(int arg0, String arg1, byte arg2) {
        if (arg2 != -117) {
            field46 = null;
        }
        return this.method20(1, arg1, 0, arg0, 2643);
    }

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "(IILjava/lang/Runnable;)Lb;", line = 367)
    public final class3 method23(int arg0, int arg1, Runnable arg2) {
        int var4 = 28 % ((29 - arg0) / 57);
        return this.method20(2, arg2, 0, arg1, 2643);
    }

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;B)Lb;", line = 379)
    public final class3 method24(Class arg0, String arg1, byte arg2) {
        if (arg2 != -70) {
            this.method23(-29, 109, null);
        }
        return this.method20(9, new Object[] { arg0, arg1 }, 0, 0, 2643);
    }

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "(BLjava/net/URL;)Lb;", line = 390)
    public final class3 method25(byte arg0, URL arg1) {
        int var3 = -80 % ((arg0 - 10) / 58);
        return this.method20(4, arg1, 0, 0, 2643);
    }

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "(B)V", line = 409)
    public final void method26(byte arg0) {
        if (arg0 < 66) {
            this.method18((byte) -114, 25, -108, null);
        }
        synchronized (this) {
            this.field39 = true;
            this.notifyAll();
        }
        try {
            this.field51.join();
        } catch (InterruptedException var14) {
        }
        if (this.field41 != null) {
            try {
                this.field41.method9(1);
            } catch (IOException var13) {
            }
        }
        if (this.field52 != null) {
            try {
                this.field52.method9(1);
            } catch (IOException var12) {
            }
        }
        if (this.field54 != null) {
            for (int var7 = 0; var7 < this.field54.length; var7++) {
                if (this.field54[var7] != null) {
                    try {
                        this.field54[var7].method9(1);
                    } catch (IOException var11) {
                    }
                }
            }
        }
        if (this.field37 != null) {
            try {
                this.field37.method9(1);
            } catch (IOException var10) {
            }
        }
    }
}
