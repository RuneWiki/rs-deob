import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wfa")
public class class187 {

    @OriginalMember(owner = "client!wfa", name = "e", descriptor = "I")
    public int field2211 = -1;

    @OriginalMember(owner = "client!wfa", name = "b", descriptor = "[[[I")
    public static int[][][] field2208 = new int[2][][];

    @OriginalMember(owner = "client!wfa", name = "g", descriptor = "[Z")
    public static boolean[] field2213 = new boolean[8];

    @OriginalMember(owner = "client!wfa", name = "f", descriptor = "I")
    public static int field2212;

    @OriginalMember(owner = "client!wfa", name = "h", descriptor = "I")
    public static int field2214;

    @OriginalMember(owner = "client!wfa", name = "c", descriptor = "Ljg;")
    public class317 field2209;

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "[I")
    public int[] field2207;

    @OriginalMember(owner = "client!wfa", name = "d", descriptor = "[Ljava/lang/String;")
    public String[] field2210;

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(I)V")
    public static void method1108(int arg0) {
        field2213 = null;
        field2208 = null;
        if (arg0 != -7152) {
            field2208 = null;
        }
    }

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(FFIF)I")
    public static final int method1109(float arg0, float arg1, int arg2, float arg3) {
        field2214++;
        if (arg2 != 2) {
            return 118;
        }
        float var4 = arg3 < 0.0F ? -arg3 : arg3;
        float var5 = arg0 < 0.0F ? -arg0 : arg0;
        float var6 = arg1 < 0.0F ? -arg1 : arg1;
        if (var5 > var4 && var5 > var6) {
            return (arg0 > 0.0F) ? 0 : 1;
        } else if (var4 < var6 && var6 > var5) {
            return arg1 > 0.0F ? 2 : 3;
        } else if ((arg3 > 0.0F)) {
            return 4;
        } else {
            return 5;
        }
    }

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(II)Z")
    public static final boolean method1110(int arg0, int arg1) {
        int var2 = 77 % (-arg1 / 57);
        field2212++;
        return arg0 >= 12 && arg0 <= 17;
    }
}
