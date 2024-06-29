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

@OriginalClass("mapview!j")
public class class17 implements Runnable {

    @OriginalMember(owner = "mapview!j", name = "f", descriptor = "Lra;")
    public class33 field175 = null;

    @OriginalMember(owner = "mapview!j", name = "b", descriptor = "Ljava/io/File;")
    private File field171 = null;

    @OriginalMember(owner = "mapview!j", name = "d", descriptor = "Lga;")
    private class13 field173 = null;

    @OriginalMember(owner = "mapview!j", name = "m", descriptor = "Ljava/io/File;")
    public File field182 = null;

    @OriginalMember(owner = "mapview!j", name = "o", descriptor = "Lga;")
    private class13 field184 = null;

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "Ljava/applet/Applet;")
    public Applet field170 = null;

    @OriginalMember(owner = "mapview!j", name = "n", descriptor = "Lra;")
    public class33 field183 = null;

    @OriginalMember(owner = "mapview!j", name = "q", descriptor = "Z")
    private boolean field186 = false;

    @OriginalMember(owner = "mapview!j", name = "r", descriptor = "Lra;")
    public class33 field187 = null;

    @OriginalMember(owner = "mapview!j", name = "e", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field174;

    @OriginalMember(owner = "mapview!j", name = "l", descriptor = "Ljava/lang/Thread;")
    private Thread field181;

    @OriginalMember(owner = "mapview!j", name = "p", descriptor = "I")
    public static int field185 = 3;

    @OriginalMember(owner = "mapview!j", name = "c", descriptor = "Ljava/lang/String;")
    private static String field172;

    @OriginalMember(owner = "mapview!j", name = "g", descriptor = "Ljava/lang/String;")
    public static String field176;

    @OriginalMember(owner = "mapview!j", name = "j", descriptor = "Ljava/lang/String;")
    public static String field179;

    @OriginalMember(owner = "mapview!j", name = "h", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field177;

    @OriginalMember(owner = "mapview!j", name = "k", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field180;

    @OriginalMember(owner = "mapview!j", name = "i", descriptor = "[Lra;")
    public class33[] field178;

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "(IB)Lga;", line = 11)
    public final class13 method88(int arg0, byte arg1) {
        if (arg1 != -97) {
            this.run();
        }
        return this.method90(6, 0, 3, arg0, null);
    }

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "(ILjava/lang/Runnable;B)Lga;", line = 33)
    public final class13 method89(int arg0, Runnable arg1, byte arg2) {
        int var4 = -109 / ((arg2 - 57) / 62);
        return this.method90(6, 0, 2, arg0, arg1);
    }

    @OriginalMember(owner = "mapview!j", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V", line = 479)
    public class17(boolean arg0, Applet arg1, int arg2, String arg3, int arg4) {
        field179 = "1.1";
        field176 = "Unknown";
        this.field170 = arg1;
        try {
            field176 = System.getProperty("java.vendor");
            field179 = System.getProperty("java.version");
        } catch (Exception var15) {
        }
        try {
            field172 = System.getProperty("user.home");
            if (field172 != null) {
                field172 = field172 + "/";
            }
        } catch (Exception var14) {
        }
        if (field172 == null) {
            field172 = "~/";
        }
        try {
            this.field174 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var13) {
        }
        try {
            if (arg1 == null) {
                field180 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field180 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var12) {
        }
        try {
            if (arg1 == null) {
                field177 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field177 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var11) {
        }
        if (arg0) {
            this.method96(arg3, arg4, -114, arg2);
        }
        this.field186 = false;
        this.field181 = new Thread(this);
        this.field181.setPriority(10);
        this.field181.setDaemon(true);
        this.field181.start();
    }

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "(IIIILjava/lang/Object;)Lga;", line = 48)
    private final class13 method90(int arg0, int arg1, int arg2, int arg3, Object arg4) {
        class13 var6 = new class13();
        var6.field135 = arg2;
        var6.field133 = arg3;
        var6.field134 = arg4;
        synchronized (this) {
            if (this.field173 == null) {
                this.field173 = this.field184 = var6;
            } else {
                this.field173.field132 = var6;
                this.field173 = var6;
            }
            this.notify();
        }
        if (arg0 != 6) {
            this.method92((byte) -122, null, -33);
        }
        return var6;
    }

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "(I)V", line = 78)
    public final void method91(int arg0) {
        int var2 = 57 % ((-arg0 - 62) / 41);
        synchronized (this) {
            this.field186 = true;
            this.notifyAll();
        }
        try {
            this.field181.join();
        } catch (InterruptedException var15) {
        }
        if (this.field187 != null) {
            try {
                this.field187.method205((byte) -127);
            } catch (IOException var14) {
            }
        }
        if (this.field175 != null) {
            try {
                this.field175.method205((byte) 68);
            } catch (IOException var13) {
            }
        }
        if (this.field178 != null) {
            for (int var8 = 0; var8 < this.field178.length; var8++) {
                if (this.field178[var8] != null) {
                    try {
                        this.field178[var8].method205((byte) -122);
                    } catch (IOException var12) {
                    }
                }
            }
        }
        if (this.field183 != null) {
            try {
                this.field183.method205((byte) 38);
            } catch (IOException var11) {
            }
        }
    }

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "(BLjava/lang/String;I)Lga;", line = 132)
    public final class13 method92(byte arg0, String arg1, int arg2) {
        return arg0 == 68 ? this.method90(6, 0, 1, arg2, arg1) : (class13) null;
    }

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;I)Lga;", line = 150)
    public final class13 method93(Class arg0, String arg1, Class[] arg2, int arg3) {
        if (arg3 >= -99) {
            field180 = null;
        }
        return this.method90(6, 0, 8, 0, new Object[] { arg0, arg1, arg2 });
    }

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "(ILjava/net/URL;)Lga;", line = 175)
    public final class13 method94(int arg0, URL arg1) {
        if (arg0 != -12899) {
            this.method96(null, 89, 45, -110);
        }
        return this.method90(6, 0, 4, 0, arg1);
    }

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;Z)Lga;", line = 186)
    public final class13 method95(Class arg0, String arg1, boolean arg2) {
        return arg2 ? (class13) null : this.method90(6, 0, 9, 0, new Object[] { arg0, arg1 });
    }

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "(Ljava/lang/String;III)V", line = 200)
    private final void method96(String arg0, int arg1, int arg2, int arg3) {
        if (arg3 < 32 || arg3 > 34) {
            arg3 = 32;
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field172, "/tmp/", "" };
        String[] var6 = new String[] { ".jagex_cache_" + arg3, ".file_store_" + arg3 };
        int var7 = -99 % ((arg2 + 47) / 47);
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
                        if (this.field183 == null) {
                            try {
                                File var14 = new File(var12, "random.dat");
                                if (var8 == 1 || var14.exists()) {
                                    this.field183 = new class33(var14, "rw", 25L);
                                }
                            } catch (Exception var26) {
                                this.field183 = null;
                            }
                        }
                        if (this.field171 == null) {
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
                                this.field187 = new class33(var18, "rw", 104857600L);
                                this.field178 = new class33[arg1];
                                for (int var19 = 0; var19 < arg1; var19++) {
                                    this.field178[var19] = new class33(new File(var16, "main_file_cache.idx" + var19), "rw", 1048576L);
                                }
                                this.field175 = new class33(new File(var16, "main_file_cache.idx255"), "rw", 1048576L);
                                this.field182 = this.field171 = var16;
                            } catch (Exception var25) {
                                try {
                                    this.field187.method205((byte) -121);
                                    for (int var21 = 0; var21 < arg1; var21++) {
                                        this.field178[var21].method205((byte) 125);
                                    }
                                    this.field175.method205((byte) 55);
                                } catch (Exception var24) {
                                }
                                this.field182 = this.field171 = null;
                                this.field187 = this.field175 = null;
                                this.field178 = null;
                            }
                        }
                    } catch (Exception var27) {
                    }
                    if (this.field183 != null && this.field171 != null) {
                        return;
                    }
                }
            }
        }
        if (this.field171 == null) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "mapview!j", name = "run", descriptor = "()V", line = 371)
    public final void run() {
        while (true) {
            class13 var2;
            synchronized (this) {
                while (true) {
                    if (this.field186) {
                        return;
                    }
                    if (this.field184 != null) {
                        var2 = this.field184;
                        this.field184 = this.field184.field132;
                        if (this.field184 == null) {
                            this.field173 = null;
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
                int var5 = var2.field135;
                if (var5 == 1) {
                    var2.field136 = new Socket(InetAddress.getByName((String) var2.field134), var2.field133);
                } else if (var5 == 2) {
                    Thread var8 = new Thread((Runnable) var2.field134);
                    var8.setDaemon(true);
                    var8.start();
                    var8.setPriority(var2.field133);
                    var2.field136 = var8;
                } else if (var5 == 4) {
                    var2.field136 = new DataInputStream(((URL) var2.field134).openStream());
                } else if (var5 == 8) {
                    Object[] var6 = (Object[]) var2.field134;
                    var2.field136 = ((Class) var6[0]).getDeclaredMethod((String) var6[1], (Class[]) var6[2]);
                } else if (var5 == 9) {
                    Object[] var7 = (Object[]) var2.field134;
                    var2.field136 = ((Class) var7[0]).getDeclaredField((String) var7[1]);
                } else {
                    throw new Exception();
                }
                var2.field137 = 1;
            } catch (ThreadDeath var11) {
                throw var11;
            } catch (Throwable var12) {
                var2.field137 = 2;
            }
        }
    }
}
