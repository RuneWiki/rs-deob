import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class28 {

    @OriginalMember(owner = "client!bd", name = "j", descriptor = "I")
    public int field314 = 5;

    @OriginalMember(owner = "client!bd", name = "o", descriptor = "I")
    public int field319 = -1;

    @OriginalMember(owner = "client!bd", name = "u", descriptor = "I")
    public int field325 = 99;

    @OriginalMember(owner = "client!bd", name = "v", descriptor = "Z")
    public boolean field326 = false;

    @OriginalMember(owner = "client!bd", name = "E", descriptor = "I")
    public int field335 = 2;

    @OriginalMember(owner = "client!bd", name = "n", descriptor = "I")
    public int field318 = -1;

    @OriginalMember(owner = "client!bd", name = "I", descriptor = "I")
    public int field339 = -1;

    @OriginalMember(owner = "client!bd", name = "L", descriptor = "I")
    public int field342 = -1;

    @OriginalMember(owner = "client!bd", name = "M", descriptor = "I")
    public int field343 = -1;

    @OriginalMember(owner = "client!bd", name = "H", descriptor = "Z")
    public boolean field338 = false;

    @OriginalMember(owner = "client!bd", name = "A", descriptor = "Z")
    public boolean field331 = false;

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "Z")
    public boolean field307 = false;

    @OriginalMember(owner = "client!bd", name = "m", descriptor = "Ljava/lang/String;")
    public static String field317 = "Loaded world list data";

    @OriginalMember(owner = "client!bd", name = "q", descriptor = "I")
    public static volatile int field321 = 0;

    @OriginalMember(owner = "client!bd", name = "G", descriptor = "Ljava/lang/String;")
    public static String field337 = "Ok";

    @OriginalMember(owner = "client!bd", name = "D", descriptor = "I")
    public static int field334 = -1;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "I")
    public static int field305;

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "I")
    public static int field306;

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "I")
    public static int field308;

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "I")
    public static int field309;

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "I")
    public static int field310;

    @OriginalMember(owner = "client!bd", name = "g", descriptor = "I")
    public static int field311;

    @OriginalMember(owner = "client!bd", name = "i", descriptor = "I")
    public static int field313;

    @OriginalMember(owner = "client!bd", name = "k", descriptor = "I")
    public static int field315;

    @OriginalMember(owner = "client!bd", name = "l", descriptor = "I")
    public static int field316;

    @OriginalMember(owner = "client!bd", name = "p", descriptor = "I")
    public static int field320;

    @OriginalMember(owner = "client!bd", name = "s", descriptor = "I")
    public int field323;

    @OriginalMember(owner = "client!bd", name = "t", descriptor = "I")
    public static int field324;

    @OriginalMember(owner = "client!bd", name = "y", descriptor = "I")
    public static int field329;

    @OriginalMember(owner = "client!bd", name = "z", descriptor = "I")
    public static int field330;

    @OriginalMember(owner = "client!bd", name = "B", descriptor = "I")
    public static int field332;

    @OriginalMember(owner = "client!bd", name = "C", descriptor = "I")
    public static int field333;

    @OriginalMember(owner = "client!bd", name = "F", descriptor = "I")
    public static int field336;

    @OriginalMember(owner = "client!bd", name = "J", descriptor = "I")
    public static int field340;

    @OriginalMember(owner = "client!bd", name = "h", descriptor = "[I")
    public int[] field312;

    @OriginalMember(owner = "client!bd", name = "r", descriptor = "[I")
    private int[] field322;

    @OriginalMember(owner = "client!bd", name = "x", descriptor = "[I")
    public int[] field328;

    @OriginalMember(owner = "client!bd", name = "K", descriptor = "[Z")
    public boolean[] field341;

    @OriginalMember(owner = "client!bd", name = "w", descriptor = "[[I")
    public int[][] field327;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Z)V", line = 7)
    public static final void method206(boolean arg0) {
        field306++;
        class160 var1 = (class160) class2.field28.method1954(-66);
        if (arg0) {
            return;
        }
        while (var1 != null) {
            if (var1.field2426 > 0) {
                var1.field2426--;
            }
            if (var1.field2426 != 0) {
                if (var1.field2421 > 0) {
                    var1.field2421--;
                }
                if (var1.field2421 == 0 && var1.field2437 >= 1 && var1.field2418 >= 1 && var1.field2437 <= 102 && var1.field2418 <= 102 && (var1.field2434 < 0 || class268.method1880(var1.field2434, var1.field2436, false))) {
                    class63.method433(var1.field2437, var1.field2434, (byte) -34, var1.field2419, var1.field2425, var1.field2418, var1.field2436, var1.field2431);
                    var1.field2421 = -1;
                    if (var1.field2434 == var1.field2422 && var1.field2422 == -1) {
                        var1.method39(10717);
                    } else if (var1.field2434 == var1.field2422 && var1.field2429 == var1.field2425 && var1.field2436 == var1.field2423) {
                        var1.method39(10717);
                    }
                }
            } else if (var1.field2422 < 0 || class268.method1880(var1.field2422, var1.field2423, false)) {
                class63.method433(var1.field2437, var1.field2422, (byte) -34, var1.field2419, var1.field2429, var1.field2418, var1.field2423, var1.field2431);
                var1.method39(10717);
            }
            var1 = (class160) class2.field28.method1950((byte) 127);
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(ZIIILr;)Lr;", line = 65)
    public final class74 method207(boolean arg0, int arg1, int arg2, int arg3, class74 arg4) {
        field316++;
        int var6 = this.field328[arg3];
        int var7 = this.field312[arg3];
        class10 var8 = class110.method839(var7 >> 16, -121);
        int var9 = var7 & 0xFFFF;
        if (var8 == null) {
            return arg4.method591(true, true, true);
        }
        class10 var10 = null;
        if ((this.field326 || class231.field3527) && arg2 != -1 && this.field312.length > arg2) {
            int var11 = this.field312[arg2];
            var10 = class110.method839(var11 >> 16, -121);
            arg2 = var11 & 0xFFFF;
        }
        class74 var12;
        if (var10 == null) {
            var12 = arg4.method591(!var8.method93(var9, (byte) -113), !var8.method90(var9, 106), !this.field331);
        } else {
            var12 = arg4.method591(!var8.method93(var9, (byte) 42) & !var10.method93(arg2, (byte) -121), !var8.method90(var9, 101) & !var10.method90(arg2, 109), !this.field331);
        }
        if (arg0) {
            method212((byte) -3, -126);
        }
        var12.method584(var8, var9, var10, arg2, arg1 - 1, var6, this.field331);
        return var12;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(ZLkk;)V", line = 103)
    public static final void method208(boolean arg0, class76 arg1) {
        field330++;
        if (!arg0) {
            field340 = -12;
        }
        for (class239 var2 = (class239) class294.field4534.method1954(-66); var2 != null; var2 = (class239) class294.field4534.method1950((byte) 120)) {
            if (var2.field3630 == arg1) {
                if (var2.field3632 != null) {
                    class322.field4961.method147(var2.field3632);
                    var2.field3632 = null;
                }
                var2.method39(10717);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(Z)V", line = 135)
    public static void method209(boolean arg0) {
        field317 = null;
        if (arg0) {
            field337 = null;
        }
    }

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "(Z)V", line = 153)
    public final void method210(boolean arg0) {
        if (this.field342 == -1) {
            if (this.field341 == null) {
                this.field342 = 0;
            } else {
                this.field342 = 2;
            }
        }
        field336++;
        if (arg0) {
            method208(true, (class76) null);
        }
        if (this.field319 != -1) {
            return;
        }
        if (this.field341 == null) {
            this.field319 = 0;
        } else {
            this.field319 = 2;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIILrc;II)V", line = 185)
    public static final void method211(int arg0, int arg1, int arg2, class239 arg3, int arg4, int arg5) {
        field311++;
        if (arg0 != -1184) {
            field340 = -122;
        }
        if (arg3.field3644 == -1 && arg3.field3631 == null) {
            return;
        }
        int var6 = 0;
        if (arg1 > arg3.field3651) {
            var6 += arg1 - arg3.field3651;
        } else if (arg3.field3637 > arg1) {
            var6 += arg3.field3637 - arg1;
        }
        int var7 = class71.field1022 * arg3.field3649 >> 8;
        if (arg3.field3650 < arg4) {
            var6 += arg4 - arg3.field3650;
        } else if (arg3.field3638 > arg4) {
            var6 += arg3.field3638 - arg4;
        }
        if (arg3.field3645 == 0 || arg3.field3645 < (var6 - 64) || class71.field1022 == 0 || arg3.field3640 != arg5) {
            if (arg3.field3632 != null) {
                class322.field4961.method147(arg3.field3632);
                arg3.field3632 = null;
            }
            if (arg3.field3633 != null) {
                class322.field4961.method147(arg3.field3633);
                arg3.field3633 = null;
            }
            return;
        }
        var6 -= 64;
        if (var6 < 0) {
            var6 = 0;
        }
        int var8 = (arg3.field3645 - var6) * var7 / arg3.field3645;
        if (arg3.field3632 != null) {
            arg3.field3632.method2173(var8);
        } else if (arg3.field3644 >= 0) {
            class317 var9 = class317.method2207(class196.field3022, arg3.field3644, 0);
            if (var9 != null) {
                class266 var10 = var9.method2206().method1870(class245.field3712);
                class316 var11 = class316.method2181(var10, 100, var8);
                var11.method2180(-1);
                class322.field4961.method144(var11);
                arg3.field3632 = var11;
            }
        }
        if (arg3.field3633 != null) {
            arg3.field3633.method2173(var8);
            if (!arg3.field3633.method40((byte) 94)) {
                arg3.field3633 = null;
            }
        } else if (arg3.field3631 != null && (arg3.field3647 -= arg2) <= 0) {
            int var12 = (int) (Math.random() * (double) arg3.field3631.length);
            class317 var13 = class317.method2207(class196.field3022, arg3.field3631[var12], 0);
            if (var13 != null) {
                class266 var14 = var13.method2206().method1870(class245.field3712);
                class316 var15 = class316.method2181(var14, 100, var8);
                var15.method2180(0);
                class322.field4961.method144(var15);
                arg3.field3633 = var15;
                arg3.field3647 = (int) (Math.random() * (double) (arg3.field3648 - arg3.field3643)) + arg3.field3643;
            }
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(BI)Lqg;", line = 311)
    public static final class207 method212(byte arg0, int arg1) {
        class207 var2 = (class207) class130.field2003.method747((long) arg1, (byte) 123);
        field309++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class181.field2871.method696(class343.method2372(0, arg1), (byte) 101, class327.method2285(false, arg1));
        if (arg0 >= -10) {
            return (class207) null;
        }
        class207 var4 = new class207();
        if (var3 != null) {
            var4.method1495(new class254(var3), -32);
        }
        class130.field2003.method744(var4, -15692, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILr;IIIZ)Lr;", line = 353)
    public final class74 method213(int arg0, class74 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field333++;
        int var7 = this.field328[arg4];
        int var8 = this.field312[arg4];
        class10 var9 = class110.method839(var8 >> 16, -95);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg1.method586(true, true, true);
        }
        class10 var11 = null;
        int var12 = arg0 & 0x3;
        if ((this.field326 || class231.field3527) && arg2 != -1 && this.field312.length > arg2) {
            int var13 = this.field312[arg2];
            var11 = class110.method839(var13 >> 16, -110);
            arg2 = var13 & 0xFFFF;
        }
        class74 var14;
        if (var11 == null) {
            var14 = arg1.method586(!var9.method93(var10, (byte) 24), !var9.method90(var10, 103), !this.field331);
        } else {
            var14 = arg1.method586(!var9.method93(var10, (byte) 33) & !var11.method93(arg2, (byte) -119), !var9.method90(var10, 101) & !var11.method90(arg2, 111), !this.field331);
        }
        if (this.field331 && class73.field1058) {
            if (var12 == 1) {
                ((class140) var14).method1050();
            } else if (var12 == 2) {
                ((class140) var14).method1080();
            } else if (var12 == 3) {
                ((class140) var14).method1053();
            }
        } else if (var12 == 1) {
            var14.method570();
        } else if (var12 == 2) {
            var14.method573();
        } else if (var12 == 3) {
            var14.method574();
        }
        if (!arg5) {
            return (class74) null;
        }
        var14.method584(var9, var10, var11, arg2, arg3 - 1, var7, this.field331);
        if (this.field331 && class73.field1058) {
            if (var12 == 1) {
                ((class140) var14).method1053();
            } else if (var12 == 2) {
                ((class140) var14).method1080();
            } else if (var12 == 3) {
                ((class140) var14).method1050();
            }
        } else if (var12 == 1) {
            var14.method574();
        } else if (var12 == 2) {
            var14.method573();
        } else if (var12 == 3) {
            var14.method570();
        }
        return var14;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(BLmn;)Ljava/lang/String;", line = 452)
    public static final String method214(byte arg0, class161 arg1) {
        int var2 = 23 % ((arg0 + 72) / 34);
        field308++;
        if (client.method1012(arg1).method34(123) == 0) {
            return null;
        } else if (arg1.field2596 == null || arg1.field2596.trim().length() == 0) {
            return class335.field5216 ? "Hidden-use" : null;
        } else {
            return arg1.field2596;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "([[IIIIII)I", line = 473)
    public static final int method215(int[][] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field313++;
        if (arg3 == 20667) {
            int var6 = (128 - arg1) * arg0[arg2][arg5] + arg0[arg2 + 1][arg5] * arg1 >> 7;
            int var7 = (128 - arg1) * arg0[arg2][arg5 + 1] + arg0[arg2 + 1][arg5 + 1] * arg1 >> 7;
            return (128 - arg4) * var6 + arg4 * var7 >> 7;
        } else {
            return -40;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(II)V", line = 488)
    public static final void method216(int arg0, int arg1) {
        field310++;
        int var2 = class190.field2976;
        int var3 = class7.field111;
        int var4 = class197.field3028;
        int var5 = class193.field3015;
        int var6 = class200.field3047;
        int var7 = (int) class307.field4786;
        if (var7 < (class15.field200 / 256)) {
            var7 = class15.field200 / 256;
        }
        int var8 = (int) class243.field3695 + class72.field1036 & 0x7FF;
        if (class307.field4791[4] && var7 < (class204.field3134[4] + 128)) {
            var7 = class204.field3134[4] + 128;
        }
        class335.method2336(var7, class328.method2291(class265.field4112, class39.field575.field4731, class39.field575.field4713, 104) - 50, class87.field1242, arg0, 30921, var8, class198.field3034, var7 * 3 + 600);
        if (class190.field2976 == var2 && class7.field111 == var3 && class197.field3028 == var4 && class193.field3015 == var5 && class200.field3047 == var6) {
            class268.field4168 = 1;
            return;
        }
        class269.field4181 = 10;
        class174.field2792 = 10;
        class225.field3444 = 10;
        class273.field4265 = 10;
        if (var4 < class197.field3028) {
            var4 += (class197.field3028 - var4) * class225.field3444 / 1000 + class174.field2792;
            if (class197.field3028 > var4) {
                class197.field3028 = var4;
            }
        }
        if (class193.field3015 > var5) {
            var5 += (class193.field3015 - var5) * class269.field4181 / 1000 + class273.field4265;
            if (var5 < class193.field3015) {
                class193.field3015 = var5;
            }
        }
        if (var5 > class193.field3015) {
            int var9 = var5 - ((var5 - class193.field3015) * class269.field4181 / 1000 + class273.field4265);
            if (var9 > class193.field3015) {
                class193.field3015 = var9;
            }
        }
        if (class190.field2976 > var2) {
            var2 += (class190.field2976 - var2) * class225.field3444 / 1000 + class174.field2792;
            if (var2 < class190.field2976) {
                class190.field2976 = var2;
            }
        }
        if (var3 < class7.field111) {
            var3 += (class7.field111 - var3) * class225.field3444 / 1000 + class174.field2792;
            if (var3 < class7.field111) {
                class7.field111 = var3;
            }
        }
        if (var3 > class7.field111) {
            int var10 = var3 - ((var3 - class7.field111) * class225.field3444 / 1000 + class174.field2792);
            if (var10 > class7.field111) {
                class7.field111 = var10;
            }
        }
        if (var4 > class197.field3028) {
            int var11 = var4 - ((var4 - class197.field3028) * class225.field3444 / 1000 + class174.field2792);
            if (class197.field3028 < var11) {
                class197.field3028 = var11;
            }
        }
        int var12 = class200.field3047 - var6;
        if (class190.field2976 < var2) {
            int var13 = var2 - (class174.field2792 + ((var2 - class190.field2976) * class225.field3444 / 1000));
            if (var13 > class190.field2976) {
                class190.field2976 = var13;
            }
        }
        if (var12 > 1024) {
            var12 -= 2048;
        }
        if (var12 < -1024) {
            var12 += 2048;
        }
        if (var12 > 0) {
            int var14 = class269.field4181 * var12 / 1000 + class273.field4265 + var6;
            var6 = var14 & 0x7FF;
        }
        if (var12 < 0) {
            int var15 = var6 - (-var12 * class269.field4181 / 1000 + class273.field4265);
            var6 = var15 & 0x7FF;
        }
        int var16 = class200.field3047 - var6;
        if (var16 > 1024) {
            var16 -= 2048;
        }
        if (var16 < -1024) {
            var16 += 2048;
        }
        if (arg1 == -16 && var16 >= 0 || var12 <= 0 || var16 > 0 && var12 < 0) {
            class200.field3047 = var6;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIIII)V", line = 651)
    public static final void method217(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field305++;
        if (class215.field3299 < 100) {
            class300.method2066(121);
        }
        if (class73.field1058) {
            class175.method1316(arg2, arg1, arg0 + arg2, arg1 + arg3);
        } else {
            class287.method1980(arg2, arg1, arg0 + arg2, arg1 + arg3);
        }
        if (class215.field3299 < 100) {
            int var14 = arg2 + (arg0 / 2);
            byte var15 = 20;
            int var16 = arg3 / 2 + arg1 - var15 - 18;
            if (class73.field1058) {
                class175.method1322(arg2, arg1, arg0, arg3, 0);
                class175.method1320(var14 - 152, var16, 304, 34, 9179409);
                class175.method1320(var14 - 151, var16 + 1, 302, 32, 0);
                class175.method1322(var14 - 150, var16 + 2, class215.field3299 * 3, 30, 9179409);
                class175.method1322(class215.field3299 * 3 + var14 - 150, var16 + 2, 300 - (class215.field3299 * 3), 30, 0);
            } else {
                class287.method1987(arg2, arg1, arg0, arg3, 0);
                class287.method1981(var14 - 152, var16, 304, 34, 9179409);
                class287.method1981(var14 - 151, var16 + 1, 302, 32, 0);
                class287.method1987(var14 - 150, var16 + 2, class215.field3299 * 3, 30, 9179409);
                class287.method1987(class215.field3299 * 3 + var14 - 150, var16 - -2, 300 - class215.field3299 * 3, 30, 0);
            }
            class167.field2703.method2265(class21.field238, var14, var16 + var15, 16777215, -1);
            return;
        }
        class177.field2827 = (int) ((float) (arg0 * 2) / class198.field3035);
        int var5 = class49.field680 - ((int) ((float) arg3 / class198.field3035));
        class173.field2789 = class49.field680 - ((int) ((float) arg3 / class198.field3035));
        class13.field175 = (int) ((float) (arg3 * 2) / class198.field3035);
        int var6 = (int) ((float) arg0 / class198.field3035) + class8.field119;
        int var7 = class8.field119 - (int) ((float) arg0 / class198.field3035);
        int var8 = (int) ((float) arg3 / class198.field3035) + class49.field680;
        class341.field5296 = class8.field119 - (int) ((float) arg0 / class198.field3035);
        if (class73.field1058) {
            if (class144.field2209 == null || class144.field2209.field4175 != arg0 || class144.field2209.field4184 != arg3) {
                class144.field2209 = null;
                class144.field2209 = new class195(arg0, arg3);
            }
            class287.method1986(class144.field2209.field3017, arg0, arg3);
            class250.method1714(var7, var5, arg0, 0, 0, var6, arg3, var8, 0);
            class292.method2020(var5, 0, arg0, 0, class205.field3152, var6, var7, arg3, var8, false);
            class270.method1898(var6, var5, 72, var8, var7, 0, 0, arg3, arg0);
            class144.field2209.method1418();
            class175.method1315(class144.field2209.field3017, arg2, arg1, arg0, arg3);
            class287.field4453 = null;
        } else {
            class250.method1714(var7, var5, arg0 + arg2, arg2, arg1, var6, arg1 + arg3, var8, 0);
            class292.method2020(var5, arg1, arg0 + arg2, arg2, class205.field3152, var6, var7, arg1 + arg3, var8, false);
            class270.method1898(var6, var5, arg4 - 13475, var8, var7, arg2, arg1, arg1 + arg3, arg0 + arg2);
        }
        if (arg4 != 13543) {
            return;
        }
        if (class336.field5234 > 0) {
            class153.field2322--;
            if (class153.field2322 == 0) {
                class153.field2322 = 20;
                class336.field5234--;
            }
        }
        if (!class262.field4045) {
            return;
        }
        int var9 = arg0 + arg2 - 5;
        int var10 = arg1 + arg3 - 8;
        class265.field4128.method2271("Fps:" + class2.field31, var9, var10, 16776960, -1);
        int var11 = 16776960;
        int var17 = var10 - 15;
        Runtime var12 = Runtime.getRuntime();
        int var13 = (int) ((var12.totalMemory() - var12.freeMemory()) / 1024L);
        if (var13 > 65536) {
            var11 = 16711680;
        }
        class265.field4128.method2271("Mem:" + var13 + "k", var9, var17, var11, -1);
        var10 = var17 - 15;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILr;III)Lr;", line = 776)
    public final class74 method218(int arg0, class74 arg1, int arg2, int arg3, int arg4) {
        field315++;
        int var6 = this.field328[arg3];
        int var7 = this.field312[arg3];
        class10 var8 = class110.method839(var7 >> 16, -118);
        int var9 = var7 & arg2;
        if (var8 == null) {
            return arg1.method586(true, true, true);
        }
        class10 var10 = null;
        if ((this.field326 || class231.field3527) && arg0 != -1 && this.field312.length > arg0) {
            int var11 = this.field312[arg0];
            var10 = class110.method839(var11 >> 16, -116);
            arg0 = var11 & 0xFFFF;
        }
        class10 var12 = null;
        int var13 = 0;
        class10 var14 = null;
        int var15 = 0;
        if (this.field322 != null) {
            if (this.field322.length > arg3) {
                var13 = this.field322[arg3];
                if (var13 != 65535) {
                    var12 = class110.method839(var13 >> 16, -109);
                    var13 &= 0xFFFF;
                }
            }
            if ((this.field326 || class231.field3527) && arg0 != -1 && this.field322.length > arg0) {
                var15 = this.field322[arg0];
                if (var15 != 65535) {
                    var14 = class110.method839(var15 >> 16, -96);
                    var15 &= 0xFFFF;
                }
            }
        }
        boolean var16 = !var8.method93(var9, (byte) 17);
        boolean var17 = !var8.method90(var9, 120);
        if (var12 != null) {
            var16 &= !var12.method93(var13, (byte) -106);
            var17 &= !var12.method90(var13, 112);
        }
        if (var10 != null) {
            var16 &= !var10.method93(arg0, (byte) -125);
            var17 &= !var10.method90(arg0, arg2 ^ 0xFF97);
        }
        if (var14 != null) {
            var16 &= !var14.method93(var15, (byte) 110);
            var17 &= !var14.method90(var15, 126);
        }
        class74 var18 = arg1.method586(var16, var17, !this.field331);
        var18.method584(var8, var9, var10, arg0, arg4 - 1, var6, this.field331);
        if (var12 != null) {
            var18.method584(var12, var13, var14, var15, arg4 - 1, var6, this.field331);
        }
        return var18;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lwm;I)V", line = 882)
    public final void method219(class254 arg0, int arg1) {
        if (arg1 != -2286) {
            return;
        }
        field332++;
        while (true) {
            int var3 = arg0.method1774((byte) 33);
            if (var3 == 0) {
                return;
            }
            this.method221(var3, arg0, arg1 + 2286);
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIILr;II)Lr;", line = 914)
    public final class74 method220(int arg0, int arg1, int arg2, class74 arg3, int arg4, int arg5) {
        field320++;
        int var7 = this.field328[arg1];
        int var8 = this.field312[arg1];
        class10 var9 = class110.method839(var8 >> 16, -115);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg3.method589(true, true, true);
        }
        int var11 = arg0 & arg5;
        class10 var12 = null;
        if ((this.field326 || class231.field3527) && arg2 != -1 && this.field312.length > arg2) {
            int var13 = this.field312[arg2];
            var12 = class110.method839(var13 >> 16, -99);
            arg2 = var13 & 0xFFFF;
        }
        class74 var14;
        if (var12 == null) {
            var14 = arg3.method589(!var9.method93(var10, (byte) -122), !var9.method90(var10, 115), !this.field331);
        } else {
            var14 = arg3.method589(!var9.method93(var10, (byte) 36) & !var12.method93(arg2, (byte) -109), !var9.method90(var10, 115) & !var12.method90(arg2, arg5 ^ 0x75), !this.field331);
        }
        if (class73.field1058 && this.field331) {
            if (var11 == 1) {
                ((class140) var14).method1050();
            } else if (var11 == 2) {
                ((class140) var14).method1080();
            } else if (var11 == 3) {
                ((class140) var14).method1053();
            }
        } else if (var11 == 1) {
            var14.method570();
        } else if (var11 == 2) {
            var14.method573();
        } else if (var11 == 3) {
            var14.method574();
        }
        var14.method584(var9, var10, var12, arg2, arg4 - 1, var7, this.field331);
        if (class73.field1058 && this.field331) {
            if (var11 == 1) {
                ((class140) var14).method1053();
            } else if (var11 == 2) {
                ((class140) var14).method1080();
            } else if (var11 == 3) {
                ((class140) var14).method1050();
            }
        } else if (var11 == 1) {
            var14.method574();
        } else if (var11 == 2) {
            var14.method573();
        } else if (var11 == 3) {
            var14.method570();
        }
        return var14;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILwm;I)V", line = 1015)
    private final void method221(int arg0, class254 arg1, int arg2) {
        field329++;
        if (arg2 != 0) {
            return;
        }
        if (arg0 == 1) {
            int var13 = arg1.method1755(false);
            this.field328 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field328[var14] = arg1.method1755(false);
            }
            this.field312 = new int[var13];
            for (int var15 = 0; var15 < var13; var15++) {
                this.field312[var15] = arg1.method1755(false);
            }
            for (int var16 = 0; var16 < var13; var16++) {
                this.field312[var16] = (arg1.method1755(false) << 16) + this.field312[var16];
            }
        } else if (arg0 == 2) {
            this.field339 = arg1.method1755(false);
        } else if (arg0 == 3) {
            this.field341 = new boolean[256];
            int var11 = arg1.method1774((byte) -113);
            for (int var12 = 0; var12 < var11; var12++) {
                this.field341[arg1.method1774((byte) 76)] = true;
            }
        } else if (arg0 == 4) {
            this.field307 = true;
        } else if (arg0 == 5) {
            this.field314 = arg1.method1774((byte) 82);
        } else if (arg0 == 6) {
            this.field318 = arg1.method1755(false);
        } else if (arg0 == 7) {
            this.field343 = arg1.method1755(false);
        } else if (arg0 == 8) {
            this.field325 = arg1.method1774((byte) 76);
        } else if (arg0 == 9) {
            this.field342 = arg1.method1774((byte) 24);
        } else if (arg0 == 10) {
            this.field319 = arg1.method1774((byte) 15);
        } else if (arg0 == 11) {
            this.field335 = arg1.method1774((byte) -106);
        } else if (arg0 == 12) {
            int var8 = arg1.method1774((byte) -111);
            this.field322 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field322[var9] = arg1.method1755(false);
            }
            for (int var10 = 0; var10 < var8; var10++) {
                this.field322[var10] += arg1.method1755(false) << 16;
            }
        } else if (arg0 == 13) {
            int var4 = arg1.method1755(false);
            this.field327 = new int[var4][];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg1.method1774((byte) -118);
                if (var6 > 0) {
                    this.field327[var5] = new int[var6];
                    this.field327[var5][0] = arg1.method1758((byte) 111);
                    for (int var7 = 1; var7 < var6; var7++) {
                        this.field327[var5][var7] = arg1.method1755(false);
                    }
                }
            }
        } else if (arg0 == 14) {
            this.field331 = true;
        } else if (arg0 == 15) {
            this.field326 = true;
        } else if (arg0 == 16) {
            this.field338 = true;
        }
    }
}
