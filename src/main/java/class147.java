import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public abstract class class147 {

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "I")
    public static volatile int field2497 = 0;

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "Ljd;")
    public static class85 field2498 = class221.method1499("Lade Benutzeroberfl-=che )2 ", (byte) -74);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "I")
    public static int field2496 = -1;

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "[[S")
    public static short[][] field2500 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "B")
    public static byte field2499;

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "I")
    public static int field2501;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)V")
    public static void method959(int arg0) {
        if (arg0 == 4500) {
            field2500 = null;
            field2498 = null;
        }
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(I)V")
    public static final void method960(int arg0) {
        if (arg0 <= 77) {
            method959(-76);
        }
        field2501++;
        class127.field2218.method1270((byte) 107);
        class221.field3875.method1270((byte) 107);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public abstract void method961(int arg0, Component arg1);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public abstract void method962(Component arg0, byte arg1);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(B)I")
    public abstract int method963(byte arg0);
}
