import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class41 extends class82 {

    @OriginalMember(owner = "client!dg", name = "S", descriptor = "Lri;")
    public static class189 field771 = new class189(64);

    @OriginalMember(owner = "client!dg", name = "T", descriptor = "Ldj;")
    private static class44 field772 = class89.method650(255, "Examine");

    @OriginalMember(owner = "client!dg", name = "U", descriptor = "I")
    public static int field773 = -1;

    @OriginalMember(owner = "client!dg", name = "W", descriptor = "Ldj;")
    public static class44 field775 = class89.method650(255, "Lade Konfiguration )2 ");

    @OriginalMember(owner = "client!dg", name = "X", descriptor = "Ldj;")
    public static class44 field776 = field772;

    @OriginalMember(owner = "client!dg", name = "V", descriptor = "Ldj;")
    public static class44 field774 = class89.method650(255, "blinken2:");

    @OriginalMember(owner = "client!dg", name = "P", descriptor = "I")
    public static int field768;

    @OriginalMember(owner = "client!dg", name = "Q", descriptor = "I")
    public static int field769;

    @OriginalMember(owner = "client!dg", name = "R", descriptor = "I")
    public static int field770;

    @OriginalMember(owner = "client!dg", name = "g", descriptor = "(I)V")
    public static void method283(int arg0) {
        field775 = null;
        field776 = null;
        field771 = null;
        if (arg0 != -3) {
            method284((byte) 71, 122, 86, 107, -98, -31, -64);
        }
        field774 = null;
        field772 = null;
    }

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "()V")
    public class41() {
        super(0, true);
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(II)[I")
    public final int[] method3(int arg0, int arg1) {
        field770++;
        if (arg0 != 25238) {
            field774 = null;
        }
        return class49.field912;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(BIIIIII)V")
    public static final void method284(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class97[] var7 = class61.field1132;
        int var8 = 0;
        int var9 = -78 / ((arg0 + 28) / 32);
        while (var8 < var7.length) {
            class97 var10 = var7[var8];
            if (var10 != null && var10.field1795 == 2) {
                class168.method1066((var10.field1798 - class222.field4020 << 7) + var10.field1796, var10.field1791 * 2, arg2, arg3 >> 1, arg1 >> 1, arg6, (var10.field1790 - class143.field2550 << 7) + var10.field1786, -57);
                if (class119.field2124 > -1 && class46.field868 % 20 < 10) {
                    class154.field2676[var10.field1787].method1010(class119.field2124 + arg4 - 12, arg5 + -28 + class83.field1626);
                }
            }
            var8++;
        }
        field769++;
    }
}
