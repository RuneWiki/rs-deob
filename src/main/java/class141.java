import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class141 {

    @OriginalMember(owner = "client!sg", name = "o", descriptor = "I")
    public int field2355 = -1;

    @OriginalMember(owner = "client!sg", name = "h", descriptor = "S")
    public static short field2348 = 256;

    @OriginalMember(owner = "client!sg", name = "m", descriptor = "[I")
    public static int[] field2353 = new int[1000];

    @OriginalMember(owner = "client!sg", name = "j", descriptor = "I")
    public static int field2350 = 0;

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "Z")
    public static boolean field2342 = false;

    @OriginalMember(owner = "client!sg", name = "r", descriptor = "Le;")
    public static class191 field2358 = class54.method368("::rect_debug", 2047);

    @OriginalMember(owner = "client!sg", name = "t", descriptor = "Z")
    public static boolean field2360 = false;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "I")
    public static int field2341;

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "I")
    public static int field2343;

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "I")
    public static int field2344;

    @OriginalMember(owner = "client!sg", name = "f", descriptor = "I")
    public static int field2346;

    @OriginalMember(owner = "client!sg", name = "i", descriptor = "I")
    public static int field2349;

    @OriginalMember(owner = "client!sg", name = "l", descriptor = "I")
    public static int field2352;

    @OriginalMember(owner = "client!sg", name = "n", descriptor = "I")
    public static int field2354;

    @OriginalMember(owner = "client!sg", name = "p", descriptor = "I")
    public static int field2356;

    @OriginalMember(owner = "client!sg", name = "q", descriptor = "I")
    public static int field2357;

    @OriginalMember(owner = "client!sg", name = "u", descriptor = "I")
    public static int field2361;

    @OriginalMember(owner = "client!sg", name = "s", descriptor = "Lng;")
    public static class121 field2359;

    @OriginalMember(owner = "client!sg", name = "g", descriptor = "Llb;")
    public class197 field2347;

    @OriginalMember(owner = "client!sg", name = "v", descriptor = "Ljava/awt/Frame;")
    public static Frame field2362;

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "[I")
    public int[] field2345;

    @OriginalMember(owner = "client!sg", name = "k", descriptor = "[Le;")
    public class191[] field2351;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(B)V")
    public static final void method927(byte arg0) {
        if (arg0 == -59) {
            field2341++;
            class33.field489 = 0L;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIIIBII)V")
    public static final void method928(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        if (class37.field678 <= arg0 - arg3 && (arg0 + arg3) <= class207.field3680 && class242.field4314 <= (arg5 - arg3) && arg3 + arg5 <= class99.field1584) {
            class47.method321(arg1, arg6, true, arg2, arg3, arg0, arg5);
        } else {
            class244.method1706(arg1, arg2, arg6, arg0, arg5, (byte) -58, arg3);
        }
        field2354++;
        if (arg4 >= -116) {
            field2346 = 85;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)V")
    public static final void method929(int arg0) {
        field2357++;
        if (class129.method875((byte) 62) != 2) {
            return;
        }
        byte var1 = (byte) (class182.field3131 - 4 & 0xFF);
        int var2 = class182.field3131 % 104;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var16 = 0; var16 < 104; var16++) {
                class137.field2301[var3][var2][var16] = var1;
            }
        }
        if (class261.field4598 == arg0) {
            return;
        }
        for (int var4 = 0; var4 < 2; var4++) {
            class25.field362[var4] = -1000000;
            class223.field3976[var4] = 1000000;
            class157.field2674[var4] = 0;
            class82.field1386[var4] = 1000000;
            class232.field4150[var4] = 0;
        }
        if (class243.field4345 != 1) {
            int var5 = class222.method1546(class261.field4598, class137.field2306, class244.field4353, 247425607);
            if ((var5 - class229.field4116) < 800 && (class270.field4755[class261.field4598][class137.field2306 >> 7][class244.field4353 >> 7] & 0x4) != 0) {
                class53.method358(arg0 + 102, class244.field4353 >> 7, class137.field2306 >> 7, 1, false, class201.field3608);
                return;
            }
            return;
        }
        if ((class270.field4755[class261.field4598][class175.field2946.field3003 >> 7][class175.field2946.field2972 >> 7] & 0x4) != 0) {
            class53.method358(102, class175.field2946.field2972 >> 7, class175.field2946.field3003 >> 7, 0, false, class201.field3608);
        }
        if (class170.field2876 >= 310) {
            return;
        }
        int var6 = class137.field2306 >> 7;
        int var7 = class175.field2946.field2972 >> 7;
        int var8 = class175.field2946.field3003 >> 7;
        int var9;
        if (var8 <= var6) {
            var9 = var6 - var8;
        } else {
            var9 = var8 - var6;
        }
        int var10 = class244.field4353 >> 7;
        int var11;
        if (var7 <= var10) {
            var11 = var10 - var7;
        } else {
            var11 = var7 - var10;
        }
        if (var9 <= var11) {
            int var12 = var9 * 65536 / var11;
            int var13 = 32768;
            while (var7 != var10) {
                if (var10 < var7) {
                    var10++;
                } else if (var10 > var7) {
                    var10--;
                }
                if ((class270.field4755[class261.field4598][var6][var10] & 0x4) != 0) {
                    class53.method358(-121, var10, var6, 1, false, class201.field3608);
                    return;
                }
                var13 += var12;
                if (var13 >= 65536) {
                    var13 -= 65536;
                    if (var6 < var8) {
                        var6++;
                    } else if (var8 < var6) {
                        var6--;
                    }
                    if ((class270.field4755[class261.field4598][var6][var10] & 0x4) != 0) {
                        class53.method358(arg0 ^ 0xFFFFFF9C, var10, var6, 1, false, class201.field3608);
                        return;
                    }
                }
            }
            return;
        }
        int var14 = var11 * 65536 / var9;
        int var15 = 32768;
        while (var6 != var8) {
            if (var6 < var8) {
                var6++;
            } else if (var8 < var6) {
                var6--;
            }
            if ((class270.field4755[class261.field4598][var6][var10] & 0x4) != 0) {
                class53.method358(arg0 ^ 0xFFFFFF81, var10, var6, 1, false, class201.field3608);
                return;
            }
            var15 += var14;
            if (var15 >= 65536) {
                if (var7 > var10) {
                    var10++;
                } else if (var7 < var10) {
                    var10--;
                }
                var15 -= 65536;
                if ((class270.field4755[class261.field4598][var6][var10] & 0x4) != 0) {
                    class53.method358(arg0 ^ 0x32, var10, var6, 1, false, class201.field3608);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(ILji;)Lpc;")
    public static final class249 method930(int arg0, class225 arg1) {
        field2356++;
        if (arg0 != 591384455) {
            method927((byte) -110);
        }
        return new class249(arg1.method1568(110), arg1.method1568(116), arg1.method1568(111), arg1.method1568(127), arg1.method1591(arg0 - 591384453), arg1.method1580(arg0 ^ 0xDCC0307A));
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(BLjb;)V")
    public static final void method931(byte arg0, class176 arg1) {
        field2352++;
        if (class135.field2267 == arg1.field2962 || arg1.field3019 == -1 || arg1.field3016 != 0 || arg1.field3020 + 1 > class67.method445((byte) -61, arg1.field3019).field4406[arg1.field2958]) {
            int var2 = arg1.field2962 - arg1.field2984;
            int var3 = class135.field2267 - arg1.field2984;
            int var4 = arg1.field2975 * 128 + arg1.method490((byte) -4) * 64;
            int var5 = arg1.field2982 * 128 + arg1.method490((byte) -4) * 64;
            int var6 = arg1.field2967 * 128 + (arg1.method490((byte) -4) * 64);
            int var7 = arg1.field2997 * 128 + arg1.method490((byte) -4) * 64;
            arg1.field2972 = ((var2 - var3) * var5 + (var3 * var7)) / var2;
            arg1.field3003 = ((var2 - var3) * var4 + var3 * var6) / var2;
        }
        arg1.field3008 = 0;
        if (arg0 >= -30) {
            method933(-38, false, false, 43L, 71);
        }
        if (arg1.field2954 == 0) {
            arg1.field2964 = 1024;
        }
        if (arg1.field2954 == 1) {
            arg1.field2964 = 1536;
        }
        if (arg1.field2954 == 2) {
            arg1.field2964 = 0;
        }
        if (arg1.field2954 == 3) {
            arg1.field2964 = 512;
        }
        arg1.field2999 = arg1.field2964;
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(I)V")
    public static void method932(int arg0) {
        if (arg0 != 10) {
            method927((byte) -29);
        }
        field2362 = null;
        field2359 = null;
        field2353 = null;
        field2358 = null;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IZZJI)Le;")
    public static final class191 method933(int arg0, boolean arg1, boolean arg2, long arg3, int arg4) {
        field2343++;
        class191 var6 = class167.method1123(-4636, 0);
        if (arg3 < 0L) {
            arg3 = -arg3;
            var6.method1326((byte) -9, class73.field1264);
        }
        class191 var7 = class230.field4127;
        class191 var8 = class90.field1454;
        if (arg1) {
            method930(105, (class225) null);
        }
        if (arg4 == 1) {
            var7 = class90.field1454;
            var8 = class230.field4127;
        }
        if (arg4 == 2) {
            var7 = class90.field1454;
            var8 = class159.field2698;
        }
        class191 var9 = class167.method1123(-4636, 0);
        class191 var10 = class167.method1123(-4636, 0);
        for (int var11 = 0; var11 < arg0; var11++) {
            var10.method1326((byte) -9, class92.method563(-57, (int) (arg3 % 10L)));
            arg3 /= 10L;
        }
        int var12 = 0;
        if (arg3 == 0L) {
            var9 = class51.field924;
        }
        while (arg3 > 0L) {
            if (arg2 && var12 != 0 && var12 % 3 == 0) {
                var9.method1326((byte) -9, var8);
            }
            var9.method1326((byte) -9, class92.method563(-70, (int) (arg3 % 10L)));
            var12++;
            arg3 /= 10L;
        }
        if (var10.method1304(63) > 0) {
            var10.method1326((byte) -9, var7);
        }
        return class228.method1629(new class191[] { var6, var9.method1333((byte) 32), var10.method1333((byte) 32) }, (byte) -85);
    }
}
