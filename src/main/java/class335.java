import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public class class335 extends class403 implements class9 {

    @OriginalMember(owner = "client!on", name = "j", descriptor = "I")
    private int field4741;

    @OriginalMember(owner = "client!on", name = "c", descriptor = "I")
    public static int field4734;

    @OriginalMember(owner = "client!on", name = "d", descriptor = "I")
    public static int field4735;

    @OriginalMember(owner = "client!on", name = "e", descriptor = "I")
    public static int field4736;

    @OriginalMember(owner = "client!on", name = "f", descriptor = "I")
    public static int field4737;

    @OriginalMember(owner = "client!on", name = "g", descriptor = "I")
    public static int field4738;

    @OriginalMember(owner = "client!on", name = "h", descriptor = "I")
    public static int field4739;

    @OriginalMember(owner = "client!on", name = "i", descriptor = "I")
    public static int field4740;

    @OriginalMember(owner = "client!on", name = "k", descriptor = "I")
    public static int field4742;

    @OriginalMember(owner = "client!on", name = "l", descriptor = "I")
    public static int field4743;

    @OriginalMember(owner = "client!on", name = "m", descriptor = "I")
    public static int field4744;

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(ILud;)Lhl;")
    public static final class525 method2139(int arg0, class35 arg1) {
        if (arg0 != 3) {
            field4737 = -71;
        }
        ++field4738;
        class519 var2 = class259.method1758(arg1, (byte) 99);
        int var3 = arg1.method225((byte) 100);
        return new class525(var2.field3713, var2.field3711, var2.field3710, var2.field3702, var2.field3705, var2.field3701, var2.field3714, var2.field3709, var2.field3715, var2.field7359, var2.field7366, var2.field7371, var2.field7367, var2.field7360, var2.field7363, var3);
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(IIIIIZI)V")
    public static final void method2140(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        ++field4736;
        int var7 = -97 % ((arg0 - 30) / 54);
        if (~(!arg5 ? class471.field6781.field6690.method3134(27669) : class471.field6781.field6666.method3134(27669)) != -1 && arg4 != 0 && class570.field8115 < 50 && arg2 != -1) {
            class719.field10073[class570.field8115++] = new class710((byte) (!arg5 ? 2 : 3), arg2, arg4, arg6, arg3, 0, arg1, (class43) null);
        }
    }

    @OriginalMember(owner = "client!on", name = "<init>", descriptor = "(Loea;I[BI)V")
    public class335(class594 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field4741 = arg1;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(B)J")
    public final long method52(byte arg0) {
        ++field4742;
        if (arg0 < 120) {
            this.field4741 = -85;
        }
        return super.field5625.getAddress();
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(I)I")
    public final int method51(int arg0) {
        if (arg0 != -29868) {
            field4737 = -84;
        }
        ++field4739;
        return this.field4741;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(Lha;I)V")
    public static final void method2141(class58 arg0, int arg1) {
        if (arg1 != 88) {
            method2140(-74, 6, -55, 68, 38, false, 96);
        }
        ++field4743;
        class242.field3393 = class66.method697(class299.field4155, true, (byte) -11, arg0);
        class119.field1867 = class268.method1793(arg0, (byte) 123, class299.field4155);
        class722.field10090 = class66.method697(class590.field8281, true, (byte) -11, arg0);
        class436.field6100 = class268.method1793(arg0, (byte) -115, class590.field8281);
        class537.field7568 = class66.method697(class515.field7339, true, (byte) -11, arg0);
        class419.field5896 = class268.method1793(arg0, (byte) -53, class515.field7339);
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(IIII[IIII)Z")
    public static final boolean method2142(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7) {
        if (~arg1 > -1) {
            arg1 = 0;
        }
        if (arg3 != 0) {
            return false;
        } else {
            if (~arg2 < ~class136.field2124) {
                arg2 = class136.field2124;
            }
            ++field4734;
            if (~arg2 >= ~arg1) {
                return true;
            } else {
                int var8 = -arg1 + arg2 >> 2;
                int var9 = arg1 + -1 + arg5;
                int var10 = arg0 * arg1 + arg6;
                int var10000;
                if (class78.field1461 == 1) {
                    class671.field9405 += var8;
                    while (true) {
                        --var8;
                        if (var8 < 0) {
                            int var11 = -arg1 + arg2 & 3;
                            while (true) {
                                --var11;
                                if (var11 < 0) {
                                    return true;
                                }
                                var10000 = ~var10;
                                ++var9;
                                if (var10000 > ~arg4[var9]) {
                                    arg4[var9] = var10;
                                }
                                var10 += arg0;
                            }
                        }
                        var10000 = ~var10;
                        ++var9;
                        if (var10000 > ~arg4[var9]) {
                            arg4[var9] = var10;
                        }
                        int var12 = arg0 + var10;
                        var10000 = ~var12;
                        ++var9;
                        if (var10000 > ~arg4[var9]) {
                            arg4[var9] = var12;
                        }
                        int var13 = arg0 + var12;
                        ++var9;
                        if (~arg4[var9] < ~var13) {
                            arg4[var9] = var13;
                        }
                        int var14 = arg0 + var13;
                        ++var9;
                        if (var14 < arg4[var9]) {
                            arg4[var9] = var14;
                        }
                        var10 = arg0 + var14;
                    }
                } else {
                    int var15 = var10 - 38400;
                    while (true) {
                        --var8;
                        if (~var8 > -1) {
                            int var16 = -arg1 + arg2 & 3;
                            while (true) {
                                --var16;
                                if (var16 < 0) {
                                    return true;
                                }
                                ++var9;
                                if (arg4[var9] > var15) {
                                    return false;
                                }
                                var15 += arg0;
                            }
                        }
                        var10000 = ~var15;
                        ++var9;
                        if (var10000 > ~arg4[var9]) {
                            return false;
                        }
                        int var17 = arg0 + var15;
                        ++var9;
                        if (arg4[var9] > var17) {
                            return false;
                        }
                        int var18 = arg0 + var17;
                        ++var9;
                        if (~arg4[var9] < ~var18) {
                            return false;
                        }
                        int var19 = arg0 + var18;
                        ++var9;
                        if (arg4[var9] > var19) {
                            return false;
                        }
                        var15 = arg0 + var19;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(Lha;Ld;I)V")
    public static final void method2143(class58 arg0, class149 arg1, int arg2) {
        ++field4735;
        if (class542.field7619 != null) {
            if (class442.field6163 < 10) {
                if (!class542.field7611.method1470(class542.field7619.field10148, arg2 + -3497)) {
                    class442.field6163 = class588.field8272.method1460(class542.field7619.field10148, (byte) 124) / 10;
                    return;
                }
                class594.method3406(26983);
                class442.field6163 = 10;
            }
            if (~class442.field6163 == -11) {
                class542.field7644 = class542.field7619.field10155 >> 6 << 6;
                class542.field7632 = class542.field7619.field10157 >> 6 << 6;
                class542.field7636 = (class542.field7619.field10149 >> 6 << 6) + 64 + -class542.field7644;
                class542.field7639 = (class542.field7619.field10154 >> 6 << 6) + -class542.field7632 + 64;
                int[] var3 = new int[3];
                int var4 = -1;
                int var5 = -1;
                if (class542.field7619.method4037((class468.field6748.field644 >> 9) + class115.field1845, class468.field6748.field649, 12800, var3, class64.field1160 - -(class468.field6748.field648 >> 9))) {
                    var4 = var3[1] + -class542.field7632;
                    var5 = var3[2] + -class542.field7644;
                }
                if (!class712.field9953 && ~var4 <= -1 && class542.field7639 > var4 && var5 >= 0 && ~class542.field7636 < ~var5) {
                    int var6 = var5 + ((int) (Math.random() * 10.0D) - 5);
                    int var7 = var4 + (int) (10.0D * Math.random()) + -5;
                    class587.field8271 = var7;
                    class590.field8288 = var6;
                } else if (class373.field5233 != -1 && ~class545.field7687 != 0) {
                    class542.field7619.method4033((byte) 53, var3, class373.field5233, class545.field7687);
                    if (var3 != null) {
                        class587.field8271 = var3[1] - class542.field7632;
                        class590.field8288 = var3[2] + -class542.field7644;
                    }
                    class712.field9953 = false;
                    class545.field7687 = -1;
                    class373.field5233 = -1;
                } else {
                    class542.field7619.method4033((byte) 53, var3, (268431993 & class542.field7619.field10140) >> 14, 16383 & class542.field7619.field10140);
                    class590.field8288 = var3[2] + -class542.field7644;
                    class587.field8271 = var3[1] + -class542.field7632;
                }
                if (class542.field7619.field10147 == 37) {
                    class542.field7623 = 3.0F;
                    class542.field7628 = 3.0F;
                } else if (~class542.field7619.field10147 == -51) {
                    class542.field7623 = 4.0F;
                    class542.field7628 = 4.0F;
                } else if (class542.field7619.field10147 == 75) {
                    class542.field7623 = 6.0F;
                    class542.field7628 = 6.0F;
                } else if (~class542.field7619.field10147 != -101) {
                    if (~class542.field7619.field10147 != -201) {
                        class542.field7623 = 8.0F;
                        class542.field7628 = 8.0F;
                    } else {
                        class542.field7623 = 16.0F;
                        class542.field7628 = 16.0F;
                    }
                } else {
                    class542.field7623 = 8.0F;
                    class542.field7628 = 8.0F;
                }
                class542.field7621 = (int) class542.field7623 >> 1;
                class542.field7622 = class422.method2581(class542.field7621, (byte) -76);
                class63.method682((byte) 126);
                class542.method3200();
                class353.field4969 = new class220();
                class542.field7627 += -2 + (int) (Math.random() * 5.0D);
                if (~class542.field7627 > 7) {
                    class542.field7627 = -8;
                }
                if (class542.field7627 > 8) {
                    class542.field7627 = 8;
                }
                class542.field7620 += (int) (Math.random() * 5.0D) - 2;
                if (~class542.field7620 > 15) {
                    class542.field7620 = -16;
                }
                if (class542.field7620 > 16) {
                    class542.field7620 = 16;
                }
                class542.method3201(arg1, class542.field7627 >> 2 << 10, class542.field7620 >> 1);
                class542.field7614.method2642(256, 1024, (byte) -50);
                class542.field7616.method796(256, 256, (byte) -99);
                class542.field7615.method135(4096, (byte) -110);
                class679.field9567.method212((byte) 66, 256);
                class442.field6163 = 20;
            } else if (class442.field6163 == 20) {
                class539.method3172(false, true);
                class542.method3210(arg0, class542.field7627, class542.field7620);
                class442.field6163 = 60;
                class539.method3172(false, true);
                class54.method491(0);
            } else if (class442.field6163 == 60) {
                if (class542.field7611.method1463(class542.field7619.field10148 + "_staticelements", (byte) 117)) {
                    if (!class542.field7611.method1470(class542.field7619.field10148 + "_staticelements", -7490)) {
                        return;
                    }
                    class542.field7624 = class660.method3716((byte) -24, class399.field5585, class542.field7619.field10148 + "_staticelements", class542.field7611);
                } else {
                    class542.field7624 = new class752(0);
                }
                class542.method3194();
                class442.field6163 = 70;
                class539.method3172(false, true);
                class54.method491(0);
            } else if (class442.field6163 == 70) {
                class500.field7106 = new class664(arg0, 11, true, class567.field8085);
                class442.field6163 = 73;
                class539.method3172(false, true);
                class54.method491(0);
            } else if (class442.field6163 == 73) {
                class592.field8313 = new class664(arg0, 12, true, class567.field8085);
                class442.field6163 = 76;
                class539.method3172(false, true);
                class54.method491(arg2 + 3993);
            } else if (class442.field6163 == 76) {
                class508.field7235 = new class664(arg0, 14, true, class567.field8085);
                class442.field6163 = 79;
                class539.method3172(false, true);
                class54.method491(0);
            } else if (~class442.field6163 == -80) {
                class693.field9749 = new class664(arg0, 17, true, class567.field8085);
                class442.field6163 = 82;
                class539.method3172(false, true);
                class54.method491(0);
            } else if (~class442.field6163 == -83) {
                class18.field241 = new class664(arg0, 19, true, class567.field8085);
                class442.field6163 = 85;
                class539.method3172(false, true);
                class54.method491(0);
            } else if (class442.field6163 == 85) {
                class375.field5256 = new class664(arg0, 22, true, class567.field8085);
                class442.field6163 = 88;
                class539.method3172(false, true);
                class54.method491(0);
            } else if (class442.field6163 == 88) {
                class554.field7752 = new class664(arg0, 26, true, class567.field8085);
                class442.field6163 = 91;
                class539.method3172(false, true);
                class54.method491(0);
            } else {
                class462.field6660 = new class664(arg0, 30, true, class567.field8085);
                class442.field6163 = 100;
                class539.method3172(false, true);
                if (arg2 == -3993) {
                    class54.method491(0);
                    System.gc();
                }
            }
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(Z)I")
    public final int method50(boolean arg0) {
        if (arg0) {
            method2143((class58) null, (class149) null, -53);
        }
        ++field4740;
        return 0;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(III[B)V")
    public final void method53(int arg0, int arg1, int arg2, byte[] arg3) {
        ++field4744;
        this.method2483(arg3, arg0);
        if (arg1 != -6562) {
            this.field4741 = 120;
        }
        this.field4741 = arg2;
    }
}
