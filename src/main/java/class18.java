import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class18 {

    @OriginalMember(owner = "client!k", name = "e", descriptor = "[[[I")
    public static int[][][] field248 = new int[2][][];

    @OriginalMember(owner = "client!k", name = "b", descriptor = "I")
    public static int field245 = 0;

    @OriginalMember(owner = "client!k", name = "c", descriptor = "I")
    public static int field246;

    @OriginalMember(owner = "client!k", name = "d", descriptor = "I")
    public static int field247;

    @OriginalMember(owner = "client!k", name = "f", descriptor = "I")
    public static int field249;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "[I")
    public static int[] field244;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(B)V", line = 8)
    public static final void method141(byte arg0) {
        int var1 = 0;
        if (arg0 != -56) {
            field245 = 38;
        }
        while (var1 < 5) {
            class267.field4166[var1] = false;
            var1++;
        }
        class30.field442 = 0;
        class7.field82 = -1;
        class7.field84 = -1;
        field246++;
        class178.field2692 = 1;
        class300.field4687 = 0;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(I)V", line = 34)
    public static void method142(int arg0) {
        field244 = null;
        field248 = (int[][][]) null;
        if (arg0 <= 86) {
            field244 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IB)I", line = 63)
    public static final int method143(int arg0, byte arg1) {
        if (arg1 != 51) {
            return 6;
        }
        field247++;
        if (arg0 <= 0) {
            return arg0 < 0 ? -1 : 0;
        } else {
            return 1;
        }
    }
}
