import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class614 {

    @OriginalMember(owner = "client!rl", name = "g", descriptor = "Lsw;")
    private class641 field8896 = new class641(64);

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "Ldn;")
    private class438 field8892;

    @OriginalMember(owner = "client!rl", name = "e", descriptor = "I")
    public int field8894;

    @OriginalMember(owner = "client!rl", name = "h", descriptor = "Z")
    public static boolean field8897 = false;

    @OriginalMember(owner = "client!rl", name = "i", descriptor = "Ljava/util/Random;")
    public static Random field8898 = new Random();

    @OriginalMember(owner = "client!rl", name = "q", descriptor = "Lvj;")
    public static class373 field8906 = new class373(6, -2);

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "F")
    public static float field8890;

    @OriginalMember(owner = "client!rl", name = "o", descriptor = "F")
    public static float field8904;

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "I")
    public static int field8891;

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "I")
    public static int field8893;

    @OriginalMember(owner = "client!rl", name = "f", descriptor = "I")
    public static int field8895;

    @OriginalMember(owner = "client!rl", name = "j", descriptor = "I")
    public static int field8899;

    @OriginalMember(owner = "client!rl", name = "k", descriptor = "I")
    public static int field8900;

    @OriginalMember(owner = "client!rl", name = "l", descriptor = "I")
    public static int field8901;

    @OriginalMember(owner = "client!rl", name = "m", descriptor = "I")
    public static int field8902;

    @OriginalMember(owner = "client!rl", name = "n", descriptor = "I")
    public static int field8903;

    @OriginalMember(owner = "client!rl", name = "p", descriptor = "I")
    public static int field8905;

    // $FF: synthetic field
    @OriginalMember(owner = "client!rl", name = "r", descriptor = "Ljava/lang/Class;")
    public static Class field8907;

    // $FF: synthetic method
    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method3533(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(B)V", line = 9)
    public static void method3524(byte arg0) {
        if (arg0 < 29) {
            method3528((byte) -44);
        }
        field8906 = null;
        field8898 = null;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(I)V", line = 20)
    public static final void method3525(int arg0) {
        field8900++;
        int var1 = class5.field44.length;
        int var2 = 0;
        if (arg0 != 4) {
            method3530(null, (byte) -119);
        }
        while (var2 < var1) {
            if (class5.field44[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class228.field2797; var4++) {
                    if (class633.field9116[var2] == class597.field8643[var4]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class597.field8643[class228.field2797] = class633.field9116[var2];
                    var3 = class228.field2797++;
                }
                class374 var5 = new class374(class5.field44[var2]);
                int var6 = 0;
                while (var5.field4966 < class5.field44[var2].length && var6 < 511 && class474.field6637 < 1023) {
                    int var7 = var6++ << 6 | var3;
                    int var8 = var5.method2136(false);
                    int var9 = var8 >> 14;
                    int var10 = var8 >> 7 & 0x3F;
                    int var11 = var8 & 0x3F;
                    int var12 = (class633.field9116[var2] >> 8) * 64 - (class632.field9113 - var10);
                    int var13 = (class633.field9116[var2] & 0xFF) * 64 + var11 - class119.field1504;
                    class74 var14 = class518.field7296.method150(true, var5.method2136(false));
                    class415 var15 = (class415) class309.field3938.method2645((long) var7, (byte) -119);
                    if (var15 == null && (var14.field807 & 0x1) > 0 && class13.field104 == var9 && var12 >= 0 && class106.field1289 > (var14.field844 + var12) && var13 >= 0 && class422.field5452 > (var14.field844 + var13)) {
                        class459 var16 = new class459();
                        var16.field6399 = var7;
                        class415 var17 = new class415(var16);
                        class309.field3938.method2640(1, (long) var7, var17);
                        class393.field5189[class98.field1215++] = var17;
                        class194.field2345[class474.field6637++] = var7;
                        var16.field6417 = class335.field4358;
                        var16.method2674(var14, 0);
                        var16.method2696(true, var16.field6334.field844);
                        var16.field6461 = var16.field6334.field813 << 3;
                        var16.method2706(true, arg0 ^ 0x6C, var16.field6334.field847 + 4 << 11 & 0x38CA);
                        var16.method2680(true, var16.method2694(28146), var12, (byte) -116, var9, var13);
                    }
                }
            }
            var2++;
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(BI)V", line = 119)
    public final void method3526(byte arg0, int arg1) {
        if (arg0 != -78) {
            return;
        }
        field8902++;
        class641 var3 = this.field8896;
        synchronized (this.field8896) {
            this.field8896.method3686((byte) 53, arg1);
        }
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(BI)Lqv;", line = 134)
    public final class377 method3527(byte arg0, int arg1) {
        field8899++;
        class641 var3 = this.field8896;
        class377 var4;
        synchronized (this.field8896) {
            var4 = (class377) this.field8896.method3682(0, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        int var5 = -72 % ((arg0 + 40) / 53);
        class438 var6 = this.field8892;
        byte[] var7;
        synchronized (this.field8892) {
            var7 = this.field8892.method2558(100, arg1, 16);
        }
        class377 var8 = new class377();
        if (var7 != null) {
            var8.method2194((byte) -30, new class374(var7));
        }
        class641 var9 = this.field8896;
        synchronized (this.field8896) {
            this.field8896.method3684(var8, 0, (long) arg1);
            return var8;
        }
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(B)V", line = 171)
    public static final void method3528(byte arg0) {
        for (class434 var1 = (class434) class276.field3637.method1050((byte) 73); var1 != null; var1 = (class434) class276.field3637.method1047(-7962)) {
            if (class383.field5070 == null) {
                var1.method3187(true);
            } else if (var1.field5892 <= class335.field4358) {
                int var2 = class605.field8736[var1.field5895];
                if (var2 == 0) {
                    class241 var3 = class19.method124(var1.field5898, var1.field5899, var1.field5889);
                    if (var3 instanceof class58) {
                        class129.method734(var1.field5898, var1.field5899, var1.field5889);
                        class58 var4 = (class58) var3;
                        if (var4.field549 != null) {
                            class367.method2058(var1.field5898, var1.field5899, var1.field5889, var4.field549, null);
                        }
                    }
                } else if (var2 == 1) {
                    class56 var5 = class31.method181(var1.field5898, var1.field5899, var1.field5889);
                    if (var5 instanceof class574) {
                        class314.method1743(var1.field5898, var1.field5899, var1.field5889);
                        class574 var6 = (class574) var5;
                        if (var6.field8385 != null) {
                            class96.method595(var1.field5898, var1.field5899, var1.field5889, var6.field8385, null);
                        }
                    }
                } else if (var2 == 2) {
                    class598 var9 = class198.method1072(var1.field5898, var1.field5899, var1.field5889, field8907 == null ? (field8907 = method3533("fp")) : field8907);
                    if (var9 instanceof class79) {
                        class507.method2914(var1.field5898, var1.field5899, var1.field5889, field8907 == null ? (field8907 = method3533("fp")) : field8907);
                        class79 var10 = (class79) var9;
                        if (var10.field921 != null) {
                            class380.method2203(var10.field921, false);
                        }
                    }
                } else if (var2 == 3) {
                    class31 var7 = class543.method3171(var1.field5898, var1.field5899, var1.field5889);
                    if (var7 instanceof class550) {
                        class29.method161(var1.field5898, var1.field5899, var1.field5889);
                        class550 var8 = (class550) var7;
                        if (var8.field8079 != null) {
                            class385.method2222(var1.field5898, var1.field5899, var1.field5889, var8.field8079);
                        }
                    }
                }
                var1.method3187(true);
            } else if (class335.field4358 == var1.field5887) {
                int var11 = class605.field8736[var1.field5895];
                if (var11 == 0) {
                    class241 var12 = class19.method124(var1.field5898, var1.field5899, var1.field5889);
                    if (var12 instanceof class58) {
                        var1.method3187(true);
                    } else if (class136.method760(var1.field5898, var1.field5899, var1.field5889) == null) {
                        class58 var13 = new class58(var1.field5895, var1.field5882, var1.field5888, var1.field5886, var1.field5880, var12);
                        class367.method2058(var1.field5898, var1.field5899, var1.field5889, var13, null);
                    } else {
                        var1.method3187(true);
                    }
                } else if (var11 == 1) {
                    class56 var14 = class31.method181(var1.field5898, var1.field5899, var1.field5889);
                    if (var14 instanceof class574) {
                        var1.method3187(true);
                    } else if (class284.method1604(var1.field5898, var1.field5899, var1.field5889) == null) {
                        class574 var15 = new class574(var1.field5895, var1.field5882, var1.field5888, var1.field5886, var1.field5880, var14);
                        class96.method595(var1.field5898, var1.field5899, var1.field5889, var15, null);
                    } else {
                        var1.method3187(true);
                    }
                } else if (var11 == 2) {
                    class598 var16 = class198.method1072(var1.field5898, var1.field5899, var1.field5889, field8907 == null ? (field8907 = method3533("fp")) : field8907);
                    if (var16 instanceof class79) {
                        var1.method3187(true);
                    } else {
                        class507.method2914(var1.field5898, var1.field5899, var1.field5889, field8907 == null ? (field8907 = method3533("fp")) : field8907);
                        class437 var17 = class16.field126.method1759(false, var1.field5879);
                        int var18;
                        int var19;
                        if (var1.field5882 == 1 || var1.field5882 == 3) {
                            var19 = var17.field5982;
                            var18 = var17.field5945;
                        } else {
                            var18 = var17.field5982;
                            var19 = var17.field5945;
                        }
                        class79 var20 = new class79(var1.field5895, var1.field5882, var1.field5898, var1.field5888, var1.field5886, var1.field5880, var1.field5899, var1.field5899 - (1 - var18), var1.field5889, var1.field5889 + var19 - 1, var16);
                        class380.method2203(var20, false);
                    }
                } else if (var11 == 3) {
                    class31 var21 = class543.method3171(var1.field5898, var1.field5899, var1.field5889);
                    if (var21 instanceof class550) {
                        var1.method3187(true);
                    } else {
                        class550 var22 = new class550(var1.field5888, var1.field5886, var1.field5880, var21);
                        class385.method2222(var1.field5898, var1.field5899, var1.field5889, var22);
                    }
                }
            }
        }
        field8901++;
        if (arg0 > -10) {
            field8898 = null;
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Z)V", line = 379)
    public final void method3529(boolean arg0) {
        class641 var2 = this.field8896;
        synchronized (this.field8896) {
            this.field8896.method3687(1402);
        }
        if (arg0) {
            this.method3529(false);
        }
        field8903++;
    }

    @OriginalMember(owner = "client!rl", name = "<init>", descriptor = "(Lre;ILdn;)V", line = 397)
    public class614(class515 arg0, int arg1, class438 arg2) {
        this.field8892 = arg2;
        if (this.field8892 == null) {
            this.field8894 = 0;
        } else {
            this.field8894 = this.field8892.method2554(16, 125);
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lqa;B)V", line = 415)
    public static final void method3530(class206 arg0, byte arg1) {
        field8905++;
        if (class590.field8552) {
            class228.method1299(4479, arg0);
        } else {
            class483.method2802(16, arg0);
        }
        if (arg1 > -38) {
            method3532(-85, null, true, -11, -34, true, -11);
        }
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(Z)V", line = 430)
    public final void method3531(boolean arg0) {
        class641 var2 = this.field8896;
        synchronized (this.field8896) {
            this.field8896.method3694(0);
        }
        if (arg0) {
            field8895 = -117;
        }
        field8893++;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(ILlk;ZIIZI)V", line = 444)
    public static final void method3532(int arg0, class502 arg1, boolean arg2, int arg3, int arg4, boolean arg5, int arg6) {
        field8891++;
        if (class570.field8370 >= 50 || arg1 == null || arg1.field6955 == null || arg1.field6955.length <= arg4 || arg1.field6955[arg4] == null) {
            return;
        }
        int var7 = arg1.field6955[arg4][0];
        int var8 = var7 >> 8;
        int var9 = (var7 & 0xEA) >> 5;
        if (arg1.field6955[arg4].length > 1) {
            int var10 = (int) (Math.random() * (double) arg1.field6955[arg4].length);
            if (var10 > 0) {
                var8 = arg1.field6955[arg4][var10];
            }
        }
        if (!arg2) {
            field8890 = -1.5107396F;
        }
        int var11 = var7 & 0x1F;
        if (var11 == 0) {
            if (arg5) {
                class582.method3384(false, var8, 255, var9, 0);
            }
        } else if (class565.field8299.field2177 != 0) {
            int var12 = arg6 - 64 >> 7;
            int var13 = arg3 - 64 >> 7;
            class250.field3228[class570.field8370++] = new class114((byte) 1, var8, var9, 0, 255, (arg0 << 24) + (var12 << 16) + (var13 << 8) + var11);
        }
    }
}
