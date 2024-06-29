import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class52 {

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "J")
    public static long field614;

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "[I")
    public static int[] field615;

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "S")
    public static short field616;

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "I")
    public static int field612;

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "I")
    public static int field613;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "Lge;")
    public class386 field610;

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "Lgi;")
    public class416 field611;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IC)Z")
    public static final boolean method299(int arg0, char arg1) {
        field612++;
        if (arg0 != 48) {
            method299(-1, (char) 65457);
        }
        return arg1 >= '0' && arg1 <= '9';
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(III)V")
    public static final void method300(int arg0, int arg1, int arg2) {
        class316 var3 = class347.field4722[arg0][arg1][arg2];
        if (var3 != null && var3.field4255 != null) {
            var3.field4255 = null;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(B)V")
    public static void method301(byte arg0) {
        field615 = null;
        if (arg0 != -82) {
            field614 = -84L;
        }
    }

    static {
        new class72("Chat disabled", "Deaktiviert", "Messagerie désactivée", "Bate-papo desativado");
        field614 = 0L;
        field615 = new int[4096];
        new class72((String) null, "Dieses System darf nicht missbraucht werden!", (String) null, (String) null);
        field616 = 256;
    }
}
