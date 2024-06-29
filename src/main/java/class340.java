import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class340 {

    @OriginalMember(owner = "client!df", name = "e", descriptor = "I")
    public static int field4708;

    @OriginalMember(owner = "client!df", name = "d", descriptor = "F")
    public static float field4707;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "I")
    public static int field4704;

    @OriginalMember(owner = "client!df", name = "b", descriptor = "I")
    public static int field4705;

    @OriginalMember(owner = "client!df", name = "c", descriptor = "[I")
    public static int[] field4706;

    static {
        new class572("You are temporarily blocked from joining channels - please try again later!", "Du darfst derzeit keine Chaträume betreten - bitte versuch es später.", "Vous êtes temporairement exclu des canaux - veuillez réessayer ultérieurement.", "Você está temporariamente impedido de entrar em canais. Tente de novo depois!");
        field4708 = -1;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lqa;Loa;ILjj;ILbc;II)V", line = 9)
    public static final void method2083(class208 arg0, class597 arg1, int arg2, class101 arg3, int arg4, class308 arg5, int arg6, int arg7) {
        field4705++;
        int var8 = arg3.field1467 - arg2 / 2 - 5;
        int var9 = arg4 + 2;
        if (arg5.field4217 != 0) {
            arg0.method1378(true, var8, arg5.field4217, arg2 + 10, -var9 + (arg4 - (-(arg6 * arg1.method3533()) + -1)), var9);
        }
        if (arg5.field4220 != arg7) {
            arg0.method1374(true, arg4 + (arg1.method3533() * arg6 - var9) + 1, arg2 + 10, arg5.field4220, var8, var9);
        }
        int var10 = arg5.field4251;
        if (arg3.field1462 && arg5.field4223 != -1) {
            var10 = arg5.field4223;
        }
        for (int var11 = 0; var11 < arg6; var11++) {
            String var12 = class116.field1634[var11];
            if ((arg6 - 1) > var11) {
                var12 = var12.substring(0, var12.length() - 4);
            }
            arg1.method3535(arg0, var12, arg3.field1467, arg4, var10, true);
            arg4 += arg1.method3533();
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V", line = 57)
    public static void method2084(int arg0) {
        field4706 = null;
        if (arg0 != 23092) {
            field4706 = null;
        }
    }
}
