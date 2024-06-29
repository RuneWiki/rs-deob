import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class215 {

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "I")
    public static int field3507 = 0;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "I")
    public static int field3505;

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "I")
    public static int field3506;

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "I")
    public static int field3508;

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "I")
    public static int field3509;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(B)V", line = 7)
    public static final void method1544(byte arg0) {
        if (arg0 != 36) {
            method1544((byte) 117);
        }
        field3508++;
        class112.field1708.method707(arg0 - 36);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(II)Lch;", line = 23)
    public static final class323 method1545(int arg0, int arg1) {
        field3509++;
        class323 var2 = (class323) class258.field4132.method704((byte) 105, (long) arg0);
        if (arg1 != 1) {
            field3507 = -91;
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class175.field2901.method1287(class2.method12(arg0, arg1 ^ 0x111D), class81.method550(arg0, true), arg1 - 2);
        class323 var4 = new class323();
        var4.field5020 = arg0;
        if (var3 != null) {
            var4.method2267(new class44(var3), true);
        }
        class258.field4132.method703(var4, (long) arg0, (byte) -87);
        return var4;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lle;ILqm;ILqi;III)V", line = 55)
    public static final void method1546(class97 arg0, int arg1, class334 arg2, int arg3, class234 arg4, int arg5, int arg6, int arg7) {
        if (arg1 != 128) {
            return;
        }
        field3506++;
        class155 var8 = new class155();
        var8.field2394 = arg3;
        var8.field2395 = arg5 * 128;
        var8.field2389 = arg6 * 128;
        if (arg0 != null) {
            var8.field2384 = arg0;
            var8.field2392 = arg0.field1341;
            var8.field2382 = arg0.field1371;
            var8.field2388 = arg0.field1323;
            var8.field2397 = arg0.field1365 * 128;
            int var9 = arg0.field1337;
            var8.field2396 = arg0.field1361;
            var8.field2398 = arg0.field1368;
            int var10 = arg0.field1343;
            if (arg7 == 1 || arg7 == 3) {
                var9 = arg0.field1343;
                var10 = arg0.field1337;
            }
            var8.field2374 = (arg5 + var9) * 128;
            var8.field2387 = (arg6 + var10) * 128;
            if (arg0.field1387 != null) {
                var8.field2391 = true;
                var8.method1108(2267);
            }
            if (var8.field2392 != null) {
                var8.field2400 = (int) ((double) (var8.field2382 - var8.field2388) * Math.random()) + var8.field2388;
            }
            class240.field3813.method1232(arg1 ^ 0xFB, var8);
        } else if (arg4 != null) {
            var8.field2386 = arg4;
            class256 var11 = arg4.field3752;
            if (var11.field4080 != null) {
                var8.field2391 = true;
                var11 = var11.method1843(-1);
            }
            if (var11 != null) {
                var8.field2387 = (arg6 + var11.field4051) * 128;
                var8.field2374 = (var11.field4051 + arg5) * 128;
                var8.field2398 = class214.method1536(0, arg4);
                var8.field2397 = var11.field4113 * 128;
                var8.field2396 = var11.field4115;
            }
            class229.field3636.method1232(108, var8);
        } else if (arg2 != null) {
            var8.field2379 = arg2;
            var8.field2374 = (arg2.method1881(arg1 ^ 0xFFFFB0D5) + arg5) * 128;
            var8.field2387 = (arg2.method1881(-20395) + arg6) * 128;
            var8.field2398 = class153.method1106(arg1 ^ 0xFFFFFF7E, arg2);
            var8.field2396 = arg2.field5220;
            var8.field2397 = arg2.field5226 * 128;
            class77.field1091.method461(119, class204.method1491(-26916, arg2.field5216), var8);
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V", line = 168)
    public static final void method1547(int arg0) {
        field3505++;
        if (arg0 > -49) {
            field3507 = -7;
        }
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < (class185.field3070 - 1); var2++) {
                if (class113.field1727[var2] < 1000 && class113.field1727[var2 + 1] > 1000) {
                    var1 = false;
                    String var3 = class157.field2458[var2];
                    class157.field2458[var2] = class157.field2458[var2 + 1];
                    class157.field2458[var2 + 1] = var3;
                    String var4 = class168.field2777[var2];
                    class168.field2777[var2] = class168.field2777[var2 + 1];
                    class168.field2777[var2 + 1] = var4;
                    int var5 = class193.field3155[var2];
                    class193.field3155[var2] = class193.field3155[var2 + 1];
                    class193.field3155[var2 + 1] = var5;
                    int var6 = class343.field5338[var2];
                    class343.field5338[var2] = class343.field5338[var2 + 1];
                    class343.field5338[var2 + 1] = var6;
                    int var7 = class212.field3474[var2];
                    class212.field3474[var2] = class212.field3474[var2 + 1];
                    class212.field3474[var2 + 1] = var7;
                    short var8 = class113.field1727[var2];
                    class113.field1727[var2] = class113.field1727[var2 + 1];
                    class113.field1727[var2 + 1] = var8;
                    long var9 = class190.field3108[var2];
                    class190.field3108[var2] = class190.field3108[var2 + 1];
                    class190.field3108[var2 + 1] = var9;
                }
            }
        }
    }
}
