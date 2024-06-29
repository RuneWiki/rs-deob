import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class128 extends class227 {

    @OriginalMember(owner = "client!kk", name = "G", descriptor = "I")
    private int field1655 = 4;

    @OriginalMember(owner = "client!kk", name = "J", descriptor = "I")
    private int field1658 = 4;

    @OriginalMember(owner = "client!kk", name = "H", descriptor = "I")
    public static int field1656;

    @OriginalMember(owner = "client!kk", name = "I", descriptor = "I")
    public static int field1657;

    @OriginalMember(owner = "client!kk", name = "K", descriptor = "I")
    public static int field1659;

    @OriginalMember(owner = "client!kk", name = "M", descriptor = "I")
    public static int field1661;

    @OriginalMember(owner = "client!kk", name = "L", descriptor = "[I")
    public static int[] field1660;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IZ)[[I", line = 5)
    public final int[][] method112(int arg0, boolean arg1) {
        if (!arg1) {
            method774(false);
        }
        ++field1657;
        int[][] var3 = super.field3059.method28((byte) 109, arg0);
        if (super.field3059.field57) {
            int var4 = class446.field6486 / this.field1655;
            int var5 = class305.field4055 / this.field1658;
            int[][] var7;
            if (~var5 < -1) {
                int var6 = arg0 % var5;
                var7 = this.method1460(class305.field4055 * var6 / var5, 0, 0);
            } else {
                var7 = this.method1460(0, 0, 0);
            }
            int[] var8 = var7[0];
            int[] var9 = var7[1];
            int[] var10 = var7[2];
            int[] var11 = var3[0];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            for (int var14 = 0; ~class446.field6486 < ~var14; ++var14) {
                int var15;
                if (var4 <= 0) {
                    var15 = 0;
                } else {
                    int var16 = var14 % var4;
                    var15 = class446.field6486 * var16 / var4;
                }
                var11[var14] = var8[var15];
                var12[var14] = var9[var15];
                var13[var14] = var10[var15];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(II)[I", line = 73)
    public final int[] method62(int arg0, int arg1) {
        ++field1661;
        if (arg0 != 15811) {
            return null;
        } else {
            int[] var3 = super.field3068.method1970(arg1, (byte) 124);
            if (super.field3068.field4480) {
                int var4 = class446.field6486 / this.field1655;
                int var5 = class305.field4055 / this.field1658;
                int[] var6;
                if (var5 <= 0) {
                    var6 = this.method1459(0, -59, 0);
                } else {
                    int var7 = arg1 % var5;
                    var6 = this.method1459(class305.field4055 * var7 / var5, 112, 0);
                }
                for (int var8 = 0; class446.field6486 > var8; ++var8) {
                    if (var4 > 0) {
                        int var9 = var8 % var4;
                        var3[var8] = var6[class446.field6486 * var9 / var4];
                    } else {
                        var3[var8] = var6[0];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "()V", line = 182)
    public class128() {
        super(1, false);
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Lug;II)V", line = 131)
    public final void method61(class396 arg0, int arg1, int arg2) {
        if (arg1 != 487215116) {
            this.field1658 = -31;
        }
        ++field1659;
        if (arg2 != 0) {
            if (arg2 == 1) {
                this.field1658 = arg0.method2388((byte) -120);
            }
        } else {
            this.field1655 = arg0.method2388((byte) -117);
        }
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(Z)V", line = 168)
    public static void method774(boolean arg0) {
        if (!arg0) {
            field1660 = null;
        }
    }
}
