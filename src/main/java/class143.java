import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class143 {

    @OriginalMember(owner = "client!df", name = "a", descriptor = "Z")
    public static boolean field2371 = false;

    @OriginalMember(owner = "client!df", name = "d", descriptor = "I")
    public static int field2374 = -1;

    @OriginalMember(owner = "client!df", name = "f", descriptor = "Le;")
    public static class191 field2376 = class54.method368("Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q", 2047);

    @OriginalMember(owner = "client!df", name = "o", descriptor = "Le;")
    public static class191 field2385 = class54.method368("::fpson", 2047);

    @OriginalMember(owner = "client!df", name = "n", descriptor = "I")
    public static int field2384 = 2;

    @OriginalMember(owner = "client!df", name = "c", descriptor = "I")
    public static int field2373;

    @OriginalMember(owner = "client!df", name = "g", descriptor = "I")
    public static int field2377;

    @OriginalMember(owner = "client!df", name = "h", descriptor = "I")
    public static int field2378;

    @OriginalMember(owner = "client!df", name = "i", descriptor = "I")
    public static int field2379;

    @OriginalMember(owner = "client!df", name = "j", descriptor = "I")
    public static int field2380;

    @OriginalMember(owner = "client!df", name = "k", descriptor = "I")
    public static int field2381;

    @OriginalMember(owner = "client!df", name = "l", descriptor = "I")
    public static int field2382;

    @OriginalMember(owner = "client!df", name = "m", descriptor = "Lng;")
    public static class121 field2383;

    @OriginalMember(owner = "client!df", name = "p", descriptor = "Lfa;")
    public static class80 field2386;

    @OriginalMember(owner = "client!df", name = "b", descriptor = "[I")
    public static int[] field2372;

    @OriginalMember(owner = "client!df", name = "e", descriptor = "[S")
    public static short[] field2375;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(III)Lag;")
    public static final class254 method938(int arg0, int arg1, int arg2) {
        class199 var3 = class201.field3608[arg0][arg1][arg2];
        return var3 == null ? null : var3.field3535;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(BLe;I)V")
    public static final void method939(byte arg0, class191 arg1, int arg2) {
        int var3 = -9 / ((arg0 - 21) / 56);
        field2377++;
        class241 var4 = class14.method97(3, arg2, -77);
        var4.method1694((byte) -90);
        var4.field4298 = arg1;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(ZIIIZIZI)Lwa;")
    public static final class226 method940(boolean arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, boolean arg6, int arg7) {
        field2381++;
        class148 var8 = class100.method623(-1, arg7);
        if (arg2 < arg3 && var8.field2538 != null) {
            int var9 = -1;
            for (int var10 = 0; var10 < 10; var10++) {
                if (var8.field2485[var10] <= arg3 && var8.field2485[var10] != 0) {
                    var9 = var8.field2538[var10];
                }
            }
            if (var9 != -1) {
                var8 = class100.method623(-1, var9);
            }
        }
        class144 var11 = var8.method1010((byte) 24);
        if (var11 == null) {
            return null;
        }
        class155 var12 = null;
        if (var8.field2534 != -1) {
            var12 = (class155) method940(false, 0, arg2, 10, true, 1, true, var8.field2545);
            if (var12 == null) {
                return null;
            }
        } else if (var8.field2511 != -1) {
            var12 = (class155) method940(false, arg1, 1, arg3, false, arg5, true, var8.field2523);
            if (var12 == null) {
                return null;
            }
        }
        int[] var13 = class7.field69;
        int var14 = class7.field67;
        int[] var15 = new int[4];
        int var16 = class7.field61;
        class7.method35(var15);
        class155 var17 = new class155(36, 32);
        class7.method43(var17.field2656, 36, 32);
        class15.method107();
        class15.method117(16, 16);
        int var18 = var8.field2500;
        if (arg4) {
            var18 = (int) ((double) var18 * 1.5D);
        } else if (arg5 == 2) {
            var18 = (int) ((double) var18 * 1.04D);
        }
        class15.field201 = false;
        int var19 = class15.field206[var8.field2516] * var18 >> 16;
        int var20 = class15.field204[var8.field2516] * var18 >> 16;
        var11.method965(0, var8.field2527, var8.field2554, var8.field2516, var8.field2560, var20 - (var11.method126() / 2 - var8.field2517), var19 - -var8.field2517);
        if (arg5 >= 1) {
            var17.method1056(1);
            if (arg5 >= 2) {
                var17.method1056(16777215);
            }
            class7.method43(var17.field2656, 36, 32);
        }
        if (arg1 != 0) {
            var17.method1055(arg1);
        }
        if (var8.field2534 != -1) {
            var12.method598(0, 0);
        } else if (var8.field2511 != -1) {
            class7.method43(var12.field2656, 36, 32);
            var17.method598(0, 0);
            var17 = var12;
        }
        if (arg0 && (var8.field2521 == 1 || arg3 != 1) && arg3 != -1) {
            class200.field3583.method296(class232.method1640(-100001, arg3), 0, 9, 16776960, 1);
        }
        class7.method43(var13, var14, var16);
        class7.method58(var15);
        class15.method107();
        class15.field201 = true;
        return var17;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V")
    public static final void method941(int arg0) {
        field2380++;
        class132.field2203.method992(-31);
        if (arg0 != 36) {
            field2372 = null;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Z)V")
    public static void method942(boolean arg0) {
        field2383 = null;
        field2375 = null;
        field2376 = null;
        field2386 = null;
        field2385 = null;
        field2372 = null;
        if (arg0) {
            method939((byte) -52, (class191) null, 31);
        }
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(I)V")
    public static final void method943(int arg0) {
        class53.field963.method1096(173, 0);
        class53.field963.method1589(0L, false);
        class256.field4538++;
        field2382++;
        if (arg0 <= 107) {
            method938(-64, 102, -112);
        }
    }
}
