import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class210 extends class751 {

    @OriginalMember(owner = "client!oe", name = "B", descriptor = "I")
    public static int field3048;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(II)[I", line = 4)
    public final int[] method365(int arg0, int arg1) {
        ++field3048;
        if (arg1 != 4095) {
            return null;
        } else {
            int[] var3 = super.field10405.method3601(true, arg0);
            if (super.field10405.field8923) {
                class42.method293(var3, 0, class673.field9452, class619.field8728[arg0]);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "()V", line = 26)
    public class210() {
        super(0, true);
    }
}
