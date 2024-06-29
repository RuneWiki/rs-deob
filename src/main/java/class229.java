import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public class class229 {

    @OriginalMember(owner = "client!dn", name = "e", descriptor = "I")
    public static int field3495 = 0;

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "Ljava/lang/String;")
    public static String field3492 = "wishes to trade with you.";

    @OriginalMember(owner = "client!dn", name = "f", descriptor = "Z")
    public static volatile boolean field3496 = false;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "I")
    public static int field3491;

    @OriginalMember(owner = "client!dn", name = "c", descriptor = "I")
    public static int field3493;

    @OriginalMember(owner = "client!dn", name = "d", descriptor = "I")
    public static int field3494;

    @OriginalMember(owner = "client!dn", name = "g", descriptor = "I")
    public static int field3497;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(BIILmn;)V", line = 15)
    public static final void method1616(byte arg0, int arg1, int arg2, class161 arg3) {
        field3493++;
        if (arg0 >= -11) {
            method1617(false);
        }
        if (class296.field4572 != null || class330.field5089 || arg3 == null || class167.method1269(arg3, 0) == null) {
            return;
        }
        class296.field4572 = arg3;
        class153.field2324 = class167.method1269(arg3, 0);
        class204.field3120 = arg2;
        class284.field4424 = false;
        class331.field5106 = arg1;
        class82.field1208 = 0;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(Z)V", line = 54)
    public static void method1617(boolean arg0) {
        if (!arg0) {
            method1618(-56);
        }
        field3492 = null;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(I)I", line = 64)
    public static final int method1618(int arg0) {
        field3491++;
        int var1 = 115 / ((arg0 - 74) / 37);
        if (class132.field2022) {
            return 0;
        } else if (class110.method841((byte) 88)) {
            return class322.field4976 ? 2 : 1;
        } else {
            return 1;
        }
    }
}
