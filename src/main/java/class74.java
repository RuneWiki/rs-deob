import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class74 extends class135 {

    @OriginalMember(owner = "client!ke", name = "cb", descriptor = "I")
    private int field1069 = 2048;

    @OriginalMember(owner = "client!ke", name = "Z", descriptor = "I")
    private int field1066 = 3072;

    @OriginalMember(owner = "client!ke", name = "V", descriptor = "I")
    private int field1062 = 1024;

    @OriginalMember(owner = "client!ke", name = "gb", descriptor = "Lqj;")
    public static class196 field1073 = class80.method502("blinken1:", -48);

    @OriginalMember(owner = "client!ke", name = "fb", descriptor = "Lba;")
    public static class93 field1072 = new class93(64);

    @OriginalMember(owner = "client!ke", name = "kb", descriptor = "Lqj;")
    public static class196 field1077 = class80.method502("::noclip", -48);

    @OriginalMember(owner = "client!ke", name = "W", descriptor = "I")
    public static int field1063;

    @OriginalMember(owner = "client!ke", name = "X", descriptor = "I")
    public static int field1064;

    @OriginalMember(owner = "client!ke", name = "Y", descriptor = "I")
    public static int field1065;

    @OriginalMember(owner = "client!ke", name = "ab", descriptor = "I")
    public static int field1067;

    @OriginalMember(owner = "client!ke", name = "bb", descriptor = "I")
    public static int field1068;

    @OriginalMember(owner = "client!ke", name = "db", descriptor = "I")
    public static int field1070;

    @OriginalMember(owner = "client!ke", name = "eb", descriptor = "I")
    public static int field1071;

    @OriginalMember(owner = "client!ke", name = "hb", descriptor = "I")
    public static int field1074;

    @OriginalMember(owner = "client!ke", name = "ib", descriptor = "I")
    public static int field1075;

    @OriginalMember(owner = "client!ke", name = "jb", descriptor = "Log;")
    public static class38 field1076;

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "(B)V")
    public final void method102(byte arg0) {
        ++field1064;
        if (arg0 != -85) {
            this.field1069 = 52;
        }
        this.field1069 = -this.field1062 + this.field1066;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lp;II)V")
    public final void method97(class56 arg0, int arg1, int arg2) {
        ++field1065;
        if (arg2 != -16231) {
            this.field1069 = -76;
        }
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (arg1 == 2) {
                    super.field1962 = ~arg0.method367(arg2 + 16232) == -2;
                }
            } else {
                this.field1066 = arg0.method318(true);
            }
        } else {
            this.field1062 = arg0.method318(true);
        }
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(Z)V")
    public static final void method469(boolean arg0) {
        if (!arg0) {
            method474((byte) -106, 89, -60);
        }
        ++field1067;
        for (int var1 = -1; ~class252.field4451 < ~var1; ++var1) {
            int var2;
            if (~var1 == 0) {
                var2 = 2047;
            } else {
                var2 = class14.field153[var1];
            }
            class134 var3 = class247.field4397[var2];
            if (var3 != null) {
                class67.method431(121, var3, var3.field2049);
            }
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIII)I")
    public static final int method470(int arg0, int arg1, int arg2, int arg3) {
        ++field1063;
        if (arg2 != 103) {
            method471(57);
        }
        int var4 = arg3 >> 7;
        int var5 = arg0 >> 7;
        if (var4 >= 0 && ~var5 <= -1 && var4 <= 103 && ~var5 >= -104) {
            int var6 = arg1;
            int var7 = arg3 & 127;
            if (~arg1 > -4 && ~(class88.field1300[1][var4][var5] & 2) == -3) {
                var6 = arg1 + 1;
            }
            int var8 = (-var7 + 128) * class42.field480[var6][var4][var5 + 1] + class42.field480[var6][var4 + 1][var5 + 1] * var7 >> 7;
            int var9 = (128 - var7) * class42.field480[var6][var4][var5] - -(class42.field480[var6][var4 + 1][var5] * var7) >> 7;
            int var10 = 127 & arg0;
            return (128 - var10) * var9 + var8 * var10 >> 7;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "(I)V")
    public static final void method471(int arg0) {
        class169 var1 = (class169) class198.field3518.method1651((byte) -59);
        if (arg0 < 102) {
            method470(-69, 47, 71, -40);
        }
        while (var1 != null) {
            class232 var2 = var1.field2853;
            if (~class27.field335 == ~var2.field4134 && !var2.field4124) {
                if (~var2.field4144 >= ~class171.field2879) {
                    var2.method1559(false, class113.field1658);
                    if (var2.field4124) {
                        var1.method797((byte) 116);
                    } else {
                        class87.method543(var2.field4134, var2.field4125, var2.field4147, var2.field4145, 60, var2, 0, -1L, false);
                    }
                }
            } else {
                var1.method797((byte) 120);
            }
            var1 = (class169) class198.field3518.method1656(-30);
        }
        ++field1071;
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(II)[[I")
    public final int[][] method164(int arg0, int arg1) {
        ++field1068;
        int[][] var3 = super.field1947.method511(arg1, arg0 ^ -260028744);
        if (arg0 != 260028743) {
            this.method99(56, false);
        }
        if (super.field1947.field1180) {
            int[][] var4 = this.method818(2, arg1, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var3[0];
            for (int var11 = 0; var11 < class131.field1862; ++var11) {
                var10[var11] = (var5[var11] * this.field1069 >> 12) + this.field1062;
                var8[var11] = (var6[var11] * this.field1069 >> 12) + this.field1062;
                var9[var11] = (var7[var11] * this.field1069 >> 12) + this.field1062;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "(B)V")
    public static void method472(byte arg0) {
        if (arg0 == -23) {
            field1072 = null;
            field1077 = null;
            field1076 = null;
            field1073 = null;
        }
    }

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "(II)I")
    public static final int method473(int arg0, int arg1) {
        if (arg1 != 255) {
            field1072 = null;
        }
        ++field1075;
        return 255 & arg0;
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "()V")
    public class74() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(BII)V")
    public static final void method474(byte arg0, int arg1, int arg2) {
        ++field1074;
        if (arg0 != -82) {
            method472((byte) -120);
        }
        if (~class211.field3801 != -1 && arg2 != -1) {
            class171.method1118(0, false, arg2, class243.field4334, class211.field3801, (byte) 114);
            class102.field1476 = true;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IZ)[I")
    public final int[] method99(int arg0, boolean arg1) {
        ++field1070;
        if (arg1) {
            field1077 = null;
        }
        int[] var3 = super.field1954.method110(arg0, -126);
        if (super.field1954.field244) {
            int[] var4 = this.method819(-127, 0, arg0);
            for (int var5 = 0; var5 < class131.field1862; ++var5) {
                var3[var5] = (var4[var5] * this.field1069 >> 12) + this.field1062;
            }
        }
        return var3;
    }
}
