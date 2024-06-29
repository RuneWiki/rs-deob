import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public abstract class class22 extends class34 {

    @OriginalMember(owner = "client!na", name = "H", descriptor = "[Lke;")
    public static class256[] field284 = new class256[100];

    @OriginalMember(owner = "client!na", name = "J", descriptor = "Lke;")
    public static class256 field286 = class316.method2202(",Mcran)2titre ouvert", 27626);

    @OriginalMember(owner = "client!na", name = "G", descriptor = "I")
    public static int field283;

    @OriginalMember(owner = "client!na", name = "K", descriptor = "I")
    public static int field287;

    @OriginalMember(owner = "client!na", name = "L", descriptor = "I")
    public static int field288;

    @OriginalMember(owner = "client!na", name = "M", descriptor = "I")
    public static int field289;

    @OriginalMember(owner = "client!na", name = "I", descriptor = "Lng;")
    public static class138 field285;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(ZZIILti;ZLti;)I", line = 4)
    public static final int method139(boolean arg0, boolean arg1, int arg2, int arg3, class182 arg4, boolean arg5, class182 arg6) {
        field283++;
        int var7 = class29.method209(true, arg1, arg4, arg6, arg2);
        if (var7 != 0) {
            return arg1 ? -var7 : var7;
        } else if (arg0) {
            return -6;
        } else if (arg3 == -1) {
            return 0;
        } else {
            int var8 = class29.method209(!arg0, arg5, arg4, arg6, arg3);
            return arg5 ? -var8 : var8;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(BLke;)Lqh;", line = 38)
    public static final class31 method140(byte arg0, class256 arg1) {
        field287++;
        class31 var2 = (class31) class234.field4003.method1270((byte) -121);
        if (arg0 < 115) {
            return (class31) null;
        }
        while (var2 != null) {
            if (var2.field506.method1806(false, arg1)) {
                return var2;
            }
            var2 = (class31) class234.field4003.method1277(1);
        }
        return null;
    }

    @OriginalMember(owner = "client!na", name = "h", descriptor = "(I)V", line = 71)
    public static void method142(int arg0) {
        field284 = null;
        field286 = null;
        if (arg0 > 63) {
            field285 = null;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Log;IIILjk;ILrb;I)V", line = 100)
    public static final void method143(class279 arg0, int arg1, int arg2, int arg3, class273 arg4, int arg5, class144 arg6, int arg7) {
        field288++;
        class187 var8 = new class187();
        var8.field3275 = arg5;
        var8.field3297 = arg1 * arg7;
        var8.field3280 = arg3 * 128;
        if (arg4 != null) {
            var8.field3274 = arg4.field4716;
            var8.field3290 = arg4;
            var8.field3298 = arg4.field4735;
            int var9 = arg4.field4662;
            var8.field3296 = arg4.field4721 * 128;
            var8.field3295 = arg4.field4708;
            var8.field3288 = arg4.field4732;
            int var10 = arg4.field4711;
            if (arg2 == 1 || arg2 == 3) {
                var10 = arg4.field4662;
                var9 = arg4.field4711;
            }
            var8.field3286 = (arg3 + var9) * 128;
            var8.field3285 = (arg1 + var10) * 128;
            if (arg4.field4664 != null) {
                var8.field3291 = true;
                var8.method1352(arg7);
            }
            if (var8.field3295 != null) {
                var8.field3282 = var8.field3298 + ((int) (Math.random() * (double) (var8.field3274 - var8.field3298)));
            }
            class246.field4191.method1269(false, var8);
        } else if (arg0 != null) {
            var8.field3293 = arg0;
            class74 var11 = arg0.field4860;
            if (var11.field1381 != null) {
                var8.field3291 = true;
                var11 = var11.method553(4175);
            }
            if (var11 != null) {
                var8.field3286 = (arg3 + var11.field1418) * 128;
                var8.field3285 = (var11.field1418 + arg1) * 128;
                var8.field3288 = class269.method1860(arg0, 112);
                var8.field3296 = var11.field1407 * 128;
            }
            class186.field3272.method1269(false, var8);
        } else if (arg6 != null) {
            var8.field3277 = arg6;
            var8.field3286 = (arg6.method515(5373952) + arg3) * 128;
            var8.field3285 = (arg1 + arg6.method515(5373952)) * 128;
            var8.field3288 = class1.method10(arg6, 127);
            var8.field3296 = arg6.field2545 * 128;
            class31.field498.method1749(true, var8, arg6.field2532.method1780(true));
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Lng;Lke;B)Lqi;", line = 186)
    public static final class242 method144(class138 arg0, class256 arg1, byte arg2) {
        int var3 = arg0.method1006((byte) 76, arg1);
        field289++;
        if (var3 == -1) {
            return new class242(0);
        }
        int[] var4 = arg0.method1001(-2658, var3);
        if (arg2 != 108) {
            return (class242) null;
        }
        class242 var5 = new class242(var4.length);
        for (int var6 = 0; var6 < var5.field4113; var6++) {
            class41 var7 = new class41(arg0.method1016(var3, 100, var4[var6]));
            var5.field4124[var6] = var7.method313((byte) 54);
            var5.field4110[var6] = var7.method323(9092);
            var5.field4119[var6] = (short) var7.method346(arg2 - 124);
            var5.field4122[var6] = (short) var7.method346(-16);
            var5.field4117[var6] = var7.method327(class288.method2011(arg2, 104));
        }
        return var5;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(I[Lgf;)V", line = 221)
    public static final void method145(int arg0, class113[] arg1) {
        class240.field4095[arg0] = arg1;
    }

    @OriginalMember(owner = "client!na", name = "g", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method141(int arg0);

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(Z)Z")
    public abstract boolean method146(boolean arg0);
}
