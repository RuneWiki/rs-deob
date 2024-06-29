import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ns")
public class class225 extends class499 {

    @OriginalMember(owner = "client!ns", name = "h", descriptor = "I")
    private int field2922;

    @OriginalMember(owner = "client!ns", name = "l", descriptor = "I")
    private int field2926;

    @OriginalMember(owner = "client!ns", name = "m", descriptor = "I")
    private int field2927;

    @OriginalMember(owner = "client!ns", name = "k", descriptor = "I")
    private int field2925;

    @OriginalMember(owner = "client!ns", name = "i", descriptor = "I")
    public static int field2923 = 0;

    @OriginalMember(owner = "client!ns", name = "n", descriptor = "Ljv;")
    public static class606 field2928 = new class606(1, 1);

    @OriginalMember(owner = "client!ns", name = "s", descriptor = "[I")
    public static int[] field2933 = new int[2];

    @OriginalMember(owner = "client!ns", name = "g", descriptor = "I")
    public static int field2921;

    @OriginalMember(owner = "client!ns", name = "j", descriptor = "I")
    public static int field2924;

    @OriginalMember(owner = "client!ns", name = "o", descriptor = "I")
    public static int field2929;

    @OriginalMember(owner = "client!ns", name = "p", descriptor = "I")
    public static int field2930;

    @OriginalMember(owner = "client!ns", name = "q", descriptor = "I")
    public static int field2931;

    @OriginalMember(owner = "client!ns", name = "r", descriptor = "I")
    public static int field2932;

    @OriginalMember(owner = "client!ns", name = "t", descriptor = "Lim;")
    public static class675 field2934;

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "(III)V")
    public final void method1374(int arg0, int arg1, int arg2) {
        ++field2932;
        int var4 = this.field2927 * arg0 >> 12;
        int var5 = this.field2926 * arg0 >> 12;
        int var6 = this.field2925 * arg2 >> 12;
        if (arg1 >= -112) {
            field2928 = null;
        }
        int var7 = this.field2922 * arg2 >> 12;
        class397.method2354(var4, -22726, var6, super.field6739, super.field6741, var7, super.field6738, var5);
    }

    @OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(IIIIIII)V")
    public class225(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field2922 = arg3;
        this.field2926 = arg2;
        this.field2927 = arg0;
        this.field2925 = arg1;
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(I)Z")
    public static final boolean method1375(int arg0) {
        if (arg0 != -1707434588) {
            field2934 = null;
        }
        ++field2929;
        if (class497.field6725) {
            try {
                if ((Boolean) class302.method1821(class372.field5359, 10049, "showingVideoAd")) {
                    return false;
                }
                return true;
            } catch (Throwable var1) {
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(III)V")
    public final void method1376(int arg0, int arg1, int arg2) {
        ++field2924;
        int var4 = this.field2927 * arg2 >> 12;
        int var5 = this.field2926 * arg2 >> 12;
        int var6 = this.field2925 * arg1 >> 12;
        int var7 = this.field2922 * arg1 >> 12;
        if (arg0 >= 16) {
            class390.method2330(var4, super.field6741, var5, super.field6739, var6, 10626, var7);
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(B)V")
    public static void method1377(byte arg0) {
        if (arg0 != 75) {
            method1378((byte) 89);
        }
        field2933 = null;
        field2934 = null;
        field2928 = null;
    }

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "(B)V")
    public static final void method1378(byte arg0) {
        class316.method2038(0);
        if (arg0 == -127) {
            ++field2931;
            class319.method2069(2, (byte) 82, class72.field935.field6494, 22050);
            class571.field7908 = class325.method2085(22050, class495.field6687, class249.field3351, arg0 + 193, 0);
            class571.field7908.method3602((byte) -105, class451.field6153);
            class304.field4096 = class325.method2085(2048, class495.field6687, class249.field3351, 95, 1);
            class304.field4096.method3602((byte) -105, class285.field3866);
        }
    }

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "(I)V")
    public static final void method1379(int arg0) {
        ++field2921;
        class448.method2563(-51, false);
        class158.field1980 = 0;
        boolean var1 = true;
        for (int var2 = 0; ~class681.field9677.length < ~var2; ++var2) {
            if (class480.field6461[var2] != -1 && class681.field9677[var2] == null) {
                class681.field9677[var2] = class397.field5664.method1087(class480.field6461[var2], 0, arg0 + -21235);
                if (class681.field9677[var2] == null) {
                    ++class158.field1980;
                    var1 = false;
                }
            }
            if (~class448.field6135[var2] != 0 && class93.field1153[var2] == null) {
                class93.field1153[var2] = class397.field5664.method1080(0, class448.field6135[var2], (byte) -64, class244.field3288[var2]);
                if (class93.field1153[var2] == null) {
                    ++class158.field1980;
                    var1 = false;
                }
            }
            if (class80.field1012[var2] != -1 && class73.field940[var2] == null) {
                class73.field940[var2] = class397.field5664.method1087(class80.field1012[var2], 0, 1);
                if (class73.field940[var2] == null) {
                    ++class158.field1980;
                    var1 = false;
                }
            }
            if (class683.field9707[var2] != -1 && class278.field3768[var2] == null) {
                class278.field3768[var2] = class397.field5664.method1087(class683.field9707[var2], 0, 1);
                if (class278.field3768[var2] == null) {
                    ++class158.field1980;
                    var1 = false;
                }
            }
            if (class161.field2043 != null && class552.field7552[var2] == null && ~class161.field2043[var2] != 0) {
                class552.field7552[var2] = class397.field5664.method1080(0, class161.field2043[var2], (byte) 126, class244.field3288[var2]);
                if (class552.field7552[var2] == null) {
                    ++class158.field1980;
                    var1 = false;
                }
            }
        }
        if (class204.field2673 == null) {
            if (class19.field179 != null && class307.field4123.method1062(106, class19.field179.field3375 + "_staticelements")) {
                if (class307.field4123.method1083(arg0 + -21311, class19.field179.field3375 + "_staticelements")) {
                    class204.field2673 = class157.method1052(class19.field179.field3375 + "_staticelements", class624.field8492, (byte) -75, class307.field4123);
                } else {
                    ++class158.field1980;
                    var1 = false;
                }
            } else {
                class204.field2673 = new class610(0);
            }
        }
        if (!var1) {
            class690.field9746 = 1;
        } else {
            class398.field5673 = 0;
            boolean var3 = true;
            for (int var4 = 0; var4 < class681.field9677.length; ++var4) {
                byte[] var19 = class93.field1153[var4];
                if (var19 != null) {
                    int var20 = (class339.field4957[var4] >> 8) * 64 - class253.field3490;
                    int var21 = (255 & class339.field4957[var4]) * 64 + -class186.field2280;
                    if (~class429.field5954 != -1) {
                        var21 = 10;
                        var20 = 10;
                    }
                    var3 &= class270.method1655(class12.field113, 0, var19, class588.field8082, var21, var20);
                }
                byte[] var22 = class278.field3768[var4];
                if (var22 != null) {
                    int var23 = (class339.field4957[var4] >> 8) * 64 + -class253.field3490;
                    int var24 = (255 & class339.field4957[var4]) * 64 + -class186.field2280;
                    if (~class429.field5954 != -1) {
                        var23 = 10;
                        var24 = 10;
                    }
                    var3 &= class270.method1655(class12.field113, 0, var22, class588.field8082, var24, var23);
                }
            }
            if (!var3) {
                class690.field9746 = 2;
            } else {
                if (class690.field9746 != 0) {
                    class82.method463(class243.field3176.method1491(class350.field5121, (byte) 127) + "<br>(100%)", class395.field5658, arg0 + -21170, true);
                }
                class155.method1031(-104);
                class308.method1848(true);
                boolean var5 = false;
                if (class9.field103.method1901() && class72.field935.field6491) {
                    for (int var6 = 0; ~var6 > ~class681.field9677.length; ++var6) {
                        if (class278.field3768[var6] != null || class73.field940[var6] != null) {
                            var5 = true;
                            break;
                        }
                    }
                }
                int var7;
                if (class72.field935.field6510) {
                    var7 = class139.field1786[class360.field5198];
                } else {
                    var7 = class249.field3355[class360.field5198];
                }
                if (class9.field103.method1903()) {
                    ++var7;
                }
                class331.method2120(9, 4, class588.field8082, class12.field113, var7, var5, class9.field103.method1962() > 0);
                for (int var8 = 0; ~var8 > -5; ++var8) {
                    class624.field8489[var8].method1502(false);
                }
                class98.method539(-5250);
                class243.method1489(false, (byte) 121);
                class195.method1244(false);
                class397.field5668 = null;
                class426.field5927 = false;
                class155.method1031(-91);
                System.gc();
                class448.method2563(arg0 + -21287, true);
                class318.method2055((byte) 74);
                class523.field7249 = class72.field935.method2693(class161.field2038, (byte) 91);
                if (arg0 == 21236) {
                    class223.field2896 = class72.field935.field6491;
                    class308.field4132 = class77.field969 >= 96;
                    class593.field8135 = class72.field935.method2695(false, class161.field2038);
                    class553.field7575 = !class72.field935.field6522;
                    class669.field9513 = !class72.field935.method1861(class161.field2038, -114) ? class160.field2028 : -1;
                    class473.field6396 = class308.method1846(class161.field2038, true) || class72.field935.field6525;
                    class118.field1523 = class72.field935.field6499;
                    class44.field571 = new class110(4, class588.field8082, class12.field113, false);
                    if (~class429.field5954 != -1) {
                        class554.method3109(class681.field9677, 26821, class44.field571);
                    } else {
                        class365.method2241(class681.field9677, false, class44.field571);
                    }
                    class430.method2475(class12.field113 >> 4, (byte) 38, class588.field8082 >> 4);
                    class194.method1238((byte) 79);
                    if (var5) {
                        class669.method3708(true);
                        class189.field2468 = new class110(1, class588.field8082, class12.field113, true);
                        if (~class429.field5954 == -1) {
                            class365.method2241(class73.field940, false, class189.field2468);
                            class448.method2563(-51, true);
                        } else {
                            class554.method3109(class73.field940, 26821, class189.field2468);
                            class448.method2563(-51, true);
                        }
                        class189.field2468.method2931(0, class44.field571.field7060[0], 57);
                        class189.field2468.method2936((int[][][]) null, (byte) -67, class9.field103, (class245[]) null);
                        class669.method3708(false);
                    }
                    class44.field571.method2936(var5 ? class189.field2468.field7060 : null, (byte) -67, class9.field103, class624.field8489);
                    if (~class429.field5954 != -1) {
                        class448.method2563(-51, true);
                        class499.method2808(-97, class93.field1153, class44.field571);
                    } else {
                        class448.method2563(-51, true);
                        class490.method2722(class93.field1153, -56, class44.field571);
                        if (class552.field7552 != null) {
                            class329.method2111(false);
                        }
                    }
                    class308.method1848(true);
                    if (class77.field969 < 96) {
                        class457.method2584(arg0 ^ -21156);
                    }
                    class448.method2563(-51, true);
                    class44.field571.method2935(!var5 ? null : class185.field2270[0], (byte) 27, (class176) null, class9.field103);
                    class44.field571.method585(class9.field103, (byte) -83);
                    class448.method2563(-51, true);
                    if (var5) {
                        class669.method3708(true);
                        class448.method2563(arg0 ^ -21191, true);
                        if (class429.field5954 == 0) {
                            class490.method2722(class278.field3768, arg0 + -21290, class189.field2468);
                        } else {
                            class499.method2808(-122, class278.field3768, class189.field2468);
                        }
                        class308.method1848(true);
                        class448.method2563(-51, true);
                        class189.field2468.method2935((class176) null, (byte) 27, class249.field3345[0], class9.field103);
                        class189.field2468.method585(class9.field103, (byte) -114);
                        class448.method2563(arg0 ^ -21191, true);
                        class669.method3708(false);
                    }
                    class6.method38(true);
                    int var9 = class44.field571.field1329;
                    if (class432.field5993 < var9) {
                        var9 = class432.field5993;
                    }
                    if (class432.field5993 + -1 > var9) {
                        var9 = class432.field5993 + -1;
                    }
                    if (class72.field935.method1861(class161.field2038, 64)) {
                        class320.method2074(0);
                    } else {
                        class320.method2074(var9);
                    }
                    for (int var10 = 0; ~var10 > -5; ++var10) {
                        for (int var17 = 0; ~class588.field8082 < ~var17; ++var17) {
                            for (int var18 = 0; ~class12.field113 < ~var18; ++var18) {
                                class341.method2163(var10, var17, 0, var18);
                            }
                        }
                    }
                    class430.method2478((byte) -124);
                    class155.method1031(-81);
                    class620.method3392((byte) -124);
                    class308.method1848(true);
                    class4.method18(-5788);
                    if (class250.field3376 != null && class80.field1014 != null && ~class476.field6436 == -12) {
                        ++class544.field7464;
                        class389.method2326((byte) 118, client.field2993);
                        class253.field3491.method906(-1, 1057001181);
                    }
                    if (~class429.field5954 == -1) {
                        int var11 = (class690.field9747 - (class588.field8082 >> 4)) / 8;
                        int var12 = ((class588.field8082 >> 4) + class690.field9747) / 8;
                        int var13 = (class179.field2235 - (class12.field113 >> 4)) / 8;
                        int var14 = ((class12.field113 >> 4) + class179.field2235) / 8;
                        for (int var15 = var11 + -1; ~(var12 + 1) <= ~var15; ++var15) {
                            for (int var16 = var13 + -1; ~var16 >= ~(var14 + 1); ++var16) {
                                if (var11 > var15 || ~var12 > ~var15 || ~var16 > ~var13 || var16 > var14) {
                                    class397.field5664.method1057("m" + var15 + "_" + var16, (byte) -6);
                                    class397.field5664.method1057("l" + var15 + "_" + var16, (byte) -6);
                                }
                            }
                        }
                    }
                    if (~class476.field6436 == -5) {
                        class676.method3739(-22149, 3);
                    } else if (class476.field6436 == 8) {
                        class676.method3739(arg0 + -43385, 7);
                    } else {
                        class676.method3739(-22149, 10);
                        if (class80.field1014 != null) {
                            class389.method2326((byte) 118, class171.field2147);
                        }
                    }
                    class186.method1192((byte) -128);
                    class155.method1031(-46);
                    class471.method2653(-116);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(IBI)V")
    public final void method1380(int arg0, byte arg1, int arg2) {
        ++field2930;
        int var4 = this.field2927 * arg2 >> 12;
        int var5 = this.field2926 * arg2 >> 12;
        int var6 = this.field2925 * arg0 >> 12;
        if (arg1 != -20) {
            method1375(39);
        }
        int var7 = this.field2922 * arg0 >> 12;
        class603.method3332((byte) 126, var5, var6, var7, super.field6738, var4);
    }
}
