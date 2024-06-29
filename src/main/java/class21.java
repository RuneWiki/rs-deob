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

@OriginalClass("client!bi")
public class class21 implements Runnable {

    @OriginalMember(owner = "client!bi", name = "h", descriptor = "Ljava/applet/Applet;")
    public Applet field347 = null;

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "Lmd;")
    public class134 field345 = null;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "Lmb;")
    private class132 field340 = null;

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "Lmb;")
    private class132 field344 = null;

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "Lmd;")
    public class134 field341 = null;

    @OriginalMember(owner = "client!bi", name = "n", descriptor = "Ljava/io/File;")
    public File field353 = null;

    @OriginalMember(owner = "client!bi", name = "g", descriptor = "Z")
    private boolean field346 = false;

    @OriginalMember(owner = "client!bi", name = "q", descriptor = "Lmd;")
    public class134 field356 = null;

    @OriginalMember(owner = "client!bi", name = "o", descriptor = "Ljava/io/File;")
    private File field354 = null;

    @OriginalMember(owner = "client!bi", name = "i", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field348;

    @OriginalMember(owner = "client!bi", name = "l", descriptor = "Ljava/lang/Thread;")
    private Thread field351;

    @OriginalMember(owner = "client!bi", name = "j", descriptor = "I")
    public static int field349 = 3;

    @OriginalMember(owner = "client!bi", name = "m", descriptor = "Lqd;")
    private class178 field352;

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "Ljava/lang/String;")
    public static String field343;

    @OriginalMember(owner = "client!bi", name = "r", descriptor = "Ljava/lang/String;")
    public static String field357;

    @OriginalMember(owner = "client!bi", name = "s", descriptor = "Ljava/lang/String;")
    private static String field358;

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field342;

    @OriginalMember(owner = "client!bi", name = "p", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field355;

    @OriginalMember(owner = "client!bi", name = "k", descriptor = "[Lmd;")
    public class134[] field350;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)V")
    public final void method136(int arg0) {
        synchronized (this) {
            this.field346 = true;
            this.notifyAll();
        }
        try {
            this.field351.join();
        } catch (InterruptedException var8) {
        }
        if (this.field345 != null) {
            try {
                this.field345.method927(1);
            } catch (IOException var7) {
            }
        }
        if (arg0 <= 45) {
            this.method138(92, 112);
        }
        if (this.field356 != null) {
            try {
                this.field356.method927(1);
            } catch (IOException var6) {
            }
        }
        if (this.field350 != null) {
            for (int var3 = 0; var3 < this.field350.length; var3++) {
                if (this.field350[var3] != null) {
                    try {
                        this.field350[var3].method927(1);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field341 != null) {
            try {
                this.field341.method927(1);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIBILjava/lang/Object;)Lmb;")
    private final class132 method137(int arg0, int arg1, byte arg2, int arg3, Object arg4) {
        class132 var6 = new class132();
        var6.field2463 = arg4;
        var6.field2462 = arg0;
        var6.field2460 = arg1;
        synchronized (this) {
            if (this.field344 == null) {
                this.field344 = this.field340 = var6;
            } else {
                this.field344.field2464 = var6;
                this.field344 = var6;
            }
            this.notify();
            if (arg2 >= -14) {
                this.method136(3);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(II)Lmb;")
    public final class132 method138(int arg0, int arg1) {
        if (arg0 <= 2) {
            this.method144(null, -90, null);
        }
        return this.method137(arg1, 3, (byte) -58, 0, null);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Ljava/net/URL;I)Lmb;")
    public final class132 method139(URL arg0, int arg1) {
        if (arg1 < 109) {
            this.method145(false);
        }
        return this.method137(0, 4, (byte) -38, 0, arg0);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Ljava/lang/String;BII)V")
    private final void method140(String arg0, byte arg1, int arg2, int arg3) {
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field358, "/tmp/", "" };
        if (arg1 != 102) {
            this.method140(null, (byte) 57, -42, 71);
        }
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
                        if (this.field341 == null) {
                            try {
                                File var13 = new File(var11, "random.dat");
                                if (var7 == 1 || var13.exists()) {
                                    this.field341 = new class134(var13, "rw", 25L);
                                }
                            } catch (Exception var21) {
                                this.field341 = null;
                            }
                        }
                        if (this.field354 == null) {
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
                                this.field345 = new class134(var16, "rw", 104857600L);
                                this.field350 = new class134[arg3];
                                for (int var17 = 0; var17 < arg3; var17++) {
                                    this.field350[var17] = new class134(new File(var14, "main_file_cache.idx" + var17), "rw", 1048576L);
                                }
                                this.field356 = new class134(new File(var14, "main_file_cache.idx255"), "rw", 1048576L);
                                this.field353 = this.field354 = var14;
                            } catch (Exception var20) {
                                try {
                                    this.field345.method927(arg1 - 101);
                                    for (int var18 = 0; var18 < arg3; var18++) {
                                        this.field350[var18].method927(arg1 ^ 0x67);
                                    }
                                    this.field356.method927(1);
                                } catch (Exception var19) {
                                }
                                this.field345 = this.field356 = null;
                                this.field350 = null;
                                this.field353 = this.field354 = null;
                            }
                        }
                    } catch (Exception var22) {
                    }
                    if (this.field341 != null && this.field354 != null) {
                        return;
                    }
                }
            }
        }
        if (this.field354 == null) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILjava/lang/Runnable;B)Lmb;")
    public final class132 method141(int arg0, Runnable arg1, byte arg2) {
        return arg2 == 72 ? this.method137(arg0, 2, (byte) -22, 0, arg1) : null;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Ljava/lang/String;II)Lmb;")
    public final class132 method142(String arg0, int arg1, int arg2) {
        if (arg2 < 42) {
            this.method136(-121);
        }
        return this.method137(arg1, 1, (byte) -41, 0, arg0);
    }

    @OriginalMember(owner = "client!bi", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class132 var2;
            synchronized (this) {
                while (true) {
                    if (this.field346) {
                        return;
                    }
                    if (this.field340 != null) {
                        var2 = this.field340;
                        this.field340 = this.field340.field2464;
                        if (this.field340 == null) {
                            this.field344 = null;
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
                int var3 = var2.field2460;
                if (var3 == 1) {
                    var2.field2465 = new Socket(InetAddress.getByName((String) var2.field2463), var2.field2462);
                } else if (var3 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2463);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2462);
                    var2.field2465 = var6;
                } else if (var3 == 4) {
                    var2.field2465 = new DataInputStream(((URL) var2.field2463).openStream());
                } else if (var3 == 8) {
                    Object[] var4 = (Object[]) var2.field2463;
                    var2.field2465 = ((Class) var4[0]).getDeclaredMethod((String) var4[1], (Class[]) var4[2]);
                } else if (var3 == 9) {
                    Object[] var5 = (Object[]) var2.field2463;
                    var2.field2465 = ((Class) var5[0]).getDeclaredField((String) var5[1]);
                } else {
                    throw new Exception();
                }
                var2.field2461 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field2461 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Ljava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;I)Lmb;")
    public final class132 method143(String arg0, Class[] arg1, Class arg2, int arg3) {
        if (arg3 != 2) {
            this.field351 = null;
        }
        return this.method137(0, 8, (byte) -102, 0, new Object[] { arg2, arg0, arg1 });
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Ljava/lang/Class;ILjava/lang/String;)Lmb;")
    public final class132 method144(Class arg0, int arg1, String arg2) {
        return arg1 >= -12 ? null : this.method137(0, 9, (byte) -125, 0, new Object[] { arg0, arg2 });
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Z)Lqd;")
    public final class178 method145(boolean arg0) {
        if (!arg0) {
            this.method144(null, -66, null);
        }
        return this.field352;
    }

    @OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
    public class21(boolean arg0, Applet arg1, int arg2, String arg3, int arg4) {
        field343 = "1.1";
        field357 = "Unknown";
        this.field347 = arg1;
        try {
            field357 = System.getProperty("java.vendor");
            field343 = System.getProperty("java.version");
        } catch (Exception var10) {
        }
        try {
            field358 = System.getProperty("user.home");
            if (field358 != null) {
                field358 = field358 + "/";
            }
        } catch (Exception var9) {
        }
        if (field358 == null) {
            field358 = "~/";
        }
        try {
            this.field348 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var8) {
        }
        try {
            if (arg1 == null) {
                field355 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field355 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var7) {
        }
        try {
            if (arg1 == null) {
                field342 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field342 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        if (arg0) {
            this.method140(arg3, (byte) 102, arg2, arg4);
        }
        this.field346 = false;
        this.field351 = new Thread(this);
        this.field351.setPriority(10);
        this.field351.setDaemon(true);
        this.field351.start();
    }
}
