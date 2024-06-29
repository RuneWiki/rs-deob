import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class63 extends class303 {

    @OriginalMember(owner = "client!ej", name = "g", descriptor = "I")
    public static int field985 = 0;

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "I")
    public static int field980 = 0;

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "I")
    public static int field981;

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "I")
    public static int field982;

    @OriginalMember(owner = "client!ej", name = "e", descriptor = "I")
    public static int field983;

    @OriginalMember(owner = "client!ej", name = "f", descriptor = "I")
    public static int field984;

    @OriginalMember(owner = "client!ej", name = "h", descriptor = "I")
    public static int field986;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIII)I", line = 3)
    public static final int method424(int arg0, int arg1, int arg2, int arg3) {
        field986++;
        if (arg0 == arg2) {
            return arg2;
        }
        int var4 = arg3 - arg1;
        int var5 = (arg0 & 0x7F) * arg1 + (arg2 & 0x7F) * var4 >> 7;
        int var6 = (arg0 & 0x380) * arg1 + (arg2 & 0x380) * var4 >> 7;
        int var7 = (arg0 & 0xFC00) * arg1 + (arg2 & 0xFC00) * var4 >> 7;
        return var6 & 0x380 | var7 & 0xFC00 | var5 & 0x7F;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(I)V", line = 26)
    public static final void method425(int arg0) {
        field984++;
        for (class165 var1 = (class165) class300.field4163.method1312((byte) 25); var1 != null; var1 = (class165) class300.field4163.method1304(-117)) {
            class439 var3 = var1.field2353;
            if (class265.field3617 != var3.field6198 || class35.field541 > var3.field6343) {
                var1.method2459(198);
                var3.method2755((byte) -111);
            } else if (class35.field541 >= var3.field6362) {
                if (var3.field6349 > 0) {
                    class437 var4 = class445.field6422[var3.field6349 - 1];
                    if (var4 != null && var4.field6197 >= 0 && var4.field6197 < (class432.field6220 * 128) && var4.field6192 >= 0 && var4.field6192 < (class267.field3646 * 128)) {
                        var3.method2758(class279.method1698(var4.field6197, var4.field6192, var3.field6198, (byte) 3) - var3.field6371, (byte) 112, var4.field6192, var4.field6197, class35.field541);
                    }
                }
                if (var3.field6349 < 0) {
                    int var5 = -var3.field6349 - 1;
                    class354 var6;
                    if (class414.field6012 == var5) {
                        var6 = class307.field4211;
                    } else {
                        var6 = class12.field153[var5];
                    }
                    if (var6 != null && var6.field6197 >= 0 && class432.field6220 * 128 > var6.field6197 && var6.field6192 >= 0 && var6.field6192 < (class267.field3646 * 128)) {
                        var3.method2758(class279.method1698(var6.field6197, var6.field6192, var3.field6198, (byte) 3) - var3.field6371, (byte) 72, var6.field6192, var6.field6197, class35.field541);
                    }
                }
                var3.method2759(field980, 121);
                class259.method1601(var3, true);
            }
        }
        int var2 = 110 / ((-arg0 - 38) / 63);
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(I)V", line = 91)
    public static final void method426(int arg0) {
        if (arg0 <= 57) {
            return;
        }
        field981++;
        if (class182.field2543 != null) {
            class182.field2543.method1809((byte) 9);
            class182.field2543 = null;
            class381.field5404 = null;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIB)V", line = 115)
    public static final void method427(int arg0, int arg1, byte arg2) {
        if (arg2 != 36) {
            field980 = 29;
        }
        if (class43.field653 != arg1) {
            class249.field3455 = new int[arg1];
            for (int var3 = 0; var3 < arg1; var3++) {
                class249.field3455[var3] = (var3 << 12) / arg1;
            }
            class188.field2611 = arg1 * 32;
            class278.field3758 = arg1 - 1;
            class43.field653 = arg1;
        }
        field982++;
        if (class123.field1728 == arg0) {
            return;
        }
        if (class43.field653 == arg0) {
            class32.field499 = class249.field3455;
        } else {
            class32.field499 = new int[arg0];
            for (int var4 = 0; var4 < arg0; var4++) {
                class32.field499[var4] = (var4 << 12) / arg0;
            }
        }
        class123.field1728 = arg0;
        class190.field2634 = arg0 - 1;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIIIIII)V", line = 162)
    public static final void method428(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class181.method1202(arg5, -103);
        field983++;
        int var7 = 0;
        int var8 = arg5 - arg2;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg5;
        int var10 = -arg5;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        if (arg6 != 28235) {
            field980 = 7;
        }
        int[] var15 = class84.field1286[arg3];
        int var16 = arg4 - var8;
        int var17 = arg4 + var8;
        class73.method486(arg4 - arg5, var15, arg1, arg6 - 28168, var16);
        class73.method486(var16, var15, arg0, -97, var17);
        class73.method486(var17, var15, arg1, 3, arg4 + arg5);
        while (var7 < var9) {
            var13 += 2;
            var14 += 2;
            var12 += var14;
            var10 += var13;
            if (var12 >= 0 && var11 >= 1) {
                class275.field3727[var11] = var7;
                var11--;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                if (var8 <= var9) {
                    int[] var18 = class84.field1286[arg3 + var9];
                    int[] var19 = class84.field1286[arg3 - var9];
                    int var20 = arg4 + var7;
                    int var21 = arg4 - var7;
                    class73.method486(var21, var18, arg1, arg6 ^ 0xFFFF91EF, var20);
                    class73.method486(var21, var19, arg1, 92, var20);
                } else {
                    int[] var22 = class84.field1286[arg3 + var9];
                    int[] var23 = class84.field1286[arg3 - var9];
                    int var24 = class275.field3727[var9];
                    int var25 = arg4 + var7;
                    int var26 = arg4 - var7;
                    int var27 = arg4 + var24;
                    int var28 = arg4 - var24;
                    class73.method486(var26, var22, arg1, -115, var28);
                    class73.method486(var28, var22, arg0, 123, var27);
                    class73.method486(var27, var22, arg1, -9, var25);
                    class73.method486(var26, var23, arg1, -104, var28);
                    class73.method486(var28, var23, arg0, -99, var27);
                    class73.method486(var27, var23, arg1, arg6 - 28333, var25);
                }
            }
            int[] var29 = class84.field1286[arg3 + var7];
            int[] var30 = class84.field1286[arg3 - var7];
            int var31 = arg4 + var9;
            int var32 = arg4 - var9;
            if (var7 < var8) {
                int var33 = var7 > var11 ? class275.field3727[var7] : var11;
                int var34 = arg4 + var33;
                int var35 = arg4 - var33;
                class73.method486(var32, var29, arg1, -97, var35);
                class73.method486(var35, var29, arg0, -118, var34);
                class73.method486(var34, var29, arg1, -99, var31);
                class73.method486(var32, var30, arg1, 0, var35);
                class73.method486(var35, var30, arg0, -97, var34);
                class73.method486(var34, var30, arg1, arg6 ^ 0xFFFF91C6, var31);
            } else {
                class73.method486(var32, var29, arg1, -122, var31);
                class73.method486(var32, var30, arg1, 100, var31);
            }
        }
    }
}
