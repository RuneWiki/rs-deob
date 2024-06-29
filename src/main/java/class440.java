import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class440 {

    @OriginalMember(owner = "client!of", name = "b", descriptor = "I")
    public int field6303 = 2048;

    @OriginalMember(owner = "client!of", name = "d", descriptor = "I")
    public int field6305 = 0;

    @OriginalMember(owner = "client!of", name = "c", descriptor = "I")
    public int field6304 = 0;

    @OriginalMember(owner = "client!of", name = "e", descriptor = "I")
    public int field6306 = 2048;

    @OriginalMember(owner = "client!of", name = "f", descriptor = "I")
    public static int field6307 = 104;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "[[I")
    public static int[][] field6302 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!of", name = "h", descriptor = "I")
    public static int field6309;

    @OriginalMember(owner = "client!of", name = "i", descriptor = "I")
    public static int field6310;

    @OriginalMember(owner = "client!of", name = "g", descriptor = "Lrp;")
    public static class302 field6308;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Lfh;II)V", line = 5)
    private final void method2586(class463 arg0, int arg1, int arg2) {
        field6309++;
        if (arg1 < 106) {
            this.method2586(null, -38, -67);
        }
        if (arg2 == 1) {
            this.field6304 = arg0.method2737(false);
        } else if (arg2 == 2) {
            this.field6306 = arg0.method2758((byte) 112);
        } else if (arg2 == 3) {
            this.field6303 = arg0.method2758((byte) 108);
        } else if (arg2 == 4) {
            this.field6305 = arg0.method2791(true);
            return;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Z)V", line = 41)
    public static void method2587(boolean arg0) {
        field6302 = null;
        if (!arg0) {
            field6308 = null;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(ILfh;)V", line = 67)
    public final void method2588(int arg0, class463 arg1) {
        int var3 = -38 % ((-arg0 - 21) / 36);
        while (true) {
            int var4 = arg1.method2737(false);
            if (var4 == 0) {
                field6310++;
                return;
            }
            this.method2586(arg1, 114, var4);
        }
    }
}
