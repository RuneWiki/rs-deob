import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uga")
public class class221 extends class65 {

    @OriginalMember(owner = "client!uga", name = "w", descriptor = "Z")
    private boolean field3007;

    @OriginalMember(owner = "client!uga", name = "v", descriptor = "Z")
    private boolean field3006;

    @OriginalMember(owner = "client!uga", name = "y", descriptor = "Lee;")
    private class706 field3009;

    @OriginalMember(owner = "client!uga", name = "M", descriptor = "I")
    public int field3022;

    @OriginalMember(owner = "client!uga", name = "O", descriptor = "I")
    public int field3024;

    @OriginalMember(owner = "client!uga", name = "U", descriptor = "I")
    public int field3030;

    @OriginalMember(owner = "client!uga", name = "I", descriptor = "Z")
    private boolean field3018;

    @OriginalMember(owner = "client!uga", name = "S", descriptor = "I")
    public int field3028;

    @OriginalMember(owner = "client!uga", name = "Q", descriptor = "I")
    public int field3026;

    @OriginalMember(owner = "client!uga", name = "W", descriptor = "I")
    public int field3032;

    @OriginalMember(owner = "client!uga", name = "D", descriptor = "I")
    public int field3013;

    @OriginalMember(owner = "client!uga", name = "G", descriptor = "I")
    public int field3016;

    @OriginalMember(owner = "client!uga", name = "K", descriptor = "I")
    public int field3020;

    @OriginalMember(owner = "client!uga", name = "gb", descriptor = "I")
    private int field3042;

    @OriginalMember(owner = "client!uga", name = "Y", descriptor = "I")
    public int field3034;

    @OriginalMember(owner = "client!uga", name = "hb", descriptor = "I")
    private int field3043;

    @OriginalMember(owner = "client!uga", name = "ib", descriptor = "I")
    public int field3044;

    @OriginalMember(owner = "client!uga", name = "jb", descriptor = "I")
    public int field3045;

    @OriginalMember(owner = "client!uga", name = "F", descriptor = "Ljda;")
    private class239 field3015;

    @OriginalMember(owner = "client!uga", name = "ob", descriptor = "I")
    private int field3050;

    @OriginalMember(owner = "client!uga", name = "db", descriptor = "Ljda;")
    private class239 field3039;

    @OriginalMember(owner = "client!uga", name = "R", descriptor = "Lni;")
    public class549 field3027;

    @OriginalMember(owner = "client!uga", name = "t", descriptor = "I")
    private int field3004;

    @OriginalMember(owner = "client!uga", name = "r", descriptor = "I")
    private int field3002;

    @OriginalMember(owner = "client!uga", name = "x", descriptor = "I")
    private int field3008;

    @OriginalMember(owner = "client!uga", name = "z", descriptor = "I")
    private int field3010;

    @OriginalMember(owner = "client!uga", name = "A", descriptor = "I")
    public int field3011;

    @OriginalMember(owner = "client!uga", name = "C", descriptor = "I")
    public int field3012;

    @OriginalMember(owner = "client!uga", name = "E", descriptor = "I")
    public int field3014;

    @OriginalMember(owner = "client!uga", name = "H", descriptor = "I")
    public int field3017;

    @OriginalMember(owner = "client!uga", name = "J", descriptor = "I")
    private int field3019;

    @OriginalMember(owner = "client!uga", name = "L", descriptor = "I")
    public int field3021;

    @OriginalMember(owner = "client!uga", name = "P", descriptor = "I")
    public int field3025;

    @OriginalMember(owner = "client!uga", name = "T", descriptor = "I")
    private int field3029;

    @OriginalMember(owner = "client!uga", name = "V", descriptor = "I")
    public int field3031;

    @OriginalMember(owner = "client!uga", name = "Z", descriptor = "I")
    public int field3035;

    @OriginalMember(owner = "client!uga", name = "ab", descriptor = "I")
    private int field3036;

    @OriginalMember(owner = "client!uga", name = "cb", descriptor = "I")
    public int field3038;

    @OriginalMember(owner = "client!uga", name = "eb", descriptor = "I")
    public int field3040;

    @OriginalMember(owner = "client!uga", name = "fb", descriptor = "I")
    private int field3041;

    @OriginalMember(owner = "client!uga", name = "lb", descriptor = "I")
    public int field3047;

    @OriginalMember(owner = "client!uga", name = "nb", descriptor = "Lvr;")
    private class147 field3049;

    @OriginalMember(owner = "client!uga", name = "u", descriptor = "Llm;")
    public class527 field3005;

    @OriginalMember(owner = "client!uga", name = "mb", descriptor = "Lvia;")
    private class590 field3048;

    @OriginalMember(owner = "client!uga", name = "s", descriptor = "Ljava/awt/Canvas;")
    private Canvas field3003;

    @OriginalMember(owner = "client!uga", name = "N", descriptor = "[F")
    public float[] field3023;

    @OriginalMember(owner = "client!uga", name = "kb", descriptor = "[F")
    public float[] field3046;

    @OriginalMember(owner = "client!uga", name = "X", descriptor = "[I")
    public int[] field3033;

    @OriginalMember(owner = "client!uga", name = "bb", descriptor = "[Lrga;")
    private class253[] field3037;

    @OriginalMember(owner = "client!uga", name = "f", descriptor = "(II)V", line = 5)
    public final void method466(int arg0, int arg1) {
        class253 var3 = this.method1473(Thread.currentThread());
        this.field3022 = arg0;
        this.field3020 = arg1;
        var3.field3734 = this.field3020 - 255;
    }

    @OriginalMember(owner = "client!uga", name = "i", descriptor = "()I", line = 11)
    public final int method539() {
        return this.field3022;
    }

    @OriginalMember(owner = "client!uga", name = "e", descriptor = "(I)V", line = 15)
    public final void method493(int arg0) {
        this.field3037[arg0].method1690((Runnable) null, -106);
    }

    @OriginalMember(owner = "client!uga", name = "XA", descriptor = "()I", line = 18)
    public final int method457() {
        return this.field3020;
    }

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(IIII)V", line = 20)
    public final void method516(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!uga", name = "g", descriptor = "()V", line = 25)
    private final void method1460() {
        for (int var1 = 0; var1 < this.field3038; ++var1) {
            this.field3037[var1].method1691(0);
        }
        this.method543();
    }

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(IIIIZ)Lvr;", line = 35)
    public final class147 method562(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int[] var6 = new int[arg2 * arg3];
        int var7 = this.field3035 * arg1 + arg0;
        int var8 = this.field3035 - arg2;
        for (int var9 = 0; var9 < arg3; ++var9) {
            int var10 = arg2 * var9;
            for (int var11 = 0; var11 < arg2; ++var11) {
                var6[var10 + var11] = this.field3033[var7++];
            }
            var7 += var8;
        }
        if (arg4) {
            return new class236(this, var6, arg2, arg3);
        } else {
            return new class690(this, var6, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!uga", name = "r", descriptor = "(IIIIIII)I", line = 69)
    public final int method454(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        float var8 = (float) arg2 * this.field3027.field7417 + (float) arg0 * this.field3027.field7416 + (float) arg1 * this.field3027.field7421 + this.field3027.field7431;
        float var9 = (float) arg5 * this.field3027.field7417 + (float) arg3 * this.field3027.field7416 + (float) arg4 * this.field3027.field7421 + this.field3027.field7431;
        int var10 = 0;
        if (var8 < (float) this.field3022 && var9 < (float) this.field3022) {
            var10 |= 16;
        } else if (var8 > (float) this.field3020 && var9 > (float) this.field3020) {
            var10 |= 32;
        }
        int var11 = (int) (((float) arg2 * this.field3027.field7433 + (float) arg0 * this.field3027.field7419 + (float) arg1 * this.field3027.field7426 + this.field3027.field7427) * (float) this.field3032 / (float) arg6);
        int var12 = (int) (((float) arg5 * this.field3027.field7433 + (float) arg3 * this.field3027.field7419 + (float) arg4 * this.field3027.field7426 + this.field3027.field7427) * (float) this.field3032 / (float) arg6);
        if (var11 < this.field3014 && var12 < this.field3014) {
            var10 |= 1;
        } else if (var11 > this.field3017 && var12 > this.field3017) {
            var10 |= 2;
        }
        int var13 = (int) (((float) arg2 * this.field3027.field7437 + (float) arg0 * this.field3027.field7418 + (float) arg1 * this.field3027.field7439 + this.field3027.field7424) * (float) this.field3024 / (float) arg6);
        int var14 = (int) (((float) arg5 * this.field3027.field7437 + (float) arg3 * this.field3027.field7418 + (float) arg4 * this.field3027.field7439 + this.field3027.field7424) * (float) this.field3024 / (float) arg6);
        if (var13 < this.field3012 && var14 < this.field3012) {
            var10 |= 4;
        } else if (var13 > this.field3031 && var14 > this.field3031) {
            var10 |= 8;
        }
        return var10;
    }

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(II[I[I)Laa;", line = 106)
    public final class514 method523(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class287(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!uga", name = "HA", descriptor = "(IIII[I)V", line = 110)
    public final void method527(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        float var6 = (float) arg2 * this.field3027.field7417 + (float) arg0 * this.field3027.field7416 + (float) arg1 * this.field3027.field7421 + this.field3027.field7431;
        if (!(var6 < (float) this.field3022) && !(var6 > (float) this.field3020)) {
            int var7 = (int) (((float) arg2 * this.field3027.field7433 + (float) arg0 * this.field3027.field7419 + (float) arg1 * this.field3027.field7426 + this.field3027.field7427) * (float) this.field3032 / (float) arg3);
            int var8 = (int) (((float) arg2 * this.field3027.field7437 + (float) arg0 * this.field3027.field7418 + (float) arg1 * this.field3027.field7439 + this.field3027.field7424) * (float) this.field3024 / (float) arg3);
            if (var7 >= this.field3014 && var7 <= this.field3017 && var8 >= this.field3012 && var8 <= this.field3031) {
                arg4[0] = var7 - this.field3014;
                arg4[1] = var8 - this.field3012;
                arg4[2] = (int) var6;
            } else {
                arg4[0] = arg4[1] = arg4[2] = -1;
            }
        } else {
            arg4[0] = arg4[1] = arg4[2] = -1;
        }
    }

    @OriginalMember(owner = "client!uga", name = "l", descriptor = "()Z", line = 134)
    public final boolean method491() {
        return false;
    }

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(Leu;Z)Lvr;", line = 138)
    public final class147 method477(class508 arg0, boolean arg1) {
        int[] var3 = arg0.field7013;
        byte[] var4 = arg0.field7018;
        int var5 = arg0.field7017;
        int var6 = arg0.field7014;
        class215 var11;
        if (arg1 && arg0.field7019 == null) {
            int[] var7 = new int[var3.length];
            byte[] var8 = new byte[var5 * var6];
            for (int var9 = 0; var9 < var6; ++var9) {
                int var12 = var5 * var9;
                for (int var13 = 0; var13 < var5; ++var13) {
                    var8[var12 + var13] = var4[var12 + var13];
                }
            }
            for (int var10 = 0; var10 < var3.length; ++var10) {
                var7[var10] = var3[var10];
            }
            var11 = new class141(this, var8, var7, var5, var6);
        } else {
            int[] var14 = new int[var5 * var6];
            byte[] var15 = arg0.field7019;
            if (var15 != null) {
                for (int var16 = 0; var16 < var6; ++var16) {
                    int var17 = var5 * var16;
                    for (int var18 = 0; var18 < var5; ++var18) {
                        var14[var17 + var18] = var3[var4[var17 + var18] & 255] | var15[var17 + var18] << 24;
                    }
                }
                var11 = new class236(this, var14, var5, var6);
            } else {
                for (int var19 = 0; var19 < var6; ++var19) {
                    int var20 = var5 * var19;
                    for (int var21 = 0; var21 < var5; ++var21) {
                        int var22 = var3[var4[var20 + var21] & 255];
                        var14[var20 + var21] = var22 != 0 ? -16777216 | var22 : 0;
                    }
                }
                var11 = new class690(this, var14, var5, var6);
            }
        }
        var11.method1112(arg0.field7020, arg0.field7016, arg0.field7015, arg0.field7021);
        return var11;
    }

    @OriginalMember(owner = "client!uga", name = "DA", descriptor = "(IIII)V", line = 241)
    public final void method540(int arg0, int arg1, int arg2, int arg3) {
        this.field3047 = arg0;
        this.field3021 = arg1;
        this.field3032 = arg2;
        this.field3024 = arg3;
        this.method1467();
    }

    @OriginalMember(owner = "client!uga", name = "F", descriptor = "(II)V", line = 250)
    public final void method492(int arg0, int arg1) {
        int var3 = this.field3035 * arg1 + arg0;
        int var4 = this.field3019 * arg1 + arg0;
        if (var3 != 0 || var4 != 0) {
            int[] var5 = this.field3033;
            float[] var6 = this.field3046;
            if (var3 < 0) {
                int var7 = var5.length + var3;
                class278.method1798(var5, -var3, var5, 0, var7);
            } else if (var3 > 0) {
                int var8 = var5.length - var3;
                class278.method1798(var5, 0, var5, var3, var8);
            }
            if (var4 < 0) {
                int var9 = var6.length + var4;
                class278.method1795(var6, -var4, var6, 0, var9);
            } else {
                if (var4 > 0) {
                    int var10 = var6.length - var4;
                    class278.method1795(var6, 0, var6, var4, var10);
                }
            }
        }
    }

    @OriginalMember(owner = "client!uga", name = "EA", descriptor = "(IIII)V", line = 295)
    public final void method557(int arg0, int arg1, int arg2, int arg3) {
        class253 var5 = this.method1473(Thread.currentThread());
        var5.field3745 = arg0;
        var5.field3740 = arg1;
        var5.field3736 = arg2;
    }

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(Ljava/awt/Canvas;II)V", line = 304)
    public final void method448(Canvas arg0, int arg1, int arg2) {
        class527 var4 = (class527) this.field3009.method3953((long) arg0.hashCode(), 14);
        if (var4 != null) {
            var4.method792((byte) -112);
            class527 var5 = class138.method1068(arg1, arg0, -128, arg2);
            this.field3009.method3962((long) arg0.hashCode(), var5, -121);
            if (this.field3003 == arg0 && this.field3048 == null) {
                Dimension var6 = arg0.getSize();
                this.field3008 = var6.width;
                this.field3002 = var6.height;
                this.field3005 = var5;
                this.field3033 = var5.field7221;
                this.field3035 = var5.field7222;
                this.field3041 = var5.field7220;
                if (this.field3035 != this.field3019 || this.field3041 != this.field3029) {
                    this.field3036 = this.field3019 = this.field3035;
                    this.field3010 = this.field3029 = this.field3041;
                    this.field3023 = this.field3046 = new float[this.field3029 * this.field3019];
                }
                this.method1460();
            }
        }
    }

    @OriginalMember(owner = "client!uga", name = "q", descriptor = "()Z", line = 334)
    public final boolean method513() {
        return false;
    }

    @OriginalMember(owner = "client!uga", name = "c", descriptor = "()Z", line = 337)
    public final boolean method461() {
        return false;
    }

    @OriginalMember(owner = "client!uga", name = "B", descriptor = "()Z", line = 340)
    public final boolean method1461() {
        return this.field3006;
    }

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(II)I", line = 343)
    public final int method498(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!uga", name = "v", descriptor = "()Z", line = 346)
    public final boolean method535() {
        return false;
    }

    @OriginalMember(owner = "client!uga", name = "e", descriptor = "(IIIIII)V", line = 349)
    private final void method1462(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 < 0) {
            arg3 = -arg3;
        }
        int var7 = arg1 - arg3;
        if (var7 < this.field3045) {
            var7 = this.field3045;
        }
        int var8 = arg1 + arg3 + 1;
        if (var8 > this.field3026) {
            var8 = this.field3026;
        }
        int var9 = var7;
        int var10 = arg3 * arg3;
        int var11 = 0;
        int var12 = arg1 - var7;
        int var13 = var12 * var12;
        int var14 = var13 - var12;
        if (arg1 > var8) {
            arg1 = var8;
        }
        int var15 = arg4 >>> 24;
        if (arg5 == 0 || arg5 == 1 && var15 == 255) {
            while (var9 < arg1) {
                while (var14 <= var10 || var13 <= var10) {
                    var13 += var11 + var11;
                    var14 += var11++ + var11;
                }
                int var65 = arg0 - var11 + 1;
                if (var65 < this.field3028) {
                    var65 = this.field3028;
                }
                int var66 = arg0 + var11;
                if (var66 > this.field3016) {
                    var66 = this.field3016;
                }
                int var67 = this.field3035 * var9 + var65;
                for (int var68 = var65; var68 < var66; ++var68) {
                    if ((float) arg2 < this.field3046[var67]) {
                        this.field3033[var67] = arg4;
                    }
                    ++var67;
                }
                ++var9;
                var13 -= var12-- + var12;
                var14 -= var12 + var12;
            }
            int var56 = arg3;
            int var57 = var9 - arg1;
            int var58 = var57 * var57 + var10;
            int var59 = var58 - arg3;
            int var60 = var58 - var57;
            while (var9 < var8) {
                while (var60 > var10 && var59 > var10) {
                    var60 -= var56-- + var56;
                    var59 -= var56 + var56;
                }
                int var61 = arg0 - var56;
                if (var61 < this.field3028) {
                    var61 = this.field3028;
                }
                int var62 = arg0 + var56;
                if (var62 > this.field3016 - 1) {
                    var62 = this.field3016 - 1;
                }
                int var63 = this.field3035 * var9 + var61;
                for (int var64 = var61; var64 <= var62; ++var64) {
                    if ((float) arg2 < this.field3046[var63]) {
                        this.field3033[var63] = arg4;
                    }
                    ++var63;
                }
                ++var9;
                var60 += var57 + var57;
                var59 += var57++ + var57;
            }
        } else if (arg5 == 1) {
            int var16 = (var15 << 24) + ((arg4 & 16711935) * var15 >> 8 & 16711935) + ((arg4 & 65280) * var15 >> 8 & 65280);
            int var17 = 256 - var15;
            while (var9 < arg1) {
                while (var14 <= var10 || var13 <= var10) {
                    var13 += var11 + var11;
                    var14 += var11++ + var11;
                }
                int var29 = arg0 - var11 + 1;
                if (var29 < this.field3028) {
                    var29 = this.field3028;
                }
                int var30 = arg0 + var11;
                if (var30 > this.field3016) {
                    var30 = this.field3016;
                }
                int var31 = this.field3035 * var9 + var29;
                for (int var32 = var29; var32 < var30; ++var32) {
                    if ((float) arg2 < this.field3046[var31]) {
                        int var33 = this.field3033[var31];
                        int var34 = ((var33 & 16711935) * var17 >> 8 & 16711935) + ((var33 & 65280) * var17 >> 8 & 65280);
                        this.field3033[var31] = var16 + var34;
                    }
                    ++var31;
                }
                ++var9;
                var13 -= var12-- + var12;
                var14 -= var12 + var12;
            }
            int var18 = arg3;
            int var19 = -var12;
            int var20 = var19 * var19 + var10;
            int var21 = var20 - arg3;
            int var22 = var20 - var19;
            while (var9 < var8) {
                while (var22 > var10 && var21 > var10) {
                    var22 -= var18-- + var18;
                    var21 -= var18 + var18;
                }
                int var23 = arg0 - var18;
                if (var23 < this.field3028) {
                    var23 = this.field3028;
                }
                int var24 = arg0 + var18;
                if (var24 > this.field3016 - 1) {
                    var24 = this.field3016 - 1;
                }
                int var25 = this.field3035 * var9 + var23;
                for (int var26 = var23; var26 <= var24; ++var26) {
                    if ((float) arg2 < this.field3046[var25]) {
                        int var27 = this.field3033[var25];
                        int var28 = ((var27 & 16711935) * var17 >> 8 & 16711935) + ((var27 & 65280) * var17 >> 8 & 65280);
                        this.field3033[var25] = var16 + var28;
                    }
                    ++var25;
                }
                ++var9;
                var22 += var19 + var19;
                var21 += var19++ + var19;
            }
        } else if (arg5 != 2) {
            throw new IllegalArgumentException();
        } else {
            while (var9 < arg1) {
                while (var14 <= var10 || var13 <= var10) {
                    var13 += var11 + var11;
                    var14 += var11++ + var11;
                }
                int var48 = arg0 - var11 + 1;
                if (var48 < this.field3028) {
                    var48 = this.field3028;
                }
                int var49 = arg0 + var11;
                if (var49 > this.field3016) {
                    var49 = this.field3016;
                }
                int var50 = this.field3035 * var9 + var48;
                for (int var51 = var48; var51 < var49; ++var51) {
                    if ((float) arg2 < this.field3046[var50]) {
                        int var52 = this.field3033[var50];
                        int var53 = arg4 + var52;
                        int var54 = (arg4 & 16711935) + (var52 & 16711935);
                        int var55 = (var53 - var54 & 65536) + (var54 & 16777472);
                        this.field3033[var50] = var53 - var55 | var55 - (var55 >>> 8);
                    }
                    ++var50;
                }
                ++var9;
                var13 -= var12-- + var12;
                var14 -= var12 + var12;
            }
            int var35 = arg3;
            int var36 = -var12;
            int var37 = var36 * var36 + var10;
            int var38 = var37 - arg3;
            int var39 = var37 - var36;
            while (var9 < var8) {
                while (var39 > var10 && var38 > var10) {
                    var39 -= var35-- + var35;
                    var38 -= var35 + var35;
                }
                int var40 = arg0 - var35;
                if (var40 < this.field3028) {
                    var40 = this.field3028;
                }
                int var41 = arg0 + var35;
                if (var41 > this.field3016 - 1) {
                    var41 = this.field3016 - 1;
                }
                int var42 = this.field3035 * var9 + var40;
                for (int var43 = var40; var43 <= var41; ++var43) {
                    if ((float) arg2 < this.field3046[var42]) {
                        int var44 = this.field3033[var42];
                        int var45 = arg4 + var44;
                        int var46 = (arg4 & 16711935) + (var44 & 16711935);
                        int var47 = (var45 - var46 & 65536) + (var46 & 16777472);
                        this.field3033[var42] = var45 - var47 | var47 - (var47 >>> 8);
                    }
                    ++var42;
                }
                ++var9;
                var39 += var36 + var36;
                var38 += var36++ + var36;
            }
        }
    }

    @OriginalMember(owner = "client!uga", name = "Q", descriptor = "(IIIIII[BII)V", line = 665)
    public final void method489(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        if (arg2 > 0 && arg3 > 0) {
            int var10 = 0;
            int var11 = 0;
            int var12 = (arg7 << 16) / arg2;
            int var13 = (arg6.length / arg7 << 16) / arg3;
            int var14 = this.field3035 * arg1 + arg0;
            int var15 = this.field3035 - arg2;
            if (arg1 + arg3 > this.field3026) {
                arg3 -= arg1 + arg3 - this.field3026;
            }
            if (arg1 < this.field3045) {
                int var16 = this.field3045 - arg1;
                arg3 -= var16;
                var14 += this.field3035 * var16;
                var11 += var13 * var16;
            }
            if (arg0 + arg2 > this.field3016) {
                int var17 = arg0 + arg2 - this.field3016;
                arg2 -= var17;
                var15 += var17;
            }
            if (arg0 < this.field3028) {
                int var18 = this.field3028 - arg0;
                arg2 -= var18;
                var14 += var18;
                var10 += var12 * var18;
                var15 += var18;
            }
            int var19 = arg4 >>> 24;
            int var20 = arg5 >>> 24;
            if (arg8 != 0 && (arg8 != 1 || var19 != 255 || var20 != 255)) {
                if (arg8 == 1) {
                    int var21 = var10;
                    for (int var22 = -arg3; var22 < 0; ++var22) {
                        int var23 = (var11 >> 16) * arg7;
                        for (int var24 = -arg2; var24 < 0; ++var24) {
                            int var25 = arg4;
                            if (arg6[(var10 >> 16) + var23] != 0) {
                                var25 = arg5;
                            }
                            int var26 = var25 >>> 24;
                            int var27 = 255 - var26;
                            int var28 = this.field3033[var14];
                            this.field3033[var14++] = ((var25 & 16711935) * var26 + (var28 & 16711935) * var27 & -16711936) + ((var25 & 65280) * var26 + (var28 & 65280) * var27 & 16711680) >> 8;
                            var10 += var12;
                        }
                        var11 += var13;
                        var10 = var21;
                        var14 += var15;
                    }
                } else if (arg8 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    int var29 = var10;
                    for (int var30 = -arg3; var30 < 0; ++var30) {
                        int var31 = (var11 >> 16) * arg7;
                        for (int var32 = -arg2; var32 < 0; ++var32) {
                            int var33 = arg4;
                            if (arg6[(var10 >> 16) + var31] != 0) {
                                var33 = arg5;
                            }
                            if (var33 != 0) {
                                int var34 = this.field3033[var14];
                                int var35 = var33 + var34;
                                int var36 = (var33 & 16711935) + (var34 & 16711935);
                                int var37 = (var35 - var36 & 65536) + (var36 & 16777472);
                                this.field3033[var14++] = var35 - var37 | var37 - (var37 >>> 8);
                            } else {
                                ++var14;
                            }
                            var10 += var12;
                        }
                        var11 += var13;
                        var10 = var29;
                        var14 += var15;
                    }
                }
            } else {
                int var38 = var10;
                for (int var39 = -arg3; var39 < 0; ++var39) {
                    int var40 = (var11 >> 16) * arg7;
                    for (int var41 = -arg2; var41 < 0; ++var41) {
                        if (arg6[(var10 >> 16) + var40] != 0) {
                            this.field3033[var14++] = arg5;
                        } else {
                            this.field3033[var14++] = arg4;
                        }
                        var10 += var12;
                    }
                    var11 += var13;
                    var10 = var38;
                    var14 += var15;
                }
            }
        }
    }

    @OriginalMember(owner = "client!uga", name = "u", descriptor = "()Z", line = 840)
    public final boolean method534() {
        return true;
    }

    @OriginalMember(owner = "client!uga", name = "f", descriptor = "()Luu;", line = 843)
    public final class303 method472() {
        return new class549();
    }

    @OriginalMember(owner = "client!uga", name = "A", descriptor = "(ILaa;II)V", line = 847)
    public final void method518(int arg0, class514 arg1, int arg2, int arg3) {
        class287 var5 = (class287) arg1;
        int[] var6 = var5.field4231;
        int[] var7 = var5.field4229;
        int var8;
        if (this.field3026 < var6.length + arg3) {
            var8 = this.field3026 - arg3;
        } else {
            var8 = var6.length;
        }
        int var9;
        if (this.field3045 > arg3) {
            var9 = this.field3045 - arg3;
            arg3 = this.field3045;
        } else {
            var9 = 0;
        }
        if (var8 - var9 > 0) {
            int var10 = this.field3035 * arg3;
            for (int var11 = var9; var11 < var8; ++var11) {
                int var12 = var6[var11] + arg2;
                int var13 = var7[var11];
                if (this.field3028 > var12) {
                    var13 -= this.field3028 - var12;
                    var12 = this.field3028;
                }
                if (this.field3016 < var12 + var13) {
                    var13 = this.field3016 - var12;
                }
                int var14 = var10 + var12;
                for (int var15 = -var13; var15 < 0; ++var15) {
                    this.field3033[var14++] = arg0;
                }
                var10 += this.field3035;
            }
        }
    }

    @OriginalMember(owner = "client!uga", name = "pa", descriptor = "()V", line = 906)
    public final void method555() {
        for (int var1 = 0; var1 < this.field3037.length; ++var1) {
            this.field3037[var1].field3740 = this.field3037[var1].field3735;
            this.field3037[var1].field3744 = false;
        }
    }

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(Lvj;IIII)V", line = 917)
    private final void method1463(class468 arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = arg0.field6496;
        int var8 = arg4 << 1;
        if (var6 == -1) {
            this.method1462(arg1, arg2, arg3, arg4, arg0.field6497, 1);
        } else {
            if (this.field3050 != var6) {
                class147 var9 = (class147) this.field3015.method1541(-10, (long) var6);
                if (var9 == null) {
                    int[] var10 = this.method1469(var6);
                    if (var10 == null) {
                        return;
                    }
                    int var11 = this.method1472(var6) ? 64 : this.field3034;
                    var9 = this.method499(var11, var10, true, 0, var11, var11);
                    this.field3015.method1544(true, var9, (long) var6);
                }
                this.field3050 = var6;
                this.field3049 = var9;
            }
            ++var8;
            ((class215) this.field3049).method1085(arg1 - arg4, arg2 - arg4, arg3, var8, var8, 0, arg0.field6497, 1, 1);
        }
    }

    @OriginalMember(owner = "client!uga", name = "c", descriptor = "(II)I", line = 955)
    public final int method517(int arg0, int arg1) {
        int var3 = arg0 | 133120;
        return var3 & arg1 ^ arg1;
    }

    @OriginalMember(owner = "client!uga", name = "ra", descriptor = "(IIII)V", line = 961)
    public final void method552(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field3037.length; ++var5) {
            this.field3037[var5].field3735 = this.field3037[var5].field3740;
            this.field3037[var5].field3745 = arg0;
            this.field3037[var5].field3740 = arg1;
            this.field3037[var5].field3736 = arg2;
            this.field3037[var5].field3744 = true;
        }
    }

    @OriginalMember(owner = "client!uga", name = "H", descriptor = "(III[I)V", line = 975)
    public final void method551(int arg0, int arg1, int arg2, int[] arg3) {
        float var5 = (float) arg2 * this.field3027.field7417 + (float) arg0 * this.field3027.field7416 + (float) arg1 * this.field3027.field7421 + this.field3027.field7431;
        if (var5 == 0.0F) {
            arg3[0] = arg3[1] = arg3[2] = -1;
        } else {
            int var6 = (int) (((float) arg2 * this.field3027.field7433 + (float) arg0 * this.field3027.field7419 + (float) arg1 * this.field3027.field7426 + this.field3027.field7427) * (float) this.field3032 / var5);
            int var7 = (int) (((float) arg2 * this.field3027.field7437 + (float) arg0 * this.field3027.field7418 + (float) arg1 * this.field3027.field7439 + this.field3027.field7424) * (float) this.field3024 / var5);
            arg3[0] = var6 - this.field3014;
            arg3[1] = var7 - this.field3012;
            arg3[2] = (int) var5;
        }
    }

    @OriginalMember(owner = "client!uga", name = "T", descriptor = "(IIII)V", line = 991)
    public final void method556(int arg0, int arg1, int arg2, int arg3) {
        if (this.field3028 < arg0) {
            this.field3028 = arg0;
        }
        if (this.field3045 < arg1) {
            this.field3045 = arg1;
        }
        if (this.field3016 > arg2) {
            this.field3016 = arg2;
        }
        if (this.field3026 > arg3) {
            this.field3026 = arg3;
        }
        this.method1467();
    }

    @OriginalMember(owner = "client!uga", name = "b", descriptor = "(Z)V", line = 1005)
    public final void method541(boolean arg0) {
    }

    @OriginalMember(owner = "client!uga", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 1008)
    public final void method476(Canvas arg0) {
        if (this.field3003 == arg0) {
            this.method460((Canvas) null);
        }
        class527 var2 = (class527) this.field3009.method3953((long) arg0.hashCode(), 14);
        if (var2 != null) {
            var2.method792((byte) -99);
        }
    }

    @OriginalMember(owner = "client!uga", name = "m", descriptor = "()V", line = 1017)
    public final void method500() {
    }

    @OriginalMember(owner = "client!uga", name = "ya", descriptor = "()V", line = 1020)
    public final void method483() {
        if (this.field3028 == 0 && this.field3035 == this.field3016 && this.field3045 == 0 && this.field3041 == this.field3026) {
            int var1 = this.field3046.length;
            int var2 = var1 - (var1 & 7);
            int var3 = 0;
            while (var3 < var2) {
                this.field3046[var3++] = 2.1474836E9F;
                this.field3046[var3++] = 2.1474836E9F;
                this.field3046[var3++] = 2.1474836E9F;
                this.field3046[var3++] = 2.1474836E9F;
                this.field3046[var3++] = 2.1474836E9F;
                this.field3046[var3++] = 2.1474836E9F;
                this.field3046[var3++] = 2.1474836E9F;
                this.field3046[var3++] = 2.1474836E9F;
            }
            while (var3 < var1) {
                this.field3046[var3++] = 2.1474836E9F;
            }
        } else {
            int var4 = this.field3016 - this.field3028;
            int var5 = this.field3026 - this.field3045;
            int var6 = this.field3035 - var4;
            int var7 = this.field3045 * this.field3035 + this.field3028;
            int var8 = var4 >> 3;
            int var9 = var4 & 7;
            int var10 = var7 - 1;
            for (int var11 = -var5; var11 < 0; ++var11) {
                if (var8 > 0) {
                    int var12 = var8;
                    do {
                        ++var10;
                        this.field3046[var10] = 2.1474836E9F;
                        ++var10;
                        this.field3046[var10] = 2.1474836E9F;
                        ++var10;
                        this.field3046[var10] = 2.1474836E9F;
                        ++var10;
                        this.field3046[var10] = 2.1474836E9F;
                        ++var10;
                        this.field3046[var10] = 2.1474836E9F;
                        ++var10;
                        this.field3046[var10] = 2.1474836E9F;
                        ++var10;
                        this.field3046[var10] = 2.1474836E9F;
                        ++var10;
                        this.field3046[var10] = 2.1474836E9F;
                        --var12;
                    } while (var12 > 0);
                }
                if (var9 > 0) {
                    int var13 = var9;
                    do {
                        ++var10;
                        this.field3046[var10] = 2.1474836E9F;
                        --var13;
                    } while (var13 > 0);
                }
                var10 += var6;
            }
        }
    }

    @OriginalMember(owner = "client!uga", name = "d", descriptor = "(I)I", line = 1100)
    public final int method1464(int arg0) {
        return super.field912.method1174(arg0, true).field9137 & 65535;
    }

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(Lef;)V", line = 1104)
    public final void method524(class515 arg0) {
        class253 var2 = this.method1473(Thread.currentThread());
        class424 var3 = arg0.field7049.field1011;
        for (class424 var4 = var3.field6051; var3 != var4; var4 = var4.field6051) {
            class468 var5 = (class468) var4;
            int var6 = var5.field6493 >> 12;
            int var7 = var5.field6486 >> 12;
            int var8 = var5.field6488 >> 12;
            float var9 = (float) var8 * this.field3027.field7417 + (float) var6 * this.field3027.field7416 + (float) var7 * this.field3027.field7421 + this.field3027.field7431;
            if (!(var9 < (float) this.field3022) && !(var9 > (float) var2.field3734)) {
                int var10 = (int) (((float) var8 * this.field3027.field7433 + (float) var6 * this.field3027.field7419 + (float) var7 * this.field3027.field7426 + this.field3027.field7427) * (float) this.field3032 / var9) + this.field3047;
                int var11 = (int) (((float) var8 * this.field3027.field7437 + (float) var6 * this.field3027.field7418 + (float) var7 * this.field3027.field7439 + this.field3027.field7424) * (float) this.field3024 / var9) + this.field3021;
                if (var10 >= this.field3028 && var10 <= this.field3016 && var11 >= this.field3045 && var11 <= this.field3026) {
                    if (var9 == 0.0F) {
                        var9 = 1.0F;
                    }
                    this.method1463(var5, var10, var11, (int) var9, (int) ((float) (this.field3032 * var5.field6487 >> 12) / var9));
                }
            }
        }
    }

    @OriginalMember(owner = "client!uga", name = "E", descriptor = "()I", line = 1142)
    public final int method567() {
        return 0;
    }

    @OriginalMember(owner = "client!uga", name = "y", descriptor = "()Z", line = 1145)
    public final boolean method560() {
        return false;
    }

    @OriginalMember(owner = "client!uga", name = "g", descriptor = "(I)V", line = 1149)
    public final void method546(int arg0) {
        int var2 = arg0 - this.field3004;
        for (Object var3 = this.field3039.method1554(false); var3 != null; var3 = this.field3039.method1543(-73)) {
            class223 var4 = (class223) var3;
            if (var4.field3059) {
                var4.field3060 += var2;
                int var5 = var4.field3060 / 20;
                if (var5 > 0) {
                    class662 var6 = super.field912.method1174(var4.field3058, true);
                    var4.method1481(var6.field9152 * var2 * 50 / 1000, var6.field9157 * var2 * 50 / 1000);
                    var4.field3060 -= var5 * 20;
                }
                var4.field3059 = false;
            }
        }
        this.field3004 = arg0;
        this.field3015.method1546(5, (byte) -8);
        this.field3039.method1546(5, (byte) -8);
    }

    @OriginalMember(owner = "client!uga", name = "x", descriptor = "()Lcja;", line = 1181)
    public final class45 method558() {
        return new class45(0, "Pure Java", 1, "CPU", 0L);
    }

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(Ldn;Ldn;FLdn;)Ldn;", line = 1184)
    public final class544 method497(class544 arg0, class544 arg1, float arg2, class544 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!uga", name = "i", descriptor = "(I)Z", line = 1187)
    public final boolean method1465(int arg0) {
        return super.field912.method1174(arg0, true).field9155 || super.field912.method1174(arg0, true).field9147;
    }

    @OriginalMember(owner = "client!uga", name = "o", descriptor = "()V", line = 1189)
    public final void method503() {
    }

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(IIIIIIII)V", line = 1192)
    private final void method1466(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg0 >= this.field3028 && arg0 < this.field3016) {
            int var9 = this.field3035 * arg1 + arg0;
            int var10 = arg3 >>> 24;
            int var11 = arg5 + arg6;
            int var12 = arg7 % var11;
            if (arg4 != 0 && (arg4 != 1 || var10 != 255)) {
                if (arg4 == 1) {
                    int var13 = (var10 << 24) + ((arg3 & 16711935) * var10 >> 8 & 16711935) + ((arg3 & 65280) * var10 >> 8 & 65280);
                    int var14 = 256 - var10;
                    int var15 = 0;
                    while (var15 < arg2) {
                        if (arg1 + var15 >= this.field3045 && arg1 + var15 < this.field3026 && var12 < arg5) {
                            int var16 = this.field3035 * var15 + var9;
                            int var17 = this.field3033[var16];
                            int var18 = ((var17 & 16711935) * var14 >> 8 & 16711935) + ((var17 & 65280) * var14 >> 8 & 65280);
                            this.field3033[var16] = var13 + var18;
                        }
                        ++var15;
                        ++var12;
                        var12 %= var11;
                    }
                } else if (arg4 == 2) {
                    int var19 = 0;
                    while (var19 < arg2) {
                        if (arg1 + var19 >= this.field3045 && arg1 + var19 < this.field3026 && var12 < arg5) {
                            int var20 = this.field3035 * var19 + var9;
                            int var21 = this.field3033[var20];
                            int var22 = arg3 + var21;
                            int var23 = (arg3 & 16711935) + (var21 & 16711935);
                            int var24 = (var22 - var23 & 65536) + (var23 & 16777472);
                            this.field3033[var20] = var22 - var24 | var24 - (var24 >>> 8);
                        }
                        ++var19;
                        ++var12;
                        var12 %= var11;
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            } else {
                int var25 = 0;
                while (var25 < arg2) {
                    if (arg1 + var25 >= this.field3045 && arg1 + var25 < this.field3026 && var12 < arg5) {
                        this.field3033[this.field3035 * var25 + var9] = arg3;
                    }
                    ++var25;
                    ++var12;
                    var12 %= var11;
                }
            }
        }
    }

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(Lvv;)V", line = 1278)
    public final void method549(class345 arg0) {
        class590 var2 = (class590) arg0;
        this.field3035 = var2.field7958;
        this.field3041 = var2.field7954;
        this.field3033 = var2.field7960;
        this.field3048 = var2;
        this.field3019 = var2.field7958;
        this.field3029 = var2.field7954;
        this.field3046 = var2.field7952;
        this.method1460();
    }

    @OriginalMember(owner = "client!uga", name = "b", descriptor = "(II)V", line = 1292)
    public final void method504(int arg0, int arg1) throws class566 {
        if (this.field3003 != null && this.field3005 != null) {
            try {
                Graphics var3 = this.field3003.getGraphics();
                this.field3005.method709(this.field3008, arg1, 0, this.field3002, arg0, var3, 0, -25644);
            } catch (Exception var4) {
                this.field3003.repaint();
            }
        } else {
            throw new IllegalStateException("off");
        }
    }

    @OriginalMember(owner = "client!uga", name = "j", descriptor = "()Z", line = 1309)
    public final boolean method484() {
        return false;
    }

    @OriginalMember(owner = "client!uga", name = "da", descriptor = "(III[I)V", line = 1313)
    public final void method455(int arg0, int arg1, int arg2, int[] arg3) {
        float var5 = (float) arg2 * this.field3027.field7417 + (float) arg0 * this.field3027.field7416 + (float) arg1 * this.field3027.field7421 + this.field3027.field7431;
        if (!(var5 < (float) this.field3022) && !(var5 > (float) this.field3020)) {
            int var6 = (int) (((float) arg2 * this.field3027.field7433 + (float) arg0 * this.field3027.field7419 + (float) arg1 * this.field3027.field7426 + this.field3027.field7427) * (float) this.field3032 / var5);
            int var7 = (int) (((float) arg2 * this.field3027.field7437 + (float) arg0 * this.field3027.field7418 + (float) arg1 * this.field3027.field7439 + this.field3027.field7424) * (float) this.field3024 / var5);
            if (var6 >= this.field3014 && var6 <= this.field3017 && var7 >= this.field3012 && var7 <= this.field3031) {
                arg3[0] = var6 - this.field3014;
                arg3[1] = var7 - this.field3012;
                arg3[2] = (int) var5;
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(Ldn;)V", line = 1337)
    public final void method473(class544 arg0) {
    }

    @OriginalMember(owner = "client!uga", name = "C", descriptor = "()V", line = 1340)
    private final void method1467() {
        this.field3014 = this.field3028 - this.field3047;
        this.field3017 = this.field3016 - this.field3047;
        this.field3012 = this.field3045 - this.field3021;
        this.field3031 = this.field3026 - this.field3021;
        for (int var1 = 0; var1 < this.field3038; ++var1) {
            class681 var5 = this.field3037[var1].field3780;
            var5.field9555 = this.field3047 - this.field3028;
            var5.field9548 = this.field3021 - this.field3045;
            var5.field9550 = this.field3016 - this.field3028;
            var5.field9553 = this.field3026 - this.field3045;
        }
        int var2 = this.field3045 * this.field3035 + this.field3028;
        for (int var3 = this.field3045; var3 < this.field3026; ++var3) {
            for (int var4 = 0; var4 < this.field3038; ++var4) {
                this.field3037[var4].field3780.field9558[var3 - this.field3045] = var2;
            }
            var2 += this.field3035;
        }
    }

    @OriginalMember(owner = "client!uga", name = "e", descriptor = "(II)Ltq;", line = 1378)
    public final class656 method536(int arg0, int arg1) {
        return new class355(arg0, arg1);
    }

    @OriginalMember(owner = "client!uga", name = "xa", descriptor = "(F)V", line = 1381)
    public final void method452(float arg0) {
        this.field3013 = (int) (arg0 * 65535.0F);
    }

    @OriginalMember(owner = "client!uga", name = "b", descriptor = "(I)V", line = 1384)
    public final void method469(int arg0) {
        this.field3037[arg0].method1690(Thread.currentThread(), -45);
    }

    @OriginalMember(owner = "client!uga", name = "d", descriptor = "(II)Lbfa;", line = 1387)
    public final class390 method528(int arg0, int arg1) {
        return this.method508(arg0, arg1, false);
    }

    @OriginalMember(owner = "client!uga", name = "<init>", descriptor = "(Ld;)V", line = 1391)
    private class221(class161 arg0) {
        super(arg0);
        this.field3007 = false;
        this.field3006 = false;
        this.field3009 = new class706(4);
        this.field3022 = 50;
        this.field3024 = 512;
        this.field3030 = 78642;
        this.field3018 = false;
        this.field3028 = 0;
        this.field3026 = 0;
        this.field3032 = 512;
        this.field3013 = 75518;
        this.field3016 = 0;
        this.field3020 = 3500;
        this.field3042 = 0;
        this.field3034 = 128;
        this.field3043 = 0;
        this.field3044 = 45823;
        this.field3045 = 0;
        this.field3015 = new class239(16);
        this.field3050 = -1;
        try {
            this.field3039 = new class239(256);
            this.field3027 = new class549();
            this.method554(1);
            this.method469(0);
            class679.method3753(true, true, true);
            this.field3007 = true;
            this.field3004 = (int) class302.method1910(0);
        } catch (Throwable var3) {
            var3.printStackTrace();
            this.method470((byte) 23);
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!uga", name = "I", descriptor = "()I", line = 1408)
    public final int method490() {
        int var1 = this.field3043;
        this.field3043 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!uga", name = "j", descriptor = "(I)[I", line = 1414)
    public final int[] method1468(int arg0) {
        class239 var2 = this.field3039;
        class223 var3;
        synchronized (this.field3039) {
            var3 = (class223) this.field3039.method1541(-10, (long) arg0);
            if (var3 == null) {
                if (!super.field912.method1173(true, arg0)) {
                    return null;
                }
                class662 var5 = super.field912.method1174(arg0, true);
                int var6 = !var5.field9143 && !this.field3018 ? this.field3034 : 64;
                var3 = new class223(arg0, var6, super.field912.method1177(var6, true, var6, 0.7F, arg0, (byte) -122), var5.field9135 != 1);
                this.field3039.method1544(true, var3, (long) arg0);
            }
        }
        var3.field3059 = true;
        return var3.method1480();
    }

    @OriginalMember(owner = "client!uga", name = "w", descriptor = "()Z", line = 1434)
    public final boolean method542() {
        return false;
    }

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(Leia;[Leu;Z)Lda;", line = 1438)
    public final class66 method545(class255 arg0, class508[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field7017;
            var5[var7] = arg1[var7].field7014;
            if (arg1[var7].field7019 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            if (var6) {
                return new class575(this, arg0, arg1, var4, var5);
            } else {
                return new class748(this, arg0, arg1, var4, var5);
            }
        } else if (var6) {
            throw new IllegalArgumentException("");
        } else {
            return new class715(this, arg0, arg1, var4, var5);
        }
    }

    @OriginalMember(owner = "client!uga", name = "aa", descriptor = "(IIIIII)V", line = 1475)
    public final void method563(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < this.field3028) {
            arg2 -= this.field3028 - arg0;
            arg0 = this.field3028;
        }
        if (arg1 < this.field3045) {
            arg3 -= this.field3045 - arg1;
            arg1 = this.field3045;
        }
        if (arg0 + arg2 > this.field3016) {
            arg2 = this.field3016 - arg0;
        }
        if (arg1 + arg3 > this.field3026) {
            arg3 = this.field3026 - arg1;
        }
        if (arg2 > 0 && arg3 > 0 && arg0 <= this.field3016 && arg1 <= this.field3026) {
            int var7 = this.field3035 - arg2;
            int var8 = this.field3035 * arg1 + arg0;
            int var9 = arg4 >>> 24;
            if (arg5 == 0 || arg5 == 1 && var9 == 255) {
                int var22 = arg2 >> 3;
                int var23 = arg2 & 7;
                int var24 = var8 - 1;
                for (int var25 = -arg3; var25 < 0; ++var25) {
                    if (var22 > 0) {
                        int var26 = var22;
                        do {
                            ++var24;
                            this.field3033[var24] = arg4;
                            ++var24;
                            this.field3033[var24] = arg4;
                            ++var24;
                            this.field3033[var24] = arg4;
                            ++var24;
                            this.field3033[var24] = arg4;
                            ++var24;
                            this.field3033[var24] = arg4;
                            ++var24;
                            this.field3033[var24] = arg4;
                            ++var24;
                            this.field3033[var24] = arg4;
                            ++var24;
                            this.field3033[var24] = arg4;
                            --var26;
                        } while (var26 > 0);
                    }
                    if (var23 > 0) {
                        int var27 = var23;
                        do {
                            ++var24;
                            this.field3033[var24] = arg4;
                            --var27;
                        } while (var27 > 0);
                    }
                    var24 += var7;
                }
            } else if (arg5 == 1) {
                int var10 = ((arg4 & 16711935) * var9 >> 8 & 16711935) + (((arg4 & -16711936) >>> 8) * var9 & -16711936);
                int var11 = 256 - var9;
                for (int var12 = 0; var12 < arg3; ++var12) {
                    for (int var13 = -arg2; var13 < 0; ++var13) {
                        int var14 = this.field3033[var8];
                        int var15 = ((var14 & 16711935) * var11 >> 8 & 16711935) + (((var14 & -16711936) >>> 8) * var11 & -16711936);
                        this.field3033[var8++] = var10 + var15;
                    }
                    var8 += var7;
                }
            } else if (arg5 != 2) {
                throw new IllegalArgumentException();
            } else {
                for (int var16 = 0; var16 < arg3; ++var16) {
                    for (int var17 = -arg2; var17 < 0; ++var17) {
                        int var18 = this.field3033[var8];
                        int var19 = arg4 + var18;
                        int var20 = (arg4 & 16711935) + (var18 & 16711935);
                        int var21 = (var19 - var20 & 65536) + (var20 & 16777472);
                        this.field3033[var8++] = var19 - var21 | var21 - (var21 >>> 8);
                    }
                    var8 += var7;
                }
            }
        }
    }

    @OriginalMember(owner = "client!uga", name = "la", descriptor = "()V", line = 1610)
    public final void method543() {
        this.field3028 = 0;
        this.field3045 = 0;
        this.field3016 = this.field3035;
        this.field3026 = this.field3041;
        this.method1467();
    }

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "([I)V", line = 1617)
    public final void method561(int[] arg0) {
        arg0[0] = this.field3035;
        arg0[1] = this.field3041;
    }

    @OriginalMember(owner = "client!uga", name = "ZA", descriptor = "(IFFFFF)V", line = 1621)
    public final void method533(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        this.field3044 = (int) (arg1 * 65535.0F);
        this.field3030 = (int) (arg2 * 65535.0F);
        float var7 = (float) Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4));
        this.field3025 = (int) (arg3 * 65535.0F / var7);
        this.field3011 = (int) (arg4 * 65535.0F / var7);
        this.field3040 = (int) (arg5 * 65535.0F / var7);
    }

    @OriginalMember(owner = "client!uga", name = "Y", descriptor = "()[I", line = 1630)
    public final int[] method496() {
        return new int[] { this.field3047, this.field3021, this.field3032, this.field3024 };
    }

    @OriginalMember(owner = "client!uga", name = "JA", descriptor = "(IIIIII)I", line = 1634)
    public final int method505(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = 0;
        float var8 = (float) arg2 * this.field3027.field7417 + (float) arg0 * this.field3027.field7416 + (float) arg1 * this.field3027.field7421 + this.field3027.field7431;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        float var9 = (float) arg5 * this.field3027.field7417 + (float) arg3 * this.field3027.field7416 + (float) arg4 * this.field3027.field7421 + this.field3027.field7431;
        if (var9 < 1.0F) {
            var9 = 1.0F;
        }
        if (var8 < (float) this.field3022 && var9 < (float) this.field3022) {
            var7 |= 16;
        } else if (var8 > (float) this.field3020 && var9 > (float) this.field3020) {
            var7 |= 32;
        }
        int var10 = (int) (((float) arg2 * this.field3027.field7433 + (float) arg0 * this.field3027.field7419 + (float) arg1 * this.field3027.field7426 + this.field3027.field7427) * (float) this.field3032 / var8);
        int var11 = (int) (((float) arg5 * this.field3027.field7433 + (float) arg3 * this.field3027.field7419 + (float) arg4 * this.field3027.field7426 + this.field3027.field7427) * (float) this.field3032 / var9);
        if (var10 < this.field3014 && var11 < this.field3014) {
            var7 |= 1;
        } else if (var10 > this.field3017 && var11 > this.field3017) {
            var7 |= 2;
        }
        int var12 = (int) (((float) arg2 * this.field3027.field7437 + (float) arg0 * this.field3027.field7418 + (float) arg1 * this.field3027.field7439 + this.field3027.field7424) * (float) this.field3024 / var8);
        int var13 = (int) (((float) arg5 * this.field3027.field7437 + (float) arg3 * this.field3027.field7418 + (float) arg4 * this.field3027.field7439 + this.field3027.field7424) * (float) this.field3024 / var9);
        if (var12 < this.field3012 && var13 < this.field3012) {
            var7 |= 4;
        } else if (var12 > this.field3031 && var13 > this.field3031) {
            var7 |= 8;
        }
        return var7;
    }

    @OriginalMember(owner = "client!uga", name = "k", descriptor = "(I)[I", line = 1678)
    public final int[] method1469(int arg0) {
        class239 var2 = this.field3039;
        class223 var3;
        synchronized (this.field3039) {
            var3 = (class223) this.field3039.method1541(-10, (long) arg0 | Long.MIN_VALUE);
            if (var3 == null) {
                if (!super.field912.method1173(true, arg0)) {
                    return null;
                }
                class662 var5 = super.field912.method1174(arg0, true);
                int var6 = !var5.field9143 && !this.field3018 ? this.field3034 : 64;
                var3 = new class223(arg0, var6, super.field912.method1178(var6, arg0, -123, 0.7F, var6, true), var5.field9135 != 1);
                this.field3039.method1544(true, var3, (long) arg0 | Long.MIN_VALUE);
            }
        }
        var3.field3059 = true;
        return var3.method1480();
    }

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(II[[I[[IIII)Ls;", line = 1698)
    public final class296 method547(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class171(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!uga", name = "GA", descriptor = "(I)V", line = 1701)
    public final void method458(int arg0) {
        this.method563(0, 0, this.field3035, this.field3041, arg0, 0);
    }

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(IIIIIIIIIIIII)V", line = 1708)
    public final void method537(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        class253 var14 = this.method1473(Thread.currentThread());
        class681 var15 = var14.field3780;
        var15.field9547 = false;
        int var16 = arg0 - this.field3014;
        int var17 = arg3 - this.field3014;
        int var18 = arg6 - this.field3014;
        int var19 = arg1 - this.field3012;
        int var20 = arg4 - this.field3012;
        int var21 = arg7 - this.field3012;
        var15.field9561 = var16 < 0 || var16 > var15.field9550 || var17 < 0 || var17 > var15.field9550 || var18 < 0 || var18 > var15.field9550;
        int var22 = arg9 >>> 24;
        if (arg12 != 0 && (arg12 != 1 || var22 != 255)) {
            if (arg12 == 1) {
                var15.field9546 = 255 - var22;
                var15.field9559 = false;
                var15.method3767((float) var19, (float) var20, (float) var21, (float) var16, (float) var17, (float) var18, (float) arg2, (float) arg5, (float) arg8, arg9, arg10, arg11);
            } else {
                if (arg12 != 2) {
                    throw new IllegalArgumentException();
                }
                var15.field9546 = 128;
                var15.field9559 = true;
                var15.method3767((float) var19, (float) var20, (float) var21, (float) var16, (float) var17, (float) var18, (float) arg2, (float) arg5, (float) arg8, arg9, arg10, arg11);
            }
        } else {
            var15.field9546 = 0;
            var15.field9559 = false;
            var15.method3767((float) var19, (float) var20, (float) var21, (float) var16, (float) var17, (float) var18, (float) arg2, (float) arg5, (float) arg8, arg9, arg10, arg11);
        }
        var15.field9547 = true;
    }

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(I)V", line = 1749)
    public final void method459(int arg0) {
        class116.field1590 = arg0;
        class116.field1585 = arg0;
        if (this.field3038 > 1) {
            throw new IllegalStateException("No MT");
        } else {
            this.method554(this.field3038);
            this.method469(0);
        }
    }

    @OriginalMember(owner = "client!uga", name = "b", descriptor = "(IIIID)V", line = 1758)
    public final void method447(int arg0, int arg1, int arg2, int arg3, double arg4) {
        int var7 = this.field3019 - arg2;
        int var8 = this.field3019 * arg1 + arg0;
        float[] var9 = this.field3046;
        int var10 = 0;
        while (var10 < arg3) {
            int var11 = 0;
            while (var11 < arg2) {
                float var12 = var9[var8];
                if (var12 != 2.1474836E9F) {
                    var9[var8] = (float) ((double) var12 + arg4);
                }
                ++var11;
                ++var8;
            }
            ++var10;
            var8 += var7;
        }
    }

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(Lza;)V", line = 1786)
    public final void method449(class437 arg0) {
    }

    @OriginalMember(owner = "client!uga", name = "d", descriptor = "()V", line = 1789)
    public final void method465() {
        if (this.field3007) {
            class182.method1269(false, -11692, true);
            this.field3007 = false;
        }
        this.field3005 = null;
        this.field3003 = null;
        this.field3008 = 0;
        this.field3002 = 0;
        this.field3009 = null;
        this.field3006 = true;
    }

    @OriginalMember(owner = "client!uga", name = "C", descriptor = "(Z)V", line = 1804)
    public final void method474(boolean arg0) {
        class253 var2 = this.method1473(Thread.currentThread());
        var2.field3747 = arg0;
    }

    @OriginalMember(owner = "client!uga", name = "h", descriptor = "(I)V", line = 1808)
    public final void method554(int arg0) {
        this.field3038 = arg0;
        this.field3037 = new class253[this.field3038];
        for (int var2 = 0; var2 < this.field3038; ++var2) {
            this.field3037[var2] = new class253(this);
        }
    }

    @OriginalMember(owner = "client!uga", name = "d", descriptor = "(IIIIII)V", line = 1821)
    public final void method559(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg2 - arg0;
        int var8 = arg3 - arg1;
        if (var8 == 0) {
            if (var7 >= 0) {
                this.method488(arg0, arg1, var7 + 1, arg4, arg5);
            } else {
                this.method488(arg0 + var7, arg1, -var7 + 1, arg4, arg5);
            }
        } else if (var7 == 0) {
            if (var8 >= 0) {
                this.method520(arg0, arg1, var8 + 1, arg4, arg5);
            } else {
                this.method520(arg0, arg1 + var8, -var8 + 1, arg4, arg5);
            }
        } else {
            if (var7 + var8 < 0) {
                arg0 += var7;
                var7 = -var7;
                arg1 += var8;
                var8 = -var8;
            }
            if (var7 > var8) {
                int var9 = arg1 << 16;
                int var10 = var9 + 32768;
                int var11 = var8 << 16;
                int var12 = (int) Math.floor((double) var11 / (double) var7 + 0.5D);
                int var13 = arg0 + var7;
                if (arg0 < this.field3028) {
                    var10 += (this.field3028 - arg0) * var12;
                    arg0 = this.field3028;
                }
                if (var13 >= this.field3016) {
                    var13 = this.field3016 - 1;
                }
                int var14 = arg4 >>> 24;
                if (arg5 != 0 && (arg5 != 1 || var14 != 255)) {
                    if (arg5 == 1) {
                        int var15 = (var14 << 24) + ((arg4 & 16711935) * var14 >> 8 & 16711935) + ((arg4 & 65280) * var14 >> 8 & 65280);
                        int var16 = 256 - var14;
                        while (arg0 <= var13) {
                            int var17 = var10 >> 16;
                            if (var17 >= this.field3045 && var17 < this.field3026) {
                                int var18 = this.field3035 * var17 + arg0;
                                int var19 = this.field3033[var18];
                                int var20 = ((var19 & 16711935) * var16 >> 8 & 16711935) + ((var19 & 65280) * var16 >> 8 & 65280);
                                this.field3033[var18] = var15 + var20;
                            }
                            var10 += var12;
                            ++arg0;
                        }
                    } else if (arg5 == 2) {
                        while (arg0 <= var13) {
                            int var21 = var10 >> 16;
                            if (var21 >= this.field3045 && var21 < this.field3026) {
                                int var22 = this.field3035 * var21 + arg0;
                                int var23 = this.field3033[var22];
                                int var24 = arg4 + var23;
                                int var25 = (arg4 & 16711935) + (var23 & 16711935);
                                int var26 = (var24 - var25 & 65536) + (var25 & 16777472);
                                this.field3033[var22] = var24 - var26 | var26 - (var26 >>> 8);
                            }
                            var10 += var12;
                            ++arg0;
                        }
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    while (arg0 <= var13) {
                        int var27 = var10 >> 16;
                        if (var27 >= this.field3045 && var27 < this.field3026) {
                            this.field3033[this.field3035 * var27 + arg0] = arg4;
                        }
                        var10 += var12;
                        ++arg0;
                    }
                }
            } else {
                int var28 = arg0 << 16;
                int var29 = var28 + 32768;
                int var30 = var7 << 16;
                int var31 = (int) Math.floor((double) var30 / (double) var8 + 0.5D);
                int var32 = arg1 + var8;
                if (arg1 < this.field3045) {
                    var29 += (this.field3045 - arg1) * var31;
                    arg1 = this.field3045;
                }
                if (var32 >= this.field3026) {
                    var32 = this.field3026 - 1;
                }
                int var33 = arg4 >>> 24;
                if (arg5 == 0 || arg5 == 1 && var33 == 255) {
                    while (arg1 <= var32) {
                        int var46 = var29 >> 16;
                        if (var46 >= this.field3028 && var46 < this.field3016) {
                            this.field3033[this.field3035 * arg1 + var46] = arg4;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 1) {
                    int var34 = (var33 << 24) + ((arg4 & 16711935) * var33 >> 8 & 16711935) + ((arg4 & 65280) * var33 >> 8 & 65280);
                    int var35 = 256 - var33;
                    while (arg1 <= var32) {
                        int var36 = var29 >> 16;
                        if (var36 >= this.field3028 && var36 < this.field3016) {
                            int var37 = this.field3035 * arg1 + var36;
                            int var38 = this.field3033[var37];
                            int var39 = ((var38 & 16711935) * var35 >> 8 & 16711935) + ((var38 & 65280) * var35 >> 8 & 65280);
                            this.field3033[this.field3035 * arg1 + var36] = var34 + var39;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 2) {
                    while (arg1 <= var32) {
                        int var40 = var29 >> 16;
                        if (var40 >= this.field3028 && var40 < this.field3016) {
                            int var41 = this.field3035 * arg1 + var40;
                            int var42 = this.field3033[var41];
                            int var43 = arg4 + var42;
                            int var44 = (arg4 & 16711935) + (var42 & 16711935);
                            int var45 = (var43 - var44 & 65536) + (var44 & 16777472);
                            this.field3033[var41] = var43 - var45 | var45 - (var45 >>> 8);
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
        }
    }

    @OriginalMember(owner = "client!uga", name = "b", descriptor = "(IIIIII)Ldn;", line = 2035)
    public final class544 method467(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!uga", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ld;II)V", line = 2038)
    public class221(Canvas arg0, class161 arg1, int arg2, int arg3) {
        this(arg1);
        try {
            this.method480(arg0, arg2, arg3);
            this.method460(arg0);
        } catch (Throwable var6) {
            var6.printStackTrace();
            this.method470((byte) -113);
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!uga", name = "k", descriptor = "()Z", line = 2049)
    public final boolean method485() {
        return false;
    }

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(Lgfa;IIII)Lka;", line = 2053)
    public final class500 method510(class782 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class116(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!uga", name = "KA", descriptor = "(IIII)V", line = 2056)
    public final void method456(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > this.field3035) {
            arg2 = this.field3035;
        }
        if (arg3 > this.field3041) {
            arg3 = this.field3041;
        }
        this.field3028 = arg0;
        this.field3016 = arg2;
        this.field3045 = arg1;
        this.field3026 = arg3;
        this.method1467();
    }

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(Lef;I)V", line = 2076)
    public final void method532(class515 arg0, int arg1) {
        class253 var3 = this.method1473(Thread.currentThread());
        class424 var4 = arg0.field7049.field1011;
        for (class424 var5 = var4.field6051; var4 != var5; var5 = var5.field6051) {
            class468 var6 = (class468) var5;
            int var7 = var6.field6493 >> 12;
            int var8 = var6.field6486 >> 12;
            int var9 = var6.field6488 >> 12;
            float var10 = (float) var9 * this.field3027.field7417 + (float) var7 * this.field3027.field7416 + (float) var8 * this.field3027.field7421 + this.field3027.field7431;
            if (!(var10 < (float) this.field3022) && !(var10 > (float) var3.field3734)) {
                int var11 = (int) (((float) var9 * this.field3027.field7433 + (float) var7 * this.field3027.field7419 + (float) var8 * this.field3027.field7426 + this.field3027.field7427) * (float) this.field3032 / (float) arg1) + this.field3047;
                int var12 = (int) (((float) var9 * this.field3027.field7437 + (float) var7 * this.field3027.field7418 + (float) var8 * this.field3027.field7439 + this.field3027.field7424) * (float) this.field3024 / (float) arg1) + this.field3021;
                if (var11 >= this.field3028 && var11 <= this.field3016 && var12 >= this.field3045 && var12 <= this.field3026) {
                    if (var10 == 0.0F) {
                        var10 = 1.0F;
                    }
                    this.method1463(var6, var11, var12, (int) var10, (this.field3032 * var6.field6487 >> 12) / arg1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!uga", name = "t", descriptor = "()V", line = 2114)
    public final void method529() {
        this.field3039.method1555((byte) -3);
        this.field3015.method1555((byte) -3);
    }

    @OriginalMember(owner = "client!uga", name = "na", descriptor = "(IIII)[I", line = 2119)
    public final int[] method521(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = new int[arg2 * arg3];
        int var6 = 0;
        for (int var7 = 0; var7 < arg3; ++var7) {
            int var8 = (arg1 + var7) * this.field3035 + arg0;
            for (int var9 = 0; var9 < arg2; ++var9) {
                var5[var6++] = this.field3033[var8 + var9];
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(IIIIIF)Luca;", line = 2144)
    public final class540 method530(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return null;
    }

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(Luu;)V", line = 2147)
    public final void method526(class303 arg0) {
        this.field3027 = (class549) arg0;
    }

    @OriginalMember(owner = "client!uga", name = "b", descriptor = "(IIIIIIII)V", line = 2150)
    private final void method1470(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 >= this.field3045 && arg1 < this.field3026) {
            int var9 = this.field3035 * arg1 + arg0;
            int var10 = arg3 >>> 24;
            int var11 = arg5 + arg6;
            int var12 = arg7 % var11;
            if (arg4 != 0 && (arg4 != 1 || var10 != 255)) {
                if (arg4 == 1) {
                    int var13 = (var10 << 24) + ((arg3 & 16711935) * var10 >> 8 & 16711935) + ((arg3 & 65280) * var10 >> 8 & 65280);
                    int var14 = 256 - var10;
                    int var15 = 0;
                    while (var15 < arg2) {
                        if (arg0 + var15 >= this.field3028 && arg0 + var15 < this.field3016 && var12 < arg5) {
                            int var16 = this.field3033[var9 + var15];
                            int var17 = ((var16 & 16711935) * var14 >> 8 & 16711935) + ((var16 & 65280) * var14 >> 8 & 65280);
                            this.field3033[var9 + var15] = var13 + var17;
                        }
                        ++var15;
                        ++var12;
                        var12 %= var11;
                    }
                } else if (arg4 == 2) {
                    int var18 = 0;
                    while (var18 < arg2) {
                        if (arg0 + var18 >= this.field3028 && arg0 + var18 < this.field3016 && var12 < arg5) {
                            int var19 = this.field3033[var9 + var18];
                            int var20 = arg3 + var19;
                            int var21 = (arg3 & 16711935) + (var19 & 16711935);
                            int var22 = (var20 - var21 & 65536) + (var21 & 16777472);
                            this.field3033[var9 + var18] = var20 - var22 | var22 - (var22 >>> 8);
                        }
                        ++var18;
                        ++var12;
                        var12 %= var11;
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            } else {
                int var23 = 0;
                while (var23 < arg2) {
                    if (arg0 + var23 >= this.field3028 && arg0 + var23 < this.field3016 && var12 < arg5) {
                        this.field3033[var9 + var23] = arg3;
                    }
                    ++var23;
                    ++var12;
                    var12 %= var11;
                }
            }
        }
    }

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(IIIIIILaa;IIIII)V", line = 2230)
    public final void method525(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class514 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        class287 var13 = (class287) arg6;
        int[] var14 = var13.field4231;
        int[] var15 = var13.field4229;
        int var16 = this.field3045 > arg8 ? this.field3045 : arg8;
        int var17 = this.field3026 < var14.length + arg8 ? this.field3026 : var14.length + arg8;
        int var18 = arg11 << 8;
        int var19 = arg9 << 8;
        int var20 = arg10 << 8;
        int var21 = var19 + var20;
        int var22 = var18 % var21;
        int var23 = arg2 - arg0;
        int var24 = arg3 - arg1;
        if (var23 + var24 < 0) {
            int var25 = (int) (Math.sqrt((double) (var23 * var23 + var24 * var24)) * 256.0D);
            int var26 = var25 % var21;
            int var27 = var19 + var21 - var22 - var26;
            var22 = var27 % var21;
            if (var22 < 0) {
                var22 += var21;
            }
            arg0 += var23;
            var23 = -var23;
            arg1 += var24;
            var24 = -var24;
        }
        if (var23 > var24) {
            int var28 = arg1 << 16;
            int var29 = var28 + 32768;
            int var30 = var24 << 16;
            int var31 = (int) Math.floor((double) var30 / (double) var23 + 0.5D);
            int var32 = arg0 + var23;
            int var33 = arg4 >>> 24;
            int var34 = (int) Math.sqrt((double) ((var31 >> 8) * (var31 >> 8) + 65536));
            if (arg5 != 0 && (arg5 != 1 || var33 != 255)) {
                if (arg5 == 1) {
                    int var35 = (var33 << 24) + ((arg4 & 16711935) * var33 >> 8 & 16711935) + ((arg4 & 65280) * var33 >> 8 & 65280);
                    int var36 = 256 - var33;
                    while (arg0 <= var32) {
                        int var37 = var29 >> 16;
                        int var38 = var37 - arg8;
                        if (arg0 >= this.field3028 && arg0 < this.field3016 && var37 >= var16 && var37 < var17 && var22 < var19) {
                            int var39 = var14[var38] + arg7;
                            if (arg0 >= var39 && arg0 < var15[var38] + var39) {
                                int var40 = this.field3035 * var37 + arg0;
                                int var41 = this.field3033[var40];
                                int var42 = ((var41 & 16711935) * var36 >> 8 & 16711935) + ((var41 & 65280) * var36 >> 8 & 65280);
                                this.field3033[var40] = var35 + var42;
                            }
                        }
                        var29 += var31;
                        ++arg0;
                        int var43 = var22 + var34;
                        var22 = var43 % var21;
                    }
                } else if (arg5 == 2) {
                    while (arg0 <= var32) {
                        int var44 = var29 >> 16;
                        int var45 = var44 - arg8;
                        if (arg0 >= this.field3028 && arg0 < this.field3016 && var44 >= var16 && var44 < var17 && var22 < var19) {
                            int var46 = var14[var45] + arg7;
                            if (arg0 >= var46 && arg0 < var15[var45] + var46) {
                                int var47 = this.field3035 * var44 + arg0;
                                int var48 = this.field3033[var47];
                                int var49 = arg4 + var48;
                                int var50 = (arg4 & 16711935) + (var48 & 16711935);
                                int var51 = (var49 - var50 & 65536) + (var50 & 16777472);
                                this.field3033[var47] = var49 - var51 | var51 - (var51 >>> 8);
                            }
                        }
                        var29 += var31;
                        ++arg0;
                        int var52 = var22 + var34;
                        var22 = var52 % var21;
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            } else {
                while (arg0 <= var32) {
                    int var53 = var29 >> 16;
                    int var54 = var53 - arg8;
                    if (arg0 >= this.field3028 && arg0 < this.field3016 && var53 >= var16 && var53 < var17 && var22 < var19) {
                        int var55 = var14[var54] + arg7;
                        if (arg0 >= var55 && arg0 < var15[var54] + var55) {
                            this.field3033[this.field3035 * var53 + arg0] = arg4;
                        }
                    }
                    var29 += var31;
                    ++arg0;
                    int var56 = var22 + var34;
                    var22 = var56 % var21;
                }
            }
        } else {
            int var57 = arg0 << 16;
            int var58 = var57 + 32768;
            int var59 = var23 << 16;
            int var60 = (int) Math.floor((double) var59 / (double) var24 + 0.5D);
            int var61 = (int) Math.sqrt((double) ((var60 >> 8) * (var60 >> 8) + 65536));
            int var62 = arg1 + var24;
            int var63 = arg4 >>> 24;
            if (arg5 == 0 || arg5 == 1 && var63 == 255) {
                while (arg1 <= var62) {
                    int var80 = var58 >> 16;
                    int var81 = arg1 - arg8;
                    if (arg1 >= var16 && arg1 < var17 && var80 >= this.field3028 && var80 < this.field3016 && var22 < var19 && var80 >= var14[var81] + arg7 && var80 < var14[var81] + arg7 + var15[var81]) {
                        this.field3033[this.field3035 * arg1 + var80] = arg4;
                    }
                    var58 += var60;
                    ++arg1;
                    int var82 = var22 + var61;
                    var22 = var82 % var21;
                }
            } else if (arg5 == 1) {
                int var64 = (var63 << 24) + ((arg4 & 16711935) * var63 >> 8 & 16711935) + ((arg4 & 65280) * var63 >> 8 & 65280);
                int var65 = 256 - var63;
                while (arg1 <= var62) {
                    int var66 = var58 >> 16;
                    int var67 = arg1 - arg8;
                    if (arg1 >= var16 && arg1 < var17 && var66 >= this.field3028 && var66 < this.field3016 && var22 < var19 && var66 >= var14[var67] + arg7 && var66 < var14[var67] + arg7 + var15[var67]) {
                        int var68 = this.field3035 * arg1 + var66;
                        int var69 = this.field3033[var68];
                        int var70 = ((var69 & 16711935) * var65 >> 8 & 16711935) + ((var69 & 65280) * var65 >> 8 & 65280);
                        this.field3033[this.field3035 * arg1 + var66] = var64 + var70;
                    }
                    var58 += var60;
                    ++arg1;
                    int var71 = var22 + var61;
                    var22 = var71 % var21;
                }
            } else if (arg5 == 2) {
                while (arg1 <= var62) {
                    int var72 = var58 >> 16;
                    int var73 = arg1 - arg8;
                    if (arg1 >= var16 && arg1 < var17 && var72 >= this.field3028 && var72 < this.field3016 && var22 < var19 && var72 >= var14[var73] + arg7 && var72 < var14[var73] + arg7 + var15[var73]) {
                        int var74 = this.field3035 * arg1 + var72;
                        int var75 = this.field3033[var74];
                        int var76 = arg4 + var75;
                        int var77 = (arg4 & 16711935) + (var75 & 16711935);
                        int var78 = (var76 - var77 & 65536) + (var77 & 16777472);
                        this.field3033[var74] = var76 - var78 | var78 - (var78 >>> 8);
                    }
                    var58 += var60;
                    ++arg1;
                    int var79 = var22 + var61;
                    var22 = var79 % var21;
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 2475)
    public final void method460(Canvas arg0) {
        if (arg0 != null) {
            class527 var2 = (class527) this.field3009.method3953((long) arg0.hashCode(), 14);
            if (var2 != null) {
                this.field3003 = arg0;
                Dimension var3 = arg0.getSize();
                this.field3008 = var3.width;
                this.field3002 = var3.height;
                this.field3005 = var2;
                if (this.field3048 == null) {
                    this.field3033 = var2.field7221;
                    this.field3035 = var2.field7222;
                    this.field3041 = var2.field7220;
                    if (this.field3035 != this.field3019 || this.field3041 != this.field3029) {
                        this.field3036 = this.field3019 = this.field3035;
                        this.field3010 = this.field3029 = this.field3041;
                        this.field3023 = this.field3046 = new float[this.field3029 * this.field3019];
                    }
                    this.method1460();
                    return;
                }
            }
        } else {
            this.field3003 = null;
            this.field3005 = null;
            if (this.field3048 == null) {
                this.field3033 = null;
                this.field3035 = this.field3041 = 1;
                this.field3019 = this.field3029 = 1;
                this.method1460();
            }
        }
    }

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(Z)V", line = 2521)
    public final void method531(boolean arg0) {
        this.field3018 = arg0;
        this.field3039.method1555((byte) -3);
    }

    @OriginalMember(owner = "client!uga", name = "n", descriptor = "()Z", line = 2525)
    public final boolean method501() {
        return true;
    }

    @OriginalMember(owner = "client!uga", name = "za", descriptor = "(IIIII)V", line = 2528)
    public final void method515(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var6 = arg1 - arg2;
        if (var6 < this.field3045) {
            var6 = this.field3045;
        }
        int var7 = arg1 + arg2 + 1;
        if (var7 > this.field3026) {
            var7 = this.field3026;
        }
        int var8 = var6;
        int var9 = arg2 * arg2;
        int var10 = 0;
        int var11 = arg1 - var6;
        int var12 = var11 * var11;
        int var13 = var12 - var11;
        if (arg1 > var7) {
            arg1 = var7;
        }
        int var14 = arg3 >>> 24;
        if (arg4 == 0 || arg4 == 1 && var14 == 255) {
            while (var8 < arg1) {
                while (var13 <= var9 || var12 <= var9) {
                    var12 += var10 + var10;
                    var13 += var10++ + var10;
                }
                int var64 = arg0 - var10 + 1;
                if (var64 < this.field3028) {
                    var64 = this.field3028;
                }
                int var65 = arg0 + var10;
                if (var65 > this.field3016) {
                    var65 = this.field3016;
                }
                int var66 = this.field3035 * var8 + var64;
                for (int var67 = var64; var67 < var65; ++var67) {
                    this.field3033[var66++] = arg3;
                }
                ++var8;
                var12 -= var11-- + var11;
                var13 -= var11 + var11;
            }
            int var55 = arg2;
            int var56 = var8 - arg1;
            int var57 = var56 * var56 + var9;
            int var58 = var57 - arg2;
            int var59 = var57 - var56;
            while (var8 < var7) {
                while (var59 > var9 && var58 > var9) {
                    var59 -= var55-- + var55;
                    var58 -= var55 + var55;
                }
                int var60 = arg0 - var55;
                if (var60 < this.field3028) {
                    var60 = this.field3028;
                }
                int var61 = arg0 + var55;
                if (var61 > this.field3016 - 1) {
                    var61 = this.field3016 - 1;
                }
                int var62 = this.field3035 * var8 + var60;
                for (int var63 = var60; var63 <= var61; ++var63) {
                    this.field3033[var62++] = arg3;
                }
                ++var8;
                var59 += var56 + var56;
                var58 += var56++ + var56;
            }
        } else if (arg4 == 1) {
            int var15 = (var14 << 24) + ((arg3 & 16711935) * var14 >> 8 & 16711935) + ((arg3 & 65280) * var14 >> 8 & 65280);
            int var16 = 256 - var14;
            while (var8 < arg1) {
                while (var13 <= var9 || var12 <= var9) {
                    var12 += var10 + var10;
                    var13 += var10++ + var10;
                }
                int var28 = arg0 - var10 + 1;
                if (var28 < this.field3028) {
                    var28 = this.field3028;
                }
                int var29 = arg0 + var10;
                if (var29 > this.field3016) {
                    var29 = this.field3016;
                }
                int var30 = this.field3035 * var8 + var28;
                for (int var31 = var28; var31 < var29; ++var31) {
                    int var32 = this.field3033[var30];
                    int var33 = ((var32 & 16711935) * var16 >> 8 & 16711935) + ((var32 & 65280) * var16 >> 8 & 65280);
                    this.field3033[var30++] = var15 + var33;
                }
                ++var8;
                var12 -= var11-- + var11;
                var13 -= var11 + var11;
            }
            int var17 = arg2;
            int var18 = -var11;
            int var19 = var18 * var18 + var9;
            int var20 = var19 - arg2;
            int var21 = var19 - var18;
            while (var8 < var7) {
                while (var21 > var9 && var20 > var9) {
                    var21 -= var17-- + var17;
                    var20 -= var17 + var17;
                }
                int var22 = arg0 - var17;
                if (var22 < this.field3028) {
                    var22 = this.field3028;
                }
                int var23 = arg0 + var17;
                if (var23 > this.field3016 - 1) {
                    var23 = this.field3016 - 1;
                }
                int var24 = this.field3035 * var8 + var22;
                for (int var25 = var22; var25 <= var23; ++var25) {
                    int var26 = this.field3033[var24];
                    int var27 = ((var26 & 16711935) * var16 >> 8 & 16711935) + ((var26 & 65280) * var16 >> 8 & 65280);
                    this.field3033[var24++] = var15 + var27;
                }
                ++var8;
                var21 += var18 + var18;
                var20 += var18++ + var18;
            }
        } else if (arg4 != 2) {
            throw new IllegalArgumentException();
        } else {
            while (var8 < arg1) {
                while (var13 <= var9 || var12 <= var9) {
                    var12 += var10 + var10;
                    var13 += var10++ + var10;
                }
                int var47 = arg0 - var10 + 1;
                if (var47 < this.field3028) {
                    var47 = this.field3028;
                }
                int var48 = arg0 + var10;
                if (var48 > this.field3016) {
                    var48 = this.field3016;
                }
                int var49 = this.field3035 * var8 + var47;
                for (int var50 = var47; var50 < var48; ++var50) {
                    int var51 = this.field3033[var49];
                    int var52 = arg3 + var51;
                    int var53 = (arg3 & 16711935) + (var51 & 16711935);
                    int var54 = (var52 - var53 & 65536) + (var53 & 16777472);
                    this.field3033[var49++] = var52 - var54 | var54 - (var54 >>> 8);
                }
                ++var8;
                var12 -= var11-- + var11;
                var13 -= var11 + var11;
            }
            int var34 = arg2;
            int var35 = -var11;
            int var36 = var35 * var35 + var9;
            int var37 = var36 - arg2;
            int var38 = var36 - var35;
            while (var8 < var7) {
                while (var38 > var9 && var37 > var9) {
                    var38 -= var34-- + var34;
                    var37 -= var34 + var34;
                }
                int var39 = arg0 - var34;
                if (var39 < this.field3028) {
                    var39 = this.field3028;
                }
                int var40 = arg0 + var34;
                if (var40 > this.field3016 - 1) {
                    var40 = this.field3016 - 1;
                }
                int var41 = this.field3035 * var8 + var39;
                for (int var42 = var39; var42 <= var40; ++var42) {
                    int var43 = this.field3033[var41];
                    int var44 = arg3 + var43;
                    int var45 = (arg3 & 16711935) + (var43 & 16711935);
                    int var46 = (var44 - var45 & 65536) + (var45 & 16777472);
                    this.field3033[var41++] = var44 - var46 | var46 - (var46 >>> 8);
                }
                ++var8;
                var38 += var35 + var35;
                var37 += var35++ + var35;
            }
        }
    }

    @OriginalMember(owner = "client!uga", name = "l", descriptor = "(I)I", line = 2815)
    public final int method1471(int arg0) {
        return super.field912.method1174(arg0, true).field9135;
    }

    @OriginalMember(owner = "client!uga", name = "P", descriptor = "(IIIII)V", line = 2818)
    public final void method520(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 >= this.field3028 && arg0 < this.field3016) {
            if (arg1 < this.field3045) {
                arg2 -= this.field3045 - arg1;
                arg1 = this.field3045;
            }
            if (arg1 + arg2 > this.field3026) {
                arg2 = this.field3026 - arg1;
            }
            int var6 = this.field3035 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field3035 * var10 + var6;
                        int var12 = this.field3033[var11];
                        int var13 = ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & 65280) * var9 >> 8 & 65280);
                        this.field3033[var11] = var8 + var13;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var14 = 0; var14 < arg2; ++var14) {
                        int var15 = this.field3035 * var14 + var6;
                        int var16 = this.field3033[var15];
                        int var17 = arg3 + var16;
                        int var18 = (arg3 & 16711935) + (var16 & 16711935);
                        int var19 = (var17 - var18 & 65536) + (var18 & 16777472);
                        this.field3033[var15] = var17 - var19 | var19 - (var19 >>> 8);
                    }
                }
            } else {
                for (int var20 = 0; var20 < arg2; ++var20) {
                    this.field3033[this.field3035 * var20 + var6] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!uga", name = "A", descriptor = "()V", line = 2893)
    public final void method568() {
    }

    @OriginalMember(owner = "client!uga", name = "M", descriptor = "()I", line = 2897)
    public final int method453() {
        int var1 = this.field3042;
        this.field3042 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!uga", name = "U", descriptor = "(IIIII)V", line = 2902)
    public final void method488(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 >= this.field3045 && arg1 < this.field3026) {
            if (arg0 < this.field3028) {
                arg2 -= this.field3028 - arg0;
                arg0 = this.field3028;
            }
            if (arg0 + arg2 > this.field3016) {
                arg2 = this.field3016 - arg0;
            }
            int var6 = this.field3035 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field3033[var6 + var10];
                        int var12 = ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & 65280) * var9 >> 8 & 65280);
                        this.field3033[var6 + var10] = var8 + var12;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var13 = 0; var13 < arg2; ++var13) {
                        int var14 = this.field3033[var6 + var13];
                        int var15 = arg3 + var14;
                        int var16 = (arg3 & 16711935) + (var14 & 16711935);
                        int var17 = (var15 - var16 & 65536) + (var16 & 16777472);
                        this.field3033[var6 + var13] = var15 - var17 | var17 - (var17 >>> 8);
                    }
                }
            } else {
                for (int var18 = 0; var18 < arg2; ++var18) {
                    this.field3033[var6 + var18] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!uga", name = "e", descriptor = "()V", line = 2973)
    public final void method468() {
    }

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(IIIIIIIII)V", line = 2976)
    public final void method507(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var10 = arg2 - arg0;
        int var11 = arg3 - arg1;
        if (var11 == 0) {
            if (var10 >= 0) {
                this.method1470(arg0, arg1, var10 + 1, arg4, arg5, arg6, arg7, arg8);
            } else {
                int var12 = arg6 + arg7;
                int var13 = arg8 % var12;
                int var14 = arg6 + var12 - var13 - (-var10 + 1) % var12;
                int var15 = var14 % var12;
                if (var15 < 0) {
                    var15 += var12;
                }
                this.method1470(arg0 + var10, arg1, -var10 + 1, arg4, arg5, arg6, arg7, var15);
            }
        } else if (var10 == 0) {
            if (var11 >= 0) {
                this.method1466(arg0, arg1, var11 + 1, arg4, arg5, arg6, arg7, arg8);
            } else {
                int var16 = arg6 + arg7;
                int var17 = arg8 % var16;
                int var18 = arg6 + var16 - var17 - (-var11 + 1) % var16;
                int var19 = var18 % var16;
                if (var19 < 0) {
                    var19 += var16;
                }
                this.method1466(arg0, arg1 + var11, -var11 + 1, arg4, arg5, arg6, arg7, var19);
            }
        } else {
            int var20 = arg8 << 8;
            int var21 = arg6 << 8;
            int var22 = arg7 << 8;
            int var23 = var21 + var22;
            int var24 = var20 % var23;
            if (var10 + var11 < 0) {
                int var25 = (int) (Math.sqrt((double) (var10 * var10 + var11 * var11)) * 256.0D);
                int var26 = var25 % var23;
                int var27 = var21 + var23 - var24 - var26;
                var24 = var27 % var23;
                if (var24 < 0) {
                    var24 += var23;
                }
                arg0 += var10;
                var10 = -var10;
                arg1 += var11;
                var11 = -var11;
            }
            if (var10 > var11) {
                int var28 = arg1 << 16;
                int var29 = var28 + 32768;
                int var30 = var11 << 16;
                int var31 = (int) Math.floor((double) var30 / (double) var10 + 0.5D);
                int var32 = arg0 + var10;
                int var33 = arg4 >>> 24;
                int var34 = (int) Math.sqrt((double) ((var31 >> 8) * (var31 >> 8) + 65536));
                if (arg5 != 0 && (arg5 != 1 || var33 != 255)) {
                    if (arg5 == 1) {
                        int var35 = (var33 << 24) + ((arg4 & 16711935) * var33 >> 8 & 16711935) + ((arg4 & 65280) * var33 >> 8 & 65280);
                        int var36 = 256 - var33;
                        while (arg0 <= var32) {
                            int var37 = var29 >> 16;
                            if (arg0 >= this.field3028 && arg0 < this.field3016 && var37 >= this.field3045 && var37 < this.field3026 && var24 < var21) {
                                int var38 = this.field3035 * var37 + arg0;
                                int var39 = this.field3033[var38];
                                int var40 = ((var39 & 16711935) * var36 >> 8 & 16711935) + ((var39 & 65280) * var36 >> 8 & 65280);
                                this.field3033[var38] = var35 + var40;
                            }
                            var29 += var31;
                            ++arg0;
                            int var41 = var24 + var34;
                            var24 = var41 % var23;
                        }
                    } else if (arg5 == 2) {
                        while (arg0 <= var32) {
                            int var42 = var29 >> 16;
                            if (arg0 >= this.field3028 && arg0 < this.field3016 && var42 >= this.field3045 && var42 < this.field3026 && var24 < var21) {
                                int var43 = this.field3035 * var42 + arg0;
                                int var44 = this.field3033[var43];
                                int var45 = arg4 + var44;
                                int var46 = (arg4 & 16711935) + (var44 & 16711935);
                                int var47 = (var45 - var46 & 65536) + (var46 & 16777472);
                                this.field3033[var43] = var45 - var47 | var47 - (var47 >>> 8);
                            }
                            var29 += var31;
                            ++arg0;
                            int var48 = var24 + var34;
                            var24 = var48 % var23;
                        }
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    while (arg0 <= var32) {
                        int var49 = var29 >> 16;
                        if (arg0 >= this.field3028 && arg0 < this.field3016 && var49 >= this.field3045 && var49 < this.field3026 && var24 < var21) {
                            this.field3033[this.field3035 * var49 + arg0] = arg4;
                        }
                        var29 += var31;
                        ++arg0;
                        int var50 = var24 + var34;
                        var24 = var50 % var23;
                    }
                }
            } else {
                int var51 = arg0 << 16;
                int var52 = var51 + 32768;
                int var53 = var10 << 16;
                int var54 = (int) Math.floor((double) var53 / (double) var11 + 0.5D);
                int var55 = arg1 + var11;
                int var56 = arg4 >>> 24;
                int var57 = (int) Math.sqrt((double) ((var54 >> 8) * (var54 >> 8) + 65536));
                if (arg5 != 0 && (arg5 != 1 || var56 != 255)) {
                    if (arg5 == 1) {
                        int var58 = (var56 << 24) + ((arg4 & 16711935) * var56 >> 8 & 16711935) + ((arg4 & 65280) * var56 >> 8 & 65280);
                        int var59 = 256 - var56;
                        while (arg1 <= var55) {
                            int var60 = var52 >> 16;
                            if (arg1 >= this.field3045 && arg1 < this.field3026 && var60 >= this.field3028 && var60 < this.field3016 && var24 < var21) {
                                int var61 = this.field3035 * arg1 + var60;
                                int var62 = this.field3033[var61];
                                int var63 = ((var62 & 16711935) * var59 >> 8 & 16711935) + ((var62 & 65280) * var59 >> 8 & 65280);
                                this.field3033[this.field3035 * arg1 + var60] = var58 + var63;
                            }
                            var52 += var54;
                            ++arg1;
                            int var64 = var24 + var57;
                            var24 = var64 % var23;
                        }
                    } else if (arg5 == 2) {
                        while (arg1 <= var55) {
                            int var65 = var52 >> 16;
                            if (arg1 >= this.field3045 && arg1 < this.field3026 && var65 >= this.field3028 && var65 < this.field3016 && var24 < var21) {
                                int var66 = this.field3035 * arg1 + var65;
                                int var67 = this.field3033[var66];
                                int var68 = arg4 + var67;
                                int var69 = (arg4 & 16711935) + (var67 & 16711935);
                                int var70 = (var68 - var69 & 65536) + (var69 & 16777472);
                                this.field3033[var66] = var68 - var70 | var70 - (var70 >>> 8);
                            }
                            var52 += var54;
                            ++arg1;
                            int var71 = var24 + var57;
                            var24 = var71 % var23;
                        }
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    while (arg1 <= var55) {
                        int var72 = var52 >> 16;
                        if (arg1 >= this.field3045 && arg1 < this.field3026 && var72 >= this.field3028 && var72 < this.field3016 && var24 < var21) {
                            this.field3033[this.field3035 * arg1 + var72] = arg4;
                        }
                        var52 += var54;
                        ++arg1;
                        int var73 = var24 + var57;
                        var24 = var73 % var23;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!uga", name = "s", descriptor = "()Z", line = 3222)
    public final boolean method522() {
        return true;
    }

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(I[Luca;)V", line = 3224)
    public final void method486(int arg0, class540[] arg1) {
    }

    @OriginalMember(owner = "client!uga", name = "f", descriptor = "(I)V", line = 3227)
    public final void method506(int arg0) {
        this.field3034 = arg0;
        this.field3039.method1555((byte) -3);
    }

    @OriginalMember(owner = "client!uga", name = "z", descriptor = "()Luu;", line = 3231)
    public final class303 method565() {
        return this.field3027;
    }

    @OriginalMember(owner = "client!uga", name = "r", descriptor = "()Z", line = 3234)
    public final boolean method519() {
        return true;
    }

    @OriginalMember(owner = "client!uga", name = "c", descriptor = "(IIIIII)V", line = 3237)
    public final void method538(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method488(arg0, arg1, arg2, arg4, arg5);
        this.method488(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method520(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
        this.method520(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
    }

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V", line = 3244)
    public final void method487(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class566 {
        if (this.field3003 != null && this.field3005 != null) {
            try {
                Graphics var5 = this.field3003.getGraphics();
                for (int var6 = 0; var6 < arg1; ++var6) {
                    Rectangle var7 = arg0[var6];
                    if (var7.x + arg2 <= this.field3035 && var7.y + arg3 <= this.field3041 && var7.x + arg2 + var7.width > 0 && var7.y + arg3 + var7.height > 0) {
                        this.field3005.method709(var7.width, var7.y + arg3, var7.y, var7.height, var7.x + arg2, var5, var7.x, -25644);
                    }
                }
            } catch (Exception var8) {
                this.field3003.repaint();
            }
        } else {
            throw new IllegalStateException("off");
        }
    }

    @OriginalMember(owner = "client!uga", name = "b", descriptor = "()I", line = 3273)
    public final int method451() {
        return 0;
    }

    @OriginalMember(owner = "client!uga", name = "c", descriptor = "(I)Lza;", line = 3276)
    public final class437 method482(int arg0) {
        return null;
    }

    @OriginalMember(owner = "client!uga", name = "m", descriptor = "(I)Z", line = 3279)
    public final boolean method1472(int arg0) {
        return this.field3018 || super.field912.method1174(arg0, true).field9143;
    }

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(IIZ)Lvr;", line = 3285)
    public final class147 method508(int arg0, int arg1, boolean arg2) {
        return arg2 ? new class236(this, arg0, arg1) : new class690(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!uga", name = "p", descriptor = "()V", line = 3291)
    public final void method511() {
        if (this.field3003 != null) {
            this.field3033 = this.field3005.field7221;
            this.field3035 = this.field3005.field7222;
            this.field3041 = this.field3005.field7220;
            this.field3046 = this.field3023;
            this.field3019 = this.field3036;
            this.field3029 = this.field3010;
        } else {
            this.field3035 = 1;
            this.field3041 = 1;
            this.field3033 = null;
            this.field3019 = 1;
            this.field3029 = 1;
            this.field3046 = null;
        }
        this.field3048 = null;
        this.method1460();
    }

    @OriginalMember(owner = "client!uga", name = "L", descriptor = "(III)V", line = 3316)
    public final void method550(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field3037.length; ++var4) {
            class253 var5 = this.field3037[var4];
            var5.field3740 = arg0 & 16777215;
            int var6 = var5.field3740 >>> 16 & 255;
            if (var6 < 2) {
                var6 = 2;
            }
            int var7 = var5.field3740 >> 8 & 255;
            if (var7 < 2) {
                var7 = 2;
            }
            int var8 = var5.field3740 & 255;
            if (var8 < 2) {
                var8 = 2;
            }
            var5.field3740 = var6 << 16 | var7 << 8 | var8;
            if (arg1 < 0) {
                var5.field3741 = false;
            } else {
                var5.field3741 = true;
            }
        }
    }

    @OriginalMember(owner = "client!uga", name = "b", descriptor = "(Ljava/awt/Canvas;II)V", line = 3349)
    public final void method480(Canvas arg0, int arg1, int arg2) {
        class527 var4 = (class527) this.field3009.method3953((long) arg0.hashCode(), 14);
        if (var4 == null) {
            class527 var5 = class138.method1068(arg1, arg0, -128, arg2);
            this.field3009.method3962((long) arg0.hashCode(), var5, -120);
        } else {
            if (var4.field7222 != arg1 || var4.field7220 != arg2) {
                this.method448(arg0, arg1, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(IIIIIILaa;II)V", line = 3363)
    public final void method475(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class514 arg6, int arg7, int arg8) {
        class287 var10 = (class287) arg6;
        int[] var11 = var10.field4231;
        int[] var12 = var10.field4229;
        int var13 = this.field3045 > arg8 ? this.field3045 : arg8;
        int var14 = this.field3026 < var11.length + arg8 ? this.field3026 : var11.length + arg8;
        int var15 = arg2 - arg0;
        int var16 = arg3 - arg1;
        if (var15 + var16 < 0) {
            arg0 += var15;
            var15 = -var15;
            arg1 += var16;
            var16 = -var16;
        }
        if (var15 > var16) {
            int var17 = arg1 << 16;
            int var18 = var17 + 32768;
            int var19 = var16 << 16;
            int var20 = (int) Math.floor((double) var19 / (double) var15 + 0.5D);
            int var21 = arg0 + var15;
            if (arg0 < this.field3028) {
                var18 += (this.field3028 - arg0) * var20;
                arg0 = this.field3028;
            }
            if (var21 >= this.field3016) {
                var21 = this.field3016 - 1;
            }
            int var22 = arg4 >>> 24;
            if (arg5 != 0 && (arg5 != 1 || var22 != 255)) {
                if (arg5 == 1) {
                    int var23 = (var22 << 24) + ((arg4 & 16711935) * var22 >> 8 & 16711935) + ((arg4 & 65280) * var22 >> 8 & 65280);
                    int var24 = 256 - var22;
                    while (arg0 <= var21) {
                        int var25 = var18 >> 16;
                        int var26 = var25 - arg8;
                        if (var25 >= var13 && var25 < var14) {
                            int var27 = var11[var26] + arg7;
                            if (arg0 >= var27 && arg0 < var12[var26] + var27) {
                                int var28 = this.field3035 * var25 + arg0;
                                int var29 = this.field3033[var28];
                                int var30 = ((var29 & 16711935) * var24 >> 8 & 16711935) + ((var29 & 65280) * var24 >> 8 & 65280);
                                this.field3033[var28] = var23 + var30;
                            }
                        }
                        var18 += var20;
                        ++arg0;
                    }
                } else if (arg5 == 2) {
                    while (arg0 <= var21) {
                        int var31 = var18 >> 16;
                        int var32 = var31 - arg8;
                        if (var31 >= var13 && var31 < var14) {
                            int var33 = var11[var32] + arg7;
                            if (arg0 >= var33 && arg0 < var12[var32] + var33) {
                                int var34 = this.field3035 * var31 + arg0;
                                int var35 = this.field3033[var34];
                                int var36 = arg4 + var35;
                                int var37 = (arg4 & 16711935) + (var35 & 16711935);
                                int var38 = (var36 - var37 & 65536) + (var37 & 16777472);
                                this.field3033[var34] = var36 - var38 | var38 - (var38 >>> 8);
                            }
                        }
                        var18 += var20;
                        ++arg0;
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            } else {
                while (arg0 <= var21) {
                    int var39 = var18 >> 16;
                    int var40 = var39 - arg8;
                    if (var39 >= var13 && var39 < var14) {
                        int var41 = var11[var40] + arg7;
                        if (arg0 >= var41 && arg0 < var12[var40] + var41) {
                            this.field3033[this.field3035 * var39 + arg0] = arg4;
                        }
                    }
                    var18 += var20;
                    ++arg0;
                }
            }
        } else {
            int var42 = arg0 << 16;
            int var43 = var42 + 32768;
            int var44 = var15 << 16;
            int var45 = (int) Math.floor((double) var44 / (double) var16 + 0.5D);
            int var46 = arg1 + var16;
            if (arg1 < var13) {
                var43 += (var13 - arg1) * var45;
                arg1 = var13;
            }
            if (var46 >= var14) {
                var46 = var14 - 1;
            }
            int var47 = arg4 >>> 24;
            if (arg5 == 0 || arg5 == 1 && var47 == 255) {
                while (arg1 <= var46) {
                    int var64 = var43 >> 16;
                    int var65 = arg1 - arg8;
                    int var66 = var11[var65] + arg7;
                    if (var64 >= this.field3028 && var64 < this.field3016 && var64 >= var66 && var64 < var12[var65] + var66) {
                        this.field3033[this.field3035 * arg1 + var64] = arg4;
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else if (arg5 == 1) {
                int var48 = (var47 << 24) + ((arg4 & 16711935) * var47 >> 8 & 16711935) + ((arg4 & 65280) * var47 >> 8 & 65280);
                int var49 = 256 - var47;
                while (arg1 <= var46) {
                    int var50 = var43 >> 16;
                    int var51 = arg1 - arg8;
                    int var52 = var11[var51] + arg7;
                    if (var50 >= this.field3028 && var50 < this.field3016 && var50 >= var52 && var50 < var12[var51] + var52) {
                        int var53 = this.field3035 * arg1 + var50;
                        int var54 = this.field3033[var53];
                        int var55 = ((var54 & 16711935) * var49 >> 8 & 16711935) + ((var54 & 65280) * var49 >> 8 & 65280);
                        this.field3033[this.field3035 * arg1 + var50] = var48 + var55;
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else if (arg5 == 2) {
                while (arg1 <= var46) {
                    int var56 = var43 >> 16;
                    int var57 = arg1 - arg8;
                    int var58 = var11[var57] + arg7;
                    if (var56 >= this.field3028 && var56 < this.field3016 && var56 >= var58 && var56 < var12[var57] + var58) {
                        int var59 = this.field3035 * arg1 + var56;
                        int var60 = this.field3033[var59];
                        int var61 = arg4 + var60;
                        int var62 = (arg4 & 16711935) + (var60 & 16711935);
                        int var63 = (var61 - var62 & 65536) + (var62 & 16777472);
                        this.field3033[var59] = var61 - var63 | var63 - (var63 >>> 8);
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(Ljava/lang/Runnable;)Lrga;", line = 3603)
    public final class253 method1473(Runnable arg0) {
        for (int var2 = 0; var2 < this.field3038; ++var2) {
            if (this.field3037[var2].field3743 == arg0) {
                return this.field3037[var2];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!uga", name = "n", descriptor = "(I)Z", line = 3617)
    public final boolean method1474(int arg0) {
        return super.field912.method1173(true, arg0);
    }

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "()Luu;", line = 3621)
    public final class303 method450() {
        class253 var1 = this.method1473(Thread.currentThread());
        return var1.field3746;
    }

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "([IIIIIZ)Lvr;", line = 3626)
    public final class147 method544(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        boolean var7 = false;
        int var8 = arg1;
        for (int var9 = 0; var9 < arg4; ++var9) {
            for (int var10 = 0; var10 < arg3; ++var10) {
                int var11 = arg0[var8++] >>> 24;
                if (var11 != 0 && var11 != 255) {
                    var7 = true;
                    return var7 ? new class236(this, arg0, arg1, arg2, arg3, arg4, arg5) : new class690(this, arg0, arg1, arg2, arg3, arg4, arg5);
                }
            }
        }
        return var7 ? new class236(this, arg0, arg1, arg2, arg3, arg4, arg5) : new class690(this, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!uga", name = "X", descriptor = "(I)V", line = 3662)
    public final void method481(int arg0) {
    }

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(FFF)V", line = 3664)
    public final void method512(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(Lbfa;Ltq;)Lvv;", line = 3674)
    public final class345 method566(class390 arg0, class656 arg1) {
        return new class590(this, (class147) arg0, (class355) arg1);
    }

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(IIIIIIIIII)V", line = 3677)
    public final void method1475(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg3 != 0 && arg4 != 0) {
            if (arg6 != 65535 && !super.field912.method1174(arg6, true).field9142) {
                if (this.field3050 != arg6) {
                    class147 var11 = (class147) this.field3015.method1541(-10, (long) arg6);
                    if (var11 == null) {
                        int[] var12 = this.method1469(arg6);
                        if (var12 == null) {
                            return;
                        }
                        int var13 = this.method1472(arg6) ? 64 : this.field3034;
                        var11 = this.method499(var13, var12, true, 0, var13, var13);
                        this.field3015.method1544(true, var11, (long) arg6);
                    }
                    this.field3050 = arg6;
                    this.field3049 = var11;
                }
                ((class215) this.field3049).method1085(arg0 - arg3, arg1 - arg4, arg2, arg3 << 1, arg4 << 1, arg8, arg7, arg9, 1);
            } else {
                this.method1462(arg0, arg1, arg2, arg3, arg7, arg9);
            }
        }
    }

    @OriginalMember(owner = "client!uga", name = "K", descriptor = "([I)V", line = 3710)
    public final void method494(int[] arg0) {
        arg0[0] = this.field3028;
        arg0[1] = this.field3045;
        arg0[2] = this.field3016;
        arg0[3] = this.field3026;
    }

    @OriginalMember(owner = "client!uga", name = "h", descriptor = "()Z", line = 3716)
    public final boolean method478() {
        return false;
    }

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(IIIIIII)V", line = 3740)
    public final void method564(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class253 var8 = this.method1473(Thread.currentThread());
        class681 var9 = var8.field3780;
        int var10 = arg2 - arg0;
        int var11 = arg3 - arg1;
        int var12 = var10 >= 0 ? var10 : -var10;
        int var13 = var11 >= 0 ? var11 : -var11;
        int var14 = var12;
        if (var12 < var13) {
            var14 = var13;
        }
        if (var14 != 0) {
            int var15 = (var10 << 16) / var14;
            int var16 = (var11 << 16) / var14;
            int var17 = (var15 >> 16) + var10;
            int var18 = (var16 >> 16) + var11;
            if (var16 <= var15) {
                var15 = -var15;
            } else {
                var16 = -var16;
            }
            int var19 = arg5 * var16 >> 17;
            int var20 = arg5 * var16 + 1 >> 17;
            int var21 = arg5 * var15 >> 17;
            int var22 = arg5 * var15 + 1 >> 17;
            int var23 = arg0 - var9.method3768();
            int var24 = arg1 - var9.method3769();
            int var25 = var19 + var23;
            int var26 = var23 - var20;
            int var27 = var17 + var23 - var20;
            int var28 = var17 + var23 + var19;
            int var29 = var21 + var24;
            int var30 = var24 - var22;
            int var31 = var18 + var24 - var22;
            int var32 = var18 + var24 + var21;
            if (arg6 == 0) {
                var9.field9546 = 0;
            } else {
                if (arg6 != 1) {
                    throw new IllegalArgumentException();
                }
                var9.field9546 = 255 - (arg4 >>> 24);
            }
            this.method474(false);
            var9.field9561 = var25 < 0 || var25 > var9.field9550 || var26 < 0 || var26 > var9.field9550 || var27 < 0 || var27 > var9.field9550;
            var9.method3771((float) var29, (float) var30, (float) var31, (float) var25, (float) var26, (float) var27, 100.0F, 100.0F, 100.0F, arg4);
            var9.field9561 = var25 < 0 || var25 > var9.field9550 || var27 < 0 || var27 > var9.field9550 || var28 < 0 || var28 > var9.field9550;
            var9.method3771((float) var29, (float) var31, (float) var32, (float) var25, (float) var27, (float) var28, 100.0F, 100.0F, 100.0F, arg4);
            this.method474(true);
        }
    }
}
