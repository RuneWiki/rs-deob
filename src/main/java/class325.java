import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nq")
public class class325 {

    @OriginalMember(owner = "client!nq", name = "c", descriptor = "Lkn;")
    public static class530 field4739 = new class530("rating: ", "Kampfstufe: ", "classement ", "qualificação: ");

    @OriginalMember(owner = "client!nq", name = "k", descriptor = "[F")
    public static float[] field4747 = new float[4];

    @OriginalMember(owner = "client!nq", name = "l", descriptor = "I")
    public static int field4748 = 0;

    @OriginalMember(owner = "client!nq", name = "j", descriptor = "I")
    public static int field4746 = 1337;

    @OriginalMember(owner = "client!nq", name = "n", descriptor = "F")
    public static float field4750 = 0.0F;

    @OriginalMember(owner = "client!nq", name = "m", descriptor = "Lkn;")
    public static class530 field4749 = new class530("Loading sprites - ", "Lade Sprites - ", "Chargement des sprites - ", "Carregando sprites - ");

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "I")
    public static int field4737;

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "I")
    public static int field4738;

    @OriginalMember(owner = "client!nq", name = "d", descriptor = "I")
    public static int field4740;

    @OriginalMember(owner = "client!nq", name = "h", descriptor = "I")
    public static int field4744;

    @OriginalMember(owner = "client!nq", name = "g", descriptor = "[B")
    public byte[] field4743;

    @OriginalMember(owner = "client!nq", name = "e", descriptor = "[S")
    public short[] field4741;

    @OriginalMember(owner = "client!nq", name = "f", descriptor = "[S")
    public short[] field4742;

    @OriginalMember(owner = "client!nq", name = "i", descriptor = "[S")
    public short[] field4745;

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(Ljava/lang/Object;Lnt;I)V")
    public static final void method1958(Object arg0, class151 arg1, int arg2) {
        field4740++;
        if (arg1.field2154 == null) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg1.field2154.peekEvent() != null; var3++) {
            class52.method411(1L, (byte) 123);
        }
        if (arg2 != -3138) {
            method1960((byte) 11);
        }
        if (arg0 != null) {
            arg1.field2154.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(B)V")
    public static final void method1959(byte arg0) {
        field4737++;
        class144.field1908 = 0;
        int var1 = -86 / ((arg0 - 58) / 54);
        for (int var2 = 0; var2 < 2048; var2++) {
            class226.field3255[var2] = null;
            class124.field1684[var2] = 1;
            class309.field4501[var2] = null;
        }
    }

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "(B)V")
    public static void method1960(byte arg0) {
        int var1 = 110 / ((66 - arg0) / 59);
        field4739 = null;
        field4749 = null;
        field4747 = null;
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(CI)C")
    public static final char method1961(char arg0, int arg1) {
        if (arg1 != 196) {
            method1959((byte) 24);
        }
        field4738++;
        if (arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-') {
            return '_';
        } else if (arg0 == '[' || arg0 == ']' || arg0 == '#') {
            return arg0;
        } else if (arg0 == 'à' || arg0 == 'á' || arg0 == 'â' || arg0 == 'ä' || arg0 == 'ã' || arg0 == 'À' || arg0 == 'Á' || arg0 == 'Â' || arg0 == 'Ä' || arg0 == 'Ã') {
            return 'a';
        } else if (arg0 == 'è' || arg0 == 'é' || arg0 == 'ê' || arg0 == 'ë' || arg0 == 'È' || arg0 == 'É' || arg0 == 'Ê' || arg0 == 'Ë') {
            return 'e';
        } else if (arg0 == 'í' || arg0 == 'î' || arg0 == 'ï' || arg0 == 'Í' || arg0 == 'Î' || arg0 == 'Ï') {
            return 'i';
        } else if (arg0 == 'ò' || arg0 == 'ó' || arg0 == 'ô' || arg0 == 'ö' || arg0 == 'õ' || arg0 == 'Ò' || arg0 == 'Ó' || arg0 == 'Ô' || arg0 == 'Ö' || arg0 == 'Õ') {
            return 'o';
        } else if (arg0 == 'ù' || arg0 == 'ú' || arg0 == 'û' || arg0 == 'ü' || arg0 == 'Ù' || arg0 == 'Ú' || arg0 == 'Û' || arg0 == 'Ü') {
            return 'u';
        } else if (arg0 == 'ç' || arg0 == 'Ç') {
            return 'c';
        } else if (arg0 == 'ÿ' || arg0 == 'Ÿ') {
            return 'y';
        } else if (arg0 == 'ñ' || arg0 == 'Ñ') {
            return 'n';
        } else if (arg0 == 'ß') {
            return 'b';
        } else {
            return Character.toLowerCase(arg0);
        }
    }
}
