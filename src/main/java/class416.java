import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sp")
public class class416 extends class55 {

    @OriginalMember(owner = "client!sp", name = "R", descriptor = "[I")
    public static int[] field5658 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!sp", name = "S", descriptor = "I")
    public static int field5659 = 0;

    @OriginalMember(owner = "client!sp", name = "Q", descriptor = "Lmc;")
    public static class78 field5657 = new class78(56, -1);

    @OriginalMember(owner = "client!sp", name = "P", descriptor = "I")
    public static int field5656;

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(B)V")
    public static void method2480(byte arg0) {
        field5658 = null;
        field5657 = null;
        if (arg0 > -11) {
            method2480((byte) -118);
        }
    }
}
