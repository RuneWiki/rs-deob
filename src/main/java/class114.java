import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class114 {

    @OriginalMember(owner = "client!lg", name = "g", descriptor = "I")
    public static int field2297 = 20;

    @OriginalMember(owner = "client!lg", name = "h", descriptor = "Z")
    public static boolean field2298 = false;

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "Ljd;")
    public static class92 field2292 = class202.method1325((byte) 90, "Nehmen");

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "Ljd;")
    private static class92 field2293 = class202.method1325((byte) 90, "slide:");

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "Ljd;")
    public static class92 field2291 = field2293;

    @OriginalMember(owner = "client!lg", name = "l", descriptor = "Ljd;")
    public static class92 field2302 = field2293;

    @OriginalMember(owner = "client!lg", name = "r", descriptor = "Ljd;")
    public static class92 field2308 = class202.method1325((byte) 90, "headicons_prayer");

    @OriginalMember(owner = "client!lg", name = "t", descriptor = "Ljd;")
    public static class92 field2310 = class202.method1325((byte) 90, "(U1");

    @OriginalMember(owner = "client!lg", name = "u", descriptor = "Ljd;")
    public static class92 field2311 = class202.method1325((byte) 90, "<col=ffff00>");

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "[I")
    public static int[] field2294 = new int[128];

    @OriginalMember(owner = "client!lg", name = "k", descriptor = "Ljd;")
    private static class92 field2301 = class202.method1325((byte) 90, "Drop");

    @OriginalMember(owner = "client!lg", name = "v", descriptor = "I")
    public static int field2312 = 0;

    @OriginalMember(owner = "client!lg", name = "j", descriptor = "Ljd;")
    public static class92 field2300 = field2301;

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "I")
    public static int field2295;

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "I")
    public static int field2296;

    @OriginalMember(owner = "client!lg", name = "m", descriptor = "I")
    public static int field2303;

    @OriginalMember(owner = "client!lg", name = "n", descriptor = "I")
    public static int field2304;

    @OriginalMember(owner = "client!lg", name = "s", descriptor = "I")
    public static int field2309;

    @OriginalMember(owner = "client!lg", name = "q", descriptor = "Lud;")
    public static class192 field2307;

    @OriginalMember(owner = "client!lg", name = "i", descriptor = "La;")
    public static class1 field2299;

    @OriginalMember(owner = "client!lg", name = "p", descriptor = "[I")
    public static int[] field2306;

    @OriginalMember(owner = "client!lg", name = "o", descriptor = "[Lsc;")
    public static class173[] field2305;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)V")
    public static final void method765(int arg0) {
        while (true) {
            if (class185.field3497.method400(class148.field2930, 0) >= 11) {
                int var1 = class185.field3497.method408((byte) -32, 11);
                if (var1 != 2047) {
                    boolean var2 = false;
                    if (class172.field3347[var1] == null) {
                        var2 = true;
                        class172.field3347[var1] = new class91();
                        if (class55.field1161[var1] != null) {
                            class172.field3347[var1].method601(121, class55.field1161[var1]);
                        }
                    }
                    class190.field3678[class140.field2811++] = var1;
                    class91 var3 = class172.field3347[var1];
                    var3.field244 = class158.field3150;
                    int var4 = class185.field3497.method408((byte) -32, 1);
                    int var5 = class111.field2268[class185.field3497.method408((byte) -32, 3)];
                    if (var2) {
                        var3.field243 = var3.field234 = var5;
                    }
                    int var6 = class185.field3497.method408((byte) -32, 5);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    int var7 = class185.field3497.method408((byte) -32, 5);
                    int var8 = class185.field3497.method408((byte) -32, 1);
                    if (var7 > 15) {
                        var7 -= 32;
                    }
                    if (var8 == 1) {
                        class135.field2710[class208.field4003++] = var1;
                    }
                    var3.method29(class15.field423.field233[0] + var7, var4 == 1, class15.field423.field198[0] + var6, 3);
                    continue;
                }
            }
            class185.field3497.method406(8);
            field2304++;
            if (arg0 != 0) {
                field2305 = null;
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(ILa;)I")
    public static final int method766(int arg0, class1 arg1) {
        int var2 = 1 / ((arg0 - 23) / 58);
        field2303++;
        class130 var3 = (class130) class144.field2883.method216(-92, ((long) arg1.field100 << 32) + (long) arg1.field90);
        return var3 == null ? arg1.field80 : var3.field2608;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIIIIILtg;IJ)Z")
    public static final boolean method767(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class186 arg6, int arg7, long arg8) {
        if (arg6 == null) {
            return true;
        } else {
            int var10 = arg1 * 128 + arg4 * 64;
            int var11 = arg2 * 128 + arg5 * 64;
            return class118.method807(arg0, arg1, arg2, arg4, arg5, var10, var11, arg3, arg6, arg7, false, arg8);
        }
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(I)V")
    public static void method768(int arg0) {
        field2307 = null;
        field2301 = null;
        field2293 = null;
        field2294 = null;
        field2308 = null;
        field2299 = null;
        if (arg0 != -12) {
            field2310 = null;
        }
        field2311 = null;
        field2300 = null;
        field2292 = null;
        field2291 = null;
        field2310 = null;
        field2305 = null;
        field2302 = null;
        field2306 = null;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIIIIII)V")
    public static final void method769(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2309++;
        int var7 = 2048 - arg4 & 0x7FF;
        if (arg1 != 248257392) {
            field2308 = null;
        }
        int var8 = 0;
        int var9 = 2048 - arg3 & 0x7FF;
        int var10 = 0;
        int var11 = arg6;
        if (var7 != 0) {
            int var12 = class194.field3787[var7];
            int var13 = class194.field3803[var7];
            int var14 = var10 * var13 - arg6 * var12 >> 16;
            var11 = var10 * var12 + arg6 * var13 >> 16;
            var10 = var14;
        }
        if (var9 != 0) {
            int var15 = class194.field3803[var9];
            int var16 = class194.field3787[var9];
            int var17 = var8 * var15 + var11 * var16 >> 16;
            var11 = var11 * var15 - var8 * var16 >> 16;
            var8 = var17;
        }
        class132.field2645 = arg5 - var8;
        class151.field2991 = arg0 - var11;
        class124.field2511 = arg2 - var10;
        class18.field451 = arg4;
        class4.field268 = arg3;
    }
}
