import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class35 {

    @OriginalMember(owner = "client!na", name = "a", descriptor = "[Lmv;")
    public static class255[] field533 = new class255[0];

    @OriginalMember(owner = "client!na", name = "c", descriptor = "Ls;")
    public static class186 field535 = new class186(82, 10);

    @OriginalMember(owner = "client!na", name = "e", descriptor = "I")
    public static int field537 = 0;

    @OriginalMember(owner = "client!na", name = "i", descriptor = "I")
    public static int field541;

    @OriginalMember(owner = "client!na", name = "d", descriptor = "I")
    public static int field536;

    @OriginalMember(owner = "client!na", name = "f", descriptor = "[B")
    public byte[] field538;

    @OriginalMember(owner = "client!na", name = "b", descriptor = "[S")
    public short[] field534;

    @OriginalMember(owner = "client!na", name = "g", descriptor = "[S")
    public short[] field539;

    @OriginalMember(owner = "client!na", name = "h", descriptor = "[S")
    public short[] field540;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(I)V")
    public static final void method242(int arg0) {
        if (arg0 != 30590) {
            return;
        }
        class317.method2008(0);
        field536++;
        class360.field5288 = null;
        class435.field6470 = null;
        client.field3213 = null;
        class308.field4676 = null;
        class296.field4491 = null;
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(I)V")
    public static void method243(int arg0) {
        field533 = null;
        field535 = null;
        if (arg0 >= -37) {
            method243(16);
        }
    }

    static {
        new class309("Unable to delete friend - system busy.", "Der Freund konnte nicht entfernt werden, das System ist derzeit ausgelastet.", "Impossible de supprimer un ami - système occupé.", "Não foi possível excluir o amigo. O sistema está ocupado.");
        field541 = 2;
    }
}
