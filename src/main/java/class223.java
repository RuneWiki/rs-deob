import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rq")
public class class223 {

    @OriginalMember(owner = "client!rq", name = "d", descriptor = "Liu;")
    public static class390 field3149 = new class390(80, -1);

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "I")
    public static int field3146;

    @OriginalMember(owner = "client!rq", name = "c", descriptor = "I")
    public int field3148;

    @OriginalMember(owner = "client!rq", name = "e", descriptor = "I")
    public static int field3150;

    @OriginalMember(owner = "client!rq", name = "g", descriptor = "I")
    public static int field3152;

    @OriginalMember(owner = "client!rq", name = "h", descriptor = "I")
    public int field3153;

    @OriginalMember(owner = "client!rq", name = "i", descriptor = "I")
    public int field3154;

    @OriginalMember(owner = "client!rq", name = "j", descriptor = "I")
    public static int field3155;

    @OriginalMember(owner = "client!rq", name = "k", descriptor = "I")
    public static int field3156;

    @OriginalMember(owner = "client!rq", name = "m", descriptor = "I")
    public static int field3158;

    @OriginalMember(owner = "client!rq", name = "b", descriptor = "Z")
    public boolean field3147;

    @OriginalMember(owner = "client!rq", name = "l", descriptor = "[I")
    public static int[] field3157;

    @OriginalMember(owner = "client!rq", name = "f", descriptor = "[Lh;")
    public static class452[] field3151;

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(I[ILrl;IB[I)Lbf;")
    public static final class357 method1377(int arg0, int[] arg1, class487 arg2, int arg3, byte arg4, int[] arg5) {
        field3152++;
        byte[] var6 = new byte[arg0 * arg3];
        if (arg4 != -60) {
            return null;
        }
        for (int var7 = 0; var7 < arg3; var7++) {
            int var8 = arg0 * var7 + arg1[var7];
            for (int var9 = 0; var9 < arg5[var7]; var9++) {
                var6[var8++] = -1;
            }
        }
        return new class357(arg2, arg0, arg3, var6);
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(CB)Z")
    public static final boolean method1378(char arg0, byte arg1) {
        field3146++;
        if (arg0 >= ' ' && arg0 <= '~') {
            return true;
        } else if (arg0 >= ' ' && arg0 <= 'ÿ') {
            return true;
        } else if (arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ') {
            return true;
        } else {
            if (arg1 != -1) {
                method1377(-4, null, null, -114, (byte) -35, null);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(I)V")
    public static void method1379(int arg0) {
        if (arg0 != 25) {
            method1380(30, -105, -123, 38, 90, 37, -119);
        }
        field3149 = null;
        field3157 = null;
        field3151 = null;
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1380(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3150++;
        int var7 = class276.field3953;
        class28.field461 = 0;
        int[] var8 = class330.field4790;
        for (int var9 = 0; var9 < (class339.field4942 + var7); var9++) {
            class272 var32 = null;
            class294 var33;
            if (var9 < var7) {
                var33 = class262.field3742[var8[var9]];
            } else {
                var33 = class504.field7697[class263.field3749[var9 - var7]];
                var32 = ((class139) var33).field1825;
                if (var32.field3797 != null) {
                    var32 = var32.method1656(class453.field6591, -68);
                    if (var32 == null) {
                        continue;
                    }
                }
            }
            if (var33.field4264 >= 0 && (class287.field4103 == var33.field4196 || class415.field6145.field2956 == var33.field2956)) {
                class216.method1328(arg1, arg4, arg3 >> 1, arg6 >> 1, var33, 0, var33.method873((byte) 122));
                if (class447.field6506[0] >= 0) {
                    if (var33.field4246 != null && (var9 >= var7 || class31.field522 == 0 || class31.field522 == 3 || class31.field522 == 1 && class35.method290(((class313) var33).field4592, 4877)) && class28.field461 < class146.field1895) {
                        class146.field1897[class28.field461] = class482.field6989.method3055(7748, var33.field4246) / 2;
                        class146.field1899[class28.field461] = class447.field6506[0];
                        class146.field1896[class28.field461] = class447.field6506[1];
                        class146.field1898[class28.field461] = var33.field4250;
                        class146.field1901[class28.field461] = var33.field4186;
                        class146.field1900[class28.field461] = var33.field4184;
                        class146.field1902[class28.field461] = var33.field4246;
                        class28.field461++;
                    }
                    int var34 = class447.field6506[1] + arg0;
                    int var45;
                    if (var33.field4185 || class263.field3748 >= var33.field4252) {
                        var45 = var34 - Math.max(class482.field6989.field7727, class383.field5697[0].method85());
                    } else {
                        boolean var35 = true;
                        byte var36 = 1;
                        int var37;
                        if (var9 >= var7) {
                            var37 = var32.field3842;
                            if (var37 == -1) {
                                var37 = var33.method1767(16643).field2325;
                            }
                        } else {
                            class313 var38 = class262.field3742[var8[var9]];
                            var37 = var33.method1767(16643).field2325;
                            if (var38.field4557) {
                                var36 = 2;
                            }
                        }
                        class307[] var39 = class383.field5697;
                        if (var37 != -1) {
                            class307[] var40 = (class307[]) class399.field5876.method40(0, (long) var37);
                            if (var40 == null) {
                                class328[] var41 = class328.method1976(class445.field6482, var37, 0);
                                if (var41 != null) {
                                    var40 = new class307[var41.length];
                                    for (int var42 = 0; var42 < var41.length; var42++) {
                                        var40[var42] = class481.field6937.method804(var41[var42], true);
                                    }
                                    class399.field5876.method36(-20960, var40, (long) var37);
                                }
                            }
                            if (var40 != null && var40.length >= 2) {
                                var39 = var40;
                            }
                        }
                        if (var39.length <= var36) {
                            var36 = 1;
                        }
                        class307 var43 = var39[0];
                        class307 var44 = var39[var36];
                        var45 = var34 - Math.max(class482.field6989.field7727, var43.method85());
                        int var46 = class447.field6506[0] + arg2 - (var43.method93() >> 1);
                        int var47 = var43.method93() * var33.field4248 / 255;
                        if (var33.field4248 > 0 && var47 < 2) {
                            var47 = 2;
                        }
                        var43.method1845(var46, var45);
                        class481.field6937.method789(var46, var45, var46 + var47, var45 - -var43.method85());
                        var44.method1845(var46, var45);
                        class481.field6937.method810(arg2, arg0, arg2 + arg6, arg0 + arg3);
                    }
                    var45 -= 2;
                    if (!var33.field4185) {
                        if (var33.field4205 > class263.field3748) {
                            class307 var48 = class17.field244[var33.field4236 ? 2 : 0];
                            class307 var49 = class17.field244[var33.field4236 ? 3 : 1];
                            boolean var50 = true;
                            int var51;
                            if (var33 instanceof class139) {
                                var51 = var32.field3856;
                                if (var51 == -1) {
                                    var51 = var33.method1767(16643).field2292;
                                }
                            } else {
                                var51 = var33.method1767(16643).field2292;
                            }
                            if (var51 != -1) {
                                class307[] var52 = (class307[]) class468.field6754.method40(0, (long) var51);
                                if (var52 == null) {
                                    class328[] var53 = class328.method1976(class445.field6482, var51, 0);
                                    if (var53 != null) {
                                        var52 = new class307[var53.length];
                                        for (int var54 = 0; var54 < var53.length; var54++) {
                                            var52[var54] = class481.field6937.method804(var53[var54], true);
                                        }
                                        class468.field6754.method36(-20960, var52, (long) var51);
                                    }
                                }
                                if (var52 != null && var52.length == 4) {
                                    var48 = var52[var33.field4236 ? 2 : 0];
                                    var49 = var52[var33.field4236 ? 3 : 1];
                                }
                            }
                            int var55 = var33.field4205 - class263.field3748;
                            int var58;
                            if (var55 > var33.field4182) {
                                int var56 = var55 - var33.field4182;
                                int var57 = var33.field4233 == 0 ? 0 : (var33.field4188 - var56) / var33.field4233 * var33.field4233;
                                var58 = var57 * var48.method93() / var33.field4188;
                            } else {
                                var58 = var48.method93();
                            }
                            int var59 = var48.method85();
                            var45 -= var59;
                            int var60 = class447.field6506[0] + arg2 - (var48.method93() >> 1);
                            var48.method1845(var60, var45);
                            class481.field6937.method789(var60, var45, var58 + var60, var45 - -var59);
                            var49.method1845(var60, var45);
                            var45 -= 2;
                            class481.field6937.method810(arg2, arg0, arg2 + arg6, arg0 + arg3);
                        }
                        if (var9 < var7) {
                            class313 var62 = (class313) var33;
                            if (var62.field4560 != -1) {
                                var45 -= 25;
                                class485.field7021[var62.field4560].method1845(arg2 + class447.field6506[0] - 12, var45);
                                var45 -= 2;
                            }
                            if (var62.field4567 != -1) {
                                var45 -= 25;
                                class122.field1593[var62.field4567].method1845(arg2 + class447.field6506[0] - 12, var45);
                                var45 -= 2;
                            }
                        } else if (var32.field3794 >= 0 && var32.field3794 < class122.field1593.length) {
                            class307 var61 = class122.field1593[var32.field3794];
                            var45 -= 25;
                            var61.method1845(class447.field6506[0] + arg2 - (var61.method93() >> 1), var45);
                            var45 -= 2;
                        }
                    }
                    int var10000;
                    if (!var33 instanceof class313) {
                        int var69 = 0;
                        class434[] var70 = class254.field3662;
                        for (int var71 = 0; var71 < var70.length; var71++) {
                            class434 var75 = var70[var71];
                            if (var75 != null && var75.field6358 == 1 && class263.field3749[var9 - var7] == var75.field6357) {
                                class307 var76 = class150.field1943[var75.field6364];
                                if (var69 < var76.method85()) {
                                    var69 = var76.method85();
                                }
                                if ((class263.field3748 % 20) < 10) {
                                    var76.method1845(class447.field6506[0] + arg2 - 12, var45 + -var76.method85());
                                }
                            }
                        }
                        if (var69 > 0) {
                            var10000 = var45 - (var69 + 2);
                        }
                    } else if (var9 >= 0) {
                        int var63 = 0;
                        class434[] var64 = class254.field3662;
                        for (int var65 = 0; var65 < var64.length; var65++) {
                            class434 var67 = var64[var65];
                            if (var67 != null && var67.field6358 == 10 && var8[var9] == var67.field6357) {
                                class307 var68 = class150.field1943[var67.field6364];
                                if (var68.method85() > var63) {
                                    var63 = var68.method85();
                                }
                                var68.method1845(class447.field6506[0] + arg2 - 12, var45 + -var68.method85());
                            }
                        }
                        if (var63 > 0) {
                            var10000 = var45 - (var63 + 2);
                        }
                    }
                    for (int var73 = 0; var73 < 4; var73++) {
                        if (class263.field3748 < var33.field4224[var73]) {
                            int var74 = var33.method873((byte) 122) / 2;
                            class216.method1328(arg1, arg4, arg3 >> 1, arg6 >> 1, var33, 0, var74);
                            if (class447.field6506[0] > -1) {
                                if (var73 == 1) {
                                    class447.field6506[1] -= 20;
                                }
                                if (var73 == 2) {
                                    class447.field6506[0] -= 15;
                                    class447.field6506[1] -= 10;
                                }
                                if (var73 == 3) {
                                    class447.field6506[1] -= 10;
                                    class447.field6506[0] += 15;
                                }
                                class149.field1929[var33.field4211[var73]].method1845(arg2 + class447.field6506[0] - 12, arg0 + -12 + class447.field6506[1]);
                                class95.field1282.method2107(class447.field6506[0] + arg2 - 1, Integer.toString(var33.field4212[var73]), arg0 + class447.field6506[1] + 3, -1, -14014, 0);
                            }
                        }
                    }
                }
            }
        }
        for (int var10 = 0; var10 < class70.field1026; var10++) {
            int var28 = class52.field766[var10];
            class294 var29;
            if (var28 < 2048) {
                var29 = class262.field3742[var28];
            } else {
                var29 = class504.field7697[var28 - 2048];
            }
            int var30 = class481.field6940[var10];
            class294 var31;
            if (var30 >= 2048) {
                var31 = class504.field7697[var30 - 2048];
            } else {
                var31 = class262.field3742[var30];
            }
            class136.method864(arg6, --var29.field4245, var31, var29, arg1, (byte) -117, arg4, arg2, arg3, arg0);
        }
        if (arg5 < 117) {
            method1380(-110, -91, -83, 0, 102, 23, -33);
        }
        int var11 = class482.field6989.field7727 + class482.field6989.field7724 + 2;
        for (int var12 = 0; var12 < class28.field461; var12++) {
            int var13 = class146.field1899[var12];
            int var14 = class146.field1896[var12];
            int var15 = class146.field1897[var12];
            boolean var16 = true;
            while (var16) {
                var16 = false;
                for (int var27 = 0; var27 < var12; var27++) {
                    if ((class146.field1896[var27] - var11) < (var14 + 2) && var14 - var11 < class146.field1896[var27] + 2 && class146.field1899[var27] + class146.field1897[var27] > -var15 + var13 && (class146.field1899[var27] - class146.field1897[var27]) < (var13 + var15) && class146.field1896[var27] - var11 < var14) {
                        var16 = true;
                        var14 = class146.field1896[var27] - var11;
                    }
                }
            }
            class146.field1896[var12] = var14;
            String var17 = class146.field1902[var12];
            if (class284.field4052 == 0) {
                int var18 = 16776960;
                if (class146.field1898[var12] < 6) {
                    var18 = class121.field1580[class146.field1898[var12]];
                }
                if (class146.field1898[var12] == 6) {
                    var18 = (class287.field4103 % 20) >= 10 ? 16776960 : 16711680;
                }
                if (class146.field1898[var12] == 7) {
                    var18 = (class287.field4103 % 20) >= 10 ? 65535 : 255;
                }
                if (class146.field1898[var12] == 8) {
                    var18 = (class287.field4103 % 20) >= 10 ? 8454016 : 45056;
                }
                if (class146.field1898[var12] == 9) {
                    int var19 = 150 - class146.field1900[var12];
                    if (var19 < 50) {
                        var18 = var19 * 1280 + 16711680;
                    } else if (var19 < 100) {
                        var18 = 16776960 - (var19 * 327680 - 16384000);
                    } else if (var19 < 150) {
                        var18 = (var19 - 100) * 5 + 65280;
                    }
                }
                if (class146.field1898[var12] == 10) {
                    int var20 = 150 - class146.field1900[var12];
                    if (var20 < 50) {
                        var18 = var20 * 5 + 16711680;
                    } else if (var20 < 100) {
                        var18 = 16711935 - ((var20 - 50) * 327680);
                    } else if (var20 < 150) {
                        var18 = var20 * 327680 + 500 - var20 * 5 - 32767745;
                    }
                }
                if (class146.field1898[var12] == 11) {
                    int var21 = 150 - class146.field1900[var12];
                    if (var21 < 50) {
                        var18 = 16777215 - (var21 * 327685);
                    } else if (var21 < 100) {
                        var18 = var21 * 327685 + 65280 - 16384250;
                    } else if (var21 < 150) {
                        var18 = 16777215 - ((var21 - 100) * 327680);
                    }
                }
                int var22 = var18 | 0xFF000000;
                if (class146.field1901[var12] == 0) {
                    class458.field6676.method2107(arg2 + var13, var17, arg0 + var14, var22, -14014, -16777216);
                }
                if (class146.field1901[var12] == 1) {
                    class458.field6676.method2109(-16777216, var22, var17, 2, class287.field4103, arg0 + var14, arg2 + var13);
                }
                if (class146.field1901[var12] == 2) {
                    class458.field6676.method2105(class287.field4103, arg0 + var14, var17, -16777216, arg2 + var13, var22, 5);
                }
                if (class146.field1901[var12] == 3) {
                    class458.field6676.method2104(var22, var17, 150 - class146.field1900[var12], -16777216, arg2 + var13, class287.field4103, 23, arg0 + var14);
                }
                if (class146.field1901[var12] == 4) {
                    int var23 = (150 - class146.field1900[var12]) * (class482.field6989.method3055(7748, var17) + 100) / 150;
                    class481.field6937.method789(arg2 + var13 - 50, arg0, arg2 + var13 + 50, arg0 + arg3);
                    class458.field6676.method2116(var22, -16777216, arg2 - (-var13 - 50) - var23, arg0 + var14, var17, (byte) -85);
                    class481.field6937.method810(arg2, arg0, arg2 + arg6, arg0 + arg3);
                }
                if (class146.field1901[var12] == 5) {
                    int var24 = 150 - class146.field1900[var12];
                    int var25 = 0;
                    if (var24 < 25) {
                        var25 = var24 - 25;
                    } else if (var24 > 125) {
                        var25 = var24 - 125;
                    }
                    int var26 = class482.field6989.field7727 + class482.field6989.field7724;
                    class481.field6937.method789(arg2, arg0 - (var26 + 1 - var14), arg2 - -arg6, arg0 + var14 + 5);
                    class458.field6676.method2107(arg2 + var13, var17, arg0 + var14 + var25, var22, -14014, -16777216);
                    class481.field6937.method810(arg2, arg0, arg2 + arg6, arg0 - -arg3);
                }
            } else {
                class458.field6676.method2107(arg2 + var13, var17, arg0 + var14, -256, -14014, -16777216);
            }
        }
    }
}
