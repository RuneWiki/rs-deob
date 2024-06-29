import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cu")
public class class145 {

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "Llt;")
    public static class475 field2150 = new class475("Loading wordpack - ", "Lade Wordpack - ", "Chargement du module texte - ", "Carregando pacote de palavras - ");

    @OriginalMember(owner = "client!cu", name = "c", descriptor = "I")
    public int field2152;

    @OriginalMember(owner = "client!cu", name = "d", descriptor = "I")
    public static int field2153;

    @OriginalMember(owner = "client!cu", name = "e", descriptor = "Ljava/lang/String;")
    public String field2154;

    @OriginalMember(owner = "client!cu", name = "b", descriptor = "[[B")
    public static byte[][] field2151;

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(IIII)V", line = 5)
    public static final void method958(int arg0, int arg1, int arg2, int arg3) {
        int var4 = class426.field6401.field1018 * arg0 >> 8;
        field2153++;
        if (arg3 < 25) {
            field2150 = null;
        }
        if (var4 != 0 && arg1 != -1) {
            class122.method799(class151.field2253, false, (byte) -16, 0, var4, arg1);
            class104.field1515 = true;
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(Z)V", line = 30)
    public static void method959(boolean arg0) {
        field2150 = null;
        if (arg0) {
            field2151 = null;
        }
        field2151 = null;
    }
}
