import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class74 extends class349 {

    @OriginalMember(owner = "client!ii", name = "C", descriptor = "F")
    public static float field945 = 0.0F;

    @OriginalMember(owner = "client!ii", name = "D", descriptor = "F")
    public static float field946;

    @OriginalMember(owner = "client!ii", name = "E", descriptor = "I")
    public static int field947;

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(BI)[I")
    public final int[] method13(byte arg0, int arg1) {
        ++field947;
        int var3 = 20 % ((arg0 - 56) / 41);
        int[] var4 = super.field5109.method3088(arg1, (byte) 26);
        if (super.field5109.field7515) {
            class657.method3634(var4, 0, class39.field497, class54.field709[arg1]);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ii", name = "<init>", descriptor = "()V")
    public class74() {
        super(0, true);
    }
}
