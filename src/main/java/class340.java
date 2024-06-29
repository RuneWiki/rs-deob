import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class340 {

    @OriginalMember(owner = "client!n", name = "b", descriptor = "[J")
    public static long[] field4641 = new long[32];

    @OriginalMember(owner = "client!n", name = "e", descriptor = "Z")
    public static boolean field4644 = false;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "[[I")
    public static int[][] field4640 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!n", name = "c", descriptor = "I")
    public static int field4642;

    @OriginalMember(owner = "client!n", name = "d", descriptor = "Ljk;")
    public static class117 field4643;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(III)V")
    public static final void method2179(int arg0, int arg1, int arg2) {
        field4642++;
        int var3 = class143.field1684.field2480[0];
        int var4 = class143.field1684.field2482[arg2];
        if (class31.field356 == 1) {
            if (!class94.method586(arg1, 1, arg0, -2, var3, 1, 1, 0, false, var4, 0)) {
                class94.method586(arg1, arg2 + 1, arg0, -3, var3, 1, 1, 0, false, var4, 0);
            }
        } else if (!class94.method586(arg1, 1, arg0, -3, var3, 1, 1, 0, false, var4, 0)) {
            class94.method586(arg1, 1, arg0, -2, var3, 1, 1, 0, false, var4, 0);
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(B)V")
    public static void method2180(byte arg0) {
        field4640 = null;
        if (arg0 != -100) {
            field4643 = null;
        }
        field4643 = null;
        field4641 = null;
    }
}
