import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class12 extends class105 {

    @OriginalMember(owner = "client!ba", name = "gb", descriptor = "I")
    private int field233 = 5;

    @OriginalMember(owner = "client!ba", name = "bb", descriptor = "I")
    private int field228 = 1;

    @OriginalMember(owner = "client!ba", name = "tb", descriptor = "I")
    private int field246 = 0;

    @OriginalMember(owner = "client!ba", name = "lb", descriptor = "I")
    private int field238 = 2048;

    @OriginalMember(owner = "client!ba", name = "rb", descriptor = "I")
    private int field244 = 2;

    @OriginalMember(owner = "client!ba", name = "cb", descriptor = "I")
    private int field229 = 5;

    @OriginalMember(owner = "client!ba", name = "Z", descriptor = "I")
    private int field226 = 25;

    @OriginalMember(owner = "client!ba", name = "ob", descriptor = "Leh;")
    public static class47 field241 = class195.method1282((byte) -4, "Okay");

    @OriginalMember(owner = "client!ba", name = "fb", descriptor = "Leh;")
    public static class47 field232 = class195.method1282((byte) -4, ")4l");

    @OriginalMember(owner = "client!ba", name = "sb", descriptor = "Leh;")
    public static class47 field245 = class195.method1282((byte) -4, "oder benutzen Sie eine andere Welt)3");

    @OriginalMember(owner = "client!ba", name = "wb", descriptor = "Leh;")
    public static class47 field249 = class195.method1282((byte) -4, "sch-Utteln:");

    @OriginalMember(owner = "client!ba", name = "Y", descriptor = "I")
    private int field225;

    @OriginalMember(owner = "client!ba", name = "ab", descriptor = "I")
    public static int field227;

    @OriginalMember(owner = "client!ba", name = "eb", descriptor = "I")
    public static int field231;

    @OriginalMember(owner = "client!ba", name = "hb", descriptor = "I")
    public static int field234;

    @OriginalMember(owner = "client!ba", name = "ib", descriptor = "I")
    public static int field235;

    @OriginalMember(owner = "client!ba", name = "jb", descriptor = "I")
    public static int field236;

    @OriginalMember(owner = "client!ba", name = "kb", descriptor = "I")
    private int field237;

    @OriginalMember(owner = "client!ba", name = "mb", descriptor = "I")
    public static int field239;

    @OriginalMember(owner = "client!ba", name = "qb", descriptor = "I")
    private int field243;

    @OriginalMember(owner = "client!ba", name = "ub", descriptor = "I")
    public static int field247;

    @OriginalMember(owner = "client!ba", name = "vb", descriptor = "Lcd;")
    public static class25 field248;

    @OriginalMember(owner = "client!ba", name = "db", descriptor = "Z")
    public static boolean field230;

    @OriginalMember(owner = "client!ba", name = "nb", descriptor = "[I")
    public static int[] field240;

    @OriginalMember(owner = "client!ba", name = "pb", descriptor = "[[I")
    private int[][] field242;

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "()V")
    public class12() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIII)[I")
    private final int[] method87(int arg0, int arg1, int arg2, int arg3) {
        ++field239;
        int[] var5 = new int[arg1];
        for (int var6 = 0; ~var6 > ~arg1; ++var6) {
            var5[var6] = Integer.MAX_VALUE;
        }
        int var7 = this.field237 + arg3;
        if (var7 > 4096) {
            var7 -= 4096;
        }
        int var8 = this.field225 + arg2;
        if (var8 > 4096) {
            var8 -= 4096;
        }
        int var9 = this.field229 * var8 >> 12;
        int var10 = -1;
        int var11 = this.field233 * var7 >> 12;
        int var12 = -1;
        int var13 = Integer.MAX_VALUE;
        int var14 = ~this.field233 >= -3 ? this.field233 + -1 : 2;
        int var15 = ~this.field229 < -3 ? 2 : this.field229 + -1;
        int var16 = Integer.MAX_VALUE;
        int var17 = 27 / ((21 - arg0) / 39);
        for (int var18 = -var15; ~var15 <= ~var18; ++var18) {
            for (int var26 = -var14; ~var26 >= ~var14; ++var26) {
                int var27 = var9 + var18;
                if (var27 < 0) {
                    var27 += this.field229;
                }
                int var28 = var11 + var26;
                if (var28 < 0) {
                    var28 += this.field233;
                }
                if (var27 >= this.field229) {
                    var27 -= this.field229;
                }
                if (~this.field233 >= ~var28) {
                    var28 -= this.field233;
                }
                int var29 = this.field229 * var28 + var27;
                int var30 = this.field242[var29][0];
                int var31 = this.field242[var29][1];
                int var32 = -var30 + var8;
                if (var32 < 0) {
                    var32 = -var32;
                }
                if (~var32 < -2049) {
                    var32 = -var32 + 4096;
                }
                int var33 = -var31 + var7;
                if (~var33 > -1) {
                    var33 = -var33;
                }
                if (var33 > 2048) {
                    var33 = -var33 + 4096;
                }
                int var34 = var32 * var32 + var33 * var33 >> 12;
                if (var13 > var34) {
                    if (var12 != -1) {
                        var12 = var10;
                        var16 = var13;
                    } else {
                        var16 = var34;
                        var12 = var29;
                    }
                    var13 = var34;
                    var10 = var29;
                } else if (~var10 == ~var12 && var12 != var29 || var34 < var16 && ~var10 != ~var29) {
                    var16 = var34;
                    var12 = var29;
                }
            }
        }
        int var19 = -this.field242[var10][0] + var8;
        int var20 = var7 - this.field242[var10][1];
        if (~var20 > -1) {
            var20 = -var20;
        }
        if (var19 < 0) {
            var19 = -var19;
        }
        int var21 = -this.field242[var12][0] + var8;
        if (var19 > 2048) {
            var19 = -var19 + 4096;
        }
        int var22 = -this.field242[var12][1] + var7;
        if (var21 < 0) {
            var21 = -var21;
        }
        if (~var21 < -2049) {
            var21 = -var21 + 4096;
        }
        if (var22 < 0) {
            var22 = -var22;
        }
        if (~var20 < -2049) {
            var20 = -var20 + 4096;
        }
        if (var22 > 2048) {
            var22 = -var22 + 4096;
        }
        int var23 = this.field228;
        int var24;
        int var25;
        if (var23 != 1) {
            if (~var23 == -3) {
                var24 = Math.max(var19, var20);
                var25 = Math.max(var21, var22);
            } else {
                var24 = var19 * var19 - -(var20 * var20);
                var25 = var21 * var21 + var22 * var22;
            }
        } else {
            var24 = (int) Math.sqrt((double) (var19 * var19 + var20 * var20));
            var25 = (int) Math.sqrt((double) (var21 * var21 - -(var22 * var22)));
        }
        if (~arg1 < -2) {
            var5[1] = this.field243 * var25;
        }
        var5[0] = this.field243 * var24;
        return var5;
    }

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "(I)V")
    public final void method13(int arg0) {
        this.method88((byte) -107);
        ++field227;
        if (arg0 != -1) {
            this.method17(-33, (class68) null, 23);
        }
    }

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "(B)V")
    private final void method88(byte arg0) {
        ++field235;
        if (arg0 > -91) {
            method90(100, -92, -102, -88);
        }
        Random var2 = new Random((long) this.field246);
        int var3 = 4096 / this.field233;
        this.field226 = this.field233 * this.field229;
        this.field242 = new int[this.field226][2];
        this.field237 = var3 >> 1;
        int var4 = 4096 / this.field229;
        int var5 = this.field238 * this.field237 >> 12;
        this.field225 = var4 >> 1;
        int var6 = this.field238 * this.field225 >> 12;
        for (int var7 = 0; var7 < this.field233; ++var7) {
            int var8 = var3 * var7;
            for (int var9 = 0; ~this.field229 < ~var9; ++var9) {
                int var10 = this.field229 * var7 + var9;
                int var11 = (-4096 + class51.method452(false, 8192, var2)) * var6 >> 12;
                int var12 = var5 * (-4096 + class51.method452(false, 8192, var2)) >> 12;
                this.field242[var10][0] = var4 * var9 + var11;
                this.field242[var10][1] = var8 + var12;
            }
        }
        this.field243 = this.field229 <= this.field233 ? this.field233 : this.field229;
    }

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "(I)V")
    public static final void method89(int arg0) {
        class162 var1 = (class162) class39.field773.method345(-116);
        ++field247;
        if (arg0 == 31611) {
            while (var1 != null) {
                if (~class196.field3827 == ~var1.field3148 && !var1.field3156) {
                    if (var1.field3162 <= class18.field362) {
                        var1.method1110(class190.field3677, true);
                        if (var1.field3156) {
                            var1.method885(3);
                        } else {
                            class74.method652(var1.field3148, var1.field3147, var1.field3155, var1.field3159, 60, var1, 0, -1L, false);
                        }
                    }
                } else {
                    var1.method885(arg0 + -31608);
                }
                var1 = (class162) class39.field773.method348(13949);
            }
        }
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(IIII)V")
    public static final void method90(int arg0, int arg1, int arg2, int arg3) {
        ++field231;
        if (~arg2 <= -129 && arg3 >= 128 && arg2 <= 13056 && ~arg3 >= -13057) {
            int var4 = class39.method335(arg2, class196.field3827, arg3, 20896) + -arg0;
            int var5 = class17.field341[class194.field3787];
            int var6 = arg2 - class33.field639;
            int var7 = arg3 - class98.field2086;
            int var8 = var4 - class188.field3655;
            int var9 = class17.field350[class194.field3787];
            int var10 = class17.field341[class53.field1036];
            int var11 = class17.field350[class53.field1036];
            int var12 = var6 * var11 + var7 * var10 >> 16;
            int var13 = var7 * var11 - var6 * var10 >> 16;
            int var15 = var8 * var9 + -(var5 * var13) >> 16;
            int var16 = var5 * var8 + var9 * var13 >> 16;
            if (var16 < 50) {
                class179.field3432 = -1;
                class158.field3068 = -1;
            } else {
                class158.field3068 = (var12 << 9) / var16 + 256;
                class179.field3432 = (var15 << 9) / var16 + 167;
            }
            if (arg1 <= 69) {
                method89(2);
            }
        } else {
            class158.field3068 = -1;
            class179.field3432 = -1;
        }
    }

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "(B)V")
    public static void method91(byte arg0) {
        field248 = null;
        field241 = null;
        field245 = null;
        field232 = null;
        field240 = null;
        field249 = null;
        if (arg0 < 44) {
            field249 = null;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IB)[I")
    public final int[] method92(int arg0, byte arg1) {
        int[] var3 = super.field2192.method336(-92, arg0);
        ++field236;
        if (super.field2192.field770) {
            int var4 = class26.field500[arg0];
            int var5 = this.field244;
            if (var5 != 2) {
                if (~var5 == -2) {
                    for (int var6 = 0; var6 < class149.field2928; ++var6) {
                        int var7 = class167.field3237[var6];
                        var3[var6] = this.method87(76, 2, var7, var4)[1];
                    }
                } else {
                    for (int var8 = 0; class149.field2928 > var8; ++var8) {
                        int var9 = class167.field3237[var8];
                        var3[var8] = this.method87(113, 1, var9, var4)[0];
                    }
                }
            } else {
                for (int var10 = 0; ~var10 > ~class149.field2928; ++var10) {
                    int var11 = class167.field3237[var10];
                    int[] var12 = this.method87(-106, 2, var11, var4);
                    var3[var10] = var12[1] - var12[0];
                }
            }
        }
        return arg1 < 78 ? null : var3;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILhd;I)V")
    public final void method17(int arg0, class68 arg1, int arg2) {
        ++field234;
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (~arg0 != -4) {
                        if (arg0 != 4) {
                            if (arg0 != 5) {
                                if (~arg0 == -7) {
                                    this.field233 = arg1.method604((byte) -126);
                                }
                            } else {
                                this.field229 = arg1.method604((byte) -40);
                            }
                        } else {
                            this.field228 = arg1.method604((byte) 56);
                        }
                    } else {
                        this.field244 = arg1.method604((byte) -125);
                    }
                } else {
                    this.field238 = arg1.method569(26496);
                }
            } else {
                this.field246 = arg1.method604((byte) -19);
            }
        } else {
            this.field229 = this.field233 = arg1.method604((byte) -40);
        }
        if (arg2 != -256) {
            this.field229 = -17;
        }
    }
}
