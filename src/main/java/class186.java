import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class186 implements Runnable {

    @OriginalMember(owner = "client!ck", name = "k", descriptor = "Z")
    public boolean field3235 = true;

    @OriginalMember(owner = "client!ck", name = "l", descriptor = "Ljava/lang/Object;")
    public Object field3236 = new Object();

    @OriginalMember(owner = "client!ck", name = "n", descriptor = "[I")
    public int[] field3238 = new int[500];

    @OriginalMember(owner = "client!ck", name = "o", descriptor = "[I")
    public int[] field3239 = new int[500];

    @OriginalMember(owner = "client!ck", name = "p", descriptor = "I")
    public int field3240 = 0;

    @OriginalMember(owner = "client!ck", name = "e", descriptor = "Z")
    public static boolean field3229 = false;

    @OriginalMember(owner = "client!ck", name = "g", descriptor = "I")
    public static int field3231 = 0;

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "I")
    public static int field3227 = -1;

    @OriginalMember(owner = "client!ck", name = "h", descriptor = "Lia;")
    public static class257 field3232 = class28.method234(-39, "Ausw-=hlen");

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "I")
    public static int field3228 = 0;

    @OriginalMember(owner = "client!ck", name = "m", descriptor = "[I")
    public static int[] field3237 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "I")
    public static int field3225;

    @OriginalMember(owner = "client!ck", name = "i", descriptor = "I")
    public static int field3233;

    @OriginalMember(owner = "client!ck", name = "j", descriptor = "I")
    public static int field3234;

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "Lmb;")
    public static class178 field3226;

    @OriginalMember(owner = "client!ck", name = "f", descriptor = "Ltj;")
    public static class182 field3230;

    @OriginalMember(owner = "client!ck", name = "run", descriptor = "()V")
    public final void run() {
        while (this.field3235) {
            Object var1 = this.field3236;
            synchronized (this.field3236) {
                if (this.field3240 < 500) {
                    this.field3238[this.field3240] = class245.field4253;
                    this.field3239[this.field3240] = class102.field1904;
                    this.field3240++;
                }
            }
            class33.method283(-20, 50L);
        }
        field3234++;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(I)V")
    public static void method1262(int arg0) {
        field3226 = null;
        field3237 = null;
        field3232 = null;
        field3230 = null;
        if (arg0 != -1) {
            method1262(14);
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(II)Lfc;")
    public static final class31 method1263(int arg0, int arg1) {
        field3233++;
        class31 var2 = (class31) class75.field1462.method836(arg0 ^ 0xF, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class242.field4195.method1197(class90.method672(-24536, arg1), class27.method231(458441927, arg1), -2);
        class31 var4 = new class31();
        if (var3 != null) {
            var4.method257(new class152(var3), false);
        }
        var4.method268(2);
        class75.field1462.method832(var4, (long) arg1, arg0);
        return var4;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lwj;IIIIIIIZ)V")
    public static final void method1264(class58 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        int var9;
        int var10 = var9 = (arg6 << 7) - class26.field512;
        int var11;
        int var12 = var11 = (arg7 << 7) - class224.field3765;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = class243.field4208[arg1][arg6][arg7] - class18.field393;
        int var18 = class243.field4208[arg1][arg6 + 1][arg7] - class18.field393;
        int var19 = class243.field4208[arg1][arg6 + 1][arg7 + 1] - class18.field393;
        int var20 = class243.field4208[arg1][arg6][arg7 + 1] - class18.field393;
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
        int var45 = (var21 << 9) / var25 + class101.field1857;
        int var46 = (var24 << 9) / var25 + class101.field1861;
        int var47 = (var27 << 9) / var31 + class101.field1857;
        int var48 = (var30 << 9) / var31 + class101.field1861;
        int var49 = (var33 << 9) / var37 + class101.field1857;
        int var50 = (var36 << 9) / var37 + class101.field1861;
        int var51 = (var39 << 9) / var43 + class101.field1857;
        int var52 = (var42 << 9) / var43 + class101.field1861;
        class101.field1868 = 0;
        if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0) {
            if (class157.field2751 && class38.method311(class162.field2836 + class101.field1857, class139.field2479 + class101.field1861, var50, var52, var48, var49, var51, var47)) {
                class156.field2741 = arg6;
                class108.field2021 = arg7;
            }
            if (!arg8) {
                class101.field1869 = false;
                if (var49 < 0 || var51 < 0 || var47 < 0 || var49 > class101.field1858 || var51 > class101.field1858 || var47 > class101.field1858) {
                    class101.field1869 = true;
                }
                if (arg0.field1238 == -1) {
                    if (arg0.field1229 != 12345678) {
                        class101.method733(var50, var52, var48, var49, var51, var47, arg0.field1229, arg0.field1235, arg0.field1234);
                    }
                } else if (!class152.field2649) {
                    int var53 = class101.field1870.method97(arg0.field1238, 65535);
                    class101.method733(var50, var52, var48, var49, var51, var47, class19.method173(var53, arg0.field1229), class19.method173(var53, arg0.field1235), class19.method173(var53, arg0.field1234));
                } else if (arg0.field1227) {
                    class101.method736(var50, var52, var48, var49, var51, var47, arg0.field1229, arg0.field1235, arg0.field1234, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field1238);
                } else {
                    class101.method736(var50, var52, var48, var49, var51, var47, arg0.field1229, arg0.field1235, arg0.field1234, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field1238);
                }
            }
        }
        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) <= 0) {
            return;
        }
        if (class157.field2751 && class38.method311(class162.field2836 + class101.field1857, class139.field2479 + class101.field1861, var46, var48, var52, var45, var47, var51)) {
            class156.field2741 = arg6;
            class108.field2021 = arg7;
        }
        if (arg8) {
            return;
        }
        class101.field1869 = false;
        if (var45 < 0 || var47 < 0 || var51 < 0 || var45 > class101.field1858 || var47 > class101.field1858 || var51 > class101.field1858) {
            class101.field1869 = true;
        }
        if (arg0.field1238 != -1) {
            if (class152.field2649) {
                class101.method736(var46, var48, var52, var45, var47, var51, arg0.field1232, arg0.field1234, arg0.field1235, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field1238);
                return;
            }
            int var54 = class101.field1870.method97(arg0.field1238, 65535);
            class101.method733(var46, var48, var52, var45, var47, var51, class19.method173(var54, arg0.field1232), class19.method173(var54, arg0.field1234), class19.method173(var54, arg0.field1235));
        } else if (arg0.field1232 != 12345678) {
            class101.method733(var46, var48, var52, var45, var47, var51, arg0.field1232, arg0.field1234, arg0.field1235);
            return;
        }
    }
}
