import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class142 {

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "Lsd;")
    private static class166 field2761 = class135.method935("Loading textures )2 ", 0);

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "Lsd;")
    public static class166 field2762 = class135.method935("<br>(X", 0);

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "I")
    public static int field2763 = 0;

    @OriginalMember(owner = "client!pg", name = "g", descriptor = "Lsd;")
    public static class166 field2767 = field2761;

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "Lb;")
    public static class11 field2765 = new class11(100);

    @OriginalMember(owner = "client!pg", name = "f", descriptor = "I")
    public static int field2766;

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "Lcb;")
    public static class22 field2764;

    @OriginalMember(owner = "client!pg", name = "h", descriptor = "Lf;")
    public static class47 field2768;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(B)V")
    public static void method974(byte arg0) {
        field2764 = null;
        field2768 = null;
        field2767 = null;
        field2761 = null;
        if (arg0 <= -16) {
            field2765 = null;
            field2762 = null;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(III)I")
    public static final int method975(int arg0, int arg1, int arg2) {
        field2766++;
        if (arg1 != 100) {
            field2764 = null;
        }
        int var3 = 0;
        while (arg0 > 0) {
            arg0--;
            var3 = var3 << 1 | arg2 & 0x1;
            arg2 >>>= 0x1;
        }
        return var3;
    }
}
