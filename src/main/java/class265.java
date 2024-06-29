import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public abstract class class265 {

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "[[S")
    public static short[][] field4668 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "I")
    public static int field4667;

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "I")
    public static int field4669;

    @OriginalMember(owner = "client!rk", name = "f", descriptor = "I")
    public static int field4671;

    @OriginalMember(owner = "client!rk", name = "g", descriptor = "I")
    public static int field4672;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "[I")
    public static int[] field4666;

    @OriginalMember(owner = "client!rk", name = "e", descriptor = "[[[I")
    public static int[][][] field4670;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIIIIIIIJILla;)V")
    public abstract void method427(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class95 arg10);

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IZ)Lmi;")
    public static final class255 method1785(int arg0, boolean arg1) {
        class255 var2 = (class255) class93.field1510.method1480((byte) 50, (long) arg0);
        field4669++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class112.field1850.method1258(class244.method1658(arg0, (byte) -128), class83.method598(arg0, -157), (byte) 109);
        class255 var4 = new class255();
        var4.field4526 = arg0;
        if (!arg1) {
            method1785(41, true);
        }
        if (var3 != null) {
            var4.method1723((byte) -84, new class25(var3));
        }
        var4.method1728(-1);
        class93.field1510.method1483((byte) -103, (long) arg0, var4);
        return var4;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(III)Lrk;")
    public class265 method828(int arg0, int arg1, int arg2) {
        field4667++;
        return this;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "()Z")
    public boolean method825() {
        field4671++;
        return false;
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "()I")
    public abstract int method426();

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIIII)V")
    public abstract void method429(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Lrk;IIIZ)V")
    public void method827(class265 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field4672++;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Z)V")
    public static void method1786(boolean arg0) {
        field4666 = null;
        field4668 = null;
        if (!arg0) {
            field4670 = null;
        }
    }
}
