import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class40 extends class124 {

    @OriginalMember(owner = "client!hh", name = "P", descriptor = "Z")
    private boolean field711 = true;

    @OriginalMember(owner = "client!hh", name = "cb", descriptor = "Z")
    private boolean field724 = true;

    @OriginalMember(owner = "client!hh", name = "X", descriptor = "Le;")
    public static class191 field719 = class54.method368("hint_mapedge", 2047);

    @OriginalMember(owner = "client!hh", name = "W", descriptor = "Le;")
    private static class191 field718 = class54.method368("You can(Wt add yourself to your own friend list)3", 2047);

    @OriginalMember(owner = "client!hh", name = "bb", descriptor = "I")
    public static int field723 = 0;

    @OriginalMember(owner = "client!hh", name = "Y", descriptor = "Le;")
    public static class191 field720 = field718;

    @OriginalMember(owner = "client!hh", name = "Q", descriptor = "I")
    public static int field712;

    @OriginalMember(owner = "client!hh", name = "R", descriptor = "I")
    public static int field713;

    @OriginalMember(owner = "client!hh", name = "S", descriptor = "I")
    public static int field714;

    @OriginalMember(owner = "client!hh", name = "T", descriptor = "I")
    public static int field715;

    @OriginalMember(owner = "client!hh", name = "U", descriptor = "I")
    public static int field716;

    @OriginalMember(owner = "client!hh", name = "V", descriptor = "I")
    public static int field717;

    @OriginalMember(owner = "client!hh", name = "Z", descriptor = "I")
    public static int field721;

    @OriginalMember(owner = "client!hh", name = "db", descriptor = "I")
    public static int field725;

    @OriginalMember(owner = "client!hh", name = "ab", descriptor = "[[[B")
    public static byte[][][] field722;

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "()V")
    public class40() {
        super(1, false);
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IB)[[I")
    public final int[][] method137(int arg0, byte arg1) {
        ++field716;
        if (arg1 != -7) {
            field718 = null;
        }
        int[][] var3 = super.field2053.method1775((byte) -100, arg0);
        if (super.field2053.field4558) {
            int[][] var4 = this.method843((byte) -71, this.field711 ? class181.field3119 - arg0 : arg0, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            if (this.field724) {
                for (int var11 = 0; ~var11 > ~class64.field1132; ++var11) {
                    var8[var11] = var5[-var11 + class8.field82];
                    var9[var11] = var6[-var11 + class8.field82];
                    var10[var11] = var7[class8.field82 - var11];
                }
            } else {
                for (int var12 = 0; var12 < class64.field1132; ++var12) {
                    var8[var12] = var5[var12];
                    var9[var12] = var6[var12];
                    var10[var12] = var7[var12];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "(B)V")
    public static final void method265(byte arg0) {
        if (arg0 > 55) {
            ++field714;
            ++class263.field4663;
        }
    }

    @OriginalMember(owner = "client!hh", name = "h", descriptor = "(I)V")
    public static void method266(int arg0) {
        if (arg0 != 20503) {
            method269(true, true);
        }
        field718 = null;
        field719 = null;
        field722 = null;
        field720 = null;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "([IIIIII)V")
    public static final void method267(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class199 var6 = class201.field3608[arg3][arg4][arg5];
        if (var6 != null) {
            class215 var7 = var6.field3560;
            if (var7 == null) {
                class48 var10 = var6.field3552;
                if (var10 != null) {
                    int var11 = var10.field859;
                    int var12 = var10.field855;
                    int var13 = var10.field854;
                    int var14 = var10.field858;
                    int[] var15 = class129.field2157[var11];
                    int[] var16 = class270.field4762[var12];
                    int var17 = 0;
                    if (var13 != 0) {
                        for (int var18 = 0; var18 < 4; ++var18) {
                            arg0[arg1] = var15[var16[var17++]] == 0 ? var13 : var14;
                            arg0[arg1 + 1] = var15[var16[var17++]] == 0 ? var13 : var14;
                            arg0[arg1 + 2] = var15[var16[var17++]] == 0 ? var13 : var14;
                            arg0[arg1 + 3] = var15[var16[var17++]] == 0 ? var13 : var14;
                            arg1 += arg2;
                        }
                    } else {
                        for (int var19 = 0; var19 < 4; ++var19) {
                            if (var15[var16[var17++]] != 0) {
                                arg0[arg1] = var14;
                            }
                            if (var15[var16[var17++]] != 0) {
                                arg0[arg1 + 1] = var14;
                            }
                            if (var15[var16[var17++]] != 0) {
                                arg0[arg1 + 2] = var14;
                            }
                            if (var15[var16[var17++]] != 0) {
                                arg0[arg1 + 3] = var14;
                            }
                            arg1 += arg2;
                        }
                    }
                }
            } else {
                int var8 = var7.field3797;
                if (var8 != 0) {
                    for (int var9 = 0; var9 < 4; ++var9) {
                        arg0[arg1] = var8;
                        arg0[arg1 + 1] = var8;
                        arg0[arg1 + 2] = var8;
                        arg0[arg1 + 3] = var8;
                        arg1 += arg2;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(BI)[I")
    public final int[] method131(byte arg0, int arg1) {
        if (arg0 < 68) {
            return null;
        } else {
            ++field715;
            int[] var3 = super.field2064.method378(arg1, 0);
            if (super.field2064.field1035) {
                int[] var4 = this.method844(0, 113, this.field711 ? -arg1 + class181.field3119 : arg1);
                if (this.field724) {
                    for (int var5 = 0; var5 < class64.field1132; ++var5) {
                        var3[var5] = var4[-var5 + class8.field82];
                    }
                } else {
                    class58.method387(var4, 0, var3, 0, class64.field1132);
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(II)I")
    public static final int method268(int arg0, int arg1) {
        if (arg0 != 127) {
            method269(false, false);
        }
        ++field725;
        return arg1 >> 11 & 127;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(ILji;Z)V")
    public final void method136(int arg0, class225 arg1, boolean arg2) {
        ++field713;
        if (arg2) {
            if (arg0 != 0) {
                if (arg0 != 1) {
                    if (arg0 == 2) {
                        super.field2063 = arg1.method1580(-84) == 1;
                    }
                } else {
                    this.field711 = arg1.method1580(-113) == 1;
                }
            } else {
                this.field724 = arg1.method1580(-109) == 1;
            }
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(ZZ)V")
    public static final void method269(boolean arg0, boolean arg1) {
        if (!arg1) {
            method265((byte) 41);
        }
        for (int var2 = 0; class197.field3514 > var2; ++var2) {
            long var3 = 536870912L | (long) class256.field4542[var2] << 32;
            class156 var5 = class115.field1901[class256.field4542[var2]];
            if (var5 != null && var5.method489(50) && !arg0 == !var5.field2663.field3176 && var5.field2663.method1243(true)) {
                int var6 = var5.field3003 >> 7;
                int var7 = var5.field2972 >> 7;
                if (~var6 <= -1 && ~var6 > -105 && var7 >= 0 && ~var7 > -105) {
                    if (var5.method490((byte) -4) == 1 && (127 & var5.field3003) == 64 && ~(var5.field2972 & 127) == -65) {
                        if (class39.field707[var6][var7] == class182.field3131) {
                            continue;
                        }
                        class39.field707[var6][var7] = class182.field3131;
                    }
                    if (!var5.field2663.field3228) {
                        var3 |= Long.MIN_VALUE;
                    }
                    var5.field2949 = class222.method1546(class261.field4598, var5.field3003, var5.field2972, 247425607);
                    class165.method1110(class261.field4598, var5.field3003, var5.field2972, var5.field2949, (-1 + var5.method490((byte) -4)) * 64 + 60, var5, var5.field2999, var3, var5.field2978);
                }
            }
        }
        ++field721;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(ZILe;)V")
    public static final void method270(boolean arg0, int arg1, class191 arg2) {
        ++field717;
        byte var3 = 4;
        int var4 = var3 + 6;
        int var5 = var3 + 6;
        int var6 = class138.field2325.method285(arg2, 250);
        int var7 = 13 * class138.field2325.method305(arg2, 250);
        class7.method55(-var3 + var4, -var3 + var5, var3 + var6 + var3, var3 + var7 + var3, 0);
        class7.method48(-var3 + var4, -var3 + var5, var6 - (-var3 - var3), var7 - -var3 + var3, 16777215);
        class138.field2325.method291(arg2, var4, var5, var6, var7, 16777215, -1, 1, 1, arg1);
        class71.method469(-119, var3 + var7 + var3, -var3 + var5, var4 - var3, var6 - (-var3 - var3));
        if (arg0) {
            try {
                Graphics var8 = class51.field909.getGraphics();
                class42.field740.method156(true, 0, 0, var8);
            } catch (Exception var9) {
                class51.field909.repaint();
            }
        } else {
            class12.method83(var5, var6, var4, (byte) 36, var7);
        }
    }
}
