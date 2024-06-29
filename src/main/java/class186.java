import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class186 extends class101 {

    @OriginalMember(owner = "client!vj", name = "n", descriptor = "Ljava/lang/String;")
    public static String field2771 = "wave:";

    @OriginalMember(owner = "client!vj", name = "t", descriptor = "Ljava/lang/String;")
    public static String field2777 = "Loaded sprites";

    @OriginalMember(owner = "client!vj", name = "v", descriptor = "Lri;")
    public static class43 field2779 = new class43();

    @OriginalMember(owner = "client!vj", name = "m", descriptor = "I")
    public static int field2770;

    @OriginalMember(owner = "client!vj", name = "o", descriptor = "I")
    public int field2772;

    @OriginalMember(owner = "client!vj", name = "p", descriptor = "I")
    public static int field2773;

    @OriginalMember(owner = "client!vj", name = "q", descriptor = "I")
    public int field2774;

    @OriginalMember(owner = "client!vj", name = "r", descriptor = "I")
    public static int field2775;

    @OriginalMember(owner = "client!vj", name = "s", descriptor = "I")
    public static int field2776;

    @OriginalMember(owner = "client!vj", name = "u", descriptor = "I")
    public int field2778;

    @OriginalMember(owner = "client!vj", name = "w", descriptor = "I")
    public static int field2780;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "([[IIIBII)I", line = 9)
    public static final int method1277(int[][] arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        if (arg3 <= 100) {
            field2780 = -50;
        }
        int var6 = (128 - arg5) * arg0[arg2][arg1 + 1] + arg0[arg2 + 1][arg1 + 1] * arg5 >> 7;
        int var7 = (128 - arg5) * arg0[arg2][arg1] + arg0[arg2 + 1][arg1] * arg5 >> 7;
        field2775++;
        return (128 - arg4) * var7 + (arg4 * var6) >> 7;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IZ)Lhm;", line = 25)
    public static final class88 method1278(int arg0, boolean arg1) {
        field2773++;
        class88 var2 = (class88) class11.field113.method2180((long) arg0, (byte) 31);
        if (var2 != null) {
            return var2;
        }
        if (!arg1) {
            field2779 = (class43) null;
        }
        byte[] var3 = class61.field819.method1441(arg0, (byte) -44, 4);
        class88 var4 = new class88();
        if (var3 != null) {
            var4.method607(new class263(var3), 117, arg0);
        }
        class11.field113.method2175((long) arg0, var4, 61);
        return var4;
    }

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "(I)V", line = 58)
    public static void method1279(int arg0) {
        field2771 = null;
        field2779 = null;
        if (arg0 > -98) {
            field2771 = (String) null;
        }
        field2777 = null;
    }
}
