import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class153 {

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "Lvf;")
    public static class265 field2842 = class87.method582(-46, "Spielwelt erstellt)3");

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "Lvf;")
    public static class265 field2840 = class87.method582(-46, "");

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "[I")
    public static int[] field2843 = new int[4096];

    @OriginalMember(owner = "client!tj", name = "i", descriptor = "Z")
    public static boolean field2848;

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "I")
    public static int field2841;

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "I")
    public static int field2844;

    @OriginalMember(owner = "client!tj", name = "f", descriptor = "I")
    public static int field2845;

    @OriginalMember(owner = "client!tj", name = "g", descriptor = "I")
    public static int field2846;

    @OriginalMember(owner = "client!tj", name = "h", descriptor = "I")
    public static int field2847;

    @OriginalMember(owner = "client!tj", name = "j", descriptor = "[I")
    public static int[] field2849;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(I)V")
    public static void method1044(int arg0) {
        field2843 = null;
        field2840 = null;
        field2842 = null;
        field2849 = null;
        if (arg0 != 4) {
            method1048(29L, (byte) 7);
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(ILnc;IB)V")
    public static final void method1045(int arg0, class122 arg1, int arg2, byte arg3) {
        field2844++;
        if (arg1.field2570 == arg0 && arg0 != -1) {
            class216 var4 = class174.method1142(arg0, false);
            int var5 = var4.field3880;
            if (var5 == 1) {
                arg1.field2589 = 0;
                arg1.field2591 = arg2;
                arg1.field2581 = 0;
                arg1.field2552 = 0;
                class268.method1832(var4, class214.field3827 == arg1, arg1.field2552, arg1.field2600, -2, arg1.field2564);
            }
            if (var5 == 2) {
                arg1.field2589 = 0;
            }
        } else if (arg0 == -1 || arg1.field2570 == -1 || class174.method1142(arg0, false).field3888 >= class174.method1142(arg1.field2570, false).field3888) {
            arg1.field2590 = arg1.field2551;
            arg1.field2570 = arg0;
            arg1.field2591 = arg2;
            arg1.field2552 = 0;
            arg1.field2589 = 0;
            arg1.field2581 = 0;
            if (arg1.field2570 != -1) {
                class268.method1832(class174.method1142(arg1.field2570, false), class214.field3827 == arg1, arg1.field2552, arg1.field2600, -2, arg1.field2564);
            }
        }
        int var6 = 115 / ((55 - arg3) / 63);
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1046(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg4 >= 0 && arg0 >= 0 && arg4 < 103 && arg0 < 103) {
            if (arg5 == 0) {
                class144 var8 = class242.method1613(arg3, arg4, arg0);
                if (var8 != null) {
                    int var9 = (int) (var8.field2683 >>> 32) & Integer.MAX_VALUE;
                    if (arg1 == 2) {
                        var8.field2682 = new class167(var9, 2, arg7 + 4, arg3, arg4, arg0, arg2, false, var8.field2682);
                        var8.field2694 = new class167(var9, 2, arg7 + 1 & 0x3, arg3, arg4, arg0, arg2, false, var8.field2694);
                    } else {
                        var8.field2682 = new class167(var9, arg1, arg7, arg3, arg4, arg0, arg2, false, var8.field2682);
                    }
                }
            }
            if (arg5 == 1) {
                class200 var10 = class28.method240(arg3, arg4, arg0);
                if (var10 != null) {
                    int var11 = Integer.MAX_VALUE & (int) (var10.field3565 >>> 32);
                    if (arg1 == 4 || arg1 == 5) {
                        var10.field3572 = new class167(var11, 4, arg7, arg3, arg4, arg0, arg2, false, var10.field3572);
                    } else if (arg1 == 6) {
                        var10.field3572 = new class167(var11, 4, arg7 + 4, arg3, arg4, arg0, arg2, false, var10.field3572);
                    } else if (arg1 == 7) {
                        var10.field3572 = new class167(var11, 4, (arg7 + 2 & 0x3) + 4, arg3, arg4, arg0, arg2, false, var10.field3572);
                    } else if (arg1 == 8) {
                        var10.field3572 = new class167(var11, 4, arg7 + 4, arg3, arg4, arg0, arg2, false, var10.field3572);
                        var10.field3567 = new class167(var11, 4, (arg7 + 2 & 0x3) + 4, arg3, arg4, arg0, arg2, false, var10.field3567);
                    }
                }
            }
            if (arg5 == 2) {
                if (arg1 == 11) {
                    arg1 = 10;
                }
                class146 var12 = class202.method1391(arg3, arg4, arg0);
                if (var12 != null) {
                    var12.field2737 = new class167(Integer.MAX_VALUE & (int) (var12.field2720 >>> 32), arg1, arg7, arg3, arg4, arg0, arg2, false, var12.field2737);
                }
            }
            if (arg5 == 3) {
                class8 var13 = class130.method866(arg3, arg4, arg0);
                if (var13 != null) {
                    var13.field270 = new class167(Integer.MAX_VALUE & (int) (var13.field266 >>> 32), 22, arg7, arg3, arg4, arg0, arg2, false, var13.field270);
                }
            }
        }
        if (arg6 < 18) {
            field2842 = null;
        }
        field2846++;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(ZILvf;)V")
    public static final void method1047(boolean arg0, int arg1, class265 arg2) {
        class265 var3 = arg2.method1804(-68);
        field2847++;
        int var4 = -38 % ((arg1 - 2) / 35);
        int var5 = 0;
        short[] var6 = new short[16];
        int var7 = arg0 ? 32768 : 0;
        int var8 = (arg0 ? class82.field1537 : class184.field3298) + var7;
        for (int var9 = var7; var9 < var8; var9++) {
            class39 var12 = class145.method1004(var9, 14015);
            if (var12.field898 && var12.method331(-70).method1804(-2).method1792(0, var3) != -1) {
                if (var5 >= 50) {
                    class120.field2110 = -1;
                    class127.field2276 = null;
                    return;
                }
                if (var6.length <= var5) {
                    short[] var13 = new short[var6.length * 2];
                    for (int var14 = 0; var14 < var5; var14++) {
                        var13[var14] = var6[var14];
                    }
                    var6 = var13;
                }
                var6[var5++] = (short) var9;
            }
        }
        class120.field2110 = var5;
        class265[] var10 = new class265[class120.field2110];
        class242.field4219 = 0;
        class127.field2276 = var6;
        for (int var11 = 0; var11 < class120.field2110; var11++) {
            var10[var11] = class145.method1004(var6[var11], 14015).method331(-94);
        }
        class200.method1377(-115, class127.field2276, var10);
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(JB)V")
    public static final void method1048(long arg0, byte arg1) {
        field2845++;
        if (arg0 == 0L || arg1 < 96) {
            return;
        }
        for (int var3 = 0; var3 < class262.field4582; var3++) {
            if (class4.field55[var3] == arg0) {
                class262.field4582--;
                class130.field2342++;
                for (int var4 = var3; var4 < class262.field4582; var4++) {
                    class4.field55[var4] = class4.field55[var4 + 1];
                    class110.field1928[var4] = class110.field1928[var4 + 1];
                }
                class242.field4231 = class135.field2455;
                class55.field1133.method1863(true, 1);
                class55.field1133.method911(0, arg0);
                return;
            }
        }
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field2843[var0] = class167.method1100((byte) -109, var0);
        }
        field2848 = false;
    }
}
