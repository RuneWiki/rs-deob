import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class214 extends class739 {

    @OriginalMember(owner = "client!ac", name = "z", descriptor = "I")
    private int field3210 = 0;

    @OriginalMember(owner = "client!ac", name = "H", descriptor = "I")
    private int field3216 = 4096;

    @OriginalMember(owner = "client!ac", name = "E", descriptor = "F")
    public static float field3214;

    @OriginalMember(owner = "client!ac", name = "B", descriptor = "I")
    public static int field3212;

    @OriginalMember(owner = "client!ac", name = "C", descriptor = "I")
    public static int field3213;

    @OriginalMember(owner = "client!ac", name = "I", descriptor = "I")
    public static int field3217;

    @OriginalMember(owner = "client!ac", name = "G", descriptor = "Lvs;")
    public static class518 field3215;

    @OriginalMember(owner = "client!ac", name = "A", descriptor = "Ljava/awt/Frame;")
    public static Frame field3211;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZI)[I")
    public final int[] method445(boolean arg0, int arg1) {
        if (arg0) {
            this.method112((class479) null, -50, (byte) -34);
        }
        ++field3217;
        int[] var3 = super.field10317.method1042(0, arg1);
        if (super.field10317.field2170) {
            int[] var4 = this.method4127(arg1, 106, 0);
            for (int var5 = 0; class399.field5703 > var5; ++var5) {
                int var6 = var4[var5];
                var3[var5] = ~var6 <= ~this.field3210 && this.field3216 >= var6 ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "()V")
    public class214() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lsl;IB)V")
    public final void method112(class479 arg0, int arg1, byte arg2) {
        if (arg2 == 1) {
            if (~arg1 != -1) {
                if (arg1 == 1) {
                    this.field3216 = arg0.method2882(-1);
                }
            } else {
                this.field3210 = arg0.method2882(-1);
            }
            ++field3212;
        }
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(B)V")
    public static void method1516(byte arg0) {
        int var1 = -89 % ((arg0 - 41) / 42);
        field3211 = null;
        field3215 = null;
    }
}
