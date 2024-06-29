import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class28 implements class563 {

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "Ljava/lang/String;")
    private String field404;

    @OriginalMember(owner = "client!jf", name = "i", descriptor = "Lga;")
    private class332 field410;

    @OriginalMember(owner = "client!jf", name = "j", descriptor = "Lmo;")
    public static class361 field411 = new class361("WTRC", 1);

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "I")
    public static int field402;

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "I")
    public static int field403;

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "I")
    public static int field405;

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "I")
    public static int field407;

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "I")
    public static int field409;

    @OriginalMember(owner = "client!jf", name = "k", descriptor = "Lgba;")
    public static class388 field412;

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "Lf;")
    public static class532 field406;

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "[Lwn;")
    public static class232[] field408;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)Lrba;")
    public final class67 method179(int arg0) {
        if (arg0 != -24832) {
            method182(-64, -32);
        }
        field409++;
        return class67.field821;
    }

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "(I)V")
    public static final void method180(int arg0) {
        field407++;
        if (class420.field5513 == 6) {
            int var1 = -41 % ((75 - arg0) / 40);
            class420.field5513 = 7;
        }
    }

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "(I)V")
    public static void method181(int arg0) {
        if (arg0 == 1) {
            field406 = null;
            field408 = null;
            field411 = null;
            field412 = null;
        }
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(Lga;Ljava/lang/String;)V")
    public class28(class332 arg0, String arg1) {
        this.field404 = arg1;
        this.field410 = arg0;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(II)V")
    public static final void method182(int arg0, int arg1) {
        field403++;
        if (class576.field7861 == arg0) {
            return;
        }
        if (arg0 == 13) {
            if (class14.field183 == null) {
                class567.method3142(class299.field3960, class213.field2815, arg1 ^ 0xFFFF8BF4, class149.field2037);
            } else {
                class298.method1753(class149.field2037, 504);
            }
        }
        if (arg0 != 13 && class602.field8413 != null) {
            class602.field8413.method1164(109);
            class602.field8413 = null;
        }
        if (arg0 == 3) {
            class641.method3545(true, class230.field2983 != class164.field2349);
        }
        if (arg0 == 7) {
            class481.method2764(class431.field5793 != class164.field2349, 10735);
        }
        if (arg0 == 5) {
            if (class14.field183 == null) {
                class148.method845(class213.field2815, (byte) -128, class299.field3960);
            } else {
                class126.method745(-29610);
            }
        } else if (arg0 == 6) {
            if (class14.field183 == null) {
                class567.method3142(class299.field3960, class213.field2815, arg1 - 29708, class149.field2037);
            } else {
                class298.method1753(class149.field2037, 504);
            }
        } else if (arg0 == 9) {
            if (class14.field183 == null) {
                class567.method3142(class299.field3960, class213.field2815, -11, class149.field2037);
            } else {
                class298.method1753(class149.field2037, 504);
            }
        } else if (arg0 == 12) {
            if (class14.field183 == null) {
                class148.method845(class213.field2815, (byte) -117, class299.field3960);
            } else {
                class126.method745(-29610);
            }
        }
        if (class688.method3889(-103, class576.field7861)) {
            class82.field947.field4445 = 2;
            class89.field1084.field4445 = 2;
            class361.field4786.field4445 = 2;
            class651.field9100.field4445 = 2;
            class411.field5404.field4445 = 2;
            class219.field2867.field4445 = 2;
            class630.field8722.field4445 = 2;
        }
        if (class688.method3889(arg1 ^ 0x744E, arg0)) {
            class623.field8632 = 0;
            class46.field560 = 0;
            class628.field8705 = 1;
            class117.field1491 = 0;
            class680.field9655 = 1;
            class551.method3082((byte) 122, true);
            class82.field947.field4445 = 1;
            class89.field1084.field4445 = 1;
            class361.field4786.field4445 = 1;
            class651.field9100.field4445 = 1;
            class411.field5404.field4445 = 1;
            class219.field2867.field4445 = 1;
            class630.field8722.field4445 = 1;
        }
        if (arg0 == 11 || arg0 == 3) {
            class427.method2419((byte) 29);
        }
        boolean var2 = arg0 == 2 || class594.method3301((byte) 33, arg0) || class367.method2128(65280, arg0);
        if (arg1 != 29697) {
            method183(-46L, true);
        }
        boolean var3 = class576.field7861 == 2 || class594.method3301((byte) 33, class576.field7861) || class367.method2128(65280, class576.field7861);
        if (var3 != var2) {
            if (var2) {
                class275.field3659 = class436.field5812;
                if (class602.field8408.field4334 == 0) {
                    class382.method2188(2, -1);
                } else {
                    class668.method3797(0, false, 2, -92, class436.field5812, class654.field9309, class602.field8408.field4334);
                }
                class567.field7725.method979(4, false);
            } else {
                class382.method2188(2, -1);
                class567.field7725.method979(4, true);
            }
        }
        if (class688.method3889(-115, arg0) || arg0 == 13) {
            class146.field1963.method1050();
        }
        class576.field7861 = arg0;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(JZ)V")
    public static final void method183(long arg0, boolean arg1) {
        field402++;
        if (!arg1) {
            field412 = null;
        }
        class229 var3 = class298.method1751(120);
        var3.field2971.method915(-31914, class624.field8650.field799);
        var3.field2971.method917(1315630008, arg0);
        var3.field2971.method915(-31914, class422.field5539);
        class307.method1805(var3, -14704);
        class329.field4423 = 0;
        class589.field8123 = 1;
        class279.field3685 = -3;
        class50.field585 = 0;
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(I)I")
    public final int method184(int arg0) {
        field405++;
        int var2 = 7 % ((47 - arg0) / 54);
        return this.field410.method1963(-90, this.field404) ? 100 : 0;
    }
}
