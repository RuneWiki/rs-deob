import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sq")
public class class180 extends class601 {

    @OriginalMember(owner = "client!sq", name = "E", descriptor = "I")
    private int field2719 = 2048;

    @OriginalMember(owner = "client!sq", name = "C", descriptor = "I")
    private int field2717 = 1024;

    @OriginalMember(owner = "client!sq", name = "J", descriptor = "I")
    private int field2724 = 3072;

    @OriginalMember(owner = "client!sq", name = "G", descriptor = "Lhda;")
    public static class752 field2721 = new class752(85, 1);

    @OriginalMember(owner = "client!sq", name = "K", descriptor = "[[I")
    public static int[][] field2725 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!sq", name = "M", descriptor = "[I")
    public static int[] field2727 = new int[256];

    @OriginalMember(owner = "client!sq", name = "O", descriptor = "Lcga;")
    public static class485 field2729;

    @OriginalMember(owner = "client!sq", name = "D", descriptor = "I")
    public static int field2718;

    @OriginalMember(owner = "client!sq", name = "F", descriptor = "I")
    public static int field2720;

    @OriginalMember(owner = "client!sq", name = "H", descriptor = "I")
    public static int field2722;

    @OriginalMember(owner = "client!sq", name = "I", descriptor = "I")
    public static int field2723;

    @OriginalMember(owner = "client!sq", name = "L", descriptor = "I")
    public static int field2726;

    @OriginalMember(owner = "client!sq", name = "N", descriptor = "Lrc;")
    public static class539 field2728;

    static {
        for (int var0 = 0; ~var0 > -257; ++var0) {
            int var1 = var0;
            for (int var2 = 0; ~var2 > -9; ++var2) {
                if ((var1 & 1) == 1) {
                    var1 = -306674912 ^ var1 >>> 1;
                } else {
                    var1 >>>= 1;
                }
            }
            field2727[var0] = var1;
        }
        field2729 = new class485();
    }

    @OriginalMember(owner = "client!sq", name = "<init>", descriptor = "()V", line = 3)
    public class180() {
        super(1, false);
    }

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "(IZ)[[I", line = 13)
    public final int[][] method7(int arg0, boolean arg1) {
        ++field2722;
        if (!arg1) {
            this.field2724 = -43;
        }
        int[][] var3 = super.field7890.method3963(1, arg0);
        if (super.field7890.field9769) {
            int[][] var4 = this.method3268(arg0, 0, 65535);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class171.field2624 < ~var11; ++var11) {
                var8[var11] = this.field2717 - -(var5[var11] * this.field2719 >> 12);
                var9[var11] = this.field2717 - -(var6[var11] * this.field2719 >> 12);
                var10[var11] = (var7[var11] * this.field2719 >> 12) + this.field2717;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIIIIIIIII)V", line = 59)
    public static final void method1245(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field2723;
        if (~arg5 <= -513 && arg6 >= 512 && arg5 <= class719.field10004 * 512 + -1024 && class107.field1453 * 512 + -1024 >= arg6) {
            if (arg8 != 0) {
                method1245(14, -53, -69, 92, -65, -79, -97, -88, -79, -26);
            }
            int var10 = -arg0 + class153.method1118(arg6, arg5, arg8 + -79, arg3);
            if (!class24.field412) {
                class512.field6795.method1730(arg9, 0, 0);
                class341.field4807.method481(class512.field6795);
            } else {
                class365.method2160(true, 4734);
            }
            if (!class540.field7159) {
                class341.field4807.method471(arg5, var10, arg6, class259.field3621);
            } else {
                class341.field4807.method398(arg5, var10, arg6, class100.field1358, class259.field3621);
            }
            if (class24.field412) {
                class423.method2450(false);
            } else {
                class512.field6795.method1730(-arg9, 0, 0);
                class341.field4807.method481(class512.field6795);
            }
        } else {
            class259.field3621[0] = class259.field3621[1] = -1;
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(I)V", line = 101)
    public final void method108(int arg0) {
        if (arg0 != 8351) {
            method1246(false);
        }
        ++field2726;
        this.field2719 = -this.field2717 + this.field2724;
    }

    @OriginalMember(owner = "client!sq", name = "d", descriptor = "(Z)V", line = 112)
    public static void method1246(boolean arg0) {
        field2725 = null;
        if (arg0) {
            field2728 = null;
            field2727 = null;
            field2729 = null;
            field2721 = null;
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lee;BI)V", line = 129)
    public final void method6(class677 arg0, byte arg1, int arg2) {
        if (arg1 != -61) {
            this.method5((byte) 68, -107);
        }
        ++field2720;
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (arg2 == 2) {
                    super.field7897 = ~arg0.method3821((byte) 90) == -2;
                }
            } else {
                this.field2724 = arg0.method3807(-1);
            }
        } else {
            this.field2717 = arg0.method3807(arg1 + 60);
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(BI)[I", line = 222)
    public final int[] method5(byte arg0, int arg1) {
        if (arg0 != -40) {
            method1245(51, -86, 49, -88, 19, -74, -29, 43, 117, -23);
        }
        ++field2718;
        int[] var3 = super.field7902.method382(arg1, true);
        if (super.field7902.field704) {
            int[] var4 = this.method3266((byte) 64, arg1, 0);
            for (int var5 = 0; ~var5 > ~class171.field2624; ++var5) {
                var3[var5] = (var4[var5] * this.field2719 >> 12) + this.field2717;
            }
        }
        return var3;
    }
}
