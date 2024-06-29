import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class135 {

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "Z")
    public static boolean field2176;

    @OriginalMember(owner = "client!oc", name = "j", descriptor = "Lpi;")
    public static class342 field2177;

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "B")
    public byte field2173;

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "I")
    public static int field2170;

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "I")
    public static int field2171;

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "I")
    public int field2172;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "Ljava/lang/String;")
    public String field2168;

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "Ljava/lang/String;")
    public String field2174;

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "Ljava/lang/String;")
    public String field2175;

    @OriginalMember(owner = "client!oc", name = "k", descriptor = "Ljava/lang/String;")
    public String field2178;

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "[I")
    public static int[] field2169;

    static {
        new class342("Unable to send abuse report - system busy.", "Meldung konnte nicht gesendet werden - Systeme überlastet", "Impossible de signaler un abus - Erreur système", "Sistema ocupado. Não foi possível enviar sua denúncia de abuso.");
        field2176 = false;
        field2177 = new class342(" has logged out.", " loggt sich aus.", " s'est déconnecté.", " saiu do jogo.");
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IZ)Lop;", line = 11)
    public static final class124 method1010(int arg0, boolean arg1) {
        field2171++;
        class124[] var2 = class59.method525(0);
        int var3 = 0;
        if (arg1) {
            return null;
        }
        while (var2.length > var3) {
            class124 var4 = var2[var3];
            if (var4.field2004 == arg0) {
                return var4;
            }
            var3++;
        }
        return null;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IB)Z", line = 37)
    public static final boolean method1011(int arg0, byte arg1) {
        if (arg1 < 41) {
            field2176 = false;
        }
        field2170++;
        return arg0 >= 12 && arg0 <= 17;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Z)V", line = 56)
    public static void method1012(boolean arg0) {
        if (!arg0) {
            method1012(true);
        }
        field2169 = null;
        field2177 = null;
    }
}
