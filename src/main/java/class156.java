import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class156 {

    @OriginalMember(owner = "client!jj", name = "q", descriptor = "I")
    private int field2372 = 0;

    @OriginalMember(owner = "client!jj", name = "h", descriptor = "I")
    public int field2363;

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "[Lon;")
    public class35[] field2360;

    @OriginalMember(owner = "client!jj", name = "l", descriptor = "[I")
    public static int[] field2367 = new int[50];

    @OriginalMember(owner = "client!jj", name = "s", descriptor = "[Lkf;")
    public static class293[] field2374 = new class293[14];

    @OriginalMember(owner = "client!jj", name = "u", descriptor = "I")
    public static int field2376 = 0;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "I")
    public static int field2356;

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "I")
    public static int field2357;

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "I")
    public static int field2358;

    @OriginalMember(owner = "client!jj", name = "f", descriptor = "I")
    public static int field2361;

    @OriginalMember(owner = "client!jj", name = "j", descriptor = "I")
    public static int field2365;

    @OriginalMember(owner = "client!jj", name = "k", descriptor = "I")
    public static int field2366;

    @OriginalMember(owner = "client!jj", name = "m", descriptor = "I")
    public static int field2368;

    @OriginalMember(owner = "client!jj", name = "n", descriptor = "I")
    public static int field2369;

    @OriginalMember(owner = "client!jj", name = "o", descriptor = "I")
    public static int field2370;

    @OriginalMember(owner = "client!jj", name = "p", descriptor = "I")
    public static int field2371;

    @OriginalMember(owner = "client!jj", name = "r", descriptor = "I")
    public static int field2373;

    @OriginalMember(owner = "client!jj", name = "t", descriptor = "I")
    public static int field2375;

    @OriginalMember(owner = "client!jj", name = "v", descriptor = "I")
    public static int field2377;

    @OriginalMember(owner = "client!jj", name = "x", descriptor = "I")
    public static int field2379;

    @OriginalMember(owner = "client!jj", name = "y", descriptor = "I")
    public static int field2380;

    @OriginalMember(owner = "client!jj", name = "i", descriptor = "J")
    private long field2364;

    @OriginalMember(owner = "client!jj", name = "g", descriptor = "Ldp;")
    public static class174 field2362;

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "Lon;")
    private class35 field2359;

    @OriginalMember(owner = "client!jj", name = "w", descriptor = "Lon;")
    private class35 field2378;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IJLon;)V")
    public final void method1217(int arg0, long arg1, class35 arg2) {
        field2366++;
        if (arg2.field497 != null) {
            arg2.method251(arg0 + 121);
        }
        class35 var5 = this.field2360[(int) ((long) (this.field2363 - arg0) & arg1)];
        arg2.field497 = var5.field497;
        arg2.field498 = var5;
        arg2.field497.field498 = arg2;
        arg2.field498.field497 = arg2;
        arg2.field499 = arg1;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIIZI)V")
    public static final void method1218(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        field2380++;
        if (class443.field6447 == null) {
            class73.field1235.method736(arg1, (byte) -40, -16777216, arg5, arg3, arg0);
            return;
        }
        class49.field794++;
        if (class86.field1394 != null && (class86.field1394.field6520 + 64 - class86.field1394.method1070((byte) -50) * 64 >> 7) == class161.field2434 && class86.field1394.field6519 - (class86.field1394.method1070((byte) -50) - 1) * 64 >> 7 == class11.field136) {
            class11.field136 = -1;
            class161.field2434 = -1;
            class200.method1520(-277309434);
        }
        class229.method1707((byte) 118);
        if (!arg4) {
            class202.method1536((byte) 40);
        }
        class144.method1140(-84);
        class137.method1118(arg5, arg0, arg3, arg1, (byte) 56, true);
        int var6 = class150.field2297;
        int var7 = class444.field6451;
        int var8 = class394.field5755;
        int var9 = class390.field5617;
        if (class322.field4643 == 1) {
            int var12 = (int) class436.field6359;
            if (class164.field2466 >> 8 > var12) {
                var12 = class164.field2466 >> 8;
            }
            if (class1.field6[4] && (class391.field5716[4] + 128) > var12) {
                var12 = class391.field5716[4] + 128;
            }
            int var13 = (int) class106.field1756 + class389.field5570 & 0x3FFF;
            class30.method227(class109.method957(class86.field1394.field6519, class86.field1394.field6520, class367.field5213, arg2 ^ 0x50B6) - 50, var12, class392.field5729, var7, class99.field1551, var13, (var12 >> 3) * 3 + 600, false);
        } else if (class322.field4643 == 4) {
            int var10 = (int) class436.field6359;
            if (class164.field2466 >> 8 > var10) {
                var10 = class164.field2466 >> 8;
            }
            if (class1.field6[4] && class391.field5716[4] + 128 > var10) {
                var10 = class391.field5716[4] + 128;
            }
            int var11 = (int) class106.field1756 & 0x3FFF;
            class30.method227(class109.method957(class263.field3956, class369.field5238, class367.field5213, arg2 + 20662) - 50, var10, class392.field5729, var7, class99.field1551, var11, (var10 >> 3) * 3 + 600, false);
        } else if (class322.field4643 == 5) {
            class408.method2580(false, var7);
        }
        int var14 = class265.field3985;
        int var15 = class437.field6364;
        int var16 = class286.field4288;
        int var17 = class40.field623;
        int var18 = class291.field4330;
        for (int var19 = 0; var19 < 5; var19++) {
            if (class1.field6[var19]) {
                int var22 = (int) ((double) (-class418.field6067[var19]) + (double) (class418.field6067[var19] * 2 + 1) * Math.random() + Math.sin((double) class134.field2156[var19] / 100.0D * (double) class185.field2726[var19]) * (double) class391.field5716[var19]);
                if (var19 == 0) {
                    class265.field3985 += var22;
                }
                if (var19 == 3) {
                    class291.field4330 = class291.field4330 + var22 & 0x3FFF;
                }
                if (var19 == 2) {
                    class286.field4288 += var22;
                }
                if (var19 == 1) {
                    class437.field6364 += var22;
                }
                if (var19 == 4) {
                    class40.field623 += var22;
                    if (class40.field623 < 1024) {
                        class40.field623 = 1024;
                    } else if (class40.field623 > 3072) {
                        class40.field623 = 3072;
                    }
                }
            }
        }
        if (class265.field3985 < 0) {
            class265.field3985 = 0;
        }
        if (((class139.field2209 << 7) - 1) < class265.field3985) {
            class265.field3985 = (class139.field2209 << 7) - 1;
        }
        if (class286.field4288 < 0) {
            class286.field4288 = 0;
        }
        if ((class436.field6353 << 7) - 1 < class286.field4288) {
            class286.field4288 = (class436.field6353 << 7) - 1;
        }
        class338.method2190((byte) 89);
        class289.method2032(arg2 ^ 0x2);
        class73.field1235.method752(var9, var6, var8 + var9, var6 + var7);
        class73.field1235.method742();
        int var20 = class157.field2383;
        if (class250.field3616 == null) {
            class73.field1235.method706(var20);
        } else {
            class250.field3616.method2816(var20, var8, var7, class73.field1235, var9, var6, class121.field1891 << 3, class291.field4330, class40.field623, false);
        }
        class11.method65((byte) 45);
        class293.field4355.method1537(class265.field3985, class437.field6364, class286.field4288, -class40.field623 & 0x3FFF, -class291.field4330 & 0x3FFF, -class375.field5318 & 0x3FFF);
        class73.field1235.method673(class293.field4355);
        class73.field1235.method704(var8 / 2 + var9, var7 / 2 + var6, class133.field2137 << 1, class133.field2137 << 1);
        class49.method390(1292512488, class133.field2137 << 1, var8 / 2 + var9, class133.field2137 << 1, var7 / 2 + var6);
        class307.method2102(-class375.field5318 & 0x3FFF, class437.field6364, -class40.field623 & 0x3FFF, class265.field3985, class286.field4288, -class291.field4330 & 0x3FFF, (byte) 112);
        byte var21 = class379.method2404(0) == 2 ? (byte) class49.field794 : 1;
        class294.method2057(class73.field1235, class267.field4002, class150.field2300, class293.field4355, class265.field3985, class437.field6364, class286.field4288, class141.field2232, class91.field1443, class372.field5286, class326.field4699, class345.field4870, class202.field2940, class367.field5213 + arg2, var21, class86.field1394.field6520 >> 7, class86.field1394.field6519 >> 7, !class428.field6199);
        class11.method65((byte) -96);
        if (class240.field3463 == 30) {
            class253.method1827(var7, (byte) -69, var6, 256, var9, 256, var8);
            class381.method2410(var6, 123, var8, 256, var9, var7, 256);
            class219.method1660(var8, var9, var6, 127, var7, 256, 256);
            class30.method231(var6, var7, 29158, var8, var9);
        }
        class47.method381();
        class40.field623 = var17;
        class265.field3985 = var14;
        class286.field4288 = var16;
        class437.field6364 = var15;
        class291.field4330 = var18;
        if (class302.field4416 && class123.field1951.method2562(4) == 0) {
            class302.field4416 = false;
        }
        if (class302.field4416) {
            class73.field1235.method736(var7, (byte) -40, -16777216, var8, var9, var6);
            class30.method228(false, class117.field1851, class107.field1763, true);
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(JI)Lon;")
    public final class35 method1219(long arg0, int arg1) {
        field2373++;
        this.field2364 = arg0;
        class35 var4 = this.field2360[(int) (arg0 & (long) (this.field2363 - 1))];
        for (this.field2359 = var4.field498; this.field2359 != var4; this.field2359 = this.field2359.field498) {
            if (this.field2359.field499 == arg0) {
                class35 var5 = this.field2359;
                this.field2359 = this.field2359.field498;
                return var5;
            }
        }
        this.field2359 = null;
        if (arg1 > -87) {
            method1226(6, -12L, false, -23, false, -33, -100, (String) null, false, (String) null, 84);
        }
        return null;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)I")
    public final int method1220(int arg0) {
        if (arg0 != 99999) {
            this.method1217(87, 76L, (class35) null);
        }
        field2369++;
        return this.field2363;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "([Lon;Z)I")
    public final int method1221(class35[] arg0, boolean arg1) {
        field2371++;
        int var3 = 0;
        int var4 = 0;
        if (!arg1) {
            method1230(74, 75, -104, -88, (byte) 55);
        }
        while (var4 < this.field2363) {
            class35 var5 = this.field2360[var4];
            for (class35 var6 = var5.field498; var6 != var5; var6 = var6.field498) {
                arg0[var3++] = var6;
            }
            var4++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(I)Lon;")
    public final class35 method1222(int arg0) {
        if (arg0 != 5656) {
            this.field2372 = 2;
        }
        this.field2372 = 0;
        field2375++;
        return this.method1224((byte) -103);
    }

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "(I)V")
    public static void method1223(int arg0) {
        field2374 = null;
        if (arg0 != -21787) {
            field2367 = null;
        }
        field2362 = null;
        field2367 = null;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(B)Lon;")
    public final class35 method1224(byte arg0) {
        if (arg0 >= -81) {
            return null;
        }
        field2357++;
        if (this.field2372 > 0 && this.field2360[this.field2372 - 1] != this.field2378) {
            class35 var2 = this.field2378;
            this.field2378 = var2.field498;
            return var2;
        }
        while (this.field2363 > this.field2372) {
            class35 var3 = this.field2360[this.field2372++].field498;
            if (this.field2360[this.field2372 - 1] != var3) {
                this.field2378 = var3.field498;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(I)V")
    public class156(int arg0) {
        this.field2363 = arg0;
        this.field2360 = new class35[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class35 var3 = this.field2360[var2] = new class35();
            var3.field497 = var3;
            var3.field498 = var3;
        }
    }

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "(I)I")
    public final int method1225(int arg0) {
        field2379++;
        int var2 = 0;
        if (arg0 != -12198) {
            return 48;
        }
        for (int var3 = 0; var3 < this.field2363; var3++) {
            class35 var4 = this.field2360[var3];
            for (class35 var5 = var4.field498; var5 != var4; var5 = var5.field498) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IJZIZIILjava/lang/String;ZLjava/lang/String;I)V")
    public static final void method1226(int arg0, long arg1, boolean arg2, int arg3, boolean arg4, int arg5, int arg6, String arg7, boolean arg8, String arg9, int arg10) {
        field2377++;
        int[] var12 = new int[4];
        for (int var13 = 0; var13 < 3; var13++) {
            var12[var13] = (int) (Math.random() * 9.9999999E7D);
        }
        class37 var14 = new class37(128);
        var14.method267(10, false);
        var14.method324((arg2 ? 1 : 0) | (arg8 ? 2 : 0) | (arg4 ? 4 : 0), -52);
        var14.method269(102, arg1);
        if (arg10 != 11341) {
            method1230(-16, -121, 35, 40, (byte) -34);
        }
        var14.method275(var12[0], 1414495172);
        var14.method265((byte) -125, arg7);
        var14.method275(var12[1], 1414495172);
        var14.method324(class351.field4986, -33);
        var14.method267(arg3, false);
        var14.method267(arg0, false);
        var14.method275(var12[2], 1414495172);
        var14.method324(arg6, arg10 ^ 0xFFFFD3DA);
        var14.method324(arg5, -36);
        var14.method275(var12[3], 1414495172);
        var14.method303(123, class367.field5223, class372.field5276);
        class37 var15 = new class37(350);
        var15.method265((byte) -109, arg9);
        int var16 = 8 - (class429.method2677(arg9, 1) % 8);
        for (int var17 = 0; var17 < var16; var17++) {
            var15.method267((int) (Math.random() * 255.0D), false);
        }
        var15.method292(var12, 255);
        class13.field216.field565 = 0;
        class13.field216.method267(22, false);
        class13.field216.method324(var14.field565 + var15.field565 + 2, arg10 + -11408);
        class13.field216.method324(558, -56);
        class13.field216.method313(0, var14.field578, 25100, var14.field565);
        class13.field216.method313(0, var15.field578, 25100, var15.field565);
        class349.field4965 = -3;
        class28.field421 = 0;
        class8.field110 = 0;
        class205.field3012 = 1;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IBLmb;IIIII)V")
    public static final void method1227(int arg0, byte arg1, class258 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg2.field3793 == 2) {
            int var8 = 99999;
            int var9 = 0;
            int var10 = 0;
            for (int var11 = 0; var11 < arg2.field3814; var11++) {
                for (int var12 = 0; var12 < arg2.field3905; var12++) {
                    int var13 = (arg2.field3769 + 32) * var12 + arg4;
                    int var14 = (arg2.field3755 + 32) * var11 + arg0;
                    if (var10 < 20) {
                        var13 += arg2.field3839[var10];
                        var14 += arg2.field3874[var10];
                    }
                    if (arg2.field3847[var10] > 0 && (arg5 < (var13 + 32) && arg3 > var13 && arg7 < var14 + 32 && var14 < arg6 || class133.field2141 == arg2 && class225.field3326 == var10)) {
                        if (var10 > var9) {
                            var9 = var10;
                        }
                        if (var10 < var8) {
                            var8 = var10;
                        }
                    }
                    var10++;
                }
            }
            class64.method492(arg2, 115, var9, var8, class73.field1235);
        } else if (arg2.field3793 == 5 && arg2.field3765 != -1) {
            class444.method2773(class73.field1235, arg2, (byte) -78);
        }
        field2365++;
        if (arg1 != 111) {
            method1223(-53);
        }
    }

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "(I)V")
    public final void method1228(int arg0) {
        for (int var2 = 0; var2 < this.field2363; var2++) {
            class35 var3 = this.field2360[var2];
            while (true) {
                class35 var4 = var3.field498;
                if (var3 == var4) {
                    break;
                }
                var4.method251(49);
            }
        }
        if (arg0 != -30653) {
            this.method1219(-89L, 37);
        }
        field2370++;
        this.field2378 = null;
        this.field2359 = null;
    }

    @OriginalMember(owner = "client!jj", name = "f", descriptor = "(I)Lon;")
    public final class35 method1229(int arg0) {
        field2356++;
        if (this.field2359 == null) {
            return null;
        }
        if (arg0 != 0) {
            method1226(-12, -125L, false, 52, false, 61, 10, (String) null, false, (String) null, -24);
        }
        class35 var2 = this.field2360[(int) (this.field2364 & (long) (this.field2363 - 1))];
        while (this.field2359 != var2) {
            if (this.field2359.field499 == this.field2364) {
                class35 var3 = this.field2359;
                this.field2359 = this.field2359.field498;
                return var3;
            }
            this.field2359 = this.field2359.field498;
        }
        this.field2359 = null;
        return null;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIIB)V")
    public static final void method1230(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field2358++;
        int var5 = 0;
        int var6 = arg2;
        if (arg4 > -70) {
            method1230(-63, -109, -78, -88, (byte) 89);
        }
        int var7 = -arg2;
        int var8 = -1;
        int var9 = class102.method843(arg2 + arg3, class278.field4184, class185.field2727, 0);
        int var10 = class102.method843(arg3 - arg2, class278.field4184, class185.field2727, 0);
        class47.method379(var9, (byte) 116, arg0, class286.field4283[arg1], var10);
        while (var6 > var5) {
            var8 += 2;
            var7 += var8;
            if (var7 > 0) {
                var6--;
                var7 -= var6 << 1;
                int var11 = arg1 - var6;
                int var12 = arg1 + var6;
                if (class308.field4507 <= var12 && var11 <= class383.field5497) {
                    int var13 = class102.method843(arg3 + var5, class278.field4184, class185.field2727, 0);
                    int var14 = class102.method843(arg3 - var5, class278.field4184, class185.field2727, 0);
                    if (class383.field5497 >= var12) {
                        class47.method379(var13, (byte) 125, arg0, class286.field4283[var12], var14);
                    }
                    if (var11 >= class308.field4507) {
                        class47.method379(var13, (byte) 65, arg0, class286.field4283[var11], var14);
                    }
                }
            }
            var5++;
            int var15 = arg1 - var5;
            int var16 = arg1 + var5;
            if (var16 >= class308.field4507 && var15 <= class383.field5497) {
                int var17 = class102.method843(arg3 + var6, class278.field4184, class185.field2727, 0);
                int var18 = class102.method843(arg3 - var6, class278.field4184, class185.field2727, 0);
                if (var16 <= class383.field5497) {
                    class47.method379(var17, (byte) 62, arg0, class286.field4283[var16], var18);
                }
                if (class308.field4507 <= var15) {
                    class47.method379(var17, (byte) 98, arg0, class286.field4283[var15], var18);
                }
            }
        }
    }
}
