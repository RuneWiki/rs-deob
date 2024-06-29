import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public class class635 {

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "Lmc;")
    public static class384 field9257;

    @OriginalMember(owner = "client!gn", name = "c", descriptor = "[S")
    public static short[] field9259;

    @OriginalMember(owner = "client!gn", name = "d", descriptor = "I")
    public static int field9260;

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "Ldda;")
    public static class597 field9258;

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(I)V")
    public static void method3686(int arg0) {
        field9259 = null;
        if (arg0 != 9104) {
            field9258 = null;
        }
        field9258 = null;
        field9257 = null;
    }

    static {
        new class487("You can't reach that.", "Da kommst du nicht hin.", "Vous ne pouvez pas l'atteindre.", "Você não consegue alcançar isso.");
        field9257 = new class384();
        field9259 = new short[] { -10304, 9104, -1, -1, -1 };
    }
}
