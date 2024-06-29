import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class270 extends class273 {

    @OriginalMember(owner = "client!ui", name = "T", descriptor = "Lic;")
    public static class160 field4337 = new class160(30);

    @OriginalMember(owner = "client!ui", name = "X", descriptor = "[I")
    public static int[] field4341 = new int[5];

    @OriginalMember(owner = "client!ui", name = "J", descriptor = "I")
    public static int field4327;

    @OriginalMember(owner = "client!ui", name = "K", descriptor = "I")
    private int field4328;

    @OriginalMember(owner = "client!ui", name = "L", descriptor = "I")
    public static int field4329;

    @OriginalMember(owner = "client!ui", name = "M", descriptor = "I")
    public static int field4330;

    @OriginalMember(owner = "client!ui", name = "N", descriptor = "I")
    public static int field4331;

    @OriginalMember(owner = "client!ui", name = "O", descriptor = "I")
    public static int field4332;

    @OriginalMember(owner = "client!ui", name = "P", descriptor = "I")
    private int field4333;

    @OriginalMember(owner = "client!ui", name = "Q", descriptor = "I")
    public static int field4334;

    @OriginalMember(owner = "client!ui", name = "R", descriptor = "I")
    public static int field4335;

    @OriginalMember(owner = "client!ui", name = "S", descriptor = "I")
    private int field4336;

    @OriginalMember(owner = "client!ui", name = "U", descriptor = "I")
    public static int field4338;

    @OriginalMember(owner = "client!ui", name = "V", descriptor = "I")
    public static int field4339;

    @OriginalMember(owner = "client!ui", name = "W", descriptor = "I")
    public static int field4340;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(BIIII)V")
    public static final void method1834(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = -49 % ((arg0 - -65) / 34);
        if (~arg3 <= ~class32.field540 && ~arg3 >= ~class61.field1034) {
            int var6 = class32.method278(class108.field1650, 1, class154.field2509, arg2);
            int var7 = class32.method278(class108.field1650, 1, class154.field2509, arg4);
            class106.method795(arg3, arg1, var7, 109, var6);
        }
        ++field4334;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(BI)V")
    private final void method1835(byte arg0, int arg1) {
        if (arg0 != -29) {
            this.method1835((byte) 35, 0);
        }
        this.field4333 = (255 & arg1) << 4;
        this.field4328 = (65280 & arg1) >> 4;
        this.field4336 = (arg1 & 16711680) >> 12;
        ++field4331;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lig;II)V")
    public final void method2(class136 arg0, int arg1, int arg2) {
        ++field4330;
        if (arg1 == 0) {
            this.method1835((byte) -29, arg0.method1009(98));
        }
        if (arg2 != 5) {
            method1840((byte) -2);
        }
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(ZLsb;)V")
    public static final void method1836(boolean arg0, class124 arg1) {
        ++field4339;
        class11.field159 = arg1.method889("titlebg", -1);
        class262.field4161 = arg1.method889("logo", -1);
        if (arg0) {
            field4337 = null;
        }
    }

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "(I)V")
    public static final void method1837(int arg0) {
        ++field4327;
        int var1 = -61 / ((arg0 - -44) / 39);
        int var2 = class23.field362.method579(class139.field2332);
        for (int var3 = 0; ~var3 > ~class42.field776; ++var3) {
            int var7 = class23.field362.method579(class55.method447(-114, var3));
            if (~var2 > ~var7) {
                var2 = var7;
            }
        }
        var2 += 8;
        int var4 = class42.field776 * 15 - -21;
        int var5 = class251.field3997 - var2 / 2;
        int var6 = class180.field3002;
        if (~class33.field557 > ~(var6 - -var4)) {
            var6 = -var4 + class33.field557;
        }
        if (class137.field2301 < var2 + var5) {
            var5 = -var2 + class137.field2301;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        if (~var5 > -1) {
            var5 = 0;
        }
        if (class254.field4055 == 1) {
            if (class251.field3997 == class104.field1584 && class283.field4489 == class180.field3002) {
                class198.field3226 = true;
                class190.field3121 = var2;
                class254.field4055 = 0;
                class224.field3569 = var5;
                class267.field4274 = var6;
                class66.field1088 = class42.field776 * 15 + (!class38.field661 ? 22 : 26);
                return;
            }
        } else {
            if (class269.field4320 == class251.field3997 && class180.field3002 == class111.field1707) {
                class190.field3121 = var2;
                class198.field3226 = true;
                class66.field1088 = (class38.field661 ? 26 : 22) + class42.field776 * 15;
                class224.field3569 = var5;
                class267.field4274 = var6;
                class254.field4055 = 0;
                return;
            }
            class254.field4055 = 1;
            class104.field1584 = class269.field4320;
            class283.field4489 = class111.field1707;
        }
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "()V")
    public class270() {
        this(0);
    }

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "(I)V")
    public static void method1838(int arg0) {
        field4337 = null;
        field4341 = null;
        if (arg0 != 0) {
            method1834((byte) -100, -62, 20, 66, 44);
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIIIILml;I)V")
    public static final void method1839(int arg0, int arg1, int arg2, int arg3, int arg4, class13 arg5, int arg6) {
        long var7 = 0L;
        if (arg4 == 0) {
            var7 = class76.method602(arg6, arg1, arg3);
        } else if (arg4 == 1) {
            var7 = class224.method1506(arg6, arg1, arg3);
        } else if (arg4 == 2) {
            var7 = class38.method317(arg6, arg1, arg3);
        } else if (arg4 == 3) {
            var7 = class205.method1382(arg6, arg1, arg3);
        }
        boolean var9 = true;
        int var10 = Integer.MAX_VALUE & (int) (var7 >>> 32);
        boolean var11 = false;
        boolean var12 = false;
        int var13 = ((int) var7 & 520250) >> 14;
        if (arg2 > -88) {
            method1841(73);
        }
        int var14 = (int) var7 >> 20 & 3;
        ++field4338;
        class248 var15 = class46.method396(var10, (byte) 63);
        if (var15.method1644(true)) {
            class247.method1642(arg6, 128, var15, arg3, arg1);
        }
        if (~var7 != -1L) {
            if (arg4 == 0) {
                class34.method289(arg6, arg1, arg3);
                if (var15.field3892 != 0) {
                    arg5.method81(var13, arg1, var15.field3909, !var15.field3927, arg3, var14, (byte) -11);
                }
            } else if (arg4 != 1) {
                if (~arg4 != -3) {
                    if (~arg4 == -4) {
                        class4.method21(arg6, arg1, arg3);
                        if (~var15.field3892 == -2) {
                            arg5.method87(arg1, arg3, (byte) 40);
                        }
                    }
                } else {
                    class256.method1711(arg6, arg1, arg3);
                    if (var15.field3892 != 0 && var15.field3947 + arg1 < 104 && ~(var15.field3947 + arg3) > -105 && ~(arg1 - -var15.field3960) > -105 && var15.field3960 + arg3 < 104) {
                        arg5.method83(arg1, var15.field3960, var15.field3947, arg3, !var15.field3927, var15.field3909, -3222, var14);
                    }
                }
            } else {
                class195.method1331(arg6, arg1, arg3);
            }
            if (var15.field3897 != null) {
                class248 var20 = var15.method1656(0);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "(B)V")
    public static final void method1840(byte arg0) {
        ++field4340;
        class36.method304(arg0 ^ -115);
        class18.method135(-97);
        class266.method1817(-117);
        class131.method946(3468);
        class232.method1534(-27834);
        class23.method188((byte) -79);
        class226.method1513((byte) 47);
        class279.method1877(-123);
        class245.method1623(-118);
        class141.method1047(64);
        class204.method1376(0);
        class71.method552(false);
        class67.method519(-129);
        class85.method678((byte) 50);
        class213.method1412(true);
        class128.method937(arg0 + -21268);
        class232.method1533(true);
        class179.method1269((byte) -7);
        if (class237.field3745 != 0) {
            for (int var1 = 0; var1 < class23.field366.length; ++var1) {
                class23.field366[var1] = null;
            }
            class224.field3571 = 0;
        }
        class144.method1067(-15600);
        class161.method1166(11976);
        class3.field37.method1157(760);
        ((class283) class95.field1483).method1897(true);
        class286.field4551.method1519(true);
        class2.field21.method909(67);
        class185.field3045.method909(71);
        class262.field4160.method909(-92);
        if (arg0 != -115) {
            method1834((byte) -20, 83, 112, -90, -102);
        }
        class205.field3300.method909(124);
        class91.field1431.method909(66);
        class10.field134.method909(arg0 ^ 98);
        class197.field3219.method909(-46);
        class35.field594.method909(-65);
        class268.field4305.method909(-40);
        class94.field1471.method909(arg0 ^ 32);
        class234.field3712.method909(107);
        class50.field922.method1157(760);
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(I)V")
    private class270(int arg0) {
        super(0, false);
        this.method1835((byte) -29, arg0);
    }

    @OriginalMember(owner = "client!ui", name = "g", descriptor = "(I)Lig;")
    public static final class136 method1841(int arg0) {
        class136 var1 = new class136(34);
        ++field4335;
        var1.method966((byte) 110, 11);
        var1.method966((byte) 109, class220.field3520);
        var1.method966((byte) 57, !class201.field3274 ? 0 : 1);
        var1.method966((byte) 124, class230.field3660 ? 1 : 0);
        var1.method966((byte) 101, class151.field2470 ? 1 : 0);
        var1.method966((byte) 72, class112.field1731 ? 1 : 0);
        var1.method966((byte) 64, !class104.field1595 ? 0 : 1);
        var1.method966((byte) 65, class153.field2495 ? 1 : 0);
        var1.method966((byte) 63, !class150.field2463 ? 0 : 1);
        var1.method966((byte) 69, class153.field2496 ? 1 : 0);
        var1.method966((byte) 79, class112.field1735);
        var1.method966((byte) 43, !class80.field1324 ? 0 : 1);
        var1.method966((byte) 74, !class89.field1425 ? 0 : 1);
        var1.method966((byte) 78, class132.field2209 ? 1 : 0);
        var1.method966((byte) 91, class255.field4071);
        var1.method966((byte) 86, !class179.field2991 ? 0 : 1);
        if (arg0 != 1) {
            method1842(true, (String) null);
        }
        var1.method966((byte) 75, class77.field1287);
        var1.method966((byte) 90, class274.field4382);
        var1.method966((byte) 96, class111.field1719);
        var1.method971(arg0 + 3791, class134.field2221);
        var1.method971(arg0 ^ 3793, class37.field626);
        var1.method966((byte) 114, class98.method741());
        var1.method1029(class14.field198, 15430);
        var1.method966((byte) 55, class179.field2990);
        var1.method966((byte) 84, !class234.field3710 ? 0 : 1);
        var1.method966((byte) 35, class256.field4075 ? 1 : 0);
        var1.method966((byte) 64, class282.field4476);
        var1.method966((byte) 71, !class171.field2825 ? 0 : 1);
        var1.method966((byte) 73, !class137.field2308 ? 0 : 1);
        return var1;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(II)[[I")
    public final int[][] method3(int arg0, int arg1) {
        ++field4329;
        int[][] var3 = super.field4357.method1949(true, arg1);
        if (arg0 <= 122) {
            method1834((byte) 47, 126, 122, -80, -118);
        }
        if (super.field4357.field4631) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; class26.field458 > var7; ++var7) {
                var4[var7] = this.field4336;
                var5[var7] = this.field4328;
                var6[var7] = this.field4333;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ZLjava/lang/String;)V")
    public static final void method1842(boolean arg0, String arg1) {
        ++field4332;
        if (class290.field4618 != null) {
            if (!arg0) {
                method1839(-128, -88, -77, -18, 1, (class13) null, -44);
            }
            int var2 = 0;
            long var3 = class260.method1739(!arg0, arg1);
            if (~var3 != -1L) {
                while (~var2 > ~class290.field4618.length && class290.field4618[var2].field2406 != var3) {
                    ++var2;
                }
                if (var2 < class290.field4618.length && class290.field4618[var2] != null) {
                    ++class59.field1019;
                    class87.field1405.method607(109, (byte) 90);
                    class87.field1405.method967((byte) -8, class290.field4618[var2].field2406);
                }
            }
        }
    }
}
