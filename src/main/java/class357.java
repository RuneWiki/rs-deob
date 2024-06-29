import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mba")
public abstract class class357 {

    @OriginalMember(owner = "client!mba", name = "b", descriptor = "[[B")
    public static byte[][] field4863 = new byte[1000][];

    @OriginalMember(owner = "client!mba", name = "c", descriptor = "Lada;")
    public static class144 field4864 = new class144(102, 6);

    @OriginalMember(owner = "client!mba", name = "d", descriptor = "Lh;")
    public static class572 field4865 = new class572("Loaded JAGMISC", "JAGMISC geladen", "JAGMISC chargé", "JAGMISC carregado");

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "I")
    public static int field4862;

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(I)V", line = 12)
    public static final void method2153(int arg0) {
        field4862++;
        class317.field4370.method846(arg0 - 1000);
        class496.field7054.method846(arg0 ^ arg0);
        class111.field1575.method846(0);
        class304.field4183.method846(0);
        class145.field2027.method846(0);
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(B)V", line = 25)
    public static void method2154(byte arg0) {
        if (arg0 != -29) {
            field4864 = null;
        }
        field4865 = null;
        field4864 = null;
        field4863 = null;
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "([FIFIIIIZFFF)V")
    public abstract void method2152(float[] arg0, int arg1, float arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, float arg8, float arg9, float arg10);
}
