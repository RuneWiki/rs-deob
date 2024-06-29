import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class141 implements Runnable {

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "Z")
    public boolean field3263 = true;

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "Ljava/lang/Object;")
    public Object field3267 = new Object();

    @OriginalMember(owner = "client!uc", name = "w", descriptor = "[I")
    public int[] field3285 = new int[500];

    @OriginalMember(owner = "client!uc", name = "u", descriptor = "I")
    public int field3283 = 0;

    @OriginalMember(owner = "client!uc", name = "B", descriptor = "[I")
    public int[] field3290 = new int[500];

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "Ltd;")
    public static class136 field3266 = class145.method1172("Konfig geladen)3", 45);

    @OriginalMember(owner = "client!uc", name = "j", descriptor = "I")
    public static int field3272 = -2;

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "I")
    public static int field3269 = 0;

    @OriginalMember(owner = "client!uc", name = "i", descriptor = "Ltd;")
    public static class136 field3271 = class145.method1172(":", 45);

    @OriginalMember(owner = "client!uc", name = "h", descriptor = "Ltd;")
    public static class136 field3270 = class145.method1172(" )2> <col=00ffff>", 45);

    @OriginalMember(owner = "client!uc", name = "v", descriptor = "Ltd;")
    private static class136 field3284 = class145.method1172("Please try again)3", 45);

    @OriginalMember(owner = "client!uc", name = "o", descriptor = "Ltd;")
    public static class136 field3277 = class145.method1172(" )2> <col=ffff00>", 45);

    @OriginalMember(owner = "client!uc", name = "y", descriptor = "[I")
    public static int[] field3287 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!uc", name = "k", descriptor = "Ltd;")
    public static class136 field3273 = field3284;

    @OriginalMember(owner = "client!uc", name = "r", descriptor = "Ltd;")
    public static class136 field3280 = class145.method1172("<col=ffffff>", 45);

    @OriginalMember(owner = "client!uc", name = "C", descriptor = "Ltd;")
    public static class136 field3291 = class145.method1172(" )2> ", 45);

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "I")
    public static int field3265;

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "I")
    public static int field3268;

    @OriginalMember(owner = "client!uc", name = "l", descriptor = "I")
    public static int field3274;

    @OriginalMember(owner = "client!uc", name = "m", descriptor = "I")
    public static int field3275;

    @OriginalMember(owner = "client!uc", name = "p", descriptor = "I")
    public static int field3278;

    @OriginalMember(owner = "client!uc", name = "t", descriptor = "I")
    public static int field3282;

    @OriginalMember(owner = "client!uc", name = "x", descriptor = "I")
    public static int field3286;

    @OriginalMember(owner = "client!uc", name = "z", descriptor = "I")
    public static int field3288;

    @OriginalMember(owner = "client!uc", name = "A", descriptor = "I")
    public static int field3289;

    @OriginalMember(owner = "client!uc", name = "s", descriptor = "Lpd;")
    public static class108 field3281;

    @OriginalMember(owner = "client!uc", name = "n", descriptor = "Lke;")
    public static class74 field3276;

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field3264;

    @OriginalMember(owner = "client!uc", name = "q", descriptor = "[Lab;")
    public static class3[] field3279;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IILtd;ZI)V")
    public static final void method1143(int arg0, int arg1, class136 arg2, boolean arg3, int arg4) {
        field3286++;
        class74 var5 = class125.method965(arg1, (byte) 80, arg4);
        if (var5 == null) {
            return;
        }
        if (var5.field1559 != null) {
            class139 var6 = new class139();
            var6.field3238 = arg0;
            var6.field3247 = arg2;
            var6.field3244 = var5.field1559;
            var6.field3222 = var5;
            class96.method734(-9063, var6);
        }
        boolean var7 = arg3;
        if (var5.field1630 > 0) {
            var7 = class5.method33(38, var5);
        }
        if (!var7 || !class93.method694(arg0 - 1, class56.method444(var5, 0), 20625)) {
            return;
        }
        if (arg0 == 1) {
            class121.field2775++;
            class15.field304.method867(213, true);
            class15.field304.method989(arg1, (byte) 79);
            class15.field304.method997(arg4, true);
        }
        if (arg0 == 2) {
            class118.field2696++;
            class15.field304.method867(219, true);
            class15.field304.method989(arg1, (byte) 47);
            class15.field304.method997(arg4, arg3);
        }
        if (arg0 == 3) {
            class35.field815++;
            class15.field304.method867(33, true);
            class15.field304.method989(arg1, (byte) 60);
            class15.field304.method997(arg4, true);
        }
        if (arg0 == 4) {
            class12.field211++;
            class15.field304.method867(25, true);
            class15.field304.method989(arg1, (byte) 117);
            class15.field304.method997(arg4, true);
        }
        if (arg0 == 5) {
            class2.field23++;
            class15.field304.method867(180, true);
            class15.field304.method989(arg1, (byte) 118);
            class15.field304.method997(arg4, true);
        }
        if (arg0 == 6) {
            class15.field304.method867(205, true);
            class146.field3373++;
            class15.field304.method989(arg1, (byte) 56);
            class15.field304.method997(arg4, arg3);
        }
        if (arg0 == 7) {
            class15.field304.method867(57, arg3);
            class15.field304.method989(arg1, (byte) 113);
            class15.field304.method997(arg4, arg3);
            class101.field2427++;
        }
        if (arg0 == 8) {
            class135.field3160++;
            class15.field304.method867(245, arg3);
            class15.field304.method989(arg1, (byte) 125);
            class15.field304.method997(arg4, true);
        }
        if (arg0 == 9) {
            class21.field425++;
            class15.field304.method867(241, true);
            class15.field304.method989(arg1, (byte) 74);
            class15.field304.method997(arg4, true);
        }
        if (arg0 == 10) {
            class13.field241++;
            class15.field304.method867(232, arg3);
            class15.field304.method989(arg1, (byte) 76);
            class15.field304.method997(arg4, arg3);
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZB)V")
    public static final void method1144(boolean arg0, byte arg1) {
        if (class24.field555.field3580 >> 7 == class18.field369 && class24.field555.field3578 >> 7 == class108.field2554) {
            class18.field369 = 0;
        }
        field3268++;
        int var2 = class55.field1255;
        int var3 = 21 % ((arg1 - 72) / 40);
        if (arg0) {
            var2 = 1;
        }
        for (int var4 = 0; var4 < var2; var4++) {
            int var5;
            class13 var6;
            if (arg0) {
                var6 = class24.field555;
                var5 = 33538048;
            } else {
                var5 = class24.field564[var4] << 14;
                var6 = class154.field3518[class24.field564[var4]];
            }
            if (var6 != null && var6.method91(84)) {
                var6.field240 = false;
                int var7 = var6.field3580 >> 7;
                if ((class65.field1399 && class55.field1255 > 50 || class55.field1255 > 200) && !arg0 && var6.field3594 == var6.field3556) {
                    var6.field240 = true;
                }
                int var8 = var6.field3578 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var6.field254 == null || class44.field1013 < var6.field260 || class44.field1013 >= var6.field246) {
                        if ((var6.field3580 & 0x7F) == 64 && (var6.field3578 & 0x7F) == 64) {
                            if (class73.field1534[var7][var8] == class136.field3190) {
                                continue;
                            }
                            class73.field1534[var7][var8] = class136.field3190;
                        }
                        var6.field248 = class65.method486(class62.field1331, (byte) -42, var6.field3578, var6.field3580);
                        class146.field3366.method743(class62.field1331, var6.field3580, var6.field3578, var6.field248, 60, var6, var6.field3610, var5, var6.field3584);
                    } else {
                        var6.field240 = false;
                        var6.field248 = class65.method486(class62.field1331, (byte) -42, var6.field3578, var6.field3580);
                        class146.field3366.method740(class62.field1331, var6.field3580, var6.field3578, var6.field248, 60, var6, var6.field3610, var5, var6.field233, var6.field245, var6.field265, var6.field236);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!uc", name = "run", descriptor = "()V")
    public final void run() {
        field3282++;
        while (this.field3263) {
            Object var1 = this.field3267;
            synchronized (this.field3267) {
                if (this.field3283 < 500) {
                    this.field3285[this.field3283] = class18.field360;
                    this.field3290[this.field3283] = class142.field3292;
                    this.field3283++;
                }
            }
            class9.method42(0, 50L);
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Z)V")
    public static void method1145(boolean arg0) {
        field3273 = null;
        field3280 = null;
        field3276 = null;
        field3270 = null;
        if (arg0) {
            field3281 = null;
        }
        field3291 = null;
        field3271 = null;
        field3281 = null;
        field3279 = null;
        field3287 = null;
        field3277 = null;
        field3284 = null;
        field3266 = null;
        field3264 = null;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lsb;II)Ltd;")
    public static final class136 method1146(class127 arg0, int arg1, int arg2) {
        field3288++;
        try {
            class136 var3 = new class136();
            var3.field3183 = arg0.method1027(false);
            if (var3.field3183 > arg2) {
                var3.field3183 = arg2;
            }
            var3.field3182 = new byte[var3.field3183];
            if (arg1 == 7) {
                arg0.field2995 += class41.field946.method316(0, -12022, arg0.field2995, var3.field3182, var3.field3183, arg0.field2960);
                return var3;
            } else {
                return null;
            }
        } catch (Exception var4) {
            return class2.field43;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IBLke;)I")
    public static final int method1147(int arg0, byte arg1, class74 arg2) {
        field3274++;
        if (arg2.field1547 == null || arg2.field1547.length <= arg0) {
            return -2;
        }
        try {
            int[] var3 = arg2.field1547[arg0];
            int var4 = 97 / ((-arg1 - 44) / 63);
            int var5 = 0;
            byte var6 = 0;
            int var7 = 0;
            while (true) {
                int var8 = var3[var5++];
                int var9 = 0;
                byte var10 = 0;
                if (var8 == 0) {
                    return var7;
                }
                if (var8 == 15) {
                    var10 = 1;
                }
                if (var8 == 1) {
                    var9 = class19.field393[var3[var5++]];
                }
                if (var8 == 2) {
                    var9 = class143.field3321[var3[var5++]];
                }
                if (var8 == 3) {
                    var9 = class73.field1520[var3[var5++]];
                }
                if (var8 == 4) {
                    int var11 = var3[var5++] << 16;
                    int var12 = var11 + var3[var5++];
                    class74 var13 = class12.method82(var12, (byte) 108);
                    int var14 = var3[var5++];
                    if (var14 != -1 && (!class63.method472(var14, (byte) 119).field2780 || class146.field3378)) {
                        for (int var15 = 0; var15 < var13.field1552.length; var15++) {
                            if (var14 + 1 == var13.field1552[var15]) {
                                var9 += var13.field1595[var15];
                            }
                        }
                    }
                }
                if (var8 == 16) {
                    var10 = 2;
                }
                if (var8 == 5) {
                    var9 = class18.field371[var3[var5++]];
                }
                if (var8 == 17) {
                    var10 = 3;
                }
                if (var8 == 6) {
                    var9 = class71.field1503[class143.field3321[var3[var5++]] - 1];
                }
                if (var8 == 7) {
                    var9 = class18.field371[var3[var5++]] * 100 / 46875;
                }
                if (var8 == 8) {
                    var9 = class24.field555.field255;
                }
                if (var8 == 9) {
                    for (int var16 = 0; var16 < 25; var16++) {
                        if (class61.field1292[var16]) {
                            var9 += class143.field3321[var16];
                        }
                    }
                }
                if (var8 == 10) {
                    int var17 = var3[var5++] << 16;
                    int var18 = var17 + var3[var5++];
                    class74 var19 = class12.method82(var18, (byte) 108);
                    int var20 = var3[var5++];
                    if (var20 != -1 && (!class63.method472(var20, (byte) 122).field2780 || class146.field3378)) {
                        for (int var21 = 0; var21 < var19.field1552.length; var21++) {
                            if (var20 + 1 == var19.field1552[var21]) {
                                var9 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var8 == 11) {
                    var9 = class80.field1840;
                }
                if (var8 == 12) {
                    var9 = class71.field1494;
                }
                if (var8 == 13) {
                    int var22 = class18.field371[var3[var5++]];
                    int var23 = var3[var5++];
                    var9 = (0x1 << var23 & var22) == 0 ? 0 : 1;
                }
                if (var8 == 14) {
                    int var24 = var3[var5++];
                    var9 = class47.method404(2, var24);
                }
                if (var8 == 18) {
                    var9 = (class24.field555.field3580 >> 7) + class91.field2145;
                }
                if (var8 == 19) {
                    var9 = (class24.field555.field3578 >> 7) + class52.field1176;
                }
                if (var8 == 20) {
                    var9 = var3[var5++];
                }
                if (var10 == 0) {
                    if (var6 == 0) {
                        var7 += var9;
                    }
                    if (var6 == 1) {
                        var7 -= var9;
                    }
                    if (var6 == 2 && var9 != 0) {
                        var7 /= var9;
                    }
                    if (var6 == 3) {
                        var7 *= var9;
                    }
                    var6 = 0;
                } else {
                    var6 = var10;
                }
            }
        } catch (Exception var25) {
            return -1;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Ltd;Lmd;ZILtd;I)V")
    public static final void method1148(class136 arg0, class87 arg1, boolean arg2, int arg3, class136 arg4, int arg5) {
        int var6 = arg1.method645(arg0, true);
        field3265++;
        if (arg3 != 0) {
            method1144(true, (byte) 24);
        }
        int var7 = arg1.method656(var6, arg4, arg3 - 105);
        class120.method937(var6, arg2, arg5, arg1, var7, arg3 ^ 0x1);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZZZ)I")
    public static final int method1149(boolean arg0, boolean arg1, boolean arg2) {
        if (!arg0) {
            method1151(true, (byte) -88, 81, 67);
        }
        field3278++;
        int var3 = 0;
        if (arg1) {
            var3 += class80.field1828 + class63.field1334;
        }
        if (arg2) {
            var3 += class77.field1769 + class149.field3429;
        }
        return var3;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(II)Z")
    public static final boolean method1150(int arg0, int arg1) {
        if (arg1 != -21224) {
            field3280 = null;
        }
        field3275++;
        if (arg0 < 0) {
            return false;
        }
        int var2 = class27.field600[arg0];
        if (var2 >= 2000) {
            var2 -= 2000;
        }
        return var2 == 1003;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZBII)V")
    public static final void method1151(boolean arg0, byte arg1, int arg2, int arg3) {
        field3289++;
        if (arg2 < 8000 || arg2 > 48000) {
            throw new IllegalArgumentException();
        } else if (arg1 >= 79) {
            class5.field89 = arg2;
            class155.field3603 = arg3;
            class19.field387 = arg0;
        }
    }
}
