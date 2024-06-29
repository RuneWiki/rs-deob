import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class201 extends class54 {

    @OriginalMember(owner = "client!se", name = "u", descriptor = "Z")
    public boolean field3752 = false;

    @OriginalMember(owner = "client!se", name = "r", descriptor = "I")
    public static int field3749 = 0;

    @OriginalMember(owner = "client!se", name = "w", descriptor = "Ldc;")
    public static class37 field3754 = class185.method1233((byte) 86, "hint_mapedge");

    @OriginalMember(owner = "client!se", name = "o", descriptor = "I")
    public int field3746;

    @OriginalMember(owner = "client!se", name = "p", descriptor = "I")
    public static int field3747;

    @OriginalMember(owner = "client!se", name = "q", descriptor = "I")
    public static int field3748;

    @OriginalMember(owner = "client!se", name = "t", descriptor = "I")
    public int field3751;

    @OriginalMember(owner = "client!se", name = "v", descriptor = "Lrb;")
    public static class187 field3753;

    @OriginalMember(owner = "client!se", name = "s", descriptor = "[Lji;")
    public static class106[] field3750;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(ILwb;)V")
    public static final void method1329(int arg0, class239 arg1) {
        field3747++;
        if (arg0 < 22) {
            method1331(-38);
        }
        class149.field2816 = arg1;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lwa;IZ)Ljc;")
    public static final class100 method1330(class238 arg0, int arg1, boolean arg2) {
        if (!arg2) {
            method1330(null, -51, false);
        }
        field3748++;
        return class128.method906(arg0, arg1, 3) ? class19.method131((byte) -69) : null;
    }

    @OriginalMember(owner = "client!se", name = "c", descriptor = "(I)V")
    public static void method1331(int arg0) {
        int var1 = 57 % ((55 - arg0) / 58);
        field3753 = null;
        field3754 = null;
        field3750 = null;
    }
}
