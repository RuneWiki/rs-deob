import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public abstract class class295 extends class446 {

    @OriginalMember(owner = "client!od", name = "z", descriptor = "[Ljava/awt/Color;")
    public static Color[] field4133 = new Color[] { new Color(9179409), new Color(3289650) };

    @OriginalMember(owner = "client!od", name = "x", descriptor = "I")
    public static int field4131;

    @OriginalMember(owner = "client!od", name = "y", descriptor = "I")
    public static int field4132;

    @OriginalMember(owner = "client!od", name = "A", descriptor = "I")
    public static int field4134;

    @OriginalMember(owner = "client!od", name = "w", descriptor = "Z")
    public static boolean field4130;

    @OriginalMember(owner = "client!od", name = "d", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method1208(int arg0);

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(I[IIII)V")
    public static final void method1924(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        arg4--;
        field4132++;
        if (arg0 != 3289650) {
            field4133 = null;
        }
        int var6 = arg2 - 1;
        int var5 = var6 - 7;
        while (arg4 < var5) {
            int var7 = arg4 + 1;
            arg1[var7] = arg3;
            int var8 = var7 + 1;
            arg1[var8] = arg3;
            int var9 = var8 + 1;
            arg1[var9] = arg3;
            int var10 = var9 + 1;
            arg1[var10] = arg3;
            int var11 = var10 + 1;
            arg1[var11] = arg3;
            int var12 = var11 + 1;
            arg1[var12] = arg3;
            int var13 = var12 + 1;
            arg1[var13] = arg3;
            arg4 = var13 + 1;
            arg1[arg4] = arg3;
        }
        while (arg4 < var6) {
            arg4++;
            arg1[arg4] = arg3;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ZI)V")
    public static final void method1925(boolean arg0, int arg1) {
        if (!arg0) {
            class67.field1008.method901(arg1, 12223);
            field4131++;
            class212.field2966.method901(arg1, 12223);
        }
    }

    @OriginalMember(owner = "client!od", name = "e", descriptor = "(I)V")
    public static void method1926(int arg0) {
        if (arg0 >= -4) {
            method1925(false, -35);
        }
        field4133 = null;
    }

    @OriginalMember(owner = "client!od", name = "f", descriptor = "(I)Z")
    public abstract boolean method1209(int arg0);

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(BIIIIII)V")
    public static final void method1927(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = -47 % ((arg0 + 81) / 39);
        field4134++;
        if (class154.field2161 <= (arg6 - arg4) && arg4 + arg6 <= class233.field3350 && arg5 - arg4 >= class290.field4058 && (arg5 + arg4) <= class442.field6212) {
            class237.method1602(arg4, arg2, arg6, arg5, arg1, arg3, true);
        } else {
            class157.method1056(arg6, arg5, arg4, arg1, arg3, arg2, -21);
        }
    }

    static {
        new class442("Unable to send message - system busy.", "Deine Nachricht konnte nicht verschickt werden, das System ist derzeit ausgelastet.", "Impossible d'envoyer un message - système occupé.", "Não foi possível enviar a mensagem. O sistema está ocupado.");
    }
}
