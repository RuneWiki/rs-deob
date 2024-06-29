import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class665 extends class215 {

    @OriginalMember(owner = "client!ua", name = "Zb", descriptor = "[S")
    public static short[] field9093 = new short[] { 11, 17, 45, 23, 48, 8, 57, 58 };

    @OriginalMember(owner = "client!ua", name = "Jb", descriptor = "I")
    public static int field9077;

    @OriginalMember(owner = "client!ua", name = "Kb", descriptor = "I")
    public static int field9078;

    @OriginalMember(owner = "client!ua", name = "Lb", descriptor = "I")
    private int field9079;

    @OriginalMember(owner = "client!ua", name = "Mb", descriptor = "I")
    public static int field9080;

    @OriginalMember(owner = "client!ua", name = "Pb", descriptor = "I")
    public static int field9083;

    @OriginalMember(owner = "client!ua", name = "Qb", descriptor = "I")
    public static int field9084;

    @OriginalMember(owner = "client!ua", name = "Rb", descriptor = "I")
    public static int field9085;

    @OriginalMember(owner = "client!ua", name = "Sb", descriptor = "I")
    public static int field9086;

    @OriginalMember(owner = "client!ua", name = "Tb", descriptor = "I")
    public static int field9087;

    @OriginalMember(owner = "client!ua", name = "Ub", descriptor = "I")
    public static int field9088;

    @OriginalMember(owner = "client!ua", name = "Vb", descriptor = "I")
    public static int field9089;

    @OriginalMember(owner = "client!ua", name = "Wb", descriptor = "I")
    public static int field9090;

    @OriginalMember(owner = "client!ua", name = "Xb", descriptor = "I")
    public static int field9091;

    @OriginalMember(owner = "client!ua", name = "Yb", descriptor = "I")
    public static int field9092;

    @OriginalMember(owner = "client!ua", name = "ac", descriptor = "I")
    public static int field9094;

    @OriginalMember(owner = "client!ua", name = "Nb", descriptor = "Lku;")
    private class377 field9081;

    @OriginalMember(owner = "client!ua", name = "Ob", descriptor = "[I")
    public static int[] field9082;

    @OriginalMember(owner = "client!ua", name = "w", descriptor = "(I)Z", line = 5)
    public final boolean method3727(int arg0) {
        ++field9083;
        if (arg0 != -1510) {
            return true;
        } else {
            int var2 = super.field3066[super.field3109] - this.field9081.method2379((byte) 19) & 255;
            return ~var2 <= -129;
        }
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(IZ)I", line = 24)
    public static final int method3728(int arg0, boolean arg1) {
        ++field9090;
        if (class669.field9118 == null) {
            return 0;
        } else if (!arg1 && class538.field7445 != null) {
            return class669.field9118.length * 2;
        } else {
            int var2 = 0;
            if (arg0 != 2012104999) {
                method3728(118, false);
            }
            for (int var3 = 0; class669.field9118.length > var3; ++var3) {
                int var4 = class669.field9118[var3];
                if (class428.field6143.method874(false, var4)) {
                    ++var2;
                }
                if (class281.field3935.method874(false, var4)) {
                    ++var2;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I[I)V", line = 61)
    public final void method3729(int arg0, int[] arg1) {
        ++field9080;
        this.field9081 = new class377(arg1);
        if (arg0 > -41) {
            field9082 = null;
        }
    }

    @OriginalMember(owner = "client!ua", name = "x", descriptor = "(I)I", line = 74)
    public final int method3730(int arg0) {
        ++field9077;
        int var2 = super.field3066[super.field3109++] - this.field9081.method2382((byte) -67) & 255;
        if (var2 < 128) {
            return var2;
        } else {
            if (arg0 != 15295) {
                field9082 = null;
            }
            return (super.field3066[super.field3109++] - this.field9081.method2382((byte) -62) & 255) + (var2 + -128 << 8);
        }
    }

    @OriginalMember(owner = "client!ua", name = "q", descriptor = "(II)V", line = 90)
    public final void method3731(int arg0, int arg1) {
        super.field3066[super.field3109++] = (byte) (arg0 + this.field9081.method2382((byte) -85));
        if (arg1 == 18676) {
            ++field9085;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I[BII)V", line = 101)
    public final void method3732(int arg0, byte[] arg1, int arg2, int arg3) {
        if (arg3 == -32769) {
            for (int var5 = 0; ~arg0 < ~var5; ++var5) {
                arg1[arg2 + var5] = (byte) (super.field3066[super.field3109++] + -this.field9081.method2382((byte) -99));
            }
            ++field9087;
        }
    }

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "(BI)I", line = 123)
    public final int method3733(byte arg0, int arg1) {
        if (arg0 != -24) {
            return -126;
        } else {
            ++field9088;
            int var3 = this.field9079 >> 3;
            int var4 = -(this.field9079 & 7) + 8;
            this.field9079 += arg1;
            int var5 = 0;
            while (var4 < arg1) {
                var5 += (super.field3066[var3++] & class38.field941[var4]) << arg1 - var4;
                arg1 -= var4;
                var4 = 8;
            }
            int var6;
            if (arg1 != var4) {
                var6 = (super.field3066[var3] >> var4 - arg1 & class38.field941[arg1]) + var5;
            } else {
                var6 = (class38.field941[var4] & super.field3066[var3]) + var5;
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(III)V", line = 154)
    public static final void method3734(int arg0, int arg1, int arg2) {
        ++field9086;
        class594 var3 = class692.method3869(arg0, (byte) 105, arg1);
        var3.method3378(-25490);
        var3.field8126 = arg2;
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(Z)V", line = 167)
    public final void method3735(boolean arg0) {
        ++field9078;
        super.field3109 = (this.field9079 + 7) / 8;
        if (arg0) {
            field9093 = null;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIIIZIFZ)[[I", line = 180)
    public static final int[][] method3736(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, float arg7, boolean arg8) {
        ++field9089;
        int[][] var9 = new int[arg4][arg2];
        class512 var10 = new class512();
        var10.field7121 = (int) (arg7 * 4096.0F);
        var10.field7122 = arg1;
        var10.field7130 = arg3;
        var10.field7136 = arg0;
        var10.field7132 = arg8;
        var10.method711(109);
        class334.method2113(arg4, arg2, (byte) 120);
        if (!arg5) {
            field9082 = null;
        }
        for (int var11 = 0; var11 < arg4; ++var11) {
            var10.method3001(var11, var9[var11], (byte) 99);
        }
        return var9;
    }

    @OriginalMember(owner = "client!ua", name = "y", descriptor = "(I)V", line = 220)
    public static void method3737(int arg0) {
        field9093 = null;
        if (arg0 == 21515) {
            field9082 = null;
        }
    }

    @OriginalMember(owner = "client!ua", name = "r", descriptor = "(II)I", line = 232)
    public final int method3738(int arg0, int arg1) {
        if (arg0 >= -58) {
            method3728(50, true);
        }
        ++field9094;
        return arg1 * 8 + -this.field9079;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILku;)V", line = 250)
    public final void method3739(int arg0, class377 arg1) {
        int var3 = -103 / ((arg0 - 57) / 40);
        this.field9081 = arg1;
        ++field9091;
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(I)V", line = 264)
    public class665(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ua", name = "z", descriptor = "(I)V", line = 270)
    public final void method3740(int arg0) {
        int var2 = -126 / ((-15 - arg0) / 49);
        ++field9092;
        this.field9079 = super.field3109 * 8;
    }
}
