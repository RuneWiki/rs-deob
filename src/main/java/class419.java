import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class419 implements class385 {

    @OriginalMember(owner = "client!a", name = "a", descriptor = "[Laq;")
    public static class106[] field6200 = new class106[6];

    @OriginalMember(owner = "client!a", name = "b", descriptor = "I")
    public static int field6201;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IJLak;[I)Ljava/lang/String;")
    public final String method2319(int arg0, long arg1, class222 arg2, int[] arg3) {
        field6201++;
        if (class144.field1866 == arg2) {
            class87 var6 = class413.field6132.method2969((byte) -74, arg3[0]);
            return var6.method550((int) arg1, false);
        } else if (class310.field4517 == arg2 || class6.field97 == arg2) {
            class361 var7 = class405.field5947.method1162((int) arg1, 0);
            return var7.field5353;
        } else if (class293.field4178 == arg2 || class38.field581 == arg2 || class226.field3186 == arg2) {
            return class413.field6132.method2969((byte) -74, arg3[0]).method550((int) arg1, false);
        } else if (arg0 == -15965) {
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(B)V")
    public static void method2486(byte arg0) {
        if (arg0 < 123) {
            method2486((byte) -53);
        }
        field6200 = null;
    }
}
