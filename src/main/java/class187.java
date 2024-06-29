import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class187 {

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "[I")
    public static int[] field3463 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "Lmb;")
    public static class132 field3459 = class166.method1092("titlebox", 118);

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "Lmb;")
    private static class132 field3457 = class166.method1092("Login limit exceeded)3", 112);

    @OriginalMember(owner = "client!rc", name = "h", descriptor = "Lmb;")
    public static class132 field3464 = class166.method1092("<img=1>", 111);

    @OriginalMember(owner = "client!rc", name = "o", descriptor = "Z")
    public static boolean field3471 = false;

    @OriginalMember(owner = "client!rc", name = "p", descriptor = "[Lkd;")
    public static class112[] field3472 = new class112[2048];

    @OriginalMember(owner = "client!rc", name = "n", descriptor = "Lmb;")
    private static class132 field3470 = class166.method1092("Cancel", 111);

    @OriginalMember(owner = "client!rc", name = "l", descriptor = "Lmb;")
    public static class132 field3468 = field3457;

    @OriginalMember(owner = "client!rc", name = "r", descriptor = "Lmb;")
    private static class132 field3474 = class166.method1092("Use", 116);

    @OriginalMember(owner = "client!rc", name = "s", descriptor = "Lmb;")
    public static class132 field3475 = field3470;

    @OriginalMember(owner = "client!rc", name = "i", descriptor = "Lmb;")
    public static class132 field3465 = field3474;

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "I")
    public static int field3458;

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "I")
    public static int field3460;

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "I")
    public static int field3461;

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "I")
    public static int field3462;

    @OriginalMember(owner = "client!rc", name = "j", descriptor = "I")
    public static int field3466;

    @OriginalMember(owner = "client!rc", name = "k", descriptor = "I")
    public static int field3467;

    @OriginalMember(owner = "client!rc", name = "m", descriptor = "I")
    public static int field3469;

    @OriginalMember(owner = "client!rc", name = "q", descriptor = "I")
    public static int field3473;

    @OriginalMember(owner = "client!rc", name = "t", descriptor = "I")
    public static int field3476;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V")
    public static final void method1193(int arg0) {
        field3469++;
        class153.field2793 = null;
        class30.field462 = null;
        class23.field321 = null;
        class10.field109 = null;
        class94.field1657 = null;
        class118.field2244 = null;
        if (arg0 != 1) {
            field3472 = null;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIIIIIZ)V")
    public static final void method1194(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        field3466++;
        if (arg4 >= class135.field2542 && arg2 <= class168.field3083 && class169.field3161 <= arg0 && class17.field254 >= arg6) {
            class15.method79(arg2, arg3, arg4, arg5, arg6, arg0, -127, arg1);
        } else {
            class108.method691(arg0, arg1, arg5, arg2, arg3, arg4, arg6, 21888);
        }
        if (arg7) {
            field3457 = null;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(B)V")
    public static final void method1195(byte arg0) {
        if (arg0 != -39) {
            return;
        }
        field3476++;
        if (class15.field220 != null || class15.field217 != null) {
            return;
        }
        int var1 = class49.field827;
        if (class202.field3721) {
            if (var1 != 1) {
                int var6 = class181.field3329;
                int var7 = class36.field584;
                if (class52.field887 - 10 > var6 || class52.field887 + class172.field3208 + 10 < var6 || class25.field407 - 10 > var7 || var7 > class25.field407 + class160.field2913 + 10) {
                    class202.field3721 = false;
                    class150.method993(class160.field2913, class25.field407, class52.field887, true, class172.field3208);
                }
            }
            if (var1 != 1) {
                return;
            }
            int var8 = class52.field887;
            int var9 = class25.field407;
            int var10 = class48.field826;
            int var11 = -1;
            int var12 = class189.field3501;
            int var13 = class172.field3208;
            for (int var14 = 0; var14 < class57.field974; var14++) {
                int var15 = (class57.field974 - var14 - 1) * 15 + var9 + 31;
                if (var8 < var10 && var10 < var8 + var13 && var15 - 13 < var12 && var12 < var15 + 3) {
                    var11 = var14;
                }
            }
            if (var11 != -1) {
                class26.method195(-66, var11);
            }
            class202.field3721 = false;
            class150.method993(class160.field2913, class25.field407, class52.field887, true, class172.field3208);
            return;
        }
        if (var1 == 1 && class57.field974 > 0) {
            short var2 = class31.field488[class57.field974 - 1];
            if (var2 == 57 || var2 == 4 || var2 == 9 || var2 == 35 || var2 == 25 || var2 == 19 || var2 == 6 || var2 == 1 || var2 == 5 || var2 == 34 || var2 == 42 || var2 == 1001) {
                int var3 = class162.field2940[class57.field974 - 1];
                int var4 = class111.field2097[class57.field974 - 1];
                class96 var5 = class158.method1029((byte) -128, var4);
                if (class88.method549(107, class170.method1113(var5, (byte) -50)) || class9.method43(class170.method1113(var5, (byte) -50), false)) {
                    class69.field1156 = false;
                    class172.field3197 = 0;
                    if (class15.field220 != null) {
                        class183.method1174(class15.field220, 16235);
                    }
                    class15.field220 = class158.method1029((byte) -117, var4);
                    class4.field44 = class189.field3501;
                    class123.field2314 = class48.field826;
                    class154.field2817 = var3;
                    class183.method1174(class15.field220, 16235);
                    return;
                }
            }
        }
        if (var1 == 1 && (class15.field211 == 1 && class57.field974 > 2 || class101.method624(2000, class57.field974 - 1))) {
            var1 = 2;
        }
        if (var1 == 1 && class57.field974 > 0) {
            class26.method195(113, class57.field974 - 1);
        }
        if (var1 == 2 && class57.field974 > 0) {
            class113.method766(0);
            return;
        }
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(I)V")
    public static final void method1196(int arg0) {
        class118.field2241.method651((byte) 80);
        field3473++;
        int var1 = class118.field2241.method649(1, 25091);
        if (var1 == 0) {
            return;
        }
        int var2 = class118.field2241.method649(2, 25091);
        if (var2 == 0) {
            class211.field3874[class220.field4003++] = 2047;
            return;
        }
        if (arg0 != -23940) {
            field3465 = null;
        }
        if (var2 == 1) {
            int var3 = class118.field2241.method649(3, arg0 + 49031);
            class210.field3854.method288(92, false, var3);
            int var4 = class118.field2241.method649(1, arg0 ^ 0xFFFFC07F);
            if (var4 == 1) {
                class211.field3874[class220.field4003++] = 2047;
            }
        } else if (var2 == 2) {
            int var5 = class118.field2241.method649(3, 25091);
            class210.field3854.method288(96, true, var5);
            int var6 = class118.field2241.method649(3, 25091);
            class210.field3854.method288(-76, true, var6);
            int var7 = class118.field2241.method649(1, 25091);
            if (var7 == 1) {
                class211.field3874[class220.field4003++] = 2047;
            }
        } else if (var2 == 3) {
            int var8 = class118.field2241.method649(7, arg0 + 49031);
            int var9 = class118.field2241.method649(1, 25091);
            if (var9 == 1) {
                class211.field3874[class220.field4003++] = 2047;
            }
            int var10 = class118.field2241.method649(1, 25091);
            class139.field2615 = class118.field2241.method649(2, 25091);
            int var11 = class118.field2241.method649(7, arg0 + 49031);
            class210.field3854.method290(var11, var8, (byte) -98, var10 == 1);
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "([Lmb;I)Lmb;")
    public static final class132 method1197(class132[] arg0, int arg1) {
        field3458++;
        if (arg1 >= -69) {
            return null;
        } else if (arg0.length < 2) {
            throw new IllegalArgumentException();
        } else {
            return class70.method430(arg0.length, (byte) -14, 0, arg0);
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Z)V")
    public static void method1198(boolean arg0) {
        field3472 = null;
        field3470 = null;
        field3474 = null;
        field3465 = null;
        if (arg0) {
            method1198(true);
        }
        field3459 = null;
        field3464 = null;
        field3475 = null;
        field3457 = null;
        field3463 = null;
        field3468 = null;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1199(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        class183 var8 = new class183();
        var8.field3362 = arg2 / 128;
        var8.field3373 = arg3 / 128;
        var8.field3359 = arg4 / 128;
        var8.field3361 = arg5 / 128;
        var8.field3357 = arg1;
        var8.field3368 = arg2;
        var8.field3358 = arg3;
        var8.field3366 = arg4;
        var8.field3354 = arg5;
        var8.field3367 = arg6;
        var8.field3363 = arg7;
        class136.field2555[arg0][class136.field2562[arg0]++] = var8;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(BJ)V")
    public static final void method1200(byte arg0, long arg1) {
        try {
            if (arg0 > -113) {
                field3457 = null;
            }
            Thread.sleep(arg1);
        } catch (InterruptedException var3) {
        }
        field3467++;
    }
}
