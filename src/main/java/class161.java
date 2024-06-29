import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ou")
public class class161 {

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "Lef;")
    public static class263 field2237 = new class263();

    @OriginalMember(owner = "client!ou", name = "b", descriptor = "I")
    public static int field2238;

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(II)I", line = 4)
    public static final int method998(int arg0, int arg1) {
        field2238++;
        int var2 = -19 % ((61 - arg0) / 58);
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(I)V", line = 23)
    public static void method999(int arg0) {
        if (arg0 <= 19) {
            field2237 = null;
        }
        field2237 = null;
    }
}
