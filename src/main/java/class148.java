import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class148 {

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "S")
    public static short field2576 = 32767;

    @OriginalMember(owner = "client!pb", name = "h", descriptor = "I")
    public static int field2582 = -1;

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "[I")
    public static int[] field2581 = new int[] { 0, 1, 2, 3 };

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "Lwc;")
    public static class232 field2575 = new class232(100);

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "I")
    public static int field2577;

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "I")
    public static int field2578;

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "I")
    public static int field2579;

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "I")
    public static int field2580;

    @OriginalMember(owner = "client!pb", name = "i", descriptor = "Lvb;")
    public static class251 field2583;

    @OriginalMember(owner = "client!pb", name = "j", descriptor = "[I")
    public static int[] field2584;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V")
    public static void method990(int arg0) {
        field2584 = null;
        field2581 = null;
        field2575 = null;
        if (arg0 != 1) {
            field2579 = 66;
        }
        field2583 = null;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(ZBLvb;)V")
    public static final void method991(boolean arg0, byte arg1, class251 arg2) {
        if (field2583 != null) {
            try {
                field2583.method1653(99);
            } catch (Exception var8) {
            }
            field2583 = null;
        }
        field2583 = arg2;
        class60.method409(arg0, arg1 - 41);
        class159.field2744 = null;
        field2578++;
        if (arg1 != -68) {
            field2584 = null;
        }
        class56.field776 = 0;
        class112.field1843 = null;
        class245.field4251.field1821 = 0;
        while (true) {
            class186 var3 = (class186) class169.field2926.method1536(116);
            if (var3 == null) {
                while (true) {
                    class186 var4 = (class186) class257.field4492.method1536(61);
                    if (var4 == null) {
                        if (class9.field104 != 0) {
                            try {
                                class112 var5 = new class112(4);
                                var5.method768(4, arg1 + 7363);
                                var5.method768(class9.field104, 7295);
                                var5.method753(0, arg1 ^ 0xE6CB414);
                                field2583.method1650(12398, 0, var5.field1780, 4);
                            } catch (IOException var7) {
                                try {
                                    field2583.method1653(arg1 ^ 0x6C);
                                } catch (Exception var6) {
                                }
                                class249.field4313++;
                                field2583 = null;
                            }
                        }
                        class73.field1112 = 0;
                        class154.field2683 = class59.method407(arg1 ^ 0x7A);
                        return;
                    }
                    class163.field2797.method398(111, var4);
                    class34.field430.method1533(var4.field3308, -100, var4);
                    class115.field1888--;
                    client.field534++;
                }
            }
            class122.field2020.method1533(var3.field3308, -110, var3);
            class213.field3686++;
            class134.field2338--;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILeb;IIIB)V")
    public static final void method992(int arg0, class185 arg1, int arg2, int arg3, int arg4, byte arg5) {
        field2580++;
        if (arg1.field3256 == -1 && arg1.field3253 == null) {
            return;
        }
        int var6 = 0;
        if (arg1.field3248 < arg4) {
            var6 += arg4 - arg1.field3248;
        } else if (arg1.field3257 > arg4) {
            var6 += arg1.field3257 - arg4;
        }
        if (arg1.field3268 < arg2) {
            var6 += arg2 - arg1.field3268;
        } else if (arg2 < arg1.field3254) {
            var6 += arg1.field3254 - arg2;
        }
        if (arg1.field3267 < var6 - 64 || class166.field2828 == 0 || arg1.field3247 != arg0) {
            if (arg1.field3266 != null) {
                class86.field1341.method509(arg1.field3266);
                arg1.field3266 = null;
            }
            if (arg1.field3250 != null) {
                class86.field1341.method509(arg1.field3250);
                arg1.field3250 = null;
            }
            return;
        }
        var6 -= 64;
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = (arg1.field3267 - var6) * class166.field2828 / arg1.field3267;
        if (arg1.field3266 != null) {
            arg1.field3266.method128(var7);
        } else if (arg1.field3256 >= 0) {
            class28 var8 = class28.method188(class127.field2111, arg1.field3256, 0);
            if (var8 != null) {
                class220 var9 = var8.method186().method1452(class108.field1736);
                class24 var10 = class24.method139(var9, 100, var7);
                var10.method124(-1);
                class86.field1341.method507(var10);
                arg1.field3266 = var10;
            }
        }
        if (arg5 < 72) {
            return;
        }
        if (arg1.field3250 != null) {
            arg1.field3250.method128(var7);
            if (arg1.field3250.method1225(-119)) {
                return;
            }
            arg1.field3250 = null;
        } else if (arg1.field3253 != null && (arg1.field3259 -= arg3) <= 0) {
            int var11 = (int) ((double) arg1.field3253.length * Math.random());
            class28 var12 = class28.method188(class127.field2111, arg1.field3253[var11], 0);
            if (var12 != null) {
                class220 var13 = var12.method186().method1452(class108.field1736);
                class24 var14 = class24.method139(var13, 100, var7);
                var14.method124(0);
                class86.field1341.method507(var14);
                arg1.field3250 = var14;
                arg1.field3259 = (int) ((double) (arg1.field3264 - arg1.field3263) * Math.random()) + arg1.field3263;
                return;
            }
        }
    }
}
