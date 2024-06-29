import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class33 {

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "Ljava/util/Calendar;")
    public static Calendar field539 = Calendar.getInstance();

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "Lli;")
    public static class185 field542 = class245.method1649("Cabbage", -33);

    @OriginalMember(owner = "client!tc", name = "h", descriptor = "Lli;")
    private static class185 field543 = class245.method1649("shake:", -16);

    @OriginalMember(owner = "client!tc", name = "l", descriptor = "I")
    public static int field547 = 0;

    @OriginalMember(owner = "client!tc", name = "i", descriptor = "Lli;")
    public static class185 field544 = field543;

    @OriginalMember(owner = "client!tc", name = "m", descriptor = "[J")
    public static long[] field548 = new long[32];

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "Lli;")
    private static class185 field541 = class245.method1649("Starting 3d Library", 125);

    @OriginalMember(owner = "client!tc", name = "n", descriptor = "Lli;")
    public static class185 field549 = field543;

    @OriginalMember(owner = "client!tc", name = "k", descriptor = "Lli;")
    public static class185 field546 = field541;

    @OriginalMember(owner = "client!tc", name = "p", descriptor = "I")
    public static int field551 = 1;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "I")
    public static int field536;

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "I")
    public static int field537;

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "I")
    public static int field538;

    @OriginalMember(owner = "client!tc", name = "o", descriptor = "Lhi;")
    public static class250 field550;

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "Led;")
    public static class252 field540;

    @OriginalMember(owner = "client!tc", name = "j", descriptor = "Ljava/lang/String;")
    public static String field545;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lhi;BLhi;)I")
    public static final int method204(class250 arg0, byte arg1, class250 arg2) {
        field536++;
        int var3 = 0;
        if (arg2.method1701(class13.field232, -2)) {
            var3++;
        }
        if (arg2.method1701(class119.field2172, -2)) {
            var3++;
        }
        if (arg2.method1701(class180.field3309, -2)) {
            var3++;
        }
        int var4 = 27 % ((arg1 + 61) / 47);
        if (arg0.method1701(class13.field232, -2)) {
            var3++;
        }
        if (arg0.method1701(class119.field2172, -2)) {
            var3++;
        }
        if (arg0.method1701(class180.field3309, -2)) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lhi;II)[Lcg;")
    public static final class34[] method205(class250 arg0, int arg1, int arg2) {
        field537++;
        if (class207.method1467(arg0, arg1, 0)) {
            return arg2 > -76 ? null : class173.method1232(true);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(B)Lli;")
    public static final class185 method206(byte arg0) {
        field538++;
        class185 var1 = class54.field930;
        int var2 = -114 / ((56 - arg0) / 33);
        class185 var3 = class20.field336;
        if (class259.field4601 != 0) {
            var1 = class240.field4286;
        }
        if (class25.field420 != null) {
            var3 = class87.method567(-11039, new class185[] { class266.field4708, class25.field420 });
        }
        return class87.method567(-11039, new class185[] { class264.field4690, var1, class90.field1741, class90.method591(class198.field3620, 0), class214.field3913, class90.method591(class119.field2175, 0), var3, class65.field1123 });
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V")
    public static void method207(int arg0) {
        field543 = null;
        if (arg0 != 255) {
            method206((byte) 49);
        }
        field542 = null;
        field539 = null;
        field548 = null;
        field544 = null;
        field550 = null;
        field541 = null;
        field549 = null;
        field540 = null;
        field546 = null;
        field545 = null;
    }
}
