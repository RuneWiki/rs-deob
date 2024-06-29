import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class178 extends class296 {

    @OriginalMember(owner = "client!bc", name = "m", descriptor = "I")
    public static int field2727 = 1;

    @OriginalMember(owner = "client!bc", name = "p", descriptor = "[I")
    public static int[] field2730 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!bc", name = "j", descriptor = "C")
    public static char field2724;

    @OriginalMember(owner = "client!bc", name = "k", descriptor = "I")
    public static int field2725;

    @OriginalMember(owner = "client!bc", name = "l", descriptor = "I")
    public static int field2726;

    @OriginalMember(owner = "client!bc", name = "n", descriptor = "I")
    public static int field2728;

    @OriginalMember(owner = "client!bc", name = "o", descriptor = "Lsb;")
    public static class230 field2729;

    @OriginalMember(owner = "client!bc", name = "i", descriptor = "Lpf;")
    public static class294 field2723;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lvb;Z)I")
    public static final int method1107(class61 arg0, boolean arg1) {
        field2728++;
        class72 var2 = arg0.field959;
        if (var2.field1196 != null) {
            var2 = var2.method487(-1);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field1190;
        class158 var4 = arg0.method928(24840);
        if (arg0.field2303 == var4.field2414) {
            var3 = var2.field1183;
        } else if (arg0.field2303 == var4.field2430 || arg0.field2303 == var4.field2406 || arg0.field2303 == var4.field2397 || arg0.field2303 == var4.field2409) {
            var3 = var2.field1160;
        } else if (arg0.field2303 == var4.field2411 || arg0.field2303 == var4.field2419 || arg0.field2303 == var4.field2415 || arg0.field2303 == var4.field2420) {
            var3 = var2.field1170;
        }
        if (!arg1) {
            field2729 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(B)V")
    public static final void method1108(byte arg0) {
        if (arg0 == 3) {
            class248.field3705 = new class159();
            field2725++;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIIBIII)V")
    public static final void method1109(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        int var8 = 86 / ((arg4 - 15) / 37);
        if (arg7 >= 0 && arg3 >= 0 && arg7 < 103 && arg3 < 103) {
            if (arg6 == 0) {
                class162 var9 = class276.method1834(arg1, arg7, arg3);
                if (var9 != null) {
                    int var10 = (int) (var9.field2496 >>> 32) & Integer.MAX_VALUE;
                    if (arg0 == 2) {
                        var9.field2489 = new class59(var10, 2, arg2 + 4, arg1, arg7, arg3, arg5, false, var9.field2489);
                        var9.field2478 = new class59(var10, 2, arg2 + 1 & 0x3, arg1, arg7, arg3, arg5, false, var9.field2478);
                    } else {
                        var9.field2489 = new class59(var10, arg0, arg2, arg1, arg7, arg3, arg5, false, var9.field2489);
                    }
                }
            }
            if (arg6 == 1) {
                class183 var11 = class230.method1468(arg1, arg7, arg3);
                if (var11 != null) {
                    int var12 = Integer.MAX_VALUE & (int) (var11.field2766 >>> 32);
                    if (arg0 == 4 || arg0 == 5) {
                        var11.field2768 = new class59(var12, 4, arg2, arg1, arg7, arg3, arg5, false, var11.field2768);
                    } else if (arg0 == 6) {
                        var11.field2768 = new class59(var12, 4, arg2 + 4, arg1, arg7, arg3, arg5, false, var11.field2768);
                    } else if (arg0 == 7) {
                        var11.field2768 = new class59(var12, 4, (arg2 + 2 & 0x3) + 4, arg1, arg7, arg3, arg5, false, var11.field2768);
                    } else if (arg0 == 8) {
                        var11.field2768 = new class59(var12, 4, arg2 + 4, arg1, arg7, arg3, arg5, false, var11.field2768);
                        var11.field2774 = new class59(var12, 4, (arg2 + 2 & 0x3) + 4, arg1, arg7, arg3, arg5, false, var11.field2774);
                    }
                }
            }
            if (arg6 == 2) {
                if (arg0 == 11) {
                    arg0 = 10;
                }
                class2 var13 = class97.method627(arg1, arg7, arg3);
                if (var13 != null) {
                    var13.field31 = new class59((int) (var13.field28 >>> 32) & Integer.MAX_VALUE, arg0, arg2, arg1, arg7, arg3, arg5, false, var13.field31);
                }
            }
            if (arg6 == 3) {
                class108 var14 = class256.method1689(arg1, arg7, arg3);
                if (var14 != null) {
                    var14.field1684 = new class59(Integer.MAX_VALUE & (int) (var14.field1687 >>> 32), 22, arg2, arg1, arg7, arg3, arg5, false, var14.field1684);
                }
            }
        }
        field2726++;
    }

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "(B)V")
    public static void method1110(byte arg0) {
        field2729 = null;
        field2730 = null;
        field2723 = null;
        if (arg0 <= 25) {
            field2723 = null;
        }
    }
}
