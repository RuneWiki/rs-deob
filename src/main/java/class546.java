import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hv")
public class class546 {

    @OriginalMember(owner = "client!hv", name = "f", descriptor = "I")
    public int field7400;

    @OriginalMember(owner = "client!hv", name = "e", descriptor = "I")
    public static int field7399 = -1;

    @OriginalMember(owner = "client!hv", name = "g", descriptor = "Z")
    public static boolean field7401 = false;

    @OriginalMember(owner = "client!hv", name = "h", descriptor = "[Lqfa;")
    public static class107[] field7402 = new class107[6];

    @OriginalMember(owner = "client!hv", name = "i", descriptor = "I")
    public static int field7403 = 0;

    @OriginalMember(owner = "client!hv", name = "b", descriptor = "I")
    public static int field7396;

    @OriginalMember(owner = "client!hv", name = "c", descriptor = "I")
    public static int field7397;

    @OriginalMember(owner = "client!hv", name = "d", descriptor = "I")
    public static int field7398;

    @OriginalMember(owner = "client!hv", name = "j", descriptor = "I")
    public static int field7404;

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "Z")
    public static boolean field7395;

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(I)V")
    public static void method3104(int arg0) {
        if (arg0 != -20212) {
            field7402 = null;
        }
        field7402 = null;
    }

    @OriginalMember(owner = "client!hv", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field7396++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(IIILor;Laa;Lvr;II)V")
    public static final void method3105(int arg0, int arg1, int arg2, class668 arg3, class514 arg4, class147 arg5, int arg6, int arg7) {
        field7397++;
        if (arg5 == null) {
            return;
        }
        int var8;
        if (class502.field6938 == 4) {
            var8 = (int) class135.field1974 & 0x3FFF;
        } else {
            var8 = (int) class135.field1974 + class594.field8116 & 0x3FFF;
        }
        int var9 = Math.max(arg3.field9282 / 2, arg3.field9297 / 2) + 10;
        int var10 = arg0 * arg0 + arg1 * arg1;
        if (var10 > (var9 * var9)) {
            return;
        }
        int var11 = class749.field10324[var8];
        int var12 = class749.field10316[var8];
        if (class502.field6938 != 4) {
            var12 = var12 * 256 / (class299.field4334 + 256);
            var11 = var11 * 256 / (class299.field4334 + 256);
        }
        int var13 = arg0 * var12 + arg1 * var11 >> 14;
        int var14 = arg1 * var12 - (arg0 * var11) >> 14;
        arg5.method1084(arg3.field9282 / 2 + arg6 + var13 - arg5.method1096() / 2, arg2 - -(arg3.field9297 / arg7) + (-var14 - arg5.method1106() / 2), arg4, arg6, arg2);
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(IIIILbba;BI)V")
    public static final void method3106(int arg0, int arg1, int arg2, int arg3, class124 arg4, byte arg5, int arg6) {
        if (arg5 != 119) {
            method3105(-111, 82, -94, null, null, null, -5, -51);
        }
        class3.method11(arg4.field2259, arg2, arg4.field2257, arg6, arg1, true, arg0, arg4.field2250, 0, arg3);
        field7398++;
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(II)I")
    public static final int method3107(int arg0, int arg1) {
        field7404++;
        double var2 = (double) ((arg0 & 0xFFA98B) >> 16) / 256.0D;
        double var4 = (double) ((arg0 & 0xFF4C) >> 8) / 256.0D;
        double var6 = (double) (arg0 & 0xFF) / 256.0D;
        double var8 = var2;
        if (var4 < var2) {
            var8 = var4;
        }
        if (arg1 != 20973) {
            method3105(14, -2, -36, null, null, null, 56, -121);
        }
        if (var8 > var6) {
            var8 = var6;
        }
        double var10 = var2;
        if (var2 < var4) {
            var10 = var4;
        }
        if (var6 > var10) {
            var10 = var6;
        }
        double var12 = 0.0D;
        double var14 = 0.0D;
        double var16 = (var8 + var10) / 2.0D;
        if (var8 != var10) {
            if (var16 < 0.5D) {
                var14 = (var10 - var8) / (var8 + var10);
            }
            if (var16 >= 0.5D) {
                var14 = (var10 - var8) / (2.0D - var10 - var8);
            }
            if (var2 == var10) {
                var12 = (var4 - var6) / (var10 - var8);
            } else if (var4 == var10) {
                var12 = (var6 - var2) / (var10 - var8) + 2.0D;
            } else if (var6 == var10) {
                var12 = (var2 - var4) / (var10 - var8) + 4.0D;
            }
        }
        double var18 = var12 / 6.0D;
        int var20 = (int) (var18 * 256.0D);
        int var21 = (int) (var14 * 256.0D);
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        int var22 = (int) (var16 * 256.0D);
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        if (var22 > 243) {
            var21 >>= 0x4;
        } else if (var22 > 217) {
            var21 >>= 0x3;
        } else if (var22 > 192) {
            var21 >>= 0x2;
        } else if (var22 > 179) {
            var21 >>= 0x1;
        }
        return ((var20 >> 2 & 0x3F) << 10) - (-(var21 >> 5 << 7) - (var22 >> 1));
    }

    @OriginalMember(owner = "client!hv", name = "<init>", descriptor = "(II)V")
    public class546(int arg0, int arg1) {
        this.field7400 = arg1;
    }
}
