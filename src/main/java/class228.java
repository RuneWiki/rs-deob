import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sr")
public class class228 extends class260 {

    @OriginalMember(owner = "client!sr", name = "t", descriptor = "I")
    public int field3172 = -1;

    @OriginalMember(owner = "client!sr", name = "p", descriptor = "F")
    public static float field3168 = 1024.0F;

    @OriginalMember(owner = "client!sr", name = "n", descriptor = "Lem;")
    public static class206 field3166 = new class206(34, 14);

    @OriginalMember(owner = "client!sr", name = "q", descriptor = "I")
    public static int field3169;

    @OriginalMember(owner = "client!sr", name = "r", descriptor = "I")
    public static int field3170;

    @OriginalMember(owner = "client!sr", name = "u", descriptor = "I")
    public int field3173;

    @OriginalMember(owner = "client!sr", name = "o", descriptor = "Ljava/lang/String;")
    public String field3167;

    @OriginalMember(owner = "client!sr", name = "s", descriptor = "Ljava/lang/String;")
    public String field3171;

    @OriginalMember(owner = "client!sr", name = "c", descriptor = "(B)Lke;")
    public final class555 method1446(byte arg0) {
        if (arg0 > -98) {
            return null;
        } else {
            ++field3169;
            return class412.field5844[super.field3536];
        }
    }

    @OriginalMember(owner = "client!sr", name = "d", descriptor = "(B)V")
    public static void method1447(byte arg0) {
        int var1 = -94 % ((-10 - arg0) / 35);
        field3166 = null;
    }

    @OriginalMember(owner = "client!sr", name = "d", descriptor = "(I)V")
    public static final void method1448(int arg0) {
        ++field3170;
        class48.field566.method3749(7648);
        if (arg0 < 12) {
            field3168 = -1.3186492F;
        }
    }
}
