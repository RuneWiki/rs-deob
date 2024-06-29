import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class65 {

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "Lea;")
    public static class38 field1548 = class9.method46((byte) 124, "<col=ffb000>");

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "Lea;")
    public static class38 field1550 = class9.method46((byte) 101, "Sichtbare Karte vorbereitet)3");

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field1551 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!hb", name = "k", descriptor = "Lea;")
    private static class38 field1557 = class9.method46((byte) 120, "Press (Wchange your password(W on front page)3");

    @OriginalMember(owner = "client!hb", name = "j", descriptor = "[I")
    public static int[] field1556 = new int[2048];

    @OriginalMember(owner = "client!hb", name = "m", descriptor = "Lea;")
    private static class38 field1559 = class9.method46((byte) 106, "Unexpected server response)3");

    @OriginalMember(owner = "client!hb", name = "p", descriptor = "Lea;")
    public static class38 field1562 = field1559;

    @OriginalMember(owner = "client!hb", name = "o", descriptor = "Lea;")
    public static class38 field1561 = class9.method46((byte) 125, "mapmarker");

    @OriginalMember(owner = "client!hb", name = "n", descriptor = "Lea;")
    public static class38 field1560 = class9.method46((byte) 103, "Suche nach Updates )2 ");

    @OriginalMember(owner = "client!hb", name = "l", descriptor = "J")
    public static long field1558 = 0L;

    @OriginalMember(owner = "client!hb", name = "r", descriptor = "Lea;")
    public static class38 field1564 = field1557;

    @OriginalMember(owner = "client!hb", name = "q", descriptor = "[I")
    public static int[] field1563 = new int[5];

    @OriginalMember(owner = "client!hb", name = "s", descriptor = "Lea;")
    public static class38 field1565 = class9.method46((byte) 126, "gleiten:");

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "I")
    public int field1547;

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "I")
    public static int field1549;

    @OriginalMember(owner = "client!hb", name = "f", descriptor = "I")
    public static int field1552;

    @OriginalMember(owner = "client!hb", name = "g", descriptor = "I")
    public static int field1553;

    @OriginalMember(owner = "client!hb", name = "h", descriptor = "I")
    public int field1554;

    @OriginalMember(owner = "client!hb", name = "i", descriptor = "I")
    public int field1555;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V")
    public static void method457(int arg0) {
        field1562 = null;
        field1556 = null;
        field1557 = null;
        field1550 = null;
        field1548 = null;
        if (arg0 != 28345) {
            field1558 = 99L;
        }
        field1551 = null;
        field1565 = null;
        field1564 = null;
        field1563 = null;
        field1561 = null;
        field1560 = null;
        field1559 = null;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ZLjava/lang/Object;I)[B")
    public static final byte[] method458(boolean arg0, Object arg1, int arg2) {
        field1549++;
        if (arg1 == null) {
            return null;
        } else if (arg1 instanceof byte[]) {
            byte[] var3 = (byte[]) arg1;
            return arg0 ? class103.method841(var3, (byte) 7) : var3;
        } else if (arg1 instanceof class160) {
            class160 var4 = (class160) arg1;
            return var4.method703(-1);
        } else {
            if (arg2 != -9) {
                method460(-91, -92, -45);
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIIIIBI[Lef;)V")
    public static final void method459(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, class43[] arg8) {
        field1553++;
        int var9 = 110 / ((-arg6 - 83) / 37);
        for (int var10 = 0; var10 < arg8.length; var10++) {
            class43 var11 = arg8[var10];
            if (var11 != null && (!var11.field985 || var11.field965 == 0 || var11.field1063 || class40.method299(var11, 25) != 0 || class179.field3625 == var11) && var11.field1005 == arg5 && (!var11.field985 || !class156.method1085(0, var11))) {
                int var12 = var11.field940 + arg2;
                int var13 = var11.field1026 + arg3;
                if (class45.field1094 == var11) {
                    class40.field886 = var13;
                    class36.field762 = var12;
                    class62.field1504 = true;
                }
                int var20;
                int var21;
                int var22;
                int var23;
                if (var11.field965 == 2) {
                    var23 = arg7;
                    var21 = arg1;
                    var20 = arg0;
                    var22 = arg4;
                } else if (var11.field965 == 9) {
                    int var14 = var13;
                    int var15 = var12;
                    int var16 = var12 + var11.field1052;
                    int var17 = var11.field964 + var13;
                    if (var12 > var16) {
                        var15 = var16;
                        var16 = var12;
                    }
                    var16++;
                    if (var13 > var17) {
                        var14 = var17;
                        var17 = var13;
                    }
                    var20 = arg0 > var16 ? var16 : arg0;
                    var21 = var14 <= arg1 ? arg1 : var14;
                    var22 = var15 > arg4 ? var15 : arg4;
                    var17++;
                    var23 = var17 < arg7 ? var17 : arg7;
                } else {
                    var21 = var13 > arg1 ? var13 : arg1;
                    var22 = var12 > arg4 ? var12 : arg4;
                    int var24 = var11.field1052 + var12;
                    int var25 = var11.field964 + var13;
                    var23 = var25 >= arg7 ? arg7 : var25;
                    var20 = arg0 <= var24 ? arg0 : var24;
                }
                if (!var11.field985 || var20 > var22 && var23 > var21) {
                    if (var11.field987 == 1337) {
                        class172.method1209(var11, -1);
                    } else if (var11.field987 == 1338) {
                        class192.method1279(var12, 75, var13);
                    } else {
                        if (var11.field965 == 0) {
                            if (!var11.field985 && class156.method1085(0, var11) && class111.field2489 != var11) {
                                continue;
                            }
                            method459(var20, var21, var12 - var11.field982, var13 - var11.field1043, var22, var11.field1013, (byte) -124, var23, arg8);
                            if (var11.field1061 != null) {
                                method459(var20, var21, var12 - var11.field982, -var11.field1043 + var13, var22, var11.field1013, (byte) 7, var23, var11.field1061);
                            }
                            class42 var26 = (class42) class177.field3580.method183((byte) 106, (long) var11.field1013);
                            if (var26 != null) {
                                class3.method15(var21, var26.field921, var12, var13, var20, var22, -91, var23);
                            }
                        }
                        if (var11.field985) {
                            boolean var27;
                            if (var22 <= class176.field3568 && class10.field222 >= var21 && var20 > class176.field3568 && var23 > class10.field222) {
                                var27 = true;
                            } else {
                                var27 = false;
                            }
                            boolean var28 = false;
                            boolean var29 = false;
                            if (class146.field3038 == 1 && var27) {
                                var29 = true;
                            }
                            if (class165.field3424 == 1 && class87.field2029 >= var22 && var21 <= class105.field2345 && var20 > class87.field2029 && var23 > class105.field2345) {
                                var28 = true;
                            }
                            if (var28) {
                                class203.method1332(class87.field2029 - var12, var11, (byte) -69, class105.field2345 - var13);
                            }
                            if (class45.field1094 != null && class45.field1094 != var11 && var27 && class96.method804(-124, class40.method299(var11, 25))) {
                                class140.field2931 = var11;
                            }
                            if (class179.field3625 == var11) {
                                class144.field3006 = var12;
                                class86.field2011 = true;
                                class145.field3032 = var13;
                            }
                            if (var11.field1063) {
                                if (var27 && class102.field2288 != 0 && var11.field1066 != null) {
                                    class48 var30 = new class48();
                                    var30.field1151 = class102.field2288;
                                    var30.field1166 = var11.field1066;
                                    var30.field1153 = var11;
                                    class132.field2806.method1014((byte) -123, var30);
                                }
                                if (class45.field1094 != null || class203.field4007 != null || class169.field3482) {
                                    var27 = false;
                                    var29 = false;
                                    var28 = false;
                                }
                                if (!var11.field1038 && var28) {
                                    var11.field1038 = true;
                                    if (var11.field1041 != null) {
                                        class48 var31 = new class48();
                                        var31.field1166 = var11.field1041;
                                        var31.field1155 = class87.field2029 - var12;
                                        var31.field1153 = var11;
                                        var31.field1151 = class105.field2345 - var13;
                                        class132.field2806.method1014((byte) -114, var31);
                                    }
                                }
                                if (var11.field1038 && var29 && var11.field1004 != null) {
                                    class48 var32 = new class48();
                                    var32.field1166 = var11.field1004;
                                    var32.field1151 = class10.field222 - var13;
                                    var32.field1153 = var11;
                                    var32.field1155 = class176.field3568 - var12;
                                    class132.field2806.method1014((byte) -125, var32);
                                }
                                if (var11.field1038 && !var29) {
                                    var11.field1038 = false;
                                    if (var11.field1029 != null) {
                                        class48 var33 = new class48();
                                        var33.field1155 = class176.field3568 - var12;
                                        var33.field1151 = class10.field222 - var13;
                                        var33.field1153 = var11;
                                        var33.field1166 = var11.field1029;
                                        class41.field899.method1014((byte) -109, var33);
                                    }
                                }
                                if (var29 && var11.field1036 != null) {
                                    class48 var34 = new class48();
                                    var34.field1155 = class176.field3568 - var12;
                                    var34.field1151 = class10.field222 - var13;
                                    var34.field1166 = var11.field1036;
                                    var34.field1153 = var11;
                                    class132.field2806.method1014((byte) -113, var34);
                                }
                                if (!var11.field1050 && var27) {
                                    var11.field1050 = true;
                                    if (var11.field1040 != null) {
                                        class48 var35 = new class48();
                                        var35.field1153 = var11;
                                        var35.field1166 = var11.field1040;
                                        var35.field1151 = class10.field222 - var13;
                                        var35.field1155 = class176.field3568 - var12;
                                        class132.field2806.method1014((byte) -107, var35);
                                    }
                                }
                                if (var11.field1050 && var27 && var11.field977 != null) {
                                    class48 var36 = new class48();
                                    var36.field1155 = class176.field3568 - var12;
                                    var36.field1153 = var11;
                                    var36.field1151 = class10.field222 - var13;
                                    var36.field1166 = var11.field977;
                                    class132.field2806.method1014((byte) -119, var36);
                                }
                                if (var11.field1050 && !var27) {
                                    var11.field1050 = false;
                                    if (var11.field966 != null) {
                                        class48 var37 = new class48();
                                        var37.field1153 = var11;
                                        var37.field1155 = class176.field3568 - var12;
                                        var37.field1166 = var11.field966;
                                        var37.field1151 = class10.field222 - var13;
                                        class41.field899.method1014((byte) -110, var37);
                                    }
                                }
                                if (var11.field929 != null) {
                                    class48 var38 = new class48();
                                    var38.field1166 = var11.field929;
                                    var38.field1153 = var11;
                                    class84.field1975.method1014((byte) -120, var38);
                                }
                                if (var11.field958 != null && var11.field993 < class62.field1510) {
                                    if (var11.field1055 == null || class62.field1510 - var11.field993 > 32) {
                                        class48 var43 = new class48();
                                        var43.field1153 = var11;
                                        var43.field1166 = var11.field958;
                                        class132.field2806.method1014((byte) -125, var43);
                                    } else {
                                        label379: for (int var39 = var11.field993; var39 < class62.field1510; var39++) {
                                            int var40 = class10.field226[var39 & 0x1F];
                                            for (int var41 = 0; var41 < var11.field1055.length; var41++) {
                                                if (var11.field1055[var41] == var40) {
                                                    class48 var42 = new class48();
                                                    var42.field1166 = var11.field958;
                                                    var42.field1153 = var11;
                                                    class132.field2806.method1014((byte) -128, var42);
                                                    break label379;
                                                }
                                            }
                                        }
                                    }
                                    var11.field993 = class62.field1510;
                                }
                                if (var11.field957 != null && class55.field1393 > var11.field1039) {
                                    if (var11.field942 == null || class55.field1393 - var11.field1039 > 32) {
                                        class48 var48 = new class48();
                                        var48.field1166 = var11.field957;
                                        var48.field1153 = var11;
                                        class132.field2806.method1014((byte) -103, var48);
                                    } else {
                                        label359: for (int var44 = var11.field1039; var44 < class55.field1393; var44++) {
                                            int var45 = class51.field1310[var44 & 0x1F];
                                            for (int var46 = 0; var46 < var11.field942.length; var46++) {
                                                if (var11.field942[var46] == var45) {
                                                    class48 var47 = new class48();
                                                    var47.field1166 = var11.field957;
                                                    var47.field1153 = var11;
                                                    class132.field2806.method1014((byte) -116, var47);
                                                    break label359;
                                                }
                                            }
                                        }
                                    }
                                    var11.field1039 = class55.field1393;
                                }
                                if (var11.field1027 != null && class17.field350 > var11.field1010) {
                                    if (var11.field986 == null || class17.field350 - var11.field1010 > 32) {
                                        class48 var53 = new class48();
                                        var53.field1166 = var11.field1027;
                                        var53.field1153 = var11;
                                        class132.field2806.method1014((byte) -99, var53);
                                    } else {
                                        label339: for (int var49 = var11.field1010; var49 < class17.field350; var49++) {
                                            int var50 = class171.field3507[var49 & 0x1F];
                                            for (int var51 = 0; var51 < var11.field986.length; var51++) {
                                                if (var11.field986[var51] == var50) {
                                                    class48 var52 = new class48();
                                                    var52.field1153 = var11;
                                                    var52.field1166 = var11.field1027;
                                                    class132.field2806.method1014((byte) -118, var52);
                                                    break label339;
                                                }
                                            }
                                        }
                                    }
                                    var11.field1010 = class17.field350;
                                }
                                if (class179.field3620 > var11.field1046 && var11.field973 != null) {
                                    class48 var54 = new class48();
                                    var54.field1166 = var11.field973;
                                    var54.field1153 = var11;
                                    class132.field2806.method1014((byte) -113, var54);
                                }
                                if (var11.field1046 < class181.field3653 && var11.field939 != null) {
                                    class48 var55 = new class48();
                                    var55.field1166 = var11.field939;
                                    var55.field1153 = var11;
                                    class132.field2806.method1014((byte) -119, var55);
                                }
                                if (class111.field2478 > var11.field1046 && var11.field968 != null) {
                                    class48 var56 = new class48();
                                    var56.field1153 = var11;
                                    var56.field1166 = var11.field968;
                                    class132.field2806.method1014((byte) -126, var56);
                                }
                                if (class42.field926 > var11.field1046 && var11.field938 != null) {
                                    class48 var57 = new class48();
                                    var57.field1166 = var11.field938;
                                    var57.field1153 = var11;
                                    class132.field2806.method1014((byte) -106, var57);
                                }
                                if (class205.field4040 > var11.field1046 && var11.field963 != null) {
                                    class48 var58 = new class48();
                                    var58.field1166 = var11.field963;
                                    var58.field1153 = var11;
                                    class132.field2806.method1014((byte) -116, var58);
                                }
                                var11.field1046 = class192.field3796;
                                if (var11.field960 != null) {
                                    for (int var59 = 0; var59 < class103.field2322; var59++) {
                                        class48 var60 = new class48();
                                        var60.field1153 = var11;
                                        var60.field1156 = class38.field811[var59];
                                        var60.field1157 = class88.field2042[var59];
                                        var60.field1166 = var11.field960;
                                        class132.field2806.method1014((byte) -121, var60);
                                    }
                                }
                            }
                        }
                        if (!var11.field985) {
                            if (class45.field1094 != null || class203.field4007 != null || class169.field3482) {
                                return;
                            }
                            if ((var11.field1025 >= 0 || var11.field1007 != 0) && var22 <= class176.field3568 && var21 <= class10.field222 && class176.field3568 < var20 && var23 > class10.field222) {
                                if (var11.field1025 >= 0) {
                                    class111.field2489 = arg8[var11.field1025];
                                } else {
                                    class111.field2489 = var11;
                                }
                            }
                            if (var11.field965 == 8 && class176.field3568 >= var22 && class10.field222 >= var21 && class176.field3568 < var20 && class10.field222 < var23) {
                                class50.field1251 = var11;
                            }
                            if (var11.field959 > var11.field964) {
                                class197.method1299(var11, var11.field1052 + var12, 34, var11.field964, var11.field959, class176.field3568, var13, class10.field222);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(III)V")
    public static final void method460(int arg0, int arg1, int arg2) {
        field1552++;
        if (class53.method385(arg0, 27323) && arg2 < -123) {
            class205.method1340(-7251, class168.field3461[arg0], arg1);
        }
    }
}
