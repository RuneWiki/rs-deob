import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class122 {

    @OriginalMember(owner = "client!ca", name = "h", descriptor = "Lha;")
    public static class46 field2272 = class271.method1828("(U3", -46);

    @OriginalMember(owner = "client!ca", name = "g", descriptor = "Lha;")
    public static class46 field2271 = class271.method1828("Nehmen", -46);

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "I")
    public static int field2265;

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "I")
    public int field2267;

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "I")
    public static int field2268;

    @OriginalMember(owner = "client!ca", name = "i", descriptor = "I")
    public static int field2273;

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "Lpi;")
    public static class181 field2266;

    @OriginalMember(owner = "client!ca", name = "j", descriptor = "Lfa;")
    public static class211 field2274;

    @OriginalMember(owner = "client!ca", name = "k", descriptor = "Lef;")
    public static class228 field2275;

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "Lha;")
    public class46 field2270;

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "[Lha;")
    public static class46[] field2269;

    @OriginalMember(owner = "client!ca", name = "l", descriptor = "[[Z")
    public static boolean[][] field2276;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(ILha;I)V")
    public static final void method960(int arg0, class46 arg1, int arg2) {
        field2265++;
        class146 var3 = class6.method22((byte) 16, 3, arg0);
        if (arg2 >= 50) {
            var3.method1088(11102);
            var3.field2642 = arg1;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(B)V")
    public static void method961(byte arg0) {
        field2266 = null;
        if (arg0 <= 40) {
            return;
        }
        field2274 = null;
        field2269 = null;
        field2272 = null;
        field2271 = null;
        field2276 = null;
        field2275 = null;
    }
}
