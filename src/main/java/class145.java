import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class145 extends class209 {

    @OriginalMember(owner = "client!pk", name = "l", descriptor = "I")
    private int field1871 = 0;

    @OriginalMember(owner = "client!pk", name = "j", descriptor = "[I")
    public static int[] field1869 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

    @OriginalMember(owner = "client!pk", name = "k", descriptor = "I")
    public static int field1870;

    @OriginalMember(owner = "client!pk", name = "m", descriptor = "I")
    public static int field1872;

    @OriginalMember(owner = "client!pk", name = "o", descriptor = "I")
    public static int field1874;

    @OriginalMember(owner = "client!pk", name = "n", descriptor = "[[Z")
    public static boolean[][] field1873;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(BII)Z", line = 4)
    public static final boolean method832(byte arg0, int arg1, int arg2) {
        int var3 = 54 % ((arg0 - 58) / 60);
        ++field1870;
        return class578.method3102(arg1, arg2, (byte) 105) | ~(458752 & arg2) != -1 || class19.method85(arg2, (byte) 112, arg1);
    }

    @OriginalMember(owner = "client!pk", name = "<init>", descriptor = "(Lwm;Lbo;)V", line = 19)
    public class145(class30 arg0, class370 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "(I)V", line = 22)
    public static void method833(int arg0) {
        field1873 = null;
        if (arg0 >= -104) {
            method834(false);
        }
        field1869 = null;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Z)V", line = 34)
    public static final void method834(boolean arg0) {
        ++field1872;
        class653.method3538((byte) 26, false);
        class739.field9996 = 0;
        boolean var1 = true;
        for (int var2 = 0; ~var2 > ~class92.field1263.length; ++var2) {
            if (~class195.field2709[var2] != 0 && class92.field1263[var2] == null) {
                class92.field1263[var2] = class650.field8282.method139(class195.field2709[var2], (byte) -94, 0);
                if (class92.field1263[var2] == null) {
                    var1 = false;
                    ++class739.field9996;
                }
            }
            if (~class459.field5994[var2] != 0 && class256.field3474[var2] == null) {
                class256.field3474[var2] = class650.field8282.method152(16, class382.field4782[var2], class459.field5994[var2], 0);
                if (class256.field3474[var2] == null) {
                    var1 = false;
                    ++class739.field9996;
                }
            }
            if (class448.field5848[var2] != -1 && class279.field3625[var2] == null) {
                class279.field3625[var2] = class650.field8282.method139(class448.field5848[var2], (byte) -94, 0);
                if (class279.field3625[var2] == null) {
                    var1 = false;
                    ++class739.field9996;
                }
            }
            if (class484.field6249[var2] != -1 && class702.field9287[var2] == null) {
                class702.field9287[var2] = class650.field8282.method139(class484.field6249[var2], (byte) -94, 0);
                if (class702.field9287[var2] == null) {
                    var1 = false;
                    ++class739.field9996;
                }
            }
            if (class439.field5768 != null && class55.field712[var2] == null && class439.field5768[var2] != -1) {
                class55.field712[var2] = class650.field8282.method152(16, class382.field4782[var2], class439.field5768[var2], 0);
                if (class55.field712[var2] == null) {
                    ++class739.field9996;
                    var1 = false;
                }
            }
        }
        if (class17.field159 == null) {
            if (class606.field7677 != null && class162.field2163.method160(0, class606.field7677.field4975 + "_staticelements")) {
                if (!class162.field2163.method141(class606.field7677.field4975 + "_staticelements", -55)) {
                    var1 = false;
                    ++class739.field9996;
                } else {
                    class17.field159 = class370.method2123(class162.field2163, class216.field2939, class606.field7677.field4975 + "_staticelements", 5657);
                }
            } else {
                class17.field159 = new class607(0);
            }
        }
        if (!var1) {
            class751.field10241 = 1;
        } else {
            boolean var3 = true;
            class122.field1631 = 0;
            for (int var4 = 0; ~var4 > ~class92.field1263.length; ++var4) {
                byte[] var21 = class256.field3474[var4];
                if (var21 != null) {
                    int var22 = (class644.field8240[var4] >> 8) * 64 + -class714.field9407;
                    int var23 = (class644.field8240[var4] & 255) * 64 + -class240.field3293;
                    if (class449.field5854 != 0) {
                        var22 = 10;
                        var23 = 10;
                    }
                    var3 &= class627.method3354(var23, var21, class240.field3280, class276.field3602, var22, -8428);
                }
                byte[] var24 = class702.field9287[var4];
                if (var24 != null) {
                    int var25 = (class644.field8240[var4] >> 8) * 64 + -class714.field9407;
                    int var26 = (class644.field8240[var4] & 255) * 64 + -class240.field3293;
                    if (class449.field5854 != 0) {
                        var25 = 10;
                        var26 = 10;
                    }
                    var3 &= class627.method3354(var26, var24, class240.field3280, class276.field3602, var25, -8428);
                }
            }
            if (!var3) {
                class751.field10241 = 2;
            } else {
                if (~class751.field10241 != -1) {
                    class530.method2903(class659.field8556.method3589(class496.field6338, -22395) + "<br>(100%)", class576.field7320, class225.field3058, true, -1, class411.field5453);
                }
                class204.method1385(110);
                class146.method836(0);
                class703.method3806(-29889);
                boolean var5 = false;
                if (class576.field7320.method917() && ~class485.field6252.field6951.method1703(false) == -3) {
                    for (int var6 = 0; class92.field1263.length > var6; ++var6) {
                        if (class702.field9287[var6] != null || class279.field3625[var6] != null) {
                            var5 = true;
                            break;
                        }
                    }
                }
                int var7;
                if (class485.field6252.field6920.method75(arg0) == 1) {
                    var7 = class748.field10209[class748.field10207];
                } else {
                    var7 = class268.field3550[class748.field10207];
                }
                if (class576.field7320.method992()) {
                    ++var7;
                }
                class316.method1847(class576.field7320, class788.field10791, 9, 4, class240.field3280, class276.field3602, var7, var5, class576.field7320.method893() > 0);
                class252.method1640(class5.field60);
                if (class5.field60 != 0) {
                    class45.method273(class399.field5278);
                } else {
                    class45.method273((class420) null);
                }
                for (int var8 = 0; var8 < 4; ++var8) {
                    class179.field2391[var8].method1961((byte) -36);
                }
                class756.method4110(true);
                class64.method376(false, 1);
                class661.method3592(126);
                class38.field430 = null;
                class784.field10739 = false;
                class204.method1385(70);
                System.gc();
                class653.method3538((byte) 26, true);
                class346.method2005(1);
                class411.field5452 = class485.field6252.field6952.method665(arg0);
                class754.field10277 = class91.field1248 >= 96;
                class791.field10839 = class485.field6252.field6951.method1703(arg0) == 2;
                class186.field2610 = ~class485.field6252.field6947.method106(false) == -2;
                class47.field547 = class485.field6252.field6942.method2278(arg0) == 1 ? -1 : class711.field9393;
                class549.field6887 = class485.field6252.field6915.method2297(false) == 1;
                class723.field9497 = ~class485.field6252.field6913.method3304(arg0) == -2;
                class731.field9578 = new class752(4, class240.field3280, class276.field3602, false);
                if (~class449.field5854 != -1) {
                    class123.method728((byte) 13, class731.field9578, class92.field1263);
                } else {
                    class685.method3673(class92.field1263, class731.field9578, 0);
                }
                class44.method268(true, class276.field3602 >> 4, class240.field3280 >> 4);
                class599.method3237(583371395);
                if (var5) {
                    class395.method2290(true);
                    class773.field10505 = new class752(1, class240.field3280, class276.field3602, true);
                    if (~class449.field5854 == -1) {
                        class685.method3673(class279.field3625, class773.field10505, 0);
                        class653.method3538((byte) 26, true);
                    } else {
                        class123.method728((byte) 13, class773.field10505, class279.field3625);
                        class653.method3538((byte) 26, true);
                    }
                    class773.field10505.method3219((byte) 53, 0, class731.field9578.field7590[0]);
                    class773.field10505.method3222((class340[]) null, class576.field7320, -31, (int[][][]) null);
                    class395.method2290(false);
                }
                class731.field9578.method3222(class179.field2391, class576.field7320, 11, var5 ? class773.field10505.field7590 : null);
                if (~class449.field5854 != -1) {
                    class653.method3538((byte) 26, true);
                    class547.method2961(class731.field9578, class256.field3474, -17429);
                } else {
                    class653.method3538((byte) 26, true);
                    class524.method2883(class731.field9578, class256.field3474, 255);
                    if (class55.field712 != null) {
                        class206.method1392((byte) 114);
                    }
                }
                class146.method836(0);
                if (~class91.field1248 > -97) {
                    class450.method2566(28);
                }
                class653.method3538((byte) 26, true);
                class731.field9578.method3229(true, class576.field7320, var5 ? class735.field9973[0] : null, (class358) null);
                class731.field9578.method4084(class576.field7320, -1, false);
                class653.method3538((byte) 26, true);
                if (var5) {
                    class395.method2290(true);
                    class653.method3538((byte) 26, true);
                    if (class449.field5854 == 0) {
                        class524.method2883(class773.field10505, class702.field9287, 255);
                    } else {
                        class547.method2961(class773.field10505, class702.field9287, -17429);
                    }
                    class146.method836(0);
                    class653.method3538((byte) 26, true);
                    class773.field10505.method3229(!arg0, class576.field7320, (class358) null, class383.field4790[0]);
                    class773.field10505.method4084(class576.field7320, -1, true);
                    class653.method3538((byte) 26, true);
                    class395.method2290(false);
                }
                class520.method2868((byte) 40);
                int var9 = class731.field9578.field10251;
                if (~var9 < ~class309.field3877) {
                    var9 = class309.field3877;
                }
                if (var9 < class309.field3877 + -1) {
                    var9 = class309.field3877 + -1;
                }
                if (~class485.field6252.field6942.method2278(false) != -1) {
                    class335.method1931(0);
                } else {
                    class335.method1931(var9);
                }
                for (int var10 = 0; var10 < 4; ++var10) {
                    for (int var19 = 0; var19 < class240.field3280; ++var19) {
                        for (int var20 = 0; ~class276.field3602 < ~var20; ++var20) {
                            class263.method1666(53, var10, var19, var20);
                        }
                    }
                }
                class494.method2752((byte) 50);
                class204.method1385(27);
                class217.method1429((byte) 6);
                class146.method836(0);
                class620.method3317((byte) -122);
                if (class340.field4176 != null && class252.field3437 != null && ~class332.field4052 == -12) {
                    ++class139.field1837;
                    class13 var11 = class659.method3587(class68.field909, 98, class446.field5819);
                    var11.field130.method1496(1057001181, (byte) 57);
                    class116.method679(var11, 0);
                }
                if (class449.field5854 == 0) {
                    int var12 = (-(class240.field3280 >> 4) + class527.field6693) / 8;
                    int var13 = ((class240.field3280 >> 4) + class527.field6693) / 8;
                    int var14 = (-(class276.field3602 >> 4) + class742.field10047) / 8;
                    int var15 = ((class276.field3602 >> 4) + class742.field10047) / 8;
                    for (int var16 = var12 + -1; ~var16 >= ~(var13 + 1); ++var16) {
                        for (int var17 = var14 + -1; ~(var15 - -1) <= ~var17; ++var17) {
                            if (~var16 > ~var12 || ~var16 < ~var13 || var17 < var14 || ~var17 < ~var15) {
                                class650.field8282.method154("m" + var16 + "_" + var17, 3);
                                class650.field8282.method154("l" + var16 + "_" + var17, 3);
                            }
                        }
                    }
                }
                if (class332.field4052 != 4) {
                    if (~class332.field4052 != -9) {
                        class26.method113((byte) 95, 10);
                        if (class252.field3437 != null) {
                            class13 var18 = class659.method3587(class68.field909, 98, class119.field1602);
                            class116.method679(var18, 0);
                        }
                    } else {
                        class26.method113((byte) 95, 7);
                    }
                } else {
                    class26.method113((byte) 95, 3);
                }
                class634.method3382(-1);
                class204.method1385(98);
                class116.method676(8);
                class689.field8852 = true;
                if (class196.field2727) {
                    class789.method4318("Took: " + (class502.method2786(-7114) - class467.field6053) + "ms", false);
                    class196.field2727 = false;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(ZI)V", line = 521)
    public final void method835(boolean arg0, int arg1) {
        ++field1874;
        if (arg1 != 24726) {
            this.method835(false, 24);
        }
        int var3 = super.field2880.field7.method4129(0, class719.field9443, super.field2879.method623()) - -super.field2880.field12;
        int var4 = super.field2880.field3.method90(class398.field5240, super.field2879.method628(), 110) - -super.field2880.field11;
        super.field2879.method4197((float) (var3 - -(super.field2879.method623() / 2)), (float) (super.field2879.method628() / 2 + var4), 4096, this.field1871);
        this.field1871 += ((class370) super.field2880).field4534;
    }
}
