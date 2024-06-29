import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oq")
public class class154 extends class512 {

    @OriginalMember(owner = "client!oq", name = "M", descriptor = "I")
    private int field2506 = 32768;

    @OriginalMember(owner = "client!oq", name = "O", descriptor = "Lvv;")
    public static class313 field2508 = new class313(39, 8);

    @OriginalMember(owner = "client!oq", name = "P", descriptor = "S")
    public static short field2509 = 205;

    @OriginalMember(owner = "client!oq", name = "G", descriptor = "I")
    public static int field2500;

    @OriginalMember(owner = "client!oq", name = "H", descriptor = "I")
    public static int field2501;

    @OriginalMember(owner = "client!oq", name = "I", descriptor = "I")
    public static int field2502;

    @OriginalMember(owner = "client!oq", name = "J", descriptor = "I")
    public static int field2503;

    @OriginalMember(owner = "client!oq", name = "K", descriptor = "I")
    public static int field2504;

    @OriginalMember(owner = "client!oq", name = "L", descriptor = "I")
    public static int field2505;

    @OriginalMember(owner = "client!oq", name = "N", descriptor = "I")
    public static int field2507;

    @OriginalMember(owner = "client!oq", name = "d", descriptor = "(I)V", line = 4)
    public final void method74(int arg0) {
        class187.method1265(256);
        if (arg0 == 12388) {
            ++field2501;
        }
    }

    @OriginalMember(owner = "client!oq", name = "b", descriptor = "(II)[[I", line = 18)
    public final int[][] method278(int arg0, int arg1) {
        ++field2504;
        int var3 = -46 / ((arg0 - -40) / 47);
        int[][] var4 = super.field7496.method2777(arg1, 0);
        if (super.field7496.field6942) {
            int[] var5 = this.method3013(false, 1, arg1);
            int[] var6 = this.method3013(false, 2, arg1);
            int[] var7 = var4[0];
            int[] var8 = var4[1];
            int[] var9 = var4[2];
            for (int var10 = 0; class402.field6113 > var10; ++var10) {
                int var11 = 255 & var5[var10] * 255 >> 12;
                int var12 = var6[var10] * this.field2506 >> 12;
                int var13 = class162.field2583[var11] * var12 >> 12;
                int var14 = class309.field4912[var11] * var12 >> 12;
                int var15 = (var13 >> 12) + var10 & class269.field4478;
                int var16 = class270.field4492 & (var14 >> 12) + arg1;
                int[][] var17 = this.method3012(var16, 112, 0);
                var7[var10] = var17[0][var15];
                var8[var10] = var17[1][var15];
                var9[var10] = var17[2][var15];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!oq", name = "<init>", descriptor = "()V", line = 74)
    public class154() {
        super(3, false);
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(IB)[I", line = 80)
    public final int[] method75(int arg0, byte arg1) {
        ++field2503;
        int[] var3 = super.field7494.method232(arg0, true);
        if (super.field7494.field474) {
            int[] var4 = this.method3013(false, 1, arg0);
            int[] var5 = this.method3013(false, 2, arg0);
            for (int var6 = 0; ~class402.field6113 < ~var6; ++var6) {
                int var7 = 255 & var4[var6] >> 4;
                int var8 = var5[var6] * this.field2506 >> 12;
                int var9 = class162.field2583[var7] * var8 >> 12;
                int var10 = class309.field4912[var7] * var8 >> 12;
                int var11 = class269.field4478 & (var9 >> 12) + var6;
                int var12 = (var10 >> 12) + arg0 & class270.field4492;
                int[] var13 = this.method3013(false, 0, var12);
                var3[var6] = var13[var11];
            }
        }
        int var14 = 18 / ((arg1 - 43) / 48);
        return var3;
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(JLza;B)V", line = 127)
    public static final void method1079(long arg0, class491 arg1, byte arg2) {
        class24.field373 = class10.field100;
        ++field2500;
        class339.field5324 = 0;
        class10.field100 = 0;
        long var4 = class19.method91((byte) 108);
        if (arg2 != 77) {
            method1079(-33L, (class491) null, (byte) -73);
        }
        for (class122 var6 = (class122) class305.field4876.method573(24037); var6 != null; var6 = (class122) class305.field4876.method576(14)) {
            if (var6.method963(arg1, arg0)) {
                ++class339.field5324;
            }
        }
        if (class497.field7279 && ~(arg0 % 100L) == -1L) {
            System.out.println("Particle system count: " + class305.field4876.method568(511) + ", running: " + class339.field5324 + ". Particles: " + class10.field100 + ". Time taken: " + (class19.method91((byte) 85) - var4) + "ms");
        }
    }

    @OriginalMember(owner = "client!oq", name = "f", descriptor = "(I)V", line = 159)
    public static void method1080(int arg0) {
        if (arg0 != 1325718700) {
            field2505 = 67;
        }
        field2508 = null;
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(IIIIZI)V", line = 170)
    public static final void method1081(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        if (arg5 < 1) {
            arg5 = 1;
        }
        ++field2507;
        if (arg2 < 1) {
            arg2 = 1;
        }
        int var6 = arg2 + -334;
        if (var6 < 0) {
            var6 = 0;
        } else if (var6 > 100) {
            var6 = 100;
        }
        int var7 = (-class504.field7351 + field2509) * var6 / 100 + class504.field7351;
        if (~class412.field6248 >= ~var7) {
            if (class311.field4924 < var7) {
                var7 = class311.field4924;
            }
        } else {
            var7 = class412.field6248;
        }
        if (arg3 != 255) {
            method1080(-44);
        }
        int var8 = arg2 * 512 * var7 / (arg5 * 334);
        if (class497.field7300 > var8) {
            short var9 = class497.field7300;
            var7 = arg5 * 334 * var9 / (arg2 * 512);
            if (~class311.field4924 > ~var7) {
                var7 = class311.field4924;
                int var10 = arg2 * var7 * 512 / (var9 * 334);
                int var11 = (arg5 - var10) / 2;
                if (arg4) {
                    class305.field4873.method848();
                    class305.field4873.method2864(arg1, (byte) 13, var11, arg0, arg2, -16777216);
                    class305.field4873.method2864(arg1, (byte) 13, var11, arg0 + arg5 - var11, arg2, -16777216);
                }
                arg5 -= var11 * 2;
                arg0 += var11;
            }
        } else if (class393.field6012 < var8) {
            short var12 = class393.field6012;
            var7 = arg5 * var12 * 334 / (arg2 * 512);
            if (class412.field6248 > var7) {
                var7 = class412.field6248;
                int var13 = arg5 * 334 * var12 / (var7 * 512);
                int var14 = (-var13 + arg2) / 2;
                if (arg4) {
                    class305.field4873.method848();
                    class305.field4873.method2864(arg1, (byte) 13, arg5, arg0, var14, -16777216);
                    class305.field4873.method2864(-var14 + arg2 + arg1, (byte) 13, arg5, arg0, var14, -16777216);
                }
                arg2 -= var14 * 2;
                arg1 += var14;
            }
        }
        class71.field1243 = arg2 * var7 / 334;
        class90.field1488 = arg1;
        class455.field6793 = (short) arg5;
        class208.field3290 = arg0;
        class432.field6467 = (short) arg2;
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(ZILia;)V", line = 267)
    public final void method71(boolean arg0, int arg1, class23 arg2) {
        if (arg1 != 0) {
            if (~arg1 == -2) {
                super.field7491 = ~arg2.method126((byte) -120) == -2;
            }
        } else {
            this.field2506 = arg2.method132(38) << 4;
        }
        if (!arg0) {
            field2508 = null;
        }
        ++field2502;
    }
}
