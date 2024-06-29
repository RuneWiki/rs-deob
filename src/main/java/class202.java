import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class202 {

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "Lcq;")
    public static class72 field2377 = new class72("Allocated memory", "Zugewiesener Speicher.", "Mémoire attribuée", "Memória alocada");

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "[I")
    public static int[] field2378 = new int[100];

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "[I")
    public static int[] field2381 = new int[] { 0, 0, 7, 0, 0, 0, 10, 0, 6, 10, 0, 6, 0, 0, -1, 0, 0, 0, 0, 1, 0, -2, 0, 0, -1, 3, 0, 3, 0, 0, -1, 0, 12, 20, 0, 6, 3, -2, 0, 0, -1, 0, 0, 0, 6, 0, -1, 0, -2, 0, 8, 0, 3, 0, 0, -2, 2, 0, 0, 0, 0, 0, 8, 0, 0, 0, 11, 0, 0, 0, 0, 0, 0, 0, 6, 0, 8, -2, 0, 17, 0, 0, 6, 15, 5, -1, 0, 0, 0, -1, 8, 0, 0, 0, 0, -2, -1, 0, 4, 0, 5, 0, 3, 2, 8, 0, 6, -1, 0, 0, 0, 0, 8, -1, 0, 0, 6, 0, 7, 7, 0, 0, 0, 0, 1, 8, 0, 0, 0, -1, 6, 8, 0, 2, 0, 0, 0, 0, 0, 6, 3, -1, 0, 6, 0, 0, 0, 0, 0, 2, 10, 0, -1, 8, 0, 0, 0, 5, 4, 14, 0, 0, 14, 0, 0, 15, 0, -2, 0, 0, 0, 3, 0, 1, -1, 4, 0, 7, 0, 0, 0, 0, 0, 12, 0, -2, 0, 0, 0, -1, 2, 12, 0, 0, 0, 3, 0, 12, 0, 0, 2, 8, -1, 0, 0, 6, 0, 0, 0, 0, -2, 0, 0, 0, 1, 8, 2, -2, 0, 0, 0, 0, 0, 0, -2, 0, 3, -2, 1, 0, 0, 10, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 28, 0, 0, 2, 0, -1, 9, 0, -1, -2, 12, 0, 0 };

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "Laq;")
    public static class453 field2382 = null;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "I")
    public static int field2376;

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "I")
    public static int field2380;

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "[I")
    public static int[] field2379;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Laq;IB)I")
    public static final int method1240(class453 arg0, int arg1, byte arg2) {
        if (arg2 >= -9) {
            field2382 = null;
        }
        field2376++;
        if (!client.method2696(arg0).method2256(-69, arg1) && arg0.field6396 == null) {
            return -1;
        } else if (arg0.field6317 == null || arg0.field6317.length <= arg1) {
            return -1;
        } else {
            return arg0.field6317[arg1];
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)V")
    public static void method1241(byte arg0) {
        field2382 = null;
        field2379 = null;
        field2377 = null;
        field2378 = null;
        if (arg0 < -78) {
            field2381 = null;
        }
    }
}
