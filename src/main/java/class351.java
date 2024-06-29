import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dda")
public class class351 extends class167 {

    @OriginalMember(owner = "client!dda", name = "t", descriptor = "Z")
    private boolean field5267;

    @OriginalMember(owner = "client!dda", name = "y", descriptor = "Z")
    private boolean field5272;

    @OriginalMember(owner = "client!dda", name = "u", descriptor = "Lsl;")
    private class427 field5268;

    @OriginalMember(owner = "client!dda", name = "K", descriptor = "Z")
    private boolean field5283;

    @OriginalMember(owner = "client!dda", name = "F", descriptor = "I")
    public int field5279;

    @OriginalMember(owner = "client!dda", name = "S", descriptor = "I")
    public int field5291;

    @OriginalMember(owner = "client!dda", name = "z", descriptor = "I")
    public int field5273;

    @OriginalMember(owner = "client!dda", name = "J", descriptor = "I")
    public int field5282;

    @OriginalMember(owner = "client!dda", name = "R", descriptor = "I")
    public int field5290;

    @OriginalMember(owner = "client!dda", name = "C", descriptor = "I")
    public int field5276;

    @OriginalMember(owner = "client!dda", name = "bb", descriptor = "I")
    public int field5299;

    @OriginalMember(owner = "client!dda", name = "U", descriptor = "I")
    public int field5292;

    @OriginalMember(owner = "client!dda", name = "P", descriptor = "I")
    private int field5288;

    @OriginalMember(owner = "client!dda", name = "ab", descriptor = "I")
    public int field5298;

    @OriginalMember(owner = "client!dda", name = "db", descriptor = "I")
    public int field5301;

    @OriginalMember(owner = "client!dda", name = "fb", descriptor = "I")
    public int field5303;

    @OriginalMember(owner = "client!dda", name = "ib", descriptor = "I")
    private int field5306;

    @OriginalMember(owner = "client!dda", name = "E", descriptor = "Laj;")
    private class287 field5278;

    @OriginalMember(owner = "client!dda", name = "lb", descriptor = "I")
    private int field5309;

    @OriginalMember(owner = "client!dda", name = "jb", descriptor = "Laj;")
    private class287 field5307;

    @OriginalMember(owner = "client!dda", name = "Z", descriptor = "Lg;")
    public class141 field5297;

    @OriginalMember(owner = "client!dda", name = "v", descriptor = "I")
    private int field5269;

    @OriginalMember(owner = "client!dda", name = "G", descriptor = "I")
    private int field5280;

    @OriginalMember(owner = "client!dda", name = "H", descriptor = "I")
    public int field5281;

    @OriginalMember(owner = "client!dda", name = "L", descriptor = "I")
    public int field5284;

    @OriginalMember(owner = "client!dda", name = "M", descriptor = "I")
    private int field5285;

    @OriginalMember(owner = "client!dda", name = "N", descriptor = "I")
    public int field5286;

    @OriginalMember(owner = "client!dda", name = "O", descriptor = "I")
    public int field5287;

    @OriginalMember(owner = "client!dda", name = "Q", descriptor = "I")
    public int field5289;

    @OriginalMember(owner = "client!dda", name = "V", descriptor = "I")
    public int field5293;

    @OriginalMember(owner = "client!dda", name = "W", descriptor = "I")
    private int field5294;

    @OriginalMember(owner = "client!dda", name = "X", descriptor = "I")
    public int field5295;

    @OriginalMember(owner = "client!dda", name = "Y", descriptor = "I")
    public int field5296;

    @OriginalMember(owner = "client!dda", name = "cb", descriptor = "I")
    public int field5300;

    @OriginalMember(owner = "client!dda", name = "eb", descriptor = "I")
    public int field5302;

    @OriginalMember(owner = "client!dda", name = "gb", descriptor = "I")
    public int field5304;

    @OriginalMember(owner = "client!dda", name = "w", descriptor = "Luf;")
    private class416 field5270;

    @OriginalMember(owner = "client!dda", name = "B", descriptor = "Lf;")
    private class702 field5275;

    @OriginalMember(owner = "client!dda", name = "kb", descriptor = "Lf;")
    private class702 field5308;

    @OriginalMember(owner = "client!dda", name = "x", descriptor = "Ljava/awt/Canvas;")
    private Canvas field5271;

    @OriginalMember(owner = "client!dda", name = "D", descriptor = "[I")
    public int[] field5277;

    @OriginalMember(owner = "client!dda", name = "hb", descriptor = "[I")
    public int[] field5305;

    @OriginalMember(owner = "client!dda", name = "A", descriptor = "[Lej;")
    private class108[] field5274;

    @OriginalMember(owner = "client!dda", name = "h", descriptor = "(I)[I")
    private final int[] method2269(int arg0) {
        class287 var2 = this.field5307;
        class67 var3;
        synchronized (this.field5307) {
            var3 = (class67) this.field5307.method1900((long) arg0, -42);
            if (var3 == null) {
                if (!super.field2768.method1499(arg0, -24052)) {
                    return null;
                }
                class699 var5 = super.field2768.method1500(arg0, -125);
                int var6 = !var5.field9836 && !this.field5283 ? 128 : 64;
                var3 = new class67(arg0, var6, super.field2768.method1496(arg0, var6, 0.7F, true, var6, -15473), var5.field9848);
                this.field5307.method1904(var3, (long) arg0, -1);
            }
        }
        var3.field1456 = true;
        return var3.method769();
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(II)I")
    public final int method35(int arg0, int arg1) {
        int var3 = arg0 | 133120;
        return var3 & arg1 ^ arg1;
    }

    @OriginalMember(owner = "client!dda", name = "s", descriptor = "()V")
    public final void method106() {
    }

    @OriginalMember(owner = "client!dda", name = "A", descriptor = "()Z")
    public final boolean method25() {
        return false;
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(IIIIIILua;II)V")
    public final void method24(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class619 arg6, int arg7, int arg8) {
        class446 var10 = (class446) arg6;
        int[] var11 = var10.field6421;
        int[] var12 = var10.field6418;
        int var13 = this.field5279 > arg8 ? this.field5279 : arg8;
        int var14 = this.field5273 < var11.length + arg8 ? this.field5273 : var11.length + arg8;
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
            if (arg0 < this.field5276) {
                var18 += (this.field5276 - arg0) * var20;
                arg0 = this.field5276;
            }
            if (var21 >= this.field5292) {
                var21 = this.field5292 - 1;
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
                                int var28 = this.field5286 * var25 + arg0;
                                int var29 = this.field5277[var28];
                                int var30 = ((var29 & 16711935) * var24 >> 8 & 16711935) + ((var29 & 65280) * var24 >> 8 & 65280);
                                this.field5277[var28] = var23 + var30;
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
                                int var34 = this.field5286 * var31 + arg0;
                                int var35 = this.field5277[var34];
                                int var36 = arg4 + var35;
                                int var37 = (arg4 & 16711935) + (var35 & 16711935);
                                int var38 = (var36 - var37 & 65536) + (var37 & 16777472);
                                this.field5277[var34] = var36 - var38 | var38 - (var38 >>> 8);
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
                            this.field5277[this.field5286 * var39 + arg0] = arg4;
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
                    if (var64 >= this.field5276 && var64 < this.field5292 && var64 >= var66 && var64 < var12[var65] + var66) {
                        this.field5277[this.field5286 * arg1 + var64] = arg4;
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
                    if (var50 >= this.field5276 && var50 < this.field5292 && var50 >= var52 && var50 < var12[var51] + var52) {
                        int var53 = this.field5286 * arg1 + var50;
                        int var54 = this.field5277[var53];
                        int var55 = ((var54 & 16711935) * var49 >> 8 & 16711935) + ((var54 & 65280) * var49 >> 8 & 65280);
                        this.field5277[this.field5286 * arg1 + var50] = var48 + var55;
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else if (arg5 == 2) {
                while (arg1 <= var46) {
                    int var56 = var43 >> 16;
                    int var57 = arg1 - arg8;
                    int var58 = var11[var57] + arg7;
                    if (var56 >= this.field5276 && var56 < this.field5292 && var56 >= var58 && var56 < var12[var57] + var58) {
                        int var59 = this.field5286 * arg1 + var56;
                        int var60 = this.field5277[var59];
                        int var61 = arg4 + var60;
                        int var62 = (arg4 & 16711935) + (var60 & 16711935);
                        int var63 = (var61 - var62 & 65536) + (var62 & 16777472);
                        this.field5277[var59] = var61 - var63 | var63 - (var63 >>> 8);
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!dda", name = "JA", descriptor = "()V")
    public final void method107() {
        this.field5276 = 0;
        this.field5279 = 0;
        this.field5292 = this.field5286;
        this.field5273 = this.field5285;
        this.method2273();
    }

    @OriginalMember(owner = "client!dda", name = "j", descriptor = "()I")
    public final int method151() {
        return 0;
    }

    @OriginalMember(owner = "client!dda", name = "g", descriptor = "(IIIIII)V")
    private final void method2270(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 < 0) {
            arg3 = -arg3;
        }
        int var7 = arg2 << 8;
        int var8 = arg1 - arg3;
        if (var8 < this.field5279) {
            var8 = this.field5279;
        }
        int var9 = arg1 + arg3 + 1;
        if (var9 > this.field5273) {
            var9 = this.field5273;
        }
        int var10 = var8;
        int var11 = arg3 * arg3;
        int var12 = 0;
        int var13 = arg1 - var8;
        int var14 = var13 * var13;
        int var15 = var14 - var13;
        if (arg1 > var9) {
            arg1 = var9;
        }
        int var16 = arg4 >>> 24;
        if (arg5 == 0 || arg5 == 1 && var16 == 255) {
            while (var10 < arg1) {
                while (var15 <= var11 || var14 <= var11) {
                    var14 += var12 + var12;
                    var15 += var12++ + var12;
                }
                int var66 = arg0 - var12 + 1;
                if (var66 < this.field5276) {
                    var66 = this.field5276;
                }
                int var67 = arg0 + var12;
                if (var67 > this.field5292) {
                    var67 = this.field5292;
                }
                int var68 = this.field5286 * var10 + var66;
                for (int var69 = var66; var69 < var67; ++var69) {
                    if (var7 < this.field5305[var68]) {
                        this.field5277[var68] = arg4;
                    }
                    ++var68;
                }
                ++var10;
                var14 -= var13-- + var13;
                var15 -= var13 + var13;
            }
            int var57 = arg3;
            int var58 = var10 - arg1;
            int var59 = var58 * var58 + var11;
            int var60 = var59 - arg3;
            int var61 = var59 - var58;
            while (var10 < var9) {
                while (var61 > var11 && var60 > var11) {
                    var61 -= var57-- + var57;
                    var60 -= var57 + var57;
                }
                int var62 = arg0 - var57;
                if (var62 < this.field5276) {
                    var62 = this.field5276;
                }
                int var63 = arg0 + var57;
                if (var63 > this.field5292 - 1) {
                    var63 = this.field5292 - 1;
                }
                int var64 = this.field5286 * var10 + var62;
                for (int var65 = var62; var65 <= var63; ++var65) {
                    if (var7 < this.field5305[var64]) {
                        this.field5277[var64] = arg4;
                    }
                    ++var64;
                }
                ++var10;
                var61 += var58 + var58;
                var60 += var58++ + var58;
            }
        } else if (arg5 == 1) {
            int var17 = (var16 << 24) + ((arg4 & 16711935) * var16 >> 8 & 16711935) + ((arg4 & 65280) * var16 >> 8 & 65280);
            int var18 = 256 - var16;
            while (var10 < arg1) {
                while (var15 <= var11 || var14 <= var11) {
                    var14 += var12 + var12;
                    var15 += var12++ + var12;
                }
                int var30 = arg0 - var12 + 1;
                if (var30 < this.field5276) {
                    var30 = this.field5276;
                }
                int var31 = arg0 + var12;
                if (var31 > this.field5292) {
                    var31 = this.field5292;
                }
                int var32 = this.field5286 * var10 + var30;
                for (int var33 = var30; var33 < var31; ++var33) {
                    if (var7 < this.field5305[var32]) {
                        int var34 = this.field5277[var32];
                        int var35 = ((var34 & 16711935) * var18 >> 8 & 16711935) + ((var34 & 65280) * var18 >> 8 & 65280);
                        this.field5277[var32] = var17 + var35;
                    }
                    ++var32;
                }
                ++var10;
                var14 -= var13-- + var13;
                var15 -= var13 + var13;
            }
            int var19 = arg3;
            int var20 = -var13;
            int var21 = var20 * var20 + var11;
            int var22 = var21 - arg3;
            int var23 = var21 - var20;
            while (var10 < var9) {
                while (var23 > var11 && var22 > var11) {
                    var23 -= var19-- + var19;
                    var22 -= var19 + var19;
                }
                int var24 = arg0 - var19;
                if (var24 < this.field5276) {
                    var24 = this.field5276;
                }
                int var25 = arg0 + var19;
                if (var25 > this.field5292 - 1) {
                    var25 = this.field5292 - 1;
                }
                int var26 = this.field5286 * var10 + var24;
                for (int var27 = var24; var27 <= var25; ++var27) {
                    if (var7 < this.field5305[var26]) {
                        int var28 = this.field5277[var26];
                        int var29 = ((var28 & 16711935) * var18 >> 8 & 16711935) + ((var28 & 65280) * var18 >> 8 & 65280);
                        this.field5277[var26] = var17 + var29;
                    }
                    ++var26;
                }
                ++var10;
                var23 += var20 + var20;
                var22 += var20++ + var20;
            }
        } else if (arg5 != 2) {
            throw new IllegalArgumentException();
        } else {
            while (var10 < arg1) {
                while (var15 <= var11 || var14 <= var11) {
                    var14 += var12 + var12;
                    var15 += var12++ + var12;
                }
                int var49 = arg0 - var12 + 1;
                if (var49 < this.field5276) {
                    var49 = this.field5276;
                }
                int var50 = arg0 + var12;
                if (var50 > this.field5292) {
                    var50 = this.field5292;
                }
                int var51 = this.field5286 * var10 + var49;
                for (int var52 = var49; var52 < var50; ++var52) {
                    if (var7 < this.field5305[var51]) {
                        int var53 = this.field5277[var51];
                        int var54 = arg4 + var53;
                        int var55 = (arg4 & 16711935) + (var53 & 16711935);
                        int var56 = (var54 - var55 & 65536) + (var55 & 16777472);
                        this.field5277[var51] = var54 - var56 | var56 - (var56 >>> 8);
                    }
                    ++var51;
                }
                ++var10;
                var14 -= var13-- + var13;
                var15 -= var13 + var13;
            }
            int var36 = arg3;
            int var37 = -var13;
            int var38 = var37 * var37 + var11;
            int var39 = var38 - arg3;
            int var40 = var38 - var37;
            while (var10 < var9) {
                while (var40 > var11 && var39 > var11) {
                    var40 -= var36-- + var36;
                    var39 -= var36 + var36;
                }
                int var41 = arg0 - var36;
                if (var41 < this.field5276) {
                    var41 = this.field5276;
                }
                int var42 = arg0 + var36;
                if (var42 > this.field5292 - 1) {
                    var42 = this.field5292 - 1;
                }
                int var43 = this.field5286 * var10 + var41;
                for (int var44 = var41; var44 <= var42; ++var44) {
                    if (var7 < this.field5305[var43]) {
                        int var45 = this.field5277[var43];
                        int var46 = arg4 + var45;
                        int var47 = (arg4 & 16711935) + (var45 & 16711935);
                        int var48 = (var46 - var47 & 65536) + (var47 & 16777472);
                        this.field5277[var43] = var46 - var48 | var48 - (var48 >>> 8);
                    }
                    ++var43;
                }
                ++var10;
                var40 += var37 + var37;
                var39 += var37++ + var37;
            }
        }
    }

    @OriginalMember(owner = "client!dda", name = "e", descriptor = "()Z")
    public final boolean method159() {
        return false;
    }

    @OriginalMember(owner = "client!dda", name = "b", descriptor = "(I)V")
    public final void method146(int arg0) {
        this.field5304 = arg0;
        this.field5274 = new class108[this.field5304];
        for (int var2 = 0; var2 < this.field5304; ++var2) {
            this.field5274[var2] = new class108(this);
        }
    }

    @OriginalMember(owner = "client!dda", name = "b", descriptor = "(Z)V")
    public final void method52(boolean arg0) {
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(I)V")
    public final void method134(int arg0) {
        this.field5274[arg0].method978(Thread.currentThread(), (byte) 107);
    }

    @OriginalMember(owner = "client!dda", name = "BA", descriptor = "()I")
    public final int method66() {
        return this.field5299;
    }

    @OriginalMember(owner = "client!dda", name = "q", descriptor = "()Z")
    public final boolean method12() {
        return false;
    }

    @OriginalMember(owner = "client!dda", name = "v", descriptor = "()[I")
    public final int[] method109() {
        return new int[] { this.field5302, this.field5284, this.field5298, this.field5290 };
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(IIZ)Lf;")
    public final class702 method186(int arg0, int arg1, boolean arg2) {
        return arg2 ? new class449(this, arg0, arg1) : new class267(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!dda", name = "U", descriptor = "()I")
    public final int method86() {
        return this.field5303;
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(Le;)V")
    public final void method84(class495 arg0) {
    }

    @OriginalMember(owner = "client!dda", name = "i", descriptor = "(I)Z")
    public final boolean method2271(int arg0) {
        return super.field2768.method1500(arg0, -106).field9846;
    }

    @OriginalMember(owner = "client!dda", name = "CA", descriptor = "(IIII)V")
    public final void method180(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field5274.length; ++var5) {
            this.field5274[var5].field1861 = this.field5274[var5].field1865;
            this.field5274[var5].field1867 = arg0;
            this.field5274[var5].field1865 = arg1;
            this.field5274[var5].field1872 = arg2;
            this.field5274[var5].field1864 = true;
        }
    }

    @OriginalMember(owner = "client!dda", name = "k", descriptor = "()Lq;")
    public final class396 method168() {
        return new class141();
    }

    @OriginalMember(owner = "client!dda", name = "j", descriptor = "(I)I")
    public final int method2272(int arg0) {
        return super.field2768.method1500(arg0, -19).field9828 & 65535;
    }

    @OriginalMember(owner = "client!dda", name = "D", descriptor = "()V")
    private final void method2273() {
        this.field5300 = this.field5276 - this.field5302;
        this.field5293 = this.field5292 - this.field5302;
        this.field5296 = this.field5279 - this.field5284;
        this.field5289 = this.field5273 - this.field5284;
        for (int var1 = 0; var1 < this.field5304; ++var1) {
            class599 var5 = this.field5274[var1].field1911;
            var5.field8579 = this.field5302 - this.field5276;
            var5.field8580 = this.field5284 - this.field5279;
            var5.field8578 = this.field5292 - this.field5276;
            var5.field8592 = this.field5273 - this.field5279;
        }
        int var2 = this.field5286 * this.field5279 + this.field5276;
        for (int var3 = this.field5279; var3 < this.field5273; ++var3) {
            for (int var4 = 0; var4 < this.field5304; ++var4) {
                this.field5274[var4].field1911.field8582[var3 - this.field5279] = var2;
            }
            var2 += this.field5286;
        }
    }

    @OriginalMember(owner = "client!dda", name = "k", descriptor = "(I)Z")
    public final boolean method2274(int arg0) {
        return super.field2768.method1499(arg0, -24052);
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(Lf;Z)V")
    public final void method132(class702 arg0, boolean arg1) {
        if (arg0 instanceof class267) {
            class267 var3 = (class267) arg0;
            this.field5286 = var3.field4802;
            this.field5285 = var3.field4807;
            this.field5277 = var3.field3951;
            this.field5275 = arg0;
        } else {
            if (!(arg0 instanceof class449)) {
                throw new RuntimeException();
            }
            class449 var4 = (class449) arg0;
            this.field5286 = var4.field4802;
            this.field5285 = var4.field4807;
            this.field5277 = var4.field6454;
            this.field5275 = arg0;
        }
        this.method2275();
    }

    @OriginalMember(owner = "client!dda", name = "x", descriptor = "()V")
    public final void method63() throws class105 {
        if (this.field5271 != null && this.field5270 != null) {
            try {
                Graphics var1 = this.field5271.getGraphics();
                this.field5270.method821(0, (byte) 78, 0, var1);
            } catch (Exception var2) {
                this.field5271.repaint();
            }
        } else {
            throw new IllegalStateException("off");
        }
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(Ldaa;[Lvw;Z)Lla;")
    public final class421 method160(class11 arg0, class279[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field4174;
            var5[var7] = arg1[var7].field4171;
            if (arg1[var7].field4170 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            if (var6) {
                return new class250(this, arg0, arg1, var4, var5);
            } else {
                return new class58(this, arg0, arg1, var4, var5);
            }
        } else if (var6) {
            throw new IllegalArgumentException("");
        } else {
            return new class558(this, arg0, arg1, var4, var5);
        }
    }

    @OriginalMember(owner = "client!dda", name = "E", descriptor = "()V")
    private final void method2275() {
        for (int var1 = 0; var1 < this.field5304; ++var1) {
            this.field5274[var1].method972((byte) -128);
        }
        this.method107();
    }

    @OriginalMember(owner = "client!dda", name = "V", descriptor = "(IIII)V")
    public final void method144(int arg0, int arg1, int arg2, int arg3) {
        if (this.field5276 < arg0) {
            this.field5276 = arg0;
        }
        if (this.field5279 < arg1) {
            this.field5279 = arg1;
        }
        if (this.field5292 > arg2) {
            this.field5292 = arg2;
        }
        if (this.field5273 > arg3) {
            this.field5273 = arg3;
        }
        this.method2273();
    }

    @OriginalMember(owner = "client!dda", name = "w", descriptor = "()Z")
    public final boolean method74() {
        return false;
    }

    @OriginalMember(owner = "client!dda", name = "AA", descriptor = "(III[I)V")
    public final void method93(int arg0, int arg1, int arg2, int[] arg3) {
        float var5 = (float) arg2 * this.field5297.field2471 + (float) arg0 * this.field5297.field2472 + (float) arg1 * this.field5297.field2501 + this.field5297.field2480;
        if (!(var5 < (float) this.field5299) && !(var5 > (float) this.field5303)) {
            int var6 = (int) (((float) arg2 * this.field5297.field2495 + (float) arg0 * this.field5297.field2497 + (float) arg1 * this.field5297.field2485 + this.field5297.field2482) * (float) this.field5298 / var5);
            int var7 = (int) (((float) arg2 * this.field5297.field2473 + (float) arg0 * this.field5297.field2476 + (float) arg1 * this.field5297.field2498 + this.field5297.field2496) * (float) this.field5290 / var5);
            if (var6 >= this.field5300 && var6 <= this.field5293 && var7 >= this.field5296 && var7 <= this.field5289) {
                arg3[0] = var6 - this.field5300;
                arg3[1] = var7 - this.field5296;
                arg3[2] = (int) var5;
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!dda", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method46(Canvas arg0) {
        class416 var2 = (class416) this.field5268.method2596((long) arg0.hashCode(), 76);
        if (var2 == null) {
            class416 var3 = class30.method505((byte) 28, arg0);
            this.field5268.method2598(var3, (long) arg0.hashCode(), (byte) 8);
        }
    }

    @OriginalMember(owner = "client!dda", name = "m", descriptor = "()Z")
    public final boolean method171() {
        return false;
    }

    @OriginalMember(owner = "client!dda", name = "J", descriptor = "(IIIIII)V")
    public final void method4(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < this.field5276) {
            arg2 -= this.field5276 - arg0;
            arg0 = this.field5276;
        }
        if (arg1 < this.field5279) {
            arg3 -= this.field5279 - arg1;
            arg1 = this.field5279;
        }
        if (arg0 + arg2 > this.field5292) {
            arg2 = this.field5292 - arg0;
        }
        if (arg1 + arg3 > this.field5273) {
            arg3 = this.field5273 - arg1;
        }
        if (arg2 > 0 && arg3 > 0 && arg0 <= this.field5292 && arg1 <= this.field5273) {
            int var7 = this.field5286 - arg2;
            int var8 = this.field5286 * arg1 + arg0;
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
                            this.field5277[var24] = arg4;
                            ++var24;
                            this.field5277[var24] = arg4;
                            ++var24;
                            this.field5277[var24] = arg4;
                            ++var24;
                            this.field5277[var24] = arg4;
                            ++var24;
                            this.field5277[var24] = arg4;
                            ++var24;
                            this.field5277[var24] = arg4;
                            ++var24;
                            this.field5277[var24] = arg4;
                            ++var24;
                            this.field5277[var24] = arg4;
                            --var26;
                        } while (var26 > 0);
                    }
                    if (var23 > 0) {
                        int var27 = var23;
                        do {
                            ++var24;
                            this.field5277[var24] = arg4;
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
                        int var14 = this.field5277[var8];
                        int var15 = ((var14 & 16711935) * var11 >> 8 & 16711935) + (((var14 & -16711936) >>> 8) * var11 & -16711936);
                        this.field5277[var8++] = var10 + var15;
                    }
                    var8 += var7;
                }
            } else if (arg5 != 2) {
                throw new IllegalArgumentException();
            } else {
                for (int var16 = 0; var16 < arg3; ++var16) {
                    for (int var17 = -arg2; var17 < 0; ++var17) {
                        int var18 = this.field5277[var8];
                        int var19 = arg4 + var18;
                        int var20 = (arg4 & 16711935) + (var18 & 16711935);
                        int var21 = (var19 - var20 & 65536) + (var20 & 16777472);
                        this.field5277[var8++] = var19 - var21 | var21 - (var21 >>> 8);
                    }
                    var8 += var7;
                }
            }
        }
    }

    @OriginalMember(owner = "client!dda", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lfa;)V")
    public class351(Canvas arg0, class214 arg1) {
        this(arg1);
        this.method46(arg0);
        this.method185(arg0);
    }

    @OriginalMember(owner = "client!dda", name = "B", descriptor = "()Z")
    public final boolean method162() {
        return false;
    }

    @OriginalMember(owner = "client!dda", name = "f", descriptor = "(IIIIII)Ljs;")
    public final class304 method96(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!dda", name = "GA", descriptor = "(II)V")
    public final void method11(int arg0, int arg1) {
        class108 var3 = this.method2278(Thread.currentThread());
        this.field5299 = arg0;
        this.field5303 = arg1;
        var3.field1866 = this.field5303 - 255;
    }

    @OriginalMember(owner = "client!dda", name = "t", descriptor = "()Z")
    public final boolean method181() {
        return false;
    }

    @OriginalMember(owner = "client!dda", name = "e", descriptor = "(IIIII)V")
    public final void method85(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var6 = arg1 - arg2;
        if (var6 < this.field5279) {
            var6 = this.field5279;
        }
        int var7 = arg1 + arg2 + 1;
        if (var7 > this.field5273) {
            var7 = this.field5273;
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
                if (var64 < this.field5276) {
                    var64 = this.field5276;
                }
                int var65 = arg0 + var10;
                if (var65 > this.field5292) {
                    var65 = this.field5292;
                }
                int var66 = this.field5286 * var8 + var64;
                for (int var67 = var64; var67 < var65; ++var67) {
                    this.field5277[var66++] = arg3;
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
                if (var60 < this.field5276) {
                    var60 = this.field5276;
                }
                int var61 = arg0 + var55;
                if (var61 > this.field5292 - 1) {
                    var61 = this.field5292 - 1;
                }
                int var62 = this.field5286 * var8 + var60;
                for (int var63 = var60; var63 <= var61; ++var63) {
                    this.field5277[var62++] = arg3;
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
                if (var28 < this.field5276) {
                    var28 = this.field5276;
                }
                int var29 = arg0 + var10;
                if (var29 > this.field5292) {
                    var29 = this.field5292;
                }
                int var30 = this.field5286 * var8 + var28;
                for (int var31 = var28; var31 < var29; ++var31) {
                    int var32 = this.field5277[var30];
                    int var33 = ((var32 & 16711935) * var16 >> 8 & 16711935) + ((var32 & 65280) * var16 >> 8 & 65280);
                    this.field5277[var30++] = var15 + var33;
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
                if (var22 < this.field5276) {
                    var22 = this.field5276;
                }
                int var23 = arg0 + var17;
                if (var23 > this.field5292 - 1) {
                    var23 = this.field5292 - 1;
                }
                int var24 = this.field5286 * var8 + var22;
                for (int var25 = var22; var25 <= var23; ++var25) {
                    int var26 = this.field5277[var24];
                    int var27 = ((var26 & 16711935) * var16 >> 8 & 16711935) + ((var26 & 65280) * var16 >> 8 & 65280);
                    this.field5277[var24++] = var15 + var27;
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
                if (var47 < this.field5276) {
                    var47 = this.field5276;
                }
                int var48 = arg0 + var10;
                if (var48 > this.field5292) {
                    var48 = this.field5292;
                }
                int var49 = this.field5286 * var8 + var47;
                for (int var50 = var47; var50 < var48; ++var50) {
                    int var51 = this.field5277[var49];
                    int var52 = arg3 + var51;
                    int var53 = (arg3 & 16711935) + (var51 & 16711935);
                    int var54 = (var52 - var53 & 65536) + (var53 & 16777472);
                    this.field5277[var49++] = var52 - var54 | var54 - (var54 >>> 8);
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
                if (var39 < this.field5276) {
                    var39 = this.field5276;
                }
                int var40 = arg0 + var34;
                if (var40 > this.field5292 - 1) {
                    var40 = this.field5292 - 1;
                }
                int var41 = this.field5286 * var8 + var39;
                for (int var42 = var39; var42 <= var40; ++var42) {
                    int var43 = this.field5277[var41];
                    int var44 = arg3 + var43;
                    int var45 = (arg3 & 16711935) + (var43 & 16711935);
                    int var46 = (var44 - var45 & 65536) + (var45 & 16777472);
                    this.field5277[var41++] = var44 - var46 | var46 - (var46 >>> 8);
                }
                ++var8;
                var38 += var35 + var35;
                var37 += var35++ + var35;
            }
        }
    }

    @OriginalMember(owner = "client!dda", name = "d", descriptor = "(I)V")
    public final void method64(int arg0) {
        this.field5274[arg0].method978((Runnable) null, (byte) -99);
    }

    @OriginalMember(owner = "client!dda", name = "g", descriptor = "()V")
    public final void method111() {
        if (this.field5271 != null) {
            this.field5277 = this.field5270.field6016;
            this.field5286 = this.field5270.field6015;
            this.field5285 = this.field5270.field6019;
        } else {
            this.field5286 = 1;
            this.field5285 = 1;
            this.field5277 = null;
        }
        this.field5275 = null;
        this.method2275();
    }

    @OriginalMember(owner = "client!dda", name = "m", descriptor = "(IIIII)V")
    public final void method69(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 >= this.field5276 && arg0 < this.field5292) {
            if (arg1 < this.field5279) {
                arg2 -= this.field5279 - arg1;
                arg1 = this.field5279;
            }
            if (arg1 + arg2 > this.field5273) {
                arg2 = this.field5273 - arg1;
            }
            int var6 = this.field5286 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field5286 * var10 + var6;
                        int var12 = this.field5277[var11];
                        int var13 = ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & 65280) * var9 >> 8 & 65280);
                        this.field5277[var11] = var8 + var13;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var14 = 0; var14 < arg2; ++var14) {
                        int var15 = this.field5286 * var14 + var6;
                        int var16 = this.field5277[var15];
                        int var17 = arg3 + var16;
                        int var18 = (arg3 & 16711935) + (var16 & 16711935);
                        int var19 = (var17 - var18 & 65536) + (var18 & 16777472);
                        this.field5277[var15] = var17 - var19 | var19 - (var19 >>> 8);
                    }
                }
            } else {
                for (int var20 = 0; var20 < arg2; ++var20) {
                    this.field5277[this.field5286 * var20 + var6] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(Ljs;)V")
    public final void method165(class304 arg0) {
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(Lvh;IIII)V")
    private final void method2276(class332 arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = arg0.field4840;
        int var8 = arg4 << 1;
        if (var6 == -1) {
            this.method2270(arg1, arg2, arg3, arg4, arg0.field4835, 1);
        } else {
            if (this.field5309 != var6) {
                class702 var9 = (class702) this.field5278.method1900((long) var6, -90);
                if (var9 == null) {
                    int[] var10 = this.method2269(var6);
                    if (var10 == null) {
                        return;
                    }
                    int var11 = this.method2279(var6) ? 64 : 128;
                    var9 = this.method54(var10, 0, var11, var11, var11);
                    this.field5278.method1904(var9, (long) var6, -1);
                }
                this.field5309 = var6;
                this.field5308 = var9;
            }
            ++var8;
            ((class327) this.field5308).method1747(arg1 - arg4, arg2 - arg4, arg3, var8, var8, 0, arg0.field4835, 1, 1);
        }
    }

    @OriginalMember(owner = "client!dda", name = "ya", descriptor = "()V")
    public final void method28() {
        if (this.field5276 == 0 && this.field5292 == this.field5286 && this.field5279 == 0 && this.field5285 == this.field5273) {
            int var1 = this.field5305.length;
            int var2 = var1 - var1 & 7;
            int var3 = 0;
            while (var3 < var2) {
                this.field5305[var3++] = Integer.MAX_VALUE;
                this.field5305[var3++] = Integer.MAX_VALUE;
                this.field5305[var3++] = Integer.MAX_VALUE;
                this.field5305[var3++] = Integer.MAX_VALUE;
                this.field5305[var3++] = Integer.MAX_VALUE;
                this.field5305[var3++] = Integer.MAX_VALUE;
                this.field5305[var3++] = Integer.MAX_VALUE;
                this.field5305[var3++] = Integer.MAX_VALUE;
            }
            while (var3 < var1) {
                this.field5305[var3++] = Integer.MAX_VALUE;
            }
        } else {
            int var4 = this.field5292 - this.field5276;
            int var5 = this.field5273 - this.field5279;
            int var6 = this.field5286 - var4;
            int var7 = this.field5286 * this.field5279 + this.field5276;
            int var8 = var4 >> 3;
            int var9 = var4 & 7;
            int var10 = var7 - 1;
            for (int var11 = -var5; var11 < 0; ++var11) {
                if (var8 > 0) {
                    int var12 = var8;
                    do {
                        ++var10;
                        this.field5305[var10] = Integer.MAX_VALUE;
                        ++var10;
                        this.field5305[var10] = Integer.MAX_VALUE;
                        ++var10;
                        this.field5305[var10] = Integer.MAX_VALUE;
                        ++var10;
                        this.field5305[var10] = Integer.MAX_VALUE;
                        ++var10;
                        this.field5305[var10] = Integer.MAX_VALUE;
                        ++var10;
                        this.field5305[var10] = Integer.MAX_VALUE;
                        ++var10;
                        this.field5305[var10] = Integer.MAX_VALUE;
                        ++var10;
                        this.field5305[var10] = Integer.MAX_VALUE;
                        --var12;
                    } while (var12 > 0);
                }
                if (var9 > 0) {
                    int var13 = var9;
                    do {
                        ++var10;
                        this.field5305[var10] = Integer.MAX_VALUE;
                        --var13;
                    } while (var13 > 0);
                }
                var10 += var6;
            }
        }
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(Z)V")
    public final void method163(boolean arg0) {
        this.field5283 = arg0;
        this.field5307.method1913(true);
    }

    @OriginalMember(owner = "client!dda", name = "YA", descriptor = "(IIII)V")
    public final void method39(int arg0, int arg1, int arg2, int arg3) {
        class108 var5 = this.method2278(Thread.currentThread());
        var5.field1867 = arg0;
        var5.field1865 = arg1;
        var5.field1872 = arg2;
    }

    @OriginalMember(owner = "client!dda", name = "i", descriptor = "()V")
    public final void method2() {
    }

    @OriginalMember(owner = "client!dda", name = "c", descriptor = "()Lq;")
    public final class396 method53() {
        class108 var1 = this.method2278(Thread.currentThread());
        return var1.field1878;
    }

    @OriginalMember(owner = "client!dda", name = "oa", descriptor = "([I)V")
    public final void method131(int[] arg0) {
        arg0[0] = this.field5276;
        arg0[1] = this.field5279;
        arg0[2] = this.field5292;
        arg0[3] = this.field5273;
    }

    @OriginalMember(owner = "client!dda", name = "la", descriptor = "(IIII)V")
    public final void method62(int arg0, int arg1, int arg2, int arg3) {
        this.field5302 = arg0;
        this.field5284 = arg1;
        this.field5298 = arg2;
        this.field5290 = arg3;
        this.method2273();
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(Lfi;I)V")
    public final void method72(class518 arg0, int arg1) {
        class108 var3 = this.method2278(Thread.currentThread());
        class347 var4 = arg0.field7307.field3152;
        for (class347 var5 = var4.field5168; var4 != var5; var5 = var5.field5168) {
            class332 var6 = (class332) var5;
            int var7 = var6.field4831 >> 12;
            int var8 = var6.field4833 >> 12;
            int var9 = var6.field4837 >> 12;
            float var10 = (float) var9 * this.field5297.field2471 + (float) var7 * this.field5297.field2472 + (float) var8 * this.field5297.field2501 + this.field5297.field2480;
            if (!(var10 < (float) this.field5299) && !(var10 > (float) var3.field1866)) {
                int var11 = (int) (((float) var9 * this.field5297.field2495 + (float) var7 * this.field5297.field2497 + (float) var8 * this.field5297.field2485 + this.field5297.field2482) * (float) this.field5298 / (float) arg1) + this.field5302;
                int var12 = (int) (((float) var9 * this.field5297.field2473 + (float) var7 * this.field5297.field2476 + (float) var8 * this.field5297.field2498 + this.field5297.field2496) * (float) this.field5290 / (float) arg1) + this.field5284;
                if (var11 >= this.field5276 && var11 <= this.field5292 && var12 >= this.field5279 && var12 <= this.field5273) {
                    if (var10 == 0.0F) {
                        var10 = 1.0F;
                    }
                    this.method2276(var6, var11, var12, (int) var10, (this.field5298 * var6.field4838 >> 12) / arg1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!dda", name = "y", descriptor = "()V")
    public final void method103() {
        this.field5307.method1913(true);
        this.field5278.method1913(true);
    }

    @OriginalMember(owner = "client!dda", name = "g", descriptor = "(I)V")
    public final void method122(int arg0) {
        int var2 = arg0 - this.field5269;
        for (Object var3 = this.field5307.method1906((byte) -103); var3 != null; var3 = this.field5307.method1907((byte) 99)) {
            class67 var4 = (class67) var3;
            if (var4.field1456) {
                var4.field1453 += var2;
                int var5 = var4.field1453 / 20;
                if (var5 > 0) {
                    class699 var6 = super.field2768.method1500(var4.field1451, -44);
                    var4.method771(var6.field9852 * var2 * 50 / 1000, var6.field9834 * var2 * 50 / 1000);
                    var4.field1453 -= var5 * 20;
                }
                var4.field1456 = false;
            }
        }
        this.field5269 = arg0;
        this.field5278.method1908(5, (byte) -11);
        this.field5307.method1908(5, (byte) -11);
    }

    @OriginalMember(owner = "client!dda", name = "r", descriptor = "()Z")
    public final boolean method147() {
        return true;
    }

    @OriginalMember(owner = "client!dda", name = "u", descriptor = "()Lmp;")
    public final class706 method19() {
        return new class706(0, "Pure Java", 1, "CPU", 0L);
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method185(Canvas arg0) {
        if (arg0 != null) {
            class416 var2 = (class416) this.field5268.method2596((long) arg0.hashCode(), 100);
            if (var2 != null) {
                this.field5271 = arg0;
                this.field5270 = var2;
                if (this.field5275 == null) {
                    this.field5277 = var2.field6016;
                    this.field5286 = var2.field6015;
                    this.field5285 = var2.field6019;
                    if (this.field5286 != this.field5280 || this.field5294 != this.field5285) {
                        this.field5280 = this.field5286;
                        this.field5294 = this.field5285;
                        this.field5305 = new int[this.field5294 * this.field5280];
                    }
                    this.method2275();
                    return;
                }
            }
        } else {
            this.field5271 = null;
            this.field5270 = null;
            if (this.field5275 == null) {
                this.field5277 = null;
                this.field5286 = this.field5285 = 1;
                this.field5280 = this.field5294 = 1;
                this.method2275();
            }
        }
    }

    @OriginalMember(owner = "client!dda", name = "c", descriptor = "(IIIIII)V")
    public final void method108(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method126(arg0, arg1, arg2, arg4, arg5);
        this.method126(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method69(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
        this.method69(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(FFF)V")
    public final void method27(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(II[[I[[IIII)Li;")
    public final class37 method113(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class647(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(Ljs;Ljs;FLjs;)Ljs;")
    public final class304 method89(class304 arg0, class304 arg1, float arg2, class304 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(II[I[I)Lua;")
    public final class619 method158(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class446(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!dda", name = "O", descriptor = "(IIIIII)Z")
    public final boolean method33(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        float var7 = (float) arg2 * this.field5297.field2471 + (float) arg0 * this.field5297.field2472 + (float) arg1 * this.field5297.field2501 + this.field5297.field2480;
        if (var7 < 1.0F) {
            var7 = 1.0F;
        }
        float var8 = (float) arg5 * this.field5297.field2471 + (float) arg3 * this.field5297.field2472 + (float) arg4 * this.field5297.field2501 + this.field5297.field2480;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        if ((!(var7 < (float) this.field5299) || !(var8 < (float) this.field5299)) && (!(var7 > (float) this.field5303) || !(var8 > (float) this.field5303))) {
            int var9 = (int) (((float) arg2 * this.field5297.field2495 + (float) arg0 * this.field5297.field2497 + (float) arg1 * this.field5297.field2485 + this.field5297.field2482) * (float) this.field5298 / var7);
            int var10 = (int) (((float) arg5 * this.field5297.field2495 + (float) arg3 * this.field5297.field2497 + (float) arg4 * this.field5297.field2485 + this.field5297.field2482) * (float) this.field5298 / var8);
            if (var9 < this.field5300 && var10 < this.field5300 || var9 > this.field5293 && var10 > this.field5293) {
                return false;
            } else {
                int var11 = (int) (((float) arg2 * this.field5297.field2473 + (float) arg0 * this.field5297.field2476 + (float) arg1 * this.field5297.field2498 + this.field5297.field2496) * (float) this.field5290 / var7);
                int var12 = (int) (((float) arg5 * this.field5297.field2473 + (float) arg3 * this.field5297.field2476 + (float) arg4 * this.field5297.field2498 + this.field5297.field2496) * (float) this.field5290 / var8);
                return (var11 >= this.field5296 || var12 >= this.field5296) && (var11 <= this.field5289 || var12 <= this.field5289);
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dda", name = "b", descriptor = "(IIIIIIIIII)V")
    public final void method2277(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg3 != 0 && arg4 != 0) {
            if (arg6 != 65535 && !super.field2768.method1500(arg6, -104).field9844) {
                if (this.field5309 != arg6) {
                    class702 var11 = (class702) this.field5278.method1900((long) arg6, 102);
                    if (var11 == null) {
                        int[] var12 = this.method2269(arg6);
                        if (var12 == null) {
                            return;
                        }
                        int var13 = this.method2279(arg6) ? 64 : 128;
                        var11 = this.method54(var12, 0, var13, var13, var13);
                        this.field5278.method1904(var11, (long) arg6, -1);
                    }
                    this.field5309 = arg6;
                    this.field5308 = var11;
                }
                ((class327) this.field5308).method1747(arg0 - arg3, arg1 - arg4, arg2, arg3 << 1, arg4 << 1, arg8, arg7, arg9, 1);
            } else {
                this.method2270(arg0, arg1, arg2, arg3, arg7, arg9);
            }
        }
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(IIII)V")
    public final void method140(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!dda", name = "ZA", descriptor = "(Z)V")
    public final void method81(boolean arg0) {
        class108 var2 = this.method2278(Thread.currentThread());
        var2.field1868 = arg0;
    }

    @OriginalMember(owner = "client!dda", name = "b", descriptor = "(II)I")
    public final int method34(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!dda", name = "z", descriptor = "()V")
    public final void method174() {
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(Lq;)V")
    public final void method145(class396 arg0) {
        this.field5297 = (class141) arg0;
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(IIIIIII)V")
    public final void method92(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class108 var8 = this.method2278(Thread.currentThread());
        class599 var9 = var8.field1911;
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
            int var23 = arg0 - var9.method3408();
            int var24 = arg1 - var9.method3404();
            int var25 = var19 + var23;
            int var26 = var23 - var20;
            int var27 = var17 + var23 - var20;
            int var28 = var17 + var23 + var19;
            int var29 = var21 + var24;
            int var30 = var24 - var22;
            int var31 = var18 + var24 - var22;
            int var32 = var18 + var24 + var21;
            if (arg6 == 0) {
                var9.field8590 = 0;
            } else {
                if (arg6 != 1) {
                    throw new IllegalArgumentException();
                }
                var9.field8590 = 255 - (arg4 >>> 24);
            }
            this.method81(false);
            var9.field8584 = var25 < 0 || var25 > var9.field8578 || var26 < 0 || var26 > var9.field8578 || var27 < 0 || var27 > var9.field8578;
            var9.method3412(var29, var30, var31, var25, var26, var27, 100, 100, 100, arg4);
            var9.field8584 = var25 < 0 || var25 > var9.field8578 || var27 < 0 || var27 > var9.field8578 || var28 < 0 || var28 > var9.field8578;
            var9.method3412(var29, var31, var32, var25, var27, var28, 100, 100, 100, arg4);
            this.method81(true);
        }
    }

    @OriginalMember(owner = "client!dda", name = "l", descriptor = "()Z")
    public final boolean method98() {
        return true;
    }

    @OriginalMember(owner = "client!dda", name = "da", descriptor = "(IIII)V")
    public final void method142(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > this.field5286) {
            arg2 = this.field5286;
        }
        if (arg3 > this.field5285) {
            arg3 = this.field5285;
        }
        this.field5276 = arg0;
        this.field5292 = arg2;
        this.field5279 = arg1;
        this.field5273 = arg3;
        this.method2273();
    }

    @OriginalMember(owner = "client!dda", name = "DA", descriptor = "()I")
    public final int method116() {
        int var1 = this.field5306;
        this.field5306 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(Lvw;Z)Lf;")
    public final class702 method170(class279 arg0, boolean arg1) {
        int[] var3 = arg0.field4169;
        byte[] var4 = arg0.field4167;
        int var5 = arg0.field4174;
        int var6 = arg0.field4171;
        class327 var11;
        if (arg1 && arg0.field4170 == null) {
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
            var11 = new class299(this, var8, var7, var5, var6);
        } else {
            int[] var14 = new int[var5 * var6];
            byte[] var15 = arg0.field4170;
            if (var15 != null) {
                for (int var16 = 0; var16 < var6; ++var16) {
                    int var17 = var5 * var16;
                    for (int var18 = 0; var18 < var5; ++var18) {
                        var14[var17 + var18] = var3[var4[var17 + var18] & 255] | var15[var17 + var18] << 24;
                    }
                }
                var11 = new class449(this, var14, var5, var6);
            } else {
                for (int var19 = 0; var19 < var6; ++var19) {
                    int var20 = var5 * var19;
                    for (int var21 = 0; var21 < var5; ++var21) {
                        int var22 = var3[var4[var20 + var21] & 255];
                        var14[var20 + var21] = var22 != 0 ? -16777216 | var22 : 0;
                    }
                }
                var11 = new class267(this, var14, var5, var6);
            }
        }
        var11.method1787(arg0.field4168, arg0.field4172, arg0.field4173, arg0.field4175);
        return var11;
    }

    @OriginalMember(owner = "client!dda", name = "n", descriptor = "()V")
    public final void method40() {
        if (this.field5267) {
            class543.method3130(false, true, 90);
            this.field5267 = false;
        }
        this.field5270 = null;
        this.field5271 = null;
        this.field5268 = null;
        this.field5272 = true;
    }

    @OriginalMember(owner = "client!dda", name = "va", descriptor = "(I)V")
    public final void method48(int arg0) {
    }

    @OriginalMember(owner = "client!dda", name = "MA", descriptor = "(III[I)V")
    public final void method178(int arg0, int arg1, int arg2, int[] arg3) {
        float var5 = (float) arg2 * this.field5297.field2471 + (float) arg0 * this.field5297.field2472 + (float) arg1 * this.field5297.field2501 + this.field5297.field2480;
        if (!(var5 < (float) this.field5299) && !(var5 > (float) this.field5303)) {
            int var6 = (int) (((float) arg2 * this.field5297.field2495 + (float) arg0 * this.field5297.field2497 + (float) arg1 * this.field5297.field2485 + this.field5297.field2482) * (float) this.field5298 / var5);
            int var7 = (int) (((float) arg2 * this.field5297.field2473 + (float) arg0 * this.field5297.field2476 + (float) arg1 * this.field5297.field2498 + this.field5297.field2496) * (float) this.field5290 / var5);
            arg3[0] = var6 - this.field5300;
            arg3[1] = var7 - this.field5296;
            arg3[2] = (int) var5;
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!dda", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method23(Canvas arg0) {
        if (this.field5271 == arg0) {
            this.method185((Canvas) null);
        }
        class416 var2 = (class416) this.field5268.method2596((long) arg0.hashCode(), 105);
        if (var2 != null) {
            var2.method2588(300);
        }
    }

    @OriginalMember(owner = "client!dda", name = "XA", descriptor = "(IIIII)V")
    public final void method126(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 >= this.field5279 && arg1 < this.field5273) {
            if (arg0 < this.field5276) {
                arg2 -= this.field5276 - arg0;
                arg0 = this.field5276;
            }
            if (arg0 + arg2 > this.field5292) {
                arg2 = this.field5292 - arg0;
            }
            int var6 = this.field5286 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field5277[var6 + var10];
                        int var12 = ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & 65280) * var9 >> 8 & 65280);
                        this.field5277[var6 + var10] = var8 + var12;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var13 = 0; var13 < arg2; ++var13) {
                        int var14 = this.field5277[var6 + var13];
                        int var15 = arg3 + var14;
                        int var16 = (arg3 & 16711935) + (var14 & 16711935);
                        int var17 = (var15 - var16 & 65536) + (var16 & 16777472);
                        this.field5277[var6 + var13] = var15 - var17 | var17 - (var17 >>> 8);
                    }
                }
            } else {
                for (int var18 = 0; var18 < arg2; ++var18) {
                    this.field5277[var6 + var18] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method29(Rectangle[] arg0, int arg1) throws class105 {
        if (this.field5271 != null && this.field5270 != null) {
            try {
                Graphics var3 = this.field5271.getGraphics();
                for (int var4 = 0; var4 < arg1; ++var4) {
                    Rectangle var5 = arg0[var4];
                    if (var5.x <= this.field5286 && var5.y <= this.field5285 && var5.x + var5.width > 0 && var5.y + var5.height > 0) {
                        this.field5270.method820(var5.y, var5.height, -45, var5.width, var3, var5.x);
                    }
                }
            } catch (Exception var6) {
                this.field5271.repaint();
            }
        } else {
            throw new IllegalStateException("off");
        }
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method88(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class108 var11 = this.method2278(Thread.currentThread());
        class599 var12 = var11.field1911;
        var12.field8581 = false;
        int var13 = arg0 - this.field5300;
        int var14 = arg2 - this.field5300;
        int var15 = arg4 - this.field5300;
        int var16 = arg1 - this.field5296;
        int var17 = arg3 - this.field5296;
        int var18 = arg5 - this.field5296;
        var12.field8584 = var13 < 0 || var13 > var12.field8578 || var14 < 0 || var14 > var12.field8578 || var15 < 0 || var15 > var12.field8578;
        var12.field8593 = true;
        int var19 = arg6 >>> 24;
        if (arg9 != 0 && (arg9 != 1 || var19 != 255)) {
            if (arg9 == 1) {
                var12.field8590 = 255 - var19;
                var12.field8585 = false;
                var12.method3417(var16, var17, var18, var13, var14, var15, 0, 0, 0, arg6, arg7, arg8);
            } else {
                if (arg9 != 2) {
                    throw new IllegalArgumentException();
                }
                var12.field8590 = 128;
                var12.field8585 = true;
                var12.method3417(var16, var17, var18, var13, var14, var15, 0, 0, 0, arg6, arg7, arg8);
            }
        } else {
            var12.field8590 = 0;
            var12.field8585 = false;
            var12.method3417(var16, var17, var18, var13, var14, var15, 0, 0, 0, arg6, arg7, arg8);
        }
        var12.field8581 = true;
        var12.field8593 = false;
    }

    @OriginalMember(owner = "client!dda", name = "IA", descriptor = "(IIIIII[BII)V")
    public final void method76(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        if (arg2 > 0 && arg3 > 0) {
            int var10 = 0;
            int var11 = 0;
            int var12 = (arg7 << 16) / arg2;
            int var13 = (arg6.length / arg7 << 16) / arg3;
            int var14 = this.field5286 * arg1 + arg0;
            int var15 = this.field5286 - arg2;
            if (arg1 + arg3 > this.field5273) {
                arg3 -= arg1 + arg3 - this.field5273;
            }
            if (arg1 < this.field5279) {
                int var16 = this.field5279 - arg1;
                arg3 -= var16;
                var14 += this.field5286 * var16;
                var11 += var13 * var16;
            }
            if (arg0 + arg2 > this.field5292) {
                int var17 = arg0 + arg2 - this.field5292;
                arg2 -= var17;
                var15 += var17;
            }
            if (arg0 < this.field5276) {
                int var18 = this.field5276 - arg0;
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
                            int var28 = this.field5277[var14];
                            this.field5277[var14++] = ((var25 & 16711935) * var26 + (var28 & 16711935) * var27 & -16711936) + ((var25 & 65280) * var26 + (var28 & 65280) * var27 & 16711680) >> 8;
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
                                int var34 = this.field5277[var14];
                                int var35 = var33 + var34;
                                int var36 = (var33 & 16711935) + (var34 & 16711935);
                                int var37 = (var35 - var36 & 65536) + (var36 & 16777472);
                                this.field5277[var14++] = var35 - var37 | var37 - (var37 >>> 8);
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
                            this.field5277[var14++] = arg5;
                        } else {
                            this.field5277[var14++] = arg4;
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

    @OriginalMember(owner = "client!dda", name = "h", descriptor = "()Z")
    public final boolean method127() {
        return true;
    }

    @OriginalMember(owner = "client!dda", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method44(Canvas arg0) {
        class416 var2 = (class416) this.field5268.method2596((long) arg0.hashCode(), 81);
        if (var2 != null) {
            var2.method2588(300);
            class416 var3 = class30.method505((byte) -103, arg0);
            this.field5268.method2598(var3, (long) arg0.hashCode(), (byte) 8);
            if (this.field5271 == arg0 && this.field5275 == null) {
                this.field5270 = var3;
                this.field5277 = var3.field6016;
                this.field5286 = var3.field6015;
                this.field5285 = var3.field6019;
                if (this.field5286 != this.field5280 || this.field5294 != this.field5285) {
                    this.field5280 = this.field5286;
                    this.field5294 = this.field5285;
                    this.field5305 = new int[this.field5294 * this.field5280];
                }
                this.method2275();
            }
        }
    }

    @OriginalMember(owner = "client!dda", name = "pa", descriptor = "(III)V")
    public final void method152(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field5274.length; ++var4) {
            class108 var5 = this.field5274[var4];
            var5.field1865 = arg0 & 16777215;
            int var6 = var5.field1865 >>> 16 & 255;
            if (var6 < 2) {
                var6 = 2;
            }
            int var7 = var5.field1865 >> 8 & 255;
            if (var7 < 2) {
                var7 = 2;
            }
            int var8 = var5.field1865 & 255;
            if (var8 < 2) {
                var8 = 2;
            }
            var5.field1865 = var6 << 16 | var7 << 8 | var8;
            if (arg1 < 0) {
                var5.field1873 = false;
            } else {
                var5.field1873 = true;
            }
        }
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(Ljava/lang/Runnable;)Lej;")
    public final class108 method2278(Runnable arg0) {
        for (int var2 = 0; var2 < this.field5304; ++var2) {
            if (this.field5274[var2].field1859 == arg0) {
                return this.field5274[var2];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!dda", name = "ja", descriptor = "(I)V")
    public final void method42(int arg0) {
        this.method4(0, 0, this.field5286, this.field5285, arg0, 0);
    }

    @OriginalMember(owner = "client!dda", name = "C", descriptor = "()Z")
    public final boolean method31() {
        return true;
    }

    @OriginalMember(owner = "client!dda", name = "h", descriptor = "(IIII)[I")
    public final int[] method50(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = new int[arg2 * arg3];
        int var6 = 0;
        for (int var7 = 0; var7 < arg3; ++var7) {
            int var8 = (arg1 + var7) * this.field5286 + arg0;
            for (int var9 = 0; var9 < arg2; ++var9) {
                var5[var6++] = this.field5277[var8 + var9];
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!dda", name = "l", descriptor = "(I)Z")
    public final boolean method2279(int arg0) {
        return this.field5283 || super.field2768.method1500(arg0, -106).field9836;
    }

    @OriginalMember(owner = "client!dda", name = "m", descriptor = "(I)[I")
    public final int[] method2280(int arg0) {
        class287 var2 = this.field5307;
        class67 var3;
        synchronized (this.field5307) {
            var3 = (class67) this.field5307.method1900((long) arg0, 74);
            if (var3 == null) {
                if (!super.field2768.method1499(arg0, -24052)) {
                    return null;
                }
                class699 var5 = super.field2768.method1500(arg0, -118);
                int var6 = !var5.field9836 && !this.field5283 ? 128 : 64;
                var3 = new class67(arg0, var6, super.field2768.method1495(arg0, true, 0.7F, var6, var6, 32682), var5.field9848);
                this.field5307.method1904(var3, (long) arg0, -1);
            }
        }
        var3.field1456 = true;
        return var3.method769();
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "([IIIII)Lf;")
    public final class702 method54(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        boolean var6 = false;
        int var7 = arg1;
        for (int var8 = 0; var8 < arg4; ++var8) {
            for (int var9 = 0; var9 < arg3; ++var9) {
                int var10 = arg0[var7++] >>> 24;
                if (var10 != 0 && var10 != 255) {
                    var6 = true;
                    return var6 ? new class449(this, arg0, arg1, arg2, arg3, arg4) : new class267(this, arg0, arg1, arg2, arg3, arg4);
                }
            }
        }
        return var6 ? new class449(this, arg0, arg1, arg2, arg3, arg4) : new class267(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(IIIIZ)Lf;")
    public final class702 method182(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int[] var6 = new int[arg2 * arg3];
        int var7 = this.field5286 * arg1 + arg0;
        int var8 = this.field5286 - arg2;
        for (int var9 = 0; var9 < arg3; ++var9) {
            int var10 = arg2 * var9;
            for (int var11 = 0; var11 < arg2; ++var11) {
                var6[var10 + var11] = this.field5277[var7++];
            }
            var7 += var8;
        }
        if (arg4) {
            return new class449(this, var6, arg2, arg3);
        } else {
            return new class267(this, var6, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!dda", name = "F", descriptor = "()Z")
    public final boolean method2281() {
        return this.field5272;
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "([I)V")
    public final void method119(int[] arg0) {
        arg0[0] = this.field5286;
        arg0[1] = this.field5285;
    }

    @OriginalMember(owner = "client!dda", name = "d", descriptor = "()Z")
    public final boolean method173() {
        return false;
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(IIIIII)V")
    public final void method41(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg2 - arg0;
        int var8 = arg3 - arg1;
        if (var8 == 0) {
            if (var7 >= 0) {
                this.method126(arg0, arg1, var7 + 1, arg4, arg5);
            } else {
                this.method126(arg0 + var7, arg1, -var7 + 1, arg4, arg5);
            }
        } else if (var7 == 0) {
            if (var8 >= 0) {
                this.method69(arg0, arg1, var8 + 1, arg4, arg5);
            } else {
                this.method69(arg0, arg1 + var8, -var8 + 1, arg4, arg5);
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
                if (arg0 < this.field5276) {
                    var10 += (this.field5276 - arg0) * var12;
                    arg0 = this.field5276;
                }
                if (var13 >= this.field5292) {
                    var13 = this.field5292 - 1;
                }
                int var14 = arg4 >>> 24;
                if (arg5 != 0 && (arg5 != 1 || var14 != 255)) {
                    if (arg5 == 1) {
                        int var15 = (var14 << 24) + ((arg4 & 16711935) * var14 >> 8 & 16711935) + ((arg4 & 65280) * var14 >> 8 & 65280);
                        int var16 = 256 - var14;
                        while (arg0 <= var13) {
                            int var17 = var10 >> 16;
                            if (var17 >= this.field5279 && var17 < this.field5273) {
                                int var18 = this.field5286 * var17 + arg0;
                                int var19 = this.field5277[var18];
                                int var20 = ((var19 & 16711935) * var16 >> 8 & 16711935) + ((var19 & 65280) * var16 >> 8 & 65280);
                                this.field5277[var18] = var15 + var20;
                            }
                            var10 += var12;
                            ++arg0;
                        }
                    } else if (arg5 == 2) {
                        while (arg0 <= var13) {
                            int var21 = var10 >> 16;
                            if (var21 >= this.field5279 && var21 < this.field5273) {
                                int var22 = this.field5286 * var21 + arg0;
                                int var23 = this.field5277[var22];
                                int var24 = arg4 + var23;
                                int var25 = (arg4 & 16711935) + (var23 & 16711935);
                                int var26 = (var24 - var25 & 65536) + (var25 & 16777472);
                                this.field5277[var22] = var24 - var26 | var26 - (var26 >>> 8);
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
                        if (var27 >= this.field5279 && var27 < this.field5273) {
                            this.field5277[this.field5286 * var27 + arg0] = arg4;
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
                if (arg1 < this.field5279) {
                    var29 += (this.field5279 - arg1) * var31;
                    arg1 = this.field5279;
                }
                if (var32 >= this.field5273) {
                    var32 = this.field5273 - 1;
                }
                int var33 = arg4 >>> 24;
                if (arg5 == 0 || arg5 == 1 && var33 == 255) {
                    while (arg1 <= var32) {
                        int var46 = var29 >> 16;
                        if (var46 >= this.field5276 && var46 < this.field5292) {
                            this.field5277[this.field5286 * arg1 + var46] = arg4;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 1) {
                    int var34 = (var33 << 24) + ((arg4 & 16711935) * var33 >> 8 & 16711935) + ((arg4 & 65280) * var33 >> 8 & 65280);
                    int var35 = 256 - var33;
                    while (arg1 <= var32) {
                        int var36 = var29 >> 16;
                        if (var36 >= this.field5276 && var36 < this.field5292) {
                            int var37 = this.field5286 * arg1 + var36;
                            int var38 = this.field5277[var37];
                            int var39 = ((var38 & 16711935) * var35 >> 8 & 16711935) + ((var38 & 65280) * var35 >> 8 & 65280);
                            this.field5277[this.field5286 * arg1 + var36] = var34 + var39;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 2) {
                    while (arg1 <= var32) {
                        int var40 = var29 >> 16;
                        if (var40 >= this.field5276 && var40 < this.field5292) {
                            int var41 = this.field5286 * arg1 + var40;
                            int var42 = this.field5277[var41];
                            int var43 = arg4 + var42;
                            int var44 = (arg4 & 16711935) + (var42 & 16711935);
                            int var45 = (var43 - var44 & 65536) + (var44 & 16777472);
                            this.field5277[var41] = var43 - var45 | var45 - (var45 >>> 8);
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

    @OriginalMember(owner = "client!dda", name = "FA", descriptor = "(ILua;II)V")
    public final void method120(int arg0, class619 arg1, int arg2, int arg3) {
        class446 var5 = (class446) arg1;
        int[] var6 = var5.field6421;
        int[] var7 = var5.field6418;
        int var8;
        if (this.field5273 < var6.length + arg3) {
            var8 = this.field5273 - arg3;
        } else {
            var8 = var6.length;
        }
        int var9;
        if (this.field5279 > arg3) {
            var9 = this.field5279 - arg3;
            arg3 = this.field5279;
        } else {
            var9 = 0;
        }
        if (var8 - var9 > 0) {
            int var10 = this.field5286 * arg3;
            for (int var11 = var9; var11 < var8; ++var11) {
                int var12 = var6[var11] + arg2;
                int var13 = var7[var11];
                if (this.field5276 > var12) {
                    var13 -= this.field5276 - var12;
                    var12 = this.field5276;
                }
                if (this.field5292 < var12 + var13) {
                    var13 = this.field5292 - var12;
                }
                int var14 = var10 + var12;
                for (int var15 = -var13; var15 < 0; ++var15) {
                    this.field5277[var14++] = arg0;
                }
                var10 += this.field5286;
            }
        }
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(IIIIIF)Lff;")
    public final class9 method139(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return null;
    }

    @OriginalMember(owner = "client!dda", name = "VA", descriptor = "(IFFFFF)V")
    public final void method95(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        this.field5301 = (int) (arg1 * 65535.0F);
        this.field5282 = (int) (arg2 * 65535.0F);
        float var7 = (float) Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4));
        this.field5295 = (int) (arg3 * 65535.0F / var7);
        this.field5287 = (int) (arg4 * 65535.0F / var7);
        this.field5281 = (int) (arg5 * 65535.0F / var7);
    }

    @OriginalMember(owner = "client!dda", name = "p", descriptor = "()V")
    public final void method94() {
    }

    @OriginalMember(owner = "client!dda", name = "e", descriptor = "(I)V")
    public final void method177(int arg0) {
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(Lnda;IIII)Lda;")
    public final class55 method37(class519 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class333(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!dda", name = "L", descriptor = "()V")
    public final void method59() {
        for (int var1 = 0; var1 < this.field5274.length; ++var1) {
            this.field5274[var1].field1865 = this.field5274[var1].field1861;
            this.field5274[var1].field1864 = false;
        }
    }

    @OriginalMember(owner = "client!dda", name = "f", descriptor = "()Z")
    public final boolean method114() {
        return false;
    }

    @OriginalMember(owner = "client!dda", name = "<init>", descriptor = "(Lfa;)V")
    private class351(class214 arg0) {
        super(arg0);
        this.field5267 = false;
        this.field5272 = false;
        this.field5268 = new class427(4);
        this.field5283 = false;
        this.field5279 = 0;
        this.field5291 = 75518;
        this.field5273 = 0;
        this.field5282 = 78642;
        this.field5290 = 512;
        this.field5276 = 0;
        this.field5299 = 50;
        this.field5292 = 0;
        this.field5288 = 0;
        this.field5298 = 512;
        this.field5301 = 45823;
        this.field5303 = 3500;
        this.field5306 = 0;
        this.field5278 = new class287(16);
        this.field5309 = -1;
        this.field5307 = new class287(256);
        this.field5297 = new class141();
        this.method146(1);
        this.method134(0);
        class377.method2364(true, false, -40);
        this.field5267 = true;
        this.field5269 = (int) class525.method3074((byte) -101);
    }

    @OriginalMember(owner = "client!dda", name = "ra", descriptor = "(F)V")
    public final void method143(float arg0) {
        this.field5291 = (int) (arg0 * 65535.0F);
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(I[Lff;)V")
    public final void method75(int arg0, class9[] arg1) {
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "()Lq;")
    public final class396 method169() {
        return this.field5297;
    }

    @OriginalMember(owner = "client!dda", name = "b", descriptor = "()I")
    public final int method149() {
        return 0;
    }

    @OriginalMember(owner = "client!dda", name = "f", descriptor = "(I)Le;")
    public final class495 method32(int arg0) {
        return null;
    }

    @OriginalMember(owner = "client!dda", name = "T", descriptor = "()I")
    public final int method102() {
        int var1 = this.field5288;
        this.field5288 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!dda", name = "o", descriptor = "()Z")
    public final boolean method17() {
        return false;
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(Lfi;)V")
    public final void method123(class518 arg0) {
        class108 var2 = this.method2278(Thread.currentThread());
        class347 var3 = arg0.field7307.field3152;
        for (class347 var4 = var3.field5168; var3 != var4; var4 = var4.field5168) {
            class332 var5 = (class332) var4;
            int var6 = var5.field4831 >> 12;
            int var7 = var5.field4833 >> 12;
            int var8 = var5.field4837 >> 12;
            float var9 = (float) var8 * this.field5297.field2471 + (float) var6 * this.field5297.field2472 + (float) var7 * this.field5297.field2501 + this.field5297.field2480;
            if (!(var9 < (float) this.field5299) && !(var9 > (float) var2.field1866)) {
                int var10 = (int) (((float) var8 * this.field5297.field2495 + (float) var6 * this.field5297.field2497 + (float) var7 * this.field5297.field2485 + this.field5297.field2482) * (float) this.field5298 / var9) + this.field5302;
                int var11 = (int) (((float) var8 * this.field5297.field2473 + (float) var6 * this.field5297.field2476 + (float) var7 * this.field5297.field2498 + this.field5297.field2496) * (float) this.field5290 / var9) + this.field5284;
                if (var10 >= this.field5276 && var10 <= this.field5292 && var11 >= this.field5279 && var11 <= this.field5273) {
                    if (var9 == 0.0F) {
                        var9 = 1.0F;
                    }
                    this.method2276(var5, var10, var11, (int) var9, (int) ((float) (this.field5298 * var5.field4838 >> 12) / var9));
                }
            }
        }
    }
}
