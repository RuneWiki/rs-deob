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

@OriginalClass("client!gg")
public class class67 implements Runnable {

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "Z")
    private boolean field1404 = false;

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "Ljava/io/File;")
    public File field1407 = null;

    @OriginalMember(owner = "client!gg", name = "l", descriptor = "Lea;")
    private class42 field1415 = null;

    @OriginalMember(owner = "client!gg", name = "k", descriptor = "Ljava/applet/Applet;")
    public Applet field1414 = null;

    @OriginalMember(owner = "client!gg", name = "j", descriptor = "Ltc;")
    public class178 field1413 = null;

    @OriginalMember(owner = "client!gg", name = "f", descriptor = "Ltc;")
    public class178 field1409 = null;

    @OriginalMember(owner = "client!gg", name = "q", descriptor = "Ltc;")
    public class178 field1420 = null;

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "Lea;")
    private class42 field1408 = null;

    @OriginalMember(owner = "client!gg", name = "p", descriptor = "Ljava/io/File;")
    private File field1419 = null;

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field1406;

    @OriginalMember(owner = "client!gg", name = "o", descriptor = "Ljava/lang/Thread;")
    private Thread field1418;

    @OriginalMember(owner = "client!gg", name = "n", descriptor = "I")
    public static int field1417 = 3;

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "Lsh;")
    private class174 field1405;

    @OriginalMember(owner = "client!gg", name = "g", descriptor = "Ljava/lang/String;")
    private static String field1410;

    @OriginalMember(owner = "client!gg", name = "h", descriptor = "Ljava/lang/String;")
    public static String field1411;

    @OriginalMember(owner = "client!gg", name = "r", descriptor = "Ljava/lang/String;")
    public static String field1421;

    @OriginalMember(owner = "client!gg", name = "i", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field1412;

    @OriginalMember(owner = "client!gg", name = "m", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field1416;

    @OriginalMember(owner = "client!gg", name = "s", descriptor = "[Ltc;")
    public class178[] field1422;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IILjava/lang/String;)Lea;")
    public final class42 method473(int arg0, int arg1, String arg2) {
        return arg0 == -27627 ? this.method479(arg1, arg2, 1, 0, -102) : null;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Ljava/net/URL;I)Lea;")
    public final class42 method474(URL arg0, int arg1) {
        int var3 = 29 / ((arg1 - 9) / 39);
        return this.method479(0, arg0, 4, 0, -128);
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(II)Lea;")
    public final class42 method475(int arg0, int arg1) {
        if (arg1 != -3) {
            this.method481(-118, null, (byte) 114);
        }
        return this.method479(arg0, null, 3, 0, arg1 ^ 0x7B);
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "([Ljava/lang/Class;BLjava/lang/Class;Ljava/lang/String;)Lea;")
    public final class42 method476(Class[] arg0, byte arg1, Class arg2, String arg3) {
        int var5 = 76 / ((-arg1 - 60) / 33);
        return this.method479(0, new Object[] { arg2, arg3, arg0 }, 8, 0, -110);
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(I)Lsh;")
    public final class174 method477(int arg0) {
        if (arg0 != 1006565680) {
            this.method475(-40, -89);
        }
        return this.field1405;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;Z)Lea;")
    public final class42 method478(Class arg0, String arg1, boolean arg2) {
        return arg2 ? null : this.method479(0, new Object[] { arg0, arg1 }, 9, 0, -101);
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILjava/lang/Object;III)Lea;")
    private final class42 method479(int arg0, Object arg1, int arg2, int arg3, int arg4) {
        if (arg4 >= -95) {
            field1421 = null;
        }
        class42 var6 = new class42();
        var6.field857 = arg1;
        var6.field856 = arg0;
        var6.field852 = arg2;
        synchronized (this) {
            if (this.field1415 == null) {
                this.field1415 = this.field1408 = var6;
            } else {
                this.field1415.field853 = var6;
                this.field1415 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Ljava/lang/String;III)V")
    private final void method480(String arg0, int arg1, int arg2, int arg3) {
        if (arg2 < 32 || arg2 > 34) {
            arg2 = 32;
        }
        if (arg1 != 5292) {
            this.method479(126, null, 5, -32, -12);
        }
        String[] var5 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
        String[] var6 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field1410, "/tmp/", "" };
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < var5.length; var8++) {
                for (int var9 = 0; var9 < var6.length; var9++) {
                    try {
                        String var10 = var6[var9];
                        if (var10.length() > 0 && !(new File(var10)).exists()) {
                            continue;
                        }
                        File var11 = new File(var10 + var5[var8]);
                        if (var7 == 1 && !var11.exists()) {
                            boolean var12 = var11.mkdir();
                            if (!var12) {
                                continue;
                            }
                        }
                        if (this.field1413 == null) {
                            try {
                                File var13 = new File(var11, "random.dat");
                                if (var7 == 1 || var13.exists()) {
                                    this.field1413 = new class178(var13, "rw", 25L);
                                }
                            } catch (Exception var21) {
                                this.field1413 = null;
                            }
                        }
                        if (this.field1419 == null) {
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
                                this.field1420 = new class178(var16, "rw", 104857600L);
                                this.field1422 = new class178[arg3];
                                for (int var17 = 0; var17 < arg3; var17++) {
                                    this.field1422[var17] = new class178(new File(var14, "main_file_cache.idx" + var17), "rw", 1048576L);
                                }
                                this.field1409 = new class178(new File(var14, "main_file_cache.idx255"), "rw", 1048576L);
                                this.field1407 = this.field1419 = var14;
                            } catch (Exception var20) {
                                try {
                                    this.field1420.method1204((byte) 116);
                                    for (int var18 = 0; var18 < arg3; var18++) {
                                        this.field1422[var18].method1204((byte) 116);
                                    }
                                    this.field1409.method1204((byte) 116);
                                } catch (Exception var19) {
                                }
                                this.field1407 = this.field1419 = null;
                                this.field1422 = null;
                                this.field1420 = this.field1409 = null;
                            }
                        }
                    } catch (Exception var22) {
                    }
                    if (this.field1413 != null && this.field1419 != null) {
                        return;
                    }
                }
            }
        }
        if (this.field1419 == null) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILjava/lang/Runnable;B)Lea;")
    public final class42 method481(int arg0, Runnable arg1, byte arg2) {
        if (arg2 <= 62) {
            this.field1409 = null;
        }
        return this.method479(arg0, arg1, 2, 0, -110);
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
    public class67(boolean arg0, Applet arg1, int arg2, String arg3, int arg4) {
        field1411 = "Unknown";
        this.field1414 = arg1;
        field1421 = "1.1";
        try {
            field1411 = System.getProperty("java.vendor");
            field1421 = System.getProperty("java.version");
        } catch (Exception var10) {
        }
        try {
            field1410 = System.getProperty("user.home");
            if (field1410 != null) {
                field1410 = field1410 + "/";
            }
        } catch (Exception var9) {
        }
        if (field1410 == null) {
            field1410 = "~/";
        }
        try {
            this.field1406 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var8) {
        }
        try {
            if (arg1 == null) {
                field1412 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field1412 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var7) {
        }
        try {
            if (arg1 == null) {
                field1416 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field1416 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        if (arg0) {
            this.method480(arg3, 5292, arg2, arg4);
        }
        this.field1404 = false;
        this.field1418 = new Thread(this);
        this.field1418.setPriority(10);
        this.field1418.setDaemon(true);
        this.field1418.start();
    }

    @OriginalMember(owner = "client!gg", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class42 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1404) {
                        return;
                    }
                    if (this.field1408 != null) {
                        var2 = this.field1408;
                        this.field1408 = this.field1408.field853;
                        if (this.field1408 == null) {
                            this.field1415 = null;
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
                int var3 = var2.field852;
                if (var3 == 1) {
                    var2.field854 = new Socket(InetAddress.getByName((String) var2.field857), var2.field856);
                } else if (var3 == 2) {
                    Thread var4 = new Thread((Runnable) var2.field857);
                    var4.setDaemon(true);
                    var4.start();
                    var4.setPriority(var2.field856);
                    var2.field854 = var4;
                } else if (var3 == 4) {
                    var2.field854 = new DataInputStream(((URL) var2.field857).openStream());
                } else if (var3 == 8) {
                    Object[] var6 = (Object[]) var2.field857;
                    var2.field854 = ((Class) var6[0]).getDeclaredMethod((String) var6[1], (Class[]) var6[2]);
                } else if (var3 == 9) {
                    Object[] var5 = (Object[]) var2.field857;
                    var2.field854 = ((Class) var5[0]).getDeclaredField((String) var5[1]);
                } else {
                    throw new Exception();
                }
                var2.field855 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field855 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(I)V")
    public final void method482(int arg0) {
        synchronized (this) {
            this.field1404 = true;
            this.notifyAll();
        }
        try {
            this.field1418.join();
            if (arg0 != 6) {
                this.run();
            }
        } catch (InterruptedException var8) {
        }
        if (this.field1420 != null) {
            try {
                this.field1420.method1204((byte) 116);
            } catch (IOException var7) {
            }
        }
        if (this.field1409 != null) {
            try {
                this.field1409.method1204((byte) 116);
            } catch (IOException var6) {
            }
        }
        if (this.field1422 != null) {
            for (int var3 = 0; var3 < this.field1422.length; var3++) {
                if (this.field1422[var3] != null) {
                    try {
                        this.field1422[var3].method1204((byte) 116);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field1413 != null) {
            try {
                this.field1413.method1204((byte) 116);
            } catch (IOException var4) {
            }
        }
    }
}
