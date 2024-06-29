import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class159 extends class212 {

    @OriginalMember(owner = "client!ib", name = "R", descriptor = "Lrc;")
    public class167 field2751;

    @OriginalMember(owner = "client!ib", name = "M", descriptor = "I")
    public static int field2746 = 0;

    @OriginalMember(owner = "client!ib", name = "I", descriptor = "I")
    public static int field2742 = 0;

    @OriginalMember(owner = "client!ib", name = "O", descriptor = "Lqe;")
    private static class168 field2748 = class66.method448("Loading fonts )2 ", -111);

    @OriginalMember(owner = "client!ib", name = "L", descriptor = "Lqe;")
    public static class168 field2745 = field2748;

    @OriginalMember(owner = "client!ib", name = "J", descriptor = "I")
    public static int field2743;

    @OriginalMember(owner = "client!ib", name = "N", descriptor = "I")
    public static int field2747;

    @OriginalMember(owner = "client!ib", name = "Q", descriptor = "I")
    public static int field2750;

    @OriginalMember(owner = "client!ib", name = "K", descriptor = "Lji;")
    public static class186 field2744;

    @OriginalMember(owner = "client!ib", name = "P", descriptor = "Lrd;")
    public static class207 field2749;

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(B)V")
    public static void method1040(byte arg0) {
        if (arg0 == 36) {
            field2744 = null;
            field2745 = null;
            field2749 = null;
            field2748 = null;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1041(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        class77 var8 = new class77();
        var8.field1149 = arg2 / 128;
        var8.field1170 = arg3 / 128;
        var8.field1153 = arg4 / 128;
        var8.field1163 = arg5 / 128;
        var8.field1165 = arg1;
        var8.field1157 = arg2;
        var8.field1150 = arg3;
        var8.field1154 = arg4;
        var8.field1145 = arg5;
        var8.field1159 = arg6;
        var8.field1169 = arg7;
        class134.field2341[arg0][class134.field2340[arg0]++] = var8;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IZBIZIIILtb;II)V")
    public static final void method1042(int arg0, boolean arg1, byte arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, class52 arg8, int arg9, int arg10) {
        field2750++;
        if (arg1 && !class119.method816((byte) 103) && (class205.field3561[0][arg3][arg0] & 0x2) == 0) {
            if ((class205.field3561[arg9][arg3][arg0] & 0x10) != 0) {
                return;
            }
            if (class179.method1180(-5552, arg0, arg9, arg3) != class118.field1938) {
                return;
            }
        }
        if (arg9 < class31.field378) {
            class31.field378 = arg9;
        }
        class70 var11 = class190.method1232(arg6, 13090);
        int var12;
        int var13;
        if (arg7 == 1 || arg7 == 3) {
            var13 = var11.field1048;
            var12 = var11.field1059;
        } else {
            var12 = var11.field1048;
            var13 = var11.field1059;
        }
        if (arg2 != -50) {
            field2748 = null;
        }
        int var14;
        int var15;
        if (arg3 + var13 > 104) {
            var14 = arg3 + 1;
            var15 = arg3;
        } else {
            var14 = arg3 + (var13 + 1 >> 1);
            var15 = (var13 >> 1) + arg3;
        }
        int var16;
        int var17;
        if (arg0 + var12 <= 104) {
            var16 = arg0 + (var12 >> 1);
            var17 = (var12 + 1 >> 1) + arg0;
        } else {
            var17 = arg0 + 1;
            var16 = arg0;
        }
        int[][] var18 = class23.field275[arg5];
        int var19 = (arg3 << 7) + (var13 << 6);
        int var20 = var18[var14][var16] + var18[var15][var16] + var18[var14][var17] + var18[var15][var17] >> 2;
        int var21 = (arg0 << 7) + (var12 << 6);
        int[][] var22 = null;
        long var23 = (long) (arg10 << 14 | arg0 << 7 | arg3 | arg7 << 20 | 0x40000000);
        if (var11.field1037 == 0 || arg4) {
            var23 |= Long.MIN_VALUE;
        }
        if (arg4) {
            var22 = class62.field849[0];
        } else if (arg5 < 3) {
            var22 = class23.field275[arg5 + 1];
        }
        if (var11.field1027 == 1) {
            var23 |= 0x400000L;
        }
        if (var11.field1016) {
            var23 |= 0xFFFFFFFF80000000L;
        }
        long var25 = var23 | (long) arg6 << 32;
        if (var11.method482(-1)) {
            class230.method1484(arg3, null, var11, arg9, null, arg0, (byte) 85, arg7);
        }
        boolean var27 = var11.field1051 & !arg4;
        if (arg10 == 22) {
            if (class227.field3866 || var11.field1037 != 0 || var11.field1022 == 1 || var11.field1010) {
                class13 var29;
                if (var11.field1062 == -1 && var11.field1069 == null) {
                    class164 var28 = var11.method478(var27, arg1, 22, null, var20, var22, var21, var18, var19, arg7, (byte) 115);
                    var29 = var28.field2805;
                } else {
                    var29 = new class178(arg6, 22, arg7, arg5, arg3, arg0, var11.field1062, var11.field1024, null);
                }
                class178.method1171(arg9, arg3, arg0, var20, var29, var25, var11.field1043);
                if (var11.field1022 == 1 && arg8 != null) {
                    arg8.method369(arg0, arg2 + 19, arg3);
                }
            }
        } else if (arg10 == 10 || arg10 == 11) {
            class13 var69;
            if (var11.field1062 == -1 && var11.field1069 == null) {
                class164 var68 = var11.method478(var27, arg1, 10, null, var20, var22, var21, var18, var19, arg10 == 11 ? arg7 + 4 : arg7, (byte) 115);
                var69 = var68.field2805;
            } else {
                var69 = new class178(arg6, 10, arg10 == 11 ? arg7 + 4 : arg7, arg5, arg3, arg0, var11.field1062, var11.field1024, null);
            }
            if (var69 != null) {
                boolean var70 = class243.method1595(arg9, arg3, arg0, var20, var13, var12, var69, 0, var25);
                if (var11.field1023 && var70 && arg1) {
                    int var71 = 15;
                    if (var69 instanceof class188) {
                        var71 = ((class188) var69).method248() / 4;
                        if (var71 > 30) {
                            var71 = 30;
                        }
                    }
                    for (int var72 = 0; var72 <= var13; var72++) {
                        for (int var73 = 0; var73 <= var12; var73++) {
                            if (class179.field3155[arg9][arg3 + var72][arg0 + var73] < var71) {
                                class179.field3155[arg9][arg3 + var72][arg0 + var73] = (byte) var71;
                            }
                        }
                    }
                }
            }
            if (var11.field1022 != 0 && arg8 != null) {
                arg8.method367(arg3, arg0, var11.field1025, var12, var13, arg2 ^ 0x40);
            }
        } else if (arg10 >= 12) {
            class13 var31;
            if (var11.field1062 == -1 && var11.field1069 == null) {
                class164 var30 = var11.method478(var27, arg1, arg10, null, var20, var22, var21, var18, var19, arg7, (byte) 115);
                var31 = var30.field2805;
            } else {
                var31 = new class178(arg6, arg10, arg7, arg5, arg3, arg0, var11.field1062, var11.field1024, null);
            }
            class243.method1595(arg9, arg3, arg0, var20, 1, 1, var31, 0, var25);
            if (arg1 && arg10 >= 12 && arg10 <= 17 && arg10 != 13 && arg9 > 0) {
                class139.field2467[arg9][arg3][arg0] = class102.method675(class139.field2467[arg9][arg3][arg0], 2340);
            }
            if (var11.field1022 != 0 && arg8 != null) {
                arg8.method367(arg3, arg0, var11.field1025, var12, var13, 78);
            }
        } else if (arg10 == 0) {
            class13 var33;
            if (var11.field1062 == -1 && var11.field1069 == null) {
                class164 var32 = var11.method478(var27, arg1, 0, null, var20, var22, var21, var18, var19, arg7, (byte) 115);
                var33 = var32.field2805;
            } else {
                var33 = new class178(arg6, 0, arg7, arg5, arg3, arg0, var11.field1062, var11.field1024, null);
            }
            class50.method351(arg9, arg3, arg0, var20, var33, null, class198.field3424[arg7], 0, var25);
            if (arg1) {
                if (arg7 == 0) {
                    if (var11.field1023) {
                        class179.field3155[arg9][arg3][arg0] = 50;
                        class179.field3155[arg9][arg3][arg0 + 1] = 50;
                    }
                    if (var11.field1067) {
                        class139.field2467[arg9][arg3][arg0] = class102.method675(class139.field2467[arg9][arg3][arg0], 585);
                    }
                } else if (arg7 == 1) {
                    if (var11.field1023) {
                        class179.field3155[arg9][arg3][arg0 + 1] = 50;
                        class179.field3155[arg9][arg3 + 1][arg0 + 1] = 50;
                    }
                    if (var11.field1067) {
                        class139.field2467[arg9][arg3][arg0 + 1] = class102.method675(class139.field2467[arg9][arg3][arg0 + 1], 1170);
                    }
                } else if (arg7 == 2) {
                    if (var11.field1023) {
                        class179.field3155[arg9][arg3 + 1][arg0] = 50;
                        class179.field3155[arg9][arg3 + 1][arg0 + 1] = 50;
                    }
                    if (var11.field1067) {
                        class139.field2467[arg9][arg3 + 1][arg0] = class102.method675(class139.field2467[arg9][arg3 + 1][arg0], 585);
                    }
                } else if (arg7 == 3) {
                    if (var11.field1023) {
                        class179.field3155[arg9][arg3][arg0] = 50;
                        class179.field3155[arg9][arg3 + 1][arg0] = 50;
                    }
                    if (var11.field1067) {
                        class139.field2467[arg9][arg3][arg0] = class102.method675(class139.field2467[arg9][arg3][arg0], 1170);
                    }
                }
            }
            if (var11.field1022 != 0 && arg8 != null) {
                arg8.method378(arg0, arg7, arg10, var11.field1025, (byte) 80, arg3);
            }
            if (var11.field1008 != 16) {
                class50.method350(arg9, arg3, arg0, var11.field1008);
            }
        } else if (arg10 == 1) {
            class13 var35;
            if (var11.field1062 == -1 && var11.field1069 == null) {
                class164 var34 = var11.method478(var27, arg1, 1, null, var20, var22, var21, var18, var19, arg7, (byte) 115);
                var35 = var34.field2805;
            } else {
                var35 = new class178(arg6, 1, arg7, arg5, arg3, arg0, var11.field1062, var11.field1024, null);
            }
            class50.method351(arg9, arg3, arg0, var20, var35, null, class13.field113[arg7], 0, var25);
            if (var11.field1023 && arg1) {
                if (arg7 == 0) {
                    class179.field3155[arg9][arg3][arg0 + 1] = 50;
                } else if (arg7 == 1) {
                    class179.field3155[arg9][arg3 + 1][arg0 + 1] = 50;
                } else if (arg7 == 2) {
                    class179.field3155[arg9][arg3 + 1][arg0] = 50;
                } else if (arg7 == 3) {
                    class179.field3155[arg9][arg3][arg0] = 50;
                }
            }
            if (var11.field1022 != 0 && arg8 != null) {
                arg8.method378(arg0, arg7, arg10, var11.field1025, (byte) 80, arg3);
            }
        } else if (arg10 == 2) {
            int var36 = arg7 + 1 & 0x3;
            class13 var38;
            class13 var40;
            if (var11.field1062 == -1 && var11.field1069 == null) {
                class164 var37 = var11.method478(var27, arg1, 2, null, var20, var22, var21, var18, var19, arg7 + 4, (byte) 115);
                var38 = var37.field2805;
                class164 var39 = var11.method478(var27, arg1, 2, null, var20, var22, var21, var18, var19, var36, (byte) 115);
                var40 = var39.field2805;
            } else {
                var38 = new class178(arg6, 2, arg7 + 4, arg5, arg3, arg0, var11.field1062, var11.field1024, null);
                var40 = new class178(arg6, 2, var36, arg5, arg3, arg0, var11.field1062, var11.field1024, null);
            }
            class50.method351(arg9, arg3, arg0, var20, var38, var40, class198.field3424[arg7], class198.field3424[var36], var25);
            if (var11.field1067 && arg1) {
                if (arg7 == 0) {
                    class139.field2467[arg9][arg3][arg0] = class102.method675(class139.field2467[arg9][arg3][arg0], 585);
                    class139.field2467[arg9][arg3][arg0 + 1] = class102.method675(class139.field2467[arg9][arg3][arg0 + 1], 1170);
                } else if (arg7 == 1) {
                    class139.field2467[arg9][arg3][arg0 + 1] = class102.method675(class139.field2467[arg9][arg3][arg0 + 1], 1170);
                    class139.field2467[arg9][arg3 + 1][arg0] = class102.method675(class139.field2467[arg9][arg3 + 1][arg0], 585);
                } else if (arg7 == 2) {
                    class139.field2467[arg9][arg3 + 1][arg0] = class102.method675(class139.field2467[arg9][arg3 + 1][arg0], 585);
                    class139.field2467[arg9][arg3][arg0] = class102.method675(class139.field2467[arg9][arg3][arg0], 1170);
                } else if (arg7 == 3) {
                    class139.field2467[arg9][arg3][arg0] = class102.method675(class139.field2467[arg9][arg3][arg0], 1170);
                    class139.field2467[arg9][arg3][arg0] = class102.method675(class139.field2467[arg9][arg3][arg0], 585);
                }
            }
            if (var11.field1022 != 0 && arg8 != null) {
                arg8.method378(arg0, arg7, arg10, var11.field1025, (byte) 80, arg3);
            }
            if (var11.field1008 != 16) {
                class50.method350(arg9, arg3, arg0, var11.field1008);
            }
        } else if (arg10 == 3) {
            class13 var42;
            if (var11.field1062 == -1 && var11.field1069 == null) {
                class164 var41 = var11.method478(var27, arg1, 3, null, var20, var22, var21, var18, var19, arg7, (byte) 115);
                var42 = var41.field2805;
            } else {
                var42 = new class178(arg6, 3, arg7, arg5, arg3, arg0, var11.field1062, var11.field1024, null);
            }
            class50.method351(arg9, arg3, arg0, var20, var42, null, class13.field113[arg7], 0, var25);
            if (var11.field1023 && arg1) {
                if (arg7 == 0) {
                    class179.field3155[arg9][arg3][arg0 + 1] = 50;
                } else if (arg7 == 1) {
                    class179.field3155[arg9][arg3 + 1][arg0 + 1] = 50;
                } else if (arg7 == 2) {
                    class179.field3155[arg9][arg3 + 1][arg0] = 50;
                } else if (arg7 == 3) {
                    class179.field3155[arg9][arg3][arg0] = 50;
                }
            }
            if (var11.field1022 != 0 && arg8 != null) {
                arg8.method378(arg0, arg7, arg10, var11.field1025, (byte) 80, arg3);
            }
        } else if (arg10 == 9) {
            class13 var44;
            if (var11.field1062 == -1 && var11.field1069 == null) {
                class164 var43 = var11.method478(var27, arg1, arg10, null, var20, var22, var21, var18, var19, arg7, (byte) 115);
                var44 = var43.field2805;
            } else {
                var44 = new class178(arg6, arg10, arg7, arg5, arg3, arg0, var11.field1062, var11.field1024, null);
            }
            class243.method1595(arg9, arg3, arg0, var20, 1, 1, var44, 0, var25);
            if (var11.field1022 != 0 && arg8 != null) {
                arg8.method367(arg3, arg0, var11.field1025, var12, var13, 44);
            }
            if (var11.field1008 != 16) {
                class50.method350(arg9, arg3, arg0, var11.field1008);
            }
        } else if (arg10 == 4) {
            class13 var46;
            if (var11.field1062 == -1 && var11.field1069 == null) {
                class164 var45 = var11.method478(var27, arg1, 4, null, var20, var22, var21, var18, var19, arg7, (byte) 115);
                var46 = var45.field2805;
            } else {
                var46 = new class178(arg6, 4, arg7, arg5, arg3, arg0, var11.field1062, var11.field1024, null);
            }
            class241.method1569(arg9, arg3, arg0, var20, var46, null, class198.field3424[arg7], 0, 0, 0, var25);
        } else if (arg10 == 5) {
            long var47 = class186.method1213(arg9, arg3, arg0);
            int var49 = 16;
            if (var47 != 0L) {
                var49 = class190.method1232(Integer.MAX_VALUE & (int) (var47 >>> 32), arg2 ^ 0xFFFFCCEC).field1008;
            }
            class13 var51;
            if (var11.field1062 == -1 && var11.field1069 == null) {
                class164 var50 = var11.method478(var27, arg1, 4, null, var20, var22, var21, var18, var19, arg7, (byte) 115);
                var51 = var50.field2805;
            } else {
                var51 = new class178(arg6, 4, arg7, arg5, arg3, arg0, var11.field1062, var11.field1024, null);
            }
            class241.method1569(arg9, arg3, arg0, var20, var51, null, class198.field3424[arg7], 0, class57.field792[arg7] * var49, class167.field2843[arg7] * var49, var25);
        } else if (arg10 == 6) {
            int var52 = 8;
            long var53 = class186.method1213(arg9, arg3, arg0);
            if (var53 != 0L) {
                var52 = class190.method1232((int) (var53 >>> 32) & Integer.MAX_VALUE, 13090).field1008 / 2;
            }
            class13 var56;
            if (var11.field1062 == -1 && var11.field1069 == null) {
                class164 var55 = var11.method478(var27, arg1, 4, null, var20, var22, var21, var18, var19, arg7 + 4, (byte) 115);
                var56 = var55.field2805;
            } else {
                var56 = new class178(arg6, 4, arg7 + 4, arg5, arg3, arg0, var11.field1062, var11.field1024, null);
            }
            class241.method1569(arg9, arg3, arg0, var20, var56, null, 256, arg7, class163.field2800[arg7] * var52, class176.field3085[arg7] * var52, var25);
        } else if (arg10 == 7) {
            int var57 = arg7 + 2 & 0x3;
            class13 var59;
            if (var11.field1062 == -1 && var11.field1069 == null) {
                class164 var58 = var11.method478(var27, arg1, 4, null, var20, var22, var21, var18, var19, var57 + 4, (byte) 115);
                var59 = var58.field2805;
            } else {
                var59 = new class178(arg6, 4, var57 + 4, arg5, arg3, arg0, var11.field1062, var11.field1024, null);
            }
            class241.method1569(arg9, arg3, arg0, var20, var59, null, 256, var57, 0, 0, var25);
        } else if (arg10 == 8) {
            int var60 = 8;
            long var61 = class186.method1213(arg9, arg3, arg0);
            int var63 = arg7 + 2 & 0x3;
            if (var61 != 0L) {
                var60 = class190.method1232((int) (var61 >>> 32) & Integer.MAX_VALUE, 13090).field1008 / 2;
            }
            class13 var65;
            class13 var67;
            if (var11.field1062 == -1 && var11.field1069 == null) {
                class164 var64 = var11.method478(var27, arg1, 4, null, var20, var22, var21, var18, var19, arg7 + 4, (byte) 115);
                var65 = var64.field2805;
                class164 var66 = var11.method478(var27, arg1, 4, null, var20, var22, var21, var18, var19, var63 + 4, (byte) 115);
                var67 = var66.field2805;
            } else {
                var65 = new class178(arg6, 4, arg7 + 4, arg5, arg3, arg0, var11.field1062, var11.field1024, null);
                var67 = new class178(arg6, 4, var63 + 4, arg5, arg3, arg0, var11.field1062, var11.field1024, null);
            }
            class241.method1569(arg9, arg3, arg0, var20, var65, var67, 256, arg7, class163.field2800[arg7] * var60, class176.field3085[arg7] * var60, var25);
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lqe;IZ)V")
    public static final void method1043(class168 arg0, int arg1, boolean arg2) {
        byte var3 = 4;
        int var4 = var3 + 6;
        int var5 = var3 + 6;
        field2747++;
        int var6 = class199.field3434.method926(arg0, 250);
        int var7 = class199.field3434.method932(arg0, 250) * 13;
        if (arg1 < 58) {
            method1041(-12, -100, 123, -5, 56, 101, -115, 108);
        }
        class216.method1405(var4 - var3, -var3 + var5, var3 + var6 + var3, var3 + var7 + var3, 0);
        class216.method1395(var4 - var3, -var3 + var5, var3 + var6 + var3, var3 + var7 + var3, 16777215);
        class199.field3434.method942(arg0, var4, var5, var6, var7, 16777215, -1, 1, 1, 0);
        class208.method1352(var4 - var3, -622332702, var5 - var3, var3 + var6 + var3, var3 + var7 + var3);
        if (!arg2) {
            class26.method173(var7, var5, 0, var6, var4);
            return;
        }
        try {
            Graphics var8 = class51.field686.getGraphics();
            class204.field3544.method17(5, var8, 0, 0);
        } catch (Exception var9) {
            class51.field686.repaint();
        }
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(Lrc;)V")
    public class159(class167 arg0) {
        this.field2751 = arg0;
    }
}
