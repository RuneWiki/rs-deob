import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class144 extends class146 {

    @OriginalMember(owner = "client!ue", name = "v", descriptor = "Z")
    public boolean field3286 = false;

    @OriginalMember(owner = "client!ue", name = "u", descriptor = "Lec;")
    public static class32 field3285 = class73.method594("mapdots", true);

    @OriginalMember(owner = "client!ue", name = "w", descriptor = "[I")
    public static int[] field3287 = new int[128];

    @OriginalMember(owner = "client!ue", name = "y", descriptor = "[I")
    public static int[] field3289 = new int[100];

    @OriginalMember(owner = "client!ue", name = "F", descriptor = "Lec;")
    public static class32 field3295 = class73.method594("und loggen sich dann erneut ein)3", true);

    @OriginalMember(owner = "client!ue", name = "r", descriptor = "I")
    public int field3282;

    @OriginalMember(owner = "client!ue", name = "s", descriptor = "I")
    public static int field3283;

    @OriginalMember(owner = "client!ue", name = "t", descriptor = "I")
    public static int field3284;

    @OriginalMember(owner = "client!ue", name = "x", descriptor = "I")
    public static int field3288;

    @OriginalMember(owner = "client!ue", name = "z", descriptor = "I")
    public static int field3290;

    @OriginalMember(owner = "client!ue", name = "A", descriptor = "I")
    public static int field3291;

    @OriginalMember(owner = "client!ue", name = "C", descriptor = "I")
    public static int field3292;

    @OriginalMember(owner = "client!ue", name = "D", descriptor = "I")
    public int field3293;

    @OriginalMember(owner = "client!ue", name = "E", descriptor = "I")
    public static int field3294;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(III[B)I")
    public static final int method1082(int arg0, int arg1, int arg2, byte[] arg3) {
        field3288++;
        int var4 = -1;
        for (int var5 = arg1; var5 < arg0; var5++) {
            var4 = var4 >>> 8 ^ class31.field611[(var4 ^ arg3[var5]) & 0xFF];
        }
        if (arg2 != 25274) {
            method1087(125);
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method1083(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field3292++;
        class23 var10 = null;
        for (class23 var11 = (class23) class45.field1077.method1213(81); var11 != null; var11 = (class23) class45.field1077.method1211(-3)) {
            if (var11.field401 == arg6 && var11.field405 == arg2 && var11.field420 == arg0 && var11.field398 == arg4) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class23();
            var10.field420 = arg0;
            var10.field398 = arg4;
            var10.field401 = arg6;
            var10.field405 = arg2;
            class5.method20(var10, (byte) -62);
            class45.field1077.method1216(var10, (byte) 97);
        }
        var10.field413 = arg5;
        var10.field414 = arg9;
        var10.field411 = arg7;
        if (arg3 > -54) {
            method1087(-128);
        }
        var10.field412 = arg1;
        var10.field404 = arg8;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(BLqd;)V")
    public static final void method1084(byte arg0, class115 arg1) {
        if (arg0 < 107) {
            field3285 = null;
        }
        field3291++;
        arg1.field2737 = false;
        if (arg1.field2710 != -1) {
            class149 var2 = class97.method762((byte) 94, arg1.field2710);
            if (var2 == null || var2.field3395 == null) {
                arg1.field2710 = -1;
            } else {
                arg1.field2759++;
                if (var2.field3395.length > arg1.field2730 && arg1.field2759 > var2.field3378[arg1.field2730]) {
                    arg1.field2730++;
                    arg1.field2759 = 1;
                    class71.method586(-44, arg1.field2700, arg1.field2749, arg1.field2730, var2);
                }
                if (var2.field3395.length <= arg1.field2730) {
                    arg1.field2759 = 0;
                    arg1.field2730 = 0;
                    class71.method586(-127, arg1.field2700, arg1.field2749, arg1.field2730, var2);
                }
            }
        }
        if (arg1.field2733 != -1 && class140.field3219 >= arg1.field2706) {
            if (arg1.field2756 < 0) {
                arg1.field2756 = 0;
            }
            int var3 = class38.method317(arg1.field2733, -107).field3098;
            if (var3 == -1) {
                arg1.field2733 = -1;
            } else {
                class149 var4 = class97.method762((byte) 104, var3);
                if (var4 == null || var4.field3395 == null) {
                    arg1.field2733 = -1;
                } else {
                    arg1.field2703++;
                    if (var4.field3395.length > arg1.field2756 && arg1.field2703 > var4.field3378[arg1.field2756]) {
                        arg1.field2756++;
                        arg1.field2703 = 1;
                        class71.method586(87, arg1.field2700, arg1.field2749, arg1.field2756, var4);
                    }
                    if (arg1.field2756 >= var4.field3395.length && (arg1.field2756 < 0 || var4.field3395.length <= arg1.field2756)) {
                        arg1.field2733 = -1;
                    }
                }
            }
        }
        if (arg1.field2714 != -1 && arg1.field2717 <= 1) {
            class149 var5 = class97.method762((byte) 125, arg1.field2714);
            if (var5.field3384 == 1 && arg1.field2750 > 0 && class140.field3219 >= arg1.field2732 && class140.field3219 > arg1.field2726) {
                arg1.field2717 = 1;
                return;
            }
        }
        if (arg1.field2714 != -1 && arg1.field2717 == 0) {
            class149 var6 = class97.method762((byte) 109, arg1.field2714);
            if (var6 == null || var6.field3395 == null) {
                arg1.field2714 = -1;
            } else {
                arg1.field2739++;
                if (var6.field3395.length > arg1.field2727 && var6.field3378[arg1.field2727] < arg1.field2739) {
                    arg1.field2727++;
                    arg1.field2739 = 1;
                    class71.method586(-30, arg1.field2700, arg1.field2749, arg1.field2727, var6);
                }
                if (arg1.field2727 >= var6.field3395.length) {
                    arg1.field2716++;
                    arg1.field2727 -= var6.field3388;
                    if (var6.field3391 <= arg1.field2716) {
                        arg1.field2714 = -1;
                    } else if (arg1.field2727 >= 0 && var6.field3395.length > arg1.field2727) {
                        class71.method586(-74, arg1.field2700, arg1.field2749, arg1.field2727, var6);
                    } else {
                        arg1.field2714 = -1;
                    }
                }
                arg1.field2737 = var6.field3373;
            }
        }
        if (arg1.field2717 > 0) {
            arg1.field2717--;
        }
    }

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "(I)V")
    public static final void method1085(int arg0) {
        class150.field3429 = true;
        field3290++;
        class154.field3531 = true;
        int var1 = 56 % ((12 - arg0) / 52);
    }

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "(I)[Lhb;")
    public static final class51[] method1086(int arg0) {
        field3284++;
        class51[] var1 = new class51[class92.field2112];
        for (int var2 = arg0; var2 < class92.field2112; var2++) {
            class51 var3 = var1[var2] = new class51();
            var3.field1170 = class152.field3508;
            var3.field1169 = class128.field2967;
            var3.field1171 = class70.field1639[var2];
            var3.field1166 = class74.field1747[var2];
            var3.field1168 = class126.field2927[var2];
            var3.field1172 = class34.field720[var2];
            var3.field1167 = class31.field616;
            var3.field1165 = class147.field3346[var2];
        }
        class70.method580((byte) 29);
        return var1;
    }

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "(I)V")
    public static void method1087(int arg0) {
        field3289 = null;
        field3287 = null;
        field3285 = null;
        if (arg0 != 30079) {
            method1085(-22);
        }
        field3295 = null;
    }
}
