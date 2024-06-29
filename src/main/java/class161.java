import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class161 extends class129 {

    @OriginalMember(owner = "client!oj", name = "p", descriptor = "I")
    public static int field2628 = 0;

    @OriginalMember(owner = "client!oj", name = "w", descriptor = "Lcc;")
    public static class216 field2635 = new class216(4);

    @OriginalMember(owner = "client!oj", name = "y", descriptor = "I")
    public static int field2637 = 1;

    @OriginalMember(owner = "client!oj", name = "z", descriptor = "[I")
    public static int[] field2638 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!oj", name = "o", descriptor = "I")
    public static int field2627;

    @OriginalMember(owner = "client!oj", name = "q", descriptor = "I")
    public static int field2629;

    @OriginalMember(owner = "client!oj", name = "r", descriptor = "I")
    public static int field2630;

    @OriginalMember(owner = "client!oj", name = "s", descriptor = "I")
    public static int field2631;

    @OriginalMember(owner = "client!oj", name = "t", descriptor = "I")
    public static int field2632;

    @OriginalMember(owner = "client!oj", name = "u", descriptor = "I")
    public static int field2633;

    @OriginalMember(owner = "client!oj", name = "v", descriptor = "I")
    public static int field2634;

    @OriginalMember(owner = "client!oj", name = "x", descriptor = "I")
    public static int field2636;

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(II)V")
    public static final void method1198(int arg0, int arg1) {
        field2632++;
        class201 var2 = class94.method738(arg1 ^ 0xFFFFFF87, arg0, arg1);
        var2.method1475(-743577184);
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(ZIZI)V")
    public static final void method1199(boolean arg0, int arg1, boolean arg2, int arg3) {
        field2629++;
        int var10002;
        for (int var4 = 0; var4 < class21.field235; var4++) {
            class18 var21 = class169.field2730[class39.field556[var4]];
            if (var21 != null && var21.method123((byte) 85) && var21.field205.method1753((byte) -82)) {
                int var22 = var21.method205(-90);
                if (arg2) {
                    if (!var21.field205.field3987) {
                        continue;
                    }
                } else if (arg0 != var21.field205.field3998 || arg3 != 0 && arg3 != var22) {
                    continue;
                }
                if (var22 == 1) {
                    if ((var21.field1979 & 0x7F) == 64 && (var21.field1910 & 0x7F) == 64) {
                        int var29 = var21.field1979 >> 7;
                        int var30 = var21.field1910 >> 7;
                        if (var29 >= 0 && var29 < 104 && var30 >= 0 && var30 < 104) {
                            var10002 = class267.field4316[var29][var30]++;
                        }
                    }
                } else if (((var22 & 0x1) != 0 || (var21.field1979 & 0x7F) == 0 && (var21.field1910 & 0x7F) == 0) && ((var22 & 0x1) != 1 || (var21.field1979 & 0x7F) == 64 && (var21.field1910 & 0x7F) == 64)) {
                    int var23 = var21.field1910 - (var22 * 64) >> 7;
                    int var24 = var21.field1979 - (var22 * 64) >> 7;
                    int var25 = var21.method205(-119) + var24;
                    if (var24 < 0) {
                        var24 = 0;
                    }
                    int var26 = var23 + var21.method205(arg1 - 179);
                    if (var23 < 0) {
                        var23 = 0;
                    }
                    if (var26 > 104) {
                        var26 = 104;
                    }
                    if (var25 > 104) {
                        var25 = 104;
                    }
                    for (int var27 = var24; var27 < var25; var27++) {
                        for (int var28 = var23; var28 < var26; var28++) {
                            var10002 = class267.field4316[var27][var28]++;
                        }
                    }
                }
            }
        }
        label210: for (int var5 = 0; var5 < class21.field235; var5++) {
            class18 var6 = class169.field2730[class39.field556[var5]];
            long var7 = (long) class39.field556[var5] << 32 | 0x20000000L;
            if (var6 != null && var6.method123((byte) 85) && var6.field205.method1753((byte) -83)) {
                int var9 = var6.method205(-106);
                if (arg2) {
                    if (!var6.field205.field3987) {
                        continue;
                    }
                } else if (var6.field205.field3998 != arg0 || arg3 != 0 && arg3 != var9) {
                    continue;
                }
                var6.field1976 = true;
                if (var9 == 1) {
                    if ((var6.field1979 & 0x7F) == 64 && (var6.field1910 & 0x7F) == 64) {
                        int var10 = var6.field1910 >> 7;
                        int var11 = var6.field1979 >> 7;
                        if (var11 < 0 || var11 >= 104 || var10 < 0 || var10 >= 104) {
                            continue;
                        }
                        if (class267.field4316[var11][var10] > 1) {
                            var10002 = class267.field4316[var11][var10]--;
                            continue;
                        }
                    }
                } else if ((var9 & 0x1) == 0 && (var6.field1979 & 0x7F) == 0 && (var6.field1910 & 0x7F) == 0 || (var9 & 0x1) == 1 && (var6.field1979 & 0x7F) == 64 && (var6.field1910 & 0x7F) == 64) {
                    int var12 = var6.field1979 - (var9 * 64) >> 7;
                    int var13 = var9 + var12;
                    if (var12 < 0) {
                        var12 = 0;
                    }
                    if (var13 > 104) {
                        var13 = 104;
                    }
                    int var14 = var6.field1910 - (var9 * 64) >> 7;
                    int var15 = var9 + var14;
                    if (var14 < 0) {
                        var14 = 0;
                    }
                    if (var15 > 104) {
                        var15 = 104;
                    }
                    boolean var16 = true;
                    for (int var17 = var12; var17 < var13; var17++) {
                        for (int var20 = var14; var20 < var15; var20++) {
                            if (class267.field4316[var17][var20] <= 1) {
                                var16 = false;
                                break;
                            }
                        }
                    }
                    if (var16) {
                        int var18 = var12;
                        while (true) {
                            if (var18 >= var13) {
                                continue label210;
                            }
                            for (int var19 = var14; var19 < var15; var19++) {
                                var10002 = class267.field4316[var18][var19]--;
                            }
                            var18++;
                        }
                    }
                }
                if (!var6.field205.field4026) {
                    var7 |= Long.MIN_VALUE;
                }
                var6.field1976 = false;
                var6.field1950 = class129.method930(var6.field1910, var6.field1979, 61, class58.field826);
                class254.method1798(class58.field826, var6.field1979, var6.field1910, var6.field1950, var9 * 64 + 60 - 64, var6, var6.field1893, var7, var6.field1907);
            }
        }
        if (arg1 != 64) {
            method1198(-82, -6);
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(BII)Lqi;")
    public static final class131 method1200(byte arg0, int arg1, int arg2) {
        field2633++;
        if (arg0 != 74) {
            method1198(-124, 53);
        }
        class131 var3 = class122.method891(arg2, (byte) -125);
        if (arg1 == -1) {
            return var3;
        } else if (var3 == null || var3.field2052 == null || arg1 >= var3.field2052.length) {
            return null;
        } else {
            return var3.field2052[arg1];
        }
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(I)V")
    public static final void method1201(int arg0) {
        class217.field3442 = null;
        field2627++;
        class134.method966(0, 0, 0, arg0, 0, -1, class211.field3384, class154.field2543, class23.field265);
        if (class217.field3442 != null) {
            class181.method1351(class294.field4674.field2037, 102, class154.field2543, 0, 0, class23.field265, -1412584499, class73.field1062, class217.field3442, class49.field728);
            class217.field3442 = null;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Llc;B)V")
    public static final void method1202(class86 arg0, byte arg1) {
        class141.field2281 = arg0.method619(-1, "p11_full");
        class98.field1446 = arg0.method619(-1, "p12_full");
        field2634++;
        class164.field2663 = arg0.method619(-1, "b12_full");
        class229.field3695 = arg0.method619(-1, "mapfunction");
        class75.field1081 = arg0.method619(-1, "hitmarks");
        class17.field192 = arg0.method619(-1, "hitbar_default");
        class243.field3912 = arg0.method619(-1, "headicons_pk");
        class229.field3681 = arg0.method619(-1, "headicons_prayer");
        class253.field4185 = arg0.method619(-1, "hint_headicons");
        if (arg1 >= -15) {
            return;
        }
        class174.field2833 = arg0.method619(-1, "hint_mapmarkers");
        class135.field2210 = arg0.method619(-1, "mapflag");
        class145.field2349 = arg0.method619(-1, "cross");
        class196.field3184 = arg0.method619(-1, "mapdots");
        class16.field177 = arg0.method619(-1, "scrollbar");
        class21.field244 = arg0.method619(-1, "name_icons");
        class124.field1810 = arg0.method619(-1, "floorshadows");
        class256.field4219 = arg0.method619(-1, "compass");
        class29.field362 = arg0.method619(-1, "hint_mapedge");
    }

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "(B)V")
    public static void method1203(byte arg0) {
        field2635 = null;
        int var1 = -33 / ((arg0 + 67) / 36);
        field2638 = null;
    }

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "(II)I")
    public static final int method1204(int arg0, int arg1) {
        field2630++;
        double var2 = (double) ((arg0 & 0xFFEFC4) >> 16) / 256.0D;
        double var4 = var2;
        double var6 = (double) (arg0 & 0xFF) / 256.0D;
        double var8 = var2;
        double var10 = (double) arg1;
        double var12 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        if (var2 < var12) {
            var4 = var12;
        }
        if (var4 < var6) {
            var4 = var6;
        }
        if (var2 > var12) {
            var8 = var12;
        }
        double var14 = 0.0D;
        if (var6 < var8) {
            var8 = var6;
        }
        double var16 = (var4 + var8) / 2.0D;
        int var18 = (int) (var16 * 256.0D);
        if (var4 != var8) {
            if (var16 < 0.5D) {
                var14 = (var4 - var8) / (var4 + var8);
            }
            if (var16 >= 0.5D) {
                var14 = (var4 - var8) / (2.0D - var4 - var8);
            }
            if (var2 == var4) {
                var10 = (var12 - var6) / (var4 - var8);
            } else if (var4 == var12) {
                var10 = (var6 - var2) / (var4 - var8) + 2.0D;
            } else if (var4 == var6) {
                var10 = (var2 - var12) / (var4 - var8) + 4.0D;
            }
        }
        double var19 = var10 / 6.0D;
        if (var18 < 0) {
            var18 = 0;
        } else if (var18 > 255) {
            var18 = 255;
        }
        int var21 = (int) (var19 * 256.0D);
        int var22 = (int) (var14 * 256.0D);
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        if (var18 > 243) {
            var22 >>= 0x4;
        } else if (var18 > 217) {
            var22 >>= 0x3;
        } else if (var18 > 192) {
            var22 >>= 0x2;
        } else if (var18 > 179) {
            var22 >>= 0x1;
        }
        return (var21 >> 2 << 10) + (var22 >> 5 << 7) + (var18 >> 1);
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lqi;IIIB)V")
    public static final void method1205(class131 arg0, int arg1, int arg2, int arg3, byte arg4) {
        class126.method908(-12);
        class70.method500(arg1, arg3, arg0.field2102 + arg1, arg0.field2167 + arg3);
        field2631++;
        if (class205.field3280 == 2 || class205.field3280 == 5 || class252.field4163 == null) {
            class70.method493(arg1, arg3, 0, arg0.field2068, arg0.field2062);
        } else {
            int var5 = (int) class190.field3068 + class61.field855 & 0x7FF;
            int var6 = class186.field2993.field1979 / 32 + 48;
            int var7 = 464 - class186.field2993.field1910 / 32;
            ((class140) class252.field4163).method73(arg1, arg3, arg0.field2102, arg0.field2167, var6, var7, var5, class53.field776 + 256, arg0.field2068, arg0.field2062);
            if (class244.field3958 != null) {
                for (int var8 = 0; var8 < class244.field3958.field1150; var8++) {
                    if (class244.field3958.method586(false, var8)) {
                        int var9 = ((class244.field3958.field1165[var8] >> 14 & 0x3FFF) - class282.field4487) * 4 + 2 - (class186.field2993.field1979 / 32);
                        int var10 = ((class244.field3958.field1165[var8] & 0x3FFF) - class99.field1465) * 4 + 2 - (class186.field2993.field1910 / 32);
                        int var11 = class47.field695[var5];
                        int var12 = class47.field679[var5];
                        int var13 = var12 * 256 / (class53.field776 + 256);
                        int var14 = var11 * 256 / (class53.field776 + 256);
                        int var15 = var9 * var14 + var10 * var13 >> 16;
                        class170 var16 = class238.field3808;
                        int var17 = var10 * var14 - (var9 * var13) >> 16;
                        if (class244.field3958.method587(var8, -21688) == 1) {
                            var16 = class12.field139;
                        }
                        if (class244.field3958.method587(var8, -21688) == 2) {
                            var16 = class285.field4511;
                        }
                        int var18 = var16.method1256(class244.field3958.field1153[var8], 100);
                        int var19 = var15 - var18 / 2;
                        if (var19 >= -arg0.field2102 && arg0.field2102 >= var19 && -arg0.field2167 <= var17 && var17 <= arg0.field2167) {
                            int var20 = 16777215;
                            if (class244.field3958.field1164[var8] != -1) {
                                var20 = class244.field3958.field1164[var8];
                            }
                            class70.method498(arg0.field2068, arg0.field2062);
                            var16.method1271(class244.field3958.field1153[var8], arg0.field2102 / 2 + var19 + arg1, arg0.field2167 / 2 + arg3 + -var17, var18, 50, var20, 0, 256, 1, 0, 0);
                            class70.method502();
                        }
                    }
                }
            }
            for (int var21 = 0; var21 < class281.field4472; var21++) {
                int var58 = class184.field2974[var21] * 4 + 2 - (class186.field2993.field1979 / 32);
                int var59 = class119.field1727[var21] * 4 + 2 - (class186.field2993.field1910 / 32);
                class36 var60 = class134.method970(class128.field1982[var21], 0);
                if (var60.field471 != null) {
                    var60 = var60.method277(27981);
                    if (var60 == null || var60.field449 == -1) {
                        continue;
                    }
                }
                class287.method1953(arg0, (byte) -57, class243.field3939[var60.field449], arg1, var58, arg3, var59);
            }
            for (int var22 = 0; var22 < 104; var22++) {
                for (int var54 = 0; var54 < 104; var54++) {
                    class187 var55 = class43.field627[class58.field826][var22][var54];
                    if (var55 != null) {
                        int var56 = var22 * 4 + 2 - (class186.field2993.field1979 / 32);
                        int var57 = var54 * 4 + 2 - (class186.field2993.field1910 / 32);
                        class287.method1953(arg0, (byte) -57, class155.field2556[0], arg1, var56, arg3, var57);
                    }
                }
            }
            for (int var23 = 0; var23 < class21.field235; var23++) {
                class18 var50 = class169.field2730[class39.field556[var23]];
                if (var50 != null && var50.method123((byte) 85)) {
                    class245 var51 = var50.field205;
                    if (var51 != null && var51.field3972 != null) {
                        var51 = var51.method1758(true);
                    }
                    if (var51 != null && var51.field4014 && var51.field4026) {
                        int var52 = var50.field1979 / 32 - (class186.field2993.field1979 / 32);
                        int var53 = var50.field1910 / 32 - class186.field2993.field1910 / 32;
                        if (var51.field4031 == -1) {
                            class287.method1953(arg0, (byte) -57, class155.field2556[1], arg1, var52, arg3, var53);
                        } else {
                            class287.method1953(arg0, (byte) -57, class243.field3939[var51.field4031], arg1, var52, arg3, var53);
                        }
                    }
                }
            }
            for (int var24 = 0; var24 < class121.field1772; var24++) {
                class29 var40 = class92.field1374[class207.field3326[var24]];
                if (var40 != null && var40.method123((byte) 85)) {
                    int var41 = var40.field1979 / 32 - (class186.field2993.field1979 / 32);
                    int var42 = var40.field1910 / 32 - class186.field2993.field1910 / 32;
                    boolean var43 = false;
                    long var44 = class193.method1431(var40.field344, false);
                    for (int var46 = 0; var46 < class20.field222; var46++) {
                        if (class57.field819[var46] == var44 && class105.field1523[var46] != 0) {
                            var43 = true;
                            break;
                        }
                    }
                    boolean var47 = false;
                    for (int var48 = 0; var48 < class168.field2704; var48++) {
                        if (class212.field3397[var48].field4459 == var44) {
                            var47 = true;
                            break;
                        }
                    }
                    boolean var49 = false;
                    if (class186.field2993.field341 != 0 && var40.field341 != 0 && class186.field2993.field341 == var40.field341) {
                        var49 = true;
                    }
                    if (var43) {
                        class287.method1953(arg0, (byte) -57, class155.field2556[3], arg1, var41, arg3, var42);
                    } else if (var47) {
                        class287.method1953(arg0, (byte) -57, class155.field2556[5], arg1, var41, arg3, var42);
                    } else if (var49) {
                        class287.method1953(arg0, (byte) -57, class155.field2556[4], arg1, var41, arg3, var42);
                    } else {
                        class287.method1953(arg0, (byte) -57, class155.field2556[2], arg1, var41, arg3, var42);
                    }
                }
            }
            class297[] var25 = class96.field1425;
            for (int var26 = 0; var26 < var25.length; var26++) {
                class297 var29 = var25[var26];
                if (var29 != null && var29.field4693 != 0 && class264.field4290 % 20 < 10) {
                    if (var29.field4693 == 1 && var29.field4700 >= 0 && var29.field4700 < class169.field2730.length) {
                        class18 var30 = class169.field2730[var29.field4700];
                        if (var30 != null) {
                            int var31 = var30.field1979 / 32 - (class186.field2993.field1979 / 32);
                            int var32 = var30.field1910 / 32 - (class186.field2993.field1910 / 32);
                            class230.method1637(arg0, var29.field4699, 0, arg1, var32, var31, 360000, arg3);
                        }
                    }
                    if (var29.field4693 == 2) {
                        int var33 = (var29.field4708 - class99.field1465) * 4 + 2 - class186.field2993.field1910 / 32;
                        int var34 = var29.field4690 * 4;
                        int var35 = var34 * var34;
                        int var36 = (var29.field4701 - class282.field4487) * 4 + 2 - class186.field2993.field1979 / 32;
                        class230.method1637(arg0, var29.field4699, 0, arg1, var33, var36, var35, arg3);
                    }
                    if (var29.field4693 == 10 && var29.field4700 >= 0 && var29.field4700 < class92.field1374.length) {
                        class29 var37 = class92.field1374[var29.field4700];
                        if (var37 != null) {
                            int var38 = var37.field1910 / 32 - (class186.field2993.field1910 / 32);
                            int var39 = var37.field1979 / 32 - class186.field2993.field1979 / 32;
                            class230.method1637(arg0, var29.field4699, 0, arg1, var38, var39, 360000, arg3);
                        }
                    }
                }
            }
            if (class288.field4580 != 0) {
                int var27 = class288.field4580 * 4 + class186.field2993.method205(100) * 2 + 2 - (class186.field2993.field1979 / 32 + 2);
                int var28 = class49.field704 * 4 + class186.field2993.method205(-113) * 2 + 2 - (class186.field2993.field1910 / 32) - 2;
                class287.method1953(arg0, (byte) -57, class98.field1448, arg1, var27, arg3, var28);
            }
            class70.method508(arg1 + (arg0.field2102 / 2) - 1, arg3 - (-(arg0.field2167 / 2) + 1), 3, 3, 16777215);
        }
        int var61 = 4 / ((arg4 - 63) / 45);
        class294.field4673[arg2] = true;
    }
}
