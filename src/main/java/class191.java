import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class191 extends class113 {

    @OriginalMember(owner = "client!hc", name = "P", descriptor = "Ljava/lang/Object;")
    private Object field3195;

    @OriginalMember(owner = "client!hc", name = "L", descriptor = "Ljava/lang/String;")
    public static String field3191 = "Unable to find ";

    @OriginalMember(owner = "client!hc", name = "T", descriptor = "[I")
    public static int[] field3199 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!hc", name = "U", descriptor = "I")
    public static int field3200 = 0;

    @OriginalMember(owner = "client!hc", name = "K", descriptor = "I")
    public static int field3190;

    @OriginalMember(owner = "client!hc", name = "M", descriptor = "I")
    public static int field3192;

    @OriginalMember(owner = "client!hc", name = "N", descriptor = "I")
    public static int field3193;

    @OriginalMember(owner = "client!hc", name = "O", descriptor = "I")
    public static int field3194;

    @OriginalMember(owner = "client!hc", name = "Q", descriptor = "I")
    public static int field3196;

    @OriginalMember(owner = "client!hc", name = "R", descriptor = "I")
    public static int field3197;

    @OriginalMember(owner = "client!hc", name = "S", descriptor = "I")
    public static int field3198;

    @OriginalMember(owner = "client!hc", name = "W", descriptor = "I")
    public static int field3201;

    @OriginalMember(owner = "client!hc", name = "X", descriptor = "I")
    public static int field3202;

    @OriginalMember(owner = "client!hc", name = "Y", descriptor = "I")
    public static int field3203;

    @OriginalMember(owner = "client!hc", name = "Z", descriptor = "I")
    public static int field3204;

    @OriginalMember(owner = "client!hc", name = "ab", descriptor = "[[B")
    public static byte[][] field3205;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIZII)V", line = 4)
    public static final void method1444(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        field3202++;
        for (int var6 = arg1; var6 <= arg1 + arg2; var6++) {
            for (int var7 = arg4; var7 <= arg0 + arg4; var7++) {
                if (var7 >= 0 && var7 < 104 && var6 >= 0 && var6 < 104) {
                    class224.field3745[arg5][var7][var6] = 127;
                }
            }
        }
        if (arg3) {
            return;
        }
        for (int var8 = arg1; var8 < (arg1 + arg2); var8++) {
            for (int var9 = arg4; var9 < arg0 + arg4; var9++) {
                if (var9 >= 0 && var9 < 104 && var8 >= 0 && var8 < 104) {
                    class137.field2487[arg5][var9][var8] = arg5 > 0 ? class137.field2487[arg5 - 1][var9][var8] : 0;
                }
            }
        }
        if (arg4 > 0 && arg4 < 104) {
            for (int var10 = arg1 + 1; var10 < arg1 + arg2; var10++) {
                if (var10 >= 0 && var10 < 104) {
                    class137.field2487[arg5][arg4][var10] = class137.field2487[arg5][arg4 - 1][var10];
                }
            }
        }
        if (arg1 > 0 && arg1 < 104) {
            for (int var11 = arg4 + 1; var11 < (arg0 + arg4); var11++) {
                if (var11 >= 0 && var11 < 104) {
                    class137.field2487[arg5][var11][arg1] = class137.field2487[arg5][var11][arg1 - 1];
                }
            }
        }
        if (arg4 < 0 || arg1 < 0 || arg4 >= 104 || arg1 >= 104) {
            return;
        }
        if (arg5 == 0) {
            if (arg4 > 0 && class137.field2487[arg5][arg4 - 1][arg1] != 0) {
                class137.field2487[arg5][arg4][arg1] = class137.field2487[arg5][arg4 - 1][arg1];
            } else if (arg1 > 0 && class137.field2487[arg5][arg4][arg1 - 1] != 0) {
                class137.field2487[arg5][arg4][arg1] = class137.field2487[arg5][arg4][arg1 - 1];
            } else if (arg4 > 0 && arg1 > 0 && class137.field2487[arg5][arg4 - 1][arg1 - 1] != 0) {
                class137.field2487[arg5][arg4][arg1] = class137.field2487[arg5][arg4 - 1][arg1 - 1];
            }
        } else if (arg4 > 0 && class137.field2487[arg5 - 1][arg4 - 1][arg1] != class137.field2487[arg5][arg4 - 1][arg1]) {
            class137.field2487[arg5][arg4][arg1] = class137.field2487[arg5][arg4 - 1][arg1];
        } else if (arg1 > 0 && class137.field2487[arg5 - 1][arg4][arg1 - 1] != class137.field2487[arg5][arg4][arg1 - 1]) {
            class137.field2487[arg5][arg4][arg1] = class137.field2487[arg5][arg4][arg1 - 1];
        } else if (arg4 > 0 && arg1 > 0 && class137.field2487[arg5 - 1][arg4 - 1][arg1 - 1] != class137.field2487[arg5][arg4 - 1][arg1 - 1]) {
            class137.field2487[arg5][arg4][arg1] = class137.field2487[arg5][arg4 - 1][arg1 - 1];
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Llg;I)Ljava/lang/String;", line = 124)
    public static final String method1445(class137 arg0, int arg1) {
        if (arg1 != 11156) {
            return (String) null;
        }
        field3204++;
        if (client.method1894(arg0).method523((byte) -48) == 0) {
            return null;
        } else if (arg0.field2460 == null || arg0.field2460.trim().length() == 0) {
            return class348.field5537 ? "Hidden-use" : null;
        } else {
            return arg0.field2460;
        }
    }

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "(I)V", line = 149)
    public static void method1446(int arg0) {
        field3199 = null;
        field3205 = (byte[][]) null;
        field3191 = null;
        if (arg0 != 1) {
            method1447((byte) -39);
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)V", line = 167)
    public static final void method1447(byte arg0) {
        class198.field3391 = null;
        field3197++;
        class238.field3906 = null;
        if (arg0 != 94) {
            method1447((byte) 80);
        }
        class114.field1911 = null;
    }

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "(Z)Lql;", line = 180)
    public static final class20 method1448(boolean arg0) {
        field3190++;
        if (class84.field1350 >= class212.field3573.length) {
            return arg0 ? null : (class20) null;
        } else {
            return class212.field3573[class84.field1350++];
        }
    }

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "(I)Ljava/lang/Object;", line = 196)
    public final Object method690(int arg0) {
        field3193++;
        if (arg0 < 66) {
            this.field3195 = (Object) null;
        }
        return this.field3195;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIIB)V", line = 208)
    public static final void method1449(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field3203++;
        if (class114.field1915 < 100) {
            class51.method464(1270);
        }
        if (class43.field680) {
            class169.method1330(arg2, arg3, arg1 + arg2, arg0 + arg3);
        } else {
            class47.method420(arg2, arg3, arg1 + arg2, arg0 + arg3);
        }
        if (class114.field1915 < 100) {
            byte var14 = 20;
            int var15 = arg1 / 2 + arg2;
            int var16 = arg0 / 2 + arg3 - var14 - 18;
            if (class43.field680) {
                class169.method1337(arg2, arg3, arg1, arg0, 0);
                class169.method1325(var15 - 152, var16, 304, 34, 9179409);
                class169.method1325(var15 - 151, var16 + 1, 302, 32, 0);
                class169.method1337(var15 - 150, var16 + 2, class114.field1915 * 3, 30, 9179409);
                class169.method1337(class114.field1915 * 3 + (var15 - 150), var16 + 2, 300 - (class114.field1915 * 3), 30, 0);
            } else {
                class47.method422(arg2, arg3, arg1, arg0, 0);
                class47.method416(var15 - 152, var16, 304, 34, 9179409);
                class47.method416(var15 - 151, var16 + 1, 302, 32, 0);
                class47.method422(var15 - 150, var16 + 2, class114.field1915 * 3, 30, 9179409);
                class47.method422(var15 + (class114.field1915 * 3) - 150, var16 + 2, 300 - (class114.field1915 * 3), 30, 0);
            }
            class177.field3014.method2237(class338.field5406, var15, var14 + var16, 16777215, -1);
            return;
        }
        class226.field3810 = class95.field1483 - ((int) ((float) arg1 / class185.field3143));
        class109.field1857 = (int) ((float) (arg0 * 2) / class185.field3143);
        if (arg4 >= -2) {
            field3201 = -24;
        }
        class116.field2008 = (int) ((float) (arg1 * 2) / class185.field3143);
        class84.field1355 = class318.field5042 - (int) ((float) arg0 / class185.field3143);
        int var5 = class95.field1483 + ((int) ((float) arg1 / class185.field3143));
        int var6 = class95.field1483 - ((int) ((float) arg1 / class185.field3143));
        int var7 = class318.field5042 - ((int) ((float) arg0 / class185.field3143));
        int var8 = (int) ((float) arg0 / class185.field3143) + class318.field5042;
        if (class43.field680) {
            if (class347.field5532 == null || class347.field5532.field2967 != arg1 || class347.field5532.field2965 != arg0) {
                class347.field5532 = null;
                class347.field5532 = new class309(arg1, arg0);
            }
            class47.method407(class347.field5532.field4907, arg1, arg0);
            class15.method155(var8, (byte) -44, 0, var5, var6, var7, arg0, 0, arg1);
            class124.method1040(arg1, var8, class36.field527, arg0, 0, var5, 15106, 0, var7, var6);
            class58.method524((byte) -98, 0, var5, arg0, var7, arg1, var8, 0, var6);
            class347.field5532.method2140();
            class169.method1327(class347.field5532.field4907, arg2, arg3, arg1, arg0);
            class47.field725 = null;
        } else {
            class15.method155(var8, (byte) -44, arg3, var5, var6, var7, arg3 + arg0, arg2, arg2 + arg1);
            class124.method1040(arg2 + arg1, var8, class36.field527, arg0 + arg3, arg3, var5, 15106, arg2, var7, var6);
            class58.method524((byte) -73, arg2, var5, arg0 + arg3, var7, arg1 + arg2, var8, arg3, var6);
        }
        if (class185.field3140 > 0) {
            class38.field567--;
            if (class38.field567 == 0) {
                class38.field567 = 20;
                class185.field3140--;
            }
        }
        if (!class339.field5419) {
            return;
        }
        int var9 = arg1 + arg2 - 5;
        int var10 = arg3 + arg0 - 8;
        class241.field3926.method2239("Fps:" + class104.field1747, var9, var10, 16776960, -1);
        Runtime var11 = Runtime.getRuntime();
        int var17 = var10 - 15;
        int var12 = 16776960;
        int var13 = (int) ((var11.totalMemory() - var11.freeMemory()) / 1024L);
        if (var13 > 65536) {
            var12 = 16711680;
        }
        class241.field3926.method2239("Mem:" + var13 + "k", var9, var17, var12, -1);
        var10 = var17 - 15;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIIII)V", line = 334)
    public static final void method1450(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (class170.field2944 <= arg1 && class310.field4916 >= arg2 && class90.field1428 <= arg3 && arg5 <= class135.field2358) {
            class161.method1283(arg1, arg3, arg2, arg5, arg4, 4);
        } else {
            class18.method183(arg3, arg1, 123, arg4, arg5, arg2);
        }
        if (arg0 == 1) {
            field3198++;
        }
    }

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "(I)Z", line = 357)
    public final boolean method691(int arg0) {
        field3196++;
        if (arg0 != -9) {
            field3201 = -14;
        }
        return false;
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(Ljava/lang/Object;)V", line = 374)
    public class191(Object arg0) {
        this.field3195 = arg0;
    }
}
