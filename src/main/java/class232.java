import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class232 {

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "Lak;")
    public static class234 field3747 = new class234("Started 3D Library", "3D-Softwarebibliothek gestartet.", "Librairie 3D démarrée", "Biblioteca 3D iniciada");

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "Lhn;")
    public static class509 field3748 = new class509(84, 2);

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "I")
    public static int field3753 = 0;

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "[Lhf;")
    public static class273[] field3751 = new class273[16];

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "I")
    public static int field3750 = 0;

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "Lsk;")
    public static class442 field3749 = null;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "I")
    public static int field3746;

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "I")
    public static int field3752;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V")
    public static void method1628(int arg0) {
        field3749 = null;
        if (arg0 == 887) {
            field3751 = null;
            field3747 = null;
            field3748 = null;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)V")
    public static final void method1629(byte arg0) {
        field3746++;
        if (arg0 <= 36 || class443.field6518) {
            return;
        }
        if (class193.field3258.field7239) {
            class473.field6830 = ((int) class473.field6830 - 65 & 0xFFFFFF80);
        } else {
            class345.field5107 += (-24.0F - class345.field5107) / 2.0F;
        }
        class471.field6814 = true;
        class443.field6518 = true;
    }
}
