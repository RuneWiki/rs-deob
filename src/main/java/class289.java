import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public class class289 {

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "I")
    public static int field3835 = 0;

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "Ljava/util/Hashtable;")
    public static Hashtable field3833 = new Hashtable();

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "I")
    public static int field3834;

    @OriginalMember(owner = "client!ao", name = "d", descriptor = "I")
    public static int field3836;

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1728(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class191.method1065(256, arg2);
        field3834++;
        int var7 = 0;
        int var8 = arg2 - arg5;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg2;
        int var10 = -arg2;
        int var11 = var8;
        if (arg0 >= -16) {
            return;
        }
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        int[] var15 = class300.field4036[arg6];
        int var16 = arg3 - var8;
        int var17 = arg3 + var8;
        class168.method980(arg4, var15, arg3 - arg2, var16, (byte) -125);
        class168.method980(arg1, var15, var16, var17, (byte) 116);
        class168.method980(arg4, var15, var17, arg3 + arg2, (byte) 53);
        while (var9 > var7) {
            var13 += 2;
            var14 += 2;
            var12 += var14;
            var10 += var13;
            if (var12 >= 0 && var11 >= 1) {
                class449.field6284[var11] = var7;
                var11--;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                if (var9 >= var8) {
                    int[] var18 = class300.field4036[arg6 + var9];
                    int[] var19 = class300.field4036[arg6 - var9];
                    int var20 = arg3 + var7;
                    int var21 = arg3 - var7;
                    class168.method980(arg4, var18, var21, var20, (byte) 94);
                    class168.method980(arg4, var19, var21, var20, (byte) 93);
                } else {
                    int[] var22 = class300.field4036[arg6 + var9];
                    int[] var23 = class300.field4036[arg6 - var9];
                    int var24 = class449.field6284[var9];
                    int var25 = arg3 + var7;
                    int var26 = arg3 - var7;
                    int var27 = arg3 + var24;
                    int var28 = arg3 - var24;
                    class168.method980(arg4, var22, var26, var28, (byte) -128);
                    class168.method980(arg1, var22, var28, var27, (byte) -123);
                    class168.method980(arg4, var22, var27, var25, (byte) -127);
                    class168.method980(arg4, var23, var26, var28, (byte) -124);
                    class168.method980(arg1, var23, var28, var27, (byte) -126);
                    class168.method980(arg4, var23, var27, var25, (byte) 33);
                }
            }
            int[] var29 = class300.field4036[arg6 + var7];
            int[] var30 = class300.field4036[arg6 - var7];
            int var31 = arg3 + var9;
            int var32 = arg3 - var9;
            if (var8 <= var7) {
                class168.method980(arg4, var29, var32, var31, (byte) 100);
                class168.method980(arg4, var30, var32, var31, (byte) -123);
            } else {
                int var33 = var11 >= var7 ? var11 : class449.field6284[var7];
                int var34 = arg3 + var33;
                int var35 = arg3 - var33;
                class168.method980(arg4, var29, var32, var35, (byte) -123);
                class168.method980(arg1, var29, var35, var34, (byte) -126);
                class168.method980(arg4, var29, var34, var31, (byte) -123);
                class168.method980(arg4, var30, var32, var35, (byte) -126);
                class168.method980(arg1, var30, var35, var34, (byte) 44);
                class168.method980(arg4, var30, var34, var31, (byte) -128);
            }
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIIIII)V")
    public static final void method1729(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 26 % ((arg5 - 74) / 42);
        for (int var7 = arg2; var7 <= arg3; var7++) {
            class168.method980(arg0, class300.field4036[var7], arg4, arg1, (byte) -125);
        }
        field3836++;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(B)V")
    public static void method1730(byte arg0) {
        field3833 = null;
        if (arg0 != -47) {
            method1728(21, -124, -34, -45, 31, -40, -29);
        }
    }
}
