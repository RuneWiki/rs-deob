import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class381 extends class424 {

    @OriginalMember(owner = "client!cm", name = "L", descriptor = "I")
    public static int field5249 = -1;

    @OriginalMember(owner = "client!cm", name = "M", descriptor = "I")
    public static int field5250;

    @OriginalMember(owner = "client!cm", name = "N", descriptor = "I")
    public static int field5251;

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "(IB)[I", line = 5)
    public final int[] method43(int arg0, byte arg1) {
        if (arg1 != -10) {
            field5249 = 80;
        }
        ++field5251;
        int[] var3 = super.field5892.method783(arg0, (byte) 92);
        if (super.field5892.field1427) {
            class79.method642(var3, 0, class303.field4135, class409.field5711[arg0]);
        }
        return var3;
    }

    @OriginalMember(owner = "client!cm", name = "<init>", descriptor = "()V", line = 28)
    public class381() {
        super(0, true);
    }
}
