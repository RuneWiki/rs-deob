import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vba")
public class class38 {

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "Z")
    public static boolean field520 = false;

    @OriginalMember(owner = "client!vba", name = "e", descriptor = "[I")
    public static int[] field524 = new int[1];

    @OriginalMember(owner = "client!vba", name = "g", descriptor = "Z")
    public static boolean field526 = false;

    @OriginalMember(owner = "client!vba", name = "d", descriptor = "Lrl;")
    public static class672 field523 = new class672(16, 8);

    @OriginalMember(owner = "client!vba", name = "b", descriptor = "I")
    public static int field521;

    @OriginalMember(owner = "client!vba", name = "c", descriptor = "I")
    public static int field522;

    @OriginalMember(owner = "client!vba", name = "f", descriptor = "I")
    public static int field525;

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;")
    public static final Class method491(int arg0, String arg1) throws ClassNotFoundException {
        field522++;
        if (arg0 != 8) {
            method493((byte) 109);
        }
        if (arg1.equals("B")) {
            return Byte.TYPE;
        } else if (arg1.equals("I")) {
            return Integer.TYPE;
        } else if (arg1.equals("S")) {
            return Short.TYPE;
        } else if (arg1.equals("J")) {
            return Long.TYPE;
        } else if (arg1.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg1.equals("F")) {
            return Float.TYPE;
        } else if (arg1.equals("D")) {
            return Double.TYPE;
        } else if (arg1.equals("C")) {
            return Character.TYPE;
        } else {
            return Class.forName(arg1);
        }
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(IIFIII[FIBI)V")
    public static final void method492(int arg0, int arg1, float arg2, int arg3, int arg4, int arg5, float[] arg6, int arg7, byte arg8, int arg9) {
        int var10 = arg0 - arg5;
        if (arg8 > -22) {
            field526 = false;
        }
        field525++;
        int var11 = arg7 - arg3;
        int var12 = arg9 - arg1;
        float var13 = arg6[2] * (float) var11 + arg6[1] * (float) var12 + arg6[0] * (float) var10;
        float var14 = arg6[5] * (float) var11 + arg6[4] * (float) var12 + arg6[3] * (float) var10;
        float var15 = arg6[8] * (float) var11 + arg6[7] * (float) var12 + arg6[6] * (float) var10;
        float var16 = (float) Math.sqrt((double) (var15 * var15 + var13 * var13 + var14 * var14));
        float var17 = (float) Math.atan2((double) var13, (double) var15) / 6.2831855F + 0.5F;
        float var18 = arg2 + (float) Math.asin((double) (var14 / var16)) / 3.1415927F + 0.5F;
        if (arg4 == 1) {
            float var19 = var17;
            var17 = -var18;
            var18 = var19;
        } else if (arg4 == 2) {
            var18 = -var18;
            var17 = -var17;
        } else if (arg4 == 3) {
            float var20 = var17;
            var17 = var18;
            var18 = -var20;
        }
        class550.field7995 = var18;
        class706.field9994 = var17;
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(B)V")
    public static void method493(byte arg0) {
        if (arg0 == 84) {
            field523 = null;
            field524 = null;
        }
    }
}
