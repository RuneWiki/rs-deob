import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public abstract class class328 extends class7 {

    @OriginalMember(owner = "client!ii", name = "y", descriptor = "[I")
    public static int[] field5140 = new int[4096];

    @OriginalMember(owner = "client!ii", name = "v", descriptor = "J")
    public static long field5137 = 0L;

    @OriginalMember(owner = "client!ii", name = "C", descriptor = "[[S")
    public static short[][] field5144 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!ii", name = "w", descriptor = "[Lom;")
    public static class209[] field5138 = new class209[14];

    @OriginalMember(owner = "client!ii", name = "x", descriptor = "I")
    public static int field5139;

    @OriginalMember(owner = "client!ii", name = "A", descriptor = "I")
    public static int field5142;

    @OriginalMember(owner = "client!ii", name = "B", descriptor = "I")
    public static int field5143;

    @OriginalMember(owner = "client!ii", name = "z", descriptor = "Lap;")
    public static class279 field5141;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(III)I", line = 3)
    public static final int method2176(int arg0, int arg1, int arg2) {
        int var3 = 124 / ((83 - arg2) / 32);
        field5139++;
        int var4 = 0;
        while (arg0 > 0) {
            var4 = var4 << 1 | arg1 & 0x1;
            arg1 >>>= 0x1;
            arg0--;
        }
        return var4;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(II)V", line = 31)
    public static final void method2177(int arg0, int arg1) {
        if (arg0 != -21965) {
            method2176(105, -42, -64);
        }
        field5142++;
        class51.field625.method337(arg1, (byte) -108);
    }

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "(B)V", line = 43)
    public static void method2178(byte arg0) {
        field5141 = null;
        field5144 = null;
        field5140 = null;
        int var1 = 126 % ((arg0 + 33) / 47);
        field5138 = null;
    }

    @OriginalMember(owner = "client!ii", name = "f", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method1255(int arg0);

    @OriginalMember(owner = "client!ii", name = "g", descriptor = "(I)Z")
    public abstract boolean method1256(int arg0);
}
