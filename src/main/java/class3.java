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

@OriginalClass("mapview!ba")
public class class3 implements Runnable {

    @OriginalMember(owner = "mapview!ba", name = "b", descriptor = "Ljava/io/File;")
    private File field24 = null;

    @OriginalMember(owner = "mapview!ba", name = "f", descriptor = "Lua;")
    public class39 field28 = null;

    @OriginalMember(owner = "mapview!ba", name = "g", descriptor = "Z")
    private boolean field29 = false;

    @OriginalMember(owner = "mapview!ba", name = "e", descriptor = "Lua;")
    public class39 field27 = null;

    @OriginalMember(owner = "mapview!ba", name = "p", descriptor = "Lua;")
    public class39 field38 = null;

    @OriginalMember(owner = "mapview!ba", name = "k", descriptor = "Lja;")
    private class19 field33 = null;

    @OriginalMember(owner = "mapview!ba", name = "l", descriptor = "Lja;")
    private class19 field34 = null;

    @OriginalMember(owner = "mapview!ba", name = "n", descriptor = "Ljava/applet/Applet;")
    public Applet field36 = null;

    @OriginalMember(owner = "mapview!ba", name = "r", descriptor = "Ljava/io/File;")
    public File field40 = null;

    @OriginalMember(owner = "mapview!ba", name = "j", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field32;

    @OriginalMember(owner = "mapview!ba", name = "c", descriptor = "Ljava/lang/Thread;")
    private Thread field25;

    @OriginalMember(owner = "mapview!ba", name = "q", descriptor = "I")
    public static int field39 = 3;

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "Ljava/lang/String;")
    public static String field23;

    @OriginalMember(owner = "mapview!ba", name = "d", descriptor = "Ljava/lang/String;")
    private static String field26;

    @OriginalMember(owner = "mapview!ba", name = "m", descriptor = "Ljava/lang/String;")
    public static String field35;

    @OriginalMember(owner = "mapview!ba", name = "h", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field30;

    @OriginalMember(owner = "mapview!ba", name = "o", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field37;

    @OriginalMember(owner = "mapview!ba", name = "i", descriptor = "[Lua;")
    public class39[] field31;

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "(Ljava/lang/String;IZ)Lja;", line = 7)
    public final class19 method5(String arg0, int arg1, boolean arg2) {
        if (arg2) {
            this.method13(null, -98, 82, -88);
        }
        return this.method8(arg0, -27170, arg1, 0, 1);
    }

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "(Z)V", line = 17)
    public final void method6(boolean arg0) {
        synchronized (this) {
            this.field29 = true;
            this.notifyAll();
            if (arg0) {
                this.method6(false);
            }
        }
        try {
            this.field25.join();
        } catch (InterruptedException var14) {
        }
        if (this.field27 != null) {
            try {
                this.field27.method257(23580);
            } catch (IOException var13) {
            }
        }
        if (this.field28 != null) {
            try {
                this.field28.method257(23580);
            } catch (IOException var12) {
            }
        }
        if (this.field31 != null) {
            for (int var7 = 0; var7 < this.field31.length; var7++) {
                if (this.field31[var7] != null) {
                    try {
                        this.field31[var7].method257(23580);
                    } catch (IOException var11) {
                    }
                }
            }
        }
        if (this.field38 != null) {
            try {
                this.field38.method257(23580);
            } catch (IOException var10) {
            }
        }
    }

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "(ZLjava/lang/Class;Ljava/lang/String;)Lja;", line = 71)
    public final class19 method7(boolean arg0, Class arg1, String arg2) {
        return arg0 ? this.method8(new Object[] { arg1, arg2 }, -27170, 0, 0, 9) : (class19) null;
    }

    @OriginalMember(owner = "mapview!ba", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V", line = 481)
    public class3(boolean arg0, Applet arg1, int arg2, String arg3, int arg4) {
        field23 = "Unknown";
        field35 = "1.1";
        this.field36 = arg1;
        try {
            field23 = System.getProperty("java.vendor");
            field35 = System.getProperty("java.version");
        } catch (Exception var15) {
        }
        try {
            field26 = System.getProperty("user.home");
            if (field26 != null) {
                field26 = field26 + "/";
            }
        } catch (Exception var14) {
        }
        if (field26 == null) {
            field26 = "~/";
        }
        try {
            this.field32 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var13) {
        }
        try {
            if (arg1 == null) {
                field37 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field37 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var12) {
        }
        try {
            if (arg1 == null) {
                field30 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field30 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var11) {
        }
        if (arg0) {
            this.method13(arg3, arg2, arg4, 1);
        }
        this.field29 = false;
        this.field25 = new Thread(this);
        this.field25.setPriority(10);
        this.field25.setDaemon(true);
        this.field25.start();
    }

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "(Ljava/lang/Object;IIII)Lja;", line = 90)
    private final class19 method8(Object arg0, int arg1, int arg2, int arg3, int arg4) {
        class19 var6 = new class19();
        var6.field187 = arg2;
        var6.field186 = arg4;
        var6.field183 = arg0;
        synchronized (this) {
            if (this.field33 == null) {
                this.field33 = this.field34 = var6;
            } else {
                this.field33.field184 = var6;
                this.field33 = var6;
            }
            if (arg1 != -27170) {
                this.method8(null, 79, 64, 47, -90);
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "(ILjava/lang/Runnable;B)Lja;", line = 121)
    public final class19 method9(int arg0, Runnable arg1, byte arg2) {
        int var4 = -75 % ((54 - arg2) / 47);
        return this.method8(arg1, -27170, arg0, 0, 2);
    }

    @OriginalMember(owner = "mapview!ba", name = "run", descriptor = "()V", line = 148)
    public final void run() {
        while (true) {
            class19 var2;
            synchronized (this) {
                while (true) {
                    if (this.field29) {
                        return;
                    }
                    if (this.field34 != null) {
                        var2 = this.field34;
                        this.field34 = this.field34.field184;
                        if (this.field34 == null) {
                            this.field33 = null;
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
                int var5 = var2.field186;
                if (var5 == 1) {
                    var2.field185 = new Socket(InetAddress.getByName((String) var2.field183), var2.field187);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field183);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field187);
                    var2.field185 = var6;
                } else if (var5 == 4) {
                    var2.field185 = new DataInputStream(((URL) var2.field183).openStream());
                } else if (var5 == 8) {
                    Object[] var7 = (Object[]) var2.field183;
                    var2.field185 = ((Class) var7[0]).getDeclaredMethod((String) var7[1], (Class[]) var7[2]);
                } else if (var5 == 9) {
                    Object[] var8 = (Object[]) var2.field183;
                    var2.field185 = ((Class) var8[0]).getDeclaredField((String) var8[1]);
                } else {
                    throw new Exception();
                }
                var2.field182 = 1;
            } catch (ThreadDeath var11) {
                throw var11;
            } catch (Throwable var12) {
                var2.field182 = 2;
            }
        }
    }

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "([Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;I)Lja;", line = 244)
    public final class19 method10(Class[] arg0, Class arg1, String arg2, int arg3) {
        int var5 = 81 / ((28 - arg3) / 35);
        return this.method8(new Object[] { arg1, arg2, arg0 }, -27170, 0, 0, 8);
    }

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "(BLjava/net/URL;)Lja;", line = 278)
    public final class19 method11(byte arg0, URL arg1) {
        if (arg0 < 33) {
            this.method8(null, 35, -50, 72, -69);
        }
        return this.method8(arg1, -27170, 0, 0, 4);
    }

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "(II)Lja;", line = 296)
    public final class19 method12(int arg0, int arg1) {
        if (arg0 != 0) {
            this.method10(null, null, null, -72);
        }
        return this.method8(null, arg0 ^ 0xFFFF95DE, arg1, 0, 3);
    }

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "(Ljava/lang/String;III)V", line = 306)
    private final void method13(String arg0, int arg1, int arg2, int arg3) {
        if (arg1 < 32 || arg1 > 34) {
            arg1 = 32;
        }
        if (arg3 != 1) {
            return;
        }
        String[] var5 = new String[] { ".jagex_cache_" + arg1, ".file_store_" + arg1 };
        String[] var6 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field26, "/tmp/", "" };
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
                        if (this.field38 == null) {
                            try {
                                File var13 = new File(var11, "random.dat");
                                if (var7 == 1 || var13.exists()) {
                                    this.field38 = new class39(var13, "rw", 25L);
                                }
                            } catch (Exception var25) {
                                this.field38 = null;
                            }
                        }
                        if (this.field24 == null) {
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
                                this.field27 = new class39(var17, "rw", 104857600L);
                                this.field31 = new class39[arg2];
                                for (int var18 = 0; var18 < arg2; var18++) {
                                    this.field31[var18] = new class39(new File(var15, "main_file_cache.idx" + var18), "rw", 1048576L);
                                }
                                this.field28 = new class39(new File(var15, "main_file_cache.idx255"), "rw", 1048576L);
                                this.field40 = this.field24 = var15;
                            } catch (Exception var24) {
                                try {
                                    this.field27.method257(23580);
                                    for (int var20 = 0; var20 < arg2; var20++) {
                                        this.field31[var20].method257(23580);
                                    }
                                    this.field28.method257(23580);
                                } catch (Exception var23) {
                                }
                                this.field31 = null;
                                this.field40 = this.field24 = null;
                                this.field27 = this.field28 = null;
                            }
                        }
                    } catch (Exception var26) {
                    }
                    if (this.field38 != null && this.field24 != null) {
                        return;
                    }
                }
            }
        }
        if (this.field24 == null) {
            throw new RuntimeException();
        }
    }
}
