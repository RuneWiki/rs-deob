import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public class class176 extends class205 {

    @OriginalMember(owner = "client!rn", name = "C", descriptor = "Z")
    private boolean field2285 = false;

    @OriginalMember(owner = "client!rn", name = "K", descriptor = "I")
    private int field2293 = -1;

    @OriginalMember(owner = "client!rn", name = "E", descriptor = "I")
    private int field2287 = 0;

    @OriginalMember(owner = "client!rn", name = "db", descriptor = "I")
    private int field2312 = -32768;

    @OriginalMember(owner = "client!rn", name = "nb", descriptor = "I")
    private int field2322 = 0;

    @OriginalMember(owner = "client!rn", name = "B", descriptor = "Z")
    private boolean field2284;

    @OriginalMember(owner = "client!rn", name = "sb", descriptor = "I")
    public int field2327;

    @OriginalMember(owner = "client!rn", name = "X", descriptor = "I")
    private int field2306;

    @OriginalMember(owner = "client!rn", name = "T", descriptor = "I")
    public int field2302;

    @OriginalMember(owner = "client!rn", name = "mb", descriptor = "I")
    private int field2321;

    @OriginalMember(owner = "client!rn", name = "L", descriptor = "I")
    private int field2294;

    @OriginalMember(owner = "client!rn", name = "M", descriptor = "I")
    public int field2295;

    @OriginalMember(owner = "client!rn", name = "S", descriptor = "I")
    private int field2301;

    @OriginalMember(owner = "client!rn", name = "ib", descriptor = "I")
    public int field2317;

    @OriginalMember(owner = "client!rn", name = "G", descriptor = "Lid;")
    private class415 field2289;

    @OriginalMember(owner = "client!rn", name = "N", descriptor = "Lap;")
    public static class335 field2296 = new class335(" from your ignore list first.", " zuerst von deiner Ignorieren-Liste!", " de votre liste noire.", " da sua lista de ignorados primeiro.");

    @OriginalMember(owner = "client!rn", name = "pb", descriptor = "I")
    public static int field2324 = 0;

    @OriginalMember(owner = "client!rn", name = "z", descriptor = "D")
    private double field2282;

    @OriginalMember(owner = "client!rn", name = "F", descriptor = "D")
    private double field2288;

    @OriginalMember(owner = "client!rn", name = "I", descriptor = "D")
    private double field2291;

    @OriginalMember(owner = "client!rn", name = "J", descriptor = "D")
    private double field2292;

    @OriginalMember(owner = "client!rn", name = "Q", descriptor = "D")
    private double field2299;

    @OriginalMember(owner = "client!rn", name = "U", descriptor = "D")
    private double field2303;

    @OriginalMember(owner = "client!rn", name = "Z", descriptor = "D")
    private double field2308;

    @OriginalMember(owner = "client!rn", name = "rb", descriptor = "D")
    private double field2326;

    @OriginalMember(owner = "client!rn", name = "y", descriptor = "I")
    public static int field2281;

    @OriginalMember(owner = "client!rn", name = "A", descriptor = "I")
    public static int field2283;

    @OriginalMember(owner = "client!rn", name = "D", descriptor = "I")
    public static int field2286;

    @OriginalMember(owner = "client!rn", name = "H", descriptor = "I")
    public static int field2290;

    @OriginalMember(owner = "client!rn", name = "P", descriptor = "I")
    private int field2298;

    @OriginalMember(owner = "client!rn", name = "R", descriptor = "I")
    public static int field2300;

    @OriginalMember(owner = "client!rn", name = "V", descriptor = "I")
    public static int field2304;

    @OriginalMember(owner = "client!rn", name = "W", descriptor = "I")
    public static int field2305;

    @OriginalMember(owner = "client!rn", name = "ab", descriptor = "I")
    public static int field2309;

    @OriginalMember(owner = "client!rn", name = "bb", descriptor = "I")
    public static int field2310;

    @OriginalMember(owner = "client!rn", name = "cb", descriptor = "I")
    public static int field2311;

    @OriginalMember(owner = "client!rn", name = "eb", descriptor = "I")
    private int field2313;

    @OriginalMember(owner = "client!rn", name = "fb", descriptor = "I")
    public static int field2314;

    @OriginalMember(owner = "client!rn", name = "gb", descriptor = "I")
    public static int field2315;

    @OriginalMember(owner = "client!rn", name = "hb", descriptor = "I")
    public static int field2316;

    @OriginalMember(owner = "client!rn", name = "jb", descriptor = "I")
    public static int field2318;

    @OriginalMember(owner = "client!rn", name = "kb", descriptor = "I")
    public static int field2319;

    @OriginalMember(owner = "client!rn", name = "lb", descriptor = "I")
    public static int field2320;

    @OriginalMember(owner = "client!rn", name = "ob", descriptor = "I")
    public static int field2323;

    @OriginalMember(owner = "client!rn", name = "qb", descriptor = "I")
    public static int field2325;

    @OriginalMember(owner = "client!rn", name = "Y", descriptor = "Lei;")
    public static class118 field2307;

    @OriginalMember(owner = "client!rn", name = "O", descriptor = "Lhk;")
    private class67 field2297;

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(IZ)V")
    public final void method1121(int arg0, boolean arg1) {
        if (arg1) {
            this.field2312 = 101;
        }
        this.field2303 += (double) arg0 * this.field2326;
        ++field2309;
        this.field2291 += (double) arg0 * this.field2299;
        this.field2285 = true;
        if (this.field2284) {
            this.field2282 = (double) (class151.method991((int) this.field2303, false, super.field2676, (int) this.field2291) - this.field2306);
        } else if (this.field2294 == -1) {
            this.field2282 += (double) arg0 * this.field2308;
        } else {
            this.field2282 += this.field2292 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field2308;
            this.field2308 += (double) arg0 * this.field2292;
        }
        this.field2298 = 16383 & (int) (Math.atan2(this.field2299, this.field2326) * 2607.5945876176133D) + 8192;
        this.field2313 = 16383 & (int) (2607.5945876176133D * Math.atan2(this.field2308, this.field2288));
        if (this.field2289 != null) {
            this.field2287 += arg0;
            while (true) {
                do {
                    do {
                        if (this.field2287 <= this.field2289.field5915[this.field2322]) {
                            return;
                        }
                        this.field2287 -= this.field2289.field5915[this.field2322];
                        ++this.field2322;
                        if (~this.field2322 <= ~this.field2289.field5927.length) {
                            this.field2322 -= this.field2289.field5909;
                            if (this.field2322 < 0 || this.field2289.field5927.length <= this.field2322) {
                                this.field2322 = 0;
                            }
                        }
                        this.field2293 = this.field2322 + 1;
                    } while (~this.field2289.field5927.length < ~this.field2293);
                    this.field2293 -= this.field2289.field5909;
                } while (this.field2293 >= 0 && this.field2289.field5927.length > this.field2293);
                this.field2293 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(I)V")
    public final void method1122(int arg0) {
        if (this.field2297 != null) {
            this.field2297.method592();
        }
        ++field2286;
        if (arg0 != 29236) {
            this.field2292 = 1.2556228565743495D;
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(B)Z")
    public final boolean method194(byte arg0) {
        ++field2300;
        return arg0 >= -72 ? false : false;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(IIBII)V")
    public static final void method1123(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        ++field2305;
        if (~class147.field1870 >= ~(-arg1 + arg4) && arg1 + arg4 <= class237.field3019 && ~class533.field7845 >= ~(arg0 - arg1) && ~class289.field3694 <= ~(arg0 + arg1)) {
            class405.method2399(arg1, arg0, 0, arg4, arg3);
        } else {
            class244.method1484(arg3, (byte) 106, arg4, arg1, arg0);
        }
        if (arg2 < 79) {
            field2296 = null;
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(ZBLwg;)V")
    public static final void method1124(boolean arg0, byte arg1, class295 arg2) {
        ++field2316;
        if (~class2.field24 > -401) {
            class477 var3 = arg2.field3773;
            if (arg1 < -62) {
                if (var3.field6922 != null) {
                    var3 = var3.method2903(-1, class491.field7160);
                    if (var3 == null) {
                        return;
                    }
                }
                if (var3.field6974) {
                    String var4 = var3.field6946;
                    if (~var3.field6984 != -1) {
                        String var5 = class530.field7803 != class335.field4230 ? class70.field917.method1936(-26539, class11.field177) : class66.field857.method1936(-26539, class11.field177);
                        var4 = var4 + class243.method1482(var3.field6984, -1, class23.field336.field2855) + " (" + var5 + var3.field6984 + ")";
                    }
                    if (!class211.field2717) {
                        if (!arg0) {
                            String[] var6 = var3.field6985;
                            if (class252.field3215) {
                                var6 = class198.method1250(var6, -30271);
                            }
                            if (var6 != null) {
                                for (int var7 = 4; ~var7 <= -1; --var7) {
                                    if (var6[var7] != null && (var3.field6982 == 0 || !var6[var7].equalsIgnoreCase(class466.field6740.method1936(-26539, class11.field177)))) {
                                        byte var8 = 0;
                                        int var9 = class421.field5976;
                                        if (var7 == 0) {
                                            var8 = 25;
                                        }
                                        if (~var7 == -2) {
                                            var8 = 13;
                                        }
                                        if (~var7 == -3) {
                                            var8 = 19;
                                        }
                                        if (~var7 == -4) {
                                            var8 = 8;
                                        }
                                        if (var7 == 4) {
                                            var8 = 22;
                                        }
                                        if (~var3.field6934 == ~var7) {
                                            var9 = var3.field6936;
                                        }
                                        if (~var3.field6940 == ~var7) {
                                            var9 = var3.field6952;
                                        }
                                        class8.method45(22461, (long) arg2.field4890, -1, 0, 0, var9, "<col=ffff00>" + var4, var8, false, var6[var7], true);
                                        ++class480.field7020;
                                    }
                                }
                            }
                            if (~var3.field6982 == -2 && var6 != null) {
                                for (int var10 = 4; var10 >= 0; --var10) {
                                    if (var6[var10] != null && var6[var10].equalsIgnoreCase(class466.field6740.method1936(-26539, class11.field177))) {
                                        short var11 = 0;
                                        if (var3.field6984 > class23.field336.field2855) {
                                            var11 = 2000;
                                        }
                                        short var12 = 0;
                                        if (~var10 == -1) {
                                            var12 = 25;
                                        }
                                        if (var10 == 1) {
                                            var12 = 13;
                                        }
                                        if (var10 == 2) {
                                            var12 = 19;
                                        }
                                        if (~var10 == -4) {
                                            var12 = 8;
                                        }
                                        if (var10 == 4) {
                                            var12 = 22;
                                        }
                                        if (~var12 != -1) {
                                            var12 += var11;
                                        }
                                        class8.method45(22461, (long) arg2.field4890, -1, 0, 0, var3.field6937, "<col=ffff00>" + var4, var12, false, var6[var10], true);
                                        ++class301.field3871;
                                    }
                                }
                            }
                        }
                        ++class280.field3561;
                        class8.method45(22461, (long) arg2.field4890, -1, 0, 0, class501.field7238, "<col=ffff00>" + var4, 1008, arg0, class462.field6603.method1936(-26539, class11.field177), true);
                    } else {
                        if (!arg0) {
                            class172 var13 = ~class496.field7211 != 0 ? class199.field2592.method2579((byte) -116, class496.field7211) : null;
                            if ((class92.field1125 & 2) != 0) {
                                if (var13 == null || ~var3.method2910(-38, class496.field7211, var13.field2188) != ~var13.field2188) {
                                    ++class100.field1210;
                                    class8.method45(22461, (long) arg2.field4890, -1, 0, 0, class468.field6768, class446.field6389 + " -> <col=ffff00>" + var4, 16, false, class516.field7480, true);
                                }
                                return;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(IIIII)V")
    public final void method1125(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!this.field2285) {
            double var6 = (double) (-super.field2666 + arg0);
            double var8 = (double) (-super.field2677 + arg4);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field2303 = (double) this.field2301 * var8 / var10 + (double) super.field2677;
            this.field2291 = (double) this.field2301 * var6 / var10 + (double) super.field2666;
            if (this.field2284) {
                this.field2282 = (double) (class151.method991((int) this.field2303, false, super.field2676, (int) this.field2291) - this.field2306);
            } else {
                this.field2282 = (double) super.field2672;
            }
        }
        ++field2325;
        double var12 = (double) (-arg3 + this.field2295 + 1);
        this.field2299 = ((double) arg0 + -this.field2291) / var12;
        this.field2326 = ((double) arg4 - this.field2303) / var12;
        int var14 = -62 / ((-4 - arg2) / 54);
        this.field2288 = Math.sqrt(this.field2326 * this.field2326 + this.field2299 * this.field2299);
        if (~this.field2294 == 0) {
            this.field2308 = ((double) arg1 + -this.field2282) / var12;
        } else {
            if (!this.field2285) {
                this.field2308 = -this.field2288 * Math.tan((double) this.field2294 * 0.02454369D);
            }
            this.field2292 = ((double) arg1 + -this.field2282 + -(this.field2308 * var12)) * 2.0D / (var12 * var12);
        }
    }

    @OriginalMember(owner = "client!rn", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.field2297 != null) {
            this.field2297.method592();
        }
        ++field2320;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(ZLya;)Llo;")
    public final class531 method181(boolean arg0, class38 arg1) {
        ++field2304;
        class474 var3 = this.method1126(2048, arg1, -51);
        if (var3 == null) {
            return null;
        } else {
            class123 var4 = arg1.method369();
            var4.method232(this.field2313);
            var4.method226(this.field2298);
            var4.method231((int) this.field2291, (int) this.field2282, (int) this.field2303);
            if (!arg0) {
                this.method1121(-89, false);
            }
            if (this.field2297 != null) {
                class517 var5 = this.field2297.method594();
                arg1.method366(var3, var5, var4, (class419) null, 0);
            } else {
                var3.method415(var4, (class419) null, 0);
            }
            this.field2312 = var3.method418();
            this.method1128((byte) -122, var3, arg1);
            return null;
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(ILya;II)Z")
    public final boolean method186(int arg0, class38 arg1, int arg2, int arg3) {
        ++field2311;
        if (arg0 <= 66) {
            method1123(108, 92, (byte) -49, -23, -48);
        }
        return false;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(ILya;I)Lt;")
    private final class474 method1126(int arg0, class38 arg1, int arg2) {
        if (arg2 > -20) {
            return null;
        } else {
            ++field2318;
            class466 var4 = class120.field1624.method1836(-2, this.field2321);
            return var4.method2815(class404.field5756, this.field2287, (byte) -127, arg0, this.field2293, arg1, this.field2322);
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(Lgg;IZIIILya;)V")
    public final void method193(class117 arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, class38 arg6) {
        int var8 = 70 / ((arg5 - 27) / 40);
        ++field2281;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "(I)V")
    public static void method1127(int arg0) {
        if (arg0 != 6523) {
            method1127(62);
        }
        field2307 = null;
        field2296 = null;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(BLt;Lya;)V")
    private final void method1128(byte arg0, class474 arg1, class38 arg2) {
        ++field2310;
        if (arg0 < -91) {
            class342[] var4 = arg1.method441();
            class390[] var5 = arg1.method427();
            if ((this.field2297 == null || this.field2297.field860) && (var4 != null || var5 != null)) {
                this.field2297 = new class67(class163.field2065);
            }
            if (this.field2297 != null) {
                this.field2297.method590(arg2, (long) class163.field2065, var4, var5, false);
                this.field2297.method601(super.field2676, super.field2673, super.field2681, super.field2671, super.field2670);
            }
        }
    }

    @OriginalMember(owner = "client!rn", name = "f", descriptor = "(I)V")
    public final void method1129(int arg0) {
        super.field2671 = super.field2670 = (short) ((int) (this.field2303 / 128.0D));
        if (arg0 != 1) {
            this.field2297 = null;
        }
        super.field2673 = super.field2681 = (short) ((int) (this.field2291 / 128.0D));
        ++field2323;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;)I")
    public static final int method1130(int arg0, String arg1, int arg2, String arg3) {
        ++field2315;
        int var4 = arg1.length();
        int var5 = arg3.length();
        int var6 = 0;
        int var7 = 0;
        char var8 = 0;
        char var9 = 0;
        while (var6 - var8 < var4 || ~var5 < ~(-var9 + var7)) {
            if (-var8 + var6 >= var4) {
                return -1;
            }
            if (~var5 >= ~(-var9 + var7)) {
                return 1;
            }
            char var22;
            if (~var8 != -1) {
                var22 = var8;
                boolean var23 = false;
            } else {
                var22 = arg1.charAt(var6++);
            }
            char var24;
            if (var9 == 0) {
                var24 = arg3.charAt(var7++);
            } else {
                var24 = var9;
                boolean var25 = false;
            }
            var8 = class451.method2687((byte) 21, var22);
            var9 = class451.method2687((byte) 21, var24);
            char var26 = class99.method745(arg0, 86, var22);
            char var27 = class99.method745(arg0, 71, var24);
            if (var26 != var27 && ~Character.toUpperCase(var26) != ~Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (~var28 != ~var29) {
                    return class256.method1540(var28, arg0, 130) - class256.method1540(var29, arg0, 130);
                }
            }
        }
        int var10 = Math.min(var4, var5);
        for (int var11 = arg2; ~var10 < ~var11; ++var11) {
            int var16;
            int var17;
            if (~arg0 == -3) {
                var16 = -var11 + -1 + var5;
                var17 = var4 + -1 + -var11;
            } else {
                var16 = var11;
                var17 = var11;
            }
            char var18 = arg1.charAt(var17);
            char var19 = arg3.charAt(var16);
            if (~var18 != ~var19 && Character.toUpperCase(var18) != Character.toUpperCase(var19)) {
                char var20 = Character.toLowerCase(var18);
                char var21 = Character.toLowerCase(var19);
                if (var20 != var21) {
                    return class256.method1540(var20, arg0, 130) + -class256.method1540(var21, arg0, 130);
                }
            }
        }
        int var12 = var4 - var5;
        if (~var12 != -1) {
            return var12;
        } else {
            for (int var13 = 0; var10 > var13; ++var13) {
                char var14 = arg1.charAt(var13);
                char var15 = arg3.charAt(var13);
                if (var14 != var15) {
                    return class256.method1540(var14, arg0, arg2 ^ 130) + -class256.method1540(var15, arg0, 130);
                }
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "(B)V")
    public final void method180(byte arg0) {
        if (arg0 != -2) {
            method1130(-83, (String) null, -7, (String) null);
        }
        ++field2314;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(Lya;I)V")
    public final void method192(class38 arg0, int arg1) {
        ++field2290;
        class474 var3 = this.method1126(0, arg0, arg1 ^ -38);
        if (var3 != null) {
            class123 var4 = arg0.method369();
            var4.method232(this.field2313);
            var4.method226(this.field2298);
            var4.method231((int) this.field2291, (int) this.field2282, (int) this.field2303);
            this.field2312 = var3.method418();
            this.method1128((byte) -101, var3, arg0);
            if (arg1 != 1) {
                this.field2306 = -67;
            }
        }
    }

    @OriginalMember(owner = "client!rn", name = "e", descriptor = "(I)I")
    public final int method733(int arg0) {
        ++field2283;
        if (arg0 != -29382) {
            this.field2288 = 0.16035941247709207D;
        }
        return this.field2312;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(ZI)Z")
    public static final boolean method1131(boolean arg0, int arg1) {
        ++field2319;
        boolean var2 = class33.field416.method304();
        int var3 = -88 % ((arg1 - 17) / 37);
        if (var2 == !arg0) {
            if (!arg0) {
                class33.field416.method302();
            } else if (!class33.field416.method374()) {
                arg0 = false;
            }
            if (!arg0 == !var2) {
                return false;
            } else {
                class407.field5817.field3640 = arg0;
                class407.field5817.method578((byte) 64, class219.field2794);
                return true;
            }
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!rn", name = "<init>", descriptor = "(IIIIIIIIIIIZ)V")
    public class176(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, boolean arg11) {
        super(arg1, arg2, -arg4 + class151.method991(arg3, false, arg1, arg2), arg3, arg2 >> 7, arg2 >> 7, arg3 >> 7, arg3 >> 7, false, (byte) 0);
        this.field2284 = arg11;
        this.field2327 = arg5;
        this.field2306 = arg4;
        this.field2302 = arg9;
        this.field2321 = arg0;
        this.field2285 = false;
        this.field2294 = arg7;
        this.field2295 = arg6;
        this.field2301 = arg8;
        this.field2317 = arg10;
        int var13 = class120.field1624.method1836(-39, this.field2321).field6746;
        if (var13 == -1) {
            this.field2289 = null;
        } else {
            this.field2289 = class404.field5756.method557(var13, 15);
        }
    }
}
