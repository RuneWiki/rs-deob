import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class250 extends class29 {

    @OriginalMember(owner = "client!sg", name = "o", descriptor = "[I")
    public static int[] field3691 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!sg", name = "n", descriptor = "Lus;")
    public static class1 field3690 = new class1(55, 0);

    @OriginalMember(owner = "client!sg", name = "r", descriptor = "Lwf;")
    public static class79 field3694 = new class79(44, 7);

    @OriginalMember(owner = "client!sg", name = "s", descriptor = "Ldt;")
    public static class145 field3695 = null;

    @OriginalMember(owner = "client!sg", name = "j", descriptor = "I")
    public static int field3686;

    @OriginalMember(owner = "client!sg", name = "k", descriptor = "I")
    public static int field3687;

    @OriginalMember(owner = "client!sg", name = "l", descriptor = "I")
    public static int field3688;

    @OriginalMember(owner = "client!sg", name = "m", descriptor = "I")
    public static int field3689;

    @OriginalMember(owner = "client!sg", name = "q", descriptor = "Lwp;")
    public static class109 field3693;

    @OriginalMember(owner = "client!sg", name = "p", descriptor = "Lnp;")
    public static class313 field3692;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(II)I")
    public static final int method1561(int arg0, int arg1) {
        if (arg1 != 0) {
            field3693 = null;
        }
        field3688++;
        return arg0 & 0x7F;
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(I)V")
    public static void method1562(int arg0) {
        field3690 = null;
        field3692 = null;
        field3695 = null;
        field3694 = null;
        field3693 = null;
        field3691 = null;
        if (arg0 != -2) {
            field3694 = null;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method1563(String arg0, int arg1) {
        field3689++;
        if (arg1 <= 43) {
            field3692 = null;
        }
        if (class88.field1073 != null) {
            class15.method110(class321.field4655, -127);
            class267.field3905++;
            class225.field3415.method1753(true, class89.method501(arg0, true));
            class225.field3415.method1730(-11508, arg0);
        }
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(II)V")
    public static final void method1564(int arg0, int arg1) {
        field3687++;
        class303.field4310.method1486(438127120, arg1);
        class360.field5179.method1486(438127120, arg1);
        int var2 = -23 % ((arg0 + 41) / 36);
        class272.field3966.method1486(438127120, arg1);
        class78.field964.method1486(438127120, arg1);
        class355.field5137.method1486(438127120, arg1);
    }

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "(I)V")
    public static final void method1565(int arg0) {
        field3686++;
        for (class342 var1 = (class342) class99.field1270.method2843(1123227612); var1 != null; var1 = (class342) class99.field1270.method2842(arg0 + 1673506445)) {
            if (var1.field4969) {
                var1.method2155(0);
            }
        }
        if (arg0 != 1) {
            method1565(-24);
        }
        for (class342 var2 = (class342) class114.field1459.method2843(1123227612); var2 != null; var2 = (class342) class114.field1459.method2842(arg0 ^ 0x63BFAE8F)) {
            if (var2.field4969) {
                var2.method2155(0);
            }
        }
    }
}
