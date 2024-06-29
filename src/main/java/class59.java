import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class59 {

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "I")
    public static int field796 = 0;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "I")
    public static int field795;

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "I")
    public static int field797;

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "I")
    public static int field798;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(I)V")
    public static final void method451(int arg0) {
        field797++;
        if (class120.field1610 == 10 || class120.field1610 == 28) {
            class281.method1901(class298.field4343 >> 10, class345.field5077 >> 10, 91, 5000);
        } else if (class187.field2619.field4954 >= 0 && class187.field2619.field4954 < (class195.field2745 * 128) && class187.field2619.field4951 >= 0 && class78.field984 * 128 > class187.field2619.field4951) {
            class281.method1901(class187.field2619.field793[0] >> 3, class187.field2619.field784[0] >> 3, 58, 5000);
        } else {
            class281.method1901(class195.field2745 >> 4, class78.field984 >> 4, 123, 5000);
        }
        if (arg0 == 5000) {
            class171.method1109((byte) -102);
            class152.method1040(0);
            class29.method296(false);
            class38.method343((byte) 52);
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(ZLjava/lang/String;ZIZILjava/lang/String;IIIJ)V")
    public static final void method452(boolean arg0, String arg1, boolean arg2, int arg3, boolean arg4, int arg5, String arg6, int arg7, int arg8, int arg9, long arg10) {
        field795++;
        int[] var12 = new int[4];
        for (int var13 = 0; var13 < 3; var13++) {
            var12[var13] = (int) (Math.random() * 9.9999999E7D);
        }
        if (arg5 > -95) {
            return;
        }
        class256 var14 = new class256(128);
        var14.method1727(-128, 10);
        var14.method1750((byte) 0, (arg2 ? 4 : 0) | (arg4 ? 2 : 0) | (arg0 ? 1 : 0));
        var14.method1730(arg10, false);
        var14.method1721(25153, var12[0]);
        var14.method1712(arg1, 114);
        var14.method1721(25153, var12[1]);
        var14.method1750((byte) 0, class22.field320);
        var14.method1727(-128, arg7);
        var14.method1727(-128, arg9);
        var14.method1721(25153, var12[2]);
        var14.method1750((byte) 0, arg8);
        var14.method1750((byte) 0, arg3);
        var14.method1721(25153, var12[3]);
        var14.method1713(121, class402.field5802, class62.field824);
        class256 var15 = new class256(350);
        var15.method1712(arg6, -96);
        int var16 = 8 - (class248.method1646(arg6, (byte) -84) % 8);
        for (int var17 = 0; var17 < var16; var17++) {
            var15.method1727(-128, (int) (Math.random() * 255.0D));
        }
        var15.method1742(var12, -2);
        class159.field2132.field3762 = 0;
        class159.field2132.method1727(-128, class33.field467.field892);
        class159.field2132.method1750((byte) 0, var14.field3762 + var15.field3762 + 2);
        class159.field2132.method1750((byte) 0, 571);
        class159.field2132.method1739(var14.field3762, 0, var14.field3764, (byte) 47);
        class159.field2132.method1739(var15.field3762, 0, var15.field3764, (byte) 111);
        class257.field3807 = 0;
        class244.field3616 = -3;
        class22.field310 = 1;
        class263.field3899 = 0;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(ZLfp;Lic;)V")
    public static final void method453(boolean arg0, class9 arg1, class235 arg2) {
        field798++;
        if (class66.field848 == null) {
            return;
        }
        if (class41.field549 < 10) {
            if (!class66.field849.method736(7000, class66.field848.field3543)) {
                class41.field549 = class82.field1013.method739(class66.field848.field3543, true) / 10;
                return;
            }
            class250.method1657(4);
            class41.field549 = 10;
        }
        if (class41.field549 == 10) {
            class66.field860 = class66.field848.field3550 >> 6 << 6;
            class66.field870 = class66.field848.field3557 >> 6 << 6;
            class66.field872 = (class66.field848.field3555 >> 6 << 6) + 64 - class66.field860;
            class66.field877 = (class66.field848.field3547 >> 6 << 6) + 64 - class66.field870;
            int[] var3 = new int[3];
            int var4 = -1;
            int var5 = -1;
            if (class66.field848.method1610((byte) -127, class134.field1846 + (class187.field2619.field4951 >> 7), class187.field2619.field4960, var3, (class187.field2619.field4954 >> 7) + class28.field399)) {
                var4 = var3[1] - class66.field870;
                var5 = var3[2] - class66.field860;
            }
            if (!class299.field4350 && var4 >= 0 && class66.field877 > var4 && var5 >= 0 && class66.field872 > var5) {
                int var6 = var5 + ((int) (Math.random() * 10.0D) - 5);
                int var7 = var4 + ((int) (Math.random() * 10.0D) - 5);
                class344.field5064 = var7;
                class134.field1843 = var6;
            } else if (class238.field3537 == -1 || class450.field6564 == -1) {
                class66.field848.method1607(4006, class66.field848.field3552 >> 14 & 0x3FFF, class66.field848.field3552 & 0x3FFF, var3);
                class134.field1843 = var3[2] - class66.field860;
                class344.field5064 = var3[1] - class66.field870;
            } else {
                class66.field848.method1607(4006, class238.field3537, class450.field6564, var3);
                if (var3 != null) {
                    class134.field1843 = var3[2] - class66.field860;
                    class344.field5064 = var3[1] - class66.field870;
                }
                class299.field4350 = false;
                class450.field6564 = -1;
                class238.field3537 = -1;
            }
            if (class66.field848.field3556 == 37) {
                class66.field853 = 3.0F;
                class66.field851 = 3.0F;
            } else if (class66.field848.field3556 == 50) {
                class66.field853 = 4.0F;
                class66.field851 = 4.0F;
            } else if (class66.field848.field3556 == 75) {
                class66.field853 = 6.0F;
                class66.field851 = 6.0F;
            } else if (class66.field848.field3556 == 100) {
                class66.field853 = 8.0F;
                class66.field851 = 8.0F;
            } else if (class66.field848.field3556 == 200) {
                class66.field853 = 16.0F;
                class66.field851 = 16.0F;
            } else {
                class66.field853 = 8.0F;
                class66.field851 = 8.0F;
            }
            class66.field858 = (int) class66.field853 >> 1;
            class66.field852 = class86.method582((byte) -39, class66.field858);
            class132.method884(-1);
            class66.method495();
            class223.field3243 = new class395();
            class66.field856 += (int) (Math.random() * 5.0D) - 2;
            if (class66.field856 < -8) {
                class66.field856 = -8;
            }
            if (class66.field856 > 8) {
                class66.field856 = 8;
            }
            class66.field854 += (int) (Math.random() * 5.0D) - 2;
            if (class66.field854 < -16) {
                class66.field854 = -16;
            }
            if (class66.field854 > 16) {
                class66.field854 = 16;
            }
            class66.method484(arg2, class66.field856 >> 2 << 10, class66.field854 >> 1);
            class282.method1903((byte) 99, 256, 1024);
            class404.method2519((byte) 121, 256, 256);
            class69.method508(4096, (byte) -13);
            class339.method2189(256, -109);
            class41.field549 = 20;
        } else if (class41.field549 == 20) {
            class272.method1859(0, true);
            class66.method489(arg1, class66.field856, class66.field854);
            class41.field549 = 60;
            class272.method1859(0, true);
            class419.method2591((byte) 9);
        } else if (class41.field549 == 60) {
            if (class66.field849.method735(-1, class66.field848.field3543 + "_staticelements")) {
                if (!class66.field849.method736(7000, class66.field848.field3543 + "_staticelements")) {
                    return;
                }
                class66.field859 = class446.method2742(class66.field849, class33.field472, false, class66.field848.field3543 + "_staticelements");
            } else {
                class66.field859 = new class86(0);
            }
            class66.method491();
            class41.field549 = 70;
            class272.method1859(0, true);
            class419.method2591((byte) -70);
        } else if (class41.field549 == 70) {
            class223.field3296 = new class297(arg1, 11, true, class270.field4004);
            class41.field549 = 73;
            class272.method1859(0, true);
            class419.method2591((byte) -69);
        } else if (class41.field549 == 73) {
            class47.field618 = new class297(arg1, 12, true, class270.field4004);
            class41.field549 = 76;
            class272.method1859(0, true);
            class419.method2591((byte) 116);
        } else if (class41.field549 == 76) {
            class47.field617 = new class297(arg1, 14, true, class270.field4004);
            class41.field549 = 79;
            class272.method1859(0, true);
            class419.method2591((byte) -28);
        } else if (class41.field549 == 79) {
            class71.field932 = new class297(arg1, 17, true, class270.field4004);
            class41.field549 = 82;
            class272.method1859(0, true);
            class419.method2591((byte) 120);
        } else if (class41.field549 == 82) {
            class37.field520 = new class297(arg1, 19, true, class270.field4004);
            class41.field549 = 85;
            class272.method1859(0, true);
            class419.method2591((byte) 11);
        } else if (class41.field549 == 85) {
            class150.field2032 = new class297(arg1, 22, true, class270.field4004);
            class41.field549 = 88;
            class272.method1859(0, true);
            class419.method2591((byte) 112);
        } else if (class41.field549 == 88) {
            class307.field4538 = new class297(arg1, 26, true, class270.field4004);
            class41.field549 = 91;
            class272.method1859(0, true);
            class419.method2591((byte) -61);
        } else {
            class241.field3579 = new class297(arg1, 30, arg0, class270.field4004);
            class41.field549 = 100;
            class272.method1859(0, true);
            class419.method2591((byte) 124);
            System.gc();
        }
    }
}
