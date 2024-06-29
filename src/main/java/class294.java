import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class294 extends class179 {

    @OriginalMember(owner = "client!tg", name = "u", descriptor = "I")
    public int field4359 = 0;

    @OriginalMember(owner = "client!tg", name = "s", descriptor = "I")
    public int field4357 = 12800;

    @OriginalMember(owner = "client!tg", name = "B", descriptor = "Z")
    public boolean field4366 = true;

    @OriginalMember(owner = "client!tg", name = "F", descriptor = "I")
    public int field4370 = 12800;

    @OriginalMember(owner = "client!tg", name = "O", descriptor = "I")
    public int field4379 = -1;

    @OriginalMember(owner = "client!tg", name = "M", descriptor = "I")
    public int field4377 = -1;

    @OriginalMember(owner = "client!tg", name = "C", descriptor = "I")
    public int field4367 = 0;

    @OriginalMember(owner = "client!tg", name = "v", descriptor = "Ljava/lang/String;")
    public String field4360;

    @OriginalMember(owner = "client!tg", name = "A", descriptor = "I")
    public int field4365;

    @OriginalMember(owner = "client!tg", name = "w", descriptor = "I")
    public int field4361;

    @OriginalMember(owner = "client!tg", name = "z", descriptor = "Ljava/lang/String;")
    public String field4364;

    @OriginalMember(owner = "client!tg", name = "E", descriptor = "Lvq;")
    public class22 field4369;

    @OriginalMember(owner = "client!tg", name = "t", descriptor = "I")
    public static int field4358;

    @OriginalMember(owner = "client!tg", name = "x", descriptor = "I")
    public static int field4362;

    @OriginalMember(owner = "client!tg", name = "y", descriptor = "I")
    public static int field4363;

    @OriginalMember(owner = "client!tg", name = "D", descriptor = "I")
    public static int field4368;

    @OriginalMember(owner = "client!tg", name = "G", descriptor = "I")
    public static int field4371;

    @OriginalMember(owner = "client!tg", name = "H", descriptor = "I")
    public static int field4372;

    @OriginalMember(owner = "client!tg", name = "I", descriptor = "I")
    public static int field4373;

    @OriginalMember(owner = "client!tg", name = "J", descriptor = "I")
    public static int field4374;

    @OriginalMember(owner = "client!tg", name = "K", descriptor = "I")
    public static int field4375;

    @OriginalMember(owner = "client!tg", name = "L", descriptor = "I")
    public static int field4376;

    @OriginalMember(owner = "client!tg", name = "N", descriptor = "I")
    public static int field4378;

    @OriginalMember(owner = "client!tg", name = "P", descriptor = "I")
    public static int field4380;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "([[IZILja;I)V", line = 6)
    public static final void method2051(int[][] arg0, boolean arg1, int arg2, class90 arg3, int arg4) {
        field4372++;
        for (int var5 = arg4; var5 < arg2; var5++) {
            int[][] var6;
            if (arg0 == null) {
                var6 = null;
            } else {
                var6 = new int[class183.field2703 + 1][class66.field1056 + 1];
                for (int var7 = 0; var7 <= class66.field1056; var7++) {
                    for (int var8 = 0; var8 <= class183.field2703; var8++) {
                        var6[var8][var7] = class275.field4146[var5][var8][var7] - arg0[var8][var7];
                    }
                }
            }
            int var9 = 0;
            int var10 = 0;
            if (!arg1) {
                if (class169.field2515) {
                    var9 |= 0x2;
                }
                if (class303.field4424) {
                    var10 |= 0x8;
                }
                if (class238.field3438 != 0) {
                    if (var5 == 0 || class75.field1288 >= 96) {
                        var10 |= 0x10;
                    }
                    var9 |= 0x1;
                }
            }
            if (class169.field2515) {
                var10 |= 0x7;
            }
            class126 var11 = arg3.method727(class183.field2703, class66.field1056, class275.field4146[var5], var6, 128, var9, var10);
            class76.method601(var5, var11);
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(BIII)V", line = 80)
    public static final void method2052(byte arg0, int arg1, int arg2, int arg3) {
        int var4 = -123 % ((-arg0 - 45) / 56);
        field4380++;
        if (arg3 == 1012) {
            class216.method1639(10, arg2, arg1);
        } else if (arg3 == 1009) {
            class216.method1639(11, arg2, arg1);
        } else if (arg3 == 1011) {
            class216.method1639(12, arg2, arg1);
        } else if (arg3 == 1007) {
            class216.method1639(13, arg2, arg1);
            return;
        } else if (arg3 == 1006) {
            class216.method1639(14, arg2, arg1);
            return;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(III[I)Z", line = 109)
    public final boolean method2053(int arg0, int arg1, int arg2, int[] arg3) {
        field4363++;
        if (arg2 != 16559) {
            this.field4364 = null;
        }
        for (class371 var5 = (class371) this.field4369.method157((byte) -125); var5 != null; var5 = (class371) this.field4369.method145(-101)) {
            if (var5.method2359((byte) 117, arg1, arg0)) {
                var5.method2361(arg0, arg1, arg3, -10793);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(I[IBI)Z", line = 135)
    public final boolean method2054(int arg0, int[] arg1, byte arg2, int arg3) {
        field4374++;
        int var5 = 39 % ((arg2 + 50) / 61);
        for (class371 var6 = (class371) this.field4369.method157((byte) -125); var6 != null; var6 = (class371) this.field4369.method145(-118)) {
            if (var6.method2354(2, arg0, arg3)) {
                var6.method2352(arg1, arg3, arg0, -124);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIIILja;I)V", line = 159)
    public static final void method2055(int arg0, int arg1, int arg2, int arg3, class90 arg4, int arg5) {
        field4371++;
        arg4.method752(arg3, arg1, arg3 + arg0, arg1 + arg5);
        arg4.method736(arg5, (byte) -40, -16777216, arg0, arg3, arg1);
        if (class358.field5117 < 100) {
            return;
        }
        float var6 = (float) class272.field4093 / (float) class272.field4099;
        int var7 = arg0;
        int var8 = arg5;
        if ((var6 < 1.0F)) {
            var8 = (int) ((float) arg0 * var6);
        } else {
            var7 = (int) ((float) arg5 / var6);
        }
        int var9 = (arg5 - var8) / 2 + arg1;
        int var10 = (arg0 - var7) / 2 + arg3;
        if (class119.field1865 == null || arg0 != class119.field1865.method1469() || arg5 != class119.field1865.method1467()) {
            class272.method1937(class272.field4096, class272.field4093 + class272.field4088, class272.field4099 + class272.field4096, class272.field4088, var10, var9, var7 + var10, var8 + var9);
            class272.method1939(arg4);
            class119.field1865 = arg4.method686(var10, var9, var7, var8, false);
        }
        class119.field1865.method2645(var10, var9);
        int var11 = class51.field820 * var7 / class272.field4099;
        int var12 = class441.field6407 * var8 / class272.field4093;
        int var13 = class413.field6000 * var7 / class272.field4099 + var10;
        int var14 = var9 + var8 - (class354.field5036 * var8 / class272.field4093) - var12;
        int var15 = -1996554240;
        if (class336.field4809 == 1) {
            var15 = -1996488705;
        }
        arg4.method681(var13, var14, var11, var12, var15, 1);
        arg4.method711(var13, var14, var11, var12, var15, 0);
        if (class351.field4992 > 0) {
            int var16;
            if (class319.field4609 <= 50) {
                var16 = class319.field4609 * 5;
            } else {
                var16 = 500 - (class319.field4609 * 5);
            }
            for (class198 var17 = (class198) class272.field4075.method157((byte) -125); var17 != null; var17 = (class198) class272.field4075.method145(-111)) {
                class242 var18 = class1.method3(var17.field2883, 36);
                if (class161.method1259(var18, 10418)) {
                    if (class218.field3234 == var17.field2883) {
                        int var19 = var17.field2896 * var7 / class272.field4099 + var10;
                        int var20 = (class272.field4093 - var17.field2900) * var8 / class272.field4093 + var9;
                        arg4.method736(4, (byte) -40, var16 << 24 | 0xFFFF00, 4, var19 - 2, var20 + -2);
                    } else if (class333.field4785 != -1 && class333.field4785 == var18.field3528) {
                        int var21 = var17.field2896 * var7 / class272.field4099 + var10;
                        int var22 = (class272.field4093 - var17.field2900) * var8 / class272.field4093 + var9;
                        arg4.method736(4, (byte) -40, var16 << 24 | 0xFFFF00, 4, var21 - 2, var22 - 2);
                    }
                }
            }
        }
        if (arg2 > -76) {
            field4362 = -18;
        }
    }

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZI)V", line = 592)
    public class294(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6) {
        this.field4360 = arg1;
        this.field4377 = arg4;
        this.field4379 = arg6;
        this.field4365 = arg0;
        this.field4361 = arg3;
        this.field4364 = arg2;
        this.field4366 = arg5;
        if (this.field4379 == 255) {
            this.field4379 = 0;
        }
        this.field4369 = new class22();
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIIIIII)V", line = 268)
    public static final void method2056(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4378++;
        if (class185.field2727 <= arg1 - arg5 && arg1 + arg5 <= class278.field4184 && class308.field4507 <= (arg4 - arg5) && (arg4 + arg5) <= class383.field5497) {
            class91.method774(arg6 + 1996488783, arg1, arg3, arg0, arg4, arg2, arg5);
        } else {
            class209.method1578(arg2, arg5, arg0, 2, arg3, arg4, arg1);
        }
        if (arg6 != -1996488705) {
            method2051((int[][]) null, true, 0, (class90) null, -128);
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lja;IILpo;III[[[B[I[I[I[I[IIBIIZ)V", line = 286)
    public static final void method2057(class90 arg0, int arg1, int arg2, class202 arg3, int arg4, int arg5, int arg6, byte[][][] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, byte arg14, int arg15, int arg16, boolean arg17) {
        class73.field1222 = arg0;
        class373.field5291 = arg1;
        class230.field3370 = arg3;
        class236.field3404 = class73.field1222.method757() > 0;
        class415.field6013 = arg4 >> 7;
        class71.field1203 = arg6 >> 7;
        class113.field1817 = arg4;
        class389.field5579 = arg6;
        class45.field691 = arg5;
        class175.field2608 = class415.field6013 - class46.field755;
        if (class175.field2608 < 0) {
            class153.field2326 = -class175.field2608;
            class175.field2608 = 0;
        } else {
            class153.field2326 = 0;
        }
        class373.field5306 = class71.field1203 - class46.field755;
        if (class373.field5306 < 0) {
            class236.field3403 = -class373.field5306;
            class373.field5306 = 0;
        } else {
            class236.field3403 = 0;
        }
        class34.field491 = class46.field755 + class415.field6013;
        if (class34.field491 > class139.field2209) {
            class34.field491 = class139.field2209;
        }
        class187.field2778 = class71.field1203 + class46.field755;
        if (class187.field2778 > class436.field6353) {
            class187.field2778 = class436.field6353;
        }
        for (int var18 = 0; var18 < class46.field755 + class46.field755 + 2; var18++) {
            for (int var23 = 0; var23 < class46.field755 + class46.field755 + 2; var23++) {
                int var24 = class415.field6013 + var18 - class46.field755;
                int var25 = class71.field1203 + var23 - class46.field755;
                if (var24 >= 0 && var25 >= 0 && var24 < class139.field2209 && var25 < class436.field6353) {
                    int var26 = var24 << 7;
                    int var27 = var25 << 7;
                    int var28 = class311.field4527[3].method794(var24, var25) - 1000;
                    int var29 = class18.field262 == null ? class311.field4527[0].method794(var24, var25) + 128 : class18.field262[0].method794(var24, var25) + 128;
                    class15.field229[var18][var23] = class73.field1222.method691(var26, var28, var27, var26, var29, var27);
                } else {
                    class15.field229[var18][var23] = false;
                }
            }
        }
        for (int var19 = 0; var19 < class46.field755 + class46.field755 + 1; var19++) {
            for (int var22 = 0; var22 < class46.field755 + class46.field755 + 1; var22++) {
                class207.field3035[var19][var22] = class15.field229[var19][var22] || class15.field229[var19 + 1][var22] || class15.field229[var19][var22 + 1] || class15.field229[var19 + 1][var22 + 1];
            }
        }
        class376.field5327 = arg8;
        class75.field1289 = arg9;
        class40.field615 = arg10;
        class119.field1856 = arg11;
        class383.field5471 = arg12;
        class37.method299();
        class446.method2793(0);
        for (class69 var20 = (class69) class58.field937.method2496(97); var20 != null; var20 = (class69) class58.field937.method2487(0)) {
            var20.method2731((byte) 96);
            class257.method1854(var20, (byte) 114);
        }
        if (class236.field3404) {
            for (int var21 = 0; var21 < class336.field4811; var21++) {
                class115.field1834[var21].method2639(arg1, (byte) 76, arg17);
            }
        }
        if (arg2 > 1) {
            class73.field1222.method701(0);
            if (class432.field6229 == null || class432.field6229 instanceof class193) {
                class432.field6229 = new class61();
            }
        } else if (class432.field6229 == null || class432.field6229 instanceof class61) {
            class432.field6229 = new class193();
        }
        class432.field6229.method473(arg2, (byte) -66);
        class432.field6229.method466(-128);
        if (class265.field3980 != null) {
            class379.method2403(true);
            class432.field6229.method464(3797, 22);
            class107.method946(arg2, (byte[][][]) null, 0, (byte) 0, arg15, arg16);
            class432.field6229.method466(-61);
            class432.field6229.method464(3797, 23);
            class379.method2403(false);
        }
        class107.method946(arg2, arg7, arg13, arg14, arg15, arg16);
        class432.field6229.method466(117);
        class432.field6229.method467(-100);
        class432.field6229.method466(104);
        if (arg2 > 1) {
            class73.field1222.method758(0);
        }
        class73.field1222.method755(0, (class59[]) null);
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IZ)V", line = 441)
    public static final void method2058(int arg0, boolean arg1) {
        class44.field659 = -1;
        field4373++;
        class198.field2895 = false;
        class242.field3527 = null;
        class439.field6387 = 1;
        class267.field4004 = 0;
        class122.field1920 = -1;
        if (!arg1) {
            field4362 = -79;
        }
        class198.field2891 = arg0;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIZ)Z", line = 461)
    public final boolean method2059(int arg0, int arg1, boolean arg2) {
        field4376++;
        if (arg2) {
            return true;
        }
        for (class371 var4 = (class371) this.field4369.method157((byte) -125); var4 != null; var4 = (class371) this.field4369.method145(-106)) {
            if (var4.method2359((byte) 117, arg0, arg1)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(ZI)Z", line = 493)
    public static final boolean method2060(boolean arg0, int arg1) {
        if (arg0) {
            field4362 = 63;
        }
        class123.field1948 = true;
        field4375++;
        class51.field826 = arg1 + 1 & 0xFFFF;
        return true;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IBII[I)Z", line = 513)
    public final boolean method2061(int arg0, byte arg1, int arg2, int arg3, int[] arg4) {
        if (arg1 < 39) {
            this.field4361 = -78;
        }
        field4368++;
        for (class371 var6 = (class371) this.field4369.method157((byte) -125); var6 != null; var6 = (class371) this.field4369.method145(33)) {
            if (var6.method2355(arg0, arg3, (byte) -119, arg2)) {
                var6.method2361(arg0, arg3, arg4, -10793);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "(I)V", line = 560)
    public final void method2062(int arg0) {
        this.field4367 = 0;
        this.field4357 = arg0;
        this.field4359 = 0;
        field4358++;
        this.field4370 = 12800;
        for (class371 var2 = (class371) this.field4369.method157((byte) -125); var2 != null; var2 = (class371) this.field4369.method145(57)) {
            if (this.field4370 > var2.field5265) {
                this.field4370 = var2.field5265;
            }
            if (var2.field5259 > this.field4359) {
                this.field4359 = var2.field5259;
            }
            if (var2.field5264 > this.field4367) {
                this.field4367 = var2.field5264;
            }
            if (var2.field5258 < this.field4357) {
                this.field4357 = var2.field5258;
            }
        }
    }
}
