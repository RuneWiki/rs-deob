import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tq")
public class class442 extends class148 {

    @OriginalMember(owner = "client!tq", name = "J", descriptor = "I")
    private int field6593 = 585;

    @OriginalMember(owner = "client!tq", name = "L", descriptor = "Lso;")
    public static class327 field6595 = new class327(10, 6);

    @OriginalMember(owner = "client!tq", name = "O", descriptor = "Llt;")
    public static class475 field6598 = new class475("Face here", "Hierhin drehen", "Regarder dans cette direction", "Virar para cá");

    @OriginalMember(owner = "client!tq", name = "K", descriptor = "I")
    public static int field6594;

    @OriginalMember(owner = "client!tq", name = "M", descriptor = "I")
    public static int field6596;

    @OriginalMember(owner = "client!tq", name = "N", descriptor = "I")
    public static int field6597;

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(BLwp;)I")
    public static final int method2663(byte arg0, class118 arg1) {
        int var2 = -54 / ((arg0 - 54) / 36);
        ++field6596;
        String var3 = class195.method1313((byte) 106, arg1);
        int[] var4 = null;
        if (!class208.method1398(arg1.field1781, true)) {
            if (~arg1.field1779 != 0) {
                var4 = class294.field4196.method453(0, arg1.field1779).field4805;
            } else if (!class169.method1170(arg1.field1781, -121)) {
                if (class253.method1701(arg1.field1781, (byte) -122)) {
                    Object var5 = null;
                    class519 var6;
                    if (arg1.field1781 == 1006) {
                        var6 = class252.field3743.method2686((int) arg1.field1775, (byte) 112);
                    } else {
                        var6 = class252.field3743.method2686((int) (arg1.field1775 >>> 32 & 2147483647L), (byte) 86);
                    }
                    if (var6.field7596 != null) {
                        var6 = var6.method3067(class49.field796, -13012);
                    }
                    if (var6 != null) {
                        var4 = var6.field7650;
                    }
                }
            } else {
                class167 var7 = class193.field2821[(int) arg1.field1775];
                if (var7 != null) {
                    class342 var8 = var7.field2472;
                    if (var8.field4938 != null) {
                        var8 = var8.method2094(56, class49.field796);
                    }
                    if (var8 != null) {
                        var4 = var8.field4872;
                    }
                }
            }
        } else {
            var4 = class294.field4196.method453(0, (int) arg1.field1775).field4805;
        }
        if (var4 != null) {
            var3 = var3 + class474.method2833(-1, var4);
        }
        int var9 = class163.field2401.method1807(var3, 160, class337.field4733);
        if (arg1.field1777) {
            var9 += class475.field6994.method108() - -4;
        }
        return var9;
    }

    @OriginalMember(owner = "client!tq", name = "e", descriptor = "(I)V")
    public static void method2664(int arg0) {
        if (arg0 == 12) {
            field6595 = null;
            field6598 = null;
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(ILdh;I)V")
    public final void method23(int arg0, class209 arg1, int arg2) {
        int var4 = -120 % ((-88 - arg2) / 33);
        if (arg0 == 0) {
            this.field6593 = arg1.method1450((byte) 113);
        }
        ++field6594;
    }

    @OriginalMember(owner = "client!tq", name = "<init>", descriptor = "()V")
    public class442() {
        super(0, true);
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(II)[I")
    public final int[] method25(int arg0, int arg1) {
        ++field6597;
        if (arg0 > -65) {
            this.field6593 = -10;
        }
        int[] var3 = super.field2193.method497(arg1, false);
        if (super.field2193.field1312) {
            int var4 = class456.field6752[arg1];
            for (int var5 = 0; class320.field4579 > var5; ++var5) {
                int var6 = class517.field7539[var5];
                if (~var6 < ~this.field6593 && ~(4096 - this.field6593) < ~var6 && ~(2048 - this.field6593) > ~var4 && var4 < this.field6593 + 2048) {
                    int var7 = -var6 + 2048;
                    int var8 = var7 < 0 ? -var7 : var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (-this.field6593 + 2048);
                    var3[var5] = -var10 + 4096;
                } else if (-this.field6593 + 2048 < var6 && 2048 - -this.field6593 > var6) {
                    int var11 = var4 - 2048;
                    int var12 = ~var11 > -1 ? -var11 : var11;
                    int var13 = var12 - this.field6593;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (-this.field6593 + 2048);
                } else if (~var4 <= ~this.field6593 && ~var4 >= ~(-this.field6593 + 4096)) {
                    if (var6 >= this.field6593 && ~var6 >= ~(-this.field6593 + 4096)) {
                        var3[var5] = 0;
                    } else {
                        int var15 = 2048 - var4;
                        int var16 = var15 >= 0 ? var15 : -var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (-this.field6593 + 2048);
                        var3[var5] = -var18 + 4096;
                    }
                } else {
                    int var19 = var6 + -2048;
                    int var20 = var19 < 0 ? -var19 : var19;
                    int var21 = var20 - this.field6593;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (2048 - this.field6593);
                }
            }
        }
        return var3;
    }
}
