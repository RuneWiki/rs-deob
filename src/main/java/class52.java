import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class52 {

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "I")
    public static int field1050 = 0;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "Lrb;")
    public static class156 field1049 = new class156();

    @OriginalMember(owner = "client!fd", name = "j", descriptor = "Led;")
    public static class43 field1058 = class191.method1219("http:)4)4", false);

    @OriginalMember(owner = "client!fd", name = "m", descriptor = "Led;")
    public static class43 field1061 = class191.method1219("Verbinde mit Server)3)3)3", false);

    @OriginalMember(owner = "client!fd", name = "n", descriptor = "Led;")
    private static class43 field1062 = class191.method1219("Loading)3)3)3", false);

    @OriginalMember(owner = "client!fd", name = "k", descriptor = "Led;")
    public static class43 field1059 = field1062;

    @OriginalMember(owner = "client!fd", name = "l", descriptor = "Ln;")
    public static class118 field1060 = new class118();

    @OriginalMember(owner = "client!fd", name = "o", descriptor = "Led;")
    public static class43 field1063 = class191.method1219("Weiter", false);

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "I")
    public static int field1051;

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "I")
    public static int field1052;

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "I")
    public static int field1053;

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "I")
    public static int field1054;

    @OriginalMember(owner = "client!fd", name = "h", descriptor = "I")
    public static int field1056;

    @OriginalMember(owner = "client!fd", name = "i", descriptor = "I")
    public static int field1057;

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "[I")
    public static int[] field1055;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(B)J")
    public static final synchronized long method315(byte arg0) {
        field1056++;
        long var1 = System.currentTimeMillis();
        if (var1 < class174.field3469) {
            class187.field3678 += class174.field3469 - var1;
        }
        int var3 = -96 / ((-arg0 - 73) / 51);
        class174.field3469 = var1;
        return class187.field3678 + var1;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method316(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1054++;
        if (class54.method335(-758973232, arg7)) {
            class137.field2847 = null;
            class47.method294(arg8, arg2, -290, class12.field177[arg7], arg0, arg1, arg6, arg4, -1, arg5);
            int var10 = 35 / ((arg3 - 59) / 54);
            if (class137.field2847 != null) {
                class47.method294(arg8, arg2, -290, class137.field2847, class95.field1860, class74.field1471, arg6, arg4, -1412584499, arg5);
                class137.field2847 = null;
            }
        } else if (arg8 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class107.field2056[var9] = true;
            }
        } else {
            class107.field2056[arg8] = true;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)V")
    public static void method317(int arg0) {
        field1049 = null;
        field1061 = null;
        field1063 = null;
        field1059 = null;
        field1058 = null;
        field1060 = null;
        field1055 = null;
        int var1 = -116 / ((-arg0 - 84) / 38);
        field1062 = null;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(BLrf;Ljava/lang/Object;)V")
    public static final void method318(byte arg0, class160 arg1, Object arg2) {
        int var3 = -74 % ((47 - arg0) / 54);
        field1057++;
        if (arg1.field3245 == null) {
            return;
        }
        for (int var4 = 0; var4 < 50 && arg1.field3245.peekEvent() != null; var4++) {
            class38.method209(1L, -7296);
        }
        if (arg2 != null) {
            arg1.field3245.postEvent(new ActionEvent(arg2, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(ILna;)V")
    public static final void method319(int arg0, class119 arg1) {
        field1053++;
        arg1.field2356 = false;
        if (arg0 < 108) {
            field1062 = null;
        }
        if (arg1.field2344 != -1) {
            class205 var2 = class175.method1101(arg1.field2344, true);
            if (var2 == null || var2.field3996 == null) {
                arg1.field2344 = -1;
            } else {
                arg1.field2310++;
                if (var2.field3996.length > arg1.field2346 && var2.field3991[arg1.field2346] < arg1.field2310) {
                    arg1.field2346++;
                    arg1.field2310 = 1;
                    class81.method502(class67.field1348 == arg1, var2, 963, arg1.field2346, arg1.field2347, arg1.field2328);
                }
                if (arg1.field2346 >= var2.field3996.length) {
                    arg1.field2310 = 0;
                    arg1.field2346 = 0;
                    class81.method502(class67.field1348 == arg1, var2, 963, arg1.field2346, arg1.field2347, arg1.field2328);
                }
            }
        }
        if (arg1.field2364 != -1 && arg1.field2345 <= client.field559) {
            if (arg1.field2325 < 0) {
                arg1.field2325 = 0;
            }
            int var3 = class16.method70(-1, arg1.field2364).field3781;
            if (var3 == -1) {
                arg1.field2364 = -1;
            } else {
                class205 var4 = class175.method1101(var3, true);
                if (var4 == null || var4.field3996 == null) {
                    arg1.field2364 = -1;
                } else {
                    arg1.field2324++;
                    if (arg1.field2325 < var4.field3996.length && var4.field3991[arg1.field2325] < arg1.field2324) {
                        arg1.field2325++;
                        arg1.field2324 = 1;
                        class81.method502(class67.field1348 == arg1, var4, 963, arg1.field2325, arg1.field2347, arg1.field2328);
                    }
                    if (arg1.field2325 >= var4.field3996.length) {
                        arg1.field2364 = -1;
                    }
                }
            }
        }
        if (arg1.field2351 != -1 && arg1.field2355 <= 1) {
            class205 var5 = class175.method1101(arg1.field2351, true);
            if (var5.field4005 == 1 && arg1.field2348 > 0 && arg1.field2365 <= client.field559 && arg1.field2333 < client.field559) {
                arg1.field2355 = 1;
                return;
            }
        }
        if (arg1.field2351 != -1 && arg1.field2355 == 0) {
            class205 var6 = class175.method1101(arg1.field2351, true);
            if (var6 == null || var6.field3996 == null) {
                arg1.field2351 = -1;
            } else {
                arg1.field2375++;
                if (var6.field3996.length > arg1.field2360 && arg1.field2375 > var6.field3991[arg1.field2360]) {
                    arg1.field2360++;
                    arg1.field2375 = 1;
                    class81.method502(class67.field1348 == arg1, var6, 963, arg1.field2360, arg1.field2347, arg1.field2328);
                }
                if (var6.field3996.length <= arg1.field2360) {
                    arg1.field2315++;
                    arg1.field2360 -= var6.field4006;
                    if (var6.field3995 <= arg1.field2315) {
                        arg1.field2351 = -1;
                    } else if (arg1.field2360 >= 0 && arg1.field2360 < var6.field3996.length) {
                        class81.method502(class67.field1348 == arg1, var6, 963, arg1.field2360, arg1.field2347, arg1.field2328);
                    } else {
                        arg1.field2351 = -1;
                    }
                }
                arg1.field2356 = var6.field4000;
            }
        }
        if (arg1.field2355 > 0) {
            arg1.field2355--;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lig;IIBBIZ)V")
    public static final void method320(class80 arg0, int arg1, int arg2, byte arg3, byte arg4, int arg5, boolean arg6) {
        long var7 = (long) ((arg2 << 16) + arg1);
        if (arg3 < 96) {
            field1062 = null;
        }
        field1051++;
        class143 var9 = (class143) class50.field1012.method75(var7, -108);
        if (var9 != null) {
            return;
        }
        class143 var10 = (class143) class207.field4044.method75(var7, -114);
        if (var10 != null) {
            return;
        }
        class143 var11 = (class143) class126.field2512.method75(var7, 106);
        if (var11 == null) {
            if (!arg6) {
                class143 var12 = (class143) class137.field2839.method75(var7, -73);
                if (var12 != null) {
                    return;
                }
            }
            class143 var13 = new class143();
            var13.field2953 = arg4;
            var13.field2956 = arg0;
            var13.field2954 = arg5;
            if (arg6) {
                class50.field1012.method82(-87, var13, var7);
                class185.field3653++;
            } else {
                class167.field3320.method681(17545, var13);
                class126.field2512.method82(75, var13, var7);
                class39.field750++;
            }
        } else if (arg6) {
            var11.method30(13);
            class50.field1012.method82(-108, var11, var7);
            class185.field3653++;
            class39.field750--;
        }
    }
}
