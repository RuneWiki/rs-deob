import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class72 extends class213 {

    @OriginalMember(owner = "client!hb", name = "r", descriptor = "I")
    public int field1440;

    @OriginalMember(owner = "client!hb", name = "u", descriptor = "I")
    public int field1443;

    @OriginalMember(owner = "client!hb", name = "q", descriptor = "Lob;")
    private static class141 field1439 = class175.method1195(40, "You are standing in a members)2only area)3");

    @OriginalMember(owner = "client!hb", name = "s", descriptor = "Lob;")
    public static class141 field1441 = field1439;

    @OriginalMember(owner = "client!hb", name = "x", descriptor = "Z")
    public static boolean field1446 = false;

    @OriginalMember(owner = "client!hb", name = "w", descriptor = "Lob;")
    public static class141 field1445 = class175.method1195(40, ":assistreq:");

    @OriginalMember(owner = "client!hb", name = "o", descriptor = "I")
    public static int field1437;

    @OriginalMember(owner = "client!hb", name = "p", descriptor = "I")
    public static int field1438;

    @OriginalMember(owner = "client!hb", name = "v", descriptor = "I")
    public static int field1444;

    @OriginalMember(owner = "client!hb", name = "t", descriptor = "Lg;")
    public static class61 field1442;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ZI)Z")
    public static final boolean method498(boolean arg0, int arg1) {
        if (!arg0) {
            field1446 = false;
        }
        field1444++;
        if (arg1 < 32) {
            return false;
        } else if (arg1 == 127) {
            return false;
        } else {
            return arg1 < 129 || arg1 > 159;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(B)V")
    public static void method499(byte arg0) {
        field1441 = null;
        field1442 = null;
        field1439 = null;
        field1445 = null;
        if (arg0 > -78) {
            field1446 = true;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lpe;ZLpe;)I")
    public static final int method500(class154 arg0, boolean arg1, class154 arg2) {
        field1438++;
        int var3 = 0;
        if (arg2.method1078(-99, class175.field3473)) {
            var3++;
        }
        if (arg0.method1078(-120, class187.field3629)) {
            var3++;
        }
        if (arg0.method1078(124, class54.field1048)) {
            var3++;
        }
        if (arg0.method1078(84, class43.field841)) {
            var3++;
        }
        if (!arg1) {
            method499((byte) 126);
        }
        if (arg0.method1078(-74, class169.field3261)) {
            var3++;
        }
        if (arg0.method1078(-92, class206.field3918)) {
            var3++;
        }
        arg0.method1078(57, class54.field1039);
        arg0.method1078(58, class142.field2754);
        arg0.method1078(67, class218.field4138);
        arg0.method1078(44, class128.field2444);
        arg0.method1078(-96, class128.field2443);
        return var3;
    }

    @OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(II)V")
    public class72(int arg0, int arg1) {
        this.field1440 = arg1;
        this.field1443 = arg0;
    }
}
