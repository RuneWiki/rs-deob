import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public abstract class class178 {

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field2628 = new String[200];

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "I")
    public static int field2627;

    static {
        new class466("Already attempting to join a channel - please wait...", "Du versuchst bereits, einem Chatraum beizutreten - bitte warte.", "Tentative de connexion au canal déjà en cours - veuillez patienter...", "Já há uma tentativa de entrar em um canal. Aguarde...");
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(I)V", line = 4)
    public static void method1148(int arg0) {
        field2628 = null;
        if (arg0 != -31389) {
            field2628 = null;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(ILsk;)I", line = 30)
    public static final int method1152(int arg0, class438 arg1) {
        field2627++;
        if (arg0 != 200) {
            method1152(-92, null);
        }
        int var2 = arg1.field6418;
        class93 var3 = arg1.method616((byte) -83);
        if (arg1.field1099) {
            var2 = arg1.field6410;
        } else if (arg1.field1083 == var3.field1338 || arg1.field1083 == var3.field1372 || arg1.field1083 == var3.field1341 || arg1.field1083 == var3.field1333) {
            var2 = arg1.field6454;
        } else if (arg1.field1083 == var3.field1355 || arg1.field1083 == var3.field1353 || arg1.field1083 == var3.field1350 || arg1.field1083 == var3.field1374) {
            var2 = arg1.field6419;
        }
        return var2;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(B)I")
    public abstract int method1147(byte arg0);

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Z)I")
    public abstract int method1149(boolean arg0);

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(I)Z")
    public abstract boolean method1150(int arg0);

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(B)C")
    public abstract char method1151(byte arg0);

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "(B)J")
    public abstract long method1153(byte arg0);
}
