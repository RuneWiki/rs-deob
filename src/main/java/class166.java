import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class166 {

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "I")
    public static int field3289 = 0;

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "I")
    public static int field3291;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "Lga;")
    public static class58 field3288;

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "Lga;")
    public static class58 field3290;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILga;B)Lnb;")
    public static final class120 method1030(int arg0, class58 arg1, byte arg2) {
        field3291++;
        if (class159.method1000(127, arg0, arg1)) {
            int var3 = -4 / ((arg2 + 29) / 61);
            return class184.method1186(true);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V")
    public static void method1031(int arg0) {
        field3290 = null;
        field3288 = null;
        if (arg0 < 115) {
            method1031(91);
        }
    }
}
