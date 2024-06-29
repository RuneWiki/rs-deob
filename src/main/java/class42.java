import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public class class42 {

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "I")
    public static int field516 = 0;

    @OriginalMember(owner = "client!nr", name = "e", descriptor = "I")
    public static int field519 = 0;

    @OriginalMember(owner = "client!nr", name = "d", descriptor = "Ljk;")
    public static class449 field518 = new class449(8);

    @OriginalMember(owner = "client!nr", name = "f", descriptor = "F")
    public static float field520;

    @OriginalMember(owner = "client!nr", name = "c", descriptor = "I")
    public static int field517;

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "Lqn;")
    public static class47 field515;

    @OriginalMember(owner = "client!nr", name = "h", descriptor = "[Lhd;")
    public static class523[] field522;

    @OriginalMember(owner = "client!nr", name = "g", descriptor = "[[B")
    public static byte[][] field521;

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(II)Z")
    public static final boolean method383(int arg0, int arg1) {
        int var2 = -62 / ((-arg0 - 63) / 49);
        field517++;
        return arg1 >= 4 && arg1 <= 8;
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(B)V")
    public static void method384(byte arg0) {
        field522 = null;
        field521 = null;
        field518 = null;
        if (arg0 != 97) {
            method383(-44, 99);
        }
        field515 = null;
    }
}
