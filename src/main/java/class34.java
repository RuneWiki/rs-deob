import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class34 {

    @OriginalMember(owner = "client!kl", name = "h", descriptor = "Z")
    public static boolean field432 = false;

    @OriginalMember(owner = "client!kl", name = "g", descriptor = "Lv;")
    public static class240 field431 = new class240();

    @OriginalMember(owner = "client!kl", name = "k", descriptor = "Z")
    public static boolean field435 = false;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "I")
    public static int field425;

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "I")
    public static int field426;

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "I")
    public static int field427;

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "I")
    public static int field428;

    @OriginalMember(owner = "client!kl", name = "e", descriptor = "I")
    public static int field429;

    @OriginalMember(owner = "client!kl", name = "f", descriptor = "I")
    public static int field430;

    @OriginalMember(owner = "client!kl", name = "i", descriptor = "I")
    public static int field433;

    @OriginalMember(owner = "client!kl", name = "j", descriptor = "I")
    public static int field434;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method218(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field430++;
        if (arg4 >= 0 && arg3 >= 0 && arg4 < 103 && arg3 < 103) {
            if (arg0 == 0) {
                class231 var8 = class146.method1086(arg1, arg4, arg3);
                if (var8 != null) {
                    int var9 = Integer.MAX_VALUE & (int) (var8.field3393 >>> 32);
                    if (arg7 == 2) {
                        var8.field3401 = new class222(var9, 2, arg5 + 4, arg1, arg4, arg3, arg6, false, var8.field3401);
                        var8.field3388 = new class222(var9, 2, arg5 + 1 & 0x3, arg1, arg4, arg3, arg6, false, var8.field3388);
                    } else {
                        var8.field3401 = new class222(var9, arg7, arg5, arg1, arg4, arg3, arg6, false, var8.field3401);
                    }
                }
            }
            if (arg0 == 1) {
                class272 var10 = class225.method1562(arg1, arg4, arg3);
                if (var10 != null) {
                    int var11 = Integer.MAX_VALUE & (int) (var10.field4393 >>> 32);
                    if (arg7 == 4 || arg7 == 5) {
                        var10.field4402 = new class222(var11, 4, arg5, arg1, arg4, arg3, arg6, false, var10.field4402);
                    } else if (arg7 == 6) {
                        var10.field4402 = new class222(var11, 4, arg5 + 4, arg1, arg4, arg3, arg6, false, var10.field4402);
                    } else if (arg7 == 7) {
                        var10.field4402 = new class222(var11, 4, (arg5 + 2 & 0x3) + 4, arg1, arg4, arg3, arg6, false, var10.field4402);
                    } else if (arg7 == 8) {
                        var10.field4402 = new class222(var11, 4, arg5 + 4, arg1, arg4, arg3, arg6, false, var10.field4402);
                        var10.field4401 = new class222(var11, 4, (arg5 + 2 & 0x3) + 4, arg1, arg4, arg3, arg6, false, var10.field4401);
                    }
                }
            }
            if (arg0 == 2) {
                if (arg7 == 11) {
                    arg7 = 10;
                }
                class156 var12 = class191.method1360(arg1, arg4, arg3);
                if (var12 != null) {
                    var12.field2436 = new class222(Integer.MAX_VALUE & (int) (var12.field2431 >>> 32), arg7, arg5, arg1, arg4, arg3, arg6, false, var12.field2436);
                }
            }
            if (arg0 == 3) {
                class214 var13 = class221.method1538(arg1, arg4, arg3);
                if (var13 != null) {
                    var13.field3150 = new class222((int) (var13.field3151 >>> 32) & Integer.MAX_VALUE, 22, arg5, arg1, arg4, arg3, arg6, false, var13.field3150);
                }
            }
        }
        if (arg2 < 79) {
            field432 = true;
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(III)Lmh;")
    public static final class263 method219(int arg0, int arg1, int arg2) {
        class263 var3 = class144.method1078(arg0, 8534);
        field425++;
        if (arg2 == -1) {
            return var3;
        } else if (var3 == null || var3.field4143 == null || arg2 >= var3.field4143.length) {
            return null;
        } else if (arg1 < 18) {
            return null;
        } else {
            return var3.field4143[arg2];
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Z)V")
    public static void method220(boolean arg0) {
        field431 = null;
        if (!arg0) {
            method218(68, -65, -45, 40, 119, 72, -27, -84);
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(BI)V")
    public static final void method221(byte arg0, int arg1) {
        if (arg0 != -25) {
            method219(33, 51, -111);
        }
        class279 var2 = class111.method844(arg1, 3, -1780180960);
        var2.method1934((byte) -114);
        field427++;
    }
}
