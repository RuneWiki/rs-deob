import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nia")
public class class30 extends class473 {

    @OriginalMember(owner = "client!nia", name = "A", descriptor = "Z")
    private boolean field244;

    @OriginalMember(owner = "client!nia", name = "y", descriptor = "Z")
    private boolean field242;

    @OriginalMember(owner = "client!nia", name = "w", descriptor = "Llk;")
    private class638 field240;

    @OriginalMember(owner = "client!nia", name = "I", descriptor = "I")
    public int field252;

    @OriginalMember(owner = "client!nia", name = "Q", descriptor = "Z")
    private boolean field260;

    @OriginalMember(owner = "client!nia", name = "R", descriptor = "I")
    private int field261;

    @OriginalMember(owner = "client!nia", name = "O", descriptor = "I")
    public int field258;

    @OriginalMember(owner = "client!nia", name = "L", descriptor = "I")
    public int field255;

    @OriginalMember(owner = "client!nia", name = "F", descriptor = "I")
    public int field249;

    @OriginalMember(owner = "client!nia", name = "M", descriptor = "I")
    public int field256;

    @OriginalMember(owner = "client!nia", name = "T", descriptor = "I")
    public int field263;

    @OriginalMember(owner = "client!nia", name = "Z", descriptor = "I")
    private int field268;

    @OriginalMember(owner = "client!nia", name = "H", descriptor = "I")
    public int field251;

    @OriginalMember(owner = "client!nia", name = "db", descriptor = "I")
    public int field272;

    @OriginalMember(owner = "client!nia", name = "hb", descriptor = "I")
    public int field276;

    @OriginalMember(owner = "client!nia", name = "U", descriptor = "I")
    public int field264;

    @OriginalMember(owner = "client!nia", name = "S", descriptor = "I")
    public int field262;

    @OriginalMember(owner = "client!nia", name = "qb", descriptor = "I")
    public int field285;

    @OriginalMember(owner = "client!nia", name = "jb", descriptor = "Laf;")
    private class39 field278;

    @OriginalMember(owner = "client!nia", name = "tb", descriptor = "I")
    private int field288;

    @OriginalMember(owner = "client!nia", name = "N", descriptor = "Laf;")
    private class39 field257;

    @OriginalMember(owner = "client!nia", name = "J", descriptor = "Loda;")
    public class737 field253;

    @OriginalMember(owner = "client!nia", name = "C", descriptor = "I")
    private int field246;

    @OriginalMember(owner = "client!nia", name = "z", descriptor = "I")
    private int field243;

    @OriginalMember(owner = "client!nia", name = "D", descriptor = "I")
    private int field247;

    @OriginalMember(owner = "client!nia", name = "E", descriptor = "I")
    private int field248;

    @OriginalMember(owner = "client!nia", name = "K", descriptor = "I")
    public int field254;

    @OriginalMember(owner = "client!nia", name = "P", descriptor = "I")
    private int field259;

    @OriginalMember(owner = "client!nia", name = "W", descriptor = "I")
    public int field265;

    @OriginalMember(owner = "client!nia", name = "X", descriptor = "I")
    public int field266;

    @OriginalMember(owner = "client!nia", name = "Y", descriptor = "I")
    private int field267;

    @OriginalMember(owner = "client!nia", name = "ab", descriptor = "I")
    public int field269;

    @OriginalMember(owner = "client!nia", name = "cb", descriptor = "I")
    public int field271;

    @OriginalMember(owner = "client!nia", name = "eb", descriptor = "I")
    public int field273;

    @OriginalMember(owner = "client!nia", name = "gb", descriptor = "I")
    public int field275;

    @OriginalMember(owner = "client!nia", name = "ib", descriptor = "I")
    public int field277;

    @OriginalMember(owner = "client!nia", name = "kb", descriptor = "I")
    private int field279;

    @OriginalMember(owner = "client!nia", name = "mb", descriptor = "I")
    private int field281;

    @OriginalMember(owner = "client!nia", name = "nb", descriptor = "I")
    public int field282;

    @OriginalMember(owner = "client!nia", name = "ob", descriptor = "I")
    public int field283;

    @OriginalMember(owner = "client!nia", name = "pb", descriptor = "I")
    public int field284;

    @OriginalMember(owner = "client!nia", name = "sb", descriptor = "Lho;")
    private class318 field287;

    @OriginalMember(owner = "client!nia", name = "B", descriptor = "Lfb;")
    public class540 field245;

    @OriginalMember(owner = "client!nia", name = "lb", descriptor = "Lgja;")
    private class651 field280;

    @OriginalMember(owner = "client!nia", name = "x", descriptor = "Ljava/awt/Canvas;")
    private Canvas field241;

    @OriginalMember(owner = "client!nia", name = "fb", descriptor = "[F")
    public float[] field274;

    @OriginalMember(owner = "client!nia", name = "rb", descriptor = "[F")
    public float[] field286;

    @OriginalMember(owner = "client!nia", name = "bb", descriptor = "[I")
    public int[] field270;

    @OriginalMember(owner = "client!nia", name = "G", descriptor = "[Lmp;")
    private class563[] field250;

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(Lhda;I)V", line = 4)
    public final void method134(class714 arg0, int arg1) {
        class563 var3 = this.method256(Thread.currentThread());
        class309 var4 = arg0.field9929.field3960;
        for (class309 var5 = var4.field4457; var4 != var5; var5 = var5.field4457) {
            class216 var6 = (class216) var5;
            int var7 = var6.field2979 >> 12;
            int var8 = var6.field2982 >> 12;
            int var9 = var6.field2978 >> 12;
            float var10 = (float) var9 * this.field253.field10144 + (float) var7 * this.field253.field10140 + (float) var8 * this.field253.field10146 + this.field253.field10152;
            if (!(var10 < (float) this.field252) && !(var10 > (float) var3.field7922)) {
                int var11 = (int) (((float) var9 * this.field253.field10143 + (float) var7 * this.field253.field10149 + (float) var8 * this.field253.field10147 + this.field253.field10148) * (float) this.field249 / (float) arg1) + this.field273;
                int var12 = (int) (((float) var9 * this.field253.field10159 + (float) var7 * this.field253.field10153 + (float) var8 * this.field253.field10163 + this.field253.field10164) * (float) this.field272 / (float) arg1) + this.field282;
                if (var11 >= this.field258 && var11 <= this.field264 && var12 >= this.field276 && var12 <= this.field256) {
                    if (var10 == 0.0F) {
                        var10 = 1.0F;
                    }
                    this.method149(var6, var11, var12, (int) var10, (this.field249 * var6.field2975 >> 12) / arg1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!nia", name = "q", descriptor = "()Z", line = 43)
    public final boolean method135() {
        return true;
    }

    @OriginalMember(owner = "client!nia", name = "I", descriptor = "()I", line = 47)
    public final int method136() {
        int var1 = this.field268;
        this.field268 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!nia", name = "e", descriptor = "(IIIIII)V", line = 53)
    private final void method137(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 < 0) {
            arg3 = -arg3;
        }
        int var7 = arg1 - arg3;
        if (var7 < this.field276) {
            var7 = this.field276;
        }
        int var8 = arg1 + arg3 + 1;
        if (var8 > this.field256) {
            var8 = this.field256;
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
                if (var65 < this.field258) {
                    var65 = this.field258;
                }
                int var66 = arg0 + var11;
                if (var66 > this.field264) {
                    var66 = this.field264;
                }
                int var67 = this.field275 * var9 + var65;
                for (int var68 = var65; var68 < var66; ++var68) {
                    if ((float) arg2 < this.field274[var67]) {
                        this.field270[var67] = arg4;
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
                if (var61 < this.field258) {
                    var61 = this.field258;
                }
                int var62 = arg0 + var56;
                if (var62 > this.field264 - 1) {
                    var62 = this.field264 - 1;
                }
                int var63 = this.field275 * var9 + var61;
                for (int var64 = var61; var64 <= var62; ++var64) {
                    if ((float) arg2 < this.field274[var63]) {
                        this.field270[var63] = arg4;
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
                if (var29 < this.field258) {
                    var29 = this.field258;
                }
                int var30 = arg0 + var11;
                if (var30 > this.field264) {
                    var30 = this.field264;
                }
                int var31 = this.field275 * var9 + var29;
                for (int var32 = var29; var32 < var30; ++var32) {
                    if ((float) arg2 < this.field274[var31]) {
                        int var33 = this.field270[var31];
                        int var34 = ((var33 & 16711935) * var17 >> 8 & 16711935) + ((var33 & 65280) * var17 >> 8 & 65280);
                        this.field270[var31] = var16 + var34;
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
                if (var23 < this.field258) {
                    var23 = this.field258;
                }
                int var24 = arg0 + var18;
                if (var24 > this.field264 - 1) {
                    var24 = this.field264 - 1;
                }
                int var25 = this.field275 * var9 + var23;
                for (int var26 = var23; var26 <= var24; ++var26) {
                    if ((float) arg2 < this.field274[var25]) {
                        int var27 = this.field270[var25];
                        int var28 = ((var27 & 16711935) * var17 >> 8 & 16711935) + ((var27 & 65280) * var17 >> 8 & 65280);
                        this.field270[var25] = var16 + var28;
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
                if (var48 < this.field258) {
                    var48 = this.field258;
                }
                int var49 = arg0 + var11;
                if (var49 > this.field264) {
                    var49 = this.field264;
                }
                int var50 = this.field275 * var9 + var48;
                for (int var51 = var48; var51 < var49; ++var51) {
                    if ((float) arg2 < this.field274[var50]) {
                        int var52 = this.field270[var50];
                        int var53 = arg4 + var52;
                        int var54 = (arg4 & 16711935) + (var52 & 16711935);
                        int var55 = (var53 - var54 & 65536) + (var54 & 16777472);
                        this.field270[var50] = var53 - var55 | var55 - (var55 >>> 8);
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
                if (var40 < this.field258) {
                    var40 = this.field258;
                }
                int var41 = arg0 + var35;
                if (var41 > this.field264 - 1) {
                    var41 = this.field264 - 1;
                }
                int var42 = this.field275 * var9 + var40;
                for (int var43 = var40; var43 <= var41; ++var43) {
                    if ((float) arg2 < this.field274[var42]) {
                        int var44 = this.field270[var42];
                        int var45 = arg4 + var44;
                        int var46 = (arg4 & 16711935) + (var44 & 16711935);
                        int var47 = (var45 - var46 & 65536) + (var46 & 16777472);
                        this.field270[var42] = var45 - var47 | var47 - (var47 >>> 8);
                    }
                    ++var42;
                }
                ++var9;
                var39 += var36 + var36;
                var38 += var36++ + var36;
            }
        }
    }

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(IIIIIF)Lsca;", line = 369)
    public final class251 method138(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return null;
    }

    @OriginalMember(owner = "client!nia", name = "b", descriptor = "(IIIIII)V", line = 372)
    public final void method139(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg2 - arg0;
        int var8 = arg3 - arg1;
        if (var8 == 0) {
            if (var7 >= 0) {
                this.method152(arg0, arg1, var7 + 1, arg4, arg5);
            } else {
                this.method152(arg0 + var7, arg1, -var7 + 1, arg4, arg5);
            }
        } else if (var7 == 0) {
            if (var8 >= 0) {
                this.method207(arg0, arg1, var8 + 1, arg4, arg5);
            } else {
                this.method207(arg0, arg1 + var8, -var8 + 1, arg4, arg5);
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
                if (arg0 < this.field258) {
                    var10 += (this.field258 - arg0) * var12;
                    arg0 = this.field258;
                }
                if (var13 >= this.field264) {
                    var13 = this.field264 - 1;
                }
                int var14 = arg4 >>> 24;
                if (arg5 != 0 && (arg5 != 1 || var14 != 255)) {
                    if (arg5 == 1) {
                        int var15 = (var14 << 24) + ((arg4 & 16711935) * var14 >> 8 & 16711935) + ((arg4 & 65280) * var14 >> 8 & 65280);
                        int var16 = 256 - var14;
                        while (arg0 <= var13) {
                            int var17 = var10 >> 16;
                            if (var17 >= this.field276 && var17 < this.field256) {
                                int var18 = this.field275 * var17 + arg0;
                                int var19 = this.field270[var18];
                                int var20 = ((var19 & 16711935) * var16 >> 8 & 16711935) + ((var19 & 65280) * var16 >> 8 & 65280);
                                this.field270[var18] = var15 + var20;
                            }
                            var10 += var12;
                            ++arg0;
                        }
                    } else if (arg5 == 2) {
                        while (arg0 <= var13) {
                            int var21 = var10 >> 16;
                            if (var21 >= this.field276 && var21 < this.field256) {
                                int var22 = this.field275 * var21 + arg0;
                                int var23 = this.field270[var22];
                                int var24 = arg4 + var23;
                                int var25 = (arg4 & 16711935) + (var23 & 16711935);
                                int var26 = (var24 - var25 & 65536) + (var25 & 16777472);
                                this.field270[var22] = var24 - var26 | var26 - (var26 >>> 8);
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
                        if (var27 >= this.field276 && var27 < this.field256) {
                            this.field270[this.field275 * var27 + arg0] = arg4;
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
                if (arg1 < this.field276) {
                    var29 += (this.field276 - arg1) * var31;
                    arg1 = this.field276;
                }
                if (var32 >= this.field256) {
                    var32 = this.field256 - 1;
                }
                int var33 = arg4 >>> 24;
                if (arg5 == 0 || arg5 == 1 && var33 == 255) {
                    while (arg1 <= var32) {
                        int var46 = var29 >> 16;
                        if (var46 >= this.field258 && var46 < this.field264) {
                            this.field270[this.field275 * arg1 + var46] = arg4;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 1) {
                    int var34 = (var33 << 24) + ((arg4 & 16711935) * var33 >> 8 & 16711935) + ((arg4 & 65280) * var33 >> 8 & 65280);
                    int var35 = 256 - var33;
                    while (arg1 <= var32) {
                        int var36 = var29 >> 16;
                        if (var36 >= this.field258 && var36 < this.field264) {
                            int var37 = this.field275 * arg1 + var36;
                            int var38 = this.field270[var37];
                            int var39 = ((var38 & 16711935) * var35 >> 8 & 16711935) + ((var38 & 65280) * var35 >> 8 & 65280);
                            this.field270[this.field275 * arg1 + var36] = var34 + var39;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 2) {
                    while (arg1 <= var32) {
                        int var40 = var29 >> 16;
                        if (var40 >= this.field258 && var40 < this.field264) {
                            int var41 = this.field275 * arg1 + var40;
                            int var42 = this.field270[var41];
                            int var43 = arg4 + var42;
                            int var44 = (arg4 & 16711935) + (var42 & 16711935);
                            int var45 = (var43 - var44 & 65536) + (var44 & 16777472);
                            this.field270[var41] = var43 - var45 | var45 - (var45 >>> 8);
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

    @OriginalMember(owner = "client!nia", name = "f", descriptor = "(II)V", line = 586)
    public final void method140(int arg0, int arg1) {
        class563 var3 = this.method256(Thread.currentThread());
        this.field252 = arg0;
        this.field262 = arg1;
        var3.field7922 = this.field262 - 255;
    }

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(IIIIIII)V", line = 593)
    public final void method141(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class563 var8 = this.method256(Thread.currentThread());
        class143 var9 = var8.field7960;
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
            int var23 = arg0 - var9.method952();
            int var24 = arg1 - var9.method945();
            int var25 = var19 + var23;
            int var26 = var23 - var20;
            int var27 = var17 + var23 - var20;
            int var28 = var17 + var23 + var19;
            int var29 = var21 + var24;
            int var30 = var24 - var22;
            int var31 = var18 + var24 - var22;
            int var32 = var18 + var24 + var21;
            if (arg6 == 0) {
                var9.field1827 = 0;
            } else {
                if (arg6 != 1) {
                    throw new IllegalArgumentException();
                }
                var9.field1827 = 255 - (arg4 >>> 24);
            }
            this.method211(false);
            var9.field1824 = var25 < 0 || var25 > var9.field1821 || var26 < 0 || var26 > var9.field1821 || var27 < 0 || var27 > var9.field1821;
            var9.method953((float) var29, (float) var30, (float) var31, (float) var25, (float) var26, (float) var27, 100.0F, 100.0F, 100.0F, arg4);
            var9.field1824 = var25 < 0 || var25 > var9.field1821 || var27 < 0 || var27 > var9.field1821 || var28 < 0 || var28 > var9.field1821;
            var9.method953((float) var29, (float) var31, (float) var32, (float) var25, (float) var27, (float) var28, 100.0F, 100.0F, 100.0F, arg4);
            this.method211(true);
        }
    }

    @OriginalMember(owner = "client!nia", name = "da", descriptor = "(III[I)V", line = 667)
    public final void method142(int arg0, int arg1, int arg2, int[] arg3) {
        float var5 = (float) arg2 * this.field253.field10144 + (float) arg0 * this.field253.field10140 + (float) arg1 * this.field253.field10146 + this.field253.field10152;
        if (!(var5 < (float) this.field252) && !(var5 > (float) this.field262)) {
            int var6 = (int) (((float) arg2 * this.field253.field10143 + (float) arg0 * this.field253.field10149 + (float) arg1 * this.field253.field10147 + this.field253.field10148) * (float) this.field249 / var5);
            int var7 = (int) (((float) arg2 * this.field253.field10159 + (float) arg0 * this.field253.field10153 + (float) arg1 * this.field253.field10163 + this.field253.field10164) * (float) this.field272 / var5);
            if (var6 >= this.field254 && var6 <= this.field277 && var7 >= this.field266 && var7 <= this.field271) {
                arg3[0] = var6 - this.field254;
                arg3[1] = var7 - this.field266;
                arg3[2] = (int) var5;
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!nia", name = "A", descriptor = "()I", line = 692)
    public final int method143() {
        return 0;
    }

    @OriginalMember(owner = "client!nia", name = "g", descriptor = "()Z", line = 695)
    public final boolean method144() {
        return this.field244;
    }

    @OriginalMember(owner = "client!nia", name = "m", descriptor = "()V", line = 697)
    public final void method145() {
    }

    @OriginalMember(owner = "client!nia", name = "F", descriptor = "(II)V", line = 701)
    public final void method146(int arg0, int arg1) {
        int var3 = this.field275 * arg1 + arg0;
        int var4 = this.field267 * arg1 + arg0;
        if (var3 != 0 || var4 != 0) {
            int[] var5 = this.field270;
            float[] var6 = this.field274;
            if (var3 < 0) {
                int var7 = var5.length + var3;
                class335.method2124(var5, -var3, var5, 0, var7);
            } else if (var3 > 0) {
                int var8 = var5.length - var3;
                class335.method2124(var5, 0, var5, var3, var8);
            }
            if (var4 < 0) {
                int var9 = var6.length + var4;
                class335.method2122(var6, -var4, var6, 0, var9);
            } else {
                if (var4 > 0) {
                    int var10 = var6.length - var4;
                    class335.method2122(var6, 0, var6, var4, var10);
                }
            }
        }
    }

    @OriginalMember(owner = "client!nia", name = "j", descriptor = "()Z", line = 743)
    public final boolean method147() {
        return false;
    }

    @OriginalMember(owner = "client!nia", name = "za", descriptor = "(IIIII)V", line = 746)
    public final void method148(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var6 = arg1 - arg2;
        if (var6 < this.field276) {
            var6 = this.field276;
        }
        int var7 = arg1 + arg2 + 1;
        if (var7 > this.field256) {
            var7 = this.field256;
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
                if (var64 < this.field258) {
                    var64 = this.field258;
                }
                int var65 = arg0 + var10;
                if (var65 > this.field264) {
                    var65 = this.field264;
                }
                int var66 = this.field275 * var8 + var64;
                for (int var67 = var64; var67 < var65; ++var67) {
                    this.field270[var66++] = arg3;
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
                if (var60 < this.field258) {
                    var60 = this.field258;
                }
                int var61 = arg0 + var55;
                if (var61 > this.field264 - 1) {
                    var61 = this.field264 - 1;
                }
                int var62 = this.field275 * var8 + var60;
                for (int var63 = var60; var63 <= var61; ++var63) {
                    this.field270[var62++] = arg3;
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
                if (var28 < this.field258) {
                    var28 = this.field258;
                }
                int var29 = arg0 + var10;
                if (var29 > this.field264) {
                    var29 = this.field264;
                }
                int var30 = this.field275 * var8 + var28;
                for (int var31 = var28; var31 < var29; ++var31) {
                    int var32 = this.field270[var30];
                    int var33 = ((var32 & 16711935) * var16 >> 8 & 16711935) + ((var32 & 65280) * var16 >> 8 & 65280);
                    this.field270[var30++] = var15 + var33;
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
                if (var22 < this.field258) {
                    var22 = this.field258;
                }
                int var23 = arg0 + var17;
                if (var23 > this.field264 - 1) {
                    var23 = this.field264 - 1;
                }
                int var24 = this.field275 * var8 + var22;
                for (int var25 = var22; var25 <= var23; ++var25) {
                    int var26 = this.field270[var24];
                    int var27 = ((var26 & 16711935) * var16 >> 8 & 16711935) + ((var26 & 65280) * var16 >> 8 & 65280);
                    this.field270[var24++] = var15 + var27;
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
                if (var47 < this.field258) {
                    var47 = this.field258;
                }
                int var48 = arg0 + var10;
                if (var48 > this.field264) {
                    var48 = this.field264;
                }
                int var49 = this.field275 * var8 + var47;
                for (int var50 = var47; var50 < var48; ++var50) {
                    int var51 = this.field270[var49];
                    int var52 = arg3 + var51;
                    int var53 = (arg3 & 16711935) + (var51 & 16711935);
                    int var54 = (var52 - var53 & 65536) + (var53 & 16777472);
                    this.field270[var49++] = var52 - var54 | var54 - (var54 >>> 8);
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
                if (var39 < this.field258) {
                    var39 = this.field258;
                }
                int var40 = arg0 + var34;
                if (var40 > this.field264 - 1) {
                    var40 = this.field264 - 1;
                }
                int var41 = this.field275 * var8 + var39;
                for (int var42 = var39; var42 <= var40; ++var42) {
                    int var43 = this.field270[var41];
                    int var44 = arg3 + var43;
                    int var45 = (arg3 & 16711935) + (var43 & 16711935);
                    int var46 = (var44 - var45 & 65536) + (var45 & 16777472);
                    this.field270[var41++] = var44 - var46 | var46 - (var46 >>> 8);
                }
                ++var8;
                var38 += var35 + var35;
                var37 += var35++ + var35;
            }
        }
    }

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(Llg;IIII)V", line = 1033)
    private final void method149(class216 arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = arg0.field2976;
        int var8 = arg4 << 1;
        if (var6 == -1) {
            this.method137(arg1, arg2, arg3, arg4, arg0.field2983, 1);
        } else {
            if (this.field288 != var6) {
                class318 var9 = (class318) this.field278.method312(0, (long) var6);
                if (var9 == null) {
                    int[] var10 = this.method234(var6);
                    if (var10 == null) {
                        return;
                    }
                    int var11 = this.method169(var6) ? 64 : this.field263;
                    var9 = this.method2815(var10, (byte) -39, var11, var11, var11, 0);
                    this.field278.method305(var9, (long) var6, 18320);
                }
                this.field288 = var6;
                this.field287 = var9;
            }
            ++var8;
            ((class105) this.field287).method739(arg1 - arg4, arg2 - arg4, arg3, var8, var8, 0, arg0.field2983, 1, 1);
        }
    }

    @OriginalMember(owner = "client!nia", name = "d", descriptor = "(I)Z", line = 1071)
    public final boolean method150(int arg0) {
        return super.field6556.method581(-21732, arg0).field10253 || super.field6556.method581(-21732, arg0).field10255;
    }

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(IIIIII)Lok;", line = 1075)
    public final class255 method151(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!nia", name = "U", descriptor = "(IIIII)V", line = 1078)
    public final void method152(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 >= this.field276 && arg1 < this.field256) {
            if (arg0 < this.field258) {
                arg2 -= this.field258 - arg0;
                arg0 = this.field258;
            }
            if (arg0 + arg2 > this.field264) {
                arg2 = this.field264 - arg0;
            }
            int var6 = this.field275 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field270[var6 + var10];
                        int var12 = ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & 65280) * var9 >> 8 & 65280);
                        this.field270[var6 + var10] = var8 + var12;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var13 = 0; var13 < arg2; ++var13) {
                        int var14 = this.field270[var6 + var13];
                        int var15 = arg3 + var14;
                        int var16 = (arg3 & 16711935) + (var14 & 16711935);
                        int var17 = (var15 - var16 & 65536) + (var16 & 16777472);
                        this.field270[var6 + var13] = var15 - var17 | var17 - (var17 >>> 8);
                    }
                }
            } else {
                for (int var18 = 0; var18 < arg2; ++var18) {
                    this.field270[var6 + var18] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!nia", name = "h", descriptor = "()Loo;", line = 1151)
    public final class12 method153() {
        class563 var1 = this.method256(Thread.currentThread());
        return var1.field7933;
    }

    @OriginalMember(owner = "client!nia", name = "ZA", descriptor = "(IFFFFF)V", line = 1155)
    public final void method154(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        this.field255 = (int) (arg1 * 65535.0F);
        this.field285 = (int) (arg2 * 65535.0F);
        float var7 = (float) Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4));
        this.field269 = (int) (arg3 * 65535.0F / var7);
        this.field265 = (int) (arg4 * 65535.0F / var7);
        this.field284 = (int) (arg5 * 65535.0F / var7);
    }

    @OriginalMember(owner = "client!nia", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 1164)
    public final void method155(Canvas arg0) {
        if (arg0 != null) {
            class540 var2 = (class540) this.field240.method3669(false, (long) arg0.hashCode());
            if (var2 != null) {
                this.field241 = arg0;
                Dimension var3 = arg0.getSize();
                this.field247 = var3.width;
                this.field243 = var3.height;
                this.field245 = var2;
                if (this.field280 == null) {
                    this.field270 = var2.field7471;
                    this.field275 = var2.field7465;
                    this.field259 = var2.field7470;
                    if (this.field275 != this.field267 || this.field259 != this.field248) {
                        this.field281 = this.field267 = this.field275;
                        this.field279 = this.field248 = this.field259;
                        this.field286 = this.field274 = new float[this.field267 * this.field248];
                    }
                    this.method174();
                    return;
                }
            }
        } else {
            this.field241 = null;
            this.field245 = null;
            if (this.field280 == null) {
                this.field270 = null;
                this.field275 = this.field259 = 1;
                this.field267 = this.field248 = 1;
                this.method174();
            }
        }
    }

    @OriginalMember(owner = "client!nia", name = "z", descriptor = "()Z", line = 1210)
    public final boolean method156() {
        return false;
    }

    @OriginalMember(owner = "client!nia", name = "d", descriptor = "(II)V", line = 1213)
    public final void method157(int arg0, int arg1) throws class357 {
        if (this.field241 != null && this.field245 != null) {
            try {
                Graphics var3 = this.field241.getGraphics();
                this.field245.method1622(0, this.field247, this.field243, arg1, (byte) -128, 0, arg0, var3);
            } catch (Exception var4) {
                this.field241.repaint();
            }
        } else {
            throw new IllegalStateException("off");
        }
    }

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(IIIIIIII)V", line = 1229)
    private final void method158(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 >= this.field276 && arg1 < this.field256) {
            int var9 = this.field275 * arg1 + arg0;
            int var10 = arg3 >>> 24;
            int var11 = arg5 + arg6;
            int var12 = arg7 % var11;
            if (arg4 != 0 && (arg4 != 1 || var10 != 255)) {
                if (arg4 == 1) {
                    int var13 = (var10 << 24) + ((arg3 & 16711935) * var10 >> 8 & 16711935) + ((arg3 & 65280) * var10 >> 8 & 65280);
                    int var14 = 256 - var10;
                    int var15 = 0;
                    while (var15 < arg2) {
                        if (arg0 + var15 >= this.field258 && arg0 + var15 < this.field264 && var12 < arg5) {
                            int var16 = this.field270[var9 + var15];
                            int var17 = ((var16 & 16711935) * var14 >> 8 & 16711935) + ((var16 & 65280) * var14 >> 8 & 65280);
                            this.field270[var9 + var15] = var13 + var17;
                        }
                        ++var15;
                        ++var12;
                        var12 %= var11;
                    }
                } else if (arg4 == 2) {
                    int var18 = 0;
                    while (var18 < arg2) {
                        if (arg0 + var18 >= this.field258 && arg0 + var18 < this.field264 && var12 < arg5) {
                            int var19 = this.field270[var9 + var18];
                            int var20 = arg3 + var19;
                            int var21 = (arg3 & 16711935) + (var19 & 16711935);
                            int var22 = (var20 - var21 & 65536) + (var21 & 16777472);
                            this.field270[var9 + var18] = var20 - var22 | var22 - (var22 >>> 8);
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
                    if (arg0 + var23 >= this.field258 && arg0 + var23 < this.field264 && var12 < arg5) {
                        this.field270[var9 + var23] = arg3;
                    }
                    ++var23;
                    ++var12;
                    var12 %= var11;
                }
            }
        }
    }

    @OriginalMember(owner = "client!nia", name = "k", descriptor = "()Loo;", line = 1308)
    public final class12 method159() {
        return new class737();
    }

    @OriginalMember(owner = "client!nia", name = "K", descriptor = "([I)V", line = 1311)
    public final void method160(int[] arg0) {
        arg0[0] = this.field258;
        arg0[1] = this.field276;
        arg0[2] = this.field264;
        arg0[3] = this.field256;
    }

    @OriginalMember(owner = "client!nia", name = "n", descriptor = "()Z", line = 1318)
    public final boolean method161() {
        return false;
    }

    @OriginalMember(owner = "client!nia", name = "d", descriptor = "()Z", line = 1321)
    public final boolean method162() {
        return true;
    }

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(I[Lsca;)V", line = 1323)
    public final void method163(int arg0, class251[] arg1) {
    }

    @OriginalMember(owner = "client!nia", name = "r", descriptor = "(IIIIIII)I", line = 1327)
    public final int method164(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        float var8 = (float) arg2 * this.field253.field10144 + (float) arg0 * this.field253.field10140 + (float) arg1 * this.field253.field10146 + this.field253.field10152;
        float var9 = (float) arg5 * this.field253.field10144 + (float) arg3 * this.field253.field10140 + (float) arg4 * this.field253.field10146 + this.field253.field10152;
        int var10 = 0;
        if (var8 < (float) this.field252 && var9 < (float) this.field252) {
            var10 |= 16;
        } else if (var8 > (float) this.field262 && var9 > (float) this.field262) {
            var10 |= 32;
        }
        int var11 = (int) (((float) arg2 * this.field253.field10143 + (float) arg0 * this.field253.field10149 + (float) arg1 * this.field253.field10147 + this.field253.field10148) * (float) this.field249 / (float) arg6);
        int var12 = (int) (((float) arg5 * this.field253.field10143 + (float) arg3 * this.field253.field10149 + (float) arg4 * this.field253.field10147 + this.field253.field10148) * (float) this.field249 / (float) arg6);
        if (var11 < this.field254 && var12 < this.field254) {
            var10 |= 1;
        } else if (var11 > this.field277 && var12 > this.field277) {
            var10 |= 2;
        }
        int var13 = (int) (((float) arg2 * this.field253.field10159 + (float) arg0 * this.field253.field10153 + (float) arg1 * this.field253.field10163 + this.field253.field10164) * (float) this.field272 / (float) arg6);
        int var14 = (int) (((float) arg5 * this.field253.field10159 + (float) arg3 * this.field253.field10153 + (float) arg4 * this.field253.field10163 + this.field253.field10164) * (float) this.field272 / (float) arg6);
        if (var13 < this.field266 && var14 < this.field266) {
            var10 |= 4;
        } else if (var13 > this.field271 && var14 > this.field271) {
            var10 |= 8;
        }
        return var10;
    }

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(Lza;)V", line = 1363)
    public final void method165(class731 arg0) {
    }

    @OriginalMember(owner = "client!nia", name = "X", descriptor = "(I)V", line = 1366)
    public final void method166(int arg0) {
    }

    @OriginalMember(owner = "client!nia", name = "c", descriptor = "()V", line = 1368)
    public final void method167() {
    }

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 1371)
    public final void method168(Canvas arg0) {
        if (this.field241 == arg0) {
            this.method155((Canvas) null);
        }
        class540 var2 = (class540) this.field240.method3669(false, (long) arg0.hashCode());
        if (var2 != null) {
            var2.method527(-11229);
        }
    }

    @OriginalMember(owner = "client!nia", name = "j", descriptor = "(I)Z", line = 1381)
    public final boolean method169(int arg0) {
        return this.field260 || super.field6556.method581(-21732, arg0).field10265;
    }

    @OriginalMember(owner = "client!nia", name = "h", descriptor = "(I)V", line = 1387)
    public final void method170(int arg0) {
        this.field250[arg0].method3329(Thread.currentThread(), true);
    }

    @OriginalMember(owner = "client!nia", name = "c", descriptor = "(IIIIII)V", line = 1391)
    public final void method171(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method152(arg0, arg1, arg2, arg4, arg5);
        this.method152(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method207(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
        this.method207(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
    }

    @OriginalMember(owner = "client!nia", name = "b", descriptor = "()Lrb;", line = 1398)
    public final class260 method172() {
        return new class260(0, "Pure Java", 1, "CPU", 0L);
    }

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(Lok;)V", line = 1400)
    public final void method173(class255 arg0) {
    }

    @OriginalMember(owner = "client!nia", name = "B", descriptor = "()V", line = 1405)
    private final void method174() {
        for (int var1 = 0; var1 < this.field283; ++var1) {
            this.field250[var1].method3328(10000);
        }
        this.method208();
    }

    @OriginalMember(owner = "client!nia", name = "e", descriptor = "()Z", line = 1413)
    public final boolean method175() {
        return false;
    }

    @OriginalMember(owner = "client!nia", name = "A", descriptor = "(ILaa;II)V", line = 1417)
    public final void method176(int arg0, class87 arg1, int arg2, int arg3) {
        class16 var5 = (class16) arg1;
        int[] var6 = var5.field99;
        int[] var7 = var5.field94;
        int var8;
        if (this.field256 < var6.length + arg3) {
            var8 = this.field256 - arg3;
        } else {
            var8 = var6.length;
        }
        int var9;
        if (this.field276 > arg3) {
            var9 = this.field276 - arg3;
            arg3 = this.field276;
        } else {
            var9 = 0;
        }
        if (var8 - var9 > 0) {
            int var10 = this.field275 * arg3;
            for (int var11 = var9; var11 < var8; ++var11) {
                int var12 = var6[var11] + arg2;
                int var13 = var7[var11];
                if (this.field258 > var12) {
                    var13 -= this.field258 - var12;
                    var12 = this.field258;
                }
                if (this.field264 < var12 + var13) {
                    var13 = this.field264 - var12;
                }
                int var14 = var10 + var12;
                for (int var15 = -var13; var15 < 0; ++var15) {
                    this.field270[var14++] = arg0;
                }
                var10 += this.field275;
            }
        }
    }

    @OriginalMember(owner = "client!nia", name = "XA", descriptor = "()I", line = 1474)
    public final int method177() {
        return this.field262;
    }

    @OriginalMember(owner = "client!nia", name = "b", descriptor = "(I)Lza;", line = 1477)
    public final class731 method178(int arg0) {
        return null;
    }

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(Lhw;[Lfm;Z)Lda;", line = 1481)
    public final class442 method179(class300 arg0, class279[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field4014;
            var5[var7] = arg1[var7].field4008;
            if (arg1[var7].field4009 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            if (var6) {
                return new class312(this, arg0, arg1, var4, var5);
            } else {
                return new class740(this, arg0, arg1, var4, var5);
            }
        } else if (var6) {
            throw new IllegalArgumentException("");
        } else {
            return new class584(this, arg0, arg1, var4, var5);
        }
    }

    @OriginalMember(owner = "client!nia", name = "i", descriptor = "(I)V", line = 1518)
    public final void method180(int arg0) {
        class445.field6180 = arg0;
        class445.field6168 = arg0;
        if (this.field283 > 1) {
            throw new IllegalStateException("No MT");
        } else {
            this.method195(this.field283);
            this.method170(0);
        }
    }

    @OriginalMember(owner = "client!nia", name = "E", descriptor = "()I", line = 1526)
    public final int method181() {
        return 0;
    }

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "([IIIIIZ)Lho;", line = 1530)
    public final class318 method182(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        boolean var7 = false;
        int var8 = arg1;
        for (int var9 = 0; var9 < arg4; ++var9) {
            for (int var10 = 0; var10 < arg3; ++var10) {
                int var11 = arg0[var8++] >>> 24;
                if (var11 != 0 && var11 != 255) {
                    var7 = true;
                    return var7 ? new class196(this, arg0, arg1, arg2, arg3, arg4, arg5) : new class575(this, arg0, arg1, arg2, arg3, arg4, arg5);
                }
            }
        }
        return var7 ? new class196(this, arg0, arg1, arg2, arg3, arg4, arg5) : new class575(this, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(IIZ)Lho;", line = 1565)
    public final class318 method183(int arg0, int arg1, boolean arg2) {
        return arg2 ? new class196(this, arg0, arg1) : new class575(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!nia", name = "f", descriptor = "()V", line = 1571)
    public final void method184() {
        this.field257.method314(-2);
        this.field278.method314(-2);
    }

    @OriginalMember(owner = "client!nia", name = "f", descriptor = "(I)V", line = 1575)
    public final void method185(int arg0) {
        this.field263 = arg0;
        this.field257.method314(-2);
    }

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(FFF)V", line = 1578)
    public final void method186(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!nia", name = "t", descriptor = "()Loo;", line = 1581)
    public final class12 method187() {
        return this.field253;
    }

    @OriginalMember(owner = "client!nia", name = "e", descriptor = "(II)I", line = 1586)
    public final int method188(int arg0, int arg1) {
        int var3 = arg0 | 133120;
        return var3 & arg1 ^ arg1;
    }

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(IIIIIIIII)V", line = 1590)
    public final void method189(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var10 = arg2 - arg0;
        int var11 = arg3 - arg1;
        if (var11 == 0) {
            if (var10 >= 0) {
                this.method158(arg0, arg1, var10 + 1, arg4, arg5, arg6, arg7, arg8);
            } else {
                int var12 = arg6 + arg7;
                int var13 = arg8 % var12;
                int var14 = arg6 + var12 - var13 - (-var10 + 1) % var12;
                int var15 = var14 % var12;
                if (var15 < 0) {
                    var15 += var12;
                }
                this.method158(arg0 + var10, arg1, -var10 + 1, arg4, arg5, arg6, arg7, var15);
            }
        } else if (var10 == 0) {
            if (var11 >= 0) {
                this.method213(arg0, arg1, var11 + 1, arg4, arg5, arg6, arg7, arg8);
            } else {
                int var16 = arg6 + arg7;
                int var17 = arg8 % var16;
                int var18 = arg6 + var16 - var17 - (-var11 + 1) % var16;
                int var19 = var18 % var16;
                if (var19 < 0) {
                    var19 += var16;
                }
                this.method213(arg0, arg1 + var11, -var11 + 1, arg4, arg5, arg6, arg7, var19);
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
                            if (arg0 >= this.field258 && arg0 < this.field264 && var37 >= this.field276 && var37 < this.field256 && var24 < var21) {
                                int var38 = this.field275 * var37 + arg0;
                                int var39 = this.field270[var38];
                                int var40 = ((var39 & 16711935) * var36 >> 8 & 16711935) + ((var39 & 65280) * var36 >> 8 & 65280);
                                this.field270[var38] = var35 + var40;
                            }
                            var29 += var31;
                            ++arg0;
                            int var41 = var24 + var34;
                            var24 = var41 % var23;
                        }
                    } else if (arg5 == 2) {
                        while (arg0 <= var32) {
                            int var42 = var29 >> 16;
                            if (arg0 >= this.field258 && arg0 < this.field264 && var42 >= this.field276 && var42 < this.field256 && var24 < var21) {
                                int var43 = this.field275 * var42 + arg0;
                                int var44 = this.field270[var43];
                                int var45 = arg4 + var44;
                                int var46 = (arg4 & 16711935) + (var44 & 16711935);
                                int var47 = (var45 - var46 & 65536) + (var46 & 16777472);
                                this.field270[var43] = var45 - var47 | var47 - (var47 >>> 8);
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
                        if (arg0 >= this.field258 && arg0 < this.field264 && var49 >= this.field276 && var49 < this.field256 && var24 < var21) {
                            this.field270[this.field275 * var49 + arg0] = arg4;
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
                            if (arg1 >= this.field276 && arg1 < this.field256 && var60 >= this.field258 && var60 < this.field264 && var24 < var21) {
                                int var61 = this.field275 * arg1 + var60;
                                int var62 = this.field270[var61];
                                int var63 = ((var62 & 16711935) * var59 >> 8 & 16711935) + ((var62 & 65280) * var59 >> 8 & 65280);
                                this.field270[this.field275 * arg1 + var60] = var58 + var63;
                            }
                            var52 += var54;
                            ++arg1;
                            int var64 = var24 + var57;
                            var24 = var64 % var23;
                        }
                    } else if (arg5 == 2) {
                        while (arg1 <= var55) {
                            int var65 = var52 >> 16;
                            if (arg1 >= this.field276 && arg1 < this.field256 && var65 >= this.field258 && var65 < this.field264 && var24 < var21) {
                                int var66 = this.field275 * arg1 + var65;
                                int var67 = this.field270[var66];
                                int var68 = arg4 + var67;
                                int var69 = (arg4 & 16711935) + (var67 & 16711935);
                                int var70 = (var68 - var69 & 65536) + (var69 & 16777472);
                                this.field270[var66] = var68 - var70 | var70 - (var70 >>> 8);
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
                        if (arg1 >= this.field276 && arg1 < this.field256 && var72 >= this.field258 && var72 < this.field264 && var24 < var21) {
                            this.field270[this.field275 * arg1 + var72] = arg4;
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

    @OriginalMember(owner = "client!nia", name = "b", descriptor = "(Ljava/awt/Canvas;II)V", line = 1837)
    public final void method190(Canvas arg0, int arg1, int arg2) {
        class540 var4 = (class540) this.field240.method3669(false, (long) arg0.hashCode());
        if (var4 != null) {
            var4.method527(-11229);
            class540 var5 = class324.method2055(arg0, (byte) -74, arg1, arg2);
            this.field240.method3666((byte) 65, (long) arg0.hashCode(), var5);
            if (this.field241 == arg0 && this.field280 == null) {
                Dimension var6 = arg0.getSize();
                this.field247 = var6.width;
                this.field243 = var6.height;
                this.field245 = var5;
                this.field270 = var5.field7471;
                this.field275 = var5.field7465;
                this.field259 = var5.field7470;
                if (this.field275 != this.field267 || this.field259 != this.field248) {
                    this.field281 = this.field267 = this.field275;
                    this.field279 = this.field248 = this.field259;
                    this.field286 = this.field274 = new float[this.field267 * this.field248];
                }
                this.method174();
            }
        }
    }

    @OriginalMember(owner = "client!nia", name = "C", descriptor = "()V", line = 1867)
    private final void method191() {
        this.field254 = this.field258 - this.field273;
        this.field277 = this.field264 - this.field273;
        this.field266 = this.field276 - this.field282;
        this.field271 = this.field256 - this.field282;
        for (int var1 = 0; var1 < this.field283; ++var1) {
            class143 var5 = this.field250[var1].field7960;
            var5.field1817 = this.field273 - this.field258;
            var5.field1818 = this.field282 - this.field276;
            var5.field1821 = this.field264 - this.field258;
            var5.field1826 = this.field256 - this.field276;
        }
        int var2 = this.field276 * this.field275 + this.field258;
        for (int var3 = this.field276; var3 < this.field256; ++var3) {
            for (int var4 = 0; var4 < this.field283; ++var4) {
                this.field250[var4].field7960.field1819[var3 - this.field276] = var2;
            }
            var2 += this.field275;
        }
    }

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(Lfm;Z)Lho;", line = 1906)
    public final class318 method192(class279 arg0, boolean arg1) {
        int[] var3 = arg0.field4012;
        byte[] var4 = arg0.field4010;
        int var5 = arg0.field4014;
        int var6 = arg0.field4008;
        class105 var11;
        if (arg1 && arg0.field4009 == null) {
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
            var11 = new class488(this, var8, var7, var5, var6);
        } else {
            int[] var14 = new int[var5 * var6];
            byte[] var15 = arg0.field4009;
            if (var15 != null) {
                for (int var16 = 0; var16 < var6; ++var16) {
                    int var17 = var5 * var16;
                    for (int var18 = 0; var18 < var5; ++var18) {
                        var14[var17 + var18] = var3[var4[var17 + var18] & 255] | var15[var17 + var18] << 24;
                    }
                }
                var11 = new class196(this, var14, var5, var6);
            } else {
                for (int var19 = 0; var19 < var6; ++var19) {
                    int var20 = var5 * var19;
                    for (int var21 = 0; var21 < var5; ++var21) {
                        int var22 = var3[var4[var20 + var21] & 255];
                        var14[var20 + var21] = var22 != 0 ? -16777216 | var22 : 0;
                    }
                }
                var11 = new class575(this, var14, var5, var6);
            }
        }
        var11.method741(arg0.field4016, arg0.field4011, arg0.field4013, arg0.field4015);
        return var11;
    }

    @OriginalMember(owner = "client!nia", name = "x", descriptor = "()Z", line = 2010)
    public final boolean method193() {
        return true;
    }

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(Loo;)V", line = 2013)
    public final void method194(class12 arg0) {
        this.field253 = (class737) arg0;
    }

    @OriginalMember(owner = "client!nia", name = "g", descriptor = "(I)V", line = 2016)
    public final void method195(int arg0) {
        this.field283 = arg0;
        this.field250 = new class563[this.field283];
        for (int var2 = 0; var2 < this.field283; ++var2) {
            this.field250[var2] = new class563(this);
        }
    }

    @OriginalMember(owner = "client!nia", name = "H", descriptor = "(III[I)V", line = 2031)
    public final void method196(int arg0, int arg1, int arg2, int[] arg3) {
        float var5 = (float) arg2 * this.field253.field10144 + (float) arg0 * this.field253.field10140 + (float) arg1 * this.field253.field10146 + this.field253.field10152;
        if (var5 == 0.0F) {
            arg3[0] = arg3[1] = arg3[2] = -1;
        } else {
            int var6 = (int) (((float) arg2 * this.field253.field10143 + (float) arg0 * this.field253.field10149 + (float) arg1 * this.field253.field10147 + this.field253.field10148) * (float) this.field249 / var5);
            int var7 = (int) (((float) arg2 * this.field253.field10159 + (float) arg0 * this.field253.field10153 + (float) arg1 * this.field253.field10163 + this.field253.field10164) * (float) this.field272 / var5);
            arg3[0] = var6 - this.field254;
            arg3[1] = var7 - this.field266;
            arg3[2] = (int) var5;
        }
    }

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(IIII)V", line = 2046)
    public final void method197(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!nia", name = "b", descriptor = "(II)I", line = 2049)
    public final int method198(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!nia", name = "w", descriptor = "()Z", line = 2052)
    public final boolean method199() {
        return false;
    }

    @OriginalMember(owner = "client!nia", name = "y", descriptor = "()Z", line = 2055)
    public final boolean method200() {
        return true;
    }

    @OriginalMember(owner = "client!nia", name = "s", descriptor = "()Z", line = 2059)
    public final boolean method201() {
        return false;
    }

    @OriginalMember(owner = "client!nia", name = "xa", descriptor = "(F)V", line = 2062)
    public final void method202(float arg0) {
        this.field251 = (int) (arg0 * 65535.0F);
    }

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(Z)V", line = 2065)
    public final void method203(boolean arg0) {
    }

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(II[[I[[IIII)Ls;", line = 2068)
    public final class418 method204(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class786(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!nia", name = "u", descriptor = "()V", line = 2071)
    public final void method205() {
        if (this.field242) {
            class153.method1003(true, -2, false);
            this.field242 = false;
        }
        this.field245 = null;
        this.field241 = null;
        this.field247 = 0;
        this.field243 = 0;
        this.field240 = null;
        this.field244 = true;
    }

    @OriginalMember(owner = "client!nia", name = "p", descriptor = "()Z", line = 2086)
    public final boolean method206() {
        return false;
    }

    @OriginalMember(owner = "client!nia", name = "P", descriptor = "(IIIII)V", line = 2089)
    public final void method207(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 >= this.field258 && arg0 < this.field264) {
            if (arg1 < this.field276) {
                arg2 -= this.field276 - arg1;
                arg1 = this.field276;
            }
            if (arg1 + arg2 > this.field256) {
                arg2 = this.field256 - arg1;
            }
            int var6 = this.field275 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field275 * var10 + var6;
                        int var12 = this.field270[var11];
                        int var13 = ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & 65280) * var9 >> 8 & 65280);
                        this.field270[var11] = var8 + var13;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var14 = 0; var14 < arg2; ++var14) {
                        int var15 = this.field275 * var14 + var6;
                        int var16 = this.field270[var15];
                        int var17 = arg3 + var16;
                        int var18 = (arg3 & 16711935) + (var16 & 16711935);
                        int var19 = (var17 - var18 & 65536) + (var18 & 16777472);
                        this.field270[var15] = var17 - var19 | var19 - (var19 >>> 8);
                    }
                }
            } else {
                for (int var20 = 0; var20 < arg2; ++var20) {
                    this.field270[this.field275 * var20 + var6] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!nia", name = "la", descriptor = "()V", line = 2165)
    public final void method208() {
        this.field258 = 0;
        this.field276 = 0;
        this.field264 = this.field275;
        this.field256 = this.field259;
        this.method191();
    }

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(Lok;Lok;FLok;)Lok;", line = 2172)
    public final class255 method209(class255 arg0, class255 arg1, float arg2, class255 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!nia", name = "r", descriptor = "()V", line = 2174)
    public final void method210() {
    }

    @OriginalMember(owner = "client!nia", name = "C", descriptor = "(Z)V", line = 2179)
    public final void method211(boolean arg0) {
        class563 var2 = this.method256(Thread.currentThread());
        var2.field7921 = arg0;
    }

    @OriginalMember(owner = "client!nia", name = "<init>", descriptor = "(Ld;)V", line = 3198)
    private class30(class101 arg0) {
        super(arg0);
        this.field244 = false;
        this.field242 = false;
        this.field240 = new class638(4);
        this.field252 = 50;
        this.field260 = false;
        this.field261 = 0;
        this.field258 = 0;
        this.field255 = 45823;
        this.field249 = 512;
        this.field256 = 0;
        this.field263 = 128;
        this.field268 = 0;
        this.field251 = 75518;
        this.field272 = 512;
        this.field276 = 0;
        this.field264 = 0;
        this.field262 = 3500;
        this.field285 = 78642;
        this.field278 = new class39(16);
        this.field288 = -1;
        try {
            this.field257 = new class39(256);
            this.field253 = new class737();
            this.method195(1);
            this.method170(0);
            class691.method3920(true, true, -94557789);
            this.field242 = true;
            this.field246 = (int) class683.method3903((byte) 4);
        } catch (Throwable var3) {
            var3.printStackTrace();
            this.method2821((byte) 118);
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(IIIIIILaa;II)V", line = 2187)
    public final void method212(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class87 arg6, int arg7, int arg8) {
        class16 var10 = (class16) arg6;
        int[] var11 = var10.field99;
        int[] var12 = var10.field94;
        int var13 = this.field276 > arg8 ? this.field276 : arg8;
        int var14 = this.field256 < var11.length + arg8 ? this.field256 : var11.length + arg8;
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
            if (arg0 < this.field258) {
                var18 += (this.field258 - arg0) * var20;
                arg0 = this.field258;
            }
            if (var21 >= this.field264) {
                var21 = this.field264 - 1;
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
                                int var28 = this.field275 * var25 + arg0;
                                int var29 = this.field270[var28];
                                int var30 = ((var29 & 16711935) * var24 >> 8 & 16711935) + ((var29 & 65280) * var24 >> 8 & 65280);
                                this.field270[var28] = var23 + var30;
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
                                int var34 = this.field275 * var31 + arg0;
                                int var35 = this.field270[var34];
                                int var36 = arg4 + var35;
                                int var37 = (arg4 & 16711935) + (var35 & 16711935);
                                int var38 = (var36 - var37 & 65536) + (var37 & 16777472);
                                this.field270[var34] = var36 - var38 | var38 - (var38 >>> 8);
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
                            this.field270[this.field275 * var39 + arg0] = arg4;
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
                    if (var64 >= this.field258 && var64 < this.field264 && var64 >= var66 && var64 < var12[var65] + var66) {
                        this.field270[this.field275 * arg1 + var64] = arg4;
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
                    if (var50 >= this.field258 && var50 < this.field264 && var50 >= var52 && var50 < var12[var51] + var52) {
                        int var53 = this.field275 * arg1 + var50;
                        int var54 = this.field270[var53];
                        int var55 = ((var54 & 16711935) * var49 >> 8 & 16711935) + ((var54 & 65280) * var49 >> 8 & 65280);
                        this.field270[this.field275 * arg1 + var50] = var48 + var55;
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else if (arg5 == 2) {
                while (arg1 <= var46) {
                    int var56 = var43 >> 16;
                    int var57 = arg1 - arg8;
                    int var58 = var11[var57] + arg7;
                    if (var56 >= this.field258 && var56 < this.field264 && var56 >= var58 && var56 < var12[var57] + var58) {
                        int var59 = this.field275 * arg1 + var56;
                        int var60 = this.field270[var59];
                        int var61 = arg4 + var60;
                        int var62 = (arg4 & 16711935) + (var60 & 16711935);
                        int var63 = (var61 - var62 & 65536) + (var62 & 16777472);
                        this.field270[var59] = var61 - var63 | var63 - (var63 >>> 8);
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!nia", name = "b", descriptor = "(IIIIIIII)V", line = 2426)
    private final void method213(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg0 >= this.field258 && arg0 < this.field264) {
            int var9 = this.field275 * arg1 + arg0;
            int var10 = arg3 >>> 24;
            int var11 = arg5 + arg6;
            int var12 = arg7 % var11;
            if (arg4 != 0 && (arg4 != 1 || var10 != 255)) {
                if (arg4 == 1) {
                    int var13 = (var10 << 24) + ((arg3 & 16711935) * var10 >> 8 & 16711935) + ((arg3 & 65280) * var10 >> 8 & 65280);
                    int var14 = 256 - var10;
                    int var15 = 0;
                    while (var15 < arg2) {
                        if (arg1 + var15 >= this.field276 && arg1 + var15 < this.field256 && var12 < arg5) {
                            int var16 = this.field275 * var15 + var9;
                            int var17 = this.field270[var16];
                            int var18 = ((var17 & 16711935) * var14 >> 8 & 16711935) + ((var17 & 65280) * var14 >> 8 & 65280);
                            this.field270[var16] = var13 + var18;
                        }
                        ++var15;
                        ++var12;
                        var12 %= var11;
                    }
                } else if (arg4 == 2) {
                    int var19 = 0;
                    while (var19 < arg2) {
                        if (arg1 + var19 >= this.field276 && arg1 + var19 < this.field256 && var12 < arg5) {
                            int var20 = this.field275 * var19 + var9;
                            int var21 = this.field270[var20];
                            int var22 = arg3 + var21;
                            int var23 = (arg3 & 16711935) + (var21 & 16711935);
                            int var24 = (var22 - var23 & 65536) + (var23 & 16777472);
                            this.field270[var20] = var22 - var24 | var24 - (var24 >>> 8);
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
                    if (arg1 + var25 >= this.field276 && arg1 + var25 < this.field256 && var12 < arg5) {
                        this.field270[this.field275 * var25 + var9] = arg3;
                    }
                    ++var25;
                    ++var12;
                    var12 %= var11;
                }
            }
        }
    }

    @OriginalMember(owner = "client!nia", name = "M", descriptor = "()I", line = 2512)
    public final int method214() {
        int var1 = this.field261;
        this.field261 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(IIIIIIIIIIIII)V", line = 2518)
    public final void method215(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        class563 var14 = this.method256(Thread.currentThread());
        class143 var15 = var14.field7960;
        var15.field1814 = false;
        int var16 = arg0 - this.field254;
        int var17 = arg3 - this.field254;
        int var18 = arg6 - this.field254;
        int var19 = arg1 - this.field266;
        int var20 = arg4 - this.field266;
        int var21 = arg7 - this.field266;
        var15.field1824 = var16 < 0 || var16 > var15.field1821 || var17 < 0 || var17 > var15.field1821 || var18 < 0 || var18 > var15.field1821;
        int var22 = arg9 >>> 24;
        if (arg12 != 0 && (arg12 != 1 || var22 != 255)) {
            if (arg12 == 1) {
                var15.field1827 = 255 - var22;
                var15.field1813 = false;
                var15.method943((float) var19, (float) var20, (float) var21, (float) var16, (float) var17, (float) var18, (float) arg2, (float) arg5, (float) arg8, arg9, arg10, arg11);
            } else {
                if (arg12 != 2) {
                    throw new IllegalArgumentException();
                }
                var15.field1827 = 128;
                var15.field1813 = true;
                var15.method943((float) var19, (float) var20, (float) var21, (float) var16, (float) var17, (float) var18, (float) arg2, (float) arg5, (float) arg8, arg9, arg10, arg11);
            }
        } else {
            var15.field1827 = 0;
            var15.field1813 = false;
            var15.method943((float) var19, (float) var20, (float) var21, (float) var16, (float) var17, (float) var18, (float) arg2, (float) arg5, (float) arg8, arg9, arg10, arg11);
        }
        var15.field1814 = true;
    }

    @OriginalMember(owner = "client!nia", name = "k", descriptor = "(I)I", line = 2559)
    public final int method216(int arg0) {
        return super.field6556.method581(-21732, arg0).field10258;
    }

    @OriginalMember(owner = "client!nia", name = "EA", descriptor = "(IIII)V", line = 2563)
    public final void method217(int arg0, int arg1, int arg2, int arg3) {
        class563 var5 = this.method256(Thread.currentThread());
        var5.field7935 = arg0;
        var5.field7923 = arg1;
        var5.field7932 = arg2;
    }

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "([I)V", line = 2571)
    public final void method218(int[] arg0) {
        arg0[0] = this.field275;
        arg0[1] = this.field259;
    }

    @OriginalMember(owner = "client!nia", name = "l", descriptor = "(I)I", line = 2575)
    public final int method219(int arg0) {
        return super.field6556.method581(-21732, arg0).field10266 & 65535;
    }

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(IIIIIIIIII)V", line = 2578)
    public final void method220(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg3 != 0 && arg4 != 0) {
            if (arg6 != 65535 && !super.field6556.method581(-21732, arg6).field10264) {
                if (this.field288 != arg6) {
                    class318 var11 = (class318) this.field278.method312(0, (long) arg6);
                    if (var11 == null) {
                        int[] var12 = this.method234(arg6);
                        if (var12 == null) {
                            return;
                        }
                        int var13 = this.method169(arg6) ? 64 : this.field263;
                        var11 = this.method2815(var12, (byte) -39, var13, var13, var13, 0);
                        this.field278.method305(var11, (long) arg6, 18320);
                    }
                    this.field288 = arg6;
                    this.field287 = var11;
                }
                ((class105) this.field287).method739(arg0 - arg3, arg1 - arg4, arg2, arg3 << 1, arg4 << 1, arg8, arg7, arg9, 1);
            } else {
                this.method137(arg0, arg1, arg2, arg3, arg7, arg9);
            }
        }
    }

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(Ljava/awt/Canvas;II)V", line = 2612)
    public final void method221(Canvas arg0, int arg1, int arg2) {
        class540 var4 = (class540) this.field240.method3669(false, (long) arg0.hashCode());
        if (var4 == null) {
            class540 var5 = class324.method2055(arg0, (byte) -77, arg1, arg2);
            this.field240.method3666((byte) 65, (long) arg0.hashCode(), var5);
        } else {
            if (var4.field7465 != arg1 || var4.field7470 != arg2) {
                this.method190(arg0, arg1, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "()Z", line = 2625)
    public final boolean method222() {
        return false;
    }

    @OriginalMember(owner = "client!nia", name = "l", descriptor = "()Z", line = 2628)
    public final boolean method223() {
        return false;
    }

    @OriginalMember(owner = "client!nia", name = "Q", descriptor = "(IIIIII[BII)V", line = 2631)
    public final void method224(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        if (arg2 > 0 && arg3 > 0) {
            int var10 = 0;
            int var11 = 0;
            int var12 = (arg7 << 16) / arg2;
            int var13 = (arg6.length / arg7 << 16) / arg3;
            int var14 = this.field275 * arg1 + arg0;
            int var15 = this.field275 - arg2;
            if (arg1 + arg3 > this.field256) {
                arg3 -= arg1 + arg3 - this.field256;
            }
            if (arg1 < this.field276) {
                int var16 = this.field276 - arg1;
                arg3 -= var16;
                var14 += this.field275 * var16;
                var11 += var13 * var16;
            }
            if (arg0 + arg2 > this.field264) {
                int var17 = arg0 + arg2 - this.field264;
                arg2 -= var17;
                var15 += var17;
            }
            if (arg0 < this.field258) {
                int var18 = this.field258 - arg0;
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
                            int var28 = this.field270[var14];
                            this.field270[var14++] = ((var25 & 16711935) * var26 + (var28 & 16711935) * var27 & -16711936) + ((var25 & 65280) * var26 + (var28 & 65280) * var27 & 16711680) >> 8;
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
                                int var34 = this.field270[var14];
                                int var35 = var33 + var34;
                                int var36 = (var33 & 16711935) + (var34 & 16711935);
                                int var37 = (var35 - var36 & 65536) + (var36 & 16777472);
                                this.field270[var14++] = var35 - var37 | var37 - (var37 >>> 8);
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
                            this.field270[var14++] = arg5;
                        } else {
                            this.field270[var14++] = arg4;
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

    @OriginalMember(owner = "client!nia", name = "KA", descriptor = "(IIII)V", line = 2806)
    public final void method225(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > this.field275) {
            arg2 = this.field275;
        }
        if (arg3 > this.field259) {
            arg3 = this.field259;
        }
        this.field258 = arg0;
        this.field264 = arg2;
        this.field276 = arg1;
        this.field256 = arg3;
        this.method191();
    }

    @OriginalMember(owner = "client!nia", name = "ya", descriptor = "()V", line = 2825)
    public final void method226() {
        if (this.field258 == 0 && this.field275 == this.field264 && this.field276 == 0 && this.field259 == this.field256) {
            int var1 = this.field274.length;
            int var2 = var1 - (var1 & 7);
            int var3 = 0;
            while (var3 < var2) {
                this.field274[var3++] = 2.1474836E9F;
                this.field274[var3++] = 2.1474836E9F;
                this.field274[var3++] = 2.1474836E9F;
                this.field274[var3++] = 2.1474836E9F;
                this.field274[var3++] = 2.1474836E9F;
                this.field274[var3++] = 2.1474836E9F;
                this.field274[var3++] = 2.1474836E9F;
                this.field274[var3++] = 2.1474836E9F;
            }
            while (var3 < var1) {
                this.field274[var3++] = 2.1474836E9F;
            }
        } else {
            int var4 = this.field264 - this.field258;
            int var5 = this.field256 - this.field276;
            int var6 = this.field275 - var4;
            int var7 = this.field276 * this.field275 + this.field258;
            int var8 = var4 >> 3;
            int var9 = var4 & 7;
            int var10 = var7 - 1;
            for (int var11 = -var5; var11 < 0; ++var11) {
                if (var8 > 0) {
                    int var12 = var8;
                    do {
                        ++var10;
                        this.field274[var10] = 2.1474836E9F;
                        ++var10;
                        this.field274[var10] = 2.1474836E9F;
                        ++var10;
                        this.field274[var10] = 2.1474836E9F;
                        ++var10;
                        this.field274[var10] = 2.1474836E9F;
                        ++var10;
                        this.field274[var10] = 2.1474836E9F;
                        ++var10;
                        this.field274[var10] = 2.1474836E9F;
                        ++var10;
                        this.field274[var10] = 2.1474836E9F;
                        ++var10;
                        this.field274[var10] = 2.1474836E9F;
                        --var12;
                    } while (var12 > 0);
                }
                if (var9 > 0) {
                    int var13 = var9;
                    do {
                        ++var10;
                        this.field274[var10] = 2.1474836E9F;
                        --var13;
                    } while (var13 > 0);
                }
                var10 += var6;
            }
        }
    }

    @OriginalMember(owner = "client!nia", name = "v", descriptor = "()V", line = 2905)
    public final void method227() {
        if (this.field241 != null) {
            this.field270 = this.field245.field7471;
            this.field275 = this.field245.field7465;
            this.field259 = this.field245.field7470;
            this.field274 = this.field286;
            this.field267 = this.field281;
            this.field248 = this.field279;
        } else {
            this.field275 = 1;
            this.field259 = 1;
            this.field270 = null;
            this.field267 = 1;
            this.field248 = 1;
            this.field274 = null;
        }
        this.field280 = null;
        this.method174();
    }

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(IIIIZ)Lho;", line = 2929)
    public final class318 method228(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int[] var6 = new int[arg2 * arg3];
        int var7 = this.field275 * arg1 + arg0;
        int var8 = this.field275 - arg2;
        for (int var9 = 0; var9 < arg3; ++var9) {
            int var10 = arg2 * var9;
            for (int var11 = 0; var11 < arg2; ++var11) {
                var6[var10 + var11] = this.field270[var7++];
            }
            var7 += var8;
        }
        if (arg4) {
            return new class196(this, var6, arg2, arg3);
        } else {
            return new class575(this, var6, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(Lmia;)V", line = 2962)
    public final void method229(class684 arg0) {
        class651 var2 = (class651) arg0;
        this.field275 = var2.field9094;
        this.field259 = var2.field9102;
        this.field270 = var2.field9098;
        this.field280 = var2;
        this.field267 = var2.field9094;
        this.field248 = var2.field9102;
        this.field274 = var2.field9099;
        this.method174();
    }

    @OriginalMember(owner = "client!nia", name = "GA", descriptor = "(I)V", line = 2973)
    public final void method230(int arg0) {
        this.method233(0, 0, this.field275, this.field259, arg0, 0);
    }

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(Lao;IIII)Lka;", line = 2976)
    public final class231 method231(class534 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class445(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!nia", name = "c", descriptor = "(I)V", line = 2980)
    public final void method232(int arg0) {
        int var2 = arg0 - this.field246;
        for (Object var3 = this.field257.method310((byte) -99); var3 != null; var3 = this.field257.method315(118)) {
            class225 var4 = (class225) var3;
            if (var4.field3418) {
                var4.field3421 += var2;
                int var5 = var4.field3421 / 20;
                if (var5 > 0) {
                    class744 var6 = super.field6556.method581(-21732, var4.field3422);
                    var4.method1519(var6.field10259 * var2 * 50 / 1000, var6.field10268 * var2 * 50 / 1000);
                    var4.field3421 -= var5 * 20;
                }
                var4.field3418 = false;
            }
        }
        this.field246 = arg0;
        this.field278.method308(-1, 5);
        this.field257.method308(-1, 5);
    }

    @OriginalMember(owner = "client!nia", name = "aa", descriptor = "(IIIIII)V", line = 3012)
    public final void method233(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < this.field258) {
            arg2 -= this.field258 - arg0;
            arg0 = this.field258;
        }
        if (arg1 < this.field276) {
            arg3 -= this.field276 - arg1;
            arg1 = this.field276;
        }
        if (arg0 + arg2 > this.field264) {
            arg2 = this.field264 - arg0;
        }
        if (arg1 + arg3 > this.field256) {
            arg3 = this.field256 - arg1;
        }
        if (arg2 > 0 && arg3 > 0 && arg0 <= this.field264 && arg1 <= this.field256) {
            int var7 = this.field275 - arg2;
            int var8 = this.field275 * arg1 + arg0;
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
                            this.field270[var24] = arg4;
                            ++var24;
                            this.field270[var24] = arg4;
                            ++var24;
                            this.field270[var24] = arg4;
                            ++var24;
                            this.field270[var24] = arg4;
                            ++var24;
                            this.field270[var24] = arg4;
                            ++var24;
                            this.field270[var24] = arg4;
                            ++var24;
                            this.field270[var24] = arg4;
                            ++var24;
                            this.field270[var24] = arg4;
                            --var26;
                        } while (var26 > 0);
                    }
                    if (var23 > 0) {
                        int var27 = var23;
                        do {
                            ++var24;
                            this.field270[var24] = arg4;
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
                        int var14 = this.field270[var8];
                        int var15 = ((var14 & 16711935) * var11 >> 8 & 16711935) + (((var14 & -16711936) >>> 8) * var11 & -16711936);
                        this.field270[var8++] = var10 + var15;
                    }
                    var8 += var7;
                }
            } else if (arg5 != 2) {
                throw new IllegalArgumentException();
            } else {
                for (int var16 = 0; var16 < arg3; ++var16) {
                    for (int var17 = -arg2; var17 < 0; ++var17) {
                        int var18 = this.field270[var8];
                        int var19 = arg4 + var18;
                        int var20 = (arg4 & 16711935) + (var18 & 16711935);
                        int var21 = (var19 - var20 & 65536) + (var20 & 16777472);
                        this.field270[var8++] = var19 - var21 | var21 - (var21 >>> 8);
                    }
                    var8 += var7;
                }
            }
        }
    }

    @OriginalMember(owner = "client!nia", name = "m", descriptor = "(I)[I", line = 3148)
    public final int[] method234(int arg0) {
        class39 var2 = this.field257;
        class225 var3;
        synchronized (this.field257) {
            var3 = (class225) this.field257.method312(0, (long) arg0 | Long.MIN_VALUE);
            if (var3 == null) {
                if (!super.field6556.method583(12101, arg0)) {
                    return null;
                }
                class744 var5 = super.field6556.method581(-21732, arg0);
                int var6 = !var5.field10265 && !this.field260 ? this.field263 : 64;
                var3 = new class225(arg0, var6, super.field6556.method579(arg0, 0.7F, true, 5084, var6, var6), var5.field10258 != 1);
                this.field257.method305(var3, (long) arg0 | Long.MIN_VALUE, 18320);
            }
        }
        var3.field3418 = true;
        return var3.method1517();
    }

    @OriginalMember(owner = "client!nia", name = "b", descriptor = "(IIIID)V", line = 3170)
    public final void method235(int arg0, int arg1, int arg2, int arg3, double arg4) {
        int var7 = this.field267 - arg2;
        int var8 = this.field267 * arg1 + arg0;
        float[] var9 = this.field274;
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

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(II)Lcn;", line = 3214)
    public final class621 method236(int arg0, int arg1) {
        return this.method183(arg0, arg1, false);
    }

    @OriginalMember(owner = "client!nia", name = "e", descriptor = "(I)V", line = 3217)
    public final void method237(int arg0) {
        this.field250[arg0].method3329((Runnable) null, true);
    }

    @OriginalMember(owner = "client!nia", name = "Y", descriptor = "()[I", line = 3221)
    public final int[] method238() {
        return new int[] { this.field273, this.field282, this.field249, this.field272 };
    }

    @OriginalMember(owner = "client!nia", name = "c", descriptor = "(Z)V", line = 3224)
    public final void method239(boolean arg0) {
        this.field260 = arg0;
        this.field257.method314(-2);
    }

    @OriginalMember(owner = "client!nia", name = "n", descriptor = "(I)[I", line = 3229)
    public final int[] method240(int arg0) {
        class39 var2 = this.field257;
        class225 var3;
        synchronized (this.field257) {
            var3 = (class225) this.field257.method312(0, (long) arg0);
            if (var3 == null) {
                if (!super.field6556.method583(12101, arg0)) {
                    return null;
                }
                class744 var5 = super.field6556.method581(-21732, arg0);
                int var6 = !var5.field10265 && !this.field260 ? this.field263 : 64;
                var3 = new class225(arg0, var6, super.field6556.method578(var6, true, arg0, 0.7F, true, var6), var5.field10258 != 1);
                this.field257.method305(var3, (long) arg0, 18320);
            }
        }
        var3.field3418 = true;
        return var3.method1517();
    }

    @OriginalMember(owner = "client!nia", name = "i", descriptor = "()I", line = 3249)
    public final int method241() {
        return this.field252;
    }

    @OriginalMember(owner = "client!nia", name = "DA", descriptor = "(IIII)V", line = 3253)
    public final void method242(int arg0, int arg1, int arg2, int arg3) {
        this.field273 = arg0;
        this.field282 = arg1;
        this.field249 = arg2;
        this.field272 = arg3;
        this.method191();
    }

    @OriginalMember(owner = "client!nia", name = "na", descriptor = "(IIII)[I", line = 3264)
    public final int[] method243(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = new int[arg2 * arg3];
        int var6 = 0;
        for (int var7 = 0; var7 < arg3; ++var7) {
            int var8 = (arg1 + var7) * this.field275 + arg0;
            for (int var9 = 0; var9 < arg2; ++var9) {
                var5[var6++] = this.field270[var8 + var9];
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!nia", name = "pa", descriptor = "()V", line = 3291)
    public final void method244() {
        for (int var1 = 0; var1 < this.field250.length; ++var1) {
            this.field250[var1].field7923 = this.field250[var1].field7926;
            this.field250[var1].field7936 = false;
        }
    }

    @OriginalMember(owner = "client!nia", name = "ra", descriptor = "(IIII)V", line = 3303)
    public final void method245(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field250.length; ++var5) {
            this.field250[var5].field7926 = this.field250[var5].field7923;
            this.field250[var5].field7935 = arg0;
            this.field250[var5].field7923 = arg1;
            this.field250[var5].field7932 = arg2;
            this.field250[var5].field7936 = true;
        }
    }

    @OriginalMember(owner = "client!nia", name = "c", descriptor = "(II)Lrca;", line = 3316)
    public final class36 method246(int arg0, int arg1) {
        return new class167(arg0, arg1);
    }

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(Lcn;Lrca;)Lmia;", line = 3319)
    public final class684 method247(class621 arg0, class36 arg1) {
        return new class651(this, (class318) arg0, (class167) arg1);
    }

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(II[I[I)Laa;", line = 3322)
    public final class87 method248(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class16(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(IIIIIILaa;IIIII)V", line = 3326)
    public final void method249(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class87 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        class16 var13 = (class16) arg6;
        int[] var14 = var13.field99;
        int[] var15 = var13.field94;
        int var16 = this.field276 > arg8 ? this.field276 : arg8;
        int var17 = this.field256 < var14.length + arg8 ? this.field256 : var14.length + arg8;
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
                        if (arg0 >= this.field258 && arg0 < this.field264 && var37 >= var16 && var37 < var17 && var22 < var19) {
                            int var39 = var14[var38] + arg7;
                            if (arg0 >= var39 && arg0 < var15[var38] + var39) {
                                int var40 = this.field275 * var37 + arg0;
                                int var41 = this.field270[var40];
                                int var42 = ((var41 & 16711935) * var36 >> 8 & 16711935) + ((var41 & 65280) * var36 >> 8 & 65280);
                                this.field270[var40] = var35 + var42;
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
                        if (arg0 >= this.field258 && arg0 < this.field264 && var44 >= var16 && var44 < var17 && var22 < var19) {
                            int var46 = var14[var45] + arg7;
                            if (arg0 >= var46 && arg0 < var15[var45] + var46) {
                                int var47 = this.field275 * var44 + arg0;
                                int var48 = this.field270[var47];
                                int var49 = arg4 + var48;
                                int var50 = (arg4 & 16711935) + (var48 & 16711935);
                                int var51 = (var49 - var50 & 65536) + (var50 & 16777472);
                                this.field270[var47] = var49 - var51 | var51 - (var51 >>> 8);
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
                    if (arg0 >= this.field258 && arg0 < this.field264 && var53 >= var16 && var53 < var17 && var22 < var19) {
                        int var55 = var14[var54] + arg7;
                        if (arg0 >= var55 && arg0 < var15[var54] + var55) {
                            this.field270[this.field275 * var53 + arg0] = arg4;
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
                    if (arg1 >= var16 && arg1 < var17 && var80 >= this.field258 && var80 < this.field264 && var22 < var19 && var80 >= var14[var81] + arg7 && var80 < var14[var81] + arg7 + var15[var81]) {
                        this.field270[this.field275 * arg1 + var80] = arg4;
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
                    if (arg1 >= var16 && arg1 < var17 && var66 >= this.field258 && var66 < this.field264 && var22 < var19 && var66 >= var14[var67] + arg7 && var66 < var14[var67] + arg7 + var15[var67]) {
                        int var68 = this.field275 * arg1 + var66;
                        int var69 = this.field270[var68];
                        int var70 = ((var69 & 16711935) * var65 >> 8 & 16711935) + ((var69 & 65280) * var65 >> 8 & 65280);
                        this.field270[this.field275 * arg1 + var66] = var64 + var70;
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
                    if (arg1 >= var16 && arg1 < var17 && var72 >= this.field258 && var72 < this.field264 && var22 < var19 && var72 >= var14[var73] + arg7 && var72 < var14[var73] + arg7 + var15[var73]) {
                        int var74 = this.field275 * arg1 + var72;
                        int var75 = this.field270[var74];
                        int var76 = arg4 + var75;
                        int var77 = (arg4 & 16711935) + (var75 & 16711935);
                        int var78 = (var76 - var77 & 65536) + (var77 & 16777472);
                        this.field270[var74] = var76 - var78 | var78 - (var78 >>> 8);
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

    @OriginalMember(owner = "client!nia", name = "o", descriptor = "()V", line = 3570)
    public final void method250() {
    }

    @OriginalMember(owner = "client!nia", name = "HA", descriptor = "(IIII[I)V", line = 3574)
    public final void method251(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        float var6 = (float) arg2 * this.field253.field10144 + (float) arg0 * this.field253.field10140 + (float) arg1 * this.field253.field10146 + this.field253.field10152;
        if (!(var6 < (float) this.field252) && !(var6 > (float) this.field262)) {
            int var7 = (int) (((float) arg2 * this.field253.field10143 + (float) arg0 * this.field253.field10149 + (float) arg1 * this.field253.field10147 + this.field253.field10148) * (float) this.field249 / (float) arg3);
            int var8 = (int) (((float) arg2 * this.field253.field10159 + (float) arg0 * this.field253.field10153 + (float) arg1 * this.field253.field10163 + this.field253.field10164) * (float) this.field272 / (float) arg3);
            if (var7 >= this.field254 && var7 <= this.field277 && var8 >= this.field266 && var8 <= this.field271) {
                arg4[0] = var7 - this.field254;
                arg4[1] = var8 - this.field266;
                arg4[2] = (int) var6;
            } else {
                arg4[0] = arg4[1] = arg4[2] = -1;
            }
        } else {
            arg4[0] = arg4[1] = arg4[2] = -1;
        }
    }

    @OriginalMember(owner = "client!nia", name = "T", descriptor = "(IIII)V", line = 3599)
    public final void method252(int arg0, int arg1, int arg2, int arg3) {
        if (this.field258 < arg0) {
            this.field258 = arg0;
        }
        if (this.field276 < arg1) {
            this.field276 = arg1;
        }
        if (this.field264 > arg2) {
            this.field264 = arg2;
        }
        if (this.field256 > arg3) {
            this.field256 = arg3;
        }
        this.method191();
    }

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(Lhda;)V", line = 3616)
    public final void method253(class714 arg0) {
        class563 var2 = this.method256(Thread.currentThread());
        class309 var3 = arg0.field9929.field3960;
        for (class309 var4 = var3.field4457; var3 != var4; var4 = var4.field4457) {
            class216 var5 = (class216) var4;
            int var6 = var5.field2979 >> 12;
            int var7 = var5.field2982 >> 12;
            int var8 = var5.field2978 >> 12;
            float var9 = (float) var8 * this.field253.field10144 + (float) var6 * this.field253.field10140 + (float) var7 * this.field253.field10146 + this.field253.field10152;
            if (!(var9 < (float) this.field252) && !(var9 > (float) var2.field7922)) {
                int var10 = (int) (((float) var8 * this.field253.field10143 + (float) var6 * this.field253.field10149 + (float) var7 * this.field253.field10147 + this.field253.field10148) * (float) this.field249 / var9) + this.field273;
                int var11 = (int) (((float) var8 * this.field253.field10159 + (float) var6 * this.field253.field10153 + (float) var7 * this.field253.field10163 + this.field253.field10164) * (float) this.field272 / var9) + this.field282;
                if (var10 >= this.field258 && var10 <= this.field264 && var11 >= this.field276 && var11 <= this.field256) {
                    if (var9 == 0.0F) {
                        var9 = 1.0F;
                    }
                    this.method149(var5, var10, var11, (int) var9, (int) ((float) (this.field249 * var5.field2975 >> 12) / var9));
                }
            }
        }
    }

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V", line = 3654)
    public final void method254(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class357 {
        if (this.field241 != null && this.field245 != null) {
            try {
                Graphics var5 = this.field241.getGraphics();
                for (int var6 = 0; var6 < arg1; ++var6) {
                    Rectangle var7 = arg0[var6];
                    if (var7.x + arg2 <= this.field275 && var7.y + arg3 <= this.field259 && var7.x + arg2 + var7.width > 0 && var7.y + arg3 + var7.height > 0) {
                        this.field245.method1622(var7.y, var7.width, var7.height, var7.y + arg3, (byte) -43, var7.x, var7.x + arg2, var5);
                    }
                }
            } catch (Exception var8) {
                this.field241.repaint();
            }
        } else {
            throw new IllegalStateException("off");
        }
    }

    @OriginalMember(owner = "client!nia", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ld;II)V", line = 3689)
    public class30(Canvas arg0, class101 arg1, int arg2, int arg3) {
        this(arg1);
        try {
            this.method221(arg0, arg2, arg3);
            this.method155(arg0);
        } catch (Throwable var6) {
            var6.printStackTrace();
            this.method2821((byte) 82);
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!nia", name = "L", descriptor = "(III)V", line = 3703)
    public final void method255(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field250.length; ++var4) {
            class563 var5 = this.field250[var4];
            var5.field7923 = arg0 & 16777215;
            int var6 = var5.field7923 >>> 16 & 255;
            if (var6 < 2) {
                var6 = 2;
            }
            int var7 = var5.field7923 >> 8 & 255;
            if (var7 < 2) {
                var7 = 2;
            }
            int var8 = var5.field7923 & 255;
            if (var8 < 2) {
                var8 = 2;
            }
            var5.field7923 = var6 << 16 | var7 << 8 | var8;
            if (arg1 < 0) {
                var5.field7931 = false;
            } else {
                var5.field7931 = true;
            }
        }
    }

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(Ljava/lang/Runnable;)Lmp;", line = 3751)
    public final class563 method256(Runnable arg0) {
        for (int var2 = 0; var2 < this.field283; ++var2) {
            if (this.field250[var2].field7928 == arg0) {
                return this.field250[var2];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!nia", name = "o", descriptor = "(I)Z", line = 3817)
    public final boolean method257(int arg0) {
        return super.field6556.method583(12101, arg0);
    }

    @OriginalMember(owner = "client!nia", name = "JA", descriptor = "(IIIIII)I", line = 3845)
    public final int method258(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = 0;
        float var8 = (float) arg2 * this.field253.field10144 + (float) arg0 * this.field253.field10140 + (float) arg1 * this.field253.field10146 + this.field253.field10152;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        float var9 = (float) arg5 * this.field253.field10144 + (float) arg3 * this.field253.field10140 + (float) arg4 * this.field253.field10146 + this.field253.field10152;
        if (var9 < 1.0F) {
            var9 = 1.0F;
        }
        if (var8 < (float) this.field252 && var9 < (float) this.field252) {
            var7 |= 16;
        } else if (var8 > (float) this.field262 && var9 > (float) this.field262) {
            var7 |= 32;
        }
        int var10 = (int) (((float) arg2 * this.field253.field10143 + (float) arg0 * this.field253.field10149 + (float) arg1 * this.field253.field10147 + this.field253.field10148) * (float) this.field249 / var8);
        int var11 = (int) (((float) arg5 * this.field253.field10143 + (float) arg3 * this.field253.field10149 + (float) arg4 * this.field253.field10147 + this.field253.field10148) * (float) this.field249 / var9);
        if (var10 < this.field254 && var11 < this.field254) {
            var7 |= 1;
        } else if (var10 > this.field277 && var11 > this.field277) {
            var7 |= 2;
        }
        int var12 = (int) (((float) arg2 * this.field253.field10159 + (float) arg0 * this.field253.field10153 + (float) arg1 * this.field253.field10163 + this.field253.field10164) * (float) this.field272 / var8);
        int var13 = (int) (((float) arg5 * this.field253.field10159 + (float) arg3 * this.field253.field10153 + (float) arg4 * this.field253.field10163 + this.field253.field10164) * (float) this.field272 / var9);
        if (var12 < this.field266 && var13 < this.field266) {
            var7 |= 4;
        } else if (var12 > this.field271 && var13 > this.field271) {
            var7 |= 8;
        }
        return var7;
    }
}
