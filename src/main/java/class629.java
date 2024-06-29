import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uba")
public class class629 extends class108 {

    @OriginalMember(owner = "client!uba", name = "k", descriptor = "I")
    public int field9178;

    @OriginalMember(owner = "client!uba", name = "j", descriptor = "I")
    public int field9177;

    @OriginalMember(owner = "client!uba", name = "m", descriptor = "I")
    public static int field9180;

    @OriginalMember(owner = "client!uba", name = "n", descriptor = "I")
    public static int field9181;

    @OriginalMember(owner = "client!uba", name = "l", descriptor = "[Lha;")
    public static class116[] field9179;

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(Z)V")
    public static final void method3640(boolean arg0) {
        field9180++;
        if (class162.field2064) {
            return;
        }
        class194.field2524 = arg0;
        if (class501.field6954.field7869) {
            class568.field7951 = ((int) class568.field7951 + 47 & 0xFFFFFFF0);
        } else {
            class418.field5711 += (12.0F - class418.field5711) / 2.0F;
        }
        class162.field2064 = true;
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(B)V")
    public static void method3641(byte arg0) {
        if (arg0 != -41) {
            field9179 = null;
        }
        field9179 = null;
    }

    @OriginalMember(owner = "client!uba", name = "<init>", descriptor = "(II)V")
    public class629(int arg0, int arg1) {
        this.field9178 = arg0;
        this.field9177 = arg1;
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(III)Z")
    public static final boolean method3642(int arg0, int arg1, int arg2) {
        field9181++;
        if (arg1 == -857) {
            return (arg0 & 0x34) != 0;
        } else {
            return false;
        }
    }

    static {
        new class344("Loaded additional fonts", "Zusatzschriftarten geladen", "Polices secondaires chargées", "Fontes principais carregadas");
    }
}
