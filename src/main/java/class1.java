import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class1 extends class160 {

    @OriginalMember(owner = "client!wf", name = "S", descriptor = "I")
    public static int field1;

    @OriginalMember(owner = "client!wf", name = "T", descriptor = "I")
    public static int field2;

    @OriginalMember(owner = "client!wf", name = "U", descriptor = "I")
    public static int field3;

    @OriginalMember(owner = "client!wf", name = "V", descriptor = "I")
    public static int field4;

    @OriginalMember(owner = "client!wf", name = "W", descriptor = "I")
    public static int field5;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IB)[I")
    public final int[] method1(int arg0, byte arg1) {
        ++field2;
        int[] var3 = super.field2488.method15((byte) 126, arg0);
        if (arg1 != 57) {
            return null;
        } else {
            if (super.field2488.field42) {
                int[] var4 = this.method1085(0, arg0, (byte) 45);
                for (int var5 = 0; class240.field3896 > var5; ++var5) {
                    var3[var5] = 4096 - var4[var5];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lai;II)V")
    public final void method2(class88 arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            super.field2494 = ~arg0.method633(65) == -2;
        }
        ++field5;
        if (arg1 <= 11) {
            this.method2((class88) null, -73, -86);
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method3(int arg0, boolean arg1) {
        ++field4;
        int[][] var3 = super.field2476.method839(false, arg0);
        if (super.field2476.field1950) {
            int[][] var4 = this.method1079(arg0, 119, 0);
            int[] var5 = var4[0];
            int[] var6 = var3[0];
            int[] var7 = var4[1];
            int[] var8 = var3[2];
            int[] var9 = var3[1];
            int[] var10 = var4[2];
            for (int var11 = 0; var11 < class240.field3896; ++var11) {
                var6[var11] = -var5[var11] + 4096;
                var9[var11] = -var7[var11] + 4096;
                var8[var11] = -var10[var11] + 4096;
            }
        }
        return !arg1 ? null : var3;
    }

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "()V")
    public class1() {
        super(1, false);
    }
}
