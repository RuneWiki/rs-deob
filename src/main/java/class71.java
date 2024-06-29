import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class71 extends class1 {

    @OriginalMember(owner = "client!gf", name = "ib", descriptor = "I")
    private int field1373 = 0;

    @OriginalMember(owner = "client!gf", name = "mb", descriptor = "I")
    private int field1377 = 2000;

    @OriginalMember(owner = "client!gf", name = "nb", descriptor = "I")
    private int field1378 = 4096;

    @OriginalMember(owner = "client!gf", name = "lb", descriptor = "I")
    private int field1376 = 0;

    @OriginalMember(owner = "client!gf", name = "gb", descriptor = "I")
    private int field1371 = 16;

    @OriginalMember(owner = "client!gf", name = "kb", descriptor = "Loc;")
    public static class151 field1375 = class137.method873(2, "Suche nach Updates )2 ");

    @OriginalMember(owner = "client!gf", name = "pb", descriptor = "I")
    public static int field1380 = 0;

    @OriginalMember(owner = "client!gf", name = "ub", descriptor = "I")
    public static int field1385 = 0;

    @OriginalMember(owner = "client!gf", name = "vb", descriptor = "I")
    public static int field1386 = 0;

    @OriginalMember(owner = "client!gf", name = "sb", descriptor = "Lv;")
    public static class218 field1383 = new class218();

    @OriginalMember(owner = "client!gf", name = "xb", descriptor = "Loc;")
    public static class151 field1388 = class137.method873(2, "Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

    @OriginalMember(owner = "client!gf", name = "wb", descriptor = "Loc;")
    public static class151 field1387 = class137.method873(2, "");

    @OriginalMember(owner = "client!gf", name = "hb", descriptor = "I")
    public static int field1372;

    @OriginalMember(owner = "client!gf", name = "jb", descriptor = "I")
    public static int field1374;

    @OriginalMember(owner = "client!gf", name = "ob", descriptor = "I")
    public static int field1379;

    @OriginalMember(owner = "client!gf", name = "qb", descriptor = "I")
    public static int field1381;

    @OriginalMember(owner = "client!gf", name = "rb", descriptor = "I")
    public static int field1382;

    @OriginalMember(owner = "client!gf", name = "tb", descriptor = "I")
    public static int field1384;

    @OriginalMember(owner = "client!gf", name = "<init>", descriptor = "()V")
    public class71() {
        super(0, true);
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IILwa;)V")
    public final void method13(int arg0, int arg1, class229 arg2) {
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (arg1 == 4) {
                            this.field1378 = arg2.method1490((byte) 73);
                        }
                    } else {
                        this.field1376 = arg2.method1490((byte) 73);
                    }
                } else {
                    this.field1371 = arg2.method1475(255);
                }
            } else {
                this.field1377 = arg2.method1490((byte) 73);
            }
        } else {
            this.field1373 = arg2.method1475(255);
        }
        if (arg0 != 0) {
            method472(-47);
        }
        ++field1374;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lw;I)V")
    public static final void method471(class228 arg0, int arg1) {
        arg0.field4038 = false;
        if (arg0.field3993 != -1) {
            class115 var2 = class197.method1233(41, arg0.field3993);
            if (var2 != null && var2.field2056 != null) {
                ++arg0.field4034;
                if (arg0.field3974 < var2.field2056.length && ~arg0.field4034 < ~var2.field2051[arg0.field3974]) {
                    ++arg0.field3974;
                    arg0.field4034 = 1;
                    class19.method169(var2, arg0.field4029, arg0.field3976, class228.field3975 == arg0, arg0.field3974, -24879);
                }
                if (~arg0.field3974 <= ~var2.field2056.length) {
                    arg0.field3974 = 0;
                    arg0.field4034 = 0;
                    class19.method169(var2, arg0.field4029, arg0.field3976, class228.field3975 == arg0, arg0.field3974, -24879);
                }
            } else {
                arg0.field3993 = -1;
            }
        }
        if (arg0.field4016 != -1 && arg0.field4039 <= class200.field3541) {
            if (arg0.field4030 < 0) {
                arg0.field4030 = 0;
            }
            int var3 = class19.method166(arg0.field4016, 22883).field1062;
            if (~var3 == 0) {
                arg0.field4016 = -1;
            } else {
                class115 var4 = class197.method1233(arg1 ^ 83, var3);
                if (var4 != null && var4.field2056 != null) {
                    ++arg0.field3977;
                    if (var4.field2056.length > arg0.field4030 && var4.field2051[arg0.field4030] < arg0.field3977) {
                        arg0.field3977 = 1;
                        ++arg0.field4030;
                        class19.method169(var4, arg0.field4029, arg0.field3976, class228.field3975 == arg0, arg0.field4030, -24879);
                    }
                    if (~var4.field2056.length >= ~arg0.field4030) {
                        arg0.field4016 = -1;
                    }
                } else {
                    arg0.field4016 = -1;
                }
            }
        }
        ++field1379;
        if (~arg0.field3991 != arg1 && arg0.field4004 <= 1) {
            class115 var5 = class197.method1233(32, arg0.field3991);
            if (var5.field2073 == 1 && arg0.field4001 > 0 && ~arg0.field4015 >= ~class200.field3541 && ~arg0.field4040 > ~class200.field3541) {
                arg0.field4004 = 1;
                return;
            }
        }
        if (arg0.field3991 != -1 && ~arg0.field4004 == -1) {
            class115 var6 = class197.method1233(arg1 + -115, arg0.field3991);
            if (var6 != null && var6.field2056 != null) {
                ++arg0.field4022;
                if (var6.field2056.length > arg0.field4020 && ~var6.field2051[arg0.field4020] > ~arg0.field4022) {
                    arg0.field4022 = 1;
                    ++arg0.field4020;
                    class19.method169(var6, arg0.field4029, arg0.field3976, class228.field3975 == arg0, arg0.field4020, -24879);
                }
                if (var6.field2056.length <= arg0.field4020) {
                    arg0.field4020 -= var6.field2055;
                    ++arg0.field4042;
                    if (arg0.field4042 < var6.field2054) {
                        if (arg0.field4020 >= 0 && ~arg0.field4020 > ~var6.field2056.length) {
                            class19.method169(var6, arg0.field4029, arg0.field3976, class228.field3975 == arg0, arg0.field4020, -24879);
                        } else {
                            arg0.field3991 = -1;
                        }
                    } else {
                        arg0.field3991 = -1;
                    }
                }
                arg0.field4038 = var6.field2060;
            } else {
                arg0.field3991 = -1;
            }
        }
        if (arg0.field4004 > 0) {
            --arg0.field4004;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(BI)[I")
    public final int[] method11(byte arg0, int arg1) {
        ++field1384;
        int[] var3 = super.field21.method1182(arg1, -31709);
        if (arg0 != 107) {
            method474((byte) -122);
        }
        if (super.field21.field3388) {
            int var4 = this.field1378 >> 1;
            int[][] var5 = super.field21.method1183(arg0 + -107);
            Random var6 = new Random((long) this.field1373);
            for (int var7 = 0; ~var7 > ~this.field1377; ++var7) {
                int var8 = this.field1378 > 0 ? this.field1376 - (-class3.method28(var6, arg0, this.field1378) + var4) : this.field1376;
                int var9 = class3.method28(var6, 79, class202.field3603);
                int var10 = (var8 & 4088) >> 4;
                int var11 = class3.method28(var6, 125, class129.field2354);
                int var12 = (class164.field2963[var10] * this.field1371 >> 12) + var9;
                int var13 = (class22.field476[var10] * this.field1371 >> 12) + var11;
                int var14 = -var11 + var13;
                int var15 = -var9 + var12;
                if (var15 != 0 || var14 != 0) {
                    if (var14 < 0) {
                        var14 = -var14;
                    }
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    boolean var16 = ~var14 < ~var15;
                    if (var16) {
                        int var17 = var9;
                        int var18 = var12;
                        var12 = var13;
                        var13 = var18;
                        var9 = var11;
                        var11 = var17;
                    }
                    if (var12 < var9) {
                        int var19 = var11;
                        var11 = var13;
                        var13 = var19;
                        int var20 = var9;
                        var9 = var12;
                        var12 = var20;
                    }
                    int var21 = var11;
                    int var22 = -var9 + var12;
                    int var23 = -var11 + var13;
                    int var24 = -(class3.method28(var6, 121, 4096) >> 2) + 1024;
                    int var25 = -var22 / 2;
                    if (var23 < 0) {
                        var23 = -var23;
                    }
                    int var26 = 2048 / var22;
                    int var27 = var13 > var11 ? 1 : -1;
                    for (int var28 = var9; var28 < var12; ++var28) {
                        var25 += var23;
                        int var29 = (-var9 + var28) * var26 + var24 + 1024;
                        int var30 = class78.field1510 & var28;
                        int var31 = var21 & class155.field2804;
                        if (~var25 < -1) {
                            var25 += -var22;
                            var21 += var27;
                        }
                        if (var16) {
                            var5[var31][var30] = var29;
                        } else {
                            var5[var30][var31] = var29;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(I)V")
    public final void method2(int arg0) {
        if (arg0 != 3) {
            method474((byte) 31);
        }
        ++field1382;
        class182.method1146(false);
    }

    @OriginalMember(owner = "client!gf", name = "f", descriptor = "(I)V")
    public static void method472(int arg0) {
        if (arg0 >= -79) {
            method473((class105) null, (byte) -115, (class105) null);
        }
        field1388 = null;
        field1375 = null;
        field1383 = null;
        field1387 = null;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Ljh;BLjh;)V")
    public static final void method473(class105 arg0, byte arg1, class105 arg2) {
        ++field1381;
        if (class112.field1970 == null) {
            class112.field1970 = class16.method136(0, (byte) -127, class164.field2960, class74.field1439);
        }
        if (class63.field1224 == null) {
            class63.field1224 = class45.method321((byte) -107, class164.field2960, 0, class116.field2081);
        }
        if (class132.field2418 == null) {
            class132.field2418 = class45.method321((byte) -120, class164.field2960, 0, class120.field2159);
        }
        if (class51.field1034 == null) {
            class51.field1034 = class45.method321((byte) -108, class164.field2960, 0, class139.field2546);
        }
        if (arg1 >= 116) {
            class221.method1375(0, 23, 765, 480, 0);
            class221.method1388(0, 0, 138, 23, 12425273, 9135624);
            class221.method1388(138, 0, 640, 23, 5197647, 2697513);
            arg2.method1254(class113.field2009, 69, 15, 0, -1);
            if (class51.field1034 != null) {
                class51.field1034[1].method229(140, 1);
                arg0.method1256(class130.field2390, 152, 10, 16777215, -1);
                class51.field1034[0].method229(140, 12);
                arg0.method1256(class58.field1160, 152, 21, 16777215, -1);
            }
            if (class132.field2418 != null) {
                short var3 = 280;
                if (~class89.field1632[0] == -1 && ~class211.field3696[0] == -1) {
                    class132.field2418[2].method229(var3, 4);
                } else {
                    class132.field2418[0].method229(var3, 4);
                }
                if (~class89.field1632[0] == -1 && ~class211.field3696[0] == -2) {
                    class132.field2418[3].method229(var3 + 15, 4);
                } else {
                    class132.field2418[1].method229(var3 + 15, 4);
                }
                arg2.method1256(class1.field36, var3 + 32, 17, 16777215, -1);
                short var4 = 500;
                short var5 = 610;
                short var6 = 390;
                if (~class89.field1632[0] == -2 && class211.field3696[0] == 0) {
                    class132.field2418[2].method229(var6, 4);
                } else {
                    class132.field2418[0].method229(var6, 4);
                }
                if (~class89.field1632[0] == -2 && class211.field3696[0] == 1) {
                    class132.field2418[3].method229(var6 + 15, 4);
                } else {
                    class132.field2418[1].method229(var6 + 15, 4);
                }
                arg2.method1256(class224.field3901, var6 - -32, 17, 16777215, -1);
                if (class89.field1632[0] == 2 && class211.field3696[0] == 0) {
                    class132.field2418[2].method229(var4, 4);
                } else {
                    class132.field2418[0].method229(var4, 4);
                }
                if (class89.field1632[0] == 2 && ~class211.field3696[0] == -2) {
                    class132.field2418[3].method229(var4 + 15, 4);
                } else {
                    class132.field2418[1].method229(var4 + 15, 4);
                }
                arg2.method1256(class174.field3146, var4 + 32, 17, 16777215, -1);
                if (~class89.field1632[0] == -4 && class211.field3696[0] == 0) {
                    class132.field2418[2].method229(var5, 4);
                } else {
                    class132.field2418[0].method229(var5, 4);
                }
                if (class89.field1632[0] == 3 && class211.field3696[0] == 1) {
                    class132.field2418[3].method229(var5 + 15, 4);
                } else {
                    class132.field2418[1].method229(var5 + 15, 4);
                }
                arg2.method1256(class36.field730, var5 - -32, 17, 16777215, -1);
            }
            class221.method1375(700, 4, 58, 16, 0);
            arg0.method1254(class205.field3634, 729, 16, 16777215, -1);
            class206.field3649 = -1;
            if (class112.field1970 != null) {
                byte var7 = 19;
                byte var8 = 88;
                int var9 = 480 / (var7 + 1);
                int var10 = 765 / (var8 + 1);
                int var11;
                int var12;
                do {
                    var11 = var9;
                    var12 = var10;
                    if ((var10 - 1) * var9 >= class99.field1794) {
                        --var10;
                    }
                    if (class99.field1794 <= (var9 + -1) * var10) {
                        --var9;
                    }
                    if (class99.field1794 <= (var9 + -1) * var10) {
                        --var9;
                    }
                } while (~var9 != ~var11 || ~var10 != ~var12);
                int var13 = (-(var8 * var10) + 765) / (var10 + 1);
                if (var13 > 5) {
                    var13 = 5;
                }
                int var14 = (-(var7 * var9) + 480) / (var9 - -1);
                int var15 = (-((var10 + -1) * var13) + -(var8 * var10) + 765) / 2;
                if (~var14 < -6) {
                    var14 = 5;
                }
                int var16 = var15;
                int var17 = 0;
                int var18 = (-(var7 * var9) + 480 + -((var9 + -1) * var14)) / 2;
                int var19 = var18 + 23;
                for (int var20 = 0; var20 < class99.field1794; ++var20) {
                    class5 var21 = class222.field3849[var20];
                    boolean var22 = true;
                    class151 var23 = class137.method874(var21.field88, false);
                    if (var21.field88 != -1) {
                        if (~var21.field88 < -1981) {
                            var22 = false;
                            var23 = class5.field96;
                        }
                    } else {
                        var22 = false;
                        var23 = class25.field537;
                    }
                    if (class57.field1149 >= var16 && ~class41.field857 <= ~var19 && class57.field1149 < var16 - -var8 && ~class41.field857 > ~(var7 + var19) && var22) {
                        class206.field3649 = var20;
                        class112.field1970[!var21.field92 ? 0 : 1].method551(var16, var19, 128, 16777215);
                    } else {
                        class112.field1970[!var21.field92 ? 0 : 1].method544(var16, var19);
                    }
                    if (class63.field1224 != null) {
                        class63.field1224[(var21.field92 ? 8 : 0) - -var21.field86].method229(var16 + 29, var19);
                    }
                    arg2.method1254(class137.method874(var21.field90, false), var16 + 15, var7 / 2 + var19 + 5, 0, -1);
                    arg0.method1254(var23, var16 + 60, var7 / 2 + var19 + 5, 268435455, -1);
                    var19 += var7 + var14;
                    ++var17;
                    if (var9 <= var17) {
                        var16 += var8 + var13;
                        var17 = 0;
                        var19 = var18 + 23;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "(B)[Lcg;")
    public static final class30[] method474(byte arg0) {
        ++field1372;
        class30[] var1 = new class30[class196.field3493];
        int var2 = 0;
        if (arg0 < 10) {
            method472(-57);
        }
        while (~class196.field3493 < ~var2) {
            class30 var3 = new class30();
            var3.field629 = class124.field2236;
            var3.field635 = class169.field3079;
            var3.field631 = class128.field2302[var2];
            var3.field630 = class148.field2650[var2];
            var3.field633 = class159.field2862[var2];
            var3.field634 = class181.field3271[var2];
            var3.field632 = class67.field1312;
            var3.field628 = class174.field3147[var2];
            var1[var2] = var3;
            ++var2;
        }
        class99.method612(-20444);
        return var1;
    }
}
