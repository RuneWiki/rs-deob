import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class25 extends class39 {

    @OriginalMember(owner = "client!e", name = "Tb", descriptor = "[I")
    public static int[] field611 = new int[32768];

    @OriginalMember(owner = "client!e", name = "Xb", descriptor = "Lad;")
    public static class5 field615 = class88.method674("Chat panel redrawn", 98);

    @OriginalMember(owner = "client!e", name = "ec", descriptor = "I")
    public static int field622 = 0;

    @OriginalMember(owner = "client!e", name = "dc", descriptor = "J")
    public static long field621 = 0L;

    @OriginalMember(owner = "client!e", name = "kc", descriptor = "Lad;")
    public static class5 field628 = class88.method674("mapdots", -128);

    @OriginalMember(owner = "client!e", name = "lc", descriptor = "Lad;")
    private static class5 field629 = class88.method674("(X100(U(Y", 17);

    @OriginalMember(owner = "client!e", name = "pc", descriptor = "I")
    public static int field633 = 5063219;

    @OriginalMember(owner = "client!e", name = "Ub", descriptor = "I")
    public static int field612;

    @OriginalMember(owner = "client!e", name = "Vb", descriptor = "I")
    public static int field613;

    @OriginalMember(owner = "client!e", name = "Wb", descriptor = "I")
    private int field614;

    @OriginalMember(owner = "client!e", name = "Yb", descriptor = "I")
    public static int field616;

    @OriginalMember(owner = "client!e", name = "Zb", descriptor = "I")
    public static int field617;

    @OriginalMember(owner = "client!e", name = "ac", descriptor = "I")
    public static int field618;

    @OriginalMember(owner = "client!e", name = "bc", descriptor = "I")
    public static int field619;

    @OriginalMember(owner = "client!e", name = "cc", descriptor = "I")
    public static int field620;

    @OriginalMember(owner = "client!e", name = "fc", descriptor = "I")
    public static int field623;

    @OriginalMember(owner = "client!e", name = "gc", descriptor = "I")
    public static int field624;

    @OriginalMember(owner = "client!e", name = "hc", descriptor = "I")
    public static int field625;

    @OriginalMember(owner = "client!e", name = "mc", descriptor = "I")
    public static int field630;

    @OriginalMember(owner = "client!e", name = "oc", descriptor = "I")
    public static int field632;

    @OriginalMember(owner = "client!e", name = "qc", descriptor = "I")
    public static int field634;

    @OriginalMember(owner = "client!e", name = "rc", descriptor = "I")
    public static int field635;

    @OriginalMember(owner = "client!e", name = "ic", descriptor = "Lrd;")
    public static class106 field626;

    @OriginalMember(owner = "client!e", name = "nc", descriptor = "Laa;")
    public static class2 field631;

    @OriginalMember(owner = "client!e", name = "jc", descriptor = "Lfd;")
    private class35 field627;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Lrd;BLrd;Lrd;)V", line = 18)
    public static final void method205(class106 arg0, byte arg1, class106 arg2, class106 arg3) {
        ++field620;
        class12.field369 = arg2;
        class6.field237 = arg0;
        class77.field1817 = arg3;
        class121.field3013 = new class105[class6.field237.method867(true)][];
        class34.field865 = new boolean[class6.field237.method867(true)];
        if (arg1 < 56) {
            field621 = -70L;
        }
    }

    @OriginalMember(owner = "client!e", name = "l", descriptor = "(II)I", line = 36)
    public final int method206(int arg0, int arg1) {
        ++field618;
        return arg0 != 8 ? 49 : arg1 * 8 - this.field614;
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(BI)I", line = 50)
    public final int method207(byte arg0, int arg1) {
        int var3 = -(this.field614 & 7) + 8;
        ++field617;
        int var4 = 0;
        int var5 = this.field614 >> 3;
        this.field614 += arg1;
        while (~var3 > ~arg1) {
            var4 += (super.field974[var5++] & class80.field1894[var3]) << -var3 + arg1;
            arg1 -= var3;
            var3 = 8;
        }
        if (arg0 != 80) {
            return 28;
        } else {
            int var6;
            if (~arg1 != ~var3) {
                var6 = (super.field974[var5] >> -arg1 + var3 & class80.field1894[arg1]) + var4;
            } else {
                var6 = (class80.field1894[var3] & super.field974[var5]) + var4;
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "([IB)V", line = 80)
    public final void method208(int[] arg0, byte arg1) {
        ++field630;
        int var3 = 16 % ((arg1 - -56) / 59);
        this.field627 = new class35(arg0);
    }

    @OriginalMember(owner = "client!e", name = "m", descriptor = "(II)V", line = 91)
    public final void method209(int arg0, int arg1) {
        if (arg1 != 10) {
            method216((byte) 2);
        }
        ++field612;
        super.field974[super.field957++] = (byte) (this.field627.method274(true) + arg0);
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(ILab;I)V", line = 102)
    public static final void method210(int arg0, class3 arg1, int arg2) {
        if (arg1.field112 < 128 || ~arg1.field120 > -129 || ~arg1.field112 <= -13185 || arg1.field120 >= 13184) {
            arg1.field103 = -1;
            arg1.field85 = -1;
            arg1.field65 = 0;
            arg1.field102 = 0;
            arg1.field112 = arg1.field89[0] * 128 - -(arg1.field84 * 64);
            arg1.field120 = arg1.field49[0] * 128 + arg1.field84 * 64;
            arg1.method20(-1);
        }
        if (arg0 == -28943) {
            if (class82.field1932 == arg1 && (~arg1.field112 > -1537 || arg1.field120 < 1536 || ~arg1.field112 <= -11777 || ~arg1.field120 <= -11777)) {
                arg1.field65 = 0;
                arg1.field85 = -1;
                arg1.field102 = 0;
                arg1.field103 = -1;
                arg1.field112 = arg1.field89[0] * 128 + arg1.field84 * 64;
                arg1.field120 = arg1.field49[0] * 128 + arg1.field84 * 64;
                arg1.method20(-1);
            }
            if (arg1.field102 > class69.field1636) {
                class99.method793((byte) -105, arg1);
            } else if (~arg1.field65 > ~class69.field1636) {
                class53.method439(arg1, true);
            } else {
                class18.method144(arg1, arg0 + 41161);
            }
            class4.method31(arg1, 2048);
            ++field632;
            class86.method652(arg1, false);
        }
    }

    @OriginalMember(owner = "client!e", name = "<init>", descriptor = "(I)V", line = 152)
    public class25(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!e", name = "l", descriptor = "(B)V", line = 156)
    public static final void method211(byte arg0) {
        ++field624;
        try {
            if (arg0 > -79) {
                field611 = null;
            }
            Graphics var1 = class9.field305.getGraphics();
            class86.field1993.method253(357, var1, false, 17);
        } catch (Exception var2) {
            class9.field305.repaint();
        }
    }

    @OriginalMember(owner = "client!e", name = "d", descriptor = "(Z)V", line = 188)
    public final void method212(boolean arg0) {
        if (!arg0) {
            this.method209(55, 119);
        }
        ++field613;
        super.field957 = (this.field614 + 7) / 8;
    }

    @OriginalMember(owner = "client!e", name = "r", descriptor = "(I)V", line = 212)
    public final void method213(int arg0) {
        this.field614 = super.field957 * arg0;
        ++field634;
    }

    @OriginalMember(owner = "client!e", name = "s", descriptor = "(I)V", line = 235)
    public static void method214(int arg0) {
        field611 = null;
        field615 = null;
        field631 = null;
        field626 = null;
        field628 = null;
        if (arg0 >= -84) {
            method216((byte) -89);
        }
        field629 = null;
    }

    @OriginalMember(owner = "client!e", name = "e", descriptor = "(Z)I", line = 256)
    public final int method215(boolean arg0) {
        ++field619;
        if (!arg0) {
            this.method209(-74, -90);
        }
        return 255 & super.field974[super.field957++] - this.field627.method274(arg0);
    }

    @OriginalMember(owner = "client!e", name = "m", descriptor = "(B)V", line = 272)
    public static final void method216(byte arg0) {
        ++field635;
        boolean var1 = true;
        class88.method675(false, false);
        class82.field1930 = 0;
        for (int var2 = 0; ~class36.field917.length < ~var2; ++var2) {
            if (class78.field1831[var2] != -1 && class36.field917[var2] == null) {
                class36.field917[var2] = class20.field527.method857(class40.method347(arg0, 30504), class78.field1831[var2], 0);
                if (class36.field917[var2] == null) {
                    ++class82.field1930;
                    var1 = false;
                }
            }
            if (~class52.field1311[var2] != 0 && class5.field212[var2] == null) {
                class5.field212[var2] = class20.field527.method850(0, class13.field390[var2], class52.field1311[var2], (byte) -124);
                if (class5.field212[var2] == null) {
                    var1 = false;
                    ++class82.field1930;
                }
            }
        }
        if (!var1) {
            class17.field443 = 1;
        } else {
            class89.field2099 = 0;
            boolean var3 = true;
            for (int var4 = 0; var4 < class36.field917.length; ++var4) {
                byte[] var56 = class5.field212[var4];
                if (var56 != null) {
                    int var57 = (class81.field1900[var4] >> 8) * 64 + -class47.field1235;
                    int var58 = (class81.field1900[var4] & 255) * 64 + -class106.field2659;
                    if (class19.field513) {
                        var58 = 10;
                        var57 = 10;
                    }
                    var3 &= class19.method159(var58, var56, var57, 9936);
                }
            }
            if (!var3) {
                class17.field443 = 2;
            } else {
                if (class17.field443 != 0) {
                    class73.method584(23370, true, class69.field1640, field629);
                }
                class7.method86(arg0 ^ -100);
                class42.field1065.method747();
                System.gc();
                for (int var5 = 0; ~var5 > -5; ++var5) {
                    class13.field387[var5].method469(81);
                }
                for (int var6 = 0; ~var6 > -5; ++var6) {
                    for (int var54 = 0; ~var54 > -105; ++var54) {
                        for (int var55 = 0; ~var55 > -105; ++var55) {
                            class12.field371[var6][var54][var55] = 0;
                        }
                    }
                }
                class100.method801((byte) 71);
                int var7 = class36.field917.length;
                class40.method345((byte) -10);
                class88.method675(true, false);
                if (!class19.field513) {
                    for (int var8 = 0; ~var7 < ~var8; ++var8) {
                        int var17 = (class81.field1900[var8] >> 8) * 64 - class47.field1235;
                        byte[] var18 = class36.field917[var8];
                        int var19 = (class81.field1900[var8] & 255) * 64 + -class106.field2659;
                        if (var18 != null) {
                            client.method151(5, var17, (class105.field2634 - 6) * 8, class13.field387, var18, var19, class105.field2595 * 8 - 48);
                        }
                    }
                    for (int var9 = 0; ~var9 > ~var7; ++var9) {
                        int var14 = (class81.field1900[var9] >> 8) * 64 + -class47.field1235;
                        int var15 = (class81.field1900[var9] & 255) * 64 + -class106.field2659;
                        byte[] var16 = class36.field917[var9];
                        if (var16 == null && class105.field2634 < 800) {
                            class106.method868(64, 104, var15, var14, 64);
                        }
                    }
                    class88.method675(true, false);
                    for (int var10 = 0; var10 < var7; ++var10) {
                        byte[] var11 = class5.field212[var10];
                        if (var11 != null) {
                            int var12 = (255 & class81.field1900[var10]) * 64 + -class106.field2659;
                            int var13 = (class81.field1900[var10] >> 8) * 64 + -class47.field1235;
                            class73.method583(var11, var13, 59, class42.field1065, class13.field387, var12);
                        }
                    }
                }
                if (class19.field513) {
                    for (int var20 = 0; var20 < 4; ++var20) {
                        for (int var34 = 0; var34 < 13; ++var34) {
                            for (int var35 = 0; ~var35 > -14; ++var35) {
                                boolean var36 = false;
                                int var37 = class99.field2391[var20][var34][var35];
                                if (~var37 != 0) {
                                    int var38 = (59816170 & var37) >> 24;
                                    int var39 = var37 >> 1 & 3;
                                    int var40 = var37 >> 14 & 1023;
                                    int var41 = (16377 & var37) >> 3;
                                    int var42 = (var40 / 8 << 8) + var41 / 8;
                                    for (int var43 = 0; var43 < class81.field1900.length; ++var43) {
                                        if (~class81.field1900[var43] == ~var42 && class36.field917[var43] != null) {
                                            class8.method93((var41 & 7) * 8, var38, var35 * 8, (byte) -101, class36.field917[var43], var20, var39, var34 * 8, class13.field387, (var40 & 7) * 8);
                                            var36 = true;
                                            break;
                                        }
                                    }
                                }
                                if (!var36) {
                                    class20.method162(var35 * 8, (byte) -126, var34 * 8, var20);
                                }
                            }
                        }
                    }
                    for (int var21 = 0; var21 < 13; ++var21) {
                        for (int var32 = 0; ~var32 > -14; ++var32) {
                            int var33 = class99.field2391[0][var21][var32];
                            if (var33 == -1) {
                                class106.method868(8, arg0 ^ 52, var32 * 8, var21 * 8, 8);
                            }
                        }
                    }
                    class88.method675(true, false);
                    for (int var22 = 0; var22 < 4; ++var22) {
                        for (int var23 = 0; ~var23 > -14; ++var23) {
                            for (int var24 = 0; ~var24 > -14; ++var24) {
                                int var25 = class99.field2391[var22][var23][var24];
                                if (var25 != -1) {
                                    int var26 = (50861580 & var25) >> 24;
                                    int var27 = (7 & var25) >> 1;
                                    int var28 = var25 >> 14 & 1023;
                                    int var29 = var25 >> 3 & 2047;
                                    int var30 = (var28 / 8 << 8) - -(var29 / 8);
                                    for (int var31 = 0; ~var31 > ~class81.field1900.length; ++var31) {
                                        if (class81.field1900[var31] == var30 && class5.field212[var31] != null) {
                                            class9.method97(var23 * 8, var27, (7 & var29) * 8, var26, class13.field387, class42.field1065, (7 & var28) * 8, var22, var24 * 8, 125, class5.field212[var31]);
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                class88.method675(true, false);
                class7.method86(-64);
                class16.method130(255, class13.field387, class42.field1065);
                class88.method675(true, false);
                int var44 = class52.field1309;
                if (var44 > class54.field1344) {
                    var44 = class54.field1344;
                }
                if (class54.field1344 + -1 > var44) {
                    int var45 = class54.field1344 + -1;
                }
                if (!class40.field1048) {
                    class42.field1065.method769(0);
                } else {
                    class42.field1065.method769(class52.field1309);
                }
                for (int var46 = 0; var46 < 104; ++var46) {
                    for (int var53 = 0; var53 < 104; ++var53) {
                        class43.method360(var46, var53, 118);
                    }
                }
                class88.method672((byte) -128);
                class118.field2914.method101((byte) -125);
                if (class80.field1882 != null) {
                    ++class83.field1958;
                    class5.field163.method209(11, arg0 ^ 86);
                    class5.field163.method308(1057001181, (byte) 77);
                }
                if (arg0 != 92) {
                    method205((class106) null, (byte) 86, (class106) null, (class106) null);
                }
                if (!class19.field513) {
                    int var47 = (class105.field2595 - 6) / 8;
                    int var48 = (class105.field2634 + -6) / 8;
                    int var49 = (class105.field2595 + 6) / 8;
                    int var50 = (class105.field2634 + 6) / 8;
                    for (int var51 = var47 + -1; ~var51 >= ~(var49 + 1); ++var51) {
                        for (int var52 = var48 - 1; ~var52 >= ~(var50 - -1); ++var52) {
                            if (~var47 < ~var51 || ~var51 < ~var49 || var52 < var48 || var50 < var52) {
                                class20.field527.method845(class69.method546(true, new class5[] { class91.field2174, class106.method864(18413, var51), class19.field508, class106.method864(arg0 + 18321, var52) }), false);
                                class20.field527.method845(class69.method546(true, new class5[] { class92.field2197, class106.method864(18413, var51), class19.field508, class106.method864(18413, var52) }), false);
                            }
                        }
                    }
                }
                if (~class69.field1626 == 0) {
                    class69.method541(30, -126);
                } else {
                    class69.method541(35, arg0 ^ 116);
                }
                class48.method417(3600);
                class5.field163.method209(194, arg0 ^ 86);
                class17.method139(arg0 ^ -358);
            }
        }
    }
}
