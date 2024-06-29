import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ap")
public class class340 extends class23 {

    @OriginalMember(owner = "client!ap", name = "bc", descriptor = "I")
    public static int field5329 = 1;

    @OriginalMember(owner = "client!ap", name = "kc", descriptor = "[I")
    public static int[] field5338 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!ap", name = "Zb", descriptor = "I")
    public static int field5327;

    @OriginalMember(owner = "client!ap", name = "ac", descriptor = "I")
    public static int field5328;

    @OriginalMember(owner = "client!ap", name = "cc", descriptor = "I")
    public static int field5330;

    @OriginalMember(owner = "client!ap", name = "dc", descriptor = "I")
    public static int field5331;

    @OriginalMember(owner = "client!ap", name = "ec", descriptor = "I")
    public static int field5332;

    @OriginalMember(owner = "client!ap", name = "gc", descriptor = "I")
    public static int field5334;

    @OriginalMember(owner = "client!ap", name = "hc", descriptor = "I")
    public static int field5335;

    @OriginalMember(owner = "client!ap", name = "ic", descriptor = "I")
    public static int field5336;

    @OriginalMember(owner = "client!ap", name = "jc", descriptor = "I")
    public static int field5337;

    @OriginalMember(owner = "client!ap", name = "lc", descriptor = "I")
    public static int field5339;

    @OriginalMember(owner = "client!ap", name = "mc", descriptor = "I")
    private int field5340;

    @OriginalMember(owner = "client!ap", name = "fc", descriptor = "Ltv;")
    private class328 field5333;

    @OriginalMember(owner = "client!ap", name = "Yb", descriptor = "Lnv;")
    public static class493 field5326;

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(IIILo;Lta;IILec;)V", line = 3)
    public static final void method2147(int arg0, int arg1, int arg2, class138 arg3, class448 arg4, int arg5, int arg6, class68 arg7) {
        ++field5335;
        if (arg3 != null) {
            int var8;
            if (class190.field2963 == 4) {
                var8 = (int) class88.field1483 & 16383;
            } else {
                var8 = 16383 & (int) class88.field1483 + class227.field3959;
            }
            int var9 = 10 + Math.max(arg7.field1009 / 2, arg7.field1081 / arg6);
            int var10 = arg1 * arg1 + arg5 * arg5;
            if (var10 <= var9 * var9) {
                int var11 = class46.field757[var8];
                int var12 = class46.field755[var8];
                if (~class190.field2963 != -5) {
                    var12 = var12 * 256 / (class435.field6507 + 256);
                    var11 = var11 * 256 / (class435.field6507 - -256);
                }
                int var13 = arg1 * var12 + arg5 * var11 >> 15;
                int var14 = arg5 * var12 + -(arg1 * var11) >> 15;
                arg3.method206(arg7.field1009 / 2 + arg0 - (-var13 + arg3.method200() / 2), arg7.field1081 / 2 + arg2 + -var14 + -(arg3.method198() / 2), arg4, arg0, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "([II)V", line = 45)
    public final void method2148(int[] arg0, int arg1) {
        ++field5339;
        if (arg1 != 1150446497) {
            this.field5340 = -41;
        }
        this.field5333 = new class328(arg0);
    }

    @OriginalMember(owner = "client!ap", name = "t", descriptor = "(I)V", line = 56)
    public final void method2149(int arg0) {
        super.field301 = (this.field5340 + 7) / 8;
        if (arg0 != 30795) {
            this.method2156(72, -14);
        }
        ++field5334;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(I[BII)V", line = 76)
    public final void method2150(int arg0, byte[] arg1, int arg2, int arg3) {
        ++field5327;
        for (int var5 = arg2; arg3 > var5; ++var5) {
            arg1[arg0 + var5] = (byte) (super.field302[super.field301++] + -this.field5333.method2069(-84));
        }
    }

    @OriginalMember(owner = "client!ap", name = "m", descriptor = "(B)Z", line = 104)
    public final boolean method2151(byte arg0) {
        if (arg0 != 4) {
            return false;
        } else {
            ++field5328;
            int var2 = super.field302[super.field301] + -this.field5333.method2066(-7315) & 255;
            return var2 >= 128;
        }
    }

    @OriginalMember(owner = "client!ap", name = "o", descriptor = "(II)I", line = 121)
    public final int method2152(int arg0, int arg1) {
        ++field5336;
        if (arg0 > -35) {
            field5329 = -114;
        }
        return arg1 * 8 + -this.field5340;
    }

    @OriginalMember(owner = "client!ap", name = "u", descriptor = "(I)I", line = 135)
    public final int method2153(int arg0) {
        if (arg0 != 15325) {
            this.method2154((byte) 103);
        }
        ++field5330;
        int var2 = super.field302[super.field301++] - this.field5333.method2069(-121) & 255;
        return ~var2 > -129 ? var2 : (255 & super.field302[super.field301++] - this.field5333.method2069(-97)) + (var2 + -128 << 8);
    }

    @OriginalMember(owner = "client!ap", name = "n", descriptor = "(B)V", line = 159)
    public final void method2154(byte arg0) {
        this.field5340 = super.field301 * 8;
        ++field5332;
        int var2 = 42 / ((-79 - arg0) / 40);
    }

    @OriginalMember(owner = "client!ap", name = "p", descriptor = "(II)I", line = 170)
    public final int method2155(int arg0, int arg1) {
        if (arg1 != 30390) {
            this.method2150(-13, (byte[]) null, -101, -17);
        }
        ++field5337;
        int var3 = this.field5340 >> 3;
        int var4 = -(7 & this.field5340) + 8;
        this.field5340 += arg0;
        int var5 = 0;
        while (var4 < arg0) {
            var5 += (super.field302[var3++] & class326.field5137[var4]) << arg0 - var4;
            arg0 -= var4;
            var4 = 8;
        }
        int var6;
        if (arg0 == var4) {
            var6 = (super.field302[var3] & class326.field5137[var4]) + var5;
        } else {
            var6 = (super.field302[var3] >> -arg0 + var4 & class326.field5137[arg0]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!ap", name = "q", descriptor = "(II)V", line = 201)
    public final void method2156(int arg0, int arg1) {
        ++field5331;
        super.field302[super.field301++] = (byte) (this.field5333.method2069(-49) + arg0);
        if (arg1 != -3498) {
            field5326 = null;
        }
    }

    @OriginalMember(owner = "client!ap", name = "o", descriptor = "(B)V", line = 213)
    public static void method2157(byte arg0) {
        field5326 = null;
        if (arg0 > -82) {
            method2147(86, -92, 25, (class138) null, (class448) null, 61, 17, (class68) null);
        }
        field5338 = null;
    }

    @OriginalMember(owner = "client!ap", name = "<init>", descriptor = "(I)V", line = 225)
    public class340(int arg0) {
        super(arg0);
    }
}
