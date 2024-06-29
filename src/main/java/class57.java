import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class57 {

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "I")
    public int field1577 = 0;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "I")
    public int field1576 = 0;

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "I")
    public static int field1578 = 0;

    @OriginalMember(owner = "client!ia", name = "i", descriptor = "I")
    public static int field1584 = 0;

    @OriginalMember(owner = "client!ia", name = "h", descriptor = "Lrd;")
    public static class117 field1583 = class95.method812("Duell akzeptieren", (byte) 8);

    @OriginalMember(owner = "client!ia", name = "n", descriptor = "Lrd;")
    public static class117 field1589 = null;

    @OriginalMember(owner = "client!ia", name = "k", descriptor = "Lbf;")
    public static class14 field1586 = new class14(new byte[5000]);

    @OriginalMember(owner = "client!ia", name = "p", descriptor = "Lmb;")
    public static class85 field1591 = new class85(30);

    @OriginalMember(owner = "client!ia", name = "q", descriptor = "Lrd;")
    private static class117 field1592 = class95.method812("Loaded gamescreen", (byte) 8);

    @OriginalMember(owner = "client!ia", name = "r", descriptor = "Lrd;")
    public static class117 field1593 = field1592;

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "I")
    public static int field1579;

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "I")
    public int field1580;

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "I")
    public int field1581;

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "I")
    public int field1582;

    @OriginalMember(owner = "client!ia", name = "l", descriptor = "I")
    public int field1587;

    @OriginalMember(owner = "client!ia", name = "m", descriptor = "I")
    public int field1588;

    @OriginalMember(owner = "client!ia", name = "o", descriptor = "I")
    public static int field1590;

    @OriginalMember(owner = "client!ia", name = "j", descriptor = "Lid;")
    public class60 field1585;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(BI)Lpc;")
    public static final class104 method596(byte arg0, int arg1) {
        field1579++;
        if (arg0 >= -32) {
            return null;
        }
        class104 var2 = (class104) class45.field1270.method774((long) arg1, 329);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class137.field3299.method526((byte) 120, 4, arg1);
        class104 var4 = new class104();
        if (var3 != null) {
            var4.method860(arg1, new class14(var3), 102);
        }
        var4.method866((byte) 93);
        class45.field1270.method773((long) arg1, (byte) -17, var4);
        return var4;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)V")
    public static void method597(int arg0) {
        field1589 = null;
        field1586 = null;
        field1591 = null;
        field1593 = null;
        if (arg0 < 81) {
            field1586 = null;
        }
        field1583 = null;
        field1592 = null;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(BLea;Lhc;IIIIIII)V")
    public static final void method598(byte arg0, class30 arg1, class52 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field1590++;
        int var10 = class14.field272[arg4][arg5][arg8];
        int var11 = class14.field272[arg4][arg5 + 1][arg8];
        int var12 = class14.field272[arg4][arg5 + 1][arg8 + 1];
        int var13 = class14.field272[arg4][arg5][arg8 + 1];
        class62 var14 = class147.method1191((byte) 71, arg7);
        if (arg0 < 70) {
            return;
        }
        int var15 = (arg7 << 14) + (arg8 << 7) + arg5 + 1073741824;
        int var16 = var10 + var11 + var13 + var12 >> 2;
        int var17 = (arg9 << 6) + arg3;
        if (var14.field1749 == 0) {
            var15 += Integer.MIN_VALUE;
        }
        if (var14.field1777 == 1) {
            var17 += 256;
        }
        if (arg3 == 22) {
            class60 var18;
            if (var14.field1748 == -1 && var14.field1791 == null) {
                var18 = var14.method625(var11, var12, var10, var13, 22, -22983, arg9);
            } else {
                var18 = new class58(arg7, 22, arg9, var10, var11, var12, var13, var14.field1748, true, null);
            }
            arg1.method324(arg6, arg5, arg8, var16, var18, var15, var17);
            if (var14.field1758 && var14.field1749 == 1) {
                arg2.method574(false, arg8, arg5);
            }
        } else if (arg3 == 10 || arg3 == 11) {
            class60 var38;
            if (var14.field1748 == -1 && var14.field1791 == null) {
                var38 = var14.method625(var11, var12, var10, var13, 10, -22983, arg9);
            } else {
                var38 = new class58(arg7, 10, arg9, var10, var11, var12, var13, var14.field1748, true, null);
            }
            if (var38 != null) {
                int var39;
                int var40;
                if (arg9 == 1 || arg9 == 3) {
                    var40 = var14.field1737;
                    var39 = var14.field1750;
                } else {
                    var39 = var14.field1737;
                    var40 = var14.field1750;
                }
                int var41 = 0;
                if (arg3 == 11) {
                    var41 += 256;
                }
                arg1.method368(arg6, arg5, arg8, var16, var39, var40, var38, var41, var15, var17);
            }
            if (var14.field1758) {
                arg2.method565(arg5, var14.field1737, arg9, var14.field1750, -100, arg8, var14.field1773);
            }
        } else if (arg3 >= 12) {
            class60 var19;
            if (var14.field1748 == -1 && var14.field1791 == null) {
                var19 = var14.method625(var11, var12, var10, var13, arg3, -22983, arg9);
            } else {
                var19 = new class58(arg7, arg3, arg9, var10, var11, var12, var13, var14.field1748, true, null);
            }
            arg1.method368(arg6, arg5, arg8, var16, 1, 1, var19, 0, var15, var17);
            if (var14.field1758) {
                arg2.method565(arg5, var14.field1737, arg9, var14.field1750, -101, arg8, var14.field1773);
            }
        } else if (arg3 == 0) {
            class60 var20;
            if (var14.field1748 == -1 && var14.field1791 == null) {
                var20 = var14.method625(var11, var12, var10, var13, 0, -22983, arg9);
            } else {
                var20 = new class58(arg7, 0, arg9, var10, var11, var12, var13, var14.field1748, true, null);
            }
            arg1.method334(arg6, arg5, arg8, var16, var20, null, class132.field3170[arg9], 0, var15, var17);
            if (var14.field1758) {
                arg2.method569(arg8, arg5, arg3, var14.field1773, (byte) -10, arg9);
            }
        } else if (arg3 == 1) {
            class60 var21;
            if (var14.field1748 == -1 && var14.field1791 == null) {
                var21 = var14.method625(var11, var12, var10, var13, 1, -22983, arg9);
            } else {
                var21 = new class58(arg7, 1, arg9, var10, var11, var12, var13, var14.field1748, true, null);
            }
            arg1.method334(arg6, arg5, arg8, var16, var21, null, client.field630[arg9], 0, var15, var17);
            if (var14.field1758) {
                arg2.method569(arg8, arg5, arg3, var14.field1773, (byte) -70, arg9);
            }
        } else if (arg3 == 2) {
            int var22 = arg9 + 1 & 0x3;
            class60 var23;
            class60 var24;
            if (var14.field1748 == -1 && var14.field1791 == null) {
                var23 = var14.method625(var11, var12, var10, var13, 2, -22983, arg9 + 4);
                var24 = var14.method625(var11, var12, var10, var13, 2, -22983, var22);
            } else {
                var23 = new class58(arg7, 2, arg9 + 4, var10, var11, var12, var13, var14.field1748, true, null);
                var24 = new class58(arg7, 2, var22, var10, var11, var12, var13, var14.field1748, true, null);
            }
            arg1.method334(arg6, arg5, arg8, var16, var23, var24, class132.field3170[arg9], class132.field3170[var22], var15, var17);
            if (var14.field1758) {
                arg2.method569(arg8, arg5, arg3, var14.field1773, (byte) -124, arg9);
            }
        } else if (arg3 == 3) {
            class60 var25;
            if (var14.field1748 == -1 && var14.field1791 == null) {
                var25 = var14.method625(var11, var12, var10, var13, 3, -22983, arg9);
            } else {
                var25 = new class58(arg7, 3, arg9, var10, var11, var12, var13, var14.field1748, true, null);
            }
            arg1.method334(arg6, arg5, arg8, var16, var25, null, client.field630[arg9], 0, var15, var17);
            if (var14.field1758) {
                arg2.method569(arg8, arg5, arg3, var14.field1773, (byte) 81, arg9);
            }
        } else if (arg3 == 9) {
            class60 var26;
            if (var14.field1748 == -1 && var14.field1791 == null) {
                var26 = var14.method625(var11, var12, var10, var13, arg3, -22983, arg9);
            } else {
                var26 = new class58(arg7, arg3, arg9, var10, var11, var12, var13, var14.field1748, true, null);
            }
            arg1.method368(arg6, arg5, arg8, var16, 1, 1, var26, 0, var15, var17);
            if (var14.field1758) {
                arg2.method565(arg5, var14.field1737, arg9, var14.field1750, -116, arg8, var14.field1773);
            }
        } else {
            if (var14.field1793) {
                if (arg9 == 1) {
                    int var30 = var13;
                    var13 = var12;
                    var12 = var11;
                    var11 = var10;
                    var10 = var30;
                } else if (arg9 == 2) {
                    int var28 = var13;
                    var13 = var11;
                    var11 = var28;
                    int var29 = var12;
                    var12 = var10;
                    var10 = var29;
                } else if (arg9 == 3) {
                    int var27 = var13;
                    var13 = var10;
                    var10 = var11;
                    var11 = var12;
                    var12 = var27;
                }
            }
            if (arg3 == 4) {
                class60 var31;
                if (var14.field1748 == -1 && var14.field1791 == null) {
                    var31 = var14.method625(var11, var12, var10, var13, 4, -22983, 0);
                } else {
                    var31 = new class58(arg7, 4, 0, var10, var11, var12, var13, var14.field1748, true, null);
                }
                arg1.method332(arg6, arg5, arg8, var16, var31, class132.field3170[arg9], arg9 * 512, 0, 0, var15, var17);
            } else if (arg3 == 5) {
                int var32 = 16;
                int var33 = arg1.method355(arg6, arg5, arg8);
                if (var33 != 0) {
                    var32 = class147.method1191((byte) 102, var33 >> 14 & 0x7FFF).field1733;
                }
                class60 var34;
                if (var14.field1748 == -1 && var14.field1791 == null) {
                    var34 = var14.method625(var11, var12, var10, var13, 4, -22983, 0);
                } else {
                    var34 = new class58(arg7, 4, 0, var10, var11, var12, var13, var14.field1748, true, null);
                }
                arg1.method332(arg6, arg5, arg8, var16, var34, class132.field3170[arg9], arg9 * 512, class84.field2193[arg9] * var32, class116.field2835[arg9] * var32, var15, var17);
            } else if (arg3 == 6) {
                class60 var35;
                if (var14.field1748 == -1 && var14.field1791 == null) {
                    var35 = var14.method625(var11, var12, var10, var13, 4, -22983, 0);
                } else {
                    var35 = new class58(arg7, 4, 0, var10, var11, var12, var13, var14.field1748, true, null);
                }
                arg1.method332(arg6, arg5, arg8, var16, var35, 256, arg9, 0, 0, var15, var17);
            } else if (arg3 == 7) {
                class60 var36;
                if (var14.field1748 == -1 && var14.field1791 == null) {
                    var36 = var14.method625(var11, var12, var10, var13, 4, -22983, 0);
                } else {
                    var36 = new class58(arg7, 4, 0, var10, var11, var12, var13, var14.field1748, true, null);
                }
                arg1.method332(arg6, arg5, arg8, var16, var36, 512, arg9, 0, 0, var15, var17);
            } else if (arg3 == 8) {
                class60 var37;
                if (var14.field1748 == -1 && var14.field1791 == null) {
                    var37 = var14.method625(var11, var12, var10, var13, 4, -22983, 0);
                } else {
                    var37 = new class58(arg7, 4, 0, var10, var11, var12, var13, var14.field1748, true, null);
                }
                arg1.method332(arg6, arg5, arg8, var16, var37, 768, arg9, 0, 0, var15, var17);
            }
        }
    }
}
