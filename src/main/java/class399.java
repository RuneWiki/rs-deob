import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vaa")
public class class399 {

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "Loca;")
    public static class221 field5689 = new class221(12, 0, 1, 0);

    @OriginalMember(owner = "client!vaa", name = "c", descriptor = "Ldm;")
    public static class46 field5691 = new class46();

    @OriginalMember(owner = "client!vaa", name = "b", descriptor = "I")
    public static int field5690;

    @OriginalMember(owner = "client!vaa", name = "d", descriptor = "I")
    public static int field5692;

    @OriginalMember(owner = "client!vaa", name = "e", descriptor = "I")
    public static int field5693;

    @OriginalMember(owner = "client!vaa", name = "f", descriptor = "I")
    public static int field5694;

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(B)V")
    public static final void method2386(byte arg0) {
        if (class285.field3931 < 0) {
            class300.field4096 = -1;
            class285.field3931 = 0;
            class315.field4241 = -1;
        }
        field5694++;
        if (class413.field5821 < class285.field3931) {
            class285.field3931 = class413.field5821;
            class315.field4241 = -1;
            class300.field4096 = -1;
        }
        if (class627.field9160 < 0) {
            class300.field4096 = -1;
            class627.field9160 = 0;
            class315.field4241 = -1;
        }
        if (arg0 < -60 && class627.field9160 > class413.field5839) {
            class627.field9160 = class413.field5839;
            class300.field4096 = -1;
            class315.field4241 = -1;
        }
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(I)V")
    public static void method2387(int arg0) {
        if (arg0 != 0) {
            field5693 = -125;
        }
        field5689 = null;
        field5691 = null;
    }

    @OriginalMember(owner = "client!vaa", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field5690++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!vaa", name = "b", descriptor = "(I)[Lml;")
    public static final class325[] method2388(int arg0) {
        if (arg0 == -1) {
            field5692++;
            return new class325[] { class302.field4122, class278.field3849, class132.field2111, class349.field4698, class646.field9388, class175.field2509, class315.field4240, class333.field4457, class189.field2684, class205.field2879, client.field3473, class206.field2903, class646.field9389, class298.field4078, class174.field2507 };
        } else {
            return null;
        }
    }
}
