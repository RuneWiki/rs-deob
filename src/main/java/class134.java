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

@OriginalClass("client!mc")
public class class134 implements Runnable {

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "Lkg;")
    public class116 field2412 = null;

    @OriginalMember(owner = "client!mc", name = "i", descriptor = "Lkg;")
    public class116 field2415 = null;

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "Z")
    private boolean field2414 = false;

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "Ljava/io/File;")
    public File field2410 = null;

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "Lkg;")
    public class116 field2408 = null;

    @OriginalMember(owner = "client!mc", name = "q", descriptor = "Ljava/applet/Applet;")
    public Applet field2423 = null;

    @OriginalMember(owner = "client!mc", name = "m", descriptor = "Ljava/io/File;")
    private File field2419 = null;

    @OriginalMember(owner = "client!mc", name = "s", descriptor = "Lfi;")
    private class65 field2425 = null;

    @OriginalMember(owner = "client!mc", name = "r", descriptor = "Lfi;")
    private class65 field2424 = null;

    @OriginalMember(owner = "client!mc", name = "k", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field2417;

    @OriginalMember(owner = "client!mc", name = "p", descriptor = "Ljava/lang/Thread;")
    private Thread field2422;

    @OriginalMember(owner = "client!mc", name = "o", descriptor = "I")
    public static int field2421 = 3;

    @OriginalMember(owner = "client!mc", name = "l", descriptor = "Lp;")
    private class164 field2418;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "Ljava/lang/String;")
    public static String field2407;

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "Ljava/lang/String;")
    public static String field2409;

    @OriginalMember(owner = "client!mc", name = "n", descriptor = "Ljava/lang/String;")
    private static String field2420;

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field2411;

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field2413;

    @OriginalMember(owner = "client!mc", name = "j", descriptor = "[Lkg;")
    public class116[] field2416;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Ljava/lang/Object;IBII)Lfi;")
    private final class65 method889(Object arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg2 >= -22) {
            this.method891(null, null, (byte) -65);
        }
        class65 var6 = new class65();
        var6.field1264 = arg4;
        var6.field1260 = arg0;
        var6.field1263 = arg1;
        synchronized (this) {
            if (this.field2425 == null) {
                this.field2425 = this.field2424 = var6;
            } else {
                this.field2425.field1261 = var6;
                this.field2425 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!mc", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class65 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2414) {
                        return;
                    }
                    if (this.field2424 != null) {
                        var2 = this.field2424;
                        this.field2424 = this.field2424.field1261;
                        if (this.field2424 == null) {
                            this.field2425 = null;
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
                int var3 = var2.field1264;
                if (var3 == 1) {
                    var2.field1259 = new Socket(InetAddress.getByName((String) var2.field1260), var2.field1263);
                } else if (var3 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field1260);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field1263);
                    var2.field1259 = var6;
                } else if (var3 == 4) {
                    var2.field1259 = new DataInputStream(((URL) var2.field1260).openStream());
                } else if (var3 == 8) {
                    Object[] var5 = (Object[]) var2.field1260;
                    var2.field1259 = ((Class) var5[0]).getDeclaredMethod((String) var5[1], (Class[]) var5[2]);
                } else if (var3 == 9) {
                    Object[] var4 = (Object[]) var2.field1260;
                    var2.field1259 = ((Class) var4[0]).getDeclaredField((String) var4[1]);
                } else {
                    throw new Exception();
                }
                var2.field1262 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field1262 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(BILjava/lang/Runnable;)Lfi;")
    public final class65 method890(byte arg0, int arg1, Runnable arg2) {
        int var4 = -47 % ((arg0 + 28) / 50);
        return this.method889(arg2, arg1, (byte) -88, 0, 2);
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;B)Lfi;")
    public final class65 method891(Class arg0, String arg1, byte arg2) {
        int var4 = 80 / ((arg2 + 68) / 32);
        return this.method889(new Object[] { arg0, arg1 }, 0, (byte) -43, 0, 9);
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Ljava/lang/String;III)V")
    private final void method892(String arg0, int arg1, int arg2, int arg3) {
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field2420, "/tmp/", "" };
        if (arg2 < 32 || arg2 > 34) {
            arg2 = 32;
        }
        if (arg3 != -2) {
            return;
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
                        if (this.field2408 == null) {
                            try {
                                File var13 = new File(var11, "random.dat");
                                if (var7 == 1 || var13.exists()) {
                                    this.field2408 = new class116(var13, "rw", 25L);
                                }
                            } catch (Exception var21) {
                                this.field2408 = null;
                            }
                        }
                        if (this.field2419 == null) {
                            try {
                                File var14 = new File(var11, arg0);
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
                                this.field2412 = new class116(var16, "rw", 104857600L);
                                this.field2416 = new class116[arg1];
                                for (int var17 = 0; var17 < arg1; var17++) {
                                    this.field2416[var17] = new class116(new File(var14, "main_file_cache.idx" + var17), "rw", 1048576L);
                                }
                                this.field2415 = new class116(new File(var14, "main_file_cache.idx255"), "rw", 1048576L);
                                this.field2410 = this.field2419 = var14;
                            } catch (Exception var20) {
                                try {
                                    this.field2412.method771(true);
                                    for (int var18 = 0; var18 < arg1; var18++) {
                                        this.field2416[var18].method771(true);
                                    }
                                    this.field2415.method771(true);
                                } catch (Exception var19) {
                                }
                                this.field2412 = this.field2415 = null;
                                this.field2416 = null;
                                this.field2410 = this.field2419 = null;
                            }
                        }
                    } catch (Exception var22) {
                    }
                    if (this.field2408 != null && this.field2419 != null) {
                        return;
                    }
                }
            }
        }
        if (this.field2419 == null) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(BI)Lfi;")
    public final class65 method893(byte arg0, int arg1) {
        return arg0 < 43 ? null : this.method889(null, arg1, (byte) -103, 0, 3);
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(BILjava/lang/String;)Lfi;")
    public final class65 method894(byte arg0, int arg1, String arg2) {
        if (arg0 != -84) {
            this.method895(null, null, (byte) 57, null);
        }
        return this.method889(arg2, arg1, (byte) -125, 0, 1);
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "([Ljava/lang/Class;Ljava/lang/Class;BLjava/lang/String;)Lfi;")
    public final class65 method895(Class[] arg0, Class arg1, byte arg2, String arg3) {
        if (arg2 > -77) {
            this.method892(null, -12, 34, 39);
        }
        return this.method889(new Object[] { arg1, arg3, arg0 }, 0, (byte) -111, 0, 8);
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)Lp;")
    public final class164 method896(int arg0) {
        int var2 = -7 / ((arg0 + 57) / 53);
        return this.field2418;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ILjava/net/URL;)Lfi;")
    public final class65 method897(int arg0, URL arg1) {
        if (arg0 != 0) {
            this.method895(null, null, (byte) -112, null);
        }
        return this.method889(arg1, 0, (byte) -127, 0, 4);
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(I)V")
    public final void method898(int arg0) {
        synchronized (this) {
            this.field2414 = true;
            this.notifyAll();
        }
        try {
            this.field2422.join();
        } catch (InterruptedException var8) {
        }
        if (this.field2412 != null) {
            try {
                this.field2412.method771(true);
            } catch (IOException var7) {
            }
        }
        if (arg0 != -13003) {
            return;
        }
        if (this.field2415 != null) {
            try {
                this.field2415.method771(true);
            } catch (IOException var6) {
            }
        }
        if (this.field2416 != null) {
            for (int var3 = 0; var3 < this.field2416.length; var3++) {
                if (this.field2416[var3] != null) {
                    try {
                        this.field2416[var3].method771(true);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field2408 != null) {
            try {
                this.field2408.method771(true);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
    public class134(boolean arg0, Applet arg1, int arg2, String arg3, int arg4) {
        this.field2423 = arg1;
        field2409 = "1.1";
        field2407 = "Unknown";
        try {
            field2407 = System.getProperty("java.vendor");
            field2409 = System.getProperty("java.version");
        } catch (Exception var10) {
        }
        try {
            field2420 = System.getProperty("user.home");
            if (field2420 != null) {
                field2420 = field2420 + "/";
            }
        } catch (Exception var9) {
        }
        if (field2420 == null) {
            field2420 = "~/";
        }
        try {
            this.field2417 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var8) {
        }
        try {
            if (arg1 == null) {
                field2411 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field2411 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var7) {
        }
        try {
            if (arg1 == null) {
                field2413 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field2413 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        if (arg0) {
            this.method892(arg3, arg4, arg2, -2);
        }
        this.field2414 = false;
        this.field2422 = new Thread(this);
        this.field2422.setPriority(10);
        this.field2422.setDaemon(true);
        this.field2422.start();
    }
}
