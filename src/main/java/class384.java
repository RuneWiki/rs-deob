import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aha")
public class class384 extends class243 {

    @OriginalMember(owner = "client!aha", name = "H", descriptor = "I")
    private int field5402 = 32768;

    @OriginalMember(owner = "client!aha", name = "D", descriptor = "I")
    public static int field5399;

    @OriginalMember(owner = "client!aha", name = "F", descriptor = "I")
    public static int field5400;

    @OriginalMember(owner = "client!aha", name = "G", descriptor = "I")
    public static int field5401;

    @OriginalMember(owner = "client!aha", name = "I", descriptor = "I")
    public static int field5403;

    @OriginalMember(owner = "client!aha", name = "J", descriptor = "I")
    public static int field5404;

    @OriginalMember(owner = "client!aha", name = "K", descriptor = "I")
    public static int field5405;

    @OriginalMember(owner = "client!aha", name = "L", descriptor = "I")
    public static int field5406;

    @OriginalMember(owner = "client!aha", name = "M", descriptor = "I")
    public static int field5407;

    @OriginalMember(owner = "client!aha", name = "b", descriptor = "(II)[[I", line = 5)
    public final int[][] method2(int arg0, int arg1) {
        ++field5406;
        if (arg0 > -76) {
            this.field5402 = -101;
        }
        int[][] var3 = super.field3156.method3306(arg1, 0);
        if (super.field3156.field8335) {
            int[] var4 = this.method1462(arg1, 1, 0);
            int[] var5 = this.method1462(arg1, 2, 0);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            for (int var9 = 0; ~class687.field9628 < ~var9; ++var9) {
                int var10 = var4[var9] * 255 >> 12 & 255;
                int var11 = var5[var9] * this.field5402 >> 12;
                int var12 = class623.field8718[var10] * var11 >> 12;
                int var13 = class133.field1707[var10] * var11 >> 12;
                int var14 = class28.field206 & (var12 >> 12) + var9;
                int var15 = class625.field8744 & (var13 >> 12) + arg1;
                int[][] var16 = this.method1457(var15, 24431, 0);
                var6[var9] = var16[0][var14];
                var7[var9] = var16[1][var14];
                var8[var9] = var16[2][var14];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!aha", name = "<init>", descriptor = "()V", line = 62)
    public class384() {
        super(3, false);
    }

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;", line = 66)
    public static final String method2252(String arg0, int arg1) {
        ++field5404;
        String var2 = class360.method2066(class259.method1558((byte) -125, arg0), -120);
        int var3 = 93 % ((-74 - arg1) / 47);
        if (var2 == null) {
            var2 = "";
        }
        return var2;
    }

    @OriginalMember(owner = "client!aha", name = "d", descriptor = "(B)V", line = 82)
    public final void method85(byte arg0) {
        ++field5399;
        if (arg0 != 66) {
            this.method1(122, (class611) null, (byte) 17);
        }
        class333.method1982(0);
    }

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(II)[I", line = 93)
    public final int[] method5(int arg0, int arg1) {
        ++field5405;
        int[] var3 = super.field3164.method3742((byte) 98, arg1);
        if (super.field3164.field9250) {
            int[] var4 = this.method1462(arg1, 1, 0);
            int[] var5 = this.method1462(arg1, 2, 0);
            for (int var6 = 0; ~class687.field9628 < ~var6; ++var6) {
                int var7 = var4[var6] >> 4 & 255;
                int var8 = var5[var6] * this.field5402 >> 12;
                int var9 = class623.field8718[var7] * var8 >> 12;
                int var10 = class133.field1707[var7] * var8 >> 12;
                int var11 = class28.field206 & (var9 >> 12) + var6;
                int var12 = class625.field8744 & (var10 >> 12) + arg1;
                int[] var13 = this.method1462(var12, 0, 0);
                var3[var6] = var13[var11];
            }
        }
        if (arg0 != 255) {
            method2253(16);
        }
        return var3;
    }

    @OriginalMember(owner = "client!aha", name = "c", descriptor = "(I)V", line = 144)
    public static final void method2253(int arg0) {
        if (arg0 < -32) {
            class194.field2325.method1563(77);
            ++field5407;
        }
    }

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(ILji;B)V", line = 162)
    public final void method1(int arg0, class611 arg1, byte arg2) {
        if (~arg0 != -1) {
            if (~arg0 == -2) {
                super.field3159 = ~arg1.method3428((byte) -126) == -2;
            }
        } else {
            this.field5402 = arg1.method3402((byte) 127) << 4;
        }
        if (arg2 >= -92) {
            this.field5402 = 33;
        }
        ++field5403;
    }

    @OriginalMember(owner = "client!aha", name = "e", descriptor = "(I)V", line = 199)
    public static final void method2254(int arg0) {
        int var1 = 0 / ((-3 - arg0) / 47);
        ++field5401;
        try {
            if (~class226.field2934 == -2) {
                int var2 = class68.field755.method4029(-16257);
                if (~var2 < -1 && class68.field755.method4023(-3619)) {
                    int var3 = var2 - class276.field3683;
                    if (var3 < 0) {
                        var3 = 0;
                    }
                    class68.field755.method4035(var3, (byte) 48);
                    return;
                }
                class68.field755.method4033(85);
                class68.field755.method4018(-1);
                class321.field4313 = null;
                if (class476.field6580 == null) {
                    class226.field2934 = 0;
                } else {
                    class226.field2934 = 2;
                }
                class143.field1852 = null;
            }
            if (~class226.field2934 == -4) {
                int var4 = class68.field755.method4029(-16257);
                if (~class302.field4082 < ~var4 && class68.field755.method4023(-3619)) {
                    int var5 = class378.field5256 + var4;
                    if (~class302.field4082 > ~var5) {
                        var5 = class302.field4082;
                    }
                    class68.field755.method4035(var5, (byte) 72);
                } else {
                    class226.field2934 = 0;
                    class378.field5256 = 0;
                }
            }
        } catch (Exception var7) {
            var7.printStackTrace();
            class68.field755.method4033(105);
            class321.field4313 = null;
            class476.field6580 = null;
            class143.field1852 = null;
            class520.field6997 = null;
            class226.field2934 = 0;
        }
    }

    @OriginalMember(owner = "client!aha", name = "f", descriptor = "(I)Lqm;", line = 263)
    public static final class146 method2255(int arg0) {
        int var1 = -110 % ((arg0 - 20) / 46);
        ++field5400;
        return class175.method1003(1, -100);
    }
}
