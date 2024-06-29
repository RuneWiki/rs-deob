import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class101 extends class112 {

    @OriginalMember(owner = "client!l", name = "Zb", descriptor = "I")
    public static int field1610 = 0;

    @OriginalMember(owner = "client!l", name = "Mb", descriptor = "Lqe;")
    public static class168 field1597 = class66.method448("k", -118);

    @OriginalMember(owner = "client!l", name = "Tb", descriptor = "Lqe;")
    private static class168 field1604 = class66.method448("Loading interfaces )2 ", 70);

    @OriginalMember(owner = "client!l", name = "Qb", descriptor = "Z")
    public static boolean field1601 = true;

    @OriginalMember(owner = "client!l", name = "Kb", descriptor = "Lqe;")
    private static class168 field1595 = class66.method448("OFF", 10);

    @OriginalMember(owner = "client!l", name = "Jb", descriptor = "Lqe;")
    public static class168 field1594 = field1595;

    @OriginalMember(owner = "client!l", name = "gc", descriptor = "Lqe;")
    private static class168 field1617 = class66.method448("Type", -124);

    @OriginalMember(owner = "client!l", name = "dc", descriptor = "Lqe;")
    public static class168 field1614 = field1617;

    @OriginalMember(owner = "client!l", name = "fc", descriptor = "Lqe;")
    public static class168 field1616 = field1604;

    @OriginalMember(owner = "client!l", name = "Lb", descriptor = "[I")
    public static int[] field1596 = new int[50];

    @OriginalMember(owner = "client!l", name = "Yb", descriptor = "I")
    public static int field1609 = 0;

    @OriginalMember(owner = "client!l", name = "Ob", descriptor = "I")
    public static int field1599;

    @OriginalMember(owner = "client!l", name = "Pb", descriptor = "I")
    public static int field1600;

    @OriginalMember(owner = "client!l", name = "Rb", descriptor = "I")
    public static int field1602;

    @OriginalMember(owner = "client!l", name = "Sb", descriptor = "I")
    public static int field1603;

    @OriginalMember(owner = "client!l", name = "Ub", descriptor = "I")
    public static int field1605;

    @OriginalMember(owner = "client!l", name = "Vb", descriptor = "I")
    public static int field1606;

    @OriginalMember(owner = "client!l", name = "Wb", descriptor = "I")
    public static int field1607;

    @OriginalMember(owner = "client!l", name = "Xb", descriptor = "I")
    private int field1608;

    @OriginalMember(owner = "client!l", name = "ac", descriptor = "I")
    public static int field1611;

    @OriginalMember(owner = "client!l", name = "bc", descriptor = "I")
    public static int field1612;

    @OriginalMember(owner = "client!l", name = "cc", descriptor = "I")
    public static int field1613;

    @OriginalMember(owner = "client!l", name = "ec", descriptor = "I")
    public static int field1615;

    @OriginalMember(owner = "client!l", name = "hc", descriptor = "I")
    public static int field1618;

    @OriginalMember(owner = "client!l", name = "Nb", descriptor = "Lpa;")
    private class78 field1598;

    @OriginalMember(owner = "client!l", name = "d", descriptor = "(IB)I")
    public final int method660(int arg0, byte arg1) {
        if (arg1 > -124) {
            field1596 = null;
        }
        ++field1602;
        return arg0 * 8 + -this.field1608;
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "(I)V")
    public class101(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!l", name = "r", descriptor = "(I)V")
    public final void method661(int arg0) {
        ++field1611;
        this.field1608 = super.field1821 * 8;
        if (arg0 > -1) {
            field1609 = 93;
        }
    }

    @OriginalMember(owner = "client!l", name = "s", descriptor = "(I)V")
    public static void method662(int arg0) {
        field1594 = null;
        field1597 = null;
        field1595 = null;
        if (arg0 == 977) {
            field1596 = null;
            field1604 = null;
            field1617 = null;
            field1614 = null;
            field1616 = null;
        }
    }

    @OriginalMember(owner = "client!l", name = "n", descriptor = "(II)V")
    public static final void method663(int arg0, int arg1) {
        class177 var2 = class254.field4395[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; ++var3) {
            class177 var4 = class254.field4395[var3][arg0][arg1] = class254.field4395[var3 + 1][arg0][arg1];
            if (var4 != null) {
                --var4.field3089;
                for (int var5 = 0; var5 < var4.field3115; ++var5) {
                    class169 var6 = var4.field3090[var5];
                    if ((var6.field2937 >> 29 & 3L) == 2L && var6.field2939 == arg0 && var6.field2923 == arg1) {
                        --var6.field2922;
                    }
                }
            }
        }
        if (class254.field4395[0][arg0][arg1] == null) {
            class254.field4395[0][arg0][arg1] = new class177(0, arg0, arg1);
        }
        class254.field4395[0][arg0][arg1].field3107 = var2;
        class254.field4395[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(BZ)V")
    public static final void method664(byte arg0, boolean arg1) {
        ++field1599;
        byte[][] var2 = class118.field1914;
        byte var3 = 4;
        if (arg0 != 39) {
            method668(7, -57);
        }
        for (int var4 = 0; ~var4 > ~var3; ++var4) {
            class177.method1165(-8886);
            for (int var5 = 0; var5 < 13; ++var5) {
                for (int var6 = 0; ~var6 > -14; ++var6) {
                    int var7 = class76.field1141[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = 3 & var7 >> 24;
                        if (!arg1 || var8 == 0) {
                            int var9 = 3 & var7 >> 1;
                            int var10 = (var7 & 16380) >> 3;
                            int var11 = (16770169 & var7) >> 14;
                            int var12 = (var11 / 8 << 8) + var10 / 8;
                            for (int var13 = 0; ~class131.field2316.length < ~var13; ++var13) {
                                if (~class131.field2316[var13] == ~var12 && var2[var13] != null) {
                                    class208.method1347((byte) 77, var2[var13], var5 * 8, arg1, var9, (7 & var11) * 8, class169.field2951, var4, var8, (7 & var10) * 8, var6 * 8);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I[I)V")
    public final void method665(int arg0, int[] arg1) {
        ++field1612;
        if (arg0 >= -63) {
            field1597 = null;
        }
        this.field1598 = new class78(arg1);
    }

    @OriginalMember(owner = "client!l", name = "m", descriptor = "(B)V")
    public final void method666(byte arg0) {
        super.field1821 = (this.field1608 + 7) / 8;
        ++field1615;
        if (arg0 != 106) {
            method663(61, 115);
        }
    }

    @OriginalMember(owner = "client!l", name = "c", descriptor = "(IZ)Lgh;")
    public static final class134 method667(int arg0, boolean arg1) {
        ++field1613;
        class134 var2 = (class134) class256.field4439.method1499(0, (long) arg0);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class103.field1666.method1712(arg0, 26, -1);
            if (!arg1) {
                return null;
            } else {
                class134 var4 = new class134();
                if (var3 != null) {
                    var4.method901(new class112(var3), 125);
                }
                class256.field4439.method1502((byte) -18, var4, (long) arg0);
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "o", descriptor = "(II)V")
    public static final void method668(int arg0, int arg1) {
        ++field1603;
        class15 var2;
        if (class88.field1361 != null) {
            var2 = (class15) class88.field1361;
        } else {
            var2 = new class15(512, 512);
        }
        int[] var3 = var2.field136;
        int var4 = var3.length;
        for (int var5 = 0; ~var4 < ~var5; ++var5) {
            var3[var5] = 1;
        }
        for (int var6 = 1; ~var6 > -104; ++var6) {
            int var24 = 24628 - -((-(var6 * 512) + 52736) * 4);
            for (int var25 = 1; ~var25 > -104; ++var25) {
                if (~(class205.field3561[arg0][var25][var6] & 24) == -1) {
                    class176.method1161(var3, var24, 512, arg0, var25, var6);
                }
                if (~arg0 > -4 && ~(class205.field3561[arg0 + 1][var25][var6] & 8) != -1) {
                    class176.method1161(var3, var24, 512, arg0 - -1, var25, var6);
                }
                var24 += 4;
            }
        }
        var2.method70();
        int var7 = (228 + (int) (20.0D * Math.random()) << 16) + (238 - -((int) (20.0D * Math.random())) - 10 << 8) + 238 - (-((int) (Math.random() * 20.0D)) - -10);
        int var8 = 238 + ((int) (Math.random() * 20.0D) - 10) << 16;
        int var9 = 1;
        if (arg1 != -30862) {
            field1616 = null;
        }
        while (var9 < 103) {
            for (int var23 = 1; var23 < 103; ++var23) {
                if (~(24 & class205.field3561[arg0][var23][var9]) == -1) {
                    class234.method1514(true, var23, var7, arg0, var8, var9);
                }
                if (~arg0 > -4 && (8 & class205.field3561[arg0 + 1][var23][var9]) != 0) {
                    class234.method1514(true, var23, var7, arg0 + 1, var8, var9);
                }
            }
            ++var9;
        }
        class111.field1774 = 0;
        for (int var10 = 0; var10 < 104; ++var10) {
            for (int var11 = 0; var11 < 104; ++var11) {
                long var12 = class23.method117(class196.field3401, var10, var11);
                if (var12 != 0L) {
                    class70 var14 = class190.method1232((int) (var12 >>> 32) & Integer.MAX_VALUE, 13090);
                    int var15 = var14.field1056;
                    if (var14.field1069 != null) {
                        for (int var16 = 0; var16 < var14.field1069.length; ++var16) {
                            if (~var14.field1069[var16] != 0) {
                                class70 var17 = class190.method1232(var14.field1069[var16], 13090);
                                if (~var17.field1056 <= -1) {
                                    var15 = var17.field1056;
                                    break;
                                }
                            }
                        }
                    }
                    if (~var15 <= -1) {
                        int var18 = var10;
                        int var19 = var11;
                        if (~var15 != -23 && ~var15 != -30 && ~var15 != -35 && var15 != 36 && var15 != 46 && ~var15 != -48 && ~var15 != -49) {
                            int[][] var20 = class169.field2951[class196.field3401].field731;
                            for (int var21 = 0; var21 < 10; ++var21) {
                                int var22 = (int) (4.0D * Math.random());
                                if (var22 == 0 && var18 > 0 && ~var18 < ~(var10 + -3) && (19661064 & var20[var18 + -1][var19]) == 0) {
                                    --var18;
                                }
                                if (~var22 == -2 && ~var18 > -104 && ~var18 > ~(var10 + 3) && ~(var20[var18 + 1][var19] & 19661184) == -1) {
                                    ++var18;
                                }
                                if (var22 == 2 && var19 > 0 && var11 + -3 < var19 && ~(19661058 & var20[var18][var19 + -1]) == -1) {
                                    --var19;
                                }
                                if (var22 == 3 && ~var19 > -104 && var19 < var11 + 3 && (19661088 & var20[var18][var19 + 1]) == 0) {
                                    ++var19;
                                }
                            }
                        }
                        class71.field1086[class111.field1774] = var14.field1073;
                        class91.field1425[class111.field1774] = var18;
                        class230.field3921[class111.field1774] = var19;
                        ++class111.field1774;
                    }
                }
            }
        }
        class88.field1361 = var2;
        class204.field3544.method22(-76);
    }

    @OriginalMember(owner = "client!l", name = "n", descriptor = "(B)I")
    public final int method669(byte arg0) {
        ++field1606;
        return arg0 >= -70 ? 78 : 255 & super.field1780[super.field1821++] - this.field1598.method523((byte) -91);
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(II[BI)V")
    public final void method670(int arg0, int arg1, byte[] arg2, int arg3) {
        ++field1607;
        for (int var5 = 0; var5 < arg0; ++var5) {
            arg2[arg3 + var5] = (byte) (super.field1780[super.field1821++] + -this.field1598.method523((byte) -58));
        }
        int var6 = 57 % ((-19 - arg1) / 41);
    }

    @OriginalMember(owner = "client!l", name = "p", descriptor = "(II)I")
    public final int method671(int arg0, int arg1) {
        ++field1618;
        int var3 = this.field1608 >> 3;
        int var4 = -(arg1 & this.field1608) + 8;
        this.field1608 += arg0;
        int var5 = 0;
        while (var4 < arg0) {
            var5 += (super.field1780[var3++] & class60.field819[var4]) << -var4 + arg0;
            arg0 -= var4;
            var4 = 8;
        }
        int var6;
        if (~arg0 != ~var4) {
            var6 = (super.field1780[var3] >> var4 - arg0 & class60.field819[arg0]) + var5;
        } else {
            var6 = (class60.field819[var4] & super.field1780[var3]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!l", name = "q", descriptor = "(II)V")
    public final void method672(int arg0, int arg1) {
        if (arg1 != 238) {
            this.method671(-50, 108);
        }
        ++field1600;
        super.field1780[super.field1821++] = (byte) (this.field1598.method523((byte) 124) + arg0);
    }
}
