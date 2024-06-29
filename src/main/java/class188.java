import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.Transferable;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ft")
public class class188 implements Runnable {

    @OriginalMember(owner = "client!ft", name = "q", descriptor = "Lvn;")
    private class328 field2474 = null;

    @OriginalMember(owner = "client!ft", name = "f", descriptor = "Z")
    public boolean field2479 = false;

    @OriginalMember(owner = "client!ft", name = "m", descriptor = "Z")
    public boolean field2483 = false;

    @OriginalMember(owner = "client!ft", name = "b", descriptor = "Lrv;")
    public class72 field2489 = null;

    @OriginalMember(owner = "client!ft", name = "v", descriptor = "Lrv;")
    public class72 field2494 = null;

    @OriginalMember(owner = "client!ft", name = "u", descriptor = "Lvn;")
    private class328 field2495 = null;

    @OriginalMember(owner = "client!ft", name = "j", descriptor = "Lrv;")
    public class72 field2496 = null;

    @OriginalMember(owner = "client!ft", name = "E", descriptor = "Z")
    private boolean field2498 = false;

    @OriginalMember(owner = "client!ft", name = "d", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field2497;

    @OriginalMember(owner = "client!ft", name = "F", descriptor = "[Lrv;")
    public class72[] field2500;

    @OriginalMember(owner = "client!ft", name = "r", descriptor = "Ljava/lang/Object;")
    private Object field2476;

    @OriginalMember(owner = "client!ft", name = "i", descriptor = "Ljava/lang/Object;")
    private Object field2475;

    @OriginalMember(owner = "client!ft", name = "g", descriptor = "Llfa;")
    private class668 field2492;

    @OriginalMember(owner = "client!ft", name = "p", descriptor = "Ljava/lang/Object;")
    private Object field2482;

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "Lnr;")
    private class428 field2493;

    @OriginalMember(owner = "client!ft", name = "s", descriptor = "Ljava/lang/Thread;")
    private Thread field2499;

    @OriginalMember(owner = "client!ft", name = "C", descriptor = "[Ljava/lang/String;")
    private static final String[] field2505 = new String[] { method1586(method1585("kN")), method1586(method1585("c\t")), method1586(method1585("wG36C|Q1y.rH16\u0004sC7")), method1586(method1585("wG36CkC+3\u0002o")), method1586(method1585(",\bt")), method1586(method1585("nC1\u0011\u0002~S6\u0003\u001f|P %\u001e|J\u000e2\u0014nc+6\u000fqC!")), method1586(method1585("oG+3\u0002p\b!6\u0019")), method1586(method1585("oQ")), method1586(method1585("hU %CuI(2")), method1586(method1585("pG,92{O)22~G&?\b3O!/")), method1586(method1585("rUk6\u001f~N")), method1586(method1585("nC1\u0011\u0002~S6\u0014\u0014~J \u0005\u0002rR")), method1586(method1585("rUk9\fpC")), method1586(method1585("pG,92{O)22~G&?\b3B$#_")), method1586(method1585("yB$")), method1586(method1585("\\q\u0011")), method1586(method1585("sR")), method1586(method1585("HH.9\u0002jH")), method1586(method1585("wG36C|Q1y.rK58\u0003xH1")), method1586(method1585("pO&%\u0002nI##")), method1586(method1585("wG36CkC7$\u0004rH")), method1586(method1585("pG,92{O)22~G&?\b3O!/_(\u0013")), method1586(method1585("rUk!\boU,8\u0003")), method1586(method1585("~\u001cj")), method1586(method1585("~\u001cj \u0004sH1x")), method1586(method1585("2R('B")), method1586(method1585("~\u001cj \u0004sB* \u001e2")), method1586(method1585("3B$#")), method1586(method1585("wG\"2\u0015B")), method1586(method1585("~\u001cj%\u001e~G&?\b2")), method1586(method1585("BQ,'CyG1")), method1586(method1585("BT&y\t|R")), method1586(method1585("BV72\u000bxT 9\u000exU")), method1586(method1585("2T64\f~N x")), method1586(method1585("xH12\u001f")), method1586(method1585("uR1'\u001e'\tj")), method1586(method1585("uR1'W2\t")), method1586(method1585("wG36C|Q1y=rO+#")), method1586(method1585("nN* \u000ehT68\u001f")), method1586(method1585("jO+")), method1586(method1585("Fo")), method1586(method1585("qO6#\u0000rB $")), method1586(method1585("nC14\u0018nR*:\u000ehT68\u001f")), method1586(method1585("x^,#")), method1586(method1585("pI32\u0000rS62")), method1586(method1585("WG\"2\u0015=`0;\u0001=u&%\bxH")), method1586(method1585("wG36C|Q1y+oG(2")), method1586(method1585("|D&3\b{A->\u0007vJ(9\u0002mW7$\u0019hP2/\u0014gg\u0007\u0014)X`\u0002\u001f$Wm\t\u001a#Rv\u0014\u0005>Is\u0013\u00005D|uf_.\u0012paZ%\u001fzqP1\b`|@B\u0005\u007fxG")), method1586(method1585("~K!wB~\u00066#\foReu\u0007?\u0006g")) };

    @OriginalMember(owner = "client!ft", name = "o", descriptor = "J")
    private static volatile long field2490 = 0L;

    @OriginalMember(owner = "client!ft", name = "w", descriptor = "I")
    private static int field2491;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ft", name = "y", descriptor = "Ljava/lang/Class;")
    public static Class field2501;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ft", name = "x", descriptor = "Ljava/lang/Class;")
    public static Class field2502;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ft", name = "B", descriptor = "Ljava/lang/Class;")
    public static Class field2503;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ft", name = "e", descriptor = "Ljava/lang/Class;")
    public static Class field2504;

    @OriginalMember(owner = "client!ft", name = "n", descriptor = "Ljava/lang/String;")
    private static String field2473;

    @OriginalMember(owner = "client!ft", name = "z", descriptor = "Ljava/lang/String;")
    private static String field2477;

    @OriginalMember(owner = "client!ft", name = "A", descriptor = "Ljava/lang/String;")
    public static String field2478;

    @OriginalMember(owner = "client!ft", name = "h", descriptor = "Ljava/lang/String;")
    public static String field2481;

    @OriginalMember(owner = "client!ft", name = "c", descriptor = "Ljava/lang/String;")
    private static String field2484;

    @OriginalMember(owner = "client!ft", name = "D", descriptor = "Ljava/lang/String;")
    public static String field2485;

    @OriginalMember(owner = "client!ft", name = "G", descriptor = "Ljava/lang/String;")
    public static String field2487;

    @OriginalMember(owner = "client!ft", name = "l", descriptor = "Ljava/lang/String;")
    public static String field2488;

    @OriginalMember(owner = "client!ft", name = "k", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field2480;

    @OriginalMember(owner = "client!ft", name = "t", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field2486;

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(Ljava/lang/String;ZII)Lvn;")
    public final class328 method1564(String arg0, boolean arg1, int arg2, int arg3) {
        int var5 = 46 / ((arg3 + 34) / 36);
        return this.method1577(arg0, arg2, arg1 ? 22 : 1, 0, (byte) 125);
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(II)Lvn;")
    public final class328 method1565(int arg0, int arg1) {
        if (arg0 != 3) {
            this.run();
        }
        return this.method1577(null, arg1, 3, 0, (byte) 63);
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(IZIII)Lvn;")
    public final class328 method1566(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        if (!arg1) {
            field2481 = null;
        }
        return this.method1577(null, (arg2 << 16) + arg0, 6, (arg4 << 16) + arg3, (byte) 35);
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(I[BLjava/io/File;)Z")
    public final boolean method1567(int arg0, byte[] arg1, File arg2) {
        try {
            if (arg0 == 314572800) {
                FileOutputStream var4 = new FileOutputStream(arg2);
                var4.write(arg1, 0, arg1.length);
                var4.close();
                return true;
            } else {
                return true;
            }
        } catch (IOException var5) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "([IIIILjava/awt/Component;Ljava/awt/Point;)Lvn;")
    public final class328 method1568(int[] arg0, int arg1, int arg2, int arg3, Component arg4, Point arg5) {
        return arg3 == 17 ? this.method1577(new Object[] { arg4, arg0, arg5 }, arg2, 17, arg1, (byte) 66) : null;
    }

    @OriginalMember(owner = "client!ft", name = "b", descriptor = "(I)Ljava/lang/Object;")
    public final Object method1569(int arg0) {
        if (arg0 != 6364) {
            this.field2497 = null;
        }
        return this.field2476;
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(Ljava/lang/String;Z)Lvn;")
    public final class328 method1570(String arg0, boolean arg1) {
        if (!arg1) {
            this.run();
        }
        return this.method1577(arg0, 0, 16, 0, (byte) 78);
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "([Ljava/lang/Class;Ljava/lang/String;BLjava/lang/Class;)Lvn;")
    public final class328 method1571(Class[] arg0, String arg1, byte arg2, Class arg3) {
        int var5 = -26 % ((arg2 + 3) / 43);
        return this.method1577(new Object[] { arg3, arg1, arg0 }, 0, 8, 0, (byte) 47);
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(Ljava/lang/Runnable;BI)Lvn;")
    public final class328 method1572(Runnable arg0, byte arg1, int arg2) {
        if (arg1 > -63) {
            this.method1579(-65);
        }
        return this.method1577(arg0, arg2, 2, 0, (byte) 83);
    }

    @OriginalMember(owner = "client!ft", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class328 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2498) {
                        return;
                    }
                    if (this.field2474 != null) {
                        var2 = this.field2474;
                        this.field2474 = this.field2474.field4488;
                        if (this.field2474 == null) {
                            this.field2495 = null;
                        }
                        break;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var30) {
                    }
                }
            }
            try {
                int var3 = var2.field4483;
                if (var3 == 1) {
                    if (class614.method4531(-126) < field2490) {
                        throw new IOException();
                    }
                    var2.field4487 = new Socket(InetAddress.getByName((String) var2.field4485), var2.field4482);
                } else if (var3 == 22) {
                    if (field2490 > class614.method4531(-98)) {
                        throw new IOException();
                    }
                    try {
                        var2.field4487 = class684.method4899((String) var2.field4485, var2.field4482, false).method447((byte) -77);
                    } catch (class132 var29) {
                        var2.field4487 = var29.getMessage();
                        throw var29;
                    }
                } else if (var3 == 2) {
                    Thread var5 = new Thread((Runnable) var2.field4485);
                    var5.setDaemon(true);
                    var5.start();
                    var5.setPriority(var2.field4482);
                    var2.field4487 = var5;
                } else if (var3 == 4) {
                    if (field2490 > class614.method4531(-111)) {
                        throw new IOException();
                    }
                    var2.field4487 = new DataInputStream(((URL) var2.field4485).openStream());
                } else if (var3 == 8) {
                    Object[] var6 = (Object[]) var2.field4485;
                    if (this.field2479 && ((Class) var6[0]).getClassLoader() == null) {
                        throw new SecurityException();
                    }
                    var2.field4487 = ((Class) var6[0]).getDeclaredMethod((String) var6[1], (Class[]) var6[2]);
                } else if (var3 == 9) {
                    Object[] var23 = (Object[]) var2.field4485;
                    if (this.field2479 && ((Class) var23[0]).getClassLoader() == null) {
                        throw new SecurityException();
                    }
                    var2.field4487 = ((Class) var23[0]).getDeclaredField((String) var23[1]);
                } else if (var3 == 18) {
                    Clipboard var7 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var2.field4487 = var7.getContents(null);
                } else if (var3 == 19) {
                    Transferable var21 = (Transferable) var2.field4485;
                    Clipboard var22 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var22.setContents(var21, null);
                } else if (!this.field2479) {
                    throw new Exception("");
                } else if (var3 == 3) {
                    if (class614.method4531(-122) < field2490) {
                        throw new IOException();
                    }
                    String var8 = (var2.field4482 >> 24 & 0xFF) + "." + ((var2.field4482 & 0xFF2569) >> 16) + "." + ((var2.field4482 & 0xFF28) >> 8) + "." + (var2.field4482 & 0xFF);
                    var2.field4487 = InetAddress.getByName(var8).getHostName();
                } else if (var3 == 21) {
                    if (class614.method4531(-114) < field2490) {
                        throw new IOException();
                    }
                    var2.field4487 = InetAddress.getByName((String) var2.field4485).getAddress();
                } else if (var3 == 5) {
                    if (this.field2483) {
                        var2.field4487 = this.field2492.method4811((byte) -43);
                    } else {
                        var2.field4487 = Class.forName(field2505[16]).getMethod(field2505[41]).invoke(this.field2475);
                    }
                } else if (var3 == 6) {
                    Frame var9 = new Frame(field2505[45]);
                    var2.field4487 = var9;
                    var9.setResizable(false);
                    if (this.field2483) {
                        this.field2492.method4812(var2.field4484 & 0xFFFF, -20, var2.field4482 >>> 16, var2.field4482 & 0xFFFF, var9, var2.field4484 >> 16);
                    } else {
                        Class.forName(field2505[16]).getMethod(field2505[34], field2501 == null ? (field2501 = method1584(field2505[46])) : field2501, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(this.field2475, var9, Integer.valueOf(var2.field4482 >>> 16), new Integer(var2.field4482 & 0xFFFF), Integer.valueOf(var2.field4484 >> 16), new Integer(var2.field4484 & 0xFFFF));
                    }
                } else if (var3 == 7) {
                    if (this.field2483) {
                        this.field2492.method4810((Frame) var2.field4485, false);
                    } else {
                        Class.forName(field2505[16]).getMethod(field2505[43]).invoke(this.field2475);
                    }
                } else if (var3 == 12) {
                    class72 var10 = method1583(field2473, 33, (String) var2.field4485, field2491);
                    var2.field4487 = var10;
                } else if (var3 == 13) {
                    class72 var11 = method1583("", 33, (String) var2.field4485, field2491);
                    var2.field4487 = var11;
                } else if (this.field2479 && var3 == 14) {
                    int var12 = var2.field4482;
                    int var13 = var2.field4484;
                    if (this.field2483) {
                        this.field2493.method3307(var13, var12, (byte) -85);
                    } else {
                        Class.forName(field2505[0]).getDeclaredMethod(field2505[44], Integer.TYPE, Integer.TYPE).invoke(this.field2482, Integer.valueOf(var12), new Integer(var13));
                    }
                } else if (this.field2479 && var3 == 15) {
                    boolean var14 = var2.field4482 != 0;
                    Component var15 = (Component) var2.field4485;
                    if (this.field2483) {
                        this.field2493.method3306(-2, var15, var14);
                    } else {
                        Class.forName(field2505[0]).getDeclaredMethod(field2505[38], field2502 == null ? (field2502 = method1584(field2505[18])) : field2502, Boolean.TYPE).invoke(this.field2482, var15, Boolean.valueOf(var14));
                    }
                } else if (!this.field2483 && var3 == 17) {
                    Object[] var16 = (Object[]) var2.field4485;
                    Class.forName(field2505[0]).getDeclaredMethod(field2505[42], field2502 == null ? (field2502 = method1584(field2505[18])) : field2502, field2503 == null ? (field2503 = method1584(field2505[40])) : field2503, Integer.TYPE, Integer.TYPE, field2504 == null ? (field2504 = method1584(field2505[37])) : field2504).invoke(this.field2482, (Component) var16[0], (int[]) var16[1], Integer.valueOf(var2.field4482), new Integer(var2.field4484), (Point) var16[2]);
                } else if (var3 == 16) {
                    try {
                        if (!field2485.startsWith(field2505[39])) {
                            throw new Exception();
                        }
                        String var17 = (String) var2.field4485;
                        if (!var17.startsWith(field2505[36]) && !var17.startsWith(field2505[35])) {
                            throw new Exception();
                        }
                        String var18 = field2505[47];
                        int var19 = 0;
                        while (true) {
                            if (var17.length() <= var19) {
                                Runtime.getRuntime().exec(field2505[48] + var17 + "\"");
                                var2.field4487 = null;
                                break;
                            }
                            if (var18.indexOf(var17.charAt(var19)) == -1) {
                                throw new Exception();
                            }
                            var19++;
                        }
                    } catch (Exception var31) {
                        var2.field4487 = var31;
                        throw var31;
                    }
                } else {
                    throw new Exception("");
                }
                var2.field4486 = 1;
            } catch (ThreadDeath var32) {
                throw var32;
            } catch (Throwable var33) {
                var2.field4486 = 2;
            }
            synchronized (var2) {
                var2.notify();
            }
        }
    }

    @OriginalMember(owner = "client!ft", name = "c", descriptor = "(I)V")
    public final void method1573(int arg0) {
        synchronized (this) {
            if (arg0 != 0) {
                this.method1574(false);
            }
            this.field2498 = true;
            this.notifyAll();
        }
        try {
            this.field2499.join();
        } catch (InterruptedException var8) {
        }
        if (this.field2489 != null) {
            try {
                this.field2489.method757(0);
            } catch (IOException var7) {
            }
        }
        if (this.field2494 != null) {
            try {
                this.field2494.method757(arg0);
            } catch (IOException var6) {
            }
        }
        if (this.field2500 != null) {
            for (int var3 = 0; var3 < this.field2500.length; var3++) {
                if (this.field2500[var3] != null) {
                    try {
                        this.field2500[var3].method757(0);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field2496 != null) {
            try {
                this.field2496.method757(0);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(Z)Z")
    public final boolean method1574(boolean arg0) {
        if (!this.field2479) {
            return false;
        }
        if (!arg0) {
            this.method1567(-76, null, null);
        }
        if (this.field2483) {
            return this.field2492 != null;
        } else {
            return this.field2475 != null;
        }
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(ILjava/net/URL;)Lvn;")
    public final class328 method1575(int arg0, URL arg1) {
        if (arg0 <= 82) {
            method1583(null, -32, null, 55);
        }
        return this.method1577(arg1, 0, 4, 0, (byte) 64);
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(Ljava/lang/String;ZI)Lvn;")
    public final class328 method1576(String arg0, boolean arg1, int arg2) {
        if (arg2 != 13) {
            field2484 = null;
        }
        return arg1 ? this.method1577(arg0, 0, 12, 0, (byte) 41) : this.method1577(arg0, 0, 13, 0, (byte) 124);
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(Ljava/lang/Object;IIIB)Lvn;")
    private final class328 method1577(Object arg0, int arg1, int arg2, int arg3, byte arg4) {
        class328 var6 = new class328();
        var6.field4485 = arg0;
        var6.field4484 = arg3;
        var6.field4482 = arg1;
        if (arg4 <= 31) {
            this.method1570(null, true);
        }
        var6.field4483 = arg2;
        synchronized (this) {
            if (this.field2495 == null) {
                this.field2495 = this.field2474 = var6;
            } else {
                this.field2495.field4488 = var6;
                this.field2495 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(Ljava/lang/String;I)Lrv;")
    public static final class72 method1578(String arg0, int arg1) {
        if (arg1 != -7) {
            field2488 = null;
        }
        return method1583(field2473, 33, arg0, field2491);
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(I)Lvn;")
    public final class328 method1579(int arg0) {
        return arg0 == 65535 ? this.method1577(null, 0, 5, 0, (byte) 107) : null;
    }

    @OriginalMember(owner = "client!ft", name = "b", descriptor = "(Z)V")
    public final void method1580(boolean arg0) {
        if (arg0) {
            field2490 = class614.method4531(-80) + 5000L;
        }
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/Class;)Lvn;")
    public final class328 method1581(byte arg0, String arg1, Class arg2) {
        return arg0 == 122 ? this.method1577(new Object[] { arg2, arg1 }, 0, 9, 0, (byte) 114) : null;
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(Ljava/awt/Frame;I)Lvn;")
    public final class328 method1582(Frame arg0, int arg1) {
        return arg1 == -3824 ? this.method1577(arg0, 0, 7, 0, (byte) 75) : null;
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)Lrv;")
    private static final class72 method1583(String arg0, int arg1, String arg2, int arg3) {
        String var4;
        if (arg1 == arg3) {
            var4 = field2505[28] + arg0 + field2505[32] + arg2 + field2505[31];
        } else if (arg3 == 34) {
            var4 = field2505[28] + arg0 + field2505[32] + arg2 + field2505[30];
        } else {
            var4 = field2505[28] + arg0 + field2505[32] + arg2 + field2505[27];
        }
        String[] var5 = new String[] { field2505[29], field2505[33], field2477, field2505[26], field2505[24], field2505[23], field2505[25], "" };
        for (int var6 = 0; var6 < var5.length; var6++) {
            String var7 = var5[var6];
            if (var7.length() <= 0 || (new File(var7)).exists()) {
                try {
                    return new class72(new File(var7, var4), field2505[7], 10000L);
                } catch (Exception var9) {
                }
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ft", name = "<init>", descriptor = "(ILjava/lang/String;IZ)V")
    public class188(int arg0, String arg1, int arg2, boolean arg3) throws Exception {
        field2491 = arg0;
        field2487 = field2505[4];
        this.field2479 = arg3;
        field2488 = field2505[17];
        field2473 = arg1;
        try {
            field2488 = System.getProperty(field2505[3]);
            field2487 = System.getProperty(field2505[20]);
        } catch (Exception var20) {
        }
        if (field2488.toLowerCase().indexOf(field2505[19]) != -1) {
            this.field2483 = true;
        }
        try {
            field2484 = System.getProperty(field2505[12]);
        } catch (Exception var19) {
            field2484 = field2505[17];
        }
        field2485 = field2484.toLowerCase();
        try {
            field2481 = System.getProperty(field2505[10]).toLowerCase();
        } catch (Exception var18) {
            field2481 = "";
        }
        try {
            field2478 = System.getProperty(field2505[22]).toLowerCase();
        } catch (Exception var17) {
            field2478 = "";
        }
        try {
            field2477 = System.getProperty(field2505[8]);
            if (field2477 != null) {
                field2477 = field2477 + "/";
            }
        } catch (Exception var16) {
        }
        if (field2477 == null) {
            field2477 = field2505[1];
        }
        try {
            this.field2497 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var15) {
        }
        if (!this.field2483) {
            try {
                field2480 = Class.forName(field2505[18]).getDeclaredMethod(field2505[5], Boolean.TYPE);
            } catch (Exception var14) {
            }
            try {
                field2486 = Class.forName(field2505[2]).getDeclaredMethod(field2505[11], Boolean.TYPE);
            } catch (Exception var13) {
            }
        }
        class633.method4626(field2473, field2491, (byte) -55);
        if (this.field2479) {
            this.field2496 = new class72(class633.method4625((byte) -68, field2491, null, field2505[6]), field2505[7], 25L);
            this.field2489 = new class72(class633.method4627(field2505[13], (byte) -114), field2505[7], 314572800L);
            this.field2494 = new class72(class633.method4627(field2505[21], (byte) -126), field2505[7], 1048576L);
            this.field2500 = new class72[arg2];
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2500[var5] = new class72(class633.method4627(field2505[9] + var5, (byte) -124), field2505[7], 1048576L);
            }
            if (this.field2483) {
                try {
                    this.field2476 = Class.forName(field2505[14]).getDeclaredConstructor().newInstance();
                } catch (Throwable var12) {
                }
            }
            try {
                if (this.field2483) {
                    this.field2492 = new class668();
                } else {
                    this.field2475 = Class.forName(field2505[16]).getDeclaredConstructor().newInstance();
                }
            } catch (Throwable var11) {
            }
            try {
                if (this.field2483) {
                    this.field2493 = new class428();
                } else {
                    this.field2482 = Class.forName(field2505[0]).getDeclaredConstructor().newInstance();
                }
            } catch (Throwable var10) {
            }
        }
        if (this.field2479 && !this.field2483) {
            ThreadGroup var6 = Thread.currentThread().getThreadGroup();
            for (ThreadGroup var7 = var6.getParent(); var7 != null; var7 = var7.getParent()) {
                var6 = var7;
            }
            Thread[] var8 = new Thread[1000];
            var6.enumerate(var8);
            for (int var9 = 0; var9 < var8.length; var9++) {
                if (var8[var9] != null && var8[var9].getName().startsWith(field2505[15])) {
                    var8[var9].setPriority(1);
                }
            }
        }
        this.field2498 = false;
        this.field2499 = new Thread(this);
        this.field2499.setPriority(10);
        this.field2499.setDaemon(true);
        this.field2499.start();
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1584(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!ft", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1585(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x6D);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ft", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1586(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 29;
                    break;
                case 1:
                    var10005 = 38;
                    break;
                case 2:
                    var10005 = 69;
                    break;
                case 3:
                    var10005 = 87;
                    break;
                default:
                    var10005 = 109;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
