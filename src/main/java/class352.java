import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!op")
public class class352 implements class326 {

    @OriginalMember(owner = "client!op", name = "d", descriptor = "[S")
    public static short[] field4929 = new short[256];

    @OriginalMember(owner = "client!op", name = "b", descriptor = "Ljava/lang/String;")
    public static String field4927 = "Your ignore list is full. Max of 100 users.";

    @OriginalMember(owner = "client!op", name = "f", descriptor = "Z")
    public static boolean field4931 = false;

    @OriginalMember(owner = "client!op", name = "a", descriptor = "I")
    public static int field4926;

    @OriginalMember(owner = "client!op", name = "c", descriptor = "I")
    public static int field4928;

    @OriginalMember(owner = "client!op", name = "e", descriptor = "I")
    public static int field4930;

    @OriginalMember(owner = "client!op", name = "g", descriptor = "I")
    public static int field4932;

    @OriginalMember(owner = "client!op", name = "h", descriptor = "Lam;")
    public static class286 field4933;

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(JIB[I)Ljava/lang/String;", line = 5)
    public final String method1872(long arg0, int arg1, byte arg2, int[] arg3) {
        field4928++;
        if (arg1 == 0) {
            class341 var6 = class155.method830(arg3[0], (byte) -98);
            return var6.method1988(-5, (int) arg0);
        }
        int var7 = 90 / ((-arg2 - 21) / 57);
        if (arg1 == 1 || arg1 == 10) {
            class123 var8 = class65.method368((int) arg0, -124);
            return var8.field1519;
        } else if (arg1 == 6 || arg1 == 7 || arg1 == 11) {
            return class155.method830(arg3[0], (byte) -98).method1988(-110, (int) arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(B)V", line = 37)
    public static void method2157(byte arg0) {
        if (arg0 == 1) {
            field4933 = null;
            field4929 = null;
            field4927 = null;
        }
    }

    @OriginalMember(owner = "client!op", name = "b", descriptor = "(B)V", line = 52)
    public static final void method2158(byte arg0) {
        if (arg0 != -42) {
            field4931 = true;
        }
        field4932++;
        int var1 = class330.method1891(true);
        if (var1 == 0) {
            class452.field6580 = null;
            class181.method961(false, 0);
        } else if (var1 == 1) {
            class438.method2706((byte) 0, arg0 - 49);
            class181.method961(false, 512);
            if (class282.field3872 != null) {
                class23.method124(arg0 ^ 0x52);
            }
        } else {
            class438.method2706((byte) (class127.field1642 - 4 & 0xFF), -103);
            class181.method961(false, 2);
        }
        class366.field5130 = class263.field3592;
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(IB)V", line = 87)
    public static final void method2159(int arg0, byte arg1) {
        field4926++;
        if (class129.field1664 == arg0) {
            return;
        }
        if (class129.field1664 == 0) {
            class334.method1899(520);
        }
        if (arg1 != 65) {
            field4931 = false;
        }
        if (arg0 == 40) {
            class385.method2387(-3);
        }
        if (arg0 != 40 && class32.field316 != null) {
            class32.field316.method1538((byte) 5);
            class32.field316 = null;
        }
        if (class129.field1664 == 25 || class129.field1664 == 28) {
            class262.field3582.field3910 = 2;
            class366.field5120.field3910 = 2;
            class243.field3318.field3910 = 2;
            class183.field2331.field3910 = 2;
            class211.field2866.field3910 = 2;
            class63.field646.field3910 = 2;
            class267.field3641.field3910 = 2;
        }
        if (arg0 == 25 || arg0 == 28) {
            class270.field3661 = 0;
            class74.field815 = 1;
            class319.field4257 = 0;
            class424.field6223 = 0;
            class344.field4621 = 1;
            class208.method1127(true, -96);
            class262.field3582.field3910 = 1;
            class366.field5120.field3910 = 1;
            class243.field3318.field3910 = 1;
            class183.field2331.field3910 = 1;
            class211.field2866.field3910 = 1;
            class63.field646.field3910 = 1;
            class267.field3641.field3910 = 1;
        }
        if (arg0 == 25 || arg0 == 10) {
            class402.method2525(160);
        }
        if (arg0 == 5) {
            class444.method2755((byte) -66, class88.field1003, class72.field797);
        } else {
            class38.method184((byte) -94);
        }
        boolean var2 = arg0 == 5 || arg0 == 10 || arg0 == 28;
        boolean var3 = class129.field1664 == 5 || class129.field1664 == 10 || class129.field1664 == 28;
        if (var2 != var3) {
            if (var2) {
                class200.field2668 = class398.field5741;
                if (class160.field2062 == 0) {
                    class303.method1786(2, (byte) -81);
                } else {
                    class440.method2724(2, false, class283.field3875, false, 0, 255, class398.field5741);
                }
                class91.field1032.method2200(0, false);
            } else {
                class303.method1786(2, (byte) -71);
                class91.field1032.method2200(0, true);
                if (class17.field162 != null) {
                    class17.field162.method1328((byte) 96);
                    class17.field162 = null;
                }
            }
        }
        if (arg0 == 25 || arg0 == 28 || arg0 == 40) {
            class88.field1003.method1555();
        }
        class129.field1664 = arg0;
    }
}
