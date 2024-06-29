import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class280 extends class134 {

    @OriginalMember(owner = "client!eh", name = "t", descriptor = "Ljava/lang/String;")
    public String field4651;

    @OriginalMember(owner = "client!eh", name = "o", descriptor = "J")
    public static long field4646 = 0L;

    @OriginalMember(owner = "client!eh", name = "q", descriptor = "[[S")
    public static short[][] field4648 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!eh", name = "u", descriptor = "Ljava/lang/String;")
    public static String field4652 = "Walk here";

    @OriginalMember(owner = "client!eh", name = "p", descriptor = "I")
    public static int field4647;

    @OriginalMember(owner = "client!eh", name = "r", descriptor = "I")
    public static int field4649;

    @OriginalMember(owner = "client!eh", name = "s", descriptor = "I")
    public static int field4650;

    @OriginalMember(owner = "client!eh", name = "f", descriptor = "(I)V")
    public static void method1959(int arg0) {
        if (arg0 != 7975) {
            method1959(-66);
        }
        field4648 = null;
        field4652 = null;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(BII)V")
    public static final void method1960(byte arg0, int arg1, int arg2) {
        if (arg0 != -119) {
            field4648 = null;
        }
        class12.field230[arg2] = arg1;
        field4649++;
        class232 var3 = (class232) class137.field2256.method987(-107, (long) arg2);
        if (var3 == null) {
            class232 var4 = new class232(class188.method1355(80) + 500L);
            class137.field2256.method986((long) arg2, true, var4);
        } else {
            var3.field3925 = class188.method1355(arg0 + 17) + 500L;
        }
    }

    @OriginalMember(owner = "client!eh", name = "<init>", descriptor = "()V")
    public class280() {
    }

    @OriginalMember(owner = "client!eh", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class280(String arg0) {
        this.field4651 = arg0;
    }
}
