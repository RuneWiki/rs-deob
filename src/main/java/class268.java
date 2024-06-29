import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class268 {

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "Z")
    public static volatile boolean field4136 = true;

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "Ljava/lang/String;")
    public static String field4132 = "red:";

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "Ljava/lang/String;")
    public static String field4134 = "Loading - please wait.";

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "I")
    public static int field4137 = 0;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "I")
    public static int field4131;

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "I")
    public static int field4133;

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "I")
    public static int field4135;

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "I")
    public static int field4138;

    @OriginalMember(owner = "client!mc", name = "i", descriptor = "I")
    public static int field4139;

    @OriginalMember(owner = "client!mc", name = "j", descriptor = "I")
    public static int field4140;

    @OriginalMember(owner = "client!mc", name = "k", descriptor = "I")
    public static int field4141;

    @OriginalMember(owner = "client!mc", name = "l", descriptor = "I")
    public static int field4142;

    @OriginalMember(owner = "client!mc", name = "m", descriptor = "I")
    public static int field4143;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(SLjava/lang/String;IILjava/lang/String;JII)V", line = 4)
    public static final void method1963(short arg0, String arg1, int arg2, int arg3, String arg4, long arg5, int arg6, int arg7) {
        field4143++;
        if (class6.field89) {
            return;
        }
        if (class66.field1006 < 500) {
            class212.field3328[class66.field1006] = arg4;
            class318.field4904[class66.field1006] = arg1;
            class78.field1134[class66.field1006] = arg3 == -1 ? class174.field2761 : arg3;
            class356.field5670[class66.field1006] = arg0;
            class356.field5669[class66.field1006] = arg5;
            class41.field654[class66.field1006] = arg7;
            class90.field1278[class66.field1006] = arg2;
            class66.field1006++;
        }
        if (arg6 != -25900) {
            field4132 = (String) null;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZCLjava/lang/String;)I", line = 33)
    public static final int method1964(boolean arg0, char arg1, String arg2) {
        int var3 = 0;
        field4133++;
        int var4 = arg2.length();
        int var5 = 0;
        if (!arg0) {
            method1965(-127, -87, 59, -42);
        }
        while (var4 > var5) {
            if (arg2.charAt(var5) == arg1) {
                var3++;
            }
            var5++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIII)I", line = 58)
    public static final int method1965(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 >= -49) {
            return -92;
        } else {
            field4141++;
            return arg2 <= arg0 ? (arg0 > arg1 ? arg1 : arg0) : arg2;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(B)V", line = 71)
    public static final void method1966(byte arg0) {
        field4142++;
        int var1 = 0;
        if (arg0 <= 14) {
            method1969(-112);
        }
        while (var1 < class120.field1861) {
            int var2 = class326.field5010[var1];
            class244 var3 = class110.field1683[var2];
            int var4 = class244.field3803.method281(-126);
            if ((var4 & 0x8) != 0) {
                var4 += class244.field3803.method281(45) << 8;
            }
            if ((var4 & 0x1) != 0) {
                var3.field1364 = class244.field3803.method274((byte) -11);
                if (var3.field1364 == 65535) {
                    var3.field1364 = -1;
                }
            }
            if ((var4 & 0x40) != 0) {
                var3.field1314 = class244.field3803.method297((byte) -36);
                var3.field1382 = 100;
            }
            if ((var4 & 0x2) != 0) {
                int var5 = class244.field3803.method305(-32769);
                int var6 = class244.field3803.method287(128);
                var3.method807(var6, class360.field5718, -125, var5);
            }
            if ((var4 & 0x10) != 0) {
                int var7 = class244.field3803.method287(128);
                int var8 = class244.field3803.method305(-32769);
                var3.method807(var8, class360.field5718, -122, var7);
                var3.field1348 = class360.field5718 + 300;
                var3.field1301 = class244.field3803.method305(-32769);
            }
            if ((var4 & 0x20) != 0) {
                int var9 = class244.field3803.method275(2);
                if (var9 == 65535) {
                    var9 = -1;
                }
                boolean var10 = true;
                int var11 = class244.field3803.method298(1);
                if (var9 != -1 && var3.field1297 != -1 && class126.method1091((byte) 66, class292.method2110(var9, (byte) 8).field4343).field1423 < class126.method1091((byte) 16, class292.method2110(var3.field1297, (byte) 34).field4343).field1423) {
                    var10 = false;
                }
                if (var10) {
                    var3.field1326 = 0;
                    var3.field1355 = 1;
                    var3.field1297 = var9;
                    var3.field1392 = 0;
                    var3.field1308 = var11 >> 16;
                    var3.field1330 = (var11 & 0xFFFF) + class360.field5718;
                    if (var3.field1330 > class360.field5718) {
                        var3.field1326 = -1;
                    }
                    if (var3.field1297 != -1 && class360.field5718 == var3.field1330) {
                        int var12 = class292.method2110(var3.field1297, (byte) 45).field4343;
                        if (var12 != -1) {
                            class93 var13 = class126.method1091((byte) 27, var12);
                            if (var13 != null && var13.field1428 != null) {
                                class335.method2358(var3.field1359, 0, var13, false, var3.field1286, true);
                            }
                        }
                    }
                }
            }
            if ((var4 & 0x80) != 0) {
                if (var3.field3802.method1118(125)) {
                    class197.method1495((byte) -126, var3);
                }
                var3.method1840(class343.method2417(class244.field3803.method274((byte) -11), (byte) 99), 256);
                var3.method821(96, var3.field3802.field2192);
                var3.field1379 = var3.field3802.field2151;
                var3.field1288 = var3.field3802.field2189;
                if (var3.field3802.method1118(127)) {
                    class320.method2258(0, class119.field1826, (class212) null, (class171) null, var3.field1290[0], var3, 128, 0, var3.field1300[0]);
                }
            }
            if ((var4 & 0x100) != 0) {
                int var14 = class244.field3803.method287(128);
                int[] var15 = new int[var14];
                int[] var16 = new int[var14];
                int[] var17 = new int[var14];
                for (int var18 = 0; var18 < var14; var18++) {
                    int var19 = class244.field3803.method275(2);
                    if (var19 == 65535) {
                        var19 = -1;
                    }
                    var15[var18] = var19;
                    var16[var18] = class244.field3803.method287(128);
                    var17[var18] = class244.field3803.method261((byte) -113);
                }
                class239.method1773(3, var16, var17, var15, var3);
            }
            if ((var4 & 0x200) != 0) {
                var3.field1371 = class244.field3803.method275(2);
                var3.field1333 = class244.field3803.method261((byte) -85);
            }
            if ((var4 & 0x4) != 0) {
                int var20 = class244.field3803.method314((byte) 81);
                int var21 = class244.field3803.method287(128);
                if (var20 == 65535) {
                    var20 = -1;
                }
                class67.method660(var21, var3, 2948, var20);
            }
            var1++;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIIIII)V", line = 253)
    public static final void method1967(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = arg3 - arg4;
        int var7 = arg0 - arg2;
        field4139++;
        if (var7 == 0) {
            if (var6 != 0) {
                class104.method904(arg2, arg4, 1, arg3, arg5);
            }
        } else if (var6 == 0) {
            class64.method635(arg2, arg0, arg5, arg4, true);
        } else {
            if (var7 < 0) {
                var7 = -var7;
            }
            if (var6 < 0) {
                var6 = -var6;
            }
            boolean var8 = var6 > var7;
            if (var8) {
                int var9 = arg2;
                arg2 = arg4;
                int var10 = arg0;
                arg0 = arg3;
                arg4 = var9;
                arg3 = var10;
            }
            if (arg2 > arg0) {
                int var11 = arg2;
                arg2 = arg0;
                arg0 = var11;
                int var12 = arg4;
                arg4 = arg3;
                arg3 = var12;
            }
            int var13 = arg0 - arg2;
            int var14 = arg4;
            int var15 = arg3 - arg4;
            int var16 = -(var13 >> 1);
            if (var15 < 0) {
                var15 = -var15;
            }
            if (arg1 < -60) {
                int var17 = arg3 > arg4 ? 1 : -1;
                if (var8) {
                    for (int var18 = arg2; var18 <= arg0; var18++) {
                        class133.field2235[var18][var14] = arg5;
                        var16 += var15;
                        if (var16 > 0) {
                            var14 += var17;
                            var16 -= var13;
                        }
                    }
                } else {
                    for (int var19 = arg2; var19 <= arg0; var19++) {
                        class133.field2235[var14][var19] = arg5;
                        var16 += var15;
                        if (var16 > 0) {
                            var16 -= var13;
                            var14 += var17;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IBIII)I", line = 369)
    public static final int method1968(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        int var5 = arg3 & 0xF;
        field4131++;
        int var6 = var5 >= 8 ? arg4 : arg2;
        int var7 = var5 >= 4 ? (var5 == 12 || var5 == 14 ? arg2 : arg0) : arg4;
        int var8 = 75 / ((arg1 - 14) / 34);
        return ((var5 & 0x1) == 0 ? var6 : -var6) + ((var5 & 0x2) == 0 ? var7 : -var7);
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)V", line = 386)
    public static void method1969(int arg0) {
        field4132 = null;
        if (arg0 == -1) {
            field4134 = null;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Ljg;)V", line = 408)
    public static final void method1970(class297 arg0) {
        for (int var1 = arg0.field4616; var1 <= arg0.field4606; var1++) {
            for (int var2 = arg0.field4614; var2 <= arg0.field4612; var2++) {
                class329 var3 = class170.field2689[arg0.field4617][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field5063; var4++) {
                        if (var3.field5070[var4] == arg0) {
                            var3.field5063--;
                            for (int var5 = var4; var5 < var3.field5063; var5++) {
                                var3.field5070[var5] = var3.field5070[var5 + 1];
                                var3.field5077[var5] = var3.field5077[var5 + 1];
                            }
                            var3.field5070[var3.field5063] = null;
                            break;
                        }
                    }
                    var3.field5053 = 0;
                    for (int var6 = 0; var6 < var3.field5063; var6++) {
                        var3.field5053 |= var3.field5077[var6];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZIIBZII)V", line = 474)
    public static final void method1971(boolean arg0, int arg1, int arg2, byte arg3, boolean arg4, int arg5, int arg6) {
        if (arg4) {
            class240.method1802();
        }
        if (class212.field3321 != null && (arg5 != 3 || class68.field1047 != arg6 || class134.field2245 != arg2)) {
            class353.method2489(class212.field3321, class340.field5234, -19982);
            class212.field3321 = null;
        }
        if (arg5 == 3 && class212.field3321 == null) {
            class212.field3321 = class33.method350(class340.field5234, 0, arg2, 0, arg6, -4991);
            if (class212.field3321 != null) {
                class68.field1047 = arg6;
                class134.field2245 = arg2;
                class235.method1756(false, class340.field5234);
            }
        }
        if (arg3 <= 85) {
            return;
        }
        field4138++;
        if (arg5 == 3 && class212.field3321 == null) {
            method1971(true, arg1, -1, (byte) 106, true, class123.field1968, -1);
            return;
        }
        Container var7;
        if (class212.field3321 != null) {
            var7 = class212.field3321;
        } else if (class67.field1028 == null) {
            var7 = class340.field5234.field4975;
        } else {
            var7 = class67.field1028;
        }
        class101.field1528 = var7.getSize().width;
        class277.field4283 = var7.getSize().height;
        if (class67.field1028 == var7) {
            Insets var8 = class67.field1028.getInsets();
            class101.field1528 -= var8.right + var8.left;
            class277.field4283 -= var8.top + var8.bottom;
        }
        if (arg5 >= 2) {
            class362.field5740 = class277.field4283;
            class166.field2645 = 0;
            class126.field2113 = class101.field1528;
            class138.field2290 = 0;
        } else {
            class126.field2113 = 765;
            class166.field2645 = 0;
            class138.field2290 = (class101.field1528 - 765) / 2;
            class362.field5740 = 503;
        }
        if (arg0) {
            class329.method2324(class64.field974, -22);
            class204.method1524(58, class64.field974);
            if (class166.field2634 != null) {
                class166.field2634.method318(class64.field974, 116);
            }
            class110.field1674.method2465(10162);
            class359.method2522(-32769, class64.field974);
            class233.method1749(class64.field974, 8825);
            if (class166.field2634 != null) {
                class166.field2634.method316((byte) -119, class64.field974);
            }
        } else {
            if (class240.field3737) {
                class240.method1790(class126.field2113, class362.field5740);
            }
            class64.field974.setSize(class126.field2113, class362.field5740);
            if (class67.field1028 == var7) {
                Insets var9 = class67.field1028.getInsets();
                class64.field974.setLocation(class138.field2290 + var9.left, class166.field2645 + var9.top);
            } else {
                class64.field974.setLocation(class138.field2290, class166.field2645);
            }
        }
        if (arg5 == 0 && arg1 > 0) {
            class240.method1779(class64.field974);
        }
        if (arg4 && arg5 > 0) {
            class64.field974.setIgnoreRepaint(true);
            if (!class259.field3965) {
                class83.method749();
                class42.field665 = null;
                class42.field665 = class264.method1949(class64.field974, -29, class362.field5740, class126.field2113);
                class60.method592();
                if (class295.field4578 == 5) {
                    class188.method1445(class64.field988, (byte) -46, true);
                } else {
                    class307.method2198(-1, field4134, false);
                }
                try {
                    Graphics var10 = class64.field974.getGraphics();
                    class42.field665.method970(0, 0, (byte) -108, var10);
                } catch (Exception var14) {
                }
                class293.method2120(5447);
                if (arg1 == 0) {
                    class42.field665 = class264.method1949(class64.field974, -64, 503, 765);
                } else {
                    class42.field665 = null;
                }
                class95 var12 = class340.field5234.method2276(false, class110.field1674.getClass());
                while (var12.field1447 == 0) {
                    class188.method1443(10, 100L);
                }
                if (var12.field1447 == 1) {
                    class259.field3965 = true;
                }
            }
            if (class259.field3965) {
                class240.method1820(class64.field974, class271.field4194 * 2);
            }
        }
        if (!class240.field3737 && arg5 > 0) {
            method1971(true, arg1, -1, (byte) 96, true, 0, -1);
            return;
        }
        if (arg5 > 0 && arg1 == 0) {
            class160.field2565.setPriority(5);
            class42.field665 = null;
            class124.method1075();
            ((class224) class107.field1619).method1682(200, true);
            if (class59.field927) {
                class107.method929(0.7F);
            }
            if (class49.field774 == null) {
                class49.field774 = new class110[13][13];
            }
            class299.method2153(4, 104, 104);
            class127.method1097(104, 104);
            class317.method2239(4);
        } else if (arg5 == 0 && arg1 > 0) {
            class160.field2565.setPriority(1);
            class42.field665 = class264.method1949(class64.field974, -83, 503, 765);
            class124.method1078();
            class273.method2007();
            ((class224) class107.field1619).method1682(20, true);
            if (class59.field927) {
                if (class139.field2321 == 1) {
                    class107.method929(0.9F);
                }
                if (class139.field2321 == 2) {
                    class107.method929(0.8F);
                }
                if (class139.field2321 == 3) {
                    class107.method929(0.7F);
                }
                if (class139.field2321 == 4) {
                    class107.method929(0.6F);
                }
            }
            class125.method1087();
            class317.method2239(4);
        }
        class29.field475 = !class158.method1282(false);
        class273.method1997(class126.field2113, class362.field5740);
        if (arg4) {
            class175.method1368(-31);
        }
        if (arg5 < 2) {
            class144.field2356 = false;
        } else {
            class144.field2356 = true;
        }
        if (class164.field2604 != -1) {
            class108.method942(true, true);
        }
        if (class188.field2950 != null && (class295.field4578 == 30 || class295.field4578 == 25)) {
            class256.method1893(19);
        }
        for (int var13 = 0; var13 < 100; var13++) {
            class227.field3540[var13] = true;
        }
        class208.field3207 = true;
    }
}
