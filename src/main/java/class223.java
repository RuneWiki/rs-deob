import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class223 extends class160 {

    @OriginalMember(owner = "client!ce", name = "s", descriptor = "I")
    public static int field3571 = 0;

    @OriginalMember(owner = "client!ce", name = "q", descriptor = "I")
    public int field3569;

    @OriginalMember(owner = "client!ce", name = "u", descriptor = "I")
    public static int field3573;

    @OriginalMember(owner = "client!ce", name = "w", descriptor = "I")
    public static int field3575;

    @OriginalMember(owner = "client!ce", name = "x", descriptor = "I")
    public static int field3576;

    @OriginalMember(owner = "client!ce", name = "t", descriptor = "Lql;")
    public static class224 field3572;

    @OriginalMember(owner = "client!ce", name = "r", descriptor = "Ljava/lang/String;")
    public String field3570;

    @OriginalMember(owner = "client!ce", name = "v", descriptor = "Ljava/lang/String;")
    public String field3574;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(II)Lce;")
    public static final class223 method1596(int arg0, int arg1) {
        if (arg0 != -23578) {
            field3572 = null;
        }
        ++field3573;
        return class244.field3964 && class38.field541 <= arg1 && class78.field1135 >= arg1 ? class10.field104[arg1 - class38.field541] : null;
    }

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "(Z)V")
    public static void method1597(boolean arg0) {
        field3572 = null;
        if (!arg0) {
            method1597(true);
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)Lvh;")
    public final class282 method1598(byte arg0) {
        ++field3575;
        return arg0 >= -81 ? null : class133.field2190[super.field2611];
    }
}
