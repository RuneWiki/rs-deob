import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aga")
public class class665 {

    @OriginalMember(owner = "client!aga", name = "b", descriptor = "I")
    public static int field9067;

    @OriginalMember(owner = "client!aga", name = "c", descriptor = "I")
    public static int field9068;

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "Ld;")
    public static class149 field9066;

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(I)V", line = 4)
    public static final void method3635(int arg0) {
        field9067++;
        class243.field3248 = new class315(arg0);
        class273.field3894 = 0;
        for (class537 var1 = (class537) class98.field1184.method2301(-31182); var1 != null; var1 = (class537) class98.field1184.method2310(96)) {
            var1.method3121();
        }
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(B)V", line = 25)
    public static void method3636(byte arg0) {
        field9066 = null;
        if (arg0 != -121) {
            method3635(106);
        }
    }

    @OriginalMember(owner = "client!aga", name = "b", descriptor = "(I)[Lqg;", line = 36)
    public static final class462[] method3637(int arg0) {
        field9068++;
        if (arg0 != 0) {
            method3637(-8);
        }
        return new class462[] { class95.field1114, class95.field1116, class95.field1117, class95.field1118, class95.field1119, class95.field1120, class95.field1121, class95.field1122, class95.field1123, class95.field1124, class95.field1125, class95.field1126, class95.field1127, class95.field1128 };
    }
}
