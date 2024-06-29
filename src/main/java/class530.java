import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!is")
public class class530 extends class325 {

    @OriginalMember(owner = "client!is", name = "C", descriptor = "I")
    private int field7232 = 0;

    @OriginalMember(owner = "client!is", name = "G", descriptor = "I")
    private int field7236 = 4096;

    @OriginalMember(owner = "client!is", name = "E", descriptor = "[I")
    public static int[] field7234 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!is", name = "D", descriptor = "I")
    public static int field7233;

    @OriginalMember(owner = "client!is", name = "F", descriptor = "I")
    public static int field7235;

    @OriginalMember(owner = "client!is", name = "H", descriptor = "I")
    public static int field7237;

    @OriginalMember(owner = "client!is", name = "I", descriptor = "I")
    public static int field7238;

    @OriginalMember(owner = "client!is", name = "<init>", descriptor = "()V", line = 4)
    public class530() {
        super(1, false);
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(Ljp;IB)V", line = 8)
    public final void method95(class376 arg0, int arg1, byte arg2) {
        ++field7233;
        if (arg2 > -41) {
            this.method100((byte) 100, -33);
        }
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 == 2) {
                    super.field4738 = arg0.method2398(-1372747256) == 1;
                }
            } else {
                this.field7236 = arg0.method2359(-1);
            }
        } else {
            this.field7232 = arg0.method2359(-1);
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(IB)[[I", line = 54)
    public final int[][] method360(int arg0, byte arg1) {
        ++field7235;
        int[][] var3 = super.field4733.method1251((byte) 84, arg0);
        if (arg1 != -9) {
            field7234 = null;
        }
        if (super.field4733.field2369) {
            int[][] var4 = this.method2063(0, 1, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class261.field3874 < ~var11; ++var11) {
                int var12 = var5[var11];
                int var13 = var6[var11];
                int var14 = var7[var11];
                if (~var12 <= ~this.field7232) {
                    if (~var12 >= ~this.field7236) {
                        var8[var11] = var12;
                    } else {
                        var8[var11] = this.field7236;
                    }
                } else {
                    var8[var11] = this.field7232;
                }
                if (~var13 <= ~this.field7232) {
                    if (~this.field7236 > ~var13) {
                        var9[var11] = this.field7236;
                    } else {
                        var9[var11] = var13;
                    }
                } else {
                    var9[var11] = this.field7232;
                }
                if (this.field7232 > var14) {
                    var10[var11] = this.field7232;
                } else if (this.field7236 < var14) {
                    var10[var11] = this.field7236;
                } else {
                    var10[var11] = var14;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(BI)[I", line = 133)
    public final int[] method100(byte arg0, int arg1) {
        ++field7237;
        int[] var3 = super.field4727.method2603(arg1, -13476);
        if (arg0 <= 21) {
            this.field7232 = -87;
        }
        if (super.field4727.field6067) {
            int[] var4 = this.method2062(arg1, 0, (byte) 33);
            for (int var5 = 0; class261.field3874 > var5; ++var5) {
                int var6 = var4[var5];
                if (this.field7232 <= var6) {
                    if (var6 > this.field7236) {
                        var3[var5] = this.field7236;
                    } else {
                        var3[var5] = var6;
                    }
                } else {
                    var3[var5] = this.field7232;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!is", name = "b", descriptor = "(I)V", line = 179)
    public static void method3043(int arg0) {
        field7234 = null;
        if (arg0 != 2) {
            method3044(44, (byte) 114, -19);
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(IBI)Z", line = 190)
    public static final boolean method3044(int arg0, byte arg1, int arg2) {
        ++field7238;
        if (arg1 != 113) {
            return false;
        } else {
            return ~(arg2 & 33) != -1;
        }
    }
}
