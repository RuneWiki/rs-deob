import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!it")
public class class473 extends class328 {

    @OriginalMember(owner = "client!it", name = "H", descriptor = "I")
    private int field6782 = 0;

    @OriginalMember(owner = "client!it", name = "K", descriptor = "I")
    private int field6785 = 4096;

    @OriginalMember(owner = "client!it", name = "E", descriptor = "I")
    public static int field6780 = -1;

    @OriginalMember(owner = "client!it", name = "J", descriptor = "[I")
    public static int[] field6784 = new int[4096];

    @OriginalMember(owner = "client!it", name = "I", descriptor = "I")
    public static int field6783 = 0;

    @OriginalMember(owner = "client!it", name = "D", descriptor = "Lbv;")
    public static class567 field6779 = new class567("cyan:", "blaugrün:", "cyan:", "cyan:");

    @OriginalMember(owner = "client!it", name = "L", descriptor = "[F")
    public static float[] field6786 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!it", name = "B", descriptor = "I")
    public static int field6777;

    @OriginalMember(owner = "client!it", name = "C", descriptor = "I")
    public static int field6778;

    @OriginalMember(owner = "client!it", name = "G", descriptor = "I")
    public static int field6781;

    @OriginalMember(owner = "client!it", name = "c", descriptor = "(B)V", line = 11)
    public static void method2744(byte arg0) {
        field6779 = null;
        field6786 = null;
        field6784 = null;
        if (arg0 <= 48) {
            method2744((byte) -88);
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(BILco;)V", line = 23)
    public final void method1(byte arg0, int arg1, class268 arg2) {
        ++field6777;
        if (arg0 <= 75) {
            field6779 = null;
        }
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 == -3) {
                    super.field4728 = ~arg2.method1738(255) == -2;
                }
            } else {
                this.field6785 = arg2.method1745(32132);
            }
        } else {
            this.field6782 = arg2.method1745(32132);
        }
    }

    @OriginalMember(owner = "client!it", name = "b", descriptor = "(II)[[I", line = 66)
    public final int[][] method7(int arg0, int arg1) {
        ++field6781;
        int[][] var3 = super.field4725.method1886((byte) -70, arg0);
        int var4 = 117 / ((46 - arg1) / 54);
        if (super.field4725.field4371) {
            int[][] var5 = this.method2040(0, arg0, 0);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var3[0];
            int[] var10 = var3[1];
            int[] var11 = var3[2];
            for (int var12 = 0; ~var12 > ~class449.field6539; ++var12) {
                int var13 = var6[var12];
                int var14 = var7[var12];
                int var15 = var8[var12];
                if (~this.field6782 >= ~var13) {
                    if (this.field6785 >= var13) {
                        var9[var12] = var13;
                    } else {
                        var9[var12] = this.field6785;
                    }
                } else {
                    var9[var12] = this.field6782;
                }
                if (var14 < this.field6782) {
                    var10[var12] = this.field6782;
                } else if (this.field6785 < var14) {
                    var10[var12] = this.field6785;
                } else {
                    var10[var12] = var14;
                }
                if (~var15 <= ~this.field6782) {
                    if (this.field6785 >= var15) {
                        var11[var12] = var15;
                    } else {
                        var11[var12] = this.field6785;
                    }
                } else {
                    var11[var12] = this.field6782;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!it", name = "<init>", descriptor = "()V", line = 196)
    public class473() {
        super(1, false);
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(II)[I", line = 152)
    public final int[] method4(int arg0, int arg1) {
        ++field6778;
        int[] var3 = super.field4720.method2872(1, arg0);
        int var4 = -90 % ((48 - arg1) / 56);
        if (super.field4720.field7109) {
            int[] var5 = this.method2042(0, arg0, (byte) 119);
            for (int var6 = 0; class449.field6539 > var6; ++var6) {
                int var7 = var5[var6];
                if (~this.field6782 >= ~var7) {
                    if (~this.field6785 <= ~var7) {
                        var3[var6] = var7;
                    } else {
                        var3[var6] = this.field6785;
                    }
                } else {
                    var3[var6] = this.field6782;
                }
            }
        }
        return var3;
    }
}
