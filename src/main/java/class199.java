import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class199 extends class36 {

    @OriginalMember(owner = "client!cj", name = "z", descriptor = "Lma;")
    public class245 field2837;

    @OriginalMember(owner = "client!cj", name = "v", descriptor = "I")
    public static int field2833 = 0;

    @OriginalMember(owner = "client!cj", name = "x", descriptor = "Z")
    public static boolean field2835 = false;

    @OriginalMember(owner = "client!cj", name = "A", descriptor = "I")
    public static int field2838 = -1;

    @OriginalMember(owner = "client!cj", name = "F", descriptor = "I")
    public static int field2843 = 0;

    @OriginalMember(owner = "client!cj", name = "y", descriptor = "F")
    public static float field2836;

    @OriginalMember(owner = "client!cj", name = "w", descriptor = "I")
    public static int field2834;

    @OriginalMember(owner = "client!cj", name = "B", descriptor = "I")
    public static int field2839;

    @OriginalMember(owner = "client!cj", name = "D", descriptor = "I")
    public static int field2841;

    @OriginalMember(owner = "client!cj", name = "E", descriptor = "I")
    public static int field2842;

    @OriginalMember(owner = "client!cj", name = "C", descriptor = "[[[I")
    public static int[][][] field2840;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(BLkm;Lkm;)V", line = 8)
    public static final void method1411(byte arg0, class133 arg1, class133 arg2) {
        class119.field1602 = arg1;
        class160.field2207 = arg2;
        int var3 = (int) (Math.random() * 21.0D) - 10;
        field2841++;
        int var4 = -86 % ((-arg0 - 25) / 63);
        class160.field2207.method970(-65, 34);
        int var5 = (int) (Math.random() * 21.0D) - 10;
        int var6 = (int) (Math.random() * 21.0D) - 10;
        int var7 = (int) (Math.random() * 41.0D) - 20;
        class222.field3190 = var3 + var7;
        class48.field593 = var6 + var7;
        class235.field3333 = var5 + var7;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ILkm;)Z", line = 49)
    public static final boolean method1412(int arg0, class133 arg1) {
        field2834++;
        if (arg1.method961(class134.field1854, (byte) -128)) {
            return true;
        } else {
            return arg0 != -22012;
        }
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(Lma;)V", line = 63)
    public class199(class245 arg0) {
        this.field2837 = arg0;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Z)V", line = 72)
    public static void method1413(boolean arg0) {
        field2840 = (int[][][]) null;
        if (!arg0) {
            field2843 = 81;
        }
    }
}
