import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class156 {

    @OriginalMember(owner = "client!db", name = "e", descriptor = "Lli;")
    public static class185 field2942 = class245.method1649("(Udns", 122);

    @OriginalMember(owner = "client!db", name = "n", descriptor = "Lli;")
    public static class185 field2951 = class245.method1649("Vous ne pouvez pas ajouter votre nom -9 votre liste d(Wamis)3", -39);

    @OriginalMember(owner = "client!db", name = "r", descriptor = "Lmd;")
    public static class213 field2955 = null;

    @OriginalMember(owner = "client!db", name = "t", descriptor = "Lli;")
    public static class185 field2957 = class245.method1649(" loggt sich ein)3", 126);

    @OriginalMember(owner = "client!db", name = "u", descriptor = "[Z")
    private static boolean[] field2958 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

    @OriginalMember(owner = "client!db", name = "b", descriptor = "Lli;")
    public static class185 field2939 = class245.method1649("blaugr-Un:", 124);

    @OriginalMember(owner = "client!db", name = "y", descriptor = "Z")
    public static boolean field2962 = true;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "I")
    public int field2938;

    @OriginalMember(owner = "client!db", name = "c", descriptor = "I")
    public static int field2940;

    @OriginalMember(owner = "client!db", name = "d", descriptor = "I")
    public int field2941;

    @OriginalMember(owner = "client!db", name = "f", descriptor = "I")
    public int field2943;

    @OriginalMember(owner = "client!db", name = "g", descriptor = "I")
    public int field2944;

    @OriginalMember(owner = "client!db", name = "h", descriptor = "I")
    public static int field2945;

    @OriginalMember(owner = "client!db", name = "i", descriptor = "I")
    public int field2946;

    @OriginalMember(owner = "client!db", name = "j", descriptor = "I")
    public int field2947;

    @OriginalMember(owner = "client!db", name = "k", descriptor = "I")
    public int field2948;

    @OriginalMember(owner = "client!db", name = "l", descriptor = "I")
    public static int field2949;

    @OriginalMember(owner = "client!db", name = "m", descriptor = "I")
    public int field2950;

    @OriginalMember(owner = "client!db", name = "o", descriptor = "I")
    public int field2952;

    @OriginalMember(owner = "client!db", name = "p", descriptor = "I")
    public static int field2953;

    @OriginalMember(owner = "client!db", name = "q", descriptor = "I")
    public int field2954;

    @OriginalMember(owner = "client!db", name = "s", descriptor = "I")
    public int field2956;

    @OriginalMember(owner = "client!db", name = "v", descriptor = "I")
    public int field2959;

    @OriginalMember(owner = "client!db", name = "w", descriptor = "I")
    public int field2960;

    @OriginalMember(owner = "client!db", name = "x", descriptor = "I")
    public int field2961;

    @OriginalMember(owner = "client!db", name = "z", descriptor = "I")
    public int field2963;

    @OriginalMember(owner = "client!db", name = "A", descriptor = "I")
    public int field2964;

    @OriginalMember(owner = "client!db", name = "C", descriptor = "I")
    public int field2965;

    @OriginalMember(owner = "client!db", name = "D", descriptor = "I")
    public int field2966;

    @OriginalMember(owner = "client!db", name = "E", descriptor = "I")
    public static int field2967;

    @OriginalMember(owner = "client!db", name = "F", descriptor = "I")
    public static int field2968;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V")
    public static final void method1106(int arg0) {
        class113.field2052.method317(21629);
        class241.field4303 = null;
        field2953++;
        if (arg0 <= -44) {
            class32.field527 = 1;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIIIBI)V")
    public static final void method1107(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        int var7 = arg1 + arg6;
        field2967++;
        int var8 = arg0 - arg6;
        int var9 = arg4 - arg6;
        int var10 = arg3 + arg6;
        for (int var11 = arg1; var11 < var7; var11++) {
            class157.method1116(arg2, arg3, arg4, class145.field2757[var11], -81);
        }
        for (int var12 = arg0; var12 > var8; var12--) {
            class157.method1116(arg2, arg3, arg4, class145.field2757[var12], -95);
        }
        if (arg5 > -115) {
            method1110((class82) null, 81, (byte) 79);
        }
        for (int var13 = var7; var13 <= var8; var13++) {
            int[] var14 = class145.field2757[var13];
            class157.method1116(arg2, arg3, var10, var14, -125);
            class157.method1116(arg2, var9, arg4, var14, -32);
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(ZBLli;)V")
    public static final void method1108(boolean arg0, byte arg1, class185 arg2) {
        short[] var3 = new short[16];
        field2949++;
        class185 var4 = arg2.method1325(40);
        int var5 = 0;
        for (int var6 = 0; var6 < class142.field2676; var6++) {
            class134 var9 = class165.method1179(102, var6);
            if ((!arg0 || var9.field2438) && var9.field2442 == -1 && var9.field2466 == -1 && var9.field2458 == 0 && var9.field2436.method1325(40).method1321((byte) 98, var4) != -1) {
                if (var5 >= 250) {
                    class182.field3347 = -1;
                    class60.field1077 = null;
                    return;
                }
                if (var5 >= var3.length) {
                    short[] var10 = new short[var3.length * 2];
                    for (int var11 = 0; var11 < var5; var11++) {
                        var10[var11] = var3[var11];
                    }
                    var3 = var10;
                }
                var3[var5++] = (short) var6;
            }
        }
        if (arg1 < 38) {
            method1111(false);
        }
        class182.field3347 = var5;
        class203.field3716 = 0;
        class60.field1077 = var3;
        class185[] var7 = new class185[class182.field3347];
        for (int var8 = 0; var8 < class182.field3347; var8++) {
            var7[var8] = class165.method1179(102, var3[var8]).field2436;
        }
        class70.method459(-1, var7, class60.field1077);
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIIIII)I")
    public static final int method1109(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2940++;
        int var7 = arg2 & 0x3;
        if ((arg1 & 0x1) == 1) {
            int var8 = arg6;
            arg6 = arg5;
            arg5 = var8;
        }
        if (var7 == 0) {
            return arg0;
        } else if (var7 == 1) {
            return arg4;
        } else {
            if (arg3 != -1) {
                method1109(91, -36, -105, -12, 71, 27, 16);
            }
            return var7 == 2 ? 8 - arg0 - arg6 : -arg4 + 7 + -arg5 + 1;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Lp;IB)I")
    public static final int method1110(class82 arg0, int arg1, byte arg2) {
        field2945++;
        if (arg0.field1561 == null || arg1 >= arg0.field1561.length) {
            return -2;
        }
        try {
            int var3 = 0;
            byte var4 = 0;
            int var5 = 0;
            int[] var6 = arg0.field1561[arg1];
            if (arg2 <= 63) {
                return 95;
            }
            while (true) {
                int var7 = 0;
                int var8 = var6[var5++];
                byte var9 = 0;
                if (var8 == 0) {
                    return var3;
                }
                if (var8 == 15) {
                    var9 = 1;
                }
                if (var8 == 1) {
                    var7 = class132.field2374[var6[var5++]];
                }
                if (var8 == 16) {
                    var9 = 2;
                }
                if (var8 == 17) {
                    var9 = 3;
                }
                if (var8 == 2) {
                    var7 = class228.field4149[var6[var5++]];
                }
                if (var8 == 3) {
                    var7 = class117.field2079[var6[var5++]];
                }
                if (var8 == 4) {
                    int var10 = var6[var5++] << 16;
                    int var11 = var10 + var6[var5++];
                    class82 var12 = class116.method805(1, var11);
                    int var13 = var6[var5++];
                    if (var13 != -1 && (!class165.method1179(102, var13).field2398 || class137.field2565)) {
                        for (int var14 = 0; var14 < var12.field1576.length; var14++) {
                            if (var13 + 1 == var12.field1576[var14]) {
                                var7 += var12.field1548[var14];
                            }
                        }
                    }
                }
                if (var8 == 5) {
                    var7 = class59.field1059[var6[var5++]];
                }
                if (var8 == 6) {
                    var7 = class128.field2295[class228.field4149[var6[var5++]] - 1];
                }
                if (var8 == 7) {
                    var7 = class59.field1059[var6[var5++]] * 100 / 46875;
                }
                if (var8 == 8) {
                    var7 = class241.field4310.field3497;
                }
                if (var8 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (field2958[var15]) {
                            var7 += class228.field4149[var15];
                        }
                    }
                }
                if (var8 == 10) {
                    int var16 = var6[var5++] << 16;
                    int var17 = var16 + var6[var5++];
                    class82 var18 = class116.method805(1, var17);
                    int var19 = var6[var5++];
                    if (var19 != -1 && (!class165.method1179(102, var19).field2398 || class137.field2565)) {
                        for (int var20 = 0; var20 < var18.field1576.length; var20++) {
                            if (var19 + 1 == var18.field1576[var20]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var8 == 11) {
                    var7 = class123.field2221;
                }
                if (var8 == 12) {
                    var7 = class42.field646;
                }
                if (var8 == 13) {
                    int var21 = class59.field1059[var6[var5++]];
                    int var22 = var6[var5++];
                    var7 = (var21 & 0x1 << var22) == 0 ? 0 : 1;
                }
                if (var8 == 14) {
                    int var23 = var6[var5++];
                    var7 = class132.method939(0, var23);
                }
                if (var8 == 18) {
                    var7 = (class241.field4310.field2694 >> 7) + class77.field1339;
                }
                if (var8 == 19) {
                    var7 = (class241.field4310.field2687 >> 7) + class107.field1933;
                }
                if (var8 == 20) {
                    var7 = var6[var5++];
                }
                if (var9 == 0) {
                    if (var4 == 0) {
                        var3 += var7;
                    }
                    if (var4 == 1) {
                        var3 -= var7;
                    }
                    if (var4 == 2 && var7 != 0) {
                        var3 /= var7;
                    }
                    if (var4 == 3) {
                        var3 *= var7;
                    }
                    var4 = 0;
                } else {
                    var4 = var9;
                }
            }
        } catch (Exception var24) {
            return -1;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Z)V")
    public static void method1111(boolean arg0) {
        field2942 = null;
        field2955 = null;
        field2951 = null;
        field2957 = null;
        field2939 = null;
        if (!arg0) {
            method1106(11);
        }
        field2958 = null;
    }
}
