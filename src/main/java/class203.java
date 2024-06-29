import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class203 extends class543 {

    @OriginalMember(owner = "client!sa", name = "u", descriptor = "Z")
    private boolean field3011;

    @OriginalMember(owner = "client!sa", name = "v", descriptor = "Z")
    private boolean field3012;

    @OriginalMember(owner = "client!sa", name = "y", descriptor = "Lqp;")
    private class715 field3015;

    @OriginalMember(owner = "client!sa", name = "D", descriptor = "I")
    private int field3020;

    @OriginalMember(owner = "client!sa", name = "A", descriptor = "I")
    public int field3017;

    @OriginalMember(owner = "client!sa", name = "F", descriptor = "I")
    public int field3022;

    @OriginalMember(owner = "client!sa", name = "Y", descriptor = "I")
    public int field3041;

    @OriginalMember(owner = "client!sa", name = "U", descriptor = "I")
    public int field3037;

    @OriginalMember(owner = "client!sa", name = "J", descriptor = "I")
    public int field3026;

    @OriginalMember(owner = "client!sa", name = "K", descriptor = "I")
    public int field3027;

    @OriginalMember(owner = "client!sa", name = "V", descriptor = "Z")
    private boolean field3038;

    @OriginalMember(owner = "client!sa", name = "E", descriptor = "I")
    public int field3021;

    @OriginalMember(owner = "client!sa", name = "eb", descriptor = "I")
    public int field3047;

    @OriginalMember(owner = "client!sa", name = "hb", descriptor = "I")
    public int field3050;

    @OriginalMember(owner = "client!sa", name = "O", descriptor = "I")
    public int field3031;

    @OriginalMember(owner = "client!sa", name = "jb", descriptor = "I")
    public int field3052;

    @OriginalMember(owner = "client!sa", name = "kb", descriptor = "I")
    private int field3053;

    @OriginalMember(owner = "client!sa", name = "lb", descriptor = "I")
    public int field3054;

    @OriginalMember(owner = "client!sa", name = "fb", descriptor = "Lfba;")
    private class348 field3048;

    @OriginalMember(owner = "client!sa", name = "nb", descriptor = "I")
    private int field3056;

    @OriginalMember(owner = "client!sa", name = "bb", descriptor = "Lfba;")
    private class348 field3044;

    @OriginalMember(owner = "client!sa", name = "L", descriptor = "Lrda;")
    public class447 field3028;

    @OriginalMember(owner = "client!sa", name = "w", descriptor = "I")
    private int field3013;

    @OriginalMember(owner = "client!sa", name = "r", descriptor = "I")
    private int field3008;

    @OriginalMember(owner = "client!sa", name = "s", descriptor = "I")
    private int field3009;

    @OriginalMember(owner = "client!sa", name = "z", descriptor = "I")
    public int field3016;

    @OriginalMember(owner = "client!sa", name = "B", descriptor = "I")
    public int field3018;

    @OriginalMember(owner = "client!sa", name = "C", descriptor = "I")
    public int field3019;

    @OriginalMember(owner = "client!sa", name = "G", descriptor = "I")
    private int field3023;

    @OriginalMember(owner = "client!sa", name = "I", descriptor = "I")
    private int field3025;

    @OriginalMember(owner = "client!sa", name = "M", descriptor = "I")
    public int field3029;

    @OriginalMember(owner = "client!sa", name = "Q", descriptor = "I")
    public int field3033;

    @OriginalMember(owner = "client!sa", name = "R", descriptor = "I")
    public int field3034;

    @OriginalMember(owner = "client!sa", name = "T", descriptor = "I")
    public int field3036;

    @OriginalMember(owner = "client!sa", name = "W", descriptor = "I")
    private int field3039;

    @OriginalMember(owner = "client!sa", name = "X", descriptor = "I")
    public int field3040;

    @OriginalMember(owner = "client!sa", name = "ab", descriptor = "I")
    public int field3043;

    @OriginalMember(owner = "client!sa", name = "cb", descriptor = "I")
    private int field3045;

    @OriginalMember(owner = "client!sa", name = "db", descriptor = "I")
    private int field3046;

    @OriginalMember(owner = "client!sa", name = "gb", descriptor = "I")
    public int field3049;

    @OriginalMember(owner = "client!sa", name = "ib", descriptor = "I")
    public int field3051;

    @OriginalMember(owner = "client!sa", name = "mb", descriptor = "Ltd;")
    private class515 field3055;

    @OriginalMember(owner = "client!sa", name = "N", descriptor = "Lpv;")
    private class663 field3030;

    @OriginalMember(owner = "client!sa", name = "t", descriptor = "Lmj;")
    public class711 field3010;

    @OriginalMember(owner = "client!sa", name = "x", descriptor = "Ljava/awt/Canvas;")
    private Canvas field3014;

    @OriginalMember(owner = "client!sa", name = "H", descriptor = "[F")
    public float[] field3024;

    @OriginalMember(owner = "client!sa", name = "Z", descriptor = "[F")
    public float[] field3042;

    @OriginalMember(owner = "client!sa", name = "P", descriptor = "[I")
    public int[] field3032;

    @OriginalMember(owner = "client!sa", name = "S", descriptor = "[Llfa;")
    private class261[] field3035;

    @OriginalMember(owner = "client!sa", name = "T", descriptor = "(IIII)V")
    public final void method335(int arg0, int arg1, int arg2, int arg3) {
        if (this.field3041 < arg0) {
            this.field3041 = arg0;
        }
        if (this.field3047 < arg1) {
            this.field3047 = arg1;
        }
        if (this.field3050 > arg2) {
            this.field3050 = arg2;
        }
        if (this.field3022 > arg3) {
            this.field3022 = arg3;
        }
        this.method1447();
    }

    @OriginalMember(owner = "client!sa", name = "j", descriptor = "(I)V")
    public final void method279(int arg0) {
        this.field3052 = arg0;
        this.field3044.method2220(false);
    }

    @OriginalMember(owner = "client!sa", name = "w", descriptor = "()Z")
    public final boolean method255() {
        return true;
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method314(Canvas arg0, int arg1, int arg2) {
        class711 var4 = (class711) this.field3015.method4020((long) arg0.hashCode(), (byte) -113);
        if (var4 != null) {
            var4.method2656((byte) 117);
            class711 var5 = class237.method1655(arg2, arg1, arg0, (byte) 126);
            this.field3015.method4022(var5, 106, (long) arg0.hashCode());
            if (this.field3014 == arg0 && this.field3030 == null) {
                Dimension var6 = arg0.getSize();
                this.field3009 = var6.width;
                this.field3008 = var6.height;
                this.field3010 = var5;
                this.field3032 = var5.field10015;
                this.field3051 = var5.field10016;
                this.field3046 = var5.field10017;
                if (this.field3051 != this.field3025 || this.field3046 != this.field3045) {
                    this.field3039 = this.field3025 = this.field3051;
                    this.field3023 = this.field3045 = this.field3046;
                    this.field3042 = this.field3024 = new float[this.field3045 * this.field3025];
                }
                this.method1445();
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lnb;IIII)V")
    private final void method1438(class95 arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = arg0.field1376;
        int var8 = arg4 << 1;
        if (var6 == -1) {
            this.method1440(arg1, arg2, arg3, arg4, arg0.field1375, 1);
        } else {
            if (this.field3056 != var6) {
                class515 var9 = (class515) this.field3048.method2216(0, (long) var6);
                if (var9 == null) {
                    int[] var10 = this.method1449(var6);
                    if (var10 == null) {
                        return;
                    }
                    int var11 = this.method1441(var6) ? 64 : this.field3052;
                    var9 = this.method3265(var10, var11, var11, var11, 0, (byte) 50);
                    this.field3048.method2213((byte) -16, (long) var6, var9);
                }
                this.field3056 = var6;
                this.field3055 = var9;
            }
            ++var8;
            ((class106) this.field3055).method785(arg1 - arg4, arg2 - arg4, arg3, var8, var8, 0, arg0.field1375, 1, 1);
        }
    }

    @OriginalMember(owner = "client!sa", name = "g", descriptor = "()Z")
    public final boolean method1439() {
        return this.field3011;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lup;Lrga;)Ldv;")
    public final class86 method1231(class239 arg0, class290 arg1) {
        return new class663(this, (class515) arg0, (class193) arg1);
    }

    @OriginalMember(owner = "client!sa", name = "A", descriptor = "(ILaa;II)V")
    public final void method293(int arg0, class569 arg1, int arg2, int arg3) {
        class211 var5 = (class211) arg1;
        int[] var6 = var5.field3168;
        int[] var7 = var5.field3165;
        int var8;
        if (this.field3022 < var6.length + arg3) {
            var8 = this.field3022 - arg3;
        } else {
            var8 = var6.length;
        }
        int var9;
        if (this.field3047 > arg3) {
            var9 = this.field3047 - arg3;
            arg3 = this.field3047;
        } else {
            var9 = 0;
        }
        if (var8 - var9 > 0) {
            int var10 = this.field3051 * arg3;
            for (int var11 = var9; var11 < var8; ++var11) {
                int var12 = var6[var11] + arg2;
                int var13 = var7[var11];
                if (this.field3041 > var12) {
                    var13 -= this.field3041 - var12;
                    var12 = this.field3041;
                }
                if (this.field3050 < var12 + var13) {
                    var13 = this.field3050 - var12;
                }
                int var14 = var10 + var12;
                for (int var15 = -var13; var15 < 0; ++var15) {
                    this.field3032[var14++] = arg0;
                }
                var10 += this.field3051;
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "ra", descriptor = "(IIII)V")
    public final void method209(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field3035.length; ++var5) {
            this.field3035[var5].field3716 = this.field3035[var5].field3724;
            this.field3035[var5].field3715 = arg0;
            this.field3035[var5].field3724 = arg1;
            this.field3035[var5].field3720 = arg2;
            this.field3035[var5].field3729 = true;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIIIILaa;II)V")
    public final void method276(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class569 arg6, int arg7, int arg8) {
        class211 var10 = (class211) arg6;
        int[] var11 = var10.field3168;
        int[] var12 = var10.field3165;
        int var13 = this.field3047 > arg8 ? this.field3047 : arg8;
        int var14 = this.field3022 < var11.length + arg8 ? this.field3022 : var11.length + arg8;
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
            if (arg0 < this.field3041) {
                var18 += (this.field3041 - arg0) * var20;
                arg0 = this.field3041;
            }
            if (var21 >= this.field3050) {
                var21 = this.field3050 - 1;
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
                                int var28 = this.field3051 * var25 + arg0;
                                int var29 = this.field3032[var28];
                                int var30 = ((var29 & 16711935) * var24 >> 8 & 16711935) + ((var29 & 65280) * var24 >> 8 & 65280);
                                this.field3032[var28] = var23 + var30;
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
                                int var34 = this.field3051 * var31 + arg0;
                                int var35 = this.field3032[var34];
                                int var36 = arg4 + var35;
                                int var37 = (arg4 & 16711935) + (var35 & 16711935);
                                int var38 = (var36 - var37 & 65536) + (var37 & 16777472);
                                this.field3032[var34] = var36 - var38 | var38 - (var38 >>> 8);
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
                            this.field3032[this.field3051 * var39 + arg0] = arg4;
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
                    if (var64 >= this.field3041 && var64 < this.field3050 && var64 >= var66 && var64 < var12[var65] + var66) {
                        this.field3032[this.field3051 * arg1 + var64] = arg4;
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
                    if (var50 >= this.field3041 && var50 < this.field3050 && var50 >= var52 && var50 < var12[var51] + var52) {
                        int var53 = this.field3051 * arg1 + var50;
                        int var54 = this.field3032[var53];
                        int var55 = ((var54 & 16711935) * var49 >> 8 & 16711935) + ((var54 & 65280) * var49 >> 8 & 65280);
                        this.field3032[this.field3051 * arg1 + var50] = var48 + var55;
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else if (arg5 == 2) {
                while (arg1 <= var46) {
                    int var56 = var43 >> 16;
                    int var57 = arg1 - arg8;
                    int var58 = var11[var57] + arg7;
                    if (var56 >= this.field3041 && var56 < this.field3050 && var56 >= var58 && var56 < var12[var57] + var58) {
                        int var59 = this.field3051 * arg1 + var56;
                        int var60 = this.field3032[var59];
                        int var61 = arg4 + var60;
                        int var62 = (arg4 & 16711935) + (var60 & 16711935);
                        int var63 = (var61 - var62 & 65536) + (var62 & 16777472);
                        this.field3032[var59] = var61 - var63 | var63 - (var63 >>> 8);
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "U", descriptor = "(IIIII)V")
    public final void method357(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 >= this.field3047 && arg1 < this.field3022) {
            if (arg0 < this.field3041) {
                arg2 -= this.field3041 - arg0;
                arg0 = this.field3041;
            }
            if (arg0 + arg2 > this.field3050) {
                arg2 = this.field3050 - arg0;
            }
            int var6 = this.field3051 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field3032[var6 + var10];
                        int var12 = ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & 65280) * var9 >> 8 & 65280);
                        this.field3032[var6 + var10] = var8 + var12;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var13 = 0; var13 < arg2; ++var13) {
                        int var14 = this.field3032[var6 + var13];
                        int var15 = arg3 + var14;
                        int var16 = (arg3 & 16711935) + (var14 & 16711935);
                        int var17 = (var15 - var16 & 65536) + (var16 & 16777472);
                        this.field3032[var6 + var13] = var15 - var17 | var17 - (var17 >>> 8);
                    }
                }
            } else {
                for (int var18 = 0; var18 < arg2; ++var18) {
                    this.field3032[var6 + var18] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIIIIIIIIIII)V")
    public final void method234(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        class261 var14 = this.method1446(Thread.currentThread());
        class213 var15 = var14.field3739;
        var15.field3188 = false;
        int var16 = arg0 - this.field3019;
        int var17 = arg3 - this.field3019;
        int var18 = arg6 - this.field3019;
        int var19 = arg1 - this.field3036;
        int var20 = arg4 - this.field3036;
        int var21 = arg7 - this.field3036;
        var15.field3176 = var16 < 0 || var16 > var15.field3178 || var17 < 0 || var17 > var15.field3178 || var18 < 0 || var18 > var15.field3178;
        int var22 = arg9 >>> 24;
        if (arg12 != 0 && (arg12 != 1 || var22 != 255)) {
            if (arg12 == 1) {
                var15.field3187 = 255 - var22;
                var15.field3189 = false;
                var15.method1512((float) var19, (float) var20, (float) var21, (float) var16, (float) var17, (float) var18, (float) arg2, (float) arg5, (float) arg8, arg9, arg10, arg11);
            } else {
                if (arg12 != 2) {
                    throw new IllegalArgumentException();
                }
                var15.field3187 = 128;
                var15.field3189 = true;
                var15.method1512((float) var19, (float) var20, (float) var21, (float) var16, (float) var17, (float) var18, (float) arg2, (float) arg5, (float) arg8, arg9, arg10, arg11);
            }
        } else {
            var15.field3187 = 0;
            var15.field3189 = false;
            var15.method1512((float) var19, (float) var20, (float) var21, (float) var16, (float) var17, (float) var18, (float) arg2, (float) arg5, (float) arg8, arg9, arg10, arg11);
        }
        var15.field3188 = true;
    }

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "(IIIIII)V")
    private final void method1440(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 < 0) {
            arg3 = -arg3;
        }
        int var7 = arg1 - arg3;
        if (var7 < this.field3047) {
            var7 = this.field3047;
        }
        int var8 = arg1 + arg3 + 1;
        if (var8 > this.field3022) {
            var8 = this.field3022;
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
                if (var65 < this.field3041) {
                    var65 = this.field3041;
                }
                int var66 = arg0 + var11;
                if (var66 > this.field3050) {
                    var66 = this.field3050;
                }
                int var67 = this.field3051 * var9 + var65;
                for (int var68 = var65; var68 < var66; ++var68) {
                    if ((float) arg2 < this.field3024[var67]) {
                        this.field3032[var67] = arg4;
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
                if (var61 < this.field3041) {
                    var61 = this.field3041;
                }
                int var62 = arg0 + var56;
                if (var62 > this.field3050 - 1) {
                    var62 = this.field3050 - 1;
                }
                int var63 = this.field3051 * var9 + var61;
                for (int var64 = var61; var64 <= var62; ++var64) {
                    if ((float) arg2 < this.field3024[var63]) {
                        this.field3032[var63] = arg4;
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
                if (var29 < this.field3041) {
                    var29 = this.field3041;
                }
                int var30 = arg0 + var11;
                if (var30 > this.field3050) {
                    var30 = this.field3050;
                }
                int var31 = this.field3051 * var9 + var29;
                for (int var32 = var29; var32 < var30; ++var32) {
                    if ((float) arg2 < this.field3024[var31]) {
                        int var33 = this.field3032[var31];
                        int var34 = ((var33 & 16711935) * var17 >> 8 & 16711935) + ((var33 & 65280) * var17 >> 8 & 65280);
                        this.field3032[var31] = var16 + var34;
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
                if (var23 < this.field3041) {
                    var23 = this.field3041;
                }
                int var24 = arg0 + var18;
                if (var24 > this.field3050 - 1) {
                    var24 = this.field3050 - 1;
                }
                int var25 = this.field3051 * var9 + var23;
                for (int var26 = var23; var26 <= var24; ++var26) {
                    if ((float) arg2 < this.field3024[var25]) {
                        int var27 = this.field3032[var25];
                        int var28 = ((var27 & 16711935) * var17 >> 8 & 16711935) + ((var27 & 65280) * var17 >> 8 & 65280);
                        this.field3032[var25] = var16 + var28;
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
                if (var48 < this.field3041) {
                    var48 = this.field3041;
                }
                int var49 = arg0 + var11;
                if (var49 > this.field3050) {
                    var49 = this.field3050;
                }
                int var50 = this.field3051 * var9 + var48;
                for (int var51 = var48; var51 < var49; ++var51) {
                    if ((float) arg2 < this.field3024[var50]) {
                        int var52 = this.field3032[var50];
                        int var53 = arg4 + var52;
                        int var54 = (arg4 & 16711935) + (var52 & 16711935);
                        int var55 = (var53 - var54 & 65536) + (var54 & 16777472);
                        this.field3032[var50] = var53 - var55 | var55 - (var55 >>> 8);
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
                if (var40 < this.field3041) {
                    var40 = this.field3041;
                }
                int var41 = arg0 + var35;
                if (var41 > this.field3050 - 1) {
                    var41 = this.field3050 - 1;
                }
                int var42 = this.field3051 * var9 + var40;
                for (int var43 = var40; var43 <= var41; ++var43) {
                    if ((float) arg2 < this.field3024[var42]) {
                        int var44 = this.field3032[var42];
                        int var45 = arg4 + var44;
                        int var46 = (arg4 & 16711935) + (var44 & 16711935);
                        int var47 = (var45 - var46 & 65536) + (var46 & 16777472);
                        this.field3032[var42] = var45 - var47 | var47 - (var47 >>> 8);
                    }
                    ++var42;
                }
                ++var9;
                var39 += var36 + var36;
                var38 += var36++ + var36;
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "F", descriptor = "(II)V")
    public final void method1254(int arg0, int arg1) {
        int var3 = this.field3051 * arg1 + arg0;
        int var4 = this.field3025 * arg1 + arg0;
        if (var3 != 0 || var4 != 0) {
            int[] var5 = this.field3032;
            float[] var6 = this.field3024;
            if (var3 < 0) {
                int var7 = var5.length + var3;
                class85.method684(var5, -var3, var5, 0, var7);
            } else if (var3 > 0) {
                int var8 = var5.length - var3;
                class85.method684(var5, 0, var5, var3, var8);
            }
            if (var4 < 0) {
                int var9 = var6.length + var4;
                class85.method679(var6, -var4, var6, 0, var9);
            } else {
                if (var4 > 0) {
                    int var10 = var6.length - var4;
                    class85.method679(var6, 0, var6, var4, var10);
                }
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "m", descriptor = "()Z")
    public final boolean method407() {
        return false;
    }

    @OriginalMember(owner = "client!sa", name = "P", descriptor = "(IIIII)V")
    public final void method268(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 >= this.field3041 && arg0 < this.field3050) {
            if (arg1 < this.field3047) {
                arg2 -= this.field3047 - arg1;
                arg1 = this.field3047;
            }
            if (arg1 + arg2 > this.field3022) {
                arg2 = this.field3022 - arg1;
            }
            int var6 = this.field3051 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field3051 * var10 + var6;
                        int var12 = this.field3032[var11];
                        int var13 = ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & 65280) * var9 >> 8 & 65280);
                        this.field3032[var11] = var8 + var13;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var14 = 0; var14 < arg2; ++var14) {
                        int var15 = this.field3051 * var14 + var6;
                        int var16 = this.field3032[var15];
                        int var17 = arg3 + var16;
                        int var18 = (arg3 & 16711935) + (var16 & 16711935);
                        int var19 = (var17 - var18 & 65536) + (var18 & 16777472);
                        this.field3032[var15] = var17 - var19 | var19 - (var19 >>> 8);
                    }
                }
            } else {
                for (int var20 = 0; var20 < arg2; ++var20) {
                    this.field3032[this.field3051 * var20 + var6] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lffa;Z)Ltd;")
    public final class515 method202(class676 arg0, boolean arg1) {
        int[] var3 = arg0.field9615;
        byte[] var4 = arg0.field9612;
        int var5 = arg0.field9614;
        int var6 = arg0.field9618;
        class106 var11;
        if (arg1 && arg0.field9616 == null) {
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
            var11 = new class427(this, var8, var7, var5, var6);
        } else {
            int[] var14 = new int[var5 * var6];
            byte[] var15 = arg0.field9616;
            if (var15 != null) {
                for (int var16 = 0; var16 < var6; ++var16) {
                    int var17 = var5 * var16;
                    for (int var18 = 0; var18 < var5; ++var18) {
                        var14[var17 + var18] = var3[var4[var17 + var18] & 255] | var15[var17 + var18] << 24;
                    }
                }
                var11 = new class110(this, var14, var5, var6);
            } else {
                for (int var19 = 0; var19 < var6; ++var19) {
                    int var20 = var5 * var19;
                    for (int var21 = 0; var21 < var5; ++var21) {
                        int var22 = var3[var4[var20 + var21] & 255];
                        var14[var20 + var21] = var22 != 0 ? -16777216 | var22 : 0;
                    }
                }
                var11 = new class722(this, var14, var5, var6);
            }
        }
        var11.method783(arg0.field9613, arg0.field9610, arg0.field9617, arg0.field9611);
        return var11;
    }

    @OriginalMember(owner = "client!sa", name = "z", descriptor = "()Z")
    public final boolean method412() {
        return false;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lsk;)V")
    public final void method364(class121 arg0) {
        this.field3028 = (class447) arg0;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method378(Canvas arg0) {
        if (arg0 != null) {
            class711 var2 = (class711) this.field3015.method4020((long) arg0.hashCode(), (byte) -86);
            if (var2 != null) {
                this.field3014 = arg0;
                Dimension var3 = arg0.getSize();
                this.field3009 = var3.width;
                this.field3008 = var3.height;
                this.field3010 = var2;
                if (this.field3030 == null) {
                    this.field3032 = var2.field10015;
                    this.field3051 = var2.field10016;
                    this.field3046 = var2.field10017;
                    if (this.field3051 != this.field3025 || this.field3046 != this.field3045) {
                        this.field3039 = this.field3025 = this.field3051;
                        this.field3023 = this.field3045 = this.field3046;
                        this.field3042 = this.field3024 = new float[this.field3045 * this.field3025];
                    }
                    this.method1445();
                    return;
                }
            }
        } else {
            this.field3014 = null;
            this.field3010 = null;
            if (this.field3030 == null) {
                this.field3032 = null;
                this.field3051 = this.field3046 = 1;
                this.field3025 = this.field3045 = 1;
                this.method1445();
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "t", descriptor = "()Z")
    public final boolean method343() {
        return true;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIIIILaa;IIIII)V")
    public final void method368(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class569 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        class211 var13 = (class211) arg6;
        int[] var14 = var13.field3168;
        int[] var15 = var13.field3165;
        int var16 = this.field3047 > arg8 ? this.field3047 : arg8;
        int var17 = this.field3022 < var14.length + arg8 ? this.field3022 : var14.length + arg8;
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
                        if (arg0 >= this.field3041 && arg0 < this.field3050 && var37 >= var16 && var37 < var17 && var22 < var19) {
                            int var39 = var14[var38] + arg7;
                            if (arg0 >= var39 && arg0 < var15[var38] + var39) {
                                int var40 = this.field3051 * var37 + arg0;
                                int var41 = this.field3032[var40];
                                int var42 = ((var41 & 16711935) * var36 >> 8 & 16711935) + ((var41 & 65280) * var36 >> 8 & 65280);
                                this.field3032[var40] = var35 + var42;
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
                        if (arg0 >= this.field3041 && arg0 < this.field3050 && var44 >= var16 && var44 < var17 && var22 < var19) {
                            int var46 = var14[var45] + arg7;
                            if (arg0 >= var46 && arg0 < var15[var45] + var46) {
                                int var47 = this.field3051 * var44 + arg0;
                                int var48 = this.field3032[var47];
                                int var49 = arg4 + var48;
                                int var50 = (arg4 & 16711935) + (var48 & 16711935);
                                int var51 = (var49 - var50 & 65536) + (var50 & 16777472);
                                this.field3032[var47] = var49 - var51 | var51 - (var51 >>> 8);
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
                    if (arg0 >= this.field3041 && arg0 < this.field3050 && var53 >= var16 && var53 < var17 && var22 < var19) {
                        int var55 = var14[var54] + arg7;
                        if (arg0 >= var55 && arg0 < var15[var54] + var55) {
                            this.field3032[this.field3051 * var53 + arg0] = arg4;
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
                    if (arg1 >= var16 && arg1 < var17 && var80 >= this.field3041 && var80 < this.field3050 && var22 < var19 && var80 >= var14[var81] + arg7 && var80 < var14[var81] + arg7 + var15[var81]) {
                        this.field3032[this.field3051 * arg1 + var80] = arg4;
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
                    if (arg1 >= var16 && arg1 < var17 && var66 >= this.field3041 && var66 < this.field3050 && var22 < var19 && var66 >= var14[var67] + arg7 && var66 < var14[var67] + arg7 + var15[var67]) {
                        int var68 = this.field3051 * arg1 + var66;
                        int var69 = this.field3032[var68];
                        int var70 = ((var69 & 16711935) * var65 >> 8 & 16711935) + ((var69 & 65280) * var65 >> 8 & 65280);
                        this.field3032[this.field3051 * arg1 + var66] = var64 + var70;
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
                    if (arg1 >= var16 && arg1 < var17 && var72 >= this.field3041 && var72 < this.field3050 && var22 < var19 && var72 >= var14[var73] + arg7 && var72 < var14[var73] + arg7 + var15[var73]) {
                        int var74 = this.field3051 * arg1 + var72;
                        int var75 = this.field3032[var74];
                        int var76 = arg4 + var75;
                        int var77 = (arg4 & 16711935) + (var75 & 16711935);
                        int var78 = (var76 - var77 & 65536) + (var77 & 16777472);
                        this.field3032[var74] = var76 - var78 | var78 - (var78 >>> 8);
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

    @OriginalMember(owner = "client!sa", name = "la", descriptor = "()V")
    public final void method328() {
        this.field3041 = 0;
        this.field3047 = 0;
        this.field3050 = this.field3051;
        this.field3022 = this.field3046;
        this.method1447();
    }

    @OriginalMember(owner = "client!sa", name = "H", descriptor = "(III[I)V")
    public final void method402(int arg0, int arg1, int arg2, int[] arg3) {
        float var5 = (float) arg2 * this.field3028.field6373 + (float) arg0 * this.field3028.field6379 + (float) arg1 * this.field3028.field6381 + this.field3028.field6372;
        if (var5 == 0.0F) {
            arg3[0] = arg3[1] = arg3[2] = -1;
        } else {
            int var6 = (int) (((float) arg2 * this.field3028.field6375 + (float) arg0 * this.field3028.field6391 + (float) arg1 * this.field3028.field6384 + this.field3028.field6383) * (float) this.field3017 / var5);
            int var7 = (int) (((float) arg2 * this.field3028.field6393 + (float) arg0 * this.field3028.field6394 + (float) arg1 * this.field3028.field6374 + this.field3028.field6367) * (float) this.field3027 / var5);
            arg3[0] = var6 - this.field3019;
            arg3[1] = var7 - this.field3036;
            arg3[2] = (int) var5;
        }
    }

    @OriginalMember(owner = "client!sa", name = "I", descriptor = "()I")
    public final int method1237() {
        int var1 = this.field3053;
        this.field3053 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lss;Lss;FLss;)Lss;")
    public final class506 method1251(class506 arg0, class506 arg1, float arg2, class506 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!sa", name = "xa", descriptor = "(F)V")
    public final void method271(float arg0) {
        this.field3037 = (int) (arg0 * 65535.0F);
    }

    @OriginalMember(owner = "client!sa", name = "M", descriptor = "()I")
    public final int method332() {
        int var1 = this.field3020;
        this.field3020 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!sa", name = "na", descriptor = "(IIII)[I")
    public final int[] method1226(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = new int[arg2 * arg3];
        int var6 = 0;
        for (int var7 = 0; var7 < arg3; ++var7) {
            int var8 = (arg1 + var7) * this.field3051 + arg0;
            for (int var9 = 0; var9 < arg2; ++var9) {
                var5[var6++] = this.field3032[var8 + var9];
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lza;)V")
    public final void method393(class254 arg0) {
    }

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "(I)Z")
    public final boolean method1441(int arg0) {
        return this.field3038 || super.field7881.method962(arg0, 2904).field9636;
    }

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "()Z")
    public final boolean method296() {
        return true;
    }

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "(IIIIII)V")
    public final void method380(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg2 - arg0;
        int var8 = arg3 - arg1;
        if (var8 == 0) {
            if (var7 >= 0) {
                this.method357(arg0, arg1, var7 + 1, arg4, arg5);
            } else {
                this.method357(arg0 + var7, arg1, -var7 + 1, arg4, arg5);
            }
        } else if (var7 == 0) {
            if (var8 >= 0) {
                this.method268(arg0, arg1, var8 + 1, arg4, arg5);
            } else {
                this.method268(arg0, arg1 + var8, -var8 + 1, arg4, arg5);
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
                if (arg0 < this.field3041) {
                    var10 += (this.field3041 - arg0) * var12;
                    arg0 = this.field3041;
                }
                if (var13 >= this.field3050) {
                    var13 = this.field3050 - 1;
                }
                int var14 = arg4 >>> 24;
                if (arg5 != 0 && (arg5 != 1 || var14 != 255)) {
                    if (arg5 == 1) {
                        int var15 = (var14 << 24) + ((arg4 & 16711935) * var14 >> 8 & 16711935) + ((arg4 & 65280) * var14 >> 8 & 65280);
                        int var16 = 256 - var14;
                        while (arg0 <= var13) {
                            int var17 = var10 >> 16;
                            if (var17 >= this.field3047 && var17 < this.field3022) {
                                int var18 = this.field3051 * var17 + arg0;
                                int var19 = this.field3032[var18];
                                int var20 = ((var19 & 16711935) * var16 >> 8 & 16711935) + ((var19 & 65280) * var16 >> 8 & 65280);
                                this.field3032[var18] = var15 + var20;
                            }
                            var10 += var12;
                            ++arg0;
                        }
                    } else if (arg5 == 2) {
                        while (arg0 <= var13) {
                            int var21 = var10 >> 16;
                            if (var21 >= this.field3047 && var21 < this.field3022) {
                                int var22 = this.field3051 * var21 + arg0;
                                int var23 = this.field3032[var22];
                                int var24 = arg4 + var23;
                                int var25 = (arg4 & 16711935) + (var23 & 16711935);
                                int var26 = (var24 - var25 & 65536) + (var25 & 16777472);
                                this.field3032[var22] = var24 - var26 | var26 - (var26 >>> 8);
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
                        if (var27 >= this.field3047 && var27 < this.field3022) {
                            this.field3032[this.field3051 * var27 + arg0] = arg4;
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
                if (arg1 < this.field3047) {
                    var29 += (this.field3047 - arg1) * var31;
                    arg1 = this.field3047;
                }
                if (var32 >= this.field3022) {
                    var32 = this.field3022 - 1;
                }
                int var33 = arg4 >>> 24;
                if (arg5 == 0 || arg5 == 1 && var33 == 255) {
                    while (arg1 <= var32) {
                        int var46 = var29 >> 16;
                        if (var46 >= this.field3041 && var46 < this.field3050) {
                            this.field3032[this.field3051 * arg1 + var46] = arg4;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 1) {
                    int var34 = (var33 << 24) + ((arg4 & 16711935) * var33 >> 8 & 16711935) + ((arg4 & 65280) * var33 >> 8 & 65280);
                    int var35 = 256 - var33;
                    while (arg1 <= var32) {
                        int var36 = var29 >> 16;
                        if (var36 >= this.field3041 && var36 < this.field3050) {
                            int var37 = this.field3051 * arg1 + var36;
                            int var38 = this.field3032[var37];
                            int var39 = ((var38 & 16711935) * var35 >> 8 & 16711935) + ((var38 & 65280) * var35 >> 8 & 65280);
                            this.field3032[this.field3051 * arg1 + var36] = var34 + var39;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 2) {
                    while (arg1 <= var32) {
                        int var40 = var29 >> 16;
                        if (var40 >= this.field3041 && var40 < this.field3050) {
                            int var41 = this.field3051 * arg1 + var40;
                            int var42 = this.field3032[var41];
                            int var43 = arg4 + var42;
                            int var44 = (arg4 & 16711935) + (var42 & 16711935);
                            int var45 = (var43 - var44 & 65536) + (var44 & 16777472);
                            this.field3032[var41] = var43 - var45 | var45 - (var45 >>> 8);
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

    @OriginalMember(owner = "client!sa", name = "r", descriptor = "(IIIIIII)I")
    public final int method324(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        float var8 = (float) arg2 * this.field3028.field6373 + (float) arg0 * this.field3028.field6379 + (float) arg1 * this.field3028.field6381 + this.field3028.field6372;
        float var9 = (float) arg5 * this.field3028.field6373 + (float) arg3 * this.field3028.field6379 + (float) arg4 * this.field3028.field6381 + this.field3028.field6372;
        int var10 = 0;
        if (var8 < (float) this.field3031 && var9 < (float) this.field3031) {
            var10 |= 16;
        } else if (var8 > (float) this.field3054 && var9 > (float) this.field3054) {
            var10 |= 32;
        }
        int var11 = (int) (((float) arg2 * this.field3028.field6375 + (float) arg0 * this.field3028.field6391 + (float) arg1 * this.field3028.field6384 + this.field3028.field6383) * (float) this.field3017 / (float) arg6);
        int var12 = (int) (((float) arg5 * this.field3028.field6375 + (float) arg3 * this.field3028.field6391 + (float) arg4 * this.field3028.field6384 + this.field3028.field6383) * (float) this.field3017 / (float) arg6);
        if (var11 < this.field3019 && var12 < this.field3019) {
            var10 |= 1;
        } else if (var11 > this.field3040 && var12 > this.field3040) {
            var10 |= 2;
        }
        int var13 = (int) (((float) arg2 * this.field3028.field6393 + (float) arg0 * this.field3028.field6394 + (float) arg1 * this.field3028.field6374 + this.field3028.field6367) * (float) this.field3027 / (float) arg6);
        int var14 = (int) (((float) arg5 * this.field3028.field6393 + (float) arg3 * this.field3028.field6394 + (float) arg4 * this.field3028.field6374 + this.field3028.field6367) * (float) this.field3027 / (float) arg6);
        if (var13 < this.field3036 && var14 < this.field3036) {
            var10 |= 4;
        } else if (var13 > this.field3043 && var14 > this.field3043) {
            var10 |= 8;
        }
        return var10;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIZ)Ltd;")
    public final class515 method377(int arg0, int arg1, boolean arg2) {
        return arg2 ? new class110(this, arg0, arg1) : new class722(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!sa", name = "h", descriptor = "()V")
    public final void method250() {
        this.field3044.method2220(false);
        this.field3048.method2220(false);
    }

    @OriginalMember(owner = "client!sa", name = "GA", descriptor = "(I)V")
    public final void method1240(int arg0) {
        this.method397(0, 0, this.field3051, this.field3046, arg0, 0);
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(Ld;)V")
    private class203(class267 arg0) {
        super(arg0);
        this.field3011 = false;
        this.field3012 = false;
        this.field3015 = new class715(4);
        this.field3020 = 0;
        this.field3017 = 512;
        this.field3022 = 0;
        this.field3041 = 0;
        this.field3037 = 75518;
        this.field3026 = 78642;
        this.field3027 = 512;
        this.field3038 = false;
        this.field3021 = 45823;
        this.field3047 = 0;
        this.field3050 = 0;
        this.field3031 = 50;
        this.field3052 = 128;
        this.field3053 = 0;
        this.field3054 = 3500;
        this.field3048 = new class348(16);
        this.field3056 = -1;
        this.field3044 = new class348(256);
        this.field3028 = new class447();
        this.method340(1);
        this.method383(0);
        class705.method3955(true, true, -1);
        this.field3012 = true;
        this.field3013 = (int) class465.method2818(255);
    }

    @OriginalMember(owner = "client!sa", name = "k", descriptor = "(I)I")
    public final int method1442(int arg0) {
        return super.field7881.method962(arg0, 2904).field9631 & 65535;
    }

    @OriginalMember(owner = "client!sa", name = "i", descriptor = "(I)V")
    public final void method251(int arg0) {
        this.field3035[arg0].method1733((Runnable) null, (byte) 126);
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIIIIIII)V")
    public final void method222(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var10 = arg2 - arg0;
        int var11 = arg3 - arg1;
        if (var11 == 0) {
            if (var10 >= 0) {
                this.method1452(arg0, arg1, var10 + 1, arg4, arg5, arg6, arg7, arg8);
            } else {
                int var12 = arg6 + arg7;
                int var13 = arg8 % var12;
                int var14 = arg6 + var12 - var13 - (-var10 + 1) % var12;
                int var15 = var14 % var12;
                if (var15 < 0) {
                    var15 += var12;
                }
                this.method1452(arg0 + var10, arg1, -var10 + 1, arg4, arg5, arg6, arg7, var15);
            }
        } else if (var10 == 0) {
            if (var11 >= 0) {
                this.method1448(arg0, arg1, var11 + 1, arg4, arg5, arg6, arg7, arg8);
            } else {
                int var16 = arg6 + arg7;
                int var17 = arg8 % var16;
                int var18 = arg6 + var16 - var17 - (-var11 + 1) % var16;
                int var19 = var18 % var16;
                if (var19 < 0) {
                    var19 += var16;
                }
                this.method1448(arg0, arg1 + var11, -var11 + 1, arg4, arg5, arg6, arg7, var19);
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
                            if (arg0 >= this.field3041 && arg0 < this.field3050 && var37 >= this.field3047 && var37 < this.field3022 && var24 < var21) {
                                int var38 = this.field3051 * var37 + arg0;
                                int var39 = this.field3032[var38];
                                int var40 = ((var39 & 16711935) * var36 >> 8 & 16711935) + ((var39 & 65280) * var36 >> 8 & 65280);
                                this.field3032[var38] = var35 + var40;
                            }
                            var29 += var31;
                            ++arg0;
                            int var41 = var24 + var34;
                            var24 = var41 % var23;
                        }
                    } else if (arg5 == 2) {
                        while (arg0 <= var32) {
                            int var42 = var29 >> 16;
                            if (arg0 >= this.field3041 && arg0 < this.field3050 && var42 >= this.field3047 && var42 < this.field3022 && var24 < var21) {
                                int var43 = this.field3051 * var42 + arg0;
                                int var44 = this.field3032[var43];
                                int var45 = arg4 + var44;
                                int var46 = (arg4 & 16711935) + (var44 & 16711935);
                                int var47 = (var45 - var46 & 65536) + (var46 & 16777472);
                                this.field3032[var43] = var45 - var47 | var47 - (var47 >>> 8);
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
                        if (arg0 >= this.field3041 && arg0 < this.field3050 && var49 >= this.field3047 && var49 < this.field3022 && var24 < var21) {
                            this.field3032[this.field3051 * var49 + arg0] = arg4;
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
                            if (arg1 >= this.field3047 && arg1 < this.field3022 && var60 >= this.field3041 && var60 < this.field3050 && var24 < var21) {
                                int var61 = this.field3051 * arg1 + var60;
                                int var62 = this.field3032[var61];
                                int var63 = ((var62 & 16711935) * var59 >> 8 & 16711935) + ((var62 & 65280) * var59 >> 8 & 65280);
                                this.field3032[this.field3051 * arg1 + var60] = var58 + var63;
                            }
                            var52 += var54;
                            ++arg1;
                            int var64 = var24 + var57;
                            var24 = var64 % var23;
                        }
                    } else if (arg5 == 2) {
                        while (arg1 <= var55) {
                            int var65 = var52 >> 16;
                            if (arg1 >= this.field3047 && arg1 < this.field3022 && var65 >= this.field3041 && var65 < this.field3050 && var24 < var21) {
                                int var66 = this.field3051 * arg1 + var65;
                                int var67 = this.field3032[var66];
                                int var68 = arg4 + var67;
                                int var69 = (arg4 & 16711935) + (var67 & 16711935);
                                int var70 = (var68 - var69 & 65536) + (var69 & 16777472);
                                this.field3032[var66] = var68 - var70 | var70 - (var70 >>> 8);
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
                        if (arg1 >= this.field3047 && arg1 < this.field3022 && var72 >= this.field3041 && var72 < this.field3050 && var24 < var21) {
                            this.field3032[this.field3051 * arg1 + var72] = arg4;
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

    @OriginalMember(owner = "client!sa", name = "x", descriptor = "()V")
    public final void method1227() {
    }

    @OriginalMember(owner = "client!sa", name = "n", descriptor = "()Z")
    public final boolean method217() {
        return false;
    }

    @OriginalMember(owner = "client!sa", name = "l", descriptor = "()Z")
    public final boolean method292() {
        return false;
    }

    @OriginalMember(owner = "client!sa", name = "l", descriptor = "(I)Z")
    public final boolean method1443(int arg0) {
        return super.field7881.method963((byte) 41, arg0);
    }

    @OriginalMember(owner = "client!sa", name = "m", descriptor = "(I)Z")
    public final boolean method1444(int arg0) {
        return super.field7881.method962(arg0, 2904).field9641 || super.field7881.method962(arg0, 2904).field9635;
    }

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "(II)V")
    public final void method1257(int arg0, int arg1) throws class360 {
        if (this.field3014 != null && this.field3010 != null) {
            try {
                Graphics var3 = this.field3014.getGraphics();
                this.field3010.method86(var3, this.field3009, 0, arg0, 0, this.field3008, 3, arg1);
            } catch (Exception var4) {
                this.field3014.repaint();
            }
        } else {
            throw new IllegalStateException("off");
        }
    }

    @OriginalMember(owner = "client!sa", name = "pa", descriptor = "()V")
    public final void method204() {
        for (int var1 = 0; var1 < this.field3035.length; ++var1) {
            this.field3035[var1].field3724 = this.field3035[var1].field3716;
            this.field3035[var1].field3729 = false;
        }
    }

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "(II)V")
    public final void method281(int arg0, int arg1) {
        class261 var3 = this.method1446(Thread.currentThread());
        this.field3031 = arg0;
        this.field3054 = arg1;
        var3.field3710 = this.field3054 - 255;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lqt;[Lffa;Z)Lda;")
    public final class400 method322(class502 arg0, class676[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field9614;
            var5[var7] = arg1[var7].field9618;
            if (arg1[var7].field9616 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            if (var6) {
                return new class454(this, arg0, arg1, var4, var5);
            } else {
                return new class361(this, arg0, arg1, var4, var5);
            }
        } else if (var6) {
            throw new IllegalArgumentException("");
        } else {
            return new class180(this, arg0, arg1, var4, var5);
        }
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(IIIID)V")
    public final void method1249(int arg0, int arg1, int arg2, int arg3, double arg4) {
        int var7 = this.field3025 - arg2;
        int var8 = this.field3025 * arg1 + arg0;
        float[] var9 = this.field3024;
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

    @OriginalMember(owner = "client!sa", name = "v", descriptor = "()V")
    public final void method1232() {
    }

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "(I)V")
    public final void method340(int arg0) {
        this.field3016 = arg0;
        this.field3035 = new class261[this.field3016];
        for (int var2 = 0; var2 < this.field3016; ++var2) {
            this.field3035[var2] = new class261(this);
        }
    }

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "()Z")
    public final boolean method365() {
        return false;
    }

    @OriginalMember(owner = "client!sa", name = "E", descriptor = "()I")
    public final int method331() {
        return 0;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
    public final void method1225(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class360 {
        if (this.field3014 != null && this.field3010 != null) {
            try {
                Graphics var5 = this.field3014.getGraphics();
                for (int var6 = 0; var6 < arg1; ++var6) {
                    Rectangle var7 = arg0[var6];
                    if (var7.x + arg2 <= this.field3051 && var7.y + arg3 <= this.field3046 && var7.x + arg2 + var7.width > 0 && var7.y + arg3 + var7.height > 0) {
                        this.field3010.method86(var5, var7.width, var7.y, var7.x + arg2, var7.x, var7.height, 3, var7.y + arg3);
                    }
                }
            } catch (Exception var8) {
                this.field3014.repaint();
            }
        } else {
            throw new IllegalStateException("off");
        }
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method239(Canvas arg0) {
        if (this.field3014 == arg0) {
            this.method378((Canvas) null);
        }
        class711 var2 = (class711) this.field3015.method4020((long) arg0.hashCode(), (byte) -79);
        if (var2 != null) {
            var2.method2656((byte) 124);
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Z)V")
    public final void method274(boolean arg0) {
        this.field3038 = arg0;
        this.field3044.method2220(false);
    }

    @OriginalMember(owner = "client!sa", name = "ZA", descriptor = "(IFFFFF)V")
    public final void method363(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        this.field3021 = (int) (arg1 * 65535.0F);
        this.field3026 = (int) (arg2 * 65535.0F);
        float var7 = (float) Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4));
        this.field3033 = (int) (arg3 * 65535.0F / var7);
        this.field3034 = (int) (arg4 * 65535.0F / var7);
        this.field3049 = (int) (arg5 * 65535.0F / var7);
    }

    @OriginalMember(owner = "client!sa", name = "X", descriptor = "(I)V")
    public final void method369(int arg0) {
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method318(Canvas arg0, int arg1, int arg2) {
        class711 var4 = (class711) this.field3015.method4020((long) arg0.hashCode(), (byte) -127);
        if (var4 == null) {
            class711 var5 = class237.method1655(arg2, arg1, arg0, (byte) 92);
            this.field3015.method4022(var5, -101, (long) arg0.hashCode());
        } else {
            if (var4.field10016 != arg1 || var4.field10017 != arg2) {
                this.method314(arg0, arg1, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "KA", descriptor = "(IIII)V")
    public final void method297(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > this.field3051) {
            arg2 = this.field3051;
        }
        if (arg3 > this.field3046) {
            arg3 = this.field3046;
        }
        this.field3041 = arg0;
        this.field3050 = arg2;
        this.field3047 = arg1;
        this.field3022 = arg3;
        this.method1447();
    }

    @OriginalMember(owner = "client!sa", name = "C", descriptor = "(Z)V")
    public final void method235(boolean arg0) {
        class261 var2 = this.method1446(Thread.currentThread());
        var2.field3719 = arg0;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "([I)V")
    public final void method390(int[] arg0) {
        arg0[0] = this.field3051;
        arg0[1] = this.field3046;
    }

    @OriginalMember(owner = "client!sa", name = "B", descriptor = "()V")
    private final void method1445() {
        for (int var1 = 0; var1 < this.field3016; ++var1) {
            this.field3035[var1].method1731((byte) -102);
        }
        this.method328();
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Leea;I)V")
    public final void method216(class458 arg0, int arg1) {
        class261 var3 = this.method1446(Thread.currentThread());
        class310 var4 = arg0.field6514.field6354;
        for (class310 var5 = var4.field4188; var4 != var5; var5 = var5.field4188) {
            class95 var6 = (class95) var5;
            int var7 = var6.field1377 >> 12;
            int var8 = var6.field1374 >> 12;
            int var9 = var6.field1378 >> 12;
            float var10 = (float) var9 * this.field3028.field6373 + (float) var7 * this.field3028.field6379 + (float) var8 * this.field3028.field6381 + this.field3028.field6372;
            if (!(var10 < (float) this.field3031) && !(var10 > (float) var3.field3710)) {
                int var11 = (int) (((float) var9 * this.field3028.field6375 + (float) var7 * this.field3028.field6391 + (float) var8 * this.field3028.field6384 + this.field3028.field6383) * (float) this.field3017 / (float) arg1) + this.field3018;
                int var12 = (int) (((float) var9 * this.field3028.field6393 + (float) var7 * this.field3028.field6394 + (float) var8 * this.field3028.field6374 + this.field3028.field6367) * (float) this.field3027 / (float) arg1) + this.field3029;
                if (var11 >= this.field3041 && var11 <= this.field3050 && var12 >= this.field3047 && var12 <= this.field3022) {
                    if (var10 == 0.0F) {
                        var10 = 1.0F;
                    }
                    this.method1438(var6, var11, var12, (int) var10, (this.field3017 * var6.field1381 >> 12) / arg1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "q", descriptor = "()Z")
    public final boolean method211() {
        return true;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Ljava/lang/Runnable;)Llfa;")
    public final class261 method1446(Runnable arg0) {
        for (int var2 = 0; var2 < this.field3016; ++var2) {
            if (this.field3035[var2].field3713 == arg0) {
                return this.field3035[var2];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(I)V")
    public final void method383(int arg0) {
        this.field3035[arg0].method1733(Thread.currentThread(), (byte) 123);
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIII)V")
    public final void method1250(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!sa", name = "C", descriptor = "()V")
    private final void method1447() {
        this.field3019 = this.field3041 - this.field3018;
        this.field3040 = this.field3050 - this.field3018;
        this.field3036 = this.field3047 - this.field3029;
        this.field3043 = this.field3022 - this.field3029;
        for (int var1 = 0; var1 < this.field3016; ++var1) {
            class213 var5 = this.field3035[var1].field3739;
            var5.field3181 = this.field3018 - this.field3041;
            var5.field3182 = this.field3029 - this.field3047;
            var5.field3178 = this.field3050 - this.field3041;
            var5.field3186 = this.field3022 - this.field3047;
        }
        int var2 = this.field3051 * this.field3047 + this.field3041;
        for (int var3 = this.field3047; var3 < this.field3022; ++var3) {
            for (int var4 = 0; var4 < this.field3016; ++var4) {
                this.field3035[var4].field3739.field3190[var3 - this.field3047] = var2;
            }
            var2 += this.field3051;
        }
    }

    @OriginalMember(owner = "client!sa", name = "k", descriptor = "()I")
    public final int method270() {
        return 0;
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "()V")
    public final void method195() {
        if (this.field3012) {
            class512.method3110(true, false, false);
            this.field3012 = false;
        }
        this.field3010 = null;
        this.field3014 = null;
        this.field3009 = 0;
        this.field3008 = 0;
        this.field3015 = null;
        this.field3011 = true;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "([IIIIIZ)Ltd;")
    public final class515 method339(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        boolean var7 = false;
        int var8 = arg1;
        for (int var9 = 0; var9 < arg4; ++var9) {
            for (int var10 = 0; var10 < arg3; ++var10) {
                int var11 = arg0[var8++] >>> 24;
                if (var11 != 0 && var11 != 255) {
                    var7 = true;
                    return var7 ? new class110(this, arg0, arg1, arg2, arg3, arg4, arg5) : new class722(this, arg0, arg1, arg2, arg3, arg4, arg5);
                }
            }
        }
        return var7 ? new class110(this, arg0, arg1, arg2, arg3, arg4, arg5) : new class722(this, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!sa", name = "Y", descriptor = "()[I")
    public final int[] method247() {
        return new int[] { this.field3018, this.field3029, this.field3017, this.field3027 };
    }

    @OriginalMember(owner = "client!sa", name = "HA", descriptor = "(IIII[I)V")
    public final void method375(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        float var6 = (float) arg2 * this.field3028.field6373 + (float) arg0 * this.field3028.field6379 + (float) arg1 * this.field3028.field6381 + this.field3028.field6372;
        if (!(var6 < (float) this.field3031) && !(var6 > (float) this.field3054)) {
            int var7 = (int) (((float) arg2 * this.field3028.field6375 + (float) arg0 * this.field3028.field6391 + (float) arg1 * this.field3028.field6384 + this.field3028.field6383) * (float) this.field3017 / (float) arg3);
            int var8 = (int) (((float) arg2 * this.field3028.field6393 + (float) arg0 * this.field3028.field6394 + (float) arg1 * this.field3028.field6374 + this.field3028.field6367) * (float) this.field3027 / (float) arg3);
            if (var7 >= this.field3019 && var7 <= this.field3040 && var8 >= this.field3036 && var8 <= this.field3043) {
                arg4[0] = var7 - this.field3019;
                arg4[1] = var8 - this.field3036;
                arg4[2] = (int) var6;
            } else {
                arg4[0] = arg4[1] = arg4[2] = -1;
            }
        } else {
            arg4[0] = arg4[1] = arg4[2] = -1;
        }
    }

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "(I)V")
    public final void method260(int arg0) {
        int var2 = arg0 - this.field3013;
        for (Object var3 = this.field3044.method2210((byte) 89); var3 != null; var3 = this.field3044.method2211(0)) {
            class320 var4 = (class320) var3;
            if (var4.field4361) {
                var4.field4359 += var2;
                int var5 = var4.field4359 / 20;
                if (var5 > 0) {
                    class679 var6 = super.field7881.method962(var4.field4363, 2904);
                    var4.method1987(var6.field9638 * var2 * 50 / 1000, var6.field9640 * var2 * 50 / 1000);
                    var4.field4359 -= var5 * 20;
                }
                var4.field4361 = false;
            }
        }
        this.field3013 = arg0;
        this.field3048.method2207(5, 1);
        this.field3044.method2207(5, 1);
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ld;II)V")
    public class203(Canvas arg0, class267 arg1, int arg2, int arg3) {
        this(arg1);
        this.method318(arg0, arg2, arg3);
        this.method378(arg0);
    }

    @OriginalMember(owner = "client!sa", name = "L", descriptor = "(III)V")
    public final void method388(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field3035.length; ++var4) {
            class261 var5 = this.field3035[var4];
            var5.field3724 = arg0 & 16777215;
            int var6 = var5.field3724 >>> 16 & 255;
            if (var6 < 2) {
                var6 = 2;
            }
            int var7 = var5.field3724 >> 8 & 255;
            if (var7 < 2) {
                var7 = 2;
            }
            int var8 = var5.field3724 & 255;
            if (var8 < 2) {
                var8 = 2;
            }
            var5.field3724 = var6 << 16 | var7 << 8 | var8;
            if (arg1 < 0) {
                var5.field3725 = false;
            } else {
                var5.field3725 = true;
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "r", descriptor = "()Z")
    public final boolean method395() {
        return false;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIIIII)V")
    public final void method229(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class261 var8 = this.method1446(Thread.currentThread());
        class213 var9 = var8.field3739;
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
            int var23 = arg0 - var9.method1503();
            int var24 = arg1 - var9.method1505();
            int var25 = var19 + var23;
            int var26 = var23 - var20;
            int var27 = var17 + var23 - var20;
            int var28 = var17 + var23 + var19;
            int var29 = var21 + var24;
            int var30 = var24 - var22;
            int var31 = var18 + var24 - var22;
            int var32 = var18 + var24 + var21;
            if (arg6 == 0) {
                var9.field3187 = 0;
            } else {
                if (arg6 != 1) {
                    throw new IllegalArgumentException();
                }
                var9.field3187 = 255 - (arg4 >>> 24);
            }
            this.method235(false);
            var9.field3176 = var25 < 0 || var25 > var9.field3178 || var26 < 0 || var26 > var9.field3178 || var27 < 0 || var27 > var9.field3178;
            var9.method1509((float) var29, (float) var30, (float) var31, (float) var25, (float) var26, (float) var27, 100.0F, 100.0F, 100.0F, arg4);
            var9.field3176 = var25 < 0 || var25 > var9.field3178 || var27 < 0 || var27 > var9.field3178 || var28 < 0 || var28 > var9.field3178;
            var9.method1509((float) var29, (float) var31, (float) var32, (float) var25, (float) var27, (float) var28, 100.0F, 100.0F, 100.0F, arg4);
            this.method235(true);
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(FFF)V")
    public final void method1246(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!sa", name = "za", descriptor = "(IIIII)V")
    public final void method199(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var6 = arg1 - arg2;
        if (var6 < this.field3047) {
            var6 = this.field3047;
        }
        int var7 = arg1 + arg2 + 1;
        if (var7 > this.field3022) {
            var7 = this.field3022;
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
                if (var64 < this.field3041) {
                    var64 = this.field3041;
                }
                int var65 = arg0 + var10;
                if (var65 > this.field3050) {
                    var65 = this.field3050;
                }
                int var66 = this.field3051 * var8 + var64;
                for (int var67 = var64; var67 < var65; ++var67) {
                    this.field3032[var66++] = arg3;
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
                if (var60 < this.field3041) {
                    var60 = this.field3041;
                }
                int var61 = arg0 + var55;
                if (var61 > this.field3050 - 1) {
                    var61 = this.field3050 - 1;
                }
                int var62 = this.field3051 * var8 + var60;
                for (int var63 = var60; var63 <= var61; ++var63) {
                    this.field3032[var62++] = arg3;
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
                if (var28 < this.field3041) {
                    var28 = this.field3041;
                }
                int var29 = arg0 + var10;
                if (var29 > this.field3050) {
                    var29 = this.field3050;
                }
                int var30 = this.field3051 * var8 + var28;
                for (int var31 = var28; var31 < var29; ++var31) {
                    int var32 = this.field3032[var30];
                    int var33 = ((var32 & 16711935) * var16 >> 8 & 16711935) + ((var32 & 65280) * var16 >> 8 & 65280);
                    this.field3032[var30++] = var15 + var33;
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
                if (var22 < this.field3041) {
                    var22 = this.field3041;
                }
                int var23 = arg0 + var17;
                if (var23 > this.field3050 - 1) {
                    var23 = this.field3050 - 1;
                }
                int var24 = this.field3051 * var8 + var22;
                for (int var25 = var22; var25 <= var23; ++var25) {
                    int var26 = this.field3032[var24];
                    int var27 = ((var26 & 16711935) * var16 >> 8 & 16711935) + ((var26 & 65280) * var16 >> 8 & 65280);
                    this.field3032[var24++] = var15 + var27;
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
                if (var47 < this.field3041) {
                    var47 = this.field3041;
                }
                int var48 = arg0 + var10;
                if (var48 > this.field3050) {
                    var48 = this.field3050;
                }
                int var49 = this.field3051 * var8 + var47;
                for (int var50 = var47; var50 < var48; ++var50) {
                    int var51 = this.field3032[var49];
                    int var52 = arg3 + var51;
                    int var53 = (arg3 & 16711935) + (var51 & 16711935);
                    int var54 = (var52 - var53 & 65536) + (var53 & 16777472);
                    this.field3032[var49++] = var52 - var54 | var54 - (var54 >>> 8);
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
                if (var39 < this.field3041) {
                    var39 = this.field3041;
                }
                int var40 = arg0 + var34;
                if (var40 > this.field3050 - 1) {
                    var40 = this.field3050 - 1;
                }
                int var41 = this.field3051 * var8 + var39;
                for (int var42 = var39; var42 <= var40; ++var42) {
                    int var43 = this.field3032[var41];
                    int var44 = arg3 + var43;
                    int var45 = (arg3 & 16711935) + (var43 & 16711935);
                    int var46 = (var44 - var45 & 65536) + (var45 & 16777472);
                    this.field3032[var41++] = var44 - var46 | var46 - (var46 >>> 8);
                }
                ++var8;
                var38 += var35 + var35;
                var37 += var35++ + var35;
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(II[[I[[IIII)Ls;")
    public final class339 method311(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class10(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!sa", name = "i", descriptor = "()I")
    public final int method387() {
        return this.field3031;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(II[I[I)Laa;")
    public final class569 method219(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class211(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIIII)Lss;")
    public final class506 method298(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!sa", name = "da", descriptor = "(III[I)V")
    public final void method330(int arg0, int arg1, int arg2, int[] arg3) {
        float var5 = (float) arg2 * this.field3028.field6373 + (float) arg0 * this.field3028.field6379 + (float) arg1 * this.field3028.field6381 + this.field3028.field6372;
        if (!(var5 < (float) this.field3031) && !(var5 > (float) this.field3054)) {
            int var6 = (int) (((float) arg2 * this.field3028.field6375 + (float) arg0 * this.field3028.field6391 + (float) arg1 * this.field3028.field6384 + this.field3028.field6383) * (float) this.field3017 / var5);
            int var7 = (int) (((float) arg2 * this.field3028.field6393 + (float) arg0 * this.field3028.field6394 + (float) arg1 * this.field3028.field6374 + this.field3028.field6367) * (float) this.field3027 / var5);
            if (var6 >= this.field3019 && var6 <= this.field3040 && var7 >= this.field3036 && var7 <= this.field3043) {
                arg3[0] = var6 - this.field3019;
                arg3[1] = var7 - this.field3036;
                arg3[2] = (int) var5;
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!sa", name = "EA", descriptor = "(IIII)V")
    public final void method206(int arg0, int arg1, int arg2, int arg3) {
        class261 var5 = this.method1446(Thread.currentThread());
        var5.field3715 = arg0;
        var5.field3724 = arg1;
        var5.field3720 = arg2;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)Lza;")
    public final class254 method205(int arg0) {
        return null;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIIIIII)V")
    private final void method1448(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg0 >= this.field3041 && arg0 < this.field3050) {
            int var9 = this.field3051 * arg1 + arg0;
            int var10 = arg3 >>> 24;
            int var11 = arg5 + arg6;
            int var12 = arg7 % var11;
            if (arg4 != 0 && (arg4 != 1 || var10 != 255)) {
                if (arg4 == 1) {
                    int var13 = (var10 << 24) + ((arg3 & 16711935) * var10 >> 8 & 16711935) + ((arg3 & 65280) * var10 >> 8 & 65280);
                    int var14 = 256 - var10;
                    int var15 = 0;
                    while (var15 < arg2) {
                        if (arg1 + var15 >= this.field3047 && arg1 + var15 < this.field3022 && var12 < arg5) {
                            int var16 = this.field3051 * var15 + var9;
                            int var17 = this.field3032[var16];
                            int var18 = ((var17 & 16711935) * var14 >> 8 & 16711935) + ((var17 & 65280) * var14 >> 8 & 65280);
                            this.field3032[var16] = var13 + var18;
                        }
                        ++var15;
                        ++var12;
                        var12 %= var11;
                    }
                } else if (arg4 == 2) {
                    int var19 = 0;
                    while (var19 < arg2) {
                        if (arg1 + var19 >= this.field3047 && arg1 + var19 < this.field3022 && var12 < arg5) {
                            int var20 = this.field3051 * var19 + var9;
                            int var21 = this.field3032[var20];
                            int var22 = arg3 + var21;
                            int var23 = (arg3 & 16711935) + (var21 & 16711935);
                            int var24 = (var22 - var23 & 65536) + (var23 & 16777472);
                            this.field3032[var20] = var22 - var24 | var24 - (var24 >>> 8);
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
                    if (arg1 + var25 >= this.field3047 && arg1 + var25 < this.field3022 && var12 < arg5) {
                        this.field3032[this.field3051 * var25 + var9] = arg3;
                    }
                    ++var25;
                    ++var12;
                    var12 %= var11;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(II)Lrga;")
    public final class290 method1255(int arg0, int arg1) {
        return new class193(arg0, arg1);
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIIZ)Ltd;")
    public final class515 method359(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int[] var6 = new int[arg2 * arg3];
        int var7 = this.field3051 * arg1 + arg0;
        int var8 = this.field3051 - arg2;
        for (int var9 = 0; var9 < arg3; ++var9) {
            int var10 = arg2 * var9;
            for (int var11 = 0; var11 < arg2; ++var11) {
                var6[var10 + var11] = this.field3032[var7++];
            }
            var7 += var8;
        }
        if (arg4) {
            return new class110(this, var6, arg2, arg3);
        } else {
            return new class722(this, var6, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!sa", name = "n", descriptor = "(I)[I")
    public final int[] method1449(int arg0) {
        class348 var2 = this.field3044;
        class320 var3;
        synchronized (this.field3044) {
            var3 = (class320) this.field3044.method2216(0, (long) arg0 | Long.MIN_VALUE);
            if (var3 == null) {
                if (!super.field7881.method963((byte) 41, arg0)) {
                    return null;
                }
                class679 var5 = super.field7881.method962(arg0, 2904);
                int var6 = !var5.field9636 && !this.field3038 ? this.field3052 : 64;
                var3 = new class320(arg0, var6, super.field7881.method966(var6, false, 0.7F, var6, true, arg0), var5.field9632 != 1);
                this.field3044.method2213((byte) -16, (long) arg0 | Long.MIN_VALUE, var3);
            }
        }
        var3.field4361 = true;
        return var3.method1989();
    }

    @OriginalMember(owner = "client!sa", name = "ya", descriptor = "()V")
    public final void method1235() {
        if (this.field3041 == 0 && this.field3051 == this.field3050 && this.field3047 == 0 && this.field3046 == this.field3022) {
            int var1 = this.field3024.length;
            int var2 = var1 - (var1 & 7);
            int var3 = 0;
            while (var3 < var2) {
                this.field3024[var3++] = 2.1474836E9F;
                this.field3024[var3++] = 2.1474836E9F;
                this.field3024[var3++] = 2.1474836E9F;
                this.field3024[var3++] = 2.1474836E9F;
                this.field3024[var3++] = 2.1474836E9F;
                this.field3024[var3++] = 2.1474836E9F;
                this.field3024[var3++] = 2.1474836E9F;
                this.field3024[var3++] = 2.1474836E9F;
            }
            while (var3 < var1) {
                this.field3024[var3++] = 2.1474836E9F;
            }
        } else {
            int var4 = this.field3050 - this.field3041;
            int var5 = this.field3022 - this.field3047;
            int var6 = this.field3051 - var4;
            int var7 = this.field3051 * this.field3047 + this.field3041;
            int var8 = var4 >> 3;
            int var9 = var4 & 7;
            int var10 = var7 - 1;
            for (int var11 = -var5; var11 < 0; ++var11) {
                if (var8 > 0) {
                    int var12 = var8;
                    do {
                        ++var10;
                        this.field3024[var10] = 2.1474836E9F;
                        ++var10;
                        this.field3024[var10] = 2.1474836E9F;
                        ++var10;
                        this.field3024[var10] = 2.1474836E9F;
                        ++var10;
                        this.field3024[var10] = 2.1474836E9F;
                        ++var10;
                        this.field3024[var10] = 2.1474836E9F;
                        ++var10;
                        this.field3024[var10] = 2.1474836E9F;
                        ++var10;
                        this.field3024[var10] = 2.1474836E9F;
                        ++var10;
                        this.field3024[var10] = 2.1474836E9F;
                        --var12;
                    } while (var12 > 0);
                }
                if (var9 > 0) {
                    int var13 = var9;
                    do {
                        ++var10;
                        this.field3024[var10] = 2.1474836E9F;
                        --var13;
                    } while (var13 > 0);
                }
                var10 += var6;
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "o", descriptor = "(I)[I")
    public final int[] method1450(int arg0) {
        class348 var2 = this.field3044;
        class320 var3;
        synchronized (this.field3044) {
            var3 = (class320) this.field3044.method2216(0, (long) arg0);
            if (var3 == null) {
                if (!super.field7881.method963((byte) 41, arg0)) {
                    return null;
                }
                class679 var5 = super.field7881.method962(arg0, 2904);
                int var6 = !var5.field9636 && !this.field3038 ? this.field3052 : 64;
                var3 = new class320(arg0, var6, super.field7881.method964(-90, true, var6, arg0, var6, 0.7F), var5.field9632 != 1);
                this.field3044.method2213((byte) -16, (long) arg0, var3);
            }
        }
        var3.field4361 = true;
        return var3.method1989();
    }

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "()Z")
    public final boolean method207() {
        return false;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Leea;)V")
    public final void method214(class458 arg0) {
        class261 var2 = this.method1446(Thread.currentThread());
        class310 var3 = arg0.field6514.field6354;
        for (class310 var4 = var3.field4188; var3 != var4; var4 = var4.field4188) {
            class95 var5 = (class95) var4;
            int var6 = var5.field1377 >> 12;
            int var7 = var5.field1374 >> 12;
            int var8 = var5.field1378 >> 12;
            float var9 = (float) var8 * this.field3028.field6373 + (float) var6 * this.field3028.field6379 + (float) var7 * this.field3028.field6381 + this.field3028.field6372;
            if (!(var9 < (float) this.field3031) && !(var9 > (float) var2.field3710)) {
                int var10 = (int) (((float) var8 * this.field3028.field6375 + (float) var6 * this.field3028.field6391 + (float) var7 * this.field3028.field6384 + this.field3028.field6383) * (float) this.field3017 / var9) + this.field3018;
                int var11 = (int) (((float) var8 * this.field3028.field6393 + (float) var6 * this.field3028.field6394 + (float) var7 * this.field3028.field6374 + this.field3028.field6367) * (float) this.field3027 / var9) + this.field3029;
                if (var10 >= this.field3041 && var10 <= this.field3050 && var11 >= this.field3047 && var11 <= this.field3022) {
                    if (var9 == 0.0F) {
                        var9 = 1.0F;
                    }
                    this.method1438(var5, var10, var11, (int) var9, (int) ((float) (this.field3017 * var5.field1381 >> 12) / var9));
                }
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "()Lsk;")
    public final class121 method304() {
        return this.field3028;
    }

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "(II)Lup;")
    public final class239 method1253(int arg0, int arg1) {
        return this.method377(arg0, arg1, false);
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(II)I")
    public final int method374(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "()V")
    public final void method1244() {
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method1451(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg3 != 0 && arg4 != 0) {
            if (arg6 != 65535 && !super.field7881.method962(arg6, 2904).field9639) {
                if (this.field3056 != arg6) {
                    class515 var11 = (class515) this.field3048.method2216(0, (long) arg6);
                    if (var11 == null) {
                        int[] var12 = this.method1449(arg6);
                        if (var12 == null) {
                            return;
                        }
                        int var13 = this.method1441(arg6) ? 64 : this.field3052;
                        var11 = this.method3265(var12, var13, var13, var13, 0, (byte) 50);
                        this.field3048.method2213((byte) -16, (long) arg6, var11);
                    }
                    this.field3056 = arg6;
                    this.field3055 = var11;
                }
                ((class106) this.field3055).method785(arg0 - arg3, arg1 - arg4, arg2, arg3 << 1, arg4 << 1, arg8, arg7, arg9, 1);
            } else {
                this.method1440(arg0, arg1, arg2, arg3, arg7, arg9);
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "p", descriptor = "()V")
    public final void method1224() {
        if (this.field3014 != null) {
            this.field3032 = this.field3010.field10015;
            this.field3051 = this.field3010.field10016;
            this.field3046 = this.field3010.field10017;
            this.field3024 = this.field3042;
            this.field3025 = this.field3039;
            this.field3045 = this.field3023;
        } else {
            this.field3051 = 1;
            this.field3046 = 1;
            this.field3032 = null;
            this.field3025 = 1;
            this.field3045 = 1;
            this.field3024 = null;
        }
        this.field3030 = null;
        this.method1445();
    }

    @OriginalMember(owner = "client!sa", name = "K", descriptor = "([I)V")
    public final void method358(int[] arg0) {
        arg0[0] = this.field3041;
        arg0[1] = this.field3047;
        arg0[2] = this.field3050;
        arg0[3] = this.field3022;
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(IIIIII)V")
    public final void method305(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method357(arg0, arg1, arg2, arg4, arg5);
        this.method357(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method268(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
        this.method268(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
    }

    @OriginalMember(owner = "client!sa", name = "y", descriptor = "()V")
    public final void method1222() {
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(IIIIIIII)V")
    private final void method1452(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 >= this.field3047 && arg1 < this.field3022) {
            int var9 = this.field3051 * arg1 + arg0;
            int var10 = arg3 >>> 24;
            int var11 = arg5 + arg6;
            int var12 = arg7 % var11;
            if (arg4 != 0 && (arg4 != 1 || var10 != 255)) {
                if (arg4 == 1) {
                    int var13 = (var10 << 24) + ((arg3 & 16711935) * var10 >> 8 & 16711935) + ((arg3 & 65280) * var10 >> 8 & 65280);
                    int var14 = 256 - var10;
                    int var15 = 0;
                    while (var15 < arg2) {
                        if (arg0 + var15 >= this.field3041 && arg0 + var15 < this.field3050 && var12 < arg5) {
                            int var16 = this.field3032[var9 + var15];
                            int var17 = ((var16 & 16711935) * var14 >> 8 & 16711935) + ((var16 & 65280) * var14 >> 8 & 65280);
                            this.field3032[var9 + var15] = var13 + var17;
                        }
                        ++var15;
                        ++var12;
                        var12 %= var11;
                    }
                } else if (arg4 == 2) {
                    int var18 = 0;
                    while (var18 < arg2) {
                        if (arg0 + var18 >= this.field3041 && arg0 + var18 < this.field3050 && var12 < arg5) {
                            int var19 = this.field3032[var9 + var18];
                            int var20 = arg3 + var19;
                            int var21 = (arg3 & 16711935) + (var19 & 16711935);
                            int var22 = (var20 - var21 & 65536) + (var21 & 16777472);
                            this.field3032[var9 + var18] = var20 - var22 | var22 - (var22 >>> 8);
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
                    if (arg0 + var23 >= this.field3041 && arg0 + var23 < this.field3050 && var12 < arg5) {
                        this.field3032[var9 + var23] = arg3;
                    }
                    ++var23;
                    ++var12;
                    var12 %= var11;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIIIF)Lwh;")
    public final class40 method309(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return null;
    }

    @OriginalMember(owner = "client!sa", name = "XA", descriptor = "()I")
    public final int method227() {
        return this.field3054;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(I[Lwh;)V")
    public final void method277(int arg0, class40[] arg1) {
    }

    @OriginalMember(owner = "client!sa", name = "u", descriptor = "()Lsk;")
    public final class121 method348() {
        return new class447();
    }

    @OriginalMember(owner = "client!sa", name = "p", descriptor = "(I)I")
    public final int method1453(int arg0) {
        return super.field7881.method962(arg0, 2904).field9632;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lfu;IIII)Lka;")
    public final class282 method404(class637 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class197(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!sa", name = "g", descriptor = "(I)V")
    public final void method379(int arg0) {
        class197.field2941 = arg0;
        class197.field2939 = arg0;
        if (this.field3016 > 1) {
            throw new IllegalStateException("No MT");
        } else {
            this.method340(this.field3016);
            this.method383(0);
        }
    }

    @OriginalMember(owner = "client!sa", name = "A", descriptor = "()Lfc;")
    public final class729 method1229() {
        return new class729(0, "Pure Java", 1, "CPU", 0L);
    }

    @OriginalMember(owner = "client!sa", name = "Q", descriptor = "(IIIIII[BII)V")
    public final void method267(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        if (arg2 > 0 && arg3 > 0) {
            int var10 = 0;
            int var11 = 0;
            int var12 = (arg7 << 16) / arg2;
            int var13 = (arg6.length / arg7 << 16) / arg3;
            int var14 = this.field3051 * arg1 + arg0;
            int var15 = this.field3051 - arg2;
            if (arg1 + arg3 > this.field3022) {
                arg3 -= arg1 + arg3 - this.field3022;
            }
            if (arg1 < this.field3047) {
                int var16 = this.field3047 - arg1;
                arg3 -= var16;
                var14 += this.field3051 * var16;
                var11 += var13 * var16;
            }
            if (arg0 + arg2 > this.field3050) {
                int var17 = arg0 + arg2 - this.field3050;
                arg2 -= var17;
                var15 += var17;
            }
            if (arg0 < this.field3041) {
                int var18 = this.field3041 - arg0;
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
                            int var28 = this.field3032[var14];
                            this.field3032[var14++] = ((var25 & 16711935) * var26 + (var28 & 16711935) * var27 & -16711936) + ((var25 & 65280) * var26 + (var28 & 65280) * var27 & 16711680) >> 8;
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
                                int var34 = this.field3032[var14];
                                int var35 = var33 + var34;
                                int var36 = (var33 & 16711935) + (var34 & 16711935);
                                int var37 = (var35 - var36 & 65536) + (var36 & 16777472);
                                this.field3032[var14++] = var35 - var37 | var37 - (var37 >>> 8);
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
                            this.field3032[var14++] = arg5;
                        } else {
                            this.field3032[var14++] = arg4;
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

    @OriginalMember(owner = "client!sa", name = "DA", descriptor = "(IIII)V")
    public final void method398(int arg0, int arg1, int arg2, int arg3) {
        this.field3018 = arg0;
        this.field3029 = arg1;
        this.field3017 = arg2;
        this.field3027 = arg3;
        this.method1447();
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(Z)V")
    public final void method1230(boolean arg0) {
    }

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "(II)I")
    public final int method300(int arg0, int arg1) {
        int var3 = arg0 | 133120;
        return var3 & arg1 ^ arg1;
    }

    @OriginalMember(owner = "client!sa", name = "j", descriptor = "()Z")
    public final boolean method1242() {
        return false;
    }

    @OriginalMember(owner = "client!sa", name = "s", descriptor = "()Lsk;")
    public final class121 method342() {
        class261 var1 = this.method1446(Thread.currentThread());
        return var1.field3722;
    }

    @OriginalMember(owner = "client!sa", name = "aa", descriptor = "(IIIIII)V")
    public final void method397(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < this.field3041) {
            arg2 -= this.field3041 - arg0;
            arg0 = this.field3041;
        }
        if (arg1 < this.field3047) {
            arg3 -= this.field3047 - arg1;
            arg1 = this.field3047;
        }
        if (arg0 + arg2 > this.field3050) {
            arg2 = this.field3050 - arg0;
        }
        if (arg1 + arg3 > this.field3022) {
            arg3 = this.field3022 - arg1;
        }
        if (arg2 > 0 && arg3 > 0 && arg0 <= this.field3050 && arg1 <= this.field3022) {
            int var7 = this.field3051 - arg2;
            int var8 = this.field3051 * arg1 + arg0;
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
                            this.field3032[var24] = arg4;
                            ++var24;
                            this.field3032[var24] = arg4;
                            ++var24;
                            this.field3032[var24] = arg4;
                            ++var24;
                            this.field3032[var24] = arg4;
                            ++var24;
                            this.field3032[var24] = arg4;
                            ++var24;
                            this.field3032[var24] = arg4;
                            ++var24;
                            this.field3032[var24] = arg4;
                            ++var24;
                            this.field3032[var24] = arg4;
                            --var26;
                        } while (var26 > 0);
                    }
                    if (var23 > 0) {
                        int var27 = var23;
                        do {
                            ++var24;
                            this.field3032[var24] = arg4;
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
                        int var14 = this.field3032[var8];
                        int var15 = ((var14 & 16711935) * var11 >> 8 & 16711935) + (((var14 & -16711936) >>> 8) * var11 & -16711936);
                        this.field3032[var8++] = var10 + var15;
                    }
                    var8 += var7;
                }
            } else if (arg5 != 2) {
                throw new IllegalArgumentException();
            } else {
                for (int var16 = 0; var16 < arg3; ++var16) {
                    for (int var17 = -arg2; var17 < 0; ++var17) {
                        int var18 = this.field3032[var8];
                        int var19 = arg4 + var18;
                        int var20 = (arg4 & 16711935) + (var18 & 16711935);
                        int var21 = (var19 - var20 & 65536) + (var20 & 16777472);
                        this.field3032[var8++] = var19 - var21 | var21 - (var21 >>> 8);
                    }
                    var8 += var7;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Ldv;)V")
    public final void method1239(class86 arg0) {
        class663 var2 = (class663) arg0;
        this.field3051 = var2.field9464;
        this.field3046 = var2.field9468;
        this.field3032 = var2.field9466;
        this.field3030 = var2;
        this.field3025 = var2.field9464;
        this.field3045 = var2.field9468;
        this.field3024 = var2.field9472;
        this.method1445();
    }

    @OriginalMember(owner = "client!sa", name = "o", descriptor = "()Z")
    public final boolean method1234() {
        return false;
    }

    @OriginalMember(owner = "client!sa", name = "JA", descriptor = "(IIIIII)I")
    public final int method228(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = 0;
        float var8 = (float) arg2 * this.field3028.field6373 + (float) arg0 * this.field3028.field6379 + (float) arg1 * this.field3028.field6381 + this.field3028.field6372;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        float var9 = (float) arg5 * this.field3028.field6373 + (float) arg3 * this.field3028.field6379 + (float) arg4 * this.field3028.field6381 + this.field3028.field6372;
        if (var9 < 1.0F) {
            var9 = 1.0F;
        }
        if (var8 < (float) this.field3031 && var9 < (float) this.field3031) {
            var7 |= 16;
        } else if (var8 > (float) this.field3054 && var9 > (float) this.field3054) {
            var7 |= 32;
        }
        int var10 = (int) (((float) arg2 * this.field3028.field6375 + (float) arg0 * this.field3028.field6391 + (float) arg1 * this.field3028.field6384 + this.field3028.field6383) * (float) this.field3017 / var8);
        int var11 = (int) (((float) arg5 * this.field3028.field6375 + (float) arg3 * this.field3028.field6391 + (float) arg4 * this.field3028.field6384 + this.field3028.field6383) * (float) this.field3017 / var9);
        if (var10 < this.field3019 && var11 < this.field3019) {
            var7 |= 1;
        } else if (var10 > this.field3040 && var11 > this.field3040) {
            var7 |= 2;
        }
        int var12 = (int) (((float) arg2 * this.field3028.field6393 + (float) arg0 * this.field3028.field6394 + (float) arg1 * this.field3028.field6374 + this.field3028.field6367) * (float) this.field3027 / var8);
        int var13 = (int) (((float) arg5 * this.field3028.field6393 + (float) arg3 * this.field3028.field6394 + (float) arg4 * this.field3028.field6374 + this.field3028.field6367) * (float) this.field3027 / var9);
        if (var12 < this.field3036 && var13 < this.field3036) {
            var7 |= 4;
        } else if (var12 > this.field3043 && var13 > this.field3043) {
            var7 |= 8;
        }
        return var7;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lss;)V")
    public final void method353(class506 arg0) {
    }
}
