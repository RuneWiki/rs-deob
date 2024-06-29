import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fu")
public class class330 {

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "[I")
    public static int[] field4548 = new int[] { 3, 7, 15 };

    @OriginalMember(owner = "client!fu", name = "d", descriptor = "[S")
    public static short[] field4551 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!fu", name = "f", descriptor = "Llu;")
    public static class610 field4553;

    @OriginalMember(owner = "client!fu", name = "b", descriptor = "I")
    public static int field4549;

    @OriginalMember(owner = "client!fu", name = "c", descriptor = "I")
    public static int field4550;

    @OriginalMember(owner = "client!fu", name = "e", descriptor = "I")
    public static int field4552;

    @OriginalMember(owner = "client!fu", name = "g", descriptor = "I")
    public static int field4554;

    @OriginalMember(owner = "client!fu", name = "h", descriptor = "Z")
    public static boolean field4555;

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(I)V")
    public static void method1998(int arg0) {
        field4548 = null;
        if (arg0 < 102) {
            field4553 = null;
        }
        field4553 = null;
        field4551 = null;
    }

    static {
        new class572("Unable to add name - system busy.", "Der Name konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un nom - système occupé.", "Não foi possível adicionar o nome. O sistema está ocupado.");
        field4553 = new class610(16, 3);
    }
}
