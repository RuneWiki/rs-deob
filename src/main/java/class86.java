import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class86 {

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "Llb;")
    public static class78 field1902 = new class78();

    @OriginalMember(owner = "client!mc", name = "j", descriptor = "I")
    public static int field1906 = 0;

    @OriginalMember(owner = "client!mc", name = "i", descriptor = "[[[B")
    public static byte[][][] field1905 = new byte[4][104][104];

    @OriginalMember(owner = "client!mc", name = "l", descriptor = "Lsa;")
    public static class126 field1908 = null;

    @OriginalMember(owner = "client!mc", name = "m", descriptor = "I")
    public static int field1909 = 0;

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "B")
    public static byte field1899;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "I")
    public static int field1897;

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "I")
    public static int field1898;

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "I")
    public static int field1900;

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "I")
    public static int field1901;

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "I")
    public static int field1903;

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "I")
    public static int field1904;

    @OriginalMember(owner = "client!mc", name = "k", descriptor = "Lt;")
    public static class132 field1907;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(B)V")
    public static void method618(byte arg0) {
        field1907 = null;
        field1905 = null;
        field1908 = null;
        field1902 = null;
        if (arg0 != 107) {
            method620(24, 25, -113, 34, 55, null, null);
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(III)I")
    public static final int method619(int arg0, int arg1, int arg2) {
        field1903++;
        class130 var3 = (class130) class93.field1999.method1141((long) arg1, -1);
        int var4 = 3 % ((arg0 - 84) / 39);
        if (var3 == null) {
            return -1;
        } else if (arg2 >= 0 && arg2 < var3.field2975.length) {
            return var3.field2975[arg2];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIIII[B[Lge;)V")
    public static final void method620(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, class47[] arg6) {
        for (int var7 = 0; var7 < 4; var7++) {
            for (int var12 = 0; var12 < 64; var12++) {
                for (int var13 = 0; var13 < 64; var13++) {
                    if (arg4 + var12 > 0 && arg4 + var12 < 103 && arg1 + var13 > 0 && arg1 + var13 < 103) {
                        arg6[var7].field1118[arg4 + var12][arg1 + var13] = class41.method307(arg6[var7].field1118[arg4 + var12][arg1 + var13], -16777217);
                    }
                }
            }
        }
        field1898++;
        class138 var8 = new class138(arg5);
        if (arg2 != 585) {
            field1902 = null;
        }
        for (int var9 = 0; var9 < 4; var9++) {
            for (int var10 = 0; var10 < 64; var10++) {
                for (int var11 = 0; var11 < 64; var11++) {
                    class48.method357(arg4 + var10, var8, arg0, 8, arg1 + var11, var9, arg3, 0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(II)V")
    public static final void method621(int arg0, int arg1) {
        field1897++;
        if (~class11.field167 == arg0) {
            class33.field849.method82(arg1, 0);
        } else {
            class143.field3295 = arg1;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(BIII)V")
    public static final void method622(byte arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < 8; var4++) {
            for (int var7 = 0; var7 < 8; var7++) {
                class20.field431[arg2][arg3 + var4][arg1 + var7] = 0;
            }
        }
        if (arg3 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                class20.field431[arg2][arg3][arg1 + var5] = class20.field431[arg2][arg3 - 1][arg1 + var5];
            }
        }
        if (arg1 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                class20.field431[arg2][arg3 + var6][arg1] = class20.field431[arg2][arg3 + var6][arg1 - 1];
            }
        }
        if (arg0 != 26) {
            field1906 = -60;
        }
        if (arg3 > 0 && class20.field431[arg2][arg3 - 1][arg1] != 0) {
            class20.field431[arg2][arg3][arg1] = class20.field431[arg2][arg3 - 1][arg1];
        } else if (arg1 > 0 && class20.field431[arg2][arg3][arg1 - 1] != 0) {
            class20.field431[arg2][arg3][arg1] = class20.field431[arg2][arg3][arg1 - 1];
        } else if (arg3 > 0 && arg1 > 0 && class20.field431[arg2][arg3 - 1][arg1 - 1] != 0) {
            class20.field431[arg2][arg3][arg1] = class20.field431[arg2][arg3 - 1][arg1 - 1];
        }
        field1901++;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lge;IIIIILle;II)V")
    public static final void method623(class47 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class81 arg6, int arg7, int arg8) {
        field1900++;
        if (class10.field152 && (field1905[0][arg5][arg4] & 0x2) == 0) {
            if ((field1905[arg1][arg5][arg4] & 0x10) != 0) {
                return;
            }
            if (class80.method539(arg1, arg5, arg4, (byte) 110) != class112.field2414) {
                return;
            }
        }
        if (arg1 < class34.field859) {
            class34.field859 = arg1;
        }
        class24 var9 = class94.method652(arg3, arg7 + arg7);
        int var10;
        int var11;
        if (arg2 == 1 || arg2 == 3) {
            var11 = var9.field613;
            var10 = var9.field599;
        } else {
            var10 = var9.field613;
            var11 = var9.field599;
        }
        int var12;
        int var13;
        if (arg5 + var10 > 104) {
            var12 = arg5 + 1;
            var13 = arg5;
        } else {
            var13 = (var10 >> 1) + arg5;
            var12 = arg5 + (var10 + 1 >> 1);
        }
        int var14;
        int var15;
        if (arg4 + var11 <= 104) {
            var14 = (var11 + 1 >> 1) + arg4;
            var15 = (var11 >> 1) + arg4;
        } else {
            var14 = arg4 + 1;
            var15 = arg4;
        }
        int[][] var16 = class20.field431[arg1];
        int var17 = var16[var13][var15] + var16[var12][var15] + var16[var12][var14] + var16[var13][var14] >> 2;
        int var18 = (arg4 << 7) + (var11 << 6);
        int var19 = (arg5 << 7) + (var10 << 6);
        int var20 = (arg4 << 7) + (arg3 << 14) + arg5 + 1073741824;
        int var21 = (arg2 << 6) + arg8;
        if (var9.field580 == 0) {
            var20 += Integer.MIN_VALUE;
        }
        if (var9.field589 == 1) {
            var21 += 256;
        }
        if (var9.method197(~arg7)) {
            class95.method664(arg5, arg4, 66, arg1, var9, arg2);
        }
        if (arg8 == 22) {
            if (!class10.field152 || var9.field580 != 0 || var9.field570 == 1 || var9.field615) {
                class49 var22;
                if (var9.field603 == -1 && var9.field567 == null) {
                    var22 = var9.method189(arg2, var17, var19, var16, var18, 22, (byte) 108);
                } else {
                    var22 = new class111(arg3, 22, arg2, arg1, arg5, arg4, var9.field603, true, null);
                }
                arg6.method552(arg1, arg5, arg4, var17, var22, var20, var21);
                if (var9.field570 == 1 && arg0 != null) {
                    arg0.method343(-107, arg4, arg5);
                }
            }
        } else if (arg8 == 10 || arg8 == 11) {
            class49 var45;
            if (var9.field603 == -1 && var9.field567 == null) {
                var45 = var9.method189(arg2, var17, var19, var16, var18, 10, (byte) 108);
            } else {
                var45 = new class111(arg3, 10, arg2, arg1, arg5, arg4, var9.field603, true, null);
            }
            if (var45 != null && arg6.method547(arg1, arg5, arg4, var17, var10, var11, var45, arg8 == 11 ? 256 : 0, var20, var21) && var9.field614) {
                int var46 = 15;
                if (var45 instanceof class113) {
                    var46 = ((class113) var45).method829() / 4;
                    if (var46 > 30) {
                        var46 = 30;
                    }
                }
                for (int var47 = 0; var47 <= var10; var47++) {
                    for (int var48 = 0; var48 <= var11; var48++) {
                        if (class83.field1807[arg1][arg5 + var47][arg4 + var48] < var46) {
                            class83.field1807[arg1][arg5 + var47][arg4 + var48] = (byte) var46;
                        }
                    }
                }
            }
            if (var9.field570 != 0 && arg0 != null) {
                arg0.method347(16, arg4, var11, arg5, var10, var9.field592);
            }
        } else if (arg8 >= 12) {
            class49 var23;
            if (var9.field603 == -1 && var9.field567 == null) {
                var23 = var9.method189(arg2, var17, var19, var16, var18, arg8, (byte) 108);
            } else {
                var23 = new class111(arg3, arg8, arg2, arg1, arg5, arg4, var9.field603, true, null);
            }
            arg6.method547(arg1, arg5, arg4, var17, 1, 1, var23, 0, var20, var21);
            if (arg8 >= 12 && arg8 <= 17 && arg8 != 13 && arg1 > 0) {
                class138.field3182[arg1][arg5][arg4] = class13.method96(class138.field3182[arg1][arg5][arg4], 2340);
            }
            if (var9.field570 != 0 && arg0 != null) {
                arg0.method347(16, arg4, var11, arg5, var10, var9.field592);
            }
        } else if (arg8 == 0) {
            class49 var24;
            if (var9.field603 == -1 && var9.field567 == null) {
                var24 = var9.method189(arg2, var17, var19, var16, var18, 0, (byte) 108);
            } else {
                var24 = new class111(arg3, 0, arg2, arg1, arg5, arg4, var9.field603, true, null);
            }
            arg6.method553(arg1, arg5, arg4, var17, var24, null, class98.field2119[arg2], 0, var20, var21);
            if (arg2 == 0) {
                if (var9.field614) {
                    class83.field1807[arg1][arg5][arg4] = 50;
                    class83.field1807[arg1][arg5][arg4 + 1] = 50;
                }
                if (var9.field577) {
                    class138.field3182[arg1][arg5][arg4] = class13.method96(class138.field3182[arg1][arg5][arg4], 585);
                }
            } else if (arg2 == 1) {
                if (var9.field614) {
                    class83.field1807[arg1][arg5][arg4 + 1] = 50;
                    class83.field1807[arg1][arg5 + 1][arg4 + 1] = 50;
                }
                if (var9.field577) {
                    class138.field3182[arg1][arg5][arg4 + 1] = class13.method96(class138.field3182[arg1][arg5][arg4 + 1], 1170);
                }
            } else if (arg2 == 2) {
                if (var9.field614) {
                    class83.field1807[arg1][arg5 + 1][arg4] = 50;
                    class83.field1807[arg1][arg5 + 1][arg4 + 1] = 50;
                }
                if (var9.field577) {
                    class138.field3182[arg1][arg5 + 1][arg4] = class13.method96(class138.field3182[arg1][arg5 + 1][arg4], 585);
                }
            } else if (arg2 == 3) {
                if (var9.field614) {
                    class83.field1807[arg1][arg5][arg4] = 50;
                    class83.field1807[arg1][arg5 + 1][arg4] = 50;
                }
                if (var9.field577) {
                    class138.field3182[arg1][arg5][arg4] = class13.method96(class138.field3182[arg1][arg5][arg4], 1170);
                }
            }
            if (var9.field570 != 0 && arg0 != null) {
                arg0.method351(var9.field592, arg2, arg8, arg5, arg4, (byte) 116);
            }
            if (var9.field620 != 16) {
                arg6.method563(arg1, arg5, arg4, var9.field620);
            }
        } else if (arg8 == 1) {
            class49 var25;
            if (var9.field603 == -1 && var9.field567 == null) {
                var25 = var9.method189(arg2, var17, var19, var16, var18, 1, (byte) 108);
            } else {
                var25 = new class111(arg3, 1, arg2, arg1, arg5, arg4, var9.field603, true, null);
            }
            arg6.method553(arg1, arg5, arg4, var17, var25, null, class144.field3324[arg2], 0, var20, var21);
            if (var9.field614) {
                if (arg2 == 0) {
                    class83.field1807[arg1][arg5][arg4 + 1] = 50;
                } else if (arg2 == 1) {
                    class83.field1807[arg1][arg5 + 1][arg4 + 1] = 50;
                } else if (arg2 == 2) {
                    class83.field1807[arg1][arg5 + 1][arg4] = 50;
                } else if (arg2 == 3) {
                    class83.field1807[arg1][arg5][arg4] = 50;
                }
            }
            if (var9.field570 != 0 && arg0 != null) {
                arg0.method351(var9.field592, arg2, arg8, arg5, arg4, (byte) 122);
            }
        } else if (arg8 == 2) {
            int var26 = arg2 + 1 & 0x3;
            class49 var27;
            class49 var28;
            if (var9.field603 == -1 && var9.field567 == null) {
                var27 = var9.method189(arg2 + 4, var17, var19, var16, var18, 2, (byte) 108);
                var28 = var9.method189(var26, var17, var19, var16, var18, 2, (byte) 108);
            } else {
                var27 = new class111(arg3, 2, arg2 + 4, arg1, arg5, arg4, var9.field603, true, null);
                var28 = new class111(arg3, 2, var26, arg1, arg5, arg4, var9.field603, true, null);
            }
            arg6.method553(arg1, arg5, arg4, var17, var27, var28, class98.field2119[arg2], class98.field2119[var26], var20, var21);
            if (var9.field577) {
                if (arg2 == 0) {
                    class138.field3182[arg1][arg5][arg4] = class13.method96(class138.field3182[arg1][arg5][arg4], 585);
                    class138.field3182[arg1][arg5][arg4 + 1] = class13.method96(class138.field3182[arg1][arg5][arg4 + 1], 1170);
                } else if (arg2 == 1) {
                    class138.field3182[arg1][arg5][arg4 + 1] = class13.method96(class138.field3182[arg1][arg5][arg4 + 1], 1170);
                    class138.field3182[arg1][arg5 + 1][arg4] = class13.method96(class138.field3182[arg1][arg5 + 1][arg4], 585);
                } else if (arg2 == 2) {
                    class138.field3182[arg1][arg5 + 1][arg4] = class13.method96(class138.field3182[arg1][arg5 + 1][arg4], 585);
                    class138.field3182[arg1][arg5][arg4] = class13.method96(class138.field3182[arg1][arg5][arg4], 1170);
                } else if (arg2 == 3) {
                    class138.field3182[arg1][arg5][arg4] = class13.method96(class138.field3182[arg1][arg5][arg4], 1170);
                    class138.field3182[arg1][arg5][arg4] = class13.method96(class138.field3182[arg1][arg5][arg4], 585);
                }
            }
            if (var9.field570 != 0 && arg0 != null) {
                arg0.method351(var9.field592, arg2, arg8, arg5, arg4, (byte) 125);
            }
            if (var9.field620 != 16) {
                arg6.method563(arg1, arg5, arg4, var9.field620);
            }
        } else if (arg8 == 3) {
            class49 var29;
            if (var9.field603 == -1 && var9.field567 == null) {
                var29 = var9.method189(arg2, var17, var19, var16, var18, 3, (byte) 108);
            } else {
                var29 = new class111(arg3, 3, arg2, arg1, arg5, arg4, var9.field603, true, null);
            }
            arg6.method553(arg1, arg5, arg4, var17, var29, null, class144.field3324[arg2], 0, var20, var21);
            if (var9.field614) {
                if (arg2 == 0) {
                    class83.field1807[arg1][arg5][arg4 + 1] = 50;
                } else if (arg2 == 1) {
                    class83.field1807[arg1][arg5 + 1][arg4 + 1] = 50;
                } else if (arg2 == 2) {
                    class83.field1807[arg1][arg5 + 1][arg4] = 50;
                } else if (arg2 == 3) {
                    class83.field1807[arg1][arg5][arg4] = 50;
                }
            }
            if (var9.field570 != 0 && arg0 != null) {
                arg0.method351(var9.field592, arg2, arg8, arg5, arg4, (byte) 118);
            }
        } else if (arg8 == 9) {
            class49 var30;
            if (var9.field603 == -1 && var9.field567 == null) {
                var30 = var9.method189(arg2, var17, var19, var16, var18, arg8, (byte) 108);
            } else {
                var30 = new class111(arg3, arg8, arg2, arg1, arg5, arg4, var9.field603, true, null);
            }
            arg6.method547(arg1, arg5, arg4, var17, 1, 1, var30, 0, var20, var21);
            if (var9.field570 != 0 && arg0 != null) {
                arg0.method347(arg7 ^ 0x10, arg4, var11, arg5, var10, var9.field592);
            }
            if (var9.field620 != 16) {
                arg6.method563(arg1, arg5, arg4, var9.field620);
            }
        } else if (arg8 == 4) {
            class49 var31;
            if (var9.field603 == -1 && var9.field567 == null) {
                var31 = var9.method189(arg2, var17, var19, var16, var18, 4, (byte) 108);
            } else {
                var31 = new class111(arg3, 4, arg2, arg1, arg5, arg4, var9.field603, true, null);
            }
            arg6.method576(arg1, arg5, arg4, var17, var31, null, class98.field2119[arg2], 0, 0, 0, var20, var21);
        } else if (arg8 == 5) {
            int var32 = 16;
            int var33 = arg6.method556(arg1, arg5, arg4);
            if (var33 != 0) {
                var32 = class94.method652(var33 >> 14 & 0x7FFF, 0).field620;
            }
            class49 var34;
            if (var9.field603 == -1 && var9.field567 == null) {
                var34 = var9.method189(arg2, var17, var19, var16, var18, 4, (byte) 108);
            } else {
                var34 = new class111(arg3, 4, arg2, arg1, arg5, arg4, var9.field603, true, null);
            }
            arg6.method576(arg1, arg5, arg4, var17, var34, null, class98.field2119[arg2], 0, class22.field503[arg2] * var32, class87.field1921[arg2] * var32, var20, var21);
        } else if (arg8 == 6) {
            int var35 = 8;
            int var36 = arg6.method556(arg1, arg5, arg4);
            if (var36 != 0) {
                var35 = class94.method652(var36 >> 14 & 0x7FFF, 0).field620 / 2;
            }
            class49 var37;
            if (var9.field603 == -1 && var9.field567 == null) {
                var37 = var9.method189(arg2 + 4, var17, var19, var16, var18, 4, (byte) 108);
            } else {
                var37 = new class111(arg3, 4, arg2 + 4, arg1, arg5, arg4, var9.field603, true, null);
            }
            arg6.method576(arg1, arg5, arg4, var17, var37, null, 256, arg2, class73.field1580[arg2] * var35, class95.field2063[arg2] * var35, var20, var21);
        } else if (arg8 == 7) {
            int var38 = arg2 + 2 & 0x3;
            class49 var39;
            if (var9.field603 == -1 && var9.field567 == null) {
                var39 = var9.method189(var38 + 4, var17, var19, var16, var18, 4, (byte) 108);
            } else {
                var39 = new class111(arg3, 4, var38 + 4, arg1, arg5, arg4, var9.field603, true, null);
            }
            arg6.method576(arg1, arg5, arg4, var17, var39, null, 256, var38, 0, 0, var20, var21);
        } else if (arg8 == 8) {
            int var40 = 8;
            int var41 = arg6.method556(arg1, arg5, arg4);
            if (var41 != 0) {
                var40 = class94.method652(var41 >> 14 & 0x7FFF, 0).field620 / 2;
            }
            int var42 = arg2 + 2 & 0x3;
            class49 var43;
            class49 var44;
            if (var9.field603 == -1 && var9.field567 == null) {
                var43 = var9.method189(arg2 + 4, var17, var19, var16, var18, 4, (byte) 108);
                var44 = var9.method189(var42 + 4, var17, var19, var16, var18, 4, (byte) 108);
            } else {
                var43 = new class111(arg3, 4, arg2 + 4, arg1, arg5, arg4, var9.field603, true, null);
                var44 = new class111(arg3, 4, var42 + 4, arg1, arg5, arg4, var9.field603, true, null);
            }
            arg6.method576(arg1, arg5, arg4, var17, var43, var44, 256, arg2, class73.field1580[arg2] * var40, class95.field2063[arg2] * var40, var20, var21);
        }
    }
}
