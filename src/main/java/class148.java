import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class148 {

    @OriginalMember(owner = "client!e", name = "e", descriptor = "Lbe;")
    private static class283 field2415 = class153.method941(126, "en");

    @OriginalMember(owner = "client!e", name = "g", descriptor = "Lbe;")
    private static class283 field2417 = class153.method941(126, "fr");

    @OriginalMember(owner = "client!e", name = "k", descriptor = "Lbe;")
    private static class283 field2421 = class153.method941(-51, ")3fr");

    @OriginalMember(owner = "client!e", name = "m", descriptor = "Lbe;")
    private static class283 field2423 = class153.method941(-13, "de");

    @OriginalMember(owner = "client!e", name = "b", descriptor = "Lbe;")
    private static class283 field2412 = class153.method941(127, ")3de");

    @OriginalMember(owner = "client!e", name = "j", descriptor = "Lbe;")
    private static class283 field2420 = class153.method941(-14, ")3en");

    @OriginalMember(owner = "client!e", name = "a", descriptor = "[Lbe;")
    public static class283[] field2411 = new class283[] { field2415, field2423, field2417 };

    @OriginalMember(owner = "client!e", name = "l", descriptor = "[Lbe;")
    private static class283[] field2422 = new class283[] { field2420, field2412, field2421 };

    @OriginalMember(owner = "client!e", name = "d", descriptor = "Ltf;")
    public static class242 field2414 = new class242(50);

    @OriginalMember(owner = "client!e", name = "c", descriptor = "I")
    public static int field2413;

    @OriginalMember(owner = "client!e", name = "f", descriptor = "I")
    public static int field2416;

    @OriginalMember(owner = "client!e", name = "h", descriptor = "I")
    public static int field2418;

    @OriginalMember(owner = "client!e", name = "i", descriptor = "I")
    public static int field2419;

    @OriginalMember(owner = "client!e", name = "n", descriptor = "I")
    public static int field2424;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(ZII)I", line = 6)
    public static final int method917(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            return -82;
        }
        field2418++;
        int var3 = 1;
        while (arg1 > 1) {
            if ((arg1 & 0x1) != 0) {
                var3 = arg2 * var3;
            }
            arg2 *= arg2;
            arg1 >>= 0x1;
        }
        if (arg1 == 1) {
            return arg2 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IJ)V", line = 40)
    public static final void method918(int arg0, long arg1) {
        field2416++;
        if (arg1 == 0L) {
            return;
        }
        if (class195.field3330 >= 100) {
            class60.method394(0, class168.field2818, class213.field3616, (byte) 110);
            return;
        }
        class283 var3 = class232.method1567(arg1, -54).method1901(4095);
        if (arg0 > -26) {
            field2417 = (class283) null;
        }
        for (int var4 = 0; var4 < class195.field3330; var4++) {
            if (class110.field1854[var4] == arg1) {
                class60.method394(0, class299.method2022(new class283[] { var3, class295.field5009 }, (byte) 25), class213.field3616, (byte) 105);
                return;
            }
        }
        for (int var5 = 0; var5 < class103.field1748; var5++) {
            if (class160.field2622[var5] == arg1) {
                class60.method394(0, class299.method2022(new class283[] { class216.field3667, var3, class263.field4471 }, (byte) 91), class213.field3616, (byte) 35);
                return;
            }
        }
        if (var3.method1926(-16620, class213.field3624.field3274)) {
            class60.method394(0, class225.field3768, class213.field3616, (byte) 116);
            return;
        }
        class110.field1854[class195.field3330] = arg1;
        class214.field3635++;
        class127.field2102[class195.field3330++] = class232.method1567(arg1, 39);
        class141.field2359 = class252.field4284;
        class228.field3831.method621(83, 8);
        class228.field3831.method1544((byte) 8, arg1);
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(I)Lpa;", line = 110)
    public static final class2 method919(int arg0) {
        if (arg0 != 50) {
            field2415 = (class283) null;
        }
        field2419++;
        try {
            return (class2) Class.forName("ll").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return null;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(B)V", line = 137)
    public static void method920(byte arg0) {
        field2411 = null;
        field2417 = null;
        field2412 = null;
        field2420 = null;
        field2423 = null;
        if (arg0 >= -70) {
            field2421 = (class283) null;
        }
        field2415 = null;
        field2414 = null;
        field2421 = null;
        field2422 = null;
    }
}
