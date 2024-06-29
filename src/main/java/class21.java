import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class21 {

    @OriginalMember(owner = "client!cf", name = "q", descriptor = "I")
    public int field461 = 0;

    @OriginalMember(owner = "client!cf", name = "A", descriptor = "I")
    public int field471 = 0;

    @OriginalMember(owner = "client!cf", name = "o", descriptor = "Lic;")
    private static class59 field459 = class59.method433(0, "Members object");

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "Lic;")
    public static class59 field450 = field459;

    @OriginalMember(owner = "client!cf", name = "x", descriptor = "Lic;")
    private static class59 field468 = class59.method433(0, "Welcome to RuneScape");

    @OriginalMember(owner = "client!cf", name = "y", descriptor = "Lic;")
    public static class59 field469 = class59.method433(0, " )2> <col=ff9040>");

    @OriginalMember(owner = "client!cf", name = "m", descriptor = "[B")
    public static byte[] field457 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

    @OriginalMember(owner = "client!cf", name = "B", descriptor = "Lic;")
    public static class59 field472 = class59.method433(0, "Ung-Ultige Session)2ID)3");

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "[I")
    public static int[] field447 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!cf", name = "F", descriptor = "Lic;")
    public static class59 field476 = field468;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "I")
    public int field445;

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "I")
    public int field448;

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "I")
    public int field449;

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "I")
    public static int field451;

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "I")
    public static int field452;

    @OriginalMember(owner = "client!cf", name = "i", descriptor = "I")
    public static int field453;

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "I")
    public int field454;

    @OriginalMember(owner = "client!cf", name = "k", descriptor = "I")
    public static int field455;

    @OriginalMember(owner = "client!cf", name = "l", descriptor = "I")
    public int field456;

    @OriginalMember(owner = "client!cf", name = "n", descriptor = "I")
    public static int field458;

    @OriginalMember(owner = "client!cf", name = "r", descriptor = "I")
    public int field462;

    @OriginalMember(owner = "client!cf", name = "s", descriptor = "I")
    public int field463;

    @OriginalMember(owner = "client!cf", name = "t", descriptor = "I")
    public static int field464;

    @OriginalMember(owner = "client!cf", name = "u", descriptor = "I")
    public int field465;

    @OriginalMember(owner = "client!cf", name = "v", descriptor = "I")
    public int field466;

    @OriginalMember(owner = "client!cf", name = "w", descriptor = "I")
    public static int field467;

    @OriginalMember(owner = "client!cf", name = "z", descriptor = "I")
    public static int field470;

    @OriginalMember(owner = "client!cf", name = "D", descriptor = "I")
    public static int field474;

    @OriginalMember(owner = "client!cf", name = "E", descriptor = "I")
    public int field475;

    @OriginalMember(owner = "client!cf", name = "G", descriptor = "I")
    public int field477;

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "Lub;")
    public static class141 field446;

    @OriginalMember(owner = "client!cf", name = "C", descriptor = "Lka;")
    public class70 field473;

    @OriginalMember(owner = "client!cf", name = "p", descriptor = "[I")
    public static int[] field460;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(ZLr;)V")
    public static final void method115(boolean arg0, class118 arg1) {
        field455++;
        int var2 = 0;
        if (arg0) {
            return;
        }
        if (arg1.field2752 == 0) {
            var2 = class3.field58.method876(arg1.field2747, arg1.field2739, arg1.field2751);
        }
        int var3 = 0;
        int var4 = 0;
        int var5 = -1;
        if (arg1.field2752 == 1) {
            var2 = class3.field58.method877(arg1.field2747, arg1.field2739, arg1.field2751);
        }
        if (arg1.field2752 == 2) {
            var2 = class3.field58.method914(arg1.field2747, arg1.field2739, arg1.field2751);
        }
        if (arg1.field2752 == 3) {
            var2 = class3.field58.method906(arg1.field2747, arg1.field2739, arg1.field2751);
        }
        if (var2 != 0) {
            var5 = var2 >> 14 & 0x7FFF;
            int var6 = class3.field58.method868(arg1.field2747, arg1.field2739, arg1.field2751, var2);
            var3 = var6 & 0x1F;
            var4 = var6 >> 6 & 0x3;
        }
        arg1.field2755 = var5;
        arg1.field2743 = var4;
        arg1.field2756 = var3;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)V")
    public static final void method116(int arg0) {
        class17.field335.method676((byte) -112);
        if (arg0 == 256) {
            field458++;
        }
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(I)V")
    public static void method117(int arg0) {
        field450 = null;
        field459 = null;
        field457 = null;
        field460 = null;
        field472 = null;
        if (arg0 != -13) {
            field472 = null;
        }
        field476 = null;
        field446 = null;
        field469 = null;
        field468 = null;
        field447 = null;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Ljf;II)V")
    public static final void method118(class68 arg0, int arg1, int arg2) {
        if (class23.field561 < arg0.field1707) {
            class73.method606(arg0, -66);
        } else if (arg0.field1725 >= class23.field561) {
            method121((byte) 74, arg0);
        } else {
            class134.method1034(arg0, arg1 + 574);
        }
        if (arg0.field1730 < 128 || arg0.field1751 < 128 || arg0.field1730 >= 13184 || arg0.field1751 >= 13184) {
            arg0.field1730 = arg0.field1719[0] * 128 + arg0.field1712 * 64;
            arg0.field1685 = -1;
            arg0.field1682 = -1;
            arg0.field1725 = 0;
            arg0.field1707 = 0;
            arg0.field1751 = arg0.field1704[0] * 128 + arg0.field1712 * 64;
            arg0.method547((byte) -47);
        }
        field470++;
        if (class159.field3650 == arg0 && (arg0.field1730 < 1536 || arg0.field1751 < 1536 || arg0.field1730 >= 11776 || arg0.field1751 >= 11776)) {
            arg0.field1682 = -1;
            arg0.field1751 = arg0.field1704[0] * 128 + arg0.field1712 * 64;
            arg0.field1685 = -1;
            arg0.field1730 = arg0.field1719[0] * 128 + arg0.field1712 * 64;
            arg0.field1707 = 0;
            arg0.field1725 = 0;
            arg0.method547((byte) -47);
        }
        class53.method396(arg0, 114);
        if (arg1 != 1218) {
            field450 = null;
        }
        class36.method279(arg0, false);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(II)Ls;")
    public static final class125 method119(int arg0, int arg1) {
        field464++;
        class125 var2 = (class125) class159.field3664.method675((long) arg1, 26431);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class4.field93.method193(false, arg1, arg0);
        class125 var4 = new class125();
        var4.field2801 = arg1;
        if (var3 != null) {
            var4.method953(new class157(var3), (byte) 110);
        }
        var4.method949(2193);
        class159.field3664.method672(-30464, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIILq;ILkd;II)V")
    public static final void method120(int arg0, int arg1, int arg2, int arg3, class111 arg4, int arg5, class73 arg6, int arg7, int arg8) {
        field467++;
        if (class127.field2882 && (class121.field2785[0][arg7][arg5] & 0x2) == 0) {
            if ((class121.field2785[arg2][arg7][arg5] & 0x10) != 0) {
                return;
            }
            if (class121.method944(arg5, -1, arg7, arg2) != class96.field2437) {
                return;
            }
        }
        if (class43.field1107 > arg2) {
            class43.field1107 = arg2;
        }
        class19 var9 = class53.method397(arg1, arg8 + 13405);
        int var10;
        int var11;
        if (arg0 == 1 || arg0 == 3) {
            var11 = var9.field434;
            var10 = var9.field418;
        } else {
            var10 = var9.field434;
            var11 = var9.field418;
        }
        int var12;
        int var13;
        if (arg7 + var11 <= 104) {
            var12 = (var11 + 1 >> 1) + arg7;
            var13 = (var11 >> 1) + arg7;
        } else {
            var13 = arg7;
            var12 = arg7 + 1;
        }
        int var14;
        int var15;
        if (arg5 + var10 > 104) {
            var14 = arg5;
            var15 = arg5 + 1;
        } else {
            var15 = (var10 + 1 >> 1) + arg5;
            var14 = (var10 >> 1) + arg5;
        }
        int[][] var16 = class26.field695[arg2];
        int var17 = var16[var13][var14] + var16[var13][var15] + var16[var12][var14] + var16[var12][var15] >> 2;
        int var18 = (arg7 << 7) + (var11 << 6);
        int var19 = (arg0 << 6) + arg3;
        int var20 = (arg5 << 7) + ((arg1 << 14) + arg7 + 1073741824);
        if (var9.field375 == 0) {
            var20 += Integer.MIN_VALUE;
        }
        int var21 = (arg5 << 7) + (var10 << 6);
        if (var9.field433 == 1) {
            var19 += 256;
        }
        if (var9.method109(109)) {
            class82.method677((byte) 105, arg5, arg0, arg7, arg2, var9);
        }
        if (arg3 == 22) {
            if (!class127.field2882 || var9.field375 != 0 || var9.field391 == 1 || var9.field385) {
                class70 var22;
                if (var9.field411 == -1 && var9.field379 == null) {
                    var22 = var9.method100((byte) -107, var17, arg0, var18, var16, 22, var21);
                } else {
                    var22 = new class8(arg1, 22, arg0, arg2, arg7, arg5, var9.field411, true, null);
                }
                arg4.method871(arg2, arg7, arg5, var17, var22, var20, var19);
                if (var9.field391 == 1 && arg6 != null) {
                    arg6.method611((byte) 35, arg7, arg5);
                }
            }
        } else if (arg3 == 10 || arg3 == 11) {
            class70 var45;
            if (var9.field411 == -1 && var9.field379 == null) {
                var45 = var9.method100((byte) -88, var17, arg0, var18, var16, 10, var21);
            } else {
                var45 = new class8(arg1, 10, arg0, arg2, arg7, arg5, var9.field411, true, null);
            }
            if (var45 != null && arg4.method875(arg2, arg7, arg5, var17, var11, var10, var45, arg3 == 11 ? 256 : 0, var20, var19) && var9.field414) {
                int var46 = 15;
                if (var45 instanceof class92) {
                    var46 = ((class92) var45).method775() / 4;
                    if (var46 > 30) {
                        var46 = 30;
                    }
                }
                for (int var47 = 0; var47 <= var11; var47++) {
                    for (int var48 = 0; var48 <= var10; var48++) {
                        if (var46 > class126.field2868[arg2][arg7 + var47][arg5 + var48]) {
                            class126.field2868[arg2][arg7 + var47][arg5 + var48] = (byte) var46;
                        }
                    }
                }
            }
            if (var9.field391 != 0 && arg6 != null) {
                arg6.method615(var11, var10, arg5, 120, arg7, var9.field400);
            }
        } else if (arg3 >= 12) {
            class70 var23;
            if (var9.field411 == -1 && var9.field379 == null) {
                var23 = var9.method100((byte) -89, var17, arg0, var18, var16, arg3, var21);
            } else {
                var23 = new class8(arg1, arg3, arg0, arg2, arg7, arg5, var9.field411, true, null);
            }
            arg4.method875(arg2, arg7, arg5, var17, 1, 1, var23, 0, var20, var19);
            if (arg3 >= 12 && arg3 <= 17 && arg3 != 13 && arg2 > 0) {
                class108.field2605[arg2][arg7][arg5] = class52.method392(class108.field2605[arg2][arg7][arg5], 2340);
            }
            if (var9.field391 != 0 && arg6 != null) {
                arg6.method615(var11, var10, arg5, -12, arg7, var9.field400);
            }
        } else if (arg8 == 10) {
            if (arg3 == 0) {
                class70 var24;
                if (var9.field411 == -1 && var9.field379 == null) {
                    var24 = var9.method100((byte) -122, var17, arg0, var18, var16, 0, var21);
                } else {
                    var24 = new class8(arg1, 0, arg0, arg2, arg7, arg5, var9.field411, true, null);
                }
                arg4.method889(arg2, arg7, arg5, var17, var24, null, field447[arg0], 0, var20, var19);
                if (arg0 == 0) {
                    if (var9.field414) {
                        class126.field2868[arg2][arg7][arg5] = 50;
                        class126.field2868[arg2][arg7][arg5 + 1] = 50;
                    }
                    if (var9.field394) {
                        class108.field2605[arg2][arg7][arg5] = class52.method392(class108.field2605[arg2][arg7][arg5], 585);
                    }
                } else if (arg0 == 1) {
                    if (var9.field414) {
                        class126.field2868[arg2][arg7][arg5 + 1] = 50;
                        class126.field2868[arg2][arg7 + 1][arg5 + 1] = 50;
                    }
                    if (var9.field394) {
                        class108.field2605[arg2][arg7][arg5 + 1] = class52.method392(class108.field2605[arg2][arg7][arg5 + 1], 1170);
                    }
                } else if (arg0 == 2) {
                    if (var9.field414) {
                        class126.field2868[arg2][arg7 + 1][arg5] = 50;
                        class126.field2868[arg2][arg7 + 1][arg5 + 1] = 50;
                    }
                    if (var9.field394) {
                        class108.field2605[arg2][arg7 + 1][arg5] = class52.method392(class108.field2605[arg2][arg7 + 1][arg5], 585);
                    }
                } else if (arg0 == 3) {
                    if (var9.field414) {
                        class126.field2868[arg2][arg7][arg5] = 50;
                        class126.field2868[arg2][arg7 + 1][arg5] = 50;
                    }
                    if (var9.field394) {
                        class108.field2605[arg2][arg7][arg5] = class52.method392(class108.field2605[arg2][arg7][arg5], 1170);
                    }
                }
                if (var9.field391 != 0 && arg6 != null) {
                    arg6.method605(var9.field400, arg0, arg5, arg7, 3499, arg3);
                }
                if (var9.field425 != 16) {
                    arg4.method886(arg2, arg7, arg5, var9.field425);
                }
            } else if (arg3 == 1) {
                class70 var25;
                if (var9.field411 == -1 && var9.field379 == null) {
                    var25 = var9.method100((byte) -88, var17, arg0, var18, var16, 1, var21);
                } else {
                    var25 = new class8(arg1, 1, arg0, arg2, arg7, arg5, var9.field411, true, null);
                }
                arg4.method889(arg2, arg7, arg5, var17, var25, null, class16.field315[arg0], 0, var20, var19);
                if (var9.field414) {
                    if (arg0 == 0) {
                        class126.field2868[arg2][arg7][arg5 + 1] = 50;
                    } else if (arg0 == 1) {
                        class126.field2868[arg2][arg7 + 1][arg5 + 1] = 50;
                    } else if (arg0 == 2) {
                        class126.field2868[arg2][arg7 + 1][arg5] = 50;
                    } else if (arg0 == 3) {
                        class126.field2868[arg2][arg7][arg5] = 50;
                    }
                }
                if (var9.field391 != 0 && arg6 != null) {
                    arg6.method605(var9.field400, arg0, arg5, arg7, 3499, arg3);
                }
            } else if (arg3 == 2) {
                int var26 = arg0 + 1 & 0x3;
                class70 var27;
                class70 var28;
                if (var9.field411 == -1 && var9.field379 == null) {
                    var27 = var9.method100((byte) -89, var17, arg0 + 4, var18, var16, 2, var21);
                    var28 = var9.method100((byte) -124, var17, var26, var18, var16, 2, var21);
                } else {
                    var27 = new class8(arg1, 2, arg0 + 4, arg2, arg7, arg5, var9.field411, true, null);
                    var28 = new class8(arg1, 2, var26, arg2, arg7, arg5, var9.field411, true, null);
                }
                arg4.method889(arg2, arg7, arg5, var17, var27, var28, field447[arg0], field447[var26], var20, var19);
                if (var9.field394) {
                    if (arg0 == 0) {
                        class108.field2605[arg2][arg7][arg5] = class52.method392(class108.field2605[arg2][arg7][arg5], 585);
                        class108.field2605[arg2][arg7][arg5 + 1] = class52.method392(class108.field2605[arg2][arg7][arg5 + 1], 1170);
                    } else if (arg0 == 1) {
                        class108.field2605[arg2][arg7][arg5 + 1] = class52.method392(class108.field2605[arg2][arg7][arg5 + 1], 1170);
                        class108.field2605[arg2][arg7 + 1][arg5] = class52.method392(class108.field2605[arg2][arg7 + 1][arg5], 585);
                    } else if (arg0 == 2) {
                        class108.field2605[arg2][arg7 + 1][arg5] = class52.method392(class108.field2605[arg2][arg7 + 1][arg5], 585);
                        class108.field2605[arg2][arg7][arg5] = class52.method392(class108.field2605[arg2][arg7][arg5], 1170);
                    } else if (arg0 == 3) {
                        class108.field2605[arg2][arg7][arg5] = class52.method392(class108.field2605[arg2][arg7][arg5], 1170);
                        class108.field2605[arg2][arg7][arg5] = class52.method392(class108.field2605[arg2][arg7][arg5], 585);
                    }
                }
                if (var9.field391 != 0 && arg6 != null) {
                    arg6.method605(var9.field400, arg0, arg5, arg7, 3499, arg3);
                }
                if (var9.field425 != 16) {
                    arg4.method886(arg2, arg7, arg5, var9.field425);
                }
            } else if (arg3 == 3) {
                class70 var29;
                if (var9.field411 == -1 && var9.field379 == null) {
                    var29 = var9.method100((byte) -89, var17, arg0, var18, var16, 3, var21);
                } else {
                    var29 = new class8(arg1, 3, arg0, arg2, arg7, arg5, var9.field411, true, null);
                }
                arg4.method889(arg2, arg7, arg5, var17, var29, null, class16.field315[arg0], 0, var20, var19);
                if (var9.field414) {
                    if (arg0 == 0) {
                        class126.field2868[arg2][arg7][arg5 + 1] = 50;
                    } else if (arg0 == 1) {
                        class126.field2868[arg2][arg7 + 1][arg5 + 1] = 50;
                    } else if (arg0 == 2) {
                        class126.field2868[arg2][arg7 + 1][arg5] = 50;
                    } else if (arg0 == 3) {
                        class126.field2868[arg2][arg7][arg5] = 50;
                    }
                }
                if (var9.field391 != 0 && arg6 != null) {
                    arg6.method605(var9.field400, arg0, arg5, arg7, 3499, arg3);
                }
            } else if (arg3 == 9) {
                class70 var30;
                if (var9.field411 == -1 && var9.field379 == null) {
                    var30 = var9.method100((byte) -109, var17, arg0, var18, var16, arg3, var21);
                } else {
                    var30 = new class8(arg1, arg3, arg0, arg2, arg7, arg5, var9.field411, true, null);
                }
                arg4.method875(arg2, arg7, arg5, var17, 1, 1, var30, 0, var20, var19);
                if (var9.field391 != 0 && arg6 != null) {
                    arg6.method615(var11, var10, arg5, 103, arg7, var9.field400);
                }
                if (var9.field425 != 16) {
                    arg4.method886(arg2, arg7, arg5, var9.field425);
                }
            } else if (arg3 == 4) {
                class70 var31;
                if (var9.field411 == -1 && var9.field379 == null) {
                    var31 = var9.method100((byte) -112, var17, arg0, var18, var16, 4, var21);
                } else {
                    var31 = new class8(arg1, 4, arg0, arg2, arg7, arg5, var9.field411, true, null);
                }
                arg4.method893(arg2, arg7, arg5, var17, var31, null, field447[arg0], 0, 0, 0, var20, var19);
            } else if (arg3 == 5) {
                int var32 = arg4.method876(arg2, arg7, arg5);
                int var33 = 16;
                if (var32 != 0) {
                    var33 = class53.method397(var32 >> 14 & 0x7FFF, arg8 ^ 0x346D).field425;
                }
                class70 var34;
                if (var9.field411 == -1 && var9.field379 == null) {
                    var34 = var9.method100((byte) -102, var17, arg0, var18, var16, 4, var21);
                } else {
                    var34 = new class8(arg1, 4, arg0, arg2, arg7, arg5, var9.field411, true, null);
                }
                arg4.method893(arg2, arg7, arg5, var17, var34, null, field447[arg0], 0, class86.field2153[arg0] * var33, class46.field1158[arg0] * var33, var20, var19);
            } else if (arg3 == 6) {
                int var35 = arg4.method876(arg2, arg7, arg5);
                int var36 = 8;
                if (var35 != 0) {
                    var36 = class53.method397(var35 >> 14 & 0x7FFF, arg8 ^ 0x346D).field425 / 2;
                }
                class70 var37;
                if (var9.field411 == -1 && var9.field379 == null) {
                    var37 = var9.method100((byte) -108, var17, arg0 + 4, var18, var16, 4, var21);
                } else {
                    var37 = new class8(arg1, 4, arg0 + 4, arg2, arg7, arg5, var9.field411, true, null);
                }
                arg4.method893(arg2, arg7, arg5, var17, var37, null, 256, arg0, class128.field2897[arg0] * var36, class126.field2856[arg0] * var36, var20, var19);
            } else if (arg3 == 7) {
                int var38 = arg0 + 2 & 0x3;
                class70 var39;
                if (var9.field411 == -1 && var9.field379 == null) {
                    var39 = var9.method100((byte) -103, var17, var38 + 4, var18, var16, 4, var21);
                } else {
                    var39 = new class8(arg1, 4, var38 + 4, arg2, arg7, arg5, var9.field411, true, null);
                }
                arg4.method893(arg2, arg7, arg5, var17, var39, null, 256, var38, 0, 0, var20, var19);
            } else if (arg3 == 8) {
                int var40 = 8;
                int var41 = arg4.method876(arg2, arg7, arg5);
                int var42 = arg0 + 2 & 0x3;
                if (var41 != 0) {
                    var40 = class53.method397(var41 >> 14 & 0x7FFF, 13415).field425 / 2;
                }
                class70 var43;
                class70 var44;
                if (var9.field411 == -1 && var9.field379 == null) {
                    var43 = var9.method100((byte) -122, var17, arg0 + 4, var18, var16, 4, var21);
                    var44 = var9.method100((byte) -90, var17, var42 + 4, var18, var16, 4, var21);
                } else {
                    var43 = new class8(arg1, 4, arg0 + 4, arg2, arg7, arg5, var9.field411, true, null);
                    var44 = new class8(arg1, 4, var42 + 4, arg2, arg7, arg5, var9.field411, true, null);
                }
                arg4.method893(arg2, arg7, arg5, var17, var43, var44, 256, arg0, class128.field2897[arg0] * var40, class126.field2856[arg0] * var40, var20, var19);
            }
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(BLjf;)V")
    private static final void method121(byte arg0, class68 arg1) {
        if (class23.field561 == arg1.field1725 || arg1.field1685 == -1 || arg1.field1709 != 0 || arg1.field1754 + 1 > class49.method381(arg1.field1685, (byte) 124).field610[arg1.field1691]) {
            int var2 = arg1.field1725 - arg1.field1707;
            int var3 = class23.field561 - arg1.field1707;
            int var4 = arg1.field1750 * 128 + arg1.field1712 * 64;
            int var5 = arg1.field1755 * 128 + arg1.field1712 * 64;
            int var6 = arg1.field1736 * 128 + arg1.field1712 * 64;
            arg1.field1730 = ((var2 - var3) * var4 + var3 * var6) / var2;
            int var7 = arg1.field1731 * 128 + arg1.field1712 * 64;
            arg1.field1751 = ((var2 - var3) * var5 + var3 * var7) / var2;
        }
        if (arg0 != 74) {
            field457 = null;
        }
        if (arg1.field1694 == 0) {
            arg1.field1702 = 1024;
        }
        if (arg1.field1694 == 1) {
            arg1.field1702 = 1536;
        }
        arg1.field1698 = 0;
        if (arg1.field1694 == 2) {
            arg1.field1702 = 0;
        }
        if (arg1.field1694 == 3) {
            arg1.field1702 = 512;
        }
        field451++;
        arg1.field1724 = arg1.field1702;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIBLs;)V")
    public static final void method122(int arg0, int arg1, int arg2, byte arg3, class125 arg4) {
        field452++;
        if (class107.field2557 >= 400) {
            return;
        }
        if (arg4.field2815 != null) {
            arg4 = arg4.method954(200);
        }
        if (arg4 == null || !arg4.field2836) {
            return;
        }
        class59 var5 = arg4.field2810;
        if (arg4.field2799 != 0) {
            var5 = class46.method358(new class59[] { var5, class56.method414(arg4.field2799, 108, class159.field3650.field1239), class3.field70, class62.field1572, class46.method361(arg4.field2799, -71), class32.field870 }, (byte) -75);
        }
        if (class96.field2426 == 1) {
            class79.method651(arg2, class46.method358(new class59[] { class96.field2431, class34.field905, var5 }, (byte) -75), arg1, class24.field589, (byte) 74, 57, arg0);
            class84.field2087++;
        } else if (!class34.field907) {
            class59[] var6 = arg4.field2826;
            if (class62.field1575) {
                var6 = class134.method1038(var6, false);
            }
            if (var6 != null) {
                for (int var7 = 4; var7 >= 0; var7--) {
                    if (var6[var7] != null && !var6[var7].method423(class63.field1616, -61)) {
                        class5.field107++;
                        byte var8 = 0;
                        if (var7 == 0) {
                            var8 = 11;
                        }
                        if (var7 == 1) {
                            var8 = 23;
                        }
                        if (var7 == 2) {
                            var8 = 39;
                        }
                        if (var7 == 3) {
                            var8 = 31;
                        }
                        if (var7 == 4) {
                            var8 = 46;
                        }
                        class79.method651(arg2, class46.method358(new class59[] { class4.field95, var5 }, (byte) -75), arg1, var6[var7], (byte) 74, var8, arg0);
                    }
                }
            }
            class86.field2145++;
            if (var6 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var6[var9] != null && var6[var9].method423(class63.field1616, -61)) {
                        class151.field3291++;
                        short var10 = 0;
                        if (class159.field3650.field1239 < arg4.field2799) {
                            var10 = 2000;
                        }
                        int var11 = 0;
                        if (var9 == 0) {
                            var11 = var10 + 11;
                        }
                        if (var9 == 1) {
                            var11 = var10 + 23;
                        }
                        if (var9 == 2) {
                            var11 = var10 + 39;
                        }
                        if (var9 == 3) {
                            var11 = var10 + 31;
                        }
                        if (var9 == 4) {
                            var11 = var10 + 46;
                        }
                        class79.method651(arg2, class46.method358(new class59[] { class4.field95, var5 }, (byte) -75), arg1, var6[var9], (byte) 74, var11, arg0);
                    }
                }
            }
            class79.method651(arg2, class46.method358(new class59[] { class4.field95, var5 }, (byte) -75), arg1, client.field500, (byte) 74, 1001, arg0);
        } else if ((class143.field3147 & 0x2) == 2) {
            class79.method651(arg2, class46.method358(new class59[] { class143.field3139, class34.field905, var5 }, (byte) -75), arg1, class52.field1298, (byte) 74, 26, arg0);
            field474++;
        }
        int var12 = 59 / ((arg3 + 25) / 35);
    }
}
