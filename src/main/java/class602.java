import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sw")
public class class602 extends class739 {

    @OriginalMember(owner = "client!sw", name = "z", descriptor = "I")
    private int field8537 = 4096;

    @OriginalMember(owner = "client!sw", name = "A", descriptor = "I")
    public static int field8538;

    @OriginalMember(owner = "client!sw", name = "B", descriptor = "I")
    public static int field8539;

    @OriginalMember(owner = "client!sw", name = "C", descriptor = "I")
    public static int field8540;

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(ZI)[I")
    public final int[] method445(boolean arg0, int arg1) {
        ++field8540;
        if (arg0) {
            this.field8537 = 37;
        }
        int[] var3 = super.field10317.method1042(0, arg1);
        if (super.field10317.field2170) {
            int[] var4 = this.method4127(class311.field4223 & arg1 + -1, 51, 0);
            int[] var5 = this.method4127(arg1, 47, 0);
            int[] var6 = this.method4127(arg1 - -1 & class311.field4223, 126, 0);
            for (int var7 = 0; var7 < class399.field5703; ++var7) {
                int var8 = (var6[var7] + -var4[var7]) * this.field8537;
                int var9 = (var5[class423.field6029 & var7 - -1] + -var5[var7 + -1 & class423.field6029]) * this.field8537;
                int var10 = var9 >> 12;
                int var11 = var8 >> 12;
                int var12 = var10 * var10 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = (int) (4096.0D * Math.sqrt((double) ((float) (var13 + 4096 + var12) / 4096.0F)));
                int var15 = ~var14 == -1 ? 0 : 16777216 / var14;
                var3[var7] = -var15 + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(Lsl;IB)V")
    public final void method112(class479 arg0, int arg1, byte arg2) {
        if (~arg1 == -1) {
            this.field8537 = arg0.method2882(-1);
        }
        if (arg2 != 1) {
            this.method445(false, 67);
        }
        ++field8538;
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(IB)V")
    public static final void method3508(int arg0, byte arg1) {
        class348 var2 = class11.field100;
        synchronized (class11.field100) {
            class11.field100.method2207(arg0, 1);
            if (arg1 != 84) {
                method3508(-22, (byte) -2);
            }
        }
        ++field8539;
    }

    @OriginalMember(owner = "client!sw", name = "<init>", descriptor = "()V")
    public class602() {
        super(1, true);
    }
}
