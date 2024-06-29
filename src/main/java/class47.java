import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class47 extends class66 {

    @OriginalMember(owner = "client!ge", name = "Vb", descriptor = "Lja;")
    public static class63 field1115 = new class63(100);

    @OriginalMember(owner = "client!ge", name = "Wb", descriptor = "Lja;")
    public static class63 field1116 = new class63(30);

    @OriginalMember(owner = "client!ge", name = "Yb", descriptor = "Lec;")
    private static class32 field1118 = class73.method594("Walk here", true);

    @OriginalMember(owner = "client!ge", name = "Xb", descriptor = "Lec;")
    public static class32 field1117 = field1118;

    @OriginalMember(owner = "client!ge", name = "Zb", descriptor = "I")
    public static int field1119 = 0;

    @OriginalMember(owner = "client!ge", name = "Hb", descriptor = "I")
    private int field1101;

    @OriginalMember(owner = "client!ge", name = "Ib", descriptor = "I")
    public static int field1102;

    @OriginalMember(owner = "client!ge", name = "Jb", descriptor = "I")
    public static int field1103;

    @OriginalMember(owner = "client!ge", name = "Kb", descriptor = "I")
    public static int field1104;

    @OriginalMember(owner = "client!ge", name = "Lb", descriptor = "I")
    public static int field1105;

    @OriginalMember(owner = "client!ge", name = "Mb", descriptor = "I")
    public static int field1106;

    @OriginalMember(owner = "client!ge", name = "Nb", descriptor = "I")
    public static int field1107;

    @OriginalMember(owner = "client!ge", name = "Pb", descriptor = "I")
    public static int field1109;

    @OriginalMember(owner = "client!ge", name = "Qb", descriptor = "I")
    public static int field1110;

    @OriginalMember(owner = "client!ge", name = "Rb", descriptor = "I")
    public static int field1111;

    @OriginalMember(owner = "client!ge", name = "Sb", descriptor = "I")
    public static int field1112;

    @OriginalMember(owner = "client!ge", name = "Tb", descriptor = "I")
    public static int field1113;

    @OriginalMember(owner = "client!ge", name = "Ub", descriptor = "I")
    public static int field1114;

    @OriginalMember(owner = "client!ge", name = "Ob", descriptor = "Lva;")
    private class147 field1108;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lea;Lea;Lc;BLea;)Z")
    public static final boolean method350(class30 arg0, class30 arg1, class15 arg2, byte arg3, class30 arg4) {
        class83.field1967 = arg2;
        class105.field2501 = arg0;
        ++field1109;
        if (arg3 != 19) {
            return false;
        } else {
            class97.field2239 = arg4;
            class98.field2259 = arg1;
            return true;
        }
    }

    @OriginalMember(owner = "client!ge", name = "s", descriptor = "(I)I")
    public final int method351(int arg0) {
        if (arg0 != -31263) {
            return -6;
        } else {
            ++field1114;
            return super.field1587[super.field1569++] - this.field1108.method1103(arg0 + 31267) & 255;
        }
    }

    @OriginalMember(owner = "client!ge", name = "t", descriptor = "(I)V")
    public final void method352(int arg0) {
        this.field1101 = super.field1569 * arg0;
        ++field1103;
    }

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "(IB)I")
    public final int method353(int arg0, byte arg1) {
        if (arg1 != 69) {
            field1118 = null;
        }
        ++field1106;
        int var3 = this.field1101 >> 3;
        int var4 = -(7 & this.field1101) + 8;
        int var5 = 0;
        this.field1101 += arg0;
        while (arg0 > var4) {
            var5 += (class157.field3609[var4] & super.field1587[var3++]) << -var4 + arg0;
            arg0 -= var4;
            var4 = 8;
        }
        int var6;
        if (~arg0 != ~var4) {
            var6 = (super.field1587[var3] >> -arg0 + var4 & class157.field3609[arg0]) + var5;
        } else {
            var6 = (class157.field3609[var4] & super.field1587[var3]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "(B)V")
    public static void method354(byte arg0) {
        field1117 = null;
        field1115 = null;
        field1116 = null;
        if (arg0 != -93) {
            method359((class30) null, -27, (byte) -9);
        }
        field1118 = null;
    }

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "(BI)I")
    public final int method355(byte arg0, int arg1) {
        if (arg0 >= -65) {
            field1118 = null;
        }
        ++field1104;
        return arg1 * 8 + -this.field1101;
    }

    @OriginalMember(owner = "client!ge", name = "u", descriptor = "(I)V")
    public final void method356(int arg0) {
        ++field1113;
        super.field1569 = (this.field1101 + arg0) / 8;
    }

    @OriginalMember(owner = "client!ge", name = "j", descriptor = "(II)V")
    public final void method357(int arg0, int arg1) {
        if (arg1 > -77) {
            this.field1101 = -81;
        }
        super.field1587[super.field1569++] = (byte) (arg0 + this.field1108.method1103(4));
        ++field1112;
    }

    @OriginalMember(owner = "client!ge", name = "v", descriptor = "(I)V")
    public static final void method358(int arg0) {
        ++field1107;
        if (arg0 < 68) {
            method354((byte) 113);
        }
        class44.field1015.method491(-123);
        class115.field2722.method491(-82);
        class33.field690.method491(-123);
        class137.field3187.method491(68);
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(I)V")
    public class47(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lea;IB)Z")
    public static final boolean method359(class30 arg0, int arg1, byte arg2) {
        ++field1105;
        byte[] var3 = arg0.method218(-28, arg1);
        if (var3 == null) {
            return false;
        } else if (arg2 < 51) {
            return true;
        } else {
            class54.method428(false, var3);
            return true;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "([IB)V")
    public final void method360(int[] arg0, byte arg1) {
        if (arg1 != -46) {
            method359((class30) null, 102, (byte) 86);
        }
        this.field1108 = new class147(arg0);
        ++field1102;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIII[Lqf;B[BII)V")
    public static final void method361(int arg0, int arg1, int arg2, int arg3, int arg4, class117[] arg5, byte arg6, byte[] arg7, int arg8, int arg9) {
        ++field1111;
        if (arg6 != 106) {
            field1116 = null;
        }
        for (int var10 = 0; ~var10 > -9; ++var10) {
            for (int var15 = 0; ~var15 > -9; ++var15) {
                if (~(arg2 + var10) < -1 && arg2 - -var10 < 103 && ~(arg1 + var15) < -1 && ~(arg1 + var15) > -104) {
                    arg5[arg9].field2813[arg2 - -var10][arg1 + var15] = class41.method326(arg5[arg9].field2813[arg2 - -var10][arg1 + var15], -16777217);
                }
            }
        }
        class66 var11 = new class66(arg7);
        for (int var12 = 0; ~var12 > -5; ++var12) {
            for (int var13 = 0; ~var13 > -65; ++var13) {
                for (int var14 = 0; var14 < 64; ++var14) {
                    if (~arg4 == ~var12 && arg0 <= var13 && var13 < arg0 - -8 && ~arg3 >= ~var14 && arg3 - -8 > var14) {
                        class134.method1027(var11, arg9, 0, -32565, arg8, class33.method282(arg6 + -106, arg8, 7 & var14, var13 & 7) + arg1, class39.method319(arg8, var13 & 7, arg6 + -12657, 7 & var14) + arg2, 0);
                    } else {
                        class134.method1027(var11, 0, 0, arg6 ^ -32607, 0, -1, -1, 0);
                    }
                }
            }
        }
    }
}
