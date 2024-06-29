import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaa")
public class class62 {

    @OriginalMember(owner = "client!jaa", name = "e", descriptor = "I")
    public static int field859 = 0;

    @OriginalMember(owner = "client!jaa", name = "f", descriptor = "I")
    public static int field860;

    @OriginalMember(owner = "client!jaa", name = "b", descriptor = "I")
    public static int field856;

    @OriginalMember(owner = "client!jaa", name = "c", descriptor = "I")
    public static int field857;

    @OriginalMember(owner = "client!jaa", name = "d", descriptor = "I")
    public static int field858;

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "Lgw;")
    public class140 field855;

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method490(String arg0, int arg1) {
        field858++;
        if (class40.field554 == 3) {
            return -1;
        } else if (class401.field6000.containsKey(arg0)) {
            return 100;
        } else {
            String var2 = class481.method2770(arg0, false);
            if (var2 == null) {
                return -1;
            }
            String var3 = class79.field1435 + var2;
            if (!class301.field4349.method3189("", var3, (byte) -119)) {
                return -1;
            }
            if (arg1 != 28598) {
                method491(-102, -25, -25, -7, 73, -98);
            }
            if (!class301.field4349.method3168((byte) -106, var3)) {
                return class301.field4349.method3182(var3, arg1 - 28675);
            }
            byte[] var4 = class301.field4349.method3193(-14855, var3, "");
            File var5 = class167.field2448.method371(var2, 121);
            if (var4 == null || var5 == null) {
                return -1;
            }
            boolean var6 = true;
            byte[] var7 = class180.method1219(var5, 256);
            if (var7 != null && var4.length == var7.length) {
                for (int var8 = 0; var8 < var7.length; var8++) {
                    if (var4[var8] != var7[var8]) {
                        var6 = false;
                        break;
                    }
                }
            } else {
                var6 = false;
            }
            try {
                if (!var6) {
                    class167.field2448.method363(var5, arg1 - 28558, var4);
                }
            } catch (Throwable var9) {
                return -1;
            }
            class244.method1552((byte) 18, arg0, var5);
            return 100;
        }
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IIIIII)V")
    public static final void method491(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 55 / ((54 - arg0) / 48);
        field857++;
        int var7 = 0;
        int var8 = arg3;
        int var9 = arg5 * arg5;
        int var10 = arg3 * arg3;
        int var11 = var10 << 1;
        int var12 = var9 << 1;
        int var13 = arg3 << 1;
        int var14 = (1 - var13) * var9 + var11;
        int var15 = var10 - ((var13 - 1) * var12);
        int var16 = var9 << 2;
        int var17 = var10 << 2;
        int var18 = ((var7 << 1) + 3) * var11;
        int var19 = ((arg3 << 1) - 3) * var12;
        int var20 = (var7 + 1) * var17;
        int var21 = (arg3 - 1) * var16;
        class614.method3490(arg4, arg1 - arg5, -85, class495.field6944[arg2], arg1 + arg5);
        while (var8 > 0) {
            if (var14 < 0) {
                while (var14 < 0) {
                    var15 += var20;
                    var14 += var18;
                    var18 += var17;
                    var7++;
                    var20 += var17;
                }
            }
            if (var15 < 0) {
                var15 += var20;
                var14 += var18;
                var18 += var17;
                var20 += var17;
                var7++;
            }
            var14 += -var21;
            var15 += -var19;
            var19 -= var16;
            var21 -= var16;
            var8--;
            int var22 = arg2 - var8;
            int var23 = arg2 + var8;
            int var24 = arg1 + var7;
            int var25 = arg1 - var7;
            class614.method3490(arg4, var25, -115, class495.field6944[var22], var24);
            class614.method3490(arg4, var25, -85, class495.field6944[var23], var24);
        }
    }

    static {
        new class567("Your friends list is full, max of 100 for free users, and 200 for members.", "Ihre Freunde-Liste ist voll!", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para usuários não pagantes, e 200 para membros.");
        field860 = 1;
    }
}
