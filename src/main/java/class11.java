import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class11 extends class45 {

    @OriginalMember(owner = "client!em", name = "u", descriptor = "Lna;")
    public static class26 field148 = class69.method505(")1o", (byte) -126);

    @OriginalMember(owner = "client!em", name = "A", descriptor = "Lna;")
    public static class26 field154 = class69.method505("blinken3:", (byte) -117);

    @OriginalMember(owner = "client!em", name = "B", descriptor = "I")
    public static int field155 = 0;

    @OriginalMember(owner = "client!em", name = "z", descriptor = "Z")
    public static boolean field153 = false;

    @OriginalMember(owner = "client!em", name = "y", descriptor = "I")
    public static int field152 = 0;

    @OriginalMember(owner = "client!em", name = "r", descriptor = "I")
    public static int field145;

    @OriginalMember(owner = "client!em", name = "s", descriptor = "I")
    public static int field146;

    @OriginalMember(owner = "client!em", name = "w", descriptor = "I")
    public static int field150;

    @OriginalMember(owner = "client!em", name = "D", descriptor = "I")
    public static int field156;

    @OriginalMember(owner = "client!em", name = "x", descriptor = "Lcj;")
    public static class316 field151;

    @OriginalMember(owner = "client!em", name = "v", descriptor = "Ljava/lang/String;")
    public static String field149;

    @OriginalMember(owner = "client!em", name = "t", descriptor = "[[[I")
    public static int[][][] field147;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(Lbe;Lqf;IIIBI)V", line = 9)
    public static final void method70(class297 arg0, class148 arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        field145++;
        if (arg1 == null) {
            return;
        }
        if (arg5 != 11) {
            method72(true);
        }
        int var7 = arg3 * arg3 + (arg2 * arg2);
        int var8 = class300.field5156 + class158.field2465 & 0x7FF;
        int var9 = Math.max(arg0.field4967 / 2, arg0.field4996 / 2) + 10;
        if (var9 * var9 < var7) {
            return;
        }
        int var10 = class200.field3104[var8];
        int var11 = var10 * 256 / (class51.field797 + 256);
        int var12 = class200.field3115[var8];
        int var13 = var12 * 256 / (class51.field797 + 256);
        int var14 = arg2 * var11 + (arg3 * var13) >> 16;
        int var15 = arg2 * var13 - (arg3 * var11) >> 16;
        if (class255.field4184) {
            ((class130) arg1).method872(arg0.field4967 / 2 + arg6 + var14 - arg1.field2309 / 2, arg0.field4996 / 2 + arg4 - (arg1.field2319 / 2 + var15), (class130) arg0.method2100((byte) -113, false));
        } else {
            ((class256) arg1).method1810(arg0.field4967 / 2 + arg6 + var14 - (arg1.field2309 / 2), arg0.field4996 / 2 + arg4 + -(arg1.field2319 / 2) + -var15, arg0.field5011, arg0.field5102);
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(II)I", line = 78)
    public static final int method71(int arg0, int arg1) {
        if (arg1 != 2) {
            field148 = (class26) null;
        }
        field146++;
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(Z)V", line = 100)
    public static void method72(boolean arg0) {
        field147 = (int[][][]) null;
        field149 = null;
        field154 = null;
        field148 = null;
        field151 = null;
        if (arg0) {
            method72(true);
        }
    }
}
