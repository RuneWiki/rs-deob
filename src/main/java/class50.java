import java.applet.Applet;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class50 implements Runnable {

    @OriginalMember(owner = "client!hb", name = "i", descriptor = "Ldf;")
    private class28 field1212 = null;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "Z")
    private boolean field1204 = false;

    @OriginalMember(owner = "client!hb", name = "h", descriptor = "Lnc;")
    public class92 field1211 = null;

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "Ldf;")
    private class28 field1208 = null;

    @OriginalMember(owner = "client!hb", name = "m", descriptor = "Ljava/io/File;")
    private File field1216 = null;

    @OriginalMember(owner = "client!hb", name = "k", descriptor = "Ljava/applet/Applet;")
    public Applet field1214 = null;

    @OriginalMember(owner = "client!hb", name = "l", descriptor = "Lnc;")
    public class92 field1215 = null;

    @OriginalMember(owner = "client!hb", name = "s", descriptor = "I")
    public int field1222 = 0;

    @OriginalMember(owner = "client!hb", name = "r", descriptor = "Ljava/io/File;")
    public File field1221 = null;

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field1205;

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "Ljava/lang/Thread;")
    private Thread field1207;

    @OriginalMember(owner = "client!hb", name = "p", descriptor = "I")
    public static int field1219 = 3;

    @OriginalMember(owner = "client!hb", name = "n", descriptor = "Lgb;")
    private class44 field1217;

    @OriginalMember(owner = "client!hb", name = "f", descriptor = "Ljava/lang/String;")
    private static String field1209;

    @OriginalMember(owner = "client!hb", name = "j", descriptor = "Ljava/lang/String;")
    public static String field1213;

    @OriginalMember(owner = "client!hb", name = "q", descriptor = "Ljava/lang/String;")
    public static String field1220;

    @OriginalMember(owner = "client!hb", name = "g", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field1210;

    @OriginalMember(owner = "client!hb", name = "o", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field1218;

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "[Lnc;")
    public class92[] field1206;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILjava/lang/String;I)Ldf;")
    public final class28 method415(int arg0, String arg1, int arg2) {
        if (arg2 != 8) {
            this.method416(-12, 122, null, 103, (byte) 99);
        }
        return this.method416(arg0, 1, arg1, 0, (byte) 90);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IILjava/lang/Object;IB)Ldf;")
    private final class28 method416(int arg0, int arg1, Object arg2, int arg3, byte arg4) {
        class28 var6 = new class28();
        if (arg4 != 90) {
            return null;
        }
        var6.field690 = arg2;
        var6.field686 = arg1;
        var6.field689 = arg0;
        synchronized (this) {
            if (this.field1208 == null) {
                this.field1208 = this.field1212 = var6;
            } else {
                this.field1208.field687 = var6;
                this.field1208 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V")
    public final void method417(int arg0) {
        synchronized (this) {
            this.field1204 = true;
            if (arg0 >= -117) {
                this.field1214 = null;
            }
            this.notifyAll();
        }
        try {
            this.field1207.join();
        } catch (InterruptedException var7) {
        }
        if (this.field1215 != null) {
            try {
                this.field1215.method759(1);
            } catch (IOException var6) {
            }
        }
        if (this.field1211 != null) {
            try {
                this.field1211.method759(1);
            } catch (IOException var5) {
            }
        }
        if (this.field1206 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field1206.length; var3++) {
            if (this.field1206[var3] != null) {
                try {
                    this.field1206[var3].method759(1);
                } catch (IOException var4) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Ljava/lang/Class;ILjava/lang/String;[Ljava/lang/Class;)Ldf;")
    public final class28 method418(Class arg0, int arg1, String arg2, Class[] arg3) {
        if (arg1 < 102) {
            this.method420(null, true);
        }
        return this.method416(0, 9, new Object[] { arg0, arg2, arg3 }, 0, (byte) 90);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILjava/lang/String;II)V")
    private final void method419(int arg0, String arg1, int arg2, int arg3) {
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", "/tmp/", field1209, "" };
        if (arg2 < 32 || arg2 > 34) {
            arg2 = 32;
        }
        String[] var6 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
        boolean var7 = false;
        if (arg3 != 3) {
            this.method421(-49);
        }
        for (int var8 = 0; var8 < 2; var8++) {
            for (int var9 = 0; var9 < var6.length; var9++) {
                for (int var10 = 0; var10 < var5.length; var10++) {
                    try {
                        String var11 = var5[var10];
                        if (var11.length() > 0 && !(new File(var11)).exists()) {
                            continue;
                        }
                        File var12 = new File(var11 + var6[var9]);
                        if (var8 == 1 && !var12.exists()) {
                            boolean var13 = var12.mkdir();
                            if (!var13) {
                                continue;
                            }
                        }
                        if (!var7) {
                            try {
                                File var14 = new File(var12, "uid.dat");
                                if (var8 == 1 && (!var14.exists() || var14.length() < 4L)) {
                                    int var15 = -1;
                                    Random var16 = new Random();
                                    while (var15 == -1) {
                                        var15 = var16.nextInt();
                                    }
                                    DataOutputStream var17 = new DataOutputStream(new FileOutputStream(var14));
                                    var17.writeInt(var15);
                                    var17.close();
                                }
                                if (var14.exists()) {
                                    var7 = true;
                                    DataInputStream var18 = new DataInputStream(new FileInputStream(var14));
                                    this.field1222 = var18.readInt() + 1;
                                    var18.close();
                                }
                            } catch (Exception var26) {
                            }
                        }
                        if (this.field1216 == null) {
                            try {
                                File var19 = new File(var12, arg1);
                                if (var8 == 1 && !var19.exists()) {
                                    boolean var20 = var19.mkdir();
                                    if (!var20) {
                                        continue;
                                    }
                                }
                                File var21 = new File(var19, "main_file_cache.dat2");
                                if (var8 == 0 && !var21.exists()) {
                                    continue;
                                }
                                this.field1215 = new class92(var21, "rw", 52428800L);
                                this.field1206 = new class92[arg0];
                                for (int var22 = 0; var22 < arg0; var22++) {
                                    this.field1206[var22] = new class92(new File(var19, "main_file_cache.idx" + var22), "rw", 1048576L);
                                }
                                this.field1211 = new class92(new File(var19, "main_file_cache.idx255"), "rw", 1048576L);
                                this.field1221 = this.field1216 = var19;
                            } catch (Exception var25) {
                                try {
                                    this.field1215.method759(1);
                                    for (int var23 = 0; var23 < arg0; var23++) {
                                        this.field1206[var23].method759(1);
                                    }
                                    this.field1211.method759(1);
                                } catch (Exception var24) {
                                }
                                this.field1215 = this.field1211 = null;
                                this.field1206 = null;
                                this.field1221 = this.field1216 = null;
                            }
                        }
                    } catch (Exception var27) {
                    }
                    if (var7 && this.field1216 != null) {
                        return;
                    }
                }
            }
        }
        if (this.field1216 == null) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Ljava/net/URL;Z)Ldf;")
    public final class28 method420(URL arg0, boolean arg1) {
        return arg1 ? null : this.method416(0, 4, arg0, 0, (byte) 90);
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(I)Lgb;")
    public final class44 method421(int arg0) {
        if (arg0 < 65) {
            this.method415(104, null, 51);
        }
        return this.field1217;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(BI)Ldf;")
    public final class28 method422(byte arg0, int arg1) {
        if (arg0 != 9) {
            field1220 = null;
        }
        return this.method416(arg1, 3, null, 0, (byte) 90);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/Class;)Ldf;")
    public final class28 method423(String arg0, byte arg1, Class arg2) {
        if (arg1 != 50) {
            this.method416(126, 69, null, 6, (byte) -20);
        }
        return this.method416(0, 10, new Object[] { arg2, arg0 }, 0, (byte) 90);
    }

    @OriginalMember(owner = "client!hb", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class28 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1204) {
                        return;
                    }
                    if (this.field1212 != null) {
                        var2 = this.field1212;
                        this.field1212 = this.field1212.field687;
                        if (this.field1212 == null) {
                            this.field1208 = null;
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
                int var3 = var2.field686;
                if (var3 == 1) {
                    var2.field685 = new Socket(InetAddress.getByName((String) var2.field690), var2.field689);
                } else if (var3 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field690);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field689);
                    var2.field685 = var6;
                } else if (var3 == 4) {
                    var2.field685 = new DataInputStream(((URL) var2.field690).openStream());
                } else if (var3 == 9) {
                    Object[] var5 = (Object[]) var2.field690;
                    var2.field685 = ((Class) var5[0]).getDeclaredMethod((String) var5[1], (Class[]) var5[2]);
                } else if (var3 == 10) {
                    Object[] var4 = (Object[]) var2.field690;
                    var2.field685 = ((Class) var4[0]).getDeclaredField((String) var4[1]);
                } else {
                    throw new Exception();
                }
                var2.field688 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field688 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(BLjava/lang/Runnable;I)Ldf;")
    public final class28 method424(byte arg0, Runnable arg1, int arg2) {
        if (arg0 < 46) {
            this.run();
        }
        return this.method416(arg2, 2, arg1, 0, (byte) 90);
    }

    @OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
    public class50(boolean arg0, Applet arg1, int arg2, String arg3, int arg4) {
        field1220 = "Unknown";
        field1213 = "1.1";
        this.field1214 = arg1;
        try {
            field1220 = System.getProperty("java.vendor");
            field1213 = System.getProperty("java.version");
        } catch (Exception var10) {
        }
        try {
            field1209 = System.getProperty("user.home");
            if (field1209 != null) {
                field1209 = field1209 + "/";
            }
        } catch (Exception var9) {
        }
        if (field1209 == null) {
            field1209 = "~/";
        }
        try {
            this.field1205 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var8) {
        }
        try {
            if (arg1 == null) {
                field1210 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field1210 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var7) {
        }
        try {
            if (arg1 == null) {
                field1218 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field1218 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        if (arg0) {
            this.method419(arg4, arg3, arg2, 3);
        }
        this.field1204 = false;
        this.field1207 = new Thread(this);
        this.field1207.setPriority(10);
        this.field1207.setDaemon(true);
        this.field1207.start();
    }
}
