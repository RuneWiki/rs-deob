import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class18 {

    @OriginalMember(owner = "client!ce", name = "h", descriptor = "Lad;")
    private class5 field350 = new class5();

    @OriginalMember(owner = "client!ce", name = "j", descriptor = "I")
    public static int field352 = 0;

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "Lfc;")
    public static class34 field346 = new class34(64);

    @OriginalMember(owner = "client!ce", name = "q", descriptor = "J")
    public static long field359 = 0L;

    @OriginalMember(owner = "client!ce", name = "t", descriptor = "Lhb;")
    public static class44 field362 = class102.method810("Ein kostenloses Spielkonto erstellen)3", -28606);

    @OriginalMember(owner = "client!ce", name = "r", descriptor = "[I")
    public static int[] field360 = new int[128];

    @OriginalMember(owner = "client!ce", name = "s", descriptor = "I")
    public static int field361 = -1;

    @OriginalMember(owner = "client!ce", name = "p", descriptor = "Lqb;")
    public static class98 field358 = new class98();

    @OriginalMember(owner = "client!ce", name = "u", descriptor = "Lhb;")
    public static class44 field363 = class102.method810("Benutzen", -28606);

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "I")
    public static int field343;

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "I")
    public static int field344;

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "I")
    public static int field345;

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "I")
    public static int field347;

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "I")
    public static int field348;

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "I")
    public static int field349;

    @OriginalMember(owner = "client!ce", name = "i", descriptor = "I")
    public static int field351;

    @OriginalMember(owner = "client!ce", name = "k", descriptor = "I")
    public static int field353;

    @OriginalMember(owner = "client!ce", name = "l", descriptor = "I")
    public static int field354;

    @OriginalMember(owner = "client!ce", name = "m", descriptor = "I")
    public static int field355;

    @OriginalMember(owner = "client!ce", name = "n", descriptor = "I")
    public static int field356;

    @OriginalMember(owner = "client!ce", name = "o", descriptor = "Lpc;")
    public static class93 field357;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)V", line = 8)
    public static void method120(int arg0) {
        field362 = null;
        field346 = null;
        field363 = null;
        field357 = null;
        field360 = null;
        if (arg0 != -1) {
            method120(-29);
        }
        field358 = null;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(ZLja;)V", line = 28)
    public static final void method121(boolean arg0, class55 arg1) {
        field345++;
        if (arg1.field1373 == 0) {
            return;
        }
        if (arg1.field1375 != -1 && arg1.field1375 < 32768) {
            class46 var2 = class116.field2845[arg1.field1375];
            if (var2 != null) {
                int var3 = arg1.field1384 - var2.field1384;
                int var4 = arg1.field1371 - var2.field1371;
                if (var3 != 0 || var4 != 0) {
                    arg1.field1407 = (int) (Math.atan2((double) var3, (double) var4) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg1.field1375 >= 32768) {
            int var5 = arg1.field1375 - 32768;
            if (class62.field1569 == var5) {
                var5 = 2047;
            }
            class103 var6 = class82.field2110[var5];
            if (var6 != null) {
                int var7 = arg1.field1371 - var6.field1371;
                int var8 = arg1.field1384 - var6.field1384;
                if (var8 != 0 || var7 != 0) {
                    arg1.field1407 = (int) (Math.atan2((double) var8, (double) var7) * 325.949D) & 0x7FF;
                }
            }
        }
        if (!arg0) {
            field361 = 126;
        }
        if ((arg1.field1413 != 0 || arg1.field1380 != 0) && (arg1.field1378 == 0 || arg1.field1357 > 0)) {
            int var9 = arg1.field1384 - (arg1.field1413 - class104.field2666 - class104.field2666) * 64;
            int var10 = arg1.field1371 - (arg1.field1380 - class120.field2936 - class120.field2936) * 64;
            if (var9 != 0 || var10 != 0) {
                arg1.field1407 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
            }
            arg1.field1413 = 0;
            arg1.field1380 = 0;
        }
        int var11 = arg1.field1407 - arg1.field1419 & 0x7FF;
        if (var11 == 0) {
            arg1.field1414 = 0;
            return;
        }
        arg1.field1414++;
        if (var11 > 1024) {
            arg1.field1419 -= arg1.field1373;
            boolean var12 = true;
            if (arg1.field1373 > var11 || 2048 - arg1.field1373 < var11) {
                var12 = false;
                arg1.field1419 = arg1.field1407;
            }
            if (arg1.field1388 == arg1.field1361 && (arg1.field1414 > 25 || var12)) {
                if (arg1.field1391 == -1) {
                    arg1.field1361 = arg1.field1390;
                } else {
                    arg1.field1361 = arg1.field1391;
                }
            }
        } else {
            arg1.field1419 += arg1.field1373;
            boolean var13 = true;
            if (arg1.field1373 > var11 || var11 > 2048 - arg1.field1373) {
                arg1.field1419 = arg1.field1407;
                var13 = false;
            }
            if (arg1.field1388 == arg1.field1361 && (arg1.field1414 > 25 || var13)) {
                if (arg1.field1356 == -1) {
                    arg1.field1361 = arg1.field1390;
                } else {
                    arg1.field1361 = arg1.field1356;
                }
            }
        }
        arg1.field1419 &= 0x7FF;
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(I)V", line = 159)
    public static final void method122(int arg0) {
        field351++;
        for (int var1 = arg0; var1 < class125.field3036; var1++) {
            int var2 = class100.field2515[var1];
            class46 var3 = class116.field2845[var2];
            if (var3 != null) {
                class79.method655(var3, (byte) 41, var3.field1137.field997);
            }
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(ZBIIIIIIIIII)Z", line = 190)
    public static final boolean method123(boolean arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var36 = 0; var36 < 104; var36++) {
                class66.field1675[var12][var36] = 0;
                class127.field3045[var12][var36] = 99999999;
            }
        }
        field349++;
        int var13 = arg9;
        class66.field1675[arg9][arg6] = 99;
        byte var14 = 0;
        class127.field3045[arg9][arg6] = 0;
        int var15 = arg6;
        class113.field2787[var14] = arg9;
        int var37 = var14 + 1;
        class101.field2573[var14] = arg6;
        int var16 = 0;
        boolean var17 = false;
        int[][] var18 = class67.field1678[class79.field1993].field2338;
        int var19 = class113.field2787.length;
        while (var37 != var16) {
            var15 = class101.field2573[var16];
            var13 = class113.field2787[var16];
            var16 = (var16 + 1) % var19;
            if (arg7 == var13 && arg4 == var15) {
                var17 = true;
                break;
            }
            if (arg8 != 0) {
                if ((arg8 < 5 || arg8 == 10) && class67.field1678[class79.field1993].method733(arg8 - 1, (byte) -9, arg7, var13, var15, arg10, arg4)) {
                    var17 = true;
                    break;
                }
                if (arg8 < 10 && class67.field1678[class79.field1993].method735(arg7, var15, var13, arg4, arg10, true, arg8 - 1)) {
                    var17 = true;
                    break;
                }
            }
            if (arg2 != 0 && arg5 != 0 && class67.field1678[class79.field1993].method739(arg7, arg2, 106, var15, var13, arg5, arg4, arg11)) {
                var17 = true;
                break;
            }
            int var35 = class127.field3045[var13][var15] + 1;
            if (var13 > 0 && class66.field1675[var13 - 1][var15] == 0 && (var18[var13 - 1][var15] & 0x1280108) == 0) {
                class113.field2787[var37] = var13 - 1;
                class101.field2573[var37] = var15;
                class66.field1675[var13 - 1][var15] = 2;
                class127.field3045[var13 - 1][var15] = var35;
                var37 = (var37 + 1) % var19;
            }
            if (var13 < 103 && class66.field1675[var13 + 1][var15] == 0 && (var18[var13 + 1][var15] & 0x1280180) == 0) {
                class113.field2787[var37] = var13 + 1;
                class101.field2573[var37] = var15;
                var37 = (var37 + 1) % var19;
                class66.field1675[var13 + 1][var15] = 8;
                class127.field3045[var13 + 1][var15] = var35;
            }
            if (var15 > 0 && class66.field1675[var13][var15 - 1] == 0 && (var18[var13][var15 - 1] & 0x1280102) == 0) {
                class113.field2787[var37] = var13;
                class101.field2573[var37] = var15 - 1;
                var37 = (var37 + 1) % var19;
                class66.field1675[var13][var15 - 1] = 1;
                class127.field3045[var13][var15 - 1] = var35;
            }
            if (var15 < 103 && class66.field1675[var13][var15 + 1] == 0 && (var18[var13][var15 + 1] & 0x1280120) == 0) {
                class113.field2787[var37] = var13;
                class101.field2573[var37] = var15 + 1;
                class66.field1675[var13][var15 + 1] = 4;
                var37 = (var37 + 1) % var19;
                class127.field3045[var13][var15 + 1] = var35;
            }
            if (var13 > 0 && var15 > 0 && class66.field1675[var13 - 1][var15 - 1] == 0 && (var18[var13 - 1][var15 - 1] & 0x128010E) == 0 && (var18[var13 - 1][var15] & 0x1280108) == 0 && (var18[var13][var15 - 1] & 0x1280102) == 0) {
                class113.field2787[var37] = var13 - 1;
                class101.field2573[var37] = var15 - 1;
                class66.field1675[var13 - 1][var15 - 1] = 3;
                class127.field3045[var13 - 1][var15 - 1] = var35;
                var37 = (var37 + 1) % var19;
            }
            if (var13 < 103 && var15 > 0 && class66.field1675[var13 + 1][var15 - 1] == 0 && (var18[var13 + 1][var15 - 1] & 0x1280183) == 0 && (var18[var13 + 1][var15] & 0x1280180) == 0 && (var18[var13][var15 - 1] & 0x1280102) == 0) {
                class113.field2787[var37] = var13 + 1;
                class101.field2573[var37] = var15 - 1;
                var37 = (var37 + 1) % var19;
                class66.field1675[var13 + 1][var15 - 1] = 9;
                class127.field3045[var13 + 1][var15 - 1] = var35;
            }
            if (var13 > 0 && var15 < 103 && class66.field1675[var13 - 1][var15 + 1] == 0 && (var18[var13 - 1][var15 + 1] & 0x1280138) == 0 && (var18[var13 - 1][var15] & 0x1280108) == 0 && (var18[var13][var15 + 1] & 0x1280120) == 0) {
                class113.field2787[var37] = var13 - 1;
                class101.field2573[var37] = var15 + 1;
                class66.field1675[var13 - 1][var15 + 1] = 6;
                class127.field3045[var13 - 1][var15 + 1] = var35;
                var37 = (var37 + 1) % var19;
            }
            if (var13 < 103 && var15 < 103 && class66.field1675[var13 + 1][var15 + 1] == 0 && (var18[var13 + 1][var15 + 1] & 0x12801E0) == 0 && (var18[var13 + 1][var15] & 0x1280180) == 0 && (var18[var13][var15 + 1] & 0x1280120) == 0) {
                class113.field2787[var37] = var13 + 1;
                class101.field2573[var37] = var15 + 1;
                class66.field1675[var13 + 1][var15 + 1] = 12;
                var37 = (var37 + 1) % var19;
                class127.field3045[var13 + 1][var15 + 1] = var35;
            }
        }
        class110.field2746 = 0;
        if (!var17) {
            if (!arg0) {
                return false;
            }
            int var20 = 1000;
            int var21 = 100;
            byte var22 = 10;
            for (int var23 = arg7 - var22; var23 <= arg7 + var22; var23++) {
                for (int var24 = arg4 - var22; var24 <= arg4 + var22; var24++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104 && class127.field3045[var23][var24] < 100) {
                        int var25 = 0;
                        int var26 = 0;
                        if (arg7 > var23) {
                            var25 = arg7 - var23;
                        } else if (arg2 + arg7 - 1 < var23) {
                            var25 = var23 + 1 - arg7 - arg2;
                        }
                        if (arg4 > var24) {
                            var26 = arg4 - var24;
                        } else if (var24 > arg4 + arg5 - 1) {
                            var26 = var24 + 1 - arg4 - arg5;
                        }
                        int var27 = var25 * var25 + var26 * var26;
                        if (var20 > var27 || var20 == var27 && var21 > class127.field3045[var23][var24]) {
                            var20 = var27;
                            var13 = var23;
                            var21 = class127.field3045[var23][var24];
                            var15 = var24;
                        }
                    }
                }
            }
            if (var20 == 1000) {
                return false;
            }
            if (arg9 == var13 && arg6 == var15) {
                return false;
            }
            class110.field2746 = 1;
        }
        if (arg1 != 96) {
            field358 = null;
        }
        byte var28 = 0;
        class113.field2787[var28] = var13;
        int var38 = var28 + 1;
        class101.field2573[var28] = var15;
        int var29;
        int var30 = var29 = class66.field1675[var13][var15];
        while (arg9 != var13 || arg6 != var15) {
            if (var29 != var30) {
                var29 = var30;
                class113.field2787[var38] = var13;
                class101.field2573[var38++] = var15;
            }
            if ((var30 & 0x2) != 0) {
                var13++;
            } else if ((var30 & 0x8) != 0) {
                var13--;
            }
            if ((var30 & 0x1) != 0) {
                var15++;
            } else if ((var30 & 0x4) != 0) {
                var15--;
            }
            var30 = class66.field1675[var13][var15];
        }
        if (var38 > 0) {
            int var31 = var38;
            if (var38 > 25) {
                var31 = 25;
            }
            var38--;
            int var32 = class101.field2573[var38];
            int var33 = class113.field2787[var38];
            if (arg3 == 0) {
                class33.field794++;
                class92.field2333.method702(true, 111);
                class92.field2333.method993(19579, var31 + var31 + 3);
            }
            if (arg3 == 1) {
                class92.field2333.method702(true, 226);
                class128.field3080++;
                class92.field2333.method993(19579, var31 + var31 + 3 + 14);
            }
            if (arg3 == 2) {
                class42.field953++;
                class92.field2333.method702(true, 94);
                class92.field2333.method993(arg1 + 19483, var31 + 3 - -var31);
            }
            class92.field2333.method998(class120.field2936 + var32, false);
            class90.field2301 = class113.field2787[0];
            class116.field2838 = class101.field2573[0];
            for (int var34 = 1; var34 < var31; var34++) {
                var38--;
                class92.field2333.method1012(1950179592, class113.field2787[var38] - var33);
                class92.field2333.method997((byte) 124, class101.field2573[var38] - var32);
            }
            class92.field2333.method1017(-127, var33 + class104.field2666);
            class92.field2333.method1002(128, class13.field257[82] ? 1 : 0);
            return true;
        } else if (arg3 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lfb;ZI)V", line = 533)
    public static final void method124(class33 arg0, boolean arg1, int arg2) {
        if (arg2 != 26294) {
            field356 = 110;
        }
        if (class28.field662 != null) {
            try {
                class28.field662.method328(256);
            } catch (Exception var8) {
            }
            class28.field662 = null;
        }
        class28.field662 = arg0;
        field347++;
        class48.method455(arg1, false);
        class125.field3029 = 0;
        class98.field2505 = null;
        class2.field35 = null;
        class67.field1686.field3182 = 0;
        while (true) {
            class129 var3 = (class129) class41.field915.method153(false);
            if (var3 == null) {
                while (true) {
                    class129 var4 = (class129) class74.field1866.method153(false);
                    if (var4 == null) {
                        if (class125.field3033 != 0) {
                            try {
                                class131 var5 = new class131(4);
                                var5.method993(arg2 ^ 0x2ACD, 4);
                                var5.method993(19579, class125.field3033);
                                var5.method1017(127, 0);
                                class28.field662.method323(0, (byte) 125, 4, var5.field3172);
                            } catch (IOException var7) {
                                try {
                                    class28.field662.method328(256);
                                } catch (Exception var6) {
                                }
                                class28.field662 = null;
                                class117.field2856++;
                            }
                        }
                        class75.field1907 = 0;
                        class128.field3079 = System.currentTimeMillis();
                        return;
                    }
                    class71.field1736.method127(var4, (byte) -123);
                    class11.field201.method158(var4.field3057, var4, arg2 - 49005);
                    class13.field248--;
                    class22.field485++;
                }
            }
            class40.field895.method158(var3.field3057, var3, arg2 - 49005);
            class55.field1364++;
            class36.field858--;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(BLad;)V", line = 608)
    public final void method125(byte arg0, class5 arg1) {
        if (arg1.field127 != null) {
            arg1.method39(1);
        }
        if (arg0 >= -91) {
            field360 = null;
        }
        arg1.field120 = this.field350;
        arg1.field127 = this.field350.field127;
        field348++;
        arg1.field127.field120 = arg1;
        arg1.field120.field127 = arg1;
    }

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "(I)Lad;", line = 641)
    public final class5 method126(int arg0) {
        field353++;
        if (arg0 > -1) {
            field359 = -104L;
        }
        class5 var2 = this.field350.field120;
        if (this.field350 == var2) {
            return null;
        } else {
            var2.method39(1);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "()V", line = 750)
    public class18() {
        this.field350.field127 = this.field350;
        this.field350.field120 = this.field350;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lad;B)V", line = 668)
    public final void method127(class5 arg0, byte arg1) {
        field344++;
        if (arg0.field127 != null) {
            arg0.method39(1);
        }
        arg0.field120 = this.field350.field120;
        arg0.field127 = this.field350;
        int var3 = -103 % ((-arg1 - 52) / 57);
        arg0.field127.field120 = arg0;
        arg0.field120.field127 = arg0;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Z)V", line = 691)
    public static final void method128(boolean arg0) {
        field343++;
        if (!class11.field206) {
            return;
        }
        class61.field1557 = null;
        class11.field215 = null;
        class78.field1956 = null;
        class90.field2307 = null;
        class107.field2724 = null;
        class84.field2154 = null;
        class127.field3047 = null;
        class15.field288 = null;
        class11.field206 = false;
        class128.field3081 = null;
        class121.field2954 = null;
        if (!arg0) {
            method124(null, false, -95);
        }
        class57.field1505 = null;
        class127.field3053 = null;
        class117.field2865 = null;
        class62.field1566 = null;
        class31.field762 = null;
        class105.field2669 = null;
        class127.field3051 = null;
        class51.field1280 = null;
        class98.field2508 = null;
        class86.field2196 = null;
        field357 = null;
        class88.field2252 = null;
        class69.field1708 = null;
        class97.field2476 = null;
        class53.field1320 = null;
        class40.field888 = null;
        class111.field2761 = null;
        class102.field2589 = null;
        class27.field630 = null;
        class39.field877 = null;
        class97.field2470 = null;
        class71.field1743 = null;
        class63.field1599 = null;
        class120.field2931 = null;
        class101.field2577 = null;
        class94.field2399 = null;
        class131.field3198 = null;
        class33.field810 = null;
        class80.field2013 = null;
        class44.field1120 = null;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)Lad;", line = 759)
    public final class5 method129(byte arg0) {
        field354++;
        if (arg0 != 71) {
            method122(13);
        }
        class5 var2 = this.field350.field120;
        return this.field350 == var2 ? null : var2;
    }
}
