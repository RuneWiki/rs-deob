import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class56 {

    @OriginalMember(owner = "client!df", name = "c", descriptor = "I")
    public static int field892 = 0;

    @OriginalMember(owner = "client!df", name = "e", descriptor = "Ljava/lang/String;")
    public static String field894 = "flash1:";

    @OriginalMember(owner = "client!df", name = "i", descriptor = "I")
    public static int field898 = 0;

    @OriginalMember(owner = "client!df", name = "j", descriptor = "Lrf;")
    public static class289 field899 = null;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "I")
    public static int field890;

    @OriginalMember(owner = "client!df", name = "b", descriptor = "I")
    public static int field891;

    @OriginalMember(owner = "client!df", name = "d", descriptor = "I")
    public static int field893;

    @OriginalMember(owner = "client!df", name = "f", descriptor = "I")
    public static int field895;

    @OriginalMember(owner = "client!df", name = "g", descriptor = "I")
    public static int field896;

    @OriginalMember(owner = "client!df", name = "h", descriptor = "I")
    public static int field897;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I[Lrf;I)V")
    public static final void method379(int arg0, class289[] arg1, int arg2) {
        for (int var3 = 0; var3 < arg1.length; var3++) {
            class289 var4 = arg1[var3];
            if (var4 != null && var4.field4451 == arg2 && (!var4.field4495 || !client.method967(var4))) {
                if (var4.field4394 == 0) {
                    if (!var4.field4495 && client.method967(var4) && class76.field1233 != var4) {
                        continue;
                    }
                    method379(150, arg1, var4.field4504);
                    if (var4.field4472 != null) {
                        method379(150, var4.field4472, var4.field4504);
                    }
                    class199 var5 = (class199) class229.field3449.method1666((long) var4.field4504, (byte) -102);
                    if (var5 != null) {
                        class266.method1771(var5.field3026, (byte) -78);
                    }
                }
                if (var4.field4394 == 6) {
                    if (var4.field4542 != -1 || var4.field4476 != -1) {
                        boolean var6 = class177.method1095(var4, (byte) 123);
                        int var7;
                        if (var6) {
                            var7 = var4.field4476;
                        } else {
                            var7 = var4.field4542;
                        }
                        if (var7 != -1) {
                            class215 var8 = class276.method1829(var7, 29223);
                            if (var8 != null) {
                                var4.field4397 += class180.field2741;
                                while (var4.field4397 > var8.field3219[var4.field4395]) {
                                    var4.field4397 -= var8.field3219[var4.field4395];
                                    var4.field4395++;
                                    if (var8.field3215.length <= var4.field4395) {
                                        var4.field4395 -= var8.field3218;
                                        if (var4.field4395 < 0 || var4.field4395 >= var8.field3215.length) {
                                            var4.field4395 = 0;
                                        }
                                    }
                                    var4.field4521 = var4.field4395 + 1;
                                    if (var8.field3215.length <= var4.field4521) {
                                        var4.field4521 -= var8.field3218;
                                        if (var4.field4521 < 0 || var4.field4521 >= var8.field3215.length) {
                                            var4.field4521 = -1;
                                        }
                                    }
                                    class295.method1980(var4, arg0 ^ 0x96);
                                }
                            }
                        }
                    }
                    if (var4.field4405 != 0 && !var4.field4495) {
                        int var9 = var4.field4405 << 16 >> 16;
                        int var10 = class180.field2741 * var9;
                        int var11 = var4.field4405 >> 16;
                        var4.field4434 = var4.field4434 + var10 & 0x7FF;
                        int var12 = class180.field2741 * var11;
                        var4.field4531 = var4.field4531 + var12 & 0x7FF;
                        class295.method1980(var4, 0);
                    }
                }
            }
        }
        if (arg0 != 150) {
            field892 = 80;
        }
        field896++;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(II)V")
    public static final void method380(int arg0, int arg1) {
        class99.field1560.method1780(arg0, true);
        class265.field3992.method1780(arg0, true);
        field895++;
        class191.field2931.method1780(arg0, true);
        if (arg1 != -32479) {
            field899 = null;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(ILjava/lang/String;I)V")
    public static final void method381(int arg0, String arg1, int arg2) {
        field893++;
        class196.field2979.method1106(arg0, false);
        class102.field1604++;
        class196.field2979.method1568(arg2, (byte) 49);
        class196.field2979.method1584(false, class94.method604((byte) 77, arg1));
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIIIII)V")
    public static final void method382(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg1 - arg3;
        int var8 = arg2 + arg3;
        int var9 = arg3 + arg4;
        int var10 = arg0 - arg3;
        int var11 = arg2;
        if (arg5 != 0) {
            return;
        }
        while (var11 < var8) {
            class64.method429(class23.field284[var11], arg4, (byte) 119, arg6, arg0);
            var11++;
        }
        field890++;
        for (int var12 = arg1; var12 > var7; var12--) {
            class64.method429(class23.field284[var12], arg4, (byte) 113, arg6, arg0);
        }
        for (int var13 = var8; var13 <= var7; var13++) {
            int[] var14 = class23.field284[var13];
            class64.method429(var14, arg4, (byte) 112, arg6, var9);
            class64.method429(var14, var10, (byte) 112, arg6, arg0);
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIIIIB)V")
    public static final void method383(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        field897++;
        class116.field1770 = 0;
        for (int var7 = -1; var7 < (class141.field2069 + class24.field295); var7++) {
            class153 var23;
            if (var7 == -1) {
                var23 = class165.field2537;
            } else if (class141.field2069 > var7) {
                var23 = class96.field1521[class58.field918[var7]];
            } else {
                var23 = class18.field220[class169.field2586[var7 - class141.field2069]];
            }
            if (var23 != null && var23.method414(1000)) {
                if (var23 instanceof class61) {
                    class72 var24 = ((class61) var23).field959;
                    if (var24.field1196 != null) {
                        var24 = var24.method487(-1);
                    }
                    if (var24 == null) {
                        continue;
                    }
                }
                if (class141.field2069 <= var7) {
                    class72 var30 = ((class61) var23).field959;
                    if (var30.field1196 != null) {
                        var30 = var30.method487(arg6 ^ 0xFFFFFF96);
                    }
                    if (var30.field1184 >= 0 && var30.field1184 < class42.field616.length) {
                        int var31;
                        if (var30.field1195 == -1) {
                            var31 = var23.method927(200) + 15;
                        } else {
                            var31 = var30.field1195 + 15;
                        }
                        class18.method128(arg2 >> 1, arg1, (byte) 113, var23, arg5, arg3 >> 1, var31);
                        if (class3.field65 > -1) {
                            class42.field616[var30.field1184].method1274(class3.field65 + arg0 - 12, arg4 + -30 + class262.field3971);
                        }
                    }
                    class93[] var32 = class101.field1591;
                    for (int var33 = 0; var33 < var32.length; var33++) {
                        class93 var48 = var32[var33];
                        if (var48 != null && var48.field1466 == 1 && class169.field2586[var7 - class141.field2069] == var48.field1471 && class270.field4058 % 20 < 10) {
                            int var49;
                            if (var30.field1195 == -1) {
                                var49 = var23.method927(arg6 ^ 0xA1) + 15;
                            } else {
                                var49 = var30.field1195 + 15;
                            }
                            class18.method128(arg2 >> 1, arg1, (byte) 113, var23, arg5, arg3 >> 1, var49);
                            if (class3.field65 > -1) {
                                class112.field1723[var48.field1473].method1274(class3.field65 + arg0 - 12, arg4 + -28 - -class262.field3971);
                            }
                        }
                    }
                } else {
                    int var25 = 30;
                    class107 var26 = (class107) var23;
                    if (var26.field1661 != -1 || var26.field1664 != -1) {
                        class18.method128(arg2 >> 1, arg1, (byte) 113, var23, arg5, arg3 >> 1, var23.method927(200) + 15);
                        if (class3.field65 > -1) {
                            if (var26.field1661 != -1) {
                                class91.field1439[var26.field1661].method1274(class3.field65 + arg0 - 12, -var25 + arg4 + class262.field3971);
                                var25 += 25;
                            }
                            if (var26.field1664 != -1) {
                                class42.field616[var26.field1664].method1274(arg0 - (12 - class3.field65), arg4 - (-class262.field3971 - -var25));
                                var25 += 25;
                            }
                        }
                    }
                    if (var7 >= 0) {
                        class93[] var27 = class101.field1591;
                        for (int var28 = 0; var28 < var27.length; var28++) {
                            class93 var29 = var27[var28];
                            if (var29 != null && var29.field1466 == 10 && class58.field918[var7] == var29.field1471) {
                                class18.method128(arg2 >> 1, arg1, (byte) 113, var23, arg5, arg3 >> 1, var23.method927(200) + 15);
                                if (class3.field65 > -1) {
                                    class112.field1723[var29.field1473].method1274(class3.field65 + arg0 - 12, class262.field3971 + arg4 + -var25);
                                }
                            }
                        }
                    }
                }
                if (var23.field2254 != null && (class141.field2069 <= var7 || class283.field4232 == 0 || class283.field4232 == 3 || class283.field4232 == 1 && class253.method1670(((class107) var23).field1663, (byte) -53))) {
                    class18.method128(arg2 >> 1, arg1, (byte) 113, var23, arg5, arg3 >> 1, var23.method927(200));
                    if (class3.field65 > -1 && class79.field1275 > class116.field1770) {
                        class79.field1280[class116.field1770] = class192.field2953.method1036(var23.field2254) / 2;
                        class79.field1272[class116.field1770] = class192.field2953.field2520;
                        class79.field1269[class116.field1770] = class3.field65;
                        class79.field1284[class116.field1770] = class262.field3971;
                        class79.field1257[class116.field1770] = var23.field2253;
                        class79.field1255[class116.field1770] = var23.field2225;
                        class79.field1259[class116.field1770] = var23.field2255;
                        class79.field1265[class116.field1770] = var23.field2254;
                        class116.field1770++;
                    }
                }
                if (var23.field2212 > class270.field4058) {
                    class230 var34 = class82.field1316[1];
                    class230 var35 = class82.field1316[0];
                    int var39;
                    if (var23 instanceof class61) {
                        class61 var36 = (class61) var23;
                        class230[] var37 = (class230[]) class93.field1475.method1777((long) var36.field959.field1137, (byte) 112);
                        if (var37 == null) {
                            var37 = class25.method156(var36.field959.field1137, 0, class295.field4675, (byte) -102);
                            if (var37 != null) {
                                class93.field1475.method1784((long) var36.field959.field1137, var37, 0);
                            }
                        }
                        class72 var38 = var36.field959;
                        if (var37 != null && var37.length == 2) {
                            var35 = var37[0];
                            var34 = var37[1];
                        }
                        if (var38.field1195 == -1) {
                            var39 = var23.method927(200);
                        } else {
                            var39 = var38.field1195;
                        }
                    } else {
                        var39 = var23.method927(200);
                    }
                    class18.method128(arg2 >> 1, arg1, (byte) 113, var23, arg5, arg3 >> 1, var35.field3464 + var39 + 10);
                    if (class3.field65 > -1) {
                        int var40 = class262.field3971 + arg4 - 3;
                        int var41 = arg0 + class3.field65 - (var35.field3473 >> 1);
                        var35.method1274(var41, var40);
                        int var42 = var35.field3464;
                        int var43 = var23.field2299 * var35.field3473 / 255;
                        class111.method722(var41, var40, var41 + var43, var40 + var42);
                        var34.method1274(var41, var40);
                        class111.method716(arg0, arg4, arg0 + arg3, arg4 - -arg2);
                    }
                }
                for (int var44 = 0; var44 < 4; var44++) {
                    if (var23.field2247[var44] > class270.field4058) {
                        int var47;
                        if (var23 instanceof class61) {
                            class61 var45 = (class61) var23;
                            class72 var46 = var45.field959;
                            if (var46.field1195 == -1) {
                                var47 = var23.method927(200) / 2;
                            } else {
                                var47 = var46.field1195 / 2;
                            }
                        } else {
                            var47 = var23.method927(arg6 ^ 0xA1) / 2;
                        }
                        class18.method128(arg2 >> 1, arg1, (byte) 113, var23, arg5, arg3 >> 1, var47);
                        if (class3.field65 > -1) {
                            if (var44 == 1) {
                                class262.field3971 -= 20;
                            }
                            if (var44 == 2) {
                                class262.field3971 -= 10;
                                class3.field65 -= 15;
                            }
                            if (var44 == 3) {
                                class262.field3971 -= 10;
                                class3.field65 += 15;
                            }
                            class98.field1553[var23.field2231[var44]].method1274(class3.field65 + arg0 - 12, class262.field3971 + arg4 - 12);
                            class91.field1435.method1037(Integer.toString(var23.field2214[var44]), class3.field65 + arg0 - 1, class262.field3971 + arg4 + 3, 16777215, 0);
                        }
                    }
                }
            }
        }
        if (arg6 != 105) {
            field894 = null;
        }
        for (int var8 = 0; var8 < class116.field1770; var8++) {
            int var9 = class79.field1269[var8];
            int var10 = class79.field1280[var8];
            int var11 = class79.field1272[var8];
            int var12 = class79.field1284[var8];
            boolean var13 = true;
            while (var13) {
                var13 = false;
                for (int var22 = 0; var22 < var8; var22++) {
                    if ((var12 + 2) > (class79.field1284[var22] - class79.field1272[var22]) && class79.field1284[var22] + 2 > var12 - var11 && (class79.field1280[var22] + class79.field1269[var22]) > (var9 - var10) && (class79.field1269[var22] - class79.field1280[var22]) < (var9 + var10) && var12 > class79.field1284[var22] - class79.field1272[var22]) {
                        var12 = class79.field1284[var22] - class79.field1272[var22];
                        var13 = true;
                    }
                }
            }
            class3.field65 = class79.field1269[var8];
            class262.field3971 = class79.field1284[var8] = var12;
            String var14 = class79.field1265[var8];
            if (class101.field1594 == 0) {
                int var15 = 16776960;
                if (class79.field1257[var8] < 6) {
                    var15 = class286.field4284[class79.field1257[var8]];
                }
                if (class79.field1257[var8] == 6) {
                    var15 = class246.field3674 % 20 >= 10 ? 16776960 : 16711680;
                }
                if (class79.field1257[var8] == 7) {
                    var15 = (class246.field3674 % 20) < 10 ? 255 : 65535;
                }
                if (class79.field1257[var8] == 8) {
                    var15 = class246.field3674 % 20 < 10 ? 45056 : 8454016;
                }
                if (class79.field1257[var8] == 9) {
                    int var16 = 150 - class79.field1259[var8];
                    if (var16 < 50) {
                        var15 = (var16 * 1280) + 16711680;
                    } else if (var16 < 100) {
                        var15 = 16776960 + 16384000 - var16 * 327680;
                    } else if (var16 < 150) {
                        var15 = (var16 - 100) * 5 + 65280;
                    }
                }
                if (class79.field1257[var8] == 10) {
                    int var17 = 150 - class79.field1259[var8];
                    if (var17 < 50) {
                        var15 = (var17 * 5) + 16711680;
                    } else if (var17 < 100) {
                        var15 = 16384000 + 16711935 - (var17 * 327680);
                    } else if (var17 < 150) {
                        var15 = (var17 - 100) * 327680 + 255 - ((var17 - 100) * 5);
                    }
                }
                if (class79.field1257[var8] == 11) {
                    int var18 = 150 - class79.field1259[var8];
                    if (var18 < 50) {
                        var15 = 16777215 - var18 * 327685;
                    } else if (var18 < 100) {
                        var15 = 65280 - (16384250 - (var18 * 327685));
                    } else if (var18 < 150) {
                        var15 = 16777215 + 32768000 - (var18 * 327680);
                    }
                }
                if (class79.field1255[var8] == 0) {
                    class192.field2953.method1037(var14, class3.field65 + arg0, class262.field3971 + arg4, var15, 0);
                }
                if (class79.field1255[var8] == 1) {
                    class192.field2953.method1025(var14, class3.field65 + arg0, arg4 - -class262.field3971, var15, 0, class246.field3674);
                }
                if (class79.field1255[var8] == 2) {
                    class192.field2953.method1034(var14, class3.field65 + arg0, class262.field3971 + arg4, var15, 0, class246.field3674);
                }
                if (class79.field1255[var8] == 3) {
                    class192.field2953.method1022(var14, class3.field65 + arg0, class262.field3971 + arg4, var15, 0, class246.field3674, 150 - class79.field1259[var8]);
                }
                if (class79.field1255[var8] == 4) {
                    int var19 = (150 - class79.field1259[var8]) * (class192.field2953.method1036(var14) + 100) / 150;
                    class111.method722(class3.field65 + arg0 - 50, arg4, arg0 + class3.field65 + 50, arg2 + arg4);
                    class192.field2953.method1024(var14, arg0 + class3.field65 + 50 - var19, class262.field3971 + arg4, var15, 0);
                    class111.method716(arg0, arg4, arg0 + arg3, arg4 - -arg2);
                }
                if (class79.field1255[var8] == 5) {
                    int var20 = 150 - class79.field1259[var8];
                    class111.method722(arg0, arg4 - (1 - class262.field3971) - class192.field2953.field2520, arg0 - -arg3, class262.field3971 + arg4 + 5);
                    int var21 = 0;
                    if (var20 < 25) {
                        var21 = var20 - 25;
                    } else if (var20 > 125) {
                        var21 = var20 - 125;
                    }
                    class192.field2953.method1037(var14, class3.field65 + arg0, arg4 - -class262.field3971 + var21, var15, 0);
                    class111.method716(arg0, arg4, arg0 + arg3, arg4 - -arg2);
                }
            } else {
                class192.field2953.method1037(var14, class3.field65 + arg0, class262.field3971 + arg4, 16776960, 0);
            }
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V")
    public static void method384(int arg0) {
        field894 = null;
        if (arg0 != 1280) {
            field891 = -118;
        }
        field899 = null;
    }
}
