import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class37 {

    @OriginalMember(owner = "client!g", name = "e", descriptor = "I")
    public static int field885 = 0;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "Lmc;")
    public static class75 field881 = class30.method234(true, "Wen m-Ochten Sie von der Liste entfernen?");

    @OriginalMember(owner = "client!g", name = "h", descriptor = "Lmc;")
    private static class75 field888 = class30.method234(true, "Press (Wrecover a locked account(W on front page)3");

    @OriginalMember(owner = "client!g", name = "m", descriptor = "[Lna;")
    public static class79[] field893 = new class79[12];

    @OriginalMember(owner = "client!g", name = "l", descriptor = "I")
    public static int field892 = 0;

    @OriginalMember(owner = "client!g", name = "n", descriptor = "I")
    public static int field894 = 0;

    @OriginalMember(owner = "client!g", name = "o", descriptor = "Lmc;")
    public static class75 field895 = field888;

    @OriginalMember(owner = "client!g", name = "b", descriptor = "I")
    public static int field882;

    @OriginalMember(owner = "client!g", name = "c", descriptor = "I")
    public static int field883;

    @OriginalMember(owner = "client!g", name = "d", descriptor = "I")
    public static int field884;

    @OriginalMember(owner = "client!g", name = "f", descriptor = "I")
    public static int field886;

    @OriginalMember(owner = "client!g", name = "i", descriptor = "I")
    public static int field889;

    @OriginalMember(owner = "client!g", name = "j", descriptor = "I")
    public static int field890;

    @OriginalMember(owner = "client!g", name = "k", descriptor = "I")
    public static int field891;

    @OriginalMember(owner = "client!g", name = "p", descriptor = "I")
    public static int field896;

    @OriginalMember(owner = "client!g", name = "g", descriptor = "Lle;")
    public static class71 field887;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIIIIIIII)V", line = 6)
    public static final void method284(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field882++;
        if (arg7 != 1387) {
            field888 = null;
        }
        class24 var10 = (class24) class40.field949.method248(32);
        class24 var11 = null;
        while (var10 != null) {
            if (var10.field464 == arg5 && var10.field473 == arg0 && var10.field457 == arg3 && var10.field470 == arg2) {
                var11 = var10;
                break;
            }
            var10 = (class24) class40.field949.method252(83);
        }
        if (var11 == null) {
            var11 = new class24();
            var11.field470 = arg2;
            var11.field464 = arg5;
            var11.field457 = arg3;
            var11.field473 = arg0;
            class50.method386(arg7 - 1387, var11);
            class40.field949.method245(var11, 0);
        }
        var11.field466 = arg4;
        var11.field456 = arg6;
        var11.field460 = arg1;
        var11.field461 = arg9;
        var11.field472 = arg8;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIIII)V", line = 61)
    public static final void method285(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field883++;
        int var6 = class107.field2679.method207(arg1, arg2, arg3);
        if (arg5 != -30744) {
            method286(102);
        }
        if (var6 != 0) {
            int var7 = class107.field2679.method193(arg1, arg2, arg3, var6);
            int var8 = var7 >> 6 & 0x3;
            int var9 = var7 & 0x1F;
            int var10 = arg4;
            if (var6 > 0) {
                var10 = arg0;
            }
            int var11 = (103 - arg3) * 2048 + arg2 * 4 + 24624;
            int[] var12 = class108.field2740.field32;
            int var13 = var6 >> 14 & 0x7FFF;
            class59 var14 = class50.method387(arg5 + 4470, var13);
            if (var14.field1538 == -1) {
                if (var9 == 0 || var9 == 2) {
                    if (var8 == 0) {
                        var12[var11] = var10;
                        var12[var11 + 512] = var10;
                        var12[var11 + 1024] = var10;
                        var12[var11 + 1536] = var10;
                    } else if (var8 == 1) {
                        var12[var11] = var10;
                        var12[var11 + 1] = var10;
                        var12[var11 + 2] = var10;
                        var12[var11 + 3] = var10;
                    } else if (var8 == 2) {
                        var12[var11 + 3] = var10;
                        var12[var11 + 3 + 512] = var10;
                        var12[var11 + 1027] = var10;
                        var12[var11 + 3 + 1536] = var10;
                    } else if (var8 == 3) {
                        var12[var11 + 1536] = var10;
                        var12[var11 + 1537] = var10;
                        var12[var11 + 1538] = var10;
                        var12[var11 + 1536 + 3] = var10;
                    }
                }
                if (var9 == 3) {
                    if (var8 == 0) {
                        var12[var11] = var10;
                    } else if (var8 == 1) {
                        var12[var11 + 3] = var10;
                    } else if (var8 == 2) {
                        var12[var11 + 1536 + 3] = var10;
                    } else if (var8 == 3) {
                        var12[var11 + 1536] = var10;
                    }
                }
                if (var9 == 2) {
                    if (var8 == 3) {
                        var12[var11] = var10;
                        var12[var11 + 512] = var10;
                        var12[var11 + 1024] = var10;
                        var12[var11 + 1536] = var10;
                    } else if (var8 == 0) {
                        var12[var11] = var10;
                        var12[var11 + 1] = var10;
                        var12[var11 + 2] = var10;
                        var12[var11 + 3] = var10;
                    } else if (var8 == 1) {
                        var12[var11 + 3] = var10;
                        var12[var11 + 3 + 512] = var10;
                        var12[var11 + 1024 + 3] = var10;
                        var12[var11 + 1539] = var10;
                    } else if (var8 == 2) {
                        var12[var11 + 1536] = var10;
                        var12[var11 + 1 + 1536] = var10;
                        var12[var11 + 1538] = var10;
                        var12[var11 + 1536 + 3] = var10;
                    }
                }
            } else {
                class81 var15 = class98.field2466[var14.field1538];
                if (var15 != null) {
                    int var16 = (var14.field1530 * 4 - var15.field2027) / 2;
                    int var17 = (var14.field1525 * 4 - var15.field2028) / 2;
                    var15.method687(arg2 * 4 + var16 + 48, (-arg3 + 104 + -var14.field1525) * 4 + 48 + var17);
                }
            }
        }
        int var18 = class107.field2679.method200(arg1, arg2, arg3);
        if (var18 != 0) {
            int var19 = class107.field2679.method193(arg1, arg2, arg3, var18);
            int var20 = var19 & 0x1F;
            int var21 = var18 >> 14 & 0x7FFF;
            class59 var22 = class50.method387(-26274, var21);
            int var23 = var19 >> 6 & 0x3;
            if (var22.field1538 != -1) {
                class81 var27 = class98.field2466[var22.field1538];
                if (var27 != null) {
                    int var28 = (var22.field1525 * 4 - var27.field2028) / 2;
                    int var29 = (var22.field1530 * 4 - var27.field2027) / 2;
                    var27.method687(arg2 * 4 + var29 + 48, (-arg3 + 104 - var22.field1525) * 4 + (48 - -var28));
                }
            } else if (var20 == 9) {
                int var24 = 15658734;
                if (var18 > 0) {
                    var24 = 15597568;
                }
                int var25 = (103 - arg3) * 2048 + arg2 * 4 + 24624;
                int[] var26 = class108.field2740.field32;
                if (var23 == 0 || var23 == 2) {
                    var26[var25 + 1536] = var24;
                    var26[var25 + 1025] = var24;
                    var26[var25 + 512 + 2] = var24;
                    var26[var25 + 3] = var24;
                } else {
                    var26[var25] = var24;
                    var26[var25 + 512 + 1] = var24;
                    var26[var25 + 2 + 1024] = var24;
                    var26[var25 + 1536 + 3] = var24;
                }
            }
        }
        int var30 = class107.field2679.method214(arg1, arg2, arg3);
        if (var30 == 0) {
            return;
        }
        int var31 = var30 >> 14 & 0x7FFF;
        class59 var32 = class50.method387(-26274, var31);
        if (var32.field1538 == -1) {
            return;
        }
        class81 var33 = class98.field2466[var32.field1538];
        if (var33 != null) {
            int var34 = (var32.field1530 * 4 - var33.field2027) / 2;
            int var35 = (var32.field1525 * 4 - var33.field2028) / 2;
            var33.method687(arg2 * 4 + var34 + 48, (-arg3 + 104 - var32.field1525) * 4 + var35 + 48);
            return;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(I)V", line = 317)
    public static void method286(int arg0) {
        if (arg0 != 3) {
            return;
        }
        field895 = null;
        field887 = null;
        field893 = null;
        field881 = null;
        field888 = null;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIIIII)I", line = 341)
    public static final int method287(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field891++;
        if ((arg2 & 0x1) == 1) {
            int var7 = arg4;
            arg4 = arg5;
            arg5 = var7;
        }
        if (arg0 >= -49) {
            return 55;
        }
        int var8 = arg3 & 0x3;
        if (var8 == 0) {
            return arg6;
        } else if (var8 == 1) {
            return arg1;
        } else if (var8 == 2) {
            return 1 + 7 - arg4 - arg6;
        } else {
            return 1 + 7 - arg5 - arg1;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(B)Z", line = 374)
    public static final boolean method288(byte arg0) {
        field886++;
        if (class70.field1795 == null) {
            return false;
        }
        try {
            int var1 = class70.field1795.method753(0);
            if (var1 == 0) {
                return false;
            }
            if (class107.field2692 == -1) {
                var1--;
                class70.field1795.method760(0, class97.field2448.field1577, 1, 5000);
                class97.field2448.field1556 = 0;
                class107.field2692 = class97.field2448.method714((byte) -91);
                class27.field547 = class68.field1741[class107.field2692];
            }
            if (class27.field547 == -1) {
                if (var1 <= 0) {
                    return false;
                }
                var1--;
                class70.field1795.method760(0, class97.field2448.field1577, 1, 5000);
                class27.field547 = class97.field2448.field1577[0] & 0xFF;
            }
            if (class27.field547 == -2) {
                if (var1 <= 1) {
                    return false;
                }
                var1 -= 2;
                class70.field1795.method760(0, class97.field2448.field1577, 2, 5000);
                class97.field2448.field1556 = 0;
                class27.field547 = class97.field2448.method507((byte) -89);
            }
            if (class27.field547 > var1) {
                return false;
            }
            class97.field2448.field1556 = 0;
            class70.field1795.method760(0, class97.field2448.field1577, class27.field547, 5000);
            class8.field122 = 0;
            class117.field2896 = class62.field1648;
            class62.field1648 = class42.field1008;
            class42.field1008 = class107.field2692;
            if (class107.field2692 == 129) {
                for (int var2 = 0; var2 < class62.field1613.length; var2++) {
                    if (class62.field1613[var2] != class52.field1318[var2]) {
                        class62.field1613[var2] = class52.field1318[var2];
                        class129.method1011(var2, 0);
                        class108.field2743 = true;
                    }
                }
                class107.field2692 = -1;
                return true;
            }
            if (class107.field2692 == 87) {
                class119.field2945 = class97.field2448.method494(20471);
                class108.field2743 = true;
                class107.field2692 = -1;
                return true;
            }
            if (class107.field2692 == 123) {
                if (class130.field3167 == 12) {
                    class108.field2743 = true;
                }
                class62.field1636 = class97.field2448.method494(20471);
                class107.field2692 = -1;
                return true;
            }
            if (class107.field2692 == 26) {
                long var3 = class97.field2448.method532(true);
                class75 var5 = class38.method295(true, class97.field2448).method625(false);
                class31.method242(class78.method667(var3, -93).method652(1), 6, -1, var5);
                class107.field2692 = -1;
                return true;
            }
            if (class107.field2692 == 3) {
                int var6 = class97.field2448.method490(19753);
                int var7 = class97.field2448.method507((byte) -24);
                class99 var8 = class40.method305(65535, var6);
                var8.field2506 = 2;
                var8.field2515 = var7;
                class107.field2692 = -1;
                return true;
            }
            if (class107.field2692 == 248) {
                int var9 = class97.field2448.method518(28184);
                class99 var10 = class40.method305(65535, var9);
                for (int var11 = 0; var11 < var10.field2520.length; var11++) {
                    var10.field2520[var11] = -1;
                    var10.field2520[var11] = 0;
                }
                class107.field2692 = -1;
                return true;
            }
            if (class107.field2692 == 82) {
                class32.field727 = class97.field2448.method524(255) * 30;
                class107.field2692 = -1;
                return true;
            }
            if (class107.field2692 == 16) {
                int var12 = class97.field2448.method490(19753);
                int var13 = class97.field2448.method534(true);
                int var14 = class97.field2448.method513(1564473008);
                class99 var15 = class40.method305(65535, var12);
                var15.field2524 = var15.field2521 + var13;
                class107.field2692 = -1;
                var15.field2504 = var15.field2501 + var14;
                return true;
            }
            if (class107.field2692 == 120) {
                int var16 = class97.field2448.method518(28184);
                class101.field2608 = class78.field1967.method984(0, var16);
                class107.field2692 = -1;
                return true;
            }
            if (class107.field2692 == 214) {
                class108.field2743 = true;
                int var17 = class97.field2448.method496((byte) 122);
                class99 var18 = class40.method305(65535, var17);
                while (class97.field2448.field1556 < class27.field547) {
                    int var19 = class97.field2448.method498(-129);
                    int var20 = class97.field2448.method507((byte) -111);
                    int var21 = class97.field2448.method494(20471);
                    if (var21 == 255) {
                        var21 = class97.field2448.method496((byte) 122);
                    }
                    if (var19 >= 0 && var19 < var18.field2520.length) {
                        var18.field2520[var19] = var20;
                        var18.field2509[var19] = var21;
                    }
                }
                class107.field2692 = -1;
                return true;
            }
            if (class107.field2692 == 81) {
                class65.field1710 = class97.field2448.method494(20471);
                class8.field147 = class97.field2448.method528(-129);
                while (class97.field2448.field1556 < class27.field547) {
                    class107.field2692 = class97.field2448.method494(20471);
                    class87.method724(-44);
                }
                class107.field2692 = -1;
                return true;
            }
            if (class107.field2692 == 127) {
                long var22 = class97.field2448.method532(true);
                long var24 = (long) class97.field2448.method507((byte) -100);
                long var26 = (long) class97.field2448.method510(-93);
                long var28 = (var24 << 32) + var26;
                int var30 = class97.field2448.method494(20471);
                boolean var31 = false;
                for (int var32 = 0; var32 < 100; var32++) {
                    if (class126.field3087[var32] == var28) {
                        var31 = true;
                        break;
                    }
                }
                if (var30 <= 1) {
                    for (int var33 = 0; var33 < class1.field2; var33++) {
                        if (class44.field1040[var33] == var22) {
                            var31 = true;
                            break;
                        }
                    }
                }
                if (!var31 && class26.field523 == 0) {
                    class126.field3087[class68.field1729] = var28;
                    class68.field1729 = (class68.field1729 + 1) % 100;
                    class75 var34 = class38.method295(true, class97.field2448).method625(false);
                    if (var30 == 2 || var30 == 3) {
                        class31.method242(class69.method586(new class75[] { class24.field469, class78.method667(var22, -116).method652(1) }, (byte) 88), 7, -1, var34);
                    } else if (var30 == 1) {
                        class31.method242(class69.method586(new class75[] { class59.field1527, class78.method667(var22, -120).method652(1) }, (byte) 56), 7, -1, var34);
                    } else {
                        class31.method242(class78.method667(var22, -106).method652(1), 3, -1, var34);
                    }
                }
                class107.field2692 = -1;
                return true;
            }
            if (class107.field2692 == 240) {
                int var35 = class97.field2448.method518(28184);
                class75 var36 = class97.field2448.method509((byte) 78);
                class99 var37 = class40.method305(65535, var35);
                var37.field2529 = var36;
                if (var35 >> 16 == class15.field289[class130.field3167]) {
                    class108.field2743 = true;
                }
                class107.field2692 = -1;
                return true;
            }
            if (class107.field2692 == 86) {
                class129.field3152 = true;
                class52.field1285 = class97.field2448.method494(20471);
                class24.field476 = class97.field2448.method494(20471);
                class131.field3181 = class97.field2448.method507((byte) -113);
                class16.field300 = class97.field2448.method494(20471);
                class71.field1816 = class97.field2448.method494(20471);
                if (class71.field1816 >= 100) {
                    int var38 = class52.field1285 * 128 + 64;
                    int var39 = class24.field476 * 128 + 64;
                    int var40 = class126.method1000(var39, class99.field2510, false, var38) - class131.field3181;
                    int var41 = var38 - class84.field2082;
                    int var42 = var39 - class44.field1057;
                    int var43 = var40 - class12.field235;
                    int var44 = (int) Math.sqrt((double) (var41 * var41 + var42 * var42));
                    field889 = (int) (Math.atan2((double) var43, (double) var44) * 325.949D) & 0x7FF;
                    class111.field2809 = (int) (Math.atan2((double) var41, (double) var42) * -325.949D) & 0x7FF;
                    if (field889 < 128) {
                        field889 = 128;
                    }
                    if (field889 > 383) {
                        field889 = 383;
                    }
                }
                class107.field2692 = -1;
                return true;
            }
            if (class107.field2692 == 121) {
                class130.field3167 = class97.field2448.method519((byte) -110);
                class107.field2692 = -1;
                class30.field681 = true;
                class108.field2743 = true;
                return true;
            }
            if (class107.field2692 == 36) {
                class71.field1814 = class97.field2448.method494(20471);
                field894 = class97.field2448.method494(20471);
                class76.field1932 = class97.field2448.method494(20471);
                class107.field2692 = -1;
                class35.field841 = true;
                class55.field1350 = true;
                return true;
            }
            if (class107.field2692 == 122) {
                int var45 = class97.field2448.method516(false);
                int var46 = var45 & 0x1F;
                int var47 = var45 >> 5 & 0x1F;
                int var48 = var45 >> 10 & 0x1F;
                int var49 = class97.field2448.method496((byte) 122);
                class99 var50 = class40.method305(65535, var49);
                var50.field2488 = (var46 << 3) + (var47 << 11) + (var48 << 19);
                class107.field2692 = -1;
                return true;
            }
            if (class107.field2692 == 84) {
                int var51 = class97.field2448.method507((byte) -124);
                if (var51 == 65535) {
                    var51 = -1;
                }
                int var52 = class97.field2448.method494(20471);
                if (class15.field289[var52] != var51) {
                    class71.method598((byte) -81, class15.field289[var52]);
                    class15.field289[var52] = var51;
                }
                class30.field681 = true;
                class107.field2692 = -1;
                class108.field2743 = true;
                return true;
            }
            if (class107.field2692 == 12) {
                class43.field1032 = class97.field2448.method515((byte) -128);
                if (class43.field1032 == class130.field3167) {
                    class108.field2743 = true;
                    if (class43.field1032 == 3) {
                        class130.field3167 = 1;
                    } else {
                        class130.field3167 = 3;
                    }
                }
                class107.field2692 = -1;
                return true;
            }
            int var53 = 34 / ((arg0 - 45) / 45);
            if (class107.field2692 == 197) {
                class108.field2743 = true;
                int var54 = class97.field2448.method515((byte) 5);
                int var55 = class97.field2448.method519((byte) -122);
                int var56 = class97.field2448.method496((byte) 122);
                class78.field1974[var54] = var56;
                class90.field2211[var54] = var55;
                class130.field3160[var54] = 1;
                for (int var57 = 0; var57 < 98; var57++) {
                    if (class63.field1666[var57] <= var56) {
                        class130.field3160[var54] = var57 + 2;
                    }
                }
                class107.field2692 = -1;
                return true;
            }
            if (class107.field2692 == 206) {
                class99.field2485 = false;
                class128.field3124 = 2;
                class16.field294 = class16.field309;
                class107.field2692 = -1;
                class35.field841 = true;
                return true;
            }
            if (class107.field2692 == 192) {
                int var58 = class97.field2448.method516(false);
                int var59 = class97.field2448.method496((byte) 122);
                int var60 = class97.field2448.method516(false);
                class99 var61 = class40.method305(65535, var59);
                if (var60 == 65535) {
                    var61.field2506 = 0;
                    class107.field2692 = -1;
                    return true;
                }
                class10 var62 = class43.method326(var60, 0);
                var61.field2505 = var62.field185;
                var61.field2555 = var62.field168 * 100 / var58;
                var61.field2549 = var62.field201;
                var61.field2506 = 4;
                var61.field2515 = var60;
                class107.field2692 = -1;
                return true;
            }
            if (class107.field2692 == 224) {
                int var63 = class97.field2448.method494(20471);
                int var64 = class97.field2448.method494(20471);
                int var65 = class97.field2448.method494(20471);
                int var66 = class97.field2448.method494(20471);
                class40.field965[var63] = true;
                class55.field1410[var63] = var64;
                class59.field1494[var63] = var65;
                class42.field1011[var63] = var66;
                class64.field1702[var63] = 0;
                class107.field2692 = -1;
                return true;
            }
            if (class107.field2692 == 225) {
                int var67 = class97.field2448.method507((byte) -49);
                int var68 = class97.field2448.method494(20471);
                int var69 = class97.field2448.method507((byte) -72);
                if (class75.field1893 != 0 && var68 != 0 && class79.field1993 < 50) {
                    class98.field2464[class79.field1993] = var67;
                    class72.field1822[class79.field1993] = var68;
                    class36.field858[class79.field1993] = var69;
                    class109.field2766[class79.field1993] = null;
                    class58.field1449[class79.field1993] = 0;
                    class79.field1993++;
                }
                class107.field2692 = -1;
                return true;
            }
            if (class107.field2692 == 53) {
                int var70 = class97.field2448.method507((byte) -25);
                class74.method610(var70, 0);
                if (class36.field868 != -1) {
                    class71.method598((byte) 100, class36.field868);
                    class36.field868 = -1;
                    class30.field681 = true;
                    class108.field2743 = true;
                }
                if (class52.field1320 != -1) {
                    class71.method598((byte) -66, class52.field1320);
                    class52.field1320 = -1;
                    class17.method121(30, -9411);
                }
                if (class69.field1766 != -1) {
                    class71.method598((byte) -104, class69.field1766);
                    class69.field1766 = -1;
                }
                if (class130.field3155 != -1) {
                    class71.method598((byte) -112, class130.field3155);
                    class130.field3155 = -1;
                }
                if (class130.field3161 != var70) {
                    class71.method598((byte) 125, class130.field3161);
                    class130.field3161 = var70;
                }
                class107.field2692 = -1;
                class35.field841 = true;
                class75.field1894 = false;
                return true;
            }
            if (class107.field2692 == 150) {
                int var71 = class97.field2448.method507((byte) -41);
                int var72 = class97.field2448.method524(255);
                if (class130.field3161 != -1) {
                    class71.method598((byte) 127, class130.field3161);
                    class35.field841 = true;
                    class130.field3161 = -1;
                }
                if (class52.field1320 != -1) {
                    class71.method598((byte) -128, class52.field1320);
                    class52.field1320 = -1;
                    class17.method121(30, -9411);
                }
                if (class69.field1766 != -1) {
                    class71.method598((byte) -61, class69.field1766);
                    class69.field1766 = -1;
                }
                if (class130.field3155 != var72) {
                    class71.method598((byte) 78, class130.field3155);
                    class130.field3155 = var72;
                }
                if (class36.field868 != var71) {
                    class71.method598((byte) 110, class36.field868);
                    class36.field868 = var71;
                }
                if (class128.field3124 != 0) {
                    class128.field3124 = 0;
                    class35.field841 = true;
                }
                class75.field1894 = false;
                class107.field2692 = -1;
                class30.field681 = true;
                class108.field2743 = true;
                return true;
            }
            if (class107.field2692 == 75) {
                int var73 = class97.field2448.method521(-1);
                if (class55.field1377 != var73) {
                    class71.method598((byte) -106, class55.field1377);
                    class55.field1377 = var73;
                }
                class35.field841 = true;
                class107.field2692 = -1;
                return true;
            }
            if (class107.field2692 == 54 || class107.field2692 == 59 || class107.field2692 == 216 || class107.field2692 == 160 || class107.field2692 == 165 || class107.field2692 == 102 || class107.field2692 == 92 || class107.field2692 == 77 || class107.field2692 == 106 || class107.field2692 == 27 || class107.field2692 == 203) {
                class87.method724(92);
                class107.field2692 = -1;
                return true;
            }
            if (class107.field2692 == 114) {
                class75 var74 = class97.field2448.method509((byte) 78);
                if (var74.method626(class21.field424, (byte) 97)) {
                    class75 var86 = var74.method647(0, 0, var74.method644(class64.field1701, 0));
                    long var87 = var86.method643(true);
                    boolean var89 = false;
                    for (int var90 = 0; var90 < class1.field2; var90++) {
                        if (class44.field1040[var90] == var87) {
                            var89 = true;
                            break;
                        }
                    }
                    if (!var89 && class26.field523 == 0) {
                        class31.method242(var86, 4, -1, class100.field2597);
                    }
                } else if (var74.method626(class26.field529, (byte) 42)) {
                    class75 var75 = var74.method647(0, 0, var74.method644(class64.field1701, 0));
                    long var76 = var75.method643(true);
                    boolean var78 = false;
                    for (int var79 = 0; var79 < class1.field2; var79++) {
                        if (class44.field1040[var79] == var76) {
                            var78 = true;
                            break;
                        }
                    }
                    if (!var78 && class26.field523 == 0) {
                        class31.method242(var75, 8, -1, class42.field1004);
                    }
                } else if (var74.method626(class130.field3156, (byte) 116)) {
                    class75 var80 = var74.method647(0, 0, var74.method644(class64.field1701, 0));
                    long var81 = var80.method643(true);
                    boolean var83 = false;
                    for (int var84 = 0; var84 < class1.field2; var84++) {
                        if (class44.field1040[var84] == var81) {
                            var83 = true;
                            break;
                        }
                    }
                    if (!var83 && class26.field523 == 0) {
                        class75 var85 = var74.method647(0, var74.method644(class64.field1701, 0) + 1, var74.method621(-19198) + -9);
                        class31.method242(var80, 8, -1, var85);
                    }
                } else {
                    class31.method242(class16.field309, 0, -1, var74);
                }
                class107.field2692 = -1;
                return true;
            }
            if (class107.field2692 == 210) {
                for (int var91 = 0; var91 < class40.field957.length; var91++) {
                    if (class40.field957[var91] != null) {
                        class40.field957[var91].field1265 = -1;
                    }
                }
                for (int var92 = 0; var92 < class12.field231.length; var92++) {
                    if (class12.field231[var92] != null) {
                        class12.field231[var92].field1265 = -1;
                    }
                }
                class107.field2692 = -1;
                return true;
            }
            if (class107.field2692 == 186) {
                int var93 = class97.field2448.method514(-25530);
                class74.method610(var93, 0);
                if (class130.field3161 != -1) {
                    class71.method598((byte) 78, class130.field3161);
                    class35.field841 = true;
                    class130.field3161 = -1;
                }
                if (class52.field1320 != -1) {
                    class71.method598((byte) 104, class52.field1320);
                    class52.field1320 = -1;
                    class17.method121(30, -9411);
                }
                if (class69.field1766 != -1) {
                    class71.method598((byte) -82, class69.field1766);
                    class69.field1766 = -1;
                }
                if (class130.field3155 != -1) {
                    class71.method598((byte) -116, class130.field3155);
                    class130.field3155 = -1;
                }
                if (class36.field868 != var93) {
                    class71.method598((byte) -67, class36.field868);
                    class36.field868 = var93;
                }
                class108.field2743 = true;
                if (class128.field3124 != 0) {
                    class128.field3124 = 0;
                    class35.field841 = true;
                }
                class107.field2692 = -1;
                class75.field1894 = false;
                class30.field681 = true;
                return true;
            }
            if (class107.field2692 == 208) {
                int var94 = class97.field2448.method514(-25530);
                int var95 = class97.field2448.method514(-25530);
                int var96 = class97.field2448.method507((byte) -94);
                int var97 = class97.field2448.method511((byte) -79);
                class99 var98 = class40.method305(65535, var97);
                var98.field2549 = var94;
                var98.field2505 = var96;
                class107.field2692 = -1;
                var98.field2555 = var95;
                return true;
            }
            if (class107.field2692 == 35) {
                int var99 = class97.field2448.method528(-129);
                class75 var100 = class97.field2448.method509((byte) 78);
                int var101 = class97.field2448.method494(20471);
                if (var101 >= 1 && var101 <= 5) {
                    if (var100.method634(class64.field1682, 1)) {
                        var100 = null;
                    }
                    class68.field1738[var101 - 1] = var100;
                    class75.field1881[var101 - 1] = var99 == 0;
                }
                class107.field2692 = -1;
                return true;
            }
            if (class107.field2692 == 243) {
                class8.field147 = class97.field2448.method515((byte) -116);
                class65.field1710 = class97.field2448.method519((byte) 54);
                for (int var102 = class8.field147; var102 < class8.field147 + 8; var102++) {
                    for (int var103 = class65.field1710; var103 < class65.field1710 + 8; var103++) {
                        if (class112.field2847[class99.field2510][var102][var103] != null) {
                            class112.field2847[class99.field2510][var102][var103] = null;
                            class109.method896(-116, var103, var102);
                        }
                    }
                }
                for (class24 var104 = (class24) class40.field949.method248(32); var104 != null; var104 = (class24) class40.field949.method252(43)) {
                    if (class8.field147 <= var104.field473 && class8.field147 + 8 > var104.field473 && class65.field1710 <= var104.field457 && class65.field1710 + 8 > var104.field457 && class99.field2510 == var104.field464) {
                        var104.field472 = 0;
                    }
                }
                class107.field2692 = -1;
                return true;
            }
            if (class107.field2692 == 155) {
                int var105 = class97.field2448.method490(19753);
                class99 var106 = class40.method305(65535, var105);
                var106.field2506 = 3;
                var106.field2515 = class52.field1315.field2973.method333(40);
                class107.field2692 = -1;
                return true;
            }
            if (class107.field2692 == 187) {
                class101.field2613 = class97.field2448.method494(20471);
                if (class101.field2613 == 1) {
                    class8.field142 = class97.field2448.method507((byte) -92);
                }
                if (class101.field2613 >= 2 && class101.field2613 <= 6) {
                    if (class101.field2613 == 2) {
                        class25.field489 = 64;
                        class59.field1475 = 64;
                    }
                    if (class101.field2613 == 3) {
                        class59.field1475 = 64;
                        class25.field489 = 0;
                    }
                    if (class101.field2613 == 4) {
                        class59.field1475 = 64;
                        class25.field489 = 128;
                    }
                    if (class101.field2613 == 5) {
                        class25.field489 = 64;
                        class59.field1475 = 0;
                    }
                    if (class101.field2613 == 6) {
                        class25.field489 = 64;
                        class59.field1475 = 128;
                    }
                    class101.field2613 = 2;
                    class125.field3066 = class97.field2448.method507((byte) -34);
                    class5.field80 = class97.field2448.method507((byte) -61);
                    class74.field1849 = class97.field2448.method494(20471);
                }
                if (class101.field2613 == 10) {
                    class84.field2083 = class97.field2448.method507((byte) -54);
                }
                class107.field2692 = -1;
                return true;
            }
            if (class107.field2692 == 97) {
                class72.field1824 = class97.field2448.method494(20471);
                class107.field2692 = -1;
                return true;
            }
            if (class107.field2692 == 177) {
                if (class130.field3167 == 12) {
                    class108.field2743 = true;
                }
                class58.field1448 = class97.field2448.method534(true);
                class107.field2692 = -1;
                return true;
            }
            if (class107.field2692 == 148) {
                class85.method712(10);
                class107.field2692 = -1;
                return false;
            }
            if (class107.field2692 == 65) {
                class32.field736 = class97.field2448.method514(-25530);
                class107.field2692 = -1;
                return true;
            }
            if (class107.field2692 == 198) {
                class74.field1853 = 0;
                class107.field2692 = -1;
                return true;
            }
            if (class107.field2692 == 57) {
                if (class36.field868 != -1) {
                    class71.method598((byte) -46, class36.field868);
                    class108.field2743 = true;
                    class36.field868 = -1;
                    class30.field681 = true;
                }
                if (class130.field3161 != -1) {
                    class71.method598((byte) 124, class130.field3161);
                    class130.field3161 = -1;
                    class35.field841 = true;
                }
                if (class52.field1320 != -1) {
                    class71.method598((byte) -46, class52.field1320);
                    class52.field1320 = -1;
                    class17.method121(30, -9411);
                }
                if (class69.field1766 != -1) {
                    class71.method598((byte) 81, class69.field1766);
                    class69.field1766 = -1;
                }
                if (class130.field3155 != -1) {
                    class71.method598((byte) -46, class130.field3155);
                    class130.field3155 = -1;
                }
                class107.field2692 = -1;
                if (class128.field3124 != 0) {
                    class128.field3124 = 0;
                    class35.field841 = true;
                }
                class75.field1894 = false;
                return true;
            }
            if (class107.field2692 == 0) {
                int var107 = class97.field2448.method496((byte) 122);
                int var108 = class97.field2448.method524(255);
                class99 var109 = class40.method305(65535, var107);
                if (var109 != null && var109.field2535 == 0) {
                    if (var108 < 0) {
                        var108 = 0;
                    }
                    if (var108 > var109.field2558 - var109.field2546) {
                        var108 = var109.field2558 - var109.field2546;
                    }
                    var109.field2493 = var108;
                }
                class107.field2692 = -1;
                return true;
            }
            if (class107.field2692 == 202) {
                class16.field294 = class16.field309;
                class35.field841 = true;
                class107.field2692 = -1;
                class128.field3124 = 1;
                class99.field2485 = false;
                return true;
            }
            if (class107.field2692 == 136) {
                int var110 = class97.field2448.method513(1564473008);
                if (var110 >= 0) {
                    class74.method610(var110, 0);
                }
                if (class36.field876 != var110) {
                    class71.method598((byte) 79, class36.field876);
                    class36.field876 = var110;
                }
                class107.field2692 = -1;
                return true;
            }
            if (class107.field2692 == 29) {
                int var111 = class97.field2448.method514(-25530);
                if (var111 == 65535) {
                    var111 = -1;
                }
                if (var111 == -1 && class70.field1776 == 0) {
                    class117.method934(100);
                } else if (var111 != -1 && class130.field3172 != var111 && class27.field574 != 0 && class70.field1776 == 0) {
                    class117.method940(var111, class10.field224, class27.field574, 0, false, (byte) -26, 10, 0);
                }
                class107.field2692 = -1;
                class130.field3172 = var111;
                return true;
            }
            if (class107.field2692 == 41) {
                int var112 = class97.field2448.method510(-99);
                int var113 = class97.field2448.method507((byte) -92);
                if (var113 == 65535) {
                    var113 = -1;
                }
                if (class27.field574 != 0 && var113 != -1) {
                    class117.method937(var113, 1, true, false, class100.field2587, 0, class27.field574);
                    class70.field1776 = var112;
                }
                class107.field2692 = -1;
                return true;
            }
            if (class107.field2692 == 142) {
                for (int var114 = 0; var114 < class23.field448; var114++) {
                    class119 var115 = class69.method588((byte) -50, var114);
                    if (var115 != null && var115.field2939 == 0) {
                        class52.field1318[var114] = 0;
                        class62.field1613[var114] = 0;
                    }
                }
                class108.field2743 = true;
                class107.field2692 = -1;
                if (class55.field1377 != -1) {
                    class35.field841 = true;
                }
                return true;
            }
            if (class107.field2692 == 215) {
                int var116 = class97.field2448.method490(19753);
                int var117 = class97.field2448.method516(false);
                class99 var118 = class40.method305(65535, var116);
                var118.field2506 = 1;
                var118.field2515 = var117;
                class107.field2692 = -1;
                return true;
            }
            if (class107.field2692 == 183) {
                class30.method239(class97.field2448, class78.field1967, class27.field547, true);
                class107.field2692 = -1;
                return true;
            }
            if (class107.field2692 == 153) {
                class65.field1710 = class97.field2448.method528(-129);
                class8.field147 = class97.field2448.method519((byte) -111);
                class107.field2692 = -1;
                return true;
            }
            if (class107.field2692 == 31) {
                class98.method822((byte) -5, false);
                class107.field2692 = -1;
                return true;
            }
            if (class107.field2692 == 247) {
                long var119 = class97.field2448.method532(true);
                int var121 = class97.field2448.method507((byte) -103);
                class75 var122 = class78.method667(var119, -118).method652(1);
                for (int var123 = 0; var123 < class12.field226; var123++) {
                    if (class104.field2649[var123] == var119) {
                        if (class131.field3186[var123] != var121) {
                            class131.field3186[var123] = var121;
                            class108.field2743 = true;
                            if (var121 > 0) {
                                class31.method242(class16.field309, 5, -1, class69.method586(new class75[] { var122, class58.field1464 }, (byte) 80));
                            }
                            if (var121 == 0) {
                                class31.method242(class16.field309, 5, -1, class69.method586(new class75[] { var122, class76.field1933 }, (byte) 59));
                            }
                        }
                        var122 = null;
                        break;
                    }
                }
                if (var122 != null && class12.field226 < 200) {
                    class104.field2649[class12.field226] = var119;
                    class12.field242[class12.field226] = var122;
                    class131.field3186[class12.field226] = var121;
                    class108.field2743 = true;
                    class12.field226++;
                }
                boolean var124 = false;
                while (!var124) {
                    var124 = true;
                    for (int var125 = 0; var125 < class12.field226 - 1; var125++) {
                        if (class131.field3186[var125] != class58.field1468 && class131.field3186[var125 + 1] == class58.field1468 || class131.field3186[var125] == 0 && class131.field3186[var125 + 1] != 0) {
                            int var126 = class131.field3186[var125];
                            var124 = false;
                            class131.field3186[var125] = class131.field3186[var125 + 1];
                            class131.field3186[var125 + 1] = var126;
                            class75 var127 = class12.field242[var125];
                            class12.field242[var125] = class12.field242[var125 + 1];
                            class12.field242[var125 + 1] = var127;
                            long var128 = class104.field2649[var125];
                            class104.field2649[var125] = class104.field2649[var125 + 1];
                            class104.field2649[var125 + 1] = var128;
                            class108.field2743 = true;
                        }
                    }
                }
                class107.field2692 = -1;
                return true;
            }
            if (class107.field2692 == 211) {
                class129.field3152 = false;
                for (int var130 = 0; var130 < 5; var130++) {
                    class40.field965[var130] = false;
                }
                class107.field2692 = -1;
                return true;
            }
            if (class107.field2692 == 229) {
                int var131 = class97.field2448.method516(false);
                int var132 = class97.field2448.method518(28184);
                int var133 = class97.field2448.method507((byte) -33);
                class99 var134 = class40.method305(65535, var132);
                var134.field2547 = (var133 << 16) + var131;
                class107.field2692 = -1;
                return true;
            }
            if (class107.field2692 == 94) {
                class1.field2 = class27.field547 / 8;
                for (int var135 = 0; var135 < class1.field2; var135++) {
                    class44.field1040[var135] = class97.field2448.method532(true);
                }
                class107.field2692 = -1;
                return true;
            }
            if (class107.field2692 == 38) {
                class96.field2417 = class97.field2448.method494(20471);
                class107.field2692 = -1;
                return true;
            }
            if (class107.field2692 == 188) {
                int var136 = class97.field2448.method516(false);
                int var137 = class97.field2448.method516(false);
                class74.method610(var136, 0);
                if (var137 != -1) {
                    class74.method610(var137, 0);
                }
                if (class130.field3155 != -1) {
                    class71.method598((byte) -98, class130.field3155);
                    class130.field3155 = -1;
                }
                if (class36.field868 != -1) {
                    class71.method598((byte) 123, class36.field868);
                    class36.field868 = -1;
                }
                if (class130.field3161 != -1) {
                    class71.method598((byte) 120, class130.field3161);
                    class130.field3161 = -1;
                }
                if (class52.field1320 != var136) {
                    class71.method598((byte) 78, class52.field1320);
                    class52.field1320 = var136;
                    class17.method121(35, -9411);
                }
                if (class69.field1766 != var136) {
                    class71.method598((byte) -104, class69.field1766);
                    class69.field1766 = var137;
                }
                class107.field2692 = -1;
                class75.field1894 = false;
                class128.field3124 = 0;
                return true;
            }
            if (class107.field2692 == 159) {
                int var138 = class97.field2448.method518(28184);
                int var139 = class97.field2448.method507((byte) -36);
                class52.field1318[var139] = var138;
                if (class62.field1613[var139] != var138) {
                    class62.field1613[var139] = var138;
                    class129.method1011(var139, 0);
                    class108.field2743 = true;
                    if (class55.field1377 != -1) {
                        class35.field841 = true;
                    }
                }
                class107.field2692 = -1;
                return true;
            }
            if (class107.field2692 == 241) {
                class108.field2743 = true;
                int var140 = class97.field2448.method496((byte) 122);
                class99 var141 = class40.method305(65535, var140);
                int var142 = class97.field2448.method507((byte) -98);
                for (int var143 = 0; var143 < var142; var143++) {
                    int var144 = class97.field2448.method528(-129);
                    if (var144 == 255) {
                        var144 = class97.field2448.method511((byte) -103);
                    }
                    var141.field2520[var143] = class97.field2448.method514(-25530);
                    var141.field2509[var143] = var144;
                }
                for (int var145 = var142; var145 < var141.field2520.length; var145++) {
                    var141.field2520[var145] = 0;
                    var141.field2509[var145] = 0;
                }
                class107.field2692 = -1;
                return true;
            }
            if (class107.field2692 == 194) {
                int var146 = class97.field2448.method514(-25530);
                byte var147 = class97.field2448.method527(-338467704);
                class52.field1318[var146] = var147;
                if (class62.field1613[var146] != var147) {
                    class62.field1613[var146] = var147;
                    class129.method1011(var146, 0);
                    class108.field2743 = true;
                    if (class55.field1377 != -1) {
                        class35.field841 = true;
                    }
                }
                class107.field2692 = -1;
                return true;
            }
            if (class107.field2692 == 101) {
                class98.method822((byte) -5, true);
                class107.field2692 = -1;
                return true;
            }
            if (class107.field2692 == 2) {
                class129.field3152 = true;
                class69.field1759 = class97.field2448.method494(20471);
                class68.field1731 = class97.field2448.method494(20471);
                class70.field1778 = class97.field2448.method507((byte) -110);
                class32.field735 = class97.field2448.method494(20471);
                class61.field1609 = class97.field2448.method494(20471);
                if (class61.field1609 >= 100) {
                    class84.field2082 = class69.field1759 * 128 + 64;
                    class44.field1057 = class68.field1731 * 128 + 64;
                    class12.field235 = class126.method1000(class44.field1057, class99.field2510, false, class84.field2082) - class70.field1778;
                }
                class107.field2692 = -1;
                return true;
            }
            if (class107.field2692 == 109) {
                class84.method701(-16851);
                class107.field2692 = -1;
                return true;
            }
            if (class107.field2692 == 130) {
                boolean var148 = class97.field2448.method494(20471) == 1;
                int var149 = class97.field2448.method496((byte) 122);
                class99 var150 = class40.method305(65535, var149);
                class107.field2692 = -1;
                var150.field2540 = var148;
                return true;
            }
            if (class107.field2692 == 231) {
                int var151 = class97.field2448.method511((byte) -109);
                int var152 = class97.field2448.method521(-1);
                class99 var153 = class40.method305(65535, var151);
                class107.field2692 = -1;
                if (var153.field2495 != var152 || var152 == -1) {
                    var153.field2499 = 0;
                    var153.field2495 = var152;
                    var153.field2487 = 0;
                }
                return true;
            }
            if (class107.field2692 == 9) {
                class100.method831(0);
                class107.field2692 = -1;
                return true;
            }
            if (class107.field2692 == 68) {
                int var154 = class97.field2448.method514(-25530);
                class74.method610(var154, 0);
                if (class36.field868 != -1) {
                    class71.method598((byte) 109, class36.field868);
                    class108.field2743 = true;
                    class30.field681 = true;
                    class36.field868 = -1;
                }
                if (class130.field3161 != -1) {
                    class71.method598((byte) 92, class130.field3161);
                    class130.field3161 = -1;
                    class35.field841 = true;
                }
                if (class52.field1320 != -1) {
                    class71.method598((byte) -67, class52.field1320);
                    class52.field1320 = -1;
                    class17.method121(30, -9411);
                }
                if (class69.field1766 != -1) {
                    class71.method598((byte) 117, class69.field1766);
                    class69.field1766 = -1;
                }
                if (class130.field3155 != var154) {
                    class71.method598((byte) 101, class130.field3155);
                    class130.field3155 = var154;
                }
                class75.field1894 = false;
                class107.field2692 = -1;
                if (class128.field3124 != 0) {
                    class35.field841 = true;
                    class128.field3124 = 0;
                }
                return true;
            }
            class114.method918(12541, "T1 - " + class107.field2692 + "," + class62.field1648 + "," + class117.field2896 + " - " + class27.field547, null);
            class85.method712(10);
        } catch (IOException var158) {
            class122.method965((byte) -124);
        } catch (Exception var159) {
            String var156 = "T2 - " + class107.field2692 + "," + class62.field1648 + "," + class117.field2896 + " - " + class27.field547 + "," + (class62.field1618 + class52.field1315.field1270[0]) + "," + (class55.field1367 + class52.field1315.field1236[0]) + " - ";
            for (int var157 = 0; class27.field547 > var157 && var157 < 50; var157++) {
                var156 = var156 + class97.field2448.field1577[var157] + ",";
            }
            class114.method918(12541, var156, var159);
            class85.method712(10);
        }
        return true;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IB)Ls;", line = 2124)
    public static final class107 method289(int arg0, byte arg1) {
        field884++;
        class107 var2 = (class107) class82.field2039.method559((long) arg0, 29);
        if (var2 != null) {
            return var2;
        }
        if (arg1 > -124) {
            method287(-89, -66, 21, -107, 38, -59, 94);
        }
        byte[] var3 = class108.field2744.method436(arg0, 5, 12);
        class107 var4 = new class107();
        if (var3 != null) {
            var4.method883(-96, new class61(var3));
        }
        var4.method874((byte) -115);
        class82.field2039.method558((long) arg0, var4, 304);
        return var4;
    }
}
