import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class88 {

    @OriginalMember(owner = "client!em", name = "h", descriptor = "Lke;")
    private static class256 field1582 = class316.method2202("Examine", 27626);

    @OriginalMember(owner = "client!em", name = "b", descriptor = "I")
    public static int field1576 = 0;

    @OriginalMember(owner = "client!em", name = "i", descriptor = "Lke;")
    public static class256 field1583 = class316.method2202("http:)4)4", 27626);

    @OriginalMember(owner = "client!em", name = "a", descriptor = "Lke;")
    public static class256 field1575 = field1582;

    @OriginalMember(owner = "client!em", name = "c", descriptor = "I")
    public static int field1577;

    @OriginalMember(owner = "client!em", name = "d", descriptor = "I")
    public static int field1578;

    @OriginalMember(owner = "client!em", name = "f", descriptor = "I")
    public static int field1580;

    @OriginalMember(owner = "client!em", name = "g", descriptor = "I")
    public static int field1581;

    @OriginalMember(owner = "client!em", name = "e", descriptor = "Lng;")
    public static class138 field1579;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(I)V", line = 7)
    public static void method650(int arg0) {
        field1575 = null;
        field1582 = null;
        int var1 = -79 / ((-arg0 - 67) / 45);
        field1583 = null;
        field1579 = null;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IB)V", line = 20)
    public static final void method651(int arg0, byte arg1) {
        field1578++;
        class77 var2 = class156.method1158(8, false, arg0);
        int var3 = -117 / ((-arg1 - 6) / 49);
        var2.method586((byte) 98);
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IILog;I)V", line = 50)
    public static final void method652(int arg0, int arg1, class279 arg2, int arg3) {
        if (arg0 != -10140) {
            field1579 = (class138) null;
        }
        if (arg2.field1202 == arg1 && arg1 != -1) {
            class117 var4 = class250.method1682(arg1, true);
            int var5 = var4.field2062;
            if (var5 == 1) {
                arg2.field1231 = 0;
                arg2.field1196 = arg3;
                arg2.field1214 = 0;
                arg2.field1189 = 0;
                class49.method391(arg2.field1192, false, arg2.field1197, arg2.field1231, var4, -11067);
            }
            if (var5 == 2) {
                arg2.field1189 = 0;
            }
        } else if (arg1 == -1 || arg2.field1202 == -1 || class250.method1682(arg1, true).field2048 >= class250.method1682(arg2.field1202, true).field2048) {
            arg2.field1219 = arg2.field1239;
            arg2.field1196 = arg3;
            arg2.field1189 = 0;
            arg2.field1231 = 0;
            arg2.field1202 = arg1;
            arg2.field1214 = 0;
            if (arg2.field1202 != -1) {
                class49.method391(arg2.field1192, false, arg2.field1197, arg2.field1231, class250.method1682(arg2.field1202, true), -11067);
            }
        }
        field1577++;
    }
}
