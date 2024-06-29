import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mw")
public class class455 extends class501 {

    @OriginalMember(owner = "client!mw", name = "Fb", descriptor = "I")
    public static int field6311 = 0;

    @OriginalMember(owner = "client!mw", name = "Db", descriptor = "I")
    public static int field6309;

    @OriginalMember(owner = "client!mw", name = "Eb", descriptor = "I")
    public static int field6310;

    @OriginalMember(owner = "client!mw", name = "Gb", descriptor = "I")
    public static int field6312;

    @OriginalMember(owner = "client!mw", name = "Hb", descriptor = "I")
    public static int field6313;

    @OriginalMember(owner = "client!mw", name = "Ib", descriptor = "I")
    public static int field6314;

    @OriginalMember(owner = "client!mw", name = "Jb", descriptor = "I")
    public static int field6315;

    @OriginalMember(owner = "client!mw", name = "Kb", descriptor = "I")
    public static int field6316;

    @OriginalMember(owner = "client!mw", name = "Lb", descriptor = "I")
    public static int field6317;

    @OriginalMember(owner = "client!mw", name = "Mb", descriptor = "I")
    public static int field6318;

    @OriginalMember(owner = "client!mw", name = "Nb", descriptor = "I")
    public static int field6319;

    @OriginalMember(owner = "client!mw", name = "Ob", descriptor = "I")
    public static int field6320;

    @OriginalMember(owner = "client!mw", name = "Qb", descriptor = "I")
    public static int field6322;

    @OriginalMember(owner = "client!mw", name = "Rb", descriptor = "I")
    private int field6323;

    @OriginalMember(owner = "client!mw", name = "Sb", descriptor = "I")
    public static int field6324;

    @OriginalMember(owner = "client!mw", name = "Pb", descriptor = "Lni;")
    private class482 field6321;

    @OriginalMember(owner = "client!mw", name = "h", descriptor = "(Z)V")
    public static final void method2586(boolean arg0) {
        ++field6312;
        if (class285.field3921 == 7) {
            class9.method35((byte) 63, false);
        } else {
            class31.field401 = class589.field8272;
            class589.field8272 = null;
            if (!arg0) {
                field6311 = 25;
            }
            class178.method1232(13, (byte) 111);
        }
    }

    @OriginalMember(owner = "client!mw", name = "i", descriptor = "(Z)Z")
    public final boolean method2587(boolean arg0) {
        if (!arg0) {
            this.field6323 = 67;
        }
        ++field6310;
        int var2 = 255 & super.field6855[super.field6892] + -this.field6321.method2709(2);
        return var2 >= 128;
    }

    @OriginalMember(owner = "client!mw", name = "m", descriptor = "(II)V")
    public final void method2588(int arg0, int arg1) {
        if (arg0 != -7065) {
            this.field6321 = null;
        }
        ++field6324;
        super.field6855[super.field6892++] = (byte) (this.field6321.method2705(9007) + arg1);
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(BLni;)V")
    public final void method2589(byte arg0, class482 arg1) {
        ++field6315;
        this.field6321 = arg1;
        if (arg0 != 82) {
            this.method2591(36);
        }
    }

    @OriginalMember(owner = "client!mw", name = "<init>", descriptor = "(I)V")
    public class455(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!mw", name = "n", descriptor = "(II)I")
    public final int method2590(int arg0, int arg1) {
        ++field6314;
        if (arg0 != 20065) {
            this.method2591(-92);
        }
        return arg1 * 8 - this.field6323;
    }

    @OriginalMember(owner = "client!mw", name = "q", descriptor = "(I)I")
    public final int method2591(int arg0) {
        ++field6318;
        if (arg0 != 1) {
            return 123;
        } else {
            int var2 = super.field6855[super.field6892++] - this.field6321.method2705(9007) & 255;
            return var2 < 128 ? var2 : (super.field6855[super.field6892++] + -this.field6321.method2705(arg0 + 9006) & 255) + (var2 + -128 << 8);
        }
    }

    @OriginalMember(owner = "client!mw", name = "b", descriptor = "(BI)I")
    public final int method2592(byte arg0, int arg1) {
        ++field6313;
        int var3 = this.field6323 >> 3;
        int var4 = -10 % ((arg0 - -35) / 52);
        int var5 = -(this.field6323 & 7) + 8;
        int var6 = 0;
        this.field6323 += arg1;
        while (var5 < arg1) {
            var6 += (class598.field8360[var5] & super.field6855[var3++]) << -var5 + arg1;
            arg1 -= var5;
            var5 = 8;
        }
        int var7;
        if (~arg1 == ~var5) {
            var7 = (super.field6855[var3] & class598.field8360[var5]) + var6;
        } else {
            var7 = (super.field6855[var3] >> -arg1 + var5 & class598.field8360[arg1]) + var6;
        }
        return var7;
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(ILls;III)V")
    public static final void method2593(int arg0, class124 arg1, int arg2, int arg3, int arg4) {
        ++field6316;
        class67 var5 = arg1.method895(arg4 ^ -25227);
        int var6 = 16383 & arg1.field1695 - arg1.field1738.field7046;
        if (~arg2 != arg4) {
            if (~arg1.field1701 != 0 && (var6 >= 10240 || var6 <= 2048)) {
                int var7 = 16383 & class533.field7203[arg0] + -arg1.field1738.field7046;
                if (~arg2 == -3 && ~var5.field875 != 0) {
                    if (var7 > 2048 && var7 <= 6144 && var5.field911 != -1) {
                        arg1.field1761 = var5.field911;
                    } else if (~var7 <= -10241 && var7 < 14336 && ~var5.field874 != 0) {
                        arg1.field1761 = var5.field874;
                    } else if (~var7 < -6145 && var7 < 10240 && ~var5.field893 != 0) {
                        arg1.field1761 = var5.field893;
                    } else {
                        arg1.field1761 = var5.field875;
                    }
                } else if (~arg2 == -1 && ~var5.field890 != 0) {
                    if (~var7 < -2049 && ~var7 >= -6145 && var5.field886 != -1) {
                        arg1.field1761 = var5.field886;
                    } else if (var7 >= 10240 && ~var7 > -14337 && ~var5.field906 != 0) {
                        arg1.field1761 = var5.field906;
                    } else if (~var7 < -6145 && ~var7 > -10241 && ~var5.field870 != 0) {
                        arg1.field1761 = var5.field870;
                    } else {
                        arg1.field1761 = var5.field890;
                    }
                } else if (~var7 < -2049 && ~var7 >= -6145 && ~var5.field864 != 0) {
                    arg1.field1761 = var5.field864;
                } else if (~var7 <= -10241 && ~var7 > -14337 && ~var5.field899 != 0) {
                    arg1.field1761 = var5.field899;
                } else if (var7 > 6144 && ~var7 > -10241 && var5.field873 != -1) {
                    arg1.field1761 = var5.field873;
                } else {
                    arg1.field1761 = var5.field882;
                }
                arg1.field1703 = false;
            } else if (~var6 == -1 && arg1.field1717 <= 25) {
                arg1.field1703 = false;
                if (~arg2 == -3 && var5.field875 != -1) {
                    arg1.field1761 = var5.field875;
                } else if (arg2 == 0 && ~var5.field890 != 0) {
                    arg1.field1761 = var5.field890;
                } else {
                    arg1.field1761 = var5.field882;
                }
            } else {
                arg1.field1703 = false;
                if (~arg2 == -3 && ~var5.field875 != 0) {
                    if (~arg3 > -1 && var5.field867 != -1) {
                        arg1.field1761 = var5.field867;
                    } else if (arg3 > 0 && ~var5.field881 != 0) {
                        arg1.field1761 = var5.field881;
                    } else {
                        arg1.field1761 = var5.field875;
                    }
                } else if (arg2 == 0 && ~var5.field890 != 0) {
                    if (arg3 < 0 && ~var5.field910 != 0) {
                        arg1.field1761 = var5.field910;
                    } else if (arg3 > 0 && var5.field897 != -1) {
                        arg1.field1761 = var5.field897;
                    } else {
                        arg1.field1761 = var5.field890;
                    }
                } else if (~arg3 > -1 && var5.field895 != -1) {
                    arg1.field1761 = var5.field895;
                } else if (~arg3 < -1 && var5.field913 != -1) {
                    arg1.field1761 = var5.field913;
                } else {
                    arg1.field1761 = var5.field882;
                }
            }
        } else if (~var6 == -1 && ~arg1.field1717 >= -26) {
            if (!arg1.field1703 || !var5.method568(arg1.field1761, false)) {
                arg1.field1761 = var5.method565(0);
                arg1.field1703 = arg1.field1761 != -1;
            }
        } else {
            if (~arg3 > -1 && ~var5.field908 != 0) {
                arg1.field1761 = var5.field908;
                arg1.field1703 = false;
            } else if (arg3 > 0 && var5.field889 != -1) {
                arg1.field1761 = var5.field889;
            } else {
                arg1.field1761 = var5.field882;
            }
            arg1.field1703 = false;
        }
    }

    @OriginalMember(owner = "client!mw", name = "j", descriptor = "(Z)V")
    public final void method2594(boolean arg0) {
        this.field6323 = super.field6892 * 8;
        if (!arg0) {
            this.field6323 = 74;
        }
        ++field6319;
    }

    @OriginalMember(owner = "client!mw", name = "r", descriptor = "(I)V")
    public final void method2595(int arg0) {
        super.field6892 = (this.field6323 - -7) / 8;
        if (arg0 != 0) {
            field6311 = -36;
        }
        ++field6322;
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(B[I)V")
    public final void method2596(byte arg0, int[] arg1) {
        ++field6317;
        this.field6321 = new class482(arg1);
        if (arg0 != 0) {
            this.method2590(126, 40);
        }
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(II[BZ)V")
    public final void method2597(int arg0, int arg1, byte[] arg2, boolean arg3) {
        ++field6309;
        if (!arg3) {
            for (int var5 = 0; arg0 > var5; ++var5) {
                arg2[var5 - -arg1] = (byte) (super.field6855[super.field6892++] + -this.field6321.method2705(9007));
            }
        }
    }
}
