import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!is")
public class class469 {

    @OriginalMember(owner = "client!is", name = "c", descriptor = "Ljava/lang/String;")
    public static String field5798 = "";

    @OriginalMember(owner = "client!is", name = "d", descriptor = "I")
    public static int field5799 = 0;

    @OriginalMember(owner = "client!is", name = "e", descriptor = "I")
    public static int field5800;

    @OriginalMember(owner = "client!is", name = "a", descriptor = "Lsf;")
    public static class489 field5796;

    @OriginalMember(owner = "client!is", name = "b", descriptor = "[Lwda;")
    public static class597[] field5797;

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(I)V", line = 17)
    public static void method2557(int arg0) {
        field5798 = null;
        field5796 = null;
        field5797 = null;
        if (arg0 != 55) {
            field5796 = null;
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(ZLoa;)V", line = 32)
    public static final void method2558(boolean arg0, class650 arg1) {
        field5800++;
        if (!(class638.field8648 >= 2 || class37.field542) || class338.field4324 != null) {
            return;
        }
        String var2;
        if (class37.field542 && class638.field8648 < 2) {
            var2 = class467.field5794 + class671.field9146.method3726((byte) 79, class71.field912) + class351.field4540 + " ->";
        } else if (class272.field3438 && class307.field3884.method1592((byte) -120, 81) && class638.field8648 > 2) {
            var2 = class293.method1769((class501) class345.field4438.field4121.field3319.field3319, -21589);
        } else {
            class501 var3 = (class501) class345.field4438.field4121.field3319;
            var2 = class293.method1769(var3, -21589);
            int[] var4 = null;
            if (class534.method2880(-8897, var3.field6242)) {
                var4 = class504.field6287.method1628((int) var3.field6247, (byte) -90).field828;
            } else if (var3.field6250 != -1) {
                var4 = class504.field6287.method1628(var3.field6250, (byte) -122).field828;
            } else if (class453.method2489((byte) 104, var3.field6242)) {
                class704 var7 = (class704) class168.field1973.method3828((long) ((int) var3.field6247), (byte) -91);
                if (var7 != null) {
                    class506 var8 = var7.field9854;
                    class689 var9 = var8.field6326;
                    if (var9.field9546 != null) {
                        var9 = var9.method3812(class327.field4084, -126);
                    }
                    if (var9 != null) {
                        var4 = var9.field9516;
                    }
                }
            } else if (class245.method1473(var3.field6242, -118)) {
                Object var5 = null;
                class687 var6;
                if (var3.field6242 == 1011) {
                    var6 = class232.field3017.method2358(0, (int) var3.field6247);
                } else {
                    var6 = class232.field3017.method2358(0, (int) (var3.field6247 >>> 32 & 0x7FFFFFFFL));
                }
                if (var6.field9421 != null) {
                    var6 = var6.method3800(class327.field4084, (byte) -73);
                }
                if (var6 != null) {
                    var4 = var6.field9447;
                }
            }
            if (var4 != null) {
                var2 = var2 + class617.method3443(!arg0, var4);
            }
        }
        if (class638.field8648 > 2) {
            var2 = var2 + "<col=ffffff> / " + (class638.field8648 - 2) + class671.field9139.method3726((byte) 123, class71.field912);
        }
        if (class439.field5533 != null) {
            class201 var10 = class439.field5533.method1925(arg1, 45);
            if (var10 == null) {
                var10 = class336.field4143;
            }
            var10.method1174(class541.field6825, -16777216, class439.field5533.field4218, class306.field3871, class349.field4484, class455.field5686, class439.field5533.field4211, class448.field5646, class132.field1598, class439.field5533.field4317, class439.field5533.field4259, class653.field8907, class439.field5533.field4309, class439.field5533.field4184, var2);
            class434.method2390(class448.field5646[0], class448.field5646[2], class448.field5646[3], class448.field5646[1], (byte) -20);
        } else if (class228.field2941 != null && class540.field6812 == class341.field4353) {
            int var11 = class336.field4143.method1177(class502.field6256 + 4, class306.field3871, 125, class653.field8907, 0, var2, class541.field6825, class455.field5686, class576.field7412 + 16, 16777215);
            class434.method2390(class502.field6256 + 4, class36.field540.method127(var2, (byte) -69) + var11, 16, class576.field7412, (byte) -20);
        }
        if (!arg0) {
            method2558(true, null);
        }
    }
}
