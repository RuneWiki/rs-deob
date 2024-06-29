import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rda")
public class class92 {

    @OriginalMember(owner = "client!rda", name = "d", descriptor = "Lvt;")
    public static class344 field1227 = new class344("Loading SW3D - ", "Lade SW3D - ", "Chargement SW3D - ", "Carregando SW3D - ");

    @OriginalMember(owner = "client!rda", name = "c", descriptor = "I")
    public static int field1226;

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "Lfea;")
    public static class47 field1224;

    @OriginalMember(owner = "client!rda", name = "b", descriptor = "[Lha;")
    public static class116[] field1225;

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(IC)C")
    public static final char method506(int arg0, char arg1) {
        field1226++;
        if (arg0 != 255) {
            field1224 = null;
        }
        if (arg1 == ' ' || arg1 == ' ' || arg1 == '_' || arg1 == '-') {
            return '_';
        } else if (arg1 == '[' || arg1 == ']' || arg1 == '#') {
            return arg1;
        } else if (arg1 == 'à' || arg1 == 'á' || arg1 == 'â' || arg1 == 'ä' || arg1 == 'ã' || arg1 == 'À' || arg1 == 'Á' || arg1 == 'Â' || arg1 == 'Ä' || arg1 == 'Ã') {
            return 'a';
        } else if (arg1 == 'è' || arg1 == 'é' || arg1 == 'ê' || arg1 == 'ë' || arg1 == 'È' || arg1 == 'É' || arg1 == 'Ê' || arg1 == 'Ë') {
            return 'e';
        } else if (arg1 == 'í' || arg1 == 'î' || arg1 == 'ï' || arg1 == 'Í' || arg1 == 'Î' || arg1 == 'Ï') {
            return 'i';
        } else if (arg1 == 'ò' || arg1 == 'ó' || arg1 == 'ô' || arg1 == 'ö' || arg1 == 'õ' || arg1 == 'Ò' || arg1 == 'Ó' || arg1 == 'Ô' || arg1 == 'Ö' || arg1 == 'Õ') {
            return 'o';
        } else if (arg1 == 'ù' || arg1 == 'ú' || arg1 == 'û' || arg1 == 'ü' || arg1 == 'Ù' || arg1 == 'Ú' || arg1 == 'Û' || arg1 == 'Ü') {
            return 'u';
        } else if (arg1 == 'ç' || arg1 == 'Ç') {
            return 'c';
        } else if (arg1 == 'ÿ' || arg1 == 'Ÿ') {
            return 'y';
        } else if (arg1 == 'ñ' || arg1 == 'Ñ') {
            return 'n';
        } else if (arg1 == 'ß') {
            return 'b';
        } else {
            return Character.toLowerCase(arg1);
        }
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(I)V")
    public static void method507(int arg0) {
        if (arg0 != 205) {
            field1225 = null;
        }
        field1227 = null;
        field1224 = null;
        field1225 = null;
    }
}
