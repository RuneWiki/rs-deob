import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class553 extends class447 {

    @OriginalMember(owner = "client!sl", name = "e", descriptor = "[I")
    private int[] field8223 = new int[512];

    @OriginalMember(owner = "client!sl", name = "g", descriptor = "Lnj;")
    public static class487 field8225 = new class487("Your friends list is full. Max of 100 for free users, and 200 for members.", "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para os usuários não pagantes e 200 para os membros.");

    @OriginalMember(owner = "client!sl", name = "h", descriptor = "Lnj;")
    public static class487 field8226 = new class487("Loaded interface scripts", "Interface-Skripte geladen", "Interfaces chargées", "Interfaces carregadas");

    @OriginalMember(owner = "client!sl", name = "j", descriptor = "Lwo;")
    public static class408 field8228 = new class408();

    @OriginalMember(owner = "client!sl", name = "k", descriptor = "[I")
    public static int[] field8229 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!sl", name = "l", descriptor = "I")
    public static int field8230 = 0;

    @OriginalMember(owner = "client!sl", name = "d", descriptor = "I")
    public static int field8222;

    @OriginalMember(owner = "client!sl", name = "f", descriptor = "I")
    public static int field8224;

    @OriginalMember(owner = "client!sl", name = "i", descriptor = "I")
    public static int field8227;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(ZLjava/lang/String;)I")
    public static final int method3235(boolean arg0, String arg1) {
        field8222++;
        if (arg1 == null) {
            return -1;
        }
        for (int var2 = 0; var2 < class156.field1993; var2++) {
            if (arg1.equalsIgnoreCase(class417.field5994[var2])) {
                return var2;
            }
        }
        if (!arg0) {
            method3236(121);
        }
        return -1;
    }

    @OriginalMember(owner = "client!sl", name = "<init>", descriptor = "(I)V")
    public class553(int arg0) {
        Random var2 = new Random((long) arg0);
        for (int var3 = 0; var3 < 256; var3++) {
            this.field8223[var3] = this.field8223[var3 + 256] = var3;
        }
        for (int var4 = 0; var4 < 256; var4++) {
            int var5 = var2.nextInt() & 0xFF;
            int var6 = this.field8223[var5];
            this.field8223[var5] = this.field8223[var5 + 256] = this.field8223[var4];
            this.field8223[var4] = this.field8223[var4 + 256] = var6;
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(I)V")
    public static void method3236(int arg0) {
        field8226 = null;
        field8225 = null;
        if (arg0 == 256) {
            field8229 = null;
            field8228 = null;
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(FIFIFIZ[FIIF)V")
    public final void method2713(float arg0, int arg1, float arg2, int arg3, float arg4, int arg5, boolean arg6, float[] arg7, int arg8, int arg9, float arg10) {
        field8224++;
        int var12 = (int) ((float) arg8 * arg10 - 1.0F);
        int var13 = var12 & 0xFF;
        int var14 = (int) ((float) arg9 * arg0 - 1.0F);
        int var15 = var14 & 0xFF;
        int var16 = (int) ((float) arg3 * arg4 - 1.0F);
        int var17 = var16 & 0xFF;
        float var18 = (float) arg1 * arg4;
        int var19 = (int) var18;
        int var20 = var19 + 1;
        float var21 = var18 - (float) var19;
        float var22 = 1.0F - var21;
        int var23 = var19 & var17;
        int var24 = var20 & var17;
        float var25 = class141.method852(arg6, var21);
        int var26 = this.field8223[var23];
        int var27 = this.field8223[var24];
        for (int var28 = 0; var28 < arg9; var28++) {
            float var29 = (float) var28 * arg0;
            int var30 = (int) var29;
            int var31 = var30 + 1;
            float var32 = var29 - (float) var30;
            float var33 = 1.0F - var32;
            int var34 = var31 & var15;
            float var35 = class141.method852(false, var32);
            int var36 = var30 & var15;
            int var37 = this.field8223[var26 + var36];
            int var38 = this.field8223[var26 + var34];
            int var39 = this.field8223[var27 + var36];
            int var40 = this.field8223[var27 + var34];
            for (int var41 = 0; var41 < arg8; var41++) {
                float var42 = (float) var41 * arg10;
                int var43 = (int) var42;
                int var44 = var43 + 1;
                float var45 = var42 - (float) var43;
                float var46 = 1.0F - var45;
                float var47 = class141.method852(false, var45);
                int var48 = var44 & var13;
                int var49 = var43 & var13;
                arg7[arg5++] = arg2 * class258.method1626(class258.method1626(class258.method1626(class26.method118(2, class637.method3693(7, this.field8223[var48 + var40]), var45, var32, var21), var47, 4096, class26.method118(2, class637.method3693(this.field8223[var40 + var49], 7), var46, var32, var21)), var35, 4096, class258.method1626(class26.method118(2, class637.method3693(this.field8223[var39 + var48], 7), var45, var33, var21), var47, 4096, class26.method118(2, class637.method3693(7, this.field8223[var39 + var49]), var46, var33, var21))), var25, 4096, class258.method1626(class258.method1626(class26.method118(2, class637.method3693(7, this.field8223[var48 + var38]), var45, var32, var22), var47, 4096, class26.method118(2, class637.method3693(this.field8223[var38 + var49], 7), var46, var32, var22)), var35, 4096, class258.method1626(class26.method118(2, class637.method3693(this.field8223[var37 + var48], 7), var45, var33, var22), var47, 4096, class26.method118(2, class637.method3693(7, this.field8223[var37 + var49]), var46, var33, var22))));
            }
        }
    }
}
