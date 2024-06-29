import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class456 extends class499 {

    @OriginalMember(owner = "client!hk", name = "m", descriptor = "I")
    private int field6213;

    @OriginalMember(owner = "client!hk", name = "q", descriptor = "I")
    private int field6217;

    @OriginalMember(owner = "client!hk", name = "i", descriptor = "I")
    private int field6209;

    @OriginalMember(owner = "client!hk", name = "h", descriptor = "I")
    private int field6208;

    @OriginalMember(owner = "client!hk", name = "r", descriptor = "I")
    public static int field6218 = 1406;

    @OriginalMember(owner = "client!hk", name = "n", descriptor = "Llp;")
    public static class270 field6214 = new class270(4, 1, 1, 1);

    @OriginalMember(owner = "client!hk", name = "s", descriptor = "Z")
    public static boolean field6219 = false;

    @OriginalMember(owner = "client!hk", name = "g", descriptor = "I")
    public static int field6207;

    @OriginalMember(owner = "client!hk", name = "j", descriptor = "I")
    public static int field6210;

    @OriginalMember(owner = "client!hk", name = "k", descriptor = "I")
    public static int field6211;

    @OriginalMember(owner = "client!hk", name = "l", descriptor = "I")
    public static int field6212;

    @OriginalMember(owner = "client!hk", name = "o", descriptor = "I")
    public static int field6215;

    @OriginalMember(owner = "client!hk", name = "p", descriptor = "I")
    public static int field6216;

    @OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(IIIIII)V", line = 4)
    public class456(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field6213 = arg3;
        this.field6217 = arg2;
        this.field6209 = arg1;
        this.field6208 = arg0;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(ILdw;Z)V", line = 16)
    public static final void method2580(int arg0, class676 arg1, boolean arg2) {
        ++field6207;
        if (class179.field2242 < 400) {
            class195 var3 = arg1.field9594;
            int var4 = 115 % ((-74 - arg0) / 32);
            if (var3.field2557 != null) {
                var3 = var3.method1242(class327.field4771, (byte) -32);
                if (var3 == null) {
                    return;
                }
            }
            if (var3.field2576) {
                String var5 = var3.field2572;
                if (var3.field2573 != 0) {
                    String var6 = class411.field5764 != class33.field322 ? class243.field3239.method1491(class350.field5121, (byte) 127) : class243.field3241.method1491(class350.field5121, (byte) 126);
                    var5 = var5 + class365.method2240(var3.field2573, (byte) -88, class596.field8164.field7197) + " (" + var6 + var3.field2573 + ")";
                }
                if (class613.field8378 && !arg2) {
                    class579 var7 = ~class525.field7257 == 0 ? null : class191.field2486.method1256(class525.field7257, -3934);
                    if ((class525.field7268 & 2) != 0 && (var7 == null || var3.method1249(class525.field7257, var7.field7999, (byte) 127) != var7.field7999)) {
                        class606.method3350(0, (long) arg1.field463, false, 0, class306.field4114, class413.field5798, 57, class665.field9444 + " -> <col=ffff00>" + var5, -1, true, false);
                        ++class131.field1672;
                    }
                }
                if (!arg2) {
                    String[] var8 = var3.field2535;
                    if (class487.field6580) {
                        var8 = class460.method2600(-20789, var8);
                    }
                    if (var8 != null) {
                        for (int var9 = 4; ~var9 <= -1; --var9) {
                            if (var8[var9] != null && (~var3.field2588 == -1 || !var8[var9].equalsIgnoreCase(class243.field3234.method1491(class350.field5121, (byte) 127)))) {
                                byte var10 = 0;
                                if (~var9 == -1) {
                                    var10 = 12;
                                }
                                int var11 = class30.field300;
                                if (var9 == 1) {
                                    var10 = 60;
                                }
                                if (var9 == 2) {
                                    var10 = 13;
                                }
                                if (var9 == 3) {
                                    var10 = 51;
                                }
                                if (var9 == 4) {
                                    var10 = 49;
                                }
                                if (var3.field2569 == var9) {
                                    var11 = var3.field2533;
                                }
                                if (~var3.field2536 == ~var9) {
                                    var11 = var3.field2582;
                                }
                                ++class188.field2372;
                                class606.method3350(0, (long) arg1.field463, false, 0, var8[var9], var8[var9].equalsIgnoreCase(class243.field3234.method1491(class350.field5121, (byte) 127)) ? var3.field2578 : var11, var10, "<col=ffff00>" + var5, -1, true, false);
                            }
                        }
                    }
                    if (~var3.field2588 == -2 && var8 != null) {
                        for (int var12 = 4; var12 >= 0; --var12) {
                            if (var8[var12] != null && var8[var12].equalsIgnoreCase(class243.field3234.method1491(class350.field5121, (byte) 126))) {
                                short var13 = 0;
                                if (var3.field2573 > class596.field8164.field7197) {
                                    var13 = 2000;
                                }
                                short var14 = 0;
                                if (var12 == 0) {
                                    var14 = 12;
                                }
                                if (~var12 == -2) {
                                    var14 = 60;
                                }
                                if (var12 == 2) {
                                    var14 = 13;
                                }
                                if (~var12 == -4) {
                                    var14 = 51;
                                }
                                if (var12 == 4) {
                                    var14 = 49;
                                }
                                if (var14 != 0) {
                                    var14 += var13;
                                }
                                class606.method3350(0, (long) arg1.field463, false, 0, var8[var12], var3.field2578, var14, "<col=ffff00>" + var5, -1, true, false);
                                ++class186.field2276;
                            }
                        }
                    }
                }
                class606.method3350(0, (long) arg1.field463, false, 0, class243.field3233.method1491(class350.field5121, (byte) 126), class192.field2490, 1004, "<col=ffff00>" + var5, -1, true, arg2);
                ++class30.field291;
            }
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(I)V", line = 181)
    public static void method2581(int arg0) {
        field6214 = null;
        if (arg0 != 4) {
            field6219 = true;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(BLoa;Le;)V", line = 194)
    public static final void method2582(byte arg0, class689 arg1, class479 arg2) {
        ++field6215;
        if (class561.field7647 != null) {
            if (~class143.field1820 > -11) {
                if (!class561.field7648.method1083(-119, class561.field7647.field3375)) {
                    class143.field1820 = class307.field4123.method1073(0, class561.field7647.field3375) / 10;
                    return;
                }
                class189.method1220((byte) 125);
                class143.field1820 = 10;
            }
            if (class143.field1820 == 10) {
                class561.field7661 = class561.field7647.field3373 >> 6 << 6;
                class561.field7675 = class561.field7647.field3370 >> 6 << 6;
                class561.field7676 = (class561.field7647.field3374 >> 6 << 6) - class561.field7661 - -64;
                class561.field7667 = (class561.field7647.field3361 >> 6 << 6) + 64 + -class561.field7675;
                int[] var3 = new int[3];
                int var4 = -1;
                int var5 = -1;
                if (class561.field7647.method1559((class596.field8164.field3929 >> 9) + class253.field3490, 0, class596.field8164.field3925, (class596.field8164.field3917 >> 9) + class186.field2280, var3)) {
                    var4 = var3[1] + -class561.field7661;
                    var5 = var3[2] + -class561.field7675;
                }
                if (!class141.field1799 && ~var4 <= -1 && class561.field7676 > var4 && ~var5 <= -1 && class561.field7667 > var5) {
                    int var6 = var4 + ((int) (10.0D * Math.random()) - 5);
                    int var7 = var5 + ((int) (10.0D * Math.random()) - 5);
                    class52.field677 = var6;
                    class351.field5122 = var7;
                } else if (class582.field8026 != -1 && class309.field4144 != -1) {
                    class561.field7647.method1558(class582.field8026, false, class309.field4144, var3);
                    class141.field1799 = false;
                    if (var3 != null) {
                        class351.field5122 = var3[2] + -class561.field7675;
                        class52.field677 = var3[1] - class561.field7661;
                    }
                    class309.field4144 = -1;
                    class582.field8026 = -1;
                } else {
                    class561.field7647.method1558((class561.field7647.field3367 & 268422904) >> 14, false, 16383 & class561.field7647.field3367, var3);
                    class351.field5122 = var3[2] + -class561.field7675;
                    class52.field677 = var3[1] + -class561.field7661;
                }
                if (~class561.field7647.field3372 == -38) {
                    class561.field7651 = 3.0F;
                    class561.field7650 = 3.0F;
                } else if (class561.field7647.field3372 != 50) {
                    if (~class561.field7647.field3372 != -76) {
                        if (class561.field7647.field3372 != 100) {
                            if (class561.field7647.field3372 == 200) {
                                class561.field7651 = 16.0F;
                                class561.field7650 = 16.0F;
                            } else {
                                class561.field7651 = 8.0F;
                                class561.field7650 = 8.0F;
                            }
                        } else {
                            class561.field7651 = 8.0F;
                            class561.field7650 = 8.0F;
                        }
                    } else {
                        class561.field7651 = 6.0F;
                        class561.field7650 = 6.0F;
                    }
                } else {
                    class561.field7651 = 4.0F;
                    class561.field7650 = 4.0F;
                }
                class561.field7659 = (int) class561.field7651 >> 1;
                class561.field7657 = class244.method1495(true, class561.field7659);
                class511.method2892(-1);
                class561.method3165();
                class626.field8524 = new class59();
                class561.field7655 += (int) (Math.random() * 5.0D) + -2;
                if (class561.field7655 < -8) {
                    class561.field7655 = -8;
                }
                if (class561.field7655 > 8) {
                    class561.field7655 = 8;
                }
                class561.field7654 += (int) (Math.random() * 5.0D) - 2;
                if (class561.field7654 < -16) {
                    class561.field7654 = -16;
                }
                if (class561.field7654 > 16) {
                    class561.field7654 = 16;
                }
                class561.method3166(arg2, class561.field7655 >> 2 << 10, class561.field7654 >> 1);
                class561.field7649.method219(1024, (byte) -127, 256);
                class561.field7646.method1011(256, 34, 256);
                class561.field7643.method1743((byte) 73, 4096);
                class150.field1888.method3003(256, (byte) 95);
                class143.field1820 = 20;
            } else if (~class143.field1820 == -21) {
                class448.method2563(-51, true);
                class561.method3151(arg1, class561.field7655, class561.field7654);
                class143.field1820 = 60;
                class448.method2563(-51, true);
                class471.method2653(-78);
            } else if (~class143.field1820 == -61) {
                if (class561.field7648.method1062(101, class561.field7647.field3375 + "_staticelements")) {
                    if (!class561.field7648.method1083(-91, class561.field7647.field3375 + "_staticelements")) {
                        return;
                    }
                    class561.field7656 = class157.method1052(class561.field7647.field3375 + "_staticelements", class624.field8492, (byte) -75, class561.field7648);
                } else {
                    class561.field7656 = new class610(0);
                }
                class561.method3159();
                class143.field1820 = 70;
                class448.method2563(-51, true);
                class471.method2653(-63);
            } else if (class143.field1820 == 70) {
                class227.field2972 = new class540(arg1, 11, true, class249.field3351);
                class143.field1820 = 73;
                class448.method2563(-51, true);
                class471.method2653(124);
            } else if (~class143.field1820 == -74) {
                class436.field6033 = new class540(arg1, 12, true, class249.field3351);
                class143.field1820 = 76;
                class448.method2563(-51, true);
                class471.method2653(-120);
            } else if (class143.field1820 == 76) {
                class426.field5925 = new class540(arg1, 14, true, class249.field3351);
                class143.field1820 = 79;
                class448.method2563(-51, true);
                class471.method2653(98);
            } else if (~class143.field1820 == -80) {
                class654.field9262 = new class540(arg1, 17, true, class249.field3351);
                class143.field1820 = 82;
                class448.method2563(-51, true);
                class471.method2653(-113);
            } else if (class143.field1820 == 82) {
                class2.field16 = new class540(arg1, 19, true, class249.field3351);
                class143.field1820 = 85;
                class448.method2563(-51, true);
                class471.method2653(-86);
            } else if (arg0 < -102) {
                if (class143.field1820 == 85) {
                    class643.field9113 = new class540(arg1, 22, true, class249.field3351);
                    class143.field1820 = 88;
                    class448.method2563(-51, true);
                    class471.method2653(123);
                } else if (~class143.field1820 == -89) {
                    class282.field3781 = new class540(arg1, 26, true, class249.field3351);
                    class143.field1820 = 91;
                    class448.method2563(-51, true);
                    class471.method2653(-112);
                } else {
                    class85.field1050 = new class540(arg1, 30, true, class249.field3351);
                    class143.field1820 = 100;
                    class448.method2563(-51, true);
                    class471.method2653(79);
                    System.gc();
                }
            }
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IBI)V", line = 426)
    public final void method1380(int arg0, byte arg1, int arg2) {
        ++field6211;
        if (arg1 != -20) {
            method2580(94, (class676) null, false);
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(III)V", line = 439)
    public final void method1376(int arg0, int arg1, int arg2) {
        ++field6212;
        int var4 = this.field6208 * arg2 >> 12;
        int var5 = this.field6217 * arg2 >> 12;
        int var6 = this.field6209 * arg1 >> 12;
        if (arg0 >= 16) {
            int var7 = this.field6213 * arg1 >> 12;
            class204.method1279(var6, var4, var5, var7, super.field6739, (byte) -57);
        }
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(III)V", line = 458)
    public final void method1374(int arg0, int arg1, int arg2) {
        if (arg1 < -112) {
            ++field6216;
        }
    }
}
