import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class416 extends class45 {

    @OriginalMember(owner = "client!mg", name = "p", descriptor = "J")
    public long field6108;

    @OriginalMember(owner = "client!mg", name = "k", descriptor = "[I")
    public static int[] field6103 = new int[99];

    @OriginalMember(owner = "client!mg", name = "n", descriptor = "I")
    public static int field6106 = 3;

    @OriginalMember(owner = "client!mg", name = "o", descriptor = "I")
    public static int field6107 = 0;

    @OriginalMember(owner = "client!mg", name = "q", descriptor = "I")
    public static int field6109 = 0;

    @OriginalMember(owner = "client!mg", name = "u", descriptor = "Z")
    public static boolean field6113;

    @OriginalMember(owner = "client!mg", name = "r", descriptor = "J")
    public static long field6110;

    @OriginalMember(owner = "client!mg", name = "v", descriptor = "I")
    public static int field6114;

    @OriginalMember(owner = "client!mg", name = "s", descriptor = "I")
    public static int field6111;

    @OriginalMember(owner = "client!mg", name = "t", descriptor = "[Ljava/awt/Color;")
    public static Color[] field6112;

    @OriginalMember(owner = "client!mg", name = "l", descriptor = "I")
    public static int field6104;

    @OriginalMember(owner = "client!mg", name = "m", descriptor = "I")
    public static int field6105;

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) (Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D + (double) var2);
            var0 += var3;
            field6103[var1] = var0 / 4;
        }
        field6113 = false;
        field6110 = 0L;
        field6114 = 1;
        field6111 = 0;
        field6112 = new Color[] { new Color(9179409), new Color(3289650) };
    }

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "(I)V", line = 12)
    public static void method2648(int arg0) {
        if (arg0 > 80) {
            field6103 = null;
            field6112 = null;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIIIIIIIIZ)V", line = 31)
    public static final void method2649(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
        if (!arg9) {
            method2651();
        }
        if (arg1 == arg4 && arg0 == arg6 && arg5 == arg8 && arg2 == arg7) {
            class318.method2144(arg1, (byte) 83, arg0, arg3, arg7, arg5);
        } else {
            int var10 = arg1;
            int var11 = arg0;
            int var12 = arg1 * 3;
            int var13 = arg0 * 3;
            int var14 = arg4 * 3;
            int var15 = arg6 * 3;
            int var16 = arg8 * 3;
            int var17 = arg2 * 3;
            int var18 = var14 + arg5 - var16 - arg1;
            int var19 = arg7 + var15 - var17 - arg0;
            int var20 = var16 + var12 - var14 - var14;
            int var21 = var17 + var13 - var15 - var15;
            int var22 = var14 - var12;
            int var23 = var15 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var21 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = arg1 + (var29 + var31 + var27 >> 12);
                int var34 = arg0 + (var28 + var32 + var30 >> 12);
                class318.method2144(var10, (byte) 83, var11, arg3, var34, var33);
                var10 = var33;
                var11 = var34;
            }
        }
        field6105++;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(ILlm;BI)Lln;", line = 107)
    public static final class252 method2650(int arg0, class347 arg1, byte arg2, int arg3) {
        field6104++;
        class228 var4 = new class228(arg1.method2261(arg3, arg0, 88));
        class252 var5 = new class252(arg3, var4.method1329(991328496), var4.method1329(991328496), var4.method1344((byte) 55), var4.method1344((byte) 90), var4.method1348(-111) == 1, var4.method1348(-123));
        int var6 = -53 / ((arg2 - 78) / 44);
        int var7 = var4.method1348(-95);
        for (int var8 = 0; var8 < var7; var8++) {
            var5.field3467.method330(new class376(var4.method1348(-123), var4.method1343(255), var4.method1343(255), var4.method1343(255), var4.method1343(255), var4.method1343(255), var4.method1343(255), var4.method1343(255), var4.method1343(255)), -2130841184);
        }
        var5.method1527(-76);
        return var5;
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "()V", line = 137)
    public class416() {
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "()V", line = 143)
    public static final void method2651() {
        class354.method2325(1, class180.field2380);
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(J)V", line = 148)
    public class416(long arg0) {
        this.field6108 = arg0;
    }
}
