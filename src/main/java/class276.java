import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class276 {

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "Z")
    public static boolean field3954 = false;

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "I")
    public static int field3953 = 0;

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "Lll;")
    public static class54 field3956 = new class54();

    @OriginalMember(owner = "client!jh", name = "h", descriptor = "Luk;")
    public static class105 field3959 = new class105();

    @OriginalMember(owner = "client!jh", name = "j", descriptor = "[I")
    public static int[] field3961 = new int[32];

    @OriginalMember(owner = "client!jh", name = "l", descriptor = "Z")
    public static boolean field3963 = false;

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "I")
    public static int field3955;

    @OriginalMember(owner = "client!jh", name = "f", descriptor = "I")
    public static int field3957;

    @OriginalMember(owner = "client!jh", name = "i", descriptor = "I")
    public static int field3960;

    @OriginalMember(owner = "client!jh", name = "k", descriptor = "Lfh;")
    public static class140 field3962;

    @OriginalMember(owner = "client!jh", name = "g", descriptor = "Lfe;")
    public class153 field3958;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "Lvc;")
    public class260 field3952;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(BIIILch;II)V", line = 10)
    public static final void method1868(byte arg0, int arg1, int arg2, int arg3, class8 arg4, int arg5, int arg6) {
        field3955++;
        boolean var7 = true;
        long var8 = 0L;
        if (arg0 > -97) {
            field3956 = (class54) null;
        }
        boolean var10 = false;
        boolean var11 = false;
        if (arg5 == 0) {
            var8 = class9.method62(arg1, arg6, arg3);
        } else if (arg5 == 1) {
            var8 = class333.method2335(arg1, arg6, arg3);
        } else if (arg5 == 2) {
            var8 = class106.method748(arg1, arg6, arg3);
        } else if (arg5 == 3) {
            var8 = class340.method2366(arg1, arg6, arg3);
        }
        int var12 = ((int) var8 & 0x7DC53) >> 14;
        int var13 = Integer.MAX_VALUE & (int) (var8 >>> 32);
        int var14 = (int) var8 >> 20 & 0x3;
        class219 var15 = class345.method2392(var13, 0);
        if (var15.method1599(-120)) {
            class199.method1462(arg3, var15, arg1, 16157, arg6);
        }
        if (var8 == 0L) {
            return;
        }
        class260 var16 = null;
        class260 var17 = null;
        if (arg5 == 0) {
            class231 var18 = class55.method420(arg1, arg6, arg3);
            if (var18 != null) {
                var17 = var18.field3305;
                var16 = var18.field3309;
            }
            if (var15.field3087 != 0) {
                arg4.method46(var14, !var15.field3161, arg6, var12, var15.field3115, 123, arg3);
            }
        } else if (arg5 == 1) {
            class66 var19 = class346.method2400(arg1, arg6, arg3);
            if (var19 != null) {
                var16 = var19.field848;
                var17 = var19.field845;
            }
        } else if (arg5 == 2) {
            class294 var20 = class262.method1803(arg1, arg6, arg3);
            if (var20 != null) {
                var16 = var20.field4275;
            }
            if (var15.field3087 != 0 && var15.field3112 + arg6 < 104 && (var15.field3112 + arg3) < 104 && (var15.field3096 + arg6) < 104 && var15.field3096 + arg3 < 104) {
                arg4.method45(var14, arg3, var15.field3096, 3, var15.field3115, arg6, var15.field3112, !var15.field3161);
            }
        } else if (arg5 == 3) {
            class24 var21 = class311.method2162(arg1, arg6, arg3);
            if (var21 != null) {
                var16 = var21.field269;
            }
            if (var15.field3087 == 1) {
                arg4.method59(33, arg6, arg3);
            }
        }
        if (var15.field3125 != null) {
            var15 = var15.method1589(0);
        }
        if (!class47.field623 || var15 == null || !var15.field3090) {
            return;
        }
        if (var12 == 2) {
            if (var16 instanceof class291) {
                ((class291) var16).method1995(-125);
            } else {
                class299.method2059(arg6, 0, var14 + 4, arg2, var15, (byte) 93, 0, arg3, var12);
            }
            if ((var17 instanceof class291)) {
                ((class291) var17).method1995(50);
            } else {
                class299.method2059(arg6, 0, var14 + 1 & 0x3, arg2, var15, (byte) 93, 0, arg3, var12);
            }
        } else if (var12 == 5) {
            if ((var16 instanceof class291)) {
                ((class291) var16).method1995(-64);
            } else {
                class299.method2059(arg6, class316.field4651[var14] * 8, var14, arg2, var15, (byte) 93, class258.field3754[var14] * 8, arg3, 4);
            }
        } else if (var12 == 6) {
            if ((var16 instanceof class291)) {
                ((class291) var16).method1995(-70);
            } else {
                class299.method2059(arg6, class165.field2320[var14] * 8, var14 + 4, arg2, var15, (byte) 93, class248.field3609[var14] * 8, arg3, 4);
            }
        } else if (var12 == 7) {
            if (var16 instanceof class291) {
                ((class291) var16).method1995(111);
            } else {
                class299.method2059(arg6, 0, (var14 + 2 & 0x3) + 4, arg2, var15, (byte) 93, 0, arg3, 4);
            }
        } else if (var12 == 8) {
            if (var16 instanceof class291) {
                ((class291) var16).method1995(52);
            } else {
                class299.method2059(arg6, class165.field2320[var14] * 8, var14 + 4, arg2, var15, (byte) 93, class248.field3609[var14] * 8, arg3, 4);
            }
            if (var17 instanceof class291) {
                ((class291) var17).method1995(-122);
            } else {
                class299.method2059(arg6, class165.field2320[var14] * 8, (var14 + 2 & 0x3) + 4, arg2, var15, (byte) 93, class248.field3609[var14] * 8, arg3, 4);
            }
        } else if (var12 == 11) {
            if (var16 instanceof class291) {
                ((class291) var16).method1995(-58);
            } else {
                class299.method2059(arg6, 0, var14 + 4, arg2, var15, (byte) 93, 0, arg3, 10);
            }
        } else if ((var16 instanceof class291)) {
            ((class291) var16).method1995(-71);
        } else {
            class299.method2059(arg6, 0, var14, arg2, var15, (byte) 93, 0, arg3, var12);
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(ZLio;)V", line = 209)
    public static final void method1869(boolean arg0, class135 arg1) {
        field3957++;
        class327.method2266(arg1, !arg0, 200000);
        if (!arg0) {
            method1869(false, (class135) null);
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Z)V", line = 220)
    public static void method1870(boolean arg0) {
        if (!arg0) {
            field3960 = -38;
        }
        field3956 = null;
        field3962 = null;
        field3961 = null;
        field3959 = null;
    }
}
