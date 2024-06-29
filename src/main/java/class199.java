import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class199 {

    @OriginalMember(owner = "client!va", name = "m", descriptor = "J")
    public long field3443 = 0L;

    @OriginalMember(owner = "client!va", name = "h", descriptor = "I")
    public static int field3438 = 0;

    @OriginalMember(owner = "client!va", name = "o", descriptor = "[B")
    public static byte[] field3445 = new byte[32896];

    @OriginalMember(owner = "client!va", name = "r", descriptor = "Lqe;")
    public static class168 field3448;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "I")
    public int field3431;

    @OriginalMember(owner = "client!va", name = "c", descriptor = "I")
    public int field3433;

    @OriginalMember(owner = "client!va", name = "e", descriptor = "I")
    public int field3435;

    @OriginalMember(owner = "client!va", name = "f", descriptor = "I")
    public int field3436;

    @OriginalMember(owner = "client!va", name = "i", descriptor = "I")
    public int field3439;

    @OriginalMember(owner = "client!va", name = "j", descriptor = "I")
    public int field3440;

    @OriginalMember(owner = "client!va", name = "l", descriptor = "I")
    public static int field3442;

    @OriginalMember(owner = "client!va", name = "n", descriptor = "I")
    public int field3444;

    @OriginalMember(owner = "client!va", name = "q", descriptor = "I")
    public static int field3447;

    @OriginalMember(owner = "client!va", name = "d", descriptor = "Lnc;")
    public static class136 field3434;

    @OriginalMember(owner = "client!va", name = "k", descriptor = "Lqf;")
    public class13 field3441;

    @OriginalMember(owner = "client!va", name = "p", descriptor = "Lqf;")
    public class13 field3446;

    @OriginalMember(owner = "client!va", name = "g", descriptor = "Lt;")
    public static class206 field3437;

    @OriginalMember(owner = "client!va", name = "b", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field3432;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Ldi;IIIIIIIZ)V")
    public static final void method1275(class146 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        int var9;
        int var10 = var9 = (arg6 << 7) - class108.field1739;
        int var11;
        int var12 = var11 = (arg7 << 7) - class102.field1648;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = class23.field275[arg1][arg6][arg7] - class45.field588;
        int var18 = class23.field275[arg1][arg6 + 1][arg7] - class45.field588;
        int var19 = class23.field275[arg1][arg6 + 1][arg7 + 1] - class45.field588;
        int var20 = class23.field275[arg1][arg6][arg7 + 1] - class45.field588;
        int var21 = arg4 * var12 + arg5 * var10 >> 16;
        int var22 = arg5 * var12 - arg4 * var10 >> 16;
        int var24 = arg3 * var17 - arg2 * var22 >> 16;
        int var25 = arg2 * var17 + arg3 * var22 >> 16;
        if (var25 < 50) {
            return;
        }
        int var27 = arg4 * var11 + arg5 * var14 >> 16;
        int var28 = arg5 * var11 - arg4 * var14 >> 16;
        int var30 = arg3 * var18 - arg2 * var28 >> 16;
        int var31 = arg2 * var18 + arg3 * var28 >> 16;
        if (var31 < 50) {
            return;
        }
        int var33 = arg4 * var16 + arg5 * var13 >> 16;
        int var34 = arg5 * var16 - arg4 * var13 >> 16;
        int var36 = arg3 * var19 - arg2 * var34 >> 16;
        int var37 = arg2 * var19 + arg3 * var34 >> 16;
        if (var37 < 50) {
            return;
        }
        int var39 = arg4 * var15 + arg5 * var9 >> 16;
        int var40 = arg5 * var15 - arg4 * var9 >> 16;
        int var42 = arg3 * var20 - arg2 * var40 >> 16;
        int var43 = arg2 * var20 + arg3 * var40 >> 16;
        if (var43 < 50) {
            return;
        }
        int var45 = (var21 << 9) / var25 + class248.field4302;
        int var46 = (var24 << 9) / var25 + class248.field4298;
        int var47 = (var27 << 9) / var31 + class248.field4302;
        int var48 = (var30 << 9) / var31 + class248.field4298;
        int var49 = (var33 << 9) / var37 + class248.field4302;
        int var50 = (var36 << 9) / var37 + class248.field4298;
        int var51 = (var39 << 9) / var43 + class248.field4302;
        int var52 = (var42 << 9) / var43 + class248.field4298;
        class248.field4295 = 0;
        if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0) {
            if (class187.field3292 && class81.method537(class85.field1334 + class248.field4302, class248.field4298 + class155.field2702, var50, var52, var48, var49, var51, var47)) {
                class4.field43 = arg6;
                class255.field4430 = arg7;
            }
            if (!arg8) {
                class248.field4300 = false;
                if (var49 < 0 || var51 < 0 || var47 < 0 || var49 > class248.field4285 || var51 > class248.field4285 || var47 > class248.field4285) {
                    class248.field4300 = true;
                }
                if (arg0.field2540 == -1) {
                    if (arg0.field2546 != 12345678) {
                        class248.method1633(var50, var52, var48, var49, var51, var47, arg0.field2546, arg0.field2549, arg0.field2538);
                    }
                } else if (!class207.field3593) {
                    int var53 = class248.field4299.method681(arg0.field2540, 1);
                    class248.method1633(var50, var52, var48, var49, var51, var47, class94.method617(var53, arg0.field2546), class94.method617(var53, arg0.field2549), class94.method617(var53, arg0.field2538));
                } else if (arg0.field2544) {
                    class248.method1637(var50, var52, var48, var49, var51, var47, arg0.field2546, arg0.field2549, arg0.field2538, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field2540);
                } else {
                    class248.method1637(var50, var52, var48, var49, var51, var47, arg0.field2546, arg0.field2549, arg0.field2538, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field2540);
                }
            }
        }
        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) <= 0) {
            return;
        }
        if (class187.field3292 && class81.method537(class85.field1334 + class248.field4302, class248.field4298 + class155.field2702, var46, var48, var52, var45, var47, var51)) {
            class4.field43 = arg6;
            class255.field4430 = arg7;
        }
        if (arg8) {
            return;
        }
        class248.field4300 = false;
        if (var45 < 0 || var47 < 0 || var51 < 0 || var45 > class248.field4285 || var47 > class248.field4285 || var51 > class248.field4285) {
            class248.field4300 = true;
        }
        if (arg0.field2540 != -1) {
            if (class207.field3593) {
                class248.method1637(var46, var48, var52, var45, var47, var51, arg0.field2542, arg0.field2538, arg0.field2549, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field2540);
                return;
            }
            int var54 = class248.field4299.method681(arg0.field2540, 1);
            class248.method1633(var46, var48, var52, var45, var47, var51, class94.method617(var54, arg0.field2542), class94.method617(var54, arg0.field2538), class94.method617(var54, arg0.field2549));
        } else if (arg0.field2542 != 12345678) {
            class248.method1633(var46, var48, var52, var45, var47, var51, arg0.field2542, arg0.field2538, arg0.field2549);
            return;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(B)V")
    public static void method1276(byte arg0) {
        field3432 = null;
        field3434 = null;
        field3445 = null;
        field3437 = null;
        if (arg0 != 115) {
            field3434 = null;
        }
        field3448 = null;
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field3445[var0++] = (byte) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F)));
            }
        }
        field3448 = class66.method448("Musik)2Engine vorbereitet)3", 95);
    }
}
