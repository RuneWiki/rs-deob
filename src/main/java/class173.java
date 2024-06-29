import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class173 {

    @OriginalMember(owner = "client!vj", name = "r", descriptor = "J")
    public long field2850 = 0L;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "I")
    public static int field2833 = 0;

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "I")
    public static int field2837 = 0;

    @OriginalMember(owner = "client!vj", name = "q", descriptor = "[J")
    public static long[] field2849 = new long[32];

    @OriginalMember(owner = "client!vj", name = "u", descriptor = "[I")
    public static int[] field2853 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "I")
    public int field2835;

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "I")
    public int field2836;

    @OriginalMember(owner = "client!vj", name = "f", descriptor = "I")
    public int field2838;

    @OriginalMember(owner = "client!vj", name = "g", descriptor = "I")
    public int field2839;

    @OriginalMember(owner = "client!vj", name = "h", descriptor = "I")
    public int field2840;

    @OriginalMember(owner = "client!vj", name = "i", descriptor = "I")
    public static int field2841;

    @OriginalMember(owner = "client!vj", name = "k", descriptor = "I")
    public int field2843;

    @OriginalMember(owner = "client!vj", name = "l", descriptor = "I")
    public static int field2844;

    @OriginalMember(owner = "client!vj", name = "m", descriptor = "I")
    public int field2845;

    @OriginalMember(owner = "client!vj", name = "n", descriptor = "I")
    public int field2846;

    @OriginalMember(owner = "client!vj", name = "o", descriptor = "I")
    public int field2847;

    @OriginalMember(owner = "client!vj", name = "p", descriptor = "I")
    public static int field2848;

    @OriginalMember(owner = "client!vj", name = "s", descriptor = "I")
    public int field2851;

    @OriginalMember(owner = "client!vj", name = "v", descriptor = "I")
    public static int field2854;

    @OriginalMember(owner = "client!vj", name = "w", descriptor = "I")
    public int field2855;

    @OriginalMember(owner = "client!vj", name = "x", descriptor = "I")
    public static int field2856;

    @OriginalMember(owner = "client!vj", name = "j", descriptor = "Ltb;")
    public class184 field2842;

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "Lek;")
    public static class239 field2834;

    @OriginalMember(owner = "client!vj", name = "t", descriptor = "Z")
    public static boolean field2852;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method1155(String arg0, int arg1) {
        if (arg1 == -3634) {
            field2844++;
            return class114.method800(arg0, 10, (byte) -116, true);
        } else {
            return 60;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(I)V")
    public static void method1156(int arg0) {
        if (arg0 <= 25) {
            field2837 = 93;
        }
        field2834 = null;
        field2853 = null;
        field2849 = null;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IBII)I")
    public static final int method1157(int arg0, byte arg1, int arg2, int arg3) {
        if (arg3 > 243) {
            arg0 >>= 0x4;
        } else if (arg3 > 217) {
            arg0 >>= 0x3;
        } else if (arg3 > 192) {
            arg0 >>= 0x2;
        } else if (arg3 > 179) {
            arg0 >>= 0x1;
        }
        if (arg1 != 90) {
            method1158(-86, -73);
        }
        field2856++;
        return (arg3 >> 1) + ((arg2 >> 2 << 10) + (arg0 >> 5 << 7));
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(II)Z")
    public static final boolean method1158(int arg0, int arg1) {
        field2848++;
        int var2 = 125 / ((-arg1 - 4) / 36);
        return (-arg0 & arg0) == arg0;
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(I)V")
    public static final void method1159(int arg0) {
        class53.field923 = new class112(32);
        if (arg0 < 106) {
            method1159(-30);
        }
        field2854++;
    }

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "(I)V")
    public static final void method1160(int arg0) {
        if (arg0 > -70) {
            field2853 = null;
        }
        class247.field4056.method58(0);
        field2841++;
    }
}
