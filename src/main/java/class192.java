import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class192 extends class103 {

    @OriginalMember(owner = "client!kj", name = "I", descriptor = "Lrg;")
    public static class84 field3303 = new class84();

    @OriginalMember(owner = "client!kj", name = "P", descriptor = "Lda;")
    public static class275 field3310 = class255.method1672(111, "::gc");

    @OriginalMember(owner = "client!kj", name = "T", descriptor = "Lda;")
    public static class275 field3314 = class255.method1672(127, "; Max)2Age=");

    @OriginalMember(owner = "client!kj", name = "Q", descriptor = "I")
    public static int field3311 = 0;

    @OriginalMember(owner = "client!kj", name = "p", descriptor = "I")
    public int field3284;

    @OriginalMember(owner = "client!kj", name = "q", descriptor = "I")
    public int field3285;

    @OriginalMember(owner = "client!kj", name = "r", descriptor = "I")
    public static int field3286;

    @OriginalMember(owner = "client!kj", name = "s", descriptor = "I")
    public int field3287;

    @OriginalMember(owner = "client!kj", name = "u", descriptor = "I")
    public int field3289;

    @OriginalMember(owner = "client!kj", name = "v", descriptor = "I")
    public static int field3290;

    @OriginalMember(owner = "client!kj", name = "w", descriptor = "I")
    public int field3291;

    @OriginalMember(owner = "client!kj", name = "x", descriptor = "I")
    public int field3292;

    @OriginalMember(owner = "client!kj", name = "y", descriptor = "I")
    public int field3293;

    @OriginalMember(owner = "client!kj", name = "A", descriptor = "I")
    public int field3295;

    @OriginalMember(owner = "client!kj", name = "B", descriptor = "I")
    public int field3296;

    @OriginalMember(owner = "client!kj", name = "C", descriptor = "I")
    public int field3297;

    @OriginalMember(owner = "client!kj", name = "D", descriptor = "I")
    public int field3298;

    @OriginalMember(owner = "client!kj", name = "E", descriptor = "I")
    public static int field3299;

    @OriginalMember(owner = "client!kj", name = "F", descriptor = "I")
    public int field3300;

    @OriginalMember(owner = "client!kj", name = "G", descriptor = "I")
    public int field3301;

    @OriginalMember(owner = "client!kj", name = "J", descriptor = "I")
    public static int field3304;

    @OriginalMember(owner = "client!kj", name = "K", descriptor = "I")
    public int field3305;

    @OriginalMember(owner = "client!kj", name = "M", descriptor = "I")
    public int field3307;

    @OriginalMember(owner = "client!kj", name = "N", descriptor = "I")
    public static int field3308;

    @OriginalMember(owner = "client!kj", name = "R", descriptor = "I")
    public int field3312;

    @OriginalMember(owner = "client!kj", name = "S", descriptor = "I")
    public int field3313;

    @OriginalMember(owner = "client!kj", name = "U", descriptor = "I")
    public static int field3315;

    @OriginalMember(owner = "client!kj", name = "t", descriptor = "Lgj;")
    public class128 field3288;

    @OriginalMember(owner = "client!kj", name = "H", descriptor = "Lre;")
    public class208 field3302;

    @OriginalMember(owner = "client!kj", name = "L", descriptor = "Lfk;")
    public class48 field3306;

    @OriginalMember(owner = "client!kj", name = "z", descriptor = "Lng;")
    public class62 field3294;

    @OriginalMember(owner = "client!kj", name = "O", descriptor = "Z")
    public static boolean field3309;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(ILij;)Lkk;")
    public static final class225 method1259(int arg0, class85 arg1) {
        field3304++;
        class225 var2 = new class225(arg1.method599(-1), arg1.method599(-1), arg1.method608(33), arg1.method608(51), arg1.method568(19845), arg1.method564((byte) 57) == 1);
        int var3 = arg1.method564((byte) 106);
        if (arg0 != 12345678) {
            field3311 = -96;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            var2.field3819.method547(104, new class209(arg1.method608(98), arg1.method608(80), arg1.method608(92), arg1.method608(arg0 ^ 0xBC6156)));
        }
        var2.method1460((byte) 81);
        return var2;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIIII)V")
    public static final void method1260(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3290++;
        for (int var5 = 0; var5 < class123.field2203; var5++) {
            if (arg4 < class114.field2021[var5] + class114.field2015[var5] && class114.field2015[var5] < arg3 + arg4 && (class38.field627[var5] + class211.field3571[var5]) > arg1 && class38.field627[var5] < arg1 + arg2) {
                class100.field1691[var5] = true;
            }
        }
        int var6 = 56 % ((49 - arg0) / 60);
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(B)V")
    public final void method1261(byte arg0) {
        if (arg0 != -60) {
            return;
        }
        this.field3302 = null;
        this.field3288 = null;
        this.field3306 = null;
        this.field3294 = null;
        field3286++;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lhi;IIIIIIIZ)V")
    public static final void method1262(class147 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        int var9;
        int var10 = var9 = (arg6 << 7) - class123.field2205;
        int var11;
        int var12 = var11 = (arg7 << 7) - class265.field4617;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = class92.field1575[arg1][arg6][arg7] - class80.field1317;
        int var18 = class92.field1575[arg1][arg6 + 1][arg7] - class80.field1317;
        int var19 = class92.field1575[arg1][arg6 + 1][arg7 + 1] - class80.field1317;
        int var20 = class92.field1575[arg1][arg6][arg7 + 1] - class80.field1317;
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
        int var45 = (var21 << 9) / var25 + class223.field3765;
        int var46 = (var24 << 9) / var25 + class223.field3772;
        int var47 = (var27 << 9) / var31 + class223.field3765;
        int var48 = (var30 << 9) / var31 + class223.field3772;
        int var49 = (var33 << 9) / var37 + class223.field3765;
        int var50 = (var36 << 9) / var37 + class223.field3772;
        int var51 = (var39 << 9) / var43 + class223.field3765;
        int var52 = (var42 << 9) / var43 + class223.field3772;
        class223.field3767 = 0;
        if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0) {
            if (class69.field1111 && class155.method1098(class86.field1442 + class223.field3765, class87.field1469 + class223.field3772, var50, var52, var48, var49, var51, var47)) {
                class30.field464 = arg6;
                class193.field3321 = arg7;
            }
            if (!arg8) {
                class223.field3762 = false;
                if (var49 < 0 || var51 < 0 || var47 < 0 || var49 > class223.field3776 || var51 > class223.field3776 || var47 > class223.field3776) {
                    class223.field3762 = true;
                }
                if (arg0.field2570 == -1) {
                    if (arg0.field2562 != 12345678) {
                        class223.method1429(var50, var52, var48, var49, var51, var47, arg0.field2562, arg0.field2566, arg0.field2569);
                    }
                } else if (!class250.field4425) {
                    int var53 = class223.field3771.method74(arg0.field2570, 65535);
                    class223.method1429(var50, var52, var48, var49, var51, var47, class267.method1754(var53, arg0.field2562), class267.method1754(var53, arg0.field2566), class267.method1754(var53, arg0.field2569));
                } else if (arg0.field2565) {
                    class223.method1438(var50, var52, var48, var49, var51, var47, arg0.field2562, arg0.field2566, arg0.field2569, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field2570);
                } else {
                    class223.method1438(var50, var52, var48, var49, var51, var47, arg0.field2562, arg0.field2566, arg0.field2569, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field2570);
                }
            }
        }
        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) <= 0) {
            return;
        }
        if (class69.field1111 && class155.method1098(class86.field1442 + class223.field3765, class87.field1469 + class223.field3772, var46, var48, var52, var45, var47, var51)) {
            class30.field464 = arg6;
            class193.field3321 = arg7;
        }
        if (arg8) {
            return;
        }
        class223.field3762 = false;
        if (var45 < 0 || var47 < 0 || var51 < 0 || var45 > class223.field3776 || var47 > class223.field3776 || var51 > class223.field3776) {
            class223.field3762 = true;
        }
        if (arg0.field2570 != -1) {
            if (class250.field4425) {
                class223.method1438(var46, var48, var52, var45, var47, var51, arg0.field2571, arg0.field2569, arg0.field2566, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field2570);
                return;
            }
            int var54 = class223.field3771.method74(arg0.field2570, 65535);
            class223.method1429(var46, var48, var52, var45, var47, var51, class267.method1754(var54, arg0.field2571), class267.method1754(var54, arg0.field2569), class267.method1754(var54, arg0.field2566));
        } else if (arg0.field2571 != 12345678) {
            class223.method1429(var46, var48, var52, var45, var47, var51, arg0.field2571, arg0.field2569, arg0.field2566);
            return;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIZ)I")
    public static final int method1263(int arg0, int arg1, boolean arg2) {
        field3299++;
        int var3 = arg0 + (arg1 * 57);
        if (!arg2) {
            method1260(-18, -48, 8, 106, -50);
        }
        int var4 = var3 << 13 ^ var3;
        int var5 = Integer.MAX_VALUE & (var4 * 15731 * var4 + 789221) * var4 + 1376312589;
        return (var5 & 0x7FFEE70) >> 19;
    }

    @OriginalMember(owner = "client!kj", name = "e", descriptor = "(I)V")
    public static void method1264(int arg0) {
        field3310 = null;
        field3314 = null;
        field3303 = null;
        if (arg0 != -3531) {
            field3308 = 15;
        }
    }
}
