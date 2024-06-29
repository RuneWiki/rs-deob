import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mv")
public class class252 extends class209 {

    @OriginalMember(owner = "client!mv", name = "Fb", descriptor = "I")
    public static int field3739 = 0;

    @OriginalMember(owner = "client!mv", name = "Ib", descriptor = "[I")
    public static int[] field3742 = new int[] { 104, 120, 136, 168 };

    @OriginalMember(owner = "client!mv", name = "Xb", descriptor = "Lri;")
    public static class73 field3757 = new class73(8, 2);

    @OriginalMember(owner = "client!mv", name = "Gb", descriptor = "I")
    public static int field3740;

    @OriginalMember(owner = "client!mv", name = "Hb", descriptor = "I")
    public static int field3741;

    @OriginalMember(owner = "client!mv", name = "Kb", descriptor = "I")
    public static int field3744;

    @OriginalMember(owner = "client!mv", name = "Lb", descriptor = "I")
    public static int field3745;

    @OriginalMember(owner = "client!mv", name = "Mb", descriptor = "I")
    public static int field3746;

    @OriginalMember(owner = "client!mv", name = "Nb", descriptor = "I")
    private int field3747;

    @OriginalMember(owner = "client!mv", name = "Ob", descriptor = "I")
    public static int field3748;

    @OriginalMember(owner = "client!mv", name = "Pb", descriptor = "I")
    public static int field3749;

    @OriginalMember(owner = "client!mv", name = "Rb", descriptor = "I")
    public static int field3751;

    @OriginalMember(owner = "client!mv", name = "Sb", descriptor = "I")
    public static int field3752;

    @OriginalMember(owner = "client!mv", name = "Tb", descriptor = "I")
    public static int field3753;

    @OriginalMember(owner = "client!mv", name = "Ub", descriptor = "I")
    public static int field3754;

    @OriginalMember(owner = "client!mv", name = "Vb", descriptor = "I")
    public static int field3755;

    @OriginalMember(owner = "client!mv", name = "Wb", descriptor = "I")
    public static int field3756;

    @OriginalMember(owner = "client!mv", name = "Jb", descriptor = "Lgj;")
    public static class447 field3743;

    @OriginalMember(owner = "client!mv", name = "Qb", descriptor = "Ldc;")
    private class5 field3750;

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(I[[I)V", line = 3)
    public static final void method1684(int arg0, int[][] arg1) {
        int var2 = -41 / ((arg0 - -78) / 37);
        ++field3745;
        class339.field4800 = arg1;
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(III)V", line = 14)
    public static final void method1685(int arg0, int arg1, int arg2) {
        ++field3753;
        class338 var3 = class230.method1580(6, arg1 + -1332176988, arg0);
        var3.method2053(-72);
        var3.field4756 = arg2;
        if (arg1 != 10660) {
            field3739 = -14;
        }
    }

    @OriginalMember(owner = "client!mv", name = "q", descriptor = "(II)V", line = 28)
    public final void method1686(int arg0, int arg1) {
        if (arg0 != -4) {
            this.field3747 = -42;
        }
        ++field3749;
        super.field3036[super.field3037++] = (byte) (this.field3750.method28(0) + arg1);
    }

    @OriginalMember(owner = "client!mv", name = "r", descriptor = "(II)I", line = 39)
    public final int method1687(int arg0, int arg1) {
        if (arg1 < 34) {
            this.field3750 = null;
        }
        ++field3748;
        return arg0 * 8 + -this.field3747;
    }

    @OriginalMember(owner = "client!mv", name = "n", descriptor = "(B)V", line = 56)
    public static void method1688(byte arg0) {
        field3743 = null;
        field3757 = null;
        field3742 = null;
        if (arg0 != 0) {
            method1698((byte) 43);
        }
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(I[BIZ)V", line = 69)
    public final void method1689(int arg0, byte[] arg1, int arg2, boolean arg3) {
        ++field3744;
        for (int var5 = 0; var5 < arg0; ++var5) {
            arg1[arg2 + var5] = (byte) (super.field3036[super.field3037++] + -this.field3750.method28(0));
        }
        if (arg3) {
            field3757 = null;
        }
    }

    @OriginalMember(owner = "client!mv", name = "d", descriptor = "(BI)I", line = 87)
    public final int method1690(byte arg0, int arg1) {
        if (arg0 != 1) {
            this.method1690((byte) -4, -4);
        }
        ++field3752;
        int var3 = this.field3747 >> 3;
        int var4 = -(this.field3747 & 7) + 8;
        this.field3747 += arg1;
        int var5 = 0;
        while (arg1 > var4) {
            var5 += (class195.field2834[var4] & super.field3036[var3++]) << -var4 + arg1;
            arg1 -= var4;
            var4 = 8;
        }
        int var6;
        if (~arg1 == ~var4) {
            var6 = (class195.field2834[var4] & super.field3036[var3]) + var5;
        } else {
            var6 = (super.field3036[var3] >> var4 - arg1 & class195.field2834[arg1]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!mv", name = "e", descriptor = "(Z)V", line = 126)
    public final void method1691(boolean arg0) {
        ++field3756;
        if (!arg0) {
            super.field3037 = (this.field3747 + 7) / 8;
        }
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "([II)V", line = 138)
    public final void method1692(int[] arg0, int arg1) {
        if (arg1 >= 118) {
            this.field3750 = new class5(arg0);
            ++field3754;
        }
    }

    @OriginalMember(owner = "client!mv", name = "o", descriptor = "(B)I", line = 149)
    public final int method1693(byte arg0) {
        ++field3755;
        if (arg0 >= -75) {
            return 34;
        } else {
            int var2 = 255 & super.field3036[super.field3037++] - this.field3750.method28(0);
            return ~var2 > -129 ? var2 : (var2 + -128 << 8) - -(255 & super.field3036[super.field3037++] - this.field3750.method28(0));
        }
    }

    @OriginalMember(owner = "client!mv", name = "f", descriptor = "(Z)Z", line = 165)
    public final boolean method1694(boolean arg0) {
        ++field3741;
        int var2 = 255 & super.field3036[super.field3037] + -this.field3750.method32((byte) 64);
        if (~var2 > -129) {
            return false;
        } else {
            if (!arg0) {
                this.field3750 = null;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!mv", name = "t", descriptor = "(I)V", line = 190)
    public final void method1695(int arg0) {
        ++field3740;
        if (arg0 >= 12) {
            this.field3747 = super.field3037 * 8;
        }
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(II[BI[BIIII)V", line = 206)
    public static final void method1696(int arg0, int arg1, byte[] arg2, int arg3, byte[] arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field3746;
        int var9 = -(arg0 >> 2);
        int var10 = -(arg0 & 3);
        if (arg5 != 0) {
            method1684(-19, (int[][]) null);
        }
        for (int var11 = -arg8; ~var11 > -1; ++var11) {
            int var10001;
            for (int var12 = var9; var12 < 0; ++var12) {
                var10001 = arg6++;
                arg2[var10001] += arg4[arg3++];
                int var14 = arg6++;
                arg2[var14] += arg4[arg3++];
                int var15 = arg6++;
                arg2[var15] += arg4[arg3++];
                int var16 = arg6++;
                arg2[var16] += arg4[arg3++];
            }
            for (int var13 = var10; ~var13 > -1; ++var13) {
                var10001 = arg6++;
                arg2[var10001] += arg4[arg3++];
            }
            arg3 += arg1;
            arg6 += arg7;
        }
    }

    @OriginalMember(owner = "client!mv", name = "<init>", descriptor = "(I)V", line = 250)
    public class252(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!mv", name = "s", descriptor = "(II)V", line = 261)
    public static final void method1697(int arg0, int arg1) {
        class518 var2 = class108.field1553[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; ++var3) {
            class518 var4 = class108.field1553[var3][arg0][arg1] = class108.field1553[var3 + 1][arg0][arg1];
            if (var4 != null) {
                --var4.field7549;
                for (class284 var5 = var4.field7569; var5 != null; var5 = var5.field4087) {
                    class117 var6 = var5.field4083;
                    if (var6.field1762 == arg0 && var6.field1771 == arg1) {
                        --var6.field1768;
                    }
                }
            }
        }
        if (class108.field1553[0][arg0][arg1] == null) {
            class108.field1553[0][arg0][arg1] = new class518(0, arg0, arg1);
            class108.field1553[0][arg0][arg1].field7553 = 1;
        }
        class108.field1553[0][arg0][arg1].field7571 = var2;
        class108.field1553[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!mv", name = "p", descriptor = "(B)V", line = 300)
    public static final void method1698(byte arg0) {
        if (class200.method1360(17952)) {
            if (class285.field4100 == null) {
                class44.method284((byte) -114);
            }
            class180.field2641 = 0;
            class18.field197 = true;
            try {
                class417.field6259 = class436.field6522.getToolkit().getSystemClipboard();
            } catch (Exception var1) {
            }
        }
        ++field3751;
        if (arg0 > -75) {
            method1698((byte) 123);
        }
    }
}
