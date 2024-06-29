import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class114 extends class243 {

    @OriginalMember(owner = "client!ri", name = "gb", descriptor = "S")
    public static short field2099 = 205;

    @OriginalMember(owner = "client!ri", name = "Y", descriptor = "I")
    public static int field2091;

    @OriginalMember(owner = "client!ri", name = "Z", descriptor = "I")
    public static int field2092;

    @OriginalMember(owner = "client!ri", name = "ab", descriptor = "I")
    public static int field2093;

    @OriginalMember(owner = "client!ri", name = "bb", descriptor = "I")
    public static int field2094;

    @OriginalMember(owner = "client!ri", name = "db", descriptor = "I")
    public static int field2096;

    @OriginalMember(owner = "client!ri", name = "eb", descriptor = "I")
    public static int field2097;

    @OriginalMember(owner = "client!ri", name = "fb", descriptor = "I")
    public static int field2098;

    @OriginalMember(owner = "client!ri", name = "hb", descriptor = "I")
    public static int field2100;

    @OriginalMember(owner = "client!ri", name = "ib", descriptor = "I")
    public static int field2101;

    @OriginalMember(owner = "client!ri", name = "jb", descriptor = "I")
    public static int field2102;

    @OriginalMember(owner = "client!ri", name = "cb", descriptor = "Lwa;")
    public static class135 field2095;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(II)[[I")
    public final int[][] method80(int arg0, int arg1) {
        ++field2097;
        int[][] var3 = super.field4213.method1406(arg1, arg0 + -230);
        if (arg0 != 230) {
            return null;
        } else {
            if (super.field4213.field3771) {
                int[][] var4 = this.method1616(-1, arg1, 0);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; ~class212.field3586 < ~var11; ++var11) {
                    var8[var11] = 4096 - var5[var11];
                    var9[var11] = -var6[var11] + 4096;
                    var10[var11] = -var7[var11] + 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(ILub;Z)V")
    public static final void method720(int arg0, class227 arg1, boolean arg2) {
        class227 var3 = arg1.method1504(0).method1527(-96);
        ++field2101;
        boolean var4 = false;
        if (!arg2) {
            field2099 = -3;
        }
        for (int var5 = 0; class146.field2512 > var5; ++var5) {
            class225 var6 = class27.field446[class15.field278[var5]];
            if (var6 != null && var6.field3819 != null && var6.field3819.method1522(var3, (byte) -56)) {
                var4 = true;
                class117.method736(122, 1, 0, var6.field78[0], class216.field3639.field49[0], class216.field3639.field78[0], 0, 0, var6.field49[0], 2, false, 1);
                if (arg0 != 1) {
                    if (arg0 == 4) {
                        ++class44.field729;
                        class176.field2935.method664((byte) -127, 191);
                        class176.field2935.method1449(class15.field278[var5], (byte) 109);
                    } else if (arg0 != 6) {
                        if (arg0 == 7) {
                            class176.field2935.method664((byte) -104, 255);
                            ++class122.field2196;
                            class176.field2935.method1468(class15.field278[var5], 0);
                        }
                    } else {
                        class176.field2935.method664((byte) -110, 203);
                        class176.field2935.method1468(class15.field278[var5], 0);
                        ++class145.field2491;
                    }
                } else {
                    ++class31.field497;
                    class176.field2935.method664((byte) 64, 252);
                    class176.field2935.method1451(class15.field278[var5], (byte) -124);
                }
                break;
            }
        }
        if (!var4) {
            class130.method799(1403, 0, class91.field1558, class76.method445((byte) 124, new class227[] { class91.field1555, var3 }));
        }
    }

    @OriginalMember(owner = "client!ri", name = "<init>", descriptor = "()V")
    public class114() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ri", name = "g", descriptor = "(I)V")
    public static final void method721(int arg0) {
        ++field2091;
        if (class4.field91 != class36.field592) {
            class208.field3538 += class4.field91;
            class4.field91 = class36.field592;
            class208.field3538 -= class36.field592;
            if (class116.field2131 != -1) {
                class12.method59(true, (byte) 112);
            }
        }
        if (arg0 >= 55) {
            if (class97.field1706 != null) {
                class97.field1706.hide();
            }
            class53.method309(class172.field2875, -103);
            class146.method923(class172.field2875, -63);
            if (class19.field323 != null) {
                class19.field323.method891(-23225, class172.field2875);
            }
            class2.method6(98);
            class116.method734((byte) -121, class172.field2875);
            class64.method406(class172.field2875, -84);
            if (class19.field323 != null) {
                class19.field323.method890((byte) 118, class172.field2875);
            }
        }
    }

    @OriginalMember(owner = "client!ri", name = "h", descriptor = "(I)V")
    public static final void method722(int arg0) {
        for (class182 var1 = (class182) class58.field1070.method1299((byte) -60); var1 != null; var1 = (class182) class58.field1070.method1295((byte) 31)) {
            int var2 = var1.field3106;
            if (class195.method1234(var2, (byte) -36)) {
                class105[] var3 = class102.field1792[var2];
                boolean var4 = true;
                for (int var5 = 0; ~var3.length < ~var5; ++var5) {
                    if (var3[var5] != null) {
                        var4 = var3[var5].field1853;
                        break;
                    }
                }
                if (!var4) {
                    int var6 = (int) var1.field1113;
                    class105 var7 = class27.method137(var6, -954490064);
                    if (var7 != null) {
                        class198.method1268(arg0 + 99, var7);
                    }
                }
            }
        }
        ++field2100;
        if (arg0 != 0) {
            method721(-90);
        }
    }

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "(B)V")
    public static final void method723(byte arg0) {
        int var1 = -47 % ((arg0 - -40) / 47);
        ++field2098;
        class168.field2806.method1728(true);
    }

    @OriginalMember(owner = "client!ri", name = "e", descriptor = "(B)V")
    public static final void method724(byte arg0) {
        class168.method1034(30, false);
        boolean var1 = true;
        ++field2094;
        class88.field1533 = 0;
        for (int var2 = 0; ~class38.field638.length < ~var2; ++var2) {
            if (~class45.field800[var2] != 0 && class38.field638[var2] == null) {
                class38.field638[var2] = class232.field4042.method884(0, -72, class45.field800[var2]);
                if (class38.field638[var2] == null) {
                    var1 = false;
                    ++class88.field1533;
                }
            }
            if (class199.field3420[var2] != -1 && class251.field4343[var2] == null) {
                class251.field4343[var2] = class232.field4042.method872(class199.field3420[var2], 0, -2, class198.field3399[var2]);
                if (class251.field4343[var2] == null) {
                    var1 = false;
                    ++class88.field1533;
                }
            }
            if (class167.field2793 != null && class21.field381[var2] == null && class167.field2793[var2] != -1) {
                class21.field381[var2] = class232.field4042.method872(class167.field2793[var2], 0, -2, class198.field3399[var2]);
                if (class21.field381[var2] == null) {
                    var1 = false;
                    ++class88.field1533;
                }
            }
        }
        if (!var1) {
            class108.field2011 = 1;
        } else {
            class211.field3569 = 0;
            boolean var3 = true;
            for (int var4 = 0; class38.field638.length > var4; ++var4) {
                byte[] var20 = class251.field4343[var4];
                if (var20 != null) {
                    int var21 = (255 & class177.field2976[var4]) * 64 + -class78.field1367;
                    int var22 = (class177.field2976[var4] >> 8) * 64 + -class192.field3267;
                    if (class83.field1454) {
                        var21 = 10;
                        var22 = 10;
                    }
                    var3 &= class67.method416(var22, false, var20, var21);
                }
            }
            if (!var3) {
                class108.field2011 = 2;
            } else {
                if (~class108.field2011 != -1) {
                    class215.method1367(true, class76.method445((byte) -117, new class227[] { class245.field4271, class105.field1970 }), (byte) -102);
                }
                method725((byte) -77);
                class211.method1343((byte) 102);
                class83.method508();
                for (int var5 = 0; ~var5 > -5; ++var5) {
                    class78.field1370[var5].method835(-35);
                }
                for (int var6 = 0; var6 < 4; ++var6) {
                    for (int var18 = 0; var18 < 104; ++var18) {
                        for (int var19 = 0; var19 < 104; ++var19) {
                            class40.field654[var6][var18][var19] = 0;
                        }
                    }
                }
                class212.method1352(false, (byte) -94);
                method725((byte) -38);
                System.gc();
                class168.method1034(30, true);
                class257.method1744(false, 104);
                if (!class83.field1454) {
                    class22.method110(false, (byte) 36);
                    class168.method1034(30, true);
                    class134.method821(false, false);
                    if (class21.field381 != null) {
                        class193.method1225(-636686418);
                    }
                }
                if (class83.field1454) {
                    class156.method978((byte) 119, false);
                    class168.method1034(30, true);
                    class109.method676((byte) -56, false);
                }
                class211.method1343((byte) 102);
                int var7 = 125 % ((-32 - arg0) / 34);
                class168.method1034(30, true);
                class76.method452(class78.field1370, false, (byte) 103);
                class168.method1034(30, true);
                int var8 = class119.field2177;
                if (~var8 < ~class64.field1171) {
                    var8 = class64.field1171;
                }
                if (~(class64.field1171 + -1) < ~var8) {
                    int var9 = class64.field1171 + -1;
                }
                if (class34.method178(true)) {
                    class191.method1210(0);
                } else {
                    class191.method1210(class119.field2177);
                }
                class182.method1161((byte) 121);
                for (int var10 = 0; var10 < 104; ++var10) {
                    for (int var17 = 0; var17 < 104; ++var17) {
                        class241.method1609(var10, var17, 64);
                    }
                }
                method725((byte) -61);
                class148.method938(0);
                class211.method1343((byte) 102);
                if (class130.field2272 != null && class9.field172 != null && class184.field3139 == 25) {
                    class176.field2935.method664((byte) 50, 236);
                    ++class225.field3833;
                    class176.field2935.method1427(1057001181, (byte) -112);
                }
                if (!class83.field1454) {
                    int var11 = (class241.field4189 + 6) / 8;
                    int var12 = (class241.field4189 - 6) / 8;
                    int var13 = (class148.field2581 + -6) / 8;
                    int var14 = (class148.field2581 - -6) / 8;
                    for (int var15 = var12 + -1; ~(var11 - -1) <= ~var15; ++var15) {
                        for (int var16 = var13 + -1; ~(var14 + 1) <= ~var16; ++var16) {
                            if (~var15 > ~var12 || ~var11 > ~var15 || ~var13 < ~var16 || var16 > var14) {
                                class232.field4042.method874(20481, class76.method445((byte) 64, new class227[] { class53.field927, class204.method1303(var15, 1), class226.field3858, class204.method1303(var16, 1) }));
                                class232.field4042.method874(20481, class76.method445((byte) -127, new class227[] { class10.field181, class204.method1303(var15, 1), class226.field3858, class204.method1303(var16, 1) }));
                            }
                        }
                    }
                }
                if (class184.field3139 == 28) {
                    class12.method60(10, -40);
                } else {
                    class12.method60(30, -119);
                    if (class9.field172 != null) {
                        class176.field2935.method664((byte) -118, 190);
                    }
                }
                method725((byte) -126);
                class41.method224(-114);
            }
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lnj;ZI)V")
    public final void method81(class226 arg0, boolean arg1, int arg2) {
        if (~arg2 == -1) {
            super.field4230 = arg0.method1471(255) == 1;
        }
        ++field2092;
        if (arg1) {
            this.method77(27, 110);
        }
    }

    @OriginalMember(owner = "client!ri", name = "f", descriptor = "(B)V")
    public static final void method725(byte arg0) {
        ++field2102;
        if (class124.field2229 != null) {
            class124.field2229.method1321(true);
        }
        if (arg0 <= -35) {
            if (class77.field1360 != null) {
                class77.field1360.method1321(true);
            }
        }
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(II)[I")
    public final int[] method77(int arg0, int arg1) {
        int var3 = -21 / ((-15 - arg0) / 51);
        int[] var4 = super.field4215.method984(arg1, 0);
        if (super.field4215.field2707) {
            int[] var5 = this.method1614(0, arg1, 82);
            for (int var6 = 0; class212.field3586 > var6; ++var6) {
                var4[var6] = -var5[var6] + 4096;
            }
        }
        ++field2096;
        return var4;
    }

    @OriginalMember(owner = "client!ri", name = "i", descriptor = "(I)V")
    public static void method726(int arg0) {
        field2095 = null;
        if (arg0 != 190) {
            method723((byte) -119);
        }
    }
}
