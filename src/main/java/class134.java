import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class134 {

    @OriginalMember(owner = "client!ej", name = "g", descriptor = "I")
    public int field1681;

    @OriginalMember(owner = "client!ej", name = "f", descriptor = "I")
    public int field1680;

    @OriginalMember(owner = "client!ej", name = "k", descriptor = "S")
    public short field1685;

    @OriginalMember(owner = "client!ej", name = "e", descriptor = "S")
    public short field1679;

    @OriginalMember(owner = "client!ej", name = "j", descriptor = "B")
    public byte field1684;

    @OriginalMember(owner = "client!ej", name = "h", descriptor = "I")
    public int field1682;

    @OriginalMember(owner = "client!ej", name = "m", descriptor = "I")
    public int field1687;

    @OriginalMember(owner = "client!ej", name = "n", descriptor = "Z")
    public boolean field1688;

    @OriginalMember(owner = "client!ej", name = "i", descriptor = "I")
    public int field1683;

    @OriginalMember(owner = "client!ej", name = "l", descriptor = "S")
    public short field1686;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "I")
    public static int field1675;

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "I")
    public static int field1677;

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "I")
    public static int field1678;

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "Z")
    public static boolean field1676;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IILha;I)V", line = 5)
    public static final void method995(int arg0, int arg1, class66 arg2, int arg3) {
        field1675++;
        if (arg3 < 0 || arg1 < 0 || class403.field5319 == 0 || class449.field6221 == 0) {
            return;
        }
        class778 var4;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        if (class769.field10572) {
            class790.method4365(2, false);
            var4 = arg2.method574();
            int[] var5 = arg2.method569();
            var6 = var5[0];
            var7 = var5[3];
            var8 = var5[1];
            var9 = var5[2];
            var10 = class267.method1586(false, 9) + arg3;
            var11 = arg1 + class152.method1086((byte) -127, false);
        } else {
            arg2.method565(class230.field2729, class572.field7844, class403.field5319, class449.field6221);
            var9 = class403.field5319;
            var7 = class449.field6221;
            var6 = class230.field2729;
            var8 = class572.field7844;
            arg2.method556(class37.field555, class398.field5199, class403.field5319, class449.field6221);
            var4 = arg2.method614();
            var4.method133(class110.field1382, class92.field1220, class201.field2410, class55.field742, class31.field494, class595.field8081);
            var11 = arg1;
            var10 = arg3;
            arg2.method628(var4);
        }
        if (var7 == 0) {
            var7 = 1;
        }
        if (var9 == 0) {
            var9 = 1;
        }
        class435.method2574(true, true);
        if (class707.field9933 != null && (!class104.field1336 || (class667.field9161 & 0x40) != 0)) {
            int var12 = -1;
            int var13 = -1;
            int var14 = arg2.method610();
            int var15 = arg2.method568();
            int var16;
            int var17;
            int var18;
            int var19;
            if (class502.field7084) {
                var17 = var16 = (var10 - var6) * class621.field8528 / var9;
                var19 = var18 = (var11 - var8) * class621.field8528 / var7;
            } else {
                var19 = (var11 - var8) * var14 / var7;
                var16 = (var10 - var6) * var15 / var9;
                var17 = (var10 - var6) * var14 / var9;
                var18 = (var11 - var8) * var15 / var7;
            }
            int[] var20 = new int[] { var17, var19, var14 };
            var4.method124(var20);
            int[] var21 = new int[] { var16, var18, var15 };
            var4.method124(var21);
            float var22 = class690.method3852((float) var20[2], (float) var21[2], 4, (float) var20[1], (float) var20[0], true, (float) var21[1], (float) var21[0]);
            if (var22 > 0.0F) {
                int var23 = var21[0] - var20[0];
                int var24 = var21[2] - var20[2];
                int var25 = (int) ((float) var23 * var22 + (float) var20[0]);
                int var26 = (int) ((float) var24 * var22 + (float) var20[2]);
                var12 = (class300.field3596.method1665(1720746760) - 1 << 8) + var25 >> 9;
                var13 = var26 + (class300.field3596.method1665(arg0 ^ -1720766460) - 1 << 8) >> 9;
                byte var27 = class300.field3596.field808;
                if (var27 < 3 && (class124.field1585[1][var25 >> 9][var26 >> 9] & 0x2) != 0) {
                    int var87 = var27 + 1;
                }
            }
            if (var12 != -1 && var13 != -1) {
                if (class104.field1336 && (class667.field9161 & 0x40) != 0) {
                    class620 var28 = class481.method2859(class351.field4370, class215.field2531, arg0 + 36083);
                    if (var28 == null) {
                        class118.method926(arg0 ^ 0x4C88);
                    } else {
                        class620.method3534((long) (var12 << 0 | var13), -1, true, " ->", class748.field10390, 0L, false, arg0 + 19823, var13, 8, var12, class535.field7539, true);
                    }
                } else {
                    if (class448.field6025) {
                        class620.method3534((long) (var13 | var12 << 0), -1, true, "", -1, 0L, false, 121, var13, 4, var12, class637.field8702.method3584(class770.field10592, true), true);
                    }
                    class620.method3534((long) (var13 | var12 << 0), -1, true, "", class302.field3610, 0L, false, 122, var13, 60, var12, class576.field7869, true);
                    class438.field5764++;
                }
            }
        }
        if (class769.field10572) {
            class774.method4300((byte) -72);
        }
        int var29 = 0;
        if (arg0 != -19700) {
            method995(-35, 3, null, 5);
        }
        while ((class769.field10572 ? 2 : 1) > var29) {
            boolean var30 = var29 == 0;
            class497 var31 = var30 ? class613.field8242 : class571.field7835;
            int var32 = arg3;
            int var33 = arg1;
            if (class769.field10572) {
                class790.method4365(2, var30);
                var32 = arg3 + class267.method1586(var30, 9);
                var33 = arg1 + class152.method1086((byte) -128, var30);
            }
            class408 var34 = var31.field6949;
            for (class35 var35 = (class35) var34.method2447(-99); var35 != null; var35 = (class35) var34.method2439(-86)) {
                if ((class783.field10808 || class300.field3596.field808 == var35.field535.field808) && var35.method314(var32, arg2, -125, var33)) {
                    boolean var36 = false;
                    boolean var37 = false;
                    int var38;
                    int var39;
                    if (var35.field535 instanceof class712) {
                        var38 = ((class712) var35.field535).field9994;
                        var39 = ((class712) var35.field535).field9997;
                    } else {
                        var39 = var35.field535.field813 >> 9;
                        var38 = var35.field535.field823 >> 9;
                    }
                    if (var35.field535 instanceof class521) {
                        class521 var40 = (class521) var35.field535;
                        int var41 = var40.method1665(arg0 ^ 0x996F3004);
                        if ((var41 & 0x1) == 0 && (var40.field823 & 0x1FF) == 0 && (var40.field813 & 0x1FF) == 0 || (var41 & 0x1) == 1 && (var40.field823 & 0x1FF) == 256 && (var40.field813 & 0x1FF) == 256) {
                            int var42 = var40.field823 - (var40.method1665(1720746760) - 1 << 8);
                            int var43 = var40.field813 - (var40.method1665(1720746760) - 1 << 8);
                            for (int var44 = 0; var44 < class3.field42; var44++) {
                                class273 var51 = (class273) class30.field444.method2121(127, (long) class2.field29[var44]);
                                if (var51 != null) {
                                    class388 var52 = var51.field3210;
                                    if (class228.field2707 != var52.field3386 && var52.field3363) {
                                        int var53 = var52.field823 - (var52.field5003.field6710 - 1 << 8);
                                        int var54 = var52.field813 - (var52.field5003.field6710 - 1 << 8);
                                        if (var42 <= var53 && var52.field5003.field6710 <= (var40.method1665(1720746760) - (var53 - var42 >> 9)) && var54 >= var43 && var52.field5003.field6710 <= var40.method1665(1720746760) - (var54 - var43 >> 9)) {
                                            class597.method3413(var52, -42, class300.field3596.field808 != var35.field535.field808);
                                            var52.field3386 = class228.field2707;
                                        }
                                    }
                                }
                            }
                            int var45 = class235.field2787;
                            int[] var46 = class75.field1040;
                            for (int var47 = 0; var47 < var45; var47++) {
                                class521 var48 = class61.field825[var46[var47]];
                                if (var48 != null && class228.field2707 != var48.field3386 && var40 != var48 && var48.field3363) {
                                    int var49 = var48.field823 - (var48.method1665(1720746760) - 1 << 8);
                                    int var50 = var48.field813 - (var48.method1665(arg0 + 1720766460) - 1 << 8);
                                    if (var42 <= var49 && var48.method1665(1720746760) <= var40.method1665(arg0 ^ 0x996F3004) - (var49 - var42 >> 9) && var43 <= var50 && var48.method1665(1720746760) <= (var40.method1665(1720746760) - (var50 - var43 >> 9))) {
                                        class542.method3208(0, var48, class300.field3596.field808 != var35.field535.field808);
                                        var48.field3386 = class228.field2707;
                                    }
                                }
                            }
                        }
                        if (class228.field2707 == var40.field3386) {
                            continue;
                        }
                        class542.method3208(0, var40, class300.field3596.field808 != var35.field535.field808);
                        var40.field3386 = class228.field2707;
                    }
                    if (var35.field535 instanceof class388) {
                        class388 var55 = (class388) var35.field535;
                        if (var55.field5003 != null) {
                            if ((var55.field5003.field6710 & 0x1) == 0 && (var55.field823 & 0x1FF) == 0 && (var55.field813 & 0x1FF) == 0 || (var55.field5003.field6710 & 0x1) == 1 && (var55.field823 & 0x1FF) == 256 && (var55.field813 & 0x1FF) == 256) {
                                int var56 = var55.field823 - (var55.field5003.field6710 - 1 << 8);
                                int var57 = var55.field813 - (var55.field5003.field6710 - 1 << 8);
                                for (int var58 = 0; var58 < class3.field42; var58++) {
                                    class273 var65 = (class273) class30.field444.method2121(91, (long) class2.field29[var58]);
                                    if (var65 != null) {
                                        class388 var66 = var65.field3210;
                                        if (class228.field2707 != var66.field3386 && var55 != var66 && var66.field3363) {
                                            int var67 = var66.field823 - (var66.field5003.field6710 - 1 << 8);
                                            int var68 = var66.field813 - (var66.field5003.field6710 - 1 << 8);
                                            if (var56 <= var67 && var66.field5003.field6710 <= (var55.field5003.field6710 - (var67 - var56 >> 9)) && var57 <= var68 && var66.field5003.field6710 <= (var55.field5003.field6710 - (var68 - var57 >> 9))) {
                                                class597.method3413(var66, -56, class300.field3596.field808 != var35.field535.field808);
                                                var66.field3386 = class228.field2707;
                                            }
                                        }
                                    }
                                }
                                int var59 = class235.field2787;
                                int[] var60 = class75.field1040;
                                for (int var61 = 0; var61 < var59; var61++) {
                                    class521 var62 = class61.field825[var60[var61]];
                                    if (var62 != null && class228.field2707 != var62.field3386 && var62.field3363) {
                                        int var63 = var62.field823 - (var62.method1665(arg0 + 1720766460) - 1 << 8);
                                        int var64 = var62.field813 - (var62.method1665(1720746760) - 1 << 8);
                                        if (var56 <= var63 && var62.method1665(1720746760) <= var55.field5003.field6710 - (var63 - var56 >> 9) && var64 >= var57 && var62.method1665(1720746760) <= var55.field5003.field6710 - (var64 - var57 >> 9)) {
                                            class542.method3208(0, var62, class300.field3596.field808 != var35.field535.field808);
                                            var62.field3386 = class228.field2707;
                                        }
                                    }
                                }
                            }
                            if (class228.field2707 == var55.field3386) {
                                continue;
                            }
                            class597.method3413(var55, -63, class300.field3596.field808 != var35.field535.field808);
                            var55.field3386 = class228.field2707;
                        }
                    }
                    if (var35.field535 instanceof class57) {
                        int var69 = var38 + class632.field8626;
                        int var70 = var39 + class620.field8435;
                        class667 var71 = (class667) class673.field9230.method2121(53, (long) (var35.field535.field808 << 28 | var70 << 14 | var69));
                        if (var71 != null) {
                            int var72 = 0;
                            for (class659 var73 = (class659) var71.field9164.method2734(8); var73 != null; var73 = (class659) var71.field9164.method2737((byte) -127)) {
                                class340 var74 = class121.field1555.method2882(var73.field9062, -22087);
                                if (class104.field1336 && class300.field3596.field808 == var35.field535.field808) {
                                    class613 var75 = class348.field4348 == -1 ? null : class113.field1426.method4366(true, class348.field4348);
                                    if ((class667.field9161 & 0x1) != 0 && (var75 == null || var74.method2009((byte) 119, var75.field8244, class348.field4348) != var75.field8244)) {
                                        class620.method3534((long) var72, -1, false, class481.field6718 + " -> <col=ff9040>" + var74.field4222, class748.field10390, (long) var73.field9062, false, 124, var39, 30, var38, class535.field7539, true);
                                        class337.field4169++;
                                    }
                                }
                                if (class300.field3596.field808 == var35.field535.field808) {
                                    String[] var76 = var74.field4194;
                                    for (int var77 = 4; var77 >= 0; var77--) {
                                        if (var76 != null && var76[var77] != null) {
                                            byte var78 = 0;
                                            if (var77 == 0) {
                                                var78 = 20;
                                            }
                                            int var79 = class170.field2043;
                                            if (var77 == 1) {
                                                var78 = 11;
                                            }
                                            if (var77 == 2) {
                                                var78 = 15;
                                            }
                                            if (var77 == 3) {
                                                var78 = 16;
                                            }
                                            if (var77 == 4) {
                                                var78 = 22;
                                            }
                                            if (var74.field4247 == var77) {
                                                var79 = var74.field4268;
                                            }
                                            if (var74.field4207 == var77) {
                                                var79 = var74.field4190;
                                            }
                                            class620.method3534((long) var72, -1, false, "<col=ff9040>" + var74.field4222, var79, (long) var73.field9062, false, 121, var39, var78, var38, var76[var77], true);
                                            class156.field1936++;
                                        }
                                    }
                                }
                                class620.method3534((long) var72, -1, false, "<col=ff9040>" + var74.field4222, class500.field7016, (long) var73.field9062, class300.field3596.field808 != var35.field535.field808, arg0 ^ 0xFFFFB376, var39, 1012, var38, class637.field8697.method3584(class770.field10592, true), true);
                                class480.field6715++;
                                var72++;
                            }
                        }
                    }
                    if (var35.field535 instanceof class238) {
                        class238 var80 = (class238) var35.field535;
                        class174 var81 = class379.field4811.method4192(27324, var80.method927(arg0 ^ 0x1352));
                        if (var81.field2157 != null) {
                            var81 = var81.method1178(false, class2.field30);
                        }
                        if (var81 != null) {
                            if (class104.field1336 && class300.field3596.field808 == var35.field535.field808) {
                                class613 var82 = class348.field4348 == -1 ? null : class113.field1426.method4366(true, class348.field4348);
                                if ((class667.field9161 & 0x4) != 0 && (var82 == null || var81.method1187(67783, class348.field4348, var82.field8244) != var82.field8244)) {
                                    class526.field7425++;
                                    class620.method3534((long) var80.hashCode(), -1, false, class481.field6718 + " -> <col=00ffff>" + var81.field2133, class748.field10390, class196.method1286(var38, var39, arg0 ^ 0xFFFFD6B3, var80), false, 120, var39, 51, var38, class535.field7539, true);
                                }
                            }
                            if (class300.field3596.field808 == var35.field535.field808) {
                                String[] var83 = var81.field2136;
                                if (var83 != null) {
                                    for (int var84 = 4; var84 >= 0; var84--) {
                                        if (var83[var84] != null) {
                                            short var85 = 0;
                                            int var86 = class170.field2043;
                                            if (var84 == 0) {
                                                var85 = 9;
                                            }
                                            if (var84 == 1) {
                                                var85 = 19;
                                            }
                                            if (var84 == 2) {
                                                var85 = 3;
                                            }
                                            if (var84 == 3) {
                                                var85 = 2;
                                            }
                                            if (var84 == 4) {
                                                var85 = 1007;
                                            }
                                            if (var81.field2179 == var84) {
                                                var86 = var81.field2126;
                                            }
                                            if (var81.field2106 == var84) {
                                                var86 = var81.field2096;
                                            }
                                            class620.method3534((long) var80.hashCode(), -1, false, "<col=00ffff>" + var81.field2133, var86, class196.method1286(var38, var39, 26047, var80), false, 113, var39, var85, var38, var83[var84], true);
                                            class644.field8780++;
                                        }
                                    }
                                }
                                class620.method3534((long) var80.hashCode(), -1, false, "<col=00ffff>" + var81.field2133, class500.field7016, (long) var81.field2166, class300.field3596.field808 != var35.field535.field808, 112, var39, 1011, var38, class637.field8697.method3584(class770.field10592, true), true);
                                class537.field7565++;
                            }
                        }
                    }
                }
            }
            if (class769.field10572) {
                class774.method4300((byte) 50);
            }
            var29++;
        }
        class435.method2574(false, true);
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(I)V", line = 566)
    public static final void method996(int arg0) {
        field1678++;
        if (class303.field3619 == 0 || class303.field3619 == 10) {
            return;
        }
        try {
            short var1;
            if (class406.field5342 == 0) {
                var1 = 250;
            } else {
                var1 = 2000;
            }
            if (class204.field2446 && class303.field3619 >= 6) {
                var1 = 6000;
            }
            if (arg0 <= 26) {
                field1676 = true;
            }
            if (var1 < (++class14.field227)) {
                if (class436.field5748 != null) {
                    class436.field5748.method768(0);
                    class436.field5748 = null;
                }
                if (class406.field5342 >= 3) {
                    class303.field3619 = 0;
                    class138.method1010(-5, (byte) 50);
                    return;
                }
                if (class268.field3168 == 2) {
                    class55.field743.method2073((byte) 35);
                } else {
                    class144.field1819.method2073((byte) 35);
                }
                class303.field3619 = 1;
                class14.field227 = 0;
                class406.field5342++;
            }
            if (class303.field3619 == 1) {
                if (class268.field3168 == 2) {
                    class709.field9953 = class55.field743.method2071(class521.field7389, false);
                } else {
                    class709.field9953 = class144.field1819.method2071(class521.field7389, false);
                }
                class303.field3619 = 2;
            }
            if (class303.field3619 == 2) {
                if (class709.field9953.field7769 == 2) {
                    throw new IOException();
                }
                if (class709.field9953.field7769 != 1) {
                    return;
                }
                class436.field5748 = class32.method299((byte) 117, (Socket) class709.field9953.field7768, 15000);
                class709.field9953 = null;
                class613.method3469(31897);
                class336 var2 = class495.method2916((byte) 89);
                if (class204.field2446) {
                    var2.field4150.method2353(87, class307.field3796.field6730);
                    var2.field4150.method2369(-18090, 0);
                    int var3 = var2.field4150.field5262;
                    var2.field4150.method2391(7, 648);
                    if (class268.field3168 == 2) {
                        var2.field4150.method2353(96, class289.field3493 == 13 ? 1 : 0);
                    }
                    class403 var4 = class632.method3569((byte) -111);
                    var4.method2353(-95, class48.field648);
                    var4.method2369(-18090, (int) (Math.random() * 9.9999999E7D));
                    var4.method2353(-113, class770.field10592);
                    var4.method2391(-8, class176.field2187);
                    for (int var5 = 0; var5 < 6; var5++) {
                        var4.method2391(-119, (int) (Math.random() * 9.9999999E7D));
                    }
                    var4.method2404(-17, class122.field1564);
                    var4.method2353(88, class672.field9229.field5926);
                    var4.method2353(-106, (int) (Math.random() * 9.9999999E7D));
                    var4.method2409(class419.field5455, (byte) -95, class116.field1479);
                    var2.field4150.method2355(var4.field5275, var4.field5262, (byte) 74, 0);
                    var2.field4150.method2416(-126, var2.field4150.field5262 - var3);
                } else {
                    var2.field4150.method2353(-73, class307.field3785.field6730);
                }
                class578.method3334(4, var2);
                class671.method3765(8277);
                class303.field3619 = 3;
            }
            if (class303.field3619 == 3) {
                if (!class436.field5748.method765((byte) -98, 1)) {
                    return;
                }
                class436.field5748.method766(class583.field7964.field5275, 0, -100, 1);
                int var6 = class583.field7964.field5275[0] & 0xFF;
                if (var6 != 0) {
                    class303.field3619 = 0;
                    class138.method1010(var6, (byte) 50);
                    class436.field5748.method768(0);
                    class436.field5748 = null;
                    class365.method2131((byte) -90);
                    return;
                }
                if (class204.field2446) {
                    class303.field3619 = 4;
                } else {
                    class303.field3619 = 8;
                }
            }
            if (class303.field3619 == 4) {
                if (!class436.field5748.method765((byte) -128, 2)) {
                    return;
                }
                class436.field5748.method766(class583.field7964.field5275, 0, -96, 2);
                class583.field7964.field5262 = 0;
                class583.field7964.field5262 = class583.field7964.method2390((byte) -103);
                class303.field3619 = 5;
            }
            if (class303.field3619 == 5) {
                if (!class436.field5748.method765((byte) 117, class583.field7964.field5262)) {
                    return;
                }
                class436.field5748.method766(class583.field7964.field5275, 0, 105, class583.field7964.field5262);
                class583.field7964.method2360(2008, class632.field8627);
                class583.field7964.field5262 = 0;
                String var7 = class583.field7964.method2375((byte) 65);
                class583.field7964.field5262 = 0;
                String var8 = "opensn";
                if (!class171.field2050 || class627.method3554(true, class521.field7389, var8, 1, var7).field7769 == 2) {
                    class268.method1589(true, class521.field7389, var8, true, var7, class118.field1503.field10665.method1903(0) == 1);
                }
                class303.field3619 = 6;
            }
            if (class303.field3619 == 6) {
                if (!class436.field5748.method765((byte) 74, 1)) {
                    return;
                }
                class436.field5748.method766(class583.field7964.field5275, 0, 125, 1);
                if ((class583.field7964.field5275[0] & 0xFF) == 1) {
                    class303.field3619 = 7;
                }
            }
            if (class303.field3619 == 7) {
                if (!class436.field5748.method765((byte) -52, 16)) {
                    return;
                }
                class436.field5748.method766(class583.field7964.field5275, 0, 96, 16);
                class583.field7964.field5262 = 16;
                class583.field7964.method2360(2008, class632.field8627);
                class583.field7964.field5262 = 0;
                class742.field10333 = class513.field7244 = class486.method2889(true, class583.field7964.method2361(49));
                class616.field8285 = class583.field7964.method2361(46);
                class303.field3619 = 8;
            }
            if (class303.field3619 == 8) {
                class583.field7964.field5262 = 0;
                class613.method3469(31897);
                class336 var9 = class495.method2916((byte) 89);
                class468 var10 = var9.field4150;
                if (class268.field3168 == 2) {
                    class482 var15;
                    if (class204.field2446) {
                        var15 = class307.field3797;
                    } else {
                        var15 = class307.field3787;
                    }
                    var10.method2353(90, var15.field6730);
                    var10.method2369(-18090, 0);
                    int var16 = var10.field5262;
                    int var17 = var10.field5262;
                    if (!class204.field2446) {
                        var10.method2391(-100, 648);
                        var10.method2353(101, class289.field3493 == 13 ? 1 : 0);
                        int var18 = var10.field5262;
                        class403 var19 = class477.method2834(-127);
                        var10.method2355(var19.field5275, var19.field5262, (byte) 74, 0);
                        var17 = var10.field5262;
                        var10.method2388(255, class742.field10333);
                    }
                    var10.method2353(118, class506.field7198);
                    var10.method2353(-95, class397.method2331(3));
                    var10.method2369(-18090, class701.field9880);
                    var10.method2369(-18090, class705.field9921);
                    var10.method2353(-80, class118.field1503.field10648.method2427(0));
                    class678.method3821(var10, 94);
                    var10.method2388(255, class28.field429);
                    var10.method2391(-116, class176.field2187);
                    class403 var20 = class118.field1503.method4294(false);
                    var10.method2353(-58, var20.field5262);
                    var10.method2355(var20.field5275, var20.field5262, (byte) 74, 0);
                    class319.field3945 = true;
                    class403 var21 = new class403(class174.field2151.method715(true));
                    class174.field2151.method716((byte) -85, var21);
                    var10.method2355(var21.field5275, var21.field5275.length, (byte) 74, 0);
                    var10.method2369(-18090, class756.field10477);
                    var10.method2404(-128, class171.field2051);
                    var10.method2353(-97, class372.field4688 == null ? 0 : 1);
                    if (class372.field4688 != null) {
                        var10.method2388(255, class372.field4688);
                    }
                    var10.method2353(98, class641.method3594("jagtheora", -2) ? 1 : 0);
                    var10.method2353(91, class171.field2050 ? 1 : 0);
                    class494.method2914(var10, false);
                    var10.method2385(var17, var10.field5262, class632.field8627, -22080);
                    var10.method2416(-128, var10.field5262 - var16);
                } else {
                    class482 var11;
                    if (class204.field2446) {
                        var11 = class307.field3797;
                    } else {
                        var11 = class307.field3789;
                    }
                    var10.method2353(-93, var11.field6730);
                    var10.method2369(-18090, 0);
                    int var12 = var10.field5262;
                    int var13 = var10.field5262;
                    if (!class204.field2446) {
                        var10.method2391(-104, 648);
                        class403 var14 = class477.method2834(-120);
                        var10.method2355(var14.field5275, var14.field5262, (byte) 74, 0);
                        var13 = var10.field5262;
                        var10.method2388(255, class742.field10333);
                    }
                    var10.method2353(-100, class672.field9229.field5926);
                    var10.method2353(57, class770.field10592);
                    class678.method3821(var10, 106);
                    var10.method2388(255, class28.field429);
                    var10.method2391(54, class176.field2187);
                    class494.method2914(var10, false);
                    var10.method2385(var13, var10.field5262, class632.field8627, -22080);
                    var10.method2416(-122, var10.field5262 - var12);
                }
                class578.method3334(4, var9);
                class671.method3765(8277);
                class591.field8030 = new class87(class632.field8627);
                for (int var22 = 0; var22 < 4; var22++) {
                    class632.field8627[var22] += 50;
                }
                class583.field7964.method2799(-78, class632.field8627);
                class632.field8627 = null;
                class303.field3619 = 9;
            }
            if (class303.field3619 == 9) {
                if (!class436.field5748.method765((byte) 69, 1)) {
                    return;
                }
                class436.field5748.method766(class583.field7964.field5275, 0, 69, 1);
                int var23 = class583.field7964.field5275[0] & 0xFF;
                if (var23 == 21) {
                    class303.field3619 = 12;
                } else if (var23 == 29) {
                    class303.field3619 = 18;
                } else if (var23 == 1) {
                    class303.field3619 = 10;
                    class138.method1010(var23, (byte) 50);
                    return;
                } else if (var23 == 2) {
                    class303.field3619 = 13;
                } else if (var23 == 15) {
                    class303.field3619 = 19;
                    class647.field8807 = -2;
                } else if (var23 == 23 && class406.field5342 < 3) {
                    class303.field3619 = 1;
                    class14.field227 = 0;
                    class406.field5342++;
                    class436.field5748.method768(0);
                    class436.field5748 = null;
                    return;
                } else if (!class588.field8001 || class204.field2446 || class48.field648 == -1 || var23 != 35) {
                    class303.field3619 = 0;
                    class138.method1010(var23, (byte) 50);
                    class436.field5748.method768(0);
                    class436.field5748 = null;
                    class365.method2131((byte) -89);
                    return;
                } else {
                    class14.field227 = 0;
                    class303.field3619 = 1;
                    class204.field2446 = true;
                    class436.field5748.method768(0);
                    class436.field5748 = null;
                    return;
                }
            }
            if (class303.field3619 == 11) {
                class613.method3469(31897);
                class336 var24 = class495.method2916((byte) 89);
                class468 var25 = var24.field4150;
                var25.method2801(class591.field8030, 18760);
                var25.method2810(-122, class307.field3793.field6730);
                class578.method3334(4, var24);
                class671.method3765(8277);
                class303.field3619 = 9;
            } else if (class303.field3619 == 12) {
                if (class436.field5748.method765((byte) -125, 1)) {
                    class436.field5748.method766(class583.field7964.field5275, 0, 87, 1);
                    int var26 = class583.field7964.field5275[0] & 0xFF;
                    class25.field372 = var26 * 50;
                    class303.field3619 = 0;
                    class138.method1010(21, (byte) 50);
                    class436.field5748.method768(0);
                    class436.field5748 = null;
                    class365.method2131((byte) -87);
                }
            } else if (class303.field3619 == 18) {
                if (class436.field5748.method765((byte) 66, 1)) {
                    class436.field5748.method766(class583.field7964.field5275, 0, 105, 1);
                    class303.field3619 = 0;
                    class233.field2779 = class583.field7964.field5275[0] & 0xFF;
                    class138.method1010(29, (byte) 50);
                    class436.field5748.method768(0);
                    class436.field5748 = null;
                    class365.method2131((byte) -87);
                }
            } else if (class303.field3619 != 13) {
                if (class303.field3619 == 14) {
                    class468 var27 = class583.field7964;
                    if (class268.field3168 == 2) {
                        if (!class436.field5748.method765((byte) 85, class783.field10806)) {
                            return;
                        }
                        class436.field5748.method766(var27.field5275, 0, -43, class783.field10806);
                        var27.field5262 = 0;
                        class637.field8741 = var27.method2396((byte) 94);
                        class22.field358 = var27.method2396((byte) -106);
                        class730.field10234 = var27.method2396((byte) 24) == 1;
                        class633.field8636 = var27.method2396((byte) 74) == 1;
                        class222.field2586 = var27.method2396((byte) -78) == 1;
                        class257.field3052 = var27.method2396((byte) 10) == 1;
                        class782.field10790 = var27.method2390((byte) -103);
                        class324.field4018 = var27.method2396((byte) 108) == 1;
                        class41.field578 = var27.method2387(false);
                        class629.field8601 = var27.method2396((byte) -83) == 1;
                        class379.field4811.method4191(class629.field8601, (byte) -86);
                        class121.field1555.method2878(false, class629.field8601);
                        class444.field5956.method1068(class629.field8601, true);
                    } else if (class436.field5748.method765((byte) 118, class783.field10806)) {
                        class436.field5748.method766(var27.field5275, 0, -32, class783.field10806);
                        var27.field5262 = 0;
                        class637.field8741 = var27.method2396((byte) 81);
                        class22.field358 = var27.method2396((byte) -121);
                        class730.field10234 = var27.method2396((byte) 13) == 1;
                        class633.field8636 = var27.method2396((byte) 48) == 1;
                        class222.field2586 = var27.method2396((byte) 18) == 1;
                        class191.field2287 = var27.method2361(111);
                        class613.field8246 = class191.field2287 - (class349.method2069(true) + var27.method2363((byte) 7));
                        int var28 = var27.method2396((byte) -107);
                        class324.field4018 = (var28 & 0x1) != 0;
                        class299.field3579 = (var28 & 0x2) != 0;
                        class608.field8177 = var27.method2381((byte) 50);
                        class785.field10837 = var27.method2390((byte) 24);
                        class73.field1009 = var27.method2390((byte) -128);
                        class26.field417 = var27.method2390((byte) -103);
                        class314.field3867 = var27.method2381((byte) 88);
                        class500.field6989 = class521.field7389.method3804(115, class314.field3867);
                        class756.field10476 = var27.method2396((byte) 10);
                        class326.field4045 = var27.method2390((byte) -122);
                        class676.field9283 = var27.method2390((byte) -97);
                        class471.field6574 = var27.method2396((byte) 38) == 1;
                        class300.field3596.field7399 = class300.field3596.field7395 = class588.field8007 = var27.method2375((byte) -116);
                        class89.field1193 = var27.method2396((byte) 53);
                        class17.field328 = var27.method2381((byte) 24);
                        class200.field2406 = var27.method2396((byte) 18) == 1;
                        class481.field6724 = new class350();
                        class481.field6724.field4365 = var27.method2390((byte) -2);
                        if (class481.field6724.field4365 == 65535) {
                            class481.field6724.field4365 = -1;
                        }
                        class481.field6724.field4362 = var27.method2375((byte) 38);
                        if (class737.field10285 != class446.field6003) {
                            class481.field6724.field4361 = class481.field6724.field4365 + 40000;
                            class481.field6724.field4360 = class481.field6724.field4365 + 50000;
                        }
                        if (class737.field10285 != class616.field8277 && (class737.field10285 != class553.field7698 || class637.field8741 < 2) && (class55.field743.method2074(107381432, class436.field5746) || class55.field743.method2074(107381432, class139.field1734))) {
                            class546.method3215(116);
                        }
                    } else {
                        return;
                    }
                    if ((!class730.field10234 || class222.field2586) && !class324.field4018) {
                        try {
                            class745.method4171("unzap", class345.field4331, (byte) 21);
                        } catch (Throwable var34) {
                        }
                    } else {
                        try {
                            class745.method4171("zap", class345.field4331, (byte) 105);
                        } catch (Throwable var35) {
                            if (class716.field10027) {
                                try {
                                    class345.field4331.getAppletContext().showDocument(new URL(class345.field4331.getCodeBase(), "blank.ws"), "tbi");
                                } catch (Exception var33) {
                                }
                            }
                        }
                    }
                    if (class737.field10285 == class446.field6003) {
                        try {
                            class745.method4171("loggedin", class345.field4331, (byte) 88);
                        } catch (Throwable var32) {
                        }
                    }
                    if (class268.field3168 != 2) {
                        class303.field3619 = 0;
                        class138.method1010(2, (byte) 50);
                        class645.method3607(true);
                        class48.method454(7, -1);
                        class320.field3967 = null;
                        return;
                    }
                    class303.field3619 = 16;
                }
                if (class303.field3619 == 16) {
                    if (!class436.field5748.method765((byte) 102, 3)) {
                        return;
                    }
                    class436.field5748.method766(class583.field7964.field5275, 0, -45, 3);
                    class303.field3619 = 17;
                }
                if (class303.field3619 == 17) {
                    class468 var29 = class583.field7964;
                    var29.field5262 = 0;
                    if (var29.method2804(8)) {
                        if (!class436.field5748.method765((byte) 63, 1)) {
                            return;
                        }
                        class436.field5748.method766(var29.field5275, 3, -122, 1);
                    }
                    class320.field3967 = class358.method2095((byte) 87)[var29.method2807((byte) -101)];
                    class647.field8807 = var29.method2390((byte) -114);
                    class303.field3619 = 15;
                }
                if (class303.field3619 == 15) {
                    if (class436.field5748.method765((byte) -67, class647.field8807)) {
                        class436.field5748.method766(class583.field7964.field5275, 0, -44, class647.field8807);
                        class583.field7964.field5262 = 0;
                        class303.field3619 = 0;
                        int var30 = class647.field8807;
                        class138.method1010(2, (byte) 50);
                        class190.method1247(0);
                        class783.method4335(class583.field7964, (byte) -102);
                        class226.field2638 = -1;
                        if (class471.field6563 == class320.field3967) {
                            class231.method1420(-18);
                        } else {
                            class90.method816(true);
                        }
                        if (class583.field7964.field5262 != var30) {
                            throw new RuntimeException("lswp pos:" + class583.field7964.field5262 + " psize:" + var30);
                        }
                        class320.field3967 = null;
                    }
                } else if (class303.field3619 == 19) {
                    if (class647.field8807 == -2) {
                        if (!class436.field5748.method765((byte) -43, 2)) {
                            return;
                        }
                        class436.field5748.method766(class583.field7964.field5275, 0, 80, 2);
                        class583.field7964.field5262 = 0;
                        class647.field8807 = class583.field7964.method2390((byte) -112);
                    }
                    if (class436.field5748.method765((byte) -66, class647.field8807)) {
                        class436.field5748.method766(class583.field7964.field5275, 0, -89, class647.field8807);
                        class583.field7964.field5262 = 0;
                        int var31 = class647.field8807;
                        class303.field3619 = 0;
                        class138.method1010(15, (byte) 50);
                        class352.method2077((byte) 113);
                        class783.method4335(class583.field7964, (byte) -94);
                        if (class583.field7964.field5262 != var31) {
                            throw new RuntimeException("lswpr pos:" + class583.field7964.field5262 + " psize:" + var31);
                        }
                        class320.field3967 = null;
                    }
                }
            } else if (class436.field5748.method765((byte) -60, 1)) {
                class436.field5748.method766(class583.field7964.field5275, 0, 120, 1);
                class783.field10806 = class583.field7964.field5275[0] & 0xFF;
                class303.field3619 = 14;
            }
        } catch (IOException var36) {
            if (class436.field5748 != null) {
                class436.field5748.method768(0);
                class436.field5748 = null;
            }
            if (class406.field5342 < 3) {
                if (class268.field3168 == 2) {
                    class55.field743.method2073((byte) 35);
                } else {
                    class144.field1819.method2073((byte) 35);
                }
                class14.field227 = 0;
                class406.field5342++;
                class303.field3619 = 1;
            } else {
                class303.field3619 = 0;
                class138.method1010(-4, (byte) 50);
                class365.method2131((byte) -119);
            }
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lha;IIILtba;I)V", line = 1300)
    public static final void method997(class66 arg0, int arg1, int arg2, int arg3, class174 arg4, int arg5) {
        field1677++;
        class752 var6 = class495.field6886.method1705(27058, arg4.field2120);
        if (var6.field10432 == -1) {
            return;
        }
        int var8;
        if (arg4.field2111) {
            int var7 = arg4.field2164 + arg2;
            var8 = var7 & 0x3;
        } else {
            var8 = 0;
        }
        if (arg3 != -29786) {
            field1676 = true;
        }
        class312 var9 = var6.method4204(arg0, arg4.field2123, var8, 0);
        if (var9 == null) {
            return;
        }
        int var10 = arg4.field2125;
        int var11 = arg4.field2147;
        if ((var8 & 0x1) == 1) {
            var11 = arg4.field2125;
            var10 = arg4.field2147;
        }
        int var12 = var9.method1634();
        int var13 = var9.method1636();
        if (var6.field10433) {
            var12 = var10 * 4;
            var13 = var11 * 4;
        }
        if (var6.field10436 == 0) {
            var9.method1837(arg1, arg5 - (var11 * 4 - 4), var12, var13);
        } else {
            var9.method1843(arg1, arg5 - ((var11 - 1) * 4), var12, var13, 0, var6.field10436 | 0xFF000000, 1);
        }
    }

    @OriginalMember(owner = "client!ej", name = "<init>", descriptor = "(IIIIIIIIIZZI)V", line = 1354)
    public class134(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        this.field1681 = arg0;
        this.field1680 = arg11;
        this.field1685 = (short) arg5;
        this.field1679 = (short) arg6;
        this.field1684 = (byte) arg8;
        this.field1682 = arg2;
        this.field1687 = arg1;
        this.field1688 = arg10;
        this.field1683 = arg3;
        this.field1686 = (short) arg4;
    }
}
