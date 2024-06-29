import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class132 extends class15 {

    @OriginalMember(owner = "client!t", name = "fb", descriptor = "Z")
    private boolean field3010 = false;

    @OriginalMember(owner = "client!t", name = "hb", descriptor = "I")
    private int field3012 = -1;

    @OriginalMember(owner = "client!t", name = "xb", descriptor = "Z")
    private volatile boolean field3028 = false;

    @OriginalMember(owner = "client!t", name = "kb", descriptor = "Lnf;")
    private class96 field3015;

    @OriginalMember(owner = "client!t", name = "ob", descriptor = "Lnf;")
    private class96 field3019;

    @OriginalMember(owner = "client!t", name = "nb", descriptor = "I")
    private int field3018;

    @OriginalMember(owner = "client!t", name = "qb", descriptor = "[Z")
    public static boolean[] field3021 = new boolean[100];

    @OriginalMember(owner = "client!t", name = "ab", descriptor = "Lje;")
    public static class67 field3005 = new class67();

    @OriginalMember(owner = "client!t", name = "Ab", descriptor = "Lod;")
    public static class101 field3031 = class46.method335(-87, "Fps:");

    @OriginalMember(owner = "client!t", name = "zb", descriptor = "Z")
    public static boolean field3030 = false;

    @OriginalMember(owner = "client!t", name = "Db", descriptor = "Lod;")
    public static class101 field3034 = class46.method335(-79, "Ung-Ultige Verbindung mit einem Anmelde)2Server)3");

    @OriginalMember(owner = "client!t", name = "Eb", descriptor = "Lod;")
    public static class101 field3035 = class46.method335(-86, "<col=ffff00>*V");

    @OriginalMember(owner = "client!t", name = "Fb", descriptor = "Lod;")
    public static class101 field3036 = null;

    @OriginalMember(owner = "client!t", name = "Z", descriptor = "I")
    public static int field3004;

    @OriginalMember(owner = "client!t", name = "cb", descriptor = "I")
    public static int field3007;

    @OriginalMember(owner = "client!t", name = "db", descriptor = "I")
    public static int field3008;

    @OriginalMember(owner = "client!t", name = "eb", descriptor = "I")
    public static int field3009;

    @OriginalMember(owner = "client!t", name = "gb", descriptor = "I")
    public static int field3011;

    @OriginalMember(owner = "client!t", name = "ib", descriptor = "I")
    public static int field3013;

    @OriginalMember(owner = "client!t", name = "jb", descriptor = "I")
    public static int field3014;

    @OriginalMember(owner = "client!t", name = "lb", descriptor = "I")
    public static int field3016;

    @OriginalMember(owner = "client!t", name = "mb", descriptor = "I")
    public static int field3017;

    @OriginalMember(owner = "client!t", name = "pb", descriptor = "I")
    public static int field3020;

    @OriginalMember(owner = "client!t", name = "rb", descriptor = "I")
    private int field3022;

    @OriginalMember(owner = "client!t", name = "tb", descriptor = "I")
    public static int field3024;

    @OriginalMember(owner = "client!t", name = "vb", descriptor = "I")
    public static int field3026;

    @OriginalMember(owner = "client!t", name = "wb", descriptor = "I")
    public static int field3027;

    @OriginalMember(owner = "client!t", name = "yb", descriptor = "I")
    private int field3029;

    @OriginalMember(owner = "client!t", name = "Bb", descriptor = "I")
    public static int field3032;

    @OriginalMember(owner = "client!t", name = "Cb", descriptor = "I")
    public static int field3033;

    @OriginalMember(owner = "client!t", name = "ub", descriptor = "Lt;")
    public static class132 field3025;

    @OriginalMember(owner = "client!t", name = "sb", descriptor = "Lc;")
    public static class15 field3023;

    @OriginalMember(owner = "client!t", name = "bb", descriptor = "[Z")
    private volatile boolean[] field3006;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(BI)V")
    public final void method104(byte arg0, int arg1) {
        class137.method1046(this.field3018, (byte) 1, arg1);
        if (arg0 > -111) {
            field3005 = null;
        }
        ++field3016;
    }

    @OriginalMember(owner = "client!t", name = "d", descriptor = "(I)V")
    private final void method1015(int arg0) {
        this.field3006 = new boolean[super.field309.length];
        for (int var2 = 0; var2 < this.field3006.length; ++var2) {
            this.field3006[var2] = false;
        }
        ++field3027;
        if (this.field3015 == null) {
            this.field3028 = true;
        } else {
            this.field3012 = arg0;
            for (int var3 = 0; ~this.field3006.length < ~var3; ++var3) {
                if (super.field308[var3] > 0) {
                    class52.method374(-19888, this, var3, this.field3015);
                    this.field3012 = var3;
                }
            }
            if (this.field3012 == -1) {
                this.field3028 = true;
            }
        }
    }

    @OriginalMember(owner = "client!t", name = "f", descriptor = "(II)V")
    public static final void method1016(int arg0, int arg1) {
        ++field3011;
        if (arg0 == -1 && !class155.field3569) {
            class140.method1122(true);
        } else if (~arg0 != 0 && ~class26.field680 != ~arg0 && class80.field1693 != 0 && !class155.field3569) {
            class11.method74(class80.field1693, 2, (byte) 15, false, arg0, class12.field245, 0);
        }
        class26.field680 = arg0;
        int var2 = 103 / ((70 - arg1) / 51);
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Z)I")
    public final int method1017(boolean arg0) {
        ++field3014;
        int var2 = 0;
        int var3 = 0;
        for (int var4 = 0; ~var4 > ~super.field309.length; ++var4) {
            if (~super.field308[var4] < -1) {
                var2 += this.method1020(var4, 111);
                var3 += 100;
            }
        }
        if (!arg0) {
            this.method1015(38);
        }
        if (var3 == 0) {
            return 100;
        } else {
            return var2 * 100 / var3;
        }
    }

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "(Lnf;Lnf;IZZZ)V")
    public class132(class96 arg0, class96 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field3010 = arg5;
        this.field3015 = arg0;
        this.field3019 = arg1;
        this.field3018 = arg2;
        class30.method234(this, 108, this.field3018);
    }

    @OriginalMember(owner = "client!t", name = "c", descriptor = "(B)V")
    public static void method1018(byte arg0) {
        field3023 = null;
        field3021 = null;
        field3036 = null;
        field3025 = null;
        if (arg0 < -6) {
            field3005 = null;
            field3031 = null;
            field3035 = null;
            field3034 = null;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IBIII)V")
    public static final void method1019(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (~class49.field1158 == -1 && !class106.field2292) {
            ++class42.field1007;
            class138.method1096(class26.field672, class23.field559, -arg2 + arg4, -1, 29, arg3 - arg0, 0);
        }
        ++field3004;
        int var5 = -1;
        for (int var6 = 0; class113.field2468 > var6; ++var6) {
            int var7 = class113.field2452[var6];
            int var8 = 127 & var7;
            int var9 = 127 & var7 >> 7;
            int var10 = var7 >> 14 & 32767;
            int var11 = (var7 & 2064267753) >> 29;
            if (~var5 != ~var7) {
                var5 = var7;
                if (~var11 == -3 && ~class33.field857.method554(class95.field2040, var8, var9, var7) <= -1) {
                    class24 var12 = class94.method652(var10, 0);
                    if (var12.field567 != null) {
                        var12 = var12.method192(false);
                    }
                    if (var12 == null) {
                        continue;
                    }
                    if (~class49.field1158 == -2) {
                        class138.method1096(class15.method101(80, new class101[] { field3036, class54.field1216, var12.field564 }), class101.field2208, var8, -1, 4, var9, var7);
                        ++class96.field2074;
                    } else if (class106.field2292) {
                        if ((class135.field3095 & 4) == 4) {
                            class138.method1096(class15.method101(77, new class101[] { class15.field302, class54.field1216, var12.field564 }), class149.field3395, var8, -1, 58, var9, var7);
                            ++class127.field2877;
                        }
                    } else {
                        class101[] var13 = var12.field612;
                        if (class120.field2645) {
                            var13 = class26.method209(-8940, var13);
                        }
                        ++class152.field3465;
                        if (var13 != null) {
                            for (int var14 = 4; var14 >= 0; --var14) {
                                if (var13[var14] != null) {
                                    short var15 = 0;
                                    ++class63.field1398;
                                    if (~var14 == -1) {
                                        var15 = 30;
                                    }
                                    if (~var14 == -2) {
                                        var15 = 25;
                                    }
                                    if (var14 == 2) {
                                        var15 = 51;
                                    }
                                    if (var14 == 3) {
                                        var15 = 41;
                                    }
                                    if (~var14 == -5) {
                                        var15 = 1002;
                                    }
                                    class138.method1096(class15.method101(-105, new class101[] { class149.field3399, var12.field564 }), var13[var14], var8, -1, var15, var9, var7);
                                }
                            }
                        }
                        class138.method1096(class15.method101(101, new class101[] { class149.field3399, var12.field564 }), class26.field694, var8, -1, 1007, var9, var12.field624 << 14);
                    }
                }
                if (~var11 == -2) {
                    class62 var16 = class18.field376[var10];
                    if (~var16.field1374.field2540 == -2 && ~(127 & var16.field1341) == -65 && ~(127 & var16.field1298) == -65) {
                        for (int var17 = 0; ~var17 > ~class40.field959; ++var17) {
                            class62 var20 = class18.field376[class73.field1586[var17]];
                            if (var20 != null && var16 != var20 && var20.field1374.field2540 == 1 && var16.field1341 == var20.field1341 && var16.field1298 == var20.field1298) {
                                class12.method89(class73.field1586[var17], var20.field1374, -2, var9, var8);
                            }
                        }
                        for (int var18 = 0; ~var18 > ~class150.field3442; ++var18) {
                            class13 var19 = class94.field2032[class143.field3285[var18]];
                            if (var19 != null && var16.field1341 == var19.field1341 && var16.field1298 == var19.field1298) {
                                class143.method1135(var8, var19, (byte) 67, var9, class143.field3285[var18]);
                            }
                        }
                    }
                    class12.method89(var10, var16.field1374, -2, var9, var8);
                }
                if (~var11 == -1) {
                    class13 var21 = class94.field2032[var10];
                    if ((var21.field1341 & 127) == 64 && ~(127 & var21.field1298) == -65) {
                        for (int var22 = 0; ~class40.field959 < ~var22; ++var22) {
                            class62 var25 = class18.field376[class73.field1586[var22]];
                            if (var25 != null && var25.field1374.field2540 == 1 && var21.field1341 == var25.field1341 && ~var21.field1298 == ~var25.field1298) {
                                class12.method89(class73.field1586[var22], var25.field1374, -2, var9, var8);
                            }
                        }
                        for (int var23 = 0; class150.field3442 > var23; ++var23) {
                            class13 var24 = class94.field2032[class143.field3285[var23]];
                            if (var24 != null && var21 != var24 && var21.field1341 == var24.field1341 && ~var21.field1298 == ~var24.field1298) {
                                class143.method1135(var8, var24, (byte) -114, var9, class143.field3285[var23]);
                            }
                        }
                    }
                    class143.method1135(var8, var21, (byte) -77, var9, var10);
                }
                if (var11 == 3) {
                    class78 var26 = class54.field1219[class95.field2040][var8][var9];
                    if (var26 != null) {
                        for (class12 var27 = (class12) var26.method526(1580); var27 != null; var27 = (class12) var26.method530(-15571)) {
                            class155 var28 = class137.method1045((byte) -60, var27.field241);
                            if (class49.field1158 == 1) {
                                class138.method1096(class15.method101(127, new class101[] { field3036, class89.field1937, var28.field3570 }), class101.field2208, var8, -1, 14, var9, var27.field241);
                                ++class62.field1383;
                            } else if (class106.field2292) {
                                if ((class135.field3095 & 1) == 1) {
                                    class138.method1096(class15.method101(107, new class101[] { class15.field302, class89.field1937, var28.field3570 }), class149.field3395, var8, -1, 8, var9, var27.field241);
                                    ++class134.field3066;
                                }
                            } else {
                                ++class17.field354;
                                class101[] var29 = var28.field3523;
                                if (class120.field2645) {
                                    var29 = class26.method209(-8940, var29);
                                }
                                for (int var30 = 4; ~var30 <= -1; --var30) {
                                    if (var29 != null && var29[var30] != null) {
                                        ++class48.field1148;
                                        byte var31 = 0;
                                        if (var30 == 0) {
                                            var31 = 43;
                                        }
                                        if (~var30 == -2) {
                                            var31 = 21;
                                        }
                                        if (~var30 == -3) {
                                            var31 = 36;
                                        }
                                        if (var30 == 3) {
                                            var31 = 20;
                                        }
                                        if (var30 == 4) {
                                            var31 = 15;
                                        }
                                        class138.method1096(class15.method101(113, new class101[] { class140.field3236, var28.field3570 }), var29[var30], var8, -1, var31, var9, var27.field241);
                                    } else if (~var30 == -3) {
                                        class138.method1096(class15.method101(-14, new class101[] { class140.field3236, var28.field3570 }), class5.field65, var8, -1, 36, var9, var27.field241);
                                        ++class97.field2107;
                                    }
                                }
                                class138.method1096(class15.method101(-65, new class101[] { class140.field3236, var28.field3570 }), class26.field694, var8, -1, 1006, var9, var27.field241);
                            }
                        }
                    }
                }
            }
        }
        if (arg1 > -58) {
            method1016(118, -126);
        }
    }

    @OriginalMember(owner = "client!t", name = "g", descriptor = "(II)I")
    private final int method1020(int arg0, int arg1) {
        ++field3008;
        if (arg1 < 5) {
            this.field3006 = null;
        }
        if (super.field309[arg0] != null) {
            return 100;
        } else {
            return this.field3006[arg0] ? 100 : class92.method642(this.field3018, arg0, (byte) 61);
        }
    }

    @OriginalMember(owner = "client!t", name = "e", descriptor = "(I)I")
    public final int method1021(int arg0) {
        ++field3020;
        if (this.field3028) {
            return 100;
        } else if (super.field309 != null) {
            return 99;
        } else {
            int var2 = class92.method642(255, this.field3018, (byte) 67);
            if (arg0 != 13605) {
                this.field3028 = true;
            }
            if (var2 >= 100) {
                var2 = 99;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "([BIZZI)V")
    public final void method1022(byte[] arg0, int arg1, boolean arg2, boolean arg3, int arg4) {
        ++field3013;
        if (arg1 == 24588) {
            if (!arg2) {
                arg0[arg0.length - 2] = (byte) (super.field323[arg4] >> 8);
                arg0[arg0.length + -1] = (byte) super.field323[arg4];
                if (this.field3015 != null) {
                    class62.method428(20844, this.field3015, arg4, arg0);
                    this.field3006[arg4] = true;
                }
                if (arg3) {
                    super.field309[arg4] = class53.method381(class39.method295(arg1, -24665), false, arg0);
                    return;
                }
            } else {
                if (this.field3028) {
                    throw new RuntimeException();
                }
                if (this.field3019 != null) {
                    class62.method428(20844, this.field3019, this.field3018, arg0);
                }
                this.method119(-98, arg0);
                this.method1015(-1);
            }
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "([BIIZLnf;)V")
    public final void method1023(byte[] arg0, int arg1, int arg2, boolean arg3, class96 arg4) {
        if (arg1 != 0) {
            method1018((byte) 74);
        }
        ++field3024;
        if (this.field3019 != arg4) {
            if (!arg3 && this.field3012 == arg2) {
                this.field3028 = true;
            }
            if (arg0 != null && arg0.length > 2) {
                class144.field3313.reset();
                class144.field3313.update(arg0, 0, arg0.length + -2);
                int var6 = (int) class144.field3313.getValue();
                int var7 = (arg0[arg0.length + -2] << 8 & 65280) + (arg0[arg0.length + -1] & 255);
                if (super.field306[arg2] == var6 && ~super.field323[arg2] == ~var7) {
                    this.field3006[arg2] = true;
                    if (arg3) {
                        super.field309[arg2] = class53.method381(-89, false, arg0);
                    }
                } else {
                    this.field3006[arg2] = false;
                    if (this.field3010 || arg3) {
                        class121.method906(-32407, this.field3018, super.field306[arg2], arg2, (byte) 2, this, arg3);
                    }
                }
            } else {
                this.field3006[arg2] = false;
                if (this.field3010 || arg3) {
                    class121.method906(-32407, this.field3018, super.field306[arg2], arg2, (byte) 2, this, arg3);
                }
            }
        } else if (this.field3028) {
            throw new RuntimeException();
        } else if (arg0 == null) {
            class121.method906(arg1 ^ -32407, 255, this.field3022, this.field3018, (byte) 0, this, true);
        } else {
            class144.field3313.reset();
            class144.field3313.update(arg0, 0, arg0.length);
            int var8 = (int) class144.field3313.getValue();
            class138 var9 = new class138(class145.method1149(arg0, arg1 + 110));
            int var10 = var9.method1055(120);
            if (~var10 != -6 && ~var10 != -7) {
                throw new RuntimeException("Incorrect JS5 protocol number: " + var10);
            } else {
                int var11 = 0;
                if (~var10 <= -7) {
                    var11 = var9.method1062(1809568712);
                }
                if (~this.field3022 != ~var8 || ~this.field3029 != ~var11) {
                    class121.method906(arg1 + -32407, 255, this.field3022, this.field3018, (byte) 0, this, true);
                } else {
                    this.method119(-118, arg0);
                    this.method1015(-1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(ZI)Lod;")
    public static final class101 method1024(boolean arg0, int arg1) {
        ++field3026;
        if (!arg0) {
            method1024(false, 121);
        }
        class101 var2 = new class101();
        var2.field2223 = new byte[arg1];
        var2.field2231 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(IBI)V")
    public final void method1025(int arg0, byte arg1, int arg2) {
        this.field3022 = arg0;
        if (arg1 != 0) {
            this.method1022((byte[]) null, -31, true, false, -20);
        }
        ++field3007;
        this.field3029 = arg2;
        if (this.field3019 != null) {
            class28.method224(this, true, this.field3019, this.field3018);
        } else {
            class121.method906(-32407, 255, this.field3022, this.field3018, (byte) 0, this, true);
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IB)V")
    public final void method107(int arg0, byte arg1) {
        if (this.field3015 != null && this.field3006 != null && this.field3006[arg0]) {
            class28.method224(this, true, this.field3015, arg0);
        } else {
            class121.method906(arg1 + -32409, this.field3018, super.field306[arg0], arg0, (byte) 2, this, true);
        }
        if (arg1 == 2) {
            ++field3017;
        }
    }
}
