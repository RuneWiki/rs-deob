import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class83 extends class260 {

    @OriginalMember(owner = "client!nc", name = "S", descriptor = "I")
    private int field1647 = 204;

    @OriginalMember(owner = "client!nc", name = "Z", descriptor = "I")
    private int field1654 = 1;

    @OriginalMember(owner = "client!nc", name = "W", descriptor = "I")
    private int field1651 = 1;

    @OriginalMember(owner = "client!nc", name = "T", descriptor = "[I")
    public static int[] field1648 = new int[32];

    @OriginalMember(owner = "client!nc", name = "Q", descriptor = "Loh;")
    private static class263 field1645 = class253.method1681(-119, "Loading)3)3)3");

    @OriginalMember(owner = "client!nc", name = "Y", descriptor = "[S")
    public static short[] field1653 = new short[] { 58, 33, 3, 24, 30, 18, 25, 23 };

    @OriginalMember(owner = "client!nc", name = "bb", descriptor = "Loh;")
    public static class263 field1656 = field1645;

    @OriginalMember(owner = "client!nc", name = "ab", descriptor = "Loh;")
    public static class263 field1655 = class253.method1681(-122, "null");

    @OriginalMember(owner = "client!nc", name = "R", descriptor = "Loh;")
    public static class263 field1646 = class253.method1681(-127, "gleiten:");

    @OriginalMember(owner = "client!nc", name = "L", descriptor = "I")
    public static int field1640;

    @OriginalMember(owner = "client!nc", name = "M", descriptor = "I")
    public static int field1641;

    @OriginalMember(owner = "client!nc", name = "N", descriptor = "I")
    public static int field1642;

    @OriginalMember(owner = "client!nc", name = "O", descriptor = "I")
    public static int field1643;

    @OriginalMember(owner = "client!nc", name = "U", descriptor = "I")
    public static int field1649;

    @OriginalMember(owner = "client!nc", name = "X", descriptor = "I")
    public static int field1652;

    @OriginalMember(owner = "client!nc", name = "cb", descriptor = "I")
    public static int field1657;

    @OriginalMember(owner = "client!nc", name = "V", descriptor = "[B")
    public static byte[] field1650;

    @OriginalMember(owner = "client!nc", name = "P", descriptor = "[Loh;")
    public static class263[] field1644;

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(II)[I")
    public final int[] method17(int arg0, int arg1) {
        ++field1641;
        if (arg1 != 255) {
            field1646 = null;
        }
        int[] var3 = super.field4511.method304(arg0, false);
        if (super.field4511.field1029) {
            for (int var4 = 0; ~var4 > ~class49.field1052; ++var4) {
                int var5 = class70.field1409[var4];
                int var6 = this.field1651 * var5 >> 12;
                int var7 = var5 % (4096 / this.field1651) * this.field1651;
                int var8 = class275.field4825[arg0];
                int var9 = this.field1654 * var8 >> 12;
                int var10 = var8 % (4096 / this.field1654) * this.field1654;
                if (this.field1647 > var10) {
                    for (var6 -= var9; var6 < 0; var6 += 4) {
                    }
                    while (var6 > 3) {
                        var6 -= 4;
                    }
                    if (var6 != 1) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (~var7 > ~this.field1647) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (~this.field1647 < ~var7) {
                    int var11;
                    for (var11 = var6 - var9; var11 < 0; var11 += 4) {
                    }
                    while (var11 > 3) {
                        var11 -= 4;
                    }
                    if (var11 > 0) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "(I)I")
    public static final int method557(int arg0) {
        if (arg0 < 124) {
            return -126;
        } else {
            ++field1642;
            return ((!class253.field4397 ? 0 : 1) << 19) + ((!class17.field394 ? 0 : 1) << 15) + ((class125.field2322 ? 1 : 0) << 10) + ((!class107.field2028 ? 0 : 1) << 9) + ((!class101.field1930 ? 0 : 1) << 6) + (7 & class183.field3310) - (-((!class1.field14 ? 0 : 1) << 3) - ((!class7.field135 ? 0 : 1) << 4) + -((!class146.field2670 ? 0 : 1) << 5) + -((class159.field2896 ? 1 : 0) << 7) + -((class1.field9 ? 1 : 0) << 8) - (((class277.field4853 & 3) << 11) + ((!class126.field2331 ? 0 : 1) << 13) + ((class187.field3372 ? 1 : 0) << 16) - -((~class265.field4632 != -1 ? 1 : 0) << 20)) - (((class95.field1866 != 0 ? 1 : 0) << 21) + ((~class214.field3798 != -1 ? 1 : 0) << 22)));
        }
    }

    @OriginalMember(owner = "client!nc", name = "g", descriptor = "(I)V")
    public static void method558(int arg0) {
        field1655 = null;
        field1648 = null;
        if (arg0 <= 71) {
            field1655 = null;
        }
        field1650 = null;
        field1653 = null;
        field1645 = null;
        field1656 = null;
        field1644 = null;
        field1646 = null;
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "()V")
    public class83() {
        super(0, true);
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "([IIIIII)V")
    public static final void method559(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class2 var6 = class18.field417[arg3][arg4][arg5];
        if (var6 != null) {
            class200 var7 = var6.field32;
            if (var7 == null) {
                class110 var10 = var6.field40;
                if (var10 != null) {
                    int var11 = var10.field2070;
                    int var12 = var10.field2069;
                    int var13 = var10.field2067;
                    int var14 = var10.field2063;
                    int[] var15 = class109.field2057[var11];
                    int[] var16 = class266.field4644[var12];
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
                int var8 = var7.field3606;
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

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method560(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field1643;
        int var8 = class98.method672(-257, class276.field4831, arg5, class11.field249);
        int var9 = class98.method672(-257, class276.field4831, arg3, class11.field249);
        int var10 = class98.method672(-257, class198.field3587, arg2, class51.field1099);
        int var11 = class98.method672(-257, class198.field3587, arg4, class51.field1099);
        int var12 = class98.method672(-257, class276.field4831, arg5 - -arg6, class11.field249);
        int var13 = class98.method672(-257, class276.field4831, -arg6 + arg3, class11.field249);
        for (int var14 = var8; var14 < var12; ++var14) {
            class191.method1255(var10, arg7, var11, 65, class38.field870[var14]);
        }
        for (int var15 = var9; ~var13 > ~var15; --var15) {
            class191.method1255(var10, arg7, var11, arg1 + 60, class38.field870[var15]);
        }
        int var16 = class98.method672(-257, class198.field3587, arg2 + arg6, class51.field1099);
        int var17 = class98.method672(-257, class198.field3587, -arg6 + arg4, class51.field1099);
        for (int var18 = var12; var18 <= var13; ++var18) {
            int[] var19 = class38.field870[var18];
            class191.method1255(var10, arg7, var16, 119, var19);
            class191.method1255(var16, arg0, var17, arg1 + 81, var19);
            class191.method1255(var17, arg7, var11, 67, var19);
        }
        if (arg1 != 0) {
            field1649 = 15;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IILsi;)V")
    public final void method86(int arg0, int arg1, class194 arg2) {
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    this.field1647 = arg2.method1294((byte) 3);
                }
            } else {
                this.field1654 = arg2.method1301(-8317);
            }
        } else {
            this.field1651 = arg2.method1301(arg1 ^ -13882);
        }
        if (arg1 != 5701) {
            this.method17(110, -73);
        }
        ++field1657;
    }
}
