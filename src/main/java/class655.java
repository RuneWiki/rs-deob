import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public class class655 extends class325 {

    @OriginalMember(owner = "client!go", name = "F", descriptor = "I")
    private int field9071 = 4;

    @OriginalMember(owner = "client!go", name = "I", descriptor = "I")
    private int field9074 = 4;

    @OriginalMember(owner = "client!go", name = "H", descriptor = "I")
    public static int field9073 = -1;

    @OriginalMember(owner = "client!go", name = "D", descriptor = "Lmga;")
    public static class739 field9070 = new class739(26, 7);

    @OriginalMember(owner = "client!go", name = "C", descriptor = "I")
    public static int field9069;

    @OriginalMember(owner = "client!go", name = "G", descriptor = "I")
    public static int field9072;

    @OriginalMember(owner = "client!go", name = "J", descriptor = "I")
    public static int field9075;

    @OriginalMember(owner = "client!go", name = "K", descriptor = "I")
    public static int field9076;

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(BI)[I")
    public final int[] method100(byte arg0, int arg1) {
        ++field9069;
        int[] var3 = super.field4727.method2603(arg1, -13476);
        if (arg0 <= 21) {
            this.method100((byte) 14, 93);
        }
        if (super.field4727.field6067) {
            int var4 = class261.field3874 / this.field9074;
            int var5 = class657.field9077 / this.field9071;
            int[] var7;
            if (var5 > 0) {
                int var6 = arg1 % var5;
                var7 = this.method2062(class657.field9077 * var6 / var5, 0, (byte) 33);
            } else {
                var7 = this.method2062(0, 0, (byte) 33);
            }
            for (int var8 = 0; ~class261.field3874 < ~var8; ++var8) {
                if (~var4 >= -1) {
                    var3[var8] = var7[0];
                } else {
                    int var9 = var8 % var4;
                    var3[var8] = var7[class261.field3874 * var9 / var4];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(IB)[[I")
    public final int[][] method360(int arg0, byte arg1) {
        ++field9075;
        int[][] var3 = super.field4733.method1251((byte) 113, arg0);
        if (arg1 != -9) {
            return null;
        } else {
            if (super.field4733.field2369) {
                int var4 = class261.field3874 / this.field9074;
                int var5 = class657.field9077 / this.field9071;
                int[][] var6;
                if (~var5 >= -1) {
                    var6 = this.method2063(0, arg1 + 10, 0);
                } else {
                    int var7 = arg0 % var5;
                    var6 = this.method2063(0, 1, class657.field9077 * var7 / var5);
                }
                int[] var8 = var6[0];
                int[] var9 = var6[1];
                int[] var10 = var6[2];
                int[] var11 = var3[0];
                int[] var12 = var3[1];
                int[] var13 = var3[2];
                for (int var14 = 0; class261.field3874 > var14; ++var14) {
                    int var16;
                    if (~var4 < -1) {
                        int var15 = var14 % var4;
                        var16 = class261.field3874 * var15 / var4;
                    } else {
                        var16 = 0;
                    }
                    var11[var14] = var8[var16];
                    var12[var14] = var9[var16];
                    var13[var14] = var10[var16];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(Ljp;IB)V")
    public final void method95(class376 arg0, int arg1, byte arg2) {
        ++field9072;
        if (arg1 != 0) {
            if (~arg1 == -2) {
                this.field9071 = arg0.method2398(-1372747256);
            }
        } else {
            this.field9074 = arg0.method2398(-1372747256);
        }
        if (arg2 >= -41) {
            field9073 = -81;
        }
    }

    @OriginalMember(owner = "client!go", name = "b", descriptor = "(I)V")
    public static void method3642(int arg0) {
        field9070 = null;
        if (arg0 != 0) {
            method3642(124);
        }
    }

    @OriginalMember(owner = "client!go", name = "<init>", descriptor = "()V")
    public class655() {
        super(1, false);
    }
}
