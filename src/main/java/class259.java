import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class259 {

    @OriginalMember(owner = "client!fa", name = "g", descriptor = "Ljava/lang/String;")
    public static String field4149 = "Connected to update server";

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "I")
    public static int field4143;

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "I")
    public static int field4144;

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "I")
    public static int field4145;

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "I")
    public static int field4146;

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "I")
    public static int field4147;

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "I")
    public static int field4148;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lak;B)V", line = 6)
    public static final void method1852(class172 arg0, byte arg1) {
        field4145++;
        if (arg1 < 68) {
            method1852((class172) null, (byte) -21);
        }
        class38.field489 = arg0;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIIII)V", line = 19)
    public static final void method1853(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4148++;
        if (arg1 != 8598) {
            method1853(-64, 33, -31, -20, -31);
        }
        if (arg2 >= class336.field5249 && class191.field3131 >= arg2) {
            int var5 = class33.method178(class279.field4497, class98.field1410, arg3, arg1 - 8569);
            int var6 = class33.method178(class279.field4497, class98.field1410, arg4, 58);
            class155.method1110(5, arg2, var5, var6, arg0);
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(B)V", line = 47)
    public static void method1854(byte arg0) {
        field4149 = null;
        if (arg0 != 54) {
            field4149 = (String) null;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Log;B)Log;", line = 59)
    public static final class157 method1855(class157 arg0, byte arg1) {
        if (arg1 != -111) {
            field4143 = -88;
        }
        field4146++;
        class157 var2 = client.method769(arg0);
        if (var2 == null) {
            var2 = arg0.field2530;
        }
        return var2;
    }
}
