import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class150 extends class61 {

    @OriginalMember(owner = "client!ok", name = "K", descriptor = "[I")
    public static int[] field2331 = new int[14];

    @OriginalMember(owner = "client!ok", name = "I", descriptor = "I")
    public static int field2329 = 0;

    @OriginalMember(owner = "client!ok", name = "P", descriptor = "Lwm;")
    public static class152 field2335 = class157.method1048(")4l=", 96);

    @OriginalMember(owner = "client!ok", name = "W", descriptor = "Lwm;")
    public static class152 field2342 = class157.method1048("<img=0>", 120);

    @OriginalMember(owner = "client!ok", name = "O", descriptor = "[[I")
    public static int[][] field2334 = new int[5][5000];

    @OriginalMember(owner = "client!ok", name = "D", descriptor = "I")
    public static int field2324;

    @OriginalMember(owner = "client!ok", name = "E", descriptor = "I")
    public int field2325;

    @OriginalMember(owner = "client!ok", name = "F", descriptor = "I")
    public static int field2326;

    @OriginalMember(owner = "client!ok", name = "H", descriptor = "I")
    public static int field2328;

    @OriginalMember(owner = "client!ok", name = "R", descriptor = "I")
    public int field2337;

    @OriginalMember(owner = "client!ok", name = "S", descriptor = "I")
    public int field2338;

    @OriginalMember(owner = "client!ok", name = "V", descriptor = "I")
    public int field2341;

    @OriginalMember(owner = "client!ok", name = "X", descriptor = "I")
    public static int field2343;

    @OriginalMember(owner = "client!ok", name = "Y", descriptor = "I")
    public static int field2344;

    @OriginalMember(owner = "client!ok", name = "Z", descriptor = "I")
    public static int field2345;

    @OriginalMember(owner = "client!ok", name = "ab", descriptor = "I")
    public static int field2346;

    @OriginalMember(owner = "client!ok", name = "G", descriptor = "Lwm;")
    public class152 field2327;

    @OriginalMember(owner = "client!ok", name = "J", descriptor = "Lti;")
    public static class221 field2330;

    @OriginalMember(owner = "client!ok", name = "N", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field2333;

    @OriginalMember(owner = "client!ok", name = "T", descriptor = "[I")
    public int[] field2339;

    @OriginalMember(owner = "client!ok", name = "U", descriptor = "[I")
    public int[] field2340;

    @OriginalMember(owner = "client!ok", name = "L", descriptor = "[Lwm;")
    public class152[] field2332;

    @OriginalMember(owner = "client!ok", name = "Q", descriptor = "[Lol;")
    public class231[] field2336;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(III)Z", line = 14)
    public static final boolean method943(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class245.field4079; var3++) {
            class30 var4 = class169.field2640[var3];
            if (var4.field500 == 1) {
                int var5 = var4.field492 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field513 * var5 >> 8) + var4.field510;
                    int var7 = (var4.field502 * var5 >> 8) + var4.field511;
                    int var8 = (var4.field494 * var5 >> 8) + var4.field508;
                    int var9 = (var4.field516 * var5 >> 8) + var4.field512;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field500 == 2) {
                int var10 = arg0 - var4.field492;
                if (var10 > 0) {
                    int var11 = (var4.field513 * var10 >> 8) + var4.field510;
                    int var12 = (var4.field502 * var10 >> 8) + var4.field511;
                    int var13 = (var4.field494 * var10 >> 8) + var4.field508;
                    int var14 = (var4.field516 * var10 >> 8) + var4.field512;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field500 == 3) {
                int var15 = var4.field510 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field489 * var15 >> 8) + var4.field492;
                    int var17 = (var4.field496 * var15 >> 8) + var4.field503;
                    int var18 = (var4.field494 * var15 >> 8) + var4.field508;
                    int var19 = (var4.field516 * var15 >> 8) + var4.field512;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field500 == 4) {
                int var20 = arg2 - var4.field510;
                if (var20 > 0) {
                    int var21 = (var4.field489 * var20 >> 8) + var4.field492;
                    int var22 = (var4.field496 * var20 >> 8) + var4.field503;
                    int var23 = (var4.field494 * var20 >> 8) + var4.field508;
                    int var24 = (var4.field516 * var20 >> 8) + var4.field512;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field500 == 5) {
                int var25 = arg1 - var4.field508;
                if (var25 > 0) {
                    int var26 = (var4.field489 * var25 >> 8) + var4.field492;
                    int var27 = (var4.field496 * var25 >> 8) + var4.field503;
                    int var28 = (var4.field513 * var25 >> 8) + var4.field510;
                    int var29 = (var4.field502 * var25 >> 8) + var4.field511;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIBI)I", line = 136)
    public static final int method944(int arg0, int arg1, byte arg2, int arg3) {
        if (arg2 != 42) {
            method947((byte) -74);
        }
        field2343++;
        return arg1 > arg3 ? arg1 : (arg0 < arg3 ? arg0 : arg3);
    }

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "(I)Z", line = 148)
    public static final boolean method945(int arg0) {
        field2324++;
        if (arg0 != -256) {
            method946((byte) -16, (byte[]) null);
        }
        if (class223.field3630) {
            try {
                return !(Boolean) class50.field781.method1019(94, class34.field572.field2359);
            } catch (Throwable var2) {
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(B[B)Lej;", line = 172)
    public static final class158 method946(byte arg0, byte[] arg1) {
        field2346++;
        if (arg0 < 13) {
            return (class158) null;
        } else if (arg1 == null) {
            return null;
        } else {
            class158 var2 = new class158(arg1, class180.field2865, class179.field2856, class253.field4383, class8.field106, class23.field403);
            class132.method841((byte) 121);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(B)V", line = 189)
    public static final void method947(byte arg0) {
        field2328++;
        if (class77.field1091 != null) {
            return;
        }
        if (arg0 != -69) {
            method950(68);
        }
        if (class33.field537 != null) {
            return;
        }
        int var1 = class61.field921;
        if (!class70.field1016) {
            if (var1 == 1 && class160.field2556 > 0) {
                short var12 = class273.field4688[class160.field2556 - 1];
                if (var12 == 29 || var12 == 33 || var12 == 51 || var12 == 18 || var12 == 39 || var12 == 15 || var12 == 31 || var12 == 1 || var12 == 47 || var12 == 9 || var12 == 16 || var12 == 1006) {
                    int var13 = class26.field445[class160.field2556 - 1];
                    int var14 = class64.field955[class160.field2556 - 1];
                    class127 var15 = class11.method54(false, var14);
                    class84 var16 = client.method1759(var15);
                    if (var16.method547(2616952) || var16.method552(12)) {
                        class205.field3355 = 0;
                        class175.field2820 = false;
                        if (class77.field1091 != null) {
                            class272.method1868(22889, class77.field1091);
                        }
                        class77.field1091 = class11.method54(false, var14);
                        class323.field5642 = var13;
                        class169.field2650 = class62.field944;
                        class304.field5229 = class193.field3066;
                        class272.method1868(arg0 + 22958, class77.field1091);
                        return;
                    }
                }
            }
            if (var1 == 1 && (class270.field4625 == 1 && class160.field2556 > 2 || class169.method1111(class160.field2556 - 1, (byte) 121))) {
                var1 = 2;
            }
            if (var1 == 2 && class160.field2556 > 0 || class18.field251 == 1) {
                class222.method1537(arg0 + 99);
            }
            if (var1 == 1 && class160.field2556 > 0 || class18.field251 == 2) {
                class175.method1170(false);
            }
            return;
        }
        if (var1 != 1) {
            int var2 = class278.field4763;
            int var3 = class254.field4397;
            if (var2 < class267.field4503 - 10 || var2 > class17.field232 + class267.field4503 + 10 || (class128.field1957 - 10) > var3 || var3 > (class258.field4429 + class128.field1957 + 10)) {
                class70.field1016 = false;
                class265.method1821(class267.field4503, class258.field4429, class128.field1957, class17.field232, (byte) -104);
            }
        }
        if (var1 != 1) {
            return;
        }
        int var4 = class267.field4503;
        int var5 = class128.field1957;
        int var6 = class17.field232;
        int var7 = -1;
        int var8 = class193.field3066;
        int var9 = class62.field944;
        for (int var10 = 0; var10 < class160.field2556; var10++) {
            int var11;
            if (class180.field2874) {
                var11 = (class160.field2556 - var10 - 1) * 15 + var5 + 35;
            } else {
                var11 = (class160.field2556 - var10 - 1) * 15 + var5 + 31;
            }
            if (var8 > var4 && var4 + var6 > var8 && var9 > var11 - 13 && var9 < var11 + 3) {
                var7 = var10;
            }
        }
        if (var7 != -1) {
            class155.method1035(125, var7);
        }
        class70.field1016 = false;
        class265.method1821(class267.field4503, class258.field4429, class128.field1957, class17.field232, (byte) -104);
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(II)I", line = 325)
    public static final int method948(int arg0, int arg1) {
        field2345++;
        int var2 = 65 / ((52 - arg0) / 49);
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "([Luf;IZ)V", line = 353)
    public static final void method949(class22[] arg0, int arg1, boolean arg2) {
        if (!arg2) {
            for (int var3 = 0; var3 < 4; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    for (int var5 = 0; var5 < 104; var5++) {
                        if ((class70.field1026[var3][var4][var5] & 0x1) == 1) {
                            int var6 = var3;
                            if ((class70.field1026[1][var4][var5] & 0x2) == 2) {
                                var6 = var3 - 1;
                            }
                            if (var6 >= 0) {
                                arg0[var6].method179((byte) -103, var5, var4);
                            }
                        }
                    }
                }
            }
            class282.field4804 += (int) (Math.random() * 5.0D) - 2;
            if (class282.field4804 < -16) {
                class282.field4804 = -16;
            }
            if (class282.field4804 > 16) {
                class282.field4804 = 16;
            }
            class237.field3880 += (int) (Math.random() * 5.0D) - 2;
            if (class237.field3880 < -8) {
                class237.field3880 = -8;
            }
            if (class237.field3880 > 8) {
                class237.field3880 = 8;
            }
        }
        byte var7;
        if (arg2) {
            var7 = 1;
        } else {
            var7 = 4;
        }
        int var8 = class237.field3880 >> 2 << 10;
        int var9 = class282.field4804 >> 1;
        field2344++;
        int[][] var10 = new int[104][104];
        int[][] var11 = new int[104][104];
        int var12 = 0;
        int var13 = -48 % ((-arg1 - 25) / 52);
        while (var7 > var12) {
            byte[][] var14 = class199.field3218[var12];
            if (!class217.field3516) {
                int var35 = (int) Math.sqrt(5100.0D);
                int var36 = var35 * 768 >> 8;
                for (int var37 = 1; var37 < 103; var37++) {
                    for (int var38 = 1; var38 < 103; var38++) {
                        byte var39 = 74;
                        int var40 = class65.field984[var12][var38 + 1][var37] - class65.field984[var12][var38 - 1][var37];
                        int var41 = class65.field984[var12][var38][var37 + 1] - class65.field984[var12][var38][var37 - 1];
                        int var42 = (int) Math.sqrt((double) (var40 * var40 + (var41 * var41) + 65536));
                        int var43 = (var40 << 8) / var42;
                        int var44 = -65536 / var42;
                        int var45 = (var14[var38][var37 - 1] >> 2) + (var14[var38 + 1][var37] >> 3) + (var14[var38][var37 + 1] >> 3) + (var14[var38 - 1][var37] >> 2) + (var14[var38][var37] >> 1);
                        int var46 = (var41 << 8) / var42;
                        int var47 = (var43 * -50 + var46 * -50 + (var44 * -10)) / var36 + var39;
                        var11[var38][var37] = var47 - var45;
                    }
                }
            } else if (class81.field1131) {
                for (int var15 = 1; var15 < 103; var15++) {
                    for (int var16 = 1; var16 < 103; var16++) {
                        int var17 = (var14[var16][var15 - 1] >> 2) + (var14[var16 - 1][var15] >> 2) + (var14[var16 + 1][var15] >> 3) + (var14[var16][var15 - -1] >> 3) + (var14[var16][var15] >> 1);
                        byte var18 = 74;
                        var11[var16][var15] = var18 - var17;
                    }
                }
            } else {
                int var19 = (int) class14.field194[2];
                int var20 = (int) class14.field194[1];
                int var21 = (int) class14.field194[0];
                int var22 = (int) Math.sqrt((double) (var19 * var19 + var21 * var21 + (var20 * var20)));
                int var23 = var22 * 1024 >> 8;
                for (int var24 = 1; var24 < 103; var24++) {
                    for (int var25 = 1; var25 < 103; var25++) {
                        byte var26 = 96;
                        int var27 = class65.field984[var12][var25][var24 + 1] - class65.field984[var12][var25][var24 - 1];
                        int var28 = class65.field984[var12][var25 + 1][var24] - class65.field984[var12][var25 - 1][var24];
                        int var29 = (int) Math.sqrt((double) (var28 * var28 + ((var27 * var27) + 65536)));
                        int var30 = (var28 << 8) / var29;
                        int var31 = -65536 / var29;
                        int var32 = (var27 << 8) / var29;
                        int var33 = (var20 * var31 + var21 * var30 + (var19 * var32)) / var23 + var26;
                        int var34 = (var14[var25][var24 - 1] >> 2) + (var14[var25][var24] >> 1) + (var14[var25][var24 + 1] >> 3) + (var14[var25 - -1][var24] >> 3) + (var14[var25 + -1][var24] >> 2);
                        var11[var25][var24] = var33 - ((int) ((float) var34 * 1.7F));
                    }
                }
            }
            for (int var48 = 0; var48 < 104; var48++) {
                class27.field465[var48] = 0;
                class323.field5644[var48] = 0;
                class66.field995[var48] = 0;
                class219.field3563[var48] = 0;
                class101.field1469[var48] = 0;
            }
            for (int var49 = -5; var49 < 104; var49++) {
                for (int var50 = 0; var50 < 104; var50++) {
                    int var51 = var49 + 5;
                    int var10002;
                    if (var51 < 104) {
                        int var52 = class60.field912[var12][var51][var50] & 0xFF;
                        if (var52 > 0) {
                            class16 var53 = class142.method898(var52 - 1, 0);
                            class27.field465[var50] += var53.field222;
                            class323.field5644[var50] += var53.field228;
                            class66.field995[var50] += var53.field230;
                            class219.field3563[var50] += var53.field221;
                            var10002 = class101.field1469[var50]++;
                        }
                    }
                    int var54 = var49 - 5;
                    if (var54 >= 0) {
                        int var55 = class60.field912[var12][var54][var50] & 0xFF;
                        if (var55 > 0) {
                            class16 var56 = class142.method898(var55 - 1, 0);
                            class27.field465[var50] -= var56.field222;
                            class323.field5644[var50] -= var56.field228;
                            class66.field995[var50] -= var56.field230;
                            class219.field3563[var50] -= var56.field221;
                            var10002 = class101.field1469[var50]--;
                        }
                    }
                }
                if (var49 >= 0) {
                    int var57 = 0;
                    int var58 = 0;
                    int var59 = 0;
                    int var60 = 0;
                    int var61 = 0;
                    for (int var62 = -5; var62 < 104; var62++) {
                        int var63 = var62 + 5;
                        if (var63 < 104) {
                            var61 += class101.field1469[var63];
                            var58 += class219.field3563[var63];
                            var60 += class27.field465[var63];
                            var59 += class66.field995[var63];
                            var57 += class323.field5644[var63];
                        }
                        int var64 = var62 - 5;
                        if (var64 >= 0) {
                            var59 -= class66.field995[var64];
                            var58 -= class219.field3563[var64];
                            var61 -= class101.field1469[var64];
                            var57 -= class323.field5644[var64];
                            var60 -= class27.field465[var64];
                        }
                        if (var62 >= 0 && var61 > 0) {
                            var10[var49][var62] = class320.method2257(var59 / var61, var60 * 256 / var58, var57 / var61, (byte) -48);
                        }
                    }
                }
            }
            for (int var65 = 1; var65 < 103; var65++) {
                label765: for (int var66 = 1; var66 < 103; var66++) {
                    if (arg2 || class296.method2044(99) || (class70.field1026[0][var65][var66] & 0x2) != 0 || (class70.field1026[var12][var65][var66] & 0x10) == 0 && class149.method941(var66, var65, var12, (byte) 33) == class267.field4501) {
                        if (class97.field1391 > var12) {
                            class97.field1391 = var12;
                        }
                        int var67 = class117.field1661[var12][var65][var66] & 0xFF;
                        int var68 = class60.field912[var12][var65][var66] & 0xFF;
                        if (var68 > 0 || var67 > 0) {
                            int var69 = class65.field984[var12][var65][var66];
                            int var70 = class65.field984[var12][var65 + 1][var66];
                            int var71 = class65.field984[var12][var65][var66 + 1];
                            int var72 = class65.field984[var12][var65 + 1][var66 + 1];
                            if (var12 > 0) {
                                boolean var73 = true;
                                if (var68 == 0 && class195.field3115[var12][var65][var66] != 0) {
                                    var73 = false;
                                }
                                if (var67 > 0 && !class314.method2194(4, var67 - 1).field2089) {
                                    var73 = false;
                                }
                                if (var73 && var69 == var70 && var69 == var72 && var69 == var71) {
                                    class281.field4797[var12][var65][var66] = class72.method493(class281.field4797[var12][var65][var66], 4);
                                }
                            }
                            int var74;
                            int var75;
                            if (var68 <= 0) {
                                var74 = 0;
                                var75 = -1;
                            } else {
                                var75 = var10[var65][var66];
                                int var76 = (var75 & 0x7F) + var9;
                                if (var76 < 0) {
                                    var76 = 0;
                                } else if (var76 > 127) {
                                    var76 = 127;
                                }
                                int var77 = (var75 & 0x380) + ((var8 + var75 & 0xFC00) + var76);
                                var74 = class181.field2885[class303.method2113(96, var77, true)];
                            }
                            int var78 = var11[var65][var66];
                            int var79 = var11[var65 + 1][var66];
                            int var80 = var11[var65 + 1][var66 + 1];
                            int var81 = var11[var65][var66 + 1];
                            if (var67 == 0) {
                                class269.method1839(var12, var65, var66, 0, 0, -1, var69, var70, var72, var71, class303.method2113(var78, var75, true), class303.method2113(var79, var75, true), class303.method2113(var80, var75, true), class303.method2113(var81, var75, true), 0, 0, 0, 0, var74, 0);
                                if (class217.field3516 && var12 > 0 && var75 != -1 && class142.method898(var68 - 1, 0).field213) {
                                    class102.method686(0, 0, true, false, var65, var66, var69 - class65.field984[0][var65][var66], var70 - class65.field984[0][var65 + 1][var66], var72 - class65.field984[0][var65 + 1][var66 + 1], var71 - class65.field984[0][var65][var66 + 1]);
                                }
                                if (class217.field3516 && !arg2 && class290.field4926 != null && var12 == 0) {
                                    for (int var82 = var65 - 1; var82 <= (var65 + 1); var82++) {
                                        for (int var83 = var66 - 1; var83 <= var66 + 1; var83++) {
                                            if ((var65 != var82 || var66 != var83) && var82 >= 0 && var82 < 104 && var83 >= 0 && var83 < 104) {
                                                int var84 = class117.field1661[var12][var82][var83] & 0xFF;
                                                if (var84 != 0) {
                                                    class137 var85 = class314.method2194(4, var84 - 1);
                                                    if (var85.field2088 != -1 && class181.field2878.method1777(var85.field2088, 127) == 4) {
                                                        class290.field4926[var65][var66] = (var85.field2105 << 24) + var85.field2107;
                                                        continue label765;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                byte var86 = class234.field3839[var12][var65][var66];
                                int var87 = class195.field3115[var12][var65][var66] + 1;
                                class137 var88 = class314.method2194(4, var67 - 1);
                                if (class217.field3516 && !arg2 && class290.field4926 != null && var12 == 0) {
                                    if (var88.field2088 != -1 && class181.field2878.method1777(var88.field2088, 127) == 4) {
                                        class290.field4926[var65][var66] = (var88.field2105 << 24) + var88.field2107;
                                    } else {
                                        label746: for (int var89 = var65 - 1; var89 <= (var65 + 1); var89++) {
                                            for (int var90 = var66 - 1; var90 <= (var66 + 1); var90++) {
                                                if ((var65 != var89 || var66 != var90) && var89 >= 0 && var89 < 104 && var90 >= 0 && var90 < 104) {
                                                    int var91 = class117.field1661[var12][var89][var90] & 0xFF;
                                                    if (var91 != 0) {
                                                        class137 var92 = class314.method2194(4, var91 - 1);
                                                        if (var92.field2088 != -1 && class181.field2878.method1777(var92.field2088, 127) == 4) {
                                                            class290.field4926[var65][var66] = (var92.field2105 << 24) + var92.field2107;
                                                            break label746;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                int var93 = var88.field2088;
                                if (var93 >= 0 && !class181.field2878.method1774(-98, var93)) {
                                    var93 = -1;
                                }
                                int var94;
                                int var97;
                                if (var93 >= 0) {
                                    var94 = -1;
                                    var97 = class181.field2885[class302.method2111(96, class181.field2878.method1773(var93, (byte) 78), (byte) -104)];
                                } else if (var88.field2097 == -1) {
                                    var94 = -2;
                                    var97 = 0;
                                } else {
                                    var94 = var88.field2097;
                                    int var95 = (var94 & 0x7F) + var9;
                                    if (var95 < 0) {
                                        var95 = 0;
                                    } else if (var95 > 127) {
                                        var95 = 127;
                                    }
                                    int var96 = (var8 + var94 & 0xFC00) + (var94 & 0x380) + var95;
                                    var97 = class181.field2885[class302.method2111(96, var96, (byte) -102)];
                                }
                                if (var88.field2108 >= 0) {
                                    int var98 = var88.field2108;
                                    int var99 = (var98 & 0x7F) + var9;
                                    if (var99 < 0) {
                                        var99 = 0;
                                    } else if (var99 > 127) {
                                        var99 = 127;
                                    }
                                    int var100 = (var8 + var98 & 0xFC00) + (var98 & 0x380) + var99;
                                    var97 = class181.field2885[class302.method2111(96, var100, (byte) -105)];
                                }
                                class269.method1839(var12, var65, var66, var87, var86, var93, var69, var70, var72, var71, class303.method2113(var78, var75, true), class303.method2113(var79, var75, true), class303.method2113(var80, var75, true), class303.method2113(var81, var75, true), class302.method2111(var78, var94, (byte) -119), class302.method2111(var79, var94, (byte) -111), class302.method2111(var80, var94, (byte) -124), class302.method2111(var81, var94, (byte) -103), var74, var97);
                                if (class217.field3516 && var12 > 0) {
                                    class102.method686(var87, var86, var94 == -2 || !var88.field2110, var75 == -1 || !class142.method898(var68 - 1, 0).field213, var65, var66, var69 - class65.field984[0][var65][var66], -class65.field984[0][var65 + 1][var66] + var70, var72 - class65.field984[0][var65 + 1][var66 + 1], -class65.field984[0][var65][var66 - -1] + var71);
                                }
                            }
                        }
                    }
                }
            }
            if (class217.field3516) {
                float[][] var101 = new float[105][105];
                float[][] var102 = new float[105][105];
                float[][] var103 = new float[105][105];
                int[][] var104 = class65.field984[var12];
                int var105 = 1;
                while (true) {
                    if (var105 > 103) {
                        if (arg2) {
                            class1[] var110 = class147.method922(var11, var101, class117.field1661[var12], class290.field4926, class123.field1728[0], var102, 0, class60.field912[var12], var103, var10, class65.field984[var12], class70.field1026, class234.field3839[var12], var12, class195.field3115[var12]);
                            class313.method2185(var12, var110);
                            break;
                        }
                        class1[] var111 = class147.method922(var11, var101, class117.field1661[var12], (int[][]) null, (int[][]) null, var102, 0, class60.field912[var12], var103, var10, class65.field984[var12], class70.field1026, class234.field3839[var12], var12, class195.field3115[var12]);
                        class1[] var112 = class248.method1698((byte) -125, class234.field3839[var12], var11, class65.field984[var12], class195.field3115[var12], var12, var101, var102, class60.field912[var12], var103, class70.field1026, class117.field1661[var12]);
                        class1[] var113 = new class1[var111.length + var112.length];
                        for (int var114 = 0; var114 < var111.length; var114++) {
                            var113[var114] = var111[var114];
                        }
                        for (int var115 = 0; var115 < var112.length; var115++) {
                            var113[var111.length + var115] = var112[var115];
                        }
                        class313.method2185(var12, var113);
                        class212.method1427(var101, class65.field984[var12], class195.field3115[var12], class60.field912[var12], class234.field3839[var12], var102, class117.field1661[var12], class24.field409, class24.field412, var12, var103, 3);
                        break;
                    }
                    for (int var106 = 1; var106 <= 103; var106++) {
                        int var107 = var104[var106][var105 + 1] - var104[var106][var105 - 1];
                        int var108 = var104[var106 + 1][var105] - var104[var106 - 1][var105];
                        float var109 = (float) Math.sqrt((double) (var107 * var107 + var108 * var108 + 65536));
                        var101[var106][var105] = (float) var108 / var109;
                        var102[var106][var105] = -256.0F / var109;
                        var103[var106][var105] = (float) var107 / var109;
                    }
                    var105++;
                }
            }
            class60.field912[var12] = (byte[][]) null;
            class117.field1661[var12] = (byte[][]) null;
            class195.field3115[var12] = (byte[][]) null;
            class234.field3839[var12] = (byte[][]) null;
            class199.field3218[var12] = (byte[][]) null;
            var12++;
        }
        class299.method2094(-50, -10, -50);
        if (arg2) {
            return;
        }
        for (int var116 = 0; var116 < 104; var116++) {
            for (int var117 = 0; var117 < 104; var117++) {
                if ((class70.field1026[1][var116][var117] & 0x2) == 2) {
                    class283.method1916(var116, var117);
                }
            }
        }
        for (int var118 = 0; var118 < 4; var118++) {
            for (int var119 = 0; var119 <= 104; var119++) {
                for (int var120 = 0; var120 <= 104; var120++) {
                    if ((class281.field4797[var118][var120][var119] & 0x1) != 0) {
                        int var121;
                        for (var121 = var119; var121 > 0 && (class281.field4797[var118][var120][var121 - 1] & 0x1) != 0; var121--) {
                        }
                        int var122;
                        for (var122 = var119; var122 < 104 && (class281.field4797[var118][var120][var122 + 1] & 0x1) != 0; var122++) {
                        }
                        int var123 = var118;
                        int var124 = var118;
                        label447: while (var123 > 0) {
                            for (int var125 = var121; var125 <= var122; var125++) {
                                if ((class281.field4797[var123 - 1][var120][var125] & 0x1) == 0) {
                                    break label447;
                                }
                            }
                            var123--;
                        }
                        label436: while (var124 < 3) {
                            for (int var126 = var121; var126 <= var122; var126++) {
                                if ((class281.field4797[var124 + 1][var120][var126] & 0x1) == 0) {
                                    break label436;
                                }
                            }
                            var124++;
                        }
                        int var127 = (var122 + 1 - var121) * (var124 + 1 - var123);
                        if (var127 >= 8) {
                            short var128 = 240;
                            int var129 = class65.field984[var124][var120][var121] - var128;
                            int var130 = class65.field984[var123][var120][var121];
                            class202.method1337(1, var120 * 128, var120 * 128, var121 * 128, var122 * 128 + 128, var129, var130);
                            for (int var131 = var123; var131 <= var124; var131++) {
                                for (int var132 = var121; var132 <= var122; var132++) {
                                    class281.field4797[var131][var120][var132] = class34.method251(class281.field4797[var131][var120][var132], -2);
                                }
                            }
                        }
                    }
                    if ((class281.field4797[var118][var120][var119] & 0x2) != 0) {
                        int var133 = var120;
                        int var134 = var120;
                        while (var133 > 0 && (class281.field4797[var118][var133 - 1][var119] & 0x2) != 0) {
                            var133--;
                        }
                        while (var134 < 104 && (class281.field4797[var118][var134 + 1][var119] & 0x2) != 0) {
                            var134++;
                        }
                        int var135;
                        label503: for (var135 = var118; var135 > 0; var135--) {
                            for (int var136 = var133; var136 <= var134; var136++) {
                                if ((class281.field4797[var135 - 1][var136][var119] & 0x2) == 0) {
                                    break label503;
                                }
                            }
                        }
                        int var137;
                        label491: for (var137 = var118; var137 < 3; var137++) {
                            for (int var138 = var133; var138 <= var134; var138++) {
                                if ((class281.field4797[var137 + 1][var138][var119] & 0x2) == 0) {
                                    break label491;
                                }
                            }
                        }
                        int var139 = (var134 + 1 - var133) * (var137 + 1 - var135);
                        if (var139 >= 8) {
                            short var140 = 240;
                            int var141 = class65.field984[var137][var133][var119] - var140;
                            int var142 = class65.field984[var135][var133][var119];
                            class202.method1337(2, var133 * 128, var134 * 128 + 128, var119 * 128, var119 * 128, var141, var142);
                            for (int var143 = var135; var143 <= var137; var143++) {
                                for (int var144 = var133; var144 <= var134; var144++) {
                                    class281.field4797[var143][var144][var119] = class34.method251(class281.field4797[var143][var144][var119], -3);
                                }
                            }
                        }
                    }
                    if ((class281.field4797[var118][var120][var119] & 0x4) != 0) {
                        int var145 = var120;
                        int var146 = var120;
                        int var147 = var119;
                        int var148 = var119;
                        while (var147 > 0 && (class281.field4797[var118][var120][var147 - 1] & 0x4) != 0) {
                            var147--;
                        }
                        while (var148 < 104 && (class281.field4797[var118][var120][var148 + 1] & 0x4) != 0) {
                            var148++;
                        }
                        label557: while (var145 > 0) {
                            for (int var149 = var147; var149 <= var148; var149++) {
                                if ((class281.field4797[var118][var145 - 1][var149] & 0x4) == 0) {
                                    break label557;
                                }
                            }
                            var145--;
                        }
                        label546: while (var146 < 104) {
                            for (int var150 = var147; var150 <= var148; var150++) {
                                if ((class281.field4797[var118][var146 + 1][var150] & 0x4) == 0) {
                                    break label546;
                                }
                            }
                            var146++;
                        }
                        if (((var148 + 1 - var147) * (var146 + 1 - var145)) >= 4) {
                            int var151 = class65.field984[var118][var145][var147];
                            class202.method1337(4, var145 * 128, var146 * 128 + 128, var147 * 128, var148 * 128 + 128, var151, var151);
                            for (int var152 = var145; var152 <= var146; var152++) {
                                for (int var153 = var147; var153 <= var148; var153++) {
                                    class281.field4797[var118][var152][var153] = class34.method251(class281.field4797[var118][var152][var153], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ok", name = "f", descriptor = "(I)V", line = 1326)
    public static void method950(int arg0) {
        field2333 = null;
        field2335 = null;
        field2342 = null;
        field2331 = null;
        field2330 = null;
        field2334 = (int[][]) null;
        if (arg0 != -1) {
            method946((byte) -12, (byte[]) null);
        }
    }

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "(B)[Lbg;", line = 1361)
    public static final class203[] method951(byte arg0) {
        field2326++;
        class203[] var1 = new class203[class52.field807];
        if (arg0 != -87) {
            method949((class22[]) null, -40, false);
        }
        for (int var2 = 0; var2 < class52.field807; var2++) {
            int var3 = class8.field106[var2] * class253.field4383[var2];
            byte[] var4 = class23.field403[var2];
            if (class283.field4822[var2]) {
                int[] var7 = new int[var3];
                byte[] var8 = class61.field924[var2];
                for (int var9 = 0; var9 < var3; var9++) {
                    var7[var9] = class72.method493(class34.method251(var8[var9], 255) << 24, class134.field2070[class34.method251(var4[var9], 255)]);
                }
                if (class217.field3516) {
                    var1[var2] = new class178(class186.field2975, class193.field3068, class180.field2865[var2], class179.field2856[var2], class253.field4383[var2], class8.field106[var2], var7);
                } else {
                    var1[var2] = new class78(class186.field2975, class193.field3068, class180.field2865[var2], class179.field2856[var2], class253.field4383[var2], class8.field106[var2], var7);
                }
            } else {
                int[] var5 = new int[var3];
                for (int var6 = 0; var6 < var3; var6++) {
                    var5[var6] = class134.field2070[class34.method251(255, var4[var6])];
                }
                if (class217.field3516) {
                    var1[var2] = new class68(class186.field2975, class193.field3068, class180.field2865[var2], class179.field2856[var2], class253.field4383[var2], class8.field106[var2], var5);
                } else {
                    var1[var2] = new class109(class186.field2975, class193.field3068, class180.field2865[var2], class179.field2856[var2], class253.field4383[var2], class8.field106[var2], var5);
                }
            }
        }
        class132.method841((byte) -118);
        return var1;
    }
}
