import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public abstract class class276 extends class11 {

    @OriginalMember(owner = "client!w", name = "v", descriptor = "I")
    public static int field3863 = 0;

    @OriginalMember(owner = "client!w", name = "x", descriptor = "I")
    public static int field3865 = 0;

    @OriginalMember(owner = "client!w", name = "w", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field3864 = new BigInteger("10001", 16);

    @OriginalMember(owner = "client!w", name = "t", descriptor = "I")
    public static int field3861;

    @OriginalMember(owner = "client!w", name = "u", descriptor = "I")
    public static int field3862;

    @OriginalMember(owner = "client!w", name = "y", descriptor = "I")
    public static int field3866;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(I)V")
    public static void method1673(int arg0) {
        if (arg0 > -102) {
            field3863 = -39;
        }
        field3864 = null;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIILoa;II[[[BIIIBI)V")
    public static final void method1674(int arg0, int arg1, int arg2, int arg3, class651 arg4, int arg5, int arg6, byte[][][] arg7, int arg8, int arg9, int arg10, byte arg11, int arg12) {
        field3861++;
        if (arg12 == 0 || arg3 == 0) {
            return;
        }
        if (arg12 == 9) {
            arg12 = 1;
            arg5 = arg5 + 1 & 0x3;
        }
        if (arg11 > -21) {
            method1673(-17);
        }
        if (arg12 == 10) {
            arg5 = arg5 + 3 & 0x3;
            arg12 = 1;
        }
        if (arg12 == 11) {
            arg5 = arg5 + 3 & 0x3;
            arg12 = 8;
        }
        arg4.method395(arg9, arg1, arg6, arg8, arg2, arg10, arg7[arg12 - 1][arg5], arg3, arg0);
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(IIII)V")
    public static final void method1675(int arg0, int arg1, int arg2, int arg3) {
        field3866++;
        class170 var4 = class105.field1570[arg3][arg1];
        if (arg2 <= 16) {
            field3863 = 61;
        }
        class486.method2721(arg0, -31417, var4 == null ? class10.field199 : var4);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(ILoa;IIII)V")
    public static final void method1676(int arg0, class651 arg1, int arg2, int arg3, int arg4, int arg5) {
        field3862++;
        arg1.method421(arg5, arg4, arg3 + arg5, arg4 - -arg0);
        arg1.method3567(arg3, arg5, arg0, arg4, -16777216, (byte) 108);
        if (class699.field9827 < 100) {
            return;
        }
        float var6 = (float) class567.field7528 / (float) class567.field7513;
        int var7 = arg3;
        int var8 = arg0;
        if (var6 < 1.0F) {
            var8 = (int) ((float) arg3 * var6);
        } else {
            var7 = (int) ((float) arg0 / var6);
        }
        int var9 = (arg3 - var7) / 2 + arg5;
        int var10 = (arg0 - var8) / 2 + arg4;
        if (class516.field6894 == null || arg3 != class516.field6894.method1035() || class516.field6894.method1028() != arg0) {
            class567.method3109(class567.field7515, class567.field7529 + class567.field7528, class567.field7515 + class567.field7513, class567.field7529, var9, var10, var7 + var9, var8 + var10);
            class567.method3111(arg1);
            class516.field6894 = arg1.method426(var9, var10, var7, var8, false);
        }
        class516.field6894.method2637(var9, var10);
        int var11 = class34.field532 * var7 / class567.field7513;
        int var12 = class227.field3194 * var8 / class567.field7528;
        if (arg2 != -29052) {
            return;
        }
        int var13 = var9 + (class393.field5175 * var7 / class567.field7513);
        int var14 = var8 + var10 - class576.field7610 * var8 / class567.field7528 - var12;
        int var15 = -1996554240;
        if (class488.field6599 == class392.field5166) {
            var15 = -1996488705;
        }
        arg1.method415(var13, var14, var11, var12, var15, 1);
        arg1.method423(var13, var14, var11, var12, var15, 0);
        if (class665.field9428 <= 0) {
            return;
        }
        int var16;
        if (class412.field5653 > 50) {
            var16 = 500 - class412.field5653 * 5;
        } else {
            var16 = class412.field5653 * 5;
        }
        for (class20 var17 = (class20) class567.field7508.method3257(-116); var17 != null; var17 = (class20) class567.field7508.method3263((byte) -126)) {
            class634 var18 = class567.field7498.method1487(var17.field317, (byte) 115);
            if (class332.method1973(var18, (byte) -123)) {
                if (class96.field1461 == var17.field317) {
                    int var19 = var17.field319 * var7 / class567.field7513 + var9;
                    int var20 = (class567.field7528 - var17.field324) * var8 / class567.field7528 + var10;
                    arg1.method3567(4, var19 - 2, 4, var20 - 2, var16 << 24 | 0xFFFF00, (byte) 103);
                } else if (class345.field4753 != -1 && class345.field4753 == var18.field8516) {
                    int var21 = var17.field319 * var7 / class567.field7513 + var9;
                    int var22 = var10 + ((class567.field7528 - var17.field324) * var8 / class567.field7528);
                    arg1.method3567(4, var21 - 2, 4, var22 - 2, var16 << 24 | 0xFFFF00, (byte) 102);
                }
            }
        }
    }
}
