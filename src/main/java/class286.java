import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class286 {

    @OriginalMember(owner = "client!na", name = "c", descriptor = "Ljava/lang/String;")
    public static String field4734 = "Take";

    @OriginalMember(owner = "client!na", name = "f", descriptor = "[I")
    public static int[] field4737 = new int[2];

    @OriginalMember(owner = "client!na", name = "g", descriptor = "I")
    public static int field4738 = 0;

    @OriginalMember(owner = "client!na", name = "i", descriptor = "[I")
    public static int[] field4740 = new int[100];

    @OriginalMember(owner = "client!na", name = "a", descriptor = "I")
    public static int field4732;

    @OriginalMember(owner = "client!na", name = "b", descriptor = "I")
    public static int field4733;

    @OriginalMember(owner = "client!na", name = "d", descriptor = "I")
    public static int field4735;

    @OriginalMember(owner = "client!na", name = "e", descriptor = "I")
    public static int field4736;

    @OriginalMember(owner = "client!na", name = "h", descriptor = "I")
    public static int field4739;

    @OriginalMember(owner = "client!na", name = "j", descriptor = "I")
    public static int field4741;

    @OriginalMember(owner = "client!na", name = "k", descriptor = "I")
    public static int field4742;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(I)V")
    public static void method1993(int arg0) {
        field4734 = null;
        field4740 = null;
        field4737 = null;
        if (arg0 != -2) {
            field4737 = null;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(BLaj;)V")
    public static final void method1994(byte arg0, class151 arg1) {
        if (arg0 >= -34) {
            method1995((byte) 42);
        }
        field4733++;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(B)Ljava/lang/String;")
    public static final String method1995(byte arg0) {
        if (arg0 > -59) {
            return null;
        }
        field4735++;
        String var1;
        if (class272.field4554 == 1 && class287.field4747 < 2) {
            var1 = class245.field4116 + class152.field2545 + class46.field813 + " ->";
        } else if (class302.field4918 && class287.field4747 < 2) {
            var1 = class238.field4011 + class152.field2545 + class93.field1517 + " ->";
        } else if (class78.field1314 && class157.field2581[81] && class287.field4747 > 2) {
            var1 = class123.method933(class287.field4747 - 2, true);
        } else {
            var1 = class123.method933(class287.field4747 - 1, true);
        }
        if (class287.field4747 > 2) {
            var1 = var1 + "<col=ffffff> / " + (class287.field4747 - 2) + class110.field1828;
        }
        return var1;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method1996(int arg0, String arg1) {
        if (arg0 == 10466) {
            field4739++;
            return class225.method1594(0, true, 10, arg1);
        } else {
            return 50;
        }
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(B)V")
    public static final void method1997(byte arg0) {
        field4732++;
        if (arg0 > -17) {
            method1994((byte) 73, (class151) null);
        }
        if (class136.method1011(false) || class73.field1286 == class182.field2898) {
            class275.method1933(-18);
            if (class244.field4090 != class182.field2898) {
                class264.method1869(0);
            }
        } else {
            class108.method810(false, class263.field4395, class260.field4363, -118, false, class16.field314.field711[0], class16.field314.field717[0], class182.field2898);
        }
    }
}
