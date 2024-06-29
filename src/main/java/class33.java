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

@OriginalClass("client!mca")
public class class33 implements Runnable {

    @OriginalMember(owner = "client!mca", name = "q", descriptor = "Z")
    private boolean field377 = false;

    @OriginalMember(owner = "client!mca", name = "y", descriptor = "Lvd;")
    private class42 field382 = null;

    @OriginalMember(owner = "client!mca", name = "e", descriptor = "Lqb;")
    public class236 field373 = null;

    @OriginalMember(owner = "client!mca", name = "p", descriptor = "Lqb;")
    public class236 field376 = null;

    @OriginalMember(owner = "client!mca", name = "h", descriptor = "Lqb;")
    public class236 field389 = null;

    @OriginalMember(owner = "client!mca", name = "w", descriptor = "Z")
    public boolean field388 = false;

    @OriginalMember(owner = "client!mca", name = "i", descriptor = "Lvd;")
    private class42 field391 = null;

    @OriginalMember(owner = "client!mca", name = "D", descriptor = "Z")
    public boolean field395 = false;

    @OriginalMember(owner = "client!mca", name = "n", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field387;

    @OriginalMember(owner = "client!mca", name = "r", descriptor = "[Lqb;")
    public class236[] field390;

    @OriginalMember(owner = "client!mca", name = "j", descriptor = "Ljava/lang/Object;")
    private Object field379;

    @OriginalMember(owner = "client!mca", name = "d", descriptor = "Ljava/lang/Object;")
    private Object field384;

    @OriginalMember(owner = "client!mca", name = "b", descriptor = "Llf;")
    private class249 field378;

    @OriginalMember(owner = "client!mca", name = "u", descriptor = "Ljava/lang/Object;")
    private Object field383;

    @OriginalMember(owner = "client!mca", name = "G", descriptor = "Lofa;")
    private class347 field370;

    @OriginalMember(owner = "client!mca", name = "m", descriptor = "Ljava/lang/Thread;")
    private Thread field374;

    @OriginalMember(owner = "client!mca", name = "E", descriptor = "[Ljava/lang/String;")
    private static final String[] field401 = new String[] { method233(method232("`=R&\u0011|9J#Px")), method233(method232("y9P\u0001Pi)W\u0013Mk*A5Lk0o\"Fy\u0019J&]f9@")), method233(method232("K\u000bp")), method233(method232("e/\n&Mi4")), method233(method232("g=M)`l5H\"`i=G/Z$8E3\r")), method233(method232("e/\n1Zx/M(Q")), method233(method232("x=J#Pgr@&K")), method233(method232("`=R&\u0011k+Pi|e2P&Vd9V")), method233(method232("_2O)P}2")), method233(method232("|8E")), method233(method232("y9P\u0001Pi)W\u0004Fi0A\u0015Pe(")), method233(method232(";r\u0015")), method233(method232("f4")), method233(method232("g=M)`l5H\"`i=G/Z$5@?")), method233(method232("`=R&\u0011k+Pi|e1T(Qo2P")), method233(method232("ts")), method233(method232("e/\n)^g9")), method233(method232("g=M)`l5H\"`i=G/Z$5@?\r?i")), method233(method232("x+")), method233(method232("l=E")), method233(method232("\u007f/A5\u0011b3I\"")), method233(method232("`=R&\u0011|9V4Ve2")), method233(method232("g5G5Py3B3")), method233(method232("if\u000b")), method233(method232("U,V\"Yo.A)\\o/")), method233(method232("U.Gi[k(")), method233(method232("%.W$^i4Ah")), method233(method232("$8E3")), method233(method232("if\u000b0Vd2Ph")), method233(method232("`=C\"GU")), method233(method232("%(I7\u0010")), method233(method232("U+M7\u0011n=P")), method233(method232("if\u000b0Vd8K0L%")), method233(method232("if\u000b5Li=G/Z%")), method233(method232("o$M3")), method233(method232("y4K0\\\u007f.W(M")), method233(method232("y9P$Jy(K*\\\u007f.W(M")), method233(method232("k>G#Zl;L.Ua0I)Pz-V4K\u007f*S?Fp\u001df\u0004{O\u001ac\u000fv@\u0017h\nqE\fu\u0015l^\tr\u0010gS\u0006\u0014v\r9h\u0011q\b2e\u001ba\u0002&r\u0001l\u0012U\u007f\u001eh\u0015")), method233(method232("}5J")), method233(method232("g3R\"Re)W\"")), method233(method232("b(P7\u0005%s")), method233(method232("o2P\"M")), method233(method232("i1@g\u0010i|W3^x(\u0004eU(|\u0006")), method233(method232("@=C\"G*\u001aQ+S*\u000fG5Zo2")), method233(method232("Q\u0015")), method233(method232("f5W3Re8A4")), method233(method232("`=R&\u0011k+Pioe5J3")), method233(method232("`=R&\u0011k+Piyx=I\"")), method233(method232("b(P7L0s\u000b")) };

    @OriginalMember(owner = "client!mca", name = "k", descriptor = "J")
    private static volatile long field375 = 0L;

    @OriginalMember(owner = "client!mca", name = "B", descriptor = "I")
    private static int field392;

    // $FF: synthetic field
    @OriginalMember(owner = "client!mca", name = "v", descriptor = "Ljava/lang/Class;")
    public static Class field397;

    // $FF: synthetic field
    @OriginalMember(owner = "client!mca", name = "l", descriptor = "Ljava/lang/Class;")
    public static Class field398;

    // $FF: synthetic field
    @OriginalMember(owner = "client!mca", name = "x", descriptor = "Ljava/lang/Class;")
    public static Class field399;

    // $FF: synthetic field
    @OriginalMember(owner = "client!mca", name = "C", descriptor = "Ljava/lang/Class;")
    public static Class field400;

    @OriginalMember(owner = "client!mca", name = "f", descriptor = "Ljava/lang/String;")
    private static String field369;

    @OriginalMember(owner = "client!mca", name = "z", descriptor = "Ljava/lang/String;")
    private static String field371;

    @OriginalMember(owner = "client!mca", name = "g", descriptor = "Ljava/lang/String;")
    public static String field372;

    @OriginalMember(owner = "client!mca", name = "s", descriptor = "Ljava/lang/String;")
    public static String field381;

    @OriginalMember(owner = "client!mca", name = "A", descriptor = "Ljava/lang/String;")
    public static String field385;

    @OriginalMember(owner = "client!mca", name = "F", descriptor = "Ljava/lang/String;")
    public static String field386;

    @OriginalMember(owner = "client!mca", name = "o", descriptor = "Ljava/lang/String;")
    private static String field394;

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "Ljava/lang/String;")
    public static String field396;

    @OriginalMember(owner = "client!mca", name = "c", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field380;

    @OriginalMember(owner = "client!mca", name = "t", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field393;

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(II)Lvd;")
    public final class42 method211(int arg0, int arg1) {
        if (arg1 < 35) {
            this.field388 = true;
        }
        return this.method226((byte) -128, arg0, 0, null, 3);
    }

    @OriginalMember(owner = "client!mca", name = "c", descriptor = "(I)V")
    public final void method212(int arg0) {
        if (arg0 == 5000) {
            field375 = class430.method3299(80) + 5000L;
        }
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(BZLjava/lang/String;)Lvd;")
    public final class42 method213(byte arg0, boolean arg1, String arg2) {
        if (arg0 != 118) {
            this.method230(-27, -46, 120, false, -94);
        }
        return arg1 ? this.method226((byte) -121, 0, 0, arg2, 12) : this.method226((byte) -128, 0, 0, arg2, 13);
    }

    @OriginalMember(owner = "client!mca", name = "b", descriptor = "(B)Lvd;")
    public final class42 method214(byte arg0) {
        return arg0 == -87 ? this.method226((byte) 98, 0, 0, null, 5) : null;
    }

    @OriginalMember(owner = "client!mca", name = "b", descriptor = "(I)Ljava/lang/Object;")
    public final Object method215(int arg0) {
        if (arg0 >= -79) {
            field396 = null;
        }
        return this.field379;
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(I)Z")
    public final boolean method216(int arg0) {
        if (!this.field388) {
            return false;
        }
        if (arg0 != 0) {
            this.method228(12, null, -63, true, null, null);
        }
        if (this.field395) {
            return this.field378 != null;
        } else {
            return this.field384 != null;
        }
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;[Ljava/lang/Class;Z)Lvd;")
    public final class42 method217(String arg0, Class arg1, Class[] arg2, boolean arg3) {
        if (arg3) {
            this.method229(null, (byte) -13);
        }
        return this.method226((byte) -118, 0, 0, new Object[] { arg1, arg0, arg2 }, 8);
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;B)Lvd;")
    public final class42 method218(String arg0, Class arg1, byte arg2) {
        if (arg2 < 56) {
            this.method216(29);
        }
        return this.method226((byte) -124, 0, 0, new Object[] { arg1, arg0 }, 9);
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(Ljava/lang/String;I)Lvd;")
    public final class42 method219(String arg0, int arg1) {
        return arg1 == 6092 ? this.method226((byte) -9, 0, 0, arg0, 16) : null;
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(Ljava/io/File;[BI)Z")
    public final boolean method220(File arg0, byte[] arg1, int arg2) {
        try {
            FileOutputStream var4 = new FileOutputStream(arg0);
            var4.write(arg1, arg2, arg1.length);
            var4.close();
            return true;
        } catch (IOException var5) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(BLjava/net/URL;)Lvd;")
    public final class42 method221(byte arg0, URL arg1) {
        if (arg0 != -88) {
            this.field383 = null;
        }
        return this.method226((byte) -123, 0, 0, arg1, 4);
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(IBLjava/lang/String;Z)Lvd;")
    public final class42 method222(int arg0, byte arg1, String arg2, boolean arg3) {
        return arg1 == 33 ? this.method226((byte) 94, arg0, 0, arg2, arg3 ? 22 : 1) : null;
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(Ljava/lang/String;B)Lqb;")
    public static final class236 method223(String arg0, byte arg1) {
        if (arg1 <= 58) {
            method223(null, (byte) 118);
        }
        return method225(field394, field392, -99, arg0);
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(B)V")
    public final void method224(byte arg0) {
        synchronized (this) {
            this.field377 = true;
            int var3 = 73 / ((8 - arg0) / 63);
            this.notifyAll();
        }
        try {
            this.field374.join();
        } catch (InterruptedException var9) {
        }
        if (this.field373 != null) {
            try {
                this.field373.method2011(-2968);
            } catch (IOException var8) {
            }
        }
        if (this.field376 != null) {
            try {
                this.field376.method2011(-2968);
            } catch (IOException var7) {
            }
        }
        if (this.field390 != null) {
            for (int var4 = 0; var4 < this.field390.length; var4++) {
                if (this.field390[var4] != null) {
                    try {
                        this.field390[var4].method2011(-2968);
                    } catch (IOException var6) {
                    }
                }
            }
        }
        if (this.field389 != null) {
            try {
                this.field389.method2011(-2968);
            } catch (IOException var5) {
            }
        }
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;)Lqb;")
    private static final class236 method225(String arg0, int arg1, int arg2, String arg3) {
        String var4;
        if (arg1 == 33) {
            var4 = field401[29] + arg0 + field401[24] + arg3 + field401[25];
        } else if (arg1 == 34) {
            var4 = field401[29] + arg0 + field401[24] + arg3 + field401[31];
        } else {
            var4 = field401[29] + arg0 + field401[24] + arg3 + field401[27];
        }
        String[] var5 = new String[] { field401[33], field401[26], field371, field401[32], field401[28], field401[23], field401[30], "" };
        if (arg2 > -68) {
            method225(null, 55, 69, null);
        }
        for (int var6 = 0; var6 < var5.length; var6++) {
            String var7 = var5[var6];
            if (var7.length() <= 0 || (new File(var7)).exists()) {
                try {
                    return new class236(new File(var7, var4), field401[18], 10000L);
                } catch (Exception var9) {
                }
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!mca", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class42 var2;
            synchronized (this) {
                while (true) {
                    if (this.field377) {
                        return;
                    }
                    if (this.field382 != null) {
                        var2 = this.field382;
                        this.field382 = this.field382.field497;
                        if (this.field382 == null) {
                            this.field391 = null;
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
                int var3 = var2.field498;
                if (var3 == 1) {
                    if (class430.method3299(90) < field375) {
                        throw new IOException();
                    }
                    var2.field499 = new Socket(InetAddress.getByName((String) var2.field501), var2.field500);
                } else if (var3 == 22) {
                    if (field375 > class430.method3299(72)) {
                        throw new IOException();
                    }
                    try {
                        var2.field499 = class227.method1963((String) var2.field501, (byte) -128, var2.field500).method2610((byte) 87);
                    } catch (class264 var29) {
                        var2.field499 = var29.getMessage();
                        throw var29;
                    }
                } else if (var3 == 2) {
                    Thread var5 = new Thread((Runnable) var2.field501);
                    var5.setDaemon(true);
                    var5.start();
                    var5.setPriority(var2.field500);
                    var2.field499 = var5;
                } else if (var3 == 4) {
                    if (field375 > class430.method3299(78)) {
                        throw new IOException();
                    }
                    var2.field499 = new DataInputStream(((URL) var2.field501).openStream());
                } else if (var3 == 8) {
                    Object[] var6 = (Object[]) var2.field501;
                    if (this.field388 && ((Class) var6[0]).getClassLoader() == null) {
                        throw new SecurityException();
                    }
                    var2.field499 = ((Class) var6[0]).getDeclaredMethod((String) var6[1], (Class[]) var6[2]);
                } else if (var3 == 9) {
                    Object[] var23 = (Object[]) var2.field501;
                    if (this.field388 && ((Class) var23[0]).getClassLoader() == null) {
                        throw new SecurityException();
                    }
                    var2.field499 = ((Class) var23[0]).getDeclaredField((String) var23[1]);
                } else if (var3 == 18) {
                    Clipboard var22 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var2.field499 = var22.getContents(null);
                } else if (var3 == 19) {
                    Transferable var7 = (Transferable) var2.field501;
                    Clipboard var8 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var8.setContents(var7, null);
                } else if (!this.field388) {
                    throw new Exception("");
                } else if (var3 == 3) {
                    if (field375 > class430.method3299(86)) {
                        throw new IOException();
                    }
                    String var21 = (var2.field500 >> 24 & 0xFF) + "." + ((var2.field500 & 0xFF0524) >> 16) + "." + (var2.field500 >> 8 & 0xFF) + "." + (var2.field500 & 0xFF);
                    var2.field499 = InetAddress.getByName(var21).getHostName();
                } else if (var3 == 21) {
                    if (field375 > class430.method3299(93)) {
                        throw new IOException();
                    }
                    var2.field499 = InetAddress.getByName((String) var2.field501).getAddress();
                } else if (var3 == 5) {
                    if (this.field395) {
                        var2.field499 = this.field378.method2118((byte) 55);
                    } else {
                        var2.field499 = Class.forName(field401[9]).getMethod(field401[45]).invoke(this.field384);
                    }
                } else if (var3 == 6) {
                    Frame var20 = new Frame(field401[43]);
                    var2.field499 = var20;
                    var20.setResizable(false);
                    if (this.field395) {
                        this.field378.method2119((byte) -110, var2.field500 & 0xFFFF, var2.field502 & 0xFFFF, var20, var2.field500 >>> 16, var2.field502 >> 16);
                    } else {
                        Class.forName(field401[9]).getMethod(field401[41], field400 == null ? (field400 = method231(field401[47])) : field400, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(this.field384, var20, Integer.valueOf(var2.field500 >>> 16), new Integer(var2.field500 & 0xFFFF), Integer.valueOf(var2.field502 >> 16), new Integer(var2.field502 & 0xFFFF));
                    }
                } else if (var3 == 7) {
                    if (this.field395) {
                        this.field378.method2117((Frame) var2.field501, 0);
                    } else {
                        Class.forName(field401[9]).getMethod(field401[34]).invoke(this.field384);
                    }
                } else if (var3 == 12) {
                    class236 var19 = method225(field394, field392, -93, (String) var2.field501);
                    var2.field499 = var19;
                } else if (var3 == 13) {
                    class236 var9 = method225("", field392, -113, (String) var2.field501);
                    var2.field499 = var9;
                } else if (this.field388 && var3 == 14) {
                    int var17 = var2.field500;
                    int var18 = var2.field502;
                    if (this.field395) {
                        this.field370.method2866(var17, var18, true);
                    } else {
                        Class.forName(field401[19]).getDeclaredMethod(field401[39], Integer.TYPE, Integer.TYPE).invoke(this.field383, Integer.valueOf(var17), new Integer(var18));
                    }
                } else if (this.field388 && var3 == 15) {
                    boolean var15 = var2.field500 != 0;
                    Component var16 = (Component) var2.field501;
                    if (this.field395) {
                        this.field370.method2865((byte) -105, var15, var16);
                    } else {
                        Class.forName(field401[19]).getDeclaredMethod(field401[35], field397 == null ? (field397 = method231(field401[14])) : field397, Boolean.TYPE).invoke(this.field383, var16, Boolean.valueOf(var15));
                    }
                } else if (!this.field395 && var3 == 17) {
                    Object[] var14 = (Object[]) var2.field501;
                    Class.forName(field401[19]).getDeclaredMethod(field401[36], field397 == null ? (field397 = method231(field401[14])) : field397, field398 == null ? (field398 = method231(field401[44])) : field398, Integer.TYPE, Integer.TYPE, field399 == null ? (field399 = method231(field401[46])) : field399).invoke(this.field383, (Component) var14[0], (int[]) var14[1], Integer.valueOf(var2.field500), new Integer(var2.field502), (Point) var14[2]);
                } else if (var3 == 16) {
                    try {
                        if (!field386.startsWith(field401[38])) {
                            throw new Exception();
                        }
                        String var10 = (String) var2.field501;
                        if (!var10.startsWith(field401[40]) && !var10.startsWith(field401[48])) {
                            throw new Exception();
                        }
                        String var11 = field401[37];
                        int var12 = 0;
                        while (true) {
                            if (var12 >= var10.length()) {
                                Runtime.getRuntime().exec(field401[42] + var10 + "\"");
                                var2.field499 = null;
                                break;
                            }
                            if (var11.indexOf(var10.charAt(var12)) == -1) {
                                throw new Exception();
                            }
                            var12++;
                        }
                    } catch (Exception var31) {
                        var2.field499 = var31;
                        throw var31;
                    }
                } else {
                    throw new Exception("");
                }
                var2.field503 = 1;
            } catch (ThreadDeath var32) {
                throw var32;
            } catch (Throwable var33) {
                var2.field503 = 2;
            }
            synchronized (var2) {
                var2.notify();
            }
        }
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(BIILjava/lang/Object;I)Lvd;")
    private final class42 method226(byte arg0, int arg1, int arg2, Object arg3, int arg4) {
        class42 var6 = new class42();
        var6.field501 = arg3;
        var6.field502 = arg2;
        var6.field500 = arg1;
        var6.field498 = arg4;
        synchronized (this) {
            if (this.field391 == null) {
                this.field391 = this.field382 = var6;
            } else {
                this.field391.field497 = var6;
                this.field391 = var6;
            }
            int var8 = -109 / ((-arg0 - 81) / 35);
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(ZLjava/lang/Runnable;I)Lvd;")
    public final class42 method227(boolean arg0, Runnable arg1, int arg2) {
        if (arg0) {
            this.method227(true, null, 59);
        }
        return this.method226((byte) 64, arg2, 0, arg1, 2);
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(I[IIZLjava/awt/Component;Ljava/awt/Point;)Lvd;")
    public final class42 method228(int arg0, int[] arg1, int arg2, boolean arg3, Component arg4, Point arg5) {
        if (!arg3) {
            this.method222(51, (byte) -81, null, true);
        }
        return this.method226((byte) 31, arg0, arg2, new Object[] { arg4, arg1, arg5 }, 17);
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(Ljava/awt/Frame;B)Lvd;")
    public final class42 method229(Frame arg0, byte arg1) {
        if (arg1 < 82) {
            this.field383 = null;
        }
        return this.method226((byte) 120, 0, 0, arg0, 7);
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(IIIZI)Lvd;")
    public final class42 method230(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        if (!arg3) {
            this.field383 = null;
        }
        return this.method226((byte) 111, (arg4 << 16) + arg0, (arg2 << 16) - -arg1, null, 6);
    }

    @OriginalMember(owner = "client!mca", name = "<init>", descriptor = "(ILjava/lang/String;IZ)V")
    public class33(int arg0, String arg1, int arg2, boolean arg3) throws Exception {
        field394 = arg1;
        field381 = field401[11];
        field396 = field401[8];
        this.field388 = arg3;
        field392 = arg0;
        try {
            field396 = System.getProperty(field401[0]);
            field381 = System.getProperty(field401[21]);
        } catch (Exception var20) {
        }
        if (field396.toLowerCase().indexOf(field401[22]) != -1) {
            this.field395 = true;
        }
        try {
            field369 = System.getProperty(field401[16]);
        } catch (Exception var19) {
            field369 = field401[8];
        }
        field386 = field369.toLowerCase();
        try {
            field372 = System.getProperty(field401[3]).toLowerCase();
        } catch (Exception var18) {
            field372 = "";
        }
        try {
            field385 = System.getProperty(field401[5]).toLowerCase();
        } catch (Exception var17) {
            field385 = "";
        }
        try {
            field371 = System.getProperty(field401[20]);
            if (field371 != null) {
                field371 = field371 + "/";
            }
        } catch (Exception var16) {
        }
        if (field371 == null) {
            field371 = field401[15];
        }
        try {
            this.field387 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var15) {
        }
        if (!this.field395) {
            try {
                field380 = Class.forName(field401[14]).getDeclaredMethod(field401[1], Boolean.TYPE);
            } catch (Exception var14) {
            }
            try {
                field393 = Class.forName(field401[7]).getDeclaredMethod(field401[10], Boolean.TYPE);
            } catch (Exception var13) {
            }
        }
        class345.method2858((byte) -23, field392, field394);
        if (this.field388) {
            this.field389 = new class236(class345.method2859(false, field401[6], field392, null), field401[18], 25L);
            this.field373 = new class236(class345.method2857(field401[4], (byte) -51), field401[18], 314572800L);
            this.field376 = new class236(class345.method2857(field401[17], (byte) -32), field401[18], 1048576L);
            this.field390 = new class236[arg2];
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field390[var5] = new class236(class345.method2857(field401[13] + var5, (byte) -76), field401[18], 1048576L);
            }
            if (this.field395) {
                try {
                    this.field379 = Class.forName(field401[12]).getDeclaredConstructor().newInstance();
                } catch (Throwable var12) {
                }
            }
            try {
                if (this.field395) {
                    this.field378 = new class249();
                } else {
                    this.field384 = Class.forName(field401[9]).getDeclaredConstructor().newInstance();
                }
            } catch (Throwable var11) {
            }
            try {
                if (this.field395) {
                    this.field370 = new class347();
                } else {
                    this.field383 = Class.forName(field401[19]).getDeclaredConstructor().newInstance();
                }
            } catch (Throwable var10) {
            }
        }
        if (this.field388 && !this.field395) {
            ThreadGroup var6 = Thread.currentThread().getThreadGroup();
            for (ThreadGroup var7 = var6.getParent(); var7 != null; var7 = var7.getParent()) {
                var6 = var7;
            }
            Thread[] var8 = new Thread[1000];
            var6.enumerate(var8);
            for (int var9 = 0; var9 < var8.length; var9++) {
                if (var8[var9] != null && var8[var9].getName().startsWith(field401[2])) {
                    var8[var9].setPriority(1);
                }
            }
        }
        this.field377 = false;
        this.field374 = new Thread(this);
        this.field374.setPriority(10);
        this.field374.setDaemon(true);
        this.field374.start();
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method231(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!mca", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method232(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x3F);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!mca", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method233(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 10;
                    break;
                case 1:
                    var10005 = 92;
                    break;
                case 2:
                    var10005 = 36;
                    break;
                case 3:
                    var10005 = 71;
                    break;
                default:
                    var10005 = 63;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
