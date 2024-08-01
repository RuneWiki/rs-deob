import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("of")
public class class136 extends class71 {

    @OriginalMember(owner = "of", name = "r", descriptor = "I")
    public static int field2628 = 0;

    @OriginalMember(owner = "of", name = "A", descriptor = "Llf;")
    private static class109 field2637 = class35.method275("Loading title screen )2 ", 2);

    @OriginalMember(owner = "of", name = "C", descriptor = "Llf;")
    private static class109 field2639 = class35.method275("Please subscribe)1 or use a different world)3", 2);

    @OriginalMember(owner = "of", name = "D", descriptor = "Llf;")
    public static class109 field2640 = field2639;

    @OriginalMember(owner = "of", name = "q", descriptor = "Llf;")
    public static class109 field2627 = field2637;

    @OriginalMember(owner = "of", name = "v", descriptor = "Llf;")
    public static class109 field2632 = class35.method275(")4lang)4de", 2);

    @OriginalMember(owner = "of", name = "x", descriptor = "B")
    public static byte field2634;

    @OriginalMember(owner = "of", name = "p", descriptor = "I")
    public int field2626;

    @OriginalMember(owner = "of", name = "s", descriptor = "I")
    public static int field2629;

    @OriginalMember(owner = "of", name = "t", descriptor = "I")
    public static int field2630;

    @OriginalMember(owner = "of", name = "u", descriptor = "I")
    public static int field2631;

    @OriginalMember(owner = "of", name = "B", descriptor = "I")
    public static int field2638;

    @OriginalMember(owner = "of", name = "F", descriptor = "I")
    public static int field2642;

    @OriginalMember(owner = "of", name = "E", descriptor = "Lkf;")
    public static class100 field2641;

    @OriginalMember(owner = "of", name = "o", descriptor = "Loh;")
    public static class138 field2625;

    @OriginalMember(owner = "of", name = "z", descriptor = "Loh;")
    public class138 field2636;

    @OriginalMember(owner = "of", name = "n", descriptor = "Lwb;")
    public class204 field2624;

    @OriginalMember(owner = "of", name = "y", descriptor = "[B")
    public byte[] field2635;

    @OriginalMember(owner = "of", name = "w", descriptor = "[[Z")
    public static boolean[][] field2633;

    @OriginalMember(owner = "of", name = "a", descriptor = "(I)V")
    public static void method978(int arg0) {
        field2639 = null;
        field2633 = null;
        field2625 = null;
        field2632 = null;
        field2637 = null;
        field2640 = null;
        field2641 = null;
        field2627 = null;
        if (arg0 != -30878) {
            field2633 = null;
        }
    }

    @OriginalMember(owner = "of", name = "a", descriptor = "(Lbg;B)V")
    public static final void method979(class18 arg0, byte arg1) {
        if (arg1 <= 3) {
            field2625 = null;
        }
        class67.field1305 = arg0;
        field2642++;
    }

    @OriginalMember(owner = "of", name = "a", descriptor = "(ZLid;I)V")
    public static final void method980(boolean arg0, class82 arg1, int arg2) {
        field2631++;
        Object[] var3 = arg1.field1613;
        int var4 = (Integer) var3[0];
        class194 var5 = class22.method204(true, var4);
        if (var5 == null) {
            return;
        }
        int var6 = 0;
        int[] var7 = var5.field3708;
        int var8 = 0;
        class72.field1403 = 0;
        int[] var9 = var5.field3711;
        byte var10 = -1;
        int var11 = -1;
        try {
            if (!arg0) {
                class143.field2750 = new int[var5.field3712];
                int var12 = 0;
                class197.field3769 = new class109[var5.field3709];
                int var13 = 0;
                for (int var14 = 1; var14 < var3.length; var14++) {
                    if (var3[var14] instanceof Integer) {
                        int var16 = (Integer) var3[var14];
                        if (var16 == -2147483647) {
                            var16 = arg1.field1626;
                        }
                        if (var16 == -2147483646) {
                            var16 = arg1.field1611;
                        }
                        if (var16 == -2147483645) {
                            var16 = arg1.field1608 == null ? -1 : arg1.field1608.field3866;
                        }
                        if (var16 == -2147483644) {
                            var16 = arg1.field1619;
                        }
                        if (var16 == -2147483643) {
                            var16 = arg1.field1608 == null ? -1 : arg1.field1608.field3900;
                        }
                        if (var16 == -2147483642) {
                            var16 = arg1.field1609 == null ? -1 : arg1.field1609.field3866;
                        }
                        if (var16 == -2147483641) {
                            var16 = arg1.field1609 == null ? -1 : arg1.field1609.field3900;
                        }
                        if (var16 == -2147483640) {
                            var16 = arg1.field1629;
                        }
                        if (var16 == -2147483639) {
                            var16 = arg1.field1615;
                        }
                        class143.field2750[var12++] = var16;
                    } else if (var3[var14] instanceof class109) {
                        class109 var15 = (class109) var3[var14];
                        if (var15.method809(class30.field643, -1)) {
                            var15 = arg1.field1628;
                        }
                        class197.field3769[var13++] = var15;
                    }
                }
                int var17 = 0;
                label2239: while (true) {
                    var17++;
                    if (arg2 < var17) {
                        throw new RuntimeException("slow");
                    }
                    var11++;
                    int var316 = var7[var11];
                    if (var316 < 100) {
                        if (var316 == 0) {
                            class103.field2026[var6++] = var9[var11];
                            continue;
                        }
                        if (var316 == 1) {
                            int var18 = var9[var11];
                            class103.field2026[var6++] = class187.field3564[var18];
                            continue;
                        }
                        if (var316 == 2) {
                            int var19 = var9[var11];
                            var6--;
                            class187.field3564[var19] = class103.field2026[var6];
                            continue;
                        }
                        if (var316 == 3) {
                            class13.field206[var8++] = var5.field3702[var11];
                            continue;
                        }
                        if (var316 == 6) {
                            var11 += var9[var11];
                            continue;
                        }
                        if (var316 == 7) {
                            var6 -= 2;
                            if (class103.field2026[var6 + 1] != class103.field2026[var6]) {
                                var11 += var9[var11];
                            }
                            continue;
                        }
                        if (var316 == 8) {
                            var6 -= 2;
                            if (class103.field2026[var6 + 1] == class103.field2026[var6]) {
                                var11 += var9[var11];
                            }
                            continue;
                        }
                        if (var316 == 9) {
                            var6 -= 2;
                            if (class103.field2026[var6 + 1] > class103.field2026[var6]) {
                                var11 += var9[var11];
                            }
                            continue;
                        }
                        if (var316 == 10) {
                            var6 -= 2;
                            if (class103.field2026[var6 + 1] < class103.field2026[var6]) {
                                var11 += var9[var11];
                            }
                            continue;
                        }
                        if (var316 == 21) {
                            if (class72.field1403 == 0) {
                                return;
                            }
                            class47 var20 = class137.field2645[--class72.field1403];
                            var5 = var20.field968;
                            var11 = var20.field977;
                            class197.field3769 = var20.field974;
                            var7 = var5.field3708;
                            class143.field2750 = var20.field971;
                            var9 = var5.field3711;
                            continue;
                        }
                        if (var316 == 25) {
                            int var21 = var9[var11];
                            class103.field2026[var6++] = class115.method849((byte) 115, var21);
                            continue;
                        }
                        if (var316 == 27) {
                            int var22 = var9[var11];
                            var6--;
                            class185.method1252(var22, class103.field2026[var6], (byte) 13);
                            continue;
                        }
                        if (var316 == 31) {
                            var6 -= 2;
                            if (class103.field2026[var6 + 1] >= class103.field2026[var6]) {
                                var11 += var9[var11];
                            }
                            continue;
                        }
                        if (var316 == 32) {
                            var6 -= 2;
                            if (class103.field2026[var6 + 1] <= class103.field2026[var6]) {
                                var11 += var9[var11];
                            }
                            continue;
                        }
                        if (var316 == 33) {
                            class103.field2026[var6++] = class143.field2750[var9[var11]];
                            continue;
                        }
                        int var10001;
                        if (var316 == 34) {
                            var10001 = var9[var11];
                            var6--;
                            class143.field2750[var10001] = class103.field2026[var6];
                            continue;
                        }
                        if (var316 == 35) {
                            class13.field206[var8++] = class197.field3769[var9[var11]];
                            continue;
                        }
                        if (var316 == 36) {
                            var10001 = var9[var11];
                            var8--;
                            class197.field3769[var10001] = class13.field206[var8];
                            continue;
                        }
                        if (var316 == 37) {
                            int var23 = var9[var11];
                            var8 -= var23;
                            class109 var24 = class29.method235(var23, (byte) 53, class13.field206, var8);
                            class13.field206[var8++] = var24;
                            continue;
                        }
                        if (var316 == 38) {
                            var6--;
                            continue;
                        }
                        if (var316 == 39) {
                            var8--;
                            continue;
                        }
                        if (var316 == 40) {
                            int var25 = var9[var11];
                            class194 var26 = class22.method204(true, var25);
                            int[] var27 = new int[var26.field3712];
                            class109[] var28 = new class109[var26.field3709];
                            for (int var29 = 0; var29 < var26.field3704; var29++) {
                                var27[var29] = class103.field2026[var6 + var29 - var26.field3704];
                            }
                            for (int var30 = 0; var30 < var26.field3698; var30++) {
                                var28[var30] = class13.field206[var30 + var8 - var26.field3698];
                            }
                            var6 -= var26.field3704;
                            var8 -= var26.field3698;
                            class47 var31 = new class47();
                            var31.field968 = var5;
                            var31.field971 = class143.field2750;
                            var31.field974 = class197.field3769;
                            var31.field977 = var11;
                            if (class137.field2645.length <= class72.field1403) {
                                throw new RuntimeException();
                            }
                            var11 = -1;
                            class137.field2645[class72.field1403++] = var31;
                            class143.field2750 = var27;
                            class197.field3769 = var28;
                            var5 = var26;
                            var9 = var26.field3711;
                            var7 = var26.field3708;
                            continue;
                        }
                        if (var316 == 42) {
                            class103.field2026[var6++] = class42.field879[var9[var11]];
                            continue;
                        }
                        if (var316 == 43) {
                            var10001 = var9[var11];
                            var6--;
                            class42.field879[var10001] = class103.field2026[var6];
                            continue;
                        }
                        if (var316 == 44) {
                            int var32 = var9[var11] >> 16;
                            var6--;
                            int var33 = class103.field2026[var6];
                            int var34 = var9[var11] & 0xFFFF;
                            if (var33 >= 0 && var33 <= 5000) {
                                class80.field1577[var32] = var33;
                                byte var35 = -1;
                                if (var34 == 105) {
                                    var35 = 0;
                                }
                                int var36 = 0;
                                while (true) {
                                    if (var33 <= var36) {
                                        continue label2239;
                                    }
                                    class128.field2487[var32][var36] = var35;
                                    var36++;
                                }
                            }
                            throw new RuntimeException();
                        }
                        if (var316 == 45) {
                            var6--;
                            int var37 = class103.field2026[var6];
                            int var38 = var9[var11];
                            if (var37 >= 0 && var37 < class80.field1577[var38]) {
                                class103.field2026[var6++] = class128.field2487[var38][var37];
                                continue;
                            }
                            throw new RuntimeException();
                        }
                        if (var316 == 46) {
                            int var39 = var9[var11];
                            var6 -= 2;
                            int var40 = class103.field2026[var6];
                            if (var40 >= 0 && var40 < class80.field1577[var39]) {
                                class128.field2487[var39][var40] = class103.field2026[var6 + 1];
                                continue;
                            }
                            throw new RuntimeException();
                        }
                        if (var316 == 47) {
                            class109 var41 = class116.field2300[var9[var11]];
                            if (var41 == null) {
                                var41 = class170.field3198;
                            }
                            class13.field206[var8++] = var41;
                            continue;
                        }
                        if (var316 == 48) {
                            var10001 = var9[var11];
                            var8--;
                            class116.field2300[var10001] = class13.field206[var8];
                            continue;
                        }
                    }
                    boolean var42;
                    if (var9[var11] == 1) {
                        var42 = true;
                    } else {
                        var42 = false;
                    }
                    if (var316 < 300) {
                        if (var316 == 100) {
                            var6 -= 3;
                            int var296 = class103.field2026[var6 + 1];
                            int var297 = class103.field2026[var6 + 2];
                            int var298 = class103.field2026[var6];
                            if (var296 == 0) {
                                throw new RuntimeException();
                            }
                            class200 var299 = class158.method1078(var298, (byte) 116);
                            if (var299.field3898 == null) {
                                var299.field3898 = new class200[var297 + 1];
                            }
                            if (var297 >= var299.field3898.length) {
                                class200[] var300 = new class200[var297 + 1];
                                for (int var301 = 0; var301 < var299.field3898.length; var301++) {
                                    var300[var301] = var299.field3898[var301];
                                }
                                var299.field3898 = var300;
                            }
                            if (var297 > 0 && var299.field3898[var297 - 1] == null) {
                                throw new RuntimeException("Gap at:" + (var297 - 1));
                            }
                            class200 var302 = new class200();
                            var302.field3868 = var302.field3866 = var299.field3866;
                            var302.field3875 = var296;
                            var302.field3900 = var297;
                            var302.field3946 = true;
                            var299.field3898[var297] = var302;
                            if (var42) {
                                class134.field2575 = var302;
                            } else {
                                class126.field2436 = var302;
                            }
                            class115.method851(var299, -23101);
                            continue;
                        }
                        if (var316 == 101) {
                            class200 var303 = var42 ? class134.field2575 : class126.field2436;
                            if (var303.field3900 == -1) {
                                if (!var42) {
                                    throw new RuntimeException("Tried to cc_delete static active-component!");
                                }
                                throw new RuntimeException("Tried to .cc_delete static .active-component!");
                            }
                            class200 var304 = class158.method1078(var303.field3866, (byte) 114);
                            var304.field3898[var303.field3900] = null;
                            class115.method851(var304, -23101);
                            continue;
                        }
                        if (var316 == 102) {
                            var6--;
                            class200 var305 = class158.method1078(class103.field2026[var6], (byte) 116);
                            var305.field3898 = null;
                            class115.method851(var305, -23101);
                            continue;
                        }
                        if (var316 == 200) {
                            var6 -= 2;
                            int var306 = class103.field2026[var6];
                            int var307 = class103.field2026[var6 + 1];
                            class200 var308 = class129.method932(var306, -1, var307);
                            if (var308 != null && var307 != -1) {
                                class103.field2026[var6++] = 1;
                                if (var42) {
                                    class134.field2575 = var308;
                                } else {
                                    class126.field2436 = var308;
                                }
                                continue;
                            }
                            class103.field2026[var6++] = 0;
                            continue;
                        }
                        if (var316 == 201) {
                            var6--;
                            int var309 = class103.field2026[var6];
                            class200 var310 = class158.method1078(var309, (byte) 121);
                            if (var310 == null) {
                                class103.field2026[var6++] = 0;
                            } else {
                                class103.field2026[var6++] = 1;
                                if (var42) {
                                    class134.field2575 = var310;
                                } else {
                                    class126.field2436 = var310;
                                }
                            }
                            continue;
                        }
                    } else if (var316 < 500) {
                        if (var316 == 403) {
                            var6 -= 2;
                            int var43 = class103.field2026[var6];
                            if (var43 >= 7) {
                                var43 -= 7;
                            }
                            int var44 = class103.field2026[var6 + 1];
                            class157.field2955.field3486.method107(-8621, var44, var43);
                            continue;
                        }
                        if (var316 == 404) {
                            var6 -= 2;
                            int var45 = class103.field2026[var6];
                            int var46 = class103.field2026[var6 + 1];
                            class157.field2955.field3486.method104(var45, var46, 12);
                            continue;
                        }
                        if (var316 == 410) {
                            var6--;
                            boolean var47 = class103.field2026[var6] != 0;
                            class157.field2955.field3486.method114(-68, var47);
                            continue;
                        }
                    } else if (var316 >= 1000 && var316 < 1100 || var316 >= 2000 && var316 < 2100) {
                        class200 var48;
                        if (var316 >= 2000) {
                            var316 -= 1000;
                            var6--;
                            var48 = class158.method1078(class103.field2026[var6], (byte) 123);
                        } else {
                            var48 = var42 ? class134.field2575 : class126.field2436;
                        }
                        if (var316 == 1000) {
                            var6 -= 2;
                            var48.field3825 = class103.field2026[var6];
                            var48.field3936 = class103.field2026[var6 + 1];
                            class115.method851(var48, -23101);
                            continue;
                        }
                        if (var316 == 1001) {
                            var6 -= 2;
                            var48.field3881 = class103.field2026[var6];
                            var48.field3901 = class103.field2026[var6 + 1];
                            class115.method851(var48, -23101);
                            continue;
                        }
                        if (var316 == 1003) {
                            var6--;
                            boolean var49 = class103.field2026[var6] == 1;
                            if (var49 != var48.field3842) {
                                var48.field3842 = var49;
                                class115.method851(var48, -23101);
                            }
                            continue;
                        }
                    } else if (var316 >= 1100 && var316 < 1200 || var316 >= 2100 && var316 < 2200) {
                        class200 var50;
                        if (var316 < 2000) {
                            var50 = var42 ? class134.field2575 : class126.field2436;
                        } else {
                            var6--;
                            var50 = class158.method1078(class103.field2026[var6], (byte) 115);
                            var316 -= 1000;
                        }
                        if (var316 == 1100) {
                            var6 -= 2;
                            var50.field3817 = class103.field2026[var6];
                            if (var50.field3817 > var50.field3874 - var50.field3881) {
                                var50.field3817 = var50.field3874 - var50.field3881;
                            }
                            if (var50.field3817 < 0) {
                                var50.field3817 = 0;
                            }
                            var50.field3945 = class103.field2026[var6 + 1];
                            if (var50.field3945 > var50.field3847 - var50.field3901) {
                                var50.field3945 = var50.field3847 - var50.field3901;
                            }
                            if (var50.field3945 < 0) {
                                var50.field3945 = 0;
                            }
                            class115.method851(var50, -23101);
                            continue;
                        }
                        if (var316 == 1101) {
                            var6--;
                            var50.field3843 = class103.field2026[var6];
                            class115.method851(var50, -23101);
                            continue;
                        }
                        if (var316 == 1102) {
                            var6--;
                            var50.field3932 = class103.field2026[var6] == 1;
                            class115.method851(var50, -23101);
                            continue;
                        }
                        if (var316 == 1103) {
                            var6--;
                            var50.field3854 = class103.field2026[var6];
                            class115.method851(var50, -23101);
                            continue;
                        }
                        if (var316 == 1104) {
                            var6--;
                            var50.field3938 = class103.field2026[var6];
                            class115.method851(var50, -23101);
                            continue;
                        }
                        if (var316 == 1105) {
                            var6--;
                            var50.field3924 = class103.field2026[var6];
                            class115.method851(var50, -23101);
                            continue;
                        }
                        if (var316 == 1106) {
                            var6--;
                            var50.field3862 = class103.field2026[var6];
                            class115.method851(var50, -23101);
                            continue;
                        }
                        if (var316 == 1107) {
                            var6--;
                            var50.field3845 = class103.field2026[var6] == 1;
                            class115.method851(var50, -23101);
                            continue;
                        }
                        if (var316 == 1108) {
                            var50.field3897 = 1;
                            var6--;
                            var50.field3931 = class103.field2026[var6];
                            class115.method851(var50, -23101);
                            continue;
                        }
                        if (var316 == 1109) {
                            var6 -= 6;
                            var50.field3877 = class103.field2026[var6];
                            var50.field3856 = class103.field2026[var6 + 1];
                            var50.field3873 = class103.field2026[var6 + 2];
                            var50.field3893 = class103.field2026[var6 + 3];
                            var50.field3907 = class103.field2026[var6 + 4];
                            var50.field3912 = class103.field2026[var6 + 5];
                            class115.method851(var50, -23101);
                            continue;
                        }
                        if (var316 == 1110) {
                            var6--;
                            int var51 = class103.field2026[var6];
                            if (var50.field3896 != var51) {
                                var50.field3822 = 0;
                                var50.field3939 = 0;
                                var50.field3896 = var51;
                                class115.method851(var50, -23101);
                            }
                            continue;
                        }
                        if (var316 == 1111) {
                            var6--;
                            var50.field3853 = class103.field2026[var6] == 1;
                            class115.method851(var50, -23101);
                            continue;
                        }
                        if (var316 == 1112) {
                            var8--;
                            class109 var52 = class13.field206[var8];
                            if (!var52.method809(var50.field3950, -1)) {
                                var50.field3950 = var52;
                                class115.method851(var50, -23101);
                            }
                            continue;
                        }
                        if (var316 == 1113) {
                            var6--;
                            var50.field3840 = class103.field2026[var6];
                            class115.method851(var50, -23101);
                            continue;
                        }
                        if (var316 == 1114) {
                            var6 -= 3;
                            var50.field3828 = class103.field2026[var6];
                            var50.field3836 = class103.field2026[var6 + 1];
                            var50.field3942 = class103.field2026[var6 + 2];
                            class115.method851(var50, -23101);
                            continue;
                        }
                        if (var316 == 1115) {
                            var6--;
                            var50.field3910 = class103.field2026[var6] == 1;
                            class115.method851(var50, -23101);
                            continue;
                        }
                        if (var316 == 1116) {
                            var6--;
                            var50.field3929 = class103.field2026[var6];
                            class115.method851(var50, -23101);
                            continue;
                        }
                        if (var316 == 1117) {
                            var6--;
                            var50.field3927 = class103.field2026[var6];
                            class115.method851(var50, -23101);
                            continue;
                        }
                        if (var316 == 1118) {
                            var6--;
                            var50.field3921 = class103.field2026[var6] == 1;
                            class115.method851(var50, -23101);
                            continue;
                        }
                        if (var316 == 1119) {
                            var6--;
                            var50.field3837 = class103.field2026[var6] == 1;
                            class115.method851(var50, -23101);
                            continue;
                        }
                        if (var316 == 1120) {
                            var6 -= 2;
                            var50.field3874 = class103.field2026[var6];
                            var50.field3847 = class103.field2026[var6 + 1];
                            class115.method851(var50, -23101);
                            continue;
                        }
                    } else if (var316 >= 1200 && var316 < 1300 || !(var316 < 2200 || var316 >= 2300)) {
                        class200 var292;
                        if (var316 >= 2000) {
                            var316 -= 1000;
                            var6--;
                            var292 = class158.method1078(class103.field2026[var6], (byte) 114);
                        } else {
                            var292 = var42 ? class134.field2575 : class126.field2436;
                        }
                        class115.method851(var292, -23101);
                        if (var316 == 1200) {
                            var6 -= 2;
                            int var293 = class103.field2026[var6];
                            int var294 = class103.field2026[var6 + 1];
                            if (var293 == -1) {
                                var292.field3897 = 1;
                                var292.field3931 = -1;
                                var292.field3824 = -1;
                            } else {
                                var292.field3824 = var293;
                                var292.field3816 = var294;
                                class83 var295 = class128.method926(var293, -4);
                                var292.field3907 = var295.field1671;
                                var292.field3873 = var295.field1636;
                                var292.field3856 = var295.field1673;
                                var292.field3893 = var295.field1684;
                                var292.field3912 = var295.field1662;
                                var292.field3877 = var295.field1654;
                                if (var292.field3881 > 0) {
                                    var292.field3912 = var292.field3912 * 32 / var292.field3881;
                                }
                            }
                            continue;
                        }
                        if (var316 == 1201) {
                            var292.field3897 = 2;
                            var6--;
                            var292.field3931 = class103.field2026[var6];
                            continue;
                        }
                        if (var316 == 1202) {
                            var292.field3897 = 3;
                            var292.field3931 = class157.field2955.field3486.method113((byte) -91);
                            continue;
                        }
                        if (var316 == 1203) {
                            var292.field3897 = 6;
                            var6--;
                            var292.field3931 = class103.field2026[var6];
                            continue;
                        }
                        if (var316 == 1204) {
                            var292.field3897 = 5;
                            var6--;
                            var292.field3931 = class103.field2026[var6];
                            continue;
                        }
                    } else if (var316 >= 1300 && var316 < 1400 || var316 >= 2300 && var316 < 2400) {
                        class200 var53;
                        if (var316 < 2000) {
                            var53 = var42 ? class134.field2575 : class126.field2436;
                        } else {
                            var6--;
                            var53 = class158.method1078(class103.field2026[var6], (byte) 120);
                            var316 -= 1000;
                        }
                        if (var316 == 1300) {
                            var6--;
                            int var54 = class103.field2026[var6] - 1;
                            if (var54 >= 0 && var54 <= 9) {
                                var8--;
                                var53.method1315(var54, -59, class13.field206[var8]);
                                continue;
                            }
                            var8--;
                            continue;
                        }
                        if (var316 == 1301) {
                            var6 -= 2;
                            int var55 = class103.field2026[var6];
                            int var56 = class103.field2026[var6 + 1];
                            var53.field3841 = class129.method932(var55, -1, var56);
                            continue;
                        }
                        if (var316 == 1302) {
                            var6--;
                            var53.field3886 = class103.field2026[var6] == 1;
                            continue;
                        }
                        if (var316 == 1303) {
                            var6--;
                            var53.field3883 = class103.field2026[var6];
                            continue;
                        }
                        if (var316 == 1304) {
                            var6--;
                            var53.field3872 = class103.field2026[var6];
                            continue;
                        }
                        if (var316 == 1305) {
                            var8--;
                            var53.field3821 = class13.field206[var8];
                            continue;
                        }
                        if (var316 == 1306) {
                            var8--;
                            var53.field3848 = class13.field206[var8];
                            continue;
                        }
                        if (var316 == 1307) {
                            var53.field3869 = null;
                            continue;
                        }
                    } else {
                        if (var316 >= 1400 && var316 < 1500 || var316 >= 2400 && var316 < 2500) {
                            class200 var57;
                            if (var316 >= 2000) {
                                var316 -= 1000;
                                var6--;
                                var57 = class158.method1078(class103.field2026[var6], (byte) 113);
                            } else {
                                var57 = var42 ? class134.field2575 : class126.field2436;
                            }
                            int[] var58 = null;
                            var8--;
                            class109 var59 = class13.field206[var8];
                            if (var59.method786(-30593) > 0 && var59.method779(-106, var59.method786(-30593) - 1) == 89) {
                                var6--;
                                int var60 = class103.field2026[var6];
                                if (var60 > 0) {
                                    var58 = new int[var60];
                                    while (var60-- > 0) {
                                        var6--;
                                        var58[var60] = class103.field2026[var6];
                                    }
                                }
                                var59 = var59.method794(var59.method786(-30593) - 1, 0, 113);
                            }
                            Object[] var61 = new Object[var59.method786(-30593) + 1];
                            for (int var62 = var61.length - 1; var62 >= 1; var62--) {
                                if (var59.method779(-97, var62 - 1) == 115) {
                                    var8--;
                                    var61[var62] = class13.field206[var8];
                                } else {
                                    var6--;
                                    var61[var62] = Integer.valueOf(class103.field2026[var6]);
                                }
                            }
                            var6--;
                            int var63 = class103.field2026[var6];
                            if (var63 == -1) {
                                var61 = null;
                            } else {
                                var61[0] = Integer.valueOf(var63);
                            }
                            if (var316 == 1402) {
                                var57.field3885 = var61;
                            }
                            if (var316 == 1425) {
                                var57.field3860 = var61;
                            }
                            if (var316 == 1421) {
                                var57.field3889 = var61;
                            }
                            if (var316 == 1405) {
                                var57.field3940 = var61;
                            }
                            if (var316 == 1403) {
                                var57.field3849 = var61;
                            }
                            if (var316 == 1423) {
                                var57.field3915 = var61;
                            }
                            if (var316 == 1411) {
                                var57.field3882 = var61;
                            }
                            if (var316 == 1400) {
                                var57.field3891 = var61;
                            }
                            if (var316 == 1412) {
                                var57.field3835 = var61;
                            }
                            if (var316 == 1410) {
                                var57.field3953 = var61;
                            }
                            if (var316 == 1416) {
                                var57.field3930 = var61;
                            }
                            if (var316 == 1404) {
                                var57.field3878 = var61;
                            }
                            if (var316 == 1407) {
                                var57.field3846 = var61;
                                var57.field3864 = var58;
                            }
                            if (var316 == 1408) {
                                var57.field3947 = var61;
                            }
                            var57.field3890 = true;
                            if (var316 == 1424) {
                                var57.field3934 = var61;
                            }
                            if (var316 == 1420) {
                                var57.field3935 = var61;
                            }
                            if (var316 == 1417) {
                                var57.field3937 = var61;
                            }
                            if (var316 == 1406) {
                                var57.field3832 = var61;
                            }
                            if (var316 == 1401) {
                                var57.field3917 = var61;
                            }
                            if (var316 == 1414) {
                                var57.field3830 = var58;
                                var57.field3952 = var61;
                            }
                            if (var316 == 1419) {
                                var57.field3905 = var61;
                            }
                            if (var316 == 1415) {
                                var57.field3879 = var58;
                                var57.field3933 = var61;
                            }
                            if (var316 == 1422) {
                                var57.field3831 = var61;
                            }
                            if (var316 == 1418) {
                                var57.field3911 = var61;
                            }
                            if (var316 == 1409) {
                                var57.field3861 = var61;
                            }
                            continue;
                        }
                        if (var316 < 1600) {
                            class200 var64 = var42 ? class134.field2575 : class126.field2436;
                            if (var316 == 1500) {
                                class103.field2026[var6++] = var64.field3825;
                                continue;
                            }
                            if (var316 == 1501) {
                                class103.field2026[var6++] = var64.field3936;
                                continue;
                            }
                            if (var316 == 1502) {
                                class103.field2026[var6++] = var64.field3881;
                                continue;
                            }
                            if (var316 == 1503) {
                                class103.field2026[var6++] = var64.field3901;
                                continue;
                            }
                            if (var316 == 1504) {
                                class103.field2026[var6++] = var64.field3842 ? 1 : 0;
                                continue;
                            }
                            if (var316 == 1505) {
                                class103.field2026[var6++] = var64.field3868;
                                continue;
                            }
                        } else if (var316 < 1700) {
                            class200 var65 = var42 ? class134.field2575 : class126.field2436;
                            if (var316 == 1600) {
                                class103.field2026[var6++] = var65.field3817;
                                continue;
                            }
                            if (var316 == 1601) {
                                class103.field2026[var6++] = var65.field3945;
                                continue;
                            }
                            if (var316 == 1602) {
                                class13.field206[var8++] = var65.field3950;
                                continue;
                            }
                            if (var316 == 1603) {
                                class103.field2026[var6++] = var65.field3874;
                                continue;
                            }
                            if (var316 == 1604) {
                                class103.field2026[var6++] = var65.field3847;
                                continue;
                            }
                            if (var316 == 1605) {
                                class103.field2026[var6++] = var65.field3912;
                                continue;
                            }
                            if (var316 == 1606) {
                                class103.field2026[var6++] = var65.field3873;
                                continue;
                            }
                            if (var316 == 1607) {
                                class103.field2026[var6++] = var65.field3907;
                                continue;
                            }
                            if (var316 == 1608) {
                                class103.field2026[var6++] = var65.field3893;
                                continue;
                            }
                            if (var316 == 1609) {
                                class103.field2026[var6++] = var65.field3854;
                                continue;
                            }
                        } else if (var316 < 1800) {
                            class200 var66 = var42 ? class134.field2575 : class126.field2436;
                            if (var316 == 1700) {
                                class103.field2026[var6++] = var66.field3824;
                                continue;
                            }
                            if (var316 == 1701) {
                                if (var66.field3824 == -1) {
                                    class103.field2026[var6++] = 0;
                                } else {
                                    class103.field2026[var6++] = var66.field3816;
                                }
                                continue;
                            }
                            if (var316 == 1702) {
                                class103.field2026[var6++] = var66.field3900;
                                continue;
                            }
                        } else if (var316 < 1900) {
                            class200 var67 = var42 ? class134.field2575 : class126.field2436;
                            if (var316 == 1800) {
                                class103.field2026[var6++] = class30.method243(71, class126.method918(var67, 99));
                                continue;
                            }
                            if (var316 == 1801) {
                                var6--;
                                int var68 = class103.field2026[var6];
                                int var317 = var68 - 1;
                                if (var67.field3869 != null && var67.field3869.length > var317 && var67.field3869[var317] != null) {
                                    class13.field206[var8++] = var67.field3869[var317];
                                    continue;
                                }
                                class13.field206[var8++] = class53.field1074;
                                continue;
                            }
                            if (var316 == 1802) {
                                if (var67.field3821 == null) {
                                    class13.field206[var8++] = class53.field1074;
                                } else {
                                    class13.field206[var8++] = var67.field3821;
                                }
                                continue;
                            }
                        } else if (var316 < 2600) {
                            var6--;
                            class200 var291 = class158.method1078(class103.field2026[var6], (byte) 121);
                            if (var316 == 2500) {
                                class103.field2026[var6++] = var291.field3825;
                                continue;
                            }
                            if (var316 == 2501) {
                                class103.field2026[var6++] = var291.field3936;
                                continue;
                            }
                            if (var316 == 2502) {
                                class103.field2026[var6++] = var291.field3881;
                                continue;
                            }
                            if (var316 == 2503) {
                                class103.field2026[var6++] = var291.field3901;
                                continue;
                            }
                            if (var316 == 2504) {
                                class103.field2026[var6++] = var291.field3842 ? 1 : 0;
                                continue;
                            }
                            if (var316 == 2505) {
                                class103.field2026[var6++] = var291.field3868;
                                continue;
                            }
                        } else if (var316 < 2700) {
                            var6--;
                            class200 var69 = class158.method1078(class103.field2026[var6], (byte) 126);
                            if (var316 == 2600) {
                                class103.field2026[var6++] = var69.field3817;
                                continue;
                            }
                            if (var316 == 2601) {
                                class103.field2026[var6++] = var69.field3945;
                                continue;
                            }
                            if (var316 == 2602) {
                                class13.field206[var8++] = var69.field3950;
                                continue;
                            }
                            if (var316 == 2603) {
                                class103.field2026[var6++] = var69.field3874;
                                continue;
                            }
                            if (var316 == 2604) {
                                class103.field2026[var6++] = var69.field3847;
                                continue;
                            }
                            if (var316 == 2605) {
                                class103.field2026[var6++] = var69.field3912;
                                continue;
                            }
                            if (var316 == 2606) {
                                class103.field2026[var6++] = var69.field3873;
                                continue;
                            }
                            if (var316 == 2607) {
                                class103.field2026[var6++] = var69.field3907;
                                continue;
                            }
                            if (var316 == 2608) {
                                class103.field2026[var6++] = var69.field3893;
                                continue;
                            }
                            if (var316 == 2609) {
                                class103.field2026[var6++] = var69.field3854;
                                continue;
                            }
                        } else if (var316 < 2800) {
                            if (var316 == 2700) {
                                var6--;
                                class200 var70 = class158.method1078(class103.field2026[var6], (byte) 123);
                                class103.field2026[var6++] = var70.field3824;
                                continue;
                            }
                            if (var316 == 2701) {
                                var6--;
                                class200 var71 = class158.method1078(class103.field2026[var6], (byte) 115);
                                if (var71.field3824 == -1) {
                                    class103.field2026[var6++] = 0;
                                } else {
                                    class103.field2026[var6++] = var71.field3816;
                                }
                                continue;
                            }
                            if (var316 == 2702) {
                                var6--;
                                int var72 = class103.field2026[var6];
                                class60 var73 = (class60) class113.field2236.method337((long) var72, (byte) -78);
                                if (var73 == null) {
                                    class103.field2026[var6++] = 0;
                                } else {
                                    class103.field2026[var6++] = 1;
                                }
                                continue;
                            }
                            if (var316 == 2703) {
                                var6--;
                                class200 var74 = class158.method1078(class103.field2026[var6], (byte) 121);
                                if (var74.field3898 == null) {
                                    class103.field2026[var6++] = 0;
                                    continue;
                                }
                                int var75 = var74.field3898.length;
                                for (int var76 = 0; var76 < var74.field3898.length; var76++) {
                                    if (var74.field3898[var76] == null) {
                                        var75 = var76;
                                        break;
                                    }
                                }
                                class103.field2026[var6++] = var75;
                                continue;
                            }
                            if (var316 == 2704 || var316 == 2705) {
                                var6 -= 2;
                                int var77 = class103.field2026[var6];
                                int var78 = class103.field2026[var6 + 1];
                                class60 var79 = (class60) class113.field2236.method337((long) var77, (byte) -107);
                                if (var79 != null && var79.field1174 == var78) {
                                    class103.field2026[var6++] = 1;
                                    continue;
                                }
                                class103.field2026[var6++] = 0;
                                continue;
                            }
                        } else if (var316 < 2900) {
                            var6--;
                            class200 var289 = class158.method1078(class103.field2026[var6], (byte) 114);
                            if (var316 == 2800) {
                                class103.field2026[var6++] = class30.method243(-14, class126.method918(var289, 116));
                                continue;
                            }
                            if (var316 == 2801) {
                                var6--;
                                int var290 = class103.field2026[var6];
                                int var318 = var290 - 1;
                                if (var289.field3869 != null && var289.field3869.length > var318 && var289.field3869[var318] != null) {
                                    class13.field206[var8++] = var289.field3869[var318];
                                    continue;
                                }
                                class13.field206[var8++] = class53.field1074;
                                continue;
                            }
                            if (var316 == 2802) {
                                if (var289.field3821 == null) {
                                    class13.field206[var8++] = class53.field1074;
                                } else {
                                    class13.field206[var8++] = var289.field3821;
                                }
                                continue;
                            }
                        } else if (var316 < 3200) {
                            if (var316 == 3100) {
                                var8--;
                                class109 var274 = class13.field206[var8];
                                class98.method690(class53.field1074, false, var274, 0);
                                continue;
                            }
                            if (var316 == 3101) {
                                var6 -= 2;
                                class10.method59(class103.field2026[var6 + 1], class103.field2026[var6], false, class157.field2955);
                                continue;
                            }
                            if (var316 == 3103) {
                                class145.method1017(103);
                                continue;
                            }
                            if (var316 == 3104) {
                                var8--;
                                class109 var275 = class13.field206[var8];
                                class48.field989++;
                                int var276 = 0;
                                if (var275.method782(-29838)) {
                                    var276 = var275.method781((byte) 126);
                                }
                                class200.field3850.method1339((byte) 114, 171);
                                class200.field3850.method588((byte) 117, var276);
                                continue;
                            }
                            if (var316 == 3105) {
                                field2638++;
                                var8--;
                                class109 var277 = class13.field206[var8];
                                class200.field3850.method1339((byte) 81, 150);
                                class200.field3850.method592(var277.method784(arg0), -562765672);
                                continue;
                            }
                            if (var316 == 3106) {
                                class170.field3149++;
                                var8--;
                                class109 var278 = class13.field206[var8];
                                class200.field3850.method1339((byte) 108, 39);
                                class200.field3850.method568(-13488, var278.method786(-30593) + 1);
                                class200.field3850.method585(var278, (byte) -17);
                                continue;
                            }
                            if (var316 == 3107) {
                                var6--;
                                int var279 = class103.field2026[var6];
                                var8--;
                                class109 var280 = class13.field206[var8];
                                class131.method942(-59, var279, var280);
                                continue;
                            }
                            if (var316 == 3108) {
                                var6 -= 3;
                                int var281 = class103.field2026[var6 + 1];
                                int var282 = class103.field2026[var6];
                                int var283 = class103.field2026[var6 + 2];
                                class200 var284 = class158.method1078(var283, (byte) 125);
                                class78.method506(var281, var284, var282, (byte) 101);
                                continue;
                            }
                            if (var316 == 3109) {
                                var6 -= 2;
                                int var285 = class103.field2026[var6];
                                int var286 = class103.field2026[var6 + 1];
                                class200 var287 = var42 ? class134.field2575 : class126.field2436;
                                class78.method506(var286, var287, var285, (byte) 104);
                                continue;
                            }
                            if (var316 == 3110) {
                                class202.field3972++;
                                var6--;
                                int var288 = class103.field2026[var6];
                                class200.field3850.method1339((byte) 91, 43);
                                class200.field3850.method557(9698, var288);
                                continue;
                            }
                        } else if (var316 < 3300) {
                            if (var316 == 3200) {
                                var6 -= 3;
                                class8.method36(class103.field2026[var6 + 1], class103.field2026[var6], 0, class103.field2026[var6 + 2]);
                                continue;
                            }
                            if (var316 == 3201) {
                                var6--;
                                class183.method1241(-90, class103.field2026[var6]);
                                continue;
                            }
                            if (var316 == 3202) {
                                var6 -= 2;
                                class153.method1048(0, class103.field2026[var6 + 1], class103.field2026[var6]);
                                continue;
                            }
                        } else if (var316 < 3400) {
                            if (var316 == 3300) {
                                class103.field2026[var6++] = class143.field2754;
                                continue;
                            }
                            if (var316 == 3301) {
                                var6 -= 2;
                                int var80 = class103.field2026[var6];
                                int var81 = class103.field2026[var6 + 1];
                                class103.field2026[var6++] = class54.method351(var81, -26917, var80);
                                continue;
                            }
                            if (var316 == 3302) {
                                var6 -= 2;
                                int var82 = class103.field2026[var6 + 1];
                                int var83 = class103.field2026[var6];
                                class103.field2026[var6++] = class29.method237(var82, 104, var83);
                                continue;
                            }
                            if (var316 == 3303) {
                                var6 -= 2;
                                int var84 = class103.field2026[var6];
                                int var85 = class103.field2026[var6 + 1];
                                class103.field2026[var6++] = class93.method679(var84, var85, -125);
                                continue;
                            }
                            if (var316 == 3304) {
                                var6--;
                                int var86 = class103.field2026[var6];
                                class103.field2026[var6++] = class18.method162(-119, var86).field1095;
                                continue;
                            }
                            if (var316 == 3305) {
                                var6--;
                                int var87 = class103.field2026[var6];
                                class103.field2026[var6++] = class18.field379[var87];
                                continue;
                            }
                            if (var316 == 3306) {
                                var6--;
                                int var88 = class103.field2026[var6];
                                class103.field2026[var6++] = class185.field3529[var88];
                                continue;
                            }
                            if (var316 == 3307) {
                                var6--;
                                int var89 = class103.field2026[var6];
                                class103.field2026[var6++] = class194.field3717[var89];
                                continue;
                            }
                            if (var316 == 3308) {
                                int var90 = class72.field1405;
                                int var91 = (class157.field2955.field3549 >> 7) + class53.field1079;
                                int var92 = (class157.field2955.field3609 >> 7) + class42.field880;
                                class103.field2026[var6++] = (var90 << 28) + (var91 << 14) + var92;
                                continue;
                            }
                            if (var316 == 3309) {
                                var6--;
                                int var93 = class103.field2026[var6];
                                class103.field2026[var6++] = class170.method1140(var93, 268422251) >> 14;
                                continue;
                            }
                            if (var316 == 3310) {
                                var6--;
                                int var94 = class103.field2026[var6];
                                class103.field2026[var6++] = var94 >> 28;
                                continue;
                            }
                            if (var316 == 3311) {
                                var6--;
                                int var95 = class103.field2026[var6];
                                class103.field2026[var6++] = class170.method1140(var95, 16383);
                                continue;
                            }
                            if (var316 == 3312) {
                                class103.field2026[var6++] = class68.field1326 ? 1 : 0;
                                continue;
                            }
                            if (var316 == 3313) {
                                var6 -= 2;
                                int var96 = class103.field2026[var6] + 32768;
                                int var97 = class103.field2026[var6 + 1];
                                class103.field2026[var6++] = class54.method351(var97, -26917, var96);
                                continue;
                            }
                            if (var316 == 3314) {
                                var6 -= 2;
                                int var98 = class103.field2026[var6 + 1];
                                int var99 = class103.field2026[var6] + 32768;
                                class103.field2026[var6++] = class29.method237(var98, 100, var99);
                                continue;
                            }
                            if (var316 == 3315) {
                                var6 -= 2;
                                int var100 = class103.field2026[var6] + 32768;
                                int var101 = class103.field2026[var6 + 1];
                                class103.field2026[var6++] = class93.method679(var100, var101, -122);
                                continue;
                            }
                            if (var316 == 3316) {
                                if (class115.field2280 >= 2) {
                                    class103.field2026[var6++] = class115.field2280;
                                } else {
                                    class103.field2026[var6++] = 0;
                                }
                                continue;
                            }
                            if (var316 == 3317) {
                                class103.field2026[var6++] = class30.field655;
                                continue;
                            }
                            if (var316 == 3318) {
                                class103.field2026[var6++] = class73.field1413;
                                continue;
                            }
                            if (var316 == 3321) {
                                class103.field2026[var6++] = class177.field3344;
                                continue;
                            }
                            if (var316 == 3322) {
                                class103.field2026[var6++] = class185.field3527;
                                continue;
                            }
                            if (var316 == 3323) {
                                if (class115.field2280 == 1) {
                                    class103.field2026[var6++] = 1;
                                } else {
                                    class103.field2026[var6++] = 0;
                                }
                                continue;
                            }
                            if (var316 == 3324) {
                                if (class202.field3973 >= 5 && class202.field3973 <= 9) {
                                    class103.field2026[var6++] = class202.field3973;
                                    continue;
                                }
                                class103.field2026[var6++] = 0;
                                continue;
                            }
                            if (var316 == 3325) {
                                if (class84.field1712 > 0) {
                                    class103.field2026[var6++] = 1;
                                } else {
                                    class103.field2026[var6++] = 0;
                                }
                                continue;
                            }
                            if (var316 == 3326) {
                                class103.field2026[var6++] = class157.field2955.field3475;
                                continue;
                            }
                            if (var316 == 3327) {
                                class103.field2026[var6++] = class157.field2955.field3486.field308 ? 1 : 0;
                                continue;
                            }
                        } else if (var316 < 3500) {
                            if (var316 == 3400) {
                                var6 -= 2;
                                int var102 = class103.field2026[var6];
                                int var103 = class103.field2026[var6 + 1];
                                class4 var104 = class72.method457(1, var102);
                                for (int var105 = 0; var105 < var104.field44; var105++) {
                                    if (var104.field50[var105] == var103) {
                                        class13.field206[var8++] = var104.field45[var105];
                                        var104 = null;
                                        break;
                                    }
                                }
                                if (var104 != null) {
                                    class13.field206[var8++] = var104.field56;
                                }
                                continue;
                            }
                            if (var316 == 3408) {
                                var6 -= 4;
                                int var106 = class103.field2026[var6];
                                int var107 = class103.field2026[var6 + 1];
                                int var108 = class103.field2026[var6 + 2];
                                int var109 = class103.field2026[var6 + 3];
                                class4 var110 = class72.method457(1, var108);
                                if (var110.field47 == var106 && var110.field58 == var107) {
                                    for (int var111 = 0; var111 < var110.field44; var111++) {
                                        if (var110.field50[var111] == var109) {
                                            if (var107 == 115) {
                                                class13.field206[var8++] = var110.field45[var111];
                                            } else {
                                                class103.field2026[var6++] = var110.field41[var111];
                                            }
                                            var110 = null;
                                            break;
                                        }
                                    }
                                    if (var110 != null) {
                                        if (var107 == 115) {
                                            class13.field206[var8++] = var110.field56;
                                        } else {
                                            class103.field2026[var6++] = var110.field40;
                                        }
                                    }
                                    continue;
                                }
                                if (var107 == 115) {
                                    class13.field206[var8++] = class170.field3198;
                                } else {
                                    class103.field2026[var6++] = 0;
                                }
                                continue;
                            }
                        } else if (var316 < 3700) {
                            if (var316 == 3600) {
                                if (class160.field3002 == 0) {
                                    class103.field2026[var6++] = -2;
                                } else if (class160.field3002 == 1) {
                                    class103.field2026[var6++] = -1;
                                } else {
                                    class103.field2026[var6++] = class199.field3786;
                                }
                                continue;
                            }
                            if (var316 == 3601) {
                                var6--;
                                int var112 = class103.field2026[var6];
                                if (class160.field3002 == 2 && var112 < class199.field3786) {
                                    class13.field206[var8++] = class114.field2265[var112];
                                    continue;
                                }
                                class13.field206[var8++] = class53.field1074;
                                continue;
                            }
                            if (var316 == 3602) {
                                var6--;
                                int var113 = class103.field2026[var6];
                                if (class160.field3002 == 2 && class199.field3786 > var113) {
                                    class103.field2026[var6++] = class93.field1923[var113];
                                    continue;
                                }
                                class103.field2026[var6++] = 0;
                                continue;
                            }
                            if (var316 == 3603) {
                                var6--;
                                int var114 = class103.field2026[var6];
                                if (class160.field3002 == 2 && class199.field3786 > var114) {
                                    class103.field2026[var6++] = class142.field2744[var114];
                                    continue;
                                }
                                class103.field2026[var6++] = 0;
                                continue;
                            }
                            if (var316 == 3604) {
                                var8--;
                                class109 var115 = class13.field206[var8];
                                var6--;
                                int var116 = class103.field2026[var6];
                                class14.method96(var116, var115, 78);
                                continue;
                            }
                            if (var316 == 3605) {
                                var8--;
                                class109 var117 = class13.field206[var8];
                                class85.method539(98, var117.method784(false));
                                continue;
                            }
                            if (var316 == 3606) {
                                var8--;
                                class109 var118 = class13.field206[var8];
                                class105.method754(var118.method784(false), 1);
                                continue;
                            }
                            if (var316 == 3607) {
                                var8--;
                                class109 var119 = class13.field206[var8];
                                class52.method346(var119.method784(false), false);
                                continue;
                            }
                            if (var316 == 3608) {
                                var8--;
                                class109 var120 = class13.field206[var8];
                                class192.method1292(3542, var120.method784(false));
                                continue;
                            }
                            if (var316 == 3609) {
                                var8--;
                                class109 var121 = class13.field206[var8];
                                if (var121.method793((byte) -102, class79.field1569) || var121.method793((byte) -81, class44.field909)) {
                                    var121 = var121.method798(-41, 7);
                                }
                                class103.field2026[var6++] = class22.method205(var121, -95) ? 1 : 0;
                                continue;
                            }
                            if (var316 == 3611) {
                                if (class19.field420 == null) {
                                    class13.field206[var8++] = class53.field1074;
                                } else {
                                    class13.field206[var8++] = class19.field420.method810(true);
                                }
                                continue;
                            }
                            if (var316 == 3612) {
                                if (class19.field420 == null) {
                                    class103.field2026[var6++] = 0;
                                } else {
                                    class103.field2026[var6++] = class121.field2341;
                                }
                                continue;
                            }
                            if (var316 == 3613) {
                                var6--;
                                int var122 = class103.field2026[var6];
                                if (class19.field420 != null && var122 < class121.field2341) {
                                    class13.field206[var8++] = class192.field3668[var122].field1826.method810(!arg0);
                                    continue;
                                }
                                class13.field206[var8++] = class53.field1074;
                                continue;
                            }
                            if (var316 == 3614) {
                                var6--;
                                int var123 = class103.field2026[var6];
                                if (class19.field420 != null && var123 < class121.field2341) {
                                    class103.field2026[var6++] = class192.field3668[var123].field1832;
                                    continue;
                                }
                                class103.field2026[var6++] = 0;
                                continue;
                            }
                            if (var316 == 3615) {
                                var6--;
                                int var124 = class103.field2026[var6];
                                if (class19.field420 != null && class121.field2341 > var124) {
                                    class103.field2026[var6++] = class192.field3668[var124].field1829;
                                    continue;
                                }
                                class103.field2026[var6++] = 0;
                                continue;
                            }
                            if (var316 == 3616) {
                                class103.field2026[var6++] = field2634;
                                continue;
                            }
                            if (var316 == 3617) {
                                var8--;
                                class109 var125 = class13.field206[var8];
                                class170.method1138(true, var125);
                                continue;
                            }
                            if (var316 == 3618) {
                                class103.field2026[var6++] = class65.field1249;
                                continue;
                            }
                            if (var316 == 3619) {
                                var8--;
                                class109 var126 = class13.field206[var8];
                                class193.method1296(var126.method784(arg0), -22946);
                                continue;
                            }
                            if (var316 == 3620) {
                                class106.method766(false);
                                continue;
                            }
                            if (var316 == 3621) {
                                if (class160.field3002 == 0) {
                                    class103.field2026[var6++] = -1;
                                } else {
                                    class103.field2026[var6++] = class19.field426;
                                }
                                continue;
                            }
                            if (var316 == 3622) {
                                var6--;
                                int var127 = class103.field2026[var6];
                                if (class160.field3002 != 0 && class19.field426 > var127) {
                                    class13.field206[var8++] = method981((byte) -81, class82.field1607[var127]).method810(true);
                                    continue;
                                }
                                class13.field206[var8++] = class53.field1074;
                                continue;
                            }
                            if (var316 == 3623) {
                                var8--;
                                class109 var128 = class13.field206[var8];
                                if (var128.method793((byte) -70, class79.field1569) || var128.method793((byte) -85, class44.field909)) {
                                    var128 = var128.method798(-41, 7);
                                }
                                class103.field2026[var6++] = class193.method1295(var128, 125) ? 1 : 0;
                                continue;
                            }
                            if (var316 == 3624) {
                                var6--;
                                int var129 = class103.field2026[var6];
                                if (class192.field3668 != null && var129 < class121.field2341 && class192.field3668[var129].field1826.method778((byte) -121, class157.field2955.field3455)) {
                                    class103.field2026[var6++] = 1;
                                    continue;
                                }
                                class103.field2026[var6++] = 0;
                                continue;
                            }
                            if (var316 == 3625) {
                                if (class44.field922 == null) {
                                    class13.field206[var8++] = class53.field1074;
                                } else {
                                    class13.field206[var8++] = class44.field922.method810(true);
                                }
                                continue;
                            }
                        } else if (var316 < 4000) {
                            if (var316 == 3903) {
                                var6--;
                                int var260 = class103.field2026[var6];
                                class103.field2026[var6++] = class18.field384[var260].method944(true);
                                continue;
                            }
                            if (var316 == 3904) {
                                var6--;
                                int var261 = class103.field2026[var6];
                                class103.field2026[var6++] = class18.field384[var261].field2547;
                                continue;
                            }
                            if (var316 == 3905) {
                                var6--;
                                int var262 = class103.field2026[var6];
                                class103.field2026[var6++] = class18.field384[var262].field2552;
                                continue;
                            }
                            if (var316 == 3906) {
                                var6--;
                                int var263 = class103.field2026[var6];
                                class103.field2026[var6++] = class18.field384[var263].field2556;
                                continue;
                            }
                            if (var316 == 3907) {
                                var6--;
                                int var264 = class103.field2026[var6];
                                class103.field2026[var6++] = class18.field384[var264].field2549;
                                continue;
                            }
                            if (var316 == 3908) {
                                var6--;
                                int var265 = class103.field2026[var6];
                                class103.field2026[var6++] = class18.field384[var265].field2551;
                                continue;
                            }
                            if (var316 == 3910) {
                                var6--;
                                int var266 = class103.field2026[var6];
                                int var267 = class18.field384[var266].method943(7);
                                class103.field2026[var6++] = var267 == 0 ? 1 : 0;
                                continue;
                            }
                            if (var316 == 3911) {
                                var6--;
                                int var268 = class103.field2026[var6];
                                int var269 = class18.field384[var268].method943(7);
                                class103.field2026[var6++] = var269 == 2 ? 1 : 0;
                                continue;
                            }
                            if (var316 == 3912) {
                                var6--;
                                int var270 = class103.field2026[var6];
                                int var271 = class18.field384[var270].method943(7);
                                class103.field2026[var6++] = var271 == 5 ? 1 : 0;
                                continue;
                            }
                            if (var316 == 3913) {
                                var6--;
                                int var272 = class103.field2026[var6];
                                int var273 = class18.field384[var272].method943(7);
                                class103.field2026[var6++] = var273 == 1 ? 1 : 0;
                                continue;
                            }
                        } else if (var316 < 4100) {
                            if (var316 == 4000) {
                                var6 -= 2;
                                int var217 = class103.field2026[var6];
                                int var218 = class103.field2026[var6 + 1];
                                class103.field2026[var6++] = var217 + var218;
                                continue;
                            }
                            if (var316 == 4001) {
                                var6 -= 2;
                                int var219 = class103.field2026[var6 + 1];
                                int var220 = class103.field2026[var6];
                                class103.field2026[var6++] = var220 - var219;
                                continue;
                            }
                            if (var316 == 4002) {
                                var6 -= 2;
                                int var221 = class103.field2026[var6 + 1];
                                int var222 = class103.field2026[var6];
                                class103.field2026[var6++] = var221 * var222;
                                continue;
                            }
                            if (var316 == 4003) {
                                var6 -= 2;
                                int var223 = class103.field2026[var6];
                                int var224 = class103.field2026[var6 + 1];
                                class103.field2026[var6++] = var223 / var224;
                                continue;
                            }
                            if (var316 == 4004) {
                                var6--;
                                int var225 = class103.field2026[var6];
                                class103.field2026[var6++] = (int) (Math.random() * (double) var225);
                                continue;
                            }
                            if (var316 == 4005) {
                                var6--;
                                int var226 = class103.field2026[var6];
                                class103.field2026[var6++] = (int) ((double) (var226 + 1) * Math.random());
                                continue;
                            }
                            if (var316 == 4006) {
                                var6 -= 5;
                                int var227 = class103.field2026[var6 + 1];
                                int var228 = class103.field2026[var6];
                                int var229 = class103.field2026[var6 + 2];
                                int var230 = class103.field2026[var6 + 3];
                                int var231 = class103.field2026[var6 + 4];
                                class103.field2026[var6++] = (var227 - var228) * (-var229 + var231) / (var230 - var229) + var228;
                                continue;
                            }
                            if (var316 == 4007) {
                                var6 -= 2;
                                int var232 = class103.field2026[var6];
                                int var233 = class103.field2026[var6 + 1];
                                class103.field2026[var6++] = var232 + var232 * var233 / 100;
                                continue;
                            }
                            if (var316 == 4008) {
                                var6 -= 2;
                                int var234 = class103.field2026[var6 + 1];
                                int var235 = class103.field2026[var6];
                                class103.field2026[var6++] = class31.method262(var235, 0x1 << var234);
                                continue;
                            }
                            if (var316 == 4009) {
                                var6 -= 2;
                                int var236 = class103.field2026[var6];
                                int var237 = class103.field2026[var6 + 1];
                                class103.field2026[var6++] = class170.method1140(-(0x1 << var237) - 1, var236);
                                continue;
                            }
                            if (var316 == 4010) {
                                var6 -= 2;
                                int var238 = class103.field2026[var6 + 1];
                                int var239 = class103.field2026[var6];
                                class103.field2026[var6++] = class170.method1140(var239, 0x1 << var238) == 0 ? 0 : 1;
                                continue;
                            }
                            if (var316 == 4011) {
                                var6 -= 2;
                                int var240 = class103.field2026[var6];
                                int var241 = class103.field2026[var6 + 1];
                                class103.field2026[var6++] = var240 % var241;
                                continue;
                            }
                            if (var316 == 4012) {
                                var6 -= 2;
                                int var242 = class103.field2026[var6];
                                int var243 = class103.field2026[var6 + 1];
                                if (var242 == 0) {
                                    class103.field2026[var6++] = 0;
                                } else {
                                    class103.field2026[var6++] = (int) Math.pow((double) var242, (double) var243);
                                }
                                continue;
                            }
                            if (var316 == 4013) {
                                var6 -= 2;
                                int var244 = class103.field2026[var6];
                                int var245 = class103.field2026[var6 + 1];
                                if (var244 == 0) {
                                    class103.field2026[var6++] = 0;
                                } else if (var245 == 0) {
                                    class103.field2026[var6++] = Integer.MAX_VALUE;
                                } else {
                                    class103.field2026[var6++] = (int) Math.pow((double) var244, 1.0D / (double) var245);
                                }
                                continue;
                            }
                            if (var316 == 4014) {
                                var6 -= 2;
                                int var246 = class103.field2026[var6];
                                int var247 = class103.field2026[var6 + 1];
                                class103.field2026[var6++] = class170.method1140(var247, var246);
                                continue;
                            }
                            if (var316 == 4015) {
                                var6 -= 2;
                                int var248 = class103.field2026[var6];
                                int var249 = class103.field2026[var6 + 1];
                                class103.field2026[var6++] = class31.method262(var249, var248);
                                continue;
                            }
                            if (var316 == 4016) {
                                var6 -= 2;
                                int var250 = class103.field2026[var6 + 1];
                                int var251 = class103.field2026[var6];
                                class103.field2026[var6++] = var250 > var251 ? var251 : var250;
                                continue;
                            }
                            if (var316 == 4017) {
                                var6 -= 2;
                                int var252 = class103.field2026[var6 + 1];
                                int var253 = class103.field2026[var6];
                                class103.field2026[var6++] = var253 <= var252 ? var252 : var253;
                                continue;
                            }
                            if (var316 == 4018) {
                                var6 -= 3;
                                long var254 = (long) class103.field2026[var6];
                                long var256 = (long) class103.field2026[var6 + 1];
                                long var258 = (long) class103.field2026[var6 + 2];
                                class103.field2026[var6++] = (int) (var254 * var258 / var256);
                                continue;
                            }
                        } else if (var316 < 4200) {
                            if (var316 == 4100) {
                                var6--;
                                int var167 = class103.field2026[var6];
                                var8--;
                                class109 var168 = class13.field206[var8];
                                class13.field206[var8++] = class36.method279(new class109[] { var168, class52.method345((byte) 85, var167) }, 118);
                                continue;
                            }
                            if (var316 == 4101) {
                                var8 -= 2;
                                class109 var169 = class13.field206[var8];
                                class109 var170 = class13.field206[var8 + 1];
                                class13.field206[var8++] = class36.method279(new class109[] { var169, var170 }, 116);
                                continue;
                            }
                            if (var316 == 4102) {
                                var8--;
                                class109 var171 = class13.field206[var8];
                                var6--;
                                int var172 = class103.field2026[var6];
                                class13.field206[var8++] = class36.method279(new class109[] { var171, class169.method1136(40, true, var172) }, 124);
                                continue;
                            }
                            if (var316 == 4103) {
                                var8--;
                                class109 var173 = class13.field206[var8];
                                class13.field206[var8++] = var173.method776(-10180);
                                continue;
                            }
                            if (var316 == 4104) {
                                var6--;
                                int var174 = class103.field2026[var6];
                                long var175 = (long) var174 * 86400000L + 1014768000000L;
                                class24.field540.setTime(new Date(var175));
                                int var177 = class24.field540.get(5);
                                int var178 = class24.field540.get(2);
                                int var179 = class24.field540.get(1);
                                class13.field206[var8++] = class36.method279(new class109[] { class52.method345((byte) 85, var177), class186.field3535, class70.field1368[var178], class186.field3535, class52.method345((byte) 85, var179) }, -85);
                                continue;
                            }
                            if (var316 == 4105) {
                                var8 -= 2;
                                class109 var180 = class13.field206[var8];
                                class109 var181 = class13.field206[var8 + 1];
                                if (class157.field2955.field3486 != null && class157.field2955.field3486.field308) {
                                    class13.field206[var8++] = var181;
                                    continue;
                                }
                                class13.field206[var8++] = var180;
                                continue;
                            }
                            if (var316 == 4106) {
                                var6--;
                                int var182 = class103.field2026[var6];
                                class13.field206[var8++] = class52.method345((byte) 85, var182);
                                continue;
                            }
                            if (var316 == 4107) {
                                var8 -= 2;
                                class103.field2026[var6++] = class13.field206[var8].method806(-112, class13.field206[var8 + 1]);
                                continue;
                            }
                            if (var316 == 4108) {
                                var6 -= 2;
                                var8--;
                                class109 var183 = class13.field206[var8];
                                int var184 = class103.field2026[var6];
                                int var185 = class103.field2026[var6 + 1];
                                byte[] var186 = class68.field1322.method147(0, 0, var185);
                                class33 var187 = new class33(var186);
                                var187.method146(class145.field2798, null);
                                class103.field2026[var6++] = var187.method136(var183, var184);
                                continue;
                            }
                            if (var316 == 4109) {
                                var6 -= 2;
                                int var188 = class103.field2026[var6];
                                int var189 = class103.field2026[var6 + 1];
                                var8--;
                                class109 var190 = class13.field206[var8];
                                byte[] var191 = class68.field1322.method147(0, 0, var189);
                                class33 var192 = new class33(var191);
                                var192.method146(class145.field2798, null);
                                class103.field2026[var6++] = var192.method132(var190, var188);
                                continue;
                            }
                            if (var316 == 4110) {
                                var8 -= 2;
                                class109 var193 = class13.field206[var8];
                                class109 var194 = class13.field206[var8 + 1];
                                var6--;
                                if (class103.field2026[var6] == 1) {
                                    class13.field206[var8++] = var193;
                                } else {
                                    class13.field206[var8++] = var194;
                                }
                                continue;
                            }
                            if (var316 == 4111) {
                                var8--;
                                class109 var195 = class13.field206[var8];
                                class13.field206[var8++] = class17.method127(var195);
                                continue;
                            }
                            if (var316 == 4112) {
                                var8--;
                                class109 var196 = class13.field206[var8];
                                var6--;
                                int var197 = class103.field2026[var6];
                                class13.field206[var8++] = var196.method800(117, var197);
                                continue;
                            }
                            if (var316 == 4113) {
                                var6--;
                                int var198 = class103.field2026[var6];
                                class103.field2026[var6++] = class106.method769(var198, (byte) 114) ? 1 : 0;
                                continue;
                            }
                            if (var316 == 4114) {
                                var6--;
                                int var199 = class103.field2026[var6];
                                class103.field2026[var6++] = class41.method300(true, var199) ? 1 : 0;
                                continue;
                            }
                            if (var316 == 4115) {
                                var6--;
                                int var200 = class103.field2026[var6];
                                class103.field2026[var6++] = class57.method379(var200, -13101) ? 1 : 0;
                                continue;
                            }
                            if (var316 == 4116) {
                                var6--;
                                int var201 = class103.field2026[var6];
                                class103.field2026[var6++] = class75.method470(48, var201) ? 1 : 0;
                                continue;
                            }
                            if (var316 == 4117) {
                                var8--;
                                class109 var202 = class13.field206[var8];
                                if (var202 == null) {
                                    class103.field2026[var6++] = 0;
                                } else {
                                    class103.field2026[var6++] = var202.method786(-30593);
                                }
                                continue;
                            }
                            if (var316 == 4118) {
                                var6 -= 2;
                                int var203 = class103.field2026[var6 + 1];
                                int var204 = class103.field2026[var6];
                                var8--;
                                class109 var205 = class13.field206[var8];
                                class13.field206[var8++] = var205.method794(var203, var204, 99);
                                continue;
                            }
                            if (var316 == 4119) {
                                var8--;
                                class109 var206 = class13.field206[var8];
                                class109 var207 = class184.method1245(-13, var206.method786(-30593));
                                boolean var208 = false;
                                for (int var209 = 0; var209 < var206.method786(-30593); var209++) {
                                    int var210 = var206.method779(109, var209);
                                    if (var210 == 60) {
                                        var208 = true;
                                    } else if (var210 == 62) {
                                        var208 = false;
                                    } else if (!var208) {
                                        var207.method802(-64, var210);
                                    }
                                }
                                var207.method791(18879);
                                class13.field206[var8++] = var207;
                                continue;
                            }
                            if (var316 == 4120) {
                                var6 -= 2;
                                var8--;
                                class109 var211 = class13.field206[var8];
                                int var212 = class103.field2026[var6 + 1];
                                int var213 = class103.field2026[var6];
                                class103.field2026[var6++] = var211.method783(var213, (byte) 102, var212);
                                continue;
                            }
                            if (var316 == 4121) {
                                var8 -= 2;
                                class109 var214 = class13.field206[var8];
                                class109 var215 = class13.field206[var8 + 1];
                                var6--;
                                int var216 = class103.field2026[var6];
                                class103.field2026[var6++] = var214.method804(-42, var216, var215);
                                continue;
                            }
                        } else if (var316 < 4300) {
                            if (var316 == 4200) {
                                var6--;
                                int var130 = class103.field2026[var6];
                                class13.field206[var8++] = class128.method926(var130, -4).field1644;
                                continue;
                            }
                            if (var316 == 4201) {
                                var6 -= 2;
                                int var131 = class103.field2026[var6 + 1];
                                int var132 = class103.field2026[var6];
                                class83 var133 = class128.method926(var132, -4);
                                if (var131 >= 1 && var131 <= 5 && var133.field1679[var131 - 1] != null) {
                                    class13.field206[var8++] = var133.field1679[var131 - 1];
                                    continue;
                                }
                                class13.field206[var8++] = class53.field1074;
                                continue;
                            }
                            if (var316 == 4202) {
                                var6 -= 2;
                                int var134 = class103.field2026[var6];
                                int var135 = class103.field2026[var6 + 1];
                                class83 var136 = class128.method926(var134, -4);
                                if (var135 >= 1 && var135 <= 5 && var136.field1681[var135 - 1] != null) {
                                    class13.field206[var8++] = var136.field1681[var135 - 1];
                                    continue;
                                }
                                class13.field206[var8++] = class53.field1074;
                                continue;
                            }
                            if (var316 == 4203) {
                                var6--;
                                int var137 = class103.field2026[var6];
                                class103.field2026[var6++] = class128.method926(var137, -4).field1659;
                                continue;
                            }
                            if (var316 == 4204) {
                                var6--;
                                int var138 = class103.field2026[var6];
                                class103.field2026[var6++] = class128.method926(var138, -4).field1635 == 1 ? 1 : 0;
                                continue;
                            }
                            if (var316 == 4205) {
                                var6--;
                                int var139 = class103.field2026[var6];
                                class83 var140 = class128.method926(var139, -4);
                                if (var140.field1670 == -1 && var140.field1641 >= 0) {
                                    class103.field2026[var6++] = var140.field1641;
                                    continue;
                                }
                                class103.field2026[var6++] = var139;
                                continue;
                            }
                            if (var316 == 4206) {
                                var6--;
                                int var141 = class103.field2026[var6];
                                class83 var142 = class128.method926(var141, -4);
                                if (var142.field1670 >= 0 && var142.field1641 >= 0) {
                                    class103.field2026[var6++] = var142.field1641;
                                    continue;
                                }
                                class103.field2026[var6++] = var141;
                                continue;
                            }
                            if (var316 == 4207) {
                                var6--;
                                int var143 = class103.field2026[var6];
                                class103.field2026[var6++] = class128.method926(var143, -4).field1642 ? 1 : 0;
                                continue;
                            }
                            if (var316 == 4210) {
                                var8--;
                                class109 var144 = class13.field206[var8];
                                var6--;
                                int var145 = class103.field2026[var6];
                                class10.method60(var145 == 1, var144, (byte) 127);
                                class103.field2026[var6++] = class13.field203;
                                continue;
                            }
                            if (var316 == 4211) {
                                if (class39.field838 != null && class161.field3021 < class13.field203) {
                                    class103.field2026[var6++] = class170.method1140(65535, class39.field838[class161.field3021++]);
                                    continue;
                                }
                                class103.field2026[var6++] = -1;
                                continue;
                            }
                            if (var316 == 4212) {
                                class161.field3021 = 0;
                                continue;
                            }
                        } else if (var316 < 5100) {
                            if (var316 == 5000) {
                                class103.field2026[var6++] = class82.field1627;
                                continue;
                            }
                            if (var316 == 5001) {
                                class67.field1302++;
                                var6 -= 3;
                                class82.field1627 = class103.field2026[var6];
                                class144.field2783 = class103.field2026[var6 + 1];
                                class12.field181 = class103.field2026[var6 + 2];
                                class200.field3850.method1339((byte) 101, 42);
                                class200.field3850.method568(-13488, class82.field1627);
                                class200.field3850.method568(-13488, class144.field2783);
                                class200.field3850.method568(-13488, class12.field181);
                                continue;
                            }
                            if (var316 == 5002) {
                                class109.field2165++;
                                var6 -= 2;
                                int var146 = class103.field2026[var6];
                                var8--;
                                class109 var147 = class13.field206[var8];
                                int var148 = class103.field2026[var6 + 1];
                                class200.field3850.method1339((byte) 107, 165);
                                class200.field3850.method592(var147.method784(arg0), -562765672);
                                class200.field3850.method568(-13488, var146 - 1);
                                class200.field3850.method568(-13488, var148);
                                continue;
                            }
                            if (var316 == 5003) {
                                var6--;
                                int var149 = class103.field2026[var6];
                                class109 var150 = null;
                                if (var149 < 100) {
                                    var150 = class88.field1841[var149];
                                }
                                if (var150 == null) {
                                    var150 = class53.field1074;
                                }
                                class13.field206[var8++] = var150;
                                continue;
                            }
                            if (var316 == 5004) {
                                int var151 = -1;
                                var6--;
                                int var152 = class103.field2026[var6];
                                if (var152 < 100 && class88.field1841[var152] != null) {
                                    var151 = class106.field2109[var152];
                                }
                                class103.field2026[var6++] = var151;
                                continue;
                            }
                            if (var316 == 5005) {
                                class103.field2026[var6++] = class144.field2783;
                                continue;
                            }
                            if (var316 == 5008) {
                                var8--;
                                class109 var153 = class13.field206[var8];
                                if (var153.method793((byte) -122, class130.field2519)) {
                                    class162.method1103(var153, 4);
                                } else {
                                    class41.field864++;
                                    class109 var154 = var153.method776(-10180);
                                    byte var155 = 0;
                                    byte var156 = 0;
                                    if (var154.method793((byte) -93, class137.field2654)) {
                                        var153 = var153.method798(-41, class137.field2654.method786(-30593));
                                        var155 = 0;
                                    } else if (var154.method793((byte) -70, class157.field2957)) {
                                        var155 = 1;
                                        var153 = var153.method798(-41, class157.field2957.method786(-30593));
                                    } else if (var154.method793((byte) -111, class53.field1071)) {
                                        var155 = 2;
                                        var153 = var153.method798(-41, class53.field1071.method786(-30593));
                                    } else if (var154.method793((byte) -74, class67.field1299)) {
                                        var153 = var153.method798(-41, class67.field1299.method786(-30593));
                                        var155 = 3;
                                    } else if (var154.method793((byte) -114, class107.field2119)) {
                                        var155 = 4;
                                        var153 = var153.method798(-41, class107.field2119.method786(-30593));
                                    } else if (var154.method793((byte) -89, class22.field493)) {
                                        var155 = 5;
                                        var153 = var153.method798(-41, class22.field493.method786(-30593));
                                    } else if (var154.method793((byte) -114, class85.field1740)) {
                                        var155 = 6;
                                        var153 = var153.method798(-41, class85.field1740.method786(-30593));
                                    } else if (var154.method793((byte) -92, class156.field2943)) {
                                        var155 = 7;
                                        var153 = var153.method798(-41, class156.field2943.method786(-30593));
                                    } else if (var154.method793((byte) -73, class52.field1066)) {
                                        var155 = 8;
                                        var153 = var153.method798(-41, class52.field1066.method786(-30593));
                                    } else if (var154.method793((byte) -68, class210.field4095)) {
                                        var155 = 9;
                                        var153 = var153.method798(-41, class210.field4095.method786(-30593));
                                    } else if (var154.method793((byte) -104, class4.field42)) {
                                        var153 = var153.method798(-41, class4.field42.method786(-30593));
                                        var155 = 10;
                                    } else if (var154.method793((byte) -112, class77.field1474)) {
                                        var153 = var153.method798(-41, class77.field1474.method786(-30593));
                                        var155 = 11;
                                    } else if (class49.field1011 != 0) {
                                        if (var154.method793((byte) -119, class137.field2659)) {
                                            var153 = var153.method798(-41, class137.field2659.method786(-30593));
                                            var155 = 0;
                                        } else if (var154.method793((byte) -126, class157.field2960)) {
                                            var153 = var153.method798(-41, class157.field2960.method786(-30593));
                                            var155 = 1;
                                        } else if (var154.method793((byte) -83, class53.field1070)) {
                                            var155 = 2;
                                            var153 = var153.method798(-41, class53.field1070.method786(-30593));
                                        } else if (var154.method793((byte) -98, class67.field1298)) {
                                            var155 = 3;
                                            var153 = var153.method798(-41, class67.field1298.method786(-30593));
                                        } else if (var154.method793((byte) -68, class107.field2118)) {
                                            var155 = 4;
                                            var153 = var153.method798(-41, class107.field2118.method786(-30593));
                                        } else if (var154.method793((byte) -92, class22.field496)) {
                                            var155 = 5;
                                            var153 = var153.method798(-41, class22.field496.method786(-30593));
                                        } else if (var154.method793((byte) -95, class85.field1739)) {
                                            var153 = var153.method798(-41, class85.field1739.method786(-30593));
                                            var155 = 6;
                                        } else if (var154.method793((byte) -111, class156.field2935)) {
                                            var155 = 7;
                                            var153 = var153.method798(-41, class156.field2935.method786(-30593));
                                        } else if (var154.method793((byte) -69, class52.field1050)) {
                                            var153 = var153.method798(-41, class52.field1050.method786(-30593));
                                            var155 = 8;
                                        } else if (var154.method793((byte) -116, class210.field4090)) {
                                            var155 = 9;
                                            var153 = var153.method798(-41, class210.field4090.method786(-30593));
                                        } else if (var154.method793((byte) -71, class4.field60)) {
                                            var155 = 10;
                                            var153 = var153.method798(-41, class4.field60.method786(-30593));
                                        } else if (var154.method793((byte) -75, class77.field1472)) {
                                            var155 = 11;
                                            var153 = var153.method798(-41, class77.field1472.method786(-30593));
                                        }
                                    }
                                    class109 var157 = var153.method776(-10180);
                                    if (var157.method793((byte) -114, class68.field1318)) {
                                        var153 = var153.method798(-41, class68.field1318.method786(-30593));
                                        var156 = 1;
                                    } else if (var157.method793((byte) -97, class138.field2677)) {
                                        var156 = 2;
                                        var153 = var153.method798(-41, class138.field2677.method786(-30593));
                                    } else if (var157.method793((byte) -127, class113.field2235)) {
                                        var153 = var153.method798(-41, class113.field2235.method786(-30593));
                                        var156 = 3;
                                    } else if (var157.method793((byte) -97, class116.field2302)) {
                                        var153 = var153.method798(-41, class116.field2302.method786(-30593));
                                        var156 = 4;
                                    } else if (var157.method793((byte) -101, class178.field3371)) {
                                        var156 = 5;
                                        var153 = var153.method798(-41, class178.field3371.method786(-30593));
                                    } else if (class49.field1011 != 0) {
                                        if (var157.method793((byte) -90, class68.field1330)) {
                                            var153 = var153.method798(-41, class68.field1330.method786(-30593));
                                            var156 = 1;
                                        } else if (var157.method793((byte) -73, class138.field2662)) {
                                            var156 = 2;
                                            var153 = var153.method798(-41, class138.field2662.method786(-30593));
                                        } else if (var157.method793((byte) -120, class113.field2243)) {
                                            var153 = var153.method798(-41, class113.field2243.method786(-30593));
                                            var156 = 3;
                                        } else if (var157.method793((byte) -73, class116.field2301)) {
                                            var153 = var153.method798(-41, class116.field2301.method786(-30593));
                                            var156 = 4;
                                        } else if (var157.method793((byte) -94, class178.field3348)) {
                                            var153 = var153.method798(-41, class178.field3348.method786(-30593));
                                            var156 = 5;
                                        }
                                    }
                                    class200.field3850.method1339((byte) 93, 218);
                                    class200.field3850.method568(-13488, 0);
                                    int var158 = class200.field3850.field1773;
                                    class200.field3850.method568(-13488, var155);
                                    class200.field3850.method568(-13488, var156);
                                    class169.method1133(class200.field3850, true, var153);
                                    class200.field3850.method565(class200.field3850.field1773 - var158, -124);
                                }
                                continue;
                            }
                            if (var316 == 5009) {
                                class143.field2763++;
                                var8 -= 2;
                                class109 var159 = class13.field206[var8 + 1];
                                class109 var160 = class13.field206[var8];
                                class200.field3850.method1339((byte) 98, 178);
                                class200.field3850.method568(-13488, 0);
                                int var161 = class200.field3850.field1773;
                                class200.field3850.method592(var160.method784(false), -562765672);
                                class169.method1133(class200.field3850, !arg0, var159);
                                class200.field3850.method565(class200.field3850.field1773 - var161, -70);
                                continue;
                            }
                            if (var316 == 5010) {
                                var6--;
                                int var162 = class103.field2026[var6];
                                class109 var163 = null;
                                if (var162 < 100) {
                                    var163 = class116.field2303[var162];
                                }
                                if (var163 == null) {
                                    var163 = class53.field1074;
                                }
                                class13.field206[var8++] = var163;
                                continue;
                            }
                            if (var316 == 5011) {
                                var6--;
                                int var164 = class103.field2026[var6];
                                class109 var165 = null;
                                if (var164 < 100) {
                                    var165 = class75.field1450[var164];
                                }
                                if (var165 == null) {
                                    var165 = class53.field1074;
                                }
                                class13.field206[var8++] = var165;
                                continue;
                            }
                            if (var316 == 5015) {
                                class109 var166;
                                if (class157.field2955 == null || class157.field2955.field3455 == null) {
                                    var166 = class145.field2787;
                                } else {
                                    var166 = class157.field2955.field3455;
                                }
                                class13.field206[var8++] = var166;
                                continue;
                            }
                            if (var316 == 5016) {
                                class103.field2026[var6++] = class12.field181;
                                continue;
                            }
                            if (var316 == 5017) {
                                class103.field2026[var6++] = class5.field78;
                                continue;
                            }
                        }
                    }
                    throw new IllegalStateException();
                }
            }
        } catch (Exception var315) {
            if (var5.field3710 == null) {
                if (class29.field635 != 0) {
                    class98.method690(class53.field1074, arg0, class76.field1459, 0);
                }
                class9.method43("CS2 - scr:" + var5.field1381 + " op:" + var10, -38, var315);
            } else {
                class109 var312 = class184.method1245(-13, 30);
                var312.method795(class160.field2999, -102).method795(var5.field3710, -126);
                for (int var313 = class72.field1403 - 1; var313 >= 0; var313--) {
                    var312.method795(class137.field2657, -57).method795(class137.field2645[var313].field968.field3710, -118);
                }
                if (var10 == 40) {
                    int var314 = var9[var11];
                    var312.method795(class38.field820, -56).method795(class52.method345((byte) 85, var314), -112);
                }
                if (class29.field635 != 0) {
                    class98.method690(class53.field1074, false, class36.method279(new class109[] { class165.field3104, var5.field3710 }, 127), 0);
                }
                class9.method43("CS2 - scr:" + var5.field1381 + " op:" + var10 + new String(var312.method807((byte) 62)), -111, var315);
            }
        }
    }

    @OriginalMember(owner = "of", name = "a", descriptor = "(BJ)Llf;")
    public static final class109 method981(byte arg0, long arg1) {
        field2629++;
        int var3 = -15 / ((arg0 - 19) / 60);
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if (arg1 % 37L == 0L) {
            return null;
        } else {
            long var4 = arg1;
            int var6 = 0;
            while (var4 != 0L) {
                var6++;
                var4 /= 37L;
            }
            byte[] var7 = new byte[var6];
            while (arg1 != 0L) {
                long var9 = arg1;
                arg1 /= 37L;
                var6--;
                var7[var6] = class107.field2114[(int) (var9 - arg1 * 37L)];
            }
            class109 var8 = new class109();
            var8.field2182 = var7;
            var8.field2176 = var7.length;
            return var8;
        }
    }
}
