import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class163 extends class38 implements class103 {

    @OriginalMember(owner = "client!qa", name = "nativeid", descriptor = "J")
    public long nativeid = 0L;

    @OriginalMember(owner = "client!qa", name = "r", descriptor = "Lar;")
    private class479 field2441 = new class479();

    @OriginalMember(owner = "client!qa", name = "F", descriptor = "I")
    private int field2455 = 4096;

    @OriginalMember(owner = "client!qa", name = "E", descriptor = "I")
    private int field2454 = 4096;

    @OriginalMember(owner = "client!qa", name = "J", descriptor = "Lmn;")
    private class247 field2459 = new class247(4);

    @OriginalMember(owner = "client!qa", name = "L", descriptor = "Z")
    private boolean field2461 = false;

    @OriginalMember(owner = "client!qa", name = "C", descriptor = "Lc;")
    private class122 field2452;

    @OriginalMember(owner = "client!qa", name = "s", descriptor = "[I")
    private static int[] field2442 = new int[Math.max(Math.max(80, 20), 24573)];

    @OriginalMember(owner = "client!qa", name = "u", descriptor = "[S")
    private static short[] field2444 = new short[8191];

    @OriginalMember(owner = "client!qa", name = "w", descriptor = "[I")
    public static int[] field2446 = new int[6];

    @OriginalMember(owner = "client!qa", name = "y", descriptor = "[F")
    private static float[] field2448 = new float[20];

    @OriginalMember(owner = "client!qa", name = "v", descriptor = "[B")
    private static byte[] field2445 = new byte[8191];

    @OriginalMember(owner = "client!qa", name = "t", descriptor = "[I")
    private static int[] field2443 = new int[8191];

    @OriginalMember(owner = "client!qa", name = "A", descriptor = "[I")
    public static int[] field2450 = field2442;

    @OriginalMember(owner = "client!qa", name = "G", descriptor = "[I")
    private static int[] field2456 = field2442;

    @OriginalMember(owner = "client!qa", name = "B", descriptor = "[I")
    private static int[] field2451 = new int[8191];

    @OriginalMember(owner = "client!qa", name = "x", descriptor = "Ljava/lang/Boolean;")
    private static Boolean field2447 = Boolean.FALSE;

    @OriginalMember(owner = "client!qa", name = "z", descriptor = "[F")
    private static float[] field2449 = field2448;

    @OriginalMember(owner = "client!qa", name = "H", descriptor = "[I")
    private static int[] field2457 = field2442;

    @OriginalMember(owner = "client!qa", name = "K", descriptor = "I")
    private int field2460;

    @OriginalMember(owner = "client!qa", name = "D", descriptor = "Lza;")
    private class286 field2453;

    @OriginalMember(owner = "client!qa", name = "q", descriptor = "Lna;")
    private class35 field2440;

    @OriginalMember(owner = "client!qa", name = "I", descriptor = "Ljava/awt/Canvas;")
    private Canvas field2458;

    @OriginalMember(owner = "client!qa", name = "N", descriptor = "[Ln;")
    private class15[] field2462;

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "(I)V", line = 4)
    public final void method326(int arg0) {
        this.field2462[arg0].method69();
    }

    @OriginalMember(owner = "client!qa", name = "A", descriptor = "()V", line = 8)
    public final void method320() {
    }

    @OriginalMember(owner = "client!qa", name = "t", descriptor = "()Z", line = 12)
    public final boolean method298() {
        return true;
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(II)I", line = 17)
    public final int method288(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "()V", line = 22)
    public final void method240() {
        for (class35 var1 = (class35) this.field2441.method2818((byte) -110); var1 != null; var1 = (class35) this.field2441.method2820((byte) -58)) {
            var1.method209();
        }
        this.field2441.method2814((byte) 104);
        this.method1090();
        if (this.field2461) {
            class51.method446(false, false, true);
            this.field2461 = false;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 40)
    public final void method239(Canvas arg0) {
        class286 var2 = (class286) this.field2459.method1492((long) arg0.hashCode(), 6340);
        Dimension var3 = arg0.getSize();
        var2.method1704(arg0, var3.width, var3.height);
        if (arg0 != null && this.field2458 == arg0) {
            this.method266(arg0);
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIF)Ljd;", line = 50)
    public final class153 method323(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return new class507(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(II)I", line = 54)
    public final int method257(int arg0, int arg1) {
        int var3 = arg0 & 1048575;
        int var4 = arg1 & 1048575;
        return var3 & var4 ^ var4;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(FFF)V", line = 60)
    public final void method254(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "(I)V", line = 63)
    public final void method281(int arg0) {
        class1.method2(-2757);
        this.method1076(arg0);
        for (class35 var2 = (class35) this.field2441.method2818((byte) -2); var2 != null; var2 = (class35) this.field2441.method2820((byte) -58)) {
            var2.method208();
        }
    }

    @OriginalMember(owner = "client!qa", name = "r", descriptor = "()Z", line = 76)
    public final boolean method294() {
        return true;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)V", line = 80)
    public final void method221(int arg0) {
        this.field2462[arg0].method68();
    }

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(ILjava/awt/Canvas;Lga;Ldr;)V", line = 87)
    public class163(int arg0, Canvas arg1, class277 arg2, class504 arg3) {
        super(arg0, arg2);
        try {
            if (!field2447) {
                if (arg3 != null) {
                    arg3.method2977(this.getClass(), false);
                    field2447 = Boolean.TRUE;
                } else {
                    System.loadLibrary("jawt");
                    System.loadLibrary("sw3d");
                    field2447 = Boolean.TRUE;
                }
            }
            if (!field2447) {
                throw new RuntimeException("");
            } else {
                this.method1088(super.field471, 0, 0);
                class235.method1450(true, false, 5);
                this.field2461 = true;
                if (arg1 != null) {
                    this.method270(arg1);
                    this.method266(arg1);
                }
                this.field2452 = new class31();
                this.method299(new class31());
                this.method248(1);
                this.method221(0);
            }
        } catch (Throwable var5) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lmh;Lmh;FLmh;)Lmh;", line = 129)
    public final class444 method277(class444 arg0, class444 arg1, float arg2, class444 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!qa", name = "m", descriptor = "()Z", line = 132)
    public final boolean method276() {
        return true;
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(Z)V", line = 134)
    public final void method247(boolean arg0) {
    }

    @OriginalMember(owner = "client!qa", name = "x", descriptor = "()Z", line = 137)
    public final boolean method309() {
        return false;
    }

    @OriginalMember(owner = "client!qa", name = "B", descriptor = "()V", line = 139)
    public final void method322() {
    }

    @OriginalMember(owner = "client!qa", name = "q", descriptor = "()Z", line = 143)
    public final boolean method287() {
        return false;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Ldq;[Lft;Z)Lla;", line = 146)
    public final class315 method324(class490 arg0, class4[] arg1, boolean arg2) {
        return arg2 ? new class184(this, this.field2440, arg0, arg1, (class16[]) null) : new class330(this, this.field2440, arg0, arg1, (class16[]) null);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lt;Lpn;Lc;Lii;I)V", line = 156)
    public final void method312(class471 arg0, class523 arg1, class122 arg2, class387 arg3, int arg4) {
        this.method1078(arg1, true);
        if (arg3 == null) {
            this.method1086().method81(this, arg0, arg2, (int[]) null, arg4, field2456, field2451, field2443, field2444, field2445, arg1.field7740.method910(0), field2450);
        } else {
            field2446[5] = 0;
            this.method1086().method81(this, arg0, arg2, field2446, arg4, field2456, field2451, field2443, field2444, field2445, arg1.field7740.method910(0), field2450);
            arg3.field5643 = field2446[0];
            arg3.field5645 = field2446[1];
            arg3.field5640 = field2446[2];
            arg3.field5642 = field2446[3];
            arg3.field5641 = field2446[4];
            arg3.field5644 = field2446[5] != 0;
        }
        class43 var6 = (class43) arg0;
        var6.method377(0, arg2);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIII)V", line = 177)
    public final void method227(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method1086().method78(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "()Z", line = 181)
    public final boolean method249() {
        return true;
    }

    @OriginalMember(owner = "client!qa", name = "finalize", descriptor = "()V", line = 184)
    protected final void finalize() {
        this.method66();
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(II[I[I)Lma;", line = 187)
    public final class10 method258(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class137(this, this.field2440, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "(I)V", line = 191)
    public final void method292(int arg0) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lpn;Z)V", line = 195)
    private final void method1078(class523 arg0, boolean arg1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        for (class219 var8 = (class219) arg0.field7740.method908(-117); var8 != null; var8 = (class219) arg0.field7740.method913((byte) 91)) {
            field2456[var3++] = var8.field3050;
            field2456[var3++] = var8.field3053;
            field2456[var3++] = var8.field3055;
            field2451[var4++] = var8.field3058;
            field2444[var6++] = (short) var8.field3056;
            field2443[var5++] = var8.field3049;
            if (arg1) {
                field2445[var7++] = var8.field3057;
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lu;)V", line = 229)
    public final void method290(class53 arg0) {
        this.field2440 = (class35) arg0;
        this.method1084(arg0);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIIIIII)V", line = 233)
    public final void method328(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(IIIIII)V", line = 236)
    public final void method285(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1075(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIII)V", line = 240)
    public final void method306(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(Z)V", line = 243)
    public final void method321(boolean arg0) {
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lpn;)V", line = 246)
    public final void method316(class523 arg0) {
        this.method1078(arg0, false);
        this.method1086().method70(this, field2456, field2451, field2443, field2444, arg0.field7740.method910(0));
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIILma;II)V", line = 250)
    public final void method317(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class10 arg6, int arg7, int arg8) {
        this.method1081(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!qa", name = "k", descriptor = "()Z", line = 253)
    public final boolean method273() {
        return false;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(I[Ljd;)V", line = 257)
    public final void method255(int arg0, class153[] arg1) {
        int var3 = 0;
        for (int var4 = 0; var4 < arg0; ++var4) {
            field2457[var3++] = arg1[var4].method1026(true);
            field2457[var3++] = arg1[var4].method1025((byte) -64);
            field2457[var3++] = arg1[var4].method1027(-601);
            field2457[var3++] = arg1[var4].method1029((byte) -122);
            field2449[var4] = arg1[var4].method1023((byte) -109);
            field2457[var3++] = arg1[var4].method1021(14919);
        }
        this.method1089(arg0, field2457, field2449);
    }

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "()V", line = 274)
    public final void method236() {
    }

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(Ljava/awt/Canvas;)V", line = 278)
    public final void method270(Canvas arg0) {
        class286 var2 = (class286) this.field2459.method1492((long) arg0.hashCode(), 6340);
        if (var2 == null) {
            try {
                Class var3 = Class.forName("java.awt.Canvas");
                Method var4 = var3.getMethod("setIgnoreRepaint", Boolean.TYPE);
                var4.invoke(arg0, Boolean.TRUE);
            } catch (Exception var6) {
            }
            class286 var5 = new class286(this, arg0);
            this.field2459.method1487(-35, (long) arg0.hashCode(), var5);
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIZ)Ll;", line = 300)
    public final class16 method275(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        return arg4 ? new class71(this, this.field2440, arg0, arg1, arg2, arg3) : new class415(this, this.field2440, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "([Lt;Lpn;Lc;[Lii;I)V", line = 307)
    public final void method242(class471[] arg0, class523 arg1, class122 arg2, class387[] arg3, int arg4) {
        this.method1078(arg1, true);
        if (arg3 == null) {
            this.method1086().method75(this, arg0, arg2, (int[]) null, arg4, field2456, field2451, field2443, field2444, field2445, arg1.field7740.method910(0), field2450);
        } else {
            class387 var6 = arg3[0];
            field2446[5] = 0;
            this.method1086().method75(this, arg0, arg2, field2446, arg4, field2456, field2451, field2443, field2444, field2445, arg1.field7740.method910(0), field2450);
            var6.field5643 = field2446[0];
            var6.field5645 = field2446[1];
            var6.field5640 = field2446[2];
            var6.field5642 = field2446[3];
            var6.field5641 = field2446[4];
            var6.field5644 = field2446[5] != 0;
        }
        int var7 = 0;
        for (int var8 = 0; var8 < arg0.length; ++var8) {
            if (arg0[var8] != null) {
                class43 var9 = (class43) arg0[var8];
                var9.method377(var7, arg2);
                if (var9.field530 != null) {
                    var7 += var9.field530.length * 9;
                }
                if (var9.field529 != null) {
                    var7 += var9.field529.length * 3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "([Lt;Lc;[Lii;I)V", line = 350)
    public final void method226(class471[] arg0, class122 arg1, class387[] arg2, int arg3) {
        if (arg2 == null) {
            this.method1086().method73(this, arg0, arg1, (int[]) null, -1, arg3);
        } else {
            class387 var5 = arg2[0];
            field2446[5] = 0;
            this.method1086().method73(this, arg0, arg1, field2446, -1, arg3);
            var5.field5643 = field2446[0];
            var5.field5645 = field2446[1];
            var5.field5640 = field2446[2];
            var5.field5642 = field2446[3];
            var5.field5641 = field2446[4];
            var5.field5644 = field2446[5] != 0;
        }
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(I)V", line = 370)
    public final void method248(int arg0) {
        this.field2460 = arg0;
        this.field2462 = new class15[this.field2460];
        for (int var2 = 0; var2 < this.field2460; ++var2) {
            this.field2462[var2] = new class15(this, this.field2455, this.field2454);
        }
    }

    @OriginalMember(owner = "client!qa", name = "s", descriptor = "()Z", line = 383)
    public final boolean method297() {
        return false;
    }

    @OriginalMember(owner = "client!qa", name = "sa", descriptor = "(S)Z", line = 399)
    private final boolean method1082(short arg0) {
        class277 var2 = super.field471;
        synchronized (super.field471) {
            if (!super.field471.method1652(arg0, 29423)) {
                return false;
            } else {
                class166 var4 = super.field471.method1654(20, arg0);
                if (var4 == null) {
                    return false;
                } else {
                    int[] var6;
                    if (var4.field2501 && var4.field2494) {
                        var6 = super.field471.method1650(128, arg0, true, 0.7F, true, 128);
                    } else {
                        var6 = super.field471.method1651(128, (byte) -87, arg0, true, 0.7F, 128);
                    }
                    this.method1077(arg0, var4.field2486, var4.field2499, var4.field2494, var4.field2501, var4.field2493, var4.field2488, var4.field2495, var4.field2492, var4.field2484, var4.field2500, var4.field2503, var4.field2497, var6);
                    return true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "R", descriptor = "(S)Z", line = 424)
    private final boolean method1083(short arg0) {
        synchronized (this) {
            class166 var3 = super.field471.method1654(92, arg0);
            if (var3 == null) {
                return false;
            } else {
                this.method1079(arg0, var3.field2486, var3.field2499, var3.field2494, var3.field2501, var3.field2493, var3.field2488, var3.field2495, var3.field2492, var3.field2484, var3.field2500, var3.field2503, var3.field2497);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "y", descriptor = "()Lc;", line = 436)
    public final class122 method310() {
        return new class31();
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V", line = 443)
    public final void method228(Rectangle[] arg0, int arg1) {
        int var3 = 0;
        while (var3 < 9) {
            try {
                for (int var4 = 0; var4 < arg1; ++var4) {
                    Rectangle var5 = arg0[var4];
                    if (var5.width > 0 && var5.height > 0) {
                        synchronized (this.field2458.getTreeLock()) {
                            this.field2453.method1705(var5.x, var5.y, var5.width, var5.height);
                        }
                    }
                }
                return;
            } catch (Exception var12) {
                class157.method1046(-128, 200L);
                ++var3;
            }
        }
        for (int var7 = 0; var7 < arg1; ++var7) {
            Rectangle var8 = arg0[var7];
            if (var8.width > 0 && var8.height > 0) {
                synchronized (this.field2458.getTreeLock()) {
                    this.field2453.method1705(var8.x, var8.y, var8.width, var8.height);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "j", descriptor = "()I", line = 490)
    public final int method263() {
        return 4;
    }

    @OriginalMember(owner = "client!qa", name = "C", descriptor = "()V", line = 496)
    public final void method329() {
    }

    @OriginalMember(owner = "client!qa", name = "SA", descriptor = "()Ljava/lang/Object;", line = 503)
    private final Object method1085() {
        return new class145();
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "([IIIII)Ll;", line = 507)
    public final class16 method244(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        boolean var6 = false;
        int var7 = arg1;
        for (int var8 = 0; var8 < arg4; ++var8) {
            for (int var9 = 0; var9 < arg3; ++var9) {
                int var10 = arg0[var7++] >>> 24;
                if (var10 != 0 && var10 != 255) {
                    var6 = true;
                    return var6 ? new class71(this, this.field2440, arg0, arg1, arg2, arg3, arg4) : new class415(this, this.field2440, arg0, arg1, arg2, arg3, arg4);
                }
            }
        }
        return var6 ? new class71(this, this.field2440, arg0, arg1, arg2, arg3, arg4) : new class415(this, this.field2440, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!qa", name = "D", descriptor = "()Ln;", line = 544)
    public final class15 method1086() {
        for (int var1 = 0; var1 < this.field2460; ++var1) {
            if (this.field2462[var1].field221 == Thread.currentThread()) {
                return this.field2462[var1];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(II[[I[[IIII)Lta;", line = 557)
    public final class142 method304(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class42(this, this.field2440, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!qa", name = "ha", descriptor = "()V", line = 560)
    private final void method1087() {
        System.gc();
        System.runFinalization();
        class1.method2(-2757);
    }

    @OriginalMember(owner = "client!qa", name = "z", descriptor = "()Z", line = 567)
    public final boolean method314() {
        return true;
    }

    @OriginalMember(owner = "client!qa", name = "o", descriptor = "()Lc;", line = 570)
    public final class122 method280() {
        return this.field2452;
    }

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "()Z", line = 573)
    public final boolean method261() {
        return false;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lft;Z)Ll;", line = 577)
    public final class16 method265(class4 arg0, boolean arg1) {
        int[] var3 = arg0.field40;
        byte[] var4 = arg0.field34;
        int var5 = arg0.field41;
        int var6 = arg0.field36;
        class16 var7;
        if (arg1 && arg0.field39 == null) {
            var7 = new class396(this, this.field2440, var3, var4, 0, arg0.field41, arg0.field41, arg0.field36);
        } else {
            int var8 = var5 * var6;
            int[] var9 = new int[var8];
            byte[] var10 = arg0.field39;
            if (var10 != null) {
                for (int var11 = 0; var11 < var6; ++var11) {
                    int var12 = var5 * var11;
                    for (int var13 = 0; var13 < var5; ++var13) {
                        var9[var12 + var13] = var3[var4[var12 + var13] & 255] | var10[var12 + var13] << 24;
                    }
                }
                var7 = new class71(this, this.field2440, var9, 0, var5, var5, var6);
            } else {
                boolean var14 = false;
                for (int var15 = 0; var15 < var8; ++var15) {
                    int var16 = arg0.field40[var4[var15] & 255];
                    if (var16 >>> 24 != 255) {
                        var14 = true;
                    }
                    var9[var15] = var16;
                }
                if (var14) {
                    var7 = new class71(this, this.field2440, var9, 0, arg0.field41, arg0.field41, arg0.field36);
                } else {
                    var7 = new class415(this, this.field2440, var9, 0, arg0.field41, arg0.field41, arg0.field36);
                }
            }
        }
        var7.method97(arg0.field37, arg0.field33, arg0.field38, arg0.field35);
        return var7;
    }

    @OriginalMember(owner = "client!qa", name = "u", descriptor = "()Z", line = 652)
    public final boolean method301() {
        return true;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIII)V", line = 655)
    public final void method253(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method293(arg0, arg1, arg2, arg4, arg5);
        this.method293(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method225(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
        this.method225(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Z)V", line = 660)
    public final void method235(boolean arg0) {
    }

    @OriginalMember(owner = "client!qa", name = "p", descriptor = "()Z", line = 666)
    public final boolean method282() {
        return true;
    }

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "(IIIIII)Lmh;", line = 669)
    public final class444 method303(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lkq;IIII)Lt;", line = 673)
    public final class471 method231(class419 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class43(this, this.field2440, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 688)
    public final void method266(Canvas arg0) {
        if (arg0 != null) {
            class286 var2 = (class286) this.field2459.method1492((long) arg0.hashCode(), 6340);
            this.field2458 = arg0;
            this.field2453 = var2;
            this.method1080(var2);
        } else {
            this.field2458 = null;
            this.field2453 = null;
            this.method1080((class286) null);
        }
    }

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "()V", line = 709)
    public final void method229() {
        int var1 = 0;
        while (var1 < 9) {
            try {
                synchronized (this.field2458.getTreeLock()) {
                    this.field2453.method1703();
                    return;
                }
            } catch (Exception var6) {
                class157.method1046(-128, 200L);
                ++var1;
            }
        }
        synchronized (this.field2458.getTreeLock()) {
            this.field2453.method1703();
        }
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "()Z", line = 736)
    public final boolean method223() {
        return true;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lmh;)V", line = 748)
    public final void method315(class444 arg0) {
    }

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "(Ljava/awt/Canvas;)V", line = 759)
    public final void method302(Canvas arg0) {
        if (this.field2458 == arg0) {
            this.method266((Canvas) null);
        }
        class286 var2 = (class286) this.field2459.method1492((long) arg0.hashCode(), 6340);
        if (var2 != null) {
            var2.method1565(0);
        }
        var2.method1706();
    }

    @OriginalMember(owner = "client!qa", name = "n", descriptor = "()Z", line = 770)
    public final boolean method278() {
        return false;
    }

    @OriginalMember(owner = "client!qa", name = "v", descriptor = "()Z", line = 777)
    public final boolean method308() {
        return false;
    }

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "(I)Lu;", line = 796)
    public final class53 method274(int arg0) {
        class35 var2 = new class35(this, arg0);
        this.field2441.method2809(var2, 2);
        return var2;
    }

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "()V", line = 804)
    public final void method262() {
    }

    @OriginalMember(owner = "client!qa", name = "ca", descriptor = "(ILma;II)V")
    public final native void method291(int arg0, class10 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "W", descriptor = "()F")
    public final native float method259();

    @OriginalMember(owner = "client!qa", name = "RA", descriptor = "(IIIIII)V")
    private final native void method1075(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!qa", name = "AA", descriptor = "(IIII)V")
    public final native void method327(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "xa", descriptor = "()F")
    public final native float method271();

    @OriginalMember(owner = "client!qa", name = "MA", descriptor = "(I)V")
    public final native void method269(int arg0);

    @OriginalMember(owner = "client!qa", name = "UA", descriptor = "(III)V")
    public final native void method241(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!qa", name = "H", descriptor = "(IIII)V")
    public final native void method296(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "ma", descriptor = "(I)V")
    private final native void method1076(int arg0);

    @OriginalMember(owner = "client!qa", name = "q", descriptor = "(SBBZZZBBBIIZZ[I)V")
    private final native void method1077(short arg0, byte arg1, byte arg2, boolean arg3, boolean arg4, boolean arg5, byte arg6, byte arg7, byte arg8, int arg9, int arg10, boolean arg11, boolean arg12, int[] arg13);

    @OriginalMember(owner = "client!qa", name = "ZA", descriptor = "()I")
    public final native int method283();

    @OriginalMember(owner = "client!qa", name = "fa", descriptor = "(IIII)V")
    public final native void method250(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "aa", descriptor = "(SBBZZZBBBIIZZ)V")
    private final native void method1079(short arg0, byte arg1, byte arg2, boolean arg3, boolean arg4, boolean arg5, byte arg6, byte arg7, byte arg8, int arg9, int arg10, boolean arg11, boolean arg12);

    @OriginalMember(owner = "client!qa", name = "T", descriptor = "(IFFFFF)V")
    public final native void method232(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!qa", name = "PA", descriptor = "(Lza;)V")
    private final native void method1080(class286 arg0);

    @OriginalMember(owner = "client!qa", name = "da", descriptor = "([I)V")
    public final native void method234(int[] arg0);

    @OriginalMember(owner = "client!qa", name = "YA", descriptor = "()I")
    public final native int method237();

    @OriginalMember(owner = "client!qa", name = "A", descriptor = "(IIIIIILma;II)V")
    private final native void method1081(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class10 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "()I")
    public final native int method224();

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "(FF)V")
    public final native void method245(float arg0, float arg1);

    @OriginalMember(owner = "client!qa", name = "OA", descriptor = "(IIII)V")
    public final native void method279(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "B", descriptor = "(F)V")
    public final native void method252(float arg0);

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(IIIII)V")
    public final native void method293(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!qa", name = "O", descriptor = "(IIIIII)V")
    public final native void method243(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!qa", name = "JA", descriptor = "(IIIIII)Z")
    public final native boolean method286(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!qa", name = "X", descriptor = "(III[I)V")
    public final native void method256(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!qa", name = "TA", descriptor = "(IIIII)V")
    public final native void method225(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!qa", name = "ea", descriptor = "(Lc;)V")
    public final native void method299(class122 arg0);

    @OriginalMember(owner = "client!qa", name = "GA", descriptor = "(IIII)V")
    public final native void method305(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "IA", descriptor = "()I")
    public final native int method313();

    @OriginalMember(owner = "client!qa", name = "ia", descriptor = "(II)V")
    public final native void method311(int arg0, int arg1);

    @OriginalMember(owner = "client!qa", name = "I", descriptor = "(Lu;)V")
    private final native void method1084(class53 arg0);

    @OriginalMember(owner = "client!qa", name = "F", descriptor = "(IIII)[I")
    public final native int[] method251(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "NA", descriptor = "(IIIII)V")
    public final native void method300(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!qa", name = "K", descriptor = "(Lga;II)V")
    private final native void method1088(class277 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!qa", name = "EA", descriptor = "()V")
    public final native void method66();

    @OriginalMember(owner = "client!qa", name = "za", descriptor = "(I[I[F)V")
    private final native void method1089(int arg0, int[] arg1, float[] arg2);

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "()V")
    public final native void method260();

    @OriginalMember(owner = "client!qa", name = "w", descriptor = "()I")
    public final native int method272();

    @OriginalMember(owner = "client!qa", name = "p", descriptor = "(I)V")
    public final native void method246(int arg0);

    @OriginalMember(owner = "client!qa", name = "DA", descriptor = "(IIIIII[BII)V")
    public final native void method268(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!qa", name = "FA", descriptor = "()V")
    private final native void method1090();

    @OriginalMember(owner = "client!qa", name = "l", descriptor = "()V")
    public final native void method222();
}
