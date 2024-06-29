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

@OriginalClass("client!sd")
public class class42 implements Runnable {

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "Lib;")
    public class150 field596 = null;

    @OriginalMember(owner = "client!sd", name = "k", descriptor = "Lib;")
    public class150 field599 = null;

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "Lue;")
    private class86 field590 = null;

    @OriginalMember(owner = "client!sd", name = "o", descriptor = "Z")
    private boolean field603 = false;

    @OriginalMember(owner = "client!sd", name = "m", descriptor = "Ljava/applet/Applet;")
    public Applet field601 = null;

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "Lue;")
    private class86 field593 = null;

    @OriginalMember(owner = "client!sd", name = "w", descriptor = "Lib;")
    public class150 field611 = null;

    @OriginalMember(owner = "client!sd", name = "l", descriptor = "I")
    private int field600;

    @OriginalMember(owner = "client!sd", name = "v", descriptor = "Ljava/lang/String;")
    private String field610;

    @OriginalMember(owner = "client!sd", name = "j", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field598;

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "[Lib;")
    public class150[] field595;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "Ljava/lang/Thread;")
    private Thread field589;

    @OriginalMember(owner = "client!sd", name = "i", descriptor = "I")
    public static int field597 = 3;

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "Ljava/util/Hashtable;")
    private static Hashtable field592 = new Hashtable(16);

    @OriginalMember(owner = "client!sd", name = "q", descriptor = "Lgg;")
    private class187 field605;

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "Ljava/lang/String;")
    public static String field591;

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "Ljava/lang/String;")
    public static String field594;

    @OriginalMember(owner = "client!sd", name = "n", descriptor = "Ljava/lang/String;")
    private static String field602;

    @OriginalMember(owner = "client!sd", name = "p", descriptor = "Ljava/lang/String;")
    public static String field604;

    @OriginalMember(owner = "client!sd", name = "r", descriptor = "Ljava/lang/String;")
    public static String field606;

    @OriginalMember(owner = "client!sd", name = "s", descriptor = "Ljava/lang/String;")
    public static String field607;

    @OriginalMember(owner = "client!sd", name = "t", descriptor = "Ljava/lang/String;")
    public static String field608;

    @OriginalMember(owner = "client!sd", name = "u", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field609;

    @OriginalMember(owner = "client!sd", name = "x", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field612;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(B)Lgg;")
    public final class187 method229(byte arg0) {
        int var2 = 78 / ((arg0 + 16) / 34);
        return this.field605;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;)Ljava/io/File;")
    private static final File method230(int arg0, int arg1, String arg2, String arg3) {
        if (arg0 != 12) {
            method230(35, 122, (String) null, (String) null);
        }
        File var4 = (File) field592.get(arg3);
        if (var4 != null) {
            return var4;
        }
        String[] var5 = new String[] { ".jagex_cache_" + arg1, ".file_store_" + arg1 };
        String[] var6 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field602, "/tmp/", "" };
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < var5.length; var8++) {
                for (int var9 = 0; var9 < var6.length; var9++) {
                    String var10 = var6[var9] + var5[var8] + "/" + (arg2 == null ? "" : arg2 + "/") + arg3;
                    RandomAccessFile var11 = null;
                    try {
                        File var12 = new File(var10);
                        if (var7 != 0 || var12.exists()) {
                            String var13 = var6[var9];
                            if (var7 != 1 || var13.length() <= 0 || (new File(var13)).exists()) {
                                (new File(var6[var9] + var5[var8])).mkdir();
                                if (arg2 != null) {
                                    (new File(var6[var9] + var5[var8] + "/" + arg2)).mkdir();
                                }
                                var11 = new RandomAccessFile(var12, "rw");
                                int var14 = var11.read();
                                var11.seek(0L);
                                var11.write(var14);
                                var11.seek(0L);
                                var11.close();
                                field592.put(arg3, var12);
                                return var12;
                            }
                        }
                    } catch (Exception var17) {
                        try {
                            if (var11 != null) {
                                var11.close();
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

    @OriginalMember(owner = "client!sd", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class86 var2;
            synchronized (this) {
                while (true) {
                    if (this.field603) {
                        return;
                    }
                    if (this.field593 != null) {
                        var2 = this.field593;
                        this.field593 = this.field593.field1667;
                        if (this.field593 == null) {
                            this.field590 = null;
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
                int var3 = var2.field1664;
                if (var3 == 1) {
                    var2.field1666 = new Socket(InetAddress.getByName((String) var2.field1668), var2.field1665);
                } else if (var3 == 2) {
                    Thread var4 = new Thread((Runnable) var2.field1668);
                    var4.setDaemon(true);
                    var4.start();
                    var4.setPriority(var2.field1665);
                    var2.field1666 = var4;
                } else if (var3 == 4) {
                    var2.field1666 = new DataInputStream(((URL) var2.field1668).openStream());
                } else if (var3 == 8) {
                    Object[] var6 = (Object[]) var2.field1668;
                    var2.field1666 = ((Class) var6[0]).getDeclaredMethod((String) var6[1], (Class[]) var6[2]);
                } else if (var3 == 9) {
                    Object[] var5 = (Object[]) var2.field1668;
                    var2.field1666 = ((Class) var5[0]).getDeclaredField((String) var5[1]);
                } else {
                    throw new Exception();
                }
                var2.field1663 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field1663 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IILjava/lang/String;)Lue;")
    public final class86 method231(int arg0, int arg1, String arg2) {
        if (arg0 != -23790) {
            this.method242(1, 82, (Object) null, 76, 49);
        }
        return this.method242(1, arg0 + 8339, arg2, 0, arg1);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Ljava/lang/Runnable;IB)Lue;")
    public final class86 method232(Runnable arg0, int arg1, byte arg2) {
        return arg2 == 107 ? this.method242(2, arg2 - 15558, arg0, 0, arg1) : null;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(BLjava/lang/String;)Lue;")
    public final class86 method233(byte arg0, String arg1) {
        int var3 = 87 % ((arg0 - 4) / 36);
        return this.method242(12, -15451, arg1, 0, 0);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(II)Lue;")
    public final class86 method234(int arg0, int arg1) {
        if (arg0 != 24728) {
            this.field603 = true;
        }
        return this.method242(3, -15451, (Object) null, 0, arg1);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Ljava/awt/Component;IIZ)Lue;")
    public final class86 method235(Component arg0, int arg1, int arg2, boolean arg3) {
        Point var5 = arg0.getLocationOnScreen();
        if (arg3) {
            method230(58, 106, (String) null, (String) null);
        }
        return this.method242(14, -15451, (Object) null, arg1 + var5.y, var5.x + arg2);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ZLjava/lang/String;)Lue;")
    public final class86 method236(boolean arg0, String arg1) {
        if (arg0) {
            this.method241(19);
        }
        return this.method242(16, -15451, arg1, 0, 0);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(BLjava/lang/Class;Ljava/lang/String;)Lue;")
    public final class86 method237(byte arg0, Class arg1, String arg2) {
        int var4 = 78 % ((arg0 - 88) / 33);
        return this.method242(9, -15451, new Object[] { arg1, arg2 }, 0, 0);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Ljava/net/URL;I)Lue;")
    public final class86 method238(URL arg0, int arg1) {
        if (arg1 != 6330) {
            this.field596 = null;
        }
        return this.method242(4, -15451, arg0, 0, 0);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Ljava/lang/Class;I)Lue;")
    public final class86 method239(Class arg0, int arg1) {
        return arg1 == 21422 ? this.method242(11, -15451, arg0, 0, 0) : null;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ZLjava/awt/Component;I)Lue;")
    public final class86 method240(boolean arg0, Component arg1, int arg2) {
        int var4 = -118 / ((9 - arg2) / 59);
        return this.method242(15, -15451, arg1, 0, arg0 ? 1 : 0);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)V")
    public final void method241(int arg0) {
        synchronized (this) {
            this.field603 = true;
            this.notifyAll();
        }
        try {
            this.field589.join();
        } catch (InterruptedException var8) {
        }
        if (this.field599 != null) {
            try {
                this.field599.method1129(1);
            } catch (IOException var7) {
            }
        }
        if (this.field596 != null) {
            try {
                this.field596.method1129(1);
            } catch (IOException var6) {
            }
        }
        if (this.field595 != null) {
            for (int var3 = 0; var3 < this.field595.length; var3++) {
                if (this.field595[var3] != null) {
                    try {
                        this.field595[var3].method1129(arg0 ^ 0x1);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field611 != null) {
            try {
                this.field611.method1129(arg0 ^ 0x1);
            } catch (IOException var4) {
            }
        }
        if (arg0 != 0) {
            this.method231(-11, 68, (String) null);
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IILjava/lang/Object;II)Lue;")
    private final class86 method242(int arg0, int arg1, Object arg2, int arg3, int arg4) {
        if (arg1 != -15451) {
            this.method238((URL) null, -11);
        }
        class86 var6 = new class86();
        var6.field1664 = arg0;
        var6.field1665 = arg4;
        var6.field1668 = arg2;
        synchronized (this) {
            if (this.field590 == null) {
                this.field590 = this.field593 = var6;
            } else {
                this.field590.field1667 = var6;
                this.field590 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Ljava/lang/String;I[Ljava/lang/Class;Ljava/lang/Class;)Lue;")
    public final class86 method243(String arg0, int arg1, Class[] arg2, Class arg3) {
        int var5 = 90 / ((40 - arg1) / 46);
        return this.method242(8, -15451, new Object[] { arg3, arg0, arg2 }, 0, 0);
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
    public class42(boolean arg0, Applet arg1, int arg2, String arg3, int arg4) throws Exception {
        this.field600 = arg2;
        field591 = "1.1";
        this.field601 = arg1;
        field607 = "Unknown";
        this.field610 = arg3;
        try {
            field607 = System.getProperty("java.vendor");
            field591 = System.getProperty("java.version");
        } catch (Exception var14) {
        }
        try {
            field608 = System.getProperty("os.name");
        } catch (Exception var13) {
            field608 = "Unknown";
        }
        field604 = field608.toLowerCase();
        try {
            field594 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var12) {
            field594 = "";
        }
        try {
            field606 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var11) {
            field606 = "";
        }
        try {
            field602 = System.getProperty("user.home");
            if (field602 != null) {
                field602 = field602 + "/";
            }
        } catch (Exception var10) {
        }
        if (field602 == null) {
            field602 = "~/";
        }
        try {
            this.field598 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var9) {
        }
        try {
            if (arg1 == null) {
                field612 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field612 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var8) {
        }
        try {
            if (arg1 == null) {
                field609 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field609 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var7) {
        }
        if (arg0) {
            this.field611 = new class150(method230(12, this.field600, (String) null, "random.dat"), "rw", 25L);
            this.field599 = new class150(method230(12, this.field600, this.field610, "main_file_cache.dat2"), "rw", 104857600L);
            this.field596 = new class150(method230(12, this.field600, this.field610, "main_file_cache.idx255"), "rw", 1048576L);
            this.field595 = new class150[arg4];
            for (int var6 = 0; var6 < arg4; var6++) {
                this.field595[var6] = new class150(method230(12, this.field600, this.field610, "main_file_cache.idx" + var6), "rw", 1048576L);
            }
        }
        this.field603 = false;
        this.field589 = new Thread(this);
        this.field589.setPriority(10);
        this.field589.setDaemon(true);
        this.field589.start();
    }
}
