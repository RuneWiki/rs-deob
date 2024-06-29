import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class395 {

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "[I")
    public static int[] field5583 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "I")
    public static int field5585 = 0;

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "I")
    public static int field5584;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(B)V")
    public static void method2480(byte arg0) {
        if (arg0 > -118) {
            method2480((byte) -113);
        }
        field5583 = null;
    }
}
