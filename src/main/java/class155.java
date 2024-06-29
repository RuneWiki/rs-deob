import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class155 {

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "Lve;")
    public static class189 field2832 = new class189(200);

    @OriginalMember(owner = "client!bj", name = "g", descriptor = "Lid;")
    public static class149 field2837 = class60.method382(")1", (byte) 104);

    @OriginalMember(owner = "client!bj", name = "j", descriptor = "Lid;")
    private static class149 field2840 = class60.method382("Select", (byte) 89);

    @OriginalMember(owner = "client!bj", name = "n", descriptor = "Lid;")
    public static class149 field2844 = field2840;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "I")
    public static int field2831;

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "I")
    public static int field2833;

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "I")
    public static int field2834;

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "I")
    public static int field2835;

    @OriginalMember(owner = "client!bj", name = "f", descriptor = "I")
    public static int field2836;

    @OriginalMember(owner = "client!bj", name = "h", descriptor = "I")
    public static int field2838;

    @OriginalMember(owner = "client!bj", name = "i", descriptor = "I")
    public static int field2839;

    @OriginalMember(owner = "client!bj", name = "k", descriptor = "I")
    public static int field2841;

    @OriginalMember(owner = "client!bj", name = "l", descriptor = "I")
    public static int field2842;

    @OriginalMember(owner = "client!bj", name = "m", descriptor = "I")
    public static int field2843;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)V")
    public static void method1096(int arg0) {
        field2837 = null;
        field2832 = null;
        field2840 = null;
        if (arg0 <= 3) {
            method1096(104);
        }
        field2844 = null;
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(I)Lqk;")
    public static final class208 method1097(int arg0) {
        field2836++;
        if (class108.field1877.length > class107.field1852) {
            return class108.field1877[class107.field1852++];
        } else {
            if (arg0 > -59) {
                field2840 = null;
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lal;IZLfg;Lal;)V")
    public static final void method1098(class230 arg0, int arg1, boolean arg2, class12 arg3, class230 arg4) {
        class90.field1603 = arg2;
        field2834++;
        class22.field315 = arg0;
        class158.field2905 = arg4;
        int var5 = class22.field315.method1531(21296) - 1;
        class44.field678 = var5 * 256 + class22.field315.method1559(var5, 108);
        class113.field1941 = new class149[] { null, null, null, null, class35.field514 };
        class170.field3148 = arg3;
        if (arg1 >= -92) {
            field2832 = null;
        }
        class223.field3933 = new class149[] { null, null, class45.field687, null, null };
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IILjava/awt/Component;I)Loh;")
    public static final class273 method1099(int arg0, int arg1, Component arg2, int arg3) {
        field2843++;
        if (arg0 >= -56) {
            return null;
        }
        try {
            Class var4 = Class.forName("wc");
            class273 var5 = (class273) var4.getDeclaredConstructor().newInstance();
            var5.method1469(arg1, arg3, arg2, (byte) -34);
            return var5;
        } catch (Throwable var7) {
            class217 var6 = new class217();
            var6.method1469(arg1, arg3, arg2, (byte) -83);
            return var6;
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIIIIIZ)V")
    public static final void method1100(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field2831++;
        if (class141.field2600 == arg4 && class277.field4953 == arg1 && class223.field3932 == arg0 || class123.method869(true)) {
            return;
        }
        class141.field2600 = arg4;
        class277.field4953 = arg1;
        class223.field3932 = arg0;
        if (class123.method869(true)) {
            class223.field3932 = 0;
        }
        if (arg6) {
            class50.method329(-11461, 28);
        } else {
            class50.method329(-11461, 25);
        }
        class73.method471(class3.field39, true, (byte) -55);
        int var7 = class115.field1969;
        int var8 = class125.field2199;
        class125.field2199 = (arg4 - 6) * 8;
        class115.field1969 = (arg1 - 6) * 8;
        class283.field5004 = class207.method1413(arg3 ^ 0x4BFB, class141.field2600 * 8, class277.field4953 * 8);
        class199.field3614 = null;
        int var9 = class115.field1969 - var7;
        int var10 = class125.field2199 - var8;
        int var11 = class115.field1969;
        int var12 = class125.field2199;
        if (arg6) {
            class182.field3281 = 0;
            for (int var13 = 0; var13 < 32768; var13++) {
                class20 var14 = class38.field572[var13];
                if (var14 != null) {
                    var14.field2340 -= var9 * 128;
                    var14.field2347 -= var10 * 128;
                    if (var14.field2347 >= 0 && var14.field2347 <= 13184 && var14.field2340 >= 0 && var14.field2340 <= 13184) {
                        for (int var15 = 0; var15 < 10; var15++) {
                            var14.field2333[var15] -= var10;
                            var14.field2400[var15] -= var9;
                        }
                        class110.field1906[class182.field3281++] = var13;
                    } else {
                        class38.field572[var13].method115((byte) -51, (class59) null);
                        class38.field572[var13] = null;
                    }
                }
            }
        } else {
            for (int var16 = 0; var16 < 32768; var16++) {
                class20 var32 = class38.field572[var16];
                if (var32 != null) {
                    for (int var33 = 0; var33 < 10; var33++) {
                        var32.field2333[var33] -= var10;
                        var32.field2400[var33] -= var9;
                    }
                    var32.field2340 -= var9 * 128;
                    var32.field2347 -= var10 * 128;
                }
            }
        }
        for (int var17 = 0; var17 < 2048; var17++) {
            class127 var30 = class107.field1851[var17];
            if (var30 != null) {
                for (int var31 = 0; var31 < 10; var31++) {
                    var30.field2333[var31] -= var10;
                    var30.field2400[var31] -= var9;
                }
                var30.field2340 -= var9 * 128;
                var30.field2347 -= var10 * 128;
            }
        }
        class277.field4948 = arg0;
        class77.field1449.method888(false, arg5, arg2, 14508);
        byte var18 = 0;
        byte var19 = 104;
        byte var20 = 1;
        if (var10 < 0) {
            var19 = -1;
            var18 = 103;
            var20 = -1;
        }
        byte var21 = 1;
        int var22 = arg3;
        byte var23 = 104;
        if (var9 < 0) {
            var23 = -1;
            var22 = 103;
            var21 = -1;
        }
        for (int var24 = var18; var24 != var19; var24 += var20) {
            for (int var26 = var22; var26 != var23; var26 += var21) {
                int var27 = var10 + var24;
                int var28 = var9 + var26;
                for (int var29 = 0; var29 < 4; var29++) {
                    if (var27 >= 0 && var28 >= 0 && var27 < 104 && var28 < 104) {
                        class83.field1515[var29][var24][var26] = class83.field1515[var29][var27][var28];
                    } else {
                        class83.field1515[var29][var24][var26] = null;
                    }
                }
            }
        }
        for (class18 var25 = (class18) class193.field3456.method1140(0); var25 != null; var25 = (class18) class193.field3456.method1127(0)) {
            var25.field280 -= var9;
            var25.field263 -= var10;
            if (var25.field263 < 0 || var25.field280 < 0 || var25.field263 >= 104 || var25.field280 >= 104) {
                var25.method401((byte) -118);
            }
        }
        class184.field3327 = 0;
        class157.field2888 = -1;
        if (arg6) {
            class246.field4321 -= var10;
            class269.field4853 -= var10 * 128;
            class243.field4266 -= var9;
            class190.field3414 -= var10;
            class197.field3584 -= var9;
            class2.field29 -= var9 * 128;
        } else {
            class194.field3468 = 1;
        }
        if (class210.field3748 != 0) {
            class210.field3748 -= var10;
            class141.field2598 -= var9;
        }
        class78.field1458.method1132((byte) 126);
        class166.field3083.method1132((byte) 126);
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(B)V")
    public static final void method1101(byte arg0) {
        for (int var1 = 0; var1 < class192.field3439; var1++) {
            class90 var2 = class217.method1462(var1, 16);
            if (var2 != null && var2.field1605 == 0) {
                class61.field1095[var1] = 0;
                class115.field1953[var1] = 0;
            }
        }
        class17.field250 = new class85(16);
        field2833++;
        if (arg0 < 28) {
            method1098((class230) null, 99, false, (class12) null, (class230) null);
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIBILja;)V")
    public static final void method1102(int arg0, int arg1, byte arg2, int arg3, class59 arg4) {
        field2835++;
        if (class60.field1092 >= 400) {
            return;
        }
        if (arg4.field1046 != null) {
            arg4 = arg4.method374(-1);
        }
        if (arg4 == null || !arg4.field1070) {
            return;
        }
        if (arg2 > -104) {
            field2837 = null;
        }
        class149 var5 = arg4.field1028;
        if (arg4.field1035 != 0) {
            class149 var6 = class245.field4306 == 1 ? class1.field7 : class181.field3274;
            var5 = class237.method1603(new class149[] { var5, class41.method240(class77.field1449.field2231, arg4.field1035, 4162), class224.field3936, var6, class211.method1434(arg4.field1035, true), class69.field1222 }, -127);
        }
        if (class43.field657 == 1) {
            class173.field3194++;
            class69.method434((byte) 110, class237.method1603(new class149[] { class70.field1237, class146.field2626, var5 }, -97), (short) 60, class43.field660, arg0, arg1, (long) arg3, class210.field3751);
        } else if (class40.field621) {
            class49 var14 = class273.field4901 == -1 ? null : class138.method964(-90, class273.field4901);
            if ((class247.field4332 & 0x2) != 0) {
                if (var14 == null || arg4.method367(class273.field4901, var14.field882, -1) != var14.field882) {
                    class69.method434((byte) 127, class237.method1603(new class149[] { class230.field4017, class146.field2626, var5 }, -125), (short) 32, class197.field3581, arg0, arg1, (long) arg3, class216.field3805);
                    class26.field395++;
                }
                return;
            }
        } else {
            class38.field568++;
            class149[] var7 = arg4.field1042;
            if (class261.field4601) {
                var7 = class240.method1650(var7, 0);
            }
            if (var7 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var7[var8] != null && (class245.field4306 != 0 || !var7[var8].method1048(-109, class122.field2160))) {
                        class139.field2546++;
                        byte var9 = 0;
                        if (var8 == 0) {
                            var9 = 49;
                        }
                        int var10 = -1;
                        if (arg4.field1052 == var8) {
                            var10 = arg4.field1058;
                        }
                        if (arg4.field1060 == var8) {
                            var10 = arg4.field1019;
                        }
                        if (var8 == 1) {
                            var9 = 19;
                        }
                        if (var8 == 2) {
                            var9 = 14;
                        }
                        if (var8 == 3) {
                            var9 = 29;
                        }
                        if (var8 == 4) {
                            var9 = 4;
                        }
                        class69.method434((byte) 112, class237.method1603(new class149[] { class247.field4336, var5 }, -103), var9, var7[var8], arg0, arg1, (long) arg3, var10);
                    }
                }
            }
            if (class245.field4306 == 0 && var7 != null) {
                for (int var11 = 4; var11 >= 0; var11--) {
                    if (var7[var11] != null && var7[var11].method1048(-100, class122.field2160)) {
                        class7.field75++;
                        short var12 = 0;
                        if (class77.field1449.field2231 < arg4.field1035) {
                            var12 = 2000;
                        }
                        short var13 = 0;
                        if (var11 == 0) {
                            var13 = 49;
                        }
                        if (var11 == 1) {
                            var13 = 19;
                        }
                        if (var11 == 2) {
                            var13 = 14;
                        }
                        if (var11 == 3) {
                            var13 = 29;
                        }
                        if (var11 == 4) {
                            var13 = 4;
                        }
                        if (var13 != 0) {
                            var13 += var12;
                        }
                        class69.method434((byte) 118, class237.method1603(new class149[] { class247.field4336, var5 }, -102), var13, var7[var11], arg0, arg1, (long) arg3, arg4.field1065);
                    }
                }
            }
            class69.method434((byte) 116, class237.method1603(new class149[] { class247.field4336, var5 }, -99), (short) 1007, class278.field4968, arg0, arg1, (long) arg3, class222.field3919);
            return;
        }
    }
}
