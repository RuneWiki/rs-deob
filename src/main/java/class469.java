import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class469 extends class162 implements class276 {

    @OriginalMember(owner = "client!h", name = "nativeid", descriptor = "J")
    public long nativeid = 0L;

    @OriginalMember(owner = "client!h", name = "t", descriptor = "Lug;")
    private class392 field6972 = new class392();

    @OriginalMember(owner = "client!h", name = "J", descriptor = "I")
    private int field6987 = 4096;

    @OriginalMember(owner = "client!h", name = "K", descriptor = "I")
    private int field6988 = 4096;

    @OriginalMember(owner = "client!h", name = "N", descriptor = "Lan;")
    private class20 field6991 = new class20(4);

    @OriginalMember(owner = "client!h", name = "O", descriptor = "Z")
    private boolean field6992 = false;

    @OriginalMember(owner = "client!h", name = "L", descriptor = "Lia;")
    private class414 field6989;

    @OriginalMember(owner = "client!h", name = "u", descriptor = "[I")
    private static int[] field6973 = new int[Math.max(Math.max(80, 20), 24573)];

    @OriginalMember(owner = "client!h", name = "y", descriptor = "[I")
    private static int[] field6977 = new int[8191];

    @OriginalMember(owner = "client!h", name = "B", descriptor = "[F")
    private static float[] field6980 = new float[20];

    @OriginalMember(owner = "client!h", name = "C", descriptor = "[I")
    public static int[] field6981 = field6973;

    @OriginalMember(owner = "client!h", name = "w", descriptor = "[I")
    private static int[] field6975 = new int[8191];

    @OriginalMember(owner = "client!h", name = "z", descriptor = "Ljava/lang/Boolean;")
    private static Boolean field6978 = Boolean.FALSE;

    @OriginalMember(owner = "client!h", name = "E", descriptor = "[I")
    private static int[] field6983 = field6973;

    @OriginalMember(owner = "client!h", name = "D", descriptor = "[I")
    private static int[] field6982 = field6973;

    @OriginalMember(owner = "client!h", name = "A", descriptor = "[I")
    public static int[] field6979 = new int[6];

    @OriginalMember(owner = "client!h", name = "x", descriptor = "[F")
    private static float[] field6976 = field6980;

    @OriginalMember(owner = "client!h", name = "H", descriptor = "[B")
    private static byte[] field6985 = new byte[8191];

    @OriginalMember(owner = "client!h", name = "G", descriptor = "[S")
    private static short[] field6984 = new short[8191];

    @OriginalMember(owner = "client!h", name = "Q", descriptor = "I")
    private int field6994;

    @OriginalMember(owner = "client!h", name = "v", descriptor = "Lba;")
    private class262 field6974;

    @OriginalMember(owner = "client!h", name = "M", descriptor = "Lla;")
    private class312 field6990;

    @OriginalMember(owner = "client!h", name = "I", descriptor = "Ljava/awt/Canvas;")
    private Canvas field6986;

    @OriginalMember(owner = "client!h", name = "P", descriptor = "[Lma;")
    private class10[] field6993;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIII)V", line = 3)
    public final void method201(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method2778().method58(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!h", name = "s", descriptor = "()V", line = 9)
    public final void method203() {
        int var1 = 0;
        while (var1 < 9) {
            try {
                synchronized (this.field6986.getTreeLock()) {
                    this.field6990.method2051();
                    return;
                }
            } catch (Exception var6) {
                class71.method583(200L, -111);
                ++var1;
            }
        }
        synchronized (this.field6986.getTreeLock()) {
            this.field6990.method2051();
        }
    }

    @OriginalMember(owner = "client!h", name = "k", descriptor = "()Z", line = 28)
    public final boolean method219() {
        return false;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIILea;II)V", line = 32)
    public final void method235(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class381 arg6, int arg7, int arg8) {
        this.method2786(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!h", name = "c", descriptor = "(Ljava/awt/Canvas;)V", line = 36)
    public final void method250(Canvas arg0) {
        if (this.field6986 == arg0) {
            this.method225((Canvas) null);
        }
        class312 var2 = (class312) this.field6991.method171((byte) -116, (long) arg0.hashCode());
        if (var2 != null) {
            var2.method2090(-1);
        }
        var2.method2049();
    }

    @OriginalMember(owner = "client!h", name = "f", descriptor = "(I)V", line = 48)
    public final void method212(int arg0) {
        this.field6993[arg0].method62();
    }

    @OriginalMember(owner = "client!h", name = "c", descriptor = "()Z", line = 51)
    public final boolean method223() {
        return true;
    }

    @OriginalMember(owner = "client!h", name = "finalize", descriptor = "()V", line = 54)
    protected final void finalize() {
        this.method59();
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lsh;)V", line = 58)
    public final void method268(class49 arg0) {
        this.method2789(arg0, false);
        this.method2778().method53(this, field6982, field6977, field6975, field6984, arg0.field892.method1533(29));
    }

    @OriginalMember(owner = "client!h", name = "r", descriptor = "()Z", line = 63)
    public final boolean method226() {
        return true;
    }

    @OriginalMember(owner = "client!h", name = "z", descriptor = "()Z", line = 66)
    public final boolean method287() {
        return false;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIIIIII)V", line = 72)
    public final void method244(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "([Lc;Lsh;Lia;[Llc;I)V", line = 76)
    public final void method272(class121[] arg0, class49 arg1, class414 arg2, class456[] arg3, int arg4) {
        this.method2789(arg1, true);
        if (arg3 == null) {
            this.method2778().method61(this, arg0, arg2, (int[]) null, arg4, field6982, field6977, field6975, field6984, field6985, arg1.field892.method1533(103), field6981);
        } else {
            class456 var6 = arg3[0];
            field6979[5] = 0;
            this.method2778().method61(this, arg0, arg2, field6979, arg4, field6982, field6977, field6975, field6984, field6985, arg1.field892.method1533(34), field6981);
            var6.field6812 = field6979[0];
            var6.field6813 = field6979[1];
            var6.field6810 = field6979[2];
            var6.field6811 = field6979[3];
            var6.field6814 = field6979[4];
            var6.field6809 = field6979[5] != 0;
        }
        int var7 = 0;
        for (int var8 = 0; var8 < arg0.length; ++var8) {
            if (arg0[var8] != null) {
                class144 var9 = (class144) arg0[var8];
                var9.method1058(var7, arg2);
                if (var9.field2255 != null) {
                    var7 += var9.field2255.length * 9;
                }
                if (var9.field2252 != null) {
                    var7 += var9.field2252.length * 3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "y", descriptor = "()I", line = 118)
    public final int method293() {
        return 4;
    }

    @OriginalMember(owner = "client!h", name = "c", descriptor = "(IIIIII)V", line = 122)
    public final void method282(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method2775(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!h", name = "ZA", descriptor = "()V", line = 131)
    private final void method2776() {
        System.gc();
        System.runFinalization();
        class379.method2354(false);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V", line = 138)
    public final void method227(Rectangle[] arg0, int arg1) {
        int var3 = 0;
        while (var3 < 9) {
            try {
                for (int var4 = 0; var4 < arg1; ++var4) {
                    Rectangle var5 = arg0[var4];
                    if (var5.width > 0 && var5.height > 0) {
                        synchronized (this.field6986.getTreeLock()) {
                            this.field6990.method2050(var5.x, var5.y, var5.width, var5.height);
                        }
                    }
                }
                return;
            } catch (Exception var12) {
                class71.method583(200L, 125);
                ++var3;
            }
        }
        for (int var7 = 0; var7 < arg1; ++var7) {
            Rectangle var8 = arg0[var7];
            if (var8.width > 0 && var8.height > 0) {
                synchronized (this.field6986.getTreeLock()) {
                    this.field6990.method2050(var8.x, var8.y, var8.width, var8.height);
                }
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "c", descriptor = "(Z)V", line = 190)
    public final void method210(boolean arg0) {
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lbi;Lbi;FLbi;)Lbi;", line = 193)
    public final class333 method295(class333 arg0, class333 arg1, float arg2, class333 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(II[I[I)Lea;", line = 196)
    public final class381 method294(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class198(this, this.field6974, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!h", name = "f", descriptor = "()V", line = 200)
    public final void method303() {
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(II[[I[[IIII)Lna;", line = 203)
    public final class35 method273(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class218(this, this.field6974, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!h", name = "B", descriptor = "()Z", line = 206)
    public final boolean method264() {
        return false;
    }

    @OriginalMember(owner = "client!h", name = "d", descriptor = "(Ljava/awt/Canvas;)V", line = 210)
    public final void method225(Canvas arg0) {
        if (arg0 != null) {
            class312 var2 = (class312) this.field6991.method171((byte) -105, (long) arg0.hashCode());
            this.field6986 = arg0;
            this.field6990 = var2;
            this.method2781(var2);
        } else {
            this.field6986 = null;
            this.field6990 = null;
            this.method2781((class312) null);
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lc;Lsh;Lia;Llc;I)V", line = 227)
    public final void method249(class121 arg0, class49 arg1, class414 arg2, class456 arg3, int arg4) {
        this.method2789(arg1, true);
        if (arg3 == null) {
            this.method2778().method69(this, arg0, arg2, (int[]) null, arg4, field6982, field6977, field6975, field6984, field6985, arg1.field892.method1533(126), field6981);
        } else {
            field6979[5] = 0;
            this.method2778().method69(this, arg0, arg2, field6979, arg4, field6982, field6977, field6975, field6984, field6985, arg1.field892.method1533(123), field6981);
            arg3.field6812 = field6979[0];
            arg3.field6813 = field6979[1];
            arg3.field6810 = field6979[2];
            arg3.field6811 = field6979[3];
            arg3.field6814 = field6979[4];
            arg3.field6809 = field6979[5] != 0;
        }
        class144 var6 = (class144) arg0;
        var6.method1058(0, arg2);
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "()Z", line = 249)
    public final boolean method232() {
        return true;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIII)V", line = 254)
    public final void method207(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "(ILjava/awt/Canvas;Lm;Lli;)V", line = 259)
    public class469(int arg0, Canvas arg1, class126 arg2, class293 arg3) {
        super(arg0, arg2);
        try {
            if (!field6978) {
                if (arg3 != null) {
                    arg3.method1858(4, this.getClass());
                    field6978 = Boolean.TRUE;
                } else {
                    System.loadLibrary("jawt");
                    System.loadLibrary("sw3d");
                    field6978 = Boolean.TRUE;
                }
            }
            if (!field6978) {
                throw new RuntimeException("");
            } else {
                this.method2780(super.field2501, 0, 0);
                class392.method2432(false, true, (byte) 51);
                this.field6992 = true;
                if (arg1 != null) {
                    this.method261(arg1);
                    this.method225(arg1);
                }
                this.field6989 = new class136();
                this.method302(new class136());
                this.method256(1);
                this.method277(0);
            }
        } catch (Throwable var5) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!h", name = "D", descriptor = "()Lma;", line = 303)
    public final class10 method2778() {
        for (int var1 = 0; var1 < this.field6994; ++var1) {
            if (this.field6993[var1].field154 == Thread.currentThread()) {
                return this.field6993[var1];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Leu;[Lwe;Z)Loa;", line = 315)
    public final class489 method260(class332 arg0, class279[] arg1, boolean arg2) {
        return arg2 ? new class194(this, this.field6974, arg0, arg1, (class529[]) null) : new class181(this, this.field6974, arg0, arg1, (class529[]) null);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lwe;Z)Lf;", line = 323)
    public final class529 method304(class279 arg0, boolean arg1) {
        int[] var3 = arg0.field4011;
        byte[] var4 = arg0.field4006;
        int var5 = arg0.field4005;
        int var6 = arg0.field4003;
        class529 var7;
        if (arg1 && arg0.field4004 == null) {
            var7 = new class344(this, this.field6974, var3, var4, 0, arg0.field4005, arg0.field4005, arg0.field4003);
        } else {
            int var8 = var5 * var6;
            int[] var9 = new int[var8];
            byte[] var10 = arg0.field4004;
            if (var10 != null) {
                for (int var11 = 0; var11 < var6; ++var11) {
                    int var12 = var5 * var11;
                    for (int var13 = 0; var13 < var5; ++var13) {
                        var9[var12 + var13] = var3[var4[var12 + var13] & 255] | var10[var12 + var13] << 24;
                    }
                }
                var7 = new class395(this, this.field6974, var9, 0, var5, var5, var6);
            } else {
                boolean var14 = false;
                for (int var15 = 0; var15 < var8; ++var15) {
                    int var16 = arg0.field4011[var4[var15] & 255];
                    if (var16 >>> 24 != 255) {
                        var14 = true;
                    }
                    var9[var15] = var16;
                }
                if (var14) {
                    var7 = new class395(this, this.field6974, var9, 0, arg0.field4005, arg0.field4005, arg0.field4003);
                } else {
                    var7 = new class15(this, this.field6974, var9, 0, arg0.field4005, arg0.field4005, arg0.field4003);
                }
            }
        }
        var7.method99(arg0.field4007, arg0.field4008, arg0.field4009, arg0.field4010);
        return var7;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(FFF)V", line = 396)
    public final void method215(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "([IIIII)Lf;", line = 400)
    public final class529 method306(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        boolean var6 = false;
        int var7 = arg1;
        for (int var8 = 0; var8 < arg4; ++var8) {
            for (int var9 = 0; var9 < arg3; ++var9) {
                int var10 = arg0[var7++] >>> 24;
                if (var10 != 0 && var10 != 255) {
                    var6 = true;
                    return var6 ? new class395(this, this.field6974, arg0, arg1, arg2, arg3, arg4) : new class15(this, this.field6974, arg0, arg1, arg2, arg3, arg4);
                }
            }
        }
        return var6 ? new class395(this, this.field6974, arg0, arg1, arg2, arg3, arg4) : new class15(this, this.field6974, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!h", name = "e", descriptor = "(I)V", line = 435)
    public final void method277(int arg0) {
        this.field6993[arg0].method52();
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "([Lc;Lia;[Llc;I)V", line = 439)
    public final void method263(class121[] arg0, class414 arg1, class456[] arg2, int arg3) {
        if (arg2 == null) {
            this.method2778().method57(this, arg0, arg1, (int[]) null, -1, arg3);
        } else {
            class456 var5 = arg2[0];
            field6979[5] = 0;
            this.method2778().method57(this, arg0, arg1, field6979, -1, arg3);
            var5.field6812 = field6979[0];
            var5.field6813 = field6979[1];
            var5.field6810 = field6979[2];
            var5.field6811 = field6979[3];
            var5.field6814 = field6979[4];
            var5.field6809 = field6979[5] != 0;
        }
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 458)
    public final void method248(Canvas arg0) {
        class312 var2 = (class312) this.field6991.method171((byte) -86, (long) arg0.hashCode());
        Dimension var3 = arg0.getSize();
        var2.method2048(arg0, var3.width, var3.height);
        if (arg0 != null && this.field6986 == arg0) {
            this.method225(arg0);
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIZ)Lf;", line = 467)
    public final class529 method218(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        return arg4 ? new class395(this, this.field6974, arg0, arg1, arg2, arg3) : new class15(this, this.field6974, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!h", name = "d", descriptor = "(I)V", line = 474)
    public final void method245(int arg0) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!h", name = "p", descriptor = "()Z", line = 478)
    public final boolean method269() {
        return true;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Z)V", line = 480)
    public final void method211(boolean arg0) {
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(I)Ll;", line = 484)
    public final class16 method238(int arg0) {
        class262 var2 = new class262(this, arg0);
        this.field6972.method2417(-119, var2);
        return var2;
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(Z)V", line = 489)
    public final void method220(boolean arg0) {
    }

    @OriginalMember(owner = "client!h", name = "v", descriptor = "()Lia;", line = 492)
    public final class414 method231() {
        return new class136();
    }

    @OriginalMember(owner = "client!h", name = "m", descriptor = "()Z", line = 495)
    public final boolean method286() {
        return false;
    }

    @OriginalMember(owner = "client!h", name = "e", descriptor = "()Z", line = 498)
    public final boolean method285() {
        return false;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "()V", line = 503)
    public final void method206() {
    }

    @OriginalMember(owner = "client!h", name = "C", descriptor = "()V", line = 505)
    public final void method247() {
    }

    @OriginalMember(owner = "client!h", name = "i", descriptor = "()Z", line = 508)
    public final boolean method202() {
        return true;
    }

    @OriginalMember(owner = "client!h", name = "d", descriptor = "(IIIIII)Lbi;", line = 513)
    public final class333 method204(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(II)I", line = 516)
    public final int method280(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!h", name = "q", descriptor = "()Z", line = 519)
    public final boolean method283() {
        return true;
    }

    @OriginalMember(owner = "client!h", name = "u", descriptor = "()V", line = 522)
    public final void method291() {
    }

    @OriginalMember(owner = "client!h", name = "l", descriptor = "()Z", line = 525)
    public final boolean method299() {
        return true;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIF)Lfk;", line = 531)
    public final class462 method267(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return new class397(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!h", name = "h", descriptor = "(I)V", line = 540)
    public final void method213(int arg0) {
        class379.method2354(false);
        this.method2777(arg0);
        for (class262 var2 = (class262) this.field6972.method2427(117); var2 != null; var2 = (class262) this.field6972.method2422(-125)) {
            var2.method1695();
        }
    }

    @OriginalMember(owner = "client!h", name = "t", descriptor = "()Z", line = 555)
    public final boolean method305() {
        return false;
    }

    @OriginalMember(owner = "client!h", name = "A", descriptor = "()Ljava/lang/Object;", line = 558)
    private final Object method2783() {
        return new class327();
    }

    @OriginalMember(owner = "client!h", name = "c", descriptor = "(I)V", line = 561)
    public final void method256(int arg0) {
        this.field6994 = arg0;
        this.field6993 = new class10[this.field6994];
        for (int var2 = 0; var2 < this.field6994; ++var2) {
            this.field6993[var2] = new class10(this, this.field6987, this.field6988);
        }
    }

    @OriginalMember(owner = "client!h", name = "h", descriptor = "()V", line = 573)
    public final void method278() {
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lbi;)V", line = 577)
    public final void method284(class333 arg0) {
    }

    @OriginalMember(owner = "client!h", name = "MA", descriptor = "(S)Z", line = 580)
    private final boolean method2785(short arg0) {
        class126 var2 = super.field2501;
        synchronized (super.field2501) {
            if (!super.field2501.method959(arg0, (byte) 94)) {
                return false;
            } else {
                class83 var4 = super.field2501.method956(-945, arg0);
                if (var4 == null) {
                    return false;
                } else {
                    int[] var6;
                    if (var4.field1427 && var4.field1441) {
                        var6 = super.field2501.method958(arg0, 128, 128, true, true, 0.7F);
                    } else {
                        var6 = super.field2501.method957(true, arg0, 128, 0.7F, 128, 26878);
                    }
                    this.method2784(arg0, var4.field1449, var4.field1446, var4.field1441, var4.field1427, var4.field1431, var4.field1430, var4.field1433, var4.field1451, var4.field1432, var4.field1442, var4.field1437, var4.field1434, var6);
                    return true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIII)V", line = 611)
    public final void method239(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method288(arg0, arg1, arg2, arg4, arg5);
        this.method288(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method216(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
        this.method216(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Ll;)V", line = 620)
    public final void method301(class16 arg0) {
        this.field6974 = (class262) arg0;
        this.method2787(arg0);
    }

    @OriginalMember(owner = "client!h", name = "j", descriptor = "()Z", line = 624)
    public final boolean method224() {
        return false;
    }

    @OriginalMember(owner = "client!h", name = "EA", descriptor = "(S)Z", line = 631)
    private final boolean method2788(short arg0) {
        synchronized (this) {
            class83 var3 = super.field2501.method956(-945, arg0);
            if (var3 == null) {
                return false;
            } else {
                this.method2782(arg0, var3.field1449, var3.field1446, var3.field1441, var3.field1427, var3.field1431, var3.field1430, var3.field1433, var3.field1451, var3.field1432, var3.field1442, var3.field1437, var3.field1434);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 648)
    public final void method261(Canvas arg0) {
        class312 var2 = (class312) this.field6991.method171((byte) -122, (long) arg0.hashCode());
        if (var2 == null) {
            try {
                Class var3 = Class.forName("java.awt.Canvas");
                Method var4 = var3.getMethod("setIgnoreRepaint", Boolean.TYPE);
                var4.invoke(arg0, Boolean.TRUE);
            } catch (Exception var6) {
            }
            class312 var5 = new class312(this, arg0);
            this.field6991.method166(var5, (long) arg0.hashCode(), 68);
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lsh;Z)V", line = 668)
    private final void method2789(class49 arg0, boolean arg1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        for (class41 var8 = (class41) arg0.field892.method1531((byte) -125); var8 != null; var8 = (class41) arg0.field892.method1534((byte) 52)) {
            field6982[var3++] = var8.field738;
            field6982[var3++] = var8.field743;
            field6982[var3++] = var8.field745;
            field6977[var4++] = var8.field735;
            field6984[var6++] = (short) var8.field741;
            field6975[var5++] = var8.field744;
            if (arg1) {
                field6985[var7++] = var8.field746;
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "x", descriptor = "()V", line = 700)
    public final void method297() {
        for (class262 var1 = (class262) this.field6972.method2427(126); var1 != null; var1 = (class262) this.field6972.method2422(-94)) {
            var1.method1694();
        }
        this.field6972.method2419((byte) 106);
        this.method2790();
        if (this.field6992) {
            class404.method2473(true, false, 7);
            this.field6992 = false;
        }
    }

    @OriginalMember(owner = "client!h", name = "o", descriptor = "()Z", line = 720)
    public final boolean method208() {
        return true;
    }

    @OriginalMember(owner = "client!h", name = "n", descriptor = "()Lia;", line = 725)
    public final class414 method240() {
        return this.field6989;
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(II)I", line = 732)
    public final int method255(int arg0, int arg1) {
        int var3 = arg0 & 1048575;
        int var4 = arg1 & 1048575;
        return var3 & var4 ^ var4;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(I[Lfk;)V", line = 742)
    public final void method289(int arg0, class462[] arg1) {
        int var3 = 0;
        for (int var4 = 0; var4 < arg0; ++var4) {
            field6983[var3++] = arg1[var4].method2752(-25273);
            field6983[var3++] = arg1[var4].method2746((byte) -60);
            field6983[var3++] = arg1[var4].method2744(-254);
            field6983[var3++] = arg1[var4].method2749((byte) -74);
            field6976[var4] = arg1[var4].method2748(true);
            field6983[var3++] = arg1[var4].method2750(true);
        }
        this.method2779(arg0, field6983, field6976);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lnd;IIII)Lc;", line = 773)
    public final class121 method265(class380 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class144(this, this.field6974, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!h", name = "j", descriptor = "(ILea;II)V")
    public final native void method270(int arg0, class381 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!h", name = "u", descriptor = "([I)V")
    public final native void method251(int[] arg0);

    @OriginalMember(owner = "client!h", name = "o", descriptor = "(FF)V")
    public final native void method300(float arg0, float arg1);

    @OriginalMember(owner = "client!h", name = "da", descriptor = "(IIIII)V")
    public final native void method216(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!h", name = "K", descriptor = "(IIIIII)V")
    private final native void method2775(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!h", name = "U", descriptor = "(IIIII)V")
    public final native void method288(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!h", name = "w", descriptor = "()F")
    public final native float method276();

    @OriginalMember(owner = "client!h", name = "V", descriptor = "(III)V")
    public final native void method243(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!h", name = "S", descriptor = "()V")
    public final native void method222();

    @OriginalMember(owner = "client!h", name = "na", descriptor = "(I)V")
    public final native void method307(int arg0);

    @OriginalMember(owner = "client!h", name = "g", descriptor = "()I")
    public final native int method252();

    @OriginalMember(owner = "client!h", name = "ya", descriptor = "()V")
    public final native void method59();

    @OriginalMember(owner = "client!h", name = "XA", descriptor = "(IFFFFF)V")
    public final native void method233(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!h", name = "NA", descriptor = "(IIIIII)V")
    public final native void method253(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!h", name = "ja", descriptor = "(I)V")
    private final native void method2777(int arg0);

    @OriginalMember(owner = "client!h", name = "W", descriptor = "()I")
    public final native int method275();

    @OriginalMember(owner = "client!h", name = "VA", descriptor = "(I[I[F)V")
    private final native void method2779(int arg0, int[] arg1, float[] arg2);

    @OriginalMember(owner = "client!h", name = "FA", descriptor = "()I")
    public final native int method217();

    @OriginalMember(owner = "client!h", name = "la", descriptor = "()F")
    public final native float method221();

    @OriginalMember(owner = "client!h", name = "B", descriptor = "(Lm;II)V")
    private final native void method2780(class126 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!h", name = "pa", descriptor = "(IIII)V")
    public final native void method298(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!h", name = "P", descriptor = "(Lla;)V")
    private final native void method2781(class312 arg0);

    @OriginalMember(owner = "client!h", name = "l", descriptor = "(SBBZZZBBBIIZZ)V")
    private final native void method2782(short arg0, byte arg1, byte arg2, boolean arg3, boolean arg4, boolean arg5, byte arg6, byte arg7, byte arg8, int arg9, int arg10, boolean arg11, boolean arg12);

    @OriginalMember(owner = "client!h", name = "GA", descriptor = "(IIII)V")
    public final native void method230(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!h", name = "aa", descriptor = "(IIIIII[BII)V")
    public final native void method209(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!h", name = "Z", descriptor = "(IIII)V")
    public final native void method198(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!h", name = "ba", descriptor = "(IIII)V")
    public final native void method214(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!h", name = "M", descriptor = "(I)V")
    public final native void method241(int arg0);

    @OriginalMember(owner = "client!h", name = "f", descriptor = "(SBBZZZBBBIIZZ[I)V")
    private final native void method2784(short arg0, byte arg1, byte arg2, boolean arg3, boolean arg4, boolean arg5, byte arg6, byte arg7, byte arg8, int arg9, int arg10, boolean arg11, boolean arg12, int[] arg13);

    @OriginalMember(owner = "client!h", name = "IA", descriptor = "(IIII)[I")
    public final native int[] method259(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!h", name = "ta", descriptor = "(IIIIIILea;II)V")
    private final native void method2786(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class381 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!h", name = "ua", descriptor = "(F)V")
    public final native void method281(float arg0);

    @OriginalMember(owner = "client!h", name = "ia", descriptor = "(III[I)V")
    public final native void method279(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!h", name = "va", descriptor = "()V")
    public final native void method258();

    @OriginalMember(owner = "client!h", name = "Y", descriptor = "(Ll;)V")
    private final native void method2787(class16 arg0);

    @OriginalMember(owner = "client!h", name = "d", descriptor = "()I")
    public final native int method200();

    @OriginalMember(owner = "client!h", name = "SA", descriptor = "(IIIIII)Z")
    public final native boolean method274(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!h", name = "fa", descriptor = "(IIII)V")
    public final native void method266(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!h", name = "JA", descriptor = "(II)V")
    public final native void method296(int arg0, int arg1);

    @OriginalMember(owner = "client!h", name = "xa", descriptor = "()I")
    public final native int method228();

    @OriginalMember(owner = "client!h", name = "I", descriptor = "()V")
    private final native void method2790();

    @OriginalMember(owner = "client!h", name = "O", descriptor = "(IIIII)V")
    public final native void method271(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!h", name = "m", descriptor = "(Lia;)V")
    public final native void method302(class414 arg0);
}
