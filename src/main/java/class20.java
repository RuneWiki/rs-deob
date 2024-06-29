import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class20 extends class573 {

    @OriginalMember(owner = "client!ub", name = "J", descriptor = "I")
    private int field839 = 4096;

    @OriginalMember(owner = "client!ub", name = "K", descriptor = "I")
    private int field840 = 409;

    @OriginalMember(owner = "client!ub", name = "M", descriptor = "[I")
    private int[] field842 = new int[3];

    @OriginalMember(owner = "client!ub", name = "I", descriptor = "I")
    private int field838 = 4096;

    @OriginalMember(owner = "client!ub", name = "O", descriptor = "I")
    private int field844 = 4096;

    @OriginalMember(owner = "client!ub", name = "N", descriptor = "Low;")
    public static class319 field843 = new class319();

    @OriginalMember(owner = "client!ub", name = "L", descriptor = "I")
    public static int field841;

    @OriginalMember(owner = "client!ub", name = "P", descriptor = "I")
    public static int field845;

    @OriginalMember(owner = "client!ub", name = "R", descriptor = "I")
    public static int field847;

    @OriginalMember(owner = "client!ub", name = "Q", descriptor = "Lfu;")
    public static class360 field846;

    @OriginalMember(owner = "client!ub", name = "h", descriptor = "(I)V")
    public static void method440(int arg0) {
        if (arg0 >= 113) {
            field846 = null;
            field843 = null;
        }
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "()V")
    public class20() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ZLho;Lho;ZIIZ)I")
    public static final int method441(boolean arg0, class135 arg1, class135 arg2, boolean arg3, int arg4, int arg5, boolean arg6) {
        if (!arg0) {
            method441(true, (class135) null, (class135) null, true, 111, -107, false);
        }
        ++field841;
        int var7 = class413.method2521(arg4, arg1, arg2, (byte) -16, arg3);
        if (var7 != 0) {
            return arg3 ? -var7 : var7;
        } else if (arg5 == -1) {
            return 0;
        } else {
            int var8 = class413.method2521(arg5, arg1, arg2, (byte) -16, arg6);
            return arg6 ? -var8 : var8;
        }
    }

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "(II)[[I")
    public final int[][] method442(int arg0, int arg1) {
        ++field847;
        int[][] var3 = super.field8320.method1504(arg1, -2);
        if (super.field8320.field3295) {
            int[][] var4 = this.method3293(0, -40, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class540.field7555 < ~var11; ++var11) {
                int var12 = var5[var11];
                int var13 = -this.field842[0] + var12;
                if (~var13 > -1) {
                    var13 = -var13;
                }
                if (this.field840 < var13) {
                    var8[var11] = var12;
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                } else {
                    int var14 = var6[var11];
                    int var15 = -this.field842[1] + var14;
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    if (~var15 < ~this.field840) {
                        var8[var11] = var12;
                        var9[var11] = var14;
                        var10[var11] = var7[var11];
                    } else {
                        int var16 = var7[var11];
                        int var17 = var16 - this.field842[2];
                        if (~var17 > -1) {
                            var17 = -var17;
                        }
                        if (var17 > this.field840) {
                            var8[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var16;
                        } else {
                            var8[var11] = this.field838 * var12 >> 12;
                            var9[var11] = this.field844 * var14 >> 12;
                            var10[var11] = this.field839 * var16 >> 12;
                        }
                    }
                }
            }
        }
        if (arg0 >= -116) {
            this.field844 = 93;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lqh;II)V")
    public final void method443(class61 arg0, int arg1, int arg2) {
        ++field845;
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (~arg1 != -4) {
                        if (arg1 == 4) {
                            int var5 = arg0.method740((byte) 111);
                            this.field842[2] = class481.method2919(0, var5 >> 12);
                            this.field842[0] = class481.method2919(267386880, var5 << 4);
                            this.field842[1] = class481.method2919(var5 >> 4, 4080);
                        }
                    } else {
                        this.field838 = arg0.method723((byte) -25);
                    }
                } else {
                    this.field844 = arg0.method723((byte) -25);
                }
            } else {
                this.field839 = arg0.method723((byte) -25);
            }
        } else {
            this.field840 = arg0.method723((byte) -25);
        }
        if (arg2 != 3) {
            this.method443((class61) null, 70, 124);
        }
    }
}
