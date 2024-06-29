import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class313 {

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "Lna;")
    public static class26 field5347 = class69.method505("::breakcon", (byte) -118);

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "Lna;")
    private static class26 field5344 = class69.method505("You can(Wt add yourself to your own ignore list)3", (byte) -118);

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "Lna;")
    public static class26 field5343 = class69.method505("um", (byte) -118);

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "Lna;")
    public static class26 field5345 = field5344;

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "I")
    public static int field5346 = 0;

    @OriginalMember(owner = "client!nb", name = "j", descriptor = "I")
    public static volatile int field5352 = -1;

    @OriginalMember(owner = "client!nb", name = "m", descriptor = "Lna;")
    public static class26 field5355 = class69.method505("logo", (byte) -119);

    @OriginalMember(owner = "client!nb", name = "n", descriptor = "Lna;")
    public static class26 field5356 = class69.method505("details", (byte) -123);

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "I")
    public static int field5348;

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "I")
    public static int field5349;

    @OriginalMember(owner = "client!nb", name = "h", descriptor = "I")
    public static int field5350;

    @OriginalMember(owner = "client!nb", name = "k", descriptor = "I")
    public static int field5353;

    @OriginalMember(owner = "client!nb", name = "l", descriptor = "I")
    public static int field5354;

    @OriginalMember(owner = "client!nb", name = "o", descriptor = "I")
    public static int field5357;

    @OriginalMember(owner = "client!nb", name = "p", descriptor = "I")
    public static int field5358;

    @OriginalMember(owner = "client!nb", name = "i", descriptor = "Lqf;")
    public static class148 field5351;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V", line = 8)
    public static void method2172(int arg0) {
        field5345 = null;
        field5351 = null;
        field5356 = null;
        field5343 = null;
        field5355 = null;
        if (arg0 != 3) {
            field5352 = -18;
        }
        field5344 = null;
        field5347 = null;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIIIIIIII)V", line = 34)
    public static final void method2173(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field5354++;
        if (arg3 != 3) {
            method2172(45);
        }
        if (arg0 == arg1 && arg2 == arg9 && arg7 == arg8 && arg5 == arg6) {
            class126.method861(arg4, arg3 - 111, arg5, arg0, arg9, arg7);
            return;
        }
        int var10 = arg0;
        int var11 = arg9 * 3;
        int var12 = arg0 * 3;
        int var13 = arg9;
        int var14 = arg1 * 3;
        int var15 = arg2 * 3;
        int var16 = arg8 * 3;
        int var17 = arg6 * 3;
        int var18 = arg7 + var14 - (arg0 + var16);
        int var19 = var16 + var12 - (var14 + var14);
        int var20 = arg5 + var15 - arg9 - var17;
        int var21 = var11 + var17 - var15 - var15;
        int var22 = var14 - var12;
        int var23 = var15 - var11;
        for (int var24 = 128; var24 <= 4096; var24 += 128) {
            int var25 = var24 * var24 >> 12;
            int var26 = var24 * var25 >> 12;
            int var27 = var21 * var25;
            int var28 = var20 * var26;
            int var29 = var19 * var25;
            int var30 = var18 * var26;
            int var31 = var22 * var24;
            int var32 = arg0 + (var30 + var31 + var29 >> 12);
            int var33 = var23 * var24;
            int var34 = arg9 + (var28 + var33 + var27 >> 12);
            class126.method861(arg4, -88, var34, var10, var13, var32);
            var10 = var32;
            var13 = var34;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIIII)V", line = 115)
    public static final void method2174(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field5349++;
        if (arg4 != -26571) {
            method2176(92, 25);
        }
        if (arg1 == arg5) {
            class215.method1435(arg5, arg2, arg0, arg3, (byte) -47);
        } else if (class225.field3572 <= arg2 - arg5 && arg2 + arg5 <= class27.field454 && arg3 - arg1 >= class80.field1259 && (arg3 + arg1) <= class117.field1840) {
            class224.method1494(arg3, arg2, arg5, -111, arg1, arg0);
        } else {
            class132.method889(arg0, arg1, arg5, (byte) -123, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(BI)I", line = 169)
    public static final int method2175(byte arg0, int arg1) {
        int var7 = arg1 - 1;
        int var2 = var7 | var7 >>> 1;
        if (arg0 < 51) {
            field5345 = (class26) null;
        }
        field5353++;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(II)Lna;", line = 193)
    public static final class26 method2176(int arg0, int arg1) {
        field5348++;
        if (arg1 <= 0 || arg1 > 255) {
            throw new IllegalArgumentException();
        }
        class26 var2 = new class26();
        if (arg0 != 23161) {
            field5351 = (class148) null;
        }
        var2.field436 = 1;
        var2.field418 = new byte[1];
        var2.field418[0] = (byte) arg1;
        return var2;
    }
}
