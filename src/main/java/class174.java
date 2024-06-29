import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class174 extends class287 {

    @OriginalMember(owner = "client!wj", name = "q", descriptor = "I")
    public int field2853;

    @OriginalMember(owner = "client!wj", name = "o", descriptor = "I")
    public int field2851;

    @OriginalMember(owner = "client!wj", name = "n", descriptor = "[I")
    public static int[] field2850 = new int[32];

    @OriginalMember(owner = "client!wj", name = "p", descriptor = "Ljava/lang/String;")
    public static String field2852 = "scroll:";

    @OriginalMember(owner = "client!wj", name = "r", descriptor = "[Ljava/lang/String;")
    public static String[] field2854 = new String[100];

    @OriginalMember(owner = "client!wj", name = "s", descriptor = "Lma;")
    public static class5 field2855 = new class5();

    @OriginalMember(owner = "client!wj", name = "v", descriptor = "[Ldl;")
    public static class29[] field2858 = new class29[29];

    @OriginalMember(owner = "client!wj", name = "l", descriptor = "I")
    public static int field2848;

    @OriginalMember(owner = "client!wj", name = "m", descriptor = "I")
    public static int field2849;

    @OriginalMember(owner = "client!wj", name = "t", descriptor = "Lcd;")
    public static class136 field2856;

    @OriginalMember(owner = "client!wj", name = "w", descriptor = "Lug;")
    public static class253 field2859;

    @OriginalMember(owner = "client!wj", name = "u", descriptor = "[[B")
    public static byte[][] field2857;

    @OriginalMember(owner = "client!wj", name = "x", descriptor = "[[[B")
    public static byte[][][] field2860;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IBIII)V", line = 8)
    public static final void method1285(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        int var5 = 126 / ((-arg1 - 91) / 32);
        if (class328.field5138 == 1) {
            class50.field642[class317.field5014 / 100].method1273(class183.field2974 - 8, class32.field479 + -8);
        }
        field2849++;
        if (class328.field5138 == 2) {
            class50.field642[class317.field5014 / 100 + 4].method1273(class183.field2974 - 8, class32.field479 + -8);
        }
        class185.method1361(115);
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IB)V", line = 28)
    public static final void method1286(int arg0, byte arg1) {
        class183.field2972[0] = (float) (class333.method2319(arg0, 16717163) >> 16) / 255.0F;
        class183.field2972[1] = (float) class333.method2319(arg0 >> 8, 255) / 255.0F;
        field2848++;
        class183.field2972[2] = (float) class333.method2319(arg0, 255) / 255.0F;
        int var2 = 101 % ((2 - arg1) / 34);
        class293.method2042(0, 3);
        class293.method2042(0, 4);
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(B)V", line = 53)
    public static void method1287(byte arg0) {
        field2850 = null;
        field2855 = null;
        field2856 = null;
        field2854 = null;
        field2859 = null;
        if (arg0 > 78) {
            field2858 = null;
            field2860 = (byte[][][]) null;
            field2857 = (byte[][]) null;
            field2852 = null;
        }
    }

    @OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(II)V", line = 71)
    public class174(int arg0, int arg1) {
        this.field2853 = arg0;
        this.field2851 = arg1;
    }
}
