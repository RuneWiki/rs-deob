import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class476 extends class175 {

    @OriginalMember(owner = "client!la", name = "F", descriptor = "I")
    private int field6692 = 585;

    @OriginalMember(owner = "client!la", name = "E", descriptor = "I")
    public static int field6691;

    @OriginalMember(owner = "client!la", name = "G", descriptor = "I")
    public static int field6693;

    @OriginalMember(owner = "client!la", name = "H", descriptor = "I")
    public static int field6694;

    @OriginalMember(owner = "client!la", name = "I", descriptor = "I")
    public static int field6695;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ZI)[I")
    public final int[] method47(boolean arg0, int arg1) {
        ++field6695;
        int[] var3 = super.field2310.method91(0, arg1);
        if (super.field2310.field169) {
            int var4 = class456.field6536[arg1];
            for (int var5 = 0; ~var5 > ~class598.field8136; ++var5) {
                int var6 = class693.field9221[var5];
                if (this.field6692 < var6 && 4096 - this.field6692 > var6 && -this.field6692 + 2048 < var4 && this.field6692 + 2048 > var4) {
                    int var7 = 2048 - var6;
                    int var8 = var7 >= 0 ? var7 : -var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (-this.field6692 + 2048);
                    var3[var5] = -var10 + 4096;
                } else if (-this.field6692 + 2048 < var6 && this.field6692 + 2048 > var6) {
                    int var11 = var4 - 2048;
                    int var12 = var11 < 0 ? -var11 : var11;
                    int var13 = var12 - this.field6692;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (-this.field6692 + 2048);
                } else if (this.field6692 <= var4 && ~(-this.field6692 + 4096) <= ~var4) {
                    if (var6 >= this.field6692 && var6 <= -this.field6692 + 4096) {
                        var3[var5] = 0;
                    } else {
                        int var15 = 2048 - var4;
                        int var16 = ~var15 <= -1 ? var15 : -var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (-this.field6692 + 2048);
                        var3[var5] = -var18 + 4096;
                    }
                } else {
                    int var19 = var6 - 2048;
                    int var20 = var19 < 0 ? -var19 : var19;
                    int var21 = var20 - this.field6692;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (2048 - this.field6692);
                }
            }
        }
        return !arg0 ? null : var3;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method2823(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field6694;
        int var8 = arg6 + -334;
        if (var8 >= 0) {
            if (var8 > 100) {
                var8 = 100;
            }
        } else {
            var8 = 0;
        }
        int var9 = class578.field7886 - -((class423.field6086 - class578.field7886) * var8 / arg0);
        class72.field972 = class72.field981 * var9 >> 8;
        int var10 = arg1 * var9 >> 8;
        int var11 = 16383 & -arg2 + 16384;
        int var12 = 16383 & -arg3 + 16384;
        int var13 = 0;
        int var14 = 0;
        int var15 = var10;
        if (var11 != 0) {
            var14 = class110.field1524[var11] * -var10 >> 14;
            var15 = class110.field1523[var11] * var10 >> 14;
        }
        if (var12 != 0) {
            var13 = class110.field1524[var12] * var15 >> 14;
            var15 = class110.field1523[var12] * var15 >> 14;
        }
        class41.field442 = arg3;
        field6693 = 0;
        class74.field1000 = arg2;
        class223.field2892 = -var15 + arg4;
        class269.field3926 = arg7 - var14;
        class435.field6273 = -var13 + arg5;
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "()V")
    public class476() {
        super(0, true);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ILdt;Z)V")
    public final void method44(int arg0, class254 arg1, boolean arg2) {
        if (!arg2) {
            if (arg0 == 0) {
                this.field6692 = arg1.method1728((byte) 69);
            }
            ++field6691;
        }
    }
}
