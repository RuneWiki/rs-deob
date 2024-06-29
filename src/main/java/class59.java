import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class59 {

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "[I")
    public static int[] field1135 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "Leh;")
    public static class47 field1138 = class195.method1282((byte) -4, " zuerst von Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "[Z")
    public static boolean[] field1139 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false };

    @OriginalMember(owner = "client!gb", name = "h", descriptor = "Leh;")
    public static class47 field1142 = class195.method1282((byte) -4, "Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q");

    @OriginalMember(owner = "client!gb", name = "j", descriptor = "Leh;")
    public static class47 field1144 = class195.method1282((byte) -4, "<img=0>");

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "[[S")
    public static short[][] field1140 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "Leh;")
    public static class47 field1137 = class195.method1282((byte) -4, "scrollen:");

    @OriginalMember(owner = "client!gb", name = "m", descriptor = "Leh;")
    public static class47 field1147 = class195.method1282((byte) -4, "::qa_op_test");

    @OriginalMember(owner = "client!gb", name = "n", descriptor = "Leh;")
    public static class47 field1148 = class195.method1282((byte) -4, "null");

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "I")
    public static int field1141;

    @OriginalMember(owner = "client!gb", name = "k", descriptor = "I")
    public static int field1145;

    @OriginalMember(owner = "client!gb", name = "l", descriptor = "I")
    public static int field1146;

    @OriginalMember(owner = "client!gb", name = "i", descriptor = "J")
    public static long field1143;

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "Lsf;")
    public static class168 field1136;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)V")
    public static void method503(int arg0) {
        field1144 = null;
        field1140 = null;
        field1137 = null;
        field1139 = null;
        field1138 = null;
        field1136 = null;
        if (arg0 != 5681) {
            field1147 = null;
        }
        field1135 = null;
        field1142 = null;
        field1148 = null;
        field1147 = null;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Z)V")
    public static final void method504(boolean arg0) {
        field1146++;
        Object var1 = class40.field803;
        synchronized (class40.field803) {
            if (class51.field988 != 0) {
                class51.field988 = 1;
                try {
                    class40.field803.wait();
                } catch (InterruptedException var2) {
                }
            }
        }
        if (arg0) {
            method504(false);
        }
    }
}
