import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public class class353 {

    @OriginalMember(owner = "client!nn", name = "c", descriptor = "[I")
    public static int[] field5027 = new int[50];

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "I")
    public static int field5025;

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "Lkea;")
    public static class203 field5026;

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(B)V")
    public static void method2234(byte arg0) {
        field5026 = null;
        field5027 = null;
        if (arg0 < 11) {
            field5027 = null;
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(II)V")
    public static final void method2235(int arg0, int arg1) {
        field5025++;
        if (class133.field1673 == arg0) {
            return;
        }
        if (class133.field1673 == 0) {
            class456.method2817(-86);
        }
        if (arg0 == 12) {
            if (class19.field195 == null) {
                class570.method3313(class414.field6279, arg1 ^ 0xF3F56B20, class111.field1363, class498.field7259);
            } else {
                class619.method3560(class414.field6279, 2);
            }
        }
        if (arg0 != 12 && class34.field387 != null) {
            class34.field387.method1841(-81);
            class34.field387 = null;
        }
        if (arg0 == 2) {
            class339.method2184(class518.field7542 != class512.field7479, (byte) 40);
        }
        if (arg0 == 6) {
            class130.method803((byte) -100, class518.field7542 != class256.field3659);
        }
        if (arg0 == 4) {
            if (class19.field195 == null) {
                class626.method3592(class111.field1363, class498.field7259, 10173);
            } else {
                class251.method1652(true);
            }
        } else if (arg0 == 5) {
            if (class19.field195 == null) {
                class570.method3313(class414.field6279, -202020063, class111.field1363, class498.field7259);
            } else {
                class619.method3560(class414.field6279, 2);
            }
        } else if (arg0 == 8) {
            if (class19.field195 == null) {
                class570.method3313(class414.field6279, -202020063, class111.field1363, class498.field7259);
            } else {
                class619.method3560(class414.field6279, 2);
            }
        } else if (arg0 == 11) {
            if (class19.field195 == null) {
                class626.method3592(class111.field1363, class498.field7259, 10173);
            } else {
                class251.method1652(true);
            }
        }
        if (class348.method2222(0, class133.field1673)) {
            class195.field2652.field2708 = 2;
            class459.field6852.field2708 = 2;
            class434.field6438.field2708 = 2;
            class359.field5094.field2708 = 2;
            class345.field4942.field2708 = 2;
            class290.field4010.field2708 = 2;
            class345.field4945.field2708 = 2;
        }
        if (class348.method2222(0, arg0)) {
            class620.field8986 = 0;
            class517.field7525 = 1;
            class531.field7692 = 0;
            class97.field1141 = 0;
            class3.field22 = 1;
            class657.method3753(true, 108);
            class195.field2652.field2708 = 1;
            class459.field6852.field2708 = 1;
            class434.field6438.field2708 = 1;
            class359.field5094.field2708 = 1;
            class345.field4942.field2708 = 1;
            class290.field4010.field2708 = 1;
            class345.field4945.field2708 = 1;
        }
        if (arg0 == 10 || arg0 == 2) {
            class414.method2611(true);
        }
        if (arg0 == 1) {
            class427.method2669(-23264, class319.field4621, class413.field6264);
        } else {
            class441.method2743(false);
        }
        boolean var2 = arg0 == arg1 || class63.method444(arg0, (byte) -110) || class10.method56(arg0, arg1 + 3520);
        boolean var3 = class133.field1673 == 1 || class63.method444(class133.field1673, (byte) -81) || class10.method56(class133.field1673, 3521);
        if (var2 != var3) {
            if (var2) {
                class169.field2064 = class337.field4825;
                if (class595.field8694.field6518 == 0) {
                    class558.method3238(2, 16880);
                } else {
                    class633.method3616(class595.field8694.field6518, 0, (byte) 116, false, class337.field4825, 2, class150.field1846);
                }
                class564.field8033.method2758(false, (byte) -128);
            } else {
                class558.method3238(2, arg1 ^ 0x41F1);
                class564.field8033.method2758(true, (byte) -121);
            }
        }
        if (class348.method2222(0, arg0) || arg0 == 12) {
            class413.field6264.method317();
        }
        class133.field1673 = arg0;
    }
}
