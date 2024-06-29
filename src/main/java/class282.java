import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class class282 {

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "I")
    public int field3863;

    @OriginalMember(owner = "client!rm", name = "f", descriptor = "I")
    public static int field3866 = 500;

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "I")
    public static int field3862;

    @OriginalMember(owner = "client!rm", name = "d", descriptor = "I")
    public static int field3864;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "Lod;")
    public static class349 field3861;

    @OriginalMember(owner = "client!rm", name = "e", descriptor = "[S")
    public static short[] field3865;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(I)[Lkl;", line = 4)
    public static final class55[] method1676(int arg0) {
        if (arg0 != -21924) {
            method1677(-124);
        }
        field3864++;
        return new class55[] { class372.field5457, class303.field4153, class260.field3619, class27.field356, class252.field3488, class24.field318, class85.field1264, class484.field7072, class413.field6027, class525.field7764, class416.field6046, class465.field6829, class464.field6820, class107.field1595 };
    }

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "(I)V", line = 19)
    public static void method1677(int arg0) {
        field3861 = null;
        if (arg0 >= -42) {
            field3866 = 98;
        }
        field3865 = null;
    }

    @OriginalMember(owner = "client!rm", name = "toString", descriptor = "()Ljava/lang/String;", line = 30)
    public final String toString() {
        field3862++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!rm", name = "<init>", descriptor = "(I)V", line = 37)
    public class282(int arg0) {
        this.field3863 = arg0;
    }
}
