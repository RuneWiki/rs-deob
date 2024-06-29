import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class249 {

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "I")
    public int field4045 = 2;

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "Z")
    public boolean field4046 = false;

    @OriginalMember(owner = "client!tk", name = "f", descriptor = "I")
    public int field4050 = -1;

    @OriginalMember(owner = "client!tk", name = "e", descriptor = "I")
    public int field4049 = -1;

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "Z")
    public boolean field4048 = false;

    @OriginalMember(owner = "client!tk", name = "t", descriptor = "I")
    public int field4064 = 99;

    @OriginalMember(owner = "client!tk", name = "z", descriptor = "I")
    public int field4070 = -1;

    @OriginalMember(owner = "client!tk", name = "B", descriptor = "I")
    public int field4071 = -1;

    @OriginalMember(owner = "client!tk", name = "p", descriptor = "I")
    public int field4060 = 5;

    @OriginalMember(owner = "client!tk", name = "r", descriptor = "Z")
    public boolean field4062 = false;

    @OriginalMember(owner = "client!tk", name = "l", descriptor = "I")
    public int field4056 = -1;

    @OriginalMember(owner = "client!tk", name = "L", descriptor = "Z")
    public boolean field4081 = false;

    @OriginalMember(owner = "client!tk", name = "x", descriptor = "Lna;")
    public static class26 field4068 = class69.method505(" steht bereits auf Ihrer Freunde)2Liste(Q", (byte) -124);

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "J")
    public static volatile long field4047 = 0L;

    @OriginalMember(owner = "client!tk", name = "v", descriptor = "I")
    public static int field4066 = 0;

    @OriginalMember(owner = "client!tk", name = "K", descriptor = "[I")
    public static int[] field4080 = new int[2];

    @OriginalMember(owner = "client!tk", name = "h", descriptor = "I")
    public static int field4052;

    @OriginalMember(owner = "client!tk", name = "i", descriptor = "I")
    public static int field4053;

    @OriginalMember(owner = "client!tk", name = "k", descriptor = "I")
    public static int field4055;

    @OriginalMember(owner = "client!tk", name = "m", descriptor = "I")
    public static int field4057;

    @OriginalMember(owner = "client!tk", name = "q", descriptor = "I")
    public static int field4061;

    @OriginalMember(owner = "client!tk", name = "u", descriptor = "I")
    public static int field4065;

    @OriginalMember(owner = "client!tk", name = "w", descriptor = "I")
    public static int field4067;

    @OriginalMember(owner = "client!tk", name = "y", descriptor = "I")
    public int field4069;

    @OriginalMember(owner = "client!tk", name = "E", descriptor = "I")
    public static int field4074;

    @OriginalMember(owner = "client!tk", name = "F", descriptor = "I")
    public static int field4075;

    @OriginalMember(owner = "client!tk", name = "H", descriptor = "I")
    public static int field4077;

    @OriginalMember(owner = "client!tk", name = "J", descriptor = "I")
    public static int field4079;

    @OriginalMember(owner = "client!tk", name = "o", descriptor = "Lok;")
    public static class150 field4059;

    @OriginalMember(owner = "client!tk", name = "j", descriptor = "Lve;")
    public static class266 field4054;

    @OriginalMember(owner = "client!tk", name = "s", descriptor = "Lve;")
    public static class266 field4063;

    @OriginalMember(owner = "client!tk", name = "g", descriptor = "[I")
    public int[] field4051;

    @OriginalMember(owner = "client!tk", name = "G", descriptor = "[I")
    public int[] field4076;

    @OriginalMember(owner = "client!tk", name = "I", descriptor = "[I")
    private int[] field4078;

    @OriginalMember(owner = "client!tk", name = "D", descriptor = "[Lec;")
    public static class39[] field4073;

    @OriginalMember(owner = "client!tk", name = "n", descriptor = "[Z")
    public boolean[] field4058;

    @OriginalMember(owner = "client!tk", name = "C", descriptor = "[[I")
    public int[][] field4072;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Lsc;ZLwl;)Lhg;", line = 6)
    public static final class172 method1706(class259 arg0, boolean arg1, class89 arg2) {
        long var3 = ((long) arg2.field1480 << 56) + ((long) arg2.field1470 << 32) + (long) ((arg2.field1473 - -1 << 16) + arg2.field1463);
        field4057++;
        if (arg1) {
            field4068 = (class26) null;
        }
        class172 var5 = (class172) arg0.method1827(var3, 0);
        if (var5 == null) {
            var5 = new class172(arg2.field1473, (float) arg2.field1463, true, false, arg2.field1470);
            arg0.method1826(1, var5, var3);
        }
        return var5;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Lwa;B)V", line = 31)
    public final void method1707(class82 arg0, byte arg1) {
        field4075++;
        if (arg1 != -102) {
            this.method1709((class311) null, (byte) 88, 7, 103, 54);
        }
        while (true) {
            int var3 = arg0.method642((byte) -46);
            if (var3 == 0) {
                return;
            }
            this.method1714(var3, (byte) -73, arg0);
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIILak;II)Lak;", line = 66)
    public final class311 method1708(int arg0, int arg1, int arg2, class311 arg3, int arg4, int arg5) {
        field4053++;
        int var7 = this.field4076[arg1];
        int var8 = this.field4051[arg1];
        class132 var9 = class224.method1492(var8 >> 16, arg0 - 19749);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg3.method1602(true, true, true);
        }
        int var11 = arg4 & 0x3;
        class132 var12 = null;
        if (arg0 != 19749) {
            this.method1707((class82) null, (byte) -126);
        }
        if ((this.field4046 || class301.field5188) && arg2 != -1 && this.field4051.length > arg2) {
            int var13 = this.field4051[arg2];
            var12 = class224.method1492(var13 >> 16, 0);
            arg2 = var13 & 0xFFFF;
        }
        class311 var14;
        if (var12 == null) {
            var14 = arg3.method1602(!var9.method892(1317095745, var10), !var9.method894(var10, (byte) 121), !this.field4048);
        } else {
            var14 = arg3.method1602(!var9.method892(1317095745, var10) & !var12.method892(1317095745, arg2), !var9.method894(var10, (byte) 125) & !var12.method894(arg2, (byte) 118), !this.field4048);
        }
        if (class255.field4184 && this.field4048) {
            if (var11 == 1) {
                ((class239) var14).method1595();
            } else if (var11 == 2) {
                ((class239) var14).method1613();
            } else if (var11 == 3) {
                ((class239) var14).method1631();
            }
        } else if (var11 == 1) {
            var14.method1647();
        } else if (var11 == 2) {
            var14.method1616();
        } else if (var11 == 3) {
            var14.method1633();
        }
        var14.method2167(var9, var10, var12, arg2, arg5 - 1, var7, this.field4048);
        if (class255.field4184 && this.field4048) {
            if (var11 == 1) {
                ((class239) var14).method1631();
            } else if (var11 == 2) {
                ((class239) var14).method1613();
            } else if (var11 == 3) {
                ((class239) var14).method1595();
            }
        } else if (var11 == 1) {
            var14.method1633();
        } else if (var11 == 2) {
            var14.method1616();
        } else if (var11 == 3) {
            var14.method1647();
        }
        return var14;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Lak;BIII)Lak;", line = 165)
    public final class311 method1709(class311 arg0, byte arg1, int arg2, int arg3, int arg4) {
        field4074++;
        int var6 = this.field4051[arg4];
        int var7 = this.field4076[arg4];
        class132 var8 = class224.method1492(var6 >> 16, 0);
        int var9 = var6 & 0xFFFF;
        if (var8 == null) {
            return arg0.method1615(true, true, true);
        }
        class132 var10 = null;
        if ((this.field4046 || class301.field5188) && arg2 != -1 && arg2 < this.field4051.length) {
            int var11 = this.field4051[arg2];
            var10 = class224.method1492(var11 >> 16, 0);
            arg2 = var11 & 0xFFFF;
        }
        class132 var12 = null;
        int var13 = 47 % ((arg1 - 66) / 45);
        class132 var14 = null;
        int var15 = 0;
        int var16 = 0;
        if (this.field4078 != null) {
            if (this.field4078.length > arg4) {
                var15 = this.field4078[arg4];
                if (var15 != 65535) {
                    var12 = class224.method1492(var15 >> 16, 0);
                    var15 &= 0xFFFF;
                }
            }
            if ((this.field4046 || class301.field5188) && arg2 != -1 && this.field4078.length > arg2) {
                var16 = this.field4078[arg2];
                if (var16 != 65535) {
                    var14 = class224.method1492(var16 >> 16, 0);
                    var16 &= 0xFFFF;
                }
            }
        }
        boolean var17 = !var8.method892(1317095745, var9);
        boolean var18 = !var8.method894(var9, (byte) 119);
        if (var12 != null) {
            var17 &= !var12.method892(1317095745, var15);
            var18 &= !var12.method894(var15, (byte) 115);
        }
        if (var10 != null) {
            var17 &= !var10.method892(1317095745, arg2);
            var18 &= !var10.method894(arg2, (byte) 123);
        }
        if (var14 != null) {
            var17 &= !var14.method892(1317095745, var16);
            var18 &= !var14.method894(var16, (byte) 121);
        }
        class311 var19 = arg0.method1615(var17, var18, !this.field4048);
        var19.method2167(var8, var9, var10, arg2, arg3 - 1, var7, this.field4048);
        if (var12 != null) {
            var19.method2167(var12, var15, var14, var16, arg3 - 1, var7, this.field4048);
        }
        return var19;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIIILak;I)Lak;", line = 269)
    public final class311 method1710(int arg0, int arg1, int arg2, int arg3, class311 arg4, int arg5) {
        int var7 = this.field4076[arg1];
        int var8 = this.field4051[arg1];
        class132 var9 = class224.method1492(var8 >> 16, arg5 - 3);
        field4077++;
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg4.method1615(true, true, true);
        }
        int var11 = arg3 & arg5;
        class132 var12 = null;
        if ((this.field4046 || class301.field5188) && arg0 != -1 && arg0 < this.field4051.length) {
            int var13 = this.field4051[arg0];
            var12 = class224.method1492(var13 >> 16, arg5 - 3);
            arg0 = var13 & 0xFFFF;
        }
        class311 var14;
        if (var12 == null) {
            var14 = arg4.method1615(!var9.method892(1317095745, var10), !var9.method894(var10, (byte) 123), !this.field4048);
        } else {
            var14 = arg4.method1615(!var9.method892(1317095745, var10) & !var12.method892(1317095745, arg0), !var9.method894(var10, (byte) 125) & !var12.method894(arg0, (byte) 123), !this.field4048);
        }
        if (this.field4048 && class255.field4184) {
            if (var11 == 1) {
                ((class239) var14).method1595();
            } else if (var11 == 2) {
                ((class239) var14).method1613();
            } else if (var11 == 3) {
                ((class239) var14).method1631();
            }
        } else if (var11 == 1) {
            var14.method1647();
        } else if (var11 == 2) {
            var14.method1616();
        } else if (var11 == 3) {
            var14.method1633();
        }
        var14.method2167(var9, var10, var12, arg0, arg2 - 1, var7, this.field4048);
        if (this.field4048 && class255.field4184) {
            if (var11 == 1) {
                ((class239) var14).method1631();
            } else if (var11 == 2) {
                ((class239) var14).method1613();
            } else if (var11 == 3) {
                ((class239) var14).method1595();
            }
        } else if (var11 == 1) {
            var14.method1633();
        } else if (var11 == 2) {
            var14.method1616();
        } else if (var11 == 3) {
            var14.method1647();
        }
        return var14;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(B)V", line = 366)
    public static void method1711(byte arg0) {
        field4073 = null;
        field4059 = null;
        field4063 = null;
        field4054 = null;
        if (arg0 != -108) {
            field4054 = (class266) null;
        }
        field4068 = null;
        field4080 = null;
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(B)V", line = 381)
    public final void method1712(byte arg0) {
        field4052++;
        if (arg0 != -41) {
            return;
        }
        if (this.field4071 == -1) {
            if (this.field4058 == null) {
                this.field4071 = 0;
            } else {
                this.field4071 = 2;
            }
        }
        if (this.field4050 != -1) {
            return;
        }
        if (this.field4058 == null) {
            this.field4050 = 0;
        } else {
            this.field4050 = 2;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIIBLak;)Lak;", line = 417)
    public final class311 method1713(int arg0, int arg1, int arg2, byte arg3, class311 arg4) {
        int var6 = 43 / ((arg3 - 4) / 54);
        field4079++;
        int var7 = this.field4076[arg2];
        int var8 = this.field4051[arg2];
        class132 var9 = class224.method1492(var8 >> 16, 0);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg4.method1594(true, true, true);
        }
        class132 var11 = null;
        if ((this.field4046 || class301.field5188) && arg0 != -1 && this.field4051.length > arg0) {
            int var12 = this.field4051[arg0];
            var11 = class224.method1492(var12 >> 16, 0);
            arg0 = var12 & 0xFFFF;
        }
        class311 var13;
        if (var11 == null) {
            var13 = arg4.method1594(!var9.method892(1317095745, var10), !var9.method894(var10, (byte) 118), !this.field4048);
        } else {
            var13 = arg4.method1594(!var9.method892(1317095745, var10) & !var11.method892(1317095745, arg0), !var9.method894(var10, (byte) 119) & !var11.method894(arg0, (byte) 118), !this.field4048);
        }
        var13.method2167(var9, var10, var11, arg0, arg1 - 1, var7, this.field4048);
        return var13;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IBLwa;)V", line = 451)
    private final void method1714(int arg0, byte arg1, class82 arg2) {
        if (arg0 == 1) {
            int var4 = arg2.method576(1);
            this.field4076 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4076[var5] = arg2.method576(1);
            }
            this.field4051 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field4051[var6] = arg2.method576(1);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field4051[var7] += arg2.method576(1) << 16;
            }
        } else if (arg0 == 2) {
            this.field4070 = arg2.method576(1);
        } else if (arg0 == 3) {
            this.field4058 = new boolean[256];
            int var15 = arg2.method642((byte) -126);
            for (int var16 = 0; var16 < var15; var16++) {
                this.field4058[arg2.method642((byte) -81)] = true;
            }
        } else if (arg0 == 4) {
            this.field4062 = true;
        } else if (arg0 == 5) {
            this.field4060 = arg2.method642((byte) -72);
        } else if (arg0 == 6) {
            this.field4056 = arg2.method576(1);
        } else if (arg0 == 7) {
            this.field4049 = arg2.method576(1);
        } else if (arg0 == 8) {
            this.field4064 = arg2.method642((byte) -127);
        } else if (arg0 == 9) {
            this.field4071 = arg2.method642((byte) -56);
        } else if (arg0 == 10) {
            this.field4050 = arg2.method642((byte) -43);
        } else if (arg0 == 11) {
            this.field4045 = arg2.method642((byte) -119);
        } else if (arg0 == 12) {
            int var12 = arg2.method642((byte) -117);
            this.field4078 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field4078[var13] = arg2.method576(1);
            }
            for (int var14 = 0; var14 < var12; var14++) {
                this.field4078[var14] += arg2.method576(1) << 16;
            }
        } else if (arg0 == 13) {
            int var8 = arg2.method576(1);
            this.field4072 = new int[var8][];
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = arg2.method642((byte) -96);
                if (var10 > 0) {
                    this.field4072[var9] = new int[var10];
                    this.field4072[var9][0] = arg2.method633((byte) 102);
                    for (int var11 = 1; var11 < var10; var11++) {
                        this.field4072[var9][var11] = arg2.method576(1);
                    }
                }
            }
        } else if (arg0 == 14) {
            this.field4048 = true;
        } else if (arg0 == 15) {
            this.field4046 = true;
        } else if (arg0 == 16) {
            this.field4081 = true;
        }
        int var17 = 49 % ((-arg1 - 12) / 34);
        field4065++;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Z)V", line = 653)
    public static final void method1715(boolean arg0) {
        class301.field5186 = 0;
        field4067++;
        class241.field3911 = true;
        class150.field2346 = 0L;
        class28.field473 = 0;
        class217.field3453 = 0;
        class297.field4981 = 0;
        class317.field5430 = 0;
        class53.field840 = 0;
        class7.field89 = 0;
        class28.field466 = 0;
        class275.field4603 = 0;
        class18.field254 = 0;
        class207.field3214 = 0;
        class264.field4324 = 0;
        class151.field2371 = 0;
        class267.field4422 = 0;
        class214.field3327 = 0;
        class174.field2719 = 0;
        class173.field2718 = 0;
        class147.field2297 = 0;
        class58.field950 = 0;
        class277.field4638 = 0;
        class123.field1920 = 0;
        class315.field5400 = 0;
        class259.field4222 = 0;
        class158.field2469 = 0;
        class293.field4883 = 0;
        class272.field4561 = 0;
        class281.field4686 = 0;
        class82.field1292 = 0;
        class304.field5244 = 0;
        class324.field5579 = 0;
        class321.field5516 = 0;
        class83.field1355 = 0;
        class110.field1757 = 0;
        class53.field838 = 0;
        class284.field4746 = 0;
        class21.field304 = 0;
        class153.field2395 = 0;
        class192.field3002 = 0;
        class26.field383 = 0;
        class12.field162 = 0;
        class240.field3881 = 0;
        class324.field5601 = 0;
        class214.field3325 = 0;
        class117.field1841 = 0;
        class26.field399 = 0;
        class170.field2669 = 0;
        class306.field5272 = 0;
        class142.field2174 = 0;
        class17.field251 = 0;
        class233.field3686 = 0;
        class12.field180 = 0;
        class187.field2955 = 0;
        class71.field1092 = 0;
        class285.field4770 = 0;
        class26.field375 = 0;
        class214.field3337 = 0;
        class64.field1011 = 0;
        class297.field4982 = 0;
        class293.field4871 = 0;
        class26.field417 = 0;
        class264.field4319 = 0;
        class51.field803 = 0;
        class36.field597 = 0;
        class271.field4531 = 0;
        class53.field842 = 0;
        class13.field186 = 0;
        class145.field2214 = 0;
        class203.field3170 = 0;
        class205.field3199 = 0;
        class244.field4011 = 0;
        class2.field24 = 0;
        class309.field5317 = 0;
        class272.field4551 = 0;
        class204.field3192 = 0;
        class167.field2595 = 0;
        class301.field5191 = 0;
        class45.field704 = 0;
        class275.field4586 = 0;
        class114.field1793 = 0;
        class325.field5608 = 0;
        class12.field172 = 0;
        class319.field5490 = 0;
        class189.field2968 = 0;
        class181.field2842 = 0;
        class35.field577 = 0;
        class57.field933 = 0;
        class51.field811 = 0;
        class95.field1545 = 0;
        class155.field2412 = 0;
        class199.field3097 = 0;
        class135.field2074 = 0;
        class165.field2562 = 0;
        class122.field1911 = 0;
        class223.field3528 = 0;
        class82.field1345 = 0;
        class317.field5426 = 0;
        class293.field4878 = 0;
        class217.field3405 = 0;
        class284.field4769 = 0;
        class4.field45 = 0;
        class26.field442 = 0;
        class293.field4872 = 0;
        class5.field56 = 0;
        class320.field5496 = 0;
        class138.field2116 = 0;
        class53.field836 = 0;
        class26.field415 = 0;
        class258.field4207 = 0;
        class1.field8 = 0;
        class320.field5495 = 0;
        class159.field2500 = 0;
        class141.field2157 = 0;
        field4079 = 0;
        class198.field3067 = 0;
        class261.field4274 = 0;
        class47.field738 = 0;
        class297.field5099 = 0;
        class84.field1363 = 0;
        class308.field5295 = 0;
        class133.field2018 = 0;
        class20.field280 = 0;
        class225.field3567 = 0;
        class232.field3681 = 0;
        class104.field1660 = 0;
        class74.field1134 = 0;
        class84.field1368 = 0;
        class56.field915 = 0;
        class120.field1873 = 0;
        class217.field3450 = 0;
        class281.field4688 = 0;
        class146.field2238 = 0;
        class168.field2598 = 0;
        class325.field5637 = 0;
        class26.field413 = 0;
        class297.field5128 = 0;
        class139.field2125 = 0;
        class305.field5262 = 0;
        class280.field4665 = 0;
        class167.field2592 = 0;
        class185.field2882 = 0;
        class266.field4395 = 0;
        class47.field759 = 0;
        class325.field5634 = 0;
        class281.field4679 = 0;
        class240.field3885 = 0;
        class147.field2300 = 0;
        class8.field98 = 0;
        class135.field2070 = 0;
        class108.field1696 = 0;
        class252.field4136 = 0;
        class314.field5362 = 0;
        class115.field1807 = 0;
        class26.field423 = 0;
        class155.field2418 = 0;
        class297.field5112 = 0;
        class294.field4907 = 0;
        class140.field2137 = 0;
        class53.field853 = 0;
        class120.field1865 = 0;
        class94.field1534 = 0;
        class146.field2218 = 0;
        class45.field706 = 0;
        class243.field4005 = 0;
        class59.field965 = 0;
        class142.field2169 = 0;
        class283.field4726 = 0;
        class132.field1999 = 0;
        class277.field4636 = 0;
        class228.field3618 = 0;
        class322.field5531 = 0;
        class126.field1945 = 0;
        class9.field104 = 0;
        class122.field1909 = 0;
        class146.field2273 = 0;
        class154.field2409 = 0;
        class72.field1116 = 0;
        class126.field1935 = 0;
        class122.field1907 = 0;
        class194.field3018 = 0;
        class8.field93 = 0;
        class82.field1290 = 0;
        class82.field1311 = 0;
        class146.field2243 = 0;
        class124.field1932 = 0;
        class114.field1791 = 0;
        class305.field5255 = 0;
        class229.field3629 = 0;
        class250.field4097 = 0;
        class170.field2666 = 0;
        class187.field2915 = 0;
        class222.field3512 = 0;
        class120.field1868 = 0;
        class272.field4538 = 0;
        class88.field1452 = 0;
        class28.field481 = 0;
        class327.field5658 = 0;
        class245.field4025 = 0;
        class153.field2388 = 0;
        class33.field554 = 0;
        class187.field2909 = 0;
        class151.field2358 = 0;
        class39.field631 = 0;
        class214.field3331 = 0;
        class55.field875 = 0;
        class82.field1303 = 0;
        class282.field4708 = 0;
        class82.field1278 = 0;
        class140.field2136 = 0;
        class327.field5653 = 0;
        class317.field5432 = 0;
        class284.field4755 = 0;
        class170.field2659 = 0;
        class26.field392 = 0;
        class203.field3159 = 0;
        class228.field3612 = 0;
        class325.field5644 = 0;
        class228.field3604 = 0;
        class293.field4888 = 0;
        class327.field5663 = 0;
        class109.field1736 = 0;
        class313.field5349 = 0;
        class26.field424 = 0;
        class117.field1836 = 0;
        class85.field1396 = 0;
        class58.field945 = 0;
        class314.field5368 = 0;
        class26.field434 = 0;
        class307.field5282 = 0;
        class285.field4773 = 0;
        class35.field573 = 0;
        class204.field3194 = 0;
        class159.field2491 = 0;
        class323.field5550 = 0;
        class13.field225 = 0;
        class282.field4705 = 0;
        class133.field2023 = 0;
        class187.field2944 = 0;
        class74.field1141 = 0;
        class46.field730 = 0;
        class321.field5518 = 0;
        class82.field1319 = 0;
        class209.field3247 = 0;
        class285.field4789 = 0;
        class146.field2283 = 0;
        class127.field1960 = 0;
        class146.field2259 = 0;
        class17.field249 = 0;
        class81.field1265 = 0;
        class305.field5268 = 0;
        class317.field5427 = 0;
        class217.field3465 = 0;
        class135.field2065 = 0;
        class9.field115 = 0;
        class82.field1347 = 0;
        class178.field2791 = 0;
        class304.field5234 = 0;
        class9.field116 = 0;
        client.field4118 = 0;
        class196.field3047 = 0;
        class297.field5031 = 0;
        class11.field146 = 0;
        class136.field2091 = 0;
        class285.field4790 = 0;
        class31.field523 = 0;
        class268.field4430 = 0;
        class277.field4627 = 0;
        class82.field1287 = 0;
        class146.field2279 = 0;
        class203.field3168 = 0;
        class72.field1114 = 0;
        class115.field1817 = 0;
        class28.field471 = 0;
        class35.field579 = 0;
        class78.field1172 = 0;
        class71.field1090 = 0;
        class133.field2033 = 0;
        class89.field1462 = 0;
        class35.field582 = 0;
        class13.field215 = 0;
        class127.field1965 = 0;
        class203.field3162 = 0;
        class56.field913 = 0;
        class228.field3615 = 0;
        class82.field1340 = 0;
        class127.field1964 = 0;
        class264.field4332 = 0;
        class31.field519 = 0;
        class89.field1471 = 0;
        class282.field4711 = 0;
        class315.field5391 = 0;
        class302.field5201 = 0;
        class272.field4544 = 0;
        class294.field4897 = 0;
        class45.field714 = 0;
        class57.field928 = 0;
        class321.field5515 = 0;
        class245.field4022 = 0;
        class78.field1240 = 0;
        class203.field3149 = 0;
        class303.field5230 = 0;
        class224.field3551 = 0;
        class61.field990 = 0;
        class316.field5420 = 0;
        class284.field4758 = 0;
        class46.field729 = 0;
        class22.field306 = 0;
        class292.field4851 = 0;
        class323.field5560 = 0;
        class120.field1874 = 0;
        class198.field3085 = 0;
        class21.field299 = 0;
        class14.field227 = 0;
        class146.field2274 = 0;
        class26.field390 = 0;
        class230.field3663 = 0;
        class266.field4388 = 0;
        class210.field3260 = 0;
        class293.field4881 = 0;
        class147.field2303 = 0;
        class319.field5461 = 0;
        class214.field3335 = 0;
        class325.field5618 = 0;
        class218.field3484 = 0;
        class18.field256 = 0;
        class284.field4741 = 0;
        class115.field1822 = 0;
        class324.field5585 = 0;
        class275.field4601 = 0;
        class325.field5631 = 0;
        class327.field5669 = 0;
        class327.field5655 = 0;
        class215.field3353 = 0;
        class32.field533 = 0;
        class284.field4765 = 0;
        class319.field5447 = 0;
        class228.field3609 = 0;
        class153.field2397 = 0;
        class241.field3952 = 0;
        class144.field2184 = 0;
        class187.field2942 = 0;
        class277.field4631 = 0;
        class264.field4322 = 0;
        class84.field1375 = 0;
        class26.field379 = 0;
        class26.field431 = 0;
        class5.field61 = 0;
        class209.field3254 = 0;
        class168.field2601 = 0;
        class266.field4364 = 0;
        class282.field4706 = 0;
        class208.field3224 = 0;
        class327.field5674 = 0;
        class325.field5615 = 0;
        class315.field5384 = 0;
        class69.field1065 = 0;
        class82.field1304 = 0;
        class135.field2061 = 0;
        class146.field2251 = 0;
        class118.field1859 = 0;
        class263.field4291 = 0;
        class204.field3198 = 0;
        class104.field1659 = 0;
        class107.field1684 = 0;
        class45.field713 = 0;
        class285.field4784 = 0;
        class127.field1961 = 0;
        class193.field3012 = 0;
        class154.field2405 = 0;
        class243.field3998 = 0;
        class327.field5671 = 0;
        class203.field3174 = 0;
        class82.field1344 = 0;
        class140.field2142 = 0;
        class13.field219 = 0;
        class217.field3434 = 0;
        class178.field2797 = 0;
        class196.field3041 = 0;
        class79.field1247 = 0;
        class246.field4034 = 0;
        class26.field386 = 0;
        class325.field5611 = 0;
        class203.field3165 = 0;
        class282.field4699 = 0;
        class283.field4722 = 0;
        class241.field3938 = 0;
        class39.field650 = 0;
        class92.field1504 = 0;
        class214.field3342 = 0;
        class302.field5197 = 0;
        class86.field1407 = 0;
        class209.field3241 = 0;
        class284.field4756 = 0;
        class299.field5149 = 0;
        class146.field2234 = 0;
        class28.field485 = 0;
        class297.field4992 = 0;
        class92.field1488 = 0;
        class163.field2531 = 0;
        class51.field809 = 0;
        class115.field1805 = 0;
        class166.field2575 = 0;
        class82.field1295 = 0;
        class72.field1109 = 0;
        class32.field539 = 0;
        class72.field1101 = 0;
        class165.field2564 = 0;
        class82.field1335 = 0;
        class266.field4399 = 0;
        class315.field5388 = 0;
        class203.field3157 = 0;
        class146.field2240 = 0;
        class325.field5609 = 0;
        class297.field5045 = 0;
        class228.field3611 = 0;
        class29.field508 = 0;
        class205.field3206 = 0;
        class26.field405 = 0;
        class26.field397 = 0;
        class321.field5511 = 0;
        class241.field3887 = 0;
        class233.field3688 = 0;
        class228.field3595 = 0;
        class185.field2875 = 0;
        class321.field5521 = 0;
        class78.field1218 = 0;
        class295.field4916 = 0;
        class146.field2268 = 0;
        class266.field4386 = 0;
        class236.field3761 = 0;
        class13.field197 = 0;
        class123.field1917 = 0;
        class26.field422 = 0;
        class327.field5675 = 0;
        class24.field339 = 0;
        class126.field1948 = 0;
        class265.field4347 = 0;
        class260.field4250 = 0;
        class25.field361 = 0;
        class140.field2131 = 0;
        class28.field480 = 0;
        class113.field1777 = 0;
        class107.field1685 = 0;
        class283.field4734 = 0;
        class217.field3454 = 0;
        class72.field1105 = 0;
        class284.field4752 = 0;
        class233.field3683 = 0;
        class243.field4002 = 0;
        class89.field1479 = 0;
        class123.field1919 = 0;
        class157.field2451 = 0;
        class89.field1464 = 0;
        class84.field1381 = 0;
        class133.field2024 = 0;
        class325.field5641 = 0;
        class117.field1838 = 0;
        class82.field1316 = 0;
        class24.field356 = 0;
        class261.field4279 = 0;
        class282.field4702 = 0;
        class146.field2220 = 0;
        client.field4113 = 0;
        class33.field552 = 0;
        class246.field4033 = 0;
        class5.field63 = 0;
        class223.field3525 = 0;
        class233.field3696 = 0;
        class198.field3084 = 0;
        class1.field2 = 0;
        class228.field3622 = 0;
        class305.field5271 = 0;
        class294.field4905 = 0;
        class86.field1408 = 0;
        class150.field2350 = 0;
        class215.field3377 = 0;
        class283.field4729 = 0;
        class285.field4782 = 0;
        class320.field5499 = 0;
        class262.field4286 = 0;
        class261.field4273 = 0;
        class140.field2139 = 0;
        client.field4123 = 0;
        class297.field5090 = 0;
        class191.field2995 = 0;
        class203.field3148 = 0;
        class324.field5583 = 0;
        class85.field1395 = 0;
        class146.field2270 = 0;
        class8.field97 = 0;
        class72.field1104 = 0;
        class228.field3620 = 0;
        class290.field4834 = 0;
        class118.field1854 = 0;
        class85.field1397 = 0;
        class321.field5522 = 0;
        class163.field2530 = 0;
        class283.field4739 = 0;
        class327.field5660 = 0;
        class82.field1277 = 0;
        class71.field1087 = 0;
        client.field4116 = 0;
        class258.field4201 = 0;
        class33.field551 = 0;
        class66.field1032 = 0;
        class300.field5176 = 0;
        class317.field5424 = 0;
        class308.field5301 = 0;
        class82.field1302 = 0;
        class32.field543 = 0;
        class291.field4850 = 0;
        class314.field5371 = 0;
        class290.field4828 = 0;
        class146.field2246 = 0;
        class236.field3785 = 0;
        class220.field3505 = 0;
        class13.field202 = 0;
        class325.field5629 = 0;
        class28.field476 = 0;
        class318.field5444 = 0;
        class78.field1205 = 0;
        class167.field2584 = 0;
        class113.field1784 = 0;
        class275.field4582 = 0;
        class290.field4832 = 0;
        class71.field1096 = 0;
        class260.field4253 = 0;
        class299.field5150 = 0;
        class211.field3276 = 0;
        class229.field3625 = 0;
        class299.field5145 = 0;
        class5.field55 = 0;
        class163.field2525 = 0;
        class320.field5500 = 0;
        class64.field1009 = 0;
        class305.field5269 = 0;
        class78.field1213 = 0;
        class259.field4223 = 0;
        class217.field3411 = 0;
        class214.field3338 = 0;
        class215.field3375 = 0;
        class228.field3593 = 0;
        field4053 = 0;
        class229.field3628 = 0;
        class82.field1293 = 0;
        class32.field531 = 0;
        class18.field260 = 0;
        class22.field316 = 0;
        class277.field4626 = 0;
        class26.field407 = 0;
        class254.field4157 = 0;
        client.field4114 = 0;
        class12.field179 = 0;
        class24.field343 = 0;
        class185.field2878 = 0;
        class47.field736 = 0;
        class201.field3133 = 0;
        class86.field1409 = 0;
        class144.field2192 = 0;
        class83.field1351 = 0;
        class275.field4577 = 0;
        class10.field144 = 0;
        class26.field406 = 0;
        class215.field3378 = 0;
        class31.field521 = 0;
        class26.field419 = 0;
        class69.field1064 = 0;
        class187.field2903 = 0;
        class324.field5564 = 0;
        class265.field4349 = 0;
        class26.field378 = 0;
        class233.field3682 = 0;
        class63.field1003 = 0;
        class313.field5353 = 0;
        class86.field1411 = 0;
        class173.field2714 = 0;
        class2.field20 = 0;
        class146.field2241 = 0;
        class309.field5323 = 0;
        class293.field4873 = 0;
        class276.field4622 = 0;
        class246.field4037 = 0;
        class82.field1274 = 0;
        class59.field962 = 0;
        class14.field230 = 0;
        class146.field2264 = 0;
        class190.field2976 = 0;
        class159.field2499 = 0;
        class323.field5559 = 0;
        class109.field1734 = 0;
        class266.field4370 = 0;
        class294.field4893 = 0;
        class45.field709 = 0;
        class126.field1936 = 0;
        class325.field5604 = 0;
        class327.field5657 = 0;
        class144.field2188 = 0;
        class308.field5300 = 0;
        class216.field3388 = 0;
        class159.field2493 = 0;
        class131.field1994 = 0;
        class5.field57 = 0;
        class177.field2788 = 0;
        class298.field5138 = 0;
        class283.field4716 = 0;
        class302.field5196 = 0;
        class187.field2906 = 0;
        class22.field313 = 0;
        class85.field1400 = 0;
        class304.field5242 = 0;
        class124.field1927 = 0;
        class26.field429 = 0;
        class86.field1424 = 0;
        class305.field5257 = 0;
        class275.field4597 = 0;
        class89.field1472 = 0;
        class304.field5233 = 0;
        class113.field1786 = 0;
        class31.field527 = 0;
        class127.field1962 = 0;
        class309.field5321 = 0;
        class82.field1286 = 0;
        class114.field1799 = 0;
        class37.field611 = 0;
        class146.field2269 = 0;
        class23.field327 = 0;
        class12.field163 = 0;
        class138.field2111 = 0;
        class80.field1255 = 0;
        class276.field4608 = 0;
        class26.field398 = 0;
        class158.field2464 = 0;
        class241.field3936 = 0;
        class233.field3692 = 0;
        class281.field4681 = 0;
        class67.field1052 = 0;
        class178.field2798 = 0;
        class144.field2187 = 0;
        class228.field3598 = 0;
        class305.field5267 = 0;
        class26.field426 = 0;
        class251.field4101 = 0;
        class217.field3407 = 0;
        class151.field2354 = 0;
        class254.field4159 = 0;
        class94.field1537 = 0;
        class76.field1148 = 0;
        class51.field798 = 0;
        class266.field4372 = 0;
        class292.field4856 = 0;
        class27.field449 = 0;
        class266.field4400 = 0;
        class82.field1279 = 0;
        class126.field1939 = 0;
        class134.field2047 = 0;
        class88.field1443 = 0;
        class287.field4797 = 0;
        class82.field1315 = 0;
        class218.field3489 = 0;
        class56.field920 = 0;
        class196.field3055 = 0;
        class293.field4875 = 0;
        class308.field5305 = 0;
        class216.field3390 = 0;
        class23.field326 = 0;
        class190.field2980 = 0;
        class290.field4841 = 0;
        class316.field5404 = 0;
        class241.field3899 = 0;
        class20.field284 = 0;
        class259.field4215 = 0;
        class114.field1794 = 0;
        class150.field2345 = 0;
        class13.field209 = 0;
        class201.field3128 = 0;
        class233.field3697 = 0;
        class141.field2148 = 0;
        class266.field4392 = 0;
        class26.field396 = 0;
        class120.field1883 = 0;
        class98.field1593 = 0;
        class297.field5075 = 0;
        class220.field3508 = 0;
        class46.field723 = 0;
        class207.field3215 = 0;
        class174.field2720 = 0;
        class159.field2492 = 0;
        class262.field4290 = 0;
        class196.field3045 = 0;
        class246.field4031 = 0;
        class181.field2828 = 0;
        class89.field1459 = 0;
        class84.field1367 = 0;
        class134.field2038 = 0;
        class26.field410 = 0;
        class276.field4607 = 0;
        field4075 = 0;
        class309.field5318 = 0;
        class138.field2118 = 0;
        class309.field5314 = 0;
        class146.field2244 = 0;
        class22.field311 = 0;
        class135.field2067 = 0;
        class26.field408 = 0;
        class146.field2233 = 0;
        class264.field4320 = 0;
        class149.field2328 = 0;
        class109.field1746 = 0;
        class53.field832 = 0;
        class32.field535 = 0;
        class126.field1934 = 0;
        class41.field684 = 0;
        class139.field2128 = 0;
        class26.field394 = 0;
        class305.field5259 = 0;
        class146.field2271 = 0;
        class109.field1726 = 0;
        class86.field1423 = 0;
        class212.field3287 = 0;
        class272.field4555 = 0;
        class89.field1468 = 0;
        class146.field2231 = 0;
        class232.field3672 = 0;
        class229.field3630 = 0;
        class27.field452 = 0;
        class259.field4217 = 0;
        class264.field4315 = 0;
        class259.field4240 = 0;
        class29.field499 = 0;
        class89.field1466 = 0;
        class229.field3623 = 0;
        client.field4122 = 0;
        class10.field130 = 0;
        class281.field4682 = 0;
        class151.field2362 = 0;
        class285.field4785 = 0;
        class149.field2338 = 0;
        class148.field2317 = 0;
        class112.field1766 = 0;
        class243.field3993 = 0;
        class157.field2452 = 0;
        class26.field400 = 0;
        class13.field187 = 0;
        class159.field2496 = 0;
        class187.field2950 = 0;
        class321.field5519 = 0;
        class325.field5624 = 0;
        class271.field4533 = 0;
        class167.field2585 = 0;
        class32.field529 = 0;
        class41.field669 = 0;
        class21.field297 = 0;
        class291.field4845 = 0;
        class281.field4680 = 0;
        class32.field532 = 0;
        class72.field1117 = 0;
        class20.field279 = 0;
        class38.field624 = 0;
        class51.field813 = 0;
        class202.field3145 = 0;
        class59.field957 = 0;
        class134.field2043 = 0;
        class243.field3999 = 0;
        class325.field5639 = 0;
        class163.field2526 = 0;
        class209.field3239 = 0;
        class187.field2916 = 0;
        class208.field3232 = 0;
        class110.field1747 = 0;
        class9.field117 = 0;
        class285.field4776 = 0;
        class263.field4295 = 0;
        class209.field3248 = 0;
        class277.field4625 = 0;
        class1.field5 = 0;
        class110.field1753 = 0;
        class216.field3381 = 0;
        class133.field2031 = 0;
        class29.field503 = 0;
        class78.field1246 = 0;
        class273.field4565 = 0;
        class13.field220 = 0;
        class82.field1299 = 0;
        class287.field4802 = 0;
        class215.field3367 = 0;
        class304.field5248 = 0;
        class26.field374 = 0;
        class259.field4237 = 0;
        class218.field3486 = 0;
        class228.field3617 = 0;
        class264.field4326 = 0;
        class46.field727 = 0;
        class302.field5207 = 0;
        class283.field4735 = 0;
        class276.field4613 = 0;
        class139.field2126 = 0;
        class165.field2560 = 0;
        class294.field4903 = 0;
        class13.field205 = 0;
        class316.field5407 = 0;
        class138.field2109 = 0;
        class21.field291 = 0;
        class266.field4376 = 0;
        class138.field2110 = 0;
        class58.field948 = 0;
        class266.field4396 = 0;
        class50.field780 = 0;
        class82.field1332 = 0;
        class74.field1137 = 0;
        class306.field5276 = 0;
        class236.field3744 = 0;
        class246.field4038 = 0;
        class82.field1297 = 0;
        class66.field1037 = 0;
        class82.field1325 = 0;
        class316.field5409 = 0;
        class113.field1788 = 0;
        class148.field2322 = 0;
        class146.field2265 = 0;
        class304.field5245 = 0;
        field4061 = 0;
        class308.field5299 = 0;
        class196.field3054 = 0;
        class310.field5330 = 0;
        class254.field4152 = 0;
        class103.field1648 = 0;
        class259.field4233 = 0;
        class13.field201 = 0;
        class138.field2113 = 0;
        field4052 = 0;
        class74.field1136 = 0;
        class141.field2146 = 0;
        class146.field2222 = 0;
        class228.field3600 = 0;
        class173.field2710 = 0;
        class26.field435 = 0;
        class103.field1646 = 0;
        class151.field2360 = 0;
        class325.field5635 = 0;
        class293.field4877 = 0;
        class82.field1294 = 0;
        class67.field1051 = 0;
        class321.field5523 = 0;
        class217.field3395 = 0;
        class149.field2334 = 0;
        class316.field5415 = 0;
        class209.field3240 = 0;
        class85.field1401 = 0;
        class146.field2280 = 0;
        class1.field4 = 0;
        class146.field2215 = 0;
        class76.field1156 = 0;
        class32.field536 = 0;
        class302.field5200 = 0;
        class31.field522 = 0;
        class164.field2542 = 0;
        class103.field1654 = 0;
        class95.field1546 = 0;
        class126.field1937 = 0;
        class209.field3255 = 0;
        class325.field5616 = 0;
        class46.field720 = 0;
        class4.field31 = 0;
        client.field4110 = 0;
        class110.field1750 = 0;
        class266.field4379 = 0;
        class118.field1855 = 0;
        class217.field3414 = 0;
        class187.field2907 = 0;
        class115.field1823 = 0;
        class83.field1356 = 0;
        class190.field2977 = 0;
        class22.field308 = 0;
        class56.field922 = 0;
        class196.field3044 = 0;
        class281.field4685 = 0;
        class32.field537 = 0;
        class1.field1 = 0;
        class144.field2185 = 0;
        class42.field691 = 0;
        class26.field393 = 0;
        class316.field5413 = 0;
        class158.field2462 = 0;
        class290.field4837 = 0;
        class198.field3082 = 0;
        class188.field2964 = 0;
        class82.field1291 = 0;
        class29.field506 = 0;
        class108.field1697 = 0;
        class95.field1552 = 0;
        class35.field575 = 0;
        class309.field5312 = 0;
        class151.field2369 = 0;
        class216.field3383 = 0;
        class25.field358 = 0;
        class196.field3037 = 0;
        class160.field2511 = 0;
        class276.field4618 = 0;
        class66.field1042 = 0;
        class246.field4030 = 0;
        class8.field91 = 0;
        class244.field4006 = 0;
        class146.field2239 = 0;
        class82.field1306 = 0;
        class319.field5468 = 0;
        class266.field4373 = 0;
        class263.field4294 = 0;
        class56.field918 = 0;
        class325.field5628 = 0;
        class80.field1254 = 0;
        class250.field4082 = 0;
        class235.field3734 = 0;
        class252.field4134 = 0;
        class316.field5422 = 0;
        class113.field1787 = 0;
        class131.field1998 = 0;
        class291.field4843 = 0;
        class303.field5214 = 0;
        class26.field428 = 0;
        class26.field430 = 0;
        class194.field3017 = 0;
        class63.field1005 = 0;
        class13.field214 = 0;
        class273.field4567 = 0;
        class158.field2461 = 0;
        class313.field5348 = 0;
        class323.field5552 = 0;
        class216.field3387 = 0;
        class254.field4160 = 0;
        class215.field3364 = 0;
        class189.field2971 = 0;
        class202.field3144 = 0;
        class319.field5455 = 0;
        class21.field298 = 0;
        class82.field1339 = 0;
        class316.field5418 = 0;
        class137.field2103 = 0;
        class38.field627 = 0;
        class151.field2357 = 0;
        class178.field2794 = 0;
        class267.field4417 = 0;
        class112.field1772 = 0;
        class291.field4844 = 0;
        class114.field1795 = 0;
        class146.field2262 = 0;
        class281.field4690 = 0;
        class264.field4333 = 0;
        class84.field1369 = 0;
        class97.field1586 = 0;
        class28.field465 = 0;
        class96.field1572 = 0;
        class250.field4090 = 0;
        class26.field425 = 0;
        class267.field4423 = 0;
        class266.field4393 = 0;
        class66.field1043 = 0;
        class272.field4541 = 0;
        class82.field1343 = 0;
        class82.field1331 = 0;
        class320.field5498 = 0;
        class13.field204 = 0;
        class275.field4588 = 0;
        class198.field3069 = 0;
        class198.field3083 = 0;
        class41.field667 = 0;
        class120.field1871 = 0;
        class228.field3610 = 0;
        class53.field835 = 0;
        class295.field4914 = 0;
        class116.field1825 = 0;
        class26.field373 = 0;
        class132.field2009 = 0;
        class266.field4367 = 0;
        class28.field468 = 0;
        class193.field3015 = 0;
        class319.field5465 = 0;
        class104.field1662 = 0;
        class303.field5223 = 0;
        class297.field5129 = 0;
        class304.field5247 = 0;
        class56.field906 = 0;
        class325.field5643 = 0;
        class233.field3689 = 0;
        class140.field2130 = 0;
        class254.field4151 = 0;
        class302.field5203 = 0;
        class269.field4442 = 0;
        class12.field174 = 0;
        class17.field246 = 0;
        class82.field1348 = 0;
        class18.field257 = 0;
        class229.field3636 = 0;
        class320.field5497 = 0;
        class246.field4029 = 0;
        class13.field217 = 0;
        class66.field1029 = 0;
        class82.field1313 = 0;
        class315.field5396 = 0;
        class294.field4892 = 0;
        class185.field2885 = 0;
        class260.field4251 = 0;
        class123.field1912 = 0;
        class26.field385 = 0;
        class325.field5606 = 0;
        class325.field5621 = 0;
        class315.field5385 = 0;
        class251.field4099 = 0;
        class76.field1151 = 0;
        class133.field2029 = 0;
        class262.field4289 = 0;
        class245.field4020 = 0;
        class131.field1995 = 0;
        class61.field991 = 0;
        client.field4120 = 0;
        class266.field4366 = 0;
        class32.field530 = 0;
        class18.field259 = 0;
        class26.field376 = 0;
        class33.field557 = 0;
        class53.field829 = 0;
        class301.field5182 = 0;
        class305.field5249 = 0;
        class64.field1014 = 0;
        class141.field2162 = 0;
        class285.field4775 = 0;
        class163.field2528 = 0;
        class204.field3189 = 0;
        class135.field2056 = 0;
        class151.field2363 = 0;
        class26.field403 = 0;
        class82.field1283 = 0;
        class26.field438 = 0;
        class309.field5313 = 0;
        class151.field2364 = 0;
        class118.field1849 = 0;
        class56.field909 = 0;
        class146.field2254 = 0;
        class209.field3237 = 0;
        class266.field4387 = 0;
        class266.field4404 = 0;
        class71.field1094 = 0;
        class215.field3359 = 0;
        class107.field1679 = 0;
        class124.field1930 = 0;
        class149.field2339 = 0;
        class322.field5530 = 0;
        class36.field591 = 0;
        class325.field5620 = 0;
        class308.field5298 = 0;
        class139.field2129 = 0;
        class220.field3507 = 0;
        class71.field1085 = 0;
        class297.field5008 = 0;
        class193.field3014 = 0;
        class36.field587 = 0;
        class82.field1317 = 0;
        class178.field2799 = 0;
        class159.field2494 = 0;
        class310.field5329 = 0;
        class120.field1866 = 0;
        class145.field2211 = 0;
        class112.field1775 = 0;
        field4074 = 0;
        class187.field2899 = 0;
        class254.field4154 = 0;
        class51.field799 = 0;
        class146.field2257 = 0;
        class240.field3879 = 0;
        class305.field5260 = 0;
        class39.field638 = 0;
        class41.field677 = 0;
        class27.field460 = 0;
        class303.field5215 = 0;
        class12.field159 = 0;
        class163.field2534 = 0;
        class232.field3671 = 0;
        class14.field228 = 0;
        class160.field2514 = 0;
        class229.field3627 = 0;
        class109.field1739 = 0;
        class325.field5627 = 0;
        class74.field1139 = 0;
        class153.field2389 = 0;
        class88.field1448 = 0;
        class96.field1559 = 0;
        class141.field2150 = 0;
        class259.field4243 = 0;
        class246.field4039 = 0;
        class126.field1938 = 0;
        class208.field3229 = 0;
        class78.field1242 = 0;
        class103.field1647 = 0;
        class103.field1655 = 0;
        class109.field1732 = 0;
        class208.field3230 = 0;
        class266.field4397 = 0;
        class82.field1314 = 0;
        class268.field4437 = 0;
        class166.field2572 = 0;
        class209.field3236 = 0;
        class273.field4568 = 0;
        class266.field4402 = 0;
        class290.field4835 = 0;
        class5.field51 = 0;
        class284.field4747 = 0;
        class86.field1417 = 0;
        class261.field4278 = 0;
        class82.field1296 = 0;
        class33.field556 = 0;
        class101.field1629 = 0;
        class285.field4792 = 0;
        class261.field4267 = 0;
        class22.field319 = 0;
        class41.field681 = 0;
        class181.field2841 = 0;
        class317.field5428 = 0;
        class97.field1579 = 0;
        class142.field2171 = 0;
        class300.field5181 = 0;
        class31.field524 = 0;
        class37.field603 = 0;
        class266.field4368 = 0;
        class181.field2818 = 0;
        class325.field5623 = 0;
        class20.field278 = 0;
        class113.field1783 = 0;
        class292.field4852 = 0;
        class83.field1361 = 0;
        class36.field596 = 0;
        class53.field837 = 0;
        client.field4124 = 0;
        class146.field2282 = 0;
        class302.field5199 = 0;
        class85.field1403 = 0;
        class74.field1131 = 0;
        class324.field5578 = 0;
        class158.field2459 = 0;
        class100.field1609 = 0;
        class214.field3343 = 0;
        class5.field66 = 0;
        class282.field4697 = 0;
        class32.field534 = 0;
        class114.field1790 = 0;
        class209.field3243 = 0;
        class82.field1337 = 0;
        class151.field2367 = 0;
        class222.field3520 = 0;
        class118.field1858 = 0;
        class26.field401 = 0;
        class236.field3753 = 0;
        class146.field2277 = 0;
        class9.field112 = 0;
        class240.field3877 = 0;
        class266.field4384 = 0;
        class261.field4262 = 0;
        class18.field261 = 0;
        class26.field404 = 0;
        class283.field4727 = 0;
        class187.field2902 = 0;
        class28.field484 = 0;
        class146.field2266 = 0;
        class325.field5645 = 0;
        class118.field1850 = 0;
        class116.field1827 = 0;
        class285.field4779 = 0;
        class82.field1346 = 0;
        class115.field1804 = 0;
        class82.field1300 = 0;
        class258.field4213 = 0;
        class120.field1881 = 0;
        class290.field4833 = 0;
        class82.field1320 = 0;
        class39.field654 = 0;
        class115.field1820 = 0;
        class82.field1308 = 0;
        class319.field5475 = 0;
        class236.field3758 = 0;
        class56.field916 = 0;
        class40.field661 = 0;
        class84.field1366 = 0;
        field4057 = 0;
        class259.field4214 = 0;
        class26.field432 = 0;
        class53.field861 = 0;
        class217.field3401 = 0;
        class146.field2253 = 0;
        class198.field3076 = 0;
        class203.field3172 = 0;
        class146.field2281 = 0;
        class224.field3533 = 0;
        class285.field4788 = 0;
        class50.field779 = 0;
        class120.field1872 = 0;
        class160.field2513 = 0;
        class76.field1158 = 0;
        class26.field409 = 0;
        class225.field3565 = 0;
        class301.field5189 = 0;
        class74.field1129 = 0;
        class250.field4086 = 0;
        class40.field662 = 0;
        class232.field3678 = 0;
        class146.field2216 = 0;
        class324.field5584 = 0;
        class9.field103 = 0;
        class203.field3155 = 0;
        class263.field4300 = 0;
        class109.field1717 = 0;
        class112.field1759 = 0;
        class131.field1997 = 0;
        class282.field4714 = 0;
        class42.field692 = 0;
        class97.field1581 = 0;
        class240.field3874 = 0;
        class121.field1894 = 0;
        class64.field1007 = 0;
        class217.field3432 = 0;
        class151.field2361 = 0;
        class297.field5079 = 0;
        class38.field620 = 0;
        class68.field1060 = 0;
        class318.field5442 = 0;
        class147.field2307 = 0;
        class28.field463 = 0;
        class33.field550 = 0;
        class147.field2298 = 0;
        class158.field2460 = 0;
        class96.field1562 = 0;
        class41.field672 = 0;
        class282.field4713 = 0;
        class5.field53 = 0;
        class72.field1119 = 0;
        class96.field1558 = 0;
        class26.field416 = 0;
        class315.field5393 = 0;
        class317.field5437 = 0;
        class112.field1770 = 0;
        class317.field5435 = 0;
        class327.field5659 = 0;
        class78.field1223 = 0;
        class114.field1798 = 0;
        class283.field4724 = 0;
        class124.field1929 = 0;
        class320.field5501 = 0;
        class5.field60 = 0;
        class13.field203 = 0;
        class236.field3735 = 0;
        class327.field5673 = 0;
        class50.field781 = 0;
        class283.field4728 = 0;
        class151.field2359 = 0;
        class5.field64 = 0;
        class83.field1358 = 0;
        class53.field843 = 0;
        class210.field3270 = 0;
        class133.field2026 = 0;
        class210.field3265 = 0;
        class151.field2356 = 0;
        class109.field1721 = 0;
        class325.field5617 = 0;
        class160.field2512 = 0;
        class58.field939 = 0;
        class98.field1590 = 0;
        class26.field441 = 0;
        class22.field314 = 0;
        class271.field4527 = 0;
        class82.field1310 = 0;
        class135.field2071 = 0;
        class82.field1342 = 0;
        class319.field5457 = 0;
        class198.field3074 = 0;
        class216.field3384 = 0;
        class325.field5630 = 0;
        class203.field3176 = 0;
        class310.field5327 = 0;
        class84.field1376 = 0;
        class137.field2102 = 0;
        class173.field2711 = 0;
        class313.field5354 = 0;
        class318.field5438 = 0;
        class243.field4000 = 0;
        class196.field3043 = 0;
        class37.field617 = 0;
        class74.field1128 = 0;
        class146.field2230 = 0;
        class259.field4227 = 0;
        class82.field1341 = 0;
        class2.field16 = 0;
        class219.field3502 = 0;
        class85.field1389 = 0;
        class20.field267 = 0;
        class300.field5155 = 0;
        class28.field467 = 0;
        class26.field382 = 0;
        class13.field190 = 0;
        class25.field372 = 0;
        class187.field2918 = 0;
        class216.field3389 = 0;
        class37.field613 = 0;
        class317.field5429 = 0;
        class51.field814 = 0;
        class241.field3973 = 0;
        class160.field2507 = 0;
        class266.field4378 = 0;
        class158.field2468 = 0;
        class163.field2532 = 0;
        class147.field2301 = 0;
        class13.field196 = 0;
        class51.field805 = 0;
        class241.field3907 = 0;
        class94.field1532 = 0;
        class298.field5134 = 0;
        class277.field4628 = 0;
        class298.field5140 = 0;
        class241.field3888 = 0;
        class118.field1848 = 0;
        class300.field5164 = 0;
        class22.field312 = 0;
        class252.field4130 = 0;
        class11.field145 = 0;
        class133.field2020 = 0;
        class214.field3328 = 0;
        class149.field2331 = 0;
        class7.field78 = 0;
        class233.field3699 = 0;
        class266.field4403 = 0;
        class282.field4712 = 0;
        class208.field3228 = 0;
        class26.field433 = 0;
        class262.field4288 = 0;
        class26.field381 = 0;
        class88.field1438 = 0;
        class165.field2555 = 0;
        class78.field1176 = 0;
        class198.field3068 = 0;
        class46.field719 = 0;
        class82.field1271 = 0;
        class28.field469 = 0;
        class84.field1364 = 0;
        class297.field5080 = 0;
        class12.field161 = 0;
        class35.field574 = 0;
        class300.field5170 = 0;
        class181.field2838 = 0;
        class315.field5390 = 0;
        class159.field2482 = 0;
        class10.field125 = 0;
        class82.field1324 = 0;
        field4055 = 0;
        class141.field2160 = 0;
        class217.field3429 = 0;
        class135.field2068 = 0;
        class241.field3948 = 0;
        class7.field87 = 0;
        class320.field5493 = 0;
        class252.field4133 = 0;
        field4065 = 0;
        class134.field2048 = 0;
        class153.field2386 = 0;
        class290.field4826 = 0;
        class159.field2489 = 0;
        class142.field2176 = 0;
        class126.field1944 = 0;
        class272.field4557 = 0;
        class82.field1322 = 0;
        class82.field1336 = 0;
        class13.field198 = 0;
        class33.field549 = 0;
        class275.field4590 = 0;
        class219.field3503 = 0;
        class141.field2158 = 0;
        class232.field3673 = 0;
        class302.field5202 = 0;
        class64.field1015 = 0;
        class325.field5610 = 0;
        class98.field1589 = 0;
        class217.field3412 = 0;
        class33.field546 = 0;
        class82.field1288 = 0;
        class47.field742 = 0;
        class319.field5452 = 0;
        class290.field4836 = 0;
        class153.field2383 = 0;
        class265.field4356 = 0;
        class214.field3339 = 0;
        class266.field4381 = 0;
        class144.field2194 = 0;
        class212.field3299 = 0;
        class319.field5456 = 0;
        class266.field4363 = 0;
        class82.field1275 = 0;
        class222.field3522 = 0;
        class241.field3953 = 0;
        class58.field951 = 0;
        class264.field4312 = 0;
        client.field4121 = 0;
        class61.field985 = 0;
        class24.field337 = 0;
        class319.field5469 = 0;
        class283.field4717 = 0;
        class214.field3345 = 0;
        class260.field4245 = 0;
        class45.field701 = 0;
        class283.field4731 = 0;
        class212.field3296 = 0;
        class284.field4743 = 0;
        class277.field4641 = 0;
        class240.field3873 = 0;
        field4067 = 0;
        class104.field1664 = 0;
        class272.field4547 = 0;
        class144.field2195 = 0;
        class230.field3653 = 0;
        class267.field4413 = 0;
        class134.field2042 = 0;
        class46.field731 = 0;
        class86.field1410 = 0;
        class324.field5597 = 0;
        class61.field984 = 0;
        class203.field3150 = 0;
        class244.field4007 = 0;
        class26.field440 = 0;
        class268.field4432 = 0;
        class38.field625 = 0;
        class5.field52 = 0;
        class116.field1826 = 0;
        class259.field4225 = 0;
        class268.field4424 = 0;
        class39.field651 = 0;
        class82.field1273 = 0;
        class117.field1832 = 0;
        class147.field2299 = 0;
        class282.field4700 = 0;
        class96.field1566 = 0;
        class279.field4653 = 0;
        class13.field207 = 0;
        class277.field4630 = 0;
        class146.field2272 = 0;
        client.field4107 = 0;
        class153.field2396 = 0;
        class36.field594 = 0;
        class53.field860 = 0;
        class297.field4991 = 0;
        class96.field1576 = 0;
        class293.field4885 = 0;
        class303.field5218 = 0;
        class308.field5309 = 0;
        class287.field4799 = 0;
        class132.field2002 = 0;
        class295.field4915 = 0;
        class246.field4035 = 0;
        class215.field3358 = 0;
        class173.field2713 = 0;
        class199.field3090 = 0;
        class79.field1251 = 0;
        class283.field4718 = 0;
        class268.field4425 = 0;
        class265.field4348 = 0;
        class118.field1856 = 0;
        class217.field3402 = 0;
        class80.field1253 = 0;
        class252.field4137 = 0;
        class21.field303 = 0;
        class173.field2712 = 0;
        class63.field998 = 0;
        class13.field200 = 0;
        class82.field1272 = 0;
        class24.field341 = 0;
        class39.field649 = 0;
        class325.field5614 = 0;
        class223.field3526 = 0;
        class28.field479 = 0;
        class316.field5406 = 0;
        class168.field2597 = 0;
        class64.field1019 = 0;
        class134.field2053 = 0;
        class302.field5209 = 0;
        class314.field5366 = 0;
        class310.field5326 = 0;
        class127.field1963 = 0;
        class229.field3633 = 0;
        class82.field1318 = 0;
        class261.field4263 = 0;
        class250.field4093 = 0;
        class32.field542 = 0;
        class252.field4135 = 0;
        class186.field2888 = 0;
        class325.field5612 = 0;
        class324.field5599 = 0;
        class293.field4886 = 0;
        class24.field355 = 0;
        class39.field636 = 0;
        class82.field1334 = 0;
        class26.field411 = 0;
        class214.field3334 = 0;
        class28.field482 = 0;
        class24.field342 = 0;
        class323.field5554 = 0;
        class263.field4296 = 0;
        class26.field420 = 0;
        class78.field1227 = 0;
        class208.field3233 = 0;
        class115.field1814 = 0;
        class53.field857 = 0;
        class261.field4261 = 0;
        class47.field762 = 0;
        class228.field3616 = 0;
        class144.field2193 = 0;
        class13.field185 = 0;
        class82.field1276 = 0;
        class124.field1931 = 0;
        class78.field1214 = 0;
        class78.field1198 = 0;
        class22.field317 = 0;
        class321.field5509 = 0;
        class84.field1377 = 0;
        class138.field2112 = 0;
        class133.field2028 = 0;
        class146.field2261 = 0;
        class151.field2368 = 0;
        class219.field3499 = 0;
        class7.field82 = 0;
        class27.field458 = 0;
        class181.field2816 = 0;
        class266.field4391 = 0;
        class97.field1585 = 0;
        class66.field1028 = 0;
        class20.field266 = 0;
        class14.field229 = 0;
        class78.field1233 = 0;
        class167.field2594 = 0;
        class305.field5258 = 0;
        class217.field3455 = 0;
        class224.field3560 = 0;
        class305.field5265 = 0;
        class314.field5363 = 0;
        class277.field4633 = 0;
        class177.field2781 = 0;
        class276.field4612 = 0;
        class240.field3876 = 0;
        class228.field3607 = 0;
        class217.field3403 = 0;
        class266.field4398 = 0;
        class115.field1816 = 0;
        class109.field1716 = 0;
        class9.field106 = 0;
        class155.field2415 = 0;
        class133.field2017 = 0;
        class159.field2503 = 0;
        class135.field2060 = 0;
        class321.field5514 = 0;
        class10.field141 = 0;
        class203.field3158 = 0;
        class23.field328 = 0;
        class281.field4673 = 0;
        class112.field1763 = 0;
        class228.field3602 = 0;
        class259.field4218 = 0;
        class233.field3687 = 0;
        class41.field666 = 0;
        class9.field118 = 0;
        class73.field1126 = 0;
        class109.field1720 = 0;
        field4077 = 0;
        class33.field555 = 0;
        class26.field377 = 0;
        class133.field2021 = 0;
        class88.field1441 = 0;
        class142.field2173 = 0;
        class41.field678 = 0;
        class261.field4264 = 0;
        class319.field5460 = 0;
        class236.field3769 = 0;
        class199.field3092 = 0;
        class168.field2602 = 0;
        class74.field1140 = 0;
        class26.field389 = 0;
        class294.field4890 = 0;
        class214.field3332 = 0;
        class219.field3501 = 0;
        class208.field3227 = 0;
        class4.field43 = 0;
        class26.field414 = 0;
        class191.field2990 = 0;
        class319.field5489 = 0;
        class160.field2509 = 0;
        class76.field1157 = 0;
        class166.field2579 = 0;
        class260.field4248 = 0;
        class57.field925 = 0;
        class5.field58 = 0;
        class204.field3191 = 0;
        class217.field3416 = 0;
        class157.field2453 = 0;
        class266.field4390 = 0;
        class142.field2167 = 0;
        class264.field4328 = 0;
        class74.field1138 = 0;
        class204.field3197 = 0;
        class186.field2890 = 0;
        class89.field1458 = 0;
        class214.field3329 = 0;
        class324.field5594 = 0;
        class82.field1307 = 0;
        class230.field3661 = 0;
        class324.field5595 = 0;
        class246.field4036 = 0;
        class165.field2557 = 0;
        class104.field1663 = 0;
        class86.field1413 = 0;
        class217.field3408 = 0;
        class146.field2226 = 0;
        class98.field1588 = 0;
        class230.field3648 = 0;
        class144.field2191 = 0;
        class266.field4383 = 0;
        class146.field2255 = 0;
        class98.field1594 = 0;
        class20.field272 = 0;
        class135.field2064 = 0;
        class307.field5286 = 0;
        client.field4108 = 0;
        class258.field4208 = 0;
        class13.field193 = 0;
        class64.field1013 = 0;
        class316.field5421 = 0;
        class5.field65 = 0;
        class292.field4854 = 0;
        class146.field2252 = 0;
        class302.field5198 = 0;
        class72.field1120 = 0;
        class153.field2391 = 0;
        class28.field470 = 0;
        class121.field1893 = 0;
        class82.field1284 = 0;
        class100.field1608 = 0;
        class20.field287 = 0;
        class214.field3326 = 0;
        class192.field2999 = 0;
        class323.field5562 = 0;
        class325.field5626 = 0;
        class167.field2583 = 0;
        class42.field697 = 0;
        class219.field3500 = 0;
        class66.field1040 = 0;
        class305.field5270 = 0;
        class38.field619 = 0;
        class291.field4846 = 0;
        class280.field4664 = 0;
        client.field4115 = 0;
        class107.field1681 = 0;
        class56.field912 = 0;
        class325.field5613 = 0;
        class284.field4766 = 0;
        class82.field1321 = 0;
        class123.field1916 = 0;
        class120.field1879 = 0;
        class230.field3659 = 0;
        class325.field5607 = 0;
        class41.field675 = 0;
        class266.field4380 = 0;
        class26.field391 = 0;
        class134.field2044 = 0;
        class281.field4678 = 0;
        class305.field5251 = 0;
        class219.field3498 = 0;
        class2.field13 = 0;
        class82.field1330 = 0;
        class265.field4358 = 0;
        class153.field2385 = 0;
        class168.field2605 = 0;
        class132.field2007 = 0;
        class266.field4375 = 0;
        class235.field3726 = 0;
        class32.field538 = 0;
        class89.field1475 = 0;
        class241.field3897 = 0;
        class232.field3669 = 0;
        class241.field3934 = 0;
        class98.field1592 = 0;
        class41.field688 = 0;
        class31.field525 = 0;
        class10.field143 = 0;
        class259.field4232 = 0;
        class83.field1353 = 0;
        class283.field4730 = 0;
        class173.field2709 = 0;
        class181.field2831 = 0;
        class316.field5414 = 0;
        class40.field658 = 0;
        class82.field1298 = 0;
        class72.field1118 = 0;
        class150.field2348 = 0;
        class120.field1867 = 0;
        class228.field3594 = 0;
        class120.field1880 = 0;
        class109.field1711 = 0;
        class210.field3267 = 0;
        class113.field1776 = 0;
        class53.field845 = 0;
        class71.field1086 = 0;
        class272.field4548 = 0;
        class209.field3252 = 0;
        class4.field34 = 0;
        class196.field3048 = 0;
        class67.field1057 = 0;
        class76.field1146 = 0;
        class146.field2263 = 0;
        class233.field3685 = 0;
        class203.field3152 = 0;
        class1.field10 = 0;
        class281.field4676 = 0;
        class108.field1702 = 0;
        class82.field1333 = 0;
        class82.field1326 = 0;
        class224.field3542 = 0;
        class181.field2835 = 0;
        class96.field1570 = 0;
        class146.field2245 = 0;
        class217.field3396 = 0;
        class82.field1329 = 0;
        class167.field2593 = 0;
        class1.field6 = 0;
        class320.field5492 = 0;
        class137.field2094 = 0;
        class82.field1309 = 0;
        class82.field1282 = 0;
        class199.field3088 = 0;
        class113.field1779 = 0;
        class89.field1460 = 0;
        class294.field4899 = 0;
        class13.field208 = 0;
        class159.field2487 = 0;
        class265.field4354 = 0;
        class98.field1604 = 0;
        class25.field363.field2140 = 0;
        class98.field1598 = true;
        class283.method1991(112);
        class284.field4757 = -1;
        class178.field2800 = -1;
        class26.field384 = -1;
        class80.field1262 = 0;
        class11.field155 = 0;
        class114.field1789.field1301 = 0;
        class56.field907 = -1;
        class148.field2311 = 0;
        class300.field5157.field1301 = 0;
        for (int var1 = 0; var1 < class122.field1901.length; var1++) {
            class122.field1901[var1] = null;
        }
        class126.field1955 = 0;
        class11.field153 = false;
        class38.method315(119, 0);
        for (int var2 = 0; var2 < 100; var2++) {
            class56.field904[var2] = null;
        }
        class134.field2046 = 0;
        class113.field1781 = (int) (Math.random() * 100.0D) - 50;
        class7.field84 = 0;
        class300.field5156 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
        class258.field4202 = -1;
        class80.field1261 = 0;
        class154.field2402 = 0;
        class61.field988 = (int) (Math.random() * 110.0D) - 55;
        class86.field1420 = false;
        class51.field797 = (int) (Math.random() * 30.0D) - 20;
        class101.field1624 = 0;
        class64.field1020 = 0;
        class158.field2465 = (int) (Math.random() * 120.0D) - 60;
        class245.field4027 = 0;
        class56.field921 = (int) (Math.random() * 80.0D) - 40;
        class81.field1270 = 0;
        for (int var3 = 0; var3 < 2048; var3++) {
            class268.field4427[var3] = null;
            class64.field1018[var3] = null;
        }
        for (int var4 = 0; var4 < 32768; var4++) {
            class185.field2877[var4] = null;
        }
        class13.field221 = class268.field4427[2047] = new class159();
        class18.field258.method253(-112);
        class303.field5219.method253(-58);
        if (class268.field4433 != null) {
            for (int var5 = 0; var5 < 4; var5++) {
                for (int var6 = 0; var6 < 104; var6++) {
                    for (int var7 = 0; var7 < 104; var7++) {
                        class268.field4433[var5][var6][var7] = null;
                    }
                }
            }
        }
        class98.field1595 = new class32();
        class145.field2209 = 0;
        class321.field5520 = 0;
        class1.method7(-114);
        class55.method402((byte) 24);
        class222.field3517 = 0;
        class252.field4131 = 0;
        class107.field1682 = 0;
        class126.field1954 = 0;
        class189.field2972 = 0;
        class71.field1091 = 0;
        class300.field5153 = 0;
        class305.field5256 = 0;
        class57.field929 = 0;
        class252.field4143 = 0;
        for (int var8 = 0; var8 < class187.field2935.length; var8++) {
            class187.field2935[var8] = -1;
        }
        if (class250.field4095 != -1) {
            class177.method1224((byte) -128, class250.field4095);
        }
        for (class174 var9 = (class174) class74.field1132.method1823(82); var9 != null; var9 = (class174) class74.field1132.method1825(-104)) {
            class113.method786(true, var9, false);
        }
        class250.field4095 = -1;
        class74.field1132 = new class259(8);
        class116.method808(-113);
        class142.field2165 = null;
        class11.field153 = false;
        class126.field1955 = 0;
        class14.field232.method1399(new int[] { 0, 0, 0, 0, 0 }, -1, false, 0, (int[]) null, -1);
        for (int var10 = 0; var10 < 8; var10++) {
            class228.field3596[var10] = null;
            class273.field4570[var10] = false;
            class201.field3127[var10] = -1;
        }
        class33.method267((byte) 80);
        class84.field1383 = true;
        for (int var11 = 0; var11 < 100; var11++) {
            class2.field21[var11] = true;
        }
        class96.field1567 = 0;
        class4.field49 = null;
        class297.field5057 = null;
        for (int var12 = 0; var12 < 6; var12++) {
            class315.field5392[var12] = new class37();
        }
        for (int var13 = 0; var13 < 25; var13++) {
            class303.field5228[var13] = 0;
            class210.field3258[var13] = 0;
            class37.field601[var13] = 0;
        }
        if (class255.field4184) {
            class292.method2053((byte) 64);
        }
        class103.field1651 = arg0;
        class101.field1615 = 0;
        class112.field1771 = class95.field1554;
        class233.field3694 = false;
        class190.field2987 = class245.field4021 = class157.field2456 = class190.field2985 = new short[256];
        class283.method1997(-7878);
        class266.field4385 = false;
        class158.method1074(-3);
    }
}
