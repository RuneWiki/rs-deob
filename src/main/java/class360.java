import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class360 extends class571 {

    @OriginalMember(owner = "client!ng", name = "m", descriptor = "[I")
    public static int[] field5054 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

    @OriginalMember(owner = "client!ng", name = "j", descriptor = "I")
    public int field5051;

    @OriginalMember(owner = "client!ng", name = "k", descriptor = "I")
    public int field5052;

    @OriginalMember(owner = "client!ng", name = "n", descriptor = "I")
    public int field5055;

    @OriginalMember(owner = "client!ng", name = "o", descriptor = "I")
    public int field5056;

    @OriginalMember(owner = "client!ng", name = "l", descriptor = "Lvn;")
    public class330 field5053;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(B)V")
    public static void method2273(byte arg0) {
        if (arg0 != 80) {
            method2273((byte) 89);
        }
        field5054 = null;
    }
}
