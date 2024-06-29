import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class480 {

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "Lcea;")
    public static class180 field6739 = new class180("Loaded HW3D", "HW3D geladen", "HW3D chargé", "HW3D carregado");

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "Lcea;")
    public static class180 field6742 = new class180("Loaded JAGDX", "JAGDX geladen", "JAGDX chargé", "JAGDX carregado");

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "Lsc;")
    public static class290 field6743;

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "I")
    public static int field6740;

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "I")
    public static int field6741;

    static {
        new class180("You have been kicked from the channel.", "Du wurdest aus dem Chatraum rausgeworfen.", "Vous avez été expulsé du canal.", "Você foi expulso do canal.");
        field6743 = new class290();
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)V", line = 3)
    public static void method2798(int arg0) {
        field6739 = null;
        if (arg0 != -23428) {
            field6742 = null;
        }
        field6742 = null;
        field6743 = null;
    }

    @OriginalMember(owner = "client!ug", name = "toString", descriptor = "()Ljava/lang/String;", line = 27)
    public final String toString() {
        field6741++;
        throw new IllegalStateException();
    }
}
