import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cv")
public class class528 {

    @OriginalMember(owner = "client!cv", name = "c", descriptor = "Lhga;")
    public static class158 field7703 = new class158(11, -1);

    @OriginalMember(owner = "client!cv", name = "f", descriptor = "I")
    public static int field7706 = -1;

    @OriginalMember(owner = "client!cv", name = "h", descriptor = "I")
    public static int field7708 = 0;

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "I")
    public static int field7701;

    @OriginalMember(owner = "client!cv", name = "b", descriptor = "I")
    public static int field7702;

    @OriginalMember(owner = "client!cv", name = "d", descriptor = "I")
    public static int field7704;

    @OriginalMember(owner = "client!cv", name = "e", descriptor = "I")
    public static int field7705;

    @OriginalMember(owner = "client!cv", name = "g", descriptor = "I")
    public static int field7707;

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(Liaa;I)Lim;")
    public static final class531 method3196(class459 arg0, int arg1) {
        if (arg1 != -10779) {
            field7703 = null;
        }
        field7701++;
        class531 var2;
        if (class165.field2781 == null) {
            var2 = new class531();
        } else {
            var2 = class165.field2781;
            class165.field2781 = class165.field2781.field7736;
            class282.field4516--;
            var2.field7736 = null;
        }
        var2.field7739 = arg0;
        return var2;
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(I)I")
    public static final int method3197(int arg0) {
        if (arg0 == 1088) {
            field7702++;
            return class165.field2779;
        } else {
            return 54;
        }
    }

    @OriginalMember(owner = "client!cv", name = "b", descriptor = "(I)V")
    public static void method3198(int arg0) {
        field7703 = null;
        if (arg0 != 0) {
            method3198(24);
        }
    }

    @OriginalMember(owner = "client!cv", name = "c", descriptor = "(I)V")
    public static final void method3199(int arg0) {
        field7704++;
        class691.method3916(false, class627.field8857, (long) class562.field8084);
        if (field7706 != -1) {
            class149.method1249(-25, field7706);
        }
        for (int var1 = arg0; var1 < class700.field9880; var1++) {
            if (class532.field7753[var1]) {
                class185.field3111[var1] = true;
            }
            class476.field7053[var1] = class532.field7753[var1];
            class532.field7753[var1] = false;
        }
        class581.field8274 = class562.field8084;
        if (field7706 != -1) {
            class700.field9880 = 0;
            class34.method463((byte) 107);
        }
        class627.field8857.method281();
        class486.method2980(class627.field8857, 679);
        int var2 = class225.method1652((byte) -76);
        if (var2 == -1) {
            var2 = class250.field4003;
        }
        if (var2 == -1) {
            var2 = class459.field6864;
        }
        class217.method1624(-110, var2);
        class116.field1805 = 0;
    }
}
