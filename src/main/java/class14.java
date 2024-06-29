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

@OriginalClass("mapview!i")
public class class14 implements Runnable {

    @OriginalMember(owner = "mapview!i", name = "g", descriptor = "Lta;")
    public class37 field128 = null;

    @OriginalMember(owner = "mapview!i", name = "h", descriptor = "Lta;")
    public class37 field129 = null;

    @OriginalMember(owner = "mapview!i", name = "d", descriptor = "Z")
    private boolean field125 = false;

    @OriginalMember(owner = "mapview!i", name = "j", descriptor = "Ljava/applet/Applet;")
    public Applet field131 = null;

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "Ln;")
    private class24 field122 = null;

    @OriginalMember(owner = "mapview!i", name = "m", descriptor = "Ljava/io/File;")
    public File field134 = null;

    @OriginalMember(owner = "mapview!i", name = "c", descriptor = "Lta;")
    public class37 field124 = null;

    @OriginalMember(owner = "mapview!i", name = "i", descriptor = "Ln;")
    private class24 field130 = null;

    @OriginalMember(owner = "mapview!i", name = "p", descriptor = "Ljava/io/File;")
    private File field137 = null;

    @OriginalMember(owner = "mapview!i", name = "n", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field135;

    @OriginalMember(owner = "mapview!i", name = "f", descriptor = "Ljava/lang/Thread;")
    private Thread field127;

    @OriginalMember(owner = "mapview!i", name = "l", descriptor = "I")
    public static int field133 = 3;

    @OriginalMember(owner = "mapview!i", name = "o", descriptor = "Ljava/lang/String;")
    private static String field136;

    @OriginalMember(owner = "mapview!i", name = "q", descriptor = "Ljava/lang/String;")
    public static String field138;

    @OriginalMember(owner = "mapview!i", name = "r", descriptor = "Ljava/lang/String;")
    public static String field139;

    @OriginalMember(owner = "mapview!i", name = "b", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field123;

    @OriginalMember(owner = "mapview!i", name = "e", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field126;

    @OriginalMember(owner = "mapview!i", name = "k", descriptor = "[Lta;")
    public class37[] field132;

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "(IILjava/lang/String;B)V", line = 11)
    private final void method90(int arg0, int arg1, String arg2, byte arg3) {
        if (arg3 >= -47) {
            this.method97(null, -5, null, null);
        }
        if (arg0 < 32 || arg0 > 34) {
            arg0 = 32;
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field136, "/tmp/", "" };
        String[] var6 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
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
                        if (this.field128 == null) {
                            try {
                                File var13 = new File(var11, "random.dat");
                                if (var7 == 1 || var13.exists()) {
                                    this.field128 = new class37(var13, "rw", 25L);
                                }
                            } catch (Exception var25) {
                                this.field128 = null;
                            }
                        }
                        if (this.field137 == null) {
                            try {
                                File var15 = new File(var11, arg2);
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
                                this.field129 = new class37(var17, "rw", 104857600L);
                                this.field132 = new class37[arg1];
                                for (int var18 = 0; var18 < arg1; var18++) {
                                    this.field132[var18] = new class37(new File(var15, "main_file_cache.idx" + var18), "rw", 1048576L);
                                }
                                this.field124 = new class37(new File(var15, "main_file_cache.idx255"), "rw", 1048576L);
                                this.field134 = this.field137 = var15;
                            } catch (Exception var24) {
                                try {
                                    this.field129.method249((byte) 127);
                                    for (int var20 = 0; var20 < arg1; var20++) {
                                        this.field132[var20].method249((byte) 115);
                                    }
                                    this.field124.method249((byte) 122);
                                } catch (Exception var23) {
                                }
                                this.field134 = this.field137 = null;
                                this.field132 = null;
                                this.field129 = this.field124 = null;
                            }
                        }
                    } catch (Exception var26) {
                    }
                    if (this.field128 != null && this.field137 != null) {
                        return;
                    }
                }
            }
        }
        if (this.field137 == null) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "(I)V", line = 192)
    public final void method91(int arg0) {
        if (arg0 != -29111) {
            this.method93(null, -110, 66, -32, -108);
        }
        synchronized (this) {
            this.field125 = true;
            this.notifyAll();
        }
        try {
            this.field127.join();
        } catch (InterruptedException var14) {
        }
        if (this.field129 != null) {
            try {
                this.field129.method249((byte) 120);
            } catch (IOException var13) {
            }
        }
        if (this.field124 != null) {
            try {
                this.field124.method249((byte) 116);
            } catch (IOException var12) {
            }
        }
        if (this.field132 != null) {
            for (int var7 = 0; var7 < this.field132.length; var7++) {
                if (this.field132[var7] != null) {
                    try {
                        this.field132[var7].method249((byte) 118);
                    } catch (IOException var11) {
                    }
                }
            }
        }
        if (this.field128 != null) {
            try {
                this.field128.method249((byte) 126);
            } catch (IOException var10) {
            }
        }
    }

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "(IBLjava/lang/Runnable;)Ln;", line = 249)
    public final class24 method92(int arg0, byte arg1, Runnable arg2) {
        if (arg1 <= 44) {
            this.method94(-80, null, 74);
        }
        return this.method93(arg2, 17224, 0, arg0, 2);
    }

    @OriginalMember(owner = "mapview!i", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V", line = 489)
    public class14(boolean arg0, Applet arg1, int arg2, String arg3, int arg4) {
        field139 = "Unknown";
        field138 = "1.1";
        this.field131 = arg1;
        try {
            field139 = System.getProperty("java.vendor");
            field138 = System.getProperty("java.version");
        } catch (Exception var15) {
        }
        try {
            field136 = System.getProperty("user.home");
            if (field136 != null) {
                field136 = field136 + "/";
            }
        } catch (Exception var14) {
        }
        if (field136 == null) {
            field136 = "~/";
        }
        try {
            this.field135 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var13) {
        }
        try {
            if (arg1 == null) {
                field126 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field126 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var12) {
        }
        try {
            if (arg1 == null) {
                field123 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field123 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var11) {
        }
        if (arg0) {
            this.method90(arg2, arg4, arg3, (byte) -93);
        }
        this.field125 = false;
        this.field127 = new Thread(this);
        this.field127.setPriority(10);
        this.field127.setDaemon(true);
        this.field127.start();
    }

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "(Ljava/lang/Object;IIII)Ln;", line = 270)
    private final class24 method93(Object arg0, int arg1, int arg2, int arg3, int arg4) {
        class24 var6 = new class24();
        var6.field347 = arg3;
        var6.field351 = arg4;
        var6.field350 = arg0;
        if (arg1 != 17224) {
            this.field137 = null;
        }
        synchronized (this) {
            if (this.field130 == null) {
                this.field130 = this.field122 = var6;
            } else {
                this.field130.field349 = var6;
                this.field130 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "(ILjava/lang/String;I)Ln;", line = 297)
    public final class24 method94(int arg0, String arg1, int arg2) {
        if (arg0 < 45) {
            field139 = null;
        }
        return this.method93(arg1, 17224, 0, arg2, 1);
    }

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "(Ljava/net/URL;Z)Ln;", line = 308)
    public final class24 method95(URL arg0, boolean arg1) {
        if (!arg1) {
            this.method98((byte) -51, 0);
        }
        return this.method93(arg0, 17224, 0, 0, 4);
    }

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/Class;)Ln;", line = 322)
    public final class24 method96(byte arg0, String arg1, Class arg2) {
        if (arg0 > -29) {
            field126 = null;
        }
        return this.method93(new Object[] { arg2, arg1 }, 17224, 0, 0, 9);
    }

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Class;[Ljava/lang/Class;)Ln;", line = 357)
    public final class24 method97(String arg0, int arg1, Class arg2, Class[] arg3) {
        return arg1 >= -9 ? (class24) null : this.method93(new Object[] { arg2, arg0, arg3 }, 17224, 0, 0, 8);
    }

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "(BI)Ln;", line = 380)
    public final class24 method98(byte arg0, int arg1) {
        if (arg0 >= -28) {
            this.field130 = null;
        }
        return this.method93(null, 17224, 0, arg1, 3);
    }

    @OriginalMember(owner = "mapview!i", name = "run", descriptor = "()V", line = 397)
    public final void run() {
        while (true) {
            class24 var2;
            synchronized (this) {
                while (true) {
                    if (this.field125) {
                        return;
                    }
                    if (this.field122 != null) {
                        var2 = this.field122;
                        this.field122 = this.field122.field349;
                        if (this.field122 == null) {
                            this.field130 = null;
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
                int var5 = var2.field351;
                if (var5 == 1) {
                    var2.field352 = new Socket(InetAddress.getByName((String) var2.field350), var2.field347);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field350);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field347);
                    var2.field352 = var6;
                } else if (var5 == 4) {
                    var2.field352 = new DataInputStream(((URL) var2.field350).openStream());
                } else if (var5 == 8) {
                    Object[] var8 = (Object[]) var2.field350;
                    var2.field352 = ((Class) var8[0]).getDeclaredMethod((String) var8[1], (Class[]) var8[2]);
                } else if (var5 == 9) {
                    Object[] var7 = (Object[]) var2.field350;
                    var2.field352 = ((Class) var7[0]).getDeclaredField((String) var7[1]);
                } else {
                    throw new Exception();
                }
                var2.field348 = 1;
            } catch (ThreadDeath var11) {
                throw var11;
            } catch (Throwable var12) {
                var2.field348 = 2;
            }
        }
    }
}
