import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jr")
public class class74 {

    @OriginalMember(owner = "client!jr", name = "p", descriptor = "Z")
    public static boolean field1061 = false;

    @OriginalMember(owner = "client!jr", name = "d", descriptor = "[Z")
    public static boolean[] field1049 = new boolean[100];

    @OriginalMember(owner = "client!jr", name = "s", descriptor = "Ltr;")
    public static class195 field1064 = new class195(11, 16);

    @OriginalMember(owner = "client!jr", name = "y", descriptor = "I")
    public static int field1070 = -1;

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "I")
    public int field1046;

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "I")
    public int field1047;

    @OriginalMember(owner = "client!jr", name = "c", descriptor = "I")
    public int field1048;

    @OriginalMember(owner = "client!jr", name = "e", descriptor = "I")
    public static int field1050;

    @OriginalMember(owner = "client!jr", name = "f", descriptor = "I")
    public int field1051;

    @OriginalMember(owner = "client!jr", name = "g", descriptor = "I")
    public static int field1052;

    @OriginalMember(owner = "client!jr", name = "h", descriptor = "I")
    public int field1053;

    @OriginalMember(owner = "client!jr", name = "i", descriptor = "I")
    public int field1054;

    @OriginalMember(owner = "client!jr", name = "j", descriptor = "I")
    public int field1055;

    @OriginalMember(owner = "client!jr", name = "k", descriptor = "I")
    public int field1056;

    @OriginalMember(owner = "client!jr", name = "l", descriptor = "I")
    public int field1057;

    @OriginalMember(owner = "client!jr", name = "m", descriptor = "I")
    public int field1058;

    @OriginalMember(owner = "client!jr", name = "n", descriptor = "I")
    public int field1059;

    @OriginalMember(owner = "client!jr", name = "o", descriptor = "I")
    public int field1060;

    @OriginalMember(owner = "client!jr", name = "q", descriptor = "I")
    public int field1062;

    @OriginalMember(owner = "client!jr", name = "r", descriptor = "I")
    public int field1063;

    @OriginalMember(owner = "client!jr", name = "t", descriptor = "I")
    public int field1065;

    @OriginalMember(owner = "client!jr", name = "u", descriptor = "I")
    public int field1066;

    @OriginalMember(owner = "client!jr", name = "v", descriptor = "I")
    public int field1067;

    @OriginalMember(owner = "client!jr", name = "w", descriptor = "I")
    public static int field1068;

    @OriginalMember(owner = "client!jr", name = "x", descriptor = "I")
    public int field1069;

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(ILob;)V", line = 14)
    public static final void method640(int arg0, class521 arg1) {
        field1052++;
        class71.field1020.method1761((byte) 33, arg1.method3103(arg0 ^ 0xDFFF8C45));
        if (arg0 != -29627) {
            field1064 = null;
        }
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(I)V", line = 28)
    public static void method641(int arg0) {
        field1049 = null;
        if (arg0 != 18945) {
            method642((byte) 57, -16);
        }
        field1064 = null;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(BI)V", line = 41)
    public static final void method642(byte arg0, int arg1) {
        class373.field5557 = arg1;
        if (arg0 != 0) {
            method642((byte) -61, 102);
        }
        field1068++;
        class13 var2 = class315.field4745;
        synchronized (class315.field4745) {
            class315.field4745.method93((byte) 108);
        }
        class13 var3 = class425.field6331;
        synchronized (class425.field6331) {
            class425.field6331.method93((byte) 84);
        }
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(IB)V", line = 59)
    public static final void method643(int arg0, byte arg1) {
        if (arg1 >= -4) {
            field1049 = null;
        }
        field1050++;
        if (class429.field6373 == arg0) {
            return;
        }
        if (class429.field6373 == 0) {
            class363.method2277(21006);
        }
        if (arg0 == 12) {
            class204.method1420(class124.field1847, class36.field436, true, class97.field1393);
        }
        if (arg0 != 12 && class412.field6172 != null) {
            class412.field6172.method1966(100);
            class412.field6172 = null;
        }
        if (arg0 == 2) {
            class53.method505(-110, class40.field539 != class155.field2310);
        }
        if (arg0 == 6) {
            class28.method196(class444.field6528 != class155.field2310, -90);
        }
        if (arg0 == 4) {
            class519.method3083((byte) 56, class97.field1393, class124.field1847);
        } else if (arg0 == 5) {
            class204.method1420(class124.field1847, class36.field436, true, class97.field1393);
        } else if (arg0 == 8) {
            class204.method1420(class124.field1847, class36.field436, true, class97.field1393);
        } else if (arg0 == 11) {
            class519.method3083((byte) 56, class97.field1393, class124.field1847);
        }
        if (class412.method2586(-111, class429.field6373)) {
            class120.field1812.field6013 = 2;
            class282.field4287.field6013 = 2;
            class80.field1152.field6013 = 2;
            class217.field3527.field6013 = 2;
            class522.field7634.field6013 = 2;
            class293.field4448.field6013 = 2;
            class262.field4020.field6013 = 2;
        }
        if (class412.method2586(-101, arg0)) {
            class475.field6863 = 0;
            class155.field2312 = 0;
            class416.field6201 = 1;
            class5.field55 = 1;
            class232.field3753 = 0;
            class387.method2419(true, (byte) -1);
            class120.field1812.field6013 = 1;
            class282.field4287.field6013 = 1;
            class80.field1152.field6013 = 1;
            class217.field3527.field6013 = 1;
            class522.field7634.field6013 = 1;
            class293.field4448.field6013 = 1;
            class262.field4020.field6013 = 1;
        }
        if (arg0 == 10 || arg0 == 2) {
            class227.method1613(123);
        }
        if (arg0 == 1) {
            class484.method2897(class176.field2627, class377.field5692, 116);
        } else {
            class276.method1811(-15267);
        }
        boolean var2 = arg0 == 1 || class482.method2890(-9108, arg0) || class506.method3016(arg0, -9);
        boolean var3 = class429.field6373 == 1 || class482.method2890(-9108, class429.field6373) || class506.method3016(class429.field6373, -9);
        if (var2 != var3) {
            if (var2) {
                class491.field7055 = class408.field6097;
                if (class193.field3258.field7249 == 0) {
                    class141.method1015(2, (byte) -80);
                } else {
                    class221.method1591(class193.field3258.field7249, class408.field6097, 16621, 0, false, class313.field4720, 2);
                }
                class322.field4831.method1999(false, false);
            } else {
                class141.method1015(2, (byte) -82);
                class322.field4831.method1999(true, false);
            }
        }
        if (class412.method2586(-121, arg0) || arg0 == 12) {
            class377.field5692.method367();
        }
        class429.field6373 = arg0;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(II)I", line = 190)
    public static int method644(int arg0, int arg1) {
        return arg0 & arg1;
    }
}
