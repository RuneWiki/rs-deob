import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class240 {

    @OriginalMember(owner = "client!id", name = "a", descriptor = "I")
    public static int field3172 = -1;

    @OriginalMember(owner = "client!id", name = "c", descriptor = "Lbr;")
    public static class192 field3174 = new class192("", 10);

    @OriginalMember(owner = "client!id", name = "f", descriptor = "[I")
    public static int[] field3177 = new int[16384];

    @OriginalMember(owner = "client!id", name = "e", descriptor = "[I")
    public static int[] field3176 = new int[16384];

    @OriginalMember(owner = "client!id", name = "b", descriptor = "I")
    public static int field3173;

    @OriginalMember(owner = "client!id", name = "d", descriptor = "I")
    public static int field3175;

    @OriginalMember(owner = "client!id", name = "g", descriptor = "J")
    public static long field3178;

    @OriginalMember(owner = "client!id", name = "h", descriptor = "[I")
    public static int[] field3179;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V")
    public static void method1487(int arg0) {
        field3174 = null;
        if (arg0 >= -117) {
            field3179 = null;
        }
        field3176 = null;
        field3179 = null;
        field3177 = null;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IZ)Z")
    public static final boolean method1488(int arg0, boolean arg1) {
        if (arg1) {
            field3177 = null;
        }
        field3173++;
        return arg0 == 0 || arg0 == 1 || arg0 == 2;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIII)I")
    public static final int method1489(int arg0, int arg1, int arg2, int arg3) {
        field3175++;
        int var4 = ((arg0 & 0xFF00FF) * arg1 & 0xFF00FF00 | (arg0 & 0xFF00) * arg1 & 0xFF0000) >>> 8;
        int var5 = 255 - arg1;
        if (arg3 != -639297016) {
            method1487(83);
        }
        return (((arg2 & 0xFF00FF) * var5 & 0xFF00FF00 | (arg2 & 0xFF00) * var5 & 0xFF0000) >>> 8) + var4;
    }

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field3176[var2] = (int) (Math.sin((double) var2 * var0) * 16384.0D);
            field3177[var2] = (int) (Math.cos((double) var2 * var0) * 16384.0D);
        }
    }
}
