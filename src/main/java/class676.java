import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dw")
public class class676 extends class39 {

    @OriginalMember(owner = "client!dw", name = "Lc", descriptor = "I")
    public int field9586 = -1;

    @OriginalMember(owner = "client!dw", name = "Sc", descriptor = "I")
    public int field9593 = -1;

    @OriginalMember(owner = "client!dw", name = "Oc", descriptor = "[I")
    public static int[] field9589 = new int[1];

    @OriginalMember(owner = "client!dw", name = "Rc", descriptor = "Lcb;")
    public static class318 field9592 = new class318(68, 8);

    @OriginalMember(owner = "client!dw", name = "Vc", descriptor = "[Z")
    public static boolean[] field9596 = new boolean[5];

    @OriginalMember(owner = "client!dw", name = "Dc", descriptor = "F")
    public static float field9578;

    @OriginalMember(owner = "client!dw", name = "vc", descriptor = "I")
    public static int field9570;

    @OriginalMember(owner = "client!dw", name = "wc", descriptor = "I")
    public static int field9571;

    @OriginalMember(owner = "client!dw", name = "xc", descriptor = "I")
    public static int field9572;

    @OriginalMember(owner = "client!dw", name = "yc", descriptor = "I")
    public static int field9573;

    @OriginalMember(owner = "client!dw", name = "zc", descriptor = "I")
    public static int field9574;

    @OriginalMember(owner = "client!dw", name = "Ac", descriptor = "I")
    public static int field9575;

    @OriginalMember(owner = "client!dw", name = "Bc", descriptor = "I")
    public static int field9576;

    @OriginalMember(owner = "client!dw", name = "Cc", descriptor = "I")
    public static int field9577;

    @OriginalMember(owner = "client!dw", name = "Ec", descriptor = "I")
    public static int field9579;

    @OriginalMember(owner = "client!dw", name = "Fc", descriptor = "I")
    public static int field9580;

    @OriginalMember(owner = "client!dw", name = "Gc", descriptor = "I")
    public static int field9581;

    @OriginalMember(owner = "client!dw", name = "Hc", descriptor = "I")
    public static int field9582;

    @OriginalMember(owner = "client!dw", name = "Ic", descriptor = "I")
    public static int field9583;

    @OriginalMember(owner = "client!dw", name = "Jc", descriptor = "I")
    public static int field9584;

    @OriginalMember(owner = "client!dw", name = "Kc", descriptor = "I")
    public static int field9585;

    @OriginalMember(owner = "client!dw", name = "Mc", descriptor = "I")
    public static int field9587;

    @OriginalMember(owner = "client!dw", name = "Nc", descriptor = "I")
    public static int field9588;

    @OriginalMember(owner = "client!dw", name = "Pc", descriptor = "I")
    public static int field9590;

    @OriginalMember(owner = "client!dw", name = "Qc", descriptor = "I")
    public static int field9591;

    @OriginalMember(owner = "client!dw", name = "Tc", descriptor = "Lqba;")
    public class195 field9594;

    @OriginalMember(owner = "client!dw", name = "Uc", descriptor = "[Ljava/lang/String;")
    public static String[] field9595;

    @OriginalMember(owner = "client!dw", name = "c", descriptor = "(I)V")
    public final void method127(int arg0) {
        ++field9576;
        if (arg0 < 118) {
            this.method3732(94, 96, 34, (byte) 35, false, 73);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!dw", name = "f", descriptor = "(I)I")
    public final int method1738(int arg0) {
        if (arg0 != 3891) {
            return -78;
        } else {
            ++field9580;
            return super.field483;
        }
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(IIIBZI)V")
    public final void method3732(int arg0, int arg1, int arg2, byte arg3, boolean arg4, int arg5) {
        ++field9572;
        super.field3925 = (byte) arg0;
        if (super.field459 != -1 && class77.field971.method776(super.field459, (byte) -116).field6318 == 1) {
            super.field459 = -1;
        }
        if (super.field444 != -1) {
            class328 var7 = class236.field3079.method1047(super.field444, (byte) -102);
            if (var7.field4811 && ~var7.field4797 != 0 && class77.field971.method776(var7.field4797, (byte) -100).field6318 == 1) {
                super.field444 = -1;
            }
        }
        if (arg3 != 107) {
            this.field9586 = 113;
        }
        if (super.field453 != -1) {
            class328 var8 = class236.field3079.method1047(super.field453, (byte) -68);
            if (var8.field4811 && ~var8.field4797 != 0 && class77.field971.method776(var8.field4797, (byte) 57).field6318 == 1) {
                super.field453 = -1;
            }
        }
        if (!arg4) {
            int var9 = -super.field526[0] + arg2;
            int var10 = -super.field516[0] + arg1;
            if (var9 >= -8 && ~var9 >= -9 && var10 >= -8 && var10 <= 8) {
                if (~super.field520 > -10) {
                    ++super.field520;
                }
                for (int var11 = super.field520; ~var11 < -1; --var11) {
                    super.field526[var11] = super.field526[var11 + -1];
                    super.field516[var11] = super.field516[var11 + -1];
                    super.field517[var11] = super.field517[var11 + -1];
                }
                super.field526[0] = arg2;
                super.field517[0] = 1;
                super.field516[0] = arg1;
                return;
            }
        }
        super.field523 = 0;
        super.field526[0] = arg2;
        super.field521 = 0;
        super.field520 = 0;
        super.field516[0] = arg1;
        super.field3917 = (super.field516[0] << 9) + (arg5 << 8);
        super.field3929 = (super.field526[0] << 9) + (arg5 << 8);
        if (super.field518 != null) {
            super.field518.method710();
        }
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(BLoa;)Lvg;")
    public final class162 method134(byte arg0, class689 arg1) {
        ++field9574;
        return arg0 < 121 ? null : null;
    }

    @OriginalMember(owner = "client!dw", name = "e", descriptor = "(I)Z")
    public final boolean method135(int arg0) {
        ++field9571;
        if (arg0 != 0) {
            this.method123((byte) -27, (class689) null);
        }
        return false;
    }

    @OriginalMember(owner = "client!dw", name = "c", descriptor = "(B)Z")
    public final boolean method3733(byte arg0) {
        ++field9581;
        if (this.field9594 == null) {
            return false;
        } else {
            if (arg0 != -119) {
                this.method3733((byte) 18);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!dw", name = "b", descriptor = "(Z)Z")
    private final boolean method3734(boolean arg0) {
        if (arg0) {
            this.field9593 = 34;
        }
        ++field9573;
        return this.field9594.field2576;
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(Z)I")
    public final int method234(boolean arg0) {
        ++field9591;
        if (this.field9594.field2557 != null) {
            class195 var2 = this.field9594.method1242(class327.field4771, (byte) -32);
            if (var2 != null && ~var2.field2522 != 0) {
                return var2.field2522;
            }
        }
        if (arg0) {
            this.method3740((class195) null, 113);
        }
        return this.field9594.field2522;
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(Loa;B)Llt;")
    public final class95 method136(class689 arg0, byte arg1) {
        ++field9579;
        if (this.field9594 != null && this.method3737(arg0, (byte) -83, 2048)) {
            class111 var3 = arg0.method1972();
            int var4 = super.field421.method1120(1);
            var3.method604(var4);
            var3.method595(super.field3929, super.field3930 + -20, super.field3917);
            class334 var5 = this.method242(5832);
            class195 var6 = this.field9594.field2557 == null ? this.field9594 : this.field9594.method1242(class327.field4771, (byte) -32);
            if (arg1 >= -47) {
                return null;
            } else {
                if (class72.field935.field6536 && var6.field2527 && var5.field4894) {
                    class463 var7 = ~super.field459 != 0 && ~super.field492 == -1 ? class77.field971.method776(super.field459, (byte) 83) : null;
                    class463 var8 = ~super.field454 == 0 || super.field456 && var7 != null ? null : class77.field971.method776(super.field454, (byte) 85);
                    int var9 = 0;
                    if (~super.field479 != -1) {
                        var9 = this.method226(4);
                    }
                    class629 var10 = class103.method559(var8 == null ? super.field457 : super.field513, super.field437, (byte) 88, arg0, super.field522[0], 255 & this.field9594.field2548, var8 == null ? var7 : var8, super.field425, 255 & this.field9594.field2570, this.field9594.field2591, super.field491, var4, 65535 & this.field9594.field2568, var9, 65535 & this.field9594.field2592);
                    if (var10 != null) {
                        arg0.method1798(false);
                        var10.method665(var3, (class455) null, 0);
                        arg0.method1798(true);
                    }
                }
                var3.method604(var4);
                var3.method595(super.field3929, super.field3930 + -5, super.field3917);
                class95 var11 = null;
                if (this.method3734(false)) {
                    var11 = class429.method2472(super.field522.length, (byte) -122);
                }
                this.method237(super.field522, false, var3, arg0, (byte) 8);
                if (super.field518 == null) {
                    arg0.method1799(super.field522, var3, var11 == null ? null : var11.field1175, 0);
                } else {
                    class309 var12 = super.field518.method721();
                    arg0.method1796(super.field522, var12, var3, var11 == null ? null : var11.field1175, 0);
                }
                super.field502 = class426.field5928;
                super.field522[0] = super.field522[1] = super.field522[2] = super.field522[3] = null;
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dw", name = "b", descriptor = "(BLoa;)V")
    public final void method123(byte arg0, class689 arg1) {
        ++field9585;
        if (this.field9594 != null) {
            if (super.field519 || this.method3737(arg1, (byte) -83, 0)) {
                if (arg0 >= 91) {
                    class111 var3 = arg1.method1972();
                    var3.method604(super.field421.method1120(1));
                    var3.method595(super.field3929, super.field3930 + -20, super.field3917);
                    this.method237(super.field522, super.field519, var3, arg1, (byte) 8);
                    super.field522[0] = super.field522[1] = super.field522[2] = super.field522[3] = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!dw", name = "m", descriptor = "(I)V")
    public static void method3735(int arg0) {
        if (arg0 > 31) {
            field9592 = null;
            field9589 = null;
            field9595 = null;
            field9596 = null;
        }
    }

    @OriginalMember(owner = "client!dw", name = "b", descriptor = "(I)I")
    public final int method227(int arg0) {
        ++field9583;
        if (arg0 != 1) {
            method3735(-69);
        }
        if (this.field9594.field2557 != null) {
            class195 var2 = this.field9594.method1242(class327.field4771, (byte) -32);
            if (var2 != null && ~var2.field2561 != 0) {
                return var2.field2561;
            }
        }
        return this.field9594.field2561;
    }

    @OriginalMember(owner = "client!dw", name = "l", descriptor = "(I)I")
    public final int method243(int arg0) {
        ++field9590;
        int var2 = -42 / ((arg0 - -59) / 56);
        if (this.field9594.field2557 != null) {
            class195 var3 = this.field9594.method1242(class327.field4771, (byte) -32);
            if (var3 != null && var3.field2558 != -1) {
                return var3.field2558;
            }
        }
        return ~this.field9594.field2558 == 0 ? super.method243(19) : this.field9594.field2558;
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(Lbo;ILoa;IIIZ)V")
    public final void method133(class631 arg0, int arg1, class689 arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (arg4 == -8763) {
            ++field9570;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(IZIIIII)V")
    public static final void method3736(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field9577;
        int var7 = class654.field9256;
        class421.field5868 = 0;
        int[] var8 = class123.field1595;
        for (int var9 = 0; ~var9 > ~(var7 - -class306.field4106); ++var9) {
            class195 var32 = null;
            class39 var33;
            if (~var7 >= ~var9) {
                var33 = ((class637) class77.field955.method2506(11, (long) class690.field9742[-var7 + var9])).field8702;
                var32 = ((class676) var33).field9594;
                if (var32.field2557 != null) {
                    var32 = var32.method1242(class327.field4771, (byte) -32);
                    if (var32 == null) {
                        continue;
                    }
                }
            } else {
                var33 = class292.field3912[var8[var9]];
            }
            if (~var33.field435 <= -1 && (~class426.field5928 == ~var33.field502 || ~class596.field8164.field3925 == ~var33.field3925)) {
                class325.method2086(arg6, var33.method243(-124), arg5, 94, arg0 >> 1, var33, arg2 >> 1);
                if (class558.field7608[0] >= 0) {
                    if (var33.field503 != null && (var9 >= var7 || class127.field1619 == 0 || class127.field1619 == 3 || ~class127.field1619 == -2 && class297.method1772(((class519) var33).field7191, 29)) && ~class421.field5868 > ~class319.field4682) {
                        class319.field4663[class421.field5868] = class446.field6129.method3312(-23728, var33.field503) / 2;
                        class319.field4671[class421.field5868] = class558.field7608[0];
                        class319.field4667[class421.field5868] = class558.field7608[1];
                        class319.field4650[class421.field5868] = var33.field452;
                        class319.field4655[class421.field5868] = var33.field439;
                        class319.field4688[class421.field5868] = var33.field443;
                        class319.field4683[class421.field5868] = var33.field503;
                        ++class421.field5868;
                    }
                    int var34 = class558.field7608[1] + arg3;
                    int var45;
                    if (!var33.field487 && class430.field5984 < var33.field431) {
                        boolean var35 = true;
                        byte var36 = 1;
                        int var37;
                        if (~var7 >= ~var9) {
                            var37 = var32.field2537;
                            if (~var37 == 0) {
                                var37 = var33.method242(5832).field4906;
                            }
                        } else {
                            class519 var38 = class292.field3912[var8[var9]];
                            var37 = var33.method242(5832).field4906;
                            if (var38.field7158) {
                                var36 = 2;
                            }
                        }
                        class424[] var39 = class198.field2619;
                        if (~var37 != 0) {
                            class424[] var40 = (class424[]) class254.field3498.method3134((long) var37, -36);
                            if (var40 == null) {
                                class366[] var41 = class366.method2248(class39.field510, var37, 0);
                                if (var41 != null) {
                                    var40 = new class424[var41.length];
                                    for (int var42 = 0; ~var41.length < ~var42; ++var42) {
                                        var40[var42] = class9.field103.method1951(var41[var42], true);
                                    }
                                    class254.field3498.method3130((long) var37, true, var40);
                                }
                            }
                            if (var40 != null && var40.length >= 2) {
                                var39 = var40;
                            }
                        }
                        if (~var36 <= ~var39.length) {
                            var36 = 1;
                        }
                        class424 var43 = var39[0];
                        class424 var44 = var39[var36];
                        var45 = var34 - Math.max(class446.field6129.field8188, var43.method1154());
                        int var46 = class558.field7608[0] + arg4 - (var43.method1159() >> 1);
                        int var47 = var43.method1159() * var33.field493 / 255;
                        if (var33.field493 > 0 && ~var47 > -3) {
                            var47 = 2;
                        }
                        var43.method2450(var46, var45);
                        class9.field103.method1970(var46, var45, var46 - -var47, var45 - -var43.method1154());
                        var44.method2450(var46, var45);
                        class9.field103.method1908(arg4, arg3, arg4 - -arg2, arg3 - -arg0);
                    } else {
                        var45 = var34 - Math.max(class446.field6129.field8188, class198.field2619[0].method1154());
                    }
                    var45 -= 2;
                    if (!var33.field487) {
                        if (var33.field505 > class430.field5984) {
                            class424 var48 = class161.field2033[!var33.field489 ? 0 : 2];
                            class424 var49 = class161.field2033[var33.field489 ? 3 : 1];
                            boolean var50 = true;
                            int var51;
                            if (var33 instanceof class676) {
                                var51 = var32.field2519;
                                if (var51 == -1) {
                                    var51 = var33.method242(5832).field4905;
                                }
                            } else {
                                var51 = var33.method242(5832).field4905;
                            }
                            if (var51 != -1) {
                                class424[] var52 = (class424[]) class612.field8348.method3134((long) var51, -45);
                                if (var52 == null) {
                                    class366[] var53 = class366.method2248(class39.field510, var51, 0);
                                    if (var53 != null) {
                                        var52 = new class424[var53.length];
                                        for (int var54 = 0; var53.length > var54; ++var54) {
                                            var52[var54] = class9.field103.method1951(var53[var54], true);
                                        }
                                        class612.field8348.method3130((long) var51, arg1, var52);
                                    }
                                }
                                if (var52 != null && ~var52.length == -5) {
                                    var49 = var52[var33.field489 ? 3 : 1];
                                    var48 = var52[var33.field489 ? 2 : 0];
                                }
                            }
                            int var55 = -class430.field5984 + var33.field505;
                            int var56;
                            if (var33.field511 >= var55) {
                                var56 = var48.method1159();
                            } else {
                                int var57 = var55 - var33.field511;
                                int var58 = var33.field480 == 0 ? 0 : (-var57 + var33.field441) / var33.field480 * var33.field480;
                                var56 = var58 * var48.method1159() / var33.field441;
                            }
                            int var59 = var48.method1154();
                            var45 -= var59;
                            int var60 = class558.field7608[0] + arg4 + -(var48.method1159() >> 1);
                            var48.method2450(var60, var45);
                            class9.field103.method1970(var60, var45, var60 - -var56, var45 - -var59);
                            var49.method2450(var60, var45);
                            var45 -= 2;
                            class9.field103.method1908(arg4, arg3, arg4 - -arg2, arg0 + arg3);
                        }
                        if (var9 >= var7) {
                            if (var32.field2577 >= 0 && ~class637.field8700.length < ~var32.field2577) {
                                class424 var61 = class637.field8700[var32.field2577];
                                var45 -= 25;
                                var61.method2450(class558.field7608[0] + arg4 - (var61.method1159() >> 1), var45);
                                var45 -= 2;
                            }
                        } else {
                            class519 var62 = (class519) var33;
                            if (~var62.field7196 != 0) {
                                var45 -= 25;
                                class448.field6138[var62.field7196].method2450(arg4 + -12 - -class558.field7608[0], var45);
                                var45 -= 2;
                            }
                            if (~var62.field7160 != 0) {
                                var45 -= 25;
                                class637.field8700[var62.field7160].method2450(class558.field7608[0] + arg4 + -12, var45);
                                var45 -= 2;
                            }
                        }
                    }
                    int var10000;
                    if (!(var33 instanceof class519)) {
                        int var63 = 0;
                        class90[] var64 = class249.field3357;
                        for (int var65 = 0; var65 < var64.length; ++var65) {
                            class90 var67 = var64[var65];
                            if (var67 != null && var67.field1099 == 1 && class690.field9742[-var7 + var9] == var67.field1106) {
                                class424 var68 = class521.field7222[var67.field1100];
                                if (~var68.method1154() < ~var63) {
                                    var63 = var68.method1154();
                                }
                                if (~(class430.field5984 % 20) > -11) {
                                    var68.method2450(arg4 - -class558.field7608[0] + -12, var45 + -var68.method1154());
                                }
                            }
                        }
                        if (~var63 < -1) {
                            var10000 = var45 - (var63 + 2);
                        }
                    } else if (~var9 <= -1) {
                        int var69 = 0;
                        class90[] var70 = class249.field3357;
                        for (int var71 = 0; var71 < var70.length; ++var71) {
                            class90 var73 = var70[var71];
                            if (var73 != null && var73.field1099 == 10 && ~var8[var9] == ~var73.field1106) {
                                class424 var74 = class521.field7222[var73.field1100];
                                if (var74.method1154() > var69) {
                                    var69 = var74.method1154();
                                }
                                var74.method2450(arg4 - -class558.field7608[0] + -12, -var74.method1154() + var45);
                            }
                        }
                        if (var69 > 0) {
                            var10000 = var45 - (var69 + 2);
                        }
                    }
                    for (int var75 = 0; ~var75 > -5; ++var75) {
                        if (~class430.field5984 > ~var33.field464[var75]) {
                            int var76 = var33.method243(-127) / 2;
                            class325.method2086(arg6, var76, arg5, 69, arg0 >> 1, var33, arg2 >> 1);
                            if (class558.field7608[0] > -1) {
                                int var77 = class137.field1708[var33.field475[var75]].method1159();
                                if (var75 == 1) {
                                    class558.field7608[1] -= 20;
                                }
                                if (~var75 == -3) {
                                    class558.field7608[0] -= var77 + -9;
                                    class558.field7608[1] -= 10;
                                }
                                if (~var75 == -4) {
                                    class558.field7608[0] += var77 + -9;
                                    class558.field7608[1] -= 10;
                                }
                                class137.field1708[var33.field475[var75]].method2450(class558.field7608[0] + -(var77 >> 1) + arg4, arg3 + -12 + class558.field7608[1]);
                                class426.field5926.method1802(class558.field7608[0] + arg4 + -1, 0, Integer.toString(var33.field455[var75]), class558.field7608[1] + arg3 - -3, -1, -28812);
                            }
                        }
                    }
                }
            }
        }
        if (!arg1) {
            field9578 = -0.80895174F;
        }
        for (int var10 = 0; var10 < class335.field4941; ++var10) {
            int var28 = class612.field8354[var10];
            class39 var29;
            if (~var28 > -2049) {
                var29 = class292.field3912[var28];
            } else {
                var29 = ((class637) class77.field955.method2506(114, (long) (var28 - 2048))).field8702;
            }
            int var30 = class127.field1611[var10];
            class39 var31;
            if (~var30 <= -2049) {
                var31 = ((class637) class77.field955.method2506(14, (long) (var30 + -2048))).field8702;
            } else {
                var31 = class292.field3912[var30];
            }
            class389.method2327(var31, arg5, arg2, arg0, arg6, var29, --var29.field427, 24442, arg4, arg3);
        }
        int var11 = class446.field6129.field8188 + 2 + class446.field6129.field8190;
        for (int var12 = 0; ~var12 > ~class421.field5868; ++var12) {
            int var13 = class319.field4671[var12];
            int var14 = class319.field4667[var12];
            int var15 = class319.field4663[var12];
            boolean var16 = true;
            while (var16) {
                var16 = false;
                for (int var27 = 0; var27 < var12; ++var27) {
                    if (~(class319.field4667[var27] - var11) > ~(var14 + 2) && class319.field4667[var27] + 2 > var14 - var11 && -var15 + var13 < class319.field4671[var27] - -class319.field4663[var27] && ~(var13 + var15) < ~(class319.field4671[var27] + -class319.field4663[var27]) && ~(class319.field4667[var27] - var11) > ~var14) {
                        var16 = true;
                        var14 = class319.field4667[var27] + -var11;
                    }
                }
            }
            class319.field4667[var12] = var14;
            String var17 = class319.field4683[var12];
            if (~class242.field3158 == -1) {
                int var18 = 16776960;
                if (~class319.field4650[var12] > -7) {
                    var18 = class108.field1303[class319.field4650[var12]];
                }
                if (~class319.field4650[var12] == -7) {
                    var18 = ~(class426.field5928 % 20) <= -11 ? 16776960 : 16711680;
                }
                if (class319.field4650[var12] == 7) {
                    var18 = class426.field5928 % 20 < 10 ? 255 : 65535;
                }
                if (class319.field4650[var12] == 8) {
                    var18 = ~(class426.field5928 % 20) > -11 ? 45056 : 8454016;
                }
                if (class319.field4650[var12] == 9) {
                    int var19 = -class319.field4688[var12] + 150;
                    if (var19 >= 50) {
                        if (~var19 > -101) {
                            var18 = -((var19 + -50) * 327680) + 16776960;
                        } else if (~var19 > -151) {
                            var18 = 65280 - -((var19 + -100) * 5);
                        }
                    } else {
                        var18 = var19 * 1280 + 16711680;
                    }
                }
                if (class319.field4650[var12] == 10) {
                    int var20 = -class319.field4688[var12] + 150;
                    if (~var20 <= -51) {
                        if (~var20 > -101) {
                            var18 = 16711935 - var20 * 327680 - -16384000;
                        } else if (~var20 > -151) {
                            var18 = (var20 - 100) * 327680 + -(var20 * 5) + 500 + 255;
                        }
                    } else {
                        var18 = 16711680 - -(var20 * 5);
                    }
                }
                if (class319.field4650[var12] == 11) {
                    int var21 = -class319.field4688[var12] + 150;
                    if (~var21 <= -51) {
                        if (~var21 <= -101) {
                            if (var21 < 150) {
                                var18 = 16777215 - (var21 * 327680 - 32768000);
                            }
                        } else {
                            var18 = (var21 + -50) * 327685 + 65280;
                        }
                    } else {
                        var18 = 16777215 - var21 * 327685;
                    }
                }
                int var22 = var18 | -16777216;
                if (class319.field4655[var12] == 0) {
                    class622.field8452.method1802(arg4 + var13, -16777216, var17, arg3 - -var14, var22, -28812);
                }
                if (class319.field4655[var12] == 1) {
                    class622.field8452.method1801(class426.field5928, !arg1, var22, var17, -16777216, arg4 + var13, arg3 - -var14);
                }
                if (class319.field4655[var12] == 2) {
                    class622.field8452.method1818(var17, (byte) -89, arg3 - -var14, var22, -16777216, arg4 - -var13, class426.field5928);
                }
                if (class319.field4655[var12] == 3) {
                    class622.field8452.method1805(class426.field5928, arg4 + var13, var22, -class319.field4688[var12] + 150, arg3 - -var14, var17, -16777216, 0);
                }
                if (~class319.field4655[var12] == -5) {
                    int var23 = (-class319.field4688[var12] + 150) * (100 + class446.field6129.method3312(-23728, var17)) / 150;
                    class9.field103.method1970(arg4 - -var13 - 50, arg3, arg4 + var13 + 50, arg0 + arg3);
                    class622.field8452.method1815(var17, -123, 50 - var23 + arg4 + var13, var22, arg3 + var14, -16777216);
                    class9.field103.method1908(arg4, arg3, arg2 + arg4, arg3 - -arg0);
                }
                if (~class319.field4655[var12] == -6) {
                    int var24 = -class319.field4688[var12] + 150;
                    int var25 = 0;
                    if (~var24 <= -26) {
                        if (~var24 < -126) {
                            var25 = var24 + -125;
                        }
                    } else {
                        var25 = var24 + -25;
                    }
                    int var26 = class446.field6129.field8188 - -class446.field6129.field8190;
                    class9.field103.method1970(arg4, arg3 + var14 - 1 + -var26, arg2 + arg4, arg3 + 5 - -var14);
                    class622.field8452.method1802(arg4 + var13, -16777216, var17, arg3 - -var14 + var25, var22, -28812);
                    class9.field103.method1908(arg4, arg3, arg4 - -arg2, arg0 + arg3);
                }
            } else {
                class622.field8452.method1802(arg4 - -var13, -16777216, var17, arg3 + var14, -256, -28812);
            }
        }
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(Loa;BI)Z")
    private final boolean method3737(class689 arg0, byte arg1, int arg2) {
        ++field9588;
        int var4 = arg2;
        class334 var5 = this.method242(5832);
        class463 var6 = ~super.field459 != 0 && super.field492 == 0 ? class77.field971.method776(super.field459, (byte) 58) : null;
        class463 var7 = ~super.field454 == 0 || super.field456 && var6 != null ? null : class77.field971.method776(super.field454, (byte) -84);
        if (arg1 != -83) {
            field9589 = null;
        }
        int var8 = var5.field4903;
        int var9 = var5.field4909;
        if (var8 != 0 || var9 != 0 || var5.field4900 != 0 || var5.field4885 != 0) {
            arg2 |= 7;
        }
        boolean var10 = super.field460 != 0 && super.field494 <= class430.field5984 && ~class430.field5984 > ~super.field508;
        if (var10) {
            arg2 |= 524288;
        }
        class629 var11 = super.field522[0] = this.field9594.method1243(super.field507, super.field440, super.field457, super.field462, 229963619, class613.field8364, var6, class77.field971, class327.field4771, super.field451, var7, super.field513, arg2, arg0, super.field432);
        if (var11 == null) {
            return false;
        } else {
            super.field483 = var11.method686();
            this.method235(var11, 2);
            int var12 = super.field421.method1120(arg1 ^ -84);
            if (~var8 == -1 && ~var9 == -1) {
                this.method239(this.method241(arg1 ^ 25792) << 9, var12, 0, 0, true, this.method241(-25747) << 9);
            } else {
                this.method239(var8, var12, var5.field4881, var5.field4898, true, var9);
                if (super.field437 != 0) {
                    super.field522[0].method650(super.field437);
                }
                if (~super.field491 != -1) {
                    super.field522[0].method645(super.field491);
                }
                if (~super.field425 != -1) {
                    super.field522[0].method693(0, super.field425, 0);
                }
            }
            if (var10) {
                var11.method678(super.field509, super.field465, super.field438, 255 & super.field460);
            }
            if (super.field444 != -1 && super.field466 != -1) {
                class328 var13 = class236.field3079.method1047(super.field444, (byte) -57);
                boolean var14 = ~var13.field4795 == -4 && (~var8 != -1 || var9 != 0);
                int var15 = var4;
                if (!var14) {
                    if (super.field449 != 0) {
                        var15 = var4 | 5;
                    }
                    if (~super.field436 != -1) {
                        var15 |= 2;
                    }
                } else {
                    var15 = var4 | 7;
                }
                class629 var16 = super.field522[1] = var13.method2103(super.field490, super.field448, super.field466, var15, arg0, class77.field971, 0);
                if (var16 != null) {
                    if (super.field436 != 0) {
                        var16.method693(0, -super.field436 << 2, 0);
                    }
                    if (super.field449 != 0) {
                        var16.method691(super.field449 * 2048);
                    }
                    if (var14) {
                        if (~super.field437 != -1) {
                            var16.method650(super.field437);
                        }
                        if (super.field491 != 0) {
                            var16.method645(super.field491);
                        }
                        if (super.field425 != 0) {
                            var16.method693(0, super.field425, 0);
                        }
                    }
                }
            } else {
                super.field522[1] = null;
            }
            if (super.field453 != -1 && super.field481 != -1) {
                class328 var17 = class236.field3079.method1047(super.field453, (byte) 122);
                boolean var18 = ~var17.field4795 == -4 && (~var8 != -1 || var9 != 0);
                int var19 = var4;
                if (!var18) {
                    if (~super.field445 != -1) {
                        var19 = var4 | 5;
                    }
                    if (~super.field442 != -1) {
                        var19 |= 2;
                    }
                } else {
                    var19 = var4 | 7;
                }
                class629 var20 = super.field522[3] = var17.method2105(super.field429, var19, (byte) 90, class77.field971, super.field481, arg0, super.field476);
                if (var20 != null) {
                    if (~super.field442 != -1) {
                        var20.method693(0, -super.field442 << 2, 0);
                    }
                    if (~super.field445 != -1) {
                        var20.method691(super.field445 * 2048);
                    }
                    if (var18) {
                        if (~super.field437 != -1) {
                            var20.method650(super.field437);
                        }
                        if (super.field491 != 0) {
                            var20.method645(super.field491);
                        }
                        if (~super.field425 != -1) {
                            var20.method693(0, super.field425, 0);
                        }
                    }
                }
            } else {
                super.field522[3] = null;
            }
            super.field522[2] = null;
            if (super.field525 != null) {
                if (class430.field5984 >= super.field525.field7907) {
                    super.field525 = null;
                } else if (super.field525.field7905 <= class430.field5984) {
                    class629 var21 = super.field525.method3223(var4 | 7, arg0, 85);
                    if (var21 != null) {
                        var21.method693(-super.field3929 + super.field525.field7902, -super.field3930 + super.field525.field7903 + 5, -super.field3917 + super.field525.field7904);
                        if (var12 != 0) {
                            var21.method691(var12);
                        }
                        super.field522[2] = var21;
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!dw", name = "b", descriptor = "(IIB)V")
    public final void method3738(int arg0, int arg1, byte arg2) {
        ++field9584;
        int var4 = super.field526[0];
        int var5 = super.field516[0];
        if (arg0 == 0) {
            ++var5;
        }
        if (arg0 == 1) {
            ++var4;
            ++var5;
        }
        if (~arg0 == -3) {
            ++var4;
        }
        if (~arg0 == -4) {
            ++var4;
            --var5;
        }
        if (~arg0 == -5) {
            --var5;
        }
        if (~arg0 == -6) {
            --var4;
            --var5;
        }
        if (~arg0 == -7) {
            --var4;
        }
        if (~arg0 == -8) {
            --var4;
            ++var5;
        }
        if (super.field459 != -1 && class77.field971.method776(super.field459, (byte) 77).field6318 == 1) {
            super.field459 = -1;
        }
        if (arg2 > -62) {
            method3739(-76, 75);
        }
        if (~super.field444 != 0) {
            class328 var6 = class236.field3079.method1047(super.field444, (byte) 126);
            if (var6.field4811 && ~var6.field4797 != 0 && ~class77.field971.method776(var6.field4797, (byte) -80).field6318 == -2) {
                super.field444 = -1;
            }
        }
        if (super.field453 != -1) {
            class328 var7 = class236.field3079.method1047(super.field453, (byte) 118);
            if (var7.field4811 && ~var7.field4797 != 0 && class77.field971.method776(var7.field4797, (byte) 125).field6318 == 1) {
                super.field453 = -1;
            }
        }
        if (super.field520 < 9) {
            ++super.field520;
        }
        for (int var8 = super.field520; var8 > 0; --var8) {
            super.field526[var8] = super.field526[var8 + -1];
            super.field516[var8] = super.field516[var8 + -1];
            super.field517[var8] = super.field517[var8 + -1];
        }
        super.field526[0] = var4;
        super.field516[0] = var5;
        super.field517[0] = (byte) arg1;
    }

    @OriginalMember(owner = "client!dw", name = "b", descriptor = "(II)V")
    public static final void method3739(int arg0, int arg1) {
        ++field9575;
        if (class476.field6436 != arg1) {
            if (~arg1 == -14) {
                if (class267.field3667 != null) {
                    class44.method261((byte) -29, class644.field9129);
                } else {
                    class270.method1658(class644.field9129, false, class67.field885, class82.field1022);
                }
            }
            if (~arg1 != -14 && class461.field6283 != null) {
                class461.field6283.method971(3289650);
                class461.field6283 = null;
            }
            if (~arg1 == -4) {
                class666.method3697(-16294, ~class627.field8528 != ~class316.field4599);
            }
            if (arg1 == 7) {
                class593.method3298(~class316.field4599 != ~class315.field4597, (byte) 123);
            }
            if (~arg1 != -6) {
                if (~arg1 != -7) {
                    if (arg1 == 9) {
                        if (class267.field3667 != null) {
                            class44.method261((byte) -29, class644.field9129);
                        } else {
                            class270.method1658(class644.field9129, false, class67.field885, class82.field1022);
                        }
                    } else if (arg1 == 12) {
                        if (class267.field3667 == null) {
                            class363.method2232(class67.field885, class82.field1022, 6673);
                        } else {
                            class553.method3104(arg0 + 51572);
                        }
                    }
                } else if (class267.field3667 != null) {
                    class44.method261((byte) -29, class644.field9129);
                } else {
                    class270.method1658(class644.field9129, false, class67.field885, class82.field1022);
                }
            } else if (class267.field3667 != null) {
                class553.method3104(arg0 + 51572);
            } else {
                class363.method2232(class67.field885, class82.field1022, 6673);
            }
            if (class213.method1325(false, class476.field6436)) {
                class119.field1528.field1989 = 2;
                class563.field7708.field1989 = 2;
                class560.field7638.field1989 = 2;
                class175.field2199.field1989 = 2;
                class560.field7636.field1989 = 2;
                class327.field4752.field1989 = 2;
                class23.field223.field1989 = 2;
            }
            if (class213.method1325(false, arg1)) {
                class499.field6742 = 1;
                class690.field9746 = 0;
                class158.field1980 = 0;
                class398.field5673 = 0;
                class3.field24 = 1;
                class227.method1389(64, true);
                class119.field1528.field1989 = 1;
                class563.field7708.field1989 = 1;
                class560.field7638.field1989 = 1;
                class175.field2199.field1989 = 1;
                class560.field7636.field1989 = 1;
                class327.field4752.field1989 = 1;
                class23.field223.field1989 = 1;
            }
            if (arg0 != -22149) {
                field9592 = null;
            }
            if (~arg1 == -12 || ~arg1 == -4) {
                class70.method414(-79);
            }
            boolean var2 = arg1 == 2 || class346.method2172((byte) 106, arg1) || class20.method113(arg0 ^ -22270, arg1);
            boolean var3 = class476.field6436 == 2 || class346.method2172((byte) -100, class476.field6436) || class20.method113(119, class476.field6436);
            if (!var3 != !var2) {
                if (var2) {
                    class133.field1688 = class425.field5918;
                    if (class72.field935.field6523 == 0) {
                        class308.method1844(2, -78);
                    } else {
                        class535.method3028(false, class425.field5918, 16383, class328.field4812, 2, class72.field935.field6523, 0);
                    }
                    class311.field4180.method2836((byte) 77, false);
                } else {
                    class308.method1844(2, arg0 + 22051);
                    class311.field4180.method2836((byte) 103, true);
                }
            }
            if (class213.method1325(false, arg1) || arg1 == 13) {
                class9.field103.method839();
            }
            class476.field6436 = arg1;
        }
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(Lqba;I)V")
    public final void method3740(class195 arg0, int arg1) {
        this.field9594 = arg0;
        if (arg1 != -30929) {
            this.field9586 = -125;
        }
        ++field9587;
        if (super.field518 != null) {
            super.field518.method710();
        }
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(IIILoa;)Z")
    public final boolean method137(int arg0, int arg1, int arg2, class689 arg3) {
        ++field9582;
        if (this.field9594 != null && this.method3737(arg3, (byte) -83, 131072)) {
            class111 var5 = arg3.method1972();
            int var6 = super.field421.method1120(1);
            var5.method604(var6);
            if (arg2 < 117) {
                this.method133((class631) null, 68, (class689) null, -108, -37, -46, false);
            }
            var5.method595(super.field3929, super.field3930, super.field3917);
            boolean var7 = false;
            for (int var8 = 0; ~var8 > ~super.field522.length; ++var8) {
                if (super.field522[var8] != null && super.field522[var8].method695(arg0, arg1, var5, this.field9594.field2591 == 1)) {
                    var7 = true;
                    break;
                }
            }
            super.field522[0] = super.field522[1] = super.field522[2] = super.field522[3] = null;
            return var7;
        } else {
            return false;
        }
    }
}
