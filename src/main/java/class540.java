import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class540 extends class56 {

    @OriginalMember(owner = "client!ac", name = "G", descriptor = "I")
    private int field7564 = 0;

    @OriginalMember(owner = "client!ac", name = "K", descriptor = "I")
    private int field7568 = 0;

    @OriginalMember(owner = "client!ac", name = "N", descriptor = "I")
    private int field7571 = 1;

    @OriginalMember(owner = "client!ac", name = "H", descriptor = "I")
    public static int field7565 = 0;

    @OriginalMember(owner = "client!ac", name = "M", descriptor = "I")
    public static int field7570 = 52;

    @OriginalMember(owner = "client!ac", name = "E", descriptor = "Las;")
    public static class151 field7562 = new class151(7, 0, 1, 1);

    @OriginalMember(owner = "client!ac", name = "D", descriptor = "I")
    public static int field7561;

    @OriginalMember(owner = "client!ac", name = "F", descriptor = "I")
    public static int field7563;

    @OriginalMember(owner = "client!ac", name = "I", descriptor = "I")
    public static int field7566;

    @OriginalMember(owner = "client!ac", name = "J", descriptor = "I")
    public static int field7567;

    @OriginalMember(owner = "client!ac", name = "L", descriptor = "[Ljava/lang/String;")
    public static String[] field7569;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IZ)[I")
    public final int[] method24(int arg0, boolean arg1) {
        if (!arg1) {
            return null;
        } else {
            ++field7567;
            int[] var3 = super.field673.method3270(arg0, (byte) -42);
            if (super.field673.field8073) {
                int var4 = class720.field10000[arg0];
                int var5 = var4 + -2048 >> 1;
                for (int var6 = 0; ~class328.field4576 < ~var6; ++var6) {
                    int var7 = class132.field1945[var6];
                    int var8 = var7 + -2048 >> 1;
                    int var11;
                    if (this.field7564 != 0) {
                        int var9 = var5 * var5 + var8 * var8 >> 12;
                        int var10 = (int) (Math.sqrt((double) ((float) var9 / 4096.0F)) * 4096.0D);
                        var11 = (int) ((double) (this.field7571 * var10) * 3.141592653589793D);
                    } else {
                        var11 = (-var4 + var7) * this.field7571;
                    }
                    int var12 = var11 - (-4096 & var11);
                    if (~this.field7568 == -1) {
                        var12 = class231.field3111[(var12 & 4081) >> 4] + 4096 >> 1;
                    } else if (~this.field7568 == -3) {
                        var12 -= 2048;
                        if (~var12 > -1) {
                            var12 = -var12;
                        }
                        var12 = -var12 + 2048 << 1;
                    }
                    var3[var6] = var12;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "(I)V")
    public static void method3126(int arg0) {
        if (arg0 == -4096) {
            field7562 = null;
            field7569 = null;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIZ)I")
    public static final int method3127(int arg0, int arg1, boolean arg2) {
        ++field7566;
        if (!arg2) {
            return -47;
        } else {
            return arg0 != 1 && ~arg0 != -4 ? class267.field3815[arg1 & 3] : class150.field2135[arg1 & 3];
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ILee;I)V")
    public final void method6(int arg0, class675 arg1, int arg2) {
        ++field7563;
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (arg2 == 3) {
                    this.field7571 = arg1.method3750((byte) 35);
                }
            } else {
                this.field7568 = arg1.method3750((byte) 35);
            }
        } else {
            this.field7564 = arg1.method3750((byte) 35);
        }
        if (arg0 != 3731) {
            field7569 = null;
        }
    }

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "()V")
    public class540() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(I)V")
    public final void method364(int arg0) {
        ++field7561;
        class135.method965(false);
        if (arg0 != 7) {
            this.method24(-76, true);
        }
    }
}
