import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jr")
public class class94 {

    @OriginalMember(owner = "client!jr", name = "c", descriptor = "I")
    public static int field1400 = 0;

    @OriginalMember(owner = "client!jr", name = "d", descriptor = "[[Z")
    public static boolean[][] field1401 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "Lbu;")
    public static class19 field1399 = new class19();

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "I")
    public static int field1398;

    @OriginalMember(owner = "client!jr", name = "e", descriptor = "I")
    public static int field1402;

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(I)V", line = 6)
    public static final void method738(int arg0) {
        if (arg0 > -32) {
            method740(-60, 16, 124);
        }
        class293.field4042 = false;
        class146.field2126 = null;
        field1398++;
        class504.method2996((byte) 109);
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(B)V", line = 21)
    public static void method739(byte arg0) {
        field1401 = null;
        if (arg0 >= -44) {
            field1400 = 47;
        }
        field1399 = null;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(III)Z", line = 38)
    public static final boolean method740(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class466.field6568; var3++) {
            class521 var4 = class444.field6048[var3];
            if (var4.field7420 == 1) {
                int var5 = var4.field7434 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field7424 * var5 >> 8) + var4.field7427;
                    int var7 = (var4.field7429 * var5 >> 8) + var4.field7426;
                    int var8 = (var4.field7425 * var5 >> 8) + var4.field7437;
                    int var9 = (var4.field7428 * var5 >> 8) + var4.field7417;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field7420 == 2) {
                int var10 = arg0 - var4.field7434;
                if (var10 > 0) {
                    int var11 = (var4.field7424 * var10 >> 8) + var4.field7427;
                    int var12 = (var4.field7429 * var10 >> 8) + var4.field7426;
                    int var13 = (var4.field7425 * var10 >> 8) + var4.field7437;
                    int var14 = (var4.field7428 * var10 >> 8) + var4.field7417;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field7420 == 3) {
                int var15 = var4.field7427 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field7421 * var15 >> 8) + var4.field7434;
                    int var17 = (var4.field7422 * var15 >> 8) + var4.field7435;
                    int var18 = (var4.field7425 * var15 >> 8) + var4.field7437;
                    int var19 = (var4.field7428 * var15 >> 8) + var4.field7417;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field7420 == 4) {
                int var20 = arg2 - var4.field7427;
                if (var20 > 0) {
                    int var21 = (var4.field7421 * var20 >> 8) + var4.field7434;
                    int var22 = (var4.field7422 * var20 >> 8) + var4.field7435;
                    int var23 = (var4.field7425 * var20 >> 8) + var4.field7437;
                    int var24 = (var4.field7428 * var20 >> 8) + var4.field7417;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field7420 == 5) {
                int var25 = arg1 - var4.field7437;
                if (var25 > 0) {
                    int var26 = (var4.field7421 * var25 >> 8) + var4.field7434;
                    int var27 = (var4.field7422 * var25 >> 8) + var4.field7435;
                    int var28 = (var4.field7424 * var25 >> 8) + var4.field7427;
                    int var29 = (var4.field7429 * var25 >> 8) + var4.field7426;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "(I)V", line = 159)
    public static final void method741(int arg0) {
        class477.method2875(false, -28222);
        field1402++;
        class139.field1983 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < class58.field741.length; var2++) {
            if (class451.field6353[var2] != -1 && class58.field741[var2] == null) {
                class58.field741[var2] = class282.field3952.method1966(0, class451.field6353[var2], true);
                if (class58.field741[var2] == null) {
                    class139.field1983++;
                    var1 = false;
                }
            }
            if (class365.field5036[var2] != -1 && class2.field12[var2] == null) {
                class2.field12[var2] = class282.field3952.method1992(class555.field8270[var2], class365.field5036[var2], 0, (byte) -54);
                if (class2.field12[var2] == null) {
                    class139.field1983++;
                    var1 = false;
                }
            }
            if (class8.field81[var2] != -1 && class490.field6977[var2] == null) {
                class490.field6977[var2] = class282.field3952.method1966(0, class8.field81[var2], true);
                if (class490.field6977[var2] == null) {
                    var1 = false;
                    class139.field1983++;
                }
            }
            if (class92.field1374[var2] != -1 && class406.field5551[var2] == null) {
                class406.field5551[var2] = class282.field3952.method1966(0, class92.field1374[var2], true);
                if (class406.field5551[var2] == null) {
                    var1 = false;
                    class139.field1983++;
                }
            }
            if (class25.field247 != null && class618.field9132[var2] == null && class25.field247[var2] != -1) {
                class618.field9132[var2] = class282.field3952.method1992(class555.field8270[var2], class25.field247[var2], 0, (byte) 107);
                if (class618.field9132[var2] == null) {
                    class139.field1983++;
                    var1 = false;
                }
            }
        }
        if (class406.field5552 == null) {
            if (class395.field5438 == null || !class180.field2737.method1970(class395.field5438.field9347 + "_staticelements", (byte) 95)) {
                class406.field5552 = new class504(0);
            } else if (class180.field2737.method1987((byte) -61, class395.field5438.field9347 + "_staticelements")) {
                class406.field5552 = class507.method3006(class180.field2737, (byte) -112, class106.field1534, class395.field5438.field9347 + "_staticelements");
            } else {
                var1 = false;
                class139.field1983++;
            }
        }
        if (!var1) {
            class120.field1695 = 1;
            return;
        }
        boolean var3 = true;
        class156.field2319 = 0;
        for (int var4 = 0; var4 < class58.field741.length; var4++) {
            byte[] var19 = class2.field12[var4];
            if (var19 != null) {
                int var20 = (class340.field4706[var4] >> 8) * 64 - class473.field6687;
                int var21 = (class340.field4706[var4] & 0xFF) * 64 - class38.field463;
                if (class599.field8841 != 0) {
                    var21 = 10;
                    var20 = 10;
                }
                var3 &= class345.method2103(class410.field5609, var21, class146.field2125, var19, var20, (byte) -104);
            }
            byte[] var22 = class406.field5551[var4];
            if (var22 != null) {
                int var23 = (class340.field4706[var4] >> 8) * 64 - class473.field6687;
                int var24 = (class340.field4706[var4] & 0xFF) * 64 - class38.field463;
                if (class599.field8841 != 0) {
                    var23 = 10;
                    var24 = 10;
                }
                var3 &= class345.method2103(class410.field5609, var24, class146.field2125, var22, var23, (byte) -88);
            }
        }
        if (!var3) {
            class120.field1695 = 2;
            return;
        }
        if (class120.field1695 != 0) {
            class438.method2554(class459.field6493.method3408(117, class63.field795) + "<br>(100%)", true, (byte) -26, class465.field6539);
        }
        class539.method3268(5);
        class459.method2781((byte) -97);
        boolean var5 = false;
        if (class99.field1445.method464() && class56.field668.field6832) {
            for (int var6 = 0; var6 < class58.field741.length; var6++) {
                if (class406.field5551[var6] != null || class490.field6977[var6] != null) {
                    var5 = true;
                    break;
                }
            }
        }
        int var7;
        if (class56.field668.field6842) {
            var7 = class201.field2989[class509.field7234];
        } else {
            var7 = class526.field7532[class509.field7234];
        }
        if (class99.field1445.method486()) {
            var7++;
        }
        class545.method3316(7, 4, class146.field2125, class410.field5609, var7, var5, class99.field1445.method513() > 0);
        for (int var8 = 0; var8 < 4; var8++) {
            class127.field1774[var8].method231(-3995);
        }
        if (arg0 < 69) {
            field1399 = null;
        }
        class37.method227((byte) 35);
        class621.method3632(-1, false);
        class255.method1637(0);
        class212.field3123 = null;
        class347.field4759 = false;
        class539.method3268(5);
        System.gc();
        class477.method2875(true, -28222);
        class245.method1553((byte) 110);
        class473.field6690 = class56.field668.method2897(class526.field7533, 6373);
        class329.field4545 = class56.field668.field6832;
        class309.field4266 = class467.field6579 >= 96;
        class521.field7438 = class56.field668.method2895(class526.field7533, 0);
        class193.field2863 = !class56.field668.field6845;
        class42.field486 = class56.field668.method1472(class526.field7533, (byte) 106) ? -1 : class447.field6263;
        class196.field2896 = class637.method3695(class526.field7533, -4) || class56.field668.field6853;
        class3.field29 = class56.field668.field6847;
        class304.field4182 = new class335(4, class146.field2125, class410.field5609, false);
        if (class599.field8841 == 0) {
            class159.method1145(class304.field4182, 119, class58.field741);
        } else {
            class432.method2527((byte) -81, class58.field741, class304.field4182);
        }
        class195.method1321(class146.field2125 >> 4, class410.field5609 >> 4, (byte) -25);
        class80.method609(283268810);
        if (var5) {
            class626.method3663(true);
            class459.field6501 = new class335(1, class146.field2125, class410.field5609, true);
            if (class599.field8841 == 0) {
                class159.method1145(class459.field6501, 118, class490.field6977);
                class477.method2875(true, -28222);
            } else {
                class432.method2527((byte) -81, class490.field6977, class459.field6501);
                class477.method2875(true, -28222);
            }
            class459.field6501.method1857((byte) 66, class304.field4182.field4150[0], 0);
            class459.field6501.method1852(class99.field1445, null, null, 0);
            class626.method3663(false);
        }
        class304.field4182.method1852(class99.field1445, class127.field1774, var5 ? class459.field6501.field4150 : null, 0);
        if (class599.field8841 == 0) {
            class477.method2875(true, -28222);
            class389.method2319(4973, class2.field12, class304.field4182);
            if (class618.field9132 != null) {
                class503.method2994((byte) -84);
            }
        } else {
            class477.method2875(true, -28222);
            class47.method293(class304.field4182, class2.field12, (byte) 59);
        }
        class459.method2781((byte) -100);
        if (class467.field6579 < 96) {
            class324.method1946(19349);
        }
        class477.method2875(true, -28222);
        class304.field4182.method1848(var5 ? class114.field1609[0] : null, null, class99.field1445, 76);
        class304.field4182.method2042(class99.field1445, 81);
        class477.method2875(true, -28222);
        if (var5) {
            class626.method3663(true);
            class477.method2875(true, -28222);
            if (class599.field8841 == 0) {
                class389.method2319(4973, class406.field5551, class459.field6501);
            } else {
                class47.method293(class459.field6501, class406.field5551, (byte) 84);
            }
            class459.method2781((byte) -91);
            class477.method2875(true, -28222);
            class459.field6501.method1848(null, class207.field3077[0], class99.field1445, 66);
            class459.field6501.method2042(class99.field1445, 121);
            class477.method2875(true, -28222);
            class626.method3663(false);
        }
        class428.method2510(11);
        int var9 = class304.field4182.field4640;
        if (var9 > class89.field1339) {
            var9 = class89.field1339;
        }
        if (var9 < class89.field1339 - 1) {
            var9 = class89.field1339 - 1;
        }
        if (class56.field668.method1472(class526.field7533, (byte) 87)) {
            class645.method3725(0);
        } else {
            class645.method3725(var9);
        }
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var17 = 0; var17 < class146.field2125; var17++) {
                for (int var18 = 0; var18 < class410.field5609; var18++) {
                    class464.method2793(var10, (byte) 27, var17, var18);
                }
            }
        }
        class226.method1452(-127);
        class539.method3268(5);
        class511.method3040((byte) -104);
        class459.method2781((byte) 52);
        class123.method876(256);
        if (class390.field5382 != null && class296.field4075 != null && class472.field6670 == 10) {
            class402.method2367(class315.field4334, (byte) 108);
            class105.field1515++;
            class112.field1589.method1058(602643080, 1057001181);
        }
        if (class599.field8841 == 0) {
            int var11 = (class188.field2802 - (class146.field2125 >> 4)) / 8;
            int var12 = (class188.field2802 + (class146.field2125 >> 4)) / 8;
            int var13 = (class291.field4029 - (class410.field5609 >> 4)) / 8;
            int var14 = (class291.field4029 + (class410.field5609 >> 4)) / 8;
            for (int var15 = var11 - 1; var15 <= var12 + 1; var15++) {
                for (int var16 = var13 - 1; var16 <= var14 + 1; var16++) {
                    if (var11 > var15 || var12 < var15 || var13 > var16 || var14 < var16) {
                        class282.field3952.method1995((byte) -118, "m" + var15 + "_" + var16);
                        class282.field3952.method1995((byte) -118, "l" + var15 + "_" + var16);
                    }
                }
            }
        }
        if (class472.field6670 == 3) {
            class18.method117((byte) -85, 2);
        } else if (class472.field6670 == 7) {
            class18.method117((byte) -85, 6);
        } else {
            class18.method117((byte) -85, 9);
            if (class296.field4075 != null) {
                class402.method2367(class618.field9133, (byte) 98);
            }
        }
        class271.method1709(96);
        class539.method3268(5);
        class519.method3070(99);
    }
}
