import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class297 extends class307 {

    @OriginalMember(owner = "client!bd", name = "B", descriptor = "Z")
    public static boolean field4960 = true;

    @OriginalMember(owner = "client!bd", name = "F", descriptor = "[I")
    public static int[] field4964 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!bd", name = "y", descriptor = "Lqd;")
    public static class40 field4958 = class147.method1106("Texturen geladen)3", (byte) -97);

    @OriginalMember(owner = "client!bd", name = "x", descriptor = "I")
    public static int field4957;

    @OriginalMember(owner = "client!bd", name = "z", descriptor = "I")
    public int field4959;

    @OriginalMember(owner = "client!bd", name = "C", descriptor = "I")
    public static int field4961;

    @OriginalMember(owner = "client!bd", name = "D", descriptor = "I")
    public static int field4962;

    @OriginalMember(owner = "client!bd", name = "E", descriptor = "I")
    public int field4963;

    @OriginalMember(owner = "client!bd", name = "G", descriptor = "I")
    public static int field4965;

    @OriginalMember(owner = "client!bd", name = "H", descriptor = "I")
    public static int field4966;

    @OriginalMember(owner = "client!bd", name = "w", descriptor = "Lce;")
    public static class239 field4956;

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "(I)Lmb;", line = 8)
    public static final class99 method2027(int arg0) {
        int var1 = class210.field3356[0] * class102.field1802[0];
        field4957++;
        byte[] var2 = class22.field387[0];
        int[] var3 = new int[var1];
        for (int var4 = 0; var4 < var1; var4++) {
            var3[var4] = class171.field2797[class276.method1923(var2[var4], 255)];
        }
        class99 var5 = new class99(class102.field1799, class169.field2787, class12.field208[0], class256.field4265[0], class102.field1802[arg0], class210.field3356[0], var3);
        class181.method1324(-100);
        return var5;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IB)I", line = 36)
    public static final int method2028(int arg0, byte arg1) {
        field4965++;
        int var2 = 97 / ((arg1 + 79) / 35);
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(BII)I", line = 70)
    public static final int method2029(byte arg0, int arg1, int arg2) {
        int var3 = -91 / ((9 - arg0) / 47);
        field4966++;
        int var4 = class256.method1803(4, arg1 + 45365, arg2 + 91923, -120) + ((class256.method1803(2, arg1 + 10294, arg2 + 37821, 88) - 128 >> 1) - -(class256.method1803(1, arg1, arg2, 82) + -128 >> 2)) - 128;
        int var5 = (int) ((double) var4 * 0.3D) + 35;
        if (var5 < 10) {
            var5 = 10;
        } else if (var5 > 60) {
            var5 = 60;
        }
        return var5;
    }

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "(I)V", line = 89)
    public static void method2030(int arg0) {
        field4956 = null;
        field4964 = null;
        if (arg0 != -1) {
            field4961 = 106;
        }
        field4958 = null;
    }
}
