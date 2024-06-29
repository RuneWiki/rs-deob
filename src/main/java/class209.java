import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class209 extends RuntimeException {

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "Ljava/lang/Throwable;")
    public Throwable field3601;

    @OriginalMember(owner = "client!lf", name = "h", descriptor = "Ljava/lang/String;")
    public String field3605;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "Lp;")
    private static class280 field3598 = class18.method140((byte) -124, "");

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "I")
    public static int field3599 = 0;

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "Lp;")
    public static class280 field3602 = field3598;

    @OriginalMember(owner = "client!lf", name = "i", descriptor = "Lp;")
    public static class280 field3606 = class18.method140((byte) -127, "Utiliser");

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "Lp;")
    public static class280 field3603 = class18.method140((byte) -118, "Schlie-8en");

    @OriginalMember(owner = "client!lf", name = "k", descriptor = "Lp;")
    public static class280 field3608 = class18.method140((byte) -118, "<img=1>");

    @OriginalMember(owner = "client!lf", name = "l", descriptor = "I")
    public static int field3609 = 0;

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "I")
    public static int field3600;

    @OriginalMember(owner = "client!lf", name = "g", descriptor = "I")
    public static int field3604;

    @OriginalMember(owner = "client!lf", name = "j", descriptor = "I")
    public static int field3607;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)V")
    public static void method1406(int arg0) {
        field3606 = null;
        if (arg0 < 16) {
            method1408((byte) -2);
        }
        field3608 = null;
        field3602 = null;
        field3603 = null;
        field3598 = null;
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(I)V")
    public static final void method1407(int arg0) {
        if (arg0 != -1) {
            method1407(53);
        }
        field3604++;
        class81.field1322.method1485((byte) -108);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(B)V")
    public static final void method1408(byte arg0) {
        class253.field4431 = null;
        class219.field3754 = null;
        class252.field4401 = null;
        class207.field3580 = null;
        class54.field882 = null;
        class97.field1559 = null;
        class37.field666 = null;
        class105.field1753 = null;
        field3600++;
        if (arg0 <= 3) {
            field3603 = null;
        }
        class279.field4884 = null;
        class144.field2514 = null;
        class59.field954 = null;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Ltd;ZI)V")
    public static final void method1409(class72 arg0, boolean arg1, int arg2) {
        if (arg1) {
            int var3 = class103.field1724;
            int var4 = var3 * 956 / 503;
            class90.field1456.method760((class190.field3328 - var4) / 2, 0, var4, var3);
            class173.field3019.method62(class190.field3328 / 2 - (class173.field3019.field1341 / 2), 18);
        }
        arg0.method531(class74.field1214, class190.field3328 / 2, class103.field1724 / 2 - 26, arg2, -1);
        field3607++;
        int var5 = class103.field1724 / 2 - 18;
        class151.method1060(class190.field3328 / 2 - 152, var5, 304, 34, 9179409);
        class151.method1060(class190.field3328 / 2 - 151, var5 + 1, 302, 32, 0);
        class151.method1057(class190.field3328 / 2 - 150, var5 - -2, class50.field830 * 3, 30, 9179409);
        class151.method1057(class190.field3328 / 2 + class50.field830 * 3 - 150, var5 + 2, 300 - (class50.field830 * 3), 30, 0);
        arg0.method531(field3602, class190.field3328 / 2, class103.field1724 / 2 + 4, 16777215, -1);
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class209(Throwable arg0, String arg1) {
        this.field3601 = arg0;
        this.field3605 = arg1;
    }
}
