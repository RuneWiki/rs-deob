import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class45 {

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "Lhj;")
    public static class69 field643 = class181.method1318(" loggt sich aus)3", (byte) -120);

    @OriginalMember(owner = "client!aj", name = "l", descriptor = "[[S")
    public static short[][] field653 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!aj", name = "m", descriptor = "Lhj;")
    public static class69 field654 = class181.method1318("hint_mapmarkers", (byte) -124);

    @OriginalMember(owner = "client!aj", name = "j", descriptor = "Lhj;")
    private static class69 field651 = class181.method1318("Select", (byte) -118);

    @OriginalMember(owner = "client!aj", name = "h", descriptor = "Z")
    public static boolean field649 = true;

    @OriginalMember(owner = "client!aj", name = "n", descriptor = "Lhj;")
    public static class69 field655 = class181.method1318("event_opbase", (byte) -127);

    @OriginalMember(owner = "client!aj", name = "k", descriptor = "Lhj;")
    public static class69 field652 = field651;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "I")
    public static int field642;

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "I")
    public static int field644;

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "I")
    public static int field646;

    @OriginalMember(owner = "client!aj", name = "f", descriptor = "I")
    public static int field647;

    @OriginalMember(owner = "client!aj", name = "g", descriptor = "I")
    public static int field648;

    @OriginalMember(owner = "client!aj", name = "i", descriptor = "I")
    public static int field650;

    @OriginalMember(owner = "client!aj", name = "o", descriptor = "I")
    public static int field656;

    @OriginalMember(owner = "client!aj", name = "p", descriptor = "I")
    public static int field657;

    @OriginalMember(owner = "client!aj", name = "q", descriptor = "I")
    public static int field658;

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "[[B")
    public static byte[][] field645;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(II)V")
    public static final void method251(int arg0, int arg1) {
        class102.field1905 = arg1;
        class109.field2089 = -1;
        class109.field2089 = -1;
        if (arg0 <= 104) {
            method255(true, (byte) 25);
        }
        class69.method456(1);
        field644++;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(ZLsd;I)V")
    public static final void method252(boolean arg0, class42 arg1, int arg2) {
        if (arg2 <= 58) {
            field645 = null;
        }
        field657++;
        if (arg0) {
            class10.field88 = 3;
            class20.method119((byte) 44, false);
            class44.field627 = 0;
            class11.field105 = 127;
            field649 = false;
            class250.field4537 = false;
            class57.field1030 = false;
            class144.field2679 = false;
            class81.field1554 = 255;
            class233.field4261 = false;
            class9.field63 = false;
            class133.field2476 = false;
            class98.field1852 = 0;
            class23.field334 = 0;
            class91.field1712 = false;
            class95.field1784 = false;
            class191.field3461 = 0;
            class119.field2249 = false;
            class91.field1726 = 127;
            class222.field4033 = false;
            class64.field1246 = false;
            class84.method625(false, arg1);
            return;
        }
        class10.field88 = 3;
        class20.method119((byte) 44, true);
        class81.field1554 = 255;
        class98.field1852 = 0;
        field649 = true;
        class250.field4537 = true;
        class11.field105 = 127;
        class133.field2476 = true;
        class23.field334 = 0;
        class191.field3461 = 2;
        class9.field63 = true;
        class150 var3 = null;
        class144.field2679 = true;
        class95.field1784 = true;
        class44.field627 = 0;
        class64.field1246 = true;
        class91.field1726 = 127;
        class91.field1712 = true;
        class233.field4261 = true;
        class119.field2249 = true;
        class57.field1030 = true;
        class222.field4033 = true;
        try {
            class86 var4 = arg1.method233((byte) -66, "runescape");
            while (var4.field1663 == 0) {
                class59.method356(false, 1L);
            }
            if (var4.field1663 == 1) {
                var3 = (class150) var4.field1666;
                byte[] var5 = new byte[(int) var3.method1126(93)];
                int var7;
                for (int var6 = 0; var6 < var5.length; var6 += var7) {
                    var7 = var3.method1128(var6, var5, -1, var5.length - var6);
                    if (var7 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class197.method1444(-88, new class128(var5));
            }
        } catch (Exception var9) {
        }
        try {
            if (var3 != null) {
                var3.method1129(1);
            }
        } catch (Exception var8) {
        }
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(II)V")
    public static final void method253(int arg0, int arg1) {
        int var2 = 127 % ((arg1 - 31) / 44);
        field648++;
        class124.field2299.method1708(-1009973721, arg0);
        class116.field2224.method1708(-1009973721, arg0);
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIB)I")
    public static final int method254(int arg0, int arg1, byte arg2) {
        if (arg2 != 108) {
            return -103;
        }
        field656++;
        if (arg1 == -2) {
            return 12345678;
        } else if (arg1 == -1) {
            if (arg0 < 2) {
                arg0 = 2;
            } else if (arg0 > 126) {
                arg0 = 126;
            }
            return arg0;
        } else {
            int var3 = (arg1 & 0x7F) * arg0 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg1 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(ZB)V")
    public static final void method255(boolean arg0, byte arg1) {
        class171.field3141 = new int[104];
        class221.field3975 = new int[104];
        class88.field1670 = 99;
        field647++;
        if (arg1 < 108) {
            method255(false, (byte) -47);
        }
        class258.field4632 = new int[104];
        class40.field571 = new int[104];
        byte var2;
        if (arg0) {
            var2 = 1;
        } else {
            var2 = 4;
        }
        class145.field2685 = new int[var2][105][105];
        class131.field2435 = new int[104];
        class181.field3285 = new byte[var2][104][104];
        class212.field3858 = new byte[var2][104][104];
        class41.field581 = new byte[var2][104][104];
        class253.field4560 = new byte[var2][104][104];
        class33.field454 = new byte[var2][105][105];
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)V")
    public static void method256(int arg0) {
        field655 = null;
        field651 = null;
        field643 = null;
        field653 = null;
        field654 = null;
        if (arg0 == 13848) {
            field645 = null;
            field652 = null;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(BI)V")
    public static final void method257(byte arg0, int arg1) {
        field650++;
        if (arg1 == -1 || !class131.method971(arg1, (byte) -105)) {
            return;
        }
        if (arg0 < 98) {
            method253(115, -8);
        }
        class50[] var2 = class116.field2222[arg1];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class50 var4 = var2[var3];
            if (var4.field830 != null) {
                class58 var5 = new class58();
                var5.field1050 = var4.field830;
                var5.field1048 = var4;
                class39.method217((byte) -99, 2000000, var5);
            }
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIIIZZIIILah;I)V")
    public static final void method258(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5, int arg6, int arg7, int arg8, class263 arg9, int arg10) {
        field642++;
        if (arg4 && !class163.method1215(122) && (class19.field246[0][arg10][arg0] & 0x2) == 0) {
            if ((class19.field246[arg8][arg10][arg0] & 0x10) != 0) {
                return;
            }
            if (class193.method1396(arg8, false, arg10, arg0) != class97.field1811) {
                return;
            }
        }
        if (class88.field1670 > arg8) {
            class88.field1670 = arg8;
        }
        if (arg3 != 8315) {
            method255(false, (byte) -85);
        }
        class12 var11 = class145.method1102(arg2, 0);
        int var12;
        int var13;
        if (arg6 == 1 || arg6 == 3) {
            var13 = var11.field127;
            var12 = var11.field153;
        } else {
            var12 = var11.field127;
            var13 = var11.field153;
        }
        int var14;
        int var15;
        if ((arg10 + var13) <= 104) {
            var14 = (var13 >> 1) + arg10;
            var15 = (var13 + 1 >> 1) + arg10;
        } else {
            var15 = arg10 + 1;
            var14 = arg10;
        }
        int var16;
        int var17;
        if (arg0 + var12 <= 104) {
            var16 = (var12 >> 1) + arg0;
            var17 = (var12 + 1 >> 1) + arg0;
        } else {
            var16 = arg0;
            var17 = arg0 + 1;
        }
        int var18 = (arg10 << 7) + (var13 << 6);
        int[][] var19 = class271.field4793[arg7];
        int[][] var20 = null;
        int var21 = (arg0 << 7) + (var12 << 6);
        int var22 = var19[var15][var16] + var19[var14][var17] + var19[var14][var16] + var19[var15][var17] >> 2;
        long var23 = (long) (arg6 << 20 | arg10 | arg0 << 7 | arg1 << 14 | 0x40000000);
        if (arg5) {
            var20 = class31.field429[0];
        } else if (arg7 < 3) {
            var20 = class271.field4793[arg7 + 1];
        }
        if (var11.field145 == 0 || arg5) {
            var23 |= Long.MIN_VALUE;
        }
        if (var11.field149 == 1) {
            var23 |= 0x400000L;
        }
        if (var11.field140) {
            var23 |= 0x80000000L;
        }
        long var25 = var23 | (long) arg2 << 32;
        if (var11.method60(60)) {
            class232.method1653(arg6, arg10, (byte) 85, (class38) null, arg8, var11, (class108) null, arg0);
        }
        boolean var27 = var11.field163 & !arg5;
        if (arg1 == 22) {
            if (class64.field1246 || var11.field145 != 0 || var11.field177 == 1 || var11.field156) {
                class177 var29;
                if (var11.field121 == -1 && var11.field120 == null) {
                    class9 var28 = var11.method61(var21, var19, 22, var20, (class121) null, arg4, arg6, var18, var22, (byte) -72, var27);
                    var29 = var28.field64;
                } else {
                    var29 = new class95(arg2, 22, arg6, arg7, arg10, arg0, var11.field121, var11.field170, (class177) null);
                }
                class151.method1132(arg8, arg10, arg0, var22, var29, var25, var11.field172);
                if (var11.field177 == 1 && arg9 != null) {
                    arg9.method1805(arg0, arg10, (byte) 22);
                }
            }
        } else if (arg1 == 10 || arg1 == 11) {
            class177 var69;
            if (var11.field121 == -1 && var11.field120 == null) {
                class9 var68 = var11.method61(var21, var19, 10, var20, (class121) null, arg4, arg1 == 11 ? arg6 + 4 : arg6, var18, var22, (byte) 111, var27);
                var69 = var68.field64;
            } else {
                var69 = new class95(arg2, 10, arg1 == 11 ? arg6 + 4 : arg6, arg7, arg10, arg0, var11.field121, var11.field170, (class177) null);
            }
            if (var69 != null) {
                boolean var70 = class124.method890(arg8, arg10, arg0, var22, var13, var12, var69, 0, var25);
                if (var11.field157 && var70 && arg4) {
                    int var71 = 15;
                    if (var69 instanceof class92) {
                        var71 = ((class92) var69).method650() / 4;
                        if (var71 > 30) {
                            var71 = 30;
                        }
                    }
                    for (int var72 = 0; var72 <= var13; var72++) {
                        for (int var73 = 0; var73 <= var12; var73++) {
                            if (class33.field454[arg8][arg10 + var72][arg0 + var73] < var71) {
                                class33.field454[arg8][arg10 + var72][arg0 + var73] = (byte) var71;
                            }
                        }
                    }
                }
            }
            if (var11.field177 != 0 && arg9 != null) {
                arg9.method1817(arg0, var11.field178, var12, var13, arg10, (byte) -34);
            }
        } else if (arg1 >= 12) {
            class177 var31;
            if (var11.field121 == -1 && var11.field120 == null) {
                class9 var30 = var11.method61(var21, var19, arg1, var20, (class121) null, arg4, arg6, var18, var22, (byte) 97, var27);
                var31 = var30.field64;
            } else {
                var31 = new class95(arg2, arg1, arg6, arg7, arg10, arg0, var11.field121, var11.field170, (class177) null);
            }
            class124.method890(arg8, arg10, arg0, var22, 1, 1, var31, 0, var25);
            if (arg4 && arg1 >= 12 && arg1 <= 17 && arg1 != 13 && arg8 > 0) {
                class145.field2685[arg8][arg10][arg0] = class230.method1644(class145.field2685[arg8][arg10][arg0], 4);
            }
            if (var11.field177 != 0 && arg9 != null) {
                arg9.method1817(arg0, var11.field178, var12, var13, arg10, (byte) -34);
            }
        } else if (arg1 == 0) {
            class177 var33;
            if (var11.field121 == -1 && var11.field120 == null) {
                class9 var32 = var11.method61(var21, var19, 0, var20, (class121) null, arg4, arg6, var18, var22, (byte) -95, var27);
                var33 = var32.field64;
            } else {
                var33 = new class95(arg2, 0, arg6, arg7, arg10, arg0, var11.field121, var11.field170, (class177) null);
            }
            class230.method1646(arg8, arg10, arg0, var22, var33, (class177) null, class24.field352[arg6], 0, var25);
            if (arg4) {
                if (arg6 == 0) {
                    if (var11.field157) {
                        class33.field454[arg8][arg10][arg0] = 50;
                        class33.field454[arg8][arg10][arg0 + 1] = 50;
                    }
                    if (var11.field134) {
                        class145.field2685[arg8][arg10][arg0] = class230.method1644(class145.field2685[arg8][arg10][arg0], 1);
                    }
                } else if (arg6 == 1) {
                    if (var11.field157) {
                        class33.field454[arg8][arg10][arg0 + 1] = 50;
                        class33.field454[arg8][arg10 + 1][arg0 + 1] = 50;
                    }
                    if (var11.field134) {
                        class145.field2685[arg8][arg10][arg0 + 1] = class230.method1644(class145.field2685[arg8][arg10][arg0 + 1], 2);
                    }
                } else if (arg6 == 2) {
                    if (var11.field157) {
                        class33.field454[arg8][arg10 + 1][arg0] = 50;
                        class33.field454[arg8][arg10 + 1][arg0 + 1] = 50;
                    }
                    if (var11.field134) {
                        class145.field2685[arg8][arg10 + 1][arg0] = class230.method1644(class145.field2685[arg8][arg10 + 1][arg0], 1);
                    }
                } else if (arg6 == 3) {
                    if (var11.field157) {
                        class33.field454[arg8][arg10][arg0] = 50;
                        class33.field454[arg8][arg10 + 1][arg0] = 50;
                    }
                    if (var11.field134) {
                        class145.field2685[arg8][arg10][arg0] = class230.method1644(class145.field2685[arg8][arg10][arg0], 2);
                    }
                }
            }
            if (var11.field177 != 0 && arg9 != null) {
                arg9.method1806(arg1, arg0, arg10, arg6, (byte) -125, var11.field178);
            }
            if (var11.field113 != 16) {
                class101.method750(arg8, arg10, arg0, var11.field113);
            }
        } else if (arg1 == 1) {
            class177 var35;
            if (var11.field121 == -1 && var11.field120 == null) {
                class9 var34 = var11.method61(var21, var19, 1, var20, (class121) null, arg4, arg6, var18, var22, (byte) 105, var27);
                var35 = var34.field64;
            } else {
                var35 = new class95(arg2, 1, arg6, arg7, arg10, arg0, var11.field121, var11.field170, (class177) null);
            }
            class230.method1646(arg8, arg10, arg0, var22, var35, (class177) null, class259.field4643[arg6], 0, var25);
            if (var11.field157 && arg4) {
                if (arg6 == 0) {
                    class33.field454[arg8][arg10][arg0 + 1] = 50;
                } else if (arg6 == 1) {
                    class33.field454[arg8][arg10 + 1][arg0 + 1] = 50;
                } else if (arg6 == 2) {
                    class33.field454[arg8][arg10 + 1][arg0] = 50;
                } else if (arg6 == 3) {
                    class33.field454[arg8][arg10][arg0] = 50;
                }
            }
            if (var11.field177 != 0 && arg9 != null) {
                arg9.method1806(arg1, arg0, arg10, arg6, (byte) -111, var11.field178);
            }
        } else if (arg1 == 2) {
            int var36 = arg6 + 1 & 0x3;
            class177 var38;
            class177 var40;
            if (var11.field121 == -1 && var11.field120 == null) {
                class9 var37 = var11.method61(var21, var19, 2, var20, (class121) null, arg4, arg6 + 4, var18, var22, (byte) 91, var27);
                var38 = var37.field64;
                class9 var39 = var11.method61(var21, var19, 2, var20, (class121) null, arg4, var36, var18, var22, (byte) -69, var27);
                var40 = var39.field64;
            } else {
                var38 = new class95(arg2, 2, arg6 + 4, arg7, arg10, arg0, var11.field121, var11.field170, (class177) null);
                var40 = new class95(arg2, 2, var36, arg7, arg10, arg0, var11.field121, var11.field170, (class177) null);
            }
            class230.method1646(arg8, arg10, arg0, var22, var38, var40, class24.field352[arg6], class24.field352[var36], var25);
            if (var11.field134 && arg4) {
                if (arg6 == 0) {
                    class145.field2685[arg8][arg10][arg0] = class230.method1644(class145.field2685[arg8][arg10][arg0], 1);
                    class145.field2685[arg8][arg10][arg0 + 1] = class230.method1644(class145.field2685[arg8][arg10][arg0 + 1], 2);
                } else if (arg6 == 1) {
                    class145.field2685[arg8][arg10][arg0 + 1] = class230.method1644(class145.field2685[arg8][arg10][arg0 + 1], 2);
                    class145.field2685[arg8][arg10 + 1][arg0] = class230.method1644(class145.field2685[arg8][arg10 + 1][arg0], 1);
                } else if (arg6 == 2) {
                    class145.field2685[arg8][arg10 + 1][arg0] = class230.method1644(class145.field2685[arg8][arg10 + 1][arg0], 1);
                    class145.field2685[arg8][arg10][arg0] = class230.method1644(class145.field2685[arg8][arg10][arg0], 2);
                } else if (arg6 == 3) {
                    class145.field2685[arg8][arg10][arg0] = class230.method1644(class145.field2685[arg8][arg10][arg0], 2);
                    class145.field2685[arg8][arg10][arg0] = class230.method1644(class145.field2685[arg8][arg10][arg0], 1);
                }
            }
            if (var11.field177 != 0 && arg9 != null) {
                arg9.method1806(arg1, arg0, arg10, arg6, (byte) -123, var11.field178);
            }
            if (var11.field113 != 16) {
                class101.method750(arg8, arg10, arg0, var11.field113);
            }
        } else if (arg1 == 3) {
            class177 var42;
            if (var11.field121 == -1 && var11.field120 == null) {
                class9 var41 = var11.method61(var21, var19, 3, var20, (class121) null, arg4, arg6, var18, var22, (byte) -49, var27);
                var42 = var41.field64;
            } else {
                var42 = new class95(arg2, 3, arg6, arg7, arg10, arg0, var11.field121, var11.field170, (class177) null);
            }
            class230.method1646(arg8, arg10, arg0, var22, var42, (class177) null, class259.field4643[arg6], 0, var25);
            if (var11.field157 && arg4) {
                if (arg6 == 0) {
                    class33.field454[arg8][arg10][arg0 + 1] = 50;
                } else if (arg6 == 1) {
                    class33.field454[arg8][arg10 + 1][arg0 + 1] = 50;
                } else if (arg6 == 2) {
                    class33.field454[arg8][arg10 + 1][arg0] = 50;
                } else if (arg6 == 3) {
                    class33.field454[arg8][arg10][arg0] = 50;
                }
            }
            if (var11.field177 != 0 && arg9 != null) {
                arg9.method1806(arg1, arg0, arg10, arg6, (byte) -113, var11.field178);
            }
        } else if (arg1 == 9) {
            class177 var44;
            if (var11.field121 == -1 && var11.field120 == null) {
                class9 var43 = var11.method61(var21, var19, arg1, var20, (class121) null, arg4, arg6, var18, var22, (byte) 124, var27);
                var44 = var43.field64;
            } else {
                var44 = new class95(arg2, arg1, arg6, arg7, arg10, arg0, var11.field121, var11.field170, (class177) null);
            }
            class124.method890(arg8, arg10, arg0, var22, 1, 1, var44, 0, var25);
            if (var11.field177 != 0 && arg9 != null) {
                arg9.method1817(arg0, var11.field178, var12, var13, arg10, (byte) -34);
            }
            if (var11.field113 != 16) {
                class101.method750(arg8, arg10, arg0, var11.field113);
            }
        } else if (arg1 == 4) {
            class177 var46;
            if (var11.field121 == -1 && var11.field120 == null) {
                class9 var45 = var11.method61(var21, var19, 4, var20, (class121) null, arg4, arg6, var18, var22, (byte) -25, var27);
                var46 = var45.field64;
            } else {
                var46 = new class95(arg2, 4, arg6, arg7, arg10, arg0, var11.field121, var11.field170, (class177) null);
            }
            class232.method1652(arg8, arg10, arg0, var22, var46, (class177) null, class24.field352[arg6], 0, 0, 0, var25);
        } else if (arg1 == 5) {
            long var47 = class188.method1367(arg8, arg10, arg0);
            int var49 = 16;
            if (var47 != 0L) {
                var49 = class145.method1102(Integer.MAX_VALUE & (int) (var47 >>> 32), 0).field113;
            }
            class177 var51;
            if (var11.field121 == -1 && var11.field120 == null) {
                class9 var50 = var11.method61(var21, var19, 4, var20, (class121) null, arg4, arg6, var18, var22, (byte) -111, var27);
                var51 = var50.field64;
            } else {
                var51 = new class95(arg2, 4, arg6, arg7, arg10, arg0, var11.field121, var11.field170, (class177) null);
            }
            class232.method1652(arg8, arg10, arg0, var22, var51, (class177) null, class24.field352[arg6], 0, class142.field2664[arg6] * var49, class251.field4545[arg6] * var49, var25);
        } else if (arg1 == 6) {
            long var52 = class188.method1367(arg8, arg10, arg0);
            int var54 = 8;
            if (var52 != 0L) {
                var54 = class145.method1102(Integer.MAX_VALUE & (int) (var52 >>> 32), arg3 - 8315).field113 / 2;
            }
            class177 var56;
            if (var11.field121 == -1 && var11.field120 == null) {
                class9 var55 = var11.method61(var21, var19, 4, var20, (class121) null, arg4, arg6 + 4, var18, var22, (byte) 89, var27);
                var56 = var55.field64;
            } else {
                var56 = new class95(arg2, 4, arg6 + 4, arg7, arg10, arg0, var11.field121, var11.field170, (class177) null);
            }
            class232.method1652(arg8, arg10, arg0, var22, var56, (class177) null, 256, arg6, class123.field2292[arg6] * var54, class197.field3585[arg6] * var54, var25);
        } else if (arg1 == 7) {
            int var57 = arg6 + 2 & 0x3;
            class177 var59;
            if (var11.field121 == -1 && var11.field120 == null) {
                class9 var58 = var11.method61(var21, var19, 4, var20, (class121) null, arg4, var57 + 4, var18, var22, (byte) 88, var27);
                var59 = var58.field64;
            } else {
                var59 = new class95(arg2, 4, var57 + 4, arg7, arg10, arg0, var11.field121, var11.field170, (class177) null);
            }
            class232.method1652(arg8, arg10, arg0, var22, var59, (class177) null, 256, var57, 0, 0, var25);
        } else if (arg1 == 8) {
            int var60 = 8;
            long var61 = class188.method1367(arg8, arg10, arg0);
            if (var61 != 0L) {
                var60 = class145.method1102((int) (var61 >>> 32) & Integer.MAX_VALUE, 0).field113 / 2;
            }
            int var63 = arg6 + 2 & 0x3;
            class177 var65;
            class177 var67;
            if (var11.field121 == -1 && var11.field120 == null) {
                class9 var64 = var11.method61(var21, var19, 4, var20, (class121) null, arg4, arg6 + 4, var18, var22, (byte) -24, var27);
                var65 = var64.field64;
                class9 var66 = var11.method61(var21, var19, 4, var20, (class121) null, arg4, var63 + 4, var18, var22, (byte) -65, var27);
                var67 = var66.field64;
            } else {
                var65 = new class95(arg2, 4, arg6 + 4, arg7, arg10, arg0, var11.field121, var11.field170, (class177) null);
                var67 = new class95(arg2, 4, var63 + 4, arg7, arg10, arg0, var11.field121, var11.field170, (class177) null);
            }
            class232.method1652(arg8, arg10, arg0, var22, var65, var67, 256, arg6, class123.field2292[arg6] * var60, class197.field3585[arg6] * var60, var25);
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIBLkk;III)V")
    public static final void method259(int arg0, int arg1, byte arg2, class222 arg3, int arg4, int arg5, int arg6) {
        class56.method346(arg1, arg0, arg4, true, arg3.field4005, arg6, arg5, arg3.field3985);
        field658++;
        if (arg2 <= 119) {
            method253(76, 59);
        }
    }
}
