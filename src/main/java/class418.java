import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ls")
public class class418 implements class259 {

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "F")
    public static float field5711 = 0.0F;

    @OriginalMember(owner = "client!ls", name = "d", descriptor = "Luv;")
    public static class3 field5713 = new class3(72, 8);

    @OriginalMember(owner = "client!ls", name = "e", descriptor = "Lim;")
    public static class353 field5714 = new class353(57, 14);

    @OriginalMember(owner = "client!ls", name = "f", descriptor = "Ljava/lang/String;")
    public static String field5715 = null;

    @OriginalMember(owner = "client!ls", name = "h", descriptor = "[Ljava/lang/String;")
    public static String[] field5717 = new String[] { "en", "de", "fr", "pt", "nl" };

    @OriginalMember(owner = "client!ls", name = "g", descriptor = "Lvt;")
    public static class344 field5716 = new class344("wave:", "welle:", "ondulation:", "onda:");

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "I")
    public static int field5710;

    @OriginalMember(owner = "client!ls", name = "c", descriptor = "I")
    public static int field5712;

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(Lbn;J[IB)Ljava/lang/String;")
    public final String method1550(class371 arg0, long arg1, int[] arg2, byte arg3) {
        field5710++;
        if (arg3 <= 62) {
            this.method1550(null, 48L, null, (byte) -26);
        }
        if (class430.field5856 == arg0) {
            class503 var6 = class292.field3790.method3682(arg2[0], (byte) -83);
            return var6.method2813(true, (int) arg1);
        } else if (class317.field4375 == arg0 || class292.field3801 == arg0) {
            class456 var7 = class98.field1307.method3391(0, (int) arg1);
            return var7.field6471;
        } else if (class487.field6795 == arg0 || class504.field7014 == arg0 || class548.field7630 == arg0) {
            return class292.field3790.method3682(arg2[0], (byte) -84).method2813(true, (int) arg1);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(B)Lnd;")
    public static final class632 method2478(byte arg0) {
        field5712++;
        class632 var1 = (class632) class413.field5685.method2222((byte) -100);
        if (var1 != null) {
            var1.method589(-8880);
            var1.method3149(-18724);
            return var1;
        } else if (arg0 <= 113) {
            return null;
        } else {
            class632 var2;
            do {
                var2 = (class632) class545.field7595.method2222((byte) -87);
                if (var2 == null) {
                    return null;
                }
                if (var2.method3652(true) > class348.method2175(-125)) {
                    return null;
                }
                var2.method589(-8880);
                var2.method3149(-18724);
            } while ((Long.MIN_VALUE & var2.field7830) == 0L);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "(B)V")
    public static void method2479(byte arg0) {
        field5713 = null;
        int var1 = 23 % ((-arg0 - 34) / 57);
        field5714 = null;
        field5716 = null;
        field5715 = null;
        field5717 = null;
    }
}
