import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class212 {

    @OriginalMember(owner = "client!pl", name = "h", descriptor = "[I")
    public static int[] field3575 = new int[25];

    @OriginalMember(owner = "client!pl", name = "i", descriptor = "Z")
    public static boolean field3576 = false;

    @OriginalMember(owner = "client!pl", name = "f", descriptor = "[Lql;")
    public static class20[] field3573 = new class20[0];

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "I")
    public static int field3568;

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "I")
    public static int field3569;

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "I")
    public static int field3570;

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "I")
    public static int field3571;

    @OriginalMember(owner = "client!pl", name = "e", descriptor = "I")
    public static int field3572;

    @OriginalMember(owner = "client!pl", name = "g", descriptor = "I")
    public static int field3574;

    @OriginalMember(owner = "client!pl", name = "j", descriptor = "Lcg;")
    public static class49 field3577;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(ZZ)Z", line = 4)
    public static final boolean method1570(boolean arg0, boolean arg1) {
        field3574++;
        boolean var2 = class16.method164();
        if (arg1) {
            field3573 = (class20[]) null;
        }
        if (var2 == arg0) {
            return true;
        }
        if (!arg0) {
            class16.method156();
        } else if (!class16.method159() || !class16.method162() || !class16.method168()) {
            arg0 = false;
        }
        class246.field3990 = arg0;
        class88.method774(true, class85.field1369);
        if (arg0 == var2) {
            return false;
        } else {
            ((class153) class62.field953).method1231((byte) -94);
            return true;
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IB)V", line = 43)
    public static final void method1571(int arg0, byte arg1) {
        field3570++;
        if (class272.method1863(-671591600, arg0)) {
            class69.method661(class109.field1852[arg0], -1, 91);
            if (arg1 != 26) {
                method1574((class252) null, (byte) 27);
            }
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(B)V", line = 62)
    public static void method1572(byte arg0) {
        field3573 = null;
        field3577 = null;
        if (arg0 >= -30) {
            field3576 = true;
        }
        field3575 = null;
    }

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(B)V", line = 77)
    public static final void method1573(byte arg0) {
        if (arg0 >= -20) {
            field3576 = true;
        }
        field3572++;
        class70.field1146 = new class79(32);
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Lmj;B)V", line = 88)
    public static final void method1574(class252 arg0, byte arg1) {
        if (arg0.field4061 != null) {
            arg0.field4061.field5293 = 0;
        }
        if (arg1 != 90) {
            field3573 = (class20[]) null;
        }
        arg0.field4059 = false;
        field3569++;
        for (class252 var2 = arg0.method54(); var2 != null; var2 = arg0.method52()) {
            method1574(var2, (byte) 90);
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(ILwc;)V", line = 122)
    public static final void method1575(int arg0, class116 arg1) {
        int var2 = arg1.field1972 - class181.field3045;
        int var3 = arg1.field2032 * 128 + (arg1.method987(3047) * 64);
        if (arg0 <= 0) {
            method1571(53, (byte) 95);
        }
        field3571++;
        int var4 = arg1.field1942 * 128 + arg1.method987(3047) * 64;
        arg1.field2020 = 0;
        arg1.field1985 += (var4 - arg1.field1985) / var2;
        arg1.field2036 += (var3 - arg1.field2036) / var2;
        if (arg1.field1971 == 0) {
            arg1.field1951 = 1024;
        }
        if (arg1.field1971 == 1) {
            arg1.field1951 = 1536;
        }
        if (arg1.field1971 == 2) {
            arg1.field1951 = 0;
        }
        if (arg1.field1971 == 3) {
            arg1.field1951 = 512;
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)Ljava/lang/String;", line = 157)
    public static final String method1576(int arg0) {
        field3568++;
        if (arg0 > -85) {
            return (String) null;
        }
        String var1;
        if (class93.field1458 == 1 && class293.field4708 < 2) {
            var1 = class198.field3388 + class316.field5028 + class207.field3516 + " ->";
        } else if (class179.field3027 && class293.field4708 < 2) {
            var1 = class50.field784 + class316.field5028 + class28.field386 + " ->";
        } else if (class295.field4715 && class97.field1572[81] && class293.field4708 > 2) {
            var1 = class352.method2453(class293.field4708 - 2, 27884);
        } else {
            var1 = class352.method2453(class293.field4708 - 1, 27884);
        }
        if (class293.field4708 > 2) {
            var1 = var1 + "<col=ffffff> / " + (class293.field4708 - 2) + class145.field2631;
        }
        return var1;
    }
}
