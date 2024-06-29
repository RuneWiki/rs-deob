import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class246 {

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "I")
    public static int field3330 = 0;

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "Ljava/lang/String;")
    public static String field3329 = "Loading title screen - ";

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "Ljava/lang/String;")
    public static String field3332 = " has logged out.";

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "I")
    public static int field3328;

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "I")
    public static int field3331;

    @OriginalMember(owner = "client!ni", name = "f", descriptor = "I")
    public static int field3333;

    @OriginalMember(owner = "client!ni", name = "g", descriptor = "I")
    public static int field3334;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Z)V", line = 7)
    public static final void method1314(boolean arg0) {
        class29.field276.method613(arg0);
        field3331++;
        class189.field2388.method613(arg0);
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(ILfd;II)V", line = 18)
    public static final void method1315(int arg0, class194 arg1, int arg2, int arg3) {
        field3334++;
        class175 var4 = arg1.method1043(class88.field1003, (byte) -84);
        if (var4 == null || arg2 < 117) {
            return;
        }
        class88.field1003.method1648(arg3, arg0, arg3 + arg1.field2501, arg1.field2460 + arg0);
        if (class32.field312 >= 3) {
            class88.field1003.method1566(-16777216, var4, arg3, arg0);
        } else {
            class411.field5943.method94((float) arg1.field2501 / 2.0F + (float) arg3, (float) arg1.field2460 / 2.0F + (float) arg0, 4096, ((int) (-class425.field6241) & 0x3FFF) << 2, var4, arg3, arg0);
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)V", line = 43)
    public static void method1316(int arg0) {
        if (arg0 != 1559091650) {
            method1315(8, (class194) null, 7, 24);
        }
        field3332 = null;
        field3329 = null;
    }
}
