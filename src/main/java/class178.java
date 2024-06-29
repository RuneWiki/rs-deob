import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class178 extends class184 {

    @OriginalMember(owner = "client!jl", name = "F", descriptor = "I")
    private int field2350 = 32768;

    @OriginalMember(owner = "client!jl", name = "D", descriptor = "Z")
    public static boolean field2348 = false;

    @OriginalMember(owner = "client!jl", name = "N", descriptor = "Lkg;")
    public static class179 field2357 = new class179(51, 4);

    @OriginalMember(owner = "client!jl", name = "O", descriptor = "Z")
    public static boolean field2358 = false;

    @OriginalMember(owner = "client!jl", name = "E", descriptor = "I")
    public static int field2349;

    @OriginalMember(owner = "client!jl", name = "G", descriptor = "I")
    public static int field2351;

    @OriginalMember(owner = "client!jl", name = "I", descriptor = "I")
    public static int field2352;

    @OriginalMember(owner = "client!jl", name = "J", descriptor = "I")
    public static int field2353;

    @OriginalMember(owner = "client!jl", name = "K", descriptor = "I")
    public static int field2354;

    @OriginalMember(owner = "client!jl", name = "L", descriptor = "I")
    public static int field2355;

    @OriginalMember(owner = "client!jl", name = "M", descriptor = "I")
    public static int field2356;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIZI)I", line = 8)
    public static final int method1137(int arg0, int arg1, boolean arg2, int arg3) {
        ++field2353;
        if (arg3 > -87) {
            return -122;
        } else {
            class529 var4 = class290.method1705(0, arg2, arg0);
            if (var4 == null) {
                return -1;
            } else {
                return ~arg1 <= -1 && ~var4.field7796.length < ~arg1 ? var4.field7796[arg1] : -1;
            }
        }
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(II)[[I", line = 29)
    public final int[][] method13(int arg0, int arg1) {
        ++field2351;
        if (arg1 != 1) {
            field2348 = true;
        }
        int[][] var3 = super.field2416.method3031(-28526, arg0);
        if (super.field2416.field7271) {
            int[] var4 = this.method1159(arg1 + 96, arg0, 1);
            int[] var5 = this.method1159(59, arg0, 2);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            for (int var9 = 0; var9 < class245.field3167; ++var9) {
                int var10 = var4[var9] * 255 >> 12 & 255;
                int var11 = var5[var9] * this.field2350 >> 12;
                int var12 = class108.field1360[var10] * var11 >> 12;
                int var13 = class397.field5691[var10] * var11 >> 12;
                int var14 = class421.field5961 & (var12 >> 12) + var9;
                int var15 = class501.field7240 & (var13 >> 12) + arg0;
                int[][] var16 = this.method1163(arg1, var15, 0);
                var6[var9] = var16[0][var14];
                var7[var9] = var16[1][var14];
                var8[var9] = var16[2][var14];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(BILfh;)V", line = 86)
    public final void method7(byte arg0, int arg1, class463 arg2) {
        if (~arg1 != -1) {
            if (arg1 == 1) {
                super.field2406 = arg2.method2737(false) == 1;
            }
        } else {
            this.field2350 = arg2.method2758((byte) 99) << 4;
        }
        ++field2349;
        int var5 = -62 / ((-13 - arg0) / 51);
    }

    @OriginalMember(owner = "client!jl", name = "<init>", descriptor = "()V", line = 195)
    public class178() {
        super(3, false);
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(Z)V", line = 127)
    public final void method109(boolean arg0) {
        ++field2352;
        class93.method721(4096);
        if (arg0) {
            this.field2350 = 109;
        }
    }

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "(III)V", line = 141)
    public static final void method1138(int arg0, int arg1, int arg2) {
        boolean var3 = class125.field1664[0][arg1][arg2] != null && class125.field1664[0][arg1][arg2].field7146 != null;
        for (int var4 = arg0; var4 >= 0; --var4) {
            if (class125.field1664[var4][arg1][arg2] == null) {
                class490 var5 = class125.field1664[var4][arg1][arg2] = new class490(var4, arg1, arg2);
                if (var3) {
                    ++var5.field7140;
                }
            }
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIIIIIBI)V", line = 162)
    public static final void method1139(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7) {
        if (arg6 <= -78) {
            ++field2355;
            if (arg2 >= class147.field1870 && class237.field3019 >= arg7 && ~class533.field7845 >= ~arg4 && arg3 <= class289.field3694) {
                class271.method1607(arg1, arg4, (byte) -53, arg7, arg2, arg3, arg5, arg0);
            } else {
                class464.method2799(arg3, arg7, arg2, arg1, arg4, arg0, arg5, (byte) -76);
            }
        }
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(B)V", line = 181)
    public static void method1140(byte arg0) {
        if (arg0 >= 102) {
            field2357 = null;
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(II)[I", line = 202)
    public final int[] method6(int arg0, int arg1) {
        ++field2354;
        int[] var3 = super.field2409.method248(arg0, 16776960);
        if (arg1 != 578) {
            field2357 = null;
        }
        if (super.field2409.field436) {
            int[] var4 = this.method1159(111, arg0, 1);
            int[] var5 = this.method1159(arg1 + -537, arg0, 2);
            for (int var6 = 0; ~class245.field3167 < ~var6; ++var6) {
                int var7 = (var4[var6] & 4087) >> 4;
                int var8 = var5[var6] * this.field2350 >> 12;
                int var9 = class108.field1360[var7] * var8 >> 12;
                int var10 = class397.field5691[var7] * var8 >> 12;
                int var11 = var6 - -(var9 >> 12) & class421.field5961;
                int var12 = arg0 - -(var10 >> 12) & class501.field7240;
                int[] var13 = this.method1159(72, var12, 0);
                var3[var6] = var13[var11];
            }
        }
        return var3;
    }
}
