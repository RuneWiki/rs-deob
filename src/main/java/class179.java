import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class179 extends class142 {

    @OriginalMember(owner = "client!tg", name = "W", descriptor = "I")
    private int field3390 = 25;

    @OriginalMember(owner = "client!tg", name = "Q", descriptor = "I")
    private int field3385 = 0;

    @OriginalMember(owner = "client!tg", name = "X", descriptor = "I")
    private int field3391 = 5;

    @OriginalMember(owner = "client!tg", name = "U", descriptor = "I")
    private int field3388 = 2048;

    @OriginalMember(owner = "client!tg", name = "jb", descriptor = "I")
    private int field3403 = 2;

    @OriginalMember(owner = "client!tg", name = "nb", descriptor = "I")
    private int field3407 = 1;

    @OriginalMember(owner = "client!tg", name = "ob", descriptor = "I")
    private int field3408 = 5;

    @OriginalMember(owner = "client!tg", name = "R", descriptor = "Lai;")
    public static class10 field3386 = class44.method278("Hier wechseln", 98);

    @OriginalMember(owner = "client!tg", name = "lb", descriptor = "Lai;")
    public static class10 field3405 = class44.method278("<img=0>", 106);

    @OriginalMember(owner = "client!tg", name = "ib", descriptor = "Lai;")
    private static class10 field3402 = class44.method278("Click to switch", -85);

    @OriginalMember(owner = "client!tg", name = "qb", descriptor = "Lai;")
    public static class10 field3410 = field3402;

    @OriginalMember(owner = "client!tg", name = "sb", descriptor = "I")
    public static int field3412 = 0;

    @OriginalMember(owner = "client!tg", name = "rb", descriptor = "Lai;")
    private static class10 field3411 = class44.method278("M", 105);

    @OriginalMember(owner = "client!tg", name = "S", descriptor = "Lai;")
    public static class10 field3387 = field3411;

    @OriginalMember(owner = "client!tg", name = "pb", descriptor = "Lai;")
    public static class10 field3409 = field3411;

    @OriginalMember(owner = "client!tg", name = "V", descriptor = "I")
    private int field3389;

    @OriginalMember(owner = "client!tg", name = "Y", descriptor = "I")
    public static int field3392;

    @OriginalMember(owner = "client!tg", name = "Z", descriptor = "I")
    public static int field3393;

    @OriginalMember(owner = "client!tg", name = "ab", descriptor = "I")
    public static int field3394;

    @OriginalMember(owner = "client!tg", name = "bb", descriptor = "I")
    private int field3395;

    @OriginalMember(owner = "client!tg", name = "cb", descriptor = "I")
    public static int field3396;

    @OriginalMember(owner = "client!tg", name = "eb", descriptor = "I")
    public static int field3398;

    @OriginalMember(owner = "client!tg", name = "fb", descriptor = "I")
    public static int field3399;

    @OriginalMember(owner = "client!tg", name = "hb", descriptor = "I")
    public static int field3401;

    @OriginalMember(owner = "client!tg", name = "kb", descriptor = "I")
    public static int field3404;

    @OriginalMember(owner = "client!tg", name = "mb", descriptor = "I")
    private int field3406;

    @OriginalMember(owner = "client!tg", name = "ub", descriptor = "I")
    public static int field3414;

    @OriginalMember(owner = "client!tg", name = "db", descriptor = "Lc;")
    public static class21 field3397;

    @OriginalMember(owner = "client!tg", name = "gb", descriptor = "[I")
    public static int[] field3400;

    @OriginalMember(owner = "client!tg", name = "tb", descriptor = "[[I")
    private int[][] field3413;

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "(I)V")
    private final void method1153(int arg0) {
        Random var2 = new Random((long) this.field3385);
        this.field3390 = this.field3408 * this.field3391;
        this.field3413 = new int[this.field3390][2];
        ++field3393;
        int var3 = 4096 / this.field3391;
        int var4 = 4096 / this.field3408;
        this.field3406 = var3 >> 1;
        this.field3389 = var4 >> 1;
        int var5 = this.field3406 * this.field3388 >> 12;
        int var6 = this.field3389 * this.field3388 >> 12;
        if (arg0 != 633892620) {
            this.field3391 = -126;
        }
        for (int var7 = 0; this.field3408 > var7; ++var7) {
            int var8 = var4 * var7;
            for (int var9 = 0; this.field3391 > var9; ++var9) {
                int var10 = this.field3391 * var7 - -var9;
                int var11 = var5 * (class89.method548(8192, var2, (byte) -73) + -4096) >> 12;
                int var12 = var6 * (class89.method548(8192, var2, (byte) -73) - 4096) >> 12;
                this.field3413[var10][0] = var3 * var9 + var11;
                this.field3413[var10][1] = var12 - -var8;
            }
        }
        this.field3395 = ~this.field3391 < ~this.field3408 ? this.field3391 : this.field3408;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIII)[I")
    private final int[] method1154(int arg0, int arg1, int arg2, int arg3) {
        ++field3398;
        int[] var5 = new int[arg2];
        for (int var6 = 0; ~arg2 < ~var6; ++var6) {
            var5[var6] = Integer.MAX_VALUE;
        }
        int var7 = this.field3406 + arg1;
        int var8 = -1;
        int var9 = this.field3389 + arg0;
        if (~var9 < -4097) {
            var9 -= 4096;
        }
        int var10 = -1;
        int var11 = Integer.MAX_VALUE;
        if (var7 > 4096) {
            var7 -= 4096;
        }
        int var12 = this.field3391 * var7 >> 12;
        int var13 = this.field3408 * var9 >> 12;
        int var14 = Integer.MAX_VALUE;
        int var15 = ~this.field3391 < -3 ? 2 : this.field3391 + -1;
        int var16 = ~this.field3408 < -3 ? 2 : this.field3408 + -1;
        for (int var17 = -var15; ~var15 <= ~var17; ++var17) {
            for (int var25 = -var16; var16 >= var25; ++var25) {
                int var26 = var13 + var25;
                int var27 = var12 - -var17;
                if (~var26 > -1) {
                    var26 += this.field3408;
                }
                if (~var27 > -1) {
                    var27 += this.field3391;
                }
                if (~var26 <= ~this.field3408) {
                    var26 -= this.field3408;
                }
                if (var27 >= this.field3391) {
                    var27 -= this.field3391;
                }
                int var28 = this.field3391 * var26 + var27;
                int var29 = this.field3413[var28][1];
                int var30 = -var29 + var9;
                if (var30 < 0) {
                    var30 = -var30;
                }
                if (~var30 < -2049) {
                    var30 = -var30 + 4096;
                }
                int var31 = this.field3413[var28][0];
                int var32 = -var31 + var7;
                if (var32 < 0) {
                    var32 = -var32;
                }
                if (var32 > 2048) {
                    var32 = -var32 + 4096;
                }
                int var33 = var30 * var30 + var32 * var32 >> 12;
                if (var11 > var33) {
                    if (~var10 != 0) {
                        var14 = var11;
                        var10 = var8;
                    } else {
                        var10 = var28;
                        var14 = var33;
                    }
                    var8 = var28;
                    var11 = var33;
                } else if (~var8 == ~var10 && var10 != var28 || var14 > var33 && ~var8 != ~var28) {
                    var14 = var33;
                    var10 = var28;
                }
            }
        }
        int var18 = -this.field3413[var8][0] + var7;
        int var19 = -this.field3413[var8][arg3] + var9;
        if (var18 < 0) {
            var18 = -var18;
        }
        if (var19 < 0) {
            var19 = -var19;
        }
        if (var18 > 2048) {
            var18 = -var18 + 4096;
        }
        if (var19 > 2048) {
            var19 = -var19 + 4096;
        }
        int var20 = -this.field3413[var10][0] + var7;
        int var21 = -this.field3413[var10][1] + var9;
        if (var21 < 0) {
            var21 = -var21;
        }
        if (var20 < 0) {
            var20 = -var20;
        }
        if (~var21 < -2049) {
            var21 = -var21 + 4096;
        }
        if (~var20 < -2049) {
            var20 = -var20 + 4096;
        }
        int var22 = this.field3407;
        int var23;
        int var24;
        if (~var22 != -2) {
            if (~var22 == -3) {
                var23 = Math.max(var18, var19);
                var24 = Math.max(var20, var21);
            } else {
                var23 = var18 * var18 + var19 * var19;
                var24 = var20 * var20 - -(var21 * var21);
            }
        } else {
            var23 = (int) Math.sqrt((double) (var18 * var18 + var19 * var19));
            var24 = (int) Math.sqrt((double) (var20 * var20 + var21 * var21));
        }
        var5[0] = this.field3395 * var23;
        if (arg2 > 1) {
            var5[1] = this.field3395 * var24;
        }
        return var5;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(ZI)[I")
    public final int[] method6(boolean arg0, int arg1) {
        int[] var3 = super.field2683.method1186((byte) -114, arg1);
        if (super.field2683.field3516) {
            int var4 = class13.field212[arg1];
            int var5 = this.field3403;
            if (~var5 != -3) {
                if (var5 == 1) {
                    for (int var6 = 0; ~class133.field2499 < ~var6; ++var6) {
                        int var7 = class79.field1395[var6];
                        var3[var6] = this.method1154(var4, var7, 2, 1)[1];
                    }
                } else {
                    for (int var8 = 0; ~var8 > ~class133.field2499; ++var8) {
                        int var9 = class79.field1395[var8];
                        var3[var8] = this.method1154(var4, var9, 1, 1)[0];
                    }
                }
            } else {
                for (int var10 = 0; ~var10 > ~class133.field2499; ++var10) {
                    int var11 = class79.field1395[var10];
                    int[] var12 = this.method1154(var4, var11, 2, 1);
                    var3[var10] = var12[1] + -var12[0];
                }
            }
        }
        if (arg0) {
            return null;
        } else {
            ++field3401;
            return var3;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lme;IB)V")
    public final void method78(class114 arg0, int arg1, byte arg2) {
        if (arg2 <= -34) {
            if (arg1 != 0) {
                if (arg1 != 1) {
                    if (~arg1 != -3) {
                        if (arg1 != 3) {
                            if (~arg1 != -5) {
                                if (arg1 != 5) {
                                    if (arg1 == 6) {
                                        this.field3408 = arg0.method767(true);
                                    }
                                } else {
                                    this.field3391 = arg0.method767(true);
                                }
                            } else {
                                this.field3407 = arg0.method767(true);
                            }
                        } else {
                            this.field3403 = arg0.method767(true);
                        }
                    } else {
                        this.field3388 = arg0.method762((byte) 108);
                    }
                } else {
                    this.field3385 = arg0.method767(true);
                }
            } else {
                this.field3391 = this.field3408 = arg0.method767(true);
            }
            ++field3404;
        }
    }

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "(I)V")
    public final void method80(int arg0) {
        ++field3392;
        this.method1153(arg0 ^ -633892621);
        if (arg0 != -1) {
            this.method6(true, -123);
        }
    }

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "()V")
    public class179() {
        super(0, true);
    }

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "(B)V")
    public static final void method1155(byte arg0) {
        if (arg0 != 111) {
            field3410 = null;
        }
        class153 var1 = (class153) class125.field2392.method1223(true);
        ++field3394;
        while (var1 != null) {
            if (~class42.field687 == ~var1.field2936 && ~class120.field2304 >= ~var1.field2948) {
                if (var1.field2945 <= class120.field2304) {
                    if (var1.field2933 > 0) {
                        class125 var2 = class168.field3249[var1.field2933 + -1];
                        if (var2 != null && ~var2.field1100 <= -1 && var2.field1100 < 13312 && ~var2.field1097 <= -1 && ~var2.field1097 > -13313) {
                            var1.method1038(class120.field2304, var2.field1100, var2.field1097, -114, class145.method1003((byte) -74, var2.field1100, var2.field1097, var1.field2936) + -var1.field2953);
                        }
                    }
                    if (~var1.field2933 > -1) {
                        int var3 = -var1.field2933 + -1;
                        class38 var4;
                        if (class78.field1370 != var3) {
                            var4 = class2.field10[var3];
                        } else {
                            var4 = class145.field2767;
                        }
                        if (var4 != null && ~var4.field1100 <= -1 && ~var4.field1100 > -13313 && ~var4.field1097 <= -1 && ~var4.field1097 > -13313) {
                            var1.method1038(class120.field2304, var4.field1100, var4.field1097, -127, class145.method1003((byte) -97, var4.field1100, var4.field1097, var1.field2936) + -var1.field2953);
                        }
                    }
                    var1.method1039(83, class145.field2769);
                    class36.field560.method583(class42.field687, (int) var1.field2940, (int) var1.field2932, (int) var1.field2965, 60, var1, var1.field2928, -1, false);
                }
            } else {
                var1.method848(false);
            }
            var1 = (class153) class125.field2392.method1226((byte) -57);
        }
    }

    @OriginalMember(owner = "client!tg", name = "f", descriptor = "(I)V")
    public static void method1156(int arg0) {
        field3400 = null;
        field3405 = null;
        field3411 = null;
        field3402 = null;
        field3410 = null;
        field3386 = null;
        field3397 = null;
        field3387 = null;
        field3409 = null;
        if (arg0 >= -18) {
            method1155((byte) 66);
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIB)I")
    public static final int method1157(int arg0, int arg1, byte arg2) {
        ++field3399;
        int var3 = arg1 >>> 31;
        return arg2 != 57 ? 64 : (arg1 + var3) / arg0 + -var3;
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(II)Lud;")
    public static final class185 method1158(int arg0, int arg1) {
        ++field3414;
        class185 var2 = (class185) class160.field3073.method222(120, (long) arg0);
        int var3 = -91 % ((arg1 - -15) / 55);
        if (var2 != null) {
            return var2;
        } else {
            class185 var4 = class186.method1198(-1, field3397, class49.field861, arg0, false);
            if (var4 != null) {
                class160.field3073.method225(-21284, (long) arg0, var4);
            }
            return var4;
        }
    }
}
