import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aq")
public class class113 extends class7 {

    @OriginalMember(owner = "client!aq", name = "R", descriptor = "Lak;")
    public static class234 field1573 = new class234("Loaded sprites", "Sprites geladen.", "Sprites chargés", "Sprites carregados");

    @OriginalMember(owner = "client!aq", name = "T", descriptor = "[[B")
    public static byte[][] field1575 = new byte[1000][];

    @OriginalMember(owner = "client!aq", name = "O", descriptor = "I")
    public static int field1571;

    @OriginalMember(owner = "client!aq", name = "Q", descriptor = "I")
    public static int field1572;

    @OriginalMember(owner = "client!aq", name = "S", descriptor = "I")
    public static int field1574;

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(B)V")
    public static void method853(byte arg0) {
        field1573 = null;
        if (arg0 == -15) {
            field1575 = null;
        }
    }
}
