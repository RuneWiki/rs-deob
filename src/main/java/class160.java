import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tba")
public class class160 implements class666 {

    @OriginalMember(owner = "client!tba", name = "c", descriptor = "I")
    public int field2204;

    @OriginalMember(owner = "client!tba", name = "d", descriptor = "I")
    public int field2205;

    @OriginalMember(owner = "client!tba", name = "f", descriptor = "[F")
    public float[] field2207;

    @OriginalMember(owner = "client!tba", name = "e", descriptor = "[I")
    public static int[] field2206 = new int[1];

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "D")
    public static double field2202;

    @OriginalMember(owner = "client!tba", name = "b", descriptor = "I")
    public static int field2203;

    @OriginalMember(owner = "client!tba", name = "g", descriptor = "I")
    public static int field2208;

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(IB)Z")
    public static final boolean method1057(int arg0, byte arg1) {
        field2208++;
        if (arg1 == 120) {
            return arg0 == 0 || arg0 == 2;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(B)V")
    public static void method1058(byte arg0) {
        field2206 = null;
        if (arg0 <= 12) {
            field2206 = null;
        }
    }

    @OriginalMember(owner = "client!tba", name = "<init>", descriptor = "(II)V")
    public class160(int arg0, int arg1) {
        this.field2204 = arg0;
        this.field2205 = arg1;
        this.field2207 = new float[arg0 * arg1];
    }
}
