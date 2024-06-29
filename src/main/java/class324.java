import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pr")
public class class324 {

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "[[I")
    public static int[][] field4674 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!pr", name = "e", descriptor = "I")
    public static int field4678 = 0;

    @OriginalMember(owner = "client!pr", name = "g", descriptor = "Lsd;")
    public static class74 field4680 = new class74(101, 8);

    @OriginalMember(owner = "client!pr", name = "i", descriptor = "F")
    public static float field4682;

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "I")
    public static int field4675;

    @OriginalMember(owner = "client!pr", name = "d", descriptor = "I")
    public static int field4677;

    @OriginalMember(owner = "client!pr", name = "f", descriptor = "I")
    public static int field4679;

    @OriginalMember(owner = "client!pr", name = "c", descriptor = "Lph;")
    public class125 field4676;

    @OriginalMember(owner = "client!pr", name = "h", descriptor = "Lqh;")
    public class352 field4681;

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(Z)V")
    public static void method1974(boolean arg0) {
        field4680 = null;
        if (!arg0) {
            field4674 = null;
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "([Ljava/lang/String;III)Ljava/lang/String;")
    public static final String method1975(String[] arg0, int arg1, int arg2, int arg3) {
        field4677++;
        if (arg1 == 0) {
            return "";
        } else if (arg1 == 1) {
            String var4 = arg0[arg2];
            return var4 == null ? "null" : var4.toString();
        } else {
            if (arg3 != 4) {
                method1974(false);
            }
            int var5 = arg1 + arg2;
            int var6 = 0;
            for (int var7 = arg2; var7 < var5; var7++) {
                String var11 = arg0[var7];
                if (var11 == null) {
                    var6 += 4;
                } else {
                    var6 += var11.length();
                }
            }
            StringBuffer var8 = new StringBuffer(var6);
            for (int var9 = arg2; var9 < var5; var9++) {
                String var10 = arg0[var9];
                if (var10 == null) {
                    var8.append("null");
                } else {
                    var8.append(var10);
                }
            }
            return var8.toString();
        }
    }

    static {
        new class40("Unable to add friend - unknown player.", "Spieler konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter l'ami - joueur inconnu.", "Não foi possível adicionar um amigo - jogador desconhecido.");
    }
}
