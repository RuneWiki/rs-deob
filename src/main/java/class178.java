import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hp")
public class class178 extends class233 {

    @OriginalMember(owner = "client!hp", name = "W", descriptor = "I")
    private int field2425 = -1;

    @OriginalMember(owner = "client!hp", name = "G", descriptor = "Z")
    private boolean field2411 = false;

    @OriginalMember(owner = "client!hp", name = "U", descriptor = "I")
    private int field2424 = -32768;

    @OriginalMember(owner = "client!hp", name = "O", descriptor = "I")
    private int field2418 = 0;

    @OriginalMember(owner = "client!hp", name = "nb", descriptor = "I")
    private int field2442 = 0;

    @OriginalMember(owner = "client!hp", name = "ab", descriptor = "I")
    public int field2429;

    @OriginalMember(owner = "client!hp", name = "Z", descriptor = "I")
    private int field2428;

    @OriginalMember(owner = "client!hp", name = "F", descriptor = "I")
    public int field2410;

    @OriginalMember(owner = "client!hp", name = "T", descriptor = "I")
    public int field2423;

    @OriginalMember(owner = "client!hp", name = "tb", descriptor = "I")
    public int field2448;

    @OriginalMember(owner = "client!hp", name = "S", descriptor = "I")
    private int field2422;

    @OriginalMember(owner = "client!hp", name = "H", descriptor = "I")
    private int field2412;

    @OriginalMember(owner = "client!hp", name = "qb", descriptor = "Lkb;")
    private class412 field2445;

    @OriginalMember(owner = "client!hp", name = "lb", descriptor = "Lwq;")
    public static class92 field2440 = new class92();

    @OriginalMember(owner = "client!hp", name = "E", descriptor = "D")
    private double field2409;

    @OriginalMember(owner = "client!hp", name = "K", descriptor = "D")
    private double field2415;

    @OriginalMember(owner = "client!hp", name = "P", descriptor = "D")
    private double field2419;

    @OriginalMember(owner = "client!hp", name = "ob", descriptor = "D")
    private double field2443;

    @OriginalMember(owner = "client!hp", name = "pb", descriptor = "D")
    private double field2444;

    @OriginalMember(owner = "client!hp", name = "ub", descriptor = "D")
    private double field2449;

    @OriginalMember(owner = "client!hp", name = "vb", descriptor = "D")
    private double field2450;

    @OriginalMember(owner = "client!hp", name = "wb", descriptor = "D")
    private double field2451;

    @OriginalMember(owner = "client!hp", name = "D", descriptor = "I")
    public static int field2408;

    @OriginalMember(owner = "client!hp", name = "I", descriptor = "I")
    public static int field2413;

    @OriginalMember(owner = "client!hp", name = "J", descriptor = "I")
    public static int field2414;

    @OriginalMember(owner = "client!hp", name = "L", descriptor = "I")
    private int field2416;

    @OriginalMember(owner = "client!hp", name = "N", descriptor = "I")
    public static int field2417;

    @OriginalMember(owner = "client!hp", name = "Q", descriptor = "I")
    public static int field2420;

    @OriginalMember(owner = "client!hp", name = "R", descriptor = "I")
    public static int field2421;

    @OriginalMember(owner = "client!hp", name = "X", descriptor = "I")
    private int field2426;

    @OriginalMember(owner = "client!hp", name = "Y", descriptor = "I")
    public static int field2427;

    @OriginalMember(owner = "client!hp", name = "bb", descriptor = "I")
    public static int field2430;

    @OriginalMember(owner = "client!hp", name = "db", descriptor = "I")
    public static int field2432;

    @OriginalMember(owner = "client!hp", name = "eb", descriptor = "I")
    public static int field2433;

    @OriginalMember(owner = "client!hp", name = "fb", descriptor = "I")
    public static int field2434;

    @OriginalMember(owner = "client!hp", name = "gb", descriptor = "I")
    public static int field2435;

    @OriginalMember(owner = "client!hp", name = "hb", descriptor = "I")
    public static int field2436;

    @OriginalMember(owner = "client!hp", name = "jb", descriptor = "I")
    public static int field2438;

    @OriginalMember(owner = "client!hp", name = "kb", descriptor = "I")
    public static int field2439;

    @OriginalMember(owner = "client!hp", name = "mb", descriptor = "I")
    public static int field2441;

    @OriginalMember(owner = "client!hp", name = "sb", descriptor = "I")
    public static int field2447;

    @OriginalMember(owner = "client!hp", name = "cb", descriptor = "Lrd;")
    public static class185 field2431;

    @OriginalMember(owner = "client!hp", name = "ib", descriptor = "Lom;")
    private class209 field2437;

    @OriginalMember(owner = "client!hp", name = "xb", descriptor = "Z")
    public static boolean field2452;

    @OriginalMember(owner = "client!hp", name = "rb", descriptor = "[Lgj;")
    public static class381[] field2446;

    @OriginalMember(owner = "client!hp", name = "c", descriptor = "(II)V")
    public final void method1202(int arg0, int arg1) {
        this.field2409 += (double) arg0 * this.field2444;
        if (arg1 == -1) {
            this.field2443 += (double) arg0 * this.field2451;
            if (~this.field2422 == 0) {
                this.field2449 += (double) arg0 * this.field2415;
            } else {
                this.field2449 += this.field2419 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field2415;
                this.field2415 += (double) arg0 * this.field2419;
            }
            this.field2411 = true;
            ++field2447;
            this.field2416 = 8192 + (int) (Math.atan2(this.field2444, this.field2451) * 2607.5945876176133D) & 16383;
            this.field2426 = (int) (2607.5945876176133D * Math.atan2(this.field2415, this.field2450)) & 16383;
            if (this.field2445 != null) {
                this.field2418 += arg0;
                while (true) {
                    do {
                        do {
                            if (~this.field2418 >= ~this.field2445.field5918[this.field2442]) {
                                return;
                            }
                            this.field2418 -= this.field2445.field5918[this.field2442];
                            ++this.field2442;
                            if (~this.field2442 <= ~this.field2445.field5925.length) {
                                this.field2442 -= this.field2445.field5915;
                                if (this.field2442 < 0 || this.field2445.field5925.length <= this.field2442) {
                                    this.field2442 = 0;
                                }
                            }
                            this.field2425 = this.field2442 + 1;
                        } while (~this.field2445.field5925.length < ~this.field2425);
                        this.field2425 -= this.field2445.field5915;
                    } while (~this.field2425 <= -1 && this.field2425 < this.field2445.field5925.length);
                    this.field2425 = -1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!hp", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        ++field2430;
        if (this.field2437 != null) {
            this.field2437.method1369();
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(Z)Z")
    public final boolean method54(boolean arg0) {
        if (!arg0) {
            this.method1207(true, -113, -24, 72, 64);
        }
        ++field2433;
        return false;
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(ILae;II)Z")
    public final boolean method56(int arg0, class134 arg1, int arg2, int arg3) {
        ++field2417;
        if (arg2 != 4835) {
            method1206(-26, (class376) null, 92);
        }
        return false;
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(I)V")
    public static final void method1203(int arg0) {
        ++field2441;
        for (int var1 = -1; ~var1 > ~class305.field4287; ++var1) {
            int var6;
            if (~var1 != 0) {
                var6 = class94.field1135[var1];
            } else {
                var6 = 2047;
            }
            class40 var7 = class26.field314[var6];
            if (var7 != null && var7.field5633 > 0) {
                --var7.field5633;
                if (var7.field5633 == 0) {
                    var7.field5599 = null;
                }
            }
        }
        int var2 = 98 % ((arg0 - 12) / 34);
        for (int var3 = 0; ~class102.field1250 < ~var3; ++var3) {
            int var4 = class86.field981[var3];
            class77 var5 = class167.field2335[var4];
            if (var5 != null && ~var5.field5633 < -1) {
                --var5.field5633;
                if (var5.field5633 == 0) {
                    var5.field5599 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(IIIIIIIIIII)V")
    public class178(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        super(arg1, arg2, arg4, arg3, arg2 >> 7, arg2 >> 7, arg3 >> 7, arg3 >> 7, false, (byte) 0);
        this.field2411 = false;
        this.field2429 = arg9;
        this.field2428 = arg8;
        this.field2410 = arg10;
        this.field2423 = arg6;
        this.field2448 = arg5;
        this.field2422 = arg7;
        this.field2412 = arg0;
        int var12 = class434.method2721(this.field2412, 4096).field1166;
        if (~var12 != 0) {
            this.field2445 = class189.method1288(-8192, var12);
        } else {
            this.field2445 = null;
        }
    }

    @OriginalMember(owner = "client!hp", name = "e", descriptor = "(I)V")
    public final void method51(int arg0) {
        ++field2438;
        if (arg0 != 6) {
            field2431 = null;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(ILae;I)Lbk;")
    private final class210 method1204(int arg0, class134 arg1, int arg2) {
        int var4 = 89 % ((arg2 - 2) / 37);
        ++field2420;
        class97 var5 = class434.method2721(this.field2412, 4096);
        return var5.method535(arg0, arg1, this.field2442, (byte) -32, this.field2425, this.field2418);
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(Lae;Lbk;B)V")
    private final void method1205(class134 arg0, class210 arg1, byte arg2) {
        ++field2432;
        class42[] var4 = arg1.method1399();
        class190[] var5 = arg1.method1374();
        if ((this.field2437 == null || this.field2437.field2961) && (var4 != null || var5 != null)) {
            this.field2437 = new class209(class189.field2726);
        }
        if (this.field2437 != null) {
            this.field2437.method1362(arg0, (long) class189.field2726, var4, var5, false);
            this.field2437.method1372(super.field3285, super.field3268, super.field3275, super.field3267, super.field3271);
        }
        if (arg2 > -24) {
            this.field2422 = -6;
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(ILtq;I)Lth;")
    public static final class355 method1206(int arg0, class376 arg1, int arg2) {
        ++field2413;
        byte[] var3 = arg1.method2420(arg0, arg2);
        return var3 == null ? null : new class355(var3);
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(BLae;)Ljg;")
    public final class186 method52(byte arg0, class134 arg1) {
        ++field2435;
        class210 var3 = this.method1204(1024, arg1, 47);
        if (var3 == null) {
            return null;
        } else {
            class18 var4 = arg1.method649();
            var4.method128(this.field2426);
            var4.method119(this.field2416);
            var4.method125((int) this.field2409, (int) this.field2449, (int) this.field2443);
            if (this.field2437 != null) {
                class63 var5 = this.field2437.method1371();
                arg1.method588(var3, var5, var4, (class136) null, 0);
            } else {
                var3.method1416(var4, (class136) null, 0);
            }
            this.field2424 = var3.method1405();
            if (arg0 != -120) {
                this.field2419 = -0.6953367214469766D;
            }
            this.method1205(arg1, var3, (byte) -100);
            return null;
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(Lae;B)V")
    public final void method64(class134 arg0, byte arg1) {
        ++field2408;
        class210 var3 = this.method1204(0, arg0, -91);
        if (arg1 >= -50) {
            this.method54(false);
        }
        if (var3 != null) {
            class18 var4 = arg0.method649();
            var4.method128(this.field2426);
            var4.method119(this.field2416);
            var4.method125((int) this.field2409, (int) this.field2449, (int) this.field2443);
            this.field2424 = var3.method1405();
            this.method1205(arg0, var3, (byte) -111);
        }
    }

    @OriginalMember(owner = "client!hp", name = "h", descriptor = "(I)I")
    public final int method61(int arg0) {
        ++field2436;
        if (arg0 != 131910471) {
            this.method51(56);
        }
        return this.field2424;
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(ZIIII)V")
    public final void method1207(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field2439;
        if (!this.field2411) {
            double var6 = (double) (arg4 - super.field3284);
            double var8 = (double) (-super.field3269 + arg3);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field2449 = (double) super.field3287;
            this.field2409 = (double) this.field2428 * var6 / var10 + (double) super.field3284;
            this.field2443 = (double) this.field2428 * var8 / var10 + (double) super.field3269;
        }
        double var12 = (double) (this.field2423 + 1 - arg2);
        this.field2451 = ((double) arg3 + -this.field2443) / var12;
        this.field2444 = ((double) arg4 + -this.field2409) / var12;
        if (!arg0) {
            this.field2450 = Math.sqrt(this.field2451 * this.field2451 + this.field2444 * this.field2444);
            if (this.field2422 != -1) {
                if (!this.field2411) {
                    this.field2415 = -this.field2450 * Math.tan((double) this.field2422 * 0.02454369D);
                }
                this.field2419 = ((double) arg1 + -this.field2449 + -(this.field2415 * var12)) * 2.0D / (var12 * var12);
            } else {
                this.field2415 = ((double) arg1 + -this.field2449) / var12;
            }
        }
    }

    @OriginalMember(owner = "client!hp", name = "b", descriptor = "(I)V")
    public final void method1208(int arg0) {
        if (arg0 > 126) {
            ++field2414;
            if (this.field2437 != null) {
                this.field2437.method1369();
            }
        }
    }

    @OriginalMember(owner = "client!hp", name = "g", descriptor = "(I)V")
    public final void method1209(int arg0) {
        super.field3267 = super.field3271 = (short) ((int) (this.field2443 / 128.0D));
        super.field3268 = super.field3275 = (short) ((int) (this.field2409 / 128.0D));
        if (arg0 != 0) {
            this.finalize();
        }
        ++field2427;
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(ZBIILna;ILae;)V")
    public final void method60(boolean arg0, byte arg1, int arg2, int arg3, class29 arg4, int arg5, class134 arg6) {
        ++field2421;
        int var8 = 67 / ((-16 - arg1) / 62);
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!hp", name = "d", descriptor = "(II)V")
    public static final void method1210(int arg0, int arg1) {
        ++field2434;
        if (class40.field475 != arg0) {
            if (~class40.field475 == -1) {
                class383.method2462(-116);
            }
            if (~arg0 == -41) {
                class414.method2640((byte) -49);
            }
            if (~arg0 != -41 && class450.field6450 != null) {
                class450.field6450.method1343((byte) -69);
                class450.field6450 = null;
            }
            if (~class40.field475 == -26 || ~class40.field475 == -29) {
                class158.field2060.field5303 = 2;
                class184.field2587.field5303 = 2;
                class309.field4378.field5303 = 2;
                class310.field4385.field5303 = 2;
                class128.field1548.field5303 = 2;
                class153.field1886.field5303 = 2;
                class241.field3435.field5303 = 2;
            }
            if (~arg0 == -26 || arg0 == 28) {
                class54.field651 = 1;
                class272.field3855 = 1;
                class331.field4684 = 0;
                class152.field1880 = 0;
                class322.field4589 = 0;
                class17.method112(28450, true);
                class158.field2060.field5303 = 1;
                class184.field2587.field5303 = 1;
                class309.field4378.field5303 = 1;
                class310.field4385.field5303 = 1;
                class128.field1548.field5303 = 1;
                class153.field1886.field5303 = 1;
                class241.field3435.field5303 = 1;
            }
            if (arg0 == 25 || ~arg0 == -11) {
                class5.method35((byte) 87);
            }
            int var2 = -118 % ((-38 - arg1) / 42);
            if (arg0 == 5) {
                class291.method1930((byte) -44, class298.field4178, class151.field1873);
            } else {
                class222.method1491(1);
            }
            boolean var3 = arg0 == 5 || arg0 == 10 || ~arg0 == -29;
            boolean var4 = ~class40.field475 == -6 || ~class40.field475 == -11 || class40.field475 == 28;
            if (!var3 != !var4) {
                if (!var3) {
                    class102.method573(-1, 2);
                    class73.field879.method2322(true, -4733);
                    if (class399.field5692 != null) {
                        class399.field5692.method704(-99);
                        class399.field5692 = null;
                    }
                } else {
                    class328.field4657 = class150.field1852;
                    if (~class334.field4729 != -1) {
                        class433.method2719(class150.field1852, 2, class393.field5553, false, 0, 255, true);
                    } else {
                        class102.method573(-1, 2);
                    }
                    class73.field879.method2322(false, -4733);
                }
            }
            if (arg0 == 25 || ~arg0 == -29 || arg0 == 40) {
                class151.field1873.method595();
            }
            class40.field475 = arg0;
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(B)V")
    public static void method1211(byte arg0) {
        if (arg0 < 110) {
            field2431 = null;
        }
        field2440 = null;
        field2431 = null;
        field2446 = null;
    }
}
