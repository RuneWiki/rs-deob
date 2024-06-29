import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tr")
public class class306 extends class328 {

    @OriginalMember(owner = "client!tr", name = "B", descriptor = "I")
    private int field4402 = 4096;

    @OriginalMember(owner = "client!tr", name = "F", descriptor = "I")
    private int field4406 = 409;

    @OriginalMember(owner = "client!tr", name = "I", descriptor = "I")
    private int field4409 = 4096;

    @OriginalMember(owner = "client!tr", name = "K", descriptor = "[I")
    private int[] field4411 = new int[3];

    @OriginalMember(owner = "client!tr", name = "D", descriptor = "I")
    private int field4404 = 4096;

    @OriginalMember(owner = "client!tr", name = "J", descriptor = "I")
    public static int field4410 = -1;

    @OriginalMember(owner = "client!tr", name = "G", descriptor = "Lio;")
    public static class151 field4407 = new class151(10, 2, 2, 0);

    @OriginalMember(owner = "client!tr", name = "L", descriptor = "I")
    public static int field4412 = -1;

    @OriginalMember(owner = "client!tr", name = "E", descriptor = "I")
    public static int field4405;

    @OriginalMember(owner = "client!tr", name = "H", descriptor = "I")
    public static int field4408;

    @OriginalMember(owner = "client!tr", name = "C", descriptor = "[I")
    public static int[] field4403;

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(BILco;)V")
    public final void method1(byte arg0, int arg1, class268 arg2) {
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (~arg1 == -5) {
                            int var5 = arg2.method1700((byte) 44);
                            this.field4411[0] = class424.method2540(var5 << 4, 267386880);
                            this.field4411[1] = class424.method2540(var5 >> 4, 4080);
                            this.field4411[2] = class424.method2540(0, var5 >> 12);
                        }
                    } else {
                        this.field4409 = arg2.method1745(32132);
                    }
                } else {
                    this.field4402 = arg2.method1745(32132);
                }
            } else {
                this.field4404 = arg2.method1745(32132);
            }
        } else {
            this.field4406 = arg2.method1745(32132);
        }
        if (arg0 <= 75) {
            method1902(15);
        }
        ++field4408;
    }

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "(II)[[I")
    public final int[][] method7(int arg0, int arg1) {
        ++field4405;
        int[][] var3 = super.field4725.method1886((byte) 100, arg0);
        if (super.field4725.field4371) {
            int[][] var4 = this.method2040(0, arg0, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class449.field6539; ++var11) {
                int var12 = var5[var11];
                int var13 = var12 - this.field4411[0];
                if (~var13 > -1) {
                    var13 = -var13;
                }
                if (~this.field4406 > ~var13) {
                    var8[var11] = var12;
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                } else {
                    int var14 = var6[var11];
                    int var15 = -this.field4411[1] + var14;
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (~var15 < ~this.field4406) {
                        var8[var11] = var12;
                        var9[var11] = var14;
                        var10[var11] = var7[var11];
                    } else {
                        int var16 = var7[var11];
                        int var17 = var16 - this.field4411[2];
                        if (~var17 > -1) {
                            var17 = -var17;
                        }
                        if (var17 > this.field4406) {
                            var8[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var16;
                        } else {
                            var8[var11] = this.field4409 * var12 >> 12;
                            var9[var11] = this.field4402 * var14 >> 12;
                            var10[var11] = this.field4404 * var16 >> 12;
                        }
                    }
                }
            }
        }
        int var18 = 7 % ((arg1 - 46) / 54);
        return var3;
    }

    @OriginalMember(owner = "client!tr", name = "f", descriptor = "(I)V")
    public static void method1902(int arg0) {
        field4407 = null;
        field4403 = null;
        int var1 = -82 / ((arg0 - -21) / 59);
    }

    @OriginalMember(owner = "client!tr", name = "<init>", descriptor = "()V")
    public class306() {
        super(1, false);
    }
}
