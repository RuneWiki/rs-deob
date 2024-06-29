import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class88 extends class141 {

    @OriginalMember(owner = "client!d", name = "kd", descriptor = "I")
    public int field1317 = -1;

    @OriginalMember(owner = "client!d", name = "gd", descriptor = "I")
    public int field1313 = -1;

    @OriginalMember(owner = "client!d", name = "Tc", descriptor = "Z")
    public static boolean field1300 = false;

    @OriginalMember(owner = "client!d", name = "ed", descriptor = "[I")
    public static int[] field1311 = new int[32];

    @OriginalMember(owner = "client!d", name = "hd", descriptor = "Lvh;")
    public static class125 field1314 = new class125(58, 3);

    @OriginalMember(owner = "client!d", name = "rd", descriptor = "Z")
    public static boolean field1324 = false;

    @OriginalMember(owner = "client!d", name = "Pc", descriptor = "I")
    public static int field1296;

    @OriginalMember(owner = "client!d", name = "Qc", descriptor = "I")
    public static int field1297;

    @OriginalMember(owner = "client!d", name = "Rc", descriptor = "I")
    public static int field1298;

    @OriginalMember(owner = "client!d", name = "Sc", descriptor = "I")
    public static int field1299;

    @OriginalMember(owner = "client!d", name = "Uc", descriptor = "I")
    public static int field1301;

    @OriginalMember(owner = "client!d", name = "Vc", descriptor = "I")
    public static int field1302;

    @OriginalMember(owner = "client!d", name = "Wc", descriptor = "I")
    public static int field1303;

    @OriginalMember(owner = "client!d", name = "Xc", descriptor = "I")
    public static int field1304;

    @OriginalMember(owner = "client!d", name = "Yc", descriptor = "I")
    public static int field1305;

    @OriginalMember(owner = "client!d", name = "Zc", descriptor = "I")
    public static int field1306;

    @OriginalMember(owner = "client!d", name = "ad", descriptor = "I")
    public static int field1307;

    @OriginalMember(owner = "client!d", name = "dd", descriptor = "I")
    public static int field1310;

    @OriginalMember(owner = "client!d", name = "fd", descriptor = "I")
    public static int field1312;

    @OriginalMember(owner = "client!d", name = "id", descriptor = "I")
    public static int field1315;

    @OriginalMember(owner = "client!d", name = "jd", descriptor = "I")
    public static int field1316;

    @OriginalMember(owner = "client!d", name = "ld", descriptor = "I")
    public static int field1318;

    @OriginalMember(owner = "client!d", name = "md", descriptor = "I")
    public static int field1319;

    @OriginalMember(owner = "client!d", name = "nd", descriptor = "I")
    public static int field1320;

    @OriginalMember(owner = "client!d", name = "od", descriptor = "I")
    public static int field1321;

    @OriginalMember(owner = "client!d", name = "pd", descriptor = "I")
    public static int field1322;

    @OriginalMember(owner = "client!d", name = "qd", descriptor = "I")
    public static int field1323;

    @OriginalMember(owner = "client!d", name = "sd", descriptor = "I")
    public static int field1325;

    @OriginalMember(owner = "client!d", name = "cd", descriptor = "Lce;")
    public class528 field1309;

    @OriginalMember(owner = "client!d", name = "bd", descriptor = "[Lat;")
    public static class144[] field1308;

    @OriginalMember(owner = "client!d", name = "j", descriptor = "(I)V")
    public final void method585(int arg0) {
        ++field1325;
        if (arg0 != 96) {
            this.method625(58, (class98) null);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!d", name = "m", descriptor = "(I)V")
    public static void method651(int arg0) {
        field1311 = null;
        field1308 = null;
        if (arg0 == 5) {
            field1314 = null;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(I[ILd;[I[I)V")
    public static final void method652(int arg0, int[] arg1, class88 arg2, int[] arg3, int[] arg4) {
        ++field1322;
        int var5 = 0;
        if (arg0 == -10861) {
            while (arg4.length > var5) {
                int var6 = arg4[var5];
                int var7 = arg1[var5];
                int var8 = arg3[var5];
                int var9 = 0;
                while (~var7 != -1 && ~arg2.field2356.length < ~var9) {
                    if (~(var7 & 1) != -1) {
                        if (~var6 != 0) {
                            class606 var10 = class480.field6871.method1417(-3585, var6);
                            int var11 = var10.field8710;
                            class391 var12 = arg2.field2356[var9];
                            if (var12 != null) {
                                if (~var12.field5694 == ~var6) {
                                    if (var11 == 0) {
                                        var12 = arg2.field2356[var9] = null;
                                    } else if (var11 != 1) {
                                        if (var11 == 2) {
                                            var12.field5697 = 0;
                                        }
                                    } else {
                                        var12.field5696 = 1;
                                        var12.field5691 = 0;
                                        var12.field5693 = var8;
                                        var12.field5697 = 0;
                                        var12.field5695 = 0;
                                        if (!arg2.field2389) {
                                            class150.method1144(0, (byte) 101, arg2, var10);
                                        }
                                    }
                                } else if (~var10.field8716 <= ~class480.field6871.method1417(-3585, var12.field5694).field8716) {
                                    var12 = arg2.field2356[var9] = null;
                                }
                            }
                            if (var12 == null) {
                                class391 var13 = arg2.field2356[var9] = new class391();
                                var13.field5695 = 0;
                                var13.field5696 = 1;
                                var13.field5693 = var8;
                                var13.field5694 = var6;
                                var13.field5691 = 0;
                                var13.field5697 = 0;
                                if (!arg2.field2389) {
                                    class150.method1144(0, (byte) 112, arg2, var10);
                                }
                            }
                        } else {
                            arg2.field2356[var9] = null;
                        }
                    }
                    ++var9;
                    var7 >>>= 1;
                }
                ++var5;
            }
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Lr;I)Lej;")
    public final class690 method627(class98 arg0, int arg1) {
        ++field1303;
        if (this.field1309 != null && this.method654(2048, 2, arg0)) {
            class152 var3 = arg0.method777();
            int var4 = super.field2410.method1720(16383);
            var3.method176(var4);
            class293 var5 = class541.field7946[super.field3158][super.field3155 >> class49.field637][super.field3154 >> class49.field637];
            if (var5 != null && var5.field4084 != null) {
                int var6 = -var5.field4084.field9737 + super.field2362;
                super.field2362 = (int) ((float) super.field2362 - (float) var6 / 10.0F);
            } else {
                super.field2362 = (int) ((float) super.field2362 - (float) super.field2362 / 10.0F);
            }
            var3.method158(super.field3155, super.field3160 - 20 + -super.field2362, super.field3154);
            class674 var7 = this.method1093(true);
            class528 var8 = this.field1309.field7758 == null ? this.field1309 : this.field1309.method3110(class230.field3404, false);
            super.field2461 = false;
            if (class525.field7713.field6001 && var8.field7786 && var7.field9565) {
                class606 var9 = ~super.field2371 != 0 && super.field2378 == 0 ? class480.field6871.method1417(-3585, super.field2371) : null;
                class606 var10 = super.field2425 == -1 || super.field2353 && var9 != null ? null : class480.field6871.method1417(-3585, super.field2425);
                class397 var11 = class629.method3556(65535 & this.field1309.field7776, this.field1309.field7726, arg0, var10 != null ? var10 : var9, var4, 255 & this.field1309.field7793, super.field2439, this.field1309.field7800 & 255, super.field2456[0], var10 == null ? super.field2444 : super.field2414, this.field1309.field7785 & 65535, true, super.field2375, super.field2417);
                if (var11 != null) {
                    super.field2461 = true;
                    arg0.method770(false);
                    if (class372.field5162) {
                        var11.method448(var3, (class299) null, class450.field6494, 0);
                    } else {
                        var11.method460(var3, (class299) null, 0);
                    }
                    arg0.method770(true);
                }
            }
            var3.method176(var4);
            var3.method158(super.field3155, super.field3160 - super.field2362 + -5, super.field3154);
            class690 var12 = null;
            if (this.method662(131072)) {
                var12 = class101.method849(-88, super.field2456.length);
            }
            this.method1104(false, arg0, (byte) -64, var3, super.field2456);
            if (!class372.field5162) {
                for (int var13 = 0; super.field2456.length > var13; ++var13) {
                    if (super.field2456[var13] != null) {
                        super.field2456[var13].method460(var3, var12 != null ? var12.field9788[var13] : null, 0);
                    }
                }
            } else {
                for (int var14 = 0; ~super.field2456.length < ~var14; ++var14) {
                    if (super.field2456[var14] != null) {
                        super.field2456[var14].method448(var3, var12 != null ? var12.field9788[var14] : null, class450.field6494, 0);
                    }
                }
            }
            if (super.field2455 != null) {
                class272 var15 = super.field2455.method3581();
                if (!class372.field5162) {
                    arg0.method737(var15);
                } else {
                    arg0.method799(var15, class450.field6494);
                }
            }
            if (arg1 != -7927) {
                return null;
            } else {
                for (int var16 = 0; var16 < super.field2456.length; ++var16) {
                    if (super.field2456[var16] != null) {
                        super.field2461 |= super.field2456[var16].method449();
                    }
                }
                super.field2456[0] = super.field2456[1] = super.field2456[2] = null;
                super.field2364 = client.field1377;
                return var12;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!d", name = "d", descriptor = "(B)Z")
    public final boolean method653(byte arg0) {
        int var2 = 36 / ((arg0 - 27) / 53);
        ++field1320;
        return this.field1309 != null;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IILr;)Z")
    private final boolean method654(int arg0, int arg1, class98 arg2) {
        ++field1304;
        int var4 = arg0;
        class674 var5 = this.method1093(true);
        class606 var6 = super.field2371 != -1 && ~super.field2378 == -1 ? class480.field6871.method1417(-3585, super.field2371) : null;
        class606 var7 = super.field2425 == -1 || super.field2353 && var6 != null ? null : class480.field6871.method1417(-3585, super.field2425);
        int var8 = var5.field9560;
        int var9 = var5.field9567;
        if (var8 != 0 || var9 != 0 || var5.field9608 != 0 || var5.field9593 != 0) {
            arg0 |= 7;
        }
        boolean var10 = super.field2379 != 0 && ~class148.field2508 <= ~super.field2445 && super.field2383 > class148.field2508;
        if (arg1 != 2) {
            field1300 = true;
        }
        if (var10) {
            arg0 |= 524288;
        }
        int var11 = super.field2410.method1720(16383);
        class397 var12 = super.field2456[0] = this.field1309.method3107(class230.field3404, super.field2437, super.field2423, super.field2414, super.field2372, super.field2428, var7, super.field2356, super.field2444, super.field2359, class480.field6871, arg2, var11, var6, arg0, false, class625.field8919);
        if (var12 == null) {
            return false;
        } else {
            super.field2440 = var12.method478();
            super.field2412 = var12.method434();
            this.method1100(var12, -42);
            if (var8 == 0 && var9 == 0) {
                this.method1095(0, (byte) 113, this.method1108(85) << 9, this.method1108(arg1 + 99) << 9, 0, var11);
            } else {
                this.method1095(var5.field9596, (byte) -38, var9, var8, var5.field9566, var11);
                if (~super.field2417 != -1) {
                    super.field2456[0].method436(super.field2417);
                }
                if (super.field2375 != 0) {
                    super.field2456[0].method458(super.field2375);
                }
                if (~super.field2439 != -1) {
                    super.field2456[0].method455(0, super.field2439, 0);
                }
            }
            if (var10) {
                var12.method442(super.field2355, super.field2446, super.field2373, 255 & super.field2379);
            }
            if (~super.field2400 != 0 && super.field2404 != -1) {
                class81 var13 = class554.field8108.method598(-14624, super.field2400);
                boolean var14 = var13.field1227 == 3 && (~var8 != -1 || var9 != 0);
                int var15 = var4;
                if (!var14) {
                    if (super.field2388 != 0) {
                        var15 = var4 | 5;
                    }
                    if (~super.field2401 != -1) {
                        var15 |= 2;
                    }
                } else {
                    var15 = var4 | 7;
                }
                class397 var16 = super.field2456[1] = var13.method617(super.field2404, var15, class480.field6871, super.field2365, arg2, super.field2443, 15735);
                if (var16 != null) {
                    if (super.field2401 != 0) {
                        var16.method455(0, -super.field2401 << 2, 0);
                    }
                    if (~super.field2388 != -1) {
                        var16.method474(super.field2388 * 2048);
                    }
                    if (var14) {
                        if (super.field2417 != 0) {
                            var16.method436(super.field2417);
                        }
                        if (super.field2375 != 0) {
                            var16.method458(super.field2375);
                        }
                        if (super.field2439 != 0) {
                            var16.method455(0, super.field2439, 0);
                        }
                    }
                }
            } else {
                super.field2456[1] = null;
            }
            if (super.field2391 != -1 && super.field2442 != -1) {
                class81 var17 = class554.field8108.method598(-14624, super.field2391);
                boolean var18 = ~var17.field1227 == -4 && (var8 != 0 || ~var9 != -1);
                int var19 = var4;
                if (var18) {
                    var19 = var4 | 7;
                } else {
                    if (super.field2420 != 0) {
                        var19 = var4 | 5;
                    }
                    if (~super.field2390 != -1) {
                        var19 |= 2;
                    }
                }
                class397 var20 = super.field2456[2] = var17.method620(super.field2442, super.field2416, (byte) -64, super.field2367, class480.field6871, var19, arg2);
                if (var20 != null) {
                    if (~super.field2390 != -1) {
                        var20.method455(0, -super.field2390 << 2, 0);
                    }
                    if (~super.field2420 != -1) {
                        var20.method474(super.field2420 * 2048);
                    }
                    if (var18) {
                        if (~super.field2417 != -1) {
                            var20.method436(super.field2417);
                        }
                        if (~super.field2375 != -1) {
                            var20.method458(super.field2375);
                        }
                        if (super.field2439 != 0) {
                            var20.method455(0, super.field2439, 0);
                        }
                    }
                }
            } else {
                super.field2456[2] = null;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(Z)I")
    public final int method655(boolean arg0) {
        ++field1310;
        if (this.field1309.field7758 != null) {
            class528 var2 = this.field1309.method3110(class230.field3404, arg0);
            if (var2 != null && ~var2.field7781 != 0) {
                return var2.field7781;
            }
        }
        if (arg0) {
            field1318 = 68;
        }
        return this.field1309.field7781 != -1 ? this.field1309.field7781 : super.method655(false);
    }

    @OriginalMember(owner = "client!d", name = "c", descriptor = "(ILr;)V")
    public final void method625(int arg0, class98 arg1) {
        ++field1307;
        if (this.field1309 != null) {
            if (super.field2458 || this.method654(0, 2, arg1)) {
                if (arg0 < 67) {
                    this.method592(-98);
                }
                class152 var3 = arg1.method777();
                var3.method176(super.field2410.method1720(16383));
                var3.method158(super.field3155, super.field3160 + -20, super.field3154);
                this.method1104(super.field2458, arg1, (byte) -121, var3, super.field2456);
                super.field2456[0] = super.field2456[1] = super.field2456[2] = null;
            }
        }
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(ILjava/lang/String;)I")
    public static final int method656(int arg0, String arg1) {
        ++field1306;
        if (arg0 >= -11) {
            return 44;
        } else {
            int var2 = arg1.length();
            int var3 = 0;
            for (int var4 = 0; var4 < var2; ++var4) {
                var3 = class107.method888(-161, arg1.charAt(var4)) + (var3 << 5) + -var3;
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!d", name = "d", descriptor = "(Z)I")
    public final int method657(boolean arg0) {
        if (!arg0) {
            field1302 = -109;
        }
        ++field1297;
        if (this.field1309.field7758 != null) {
            class528 var2 = this.field1309.method3110(class230.field3404, false);
            if (var2 != null && ~var2.field7747 != 0) {
                return var2.field7747;
            }
        }
        return this.field1309.field7747;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(II[B)[B")
    public static final byte[] method658(int arg0, int arg1, byte[] arg2) {
        ++field1315;
        byte[] var3 = new byte[arg1];
        class553.method3242(arg2, 0, var3, 0, arg1);
        return arg0 >= -83 ? null : var3;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIZIII)V")
    public final void method659(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        super.field3158 = super.field3163 = (byte) arg4;
        if (arg0 == 6) {
            ++field1319;
            if (class151.method1151(arg3, arg5, (byte) -49)) {
                ++super.field3163;
            }
            if (~super.field2371 != 0 && ~class480.field6871.method1417(-3585, super.field2371).field8713 == -2) {
                super.field2438 = null;
                super.field2371 = -1;
            }
            if (super.field2400 != -1) {
                class81 var7 = class554.field8108.method598(-14624, super.field2400);
                if (var7.field1232 && var7.field1229 != -1 && ~class480.field6871.method1417(-3585, var7.field1229).field8713 == -2) {
                    super.field2400 = -1;
                }
            }
            if (~super.field2391 != 0) {
                class81 var8 = class554.field8108.method598(arg0 + -14630, super.field2391);
                if (var8.field1232 && ~var8.field1229 != 0 && class480.field6871.method1417(arg0 + -3591, var8.field1229).field8713 == 1) {
                    super.field2391 = -1;
                }
            }
            if (!arg2) {
                int var9 = -super.field2454[0] + arg5;
                int var10 = -super.field2459[0] + arg3;
                if (var9 >= -8 && var9 <= 8 && var10 >= -8 && var10 <= 8) {
                    if (~super.field2452 > -10) {
                        ++super.field2452;
                    }
                    for (int var11 = super.field2452; var11 > 0; --var11) {
                        super.field2454[var11] = super.field2454[var11 + -1];
                        super.field2459[var11] = super.field2459[var11 + -1];
                        super.field2457[var11] = super.field2457[var11 - 1];
                    }
                    super.field2454[0] = arg5;
                    super.field2457[0] = 1;
                    super.field2459[0] = arg3;
                    return;
                }
            }
            super.field2460 = 0;
            super.field2452 = 0;
            super.field2454[0] = arg5;
            super.field2462 = 0;
            super.field2459[0] = arg3;
            super.field3155 = (super.field2454[0] << 9) + (arg1 << 8);
            super.field3154 = (super.field2459[0] << 9) + (arg1 << 8);
            if (super.field2455 != null) {
                super.field2455.method3583();
            }
        }
    }

    @OriginalMember(owner = "client!d", name = "c", descriptor = "(I)I")
    public final int method660(int arg0) {
        if (arg0 != 255) {
            field1321 = 104;
        }
        ++field1301;
        if (this.field1309.field7758 != null) {
            class528 var2 = this.field1309.method3110(class230.field3404, false);
            if (var2 != null && ~var2.field7797 != 0) {
                return var2.field7797;
            }
        }
        return this.field1309.field7797;
    }

    @OriginalMember(owner = "client!d", name = "g", descriptor = "(I)Z")
    public final boolean method592(int arg0) {
        if (arg0 != -15258) {
            this.method627((class98) null, -3);
        }
        ++field1316;
        return false;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Lvj;IZLr;IIB)V")
    public final void method590(class204 arg0, int arg1, boolean arg2, class98 arg3, int arg4, int arg5, byte arg6) {
        if (arg6 < 22) {
            this.method655(true);
        }
        ++field1299;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(ZLce;)V")
    public final void method661(boolean arg0, class528 arg1) {
        this.field1309 = arg1;
        if (!arg0) {
            this.method590((class204) null, 29, true, (class98) null, -104, -112, (byte) -123);
        }
        ++field1298;
        if (super.field2455 != null) {
            super.field2455.method3583();
        }
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(ILr;)Leh;")
    public final class203 method631(int arg0, class98 arg1) {
        ++field1312;
        return arg0 != 1 ? null : null;
    }

    @OriginalMember(owner = "client!d", name = "n", descriptor = "(I)Z")
    private final boolean method662(int arg0) {
        ++field1305;
        if (arg0 != 131072) {
            field1302 = -56;
        }
        return this.field1309.field7780;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IILr;B)Z")
    public final boolean method632(int arg0, int arg1, class98 arg2, byte arg3) {
        ++field1296;
        if (this.field1309 != null && this.method654(131072, 2, arg2)) {
            class152 var5 = arg2.method777();
            int var6 = super.field2410.method1720(16383);
            var5.method176(var6);
            var5.method158(super.field3155, super.field3160, super.field3154);
            boolean var7 = false;
            for (int var8 = 0; super.field2456.length > var8; ++var8) {
                if (super.field2456[var8] != null) {
                    boolean var9 = this.field1309.field7730 == -1 ? this.field1309.field7726 == 1 : this.field1309.field7730 == 1;
                    boolean var10;
                    if (!class372.field5162) {
                        var10 = super.field2456[var8].method469(arg0, arg1, var5, var9);
                    } else {
                        var10 = super.field2456[var8].method482(arg0, arg1, var5, var9, class450.field6494);
                    }
                    if (var10) {
                        var7 = true;
                        break;
                    }
                }
            }
            int var11 = 38 / ((arg3 - -75) / 40);
            super.field2456[0] = super.field2456[1] = super.field2456[2] = null;
            return var7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(III)V")
    public final void method663(int arg0, int arg1, int arg2) {
        ++field1323;
        int var4 = super.field2454[0];
        int var5 = super.field2459[0];
        if (~arg1 == -1) {
            ++var5;
        }
        if (arg1 == 1) {
            ++var4;
            ++var5;
        }
        if (~arg1 == arg2) {
            ++var4;
        }
        if (~arg1 == -4) {
            ++var4;
            --var5;
        }
        if (~arg1 == -5) {
            --var5;
        }
        if (~arg1 == -6) {
            --var4;
            --var5;
        }
        if (arg1 == 6) {
            --var4;
        }
        if (arg1 == 7) {
            ++var5;
            --var4;
        }
        if (~super.field2371 != 0 && class480.field6871.method1417(arg2 + -3582, super.field2371).field8713 == 1) {
            super.field2371 = -1;
            super.field2438 = null;
        }
        if (super.field2400 != -1) {
            class81 var6 = class554.field8108.method598(arg2 ^ 14621, super.field2400);
            if (var6.field1232 && var6.field1229 != -1 && class480.field6871.method1417(arg2 + -3582, var6.field1229).field8713 == 1) {
                super.field2400 = -1;
            }
        }
        if (~super.field2391 != 0) {
            class81 var7 = class554.field8108.method598(-14624, super.field2391);
            if (var7.field1232 && ~var7.field1229 != 0 && ~class480.field6871.method1417(-3585, var7.field1229).field8713 == -2) {
                super.field2391 = -1;
            }
        }
        if (~super.field2452 > -10) {
            ++super.field2452;
        }
        for (int var8 = super.field2452; var8 > 0; --var8) {
            super.field2454[var8] = super.field2454[var8 - 1];
            super.field2459[var8] = super.field2459[var8 + -1];
            super.field2457[var8] = super.field2457[var8 + -1];
        }
        super.field2454[0] = var4;
        super.field2459[0] = var5;
        super.field2457[0] = (byte) arg0;
    }
}
