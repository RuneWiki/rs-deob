import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kda")
public class class326 {

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field4162 = new String[100];

    @OriginalMember(owner = "client!kda", name = "b", descriptor = "Lcea;")
    public static class180 field4163 = new class180("Loading - please wait.", "Ladevorgang - bitte warte.", "Chargement en cours. Veuillez patienter.", "Carregando. Aguarde.");

    @OriginalMember(owner = "client!kda", name = "d", descriptor = "I")
    public static int field4165;

    @OriginalMember(owner = "client!kda", name = "c", descriptor = "[I")
    public static int[] field4164;

    static {
        new class180(null, "Dieses System darf nicht missbraucht werden!", null, null);
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(B)V", line = 12)
    public static void method1785(byte arg0) {
        field4164 = null;
        field4162 = null;
        if (arg0 == 117) {
            field4163 = null;
        }
    }
}
