import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class160 extends class167 {

    @OriginalMember(owner = "client!og", name = "cb", descriptor = "[S")
    private short[] field2927 = new short[257];

    @OriginalMember(owner = "client!og", name = "gb", descriptor = "I")
    private int field2931 = 0;

    @OriginalMember(owner = "client!og", name = "eb", descriptor = "I")
    public static int field2929 = (int) (Math.random() * 17.0D) + -8;

    @OriginalMember(owner = "client!og", name = "bb", descriptor = "I")
    public static int field2926 = 0;

    @OriginalMember(owner = "client!og", name = "T", descriptor = "I")
    public static int field2918;

    @OriginalMember(owner = "client!og", name = "U", descriptor = "I")
    public static int field2919;

    @OriginalMember(owner = "client!og", name = "W", descriptor = "I")
    public static int field2921;

    @OriginalMember(owner = "client!og", name = "Y", descriptor = "I")
    public static int field2923;

    @OriginalMember(owner = "client!og", name = "Z", descriptor = "I")
    public static int field2924;

    @OriginalMember(owner = "client!og", name = "ab", descriptor = "I")
    public static int field2925;

    @OriginalMember(owner = "client!og", name = "db", descriptor = "I")
    public static int field2928;

    @OriginalMember(owner = "client!og", name = "fb", descriptor = "I")
    public static int field2930;

    @OriginalMember(owner = "client!og", name = "hb", descriptor = "I")
    public static int field2932;

    @OriginalMember(owner = "client!og", name = "X", descriptor = "[I")
    private int[] field2922;

    @OriginalMember(owner = "client!og", name = "ib", descriptor = "[I")
    private int[] field2933;

    @OriginalMember(owner = "client!og", name = "V", descriptor = "[[I")
    private int[][] field2920;

    @OriginalMember(owner = "client!og", name = "f", descriptor = "(I)V")
    public static final void method1137(int arg0) {
        if (class5.field79 > 0) {
            --class5.field79;
        }
        ++field2930;
        if (class10.field357 > 1) {
            class50.field1038 = class194.field3470;
            --class10.field357;
        }
        if (class231.field4154) {
            class231.field4154 = false;
            class141.method961(-1);
        } else {
            for (int var1 = 0; ~var1 > -101 && class11.method117(false); ++var1) {
            }
            if (class150.field2736 == 30) {
                class8.method58(0, class105.field1911, 56);
                Object var2 = class203.field3665.field798;
                synchronized (class203.field3665.field798) {
                    if (!class61.field1235) {
                        class203.field3665.field806 = 0;
                    } else if (class215.field3907 != 0 || ~class203.field3665.field806 <= -41) {
                        ++class62.field1250;
                        class105.field1911.method400(111, 8);
                        class105.field1911.method1002(false, 0);
                        int var3 = class105.field1911.field2643;
                        int var4 = 0;
                        for (int var5 = 0; ~class203.field3665.field806 < ~var5 && ~(-var3 + class105.field1911.field2643) > -241; ++var5) {
                            int var6 = class203.field3665.field805[var5];
                            int var7 = class203.field3665.field802[var5];
                            ++var4;
                            if (var7 < 0) {
                                var7 = 0;
                            } else if (var7 > 502) {
                                var7 = 502;
                            }
                            if (var6 < 0) {
                                var6 = 0;
                            } else if (var6 > 764) {
                                var6 = 764;
                            }
                            int var8 = var7 * 765 + var6;
                            if (~class203.field3665.field802[var5] == 0 && class203.field3665.field805[var5] == -1) {
                                var6 = -1;
                                var7 = -1;
                                var8 = 524287;
                            }
                            if (class94.field1729 == var6 && ~class25.field635 == ~var7) {
                                if (~class93.field1707 > -2048) {
                                    ++class93.field1707;
                                }
                            } else {
                                int var9 = -class94.field1729 + var6;
                                class94.field1729 = var6;
                                int var10 = -class25.field635 + var7;
                                class25.field635 = var7;
                                if (~class93.field1707 > -9 && var9 >= -32 && ~var9 >= -32 && ~var10 <= 31 && ~var10 >= -32) {
                                    var9 += 32;
                                    var10 += 32;
                                    class105.field1911.method993(false, (class93.field1707 << 12) + (var9 << 6) + var10);
                                    class93.field1707 = 0;
                                } else if (class93.field1707 < 8) {
                                    class105.field1911.method1032(255, (class93.field1707 << 19) + (8388608 - -var8));
                                    class93.field1707 = 0;
                                } else {
                                    class105.field1911.method1024(-128, (class93.field1707 << 19) + var8 + -1073741824);
                                    class93.field1707 = 0;
                                }
                            }
                        }
                        class105.field1911.method1007(-var3 + class105.field1911.field2643, true);
                        if (~class203.field3665.field806 >= ~var4) {
                            class203.field3665.field806 = 0;
                        } else {
                            class203.field3665.field806 -= var4;
                            for (int var11 = 0; var11 < class203.field3665.field806; ++var11) {
                                class203.field3665.field805[var11] = class203.field3665.field805[var11 - -var4];
                                class203.field3665.field802[var11] = class203.field3665.field802[var4 + var11];
                            }
                        }
                    }
                }
                if (~class215.field3907 != -1) {
                    long var12 = (-class158.field2869 + class171.field3089) / 50L;
                    if (var12 > 4095L) {
                        var12 = 4095L;
                    }
                    class158.field2869 = class171.field3089;
                    int var14 = class41.field929;
                    ++class234.field4230;
                    if (~var14 > -1) {
                        var14 = 0;
                    } else if (~var14 < -503) {
                        var14 = 502;
                    }
                    int var15 = class187.field3353;
                    if (var15 >= 0) {
                        if (~var15 < -765) {
                            var15 = 764;
                        }
                    } else {
                        var15 = 0;
                    }
                    byte var16 = 0;
                    if (class215.field3907 == 2) {
                        var16 = 1;
                    }
                    int var17 = (int) var12;
                    int var18 = var14 * 765 + var15;
                    class105.field1911.method400(63, 8);
                    class105.field1911.method1014((var17 << 20) + ((var16 << 19) - -var18), -1);
                }
                if (~class221.field3981 < -1) {
                    --class221.field3981;
                }
                if (class53.field1090[96] || class53.field1090[97] || class53.field1090[98] || class53.field1090[99]) {
                    class166.field3002 = true;
                }
                if (class166.field3002 && ~class221.field3981 >= -1) {
                    ++class246.field4532;
                    class166.field3002 = false;
                    class221.field3981 = 20;
                    class105.field1911.method400(173, 8);
                    class105.field1911.method1046(121, client.field776);
                    class105.field1911.method993(false, class139.field2532);
                }
                if (class228.field4106 && !class170.field3051) {
                    class170.field3051 = true;
                    ++class98.field1802;
                    class105.field1911.method400(130, 8);
                    class105.field1911.method1002(false, 1);
                }
                if (!class228.field4106 && class170.field3051) {
                    class170.field3051 = false;
                    ++class98.field1802;
                    class105.field1911.method400(130, 8);
                    class105.field1911.method1002(false, 0);
                }
                class43.method366(-63);
                if (~class150.field2736 == -31) {
                    class234.method1510((byte) -119);
                    class31.method266((byte) 99);
                    ++class44.field964;
                    if (class44.field964 > 750) {
                        class141.method961(-1);
                    } else {
                        class18.method170(-111);
                        class196.method1301((byte) -116);
                        class82.method560((byte) 26);
                        if (class166.field2994 != null) {
                            class96.method652(2);
                        }
                        if (~class166.field2997 != -1) {
                            class174.field3131 += 20;
                            if (~class174.field3131 <= -401) {
                                class166.field2997 = 0;
                            }
                        }
                        ++class28.field691;
                        if (class115.field2141 != null) {
                            ++class175.field3169;
                            if (class175.field3169 >= 15) {
                                class62.method457(class115.field2141, 0);
                                class115.field2141 = null;
                            }
                        }
                        if (class19.field537 != null) {
                            class62.method457(class19.field537, 0);
                            ++class74.field1404;
                            if (class137.field2479 > class40.field908 + 5 || class40.field908 + -5 > class137.field2479 || ~(class130.field2396 + 5) > ~class199.field3571 || ~class199.field3571 > ~(class130.field2396 + -5)) {
                                class193.field3457 = true;
                            }
                            if (~class30.field719 == -1) {
                                if (class193.field3457 && ~class74.field1404 <= -6) {
                                    if (class240.field4339 == class19.field537 && ~class30.field713 != ~class109.field2059) {
                                        class9 var19 = class19.field537;
                                        byte var20 = 0;
                                        if (~class179.field3245 == -2 && ~var19.field244 == -207) {
                                            var20 = 1;
                                        }
                                        if (var19.field224[class109.field2059] <= 0) {
                                            var20 = 0;
                                        }
                                        ++class101.field1848;
                                        if (!class213.method1400(class187.method1269(var19, (byte) 16), (byte) -84)) {
                                            if (~var20 != -2) {
                                                var19.method77(54, class30.field713, class109.field2059);
                                            } else {
                                                int var21 = class109.field2059;
                                                int var22 = class30.field713;
                                                while (~var21 != ~var22) {
                                                    if (~var21 <= ~var22) {
                                                        if (~var22 > ~var21) {
                                                            var19.method77(-99, var22, var22 + 1);
                                                            ++var22;
                                                        }
                                                    } else {
                                                        var19.method77(108, var22, var22 + -1);
                                                        --var22;
                                                    }
                                                }
                                            }
                                        } else {
                                            int var23 = class109.field2059;
                                            int var24 = class30.field713;
                                            var19.field224[var23] = var19.field224[var24];
                                            var19.field189[var23] = var19.field189[var24];
                                            var19.field224[var24] = -1;
                                            var19.field189[var24] = 0;
                                        }
                                        class105.field1911.method400(207, 8);
                                        class105.field1911.method1040((byte) 105, class19.field537.field218);
                                        class105.field1911.method1017(class30.field713, false);
                                        class105.field1911.method1011(var20, 128);
                                        class105.field1911.method1005(27318, class109.field2059);
                                    }
                                } else if ((~class196.field3493 == -2 || class171.method1201((byte) -15, class100.field1825 + -1)) && class100.field1825 > 2) {
                                    class184.method1261(-110);
                                } else if (class100.field1825 > 0) {
                                    class72.method511(class100.field1825 + -1, -103);
                                }
                                class175.field3169 = 10;
                                class19.field537 = null;
                                class215.field3907 = 0;
                            }
                        }
                        class119.field2243 = 0;
                        class143.field2599 = false;
                        class51.field1045 = null;
                        class133.field2404 = false;
                        class9 var25 = class28.field685;
                        class9 var26 = class196.field3500;
                        class28.field685 = null;
                        class196.field3500 = null;
                        while (class119.method834(-114) && class119.field2243 < 128) {
                            class66.field1269[class119.field2243] = class223.field4024;
                            class239.field4329[class119.field2243] = class143.field2590;
                            ++class119.field2243;
                        }
                        class166.field2994 = null;
                        if (class92.field1697 != -1) {
                            class86.method601(0, 0, 0, class97.field1793, class92.field1697, 0, 117, class124.field2324);
                        }
                        ++class194.field3470;
                        while (true) {
                            class51 var27;
                            class9 var28;
                            class9 var29;
                            do {
                                var27 = (class51) class39.field886.method326(-101);
                                if (var27 == null) {
                                    while (true) {
                                        class51 var30;
                                        class9 var31;
                                        class9 var32;
                                        do {
                                            var30 = (class51) class196.field3514.method326(-100);
                                            if (var30 == null) {
                                                while (true) {
                                                    class51 var33;
                                                    class9 var34;
                                                    class9 var35;
                                                    do {
                                                        var33 = (class51) class232.field4181.method326(-127);
                                                        if (var33 == null) {
                                                            if (class109.field2061 && class166.field2994 == null) {
                                                                class109.field2061 = false;
                                                            }
                                                            if (class67.field1290 != null) {
                                                                class213.method1398((byte) -50);
                                                            }
                                                            if (~class3.field47 != 0) {
                                                                int var36 = class3.field47;
                                                                int var37 = class217.field3951;
                                                                boolean var38 = class169.method1190(var37, 0, 0, true, 0, (byte) 123, class93.field1712.field4266[0], class93.field1712.field4259[0], 0, var36, 0, 0);
                                                                if (var38) {
                                                                    class166.field2997 = 1;
                                                                    class137.field2472 = class41.field929;
                                                                    class174.field3131 = 0;
                                                                    class145.field2641 = class187.field3353;
                                                                }
                                                                class3.field47 = -1;
                                                            }
                                                            class226.method1460(23907);
                                                            if (class196.field3500 != var26) {
                                                                if (var26 != null) {
                                                                    class62.method457(var26, 0);
                                                                }
                                                                if (class196.field3500 != null) {
                                                                    class62.method457(class196.field3500, 0);
                                                                }
                                                            }
                                                            if (class28.field685 != var25 && class8.field138 == class165.field2987) {
                                                                if (var25 != null) {
                                                                    class62.method457(var25, 0);
                                                                }
                                                                if (class28.field685 != null) {
                                                                    class62.method457(class28.field685, 0);
                                                                }
                                                            }
                                                            if (class28.field685 != null) {
                                                                if (class8.field138 > class165.field2987) {
                                                                    ++class165.field2987;
                                                                    if (class8.field138 == class165.field2987) {
                                                                        class62.method457(class28.field685, 0);
                                                                    }
                                                                }
                                                            } else if (class165.field2987 > 0) {
                                                                --class165.field2987;
                                                            }
                                                            class166.method1179(-4);
                                                            if (class162.field2967) {
                                                                class162.method1154(-125);
                                                            }
                                                            for (int var39 = 0; ~var39 > -6; ++var39) {
                                                                int var10002 = class75.field1427[var39]++;
                                                            }
                                                            int var40 = class28.method238(0);
                                                            int var41 = class24.method211((byte) -54);
                                                            if (var40 > 4500 && var41 > 4500) {
                                                                ++class68.field1308;
                                                                class5.field79 = 250;
                                                                class157.method1113((byte) -47, 4000);
                                                                class105.field1911.method400(226, 8);
                                                            }
                                                            ++class97.field1782;
                                                            if (arg0 < 92) {
                                                                field2929 = -109;
                                                            }
                                                            ++class174.field3129;
                                                            ++class123.field2299;
                                                            if (~class174.field3129 < -501) {
                                                                class174.field3129 = 0;
                                                                int var42 = (int) (Math.random() * 8.0D);
                                                                if ((var42 & 2) == 2) {
                                                                    class215.field3896 += class95.field1742;
                                                                }
                                                                if ((4 & var42) == 4) {
                                                                    class80.field1505 += class234.field4234;
                                                                }
                                                                if ((1 & var42) == 1) {
                                                                    class92.field1691 += class191.field3410;
                                                                }
                                                            }
                                                            if (~class215.field3896 > 54) {
                                                                class95.field1742 = 2;
                                                            }
                                                            if (~class80.field1505 > 39) {
                                                                class234.field4234 = 1;
                                                            }
                                                            if (~class80.field1505 < -41) {
                                                                class234.field4234 = -1;
                                                            }
                                                            if (class215.field3896 > 55) {
                                                                class95.field1742 = -2;
                                                            }
                                                            if (~class92.field1691 > 49) {
                                                                class191.field3410 = 2;
                                                            }
                                                            if (class97.field1782 > 500) {
                                                                class97.field1782 = 0;
                                                                int var43 = (int) (8.0D * Math.random());
                                                                if (~(2 & var43) == -3) {
                                                                    class174.field3151 += class115.field2143;
                                                                }
                                                                if (~(var43 & 1) == -2) {
                                                                    class13.field427 += class200.field3626;
                                                                }
                                                            }
                                                            if (~class13.field427 > 59) {
                                                                class200.field3626 = 2;
                                                            }
                                                            if (~class174.field3151 > 19) {
                                                                class115.field2143 = 1;
                                                            }
                                                            if (~class13.field427 < -61) {
                                                                class200.field3626 = -2;
                                                            }
                                                            if (~class92.field1691 < -51) {
                                                                class191.field3410 = -2;
                                                            }
                                                            if (class174.field3151 > 10) {
                                                                class115.field2143 = -1;
                                                            }
                                                            if (~class123.field2299 < -51) {
                                                                class105.field1911.method400(19, 8);
                                                                ++class208.field3731;
                                                            }
                                                            try {
                                                                if (class207.field3717 != null && class105.field1911.field2643 > 0) {
                                                                    class207.field3717.method750(0, class105.field1911.field2613, -7115, class105.field1911.field2643);
                                                                    class105.field1911.field2643 = 0;
                                                                    class123.field2299 = 0;
                                                                    return;
                                                                }
                                                                return;
                                                            } catch (IOException var44) {
                                                                class141.method961(-1);
                                                                return;
                                                            }
                                                        }
                                                        var34 = var33.field1046;
                                                        if (~var34.field239 > -1) {
                                                            break;
                                                        }
                                                        var35 = class119.method837((byte) 91, var34.field175);
                                                    } while (var35 == null || var35.field157 == null || ~var35.field157.length >= ~var34.field239 || var35.field157[var34.field239] != var34);
                                                    class102.method689(var33, -100);
                                                }
                                            }
                                            var31 = var30.field1046;
                                            if (~var31.field239 > -1) {
                                                break;
                                            }
                                            var32 = class119.method837((byte) 90, var31.field175);
                                        } while (var32 == null || var32.field157 == null || var31.field239 >= var32.field157.length || var32.field157[var31.field239] != var31);
                                        class102.method689(var30, -106);
                                    }
                                }
                                var28 = var27.field1046;
                                if (~var28.field239 > -1) {
                                    break;
                                }
                                var29 = class119.method837((byte) 111, var28.field175);
                            } while (var29 == null || var29.field157 == null || ~var29.field157.length >= ~var28.field239 || var29.field157[var28.field239] != var28);
                            class102.method689(var27, -120);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(BI)[I")
    public final int[] method53(byte arg0, int arg1) {
        if (arg0 != -96) {
            this.field2927 = null;
        }
        ++field2932;
        int[] var3 = super.field3013.method1463((byte) -115, arg1);
        if (super.field3013.field4085) {
            int[] var4 = this.method1186(arg1, 0, 0);
            for (int var5 = 0; ~var5 > ~class115.field2146; ++var5) {
                int var6 = var4[var5] >> 4;
                if (var6 < 0) {
                    var6 = 0;
                }
                if (var6 > 256) {
                    var6 = 256;
                }
                var3[var5] = this.field2927[var6];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Lnc;ZI)V")
    public final void method51(class145 arg0, boolean arg1, int arg2) {
        if (!arg1) {
            if (arg2 == 0) {
                this.field2931 = arg0.method998(109);
                this.field2920 = new int[arg0.method998(109)][2];
                for (int var4 = 0; this.field2920.length > var4; ++var4) {
                    this.field2920[var4][0] = arg0.method1049((byte) 117);
                    this.field2920[var4][1] = arg0.method1049((byte) 108);
                }
            }
            ++field2928;
        }
    }

    @OriginalMember(owner = "client!og", name = "g", descriptor = "(I)V")
    private final void method1138(int arg0) {
        int var2 = this.field2931;
        if (~var2 != -3) {
            if (var2 == 1) {
                for (int var3 = 0; var3 < 257; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; this.field2920.length + -1 > var5 && this.field2920[var5][0] <= var4; ++var5) {
                    }
                    int[] var6 = this.field2920[var5 - 1];
                    int[] var7 = this.field2920[var5];
                    int var8 = (-var6[0] + var4 << 12) / (var7[0] + -var6[0]);
                    int var9 = -class60.field1218[255 & var8 >> 5] + 4096 >> 1;
                    int var10 = 4096 - var9;
                    int var11 = var6[1] * var10 + var7[1] * var9 >> 12;
                    if (var11 <= -32768) {
                        var11 = -32767;
                    }
                    if (~var11 <= -32769) {
                        var11 = 32767;
                    }
                    this.field2927[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; ~var12 > -258; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; ~(this.field2920.length - 1) < ~var14 && ~this.field2920[var14][0] >= ~var13; ++var14) {
                    }
                    int[] var15 = this.field2920[var14 + -1];
                    int[] var16 = this.field2920[var14];
                    int var17 = (-var15[0] + var13 << 12) / (var16[0] + -var15[0]);
                    int var18 = -var17 + 4096;
                    int var19 = var15[1] * var18 + var16[1] * var17 >> 12;
                    if (var19 <= -32768) {
                        var19 = -32767;
                    }
                    if (~var19 <= -32769) {
                        var19 = 32767;
                    }
                    this.field2927[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; ~var20 > -258; ++var20) {
                int var22 = var20 << 4;
                int var23;
                for (var23 = 1; ~var23 > ~(this.field2920.length + -1) && var22 >= this.field2920[var23][0]; ++var23) {
                }
                int[] var24 = this.field2920[var23 + -1];
                int[] var25 = this.field2920[var23];
                int var26 = this.method1140(var23 - 2, 68)[1];
                int var27 = var24[1];
                int var28 = var25[1];
                int var29 = this.method1140(var23 - -1, 28)[1];
                int var30 = (var22 - var24[0] << 12) / (var25[0] - var24[0]);
                int var31 = var30 * var30 >> 12;
                int var32 = -var26 + var27 + -var28 + var29;
                int var33 = -var26 + var28;
                int var34 = var26 - var27 + -var32;
                int var36 = (var30 * var32 >> 12) * var31 >> 12;
                int var37 = var31 * var34 >> 12;
                int var38 = var30 * var33 >> 12;
                int var39 = var37 + var38 + var27 + var36;
                if (~var39 >= 32767) {
                    var39 = -32767;
                }
                if (var39 >= 32768) {
                    var39 = 32767;
                }
                this.field2927[var20] = (short) var39;
            }
        }
        int var21 = -123 % ((arg0 - 10) / 36);
        ++field2919;
    }

    @OriginalMember(owner = "client!og", name = "h", descriptor = "(I)V")
    public static final void method1139(int arg0) {
        class224.field4037 = arg0;
        for (int var1 = 0; var1 < class92.field1698; ++var1) {
            for (int var2 = 0; var2 < class170.field3053; ++var2) {
                if (class109.field2063[arg0][var1][var2] == null) {
                    class109.field2063[arg0][var1][var2] = new class170(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(II)[I")
    private final int[] method1140(int arg0, int arg1) {
        ++field2921;
        if (arg1 <= 24) {
            this.field2931 = 2;
        }
        if (arg0 < 0) {
            return this.field2933;
        } else {
            return ~arg0 <= ~this.field2920.length ? this.field2922 : this.field2920[arg0];
        }
    }

    @OriginalMember(owner = "client!og", name = "c", descriptor = "(II)I")
    public static final int method1141(int arg0, int arg1) {
        if (arg0 != -5370) {
            field2929 = 29;
        }
        ++field2925;
        return arg1 & 255;
    }

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "()V")
    public class160() {
        super(1, true);
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Z)V")
    private final void method1142(boolean arg0) {
        if (arg0) {
            int[] var2 = this.field2920[0];
            int[] var3 = this.field2920[1];
            ++field2924;
            int[] var4 = this.field2920[this.field2920.length + -2];
            int[] var5 = this.field2920[this.field2920.length + -1];
            this.field2922 = new int[] { var4[0] + -var5[0] + var4[0], var4[1] - (-var4[1] - -var5[1]) };
            this.field2933 = new int[] { var2[0] - var3[0] - -var2[0], var2[1] - var3[1] + var2[1] };
        }
    }

    @OriginalMember(owner = "client!og", name = "c", descriptor = "(I)V")
    public final void method262(int arg0) {
        ++field2918;
        if (this.field2920 == null) {
            this.field2920 = new int[][] { new int[2], { 4096, 4096 } };
        }
        int var2 = 64 % ((arg0 - -18) / 59);
        if (this.field2920.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (this.field2931 == 2) {
                this.method1142(true);
            }
            class212.method1395((byte) 49);
            this.method1138(-70);
        }
    }
}
