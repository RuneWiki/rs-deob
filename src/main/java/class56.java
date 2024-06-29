import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class56 extends class273 {

    @OriginalMember(owner = "client!pd", name = "T", descriptor = "Lmg;")
    public static class252 field1132 = new class252(512);

    @OriginalMember(owner = "client!pd", name = "bb", descriptor = "Z")
    public static boolean field1140 = false;

    @OriginalMember(owner = "client!pd", name = "fb", descriptor = "I")
    public static int field1144 = 0;

    @OriginalMember(owner = "client!pd", name = "hb", descriptor = "I")
    public static int field1146 = 0;

    @OriginalMember(owner = "client!pd", name = "ib", descriptor = "Ljd;")
    private static class86 field1147 = class122.method868("Connecting to update server", true);

    @OriginalMember(owner = "client!pd", name = "gb", descriptor = "I")
    public static int field1145 = 0;

    @OriginalMember(owner = "client!pd", name = "eb", descriptor = "I")
    public static int field1143 = 100;

    @OriginalMember(owner = "client!pd", name = "kb", descriptor = "Ljd;")
    public static class86 field1149 = field1147;

    @OriginalMember(owner = "client!pd", name = "X", descriptor = "I")
    public static int field1136 = 0;

    @OriginalMember(owner = "client!pd", name = "jb", descriptor = "[S")
    public static short[] field1148 = new short[256];

    @OriginalMember(owner = "client!pd", name = "ob", descriptor = "I")
    public static int field1153 = -1;

    @OriginalMember(owner = "client!pd", name = "mb", descriptor = "I")
    public static int field1151 = 0;

    @OriginalMember(owner = "client!pd", name = "qb", descriptor = "Ljd;")
    public static class86 field1155 = class122.method868("", true);

    @OriginalMember(owner = "client!pd", name = "nb", descriptor = "Ljd;")
    public static class86 field1152 = field1155;

    @OriginalMember(owner = "client!pd", name = "lb", descriptor = "Ljd;")
    public static class86 field1150 = field1155;

    @OriginalMember(owner = "client!pd", name = "rb", descriptor = "Lgd;")
    public static class73 field1156 = new class73(0, 0);

    @OriginalMember(owner = "client!pd", name = "U", descriptor = "I")
    public static int field1133;

    @OriginalMember(owner = "client!pd", name = "V", descriptor = "I")
    public static int field1134;

    @OriginalMember(owner = "client!pd", name = "W", descriptor = "I")
    public static int field1135;

    @OriginalMember(owner = "client!pd", name = "Y", descriptor = "I")
    public static int field1137;

    @OriginalMember(owner = "client!pd", name = "Z", descriptor = "I")
    public static int field1138;

    @OriginalMember(owner = "client!pd", name = "ab", descriptor = "Lbj;")
    public static class151 field1139;

    @OriginalMember(owner = "client!pd", name = "cb", descriptor = "Lbj;")
    public static class151 field1141;

    @OriginalMember(owner = "client!pd", name = "pb", descriptor = "Lbj;")
    public static class151 field1154;

    @OriginalMember(owner = "client!pd", name = "db", descriptor = "Lre;")
    public static class212 field1142;

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "(I)V")
    public static void method410(int arg0) {
        field1142 = null;
        field1141 = null;
        field1149 = null;
        field1139 = null;
        if (arg0 != 749476044) {
            method412(15, (byte) -51, 66, (int[]) null, -5);
        }
        field1147 = null;
        field1154 = null;
        field1150 = null;
        field1148 = null;
        field1152 = null;
        field1156 = null;
        field1132 = null;
        field1155 = null;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(ILqk;I)V")
    public final void method34(int arg0, class200 arg1, int arg2) {
        if (~arg0 == -1) {
            super.field4778 = ~arg1.method1408((byte) -47) == -2;
        }
        if (arg2 < -16) {
            ++field1138;
        }
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "()V")
    public class56() {
        super(3, false);
    }

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "(III)I")
    public static final int method411(int arg0, int arg1, int arg2) {
        ++field1134;
        if (arg2 != 1) {
            method411(47, 116, -10);
        }
        if (arg0 == -2) {
            return 12345678;
        } else if (~arg0 == 0) {
            if (arg1 < 2) {
                arg1 = 2;
            } else if (~arg1 < -127) {
                arg1 = 126;
            }
            return arg1;
        } else {
            int var3 = (127 & arg0) * arg1 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (65408 & arg0) + var3;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IBI[II)V")
    public static final void method412(int arg0, byte arg1, int arg2, int[] arg3, int arg4) {
        --arg4;
        ++field1133;
        int var6 = arg2 - 1;
        int var5 = var6 - 7;
        if (arg1 > -91) {
            method410(66);
        }
        while (var5 > arg4) {
            int var7 = arg4 + 1;
            arg3[var7] = arg0;
            int var8 = var7 + 1;
            arg3[var8] = arg0;
            int var9 = var8 + 1;
            arg3[var9] = arg0;
            int var10 = var9 + 1;
            arg3[var10] = arg0;
            int var11 = var10 + 1;
            arg3[var11] = arg0;
            int var12 = var11 + 1;
            arg3[var12] = arg0;
            int var13 = var12 + 1;
            arg3[var13] = arg0;
            arg4 = var13 + 1;
            arg3[arg4] = arg0;
        }
        while (~var6 < ~arg4) {
            ++arg4;
            arg3[arg4] = arg0;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IB)[[I")
    public final int[][] method29(int arg0, byte arg1) {
        int var3 = 8 / ((12 - arg1) / 58);
        ++field1137;
        int[][] var4 = super.field4787.method1657(arg0, (byte) -114);
        if (super.field4787.field4355) {
            int[] var5 = this.method1863(-97, 2, arg0);
            int[][] var6 = this.method1859(arg0, 0, 3);
            int[][] var7 = this.method1859(arg0, 1, 3);
            int[] var8 = var4[0];
            int[] var9 = var4[1];
            int[] var10 = var6[0];
            int[] var11 = var4[2];
            int[] var12 = var6[1];
            int[] var13 = var6[2];
            int[] var14 = var7[1];
            int[] var15 = var7[2];
            int[] var16 = var7[0];
            for (int var17 = 0; ~var17 > ~class176.field3200; ++var17) {
                int var18 = var5[var17];
                if (~var18 == -4097) {
                    var8[var17] = var10[var17];
                    var9[var17] = var12[var17];
                    var11[var17] = var13[var17];
                } else if (var18 != 0) {
                    int var19 = -var18 + 4096;
                    var8[var17] = var10[var17] * var18 + var16[var17] * var19 >> 12;
                    var9[var17] = var12[var17] * var18 - -(var14[var17] * var19) >> 12;
                    var11[var17] = var13[var17] * var18 - -(var15[var17] * var19) >> 12;
                } else {
                    var8[var17] = var16[var17];
                    var9[var17] = var14[var17];
                    var11[var17] = var15[var17];
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(II)[I")
    public final int[] method31(int arg0, int arg1) {
        if (arg0 != -7420) {
            field1142 = null;
        }
        ++field1135;
        int[] var3 = super.field4800.method1224(arg1, 0);
        if (super.field4800.field3160) {
            int[] var4 = this.method1863(-101, 0, arg1);
            int[] var5 = this.method1863(-104, 1, arg1);
            int[] var6 = this.method1863(arg0 + 7294, 2, arg1);
            for (int var7 = 0; ~class176.field3200 < ~var7; ++var7) {
                int var8 = var6[var7];
                if (~var8 == -4097) {
                    var3[var7] = var4[var7];
                } else if (~var8 != -1) {
                    var3[var7] = (-var8 + 4096) * var5[var7] + var4[var7] * var8 >> 12;
                } else {
                    var3[var7] = var5[var7];
                }
            }
        }
        return var3;
    }
}
