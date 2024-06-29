import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class183 extends class64 {

    @OriginalMember(owner = "client!uc", name = "nb", descriptor = "I")
    private int field3572 = 1024;

    @OriginalMember(owner = "client!uc", name = "ob", descriptor = "I")
    private int field3573 = 2048;

    @OriginalMember(owner = "client!uc", name = "mb", descriptor = "I")
    private int field3571 = 3072;

    @OriginalMember(owner = "client!uc", name = "gb", descriptor = "Lsg;")
    public static class169 field3565 = class165.method1060("jolt", 1536);

    @OriginalMember(owner = "client!uc", name = "fb", descriptor = "Lsg;")
    private static class169 field3564 = class165.method1060("Prepared sound engine", 1536);

    @OriginalMember(owner = "client!uc", name = "eb", descriptor = "Lsg;")
    public static class169 field3563 = field3564;

    @OriginalMember(owner = "client!uc", name = "lb", descriptor = "Lsg;")
    private static class169 field3570 = class165.method1060("FULL", 1536);

    @OriginalMember(owner = "client!uc", name = "cb", descriptor = "Lsg;")
    public static class169 field3561 = field3570;

    @OriginalMember(owner = "client!uc", name = "bb", descriptor = "I")
    public static int field3560;

    @OriginalMember(owner = "client!uc", name = "hb", descriptor = "I")
    public static int field3566;

    @OriginalMember(owner = "client!uc", name = "ib", descriptor = "I")
    public static int field3567;

    @OriginalMember(owner = "client!uc", name = "jb", descriptor = "I")
    public static int field3568;

    @OriginalMember(owner = "client!uc", name = "kb", descriptor = "I")
    public static int field3569;

    @OriginalMember(owner = "client!uc", name = "db", descriptor = "Lqd;")
    public static class148 field3562;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)V")
    public static void method1214(byte arg0) {
        field3562 = null;
        if (arg0 < 27) {
            method1214((byte) 82);
        }
        field3561 = null;
        field3565 = null;
        field3563 = null;
        field3570 = null;
        field3564 = null;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IB)[I")
    public final int[] method16(int arg0, byte arg1) {
        int[] var3 = super.field1192.method19((byte) 122, arg0);
        if (super.field1192.field75) {
            int[] var4 = this.method394(20331, 0, arg0);
            for (int var5 = 0; ~var5 > ~class147.field2715; ++var5) {
                var3[var5] = this.field3572 - -(var4[var5] * this.field3573 >> 12);
            }
        }
        if (arg1 != 19) {
            method1214((byte) -83);
        }
        ++field3569;
        return var3;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(BLoa;I)V")
    public final void method14(byte arg0, class127 arg1, int arg2) {
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    super.field1183 = ~arg1.method819((byte) 22) == -2;
                }
            } else {
                this.field3571 = arg1.method785(true);
            }
        } else {
            this.field3572 = arg1.method785(true);
        }
        ++field3568;
        int var5 = 89 % ((-60 - arg0) / 36);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIII)I")
    public static final int method1215(int arg0, int arg1, int arg2, int arg3) {
        ++field3566;
        int var4 = arg0 >> 7;
        int var5 = arg2 >> 7;
        if (var4 >= arg3 && ~var5 <= -1 && ~var4 >= -104 && var5 <= 103) {
            int var6 = arg1;
            if (~arg1 > -4 && (class159.field3040[1][var4][var5] & 2) == 2) {
                var6 = arg1 + 1;
            }
            int var7 = 127 & arg2;
            int var8 = 127 & arg0;
            int var9 = (-var8 + 128) * class139.field2588[var6][var4][var5 + 1] + class139.field2588[var6][var4 + 1][var5 + 1] * var8 >> 7;
            int var10 = (128 - var8) * class139.field2588[var6][var4][var5] - -(class139.field2588[var6][var4 + 1][var5] * var8) >> 7;
            return (-var7 + 128) * var10 + var7 * var9 >> 7;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(Z)V")
    public final void method17(boolean arg0) {
        if (!arg0) {
            this.field3573 = -this.field3572 + this.field3571;
            ++field3560;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(BI)[[I")
    public final int[][] method59(byte arg0, int arg1) {
        ++field3567;
        int[][] var3 = super.field1195.method177(1193, arg1);
        if (super.field1195.field532) {
            int[][] var4 = this.method402(false, arg1, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var3[0];
            int[] var8 = var4[1];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class147.field2715 < ~var11; ++var11) {
                var7[var11] = (var5[var11] * this.field3573 >> 12) + this.field3572;
                var9[var11] = (var8[var11] * this.field3573 >> 12) + this.field3572;
                var10[var11] = (var6[var11] * this.field3573 >> 12) + this.field3572;
            }
        }
        if (arg0 != -40) {
            this.field3571 = 29;
        }
        return var3;
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "()V")
    public class183() {
        super(1, false);
    }
}
