import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class128 {

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "I")
    public static int field2028 = 0;

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "I")
    public static int field2029 = 0;

    @OriginalMember(owner = "client!ec", name = "h", descriptor = "I")
    public static int field2035 = 0;

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "I")
    public static int field2031;

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "I")
    public static int field2032;

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "I")
    public static int field2033;

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "I")
    public static int field2034;

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "[S")
    public static short[] field2030;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Le;B)V", line = 5)
    public static final void method950(class312 arg0, byte arg1) {
        field2032++;
        if (arg1 == -89 && class413.field6116 != class266.field4286 && class423.field6252 != null && class406.method2544(arg0, class266.field4286, 0)) {
            class413.field6116 = class266.field4286;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IB)V", line = 24)
    public static final void method951(int arg0, byte arg1) {
        field2031++;
        if (arg0 == -1 || !class302.field4780[arg0]) {
            return;
        }
        class173.field2883.method2770(arg0, (byte) 114);
        if (class203.field3266[arg0] == null) {
            return;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < class203.field3266[arg0].length; var3++) {
            if (class203.field3266[arg0][var3] != null) {
                if (class203.field3266[arg0][var3].field2707 == 2) {
                    var2 = false;
                } else {
                    class203.field3266[arg0][var3] = null;
                }
            }
        }
        if (var2) {
            class203.field3266[arg0] = null;
        }
        if (arg1 >= -48) {
            field2035 = -21;
        }
        class302.field4780[arg0] = false;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(BLmo;)V", line = 78)
    public static final void method952(byte arg0, class447 arg1) {
        class256.field4151 = arg1;
        int var2 = 24 % ((arg0 + 9) / 50);
        field2033++;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(II)V", line = 96)
    public static final void method953(int arg0, int arg1) {
        field2034++;
        if (class262.field4219 == arg1) {
            return;
        }
        if (class262.field4219 == 0) {
            class191.method1337(true);
        }
        if (arg0 != 16205) {
            return;
        }
        if (arg1 == 40) {
            class42.method281(-104);
        }
        if (arg1 != 40 && class68.field853 != null) {
            class68.field853.method1098((byte) 106);
            class68.field853 = null;
        }
        if (class262.field4219 == 25 || class262.field4219 == 28) {
            class220.field3636.field6510 = 2;
            class150.field2335.field6510 = 2;
            class132.field2058.field6510 = 2;
            class412.field6103.field6510 = 2;
            class56.field698.field6510 = 2;
            class321.field5002.field6510 = 2;
            class27.field309.field6510 = 2;
        }
        if (arg1 == 25 || arg1 == 28) {
            class63.field827 = 1;
            class322.field5031 = 0;
            class201.field3224 = 0;
            class32.field404 = 1;
            class239.field3975 = 0;
            class375.method2396(9712, true);
            class220.field3636.field6510 = 1;
            class150.field2335.field6510 = 1;
            class132.field2058.field6510 = 1;
            class412.field6103.field6510 = 1;
            class56.field698.field6510 = 1;
            class321.field5002.field6510 = 1;
            class27.field309.field6510 = 1;
        }
        if (arg1 == 25 || arg1 == 10) {
            class91.method543((byte) -127);
        }
        if (arg1 == 5) {
            class110.method815(class223.field3727, 17272, class284.field4547);
        } else {
            class326.method2164(1009);
        }
        boolean var2 = arg1 == 5 || arg1 == 10 || arg1 == 28;
        boolean var3 = class262.field4219 == 5 || class262.field4219 == 10 || class262.field4219 == 28;
        if (var3 != var2) {
            if (var2) {
                class160.field2533 = class36.field438;
                if (class232.field3867 == 0) {
                    class250.method1737((byte) 18, 2);
                } else {
                    class221.method1585(class125.field1930, class36.field438, (byte) -125, 255, 2, false, 0);
                }
                class298.field4739.method1840(128, false);
            } else {
                class250.method1737((byte) 18, 2);
                class298.field4739.method1840(128, true);
                if (class316.field4957 != null) {
                    class316.field4957.method1727(-19432);
                    class316.field4957 = null;
                }
            }
        }
        if (arg1 == 25 || arg1 == 28 || arg1 == 40) {
            class284.field4547.method661();
        }
        class262.field4219 = arg1;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)V", line = 201)
    public static void method954(byte arg0) {
        field2030 = null;
        int var1 = -22 / ((10 - arg0) / 54);
    }
}
