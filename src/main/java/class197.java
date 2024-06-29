import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class197 extends class335 {

    @OriginalMember(owner = "client!be", name = "B", descriptor = "I")
    private int field2685 = -1;

    @OriginalMember(owner = "client!be", name = "E", descriptor = "Ljw;")
    public static class259 field2688 = new class259(11, 17);

    @OriginalMember(owner = "client!be", name = "C", descriptor = "I")
    private int field2686;

    @OriginalMember(owner = "client!be", name = "D", descriptor = "I")
    public static int field2687;

    @OriginalMember(owner = "client!be", name = "F", descriptor = "I")
    public static int field2689;

    @OriginalMember(owner = "client!be", name = "H", descriptor = "I")
    public static int field2691;

    @OriginalMember(owner = "client!be", name = "I", descriptor = "I")
    public static int field2692;

    @OriginalMember(owner = "client!be", name = "J", descriptor = "I")
    private int field2693;

    @OriginalMember(owner = "client!be", name = "K", descriptor = "I")
    public static int field2694;

    @OriginalMember(owner = "client!be", name = "G", descriptor = "[I")
    private int[] field2690;

    @OriginalMember(owner = "client!be", name = "c", descriptor = "(III)V")
    public final void method1276(int arg0, int arg1, int arg2) {
        ++field2687;
        super.method1276(arg0, arg1, arg2);
        if (~this.field2685 <= -1 && class209.field2794 != null) {
            int var4 = !class209.field2794.method2959(95, this.field2685).field1260 ? 128 : 64;
            this.field2690 = class209.field2794.method2964(this.field2685, (byte) 67, var4, false, 1.0F, var4);
            this.field2686 = var4;
            this.field2693 = var4;
        }
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "()V")
    public class197() {
        super(0, false);
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(B)V")
    public final void method1277(byte arg0) {
        ++field2691;
        super.method1277((byte) 95);
        if (arg0 < 78) {
            field2688 = null;
        }
        this.field2690 = null;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(ILio;I)V")
    public final void method2(int arg0, class157 arg1, int arg2) {
        ++field2692;
        if (arg2 != -66) {
            method1279(-111);
        }
        if (~arg0 == -1) {
            this.field2685 = arg1.method963(-120);
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(I)I")
    public final int method1278(int arg0) {
        int var2 = -13 / ((-7 - arg0) / 47);
        ++field2689;
        return this.field2685;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method1(int arg0, boolean arg1) {
        if (arg1) {
            this.field2686 = 36;
        }
        ++field2694;
        int[][] var3 = super.field4527.method669(arg0, (byte) 2);
        if (super.field4527.field1468) {
            int var4 = this.field2686 * (~class316.field4237 == ~this.field2693 ? arg0 : this.field2693 * arg0 / class316.field4237);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            if (class649.field8968 == this.field2686) {
                for (int var8 = 0; class649.field8968 > var8; ++var8) {
                    int var9 = this.field2690[var4++];
                    var7[var8] = class15.method97(var9, 255) << 4;
                    var6[var8] = class15.method97(var9, 65280) >> 4;
                    var5[var8] = class15.method97(var9, 16711680) >> 12;
                }
            } else {
                for (int var10 = 0; class649.field8968 > var10; ++var10) {
                    int var11 = this.field2686 * var10 / class649.field8968;
                    int var12 = this.field2690[var4 + var11];
                    var7[var10] = class15.method97(var12 << 4, 4080);
                    var6[var10] = class15.method97(var12, 65280) >> 4;
                    var5[var10] = class15.method97(var12, 16711680) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!be", name = "d", descriptor = "(I)V")
    public static void method1279(int arg0) {
        field2688 = null;
        if (arg0 != 985094500) {
            field2688 = null;
        }
    }
}
