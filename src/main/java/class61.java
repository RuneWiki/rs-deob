import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class61 extends class62 {

    @OriginalMember(owner = "client!sh", name = "D", descriptor = "I")
    private int field760 = 0;

    @OriginalMember(owner = "client!sh", name = "E", descriptor = "I")
    private int field761 = 2000;

    @OriginalMember(owner = "client!sh", name = "G", descriptor = "I")
    private int field763 = 4096;

    @OriginalMember(owner = "client!sh", name = "J", descriptor = "I")
    private int field766 = 16;

    @OriginalMember(owner = "client!sh", name = "N", descriptor = "I")
    private int field770 = 0;

    @OriginalMember(owner = "client!sh", name = "I", descriptor = "Lbn;")
    public static class378 field765 = new class378(3, 7);

    @OriginalMember(owner = "client!sh", name = "K", descriptor = "F")
    public static float field767;

    @OriginalMember(owner = "client!sh", name = "C", descriptor = "I")
    public static int field759;

    @OriginalMember(owner = "client!sh", name = "F", descriptor = "I")
    public static int field762;

    @OriginalMember(owner = "client!sh", name = "H", descriptor = "I")
    public static int field764;

    @OriginalMember(owner = "client!sh", name = "L", descriptor = "I")
    public static int field768;

    @OriginalMember(owner = "client!sh", name = "M", descriptor = "[Lcu;")
    public static class187[] field769;

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "()V", line = 5)
    public class61() {
        super(0, true);
    }

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "(II)[I", line = 11)
    public final int[] method13(int arg0, int arg1) {
        ++field764;
        int[] var3 = super.field774.method3086(arg0, -2);
        if (arg1 != 656024161) {
            this.field766 = 23;
        }
        if (super.field774.field7499) {
            int var4 = this.field763 >> 1;
            int[][] var5 = super.field774.method3089(false);
            Random var6 = new Random((long) this.field770);
            for (int var7 = 0; var7 < this.field761; ++var7) {
                int var8 = ~this.field763 >= -1 ? this.field760 : -var4 + this.field760 + class240.method1534(false, this.field763, var6);
                int var9 = (var8 & 4092) >> 4;
                int var10 = class240.method1534(false, class438.field5847, var6);
                int var11 = class240.method1534(false, class14.field148, var6);
                int var12 = (class321.field4429[var9] * this.field766 >> 12) + var10;
                int var13 = (class48.field568[var9] * this.field766 >> 12) + var11;
                int var14 = -var11 + var13;
                int var15 = -var10 + var12;
                if (var15 != 0 || var14 != 0) {
                    if (var14 < 0) {
                        var14 = -var14;
                    }
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    boolean var16 = var15 < var14;
                    if (var16) {
                        int var17 = var10;
                        var10 = var11;
                        int var18 = var12;
                        var11 = var17;
                        var12 = var13;
                        var13 = var18;
                    }
                    if (~var12 > ~var10) {
                        int var19 = var10;
                        int var20 = var11;
                        var10 = var12;
                        var12 = var19;
                        var11 = var13;
                        var13 = var20;
                    }
                    int var21 = var11;
                    int var22 = -var10 + var12;
                    int var23 = -var11 + var13;
                    int var24 = -var22 / 2;
                    int var25 = 2048 / var22;
                    int var26 = 1024 - (class240.method1534(false, 4096, var6) >> 2);
                    if (~var23 > -1) {
                        var23 = -var23;
                    }
                    int var27 = ~var13 >= ~var11 ? -1 : 1;
                    for (int var28 = var10; var28 < var12; ++var28) {
                        int var29 = (var28 - var10) * var25 + 1024 + var26;
                        int var30 = var28 & class410.field5604;
                        int var31 = class285.field3989 & var21;
                        if (!var16) {
                            var5[var30][var31] = var29;
                        } else {
                            var5[var31][var30] = var29;
                        }
                        var24 += var23;
                        if (~var24 < -1) {
                            var21 += var27;
                            var24 += -var22;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(III)I", line = 147)
    public static final int method397(int arg0, int arg1, int arg2) {
        ++field762;
        int var3 = class645.method3726(arg1 + -1, arg0 + -1, 10262) + class645.method3726(arg1 - 1, arg0 - arg2, 10262) - (-class645.method3726(arg1 + 1, arg0 + -1, arg2 ^ -10263) + -class645.method3726(arg1 + 1, arg0 + 1, 10262));
        int var4 = class645.method3726(arg1, arg0 + -1, 10262) - (-class645.method3726(arg1, arg0 + 1, arg2 ^ -10263) + -class645.method3726(arg1 - 1, arg0, 10262) - class645.method3726(arg1 + 1, arg0, 10262));
        int var5 = class645.method3726(arg1, arg0, 10262);
        return var5 / 4 + var3 / 16 + var4 / 8;
    }

    @OriginalMember(owner = "client!sh", name = "g", descriptor = "(I)V", line = 166)
    public final void method395(int arg0) {
        ++field759;
        if (arg0 < -37) {
            class380.method2269(21815);
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lgw;II)V", line = 191)
    public final void method11(class148 arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (~arg2 != -3) {
                    if (~arg2 != -4) {
                        if (~arg2 == -5) {
                            this.field763 = arg0.method1045(true);
                        }
                    } else {
                        this.field760 = arg0.method1045(true);
                    }
                } else {
                    this.field766 = arg0.method1032((byte) -33);
                }
            } else {
                this.field761 = arg0.method1045(true);
            }
        } else {
            this.field770 = arg0.method1032((byte) -33);
        }
        ++field768;
        if (arg1 != -1) {
            this.field761 = 50;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Z)V", line = 250)
    public static void method398(boolean arg0) {
        if (arg0) {
            field769 = null;
            field765 = null;
        }
    }
}
