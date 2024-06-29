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

@OriginalClass("mapview!fa")
public class class11 implements Runnable {

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "Lh;")
    private class13 field145 = null;

    @OriginalMember(owner = "mapview!fa", name = "e", descriptor = "Ljava/io/File;")
    private File field149 = null;

    @OriginalMember(owner = "mapview!fa", name = "b", descriptor = "Z")
    private boolean field146 = false;

    @OriginalMember(owner = "mapview!fa", name = "n", descriptor = "Ljava/io/File;")
    public File field158 = null;

    @OriginalMember(owner = "mapview!fa", name = "l", descriptor = "Ln;")
    public class25 field156 = null;

    @OriginalMember(owner = "mapview!fa", name = "q", descriptor = "Ln;")
    public class25 field161 = null;

    @OriginalMember(owner = "mapview!fa", name = "j", descriptor = "Ln;")
    public class25 field154 = null;

    @OriginalMember(owner = "mapview!fa", name = "o", descriptor = "Lh;")
    private class13 field159 = null;

    @OriginalMember(owner = "mapview!fa", name = "k", descriptor = "Ljava/applet/Applet;")
    public Applet field155 = null;

    @OriginalMember(owner = "mapview!fa", name = "d", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field148;

    @OriginalMember(owner = "mapview!fa", name = "g", descriptor = "Ljava/lang/Thread;")
    private Thread field151;

    @OriginalMember(owner = "mapview!fa", name = "p", descriptor = "I")
    public static int field160 = 3;

    @OriginalMember(owner = "mapview!fa", name = "f", descriptor = "Ljava/lang/String;")
    public static String field150;

    @OriginalMember(owner = "mapview!fa", name = "i", descriptor = "Ljava/lang/String;")
    private static String field153;

    @OriginalMember(owner = "mapview!fa", name = "m", descriptor = "Ljava/lang/String;")
    public static String field157;

    @OriginalMember(owner = "mapview!fa", name = "h", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field152;

    @OriginalMember(owner = "mapview!fa", name = "r", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field162;

    @OriginalMember(owner = "mapview!fa", name = "c", descriptor = "[Ln;")
    public class25[] field147;

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "(I)V", line = 4)
    public final void method60(int arg0) {
        synchronized (this) {
            this.field146 = true;
            this.notifyAll();
        }
        try {
            this.field151.join();
        } catch (InterruptedException var14) {
        }
        if (this.field156 != null) {
            try {
                this.field156.method156(arg0 ^ 0xFFFFB207);
            } catch (IOException var13) {
            }
        }
        if (this.field154 != null) {
            try {
                this.field154.method156(19961);
            } catch (IOException var12) {
            }
        }
        if (arg0 != -2) {
            return;
        }
        if (this.field147 != null) {
            for (int var7 = 0; var7 < this.field147.length; var7++) {
                if (this.field147[var7] != null) {
                    try {
                        this.field147[var7].method156(19961);
                    } catch (IOException var11) {
                    }
                }
            }
        }
        if (this.field161 != null) {
            try {
                this.field161.method156(19961);
            } catch (IOException var10) {
            }
        }
    }

    @OriginalMember(owner = "mapview!fa", name = "run", descriptor = "()V", line = 66)
    public final void run() {
        while (true) {
            class13 var2;
            synchronized (this) {
                while (true) {
                    if (this.field146) {
                        return;
                    }
                    if (this.field159 != null) {
                        var2 = this.field159;
                        this.field159 = this.field159.field164;
                        if (this.field159 == null) {
                            this.field145 = null;
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
                int var5 = var2.field168;
                if (var5 == 1) {
                    var2.field169 = new Socket(InetAddress.getByName((String) var2.field167), var2.field166);
                } else if (var5 == 2) {
                    Thread var8 = new Thread((Runnable) var2.field167);
                    var8.setDaemon(true);
                    var8.start();
                    var8.setPriority(var2.field166);
                    var2.field169 = var8;
                } else if (var5 == 4) {
                    var2.field169 = new DataInputStream(((URL) var2.field167).openStream());
                } else if (var5 == 8) {
                    Object[] var6 = (Object[]) var2.field167;
                    var2.field169 = ((Class) var6[0]).getDeclaredMethod((String) var6[1], (Class[]) var6[2]);
                } else if (var5 == 9) {
                    Object[] var7 = (Object[]) var2.field167;
                    var2.field169 = ((Class) var7[0]).getDeclaredField((String) var7[1]);
                } else {
                    throw new Exception();
                }
                var2.field165 = 1;
            } catch (ThreadDeath var11) {
                throw var11;
            } catch (Throwable var12) {
                var2.field165 = 2;
            }
        }
    }

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "(Ljava/lang/String;IB)Lh;", line = 160)
    public final class13 method61(String arg0, int arg1, byte arg2) {
        return arg2 == -93 ? this.method67(1, arg2 + 93, 0, arg1, arg0) : (class13) null;
    }

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "(II)Lh;", line = 176)
    public final class13 method62(int arg0, int arg1) {
        if (arg0 != 0) {
            this.field146 = false;
        }
        return this.method67(3, 0, 0, arg1, null);
    }

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "([Ljava/lang/Class;ILjava/lang/String;Ljava/lang/Class;)Lh;", line = 191)
    public final class13 method63(Class[] arg0, int arg1, String arg2, Class arg3) {
        int var5 = 58 % ((arg1 + 45) / 63);
        return this.method67(8, 0, 0, 0, new Object[] { arg3, arg2, arg0 });
    }

    @OriginalMember(owner = "mapview!fa", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V", line = 484)
    public class11(boolean arg0, Applet arg1, int arg2, String arg3, int arg4) {
        field157 = "1.1";
        field150 = "Unknown";
        this.field155 = arg1;
        try {
            field150 = System.getProperty("java.vendor");
            field157 = System.getProperty("java.version");
        } catch (Exception var15) {
        }
        try {
            field153 = System.getProperty("user.home");
            if (field153 != null) {
                field153 = field153 + "/";
            }
        } catch (Exception var14) {
        }
        if (field153 == null) {
            field153 = "~/";
        }
        try {
            this.field148 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var13) {
        }
        try {
            if (arg1 == null) {
                field162 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field162 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var12) {
        }
        try {
            if (arg1 == null) {
                field152 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field152 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var11) {
        }
        if (arg0) {
            this.method68(arg3, arg4, (byte) -76, arg2);
        }
        this.field146 = false;
        this.field151 = new Thread(this);
        this.field151.setPriority(10);
        this.field151.setDaemon(true);
        this.field151.start();
    }

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "(Ljava/net/URL;I)Lh;", line = 214)
    public final class13 method64(URL arg0, int arg1) {
        if (arg1 != 4) {
            this.method60(37);
        }
        return this.method67(4, 0, 0, 0, arg0);
    }

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Class;)Lh;", line = 225)
    public final class13 method65(int arg0, String arg1, Class arg2) {
        if (arg0 != -18266) {
            this.method68(null, -18, (byte) -46, -117);
        }
        return this.method67(9, 0, 0, 0, new Object[] { arg2, arg1 });
    }

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "(ILjava/lang/Runnable;I)Lh;", line = 235)
    public final class13 method66(int arg0, Runnable arg1, int arg2) {
        if (arg0 != 2) {
            this.field154 = null;
        }
        return this.method67(2, 0, 0, arg2, arg1);
    }

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "(IIIILjava/lang/Object;)Lh;", line = 258)
    private final class13 method67(int arg0, int arg1, int arg2, int arg3, Object arg4) {
        class13 var6 = new class13();
        var6.field167 = arg4;
        if (arg1 != 0) {
            this.method64(null, 36);
        }
        var6.field168 = arg0;
        var6.field166 = arg3;
        synchronized (this) {
            if (this.field145 == null) {
                this.field145 = this.field159 = var6;
            } else {
                this.field145.field164 = var6;
                this.field145 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "(Ljava/lang/String;IBI)V", line = 293)
    private final void method68(String arg0, int arg1, byte arg2, int arg3) {
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field153, "/tmp/", "" };
        if (arg3 < 32 || arg3 > 34) {
            arg3 = 32;
        }
        String[] var6 = new String[] { ".jagex_cache_" + arg3, ".file_store_" + arg3 };
        int var7 = -5 / ((arg2 - 22) / 55);
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
                        if (this.field161 == null) {
                            try {
                                File var14 = new File(var12, "random.dat");
                                if (var8 == 1 || var14.exists()) {
                                    this.field161 = new class25(var14, "rw", 25L);
                                }
                            } catch (Exception var26) {
                                this.field161 = null;
                            }
                        }
                        if (this.field149 == null) {
                            try {
                                File var16 = new File(var12, arg0);
                                if (var8 == 1 && !var16.exists()) {
                                    boolean var17 = var16.mkdir();
                                    if (!var17) {
                                        continue;
                                    }
                                }
                                File var18 = new File(var16, "main_file_cache.dat2");
                                if (var8 == 0 && !var18.exists()) {
                                    continue;
                                }
                                this.field156 = new class25(var18, "rw", 104857600L);
                                this.field147 = new class25[arg1];
                                for (int var19 = 0; var19 < arg1; var19++) {
                                    this.field147[var19] = new class25(new File(var16, "main_file_cache.idx" + var19), "rw", 1048576L);
                                }
                                this.field154 = new class25(new File(var16, "main_file_cache.idx255"), "rw", 1048576L);
                                this.field158 = this.field149 = var16;
                            } catch (Exception var25) {
                                try {
                                    this.field156.method156(19961);
                                    for (int var21 = 0; var21 < arg1; var21++) {
                                        this.field147[var21].method156(19961);
                                    }
                                    this.field154.method156(19961);
                                } catch (Exception var24) {
                                }
                                this.field147 = null;
                                this.field158 = this.field149 = null;
                                this.field156 = this.field154 = null;
                            }
                        }
                    } catch (Exception var27) {
                    }
                    if (this.field161 != null && this.field149 != null) {
                        return;
                    }
                }
            }
        }
        if (this.field149 == null) {
            throw new RuntimeException();
        }
    }
}
