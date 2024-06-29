import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class430 {

    @OriginalMember(owner = "client!rj", name = "g", descriptor = "I")
    public int field6186;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "[I")
    public static int[] field6180 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

    @OriginalMember(owner = "client!rj", name = "e", descriptor = "I")
    public static int field6184 = 0;

    @OriginalMember(owner = "client!rj", name = "f", descriptor = "[I")
    public static int[] field6185 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "I")
    public static int field6181;

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "I")
    public static int field6182;

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "I")
    public static int field6183;

    @OriginalMember(owner = "client!rj", name = "h", descriptor = "[[I")
    public static int[][] field6187;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(B)V", line = 8)
    public static void method2550(byte arg0) {
        field6185 = null;
        field6180 = null;
        if (arg0 > -25) {
            method2550((byte) 78);
        }
        field6187 = null;
    }

    @OriginalMember(owner = "client!rj", name = "toString", descriptor = "()Ljava/lang/String;", line = 24)
    public final String toString() {
        field6183++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 45)
    public class430(String arg0, int arg1) {
        this.field6186 = arg1;
    }
}
