import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class36 {

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "Lrc;")
    private static class105 field826 = class43.method374("Members object", 0);

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "Lrc;")
    public static class105 field827 = field826;

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "I")
    public static int field831 = 0;

    @OriginalMember(owner = "client!fe", name = "h", descriptor = "I")
    public static int field833 = 0;

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "I")
    public static int field829 = 0;

    @OriginalMember(owner = "client!fe", name = "i", descriptor = "[J")
    public static long[] field834 = new long[32];

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "I")
    public static int field830;

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "I")
    public static int field832;

    @OriginalMember(owner = "client!fe", name = "j", descriptor = "I")
    public static int field835;

    @OriginalMember(owner = "client!fe", name = "k", descriptor = "I")
    public static int field836;

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "Lpb;")
    public static class92 field828;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIII)I", line = 7)
    public static final int method334(int arg0, int arg1, int arg2, int arg3) {
        field832++;
        int var4 = arg0 & 0x3;
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return 7 - arg2;
        } else if (var4 == 2) {
            return 7 - arg1;
        } else {
            if (arg3 != -28294) {
                method336(14);
            }
            return arg2;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V", line = 35)
    public static final void method335(int arg0) {
        client.field436.method323(0);
        field830++;
        int var1 = 87 % ((44 - arg0) / 48);
        class100.field2283 = class38.method355(class100.field2283);
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(I)V", line = 47)
    public static void method336(int arg0) {
        field826 = null;
        field828 = null;
        if (arg0 < 35) {
            field826 = null;
        }
        field827 = null;
        field834 = null;
    }

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "(I)V", line = 91)
    public static final void method337(int arg0) {
        int var1 = -29 / ((arg0 - 51) / 53);
        field836++;
        class61.field1354.method602((byte) -70);
        class55.field1099.method602((byte) -70);
    }
}
