import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class429 extends class83 {

    @OriginalMember(owner = "client!tj", name = "S", descriptor = "I")
    private int field6300 = 20;

    @OriginalMember(owner = "client!tj", name = "N", descriptor = "I")
    private int field6295 = 1365;

    @OriginalMember(owner = "client!tj", name = "X", descriptor = "I")
    private int field6305 = 0;

    @OriginalMember(owner = "client!tj", name = "P", descriptor = "I")
    private int field6297 = 0;

    @OriginalMember(owner = "client!tj", name = "K", descriptor = "I")
    public static int field6292 = 0;

    @OriginalMember(owner = "client!tj", name = "M", descriptor = "I")
    public static int field6294 = 0;

    @OriginalMember(owner = "client!tj", name = "R", descriptor = "[C")
    public static char[] field6299 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!tj", name = "T", descriptor = "C")
    public static char field6301;

    @OriginalMember(owner = "client!tj", name = "L", descriptor = "I")
    public static int field6293;

    @OriginalMember(owner = "client!tj", name = "O", descriptor = "I")
    public static int field6296;

    @OriginalMember(owner = "client!tj", name = "Q", descriptor = "I")
    public static int field6298;

    @OriginalMember(owner = "client!tj", name = "U", descriptor = "I")
    public static int field6302;

    @OriginalMember(owner = "client!tj", name = "V", descriptor = "I")
    public static int field6303;

    @OriginalMember(owner = "client!tj", name = "W", descriptor = "I")
    public static int field6304;

    @OriginalMember(owner = "client!tj", name = "Y", descriptor = "I")
    public static int field6306;

    @OriginalMember(owner = "client!tj", name = "Z", descriptor = "I")
    public static int field6307;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(II)[I", line = 9)
    public final int[] method37(int arg0, int arg1) {
        ++field6307;
        if (arg0 != 2) {
            return null;
        } else {
            int[] var3 = super.field916.method1813(arg1, (byte) 115);
            if (super.field916.field4174) {
                for (int var4 = 0; class420.field6139 > var4; ++var4) {
                    int var5 = (class402.field5863[var4] << 12) / this.field6295 - -this.field6305;
                    int var6 = (class225.field3036[arg1] << 12) / this.field6295 + this.field6297;
                    int var7 = var5;
                    int var8 = var6;
                    int var9 = var5;
                    int var10 = var6;
                    int var11 = var5 * var5 >> 12;
                    int var12 = var6 * var6 >> 12;
                    int var13 = 0;
                    while (var11 - -var12 < 16384 && ~var13 > ~this.field6300) {
                        var10 = (var9 * var10 >> 12) * 2 + var8;
                        var9 = -var12 + var11 - -var7;
                        ++var13;
                        var12 = var10 * var10 >> 12;
                        var11 = var9 * var9 >> 12;
                    }
                    var3[var4] = ~(this.field6300 + -1) < ~var13 ? (var13 << 12) / this.field6300 : 0;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "(III)I", line = 66)
    public static final int method2651(int arg0, int arg1, int arg2) {
        ++field6293;
        int var3 = -128 + (class9.method41(arg1 + 91923, 2, arg0 - -45365, 4) + (-128 + class9.method41(arg1 - -37821, arg2 ^ 10292, arg0 + arg2, 2) >> 1) - -(class9.method41(arg1, 2, arg0, 1) - 128 >> 2));
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Lvm;I)V", line = 95)
    public static final void method2652(class322 arg0, int arg1) {
        ++field6304;
        int var2 = class344.field4618;
        int var3 = class18.field179;
        int var4 = class344.field4620;
        int var5 = class229.field3159 + -3;
        byte var6 = 20;
        if (class200.field2667 == null || class171.field2151 == null) {
            if (class72.field797.method1673(107, class293.field3975) && class72.field797.method1673(-128, class140.field1801)) {
                class200.field2667 = arg0.method1633(class241.method1289(class72.field797, class293.field3975, 0), true);
                class241 var7 = class241.method1289(class72.field797, class140.field1801, 0);
                class171.field2151 = arg0.method1633(var7, true);
                var7.method1287();
                class440.field6433 = arg0.method1633(var7, true);
            } else {
                arg0.method1614(var2, var3, var4, var6, class75.field847 | -class122.field1512 + 255 << 24, 1);
            }
        }
        if (class200.field2667 != null && class171.field2151 != null) {
            int var8 = (var4 - 2 * class171.field2151.method97()) / class200.field2667.method97();
            for (int var9 = 0; var9 < var8; ++var9) {
                class200.field2667.method93(var2 + class171.field2151.method97() + class200.field2667.method97() * var9, var3);
            }
            class171.field2151.method93(var2, var3);
            class440.field6433.method93(var4 + (var2 - class440.field6433.method97()), var3);
        }
        class291.field3957.method1746(-16777216 | class360.field5105, class320.field4286, var2 - -3, (byte) -126, -1, var3 + 14);
        arg0.method1614(var2, var3 + var6, var4, -var6 + var5, -class122.field1512 + 255 << 24 | class75.field847, 1);
        int var10 = class337.field4493;
        int var11 = class306.field4146;
        for (int var12 = 0; ~class244.field3323 < ~var12; ++var12) {
            int var26 = (class244.field3323 + -1 + -var12) * 16 + (var3 - (-var6 - 13));
            if (var10 > var2 && var2 + var4 > var10 && ~(var26 + -13) > ~var11 && ~(var26 + 3) < ~var11) {
                arg0.method1614(var2, var26 + -12, var4, 16, -class118.field1471 + 255 << 24 | class356.field5039, 1);
            }
        }
        if ((class162.field2076 == null || class126.field1621 == null || class75.field821 == null) && class72.field797.method1673(53, class266.field3623) && class72.field797.method1673(-13, class263.field3598) && class72.field797.method1673(-114, class227.field3102)) {
            class241 var13 = class241.method1289(class72.field797, class263.field3598, 0);
            class126.field1621 = arg0.method1633(var13, true);
            var13.method1287();
            class96.field1145 = arg0.method1633(var13, true);
            class162.field2076 = arg0.method1633(class241.method1289(class72.field797, class266.field3623, 0), true);
            class241 var14 = class241.method1289(class72.field797, class227.field3102, 0);
            class75.field821 = arg0.method1633(var14, true);
            var14.method1287();
            class371.field5197 = arg0.method1633(var14, true);
        }
        if (arg1 != 2) {
            method2653(-108, 111, -44, -55, 110, -56);
        }
        if (class162.field2076 != null && class126.field1621 != null && class75.field821 != null) {
            int var15 = (-(class75.field821.method97() * 2) + var4) / class162.field2076.method97();
            for (int var16 = 0; var16 < var15; ++var16) {
                class162.field2076.method93(var2 + class75.field821.method97() + var16 * class162.field2076.method97(), var3 + var5 - class162.field2076.method105());
            }
            int var17 = (-class75.field821.method105() + var5 + -var6) / class126.field1621.method105();
            for (int var18 = 0; ~var17 < ~var18; ++var18) {
                class126.field1621.method93(var2, var18 * class126.field1621.method105() + var6 + var3);
                class96.field1145.method93(-class96.field1145.method97() + var4 + var2, var6 + (var3 - -(class126.field1621.method105() * var18)));
            }
            class75.field821.method93(var2, var3 - -var5 - class75.field821.method105());
            class371.field5197.method93(-class75.field821.method97() + (var2 - -var4), var3 + var5 - class75.field821.method105());
        }
        int var19 = 0;
        for (class405 var20 = (class405) class342.field4577.method814((byte) 90); var20 != null; var20 = (class405) class342.field4577.method827(59)) {
            int var21 = (class244.field3323 + -1 + -var19) * 16 + var6 + var3 + 13;
            int var22 = class360.field5105 | -16777216;
            if (~var2 > ~var10 && var2 + var4 > var10 && ~var11 < ~(var21 + -13) && var21 + 3 > var11) {
                var22 = class94.field1095 | -16777216;
            }
            int[] var23 = null;
            if (!class306.method1798(var20.field5892, arg1 + 9053)) {
                if (class293.method1725((byte) 96, var20.field5892)) {
                    class91 var24 = class38.field397[(int) var20.field5891];
                    if (var24 != null) {
                        var23 = var24.field1035.field4655;
                    }
                } else if (class376.method2259((byte) -74, var20.field5892)) {
                    if (~var20.field5892 != -1011) {
                        var23 = class281.method1655((byte) -28, (int) (var20.field5891 >>> 32 & 2147483647L)).field3068;
                    } else {
                        var23 = class281.method1655((byte) -28, (int) var20.field5891).field3068;
                    }
                }
            } else {
                var23 = class65.method368((int) var20.field5891, -127).field1543;
            }
            String var25 = class83.method452(var20, 14963);
            if (var23 != null) {
                var25 = var25 + client.method1409((byte) 115, var23);
            }
            ++var19;
            class291.field3957.method1752(var22, class335.field4469, 0, var25, var2 - -3, -33, var21, class130.field1673);
        }
        class108.method575(class344.field4620, class229.field3159, class18.field179, 10636, class344.field4618);
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIIIII)V", line = 270)
    public static final void method2653(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field6302;
        int var6 = arg2;
        int var7 = arg3;
        int var8 = arg4 * arg4;
        int var9 = arg3 * arg3;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg3 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = -((var12 + -1) * var11) + var9;
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((arg2 << 1) - -3) * var10;
        int var18 = ((arg3 << 1) + -3) * var11;
        int var19 = (arg2 - -1) * var16;
        if (arg1 >= class335.field4462 && ~class6.field42 <= ~arg1) {
            int var20 = class104.method556(class322.field4306, arg2 + 2048, arg5 - -arg4, class310.field4183);
            int var21 = class104.method556(class322.field4306, arg2 + 2048, -arg4 + arg5, class310.field4183);
            class296.method1740(var21, class153.field1932[arg1], (byte) 81, arg0, var20);
        }
        int var22 = (arg3 + -1) * var15;
        while (var7 > 0) {
            if (var13 < 0) {
                while (~var13 > -1) {
                    var14 += var19;
                    var13 += var17;
                    ++var6;
                    var17 += var16;
                    var19 += var16;
                }
            }
            if (var14 < 0) {
                var14 += var19;
                var13 += var17;
                ++var6;
                var17 += var16;
                var19 += var16;
            }
            var13 += -var22;
            var14 += -var18;
            --var7;
            var22 -= var15;
            var18 -= var15;
            int var23 = -var7 + arg1;
            int var24 = arg1 + var7;
            if (~var24 <= ~class335.field4462 && ~var23 >= ~class6.field42) {
                int var25 = class104.method556(class322.field4306, arg2 + 2048, arg5 + var6, class310.field4183);
                int var26 = class104.method556(class322.field4306, arg2 + 2048, -var6 + arg5, class310.field4183);
                if (~class335.field4462 >= ~var23) {
                    class296.method1740(var26, class153.field1932[var23], (byte) 81, arg0, var25);
                }
                if (var24 <= class6.field42) {
                    class296.method1740(var26, class153.field1932[var24], (byte) 81, arg0, var25);
                }
            }
        }
    }

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "(II)V", line = 369)
    public static final void method2654(int arg0, int arg1) {
        int var2 = -128 / ((-67 - arg1) / 53);
        ++field6303;
        class40 var3 = class162.method872(arg0, (byte) 92, 6);
        var3.method193(-108);
    }

    @OriginalMember(owner = "client!tj", name = "<init>", descriptor = "()V", line = 393)
    public class429() {
        super(0, true);
    }

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "(I)V", line = 396)
    public static void method2655(int arg0) {
        if (arg0 == 381) {
            field6299 = null;
        }
    }

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "(I)V", line = 407)
    public static final void method2656(int arg0) {
        ++field6306;
        int var1 = class448.field6514.method305(arg0, -7985);
        if (~var1 > ~class293.field3991) {
            for (int var2 = var1; ~class293.field3991 < ~var2; ++var2) {
                class270.field3664[class388.field5553++] = class345.field4629[var2];
            }
        }
        if (~class293.field3991 > ~var1) {
            throw new RuntimeException("gppov1");
        } else {
            class293.field3991 = 0;
            for (int var3 = 0; ~var1 < ~var3; ++var3) {
                int var4 = class345.field4629[var3];
                class158 var5 = class85.field957[var4];
                int var6 = class448.field6514.method305(1, -7985);
                if (var6 == 0) {
                    class345.field4629[class293.field3991++] = var4;
                    var5.field6071 = class234.field3224;
                } else {
                    int var7 = class448.field6514.method305(2, -7985);
                    if (var7 == 0) {
                        class345.field4629[class293.field3991++] = var4;
                        var5.field6071 = class234.field3224;
                        class192.field2423[class338.field4509++] = var4;
                    } else if (~var7 == -2) {
                        class345.field4629[class293.field3991++] = var4;
                        var5.field6071 = class234.field3224;
                        int var8 = class448.field6514.method305(3, -7985);
                        var5.method2613(1, var8, 0);
                        int var9 = class448.field6514.method305(1, -7985);
                        if (var9 == 1) {
                            class192.field2423[class338.field4509++] = var4;
                        }
                    } else if (var7 == 2) {
                        class345.field4629[class293.field3991++] = var4;
                        var5.field6071 = class234.field3224;
                        if (~class448.field6514.method305(1, -7985) != -2) {
                            int var10 = class448.field6514.method305(3, -7985);
                            var5.method2613(0, var10, 0);
                        } else {
                            int var11 = class448.field6514.method305(3, arg0 ^ -7993);
                            var5.method2613(2, var11, 0);
                            int var12 = class448.field6514.method305(3, -7985);
                            var5.method2613(2, var12, 0);
                        }
                        int var13 = class448.field6514.method305(1, -7985);
                        if (var13 == 1) {
                            class192.field2423[class338.field4509++] = var4;
                        }
                    } else if (var7 == 3) {
                        class270.field3664[class388.field5553++] = var4;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IBLtq;)V", line = 524)
    public final void method35(int arg0, byte arg1, class250 arg2) {
        int var4 = -35 / ((arg1 - -27) / 50);
        ++field6298;
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    if (arg0 == 3) {
                        this.field6297 = arg2.method1374(-2);
                    }
                } else {
                    this.field6305 = arg2.method1374(-2);
                }
            } else {
                this.field6300 = arg2.method1374(-2);
            }
        } else {
            this.field6295 = arg2.method1374(-2);
        }
    }

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "(II)V", line = 579)
    public static final void method2657(int arg0, int arg1) {
        class328.method1883(97);
        ++field6296;
        class206.method1119((byte) 115);
        class89.method493(0, true, arg0);
        if (arg1 != 616516448) {
            field6292 = 112;
        }
        class425.method2642(class199.field2662, class72.field797, true, class88.field1003);
        class58.method313(class88.field1003, arg1 + -616516347, class72.field797);
        class365.method2216(class88.field999, (byte) 121);
        class206.method1116((byte) -56);
        class84.method458((byte) -100);
        if (class129.field1664 != 10) {
            if (class129.field1664 == 30) {
                class352.method2159(25, (byte) 65);
                return;
            }
            if (~class129.field1664 == -6) {
                class444.method2755((byte) -66, class88.field1003, class72.field797);
                return;
            }
        } else {
            class293.method1727(false, 101);
        }
    }
}
