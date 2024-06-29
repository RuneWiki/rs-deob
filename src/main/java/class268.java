import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fda")
public class class268 extends class62 {

    @OriginalMember(owner = "client!fda", name = "F", descriptor = "I")
    private int field3811 = 1024;

    @OriginalMember(owner = "client!fda", name = "I", descriptor = "I")
    private int field3814 = 3072;

    @OriginalMember(owner = "client!fda", name = "G", descriptor = "I")
    private int field3812 = 2048;

    @OriginalMember(owner = "client!fda", name = "D", descriptor = "I")
    public static int field3810;

    @OriginalMember(owner = "client!fda", name = "H", descriptor = "I")
    public static int field3813;

    @OriginalMember(owner = "client!fda", name = "K", descriptor = "I")
    public static int field3816;

    @OriginalMember(owner = "client!fda", name = "L", descriptor = "I")
    public static int field3817;

    @OriginalMember(owner = "client!fda", name = "M", descriptor = "I")
    public static int field3818;

    @OriginalMember(owner = "client!fda", name = "J", descriptor = "Loa;")
    public static class597 field3815;

    @OriginalMember(owner = "client!fda", name = "h", descriptor = "(I)V")
    public static void method1696(int arg0) {
        field3815 = null;
        if (arg0 != 3072) {
            method1696(120);
        }
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(IB)[[I")
    public final int[][] method409(int arg0, byte arg1) {
        if (arg1 >= -20) {
            this.field3811 = -72;
        }
        ++field3810;
        int[][] var3 = super.field772.method2906(8, arg0);
        if (super.field772.field6899) {
            int[][] var4 = this.method407(0, (byte) 41, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class438.field5847; ++var11) {
                var8[var11] = (var5[var11] * this.field3812 >> 12) + this.field3811;
                var9[var11] = this.field3811 - -(var6[var11] * this.field3812 >> 12);
                var10[var11] = this.field3811 - -(var7[var11] * this.field3812 >> 12);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fda", name = "g", descriptor = "(I)V")
    public final void method395(int arg0) {
        if (arg0 > -37) {
            this.method13(-64, 58);
        }
        ++field3813;
        this.field3812 = -this.field3811 + this.field3814;
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(ZLjava/awt/Component;)Ldj;")
    public static final class289 method1697(boolean arg0, Component arg1) {
        ++field3817;
        if (!arg0) {
            method1696(-127);
        }
        return new class509(arg1);
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(Lgw;II)V")
    public final void method11(class148 arg0, int arg1, int arg2) {
        ++field3816;
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (~arg2 == -3) {
                    super.field788 = arg0.method1032((byte) -33) == 1;
                }
            } else {
                this.field3814 = arg0.method1045(true);
            }
        } else {
            this.field3811 = arg0.method1045(true);
        }
        if (arg1 != -1) {
            this.field3814 = -101;
        }
    }

    @OriginalMember(owner = "client!fda", name = "<init>", descriptor = "()V")
    public class268() {
        super(1, false);
    }

    @OriginalMember(owner = "client!fda", name = "c", descriptor = "(II)[I")
    public final int[] method13(int arg0, int arg1) {
        if (arg1 != 656024161) {
            this.field3814 = -5;
        }
        ++field3818;
        int[] var3 = super.field774.method3086(arg0, arg1 + -656024163);
        if (super.field774.field7499) {
            int[] var4 = this.method408(arg0, 0, (byte) -69);
            for (int var5 = 0; ~class438.field5847 < ~var5; ++var5) {
                var3[var5] = this.field3811 - -(var4[var5] * this.field3812 >> 12);
            }
        }
        return var3;
    }
}
