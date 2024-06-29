import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class65 {

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "Lon;")
    public static class203 field838 = null;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "I")
    public static int field837;

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "Lb;")
    public static class201 field840;

    @OriginalMember(owner = "client!ri", name = "e", descriptor = "Lb;")
    public static class201 field841;

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "Lkr;")
    public static class486 field839;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIIIZII)V")
    public static final void method399(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        field837++;
        int var7 = arg1 + arg2;
        int var8 = arg0 - arg2;
        for (int var9 = arg1; var9 < var7; var9++) {
            class103.method579((byte) 115, arg3, arg5, arg6, class128.field1676[var9]);
        }
        int var10 = arg5 - arg2;
        int var11 = arg2 + arg3;
        if (arg4) {
            field841 = null;
        }
        for (int var12 = arg0; var12 > var8; var12--) {
            class103.method579((byte) 115, arg3, arg5, arg6, class128.field1676[var12]);
        }
        for (int var13 = var7; var13 <= var8; var13++) {
            int[] var14 = class128.field1676[var13];
            class103.method579((byte) 115, arg3, var11, arg6, var14);
            class103.method579((byte) 115, var10, arg5, arg6, var14);
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)V")
    public static void method400(int arg0) {
        field840 = null;
        field841 = null;
        if (arg0 == 3875) {
            field839 = null;
        }
    }

    static {
        new class326("Your friendlist is full, max of 100 for free users, and 200 for members.", "Ihre Freunde-Liste ist voll!", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para usuários não pagantes, e 200 para membros.");
        new class326("You do not have permission to kick users in this channel.", "Du darfst keine Benutzer aus diesem Chatraum rauswerfen.", "Vous n'êtes pas autorisé à expulser des utilisateurs de ce canal.", "Você não tem permissão para expulsar usuários neste canal.");
    }
}
