import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class123 extends class101 {

    @OriginalMember(owner = "client!n", name = "E", descriptor = "Ltg;")
    public static class184 field2239 = class135.method812(" )2> <col=00ffff>", 3);

    @OriginalMember(owner = "client!n", name = "F", descriptor = "Lnd;")
    public static class127 field2240 = new class127(64);

    @OriginalMember(owner = "client!n", name = "B", descriptor = "I")
    public static int field2236;

    @OriginalMember(owner = "client!n", name = "D", descriptor = "I")
    public static int field2238;

    @OriginalMember(owner = "client!n", name = "G", descriptor = "I")
    public static int field2241;

    @OriginalMember(owner = "client!n", name = "H", descriptor = "I")
    public static int field2242;

    @OriginalMember(owner = "client!n", name = "I", descriptor = "I")
    public static int field2243;

    @OriginalMember(owner = "client!n", name = "A", descriptor = "Lfb;")
    public class52 field2235;

    @OriginalMember(owner = "client!n", name = "C", descriptor = "[[[B")
    public static byte[][][] field2237;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(II)I")
    public static int method748(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IIIIIZ)Loe;")
    public static final class137 method749(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field2242++;
        long var6 = (long) arg3 + ((long) arg2 << 38) + ((long) arg0 << 40) + ((long) arg4 << 16);
        if (!arg5) {
            class137 var8 = (class137) class178.field3400.method773(var6, 1);
            if (var8 != null) {
                return var8;
            }
        }
        class122 var9 = class60.method336(arg3, 10);
        if (arg4 > 1 && var9.field2207 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg4 >= var9.field2229[var11] && var9.field2229[var11] != 0) {
                    var10 = var9.field2207[var11];
                }
            }
            if (var10 != -1) {
                var9 = class60.method336(var10, 10);
            }
        }
        class95 var12 = var9.method746((byte) -128);
        if (var12 == null) {
            return null;
        }
        class137 var13 = null;
        if (var9.field2204 != -1) {
            var13 = method749(0, 32, 1, var9.field2191, 10, true);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = class4.field71;
        int[] var15 = new int[4];
        int var16 = class4.field74;
        int var17 = class4.field68;
        class4.method29(var15);
        class137 var18 = new class137(36, 32);
        class4.method20(var18.field2493, 36, 32);
        class4.method17();
        class23.method157();
        class23.method158(16, 16);
        int var19 = var9.field2213;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        class23.field425 = false;
        int var20 = class23.field422[var9.field2192] * var19 >> 16;
        int var21 = class23.field434[var9.field2192] * var19 >> 16;
        var12.method870();
        var12.method552(0, var9.field2183, var9.field2202, var9.field2192, var9.field2197, var20 + var9.field2201 - var12.field949 / 2, var21 - -var9.field2201);
        if (arg2 >= 1) {
            var18.method829(1);
        }
        if (arg2 >= 2) {
            var18.method829(16777215);
        }
        if (arg0 != 0) {
            var18.method846(arg0);
        }
        class4.method20(var18.field2493, 36, arg1);
        if (var9.field2204 != -1) {
            var13.method835(0, 0);
        }
        if (!arg5 && (var9.field2223 == 1 || arg4 != 1) && arg4 != -1) {
            class111.field2017.method1366(class101.method627((byte) 114, arg4), 0, 9, 16776960, 1);
        }
        if (!arg5) {
            class178.field3400.method776(var18, var6, (byte) -46);
        }
        class4.method20(var14, var16, var17);
        class4.method21(var15);
        class23.method157();
        class23.field425 = true;
        return var18;
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(I)Llg;")
    public static final class112 method750(int arg0) {
        field2236++;
        if (arg0 != 9) {
            field2240 = null;
        }
        try {
            return (class112) Class.forName("ia").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return new class177();
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(BLjava/lang/Object;Lpf;)V")
    public static final void method751(byte arg0, Object arg1, class147 arg2) {
        field2238++;
        if (arg2.field2657 == null) {
            return;
        }
        int var3 = -40 / ((-arg0 - 16) / 53);
        for (int var4 = 0; var4 < 50 && arg2.field2657.peekEvent() != null; var4++) {
            class151.method926((byte) 101, 1L);
        }
        if (arg1 != null) {
            arg2.field2657.postEvent(new ActionEvent(arg1, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!n", name = "c", descriptor = "(I)V")
    public static final void method752(int arg0) {
        field2243++;
        if (arg0 != 10838) {
            field2240 = null;
        }
        class26.field463.method770(false);
    }

    @OriginalMember(owner = "client!n", name = "d", descriptor = "(I)V")
    public static void method753(int arg0) {
        field2237 = null;
        field2239 = null;
        if (arg0 == 25211) {
            field2240 = null;
        }
    }
}
