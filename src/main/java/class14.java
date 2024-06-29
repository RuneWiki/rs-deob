import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class14 extends class529 {

    @OriginalMember(owner = "client!oe", name = "D", descriptor = "I")
    private int field192 = 204;

    @OriginalMember(owner = "client!oe", name = "J", descriptor = "I")
    private int field198 = 1;

    @OriginalMember(owner = "client!oe", name = "H", descriptor = "I")
    private int field196 = 1;

    @OriginalMember(owner = "client!oe", name = "I", descriptor = "Lus;")
    public static class328 field197 = new class328(5, 4);

    @OriginalMember(owner = "client!oe", name = "L", descriptor = "Lgaa;")
    public static class460 field200 = null;

    @OriginalMember(owner = "client!oe", name = "M", descriptor = "F")
    public static float field201;

    @OriginalMember(owner = "client!oe", name = "E", descriptor = "I")
    public static int field193;

    @OriginalMember(owner = "client!oe", name = "F", descriptor = "I")
    public static int field194;

    @OriginalMember(owner = "client!oe", name = "G", descriptor = "I")
    public static int field195;

    @OriginalMember(owner = "client!oe", name = "K", descriptor = "I")
    public static int field199;

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "()V", line = 4)
    public class14() {
        super(0, true);
    }

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "(I)V", line = 7)
    public static void method187(int arg0) {
        field200 = null;
        if (arg0 == 16384) {
            field197 = null;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIII)V", line = 27)
    public static final void method188(int arg0, int arg1, int arg2, int arg3) {
        ++field194;
        if (class718.field10118 != arg3 || class41.field583 != arg2 || class580.field8062 != arg0) {
            class718.field10118 = arg3;
            class41.field583 = arg2;
            class571.field7967 = true;
            if (arg1 != 28311) {
                method188(-125, -92, -106, -124);
            }
            class580.field8062 = arg0;
            double var4 = -((double) (arg3 * 2) * 3.141592653589793D) / 16384.0D;
            double var6 = -((double) (arg2 * 2) * 3.141592653589793D) / 16384.0D;
            double var8 = Math.cos(var6);
            double var10 = Math.sin(var6);
            double var12 = Math.cos(var4);
            double var14 = Math.sin(var4);
            class649.field8923 = 0.0D;
            class728.field10192 = var12;
            class503.field7083 = var8 * var12;
            class213.field2710 = -var10 * var12;
            class332.field4283 = var8;
            class747.field10442 = -var8 * var14;
            class529.field7466 = var10;
            class38.field566 = var14;
            class206.field2649 = var10 * var14;
        }
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(II)I", line = 87)
    public static int method189(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IBLtn;)V", line = 104)
    public final void method190(int arg0, byte arg1, class179 arg2) {
        ++field193;
        if (arg1 > 45) {
            if (arg0 != 0) {
                if (~arg0 != -2) {
                    if (~arg0 == -3) {
                        this.field192 = arg2.method1107(false);
                    }
                } else {
                    this.field198 = arg2.method1094(255);
                }
            } else {
                this.field196 = arg2.method1094(255);
            }
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IB)[I", line = 148)
    public final int[] method191(int arg0, byte arg1) {
        ++field195;
        int[] var3 = super.field7456.method1635(arg0, -88);
        int var4 = -27 / ((27 - arg1) / 49);
        if (super.field7456.field3449) {
            for (int var5 = 0; var5 < class304.field3909; ++var5) {
                int var6 = class225.field2973[var5];
                int var7 = class310.field3960[arg0];
                int var8 = this.field196 * var6 >> 12;
                int var9 = this.field198 * var7 >> 12;
                int var10 = var6 % (4096 / this.field196) * this.field196;
                int var11 = var7 % (4096 / this.field198) * this.field198;
                if (~this.field192 < ~var11) {
                    for (var8 -= var9; ~var8 > -1; var8 += 4) {
                    }
                    while (var8 > 3) {
                        var8 -= 4;
                    }
                    if (~var8 != -2) {
                        var3[var5] = 0;
                        continue;
                    }
                    if (this.field192 > var10) {
                        var3[var5] = 0;
                        continue;
                    }
                }
                if (var10 < this.field192) {
                    int var12;
                    for (var12 = var8 - var9; var12 < 0; var12 += 4) {
                    }
                    while (~var12 < -4) {
                        var12 -= 4;
                    }
                    if (var12 > 0) {
                        var3[var5] = 0;
                        continue;
                    }
                }
                var3[var5] = 4096;
            }
        }
        return var3;
    }
}
