import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class59 {

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "Lak;")
    public static class234 field709 = new class234("Loading - please wait.", "Ladevorgang - bitte warte.", "Chargement en cours. Veuillez patienter.", "Carregando. Aguarde.");

    @OriginalMember(owner = "client!rf", name = "g", descriptor = "Lak;")
    public static class234 field710 = new class234(" ", ": ", " ", " ");

    @OriginalMember(owner = "client!rf", name = "i", descriptor = "I")
    public static int field712 = 0;

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "I")
    public static int field705;

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "I")
    public static int field706;

    @OriginalMember(owner = "client!rf", name = "h", descriptor = "Lrt;")
    public static class154 field711;

    @OriginalMember(owner = "client!rf", name = "j", descriptor = "Ll;")
    public static class16 field713;

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "Los;")
    public static class309 field707;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "Lrf;")
    public class59 field704;

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "Lrf;")
    public class59 field708;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)V")
    public static void method524(int arg0) {
        field709 = null;
        field713 = null;
        field710 = null;
        field711 = null;
        field707 = null;
        if (arg0 <= 7) {
            method525(null, 106);
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public static final boolean method525(String arg0, int arg1) {
        if (arg1 != -32071) {
            return true;
        }
        field706++;
        if (arg0 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class327.field4923; var2++) {
            if (arg0.equalsIgnoreCase(class93.field1318[var2])) {
                return true;
            }
            if (arg0.equalsIgnoreCase(class436.field6442[var2])) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(B)V")
    public final void method526(byte arg0) {
        field705++;
        if (this.field704 == null) {
            return;
        }
        int var2 = -36 % ((arg0 - 17) / 46);
        this.field704.field708 = this.field708;
        this.field708.field704 = this.field704;
        this.field704 = null;
        this.field708 = null;
    }
}
