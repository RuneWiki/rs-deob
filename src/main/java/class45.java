import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public abstract class class45 {

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "[[S")
    public static short[][] field771 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!cg", name = "i", descriptor = "Lmb;")
    private static class96 field778 = class243.method1708("Created gameworld", (byte) 94);

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "Lmb;")
    public static class96 field770 = field778;

    @OriginalMember(owner = "client!cg", name = "o", descriptor = "Z")
    public static boolean field784 = false;

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "I")
    public int field772;

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "I")
    public static int field774;

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "I")
    public static int field776;

    @OriginalMember(owner = "client!cg", name = "h", descriptor = "I")
    public static int field777;

    @OriginalMember(owner = "client!cg", name = "j", descriptor = "I")
    public static int field779;

    @OriginalMember(owner = "client!cg", name = "k", descriptor = "I")
    public static int field780;

    @OriginalMember(owner = "client!cg", name = "l", descriptor = "I")
    public static int field781;

    @OriginalMember(owner = "client!cg", name = "m", descriptor = "I")
    public int field782;

    @OriginalMember(owner = "client!cg", name = "n", descriptor = "I")
    public int field783;

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "[Lnj;")
    public static class87[] field773;

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "[[[B")
    public static byte[][][] field775;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(II)I")
    public static int method348(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)Z")
    public final boolean method349(int arg0) {
        if (arg0 <= 65) {
            this.method351(126);
        }
        field777++;
        return (this.field783 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(BI)Z")
    public static final boolean method350(byte arg0, int arg1) {
        class171.field2994 = true;
        if (arg0 != 1) {
            field775 = null;
        }
        class264.field4610 = arg1 + 1 & 0xFFFF;
        field774++;
        return true;
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(I)Z")
    public final boolean method351(int arg0) {
        field776++;
        if (arg0 == 8) {
            return (this.field783 & 0x8) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "(I)Z")
    public final boolean method352(int arg0) {
        field781++;
        if (arg0 != 5281) {
            field775 = null;
        }
        return (this.field783 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "(I)Z")
    public final boolean method353(int arg0) {
        if (arg0 != 21830) {
            this.method351(-75);
        }
        field780++;
        return (this.field783 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "(I)V")
    public static void method354(int arg0) {
        field771 = null;
        field773 = null;
        field775 = null;
        if (arg0 >= -11) {
            field773 = null;
        }
        field770 = null;
        field778 = null;
    }
}
