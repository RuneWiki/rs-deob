import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class253 extends class160 {

    @OriginalMember(owner = "client!jl", name = "cb", descriptor = "I")
    private int field4058 = -1;

    @OriginalMember(owner = "client!jl", name = "bb", descriptor = "I")
    public static int field4057 = 0;

    @OriginalMember(owner = "client!jl", name = "fb", descriptor = "I")
    public static int field4061 = 0;

    @OriginalMember(owner = "client!jl", name = "S", descriptor = "I")
    public int field4049;

    @OriginalMember(owner = "client!jl", name = "U", descriptor = "I")
    public static int field4050;

    @OriginalMember(owner = "client!jl", name = "V", descriptor = "I")
    public static int field4051;

    @OriginalMember(owner = "client!jl", name = "W", descriptor = "I")
    public static int field4052;

    @OriginalMember(owner = "client!jl", name = "X", descriptor = "I")
    public static int field4053;

    @OriginalMember(owner = "client!jl", name = "Y", descriptor = "I")
    public static int field4054;

    @OriginalMember(owner = "client!jl", name = "Z", descriptor = "I")
    public static int field4055;

    @OriginalMember(owner = "client!jl", name = "ab", descriptor = "I")
    public static int field4056;

    @OriginalMember(owner = "client!jl", name = "eb", descriptor = "I")
    public int field4060;

    @OriginalMember(owner = "client!jl", name = "gb", descriptor = "Lhc;")
    public static class235 field4062;

    @OriginalMember(owner = "client!jl", name = "db", descriptor = "[I")
    public int[] field4059;

    @OriginalMember(owner = "client!jl", name = "i", descriptor = "(B)V")
    public static void method1726(byte arg0) {
        int var1 = -61 % ((-55 - arg0) / 38);
        field4062 = null;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IZ)[[I")
    public int[][] method3(int arg0, boolean arg1) {
        ++field4055;
        int[][] var3 = super.field2476.method839(!arg1, arg0);
        if (!arg1) {
            method1728(-81L, (byte) 7);
        }
        if (super.field2476.field1950 && this.method1729(true)) {
            int[] var4 = var3[0];
            int[] var5 = var3[2];
            int[] var6 = var3[1];
            int var7 = this.field4049 * (~class79.field1328 == ~this.field4060 ? arg0 : this.field4060 * arg0 / class79.field1328);
            if (~class240.field3896 == ~this.field4049) {
                for (int var8 = 0; ~var8 > ~class240.field3896; ++var8) {
                    int var9 = this.field4059[var7++];
                    var5[var8] = class55.method420(var9 << 4, 4080);
                    var6[var8] = class55.method420(var9, 65280) >> 4;
                    var4[var8] = class55.method420(var9, 16711680) >> 12;
                }
            } else {
                for (int var10 = 0; var10 < class240.field3896; ++var10) {
                    int var11 = this.field4049 * var10 / class240.field3896;
                    int var12 = this.field4059[var7 + var11];
                    var5[var10] = class55.method420(var12 << 4, 4080);
                    var6[var10] = class55.method420(65280, var12) >> 4;
                    var4[var10] = class55.method420(16711680, var12) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jl", name = "<init>", descriptor = "()V")
    public class253() {
        super(0, false);
    }

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "(I)V")
    public final void method1086(int arg0) {
        super.method1086(115);
        this.field4059 = null;
        ++field4053;
        int var2 = -54 / ((-1 - arg0) / 35);
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Lai;II)V")
    public final void method2(class88 arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            this.field4058 = arg0.method645(11596);
        }
        ++field4054;
        if (arg1 < 11) {
            this.field4058 = 106;
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIZ)V")
    public static final void method1727(int arg0, int arg1, boolean arg2) {
        short var3 = 256;
        if (class25.field331 > 0) {
            class157.method1061(class25.field331, (byte) -83);
            class25.field331 = 0;
        }
        int var4 = 0;
        int var5 = class211.field3279 * arg0;
        ++field4050;
        if (!arg2) {
            int var6 = 0;
            for (int var7 = 1; var3 + -1 > var7; ++var7) {
                int var8 = (-var7 + var3) * class192.field2975[var7] / var3;
                if (var8 < 0) {
                    var8 = 0;
                }
                var4 += var8;
                for (int var9 = var8; var9 < 128; ++var9) {
                    int var11 = class33.field502[var4++];
                    int var12 = class211.field3275[var5++ + arg1];
                    if (~var11 == -1) {
                        class31.field457.field4393[var6++] = var12;
                    } else {
                        int var13 = var11 + 18;
                        int var14 = -var11 - -238;
                        int var15 = class139.field2130[var11];
                        if (var13 > 255) {
                            var13 = 255;
                        }
                        if (~var14 < -256) {
                            var14 = 255;
                        }
                        class31.field457.field4393[var6++] = class55.method420(var14 * class55.method420(var12, 16711935) + class55.method420(var15, 16711935) * var13, -16711936) + class55.method420(class55.method420(var12, 65280) * var14 + var13 * class55.method420(65280, var15), 16711680) >> 8;
                    }
                }
                for (int var10 = 0; ~var10 > ~var8; ++var10) {
                    class31.field457.field4393[var6++] = class211.field3275[var5++ + arg1];
                }
                var5 += class211.field3279 + -128;
            }
            class31.field457.method850(arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(JB)Ljava/lang/String;")
    public static final String method1728(long arg0, byte arg1) {
        ++field4052;
        return arg1 >= -29 ? null : class130.method903(-26704, arg0);
    }

    @OriginalMember(owner = "client!jl", name = "g", descriptor = "(B)I")
    public final int method1087(byte arg0) {
        if (arg0 != 89) {
            this.field4059 = null;
        }
        ++field4051;
        return this.field4058;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Z)Z")
    public final boolean method1729(boolean arg0) {
        if (!arg0) {
            this.field4058 = 107;
        }
        ++field4056;
        if (this.field4059 != null) {
            return true;
        } else if (this.field4058 >= 0) {
            class276 var2 = ~class60.field1040 > -1 ? class133.method921((byte) -121, class260.field4158, this.field4058) : class99.method726(class260.field4158, 3, class60.field1040, this.field4058);
            var2.method1858();
            this.field4060 = var2.field2871;
            this.field4049 = var2.field2874;
            this.field4059 = var2.field4393;
            return true;
        } else {
            return false;
        }
    }
}
