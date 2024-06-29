import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class129 extends class166 {

    @OriginalMember(owner = "client!dd", name = "Q", descriptor = "I")
    private int field2401 = 1024;

    @OriginalMember(owner = "client!dd", name = "V", descriptor = "I")
    private int field2406 = 3072;

    @OriginalMember(owner = "client!dd", name = "U", descriptor = "I")
    private int field2405 = 2048;

    @OriginalMember(owner = "client!dd", name = "R", descriptor = "Lnb;")
    public static class199 field2402 = new class199(64);

    @OriginalMember(owner = "client!dd", name = "W", descriptor = "Lhj;")
    public static class69 field2407 = class181.method1318("::", (byte) -115);

    @OriginalMember(owner = "client!dd", name = "ab", descriptor = "I")
    public static int field2411 = 0;

    @OriginalMember(owner = "client!dd", name = "X", descriptor = "I")
    public static int field2408 = 0;

    @OriginalMember(owner = "client!dd", name = "Y", descriptor = "Lhj;")
    public static class69 field2409 = class181.method1318("0", (byte) -127);

    @OriginalMember(owner = "client!dd", name = "Z", descriptor = "[I")
    public static int[] field2410 = new int[100];

    @OriginalMember(owner = "client!dd", name = "db", descriptor = "J")
    public static long field2414 = 0L;

    @OriginalMember(owner = "client!dd", name = "O", descriptor = "I")
    public static int field2399;

    @OriginalMember(owner = "client!dd", name = "P", descriptor = "I")
    public static int field2400;

    @OriginalMember(owner = "client!dd", name = "S", descriptor = "I")
    public static int field2403;

    @OriginalMember(owner = "client!dd", name = "T", descriptor = "I")
    public static int field2404;

    @OriginalMember(owner = "client!dd", name = "cb", descriptor = "I")
    public static int field2413;

    @OriginalMember(owner = "client!dd", name = "bb", descriptor = "Lvc;")
    public static class185 field2412;

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "(I)V")
    public final void method16(int arg0) {
        ++field2403;
        this.field2405 = -this.field2401 + this.field2406;
        int var2 = -9 % ((58 - arg0) / 50);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(BLfh;I)V")
    public final void method18(byte arg0, class128 arg1, int arg2) {
        ++field2400;
        if (arg0 != 96) {
            this.method20(-25, -64);
        }
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    super.field3074 = arg1.method937(false) == 1;
                }
            } else {
                this.field2406 = arg1.method912(arg0 ^ -18);
            }
        } else {
            this.field2401 = arg1.method912(arg0 + -24);
        }
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "()V")
    public class129() {
        super(1, false);
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(IIIIII)Z")
    public static final boolean method965(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 == arg2 && arg3 == arg4) {
            if (!class152.method1154(arg0, arg1, arg3)) {
                return false;
            } else {
                int var6 = arg1 << 7;
                int var7 = arg3 << 7;
                return class64.method419(var6 + 1, class271.field4793[arg0][arg1][arg3] + arg5, var7 + 1) && class64.method419(var6 + 128 - 1, class271.field4793[arg0][arg1 + 1][arg3] + arg5, var7 + 1) && class64.method419(var6 + 128 - 1, class271.field4793[arg0][arg1 + 1][arg3 + 1] + arg5, var7 + 128 - 1) && class64.method419(var6 + 1, class271.field4793[arg0][arg1][arg3 + 1] + arg5, var7 + 128 - 1);
            }
        } else {
            for (int var8 = arg1; var8 <= arg2; ++var8) {
                for (int var14 = arg3; var14 <= arg4; ++var14) {
                    if (class139.field2593[arg0][var8][var14] == -class163.field3021) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << 7) + 1;
            int var10 = (arg3 << 7) + 2;
            int var11 = class271.field4793[arg0][arg1][arg3] + arg5;
            if (!class64.method419(var9, var11, var10)) {
                return false;
            } else {
                int var12 = (arg2 << 7) - 1;
                if (!class64.method419(var12, var11, var10)) {
                    return false;
                } else {
                    int var13 = (arg4 << 7) - 1;
                    if (!class64.method419(var9, var11, var13)) {
                        return false;
                    } else if (!class64.method419(var12, var11, var13)) {
                        return false;
                    } else {
                        return true;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(II)[[I")
    public final int[][] method134(int arg0, int arg1) {
        ++field2404;
        if (arg0 != 0) {
            method965(29, 111, 28, 93, 10, -113);
        }
        int[][] var3 = super.field3064.method320(arg1, (byte) -65);
        if (super.field3064.field979) {
            int[][] var4 = this.method1229(arg1, 23580, 0);
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class253.field4565 > var11; ++var11) {
                var8[var11] = this.field2401 - -(var6[var11] * this.field2405 >> 12);
                var9[var11] = this.field2401 - -(var5[var11] * this.field2405 >> 12);
                var10[var11] = this.field2401 - -(var7[var11] * this.field2405 >> 12);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "(I)V")
    public static void method966(int arg0) {
        if (arg0 == 7) {
            field2402 = null;
            field2412 = null;
            field2409 = null;
            field2410 = null;
            field2407 = null;
        }
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(II)[I")
    public final int[] method20(int arg0, int arg1) {
        ++field2399;
        if (arg1 != 8388607) {
            field2410 = null;
        }
        int[] var3 = super.field3071.method1252(arg0, true);
        if (super.field3071.field3142) {
            int[] var4 = this.method1231(arg1 + -8388481, arg0, 0);
            for (int var5 = 0; ~var5 > ~class253.field4565; ++var5) {
                var3[var5] = this.field2401 - -(var4[var5] * this.field2405 >> 12);
            }
        }
        return var3;
    }
}
