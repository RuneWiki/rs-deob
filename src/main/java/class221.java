import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class221 extends class481 {

    @OriginalMember(owner = "client!ja", name = "o", descriptor = "[I")
    public static int[] field3124;

    @OriginalMember(owner = "client!ja", name = "p", descriptor = "Lub;")
    public static class301 field3125;

    @OriginalMember(owner = "client!ja", name = "q", descriptor = "I")
    public static int field3126;

    @OriginalMember(owner = "client!ja", name = "r", descriptor = "[I")
    public static int[] field3127;

    @OriginalMember(owner = "client!ja", name = "i", descriptor = "I")
    public int field3118;

    @OriginalMember(owner = "client!ja", name = "j", descriptor = "I")
    public int field3119;

    @OriginalMember(owner = "client!ja", name = "l", descriptor = "I")
    public int field3121;

    @OriginalMember(owner = "client!ja", name = "m", descriptor = "I")
    public static int field3122;

    @OriginalMember(owner = "client!ja", name = "n", descriptor = "I")
    public int field3123;

    @OriginalMember(owner = "client!ja", name = "k", descriptor = "Ldc;")
    public class16 field3120;

    static {
        new class157(null, "geschickt werden.", null, null);
        field3124 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };
        field3125 = new class301("", 17);
        field3126 = 0;
        field3127 = new int[16];
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(I)V", line = 9)
    public static void method1379(int arg0) {
        if (arg0 != -710107536) {
            field3124 = null;
        }
        field3125 = null;
        field3127 = null;
        field3124 = null;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIII)I", line = 23)
    public static final int method1380(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3122++;
        int var5 = -126 % ((69 - arg4) / 45);
        int var6 = 65536 - class51.field731[arg0 * 8192 / arg1] >> 1;
        return ((65536 - var6) * arg3 >> 16) + (arg2 * var6 >> 16);
    }
}
