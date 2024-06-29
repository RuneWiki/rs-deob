import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class59 {

    @OriginalMember(owner = "client!i", name = "a", descriptor = "Ljf;")
    public static class68 field1438 = new class68(32);

    @OriginalMember(owner = "client!i", name = "c", descriptor = "[I")
    public static int[] field1440 = new int[500];

    @OriginalMember(owner = "client!i", name = "d", descriptor = "Lja;")
    public static class62 field1441 = class30.method243(43, "scape main");

    @OriginalMember(owner = "client!i", name = "f", descriptor = "I")
    public static int field1443 = -1;

    @OriginalMember(owner = "client!i", name = "j", descriptor = "I")
    public static int field1447 = 0;

    @OriginalMember(owner = "client!i", name = "k", descriptor = "I")
    public static int field1448 = 2;

    @OriginalMember(owner = "client!i", name = "m", descriptor = "[I")
    public static int[] field1450 = new int[] { 0, 1, 2, 3 };

    @OriginalMember(owner = "client!i", name = "l", descriptor = "I")
    public static int field1449 = 1;

    @OriginalMember(owner = "client!i", name = "e", descriptor = "Lc;")
    public static class18 field1442 = new class18(64);

    @OriginalMember(owner = "client!i", name = "n", descriptor = "Lja;")
    public static class62 field1451 = class30.method243(43, "l");

    @OriginalMember(owner = "client!i", name = "b", descriptor = "I")
    public static int field1439;

    @OriginalMember(owner = "client!i", name = "h", descriptor = "I")
    public static int field1445;

    @OriginalMember(owner = "client!i", name = "i", descriptor = "I")
    public static int field1446;

    @OriginalMember(owner = "client!i", name = "g", descriptor = "Lrf;")
    public static class124 field1444;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
    public static void method425(int arg0) {
        field1444 = null;
        field1442 = null;
        if (arg0 < 38) {
            return;
        }
        field1441 = null;
        field1438 = null;
        field1440 = null;
        field1451 = null;
        field1450 = null;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(BI)I")
    public static final int method426(byte arg0, int arg1) {
        if (arg0 < 53) {
            method427(-41, 124, 84, -120, (byte) 41, 49, 52, null, 95, null);
        }
        int var7 = arg1 - 1;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        field1446++;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIIBIILwe;ILka;)V")
    public static final void method427(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, class155 arg7, int arg8, class69 arg9) {
        field1439++;
        int var10 = class7.field214[arg1][arg8][arg2];
        int var11 = -27 / (arg4 / 57);
        int var12 = class7.field214[arg1][arg8 + 1][arg2];
        int var13 = class7.field214[arg1][arg8 + 1][arg2 + 1];
        int var14 = class7.field214[arg1][arg8][arg2 + 1];
        int var15 = var10 + var12 + var13 + var14 >> 2;
        int var16 = (arg3 << 14) + arg8 + (arg2 << 7) + 1073741824;
        int var17 = (arg5 << 6) + arg0;
        class65 var18 = class84.method653(6, arg3);
        if (var18.field1600 == 0) {
            var16 += Integer.MIN_VALUE;
        }
        if (var18.field1590 == 1) {
            var17 += 256;
        }
        if (arg0 == 22) {
            class140 var19;
            if (var18.field1640 == -1 && var18.field1594 == null) {
                var19 = var18.method506(22, var12, var14, var13, 0, arg5, var10);
            } else {
                var19 = new class43(arg3, 22, arg5, var10, var12, var13, var14, var18.field1640, true, null);
            }
            arg9.method573(arg6, arg8, arg2, var15, var19, var16, var17);
            if (var18.field1603 == 1) {
                arg7.method1206(-127, arg8, arg2);
            }
        } else if (arg0 == 10 || arg0 == 11) {
            class140 var39;
            if (var18.field1640 == -1 && var18.field1594 == null) {
                var39 = var18.method506(10, var12, var14, var13, 0, arg5, var10);
            } else {
                var39 = new class43(arg3, 10, arg5, var10, var12, var13, var14, var18.field1640, true, null);
            }
            if (var39 != null) {
                int var40 = 0;
                int var41;
                int var42;
                if (arg5 == 1 || arg5 == 3) {
                    var41 = var18.field1615;
                    var42 = var18.field1612;
                } else {
                    var41 = var18.field1612;
                    var42 = var18.field1615;
                }
                if (arg0 == 11) {
                    var40 += 256;
                }
                arg9.method563(arg6, arg8, arg2, var15, var41, var42, var39, var40, var16, var17);
            }
            if (var18.field1603 != 0) {
                arg7.method1207(var18.field1615, arg5, var18.field1612, var18.field1592, arg8, true, arg2);
            }
        } else if (arg0 >= 12) {
            class140 var20;
            if (var18.field1640 == -1 && var18.field1594 == null) {
                var20 = var18.method506(arg0, var12, var14, var13, 0, arg5, var10);
            } else {
                var20 = new class43(arg3, arg0, arg5, var10, var12, var13, var14, var18.field1640, true, null);
            }
            arg9.method563(arg6, arg8, arg2, var15, 1, 1, var20, 0, var16, var17);
            if (var18.field1603 != 0) {
                arg7.method1207(var18.field1615, arg5, var18.field1612, var18.field1592, arg8, true, arg2);
            }
        } else if (arg0 == 0) {
            class140 var21;
            if (var18.field1640 == -1 && var18.field1594 == null) {
                var21 = var18.method506(0, var12, var14, var13, 0, arg5, var10);
            } else {
                var21 = new class43(arg3, 0, arg5, var10, var12, var13, var14, var18.field1640, true, null);
            }
            arg9.method585(arg6, arg8, arg2, var15, var21, null, class121.field2765[arg5], 0, var16, var17);
            if (var18.field1603 != 0) {
                arg7.method1205(arg5, arg2, arg0, var18.field1592, (byte) -20, arg8);
            }
        } else if (arg0 == 1) {
            class140 var22;
            if (var18.field1640 == -1 && var18.field1594 == null) {
                var22 = var18.method506(1, var12, var14, var13, 0, arg5, var10);
            } else {
                var22 = new class43(arg3, 1, arg5, var10, var12, var13, var14, var18.field1640, true, null);
            }
            arg9.method585(arg6, arg8, arg2, var15, var22, null, class155.field3605[arg5], 0, var16, var17);
            if (var18.field1603 != 0) {
                arg7.method1205(arg5, arg2, arg0, var18.field1592, (byte) -20, arg8);
            }
        } else if (arg0 == 2) {
            int var23 = arg5 + 1 & 0x3;
            class140 var24;
            class140 var25;
            if (var18.field1640 == -1 && var18.field1594 == null) {
                var24 = var18.method506(2, var12, var14, var13, 0, arg5 + 4, var10);
                var25 = var18.method506(2, var12, var14, var13, 0, var23, var10);
            } else {
                var24 = new class43(arg3, 2, arg5 + 4, var10, var12, var13, var14, var18.field1640, true, null);
                var25 = new class43(arg3, 2, var23, var10, var12, var13, var14, var18.field1640, true, null);
            }
            arg9.method585(arg6, arg8, arg2, var15, var24, var25, class121.field2765[arg5], class121.field2765[var23], var16, var17);
            if (var18.field1603 != 0) {
                arg7.method1205(arg5, arg2, arg0, var18.field1592, (byte) -20, arg8);
            }
        } else if (arg0 == 3) {
            class140 var26;
            if (var18.field1640 == -1 && var18.field1594 == null) {
                var26 = var18.method506(3, var12, var14, var13, 0, arg5, var10);
            } else {
                var26 = new class43(arg3, 3, arg5, var10, var12, var13, var14, var18.field1640, true, null);
            }
            arg9.method585(arg6, arg8, arg2, var15, var26, null, class155.field3605[arg5], 0, var16, var17);
            if (var18.field1603 != 0) {
                arg7.method1205(arg5, arg2, arg0, var18.field1592, (byte) -20, arg8);
            }
        } else if (arg0 == 9) {
            class140 var27;
            if (var18.field1640 == -1 && var18.field1594 == null) {
                var27 = var18.method506(arg0, var12, var14, var13, 0, arg5, var10);
            } else {
                var27 = new class43(arg3, arg0, arg5, var10, var12, var13, var14, var18.field1640, true, null);
            }
            arg9.method563(arg6, arg8, arg2, var15, 1, 1, var27, 0, var16, var17);
            if (var18.field1603 != 0) {
                arg7.method1207(var18.field1615, arg5, var18.field1612, var18.field1592, arg8, true, arg2);
            }
        } else {
            if (var18.field1582) {
                if (arg5 == 1) {
                    int var28 = var14;
                    var14 = var13;
                    var13 = var12;
                    var12 = var10;
                    var10 = var28;
                } else if (arg5 == 2) {
                    int var30 = var14;
                    var14 = var12;
                    var12 = var30;
                    int var31 = var13;
                    var13 = var10;
                    var10 = var31;
                } else if (arg5 == 3) {
                    int var29 = var14;
                    var14 = var10;
                    var10 = var12;
                    var12 = var13;
                    var13 = var29;
                }
            }
            if (arg0 == 4) {
                class140 var32;
                if (var18.field1640 == -1 && var18.field1594 == null) {
                    var32 = var18.method506(4, var12, var14, var13, 0, 0, var10);
                } else {
                    var32 = new class43(arg3, 4, 0, var10, var12, var13, var14, var18.field1640, true, null);
                }
                arg9.method589(arg6, arg8, arg2, var15, var32, class121.field2765[arg5], arg5 * 512, 0, 0, var16, var17);
            } else if (arg0 == 5) {
                int var33 = 16;
                int var34 = arg9.method570(arg6, arg8, arg2);
                if (var34 != 0) {
                    var33 = class84.method653(6, var34 >> 14 & 0x7FFF).field1614;
                }
                class140 var35;
                if (var18.field1640 == -1 && var18.field1594 == null) {
                    var35 = var18.method506(4, var12, var14, var13, 0, 0, var10);
                } else {
                    var35 = new class43(arg3, 4, 0, var10, var12, var13, var14, var18.field1640, true, null);
                }
                arg9.method589(arg6, arg8, arg2, var15, var35, class121.field2765[arg5], arg5 * 512, class151.field3546[arg5] * var33, class28.field688[arg5] * var33, var16, var17);
            } else if (arg0 == 6) {
                class140 var36;
                if (var18.field1640 == -1 && var18.field1594 == null) {
                    var36 = var18.method506(4, var12, var14, var13, 0, 0, var10);
                } else {
                    var36 = new class43(arg3, 4, 0, var10, var12, var13, var14, var18.field1640, true, null);
                }
                arg9.method589(arg6, arg8, arg2, var15, var36, 256, arg5, 0, 0, var16, var17);
            } else if (arg0 == 7) {
                class140 var37;
                if (var18.field1640 == -1 && var18.field1594 == null) {
                    var37 = var18.method506(4, var12, var14, var13, 0, 0, var10);
                } else {
                    var37 = new class43(arg3, 4, 0, var10, var12, var13, var14, var18.field1640, true, null);
                }
                arg9.method589(arg6, arg8, arg2, var15, var37, 512, arg5, 0, 0, var16, var17);
            } else if (arg0 == 8) {
                class140 var38;
                if (var18.field1640 == -1 && var18.field1594 == null) {
                    var38 = var18.method506(4, var12, var14, var13, 0, 0, var10);
                } else {
                    var38 = new class43(arg3, 4, 0, var10, var12, var13, var14, var18.field1640, true, null);
                }
                arg9.method589(arg6, arg8, arg2, var15, var38, 768, arg5, 0, 0, var16, var17);
            }
        }
    }
}
