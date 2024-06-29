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

@OriginalClass("mapview!ia")
public class class17 implements Runnable {

    @OriginalMember(owner = "mapview!ia", name = "b", descriptor = "Lta;")
    public class37 field140 = null;

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "Lha;")
    private class15 field139 = null;

    @OriginalMember(owner = "mapview!ia", name = "i", descriptor = "Ljava/applet/Applet;")
    public Applet field147 = null;

    @OriginalMember(owner = "mapview!ia", name = "e", descriptor = "Lha;")
    private class15 field143 = null;

    @OriginalMember(owner = "mapview!ia", name = "c", descriptor = "Ljava/io/File;")
    public File field141 = null;

    @OriginalMember(owner = "mapview!ia", name = "o", descriptor = "Lta;")
    public class37 field153 = null;

    @OriginalMember(owner = "mapview!ia", name = "g", descriptor = "Z")
    private boolean field145 = false;

    @OriginalMember(owner = "mapview!ia", name = "p", descriptor = "Ljava/io/File;")
    private File field154 = null;

    @OriginalMember(owner = "mapview!ia", name = "l", descriptor = "Lta;")
    public class37 field150 = null;

    @OriginalMember(owner = "mapview!ia", name = "d", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field142;

    @OriginalMember(owner = "mapview!ia", name = "j", descriptor = "Ljava/lang/Thread;")
    private Thread field148;

    @OriginalMember(owner = "mapview!ia", name = "f", descriptor = "I")
    public static int field144 = 3;

    @OriginalMember(owner = "mapview!ia", name = "h", descriptor = "Ljava/lang/String;")
    public static String field146;

    @OriginalMember(owner = "mapview!ia", name = "q", descriptor = "Ljava/lang/String;")
    private static String field155;

    @OriginalMember(owner = "mapview!ia", name = "r", descriptor = "Ljava/lang/String;")
    public static String field156;

    @OriginalMember(owner = "mapview!ia", name = "k", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field149;

    @OriginalMember(owner = "mapview!ia", name = "m", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field151;

    @OriginalMember(owner = "mapview!ia", name = "n", descriptor = "[Lta;")
    public class37[] field152;

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "(IB)Lha;", line = 8)
    public final class15 method81(int arg0, byte arg1) {
        int var3 = 96 % ((27 - arg1) / 60);
        return this.method88(3, null, 0, (byte) -120, arg0);
    }

    @OriginalMember(owner = "mapview!ia", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V", line = 485)
    public class17(boolean arg0, Applet arg1, int arg2, String arg3, int arg4) {
        field146 = "Unknown";
        this.field147 = arg1;
        field156 = "1.1";
        try {
            field146 = System.getProperty("java.vendor");
            field156 = System.getProperty("java.version");
        } catch (Exception var15) {
        }
        try {
            field155 = System.getProperty("user.home");
            if (field155 != null) {
                field155 = field155 + "/";
            }
        } catch (Exception var14) {
        }
        if (field155 == null) {
            field155 = "~/";
        }
        try {
            this.field142 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var13) {
        }
        try {
            if (arg1 == null) {
                field149 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field149 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var12) {
        }
        try {
            if (arg1 == null) {
                field151 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field151 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var11) {
        }
        if (arg0) {
            this.method83(arg3, arg2, (byte) 101, arg4);
        }
        this.field145 = false;
        this.field148 = new Thread(this);
        this.field148.setPriority(10);
        this.field148.setDaemon(true);
        this.field148.start();
    }

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "(ILjava/net/URL;)Lha;", line = 33)
    public final class15 method82(int arg0, URL arg1) {
        if (arg0 != 9) {
            this.method84(false, -60, null);
        }
        return this.method88(4, arg1, 0, (byte) -115, 0);
    }

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "(Ljava/lang/String;IBI)V", line = 45)
    private final void method83(String arg0, int arg1, byte arg2, int arg3) {
        int var5 = -25 % ((-arg2 - 52) / 60);
        if (arg1 < 32 || arg1 > 34) {
            arg1 = 32;
        }
        String[] var6 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field155, "/tmp/", "" };
        String[] var7 = new String[] { ".jagex_cache_" + arg1, ".file_store_" + arg1 };
        for (int var8 = 0; var8 < 2; var8++) {
            for (int var9 = 0; var9 < var7.length; var9++) {
                for (int var10 = 0; var10 < var6.length; var10++) {
                    try {
                        String var11 = var6[var10];
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
                        if (this.field150 == null) {
                            try {
                                File var14 = new File(var12, "random.dat");
                                if (var8 == 1 || var14.exists()) {
                                    this.field150 = new class37(var14, "rw", 25L);
                                }
                            } catch (Exception var26) {
                                this.field150 = null;
                            }
                        }
                        if (this.field154 == null) {
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
                                this.field153 = new class37(var18, "rw", 52428800L);
                                this.field152 = new class37[arg3];
                                for (int var19 = 0; var19 < arg3; var19++) {
                                    this.field152[var19] = new class37(new File(var16, "main_file_cache.idx" + var19), "rw", 1048576L);
                                }
                                this.field140 = new class37(new File(var16, "main_file_cache.idx255"), "rw", 1048576L);
                                this.field141 = this.field154 = var16;
                            } catch (Exception var25) {
                                try {
                                    this.field153.method234((byte) 121);
                                    for (int var21 = 0; var21 < arg3; var21++) {
                                        this.field152[var21].method234((byte) 121);
                                    }
                                    this.field140.method234((byte) 121);
                                } catch (Exception var24) {
                                }
                                this.field152 = null;
                                this.field153 = this.field140 = null;
                                this.field141 = this.field154 = null;
                            }
                        }
                    } catch (Exception var27) {
                    }
                    if (this.field150 != null && this.field154 != null) {
                        return;
                    }
                }
            }
        }
        if (this.field154 == null) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "(ZILjava/lang/Runnable;)Lha;", line = 215)
    public final class15 method84(boolean arg0, int arg1, Runnable arg2) {
        if (!arg0) {
            this.field141 = null;
        }
        return this.method88(2, arg2, 0, (byte) -111, arg1);
    }

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "(Ljava/lang/Class;ILjava/lang/String;)Lha;", line = 226)
    public final class15 method85(Class arg0, int arg1, String arg2) {
        int var4 = 62 / ((arg1 - 48) / 63);
        return this.method88(9, new Object[] { arg0, arg2 }, 0, (byte) -128, 0);
    }

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "(B)V", line = 258)
    public final void method86(byte arg0) {
        synchronized (this) {
            this.field145 = true;
            this.notifyAll();
        }
        if (arg0 > -88) {
            return;
        }
        try {
            this.field148.join();
        } catch (InterruptedException var14) {
        }
        if (this.field153 != null) {
            try {
                this.field153.method234((byte) 121);
            } catch (IOException var13) {
            }
        }
        if (this.field140 != null) {
            try {
                this.field140.method234((byte) 121);
            } catch (IOException var12) {
            }
        }
        if (this.field152 != null) {
            for (int var7 = 0; var7 < this.field152.length; var7++) {
                if (this.field152[var7] != null) {
                    try {
                        this.field152[var7].method234((byte) 121);
                    } catch (IOException var11) {
                    }
                }
            }
        }
        if (this.field150 != null) {
            try {
                this.field150.method234((byte) 121);
            } catch (IOException var10) {
            }
        }
    }

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "(BILjava/lang/String;)Lha;", line = 316)
    public final class15 method87(byte arg0, int arg1, String arg2) {
        if (arg0 != 32) {
            this.field150 = null;
        }
        return this.method88(1, arg2, 0, (byte) -124, arg1);
    }

    @OriginalMember(owner = "mapview!ia", name = "run", descriptor = "()V", line = 343)
    public final void run() {
        while (true) {
            class15 var2;
            synchronized (this) {
                while (true) {
                    if (this.field145) {
                        return;
                    }
                    if (this.field143 != null) {
                        var2 = this.field143;
                        this.field143 = this.field143.field132;
                        if (this.field143 == null) {
                            this.field139 = null;
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
                int var5 = var2.field134;
                if (var5 == 1) {
                    var2.field135 = new Socket(InetAddress.getByName((String) var2.field133), var2.field137);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field133);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field137);
                    var2.field135 = var6;
                } else if (var5 == 4) {
                    var2.field135 = new DataInputStream(((URL) var2.field133).openStream());
                } else if (var5 == 8) {
                    Object[] var8 = (Object[]) var2.field133;
                    var2.field135 = ((Class) var8[0]).getDeclaredMethod((String) var8[1], (Class[]) var8[2]);
                } else if (var5 == 9) {
                    Object[] var7 = (Object[]) var2.field133;
                    var2.field135 = ((Class) var7[0]).getDeclaredField((String) var7[1]);
                } else {
                    throw new Exception();
                }
                var2.field136 = 1;
            } catch (ThreadDeath var11) {
                throw var11;
            } catch (Throwable var12) {
                var2.field136 = 2;
            }
        }
    }

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "(ILjava/lang/Object;IBI)Lha;", line = 438)
    private final class15 method88(int arg0, Object arg1, int arg2, byte arg3, int arg4) {
        class15 var6 = new class15();
        if (arg3 > -110) {
            field144 = 34;
        }
        var6.field137 = arg4;
        var6.field134 = arg0;
        var6.field133 = arg1;
        synchronized (this) {
            if (this.field139 == null) {
                this.field139 = this.field143 = var6;
            } else {
                this.field139.field132 = var6;
                this.field139 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "([Ljava/lang/Class;Ljava/lang/Class;ILjava/lang/String;)Lha;", line = 467)
    public final class15 method89(Class[] arg0, Class arg1, int arg2, String arg3) {
        return arg2 <= 8 ? (class15) null : this.method88(8, new Object[] { arg1, arg3, arg0 }, 0, (byte) -117, 0);
    }
}
