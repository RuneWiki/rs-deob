import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class38 extends class34 {

    @OriginalMember(owner = "client!fi", name = "H", descriptor = "I")
    private int field568 = 4096;

    @OriginalMember(owner = "client!fi", name = "D", descriptor = "I")
    private int field564 = 4096;

    @OriginalMember(owner = "client!fi", name = "F", descriptor = "I")
    private int field566 = 4096;

    @OriginalMember(owner = "client!fi", name = "J", descriptor = "Lhi;")
    public static class45 field570 = new class45(82, 16);

    @OriginalMember(owner = "client!fi", name = "C", descriptor = "I")
    public static int field563;

    @OriginalMember(owner = "client!fi", name = "E", descriptor = "I")
    public static int field565;

    @OriginalMember(owner = "client!fi", name = "G", descriptor = "I")
    public static int field567;

    @OriginalMember(owner = "client!fi", name = "I", descriptor = "I")
    public static int field569;

    @OriginalMember(owner = "client!fi", name = "K", descriptor = "I")
    public static int field571;

    @OriginalMember(owner = "client!fi", name = "L", descriptor = "I")
    public static int field572;

    @OriginalMember(owner = "client!fi", name = "M", descriptor = "Lo;")
    public static class359 field573;

    @OriginalMember(owner = "client!fi", name = "N", descriptor = "[I")
    public static int[] field574;

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "()V", line = 3)
    public class38() {
        super(1, false);
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lsv;I)Ljava/lang/String;", line = 9)
    public static final String method265(class319 arg0, int arg1) {
        if (arg1 > -69) {
            field570 = null;
        }
        ++field563;
        return class421.method2502(arg0, -60, 32767);
    }

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "(I)V", line = 20)
    public static void method266(int arg0) {
        field573 = null;
        int var1 = 17 / ((44 - arg0) / 62);
        field574 = null;
        field570 = null;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(BI)[[I", line = 31)
    public final int[][] method66(byte arg0, int arg1) {
        ++field572;
        if (arg0 != -11) {
            method265((class319) null, 93);
        }
        int[][] var3 = super.field536.method337(arg1, (byte) 75);
        if (super.field536.field726) {
            int[][] var4 = this.method254(0, 0, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class383.field5502; ++var11) {
                int var12 = var5[var11];
                int var13 = var7[var11];
                int var14 = var6[var11];
                if (var12 == var13 && ~var13 == ~var14) {
                    var8[var11] = this.field568 * var12 >> 12;
                    var9[var11] = this.field566 * var13 >> 12;
                    var10[var11] = this.field564 * var14 >> 12;
                } else {
                    var8[var11] = this.field568;
                    var9[var11] = this.field566;
                    var10[var11] = this.field564;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lsv;II)V", line = 97)
    public final void method69(class319 arg0, int arg1, int arg2) {
        if (arg1 > 16) {
            if (~arg2 != -1) {
                if (arg2 != 1) {
                    if (~arg2 == -3) {
                        this.field564 = arg0.method1844(-118);
                    }
                } else {
                    this.field566 = arg0.method1844(-115);
                }
            } else {
                this.field568 = arg0.method1844(-118);
            }
            ++field567;
        }
    }

    @OriginalMember(owner = "client!fi", name = "f", descriptor = "(I)V", line = 141)
    public static final void method267(int arg0) {
        ++field565;
        class315.method1816((byte) -49, false);
        class37.field555 = 0;
        boolean var1 = true;
        for (int var2 = 0; ~class397.field5706.length < ~var2; ++var2) {
            if (~class196.field2873[var2] != 0 && class397.field5706[var2] == null) {
                class397.field5706[var2] = class103.field1618.method2512(class196.field2873[var2], (byte) -93, 0);
                if (class397.field5706[var2] == null) {
                    var1 = false;
                    ++class37.field555;
                }
            }
            if (class98.field1560[var2] != -1 && class137.field2065[var2] == null) {
                class137.field2065[var2] = class103.field1618.method2492(0, class98.field1560[var2], class44.field633[var2], true);
                if (class137.field2065[var2] == null) {
                    var1 = false;
                    ++class37.field555;
                }
            }
            if (class302.field4119[var2] != -1 && class94.field1536[var2] == null) {
                class94.field1536[var2] = class103.field1618.method2512(class302.field4119[var2], (byte) -93, 0);
                if (class94.field1536[var2] == null) {
                    ++class37.field555;
                    var1 = false;
                }
            }
            if (class278.field3779[var2] != -1 && class236.field3273[var2] == null) {
                class236.field3273[var2] = class103.field1618.method2512(class278.field3779[var2], (byte) -93, 0);
                if (class236.field3273[var2] == null) {
                    ++class37.field555;
                    var1 = false;
                }
            }
            if (class142.field2119 != null && class100.field1585[var2] == null && ~class142.field2119[var2] != 0) {
                class100.field1585[var2] = class103.field1618.method2492(0, class142.field2119[var2], class44.field633[var2], true);
                if (class100.field1585[var2] == null) {
                    ++class37.field555;
                    var1 = false;
                }
            }
        }
        if (class533.field7851 == null) {
            if (class423.field6154 != null && class315.field4271.method2510(class423.field6154.field6708 + "_staticelements", 11)) {
                if (class315.field4271.method2491(class423.field6154.field6708 + "_staticelements", 255)) {
                    class533.field7851 = class145.method1009(false, class65.field938, class423.field6154.field6708 + "_staticelements", class315.field4271);
                } else {
                    var1 = false;
                    ++class37.field555;
                }
            } else {
                class533.field7851 = new class431(0);
            }
        }
        if (!var1) {
            class191.field2789 = 1;
        } else {
            boolean var3 = true;
            class193.field2814 = 0;
            for (int var4 = 0; var4 < class397.field5706.length; ++var4) {
                byte[] var19 = class137.field2065[var4];
                if (var19 != null) {
                    int var20 = (class463.field6689[var4] >> 8) * 64 + -class110.field1775;
                    int var21 = (class463.field6689[var4] & 255) * 64 + -class399.field5727;
                    if (~class374.field5376 != -1) {
                        var20 = 10;
                        var21 = 10;
                    }
                    var3 &= class309.method1784(class9.field111, class192.field2809, var19, -3606, var21, var20);
                }
                byte[] var22 = class236.field3273[var4];
                if (var22 != null) {
                    int var23 = (class463.field6689[var4] >> 8) * 64 + -class110.field1775;
                    int var24 = (255 & class463.field6689[var4]) * 64 - class399.field5727;
                    if (class374.field5376 != 0) {
                        var23 = 10;
                        var24 = 10;
                    }
                    var3 &= class309.method1784(class9.field111, class192.field2809, var22, -3606, var24, var23);
                }
            }
            if (!var3) {
                class191.field2789 = 2;
            } else {
                if (class191.field2789 != 0) {
                    class229.method1408(arg0 ^ 10, class314.field4251.method1126(class486.field6998, (byte) -19) + "<br>(100%)", class331.field4510, true);
                }
                class287.method1649(841283500);
                class250.method1490((byte) 107);
                boolean var5 = false;
                if (class275.field3737.method564() && class76.field1075.field3654) {
                    for (int var6 = 0; ~var6 > ~class397.field5706.length; ++var6) {
                        if (class236.field3273[var6] != null || class94.field1536[var6] != null) {
                            var5 = true;
                            break;
                        }
                    }
                }
                int var7;
                if (!class76.field1075.field3655) {
                    var7 = class212.field3023[class77.field1081];
                } else {
                    var7 = class306.field4142[class77.field1081];
                }
                if (class275.field3737.method514()) {
                    ++var7;
                }
                class251.method1501(7, 4, class9.field111, class192.field2809, var7, var5, class275.field3737.method502() > 0);
                for (int var8 = 0; var8 < 4; ++var8) {
                    class264.field3553[var8].method2713(arg0 + -121);
                }
                class225.method1398((byte) -116);
                class363.method2167(false, (byte) -55);
                class35.method255((byte) -98);
                class284.field3854 = null;
                class287.method1649(841283500);
                System.gc();
                class315.method1816((byte) -20, true);
                class480.method2856((byte) 116);
                class153.field2361 = class76.field1075.method1593(class195.field2849, 82);
                class284.field3857 = class76.field1075.field3654;
                class3.field40 = ~class20.field294 <= -97;
                class123.field1906 = class76.field1075.method1597(false, class195.field2849);
                class236.field3269 = !class76.field1075.field3664;
                class332.field4523 = !class76.field1075.method1104(class195.field2849, 0) ? class315.field4267 : -1;
                class124.field1919 = class76.field1075.field3677;
                class116.field1839 = class195.field2849 == 1 || class76.field1075.field3652;
                class256.field3487 = new class177(4, class9.field111, class192.field2809, false);
                if (class374.field5376 == 0) {
                    class372.method2221((byte) 99, class397.field5706, class256.field3487);
                } else {
                    class426.method2541((byte) -120, class397.field5706, class256.field3487);
                }
                class399.method2367(class192.field2809 >> 4, (byte) -116, class9.field111 >> 4);
                class480.method2857(-377250077);
                if (var5) {
                    class438.method2590(true);
                    class369.field5284 = new class177(1, class9.field111, class192.field2809, true);
                    if (class374.field5376 != 0) {
                        class426.method2541((byte) -116, class94.field1536, class369.field5284);
                        class315.method1816((byte) -106, true);
                    } else {
                        class372.method2221((byte) 99, class94.field1536, class369.field5284);
                        class315.method1816((byte) 101, true);
                    }
                    class369.field5284.method1(class256.field3487.field6[0], (byte) 93, 0);
                    class369.field5284.method4((int[][][]) null, -1, (class466[]) null, class275.field3737);
                    class438.method2590(false);
                }
                class256.field3487.method4(!var5 ? null : class369.field5284.field6, -1, class264.field3553, class275.field3737);
                if (arg0 != 10) {
                    method268((byte) -34);
                }
                if (~class374.field5376 != -1) {
                    class315.method1816((byte) 107, true);
                    class494.method2924(class256.field3487, class137.field2065, 121);
                } else {
                    class315.method1816((byte) -113, true);
                    class65.method426(class137.field2065, class256.field3487, arg0 + -127);
                    if (class100.field1585 != null) {
                        class485.method2872(8076);
                    }
                }
                class250.method1490((byte) 107);
                class315.method1816((byte) 103, true);
                class256.field3487.method10(var5 ? class36.field554[0] : null, class275.field3737, arg0 ^ -14199, (class11) null);
                class256.field3487.method1215((byte) -120, class275.field3737);
                class315.method1816((byte) 118, true);
                if (var5) {
                    class438.method2590(true);
                    class315.method1816((byte) -41, true);
                    if (class374.field5376 == 0) {
                        class65.method426(class236.field3273, class369.field5284, arg0 ^ 112);
                    } else {
                        class494.method2924(class369.field5284, class236.field3273, 112);
                    }
                    class250.method1490((byte) 107);
                    class315.method1816((byte) -32, true);
                    class369.field5284.method10((class11) null, class275.field3737, -14205, class348.field5000[0]);
                    class369.field5284.method1215((byte) -120, class275.field3737);
                    class315.method1816((byte) -65, true);
                    class438.method2590(false);
                }
                class105.method816(25418);
                int var9 = class256.field3487.field2653;
                if (class366.field5260 < var9) {
                    var9 = class366.field5260;
                }
                if (~(class366.field5260 - 1) < ~var9) {
                    var9 = class366.field5260 + -1;
                }
                if (!class76.field1075.method1104(class195.field2849, 0)) {
                    class463.method2691(var9);
                } else {
                    class463.method2691(0);
                }
                for (int var10 = 0; ~var10 > -5; ++var10) {
                    for (int var17 = 0; ~var17 > ~class9.field111; ++var17) {
                        for (int var18 = 0; var18 < class192.field2809; ++var18) {
                            class4.method26(var18, var17, (byte) 0, var10);
                        }
                    }
                }
                class432.method2562((byte) -49);
                class287.method1649(841283500);
                class314.method1805(0);
                class250.method1490((byte) 107);
                class341.field4939 = false;
                class413.method2433(19661);
                if (class391.field5642 != null && class104.field1702 != null && ~class494.field7155 == -11) {
                    class274.method1602(arg0 ^ 4, class34.field535);
                    ++class81.field1154;
                    class17.field275.method1858(1057001181, (byte) -77);
                }
                if (~class374.field5376 == -1) {
                    int var11 = (class412.field5874 - (class9.field111 >> 4)) / 8;
                    int var12 = ((class9.field111 >> 4) + class412.field5874) / 8;
                    int var13 = (-(class192.field2809 >> 4) + class334.field4874) / 8;
                    int var14 = ((class192.field2809 >> 4) + class334.field4874) / 8;
                    for (int var15 = var11 + -1; var15 <= var12 + 1; ++var15) {
                        for (int var16 = var13 + -1; var16 <= var14 - -1; ++var16) {
                            if (var15 < var11 || ~var12 > ~var15 || ~var16 > ~var13 || var16 > var14) {
                                class103.field1618.method2516("m" + var15 + "_" + var16, arg0 + 5454);
                                class103.field1618.method2516("l" + var15 + "_" + var16, arg0 + 5454);
                            }
                        }
                    }
                }
                if (class494.field7155 == 3) {
                    class63.method421(2, true);
                } else if (class494.field7155 == 7) {
                    class63.method421(6, true);
                } else {
                    class63.method421(9, true);
                    if (class104.field1702 != null) {
                        class274.method1602(14, class234.field3250);
                    }
                }
                class311.method1795(-1);
                class287.method1649(841283500);
                class441.method2607(0);
            }
        }
    }

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "(B)V", line = 597)
    public static final void method268(byte arg0) {
        class53.field759 = new class432(8);
        ++field569;
        class516.field7580 = 0;
        class471 var1 = (class471) class32.field475.method2600((byte) -124);
        if (arg0 <= 105) {
            method265((class319) null, -71);
        }
        while (var1 != null) {
            var1.method2730();
            var1 = (class471) class32.field475.method2601(109);
        }
    }
}
