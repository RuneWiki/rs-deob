import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class286 {

    @OriginalMember(owner = "client!kc", name = "j", descriptor = "Ljava/lang/String;")
    public static String field4591 = " more options";

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "I")
    public static int field4586 = 0;

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "[I")
    public static int[] field4584 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2, 0, 0, 1, 0 };

    @OriginalMember(owner = "client!kc", name = "i", descriptor = "[[Z")
    public static boolean[][] field4590 = new boolean[][] { { true, true, true }, { false, false }, { false, true }, { true, false }, { false, true, true }, { true, false, true }, { false, true, false }, { true, false, false } };

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "I")
    public static int field4582;

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "I")
    public static int field4583;

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "I")
    public static int field4585;

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "I")
    public static int field4587;

    @OriginalMember(owner = "client!kc", name = "g", descriptor = "I")
    public static int field4588;

    @OriginalMember(owner = "client!kc", name = "h", descriptor = "Lvb;")
    public static class182 field4589;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;II)V", line = 14)
    private static final void method2055(String arg0, String arg1, int arg2, int arg3) {
        field4585++;
        class338.field5272 = arg1;
        class256.field4100 = arg3;
        class201.field3275 = arg0;
        if (class201.field3275.equals("") || class338.field5272.equals("")) {
            class39.field514 = 3;
        } else if (class21.field306 == -1) {
            class145.field2254 = 1;
            class39.field514 = -3;
            class246.field3889 = 0;
            class10.field128 = 0;
            class44 var4 = new class44(128);
            var4.method257(-2, 10);
            var4.method283((byte) -51, (int) (Math.random() * 9.9999999E7D));
            var4.method255(false, class204.method1491(-26916, class201.field3275));
            var4.method283((byte) -51, (int) (Math.random() * 9.9999999E7D));
            var4.method231(23573, class338.field5272);
            var4.method283((byte) -51, (int) (Math.random() * 9.9999999E7D));
            var4.method222((byte) 108, class151.field2330, class280.field4514);
            class194.field3175.field586 = 0;
            class194.field3175.method257(-2, 24);
            class194.field3175.method257(-2, var4.field586 + 2);
            class194.field3175.method287(0, 540);
            class194.field3175.method244(var4.field586, (byte) 117, var4.field573, 0);
            if (arg2 < 46) {
                method2057(126);
            }
        } else {
            class62.method420(1);
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)V", line = 64)
    public static final void method2056(int arg0) {
        for (int var1 = 0; var1 < class233.field3736; var1++) {
            int var2 = class142.field2225[var1];
            class234 var3 = class99.field1445[var2];
            if (var3 != null) {
                class4.method24(var3, var3.field3752.field4051, (byte) 39);
            }
        }
        if (arg0 > -39) {
            field4584 = (int[]) null;
        }
        field4588++;
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(I)V", line = 91)
    public static void method2057(int arg0) {
        field4584 = null;
        field4590 = (boolean[][]) null;
        if (arg0 == 0) {
            field4589 = null;
            field4591 = null;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IILmm;)V", line = 106)
    public static final void method2058(int arg0, int arg1, class39 arg2) {
        field4587++;
        Object[] var3 = arg2.field501;
        int var4 = (Integer) var3[0];
        class335 var5 = class335.method2342(-1, var4);
        if (var5 == null) {
            return;
        }
        int var6 = 0;
        class151.field2338 = 0;
        int var7 = -1;
        int var8 = 0;
        int[] var9 = var5.field5240;
        int[] var10 = var5.field5246;
        byte var11 = -1;
        try {
            int var12 = 0;
            class14.field165 = new String[var5.field5244];
            class93.field1281 = new int[var5.field5237];
            int var13 = 0;
            for (int var14 = 1; var14 < var3.length; var14++) {
                if (var3[var14] instanceof Integer) {
                    int var15 = (Integer) var3[var14];
                    if (var15 == -2147483647) {
                        var15 = arg2.field516;
                    }
                    if (var15 == -2147483646) {
                        var15 = arg2.field498;
                    }
                    if (var15 == -2147483645) {
                        var15 = arg2.field500 == null ? -1 : arg2.field500.field2486;
                    }
                    if (var15 == -2147483644) {
                        var15 = arg2.field510;
                    }
                    if (var15 == -2147483643) {
                        var15 = arg2.field500 == null ? -1 : arg2.field500.field2482;
                    }
                    if (var15 == -2147483642) {
                        var15 = arg2.field499 == null ? -1 : arg2.field499.field2486;
                    }
                    if (var15 == -2147483641) {
                        var15 = arg2.field499 == null ? -1 : arg2.field499.field2482;
                    }
                    if (var15 == -2147483640) {
                        var15 = arg2.field513;
                    }
                    if (var15 == -2147483639) {
                        var15 = arg2.field507;
                    }
                    class93.field1281[var12++] = var15;
                } else if (var3[var14] instanceof String) {
                    String var16 = (String) var3[var14];
                    if (var16.equals("event_opbase")) {
                        var16 = arg2.field515;
                    }
                    class14.field165[var13++] = var16;
                }
            }
            int var17 = 0;
            label4438: while (true) {
                var17++;
                if (var17 > arg0) {
                    throw new RuntimeException("slow");
                }
                var7++;
                int var528 = var9[var7];
                if (var528 < 100) {
                    if (var528 == 0) {
                        class253.field4036[var6++] = var10[var7];
                        continue;
                    }
                    if (var528 == 1) {
                        int var18 = var10[var7];
                        class253.field4036[var6++] = class70.field991[var18];
                        continue;
                    }
                    if (var528 == 2) {
                        int var19 = var10[var7];
                        var6--;
                        class186.method1391(var19, -26, class253.field4036[var6]);
                        continue;
                    }
                    if (var528 == 3) {
                        class276.field4458[var8++] = var5.field5242[var7];
                        continue;
                    }
                    if (var528 == 6) {
                        var7 += var10[var7];
                        continue;
                    }
                    if (var528 == 7) {
                        var6 -= 2;
                        if (class253.field4036[var6 + 1] != class253.field4036[var6]) {
                            var7 += var10[var7];
                        }
                        continue;
                    }
                    if (var528 == 8) {
                        var6 -= 2;
                        if (class253.field4036[var6 + 1] == class253.field4036[var6]) {
                            var7 += var10[var7];
                        }
                        continue;
                    }
                    if (var528 == 9) {
                        var6 -= 2;
                        if (class253.field4036[var6 + 1] > class253.field4036[var6]) {
                            var7 += var10[var7];
                        }
                        continue;
                    }
                    if (var528 == 10) {
                        var6 -= 2;
                        if (class253.field4036[var6] > class253.field4036[var6 + 1]) {
                            var7 += var10[var7];
                        }
                        continue;
                    }
                    if (var528 == 21) {
                        if (class151.field2338 == 0) {
                            return;
                        }
                        class258 var20 = class101.field1474[--class151.field2338];
                        class93.field1281 = var20.field4135;
                        var5 = var20.field4138;
                        var10 = var5.field5246;
                        var7 = var20.field4141;
                        var9 = var5.field5240;
                        class14.field165 = var20.field4133;
                        continue;
                    }
                    if (var528 == 25) {
                        int var21 = var10[var7];
                        class253.field4036[var6++] = class174.method1311(var21, (byte) 118);
                        continue;
                    }
                    if (var528 == 27) {
                        int var22 = var10[var7];
                        var6--;
                        class325.method2275((byte) -23, var22, class253.field4036[var6]);
                        continue;
                    }
                    if (var528 == 31) {
                        var6 -= 2;
                        if (class253.field4036[var6 + 1] >= class253.field4036[var6]) {
                            var7 += var10[var7];
                        }
                        continue;
                    }
                    if (var528 == 32) {
                        var6 -= 2;
                        if (class253.field4036[var6] >= class253.field4036[var6 + 1]) {
                            var7 += var10[var7];
                        }
                        continue;
                    }
                    if (var528 == 33) {
                        class253.field4036[var6++] = class93.field1281[var10[var7]];
                        continue;
                    }
                    int var10001;
                    if (var528 == 34) {
                        var10001 = var10[var7];
                        var6--;
                        class93.field1281[var10001] = class253.field4036[var6];
                        continue;
                    }
                    if (var528 == 35) {
                        class276.field4458[var8++] = class14.field165[var10[var7]];
                        continue;
                    }
                    if (var528 == 36) {
                        var10001 = var10[var7];
                        var8--;
                        class14.field165[var10001] = class276.field4458[var8];
                        continue;
                    }
                    if (var528 == 37) {
                        int var23 = var10[var7];
                        var8 -= var23;
                        String var24 = class209.method1515(true, class276.field4458, var23, var8);
                        class276.field4458[var8++] = var24;
                        continue;
                    }
                    if (var528 == 38) {
                        var6--;
                        continue;
                    }
                    if (var528 == 39) {
                        var8--;
                        continue;
                    }
                    if (var528 == 40) {
                        int var25 = var10[var7];
                        class335 var26 = class335.method2342(-1, var25);
                        int[] var27 = new int[var26.field5237];
                        String[] var28 = new String[var26.field5244];
                        for (int var29 = 0; var29 < var26.field5241; var29++) {
                            var27[var29] = class253.field4036[var6 + var29 - var26.field5241];
                        }
                        for (int var30 = 0; var30 < var26.field5239; var30++) {
                            var28[var30] = class276.field4458[var8 + var30 - var26.field5239];
                        }
                        var8 -= var26.field5239;
                        var6 -= var26.field5241;
                        class258 var31 = new class258();
                        var31.field4135 = class93.field1281;
                        var31.field4141 = var7;
                        var31.field4133 = class14.field165;
                        var31.field4138 = var5;
                        if (class101.field1474.length <= class151.field2338) {
                            throw new RuntimeException();
                        }
                        var7 = -1;
                        class101.field1474[class151.field2338++] = var31;
                        class93.field1281 = var27;
                        class14.field165 = var28;
                        var5 = var26;
                        var10 = var26.field5246;
                        var9 = var26.field5240;
                        continue;
                    }
                    if (var528 == 42) {
                        class253.field4036[var6++] = class76.field1066[var10[var7]];
                        continue;
                    }
                    if (var528 == 43) {
                        int var32 = var10[var7];
                        var6--;
                        class76.field1066[var32] = class253.field4036[var6];
                        class10.method55((byte) 119, var32);
                        continue;
                    }
                    if (var528 == 44) {
                        int var33 = var10[var7] >> 16;
                        var6--;
                        int var34 = class253.field4036[var6];
                        int var35 = var10[var7] & 0xFFFF;
                        if (var34 >= 0 && var34 <= 5000) {
                            class258.field4137[var33] = var34;
                            byte var36 = -1;
                            if (var35 == 105) {
                                var36 = 0;
                            }
                            int var37 = 0;
                            while (true) {
                                if (var34 <= var37) {
                                    continue label4438;
                                }
                                class166.field2762[var33][var37] = var36;
                                var37++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var528 == 45) {
                        var6--;
                        int var38 = class253.field4036[var6];
                        int var39 = var10[var7];
                        if (var38 >= 0 && class258.field4137[var39] > var38) {
                            class253.field4036[var6++] = class166.field2762[var39][var38];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var528 == 46) {
                        var6 -= 2;
                        int var40 = var10[var7];
                        int var41 = class253.field4036[var6];
                        if (var41 >= 0 && class258.field4137[var40] > var41) {
                            class166.field2762[var40][var41] = class253.field4036[var6 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var528 == 47) {
                        String var42 = class335.field5236[var10[var7]];
                        if (var42 == null) {
                            var42 = "null";
                        }
                        class276.field4458[var8++] = var42;
                        continue;
                    }
                    if (var528 == 48) {
                        int var43 = var10[var7];
                        var8--;
                        class335.field5236[var43] = class276.field4458[var8];
                        class315.method2213((byte) -101, var43);
                        continue;
                    }
                    if (var528 == 51) {
                        class69 var44 = var5.field5229[var10[var7]];
                        var6--;
                        class174 var45 = (class174) var44.method451((long) class253.field4036[var6], (byte) 100);
                        if (var45 != null) {
                            var7 += var45.field2881;
                        }
                        continue;
                    }
                }
                boolean var46;
                if (var10[var7] == 1) {
                    var46 = true;
                } else {
                    var46 = false;
                }
                if (var528 < 300) {
                    if (var528 == 100) {
                        var6 -= 3;
                        int var47 = class253.field4036[var6 + 2];
                        int var48 = class253.field4036[var6 + 1];
                        int var49 = class253.field4036[var6];
                        if (var48 == 0) {
                            throw new RuntimeException();
                        }
                        class157 var50 = class142.method1053(var49, 65535);
                        if (var50.field2472 == null) {
                            var50.field2472 = new class157[var47 + 1];
                        }
                        if (var47 >= var50.field2472.length) {
                            class157[] var51 = new class157[var47 + 1];
                            for (int var52 = 0; var52 < var50.field2472.length; var52++) {
                                var51[var52] = var50.field2472[var52];
                            }
                            var50.field2472 = var51;
                        }
                        if (var47 > 0 && var50.field2472[var47 - 1] == null) {
                            throw new RuntimeException("Gap at:" + (var47 - 1));
                        }
                        class157 var53 = new class157();
                        var53.field2478 = var48;
                        var53.field2463 = var53.field2486 = var50.field2486;
                        var53.field2482 = var47;
                        var53.field2421 = true;
                        var50.field2472[var47] = var53;
                        if (var46) {
                            class151.field2340 = var53;
                        } else {
                            class261.field4166 = var53;
                        }
                        class320.method2252(var50, 0);
                        continue;
                    }
                    if (var528 == 101) {
                        class157 var54 = var46 ? class151.field2340 : class261.field4166;
                        if (var54.field2482 == -1) {
                            if (!var46) {
                                throw new RuntimeException("Tried to cc_delete static active-component!");
                            }
                            throw new RuntimeException("Tried to .cc_delete static .active-component!");
                        }
                        class157 var55 = class142.method1053(var54.field2486, 65535);
                        var55.field2472[var54.field2482] = null;
                        class320.method2252(var55, 0);
                        continue;
                    }
                    if (var528 == 102) {
                        var6--;
                        class157 var56 = class142.method1053(class253.field4036[var6], 65535);
                        var56.field2472 = null;
                        class320.method2252(var56, 0);
                        continue;
                    }
                    if (var528 == 200) {
                        var6 -= 2;
                        int var57 = class253.field4036[var6];
                        int var58 = class253.field4036[var6 + 1];
                        class157 var59 = class275.method1996(102, var58, var57);
                        if (var59 != null && var58 != -1) {
                            class253.field4036[var6++] = 1;
                            if (var46) {
                                class151.field2340 = var59;
                            } else {
                                class261.field4166 = var59;
                            }
                            continue;
                        }
                        class253.field4036[var6++] = 0;
                        continue;
                    }
                    if (var528 == 201) {
                        var6--;
                        int var60 = class253.field4036[var6];
                        class157 var61 = class142.method1053(var60, 65535);
                        if (var61 == null) {
                            class253.field4036[var6++] = 0;
                        } else {
                            class253.field4036[var6++] = 1;
                            if (var46) {
                                class151.field2340 = var61;
                            } else {
                                class261.field4166 = var61;
                            }
                        }
                        continue;
                    }
                } else if (var528 < 500) {
                    if (var528 == 403) {
                        var6 -= 2;
                        int var62 = class253.field4036[var6 + 1];
                        int var63 = class253.field4036[var6];
                        for (int var64 = 0; var64 < class144.field2244.length; var64++) {
                            if (class144.field2244[var64] == var63) {
                                class191.field3129.field5224.method731(var62, (byte) -74, var64);
                                continue label4438;
                            }
                        }
                        int var65 = 0;
                        while (true) {
                            if (class236.field3789.length <= var65) {
                                continue label4438;
                            }
                            if (class236.field3789[var65] == var63) {
                                class191.field3129.field5224.method731(var62, (byte) -74, var65);
                                continue label4438;
                            }
                            var65++;
                        }
                    }
                    if (var528 == 404) {
                        var6 -= 2;
                        int var66 = class253.field4036[var6];
                        int var67 = class253.field4036[var6 + 1];
                        class191.field3129.field5224.method723(var67, var66, -20990);
                        continue;
                    }
                    if (var528 == 410) {
                        var6--;
                        boolean var68 = class253.field4036[var6] != 0;
                        class191.field3129.field5224.method721(var68, -2898);
                        continue;
                    }
                } else if (var528 >= 1000 && var528 < 1100 || var528 >= 2000 && var528 < 2100) {
                    class157 var69;
                    if (var528 >= 2000) {
                        var528 -= 1000;
                        var6--;
                        var69 = class142.method1053(class253.field4036[var6], 65535);
                    } else {
                        var69 = var46 ? class151.field2340 : class261.field4166;
                    }
                    if (var528 == 1000) {
                        var6 -= 4;
                        var69.field2461 = class253.field4036[var6];
                        var69.field2469 = class253.field4036[var6 + 1];
                        int var70 = class253.field4036[var6 + 2];
                        int var71 = class253.field4036[var6 + 3];
                        if (var71 < 0) {
                            var71 = 0;
                        } else if (var71 > 5) {
                            var71 = 5;
                        }
                        if (var70 < 0) {
                            var70 = 0;
                        } else if (var70 > 5) {
                            var70 = 5;
                        }
                        var69.field2431 = (byte) var71;
                        var69.field2560 = (byte) var70;
                        class320.method2252(var69, 0);
                        class204.method1487(var69, 0);
                        if (var69.field2482 == -1) {
                            class277.method2006(var69.field2486, (byte) -34);
                        }
                        continue;
                    }
                    if (var528 == 1001) {
                        var6 -= 4;
                        var69.field2428 = class253.field4036[var6];
                        var69.field2424 = class253.field4036[var6 + 1];
                        var69.field2548 = 0;
                        var69.field2464 = 0;
                        int var72 = class253.field4036[var6 + 2];
                        if (var72 < 0) {
                            var72 = 0;
                        } else if (var72 > 4) {
                            var72 = 4;
                        }
                        int var73 = class253.field4036[var6 + 3];
                        if (var73 < 0) {
                            var73 = 0;
                        } else if (var73 > 4) {
                            var73 = 4;
                        }
                        var69.field2543 = (byte) var72;
                        var69.field2438 = (byte) var73;
                        class320.method2252(var69, 0);
                        class204.method1487(var69, 0);
                        if (var69.field2478 == 0) {
                            class109.method758(false, var69, 56);
                        }
                        continue;
                    }
                    if (var528 == 1003) {
                        var6--;
                        boolean var74 = class253.field4036[var6] == 1;
                        if (var74 != var69.field2592) {
                            var69.field2592 = var74;
                            class320.method2252(var69, 0);
                        }
                        if (var69.field2482 == -1) {
                            class300.method2144(-9, var69.field2486);
                        }
                        continue;
                    }
                    if (var528 == 1004) {
                        var6 -= 2;
                        var69.field2569 = class253.field4036[var6];
                        var69.field2541 = class253.field4036[var6 + 1];
                        class320.method2252(var69, 0);
                        class204.method1487(var69, 0);
                        if (var69.field2478 == 0) {
                            class109.method758(false, var69, 63);
                        }
                        continue;
                    }
                    if (var528 == 1005) {
                        var6--;
                        var69.field2422 = class253.field4036[var6] == 1;
                        continue;
                    }
                } else if (var528 >= 1100 && var528 < 1200 || var528 >= 2100 && var528 < 2200) {
                    class157 var75;
                    if (var528 >= 2000) {
                        var528 -= 1000;
                        var6--;
                        var75 = class142.method1053(class253.field4036[var6], 65535);
                    } else {
                        var75 = var46 ? class151.field2340 : class261.field4166;
                    }
                    if (var528 == 1100) {
                        var6 -= 2;
                        var75.field2499 = class253.field4036[var6];
                        if (var75.field2499 > var75.field2597 - var75.field2468) {
                            var75.field2499 = var75.field2597 - var75.field2468;
                        }
                        if (var75.field2499 < 0) {
                            var75.field2499 = 0;
                        }
                        var75.field2591 = class253.field4036[var6 + 1];
                        if (var75.field2591 > var75.field2528 - var75.field2520) {
                            var75.field2591 = var75.field2528 - var75.field2520;
                        }
                        if (var75.field2591 < 0) {
                            var75.field2591 = 0;
                        }
                        class320.method2252(var75, 0);
                        if (var75.field2482 == -1) {
                            class344.method2387(var75.field2486, (byte) -93);
                        }
                        continue;
                    }
                    if (var528 == 1101) {
                        var6--;
                        var75.field2436 = class253.field4036[var6];
                        class320.method2252(var75, 0);
                        if (var75.field2482 == -1) {
                            class209.method1516((byte) 122, var75.field2486);
                        }
                        continue;
                    }
                    if (var528 == 1102) {
                        var6--;
                        var75.field2561 = class253.field4036[var6] == 1;
                        class320.method2252(var75, 0);
                        continue;
                    }
                    if (var528 == 1103) {
                        var6--;
                        var75.field2572 = class253.field4036[var6];
                        class320.method2252(var75, 0);
                        continue;
                    }
                    if (var528 == 1104) {
                        var6--;
                        var75.field2453 = class253.field4036[var6];
                        class320.method2252(var75, 0);
                        continue;
                    }
                    if (var528 == 1105) {
                        var6--;
                        var75.field2596 = class253.field4036[var6];
                        class320.method2252(var75, 0);
                        continue;
                    }
                    if (var528 == 1106) {
                        var6--;
                        var75.field2537 = class253.field4036[var6];
                        class320.method2252(var75, 0);
                        continue;
                    }
                    if (var528 == 1107) {
                        var6--;
                        var75.field2456 = class253.field4036[var6] == 1;
                        class320.method2252(var75, 0);
                        continue;
                    }
                    if (var528 == 1108) {
                        var75.field2516 = 1;
                        var6--;
                        var75.field2455 = class253.field4036[var6];
                        class320.method2252(var75, 0);
                        if (var75.field2482 == -1) {
                            class310.method2191(var75.field2486, -2922);
                        }
                        continue;
                    }
                    if (var528 == 1109) {
                        var6 -= 6;
                        var75.field2578 = class253.field4036[var6];
                        var75.field2435 = class253.field4036[var6 + 1];
                        var75.field2492 = class253.field4036[var6 + 2];
                        var75.field2574 = class253.field4036[var6 + 3];
                        var75.field2602 = class253.field4036[var6 + 4];
                        var75.field2449 = class253.field4036[var6 + 5];
                        class320.method2252(var75, 0);
                        if (var75.field2482 == -1) {
                            class295.method2106(var75.field2486, true);
                            class333.method2325((byte) 126, var75.field2486);
                        }
                        continue;
                    }
                    if (var528 == 1110) {
                        var6--;
                        int var76 = class253.field4036[var6];
                        if (var75.field2581 != var76) {
                            var75.field2497 = 0;
                            var75.field2476 = 0;
                            var75.field2581 = var76;
                            var75.field2584 = 1;
                            class320.method2252(var75, 0);
                        }
                        if (var75.field2482 == -1) {
                            class109.method756((byte) -93, var75.field2486);
                        }
                        continue;
                    }
                    if (var528 == 1111) {
                        var6--;
                        var75.field2563 = class253.field4036[var6] == 1;
                        class320.method2252(var75, 0);
                        continue;
                    }
                    if (var528 == 1112) {
                        var8--;
                        String var77 = class276.field4458[var8];
                        if (!var77.equals(var75.field2493)) {
                            var75.field2493 = var77;
                            class320.method2252(var75, 0);
                        }
                        if (var75.field2482 == -1) {
                            class83.method564((byte) -38, var75.field2486);
                        }
                        continue;
                    }
                    if (var528 == 1113) {
                        var6--;
                        var75.field2531 = class253.field4036[var6];
                        class320.method2252(var75, 0);
                        continue;
                    }
                    if (var528 == 1114) {
                        var6 -= 3;
                        var75.field2599 = class253.field4036[var6];
                        var75.field2551 = class253.field4036[var6 + 1];
                        var75.field2498 = class253.field4036[var6 + 2];
                        class320.method2252(var75, 0);
                        continue;
                    }
                    if (var528 == 1115) {
                        var6--;
                        var75.field2587 = class253.field4036[var6] == 1;
                        class320.method2252(var75, 0);
                        continue;
                    }
                    if (var528 == 1116) {
                        var6--;
                        var75.field2503 = class253.field4036[var6];
                        class320.method2252(var75, 0);
                        continue;
                    }
                    if (var528 == 1117) {
                        var6--;
                        var75.field2496 = class253.field4036[var6];
                        class320.method2252(var75, 0);
                        continue;
                    }
                    if (var528 == 1118) {
                        var6--;
                        var75.field2533 = class253.field4036[var6] == 1;
                        class320.method2252(var75, 0);
                        continue;
                    }
                    if (var528 == 1119) {
                        var6--;
                        var75.field2559 = class253.field4036[var6] == 1;
                        class320.method2252(var75, 0);
                        continue;
                    }
                    if (var528 == 1120) {
                        var6 -= 2;
                        var75.field2597 = class253.field4036[var6];
                        var75.field2528 = class253.field4036[var6 + 1];
                        class320.method2252(var75, 0);
                        if (var75.field2478 == 0) {
                            class109.method758(false, var75, 67);
                        }
                        continue;
                    }
                    if (var528 == 1121) {
                        var6 -= 2;
                        var75.field2544 = (short) class253.field4036[var6];
                        var75.field2526 = (short) class253.field4036[var6 + 1];
                        class320.method2252(var75, 0);
                        continue;
                    }
                    if (var528 == 1122) {
                        var6--;
                        var75.field2557 = class253.field4036[var6] == 1;
                        class320.method2252(var75, 0);
                        continue;
                    }
                    if (var528 == 1123) {
                        var6--;
                        var75.field2449 = class253.field4036[var6];
                        class320.method2252(var75, 0);
                        if (var75.field2482 == -1) {
                            class295.method2106(var75.field2486, true);
                        }
                        continue;
                    }
                    if (var528 == 1124) {
                        var6--;
                        int var78 = class253.field4036[var6];
                        var75.field2601 = var78 == 1;
                        class320.method2252(var75, 0);
                        continue;
                    }
                } else if (!(var528 < 1200 || var528 >= 1300) || !(var528 < 2200 || var528 >= 2300)) {
                    class157 var79;
                    if (var528 >= 2000) {
                        var528 -= 1000;
                        var6--;
                        var79 = class142.method1053(class253.field4036[var6], 65535);
                    } else {
                        var79 = var46 ? class151.field2340 : class261.field4166;
                    }
                    class320.method2252(var79, 0);
                    if (var528 == 1200 || var528 == 1205 || var528 == 1208 || var528 == 1209) {
                        var6 -= 2;
                        int var80 = class253.field4036[var6 + 1];
                        int var81 = class253.field4036[var6];
                        if (var79.field2482 == -1) {
                            class20.method110(var79.field2486, (byte) -40);
                            class295.method2106(var79.field2486, true);
                            class333.method2325((byte) 126, var79.field2486);
                        }
                        if (var81 == -1) {
                            var79.field2516 = 1;
                            var79.field2455 = -1;
                            var79.field2487 = -1;
                            continue;
                        }
                        var79.field2593 = var80;
                        if (var528 == 1208 || var528 == 1209) {
                            var79.field2583 = true;
                        } else {
                            var79.field2583 = false;
                        }
                        var79.field2487 = var81;
                        class330 var82 = class285.method2054(var81, 0);
                        var79.field2574 = var82.field5140;
                        var79.field2578 = var82.field5125;
                        var79.field2435 = var82.field5104;
                        var79.field2602 = var82.field5133;
                        if (var528 == 1205) {
                            var79.field2566 = false;
                        } else {
                            var79.field2566 = true;
                        }
                        var79.field2449 = var82.field5138;
                        var79.field2492 = var82.field5089;
                        if (var79.field2464 > 0) {
                            var79.field2449 = var79.field2449 * 32 / var79.field2464;
                        } else if (var79.field2428 > 0) {
                            var79.field2449 = var79.field2449 * 32 / var79.field2428;
                        }
                        continue;
                    }
                    if (var528 == 1201) {
                        var79.field2516 = 2;
                        var6--;
                        var79.field2455 = class253.field4036[var6];
                        if (var79.field2482 == -1) {
                            class310.method2191(var79.field2486, -2922);
                        }
                        continue;
                    }
                    if (var528 == 1202) {
                        var79.field2516 = 3;
                        var79.field2455 = class191.field3129.field5224.method724((byte) 115);
                        if (var79.field2482 == -1) {
                            class310.method2191(var79.field2486, -2922);
                        }
                        continue;
                    }
                    if (var528 == 1203) {
                        var79.field2516 = 6;
                        var6--;
                        var79.field2455 = class253.field4036[var6];
                        if (var79.field2482 == -1) {
                            class310.method2191(var79.field2486, -2922);
                        }
                        continue;
                    }
                    if (var528 == 1204) {
                        var79.field2516 = 5;
                        var6--;
                        var79.field2455 = class253.field4036[var6];
                        if (var79.field2482 == -1) {
                            class310.method2191(var79.field2486, -2922);
                        }
                        continue;
                    }
                    if (var528 == 1206) {
                        var6 -= 4;
                        var79.field2445 = class253.field4036[var6];
                        var79.field2514 = class253.field4036[var6 + 1];
                        var79.field2589 = class253.field4036[var6 + 2];
                        var79.field2562 = class253.field4036[var6 + 3];
                        class320.method2252(var79, 0);
                        continue;
                    }
                    if (var528 == 1207) {
                        var6 -= 2;
                        var79.field2490 = class253.field4036[var6];
                        var79.field2481 = class253.field4036[var6 + 1];
                        class320.method2252(var79, 0);
                        continue;
                    }
                } else if (var528 >= 1300 && var528 < 1400 || var528 >= 2300 && var528 < 2400) {
                    class157 var517;
                    if (var528 >= 2000) {
                        var528 -= 1000;
                        var6--;
                        var517 = class142.method1053(class253.field4036[var6], 65535);
                    } else {
                        var517 = var46 ? class151.field2340 : class261.field4166;
                    }
                    if (var528 == 1300) {
                        var6--;
                        int var518 = class253.field4036[var6] - 1;
                        if (var518 >= 0 && var518 <= 9) {
                            var8--;
                            var517.method1131(class276.field4458[var8], var518, 0);
                            continue;
                        }
                        var8--;
                        continue;
                    }
                    if (var528 == 1301) {
                        var6 -= 2;
                        int var519 = class253.field4036[var6 + 1];
                        int var520 = class253.field4036[var6];
                        var517.field2530 = class275.method1996(-112, var519, var520);
                        continue;
                    }
                    if (var528 == 1302) {
                        var6--;
                        var517.field2585 = class253.field4036[var6] == 1;
                        continue;
                    }
                    if (var528 == 1303) {
                        var6--;
                        var517.field2554 = class253.field4036[var6];
                        continue;
                    }
                    if (var528 == 1304) {
                        var6--;
                        var517.field2523 = class253.field4036[var6];
                        continue;
                    }
                    if (var528 == 1305) {
                        var8--;
                        var517.field2532 = class276.field4458[var8];
                        continue;
                    }
                    if (var528 == 1306) {
                        var8--;
                        var517.field2429 = class276.field4458[var8];
                        continue;
                    }
                    if (var528 == 1307) {
                        var517.field2552 = null;
                        continue;
                    }
                    if (var528 == 1308) {
                        var6--;
                        var517.field2536 = class253.field4036[var6];
                        var6--;
                        var517.field2576 = class253.field4036[var6];
                        continue;
                    }
                    if (var528 == 1309) {
                        var6--;
                        int var521 = class253.field4036[var6];
                        var6--;
                        int var522 = class253.field4036[var6];
                        if (var522 >= 1 && var522 <= 10) {
                            var517.method1122(false, var522 - 1, var521);
                        }
                        continue;
                    }
                    if (var528 == 1310) {
                        var8--;
                        var517.field2460 = class276.field4458[var8];
                        continue;
                    }
                } else {
                    if (var528 >= 1400 && var528 < 1500 || var528 >= 2400 && var528 < 2500) {
                        class157 var510;
                        if (var528 >= 2000) {
                            var528 -= 1000;
                            var6--;
                            var510 = class142.method1053(class253.field4036[var6], 65535);
                        } else {
                            var510 = var46 ? class151.field2340 : class261.field4166;
                        }
                        int[] var511 = null;
                        var8--;
                        String var512 = class276.field4458[var8];
                        if (var512.length() > 0 && var512.charAt(var512.length() - 1) == 'Y') {
                            var6--;
                            int var513 = class253.field4036[var6];
                            if (var513 > 0) {
                                var511 = new int[var513];
                                while ((var513--) > 0) {
                                    var6--;
                                    var511[var513] = class253.field4036[var6];
                                }
                            }
                            var512 = var512.substring(0, var512.length() - 1);
                        }
                        Object[] var514 = new Object[var512.length() + 1];
                        for (int var515 = var514.length - 1; var515 >= 1; var515--) {
                            if (var512.charAt(var515 - 1) == 's') {
                                var8--;
                                var514[var515] = class276.field4458[var8];
                            } else {
                                var6--;
                                var514[var515] = Integer.valueOf(class253.field4036[var6]);
                            }
                        }
                        var6--;
                        int var516 = class253.field4036[var6];
                        if (var516 == -1) {
                            var514 = null;
                        } else {
                            var514[0] = Integer.valueOf(var516);
                        }
                        var510.field2485 = true;
                        if (var528 == 1400) {
                            var510.field2579 = var514;
                        } else if (var528 == 1401) {
                            var510.field2507 = var514;
                        } else if (var528 == 1402) {
                            var510.field2488 = var514;
                        } else if (var528 == 1403) {
                            var510.field2586 = var514;
                        } else if (var528 == 1404) {
                            var510.field2484 = var514;
                        } else if (var528 == 1405) {
                            var510.field2549 = var514;
                        } else if (var528 == 1406) {
                            var510.field2451 = var514;
                        } else if (var528 == 1407) {
                            var510.field2568 = var514;
                            var510.field2556 = var511;
                        } else if (var528 == 1408) {
                            var510.field2577 = var514;
                        } else if (var528 == 1409) {
                            var510.field2564 = var514;
                        } else if (var528 == 1410) {
                            var510.field2501 = var514;
                        } else if (var528 == 1411) {
                            var510.field2500 = var514;
                        } else if (var528 == 1412) {
                            var510.field2505 = var514;
                        } else if (var528 == 1414) {
                            var510.field2423 = var514;
                            var510.field2504 = var511;
                        } else if (var528 == 1415) {
                            var510.field2457 = var511;
                            var510.field2471 = var514;
                        } else if (var528 == 1416) {
                            var510.field2518 = var514;
                        } else if (var528 == 1417) {
                            var510.field2441 = var514;
                        } else if (var528 == 1418) {
                            var510.field2434 = var514;
                        } else if (var528 == 1419) {
                            var510.field2534 = var514;
                        } else if (var528 == 1420) {
                            var510.field2440 = var514;
                        } else if (var528 == 1421) {
                            var510.field2535 = var514;
                        } else if (var528 == 1422) {
                            var510.field2475 = var514;
                        } else if (var528 == 1423) {
                            var510.field2437 = var514;
                        } else if (var528 == 1424) {
                            var510.field2462 = var514;
                        } else if (var528 == 1425) {
                            var510.field2575 = var514;
                        } else if (var528 == 1426) {
                            var510.field2426 = var514;
                        } else if (var528 == 1427) {
                            var510.field2522 = var514;
                        } else if (var528 == 1428) {
                            var510.field2565 = var514;
                            var510.field2506 = var511;
                        } else if (var528 == 1429) {
                            var510.field2474 = var511;
                            var510.field2444 = var514;
                        }
                        continue;
                    }
                    if (var528 < 1600) {
                        class157 var83 = var46 ? class151.field2340 : class261.field4166;
                        if (var528 == 1500) {
                            class253.field4036[var6++] = var83.field2519;
                            continue;
                        }
                        if (var528 == 1501) {
                            class253.field4036[var6++] = var83.field2517;
                            continue;
                        }
                        if (var528 == 1502) {
                            class253.field4036[var6++] = var83.field2468;
                            continue;
                        }
                        if (var528 == 1503) {
                            class253.field4036[var6++] = var83.field2520;
                            continue;
                        }
                        if (var528 == 1504) {
                            class253.field4036[var6++] = var83.field2592 ? 1 : 0;
                            continue;
                        }
                        if (var528 == 1505) {
                            class253.field4036[var6++] = var83.field2463;
                            continue;
                        }
                    } else if (var528 < 1700) {
                        class157 var509 = var46 ? class151.field2340 : class261.field4166;
                        if (var528 == 1600) {
                            class253.field4036[var6++] = var509.field2499;
                            continue;
                        }
                        if (var528 == 1601) {
                            class253.field4036[var6++] = var509.field2591;
                            continue;
                        }
                        if (var528 == 1602) {
                            class276.field4458[var8++] = var509.field2493;
                            continue;
                        }
                        if (var528 == 1603) {
                            class253.field4036[var6++] = var509.field2597;
                            continue;
                        }
                        if (var528 == 1604) {
                            class253.field4036[var6++] = var509.field2528;
                            continue;
                        }
                        if (var528 == 1605) {
                            class253.field4036[var6++] = var509.field2449;
                            continue;
                        }
                        if (var528 == 1606) {
                            class253.field4036[var6++] = var509.field2492;
                            continue;
                        }
                        if (var528 == 1607) {
                            class253.field4036[var6++] = var509.field2602;
                            continue;
                        }
                        if (var528 == 1608) {
                            class253.field4036[var6++] = var509.field2574;
                            continue;
                        }
                        if (var528 == 1609) {
                            class253.field4036[var6++] = var509.field2572;
                            continue;
                        }
                        if (var528 == 1610) {
                            class253.field4036[var6++] = var509.field2578;
                            continue;
                        }
                        if (var528 == 1611) {
                            class253.field4036[var6++] = var509.field2435;
                            continue;
                        }
                        if (var528 == 1612) {
                            class253.field4036[var6++] = var509.field2596;
                            continue;
                        }
                    } else if (var528 < 1800) {
                        class157 var508 = var46 ? class151.field2340 : class261.field4166;
                        if (var528 == 1700) {
                            class253.field4036[var6++] = var508.field2487;
                            continue;
                        }
                        if (var528 == 1701) {
                            if (var508.field2487 == -1) {
                                class253.field4036[var6++] = 0;
                            } else {
                                class253.field4036[var6++] = var508.field2593;
                            }
                            continue;
                        }
                        if (var528 == 1702) {
                            class253.field4036[var6++] = var508.field2482;
                            continue;
                        }
                    } else if (var528 < 1900) {
                        class157 var506 = var46 ? class151.field2340 : class261.field4166;
                        if (var528 == 1800) {
                            class253.field4036[var6++] = client.method766(var506).method2029((byte) -91);
                            continue;
                        }
                        if (var528 == 1801) {
                            var6--;
                            int var507 = class253.field4036[var6];
                            int var530 = var507 - 1;
                            if (var506.field2552 != null && var506.field2552.length > var530 && var506.field2552[var530] != null) {
                                class276.field4458[var8++] = var506.field2552[var530];
                                continue;
                            }
                            class276.field4458[var8++] = "";
                            continue;
                        }
                        if (var528 == 1802) {
                            if (var506.field2532 == null) {
                                class276.field4458[var8++] = "";
                            } else {
                                class276.field4458[var8++] = var506.field2532;
                            }
                            continue;
                        }
                    } else if (var528 < 2600) {
                        var6--;
                        class157 var505 = class142.method1053(class253.field4036[var6], 65535);
                        if (var528 == 2500) {
                            class253.field4036[var6++] = var505.field2519;
                            continue;
                        }
                        if (var528 == 2501) {
                            class253.field4036[var6++] = var505.field2517;
                            continue;
                        }
                        if (var528 == 2502) {
                            class253.field4036[var6++] = var505.field2468;
                            continue;
                        }
                        if (var528 == 2503) {
                            class253.field4036[var6++] = var505.field2520;
                            continue;
                        }
                        if (var528 == 2504) {
                            class253.field4036[var6++] = var505.field2592 ? 1 : 0;
                            continue;
                        }
                        if (var528 == 2505) {
                            class253.field4036[var6++] = var505.field2463;
                            continue;
                        }
                    } else if (var528 < 2700) {
                        var6--;
                        class157 var84 = class142.method1053(class253.field4036[var6], 65535);
                        if (var528 == 2600) {
                            class253.field4036[var6++] = var84.field2499;
                            continue;
                        }
                        if (var528 == 2601) {
                            class253.field4036[var6++] = var84.field2591;
                            continue;
                        }
                        if (var528 == 2602) {
                            class276.field4458[var8++] = var84.field2493;
                            continue;
                        }
                        if (var528 == 2603) {
                            class253.field4036[var6++] = var84.field2597;
                            continue;
                        }
                        if (var528 == 2604) {
                            class253.field4036[var6++] = var84.field2528;
                            continue;
                        }
                        if (var528 == 2605) {
                            class253.field4036[var6++] = var84.field2449;
                            continue;
                        }
                        if (var528 == 2606) {
                            class253.field4036[var6++] = var84.field2492;
                            continue;
                        }
                        if (var528 == 2607) {
                            class253.field4036[var6++] = var84.field2602;
                            continue;
                        }
                        if (var528 == 2608) {
                            class253.field4036[var6++] = var84.field2574;
                            continue;
                        }
                        if (var528 == 2609) {
                            class253.field4036[var6++] = var84.field2572;
                            continue;
                        }
                        if (var528 == 2610) {
                            class253.field4036[var6++] = var84.field2578;
                            continue;
                        }
                        if (var528 == 2611) {
                            class253.field4036[var6++] = var84.field2435;
                            continue;
                        }
                        if (var528 == 2612) {
                            class253.field4036[var6++] = var84.field2596;
                            continue;
                        }
                    } else if (var528 < 2800) {
                        if (var528 == 2700) {
                            var6--;
                            class157 var495 = class142.method1053(class253.field4036[var6], 65535);
                            class253.field4036[var6++] = var495.field2487;
                            continue;
                        }
                        if (var528 == 2701) {
                            var6--;
                            class157 var496 = class142.method1053(class253.field4036[var6], 65535);
                            if (var496.field2487 == -1) {
                                class253.field4036[var6++] = 0;
                            } else {
                                class253.field4036[var6++] = var496.field2593;
                            }
                            continue;
                        }
                        if (var528 == 2702) {
                            var6--;
                            int var497 = class253.field4036[var6];
                            class90 var498 = (class90) class243.field3842.method451((long) var497, (byte) 100);
                            if (var498 == null) {
                                class253.field4036[var6++] = 0;
                            } else {
                                class253.field4036[var6++] = 1;
                            }
                            continue;
                        }
                        if (var528 == 2703) {
                            var6--;
                            class157 var499 = class142.method1053(class253.field4036[var6], 65535);
                            if (var499.field2472 == null) {
                                class253.field4036[var6++] = 0;
                                continue;
                            }
                            int var500 = var499.field2472.length;
                            for (int var501 = 0; var501 < var499.field2472.length; var501++) {
                                if (var499.field2472[var501] == null) {
                                    var500 = var501;
                                    break;
                                }
                            }
                            class253.field4036[var6++] = var500;
                            continue;
                        }
                        if (var528 == 2704 || var528 == 2705) {
                            var6 -= 2;
                            int var502 = class253.field4036[var6];
                            int var503 = class253.field4036[var6 + 1];
                            class90 var504 = (class90) class243.field3842.method451((long) var502, (byte) 100);
                            if (var504 != null && var504.field1249 == var503) {
                                class253.field4036[var6++] = 1;
                                continue;
                            }
                            class253.field4036[var6++] = 0;
                            continue;
                        }
                    } else if (var528 < 2900) {
                        var6--;
                        class157 var85 = class142.method1053(class253.field4036[var6], 65535);
                        if (var528 == 2800) {
                            class253.field4036[var6++] = client.method766(var85).method2029((byte) -124);
                            continue;
                        }
                        if (var528 == 2801) {
                            var6--;
                            int var86 = class253.field4036[var6];
                            int var529 = var86 - 1;
                            if (var85.field2552 != null && var529 < var85.field2552.length && var85.field2552[var529] != null) {
                                class276.field4458[var8++] = var85.field2552[var529];
                                continue;
                            }
                            class276.field4458[var8++] = "";
                            continue;
                        }
                        if (var528 == 2802) {
                            if (var85.field2532 == null) {
                                class276.field4458[var8++] = "";
                            } else {
                                class276.field4458[var8++] = var85.field2532;
                            }
                            continue;
                        }
                    } else if (var528 < 3200) {
                        if (var528 == 3100) {
                            var8--;
                            String var480 = class276.field4458[var8];
                            class155.method1109(var480, 0, "", (byte) -47);
                            continue;
                        }
                        if (var528 == 3101) {
                            var6 -= 2;
                            class166.method1217((byte) 125, class253.field4036[var6], class253.field4036[var6 + 1], class191.field3129);
                            continue;
                        }
                        if (var528 == 3103) {
                            class231.method1638(49);
                            continue;
                        }
                        if (var528 == 3104) {
                            var8--;
                            String var481 = class276.field4458[var8];
                            class89.field1232++;
                            int var482 = 0;
                            if (class233.method1686(true, var481)) {
                                var482 = class142.method1047(-23595, var481);
                            }
                            class194.field3175.method2375(142, 0);
                            class194.field3175.method283((byte) -51, var482);
                            continue;
                        }
                        if (var528 == 3105) {
                            class343.field5339++;
                            var8--;
                            String var483 = class276.field4458[var8];
                            class194.field3175.method2375(201, 0);
                            class194.field3175.method255(false, class204.method1491(-26916, var483));
                            continue;
                        }
                        if (var528 == 3106) {
                            class44.field623++;
                            var8--;
                            String var484 = class276.field4458[var8];
                            class194.field3175.method2375(159, 0);
                            class194.field3175.method257(-2, var484.length() + 1);
                            class194.field3175.method231(23573, var484);
                            continue;
                        }
                        if (var528 == 3107) {
                            var6--;
                            int var485 = class253.field4036[var6];
                            var8--;
                            String var486 = class276.field4458[var8];
                            class133.method973(var486, (byte) 117, var485);
                            continue;
                        }
                        if (var528 == 3108) {
                            var6 -= 3;
                            int var487 = class253.field4036[var6 + 1];
                            int var488 = class253.field4036[var6 + 2];
                            int var489 = class253.field4036[var6];
                            class157 var490 = class142.method1053(var488, 65535);
                            class98.method667(-127, var490, var487, var489);
                            continue;
                        }
                        if (var528 == 3109) {
                            var6 -= 2;
                            int var491 = class253.field4036[var6];
                            int var492 = class253.field4036[var6 + 1];
                            class157 var493 = var46 ? class151.field2340 : class261.field4166;
                            class98.method667(-89, var493, var492, var491);
                            continue;
                        }
                        if (var528 == 3110) {
                            var6--;
                            int var494 = class253.field4036[var6];
                            class194.field3175.method2375(56, 0);
                            class185.field3072++;
                            class194.field3175.method287(0, var494);
                            continue;
                        }
                    } else if (var528 < 3300) {
                        if (var528 == 3200) {
                            var6 -= 3;
                            class50.method327(class253.field4036[var6 + 1], class253.field4036[var6 + 2], class253.field4036[var6], 255, (byte) 93);
                            continue;
                        }
                        if (var528 == 3201) {
                            var6--;
                            class298.method2122(255, class253.field4036[var6], (byte) -94);
                            continue;
                        }
                        if (var528 == 3202) {
                            var6 -= 2;
                            class106.method722(class253.field4036[var6], 255, (byte) -127, class253.field4036[var6 + 1]);
                            continue;
                        }
                    } else if (var528 < 3400) {
                        if (var528 == 3300) {
                            class253.field4036[var6++] = class240.field3818;
                            continue;
                        }
                        if (var528 == 3301) {
                            var6 -= 2;
                            int var87 = class253.field4036[var6];
                            int var88 = class253.field4036[var6 + 1];
                            class253.field4036[var6++] = class208.method1509(var88, -124, var87);
                            continue;
                        }
                        if (var528 == 3302) {
                            var6 -= 2;
                            int var89 = class253.field4036[var6];
                            int var90 = class253.field4036[var6 + 1];
                            class253.field4036[var6++] = class45.method291(var90, 1908952360, var89);
                            continue;
                        }
                        if (var528 == 3303) {
                            var6 -= 2;
                            int var91 = class253.field4036[var6];
                            int var92 = class253.field4036[var6 + 1];
                            class253.field4036[var6++] = class33.method180(3839, var92, var91);
                            continue;
                        }
                        if (var528 == 3304) {
                            var6--;
                            int var93 = class253.field4036[var6];
                            class253.field4036[var6++] = class229.method1619((byte) -98, var93).field4368;
                            continue;
                        }
                        if (var528 == 3305) {
                            var6--;
                            int var94 = class253.field4036[var6];
                            class253.field4036[var6++] = class99.field1441[var94];
                            continue;
                        }
                        if (var528 == 3306) {
                            var6--;
                            int var95 = class253.field4036[var6];
                            class253.field4036[var6++] = class319.field4959[var95];
                            continue;
                        }
                        if (var528 == 3307) {
                            var6--;
                            int var96 = class253.field4036[var6];
                            class253.field4036[var6++] = class182.field3005[var96];
                            continue;
                        }
                        if (var528 == 3308) {
                            int var97 = (class191.field3129.field4255 >> 7) + class70.field989;
                            int var98 = (class191.field3129.field4264 >> 7) + class205.field3367;
                            int var99 = class49.field698;
                            class253.field4036[var6++] = (var99 << 28) + (var97 << 14) + var98;
                            continue;
                        }
                        if (var528 == 3309) {
                            var6--;
                            int var100 = class253.field4036[var6];
                            class253.field4036[var6++] = client.method767(var100, 268426910) >> 14;
                            continue;
                        }
                        if (var528 == 3310) {
                            var6--;
                            int var101 = class253.field4036[var6];
                            class253.field4036[var6++] = var101 >> 28;
                            continue;
                        }
                        if (var528 == 3311) {
                            var6--;
                            int var102 = class253.field4036[var6];
                            class253.field4036[var6++] = client.method767(16383, var102);
                            continue;
                        }
                        if (var528 == 3312) {
                            class253.field4036[var6++] = class74.field1051 ? 1 : 0;
                            continue;
                        }
                        if (var528 == 3313) {
                            var6 -= 2;
                            int var103 = class253.field4036[var6 + 1];
                            int var104 = class253.field4036[var6] + 32768;
                            class253.field4036[var6++] = class208.method1509(var103, -121, var104);
                            continue;
                        }
                        if (var528 == 3314) {
                            var6 -= 2;
                            int var105 = class253.field4036[var6] + 32768;
                            int var106 = class253.field4036[var6 + 1];
                            class253.field4036[var6++] = class45.method291(var106, 1908952360, var105);
                            continue;
                        }
                        if (var528 == 3315) {
                            var6 -= 2;
                            int var107 = class253.field4036[var6] + 32768;
                            int var108 = class253.field4036[var6 + 1];
                            class253.field4036[var6++] = class33.method180(3839, var108, var107);
                            continue;
                        }
                        if (var528 == 3316) {
                            if (class341.field5311 < 2) {
                                class253.field4036[var6++] = 0;
                            } else {
                                class253.field4036[var6++] = class341.field5311;
                            }
                            continue;
                        }
                        if (var528 == 3317) {
                            class253.field4036[var6++] = class44.field585;
                            continue;
                        }
                        if (var528 == 3318) {
                            class253.field4036[var6++] = class21.field306;
                            continue;
                        }
                        if (var528 == 3321) {
                            class253.field4036[var6++] = class263.field4231;
                            continue;
                        }
                        if (var528 == 3322) {
                            class253.field4036[var6++] = class335.field5245;
                            continue;
                        }
                        if (var528 == 3323) {
                            if (class271.field4376 >= 5 && class271.field4376 <= 9) {
                                class253.field4036[var6++] = 1;
                                continue;
                            }
                            class253.field4036[var6++] = 0;
                            continue;
                        }
                        if (var528 == 3324) {
                            if (class271.field4376 >= 5 && class271.field4376 <= 9) {
                                class253.field4036[var6++] = class271.field4376;
                                continue;
                            }
                            class253.field4036[var6++] = 0;
                            continue;
                        }
                        if (var528 == 3325) {
                            class253.field4036[var6++] = class2.field33 ? 1 : 0;
                            continue;
                        }
                        if (var528 == 3326) {
                            class253.field4036[var6++] = class191.field3129.field5205;
                            continue;
                        }
                        if (var528 == 3327) {
                            class253.field4036[var6++] = class191.field3129.field5224.field1559 ? 1 : 0;
                            continue;
                        }
                        if (var528 == 3328) {
                            class253.field4036[var6++] = class178.field2963 && !class320.field4962 ? 1 : 0;
                            continue;
                        }
                        if (var528 == 3329) {
                            class253.field4036[var6++] = class102.field1487 ? 1 : 0;
                            continue;
                        }
                        if (var528 == 3330) {
                            var6--;
                            int var109 = class253.field4036[var6];
                            class253.field4036[var6++] = class208.method1513(var109, 113);
                            continue;
                        }
                        if (var528 == 3331) {
                            var6 -= 2;
                            int var110 = class253.field4036[var6];
                            int var111 = class253.field4036[var6 + 1];
                            class253.field4036[var6++] = class66.method445(false, var111, var110, 12706);
                            continue;
                        }
                        if (var528 == 3332) {
                            var6 -= 2;
                            int var112 = class253.field4036[var6 + 1];
                            int var113 = class253.field4036[var6];
                            class253.field4036[var6++] = class66.method445(true, var112, var113, 12706);
                            continue;
                        }
                        if (var528 == 3333) {
                            class253.field4036[var6++] = class256.field4100;
                            continue;
                        }
                        if (var528 == 3335) {
                            class253.field4036[var6++] = class8.field121;
                            continue;
                        }
                        if (var528 == 3336) {
                            var6 -= 4;
                            int var114 = class253.field4036[var6 + 3];
                            int var115 = class253.field4036[var6 + 2];
                            int var116 = class253.field4036[var6 + 1];
                            int var117 = class253.field4036[var6];
                            int var118 = (var116 << 14) + var117;
                            int var119 = (var115 << 28) + var118;
                            int var120 = var114 + var119;
                            class253.field4036[var6++] = var120;
                            continue;
                        }
                        if (var528 == 3337) {
                            class253.field4036[var6++] = class44.field594;
                            continue;
                        }
                    } else if (var528 < 3500) {
                        if (var528 == 3400) {
                            var6 -= 2;
                            int var463 = class253.field4036[var6];
                            int var464 = class253.field4036[var6 + 1];
                            class184 var465 = class256.method1845(var463, -4203);
                            if (var465.field3043 != 's') {
                            }
                            class276.field4458[var8++] = var465.method1378(var464, -24986);
                            continue;
                        }
                        if (var528 == 3408) {
                            var6 -= 4;
                            int var466 = class253.field4036[var6];
                            int var467 = class253.field4036[var6 + 1];
                            int var468 = class253.field4036[var6 + 2];
                            int var469 = class253.field4036[var6 + 3];
                            class184 var470 = class256.method1845(var468, -4203);
                            if (var470.field3058 == var466 && var470.field3043 == var467) {
                                if (var467 == 115) {
                                    class276.field4458[var8++] = var470.method1378(var469, -24986);
                                } else {
                                    class253.field4036[var6++] = var470.method1385(86, var469);
                                }
                                continue;
                            }
                            throw new RuntimeException("C3408-1");
                        }
                        if (var528 == 3409) {
                            var6 -= 3;
                            int var471 = class253.field4036[var6];
                            int var472 = class253.field4036[var6 + 2];
                            int var473 = class253.field4036[var6 + 1];
                            if (var473 == -1) {
                                throw new RuntimeException("C3409-2");
                            }
                            class184 var474 = class256.method1845(var473, -4203);
                            if (var474.field3043 != var471) {
                                throw new RuntimeException("C3409-1");
                            }
                            class253.field4036[var6++] = var474.method1382(var472, -67) ? 1 : 0;
                            continue;
                        }
                        if (var528 == 3410) {
                            var6--;
                            int var475 = class253.field4036[var6];
                            var8--;
                            String var476 = class276.field4458[var8];
                            if (var475 == -1) {
                                throw new RuntimeException("C3410-2");
                            }
                            class184 var477 = class256.method1845(var475, -4203);
                            if (var477.field3043 != 's') {
                                throw new RuntimeException("C3410-1");
                            }
                            class253.field4036[var6++] = var477.method1376(var476, 4) ? 1 : 0;
                            continue;
                        }
                        if (var528 == 3411) {
                            var6--;
                            int var478 = class253.field4036[var6];
                            class184 var479 = class256.method1845(var478, -4203);
                            class253.field4036[var6++] = var479.field3048.method460(25595);
                            continue;
                        }
                    } else if (var528 < 3700) {
                        if (var528 == 3600) {
                            if (class11.field138 == 0) {
                                class253.field4036[var6++] = -2;
                            } else if (class11.field138 == 1) {
                                class253.field4036[var6++] = -1;
                            } else {
                                class253.field4036[var6++] = class61.field875;
                            }
                            continue;
                        }
                        if (var528 == 3601) {
                            var6--;
                            int var121 = class253.field4036[var6];
                            if (class11.field138 == 2 && class61.field875 > var121) {
                                class276.field4458[var8++] = class61.field858[var121];
                                continue;
                            }
                            class276.field4458[var8++] = "";
                            continue;
                        }
                        if (var528 == 3602) {
                            var6--;
                            int var122 = class253.field4036[var6];
                            if (class11.field138 == 2 && var122 < class61.field875) {
                                class253.field4036[var6++] = class58.field824[var122];
                                continue;
                            }
                            class253.field4036[var6++] = 0;
                            continue;
                        }
                        if (var528 == 3603) {
                            var6--;
                            int var123 = class253.field4036[var6];
                            if (class11.field138 == 2 && class61.field875 > var123) {
                                class253.field4036[var6++] = class301.field4731[var123];
                                continue;
                            }
                            class253.field4036[var6++] = 0;
                            continue;
                        }
                        if (var528 == 3604) {
                            var6--;
                            int var124 = class253.field4036[var6];
                            var8--;
                            String var125 = class276.field4458[var8];
                            class198.method1456(var125, var124, (byte) -123);
                            continue;
                        }
                        if (var528 == 3605) {
                            var8--;
                            String var126 = class276.field4458[var8];
                            class39.method206(class204.method1491(-26916, var126), -14736);
                            continue;
                        }
                        if (var528 == 3606) {
                            var8--;
                            String var127 = class276.field4458[var8];
                            class174.method1310(class204.method1491(-26916, var127), (byte) 95);
                            continue;
                        }
                        if (var528 == 3607) {
                            var8--;
                            String var128 = class276.field4458[var8];
                            class287.method2060(true, false, class204.method1491(-26916, var128));
                            continue;
                        }
                        if (var528 == 3608) {
                            var8--;
                            String var129 = class276.field4458[var8];
                            class80.method543(class204.method1491(-26916, var129), (byte) -57);
                            continue;
                        }
                        if (var528 == 3609) {
                            var8--;
                            String var130 = class276.field4458[var8];
                            if (var130.startsWith("<img=0>") || var130.startsWith("<img=1>")) {
                                var130 = var130.substring(7);
                            }
                            class253.field4036[var6++] = class78.method532(114, var130) ? 1 : 0;
                            continue;
                        }
                        if (var528 == 3610) {
                            var6--;
                            int var131 = class253.field4036[var6];
                            if (class11.field138 == 2 && class61.field875 > var131) {
                                class276.field4458[var8++] = class121.field1838[var131];
                                continue;
                            }
                            class276.field4458[var8++] = "";
                            continue;
                        }
                        if (var528 == 3611) {
                            if (class66.field950 == null) {
                                class276.field4458[var8++] = "";
                            } else {
                                class276.field4458[var8++] = class320.method2250((byte) -76, class66.field950);
                            }
                            continue;
                        }
                        if (var528 == 3612) {
                            if (class66.field950 == null) {
                                class253.field4036[var6++] = 0;
                            } else {
                                class253.field4036[var6++] = class84.field1175;
                            }
                            continue;
                        }
                        if (var528 == 3613) {
                            var6--;
                            int var132 = class253.field4036[var6];
                            if (class66.field950 != null && var132 < class84.field1175) {
                                class276.field4458[var8++] = class320.method2250((byte) -76, class340.field5291[var132].field4876);
                                continue;
                            }
                            class276.field4458[var8++] = "";
                            continue;
                        }
                        if (var528 == 3614) {
                            var6--;
                            int var133 = class253.field4036[var6];
                            if (class66.field950 != null && var133 < class84.field1175) {
                                class253.field4036[var6++] = class340.field5291[var133].field4879;
                                continue;
                            }
                            class253.field4036[var6++] = 0;
                            continue;
                        }
                        if (var528 == 3615) {
                            var6--;
                            int var134 = class253.field4036[var6];
                            if (class66.field950 != null && class84.field1175 > var134) {
                                class253.field4036[var6++] = class340.field5291[var134].field4875;
                                continue;
                            }
                            class253.field4036[var6++] = 0;
                            continue;
                        }
                        if (var528 == 3616) {
                            class253.field4036[var6++] = class307.field4796;
                            continue;
                        }
                        if (var528 == 3617) {
                            var8--;
                            String var135 = class276.field4458[var8];
                            class29.method166(var135, -116);
                            continue;
                        }
                        if (var528 == 3618) {
                            class253.field4036[var6++] = class155.field2383;
                            continue;
                        }
                        if (var528 == 3619) {
                            var8--;
                            String var136 = class276.field4458[var8];
                            class236.method1709(class204.method1491(-26916, var136), (byte) 44);
                            continue;
                        }
                        if (var528 == 3620) {
                            class279.method2017(-65);
                            continue;
                        }
                        if (var528 == 3621) {
                            if (class11.field138 == 0) {
                                class253.field4036[var6++] = -1;
                            } else {
                                class253.field4036[var6++] = class207.field3412;
                            }
                            continue;
                        }
                        if (var528 == 3622) {
                            var6--;
                            int var137 = class253.field4036[var6];
                            if (class11.field138 != 0 && var137 < class207.field3412) {
                                class276.field4458[var8++] = class13.method74(-121, class54.field769[var137]);
                                continue;
                            }
                            class276.field4458[var8++] = "";
                            continue;
                        }
                        if (var528 == 3623) {
                            var8--;
                            String var138 = class276.field4458[var8];
                            if (var138.startsWith("<img=0>") || var138.startsWith("<img=1>")) {
                                var138 = var138.substring(7);
                            }
                            class253.field4036[var6++] = class261.method1861(true, var138) ? 1 : 0;
                            continue;
                        }
                        if (var528 == 3624) {
                            var6--;
                            int var139 = class253.field4036[var6];
                            if (class340.field5291 != null && class84.field1175 > var139 && class340.field5291[var139].field4876.equalsIgnoreCase(class191.field3129.field5216)) {
                                class253.field4036[var6++] = 1;
                                continue;
                            }
                            class253.field4036[var6++] = 0;
                            continue;
                        }
                        if (var528 == 3625) {
                            if (class277.field4463 == null) {
                                class276.field4458[var8++] = "";
                            } else {
                                class276.field4458[var8++] = class320.method2250((byte) -76, class277.field4463);
                            }
                            continue;
                        }
                        if (var528 == 3626) {
                            var6--;
                            int var140 = class253.field4036[var6];
                            if (class66.field950 != null && class84.field1175 > var140) {
                                class276.field4458[var8++] = class340.field5291[var140].field4871;
                                continue;
                            }
                            class276.field4458[var8++] = "";
                            continue;
                        }
                        if (var528 == 3627) {
                            var6--;
                            int var141 = class253.field4036[var6];
                            if (class11.field138 == 2 && var141 >= 0 && var141 < class61.field875) {
                                class253.field4036[var6++] = class191.field3130[var141] ? 1 : 0;
                                continue;
                            }
                            class253.field4036[var6++] = 0;
                            continue;
                        }
                        if (var528 == 3628) {
                            var8--;
                            String var142 = class276.field4458[var8];
                            if (var142.startsWith("<img=0>") || var142.startsWith("<img=1>")) {
                                var142 = var142.substring(7);
                            }
                            class253.field4036[var6++] = class66.method444(-1, var142);
                            continue;
                        }
                        if (var528 == 3629) {
                            class253.field4036[var6++] = class77.field1069;
                            continue;
                        }
                        if (var528 == 3630) {
                            var8--;
                            String var143 = class276.field4458[var8];
                            class287.method2060(true, true, class204.method1491(-26916, var143));
                            continue;
                        }
                        if (var528 == 3631) {
                            var6--;
                            int var144 = class253.field4036[var6];
                            class253.field4036[var6++] = class181.field2993[var144] ? 1 : 0;
                            continue;
                        }
                    } else if (var528 < 4000) {
                        if (var528 == 3903) {
                            var6--;
                            int var449 = class253.field4036[var6];
                            class253.field4036[var6++] = class151.field2339[var449].method317(true);
                            continue;
                        }
                        if (var528 == 3904) {
                            var6--;
                            int var450 = class253.field4036[var6];
                            class253.field4036[var6++] = class151.field2339[var450].field694;
                            continue;
                        }
                        if (var528 == 3905) {
                            var6--;
                            int var451 = class253.field4036[var6];
                            class253.field4036[var6++] = class151.field2339[var451].field697;
                            continue;
                        }
                        if (var528 == 3906) {
                            var6--;
                            int var452 = class253.field4036[var6];
                            class253.field4036[var6++] = class151.field2339[var452].field692;
                            continue;
                        }
                        if (var528 == 3907) {
                            var6--;
                            int var453 = class253.field4036[var6];
                            class253.field4036[var6++] = class151.field2339[var453].field689;
                            continue;
                        }
                        if (var528 == 3908) {
                            var6--;
                            int var454 = class253.field4036[var6];
                            class253.field4036[var6++] = class151.field2339[var454].field695;
                            continue;
                        }
                        if (var528 == 3910) {
                            var6--;
                            int var455 = class253.field4036[var6];
                            int var456 = class151.field2339[var455].method316(469531296);
                            class253.field4036[var6++] = var456 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var528 == 3911) {
                            var6--;
                            int var457 = class253.field4036[var6];
                            int var458 = class151.field2339[var457].method316(469531296);
                            class253.field4036[var6++] = var458 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var528 == 3912) {
                            var6--;
                            int var459 = class253.field4036[var6];
                            int var460 = class151.field2339[var459].method316(469531296);
                            class253.field4036[var6++] = var460 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var528 == 3913) {
                            var6--;
                            int var461 = class253.field4036[var6];
                            int var462 = class151.field2339[var461].method316(469531296);
                            class253.field4036[var6++] = var462 == 1 ? 1 : 0;
                            continue;
                        }
                    } else if (var528 < 4100) {
                        if (var528 == 4000) {
                            var6 -= 2;
                            int var145 = class253.field4036[var6 + 1];
                            int var146 = class253.field4036[var6];
                            class253.field4036[var6++] = var146 + var145;
                            continue;
                        }
                        if (var528 == 4001) {
                            var6 -= 2;
                            int var147 = class253.field4036[var6];
                            int var148 = class253.field4036[var6 + 1];
                            class253.field4036[var6++] = var147 - var148;
                            continue;
                        }
                        if (var528 == 4002) {
                            var6 -= 2;
                            int var149 = class253.field4036[var6];
                            int var150 = class253.field4036[var6 + 1];
                            class253.field4036[var6++] = var149 * var150;
                            continue;
                        }
                        if (var528 == 4003) {
                            var6 -= 2;
                            int var151 = class253.field4036[var6];
                            int var152 = class253.field4036[var6 + 1];
                            class253.field4036[var6++] = var151 / var152;
                            continue;
                        }
                        if (var528 == 4004) {
                            var6--;
                            int var153 = class253.field4036[var6];
                            class253.field4036[var6++] = (int) (Math.random() * (double) var153);
                            continue;
                        }
                        if (var528 == 4005) {
                            var6--;
                            int var154 = class253.field4036[var6];
                            class253.field4036[var6++] = (int) ((double) (var154 + 1) * Math.random());
                            continue;
                        }
                        if (var528 == 4006) {
                            var6 -= 5;
                            int var155 = class253.field4036[var6];
                            int var156 = class253.field4036[var6 + 1];
                            int var157 = class253.field4036[var6 + 2];
                            int var158 = class253.field4036[var6 + 3];
                            int var159 = class253.field4036[var6 + 4];
                            class253.field4036[var6++] = (var156 - var155) * (var159 - var157) / (var158 - var157) + var155;
                            continue;
                        }
                        if (var528 == 4007) {
                            var6 -= 2;
                            long var160 = (long) class253.field4036[var6 + 1];
                            long var162 = (long) class253.field4036[var6];
                            class253.field4036[var6++] = (int) (var160 * var162 / 100L + var162);
                            continue;
                        }
                        if (var528 == 4008) {
                            var6 -= 2;
                            int var164 = class253.field4036[var6];
                            int var165 = class253.field4036[var6 + 1];
                            class253.field4036[var6++] = class122.method882(0x1 << var165, var164);
                            continue;
                        }
                        if (var528 == 4009) {
                            var6 -= 2;
                            int var166 = class253.field4036[var6];
                            int var167 = class253.field4036[var6 + 1];
                            class253.field4036[var6++] = client.method767(-(0x1 << var167) - 1, var166);
                            continue;
                        }
                        if (var528 == 4010) {
                            var6 -= 2;
                            int var168 = class253.field4036[var6];
                            int var169 = class253.field4036[var6 + 1];
                            class253.field4036[var6++] = client.method767(var168, 0x1 << var169) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var528 == 4011) {
                            var6 -= 2;
                            int var170 = class253.field4036[var6];
                            int var171 = class253.field4036[var6 + 1];
                            class253.field4036[var6++] = var170 % var171;
                            continue;
                        }
                        if (var528 == 4012) {
                            var6 -= 2;
                            int var172 = class253.field4036[var6 + 1];
                            int var173 = class253.field4036[var6];
                            if (var173 == 0) {
                                class253.field4036[var6++] = 0;
                            } else {
                                class253.field4036[var6++] = (int) Math.pow((double) var173, (double) var172);
                            }
                            continue;
                        }
                        if (var528 == 4013) {
                            var6 -= 2;
                            int var174 = class253.field4036[var6 + 1];
                            int var175 = class253.field4036[var6];
                            if (var175 == 0) {
                                class253.field4036[var6++] = 0;
                            } else if (var174 == 0) {
                                class253.field4036[var6++] = Integer.MAX_VALUE;
                            } else {
                                class253.field4036[var6++] = (int) Math.pow((double) var175, 1.0D / (double) var174);
                            }
                            continue;
                        }
                        if (var528 == 4014) {
                            var6 -= 2;
                            int var176 = class253.field4036[var6];
                            int var177 = class253.field4036[var6 + 1];
                            class253.field4036[var6++] = client.method767(var176, var177);
                            continue;
                        }
                        if (var528 == 4015) {
                            var6 -= 2;
                            int var178 = class253.field4036[var6 + 1];
                            int var179 = class253.field4036[var6];
                            class253.field4036[var6++] = class122.method882(var179, var178);
                            continue;
                        }
                        if (var528 == 4016) {
                            var6 -= 2;
                            int var180 = class253.field4036[var6 + 1];
                            int var181 = class253.field4036[var6];
                            class253.field4036[var6++] = var181 >= var180 ? var180 : var181;
                            continue;
                        }
                        if (var528 == 4017) {
                            var6 -= 2;
                            int var182 = class253.field4036[var6 + 1];
                            int var183 = class253.field4036[var6];
                            class253.field4036[var6++] = var182 < var183 ? var183 : var182;
                            continue;
                        }
                        if (var528 == 4018) {
                            var6 -= 3;
                            long var184 = (long) class253.field4036[var6];
                            long var186 = (long) class253.field4036[var6 + 2];
                            long var188 = (long) class253.field4036[var6 + 1];
                            class253.field4036[var6++] = (int) (var184 * var186 / var188);
                            continue;
                        }
                    } else if (var528 < 4200) {
                        if (var528 == 4100) {
                            var8--;
                            String var399 = class276.field4458[var8];
                            var6--;
                            int var400 = class253.field4036[var6];
                            class276.field4458[var8++] = var399 + var400;
                            continue;
                        }
                        if (var528 == 4101) {
                            var8 -= 2;
                            String var401 = class276.field4458[var8];
                            String var402 = class276.field4458[var8 + 1];
                            class276.field4458[var8++] = var401 + var402;
                            continue;
                        }
                        if (var528 == 4102) {
                            var8--;
                            String var403 = class276.field4458[var8];
                            var6--;
                            int var404 = class253.field4036[var6];
                            class276.field4458[var8++] = var403 + class289.method2077(var404, (byte) 63, true);
                            continue;
                        }
                        if (var528 == 4103) {
                            var8--;
                            String var405 = class276.field4458[var8];
                            class276.field4458[var8++] = var405.toLowerCase();
                            continue;
                        }
                        if (var528 == 4104) {
                            var6--;
                            int var406 = class253.field4036[var6];
                            long var407 = (long) var406 * 86400000L + 1014768000000L;
                            class168.field2782.setTime(new Date(var407));
                            int var409 = class168.field2782.get(5);
                            int var410 = class168.field2782.get(2);
                            int var411 = class168.field2782.get(1);
                            class276.field4458[var8++] = var409 + "-" + class20.field287[var410] + "-" + var411;
                            continue;
                        }
                        if (var528 == 4105) {
                            var8 -= 2;
                            String var412 = class276.field4458[var8];
                            String var413 = class276.field4458[var8 + 1];
                            if (class191.field3129.field5224 != null && class191.field3129.field5224.field1559) {
                                class276.field4458[var8++] = var413;
                                continue;
                            }
                            class276.field4458[var8++] = var412;
                            continue;
                        }
                        if (var528 == 4106) {
                            var6--;
                            int var414 = class253.field4036[var6];
                            class276.field4458[var8++] = Integer.toString(var414);
                            continue;
                        }
                        if (var528 == 4107) {
                            var8 -= 2;
                            class253.field4036[var6++] = class26.method153(class99.method671(class276.field4458[var8], -7972, class8.field121, class276.field4458[var8 + 1]), 28865);
                            continue;
                        }
                        if (var528 == 4108) {
                            var6 -= 2;
                            var8--;
                            String var415 = class276.field4458[var8];
                            int var416 = class253.field4036[var6];
                            int var417 = class253.field4036[var6 + 1];
                            class253.field4036[var6++] = class196.method1444(var417, 0).method1790(var415, var416);
                            continue;
                        }
                        if (var528 == 4109) {
                            var6 -= 2;
                            var8--;
                            String var418 = class276.field4458[var8];
                            int var419 = class253.field4036[var6];
                            int var420 = class253.field4036[var6 + 1];
                            class253.field4036[var6++] = class196.method1444(var420, 0).method1807(var418, var419);
                            continue;
                        }
                        if (var528 == 4110) {
                            var8 -= 2;
                            String var421 = class276.field4458[var8 + 1];
                            String var422 = class276.field4458[var8];
                            var6--;
                            if (class253.field4036[var6] == 1) {
                                class276.field4458[var8++] = var422;
                            } else {
                                class276.field4458[var8++] = var421;
                            }
                            continue;
                        }
                        if (var528 == 4111) {
                            var8--;
                            String var423 = class276.field4458[var8];
                            class276.field4458[var8++] = class251.method1791(var423);
                            continue;
                        }
                        if (var528 == 4112) {
                            var6--;
                            int var424 = class253.field4036[var6];
                            var8--;
                            String var425 = class276.field4458[var8];
                            if (var424 == -1) {
                                throw new RuntimeException("null char");
                            }
                            class276.field4458[var8++] = var425 + (char) var424;
                            continue;
                        }
                        if (var528 == 4113) {
                            var6--;
                            int var426 = class253.field4036[var6];
                            class253.field4036[var6++] = class175.method1317((byte) -1, (char) var426) ? 1 : 0;
                            continue;
                        }
                        if (var528 == 4114) {
                            var6--;
                            int var427 = class253.field4036[var6];
                            class253.field4036[var6++] = class121.method849((byte) -96, (char) var427) ? 1 : 0;
                            continue;
                        }
                        if (var528 == 4115) {
                            var6--;
                            int var428 = class253.field4036[var6];
                            class253.field4036[var6++] = class222.method1581((char) var428, 0) ? 1 : 0;
                            continue;
                        }
                        if (var528 == 4116) {
                            var6--;
                            int var429 = class253.field4036[var6];
                            class253.field4036[var6++] = class48.method305(true, (char) var429) ? 1 : 0;
                            continue;
                        }
                        if (var528 == 4117) {
                            var8--;
                            String var430 = class276.field4458[var8];
                            if (var430 == null) {
                                class253.field4036[var6++] = 0;
                            } else {
                                class253.field4036[var6++] = var430.length();
                            }
                            continue;
                        }
                        if (var528 == 4118) {
                            var6 -= 2;
                            int var431 = class253.field4036[var6 + 1];
                            var8--;
                            String var432 = class276.field4458[var8];
                            int var433 = class253.field4036[var6];
                            class276.field4458[var8++] = var432.substring(var433, var431);
                            continue;
                        }
                        if (var528 == 4119) {
                            var8--;
                            String var434 = class276.field4458[var8];
                            StringBuffer var435 = new StringBuffer(var434.length());
                            boolean var436 = false;
                            for (int var437 = 0; var434.length() > var437; var437++) {
                                char var438 = var434.charAt(var437);
                                if (var438 == '<') {
                                    var436 = true;
                                } else if (var438 == '>') {
                                    var436 = false;
                                } else if (!var436) {
                                    var435.append(var438);
                                }
                            }
                            class276.field4458[var8++] = var435.toString();
                            continue;
                        }
                        if (var528 == 4120) {
                            var6 -= 2;
                            var8--;
                            String var439 = class276.field4458[var8];
                            int var440 = class253.field4036[var6 + 1];
                            int var441 = class253.field4036[var6];
                            class253.field4036[var6++] = var439.indexOf(var441, var440);
                            continue;
                        }
                        if (var528 == 4121) {
                            var8 -= 2;
                            var6--;
                            int var442 = class253.field4036[var6];
                            String var443 = class276.field4458[var8];
                            String var444 = class276.field4458[var8 + 1];
                            class253.field4036[var6++] = var443.indexOf(var444, var442);
                            continue;
                        }
                        if (var528 == 4122) {
                            var6--;
                            int var445 = class253.field4036[var6];
                            class253.field4036[var6++] = Character.toLowerCase((char) var445);
                            continue;
                        }
                        if (var528 == 4123) {
                            var6--;
                            int var446 = class253.field4036[var6];
                            class253.field4036[var6++] = Character.toUpperCase((char) var446);
                            continue;
                        }
                        if (var528 == 4124) {
                            var6--;
                            boolean var447 = class253.field4036[var6] != 0;
                            var6--;
                            int var448 = class253.field4036[var6];
                            class276.field4458[var8++] = class194.method1432(class8.field121, (long) var448, var447, 0, (byte) -55);
                            continue;
                        }
                    } else if (var528 < 4300) {
                        if (var528 == 4200) {
                            var6--;
                            int var190 = class253.field4036[var6];
                            class276.field4458[var8++] = class285.method2054(var190, 0).field5135;
                            continue;
                        }
                        if (var528 == 4201) {
                            var6 -= 2;
                            int var191 = class253.field4036[var6 + 1];
                            int var192 = class253.field4036[var6];
                            class330 var193 = class285.method2054(var192, 0);
                            if (var191 >= 1 && var191 <= 5 && var193.field5152[var191 - 1] != null) {
                                class276.field4458[var8++] = var193.field5152[var191 - 1];
                                continue;
                            }
                            class276.field4458[var8++] = "";
                            continue;
                        }
                        if (var528 == 4202) {
                            var6 -= 2;
                            int var194 = class253.field4036[var6];
                            int var195 = class253.field4036[var6 + 1];
                            class330 var196 = class285.method2054(var194, 0);
                            if (var195 >= 1 && var195 <= 5 && var196.field5098[var195 - 1] != null) {
                                class276.field4458[var8++] = var196.field5098[var195 - 1];
                                continue;
                            }
                            class276.field4458[var8++] = "";
                            continue;
                        }
                        if (var528 == 4203) {
                            var6--;
                            int var197 = class253.field4036[var6];
                            class253.field4036[var6++] = class285.method2054(var197, 0).field5110;
                            continue;
                        }
                        if (var528 == 4204) {
                            var6--;
                            int var198 = class253.field4036[var6];
                            class253.field4036[var6++] = class285.method2054(var198, 0).field5097 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var528 == 4205) {
                            var6--;
                            int var199 = class253.field4036[var6];
                            class330 var200 = class285.method2054(var199, 0);
                            if (var200.field5144 == -1 && var200.field5150 >= 0) {
                                class253.field4036[var6++] = var200.field5150;
                                continue;
                            }
                            class253.field4036[var6++] = var199;
                            continue;
                        }
                        if (var528 == 4206) {
                            var6--;
                            int var201 = class253.field4036[var6];
                            class330 var202 = class285.method2054(var201, 0);
                            if (var202.field5144 >= 0 && var202.field5150 >= 0) {
                                class253.field4036[var6++] = var202.field5150;
                                continue;
                            }
                            class253.field4036[var6++] = var201;
                            continue;
                        }
                        if (var528 == 4207) {
                            var6--;
                            int var203 = class253.field4036[var6];
                            class253.field4036[var6++] = class285.method2054(var203, 0).field5106 ? 1 : 0;
                            continue;
                        }
                        if (var528 == 4208) {
                            var6 -= 2;
                            int var204 = class253.field4036[var6];
                            int var205 = class253.field4036[var6 + 1];
                            class168 var206 = class36.method194(var205, -19375);
                            if (var206.method1228(16)) {
                                class276.field4458[var8++] = class285.method2054(var204, 0).method2307(var206.field2776, 13426, var205);
                            } else {
                                class253.field4036[var6++] = class285.method2054(var204, 0).method2319(127, var206.field2773, var205);
                            }
                            continue;
                        }
                        if (var528 == 4210) {
                            var8--;
                            String var207 = class276.field4458[var8];
                            var6--;
                            int var208 = class253.field4036[var6];
                            class343.method2379((byte) 117, var208 == 1, var207);
                            class253.field4036[var6++] = class219.field3544;
                            continue;
                        }
                        if (var528 == 4211) {
                            if (class94.field1287 != null && class17.field207 < class219.field3544) {
                                class253.field4036[var6++] = client.method767(65535, class94.field1287[class17.field207++]);
                                continue;
                            }
                            class253.field4036[var6++] = -1;
                            continue;
                        }
                        if (var528 == 4212) {
                            class17.field207 = 0;
                            continue;
                        }
                    } else if (var528 >= 4400) {
                        if (var528 >= 4500) {
                            if (var528 < 4600) {
                                if (var528 == 4500) {
                                    var6 -= 2;
                                    int var209 = class253.field4036[var6];
                                    int var210 = class253.field4036[var6 + 1];
                                    class168 var211 = class36.method194(var210, -19375);
                                    if (var211.method1228(16)) {
                                        class276.field4458[var8++] = class245.method1752(var209, (byte) 113).method1070(16370, var211.field2776, var210);
                                    } else {
                                        class253.field4036[var6++] = class245.method1752(var209, (byte) 124).method1066(var210, -1, var211.field2773);
                                    }
                                    continue;
                                }
                            } else if (var528 < 5100) {
                                if (var528 == 5000) {
                                    class253.field4036[var6++] = class48.field654;
                                    continue;
                                }
                                if (var528 == 5001) {
                                    var6 -= 3;
                                    class48.field654 = class253.field4036[var6];
                                    class2.field29++;
                                    class8.field118 = class253.field4036[var6 + 1];
                                    class164.field2737 = class253.field4036[var6 + 2];
                                    class194.field3175.method2375(204, 0);
                                    class194.field3175.method257(-2, class48.field654);
                                    class194.field3175.method257(-2, class8.field118);
                                    class194.field3175.method257(-2, class164.field2737);
                                    continue;
                                }
                                if (var528 == 5002) {
                                    class43.field546++;
                                    var8--;
                                    String var212 = class276.field4458[var8];
                                    var6 -= 2;
                                    int var213 = class253.field4036[var6];
                                    int var214 = class253.field4036[var6 + 1];
                                    class194.field3175.method2375(91, 0);
                                    class194.field3175.method255(false, class204.method1491(-26916, var212));
                                    class194.field3175.method257(-2, var213 - 1);
                                    class194.field3175.method257(-2, var214);
                                    continue;
                                }
                                if (var528 == 5003) {
                                    var6--;
                                    int var215 = class253.field4036[var6];
                                    String var216 = null;
                                    if (var215 < 100) {
                                        var216 = class322.field4992[var215];
                                    }
                                    if (var216 == null) {
                                        var216 = "";
                                    }
                                    class276.field4458[var8++] = var216;
                                    continue;
                                }
                                if (var528 == 5004) {
                                    int var217 = -1;
                                    var6--;
                                    int var218 = class253.field4036[var6];
                                    if (var218 < 100 && class322.field4992[var218] != null) {
                                        var217 = class61.field884[var218];
                                    }
                                    class253.field4036[var6++] = var217;
                                    continue;
                                }
                                if (var528 == 5005) {
                                    class253.field4036[var6++] = class8.field118;
                                    continue;
                                }
                                if (var528 == 5008) {
                                    var8--;
                                    String var219 = class276.field4458[var8];
                                    if (!var219.startsWith("::")) {
                                        if (class341.field5311 == 0 && (class178.field2963 && !class320.field4962 || class102.field1487)) {
                                            continue;
                                        }
                                        class327.field5063++;
                                        byte var220 = 0;
                                        String var221 = var219.toLowerCase();
                                        byte var222 = 0;
                                        if (var221.startsWith(class39.field508)) {
                                            var219 = var219.substring(class39.field508.length());
                                            var220 = 0;
                                        } else if (var221.startsWith(class93.field1282)) {
                                            var220 = 1;
                                            var219 = var219.substring(class93.field1282.length());
                                        } else if (var221.startsWith(class39.field506)) {
                                            var219 = var219.substring(class39.field506.length());
                                            var220 = 2;
                                        } else if (var221.startsWith(class21.field307)) {
                                            var220 = 3;
                                            var219 = var219.substring(class21.field307.length());
                                        } else if (var221.startsWith(class32.field425)) {
                                            var219 = var219.substring(class32.field425.length());
                                            var220 = 4;
                                        } else if (var221.startsWith(class209.field3433)) {
                                            var220 = 5;
                                            var219 = var219.substring(class209.field3433.length());
                                        } else if (var221.startsWith(class213.field3476)) {
                                            var219 = var219.substring(class213.field3476.length());
                                            var220 = 6;
                                        } else if (var221.startsWith(class77.field1092)) {
                                            var219 = var219.substring(class77.field1092.length());
                                            var220 = 7;
                                        } else if (var221.startsWith(class260.field4153)) {
                                            var220 = 8;
                                            var219 = var219.substring(class260.field4153.length());
                                        } else if (var221.startsWith(class231.field3672)) {
                                            var219 = var219.substring(class231.field3672.length());
                                            var220 = 9;
                                        } else if (var221.startsWith(class145.field2263)) {
                                            var219 = var219.substring(class145.field2263.length());
                                            var220 = 10;
                                        } else if (var221.startsWith(class137.field2167)) {
                                            var220 = 11;
                                            var219 = var219.substring(class137.field2167.length());
                                        } else if (class8.field121 != 0) {
                                            if (var221.startsWith(class27.field376)) {
                                                var220 = 0;
                                                var219 = var219.substring(class27.field376.length());
                                            } else if (var221.startsWith(class260.field4152)) {
                                                var220 = 1;
                                                var219 = var219.substring(class260.field4152.length());
                                            } else if (var221.startsWith(class319.field4957)) {
                                                var219 = var219.substring(class319.field4957.length());
                                                var220 = 2;
                                            } else if (var221.startsWith(class168.field2778)) {
                                                var220 = 3;
                                                var219 = var219.substring(class168.field2778.length());
                                            } else if (var221.startsWith(class57.field811)) {
                                                var220 = 4;
                                                var219 = var219.substring(class57.field811.length());
                                            } else if (var221.startsWith(class156.field2404)) {
                                                var220 = 5;
                                                var219 = var219.substring(class156.field2404.length());
                                            } else if (var221.startsWith(class172.field2862)) {
                                                var220 = 6;
                                                var219 = var219.substring(class172.field2862.length());
                                            } else if (var221.startsWith(class304.field4776)) {
                                                var219 = var219.substring(class304.field4776.length());
                                                var220 = 7;
                                            } else if (var221.startsWith(class322.field4991)) {
                                                var220 = 8;
                                                var219 = var219.substring(class322.field4991.length());
                                            } else if (var221.startsWith(class159.field2633)) {
                                                var219 = var219.substring(class159.field2633.length());
                                                var220 = 9;
                                            } else if (var221.startsWith(class127.field1987)) {
                                                var220 = 10;
                                                var219 = var219.substring(class127.field1987.length());
                                            } else if (var221.startsWith(class55.field773)) {
                                                var220 = 11;
                                                var219 = var219.substring(class55.field773.length());
                                            }
                                        }
                                        String var223 = var219.toLowerCase();
                                        if (var223.startsWith(class341.field5300)) {
                                            var222 = 1;
                                            var219 = var219.substring(class341.field5300.length());
                                        } else if (var223.startsWith(class226.field3611)) {
                                            var219 = var219.substring(class226.field3611.length());
                                            var222 = 2;
                                        } else if (var223.startsWith(class173.field2874)) {
                                            var222 = 3;
                                            var219 = var219.substring(class173.field2874.length());
                                        } else if (var223.startsWith(class195.field3189)) {
                                            var222 = 4;
                                            var219 = var219.substring(class195.field3189.length());
                                        } else if (var223.startsWith(class318.field4950)) {
                                            var219 = var219.substring(class318.field4950.length());
                                            var222 = 5;
                                        } else if (class8.field121 != 0) {
                                            if (var223.startsWith(class252.field4028)) {
                                                var222 = 1;
                                                var219 = var219.substring(class252.field4028.length());
                                            } else if (var223.startsWith(class190.field3115)) {
                                                var219 = var219.substring(class190.field3115.length());
                                                var222 = 2;
                                            } else if (var223.startsWith(class151.field2329)) {
                                                var222 = 3;
                                                var219 = var219.substring(class151.field2329.length());
                                            } else if (var223.startsWith(class117.field1776)) {
                                                var219 = var219.substring(class117.field1776.length());
                                                var222 = 4;
                                            } else if (var223.startsWith(class187.field3086)) {
                                                var219 = var219.substring(class187.field3086.length());
                                                var222 = 5;
                                            }
                                        }
                                        class194.field3175.method2375(70, 0);
                                        class194.field3175.method257(-2, 0);
                                        int var224 = class194.field3175.field586;
                                        class194.field3175.method257(-2, var220);
                                        class194.field3175.method257(-2, var222);
                                        class98.method664(5, class194.field3175, var219);
                                        class194.field3175.method251(class194.field3175.field586 - var224, false);
                                        continue;
                                    }
                                    class91.method613((byte) 117, var219);
                                    continue;
                                }
                                if (var528 == 5009) {
                                    var8 -= 2;
                                    String var225 = class276.field4458[var8 + 1];
                                    String var226 = class276.field4458[var8];
                                    if (class341.field5311 != 0 || (!class178.field2963 || class320.field4962) && !class102.field1487) {
                                        class194.field3175.method2375(245, 0);
                                        class194.field3175.method257(-2, 0);
                                        int var227 = class194.field3175.field586;
                                        class224.field3570++;
                                        class194.field3175.method255(false, class204.method1491(-26916, var226));
                                        class98.method664(5, class194.field3175, var225);
                                        class194.field3175.method251(class194.field3175.field586 - var227, false);
                                    }
                                    continue;
                                }
                                if (var528 == 5010) {
                                    var6--;
                                    int var228 = class253.field4036[var6];
                                    String var229 = null;
                                    if (var228 < 100) {
                                        var229 = class80.field1122[var228];
                                    }
                                    if (var229 == null) {
                                        var229 = "";
                                    }
                                    class276.field4458[var8++] = var229;
                                    continue;
                                }
                                if (var528 == 5011) {
                                    var6--;
                                    int var230 = class253.field4036[var6];
                                    String var231 = null;
                                    if (var230 < 100) {
                                        var231 = class100.field1459[var230];
                                    }
                                    if (var231 == null) {
                                        var231 = "";
                                    }
                                    class276.field4458[var8++] = var231;
                                    continue;
                                }
                                if (var528 == 5012) {
                                    var6--;
                                    int var232 = class253.field4036[var6];
                                    int var233 = -1;
                                    if (var232 < 100) {
                                        var233 = class319.field4951[var232];
                                    }
                                    class253.field4036[var6++] = var233;
                                    continue;
                                }
                                if (var528 == 5015) {
                                    String var234;
                                    if (class191.field3129 == null || class191.field3129.field5216 == null) {
                                        var234 = class201.field3275;
                                    } else {
                                        var234 = class191.field3129.method2333(true);
                                    }
                                    class276.field4458[var8++] = var234;
                                    continue;
                                }
                                if (var528 == 5016) {
                                    class253.field4036[var6++] = class164.field2737;
                                    continue;
                                }
                                if (var528 == 5017) {
                                    class253.field4036[var6++] = class229.field3645;
                                    continue;
                                }
                                if (var528 == 5050) {
                                    var6--;
                                    int var235 = class253.field4036[var6];
                                    class276.field4458[var8++] = class131.method968(-13, var235).field4630;
                                    continue;
                                }
                                if (var528 == 5051) {
                                    var6--;
                                    int var236 = class253.field4036[var6];
                                    class289 var237 = class131.method968(-13, var236);
                                    if (var237.field4642 == null) {
                                        class253.field4036[var6++] = 0;
                                    } else {
                                        class253.field4036[var6++] = var237.field4642.length;
                                    }
                                    continue;
                                }
                                if (var528 == 5052) {
                                    var6 -= 2;
                                    int var238 = class253.field4036[var6];
                                    int var239 = class253.field4036[var6 + 1];
                                    class289 var240 = class131.method968(-13, var238);
                                    int var241 = var240.field4642[var239];
                                    class253.field4036[var6++] = var241;
                                    continue;
                                }
                                if (var528 == 5053) {
                                    var6--;
                                    int var242 = class253.field4036[var6];
                                    class289 var243 = class131.method968(-13, var242);
                                    if (var243.field4625 == null) {
                                        class253.field4036[var6++] = 0;
                                    } else {
                                        class253.field4036[var6++] = var243.field4625.length;
                                    }
                                    continue;
                                }
                                if (var528 == 5054) {
                                    var6 -= 2;
                                    int var244 = class253.field4036[var6];
                                    int var245 = class253.field4036[var6 + 1];
                                    class253.field4036[var6++] = class131.method968(-13, var244).field4625[var245];
                                    continue;
                                }
                                if (var528 == 5055) {
                                    var6--;
                                    int var246 = class253.field4036[var6];
                                    class276.field4458[var8++] = class310.method2188(var246, false).method1896((byte) -80);
                                    continue;
                                }
                                if (var528 == 5056) {
                                    var6--;
                                    int var247 = class253.field4036[var6];
                                    class268 var248 = class310.method2188(var247, false);
                                    if (var248.field4331 == null) {
                                        class253.field4036[var6++] = 0;
                                    } else {
                                        class253.field4036[var6++] = var248.field4331.length;
                                    }
                                    continue;
                                }
                                if (var528 == 5057) {
                                    var6 -= 2;
                                    int var249 = class253.field4036[var6 + 1];
                                    int var250 = class253.field4036[var6];
                                    class253.field4036[var6++] = class310.method2188(var250, false).field4331[var249];
                                    continue;
                                }
                                if (var528 == 5058) {
                                    class34.field463 = new class123();
                                    var6--;
                                    class34.field463.field1926 = class253.field4036[var6];
                                    class34.field463.field1925 = class310.method2188(class34.field463.field1926, false);
                                    class34.field463.field1922 = new int[class34.field463.field1925.method1899((byte) 32)];
                                    continue;
                                }
                                if (var528 == 5059) {
                                    class339.field5277++;
                                    class194.field3175.method2375(172, 0);
                                    class194.field3175.method257(-2, 0);
                                    int var251 = class194.field3175.field586;
                                    class194.field3175.method257(-2, 0);
                                    class194.field3175.method287(0, class34.field463.field1926);
                                    class34.field463.field1925.method1898(class34.field463.field1922, class194.field3175, (byte) 104);
                                    class194.field3175.method251(class194.field3175.field586 - var251, false);
                                    continue;
                                }
                                if (var528 == 5060) {
                                    class51.field725++;
                                    var8--;
                                    String var252 = class276.field4458[var8];
                                    class194.field3175.method2375(64, 0);
                                    class194.field3175.method257(-2, 0);
                                    int var253 = class194.field3175.field586;
                                    class194.field3175.method255(false, class204.method1491(-26916, var252));
                                    class194.field3175.method287(0, class34.field463.field1926);
                                    class34.field463.field1925.method1898(class34.field463.field1922, class194.field3175, (byte) 104);
                                    class194.field3175.method251(class194.field3175.field586 - var253, false);
                                    continue;
                                }
                                if (var528 == 5061) {
                                    class339.field5277++;
                                    class194.field3175.method2375(172, 0);
                                    class194.field3175.method257(-2, 0);
                                    int var254 = class194.field3175.field586;
                                    class194.field3175.method257(-2, 1);
                                    class194.field3175.method287(0, class34.field463.field1926);
                                    class34.field463.field1925.method1898(class34.field463.field1922, class194.field3175, (byte) 125);
                                    class194.field3175.method251(class194.field3175.field586 - var254, false);
                                    continue;
                                }
                                if (var528 == 5062) {
                                    var6 -= 2;
                                    int var255 = class253.field4036[var6];
                                    int var256 = class253.field4036[var6 + 1];
                                    class253.field4036[var6++] = class131.method968(-13, var255).field4629[var256];
                                    continue;
                                }
                                if (var528 == 5063) {
                                    var6 -= 2;
                                    int var257 = class253.field4036[var6 + 1];
                                    int var258 = class253.field4036[var6];
                                    class253.field4036[var6++] = class131.method968(-13, var258).field4638[var257];
                                    continue;
                                }
                                if (var528 == 5064) {
                                    var6 -= 2;
                                    int var259 = class253.field4036[var6];
                                    int var260 = class253.field4036[var6 + 1];
                                    if (var260 == -1) {
                                        class253.field4036[var6++] = -1;
                                    } else {
                                        class253.field4036[var6++] = class131.method968(-13, var259).method2078(78, (char) var260);
                                    }
                                    continue;
                                }
                                if (var528 == 5065) {
                                    var6 -= 2;
                                    int var261 = class253.field4036[var6];
                                    int var262 = class253.field4036[var6 + 1];
                                    if (var262 == -1) {
                                        class253.field4036[var6++] = -1;
                                    } else {
                                        class253.field4036[var6++] = class131.method968(-13, var261).method2074((char) var262, -126);
                                    }
                                    continue;
                                }
                                if (var528 == 5066) {
                                    var6--;
                                    int var263 = class253.field4036[var6];
                                    class253.field4036[var6++] = class310.method2188(var263, false).method1899((byte) 32);
                                    continue;
                                }
                                if (var528 == 5067) {
                                    var6 -= 2;
                                    int var264 = class253.field4036[var6];
                                    int var265 = class253.field4036[var6 + 1];
                                    int var266 = class310.method2188(var264, false).method1901(var265, -102);
                                    class253.field4036[var6++] = var266;
                                    continue;
                                }
                                if (var528 == 5068) {
                                    var6 -= 2;
                                    int var267 = class253.field4036[var6 + 1];
                                    int var268 = class253.field4036[var6];
                                    class34.field463.field1922[var268] = var267;
                                    continue;
                                }
                                if (var528 == 5069) {
                                    var6 -= 2;
                                    int var269 = class253.field4036[var6];
                                    int var270 = class253.field4036[var6 + 1];
                                    class34.field463.field1922[var269] = var270;
                                    continue;
                                }
                                if (var528 == 5070) {
                                    var6 -= 3;
                                    int var271 = class253.field4036[var6];
                                    int var272 = class253.field4036[var6 + 2];
                                    int var273 = class253.field4036[var6 + 1];
                                    class268 var274 = class310.method2188(var271, false);
                                    if (var274.method1901(var273, -104) != 0) {
                                        throw new RuntimeException("bad command");
                                    }
                                    class253.field4036[var6++] = var274.method1905(var273, (byte) 111, var272);
                                    continue;
                                }
                                if (var528 == 5071) {
                                    var8--;
                                    String var275 = class276.field4458[var8];
                                    var6--;
                                    boolean var276 = class253.field4036[var6] == 1;
                                    class156.method1114(var276, -1, var275);
                                    class253.field4036[var6++] = class219.field3544;
                                    continue;
                                }
                                if (var528 == 5072) {
                                    if (class94.field1287 != null && class219.field3544 > class17.field207) {
                                        class253.field4036[var6++] = client.method767(65535, class94.field1287[class17.field207++]);
                                        continue;
                                    }
                                    class253.field4036[var6++] = -1;
                                    continue;
                                }
                                if (var528 == 5073) {
                                    class17.field207 = 0;
                                    continue;
                                }
                            } else if (var528 < 5200) {
                                if (var528 == 5100) {
                                    if (class117.field1770[86]) {
                                        class253.field4036[var6++] = 1;
                                    } else {
                                        class253.field4036[var6++] = 0;
                                    }
                                    continue;
                                }
                                if (var528 == 5101) {
                                    if (class117.field1770[82]) {
                                        class253.field4036[var6++] = 1;
                                    } else {
                                        class253.field4036[var6++] = 0;
                                    }
                                    continue;
                                }
                                if (var528 == 5102) {
                                    if (class117.field1770[81]) {
                                        class253.field4036[var6++] = 1;
                                    } else {
                                        class253.field4036[var6++] = 0;
                                    }
                                    continue;
                                }
                            } else if (var528 < 5300) {
                                if (var528 == 5200) {
                                    var6--;
                                    class152.method1103(-1, class253.field4036[var6]);
                                    continue;
                                }
                                if (var528 == 5201) {
                                    class253.field4036[var6++] = class327.method2292(200);
                                    continue;
                                }
                                if (var528 == 5202) {
                                    var6--;
                                    class273.method1971(-112, class253.field4036[var6]);
                                    continue;
                                }
                                if (var528 == 5203) {
                                    var8--;
                                    class246.method1761(69, class276.field4458[var8]);
                                    continue;
                                }
                                if (var528 == 5204) {
                                    class276.field4458[var8 - 1] = class197.method1450(class276.field4458[var8 - 1], false);
                                    continue;
                                }
                                if (var528 == 5205) {
                                    var6--;
                                    class26.method149(-1, -1, class253.field4036[var6], 29681);
                                    continue;
                                }
                                if (var528 == 5206) {
                                    var6--;
                                    int var277 = class253.field4036[var6];
                                    class291 var278 = class301.method2148(-1, var277 & 0x3FFF, var277 >> 14 & 0x3FFF);
                                    if (var278 == null) {
                                        class253.field4036[var6++] = -1;
                                    } else {
                                        class253.field4036[var6++] = var278.field4658;
                                    }
                                    continue;
                                }
                                if (var528 == 5207) {
                                    var6--;
                                    class291 var279 = class100.method689(false, class253.field4036[var6]);
                                    if (var279 != null && var279.field4666 != null) {
                                        class276.field4458[var8++] = var279.field4666;
                                        continue;
                                    }
                                    class276.field4458[var8++] = "";
                                    continue;
                                }
                                if (var528 == 5208) {
                                    class253.field4036[var6++] = class307.field4785;
                                    class253.field4036[var6++] = class202.field3281;
                                    continue;
                                }
                                if (var528 == 5209) {
                                    class253.field4036[var6++] = class139.field2195 + class27.field377;
                                    class253.field4036[var6++] = class74.field1048 + class93.field1276 - class91.field1254 - 1;
                                    continue;
                                }
                                if (var528 == 5210) {
                                    var6--;
                                    int var280 = class253.field4036[var6];
                                    class291 var281 = class100.method689(false, var280);
                                    if (var281 == null) {
                                        class253.field4036[var6++] = 0;
                                        class253.field4036[var6++] = 0;
                                    } else {
                                        class253.field4036[var6++] = client.method767(var281.field4655, 268429907) >> 14;
                                        class253.field4036[var6++] = client.method767(16383, var281.field4655);
                                    }
                                    continue;
                                }
                                if (var528 == 5211) {
                                    var6--;
                                    int var282 = class253.field4036[var6];
                                    class291 var283 = class100.method689(false, var282);
                                    if (var283 == null) {
                                        class253.field4036[var6++] = 0;
                                        class253.field4036[var6++] = 0;
                                    } else {
                                        class253.field4036[var6++] = var283.field4659 - var283.field4645;
                                        class253.field4036[var6++] = var283.field4646 - var283.field4651;
                                    }
                                    continue;
                                }
                                if (var528 == 5212) {
                                    int var284 = class229.method1625(1);
                                    int var285 = 0;
                                    String var286;
                                    if (var284 == -1) {
                                        var286 = "";
                                    } else {
                                        var286 = class20.field289.field3262[var284];
                                        var285 = class20.field289.method1467(var284, true);
                                    }
                                    String var287 = class115.method791(122, " ", "<br>", var286);
                                    class276.field4458[var8++] = var287;
                                    class253.field4036[var6++] = var285;
                                    continue;
                                }
                                if (var528 == 5213) {
                                    int var288 = class304.method2164((byte) 82);
                                    int var289 = 0;
                                    String var290;
                                    if (var288 == -1) {
                                        var290 = "";
                                    } else {
                                        var290 = class20.field289.field3262[var288];
                                        var289 = class20.field289.method1467(var288, true);
                                    }
                                    String var291 = class115.method791(-8, " ", "<br>", var290);
                                    class276.field4458[var8++] = var291;
                                    class253.field4036[var6++] = var289;
                                    continue;
                                }
                                if (var528 == 5214) {
                                    var6--;
                                    int var292 = class253.field4036[var6];
                                    class291 var293 = class25.method139(false);
                                    if (var293 != null) {
                                        int[] var294 = var293.method2086((var292 & 0xFFFC11B) >> 14, (byte) 108, var292 >> 28 & 0x3, var292 & 0x3FFF);
                                        if (var294 != null) {
                                            class141.method1045(var294[2], -25697, var294[1]);
                                        }
                                    }
                                    continue;
                                }
                                if (var528 == 5215) {
                                    var6 -= 2;
                                    int var295 = class253.field4036[var6 + 1];
                                    int var296 = class253.field4036[var6];
                                    class191 var297 = class235.method1702((byte) 102, var296 & 0x3FFF, (var296 & 0xFFFCAE3) >> 14);
                                    boolean var298 = false;
                                    for (class291 var299 = (class291) var297.method1419(200); var299 != null; var299 = (class291) var297.method1416((byte) -128)) {
                                        if (var299.field4658 == var295) {
                                            var298 = true;
                                            break;
                                        }
                                    }
                                    if (var298) {
                                        class253.field4036[var6++] = 1;
                                    } else {
                                        class253.field4036[var6++] = 0;
                                    }
                                    continue;
                                }
                                if (var528 == 5216) {
                                    var6--;
                                    int var300 = class253.field4036[var6];
                                    class231.method1636(var300, (byte) 52);
                                    continue;
                                }
                                if (var528 == 5217) {
                                    var6--;
                                    int var301 = class253.field4036[var6];
                                    if (class311.method2195((byte) 93, var301)) {
                                        class253.field4036[var6++] = 1;
                                    } else {
                                        class253.field4036[var6++] = 0;
                                    }
                                    continue;
                                }
                                if (var528 == 5218) {
                                    var6--;
                                    int var302 = class253.field4036[var6];
                                    class291 var303 = class100.method689(false, var302);
                                    if (var303 == null) {
                                        class253.field4036[var6++] = -1;
                                    } else {
                                        class253.field4036[var6++] = var303.field4660;
                                    }
                                    continue;
                                }
                                if (var528 == 5219) {
                                    var8--;
                                    class260.method1857(class276.field4458[var8], 120);
                                    continue;
                                }
                                if (var528 == 5220) {
                                    class253.field4036[var6++] = class52.field738 == 100 ? 1 : 0;
                                    continue;
                                }
                                if (var528 == 5221) {
                                    var6--;
                                    int var304 = class253.field4036[var6];
                                    class141.method1045(var304 & 0x3FFF, -25697, (var304 & 0xFFFF85F) >> 14);
                                    continue;
                                }
                                if (var528 == 5222) {
                                    class291 var305 = class25.method139(false);
                                    if (var305 == null) {
                                        class253.field4036[var6++] = -1;
                                        class253.field4036[var6++] = -1;
                                    } else {
                                        int[] var306 = var305.method2085((byte) -91, class74.field1048 + class93.field1276 - class91.field1254 - 1, class139.field2195 - -class27.field377);
                                        if (var306 == null) {
                                            class253.field4036[var6++] = -1;
                                            class253.field4036[var6++] = -1;
                                        } else {
                                            class253.field4036[var6++] = var306[1];
                                            class253.field4036[var6++] = var306[2];
                                        }
                                    }
                                    continue;
                                }
                                if (var528 == 5223) {
                                    var6 -= 2;
                                    int var307 = class253.field4036[var6];
                                    int var308 = class253.field4036[var6 + 1];
                                    class26.method149(var308 & 0x3FFF, var308 >> 14 & 0x3FFF, var307, 29681);
                                    continue;
                                }
                                if (var528 == 5224) {
                                    var6--;
                                    int var309 = class253.field4036[var6];
                                    class291 var310 = class25.method139(false);
                                    if (var310 == null) {
                                        class253.field4036[var6++] = -1;
                                        class253.field4036[var6++] = -1;
                                    } else {
                                        int[] var311 = var310.method2086((var309 & 0xFFFE96D) >> 14, (byte) 48, (var309 & 0x3DD420D3) >> 28, var309 & 0x3FFF);
                                        if (var311 == null) {
                                            class253.field4036[var6++] = -1;
                                            class253.field4036[var6++] = -1;
                                        } else {
                                            class253.field4036[var6++] = var311[1];
                                            class253.field4036[var6++] = var311[2];
                                        }
                                    }
                                    continue;
                                }
                                if (var528 == 5225) {
                                    var6--;
                                    int var312 = class253.field4036[var6];
                                    class291 var313 = class25.method139(false);
                                    if (var313 == null) {
                                        class253.field4036[var6++] = -1;
                                        class253.field4036[var6++] = -1;
                                    } else {
                                        int[] var314 = var313.method2085((byte) -91, var312 & 0x3FFF, (var312 & 0xFFFD4FA) >> 14);
                                        if (var314 == null) {
                                            class253.field4036[var6++] = -1;
                                            class253.field4036[var6++] = -1;
                                        } else {
                                            class253.field4036[var6++] = var314[1];
                                            class253.field4036[var6++] = var314[2];
                                        }
                                    }
                                    continue;
                                }
                            } else if (var528 < 5400) {
                                if (var528 == 5300) {
                                    var6 -= 2;
                                    int var315 = class253.field4036[var6];
                                    int var316 = class253.field4036[var6 + 1];
                                    class8.method43(3, false, 0, var316, var315);
                                    class253.field4036[var6++] = class204.field3362 == null ? 0 : 1;
                                    continue;
                                }
                                if (var528 == 5301) {
                                    if (class204.field3362 != null) {
                                        class8.method43(class318.field4946, false, 0, -1, -1);
                                    }
                                    continue;
                                }
                                if (var528 == 5302) {
                                    class167[] var317 = class271.method1922(800);
                                    class253.field4036[var6++] = var317.length;
                                    continue;
                                }
                                if (var528 == 5303) {
                                    var6--;
                                    int var318 = class253.field4036[var6];
                                    class167[] var319 = class271.method1922(800);
                                    class253.field4036[var6++] = var319[var318].field2764;
                                    class253.field4036[var6++] = var319[var318].field2767;
                                    continue;
                                }
                                if (var528 == 5305) {
                                    int var320 = class70.field994;
                                    int var321 = -1;
                                    int var322 = class45.field634;
                                    class167[] var323 = class271.method1922(800);
                                    for (int var324 = 0; var324 < var323.length; var324++) {
                                        class167 var325 = var323[var324];
                                        if (var325.field2764 == var320 && var325.field2767 == var322) {
                                            var321 = var324;
                                            break;
                                        }
                                    }
                                    class253.field4036[var6++] = var321;
                                    continue;
                                }
                                if (var528 == 5306) {
                                    class253.field4036[var6++] = class204.method1490((byte) 59);
                                    continue;
                                }
                                if (var528 == 5307) {
                                    var6--;
                                    int var326 = class253.field4036[var6];
                                    if (var326 < 0 || var326 > 2) {
                                        var326 = 0;
                                    }
                                    class8.method43(var326, false, 0, -1, -1);
                                    continue;
                                }
                                if (var528 == 5308) {
                                    class253.field4036[var6++] = class318.field4946;
                                    continue;
                                }
                                if (var528 == 5309) {
                                    var6--;
                                    int var327 = class253.field4036[var6];
                                    if (var327 < 0 || var327 > 2) {
                                        var327 = 0;
                                    }
                                    class318.field4946 = var327;
                                    class61.method412(class14.field159, 3);
                                    continue;
                                }
                            } else if (var528 < 5500) {
                                if (var528 == 5400) {
                                    class211.field3456++;
                                    var8 -= 2;
                                    String var371 = class276.field4458[var8];
                                    var6--;
                                    int var372 = class253.field4036[var6];
                                    String var373 = class276.field4458[var8 + 1];
                                    class194.field3175.method2375(101, 0);
                                    class194.field3175.method257(-2, (class77.method527((byte) -62, var371) + class77.method527((byte) -96, var373)) + 1);
                                    class194.field3175.method231(23573, var371);
                                    class194.field3175.method231(23573, var373);
                                    class194.field3175.method257(-2, var372);
                                    continue;
                                }
                                if (var528 == 5401) {
                                    var6 -= 2;
                                    class190.field3109[class253.field4036[var6]] = (short) class187.method1394(class253.field4036[var6 + 1], 123);
                                    class39.method205(18);
                                    class253.method1821((byte) -86);
                                    class215.method1544((byte) 36);
                                    class84.method571((byte) 120);
                                    class320.method2255(true);
                                    continue;
                                }
                                if (var528 == 5405) {
                                    var6 -= 2;
                                    int var374 = class253.field4036[var6];
                                    int var375 = class253.field4036[var6 + 1];
                                    if (var374 >= 0 && var374 < 2) {
                                        class275.field4444[var374] = new int[var375 << 1][4];
                                    }
                                    continue;
                                }
                                if (var528 == 5406) {
                                    var6 -= 7;
                                    int var376 = class253.field4036[var6];
                                    int var377 = class253.field4036[var6 + 1] << 1;
                                    int var378 = class253.field4036[var6 + 3];
                                    int var379 = class253.field4036[var6 + 2];
                                    int var380 = class253.field4036[var6 + 4];
                                    int var381 = class253.field4036[var6 + 5];
                                    int var382 = class253.field4036[var6 + 6];
                                    if (var376 >= 0 && var376 < 2 && class275.field4444[var376] != null && var377 >= 0 && class275.field4444[var376].length > var377) {
                                        class275.field4444[var376][var377] = new int[] { client.method767(16383, var379 >> 14) * 128, var378, client.method767(16383, var379) * 128, var382 };
                                        class275.field4444[var376][var377 + 1] = new int[] { (client.method767(268425073, var380) >> 14) * 128, var381, client.method767(16383, var380) * 128 };
                                    }
                                    continue;
                                }
                                if (var528 == 5407) {
                                    var6--;
                                    int var383 = class275.field4444[class253.field4036[var6]].length >> 1;
                                    class253.field4036[var6++] = var383;
                                    continue;
                                }
                                if (var528 == 5411) {
                                    if (class204.field3362 != null) {
                                        class8.method43(class318.field4946, false, 0, -1, -1);
                                    }
                                    if (class278.field4482 == null) {
                                        class110.method763(class67.method449((byte) 127), -20206, false);
                                    } else {
                                        System.exit(0);
                                    }
                                    continue;
                                }
                                if (var528 == 5419) {
                                    String var384 = "";
                                    if (class322.field4983 != null) {
                                        if (class322.field4983.field2664 == null) {
                                            var384 = class160.method1144(class322.field4983.field2665, (byte) 97);
                                        } else {
                                            var384 = (String) class322.field4983.field2664;
                                        }
                                    }
                                    class276.field4458[var8++] = var384;
                                    continue;
                                }
                                if (var528 == 5420) {
                                    class253.field4036[var6++] = class124.field1933 == 3 ? 1 : 0;
                                    continue;
                                }
                                if (var528 == 5421) {
                                    if (class204.field3362 != null) {
                                        class8.method43(class318.field4946, false, 0, -1, -1);
                                    }
                                    var8--;
                                    String var385 = class276.field4458[var8];
                                    var6--;
                                    boolean var386 = class253.field4036[var6] == 1;
                                    String var387 = class67.method449((byte) 127) + var385;
                                    if (class278.field4482 != null || var386 && class124.field1933 != 3 && class124.field1932.startsWith("win") && !class27.field379) {
                                        class208.field3419 = var386;
                                        class315.field4873 = var387;
                                        class4.field72 = class14.field159.method890(var387, 0);
                                        continue;
                                    }
                                    class110.method763(var387, -20206, var386);
                                    continue;
                                }
                                if (var528 == 5422) {
                                    var8 -= 2;
                                    String var388 = class276.field4458[var8];
                                    String var389 = class276.field4458[var8 + 1];
                                    var6--;
                                    int var390 = class253.field4036[var6];
                                    if (var388.length() > 0) {
                                        if (class311.field4845 == null) {
                                            class311.field4845 = new String[class243.field3845[class15.field169]];
                                        }
                                        class311.field4845[var390] = var388;
                                    }
                                    if (var389.length() > 0) {
                                        if (class23.field325 == null) {
                                            class23.field325 = new String[class243.field3845[class15.field169]];
                                        }
                                        class23.field325[var390] = var389;
                                    }
                                    continue;
                                }
                                if (var528 == 5423) {
                                    var8--;
                                    System.out.println(class276.field4458[var8]);
                                    continue;
                                }
                                if (var528 == 5424) {
                                    var6 -= 11;
                                    class229.field3634 = class253.field4036[var6];
                                    class193.field3163 = class253.field4036[var6 + 1];
                                    class51.field733 = class253.field4036[var6 + 2];
                                    class14.field166 = class253.field4036[var6 + 3];
                                    class333.field5190 = class253.field4036[var6 + 4];
                                    class225.field3598 = class253.field4036[var6 + 5];
                                    class229.field3649 = class253.field4036[var6 + 6];
                                    class193.field3159 = class253.field4036[var6 + 7];
                                    class119.field1816 = class253.field4036[var6 + 8];
                                    class200.field3245 = class253.field4036[var6 + 9];
                                    class187.field3084 = class253.field4036[var6 + 10];
                                    class130.field2034.method1276(class333.field5190, -128);
                                    class130.field2034.method1276(class225.field3598, 120);
                                    class130.field2034.method1276(class229.field3649, 118);
                                    class130.field2034.method1276(class193.field3159, -125);
                                    class130.field2034.method1276(class119.field1816, -46);
                                    class52.field737 = true;
                                    continue;
                                }
                                if (var528 == 5425) {
                                    class225.method1598(-112);
                                    class52.field737 = false;
                                    continue;
                                }
                                if (var528 == 5426) {
                                    var6--;
                                    class291.field4663 = class253.field4036[var6];
                                    continue;
                                }
                                if (var528 == 5427) {
                                    var6 -= 2;
                                    class223.field3562 = class253.field4036[var6];
                                    class227.field3622 = class253.field4036[var6 + 1];
                                    continue;
                                }
                                if (var528 == 5428) {
                                    var6 -= 2;
                                    int var391 = class253.field4036[var6];
                                    int var392 = class253.field4036[var6 + 1];
                                    class253.field4036[var6++] = class23.method128(-89, var391, var392) ? 1 : 0;
                                    continue;
                                }
                            } else if (var528 < 5600) {
                                if (var528 == 5500) {
                                    var6 -= 4;
                                    int var328 = class253.field4036[var6];
                                    int var329 = class253.field4036[var6 + 1];
                                    int var330 = class253.field4036[var6 + 3];
                                    int var331 = class253.field4036[var6 + 2];
                                    class101.method696(false, var330, var329, (var328 >> 14 & 0x3FFF) - class70.field989, -10335, (var328 & 0x3FFF) - class205.field3367, var331);
                                    continue;
                                }
                                if (var528 == 5501) {
                                    var6 -= 4;
                                    int var332 = class253.field4036[var6];
                                    int var333 = class253.field4036[var6 + 1];
                                    int var334 = class253.field4036[var6 + 2];
                                    int var335 = class253.field4036[var6 + 3];
                                    class190.method1409(var334, var333, (var332 & 0x3FFF) - class205.field3367, var335, ((var332 & 0xFFFE0AF) >> 14) - class70.field989, 2);
                                    continue;
                                }
                                if (var528 == 5502) {
                                    var6 -= 6;
                                    int var336 = class253.field4036[var6];
                                    if (var336 >= 2) {
                                        throw new RuntimeException();
                                    }
                                    class233.field3743 = var336;
                                    int var337 = class253.field4036[var6 + 1];
                                    if (class275.field4444[class233.field3743].length >> 1 <= var337 + 1) {
                                        throw new RuntimeException();
                                    }
                                    class81.field1136 = 0;
                                    class144.field2238 = var337;
                                    class34.field454 = class253.field4036[var6 + 2];
                                    class231.field3677 = class253.field4036[var6 + 3];
                                    int var338 = class253.field4036[var6 + 4];
                                    if (var338 >= 2) {
                                        throw new RuntimeException();
                                    }
                                    class178.field2961 = var338;
                                    int var339 = class253.field4036[var6 + 5];
                                    if (var339 + 1 >= class275.field4444[class178.field2961].length >> 1) {
                                        throw new RuntimeException();
                                    }
                                    class287.field4600 = var339;
                                    class31.field423 = 3;
                                    continue;
                                }
                                if (var528 == 5503) {
                                    class55.method351(-1);
                                    continue;
                                }
                                if (var528 == 5504) {
                                    var6 -= 2;
                                    class179.method1345(-3, class253.field4036[var6], class253.field4036[var6 + 1]);
                                    continue;
                                }
                                if (var528 == 5505) {
                                    class253.field4036[var6++] = (int) class97.field1386;
                                    continue;
                                }
                                if (var528 == 5506) {
                                    class253.field4036[var6++] = (int) class330.field5090;
                                    continue;
                                }
                                if (var528 == 5507) {
                                    class310.method2190(127);
                                    continue;
                                }
                                if (var528 == 5508) {
                                    class137.method1020(-53);
                                    continue;
                                }
                                if (var528 == 5509) {
                                    class65.method440(true);
                                    continue;
                                }
                                if (var528 == 5510) {
                                    class78.method533((byte) -121);
                                    continue;
                                }
                                if (var528 == 5512) {
                                    class24.method132((byte) -36);
                                    continue;
                                }
                            } else if (var528 < 5700) {
                                if (var528 == 5600) {
                                    var8 -= 2;
                                    String var367 = class276.field4458[var8];
                                    String var368 = class276.field4458[var8 + 1];
                                    var6--;
                                    int var369 = class253.field4036[var6];
                                    if (class5.field75 == 10 && class145.field2254 == 0 && class70.field996 == 0 && class149.field2318 == 0 && class159.field2622 == 0) {
                                        method2055(var367, var368, 76, var369);
                                    }
                                    continue;
                                }
                                if (var528 == 5601) {
                                    class105.method718((byte) 41);
                                    continue;
                                }
                                if (var528 == 5602) {
                                    if (class70.field996 == 0) {
                                        class39.field514 = -2;
                                    }
                                    continue;
                                }
                                if (var528 == 5603) {
                                    var6 -= 4;
                                    if (class5.field75 == 10 && class145.field2254 == 0 && class70.field996 == 0 && class149.field2318 == 0 && class159.field2622 == 0) {
                                        class185.method1389(class253.field4036[var6 + 3], class253.field4036[var6 + 1], 0, class253.field4036[var6 + 2], class253.field4036[var6]);
                                    }
                                    continue;
                                }
                                if (var528 == 5604) {
                                    var8--;
                                    if (class5.field75 == 10 && class145.field2254 == 0 && class70.field996 == 0 && class149.field2318 == 0 && class159.field2622 == 0) {
                                        class34.method188(-101, class204.method1491(-26916, class276.field4458[var8]));
                                    }
                                    continue;
                                }
                                if (var528 == 5605) {
                                    var6 -= 7;
                                    var8 -= 3;
                                    if (class5.field75 == 10 && class145.field2254 == 0 && class70.field996 == 0 && class149.field2318 == 0 && class159.field2622 == 0) {
                                        class178.method1339(class276.field4458[var8 + 2], class276.field4458[var8 + 1], class253.field4036[var6 + 5] == 1, class253.field4036[var6 + 2], class253.field4036[var6 + 1], class253.field4036[var6 + 3], false, class253.field4036[var6 + 6] == 1, class204.method1491(-26916, class276.field4458[var8]), class253.field4036[var6 + 4] == 1, class253.field4036[var6]);
                                    }
                                    continue;
                                }
                                if (var528 == 5606) {
                                    if (class149.field2318 == 0) {
                                        class31.field416 = -2;
                                    }
                                    continue;
                                }
                                if (var528 == 5607) {
                                    class253.field4036[var6++] = class39.field514;
                                    continue;
                                }
                                if (var528 == 5608) {
                                    class253.field4036[var6++] = class217.field3518;
                                    continue;
                                }
                                if (var528 == 5609) {
                                    class253.field4036[var6++] = class31.field416;
                                    continue;
                                }
                                if (var528 == 5610) {
                                    for (int var370 = 0; var370 < 5; var370++) {
                                        class276.field4458[var8++] = class287.field4596.length > var370 ? class320.method2250((byte) -76, class287.field4596[var370]) : "";
                                    }
                                    class287.field4596 = null;
                                    continue;
                                }
                                if (var528 == 5611) {
                                    class253.field4036[var6++] = class343.field5330;
                                    continue;
                                }
                            } else if (var528 < 6100) {
                                if (var528 == 6001) {
                                    var6--;
                                    int var340 = class253.field4036[var6];
                                    if (var340 < 1) {
                                        var340 = 1;
                                    }
                                    if (var340 > 4) {
                                        var340 = 4;
                                    }
                                    class149.field2311 = var340;
                                    if (!class232.field3690 || !class322.field4994) {
                                        if (class149.field2311 == 1) {
                                            class170.method1243(0.9F);
                                        }
                                        if (class149.field2311 == 2) {
                                            class170.method1243(0.8F);
                                        }
                                        if (class149.field2311 == 3) {
                                            class170.method1243(0.7F);
                                        }
                                        if (class149.field2311 == 4) {
                                            class170.method1243(0.6F);
                                        }
                                    }
                                    if (class232.field3690) {
                                        class196.method1441((byte) -98);
                                        if (!class322.field4994) {
                                            class103.method710(-5);
                                        }
                                    }
                                    class253.method1821((byte) -112);
                                    class61.method412(class14.field159, 3);
                                    class316.field4888 = false;
                                    continue;
                                }
                                if (var528 == 6002) {
                                    var6--;
                                    class73.method488(87, class253.field4036[var6] == 1);
                                    class338.method2357(false);
                                    class103.method710(-5);
                                    class277.method2004(-128);
                                    class61.method412(class14.field159, 3);
                                    class316.field4888 = false;
                                    continue;
                                }
                                if (var528 == 6003) {
                                    var6--;
                                    class273.field4410 = class253.field4036[var6] == 1;
                                    class277.method2004(-82);
                                    class61.method412(class14.field159, 3);
                                    class316.field4888 = false;
                                    continue;
                                }
                                if (var528 == 6005) {
                                    var6--;
                                    class297.field4695 = class253.field4036[var6] == 1;
                                    class103.method710(-5);
                                    class61.method412(class14.field159, 3);
                                    class316.field4888 = false;
                                    continue;
                                }
                                if (var528 == 6006) {
                                    var6--;
                                    class245.field3863 = class253.field4036[var6] == 1;
                                    ((class130) class170.field2814).method954(!class245.field3863, 64);
                                    class61.method412(class14.field159, 3);
                                    class316.field4888 = false;
                                    continue;
                                }
                                if (var528 == 6007) {
                                    var6--;
                                    class322.field4989 = class253.field4036[var6] == 1;
                                    class61.method412(class14.field159, 3);
                                    class316.field4888 = false;
                                    continue;
                                }
                                if (var528 == 6008) {
                                    var6--;
                                    class42.field535 = class253.field4036[var6] == 1;
                                    class61.method412(class14.field159, 3);
                                    class316.field4888 = false;
                                    continue;
                                }
                                if (var528 == 6009) {
                                    var6--;
                                    class8.field123 = class253.field4036[var6] == 1;
                                    class61.method412(class14.field159, 3);
                                    class316.field4888 = false;
                                    continue;
                                }
                                if (var528 == 6010) {
                                    var6--;
                                    class180.field2984 = class253.field4036[var6] == 1;
                                    class61.method412(class14.field159, 3);
                                    class316.field4888 = false;
                                    continue;
                                }
                                if (var528 == 6011) {
                                    var6--;
                                    int var341 = class253.field4036[var6];
                                    if (var341 < 0 || var341 > 2) {
                                        var341 = 0;
                                    }
                                    class18.field250 = var341;
                                    class61.method412(class14.field159, 3);
                                    class316.field4888 = false;
                                    continue;
                                }
                                if (var528 == 6012) {
                                    if (class232.field3690) {
                                        class179.method1343(0, 0, -3);
                                    }
                                    var6--;
                                    class322.field4994 = class253.field4036[var6] == 1;
                                    if (class232.field3690 && class322.field4994) {
                                        class170.method1243(0.7F);
                                    } else {
                                        if (class149.field2311 == 1) {
                                            class170.method1243(0.9F);
                                        }
                                        if (class149.field2311 == 2) {
                                            class170.method1243(0.8F);
                                        }
                                        if (class149.field2311 == 3) {
                                            class170.method1243(0.7F);
                                        }
                                        if (class149.field2311 == 4) {
                                            class170.method1243(0.6F);
                                        }
                                    }
                                    class103.method710(-5);
                                    class61.method412(class14.field159, 3);
                                    class316.field4888 = false;
                                    continue;
                                }
                                if (var528 == 6014) {
                                    var6--;
                                    class245.field3872 = class253.field4036[var6] == 1;
                                    if (class232.field3690) {
                                        class103.method710(-5);
                                    }
                                    class61.method412(class14.field159, 3);
                                    class316.field4888 = false;
                                    continue;
                                }
                                if (var528 == 6015) {
                                    var6--;
                                    class43.field541 = class253.field4036[var6] == 1;
                                    if (class232.field3690) {
                                        class196.method1441((byte) -123);
                                    }
                                    class61.method412(class14.field159, 3);
                                    class316.field4888 = false;
                                    continue;
                                }
                                if (var528 == 6016) {
                                    var6--;
                                    int var342 = class253.field4036[var6];
                                    if (var342 < 0 || var342 > 2) {
                                        var342 = 0;
                                    }
                                    class185.field3065 = var342;
                                    if (class232.field3690) {
                                        class129.field2013 = true;
                                    }
                                    continue;
                                }
                                if (var528 == 6017) {
                                    var6--;
                                    class152.field2352 = class253.field4036[var6] == 1;
                                    class97.method649(105);
                                    class61.method412(class14.field159, 3);
                                    class316.field4888 = false;
                                    continue;
                                }
                                if (var528 == 6018) {
                                    var6--;
                                    int var343 = class253.field4036[var6];
                                    if (var343 < 0) {
                                        var343 = 0;
                                    }
                                    if (var343 > 127) {
                                        var343 = 127;
                                    }
                                    class261.field4169 = var343;
                                    class61.method412(class14.field159, 3);
                                    class316.field4888 = false;
                                    continue;
                                }
                                if (var528 == 6019) {
                                    var6--;
                                    int var344 = class253.field4036[var6];
                                    if (var344 < 0) {
                                        var344 = 0;
                                    }
                                    if (var344 > 255) {
                                        var344 = 255;
                                    }
                                    if (class210.field3447 != var344) {
                                        if (class210.field3447 == 0 && class108.field1584 != -1) {
                                            class10.method54(false, 0, 10000, class243.field3846, class108.field1584, var344);
                                            class137.field2164 = false;
                                        } else if (var344 == 0) {
                                            class224.method1592((byte) -104);
                                            class137.field2164 = false;
                                        } else {
                                            class273.method1973(-1, var344);
                                        }
                                        class210.field3447 = var344;
                                    }
                                    class61.method412(class14.field159, 3);
                                    class316.field4888 = false;
                                    continue;
                                }
                                if (var528 == 6020) {
                                    var6--;
                                    int var345 = class253.field4036[var6];
                                    if (var345 < 0) {
                                        var345 = 0;
                                    }
                                    if (var345 > 127) {
                                        var345 = 127;
                                    }
                                    class174.field2883 = var345;
                                    class61.method412(class14.field159, 3);
                                    class316.field4888 = false;
                                    continue;
                                }
                                if (var528 == 6021) {
                                    var6--;
                                    class310.field4838 = class253.field4036[var6] == 1;
                                    class277.method2004(-78);
                                    continue;
                                }
                                if (var528 == 6023) {
                                    var6--;
                                    int var346 = class253.field4036[var6];
                                    boolean var347 = false;
                                    if (var346 < 0) {
                                        var346 = 0;
                                    }
                                    if (var346 > 2) {
                                        var346 = 2;
                                    }
                                    if (class36.field480 < 96) {
                                        var346 = 0;
                                        var347 = true;
                                    }
                                    class294.method2101(var346);
                                    class61.method412(class14.field159, 3);
                                    class316.field4888 = false;
                                    class253.field4036[var6++] = var347 ? 0 : 1;
                                    continue;
                                }
                                if (var528 == 6024) {
                                    var6--;
                                    int var348 = class253.field4036[var6];
                                    if (var348 < 0 || var348 > 2) {
                                        var348 = 0;
                                    }
                                    class34.field460 = var348;
                                    class61.method412(class14.field159, 3);
                                    continue;
                                }
                                if (var528 == 6027) {
                                    var6--;
                                    int var349 = class253.field4036[var6];
                                    if (!class232.field3690) {
                                        continue;
                                    }
                                    if (var349 < 0 || var349 > 1) {
                                        var349 = 0;
                                    }
                                    class127.method924(var349 == 1, (byte) 71);
                                    continue;
                                }
                                if (var528 == 6028) {
                                    var6--;
                                    class231.field3681 = class253.field4036[var6] != 0;
                                    class61.method412(class14.field159, 3);
                                    continue;
                                }
                            } else if (var528 < 6200) {
                                if (var528 == 6101) {
                                    class253.field4036[var6++] = class149.field2311;
                                    continue;
                                }
                                if (var528 == 6102) {
                                    class253.field4036[var6++] = class76.method518(-19076) ? 1 : 0;
                                    continue;
                                }
                                if (var528 == 6103) {
                                    class253.field4036[var6++] = class273.field4410 ? 1 : 0;
                                    continue;
                                }
                                if (var528 == 6105) {
                                    class253.field4036[var6++] = class297.field4695 ? 1 : 0;
                                    continue;
                                }
                                if (var528 == 6106) {
                                    class253.field4036[var6++] = class245.field3863 ? 1 : 0;
                                    continue;
                                }
                                if (var528 == 6107) {
                                    class253.field4036[var6++] = class322.field4989 ? 1 : 0;
                                    continue;
                                }
                                if (var528 == 6108) {
                                    class253.field4036[var6++] = class42.field535 ? 1 : 0;
                                    continue;
                                }
                                if (var528 == 6109) {
                                    class253.field4036[var6++] = class8.field123 ? 1 : 0;
                                    continue;
                                }
                                if (var528 == 6110) {
                                    class253.field4036[var6++] = class180.field2984 ? 1 : 0;
                                    continue;
                                }
                                if (var528 == 6111) {
                                    class253.field4036[var6++] = class18.field250;
                                    continue;
                                }
                                if (var528 == 6112) {
                                    class253.field4036[var6++] = class322.field4994 ? 1 : 0;
                                    continue;
                                }
                                if (var528 == 6114) {
                                    class253.field4036[var6++] = class245.field3872 ? 1 : 0;
                                    continue;
                                }
                                if (var528 == 6115) {
                                    class253.field4036[var6++] = class43.field541 ? 1 : 0;
                                    continue;
                                }
                                if (var528 == 6116) {
                                    class253.field4036[var6++] = class185.field3065;
                                    continue;
                                }
                                if (var528 == 6117) {
                                    class253.field4036[var6++] = class152.field2352 ? 1 : 0;
                                    continue;
                                }
                                if (var528 == 6118) {
                                    class253.field4036[var6++] = class261.field4169;
                                    continue;
                                }
                                if (var528 == 6119) {
                                    class253.field4036[var6++] = class210.field3447;
                                    continue;
                                }
                                if (var528 == 6120) {
                                    class253.field4036[var6++] = class174.field2883;
                                    continue;
                                }
                                if (var528 == 6121) {
                                    if (class232.field3690) {
                                        class253.field4036[var6++] = class232.field3728 ? 1 : 0;
                                    } else {
                                        class253.field4036[var6++] = 0;
                                    }
                                    continue;
                                }
                                if (var528 == 6123) {
                                    class253.field4036[var6++] = class294.method2104();
                                    continue;
                                }
                                if (var528 == 6124) {
                                    class253.field4036[var6++] = class34.field460;
                                    continue;
                                }
                                if (var528 == 6126) {
                                    if (class232.field3690) {
                                        class253.field4036[var6++] = class269.method1914() ? 1 : 0;
                                    } else {
                                        class253.field4036[var6++] = 0;
                                    }
                                    continue;
                                }
                                if (var528 == 6127) {
                                    class253.field4036[var6++] = class79.field1111 ? 1 : 0;
                                    continue;
                                }
                                if (var528 == 6128) {
                                    class253.field4036[var6++] = class231.field3681 ? 1 : 0;
                                    continue;
                                }
                            } else if (var528 < 6300) {
                                if (var528 == 6200) {
                                    var6 -= 2;
                                    class310.field4839 = (short) class253.field4036[var6];
                                    if (class310.field4839 <= 0) {
                                        class310.field4839 = 256;
                                    }
                                    class213.field3478 = (short) class253.field4036[var6 + 1];
                                    if (class213.field3478 <= 0) {
                                        class213.field3478 = 205;
                                    }
                                    continue;
                                }
                                if (var528 == 6201) {
                                    var6 -= 2;
                                    class321.field4979 = (short) class253.field4036[var6];
                                    if (class321.field4979 <= 0) {
                                        class321.field4979 = 256;
                                    }
                                    class90.field1250 = (short) class253.field4036[var6 + 1];
                                    if (class90.field1250 <= 0) {
                                        class90.field1250 = 320;
                                    }
                                    continue;
                                }
                                if (var528 == 6202) {
                                    var6 -= 4;
                                    class225.field3592 = (short) class253.field4036[var6];
                                    if (class225.field3592 <= 0) {
                                        class225.field3592 = 1;
                                    }
                                    class4.field70 = (short) class253.field4036[var6 + 1];
                                    if (class4.field70 <= 0) {
                                        class4.field70 = 32767;
                                    } else if (class225.field3592 > class4.field70) {
                                        class4.field70 = class225.field3592;
                                    }
                                    client.field1663 = (short) class253.field4036[var6 + 2];
                                    if (client.field1663 <= 0) {
                                        client.field1663 = 1;
                                    }
                                    class184.field3059 = (short) class253.field4036[var6 + 3];
                                    if (class184.field3059 <= 0) {
                                        class184.field3059 = 32767;
                                    } else if (class184.field3059 < client.field1663) {
                                        class184.field3059 = client.field1663;
                                    }
                                    continue;
                                }
                                if (var528 == 6203) {
                                    class142.method1050(false, 0, class89.field1234.field2520, class89.field1234.field2468, (byte) 113, 0);
                                    class253.field4036[var6++] = class340.field5289;
                                    class253.field4036[var6++] = class8.field117;
                                    continue;
                                }
                                if (var528 == 6204) {
                                    class253.field4036[var6++] = class321.field4979;
                                    class253.field4036[var6++] = class90.field1250;
                                    continue;
                                }
                                if (var528 == 6205) {
                                    class253.field4036[var6++] = class310.field4839;
                                    class253.field4036[var6++] = class213.field3478;
                                    continue;
                                }
                            } else if (var528 < 6400) {
                                if (var528 == 6300) {
                                    class253.field4036[var6++] = (int) (class283.method2038((byte) 127) / 60000L);
                                    continue;
                                }
                                if (var528 == 6301) {
                                    class253.field4036[var6++] = (int) (class283.method2038((byte) 126) / 86400000L) - 11745;
                                    continue;
                                }
                                if (var528 == 6302) {
                                    var6 -= 3;
                                    int var362 = class253.field4036[var6 + 1];
                                    int var363 = class253.field4036[var6];
                                    int var364 = class253.field4036[var6 + 2];
                                    class168.field2782.clear();
                                    class168.field2782.set(11, 12);
                                    class168.field2782.set(var364, var362, var363);
                                    class253.field4036[var6++] = (int) (class168.field2782.getTime().getTime() / 86400000L) - 11745;
                                    continue;
                                }
                                if (var528 == 6303) {
                                    class168.field2782.clear();
                                    class168.field2782.setTime(new Date(class283.method2038((byte) 126)));
                                    class253.field4036[var6++] = class168.field2782.get(1);
                                    continue;
                                }
                                if (var528 == 6304) {
                                    var6--;
                                    int var365 = class253.field4036[var6];
                                    boolean var366 = true;
                                    if (var365 < 0) {
                                        var366 = ((var365 + 1) % 4) == 0;
                                    } else if (var365 < 1582) {
                                        var366 = (var365 % 4) == 0;
                                    } else if ((var365 % 4) != 0) {
                                        var366 = false;
                                    } else if ((var365 % 100) != 0) {
                                        var366 = true;
                                    } else if ((var365 % 400) != 0) {
                                        var366 = false;
                                    }
                                    class253.field4036[var6++] = var366 ? 1 : 0;
                                    continue;
                                }
                            } else if (var528 < 6500) {
                                if (var528 == 6405) {
                                    class253.field4036[var6++] = class131.method965((byte) 86) ? 1 : 0;
                                    continue;
                                }
                                if (var528 == 6406) {
                                    class253.field4036[var6++] = class86.method581(false) ? 1 : 0;
                                    continue;
                                }
                            } else if (var528 < 6600) {
                                if (var528 == 6500) {
                                    if (class5.field75 == 10 && class145.field2254 == 0 && class70.field996 == 0 && class149.field2318 == 0) {
                                        class253.field4036[var6++] = class303.method2159(420) == -1 ? 0 : 1;
                                        continue;
                                    }
                                    class253.field4036[var6++] = 1;
                                    continue;
                                }
                                if (var528 == 6501) {
                                    class339 var350 = class333.method2328((byte) 55);
                                    if (var350 == null) {
                                        class253.field4036[var6++] = -1;
                                        class253.field4036[var6++] = 0;
                                        class276.field4458[var8++] = "";
                                        class253.field4036[var6++] = 0;
                                        class276.field4458[var8++] = "";
                                        class253.field4036[var6++] = 0;
                                    } else {
                                        class253.field4036[var6++] = var350.field5281;
                                        class253.field4036[var6++] = var350.field450;
                                        class276.field4458[var8++] = var350.field5287;
                                        class173 var351 = var350.method2362(82);
                                        class253.field4036[var6++] = var351.field2869;
                                        class276.field4458[var8++] = var351.field2877;
                                        class253.field4036[var6++] = var350.field466;
                                    }
                                    continue;
                                }
                                if (var528 == 6502) {
                                    class339 var352 = class284.method2042(true);
                                    if (var352 == null) {
                                        class253.field4036[var6++] = -1;
                                        class253.field4036[var6++] = 0;
                                        class276.field4458[var8++] = "";
                                        class253.field4036[var6++] = 0;
                                        class276.field4458[var8++] = "";
                                        class253.field4036[var6++] = 0;
                                    } else {
                                        class253.field4036[var6++] = var352.field5281;
                                        class253.field4036[var6++] = var352.field450;
                                        class276.field4458[var8++] = var352.field5287;
                                        class173 var353 = var352.method2362(97);
                                        class253.field4036[var6++] = var353.field2869;
                                        class276.field4458[var8++] = var353.field2877;
                                        class253.field4036[var6++] = var352.field466;
                                    }
                                    continue;
                                }
                                if (var528 == 6503) {
                                    var6--;
                                    int var354 = class253.field4036[var6];
                                    if (class5.field75 == 10 && class145.field2254 == 0 && class70.field996 == 0 && class149.field2318 == 0) {
                                        class253.field4036[var6++] = class164.method1209(1768, var354) ? 1 : 0;
                                        continue;
                                    }
                                    class253.field4036[var6++] = 0;
                                    continue;
                                }
                                if (var528 == 6504) {
                                    var6--;
                                    class97.field1376 = class253.field4036[var6];
                                    class61.method412(class14.field159, 3);
                                    continue;
                                }
                                if (var528 == 6505) {
                                    class253.field4036[var6++] = class97.field1376;
                                    continue;
                                }
                                if (var528 == 6506) {
                                    var6--;
                                    int var355 = class253.field4036[var6];
                                    class339 var356 = class105.method719(76, var355);
                                    if (var356 == null) {
                                        class253.field4036[var6++] = -1;
                                        class276.field4458[var8++] = "";
                                        class253.field4036[var6++] = 0;
                                        class276.field4458[var8++] = "";
                                        class253.field4036[var6++] = 0;
                                    } else {
                                        class253.field4036[var6++] = var356.field450;
                                        class276.field4458[var8++] = var356.field5287;
                                        class173 var357 = var356.method2362(-86);
                                        class253.field4036[var6++] = var357.field2869;
                                        class276.field4458[var8++] = var357.field2877;
                                        class253.field4036[var6++] = var356.field466;
                                    }
                                    continue;
                                }
                                if (var528 == 6507) {
                                    var6 -= 4;
                                    boolean var358 = class253.field4036[var6 + 1] == 1;
                                    int var359 = class253.field4036[var6];
                                    int var360 = class253.field4036[var6 + 2];
                                    boolean var361 = class253.field4036[var6 + 3] == 1;
                                    class113.method786((byte) -120, var359, var360, var358, var361);
                                    continue;
                                }
                            } else if (var528 < 6700) {
                                if (var528 == 6600) {
                                    var6--;
                                    class57.field803 = class253.field4036[var6] == 1;
                                    class61.method412(class14.field159, 3);
                                    continue;
                                }
                                if (var528 == 6601) {
                                    class253.field4036[var6++] = class57.field803 ? 1 : 0;
                                    continue;
                                }
                            }
                        } else if (var528 == 4400) {
                            var6 -= 2;
                            int var393 = class253.field4036[var6];
                            int var394 = class253.field4036[var6 + 1];
                            class168 var395 = class36.method194(var394, -19375);
                            if (var395.method1228(16)) {
                                class276.field4458[var8++] = class69.method454(false, var393).method659(1, var395.field2776, var394);
                            } else {
                                class253.field4036[var6++] = class69.method454(false, var393).method660(var395.field2773, var394, 33);
                            }
                            continue;
                        }
                    } else if (var528 == 4300) {
                        var6 -= 2;
                        int var396 = class253.field4036[var6 + 1];
                        int var397 = class253.field4036[var6];
                        class168 var398 = class36.method194(var396, -19375);
                        if (var398.method1228(16)) {
                            class276.field4458[var8++] = class98.method666((byte) -65, var397).method1840(var396, true, var398.field2776);
                        } else {
                            class253.field4036[var6++] = class98.method666((byte) -65, var397).method1828(true, var398.field2773, var396);
                        }
                        continue;
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var527) {
            if (var5.field5230 == null) {
                if (class122.field1909 != 0) {
                    class155.method1109("Clientscript error - check log for details", 0, "", (byte) -47);
                }
                class26.method152(var527, "CS2 - scr:" + var5.field2744 + " op:" + var11, -116);
            } else {
                StringBuffer var524 = new StringBuffer(30);
                var524.append("%0a - in: ").append(var5.field5230);
                for (int var525 = class151.field2338 - 1; var525 >= 0; var525--) {
                    var524.append("%0a - via: ").append(class101.field1474[var525].field4138.field5230);
                }
                if (var11 == 40) {
                    int var526 = var10[var7];
                    var524.append("%0a - non-existant gosub script-num: ").append(Integer.toString(var526));
                }
                if (class122.field1909 != 0) {
                    class155.method1109("Clientscript error in: " + var5.field5230, 0, "", (byte) -47);
                }
                class26.method152(var527, "CS2 - scr:" + var5.field2744 + " op:" + var11 + var524.toString(), -116);
            }
            if (arg1 <= 24) {
                field4589 = (class182) null;
            }
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIIZIFBI)[[I", line = 6615)
    public static final int[][] method2059(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, float arg6, byte arg7, int arg8) {
        int[][] var9 = new int[arg3][arg2];
        class288 var10 = new class288();
        var10.field4610 = arg8;
        var10.field4619 = (int) (arg6 * 4096.0F);
        var10.field4608 = arg4;
        var10.field4614 = arg5;
        var10.field4622 = arg1;
        if (arg7 > -126) {
            field4582 = 1;
        }
        var10.method361(112);
        field4583++;
        class324.method2271((byte) -122, arg2, arg3);
        for (int var11 = 0; var11 < arg3; var11++) {
            var10.method2066(var9[var11], 0, var11);
        }
        return var9;
    }
}
