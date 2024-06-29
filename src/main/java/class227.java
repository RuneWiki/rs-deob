import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class227 extends class524 implements class232 {

    @OriginalMember(owner = "client!dj", name = "W", descriptor = "Z")
    private boolean field3335;

    @OriginalMember(owner = "client!dj", name = "T", descriptor = "Z")
    private boolean field3332;

    @OriginalMember(owner = "client!dj", name = "Q", descriptor = "Z")
    private boolean field3329;

    @OriginalMember(owner = "client!dj", name = "V", descriptor = "S")
    private short field3334;

    @OriginalMember(owner = "client!dj", name = "E", descriptor = "B")
    private byte field3317;

    @OriginalMember(owner = "client!dj", name = "Z", descriptor = "B")
    private byte field3338;

    @OriginalMember(owner = "client!dj", name = "N", descriptor = "B")
    private byte field3326;

    @OriginalMember(owner = "client!dj", name = "K", descriptor = "Z")
    private boolean field3323;

    @OriginalMember(owner = "client!dj", name = "D", descriptor = "Lc;")
    public class121 field3316;

    @OriginalMember(owner = "client!dj", name = "w", descriptor = "Lj;")
    private class377 field3309;

    @OriginalMember(owner = "client!dj", name = "O", descriptor = "I")
    public static int field3327 = 0;

    @OriginalMember(owner = "client!dj", name = "S", descriptor = "[Ljava/lang/String;")
    public static String[] field3331 = new String[200];

    @OriginalMember(owner = "client!dj", name = "Y", descriptor = "I")
    public static int field3337 = 0;

    @OriginalMember(owner = "client!dj", name = "u", descriptor = "I")
    public static int field3307;

    @OriginalMember(owner = "client!dj", name = "v", descriptor = "I")
    public static int field3308;

    @OriginalMember(owner = "client!dj", name = "x", descriptor = "I")
    public static int field3310;

    @OriginalMember(owner = "client!dj", name = "y", descriptor = "I")
    public static int field3311;

    @OriginalMember(owner = "client!dj", name = "z", descriptor = "I")
    public static int field3312;

    @OriginalMember(owner = "client!dj", name = "A", descriptor = "I")
    public static int field3313;

    @OriginalMember(owner = "client!dj", name = "C", descriptor = "I")
    public static int field3315;

    @OriginalMember(owner = "client!dj", name = "F", descriptor = "I")
    public static int field3318;

    @OriginalMember(owner = "client!dj", name = "G", descriptor = "I")
    public static int field3319;

    @OriginalMember(owner = "client!dj", name = "H", descriptor = "I")
    public static int field3320;

    @OriginalMember(owner = "client!dj", name = "I", descriptor = "I")
    public static int field3321;

    @OriginalMember(owner = "client!dj", name = "J", descriptor = "I")
    public static int field3322;

    @OriginalMember(owner = "client!dj", name = "L", descriptor = "I")
    public static int field3324;

    @OriginalMember(owner = "client!dj", name = "M", descriptor = "I")
    public static int field3325;

    @OriginalMember(owner = "client!dj", name = "P", descriptor = "I")
    public static int field3328;

    @OriginalMember(owner = "client!dj", name = "R", descriptor = "I")
    public static int field3330;

    @OriginalMember(owner = "client!dj", name = "U", descriptor = "I")
    public static int field3333;

    @OriginalMember(owner = "client!dj", name = "X", descriptor = "I")
    public static int field3336;

    @OriginalMember(owner = "client!dj", name = "ab", descriptor = "I")
    public static int field3339;

    @OriginalMember(owner = "client!dj", name = "B", descriptor = "Lqs;")
    public static class425 field3314;

    @OriginalMember(owner = "client!dj", name = "i", descriptor = "(I)V")
    public static void method1498(int arg0) {
        field3331 = null;
        field3314 = null;
        if (arg0 != 24315) {
            method1498(32);
        }
    }

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "(I)V")
    public final void method376(int arg0) {
        ++field3310;
        if (arg0 != 16931) {
            this.method126((class162) null, -111);
        }
        if (this.field3316 != null) {
            this.field3316.method891();
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IILqa;IZLha;I)V")
    public final void method111(int arg0, int arg1, class162 arg2, int arg3, boolean arg4, class41 arg5, int arg6) {
        ++field3330;
        if (arg3 < 5) {
            field3331 = null;
        }
        if (!(arg5 instanceof class227)) {
            if (arg5 instanceof class225) {
                class225 var8 = (class225) arg5;
                if (this.field3316 != null && var8.field3266 != null) {
                    this.field3316.method907(var8.field3266, arg1, arg0, arg6, arg4);
                    return;
                }
            }
        } else {
            class227 var9 = (class227) arg5;
            if (this.field3316 == null || var9.field3316 == null) {
                return;
            }
            this.field3316.method907(var9.field3316, arg1, arg0, arg6, arg4);
        }
    }

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "(I)Z")
    public final boolean method121(int arg0) {
        if (arg0 != 26923) {
            this.method377(11);
        }
        ++field3312;
        return this.field3329;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Z)I")
    public final int method380(boolean arg0) {
        if (!arg0) {
            this.method117(39);
        }
        ++field3311;
        return this.field3326;
    }

    @OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(Lqa;Lbo;IIIIZIIZ)V")
    public class227(class162 arg0, class510 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, boolean arg9) {
        super(arg3, arg4, arg5, class454.method2737(0, arg8, arg7));
        this.field3335 = ~arg1.field7491 != -1 && !arg6;
        super.field7708 = arg5;
        this.field3332 = arg6;
        this.field3329 = arg9;
        this.field3334 = (short) arg1.field7483;
        this.field3317 = (byte) arg8;
        super.field7706 = arg3;
        this.field3338 = (byte) arg2;
        this.field3326 = (byte) arg7;
        this.field3323 = arg0.method481() && arg1.field7489 && !this.field3332 && class397.field5830.method56((byte) -123, class399.field5865) != 0;
        int var11 = 2048;
        if (this.field3329) {
            var11 |= 65536;
        }
        class505 var12 = this.method1500(this.field3323, arg0, 7747, var11);
        if (var12 != null) {
            this.field3316 = var12.field7408;
            this.field3309 = var12.field7405;
            if (this.field3329) {
                this.field3316 = this.field3316.method881((byte) 0, var11, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(I)Z")
    public final boolean method377(int arg0) {
        ++field3324;
        if (arg0 >= -27) {
            this.method377(99);
        }
        return this.field3323;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILqa;)Lbw;")
    public final class482 method114(int arg0, class162 arg1) {
        ++field3321;
        if (this.field3316 == null) {
            return null;
        } else if (arg0 != -6796) {
            return null;
        } else {
            class413 var3 = arg1.method439();
            var3.method1008(super.field7706, super.field7709, super.field7708);
            class482 var4 = null;
            if (this.field3335) {
                var4 = class410.method2537((byte) -86, 1);
            }
            this.field3316.method910(var3, var4 == null ? null : var4.field7079[0], 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILqa;I)Lc;")
    private final class121 method1499(int arg0, class162 arg1, int arg2) {
        ++field3315;
        if (this.field3316 != null && arg1.method518(this.field3316.method915(), arg0) == 0) {
            return this.field3316;
        } else if (arg2 != 0) {
            return null;
        } else {
            class505 var4 = this.method1500(false, arg1, 7747, arg0);
            return var4 != null ? var4.field7408 : null;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(ZLqa;II)Lrl;")
    private final class505 method1500(boolean arg0, class162 arg1, int arg2, int arg3) {
        ++field3313;
        class510 var5 = class246.field3567.method609(116, this.field3334 & 65535);
        if (arg2 != 7747) {
            this.field3326 = -101;
        }
        class35 var6;
        class35 var7;
        if (this.field3332) {
            var6 = class145.field2135[0];
            var7 = class62.field1063[this.field3338];
        } else {
            var7 = class145.field2135[this.field3338];
            if (this.field3338 < 3) {
                var6 = class145.field2135[this.field3338 - -1];
            } else {
                var6 = null;
            }
        }
        return var5.method3016(arg1, var6, super.field7709, this.field3326, super.field7706, this.field3317, arg0, (byte) -120, super.field7708, arg3, var7);
    }

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "(Lqa;I)V")
    public final void method126(class162 arg0, int arg1) {
        if (arg1 <= -43) {
            ++field3328;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(B)I")
    public final int method379(byte arg0) {
        if (arg0 != -96) {
            field3314 = null;
        }
        ++field3319;
        return this.field3334 & 65535;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lqa;I)V")
    public final void method374(class162 arg0, int arg1) {
        ++field3333;
        if (arg1 == 28339) {
            Object var3 = null;
            class377 var5;
            if (this.field3309 == null && this.field3323) {
                class505 var4 = this.method1500(true, arg0, 7747, 262144);
                var5 = var4 == null ? null : var4.field7405;
            } else {
                var5 = this.field3309;
                this.field3309 = null;
            }
            if (var5 != null) {
                class393.method2457(var5, this.field3338, super.field7706, super.field7708, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "(I)V")
    public final void method117(int arg0) {
        if (arg0 >= -127) {
            this.method379((byte) -79);
        }
        this.field3329 = false;
        ++field3336;
        if (this.field3316 != null) {
            this.field3316.method894(-65537 & this.field3316.method915());
        }
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(I)I")
    public final int method375(int arg0) {
        ++field3308;
        if (arg0 != -13015) {
            field3337 = -69;
        }
        return this.field3317;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIILqa;)Z")
    public final boolean method122(int arg0, int arg1, int arg2, class162 arg3) {
        ++field3320;
        if (arg1 != -1) {
            this.method375(-122);
        }
        class121 var5 = this.method1499(131072, arg3, 0);
        if (var5 != null) {
            class413 var6 = arg3.method439();
            var6.method1008(super.field7706, super.field7709, super.field7708);
            return var5.method909(arg2, arg0, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IILqa;)Lc;")
    public final class121 method381(int arg0, int arg1, class162 arg2) {
        ++field3307;
        if (arg0 != 1584) {
            this.field3332 = false;
        }
        return this.method1499(arg1, arg2, 0);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lqs;B[[B)V")
    public static final void method1501(class425 arg0, byte arg1, byte[][] arg2) {
        ++field3325;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        for (int var4 = 0; ~arg0.field2250 < ~var4; ++var4) {
            class292.method1811(true);
            for (int var5 = 0; ~var5 > ~(class237.field3436 >> 3); ++var5) {
                for (int var6 = 0; ~(class83.field1366 >> 3) < ~var6; ++var6) {
                    boolean var7 = false;
                    int var8 = class332.field5101[var4][var5][var6];
                    if (var8 != -1) {
                        int var9 = (var8 & 53597042) >> 24;
                        if (!arg0.field2251 || var9 == 0) {
                            int var10 = var8 >> 1 & 3;
                            int var11 = (var8 & 16775463) >> 14;
                            int var12 = (var8 & 16380) >> 3;
                            int var13 = (var11 / 8 << 8) - -(var12 / 8);
                            for (int var14 = 0; ~class274.field3954.length < ~var14; ++var14) {
                                if (class274.field3954[var14] == var13 && arg2[var14] != null) {
                                    class303 var15 = new class303(arg2[var14]);
                                    arg0.method1065(var6 * 8, var12, var15, (byte) 56, var4, var5 * 8, class255.field3679, var11, var9, var10);
                                    arg0.method2597(var9, var4, (byte) 20, var12, var10, var11, var6 * 8, var15, ~var3[0] != 0 ? null : var3, class394.field5821, var5 * 8);
                                    var7 = true;
                                    break;
                                }
                            }
                        }
                    }
                    if (!var7) {
                        arg0.method1077(var4, false, 8, var6 * 8, var5 * 8, 8);
                    }
                }
            }
        }
        if (arg1 >= 124) {
            if (~var3[0] != 0) {
                class118.field1861 = class233.field3389.method1209(class25.field443, (byte) 59, var3[3], var3[0], var3[2], var3[1]);
                class37.field574 = var3[4];
            }
        }
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(Lqa;I)V")
    public final void method373(class162 arg0, int arg1) {
        ++field3322;
        if (arg1 != -2304) {
            this.field3316 = null;
        }
        Object var3 = null;
        class377 var5;
        if (this.field3309 == null && this.field3323) {
            class505 var4 = this.method1500(true, arg0, 7747, 262144);
            var5 = var4 != null ? var4.field7405 : null;
        } else {
            var5 = this.field3309;
            this.field3309 = null;
        }
        if (var5 != null) {
            class434.method2623(var5, this.field3338, super.field7706, super.field7708, (boolean[]) null);
        }
    }
}
