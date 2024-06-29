import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class92 extends class64 {

    @OriginalMember(owner = "client!kb", name = "jb", descriptor = "Z")
    private boolean field1731 = true;

    @OriginalMember(owner = "client!kb", name = "eb", descriptor = "Z")
    private boolean field1726 = true;

    @OriginalMember(owner = "client!kb", name = "fb", descriptor = "[B")
    public static byte[] field1727 = new byte[520];

    @OriginalMember(owner = "client!kb", name = "hb", descriptor = "Lua;")
    public static class181 field1729 = new class181(64);

    @OriginalMember(owner = "client!kb", name = "kb", descriptor = "Lsg;")
    public static class169 field1732 = class165.method1060("Konfig geladen)3", 1536);

    @OriginalMember(owner = "client!kb", name = "mb", descriptor = "Lsg;")
    public static class169 field1734 = class165.method1060("Registrierter Benutzer", 1536);

    @OriginalMember(owner = "client!kb", name = "nb", descriptor = "Lsg;")
    public static class169 field1735 = class165.method1060("Wir vermuten)1 dass jemand Ihr Passwort kennt)3", 1536);

    @OriginalMember(owner = "client!kb", name = "bb", descriptor = "I")
    public static int field1723;

    @OriginalMember(owner = "client!kb", name = "cb", descriptor = "I")
    public static int field1724;

    @OriginalMember(owner = "client!kb", name = "db", descriptor = "I")
    public static int field1725;

    @OriginalMember(owner = "client!kb", name = "gb", descriptor = "I")
    public static int field1728;

    @OriginalMember(owner = "client!kb", name = "ib", descriptor = "I")
    public static int field1730;

    @OriginalMember(owner = "client!kb", name = "lb", descriptor = "I")
    public static int field1733;

    @OriginalMember(owner = "client!kb", name = "h", descriptor = "(I)V")
    public static final void method537(int arg0) {
        ++field1733;
        try {
            if (class99.field1861 == 0) {
                if (class2.field37 != null) {
                    class2.field37.method359((byte) 81);
                    class2.field37 = null;
                }
                class171.field3308 = false;
                class16.field333 = 0;
                class99.field1861 = 1;
                class99.field1848 = null;
            }
            if (~class99.field1861 == -2) {
                if (class99.field1848 == null) {
                    class99.field1848 = class163.field3134.method671(class56.field1026, class20.field442, -96);
                }
                if (~class99.field1848.field3296 == -3) {
                    throw new IOException();
                }
                if (class99.field1848.field3296 == 1) {
                    class2.field37 = new class57((Socket) class99.field1848.field3299, class163.field3134);
                    class99.field1848 = null;
                    class99.field1861 = 2;
                }
            }
            if (class99.field1861 == 2) {
                long var1 = class44.field829 = class43.field807.method1133(false);
                int var3 = (int) (31L & var1 >> 16);
                class141.field2621.field2346 = 0;
                class141.field2621.method821(14, 64);
                class141.field2621.method821(var3, 64);
                class2.field37.method361(0, 2, -1, class141.field2621.field2325);
                class85.field1559.field2346 = 0;
                class99.field1861 = 3;
            }
            if (~class99.field1861 == -4) {
                if (class20.field438 != null) {
                    class20.field438.method1225(true);
                }
                if (class149.field2762 != null) {
                    class149.field2762.method1225(true);
                }
                int var4 = class2.field37.method362(-36);
                if (class20.field438 != null) {
                    class20.field438.method1225(true);
                }
                if (class149.field2762 != null) {
                    class149.field2762.method1225(true);
                }
                if (~var4 != -1) {
                    class65.method414(var4, 24);
                    return;
                }
                class85.field1559.field2346 = 0;
                class99.field1861 = 4;
            }
            if (~class99.field1861 == -5) {
                if (~class85.field1559.field2346 > -9) {
                    int var5 = class2.field37.method358(-10633);
                    if (var5 > 8 - class85.field1559.field2346) {
                        var5 = -class85.field1559.field2346 + 8;
                    }
                    if (var5 > 0) {
                        class2.field37.method357(-80, class85.field1559.field2346, class85.field1559.field2325, var5);
                        class85.field1559.field2346 += var5;
                    }
                }
                if (class85.field1559.field2346 == 8) {
                    class85.field1559.field2346 = 0;
                    class201.field3919 = class85.field1559.method778(false);
                    class99.field1861 = 5;
                }
            }
            if (class99.field1861 == 5) {
                int[] var6 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (class201.field3919 >> 32), (int) class201.field3919 };
                class141.field2621.field2346 = 0;
                class141.field2621.method821(10, 64);
                class141.field2621.method802((byte) 64, var6[0]);
                class141.field2621.method802((byte) 64, var6[1]);
                class141.field2621.method802((byte) 64, var6[2]);
                class141.field2621.method802((byte) 64, var6[3]);
                class141.field2621.method816(class43.field807.method1133(false), -16701);
                class141.field2621.method799(class43.field806, (byte) 0);
                class141.field2621.method804(class19.field427, class180.field3507, 255);
                class91.field1684.field2346 = 0;
                if (class111.field2031 != 40) {
                    class91.field1684.method821(16, 64);
                } else {
                    class91.field1684.method821(18, 64);
                }
                class91.field1684.method821(93 - -class141.field2621.field2346, 64);
                class91.field1684.method802((byte) 64, 475);
                class91.field1684.method821(class105.field1925 ? 1 : 0, 64);
                class179.method1190(20083, class91.field1684);
                class91.field1684.method802((byte) 64, class127.field2374.field1799);
                class91.field1684.method802((byte) 64, class94.field1750.field1799);
                class91.field1684.method802((byte) 64, class8.field221.field1799);
                class91.field1684.method802((byte) 64, class201.field3916.field1799);
                class91.field1684.method802((byte) 64, class62.field1143.field1799);
                class91.field1684.method802((byte) 64, class137.field2555.field1799);
                class91.field1684.method802((byte) 64, class201.field3923.field1799);
                class91.field1684.method802((byte) 64, class187.field3632.field1799);
                class91.field1684.method802((byte) 64, class104.field1907.field1799);
                class91.field1684.method802((byte) 64, class16.field339.field1799);
                class91.field1684.method802((byte) 64, class125.field2288.field1799);
                class91.field1684.method802((byte) 64, class142.field2655.field1799);
                class91.field1684.method802((byte) 64, class45.field842.field1799);
                class91.field1684.method802((byte) 64, class29.field602.field1799);
                class91.field1684.method802((byte) 64, class183.field3562.field1799);
                class91.field1684.method802((byte) 64, class89.field1629.field1799);
                class91.field1684.method772(true, class141.field2621.field2325, class141.field2621.field2346, 0);
                class2.field37.method361(0, class91.field1684.field2346, -1, class91.field1684.field2325);
                class141.field2621.method1026(-79, var6);
                for (int var7 = 0; var7 < 4; ++var7) {
                    var6[var7] += 50;
                }
                class85.field1559.method1026(-114, var6);
                class99.field1861 = 6;
            }
            if (~class99.field1861 == -7 && class2.field37.method358(-10633) > 0) {
                int var8 = class2.field37.method362(-55);
                if (var8 == 21 && ~class111.field2031 == -21) {
                    class99.field1861 = 7;
                } else if (~var8 == -3) {
                    class99.field1861 = 9;
                } else {
                    if (~var8 == -16 && ~class111.field2031 == -41) {
                        class3.method23(-101);
                        return;
                    }
                    if (var8 != 23 || class55.field1005 >= 1) {
                        class65.method414(var8, 24);
                        return;
                    }
                    ++class55.field1005;
                    class99.field1861 = 0;
                }
            }
            if (arg0 <= 78) {
                field1727 = null;
            }
            if (~class99.field1861 == -8 && class2.field37.method358(-10633) > 0) {
                class4.field78 = (class2.field37.method362(-49) - -3) * 60;
                class99.field1861 = 8;
            }
            if (class99.field1861 == 8) {
                class16.field333 = 0;
                class145.method954(class165.method1058(0, new class169[] { class2.method18((byte) -62, class4.field78 / 60), class7.field139 }), 7791, class21.field446, class35.field705);
                if (~(--class4.field78) >= -1) {
                    class99.field1861 = 0;
                }
            } else {
                if (class99.field1861 == 9 && ~class2.field37.method358(-10633) <= -10) {
                    class51.field900 = class2.field37.method362(-45);
                    class184.field3578 = class2.field37.method362(-39);
                    class196.field3859 = class2.field37.method362(-82) == 1;
                    class206.field4041 = class2.field37.method362(-47);
                    class206.field4041 <<= 8;
                    class206.field4041 += class2.field37.method362(-107);
                    class172.field3336 = class2.field37.method362(-127);
                    class2.field37.method357(-119, 0, class85.field1559.field2325, 1);
                    class85.field1559.field2346 = 0;
                    class86.field1571 = class85.field1559.method1032(-68);
                    class2.field37.method357(-109, 0, class85.field1559.field2325, 2);
                    class85.field1559.field2346 = 0;
                    class27.field553 = class85.field1559.method785(true);
                    class99.field1861 = 10;
                }
                if (~class99.field1861 == -11) {
                    if (class2.field37.method358(-10633) >= class27.field553) {
                        class85.field1559.field2346 = 0;
                        class2.field37.method357(-92, 0, class85.field1559.field2325, class27.field553);
                        class105.method620(-128);
                        class6.field131 = -1;
                        class121.method753(false, (byte) 109);
                        class86.field1571 = -1;
                    }
                } else {
                    ++class16.field333;
                    if (~class16.field333 < -2001) {
                        if (class55.field1005 < 1) {
                            if (~class56.field1026 == ~class13.field304) {
                                class56.field1026 = class80.field1472;
                            } else {
                                class56.field1026 = class13.field304;
                            }
                            class99.field1861 = 0;
                            ++class55.field1005;
                        } else {
                            class65.method414(-3, 24);
                        }
                    }
                }
            }
        } catch (IOException var9) {
            if (~class55.field1005 > -2) {
                ++class55.field1005;
                class99.field1861 = 0;
                if (~class56.field1026 == ~class13.field304) {
                    class56.field1026 = class80.field1472;
                } else {
                    class56.field1026 = class13.field304;
                }
            } else {
                class65.method414(-2, 24);
            }
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(BI)[[I")
    public final int[][] method59(byte arg0, int arg1) {
        ++field1724;
        if (arg0 != -40) {
            return null;
        } else {
            int[][] var3 = super.field1195.method177(1193, arg1);
            if (super.field1195.field532) {
                int[][] var4 = this.method402(false, this.field1726 ? -arg1 + class89.field1616 : arg1, 0);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[2];
                int[] var10 = var3[1];
                if (this.field1731) {
                    for (int var11 = 0; ~var11 > ~class147.field2715; ++var11) {
                        var8[var11] = var5[class8.field217 - var11];
                        var10[var11] = var6[class8.field217 - var11];
                        var9[var11] = var7[class8.field217 - var11];
                    }
                } else {
                    for (int var12 = 0; ~class147.field2715 < ~var12; ++var12) {
                        var8[var12] = var5[var12];
                        var10[var12] = var6[var12];
                        var9[var12] = var7[var12];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(BLoa;I)V")
    public final void method14(byte arg0, class127 arg1, int arg2) {
        ++field1723;
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (arg2 == 2) {
                    super.field1183 = ~arg1.method819((byte) 22) == -2;
                }
            } else {
                this.field1726 = ~arg1.method819((byte) 22) == -2;
            }
        } else {
            this.field1731 = arg1.method819((byte) 22) == 1;
        }
        int var5 = -101 % ((-60 - arg0) / 36);
    }

    @OriginalMember(owner = "client!kb", name = "i", descriptor = "(I)V")
    public static void method538(int arg0) {
        field1735 = null;
        field1732 = null;
        field1727 = null;
        field1729 = null;
        if (arg0 >= -82) {
            method537(-18);
        }
        field1734 = null;
    }

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "()V")
    public class92() {
        super(1, false);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(BII)I")
    public static final int method539(byte arg0, int arg1, int arg2) {
        ++field1725;
        int var3 = class184.method1217(true, arg1 + -1, arg2 - 1) + class184.method1217(true, arg1 + -1, arg2 - -1) + class184.method1217(true, arg1 - -1, arg2 - 1) - -class184.method1217(true, arg1 + 1, arg2 - -1);
        int var4 = class184.method1217(true, arg1, arg2 + -1) - (-class184.method1217(true, arg1, arg2 - -1) - class184.method1217(true, arg1 + -1, arg2) + -class184.method1217(true, arg1 + 1, arg2));
        if (arg0 != 16) {
            return -3;
        } else {
            int var5 = class184.method1217(true, arg1, arg2);
            return var5 / 4 + (var3 / 16 - -(var4 / 8));
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lhg;ZLhg;)V")
    public static final void method540(class71 arg0, boolean arg1, class71 arg2) {
        if (class143.field2667 == null) {
            class143.field2667 = class189.method1250(8526, class104.field1907, class140.field2600, class43.field814);
        }
        ++field1728;
        if (class98.field1841 == null) {
            class98.field1841 = class16.method90(class13.field299, class43.field814, class104.field1907, 0);
        }
        if (class86.field1583 == null) {
            class86.field1583 = class16.method90(class27.field551, class43.field814, class104.field1907, 0);
        }
        if (class49.field877 == null) {
            class49.field877 = class16.method90(class201.field3926, class43.field814, class104.field1907, 0);
        }
        if (!arg1) {
            field1727 = null;
        }
        class130.method850(0, 23, 765, 480, 0);
        class130.method854(0, 0, 125, 23, 12425273, 9135624);
        class130.method854(125, 0, 640, 23, 5197647, 2697513);
        arg2.method717(class195.field3820, 62, 15, 0, -1);
        if (class49.field877 != null) {
            class49.field877[1].method370(140, 1);
            arg0.method718(class4.field90, 152, 10, 16777215, -1);
            class49.field877[0].method370(140, 12);
            arg0.method718(class149.field2747, 152, 21, 16777215, -1);
        }
        if (class86.field1583 != null) {
            short var3 = 280;
            if (~class122.field2250[0] == -1 && ~class115.field2090[0] == -1) {
                class86.field1583[2].method370(var3, 4);
            } else {
                class86.field1583[0].method370(var3, 4);
            }
            short var4 = 390;
            if (~class122.field2250[0] == -1 && ~class115.field2090[0] == -2) {
                class86.field1583[3].method370(var3 - -15, 4);
            } else {
                class86.field1583[1].method370(var3 + 15, 4);
            }
            short var5 = 500;
            arg2.method718(class189.field3713, var3 + 32, 17, 16777215, -1);
            if (class122.field2250[0] == 1 && class115.field2090[0] == 0) {
                class86.field1583[2].method370(var4, 4);
            } else {
                class86.field1583[0].method370(var4, 4);
            }
            if (class122.field2250[0] == 1 && ~class115.field2090[0] == -2) {
                class86.field1583[3].method370(var4 + 15, 4);
            } else {
                class86.field1583[1].method370(var4 - -15, 4);
            }
            arg2.method718(class70.field1314, var4 + 32, 17, 16777215, -1);
            if (~class122.field2250[0] == -3 && class115.field2090[0] == 0) {
                class86.field1583[2].method370(var5, 4);
            } else {
                class86.field1583[0].method370(var5, 4);
            }
            if (~class122.field2250[0] == -3 && ~class115.field2090[0] == -2) {
                class86.field1583[3].method370(var5 - -15, 4);
            } else {
                class86.field1583[1].method370(var5 + 15, 4);
            }
            short var6 = 610;
            arg2.method718(class202.field3966, var5 + 32, 17, 16777215, -1);
            if (~class122.field2250[0] == -4 && ~class115.field2090[0] == -1) {
                class86.field1583[2].method370(var6, 4);
            } else {
                class86.field1583[0].method370(var6, 4);
            }
            if (~class122.field2250[0] == -4 && ~class115.field2090[0] == -2) {
                class86.field1583[3].method370(var6 + 15, 4);
            } else {
                class86.field1583[1].method370(var6 + 15, 4);
            }
            arg2.method718(class90.field1638, var6 + 32, 17, 16777215, -1);
        }
        class130.method850(708, 4, 50, 16, 0);
        arg0.method717(class206.field4035, 733, 16, 16777215, -1);
        class169.field3265 = -1;
        if (class143.field2667 != null) {
            byte var7 = 88;
            int var8 = 765 / (var7 + 1);
            byte var9 = 19;
            int var10 = 480 / (var9 - -1);
            int var11;
            int var12;
            do {
                var11 = var10;
                var12 = var8;
                if (~class65.field1219 >= ~((var8 + -1) * var10)) {
                    --var8;
                }
                if ((var10 + -1) * var8 >= class65.field1219) {
                    --var10;
                }
                if (class65.field1219 <= (var10 - 1) * var8) {
                    --var10;
                }
            } while (~var10 != ~var11 || var8 != var12);
            int var13 = (765 - var7 * var8) / (var8 + 1);
            int var14 = (-(var9 * var10) + 480) / (var10 + 1);
            if (~var13 < -6) {
                var13 = 5;
            }
            if (~var14 < -6) {
                var14 = 5;
            }
            int var15 = (-(var7 * var8) + 765 - (var8 + -1) * var13) / 2;
            int var16 = (-((var10 + -1) * var14) + 480 + -(var9 * var10)) / 2;
            int var17 = var16 + 23;
            int var18 = var15;
            int var19 = 0;
            for (int var20 = 0; ~class65.field1219 < ~var20; ++var20) {
                class187 var21 = class159.field3038[var20];
                boolean var22 = true;
                class169 var23 = class2.method18((byte) -62, var21.field3631);
                if (var21.field3631 == -1) {
                    var23 = class152.field2932;
                    var22 = false;
                } else if (var21.field3631 > 1980) {
                    var23 = class183.field3561;
                    var22 = false;
                }
                if (~class22.field459 <= ~var18 && class150.field2806 >= var17 && class22.field459 < var7 + var18 && class150.field2806 < var9 + var17 && var22) {
                    class169.field3265 = var20;
                    class143.field2667[!var21.field3638 ? 0 : 1].method118(var18, var17, 128, 16777215);
                } else {
                    class143.field2667[var21.field3638 ? 1 : 0].method111(var18, var17);
                }
                if (class98.field1841 != null) {
                    class98.field1841[var21.field3633 + (var21.field3638 ? 8 : 0)].method370(var18 + 29, var17);
                }
                arg2.method717(class2.method18((byte) -62, var21.field3637), var18 - -15, var9 / 2 + var17 + 5, 0, -1);
                arg0.method717(var23, var18 + 60, var9 / 2 + 5 + var17, 268435455, -1);
                var17 += var14 - -var9;
                ++var19;
                if (~var19 <= ~var10) {
                    var18 += var7 + var13;
                    var17 = var16 + 23;
                    var19 = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IB)[I")
    public final int[] method16(int arg0, byte arg1) {
        ++field1730;
        if (arg1 != 19) {
            return null;
        } else {
            int[] var3 = super.field1192.method19((byte) 124, arg0);
            if (super.field1192.field75) {
                int[] var4 = this.method394(20331, 0, this.field1726 ? -arg0 + class89.field1616 : arg0);
                if (this.field1731) {
                    for (int var5 = 0; ~var5 > ~class147.field2715; ++var5) {
                        var3[var5] = var4[-var5 + class8.field217];
                    }
                } else {
                    class97.method583(var4, 0, var3, 0, class147.field2715);
                }
            }
            return var3;
        }
    }
}
