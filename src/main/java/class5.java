import java.applet.Applet;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Point;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class5 implements Runnable {

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "Laa;")
    public class168 field63 = null;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "Lbd;")
    private class22 field62 = null;

    @OriginalMember(owner = "client!kh", name = "i", descriptor = "Laa;")
    public class168 field70 = null;

    @OriginalMember(owner = "client!kh", name = "m", descriptor = "Laa;")
    public class168 field74 = null;

    @OriginalMember(owner = "client!kh", name = "l", descriptor = "Z")
    private boolean field73 = false;

    @OriginalMember(owner = "client!kh", name = "q", descriptor = "Lbd;")
    private class22 field78 = null;

    @OriginalMember(owner = "client!kh", name = "o", descriptor = "Ljava/applet/Applet;")
    public Applet field76 = null;

    @OriginalMember(owner = "client!kh", name = "j", descriptor = "Ljava/lang/String;")
    private String field71;

    @OriginalMember(owner = "client!kh", name = "w", descriptor = "I")
    private int field84;

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field64;

    @OriginalMember(owner = "client!kh", name = "t", descriptor = "[Laa;")
    public class168[] field81;

    @OriginalMember(owner = "client!kh", name = "r", descriptor = "Ljava/lang/Thread;")
    private Thread field79;

    @OriginalMember(owner = "client!kh", name = "n", descriptor = "I")
    public static int field75 = 3;

    @OriginalMember(owner = "client!kh", name = "h", descriptor = "Ljava/util/Hashtable;")
    private static Hashtable field69 = new Hashtable(16);

    @OriginalMember(owner = "client!kh", name = "p", descriptor = "Lea;")
    private class193 field77;

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "Ljava/lang/String;")
    public static String field65;

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "Ljava/lang/String;")
    public static String field66;

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "Ljava/lang/String;")
    private static String field67;

    @OriginalMember(owner = "client!kh", name = "g", descriptor = "Ljava/lang/String;")
    public static String field68;

    @OriginalMember(owner = "client!kh", name = "k", descriptor = "Ljava/lang/String;")
    public static String field72;

    @OriginalMember(owner = "client!kh", name = "s", descriptor = "Ljava/lang/String;")
    public static String field80;

    @OriginalMember(owner = "client!kh", name = "u", descriptor = "Ljava/lang/String;")
    public static String field82;

    @OriginalMember(owner = "client!kh", name = "v", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field83;

    @OriginalMember(owner = "client!kh", name = "x", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field85;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(II)Lbd;")
    public final class22 method24(int arg0, int arg1) {
        if (arg1 != 3) {
            this.method32((Runnable) null, -103, (byte) -9);
        }
        return this.method28((byte) 35, (Object) null, 0, arg0, 3);
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(B)Lea;")
    public final class193 method25(byte arg0) {
        if (arg0 != -71) {
            this.field81 = null;
        }
        return this.field77;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Ljava/lang/String;Z)Lbd;")
    public final class22 method26(String arg0, boolean arg1) {
        return arg1 ? null : this.method28((byte) -127, arg0, 0, 0, 12);
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Ljava/lang/String;B)Lbd;")
    public final class22 method27(String arg0, byte arg1) {
        int var3 = 79 / ((arg1 + 48) / 46);
        return this.method28((byte) -80, arg0, 0, 0, 16);
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(BLjava/lang/Object;III)Lbd;")
    private final class22 method28(byte arg0, Object arg1, int arg2, int arg3, int arg4) {
        class22 var6 = new class22();
        var6.field446 = arg3;
        var6.field443 = arg1;
        var6.field444 = arg4;
        synchronized (this) {
            int var8 = 98 / ((arg0 + 22) / 57);
            if (this.field62 == null) {
                this.field62 = this.field78 = var6;
            } else {
                this.field62.field448 = var6;
                this.field62 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Ljava/lang/Class;I)Lbd;")
    public final class22 method29(Class arg0, int arg1) {
        if (arg1 != -25714) {
            this.field74 = null;
        }
        return this.method28((byte) 117, arg0, 0, 0, 11);
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;Z)Lbd;")
    public final class22 method30(Class arg0, String arg1, boolean arg2) {
        return arg2 ? null : this.method28((byte) 125, new Object[] { arg0, arg1 }, 0, 0, 9);
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)V")
    public final void method31(int arg0) {
        synchronized (this) {
            this.field73 = true;
            this.notifyAll();
        }
        try {
            this.field79.join();
        } catch (InterruptedException var8) {
        }
        if (this.field74 != null) {
            try {
                this.field74.method1199((byte) 46);
            } catch (IOException var7) {
            }
        }
        if (arg0 != 32431) {
            this.field76 = null;
        }
        if (this.field70 != null) {
            try {
                this.field70.method1199((byte) 28);
            } catch (IOException var6) {
            }
        }
        if (this.field81 != null) {
            for (int var3 = 0; var3 < this.field81.length; var3++) {
                if (this.field81[var3] != null) {
                    try {
                        this.field81[var3].method1199((byte) 14);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field63 != null) {
            try {
                this.field63.method1199((byte) 58);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Ljava/lang/Runnable;IB)Lbd;")
    public final class22 method32(Runnable arg0, int arg1, byte arg2) {
        return arg2 == -121 ? this.method28((byte) 83, arg0, 0, arg1, 2) : null;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIILjava/awt/Component;)Lbd;")
    public final class22 method33(int arg0, int arg1, int arg2, Component arg3) {
        Point var5 = arg3.getLocationOnScreen();
        if (arg0 != 0) {
            this.field79 = null;
        }
        return this.method28((byte) -106, (Object) null, var5.y + arg1, var5.x + arg2, 14);
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(BLjava/net/URL;)Lbd;")
    public final class22 method34(byte arg0, URL arg1) {
        int var3 = -89 / ((arg0 + 2) / 36);
        return this.method28((byte) 39, arg1, 0, 0, 4);
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Ljava/lang/Class;ILjava/lang/String;[Ljava/lang/Class;)Lbd;")
    public final class22 method35(Class arg0, int arg1, String arg2, Class[] arg3) {
        int var5 = -4 % ((-arg1 - 22) / 56);
        return this.method28((byte) -87, new Object[] { arg0, arg2, arg3 }, 0, 0, 8);
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(ILjava/awt/Component;Z)Lbd;")
    public final class22 method36(int arg0, Component arg1, boolean arg2) {
        if (arg0 != 1048576) {
            this.method25((byte) -53);
        }
        return this.method28((byte) 71, arg1, 0, arg2 ? 1 : 0, 15);
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)Ljava/io/File;")
    private static final File method37(String arg0, int arg1, String arg2, int arg3) {
        File var4 = (File) field69.get(arg2);
        if (var4 != null) {
            return var4;
        }
        String[] var5 = new String[] { ".jagex_cache_" + arg3, ".file_store_" + arg3 };
        String[] var6 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field67, "/tmp/", "" };
        for (int var7 = arg1; var7 < 2; var7++) {
            for (int var8 = 0; var8 < var5.length; var8++) {
                for (int var9 = 0; var9 < var6.length; var9++) {
                    RandomAccessFile var10 = null;
                    String var11 = var6[var9] + var5[var8] + "/" + (arg0 == null ? "" : arg0 + "/") + arg2;
                    try {
                        File var12 = new File(var11);
                        if (var7 != 0 || var12.exists()) {
                            String var13 = var6[var9];
                            if (var7 != 1 || var13.length() <= 0 || (new File(var13)).exists()) {
                                (new File(var6[var9] + var5[var8])).mkdir();
                                if (arg0 != null) {
                                    (new File(var6[var9] + var5[var8] + "/" + arg0)).mkdir();
                                }
                                var10 = new RandomAccessFile(var12, "rw");
                                int var14 = var10.read();
                                var10.seek(0L);
                                var10.write(var14);
                                var10.seek(0L);
                                var10.close();
                                field69.put(arg2, var12);
                                return var12;
                            }
                        }
                    } catch (Exception var17) {
                        try {
                            if (var10 != null) {
                                var10.close();
                                Object var15 = null;
                            }
                        } catch (Exception var16) {
                        }
                    }
                }
            }
        }
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
    public class5(boolean arg0, Applet arg1, int arg2, String arg3, int arg4) throws Exception {
        field72 = "Unknown";
        this.field71 = arg3;
        field82 = "1.1";
        this.field84 = arg2;
        this.field76 = arg1;
        try {
            field72 = System.getProperty("java.vendor");
            field82 = System.getProperty("java.version");
        } catch (Exception var14) {
        }
        try {
            field66 = System.getProperty("os.name");
        } catch (Exception var13) {
            field66 = "Unknown";
        }
        field80 = field66.toLowerCase();
        try {
            field68 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var12) {
            field68 = "";
        }
        try {
            field65 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var11) {
            field65 = "";
        }
        try {
            field67 = System.getProperty("user.home");
            if (field67 != null) {
                field67 = field67 + "/";
            }
        } catch (Exception var10) {
        }
        if (field67 == null) {
            field67 = "~/";
        }
        try {
            this.field64 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var9) {
        }
        try {
            if (arg1 == null) {
                field85 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field85 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var8) {
        }
        try {
            if (arg1 == null) {
                field83 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field83 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var7) {
        }
        if (arg0) {
            this.field63 = new class168(method37((String) null, 0, "random.dat", this.field84), "rw", 25L);
            this.field74 = new class168(method37(this.field71, 0, "main_file_cache.dat2", this.field84), "rw", 104857600L);
            this.field70 = new class168(method37(this.field71, 0, "main_file_cache.idx255", this.field84), "rw", 1048576L);
            this.field81 = new class168[arg4];
            for (int var6 = 0; var6 < arg4; var6++) {
                this.field81[var6] = new class168(method37(this.field71, 0, "main_file_cache.idx" + var6, this.field84), "rw", 1048576L);
            }
        }
        this.field73 = false;
        this.field79 = new Thread(this);
        this.field79.setPriority(10);
        this.field79.setDaemon(true);
        this.field79.start();
    }

    @OriginalMember(owner = "client!kh", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class22 var2;
            synchronized (this) {
                while (true) {
                    if (this.field73) {
                        return;
                    }
                    if (this.field78 != null) {
                        var2 = this.field78;
                        this.field78 = this.field78.field448;
                        if (this.field78 == null) {
                            this.field62 = null;
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
                int var3 = var2.field444;
                if (var3 == 1) {
                    var2.field447 = new Socket(InetAddress.getByName((String) var2.field443), var2.field446);
                } else if (var3 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field443);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field446);
                    var2.field447 = var6;
                } else if (var3 == 4) {
                    var2.field447 = new DataInputStream(((URL) var2.field443).openStream());
                } else if (var3 == 8) {
                    Object[] var4 = (Object[]) var2.field443;
                    var2.field447 = ((Class) var4[0]).getDeclaredMethod((String) var4[1], (Class[]) var4[2]);
                } else if (var3 == 9) {
                    Object[] var5 = (Object[]) var2.field443;
                    var2.field447 = ((Class) var5[0]).getDeclaredField((String) var5[1]);
                } else {
                    throw new Exception();
                }
                var2.field445 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field445 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(ILjava/lang/String;I)Lbd;")
    public final class22 method38(int arg0, String arg1, int arg2) {
        if (arg2 >= -57) {
            this.field70 = null;
        }
        return this.method28((byte) 119, arg1, 0, arg0, 1);
    }
}
