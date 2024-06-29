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

@OriginalClass("mapview!m")
public class class22 implements Runnable {

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "I")
    public int field220 = 0;

    @OriginalMember(owner = "mapview!m", name = "j", descriptor = "Z")
    private boolean field229 = false;

    @OriginalMember(owner = "mapview!m", name = "g", descriptor = "Ljava/io/File;")
    public File field226 = null;

    @OriginalMember(owner = "mapview!m", name = "k", descriptor = "Ljava/applet/Applet;")
    public Applet field230 = null;

    @OriginalMember(owner = "mapview!m", name = "d", descriptor = "Lq;")
    public class30 field223 = null;

    @OriginalMember(owner = "mapview!m", name = "m", descriptor = "Lla;")
    private class21 field232 = null;

    @OriginalMember(owner = "mapview!m", name = "l", descriptor = "Lla;")
    private class21 field231 = null;

    @OriginalMember(owner = "mapview!m", name = "r", descriptor = "Ljava/io/File;")
    private File field237 = null;

    @OriginalMember(owner = "mapview!m", name = "q", descriptor = "Lq;")
    public class30 field236 = null;

    @OriginalMember(owner = "mapview!m", name = "h", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field227;

    @OriginalMember(owner = "mapview!m", name = "p", descriptor = "Ljava/lang/Thread;")
    private Thread field235;

    @OriginalMember(owner = "mapview!m", name = "b", descriptor = "I")
    public static int field221 = 3;

    @OriginalMember(owner = "mapview!m", name = "c", descriptor = "Ljava/lang/String;")
    public static String field222;

    @OriginalMember(owner = "mapview!m", name = "e", descriptor = "Ljava/lang/String;")
    public static String field224;

    @OriginalMember(owner = "mapview!m", name = "n", descriptor = "Ljava/lang/String;")
    private static String field233;

    @OriginalMember(owner = "mapview!m", name = "i", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field228;

    @OriginalMember(owner = "mapview!m", name = "o", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field234;

    @OriginalMember(owner = "mapview!m", name = "f", descriptor = "[Lq;")
    public class30[] field225;

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "(ILjava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Lla;", line = 5)
    public final class21 method122(int arg0, Class arg1, String arg2, Class[] arg3) {
        if (arg0 != 1048576) {
            field221 = -124;
        }
        return this.method130(9, 0, -10, new Object[] { arg1, arg2, arg3 }, 0);
    }

    @OriginalMember(owner = "mapview!m", name = "run", descriptor = "()V", line = 26)
    public final void run() {
        while (true) {
            class21 var2;
            synchronized (this) {
                while (true) {
                    if (this.field229) {
                        return;
                    }
                    if (this.field231 != null) {
                        var2 = this.field231;
                        this.field231 = this.field231.field218;
                        if (this.field231 == null) {
                            this.field232 = null;
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
                int var5 = var2.field216;
                if (var5 == 1) {
                    var2.field219 = new Socket(InetAddress.getByName((String) var2.field214), var2.field217);
                } else if (var5 == 2) {
                    Thread var8 = new Thread((Runnable) var2.field214);
                    var8.setDaemon(true);
                    var8.start();
                    var8.setPriority(var2.field217);
                    var2.field219 = var8;
                } else if (var5 == 4) {
                    var2.field219 = new DataInputStream(((URL) var2.field214).openStream());
                } else if (var5 == 9) {
                    Object[] var7 = (Object[]) var2.field214;
                    var2.field219 = ((Class) var7[0]).getDeclaredMethod((String) var7[1], (Class[]) var7[2]);
                } else if (var5 == 10) {
                    Object[] var6 = (Object[]) var2.field214;
                    var2.field219 = ((Class) var6[0]).getDeclaredField((String) var6[1]);
                } else {
                    throw new Exception();
                }
                var2.field215 = 1;
            } catch (ThreadDeath var11) {
                throw var11;
            } catch (Throwable var12) {
                var2.field215 = 2;
            }
        }
    }

    @OriginalMember(owner = "mapview!m", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V", line = 508)
    public class22(boolean arg0, Applet arg1, int arg2, String arg3, int arg4) {
        this.field230 = arg1;
        field222 = "1.1";
        field224 = "Unknown";
        try {
            field224 = System.getProperty("java.vendor");
            field222 = System.getProperty("java.version");
        } catch (Exception var15) {
        }
        try {
            field233 = System.getProperty("user.home");
            if (field233 != null) {
                field233 = field233 + "/";
            }
        } catch (Exception var14) {
        }
        if (field233 == null) {
            field233 = "~/";
        }
        try {
            this.field227 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var13) {
        }
        try {
            if (arg1 == null) {
                field234 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field234 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var12) {
        }
        try {
            if (arg1 == null) {
                field228 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field228 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var11) {
        }
        if (arg0) {
            this.method129(arg3, arg4, -20, arg2);
        }
        this.field229 = false;
        this.field235 = new Thread(this);
        this.field235.setPriority(10);
        this.field235.setDaemon(true);
        this.field235.start();
    }

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "(II)Lla;", line = 127)
    public final class21 method123(int arg0, int arg1) {
        if (arg0 >= -124) {
            this.method126((byte) 41, null, null);
        }
        return this.method130(3, 0, -10, null, arg1);
    }

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "(Z)V", line = 149)
    public final void method124(boolean arg0) {
        synchronized (this) {
            this.field229 = arg0;
            this.notifyAll();
        }
        try {
            this.field235.join();
        } catch (InterruptedException var12) {
        }
        if (this.field223 != null) {
            try {
                this.field223.method186(0);
            } catch (IOException var11) {
            }
        }
        if (this.field236 != null) {
            try {
                this.field236.method186(0);
            } catch (IOException var10) {
            }
        }
        if (this.field225 == null) {
            return;
        }
        for (int var7 = 0; var7 < this.field225.length; var7++) {
            if (this.field225[var7] != null) {
                try {
                    this.field225[var7].method186(0);
                } catch (IOException var9) {
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "(ILjava/lang/String;I)Lla;", line = 207)
    public final class21 method125(int arg0, String arg1, int arg2) {
        if (arg0 != -16869) {
            this.field237 = null;
        }
        return this.method130(1, 0, -10, arg1, arg2);
    }

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "(BLjava/lang/Class;Ljava/lang/String;)Lla;", line = 223)
    public final class21 method126(byte arg0, Class arg1, String arg2) {
        if (arg0 != -58) {
            this.method130(57, 29, 53, null, 9);
        }
        return this.method130(10, 0, -10, new Object[] { arg1, arg2 }, 0);
    }

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "(ILjava/net/URL;)Lla;", line = 234)
    public final class21 method127(int arg0, URL arg1) {
        int var3 = -126 % ((-arg0 - 46) / 62);
        return this.method130(4, 0, -10, arg1, 0);
    }

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "(ILjava/lang/Runnable;B)Lla;", line = 264)
    public final class21 method128(int arg0, Runnable arg1, byte arg2) {
        return arg2 == 46 ? this.method130(2, 0, arg2 ^ 0xFFFFFFD8, arg1, arg0) : (class21) null;
    }

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "(Ljava/lang/String;III)V", line = 282)
    private final void method129(String arg0, int arg1, int arg2, int arg3) {
        if (arg3 < 32 || arg3 > 34) {
            arg3 = 32;
        }
        int var5 = -60 % ((arg2 - 48) / 50);
        String[] var6 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", "/tmp/", field233, "" };
        boolean var7 = false;
        String[] var8 = new String[] { ".jagex_cache_" + arg3, ".file_store_" + arg3 };
        for (int var9 = 0; var9 < 2; var9++) {
            for (int var10 = 0; var10 < var8.length; var10++) {
                for (int var11 = 0; var11 < var6.length; var11++) {
                    try {
                        String var12 = var6[var11];
                        if (var12.length() > 0 && !(new File(var12)).exists()) {
                            continue;
                        }
                        File var13 = new File(var12 + var8[var10]);
                        if (var9 == 1 && !var13.exists()) {
                            boolean var14 = var13.mkdir();
                            if (!var14) {
                                continue;
                            }
                        }
                        if (!var7) {
                            try {
                                File var15 = new File(var13, "uid.dat");
                                if (var9 == 1 && (!var15.exists() || var15.length() < 4L)) {
                                    Random var16 = new Random();
                                    int var17;
                                    for (var17 = -1; var17 == -1; var17 = var16.nextInt()) {
                                    }
                                    DataOutputStream var18 = new DataOutputStream(new FileOutputStream(var15));
                                    var18.writeInt(var17);
                                    var18.close();
                                }
                                if (var15.exists()) {
                                    var7 = true;
                                    DataInputStream var19 = new DataInputStream(new FileInputStream(var15));
                                    this.field220 = var19.readInt() + 1;
                                    var19.close();
                                }
                            } catch (Exception var31) {
                            }
                        }
                        if (this.field237 == null) {
                            try {
                                File var21 = new File(var13, arg0);
                                if (var9 == 1 && !var21.exists()) {
                                    boolean var22 = var21.mkdir();
                                    if (!var22) {
                                        continue;
                                    }
                                }
                                File var23 = new File(var21, "main_file_cache.dat2");
                                if (var9 == 0 && !var23.exists()) {
                                    continue;
                                }
                                this.field223 = new class30(var23, "rw", 52428800L);
                                this.field225 = new class30[arg1];
                                for (int var24 = 0; var24 < arg1; var24++) {
                                    this.field225[var24] = new class30(new File(var21, "main_file_cache.idx" + var24), "rw", 1048576L);
                                }
                                this.field236 = new class30(new File(var21, "main_file_cache.idx255"), "rw", 1048576L);
                                this.field226 = this.field237 = var21;
                            } catch (Exception var30) {
                                try {
                                    this.field223.method186(0);
                                    for (int var26 = 0; var26 < arg1; var26++) {
                                        this.field225[var26].method186(0);
                                    }
                                    this.field236.method186(0);
                                } catch (Exception var29) {
                                }
                                this.field223 = this.field236 = null;
                                this.field225 = null;
                                this.field226 = this.field237 = null;
                            }
                        }
                    } catch (Exception var32) {
                    }
                    if (var7 && this.field237 != null) {
                        return;
                    }
                }
            }
        }
        if (this.field237 == null) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "(IIILjava/lang/Object;I)Lla;", line = 475)
    private final class21 method130(int arg0, int arg1, int arg2, Object arg3, int arg4) {
        if (arg2 != -10) {
            return (class21) null;
        }
        class21 var6 = new class21();
        var6.field216 = arg0;
        var6.field214 = arg3;
        var6.field217 = arg4;
        synchronized (this) {
            if (this.field232 == null) {
                this.field232 = this.field231 = var6;
            } else {
                this.field232.field218 = var6;
                this.field232 = var6;
            }
            this.notify();
            return var6;
        }
    }
}
