import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class460 {

    @OriginalMember(owner = "client!af", name = "a", descriptor = "Leea;")
    public class144 field6472 = new class144();

    @OriginalMember(owner = "client!af", name = "c", descriptor = "[I")
    public static int[] field6474 = new int[1];

    @OriginalMember(owner = "client!af", name = "b", descriptor = "I")
    public static int field6473;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(B)V")
    public static void method2780(byte arg0) {
        if (arg0 <= 21) {
            method2780((byte) -64);
        }
        field6474 = null;
    }
}
