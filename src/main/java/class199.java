import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bv")
public class class199 extends class42 {

    @OriginalMember(owner = "client!bv", name = "t", descriptor = "I")
    public int field2763;

    @OriginalMember(owner = "client!bv", name = "x", descriptor = "I")
    public int field2767;

    @OriginalMember(owner = "client!bv", name = "r", descriptor = "I")
    public int field2761;

    @OriginalMember(owner = "client!bv", name = "p", descriptor = "Z")
    public boolean field2759;

    @OriginalMember(owner = "client!bv", name = "s", descriptor = "I")
    public int field2762;

    @OriginalMember(owner = "client!bv", name = "o", descriptor = "I")
    public int field2758;

    @OriginalMember(owner = "client!bv", name = "n", descriptor = "Lok;")
    public static class166 field2757 = new class166(10, 4);

    @OriginalMember(owner = "client!bv", name = "q", descriptor = "[I")
    public static int[] field2760 = new int[2];

    @OriginalMember(owner = "client!bv", name = "w", descriptor = "I")
    public static int field2766 = 0;

    @OriginalMember(owner = "client!bv", name = "v", descriptor = "I")
    public static int field2765 = 64;

    @OriginalMember(owner = "client!bv", name = "u", descriptor = "Ljp;")
    public static class236 field2764 = new class236(64);

    @OriginalMember(owner = "client!bv", name = "y", descriptor = "[[B")
    public static byte[][] field2768 = new byte[1000][];

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(I)V")
    public static void method1279(int arg0) {
        if (arg0 <= -70) {
            field2757 = null;
            field2764 = null;
            field2760 = null;
            field2768 = null;
        }
    }

    @OriginalMember(owner = "client!bv", name = "<init>", descriptor = "(IIIIIZ)V")
    public class199(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field2763 = arg4;
        this.field2767 = arg1;
        this.field2761 = arg3;
        this.field2759 = arg5;
        this.field2762 = arg2;
        this.field2758 = arg0;
    }
}
