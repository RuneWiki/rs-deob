import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class469 extends class162 implements class276 {

    @OriginalMember(owner = "client!h", name = "nativeid", descriptor = "J")
    public long nativeid = 0L;

    @OriginalMember(owner = "client!h", name = "u", descriptor = "Lwl;")
    private class280 field6448 = new class280();

    @OriginalMember(owner = "client!h", name = "I", descriptor = "I")
    private int field6462 = 4096;

    @OriginalMember(owner = "client!h", name = "H", descriptor = "I")
    private int field6461 = 4096;

    @OriginalMember(owner = "client!h", name = "G", descriptor = "Lub;")
    private class18 field6460 = new class18(4);

    @OriginalMember(owner = "client!h", name = "L", descriptor = "Lia;")
    private class414 field6465;

    @OriginalMember(owner = "client!h", name = "t", descriptor = "[I")
    private static int[] field6447 = new int[Math.max(Math.max(80, 20), 24573)];

    @OriginalMember(owner = "client!h", name = "v", descriptor = "[I")
    public static int[] field6449 = new int[6];

    @OriginalMember(owner = "client!h", name = "x", descriptor = "[I")
    public static int[] field6451 = field6447;

    @OriginalMember(owner = "client!h", name = "C", descriptor = "[I")
    private static int[] field6456 = new int[8191];

    @OriginalMember(owner = "client!h", name = "E", descriptor = "[I")
    private static int[] field6458 = field6447;

    @OriginalMember(owner = "client!h", name = "B", descriptor = "[I")
    private static int[] field6455 = new int[8191];

    @OriginalMember(owner = "client!h", name = "y", descriptor = "[F")
    private static float[] field6452 = new float[20];

    @OriginalMember(owner = "client!h", name = "F", descriptor = "[S")
    private static short[] field6459 = new short[8191];

    @OriginalMember(owner = "client!h", name = "J", descriptor = "[F")
    private static float[] field6463 = field6452;

    @OriginalMember(owner = "client!h", name = "A", descriptor = "[I")
    private static int[] field6454 = field6447;

    @OriginalMember(owner = "client!h", name = "D", descriptor = "Ljava/lang/Boolean;")
    private static Boolean field6457 = Boolean.FALSE;

    @OriginalMember(owner = "client!h", name = "z", descriptor = "[B")
    private static byte[] field6453 = new byte[8191];

    @OriginalMember(owner = "client!h", name = "O", descriptor = "I")
    private int field6468;

    @OriginalMember(owner = "client!h", name = "w", descriptor = "Lba;")
    private class262 field6450;

    @OriginalMember(owner = "client!h", name = "K", descriptor = "Lla;")
    private class313 field6464;

    @OriginalMember(owner = "client!h", name = "M", descriptor = "Ljava/awt/Canvas;")
    private Canvas field6466;

    @OriginalMember(owner = "client!h", name = "N", descriptor = "[Lma;")
    private class10[] field6467;

    @OriginalMember(owner = "client!h", name = "m", descriptor = "()Z", line = 4)
    public final boolean method627() {
        return false;
    }

    @OriginalMember(owner = "client!h", name = "c", descriptor = "(Z)V", line = 6)
    public final void method624(boolean arg0) {
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(II)I", line = 9)
    public final int method565(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!h", name = "D", descriptor = "()Lma;", line = 15)
    public final class10 method2655() {
        for (int var1 = 0; var1 < this.field6468; ++var1) {
            if (this.field6467[var1].field229 == Thread.currentThread()) {
                return this.field6467[var1];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!h", name = "u", descriptor = "()Z", line = 29)
    public final boolean method554() {
        return false;
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(Z)V", line = 31)
    public final void method525(boolean arg0) {
    }

    @OriginalMember(owner = "client!h", name = "z", descriptor = "()Lia;", line = 34)
    public final class414 method538() {
        return new class136();
    }

    @OriginalMember(owner = "client!h", name = "B", descriptor = "()Z", line = 38)
    public final boolean method567() {
        return true;
    }

    @OriginalMember(owner = "client!h", name = "EA", descriptor = "(S)Z", line = 41)
    private final boolean method2656(short arg0) {
        synchronized (this) {
            class278 var3 = super.field2375.method677(2459, arg0);
            if (var3 == null) {
                return false;
            } else {
                this.method2664(arg0, var3.field3649, var3.field3640, var3.field3637, var3.field3638, var3.field3646, var3.field3648, var3.field3643, var3.field3651, var3.field3647, var3.field3642, var3.field3636, var3.field3641);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(II[I[I)Lea;", line = 52)
    public final class381 method612(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class198(this, this.field6450, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!h", name = "j", descriptor = "()Z", line = 57)
    public final boolean method578() {
        return false;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(I)V", line = 61)
    public final void method535(int arg0) {
        this.field6468 = arg0;
        this.field6467 = new class10[this.field6468];
        for (int var2 = 0; var2 < this.field6468; ++var2) {
            this.field6467[var2] = new class10(this, this.field6462, this.field6461);
        }
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "()Lia;", line = 78)
    public final class414 method611() {
        return this.field6465;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIII)V", line = 82)
    public final void method580(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method2655().method115(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!h", name = "q", descriptor = "()V", line = 89)
    public final void method571() {
        for (class262 var1 = (class262) this.field6448.method1672((byte) -104); var1 != null; var1 = (class262) this.field6448.method1668(-1)) {
            var1.method1584();
        }
        this.field6448.method1670((byte) -104);
        this.method2665();
    }

    @OriginalMember(owner = "client!h", name = "d", descriptor = "(Ljava/awt/Canvas;)V", line = 102)
    public final void method594(Canvas arg0) {
        if (this.field6466 == arg0) {
            this.method623((Canvas) null);
        }
        class313 var2 = (class313) this.field6460.method182((long) arg0.hashCode(), (byte) 117);
        if (var2 != null) {
            var2.method300(false);
        }
        var2.method1811();
    }

    @OriginalMember(owner = "client!h", name = "d", descriptor = "(IIIIII)Lto;", line = 113)
    public final class8 method522(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!h", name = "f", descriptor = "()Z", line = 124)
    public final boolean method587() {
        return false;
    }

    @OriginalMember(owner = "client!h", name = "c", descriptor = "(IIIIII)V", line = 127)
    public final void method563(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method2661(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!h", name = "r", descriptor = "()V", line = 132)
    public final void method574() {
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lre;[Lfq;Z)Loa;", line = 137)
    public final class489 method589(class425 arg0, class134[] arg1, boolean arg2) {
        return arg2 ? new class194(this, this.field6450, arg0, arg1, (class529[]) null) : new class181(this, this.field6450, arg0, arg1, (class529[]) null);
    }

    @OriginalMember(owner = "client!h", name = "e", descriptor = "()Z", line = 144)
    public final boolean method519() {
        return true;
    }

    @OriginalMember(owner = "client!h", name = "ZA", descriptor = "()V", line = 149)
    private final void method2659() {
        System.gc();
        System.runFinalization();
        class475.method2733(19590);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lto;Lto;FLto;)Lto;", line = 155)
    public final class8 method566(class8 arg0, class8 arg1, float arg2, class8 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIII)V", line = 159)
    public final void method602(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "(ILjava/awt/Canvas;Lm;Ljs;)V", line = 162)
    public class469(int arg0, Canvas arg1, class126 arg2, class216 arg3) {
        super(arg0, arg2);
        try {
            if (!field6457) {
                if (arg3 != null) {
                    arg3.method1379(97, this.getClass());
                    field6457 = Boolean.TRUE;
                } else {
                    System.loadLibrary("jawt");
                    System.loadLibrary("sw3d");
                    field6457 = Boolean.TRUE;
                }
            }
            if (!field6457) {
                throw new RuntimeException("");
            } else {
                this.method2657(super.field2375, 0, 0);
                if (arg1 != null) {
                    this.method547(arg1);
                    this.method623(arg1);
                }
                this.field6465 = new class136();
                this.method603(new class136());
                this.method535(1);
                this.method625(0);
            }
        } catch (Throwable var5) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lc;Lpm;Lia;Lfo;I)V", line = 201)
    public final void method534(class121 arg0, class411 arg1, class414 arg2, class357 arg3, int arg4) {
        this.method2663(arg1, true);
        if (arg3 == null) {
            this.method2655().method113(this, arg0, arg2, (int[]) null, arg4, field6458, field6455, field6456, field6459, field6453, arg1.field5648.method631(4), field6451);
        } else {
            field6449[5] = 0;
            this.method2655().method113(this, arg0, arg2, field6449, arg4, field6458, field6455, field6456, field6459, field6453, arg1.field5648.method631(4), field6451);
            arg3.field4815 = field6449[0];
            arg3.field4817 = field6449[1];
            arg3.field4820 = field6449[2];
            arg3.field4819 = field6449[3];
            arg3.field4816 = field6449[4];
            arg3.field4818 = field6449[5] != 0;
        }
        class144 var6 = (class144) arg0;
        var6.method1003(0, arg2);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "([Lc;Lpm;Lia;[Lfo;I)V", line = 221)
    public final void method545(class121[] arg0, class411 arg1, class414 arg2, class357[] arg3, int arg4) {
        this.method2663(arg1, true);
        if (arg3 == null) {
            this.method2655().method120(this, arg0, arg2, (int[]) null, arg4, field6458, field6455, field6456, field6459, field6453, arg1.field5648.method631(4), field6451);
        } else {
            class357 var6 = arg3[0];
            field6449[5] = 0;
            this.method2655().method120(this, arg0, arg2, field6449, arg4, field6458, field6455, field6456, field6459, field6453, arg1.field5648.method631(4), field6451);
            var6.field4815 = field6449[0];
            var6.field4817 = field6449[1];
            var6.field4820 = field6449[2];
            var6.field4819 = field6449[3];
            var6.field4816 = field6449[4];
            var6.field4818 = field6449[5] != 0;
        }
        int var7 = 0;
        for (int var8 = 0; var8 < arg0.length; ++var8) {
            if (arg0[var8] != null) {
                class144 var9 = (class144) arg0[var8];
                var9.method1003(var7, arg2);
                if (var9.field2056 != null) {
                    var7 += var9.field2056.length * 9;
                }
                if (var9.field2059 != null) {
                    var7 += var9.field2059.length * 3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lwp;IIII)Lc;", line = 267)
    public final class121 method531(class118 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class144(this, this.field6450, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 270)
    public final void method623(Canvas arg0) {
        if (arg0 != null) {
            class313 var2 = (class313) this.field6460.method182((long) arg0.hashCode(), (byte) 73);
            this.field6466 = arg0;
            this.field6464 = var2;
            this.method2667(var2);
        } else {
            this.field6466 = null;
            this.field6464 = null;
            this.method2667((class313) null);
        }
    }

    @OriginalMember(owner = "client!h", name = "p", descriptor = "()V", line = 287)
    public final void method579() {
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lto;)V", line = 289)
    public final void method527(class8 arg0) {
    }

    @OriginalMember(owner = "client!h", name = "e", descriptor = "(I)V", line = 292)
    public final void method625(int arg0) {
        this.field6467[arg0].method111();
    }

    @OriginalMember(owner = "client!h", name = "t", descriptor = "()Z", line = 296)
    public final boolean method557() {
        return true;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "([IIIII)Lf;", line = 303)
    public final class529 method598(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        boolean var6 = false;
        int var7 = arg1;
        for (int var8 = 0; var8 < arg4; ++var8) {
            for (int var9 = 0; var9 < arg3; ++var9) {
                int var10 = arg0[var7++] >>> 24;
                if (var10 != 0 && var10 != 255) {
                    var6 = true;
                    return var6 ? new class395(this, this.field6450, arg0, arg1, arg2, arg3, arg4) : new class15(this, this.field6450, arg0, arg1, arg2, arg3, arg4);
                }
            }
        }
        return var6 ? new class395(this, this.field6450, arg0, arg1, arg2, arg3, arg4) : new class15(this, this.field6450, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!h", name = "d", descriptor = "(I)V", line = 338)
    public final void method575(int arg0) {
        class475.method2733(19590);
        this.method2660(arg0);
        for (class262 var2 = (class262) this.field6448.method1672((byte) -108); var2 != null; var2 = (class262) this.field6448.method1668(-1)) {
            var2.method1583();
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 352)
    public final void method547(Canvas arg0) {
        class313 var2 = (class313) this.field6460.method182((long) arg0.hashCode(), (byte) 121);
        if (var2 == null) {
            class313 var3 = new class313(this, arg0);
            this.field6460.method173((long) arg0.hashCode(), var3, (byte) 109);
        }
    }

    @OriginalMember(owner = "client!h", name = "C", descriptor = "()V", line = 360)
    public final void method621() {
    }

    @OriginalMember(owner = "client!h", name = "x", descriptor = "()I", line = 364)
    public final int method597() {
        return 4;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(II[[I[[IIII)Lna;", line = 367)
    public final class35 method556(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class218(this, this.field6450, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lfq;Z)Lf;", line = 373)
    public final class529 method596(class134 arg0, boolean arg1) {
        int[] var3 = arg0.field1921;
        byte[] var4 = arg0.field1923;
        int var5 = arg0.field1926;
        int var6 = arg0.field1925;
        class529 var7;
        if (arg1 && arg0.field1920 == null) {
            var7 = new class345(this, this.field6450, var3, var4, 0, arg0.field1926, arg0.field1926, arg0.field1925);
        } else {
            int var8 = var5 * var6;
            int[] var9 = new int[var8];
            byte[] var10 = arg0.field1920;
            if (var10 != null) {
                for (int var11 = 0; var11 < var6; ++var11) {
                    int var12 = var5 * var11;
                    for (int var13 = 0; var13 < var5; ++var13) {
                        var9[var12 + var13] = var3[var4[var12 + var13] & 255] | var10[var12 + var13] << 24;
                    }
                }
                var7 = new class395(this, this.field6450, var9, 0, var5, var5, var6);
            } else {
                boolean var14 = false;
                for (int var15 = 0; var15 < var8; ++var15) {
                    int var16 = arg0.field1921[var4[var15] & 255];
                    if (var16 >>> 24 != 255) {
                        var14 = true;
                    }
                    var9[var15] = var16;
                }
                if (var14) {
                    var7 = new class395(this, this.field6450, var9, 0, arg0.field1926, arg0.field1926, arg0.field1925);
                } else {
                    var7 = new class15(this, this.field6450, var9, 0, arg0.field1926, arg0.field1926, arg0.field1925);
                }
            }
        }
        var7.method152(arg0.field1919, arg0.field1922, arg0.field1924, arg0.field1918);
        return var7;
    }

    @OriginalMember(owner = "client!h", name = "c", descriptor = "(Ljava/awt/Canvas;)V", line = 448)
    public final void method595(Canvas arg0) {
        class313 var2 = (class313) this.field6460.method182((long) arg0.hashCode(), (byte) 119);
        Dimension var3 = arg0.getSize();
        var2.method1812(arg0, var3.width, var3.height);
        if (arg0 != null && this.field6466 == arg0) {
            this.method623(arg0);
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(I[Lor;)V", line = 465)
    public final void method609(int arg0, class451[] arg1) {
        int var3 = 0;
        for (int var4 = 0; var4 < arg0; ++var4) {
            field6454[var3++] = arg1[var4].method2577((byte) -102);
            field6454[var3++] = arg1[var4].method2581(28);
            field6454[var3++] = arg1[var4].method2582((byte) 70);
            field6454[var3++] = arg1[var4].method2578(22477);
            field6463[var4] = arg1[var4].method2580((byte) -127);
            field6454[var3++] = arg1[var4].method2579(105);
        }
        this.method2669(arg0, field6454, field6463);
    }

    @OriginalMember(owner = "client!h", name = "l", descriptor = "()Z", line = 483)
    public final boolean method520() {
        return true;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V", line = 488)
    public final void method601(Rectangle[] arg0, int arg1) {
        for (int var3 = 0; var3 < arg1; ++var3) {
            Rectangle var4 = arg0[var3];
            if (var4.width > 0 && var4.height > 0) {
                this.field6464.method1816(var4.x, var4.y, var4.width, var4.height);
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(II)I", line = 504)
    public final int method564(int arg0, int arg1) {
        int var3 = arg0 & 1048575;
        int var4 = arg1 & 1048575;
        return var3 & var4 ^ var4;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lpm;Z)V", line = 511)
    private final void method2663(class411 arg0, boolean arg1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        for (class288 var8 = (class288) arg0.field5648.method629(2); var8 != null; var8 = (class288) arg0.field5648.method628(89)) {
            field6458[var3++] = var8.field3769;
            field6458[var3++] = var8.field3767;
            field6458[var3++] = var8.field3762;
            field6455[var4++] = var8.field3763;
            field6459[var6++] = (short) var8.field3764;
            field6456[var5++] = var8.field3768;
            if (arg1) {
                field6453[var7++] = var8.field3766;
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "y", descriptor = "()V", line = 540)
    public final void method600() {
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lpm;)V", line = 545)
    public final void method582(class411 arg0) {
        this.method2663(arg0, false);
        this.method2655().method116(this, field6458, field6455, field6456, field6459, arg0.field5648.method631(4));
    }

    @OriginalMember(owner = "client!h", name = "finalize", descriptor = "()V", line = 550)
    protected final void finalize() {
        this.method109();
    }

    @OriginalMember(owner = "client!h", name = "i", descriptor = "()V", line = 555)
    public final void method615() {
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(IIIIII)V", line = 559)
    public final void method614(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method542(arg0, arg1, arg2, arg4, arg5);
        this.method542(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method616(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
        this.method616(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
    }

    @OriginalMember(owner = "client!h", name = "o", descriptor = "()Z", line = 567)
    public final boolean method581() {
        return false;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Z)V", line = 575)
    public final void method532(boolean arg0) {
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(I)V", line = 579)
    public final void method620(int arg0) {
        this.field6467[arg0].method107();
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "([Lc;Lia;[Lfo;I)V", line = 582)
    public final void method537(class121[] arg0, class414 arg1, class357[] arg2, int arg3) {
        if (arg2 == null) {
            this.method2655().method123(this, arg0, arg1, (int[]) null, -1, arg3);
        } else {
            class357 var5 = arg2[0];
            field6449[5] = 0;
            this.method2655().method123(this, arg0, arg1, field6449, -1, arg3);
            var5.field4815 = field6449[0];
            var5.field4817 = field6449[1];
            var5.field4820 = field6449[2];
            var5.field4819 = field6449[3];
            var5.field4816 = field6449[4];
            var5.field4818 = field6449[5] != 0;
        }
    }

    @OriginalMember(owner = "client!h", name = "c", descriptor = "()Z", line = 603)
    public final boolean method558() {
        return true;
    }

    @OriginalMember(owner = "client!h", name = "c", descriptor = "(I)Ll;", line = 607)
    public final class16 method533(int arg0) {
        class262 var2 = new class262(this, arg0);
        this.field6448.method1666((byte) 119, var2);
        return var2;
    }

    @OriginalMember(owner = "client!h", name = "n", descriptor = "()Z", line = 612)
    public final boolean method570() {
        return true;
    }

    @OriginalMember(owner = "client!h", name = "g", descriptor = "(I)V", line = 624)
    public final void method593(int arg0) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!h", name = "h", descriptor = "()Z", line = 630)
    public final boolean method543() {
        return true;
    }

    @OriginalMember(owner = "client!h", name = "MA", descriptor = "(S)Z", line = 637)
    private final boolean method2666(short arg0) {
        class126 var2 = super.field2375;
        synchronized (super.field2375) {
            if (!super.field2375.method680(-16576, arg0)) {
                return false;
            } else {
                class278 var4 = super.field2375.method677(2459, arg0);
                if (var4 == null) {
                    return false;
                } else {
                    int[] var6;
                    if (var4.field3638 && var4.field3637) {
                        var6 = super.field2375.method678(0.7F, arg0, 24201, true, 128, 128);
                    } else {
                        var6 = super.field2375.method681(0.7F, true, 128, 128, 1519, arg0);
                    }
                    this.method2662(arg0, var4.field3649, var4.field3640, var4.field3637, var4.field3638, var4.field3646, var4.field3648, var4.field3643, var4.field3651, var4.field3647, var4.field3642, var4.field3636, var4.field3641, var6);
                    return true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIF)Lor;", line = 661)
    public final class451 method588(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return new class17(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIILea;II)V", line = 670)
    public final void method553(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class381 arg6, int arg7, int arg8) {
        this.method2658(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "()V", line = 673)
    public final void method529() {
        if (this.field6466.getPeer() == null) {
            throw new RuntimeException();
        } else {
            this.field6464.method1815();
        }
    }

    @OriginalMember(owner = "client!h", name = "k", descriptor = "()Z", line = 689)
    public final boolean method604() {
        return false;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIIIIII)V", line = 692)
    public final void method552(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!h", name = "A", descriptor = "()Ljava/lang/Object;", line = 713)
    private final Object method2668() {
        return new class328();
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIZ)Lf;", line = 716)
    public final class529 method618(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        return arg4 ? new class395(this, this.field6450, arg0, arg1, arg2, arg3) : new class15(this, this.field6450, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!h", name = "s", descriptor = "()Z", line = 733)
    public final boolean method569() {
        return false;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(FFF)V", line = 736)
    public final void method561(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!h", name = "v", descriptor = "()Z", line = 739)
    public final boolean method555() {
        return true;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Ll;)V", line = 752)
    public final void method617(class16 arg0) {
        this.field6450 = (class262) arg0;
        this.method2654(arg0);
    }

    @OriginalMember(owner = "client!h", name = "Y", descriptor = "(Ll;)V")
    private final native void method2654(class16 arg0);

    @OriginalMember(owner = "client!h", name = "NA", descriptor = "(IIIIII)V")
    public final native void method585(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!h", name = "XA", descriptor = "(IFFFFF)V")
    public final native void method592(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!h", name = "M", descriptor = "(I)V")
    public final native void method550(int arg0);

    @OriginalMember(owner = "client!h", name = "GA", descriptor = "(IIII)V")
    public final native void method573(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!h", name = "SA", descriptor = "(IIIIII)Z")
    public final native boolean method610(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!h", name = "B", descriptor = "(Lm;II)V")
    private final native void method2657(class126 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!h", name = "xa", descriptor = "()I")
    public final native int method619();

    @OriginalMember(owner = "client!h", name = "va", descriptor = "()V")
    public final native void method539();

    @OriginalMember(owner = "client!h", name = "ya", descriptor = "()V")
    public final native void method109();

    @OriginalMember(owner = "client!h", name = "da", descriptor = "(IIIII)V")
    public final native void method616(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!h", name = "aa", descriptor = "(IIIIII[BII)V")
    public final native void method530(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!h", name = "ta", descriptor = "(IIIIIILea;II)V")
    private final native void method2658(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class381 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!h", name = "u", descriptor = "([I)V")
    public final native void method613(int[] arg0);

    @OriginalMember(owner = "client!h", name = "W", descriptor = "()I")
    public final native int method607();

    @OriginalMember(owner = "client!h", name = "ja", descriptor = "(I)V")
    private final native void method2660(int arg0);

    @OriginalMember(owner = "client!h", name = "K", descriptor = "(IIIIII)V")
    private final native void method2661(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!h", name = "Z", descriptor = "(IIII)V")
    public final native void method590(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!h", name = "g", descriptor = "()I")
    public final native int method523();

    @OriginalMember(owner = "client!h", name = "d", descriptor = "()I")
    public final native int method560();

    @OriginalMember(owner = "client!h", name = "f", descriptor = "(SBBZZZBBBIIZZ[I)V")
    private final native void method2662(short arg0, byte arg1, byte arg2, boolean arg3, boolean arg4, boolean arg5, byte arg6, byte arg7, byte arg8, int arg9, int arg10, boolean arg11, boolean arg12, int[] arg13);

    @OriginalMember(owner = "client!h", name = "JA", descriptor = "(II)V")
    public final native void method577(int arg0, int arg1);

    @OriginalMember(owner = "client!h", name = "l", descriptor = "(SBBZZZBBBIIZZ)V")
    private final native void method2664(short arg0, byte arg1, byte arg2, boolean arg3, boolean arg4, boolean arg5, byte arg6, byte arg7, byte arg8, int arg9, int arg10, boolean arg11, boolean arg12);

    @OriginalMember(owner = "client!h", name = "fa", descriptor = "(IIII)V")
    public final native void method521(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!h", name = "IA", descriptor = "(IIII)[I")
    public final native int[] method562(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!h", name = "la", descriptor = "()F")
    public final native float method524();

    @OriginalMember(owner = "client!h", name = "o", descriptor = "(FF)V")
    public final native void method568(float arg0, float arg1);

    @OriginalMember(owner = "client!h", name = "S", descriptor = "()V")
    public final native void method536();

    @OriginalMember(owner = "client!h", name = "U", descriptor = "(IIIII)V")
    public final native void method542(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!h", name = "ba", descriptor = "(IIII)V")
    public final native void method540(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!h", name = "I", descriptor = "()V")
    private final native void method2665();

    @OriginalMember(owner = "client!h", name = "pa", descriptor = "(IIII)V")
    public final native void method572(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!h", name = "j", descriptor = "(ILea;II)V")
    public final native void method576(int arg0, class381 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!h", name = "m", descriptor = "(Lia;)V")
    public final native void method603(class414 arg0);

    @OriginalMember(owner = "client!h", name = "w", descriptor = "()F")
    public final native float method584();

    @OriginalMember(owner = "client!h", name = "FA", descriptor = "()I")
    public final native int method518();

    @OriginalMember(owner = "client!h", name = "V", descriptor = "(III)V")
    public final native void method606(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!h", name = "ua", descriptor = "(F)V")
    public final native void method559(float arg0);

    @OriginalMember(owner = "client!h", name = "ia", descriptor = "(III[I)V")
    public final native void method526(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!h", name = "na", descriptor = "(I)V")
    public final native void method626(int arg0);

    @OriginalMember(owner = "client!h", name = "P", descriptor = "(Lla;)V")
    private final native void method2667(class313 arg0);

    @OriginalMember(owner = "client!h", name = "O", descriptor = "(IIIII)V")
    public final native void method622(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!h", name = "VA", descriptor = "(I[I[F)V")
    private final native void method2669(int arg0, int[] arg1, float[] arg2);
}
