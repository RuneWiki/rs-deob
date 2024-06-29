import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class160 {

    @OriginalMember(owner = "client!l", name = "s", descriptor = "J")
    public long field2805 = 0L;

    @OriginalMember(owner = "client!l", name = "c", descriptor = "I")
    public static int field2789 = 0;

    @OriginalMember(owner = "client!l", name = "l", descriptor = "I")
    public static int field2798 = 2;

    @OriginalMember(owner = "client!l", name = "t", descriptor = "I")
    public static int field2806 = 0;

    @OriginalMember(owner = "client!l", name = "n", descriptor = "Lp;")
    public static class280 field2800 = class18.method140((byte) -120, "");

    @OriginalMember(owner = "client!l", name = "m", descriptor = "I")
    public static int field2799 = -1;

    @OriginalMember(owner = "client!l", name = "h", descriptor = "I")
    public static int field2794 = 0;

    @OriginalMember(owner = "client!l", name = "x", descriptor = "Z")
    public static boolean field2810 = true;

    @OriginalMember(owner = "client!l", name = "v", descriptor = "F")
    public static float field2808;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "I")
    public static int field2787;

    @OriginalMember(owner = "client!l", name = "b", descriptor = "I")
    public int field2788;

    @OriginalMember(owner = "client!l", name = "d", descriptor = "I")
    public int field2790;

    @OriginalMember(owner = "client!l", name = "e", descriptor = "I")
    public static int field2791;

    @OriginalMember(owner = "client!l", name = "f", descriptor = "I")
    public int field2792;

    @OriginalMember(owner = "client!l", name = "g", descriptor = "I")
    public int field2793;

    @OriginalMember(owner = "client!l", name = "i", descriptor = "I")
    public static int field2795;

    @OriginalMember(owner = "client!l", name = "j", descriptor = "I")
    public int field2796;

    @OriginalMember(owner = "client!l", name = "k", descriptor = "I")
    public static int field2797;

    @OriginalMember(owner = "client!l", name = "o", descriptor = "I")
    public static int field2801;

    @OriginalMember(owner = "client!l", name = "p", descriptor = "I")
    public int field2802;

    @OriginalMember(owner = "client!l", name = "q", descriptor = "I")
    public int field2803;

    @OriginalMember(owner = "client!l", name = "r", descriptor = "I")
    public int field2804;

    @OriginalMember(owner = "client!l", name = "u", descriptor = "I")
    public int field2807;

    @OriginalMember(owner = "client!l", name = "w", descriptor = "I")
    public int field2809;

    @OriginalMember(owner = "client!l", name = "z", descriptor = "I")
    public static int field2812;

    @OriginalMember(owner = "client!l", name = "A", descriptor = "I")
    public static int field2813;

    @OriginalMember(owner = "client!l", name = "B", descriptor = "I")
    public int field2814;

    @OriginalMember(owner = "client!l", name = "y", descriptor = "Lrk;")
    public class265 field2811;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I)V")
    public static final void method1137(int arg0) {
        class257.field4543 = arg0;
        for (int var1 = 0; var1 < class57.field928; var1++) {
            for (int var2 = 0; var2 < class86.field1411; var2++) {
                if (class220.field3787[arg0][var1][var2] == null) {
                    class220.field3787[arg0][var1][var2] = new class162(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIBLik;II)Lik;")
    public static final class256 method1138(int arg0, int arg1, int arg2, byte arg3, class256 arg4, int arg5, int arg6) {
        field2797++;
        long var7 = (long) arg1;
        class256 var9 = (class256) class212.field3654.method1480((byte) 50, var7);
        if (var9 == null) {
            class114 var10 = class114.method819(class57.field925, arg1, 0);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method806(64, 768, -50, -10, -50);
            class212.field3654.method1483((byte) -101, var7, var9);
        }
        int var11 = arg4.method1598();
        if (arg3 > -37) {
            return null;
        }
        int var12 = arg4.method1614();
        int var13 = arg4.method1626();
        int var14 = arg4.method1596();
        class256 var15 = var9.method1623(true, true);
        if (arg5 != 0) {
            var15.method1619(arg5);
        }
        class239 var16 = (class239) var15;
        if (class158.method1123(class231.field4013, arg2 + var11, -6230, arg0 + var13) != arg6 || class158.method1123(class231.field4013, arg2 + var12, -6230, arg0 + var14) != arg6) {
            for (int var17 = 0; var17 < var16.field4157; var17++) {
                var16.field4156[var17] += class158.method1123(class231.field4013, var16.field4161[var17] + arg2, -6230, var16.field4144[var17] + arg0) - arg6;
            }
            var16.field4135 = false;
        }
        return var15;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Ltg;I)V")
    public static final void method1139(class180 arg0, int arg1) {
        if (arg1 != 4) {
            field2798 = 47;
        }
        field2801++;
        class83.field1377 = arg0;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIBIII)V")
    public static final void method1140(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        field2791++;
        int var8 = arg3;
        int var9 = 0;
        int var10 = 0;
        int var11 = arg6 - arg5;
        int var12 = arg3 - arg5;
        int var13 = arg6 * arg6;
        int var14 = var11 * var11;
        int var15 = arg3 * arg3;
        int var16 = var12 * var12;
        int var17 = var15 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var14 << 1;
        int var21 = arg3 << 1;
        int var22 = var15 - ((var21 - 1) * var18);
        int var23 = (1 - var21) * var13 + var17;
        int var24 = var12 << 1;
        int var25 = var16 - ((var24 - 1) * var20);
        int var26 = var14 << 2;
        int var27 = var15 << 2;
        int var28 = var16 << 2;
        int var29 = var13 << 2;
        int var30 = (1 - var24) * var14 + var19;
        if (arg4 < 85) {
            method1141((class113) null, -11, -107, (byte) 60, 117);
        }
        int var31 = var17 * 3;
        int var32 = (var21 - 3) * var18;
        int var33 = var19 * 3;
        int var34 = (var24 - 3) * var20;
        int var35 = var27;
        int var36 = (arg3 - 1) * var29;
        int var37 = var28;
        int var38 = (var12 - 1) * var26;
        int[] var39 = class91.field1484[arg1];
        class162.method1151(arg7 - var11, arg2, 99, arg7 - arg6, var39);
        class162.method1151(arg7 + var11, arg0, -93, arg7 - var11, var39);
        class162.method1151(arg7 + arg6, arg2, 120, arg7 + var11, var39);
        while (var8 > 0) {
            if (var23 < 0) {
                while (var23 < 0) {
                    var9++;
                    var22 += var35;
                    var35 += var27;
                    var23 += var31;
                    var31 += var27;
                }
            }
            boolean var40 = var8 <= var12;
            if (var22 < 0) {
                var23 += var31;
                var22 += var35;
                var9++;
                var31 += var27;
                var35 += var27;
            }
            if (var40) {
                if (var30 < 0) {
                    while (var30 < 0) {
                        var30 += var33;
                        var25 += var37;
                        var33 += var28;
                        var37 += var28;
                        var10++;
                    }
                }
                if (var25 < 0) {
                    var10++;
                    var30 += var33;
                    var25 += var37;
                    var33 += var28;
                    var37 += var28;
                }
                var30 += -var38;
                var38 -= var26;
                var25 += -var34;
                var34 -= var26;
            }
            var8--;
            int var41 = arg1 - var8;
            var23 += -var36;
            int var42 = arg1 + var8;
            var36 -= var29;
            int var43 = arg7 + var9;
            var22 += -var32;
            var32 -= var29;
            int var44 = arg7 - var9;
            if (var40) {
                int var45 = arg7 + var10;
                int var46 = arg7 - var10;
                class162.method1151(var46, arg2, -48, var44, class91.field1484[var41]);
                class162.method1151(var45, arg0, -23, var46, class91.field1484[var41]);
                class162.method1151(var43, arg2, 115, var45, class91.field1484[var41]);
                class162.method1151(var46, arg2, 9, var44, class91.field1484[var42]);
                class162.method1151(var45, arg0, 116, var46, class91.field1484[var42]);
                class162.method1151(var43, arg2, 119, var45, class91.field1484[var42]);
            } else {
                class162.method1151(var43, arg2, -107, var44, class91.field1484[var41]);
                class162.method1151(var43, arg2, 114, var44, class91.field1484[var42]);
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lua;IIBI)V")
    public static final void method1141(class113 arg0, int arg1, int arg2, byte arg3, int arg4) {
        class128.method884(arg3 ^ 0xFFFFB3D8);
        class151.method1061(arg4, arg1, arg0.field1869 + arg4, arg1 - -arg0.field1995);
        if (class205.field3563 == 2 || class205.field3563 == 5 || class46.field755 == null) {
            class151.method1065(arg4, arg1, 0, arg0.field1999, arg0.field2011);
        } else {
            int var5 = class262.field4631.field4791 / 32 + 48;
            int var6 = class25.field487 + class273.field4756 & 0x7FF;
            int var7 = 464 - (class262.field4631.field4793 / 32);
            ((class223) class46.field755).method1294(arg4, arg1, arg0.field1869, arg0.field1995, var5, var7, var6, class142.field2461 + 256, arg0.field1999, arg0.field2011);
            if (class176.field3070 != null) {
                for (int var8 = 0; var8 < class176.field3070.field3241; var8++) {
                    if (class176.field3070.method1284(var8, 96)) {
                        int var9 = (class176.field3070.field3237[var8] - class49.field806) * 4 + 2 - (class262.field4631.field4791 / 32);
                        int var10 = (class176.field3070.field3247[var8] - class91.field1480) * 4 + 2 - (class262.field4631.field4793 / 32);
                        int var11 = class146.field2541[var6];
                        int var12 = var11 * 256 / (class142.field2461 + 256);
                        int var13 = class146.field2545[var6];
                        int var14 = var13 * 256 / (class142.field2461 + 256);
                        int var15 = var9 * var12 + var10 * var14 >> 16;
                        int var16 = var10 * var12 - (var9 * var14) >> 16;
                        class72 var17 = class181.field3161;
                        if (class176.field3070.method1275(118, var8) == 1) {
                            var17 = class101.field1651;
                        }
                        if (class176.field3070.method1275(122, var8) == 2) {
                            var17 = class54.field890;
                        }
                        int var18 = var17.method511(class176.field3070.field3238[var8], 100);
                        int var19 = var15 - var18 / 2;
                        if (-arg0.field1869 <= var19 && arg0.field1869 >= var19 && -arg0.field1995 <= var16 && var16 <= arg0.field1995) {
                            int var20 = 16777215;
                            if (class176.field3070.field3249[var8] != -1) {
                                var20 = class176.field3070.field3249[var8];
                            }
                            class151.method1066(arg0.field1999, arg0.field2011);
                            var17.method523(class176.field3070.field3238[var8], arg4 + var19 + (arg0.field1869 / 2), arg0.field1995 / 2 + arg1 + -var16, var18, 50, var20, 0, 256, 1, 0, 0);
                            class151.method1056();
                        }
                    }
                }
            }
            for (int var21 = 0; var21 < class191.field3349; var21++) {
                int var56 = class250.field4384[var21] * 4 + 2 - (class262.field4631.field4793 / 32);
                int var57 = class264.field4664[var21] * 4 + 2 - (class262.field4631.field4791 / 32);
                class130 var58 = class32.method277((byte) -95, class280.field4901[var21]);
                if (var58.field2269 != null) {
                    var58 = var58.method891(0);
                    if (var58 == null || var58.field2266 == -1) {
                        continue;
                    }
                }
                class48.method358(arg0, class2.field81[var58.field2266], arg4, var57, arg1, (byte) 33, var56);
            }
            for (int var22 = 0; var22 < 104; var22++) {
                for (int var52 = 0; var52 < 104; var52++) {
                    class90 var53 = class165.field2896[class231.field4013][var22][var52];
                    if (var53 != null) {
                        int var54 = var22 * 4 + 2 - (class262.field4631.field4791 / 32);
                        int var55 = var52 * 4 + 2 - (class262.field4631.field4793 / 32);
                        class48.method358(arg0, class269.field4708[0], arg4, var54, arg1, (byte) 33, var55);
                    }
                }
            }
            for (int var23 = 0; var23 < class112.field1845; var23++) {
                class61 var48 = class46.field756[class46.field767[var23]];
                if (var48 != null && var48.method428(700)) {
                    class255 var49 = var48.field987;
                    if (var49 != null && var49.field4516 != null) {
                        var49 = var49.method1717(false);
                    }
                    if (var49 != null && var49.field4469 && var49.field4466) {
                        int var50 = var48.field4791 / 32 - (class262.field4631.field4791 / 32);
                        int var51 = var48.field4793 / 32 - (class262.field4631.field4793 / 32);
                        if (var49.field4506 == -1) {
                            class48.method358(arg0, class269.field4708[1], arg4, var50, arg1, (byte) 33, var51);
                        } else {
                            class48.method358(arg0, class2.field81[var49.field4506], arg4, var50, arg1, (byte) 33, var51);
                        }
                    }
                }
            }
            for (int var24 = 0; var24 < class205.field3554; var24++) {
                class142 var38 = class280.field4940[class250.field4376[var24]];
                if (var38 != null && var38.method428(arg3 ^ 0x2C4)) {
                    int var39 = var38.field4791 / 32 - (class262.field4631.field4791 / 32);
                    int var40 = var38.field4793 / 32 - (class262.field4631.field4793 / 32);
                    boolean var41 = false;
                    long var42 = var38.field2458.method1896(arg3 - 15);
                    for (int var44 = 0; var44 < class208.field3590; var44++) {
                        if (class49.field794[var44] == var42 && class50.field826[var44] != 0) {
                            var41 = true;
                            break;
                        }
                    }
                    boolean var45 = false;
                    for (int var46 = 0; var46 < class215.field3716; var46++) {
                        if (class59.field950[var46].field2827 == var42) {
                            var45 = true;
                            break;
                        }
                    }
                    boolean var47 = false;
                    if (class262.field4631.field2496 != 0 && var38.field2496 != 0 && class262.field4631.field2496 == var38.field2496) {
                        var47 = true;
                    }
                    if (var41) {
                        class48.method358(arg0, class269.field4708[3], arg4, var39, arg1, (byte) 33, var40);
                    } else if (var45) {
                        class48.method358(arg0, class269.field4708[5], arg4, var39, arg1, (byte) 33, var40);
                    } else if (var47) {
                        class48.method358(arg0, class269.field4708[4], arg4, var39, arg1, (byte) 33, var40);
                    } else {
                        class48.method358(arg0, class269.field4708[2], arg4, var39, arg1, (byte) 33, var40);
                    }
                }
            }
            class249[] var25 = class81.field1335;
            for (int var26 = 0; var26 < var25.length; var26++) {
                class249 var29 = var25[var26];
                if (var29 != null && var29.field4366 != 0 && class117.field2104 % 20 < 10) {
                    if (var29.field4366 == 1 && var29.field4359 >= 0 && class46.field756.length > var29.field4359) {
                        class61 var30 = class46.field756[var29.field4359];
                        if (var30 != null) {
                            int var31 = var30.field4791 / 32 - (class262.field4631.field4791 / 32);
                            int var32 = var30.field4793 / 32 - (class262.field4631.field4793 / 32);
                            class168.method1168(arg4, arg1, var31, var29.field4368, true, var32, arg0);
                        }
                    }
                    if (var29.field4366 == 2) {
                        int var33 = (var29.field4361 - class91.field1480) * 4 + 2 - (class262.field4631.field4793 / 32);
                        int var34 = (var29.field4374 - class49.field806) * 4 + 2 - class262.field4631.field4791 / 32;
                        class168.method1168(arg4, arg1, var34, var29.field4368, true, var33, arg0);
                    }
                    if (var29.field4366 == 10 && var29.field4359 >= 0 && var29.field4359 < class280.field4940.length) {
                        class142 var35 = class280.field4940[var29.field4359];
                        if (var35 != null) {
                            int var36 = var35.field4791 / 32 - (class262.field4631.field4791 / 32);
                            int var37 = var35.field4793 / 32 - (class262.field4631.field4793 / 32);
                            class168.method1168(arg4, arg1, var36, var29.field4368, true, var37, arg0);
                        }
                    }
                }
            }
            if (class209.field3599 != 0) {
                int var27 = class73.field1204 * 4 + 2 - (class262.field4631.field4793 / 32);
                int var28 = class209.field3599 * 4 + 2 - class262.field4631.field4791 / 32;
                class48.method358(arg0, class210.field3614, arg4, var28, arg1, (byte) 33, var27);
            }
            class151.method1057(arg4 + (arg0.field1869 / 2) - 1, arg1 - -(arg0.field1995 / 2) - 1, 3, 3, 16777215);
        }
        class120.field2130[arg2] = true;
        field2812++;
        if (arg3 != 120) {
            field2800 = null;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(II)V")
    public static final void method1142(int arg0, int arg1) {
        field2795++;
        class157 var2 = class257.method1740(arg0, (byte) -107, 9);
        if (arg1 != 2) {
            method1142(124, 125);
        }
        var2.method1121(24223);
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(II)I")
    public static int method1143(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(I)V")
    public static void method1144(int arg0) {
        int var1 = 7 % (-arg0 / 46);
        field2800 = null;
    }
}
