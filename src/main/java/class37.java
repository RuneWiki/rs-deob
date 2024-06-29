import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class37 {

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "Lbb;")
    public static class90 field659 = new class90();

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "Lp;")
    private static class280 field662 = class18.method140((byte) -118, "Loaded input handler");

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "Lp;")
    public static class280 field667 = class18.method140((byte) -117, ")1");

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "Lp;")
    public static class280 field665 = class18.method140((byte) -121, "k");

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "Lp;")
    public static class280 field668 = field662;

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "[S")
    public static short[] field664 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "I")
    public static int field660;

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "I")
    public static int field661;

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "I")
    public static int field663;

    @OriginalMember(owner = "client!ea", name = "k", descriptor = "I")
    public static int field669;

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "[I")
    public static int[] field666;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIIII)V")
    public static final void method294(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field661++;
        int var6 = 0;
        int var7 = arg1;
        int var8 = arg3 * arg3;
        int var9 = arg1 * arg1;
        int var10 = var8 << 1;
        int var11 = var9 << 1;
        int var12 = arg1 << 1;
        int var13 = (1 - var12) * var8 + var11;
        int var14 = var9 - ((var12 - 1) * var10);
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var11;
        int var18 = ((arg1 << 1) - 3) * var10;
        int var19 = (var6 + 1) * var16;
        int var20 = (arg0 + arg1) * var15;
        if (arg2 >= class36.field654 && class249.field4360 >= arg2) {
            int var21 = class76.method564(class89.field1440, -127, arg3 + arg4, class12.field249);
            int var22 = class76.method564(class89.field1440, -116, arg4 - arg3, class12.field249);
            class162.method1151(var21, arg5, arg0 - 76, var22, class91.field1484[arg2]);
        }
        while (var7 > 0) {
            var7--;
            if (var13 < 0) {
                while (var13 < 0) {
                    var6++;
                    var13 += var17;
                    var17 += var16;
                    var14 += var19;
                    var19 += var16;
                }
            }
            int var23 = arg2 - var7;
            if (var14 < 0) {
                var14 += var19;
                var6++;
                var13 += var17;
                var17 += var16;
                var19 += var16;
            }
            var14 += -var18;
            var18 -= var15;
            int var24 = arg2 + var7;
            var13 += -var20;
            if (var24 >= class36.field654 && var23 <= class249.field4360) {
                int var25 = class76.method564(class89.field1440, -123, arg4 + var6, class12.field249);
                int var26 = class76.method564(class89.field1440, -121, arg4 - var6, class12.field249);
                if (var23 >= class36.field654) {
                    class162.method1151(var25, arg5, 127, var26, class91.field1484[var23]);
                }
                if (var24 <= class249.field4360) {
                    class162.method1151(var25, arg5, 127, var26, class91.field1484[var24]);
                }
            }
            var20 -= var15;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)V")
    public static void method295(byte arg0) {
        field659 = null;
        field665 = null;
        field668 = null;
        field667 = null;
        int var1 = -67 / ((-arg0 - 4) / 37);
        field662 = null;
        field666 = null;
        field664 = null;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIIIILrk;IJ)Z")
    public static final boolean method296(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class265 arg6, int arg7, long arg8) {
        if (arg6 == null) {
            return true;
        } else {
            int var10 = arg1 * 128 + arg4 * 64;
            int var11 = arg2 * 128 + arg5 * 64;
            return class74.method560(arg0, arg1, arg2, arg4, arg5, var10, var11, arg3, arg6, arg7, false, arg8);
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)Leg;")
    public static final class223 method297(int arg0) {
        field660++;
        int var1 = class97.field1562[0] * class57.field915[0];
        byte[] var2 = class182.field3178[0];
        int[] var3 = new int[var1];
        for (int var4 = 0; var4 < var1; var4++) {
            var3[var4] = class16.field309[class214.method1432(var2[var4], 255)];
        }
        class223 var5 = new class223(class93.field1512, class221.field3828, class243.field4263[0], class124.field2172[0], class97.field1562[arg0], class57.field915[0], var3);
        class126.method868(-15434);
        return var5;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(III)V")
    public static final void method298(int arg0, int arg1, int arg2) {
        if (arg0 > -121) {
            return;
        }
        field669++;
        if (class264.field4654 != arg2) {
            class102.field1701 = new int[arg2];
            for (int var3 = 0; var3 < arg2; var3++) {
                class102.field1701[var3] = (var3 << 12) / arg2;
            }
            class230.field3968 = arg2 - 1;
            class189.field3325 = arg2 == 64 ? 2048 : 4096;
            class264.field4654 = arg2;
        }
        if (class25.field486 == arg1) {
            return;
        }
        if (class264.field4654 == arg1) {
            class117.field2106 = class102.field1701;
        } else {
            class117.field2106 = new int[arg1];
            for (int var4 = 0; var4 < arg1; var4++) {
                class117.field2106[var4] = (var4 << 12) / arg1;
            }
        }
        class25.field486 = arg1;
        class29.field540 = arg1 - 1;
    }
}
