import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class299 extends class29 {

    @OriginalMember(owner = "client!hg", name = "H", descriptor = "Z")
    public static boolean field4350 = false;

    @OriginalMember(owner = "client!hg", name = "M", descriptor = "I")
    public static int field4355 = 0;

    @OriginalMember(owner = "client!hg", name = "I", descriptor = "Lil;")
    public static class274 field4351 = new class274(4, 2);

    @OriginalMember(owner = "client!hg", name = "S", descriptor = "F")
    public static float field4361;

    @OriginalMember(owner = "client!hg", name = "Q", descriptor = "F")
    public static float field4359;

    @OriginalMember(owner = "client!hg", name = "C", descriptor = "I")
    public static int field4345;

    @OriginalMember(owner = "client!hg", name = "D", descriptor = "I")
    public int field4346;

    @OriginalMember(owner = "client!hg", name = "K", descriptor = "I")
    public int field4353;

    @OriginalMember(owner = "client!hg", name = "L", descriptor = "I")
    public int field4354;

    @OriginalMember(owner = "client!hg", name = "P", descriptor = "I")
    public int field4358;

    @OriginalMember(owner = "client!hg", name = "J", descriptor = "Ljm;")
    public class167 field4352;

    @OriginalMember(owner = "client!hg", name = "F", descriptor = "Ljava/lang/String;")
    public String field4348;

    @OriginalMember(owner = "client!hg", name = "G", descriptor = "[I")
    public int[] field4349;

    @OriginalMember(owner = "client!hg", name = "N", descriptor = "[I")
    public int[] field4356;

    @OriginalMember(owner = "client!hg", name = "E", descriptor = "[Ldq;")
    public class90[] field4347;

    @OriginalMember(owner = "client!hg", name = "O", descriptor = "[Ljava/lang/String;")
    public String[] field4357;

    @OriginalMember(owner = "client!hg", name = "R", descriptor = "[[I")
    public static int[][] field4360;

    static {
        new class409("Please wait until you are logged out of your previous channel.", "Bitte warte, bis du den vorherigen Chatraum verlassen hast.", "Veuillez attendre d'être déconnecté(e) de votre canal précédent.", "Aguarde até se desconectar do canal anterior.");
        field4361 = 0.0F;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIIIIIII)V", line = 8)
    public static final void method1984(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4345++;
        if (arg3 == arg4) {
            class304.method2031(-16272, arg7, arg3, arg6, arg2, arg0, arg1);
            return;
        }
        if (arg0 - arg3 >= class9.field128 && class63.field838 >= arg0 + arg3 && (arg7 - arg4) >= class248.field3659 && arg4 + arg7 <= class146.field1978) {
            class56.method426(arg7, arg4, arg6, arg5 ^ 0x3A, arg0, arg3, arg2, arg1);
        } else {
            class303.method2018(arg3, arg2, arg7, arg0, arg4, arg1, false, arg6);
        }
        if (arg5 != 0) {
            field4355 = 92;
        }
    }

    @OriginalMember(owner = "client!hg", name = "f", descriptor = "(I)V", line = 35)
    public static void method1985(int arg0) {
        field4351 = null;
        if (arg0 < -34) {
            field4360 = null;
        }
    }
}
