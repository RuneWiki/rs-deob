import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class39 extends class88 {

    @OriginalMember(owner = "client!fc", name = "qb", descriptor = "Z")
    private boolean field861 = false;

    @OriginalMember(owner = "client!fc", name = "jb", descriptor = "Z")
    private volatile boolean field854 = false;

    @OriginalMember(owner = "client!fc", name = "Jb", descriptor = "I")
    private int field880 = -1;

    @OriginalMember(owner = "client!fc", name = "pb", descriptor = "I")
    private int field860;

    @OriginalMember(owner = "client!fc", name = "ib", descriptor = "Lcf;")
    private class21 field853;

    @OriginalMember(owner = "client!fc", name = "ob", descriptor = "Lcf;")
    private class21 field859;

    @OriginalMember(owner = "client!fc", name = "ub", descriptor = "Z")
    public static boolean field865 = false;

    @OriginalMember(owner = "client!fc", name = "rb", descriptor = "Lvc;")
    public static class137 field862 = class45.method325("und die Schaltfl-=che (WSpielkonto erstellen(W am", -46);

    @OriginalMember(owner = "client!fc", name = "xb", descriptor = "I")
    public static int field868 = 0;

    @OriginalMember(owner = "client!fc", name = "mb", descriptor = "I")
    public static int field857 = -1;

    @OriginalMember(owner = "client!fc", name = "vb", descriptor = "Lvc;")
    public static class137 field866 = class45.method325("Verbindung abgebrochen)3", -46);

    @OriginalMember(owner = "client!fc", name = "Cb", descriptor = "I")
    public static int field873 = 0;

    @OriginalMember(owner = "client!fc", name = "Gb", descriptor = "Z")
    public static boolean field877 = false;

    @OriginalMember(owner = "client!fc", name = "Ib", descriptor = "Lvc;")
    public static class137 field879 = class45.method325("backright1", -46);

    @OriginalMember(owner = "client!fc", name = "fb", descriptor = "I")
    public static int field850;

    @OriginalMember(owner = "client!fc", name = "hb", descriptor = "I")
    public static int field852;

    @OriginalMember(owner = "client!fc", name = "kb", descriptor = "I")
    public static int field855;

    @OriginalMember(owner = "client!fc", name = "lb", descriptor = "I")
    public static int field856;

    @OriginalMember(owner = "client!fc", name = "nb", descriptor = "I")
    public static int field858;

    @OriginalMember(owner = "client!fc", name = "sb", descriptor = "I")
    private int field863;

    @OriginalMember(owner = "client!fc", name = "wb", descriptor = "I")
    public static int field867;

    @OriginalMember(owner = "client!fc", name = "yb", descriptor = "I")
    public static int field869;

    @OriginalMember(owner = "client!fc", name = "zb", descriptor = "I")
    public static int field870;

    @OriginalMember(owner = "client!fc", name = "Ab", descriptor = "I")
    public static int field871;

    @OriginalMember(owner = "client!fc", name = "Bb", descriptor = "I")
    public static int field872;

    @OriginalMember(owner = "client!fc", name = "Db", descriptor = "I")
    public static int field874;

    @OriginalMember(owner = "client!fc", name = "Eb", descriptor = "I")
    public static int field875;

    @OriginalMember(owner = "client!fc", name = "Fb", descriptor = "I")
    public static int field876;

    @OriginalMember(owner = "client!fc", name = "Hb", descriptor = "I")
    public static int field878;

    @OriginalMember(owner = "client!fc", name = "Kb", descriptor = "I")
    public static int field881;

    @OriginalMember(owner = "client!fc", name = "Lb", descriptor = "I")
    public static int field882;

    @OriginalMember(owner = "client!fc", name = "tb", descriptor = "Lnb;")
    public static class88 field864;

    @OriginalMember(owner = "client!fc", name = "gb", descriptor = "[Z")
    private volatile boolean[] field851;

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(Z)V")
    private final void method275(boolean arg0) {
        ++field856;
        this.field851 = new boolean[super.field2110.length];
        if (!arg0) {
            for (int var2 = 0; var2 < this.field851.length; ++var2) {
                this.field851[var2] = false;
            }
            if (this.field859 == null) {
                this.field854 = true;
            } else {
                this.field880 = -1;
                for (int var3 = 0; ~this.field851.length < ~var3; ++var3) {
                    if (super.field2096[var3] > 0) {
                        class24.method210(this.field859, this, 8956, var3);
                        this.field880 = var3;
                    }
                }
                if (~this.field880 == 0) {
                    this.field854 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "(I)V")
    public static final void method276(int arg0) {
        ++field874;
        int var1 = 59 / ((arg0 - 23) / 61);
        while (true) {
            label314: do {
                while (class30.method233(false)) {
                    if (class56.field1201 != -1 && ~class56.field1201 == ~class141.field3327) {
                        if (~class13.field289 == -86 && class45.field1005.method997(126) > 0) {
                            class45.field1005 = class45.field1005.method1013(class45.field1005.method997(-51) - 1, 0, (byte) 70);
                        }
                        continue label314;
                    }
                    if (class69.field1462) {
                        if (~class13.field289 == -86 && class45.field1012.method997(-86) > 0) {
                            class45.field1012 = class45.field1012.method1013(class45.field1012.method997(-26) - 1, 0, (byte) 55);
                            class80.field1825 = true;
                        }
                        if (class84.method613(0, class107.field2497) && ~class45.field1012.method997(104) > -81) {
                            class45.field1012 = class45.field1012.method1004(-1, class107.field2497);
                            class80.field1825 = true;
                        }
                        if (class13.field289 == 84) {
                            class80.field1825 = true;
                            class69.field1462 = false;
                            if (class33.field703 == 1) {
                                long var2 = class45.field1012.method1030(65);
                                class37.method268((byte) -90, var2);
                            }
                            if (class33.field703 == 2 && class80.field1832 > 0) {
                                long var4 = class45.field1012.method1030(65);
                                class58.method397(89, var4);
                            }
                            if (~class33.field703 == -4 && class45.field1012.method997(-16) > 0) {
                                class72.field1527.method845(229, 100);
                                ++class6.field119;
                                class72.field1527.method837(66, 0);
                                int var6 = class72.field1527.field2583;
                                class72.field1527.method840(false, class105.field2443);
                                class4.method27(class45.field1012, -127, class72.field1527);
                                class72.field1527.method810(2057446968, class72.field1527.field2583 - var6);
                                if (~class71.field1510 == -3) {
                                    class116.field2762 = true;
                                    class71.field1510 = 1;
                                    class72.field1527.method845(13, 100);
                                    class72.field1527.method837(116, class21.field453);
                                    class72.field1527.method837(110, class71.field1510);
                                    ++class91.field2145;
                                    class72.field1527.method837(-107, class110.field2606);
                                }
                            }
                            if (class33.field703 == 4 && ~field868 > -101) {
                                long var7 = class45.field1012.method1030(65);
                                class92.method676((byte) 33, var7);
                            }
                            if (~class33.field703 == -6 && ~field868 < -1) {
                                long var9 = class45.field1012.method1030(65);
                                class124.method927(var9, -105);
                            }
                        }
                    } else if (~class92.field2185 == -2) {
                        if (class13.field289 == 85 && ~class45.field992.method997(120) < -1) {
                            class45.field992 = class45.field992.method1013(-1 + class45.field992.method997(-37), 0, (byte) 48);
                            class80.field1825 = true;
                        }
                        if (class107.method777((byte) 108, class107.field2497) && ~class45.field992.method997(108) > -11) {
                            class45.field992 = class45.field992.method1004(-1, class107.field2497);
                            class80.field1825 = true;
                        }
                        if (class13.field289 == 84) {
                            if (class45.field992.method997(3) > 0) {
                                int var11 = 0;
                                ++class142.field3355;
                                if (class45.field992.method1028(14247)) {
                                    var11 = class45.field992.method1021(48);
                                }
                                class72.field1527.method845(8, 100);
                                class72.field1527.method817(-2770, var11);
                            }
                            class80.field1825 = true;
                            class92.field2185 = 0;
                        }
                    } else if (~class92.field2185 != -3) {
                        if (class92.field2185 == 3) {
                            if (class13.field289 == 85 && class45.field992.method997(-19) > 0) {
                                class45.field992 = class45.field992.method1013(class45.field992.method997(4) - 1, 0, (byte) 28);
                                class80.field1825 = true;
                            }
                            if (class84.method613(0, class107.field2497) && class45.field992.method997(-85) < 40) {
                                class45.field992 = class45.field992.method1004(-1, class107.field2497);
                                class80.field1825 = true;
                            }
                        } else if (class92.field2185 == 4) {
                            if (~class13.field289 == -86 && class45.field992.method997(105) > 0) {
                                class45.field992 = class45.field992.method1013(-1 + class45.field992.method997(-109), 0, (byte) 120);
                                class80.field1825 = true;
                            }
                            if ((class84.method613(0, class107.field2497) || ~class107.field2497 == -33) && class45.field992.method997(113) < 80) {
                                class45.field992 = class45.field992.method1004(-1, class107.field2497);
                                class80.field1825 = true;
                            }
                            if (class13.field289 == 84) {
                                if (~class45.field992.method997(-22) < -1) {
                                    class72.field1527.method845(100, 100);
                                    class72.field1527.method837(120, 1 + class45.field992.method997(126));
                                    ++class36.field776;
                                    class72.field1527.method826(false, class45.field992);
                                }
                                class92.field2185 = 0;
                                class80.field1825 = true;
                            }
                        } else if (class73.field1543 == -1 && class80.field1777 == -1) {
                            if (class13.field289 == 85 && class45.field993.method997(116) > 0) {
                                class45.field993 = class45.field993.method1013(class45.field993.method997(-43) - 1, 0, (byte) 76);
                                class80.field1825 = true;
                            }
                            if (class84.method613(0, class107.field2497) && class45.field993.method997(104) < 80) {
                                class45.field993 = class45.field993.method1004(-1, class107.field2497);
                                class80.field1825 = true;
                            }
                            if (class13.field289 == 84 && class45.field993.method997(110) > 0) {
                                if (class12.field275 == 2) {
                                    if (class45.field993.method1026(-1, class109.field2564)) {
                                        System.gc();
                                    }
                                    if (class45.field993.method1026(-1, class105.field2457)) {
                                        class72.method500(64);
                                    }
                                    if (class45.field993.method1026(-1, class128.field3010)) {
                                        class106.field2458 = true;
                                    }
                                    if (class45.field993.method1026(-1, class61.field1314)) {
                                        class106.field2458 = false;
                                    }
                                    if (class45.field993.method1026(-1, class84.field1889)) {
                                        for (int var12 = 0; var12 < 4; ++var12) {
                                            for (int var13 = 1; var13 < 103; ++var13) {
                                                for (int var14 = 1; var14 < 103; ++var14) {
                                                    class131.field3046[var12].field1267[var13][var14] = 0;
                                                }
                                            }
                                        }
                                    }
                                    if (class45.field993.method1026(-1, class61.field1327) && class115.field2744 == 2) {
                                        throw new RuntimeException();
                                    }
                                    if (class45.field993.method1026(-1, class8.field194)) {
                                        class4.field103 = true;
                                    }
                                }
                                if (class45.field993.method1014(class110.field2616, (byte) 62)) {
                                    class72.field1527.method845(142, 100);
                                    ++class119.field2782;
                                    class72.field1527.method837(125, -1 + class45.field993.method997(-69));
                                    class72.field1527.method826(false, class45.field993.method1035(1, 2));
                                } else {
                                    byte var15 = 0;
                                    ++class69.field1435;
                                    class137 var16 = class45.field993.method1005((byte) 98);
                                    if (!var16.method1014(class119.field2777, (byte) 36)) {
                                        if (!var16.method1014(class103.field2403, (byte) 17)) {
                                            if (!var16.method1014(class22.field520, (byte) 28)) {
                                                if (var16.method1014(class91.field2148, (byte) 74)) {
                                                    var15 = 3;
                                                    class45.field993 = class45.field993.method1035(1, class91.field2148.method997(116));
                                                } else if (var16.method1014(class95.field2231, (byte) 60)) {
                                                    var15 = 4;
                                                    class45.field993 = class45.field993.method1035(1, class95.field2231.method997(-42));
                                                } else if (var16.method1014(class7.field159, (byte) 33)) {
                                                    var15 = 5;
                                                    class45.field993 = class45.field993.method1035(1, class7.field159.method997(-117));
                                                } else if (var16.method1014(class70.field1488, (byte) 47)) {
                                                    class45.field993 = class45.field993.method1035(1, class70.field1488.method997(-43));
                                                    var15 = 6;
                                                } else if (!var16.method1014(class92.field2177, (byte) 28)) {
                                                    if (var16.method1014(class60.field1286, (byte) 35)) {
                                                        class45.field993 = class45.field993.method1035(1, class60.field1286.method997(111));
                                                        var15 = 8;
                                                    } else if (!var16.method1014(class30.field667, (byte) 107)) {
                                                        if (!var16.method1014(class21.field427, (byte) 118)) {
                                                            if (var16.method1014(class141.field3337, (byte) 78)) {
                                                                var15 = 11;
                                                                class45.field993 = class45.field993.method1035(1, class141.field3337.method997(-29));
                                                            }
                                                        } else {
                                                            var15 = 10;
                                                            class45.field993 = class45.field993.method1035(1, class21.field427.method997(126));
                                                        }
                                                    } else {
                                                        var15 = 9;
                                                        class45.field993 = class45.field993.method1035(1, class30.field667.method997(104));
                                                    }
                                                } else {
                                                    class45.field993 = class45.field993.method1035(1, class92.field2177.method997(-33));
                                                    var15 = 7;
                                                }
                                            } else {
                                                class45.field993 = class45.field993.method1035(1, class22.field520.method997(-89));
                                                var15 = 2;
                                            }
                                        } else {
                                            var15 = 1;
                                            class45.field993 = class45.field993.method1035(1, class103.field2403.method997(127));
                                        }
                                    } else {
                                        var15 = 0;
                                        class45.field993 = class45.field993.method1035(1, class119.field2777.method997(-93));
                                    }
                                    class137 var17 = class45.field993.method1005((byte) 98);
                                    byte var18 = 0;
                                    if (!var17.method1014(class89.field2135, (byte) 36)) {
                                        if (!var17.method1014(class111.field2658, (byte) 48)) {
                                            if (!var17.method1014(class95.field2240, (byte) 98)) {
                                                if (var17.method1014(class30.field666, (byte) 104)) {
                                                    class45.field993 = class45.field993.method1035(1, class30.field666.method997(-7));
                                                    var18 = 4;
                                                } else if (var17.method1014(class105.field2434, (byte) 90)) {
                                                    class45.field993 = class45.field993.method1035(1, class105.field2434.method997(-110));
                                                    var18 = 5;
                                                }
                                            } else {
                                                var18 = 3;
                                                class45.field993 = class45.field993.method1035(1, class95.field2240.method997(126));
                                            }
                                        } else {
                                            class45.field993 = class45.field993.method1035(1, class111.field2658.method997(-50));
                                            var18 = 2;
                                        }
                                    } else {
                                        var18 = 1;
                                        class45.field993 = class45.field993.method1035(1, class89.field2135.method997(-57));
                                    }
                                    class72.field1527.method845(170, 100);
                                    class72.field1527.method837(93, 0);
                                    int var19 = class72.field1527.field2583;
                                    class72.field1527.method837(66, var15);
                                    class72.field1527.method837(83, var18);
                                    class4.method27(class45.field993, -118, class72.field1527);
                                    class72.field1527.method810(2057446968, class72.field1527.field2583 - var19);
                                    if (~class21.field453 == -3) {
                                        ++class91.field2145;
                                        class116.field2762 = true;
                                        class21.field453 = 3;
                                        class72.field1527.method845(13, 100);
                                        class72.field1527.method837(113, class21.field453);
                                        class72.field1527.method837(-87, class71.field1510);
                                        class72.field1527.method837(80, class110.field2606);
                                    }
                                }
                                class80.field1825 = true;
                                class45.field993 = class45.field999;
                            }
                        }
                    } else {
                        if (class13.field289 == 85 && ~class45.field992.method997(-105) < -1) {
                            class45.field992 = class45.field992.method1013(class45.field992.method997(-59) - 1, 0, (byte) 24);
                            class80.field1825 = true;
                        }
                        if ((class80.method587(class107.field2497, (byte) 93) || ~class107.field2497 == -33) && class45.field992.method997(-43) < 12) {
                            class45.field992 = class45.field992.method1004(-1, class107.field2497);
                            class80.field1825 = true;
                        }
                        if (~class13.field289 == -85) {
                            if (~class45.field992.method997(125) < -1) {
                                ++class91.field2162;
                                class72.field1527.method845(180, 100);
                                class72.field1527.method840(false, class45.field992.method1030(65));
                            }
                            class92.field2185 = 0;
                            class80.field1825 = true;
                        }
                    }
                }
                return;
            } while (!class80.method587(class107.field2497, (byte) 93) && class107.field2497 != 32);
            if (class45.field1005.method997(-39) < 12) {
                class45.field1005 = class45.field1005.method1004(-1, class107.field2497);
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "([BBIZZ)V")
    public final void method277(byte[] arg0, byte arg1, int arg2, boolean arg3, boolean arg4) {
        ++field875;
        if (!arg3) {
            arg0[arg0.length - 2] = (byte) (super.field2085[arg2] >> 8);
            arg0[arg0.length + -1] = (byte) super.field2085[arg2];
            if (this.field859 != null) {
                class86.method629(arg0, arg2, this.field859, (byte) -31);
                this.field851[arg2] = true;
            }
            if (arg4) {
                super.field2110[arg2] = class137.method1020(false, (byte) 10, arg0);
            }
        } else {
            if (this.field854) {
                throw new RuntimeException();
            }
            if (this.field853 != null) {
                class86.method629(arg0, this.field860, this.field853, (byte) -31);
            }
            this.method663(arg0, arg1 ^ 44);
            this.method275(false);
        }
        if (arg1 != -45) {
            method289(107, (class85) null);
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "([BZLcf;II)V")
    public final void method278(byte[] arg0, boolean arg1, class21 arg2, int arg3, int arg4) {
        ++field872;
        if (this.field853 != arg2) {
            if (!arg1 && this.field880 == arg4) {
                this.field854 = true;
            }
            if (arg0 == null || arg0.length <= 2) {
                this.field851[arg4] = false;
                if (this.field861 || arg1) {
                    class44.method312(arg1, (byte) 2, this, arg4, -321970768, super.field2100[arg4], this.field860);
                }
                return;
            }
            class53.field1169.reset();
            class53.field1169.update(arg0, 0, arg0.length - 2);
            int var6 = (int) class53.field1169.getValue();
            int var7 = (65280 & arg0[arg0.length - 2] << 8) + (arg0[arg0.length + -1] & 255);
            if (super.field2100[arg4] != var6 || super.field2085[arg4] != var7) {
                this.field851[arg4] = false;
                if (this.field861 || arg1) {
                    class44.method312(arg1, (byte) 2, this, arg4, -321970768, super.field2100[arg4], this.field860);
                }
                return;
            }
            this.field851[arg4] = true;
            if (arg1) {
                super.field2110[arg4] = class137.method1020(false, (byte) 10, arg0);
            }
        } else {
            if (this.field854) {
                throw new RuntimeException();
            }
            if (arg0 == null) {
                class44.method312(true, (byte) 0, this, this.field860, -321970768, this.field863, 255);
                return;
            }
            class53.field1169.reset();
            class53.field1169.update(arg0, 0, arg0.length);
            int var8 = (int) class53.field1169.getValue();
            if (~this.field863 != ~var8) {
                class44.method312(true, (byte) 0, this, this.field860, -321970768, this.field863, 255);
                return;
            }
            this.method663(arg0, -1);
            this.method275(false);
        }
        if (arg3 > -57) {
            this.method284(-11, 116);
        }
    }

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "(I)V")
    public static final void method279(int arg0) {
        ++field878;
        class58.method410(false);
        if (class78.field1732 == 2) {
            byte[] var1 = class6.field121.field1204;
            int[] var2 = class62.field1331;
            int var3 = var1.length;
            for (int var4 = 0; var3 > var4; ++var4) {
                if (~var1[var4] == -1) {
                    var2[var4] = 0;
                }
            }
            class44.field965.method1060(0, 0, 33, 33, 25, 25, class105.field2436, 256, class8.field186, class91.field2157);
            class44.method303(false);
        } else {
            int var5 = 2047 & class120.field2794 + class105.field2436;
            int var6 = class104.field2412.field1672 / 32 + 48;
            int var7 = -(class104.field2412.field1646 / 32) + 464;
            class95.field2238.method1060(25, 5, 146, 151, var6, var7, var5, class78.field1744 + 256, class48.field1079, class33.field707);
            for (int var8 = 0; ~var8 > ~class61.field1321; ++var8) {
                int var38 = class102.field2380[var8] * 4 + -(class104.field2412.field1672 / 32) - -2;
                int var39 = class100.field2344[var8] * 4 + -(class104.field2412.field1646 / 32) + 2;
                class142.method1092(class91.field2155[var8], var39, var38, 83);
            }
            int var9 = 0;
            if (arg0 > 57) {
                while (~var9 > -105) {
                    for (int var34 = 0; var34 < 104; ++var34) {
                        class100 var35 = class40.field914[class28.field627][var9][var34];
                        if (var35 != null) {
                            int var36 = var34 * 4 + 2 + -(class104.field2412.field1646 / 32);
                            int var37 = var9 * 4 + 2 + -(class104.field2412.field1672 / 32);
                            class142.method1092(class12.field262[0], var36, var37, 83);
                        }
                    }
                    ++var9;
                }
                for (int var10 = 0; class107.field2498 > var10; ++var10) {
                    class56 var30 = class125.field2914[class72.field1526[var10]];
                    if (var30 != null && var30.method384((byte) -115)) {
                        class139 var31 = var30.field1203;
                        if (var31 != null && var31.field3218 != null) {
                            var31 = var31.method1065(false);
                        }
                        if (var31 != null && var31.field3203 && var31.field3209) {
                            int var32 = var30.field1646 / 32 + -(class104.field2412.field1646 / 32);
                            int var33 = var30.field1672 / 32 + -(class104.field2412.field1672 / 32);
                            class142.method1092(class12.field262[1], var32, var33, 83);
                        }
                    }
                }
                for (int var11 = 0; ~class44.field973 < ~var11; ++var11) {
                    class125 var22 = class102.field2358[class139.field3237[var11]];
                    if (var22 != null && var22.method384((byte) -94)) {
                        boolean var23 = false;
                        int var24 = var22.field1672 / 32 - class104.field2412.field1672 / 32;
                        int var25 = var22.field1646 / 32 + -(class104.field2412.field1646 / 32);
                        long var26 = var22.field2909.method1030(65);
                        for (int var28 = 0; class80.field1832 > var28; ++var28) {
                            if (~class68.field1395[var28] == ~var26 && class83.field1872[var28] != 0) {
                                var23 = true;
                                break;
                            }
                        }
                        boolean var29 = false;
                        if (~class104.field2412.field2879 != -1 && var22.field2879 != 0 && ~class104.field2412.field2879 == ~var22.field2879) {
                            var29 = true;
                        }
                        if (!var23) {
                            if (var29) {
                                class142.method1092(class12.field262[4], var25, var24, 83);
                            } else {
                                class142.method1092(class12.field262[2], var25, var24, 83);
                            }
                        } else {
                            class142.method1092(class12.field262[3], var25, var24, 83);
                        }
                    }
                }
                if (~class8.field192 != -1 && ~(class112.field2667 % 20) > -11) {
                    if (class8.field192 == 1 && ~class24.field586 <= -1 && class125.field2914.length > class24.field586) {
                        class56 var12 = class125.field2914[class24.field586];
                        if (var12 != null) {
                            int var13 = var12.field1672 / 32 + -(class104.field2412.field1672 / 32);
                            int var14 = var12.field1646 / 32 + -(class104.field2412.field1646 / 32);
                            class116.method898((byte) 5, var14, class11.field248[1], var13);
                        }
                    }
                    if (~class8.field192 == -3) {
                        int var15 = (-class58.field1227 + class120.field2796) * 4 - (class104.field2412.field1672 / 32 + -2);
                        int var16 = (-class91.field2163 + class115.field2726) * 4 + 2 + -(class104.field2412.field1646 / 32);
                        class116.method898((byte) 5, var16, class11.field248[1], var15);
                    }
                    if (class8.field192 == 10 && ~class47.field1044 <= -1 && ~class47.field1044 > ~class102.field2358.length) {
                        class125 var17 = class102.field2358[class47.field1044];
                        if (var17 != null) {
                            int var18 = var17.field1646 / 32 + -(class104.field2412.field1646 / 32);
                            int var19 = var17.field1672 / 32 + -(class104.field2412.field1672 / 32);
                            class116.method898((byte) 5, var18, class11.field248[1], var19);
                        }
                    }
                }
                if (class48.field1088 != 0) {
                    int var20 = class48.field1088 * 4 + -(class104.field2412.field1672 / 32) - -2;
                    int var21 = class72.field1535 * 4 + 2 - class104.field2412.field1646 / 32;
                    class142.method1092(class11.field248[0], var21, var20, 83);
                }
                class62.method454(97, 78, 3, 3, 16777215);
                class44.field965.method1060(0, 0, 33, 33, 25, 25, class105.field2436, 256, class8.field186, class91.field2157);
                class44.method303(false);
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "(I)V")
    public static final void method280(int arg0) {
        ++field867;
        if (~class8.field192 == -3) {
            class2.method14((-class58.field1227 + class120.field2796 << 7) + class35.field746, 25358, class98.field2293 * 2, (-class91.field2163 + class115.field2726 << 7) + class8.field188);
            if (class49.field1090 > -1 && ~(class112.field2667 % 20) > -11) {
                class88.field2113[0].method1048(class49.field1090 + -12, class112.field2673 + -28);
            }
            int var1 = -56 / ((63 - arg0) / 41);
        }
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(Lcf;Lcf;IZZZ)V")
    public class39(class21 arg0, class21 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field860 = arg2;
        this.field853 = arg1;
        this.field861 = arg5;
        this.field859 = arg0;
        class1.method13(this, (byte) 96, this.field860);
    }

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "(IB)V")
    public final void method281(int arg0, byte arg1) {
        this.field863 = arg0;
        if (this.field853 != null) {
            class95.method683(false, this.field853, this, this.field860);
        } else {
            class44.method312(true, (byte) 0, this, this.field860, arg1 + -321970768, this.field863, 255);
        }
        ++field869;
        if (arg1 != 0) {
            method289(47, (class85) null);
        }
    }

    @OriginalMember(owner = "client!fc", name = "h", descriptor = "(I)I")
    public final int method282(int arg0) {
        ++field850;
        if (this.field854) {
            return 100;
        } else if (arg0 != -54) {
            return 65;
        } else if (super.field2110 != null) {
            return 99;
        } else {
            int var2 = class110.method851(this.field860, 255, 63);
            if (var2 >= 100) {
                var2 = 99;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!fc", name = "i", descriptor = "(I)V")
    public static void method283(int arg0) {
        field879 = null;
        field864 = null;
        field862 = null;
        field866 = null;
        int var1 = -118 % ((arg0 - 63) / 40);
    }

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "(II)I")
    private final int method284(int arg0, int arg1) {
        if (arg0 <= 56) {
            return -111;
        } else {
            ++field855;
            if (super.field2110[arg1] != null) {
                return 100;
            } else {
                return this.field851[arg1] ? 100 : class110.method851(arg1, this.field860, 54);
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(IZ)V")
    public final void method285(int arg0, boolean arg1) {
        ++field876;
        if (this.field859 != null && this.field851 != null && this.field851[arg0]) {
            class95.method683(false, this.field859, this, arg0);
        } else {
            class44.method312(true, (byte) 2, this, arg0, -321970768, super.field2100[arg0], this.field860);
        }
        if (arg1) {
            this.field854 = false;
        }
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(BI)Lwa;")
    public static final class141 method286(byte arg0, int arg1) {
        int var2 = -109 / ((arg0 - 50) / 51);
        class141 var3 = (class141) class71.field1493.method758((long) arg1, (byte) -106);
        ++field881;
        if (var3 != null) {
            return var3;
        } else {
            byte[] var4 = class92.field2183.method668(10, -214, arg1);
            class141 var5 = new class141();
            var5.field3315 = arg1;
            if (var4 != null) {
                var5.method1085(new class109(var4), (byte) -99);
            }
            var5.method1084((byte) 6);
            if (var5.field3313 != -1) {
                var5.method1082(method286((byte) -91, var5.field3313), -103, method286((byte) 105, var5.field3302));
            }
            if (!class108.field2514 && var5.field3314) {
                var5.field3289 = null;
                var5.field3316 = class21.field462;
                var5.field3273 = null;
                var5.field3318 = 0;
            }
            class71.field1493.method760(var5, 0, (long) arg1);
            return var5;
        }
    }

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "(B)I")
    public final int method287(byte arg0) {
        int var2 = 0;
        ++field858;
        int var3 = 0;
        int var4 = 91 % ((arg0 - -46) / 58);
        for (int var5 = 0; ~var5 > ~super.field2110.length; ++var5) {
            if (super.field2096[var5] > 0) {
                var3 += 100;
                var2 += this.method284(105, var5);
            }
        }
        if (var3 == 0) {
            return 100;
        } else {
            return var2 * 100 / var3;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IB)V")
    public final void method288(int arg0, byte arg1) {
        if (arg1 > -39) {
            field873 = 26;
        }
        class69.method486(this.field860, 1770960752, arg0);
        ++field871;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILme;)[I")
    public static final int[] method289(int arg0, class85 arg1) {
        ++field882;
        int var2 = arg1.field1910 >> 16;
        if (!class125.method936(var2, (byte) 72)) {
            return null;
        } else if (arg0 != 2567) {
            return null;
        } else {
            int var3 = arg1.field2007;
            int var4 = arg1.field1985;
            class85 var7;
            for (int var5 = arg1.field1945; ~var5 != 0; var5 = var7.field1945) {
                var7 = class36.field795[var2][65535 & var5];
                var4 += -var7.field1932 + var7.field1985;
                var3 += -var7.field1927 + var7.field2007;
            }
            return new int[] { var4, var3 };
        }
    }
}
