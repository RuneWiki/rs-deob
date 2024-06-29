import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public class class617 extends class435 {

    @OriginalMember(owner = "client!fn", name = "t", descriptor = "I")
    public int field8820;

    @OriginalMember(owner = "client!fn", name = "u", descriptor = "I")
    public int field8821;

    @OriginalMember(owner = "client!fn", name = "q", descriptor = "[Ljava/lang/String;")
    public static String[] field8817 = new String[100];

    @OriginalMember(owner = "client!fn", name = "r", descriptor = "I")
    public static int field8818;

    @OriginalMember(owner = "client!fn", name = "s", descriptor = "I")
    public static int field8819;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(I)V", line = 13)
    public static void method3489(int arg0) {
        if (arg0 != -196) {
            field8817 = null;
        }
        field8817 = null;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(ZC)C", line = 23)
    public static final char method3490(boolean arg0, char arg1) {
        field8819++;
        if (arg0) {
            method3489(-35);
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

    @OriginalMember(owner = "client!fn", name = "<init>", descriptor = "(II)V", line = 426)
    public class617(int arg0, int arg1) {
        this.field8820 = arg0;
        this.field8821 = arg1;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(B)V", line = 435)
    public static final void method3491(byte arg0) {
        field8818++;
        if (class316.field4374 != null) {
            for (int var1 = 0; var1 < class576.field8442; var1++) {
                class316.field4374[var1] = null;
            }
            class316.field4374 = null;
        }
        if (class333.field4644 != null) {
            for (int var2 = 0; var2 < class465.field6718; var2++) {
                class333.field4644[var2] = null;
            }
            class333.field4644 = null;
        }
        if (class117.field1847 != null) {
            for (int var3 = 0; var3 < class203.field3148; var3++) {
                class117.field1847[var3] = null;
            }
            class117.field1847 = null;
        }
        class348.field4915 = -1;
        class346.field4893 = -1;
        class213.field3236 = null;
        class596.field8630 = null;
        if (arg0 >= 53) {
            class682.field9711 = null;
        }
    }
}
