import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mt")
public class class401 extends class656 {

    @OriginalMember(owner = "client!mt", name = "o", descriptor = "I")
    public int field5599;

    @OriginalMember(owner = "client!mt", name = "m", descriptor = "I")
    public int field5597;

    @OriginalMember(owner = "client!mt", name = "j", descriptor = "I")
    public static int field5594 = 0;

    @OriginalMember(owner = "client!mt", name = "k", descriptor = "[I")
    public static int[] field5595 = new int[8];

    @OriginalMember(owner = "client!mt", name = "i", descriptor = "I")
    public static int field5593;

    @OriginalMember(owner = "client!mt", name = "n", descriptor = "I")
    public static int field5598;

    @OriginalMember(owner = "client!mt", name = "p", descriptor = "I")
    public static int field5600;

    @OriginalMember(owner = "client!mt", name = "l", descriptor = "Ljava/lang/Thread;")
    public static Thread field5596;

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(BI)Ljava/lang/String;")
    public static final String method2360(byte arg0, int arg1) {
        field5600++;
        int var2 = -10 % ((40 - arg0) / 45);
        return (arg1 >> 24 & 0xFF) + "." + ((arg1 & 0xFF446B) >> 16) + "." + (arg1 >> 8 & 0xFF) + "." + (arg1 & 0xFF);
    }

    @OriginalMember(owner = "client!mt", name = "b", descriptor = "(BI)V")
    public static final void method2361(byte arg0, int arg1) {
        if (class411.field5711.field3872.method4126(true) == 0) {
            arg1 = -1;
        }
        field5598++;
        if (class379.field5281 == arg1 || arg0 != -108) {
            return;
        }
        if (arg1 != -1) {
            class622 var2 = class202.field3024.method2728(arg1, 33);
            class720 var3 = var2.method3423(false);
            if (var3 == null) {
                arg1 = -1;
            } else {
                class66.field828.method1318(class295.field4217, false, var3.method4041(), new Point(var2.field8288, var2.field8297), var3.method4043(), var3.method4035());
                class379.field5281 = arg1;
            }
        }
        if (arg1 == -1 && class379.field5281 != -1) {
            class66.field828.method1318(class295.field4217, false, -1, new Point(), -1, null);
            class379.field5281 = -1;
        }
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(Lkf;[Ltn;)V")
    public static final void method2362(class256 arg0, class87[] arg1) {
        if (class88.field1068) {
            int var2 = arg0.method1557(arg1, (byte) -58);
            class184.field2781.method460(var2, arg1);
        }
        if (class588.field7675 == class507.field6771) {
            boolean var3 = false;
            boolean var4 = false;
            int var5;
            int var6;
            if (arg0 instanceof class675) {
                var5 = ((class675) arg0).field9367;
                var6 = ((class675) arg0).field9354;
            } else {
                var5 = arg0.field3505 >> class140.field2224;
                var6 = arg0.field3502 >> class140.field2224;
            }
            class184.field2781.method502(class113.field1866[0].method1750((byte) 108, arg0.field3505, arg0.field3502), class733.method4104(var5, var6), class361.method2150(var5, var6), class163.method1173(var5, var6));
        }
        class733 var7 = arg0.method800(-1, class184.field2781);
        if (var7 == null) {
            return;
        }
        if (arg0.field3503) {
            class364[] var8 = var7.field10150;
            for (int var9 = 0; var9 < var8.length; var9++) {
                class364 var10 = var8[var9];
                if (var10.field5117) {
                    class62.method539(var10.field5120 + var10.field5119, var10.field5122 - var10.field5119, (byte) -87, var10.field5119 + var10.field5118, var10.field5121 - var10.field5119);
                }
            }
        }
        if (var7.field10149) {
            var7.field10152 = arg0;
            if (class260.field3627) {
                class689 var11 = class277.field3864;
                synchronized (class277.field3864) {
                    class277.field3864.method3875(0, var7);
                    return;
                }
            }
            class277.field3864.method3875(0, var7);
            return;
        }
        class500.method2819(var7, (byte) 31);
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(B)V")
    public static void method2363(byte arg0) {
        if (arg0 != 88) {
            field5594 = -65;
        }
        field5595 = null;
        field5596 = null;
    }

    @OriginalMember(owner = "client!mt", name = "c", descriptor = "(B)V")
    public static final void method2364(byte arg0) {
        field5593++;
        class460.method2612(-16777216, false);
        class74.field902 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < class547.field7235.length; var2++) {
            if (class466.field6415[var2] != -1 && class547.field7235[var2] == null) {
                class547.field7235[var2] = class265.field3699.method2218((byte) 122, class466.field6415[var2], 0);
                if (class547.field7235[var2] == null) {
                    var1 = false;
                    class74.field902++;
                }
            }
            if (class552.field7278[var2] != -1 && class687.field9583[var2] == null) {
                class687.field9583[var2] = class265.field3699.method2207(class236.field3318[var2], 0, class552.field7278[var2], class712.method4000(arg0, -107));
                if (class687.field9583[var2] == null) {
                    var1 = false;
                    class74.field902++;
                }
            }
            if (class76.field921[var2] != -1 && class136.field2171[var2] == null) {
                class136.field2171[var2] = class265.field3699.method2218((byte) 111, class76.field921[var2], 0);
                if (class136.field2171[var2] == null) {
                    class74.field902++;
                    var1 = false;
                }
            }
            if (class528.field7007[var2] != -1 && class543.field7180[var2] == null) {
                class543.field7180[var2] = class265.field3699.method2218((byte) 108, class528.field7007[var2], 0);
                if (class543.field7180[var2] == null) {
                    var1 = false;
                    class74.field902++;
                }
            }
            if (class1.field1 != null && class229.field3261[var2] == null && class1.field1[var2] != -1) {
                class229.field3261[var2] = class265.field3699.method2207(class236.field3318[var2], 0, class1.field1[var2], 2);
                if (class229.field3261[var2] == null) {
                    class74.field902++;
                    var1 = false;
                }
            }
        }
        if (class668.field9128 == null) {
            if (class681.field9515 == null || !class135.field2156.method2209(class681.field9515.field8500 + "_staticelements", false)) {
                class668.field9128 = new class362(0);
            } else if (class135.field2156.method2227(class681.field9515.field8500 + "_staticelements", true)) {
                class668.field9128 = class102.method763(class142.field2266, class135.field2156, 255, class681.field9515.field8500 + "_staticelements");
            } else {
                class74.field902++;
                var1 = false;
            }
        }
        if (!var1) {
            class582.field7631 = 1;
            return;
        }
        class613.field8162 = 0;
        boolean var3 = true;
        for (int var4 = 0; var4 < class547.field7235.length; var4++) {
            byte[] var21 = class687.field9583[var4];
            if (var21 != null) {
                int var22 = (class197.field2972[var4] >> 8) * 64 - class503.field6752;
                int var23 = (class197.field2972[var4] & 0xFF) * 64 - class334.field4757;
                if (class568.field7464 != 0) {
                    var22 = 10;
                    var23 = 10;
                }
                var3 &= class218.method1410(class719.field10004, var22, var23, var21, 77, class107.field1453);
            }
            byte[] var24 = class543.field7180[var4];
            if (var24 != null) {
                int var25 = (class197.field2972[var4] >> 8) * 64 - class503.field6752;
                int var26 = (class197.field2972[var4] & 0xFF) * 64 - class334.field4757;
                if (class568.field7464 != 0) {
                    var26 = 10;
                    var25 = 10;
                }
                var3 &= class218.method1410(class719.field10004, var25, var26, var24, 120, class107.field1453);
            }
        }
        if (!var3) {
            class582.field7631 = 2;
            return;
        }
        if (class582.field7631 != 0) {
            class88.method675(class180.field2728, class148.field2334, class341.field4807, (byte) -27, true, class517.field6852.method2877(class713.field9854, (byte) -108) + "<br>(100%)");
        }
        class651.method3552(arg0 ^ 0x652D);
        class1.method1(true);
        class259.method1575(20502);
        boolean var5 = false;
        if (class341.field4807.method449() && class411.field5711.field3915.method574(true) == 2) {
            for (int var6 = 0; var6 < class547.field7235.length; var6++) {
                if (class543.field7180[var6] != null || class136.field2171[var6] != null) {
                    var5 = true;
                    break;
                }
            }
        }
        if (arg0 != -105) {
            return;
        }
        int var7;
        if (class411.field5711.field3884.method2464(true) == 1) {
            var7 = class260.field3630[class709.field9835];
        } else {
            var7 = class714.field9859[class709.field9835];
        }
        if (class341.field4807.method426()) {
            var7++;
        }
        class405.method2377(class341.field4807, class79.field957, 9, 4, class719.field10004, class107.field1453, var7, var5, class341.field4807.method466() > 0);
        class31.method270(class308.field4432);
        if (class308.field4432 == 0) {
            class432.method2490(null);
        } else {
            class432.method2490(class275.field3832);
        }
        for (int var8 = 0; var8 < 4; var8++) {
            class456.field6226[var8].method3888((byte) 12);
        }
        class34.method285((byte) 8);
        class121.method977(false, (byte) -128);
        class490.method2781((byte) 41);
        class749.field10430 = null;
        class18.field237 = false;
        class651.method3552(-25926);
        System.gc();
        class460.method2612(-16777216, true);
        class80.method632((byte) 102);
        class261.field3633 = class411.field5711.field3897.method1057(true);
        class40.field546 = class365.field5128 >= 96;
        class111.field1632 = class411.field5711.field3915.method574(true) == 2;
        class323.field4589 = class411.field5711.field3902.method3070(true) == 1;
        client.field4374 = class411.field5711.field3890.method984(true) == 1 ? -1 : class489.field6638;
        class278.field3896 = class411.field5711.field3900.method1182(true) == 1;
        class528.field7004 = class411.field5711.field3868.method1851(true) == 1;
        class491.field6656 = new class385(4, class719.field10004, class107.field1453, false);
        if (class568.field7464 == 0) {
            class284.method1760(class491.field6656, class547.field7235, false);
        } else {
            class750.method4208(class491.field6656, (byte) 119, class547.field7235);
        }
        class520.method2887(class107.field1453 >> 4, -112, class719.field10004 >> 4);
        class464.method2629(102);
        if (var5) {
            class503.method2832(true);
            class524.field6960 = new class385(1, class719.field10004, class107.field1453, true);
            if (class568.field7464 == 0) {
                class284.method1760(class524.field6960, class136.field2171, false);
                class460.method2612(-16777216, true);
            } else {
                class750.method4208(class524.field6960, (byte) 65, class136.field2171);
                class460.method2612(arg0 ^ 0xFFFF97, true);
            }
            class524.field6960.method2525(class491.field6656.field6041[0], 0, (byte) -125);
            class524.field6960.method2516(-96, null, class341.field4807, null);
            class503.method2832(false);
        }
        class491.field6656.method2516(-106, var5 ? class524.field6960.field6041 : null, class341.field4807, class456.field6226);
        if (class568.field7464 == 0) {
            class460.method2612(-16777216, true);
            class208.method1390(class687.field9583, -110, class491.field6656);
            if (class229.field3261 != null) {
                class156.method1134((byte) 112);
            }
        } else {
            class460.method2612(arg0 ^ 0xFFFF97, true);
            class90.method686(class491.field6656, -101, class687.field9583);
        }
        class1.method1(true);
        if (class365.field5128 < 96) {
            class740.method4123((byte) 87);
        }
        class460.method2612(arg0 ^ 0xFFFF97, true);
        class491.field6656.method2526(null, (byte) -13, class341.field4807, var5 ? class588.field7675[0] : null);
        class491.field6656.method2277(false, (byte) 75, class341.field4807);
        class460.method2612(-16777216, true);
        if (var5) {
            class503.method2832(true);
            class460.method2612(arg0 ^ 0xFFFF97, true);
            if (class568.field7464 == 0) {
                class208.method1390(class543.field7180, arg0 - 7, class524.field6960);
            } else {
                class90.method686(class524.field6960, -105, class543.field7180);
            }
            class1.method1(true);
            class460.method2612(arg0 - 16777111, true);
            class524.field6960.method2526(class113.field1866[0], (byte) -86, class341.field4807, null);
            class524.field6960.method2277(true, (byte) 75, class341.field4807);
            class460.method2612(-16777216, true);
            class503.method2832(false);
        }
        class202.method1359(arg0 ^ 0xFFFFFF97);
        int var9 = class491.field6656.field5388;
        if (class507.field6775 < var9) {
            var9 = class507.field6775;
        }
        if (class507.field6775 - 1 > var9) {
            var9 = class507.field6775 - 1;
        }
        if (class411.field5711.field3890.method984(true) == 0) {
            class586.method3200(var9);
        } else {
            class586.method3200(0);
        }
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var19 = 0; var19 < class719.field10004; var19++) {
                for (int var20 = 0; var20 < class107.field1453; var20++) {
                    class709.method3985(var19, var10, var20, (byte) 28);
                }
            }
        }
        class393.method2322(-1);
        class651.method3552(-25926);
        class635.method3486(7951);
        class1.method1(true);
        class1.method8(-1);
        if (class218.field3143 != null && class209.field3089 != null && class15.field215 == 11) {
            class347.field4862++;
            class583 var11 = class381.method2246(arg0 ^ 0xFFFFFF96, class128.field2105, class247.field3432);
            var11.field7637.method3798(arg0 ^ 0xFFFF93B8, 1057001181);
            class42.method309(var11, arg0 + 105);
        }
        if (class568.field7464 == 0) {
            int var12 = (class161.field2401 - (class719.field10004 >> 4)) / 8;
            int var13 = ((class719.field10004 >> 4) + class161.field2401) / 8;
            int var14 = (class88.field1069 - (class107.field1453 >> 4)) / 8;
            int var15 = ((class107.field1453 >> 4) + class88.field1069) / 8;
            for (int var16 = var12 - 1; var16 <= (var13 + 1); var16++) {
                for (int var17 = var14 - 1; var17 <= (var15 + 1); var17++) {
                    if (var16 < var12 || var13 < var16 || var17 < var14 || var15 < var17) {
                        class265.field3699.method2219("m" + var16 + "_" + var17, 0);
                        class265.field3699.method2219("l" + var16 + "_" + var17, arg0 + 105);
                    }
                }
            }
        }
        if (class15.field215 == 4) {
            class66.method566(3, -21035);
        } else if (class15.field215 == 8) {
            class66.method566(7, -21035);
        } else {
            class66.method566(10, arg0 - 20930);
            if (class209.field3089 != null) {
                class583 var18 = class381.method2246(1, class128.field2105, class593.field7705);
                class42.method309(var18, 0);
            }
        }
        class178.method1233(true);
        class651.method3552(arg0 - 25821);
        class308.method1901(0);
        class302.field4291 = true;
        if (class394.field5494) {
            class710.method3991("Took: " + (class375.method2193(116) - class257.field3525) + "ms", (byte) 122);
            class394.field5494 = false;
        }
    }

    @OriginalMember(owner = "client!mt", name = "<init>", descriptor = "(II)V")
    public class401(int arg0, int arg1) {
        this.field5599 = arg1;
        this.field5597 = arg0;
    }
}
