import java.awt.Component;
import java.awt.Frame;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class61 {

    @OriginalMember(owner = "client!ka", name = "h", descriptor = "Lwb;")
    private static class130 field1572 = class26.method212("white:", -32376);

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "Lwb;")
    private static class130 field1568 = class26.method212("Account locked as we suspect it has been stolen)3", -32376);

    @OriginalMember(owner = "client!ka", name = "o", descriptor = "Lwb;")
    public static class130 field1579 = field1568;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "I")
    public static int field1565 = -1;

    @OriginalMember(owner = "client!ka", name = "l", descriptor = "Lwb;")
    public static class130 field1576 = field1572;

    @OriginalMember(owner = "client!ka", name = "n", descriptor = "I")
    public static int field1578 = 0;

    @OriginalMember(owner = "client!ka", name = "r", descriptor = "I")
    public static int field1582 = 0;

    @OriginalMember(owner = "client!ka", name = "s", descriptor = "I")
    public static int field1583 = 0;

    @OriginalMember(owner = "client!ka", name = "z", descriptor = "Lwb;")
    public static class130 field1590 = class26.method212("Benutzername: ", -32376);

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "I")
    public static int field1567;

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "I")
    public int field1569;

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "I")
    public int field1570;

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "I")
    public int field1571;

    @OriginalMember(owner = "client!ka", name = "i", descriptor = "I")
    public static int field1573;

    @OriginalMember(owner = "client!ka", name = "j", descriptor = "I")
    public int field1574;

    @OriginalMember(owner = "client!ka", name = "k", descriptor = "I")
    public static int field1575;

    @OriginalMember(owner = "client!ka", name = "p", descriptor = "I")
    public static int field1580;

    @OriginalMember(owner = "client!ka", name = "q", descriptor = "I")
    public static int field1581;

    @OriginalMember(owner = "client!ka", name = "t", descriptor = "I")
    public int field1584;

    @OriginalMember(owner = "client!ka", name = "v", descriptor = "I")
    public static int field1586;

    @OriginalMember(owner = "client!ka", name = "w", descriptor = "I")
    public static int field1587;

    @OriginalMember(owner = "client!ka", name = "y", descriptor = "Lda;")
    public static class20 field1589;

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "Ldc;")
    public class22 field1566;

    @OriginalMember(owner = "client!ka", name = "m", descriptor = "Ldc;")
    public class22 field1577;

    @OriginalMember(owner = "client!ka", name = "u", descriptor = "Ldc;")
    public class22 field1585;

    @OriginalMember(owner = "client!ka", name = "x", descriptor = "Ljava/awt/Frame;")
    public static Frame field1588;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(B)V", line = 6)
    public static final void method513(byte arg0) {
        field1580++;
        if (class8.field260 == 0) {
            class79.field1926 = new class34(4, 104, 104, class69.field1781);
            for (int var1 = 0; var1 < 4; var1++) {
                class99.field2404[var1] = new class121(104, 104);
            }
            class106.field2566 = new class28(512, 512);
            class41.field1164 = 5;
            class124.field2998 = class72.field1852;
            class8.field260 = 20;
        } else if (class8.field260 == 20) {
            int[] var2 = new int[9];
            for (int var3 = 0; var3 < 9; var3++) {
                int var4 = var3 * 32 + 143;
                int var5 = var4 * 3 + 600;
                int var6 = class12.field355[var4];
                var2[var3] = var5 * var6 >> 16;
            }
            class34.method307(var2, 500, 800, 512, 334);
            class41.field1164 = 10;
            class124.field2998 = class105.field2545;
            class8.field260 = 30;
        } else if (class8.field260 == 30) {
            class123.field2996 = class84.method639(0, 31, true, true, false);
            class83.field1952 = class84.method639(1, 31, true, true, false);
            class19.field569 = class84.method639(2, 31, true, false, true);
            class24.field734 = class84.method639(3, 31, true, true, false);
            class27.field775 = class84.method639(4, 31, true, true, false);
            class64.field1634 = class84.method639(5, arg0 ^ 0x51, true, true, true);
            class29.field802 = class84.method639(6, arg0 ^ 0x51, false, true, true);
            class79.field1909 = class84.method639(7, arg0 ^ 0x51, true, true, false);
            class31.field864 = class84.method639(8, arg0 - 47, true, true, false);
            class130.field3151 = class84.method639(9, 31, true, true, false);
            class20.field587 = class84.method639(10, 31, true, true, false);
            class116.field2856 = class84.method639(11, 31, true, true, false);
            class124.field2998 = class4.field172;
            class41.field1164 = 20;
            class8.field260 = 40;
        } else if (class8.field260 == 40) {
            byte var7 = 0;
            int var8 = var7 + class123.field2996.method584(true) * 5 / 100;
            int var9 = var8 + class83.field1952.method584(true) * 5 / 100;
            int var10 = var9 + class19.field569.method584(true) * 5 / 100;
            int var11 = var10 + class24.field734.method584(true) * 5 / 100;
            int var12 = var11 + class27.field775.method584(true) * 5 / 100;
            int var13 = var12 + class64.field1634.method584(true) * 5 / 100;
            int var14 = var13 + class29.field802.method584(true) * 5 / 100;
            int var15 = var14 + class79.field1909.method584(true) * 45 / 100;
            int var16 = var15 + class31.field864.method584(true) * 5 / 100;
            int var17 = var16 + class130.field3151.method584(true) * 5 / 100;
            int var18 = var17 + class20.field587.method584(true) * 5 / 100;
            int var19 = var18 + class116.field2856.method584(true) * 5 / 100;
            if (var19 == 100) {
                class41.field1164 = 30;
                class124.field2998 = class103.field2529;
                class8.field260 = 45;
            } else {
                if (var19 != 0) {
                    class124.field2998 = class15.method114(new class130[] { class41.field1160, class109.method831(var19, 10), class105.field2539 }, -20349);
                }
                class41.field1164 = 30;
            }
        } else if (class8.field260 == 45) {
            class17.method141(class113.field2779, 0, !class4.field189, 0);
            class9.field297 = class48.method425(14406, class113.field2779, class84.field2003);
            class116.field2873 = new class17(22050, class48.field1298);
            class124.field2998 = class42.field1173;
            class41.field1164 = 35;
            class8.field260 = 50;
        } else if (class8.field260 == 50) {
            int var20 = 0;
            if (class68.field1766 == null) {
                class68.field1766 = client.method168(class9.field295, -121, class79.field1921, class31.field864);
            } else {
                var20++;
            }
            if (class132.field3202 == null) {
                class132.field3202 = client.method168(class9.field295, arg0 ^ 0xFFFFFFC8, class99.field2392, class31.field864);
            } else {
                var20++;
            }
            if (class43.field1187 == null) {
                class43.field1187 = client.method168(class9.field295, arg0 - 174, class113.field2791, class31.field864);
            } else {
                var20++;
            }
            if (var20 < 3) {
                class124.field2998 = class15.method114(new class130[] { class113.field2799, class109.method831(var20 * 100 / 3, 10), class105.field2539 }, arg0 - 20427);
                class41.field1164 = 40;
            } else {
                class124.field2998 = class98.field2373;
                class8.field260 = 60;
                class41.field1164 = 40;
            }
        } else if (arg0 == 78) {
            if (class8.field260 == 60) {
                int var21 = class106.method800(class31.field864, arg0 ^ 0x4A, class20.field587);
                int var22 = class72.method570((byte) -85);
                if (var22 > var21) {
                    class124.field2998 = class15.method114(new class130[] { class29.field822, class109.method831(var21 * 100 / var22, 10), class105.field2539 }, -20349);
                    class41.field1164 = 50;
                } else {
                    class124.field2998 = class10.field336;
                    class41.field1164 = 50;
                    class90.method669(19013, 5);
                    class8.field260 = 70;
                }
            } else if (class8.field260 == 70) {
                if (class19.field569.method504(true)) {
                    class96.method718(84, class19.field569);
                    class3.method23(class19.field569, 1);
                    class75.method593(class19.field569, false, class79.field1909);
                    class59.method482((byte) 57, class19.field569, class4.field189, class79.field1909);
                    class84.method634(class79.field1909, (byte) -23, class19.field569);
                    class45.method412(class19.field569, (byte) 126, class79.field1909, class124.field2999);
                    class20.method184(class123.field2996, class83.field1952, -16, class19.field569);
                    class115.method887(class19.field569, class79.field1909, false);
                    class99.method741(class19.field569, false);
                    class7.method57((byte) -118, class19.field569);
                    class89.method660(class31.field864, class24.field734, 29, class79.field1909);
                    class8.field260 = 80;
                    class124.field2998 = class111.field2727;
                    class41.field1164 = 60;
                } else {
                    class124.field2998 = class15.method114(new class130[] { class94.field2288, class109.method831(class19.field569.method590(arg0 ^ 0xFFFFB623), arg0 - 68), class105.field2539 }, -20349);
                    class41.field1164 = 60;
                }
            } else if (class8.field260 == 80) {
                int var23 = 0;
                if (class26.field753 == null) {
                    class26.field753 = class42.method408(class31.field864, class9.field295, class58.field1469, (byte) -108);
                } else {
                    var23++;
                }
                if (class71.field1812 == null) {
                    class71.field1812 = class42.method408(class31.field864, class9.field295, class51.field1351, (byte) -108);
                } else {
                    var23++;
                }
                if (class36.field1036 == null) {
                    class36.field1036 = class106.method803(class93.field2257, -17910, class9.field295, class31.field864);
                } else {
                    var23++;
                }
                if (class51.field1348 == null) {
                    class51.field1348 = class99.method743(class31.field864, class115.field2840, class9.field295, (byte) -56);
                } else {
                    var23++;
                }
                if (class113.field2802 == null) {
                    class113.field2802 = class99.method743(class31.field864, class53.field1390, class9.field295, (byte) -56);
                } else {
                    var23++;
                }
                if (class7.field255 == null) {
                    class7.field255 = class99.method743(class31.field864, class26.field768, class9.field295, (byte) -56);
                } else {
                    var23++;
                }
                if (class43.field1198 == null) {
                    class43.field1198 = class99.method743(class31.field864, class112.field2745, class9.field295, (byte) -56);
                } else {
                    var23++;
                }
                if (class120.field2938 == null) {
                    class120.field2938 = class99.method743(class31.field864, class1.field3, class9.field295, (byte) -56);
                } else {
                    var23++;
                }
                if (class21.field606 == null) {
                    class21.field606 = class42.method408(class31.field864, class9.field295, class29.field821, (byte) -108);
                } else {
                    var23++;
                }
                if (class2.field24 == null) {
                    class2.field24 = class99.method743(class31.field864, class31.field872, class9.field295, (byte) -56);
                } else {
                    var23++;
                }
                if (class7.field253 == null) {
                    class7.field253 = class99.method743(class31.field864, class117.field2900, class9.field295, (byte) -56);
                } else {
                    var23++;
                }
                if (class3.field134 == null) {
                    class3.field134 = class99.method743(class31.field864, class59.field1490, class9.field295, (byte) -56);
                } else {
                    var23++;
                }
                if (class41.field1166 == null) {
                    class41.field1166 = class106.method803(class98.field2371, -17910, class9.field295, class31.field864);
                } else {
                    var23++;
                }
                if (class52.field1363 == null) {
                    class52.field1363 = class106.method803(class51.field1339, -17910, class9.field295, class31.field864);
                } else {
                    var23++;
                }
                if (var23 < 14) {
                    class124.field2998 = class15.method114(new class130[] { class95.field2310, class109.method831(var23 * 100 / 14, 10), class105.field2539 }, -20349);
                    class41.field1164 = 70;
                } else {
                    class71.field1812.method228();
                    int var24 = (int) (Math.random() * 21.0D) - 10;
                    int var25 = (int) (Math.random() * 21.0D) - 10;
                    int var26 = (int) (Math.random() * 41.0D) - 20;
                    int var27 = (int) (Math.random() * 21.0D) - 10;
                    for (int var28 = 0; var28 < class51.field1348.length; var28++) {
                        class51.field1348[var28].method224(var24 + var26, var27 - -var26, var25 + var26);
                    }
                    class36.field1036[0].method750(var24 + var26, var26 + var27, var25 + var26);
                    class41.field1164 = 70;
                    class8.field260 = 85;
                    class124.field2998 = class120.field2952;
                }
            } else if (class8.field260 == 85) {
                int var29 = class132.method1018(class31.field864, (byte) 37);
                int var30 = class37.method377((byte) 115);
                if (var30 > var29) {
                    class124.field2998 = class15.method114(new class130[] { class17.field462, class109.method831(var29 * 100 / var30, arg0 - 68), class105.field2539 }, arg0 - 20427);
                    class41.field1164 = 80;
                } else {
                    class8.field260 = 90;
                    class41.field1164 = 80;
                    class124.field2998 = class94.field2284;
                }
            } else if (class8.field260 == 90) {
                if (class130.field3151.method504(true)) {
                    class6 var31 = new class6(class130.field3151, class31.field864, 20, 0.8D, class4.field189 ? 64 : 128);
                    class12.method94(var31);
                    class12.method92(0.8D);
                    class124.field2998 = class18.field498;
                    class8.field260 = 110;
                    class41.field1164 = 90;
                } else {
                    class124.field2998 = class15.method114(new class130[] { class111.field2725, class109.method831(class130.field3151.method590(arg0 ^ 0xFFFFB623), 10), class105.field2539 }, arg0 - 20427);
                    class41.field1164 = 90;
                }
            } else if (class8.field260 == 110) {
                class117.field2892 = new class9();
                class113.field2779.method842(class117.field2892, (byte) -98, 10);
                class41.field1164 = 94;
                class8.field260 = 120;
                class124.field2998 = class72.field1856;
            } else if (class8.field260 == 120) {
                if (class20.field587.method510(class9.field295, -1, class106.field2570)) {
                    class1 var32 = new class1(class20.field587.method496(class106.field2570, class9.field295, 16421));
                    class64.method527(var32, arg0 - 78);
                    class8.field260 = 130;
                    class41.field1164 = 96;
                    class124.field2998 = class47.field1257;
                } else {
                    class124.field2998 = class15.method114(new class130[] { class19.field572, class101.field2421 }, arg0 ^ 0xFFFFB0CD);
                    class41.field1164 = 96;
                }
            } else if (class8.field260 == 130) {
                if (class24.field734.method504(true)) {
                    class41.field1164 = 100;
                    class124.field2998 = class67.field1713;
                    class8.field260 = 140;
                } else {
                    class124.field2998 = class15.method114(new class130[] { class83.field1957, class109.method831(class24.field734.method590(-18835), 10), class105.field2539 }, -20349);
                    class41.field1164 = 100;
                }
            } else if (class8.field260 == 140) {
                class90.method669(arg0 ^ 0x4A0B, 10);
            }
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(BLjava/awt/Component;)V", line = 420)
    public static final void method514(byte arg0, Component arg1) {
        field1575++;
        int var2 = 54 / ((-arg0 - 26) / 62);
        Method var3 = class110.field2706;
        if (var3 != null) {
            try {
                var3.invoke(arg1, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        arg1.addKeyListener(class56.field1426);
        arg1.addFocusListener(class56.field1426);
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(BLod;)V", line = 454)
    public static final void method515(byte arg0, class88 arg1) {
        arg1.field2119 = false;
        field1567++;
        if (arg0 != -48) {
            return;
        }
        if (arg1.field2101 != -1) {
            class40 var2 = class85.method641(arg1.field2101, 12);
            if (var2 == null || var2.field1106 == null) {
                arg1.field2101 = -1;
            } else {
                arg1.field2084++;
                if (var2.field1106.length > arg1.field2109 && arg1.field2084 > var2.field1108[arg1.field2109]) {
                    arg1.field2109++;
                    arg1.field2084 = 1;
                }
                if (arg1.field2109 >= var2.field1106.length) {
                    arg1.field2084 = 0;
                    arg1.field2109 = 0;
                }
            }
        }
        if (arg1.field2117 != -1 && arg1.field2093 <= class130.field3128) {
            if (arg1.field2129 < 0) {
                arg1.field2129 = 0;
            }
            int var3 = class21.method190(arg1.field2117, arg0 ^ 0x23A3).field2754;
            if (var3 == -1) {
                arg1.field2117 = -1;
            } else {
                class40 var4 = class85.method641(var3, 12);
                if (var4 == null || var4.field1106 == null) {
                    arg1.field2117 = -1;
                } else {
                    arg1.field2121++;
                    if (var4.field1106.length > arg1.field2129 && var4.field1108[arg1.field2129] < arg1.field2121) {
                        arg1.field2129++;
                        arg1.field2121 = 1;
                    }
                    if (arg1.field2129 >= var4.field1106.length && (arg1.field2129 < 0 || arg1.field2129 >= var4.field1106.length)) {
                        arg1.field2117 = -1;
                    }
                }
            }
        }
        if (arg1.field2115 != -1 && arg1.field2139 <= 1) {
            class40 var5 = class85.method641(arg1.field2115, 12);
            if (var5.field1128 == 1 && arg1.field2092 > 0 && class130.field3128 >= arg1.field2133 && class130.field3128 > arg1.field2070) {
                arg1.field2139 = 1;
                return;
            }
        }
        if (arg1.field2115 != -1 && arg1.field2139 == 0) {
            class40 var6 = class85.method641(arg1.field2115, arg0 + 60);
            if (var6 == null || var6.field1106 == null) {
                arg1.field2115 = -1;
            } else {
                arg1.field2134++;
                if (var6.field1106.length > arg1.field2112 && arg1.field2134 > var6.field1108[arg1.field2112]) {
                    arg1.field2134 = 1;
                    arg1.field2112++;
                }
                if (var6.field1106.length <= arg1.field2112) {
                    arg1.field2131++;
                    arg1.field2112 -= var6.field1142;
                    if (arg1.field2131 >= var6.field1138) {
                        arg1.field2115 = -1;
                    }
                    if (arg1.field2112 < 0 || var6.field1106.length <= arg1.field2112) {
                        arg1.field2115 = -1;
                    }
                }
                arg1.field2119 = var6.field1129;
            }
        }
        if (arg1.field2139 > 0) {
            arg1.field2139--;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V", line = 589)
    public static void method516(int arg0) {
        field1589 = null;
        field1568 = null;
        field1572 = null;
        field1588 = null;
        field1576 = null;
        field1590 = null;
        if (arg0 == 30425) {
            field1579 = null;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(BIIZ)Lwb;", line = 631)
    public static final class130 method517(byte arg0, int arg1, int arg2, boolean arg3) {
        if (arg1 < 1 || arg1 > 36) {
            arg1 = 10;
        }
        field1587++;
        if (arg0 > -84) {
            return null;
        }
        int var4 = arg2 / arg1;
        int var5 = 1;
        while (var4 != 0) {
            var5++;
            var4 /= arg1;
        }
        int var6 = var5;
        if (arg2 < 0 || arg3) {
            var6 = var5 + 1;
        }
        byte[] var7 = new byte[var6];
        if (arg2 < 0) {
            var7[0] = 45;
        } else if (arg3) {
            var7[0] = 43;
        }
        for (int var8 = 0; var8 < var5; var8++) {
            int var10 = arg2 % arg1;
            arg2 /= arg1;
            if (var10 < 0) {
                var10 = -var10;
            }
            if (var10 > 9) {
                var10 += 39;
            }
            var7[var6 - var8 - 1] = (byte) (var10 + 48);
        }
        class130 var9 = new class130();
        var9.field3079 = var6;
        var9.field3081 = var7;
        return var9;
    }
}
