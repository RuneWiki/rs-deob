import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public class class202 extends class391 implements class83 {

    @OriginalMember(owner = "client!iq", name = "O", descriptor = "Z")
    private boolean field2748 = false;

    @OriginalMember(owner = "client!iq", name = "T", descriptor = "Lnq;")
    public class155 field2753;

    @OriginalMember(owner = "client!iq", name = "V", descriptor = "Z")
    private boolean field2755;

    @OriginalMember(owner = "client!iq", name = "ab", descriptor = "I")
    public static int field2760 = -50;

    @OriginalMember(owner = "client!iq", name = "K", descriptor = "Lvg;")
    public static class622 field2744 = new class622(14, 3);

    @OriginalMember(owner = "client!iq", name = "A", descriptor = "I")
    public static int field2739;

    @OriginalMember(owner = "client!iq", name = "G", descriptor = "I")
    public static int field2740;

    @OriginalMember(owner = "client!iq", name = "H", descriptor = "I")
    public static int field2741;

    @OriginalMember(owner = "client!iq", name = "I", descriptor = "I")
    public static int field2742;

    @OriginalMember(owner = "client!iq", name = "J", descriptor = "I")
    public static int field2743;

    @OriginalMember(owner = "client!iq", name = "L", descriptor = "I")
    public static int field2745;

    @OriginalMember(owner = "client!iq", name = "N", descriptor = "I")
    public static int field2747;

    @OriginalMember(owner = "client!iq", name = "P", descriptor = "I")
    public static int field2749;

    @OriginalMember(owner = "client!iq", name = "Q", descriptor = "I")
    public static int field2750;

    @OriginalMember(owner = "client!iq", name = "R", descriptor = "I")
    public static int field2751;

    @OriginalMember(owner = "client!iq", name = "S", descriptor = "I")
    public static int field2752;

    @OriginalMember(owner = "client!iq", name = "U", descriptor = "I")
    public static int field2754;

    @OriginalMember(owner = "client!iq", name = "W", descriptor = "I")
    public static int field2756;

    @OriginalMember(owner = "client!iq", name = "X", descriptor = "I")
    public static int field2757;

    @OriginalMember(owner = "client!iq", name = "Y", descriptor = "I")
    public static int field2758;

    @OriginalMember(owner = "client!iq", name = "Z", descriptor = "I")
    public static int field2759;

    @OriginalMember(owner = "client!iq", name = "cb", descriptor = "I")
    public static int field2762;

    @OriginalMember(owner = "client!iq", name = "db", descriptor = "Lrba;")
    public static class102 field2763;

    @OriginalMember(owner = "client!iq", name = "bb", descriptor = "Lvc;")
    public static class131 field2761;

    @OriginalMember(owner = "client!iq", name = "M", descriptor = "Lifa;")
    private class62 field2746;

    @OriginalMember(owner = "client!iq", name = "f", descriptor = "(I)I", line = 5)
    public final int method258(int arg0) {
        if (arg0 != -1) {
            method1310(true);
        }
        ++field2752;
        return this.field2753.method1101((byte) 108);
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lr;I)Lhr;", line = 19)
    public final class218 method272(class98 arg0, int arg1) {
        ++field2757;
        class395 var3 = this.field2753.method1110((byte) -104, true, arg0, false, 2048);
        if (var3 == null) {
            return null;
        } else {
            class151 var4 = arg0.method682();
            var4.method883(super.field5913 + super.field7895, super.field7894, super.field5912 + super.field7896);
            class218 var5 = null;
            if (this.field2755) {
                var5 = class187.method1237(1, (byte) 27);
            }
            if (arg1 != -1) {
                this.field2746 = null;
            }
            int var6 = super.field7895 >> 9;
            int var7 = super.field7896 >> 9;
            this.field2753.method1107(var7, -29008, var6, var6, arg0, var7, var4, true, var3);
            if (!class384.field5767) {
                var3.method1054(var4, var5 != null ? var5.field2902[0] : null, 0);
            } else {
                var3.method1030(var4, var5 != null ? var5.field2902[0] : null, class515.field7222, 0);
            }
            if (this.field2753.field2202 != null) {
                class620 var8 = this.field2753.field2202.method112();
                if (!class384.field5767) {
                    arg0.method679(var8);
                } else {
                    arg0.method708(var8, class515.field7222);
                }
            }
            this.field2748 = var3.method1024() || this.field2753.field2202 != null;
            if (this.field2746 == null) {
                this.field2746 = class249.method1513(super.field7896, super.field7894, var3, 2, super.field7895);
            } else {
                class340.method2112(true, this.field2746, super.field7895, super.field7894, super.field7896, var3);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "(B)I", line = 79)
    public final int method277(byte arg0) {
        ++field2751;
        return arg0 != 95 ? -43 : this.field2753.field2220;
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(IIIZ)I", line = 90)
    public static final int method1308(int arg0, int arg1, int arg2, boolean arg3) {
        ++field2749;
        class15 var4 = class262.method1577((byte) -17, arg2, arg3);
        if (var4 == null) {
            return 0;
        } else if (arg0 == -1) {
            return 0;
        } else {
            int var5 = 0;
            for (int var6 = arg1; ~var4.field328.length < ~var6; ++var6) {
                if (var4.field330[var6] == arg0) {
                    var5 += var4.field328[var6];
                }
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!iq", name = "h", descriptor = "(I)Z", line = 121)
    public final boolean method270(int arg0) {
        ++field2754;
        if (arg0 > -42) {
            this.method271(true);
        }
        return false;
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(BLr;)V", line = 133)
    public final void method273(byte arg0, class98 arg1) {
        ++field2740;
        this.field2753.method1100(false, arg1);
        int var3 = -41 % ((2 - arg0) / 56);
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(I)V", line = 145)
    public final void method276(int arg0) {
        if (arg0 > 63) {
            ++field2758;
        }
    }

    @OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(Lr;Llt;IIIIIZIIIII)V", line = 155)
    public class202(class98 arg0, class289 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
        this.field2753 = new class155(arg0, arg1, arg10, arg11, super.field7905, arg3, this, arg7, arg12);
        this.field2755 = arg1.field4250 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "(I)I", line = 168)
    public final int method264(int arg0) {
        ++field2756;
        return arg0 != -5273 ? 65 : this.field2753.field2207;
    }

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "(Lr;I)V", line = 179)
    public final void method259(class98 arg0, int arg1) {
        ++field2741;
        class395 var3 = this.field2753.method1110((byte) -104, true, arg0, false, 262144);
        if (arg1 == 11771) {
            if (var3 != null) {
                int var4 = super.field7895 >> 9;
                int var5 = super.field7896 >> 9;
                class151 var6 = arg0.method682();
                var6.method883(super.field7895, super.field7894, super.field7896);
                this.field2753.method1107(var5, -29008, var4, var4, arg0, var5, var6, false, var3);
            }
        }
    }

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "(Z)I", line = 203)
    public final int method271(boolean arg0) {
        if (arg0) {
            return 13;
        } else {
            ++field2762;
            return this.field2753.method1102(-26609);
        }
    }

    @OriginalMember(owner = "client!iq", name = "c", descriptor = "(Lr;I)Lifa;", line = 216)
    public final class62 method268(class98 arg0, int arg1) {
        ++field2759;
        if (arg1 != 0) {
            this.field2753 = null;
        }
        return this.field2746;
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lr;Z)V", line = 227)
    public final void method265(class98 arg0, boolean arg1) {
        this.field2753.method1109(0, arg0);
        if (arg1) {
            ++field2745;
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(B)I", line = 238)
    public final int method263(byte arg0) {
        if (arg0 < 10) {
            field2761 = null;
        }
        ++field2742;
        return this.field2753.field2224;
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(ILrg;)V", line = 250)
    public static final void method1309(int arg0, class523 arg1) {
        if (arg0 > 30) {
            ++field2743;
            if (arg1.field7334 != -1) {
                class47 var2 = class203.field2769.method2971(-29, arg1.field7334);
                if (var2 != null && var2.field732 != null) {
                    label365: {
                        ++arg1.field7338;
                        if (arg1.field7367 < var2.field732.length && var2.field729[arg1.field7367] < arg1.field7338) {
                            arg1.field7338 = 1;
                            ++arg1.field7414;
                            ++arg1.field7367;
                            if (!arg1.field7372) {
                                class620.method3567(arg1, arg1.field7367, var2, (byte) -97);
                            }
                        }
                        if (var2.field732.length <= arg1.field7367) {
                            arg1.field7338 = 0;
                            arg1.field7367 = 0;
                            if (arg1.field7404) {
                                arg1.field7334 = arg1.method2957(true).method3365(106);
                                if (arg1.field7334 == -1) {
                                    arg1.field7404 = false;
                                    break label365;
                                }
                                var2 = class203.field2769.method2971(-128, arg1.field7334);
                            }
                            if (!arg1.field7372) {
                                class620.method3567(arg1, arg1.field7367, var2, (byte) -63);
                            }
                        }
                        arg1.field7414 = arg1.field7367 - -1;
                        if (var2.field732 != null) {
                            if (~var2.field732.length >= ~arg1.field7414) {
                                arg1.field7414 = 0;
                            }
                        } else {
                            arg1.field7404 = false;
                            arg1.field7334 = -1;
                        }
                    }
                } else {
                    arg1.field7334 = -1;
                    arg1.field7404 = false;
                }
            }
            if (~arg1.field7360 != 0 && arg1.field7401 <= class45.field685) {
                class525 var3 = class134.field1945.method3082((byte) 50, arg1.field7360);
                int var4 = var3.field7457;
                if (~var4 != 0) {
                    label366: {
                        class47 var5 = class203.field2769.method2971(-57, var4);
                        if (var3.field7470) {
                            if (var5.field731 != 3) {
                                if (var5.field731 == 1 && ~arg1.field7434 < -1 && ~arg1.field7359 >= ~class45.field685 && arg1.field7411 < class45.field685) {
                                    arg1.field7401 = class45.field685 + 1;
                                    break label366;
                                }
                            } else if (~arg1.field7434 < -1 && ~arg1.field7359 >= ~class45.field685 && ~arg1.field7411 > ~class45.field685) {
                                arg1.field7360 = -1;
                                break label366;
                            }
                        }
                        if (var5 != null && var5.field732 != null) {
                            if (~arg1.field7358 > -1) {
                                arg1.field7358 = 0;
                                if (!arg1.field7372) {
                                    class620.method3567(arg1, 0, var5, (byte) -92);
                                }
                            }
                            ++arg1.field7402;
                            if (~arg1.field7358 > ~var5.field732.length && var5.field729[arg1.field7358] < arg1.field7402) {
                                ++arg1.field7358;
                                arg1.field7402 = 1;
                                if (!arg1.field7372) {
                                    class620.method3567(arg1, arg1.field7358, var5, (byte) -107);
                                }
                            }
                            if (~var5.field732.length >= ~arg1.field7358) {
                                if (!var3.field7470) {
                                    arg1.field7360 = -1;
                                } else {
                                    arg1.field7358 -= var5.field730;
                                    ++arg1.field7396;
                                    if (var5.field728 > arg1.field7396) {
                                        if (~arg1.field7358 <= -1 && arg1.field7358 < var5.field732.length) {
                                            if (!arg1.field7372) {
                                                class620.method3567(arg1, arg1.field7358, var5, (byte) -61);
                                            }
                                        } else {
                                            arg1.field7360 = -1;
                                        }
                                    } else {
                                        arg1.field7360 = -1;
                                    }
                                }
                            }
                            arg1.field7407 = arg1.field7358 + 1;
                            if (arg1.field7407 >= var5.field732.length) {
                                if (var3.field7470) {
                                    arg1.field7407 -= var5.field730;
                                    if (~(arg1.field7396 - -1) > ~var5.field728) {
                                        if (~arg1.field7407 > -1 || ~arg1.field7407 <= ~var5.field732.length) {
                                            arg1.field7407 = -1;
                                        }
                                    } else {
                                        arg1.field7407 = -1;
                                    }
                                } else {
                                    arg1.field7407 = -1;
                                }
                            }
                        } else {
                            arg1.field7360 = -1;
                        }
                    }
                } else {
                    arg1.field7360 = -1;
                }
            }
            if (~arg1.field7353 != 0 && ~class45.field685 <= ~arg1.field7348) {
                class525 var6 = class134.field1945.method3082((byte) 50, arg1.field7353);
                int var7 = var6.field7457;
                if (~var7 == 0) {
                    arg1.field7353 = -1;
                } else {
                    label369: {
                        class47 var8 = class203.field2769.method2971(-67, var7);
                        if (var6.field7470) {
                            if (var8.field731 == 3) {
                                if (arg1.field7434 > 0 && ~class45.field685 <= ~arg1.field7359 && ~class45.field685 < ~arg1.field7411) {
                                    arg1.field7353 = -1;
                                    break label369;
                                }
                            } else if (~var8.field731 == -2 && arg1.field7434 > 0 && ~arg1.field7359 >= ~class45.field685 && ~arg1.field7411 > ~class45.field685) {
                                arg1.field7348 = class45.field685 + 1;
                                break label369;
                            }
                        }
                        if (var8 != null && var8.field732 != null) {
                            if (arg1.field7388 < 0) {
                                arg1.field7388 = 0;
                                if (!arg1.field7372) {
                                    class620.method3567(arg1, 0, var8, (byte) -104);
                                }
                            }
                            ++arg1.field7331;
                            if (~arg1.field7388 > ~var8.field732.length && arg1.field7331 > var8.field729[arg1.field7388]) {
                                arg1.field7331 = 1;
                                ++arg1.field7388;
                                if (!arg1.field7372) {
                                    class620.method3567(arg1, arg1.field7388, var8, (byte) -17);
                                }
                            }
                            if (~var8.field732.length >= ~arg1.field7388) {
                                if (var6.field7470) {
                                    arg1.field7388 -= var8.field730;
                                    ++arg1.field7365;
                                    if (~arg1.field7365 > ~var8.field728) {
                                        if (arg1.field7388 >= 0 && ~var8.field732.length < ~arg1.field7388) {
                                            if (!arg1.field7372) {
                                                class620.method3567(arg1, arg1.field7388, var8, (byte) -112);
                                            }
                                        } else {
                                            arg1.field7353 = -1;
                                        }
                                    } else {
                                        arg1.field7353 = -1;
                                    }
                                } else {
                                    arg1.field7353 = -1;
                                }
                            }
                            arg1.field7393 = arg1.field7388 + 1;
                            if (~var8.field732.length >= ~arg1.field7393) {
                                if (var6.field7470) {
                                    arg1.field7393 -= var8.field730;
                                    if (~(arg1.field7365 + 1) <= ~var8.field728) {
                                        arg1.field7393 = -1;
                                    } else if (~arg1.field7393 > -1 || ~var8.field732.length >= ~arg1.field7393) {
                                        arg1.field7393 = -1;
                                    }
                                } else {
                                    arg1.field7393 = -1;
                                }
                            }
                        } else {
                            arg1.field7353 = -1;
                        }
                    }
                }
            }
            if (arg1.field7389 != -1 && ~arg1.field7392 >= -2) {
                class47 var9 = class203.field2769.method2971(-72, arg1.field7389);
                if (~var9.field731 == -4) {
                    if (~arg1.field7434 < -1 && ~arg1.field7359 >= ~class45.field685 && ~class45.field685 < ~arg1.field7411) {
                        arg1.field7389 = -1;
                        arg1.field7328 = null;
                    }
                } else if (var9.field731 == 1 && arg1.field7434 > 0 && class45.field685 >= arg1.field7359 && class45.field685 > arg1.field7411) {
                    arg1.field7392 = 2;
                }
            }
            if (arg1.field7389 != -1 && ~arg1.field7392 == -1) {
                class47 var10 = class203.field2769.method2971(-43, arg1.field7389);
                if (var10 != null && var10.field732 != null) {
                    ++arg1.field7391;
                    if (~arg1.field7419 > ~var10.field732.length && arg1.field7391 > var10.field729[arg1.field7419]) {
                        ++arg1.field7419;
                        arg1.field7391 = 1;
                        if (!arg1.field7372) {
                            class620.method3567(arg1, arg1.field7419, var10, (byte) -99);
                        }
                    }
                    if (~arg1.field7419 <= ~var10.field732.length) {
                        ++arg1.field7342;
                        arg1.field7419 -= var10.field730;
                        if (~arg1.field7342 > ~var10.field728) {
                            if (~arg1.field7419 <= -1 && ~arg1.field7419 > ~var10.field732.length) {
                                if (!arg1.field7372) {
                                    class620.method3567(arg1, arg1.field7419, var10, (byte) -112);
                                }
                            } else {
                                arg1.field7389 = -1;
                                arg1.field7328 = null;
                            }
                        } else {
                            arg1.field7389 = -1;
                            arg1.field7328 = null;
                        }
                    }
                    arg1.field7371 = arg1.field7419 + 1;
                    if (~arg1.field7371 <= ~var10.field732.length) {
                        arg1.field7371 -= var10.field730;
                        if (~var10.field728 < ~(arg1.field7342 + 1)) {
                            if (~arg1.field7371 > -1 || arg1.field7371 >= var10.field732.length) {
                                arg1.field7371 = -1;
                            }
                        } else {
                            arg1.field7371 = -1;
                        }
                    }
                } else {
                    arg1.field7389 = -1;
                    arg1.field7328 = null;
                }
            }
            if (~arg1.field7392 < -1) {
                --arg1.field7392;
            }
            for (int var11 = 0; ~arg1.field7344.length < ~var11; ++var11) {
                class220 var12 = arg1.field7344[var11];
                if (var12 != null) {
                    if (var12.field2922 > 0) {
                        --var12.field2922;
                    } else {
                        class47 var13 = class203.field2769.method2971(-53, var12.field2926);
                        if (var13 != null && var13.field732 != null) {
                            ++var12.field2924;
                            if (~var12.field2920 > ~var13.field732.length && var12.field2924 > var13.field729[var12.field2920]) {
                                var12.field2924 = 1;
                                ++var12.field2920;
                                if (!arg1.field7372) {
                                    class620.method3567(arg1, var12.field2920, var13, (byte) -84);
                                }
                            }
                            if (var12.field2920 >= var13.field732.length) {
                                var12.field2920 -= var13.field730;
                                ++var12.field2921;
                                if (~var12.field2921 > ~var13.field728) {
                                    if (var12.field2920 >= 0 && ~var13.field732.length < ~var12.field2920) {
                                        if (!arg1.field7372) {
                                            class620.method3567(arg1, var12.field2920, var13, (byte) -88);
                                        }
                                    } else {
                                        arg1.field7344[var11] = null;
                                    }
                                } else {
                                    arg1.field7344[var11] = null;
                                }
                            }
                            var12.field2918 = var12.field2920 + 1;
                            if (~var13.field732.length >= ~var12.field2918) {
                                var12.field2918 -= var13.field730;
                                if (var13.field728 <= var12.field2921 + 1) {
                                    var12.field2918 = -1;
                                } else if (~var12.field2918 > -1 || var13.field732.length <= var12.field2918) {
                                    var12.field2918 = -1;
                                }
                            }
                        } else {
                            arg1.field7344[var11] = null;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(IIZLr;)Z", line = 724)
    public final boolean method261(int arg0, int arg1, boolean arg2, class98 arg3) {
        ++field2739;
        class395 var5 = this.field2753.method1110((byte) -104, arg2, arg3, false, 131072);
        if (var5 == null) {
            return false;
        } else {
            class151 var6 = arg3.method682();
            var6.method883(super.field5913 + super.field7895, super.field7894, super.field5912 + super.field7896);
            return !class384.field5767 ? var5.method1026(arg0, arg1, var6, false) : var5.method1022(arg0, arg1, var6, false, class515.field7222);
        }
    }

    @OriginalMember(owner = "client!iq", name = "e", descriptor = "(I)Z", line = 741)
    public final boolean method274(int arg0) {
        if (arg0 != -1510217528) {
            this.field2753 = null;
        }
        ++field2747;
        return this.field2748;
    }

    @OriginalMember(owner = "client!iq", name = "c", descriptor = "(I)Z", line = 752)
    public final boolean method266(int arg0) {
        if (arg0 != 28107) {
            this.field2755 = false;
        }
        ++field2750;
        return this.field2753.method1105(-1);
    }

    @OriginalMember(owner = "client!iq", name = "e", descriptor = "(Z)V", line = 767)
    public static void method1310(boolean arg0) {
        field2744 = null;
        field2761 = null;
        if (!arg0) {
            field2763 = null;
        }
    }
}
