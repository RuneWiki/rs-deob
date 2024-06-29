import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vo")
public class class178 {

    @OriginalMember(owner = "client!vo", name = "d", descriptor = "Ljava/lang/String;")
    public static String field2851 = null;

    @OriginalMember(owner = "client!vo", name = "e", descriptor = "I")
    public static int field2852 = 0;

    @OriginalMember(owner = "client!vo", name = "j", descriptor = "Z")
    public static boolean field2857 = false;

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "I")
    public static int field2848;

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "I")
    public static int field2849;

    @OriginalMember(owner = "client!vo", name = "c", descriptor = "I")
    public static int field2850;

    @OriginalMember(owner = "client!vo", name = "f", descriptor = "I")
    public static int field2853;

    @OriginalMember(owner = "client!vo", name = "g", descriptor = "I")
    public static int field2854;

    @OriginalMember(owner = "client!vo", name = "h", descriptor = "I")
    public static int field2855;

    @OriginalMember(owner = "client!vo", name = "k", descriptor = "I")
    public static int field2858;

    @OriginalMember(owner = "client!vo", name = "i", descriptor = "[[[B")
    public static byte[][][] field2856;

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(II)V", line = 11)
    public static final void method1401(int arg0, int arg1) {
        if (arg1 != -1) {
            method1401(44, 56);
        }
        field2854++;
        class292.field4729.method2334(4, arg0);
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(I)V", line = 22)
    public static void method1402(int arg0) {
        field2851 = null;
        if (arg0 != 1) {
            field2858 = -29;
        }
        field2856 = (byte[][][]) null;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(IIIII)V", line = 34)
    public static final void method1403(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2849++;
        class2.field7 = -1;
        class198.field3162 = -1;
        float var5 = (float) class174.field2780 / (float) class174.field2776;
        int var6 = arg0;
        if (arg2 != 24273) {
            method1401(-97, -119);
        }
        int var7 = arg4;
        if ((var5 < 1.0F)) {
            var7 = (int) ((float) arg0 * var5);
        } else {
            var6 = (int) ((float) arg4 / var5);
        }
        int var8 = arg3 - (arg4 - var7) / 2;
        class208.field3268 = class174.field2780 * var8 / var7;
        int var9 = arg1 - (arg0 - var6) / 2;
        class350.field5551 = class174.field2776 * var9 / var6;
        class41.method268((byte) 124);
    }

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "(II)V", line = 75)
    public static final void method1404(int arg0, int arg1) {
        class326.field5176.method2334(4, arg0);
        if (arg1 != 2) {
            field2857 = true;
        }
        field2855++;
        class232.field3843.method2334(arg1 ^ 0x6, arg0);
    }
}
