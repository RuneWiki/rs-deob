import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public class class620 {

    @OriginalMember(owner = "client!uo", name = "g", descriptor = "Ldp;")
    public class444 field8978 = new class444();

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "Lpb;")
    public static class2 field8973 = new class2(6, 4);

    @OriginalMember(owner = "client!uo", name = "j", descriptor = "[I")
    public static int[] field8981 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!uo", name = "k", descriptor = "I")
    public static int field8982 = 1405;

    @OriginalMember(owner = "client!uo", name = "i", descriptor = "F")
    public static float field8980;

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "I")
    public static int field8972;

    @OriginalMember(owner = "client!uo", name = "c", descriptor = "I")
    public static int field8974;

    @OriginalMember(owner = "client!uo", name = "d", descriptor = "I")
    public static int field8975;

    @OriginalMember(owner = "client!uo", name = "e", descriptor = "I")
    public static int field8976;

    @OriginalMember(owner = "client!uo", name = "f", descriptor = "I")
    public static int field8977;

    @OriginalMember(owner = "client!uo", name = "h", descriptor = "I")
    public static int field8979;

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIIIIII)V", line = 3)
    public static final void method3566(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field8974++;
        class699 var7 = (class699) class597.field8638.method2370(arg4 ^ 0xFFFF99C2);
        if (arg4 != 1) {
            method3567(null, -8, null, (byte) 23);
        }
        while (var7 != null) {
            if (var7.field9833 <= class45.field685) {
                var7.method300((byte) 61);
            } else {
                class375.method2325(arg3 >> 1, arg0, (var7.field9830 << 9) + 256, var7.field9835, (var7.field9832 << 9) + 256, arg6 >> 1, var7.field9831 * 2, arg1, 117);
                class395.field5976.method2448((byte) 120, var7.field9838 | 0xFF000000, 0, var7.field9839, arg5 + class194.field2602[1], class194.field2602[0] + arg2);
            }
            var7 = (class699) class597.field8638.method2369((byte) 126);
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lcaa;ILhq;B)V", line = 31)
    public static final void method3567(class538 arg0, int arg1, class47 arg2, byte arg3) {
        field8977++;
        if (class380.field5732 >= 50 || arg2 == null || arg2.field721 == null || arg2.field721.length <= arg1 || arg2.field721[arg1] == null) {
            return;
        }
        int var4 = arg2.field721[arg1][0];
        if (arg3 >= -8) {
            method3567(null, -60, null, (byte) 114);
        }
        int var5 = var4 >> 8;
        int var6 = (var4 & 0xF7) >> 5;
        int var7 = var4 & 0x1F;
        if (arg2.field721[arg1].length > 1) {
            int var8 = (int) (Math.random() * (double) arg2.field721[arg1].length);
            if (var8 > 0) {
                var5 = arg2.field721[arg1][var8];
            }
        }
        int var9 = 256;
        if (arg2.field736 != null && arg2.field737 != null) {
            var9 = (int) (Math.random() * (double) (arg2.field737[arg1] - arg2.field736[arg1])) + arg2.field736[arg1];
        }
        int var10 = arg2.field724 == null ? 255 : arg2.field724[arg1];
        if (var7 == 0) {
            if (class321.field4681 == arg0) {
                if (arg2.field747) {
                    class176.method1201(false, var6, -122, 0, var9, var5, var10);
                    return;
                }
                class612.method3486(var10, var5, var9, (byte) -100, 0, var6);
            }
        } else if (class335.field4872.field9507 != 0) {
            int var11 = arg0.field7895 - 256 >> 9;
            int var12 = arg0.field7896 - 256 >> 9;
            int var13 = class321.field4681 == arg0 ? 0 : (arg0.field7905 << 24) + (var12 << 8) + (var11 << 16) + var7;
            class141.field2038[class380.field5732++] = new class268((byte) (arg2.field747 ? 2 : 1), var5, var6, 0, var10, var13, var9, arg0);
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(II)I", line = 102)
    public static final int method3568(int arg0, int arg1) {
        return class319.field4644 == null ? 0 : class319.field4644[arg0][arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(B)V", line = 107)
    public static void method3569(byte arg0) {
        if (arg0 != 94) {
            method3571(-88, null);
        }
        field8973 = null;
        field8981 = null;
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(III)Z", line = 121)
    public static final boolean method3570(int arg0, int arg1, int arg2) {
        field8976++;
        if (arg0 != -1) {
            field8973 = null;
        }
        return (arg1 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(I[B)V", line = 132)
    public static final void method3571(int arg0, byte[] arg1) {
        field8975++;
        class540 var2 = new class540(arg1);
        while (true) {
            while (true) {
                int var3 = var2.method3115(29871);
                if (var3 == 0) {
                    if (arg0 != -15888) {
                        method3566(-116, 4, -44, -112, 21, -3, -100);
                        return;
                    }
                    return;
                }
                if (var3 == 1) {
                    int[] var4 = class9.field265 = new int[6];
                    var4[0] = var2.method3169(26488);
                    var4[1] = var2.method3169(class145.method1006(arg0, -22904));
                    var4[2] = var2.method3169(class145.method1006(arg0, -22904));
                    var4[3] = var2.method3169(26488);
                    var4[4] = var2.method3169(26488);
                    var4[5] = var2.method3169(26488);
                } else if (var3 == 4) {
                    int var7 = var2.method3115(29871);
                    class638.field9173 = new int[var7];
                    for (int var8 = 0; var8 < var7; var8++) {
                        class638.field9173[var8] = var2.method3169(26488);
                        if (class638.field9173[var8] == 65535) {
                            class638.field9173[var8] = -1;
                        }
                    }
                } else if (var3 == 5) {
                    int var5 = var2.method3115(29871);
                    class24.field448 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        class24.field448[var6] = var2.method3169(26488);
                        if (class24.field448[var6] == 65535) {
                            class24.field448[var6] = -1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(BLjava/lang/String;)V", line = 215)
    public static final void method3572(byte arg0, String arg1) {
        field8972++;
        if (arg1 == null) {
            return;
        }
        if (!(class356.field5266 < 200 || class221.field2937) || class356.field5266 >= 200) {
            class36.method213(0, 4, class279.field3635.method1654(-50, class262.field3401));
            String var2 = class279.field3636.method1654(125, class262.field3401);
            if (var2 != null) {
                class36.method213(0, 4, var2);
            }
            return;
        }
        String var3 = class247.method1506(arg1, false);
        if (var3 == null || arg0 >= -72) {
            return;
        }
        for (int var4 = 0; var4 < class356.field5266; var4++) {
            String var9 = class247.method1506(class205.field2796[var4], false);
            if (var9 != null && var9.equals(var3)) {
                class36.method213(0, 4, arg1 + class279.field3663.method1654(-62, class262.field3401));
                return;
            }
            if (class645.field9294[var4] != null) {
                String var10 = class247.method1506(class645.field9294[var4], false);
                if (var10 != null && var10.equals(var3)) {
                    class36.method213(0, 4, arg1 + class279.field3663.method1654(-121, class262.field3401));
                    return;
                }
            }
        }
        for (int var5 = 0; var5 < class564.field8248; var5++) {
            String var7 = class247.method1506(class115.field1722[var5], false);
            if (var7 != null && var7.equals(var3)) {
                class36.method213(0, 4, class279.field3668.method1654(-116, class262.field3401) + arg1 + class279.field3669.method1654(110, class262.field3401));
                return;
            }
            if (class203.field2774[var5] != null) {
                String var8 = class247.method1506(class203.field2774[var5], false);
                if (var8 != null && var8.equals(var3)) {
                    class36.method213(0, 4, class279.field3668.method1654(-103, class262.field3401) + arg1 + class279.field3669.method1654(-74, class262.field3401));
                    return;
                }
            }
        }
        if (class247.method1506(class321.field4681.field1094, false).equals(var3)) {
            class36.method213(0, 4, class279.field3666.method1654(-85, class262.field3401));
            return;
        }
        class132.field1918++;
        class654 var6 = class631.method3628(class519.field7279, (byte) -51, class357.field5280);
        var6.field9358.method3110(class420.method2543(1, arg1), 106);
        var6.field9358.method3132(arg1, 3);
        class444.method2623(125, var6);
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(II[FIIII)V", line = 317)
    public static final void method3573(int arg0, int arg1, float[] arg2, int arg3, int arg4, int arg5, int arg6) {
        field8979++;
        if (arg6 > 0 && !class346.method2145(-1, arg6)) {
            throw new IllegalArgumentException("");
        } else if (arg4 <= 0 || class346.method2145(-1, arg4)) {
            int var7 = class604.method3446((byte) -48, arg0);
            int var8 = 0;
            int var9 = arg4 > arg6 ? arg6 : arg4;
            if (arg3 != -11044) {
                method3570(-91, -3, 2);
            }
            int var10 = arg6 >> 1;
            int var11 = arg4 >> 1;
            float[] var12 = arg2;
            float[] var13 = new float[var10 * var11 * var7];
            while (true) {
                OpenGL.glTexImage2Df(arg1, var8, arg5, arg6, arg4, 0, arg0, 5126, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var14 = arg6 * var7;
                for (int var15 = 0; var15 < var7; var15++) {
                    int var17 = var15;
                    int var18 = var15;
                    int var19 = var14 + var15;
                    for (int var20 = 0; var20 < var11; var20++) {
                        for (int var21 = 0; var21 < var10; var21++) {
                            float var22 = var12[var18];
                            int var23 = var7 + var18;
                            float var24 = var12[var23] + var22;
                            float var25 = var12[var19] + var24;
                            var18 = var7 + var23;
                            int var26 = var7 + var19;
                            float var27 = var12[var26] + var25;
                            var13[var17] = var27 * 0.25F;
                            var19 = var7 + var26;
                            var17 += var7;
                        }
                        var19 += var14;
                        var18 += var14;
                    }
                }
                float[] var16 = var13;
                var13 = var12;
                var12 = var16;
                arg6 = var10;
                arg4 = var11;
                var10 >>= 0x1;
                var8++;
                var11 >>= 0x1;
                var9 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }
}
