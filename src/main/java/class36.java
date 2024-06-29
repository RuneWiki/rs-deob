import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class36 {

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "I")
    public static int field554 = 0;

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "I")
    public static int field553 = 0;

    @OriginalMember(owner = "client!vk", name = "e", descriptor = "Z")
    public static boolean field556 = false;

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "I")
    public static int field555;

    @OriginalMember(owner = "client!vk", name = "f", descriptor = "I")
    public static int field557;

    @OriginalMember(owner = "client!vk", name = "h", descriptor = "I")
    public static int field559;

    @OriginalMember(owner = "client!vk", name = "i", descriptor = "Lhc;")
    public static class235 field560;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "Lkb;")
    public static class54 field552;

    @OriginalMember(owner = "client!vk", name = "g", descriptor = "[Lgg;")
    public static class198[] field558;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(ZI)V")
    public static final void method240(boolean arg0, int arg1) {
        class69.field940 = new int[104];
        class265.field3973 = new int[104];
        if (arg1 != -14493) {
            field558 = null;
        }
        class247.field3788 = new int[104];
        class184.field2553 = new int[104];
        class82.field1120 = new int[104];
        field557++;
        class138.field1927 = 99;
        class285.field4471 = new int[5];
        byte var2;
        if (arg0) {
            var2 = 1;
        } else {
            var2 = 4;
        }
        class198.field2758 = new int[var2][105][105];
        class34.field528 = new byte[var2][104][104];
        class34.field530 = new byte[var2][104][104];
        client.field2180 = new byte[var2][105][105];
        class264.field3966 = new byte[var2][104][104];
        class9.field80 = new byte[var2][104][104];
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(I)V")
    public static void method241(int arg0) {
        if (arg0 < 121) {
            method243(true, (class235) null);
        }
        field552 = null;
        field560 = null;
        field558 = null;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(III)Z")
    public static final boolean method242(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class67.field908; var3++) {
            class173 var4 = class204.field2844[var3];
            if (var4.field2426 == 1) {
                int var5 = var4.field2409 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field2427 * var5 >> 8) + var4.field2404;
                    int var7 = (var4.field2431 * var5 >> 8) + var4.field2425;
                    int var8 = (var4.field2423 * var5 >> 8) + var4.field2421;
                    int var9 = (var4.field2412 * var5 >> 8) + var4.field2413;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field2426 == 2) {
                int var10 = arg0 - var4.field2409;
                if (var10 > 0) {
                    int var11 = (var4.field2427 * var10 >> 8) + var4.field2404;
                    int var12 = (var4.field2431 * var10 >> 8) + var4.field2425;
                    int var13 = (var4.field2423 * var10 >> 8) + var4.field2421;
                    int var14 = (var4.field2412 * var10 >> 8) + var4.field2413;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field2426 == 3) {
                int var15 = var4.field2404 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field2422 * var15 >> 8) + var4.field2409;
                    int var17 = (var4.field2407 * var15 >> 8) + var4.field2406;
                    int var18 = (var4.field2423 * var15 >> 8) + var4.field2421;
                    int var19 = (var4.field2412 * var15 >> 8) + var4.field2413;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field2426 == 4) {
                int var20 = arg2 - var4.field2404;
                if (var20 > 0) {
                    int var21 = (var4.field2422 * var20 >> 8) + var4.field2409;
                    int var22 = (var4.field2407 * var20 >> 8) + var4.field2406;
                    int var23 = (var4.field2423 * var20 >> 8) + var4.field2421;
                    int var24 = (var4.field2412 * var20 >> 8) + var4.field2413;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field2426 == 5) {
                int var25 = arg1 - var4.field2421;
                if (var25 > 0) {
                    int var26 = (var4.field2422 * var25 >> 8) + var4.field2409;
                    int var27 = (var4.field2407 * var25 >> 8) + var4.field2406;
                    int var28 = (var4.field2427 * var25 >> 8) + var4.field2404;
                    int var29 = (var4.field2431 * var25 >> 8) + var4.field2425;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(ZLhc;)V")
    public static final void method243(boolean arg0, class235 arg1) {
        field555++;
        if (arg0) {
            method243(false, (class235) null);
        }
        class231.field3508 = arg1;
    }

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "(III)Lwd;")
    public static final class23 method244(int arg0, int arg1, int arg2) {
        class89 var3 = class194.field2682[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class23 var4 = var3.field1237;
            var3.field1237 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIIIIII)V")
    public static final void method245(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field559++;
        if (class93.field1294 <= arg1 && arg2 <= class296.field4668 && class273.field4228 <= arg6 && class127.field1782 >= arg5) {
            if (arg3 == 1) {
                class268.method1767(8, arg1, arg0, arg6, arg5, arg2);
            } else {
                class208.method1323(arg3, arg2, arg0, arg6, arg5, (byte) 64, arg1);
            }
        } else if (arg3 == 1) {
            class93.method612(arg2, false, arg5, arg0, arg1, arg6);
        } else {
            class4.method25(arg6, arg0, arg1, arg3, -125, arg5, arg2);
        }
        if (arg4 < 1) {
            field552 = null;
        }
    }
}
