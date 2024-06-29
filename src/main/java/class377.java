import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class377 extends class192 {

    @OriginalMember(owner = "client!de", name = "O", descriptor = "[I")
    public static int[] field4833 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!de", name = "Q", descriptor = "Ltc;")
    public static class477 field4835 = null;

    @OriginalMember(owner = "client!de", name = "P", descriptor = "I")
    public static int field4834 = 0;

    @OriginalMember(owner = "client!de", name = "R", descriptor = "[I")
    public static int[] field4836 = new int[] { 32, 39, 44, 47 };

    @OriginalMember(owner = "client!de", name = "I", descriptor = "I")
    public static int field4827;

    @OriginalMember(owner = "client!de", name = "J", descriptor = "I")
    public static int field4828;

    @OriginalMember(owner = "client!de", name = "K", descriptor = "I")
    public static int field4829;

    @OriginalMember(owner = "client!de", name = "L", descriptor = "I")
    public static int field4830;

    @OriginalMember(owner = "client!de", name = "M", descriptor = "I")
    public static int field4831;

    @OriginalMember(owner = "client!de", name = "N", descriptor = "I")
    public static int field4832;

    @OriginalMember(owner = "client!de", name = "S", descriptor = "I")
    public static int field4837;

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "()V")
    public class377() {
        super(1, false);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ILfd;I)V")
    public final void method109(int arg0, class418 arg1, int arg2) {
        ++field4837;
        if (arg2 != -12160) {
            field4832 = -94;
        }
        if (arg0 == 0) {
            super.field2449 = arg1.method2396(60) == 1;
        }
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(III)Lpga;")
    public static final class152 method2155(int arg0, int arg1, int arg2) {
        class530 var3 = class483.field6438[arg0][arg1][arg2];
        return var3 != null && var3.field6878 != null ? var3.field6878 : null;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IB)[I")
    public final int[] method118(int arg0, byte arg1) {
        if (arg1 >= -123) {
            field4835 = null;
        }
        ++field4827;
        int[] var3 = super.field2448.method2978(arg0, (byte) -56);
        if (super.field2448.field7266) {
            int[] var4 = this.method1253(0, arg0, 0);
            for (int var5 = 0; class561.field7319 > var5; ++var5) {
                var3[var5] = -var4[var5] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(IB)[[I")
    public final int[][] method107(int arg0, byte arg1) {
        ++field4828;
        int[][] var3 = super.field2467.method2466(arg0, 0);
        if (super.field2467.field5565) {
            int[][] var4 = this.method1251(0, arg0, (byte) -117);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class561.field7319 < ~var11; ++var11) {
                var8[var11] = -var5[var11] + 4096;
                var9[var11] = 4096 - var6[var11];
                var10[var11] = -var7[var11] + 4096;
            }
        }
        int var12 = -17 % ((arg1 - -14) / 34);
        return var3;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Lwk;IZ)V")
    public static final void method2156(class227 arg0, int arg1, boolean arg2) {
        if (!arg2) {
            method2157((byte) -83);
        }
        ++field4831;
        int var3 = -1;
        int var4 = 0;
        if (class424.field5503 >= arg0.field2973) {
            if (~class424.field5503 < ~arg0.field3000) {
                class522.method2802(false, arg0, 0);
                var4 = class468.field6110;
                var3 = class230.field3078;
            } else {
                class600.method3264(arg2, arg0);
            }
        } else {
            class647.method3564(arg0, (byte) -125);
        }
        if (arg0.field506 < 512 || ~arg0.field503 > -513 || ~((class611.field8258 + -1) * 512) >= ~arg0.field506 || arg0.field503 >= class656.field9155 * 512 + -512) {
            var4 = 0;
            arg0.field2984 = -1;
            arg0.field3021 = -1;
            arg0.field2979 = null;
            arg0.field3006 = -1;
            arg0.field3000 = 0;
            arg0.field2973 = 0;
            var3 = -1;
            arg0.field506 = arg0.field3030[0] * 512 + arg0.method1265(124) * 256;
            arg0.field503 = arg0.field3039[0] * 512 - -(256 * arg0.method1265(103));
            arg0.method1424(10);
        }
        if (class233.field3130 == arg0 && (~arg0.field506 > -6145 || ~arg0.field503 > -6145 || (class611.field8258 + -12) * 512 <= arg0.field506 || ~(class656.field9155 * 512 + -6144) >= ~arg0.field503)) {
            arg0.field3006 = -1;
            arg0.field2973 = 0;
            arg0.field3000 = 0;
            arg0.field2984 = -1;
            var4 = 0;
            var3 = -1;
            arg0.field3021 = -1;
            arg0.field2979 = null;
            arg0.field506 = arg0.field3030[0] * 512 - -(256 * arg0.method1265(85));
            arg0.field503 = arg0.field3039[0] * 512 + arg0.method1265(85) * 256;
            arg0.method1424(10);
        }
        int var5 = class255.method1611(arg0, (byte) 123);
        class122.method906(var4, var3, 128, arg0, var5);
        class113.method859(arg0, -111, var3);
        class489.method2678(-1, arg0);
    }

    @OriginalMember(owner = "client!de", name = "e", descriptor = "(B)V")
    public static final void method2157(byte arg0) {
        ++field4830;
        int var1 = 0;
        if (arg0 > 88) {
            while (~var1 > ~class202.field2639) {
                class64 var2 = class47.field666[var1];
                if (var2.field870 == 3) {
                    if (var2.field881 == null) {
                        var2.field875 = Integer.MIN_VALUE;
                    } else {
                        class690.field9426.method2236(var2.field881);
                    }
                }
                ++var1;
            }
        }
    }

    @OriginalMember(owner = "client!de", name = "c", descriptor = "(I)V")
    public static void method2158(int arg0) {
        field4836 = null;
        field4835 = null;
        field4833 = null;
        if (arg0 >= -110) {
            method2159((byte) -71);
        }
    }

    @OriginalMember(owner = "client!de", name = "f", descriptor = "(B)V")
    public static final void method2159(byte arg0) {
        ++field4829;
        if (arg0 <= 62) {
            field4833 = null;
        }
        for (class118 var1 = (class118) class434.field5598.method2090(true); var1 != null; var1 = (class118) class434.field5598.method2088(-152)) {
            if (var1.field1532) {
                var1.method885(51);
            }
        }
        for (class118 var2 = (class118) class253.field3444.method2090(true); var2 != null; var2 = (class118) class253.field3444.method2088(-152)) {
            if (var2.field1532) {
                var2.method885(52);
            }
        }
    }
}
