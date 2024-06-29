import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!er")
public class class3 {

    @OriginalMember(owner = "client!er", name = "e", descriptor = "I")
    public static int field26 = 0;

    @OriginalMember(owner = "client!er", name = "a", descriptor = "I")
    public static int field22;

    @OriginalMember(owner = "client!er", name = "b", descriptor = "I")
    public static int field23;

    @OriginalMember(owner = "client!er", name = "c", descriptor = "I")
    public static int field24;

    @OriginalMember(owner = "client!er", name = "d", descriptor = "I")
    public static int field25;

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(ZILpo;)V", line = 3)
    public static final void method13(boolean arg0, int arg1, class342 arg2) {
        field22++;
        if (class220.field2728) {
            arg1 = 0;
            class220.field2728 = false;
        }
        if (class307.field4109 == null || !class307.field4109.method2187((byte) -127, arg2)) {
            class307.field4109 = arg2;
            class52.field614 = class164.method1038(8635);
            class272.field3505 = arg1;
            class218.field2692 = arg1;
            if (class218.field2692 == 0) {
                class76.method456((byte) -107);
            } else {
                class139.field1609 = class139.field1594;
                class137.field1563 = class49.field575;
                class214.field2641 = class437.field5977;
                class143.field1685 = class439.field6035;
                class209.field2543 = class204.field2434;
                class269.field3474 = class277.field3590;
                class347.field4705 = class444.field6133;
                class279.field3616 = class115.field1329;
                class447.field6262 = class156.field1826;
                class263.field3380 = class138.field1577;
            }
        }
        if (arg0) {
            method13(false, 66, (class342) null);
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(Lol;Z)Z", line = 49)
    public static final boolean method14(class171 arg0, boolean arg1) {
        if (!arg1) {
            field26 = 103;
        }
        field23++;
        class446 var2 = class380.method2361(arg0.method409(-50), -29012);
        if (var2.field6224 == -1) {
            return true;
        } else {
            class66 var3 = class236.method1518(var2.field6224, 34);
            return var3.field794 == -1 ? true : var3.method385(false);
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lpq;", line = 79)
    public static final class46 method15(Throwable arg0, String arg1) {
        field24++;
        class46 var2;
        if (arg0 instanceof class46) {
            var2 = (class46) arg0;
            var2.field527 = var2.field527 + ' ' + arg1;
        } else {
            var2 = new class46(arg0, arg1);
        }
        return var2;
    }
}
