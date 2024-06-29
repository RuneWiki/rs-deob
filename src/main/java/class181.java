import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cw")
public class class181 extends class87 {

    @OriginalMember(owner = "client!cw", name = "G", descriptor = "I")
    public static int field2779;

    @OriginalMember(owner = "client!cw", name = "L", descriptor = "I")
    public static int field2780;

    @OriginalMember(owner = "client!cw", name = "Y", descriptor = "I")
    public static int field2781;

    @OriginalMember(owner = "client!cw", name = "Z", descriptor = "I")
    public static int field2782;

    @OriginalMember(owner = "client!cw", name = "bb", descriptor = "I")
    public static int field2784;

    @OriginalMember(owner = "client!cw", name = "cb", descriptor = "I")
    public static int field2785;

    @OriginalMember(owner = "client!cw", name = "db", descriptor = "I")
    public static int field2786;

    @OriginalMember(owner = "client!cw", name = "eb", descriptor = "I")
    public static int field2787;

    @OriginalMember(owner = "client!cw", name = "ab", descriptor = "J")
    public static long field2783;

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(IIIIIIILns;ILns;)V", line = 7)
    public static final void method1278(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class405 arg7, int arg8, class405 arg9) {
        ++field2784;
        int var10 = arg7.method1799(arg6 + 314462286);
        if (var10 != -1) {
            Object var11 = null;
            class536 var12 = (class536) class592.field8412.method803(116, (long) var10);
            if (var12 == null) {
                class129[] var13 = class129.method920(class640.field8990, var10, 0);
                if (var13 == null) {
                    return;
                }
                var12 = class736.field10316.method422(var13[0], true);
                class592.field8412.method801(1, var12, (long) var10);
            }
            class748.method4177(-21727, arg9.field8428, arg9.method2579(false) * 256, arg2, arg4 >> 1, arg9.field8423, arg0 >> 1, arg9.field8429, arg6, arg8);
            int var14 = arg3 + -18 - -class340.field4942[0];
            int var15 = arg5 / 4 * 18 + var14;
            int var16 = arg1 + -16 + class340.field4942[1] + -54;
            int var17 = arg5 % 4 * 18 + var16;
            var12.method3142(var15, var17);
            if (arg7 == arg9) {
                class736.field10316.method481(-256, 73, var15 + -1, var17 - 1, 18, 18);
            }
            class497.method2963(var17 + 18, var15 + 18, (byte) -106, var17 - 1, var15 + -1);
            class457 var18 = class357.method2235(1);
            var18.field6738 = var17 + 16;
            var18.field6739 = var15 + 16;
            var18.field6737 = arg7;
            var18.field6745 = var15;
            var18.field6747 = var17;
            class325.field4637.method1616(22437, var18);
        }
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(IB)I", line = 56)
    public static final int method1279(int arg0, byte arg1) {
        if (arg1 > -8) {
            method1278(80, -75, -112, 64, 94, 110, -14, (class405) null, 84, (class405) null);
        }
        ++field2781;
        return 127 & arg0;
    }

    @OriginalMember(owner = "client!cw", name = "b", descriptor = "(II)I", line = 67)
    public static final int method1280(int arg0, int arg1) {
        ++field2780;
        int var2 = 0;
        if (arg0 < 0 || arg0 >= 65536) {
            arg0 >>>= 16;
            var2 += 16;
        }
        if (~arg0 <= -257) {
            var2 += 8;
            arg0 >>>= 8;
        }
        if (~arg0 <= -17) {
            arg0 >>>= 4;
            var2 += 4;
        }
        if (arg0 >= 4) {
            var2 += 2;
            arg0 >>>= 2;
        }
        if (arg1 <= 66) {
            field2783 = 79L;
        }
        if (~arg0 <= -2) {
            arg0 >>>= 1;
            ++var2;
        }
        return arg0 + var2;
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(II)[[I", line = 116)
    public final int[][] method196(int arg0, int arg1) {
        ++field2785;
        int[][] var3 = super.field387.method2809(arg1, (byte) -48);
        if (arg0 != -18210) {
            field2782 = -4;
        }
        if (super.field387.field6792 && this.method705(true)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = arg1 % super.field1231 * super.field1231;
            for (int var8 = 0; class729.field10216 > var8; ++var8) {
                int var9 = super.field1237[var8 % super.field1232 + var7];
                var6[var8] = class493.method2943(var9, 255) << 4;
                var5[var8] = class493.method2943(4080, var9 >> 4);
                var4[var8] = class493.method2943(var9, 16711680) >> 12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cw", name = "b", descriptor = "(III)V", line = 170)
    public static final void method1281(int arg0, int arg1, int arg2) {
        ++field2786;
        class150 var3 = class676.method3885(1000, arg0, arg2);
        var3.method1116(66);
        var3.field2346 = arg1;
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(IZI)B", line = 182)
    public static final byte method1282(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            field2782 = -20;
        }
        ++field2787;
        if (arg0 != 9) {
            return 0;
        } else {
            return (byte) (~(1 & arg2) == -1 ? 1 : 2);
        }
    }
}
