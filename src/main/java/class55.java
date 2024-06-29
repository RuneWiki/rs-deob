import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class55 extends class328 {

    @OriginalMember(owner = "client!fi", name = "D", descriptor = "I")
    private int field784 = 1365;

    @OriginalMember(owner = "client!fi", name = "G", descriptor = "I")
    private int field787 = 0;

    @OriginalMember(owner = "client!fi", name = "E", descriptor = "I")
    private int field785 = 0;

    @OriginalMember(owner = "client!fi", name = "I", descriptor = "I")
    private int field789 = 20;

    @OriginalMember(owner = "client!fi", name = "K", descriptor = "I")
    public static int field791 = 0;

    @OriginalMember(owner = "client!fi", name = "B", descriptor = "I")
    public static int field782;

    @OriginalMember(owner = "client!fi", name = "C", descriptor = "I")
    public static int field783;

    @OriginalMember(owner = "client!fi", name = "F", descriptor = "I")
    public static int field786;

    @OriginalMember(owner = "client!fi", name = "H", descriptor = "I")
    public static int field788;

    @OriginalMember(owner = "client!fi", name = "J", descriptor = "I")
    public static int field790;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IZI)Z")
    public static final boolean method453(int arg0, boolean arg1, int arg2) {
        ++field782;
        if (!arg1) {
            return false;
        } else {
            return (arg0 & 16) != 0;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(BILco;)V")
    public final void method1(byte arg0, int arg1, class268 arg2) {
        if (arg0 > 75) {
            ++field783;
            if (~arg1 != -1) {
                if (arg1 != 1) {
                    if (~arg1 != -3) {
                        if (~arg1 == -4) {
                            this.field787 = arg2.method1745(32132);
                        }
                    } else {
                        this.field785 = arg2.method1745(32132);
                    }
                } else {
                    this.field789 = arg2.method1745(32132);
                }
            } else {
                this.field784 = arg2.method1745(32132);
            }
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(II)[I")
    public final int[] method4(int arg0, int arg1) {
        ++field788;
        int[] var3 = super.field4720.method2872(1, arg0);
        if (super.field4720.field7109) {
            for (int var4 = 0; ~class449.field6539 < ~var4; ++var4) {
                int var5 = (class206.field2924[var4] << 12) / this.field784 + this.field785;
                int var6 = (class638.field9258[arg0] << 12) / this.field784 - -this.field787;
                int var7 = var5;
                int var8 = var6;
                int var9 = var5;
                int var10 = var6;
                int var11 = var5 * var5 >> 12;
                int var12 = var6 * var6 >> 12;
                int var13;
                for (var13 = 0; ~(var11 + var12) > -16385 && ~this.field789 < ~var13; ++var13) {
                    var10 = (var9 * var10 >> 12) * 2 - -var8;
                    var9 = -var12 + var7 + var11;
                    var12 = var10 * var10 >> 12;
                    var11 = var9 * var9 >> 12;
                }
                var3[var4] = ~(this.field789 + -1) < ~var13 ? (var13 << 12) / this.field789 : 0;
            }
        }
        int var14 = -62 / ((48 - arg1) / 56);
        return var3;
    }

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "()V")
    public class55() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "(B)Z")
    public static final boolean method454(byte arg0) {
        ++field786;
        class108 var1 = class432.field6356.field659.field1800;
        if (var1 != null && class432.field6356.field659 != var1) {
            if (arg0 > -113) {
                return true;
            } else {
                class587 var2 = (class587) var1;
                if (var2.field8359 >= 2000) {
                    var2.field8359 -= 2000;
                }
                return ~var2.field8359 == -1008;
            }
        } else {
            return false;
        }
    }
}
