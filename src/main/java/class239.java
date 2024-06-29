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

@OriginalClass("client!th")
public class class239 implements Runnable {

    @OriginalMember(owner = "client!th", name = "h", descriptor = "Ljava/applet/Applet;")
    public Applet field4153 = null;

    @OriginalMember(owner = "client!th", name = "l", descriptor = "Luj;")
    public class137 field4157 = null;

    @OriginalMember(owner = "client!th", name = "b", descriptor = "Z")
    private boolean field4147 = false;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "Ljava/io/File;")
    private File field4146 = null;

    @OriginalMember(owner = "client!th", name = "m", descriptor = "Lbe;")
    private class74 field4158 = null;

    @OriginalMember(owner = "client!th", name = "w", descriptor = "Luj;")
    public class137 field4168 = null;

    @OriginalMember(owner = "client!th", name = "e", descriptor = "Luj;")
    public class137 field4150 = null;

    @OriginalMember(owner = "client!th", name = "v", descriptor = "Lbe;")
    private class74 field4167 = null;

    @OriginalMember(owner = "client!th", name = "i", descriptor = "Ljava/io/File;")
    public File field4154 = null;

    @OriginalMember(owner = "client!th", name = "q", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field4162;

    @OriginalMember(owner = "client!th", name = "c", descriptor = "Ljava/lang/Thread;")
    private Thread field4148;

    @OriginalMember(owner = "client!th", name = "d", descriptor = "I")
    public static int field4149 = 3;

    @OriginalMember(owner = "client!th", name = "s", descriptor = "Lje;")
    private class136 field4164;

    @OriginalMember(owner = "client!th", name = "f", descriptor = "Ljava/lang/String;")
    public static String field4151;

    @OriginalMember(owner = "client!th", name = "g", descriptor = "Ljava/lang/String;")
    public static String field4152;

    @OriginalMember(owner = "client!th", name = "n", descriptor = "Ljava/lang/String;")
    public static String field4159;

    @OriginalMember(owner = "client!th", name = "o", descriptor = "Ljava/lang/String;")
    public static String field4160;

    @OriginalMember(owner = "client!th", name = "p", descriptor = "Ljava/lang/String;")
    private static String field4161;

    @OriginalMember(owner = "client!th", name = "r", descriptor = "Ljava/lang/String;")
    public static String field4163;

    @OriginalMember(owner = "client!th", name = "u", descriptor = "Ljava/lang/String;")
    public static String field4166;

    @OriginalMember(owner = "client!th", name = "j", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field4155;

    @OriginalMember(owner = "client!th", name = "k", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field4156;

    @OriginalMember(owner = "client!th", name = "t", descriptor = "[Luj;")
    public class137[] field4165;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(BI)Lbe;")
    public final class74 method1590(byte arg0, int arg1) {
        if (arg0 != -43) {
            this.method1591(-77, (Object) null, -65, 19, 29);
        }
        return this.method1591(3, (Object) null, arg1, 0, 0);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ILjava/lang/Object;III)Lbe;")
    private final class74 method1591(int arg0, Object arg1, int arg2, int arg3, int arg4) {
        class74 var6 = new class74();
        var6.field1301 = arg1;
        if (arg4 != 0) {
            return null;
        }
        var6.field1304 = arg0;
        var6.field1300 = arg2;
        synchronized (this) {
            if (this.field4167 == null) {
                this.field4167 = this.field4158 = var6;
            } else {
                this.field4167.field1303 = var6;
                this.field4167 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ILjava/lang/String;IB)V")
    private final void method1592(int arg0, String arg1, int arg2, byte arg3) {
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field4161, "/tmp/", "" };
        if (arg0 < 32 || arg0 > 34) {
            arg0 = 32;
        }
        String[] var6 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
        int var7 = 0;
        if (arg3 != 113) {
            this.method1600((byte) -33, (Class) null, (String) null);
        }
        while (var7 < 2) {
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
                        if (this.field4150 == null) {
                            try {
                                File var13 = new File(var11, "random.dat");
                                if (var7 == 1 || var13.exists()) {
                                    this.field4150 = new class137(var13, "rw", 25L);
                                }
                            } catch (Exception var21) {
                                this.field4150 = null;
                            }
                        }
                        if (this.field4146 == null) {
                            try {
                                File var14 = new File(var11, arg1);
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
                                this.field4157 = new class137(var16, "rw", 104857600L);
                                this.field4165 = new class137[arg2];
                                for (int var17 = 0; var17 < arg2; var17++) {
                                    this.field4165[var17] = new class137(new File(var14, "main_file_cache.idx" + var17), "rw", 1048576L);
                                }
                                this.field4168 = new class137(new File(var14, "main_file_cache.idx255"), "rw", 1048576L);
                                this.field4154 = this.field4146 = var14;
                            } catch (Exception var20) {
                                try {
                                    this.field4157.method856((byte) -122);
                                    for (int var18 = 0; var18 < arg2; var18++) {
                                        this.field4165[var18].method856((byte) -128);
                                    }
                                    this.field4168.method856((byte) -116);
                                } catch (Exception var19) {
                                }
                                this.field4154 = this.field4146 = null;
                                this.field4165 = null;
                                this.field4157 = this.field4168 = null;
                            }
                        }
                    } catch (Exception var22) {
                    }
                    if (this.field4150 != null && this.field4146 != null) {
                        return;
                    }
                }
            }
            var7++;
        }
        if (this.field4146 == null) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ILjava/lang/Class;)Lbe;")
    public final class74 method1593(int arg0, Class arg1) {
        if (arg0 != 0) {
            this.field4162 = null;
        }
        return this.method1591(11, arg1, 0, 0, 0);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(I)V")
    public final void method1594(int arg0) {
        synchronized (this) {
            this.field4147 = true;
            if (arg0 < 92) {
                return;
            }
            this.notifyAll();
        }
        try {
            this.field4148.join();
        } catch (InterruptedException var10) {
        }
        if (this.field4157 != null) {
            try {
                this.field4157.method856((byte) -121);
            } catch (IOException var9) {
            }
        }
        if (this.field4168 != null) {
            try {
                this.field4168.method856((byte) -118);
            } catch (IOException var8) {
            }
        }
        if (this.field4165 != null) {
            for (int var3 = 0; var3 < this.field4165.length; var3++) {
                if (this.field4165[var3] != null) {
                    try {
                        this.field4165[var3].method856((byte) -114);
                    } catch (IOException var7) {
                    }
                }
            }
        }
        if (this.field4150 != null) {
            try {
                this.field4150.method856((byte) -114);
            } catch (IOException var6) {
            }
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "([Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;I)Lbe;")
    public final class74 method1595(Class[] arg0, Class arg1, String arg2, int arg3) {
        if (arg3 != 0) {
            this.method1593(49, (Class) null);
        }
        return this.method1591(8, new Object[] { arg1, arg2, arg0 }, 0, 0, 0);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IILjava/lang/Runnable;)Lbe;")
    public final class74 method1596(int arg0, int arg1, Runnable arg2) {
        if (arg1 != 0) {
            this.method1597((Class) null, -19);
        }
        return this.method1591(2, arg2, arg0, 0, 0);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Ljava/lang/Class;I)Lbe;")
    public final class74 method1597(Class arg0, int arg1) {
        if (arg1 != 13) {
            field4152 = null;
        }
        return this.method1591(13, arg0, 0, 0, 0);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(BLjava/lang/String;)Lbe;")
    public final class74 method1598(byte arg0, String arg1) {
        return arg0 <= 4 ? null : this.method1591(12, arg1, 0, 0, 0);
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(I)Lje;")
    public final class136 method1599(int arg0) {
        if (arg0 != 0) {
            this.field4147 = true;
        }
        return this.field4164;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(BLjava/lang/Class;Ljava/lang/String;)Lbe;")
    public final class74 method1600(byte arg0, Class arg1, String arg2) {
        if (arg0 < 82) {
            this.method1601((byte) 50, (URL) null);
        }
        return this.method1591(9, new Object[] { arg1, arg2 }, 0, 0, 0);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(BLjava/net/URL;)Lbe;")
    public final class74 method1601(byte arg0, URL arg1) {
        if (arg0 != -9) {
            field4160 = null;
        }
        return this.method1591(4, arg1, 0, 0, 0);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IZLjava/lang/String;)Lbe;")
    public final class74 method1602(int arg0, boolean arg1, String arg2) {
        if (arg1) {
            field4163 = null;
        }
        return this.method1591(1, arg2, arg0, 0, 0);
    }

    @OriginalMember(owner = "client!th", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class74 var2;
            synchronized (this) {
                while (true) {
                    if (this.field4147) {
                        return;
                    }
                    if (this.field4158 != null) {
                        var2 = this.field4158;
                        this.field4158 = this.field4158.field1303;
                        if (this.field4158 == null) {
                            this.field4167 = null;
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
                int var3 = var2.field1304;
                if (var3 == 1) {
                    var2.field1299 = new Socket(InetAddress.getByName((String) var2.field1301), var2.field1300);
                } else if (var3 == 2) {
                    Thread var4 = new Thread((Runnable) var2.field1301);
                    var4.setDaemon(true);
                    var4.start();
                    var4.setPriority(var2.field1300);
                    var2.field1299 = var4;
                } else if (var3 == 4) {
                    var2.field1299 = new DataInputStream(((URL) var2.field1301).openStream());
                } else if (var3 == 8) {
                    Object[] var5 = (Object[]) var2.field1301;
                    var2.field1299 = ((Class) var5[0]).getDeclaredMethod((String) var5[1], (Class[]) var5[2]);
                } else if (var3 == 9) {
                    Object[] var6 = (Object[]) var2.field1301;
                    var2.field1299 = ((Class) var6[0]).getDeclaredField((String) var6[1]);
                } else {
                    throw new Exception();
                }
                var2.field1302 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field1302 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
    public class239(boolean arg0, Applet arg1, int arg2, String arg3, int arg4) {
        field4152 = "1.1";
        this.field4153 = arg1;
        field4166 = "Unknown";
        try {
            field4166 = System.getProperty("java.vendor");
            field4152 = System.getProperty("java.version");
        } catch (Exception var13) {
        }
        try {
            field4160 = System.getProperty("os.name");
        } catch (Exception var12) {
            field4160 = "Unknown";
        }
        field4159 = field4160.toLowerCase();
        try {
            field4151 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var11) {
            field4151 = "";
        }
        try {
            field4163 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var10) {
            field4163 = "";
        }
        try {
            field4161 = System.getProperty("user.home");
            if (field4161 != null) {
                field4161 = field4161 + "/";
            }
        } catch (Exception var9) {
        }
        if (field4161 == null) {
            field4161 = "~/";
        }
        try {
            this.field4162 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var8) {
        }
        try {
            if (arg1 == null) {
                field4156 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field4156 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var7) {
        }
        try {
            if (arg1 == null) {
                field4155 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field4155 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        if (arg0) {
            this.method1592(arg2, arg3, arg4, (byte) 113);
        }
        this.field4147 = false;
        this.field4148 = new Thread(this);
        this.field4148.setPriority(10);
        this.field4148.setDaemon(true);
        this.field4148.start();
    }
}
