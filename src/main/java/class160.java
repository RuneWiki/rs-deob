import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class160 {

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "Lfg;")
    public static class83 field2292 = new class83("Loaded textures", "Texturen geladen.", "Textures chargées", "Texturas carregadas");

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "Ljm;")
    public static class485 field2293;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "I")
    public static int field2291;

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "I")
    public static int field2294;

    static {
        new class83("Your friendlist is full, max of 100 for free users, and 200 for members.", "Ihre Freunde-Liste ist voll!", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para usuários não pagantes, e 200 para membros.");
        field2293 = new class485(54, -1);
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)V", line = 3)
    public static void method993(int arg0) {
        field2292 = null;
        if (arg0 > -95) {
            method994(-41, -55, -73, -38, 14, true);
        }
        field2293 = null;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIIIIZ)V", line = 26)
    public static final void method994(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field2291++;
        int var6 = 0;
        int var7 = arg1;
        int var8 = arg0 * arg0;
        int var9 = arg1 * arg1;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg1 << 1;
        if (!arg5) {
            method993(75);
        }
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - ((var12 - 1) * var11);
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg1 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var16;
        int var20 = (arg1 - 1) * var15;
        class419.method2511(class225.field3174[arg3], arg2 - arg0, arg4, arg0 + arg2, 101);
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var13 += var17;
                    var14 += var19;
                    var19 += var16;
                    var6++;
                    var17 += var16;
                }
            }
            if (var14 < 0) {
                var14 += var19;
                var13 += var17;
                var19 += var16;
                var6++;
                var17 += var16;
            }
            var14 += -var18;
            var13 += -var20;
            var20 -= var15;
            var7--;
            var18 -= var15;
            int var21 = arg3 - var7;
            int var22 = arg3 + var7;
            int var23 = arg2 + var6;
            int var24 = arg2 - var6;
            class419.method2511(class225.field3174[var21], var24, arg4, var23, 114);
            class419.method2511(class225.field3174[var22], var24, arg4, var23, -25);
        }
    }
}
