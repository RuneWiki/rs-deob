import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class80 {

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "Ljava/lang/String;")
    public static String field1570 = "Close";

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "I")
    public static int field1573 = 127;

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "Le;")
    public static class342 field1569 = new class342(64);

    @OriginalMember(owner = "client!wd", name = "i", descriptor = "Ljava/lang/String;")
    public static String field1576 = " from your ignore list first.";

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "I")
    public static int field1568;

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "I")
    public static int field1571;

    @OriginalMember(owner = "client!wd", name = "h", descriptor = "I")
    public static int field1575;

    @OriginalMember(owner = "client!wd", name = "g", descriptor = "Lbm;")
    public static class307 field1574;

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "[I")
    public static int[] field1572;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)V", line = 6)
    public static final void method581(int arg0) {
        if (arg0 == 64) {
            class21.field449 = new class39(32);
            field1571++;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IBI)V", line = 24)
    public static final void method582(int arg0, byte arg1, int arg2) {
        field1575++;
        class2 var3 = class212.method1433(arg2, 13, -13802);
        var3.method13((byte) -1);
        if (arg1 != 24) {
            method581(-34);
        }
        var3.field39 = arg0;
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(I)V", line = 39)
    public static void method583(int arg0) {
        field1572 = null;
        field1576 = null;
        field1570 = null;
        if (arg0 != -21380) {
            field1574 = (class307) null;
        }
        field1569 = null;
        field1574 = null;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ZZIILbm;II)V", line = 61)
    public static final void method584(boolean arg0, boolean arg1, int arg2, int arg3, class307 arg4, int arg5, int arg6) {
        class204.field3340 = arg6;
        class177.field2846 = arg5;
        class147.field2402 = arg4;
        class18.field327 = 1;
        class112.field1976 = arg3;
        class291.field4472 = arg0;
        class38.field731 = arg2;
        field1568++;
        if (arg1) {
            method584(false, true, 83, 21, (class307) null, 90, 52);
        }
    }
}
