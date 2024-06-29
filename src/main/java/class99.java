import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class99 {

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "I")
    public static int field1295 = 0;

    @OriginalMember(owner = "client!wk", name = "e", descriptor = "I")
    public static volatile int field1299 = 0;

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "Ljava/util/Calendar;")
    public static Calendar field1297 = Calendar.getInstance();

    @OriginalMember(owner = "client!wk", name = "g", descriptor = "Ljava/lang/String;")
    public static String field1301 = null;

    @OriginalMember(owner = "client!wk", name = "f", descriptor = "I")
    public static int field1300 = -1;

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "I")
    public static int field1296;

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "I")
    public static int field1298;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)V", line = 9)
    public static final void method709(int arg0) {
        class169.field2356 = (byte[][][]) null;
        class178.field2439 = (byte[][][]) null;
        class195.field2692 = (int[][][]) null;
        if (arg0 != 1) {
            method709(-31);
        }
        class83.field1070 = null;
        class299.field4396 = null;
        class55.field710 = (byte[][][]) null;
        class352.field5500 = (byte[][][]) null;
        class263.field3827 = (byte[][][]) null;
        class29.field329 = null;
        class177.field2428 = null;
        class270.field3880 = null;
        field1296++;
        class218.field3076 = null;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(B)V", line = 32)
    public static void method710(byte arg0) {
        field1301 = null;
        field1297 = null;
        if (arg0 < 107) {
            method709(44);
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lf;III)V", line = 53)
    public static final void method711(class239 arg0, int arg1, int arg2, int arg3) {
        if (arg0.field4899 == arg1 && arg1 != -1) {
            class314 var4 = class207.method1516(arg1, 124);
            int var5 = var4.field4626;
            if (var5 == 1) {
                arg0.field4885 = arg2;
                arg0.field4850 = 0;
                arg0.field4940 = 0;
                arg0.field4906 = 1;
                arg0.field4891 = 0;
                class296.method2025(var4, arg0.field4893, arg0.field4855, arg0.field4850, class359.field5616 == arg0, false);
            }
            if (var5 == 2) {
                arg0.field4891 = 0;
            }
        } else if (arg1 == -1 || arg0.field4899 == -1 || class207.method1516(arg1, arg3 ^ 0xFFFFFF84).field4638 >= class207.method1516(arg0.field4899, 118).field4638) {
            arg0.field4899 = arg1;
            arg0.field4940 = 0;
            arg0.field4885 = arg2;
            arg0.field4850 = 0;
            arg0.field4906 = 1;
            arg0.field4891 = 0;
            arg0.field4925 = arg0.field4845;
            if (arg0.field4899 != -1) {
                class296.method2025(class207.method1516(arg0.field4899, 119), arg0.field4893, arg0.field4855, arg0.field4850, class359.field5616 == arg0, false);
            }
        }
        field1298++;
        if (arg3 != -1) {
            method711((class239) null, 78, -82, -118);
        }
    }
}
