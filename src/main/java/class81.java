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

@OriginalClass("client!ih")
public class class81 implements Runnable {

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "Ljava/io/File;")
    public File field1408 = null;

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "Lca;")
    private class22 field1411 = null;

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "Lu;")
    public class181 field1413 = null;

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "Ljava/applet/Applet;")
    public Applet field1410 = null;

    @OriginalMember(owner = "client!ih", name = "g", descriptor = "Ljava/io/File;")
    private File field1414 = null;

    @OriginalMember(owner = "client!ih", name = "h", descriptor = "Lu;")
    public class181 field1415 = null;

    @OriginalMember(owner = "client!ih", name = "n", descriptor = "Z")
    private boolean field1421 = false;

    @OriginalMember(owner = "client!ih", name = "j", descriptor = "Lu;")
    public class181 field1417 = null;

    @OriginalMember(owner = "client!ih", name = "r", descriptor = "Lca;")
    private class22 field1425 = null;

    @OriginalMember(owner = "client!ih", name = "l", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field1419;

    @OriginalMember(owner = "client!ih", name = "i", descriptor = "Ljava/lang/Thread;")
    private Thread field1416;

    @OriginalMember(owner = "client!ih", name = "k", descriptor = "I")
    public static int field1418 = 3;

    @OriginalMember(owner = "client!ih", name = "p", descriptor = "Lma;")
    private class110 field1423;

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "Ljava/lang/String;")
    public static String field1409;

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "Ljava/lang/String;")
    public static String field1412;

    @OriginalMember(owner = "client!ih", name = "q", descriptor = "Ljava/lang/String;")
    private static String field1424;

    @OriginalMember(owner = "client!ih", name = "o", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field1422;

    @OriginalMember(owner = "client!ih", name = "s", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field1426;

    @OriginalMember(owner = "client!ih", name = "m", descriptor = "[Lu;")
    public class181[] field1420;

    @OriginalMember(owner = "client!ih", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class22 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1421) {
                        return;
                    }
                    if (this.field1411 != null) {
                        var2 = this.field1411;
                        this.field1411 = this.field1411.field354;
                        if (this.field1411 == null) {
                            this.field1425 = null;
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
                int var3 = var2.field351;
                if (var3 == 1) {
                    var2.field353 = new Socket(InetAddress.getByName((String) var2.field349), var2.field350);
                } else if (var3 == 2) {
                    Thread var4 = new Thread((Runnable) var2.field349);
                    var4.setDaemon(true);
                    var4.start();
                    var4.setPriority(var2.field350);
                    var2.field353 = var4;
                } else if (var3 == 4) {
                    var2.field353 = new DataInputStream(((URL) var2.field349).openStream());
                } else if (var3 == 8) {
                    Object[] var6 = (Object[]) var2.field349;
                    var2.field353 = ((Class) var6[0]).getDeclaredMethod((String) var6[1], (Class[]) var6[2]);
                } else if (var3 == 9) {
                    Object[] var5 = (Object[]) var2.field349;
                    var2.field353 = ((Class) var5[0]).getDeclaredField((String) var5[1]);
                } else {
                    throw new Exception();
                }
                var2.field352 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field352 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(ILjava/lang/Runnable;I)Lca;")
    public final class22 method494(int arg0, Runnable arg1, int arg2) {
        if (arg2 < 107) {
            this.method498(16);
        }
        return this.method502(2, arg1, arg0, 0, (byte) -17);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Ljava/lang/String;BII)V")
    private final void method495(String arg0, byte arg1, int arg2, int arg3) {
        if (arg2 < 32 || arg2 > 34) {
            arg2 = 32;
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field1424, "/tmp/", "" };
        int var6 = -57 / ((arg1 + 21) / 49);
        String[] var7 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
        for (int var8 = 0; var8 < 2; var8++) {
            for (int var9 = 0; var9 < var7.length; var9++) {
                for (int var10 = 0; var10 < var5.length; var10++) {
                    try {
                        String var11 = var5[var10];
                        if (var11.length() > 0 && !(new File(var11)).exists()) {
                            continue;
                        }
                        File var12 = new File(var11 + var7[var9]);
                        if (var8 == 1 && !var12.exists()) {
                            boolean var13 = var12.mkdir();
                            if (!var13) {
                                continue;
                            }
                        }
                        if (this.field1413 == null) {
                            try {
                                File var14 = new File(var12, "random.dat");
                                if (var8 == 1 || var14.exists()) {
                                    this.field1413 = new class181(var14, "rw", 25L);
                                }
                            } catch (Exception var22) {
                                this.field1413 = null;
                            }
                        }
                        if (this.field1414 == null) {
                            try {
                                File var15 = new File(var12, arg0);
                                if (var8 == 1 && !var15.exists()) {
                                    boolean var16 = var15.mkdir();
                                    if (!var16) {
                                        continue;
                                    }
                                }
                                File var17 = new File(var15, "main_file_cache.dat2");
                                if (var8 == 0 && !var17.exists()) {
                                    continue;
                                }
                                this.field1417 = new class181(var17, "rw", 104857600L);
                                this.field1420 = new class181[arg3];
                                for (int var18 = 0; var18 < arg3; var18++) {
                                    this.field1420[var18] = new class181(new File(var15, "main_file_cache.idx" + var18), "rw", 1048576L);
                                }
                                this.field1415 = new class181(new File(var15, "main_file_cache.idx255"), "rw", 1048576L);
                                this.field1408 = this.field1414 = var15;
                            } catch (Exception var21) {
                                try {
                                    this.field1417.method1177(true);
                                    for (int var19 = 0; var19 < arg3; var19++) {
                                        this.field1420[var19].method1177(true);
                                    }
                                    this.field1415.method1177(true);
                                } catch (Exception var20) {
                                }
                                this.field1417 = this.field1415 = null;
                                this.field1420 = null;
                                this.field1408 = this.field1414 = null;
                            }
                        }
                    } catch (Exception var23) {
                    }
                    if (this.field1413 != null && this.field1414 != null) {
                        return;
                    }
                }
            }
        }
        if (this.field1414 == null) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Class;)Lca;")
    public final class22 method496(int arg0, String arg1, Class arg2) {
        return arg0 == -9037 ? this.method502(9, new Object[] { arg2, arg1 }, 0, 0, (byte) -17) : null;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)V")
    public final void method497(int arg0) {
        synchronized (this) {
            if (arg0 != 6486) {
                field1422 = null;
            }
            this.field1421 = true;
            this.notifyAll();
        }
        try {
            this.field1416.join();
        } catch (InterruptedException var8) {
        }
        if (this.field1417 != null) {
            try {
                this.field1417.method1177(true);
            } catch (IOException var7) {
            }
        }
        if (this.field1415 != null) {
            try {
                this.field1415.method1177(true);
            } catch (IOException var6) {
            }
        }
        if (this.field1420 != null) {
            for (int var3 = 0; var3 < this.field1420.length; var3++) {
                if (this.field1420[var3] != null) {
                    try {
                        this.field1420[var3].method1177(true);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field1413 != null) {
            try {
                this.field1413.method1177(true);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(I)Lma;")
    public final class110 method498(int arg0) {
        if (arg0 != 32) {
            field1424 = null;
        }
        return this.field1423;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(ILjava/lang/String;I)Lca;")
    public final class22 method499(int arg0, String arg1, int arg2) {
        int var4 = 66 % ((arg2 - 78) / 32);
        return this.method502(1, arg1, arg0, 0, (byte) -17);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Ljava/lang/Class;BLjava/lang/String;[Ljava/lang/Class;)Lca;")
    public final class22 method500(Class arg0, byte arg1, String arg2, Class[] arg3) {
        if (arg1 < 6) {
            this.field1408 = null;
        }
        return this.method502(8, new Object[] { arg0, arg2, arg3 }, 0, 0, (byte) -17);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(ILjava/net/URL;)Lca;")
    public final class22 method501(int arg0, URL arg1) {
        return arg0 == 0 ? this.method502(4, arg1, 0, 0, (byte) -17) : null;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(ILjava/lang/Object;IIB)Lca;")
    private final class22 method502(int arg0, Object arg1, int arg2, int arg3, byte arg4) {
        class22 var6 = new class22();
        var6.field349 = arg1;
        var6.field351 = arg0;
        if (arg4 != -17) {
            this.method501(-112, null);
        }
        var6.field350 = arg2;
        synchronized (this) {
            if (this.field1425 == null) {
                this.field1425 = this.field1411 = var6;
            } else {
                this.field1425.field354 = var6;
                this.field1425 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(II)Lca;")
    public final class22 method503(int arg0, int arg1) {
        int var3 = 92 % ((71 - arg0) / 40);
        return this.method502(3, null, arg1, 0, (byte) -17);
    }

    @OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
    public class81(boolean arg0, Applet arg1, int arg2, String arg3, int arg4) {
        this.field1410 = arg1;
        field1409 = "1.1";
        field1412 = "Unknown";
        try {
            field1412 = System.getProperty("java.vendor");
            field1409 = System.getProperty("java.version");
        } catch (Exception var10) {
        }
        try {
            field1424 = System.getProperty("user.home");
            if (field1424 != null) {
                field1424 = field1424 + "/";
            }
        } catch (Exception var9) {
        }
        if (field1424 == null) {
            field1424 = "~/";
        }
        try {
            this.field1419 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var8) {
        }
        try {
            if (arg1 == null) {
                field1426 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field1426 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var7) {
        }
        try {
            if (arg1 == null) {
                field1422 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field1422 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        if (arg0) {
            this.method495(arg3, (byte) 82, arg2, arg4);
        }
        this.field1421 = false;
        this.field1416 = new Thread(this);
        this.field1416.setPriority(10);
        this.field1416.setDaemon(true);
        this.field1416.start();
    }
}
