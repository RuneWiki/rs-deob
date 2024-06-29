import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ffa")
public class class197 extends class585 {

    @OriginalMember(owner = "client!ffa", name = "K", descriptor = "I")
    private int field3010 = -1;

    @OriginalMember(owner = "client!ffa", name = "G", descriptor = "Z")
    public static boolean field3006 = false;

    @OriginalMember(owner = "client!ffa", name = "Q", descriptor = "I")
    public static int field3016 = 0;

    @OriginalMember(owner = "client!ffa", name = "O", descriptor = "Lbu;")
    public static class21 field3014 = null;

    @OriginalMember(owner = "client!ffa", name = "E", descriptor = "I")
    public static int field3004;

    @OriginalMember(owner = "client!ffa", name = "H", descriptor = "I")
    public static int field3007;

    @OriginalMember(owner = "client!ffa", name = "I", descriptor = "I")
    public static int field3008;

    @OriginalMember(owner = "client!ffa", name = "J", descriptor = "I")
    public static int field3009;

    @OriginalMember(owner = "client!ffa", name = "L", descriptor = "I")
    private int field3011;

    @OriginalMember(owner = "client!ffa", name = "M", descriptor = "I")
    public static int field3012;

    @OriginalMember(owner = "client!ffa", name = "N", descriptor = "I")
    public static int field3013;

    @OriginalMember(owner = "client!ffa", name = "P", descriptor = "I")
    public static int field3015;

    @OriginalMember(owner = "client!ffa", name = "R", descriptor = "I")
    private int field3017;

    @OriginalMember(owner = "client!ffa", name = "S", descriptor = "I")
    public static int field3018;

    @OriginalMember(owner = "client!ffa", name = "F", descriptor = "[I")
    private int[] field3005;

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method58(boolean arg0, int arg1) {
        ++field3009;
        int[][] var3 = super.field8265.method1576((byte) -79, arg1);
        if (super.field8265.field3546) {
            int var4 = (~class270.field3923 != ~this.field3011 ? this.field3011 * arg1 / class270.field3923 : arg1) * this.field3017;
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            if (~class293.field4278 != ~this.field3017) {
                for (int var8 = 0; class293.field4278 > var8; ++var8) {
                    int var9 = this.field3017 * var8 / class293.field4278;
                    int var10 = this.field3005[var4 - -var9];
                    var7[var8] = class702.method3977(var10 << 4, 4080);
                    var6[var8] = class702.method3977(var10 >> 4, 4080);
                    var5[var8] = class702.method3977(var10, 16711680) >> 12;
                }
            } else {
                for (int var11 = 0; class293.field4278 > var11; ++var11) {
                    int var12 = this.field3005[var4++];
                    var7[var11] = class702.method3977(var12, 255) << 4;
                    var6[var11] = class702.method3977(65280, var12) >> 4;
                    var5[var11] = class702.method3977(var12 >> 12, 4080);
                }
            }
        }
        if (arg0) {
            field3014 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(IBI)V")
    public final void method1360(int arg0, byte arg1, int arg2) {
        if (arg1 <= -85) {
            ++field3012;
            super.method1360(arg0, (byte) -126, arg2);
            if (~this.field3010 <= -1 && class54.field704 != null) {
                int var4 = !class54.field704.method1208((byte) 47, this.field3010).field6574 ? 128 : 64;
                this.field3005 = class54.field704.method1211((byte) 22, var4, var4, false, this.field3010, 1.0F);
                this.field3011 = var4;
                this.field3017 = var4;
            }
        }
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(Lso;II)V")
    public final void method54(class494 arg0, int arg1, int arg2) {
        ++field3004;
        if (arg1 == 1) {
            if (arg2 == 0) {
                this.field3010 = arg0.method2998(true);
            }
        }
    }

    @OriginalMember(owner = "client!ffa", name = "c", descriptor = "(B)V")
    public final void method935(byte arg0) {
        super.method935(arg0);
        ++field3013;
        this.field3005 = null;
    }

    @OriginalMember(owner = "client!ffa", name = "d", descriptor = "(B)I")
    public final int method1361(byte arg0) {
        if (arg0 != -96) {
            return -68;
        } else {
            ++field3015;
            return this.field3010;
        }
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(BIIIIIIIII)V")
    public static final void method1362(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg0 != -75) {
            method1362((byte) -117, 67, -95, -82, 96, 108, -74, -43, 33, -34);
        }
        if (~arg6 == ~arg8 && ~arg4 == ~arg7 && ~arg2 == ~arg5 && arg3 == arg9) {
            class128.method956(arg1, arg5, arg9, arg8, (byte) 85, arg4);
        } else {
            int var10 = arg8;
            int var11 = arg4;
            int var12 = arg8 * 3;
            int var13 = arg4 * 3;
            int var14 = arg6 * 3;
            int var15 = arg7 * 3;
            int var16 = arg2 * 3;
            int var17 = arg3 * 3;
            int var18 = -var16 + arg5 + var14 - arg8;
            int var19 = -arg4 + var15 + -var17 + arg9;
            int var20 = -var14 + -var14 + var16 + var12;
            int var21 = var17 - var15 + -var15 + var13;
            int var22 = var14 - var12;
            int var23 = -var13 + var15;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var21 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = (var27 + var29 + var31 >> 12) + arg8;
                int var34 = (var28 + var30 + var32 >> 12) + arg4;
                class128.method956(arg1, var33, var34, var10, (byte) 85, var11);
                var10 = var33;
                var11 = var34;
            }
        }
        ++field3018;
    }

    @OriginalMember(owner = "client!ffa", name = "<init>", descriptor = "()V")
    public class197() {
        super(0, false);
    }

    @OriginalMember(owner = "client!ffa", name = "b", descriptor = "(IIB)Z")
    public static final boolean method1363(int arg0, int arg1, byte arg2) {
        if (arg2 != -35) {
            return false;
        } else {
            ++field3007;
            return ~(2048 & arg1) != -1;
        }
    }

    @OriginalMember(owner = "client!ffa", name = "c", descriptor = "(I)V")
    public static void method1364(int arg0) {
        if (arg0 != -25267) {
            field3008 = 42;
        }
        field3014 = null;
    }
}
