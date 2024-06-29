import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vq")
public class class311 {

    @OriginalMember(owner = "client!vq", name = "i", descriptor = "Lnn;")
    public static class151 field4686;

    @OriginalMember(owner = "client!vq", name = "f", descriptor = "B")
    public byte field4683;

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "I")
    public int field4678;

    @OriginalMember(owner = "client!vq", name = "e", descriptor = "I")
    public static int field4682;

    @OriginalMember(owner = "client!vq", name = "h", descriptor = "Le;")
    public static class255 field4685;

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "Ljava/lang/String;")
    public String field4679;

    @OriginalMember(owner = "client!vq", name = "c", descriptor = "Ljava/lang/String;")
    public String field4680;

    @OriginalMember(owner = "client!vq", name = "d", descriptor = "Ljava/lang/String;")
    public String field4681;

    @OriginalMember(owner = "client!vq", name = "g", descriptor = "Ljava/lang/String;")
    public String field4684;

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(IIIIIIZ)V")
    public static final void method1895(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field4682++;
        int var7 = class307.field4634;
        int[] var8 = class201.field3038;
        class8.field75 = 0;
        byte var9 = class113.method684(1) == 2 ? (byte) class267.field4078 : 1;
        label442: for (int var10 = 0; var10 < (var7 + class38.field458); var10++) {
            class271 var33 = null;
            class145 var34;
            if (var7 <= var10) {
                var34 = class170.field2626[class87.field1235[var10 - var7]];
                var33 = ((class155) var34).field2137;
                if (var33.field4100 != null) {
                    var33 = var33.method1684(6);
                    if (var33 == null) {
                        continue;
                    }
                }
            } else {
                var34 = class140.field1883[var8[var10]];
            }
            if (var34.field1994 >= 0) {
                if (class75.field1016 != null && var34.field1902 > class113.field1500.field1902) {
                    for (int var35 = var34.field1895; var35 <= var34.field1890; var35++) {
                        for (int var36 = var34.field1901; var36 <= var34.field1889; var36++) {
                            if (class75.field1016[var34.field1902][var35][var36] == var9) {
                                continue label442;
                            }
                        }
                    }
                }
                class85.method553(arg3 >> 1, arg2, arg1 >> 1, (byte) -50, var34, arg5, var34.method908((byte) 89));
                if (class212.field3189[0] >= 0) {
                    if (var34.field1979 != null && (var7 <= var10 || class103.field1397 == 0 || class103.field1397 == 3 || class103.field1397 == 1 && class174.method1068(((class169) var34).field2459, 0)) && class113.field1505 > class8.field75) {
                        class113.field1494[class8.field75] = class188.field2828.method1693(-97, var34.field1979) / 2;
                        class113.field1506[class8.field75] = class212.field3189[0];
                        class113.field1504[class8.field75] = class212.field3189[1];
                        class113.field1502[class8.field75] = var34.field2006;
                        class113.field1497[class8.field75] = var34.field1944;
                        class113.field1495[class8.field75] = var34.field1982;
                        class113.field1499[class8.field75] = var34.field1979;
                        class8.field75++;
                    }
                    class234 var37 = class196.field2968[0];
                    int var38 = arg4 + (class212.field3189[1] - Math.max(class188.field2828.field4176, var37.method1229()));
                    if (!var34.field1942 && var34.field1981 > class26.field332) {
                        class234 var39 = class196.field2968[1];
                        if (var34 instanceof class155) {
                            class155 var40 = (class155) var34;
                            class234[] var41 = (class234[]) class245.field3665.method1491((long) var40.field2137.field4101, 0);
                            if (var41 == null) {
                                class4[] var42 = class4.method26(class427.field6274, var40.field2137.field4101, 0);
                                if (var42 != null) {
                                    var41 = new class234[var42.length];
                                    for (int var43 = 0; var43 < var42.length; var43++) {
                                        var41[var43] = class196.field2965.method378(var42[var43], true);
                                    }
                                    class245.field3665.method1488(128, (long) var40.field2137.field4101, var41);
                                }
                            }
                            if (var41 != null && var41.length == 2) {
                                var39 = var41[1];
                                var37 = var41[0];
                            }
                        }
                        int var44 = arg0 + (class212.field3189[0] - (var37.method1227() >> 1));
                        var37.method1408(var44, var38);
                        int var45 = var37.method1227() * var34.field1964 / 255;
                        if (var34.field1964 > 0 && var45 < 2) {
                            var45 = 2;
                        }
                        class196.field2965.method354(var44, var38, var44 + var45, var37.method1229() + var38);
                        var39.method1408(var44, var38);
                        class196.field2965.method436(arg0, arg4, arg0 + arg3, arg1 + arg4);
                    }
                    var38 -= 2;
                    if (!var34.field1942) {
                        if (class26.field332 < var34.field1965) {
                            class234 var46 = class315.field4775[var34.field1970 ? 2 : 0];
                            class234 var47 = class315.field4775[var34.field1970 ? 3 : 1];
                            boolean var48 = true;
                            int var49;
                            if (var34 instanceof class155) {
                                var49 = var33.field4134;
                                if (var49 == -1) {
                                    var49 = var34.method902(26647).field6381;
                                }
                            } else {
                                var49 = var34.method902(26647).field6381;
                            }
                            if (var49 != -1) {
                                class234[] var50 = (class234[]) class458.field6784.method1491((long) var49, 0);
                                if (var50 == null) {
                                    class4[] var51 = class4.method26(class427.field6274, var49, 0);
                                    if (var51 != null) {
                                        var50 = new class234[var51.length];
                                        for (int var52 = 0; var52 < var51.length; var52++) {
                                            var50[var52] = class196.field2965.method378(var51[var52], true);
                                        }
                                        class458.field6784.method1488(128, (long) var49, var50);
                                    }
                                }
                                if (var50 != null && var50.length == 4) {
                                    var47 = var50[var34.field1970 ? 3 : 1];
                                    var46 = var50[var34.field1970 ? 2 : 0];
                                }
                            }
                            int var53 = var34.field1965 - class26.field332;
                            int var56;
                            if (var34.field1984 < var53) {
                                int var54 = var53 - var34.field1984;
                                int var55 = var34.field1953 == 0 ? 0 : (var34.field1961 - var54) / var34.field1953 * var34.field1953;
                                var56 = var55 * var46.method1227() / var34.field1961;
                            } else {
                                var56 = var46.method1227();
                            }
                            int var57 = var46.method1229();
                            var38 -= var57;
                            int var58 = class212.field3189[0] + arg0 - (var46.method1227() >> 1);
                            var46.method1408(var58, var38);
                            class196.field2965.method354(var58, var38, var56 + var58, var38 + var57);
                            var47.method1408(var58, var38);
                            class196.field2965.method436(arg0, arg4, arg0 + arg3, arg1 + arg4);
                            var38 -= 2;
                        }
                        if (var10 < var7) {
                            class169 var59 = (class169) var34;
                            if (var59.field2422 != -1) {
                                var38 -= 25;
                                class435.field6404[var59.field2422].method1408(class212.field3189[0] + arg0 - 12, var38);
                                var38 -= 2;
                            }
                            if (var59.field2467 != -1) {
                                var38 -= 25;
                                class314.field4762[var59.field2467].method1408(class212.field3189[0] + arg0 - 12, var38);
                                var38 -= 2;
                            }
                        } else if (var33.field4162 >= 0 && var33.field4162 < class314.field4762.length) {
                            class234 var60 = class314.field4762[var33.field4162];
                            var38 -= 25;
                            var60.method1408(class212.field3189[0] + arg0 - (var60.method1227() >> 1), var38);
                            var38 -= 2;
                        }
                    }
                    int var10000;
                    if (!var34 instanceof class169) {
                        int var67 = 0;
                        class8[] var68 = class55.field744;
                        for (int var69 = 0; var69 < var68.length; var69++) {
                            class8 var73 = var68[var69];
                            if (var73 != null && var73.field85 == 1 && class87.field1235[var10 - var7] == var73.field79) {
                                class234 var74 = class262.field4013[var73.field84];
                                if (var74.method1229() > var67) {
                                    var67 = var74.method1229();
                                }
                                if (class26.field332 % 20 < 10) {
                                    var74.method1408(class212.field3189[0] + arg0 - 12, -var74.method1229() + var38);
                                }
                            }
                        }
                        if (var67 > 0) {
                            var10000 = var38 - (var67 + 2);
                        }
                    } else if (var10 >= 0) {
                        int var61 = 0;
                        class8[] var62 = class55.field744;
                        for (int var63 = 0; var63 < var62.length; var63++) {
                            class8 var65 = var62[var63];
                            if (var65 != null && var65.field85 == 10 && var8[var10] == var65.field79) {
                                class234 var66 = class262.field4013[var65.field84];
                                if (var66.method1229() > var61) {
                                    var61 = var66.method1229();
                                }
                                var66.method1408(class212.field3189[0] + arg0 - 12, -var66.method1229() + var38);
                            }
                        }
                        if (var61 > 0) {
                            var10000 = var38 - (var61 + 2);
                        }
                    }
                    for (int var71 = 0; var71 < 4; var71++) {
                        if (class26.field332 < var34.field1996[var71]) {
                            int var72 = var34.method908((byte) 106) / 2;
                            class85.method553(arg3 >> 1, arg2, arg1 >> 1, (byte) 123, var34, arg5, var72);
                            if (class212.field3189[0] > -1) {
                                if (var71 == 1) {
                                    class212.field3189[1] -= 20;
                                }
                                if (var71 == 2) {
                                    class212.field3189[1] -= 10;
                                    class212.field3189[0] -= 15;
                                }
                                if (var71 == 3) {
                                    class212.field3189[0] += 15;
                                    class212.field3189[1] -= 10;
                                }
                                class299.field4534[var34.field1960[var71]].method1408(arg0 + class212.field3189[0] - 12, arg4 - (-class212.field3189[1] + 12));
                                class284.field4334.method858(-3700, -1, 0, arg4 + class212.field3189[1] + 3, arg0 - (-class212.field3189[0] + 1), Integer.toString(var34.field1937[var71]));
                            }
                        }
                    }
                }
            }
        }
        for (int var11 = 0; var11 < class80.field1052; var11++) {
            int var29 = class375.field5471[var11];
            class145 var30;
            if (var29 < 2048) {
                var30 = class140.field1883[var29];
            } else {
                var30 = class170.field2626[var29 - 2048];
            }
            int var31 = class294.field4470[var11];
            class145 var32;
            if (var31 >= 2048) {
                var32 = class170.field2626[var31 - 2048];
            } else {
                var32 = class140.field1883[var31];
            }
            class86.method559(arg3, --var30.field2008, arg0, arg1, var32, var30, arg2, -96, arg4, arg5);
        }
        int var12 = class188.field2828.field4176 + class188.field2828.field4172 + 2;
        if (!arg6) {
            return;
        }
        for (int var13 = 0; var13 < class8.field75; var13++) {
            int var14 = class113.field1506[var13];
            int var15 = class113.field1504[var13];
            int var16 = class113.field1494[var13];
            boolean var17 = true;
            while (var17) {
                var17 = false;
                for (int var28 = 0; var28 < var13; var28++) {
                    if ((var15 + 2) > (class113.field1504[var28] - var12) && class113.field1504[var28] + 2 > -var12 + var15 && var14 - var16 < class113.field1506[var28] - -class113.field1494[var28] && class113.field1506[var28] - class113.field1494[var28] < var14 + var16 && (class113.field1504[var28] - var12) < var15) {
                        var15 = class113.field1504[var28] - var12;
                        var17 = true;
                    }
                }
            }
            class113.field1504[var13] = var15;
            String var18 = class113.field1499[var13];
            if (class367.field5379 == 0) {
                int var19 = 16776960;
                if (class113.field1502[var13] < 6) {
                    var19 = class326.field4893[class113.field1502[var13]];
                }
                if (class113.field1502[var13] == 6) {
                    var19 = class267.field4078 % 20 >= 10 ? 16776960 : 16711680;
                }
                if (class113.field1502[var13] == 7) {
                    var19 = class267.field4078 % 20 < 10 ? 255 : 65535;
                }
                if (class113.field1502[var13] == 8) {
                    var19 = class267.field4078 % 20 < 10 ? 45056 : 8454016;
                }
                if (class113.field1502[var13] == 9) {
                    int var20 = 150 - class113.field1495[var13];
                    if (var20 < 50) {
                        var19 = var20 * 1280 + 16711680;
                    } else if (var20 < 100) {
                        var19 = 16776960 - ((var20 - 50) * 327680);
                    } else if (var20 < 150) {
                        var19 = ((var20 - 100) * 5) + 65280;
                    }
                }
                if (class113.field1502[var13] == 10) {
                    int var21 = 150 - class113.field1495[var13];
                    if (var21 < 50) {
                        var19 = var21 * 5 + 16711680;
                    } else if (var21 < 100) {
                        var19 = 16711935 - ((var21 - 50) * 327680);
                    } else if (var21 < 150) {
                        var19 = var21 * 327680 - ((var21 - 100) * 5) - 32767745;
                    }
                }
                if (class113.field1502[var13] == 11) {
                    int var22 = 150 - class113.field1495[var13];
                    if (var22 < 50) {
                        var19 = 16777215 - var22 * 327685;
                    } else if (var22 < 100) {
                        var19 = (var22 - 50) * 327685 + 65280;
                    } else if (var22 < 150) {
                        var19 = 16777215 - ((var22 - 100) * 327680);
                    }
                }
                int var23 = var19 | 0xFF000000;
                if (class113.field1497[var13] == 0) {
                    class161.field2244.method858(-3700, var23, -16777216, arg4 + var15, arg0 - -var14, var18);
                }
                if (class113.field1497[var13] == 1) {
                    class161.field2244.method867(class267.field4078, arg4 + var15, -16777216, false, var23, arg0 + var14, var18);
                }
                if (class113.field1497[var13] == 2) {
                    class161.field2244.method869(arg0 + var14, var23, arg4 + var15, -16777216, class267.field4078, true, var18);
                }
                if (class113.field1497[var13] == 3) {
                    class161.field2244.method859(var23, -16777216, arg4 + var15, var18, arg0 + var14, -class113.field1495[var13] + 150, 121, class267.field4078);
                }
                if (class113.field1497[var13] == 4) {
                    int var24 = (150 - class113.field1495[var13]) * (class188.field2828.method1693(-93, var18) + 100) / 150;
                    class196.field2965.method354(var14 + arg0 - 50, arg4, arg0 + var14 + 50, arg1 + arg4);
                    class161.field2244.method873(var18, 0, arg4 + var15, var23, -16777216, arg0 + var14 - (var24 - 50));
                    class196.field2965.method436(arg0, arg4, arg0 + arg3, arg1 + arg4);
                }
                if (class113.field1497[var13] == 5) {
                    int var25 = 150 - class113.field1495[var13];
                    int var26 = 0;
                    if (var25 < 25) {
                        var26 = var25 - 25;
                    } else if (var25 > 125) {
                        var26 = var25 - 125;
                    }
                    int var27 = class188.field2828.field4176 + class188.field2828.field4172;
                    class196.field2965.method354(arg0, arg4 + var15 - var27 - 1, arg0 - -arg3, var15 + arg4 + 5);
                    class161.field2244.method858(-3700, var23, -16777216, arg4 + var15 + var26, arg0 + var14, var18);
                    class196.field2965.method436(arg0, arg4, arg0 + arg3, arg1 + arg4);
                }
            } else {
                class161.field2244.method858(-3700, -256, -16777216, arg4 + var15, arg0 + var14, var18);
            }
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(B)V")
    public static void method1896(byte arg0) {
        field4686 = null;
        field4685 = null;
        if (arg0 < 79) {
            method1896((byte) 93);
        }
    }

    static {
        new class151("You have been temporarily muted due to breaking a rule.", "Aufgrund eines Regelverstoßes wurdest du vorübergehend stumm geschaltet.", "La messagerie instantanée a été temporairement bloquée suite à une infraction.", "Você foi temporariamente vetado por ter violado uma regra.");
        field4686 = new class151("Please wait...", "Bitte warte...", "Veuillez patienter...", "Aguarde...");
    }
}
