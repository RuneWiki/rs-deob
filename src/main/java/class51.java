import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class51 extends class69 {

    @OriginalMember(owner = "client!lh", name = "p", descriptor = "I")
    public int field885;

    @OriginalMember(owner = "client!lh", name = "q", descriptor = "I")
    public int field886;

    @OriginalMember(owner = "client!lh", name = "n", descriptor = "Lej;")
    public static class188 field883 = new class188(16);

    @OriginalMember(owner = "client!lh", name = "r", descriptor = "Lha;")
    private static class46 field887 = class271.method1828("Connection lost)3", -46);

    @OriginalMember(owner = "client!lh", name = "s", descriptor = "I")
    public static int field888 = 0;

    @OriginalMember(owner = "client!lh", name = "t", descriptor = "I")
    public static int field889 = 0;

    @OriginalMember(owner = "client!lh", name = "u", descriptor = "I")
    public static int field890 = -1;

    @OriginalMember(owner = "client!lh", name = "w", descriptor = "Lha;")
    public static class46 field892 = field887;

    @OriginalMember(owner = "client!lh", name = "y", descriptor = "[I")
    public static int[] field894 = new int[100];

    @OriginalMember(owner = "client!lh", name = "x", descriptor = "Lge;")
    public static class235 field893 = new class235(512);

    @OriginalMember(owner = "client!lh", name = "o", descriptor = "I")
    public static int field884;

    @OriginalMember(owner = "client!lh", name = "v", descriptor = "Lhh;")
    public static class263 field891;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(II)I")
    public static int method376(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(II)V")
    public class51(int arg0, int arg1) {
        this.field885 = arg0;
        this.field886 = arg1;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Z)V")
    public static void method377(boolean arg0) {
        field892 = null;
        if (!arg0) {
            return;
        }
        field894 = null;
        field893 = null;
        field883 = null;
        field891 = null;
        field887 = null;
    }
}
