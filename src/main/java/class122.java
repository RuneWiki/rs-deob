import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dw")
public class class122 {

    @OriginalMember(owner = "client!dw", name = "f", descriptor = "Lio;")
    public static class151 field1955;

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "I")
    public static int field1950;

    @OriginalMember(owner = "client!dw", name = "c", descriptor = "I")
    public static int field1952;

    @OriginalMember(owner = "client!dw", name = "d", descriptor = "I")
    public static int field1953;

    @OriginalMember(owner = "client!dw", name = "e", descriptor = "I")
    public static int field1954;

    @OriginalMember(owner = "client!dw", name = "b", descriptor = "[I")
    public static int[] field1951;

    static {
        new class567(null, "bevor du die Option 'Regelverstoß melden' benutzt.", null, null);
        field1955 = new class151(8, 0, 4, 1);
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(I)V", line = 7)
    public static final void method979(int arg0) {
        class222.field3345 = null;
        field1952++;
        class87.method792(-1, 10211, class68.field1285, 0, 0, class442.field6464, class609.field8659, 0, 0);
        if (class222.field3345 != null) {
            class421.method2536(class105.field1757, class68.field1285, class606.field8629, 0, -1412584499, class442.field6464, class179.field2601.field7640, 0, (byte) 122, class222.field3345);
            class222.field3345 = null;
        }
        int var1 = 94 / ((56 - arg0) / 38);
    }

    @OriginalMember(owner = "client!dw", name = "b", descriptor = "(I)V", line = 26)
    public static void method980(int arg0) {
        field1951 = null;
        if (arg0 == 65535) {
            field1955 = null;
        }
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(BJLjava/lang/String;Z)V", line = 39)
    public static final void method981(byte arg0, long arg1, String arg2, boolean arg3) {
        field1953++;
        if (arg3) {
            class408.method2479((byte) -60);
            if (class636.field9236.equals("")) {
                class551.field7801 = 39;
                return;
            }
        }
        class268 var5 = new class268(576);
        var5.method1710(10, arg0 ^ 0x52);
        var5.method1699(true, (int) (Math.random() * 65535.0D));
        var5.method1721(arg1, true);
        var5.method1699(true, arg3 ? class602.field8569 : class56.field803);
        var5.method1702((int) (Math.random() * 9.9999999E7D), false);
        var5.method1726((byte) -52, arg2);
        var5.method1702((int) (Math.random() * 9.9999999E7D), false);
        if (arg3) {
            var5.method1721(class640.method3691(-10880, class636.field9236), true);
            try {
                var5.method1721(Long.parseLong(class101.field1737), true);
            } catch (Exception var6) {
                class551.field7801 = 39;
                return;
            }
        } else {
            var5.method1702((int) (Math.random() * 9.9999999E7D), false);
            var5.method1702((int) (Math.random() * 9.9999999E7D), false);
            var5.method1702((int) (Math.random() * 9.9999999E7D), false);
            var5.method1702((int) (Math.random() * 9.9999999E7D), false);
        }
        var5.method1702((int) (Math.random() * 9.9999999E7D), false);
        var5.method1727(class154.field2306, (byte) -108, class406.field6033);
        class127.field2088.field3913 = 0;
        class127.field2088.method1710(arg3 ? class97.field1689.field7507 : class97.field1686.field7507, arg0 - 67);
        if (arg0 != 124) {
            return;
        }
        class127.field2088.method1699(true, var5.field3913 + 28);
        class127.field2088.method1699(true, 608);
        class127.field2088.method1710(class538.field7500, 32);
        class127.field2088.method1710(class640.field9282.field8321, arg0 - 81);
        class262.method1670(class127.field2088, (byte) -24);
        class127.field2088.method1725(0, var5.field3913, (byte) -12, var5.field3952);
        class551.field7801 = -3;
        class98.field1708 = 0;
        class23.field324 = 1;
        class617.field8731 = 0;
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(B)V", line = 103)
    public static final void method982(byte arg0) {
        field1950++;
        for (class276 var1 = (class276) class341.field4897.method427(true); var1 != null; var1 = (class276) class341.field4897.method420(false)) {
            class562 var2 = var1.field4032;
            if (var2.field8035) {
                var1.method911(-52);
                var2.method3207(false);
            } else if (var2.field8049 <= class310.field4553) {
                var2.method3205(class303.field4378, (byte) -96);
                if (var2.field8035) {
                    var1.method911(-52);
                } else {
                    client.method3524(var2, true);
                }
            }
        }
        if (arg0 > -111) {
            field1951 = null;
        }
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(BII)V", line = 141)
    public static final void method983(byte arg0, int arg1, int arg2) {
        class268.field3895++;
        class624.method3537(-105, class382.field5686);
        field1954++;
        class127.field2088.method1739(false, arg2);
        int var3 = -116 % ((67 - arg0) / 39);
        class127.field2088.method1747(arg1, -29356);
    }
}
