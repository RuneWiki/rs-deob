import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class74 extends class115 {

    @OriginalMember(owner = "client!jk", name = "R", descriptor = "I")
    private int field1152 = 10;

    @OriginalMember(owner = "client!jk", name = "X", descriptor = "I")
    private int field1158 = 0;

    @OriginalMember(owner = "client!jk", name = "V", descriptor = "I")
    private int field1156 = 2048;

    @OriginalMember(owner = "client!jk", name = "U", descriptor = "[[[I")
    public static int[][][] field1155 = new int[2][][];

    @OriginalMember(owner = "client!jk", name = "O", descriptor = "I")
    public static int field1149 = 0;

    @OriginalMember(owner = "client!jk", name = "K", descriptor = "Lag;")
    public static class97 field1146 = new class97();

    @OriginalMember(owner = "client!jk", name = "J", descriptor = "I")
    public static int field1145;

    @OriginalMember(owner = "client!jk", name = "N", descriptor = "I")
    public static int field1148;

    @OriginalMember(owner = "client!jk", name = "Q", descriptor = "I")
    public static int field1151;

    @OriginalMember(owner = "client!jk", name = "S", descriptor = "I")
    public static int field1153;

    @OriginalMember(owner = "client!jk", name = "T", descriptor = "I")
    public static int field1154;

    @OriginalMember(owner = "client!jk", name = "W", descriptor = "I")
    public static int field1157;

    @OriginalMember(owner = "client!jk", name = "M", descriptor = "[I")
    private int[] field1147;

    @OriginalMember(owner = "client!jk", name = "P", descriptor = "[I")
    private int[] field1150;

    @OriginalMember(owner = "client!jk", name = "<init>", descriptor = "()V")
    public class74() {
        super(0, true);
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IJ)Ljava/lang/String;")
    public static final String method496(int arg0, long arg1) {
        ++field1153;
        if (arg1 > 0L && arg1 < 6582952005840035281L) {
            if (arg1 % 37L == 0L) {
                return null;
            } else if (arg0 != 4096) {
                return null;
            } else {
                int var3 = 0;
                for (long var4 = arg1; ~var4 != -1L; var4 /= 37L) {
                    ++var3;
                }
                StringBuffer var6 = new StringBuffer(var3);
                while (~arg1 != -1L) {
                    long var7 = arg1;
                    arg1 /= 37L;
                    var6.append(class172.field2466[(int) (-(arg1 * 37L) + var7)]);
                }
                return var6.reverse().toString();
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jk", name = "e", descriptor = "(I)V")
    private final void method497(int arg0) {
        ++field1157;
        this.field1147 = new int[this.field1152 + arg0];
        this.field1150 = new int[this.field1152 - -1];
        int var2 = 0;
        int var3 = 4096 / this.field1152;
        int var4 = this.field1156 * var3 >> 12;
        for (int var5 = 0; var5 < this.field1152; ++var5) {
            this.field1147[var5] = var2;
            this.field1150[var5] = var2 + var4;
            var2 += var3;
        }
        this.field1147[this.field1152] = 4096;
        this.field1150[this.field1152] = 4096 - -this.field1150[0];
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(ILkl;I)V")
    public final void method168(int arg0, class114 arg1, int arg2) {
        if (arg0 != -1) {
            this.method170((byte) 92);
        }
        ++field1154;
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    this.field1158 = arg1.method760(false);
                }
            } else {
                this.field1156 = arg1.method756(arg0 ^ 29900);
            }
        } else {
            this.field1152 = arg1.method760(false);
        }
    }

    @OriginalMember(owner = "client!jk", name = "f", descriptor = "(I)V")
    public static void method498(int arg0) {
        int var1 = -77 / ((arg0 - -58) / 52);
        field1146 = null;
        field1155 = null;
    }

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "(B)V")
    public final void method170(byte arg0) {
        this.method497(1);
        int var2 = 49 / ((78 - arg0) / 42);
        ++field1145;
    }

    @OriginalMember(owner = "client!jk", name = "e", descriptor = "(II)[I")
    public final int[] method116(int arg0, int arg1) {
        ++field1148;
        int[] var3 = super.field1705.method463(arg1, false);
        if (super.field1705.field1072) {
            int var4 = class187.field2664[arg1];
            if (this.field1158 != 0) {
                for (int var5 = 0; ~var5 > ~class77.field1178; ++var5) {
                    int var6 = 0;
                    short var7 = 0;
                    int var8 = class169.field2444[var5];
                    int var9 = this.field1158;
                    if (var9 != 1) {
                        if (var9 != 2) {
                            if (~var9 == -4) {
                                var6 = (-var4 + var8 >> 1) + 2048;
                            }
                        } else {
                            var6 = (var4 + -4096 + var8 >> 1) + 2048;
                        }
                    } else {
                        var6 = var8;
                    }
                    for (int var10 = 0; ~var10 > ~this.field1152; ++var10) {
                        if (~var6 <= ~this.field1147[var10] && ~this.field1147[var10 + 1] < ~var6) {
                            if (this.field1150[var10] > var6) {
                                var7 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var5] = var7;
                }
            } else {
                short var11 = 0;
                for (int var12 = 0; var12 < this.field1152; ++var12) {
                    if (this.field1147[var12] <= var4 && ~this.field1147[var12 + 1] < ~var4) {
                        if (var4 < this.field1150[var12]) {
                            var11 = 4096;
                        }
                        break;
                    }
                }
                class164.method1094(var3, 0, class77.field1178, var11);
            }
        }
        if (arg0 != 242152972) {
            method499((class233) null, 103);
        }
        return var3;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Lve;I)I")
    public static final int method499(class233 arg0, int arg1) {
        ++field1151;
        int var2 = arg1;
        if (arg0.method1509(false, class118.field1738)) {
            var2 = arg1 + 1;
        }
        if (arg0.method1509(false, class90.field1375)) {
            ++var2;
        }
        if (arg0.method1509(false, class264.field3982)) {
            ++var2;
        }
        if (arg0.method1509(false, class72.field1109)) {
            ++var2;
        }
        if (arg0.method1509(false, class267.field4143)) {
            ++var2;
        }
        if (arg0.method1509(false, class108.field1564)) {
            ++var2;
        }
        if (arg0.method1509(false, class24.field319)) {
            ++var2;
        }
        if (arg0.method1509(false, class52.field762)) {
            ++var2;
        }
        if (arg0.method1509(false, class260.field3933)) {
            ++var2;
        }
        if (arg0.method1509(false, class84.field1299)) {
            ++var2;
        }
        if (arg0.method1509(false, class223.field3332)) {
            ++var2;
        }
        if (arg0.method1509(false, class53.field775)) {
            ++var2;
        }
        if (arg0.method1509(false, class30.field433)) {
            ++var2;
        }
        if (arg0.method1509(false, class207.field2995)) {
            ++var2;
        }
        if (arg0.method1509(false, class122.field1768)) {
            ++var2;
        }
        return var2;
    }
}
