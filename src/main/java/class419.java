import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class419 {

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "F")
    public static float field6381 = 1.0F;

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "[I")
    public static int[] field6382;

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "I")
    public static int field6383;

    @OriginalMember(owner = "client!pm", name = "d", descriptor = "I")
    public static int field6384;

    static {
        new class446("System update in: ", "System-Update in: ", "Mise à jour système dans : ", "Atualização do sistema em: ");
        field6382 = new int[4096];
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(III)V", line = 11)
    public static final void method2559(int arg0, int arg1, int arg2) {
        field6384++;
        class376.field5712 = arg1 - class12.field247;
        if (arg2 != 27347) {
            method2559(125, -79, -77);
        }
        class291.field4259 = arg0 - class12.field245;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(I)V", line = 23)
    public static void method2560(int arg0) {
        if (arg0 == -31800) {
            field6382 = null;
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(ZIIIIII)Llo;", line = 43)
    public static final class539 method2561(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field6383++;
        long var7 = (long) arg3 * 475427L ^ (long) arg4 * 67481L ^ (long) arg2 * 97549L ^ (long) arg6 * 986053L ^ (long) arg1 * 32147369L ^ (long) arg5 * 76724863L;
        class539 var9 = (class539) class224.field3112.method2133(var7, (byte) 113);
        if (var9 == null) {
            class539 var10 = class456.field6845.method746(arg4, arg2, arg3, arg6, arg1, arg5);
            class224.field3112.method2131(var10, var7, arg0);
            return var10;
        } else {
            return var9;
        }
    }
}
