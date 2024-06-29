import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public abstract class class291 {

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "Lnca;")
    public static class627 field4014 = new class627("WIP", 2);

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "[[B")
    public static byte[][] field4015 = new byte[250][];

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "I")
    public static int field4016;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)V")
    public static void method1832(int arg0) {
        if (arg0 != 25662) {
            field4014 = null;
        }
        field4014 = null;
        field4015 = null;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IFIIF[FIIIFF)V")
    public abstract void method1833(int arg0, float arg1, int arg2, int arg3, float arg4, float[] arg5, int arg6, int arg7, int arg8, float arg9, float arg10);
}
