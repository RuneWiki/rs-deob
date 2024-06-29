import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class52 {

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "Lvt;")
    public static class344 field698 = new class344("Your ignore list is full. Max of 100 users.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O limite é 100 usuários.");

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "I")
    public static int field693;

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "I")
    public static int field694;

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "I")
    public static int field696;

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "I")
    public static int field697;

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "[Lha;")
    public static class116[] field695;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method283(String[] arg0, int arg1) {
        field696++;
        String[] var2 = new String[5];
        if (arg1 != -1) {
            field698 = null;
        }
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = var3 + ": ";
            if (arg0 != null && arg0[var3] != null) {
                var2[var3] = var2[var3] + arg0[var3];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ILth;II)V")
    public static final void method284(int arg0, class266 arg1, int arg2, int arg3) {
        class257.field3197[arg3][arg0] = arg1;
        field697++;
        if (arg2 > -21) {
            field695 = null;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V")
    public static void method285(int arg0) {
        field695 = null;
        if (arg0 != 5) {
            field698 = null;
        }
        field698 = null;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(III)Z")
    public static final boolean method286(int arg0, int arg1, int arg2) {
        field694++;
        if (arg0 <= 3) {
            field698 = null;
        }
        return (arg2 & 0x400) != 0;
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(I)V")
    public static final void method287(int arg0) {
        field693++;
        int var1 = arg0;
        for (int var2 = 0; var2 < class139.field1760; var2++) {
            for (int var3 = 0; var3 < class369.field5135; var3++) {
                if (class400.method2403(var2, var1, var3, true, class199.field2605, (byte) -121)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
    }
}
