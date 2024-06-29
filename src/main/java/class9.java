import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class9 {

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "Lgd;")
    public static class40 field226 = class14.method90(false, "backvmid3");

    @OriginalMember(owner = "client!bc", name = "i", descriptor = "Z")
    public static boolean field232 = false;

    @OriginalMember(owner = "client!bc", name = "j", descriptor = "Lgd;")
    public static class40 field233 = class14.method90(false, "@or2@");

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "Lgd;")
    private static class40 field228 = class14.method90(false, "Message");

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "Lgd;")
    public static class40 field227 = field228;

    @OriginalMember(owner = "client!bc", name = "k", descriptor = "Lgd;")
    public static class40 field234 = class14.method90(false, "blinken2:");

    @OriginalMember(owner = "client!bc", name = "l", descriptor = "Lgd;")
    public static class40 field235 = class14.method90(false, "Lade Sprites )2 ");

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "[Lgd;")
    public static class40[] field229 = new class40[100];

    @OriginalMember(owner = "client!bc", name = "n", descriptor = "Lgd;")
    public static class40 field237 = class14.method90(false, " ");

    @OriginalMember(owner = "client!bc", name = "p", descriptor = "I")
    public static int field239 = 0;

    @OriginalMember(owner = "client!bc", name = "r", descriptor = "I")
    public static int field241 = 0;

    @OriginalMember(owner = "client!bc", name = "q", descriptor = "[I")
    public static int[] field240 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "I")
    public static int field225;

    @OriginalMember(owner = "client!bc", name = "g", descriptor = "I")
    public static int field230;

    @OriginalMember(owner = "client!bc", name = "h", descriptor = "I")
    public static int field231;

    @OriginalMember(owner = "client!bc", name = "m", descriptor = "I")
    public static int field236;

    @OriginalMember(owner = "client!bc", name = "o", descriptor = "I")
    public static int field238;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "[I")
    public static int[] field224;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(BLrc;)Lgd;", line = 6)
    public static final class40 method49(byte arg0, class104 arg1) {
        if (arg0 != 63) {
            field241 = -111;
        }
        field231++;
        return class4.method14(arg0 - 175, 32767, arg1);
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(ILq;IILud;IIII)V", line = 26)
    public static final void method50(int arg0, class99 arg1, int arg2, int arg3, class124 arg4, int arg5, int arg6, int arg7, int arg8) {
        field238++;
        if (class8.field209 && (class112.field2716[0][arg0][arg7] & 0x2) == 0) {
            if ((class112.field2716[arg6][arg0][arg7] & 0x10) != 0) {
                return;
            }
            if (class7.method36((byte) 64, arg7, arg6, arg0) != class74.field1733) {
                return;
            }
        }
        if (class96.field2236 > arg6) {
            class96.field2236 = arg6;
        }
        int var9 = class89.field2021[arg6][arg0][arg7];
        int var10 = class89.field2021[arg6][arg0 + 1][arg7 + 1];
        int var11 = class89.field2021[arg6][arg0][arg7 + 1];
        int var12 = class89.field2021[arg6][arg0 + 1][arg7];
        class14 var13 = class114.method884(arg3, (byte) -56);
        int var14 = var10 + var11 + var9 + var12 >> 2;
        int var15 = (arg7 << 7) + (arg3 << 14) + arg0 + 1073741824;
        if (var13.field360 == 0) {
            var15 += Integer.MIN_VALUE;
        }
        int var16 = (arg2 << 6) + arg5;
        if (var13.field391 == 1) {
            var16 += 256;
        }
        if (var13.method92(false)) {
            class91.method608(arg6, arg2, -1, var13, arg0, arg7);
        }
        if (arg5 == 22) {
            if (!class8.field209 || var13.field360 != 0 || var13.field394) {
                class1 var17;
                if (var13.field381 == -1 && var13.field361 == null) {
                    var17 = var13.method85(var10, 22, var9, var12, var11, arg2, -1);
                } else {
                    var17 = new class38(arg3, 22, arg2, var9, var12, var10, var11, var13.field381, true, null);
                }
                arg4.method942(arg6, arg0, arg7, var14, var17, var15, var16);
                if (var13.field410 && var13.field360 == 1 && arg1 != null) {
                    arg1.method697(arg7, (byte) 127, arg0);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class1 var37;
            if (var13.field381 == -1 && var13.field361 == null) {
                var37 = var13.method85(var10, 10, var9, var12, var11, arg2, -1);
            } else {
                var37 = new class38(arg3, 10, arg2, var9, var12, var10, var11, var13.field381, true, null);
            }
            if (var37 != null) {
                int var38;
                int var39;
                if (arg2 == 1 || arg2 == 3) {
                    var39 = var13.field370;
                    var38 = var13.field363;
                } else {
                    var38 = var13.field370;
                    var39 = var13.field363;
                }
                int var40 = 0;
                if (arg5 == 11) {
                    var40 += 256;
                }
                if (arg4.method947(arg6, arg0, arg7, var14, var39, var38, var37, var40, var15, var16) && var13.field398) {
                    class97 var41;
                    if (var37 instanceof class97) {
                        var41 = (class97) var37;
                    } else {
                        var41 = var13.method85(var10, 10, var9, var12, var11, arg2, arg8);
                    }
                    if (var41 != null) {
                        for (int var42 = 0; var42 <= var39; var42++) {
                            for (int var43 = 0; var43 <= var38; var43++) {
                                int var44 = var41.method670() / 4;
                                if (var44 > 30) {
                                    var44 = 30;
                                }
                                if (var44 > class23.field538[arg6][arg0 + var42][arg7 + var43]) {
                                    class23.field538[arg6][arg0 + var42][arg7 + var43] = (byte) var44;
                                }
                            }
                        }
                    }
                }
            }
            if (var13.field410 && arg1 != null) {
                arg1.method691(arg2, var13.field379, false, var13.field363, arg7, var13.field370, arg0);
            }
        } else if (arg5 >= 12) {
            class1 var18;
            if (var13.field381 == -1 && var13.field361 == null) {
                var18 = var13.method85(var10, arg5, var9, var12, var11, arg2, arg8);
            } else {
                var18 = new class38(arg3, arg5, arg2, var9, var12, var10, var11, var13.field381, true, null);
            }
            arg4.method947(arg6, arg0, arg7, var14, 1, 1, var18, 0, var15, var16);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg6 > 0) {
                class54.field1370[arg6][arg0][arg7] = class43.method294(class54.field1370[arg6][arg0][arg7], 2340);
            }
            if (var13.field410 && arg1 != null) {
                arg1.method691(arg2, var13.field379, false, var13.field363, arg7, var13.field370, arg0);
            }
        } else if (~arg5 == arg8) {
            class1 var19;
            if (var13.field381 == -1 && var13.field361 == null) {
                var19 = var13.method85(var10, 0, var9, var12, var11, arg2, -1);
            } else {
                var19 = new class38(arg3, 0, arg2, var9, var12, var10, var11, var13.field381, true, null);
            }
            arg4.method971(arg6, arg0, arg7, var14, var19, null, class35.field901[arg2], 0, var15, var16);
            if (arg2 == 0) {
                if (var13.field398) {
                    class23.field538[arg6][arg0][arg7] = 50;
                    class23.field538[arg6][arg0][arg7 + 1] = 50;
                }
                if (var13.field368) {
                    class54.field1370[arg6][arg0][arg7] = class43.method294(class54.field1370[arg6][arg0][arg7], 585);
                }
            } else if (arg2 == 1) {
                if (var13.field398) {
                    class23.field538[arg6][arg0][arg7 + 1] = 50;
                    class23.field538[arg6][arg0 + 1][arg7 + 1] = 50;
                }
                if (var13.field368) {
                    class54.field1370[arg6][arg0][arg7 + 1] = class43.method294(class54.field1370[arg6][arg0][arg7 + 1], 1170);
                }
            } else if (arg2 == 2) {
                if (var13.field398) {
                    class23.field538[arg6][arg0 + 1][arg7] = 50;
                    class23.field538[arg6][arg0 + 1][arg7 + 1] = 50;
                }
                if (var13.field368) {
                    class54.field1370[arg6][arg0 + 1][arg7] = class43.method294(class54.field1370[arg6][arg0 + 1][arg7], 585);
                }
            } else if (arg2 == 3) {
                if (var13.field398) {
                    class23.field538[arg6][arg0][arg7] = 50;
                    class23.field538[arg6][arg0 + 1][arg7] = 50;
                }
                if (var13.field368) {
                    class54.field1370[arg6][arg0][arg7] = class43.method294(class54.field1370[arg6][arg0][arg7], 1170);
                }
            }
            if (var13.field410 && arg1 != null) {
                arg1.method692(arg0, arg7, arg2, (byte) 67, var13.field379, arg5);
            }
            if (var13.field365 != 16) {
                arg4.method963(arg6, arg0, arg7, var13.field365);
            }
        } else if (arg5 == 1) {
            class1 var20;
            if (var13.field381 == -1 && var13.field361 == null) {
                var20 = var13.method85(var10, 1, var9, var12, var11, arg2, -1);
            } else {
                var20 = new class38(arg3, 1, arg2, var9, var12, var10, var11, var13.field381, true, null);
            }
            arg4.method971(arg6, arg0, arg7, var14, var20, null, class96.field2239[arg2], 0, var15, var16);
            if (var13.field398) {
                if (arg2 == 0) {
                    class23.field538[arg6][arg0][arg7 + 1] = 50;
                } else if (arg2 == 1) {
                    class23.field538[arg6][arg0 + 1][arg7 + 1] = 50;
                } else if (arg2 == 2) {
                    class23.field538[arg6][arg0 + 1][arg7] = 50;
                } else if (arg2 == 3) {
                    class23.field538[arg6][arg0][arg7] = 50;
                }
            }
            if (var13.field410 && arg1 != null) {
                arg1.method692(arg0, arg7, arg2, (byte) 93, var13.field379, arg5);
            }
        } else if (arg5 == 2) {
            int var21 = arg2 + 1 & 0x3;
            class1 var22;
            class1 var23;
            if (var13.field381 == -1 && var13.field361 == null) {
                var22 = var13.method85(var10, 2, var9, var12, var11, arg2 + 4, -1);
                var23 = var13.method85(var10, 2, var9, var12, var11, var21, -1);
            } else {
                var22 = new class38(arg3, 2, arg2 + 4, var9, var12, var10, var11, var13.field381, true, null);
                var23 = new class38(arg3, 2, var21, var9, var12, var10, var11, var13.field381, true, null);
            }
            arg4.method971(arg6, arg0, arg7, var14, var22, var23, class35.field901[arg2], class35.field901[var21], var15, var16);
            if (var13.field368) {
                if (arg2 == 0) {
                    class54.field1370[arg6][arg0][arg7] = class43.method294(class54.field1370[arg6][arg0][arg7], 585);
                    class54.field1370[arg6][arg0][arg7 + 1] = class43.method294(class54.field1370[arg6][arg0][arg7 + 1], 1170);
                } else if (arg2 == 1) {
                    class54.field1370[arg6][arg0][arg7 + 1] = class43.method294(class54.field1370[arg6][arg0][arg7 + 1], 1170);
                    class54.field1370[arg6][arg0 + 1][arg7] = class43.method294(class54.field1370[arg6][arg0 + 1][arg7], 585);
                } else if (arg2 == 2) {
                    class54.field1370[arg6][arg0 + 1][arg7] = class43.method294(class54.field1370[arg6][arg0 + 1][arg7], 585);
                    class54.field1370[arg6][arg0][arg7] = class43.method294(class54.field1370[arg6][arg0][arg7], 1170);
                } else if (arg2 == 3) {
                    class54.field1370[arg6][arg0][arg7] = class43.method294(class54.field1370[arg6][arg0][arg7], 1170);
                    class54.field1370[arg6][arg0][arg7] = class43.method294(class54.field1370[arg6][arg0][arg7], 585);
                }
            }
            if (var13.field410 && arg1 != null) {
                arg1.method692(arg0, arg7, arg2, (byte) 93, var13.field379, arg5);
            }
            if (var13.field365 != 16) {
                arg4.method963(arg6, arg0, arg7, var13.field365);
            }
        } else if (arg5 == 3) {
            class1 var24;
            if (var13.field381 == -1 && var13.field361 == null) {
                var24 = var13.method85(var10, 3, var9, var12, var11, arg2, -1);
            } else {
                var24 = new class38(arg3, 3, arg2, var9, var12, var10, var11, var13.field381, true, null);
            }
            arg4.method971(arg6, arg0, arg7, var14, var24, null, class96.field2239[arg2], 0, var15, var16);
            if (var13.field398) {
                if (arg2 == 0) {
                    class23.field538[arg6][arg0][arg7 + 1] = 50;
                } else if (arg2 == 1) {
                    class23.field538[arg6][arg0 + 1][arg7 + 1] = 50;
                } else if (arg2 == 2) {
                    class23.field538[arg6][arg0 + 1][arg7] = 50;
                } else if (arg2 == 3) {
                    class23.field538[arg6][arg0][arg7] = 50;
                }
            }
            if (var13.field410 && arg1 != null) {
                arg1.method692(arg0, arg7, arg2, (byte) 113, var13.field379, arg5);
            }
        } else if (arg5 == 9) {
            class1 var25;
            if (var13.field381 == -1 && var13.field361 == null) {
                var25 = var13.method85(var10, arg5, var9, var12, var11, arg2, arg8);
            } else {
                var25 = new class38(arg3, arg5, arg2, var9, var12, var10, var11, var13.field381, true, null);
            }
            arg4.method947(arg6, arg0, arg7, var14, 1, 1, var25, 0, var15, var16);
            if (var13.field410 && arg1 != null) {
                arg1.method691(arg2, var13.field379, false, var13.field363, arg7, var13.field370, arg0);
            }
        } else {
            if (var13.field353) {
                if (arg2 == 1) {
                    int var29 = var11;
                    var11 = var10;
                    var10 = var12;
                    var12 = var9;
                    var9 = var29;
                } else if (arg2 == 2) {
                    int var26 = var11;
                    var11 = var12;
                    var12 = var26;
                    int var27 = var10;
                    var10 = var9;
                    var9 = var27;
                } else if (arg2 == 3) {
                    int var28 = var11;
                    var11 = var9;
                    var9 = var12;
                    var12 = var10;
                    var10 = var28;
                }
            }
            if (arg5 == 4) {
                class1 var30;
                if (var13.field381 == -1 && var13.field361 == null) {
                    var30 = var13.method85(var10, 4, var9, var12, var11, 0, arg8);
                } else {
                    var30 = new class38(arg3, 4, 0, var9, var12, var10, var11, var13.field381, true, null);
                }
                arg4.method974(arg6, arg0, arg7, var14, var30, class35.field901[arg2], arg2 * 512, 0, 0, var15, var16);
            } else if (arg5 == 5) {
                int var31 = arg4.method970(arg6, arg0, arg7);
                int var32 = 16;
                if (var31 > 0) {
                    var32 = class114.method884(var31 >> 14 & 0x7FFF, (byte) -56).field365;
                }
                class1 var33;
                if (var13.field381 == -1 && var13.field361 == null) {
                    var33 = var13.method85(var10, 4, var9, var12, var11, 0, arg8);
                } else {
                    var33 = new class38(arg3, 4, 0, var9, var12, var10, var11, var13.field381, true, null);
                }
                arg4.method974(arg6, arg0, arg7, var14, var33, class35.field901[arg2], arg2 * 512, field240[arg2] * var32, class23.field532[arg2] * var32, var15, var16);
            } else if (arg5 == 6) {
                class1 var34;
                if (var13.field381 == -1 && var13.field361 == null) {
                    var34 = var13.method85(var10, 4, var9, var12, var11, 0, arg8);
                } else {
                    var34 = new class38(arg3, 4, 0, var9, var12, var10, var11, var13.field381, true, null);
                }
                arg4.method974(arg6, arg0, arg7, var14, var34, 256, arg2, 0, 0, var15, var16);
            } else if (arg5 == 7) {
                class1 var35;
                if (var13.field381 == -1 && var13.field361 == null) {
                    var35 = var13.method85(var10, 4, var9, var12, var11, 0, -1);
                } else {
                    var35 = new class38(arg3, 4, 0, var9, var12, var10, var11, var13.field381, true, null);
                }
                arg4.method974(arg6, arg0, arg7, var14, var35, 512, arg2, 0, 0, var15, var16);
            } else if (arg5 == 8) {
                class1 var36;
                if (var13.field381 == -1 && var13.field361 == null) {
                    var36 = var13.method85(var10, 4, var9, var12, var11, 0, -1);
                } else {
                    var36 = new class38(arg3, 4, 0, var9, var12, var10, var11, var13.field381, true, null);
                }
                arg4.method974(arg6, arg0, arg7, var14, var36, 768, arg2, 0, 0, var15, var16);
            }
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V", line = 546)
    public static final void method51(int arg0) {
        if (arg0 != 1) {
            method52(127, -61, -80, 1);
        }
        field225++;
        System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german]");
        System.exit(1);
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIII)I", line = 563)
    public static final int method52(int arg0, int arg1, int arg2, int arg3) {
        field230++;
        int var4 = 256 - arg3;
        return arg1 >= -30 ? 82 : ((arg0 & 0xFF00) * var4 + (arg2 & 0xFF00) * arg3 & 0xFF0000) + ((arg0 & 0xFF00FF) * var4 + (arg2 & 0xFF00FF) * arg3 & 0xFF00FF00) >> 8;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Z)V", line = 580)
    public static void method53(boolean arg0) {
        field226 = null;
        field240 = null;
        field227 = null;
        field234 = null;
        field229 = null;
        if (arg0) {
            method53(false);
        }
        field233 = null;
        field235 = null;
        field228 = null;
        field224 = null;
        field237 = null;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)V", line = 626)
    public static final void method54(byte arg0) {
        field236++;
        class13.field341.method40((byte) -101);
        class96.field2232.method40((byte) -101);
        if (arg0 <= 78) {
            field239 = -65;
        }
        class18.field435.method40((byte) -101);
    }
}
