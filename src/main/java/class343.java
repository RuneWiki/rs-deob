import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tp")
public class class343 {

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "[B")
    public static byte[] field4992 = new byte[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!tp", name = "d", descriptor = "Lus;")
    public static class1 field4995;

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "I")
    public static int field4993;

    @OriginalMember(owner = "client!tp", name = "c", descriptor = "I")
    public static int field4994;

    @OriginalMember(owner = "client!tp", name = "e", descriptor = "I")
    public static int field4996;

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(B)V")
    public static void method2156(byte arg0) {
        if (arg0 != 0) {
            field4992 = null;
        }
        field4995 = null;
        field4992 = null;
    }

    static {
        new class326("You are temporarily banned from this clan channel.", "Du wurdest temporär aus diesem Chatraum verbannt.", "Vous êtes temporairement exclu de ce canal de clan.", "Você está temporariamente vetado de entrar nesse canal de clã.");
        field4995 = new class1(2, 2);
    }
}
