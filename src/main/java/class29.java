import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class29 extends class68 {

    @OriginalMember(owner = "client!be", name = "W", descriptor = "I")
    private int field385 = 8;

    @OriginalMember(owner = "client!be", name = "V", descriptor = "I")
    private int field384 = 1024;

    @OriginalMember(owner = "client!be", name = "Z", descriptor = "I")
    private int field388 = 81;

    @OriginalMember(owner = "client!be", name = "Q", descriptor = "I")
    private int field379 = 1024;

    @OriginalMember(owner = "client!be", name = "lb", descriptor = "I")
    private int field400 = 4;

    @OriginalMember(owner = "client!be", name = "ib", descriptor = "I")
    private int field397 = 204;

    @OriginalMember(owner = "client!be", name = "nb", descriptor = "I")
    private int field402 = 0;

    @OriginalMember(owner = "client!be", name = "ob", descriptor = "I")
    private int field403 = 409;

    @OriginalMember(owner = "client!be", name = "O", descriptor = "Z")
    public static boolean field377 = true;

    @OriginalMember(owner = "client!be", name = "bb", descriptor = "Z")
    public static boolean field390 = true;

    @OriginalMember(owner = "client!be", name = "N", descriptor = "I")
    public static int field376;

    @OriginalMember(owner = "client!be", name = "P", descriptor = "I")
    private int field378;

    @OriginalMember(owner = "client!be", name = "R", descriptor = "I")
    public static int field380;

    @OriginalMember(owner = "client!be", name = "T", descriptor = "I")
    public static int field382;

    @OriginalMember(owner = "client!be", name = "U", descriptor = "I")
    public static int field383;

    @OriginalMember(owner = "client!be", name = "Y", descriptor = "I")
    private int field387;

    @OriginalMember(owner = "client!be", name = "ab", descriptor = "I")
    public static int field389;

    @OriginalMember(owner = "client!be", name = "cb", descriptor = "I")
    public static int field391;

    @OriginalMember(owner = "client!be", name = "db", descriptor = "I")
    public static int field392;

    @OriginalMember(owner = "client!be", name = "eb", descriptor = "I")
    public static int field393;

    @OriginalMember(owner = "client!be", name = "gb", descriptor = "I")
    public static int field395;

    @OriginalMember(owner = "client!be", name = "hb", descriptor = "I")
    private int field396;

    @OriginalMember(owner = "client!be", name = "jb", descriptor = "I")
    public static int field398;

    @OriginalMember(owner = "client!be", name = "kb", descriptor = "I")
    public static int field399;

    @OriginalMember(owner = "client!be", name = "mb", descriptor = "I")
    public static int field401;

    @OriginalMember(owner = "client!be", name = "pb", descriptor = "I")
    public static int field404;

    @OriginalMember(owner = "client!be", name = "S", descriptor = "[I")
    private int[] field381;

    @OriginalMember(owner = "client!be", name = "X", descriptor = "[[I")
    private int[][] field386;

    @OriginalMember(owner = "client!be", name = "fb", descriptor = "[[I")
    private int[][] field394;

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(II)Z")
    public static final boolean method186(int arg0, int arg1) {
        if (arg1 != 1) {
            field390 = true;
        }
        ++field382;
        return (arg0 & -arg0) == arg0;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(ZLai;)V")
    public static final void method187(boolean arg0, class88 arg1) {
        if (!arg0) {
            method194(95, (class211) null);
        }
        class71 var2 = (class71) class95.field1343.method23(216, class73.method465((byte) -72, arg1.field1217));
        ++field380;
        if (var2 == null) {
            class253.method1692((class140) null, 0, 128, arg1.field4076[0], class295.field4642, arg1.field4032[0], arg1, (class111) null);
        } else {
            var2.method439(22387);
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Lql;IZ)V")
    public final void method28(class224 arg0, int arg1, boolean arg2) {
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (~arg1 != -4) {
                        if (arg1 != 4) {
                            if (~arg1 != -6) {
                                if (~arg1 != -7) {
                                    if (arg1 == 7) {
                                        this.field384 = arg0.method1445(false);
                                    }
                                } else {
                                    this.field388 = arg0.method1445(false);
                                }
                            } else {
                                this.field402 = arg0.method1445(false);
                            }
                        } else {
                            this.field379 = arg0.method1445(false);
                        }
                    } else {
                        this.field397 = arg0.method1445(false);
                    }
                } else {
                    this.field403 = arg0.method1445(false);
                }
            } else {
                this.field385 = arg0.method1453((byte) -128);
            }
        } else {
            this.field400 = arg0.method1453((byte) -128);
        }
        if (!arg2) {
            this.field386 = null;
        }
        ++field404;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Lhc;B)V")
    public static final void method188(class235 arg0, byte arg1) {
        class163.field2271 = arg0.method1568("runes", -7551);
        if (arg1 != 68) {
            method191(-61, -24);
        }
        ++field401;
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "()V")
    public class29() {
        super(0, true);
    }

    @OriginalMember(owner = "client!be", name = "f", descriptor = "(B)V")
    private final void method189(byte arg0) {
        ++field389;
        Random var2 = new Random((long) this.field385);
        this.field394 = new int[this.field385][this.field400 + 1];
        this.field378 = this.field388 / 2;
        this.field387 = 4096 / this.field400;
        int var3 = this.field387 / 2;
        this.field386 = new int[this.field385][this.field400];
        this.field381 = new int[this.field385 + 1];
        this.field396 = 4096 / this.field385;
        int var4 = this.field396 / 2;
        if (arg0 <= 116) {
            this.method28((class224) null, 61, false);
        }
        this.field381[0] = 0;
        for (int var5 = 0; ~this.field385 < ~var5; ++var5) {
            if (~var5 < -1) {
                int var6 = this.field396;
                int var7 = (class47.method310(4096, (byte) -120, var2) + -2048) * this.field397 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field381[var5] = this.field381[var5 - 1] + var8;
            }
            this.field394[var5][0] = 0;
            for (int var9 = 0; this.field400 > var9; ++var9) {
                if (~var9 < -1) {
                    int var10 = this.field387;
                    int var11 = (-2048 + class47.method310(4096, (byte) -101, var2)) * this.field403 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field394[var5][var9] = this.field394[var5][var9 + -1] + var12;
                }
                this.field386[var5][var9] = this.field384 > 0 ? 4096 + -class47.method310(this.field384, (byte) -128, var2) : 4096;
            }
            this.field394[var5][this.field400] = 4096;
        }
        this.field381[this.field385] = 4096;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IIIII)V")
    public static final void method190(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field383;
        if (arg2 == 18051) {
            if (~arg4 > ~arg1) {
                for (int var5 = arg4; var5 < arg1; ++var5) {
                    class216.field3264[var5][arg0] = arg3;
                }
            } else {
                for (int var6 = arg1; ~arg4 < ~var6; ++var6) {
                    class216.field3264[var6][arg0] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!be", name = "c", descriptor = "(II)Z")
    public static final boolean method191(int arg0, int arg1) {
        byte var2 = 0;
        ++field398;
        if (arg0 != 103) {
            return true;
        } else {
            byte var3 = 0;
            if (class266.field4034 == null) {
                if (class46.field681 == null) {
                    class266.field4034 = new class128(512, 512);
                } else {
                    class266.field4034 = (class128) class46.field681;
                }
                int[] var4 = class266.field4034.field1820;
                int var5 = var4.length;
                for (int var6 = 0; ~var6 > ~var5; ++var6) {
                    var4[var6] = 1;
                }
                for (int var7 = var3 + 1; var7 < -var3 + 104 - 1; ++var7) {
                    int var21 = (103 - (-var3 + var7)) * 2048 + 24628;
                    for (int var22 = var2 + 1; ~var22 > ~(-var2 + 104 + -1); ++var22) {
                        if (~(24 & class230.field3489[arg1][var22][var7]) == -1) {
                            class205.method1305(var4, var21, 512, arg1, var22, var7);
                        }
                        if (arg1 < 3 && ~(class230.field3489[arg1 + 1][var22][var7] & 8) != -1) {
                            class205.method1305(var4, var21, 512, arg1 + 1, var22, var7);
                        }
                        var21 += 4;
                    }
                }
                class252.field3857 = 0;
                for (int var8 = 0; var8 < 104; ++var8) {
                    for (int var9 = 0; var9 < 104; ++var9) {
                        long var10 = class69.method431(class295.field4642, var2 + var8, var9 - -var3);
                        if (~var10 != -1L) {
                            class111 var12 = class76.method489((int) (var10 >>> 32) & Integer.MAX_VALUE, 107);
                            int var13 = var12.field1607;
                            if (var12.field1597 != null) {
                                for (int var14 = 0; ~var14 > ~var12.field1597.length; ++var14) {
                                    if (~var12.field1597[var14] != 0) {
                                        class111 var15 = class76.method489(var12.field1597[var14], arg0 ^ 4);
                                        if (var15.field1607 >= 0) {
                                            var13 = var15.field1607;
                                            break;
                                        }
                                    }
                                }
                            }
                            if (var13 >= 0) {
                                int var16 = var2 + var8;
                                int var17 = var9 - -var3;
                                if (~var13 != -23 && var13 != 29 && ~var13 != -35 && ~var13 != -37 && ~var13 != -47 && var13 != 47 && ~var13 != -49) {
                                    int[][] var18 = class122.field1703[class295.field4642].field4272;
                                    for (int var19 = 0; ~var19 > -11; ++var19) {
                                        int var20 = (int) (4.0D * Math.random());
                                        if (~var20 == -1 && ~var16 < -1 && var8 + -3 < var16 && ~(var18[var16 + -1][var17] & 2883848) == -1) {
                                            --var16;
                                        }
                                        if (var20 == 1 && ~var16 > -104 && ~(var8 + 3) < ~var16 && ~(var18[var16 + 1][var17] & 2883968) == -1) {
                                            ++var16;
                                        }
                                        if (var20 == 2 && ~var17 < -1 && var17 > var9 + -3 && (var18[var16][var17 + -1] & 2883842) == 0) {
                                            --var17;
                                        }
                                        if (var20 == 3 && var17 < 103 && var9 - -3 > var17 && (2883872 & var18[var16][var17 + 1]) == 0) {
                                            ++var17;
                                        }
                                    }
                                }
                                class150.field2078[class252.field3857] = var12.field1579;
                                class20.field290[class252.field3857] = var16 - var2;
                                class164.field2277[class252.field3857] = -var3 + var17;
                                ++class252.field3857;
                            }
                        }
                    }
                }
            }
            int var23 = (238 - -((int) (Math.random() * 20.0D)) - 10 << 8) + ((228 + (int) (20.0D * Math.random()) << 16) - (-238 + -((int) (20.0D * Math.random())) - -10));
            int var24 = -10 + (int) (20.0D * Math.random()) + 238 << 16;
            class266.field4034.method879();
            for (int var25 = 1; var25 < 103; ++var25) {
                for (int var26 = 1; var26 < 103; ++var26) {
                    if ((24 & class230.field3489[arg1][var2 + var26][var3 + var25]) == 0 && !class83.method518(var3, var26, arg1, var23, var2, var24, arg0 ^ 103, var25)) {
                        class207.field2889.method1979((byte) -77);
                        return false;
                    }
                    if (~arg1 > -4 && ~(8 & class230.field3489[arg1 + 1][var2 + var26][var25 - -var3]) != -1 && !class83.method518(var3, var26, arg1 + 1, var23, var2, var24, 0, var25)) {
                        class207.field2889.method1979((byte) -38);
                        return false;
                    }
                }
            }
            class46.field681 = class266.field4034;
            class207.field2889.method1979((byte) -36);
            class266.field4034 = null;
            return true;
        }
    }

    @OriginalMember(owner = "client!be", name = "e", descriptor = "(I)V")
    public final void method192(int arg0) {
        this.method189((byte) 121);
        if (arg0 >= -18) {
            method186(27, 68);
        }
        ++field391;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(II)[I")
    public final int[] method32(int arg0, int arg1) {
        if (arg1 > -118) {
            return null;
        } else {
            ++field392;
            int[] var3 = super.field917.method1920(arg0, true);
            if (super.field917.field4474) {
                int var4 = 0;
                int var5;
                for (var5 = class127.field1794[arg0] + this.field402; ~var5 > -1; var5 += 4096) {
                }
                while (var5 > 4096) {
                    var5 -= 4096;
                }
                while (~this.field385 < ~var4 && ~var5 <= ~this.field381[var4]) {
                    ++var4;
                }
                boolean var6 = (1 & var4) == 0;
                int var7 = var4 - 1;
                int var8 = this.field381[var4];
                int var9 = this.field381[var4 + -1];
                if (var5 > var9 - -this.field378 && ~var5 > ~(-this.field378 + var8)) {
                    for (int var10 = 0; ~class89.field1248 < ~var10; ++var10) {
                        int var11 = !var6 ? -this.field379 : this.field379;
                        int var12;
                        for (var12 = (this.field387 * var11 >> 12) + class215.field3231[var10]; ~var12 > -1; var12 += 4096) {
                        }
                        while (~var12 < -4097) {
                            var12 -= 4096;
                        }
                        int var13;
                        for (var13 = 0; var13 < this.field400 && ~var12 <= ~this.field394[var7][var13]; ++var13) {
                        }
                        int var14 = var13 - 1;
                        int var15 = this.field394[var7][var14];
                        int var16 = this.field394[var7][var13];
                        if (var12 > this.field378 + var15 && ~(-this.field378 + var16) < ~var12) {
                            var3[var10] = this.field386[var7][var14];
                        } else {
                            var3[var10] = 0;
                        }
                    }
                } else {
                    class115.method779(var3, 0, class89.field1248, 0);
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(IIIII)V")
    public static final void method193(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field399;
        class280 var5 = class181.method1180(arg3, 0, arg2);
        var5.method1876(arg2 + 1840457238);
        var5.field4338 = arg0;
        var5.field4330 = arg4;
        var5.field4329 = arg1;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(ILse;)Ljava/lang/String;")
    public static final String method194(int arg0, class211 arg1) {
        ++field395;
        if (arg0 == client.method1040(arg1).method1290((byte) 125)) {
            return null;
        } else if (arg1.field3136 != null && ~arg1.field3136.trim().length() != -1) {
            return arg1.field3136;
        } else {
            return class19.field269 ? "Hidden-use" : null;
        }
    }
}
