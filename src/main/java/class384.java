import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uv")
public class class384 extends class41 {

    @OriginalMember(owner = "client!uv", name = "s", descriptor = "I")
    public static int field4903 = 0;

    @OriginalMember(owner = "client!uv", name = "v", descriptor = "[I")
    public static int[] field4906 = new int[] { 3, 7, 15 };

    @OriginalMember(owner = "client!uv", name = "w", descriptor = "[I")
    public static int[] field4907 = new int[32];

    @OriginalMember(owner = "client!uv", name = "z", descriptor = "I")
    public static int field4910 = -1;

    @OriginalMember(owner = "client!uv", name = "q", descriptor = "I")
    public static int field4901;

    @OriginalMember(owner = "client!uv", name = "r", descriptor = "I")
    private int field4902;

    @OriginalMember(owner = "client!uv", name = "u", descriptor = "I")
    public static int field4905;

    @OriginalMember(owner = "client!uv", name = "x", descriptor = "I")
    public static int field4908;

    @OriginalMember(owner = "client!uv", name = "y", descriptor = "I")
    public static int field4909;

    @OriginalMember(owner = "client!uv", name = "t", descriptor = "J")
    public static long field4904;

    @OriginalMember(owner = "client!uv", name = "p", descriptor = "Ljava/lang/String;")
    private String field4900;

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(ILmga;)I", line = 9)
    public static final int method2255(int arg0, class738 arg1) {
        int var2 = 18 / ((-arg0 - 54) / 38);
        field4901++;
        if (class507.field7214 == arg1) {
            return 5890;
        } else if (class606.field8160 == arg1) {
            return 34167;
        } else if (class616.field8291 == arg1) {
            return 34168;
        } else if (class555.field7718 == arg1) {
            return 34166;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(Loga;I)V", line = 49)
    public final void method331(class500 arg0, int arg1) {
        arg0.method2958(this.field4900, this.field4902, (byte) 94);
        field4905++;
        if (arg1 != 55) {
            method2257(90, (byte) -79, -100, -62, 2, 114, 90);
        }
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(ILes;)V", line = 60)
    public final void method329(int arg0, class403 arg1) {
        if (arg0 == -3999) {
            this.field4902 = arg1.method2381((byte) 69);
            field4908++;
            this.field4900 = arg1.method2384(-6435);
        }
    }

    @OriginalMember(owner = "client!uv", name = "b", descriptor = "(I)V", line = 73)
    public static void method2256(int arg0) {
        field4907 = null;
        field4906 = null;
        if (arg0 != 2) {
            field4904 = 39L;
        }
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(IBIIIII)V", line = 85)
    public static final void method2257(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4909++;
        if (arg1 >= -57) {
            field4903 = -124;
        }
        for (class707 var7 = (class707) class196.field2343.method2447(-89); var7 != null; var7 = (class707) class196.field2343.method2439(-101)) {
            if (var7.field9925 <= class228.field2707) {
                var7.method892(50560);
            } else {
                class352.method2078(arg2, (var7.field9938 << 9) + 256, arg4, var7.field9929 * 2, (var7.field9934 << 9) + 256, var7.field9937, arg0 >> 1, -128, arg6 >> 1);
                class452.field6380.method657(var7.field9928, -16777216, 0, var7.field9931 | 0xFF000000, class123.field1576[1] + arg5, class123.field1576[0] + arg3);
            }
        }
    }
}
