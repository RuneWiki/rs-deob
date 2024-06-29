import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hu")
public class class674 extends class529 {

    @OriginalMember(owner = "client!hu", name = "F", descriptor = "[I")
    public static int[] field9174 = new int[13];

    @OriginalMember(owner = "client!hu", name = "E", descriptor = "I")
    public static int field9173;

    @OriginalMember(owner = "client!hu", name = "G", descriptor = "I")
    public static int field9175;

    @OriginalMember(owner = "client!hu", name = "H", descriptor = "I")
    public static int field9176;

    @OriginalMember(owner = "client!hu", name = "I", descriptor = "I")
    public static int field9177;

    @OriginalMember(owner = "client!hu", name = "L", descriptor = "I")
    public static int field9180;

    @OriginalMember(owner = "client!hu", name = "J", descriptor = "Lhv;")
    public static class214 field9178;

    @OriginalMember(owner = "client!hu", name = "K", descriptor = "[Ljk;")
    private class756[] field9179;

    @OriginalMember(owner = "client!hu", name = "D", descriptor = "[[[S")
    public static short[][][] field9172;

    @OriginalMember(owner = "client!hu", name = "f", descriptor = "(I)V", line = 4)
    public static void method3629(int arg0) {
        if (arg0 != 20534) {
            method3629(-23);
        }
        field9178 = null;
        field9174 = null;
        field9172 = null;
    }

    @OriginalMember(owner = "client!hu", name = "<init>", descriptor = "()V", line = 24)
    public class674() {
        super(0, true);
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(Z)V", line = 29)
    public static final void method3630(boolean arg0) {
        ++field9175;
        class9.method41(false, false);
        class129.field1558 = 0;
        boolean var1 = true;
        for (int var2 = 0; ~class688.field9766.length < ~var2; ++var2) {
            if (class46.field685[var2] != -1 && class688.field9766[var2] == null) {
                class688.field9766[var2] = class541.field7613.method3810(class46.field685[var2], -23360, 0);
                if (class688.field9766[var2] == null) {
                    ++class129.field1558;
                    var1 = false;
                }
            }
            if (class556.field7797[var2] != -1 && class324.field4136[var2] == null) {
                class324.field4136[var2] = class541.field7613.method3828(class556.field7797[var2], class556.field7799[var2], 0, 2);
                if (class324.field4136[var2] == null) {
                    var1 = false;
                    ++class129.field1558;
                }
            }
            if (class239.field3084[var2] != -1 && class459.field6460[var2] == null) {
                class459.field6460[var2] = class541.field7613.method3810(class239.field3084[var2], -23360, 0);
                if (class459.field6460[var2] == null) {
                    ++class129.field1558;
                    var1 = false;
                }
            }
            if (class258.field3281[var2] != -1 && class177.field2291[var2] == null) {
                class177.field2291[var2] = class541.field7613.method3810(class258.field3281[var2], -23360, 0);
                if (class177.field2291[var2] == null) {
                    var1 = false;
                    ++class129.field1558;
                }
            }
            if (class643.field8879 != null && class677.field9198[var2] == null && ~class643.field8879[var2] != 0) {
                class677.field9198[var2] = class541.field7613.method3828(class643.field8879[var2], class556.field7799[var2], 0, 2);
                if (class677.field9198[var2] == null) {
                    ++class129.field1558;
                    var1 = false;
                }
            }
        }
        if (class512.field7223 == null) {
            if (class258.field3279 != null && class250.field3180.method3821(8933, class258.field3279.field5291 + "_staticelements")) {
                if (class250.field3180.method3825(class258.field3279.field5291 + "_staticelements", (byte) -122)) {
                    class512.field7223 = class634.method3448(1, class680.field9235, class250.field3180, class258.field3279.field5291 + "_staticelements");
                } else {
                    ++class129.field1558;
                    var1 = false;
                }
            } else {
                class512.field7223 = new class660(0);
            }
        }
        if (!var1) {
            class575.field8033 = 1;
        } else {
            boolean var3 = true;
            class7.field72 = 0;
            for (int var4 = 0; class688.field9766.length > var4; ++var4) {
                byte[] var21 = class324.field4136[var4];
                if (var21 != null) {
                    int var22 = (class248.field3162[var4] >> 8) * 64 + -class63.field851;
                    int var23 = (class248.field3162[var4] & 255) * 64 - class753.field10509;
                    if (class506.field7142 != 0) {
                        var22 = 10;
                        var23 = 10;
                    }
                    var3 &= class264.method1589(var22, var23, var21, class613.field8591, class1.field3, (byte) 83);
                }
                byte[] var24 = class177.field2291[var4];
                if (var24 != null) {
                    int var25 = (class248.field3162[var4] >> 8) * 64 + -class63.field851;
                    int var26 = (class248.field3162[var4] & 255) * 64 + -class753.field10509;
                    if (class506.field7142 != 0) {
                        var26 = 10;
                        var25 = 10;
                    }
                    var3 &= class264.method1589(var25, var26, var24, class613.field8591, class1.field3, (byte) 125);
                }
            }
            if (!var3) {
                class575.field8033 = 2;
            } else {
                if (class575.field8033 != 0) {
                    class760.method4231(true, class619.field8670, class458.field6407, class543.field7644, true, class586.field8137.method3261(class416.field5920, (byte) 82) + "<br>(100%)");
                }
                class384.method2308(-124);
                class326.method1932(0);
                class641.method3487(52);
                boolean var5 = false;
                if (class458.field6407.method73() && ~class223.field2944.field604.method1060((byte) -127) == -3) {
                    for (int var6 = 0; ~var6 > ~class688.field9766.length; ++var6) {
                        if (class177.field2291[var6] != null || class459.field6460[var6] != null) {
                            var5 = true;
                            break;
                        }
                    }
                }
                int var7;
                if (class223.field2944.field585.method3565((byte) -126) == 1) {
                    var7 = class555.field7789[class521.field7342];
                } else {
                    var7 = class274.field3467[class521.field7342];
                }
                if (class458.field6407.method91()) {
                    ++var7;
                }
                class609.method3335(class458.field6407, class718.field10121, 9, 4, class613.field8591, class1.field3, var7, var5, ~class458.field6407.method115() < -1);
                class313.method1821(class82.field1065);
                if (~class82.field1065 == -1) {
                    class34.method316((class423) null);
                } else {
                    class34.method316(class524.field7408);
                }
                for (int var8 = 0; ~var8 > -5; ++var8) {
                    class410.field5786[var8].method3794(-105);
                }
                class240.method1498(124);
                class301.method1774(false, 8);
                class261.method1582(116);
                class219.field2786 = null;
                class262.field3329 = false;
                class384.method2308(-92);
                System.gc();
                class9.method41(true, false);
                class20.method220(-125);
                class131.field1567 = class223.field2944.field628.method1256((byte) -126);
                class561.field7842 = class722.field10162 >= 96;
                class512.field7222 = ~class223.field2944.field604.method1060((byte) -123) == -3;
                class627.field8743 = ~class223.field2944.field602.method1676((byte) -127) == -2;
                class625.field8713 = class223.field2944.field619.method444((byte) -123) == 1 ? -1 : class553.field7772;
                class742.field10376 = class223.field2944.field591.method3604((byte) -122) == 1;
                class681.field9286 = ~class223.field2944.field621.method2399((byte) -121) == -2;
                class143.field1692 = new class486(4, class613.field8591, class1.field3, false);
                if (class506.field7142 != 0) {
                    class85.method598(class688.field9766, -1, class143.field1692);
                } else {
                    class700.method3875(class688.field9766, -20557, class143.field1692);
                }
                class403.method2396(class613.field8591 >> 4, (byte) -87, class1.field3 >> 4);
                class160.method990(-1087940572);
                if (var5) {
                    class611.method3342(true);
                    class606.field8415 = new class486(1, class613.field8591, class1.field3, true);
                    if (~class506.field7142 != -1) {
                        class85.method598(class459.field6460, -1, class606.field8415);
                        class9.method41(true, false);
                    } else {
                        class700.method3875(class459.field6460, -20557, class606.field8415);
                        class9.method41(true, false);
                    }
                    class606.field8415.method901(1, class143.field1692.field1742[0], 0);
                    class606.field8415.method902((int[][][]) null, class458.field6407, (byte) 15, (class685[]) null);
                    class611.method3342(false);
                }
                class143.field1692.method902(var5 ? class606.field8415.field1742 : null, class458.field6407, (byte) 15, class410.field5786);
                if (class506.field7142 != 0) {
                    class9.method41(true, false);
                    class190.method1204(class324.field4136, (byte) 114, class143.field1692);
                } else {
                    class9.method41(true, false);
                    class737.method4132(class143.field1692, (byte) 56, class324.field4136);
                    if (class677.field9198 != null) {
                        class440.method2594((byte) 96);
                    }
                }
                class326.method1932(0);
                if (class722.field10162 < 96) {
                    class587.method3265(true);
                }
                class9.method41(true, false);
                class143.field1692.method903(class458.field6407, !var5 ? null : class109.field1341[0], (class402) null, 84);
                class143.field1692.method2840(arg0, class458.field6407, 121);
                class9.method41(true, false);
                if (var5) {
                    class611.method3342(true);
                    class9.method41(true, false);
                    if (~class506.field7142 != -1) {
                        class190.method1204(class177.field2291, (byte) 93, class606.field8415);
                    } else {
                        class737.method4132(class606.field8415, (byte) -94, class177.field2291);
                    }
                    class326.method1932(0);
                    class9.method41(true, false);
                    class606.field8415.method903(class458.field6407, (class402) null, class716.field10106[0], 45);
                    class606.field8415.method2840(true, class458.field6407, 100);
                    class9.method41(true, arg0);
                    class611.method3342(false);
                }
                class181.method1164(-1);
                int var9 = class143.field1692.field6914;
                if (~class223.field2946 > ~var9) {
                    var9 = class223.field2946;
                }
                if (~var9 > ~(class223.field2946 + -1)) {
                    var9 = class223.field2946 - 1;
                }
                if (class223.field2944.field619.method444((byte) -122) == 0) {
                    class304.method1787(var9);
                } else {
                    class304.method1787(0);
                }
                for (int var10 = 0; ~var10 > -5; ++var10) {
                    for (int var19 = 0; var19 < class613.field8591; ++var19) {
                        for (int var20 = 0; ~class1.field3 < ~var20; ++var20) {
                            class203.method1261(var10, var20, var19, (byte) 30);
                        }
                    }
                }
                class652.method3516(-108);
                class384.method2308(-44);
                class584.method3255(0);
                class326.method1932(0);
                class713.method3951(-2);
                if (class95.field1205 != null && class426.field6057 != null && ~class668.field9150 == -12) {
                    ++class707.field9962;
                    class650 var11 = class314.method1837(class607.field8427, true, class625.field8727);
                    var11.field8928.method1112(1057001181, -118);
                    class108.method745(var11, -26);
                }
                if (~class506.field7142 == -1) {
                    int var12 = (-(class613.field8591 >> 4) + class108.field1336) / 8;
                    int var13 = (class108.field1336 - -(class613.field8591 >> 4)) / 8;
                    int var14 = (-(class1.field3 >> 4) + class509.field7194) / 8;
                    int var15 = ((class1.field3 >> 4) + class509.field7194) / 8;
                    for (int var16 = var12 + -1; var16 <= var13 + 1; ++var16) {
                        for (int var17 = var14 - 1; var17 <= var15 + 1; ++var17) {
                            if (~var12 < ~var16 || var16 > var13 || var17 < var14 || ~var17 < ~var15) {
                                class541.field7613.method3838(false, "m" + var16 + "_" + var17);
                                class541.field7613.method3838(arg0, "l" + var16 + "_" + var17);
                            }
                        }
                    }
                }
                if (class668.field9150 != 4) {
                    if (~class668.field9150 != -9) {
                        class614.method3369(10, (byte) -83);
                        if (class426.field6057 != null) {
                            class650 var18 = class314.method1837(class560.field7825, true, class625.field8727);
                            class108.method745(var18, -86);
                        }
                    } else {
                        class614.method3369(7, (byte) -127);
                    }
                } else {
                    class614.method3369(3, (byte) -84);
                }
                class498.method2888(18);
                class384.method2308(-82);
                class541.method3081(-47);
                class571.field7967 = true;
                if (class172.field2259) {
                    class192.method1210(-79, "Took: " + (-class153.field1858 + class97.method654((byte) 81)) + "ms");
                    class172.field2259 = false;
                }
            }
        }
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(IB)[I", line = 510)
    public final int[] method191(int arg0, byte arg1) {
        ++field9180;
        int[] var3 = super.field7456.method1635(arg0, -93);
        int var4 = 70 % ((arg1 - 27) / 49);
        if (super.field7456.field3449) {
            this.method3631((byte) 51, super.field7456.method1634((byte) -39));
        }
        return var3;
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(II)[[I", line = 531)
    public final int[][] method592(int arg0, int arg1) {
        ++field9173;
        int[][] var3 = super.field7450.method2241(arg1 + -3, arg0);
        if (arg1 != 2) {
            this.field9179 = null;
        }
        if (super.field7450.field5165) {
            int var4 = class304.field3909;
            int var5 = class424.field6042;
            int[][] var6 = new int[var5][var4];
            int[][][] var7 = super.field7450.method2244(0);
            this.method3631((byte) 51, var6);
            for (int var8 = 0; class424.field6042 > var8; ++var8) {
                int[] var9 = var6[var8];
                int[][] var10 = var7[var8];
                int[] var11 = var10[0];
                int[] var12 = var10[1];
                int[] var13 = var10[2];
                for (int var14 = 0; var14 < class304.field3909; ++var14) {
                    int var15 = var9[var14];
                    var13[var14] = class272.method1629(4080, var15 << 4);
                    var12[var14] = class272.method1629(var15, 65280) >> 4;
                    var11[var14] = class272.method1629(4080, var15 >> 12);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(IBLtn;)V", line = 594)
    public final void method190(int arg0, byte arg1, class179 arg2) {
        if (~arg0 == -1) {
            this.field9179 = new class756[arg2.method1094(255)];
            for (int var4 = 0; this.field9179.length > var4; ++var4) {
                int var5 = arg2.method1094(255);
                if (~var5 != -1) {
                    if (~var5 != -2) {
                        if (~var5 != -3) {
                            if (~var5 == -4) {
                                this.field9179[var4] = class215.method1303(arg2, -4008);
                            }
                        } else {
                            this.field9179[var4] = class351.method2064(-1, arg2);
                        }
                    } else {
                        this.field9179[var4] = class34.method314(arg2, (byte) 8);
                    }
                } else {
                    this.field9179[var4] = class692.method3863(3, arg2);
                }
            }
        } else if (~arg0 == -2) {
            super.field7461 = ~arg2.method1094(255) == -2;
        }
        ++field9177;
        if (arg1 <= 45) {
            field9178 = null;
        }
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(B[[I)V", line = 668)
    private final void method3631(byte arg0, int[][] arg1) {
        ++field9176;
        int var3 = class304.field3909;
        int var4 = class424.field6042;
        class484.method2818(arg0 ^ 9694, arg1);
        class143.method883(0, class404.field5700, class33.field516, 50, 0);
        if (this.field9179 != null) {
            for (int var5 = 0; this.field9179.length > var5; ++var5) {
                class756 var6 = this.field9179[var5];
                int var7 = var6.field10528;
                int var8 = var6.field10533;
                if (~var7 > -1) {
                    if (var8 >= 0) {
                        var6.method1903((byte) 127, var3, var4);
                    }
                } else if (var8 >= 0) {
                    var6.method1902(var4, var3, (byte) -115);
                } else {
                    var6.method1897(var3, var4, 118);
                }
            }
        }
        if (arg0 != 51) {
            field9178 = null;
        }
    }
}
