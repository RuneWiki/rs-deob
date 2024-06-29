import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class209 {

    @OriginalMember(owner = "client!hi", name = "i", descriptor = "Leb;")
    public static class230 field3656 = class68.method589(0, "Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q");

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "Lv;")
    public static class147 field3651 = new class147(200);

    @OriginalMember(owner = "client!hi", name = "l", descriptor = "[I")
    public static int[] field3659 = new int[256];

    @OriginalMember(owner = "client!hi", name = "k", descriptor = "Leb;")
    public static class230 field3658 = class68.method589(0, "<col=ffffff>");

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "I")
    public static int field3648;

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "I")
    public static int field3649;

    @OriginalMember(owner = "client!hi", name = "e", descriptor = "I")
    public static int field3652;

    @OriginalMember(owner = "client!hi", name = "f", descriptor = "I")
    public static int field3653;

    @OriginalMember(owner = "client!hi", name = "g", descriptor = "I")
    public static int field3654;

    @OriginalMember(owner = "client!hi", name = "j", descriptor = "I")
    public static int field3657;

    @OriginalMember(owner = "client!hi", name = "h", descriptor = "[I")
    public static int[] field3655;

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "[[[B")
    public static byte[][][] field3650;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(III)I")
    public static final int method1453(int arg0, int arg1, int arg2) {
        field3654++;
        if (arg2 > -4) {
            return 109;
        } else {
            int var3 = arg0 - 1 & arg1 >> 31;
            return (arg1 + (arg1 >>> 31)) % arg0 + var3;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(II)Leb;")
    public static final class230 method1454(int arg0, int arg1) {
        field3657++;
        if (arg1 != 14879) {
            field3658 = null;
        }
        class230 var2 = class37.method340(arg0, (byte) -26);
        for (int var3 = var2.method1635(-95) - 3; var3 > 0; var3 -= 3) {
            var2 = class173.method1267((byte) 59, new class230[] { var2.method1597(arg1 - 14879, 0, var3), class47.field838, var2.method1619(arg1 ^ 0xFFFFC5FD, var3) });
        }
        if (var2.method1635(-49) > 9) {
            return class173.method1267((byte) 59, new class230[] { client.field2723, var2.method1597(arg1 ^ 0x3A1F, 0, var2.method1635(-43) - 8), class55.field986, class114.field2036, var2, class204.field3598 });
        } else if (var2.method1635(arg1 - 14962) > 6) {
            return class173.method1267((byte) 59, new class230[] { class98.field1813, var2.method1597(0, 0, var2.method1635(arg1 - 14935) - 4), class252.field4508, class114.field2036, var2, class204.field3598 });
        } else {
            return class173.method1267((byte) 59, new class230[] { class248.field4398, var2, class36.field674 });
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(ILka;BII)V")
    public static final void method1455(int arg0, class245 arg1, byte arg2, int arg3, int arg4) {
        class154.method1175(95);
        class87.method698(arg4, arg3, arg1.field4325 + arg4, arg3 - -arg1.field4307);
        if (arg2 >= -31) {
            method1455(-14, (class245) null, (byte) -54, -96, 89);
        }
        field3649++;
        if (class34.field639 == 2 || class34.field639 == 5 || class157.field2802 == null) {
            class87.method714(arg4, arg3, 0, arg1.field4314, arg1.field4241);
        } else {
            int var5 = class56.field1033.field2274 / 32 + 48;
            int var6 = class34.field641 + class167.field2953 & 0x7FF;
            int var7 = 464 - class56.field1033.field2300 / 32;
            ((class10) class157.field2802).method107(arg4, arg3, arg1.field4325, arg1.field4307, var5, var7, var6, class163.field2911 + 256, arg1.field4314, arg1.field4241);
            if (class236.field4087 != null) {
                for (int var8 = 0; var8 < class236.field4087.field2775; var8++) {
                    if (class236.field4087.method1187(var8, (byte) 116)) {
                        int var9 = (class236.field4087.field2782[var8] - class272.field4795) * 4 + 2 - (class56.field1033.field2274 / 32);
                        int var10 = class3.field21[var6];
                        int var11 = var10 * 256 / (class163.field2911 + 256);
                        int var12 = (class236.field4087.field2780[var8] - class155.field2759) * 4 + 2 - (class56.field1033.field2300 / 32);
                        int var13 = class3.field24[var6];
                        int var14 = var13 * 256 / (class163.field2911 + 256);
                        int var15 = var9 * var14 + var11 * var12 >> 16;
                        class93 var16 = class104.field1904;
                        if (class236.field4087.method1186(var8, (byte) -42) == 1) {
                            var16 = class180.field3151;
                        }
                        if (class236.field4087.method1186(var8, (byte) -42) == 2) {
                            var16 = class76.field1382;
                        }
                        int var17 = var12 * var14 - (var9 * var11) >> 16;
                        int var18 = var16.method803(class236.field4087.field2777[var8], 100);
                        int var19 = var15 - var18 / 2;
                        if (-arg1.field4325 <= var19 && var19 <= arg1.field4325 && var17 >= (-arg1.field4307) && arg1.field4307 >= var17) {
                            int var20 = 16777215;
                            if (class236.field4087.field2776[var8] != -1) {
                                var20 = class236.field4087.field2776[var8];
                            }
                            class87.method708(arg1.field4314, arg1.field4241);
                            var16.method805(class236.field4087.field2777[var8], arg1.field4325 / 2 + arg4 + var19, arg3 - -(arg1.field4307 / 2) + -var17, var18, 50, var20, 0, 256, 1, 0, 0);
                            class87.method706();
                        }
                    }
                }
            }
            for (int var21 = 0; var21 < class139.field2487; var21++) {
                int var56 = class183.field3212[var21] * 4 + 2 - class56.field1033.field2274 / 32;
                int var57 = class60.field1140[var21] * 4 + 2 - class56.field1033.field2300 / 32;
                class194 var58 = class251.method1776(class33.field617[var21], 65280);
                if (var58.field3437 != null) {
                    var58 = var58.method1385((byte) 39);
                    if (var58 == null || var58.field3447 == -1) {
                        continue;
                    }
                }
                class147.method1120(var57, class85.field1508[var58.field3447], var56, arg1, arg3, arg4, (byte) 102);
            }
            for (int var22 = 0; var22 < 104; var22++) {
                for (int var52 = 0; var52 < 104; var52++) {
                    class98 var53 = class237.field4090[class124.field2174][var22][var52];
                    if (var53 != null) {
                        int var54 = var22 * 4 + 2 - class56.field1033.field2274 / 32;
                        int var55 = var52 * 4 + 2 - class56.field1033.field2300 / 32;
                        class147.method1120(var55, class109.field1959[0], var54, arg1, arg3, arg4, (byte) 114);
                    }
                }
            }
            for (int var23 = 0; var23 < class18.field393; var23++) {
                class109 var48 = class168.field2963[class167.field2956[var23]];
                if (var48 != null && var48.method890(2)) {
                    class97 var49 = var48.field1956;
                    if (var49 != null && var49.field1787 != null) {
                        var49 = var49.method825((byte) -82);
                    }
                    if (var49 != null && var49.field1797 && var49.field1741) {
                        int var50 = var48.field2300 / 32 - (class56.field1033.field2300 / 32);
                        int var51 = var48.field2274 / 32 - class56.field1033.field2274 / 32;
                        class147.method1120(var50, class109.field1959[1], var51, arg1, arg3, arg4, (byte) 127);
                    }
                }
            }
            for (int var24 = 0; var24 < class169.field2984; var24++) {
                class260 var38 = class230.field4011[class233.field4042[var24]];
                if (var38 != null && var38.method890(2)) {
                    int var39 = var38.field2274 / 32 - (class56.field1033.field2274 / 32);
                    int var40 = var38.field2300 / 32 - (class56.field1033.field2300 / 32);
                    long var41 = var38.field4620.method1587(64);
                    boolean var43 = false;
                    for (int var44 = 0; var44 < class273.field4805; var44++) {
                        if (class140.field2508[var44] == var41 && class268.field4750[var44] != 0) {
                            var43 = true;
                            break;
                        }
                    }
                    boolean var45 = false;
                    for (int var46 = 0; var46 < class124.field2170; var46++) {
                        if (class182.field3175[var46].field1166 == var41) {
                            var45 = true;
                            break;
                        }
                    }
                    boolean var47 = false;
                    if (class56.field1033.field4603 != 0 && var38.field4603 != 0 && class56.field1033.field4603 == var38.field4603) {
                        var47 = true;
                    }
                    if (var43) {
                        class147.method1120(var40, class109.field1959[3], var39, arg1, arg3, arg4, (byte) 97);
                    } else if (var45) {
                        class147.method1120(var40, class109.field1959[5], var39, arg1, arg3, arg4, (byte) 125);
                    } else if (var47) {
                        class147.method1120(var40, class109.field1959[4], var39, arg1, arg3, arg4, (byte) 97);
                    } else {
                        class147.method1120(var40, class109.field1959[2], var39, arg1, arg3, arg4, (byte) 119);
                    }
                }
            }
            class177[] var25 = class45.field793;
            for (int var26 = 0; var26 < var25.length; var26++) {
                class177 var29 = var25[var26];
                if (var29 != null && var29.field3107 != 0 && (class259.field4584 % 20) < 10) {
                    if (var29.field3107 == 1 && var29.field3110 >= 0 && var29.field3110 < class168.field2963.length) {
                        class109 var30 = class168.field2963[var29.field3110];
                        if (var30 != null) {
                            int var31 = var30.field2274 / 32 - (class56.field1033.field2274 / 32);
                            int var32 = var30.field2300 / 32 - class56.field1033.field2300 / 32;
                            class223.method1531(var31, var29.field3108, var32, arg4, arg1, arg3, 112);
                        }
                    }
                    if (var29.field3107 == 2) {
                        int var33 = (var29.field3118 - class155.field2759) * 4 + 2 - (class56.field1033.field2300 / 32);
                        int var34 = (var29.field3109 - class272.field4795) * 4 + 2 - (class56.field1033.field2274 / 32);
                        class223.method1531(var34, var29.field3108, var33, arg4, arg1, arg3, -40);
                    }
                    if (var29.field3107 == 10 && var29.field3110 >= 0 && class230.field4011.length > var29.field3110) {
                        class260 var35 = class230.field4011[var29.field3110];
                        if (var35 != null) {
                            int var36 = var35.field2300 / 32 - class56.field1033.field2300 / 32;
                            int var37 = var35.field2274 / 32 - class56.field1033.field2274 / 32;
                            class223.method1531(var37, var29.field3108, var36, arg4, arg1, arg3, -76);
                        }
                    }
                }
            }
            if (class227.field3918 != 0) {
                int var27 = class227.field3918 * 4 + 2 - class56.field1033.field2274 / 32;
                int var28 = class16.field372 * 4 + 2 - (class56.field1033.field2300 / 32);
                class147.method1120(var28, class45.field800, var27, arg1, arg3, arg4, (byte) 108);
            }
            class87.method705(arg1.field4325 / 2 + arg4 - 1, arg1.field4307 / 2 + arg3 + -1, 3, 3, 16777215);
        }
        class125.field2198[arg0] = true;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IB)I")
    public static final int method1456(int arg0, byte arg1) {
        field3653++;
        int var2 = (arg0 * arg0 >> 12) * arg0 >> 12;
        if (arg1 != 111) {
            field3650 = null;
        }
        int var3 = arg0 * 6 - 61440;
        int var4 = (arg0 * var3 >> 12) + 40960;
        return var2 * var4 >> 12;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)V")
    public static void method1457(int arg0) {
        field3656 = null;
        field3655 = null;
        field3650 = null;
        field3651 = null;
        field3659 = null;
        field3658 = null;
        if (arg0 <= 27) {
            field3655 = null;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lkk;IIZ)[Lmf;")
    public static final class10[] method1458(class223 arg0, int arg1, int arg2, boolean arg3) {
        if (!arg3) {
            field3656 = null;
        }
        field3652++;
        return class205.method1440(arg1, arg2, 2, arg0) ? class57.method484(arg3) : null;
    }
}
