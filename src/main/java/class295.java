import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cha")
public class class295 extends class337 {

    @OriginalMember(owner = "client!cha", name = "v", descriptor = "[F")
    public static float[] field3750 = new float[4];

    @OriginalMember(owner = "client!cha", name = "l", descriptor = "I")
    public int field3740;

    @OriginalMember(owner = "client!cha", name = "o", descriptor = "I")
    public static int field3743;

    @OriginalMember(owner = "client!cha", name = "r", descriptor = "I")
    public int field3746;

    @OriginalMember(owner = "client!cha", name = "p", descriptor = "[I")
    public int[] field3744;

    @OriginalMember(owner = "client!cha", name = "q", descriptor = "[I")
    public int[] field3745;

    @OriginalMember(owner = "client!cha", name = "t", descriptor = "[I")
    public static int[] field3748;

    @OriginalMember(owner = "client!cha", name = "u", descriptor = "[I")
    public int[] field3749;

    @OriginalMember(owner = "client!cha", name = "m", descriptor = "[Ltba;")
    public class339[] field3741;

    @OriginalMember(owner = "client!cha", name = "n", descriptor = "[Ltba;")
    public class339[] field3742;

    @OriginalMember(owner = "client!cha", name = "s", descriptor = "[[[B")
    public byte[][][] field3747;

    @OriginalMember(owner = "client!cha", name = "a", descriptor = "(ILid;)Z", line = 5)
    public static final boolean method1768(int arg0, class486 arg1) {
        if (arg0 != 4) {
            field3748 = null;
        }
        field3743++;
        return arg1 == null ? false : class726.method3884(arg1.field6272 - arg1.field6265, -arg1.field6262 + arg1.field6266, arg1.field6255, arg1.field6262, arg1.field6265, -1, arg1.field6260 - arg1.field6255);
    }

    @OriginalMember(owner = "client!cha", name = "a", descriptor = "(I)V", line = 29)
    public static void method1769(int arg0) {
        field3748 = null;
        if (arg0 == 4) {
            field3750 = null;
        }
    }
}
