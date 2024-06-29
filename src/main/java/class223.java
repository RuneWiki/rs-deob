import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class223 extends class101 {

    @OriginalMember(owner = "client!fd", name = "m", descriptor = "[I")
    public int[] field3395 = new int[] { 0 };

    @OriginalMember(owner = "client!fd", name = "p", descriptor = "[I")
    public int[] field3398 = new int[] { -1 };

    @OriginalMember(owner = "client!fd", name = "o", descriptor = "I")
    public static int field3397 = 0;

    @OriginalMember(owner = "client!fd", name = "n", descriptor = "Lhb;")
    public static class318 field3396 = new class318(30);

    @OriginalMember(owner = "client!fd", name = "t", descriptor = "Ltd;")
    public static class192 field3402 = new class192(16);

    @OriginalMember(owner = "client!fd", name = "r", descriptor = "I")
    public static int field3400;

    @OriginalMember(owner = "client!fd", name = "u", descriptor = "I")
    public static int field3403;

    @OriginalMember(owner = "client!fd", name = "s", descriptor = "Lle;")
    public static class127 field3401;

    @OriginalMember(owner = "client!fd", name = "q", descriptor = "[Lea;")
    public static class235[] field3399;

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "(I)V", line = 4)
    public static void method1559(int arg0) {
        field3399 = null;
        int var1 = 115 % ((arg0 + 39) / 48);
        field3396 = null;
        field3401 = null;
        field3402 = null;
    }
}
