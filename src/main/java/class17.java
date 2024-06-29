import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bu")
public class class17 extends class249 {

    @OriginalMember(owner = "client!bu", name = "Q", descriptor = "Lwt;")
    public static class194 field239 = new class194("Loading world list data", "Lade Liste der Welten", "Chargement de la liste des serveurs", "Carregando dados da lista de mundos");

    @OriginalMember(owner = "client!bu", name = "T", descriptor = "J")
    public static volatile long field242 = 0L;

    @OriginalMember(owner = "client!bu", name = "U", descriptor = "I")
    public static int field243 = 0;

    @OriginalMember(owner = "client!bu", name = "S", descriptor = "Z")
    public static boolean field241 = true;

    @OriginalMember(owner = "client!bu", name = "P", descriptor = "I")
    public static int field238;

    @OriginalMember(owner = "client!bu", name = "R", descriptor = "I")
    public static int field240;

    @OriginalMember(owner = "client!bu", name = "V", descriptor = "[Lqg;")
    public static class307[] field244;

    @OriginalMember(owner = "client!bu", name = "c", descriptor = "(II)I")
    public static int method121(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!bu", name = "c", descriptor = "(I)V")
    public static void method122(int arg0) {
        int var1 = 73 / ((-arg0 - 70) / 52);
        field239 = null;
        field244 = null;
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(BLjava/lang/String;)I")
    public static final int method123(byte arg0, String arg1) {
        field238++;
        int var2 = arg1.length();
        if (arg0 != -54) {
            return -85;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = ((var3 << 5) + arg1.charAt(var4)) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(ZLjava/lang/String;)Z")
    public static final boolean method124(boolean arg0, String arg1) {
        field240++;
        if (arg1 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class136.field1754; var2++) {
            if (arg1.equalsIgnoreCase(class235.field3307[var2])) {
                return true;
            }
            if (arg1.equalsIgnoreCase(class239.field3346[var2])) {
                return true;
            }
        }
        if (!arg0) {
            field242 = -32L;
        }
        return false;
    }
}
