import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qw")
public class class72 extends class377 {

    @OriginalMember(owner = "client!qw", name = "D", descriptor = "I")
    public static int field929 = 0;

    @OriginalMember(owner = "client!qw", name = "J", descriptor = "Ldr;")
    public static class675 field935 = new class675(74, 7);

    @OriginalMember(owner = "client!qw", name = "O", descriptor = "Z")
    public static boolean field940 = false;

    @OriginalMember(owner = "client!qw", name = "z", descriptor = "I")
    public static int field925;

    @OriginalMember(owner = "client!qw", name = "A", descriptor = "I")
    public static int field926;

    @OriginalMember(owner = "client!qw", name = "B", descriptor = "I")
    public static int field927;

    @OriginalMember(owner = "client!qw", name = "C", descriptor = "I")
    public static int field928;

    @OriginalMember(owner = "client!qw", name = "E", descriptor = "I")
    public static int field930;

    @OriginalMember(owner = "client!qw", name = "F", descriptor = "I")
    public static int field931;

    @OriginalMember(owner = "client!qw", name = "G", descriptor = "I")
    public static int field932;

    @OriginalMember(owner = "client!qw", name = "H", descriptor = "I")
    public static int field933;

    @OriginalMember(owner = "client!qw", name = "I", descriptor = "I")
    public static int field934;

    @OriginalMember(owner = "client!qw", name = "K", descriptor = "I")
    public static int field936;

    @OriginalMember(owner = "client!qw", name = "L", descriptor = "I")
    public static int field937;

    @OriginalMember(owner = "client!qw", name = "M", descriptor = "I")
    public static int field938;

    @OriginalMember(owner = "client!qw", name = "N", descriptor = "Lpfa;")
    public static class275 field939;

    @OriginalMember(owner = "client!qw", name = "P", descriptor = "Lqj;")
    public static class476 field941;

    @OriginalMember(owner = "client!qw", name = "b", descriptor = "(III)Z")
    public static final boolean method562(int arg0, int arg1, int arg2) {
        if (arg1 != -29056) {
            return true;
        } else {
            ++field933;
            return class89.method668(arg2, true, arg0) | (458752 & arg0) != 0 || class20.method124(arg0, 23008, arg2);
        }
    }

    @OriginalMember(owner = "client!qw", name = "<init>", descriptor = "()V")
    public class72() {
        super(0, true);
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(Lpw;III)Ljg;")
    public static final class317 method563(class661 arg0, int arg1, int arg2, int arg3) {
        ++field934;
        if (arg1 != 6646) {
            return null;
        } else {
            int var4 = arg0.field8968 | arg3 << 10;
            class317 var5 = (class317) class269.field3394.method1046(100, (long) var4 << 16);
            if (var5 != null) {
                return var5;
            } else {
                byte[] var6 = class261.field3309.method1648(-103, class261.field3309.method1652(-1, var4));
                if (var6 != null) {
                    if (var6.length <= 1) {
                        return null;
                    } else {
                        class317 var7 = class22.method141(var6, 82);
                        var7.field3972 = arg0;
                        class269.field3394.method1042((long) var4 << 16, var7, true);
                        return var7;
                    }
                } else {
                    int var8 = arg2 + 65536 << 10 | arg0.field8968;
                    class317 var9 = (class317) class269.field3394.method1046(arg1 + -6546, (long) var8 << 16);
                    if (var9 != null) {
                        return var9;
                    } else {
                        byte[] var10 = class261.field3309.method1648(arg1 + -6749, class261.field3309.method1652(arg1 ^ -6647, var8));
                        if (var10 != null) {
                            if (var10.length <= 1) {
                                return null;
                            } else {
                                class317 var11 = class22.method141(var10, 95);
                                var11.field3972 = arg0;
                                class269.field3394.method1042((long) var8 << 16, var11, true);
                                return var11;
                            }
                        } else {
                            int var12 = arg0.field8968 | 67107840;
                            class317 var13 = (class317) class269.field3394.method1046(100, (long) var12 << 16);
                            if (var13 != null) {
                                return var13;
                            } else {
                                byte[] var14 = class261.field3309.method1648(arg1 + -6525, class261.field3309.method1652(arg1 ^ -6647, var12));
                                if (var14 != null) {
                                    if (var14.length <= 1) {
                                        return null;
                                    } else {
                                        class317 var15 = class22.method141(var14, arg1 ^ 6566);
                                        var15.field3972 = arg0;
                                        class269.field3394.method1042((long) var12 << 16, var15, true);
                                        return var15;
                                    }
                                } else {
                                    return null;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(IBIIII)V")
    public static final void method564(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field932;
        int var6 = 0;
        int var7 = arg3;
        int var8 = arg2 * arg2;
        int var9 = arg3 * arg3;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        if (arg1 != -82) {
            field941 = null;
        }
        int var12 = arg3 << 1;
        int var13 = (-var12 + 1) * var8 + var10;
        int var14 = -((var12 - 1) * var11) + var9;
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg3 << 1) + -3) * var11;
        int var19 = (var6 + 1) * var16;
        int var20 = (arg3 - 1) * var15;
        if (arg4 >= class125.field1524 && ~class377.field4848 <= ~arg4) {
            int var21 = class654.method3659(-7690, arg0 + arg2, class337.field4186, class292.field3700);
            int var22 = class654.method3659(arg1 ^ 7768, arg0 - arg2, class337.field4186, class292.field3700);
            class390.method2223(var22, arg5, class30.field364[arg4], (byte) -121, var21);
        }
        while (var7 > 0) {
            if (~var13 > -1) {
                while (var13 < 0) {
                    var14 += var19;
                    var13 += var17;
                    var17 += var16;
                    var19 += var16;
                    ++var6;
                }
            }
            if (var14 < 0) {
                var13 += var17;
                var14 += var19;
                var17 += var16;
                ++var6;
                var19 += var16;
            }
            var14 += -var18;
            var13 += -var20;
            var20 -= var15;
            var18 -= var15;
            --var7;
            int var23 = -var7 + arg4;
            int var24 = arg4 + var7;
            if (class125.field1524 <= var24 && ~var23 >= ~class377.field4848) {
                int var25 = class654.method3659(arg1 + -7608, arg0 + var6, class337.field4186, class292.field3700);
                int var26 = class654.method3659(arg1 + -7608, -var6 + arg0, class337.field4186, class292.field3700);
                if (var23 >= class125.field1524) {
                    class390.method2223(var26, arg5, class30.field364[var23], (byte) -76, var25);
                }
                if (var24 <= class377.field4848) {
                    class390.method2223(var26, arg5, class30.field364[var24], (byte) -86, var25);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(ILjava/lang/String;I[B)I")
    public static final int method565(int arg0, String arg1, int arg2, byte[] arg3) {
        ++field926;
        if (arg0 >= -35) {
            field940 = true;
        }
        int var4 = arg1.length();
        int var5 = arg2;
        for (int var6 = 0; var4 > var6; ++var6) {
            char var7 = arg1.charAt(var6);
            if (var7 > 127) {
                if (~var7 >= -2048) {
                    arg3[var5++] = (byte) (class364.method2113(12334, var7) >> 6);
                    arg3[var5++] = (byte) class364.method2113(128, class109.method762(var7, 63));
                } else {
                    arg3[var5++] = (byte) (class364.method2113(var7, 918536) >> 12);
                    arg3[var5++] = (byte) class364.method2113(class109.method762(63, var7 >> 6), 128);
                    arg3[var5++] = (byte) class364.method2113(128, class109.method762(63, var7));
                }
            } else {
                arg3[var5++] = (byte) var7;
            }
        }
        return -arg2 + var5;
    }

    @OriginalMember(owner = "client!qw", name = "f", descriptor = "(I)V")
    public static void method566(int arg0) {
        int var1 = 52 / ((arg0 - -46) / 52);
        field939 = null;
        field941 = null;
        field935 = null;
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(ILqf;)V")
    public static final void method567(int arg0, class638 arg1) {
        arg1.method3582(arg0 ^ -20850);
        if (arg0 == 20789) {
            ++field937;
            int var2 = class350.field4523;
            class365 var3 = class67.field815 = class132.field1601[var2] = new class365();
            var3.field495 = var2;
            int var4 = arg1.method3578(8, 30);
            byte var5 = (byte) (var4 >> 28);
            int var6 = var4 >> 14 & 16383;
            int var7 = 16383 & var4;
            var3.field508[0] = -class227.field2938 + var6;
            var3.field8018 = (var3.field508[0] << 9) - -(var3.method210(false) << 8);
            var3.field511[0] = -class522.field6612 + var7;
            var3.field8011 = (var3.field511[0] << 9) - -(var3.method210(false) << 8);
            class675.field9219 = var3.field8010 = var5;
            if (class171.field2000[var2] != null) {
                var3.method2122(arg0 + -20790, class171.field2000[var2]);
            }
            class149.field1788 = 0;
            class95.field1239[class149.field1788++] = var2;
            class518.field6559[var2] = 0;
            class22.field245 = 0;
            for (int var8 = 1; ~var8 > -2049; ++var8) {
                if (~var2 != ~var8) {
                    int var9 = arg1.method3578(8, 18);
                    int var10 = var9 >> 16;
                    int var11 = 255 & var9 >> 8;
                    int var12 = 255 & var9;
                    class240 var13 = class232.field3014[var8] = new class240();
                    var13.field3106 = (var10 << 28) + (var11 << 14) + var12;
                    var13.field3110 = false;
                    var13.field3113 = -1;
                    var13.field3107 = 0;
                    class372.field4798[class22.field245++] = var8;
                    class518.field6559[var8] = 0;
                }
            }
            arg1.method3576((byte) 36);
        }
    }

    @OriginalMember(owner = "client!qw", name = "b", descriptor = "(II)Lrba;")
    public static final class401 method568(int arg0, int arg1) {
        int var2 = 78 % ((-13 - arg0) / 43);
        ++field931;
        class401 var3 = (class401) class69.field903.method1221((long) arg1, true);
        if (var3 != null) {
            return var3;
        } else {
            byte[] var4 = class686.field9369.method1659(-40, arg1, 0);
            class401 var5 = new class401();
            if (var4 != null) {
                var5.method2258(true, new class572(var4));
            }
            var5.method2262((byte) -102);
            class69.field903.method1230((byte) 84, (long) arg1, var5);
            return var5;
        }
    }

    @OriginalMember(owner = "client!qw", name = "e", descriptor = "(B)V")
    public static final void method569(byte arg0) {
        class461.field5748 = class321.field3994.field207 - -class321.field3994.field225 + 2;
        ++field938;
        class126.field1543 = class36.field540.field225 + class36.field540.field207 + 2;
        class350.field4526 = new String[500];
        for (int var1 = 0; ~var1 > ~class350.field4526.length; ++var1) {
            class350.field4526[var1] = "";
        }
        int var2 = 1 % ((arg0 - -85) / 37);
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(IBZILrr;)V")
    public static final void method570(int arg0, byte arg1, boolean arg2, int arg3, class337 arg4) {
        ++field927;
        int var5 = arg4.field4309;
        if (arg4.field4202 != 0) {
            if (arg4.field4202 == 1) {
                arg4.field4309 = -arg4.field4306 + arg0;
            } else if (~arg4.field4202 == -3) {
                arg4.field4309 = arg4.field4306 * arg0 >> 14;
            }
        } else {
            arg4.field4309 = arg4.field4306;
        }
        int var6 = arg4.field4211;
        if (arg4.field4274 == 0) {
            arg4.field4211 = arg4.field4239;
        } else if (arg4.field4274 != 1) {
            if (~arg4.field4274 == -3) {
                arg4.field4211 = arg4.field4239 * arg3 >> 14;
            }
        } else {
            arg4.field4211 = -arg4.field4239 + arg3;
        }
        int var7 = 2 / ((arg1 - -1) / 54);
        if (~arg4.field4202 == -5) {
            arg4.field4309 = arg4.field4215 * arg4.field4211 / arg4.field4163;
        }
        if (~arg4.field4274 == -5) {
            arg4.field4211 = arg4.field4309 * arg4.field4163 / arg4.field4215;
        }
        if (class373.field4819 && (client.method1693(arg4).field4604 != 0 || ~arg4.field4212 == -1)) {
            if (arg4.field4211 < 5 && arg4.field4309 < 5) {
                arg4.field4211 = 5;
                arg4.field4309 = 5;
            } else {
                if (arg4.field4309 <= 0) {
                    arg4.field4309 = 5;
                }
                if (arg4.field4211 <= 0) {
                    arg4.field4211 = 5;
                }
            }
        }
        if (class710.field9928 == arg4.field4298) {
            class228.field2952 = arg4;
        }
        if (arg2 && arg4.field4232 != null) {
            if (~arg4.field4309 != ~var5 || arg4.field4211 != var6) {
                class402 var8 = new class402();
                var8.field5154 = arg4;
                var8.field5153 = arg4.field4232;
                class144.field1743.method1904(var8, -42);
            }
        }
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(II)[I")
    public final int[] method88(int arg0, int arg1) {
        ++field928;
        int[] var3 = super.field4842.method2772(arg0, (byte) -127);
        if (super.field4842.field6354) {
            class70.method558(var3, 0, class528.field6661, class596.field8003[arg0]);
        }
        int var4 = 115 % ((arg1 - 5) / 53);
        return var3;
    }

    @OriginalMember(owner = "client!qw", name = "b", descriptor = "(BLjava/lang/String;)V")
    public static final void method571(byte arg0, String arg1) {
        ++field936;
        if (class485.field6032 != null) {
            ++class290.field3655;
            if (arg0 != -33) {
                method562(-107, -9, -79);
            }
            class124 var2 = class336.method1924(class240.field3112, class636.field8620, (byte) -71);
            var2.field1516.method3090(class680.method3757((byte) 60, arg1), 3);
            var2.field1516.method3050(false, arg1);
            class197.method1156((byte) 93, var2);
        }
    }

    @OriginalMember(owner = "client!qw", name = "c", descriptor = "(II)V")
    public static final void method572(int arg0, int arg1) {
        ++field925;
        if (~arg1 != 0) {
            if (class492.field6136[arg1]) {
                if (arg0 < 34) {
                    method567(-51, (class638) null);
                }
                class276.field3526.method1656(arg1, 1);
                class325.field4062[arg1] = null;
                class79.field1035[arg1] = null;
                class492.field6136[arg1] = false;
            }
        }
    }
}
