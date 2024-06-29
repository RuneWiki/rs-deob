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

@OriginalClass("client!hf")
public class class83 implements Runnable {

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "Ljava/io/File;")
    private File field1391 = null;

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "Lla;")
    private class120 field1389 = null;

    @OriginalMember(owner = "client!hf", name = "j", descriptor = "Ljava/io/File;")
    public File field1396 = null;

    @OriginalMember(owner = "client!hf", name = "i", descriptor = "Z")
    private boolean field1395 = false;

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "Lri;")
    public class193 field1388 = null;

    @OriginalMember(owner = "client!hf", name = "k", descriptor = "Lla;")
    private class120 field1397 = null;

    @OriginalMember(owner = "client!hf", name = "p", descriptor = "Lri;")
    public class193 field1402 = null;

    @OriginalMember(owner = "client!hf", name = "s", descriptor = "Ljava/applet/Applet;")
    public Applet field1405 = null;

    @OriginalMember(owner = "client!hf", name = "q", descriptor = "Lri;")
    public class193 field1403 = null;

    @OriginalMember(owner = "client!hf", name = "o", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field1401;

    @OriginalMember(owner = "client!hf", name = "h", descriptor = "Ljava/lang/Thread;")
    private Thread field1394;

    @OriginalMember(owner = "client!hf", name = "l", descriptor = "I")
    public static int field1398 = 3;

    @OriginalMember(owner = "client!hf", name = "n", descriptor = "Lcf;")
    private class29 field1400;

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "Ljava/lang/String;")
    public static String field1390;

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "Ljava/lang/String;")
    private static String field1392;

    @OriginalMember(owner = "client!hf", name = "r", descriptor = "Ljava/lang/String;")
    public static String field1404;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field1387;

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field1393;

    @OriginalMember(owner = "client!hf", name = "m", descriptor = "[Lri;")
    public class193[] field1399;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)V")
    public final void method504(int arg0) {
        synchronized (this) {
            this.field1395 = true;
            this.notifyAll();
        }
        try {
            if (arg0 < 2) {
                this.method507(-108, null, (byte) -65);
            }
            this.field1394.join();
        } catch (InterruptedException var8) {
        }
        if (this.field1388 != null) {
            try {
                this.field1388.method1230((byte) -83);
            } catch (IOException var7) {
            }
        }
        if (this.field1402 != null) {
            try {
                this.field1402.method1230((byte) -48);
            } catch (IOException var6) {
            }
        }
        if (this.field1399 != null) {
            for (int var3 = 0; var3 < this.field1399.length; var3++) {
                if (this.field1399[var3] != null) {
                    try {
                        this.field1399[var3].method1230((byte) -103);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field1403 != null) {
            try {
                this.field1403.method1230((byte) -91);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!hf", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class120 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1395) {
                        return;
                    }
                    if (this.field1389 != null) {
                        var2 = this.field1389;
                        this.field1389 = this.field1389.field2268;
                        if (this.field1389 == null) {
                            this.field1397 = null;
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
                int var3 = var2.field2267;
                if (var3 == 1) {
                    var2.field2269 = new Socket(InetAddress.getByName((String) var2.field2266), var2.field2265);
                } else if (var3 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2266);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2265);
                    var2.field2269 = var6;
                } else if (var3 == 4) {
                    var2.field2269 = new DataInputStream(((URL) var2.field2266).openStream());
                } else if (var3 == 8) {
                    Object[] var4 = (Object[]) var2.field2266;
                    var2.field2269 = ((Class) var4[0]).getDeclaredMethod((String) var4[1], (Class[]) var4[2]);
                } else if (var3 == 9) {
                    Object[] var5 = (Object[]) var2.field2266;
                    var2.field2269 = ((Class) var5[0]).getDeclaredField((String) var5[1]);
                } else {
                    throw new Exception();
                }
                var2.field2264 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field2264 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Ljava/lang/Runnable;II)Lla;")
    public final class120 method505(Runnable arg0, int arg1, int arg2) {
        if (arg2 != -4263) {
            this.method510(null, null, null, (byte) -11);
        }
        return this.method512(2, 0, arg1, arg0, -125);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IB)Lla;")
    public final class120 method506(int arg0, byte arg1) {
        return arg1 >= -25 ? null : this.method512(3, 0, arg0, null, -22);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILjava/lang/String;B)Lla;")
    public final class120 method507(int arg0, String arg1, byte arg2) {
        if (arg2 >= -60) {
            this.field1396 = null;
        }
        return this.method512(1, 0, arg0, arg1, -128);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(B)Lcf;")
    public final class29 method508(byte arg0) {
        int var2 = -57 / ((arg0 + 18) / 55);
        return this.field1400;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Ljava/lang/Class;BLjava/lang/String;)Lla;")
    public final class120 method509(Class arg0, byte arg1, String arg2) {
        if (arg1 > -4) {
            this.method506(0, (byte) -22);
        }
        return this.method512(9, 0, 0, new Object[] { arg0, arg2 }, -125);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Ljava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;B)Lla;")
    public final class120 method510(String arg0, Class[] arg1, Class arg2, byte arg3) {
        if (arg3 > -104) {
            this.method508((byte) 114);
        }
        return this.method512(8, 0, 0, new Object[] { arg2, arg0, arg1 }, -127);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILjava/lang/String;II)V")
    private final void method511(int arg0, String arg1, int arg2, int arg3) {
        if (arg3 < 32 || arg3 > 34) {
            arg3 = 32;
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field1392, "/tmp/", "" };
        String[] var6 = new String[] { ".jagex_cache_" + arg3, ".file_store_" + arg3 };
        for (int var7 = arg2; var7 < 2; var7++) {
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
                        if (this.field1403 == null) {
                            try {
                                File var13 = new File(var11, "random.dat");
                                if (var7 == 1 || var13.exists()) {
                                    this.field1403 = new class193(var13, "rw", 25L);
                                }
                            } catch (Exception var21) {
                                this.field1403 = null;
                            }
                        }
                        if (this.field1391 == null) {
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
                                this.field1388 = new class193(var16, "rw", 104857600L);
                                this.field1399 = new class193[arg0];
                                for (int var17 = 0; var17 < arg0; var17++) {
                                    this.field1399[var17] = new class193(new File(var14, "main_file_cache.idx" + var17), "rw", 1048576L);
                                }
                                this.field1402 = new class193(new File(var14, "main_file_cache.idx255"), "rw", 1048576L);
                                this.field1396 = this.field1391 = var14;
                            } catch (Exception var20) {
                                try {
                                    this.field1388.method1230((byte) -80);
                                    for (int var18 = 0; var18 < arg0; var18++) {
                                        this.field1399[var18].method1230((byte) -126);
                                    }
                                    this.field1402.method1230((byte) -81);
                                } catch (Exception var19) {
                                }
                                this.field1396 = this.field1391 = null;
                                this.field1388 = this.field1402 = null;
                                this.field1399 = null;
                            }
                        }
                    } catch (Exception var22) {
                    }
                    if (this.field1403 != null && this.field1391 != null) {
                        return;
                    }
                }
            }
        }
        if (this.field1391 == null) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIILjava/lang/Object;I)Lla;")
    private final class120 method512(int arg0, int arg1, int arg2, Object arg3, int arg4) {
        class120 var6 = new class120();
        var6.field2266 = arg3;
        var6.field2265 = arg2;
        var6.field2267 = arg0;
        synchronized (this) {
            if (this.field1397 == null) {
                this.field1397 = this.field1389 = var6;
            } else {
                this.field1397.field2268 = var6;
                this.field1397 = var6;
            }
            this.notify();
        }
        int var8 = -68 / ((-arg4 - 89) / 33);
        return var6;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Ljava/net/URL;I)Lla;")
    public final class120 method513(URL arg0, int arg1) {
        return arg1 == 0 ? this.method512(4, 0, 0, arg0, arg1 ^ 0xFFFFFFD3) : null;
    }

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
    public class83(boolean arg0, Applet arg1, int arg2, String arg3, int arg4) {
        field1404 = "Unknown";
        field1390 = "1.1";
        this.field1405 = arg1;
        try {
            field1404 = System.getProperty("java.vendor");
            field1390 = System.getProperty("java.version");
        } catch (Exception var10) {
        }
        try {
            field1392 = System.getProperty("user.home");
            if (field1392 != null) {
                field1392 = field1392 + "/";
            }
        } catch (Exception var9) {
        }
        if (field1392 == null) {
            field1392 = "~/";
        }
        try {
            this.field1401 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var8) {
        }
        try {
            if (arg1 == null) {
                field1387 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field1387 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var7) {
        }
        try {
            if (arg1 == null) {
                field1393 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field1393 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        if (arg0) {
            this.method511(arg4, arg3, 0, arg2);
        }
        this.field1395 = false;
        this.field1394 = new Thread(this);
        this.field1394.setPriority(10);
        this.field1394.setDaemon(true);
        this.field1394.start();
    }
}
