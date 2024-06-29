import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iia")
public class class319 extends class214 {

    @OriginalMember(owner = "client!iia", name = "F", descriptor = "I")
    public static int field4747 = 999999;

    @OriginalMember(owner = "client!iia", name = "D", descriptor = "I")
    public static int field4745;

    @OriginalMember(owner = "client!iia", name = "E", descriptor = "I")
    public static int field4746;

    @OriginalMember(owner = "client!iia", name = "G", descriptor = "I")
    public static int field4748;

    @OriginalMember(owner = "client!iia", name = "b", descriptor = "(III)V")
    public static final void method2082(int arg0, int arg1, int arg2) {
        ++field4746;
        if (arg2 != -26220) {
            method2082(42, 8, -64);
        }
        class118 var3 = class86.method755(true, 17, arg1);
        var3.method933((byte) 56);
        var3.field1811 = arg0;
    }

    @OriginalMember(owner = "client!iia", name = "a", descriptor = "(IB)[I")
    public final int[] method64(int arg0, byte arg1) {
        if (arg1 != 5) {
            return null;
        } else {
            ++field4748;
            int[] var3 = super.field3544.method3869(arg0, -115);
            if (super.field3544.field9836) {
                class571.method3309(var3, 0, class626.field8787, class131.field2138[arg0]);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!iia", name = "<init>", descriptor = "()V")
    public class319() {
        super(0, true);
    }
}
