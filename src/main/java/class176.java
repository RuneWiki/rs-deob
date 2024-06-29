import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class176 {

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "Lsc;")
    public static class181 field3088 = class149.method967(255, "mapscene");

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "[I")
    public static int[] field3089 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!rj", name = "f", descriptor = "Lsc;")
    public static class181 field3092 = class149.method967(255, "logo");

    @OriginalMember(owner = "client!rj", name = "h", descriptor = "Lsc;")
    private static class181 field3094 = class149.method967(255, "Walk here");

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "Lsc;")
    public static class181 field3087 = field3094;

    @OriginalMember(owner = "client!rj", name = "e", descriptor = "I")
    public static int field3091;

    @OriginalMember(owner = "client!rj", name = "g", descriptor = "I")
    public static int field3093;

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "[I")
    public static int[] field3090;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(I)V")
    public static void method1176(int arg0) {
        if (arg0 != -7799) {
            method1176(45);
        }
        field3087 = null;
        field3094 = null;
        field3092 = null;
        field3090 = null;
        field3088 = null;
        field3089 = null;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(B)[Lpg;")
    public static final class69[] method1177(byte arg0) {
        class69[] var1 = new class69[class33.field535];
        field3093++;
        for (int var2 = 0; var2 < class33.field535; var2++) {
            var1[var2] = new class134(class219.field3777, class78.field1273, class220.field3782[var2], class23.field410[var2], class196.field3425[var2], class121.field1978[var2], class143.field2319[var2], class254.field4443);
        }
        class143.method919(16);
        if (arg0 != -56) {
            field3088 = null;
        }
        return var1;
    }
}
