import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class204 extends class362 {

    @OriginalMember(owner = "client!kk", name = "B", descriptor = "I")
    private int field3073 = 4;

    @OriginalMember(owner = "client!kk", name = "H", descriptor = "I")
    private int field3079 = 4;

    @OriginalMember(owner = "client!kk", name = "C", descriptor = "Lvl;")
    public static class15 field3074 = new class15(54, 4);

    @OriginalMember(owner = "client!kk", name = "E", descriptor = "[I")
    public static int[] field3076 = new int[14];

    @OriginalMember(owner = "client!kk", name = "D", descriptor = "Lrha;")
    public static class235 field3075 = new class235("LOCAL", "", "local", 4);

    @OriginalMember(owner = "client!kk", name = "I", descriptor = "Lju;")
    public static class137 field3080 = new class137(5, 5);

    @OriginalMember(owner = "client!kk", name = "K", descriptor = "I")
    public static int field3082 = -2;

    @OriginalMember(owner = "client!kk", name = "J", descriptor = "Lfja;")
    public static class783 field3081 = new class783(90, 0);

    @OriginalMember(owner = "client!kk", name = "y", descriptor = "I")
    public static int field3070;

    @OriginalMember(owner = "client!kk", name = "z", descriptor = "I")
    public static int field3071;

    @OriginalMember(owner = "client!kk", name = "A", descriptor = "I")
    public static int field3072;

    @OriginalMember(owner = "client!kk", name = "F", descriptor = "I")
    public static int field3077;

    @OriginalMember(owner = "client!kk", name = "G", descriptor = "I")
    public static int field3078;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Lfca;II)V")
    public final void method154(class93 arg0, int arg1, int arg2) {
        ++field3078;
        if (arg2 == -1) {
            if (~arg1 != -1) {
                if (arg1 == 1) {
                    this.field3079 = arg0.method793((byte) 45);
                }
            } else {
                this.field3073 = arg0.method793((byte) 100);
            }
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IB)[[I")
    public final int[][] method153(int arg0, byte arg1) {
        ++field3072;
        if (arg1 < 57) {
            return null;
        } else {
            int[][] var3 = super.field4938.method3199(arg0, (byte) 103);
            if (super.field4938.field7848) {
                int var4 = class769.field10597 / this.field3073;
                int var5 = class555.field7845 / this.field3079;
                int[][] var7;
                if (var5 > 0) {
                    int var6 = arg0 % var5;
                    var7 = this.method2222(0, class555.field7845 * var6 / var5, 28008);
                } else {
                    var7 = this.method2222(0, 0, 28008);
                }
                int[] var8 = var7[0];
                int[] var9 = var7[1];
                int[] var10 = var7[2];
                int[] var11 = var3[0];
                int[] var12 = var3[1];
                int[] var13 = var3[2];
                for (int var14 = 0; var14 < class769.field10597; ++var14) {
                    int var16;
                    if (var4 > 0) {
                        int var15 = var14 % var4;
                        var16 = class769.field10597 * var15 / var4;
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

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(II)[I")
    public final int[] method156(int arg0, int arg1) {
        if (arg0 != -2026769311) {
            return null;
        } else {
            ++field3071;
            int[] var3 = super.field4927.method808(-123, arg1);
            if (super.field4927.field1471) {
                int var4 = class769.field10597 / this.field3073;
                int var5 = class555.field7845 / this.field3079;
                int[] var6;
                if (var5 <= 0) {
                    var6 = this.method2221(0, 0, 31);
                } else {
                    int var7 = arg1 % var5;
                    var6 = this.method2221(0, class555.field7845 * var7 / var5, -93);
                }
                for (int var8 = 0; ~class769.field10597 < ~var8; ++var8) {
                    if (var4 <= 0) {
                        var3[var8] = var6[0];
                    } else {
                        int var9 = var8 % var4;
                        var3[var8] = var6[class769.field10597 * var9 / var4];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(II)I")
    public static int method1456(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "(B)V")
    public static void method1457(byte arg0) {
        field3075 = null;
        field3081 = null;
        if (arg0 != 78) {
            field3082 = 8;
        }
        field3074 = null;
        field3080 = null;
        field3076 = null;
    }

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "(I)V")
    public static final void method1458(int arg0) {
        ++field3070;
        if (class89.field1277 != null) {
            class89.field1277.method2709((byte) -114);
        }
        if (class100.field1622 != null) {
            class100.field1622.method2709((byte) -114);
        }
        if (arg0 != -17818) {
            field3076 = null;
        }
    }

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "()V")
    public class204() {
        super(1, false);
    }
}
