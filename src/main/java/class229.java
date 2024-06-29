import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class229 {

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "I")
    public static int field3638 = 0;

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "Lpg;")
    public static class320 field3639 = new class320(100);

    @OriginalMember(owner = "client!uf", name = "j", descriptor = "[F")
    public static float[] field3645 = new float[] { 0.073F, 0.169F, 0.24F, 1.0F };

    @OriginalMember(owner = "client!uf", name = "l", descriptor = "Ljava/lang/String;")
    public static String field3647 = " from your ignore list first.";

    @OriginalMember(owner = "client!uf", name = "k", descriptor = "Lpg;")
    public static class320 field3646 = new class320(16);

    @OriginalMember(owner = "client!uf", name = "m", descriptor = "I")
    public static int field3648 = -1;

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "F")
    public static float field3637;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "I")
    public static int field3636;

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "I")
    public static int field3640;

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "I")
    public static int field3641;

    @OriginalMember(owner = "client!uf", name = "g", descriptor = "I")
    public static int field3642;

    @OriginalMember(owner = "client!uf", name = "h", descriptor = "I")
    public static int field3643;

    @OriginalMember(owner = "client!uf", name = "i", descriptor = "I")
    public static int field3644;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIIII)V", line = 5)
    public static final void method1617(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3641++;
        class137 var5 = (class137) class281.field4320.method1222(arg0 ^ arg0, (long) arg3);
        if (var5 == null) {
            var5 = new class137();
            class281.field4320.method1227(var5, arg0 - 9965, (long) arg3);
        }
        if (arg2 >= var5.field2158.length) {
            int[] var6 = new int[arg2 + 1];
            int[] var7 = new int[arg2 + 1];
            for (int var8 = 0; var8 < var5.field2158.length; var8++) {
                var6[var8] = var5.field2158[var8];
                var7[var8] = var5.field2159[var8];
            }
            for (int var9 = var5.field2158.length; var9 < arg2; var9++) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field2159 = var7;
            var5.field2158 = var6;
        }
        var5.field2158[arg2] = arg1;
        var5.field2159[arg2] = arg4;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)V", line = 59)
    public static final void method1618(int arg0) {
        if (arg0 != 10558) {
            field3637 = 0.25649777F;
        }
        class10.field132.method752(false);
        int var1 = class10.field132.method759(false, 8);
        if (var1 < class312.field4839) {
            for (int var2 = var1; var2 < class312.field4839; var2++) {
                class310.field4817[class67.field1117++] = class325.field5049[var2];
            }
        }
        field3643++;
        if (class312.field4839 < var1) {
            throw new RuntimeException("gnpov1");
        }
        class312.field4839 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class325.field5049[var3];
            class313 var5 = class254.field3989[var4];
            int var6 = class10.field132.method759(false, 1);
            if (var6 == 0) {
                class325.field5049[class312.field4839++] = var4;
                var5.field1857 = class227.field3618;
            } else {
                int var7 = class10.field132.method759(false, 2);
                if (var7 == 0) {
                    class325.field5049[class312.field4839++] = var4;
                    var5.field1857 = class227.field3618;
                    class260.field4065[class98.field1562++] = var4;
                } else if (var7 == 1) {
                    class325.field5049[class312.field4839++] = var4;
                    var5.field1857 = class227.field3618;
                    int var8 = class10.field132.method759(false, 3);
                    var5.method893(var8, arg0 + 12614, 1);
                    int var9 = class10.field132.method759(false, 1);
                    if (var9 == 1) {
                        class260.field4065[class98.field1562++] = var4;
                    }
                } else if (var7 == 2) {
                    class325.field5049[class312.field4839++] = var4;
                    var5.field1857 = class227.field3618;
                    if (class10.field132.method759(false, 1) == 1) {
                        int var10 = class10.field132.method759(false, 3);
                        var5.method893(var10, 23172, 2);
                        int var11 = class10.field132.method759(false, 3);
                        var5.method893(var11, arg0 ^ 0x73BA, 2);
                    } else {
                        int var12 = class10.field132.method759(false, 3);
                        var5.method893(var12, arg0 + 12614, 0);
                    }
                    int var13 = class10.field132.method759(false, 1);
                    if (var13 == 1) {
                        class260.field4065[class98.field1562++] = var4;
                    }
                } else if (var7 == 3) {
                    class310.field4817[class67.field1117++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(CZ)B", line = 172)
    public static final byte method1619(char arg0, boolean arg1) {
        if (!arg1) {
            return 112;
        }
        field3642++;
        byte var2;
        if (!(arg0 <= '\u0000' || arg0 >= '\u0080') || !(arg0 < ' ' || arg0 > 'ÿ')) {
            var2 = (byte) arg0;
        } else if (arg0 == '€') {
            var2 = -128;
        } else if (arg0 == '‚') {
            var2 = -126;
        } else if (arg0 == 'ƒ') {
            var2 = -125;
        } else if (arg0 == '„') {
            var2 = -124;
        } else if (arg0 == '…') {
            var2 = -123;
        } else if (arg0 == '†') {
            var2 = -122;
        } else if (arg0 == '‡') {
            var2 = -121;
        } else if (arg0 == 'ˆ') {
            var2 = -120;
        } else if (arg0 == '‰') {
            var2 = -119;
        } else if (arg0 == 'Š') {
            var2 = -118;
        } else if (arg0 == '‹') {
            var2 = -117;
        } else if (arg0 == 'Œ') {
            var2 = -116;
        } else if (arg0 == 'Ž') {
            var2 = -114;
        } else if (arg0 == '‘') {
            var2 = -111;
        } else if (arg0 == '’') {
            var2 = -110;
        } else if (arg0 == '“') {
            var2 = -109;
        } else if (arg0 == '”') {
            var2 = -108;
        } else if (arg0 == '•') {
            var2 = -107;
        } else if (arg0 == '–') {
            var2 = -106;
        } else if (arg0 == '—') {
            var2 = -105;
        } else if (arg0 == '˜') {
            var2 = -104;
        } else if (arg0 == '™') {
            var2 = -103;
        } else if (arg0 == 'š') {
            var2 = -102;
        } else if (arg0 == '›') {
            var2 = -101;
        } else if (arg0 == 'œ') {
            var2 = -100;
        } else if (arg0 == 'ž') {
            var2 = -98;
        } else if (arg0 == 'Ÿ') {
            var2 = -97;
        } else {
            var2 = 63;
        }
        return var2;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(ILll;I)V", line = 299)
    public static final void method1620(int arg0, class240 arg1, int arg2) {
        Object[] var3 = arg1.field3826;
        field3644++;
        int var4 = (Integer) var3[0];
        class217 var5 = class20.method156(true, var4);
        if (var5 == null) {
            return;
        }
        class274.field4239 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = -1;
        int[] var9 = var5.field3305;
        if (arg0 >= -29) {
            return;
        }
        int[] var10 = var5.field3300;
        byte var11 = -1;
        try {
            class85.field1362 = new int[var5.field3308];
            class254.field3990 = new String[var5.field3309];
            int var12 = 0;
            int var13 = 0;
            for (int var14 = 1; var14 < var3.length; var14++) {
                if (var3[var14] instanceof Integer) {
                    int var15 = (Integer) var3[var14];
                    if (var15 == -2147483647) {
                        var15 = arg1.field3824;
                    }
                    if (var15 == -2147483646) {
                        var15 = arg1.field3821;
                    }
                    if (var15 == -2147483645) {
                        var15 = arg1.field3834 == null ? -1 : arg1.field3834.field3404;
                    }
                    if (var15 == -2147483644) {
                        var15 = arg1.field3822;
                    }
                    if (var15 == -2147483643) {
                        var15 = arg1.field3834 == null ? -1 : arg1.field3834.field3383;
                    }
                    if (var15 == -2147483642) {
                        var15 = arg1.field3838 == null ? -1 : arg1.field3838.field3404;
                    }
                    if (var15 == -2147483641) {
                        var15 = arg1.field3838 == null ? -1 : arg1.field3838.field3383;
                    }
                    if (var15 == -2147483640) {
                        var15 = arg1.field3825;
                    }
                    if (var15 == -2147483639) {
                        var15 = arg1.field3832;
                    }
                    class85.field1362[var12++] = var15;
                } else if (var3[var14] instanceof String) {
                    String var16 = (String) var3[var14];
                    if (var16.equals("event_opbase")) {
                        var16 = arg1.field3823;
                    }
                    class254.field3990[var13++] = var16;
                }
            }
            int var17 = 0;
            label4446: while (true) {
                var17++;
                if (var17 > arg2) {
                    throw new RuntimeException("slow");
                }
                var8++;
                int var528 = var10[var8];
                if (var528 < 100) {
                    if (var528 == 0) {
                        class307.field4778[var6++] = var9[var8];
                        continue;
                    }
                    if (var528 == 1) {
                        int var18 = var9[var8];
                        class307.field4778[var6++] = class285.field4461[var18];
                        continue;
                    }
                    if (var528 == 2) {
                        int var19 = var9[var8];
                        var6--;
                        class52.method435(var19, class307.field4778[var6], (byte) -84);
                        continue;
                    }
                    if (var528 == 3) {
                        class186.field2789[var7++] = var5.field3307[var8];
                        continue;
                    }
                    if (var528 == 6) {
                        var8 += var9[var8];
                        continue;
                    }
                    if (var528 == 7) {
                        var6 -= 2;
                        if (class307.field4778[var6 + 1] != class307.field4778[var6]) {
                            var8 += var9[var8];
                        }
                        continue;
                    }
                    if (var528 == 8) {
                        var6 -= 2;
                        if (class307.field4778[var6 + 1] == class307.field4778[var6]) {
                            var8 += var9[var8];
                        }
                        continue;
                    }
                    if (var528 == 9) {
                        var6 -= 2;
                        if (class307.field4778[var6] < class307.field4778[var6 + 1]) {
                            var8 += var9[var8];
                        }
                        continue;
                    }
                    if (var528 == 10) {
                        var6 -= 2;
                        if (class307.field4778[var6 + 1] < class307.field4778[var6]) {
                            var8 += var9[var8];
                        }
                        continue;
                    }
                    if (var528 == 21) {
                        if (class274.field4239 == 0) {
                            return;
                        }
                        class191 var20 = class60.field977[--class274.field4239];
                        class254.field3990 = var20.field2867;
                        var5 = var20.field2861;
                        var9 = var5.field3305;
                        var8 = var20.field2866;
                        var10 = var5.field3300;
                        class85.field1362 = var20.field2860;
                        continue;
                    }
                    if (var528 == 25) {
                        int var21 = var9[var8];
                        class307.field4778[var6++] = class2.method9(0, var21);
                        continue;
                    }
                    if (var528 == 27) {
                        int var22 = var9[var8];
                        var6--;
                        class282.method1929(var22, class307.field4778[var6], true);
                        continue;
                    }
                    if (var528 == 31) {
                        var6 -= 2;
                        if (class307.field4778[var6 + 1] >= class307.field4778[var6]) {
                            var8 += var9[var8];
                        }
                        continue;
                    }
                    if (var528 == 32) {
                        var6 -= 2;
                        if (class307.field4778[var6 + 1] <= class307.field4778[var6]) {
                            var8 += var9[var8];
                        }
                        continue;
                    }
                    if (var528 == 33) {
                        class307.field4778[var6++] = class85.field1362[var9[var8]];
                        continue;
                    }
                    int var10001;
                    if (var528 == 34) {
                        var10001 = var9[var8];
                        var6--;
                        class85.field1362[var10001] = class307.field4778[var6];
                        continue;
                    }
                    if (var528 == 35) {
                        class186.field2789[var7++] = class254.field3990[var9[var8]];
                        continue;
                    }
                    if (var528 == 36) {
                        var10001 = var9[var8];
                        var7--;
                        class254.field3990[var10001] = class186.field2789[var7];
                        continue;
                    }
                    if (var528 == 37) {
                        int var23 = var9[var8];
                        var7 -= var23;
                        String var24 = class181.method1299(var7, class186.field2789, var23, false);
                        class186.field2789[var7++] = var24;
                        continue;
                    }
                    if (var528 == 38) {
                        var6--;
                        continue;
                    }
                    if (var528 == 39) {
                        var7--;
                        continue;
                    }
                    if (var528 == 40) {
                        int var25 = var9[var8];
                        class217 var26 = class20.method156(true, var25);
                        String[] var27 = new String[var26.field3309];
                        int[] var28 = new int[var26.field3308];
                        for (int var29 = 0; var29 < var26.field3312; var29++) {
                            var28[var29] = class307.field4778[var29 + var6 - var26.field3312];
                        }
                        for (int var30 = 0; var30 < var26.field3311; var30++) {
                            var27[var30] = class186.field2789[var7 + var30 - var26.field3311];
                        }
                        var7 -= var26.field3311;
                        var6 -= var26.field3312;
                        class191 var31 = new class191();
                        var31.field2866 = var8;
                        var31.field2867 = class254.field3990;
                        var31.field2860 = class85.field1362;
                        var31.field2861 = var5;
                        if (class60.field977.length <= class274.field4239) {
                            throw new RuntimeException();
                        }
                        var5 = var26;
                        class60.field977[class274.field4239++] = var31;
                        var8 = -1;
                        class254.field3990 = var27;
                        var9 = var26.field3305;
                        var10 = var26.field3300;
                        class85.field1362 = var28;
                        continue;
                    }
                    if (var528 == 42) {
                        class307.field4778[var6++] = class273.field4233[var9[var8]];
                        continue;
                    }
                    if (var528 == 43) {
                        int var32 = var9[var8];
                        var6--;
                        class273.field4233[var32] = class307.field4778[var6];
                        class327.method2218(126, var32);
                        continue;
                    }
                    if (var528 == 44) {
                        int var33 = var9[var8] >> 16;
                        int var34 = var9[var8] & 0xFFFF;
                        var6--;
                        int var35 = class307.field4778[var6];
                        if (var35 >= 0 && var35 <= 5000) {
                            class165.field2480[var33] = var35;
                            byte var36 = -1;
                            if (var34 == 105) {
                                var36 = 0;
                            }
                            int var37 = 0;
                            while (true) {
                                if (var35 <= var37) {
                                    continue label4446;
                                }
                                class232.field3679[var33][var37] = var36;
                                var37++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var528 == 45) {
                        int var38 = var9[var8];
                        var6--;
                        int var39 = class307.field4778[var6];
                        if (var39 >= 0 && var39 < class165.field2480[var38]) {
                            class307.field4778[var6++] = class232.field3679[var38][var39];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var528 == 46) {
                        var6 -= 2;
                        int var40 = var9[var8];
                        int var41 = class307.field4778[var6];
                        if (var41 >= 0 && class165.field2480[var40] > var41) {
                            class232.field3679[var40][var41] = class307.field4778[var6 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var528 == 47) {
                        String var42 = class47.field777[var9[var8]];
                        if (var42 == null) {
                            var42 = "null";
                        }
                        class186.field2789[var7++] = var42;
                        continue;
                    }
                    if (var528 == 48) {
                        int var43 = var9[var8];
                        var7--;
                        class47.field777[var43] = class186.field2789[var7];
                        class300.method2049(-4204, var43);
                        continue;
                    }
                    if (var528 == 51) {
                        class170 var44 = var5.field3304[var9[var8]];
                        var6--;
                        class295 var45 = (class295) var44.method1222(0, (long) class307.field4778[var6]);
                        if (var45 != null) {
                            var8 += var45.field4562;
                        }
                        continue;
                    }
                }
                boolean var46;
                if (var9[var8] == 1) {
                    var46 = true;
                } else {
                    var46 = false;
                }
                if (var528 < 300) {
                    if (var528 == 100) {
                        var6 -= 3;
                        int var47 = class307.field4778[var6];
                        int var48 = class307.field4778[var6 + 2];
                        int var49 = class307.field4778[var6 + 1];
                        if (var49 != 0) {
                            class220 var50 = class68.method524((byte) -89, var47);
                            if (var50.field3472 == null) {
                                var50.field3472 = new class220[var48 + 1];
                            }
                            if (var48 >= var50.field3472.length) {
                                class220[] var51 = new class220[var48 + 1];
                                for (int var52 = 0; var52 < var50.field3472.length; var52++) {
                                    var51[var52] = var50.field3472[var52];
                                }
                                var50.field3472 = var51;
                            }
                            if (var48 > 0 && var50.field3472[var48 - 1] == null) {
                                throw new RuntimeException("Gap at:" + (var48 - 1));
                            }
                            class220 var53 = new class220();
                            var53.field3468 = var49;
                            var53.field3445 = true;
                            var53.field3393 = var53.field3404 = var50.field3404;
                            var53.field3383 = var48;
                            var50.field3472[var48] = var53;
                            if (var46) {
                                class71.field1168 = var53;
                            } else {
                                class282.field4373 = var53;
                            }
                            class26.method241(3095, var50);
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var528 == 101) {
                        class220 var54 = var46 ? class71.field1168 : class282.field4373;
                        if (var54.field3383 == -1) {
                            if (!var46) {
                                throw new RuntimeException("Tried to cc_delete static active-component!");
                            }
                            throw new RuntimeException("Tried to .cc_delete static .active-component!");
                        }
                        class220 var55 = class68.method524((byte) -89, var54.field3404);
                        var55.field3472[var54.field3383] = null;
                        class26.method241(3095, var55);
                        continue;
                    }
                    if (var528 == 102) {
                        var6--;
                        class220 var56 = class68.method524((byte) -121, class307.field4778[var6]);
                        var56.field3472 = null;
                        class26.method241(3095, var56);
                        continue;
                    }
                    if (var528 == 200) {
                        var6 -= 2;
                        int var57 = class307.field4778[var6 + 1];
                        int var58 = class307.field4778[var6];
                        class220 var59 = class177.method1263(var58, -122, var57);
                        if (var59 != null && var57 != -1) {
                            class307.field4778[var6++] = 1;
                            if (var46) {
                                class71.field1168 = var59;
                            } else {
                                class282.field4373 = var59;
                            }
                            continue;
                        }
                        class307.field4778[var6++] = 0;
                        continue;
                    }
                    if (var528 == 201) {
                        var6--;
                        int var60 = class307.field4778[var6];
                        class220 var61 = class68.method524((byte) -112, var60);
                        if (var61 == null) {
                            class307.field4778[var6++] = 0;
                        } else {
                            class307.field4778[var6++] = 1;
                            if (var46) {
                                class71.field1168 = var61;
                            } else {
                                class282.field4373 = var61;
                            }
                        }
                        continue;
                    }
                } else if (var528 < 500) {
                    if (var528 == 403) {
                        var6 -= 2;
                        int var62 = class307.field4778[var6 + 1];
                        int var63 = class307.field4778[var6];
                        for (int var64 = 0; var64 < class282.field4360.length; var64++) {
                            if (class282.field4360[var64] == var63) {
                                class98.field1566.field499.method1353(var64, 2, var62);
                                continue label4446;
                            }
                        }
                        int var65 = 0;
                        while (true) {
                            if (class223.field3548.length <= var65) {
                                continue label4446;
                            }
                            if (class223.field3548[var65] == var63) {
                                class98.field1566.field499.method1353(var65, 2, var62);
                                continue label4446;
                            }
                            var65++;
                        }
                    }
                    if (var528 == 404) {
                        var6 -= 2;
                        int var66 = class307.field4778[var6];
                        int var67 = class307.field4778[var6 + 1];
                        class98.field1566.field499.method1351(var66, true, var67);
                        continue;
                    }
                    if (var528 == 410) {
                        var6--;
                        boolean var68 = class307.field4778[var6] != 0;
                        class98.field1566.field499.method1355(-390770907, var68);
                        continue;
                    }
                } else if (!(var528 < 1000 || var528 >= 1100) || !(var528 < 2000 || var528 >= 2100)) {
                    class220 var69;
                    if (var528 < 2000) {
                        var69 = var46 ? class71.field1168 : class282.field4373;
                    } else {
                        var528 -= 1000;
                        var6--;
                        var69 = class68.method524((byte) -82, class307.field4778[var6]);
                    }
                    if (var528 == 1000) {
                        var6 -= 4;
                        var69.field3435 = class307.field4778[var6];
                        var69.field3444 = class307.field4778[var6 + 1];
                        int var70 = class307.field4778[var6 + 2];
                        if (var70 < 0) {
                            var70 = 0;
                        } else if (var70 > 5) {
                            var70 = 5;
                        }
                        int var71 = class307.field4778[var6 + 3];
                        if (var71 < 0) {
                            var71 = 0;
                        } else if (var71 > 5) {
                            var71 = 5;
                        }
                        var69.field3527 = (byte) var70;
                        var69.field3424 = (byte) var71;
                        class26.method241(3095, var69);
                        class133.method960(var69, true);
                        if (var69.field3383 == -1) {
                            class141.method1012((byte) 112, var69.field3404);
                        }
                        continue;
                    }
                    if (var528 == 1001) {
                        var6 -= 4;
                        var69.field3405 = class307.field4778[var6];
                        var69.field3360 = class307.field4778[var6 + 1];
                        var69.field3395 = 0;
                        var69.field3439 = 0;
                        int var72 = class307.field4778[var6 + 2];
                        if (var72 < 0) {
                            var72 = 0;
                        } else if (var72 > 4) {
                            var72 = 4;
                        }
                        int var73 = class307.field4778[var6 + 3];
                        if (var73 < 0) {
                            var73 = 0;
                        } else if (var73 > 4) {
                            var73 = 4;
                        }
                        var69.field3417 = (byte) var72;
                        var69.field3431 = (byte) var73;
                        class26.method241(3095, var69);
                        class133.method960(var69, true);
                        if (var69.field3468 == 0) {
                            class96.method714(false, (byte) 71, var69);
                        }
                        continue;
                    }
                    if (var528 == 1003) {
                        var6--;
                        boolean var74 = class307.field4778[var6] == 1;
                        if (var74 != var69.field3496) {
                            var69.field3496 = var74;
                            class26.method241(3095, var69);
                        }
                        if (var69.field3383 == -1) {
                            client.method392((byte) 118, var69.field3404);
                        }
                        continue;
                    }
                    if (var528 == 1004) {
                        var6 -= 2;
                        var69.field3481 = class307.field4778[var6];
                        var69.field3379 = class307.field4778[var6 + 1];
                        class26.method241(3095, var69);
                        class133.method960(var69, true);
                        if (var69.field3468 == 0) {
                            class96.method714(false, (byte) 71, var69);
                        }
                        continue;
                    }
                    if (var528 == 1005) {
                        var6--;
                        var69.field3436 = class307.field4778[var6] == 1;
                        continue;
                    }
                } else if (var528 >= 1100 && var528 < 1200 || var528 >= 2100 && var528 < 2200) {
                    class220 var519;
                    if (var528 < 2000) {
                        var519 = var46 ? class71.field1168 : class282.field4373;
                    } else {
                        var528 -= 1000;
                        var6--;
                        var519 = class68.method524((byte) -123, class307.field4778[var6]);
                    }
                    if (var528 == 1100) {
                        var6 -= 2;
                        var519.field3367 = class307.field4778[var6];
                        if (var519.field3370 - var519.field3526 < var519.field3367) {
                            var519.field3367 = var519.field3370 - var519.field3526;
                        }
                        if (var519.field3367 < 0) {
                            var519.field3367 = 0;
                        }
                        var519.field3426 = class307.field4778[var6 + 1];
                        if ((var519.field3465 - var519.field3458) < var519.field3426) {
                            var519.field3426 = var519.field3465 - var519.field3458;
                        }
                        if (var519.field3426 < 0) {
                            var519.field3426 = 0;
                        }
                        class26.method241(3095, var519);
                        if (var519.field3383 == -1) {
                            class307.method2097(var519.field3404, false);
                        }
                        continue;
                    }
                    if (var528 == 1101) {
                        var6--;
                        var519.field3487 = class307.field4778[var6];
                        class26.method241(3095, var519);
                        if (var519.field3383 == -1) {
                            class199.method1416((byte) -91, var519.field3404);
                        }
                        continue;
                    }
                    if (var528 == 1102) {
                        var6--;
                        var519.field3476 = class307.field4778[var6] == 1;
                        class26.method241(3095, var519);
                        continue;
                    }
                    if (var528 == 1103) {
                        var6--;
                        var519.field3381 = class307.field4778[var6];
                        class26.method241(3095, var519);
                        continue;
                    }
                    if (var528 == 1104) {
                        var6--;
                        var519.field3384 = class307.field4778[var6];
                        class26.method241(3095, var519);
                        continue;
                    }
                    if (var528 == 1105) {
                        var6--;
                        var519.field3400 = class307.field4778[var6];
                        class26.method241(3095, var519);
                        continue;
                    }
                    if (var528 == 1106) {
                        var6--;
                        var519.field3502 = class307.field4778[var6];
                        class26.method241(3095, var519);
                        continue;
                    }
                    if (var528 == 1107) {
                        var6--;
                        var519.field3477 = class307.field4778[var6] == 1;
                        class26.method241(3095, var519);
                        continue;
                    }
                    if (var528 == 1108) {
                        var519.field3372 = 1;
                        var6--;
                        var519.field3466 = class307.field4778[var6];
                        class26.method241(3095, var519);
                        if (var519.field3383 == -1) {
                            class315.method2146(var519.field3404, -7);
                        }
                        continue;
                    }
                    if (var528 == 1109) {
                        var6 -= 6;
                        var519.field3453 = class307.field4778[var6];
                        var519.field3446 = class307.field4778[var6 + 1];
                        var519.field3350 = class307.field4778[var6 + 2];
                        var519.field3505 = class307.field4778[var6 + 3];
                        var519.field3513 = class307.field4778[var6 + 4];
                        var519.field3516 = class307.field4778[var6 + 5];
                        class26.method241(3095, var519);
                        if (var519.field3383 == -1) {
                            class276.method1890(var519.field3404, true);
                            class324.method2203(var519.field3404, true);
                        }
                        continue;
                    }
                    if (var528 == 1110) {
                        var6--;
                        int var520 = class307.field4778[var6];
                        if (var519.field3406 != var520) {
                            var519.field3406 = var520;
                            var519.field3349 = 1;
                            var519.field3469 = 0;
                            var519.field3500 = 0;
                            class26.method241(3095, var519);
                        }
                        if (var519.field3383 == -1) {
                            class298.method2019(-20330, var519.field3404);
                        }
                        continue;
                    }
                    if (var528 == 1111) {
                        var6--;
                        var519.field3455 = class307.field4778[var6] == 1;
                        class26.method241(3095, var519);
                        continue;
                    }
                    if (var528 == 1112) {
                        var7--;
                        String var521 = class186.field2789[var7];
                        if (!var521.equals(var519.field3376)) {
                            var519.field3376 = var521;
                            class26.method241(3095, var519);
                        }
                        if (var519.field3383 == -1) {
                            class7.method59(var519.field3404, (byte) -106);
                        }
                        continue;
                    }
                    if (var528 == 1113) {
                        var6--;
                        var519.field3430 = class307.field4778[var6];
                        class26.method241(3095, var519);
                        continue;
                    }
                    if (var528 == 1114) {
                        var6 -= 3;
                        var519.field3512 = class307.field4778[var6];
                        var519.field3374 = class307.field4778[var6 + 1];
                        var519.field3440 = class307.field4778[var6 + 2];
                        class26.method241(3095, var519);
                        continue;
                    }
                    if (var528 == 1115) {
                        var6--;
                        var519.field3471 = class307.field4778[var6] == 1;
                        class26.method241(3095, var519);
                        continue;
                    }
                    if (var528 == 1116) {
                        var6--;
                        var519.field3462 = class307.field4778[var6];
                        class26.method241(3095, var519);
                        continue;
                    }
                    if (var528 == 1117) {
                        var6--;
                        var519.field3402 = class307.field4778[var6];
                        class26.method241(3095, var519);
                        continue;
                    }
                    if (var528 == 1118) {
                        var6--;
                        var519.field3459 = class307.field4778[var6] == 1;
                        class26.method241(3095, var519);
                        continue;
                    }
                    if (var528 == 1119) {
                        var6--;
                        var519.field3461 = class307.field4778[var6] == 1;
                        class26.method241(3095, var519);
                        continue;
                    }
                    if (var528 == 1120) {
                        var6 -= 2;
                        var519.field3370 = class307.field4778[var6];
                        var519.field3465 = class307.field4778[var6 + 1];
                        class26.method241(3095, var519);
                        if (var519.field3468 == 0) {
                            class96.method714(false, (byte) 71, var519);
                        }
                        continue;
                    }
                    if (var528 == 1121) {
                        var6 -= 2;
                        var519.field3524 = (short) class307.field4778[var6];
                        var519.field3434 = (short) class307.field4778[var6 + 1];
                        class26.method241(3095, var519);
                        continue;
                    }
                    if (var528 == 1122) {
                        var6--;
                        var519.field3511 = class307.field4778[var6] == 1;
                        class26.method241(3095, var519);
                        continue;
                    }
                    if (var528 == 1123) {
                        var6--;
                        var519.field3516 = class307.field4778[var6];
                        class26.method241(3095, var519);
                        if (var519.field3383 == -1) {
                            class276.method1890(var519.field3404, true);
                        }
                        continue;
                    }
                    if (var528 == 1124) {
                        var6--;
                        int var522 = class307.field4778[var6];
                        var519.field3366 = var522 == 1;
                        class26.method241(3095, var519);
                        continue;
                    }
                } else if (var528 >= 1200 && var528 < 1300 || var528 >= 2200 && var528 < 2300) {
                    class220 var75;
                    if (var528 >= 2000) {
                        var6--;
                        var75 = class68.method524((byte) -87, class307.field4778[var6]);
                        var528 -= 1000;
                    } else {
                        var75 = var46 ? class71.field1168 : class282.field4373;
                    }
                    class26.method241(3095, var75);
                    if (var528 == 1200 || var528 == 1205 || var528 == 1208 || var528 == 1209) {
                        var6 -= 2;
                        int var76 = class307.field4778[var6];
                        int var77 = class307.field4778[var6 + 1];
                        if (var75.field3383 == -1) {
                            class288.method1981(var75.field3404, (byte) 100);
                            class276.method1890(var75.field3404, true);
                            class324.method2203(var75.field3404, true);
                        }
                        if (var76 == -1) {
                            var75.field3378 = -1;
                            var75.field3466 = -1;
                            var75.field3372 = 1;
                            continue;
                        }
                        if (var528 == 1208 || var528 == 1209) {
                            var75.field3508 = true;
                        } else {
                            var75.field3508 = false;
                        }
                        var75.field3378 = var76;
                        var75.field3452 = var77;
                        class299 var78 = class237.method1657(2, var76);
                        if (var528 == 1205) {
                            var75.field3391 = false;
                        } else {
                            var75.field3391 = true;
                        }
                        var75.field3446 = var78.field4662;
                        var75.field3505 = var78.field4607;
                        var75.field3453 = var78.field4661;
                        var75.field3513 = var78.field4680;
                        var75.field3516 = var78.field4631;
                        var75.field3350 = var78.field4663;
                        if (var75.field3439 > 0) {
                            var75.field3516 = var75.field3516 * 32 / var75.field3439;
                        } else if (var75.field3405 > 0) {
                            var75.field3516 = var75.field3516 * 32 / var75.field3405;
                        }
                        continue;
                    }
                    if (var528 == 1201) {
                        var75.field3372 = 2;
                        var6--;
                        var75.field3466 = class307.field4778[var6];
                        if (var75.field3383 == -1) {
                            class315.method2146(var75.field3404, -14);
                        }
                        continue;
                    }
                    if (var528 == 1202) {
                        var75.field3372 = 3;
                        var75.field3466 = class98.field1566.field499.method1352(126);
                        if (var75.field3383 == -1) {
                            class315.method2146(var75.field3404, -17);
                        }
                        continue;
                    }
                    if (var528 == 1203) {
                        var75.field3372 = 6;
                        var6--;
                        var75.field3466 = class307.field4778[var6];
                        if (var75.field3383 == -1) {
                            class315.method2146(var75.field3404, -105);
                        }
                        continue;
                    }
                    if (var528 == 1204) {
                        var75.field3372 = 5;
                        var6--;
                        var75.field3466 = class307.field4778[var6];
                        if (var75.field3383 == -1) {
                            class315.method2146(var75.field3404, -63);
                        }
                        continue;
                    }
                    if (var528 == 1206) {
                        var6 -= 4;
                        var75.field3365 = class307.field4778[var6];
                        var75.field3442 = class307.field4778[var6 + 1];
                        var75.field3484 = class307.field4778[var6 + 2];
                        var75.field3479 = class307.field4778[var6 + 3];
                        class26.method241(3095, var75);
                        continue;
                    }
                    if (var528 == 1207) {
                        var6 -= 2;
                        var75.field3530 = class307.field4778[var6];
                        var75.field3437 = class307.field4778[var6 + 1];
                        class26.method241(3095, var75);
                        continue;
                    }
                } else if ((var528 < 1300 || var528 >= 1400) && (var528 < 2300 || var528 >= 2400)) {
                    if (var528 >= 1400 && var528 < 1500 || var528 >= 2400 && var528 < 2500) {
                        class220 var506;
                        if (var528 >= 2000) {
                            var6--;
                            var506 = class68.method524((byte) -108, class307.field4778[var6]);
                            var528 -= 1000;
                        } else {
                            var506 = var46 ? class71.field1168 : class282.field4373;
                        }
                        int[] var507 = null;
                        var7--;
                        String var508 = class186.field2789[var7];
                        if (var508.length() > 0 && var508.charAt(var508.length() - 1) == 'Y') {
                            var6--;
                            int var509 = class307.field4778[var6];
                            if (var509 > 0) {
                                var507 = new int[var509];
                                while (var509-- > 0) {
                                    var6--;
                                    var507[var509] = class307.field4778[var6];
                                }
                            }
                            var508 = var508.substring(0, var508.length() - 1);
                        }
                        Object[] var510 = new Object[var508.length() + 1];
                        for (int var511 = var510.length - 1; var511 >= 1; var511--) {
                            if (var508.charAt(var511 - 1) == 's') {
                                var7--;
                                var510[var511] = class186.field2789[var7];
                            } else {
                                var6--;
                                var510[var511] = Integer.valueOf(class307.field4778[var6]);
                            }
                        }
                        var6--;
                        int var512 = class307.field4778[var6];
                        if (var512 == -1) {
                            var510 = null;
                        } else {
                            var510[0] = Integer.valueOf(var512);
                        }
                        if (var528 == 1400) {
                            var506.field3503 = var510;
                        } else if (var528 == 1401) {
                            var506.field3463 = var510;
                        } else if (var528 == 1402) {
                            var506.field3531 = var510;
                        } else if (var528 == 1403) {
                            var506.field3399 = var510;
                        } else if (var528 == 1404) {
                            var506.field3507 = var510;
                        } else if (var528 == 1405) {
                            var506.field3362 = var510;
                        } else if (var528 == 1406) {
                            var506.field3504 = var510;
                        } else if (var528 == 1407) {
                            var506.field3422 = var510;
                            var506.field3438 = var507;
                        } else if (var528 == 1408) {
                            var506.field3478 = var510;
                        } else if (var528 == 1409) {
                            var506.field3414 = var510;
                        } else if (var528 == 1410) {
                            var506.field3415 = var510;
                        } else if (var528 == 1411) {
                            var506.field3387 = var510;
                        } else if (var528 == 1412) {
                            var506.field3474 = var510;
                        } else if (var528 == 1414) {
                            var506.field3520 = var510;
                            var506.field3401 = var507;
                        } else if (var528 == 1415) {
                            var506.field3523 = var507;
                            var506.field3521 = var510;
                        } else if (var528 == 1416) {
                            var506.field3385 = var510;
                        } else if (var528 == 1417) {
                            var506.field3480 = var510;
                        } else if (var528 == 1418) {
                            var506.field3357 = var510;
                        } else if (var528 == 1419) {
                            var506.field3443 = var510;
                        } else if (var528 == 1420) {
                            var506.field3353 = var510;
                        } else if (var528 == 1421) {
                            var506.field3421 = var510;
                        } else if (var528 == 1422) {
                            var506.field3510 = var510;
                        } else if (var528 == 1423) {
                            var506.field3389 = var510;
                        } else if (var528 == 1424) {
                            var506.field3515 = var510;
                        } else if (var528 == 1425) {
                            var506.field3473 = var510;
                        } else if (var528 == 1426) {
                            var506.field3485 = var510;
                        } else if (var528 == 1427) {
                            var506.field3519 = var510;
                        } else if (var528 == 1428) {
                            var506.field3390 = var507;
                            var506.field3419 = var510;
                        } else if (var528 == 1429) {
                            var506.field3475 = var510;
                            var506.field3509 = var507;
                        }
                        var506.field3498 = true;
                        continue;
                    }
                    if (var528 < 1600) {
                        class220 var79 = var46 ? class71.field1168 : class282.field4373;
                        if (var528 == 1500) {
                            class307.field4778[var6++] = var79.field3361;
                            continue;
                        }
                        if (var528 == 1501) {
                            class307.field4778[var6++] = var79.field3464;
                            continue;
                        }
                        if (var528 == 1502) {
                            class307.field4778[var6++] = var79.field3526;
                            continue;
                        }
                        if (var528 == 1503) {
                            class307.field4778[var6++] = var79.field3458;
                            continue;
                        }
                        if (var528 == 1504) {
                            class307.field4778[var6++] = var79.field3496 ? 1 : 0;
                            continue;
                        }
                        if (var528 == 1505) {
                            class307.field4778[var6++] = var79.field3393;
                            continue;
                        }
                    } else if (var528 < 1700) {
                        class220 var80 = var46 ? class71.field1168 : class282.field4373;
                        if (var528 == 1600) {
                            class307.field4778[var6++] = var80.field3367;
                            continue;
                        }
                        if (var528 == 1601) {
                            class307.field4778[var6++] = var80.field3426;
                            continue;
                        }
                        if (var528 == 1602) {
                            class186.field2789[var7++] = var80.field3376;
                            continue;
                        }
                        if (var528 == 1603) {
                            class307.field4778[var6++] = var80.field3370;
                            continue;
                        }
                        if (var528 == 1604) {
                            class307.field4778[var6++] = var80.field3465;
                            continue;
                        }
                        if (var528 == 1605) {
                            class307.field4778[var6++] = var80.field3516;
                            continue;
                        }
                        if (var528 == 1606) {
                            class307.field4778[var6++] = var80.field3350;
                            continue;
                        }
                        if (var528 == 1607) {
                            class307.field4778[var6++] = var80.field3513;
                            continue;
                        }
                        if (var528 == 1608) {
                            class307.field4778[var6++] = var80.field3505;
                            continue;
                        }
                        if (var528 == 1609) {
                            class307.field4778[var6++] = var80.field3381;
                            continue;
                        }
                        if (var528 == 1610) {
                            class307.field4778[var6++] = var80.field3453;
                            continue;
                        }
                        if (var528 == 1611) {
                            class307.field4778[var6++] = var80.field3446;
                            continue;
                        }
                        if (var528 == 1612) {
                            class307.field4778[var6++] = var80.field3400;
                            continue;
                        }
                    } else if (var528 < 1800) {
                        class220 var505 = var46 ? class71.field1168 : class282.field4373;
                        if (var528 == 1700) {
                            class307.field4778[var6++] = var505.field3378;
                            continue;
                        }
                        if (var528 == 1701) {
                            if (var505.field3378 == -1) {
                                class307.field4778[var6++] = 0;
                            } else {
                                class307.field4778[var6++] = var505.field3452;
                            }
                            continue;
                        }
                        if (var528 == 1702) {
                            class307.field4778[var6++] = var505.field3383;
                            continue;
                        }
                    } else if (var528 < 1900) {
                        class220 var503 = var46 ? class71.field1168 : class282.field4373;
                        if (var528 == 1800) {
                            class307.field4778[var6++] = client.method393(var503).method1088((byte) -115);
                            continue;
                        }
                        if (var528 == 1801) {
                            var6--;
                            int var504 = class307.field4778[var6];
                            int var530 = var504 - 1;
                            if (var503.field3488 != null && var503.field3488.length > var530 && var503.field3488[var530] != null) {
                                class186.field2789[var7++] = var503.field3488[var530];
                                continue;
                            }
                            class186.field2789[var7++] = "";
                            continue;
                        }
                        if (var528 == 1802) {
                            if (var503.field3358 == null) {
                                class186.field2789[var7++] = "";
                            } else {
                                class186.field2789[var7++] = var503.field3358;
                            }
                            continue;
                        }
                    } else if (var528 < 2600) {
                        var6--;
                        class220 var81 = class68.method524((byte) -91, class307.field4778[var6]);
                        if (var528 == 2500) {
                            class307.field4778[var6++] = var81.field3361;
                            continue;
                        }
                        if (var528 == 2501) {
                            class307.field4778[var6++] = var81.field3464;
                            continue;
                        }
                        if (var528 == 2502) {
                            class307.field4778[var6++] = var81.field3526;
                            continue;
                        }
                        if (var528 == 2503) {
                            class307.field4778[var6++] = var81.field3458;
                            continue;
                        }
                        if (var528 == 2504) {
                            class307.field4778[var6++] = var81.field3496 ? 1 : 0;
                            continue;
                        }
                        if (var528 == 2505) {
                            class307.field4778[var6++] = var81.field3393;
                            continue;
                        }
                    } else if (var528 < 2700) {
                        var6--;
                        class220 var502 = class68.method524((byte) -87, class307.field4778[var6]);
                        if (var528 == 2600) {
                            class307.field4778[var6++] = var502.field3367;
                            continue;
                        }
                        if (var528 == 2601) {
                            class307.field4778[var6++] = var502.field3426;
                            continue;
                        }
                        if (var528 == 2602) {
                            class186.field2789[var7++] = var502.field3376;
                            continue;
                        }
                        if (var528 == 2603) {
                            class307.field4778[var6++] = var502.field3370;
                            continue;
                        }
                        if (var528 == 2604) {
                            class307.field4778[var6++] = var502.field3465;
                            continue;
                        }
                        if (var528 == 2605) {
                            class307.field4778[var6++] = var502.field3516;
                            continue;
                        }
                        if (var528 == 2606) {
                            class307.field4778[var6++] = var502.field3350;
                            continue;
                        }
                        if (var528 == 2607) {
                            class307.field4778[var6++] = var502.field3513;
                            continue;
                        }
                        if (var528 == 2608) {
                            class307.field4778[var6++] = var502.field3505;
                            continue;
                        }
                        if (var528 == 2609) {
                            class307.field4778[var6++] = var502.field3381;
                            continue;
                        }
                        if (var528 == 2610) {
                            class307.field4778[var6++] = var502.field3453;
                            continue;
                        }
                        if (var528 == 2611) {
                            class307.field4778[var6++] = var502.field3446;
                            continue;
                        }
                        if (var528 == 2612) {
                            class307.field4778[var6++] = var502.field3400;
                            continue;
                        }
                    } else if (var528 < 2800) {
                        if (var528 == 2700) {
                            var6--;
                            class220 var492 = class68.method524((byte) -89, class307.field4778[var6]);
                            class307.field4778[var6++] = var492.field3378;
                            continue;
                        }
                        if (var528 == 2701) {
                            var6--;
                            class220 var493 = class68.method524((byte) -123, class307.field4778[var6]);
                            if (var493.field3378 == -1) {
                                class307.field4778[var6++] = 0;
                            } else {
                                class307.field4778[var6++] = var493.field3452;
                            }
                            continue;
                        }
                        if (var528 == 2702) {
                            var6--;
                            int var494 = class307.field4778[var6];
                            class61 var495 = (class61) class276.field4257.method1222(0, (long) var494);
                            if (var495 == null) {
                                class307.field4778[var6++] = 0;
                            } else {
                                class307.field4778[var6++] = 1;
                            }
                            continue;
                        }
                        if (var528 == 2703) {
                            var6--;
                            class220 var496 = class68.method524((byte) -124, class307.field4778[var6]);
                            if (var496.field3472 == null) {
                                class307.field4778[var6++] = 0;
                                continue;
                            }
                            int var497 = var496.field3472.length;
                            for (int var498 = 0; var498 < var496.field3472.length; var498++) {
                                if (var496.field3472[var498] == null) {
                                    var497 = var498;
                                    break;
                                }
                            }
                            class307.field4778[var6++] = var497;
                            continue;
                        }
                        if (var528 == 2704 || var528 == 2705) {
                            var6 -= 2;
                            int var499 = class307.field4778[var6];
                            int var500 = class307.field4778[var6 + 1];
                            class61 var501 = (class61) class276.field4257.method1222(0, (long) var499);
                            if (var501 != null && var501.field982 == var500) {
                                class307.field4778[var6++] = 1;
                                continue;
                            }
                            class307.field4778[var6++] = 0;
                            continue;
                        }
                    } else if (var528 < 2900) {
                        var6--;
                        class220 var82 = class68.method524((byte) -105, class307.field4778[var6]);
                        if (var528 == 2800) {
                            class307.field4778[var6++] = client.method393(var82).method1088((byte) -83);
                            continue;
                        }
                        if (var528 == 2801) {
                            var6--;
                            int var83 = class307.field4778[var6];
                            int var529 = var83 - 1;
                            if (var82.field3488 != null && var529 < var82.field3488.length && var82.field3488[var529] != null) {
                                class186.field2789[var7++] = var82.field3488[var529];
                                continue;
                            }
                            class186.field2789[var7++] = "";
                            continue;
                        }
                        if (var528 == 2802) {
                            if (var82.field3358 == null) {
                                class186.field2789[var7++] = "";
                            } else {
                                class186.field2789[var7++] = var82.field3358;
                            }
                            continue;
                        }
                    } else if (var528 < 3200) {
                        if (var528 == 3100) {
                            var7--;
                            String var84 = class186.field2789[var7];
                            class29.method252(var84, "", true, 0);
                            continue;
                        }
                        if (var528 == 3101) {
                            var6 -= 2;
                            class200.method1421(class307.field4778[var6], class307.field4778[var6 + 1], class98.field1566, (byte) 54);
                            continue;
                        }
                        if (var528 == 3103) {
                            class194.method1384((byte) -55);
                            continue;
                        }
                        if (var528 == 3104) {
                            class240.field3827++;
                            int var85 = 0;
                            var7--;
                            String var86 = class186.field2789[var7];
                            if (class206.method1468((byte) -89, var86)) {
                                var85 = class112.method832(false, var86);
                            }
                            class106.field1642.method753(7, 42);
                            class106.field1642.method1174((byte) -32, var85);
                            continue;
                        }
                        if (var528 == 3105) {
                            var7--;
                            String var87 = class186.field2789[var7];
                            class213.field3246++;
                            class106.field1642.method753(127, 151);
                            class106.field1642.method1125(8473, class128.method926(var87, (byte) -83));
                            continue;
                        }
                        if (var528 == 3106) {
                            class267.field4167++;
                            var7--;
                            String var88 = class186.field2789[var7];
                            class106.field1642.method753(-128, 109);
                            class106.field1642.method1132((byte) 29, var88.length() + 1);
                            class106.field1642.method1121(-1, var88);
                            continue;
                        }
                        if (var528 == 3107) {
                            var6--;
                            int var89 = class307.field4778[var6];
                            var7--;
                            String var90 = class186.field2789[var7];
                            class20.method158(var90, -113, var89);
                            continue;
                        }
                        if (var528 == 3108) {
                            var6 -= 3;
                            int var91 = class307.field4778[var6];
                            int var92 = class307.field4778[var6 + 2];
                            int var93 = class307.field4778[var6 + 1];
                            class220 var94 = class68.method524((byte) -83, var92);
                            class241.method1671(var93, (byte) 118, var91, var94);
                            continue;
                        }
                        if (var528 == 3109) {
                            class220 var95 = var46 ? class71.field1168 : class282.field4373;
                            var6 -= 2;
                            int var96 = class307.field4778[var6];
                            int var97 = class307.field4778[var6 + 1];
                            class241.method1671(var97, (byte) 124, var96, var95);
                            continue;
                        }
                        if (var528 == 3110) {
                            class307.field4770++;
                            var6--;
                            int var98 = class307.field4778[var6];
                            class106.field1642.method753(-124, 12);
                            class106.field1642.method1150(var98, -628562744);
                            continue;
                        }
                    } else if (var528 < 3300) {
                        if (var528 == 3200) {
                            var6 -= 3;
                            class320.method2180(class307.field4778[var6 + 2], -1, class307.field4778[var6 + 1], 255, class307.field4778[var6]);
                            continue;
                        }
                        if (var528 == 3201) {
                            var6--;
                            class241.method1672(class307.field4778[var6], 255, (byte) 64);
                            continue;
                        }
                        if (var528 == 3202) {
                            var6 -= 2;
                            class35.method293(false, class307.field4778[var6 + 1], 255, class307.field4778[var6]);
                            continue;
                        }
                    } else if (var528 < 3400) {
                        if (var528 == 3300) {
                            class307.field4778[var6++] = class227.field3618;
                            continue;
                        }
                        if (var528 == 3301) {
                            var6 -= 2;
                            int var458 = class307.field4778[var6];
                            int var459 = class307.field4778[var6 + 1];
                            class307.field4778[var6++] = class318.method2159(var459, var458, 104);
                            continue;
                        }
                        if (var528 == 3302) {
                            var6 -= 2;
                            int var460 = class307.field4778[var6 + 1];
                            int var461 = class307.field4778[var6];
                            class307.field4778[var6++] = class260.method1779(var460, (byte) 28, var461);
                            continue;
                        }
                        if (var528 == 3303) {
                            var6 -= 2;
                            int var462 = class307.field4778[var6 + 1];
                            int var463 = class307.field4778[var6];
                            class307.field4778[var6++] = class227.method1612(var463, -89, var462);
                            continue;
                        }
                        if (var528 == 3304) {
                            var6--;
                            int var464 = class307.field4778[var6];
                            class307.field4778[var6++] = class59.method469(var464, (byte) -2).field444;
                            continue;
                        }
                        if (var528 == 3305) {
                            var6--;
                            int var465 = class307.field4778[var6];
                            class307.field4778[var6++] = class46.field764[var465];
                            continue;
                        }
                        if (var528 == 3306) {
                            var6--;
                            int var466 = class307.field4778[var6];
                            class307.field4778[var6++] = class128.field2004[var466];
                            continue;
                        }
                        if (var528 == 3307) {
                            var6--;
                            int var467 = class307.field4778[var6];
                            class307.field4778[var6++] = class48.field791[var467];
                            continue;
                        }
                        if (var528 == 3308) {
                            int var468 = (class98.field1566.field1905 >> 7) + class213.field3249;
                            int var469 = class205.field3101;
                            int var470 = (class98.field1566.field1868 >> 7) + class342.field5328;
                            class307.field4778[var6++] = (var469 << 28) + (var468 << 14) + var470;
                            continue;
                        }
                        if (var528 == 3309) {
                            var6--;
                            int var471 = class307.field4778[var6];
                            class307.field4778[var6++] = class270.method1860(var471, 268433574) >> 14;
                            continue;
                        }
                        if (var528 == 3310) {
                            var6--;
                            int var472 = class307.field4778[var6];
                            class307.field4778[var6++] = var472 >> 28;
                            continue;
                        }
                        if (var528 == 3311) {
                            var6--;
                            int var473 = class307.field4778[var6];
                            class307.field4778[var6++] = class270.method1860(var473, 16383);
                            continue;
                        }
                        if (var528 == 3312) {
                            class307.field4778[var6++] = class166.field2527 ? 1 : 0;
                            continue;
                        }
                        if (var528 == 3313) {
                            var6 -= 2;
                            int var474 = class307.field4778[var6] + 32768;
                            int var475 = class307.field4778[var6 + 1];
                            class307.field4778[var6++] = class318.method2159(var475, var474, 85);
                            continue;
                        }
                        if (var528 == 3314) {
                            var6 -= 2;
                            int var476 = class307.field4778[var6 + 1];
                            int var477 = class307.field4778[var6] + 32768;
                            class307.field4778[var6++] = class260.method1779(var476, (byte) 28, var477);
                            continue;
                        }
                        if (var528 == 3315) {
                            var6 -= 2;
                            int var478 = class307.field4778[var6 + 1];
                            int var479 = class307.field4778[var6] + 32768;
                            class307.field4778[var6++] = class227.method1612(var479, -56, var478);
                            continue;
                        }
                        if (var528 == 3316) {
                            if (class52.field853 < 2) {
                                class307.field4778[var6++] = 0;
                            } else {
                                class307.field4778[var6++] = class52.field853;
                            }
                            continue;
                        }
                        if (var528 == 3317) {
                            class307.field4778[var6++] = class278.field4290;
                            continue;
                        }
                        if (var528 == 3318) {
                            class307.field4778[var6++] = class219.field3328;
                            continue;
                        }
                        if (var528 == 3321) {
                            class307.field4778[var6++] = class216.field3276;
                            continue;
                        }
                        if (var528 == 3322) {
                            class307.field4778[var6++] = class281.field4343;
                            continue;
                        }
                        if (var528 == 3323) {
                            if (class187.field2805 >= 5 && class187.field2805 <= 9) {
                                class307.field4778[var6++] = 1;
                                continue;
                            }
                            class307.field4778[var6++] = 0;
                            continue;
                        }
                        if (var528 == 3324) {
                            if (class187.field2805 >= 5 && class187.field2805 <= 9) {
                                class307.field4778[var6++] = class187.field2805;
                                continue;
                            }
                            class307.field4778[var6++] = 0;
                            continue;
                        }
                        if (var528 == 3325) {
                            class307.field4778[var6++] = class123.field1882 ? 1 : 0;
                            continue;
                        }
                        if (var528 == 3326) {
                            class307.field4778[var6++] = class98.field1566.field505;
                            continue;
                        }
                        if (var528 == 3327) {
                            class307.field4778[var6++] = class98.field1566.field499.field2827 ? 1 : 0;
                            continue;
                        }
                        if (var528 == 3328) {
                            class307.field4778[var6++] = class73.field1203 && !class148.field2250 ? 1 : 0;
                            continue;
                        }
                        if (var528 == 3329) {
                            class307.field4778[var6++] = class33.field504 ? 1 : 0;
                            continue;
                        }
                        if (var528 == 3330) {
                            var6--;
                            int var480 = class307.field4778[var6];
                            class307.field4778[var6++] = class158.method1076(0, var480);
                            continue;
                        }
                        if (var528 == 3331) {
                            var6 -= 2;
                            int var481 = class307.field4778[var6 + 1];
                            int var482 = class307.field4778[var6];
                            class307.field4778[var6++] = class320.method2171(-4271, var482, var481, false);
                            continue;
                        }
                        if (var528 == 3332) {
                            var6 -= 2;
                            int var483 = class307.field4778[var6 + 1];
                            int var484 = class307.field4778[var6];
                            class307.field4778[var6++] = class320.method2171(-4271, var484, var483, true);
                            continue;
                        }
                        if (var528 == 3333) {
                            class307.field4778[var6++] = class115.field1768;
                            continue;
                        }
                        if (var528 == 3335) {
                            class307.field4778[var6++] = class195.field2920;
                            continue;
                        }
                        if (var528 == 3336) {
                            var6 -= 4;
                            int var485 = class307.field4778[var6];
                            int var486 = class307.field4778[var6 + 1];
                            int var487 = (var486 << 14) + var485;
                            int var488 = class307.field4778[var6 + 2];
                            int var489 = class307.field4778[var6 + 3];
                            int var490 = (var488 << 28) + var487;
                            int var491 = var489 + var490;
                            class307.field4778[var6++] = var491;
                            continue;
                        }
                        if (var528 == 3337) {
                            class307.field4778[var6++] = class233.field3708;
                            continue;
                        }
                    } else if (var528 < 3500) {
                        if (var528 == 3400) {
                            var6 -= 2;
                            int var441 = class307.field4778[var6];
                            int var442 = class307.field4778[var6 + 1];
                            class70 var443 = class342.method2368(var441, -102);
                            if (var443.field1145 == 's') {
                            }
                            class186.field2789[var7++] = var443.method525(-1, var442);
                            continue;
                        }
                        if (var528 == 3408) {
                            var6 -= 4;
                            int var444 = class307.field4778[var6 + 1];
                            int var445 = class307.field4778[var6 + 3];
                            int var446 = class307.field4778[var6 + 2];
                            int var447 = class307.field4778[var6];
                            class70 var448 = class342.method2368(var446, -38);
                            if (var448.field1153 == var447 && var448.field1145 == var444) {
                                if (var444 == 115) {
                                    class186.field2789[var7++] = var448.method525(-1, var445);
                                } else {
                                    class307.field4778[var6++] = var448.method528(3, var445);
                                }
                                continue;
                            }
                            throw new RuntimeException("C3408-1");
                        }
                        if (var528 == 3409) {
                            var6 -= 3;
                            int var449 = class307.field4778[var6 + 1];
                            int var450 = class307.field4778[var6];
                            int var451 = class307.field4778[var6 + 2];
                            if (var449 == -1) {
                                throw new RuntimeException("C3409-2");
                            }
                            class70 var452 = class342.method2368(var449, -61);
                            if (var452.field1145 != var450) {
                                throw new RuntimeException("C3409-1");
                            }
                            class307.field4778[var6++] = var452.method534(var451, (byte) 86) ? 1 : 0;
                            continue;
                        }
                        if (var528 == 3410) {
                            var6--;
                            int var453 = class307.field4778[var6];
                            var7--;
                            String var454 = class186.field2789[var7];
                            if (var453 == -1) {
                                throw new RuntimeException("C3410-2");
                            }
                            class70 var455 = class342.method2368(var453, -55);
                            if (var455.field1145 != 's') {
                                throw new RuntimeException("C3410-1");
                            }
                            class307.field4778[var6++] = var455.method530(var454, 112) ? 1 : 0;
                            continue;
                        }
                        if (var528 == 3411) {
                            var6--;
                            int var456 = class307.field4778[var6];
                            class70 var457 = class342.method2368(var456, -75);
                            class307.field4778[var6++] = var457.field1149.method1224(false);
                            continue;
                        }
                    } else if (var528 < 3700) {
                        if (var528 == 3600) {
                            if (class280.field4305 == 0) {
                                class307.field4778[var6++] = -2;
                            } else if (class280.field4305 == 1) {
                                class307.field4778[var6++] = -1;
                            } else {
                                class307.field4778[var6++] = class225.field3579;
                            }
                            continue;
                        }
                        if (var528 == 3601) {
                            var6--;
                            int var417 = class307.field4778[var6];
                            if (class280.field4305 == 2 && class225.field3579 > var417) {
                                class186.field2789[var7++] = class51.field828[var417];
                                continue;
                            }
                            class186.field2789[var7++] = "";
                            continue;
                        }
                        if (var528 == 3602) {
                            var6--;
                            int var418 = class307.field4778[var6];
                            if (class280.field4305 == 2 && class225.field3579 > var418) {
                                class307.field4778[var6++] = class148.field2252[var418];
                                continue;
                            }
                            class307.field4778[var6++] = 0;
                            continue;
                        }
                        if (var528 == 3603) {
                            var6--;
                            int var419 = class307.field4778[var6];
                            if (class280.field4305 == 2 && var419 < class225.field3579) {
                                class307.field4778[var6++] = class233.field3702[var419];
                                continue;
                            }
                            class307.field4778[var6++] = 0;
                            continue;
                        }
                        if (var528 == 3604) {
                            var7--;
                            String var420 = class186.field2789[var7];
                            var6--;
                            int var421 = class307.field4778[var6];
                            class284.method1958((byte) 52, var420, var421);
                            continue;
                        }
                        if (var528 == 3605) {
                            var7--;
                            String var422 = class186.field2789[var7];
                            class44.method382(-5756, class128.method926(var422, (byte) -102));
                            continue;
                        }
                        if (var528 == 3606) {
                            var7--;
                            String var423 = class186.field2789[var7];
                            class259.method1773(class128.method926(var423, (byte) -117), 1);
                            continue;
                        }
                        if (var528 == 3607) {
                            var7--;
                            String var424 = class186.field2789[var7];
                            class35.method292(class128.method926(var424, (byte) -96), false, false);
                            continue;
                        }
                        if (var528 == 3608) {
                            var7--;
                            String var425 = class186.field2789[var7];
                            class339.method2355((byte) 82, class128.method926(var425, (byte) -80));
                            continue;
                        }
                        if (var528 == 3609) {
                            var7--;
                            String var426 = class186.field2789[var7];
                            if (var426.startsWith("<img=0>") || var426.startsWith("<img=1>")) {
                                var426 = var426.substring(7);
                            }
                            class307.field4778[var6++] = class163.method1111(var426, false) ? 1 : 0;
                            continue;
                        }
                        if (var528 == 3610) {
                            var6--;
                            int var427 = class307.field4778[var6];
                            if (class280.field4305 == 2 && class225.field3579 > var427) {
                                class186.field2789[var7++] = class1.field13[var427];
                                continue;
                            }
                            class186.field2789[var7++] = "";
                            continue;
                        }
                        if (var528 == 3611) {
                            if (class321.field5017 == null) {
                                class186.field2789[var7++] = "";
                            } else {
                                class186.field2789[var7++] = class336.method2336(113, class321.field5017);
                            }
                            continue;
                        }
                        if (var528 == 3612) {
                            if (class321.field5017 == null) {
                                class307.field4778[var6++] = 0;
                            } else {
                                class307.field4778[var6++] = class304.field4756;
                            }
                            continue;
                        }
                        if (var528 == 3613) {
                            var6--;
                            int var428 = class307.field4778[var6];
                            if (class321.field5017 != null && class304.field4756 > var428) {
                                class186.field2789[var7++] = class336.method2336(111, class234.field3739[var428].field2791);
                                continue;
                            }
                            class186.field2789[var7++] = "";
                            continue;
                        }
                        if (var528 == 3614) {
                            var6--;
                            int var429 = class307.field4778[var6];
                            if (class321.field5017 != null && class304.field4756 > var429) {
                                class307.field4778[var6++] = class234.field3739[var429].field2793;
                                continue;
                            }
                            class307.field4778[var6++] = 0;
                            continue;
                        }
                        if (var528 == 3615) {
                            var6--;
                            int var430 = class307.field4778[var6];
                            if (class321.field5017 != null && class304.field4756 > var430) {
                                class307.field4778[var6++] = class234.field3739[var430].field2798;
                                continue;
                            }
                            class307.field4778[var6++] = 0;
                            continue;
                        }
                        if (var528 == 3616) {
                            class307.field4778[var6++] = class7.field97;
                            continue;
                        }
                        if (var528 == 3617) {
                            var7--;
                            String var431 = class186.field2789[var7];
                            class284.method1949((byte) 124, var431);
                            continue;
                        }
                        if (var528 == 3618) {
                            class307.field4778[var6++] = class239.field3817;
                            continue;
                        }
                        if (var528 == 3619) {
                            var7--;
                            String var432 = class186.field2789[var7];
                            class70.method529((byte) -48, class128.method926(var432, (byte) -121));
                            continue;
                        }
                        if (var528 == 3620) {
                            class220.method1557(44);
                            continue;
                        }
                        if (var528 == 3621) {
                            if (class280.field4305 == 0) {
                                class307.field4778[var6++] = -1;
                            } else {
                                class307.field4778[var6++] = class336.field5253;
                            }
                            continue;
                        }
                        if (var528 == 3622) {
                            var6--;
                            int var433 = class307.field4778[var6];
                            if (class280.field4305 != 0 && var433 < class336.field5253) {
                                class186.field2789[var7++] = class34.method289(-108, class337.field5277[var433]);
                                continue;
                            }
                            class186.field2789[var7++] = "";
                            continue;
                        }
                        if (var528 == 3623) {
                            var7--;
                            String var434 = class186.field2789[var7];
                            if (var434.startsWith("<img=0>") || var434.startsWith("<img=1>")) {
                                var434 = var434.substring(7);
                            }
                            class307.field4778[var6++] = class214.method1504((byte) 63, var434) ? 1 : 0;
                            continue;
                        }
                        if (var528 == 3624) {
                            var6--;
                            int var435 = class307.field4778[var6];
                            if (class234.field3739 != null && var435 < class304.field4756 && class234.field3739[var435].field2791.equalsIgnoreCase(class98.field1566.field477)) {
                                class307.field4778[var6++] = 1;
                                continue;
                            }
                            class307.field4778[var6++] = 0;
                            continue;
                        }
                        if (var528 == 3625) {
                            if (class189.field2824 == null) {
                                class186.field2789[var7++] = "";
                            } else {
                                class186.field2789[var7++] = class336.method2336(126, class189.field2824);
                            }
                            continue;
                        }
                        if (var528 == 3626) {
                            var6--;
                            int var436 = class307.field4778[var6];
                            if (class321.field5017 != null && class304.field4756 > var436) {
                                class186.field2789[var7++] = class234.field3739[var436].field2801;
                                continue;
                            }
                            class186.field2789[var7++] = "";
                            continue;
                        }
                        if (var528 == 3627) {
                            var6--;
                            int var437 = class307.field4778[var6];
                            if (class280.field4305 == 2 && var437 >= 0 && class225.field3579 > var437) {
                                class307.field4778[var6++] = class220.field3347[var437] ? 1 : 0;
                                continue;
                            }
                            class307.field4778[var6++] = 0;
                            continue;
                        }
                        if (var528 == 3628) {
                            var7--;
                            String var438 = class186.field2789[var7];
                            if (var438.startsWith("<img=0>") || var438.startsWith("<img=1>")) {
                                var438 = var438.substring(7);
                            }
                            class307.field4778[var6++] = class317.method2155((byte) -124, var438);
                            continue;
                        }
                        if (var528 == 3629) {
                            class307.field4778[var6++] = class178.field2694;
                            continue;
                        }
                        if (var528 == 3630) {
                            var7--;
                            String var439 = class186.field2789[var7];
                            class35.method292(class128.method926(var439, (byte) -62), false, true);
                            continue;
                        }
                        if (var528 == 3631) {
                            var6--;
                            int var440 = class307.field4778[var6];
                            class307.field4778[var6++] = class281.field4346[var440] ? 1 : 0;
                            continue;
                        }
                    } else if (var528 < 4000) {
                        if (var528 == 3903) {
                            var6--;
                            int var99 = class307.field4778[var6];
                            class307.field4778[var6++] = class12.field191[var99].method1345(126);
                            continue;
                        }
                        if (var528 == 3904) {
                            var6--;
                            int var100 = class307.field4778[var6];
                            class307.field4778[var6++] = class12.field191[var100].field2814;
                            continue;
                        }
                        if (var528 == 3905) {
                            var6--;
                            int var101 = class307.field4778[var6];
                            class307.field4778[var6++] = class12.field191[var101].field2810;
                            continue;
                        }
                        if (var528 == 3906) {
                            var6--;
                            int var102 = class307.field4778[var6];
                            class307.field4778[var6++] = class12.field191[var102].field2807;
                            continue;
                        }
                        if (var528 == 3907) {
                            var6--;
                            int var103 = class307.field4778[var6];
                            class307.field4778[var6++] = class12.field191[var103].field2809;
                            continue;
                        }
                        if (var528 == 3908) {
                            var6--;
                            int var104 = class307.field4778[var6];
                            class307.field4778[var6++] = class12.field191[var104].field2818;
                            continue;
                        }
                        if (var528 == 3910) {
                            var6--;
                            int var105 = class307.field4778[var6];
                            int var106 = class12.field191[var105].method1342(29550);
                            class307.field4778[var6++] = var106 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var528 == 3911) {
                            var6--;
                            int var107 = class307.field4778[var6];
                            int var108 = class12.field191[var107].method1342(29550);
                            class307.field4778[var6++] = var108 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var528 == 3912) {
                            var6--;
                            int var109 = class307.field4778[var6];
                            int var110 = class12.field191[var109].method1342(29550);
                            class307.field4778[var6++] = var110 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var528 == 3913) {
                            var6--;
                            int var111 = class307.field4778[var6];
                            int var112 = class12.field191[var111].method1342(29550);
                            class307.field4778[var6++] = var112 == 1 ? 1 : 0;
                            continue;
                        }
                    } else if (var528 < 4100) {
                        if (var528 == 4000) {
                            var6 -= 2;
                            int var113 = class307.field4778[var6];
                            int var114 = class307.field4778[var6 + 1];
                            class307.field4778[var6++] = var113 + var114;
                            continue;
                        }
                        if (var528 == 4001) {
                            var6 -= 2;
                            int var115 = class307.field4778[var6 + 1];
                            int var116 = class307.field4778[var6];
                            class307.field4778[var6++] = var116 - var115;
                            continue;
                        }
                        if (var528 == 4002) {
                            var6 -= 2;
                            int var117 = class307.field4778[var6];
                            int var118 = class307.field4778[var6 + 1];
                            class307.field4778[var6++] = var117 * var118;
                            continue;
                        }
                        if (var528 == 4003) {
                            var6 -= 2;
                            int var119 = class307.field4778[var6];
                            int var120 = class307.field4778[var6 + 1];
                            class307.field4778[var6++] = var119 / var120;
                            continue;
                        }
                        if (var528 == 4004) {
                            var6--;
                            int var121 = class307.field4778[var6];
                            class307.field4778[var6++] = (int) ((double) var121 * Math.random());
                            continue;
                        }
                        if (var528 == 4005) {
                            var6--;
                            int var122 = class307.field4778[var6];
                            class307.field4778[var6++] = (int) ((double) (var122 + 1) * Math.random());
                            continue;
                        }
                        if (var528 == 4006) {
                            var6 -= 5;
                            int var123 = class307.field4778[var6];
                            int var124 = class307.field4778[var6 + 1];
                            int var125 = class307.field4778[var6 + 3];
                            int var126 = class307.field4778[var6 + 4];
                            int var127 = class307.field4778[var6 + 2];
                            class307.field4778[var6++] = var123 + ((var124 - var123) * (var126 - var127) / (var125 - var127));
                            continue;
                        }
                        if (var528 == 4007) {
                            var6 -= 2;
                            long var128 = (long) class307.field4778[var6];
                            long var130 = (long) class307.field4778[var6 + 1];
                            class307.field4778[var6++] = (int) (var128 + (var128 * var130 / 100L));
                            continue;
                        }
                        if (var528 == 4008) {
                            var6 -= 2;
                            int var132 = class307.field4778[var6 + 1];
                            int var133 = class307.field4778[var6];
                            class307.field4778[var6++] = class222.method1577(0x1 << var132, var133);
                            continue;
                        }
                        if (var528 == 4009) {
                            var6 -= 2;
                            int var134 = class307.field4778[var6 + 1];
                            int var135 = class307.field4778[var6];
                            class307.field4778[var6++] = class270.method1860(var135, -(0x1 << var134) - 1);
                            continue;
                        }
                        if (var528 == 4010) {
                            var6 -= 2;
                            int var136 = class307.field4778[var6];
                            int var137 = class307.field4778[var6 + 1];
                            class307.field4778[var6++] = class270.method1860(0x1 << var137, var136) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var528 == 4011) {
                            var6 -= 2;
                            int var138 = class307.field4778[var6];
                            int var139 = class307.field4778[var6 + 1];
                            class307.field4778[var6++] = var138 % var139;
                            continue;
                        }
                        if (var528 == 4012) {
                            var6 -= 2;
                            int var140 = class307.field4778[var6];
                            int var141 = class307.field4778[var6 + 1];
                            if (var140 == 0) {
                                class307.field4778[var6++] = 0;
                            } else {
                                class307.field4778[var6++] = (int) Math.pow((double) var140, (double) var141);
                            }
                            continue;
                        }
                        if (var528 == 4013) {
                            var6 -= 2;
                            int var142 = class307.field4778[var6];
                            int var143 = class307.field4778[var6 + 1];
                            if (var142 == 0) {
                                class307.field4778[var6++] = 0;
                            } else if (var143 == 0) {
                                class307.field4778[var6++] = Integer.MAX_VALUE;
                            } else {
                                class307.field4778[var6++] = (int) Math.pow((double) var142, 1.0D / (double) var143);
                            }
                            continue;
                        }
                        if (var528 == 4014) {
                            var6 -= 2;
                            int var144 = class307.field4778[var6];
                            int var145 = class307.field4778[var6 + 1];
                            class307.field4778[var6++] = class270.method1860(var144, var145);
                            continue;
                        }
                        if (var528 == 4015) {
                            var6 -= 2;
                            int var146 = class307.field4778[var6];
                            int var147 = class307.field4778[var6 + 1];
                            class307.field4778[var6++] = class222.method1577(var146, var147);
                            continue;
                        }
                        if (var528 == 4016) {
                            var6 -= 2;
                            int var148 = class307.field4778[var6];
                            int var149 = class307.field4778[var6 + 1];
                            class307.field4778[var6++] = var149 <= var148 ? var149 : var148;
                            continue;
                        }
                        if (var528 == 4017) {
                            var6 -= 2;
                            int var150 = class307.field4778[var6 + 1];
                            int var151 = class307.field4778[var6];
                            class307.field4778[var6++] = var150 < var151 ? var151 : var150;
                            continue;
                        }
                        if (var528 == 4018) {
                            var6 -= 3;
                            long var152 = (long) class307.field4778[var6 + 1];
                            long var154 = (long) class307.field4778[var6 + 2];
                            long var156 = (long) class307.field4778[var6];
                            class307.field4778[var6++] = (int) (var154 * var156 / var152);
                            continue;
                        }
                    } else if (var528 < 4200) {
                        if (var528 == 4100) {
                            var7--;
                            String var367 = class186.field2789[var7];
                            var6--;
                            int var368 = class307.field4778[var6];
                            class186.field2789[var7++] = var367 + var368;
                            continue;
                        }
                        if (var528 == 4101) {
                            var7 -= 2;
                            String var369 = class186.field2789[var7];
                            String var370 = class186.field2789[var7 + 1];
                            class186.field2789[var7++] = var369 + var370;
                            continue;
                        }
                        if (var528 == 4102) {
                            var6--;
                            int var371 = class307.field4778[var6];
                            var7--;
                            String var372 = class186.field2789[var7];
                            class186.field2789[var7++] = var372 + class161.method1096(68, var371, true);
                            continue;
                        }
                        if (var528 == 4103) {
                            var7--;
                            String var373 = class186.field2789[var7];
                            class186.field2789[var7++] = var373.toLowerCase();
                            continue;
                        }
                        if (var528 == 4104) {
                            var6--;
                            int var374 = class307.field4778[var6];
                            long var375 = (long) var374 * 86400000L + 1014768000000L;
                            class61.field987.setTime(new Date(var375));
                            int var377 = class61.field987.get(5);
                            int var378 = class61.field987.get(2);
                            int var379 = class61.field987.get(1);
                            class186.field2789[var7++] = var377 + "-" + class207.field3181[var378] + "-" + var379;
                            continue;
                        }
                        if (var528 == 4105) {
                            var7 -= 2;
                            String var380 = class186.field2789[var7];
                            String var381 = class186.field2789[var7 + 1];
                            if (class98.field1566.field499 != null && class98.field1566.field499.field2827) {
                                class186.field2789[var7++] = var381;
                                continue;
                            }
                            class186.field2789[var7++] = var380;
                            continue;
                        }
                        if (var528 == 4106) {
                            var6--;
                            int var382 = class307.field4778[var6];
                            class186.field2789[var7++] = Integer.toString(var382);
                            continue;
                        }
                        if (var528 == 4107) {
                            var7 -= 2;
                            class307.field4778[var6++] = class18.method143(class137.method997((byte) -116, class186.field2789[var7 + 1], class195.field2920, class186.field2789[var7]), (byte) 51);
                            continue;
                        }
                        if (var528 == 4108) {
                            var7--;
                            String var383 = class186.field2789[var7];
                            var6 -= 2;
                            int var384 = class307.field4778[var6];
                            int var385 = class307.field4778[var6 + 1];
                            class307.field4778[var6++] = class331.method2298(-1, var385).method2248(var383, var384);
                            continue;
                        }
                        if (var528 == 4109) {
                            var6 -= 2;
                            int var386 = class307.field4778[var6];
                            var7--;
                            String var387 = class186.field2789[var7];
                            int var388 = class307.field4778[var6 + 1];
                            class307.field4778[var6++] = class331.method2298(-1, var388).method2238(var387, var386);
                            continue;
                        }
                        if (var528 == 4110) {
                            var7 -= 2;
                            String var389 = class186.field2789[var7];
                            String var390 = class186.field2789[var7 + 1];
                            var6--;
                            if (class307.field4778[var6] == 1) {
                                class186.field2789[var7++] = var389;
                            } else {
                                class186.field2789[var7++] = var390;
                            }
                            continue;
                        }
                        if (var528 == 4111) {
                            var7--;
                            String var391 = class186.field2789[var7];
                            class186.field2789[var7++] = class329.method2232(var391);
                            continue;
                        }
                        if (var528 == 4112) {
                            var7--;
                            String var392 = class186.field2789[var7];
                            var6--;
                            int var393 = class307.field4778[var6];
                            if (var393 == -1) {
                                throw new RuntimeException("null char");
                            }
                            class186.field2789[var7++] = var392 + (char) var393;
                            continue;
                        }
                        if (var528 == 4113) {
                            var6--;
                            int var394 = class307.field4778[var6];
                            class307.field4778[var6++] = class300.method2053((char) var394, -49) ? 1 : 0;
                            continue;
                        }
                        if (var528 == 4114) {
                            var6--;
                            int var395 = class307.field4778[var6];
                            class307.field4778[var6++] = class325.method2204((char) var395, 7370) ? 1 : 0;
                            continue;
                        }
                        if (var528 == 4115) {
                            var6--;
                            int var396 = class307.field4778[var6];
                            class307.field4778[var6++] = class193.method1374((byte) -111, (char) var396) ? 1 : 0;
                            continue;
                        }
                        if (var528 == 4116) {
                            var6--;
                            int var397 = class307.field4778[var6];
                            class307.field4778[var6++] = class258.method1767((char) var397, (byte) 115) ? 1 : 0;
                            continue;
                        }
                        if (var528 == 4117) {
                            var7--;
                            String var398 = class186.field2789[var7];
                            if (var398 == null) {
                                class307.field4778[var6++] = 0;
                            } else {
                                class307.field4778[var6++] = var398.length();
                            }
                            continue;
                        }
                        if (var528 == 4118) {
                            var6 -= 2;
                            var7--;
                            String var399 = class186.field2789[var7];
                            int var400 = class307.field4778[var6];
                            int var401 = class307.field4778[var6 + 1];
                            class186.field2789[var7++] = var399.substring(var400, var401);
                            continue;
                        }
                        if (var528 == 4119) {
                            var7--;
                            String var402 = class186.field2789[var7];
                            boolean var403 = false;
                            StringBuffer var404 = new StringBuffer(var402.length());
                            for (int var405 = 0; var402.length() > var405; var405++) {
                                char var406 = var402.charAt(var405);
                                if (var406 == '<') {
                                    var403 = true;
                                } else if (var406 == '>') {
                                    var403 = false;
                                } else if (!var403) {
                                    var404.append(var406);
                                }
                            }
                            class186.field2789[var7++] = var404.toString();
                            continue;
                        }
                        if (var528 == 4120) {
                            var6 -= 2;
                            var7--;
                            String var407 = class186.field2789[var7];
                            int var408 = class307.field4778[var6];
                            int var409 = class307.field4778[var6 + 1];
                            class307.field4778[var6++] = var407.indexOf(var408, var409);
                            continue;
                        }
                        if (var528 == 4121) {
                            var7 -= 2;
                            String var410 = class186.field2789[var7];
                            var6--;
                            int var411 = class307.field4778[var6];
                            String var412 = class186.field2789[var7 + 1];
                            class307.field4778[var6++] = var410.indexOf(var412, var411);
                            continue;
                        }
                        if (var528 == 4122) {
                            var6--;
                            int var413 = class307.field4778[var6];
                            class307.field4778[var6++] = Character.toLowerCase((char) var413);
                            continue;
                        }
                        if (var528 == 4123) {
                            var6--;
                            int var414 = class307.field4778[var6];
                            class307.field4778[var6++] = Character.toUpperCase((char) var414);
                            continue;
                        }
                        if (var528 == 4124) {
                            var6--;
                            boolean var415 = class307.field4778[var6] != 0;
                            var6--;
                            int var416 = class307.field4778[var6];
                            class186.field2789[var7++] = class292.method1994((long) var416, 0, class195.field2920, (byte) -114, var415);
                            continue;
                        }
                    } else if (var528 < 4300) {
                        if (var528 == 4200) {
                            var6--;
                            int var158 = class307.field4778[var6];
                            class186.field2789[var7++] = class237.method1657(2, var158).field4650;
                            continue;
                        }
                        if (var528 == 4201) {
                            var6 -= 2;
                            int var159 = class307.field4778[var6];
                            int var160 = class307.field4778[var6 + 1];
                            class299 var161 = class237.method1657(2, var159);
                            if (var160 >= 1 && var160 <= 5 && var161.field4643[var160 - 1] != null) {
                                class186.field2789[var7++] = var161.field4643[var160 - 1];
                                continue;
                            }
                            class186.field2789[var7++] = "";
                            continue;
                        }
                        if (var528 == 4202) {
                            var6 -= 2;
                            int var162 = class307.field4778[var6];
                            int var163 = class307.field4778[var6 + 1];
                            class299 var164 = class237.method1657(2, var162);
                            if (var163 >= 1 && var163 <= 5 && var164.field4606[var163 - 1] != null) {
                                class186.field2789[var7++] = var164.field4606[var163 - 1];
                                continue;
                            }
                            class186.field2789[var7++] = "";
                            continue;
                        }
                        if (var528 == 4203) {
                            var6--;
                            int var165 = class307.field4778[var6];
                            class307.field4778[var6++] = class237.method1657(2, var165).field4657;
                            continue;
                        }
                        if (var528 == 4204) {
                            var6--;
                            int var166 = class307.field4778[var6];
                            class307.field4778[var6++] = class237.method1657(2, var166).field4641 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var528 == 4205) {
                            var6--;
                            int var167 = class307.field4778[var6];
                            class299 var168 = class237.method1657(2, var167);
                            if (var168.field4616 == -1 && var168.field4623 >= 0) {
                                class307.field4778[var6++] = var168.field4623;
                                continue;
                            }
                            class307.field4778[var6++] = var167;
                            continue;
                        }
                        if (var528 == 4206) {
                            var6--;
                            int var169 = class307.field4778[var6];
                            class299 var170 = class237.method1657(2, var169);
                            if (var170.field4616 >= 0 && var170.field4623 >= 0) {
                                class307.field4778[var6++] = var170.field4623;
                                continue;
                            }
                            class307.field4778[var6++] = var169;
                            continue;
                        }
                        if (var528 == 4207) {
                            var6--;
                            int var171 = class307.field4778[var6];
                            class307.field4778[var6++] = class237.method1657(2, var171).field4609 ? 1 : 0;
                            continue;
                        }
                        if (var528 == 4208) {
                            var6 -= 2;
                            int var172 = class307.field4778[var6 + 1];
                            int var173 = class307.field4778[var6];
                            class177 var174 = class299.method2044(var172, (byte) -103);
                            if (var174.method1264((byte) 41)) {
                                class186.field2789[var7++] = class237.method1657(2, var173).method2039(2872, var174.field2686, var172);
                            } else {
                                class307.field4778[var6++] = class237.method1657(2, var173).method2036(var172, 2, var174.field2684);
                            }
                            continue;
                        }
                        if (var528 == 4210) {
                            var6--;
                            int var175 = class307.field4778[var6];
                            var7--;
                            String var176 = class186.field2789[var7];
                            class23.method228(var176, var175 == 1, -25942);
                            class307.field4778[var6++] = class55.field921;
                            continue;
                        }
                        if (var528 == 4211) {
                            if (class121.field1849 != null && class120.field1836 < class55.field921) {
                                class307.field4778[var6++] = class270.method1860(class121.field1849[class120.field1836++], 65535);
                                continue;
                            }
                            class307.field4778[var6++] = -1;
                            continue;
                        }
                        if (var528 == 4212) {
                            class120.field1836 = 0;
                            continue;
                        }
                    } else if (var528 >= 4400) {
                        if (var528 < 4500) {
                            if (var528 == 4400) {
                                var6 -= 2;
                                int var177 = class307.field4778[var6];
                                int var178 = class307.field4778[var6 + 1];
                                class177 var179 = class299.method2044(var178, (byte) -79);
                                if (var179.method1264((byte) 103)) {
                                    class186.field2789[var7++] = class201.method1431(-102, var177).method610(var179.field2686, var178, true);
                                } else {
                                    class307.field4778[var6++] = class201.method1431(-120, var177).method602(var178, var179.field2684, 31);
                                }
                                continue;
                            }
                        } else if (var528 < 4600) {
                            if (var528 == 4500) {
                                var6 -= 2;
                                int var180 = class307.field4778[var6];
                                int var181 = class307.field4778[var6 + 1];
                                class177 var182 = class299.method2044(var181, (byte) -128);
                                if (var182.method1264((byte) 91)) {
                                    class186.field2789[var7++] = class97.method721(var180, (byte) 13).method63(0, var181, var182.field2686);
                                } else {
                                    class307.field4778[var6++] = class97.method721(var180, (byte) 13).method55(var181, var182.field2684, (byte) -35);
                                }
                                continue;
                            }
                        } else if (var528 < 5100) {
                            if (var528 == 5000) {
                                class307.field4778[var6++] = class96.field1533;
                                continue;
                            }
                            if (var528 == 5001) {
                                var6 -= 3;
                                class96.field1533 = class307.field4778[var6];
                                class104.field1618 = class307.field4778[var6 + 1];
                                class326.field5069++;
                                class160.field2400 = class307.field4778[var6 + 2];
                                class106.field1642.method753(123, 150);
                                class106.field1642.method1132((byte) 29, class96.field1533);
                                class106.field1642.method1132((byte) 29, class104.field1618);
                                class106.field1642.method1132((byte) 29, class160.field2400);
                                continue;
                            }
                            if (var528 == 5002) {
                                var6 -= 2;
                                var7--;
                                String var183 = class186.field2789[var7];
                                class84.field1313++;
                                int var184 = class307.field4778[var6];
                                int var185 = class307.field4778[var6 + 1];
                                class106.field1642.method753(126, 82);
                                class106.field1642.method1125(8473, class128.method926(var183, (byte) -61));
                                class106.field1642.method1132((byte) 29, var184 - 1);
                                class106.field1642.method1132((byte) 29, var185);
                                continue;
                            }
                            if (var528 == 5003) {
                                var6--;
                                int var186 = class307.field4778[var6];
                                String var187 = null;
                                if (var186 < 100) {
                                    var187 = class268.field4186[var186];
                                }
                                if (var187 == null) {
                                    var187 = "";
                                }
                                class186.field2789[var7++] = var187;
                                continue;
                            }
                            if (var528 == 5004) {
                                var6--;
                                int var188 = class307.field4778[var6];
                                int var189 = -1;
                                if (var188 < 100 && class268.field4186[var188] != null) {
                                    var189 = class75.field1207[var188];
                                }
                                class307.field4778[var6++] = var189;
                                continue;
                            }
                            if (var528 == 5005) {
                                class307.field4778[var6++] = class104.field1618;
                                continue;
                            }
                            if (var528 == 5008) {
                                var7--;
                                String var190 = class186.field2789[var7];
                                if (var190.startsWith("::")) {
                                    class128.method932(var190, false);
                                    continue;
                                }
                                if (class52.field853 == 0 && (class73.field1203 && !class148.field2250 || class33.field504)) {
                                    continue;
                                }
                                class110.field1715++;
                                String var191 = var190.toLowerCase();
                                byte var192 = 0;
                                if (var191.startsWith(class89.field1426)) {
                                    var192 = 0;
                                    var190 = var190.substring(class89.field1426.length());
                                } else if (var191.startsWith(class187.field2790)) {
                                    var190 = var190.substring(class187.field2790.length());
                                    var192 = 1;
                                } else if (var191.startsWith(class128.field2015)) {
                                    var192 = 2;
                                    var190 = var190.substring(class128.field2015.length());
                                } else if (var191.startsWith(class47.field765)) {
                                    var190 = var190.substring(class47.field765.length());
                                    var192 = 3;
                                } else if (var191.startsWith(class105.field1623)) {
                                    var192 = 4;
                                    var190 = var190.substring(class105.field1623.length());
                                } else if (var191.startsWith(class314.field4868)) {
                                    var190 = var190.substring(class314.field4868.length());
                                    var192 = 5;
                                } else if (var191.startsWith(class216.field3291)) {
                                    var192 = 6;
                                    var190 = var190.substring(class216.field3291.length());
                                } else if (var191.startsWith(class290.field4517)) {
                                    var192 = 7;
                                    var190 = var190.substring(class290.field4517.length());
                                } else if (var191.startsWith(class153.field2296)) {
                                    var192 = 8;
                                    var190 = var190.substring(class153.field2296.length());
                                } else if (var191.startsWith(class284.field4451)) {
                                    var190 = var190.substring(class284.field4451.length());
                                    var192 = 9;
                                } else if (var191.startsWith(class265.field4124)) {
                                    var190 = var190.substring(class265.field4124.length());
                                    var192 = 10;
                                } else if (var191.startsWith(class268.field4185)) {
                                    var190 = var190.substring(class268.field4185.length());
                                    var192 = 11;
                                } else if (class195.field2920 != 0) {
                                    if (var191.startsWith(class204.field3076)) {
                                        var192 = 0;
                                        var190 = var190.substring(class204.field3076.length());
                                    } else if (var191.startsWith(class194.field2903)) {
                                        var192 = 1;
                                        var190 = var190.substring(class194.field2903.length());
                                    } else if (var191.startsWith(class65.field1023)) {
                                        var190 = var190.substring(class65.field1023.length());
                                        var192 = 2;
                                    } else if (var191.startsWith(class177.field2678)) {
                                        var192 = 3;
                                        var190 = var190.substring(class177.field2678.length());
                                    } else if (var191.startsWith(class244.field3908)) {
                                        var192 = 4;
                                        var190 = var190.substring(class244.field3908.length());
                                    } else if (var191.startsWith(class163.field2450)) {
                                        var192 = 5;
                                        var190 = var190.substring(class163.field2450.length());
                                    } else if (var191.startsWith(class98.field1569)) {
                                        var190 = var190.substring(class98.field1569.length());
                                        var192 = 6;
                                    } else if (var191.startsWith(class176.field2673)) {
                                        var192 = 7;
                                        var190 = var190.substring(class176.field2673.length());
                                    } else if (var191.startsWith(class195.field2916)) {
                                        var190 = var190.substring(class195.field2916.length());
                                        var192 = 8;
                                    } else if (var191.startsWith(class275.field4250)) {
                                        var192 = 9;
                                        var190 = var190.substring(class275.field4250.length());
                                    } else if (var191.startsWith(class119.field1824)) {
                                        var192 = 10;
                                        var190 = var190.substring(class119.field1824.length());
                                    } else if (var191.startsWith(class108.field1696)) {
                                        var192 = 11;
                                        var190 = var190.substring(class108.field1696.length());
                                    }
                                }
                                String var193 = var190.toLowerCase();
                                byte var194 = 0;
                                if (var193.startsWith(class132.field2082)) {
                                    var194 = 1;
                                    var190 = var190.substring(class132.field2082.length());
                                } else if (var193.startsWith(class251.field3970)) {
                                    var194 = 2;
                                    var190 = var190.substring(class251.field3970.length());
                                } else if (var193.startsWith(class288.field4495)) {
                                    var190 = var190.substring(class288.field4495.length());
                                    var194 = 3;
                                } else if (var193.startsWith(class152.field2295)) {
                                    var190 = var190.substring(class152.field2295.length());
                                    var194 = 4;
                                } else if (var193.startsWith(class212.field3230)) {
                                    var194 = 5;
                                    var190 = var190.substring(class212.field3230.length());
                                } else if (class195.field2920 != 0) {
                                    if (var193.startsWith(class203.field3048)) {
                                        var194 = 1;
                                        var190 = var190.substring(class203.field3048.length());
                                    } else if (var193.startsWith(class244.field3896)) {
                                        var194 = 2;
                                        var190 = var190.substring(class244.field3896.length());
                                    } else if (var193.startsWith(class154.field2322)) {
                                        var194 = 3;
                                        var190 = var190.substring(class154.field2322.length());
                                    } else if (var193.startsWith(class181.field2733)) {
                                        var194 = 4;
                                        var190 = var190.substring(class181.field2733.length());
                                    } else if (var193.startsWith(class80.field1267)) {
                                        var194 = 5;
                                        var190 = var190.substring(class80.field1267.length());
                                    }
                                }
                                class106.field1642.method753(-66, 34);
                                class106.field1642.method1132((byte) 29, 0);
                                int var195 = class106.field1642.field2532;
                                class106.field1642.method1132((byte) 29, var192);
                                class106.field1642.method1132((byte) 29, var194);
                                class294.method2002(-27723, class106.field1642, var190);
                                class106.field1642.method1141((byte) 120, class106.field1642.field2532 - var195);
                                continue;
                            }
                            if (var528 == 5009) {
                                var7 -= 2;
                                String var196 = class186.field2789[var7 + 1];
                                String var197 = class186.field2789[var7];
                                if (class52.field853 != 0 || (!class73.field1203 || class148.field2250) && !class33.field504) {
                                    class106.field1642.method753(125, 46);
                                    class106.field1642.method1132((byte) 29, 0);
                                    field3636++;
                                    int var198 = class106.field1642.field2532;
                                    class106.field1642.method1125(8473, class128.method926(var197, (byte) -53));
                                    class294.method2002(-27723, class106.field1642, var196);
                                    class106.field1642.method1141((byte) 114, class106.field1642.field2532 - var198);
                                }
                                continue;
                            }
                            if (var528 == 5010) {
                                var6--;
                                int var199 = class307.field4778[var6];
                                String var200 = null;
                                if (var199 < 100) {
                                    var200 = class217.field3301[var199];
                                }
                                if (var200 == null) {
                                    var200 = "";
                                }
                                class186.field2789[var7++] = var200;
                                continue;
                            }
                            if (var528 == 5011) {
                                var6--;
                                int var201 = class307.field4778[var6];
                                String var202 = null;
                                if (var201 < 100) {
                                    var202 = class335.field5252[var201];
                                }
                                if (var202 == null) {
                                    var202 = "";
                                }
                                class186.field2789[var7++] = var202;
                                continue;
                            }
                            if (var528 == 5012) {
                                var6--;
                                int var203 = class307.field4778[var6];
                                int var204 = -1;
                                if (var203 < 100) {
                                    var204 = class63.field1005[var203];
                                }
                                class307.field4778[var6++] = var204;
                                continue;
                            }
                            if (var528 == 5015) {
                                String var205;
                                if (class98.field1566 == null || class98.field1566.field477 == null) {
                                    var205 = class298.field4602;
                                } else {
                                    var205 = class98.field1566.method272(27884);
                                }
                                class186.field2789[var7++] = var205;
                                continue;
                            }
                            if (var528 == 5016) {
                                class307.field4778[var6++] = class160.field2400;
                                continue;
                            }
                            if (var528 == 5017) {
                                class307.field4778[var6++] = class263.field4095;
                                continue;
                            }
                            if (var528 == 5050) {
                                var6--;
                                int var206 = class307.field4778[var6];
                                class186.field2789[var7++] = class163.method1109(var206, -32769).field3223;
                                continue;
                            }
                            if (var528 == 5051) {
                                var6--;
                                int var207 = class307.field4778[var6];
                                class212 var208 = class163.method1109(var207, -32769);
                                if (var208.field3215 == null) {
                                    class307.field4778[var6++] = 0;
                                } else {
                                    class307.field4778[var6++] = var208.field3215.length;
                                }
                                continue;
                            }
                            if (var528 == 5052) {
                                var6 -= 2;
                                int var209 = class307.field4778[var6 + 1];
                                int var210 = class307.field4778[var6];
                                class212 var211 = class163.method1109(var210, -32769);
                                int var212 = var211.field3215[var209];
                                class307.field4778[var6++] = var212;
                                continue;
                            }
                            if (var528 == 5053) {
                                var6--;
                                int var213 = class307.field4778[var6];
                                class212 var214 = class163.method1109(var213, -32769);
                                if (var214.field3233 == null) {
                                    class307.field4778[var6++] = 0;
                                } else {
                                    class307.field4778[var6++] = var214.field3233.length;
                                }
                                continue;
                            }
                            if (var528 == 5054) {
                                var6 -= 2;
                                int var215 = class307.field4778[var6 + 1];
                                int var216 = class307.field4778[var6];
                                class307.field4778[var6++] = class163.method1109(var216, -32769).field3233[var215];
                                continue;
                            }
                            if (var528 == 5055) {
                                var6--;
                                int var217 = class307.field4778[var6];
                                class186.field2789[var7++] = class173.method1248(var217, -120).method465((byte) -45);
                                continue;
                            }
                            if (var528 == 5056) {
                                var6--;
                                int var218 = class307.field4778[var6];
                                class59 var219 = class173.method1248(var218, -17);
                                if (var219.field947 == null) {
                                    class307.field4778[var6++] = 0;
                                } else {
                                    class307.field4778[var6++] = var219.field947.length;
                                }
                                continue;
                            }
                            if (var528 == 5057) {
                                var6 -= 2;
                                int var220 = class307.field4778[var6];
                                int var221 = class307.field4778[var6 + 1];
                                class307.field4778[var6++] = class173.method1248(var220, -105).field947[var221];
                                continue;
                            }
                            if (var528 == 5058) {
                                class11.field165 = new class289();
                                var6--;
                                class11.field165.field4504 = class307.field4778[var6];
                                class11.field165.field4501 = class173.method1248(class11.field165.field4504, 114);
                                class11.field165.field4499 = new int[class11.field165.field4501.method470(26750)];
                                continue;
                            }
                            if (var528 == 5059) {
                                class106.field1642.method753(-38, 58);
                                class152.field2293++;
                                class106.field1642.method1132((byte) 29, 0);
                                int var222 = class106.field1642.field2532;
                                class106.field1642.method1132((byte) 29, 0);
                                class106.field1642.method1150(class11.field165.field4504, -628562744);
                                class11.field165.field4501.method462(100, class11.field165.field4499, class106.field1642);
                                class106.field1642.method1141((byte) 103, class106.field1642.field2532 - var222);
                                continue;
                            }
                            if (var528 == 5060) {
                                class231.field3659++;
                                var7--;
                                String var223 = class186.field2789[var7];
                                class106.field1642.method753(1, 240);
                                class106.field1642.method1132((byte) 29, 0);
                                int var224 = class106.field1642.field2532;
                                class106.field1642.method1125(8473, class128.method926(var223, (byte) -64));
                                class106.field1642.method1150(class11.field165.field4504, -628562744);
                                class11.field165.field4501.method462(-49, class11.field165.field4499, class106.field1642);
                                class106.field1642.method1141((byte) 107, class106.field1642.field2532 - var224);
                                continue;
                            }
                            if (var528 == 5061) {
                                class152.field2293++;
                                class106.field1642.method753(126, 58);
                                class106.field1642.method1132((byte) 29, 0);
                                int var225 = class106.field1642.field2532;
                                class106.field1642.method1132((byte) 29, 1);
                                class106.field1642.method1150(class11.field165.field4504, -628562744);
                                class11.field165.field4501.method462(-25, class11.field165.field4499, class106.field1642);
                                class106.field1642.method1141((byte) 118, class106.field1642.field2532 - var225);
                                continue;
                            }
                            if (var528 == 5062) {
                                var6 -= 2;
                                int var226 = class307.field4778[var6];
                                int var227 = class307.field4778[var6 + 1];
                                class307.field4778[var6++] = class163.method1109(var226, -32769).field3225[var227];
                                continue;
                            }
                            if (var528 == 5063) {
                                var6 -= 2;
                                int var228 = class307.field4778[var6 + 1];
                                int var229 = class307.field4778[var6];
                                class307.field4778[var6++] = class163.method1109(var229, -32769).field3222[var228];
                                continue;
                            }
                            if (var528 == 5064) {
                                var6 -= 2;
                                int var230 = class307.field4778[var6];
                                int var231 = class307.field4778[var6 + 1];
                                if (var231 == -1) {
                                    class307.field4778[var6++] = -1;
                                } else {
                                    class307.field4778[var6++] = class163.method1109(var230, -32769).method1490((byte) 124, (char) var231);
                                }
                                continue;
                            }
                            if (var528 == 5065) {
                                var6 -= 2;
                                int var232 = class307.field4778[var6];
                                int var233 = class307.field4778[var6 + 1];
                                if (var233 == -1) {
                                    class307.field4778[var6++] = -1;
                                } else {
                                    class307.field4778[var6++] = class163.method1109(var232, -32769).method1495((char) var233, -4);
                                }
                                continue;
                            }
                            if (var528 == 5066) {
                                var6--;
                                int var234 = class307.field4778[var6];
                                class307.field4778[var6++] = class173.method1248(var234, 125).method470(26750);
                                continue;
                            }
                            if (var528 == 5067) {
                                var6 -= 2;
                                int var235 = class307.field4778[var6];
                                int var236 = class307.field4778[var6 + 1];
                                int var237 = class173.method1248(var235, 120).method472(true, var236);
                                class307.field4778[var6++] = var237;
                                continue;
                            }
                            if (var528 == 5068) {
                                var6 -= 2;
                                int var238 = class307.field4778[var6 + 1];
                                int var239 = class307.field4778[var6];
                                class11.field165.field4499[var239] = var238;
                                continue;
                            }
                            if (var528 == 5069) {
                                var6 -= 2;
                                int var240 = class307.field4778[var6];
                                int var241 = class307.field4778[var6 + 1];
                                class11.field165.field4499[var240] = var241;
                                continue;
                            }
                            if (var528 == 5070) {
                                var6 -= 3;
                                int var242 = class307.field4778[var6];
                                int var243 = class307.field4778[var6 + 1];
                                int var244 = class307.field4778[var6 + 2];
                                class59 var245 = class173.method1248(var242, 126);
                                if (var245.method472(true, var243) != 0) {
                                    throw new RuntimeException("bad command");
                                }
                                class307.field4778[var6++] = var245.method460(var244, (byte) -23, var243);
                                continue;
                            }
                            if (var528 == 5071) {
                                var7--;
                                String var246 = class186.field2789[var7];
                                var6--;
                                boolean var247 = class307.field4778[var6] == 1;
                                class337.method2340(0, var247, var246);
                                class307.field4778[var6++] = class55.field921;
                                continue;
                            }
                            if (var528 == 5072) {
                                if (class121.field1849 != null && class120.field1836 < class55.field921) {
                                    class307.field4778[var6++] = class270.method1860(65535, class121.field1849[class120.field1836++]);
                                    continue;
                                }
                                class307.field4778[var6++] = -1;
                                continue;
                            }
                            if (var528 == 5073) {
                                class120.field1836 = 0;
                                continue;
                            }
                        } else if (var528 < 5200) {
                            if (var528 == 5100) {
                                if (class53.field902[86]) {
                                    class307.field4778[var6++] = 1;
                                } else {
                                    class307.field4778[var6++] = 0;
                                }
                                continue;
                            }
                            if (var528 == 5101) {
                                if (class53.field902[82]) {
                                    class307.field4778[var6++] = 1;
                                } else {
                                    class307.field4778[var6++] = 0;
                                }
                                continue;
                            }
                            if (var528 == 5102) {
                                if (class53.field902[81]) {
                                    class307.field4778[var6++] = 1;
                                } else {
                                    class307.field4778[var6++] = 0;
                                }
                                continue;
                            }
                        } else if (var528 < 5300) {
                            if (var528 == 5200) {
                                var6--;
                                class295.method2007((byte) 65, class307.field4778[var6]);
                                continue;
                            }
                            if (var528 == 5201) {
                                class307.field4778[var6++] = class205.method1458(-107);
                                continue;
                            }
                            if (var528 == 5202) {
                                var6--;
                                class317.method2154(class307.field4778[var6], 0);
                                continue;
                            }
                            if (var528 == 5203) {
                                var7--;
                                class320.method2185(40, class186.field2789[var7]);
                                continue;
                            }
                            if (var528 == 5204) {
                                class186.field2789[var7 - 1] = class51.method428(class186.field2789[var7 - 1], 113);
                                continue;
                            }
                            if (var528 == 5205) {
                                var6--;
                                class81.method582(class307.field4778[var6], 0, -1, -1);
                                continue;
                            }
                            if (var528 == 5206) {
                                var6--;
                                int var326 = class307.field4778[var6];
                                class2 var327 = class32.method269(16474, var326 >> 14 & 0x3FFF, var326 & 0x3FFF);
                                if (var327 == null) {
                                    class307.field4778[var6++] = -1;
                                } else {
                                    class307.field4778[var6++] = var327.field28;
                                }
                                continue;
                            }
                            if (var528 == 5207) {
                                var6--;
                                class2 var328 = method1621(class307.field4778[var6], 32767);
                                if (var328 != null && var328.field43 != null) {
                                    class186.field2789[var7++] = var328.field43;
                                    continue;
                                }
                                class186.field2789[var7++] = "";
                                continue;
                            }
                            if (var528 == 5208) {
                                class307.field4778[var6++] = class312.field4840;
                                class307.field4778[var6++] = class309.field4805;
                                continue;
                            }
                            if (var528 == 5209) {
                                class307.field4778[var6++] = class84.field1311 + class265.field4119;
                                class307.field4778[var6++] = class233.field3706 - (-class333.field5202 + class128.field2024) - 1;
                                continue;
                            }
                            if (var528 == 5210) {
                                var6--;
                                int var329 = class307.field4778[var6];
                                class2 var330 = method1621(var329, 32767);
                                if (var330 == null) {
                                    class307.field4778[var6++] = 0;
                                    class307.field4778[var6++] = 0;
                                } else {
                                    class307.field4778[var6++] = class270.method1860(268421232, var330.field31) >> 14;
                                    class307.field4778[var6++] = class270.method1860(var330.field31, 16383);
                                }
                                continue;
                            }
                            if (var528 == 5211) {
                                var6--;
                                int var331 = class307.field4778[var6];
                                class2 var332 = method1621(var331, 32767);
                                if (var332 == null) {
                                    class307.field4778[var6++] = 0;
                                    class307.field4778[var6++] = 0;
                                } else {
                                    class307.field4778[var6++] = var332.field37 - var332.field22;
                                    class307.field4778[var6++] = var332.field36 - var332.field26;
                                }
                                continue;
                            }
                            if (var528 == 5212) {
                                int var333 = class11.method85(-9896);
                                int var334 = 0;
                                String var335;
                                if (var333 == -1) {
                                    var335 = "";
                                } else {
                                    var335 = class162.field2445.field4693[var333];
                                    var334 = class162.field2445.method2047(var333, (byte) -121);
                                }
                                String var336 = class67.method516(var335, " ", "<br>", false);
                                class186.field2789[var7++] = var336;
                                class307.field4778[var6++] = var334;
                                continue;
                            }
                            if (var528 == 5213) {
                                int var337 = class213.method1497(true);
                                int var338 = 0;
                                String var339;
                                if (var337 == -1) {
                                    var339 = "";
                                } else {
                                    var339 = class162.field2445.field4693[var337];
                                    var338 = class162.field2445.method2047(var337, (byte) -121);
                                }
                                String var340 = class67.method516(var339, " ", "<br>", false);
                                class186.field2789[var7++] = var340;
                                class307.field4778[var6++] = var338;
                                continue;
                            }
                            if (var528 == 5214) {
                                var6--;
                                int var341 = class307.field4778[var6];
                                class2 var342 = class332.method2308(0);
                                if (var342 != null) {
                                    int[] var343 = var342.method8(var341 & 0x3FFF, (byte) 118, var341 >> 28 & 0x3, (var341 & 0xFFFF64F) >> 14);
                                    if (var343 != null) {
                                        class294.method2001(-1, var343[2], var343[1]);
                                    }
                                }
                                continue;
                            }
                            if (var528 == 5215) {
                                var6 -= 2;
                                int var344 = class307.field4778[var6];
                                int var345 = class307.field4778[var6 + 1];
                                class225 var346 = class270.method1863(32, (var344 & 0xFFFE7F8) >> 14, var344 & 0x3FFF);
                                boolean var347 = false;
                                for (class2 var348 = (class2) var346.method1589(0); var348 != null; var348 = (class2) var346.method1591((byte) 96)) {
                                    if (var348.field28 == var345) {
                                        var347 = true;
                                        break;
                                    }
                                }
                                if (var347) {
                                    class307.field4778[var6++] = 1;
                                } else {
                                    class307.field4778[var6++] = 0;
                                }
                                continue;
                            }
                            if (var528 == 5216) {
                                var6--;
                                int var349 = class307.field4778[var6];
                                class337.method2342(var349, -122);
                                continue;
                            }
                            if (var528 == 5217) {
                                var6--;
                                int var350 = class307.field4778[var6];
                                if (class133.method978(var350, false)) {
                                    class307.field4778[var6++] = 1;
                                } else {
                                    class307.field4778[var6++] = 0;
                                }
                                continue;
                            }
                            if (var528 == 5218) {
                                var6--;
                                int var351 = class307.field4778[var6];
                                class2 var352 = method1621(var351, 32767);
                                if (var352 == null) {
                                    class307.field4778[var6++] = -1;
                                } else {
                                    class307.field4778[var6++] = var352.field44;
                                }
                                continue;
                            }
                            if (var528 == 5219) {
                                var7--;
                                class143.method1018(class186.field2789[var7], 18460);
                                continue;
                            }
                            if (var528 == 5220) {
                                class307.field4778[var6++] = class35.field536 == 100 ? 1 : 0;
                                continue;
                            }
                            if (var528 == 5221) {
                                var6--;
                                int var353 = class307.field4778[var6];
                                class294.method2001(-1, var353 & 0x3FFF, (var353 & 0xFFFEF82) >> 14);
                                continue;
                            }
                            if (var528 == 5222) {
                                class2 var354 = class332.method2308(0);
                                if (var354 == null) {
                                    class307.field4778[var6++] = -1;
                                    class307.field4778[var6++] = -1;
                                } else {
                                    int[] var355 = var354.method13(-103, class84.field1311 + class265.field4119, -class128.field2024 + class233.field3706 + class333.field5202 + -1);
                                    if (var355 == null) {
                                        class307.field4778[var6++] = -1;
                                        class307.field4778[var6++] = -1;
                                    } else {
                                        class307.field4778[var6++] = var355[1];
                                        class307.field4778[var6++] = var355[2];
                                    }
                                }
                                continue;
                            }
                            if (var528 == 5223) {
                                var6 -= 2;
                                int var356 = class307.field4778[var6 + 1];
                                int var357 = class307.field4778[var6];
                                class81.method582(var357, 0, var356 & 0x3FFF, var356 >> 14 & 0x3FFF);
                                continue;
                            }
                            if (var528 == 5224) {
                                var6--;
                                int var358 = class307.field4778[var6];
                                class2 var359 = class332.method2308(0);
                                if (var359 == null) {
                                    class307.field4778[var6++] = -1;
                                    class307.field4778[var6++] = -1;
                                } else {
                                    int[] var360 = var359.method8(var358 & 0x3FFF, (byte) 110, var358 >> 28 & 0x3, (var358 & 0xFFFE8EE) >> 14);
                                    if (var360 == null) {
                                        class307.field4778[var6++] = -1;
                                        class307.field4778[var6++] = -1;
                                    } else {
                                        class307.field4778[var6++] = var360[1];
                                        class307.field4778[var6++] = var360[2];
                                    }
                                }
                                continue;
                            }
                            if (var528 == 5225) {
                                var6--;
                                int var361 = class307.field4778[var6];
                                class2 var362 = class332.method2308(0);
                                if (var362 == null) {
                                    class307.field4778[var6++] = -1;
                                    class307.field4778[var6++] = -1;
                                } else {
                                    int[] var363 = var362.method13(-108, (var361 & 0xFFFF591) >> 14, var361 & 0x3FFF);
                                    if (var363 == null) {
                                        class307.field4778[var6++] = -1;
                                        class307.field4778[var6++] = -1;
                                    } else {
                                        class307.field4778[var6++] = var363[1];
                                        class307.field4778[var6++] = var363[2];
                                    }
                                }
                                continue;
                            }
                        } else if (var528 < 5400) {
                            if (var528 == 5300) {
                                var6 -= 2;
                                int var313 = class307.field4778[var6];
                                int var314 = class307.field4778[var6 + 1];
                                class289.method1985(var314, false, 93, 3, var313);
                                class307.field4778[var6++] = class195.field2917 == null ? 0 : 1;
                                continue;
                            }
                            if (var528 == 5301) {
                                if (class195.field2917 != null) {
                                    class289.method1985(-1, false, -78, class322.field5029, -1);
                                }
                                continue;
                            }
                            if (var528 == 5302) {
                                class12[] var315 = class101.method741(0);
                                class307.field4778[var6++] = var315.length;
                                continue;
                            }
                            if (var528 == 5303) {
                                var6--;
                                int var316 = class307.field4778[var6];
                                class12[] var317 = class101.method741(0);
                                class307.field4778[var6++] = var317[var316].field189;
                                class307.field4778[var6++] = var317[var316].field193;
                                continue;
                            }
                            if (var528 == 5305) {
                                int var318 = class298.field4598;
                                int var319 = class259.field4057;
                                int var320 = -1;
                                class12[] var321 = class101.method741(0);
                                for (int var322 = 0; var322 < var321.length; var322++) {
                                    class12 var323 = var321[var322];
                                    if (var323.field189 == var318 && var323.field193 == var319) {
                                        var320 = var322;
                                        break;
                                    }
                                }
                                class307.field4778[var6++] = var320;
                                continue;
                            }
                            if (var528 == 5306) {
                                class307.field4778[var6++] = class256.method1759(115);
                                continue;
                            }
                            if (var528 == 5307) {
                                var6--;
                                int var324 = class307.field4778[var6];
                                if (var324 < 0 || var324 > 2) {
                                    var324 = 0;
                                }
                                class289.method1985(-1, false, -50, var324, -1);
                                continue;
                            }
                            if (var528 == 5308) {
                                class307.field4778[var6++] = class322.field5029;
                                continue;
                            }
                            if (var528 == 5309) {
                                var6--;
                                int var325 = class307.field4778[var6];
                                if (var325 < 0 || var325 > 2) {
                                    var325 = 0;
                                }
                                class322.field5029 = var325;
                                class331.method2300((byte) -106, class32.field471);
                                continue;
                            }
                        } else if (var528 < 5500) {
                            if (var528 == 5400) {
                                class310.field4812++;
                                var7 -= 2;
                                String var291 = class186.field2789[var7];
                                var6--;
                                int var292 = class307.field4778[var6];
                                String var293 = class186.field2789[var7 + 1];
                                class106.field1642.method753(-83, 242);
                                class106.field1642.method1132((byte) 29, class179.method1273(-84, var291) + class179.method1273(114, var293) + 1);
                                class106.field1642.method1121(-1, var291);
                                class106.field1642.method1121(-1, var293);
                                class106.field1642.method1132((byte) 29, var292);
                                continue;
                            }
                            if (var528 == 5401) {
                                var6 -= 2;
                                class77.field1235[class307.field4778[var6]] = (short) class169.method1219(class307.field4778[var6 + 1], (byte) -21);
                                class19.method145(123);
                                class231.method1625(-24779);
                                class204.method1447((byte) 115);
                                class341.method2364((byte) -79);
                                class20.method154(1441);
                                continue;
                            }
                            if (var528 == 5405) {
                                var6 -= 2;
                                int var294 = class307.field4778[var6];
                                int var295 = class307.field4778[var6 + 1];
                                if (var294 >= 0 && var294 < 2) {
                                    class18.field248[var294] = new int[var295 << 1][4];
                                }
                                continue;
                            }
                            if (var528 == 5406) {
                                var6 -= 7;
                                int var296 = class307.field4778[var6 + 1] << 1;
                                int var297 = class307.field4778[var6];
                                int var298 = class307.field4778[var6 + 2];
                                int var299 = class307.field4778[var6 + 4];
                                int var300 = class307.field4778[var6 + 6];
                                int var301 = class307.field4778[var6 + 3];
                                int var302 = class307.field4778[var6 + 5];
                                if (var297 >= 0 && var297 < 2 && class18.field248[var297] != null && var296 >= 0 && class18.field248[var297].length > var296) {
                                    class18.field248[var297][var296] = new int[] { class270.method1860(16383, var298 >> 14) * 128, var301, class270.method1860(16383, var298) * 128, var300 };
                                    class18.field248[var297][var296 + 1] = new int[] { class270.method1860(var299 >> 14, 16383) * 128, var302, class270.method1860(16383, var299) * 128 };
                                }
                                continue;
                            }
                            if (var528 == 5407) {
                                var6--;
                                int var303 = class18.field248[class307.field4778[var6]].length >> 1;
                                class307.field4778[var6++] = var303;
                                continue;
                            }
                            if (var528 == 5411) {
                                if (class195.field2917 != null) {
                                    class289.method1985(-1, false, 108, class322.field5029, -1);
                                }
                                if (class92.field1464 == null) {
                                    class231.method1629(class218.method1540((byte) 69), (byte) 127, false);
                                } else {
                                    System.exit(0);
                                }
                                continue;
                            }
                            if (var528 == 5419) {
                                String var304 = "";
                                if (class176.field2675 != null) {
                                    if (class176.field2675.field2959 == null) {
                                        var304 = class338.method2353(class176.field2675.field2960, 22719);
                                    } else {
                                        var304 = (String) class176.field2675.field2959;
                                    }
                                }
                                class186.field2789[var7++] = var304;
                                continue;
                            }
                            if (var528 == 5420) {
                                class307.field4778[var6++] = class180.field2718 == 3 ? 1 : 0;
                                continue;
                            }
                            if (var528 == 5421) {
                                if (class195.field2917 != null) {
                                    class289.method1985(-1, false, -120, class322.field5029, -1);
                                }
                                var6--;
                                boolean var305 = class307.field4778[var6] == 1;
                                var7--;
                                String var306 = class186.field2789[var7];
                                String var307 = class218.method1540((byte) 60) + var306;
                                if (class92.field1464 == null && (!var305 || class180.field2718 == 3 || !class180.field2719.startsWith("win") || class194.field2909)) {
                                    class231.method1629(var307, (byte) 127, var305);
                                    continue;
                                }
                                class190.field2856 = var307;
                                class210.field3212 = var305;
                                class139.field2171 = class32.field471.method1282(var307, 105);
                                continue;
                            }
                            if (var528 == 5422) {
                                var7 -= 2;
                                String var308 = class186.field2789[var7];
                                var6--;
                                int var309 = class307.field4778[var6];
                                String var310 = class186.field2789[var7 + 1];
                                if (var308.length() > 0) {
                                    if (class203.field3045 == null) {
                                        class203.field3045 = new String[class118.field1811[class288.field4491]];
                                    }
                                    class203.field3045[var309] = var308;
                                }
                                if (var310.length() > 0) {
                                    if (class123.field1900 == null) {
                                        class123.field1900 = new String[class118.field1811[class288.field4491]];
                                    }
                                    class123.field1900[var309] = var310;
                                }
                                continue;
                            }
                            if (var528 == 5423) {
                                var7--;
                                System.out.println(class186.field2789[var7]);
                                continue;
                            }
                            if (var528 == 5424) {
                                var6 -= 11;
                                class171.field2586 = class307.field4778[var6];
                                class325.field5057 = class307.field4778[var6 + 1];
                                class31.field453 = class307.field4778[var6 + 2];
                                class129.field2029 = class307.field4778[var6 + 3];
                                class232.field3675 = class307.field4778[var6 + 4];
                                class131.field2050 = class307.field4778[var6 + 5];
                                class240.field3841 = class307.field4778[var6 + 6];
                                class291.field4528 = class307.field4778[var6 + 7];
                                class314.field4867 = class307.field4778[var6 + 8];
                                class120.field1832 = class307.field4778[var6 + 9];
                                class110.field1714 = class307.field4778[var6 + 10];
                                class186.field2788.method956(class232.field3675, true);
                                class186.field2788.method956(class131.field2050, true);
                                class186.field2788.method956(class240.field3841, true);
                                class186.field2788.method956(class291.field4528, true);
                                class186.field2788.method956(class314.field4867, true);
                                class238.field3786 = true;
                                continue;
                            }
                            if (var528 == 5425) {
                                class105.method762((byte) 19);
                                class238.field3786 = false;
                                continue;
                            }
                            if (var528 == 5426) {
                                var6--;
                                class270.field4194 = class307.field4778[var6];
                                continue;
                            }
                            if (var528 == 5427) {
                                var6 -= 2;
                                class34.field533 = class307.field4778[var6];
                                class131.field2060 = class307.field4778[var6 + 1];
                                continue;
                            }
                            if (var528 == 5428) {
                                var6 -= 2;
                                int var311 = class307.field4778[var6 + 1];
                                int var312 = class307.field4778[var6];
                                class307.field4778[var6++] = class267.method1845(var312, var311, 1003) ? 1 : 0;
                                continue;
                            }
                        } else if (var528 < 5600) {
                            if (var528 == 5500) {
                                var6 -= 4;
                                int var279 = class307.field4778[var6];
                                int var280 = class307.field4778[var6 + 1];
                                int var281 = class307.field4778[var6 + 2];
                                int var282 = class307.field4778[var6 + 3];
                                class85.method611(false, -94, (var279 >> 14 & 0x3FFF) - class213.field3249, var281, var280, var282, (var279 & 0x3FFF) - class342.field5328);
                                continue;
                            }
                            if (var528 == 5501) {
                                var6 -= 4;
                                int var283 = class307.field4778[var6];
                                int var284 = class307.field4778[var6 + 1];
                                int var285 = class307.field4778[var6 + 3];
                                int var286 = class307.field4778[var6 + 2];
                                class81.method581(var286, ((var283 & 0xFFFE31A) >> 14) - class213.field3249, (byte) 101, var284, (var283 & 0x3FFF) - class342.field5328, var285);
                                continue;
                            }
                            if (var528 == 5502) {
                                var6 -= 6;
                                int var287 = class307.field4778[var6];
                                if (var287 >= 2) {
                                    throw new RuntimeException();
                                }
                                class7.field82 = var287;
                                int var288 = class307.field4778[var6 + 1];
                                if (var288 + 1 >= class18.field248[class7.field82].length >> 1) {
                                    throw new RuntimeException();
                                }
                                class44.field715 = var288;
                                class78.field1262 = 0;
                                class43.field692 = class307.field4778[var6 + 2];
                                class160.field2406 = class307.field4778[var6 + 3];
                                int var289 = class307.field4778[var6 + 4];
                                if (var289 >= 2) {
                                    throw new RuntimeException();
                                }
                                class7.field84 = var289;
                                int var290 = class307.field4778[var6 + 5];
                                if (class18.field248[class7.field84].length >> 1 <= var290 + 1) {
                                    throw new RuntimeException();
                                }
                                class63.field1006 = var290;
                                class178.field2692 = 3;
                                continue;
                            }
                            if (var528 == 5503) {
                                class18.method141((byte) -56);
                                continue;
                            }
                            if (var528 == 5504) {
                                var6 -= 2;
                                class264.method1807(true, class307.field4778[var6], class307.field4778[var6 + 1]);
                                continue;
                            }
                            if (var528 == 5505) {
                                class307.field4778[var6++] = (int) class30.field443;
                                continue;
                            }
                            if (var528 == 5506) {
                                class307.field4778[var6++] = (int) class259.field4063;
                                continue;
                            }
                            if (var528 == 5507) {
                                class29.method247((byte) -128);
                                continue;
                            }
                            if (var528 == 5508) {
                                class1.method2(true);
                                continue;
                            }
                            if (var528 == 5509) {
                                class313.method2123(-11146);
                                continue;
                            }
                            if (var528 == 5510) {
                                class169.method1217((byte) 43);
                                continue;
                            }
                            if (var528 == 5512) {
                                class225.method1592(-1);
                                continue;
                            }
                        } else if (var528 < 5700) {
                            if (var528 == 5600) {
                                var7 -= 2;
                                String var248 = class186.field2789[var7];
                                var6--;
                                int var249 = class307.field4778[var6];
                                String var250 = class186.field2789[var7 + 1];
                                if (class131.field2052 == 10 && class55.field919 == 0 && class34.field509 == 0 && class233.field3705 == 0 && class12.field190 == 0) {
                                    class178.method1267(3, var250, var249, var248);
                                }
                                continue;
                            }
                            if (var528 == 5601) {
                                class20.method155((byte) 45);
                                continue;
                            }
                            if (var528 == 5602) {
                                if (class34.field509 == 0) {
                                    class239.field3798 = -2;
                                }
                                continue;
                            }
                            if (var528 == 5603) {
                                var6 -= 4;
                                if (class131.field2052 == 10 && class55.field919 == 0 && class34.field509 == 0 && class233.field3705 == 0 && class12.field190 == 0) {
                                    class98.method725((byte) -55, class307.field4778[var6 + 2], class307.field4778[var6 + 3], class307.field4778[var6], class307.field4778[var6 + 1]);
                                }
                                continue;
                            }
                            if (var528 == 5604) {
                                var7--;
                                if (class131.field2052 == 10 && class55.field919 == 0 && class34.field509 == 0 && class233.field3705 == 0 && class12.field190 == 0) {
                                    class318.method2163(class128.method926(class186.field2789[var7], (byte) -124), (byte) -115);
                                }
                                continue;
                            }
                            if (var528 == 5605) {
                                var6 -= 7;
                                var7 -= 3;
                                if (class131.field2052 == 10 && class55.field919 == 0 && class34.field509 == 0 && class233.field3705 == 0 && class12.field190 == 0) {
                                    class44.method376(class307.field4778[var6], class307.field4778[var6 + 4] == 1, class307.field4778[var6 + 5] == 1, 0, class307.field4778[var6 + 3], class186.field2789[var7 + 2], class307.field4778[var6 + 1], class307.field4778[var6 + 2], class307.field4778[var6 + 6] == 1, class186.field2789[var7 + 1], class128.method926(class186.field2789[var7], (byte) -90));
                                }
                                continue;
                            }
                            if (var528 == 5606) {
                                if (class233.field3705 == 0) {
                                    class202.field3033 = -2;
                                }
                                continue;
                            }
                            if (var528 == 5607) {
                                class307.field4778[var6++] = class239.field3798;
                                continue;
                            }
                            if (var528 == 5608) {
                                class307.field4778[var6++] = class108.field1692;
                                continue;
                            }
                            if (var528 == 5609) {
                                class307.field4778[var6++] = class202.field3033;
                                continue;
                            }
                            if (var528 == 5610) {
                                for (int var251 = 0; var251 < 5; var251++) {
                                    class186.field2789[var7++] = var251 < class251.field3958.length ? class336.method2336(125, class251.field3958[var251]) : "";
                                }
                                class251.field3958 = null;
                                continue;
                            }
                            if (var528 == 5611) {
                                class307.field4778[var6++] = class117.field1789;
                                continue;
                            }
                        } else if (var528 < 6100) {
                            if (var528 == 6001) {
                                var6--;
                                int var252 = class307.field4778[var6];
                                if (var252 < 1) {
                                    var252 = 1;
                                }
                                if (var252 > 4) {
                                    var252 = 4;
                                }
                                class289.field4507 = var252;
                                if (!class94.field1516 || !class208.field3191) {
                                    if (class289.field4507 == 1) {
                                        class15.method108(0.9F);
                                    }
                                    if (class289.field4507 == 2) {
                                        class15.method108(0.8F);
                                    }
                                    if (class289.field4507 == 3) {
                                        class15.method108(0.7F);
                                    }
                                    if (class289.field4507 == 4) {
                                        class15.method108(0.6F);
                                    }
                                }
                                if (class94.field1516) {
                                    class84.method593(64);
                                    if (!class208.field3191) {
                                        class270.method1861((byte) -70);
                                    }
                                }
                                class231.method1625(-24779);
                                class331.method2300((byte) -106, class32.field471);
                                class107.field1663 = false;
                                continue;
                            }
                            if (var528 == 6002) {
                                var6--;
                                class188.method1341(false, class307.field4778[var6] == 1);
                                class187.method1335(-21);
                                class270.method1861((byte) -110);
                                class98.method729((byte) 19);
                                class331.method2300((byte) -106, class32.field471);
                                class107.field1663 = false;
                                continue;
                            }
                            if (var528 == 6003) {
                                var6--;
                                class289.field4503 = class307.field4778[var6] == 1;
                                class98.method729((byte) 19);
                                class331.method2300((byte) -106, class32.field471);
                                class107.field1663 = false;
                                continue;
                            }
                            if (var528 == 6005) {
                                var6--;
                                class260.field4071 = class307.field4778[var6] == 1;
                                class270.method1861((byte) -46);
                                class331.method2300((byte) -106, class32.field471);
                                class107.field1663 = false;
                                continue;
                            }
                            if (var528 == 6006) {
                                var6--;
                                class59.field962 = class307.field4778[var6] == 1;
                                ((class315) class15.field207).method2145(!class59.field962, (byte) -114);
                                class331.method2300((byte) -106, class32.field471);
                                class107.field1663 = false;
                                continue;
                            }
                            if (var528 == 6007) {
                                var6--;
                                class170.field2565 = class307.field4778[var6] == 1;
                                class331.method2300((byte) -106, class32.field471);
                                class107.field1663 = false;
                                continue;
                            }
                            if (var528 == 6008) {
                                var6--;
                                class274.field4244 = class307.field4778[var6] == 1;
                                class331.method2300((byte) -106, class32.field471);
                                class107.field1663 = false;
                                continue;
                            }
                            if (var528 == 6009) {
                                var6--;
                                class232.field3674 = class307.field4778[var6] == 1;
                                class331.method2300((byte) -106, class32.field471);
                                class107.field1663 = false;
                                continue;
                            }
                            if (var528 == 6010) {
                                var6--;
                                class217.field3303 = class307.field4778[var6] == 1;
                                class331.method2300((byte) -106, class32.field471);
                                class107.field1663 = false;
                                continue;
                            }
                            if (var528 == 6011) {
                                var6--;
                                int var253 = class307.field4778[var6];
                                if (var253 < 0 || var253 > 2) {
                                    var253 = 0;
                                }
                                class289.field4509 = var253;
                                class331.method2300((byte) -106, class32.field471);
                                class107.field1663 = false;
                                continue;
                            }
                            if (var528 == 6012) {
                                if (class94.field1516) {
                                    class37.method313(0, 0, 0);
                                }
                                var6--;
                                class208.field3191 = class307.field4778[var6] == 1;
                                if (class94.field1516 && class208.field3191) {
                                    class15.method108(0.7F);
                                } else {
                                    if (class289.field4507 == 1) {
                                        class15.method108(0.9F);
                                    }
                                    if (class289.field4507 == 2) {
                                        class15.method108(0.8F);
                                    }
                                    if (class289.field4507 == 3) {
                                        class15.method108(0.7F);
                                    }
                                    if (class289.field4507 == 4) {
                                        class15.method108(0.6F);
                                    }
                                }
                                class270.method1861((byte) -34);
                                class331.method2300((byte) -106, class32.field471);
                                class107.field1663 = false;
                                continue;
                            }
                            if (var528 == 6014) {
                                var6--;
                                class300.field4691 = class307.field4778[var6] == 1;
                                if (class94.field1516) {
                                    class270.method1861((byte) -10);
                                }
                                class331.method2300((byte) -106, class32.field471);
                                class107.field1663 = false;
                                continue;
                            }
                            if (var528 == 6015) {
                                var6--;
                                class152.field2291 = class307.field4778[var6] == 1;
                                if (class94.field1516) {
                                    class84.method593(64);
                                }
                                class331.method2300((byte) -106, class32.field471);
                                class107.field1663 = false;
                                continue;
                            }
                            if (var528 == 6016) {
                                var6--;
                                int var254 = class307.field4778[var6];
                                if (var254 < 0 || var254 > 2) {
                                    var254 = 0;
                                }
                                if (class94.field1516) {
                                    class48.field780 = true;
                                }
                                class181.field2734 = var254;
                                continue;
                            }
                            if (var528 == 6017) {
                                var6--;
                                class188.field2815 = class307.field4778[var6] == 1;
                                class314.method2132((byte) 57);
                                class331.method2300((byte) -106, class32.field471);
                                class107.field1663 = false;
                                continue;
                            }
                            if (var528 == 6018) {
                                var6--;
                                int var255 = class307.field4778[var6];
                                if (var255 < 0) {
                                    var255 = 0;
                                }
                                if (var255 > 127) {
                                    var255 = 127;
                                }
                                class1.field20 = var255;
                                class331.method2300((byte) -106, class32.field471);
                                class107.field1663 = false;
                                continue;
                            }
                            if (var528 == 6019) {
                                var6--;
                                int var256 = class307.field4778[var6];
                                if (var256 < 0) {
                                    var256 = 0;
                                }
                                if (var256 > 255) {
                                    var256 = 255;
                                }
                                if (class289.field4502 != var256) {
                                    if (class289.field4502 == 0 && class43.field694 != -1) {
                                        class207.method1474(class43.field694, (byte) -99, class192.field2872, false, var256, 0);
                                        class186.field2783 = false;
                                    } else if (var256 == 0) {
                                        class228.method1615(1);
                                        class186.field2783 = false;
                                    } else {
                                        class171.method1238((byte) -116, var256);
                                    }
                                    class289.field4502 = var256;
                                }
                                class331.method2300((byte) -106, class32.field471);
                                class107.field1663 = false;
                                continue;
                            }
                            if (var528 == 6020) {
                                var6--;
                                int var257 = class307.field4778[var6];
                                if (var257 < 0) {
                                    var257 = 0;
                                }
                                if (var257 > 127) {
                                    var257 = 127;
                                }
                                class201.field3016 = var257;
                                class331.method2300((byte) -106, class32.field471);
                                class107.field1663 = false;
                                continue;
                            }
                            if (var528 == 6021) {
                                var6--;
                                class322.field5023 = class307.field4778[var6] == 1;
                                class98.method729((byte) 19);
                                continue;
                            }
                            if (var528 == 6023) {
                                var6--;
                                int var258 = class307.field4778[var6];
                                if (var258 < 0) {
                                    var258 = 0;
                                }
                                if (var258 > 2) {
                                    var258 = 2;
                                }
                                boolean var259 = false;
                                if (class318.field4975 < 96) {
                                    var258 = 0;
                                    var259 = true;
                                }
                                class64.method490(var258);
                                class331.method2300((byte) -106, class32.field471);
                                class107.field1663 = false;
                                class307.field4778[var6++] = var259 ? 0 : 1;
                                continue;
                            }
                            if (var528 == 6024) {
                                var6--;
                                int var260 = class307.field4778[var6];
                                if (var260 < 0 || var260 > 2) {
                                    var260 = 0;
                                }
                                class89.field1422 = var260;
                                class331.method2300((byte) -106, class32.field471);
                                continue;
                            }
                            if (var528 == 6027) {
                                var6--;
                                int var261 = class307.field4778[var6];
                                if (!class94.field1516) {
                                    continue;
                                }
                                if (var261 < 0 || var261 > 1) {
                                    var261 = 0;
                                }
                                class174.method1254((byte) -116, var261 == 1);
                                continue;
                            }
                            if (var528 == 6028) {
                                var6--;
                                class210.field3208 = class307.field4778[var6] != 0;
                                class331.method2300((byte) -106, class32.field471);
                                continue;
                            }
                        } else if (var528 < 6200) {
                            if (var528 == 6101) {
                                class307.field4778[var6++] = class289.field4507;
                                continue;
                            }
                            if (var528 == 6102) {
                                class307.field4778[var6++] = class19.method150(-96) ? 1 : 0;
                                continue;
                            }
                            if (var528 == 6103) {
                                class307.field4778[var6++] = class289.field4503 ? 1 : 0;
                                continue;
                            }
                            if (var528 == 6105) {
                                class307.field4778[var6++] = class260.field4071 ? 1 : 0;
                                continue;
                            }
                            if (var528 == 6106) {
                                class307.field4778[var6++] = class59.field962 ? 1 : 0;
                                continue;
                            }
                            if (var528 == 6107) {
                                class307.field4778[var6++] = class170.field2565 ? 1 : 0;
                                continue;
                            }
                            if (var528 == 6108) {
                                class307.field4778[var6++] = class274.field4244 ? 1 : 0;
                                continue;
                            }
                            if (var528 == 6109) {
                                class307.field4778[var6++] = class232.field3674 ? 1 : 0;
                                continue;
                            }
                            if (var528 == 6110) {
                                class307.field4778[var6++] = class217.field3303 ? 1 : 0;
                                continue;
                            }
                            if (var528 == 6111) {
                                class307.field4778[var6++] = class289.field4509;
                                continue;
                            }
                            if (var528 == 6112) {
                                class307.field4778[var6++] = class208.field3191 ? 1 : 0;
                                continue;
                            }
                            if (var528 == 6114) {
                                class307.field4778[var6++] = class300.field4691 ? 1 : 0;
                                continue;
                            }
                            if (var528 == 6115) {
                                class307.field4778[var6++] = class152.field2291 ? 1 : 0;
                                continue;
                            }
                            if (var528 == 6116) {
                                class307.field4778[var6++] = class181.field2734;
                                continue;
                            }
                            if (var528 == 6117) {
                                class307.field4778[var6++] = class188.field2815 ? 1 : 0;
                                continue;
                            }
                            if (var528 == 6118) {
                                class307.field4778[var6++] = class1.field20;
                                continue;
                            }
                            if (var528 == 6119) {
                                class307.field4778[var6++] = class289.field4502;
                                continue;
                            }
                            if (var528 == 6120) {
                                class307.field4778[var6++] = class201.field3016;
                                continue;
                            }
                            if (var528 == 6121) {
                                if (class94.field1516) {
                                    class307.field4778[var6++] = class94.field1490 ? 1 : 0;
                                } else {
                                    class307.field4778[var6++] = 0;
                                }
                                continue;
                            }
                            if (var528 == 6123) {
                                class307.field4778[var6++] = class64.method488();
                                continue;
                            }
                            if (var528 == 6124) {
                                class307.field4778[var6++] = class89.field1422;
                                continue;
                            }
                            if (var528 == 6126) {
                                if (class94.field1516) {
                                    class307.field4778[var6++] = class277.method1907() ? 1 : 0;
                                } else {
                                    class307.field4778[var6++] = 0;
                                }
                                continue;
                            }
                            if (var528 == 6127) {
                                class307.field4778[var6++] = class34.field512 ? 1 : 0;
                                continue;
                            }
                            if (var528 == 6128) {
                                class307.field4778[var6++] = class210.field3208 ? 1 : 0;
                                continue;
                            }
                        } else if (var528 < 6300) {
                            if (var528 == 6200) {
                                var6 -= 2;
                                class298.field4601 = (short) class307.field4778[var6];
                                if (class298.field4601 <= 0) {
                                    class298.field4601 = 256;
                                }
                                class53.field889 = (short) class307.field4778[var6 + 1];
                                if (class53.field889 <= 0) {
                                    class53.field889 = 205;
                                }
                                continue;
                            }
                            if (var528 == 6201) {
                                var6 -= 2;
                                class87.field1401 = (short) class307.field4778[var6];
                                if (class87.field1401 <= 0) {
                                    class87.field1401 = 256;
                                }
                                class7.field98 = (short) class307.field4778[var6 + 1];
                                if (class7.field98 <= 0) {
                                    class7.field98 = 320;
                                }
                                continue;
                            }
                            if (var528 == 6202) {
                                var6 -= 4;
                                class10.field129 = (short) class307.field4778[var6];
                                if (class10.field129 <= 0) {
                                    class10.field129 = 1;
                                }
                                class131.field2051 = (short) class307.field4778[var6 + 1];
                                if (class131.field2051 <= 0) {
                                    class131.field2051 = 32767;
                                } else if (class10.field129 > class131.field2051) {
                                    class131.field2051 = class10.field129;
                                }
                                class70.field1138 = (short) class307.field4778[var6 + 2];
                                if (class70.field1138 <= 0) {
                                    class70.field1138 = 1;
                                }
                                class16.field231 = (short) class307.field4778[var6 + 3];
                                if (class16.field231 <= 0) {
                                    class16.field231 = 32767;
                                } else if (class16.field231 < class70.field1138) {
                                    class16.field231 = class70.field1138;
                                }
                                continue;
                            }
                            if (var528 == 6203) {
                                class253.method1748(class107.field1675.field3458, 1, 0, 0, class107.field1675.field3526, false);
                                class307.field4778[var6++] = class260.field4081;
                                class307.field4778[var6++] = class256.field4006;
                                continue;
                            }
                            if (var528 == 6204) {
                                class307.field4778[var6++] = class87.field1401;
                                class307.field4778[var6++] = class7.field98;
                                continue;
                            }
                            if (var528 == 6205) {
                                class307.field4778[var6++] = class298.field4601;
                                class307.field4778[var6++] = class53.field889;
                                continue;
                            }
                        } else if (var528 < 6400) {
                            if (var528 == 6300) {
                                class307.field4778[var6++] = (int) (class102.method743((byte) 117) / 60000L);
                                continue;
                            }
                            if (var528 == 6301) {
                                class307.field4778[var6++] = (int) (class102.method743((byte) 98) / 86400000L) - 11745;
                                continue;
                            }
                            if (var528 == 6302) {
                                var6 -= 3;
                                int var274 = class307.field4778[var6];
                                int var275 = class307.field4778[var6 + 1];
                                int var276 = class307.field4778[var6 + 2];
                                class61.field987.clear();
                                class61.field987.set(11, 12);
                                class61.field987.set(var276, var275, var274);
                                class307.field4778[var6++] = (int) (class61.field987.getTime().getTime() / 86400000L) - 11745;
                                continue;
                            }
                            if (var528 == 6303) {
                                class61.field987.clear();
                                class61.field987.setTime(new Date(class102.method743((byte) 110)));
                                class307.field4778[var6++] = class61.field987.get(1);
                                continue;
                            }
                            if (var528 == 6304) {
                                var6--;
                                int var277 = class307.field4778[var6];
                                boolean var278 = true;
                                if (var277 < 0) {
                                    var278 = (var277 + 1) % 4 == 0;
                                } else if (var277 < 1582) {
                                    var278 = var277 % 4 == 0;
                                } else if ((var277 % 4) != 0) {
                                    var278 = false;
                                } else if ((var277 % 100) != 0) {
                                    var278 = true;
                                } else if ((var277 % 400) != 0) {
                                    var278 = false;
                                }
                                class307.field4778[var6++] = var278 ? 1 : 0;
                                continue;
                            }
                        } else if (var528 < 6500) {
                            if (var528 == 6405) {
                                class307.field4778[var6++] = class244.method1690((byte) 5) ? 1 : 0;
                                continue;
                            }
                            if (var528 == 6406) {
                                class307.field4778[var6++] = class184.method1320(128) ? 1 : 0;
                                continue;
                            }
                        } else if (var528 < 6600) {
                            if (var528 == 6500) {
                                if (class131.field2052 == 10 && class55.field919 == 0 && class34.field509 == 0 && class233.field3705 == 0) {
                                    class307.field4778[var6++] = class238.method1660((byte) 58) == -1 ? 0 : 1;
                                    continue;
                                }
                                class307.field4778[var6++] = 1;
                                continue;
                            }
                            if (var528 == 6501) {
                                class341 var262 = class137.method994((byte) -105);
                                if (var262 == null) {
                                    class307.field4778[var6++] = -1;
                                    class307.field4778[var6++] = 0;
                                    class186.field2789[var7++] = "";
                                    class307.field4778[var6++] = 0;
                                    class186.field2789[var7++] = "";
                                    class307.field4778[var6++] = 0;
                                } else {
                                    class307.field4778[var6++] = var262.field5319;
                                    class307.field4778[var6++] = var262.field462;
                                    class186.field2789[var7++] = var262.field5315;
                                    class152 var263 = var262.method2363((byte) -55);
                                    class307.field4778[var6++] = var263.field2292;
                                    class186.field2789[var7++] = var263.field2283;
                                    class307.field4778[var6++] = var262.field472;
                                }
                                continue;
                            }
                            if (var528 == 6502) {
                                class341 var264 = class46.method408(112);
                                if (var264 == null) {
                                    class307.field4778[var6++] = -1;
                                    class307.field4778[var6++] = 0;
                                    class186.field2789[var7++] = "";
                                    class307.field4778[var6++] = 0;
                                    class186.field2789[var7++] = "";
                                    class307.field4778[var6++] = 0;
                                } else {
                                    class307.field4778[var6++] = var264.field5319;
                                    class307.field4778[var6++] = var264.field462;
                                    class186.field2789[var7++] = var264.field5315;
                                    class152 var265 = var264.method2363((byte) 71);
                                    class307.field4778[var6++] = var265.field2292;
                                    class186.field2789[var7++] = var265.field2283;
                                    class307.field4778[var6++] = var264.field472;
                                }
                                continue;
                            }
                            if (var528 == 6503) {
                                var6--;
                                int var266 = class307.field4778[var6];
                                if (class131.field2052 == 10 && class55.field919 == 0 && class34.field509 == 0 && class233.field3705 == 0) {
                                    class307.field4778[var6++] = class194.method1378((byte) 119, var266) ? 1 : 0;
                                    continue;
                                }
                                class307.field4778[var6++] = 0;
                                continue;
                            }
                            if (var528 == 6504) {
                                var6--;
                                class270.field4209 = class307.field4778[var6];
                                class331.method2300((byte) -106, class32.field471);
                                continue;
                            }
                            if (var528 == 6505) {
                                class307.field4778[var6++] = class270.field4209;
                                continue;
                            }
                            if (var528 == 6506) {
                                var6--;
                                int var267 = class307.field4778[var6];
                                class341 var268 = class179.method1271(-111, var267);
                                if (var268 == null) {
                                    class307.field4778[var6++] = -1;
                                    class186.field2789[var7++] = "";
                                    class307.field4778[var6++] = 0;
                                    class186.field2789[var7++] = "";
                                    class307.field4778[var6++] = 0;
                                } else {
                                    class307.field4778[var6++] = var268.field462;
                                    class186.field2789[var7++] = var268.field5315;
                                    class152 var269 = var268.method2363((byte) -113);
                                    class307.field4778[var6++] = var269.field2292;
                                    class186.field2789[var7++] = var269.field2283;
                                    class307.field4778[var6++] = var268.field472;
                                }
                                continue;
                            }
                            if (var528 == 6507) {
                                var6 -= 4;
                                boolean var270 = class307.field4778[var6 + 3] == 1;
                                int var271 = class307.field4778[var6];
                                int var272 = class307.field4778[var6 + 2];
                                boolean var273 = class307.field4778[var6 + 1] == 1;
                                class227.method1607(var270, var273, var272, 0, var271);
                                continue;
                            }
                        } else if (var528 < 6700) {
                            if (var528 == 6600) {
                                var6--;
                                class139.field2170 = class307.field4778[var6] == 1;
                                class331.method2300((byte) -106, class32.field471);
                                continue;
                            }
                            if (var528 == 6601) {
                                class307.field4778[var6++] = class139.field2170 ? 1 : 0;
                                continue;
                            }
                        }
                    } else if (var528 == 4300) {
                        var6 -= 2;
                        int var364 = class307.field4778[var6];
                        int var365 = class307.field4778[var6 + 1];
                        class177 var366 = class299.method2044(var365, (byte) -77);
                        if (var366.method1264((byte) 57)) {
                            class186.field2789[var7++] = class231.method1630(-124, var364).method1467(var365, var366.field2686, -1);
                        } else {
                            class307.field4778[var6++] = class231.method1630(-72, var364).method1470(var366.field2684, -1, var365);
                        }
                        continue;
                    }
                } else {
                    class220 var513;
                    if (var528 < 2000) {
                        var513 = var46 ? class71.field1168 : class282.field4373;
                    } else {
                        var528 -= 1000;
                        var6--;
                        var513 = class68.method524((byte) -94, class307.field4778[var6]);
                    }
                    if (var528 == 1300) {
                        var6--;
                        int var514 = class307.field4778[var6] - 1;
                        if (var514 >= 0 && var514 <= 9) {
                            var7--;
                            var513.method1567(var514, class186.field2789[var7], (byte) 104);
                            continue;
                        }
                        var7--;
                        continue;
                    }
                    if (var528 == 1301) {
                        var6 -= 2;
                        int var515 = class307.field4778[var6];
                        int var516 = class307.field4778[var6 + 1];
                        var513.field3359 = class177.method1263(var515, -104, var516);
                        continue;
                    }
                    if (var528 == 1302) {
                        var6--;
                        var513.field3493 = class307.field4778[var6] == 1;
                        continue;
                    }
                    if (var528 == 1303) {
                        var6--;
                        var513.field3369 = class307.field4778[var6];
                        continue;
                    }
                    if (var528 == 1304) {
                        var6--;
                        var513.field3495 = class307.field4778[var6];
                        continue;
                    }
                    if (var528 == 1305) {
                        var7--;
                        var513.field3358 = class186.field2789[var7];
                        continue;
                    }
                    if (var528 == 1306) {
                        var7--;
                        var513.field3533 = class186.field2789[var7];
                        continue;
                    }
                    if (var528 == 1307) {
                        var513.field3488 = null;
                        continue;
                    }
                    if (var528 == 1308) {
                        var6--;
                        var513.field3412 = class307.field4778[var6];
                        var6--;
                        var513.field3348 = class307.field4778[var6];
                        continue;
                    }
                    if (var528 == 1309) {
                        var6--;
                        int var517 = class307.field4778[var6];
                        var6--;
                        int var518 = class307.field4778[var6];
                        if (var518 >= 1 && var518 <= 10) {
                            var513.method1549(var517, var518 - 1, (byte) -127);
                        }
                        continue;
                    }
                    if (var528 == 1310) {
                        var7--;
                        var513.field3425 = class186.field2789[var7];
                        continue;
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var527) {
            if (var5.field3299 == null) {
                if (class60.field967 != 0) {
                    class29.method252("Clientscript error - check log for details", "", true, 0);
                }
                class184.method1322(var527, "CS2 - scr:" + var5.field758 + " op:" + var11, (byte) -24);
            } else {
                StringBuffer var524 = new StringBuffer(30);
                var524.append("%0a - in: ").append(var5.field3299);
                for (int var525 = class274.field4239 - 1; var525 >= 0; var525--) {
                    var524.append("%0a - via: ").append(class60.field977[var525].field2861.field3299);
                }
                if (var11 == 40) {
                    int var526 = var9[var8];
                    var524.append("%0a - non-existant gosub script-num: ").append(Integer.toString(var526));
                }
                if (class60.field967 != 0) {
                    class29.method252("Clientscript error in: " + var5.field3299, "", true, 0);
                }
                class184.method1322(var527, "CS2 - scr:" + var5.field758 + " op:" + var11 + var524.toString(), (byte) -24);
            }
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(II)Lpb;", line = 6832)
    private static final class2 method1621(int arg0, int arg1) {
        field3640++;
        if (arg1 != 32767) {
            method1620(124, (class240) null, 96);
        }
        return (class2) class71.field1172.method1222(0, (long) arg0);
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(I)V", line = 6852)
    public static void method1622(int arg0) {
        if (arg0 == 31172) {
            field3646 = null;
            field3639 = null;
            field3647 = null;
            field3645 = null;
        }
    }
}
