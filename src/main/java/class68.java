import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public abstract class class68 {

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "I")
    public static int field1083 = 1;

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "Ljava/lang/String;")
    public static String field1085 = "Your friend list is full. Max of 100 for free users, and 200 for members.";

    @OriginalMember(owner = "client!ri", name = "e", descriptor = "[I")
    public static int[] field1087 = new int[50];

    @OriginalMember(owner = "client!ri", name = "i", descriptor = "I")
    public static int field1091 = 0;

    @OriginalMember(owner = "client!ri", name = "h", descriptor = "[I")
    public static int[] field1090 = new int[2500];

    @OriginalMember(owner = "client!ri", name = "g", descriptor = "I")
    public static int field1089 = -1;

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "I")
    public static int field1086;

    @OriginalMember(owner = "client!ri", name = "f", descriptor = "I")
    public static int field1088;

    @OriginalMember(owner = "client!ri", name = "j", descriptor = "Lda;")
    public static class198 field1092;

    @OriginalMember(owner = "client!ri", name = "k", descriptor = "[Lom;")
    public static class90[] field1093;

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "[[[B")
    public static byte[][][] field1084;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "([BB)V")
    public abstract void method85(byte[] arg0, byte arg1);

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Z)[B")
    public abstract byte[] method86(boolean arg0);

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIIIIBI)V")
    public static final void method468(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        class280.field4555 = 0;
        field1086++;
        for (int var7 = -1; var7 < class134.field2172 + class91.field1439; var7++) {
            class62 var23;
            if (var7 == -1) {
                var23 = class217.field3408;
            } else if (var7 < class134.field2172) {
                var23 = class28.field494[class111.field1708[var7]];
            } else {
                var23 = class131.field2113[class34.field556[var7 - class134.field2172]];
            }
            if (var23 != null && var23.method104(-32447)) {
                if (var23 instanceof class104) {
                    class242 var24 = ((class104) var23).field1645;
                    if (var24.field3779 != null) {
                        var24 = var24.method1649(false);
                    }
                    if (var24 == null) {
                        continue;
                    }
                }
                if (var7 >= class134.field2172) {
                    class242 var30 = ((class104) var23).field1645;
                    if (var30.field3779 != null) {
                        var30 = var30.method1649(false);
                    }
                    if (var30.field3784 >= 0 && var30.field3784 < class50.field732.length) {
                        int var31;
                        if (var30.field3813 == -1) {
                            var31 = var23.method402(true) + 15;
                        } else {
                            var31 = var30.field3813 + 15;
                        }
                        class300.method2060(arg0, arg6, var31, var23, arg4 >> 1, arg2 >> 1, (byte) -49);
                        if (class292.field4792 > -1) {
                            class50.field732[var30.field3784].method451(class292.field4792 + arg3 - 12, class145.field2325 + arg1 + -30);
                        }
                    }
                    class43[] var32 = class168.field2768;
                    for (int var33 = 0; var33 < var32.length; var33++) {
                        class43 var48 = var32[var33];
                        if (var48 != null && var48.field638 == 1 && class34.field556[var7 - class134.field2172] == var48.field642 && (class274.field4472 % 20) < 10) {
                            int var49;
                            if (var30.field3813 == -1) {
                                var49 = var23.method402(true) + 15;
                            } else {
                                var49 = var30.field3813 + 15;
                            }
                            class300.method2060(arg0, arg6, var49, var23, arg4 >> 1, arg2 >> 1, (byte) -94);
                            if (class292.field4792 > -1) {
                                class273.field4401[var48.field646].method451(arg3 + class292.field4792 - 12, class145.field2325 + arg1 - 28);
                            }
                        }
                    }
                } else {
                    int var25 = 30;
                    class12 var26 = (class12) var23;
                    if (var26.field221 != -1 || var26.field220 != -1) {
                        class300.method2060(arg0, arg6, var23.method402(true) + 15, var23, arg4 >> 1, arg2 >> 1, (byte) -82);
                        if (class292.field4792 > -1) {
                            if (var26.field221 != -1) {
                                class300.field4926[var26.field221].method451(arg3 + class292.field4792 - 12, arg1 - var25 + class145.field2325);
                                var25 += 25;
                            }
                            if (var26.field220 != -1) {
                                class50.field732[var26.field220].method451(class292.field4792 + arg3 - 12, -var25 + class145.field2325 + arg1);
                                var25 += 25;
                            }
                        }
                    }
                    if (var7 >= 0) {
                        class43[] var27 = class168.field2768;
                        for (int var28 = 0; var28 < var27.length; var28++) {
                            class43 var29 = var27[var28];
                            if (var29 != null && var29.field638 == 10 && class111.field1708[var7] == var29.field642) {
                                class300.method2060(arg0, arg6, var23.method402(true) + 15, var23, arg4 >> 1, arg2 >> 1, (byte) -43);
                                if (class292.field4792 > -1) {
                                    class273.field4401[var29.field646].method451(class292.field4792 + arg3 - 12, arg1 - -class145.field2325 - var25);
                                }
                            }
                        }
                    }
                }
                if (var23.field974 != null && (var7 >= class134.field2172 || class203.field3287 == 0 || class203.field3287 == 3 || class203.field3287 == 1 && class119.method817(arg5 ^ 0x31A6, ((class12) var23).field222))) {
                    class300.method2060(arg0, arg6, var23.method402(true), var23, arg4 >> 1, arg2 >> 1, (byte) -74);
                    if (class292.field4792 > -1 && class210.field3348 > class280.field4555) {
                        class210.field3339[class280.field4555] = class170.field2792.method527(var23.field974) / 2;
                        class210.field3342[class280.field4555] = class170.field2792.field1178;
                        class210.field3350[class280.field4555] = class292.field4792;
                        class210.field3352[class280.field4555] = class145.field2325;
                        class210.field3344[class280.field4555] = var23.field935;
                        class210.field3354[class280.field4555] = var23.field950;
                        class210.field3355[class280.field4555] = var23.field914;
                        class210.field3351[class280.field4555] = var23.field974;
                        class280.field4555++;
                    }
                }
                if (class274.field4472 < var23.field937) {
                    class292 var34 = class119.field1880[0];
                    class292 var35 = class119.field1880[1];
                    int var39;
                    if (var23 instanceof class104) {
                        class104 var36 = (class104) var23;
                        class292[] var37 = (class292[]) class52.field762.method1879(8887, (long) var36.field1645.field3777);
                        if (var37 == null) {
                            var37 = class27.method210(class118.field1844, -88, var36.field1645.field3777, 0);
                            if (var37 != null) {
                                class52.field762.method1883((long) var36.field1645.field3777, 28, var37);
                            }
                        }
                        if (var37 != null && var37.length == 2) {
                            var35 = var37[1];
                            var34 = var37[0];
                        }
                        class242 var38 = var36.field1645;
                        if (var38.field3813 == -1) {
                            var39 = var23.method402(true);
                        } else {
                            var39 = var38.field3813;
                        }
                    } else {
                        var39 = var23.method402(true);
                    }
                    class300.method2060(arg0, arg6, var39 + var34.field4780 + 10, var23, arg4 >> 1, arg2 >> 1, (byte) -122);
                    if (class292.field4792 > -1) {
                        int var40 = class292.field4792 + arg3 - (var34.field4784 >> 1);
                        int var41 = class145.field2325 + arg1 - 3;
                        var34.method451(var40, var41);
                        int var42 = var23.field949 * var34.field4784 / 255;
                        int var43 = var34.field4780;
                        class94.method673(var40, var41, var40 + var42, var41 + var43);
                        var35.method451(var40, var41);
                        class94.method676(arg3, arg1, arg3 + arg2, arg1 - -arg4);
                    }
                }
                for (int var44 = 0; var44 < 4; var44++) {
                    if (var23.field902[var44] > class274.field4472) {
                        int var47;
                        if (var23 instanceof class104) {
                            class104 var45 = (class104) var23;
                            class242 var46 = var45.field1645;
                            if (var46.field3813 == -1) {
                                var47 = var23.method402(true) / 2;
                            } else {
                                var47 = var46.field3813 / 2;
                            }
                        } else {
                            var47 = var23.method402(true) / 2;
                        }
                        class300.method2060(arg0, arg6, var47, var23, arg4 >> 1, arg2 >> 1, (byte) -99);
                        if (class292.field4792 > -1) {
                            if (var44 == 1) {
                                class145.field2325 -= 20;
                            }
                            if (var44 == 2) {
                                class145.field2325 -= 10;
                                class292.field4792 -= 15;
                            }
                            if (var44 == 3) {
                                class145.field2325 -= 10;
                                class292.field4792 += 15;
                            }
                            class135.field2187[var23.field988[var44]].method451(class292.field4792 + arg3 - 12, arg1 - -class145.field2325 + -12);
                            class183.field3043.method510(Integer.toString(var23.field932[var44]), class292.field4792 + arg3 - 1, class145.field2325 + arg1 - -3, 16777215, 0);
                        }
                    }
                }
            }
        }
        for (int var8 = 0; var8 < class280.field4555; var8++) {
            int var9 = class210.field3350[var8];
            int var10 = class210.field3339[var8];
            int var11 = class210.field3342[var8];
            int var12 = class210.field3352[var8];
            boolean var13 = true;
            while (var13) {
                var13 = false;
                for (int var22 = 0; var22 < var8; var22++) {
                    if (class210.field3352[var22] - class210.field3342[var22] < var12 + 2 && (var12 - var11) < (class210.field3352[var22] + 2) && (class210.field3350[var22] + class210.field3339[var22]) > (var9 - var10) && class210.field3350[var22] - class210.field3339[var22] < var9 + var10 && var12 > class210.field3352[var22] - class210.field3342[var22]) {
                        var13 = true;
                        var12 = class210.field3352[var22] - class210.field3342[var22];
                    }
                }
            }
            class292.field4792 = class210.field3350[var8];
            class145.field2325 = class210.field3352[var8] = var12;
            String var14 = class210.field3351[var8];
            if (class72.field1154 == 0) {
                int var15 = 16776960;
                if (class210.field3344[var8] < 6) {
                    var15 = class230.field3605[class210.field3344[var8]];
                }
                if (class210.field3344[var8] == 6) {
                    var15 = (class89.field1384 % 20) >= 10 ? 16776960 : 16711680;
                }
                if (class210.field3344[var8] == 7) {
                    var15 = class89.field1384 % 20 < 10 ? 255 : 65535;
                }
                if (class210.field3344[var8] == 8) {
                    var15 = class89.field1384 % 20 < 10 ? 45056 : 8454016;
                }
                if (class210.field3344[var8] == 9) {
                    int var16 = 150 - class210.field3355[var8];
                    if (var16 < 50) {
                        var15 = (var16 * 1280) + 16711680;
                    } else if (var16 < 100) {
                        var15 = 33160960 - (var16 * 327680);
                    } else if (var16 < 150) {
                        var15 = (var16 * 5) + 65280 - 500;
                    }
                }
                if (class210.field3344[var8] == 10) {
                    int var17 = 150 - class210.field3355[var8];
                    if (var17 < 50) {
                        var15 = var17 * 5 + 16711680;
                    } else if (var17 < 100) {
                        var15 = 16711935 - ((var17 - 50) * 327680);
                    } else if (var17 < 150) {
                        var15 = (-32768000 - -(var17 * 327680)) + 255 - (var17 * 5 - 500);
                    }
                }
                if (class210.field3344[var8] == 11) {
                    int var18 = 150 - class210.field3355[var8];
                    if (var18 < 50) {
                        var15 = 16777215 - var18 * 327685;
                    } else if (var18 < 100) {
                        var15 = var18 * 327685 + 65280 - 16384250;
                    } else if (var18 < 150) {
                        var15 = 16777215 - ((var18 - 100) * 327680);
                    }
                }
                if (class210.field3354[var8] == 0) {
                    class170.field2792.method510(var14, class292.field4792 + arg3, class145.field2325 + arg1, var15, 0);
                }
                if (class210.field3354[var8] == 1) {
                    class170.field2792.method532(var14, arg3 + class292.field4792, class145.field2325 + arg1, var15, 0, class89.field1384);
                }
                if (class210.field3354[var8] == 2) {
                    class170.field2792.method526(var14, class292.field4792 + arg3, arg1 - -class145.field2325, var15, 0, class89.field1384);
                }
                if (class210.field3354[var8] == 3) {
                    class170.field2792.method518(var14, class292.field4792 + arg3, class145.field2325 + arg1, var15, 0, class89.field1384, 150 - class210.field3355[var8]);
                }
                if (class210.field3354[var8] == 4) {
                    int var19 = (150 - class210.field3355[var8]) * (class170.field2792.method527(var14) + 100) / 150;
                    class94.method673(arg3 + class292.field4792 - 50, arg1, arg3 - (-class292.field4792 - 50), arg1 + arg4);
                    class170.field2792.method505(var14, arg3 + class292.field4792 - (var19 - 50), class145.field2325 + arg1, var15, 0);
                    class94.method676(arg3, arg1, arg3 + arg2, arg1 + arg4);
                }
                if (class210.field3354[var8] == 5) {
                    int var20 = 150 - class210.field3355[var8];
                    class94.method673(arg3, class145.field2325 + arg1 - class170.field2792.field1178 - 1, arg2 + arg3, arg1 + class145.field2325 + 5);
                    int var21 = 0;
                    if (var20 < 25) {
                        var21 = var20 - 25;
                    } else if (var20 > 125) {
                        var21 = var20 - 125;
                    }
                    class170.field2792.method510(var14, class292.field4792 + arg3, arg1 - -class145.field2325 + var21, var15, 0);
                    class94.method676(arg3, arg1, arg2 + arg3, arg1 - -arg4);
                }
            } else {
                class170.field2792.method510(var14, class292.field4792 + arg3, arg1 - -class145.field2325, 16776960, 0);
            }
        }
        if (arg5 != -58) {
            field1085 = null;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)V")
    public static void method469(int arg0) {
        field1085 = null;
        field1084 = null;
        field1093 = null;
        if (arg0 != 0) {
            field1088 = 2;
        }
        field1090 = null;
        field1092 = null;
        field1087 = null;
    }
}
