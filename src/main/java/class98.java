import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class98 {

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "Leg;")
    public static class37 field1520 = class174.method1167("<br>", 105);

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "Lbf;")
    public static class202 field1523 = new class202(100);

    @OriginalMember(owner = "client!mb", name = "h", descriptor = "[I")
    public static int[] field1525 = new int[32768];

    @OriginalMember(owner = "client!mb", name = "i", descriptor = "[Lpi;")
    public static class188[] field1526 = new class188[2048];

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "I")
    public static int field1518;

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "I")
    public static int field1519;

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "I")
    public static int field1521;

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "I")
    public static int field1522;

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "I")
    public static int field1524;

    @OriginalMember(owner = "client!mb", name = "j", descriptor = "Ljl;")
    public static class101 field1527;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(BI)I")
    public static final int method634(byte arg0, int arg1) {
        field1521++;
        if (!(arg1 < 97 || arg1 > 122) || !(arg1 < 224 || arg1 > 254 || arg1 == 247)) {
            return arg1 - 32;
        } else if (arg1 == 255) {
            return 159;
        } else {
            if (arg0 != 60) {
                field1523 = null;
            }
            return arg1 == 156 ? 140 : arg1;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIB)V")
    public static final void method635(int arg0, int arg1, byte arg2) {
        if (arg2 < 123) {
            method637(-123, false);
        }
        field1524++;
        class153.field2571[arg1] = arg0;
        class240 var3 = (class240) class84.field1327.method992((byte) 125, (long) arg1);
        if (var3 == null) {
            class240 var4 = new class240(class149.method1024(-14898) + 500L);
            class84.field1327.method986(var4, (long) arg1, -1);
        } else {
            var3.field4267 = class149.method1024(-14898) + 500L;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(B)V")
    public static void method636(byte arg0) {
        field1520 = null;
        field1523 = null;
        if (arg0 <= 116) {
            method639(-13, (class37) null, -26, 41, 70);
        }
        field1527 = null;
        field1526 = null;
        field1525 = null;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IZ)I")
    public static final int method637(int arg0, boolean arg1) {
        if (!arg1) {
            method636((byte) 14);
        }
        field1522++;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILeg;)V")
    public static final void method638(int arg0, class37 arg1) {
        field1519++;
        client.method781(false, (byte) -75);
        if (arg0 != -10) {
            method639(79, (class37) null, -114, -23, 107);
        }
        class270.method1803(2, arg1);
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILeg;III)V")
    public static final void method639(int arg0, class37 arg1, int arg2, int arg3, int arg4) {
        class237 var5 = class47.method309(128, arg0, arg4);
        field1518++;
        if (var5 == null) {
            return;
        }
        if (var5.field4227 != null) {
            class85 var6 = new class85();
            var6.field1346 = var5;
            var6.field1335 = arg3;
            var6.field1339 = var5.field4227;
            var6.field1328 = arg1;
            class274.method1841(var6, 103);
        }
        boolean var7 = true;
        if (var5.field4175 > 0) {
            var7 = class132.method942(var5, (byte) -70);
        }
        if (!var7 || !class152.method1035(client.method787(var5), false, arg3 - 1)) {
            return;
        }
        if (arg3 == 1) {
            class273.field4778.method1697(165, arg2 ^ 0xDE);
            class280.field4945++;
            class273.field4778.method1272(27862, arg0);
            class273.field4778.method1294(arg4, -26655);
        }
        if (arg3 == 2) {
            class273.field4778.method1697(2, 117);
            class151.field2528++;
            class273.field4778.method1272(27862, arg0);
            class273.field4778.method1294(arg4, -26655);
        }
        if (arg3 == 3) {
            class248.field4458++;
            class273.field4778.method1697(178, 122);
            class273.field4778.method1272(27862, arg0);
            class273.field4778.method1294(arg4, -26655);
        }
        if (arg3 == 4) {
            class35.field490++;
            class273.field4778.method1697(132, 124);
            class273.field4778.method1272(27862, arg0);
            class273.field4778.method1294(arg4, arg2 - 26821);
        }
        if (arg2 != 166) {
            field1526 = null;
        }
        if (arg3 == 5) {
            client.field1898++;
            class273.field4778.method1697(147, 93);
            class273.field4778.method1272(arg2 + 27696, arg0);
            class273.field4778.method1294(arg4, -26655);
        }
        if (arg3 == 6) {
            class110.field1841++;
            class273.field4778.method1697(166, 112);
            class273.field4778.method1272(arg2 ^ 0x6C70, arg0);
            class273.field4778.method1294(arg4, -26655);
        }
        if (arg3 == 7) {
            class273.field4792++;
            class273.field4778.method1697(161, 127);
            class273.field4778.method1272(27862, arg0);
            class273.field4778.method1294(arg4, -26655);
        }
        if (arg3 == 8) {
            class285.field5036++;
            class273.field4778.method1697(23, 96);
            class273.field4778.method1272(27862, arg0);
            class273.field4778.method1294(arg4, -26655);
        }
        if (arg3 == 9) {
            class232.field3979++;
            class273.field4778.method1697(117, 119);
            class273.field4778.method1272(27862, arg0);
            class273.field4778.method1294(arg4, -26655);
        }
        if (arg3 == 10) {
            class273.field4778.method1697(223, arg2 - 41);
            class269.field4709++;
            class273.field4778.method1272(27862, arg0);
            class273.field4778.method1294(arg4, -26655);
        }
    }
}
