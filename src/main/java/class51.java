import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fw")
public class class51 extends class509 {

    @OriginalMember(owner = "client!fw", name = "lb", descriptor = "Lcaa;")
    public class255 field539;

    @OriginalMember(owner = "client!fw", name = "nb", descriptor = "Lea;")
    public static class474 field541 = new class474("RuneScape is loading - please wait...", "RuneScape wird geladen - bitte warten...", "Chargement de RuneScape en cours - veuillez patienter...", "RuneScape carregando. Aguarde...");

    @OriginalMember(owner = "client!fw", name = "ob", descriptor = "Lkca;")
    public static class73 field542 = new class73(29, 16);

    @OriginalMember(owner = "client!fw", name = "pb", descriptor = "I")
    public static int field543 = 0;

    @OriginalMember(owner = "client!fw", name = "mb", descriptor = "I")
    public static int field540;

    @OriginalMember(owner = "client!fw", name = "qb", descriptor = "Lmh;")
    public static class548 field544;

    @OriginalMember(owner = "client!fw", name = "c", descriptor = "(I)V")
    public static void method282(int arg0) {
        field544 = null;
        field541 = null;
        field542 = null;
        if (arg0 != 16) {
            field542 = null;
        }
    }

    @OriginalMember(owner = "client!fw", name = "<init>", descriptor = "(Lhv;)V")
    public class51(class449 arg0) {
        super(arg0);
        this.field539 = new class255(arg0);
        super.field7415 = new class530(super.field7400);
        super.field7419 = new class530(super.field7400);
        super.field7461 = new class530(super.field7400);
        super.field7451 = new class530(super.field7400);
        super.field7443 = new class530(super.field7400);
        super.field7426 = new class530(super.field7400);
        super.field7437 = new class530(super.field7400);
        super.field7441 = new class530(super.field7400);
        super.field7457 = new class530(super.field7400);
        super.field7435 = new class530(super.field7400);
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(B)V")
    public final void method283(byte arg0) {
        this.field539 = new class255((class449) super.field7400);
        int var2 = -119 % ((arg0 - -7) / 37);
        ++field540;
    }
}
