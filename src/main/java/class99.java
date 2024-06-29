import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ur")
public class class99 extends class298 {

    @OriginalMember(owner = "client!ur", name = "N", descriptor = "I")
    private int field1210 = 4096;

    @OriginalMember(owner = "client!ur", name = "O", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field1211 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!ur", name = "Q", descriptor = "Lmc;")
    public static class340 field1213 = new class340();

    @OriginalMember(owner = "client!ur", name = "S", descriptor = "Lpn;")
    public static class72 field1215 = new class72(45, -1);

    @OriginalMember(owner = "client!ur", name = "K", descriptor = "I")
    public static int field1207;

    @OriginalMember(owner = "client!ur", name = "L", descriptor = "I")
    public static int field1208;

    @OriginalMember(owner = "client!ur", name = "M", descriptor = "I")
    public static int field1209;

    @OriginalMember(owner = "client!ur", name = "P", descriptor = "I")
    public static int field1212;

    @OriginalMember(owner = "client!ur", name = "R", descriptor = "I")
    public static int field1214;

    @OriginalMember(owner = "client!ur", name = "<init>", descriptor = "()V", line = 4)
    public class99() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(IZ)[I", line = 8)
    public final int[] method13(int arg0, boolean arg1) {
        ++field1208;
        int[] var3 = super.field4443.method2877(arg0, 1);
        if (!arg1) {
            field1211 = null;
        }
        if (super.field4443.field6915) {
            int[] var4 = this.method1882(0, -2594, class208.field2886 & arg0 - 1);
            int[] var5 = this.method1882(0, -2594, arg0);
            int[] var6 = this.method1882(0, -2594, class208.field2886 & arg0 - -1);
            for (int var7 = 0; ~class158.field1877 < ~var7; ++var7) {
                int var8 = (var6[var7] - var4[var7]) * this.field1210;
                int var9 = (var5[var7 + 1 & class474.field6656] - var5[var7 + -1 & class474.field6656]) * this.field1210;
                int var10 = var9 >> 12;
                int var11 = var8 >> 12;
                int var12 = var10 * var10 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = (int) (Math.sqrt((double) ((float) (var12 - -var13 + 4096) / 4096.0F)) * 4096.0D);
                int var15 = ~var14 == -1 ? 0 : 16777216 / var14;
                var3[var7] = -var15 + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ur", name = "c", descriptor = "(I)V", line = 64)
    public static void method485(int arg0) {
        field1215 = null;
        field1213 = null;
        if (arg0 > 62) {
            field1211 = null;
        }
    }

    @OriginalMember(owner = "client!ur", name = "d", descriptor = "(I)V", line = 76)
    public static final void method486(int arg0) {
        class401.method2397(false, arg0 + 23003);
        ++field1209;
        client.field3928 = 0;
        boolean var1 = true;
        for (int var2 = 0; ~var2 > ~class247.field3482.length; ++var2) {
            if (class78.field933[var2] != -1 && class247.field3482[var2] == null) {
                class247.field3482[var2] = class242.field3319.method2768(arg0 + 2531, 0, class78.field933[var2]);
                if (class247.field3482[var2] == null) {
                    ++client.field3928;
                    var1 = false;
                }
            }
            if (client.field3938[var2] != -1 && class420.field6064[var2] == null) {
                class420.field6064[var2] = class242.field3319.method2772(0, client.field3938[var2], class327.field4711[var2], (byte) 126);
                if (class420.field6064[var2] == null) {
                    var1 = false;
                    ++client.field3928;
                }
            }
            if (class170.field2017[var2] != -1 && class16.field215[var2] == null) {
                class16.field215[var2] = class242.field3319.method2768(-20472, 0, class170.field2017[var2]);
                if (class16.field215[var2] == null) {
                    var1 = false;
                    ++client.field3928;
                }
            }
            if (class216.field2981[var2] != -1 && class458.field6451[var2] == null) {
                class458.field6451[var2] = class242.field3319.method2768(-20472, 0, class216.field2981[var2]);
                if (class458.field6451[var2] == null) {
                    var1 = false;
                    ++client.field3928;
                }
            }
            if (class382.field5430 != null && class46.field602[var2] == null && class382.field5430[var2] != -1) {
                class46.field602[var2] = class242.field3319.method2772(0, class382.field5430[var2], class327.field4711[var2], (byte) 126);
                if (class46.field602[var2] == null) {
                    var1 = false;
                    ++client.field3928;
                }
            }
        }
        if (class340.field4883 == null) {
            if (class283.field4116 != null && class353.field5071.method2773(class283.field4116.field3142 + "_staticelements", -1)) {
                if (!class353.field5071.method2763(class283.field4116.field3142 + "_staticelements", 3)) {
                    var1 = false;
                    ++client.field3928;
                } else {
                    class340.field4883 = class408.method2426(class353.field5071, class101.field1234, 0, class283.field4116.field3142 + "_staticelements");
                }
            } else {
                class340.field4883 = new class318(0);
            }
        }
        if (!var1) {
            class148.field1808 = 1;
        } else {
            boolean var3 = true;
            class262.field3774 = 0;
            for (int var4 = 0; var4 < class247.field3482.length; ++var4) {
                byte[] var19 = class420.field6064[var4];
                if (var19 != null) {
                    int var20 = (class217.field3034[var4] >> 8) * 64 - class93.field1163;
                    int var21 = (255 & class217.field3034[var4]) * 64 + -class349.field5023;
                    if (class3.field23) {
                        var21 = 10;
                        var20 = 10;
                    }
                    var3 &= class225.method1239(var19, class159.field1895, (byte) -78, class289.field4316, var20, var21);
                }
                byte[] var22 = class458.field6451[var4];
                if (var22 != null) {
                    int var23 = (class217.field3034[var4] >> 8) * 64 + -class93.field1163;
                    int var24 = (255 & class217.field3034[var4]) * 64 + -class349.field5023;
                    if (class3.field23) {
                        var23 = 10;
                        var24 = 10;
                    }
                    var3 &= class225.method1239(var22, class159.field1895, (byte) 81, class289.field4316, var23, var24);
                }
            }
            if (!var3) {
                class148.field1808 = 2;
            } else {
                if (class148.field1808 != 0) {
                    class291.method1835(true, class273.field3875, class154.field1854.method205((byte) 113, class68.field849) + "<br>(100%)", false);
                }
                class199.method1094((byte) -47);
                class247.method1505(59);
                if (arg0 != -23003) {
                    field1213 = null;
                }
                boolean var5 = false;
                if (class231.field3205.method1400() && class342.field4899) {
                    for (int var6 = 0; var6 < class247.field3482.length; ++var6) {
                        if (class458.field6451[var6] != null || class16.field215[var6] != null) {
                            var5 = true;
                            break;
                        }
                    }
                }
                int var7;
                if (!class304.field4495) {
                    var7 = class325.field4688[class196.field2695];
                } else {
                    var7 = class180.field2273[class196.field2695];
                }
                if (class231.field3205.method1410()) {
                    ++var7;
                }
                client.method1662(7, 4, class159.field1895, class289.field4316, var7, var5, ~class231.field3205.method1345() < -1);
                for (int var8 = 0; ~var8 > -5; ++var8) {
                    class174.field2093[var8].method2534(arg0 + 23001);
                }
                class478.method2831((byte) -127);
                class110.method533(-1, false);
                class144.method679((byte) -106);
                class199.method1094((byte) -47);
                System.gc();
                class401.method2397(true, 0);
                class290.method1826((byte) -33);
                class392.field5585 = class27.field359;
                class430.field6225 = class342.field4899;
                class297.field4438 = !class304.field4496;
                class255.field3555 = class427.field6166;
                class173.field2083 = ~class275.field3918 <= -97;
                class110.field1337 = !class420.method2503((byte) -46) ? class346.field4942 : -1;
                class288.field4310 = class375.field5347 == 1 || class346.field4949;
                class422.field6097 = new class51(4, class159.field1895, class289.field4316, false);
                if (!class3.field23) {
                    class343.method2087((byte) 45, class422.field6097, class247.field3482);
                }
                if (class3.field23) {
                    class476.method2811(class247.field3482, class422.field6097, -86);
                }
                class195.method1059(class289.field4316 >> 4, class159.field1895 >> 4, -41);
                class354.method2147((byte) 93);
                if (var5) {
                    class270.method1634(true);
                    class401.field5716 = new class51(1, class159.field1895, class289.field4316, true);
                    if (!class3.field23) {
                        class343.method2087((byte) 29, class401.field5716, class16.field215);
                        class401.method2397(true, 0);
                    }
                    if (class3.field23) {
                        class476.method2811(class16.field215, class401.field5716, arg0 + 22920);
                        class401.method2397(true, 0);
                    }
                    class401.field5716.method1069(0, (byte) 73, class422.field6097.field2706[0]);
                    class401.field5716.method1063(0, class231.field3205, (int[][][]) null, (class424[]) null);
                    class270.method1634(false);
                }
                class422.field6097.method1063(0, class231.field3205, var5 ? class401.field5716.field2706 : null, class174.field2093);
                if (!class3.field23) {
                    class401.method2397(true, arg0 ^ -23003);
                    class210.method1171(class422.field6097, 64, class420.field6064);
                    if (class46.field602 != null) {
                        class317.method1953(arg0 + 1190561385);
                    }
                }
                if (class3.field23) {
                    class401.method2397(true, 0);
                    class175.method860(class420.field6064, class422.field6097, (byte) 122);
                }
                class247.method1505(arg0 + 23077);
                class401.method2397(true, arg0 + 23003);
                class422.field6097.method1068(class231.field3205, 30986, (class443) null, var5 ? class361.field5208[0] : null);
                class422.field6097.method272((byte) 87, class231.field3205);
                class401.method2397(true, 0);
                if (var5) {
                    class270.method1634(true);
                    class401.method2397(true, 0);
                    if (!class3.field23) {
                        class210.method1171(class401.field5716, 64, class458.field6451);
                    }
                    if (class3.field23) {
                        class175.method860(class458.field6451, class401.field5716, (byte) 90);
                    }
                    class247.method1505(69);
                    class401.method2397(true, arg0 ^ -23003);
                    class401.field5716.method1068(class231.field3205, arg0 + 53989, class443.field6329[0], (class443) null);
                    class401.field5716.method272((byte) 87, class231.field3205);
                    class401.method2397(true, 0);
                    class270.method1634(false);
                }
                class96.method474(-62);
                int var9 = class422.field6097.field668;
                if (~var9 < ~class100.field1217) {
                    var9 = class100.field1217;
                }
                if (class100.field1217 + -1 > var9) {
                    var9 = class100.field1217 + -1;
                }
                if (!class420.method2503((byte) 116)) {
                    class74.method380(var9);
                } else {
                    class74.method380(0);
                }
                for (int var10 = 0; ~var10 > -5; ++var10) {
                    for (int var17 = 0; var17 < class159.field1895; ++var17) {
                        for (int var18 = 0; var18 < class289.field4316; ++var18) {
                            class159.method768(var10, var18, var17, false);
                        }
                    }
                }
                class62.method317((byte) 0);
                class199.method1094((byte) -47);
                class113.method541(arg0 ^ 25976);
                class247.method1505(arg0 + 23091);
                class201.field2789 = false;
                class419.method2494((byte) -104);
                if (class41.field500 != null && class322.field4655 != null && ~class453.field6415 == -26) {
                    ++class103.field1244;
                    class244.method1332((byte) 124, class48.field627);
                    class230.field3185.method897(1057001181, arg0 + 22892);
                }
                if (!class3.field23) {
                    int var11 = (-(class159.field1895 >> 4) + class366.field5243) / 8;
                    int var12 = ((class159.field1895 >> 4) + class366.field5243) / 8;
                    int var13 = (-(class289.field4316 >> 4) + class312.field4565) / 8;
                    int var14 = ((class289.field4316 >> 4) + class312.field4565) / 8;
                    for (int var15 = var11 + -1; ~var15 >= ~(var12 - -1); ++var15) {
                        for (int var16 = var13 + -1; var16 <= var14 + 1; ++var16) {
                            if (~var11 < ~var15 || var12 < var15 || var16 < var13 || ~var14 > ~var16) {
                                class242.field3319.method2774("m" + var15 + "_" + var16, arg0 + 23103);
                                class242.field3319.method2774("l" + var15 + "_" + var16, 100);
                            }
                        }
                    }
                }
                if (~class453.field6415 == -29) {
                    class404.method2413(false, 10);
                } else {
                    class404.method2413(false, 30);
                    if (class322.field4655 != null) {
                        class244.method1332((byte) -14, class459.field6476);
                    }
                }
                class325.method1976(arg0 ^ 5527);
                class199.method1094((byte) -47);
                class192.method1053((byte) -46);
            }
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(IILvt;)V", line = 546)
    public final void method10(int arg0, int arg1, class179 arg2) {
        if (arg1 == 0) {
            this.field1210 = arg2.method916(21933);
        }
        ++field1212;
        if (arg0 > -44) {
            this.field1210 = -12;
        }
    }
}
