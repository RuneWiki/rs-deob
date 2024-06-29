import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class262 {

    @OriginalMember(owner = "client!c", name = "c", descriptor = "I")
    public static int field4573 = 0;

    @OriginalMember(owner = "client!c", name = "f", descriptor = "Lvf;")
    public static class265 field4576 = class87.method582(-46, "Null");

    @OriginalMember(owner = "client!c", name = "d", descriptor = "Lng;")
    public static class135 field4574 = new class135(new byte[5000]);

    @OriginalMember(owner = "client!c", name = "h", descriptor = "[[S")
    public static short[][] field4578 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!c", name = "j", descriptor = "[Log;")
    public static class173[] field4580 = new class173[50];

    @OriginalMember(owner = "client!c", name = "i", descriptor = "Lfd;")
    public static class207 field4579 = new class207(64);

    @OriginalMember(owner = "client!c", name = "l", descriptor = "I")
    public static int field4582 = 0;

    @OriginalMember(owner = "client!c", name = "m", descriptor = "Z")
    public static boolean field4583 = false;

    @OriginalMember(owner = "client!c", name = "n", descriptor = "[J")
    public static long[] field4584 = new long[100];

    @OriginalMember(owner = "client!c", name = "a", descriptor = "I")
    public static int field4571;

    @OriginalMember(owner = "client!c", name = "b", descriptor = "I")
    public static int field4572;

    @OriginalMember(owner = "client!c", name = "e", descriptor = "I")
    public static int field4575;

    @OriginalMember(owner = "client!c", name = "g", descriptor = "I")
    public static int field4577;

    @OriginalMember(owner = "client!c", name = "k", descriptor = "[S")
    public static short[] field4581;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(ZIIIILfl;B)V")
    public static final void method1753(boolean arg0, int arg1, int arg2, int arg3, int arg4, class192 arg5, byte arg6) {
        field4571++;
        class219.field3957 = arg0;
        class125.field2245 = arg5;
        class216.field3899 = 1;
        class186.field3372 = arg2;
        class29.field745 = arg1;
        class120.field2114 = arg3;
        class55.field1127 = arg4;
        if (arg6 != -12) {
            method1756(109, (class135) null);
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(I)V")
    public static void method1754(int arg0) {
        field4581 = null;
        field4576 = null;
        field4574 = null;
        field4580 = null;
        if (arg0 == -5352) {
            field4584 = null;
            field4578 = null;
            field4579 = null;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(B[B)V")
    public static final void method1755(byte arg0, byte[] arg1) {
        field4575++;
        class135 var2 = new class135(arg1);
        var2.field2449 = arg1.length - 2;
        class43.field958 = var2.method927(126);
        class54.field1116 = new byte[class43.field958][];
        class6.field127 = new int[class43.field958];
        class269.field4810 = new int[class43.field958];
        class207.field3737 = new int[class43.field958];
        class6.field230 = new byte[class43.field958][];
        class190.field3417 = new int[class43.field958];
        class102.field1812 = new boolean[class43.field958];
        var2.field2449 = arg1.length - (class43.field958 * 8) - 7;
        class203.field3643 = var2.method927(arg0 ^ 0xFFFFFFC3);
        class14.field429 = var2.method927(125);
        int var3 = (var2.method920((byte) 113) & 0xFF) + 1;
        for (int var4 = 0; var4 < class43.field958; var4++) {
            class207.field3737[var4] = var2.method927(126);
        }
        for (int var5 = 0; var5 < class43.field958; var5++) {
            class269.field4810[var5] = var2.method927(125);
        }
        for (int var6 = 0; var6 < class43.field958; var6++) {
            class190.field3417[var6] = var2.method927(arg0 + 192);
        }
        for (int var7 = 0; var7 < class43.field958; var7++) {
            class6.field127[var7] = var2.method927(126);
        }
        var2.field2449 = arg1.length + 3 - var3 * 3 - (class43.field958 * 8) - 7;
        class268.field4715 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class268.field4715[var8] = var2.method909(arg0 - 917770285);
            if (class268.field4715[var8] == 0) {
                class268.field4715[var8] = 1;
            }
        }
        var2.field2449 = 0;
        int var9 = 0;
        if (arg0 != -67) {
            return;
        }
        while (var9 < class43.field958) {
            int var10 = class6.field127[var9];
            int var11 = class190.field3417[var9];
            int var12 = var10 * var11;
            boolean var13 = false;
            byte[] var14 = new byte[var12];
            class6.field230[var9] = var14;
            byte[] var15 = new byte[var12];
            class54.field1116[var9] = var15;
            int var16 = var2.method920((byte) 67);
            if ((var16 & 0x1) == 0) {
                for (int var17 = 0; var17 < var12; var17++) {
                    var14[var17] = var2.method929((byte) -3);
                }
                if ((var16 & 0x2) != 0) {
                    for (int var18 = 0; var18 < var12; var18++) {
                        byte var19 = var15[var18] = var2.method929((byte) -3);
                        var13 |= var19 != -1;
                    }
                }
            } else {
                int var20 = 0;
                label99: while (true) {
                    if (var11 <= var20) {
                        if ((var16 & 0x2) == 0) {
                            break;
                        }
                        int var21 = 0;
                        while (true) {
                            if (var21 >= var11) {
                                break label99;
                            }
                            for (int var22 = 0; var22 < var10; var22++) {
                                byte var23 = var15[var21 + (var11 * var22)] = var2.method929((byte) -3);
                                var13 |= var23 != -1;
                            }
                            var21++;
                        }
                    }
                    for (int var24 = 0; var24 < var10; var24++) {
                        var14[var11 * var24 + var20] = var2.method929((byte) -3);
                    }
                    var20++;
                }
            }
            class102.field1812[var9] = var13;
            var9++;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(ILng;)Lla;")
    public static final class116 method1756(int arg0, class135 arg1) {
        if (arg0 > -42) {
            return null;
        }
        class116 var2 = new class116();
        field4572++;
        var2.field2059 = arg1.method927(127);
        var2.field2058 = class145.method1004(var2.field2059, 14015);
        return var2;
    }
}
