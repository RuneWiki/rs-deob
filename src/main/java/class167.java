import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public class class167 extends class341 {

    @OriginalMember(owner = "client!ln", name = "g", descriptor = "[[S")
    public static short[][] field2743 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!ln", name = "j", descriptor = "I")
    public static int field2746 = 1;

    @OriginalMember(owner = "client!ln", name = "e", descriptor = "I")
    public static int field2741;

    @OriginalMember(owner = "client!ln", name = "f", descriptor = "I")
    public static int field2742;

    @OriginalMember(owner = "client!ln", name = "h", descriptor = "I")
    public static int field2744;

    @OriginalMember(owner = "client!ln", name = "i", descriptor = "I")
    public static int field2745;

    @OriginalMember(owner = "client!ln", name = "d", descriptor = "(I)V", line = 12)
    public static void method1249(int arg0) {
        int var1 = 112 / ((-arg0 - 11) / 34);
        field2743 = (short[][]) null;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lcd;I)V", line = 32)
    public static final void method1250(class136 arg0, int arg1) {
        if (class43.field586 == arg0.field2008) {
            class231.field3607[arg0.field2054] = true;
        }
        field2745++;
        if (arg1 != 412) {
            field2743 = (short[][]) ((short[][]) null);
        }
    }
}
