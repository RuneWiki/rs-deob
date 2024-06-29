import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class529 extends class31 implements class269 {

    @OriginalMember(owner = "client!sk", name = "I", descriptor = "Z")
    private boolean field7409;

    @OriginalMember(owner = "client!sk", name = "Y", descriptor = "B")
    private byte field7425;

    @OriginalMember(owner = "client!sk", name = "M", descriptor = "B")
    private byte field7413;

    @OriginalMember(owner = "client!sk", name = "z", descriptor = "Z")
    private boolean field7400;

    @OriginalMember(owner = "client!sk", name = "P", descriptor = "Z")
    private boolean field7416;

    @OriginalMember(owner = "client!sk", name = "ab", descriptor = "S")
    private short field7427;

    @OriginalMember(owner = "client!sk", name = "X", descriptor = "Z")
    private boolean field7424;

    @OriginalMember(owner = "client!sk", name = "T", descriptor = "Lk;")
    private class483 field7420;

    @OriginalMember(owner = "client!sk", name = "db", descriptor = "Lr;")
    private class157 field7430;

    @OriginalMember(owner = "client!sk", name = "cb", descriptor = "I")
    public static int field7429 = -1;

    @OriginalMember(owner = "client!sk", name = "C", descriptor = "Lraa;")
    public static class520 field7403 = new class520();

    @OriginalMember(owner = "client!sk", name = "gb", descriptor = "[I")
    public static int[] field7433 = new int[] { 4, 4, 1, 2, 6, 4, 2, 45, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!sk", name = "hb", descriptor = "I")
    public static int field7434 = -1;

    @OriginalMember(owner = "client!sk", name = "ib", descriptor = "[B")
    public static byte[] field7435;

    @OriginalMember(owner = "client!sk", name = "w", descriptor = "I")
    public static int field7397;

    @OriginalMember(owner = "client!sk", name = "x", descriptor = "I")
    public static int field7398;

    @OriginalMember(owner = "client!sk", name = "y", descriptor = "I")
    public static int field7399;

    @OriginalMember(owner = "client!sk", name = "A", descriptor = "I")
    public static int field7401;

    @OriginalMember(owner = "client!sk", name = "B", descriptor = "I")
    public static int field7402;

    @OriginalMember(owner = "client!sk", name = "D", descriptor = "I")
    public static int field7404;

    @OriginalMember(owner = "client!sk", name = "E", descriptor = "I")
    public static int field7405;

    @OriginalMember(owner = "client!sk", name = "F", descriptor = "I")
    public static int field7406;

    @OriginalMember(owner = "client!sk", name = "G", descriptor = "I")
    public static int field7407;

    @OriginalMember(owner = "client!sk", name = "H", descriptor = "I")
    public static int field7408;

    @OriginalMember(owner = "client!sk", name = "J", descriptor = "I")
    public static int field7410;

    @OriginalMember(owner = "client!sk", name = "K", descriptor = "I")
    public static int field7411;

    @OriginalMember(owner = "client!sk", name = "L", descriptor = "I")
    public static int field7412;

    @OriginalMember(owner = "client!sk", name = "N", descriptor = "I")
    public static int field7414;

    @OriginalMember(owner = "client!sk", name = "O", descriptor = "I")
    public static int field7415;

    @OriginalMember(owner = "client!sk", name = "Q", descriptor = "I")
    public static int field7417;

    @OriginalMember(owner = "client!sk", name = "R", descriptor = "I")
    public static int field7418;

    @OriginalMember(owner = "client!sk", name = "S", descriptor = "I")
    public static int field7419;

    @OriginalMember(owner = "client!sk", name = "U", descriptor = "I")
    public static int field7421;

    @OriginalMember(owner = "client!sk", name = "V", descriptor = "I")
    public static int field7422;

    @OriginalMember(owner = "client!sk", name = "Z", descriptor = "I")
    public static int field7426;

    @OriginalMember(owner = "client!sk", name = "bb", descriptor = "I")
    public static int field7428;

    @OriginalMember(owner = "client!sk", name = "eb", descriptor = "I")
    public static int field7431;

    @OriginalMember(owner = "client!sk", name = "fb", descriptor = "I")
    public static int field7432;

    @OriginalMember(owner = "client!sk", name = "W", descriptor = "Lso;")
    private class398 field7423;

    @OriginalMember(owner = "client!sk", name = "f", descriptor = "(B)V")
    public static final void method3009(byte arg0) {
        class503.method2906(false, (byte) 75);
        ++field7398;
        class116.field1454 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < class148.field1777.length; ++var2) {
            if (~class39.field302[var2] != 0 && class148.field1777[var2] == null) {
                class148.field1777[var2] = class368.field4834.method2558(class347.method1937(arg0, 114), 0, class39.field302[var2]);
                if (class148.field1777[var2] == null) {
                    var1 = false;
                    ++class116.field1454;
                }
            }
            if (~class196.field2378[var2] != 0 && class550.field8087[var2] == null) {
                class550.field8087[var2] = class368.field4834.method2573(class82.field1002[var2], (byte) 52, class196.field2378[var2], 0);
                if (class550.field8087[var2] == null) {
                    ++class116.field1454;
                    var1 = false;
                }
            }
            if (~class461.field6370[var2] != 0 && class422.field5451[var2] == null) {
                class422.field5451[var2] = class368.field4834.method2558(100, 0, class461.field6370[var2]);
                if (class422.field5451[var2] == null) {
                    ++class116.field1454;
                    var1 = false;
                }
            }
            if (class391.field5165[var2] != -1 && class74.field871[var2] == null) {
                class74.field871[var2] = class368.field4834.method2558(class347.method1937(arg0, 114), 0, class391.field5165[var2]);
                if (class74.field871[var2] == null) {
                    var1 = false;
                    ++class116.field1454;
                }
            }
            if (class102.field1255 != null && class5.field44[var2] == null && class102.field1255[var2] != -1) {
                class5.field44[var2] = class368.field4834.method2573(class82.field1002[var2], (byte) 52, class102.field1255[var2], 0);
                if (class5.field44[var2] == null) {
                    var1 = false;
                    ++class116.field1454;
                }
            }
        }
        if (class315.field4019 == null) {
            if (class194.field2355 != null && class584.field8486.method2553((byte) 126, class194.field2355.field1197 + "_staticelements")) {
                if (!class584.field8486.method2578(-92, class194.field2355.field1197 + "_staticelements")) {
                    ++class116.field1454;
                    var1 = false;
                } else {
                    class315.field4019 = class236.method1339((byte) -82, class584.field8486, class194.field2355.field1197 + "_staticelements", class170.field2073);
                }
            } else {
                class315.field4019 = new class342(0);
            }
        }
        if (!var1) {
            class561.field8252 = 1;
        } else {
            boolean var3 = true;
            class101.field1250 = 0;
            for (int var4 = 0; var4 < class148.field1777.length; ++var4) {
                byte[] var19 = class550.field8087[var4];
                if (var19 != null) {
                    int var20 = (class633.field9116[var4] >> 8) * 64 + -class632.field9113;
                    int var21 = (class633.field9116[var4] & 255) * 64 - class119.field1504;
                    if (~class593.field8620 != -1) {
                        var20 = 10;
                        var21 = 10;
                    }
                    var3 &= class170.method951(var19, class106.field1289, class422.field5452, var20, 4867, var21);
                }
                byte[] var22 = class74.field871[var4];
                if (var22 != null) {
                    int var23 = (class633.field9116[var4] >> 8) * 64 + -class632.field9113;
                    int var24 = (class633.field9116[var4] & 255) * 64 + -class119.field1504;
                    if (class593.field8620 != 0) {
                        var23 = 10;
                        var24 = 10;
                    }
                    var3 &= class170.method951(var22, class106.field1289, class422.field5452, var23, arg0 + 4845, var24);
                }
            }
            if (!var3) {
                class561.field8252 = 2;
            } else {
                if (~class561.field8252 != -1) {
                    class164.method893(class326.field4163.method987(class31.field247, arg0) + "<br>(100%)", true, class137.field1673, arg0 + 19184);
                }
                class93.method560(true);
                class116.method686(-2);
                boolean var5 = false;
                if (class210.field2560.method1190() && class565.field8299.field2189) {
                    for (int var6 = 0; ~class148.field1777.length < ~var6; ++var6) {
                        if (class74.field871[var6] != null || class422.field5451[var6] != null) {
                            var5 = true;
                            break;
                        }
                    }
                }
                int var7;
                if (!class565.field8299.field2178) {
                    var7 = class391.field5185[class528.field7392];
                } else {
                    var7 = class288.field3744[class528.field7392];
                }
                if (class210.field2560.method1104()) {
                    ++var7;
                }
                class285.method1607(7, 4, class106.field1289, class422.field5452, var7, var5, class210.field2560.method1122() > 0);
                for (int var8 = 0; var8 < 4; ++var8) {
                    class309.field3939[var8].method3164(117);
                }
                class188.method1027(-31383);
                class119.method702(true, false);
                class543.method3177((byte) 103);
                class605.field8734 = false;
                class259.field3340 = null;
                class93.method560(true);
                System.gc();
                class503.method2906(true, (byte) 75);
                class58.method338(9551);
                if (arg0 != 22) {
                    field7435 = null;
                }
                class362.field4762 = class565.field8299.method990(field7429, -1);
                class188.field2261 = class565.field8299.field2189;
                class439.field6081 = ~class252.field3258 <= -97;
                class22.field152 = class565.field8299.method993(field7429, -114);
                class274.field3618 = !class565.field8299.field2181;
                class16.field123 = class565.field8299.method3590(field7429, arg0 ^ -24) ? -1 : class13.field104;
                class241.field3008 = class612.method3519(-23287, field7429) || class565.field8299.field2194;
                class50.field429 = class565.field8299.field2183;
                class103.field1258 = new class308(4, class106.field1289, class422.field5452, false);
                if (class593.field8620 != 0) {
                    class570.method3323(class148.field1777, 60, class103.field1258);
                } else {
                    class133.method748(class148.field1777, -24278, class103.field1258);
                }
                class612.method3521((byte) 15, class422.field5452 >> 4, class106.field1289 >> 4);
                class643.method3717((byte) -76);
                if (var5) {
                    class546.method3200(true);
                    class530.field7442 = new class308(1, class106.field1289, class422.field5452, true);
                    if (class593.field8620 == 0) {
                        class133.method748(class422.field5451, -24278, class530.field7442);
                        class503.method2906(true, (byte) 75);
                    } else {
                        class570.method3323(class422.field5451, 42, class530.field7442);
                        class503.method2906(true, (byte) 75);
                    }
                    class530.field7442.method2772(class103.field1258.field6681[0], -41, 0);
                    class530.field7442.method2767(20706, (class542[]) null, class210.field2560, (int[][][]) null);
                    class546.method3200(false);
                }
                class103.field1258.method2767(20706, class309.field3939, class210.field2560, var5 ? class530.field7442.field6681 : null);
                if (~class593.field8620 == -1) {
                    class503.method2906(true, (byte) 75);
                    class66.method374(class103.field1258, class550.field8087, 0);
                    if (class5.field44 != null) {
                        class614.method3525(arg0 + -18);
                    }
                } else {
                    class503.method2906(true, (byte) 75);
                    class181.method989(-125, class103.field1258, class550.field8087);
                }
                class116.method686(-2);
                if (class252.field3258 < 96) {
                    class425.method2395(true);
                }
                class503.method2906(true, (byte) 75);
                class103.field1258.method2765(class210.field2560, !var5 ? null : class370.field4884[0], (class174) null, -119);
                class103.field1258.method1712((byte) 94, class210.field2560);
                class503.method2906(true, (byte) 75);
                if (var5) {
                    class546.method3200(true);
                    class503.method2906(true, (byte) 75);
                    if (~class593.field8620 != -1) {
                        class181.method989(-124, class530.field7442, class74.field871);
                    } else {
                        class66.method374(class530.field7442, class74.field871, 0);
                    }
                    class116.method686(arg0 + -24);
                    class503.method2906(true, (byte) 75);
                    class530.field7442.method2765(class210.field2560, (class174) null, class90.field1114[0], arg0 + -126);
                    class530.field7442.method1712((byte) 104, class210.field2560);
                    class503.method2906(true, (byte) 75);
                    class546.method3200(false);
                }
                class13.method109(-544556112);
                int var9 = class103.field1258.field3930;
                if (~var9 < ~class442.field6099) {
                    var9 = class442.field6099;
                }
                if (class442.field6099 + -1 > var9) {
                    var9 = class442.field6099 + -1;
                }
                if (!class565.field8299.method3590(field7429, -2)) {
                    class493.method2842(var9);
                } else {
                    class493.method2842(0);
                }
                for (int var10 = 0; var10 < 4; ++var10) {
                    for (int var17 = 0; var17 < class106.field1289; ++var17) {
                        for (int var18 = 0; var18 < class422.field5452; ++var18) {
                            class343.method1910(var18, arg0 ^ -10742, var17, var10);
                        }
                    }
                }
                class40.method210(-101);
                class93.method560(true);
                class80.method461((byte) 66);
                class116.method686(-2);
                class5.method32(1);
                if (class431.field5843 != null && class597.field8642 != null && ~class137.field1671 == -11) {
                    class418.method2378(17984, class583.field8478);
                    ++class232.field2865;
                    class136.field1663.method2131(1057001181, -1495157560);
                }
                if (~class593.field8620 == -1) {
                    int var11 = (-(class106.field1289 >> 4) + class343.field4424) / 8;
                    int var12 = ((class106.field1289 >> 4) + class343.field4424) / 8;
                    int var13 = (-(class422.field5452 >> 4) + class522.field7330) / 8;
                    int var14 = (class522.field7330 - -(class422.field5452 >> 4)) / 8;
                    for (int var15 = var11 - 1; ~(var12 + 1) <= ~var15; ++var15) {
                        for (int var16 = var13 + -1; var14 - -1 >= var16; ++var16) {
                            if (~var15 > ~var11 || ~var12 > ~var15 || ~var13 < ~var16 || var16 > var14) {
                                class368.field4834.method2557("m" + var15 + "_" + var16, 1);
                                class368.field4834.method2557("l" + var15 + "_" + var16, 1);
                            }
                        }
                    }
                }
                if (~class137.field1671 != -4) {
                    if (~class137.field1671 == -8) {
                        class35.method200(6, 2);
                    } else {
                        class35.method200(9, 2);
                        if (class597.field8642 != null) {
                            class418.method2378(17984, class199.field2393);
                        }
                    }
                } else {
                    class35.method200(2, 2);
                }
                class253.method1434((byte) -75);
                class93.method560(true);
                class310.method1719(2);
            }
        }
    }

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "(ILqa;)Loj;")
    public final class318 method320(int arg0, class206 arg1) {
        ++field7415;
        if (this.field7430 == null) {
            return null;
        } else if (arg0 != -1) {
            return null;
        } else {
            class163 var3 = arg1.method1126();
            var3.method661(super.field240, super.field243, super.field244);
            class318 var4 = null;
            if (this.field7416) {
                var4 = class143.method788(0, 1);
            }
            this.field7430.method69(var3, var4 != null ? var4.field4059[0] : null, 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(ZLoe;ILqa;III)V")
    public final void method312(boolean arg0, class170 arg1, int arg2, class206 arg3, int arg4, int arg5, int arg6) {
        if (arg1 instanceof class529) {
            class529 var8 = (class529) arg1;
            if (this.field7430 != null && var8.field7430 != null) {
                this.field7430.method67(var8.field7430, arg6, arg4, arg2, arg0);
            }
        }
        if (arg5 == 13915) {
            ++field7426;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Z)I")
    public final int method337(boolean arg0) {
        ++field7428;
        return !arg0 ? -86 : 22;
    }

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "(ILqa;)Lso;")
    public final class398 method328(int arg0, class206 arg1) {
        if (this.field7423 == null) {
            this.field7423 = class533.method3049(super.field243, super.field240, (byte) 52, this.method3017(0, 112, arg1), super.field244);
        }
        ++field7432;
        if (arg0 != 12) {
            this.method326(-108, (class206) null);
        }
        return this.field7423;
    }

    @OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(Lqa;Lcn;IIIIZIZ)V")
    public class529(class206 arg0, class437 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, boolean arg8) {
        super(arg3, arg4, arg5, arg1.field5999, arg1.field6027, arg1.field5965);
        super.field240 = arg3;
        this.field7409 = arg8;
        this.field7425 = (byte) arg7;
        super.field244 = arg5;
        this.field7413 = (byte) arg2;
        this.field7400 = arg6;
        this.field7416 = ~arg1.field5972 != -1 && !arg6;
        this.field7427 = (short) arg1.field5996;
        this.field7424 = arg0.method1108() && arg1.field5978 && !this.field7400 && class565.field8299.method990(field7429, -1) != 0;
        int var10 = 2048;
        if (this.field7409) {
            var10 |= 65536;
        }
        class372 var11 = this.method3012((byte) 119, arg0, this.field7424, var10);
        if (var11 != null) {
            this.field7420 = var11.field4893;
            this.field7430 = var11.field4894;
            if (this.field7409) {
                this.field7430 = this.field7430.method64((byte) 0, var10, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(B)I")
    public final int method333(byte arg0) {
        if (arg0 != 70) {
            this.field7420 = null;
        }
        ++field7412;
        return this.field7425;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(JBLqa;)V")
    public static final void method3010(long arg0, byte arg1, class206 arg2) {
        class272.field3531 = 0;
        ++field7414;
        class496.field6896 = class641.field9246;
        if (arg1 != 91) {
            method3011((byte) 25);
        }
        class641.field9246 = 0;
        long var4 = class190.method1030(false);
        for (class455 var6 = (class455) class388.field5129.method1987(true); var6 != null; var6 = (class455) class388.field5129.method1994(6408)) {
            if (var6.method2655(arg2, arg0)) {
                ++class272.field3531;
            }
        }
        if (class398.field5242 && ~(arg0 % 100L) == -1L) {
            System.out.println("Particle system count: " + class388.field5129.method1993(arg1 + 15) + ", running: " + class272.field3531 + ". Particles: " + class641.field9246 + ". Time taken: " + (class190.method1030(false) + -var4) + "ms");
        }
    }

    @OriginalMember(owner = "client!sk", name = "g", descriptor = "(B)V")
    public static void method3011(byte arg0) {
        field7403 = null;
        if (arg0 <= -35) {
            field7435 = null;
            field7433 = null;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(BLqa;ZI)Ljc;")
    private final class372 method3012(byte arg0, class206 arg1, boolean arg2, int arg3) {
        ++field7419;
        if (arg0 <= 84) {
            this.method317(-85);
        }
        class437 var5 = class16.field126.method1759(false, 65535 & this.field7427);
        class174 var6;
        class174 var7;
        if (!this.field7400) {
            if (~this.field7413 <= -4) {
                var6 = null;
            } else {
                var6 = class90.field1114[this.field7413 - -1];
            }
            var7 = class90.field1114[this.field7413];
        } else {
            var6 = class90.field1114[0];
            var7 = class370.field4884[this.field7413];
        }
        return var5.method2541(var7, arg2, arg3, var6, arg1, super.field240, super.field244, 4, super.field243, this.field7425, 22);
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Lqa;Z)V")
    public final void method341(class206 arg0, boolean arg1) {
        ++field7407;
        Object var3 = null;
        if (arg1) {
            this.method318(8, (class206) null, 126, 23);
        }
        class483 var5;
        if (this.field7420 == null && this.field7424) {
            class372 var4 = this.method3012((byte) 126, arg0, true, 262144);
            var5 = var4 == null ? null : var4.field4893;
        } else {
            var5 = this.field7420;
            this.field7420 = null;
        }
        if (var5 != null) {
            class644.method3721(var5, this.field7413, super.field240, super.field244, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(ILqa;II)Z")
    public final boolean method318(int arg0, class206 arg1, int arg2, int arg3) {
        ++field7410;
        class157 var5 = this.method3017(131072, -107, arg1);
        if (var5 != null) {
            class163 var6 = arg1.method1126();
            var6.method661(super.field240, super.field243, super.field244);
            return var5.method91(arg2, arg3, var6, false);
        } else {
            if (arg0 != -21851) {
                method3014((byte) -59);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "(I)Z")
    public final boolean method332(int arg0) {
        ++field7431;
        int var2 = -50 / ((arg0 - 1) / 49);
        return this.field7424;
    }

    @OriginalMember(owner = "client!sk", name = "e", descriptor = "(I)V")
    public static final void method3013(int arg0) {
        ++field7397;
        int var1 = 0;
        if (class565.field8299.method993(field7429, -91)) {
            int var2 = var1 | 1;
            int var3 = var2 | 16;
            int var4 = var3 | 32;
            int var5 = var4 | 2;
            var1 = var5 | 4;
        }
        if (!class565.field8299.field2183) {
            var1 |= 64;
        }
        class435.method2512((byte) -105, var1);
        class16.field126.method1747(var1, false);
        class449.field6217.method2019(-19571, var1);
        class518.field7296.method143(var1, true);
        class344.field4461.method1392(true, var1);
        class93.method561(var1, -72);
        class166.method927(39, var1);
        class387.method2229(var1, arg0 + -24289);
        if (arg0 != 4) {
            field7433 = null;
        }
        class84.method499(var1, 94);
        class74.method422((byte) -86);
    }

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "(B)V")
    public final void method314(byte arg0) {
        ++field7406;
        this.field7409 = false;
        if (this.field7430 != null) {
            this.field7430.method72(this.field7430.method77() & -65537);
        }
        if (arg0 < 23) {
            this.field7400 = false;
        }
    }

    @OriginalMember(owner = "client!sk", name = "h", descriptor = "(B)I")
    public static final int method3014(byte arg0) {
        ++field7404;
        if (arg0 >= -16) {
            method3010(-49L, (byte) -11, (class206) null);
        }
        class641 var1 = class342.field4407;
        synchronized (class342.field4407) {
            return class342.field4407.method3685(0);
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(I)I")
    public final int method342(int arg0) {
        ++field7417;
        if (arg0 != -2329) {
            this.method314((byte) 41);
        }
        return this.field7427 & 65535;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(ZLqa;)V")
    public final void method336(boolean arg0, class206 arg1) {
        if (arg0) {
            method3015((byte) 42);
        }
        ++field7405;
        Object var3 = null;
        class483 var5;
        if (this.field7420 == null && this.field7424) {
            class372 var4 = this.method3012((byte) 104, arg1, true, 262144);
            var5 = var4 == null ? null : var4.field4893;
        } else {
            var5 = this.field7420;
            this.field7420 = null;
        }
        if (var5 != null) {
            class131.method738(var5, this.field7413, super.field240, super.field244, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!sk", name = "i", descriptor = "(B)V")
    public static final void method3015(byte arg0) {
        ++field7399;
        if (class220.field2721 != null) {
            if (class220.field2721.field7031 == 1) {
                class220.field2721 = null;
                return;
            }
            if (class220.field2721.field7031 == 2) {
                class250.method1422(class447.field6198, (byte) 105, 2, class246.field3155);
                class220.field2721 = null;
                return;
            }
        }
        int var1 = -11 / ((-79 - arg0) / 46);
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(ILqa;)V")
    public final void method326(int arg0, class206 arg1) {
        ++field7421;
        if (arg0 != 29657) {
            method3014((byte) -117);
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(ILqa;Z)Lr;")
    public final class157 method335(int arg0, class206 arg1, boolean arg2) {
        ++field7411;
        if (!arg2) {
            this.method328(74, (class206) null);
        }
        return this.method3017(arg0, 67, arg1);
    }

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "(B)V")
    public final void method339(byte arg0) {
        if (this.field7430 != null) {
            this.field7430.method97();
        }
        ++field7408;
        if (arg0 >= -114) {
            this.method336(false, (class206) null);
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(II)I")
    public static final int method3016(int arg0, int arg1) {
        if (arg1 != 1677232392) {
            method3015((byte) -82);
        }
        ++field7402;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IILqa;)Lr;")
    private final class157 method3017(int arg0, int arg1, class206 arg2) {
        ++field7418;
        if (this.field7430 != null && arg2.method1128(this.field7430.method77(), arg0) == 0) {
            return this.field7430;
        } else {
            int var4 = 117 / ((arg1 - -53) / 42);
            class372 var5 = this.method3012((byte) 91, arg2, false, arg0);
            return var5 == null ? null : var5.field4894;
        }
    }

    @OriginalMember(owner = "client!sk", name = "d", descriptor = "(I)Z")
    public final boolean method317(int arg0) {
        if (arg0 != 64) {
            this.method3012((byte) -4, (class206) null, false, -84);
        }
        ++field7422;
        return this.field7409;
    }

    static {
        int var0 = 0;
        field7435 = new byte[32896];
        for (int var1 = 0; var1 < 256; ++var1) {
            for (int var2 = 0; ~var1 <= ~var2; ++var2) {
                field7435[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
            }
        }
        new class180("This player is on a quick chat world and cannot receive your message.", "Der Spieler kann auf einer Direktchat-Welt keine Nachrichten empfangen.", "Ce joueur est sur un serveur à messagerie rapide et ne peut pas recevoir votre message.", "Este jogador não pode receber sua mensagem porque está em um mundo de papo rápido.");
    }
}
