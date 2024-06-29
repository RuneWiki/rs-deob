import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wq")
public class class33 extends class393 {

    @OriginalMember(owner = "client!wq", name = "p", descriptor = "I")
    public int field549;

    @OriginalMember(owner = "client!wq", name = "s", descriptor = "I")
    public int field552;

    @OriginalMember(owner = "client!wq", name = "m", descriptor = "[I")
    public static int[] field546 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!wq", name = "n", descriptor = "I")
    public static int field547 = 0;

    @OriginalMember(owner = "client!wq", name = "q", descriptor = "[I")
    public static int[] field550 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!wq", name = "r", descriptor = "I")
    public static int field551 = 0;

    @OriginalMember(owner = "client!wq", name = "o", descriptor = "I")
    public static int field548;

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(IIIB)V")
    public static final void method276(int arg0, int arg1, int arg2, byte arg3) {
        int var4 = arg0 << 3;
        int var5 = arg2 << 3;
        if (arg3 <= 0) {
            method276(-96, 34, 91, (byte) 91);
        }
        int var6 = arg1 << 3;
        field548++;
        class170.field2244 = (float) var6;
        if (class5.field48 == 2) {
            class265.field3878 = var4;
            class179.field2364 = var6;
            class277.field4070 = var5;
        }
        class155.field2027 = (float) var4;
        class134.method903(-4);
        class91.field1263 = true;
    }

    @OriginalMember(owner = "client!wq", name = "b", descriptor = "(I)V")
    public static void method277(int arg0) {
        int var1 = -27 / ((-arg0 - 60) / 61);
        field550 = null;
        field546 = null;
    }

    @OriginalMember(owner = "client!wq", name = "<init>", descriptor = "(II)V")
    public class33(int arg0, int arg1) {
        this.field549 = arg1;
        this.field552 = arg0;
    }
}
