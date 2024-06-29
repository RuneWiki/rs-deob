import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ku")
public class class397 {

    @OriginalMember(owner = "client!ku", name = "b", descriptor = "Llja;")
    public static class744 field5137 = new class744(22, 7);

    @OriginalMember(owner = "client!ku", name = "e", descriptor = "[I")
    public static int[] field5140 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!ku", name = "f", descriptor = "Ljava/lang/String;")
    public static String field5141 = null;

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "I")
    public static int field5136;

    @OriginalMember(owner = "client!ku", name = "c", descriptor = "I")
    public static int field5138;

    @OriginalMember(owner = "client!ku", name = "d", descriptor = "I")
    public static int field5139;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ku", name = "g", descriptor = "Ljava/lang/Class;")
    public static Class field5142;

    // $FF: synthetic method
    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2332(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(II[Lkq;)V", line = 4)
    public static final void method2328(int arg0, int arg1, class620[] arg2) {
        int var3 = 60 / ((60 - arg1) / 53);
        for (int var4 = 0; var4 < arg2.length; var4++) {
            class620 var5 = arg2[var4];
            if (var5 != null && var5.field8400 == arg0 && !client.method1891(var5)) {
                if (var5.field8371 == 0) {
                    method2328(var5.field8515, -117, arg2);
                    if (var5.field8343 != null) {
                        method2328(var5.field8515, 124, var5.field8343);
                    }
                    class52 var6 = (class52) class728.field10205.method2121(104, (long) var5.field8515);
                    if (var6 != null) {
                        class250.method1496(var6.field713, -1394622263);
                    }
                }
                if (var5.field8371 == 6 && var5.field8337 != -1) {
                    class582 var7 = class362.field4504.method3600(-46, var5.field8337);
                    if (var7 != null) {
                        var5.field8362 += class190.field2279;
                        int var8 = var5.field8404;
                        while (var5.field8362 > var7.field7936[var5.field8404]) {
                            var5.field8362 -= var7.field7936[var5.field8404];
                            var5.field8404++;
                            if (var7.field7955.length <= var5.field8404) {
                                var5.field8404 -= var7.field7957;
                                if (var5.field8404 < 0 || var7.field7955.length <= var5.field8404) {
                                    var5.field8404 = 0;
                                }
                            }
                            var5.field8460 = var5.field8404 + 1;
                            if (var7.field7955.length <= var5.field8460) {
                                var5.field8460 -= var7.field7957;
                                if (var5.field8460 < 0 || var5.field8460 >= var7.field7955.length) {
                                    var5.field8460 = -1;
                                }
                            }
                            class576.method3330(var5, -1);
                        }
                        if (var5.field8404 != var8) {
                            class514.method3080(var5.field8404, 641545256, var7);
                        }
                    }
                }
            }
        }
        field5136++;
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(IILha;)Z", line = 98)
    public static final boolean method2329(int arg0, int arg1, class66 arg2) {
        field5139++;
        int var3 = (class596.field8090 - 104) / 2;
        int var4 = (class107.field1350 - 104) / 2;
        boolean var5 = true;
        for (int var6 = var3; var6 < var3 + 104; var6++) {
            for (int var57 = var4; var57 < var4 + 104; var57++) {
                for (int var58 = arg0; var58 <= 3; var58++) {
                    if (class99.method845(var57, var58, arg0, var6, 16)) {
                        int var59 = var58;
                        if (class77.method708(var6, -184949524, var57)) {
                            var59 = var58 - 1;
                        }
                        if (var59 >= 0) {
                            var5 &= class690.method3855(var57, var6, (byte) 87, var59);
                        }
                    }
                }
            }
        }
        if (!var5) {
            return false;
        }
        int[] var7 = new int[262144];
        for (int var8 = 0; var8 < var7.length; var8++) {
            var7[var8] = -16777216;
        }
        class629.field8599 = arg2.method623(var7, 512, 1, 512, 512, 0);
        class243.method1469(-24978);
        if (arg1 >= -55) {
            field5141 = null;
        }
        int var9 = ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + (int) (Math.random() * 20.0D) + 238 - 10 | 0xFF000000;
        int var10 = ((int) (Math.random() * 20.0D) + 228 | 0x7B54FF00) << 16;
        int var11 = (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D);
        boolean[][] var12 = new boolean[class122.field1566 + 1 + 2][class122.field1566 + 1 + 2];
        for (int var13 = var3; var13 < var3 + 104; var13 += class122.field1566) {
            for (int var36 = var4; var36 < (var4 + 104); var36 += class122.field1566) {
                int var37 = 0;
                int var38 = 0;
                int var39 = var13;
                if (var13 > 0) {
                    var39 = var13 - 1;
                    var37 += 4;
                }
                int var40 = var36;
                if (var36 > 0) {
                    var40 = var36 - 1;
                }
                int var41 = class122.field1566 + var13;
                if (var41 < 104) {
                    var41++;
                }
                int var42 = var36 + class122.field1566;
                if (var42 < 104) {
                    var38 += 4;
                    var42++;
                }
                arg2.method556(0, 0, class122.field1566 * 4 + var37, class122.field1566 * 4 + var38);
                arg2.method13(-16777216);
                for (int var43 = arg0; var43 <= 3; var43++) {
                    for (int var50 = 0; var50 <= class122.field1566; var50++) {
                        for (int var56 = 0; var56 <= class122.field1566; var56++) {
                            var12[var50][var56] = class99.method845(var40 + var56, var43, arg0, var39 + var50, 16);
                        }
                    }
                    class707.field9933[var43].method1407(0, 0, 1024, var39, var40, var41, var42, var12);
                    if (!class207.field2460) {
                        for (int var51 = -4; var51 < class122.field1566; var51++) {
                            for (int var52 = -4; var52 < class122.field1566; var52++) {
                                int var53 = var13 + var51;
                                int var54 = var36 + var52;
                                if (var53 >= var3 && var4 <= var54 && class99.method845(var54, var43, arg0, var53, 16)) {
                                    int var55 = var43;
                                    if (class77.method708(var53, -184949524, var54)) {
                                        var55 = var43 - 1;
                                    }
                                    if (var55 >= 0) {
                                        class239.method1449(var55, arg2, var9, (byte) -93, var51 * 4 + var37, var54, (class122.field1566 - var52) * 4 + var38 - 4, var53, var10);
                                    }
                                }
                            }
                        }
                    }
                }
                if (class207.field2460) {
                    class415 var44 = class633.field8649[arg0];
                    for (int var45 = 0; var45 < class122.field1566; var45++) {
                        for (int var46 = 0; var46 < class122.field1566; var46++) {
                            int var47 = var13 + var45;
                            int var48 = var36 + var46;
                            int var49 = var44.field5428[var47 - var44.field5435][var48 - var44.field5415];
                            if ((var49 & 0x40240000) != 0) {
                                arg2.method600(var45 * 4 + var37, (-var46 + class122.field1566) * 4 + var38 - 4, 785580130, -1713569622, 4, 4);
                            } else if ((var49 & 0x800000) != 0) {
                                arg2.method580(var45 * 4 + var37, (-var46 + class122.field1566) * 4 + var38 + -4, -116, -1713569622, 4);
                            } else if ((var49 & 0x2000000) != 0) {
                                arg2.method594(-1713569622, var37 - (-(var45 * 4) - 3), (-var46 + class122.field1566) * 4 + var38 + -4, 4, 0);
                            } else if ((var49 & 0x8000000) != 0) {
                                arg2.method580(var45 * 4 + var37, (class122.field1566 - var46) * 4 + var38 + -4 + 3, -123, -1713569622, 4);
                            } else if ((var49 & 0x20000000) != 0) {
                                arg2.method594(-1713569622, var45 * 4 + var37, (-var46 + class122.field1566) * 4 + var38 + -4, 4, 0);
                            }
                        }
                    }
                }
                arg2.method645(var37, var38, class122.field1566 * 4, class122.field1566 * 4, var11, 2);
                class629.field8599.method239(((var13 - var3) * 4) + 48, -((-var4 + var36) * 4) + 464 + -(class122.field1566 * 4), class122.field1566 * 4, class122.field1566 * 4, var37, var38);
            }
        }
        arg2.method634();
        arg2.method13(-16777215);
        class41.method341(-58);
        class551.field7657 = 0;
        class274.field3216.method2729(-48);
        if (!class207.field2460) {
            for (int var14 = var3; var14 < (var3 + 104); var14++) {
                for (int var20 = var4; var20 < (var4 + 104); var20++) {
                    for (int var21 = arg0; var21 <= arg0 + 1 && var21 <= 3; var21++) {
                        if (class99.method845(var20, var21, arg0, var14, 16)) {
                            class238 var22 = (class238) class662.method3720(var21, var14, var20);
                            if (var22 == null) {
                                var22 = (class238) class764.method4234(var21, var14, var20, field5142 == null ? (field5142 = method2332("qb")) : field5142);
                            }
                            if (var22 == null) {
                                var22 = (class238) class253.method1504(var21, var14, var20);
                            }
                            if (var22 == null) {
                                var22 = (class238) class714.method4042(var21, var14, var20);
                            }
                            if (var22 != null) {
                                class174 var23 = class379.field4811.method4192(27324, var22.method927(-24482));
                                if (!var23.field2161 || class629.field8601) {
                                    int var24 = var23.field2118;
                                    if (var23.field2157 != null) {
                                        for (int var25 = 0; var25 < var23.field2157.length; var25++) {
                                            if (var23.field2157[var25] != -1) {
                                                class174 var26 = class379.field4811.method4192(27324, var23.field2157[var25]);
                                                if (var26.field2118 >= 0) {
                                                    var24 = var26.field2118;
                                                }
                                            }
                                        }
                                    }
                                    if (var24 >= 0) {
                                        boolean var27 = false;
                                        if (var24 >= 0) {
                                            class305 var28 = class2.field33.method4140(36, var24);
                                            if (var28 != null && var28.field3668) {
                                                var27 = true;
                                            }
                                        }
                                        int var29 = var14;
                                        int var30 = var20;
                                        if (var27) {
                                            int[][] var31 = class633.field8649[var21].field5428;
                                            int var32 = class633.field8649[var21].field5435;
                                            int var33 = class633.field8649[var21].field5415;
                                            for (int var34 = 0; var34 < 10; var34++) {
                                                int var35 = (int) (Math.random() * 4.0D);
                                                if (var35 == 0 && var3 < var29 && var29 > (var14 - 3) && (var31[var29 - var32 - 1][var30 - var33] & 0x2C0108) == 0) {
                                                    var29--;
                                                }
                                                if (var35 == 1 && (var3 + 104 - 1) > var29 && var29 < var14 + 3 && (var31[var29 + 1 - var32][var30 - var33] & 0x2C0180) == 0) {
                                                    var29++;
                                                }
                                                if (var35 == 2 && var30 > var4 && var30 > (var20 - 3) && (var31[var29 - var32][var30 - var33 - 1] & 0x2C0102) == 0) {
                                                    var30--;
                                                }
                                                if (var35 == 3 && (var4 + 104 - 1) > var30 && (var20 + 3) > var30 && (var31[var29 - var32][var30 + 1 - var33] & 0x2C0120) == 0) {
                                                    var30++;
                                                }
                                            }
                                        }
                                        class36.field543[class551.field7657] = var23.field2166;
                                        class547.field7640[class551.field7657] = var29;
                                        class558.field7752[class551.field7657] = var30;
                                        class551.field7657++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (class418.field5453 != null) {
                class483.field6745.field670 = 1;
                class2.field33.method4139(1024, 64, (byte) 86);
                for (int var15 = 0; var15 < class418.field5453.field1827; var15++) {
                    int var16 = class418.field5453.field1828[var15];
                    if (var16 >> 28 == class300.field3596.field808) {
                        int var17 = (var16 >> 14 & 0x3FFF) - class632.field8626;
                        int var18 = (var16 & 0x3FFF) - class620.field8435;
                        if (var17 >= 0 && class596.field8090 > var17 && var18 >= 0 && class107.field1350 > var18) {
                            class274.field3216.method2732(new class365(var15), 21939);
                        } else {
                            class305 var19 = class2.field33.method4140(36, class418.field5453.field1830[var15]);
                            if (var19.field3644 != null && (var17 + var19.field3645) >= 0 && class596.field8090 > var17 + var19.field3653 && var18 + var19.field3664 >= 0 && class107.field1350 > (var19.field3647 + var18)) {
                                class274.field3216.method2732(new class365(var15), 21939);
                            }
                        }
                    }
                }
                class2.field33.method4139(128, 64, (byte) 86);
                class483.field6745.field670 = 2;
                class483.field6745.method429(-124);
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(I)V", line = 553)
    public static void method2330(int arg0) {
        field5141 = null;
        field5140 = null;
        if (arg0 == 0) {
            field5137 = null;
        }
    }

    @OriginalMember(owner = "client!ku", name = "b", descriptor = "(I)I", line = 572)
    public static final int method2331(int arg0) {
        field5138++;
        if (class260.field3075 != null) {
            return 3;
        } else if (arg0 == 3) {
            return class31.field499 ? 2 : 1;
        } else {
            return -21;
        }
    }
}
