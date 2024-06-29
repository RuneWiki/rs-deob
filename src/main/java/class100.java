import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public abstract class class100 extends class32 {

    @OriginalMember(owner = "client!uh", name = "G", descriptor = "Lqk;")
    private static class207 field1793 = class24.method212(255, "scroll:");

    @OriginalMember(owner = "client!uh", name = "N", descriptor = "Lqk;")
    public static class207 field1800 = class24.method212(255, "");

    @OriginalMember(owner = "client!uh", name = "Q", descriptor = "Lqk;")
    public static class207 field1803 = field1800;

    @OriginalMember(owner = "client!uh", name = "J", descriptor = "Lqk;")
    public static class207 field1796 = field1793;

    @OriginalMember(owner = "client!uh", name = "V", descriptor = "Lqk;")
    public static class207 field1808 = field1793;

    @OriginalMember(owner = "client!uh", name = "W", descriptor = "I")
    public static int field1809 = 0;

    @OriginalMember(owner = "client!uh", name = "F", descriptor = "Lqk;")
    public static class207 field1792 = field1800;

    @OriginalMember(owner = "client!uh", name = "E", descriptor = "I")
    public static int field1791;

    @OriginalMember(owner = "client!uh", name = "H", descriptor = "I")
    public static int field1794;

    @OriginalMember(owner = "client!uh", name = "I", descriptor = "I")
    public static int field1795;

    @OriginalMember(owner = "client!uh", name = "L", descriptor = "I")
    public static int field1798;

    @OriginalMember(owner = "client!uh", name = "M", descriptor = "I")
    public int field1799;

    @OriginalMember(owner = "client!uh", name = "O", descriptor = "I")
    public static int field1801;

    @OriginalMember(owner = "client!uh", name = "P", descriptor = "I")
    public int field1802;

    @OriginalMember(owner = "client!uh", name = "R", descriptor = "I")
    public static int field1804;

    @OriginalMember(owner = "client!uh", name = "S", descriptor = "I")
    public static int field1805;

    @OriginalMember(owner = "client!uh", name = "T", descriptor = "I")
    public int field1806;

    @OriginalMember(owner = "client!uh", name = "U", descriptor = "I")
    public int field1807;

    @OriginalMember(owner = "client!uh", name = "X", descriptor = "I")
    public int field1810;

    @OriginalMember(owner = "client!uh", name = "Y", descriptor = "I")
    public int field1811;

    @OriginalMember(owner = "client!uh", name = "K", descriptor = "Luh;")
    public static class100 field1797;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIIII)V")
    public abstract void method388(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIII)V")
    public abstract void method374(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(II)V")
    public abstract void method387(int arg0, int arg1);

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIIIB)V")
    public final void method734(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        int var6 = this.field1806 << 3;
        int var7 = (arg2 << 4) + (var6 & 0xF);
        int var8 = this.field1810 << 3;
        int var9 = (arg0 << 4) + (var8 & 0xF);
        this.method378(var6, var8, var7, var9, arg1, arg3);
        if (arg4 != 73) {
            this.method379(-82, -14);
        }
        field1795++;
    }

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "(II)V")
    public abstract void method379(int arg0, int arg1);

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIIIII)V")
    public abstract void method378(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "(I)V")
    public static void method735(int arg0) {
        field1800 = null;
        field1797 = null;
        field1793 = null;
        field1792 = null;
        field1803 = null;
        field1808 = null;
        if (arg0 != 104) {
            field1808 = null;
        }
        field1796 = null;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(ZIIZII[Lgi;[B)V")
    public static final void method736(boolean arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, class155[] arg6, byte[] arg7) {
        byte var8;
        if (arg0) {
            var8 = 1;
        } else {
            var8 = 4;
        }
        field1804++;
        if (!arg0) {
            for (int var9 = 0; var9 < 4; var9++) {
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        if (arg5 + var10 > 0 && arg5 + var10 < 103 && arg1 + var11 > 0 && (arg1 + var11) < 103) {
                            arg6[var9].field2721[arg5 + var10][arg1 + var11] = class121.method860(arg6[var9].field2721[arg5 + var10][arg1 + var11], -16777217);
                        }
                    }
                }
            }
        }
        class149 var12 = new class149(arg7);
        for (int var13 = 0; var13 < var8; var13++) {
            for (int var36 = 0; var36 < 64; var36++) {
                for (int var37 = 0; var37 < 64; var37++) {
                    class68.method494(arg1 + var37, 0, var36 + arg5, var12, arg2, 0, arg4, var13, arg0);
                }
            }
        }
        boolean var14 = false;
        while (var12.field2593 < var12.field2568.length) {
            int var15 = var12.method1045((byte) 116);
            if (var15 != 129) {
                var12.field2593--;
                break;
            }
            var14 = true;
            for (int var16 = 0; var16 < 4; var16++) {
                byte var17 = var12.method1084((byte) 49);
                if (var17 == 0) {
                    int var18 = arg5;
                    if (arg5 < 0) {
                        var18 = 0;
                    } else if (arg5 >= 104) {
                        var18 = 104;
                    }
                    int var19 = arg5 + 64;
                    if (var19 < 0) {
                        var19 = 0;
                    } else if (var19 >= 104) {
                        var19 = 104;
                    }
                    int var20 = arg1;
                    if (arg1 < 0) {
                        var20 = 0;
                    } else if (arg1 >= 104) {
                        var20 = 104;
                    }
                    int var21 = arg1 + 64;
                    if (var21 < 0) {
                        var21 = 0;
                    } else if (var21 >= 104) {
                        var21 = 104;
                    }
                    while (var19 > var18) {
                        while (var20 < var21) {
                            class147.field2515[var16][var18][var20] = 0;
                            var20++;
                        }
                        var18++;
                    }
                } else if (var17 == 1) {
                    for (int var22 = 0; var22 < 64; var22 += 4) {
                        for (int var23 = 0; var23 < 64; var23 += 4) {
                            byte var24 = var12.method1084((byte) 49);
                            for (int var25 = arg5 + var22; var25 < (arg5 + var22 + 4); var25++) {
                                for (int var26 = var23 + arg1; var26 < (arg1 + var23 + 4); var26++) {
                                    if (var25 >= 0 && var25 < 104 && var26 >= 0 && var26 < 104) {
                                        class147.field2515[var16][var25][var26] = var24;
                                    }
                                }
                            }
                        }
                    }
                } else if (var17 == 2 && var16 > 0) {
                    int var27 = arg1;
                    int var28 = arg5;
                    if (arg5 < 0) {
                        var28 = 0;
                    } else if (arg5 >= 104) {
                        var28 = 104;
                    }
                    if (arg1 < 0) {
                        var27 = 0;
                    } else if (arg1 >= 104) {
                        var27 = 104;
                    }
                    int var29 = arg5 + 64;
                    if (var29 < 0) {
                        var29 = 0;
                    } else if (var29 >= 104) {
                        var29 = 104;
                    }
                    int var30 = arg1 + 64;
                    if (var30 < 0) {
                        var30 = 0;
                    } else if (var30 >= 104) {
                        var30 = 104;
                    }
                    while (var28 < var29) {
                        while (var27 < var30) {
                            class147.field2515[var16][var28][var27] = class147.field2515[var16 - 1][var28][var27];
                            var27++;
                        }
                        var28++;
                    }
                }
            }
        }
        if (!var14) {
            for (int var31 = 0; var31 < 4; var31++) {
                for (int var32 = 0; var32 < 16; var32++) {
                    for (int var33 = 0; var33 < 16; var33++) {
                        int var34 = (arg5 >> 2) + var32;
                        int var35 = (arg1 >> 2) + var33;
                        if (var34 >= 0 && var34 < 26 && var35 >= 0 && var35 < 26) {
                            class147.field2515[var31][var34][var35] = 0;
                        }
                    }
                }
            }
        }
        if (!arg3) {
            method737(-79, -48);
        }
    }

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "(II)I")
    public static final int method737(int arg0, int arg1) {
        if (arg1 == 26329) {
            field1794++;
            return arg0 & 0x3FF;
        } else {
            return -8;
        }
    }

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "(II)V")
    public abstract void method381(int arg0, int arg1);

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(ZI)Lsd;")
    public static final class43 method738(boolean arg0, int arg1) {
        if (arg0) {
            method736(true, -34, 92, true, -3, -35, (class155[]) null, (byte[]) null);
        }
        field1791++;
        class43 var2 = (class43) class176.field3180.method1387((long) arg1, 121);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class48.field948.method705(3, arg1, -1);
        class43 var4 = new class43();
        if (var3 != null) {
            var4.method325(new class149(var3), arg0);
        }
        class176.field3180.method1385((long) arg1, var4, (byte) -124);
        return var4;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(III)V")
    public abstract void method384(int arg0, int arg1, int arg2);
}
