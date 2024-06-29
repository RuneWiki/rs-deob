import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ls")
public class class93 {

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "Lfa;")
    public static class156 field1272 = new class156(50);

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "Luu;")
    public static class188 field1273 = null;

    @OriginalMember(owner = "client!ls", name = "c", descriptor = "Lgk;")
    public static class331 field1274 = new class331(" from your friend list first.", " zuerst von deiner Freunde-Liste!", " de votre liste d'amis.", " da sua lista de amigos primeiro.");

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(I)V")
    public static void method821(int arg0) {
        field1274 = null;
        field1272 = null;
        field1273 = null;
        if (arg0 >= -39) {
            method821(-120);
        }
    }
}
