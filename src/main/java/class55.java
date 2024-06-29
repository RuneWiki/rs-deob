import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ns")
public class class55 {

    @OriginalMember(owner = "client!ns", name = "c", descriptor = "Lsf;")
    public static class398 field735 = new class398();

    @OriginalMember(owner = "client!ns", name = "g", descriptor = "Lwl;")
    public static class452 field739;

    @OriginalMember(owner = "client!ns", name = "h", descriptor = "Lpf;")
    public static class425 field740;

    @OriginalMember(owner = "client!ns", name = "i", descriptor = "Lnn;")
    public static class151 field741;

    @OriginalMember(owner = "client!ns", name = "k", descriptor = "[I")
    public static int[] field743;

    @OriginalMember(owner = "client!ns", name = "j", descriptor = "Lnn;")
    public static class151 field742;

    @OriginalMember(owner = "client!ns", name = "l", descriptor = "[Lde;")
    public static class8[] field744;

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "I")
    public static int field733;

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "I")
    public static int field734;

    @OriginalMember(owner = "client!ns", name = "d", descriptor = "I")
    public static int field736;

    @OriginalMember(owner = "client!ns", name = "e", descriptor = "I")
    public static int field737;

    @OriginalMember(owner = "client!ns", name = "f", descriptor = "Liq;")
    public static class134 field738;

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(Liq;Z)V")
    public static final void method315(class134 arg0, boolean arg1) {
        if (arg1) {
            class377.field5503 = arg0;
            field733++;
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(II)Z")
    public static final boolean method316(int arg0, int arg1) {
        if (arg0 < 121) {
            return false;
        }
        field737++;
        if (arg1 == 8 || arg1 == 30 || arg1 == 6 || arg1 == 13 || arg1 == 47) {
            return true;
        } else {
            return arg1 == 50 || arg1 == 1003;
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(Ljava/lang/String;B)J")
    public static final long method317(String arg0, byte arg1) {
        field736++;
        if (arg1 != 51) {
            field744 = null;
        }
        long var2 = 0L;
        int var4 = arg0.length();
        for (int var5 = 0; var5 < var4; var5++) {
            var2 *= 37L;
            char var6 = arg0.charAt(var5);
            if (var6 >= 'A' && var6 <= 'Z') {
                var2 += (long) (var6 + 1 - 65);
            } else if (var6 >= 'a' && var6 <= 'z') {
                var2 += (long) (1 - (97 - var6));
            } else if (var6 >= '0' && var6 <= '9') {
                var2 += (long) (var6 + 27 - '0');
            }
            if (var2 >= 177917621779460413L) {
                break;
            }
        }
        while ((var2 % 37L) == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ns", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field734++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(II)V")
    public class55(int arg0, int arg1) {
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(I)V")
    public static void method318(int arg0) {
        field742 = null;
        field739 = null;
        field743 = null;
        field738 = null;
        if (arg0 < 117) {
            field742 = null;
        }
        field740 = null;
        field741 = null;
        field744 = null;
        field735 = null;
    }

    static {
        new class151("Your clan channel has now been enabled!", "Dein Chatraum ist jetzt eingeschaltet.", "Votre canal de clan est activé !", "Seu canal de clã já está ativado!");
        field739 = new class452(31, 0);
        field740 = new class425(44, 0);
        field741 = new class151("Members object", "Gegenstand für Mitglieder", "Objet d'abonnés", "Objeto para membros");
        field743 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };
        field742 = new class151("Walk here", "Hierhin gehen", "Atteindre", "Caminhar para cá");
        field744 = new class8[8];
    }
}
