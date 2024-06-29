import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class136 extends class242 {

    @OriginalMember(owner = "client!mh", name = "t", descriptor = "[I")
    public static int[] field2371 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0 };

    @OriginalMember(owner = "client!mh", name = "v", descriptor = "Ljf;")
    public static class229 field2373 = class212.method1457((byte) 80, "scape main");

    @OriginalMember(owner = "client!mh", name = "w", descriptor = "Z")
    public static boolean field2374 = false;

    @OriginalMember(owner = "client!mh", name = "x", descriptor = "B")
    public byte field2375;

    @OriginalMember(owner = "client!mh", name = "p", descriptor = "I")
    public static int field2367;

    @OriginalMember(owner = "client!mh", name = "q", descriptor = "I")
    public static int field2368;

    @OriginalMember(owner = "client!mh", name = "r", descriptor = "I")
    public int field2369;

    @OriginalMember(owner = "client!mh", name = "u", descriptor = "I")
    public static int field2372;

    @OriginalMember(owner = "client!mh", name = "o", descriptor = "Ljf;")
    public class229 field2366;

    @OriginalMember(owner = "client!mh", name = "s", descriptor = "Ljf;")
    public class229 field2370;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIIIIZII)V", line = 10)
    public static final void method930(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        field2372++;
        int var8 = arg6 + arg7;
        int var9 = arg1 - arg7;
        int var10 = arg3 + arg7;
        int var11 = arg2 - arg7;
        for (int var12 = arg6; var12 < var8; var12++) {
            class34.method306(arg3, class173.field3021[var12], (byte) 118, arg2, arg4);
        }
        if (!arg5) {
            method930(52, 30, -8, -125, 67, false, -62, -54);
        }
        for (int var13 = arg1; var13 > var9; var13--) {
            class34.method306(arg3, class173.field3021[var13], (byte) 124, arg2, arg4);
        }
        for (int var14 = var8; var14 <= var9; var14++) {
            int[] var15 = class173.field3021[var14];
            class34.method306(arg3, var15, (byte) 112, var10, arg4);
            class34.method306(var10, var15, (byte) 123, var11, arg0);
            class34.method306(var11, var15, (byte) 124, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIIII[[[B[I[I[I[I[IIBII)V", line = 54)
    public static final void method931(int arg0, int arg1, int arg2, int arg3, int arg4, byte[][][] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int arg11, byte arg12, int arg13, int arg14) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= class170.field2971 * 128) {
            arg0 = class170.field2971 * 128 - 1;
        }
        if (arg2 < 0) {
            arg2 = 0;
        } else if (arg2 >= class10.field119 * 128) {
            arg2 = class10.field119 * 128 - 1;
        }
        class199.field3486 = class227.field3896[arg3];
        class174.field3038 = class227.field3911[arg3];
        class211.field3626 = class227.field3896[arg4];
        class150.field2604 = class227.field3911[arg4];
        class331.field5639 = arg0;
        class42.field754 = arg1;
        class61.field1045 = arg2;
        class325.field5481 = arg0 / 128;
        class243.field4316 = arg2 / 128;
        class211.field3631 = class325.field5481 - class281.field4799;
        if (class211.field3631 < 0) {
            class211.field3631 = 0;
        }
        class5.field49 = class243.field4316 - class281.field4799;
        if (class5.field49 < 0) {
            class5.field49 = 0;
        }
        class167.field2867 = class325.field5481 + class281.field4799;
        if (class167.field2867 > class170.field2971) {
            class167.field2867 = class170.field2971;
        }
        class137.field2380 = class281.field4799 + class243.field4316;
        if (class137.field2380 > class10.field119) {
            class137.field2380 = class10.field119;
        }
        short var15;
        if (class108.field1900) {
            var15 = 3584;
        } else {
            var15 = 3500;
        }
        for (int var16 = 0; var16 < class281.field4799 + class281.field4799 + 2; var16++) {
            for (int var17 = 0; var17 < class281.field4799 + class281.field4799 + 2; var17++) {
                int var18 = (var16 - class281.field4799 << 7) - (class331.field5639 & 0x7F);
                int var19 = (var17 - class281.field4799 << 7) - (class61.field1045 & 0x7F);
                int var20 = class325.field5481 + var16 - class281.field4799;
                int var21 = class243.field4316 + var17 - class281.field4799;
                if (var20 >= 0 && var21 >= 0 && var20 < class170.field2971 && var21 < class10.field119) {
                    int var22;
                    if (class242.field4270 == null) {
                        var22 = class16.field256[0][var20][var21] + 128 - class42.field754;
                    } else {
                        var22 = class242.field4270[0][var20][var21] + 128 - class42.field754;
                    }
                    int var23 = class16.field256[3][var20][var21] - class42.field754 - 1000;
                    class122.field2161[var16][var17] = class298.method2054(var18, var23, var22, var19, var15);
                } else {
                    class122.field2161[var16][var17] = false;
                }
            }
        }
        for (int var24 = 0; var24 < class281.field4799 + class281.field4799 + 1; var24++) {
            for (int var25 = 0; var25 < class281.field4799 + class281.field4799 + 1; var25++) {
                class160.field2712[var24][var25] = class122.field2161[var24][var25] || class122.field2161[var24 + 1][var25] || class122.field2161[var24][var25 + 1] || class122.field2161[var24 + 1][var25 + 1];
            }
        }
        class206.field3602 = arg6;
        class51.field893 = arg7;
        class242.field4271 = arg8;
        class30.field529 = arg9;
        class290.field4954 = arg10;
        class293.method2035();
        if (class74.field1401 != null) {
            class293.method2034(true);
            class306.method2089(arg0, arg1, arg2, (byte[][][]) null, 0, (byte) 0, arg13, arg14);
            if (class108.field1900) {
                class25.field460 = false;
                class257.method1832((byte) 41, 0, 0);
                class276.method1938((float[]) null);
                class216.method1481();
            }
            class293.method2034(false);
        }
        class306.method2089(arg0, arg1, arg2, arg5, arg11, arg12, arg13, arg14);
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(I)V", line = 184)
    public static final void method932(int arg0) {
        field2367++;
        if (arg0 != 20333) {
            return;
        }
        while (class171.field2972.method1400(arg0 - 20419, class51.field902) >= 11) {
            int var1 = class171.field2972.method1396(11, 101);
            if (var1 == 2047) {
                break;
            }
            boolean var2 = false;
            if (class192.field3334[var1] == null) {
                var2 = true;
                class192.field3334[var1] = new class33();
                if (class69.field1320[var1] != null) {
                    class192.field3334[var1].method305(class69.field1320[var1], arg0 ^ 0x4F4D);
                }
            }
            class90.field1652[class132.field2323++] = var1;
            class33 var3 = class192.field3334[var1];
            var3.field1962 = class199.field3475;
            int var4 = class171.field2972.method1396(5, 33);
            if (var4 > 15) {
                var4 -= 32;
            }
            int var5 = class171.field2972.method1396(1, arg0 ^ 0xFFFFB092);
            int var6 = class171.field2972.method1396(1, 20);
            if (var6 == 1) {
                class201.field3529[class100.field1762++] = var1;
            }
            int var7 = class171.field2972.method1396(5, -126);
            int var8 = class329.field5584[class171.field2972.method1396(3, -125)];
            if (var7 > 15) {
                var7 -= 32;
            }
            if (var2) {
                var3.field1964 = var3.field1987 = var8;
            }
            var3.method301(var5 == 1, class301.field5124.field2017[0] + var7, false, class301.field5124.field2018[0] + var4);
        }
        class171.field2972.method1401(7);
    }

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "(I)V", line = 271)
    public static void method933(int arg0) {
        field2371 = null;
        if (arg0 != 3460) {
            field2374 = true;
        }
        field2373 = null;
    }
}
