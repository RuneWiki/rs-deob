import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class25 extends class212 {

    @OriginalMember(owner = "client!cb", name = "bb", descriptor = "I")
    private int field429 = 0;

    @OriginalMember(owner = "client!cb", name = "jb", descriptor = "I")
    private int field437 = 4;

    @OriginalMember(owner = "client!cb", name = "hb", descriptor = "I")
    private int field435 = 1638;

    @OriginalMember(owner = "client!cb", name = "mb", descriptor = "I")
    private int field440 = 4;

    @OriginalMember(owner = "client!cb", name = "nb", descriptor = "Z")
    private boolean field441 = true;

    @OriginalMember(owner = "client!cb", name = "sb", descriptor = "I")
    private int field446 = 4;

    @OriginalMember(owner = "client!cb", name = "wb", descriptor = "[B")
    private byte[] field450 = new byte[512];

    @OriginalMember(owner = "client!cb", name = "Z", descriptor = "Lsc;")
    public static class181 field427 = class149.method967(255, "Nehmen");

    @OriginalMember(owner = "client!cb", name = "gb", descriptor = "[I")
    public static int[] field434 = new int[100];

    @OriginalMember(owner = "client!cb", name = "U", descriptor = "Lsc;")
    public static class181 field422 = class149.method967(255, "<col=ff7000>");

    @OriginalMember(owner = "client!cb", name = "lb", descriptor = "I")
    public static int field439 = 0;

    @OriginalMember(owner = "client!cb", name = "cb", descriptor = "Lsc;")
    private static class181 field430 = class149.method967(255, "slide:");

    @OriginalMember(owner = "client!cb", name = "ib", descriptor = "Z")
    public static boolean field436 = false;

    @OriginalMember(owner = "client!cb", name = "pb", descriptor = "Lsc;")
    public static class181 field443 = field430;

    @OriginalMember(owner = "client!cb", name = "ab", descriptor = "Lsc;")
    public static class181 field428 = field430;

    @OriginalMember(owner = "client!cb", name = "ob", descriptor = "Lnk;")
    public static class95 field442 = new class95();

    @OriginalMember(owner = "client!cb", name = "xb", descriptor = "I")
    public static int field451 = 0;

    @OriginalMember(owner = "client!cb", name = "V", descriptor = "I")
    public static int field423;

    @OriginalMember(owner = "client!cb", name = "X", descriptor = "I")
    public static int field425;

    @OriginalMember(owner = "client!cb", name = "Y", descriptor = "I")
    public static int field426;

    @OriginalMember(owner = "client!cb", name = "db", descriptor = "I")
    public static int field431;

    @OriginalMember(owner = "client!cb", name = "eb", descriptor = "I")
    public static int field432;

    @OriginalMember(owner = "client!cb", name = "fb", descriptor = "I")
    public static int field433;

    @OriginalMember(owner = "client!cb", name = "kb", descriptor = "I")
    public static int field438;

    @OriginalMember(owner = "client!cb", name = "qb", descriptor = "I")
    public static int field444;

    @OriginalMember(owner = "client!cb", name = "rb", descriptor = "I")
    public static int field445;

    @OriginalMember(owner = "client!cb", name = "ub", descriptor = "I")
    public static int field448;

    @OriginalMember(owner = "client!cb", name = "vb", descriptor = "I")
    public static int field449;

    @OriginalMember(owner = "client!cb", name = "W", descriptor = "[S")
    private short[] field424;

    @OriginalMember(owner = "client!cb", name = "tb", descriptor = "[S")
    private short[] field447;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIILaf;JZ)V")
    public static final void method211(int arg0, int arg1, int arg2, int arg3, class208 arg4, long arg5, boolean arg6) {
        if (arg4 != null) {
            class164 var8 = new class164();
            var8.field2795 = arg4;
            var8.field2792 = arg1 * 128 + 64;
            var8.field2791 = arg2 * 128 + 64;
            var8.field2788 = arg3;
            var8.field2787 = arg5;
            if (class221.field3820[arg0][arg1][arg2] == null) {
                class221.field3820[arg0][arg1][arg2] = new class220(arg0, arg1, arg2);
            }
            class221.field3820[arg0][arg1][arg2].field3805 = var8;
        }
    }

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "(I)V")
    public static final void method212(int arg0) {
        int var1 = 35 % ((arg0 - -41) / 61);
        ++field445;
        if (class88.field1402 == null) {
            if (class244.field4229 == null) {
                int var2 = class146.field2406;
                if (class33.field534) {
                    if (~var2 != -2) {
                        int var7 = class79.field1279;
                        int var8 = class183.field3215;
                        if (~var7 > ~(class8.field154 + -10) || class8.field154 + class64.field1002 - -10 < var7 || var8 < class250.field4360 + -10 || ~var8 < ~(class250.field4360 - -class265.field4621 - -10)) {
                            class33.field534 = false;
                            class191.method1318(class64.field1002, class8.field154, class250.field4360, class265.field4621, -4);
                        }
                    }
                    if (~var2 != -2) {
                        return;
                    }
                    int var9 = class8.field154;
                    int var10 = class64.field1002;
                    int var11 = class250.field4360;
                    int var12 = class93.field1478;
                    int var13 = class235.field4093;
                    int var14 = -1;
                    for (int var15 = 0; ~var15 > ~class131.field2177; ++var15) {
                        int var16 = (class131.field2177 + -1 + -var15) * 15 + var11 + 31;
                        if (~var9 > ~var13 && ~var13 > ~(var9 + var10) && var12 > var16 + -13 && var12 < var16 + 3) {
                            var14 = var15;
                        }
                    }
                    if (var14 != -1) {
                        class230.method1533(var14, 1);
                    }
                    class33.field534 = false;
                    class191.method1318(class64.field1002, class8.field154, class250.field4360, class265.field4621, -80);
                } else {
                    if (var2 == 1 && class131.field2177 > 0) {
                        short var3 = class172.field2873[class131.field2177 - 1];
                        if (~var3 == -42 || var3 == 16 || var3 == 4 || ~var3 == -52 || ~var3 == -39 || ~var3 == -14 || var3 == 30 || ~var3 == -24 || ~var3 == -4 || var3 == 5 || var3 == 45 || ~var3 == -1005) {
                            int var4 = class222.field3830[class131.field2177 - 1];
                            int var5 = class22.field395[class131.field2177 + -1];
                            class175 var6 = class52.method394(var5, false);
                            if (class157.method1045(-112, client.method1058(var6)) || class209.method1386(client.method1058(var6), -78)) {
                                class232.field4055 = 0;
                                class244.field4237 = false;
                                if (class88.field1402 != null) {
                                    class218.method1453((byte) -111, class88.field1402);
                                }
                                class88.field1402 = class52.method394(var5, false);
                                class45.field694 = var4;
                                class220.field3795 = class93.field1478;
                                class88.field1406 = class235.field4093;
                                class218.method1453((byte) -72, class88.field1402);
                                return;
                            }
                        }
                    }
                    if (var2 == 1 && (class238.field4133 == 1 && class131.field2177 > 2 || class136.method876(2000, class131.field2177 - 1))) {
                        var2 = 2;
                    }
                    if (var2 == 1 && ~class131.field2177 < -1 || class94.field1492 == 2) {
                        class230.method1533(class131.field2177 - 1, 1);
                    }
                    if (~var2 == -3 && ~class131.field2177 < -1 || ~class94.field1492 == -2) {
                        class169.method1122(113);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "(I)I")
    public static final int method213(int arg0) {
        if (arg0 != 13315) {
            return -49;
        } else {
            ++field448;
            if (class38.field596) {
                return 0;
            } else if (!class219.method1460(51885665)) {
                return 1;
            } else {
                return class8.field140 ? 2 : 1;
            }
        }
    }

    @OriginalMember(owner = "client!cb", name = "h", descriptor = "(I)V")
    private final void method214(int arg0) {
        if (~this.field435 >= -1) {
            if (this.field447 != null && this.field447.length == this.field446) {
                this.field424 = new short[this.field446];
                for (int var2 = 0; ~var2 > ~this.field446; ++var2) {
                    this.field424[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
                }
            }
        } else {
            this.field424 = new short[this.field446];
            this.field447 = new short[this.field446];
            for (int var3 = 0; this.field446 > var3; ++var3) {
                this.field447[var3] = (short) ((int) (4096.0D * Math.pow((double) ((float) this.field435 / 4096.0F), (double) var3)));
                this.field424[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
        if (arg0 != 23463) {
            field434 = null;
        }
        ++field444;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IB)[I")
    public final int[] method24(int arg0, byte arg1) {
        ++field425;
        int[] var3 = super.field3640.method737(true, arg0);
        if (super.field3640.field1813) {
            this.method215(126, var3, arg0);
        }
        return arg1 <= 25 ? null : var3;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I[II)V")
    private final void method215(int arg0, int[] arg1, int arg2) {
        ++field426;
        if (arg0 <= 81) {
            method211(-59, -16, -18, 51, (class208) null, 108L, true);
        }
        int var4 = class176.field3090[arg2] * this.field440;
        if (~this.field446 == -2) {
            short var5 = this.field447[0];
            int var6 = this.field424[0] << 12;
            int var7 = var4 * var6 >> 12;
            int var8 = this.field437 * var6 >> 12;
            int var9 = this.field440 * var6 >> 12;
            int var10 = var7 >> 12;
            int var11 = var7 & 4095;
            int var12 = class166.field2824[var11];
            int var13 = var10 + 1;
            if (~var9 >= ~var13) {
                var13 = 0;
            }
            int var14 = 255 & this.field450[255 & var13];
            int var15 = 255 & this.field450[255 & var10];
            if (this.field441) {
                for (int var16 = 0; var16 < class26.field452; ++var16) {
                    int var17 = class253.field4416[var16] * this.field437;
                    int var18 = this.method219(var15, var6 * var17 >> 12, var12, var8, -122, var14, var11);
                    int var19 = var5 * var18 >> 12;
                    arg1[var16] = (var19 >> 1) + 2048;
                }
            } else {
                for (int var20 = 0; ~var20 > ~class26.field452; ++var20) {
                    int var21 = class253.field4416[var20] * this.field437;
                    int var22 = this.method219(var15, var6 * var21 >> 12, var12, var8, -127, var14, var11);
                    arg1[var20] = var5 * var22 >> 12;
                }
            }
        } else {
            short var23 = this.field447[0];
            if (var23 > 8 || var23 < -8) {
                int var24 = this.field424[0] << 12;
                int var25 = this.field440 * var24 >> 12;
                int var26 = var4 * var24 >> 12;
                int var27 = this.field437 * var24 >> 12;
                int var28 = var26 >> 12;
                int var29 = this.field450[255 & var28] & 255;
                int var30 = var28 + 1;
                int var31 = var26 & 4095;
                if (var25 <= var30) {
                    var30 = 0;
                }
                int var32 = class166.field2824[var31];
                int var33 = this.field450[var30 & 255] & 255;
                for (int var34 = 0; ~var34 > ~class26.field452; ++var34) {
                    int var54 = class253.field4416[var34] * this.field437;
                    int var55 = this.method219(var29, var24 * var54 >> 12, var32, var27, 44, var33, var31);
                    arg1[var34] = var23 * var55 >> 12;
                }
            }
            for (int var35 = 1; ~this.field446 < ~var35; ++var35) {
                short var36 = this.field447[var35];
                if (~var36 < -9 || var36 < -8) {
                    int var37 = this.field424[var35] << 12;
                    int var38 = var4 * var37 >> 12;
                    int var39 = this.field437 * var37 >> 12;
                    int var40 = var38 >> 12;
                    int var41 = this.field440 * var37 >> 12;
                    int var42 = var38 & 4095;
                    int var43 = var40 + 1;
                    int var44 = class166.field2824[var42];
                    if (var43 >= var41) {
                        var43 = 0;
                    }
                    int var45 = 255 & this.field450[255 & var40];
                    int var46 = 255 & this.field450[var43 & 255];
                    if (this.field441 && ~(this.field446 + -1) == ~var35) {
                        for (int var47 = 0; class26.field452 > var47; ++var47) {
                            int var48 = class253.field4416[var47] * this.field437;
                            int var49 = this.method219(var45, var37 * var48 >> 12, var44, var39, 3, var46, var42);
                            int var50 = arg1[var47] - -(var36 * var49 >> 12);
                            arg1[var47] = (var50 >> 1) + 2048;
                        }
                    } else {
                        for (int var51 = 0; ~class26.field452 < ~var51; ++var51) {
                            int var52 = class253.field4416[var51] * this.field437;
                            int var53 = this.method219(var45, var37 * var52 >> 12, var44, var39, 22, var46, var42);
                            arg1[var51] += var36 * var53 >> 12;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cb", name = "i", descriptor = "(I)V")
    public static void method216(int arg0) {
        field443 = null;
        field430 = null;
        field442 = null;
        field427 = null;
        field422 = null;
        field428 = null;
        field434 = null;
        if (arg0 != 15505) {
            method211(-51, -114, 95, 115, (class208) null, -83L, false);
        }
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "()V")
    public class25() {
        super(0, true);
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(Z)V")
    public final void method46(boolean arg0) {
        if (arg0) {
            ++field431;
            this.field450 = class211.method1399(0, this.field429);
            this.method214(23463);
            for (int var2 = this.field446 + -1; var2 >= 1; --var2) {
                short var3 = this.field447[var2];
                if (var3 > 8) {
                    return;
                }
                if (var3 < -8) {
                    return;
                }
                --this.field446;
            }
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lvf;II)V")
    public final void method26(class230 arg0, int arg1, int arg2) {
        ++field433;
        if (arg2 != -3) {
            this.field429 = -14;
        }
        if (~arg1 != -1) {
            if (arg1 == 1) {
                this.field446 = arg0.method1516((byte) 82);
            } else {
                if (~arg1 != -3) {
                    if (arg1 == 3) {
                        this.field437 = this.field440 = arg0.method1516((byte) 82);
                        return;
                    }
                    if (arg1 == 4) {
                        this.field429 = arg0.method1516((byte) 82);
                        return;
                    }
                    if (arg1 == 5) {
                        this.field437 = arg0.method1516((byte) 82);
                        return;
                    }
                    if (arg1 == 6) {
                        this.field440 = arg0.method1516((byte) 82);
                        return;
                    }
                } else {
                    this.field435 = arg0.method1515(arg2 + 128);
                    if (this.field435 < 0) {
                        this.field447 = new short[this.field446];
                        for (int var5 = 0; ~this.field446 < ~var5; ++var5) {
                            this.field447[var5] = (short) arg0.method1515(-121);
                        }
                        return;
                    }
                }
            }
        } else {
            this.field441 = arg0.method1516((byte) 82) == 1;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ZLjb;)V")
    public static final void method217(boolean arg0, class11 arg1) {
        class18.field317 = arg1;
        ++field432;
        if (!arg0) {
            field422 = null;
        }
    }

    @OriginalMember(owner = "client!cb", name = "j", descriptor = "(I)V")
    public static final void method218(int arg0) {
        ++field449;
        if (~class152.field2537 > -1) {
            class152.field2537 = 0;
            class98.field1584 = -1;
            class76.field1222 = -1;
        }
        if (class62.field967 < class152.field2537) {
            class98.field1584 = -1;
            class76.field1222 = -1;
            class152.field2537 = class62.field967;
        }
        if (class203.field3489 < 0) {
            class76.field1222 = -1;
            class98.field1584 = -1;
            class203.field3489 = 0;
        }
        if (arg0 >= 122) {
            if (class203.field3489 > class222.field3840) {
                class76.field1222 = -1;
                class98.field1584 = -1;
                class203.field3489 = class222.field3840;
            }
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIIIII)I")
    private final int method219(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field438;
        int var8 = arg1 >> 12;
        int var9 = arg1 & 4095;
        int var10 = var8 + 1;
        int var11 = var8 & 255;
        int var12 = -4 % ((-74 - arg4) / 46);
        int var13 = var9 + -4096;
        if (var10 >= arg3) {
            var10 = 0;
        }
        int var14 = arg6 - 4096;
        int var15 = class166.field2824[var9];
        int var16 = var10 & 255;
        int var17 = 3 & this.field450[arg0 + var11];
        int var18;
        if (~var17 < -2) {
            var18 = var17 != 2 ? -arg6 + -var9 : var9 - arg6;
        } else {
            var18 = ~var17 != -1 ? -var9 + arg6 : var9 - -arg6;
        }
        int var19 = this.field450[var16 - -arg0] & 3;
        int var20;
        if (var19 <= 1) {
            var20 = var19 != 0 ? -var13 + arg6 : arg6 + var13;
        } else {
            var20 = var19 != 2 ? -arg6 + -var13 : var13 - arg6;
        }
        int var21 = 3 & this.field450[arg5 + var11];
        int var22 = ((var20 - var18) * var15 >> 12) + var18;
        int var23;
        if (var21 <= 1) {
            var23 = ~var21 == -1 ? var9 + var14 : -var9 + var14;
        } else {
            var23 = ~var21 == -3 ? -var14 + var9 : -var9 + -var14;
        }
        int var24 = 3 & this.field450[arg5 + var16];
        int var25;
        if (var24 > 1) {
            var25 = ~var24 == -3 ? -var14 + var13 : -var13 + -var14;
        } else {
            var25 = var24 == 0 ? var13 + var14 : -var13 + var14;
        }
        int var26 = ((var25 - var23) * var15 >> 12) + var23;
        return var22 - -((-var22 + var26) * arg2 >> 12);
    }
}
