import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public class class329 extends class180 {

    @OriginalMember(owner = "client!qn", name = "o", descriptor = "Ljava/lang/String;")
    public String field4535;

    @OriginalMember(owner = "client!qn", name = "p", descriptor = "Ltm;")
    public static class112 field4536 = new class112("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

    @OriginalMember(owner = "client!qn", name = "q", descriptor = "[I")
    public static int[] field4537 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!qn", name = "s", descriptor = "Ltm;")
    public static class112 field4539 = new class112("Loading world list data", "Lade Liste der Welten", "Chargement de la liste des serveurs", "Carregando dados da lista de mundos");

    @OriginalMember(owner = "client!qn", name = "r", descriptor = "Lss;")
    public static class76 field4538;

    @OriginalMember(owner = "client!qn", name = "<init>", descriptor = "()V", line = 12)
    public class329() {
    }

    @OriginalMember(owner = "client!qn", name = "c", descriptor = "(I)V", line = 16)
    public static void method1968(int arg0) {
        field4538 = null;
        field4539 = null;
        field4537 = null;
        if (arg0 == 6) {
            field4536 = null;
        }
    }

    @OriginalMember(owner = "client!qn", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 32)
    public class329(String arg0) {
        this.field4535 = arg0;
    }
}
