import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class68 {

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "[[S")
    public static short[][] field794 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!ih", name = "h", descriptor = "[I")
    public static int[] field801 = new int[14];

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "Lc;")
    public static class284 field798 = new class284(512);

    @OriginalMember(owner = "client!ih", name = "i", descriptor = "[I")
    public static int[] field802 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "I")
    public static int field795;

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "I")
    public static int field796;

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "I")
    public static int field797;

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "I")
    public static int field799;

    @OriginalMember(owner = "client!ih", name = "g", descriptor = "I")
    public static int field800;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(B)V")
    public static void method414(byte arg0) {
        field802 = null;
        field794 = null;
        if (arg0 == 116) {
            field798 = null;
            field801 = null;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(BII)V")
    public static final void method415(byte arg0, int arg1, int arg2) {
        if (arg0 == 2) {
            class274.field4103 = arg2 - class230.field3313;
            field800++;
            class294.field4647 = class1.field1 + class133.field1940 - arg1 - 1;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IZ)Llf;")
    public static final class285 method416(int arg0, boolean arg1) {
        field796++;
        class285 var2 = (class285) class260.field3785.method65((byte) -95, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        if (!arg1) {
            field802 = null;
        }
        byte[] var3 = class123.field1770.method1861(arg0, 32, 1);
        class285 var4 = new class285();
        if (var3 != null) {
            var4.method1906(64, new class216(var3));
        }
        var4.method1904((byte) -118);
        class260.field3785.method64((long) arg0, -1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public static final void method417(int arg0, Component arg1) {
        field795++;
        arg1.removeMouseListener(class75.field899);
        arg1.removeMouseMotionListener(class75.field899);
        arg1.removeFocusListener(class75.field899);
        class79.field942 = arg0;
    }
}
