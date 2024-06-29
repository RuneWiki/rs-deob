import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class28 extends class248 {

    @OriginalMember(owner = "client!be", name = "x", descriptor = "I")
    public static int field385 = 0;

    @OriginalMember(owner = "client!be", name = "w", descriptor = "Llf;")
    public static class211 field384 = new class211(2);

    @OriginalMember(owner = "client!be", name = "A", descriptor = "I")
    public static int field388 = 0;

    @OriginalMember(owner = "client!be", name = "C", descriptor = "[I")
    public static int[] field390 = new int[2];

    @OriginalMember(owner = "client!be", name = "v", descriptor = "I")
    public static int field383;

    @OriginalMember(owner = "client!be", name = "y", descriptor = "I")
    public static int field386;

    @OriginalMember(owner = "client!be", name = "z", descriptor = "I")
    public static int field387;

    @OriginalMember(owner = "client!be", name = "B", descriptor = "I")
    public static int field389;

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(I)V")
    public static void method235(int arg0) {
        field390 = null;
        field384 = null;
        if (arg0 != -1) {
            field390 = null;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(ILwe;)V")
    public static final void method236(int arg0, class15 arg1) {
        field383++;
        short var2 = 256;
        for (int var3 = 0; var3 < class111.field1685.length; var3++) {
            class111.field1685[var3] = 0;
        }
        for (int var4 = 0; var4 < 5000; var4++) {
            int var17 = (int) ((double) var2 * 128.0D * Math.random());
            class111.field1685[var17] = (int) (Math.random() * 284.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var13 = 1; var13 < (var2 - 1); var13++) {
                for (int var15 = 1; var15 < 127; var15++) {
                    int var16 = var15 + (var13 << 7);
                    class130.field1908[var16] = (class111.field1685[var16 - 1] + class111.field1685[var16 + 1] + class111.field1685[var16 + 128] + class111.field1685[var16 + -128]) / 4;
                }
            }
            int[] var14 = class111.field1685;
            class111.field1685 = class130.field1908;
            class130.field1908 = var14;
        }
        int var6 = -33 % ((-arg0 - 4) / 42);
        if (arg1 == null) {
            return;
        }
        int var7 = 0;
        for (int var8 = 0; var8 < arg1.field2142; var8++) {
            for (int var9 = 0; var9 < arg1.field2148; var9++) {
                if (arg1.field183[var7++] != 0) {
                    int var10 = arg1.field2146 + var9 + 16;
                    int var11 = var8 + arg1.field2138 + 16;
                    int var12 = var10 + (var11 << 7);
                    class111.field1685[var12] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method237(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field386++;
        int var8 = 0;
        int var9 = arg6;
        int var10 = 0;
        int var11 = arg0 - arg4;
        int var12 = arg6 - arg4;
        int var13 = arg0 * arg0;
        int var14 = var11 * var11;
        int var15 = var12 * var12;
        int var16 = var13 << 1;
        int var17 = var15 << 1;
        int var18 = var14 << 1;
        int var19 = arg6 * arg6;
        int var20 = var19 << 1;
        int var21 = var12 << 1;
        int var22 = arg6 << 1;
        int var23 = (1 - var22) * var13 + var20;
        int var24 = (1 - var21) * var14 + var17;
        int var25 = var13 << 2;
        int var26 = var15 - ((var21 - 1) * var18);
        int var27 = var19 - ((var22 - 1) * var16);
        int var28 = var19 << 2;
        int var29 = var14 << 2;
        int var30 = var15 << 2;
        int var31 = var17 * 3;
        int var32 = var20 * 3;
        int var33 = (var22 - 3) * var16;
        int var34 = (var21 - 3) * var18;
        int var35 = (arg6 - 1) * var25;
        int var36 = var30;
        int var37 = var28;
        if (class110.field1669 <= arg2 && arg2 <= class189.field2984) {
            int[] var38 = class106.field1637[arg2];
            int var39 = class34.method273(class96.field1484, arg3 - arg0, false, class51.field710);
            int var40 = class34.method273(class96.field1484, arg3 + arg0, false, class51.field710);
            int var41 = class34.method273(class96.field1484, arg3 - var11, false, class51.field710);
            int var42 = class34.method273(class96.field1484, arg3 + var11, false, class51.field710);
            class8.method52(var39, var38, var41, arg5, true);
            class8.method52(var41, var38, var42, arg7, true);
            class8.method52(var42, var38, var40, arg5, true);
        }
        int var43 = (var12 - 1) * var29;
        if (arg1 >= -97) {
            return;
        }
        while (var9 > 0) {
            if (var23 < 0) {
                while (var23 < 0) {
                    var8++;
                    var27 += var37;
                    var37 += var28;
                    var23 += var32;
                    var32 += var28;
                }
            }
            if (var27 < 0) {
                var27 += var37;
                var37 += var28;
                var8++;
                var23 += var32;
                var32 += var28;
            }
            var27 += -var33;
            var33 -= var25;
            var23 += -var35;
            var35 -= var25;
            boolean var44 = var9 <= var12;
            var9--;
            int var45 = arg2 - var9;
            if (var44) {
                if (var24 < 0) {
                    while (var24 < 0) {
                        var24 += var31;
                        var26 += var36;
                        var36 += var30;
                        var31 += var30;
                        var10++;
                    }
                }
                if (var26 < 0) {
                    var10++;
                    var26 += var36;
                    var36 += var30;
                    var24 += var31;
                    var31 += var30;
                }
                var26 += -var34;
                var24 += -var43;
                var34 -= var29;
                var43 -= var29;
            }
            int var46 = arg2 + var9;
            if (class110.field1669 <= var46 && var45 <= class189.field2984) {
                int var47 = class34.method273(class96.field1484, arg3 + var8, false, class51.field710);
                int var48 = class34.method273(class96.field1484, arg3 - var8, false, class51.field710);
                if (var44) {
                    int var49 = class34.method273(class96.field1484, arg3 + var10, false, class51.field710);
                    int var50 = class34.method273(class96.field1484, arg3 - var10, false, class51.field710);
                    if (class110.field1669 <= var45) {
                        int[] var51 = class106.field1637[var45];
                        class8.method52(var48, var51, var50, arg5, true);
                        class8.method52(var50, var51, var49, arg7, true);
                        class8.method52(var49, var51, var47, arg5, true);
                    }
                    if (var46 <= class189.field2984) {
                        int[] var52 = class106.field1637[var46];
                        class8.method52(var48, var52, var50, arg5, true);
                        class8.method52(var50, var52, var49, arg7, true);
                        class8.method52(var49, var52, var47, arg5, true);
                    }
                } else {
                    if (class110.field1669 <= var45) {
                        class8.method52(var48, class106.field1637[var45], var47, arg5, true);
                    }
                    if (class189.field2984 >= var46) {
                        class8.method52(var48, class106.field1637[var46], var47, arg5, true);
                    }
                }
            }
        }
    }
}
