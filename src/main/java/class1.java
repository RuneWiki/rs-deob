import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class1 {

    @OriginalMember(owner = "client!a", name = "e", descriptor = "Lkd;")
    public class73 field5 = new class73();

    @OriginalMember(owner = "client!a", name = "a", descriptor = "Lrd;")
    private static class117 field1 = class95.method812("Loaded config", (byte) 8);

    @OriginalMember(owner = "client!a", name = "f", descriptor = "Lrd;")
    private static class117 field6 = class95.method812("M", (byte) 8);

    @OriginalMember(owner = "client!a", name = "m", descriptor = "Lrd;")
    public static class117 field13 = class95.method812("sich mit einer anderen Welt zu verbinden)3", (byte) 8);

    @OriginalMember(owner = "client!a", name = "p", descriptor = "Lrd;")
    public static class117 field16 = field6;

    @OriginalMember(owner = "client!a", name = "i", descriptor = "Lrd;")
    public static class117 field9 = field1;

    @OriginalMember(owner = "client!a", name = "l", descriptor = "I")
    public static int field12 = 0;

    @OriginalMember(owner = "client!a", name = "s", descriptor = "Lrd;")
    public static class117 field19 = class95.method812("60 Sekunden noch einmal)3)3)3", (byte) 8);

    @OriginalMember(owner = "client!a", name = "B", descriptor = "Lrd;")
    public static class117 field28 = class95.method812("headicons_pk", (byte) 8);

    @OriginalMember(owner = "client!a", name = "j", descriptor = "Lmb;")
    public static class85 field10 = new class85(30);

    @OriginalMember(owner = "client!a", name = "C", descriptor = "Lrd;")
    public static class117 field29 = null;

    @OriginalMember(owner = "client!a", name = "k", descriptor = "I")
    public static int field11;

    @OriginalMember(owner = "client!a", name = "n", descriptor = "I")
    public static int field14;

    @OriginalMember(owner = "client!a", name = "o", descriptor = "I")
    public static int field15;

    @OriginalMember(owner = "client!a", name = "q", descriptor = "I")
    public static int field17;

    @OriginalMember(owner = "client!a", name = "r", descriptor = "I")
    public static int field18;

    @OriginalMember(owner = "client!a", name = "b", descriptor = "I")
    public static int field2;

    @OriginalMember(owner = "client!a", name = "t", descriptor = "I")
    public static int field20;

    @OriginalMember(owner = "client!a", name = "u", descriptor = "I")
    public static int field21;

    @OriginalMember(owner = "client!a", name = "v", descriptor = "I")
    public static int field22;

    @OriginalMember(owner = "client!a", name = "w", descriptor = "I")
    public static int field23;

    @OriginalMember(owner = "client!a", name = "x", descriptor = "I")
    public static int field24;

    @OriginalMember(owner = "client!a", name = "y", descriptor = "I")
    public static int field25;

    @OriginalMember(owner = "client!a", name = "c", descriptor = "I")
    public static int field3;

    @OriginalMember(owner = "client!a", name = "d", descriptor = "I")
    public static int field4;

    @OriginalMember(owner = "client!a", name = "g", descriptor = "I")
    public static int field7;

    @OriginalMember(owner = "client!a", name = "h", descriptor = "I")
    public static int field8;

    @OriginalMember(owner = "client!a", name = "A", descriptor = "Ltc;")
    public static class128 field27;

    @OriginalMember(owner = "client!a", name = "z", descriptor = "Lkd;")
    private class73 field26;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(B)Lkd;")
    public final class73 method1(byte arg0) {
        if (arg0 != -70) {
            field16 = null;
        }
        field17++;
        class73 var2 = this.field26;
        if (this.field5 == var2) {
            this.field26 = null;
            return null;
        } else {
            this.field26 = var2.field2029;
            return var2;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lkd;ILkd;)V")
    public final void method2(class73 arg0, int arg1, class73 arg2) {
        if (arg0.field2029 != null) {
            arg0.method691(0);
        }
        field21++;
        arg0.field2038 = arg2;
        arg0.field2029 = arg2.field2029;
        arg0.field2029.field2038 = arg0;
        if (arg1 != 1) {
            field28 = null;
        }
        arg0.field2038.field2029 = arg0;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Z)Lkd;")
    public final class73 method3(boolean arg0) {
        field8++;
        class73 var2 = this.field5.field2038;
        if (arg0) {
            field19 = null;
        }
        if (this.field5 == var2) {
            this.field26 = null;
            return null;
        } else {
            this.field26 = var2.field2038;
            return var2;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lkd;Z)V")
    public final void method4(class73 arg0, boolean arg1) {
        if (arg0.field2029 != null) {
            arg0.method691(0);
        }
        if (arg1) {
            method16(-16, 92);
        }
        arg0.field2038 = this.field5.field2038;
        field4++;
        arg0.field2029 = this.field5;
        arg0.field2029.field2038 = arg0;
        arg0.field2038.field2029 = arg0;
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(B)Lkd;")
    public final class73 method5(byte arg0) {
        field18++;
        class73 var2 = this.field5.field2029;
        if (this.field5 == var2) {
            this.field26 = null;
            return null;
        } else if (arg0 >= -94) {
            return null;
        } else {
            this.field26 = var2.field2029;
            return var2;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lcd;ILcd;)V")
    public static final void method6(class19 arg0, int arg1, class19 arg2) {
        field15++;
        class147.field3597.method488(-7913);
        if (class52.field1464 == 0 || class52.field1464 == 5) {
            byte var3 = 20;
            int var4 = 82 - var3;
            arg2.method216(class43.field1231, 180, 74 - var3, 16777215);
            class145.method1163(28, var4, 304, 34, 9179409);
            class145.method1163(29, var4 + 1, 302, 32, 0);
            class145.method1165(30, var4 + 2, class52.field1474 * 3, 30, 9179409);
            class145.method1165(class52.field1474 * 3 + 30, var4 - -2, 300 - class52.field1474 * 3, 30, 0);
            arg2.method216(class56.field1560, 180, 105 - var3, 16777215);
        }
        if (class52.field1464 == 20) {
            class68.field1930.method929(0, 0);
            byte var5 = 40;
            arg2.method219(class56.field1561, 180, var5, 16776960, true);
            int var19 = var5 + 15;
            arg2.method219(class56.field1566, 180, var19, 16776960, true);
            int var20 = var19 + 15;
            arg2.method219(class56.field1552, 180, var20, 16776960, true);
            int var21 = var20 + 15;
            int var22 = var21 + 10;
            arg2.method199(class18.method193(new class117[] { class85.field2226, class56.field1575 }, 34), 90, var22, 16777215, true);
            int var24 = var22 + 15;
            arg2.method199(class18.method193(new class117[] { class22.field653, class56.field1562.method936((byte) -95) }, 103), 92, var24, 16777215, true);
            int var25 = var24 + 15;
        }
        if (class52.field1464 == 10) {
            class68.field1930.method929(0, 0);
            if (class116.field2824 == 0) {
                byte var6 = 80;
                byte var7 = 100;
                byte var8 = 120;
                arg2.method219(class27.field807, 180, var6, 16776960, true);
                int var23 = var6 + 30;
                class96.field2418.method929(var7 - 73, var8 + -20);
                arg2.method204(class108.field2676, var7 - 73, var8 + -20, 144, 40, 16777215, true, 1, 1, 0);
                short var9 = 260;
                class96.field2418.method929(var9 - 73, var8 - 20);
                arg2.method204(class119.field2918, var9 - 73, var8 - 20, 144, 40, 16777215, true, 1, 1, 0);
            } else if (class116.field2824 == 2) {
                byte var10 = 40;
                byte var11 = 100;
                short var12 = 150;
                arg2.method219(class56.field1561, 180, var10, 16776960, true);
                int var26 = var10 + 15;
                arg2.method219(class56.field1566, 180, var26, 16776960, true);
                int var27 = var26 + 15;
                arg2.method219(class56.field1552, 180, var27, 16776960, true);
                int var28 = var27 + 15;
                int var29 = var28 + 10;
                arg2.method199(class18.method193(new class117[] { class85.field2226, class56.field1575, class73.field2051 == 0 & class85.field2236 % 40 < 20 ? class110.field2755 : class56.field1570 }, 35), 90, var29, 16777215, true);
                int var30 = var29 + 15;
                arg2.method199(class18.method193(new class117[] { class22.field653, class56.field1562.method936((byte) -95), class73.field2051 == 1 & class85.field2236 % 40 < 20 ? class110.field2755 : class56.field1570 }, 105), 92, var30, 16777215, true);
                class96.field2418.method929(var11 - 73, var12 + -20);
                int var31 = var30 + 15;
                arg2.method219(class94.field2368, var11, var12 + 5, 16777215, true);
                short var13 = 260;
                class96.field2418.method929(var13 - 73, var12 + -20);
                arg2.method219(class74.field2075, var13, var12 + 5, 16777215, true);
            } else if (class116.field2824 == 3) {
                arg2.method219(class100.field2476, 180, 40, 16776960, true);
                byte var14 = 65;
                short var15 = 180;
                arg2.method219(class65.field1850, 180, var14, 16777215, true);
                short var16 = 150;
                int var32 = var14 + 15;
                arg2.method219(class93.field2343, 180, var32, 16777215, true);
                int var33 = var32 + 15;
                arg2.method219(class115.field2805, 180, var33, 16777215, true);
                int var34 = var33 + 15;
                arg2.method219(class52.field1458, 180, var34, 16777215, true);
                class96.field2418.method929(var15 - 73, var16 - 20);
                arg2.method219(class74.field2075, var15, var16 + 5, 16777215, true);
                int var35 = var34 + 15;
            }
        }
        class108.method891(false);
        try {
            Graphics var17 = class42.field1216.getGraphics();
            class147.field3597.method485(171, 202, -6898, var17);
            class107.field2671.method485(0, 0, -6898, var17);
            class86.field2241.method485(0, 637, -6898, var17);
            if (class109.field2727) {
                class109.field2727 = false;
                class144.field3431.method485(0, 128, -6898, var17);
                class118.field2913.method485(371, 202, -6898, var17);
                class143.field3409.method485(265, 0, -6898, var17);
                class148.field3632.method485(265, 562, -6898, var17);
                class53.field1499.method485(171, 128, -6898, var17);
                class101.field2532.method485(171, 562, -6898, var17);
            }
        } catch (Exception var18) {
            class42.field1216.repaint();
        }
        if (arg1 >= -69) {
            method11((byte) -48);
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V")
    public static final void method7(int arg0) {
        for (int var1 = 0; var1 < class47.field1329; var1++) {
            int var2 = class135.field3229[var1];
            class36 var3 = class93.field2334[var2];
            int var4 = class104.field2588.method153(true);
            if ((var4 & 0x20) != 0) {
                int var5 = class104.field2588.method138((byte) 105);
                if (var5 == 65535) {
                    var5 = -1;
                }
                int var6 = class104.field2588.method168(255);
                if (var3.field703 == var5 && var5 != -1) {
                    int var7 = class33.method387(var5, 7455).field1279;
                    if (var7 == 1) {
                        var3.field684 = 0;
                        var3.field723 = 0;
                        var3.field727 = 0;
                        var3.field712 = var6;
                    }
                    if (var7 == 2) {
                        var3.field723 = 0;
                    }
                } else if (var5 == -1 || var3.field703 == -1 || class33.method387(var5, 7455).field1300 >= class33.method387(var3.field703, 7455).field1300) {
                    var3.field703 = var5;
                    var3.field684 = 0;
                    var3.field712 = var6;
                    var3.field727 = 0;
                    var3.field694 = var3.field737;
                    var3.field723 = 0;
                }
            }
            if ((var4 & 0x8) != 0) {
                var3.field1061 = class45.method492(class104.field2588.method127(true), (byte) 52);
                var3.field721 = var3.field1061.field405;
                var3.field719 = var3.field1061.field419;
                var3.field689 = var3.field1061.field397;
                var3.field685 = var3.field1061.field432;
                var3.field726 = var3.field1061.field388;
                var3.field750 = var3.field1061.field415;
                var3.field715 = var3.field1061.field406;
                var3.field728 = var3.field1061.field391;
                var3.field718 = var3.field1061.field438;
            }
            if ((var4 & 0x1) != 0) {
                var3.field732 = class104.field2588.method138((byte) 97);
                int var8 = class104.field2588.method121((byte) -66);
                var3.field731 = 0;
                var3.field746 = 0;
                var3.field745 = (var8 & 0xFFFF) + class85.field2236;
                var3.field725 = var8 >> 16;
                if (class85.field2236 < var3.field745) {
                    var3.field746 = -1;
                }
                if (var3.field732 == 65535) {
                    var3.field732 = -1;
                }
            }
            if ((var4 & 0x4) != 0) {
                var3.field709 = class104.field2588.method138((byte) 100);
                var3.field742 = class104.field2588.method132(arg0 ^ 0xFFFF0259);
            }
            if ((var4 & 0x10) != 0) {
                int var9 = class104.field2588.method144((byte) 46);
                int var10 = class104.field2588.method144((byte) 58);
                var3.method264(20663, var9, class85.field2236, var10);
                var3.field702 = class85.field2236 + 300;
                var3.field713 = class104.field2588.method168(255);
                var3.field735 = class104.field2588.method153(true);
            }
            if ((var4 & 0x2) != 0) {
                var3.field696 = class104.field2588.method127(true);
                if (var3.field696 == 65535) {
                    var3.field696 = -1;
                }
            }
            if ((var4 & 0x40) != 0) {
                int var11 = class104.field2588.method156(255);
                int var12 = class104.field2588.method156(255);
                var3.method264(20663, var11, class85.field2236, var12);
                var3.field702 = class85.field2236 + 300;
                var3.field713 = class104.field2588.method168(arg0 + 934);
                var3.field735 = class104.field2588.method168(255);
            }
            if ((var4 & 0x80) != 0) {
                var3.field706 = class104.field2588.method171((byte) 110);
                var3.field683 = 100;
            }
        }
        field22++;
        if (arg0 != -679) {
            method7(-112);
        }
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(Z)V")
    public static void method8(boolean arg0) {
        field19 = null;
        field16 = null;
        field28 = null;
        field27 = null;
        field9 = null;
        field29 = null;
        field13 = null;
        field10 = null;
        field6 = null;
        if (arg0) {
            field1 = null;
        }
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(I)Lkd;")
    public final class73 method9(int arg0) {
        int var2 = 7 % ((-arg0 - 4) / 52);
        field23++;
        class73 var3 = this.field5.field2038;
        if (this.field5 == var3) {
            return null;
        } else {
            var3.method691(0);
            return var3;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lkd;B)V")
    public final void method10(class73 arg0, byte arg1) {
        field14++;
        if (arg1 <= 87) {
            this.method17((byte) -109);
        }
        if (arg0.field2029 != null) {
            arg0.method691(0);
        }
        arg0.field2029 = this.field5.field2029;
        arg0.field2038 = this.field5;
        arg0.field2029.field2038 = arg0;
        arg0.field2038.field2029 = arg0;
    }

    @OriginalMember(owner = "client!a", name = "c", descriptor = "(B)V")
    public static final void method11(byte arg0) {
        field20++;
        class64.field1826.method766(5);
        class65.field1864.method766(5);
        class107.field2655.method766(5);
        field10.method766(5);
        if (arg0 <= 28) {
            method7(49);
        }
    }

    @OriginalMember(owner = "client!a", name = "d", descriptor = "(B)Lkd;")
    public final class73 method12(byte arg0) {
        field25++;
        class73 var2 = this.field5.field2029;
        if (this.field5 == var2) {
            return null;
        } else {
            var2.method691(0);
            return arg0 == 48 ? var2 : null;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IB)V")
    public static final void method13(int arg0, byte arg1) {
        class45 var2 = (class45) class84.field2191.method20((long) arg0, true);
        field2++;
        if (var2 == null) {
            return;
        }
        int var3 = 0;
        if (arg1 > -22) {
            return;
        }
        while (var3 < var2.field1269.length) {
            var2.field1269[var3] = -1;
            var2.field1265[var3] = 0;
            var3++;
        }
    }

    @OriginalMember(owner = "client!a", name = "c", descriptor = "(I)Lkd;")
    public final class73 method14(int arg0) {
        field24++;
        class73 var2 = this.field26;
        if (arg0 <= 126) {
            field13 = null;
        }
        if (this.field5 == var2) {
            this.field26 = null;
            return null;
        } else {
            this.field26 = var2.field2038;
            return var2;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(II)I")
    public static int method15(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(II)V")
    public static final void method16(int arg0, int arg1) {
        if (arg1 != -2) {
            field13 = null;
        }
        field3++;
        if (arg0 == -3) {
            class14.method114(class22.field646, class73.field2054, class20.field524, -42);
        } else if (arg0 == -2) {
            class14.method114(class20.field562, class109.field2732, class20.field575, -105);
        } else if (arg0 == -1) {
            class14.method114(class67.field1891, class73.field2046, class20.field535, -120);
        } else if (arg0 == 3) {
            class14.method114(class20.field526, class105.field2633, class20.field564, -127);
        } else if (arg0 == 4) {
            class14.method114(class105.field2627, class63.field1800, class20.field561, arg1 - 90);
        } else if (arg0 == 5) {
            class14.method114(class94.field2361, class73.field2050, class20.field581, arg1 ^ 0xFFFFFF97);
        } else if (arg0 == 6) {
            class14.method114(class15.field353, class148.field3617, class20.field523, -49);
        } else if (arg0 == 7) {
            class14.method114(class15.field357, class18.field452, class20.field525, 127);
        } else if (arg0 == 8) {
            class14.method114(class115.field2816, class24.field670, class20.field551, -64);
        } else if (arg0 == 9) {
            class14.method114(class42.field1214, class20.field547, class20.field577, -120);
        } else if (arg0 == 10) {
            class14.method114(class115.field2823, class118.field2907, class20.field566, -95);
        } else if (arg0 == 11) {
            class14.method114(class73.field2055, class96.field2421, class20.field537, arg1 + 118);
        } else if (arg0 == 12) {
            class14.method114(class100.field2497, class59.field1662, class20.field569, -125);
        } else if (arg0 == 13) {
            class14.method114(class23.field664, class73.field2045, class20.field571, 113);
        } else if (arg0 == 14) {
            class14.method114(class109.field2725, class43.field1224, class20.field576, arg1 + 125);
        } else if (arg0 == 16) {
            class14.method114(class56.field1564, class20.field540, class20.field542, -33);
        } else if (arg0 == 17) {
            class14.method114(class15.field361, class68.field1906, class20.field529, 104);
        } else if (arg0 == 18) {
            class14.method114(class128.field3118, class62.field1741, class20.field568, -22);
        } else if (arg0 == 19) {
            class14.method114(class120.field2958, class33.field981, class18.field442, -98);
        } else if (arg0 == 20) {
            class14.method114(class15.field359, class73.field2057, class20.field573, 125);
        } else if (arg0 == 22) {
            class14.method114(class95.field2393, class143.field3406, class20.field533, -77);
        } else if (arg0 == 23) {
            class14.method114(class56.field1556, class43.field1218, class20.field565, 121);
        } else if (arg0 == 24) {
            class14.method114(class58.field1602, class115.field2820, class20.field557, -76);
        } else if (arg0 == 25) {
            class14.method114(class83.field2159, class73.field2040, class20.field563, 110);
        } else if (arg0 == 26) {
            class14.method114(class138.field3308, class77.field2106, class20.field574, -90);
        } else if (arg0 == 27) {
            class14.method114(class20.field541, class92.field2333, class20.field558, 105);
        } else {
            class14.method114(class58.field1603, class73.field2056, class20.field550, arg1 ^ 0xFFFFFF81);
        }
        class85.method769(arg1 ^ 0xFFFFFFFE, 10);
    }

    @OriginalMember(owner = "client!a", name = "e", descriptor = "(B)V")
    public final void method17(byte arg0) {
        field7++;
        if (arg0 != 44) {
            return;
        }
        while (true) {
            class73 var2 = this.field5.field2038;
            if (this.field5 == var2) {
                return;
            }
            var2.method691(arg0 - 44);
        }
    }

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "()V")
    public class1() {
        this.field5.field2038 = this.field5;
        this.field5.field2029 = this.field5;
    }
}
