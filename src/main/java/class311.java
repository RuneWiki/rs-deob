import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class311 {

    @OriginalMember(owner = "client!qf", name = "D", descriptor = "I")
    private int field4870 = 0;

    @OriginalMember(owner = "client!qf", name = "k", descriptor = "[Lmh;")
    public class287[] field4851;

    @OriginalMember(owner = "client!qf", name = "t", descriptor = "I")
    public int field4860;

    @OriginalMember(owner = "client!qf", name = "p", descriptor = "[I")
    public static int[] field4856 = new int[5];

    @OriginalMember(owner = "client!qf", name = "o", descriptor = "[I")
    public static int[] field4855 = new int[32];

    @OriginalMember(owner = "client!qf", name = "z", descriptor = "Ljava/lang/String;")
    public static String field4866 = "glow3:";

    @OriginalMember(owner = "client!qf", name = "E", descriptor = "I")
    public static int field4871 = 10;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "I")
    public static int field4841;

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "I")
    public static int field4842;

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "I")
    public static int field4843;

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "I")
    public static int field4844;

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "I")
    public static int field4845;

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "I")
    public static int field4846;

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "I")
    public static int field4847;

    @OriginalMember(owner = "client!qf", name = "h", descriptor = "I")
    public static int field4848;

    @OriginalMember(owner = "client!qf", name = "i", descriptor = "I")
    public static int field4849;

    @OriginalMember(owner = "client!qf", name = "j", descriptor = "I")
    public static int field4850;

    @OriginalMember(owner = "client!qf", name = "m", descriptor = "I")
    public static int field4853;

    @OriginalMember(owner = "client!qf", name = "n", descriptor = "I")
    public static int field4854;

    @OriginalMember(owner = "client!qf", name = "q", descriptor = "I")
    public static int field4857;

    @OriginalMember(owner = "client!qf", name = "r", descriptor = "I")
    public static int field4858;

    @OriginalMember(owner = "client!qf", name = "s", descriptor = "I")
    public static int field4859;

    @OriginalMember(owner = "client!qf", name = "u", descriptor = "I")
    public static int field4861;

    @OriginalMember(owner = "client!qf", name = "v", descriptor = "I")
    public static int field4862;

    @OriginalMember(owner = "client!qf", name = "w", descriptor = "I")
    public static int field4863;

    @OriginalMember(owner = "client!qf", name = "y", descriptor = "I")
    public static int field4865;

    @OriginalMember(owner = "client!qf", name = "C", descriptor = "I")
    public static int field4869;

    @OriginalMember(owner = "client!qf", name = "l", descriptor = "J")
    private long field4852;

    @OriginalMember(owner = "client!qf", name = "x", descriptor = "Lmh;")
    private class287 field4864;

    @OriginalMember(owner = "client!qf", name = "A", descriptor = "Lmh;")
    private class287 field4867;

    @OriginalMember(owner = "client!qf", name = "B", descriptor = "[[B")
    public static byte[][] field4868;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Z)V", line = 4)
    public static void method2156(boolean arg0) {
        field4866 = null;
        field4868 = (byte[][]) null;
        field4855 = null;
        field4856 = null;
        if (!arg0) {
            method2173((class136[]) null, -79, -16, 41, 38, -11, 121, -54, -46, -14);
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(I[Lmh;)I", line = 19)
    public final int method2157(int arg0, class287[] arg1) {
        int var3 = arg0;
        for (int var4 = 0; var4 < this.field4860; var4++) {
            class287 var5 = this.field4851[var4];
            for (class287 var6 = var5.field4427; var6 != var5; var6 = var6.field4427) {
                arg1[var3++] = var6;
            }
        }
        field4841++;
        return var3;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)I", line = 46)
    public static final int method2158(int arg0) {
        class261.field4102 = 0;
        if (arg0 != -2265) {
            field4871 = -109;
        }
        field4850++;
        return class216.method1572((byte) -14);
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(I)I", line = 64)
    public static final int method2159(int arg0) {
        if (arg0 < 40) {
            method2156(true);
        }
        field4854++;
        return class45.field603.method1352(0);
    }

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "(I)V", line = 77)
    public static final void method2160(int arg0) {
        field4865++;
        class139.field2216++;
        class183.field2965.method1947((byte) 103, 98);
        if (arg0 >= -30) {
            field4871 = -70;
        }
        class183.field2965.method53((byte) 93, 0L);
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lmh;JI)V", line = 92)
    public final void method2161(class287 arg0, long arg1, int arg2) {
        field4846++;
        if (arg0.field4432 != null) {
            arg0.method2028(13329);
        }
        class287 var5 = this.field4851[(int) (arg1 & (long) (this.field4860 + arg2))];
        arg0.field4427 = var5;
        arg0.field4430 = arg1;
        arg0.field4432 = var5.field4432;
        arg0.field4432.field4427 = arg0;
        arg0.field4427.field4432 = arg0;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(II[Ljava/lang/Object;[JI)V", line = 111)
    public static final void method2162(int arg0, int arg1, Object[] arg2, long[] arg3, int arg4) {
        if (arg1 != 0) {
            field4855 = (int[]) null;
        }
        field4842++;
        if (arg4 >= arg0) {
            return;
        }
        int var5 = (arg0 + arg4) / 2;
        long var6 = arg3[var5];
        int var8 = arg4;
        arg3[var5] = arg3[arg0];
        arg3[arg0] = var6;
        Object var9 = arg2[var5];
        arg2[var5] = arg2[arg0];
        arg2[arg0] = var9;
        for (int var10 = arg4; var10 < arg0; var10++) {
            if (((long) (var10 & 0x1) + var6) > arg3[var10]) {
                long var11 = arg3[var10];
                arg3[var10] = arg3[var8];
                arg3[var8] = var11;
                Object var13 = arg2[var10];
                arg2[var10] = arg2[var8];
                arg2[var8++] = var13;
            }
        }
        arg3[arg0] = arg3[var8];
        arg3[var8] = var6;
        arg2[arg0] = arg2[var8];
        arg2[var8] = var9;
        method2162(var8 - 1, 0, arg2, arg3, arg4);
        method2162(arg0, 0, arg2, arg3, var8 + 1);
    }

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "(I)V", line = 165)
    public static final void method2163(int arg0) {
        if (arg0 != 30023) {
            method2162(43, 39, (Object[]) null, (long[]) null, -22);
        }
        class164.field2656.method1359(arg0 ^ 0x7503);
        field4847++;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(B)Lmh;", line = 177)
    public final class287 method2164(byte arg0) {
        field4869++;
        if (this.field4870 > 0 && this.field4851[this.field4870 - 1] != this.field4867) {
            class287 var2 = this.field4867;
            this.field4867 = var2.field4427;
            return var2;
        }
        if (arg0 < 91) {
            method2156(false);
        }
        class287 var3;
        do {
            if (this.field4860 <= this.field4870) {
                return null;
            }
            var3 = this.field4851[this.field4870++].field4427;
        } while (this.field4851[this.field4870 - 1] == var3);
        this.field4867 = var3.field4427;
        return var3;
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(B)V", line = 213)
    public final void method2165(byte arg0) {
        if (arg0 != -103) {
            return;
        }
        for (int var2 = 0; var2 < this.field4860; var2++) {
            class287 var3 = this.field4851[var2];
            while (true) {
                class287 var4 = var3.field4427;
                if (var3 == var4) {
                    break;
                }
                var4.method2028(13329);
            }
        }
        this.field4864 = null;
        field4853++;
        this.field4867 = null;
    }

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "(I)V", line = 243)
    public static final void method2166(int arg0) {
        class167.method1250(class56.field777, 412);
        class172.field2828++;
        field4859++;
        if (class99.field1331 && class3.field27) {
            int var1 = class25.field381;
            int var2 = var1 - class5.field62;
            if (class150.field2357 > var2) {
                var2 = class150.field2357;
            }
            int var3 = class82.field1129;
            int var4 = var3 - class18.field293;
            if (class56.field777.field2137 + var2 > class150.field2357 + class130.field1929.field2137) {
                var2 = class130.field1929.field2137 + class150.field2357 - class56.field777.field2137;
            }
            int var5 = class56.field777.field1989;
            if (class20.field311 > var4) {
                var4 = class20.field311;
            }
            int var6 = var2 - class157.field2436;
            if ((class56.field777.field2078 + var4) > (class20.field311 + class130.field1929.field2078)) {
                var4 = class130.field1929.field2078 + class20.field311 - class56.field777.field2078;
            }
            int var7 = var4 + class130.field1929.field2018 - class20.field311;
            int var8 = var4 - class291.field4508;
            if (class172.field2828 > class56.field777.field2114 && (var5 < var6 || var6 < -var5 || var8 > var5 || -var5 > var8)) {
                class283.field4390 = true;
            }
            if (arg0 == 2) {
                int var9 = class130.field1929.field2129 + var2 - class150.field2357;
                if (class56.field777.field2004 != null && class283.field4390) {
                    class15 var10 = new class15();
                    var10.field243 = class56.field777.field2004;
                    var10.field261 = var7;
                    var10.field248 = class56.field777;
                    var10.field259 = var9;
                    class172.method1282(var10, (byte) 73);
                }
                if (class183.field2971 == 0) {
                    if (class283.field4390) {
                        if (class56.field777.field2029 != null) {
                            class15 var11 = new class15();
                            var11.field261 = var7;
                            var11.field259 = var9;
                            var11.field248 = class56.field777;
                            var11.field243 = class56.field777.field2029;
                            var11.field244 = class82.field1119;
                            class172.method1282(var11, (byte) 73);
                        }
                        if (class82.field1119 != null && client.method951(class56.field777) != null) {
                            class183.field2965.method1947((byte) -65, 66);
                            class101.field1339++;
                            class183.field2965.method63((byte) 74, class82.field1119.field2069);
                            class183.field2965.method41(class56.field777.field2069, (byte) -128);
                            class183.field2965.method45(true, class56.field777.field2086);
                            class183.field2965.method65((byte) -9, class82.field1119.field2086);
                        }
                    } else if ((class274.field4235 == 1 || class325.method2285(class78.field1046 - 1, false)) && class78.field1046 > 2) {
                        class283.method2008(true);
                    } else if (class78.field1046 > 0) {
                        class113.method797(true);
                    }
                    class56.field777 = null;
                }
            }
        } else if (class172.field2828 > 1) {
            class56.field777 = null;
        }
    }

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "(I)V", line = 364)
    public static final void method2167(int arg0) {
        field4857++;
        class58.field825.method1355(false);
        if (arg0 != -1) {
            method2158(20);
        }
        class229.field3586.method1355(false);
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(JB)Lmh;", line = 388)
    public final class287 method2168(long arg0, byte arg1) {
        field4861++;
        this.field4852 = arg0;
        class287 var4 = this.field4851[(int) (arg0 & (long) (this.field4860 - 1))];
        this.field4864 = var4.field4427;
        if (arg1 > -75) {
            return (class287) null;
        }
        while (this.field4864 != var4) {
            if (this.field4864.field4430 == arg0) {
                class287 var5 = this.field4864;
                this.field4864 = this.field4864.field4427;
                return var5;
            }
            this.field4864 = this.field4864.field4427;
        }
        this.field4864 = null;
        return null;
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(Z)I", line = 418)
    public final int method2169(boolean arg0) {
        field4843++;
        int var2 = 0;
        if (arg0) {
            return -27;
        }
        for (int var3 = 0; var3 < this.field4860; var3++) {
            class287 var4 = this.field4851[var3];
            for (class287 var5 = var4.field4427; var5 != var4; var5 = var5.field4427) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "(I)Lmh;", line = 449)
    public final class287 method2170(int arg0) {
        field4848++;
        if (this.field4864 == null) {
            return null;
        }
        class287 var2 = this.field4851[(int) ((long) (this.field4860 + arg0) & this.field4852)];
        while (this.field4864 != var2) {
            if (this.field4864.field4430 == this.field4852) {
                class287 var3 = this.field4864;
                this.field4864 = this.field4864.field4427;
                return var3;
            }
            this.field4864 = this.field4864.field4427;
        }
        this.field4864 = null;
        return null;
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(I)V", line = 478)
    public class311(int arg0) {
        this.field4851 = new class287[arg0];
        this.field4860 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class287 var3 = this.field4851[var2] = new class287();
            var3.field4432 = var3;
            var3.field4427 = var3;
        }
    }

    @OriginalMember(owner = "client!qf", name = "h", descriptor = "(I)I", line = 503)
    public final int method2171(int arg0) {
        if (arg0 == -11838) {
            field4858++;
            return this.field4860;
        } else {
            return 112;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Ljava/lang/String;ILvl;)I", line = 519)
    public static final int method2172(String arg0, int arg1, class6 arg2) {
        field4863++;
        if (arg1 != 15994) {
            return 6;
        }
        int var3 = arg2.field111;
        byte[] var4 = class184.method1349(115, arg0);
        arg2.method54((byte) -28, var4.length);
        arg2.field111 += class238.field3731.method1712(var4, 0, arg2.field111, (byte) 78, arg2.field115, var4.length);
        return arg2.field111 - var3;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "([Lcd;IIIIIIIII)V", line = 538)
    public static final void method2173(class136[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field4845++;
        if (class109.field1458) {
            class122.method885(arg1, arg9, arg2, arg6);
        } else {
            class280.method1978(arg1, arg9, arg2, arg6);
            class31.method277();
        }
        for (int var10 = 0; var10 < arg0.length; var10++) {
            class136 var11 = arg0[var10];
            if (var11 != null && (var11.field2090 == arg5 || arg5 == -1412584499 && class56.field777 == var11)) {
                int var12;
                if (arg3 == -1) {
                    class170.field2798[class310.field4829] = var11.field2131 + arg7;
                    class322.field5083[class310.field4829] = var11.field2111 + arg8;
                    class170.field2794[class310.field4829] = var11.field2137;
                    class164.field2660[class310.field4829] = var11.field2078;
                    var12 = class310.field4829++;
                } else {
                    var12 = arg3;
                }
                var11.field2008 = class229.field3595;
                var11.field2054 = var12;
                if (!var11.field2164 || !client.method952(var11)) {
                    if (var11.field2038 > 0) {
                        class269.method1910((byte) 116, var11);
                    }
                    int var13 = var11.field2111 + arg8;
                    int var14 = var11.field2022;
                    int var15 = var11.field2131 + arg7;
                    if (class290.field4478 && (client.method953(var11).field1843 != 0 || var11.field2063 == 0) && var14 > 127) {
                        var14 = 127;
                    }
                    if (class56.field777 == var11) {
                        if (arg5 != -1412584499 && !var11.field2070) {
                            class224.field3558 = arg0;
                            class232.field3625 = arg7;
                            class233.field3635 = arg8;
                            continue;
                        }
                        if (!var11.field2070) {
                            var14 = 128;
                        }
                        if (class283.field4390 && class3.field27) {
                            int var16 = class82.field1129;
                            int var17 = var16 - class18.field293;
                            if (class20.field311 > var17) {
                                var17 = class20.field311;
                            }
                            if (class20.field311 + class130.field1929.field2078 < var11.field2078 + var17) {
                                var17 = class20.field311 + class130.field1929.field2078 - var11.field2078;
                            }
                            var13 = var17;
                            int var18 = class25.field381;
                            int var19 = var18 - class5.field62;
                            if (class150.field2357 > var19) {
                                var19 = class150.field2357;
                            }
                            if ((var11.field2137 + var19) > (class150.field2357 + class130.field1929.field2137)) {
                                var19 = class150.field2357 + class130.field1929.field2137 - var11.field2137;
                            }
                            var15 = var19;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var11.field2063 == 2) {
                        var20 = arg1;
                        var21 = arg2;
                        var22 = arg6;
                        var23 = arg9;
                    } else {
                        int var24 = var15 + var11.field2137;
                        var23 = var13 > arg9 ? var13 : arg9;
                        int var25 = var11.field2078 + var13;
                        if (var11.field2063 == 9) {
                            var25++;
                            var24++;
                        }
                        var21 = arg2 > var24 ? var24 : arg2;
                        var20 = arg1 >= var15 ? arg1 : var15;
                        var22 = var25 >= arg6 ? arg6 : var25;
                    }
                    if (!var11.field2164 || var21 > var20 && var22 > var23) {
                        if (var11.field2038 != 0) {
                            if (var11.field2038 == 1337 || var11.field2038 == 1403) {
                                class30.field450 = var11;
                                class139.field2213 = var15;
                                class220.field3476 = var13;
                                class43.method349(var15, var13, var11.field2038 == 1403, (byte) 105, var11.field2078, var11.field2137);
                                class231.field3607[var12] = true;
                                if (class109.field1458) {
                                    class122.method885(arg1, arg9, arg2, arg6);
                                } else {
                                    class280.method1978(arg1, arg9, arg2, arg6);
                                }
                                continue;
                            }
                            if (var11.field2038 == 1338) {
                                if (!var11.method989(1)) {
                                    continue;
                                }
                                class224.method1646(6175, var11, var15, var13, var12);
                                if (class109.field1458) {
                                    class122.method885(arg1, arg9, arg2, arg6);
                                } else {
                                    class280.method1978(arg1, arg9, arg2, arg6);
                                }
                                if (class274.field4236 != 0 && class274.field4236 != 3 || class238.field3729 || class215.field3387 < var20 || class57.field812 < var23 || var21 <= class215.field3387 || class57.field812 >= var22) {
                                    continue;
                                }
                                int var26 = class215.field3387 - var15;
                                int var27 = class57.field812 - var13;
                                int var28 = var11.field2084[var27];
                                if (var26 < var28 || var26 > var11.field2027[var27] + var28) {
                                    continue;
                                }
                                int var29 = var27 - var11.field2078 / 2;
                                int var30 = var26 - var11.field2137 / 2;
                                int var31 = (int) class45.field604 + class220.field3483 & 0x7FF;
                                int var32 = class31.field451[var31];
                                int var33 = class31.field467[var31];
                                int var34 = (class293.field4541 + 256) * var33 >> 8;
                                int var35 = (class293.field4541 + 256) * var32 >> 8;
                                int var36 = var29 * var34 + var30 * var35 >> 11;
                                int var37 = var29 * var35 - var30 * var34 >> 11;
                                int var38 = class146.field2310.field4698 + var36 + 64 - (class146.field2310.method2099((byte) 123) * 64) >> 7;
                                int var39 = (class146.field2310.field4731 - (class146.field2310.method2099((byte) 123) - 1) * 64) - var37 >> 7;
                                if (class56.field783 && (class301.field4631 & 0x40) != 0) {
                                    class136 var40 = class294.method2048((byte) 120, class51.field646, class63.field920);
                                    if (var40 == null) {
                                        class29.method264(-1);
                                    } else {
                                        class342.method2368(" ->", class133.field1957, var38, (byte) -68, class33.field488, (short) 6, 1L, var39);
                                    }
                                    continue;
                                }
                                if (class27.field409 == 1) {
                                    class342.method2368("", class185.field3002, var38, (byte) -68, -1, (short) 34, 1L, var39);
                                }
                                class342.method2368("", class61.field895, var38, (byte) -68, -1, (short) 21, 1L, var39);
                                continue;
                            }
                            if (var11.field2038 == 1339) {
                                if (var11.method989(1)) {
                                    class39.method332(var13, var15, (byte) 111, var11, var12);
                                    if (class109.field1458) {
                                        class122.method885(arg1, arg9, arg2, arg6);
                                    } else {
                                        class280.method1978(arg1, arg9, arg2, arg6);
                                    }
                                }
                                continue;
                            }
                            if (var11.field2038 == 1400) {
                                class30.method272(var11.field2078, -125, var11.field2137, var15, var13);
                                class231.field3607[var12] = true;
                                class97.field1277[var12] = true;
                                if (class109.field1458) {
                                    class122.method885(arg1, arg9, arg2, arg6);
                                } else {
                                    class280.method1978(arg1, arg9, arg2, arg6);
                                }
                                continue;
                            }
                            if (var11.field2038 == 1401) {
                                class213.method1555(var15, var13, var11.field2137, 0, var11.field2078);
                                class231.field3607[var12] = true;
                                class97.field1277[var12] = true;
                                if (class109.field1458) {
                                    class122.method885(arg1, arg9, arg2, arg6);
                                } else {
                                    class280.method1978(arg1, arg9, arg2, arg6);
                                }
                                continue;
                            }
                            if (var11.field2038 == 1402) {
                                if (!class109.field1458) {
                                    class105.method724(var15, var13, 0);
                                    class231.field3607[var12] = true;
                                    class97.field1277[var12] = true;
                                }
                                continue;
                            }
                            if (var11.field2038 == 1405) {
                                if (!class306.field4782) {
                                    continue;
                                }
                                int var127 = var13 + 15;
                                int var128 = 16776960;
                                int var129 = var11.field2137 + var15;
                                class102.field1355.method2263("Fps:" + class246.field3834, var129, var127, 16776960, -1);
                                int var142 = var127 + 15;
                                Runtime var130 = Runtime.getRuntime();
                                int var131 = (int) ((var130.totalMemory() - var130.freeMemory()) / 1024L);
                                if (var131 > 65536) {
                                    var128 = 16711680;
                                }
                                class102.field1355.method2263("Mem:" + var131 + "k", var129, var142, var128, -1);
                                var127 = var142 + 15;
                                if (class109.field1458) {
                                    int var132 = 16776960;
                                    int var133 = (class103.field1370 + class103.field1373 + class103.field1374) / 1024;
                                    if (var133 > 65536) {
                                        var132 = 16711680;
                                    }
                                    class102.field1355.method2263("Card:" + var133 + "k", var129, var127, var132, -1);
                                    var127 += 15;
                                }
                                int var134 = 16776960;
                                int var135 = 0;
                                int var136 = 0;
                                int var137 = 0;
                                for (int var138 = 0; var138 < 29; var138++) {
                                    var135 += class18.field291[var138].method1691(-17);
                                    var136 += class18.field291[var138].method1692((byte) -9);
                                    var137 += class18.field291[var138].method1694(0);
                                }
                                int var139 = var137 * 100 / var135;
                                int var140 = var136 * 10000 / var135;
                                String var141 = "Cache:" + class343.method2372(true, 118, 0, (long) var140, 2) + "% (" + var139 + "%)";
                                class29.field430.method2263(var141, var129, var127, var134, -1);
                                var127 += 12;
                                class231.field3607[var12] = true;
                                class97.field1277[var12] = true;
                                continue;
                            }
                            if (var11.field2038 == 1406) {
                                class196.field3132 = var13;
                                class224.field3559 = var11;
                                class124.field1786 = var15;
                                continue;
                            }
                        }
                        if (!class238.field3729) {
                            if (var11.field2063 == 0 && var11.field2148 && var20 <= class215.field3387 && var23 <= class57.field812 && class215.field3387 < var21 && var22 > class57.field812 && !class290.field4478) {
                                class282.field4365[0] = 1007;
                                class78.field1046 = 1;
                                class32.field472[0] = class282.field4357;
                                class135.field1974[0] = class337.field5258;
                                class342.field5324[0] = "";
                            }
                            if (var20 <= class215.field3387 && var23 <= class57.field812 && class215.field3387 < var21 && class57.field812 < var22) {
                                class294.method2051(class57.field812 - var13, var11, class215.field3387 - var15, -2964);
                            }
                        }
                        if (var11.field2063 == 0) {
                            if (!var11.field2164 && client.method952(var11) && class174.field2856 != var11) {
                                continue;
                            }
                            if (!var11.field2164) {
                                if (var11.field2018 > (var11.field2007 - var11.field2078)) {
                                    var11.field2018 = var11.field2007 - var11.field2078;
                                }
                                if (var11.field2018 < 0) {
                                    var11.field2018 = 0;
                                }
                            }
                            if (class109.field1458 && var11.field2038 == 1407) {
                                class189.method1381(var15, var13, var11.field2137, var11.field2078);
                            }
                            method2173(arg0, var20, var21, var12, 115, var11.field2069, var22, var15 - var11.field2129, -var11.field2018 + var13, var23);
                            if (var11.field2062 != null) {
                                method2173(var11.field2062, var20, var21, var12, 91, var11.field2069, var22, var15 - var11.field2129, -var11.field2018 + var13, var23);
                            }
                            class25 var41 = (class25) class210.field3304.method2168((long) var11.field2069, (byte) -82);
                            if (var41 != null) {
                                if (var41.field375 == 0 && !class238.field3729 && var20 <= class215.field3387 && var23 <= class57.field812 && var21 > class215.field3387 && var22 > class57.field812 && !class290.field4478) {
                                    class32.field472[0] = class282.field4357;
                                    class78.field1046 = 1;
                                    class135.field1974[0] = class337.field5258;
                                    class342.field5324[0] = "";
                                    class282.field4365[0] = 1007;
                                }
                                class281.method1986(var23, var12, var20, (byte) 98, var41.field376, var22, var15, var13, var21);
                            }
                            if (class109.field1458 && var11.field2038 == 1407) {
                                class189.method1390();
                            }
                            if (class109.field1458) {
                                class122.method885(arg1, arg9, arg2, arg6);
                            } else {
                                class280.method1978(arg1, arg9, arg2, arg6);
                                class31.method277();
                            }
                        }
                        if (class124.field1771[var12] || class193.field3081 > 1) {
                            if (var11.field2063 == 0 && !var11.field2164 && var11.field2007 > var11.field2078) {
                                class297.method2071(var13, -31332, var15 + var11.field2137, var11.field2007, var11.field2018, var11.field2078);
                            }
                            if (var11.field2063 != 1) {
                                if (var11.field2063 == 2) {
                                    int var110 = 0;
                                    for (int var111 = 0; var111 < var11.field2104; var111++) {
                                        for (int var112 = 0; var112 < var11.field2048; var112++) {
                                            int var113 = (var11.field2074 + 32) * var112 + var15;
                                            int var114 = (var11.field2071 + 32) * var111 + var13;
                                            if (var110 < 20) {
                                                var114 += var11.field1990[var110];
                                                var113 += var11.field2032[var110];
                                            }
                                            if (var11.field2146[var110] > 0) {
                                                boolean var116 = false;
                                                boolean var117 = false;
                                                int var118 = var11.field2146[var110] - 1;
                                                if (var113 + 32 > arg1 && arg2 > var113 && arg9 < (var114 + 32) && var114 < arg6 || class175.field2864 == var11 && class224.field3549 == var110) {
                                                    class169 var119;
                                                    if (class244.field3811 == 1 && class229.field3591 == var110 && class251.field3956 == var11.field2069) {
                                                        var119 = class339.method2355(var11.field1992[var110], 0, var11.field2057, (class55) null, 77, var118, 2);
                                                    } else {
                                                        var119 = class339.method2355(var11.field1992[var110], 3153952, var11.field2057, (class55) null, 53, var118, 1);
                                                    }
                                                    if (class31.field463) {
                                                        class231.field3607[var12] = true;
                                                    }
                                                    if (var119 == null) {
                                                        class167.method1250(var11, 412);
                                                    } else if (class175.field2864 == var11 && class224.field3549 == var110) {
                                                        int var120 = class25.field381 - class158.field2451;
                                                        if (var120 < 5 && var120 > -5) {
                                                            var120 = 0;
                                                        }
                                                        int var121 = class82.field1129 - class92.field1226;
                                                        if (var121 < 5 && var121 > -5) {
                                                            var121 = 0;
                                                        }
                                                        if (class98.field1289 < 5) {
                                                            var120 = 0;
                                                            var121 = 0;
                                                        }
                                                        var119.method1265(var113 + var120, var114 + var121, 128);
                                                        if (arg5 != -1) {
                                                            int var122;
                                                            int var123;
                                                            if (class109.field1458) {
                                                                var122 = class122.field1757;
                                                                var123 = class122.field1758;
                                                            } else {
                                                                var122 = class280.field4306;
                                                                var123 = class280.field4311;
                                                            }
                                                            class136 var124 = arg0[arg5 & 0xFFFF];
                                                            if ((var114 + var121) < var123 && var124.field2018 > 0) {
                                                                int var125 = (var123 - var114 - var121) * class153.field2373 / 3;
                                                                if ((class153.field2373 * 10) < var125) {
                                                                    var125 = class153.field2373 * 10;
                                                                }
                                                                if (var125 > var124.field2018) {
                                                                    var125 = var124.field2018;
                                                                }
                                                                class92.field1226 += var125;
                                                                var124.field2018 -= var125;
                                                                class167.method1250(var124, 412);
                                                            }
                                                            if (var122 < var114 + var121 + 32 && (var124.field2007 - var124.field2078) > var124.field2018) {
                                                                int var126 = (var114 + var121 + 32 - var122) * class153.field2373 / 3;
                                                                if (var126 > (class153.field2373 * 10)) {
                                                                    var126 = class153.field2373 * 10;
                                                                }
                                                                if (var126 > (var124.field2007 - var124.field2018 - var124.field2078)) {
                                                                    var126 = var124.field2007 - var124.field2018 - var124.field2078;
                                                                }
                                                                var124.field2018 += var126;
                                                                class92.field1226 -= var126;
                                                                class167.method1250(var124, 412);
                                                            }
                                                        }
                                                    } else if (class153.field2359 == var11 && class202.field3218 == var110) {
                                                        var119.method1265(var113, var114, 128);
                                                    } else {
                                                        var119.method1273(var113, var114);
                                                    }
                                                }
                                            } else if (var11.field1995 != null && var110 < 20) {
                                                class169 var115 = var11.method996(var110, 0);
                                                if (var115 != null) {
                                                    var115.method1273(var113, var114);
                                                } else if (class14.field223) {
                                                    class167.method1250(var11, 412);
                                                }
                                            }
                                            var110++;
                                        }
                                    }
                                } else if (var11.field2063 == 3) {
                                    int var42;
                                    if (class301.method2083(104, var11)) {
                                        var42 = var11.field2151;
                                        if (class174.field2856 == var11 && var11.field2154 != 0) {
                                            var42 = var11.field2154;
                                        }
                                    } else {
                                        var42 = var11.field2094;
                                        if (class174.field2856 == var11 && var11.field2125 != 0) {
                                            var42 = var11.field2125;
                                        }
                                    }
                                    if (var14 == 0) {
                                        if (var11.field1996) {
                                            if (class109.field1458) {
                                                class122.method897(var15, var13, var11.field2137, var11.field2078, var42);
                                            } else {
                                                class280.method1971(var15, var13, var11.field2137, var11.field2078, var42);
                                            }
                                        } else if (class109.field1458) {
                                            class122.method888(var15, var13, var11.field2137, var11.field2078, var42);
                                        } else {
                                            class280.method1979(var15, var13, var11.field2137, var11.field2078, var42);
                                        }
                                    } else if (var11.field1996) {
                                        if (class109.field1458) {
                                            class122.method893(var15, var13, var11.field2137, var11.field2078, var42, 256 - (var14 & 0xFF));
                                        } else {
                                            class280.method1970(var15, var13, var11.field2137, var11.field2078, var42, 256 - (var14 & 0xFF));
                                        }
                                    } else if (class109.field1458) {
                                        class122.method896(var15, var13, var11.field2137, var11.field2078, var42, 256 - (var14 & 0xFF));
                                    } else {
                                        class280.method1972(var15, var13, var11.field2137, var11.field2078, var42, 256 - (var14 & 0xFF));
                                    }
                                } else if (var11.field2063 == 4) {
                                    class321 var106 = var11.method991(false, class333.field5190);
                                    if (var106 != null) {
                                        String var107 = var11.field2158;
                                        int var108;
                                        if (class301.method2083(104, var11)) {
                                            var108 = var11.field2151;
                                            if (class174.field2856 == var11 && var11.field2154 != 0) {
                                                var108 = var11.field2154;
                                            }
                                            if (var11.field2077.length() > 0) {
                                                var107 = var11.field2077;
                                            }
                                        } else {
                                            var108 = var11.field2094;
                                            if (class174.field2856 == var11 && var11.field2125 != 0) {
                                                var108 = var11.field2125;
                                            }
                                        }
                                        if (var11.field2164 && var11.field1997 != -1) {
                                            class316 var109 = class149.method1092((byte) -104, var11.field1997);
                                            var107 = var109.field4988;
                                            if (var107 == null) {
                                                var107 = "null";
                                            }
                                            if ((var109.field4981 == 1 || var11.field2087 != 1) && var11.field2087 != -1) {
                                                var107 = "<col=ff9040>" + var107 + "</col> x" + class229.method1661(0, var11.field2087);
                                            }
                                        }
                                        if (class237.field3723 == var11) {
                                            var107 = class336.field5238;
                                            var108 = var11.field2094;
                                        }
                                        if (!var11.field2164) {
                                            var107 = class318.method2235(var11, (byte) -128, var107);
                                        }
                                        var106.method2265(var107, var15, var13, var11.field2137, var11.field2078, var108, var11.field2015 ? 0 : -1, var11.field2021, var11.field2000, var11.field2135);
                                    } else if (class14.field223) {
                                        class167.method1250(var11, 412);
                                    }
                                } else if (var11.field2063 == 5) {
                                    if (!var11.field2164) {
                                        class169 var105 = var11.method998(class301.method2083(104, var11), true);
                                        if (var105 != null) {
                                            var105.method1273(var15, var13);
                                        } else if (class14.field223) {
                                            class167.method1250(var11, 412);
                                        }
                                    } else if (var11.field2017 >= 0) {
                                        class299 var104 = var11.method1002(-121);
                                        if (class109.field1458) {
                                            var104.method2081(0, var15, var13, var11.field2137, var11.field2078, var11.field2102, var11.field2161, 0);
                                        } else {
                                            var104.method2079(0, var15, var13, var11.field2137, var11.field2078, var11.field2102, var11.field2161, 0);
                                        }
                                    } else {
                                        class169 var89;
                                        if (var11.field1997 == -1) {
                                            var89 = var11.method998(false, true);
                                        } else if (var11.field2060 && class146.field2310.field5264 != null) {
                                            var89 = class339.method2355(var11.field2087, var11.field2127, var11.field2057, class146.field2310.field5264, 82, var11.field1997, var11.field2056);
                                        } else {
                                            var89 = class339.method2355(var11.field2087, var11.field2127, var11.field2057, (class55) null, 90, var11.field1997, var11.field2056);
                                        }
                                        if (var89 != null) {
                                            int var90 = var89.field2790;
                                            int var91 = var89.field2793;
                                            if (var11.field2001) {
                                                int var93 = (var91 + var11.field2137 - 1) / var91;
                                                int var94 = (var90 + var11.field2078 - 1) / var90;
                                                if (class109.field1458) {
                                                    class122.method884(var15, var13, var15 + var11.field2137, var11.field2078 + var13);
                                                    class239 var97 = (class239) var89;
                                                    boolean var98 = class251.method1802(var89.field2788, (byte) -127);
                                                    boolean var99 = class251.method1802(var89.field2791, (byte) -118);
                                                    if (var98 && var99) {
                                                        if (var14 == 0) {
                                                            var97.method1710(var15, var13, var93, var94);
                                                        } else {
                                                            var97.method1708(var15, var13, 256 - (var14 & 0xFF), var93, var94);
                                                        }
                                                    } else if (var98) {
                                                        for (int var103 = 0; var103 < var94; var103++) {
                                                            if (var14 == 0) {
                                                                var97.method1710(var15, var90 * var103 + var13, var93, 1);
                                                            } else {
                                                                var97.method1708(var15, var90 * var103 + var13, -(var14 & 0xFF) + 256, var93, 1);
                                                            }
                                                        }
                                                    } else if (var99) {
                                                        for (int var102 = 0; var102 < var93; var102++) {
                                                            if (var14 == 0) {
                                                                var97.method1710(var91 * var102 + var15, var13, 1, var94);
                                                            } else {
                                                                var97.method1708(var91 * var102 + var15, var13, 256 - (var14 & 0xFF), 1, var94);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var100 = 0; var100 < var93; var100++) {
                                                            for (int var101 = 0; var101 < var94; var101++) {
                                                                if (var14 == 0) {
                                                                    var89.method1273(var91 * var100 + var15, var13 - -(var90 * var101));
                                                                } else {
                                                                    var89.method1265(var91 * var100 + var15, var90 * var101 + var13, 256 - (var14 & 0xFF));
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class122.method885(arg1, arg9, arg2, arg6);
                                                } else {
                                                    class280.method1967(var15, var13, var11.field2137 + var15, var11.field2078 + var13);
                                                    for (int var95 = 0; var95 < var93; var95++) {
                                                        for (int var96 = 0; var96 < var94; var96++) {
                                                            if (var11.field2013 != 0) {
                                                                var89.method1264(var11.field2013, (byte) 35, var15 - (-(var91 / 2) - (var91 * var95)), var90 / 2 + var90 * var96 + var13, 4096);
                                                            } else if (var14 == 0) {
                                                                var89.method1273(var91 * var95 + var15, var90 * var96 + var13);
                                                            } else {
                                                                var89.method1265(var91 * var95 + var15, var90 * var96 + var13, 256 - (var14 & 0xFF));
                                                            }
                                                        }
                                                    }
                                                    class280.method1978(arg1, arg9, arg2, arg6);
                                                }
                                            } else {
                                                int var92 = var11.field2137 * 4096 / var91;
                                                if (var11.field2013 != 0) {
                                                    var89.method1264(var11.field2013, (byte) 47, var11.field2137 / 2 + var15, var11.field2078 / 2 + var13, var92);
                                                } else if (var14 != 0) {
                                                    var89.method1274(var15, var13, var11.field2137, var11.field2078, 256 - (var14 & 0xFF));
                                                } else if (var11.field2137 == var91 && var11.field2078 == var90) {
                                                    var89.method1273(var15, var13);
                                                } else {
                                                    var89.method1262(var15, var13, var11.field2137, var11.field2078);
                                                }
                                            }
                                        } else if (class14.field223) {
                                            class167.method1250(var11, 412);
                                        }
                                    }
                                } else if (var11.field2063 == 6) {
                                    boolean var70 = class301.method2083(104, var11);
                                    int var71;
                                    if (var70) {
                                        var71 = var11.field2052;
                                    } else {
                                        var71 = var11.field2128;
                                    }
                                    class89 var72 = null;
                                    int var73 = 0;
                                    if (var11.field1997 != -1) {
                                        class316 var74 = class149.method1092((byte) -104, var11.field1997);
                                        if (var74 != null) {
                                            class316 var75 = var74.method2203(var11.field2087, 768);
                                            class281 var76 = var71 == -1 ? null : class295.method2064(0, var71);
                                            if (var11.field2060 && class146.field2310.field5264 != null) {
                                                var72 = var75.method2213(var11.field2088, var11.field2130, class146.field2310.field5264, var76, 249, var11.field2147, 1);
                                            } else {
                                                var72 = var75.method2213(var11.field2088, var11.field2130, (class55) null, var76, 249, var11.field2147, 1);
                                            }
                                            if (var72 == null) {
                                                class167.method1250(var11, 412);
                                            } else {
                                                var73 = -var72.method397() / 2;
                                            }
                                        }
                                    } else if (var11.field2166 == 5) {
                                        if (var11.field2117 == -1) {
                                            var72 = class130.field1915.method440(-1, -1, -1, (class281) null, 0, true, (class281) null, -1, (class11[]) null, 0, (byte) 39);
                                        } else {
                                            int var78 = var11.field2117 & 0x7FF;
                                            if (class92.field1231 == var78) {
                                                var78 = 2047;
                                            }
                                            class337 var79 = class284.field4403[var78];
                                            class281 var80 = var71 == -1 ? null : class295.method2064(0, var71);
                                            if (var79 != null && (int) class83.method608(var79.field5277, (byte) 57) << 11 == (var11.field2117 & 0xFFFFF800)) {
                                                var72 = var79.field5264.method440(0, -1, -1, var80, 0, true, (class281) null, var11.field2147, (class11[]) null, 0, (byte) -75);
                                            }
                                        }
                                    } else if (var71 == -1) {
                                        var72 = var11.method1004(var70, (byte) -107, -1, (class281) null, class146.field2310.field5264, 0, -1);
                                        if (var72 == null && class14.field223) {
                                            class167.method1250(var11, 412);
                                        }
                                    } else {
                                        class281 var77 = class295.method2064(0, var71);
                                        var72 = var11.method1004(var70, (byte) -107, var11.field2147, var77, class146.field2310.field5264, var11.field2088, var11.field2130);
                                        if (var72 == null && class14.field223) {
                                            class167.method1250(var11, 412);
                                        }
                                    }
                                    if (var72 != null) {
                                        int var81;
                                        if (var11.field2041 <= 0) {
                                            var81 = 256;
                                        } else {
                                            var81 = (var11.field2137 << 8) / var11.field2041;
                                        }
                                        int var82;
                                        if (var11.field2020 > 0) {
                                            var82 = (var11.field2078 << 8) / var11.field2020;
                                        } else {
                                            var82 = 256;
                                        }
                                        int var83 = var11.field2137 / 2 + var15 + (var11.field2061 * var81 >> 8);
                                        int var84 = (var11.field2064 * var82 >> 8) + (var13 + (var11.field2078 / 2));
                                        if (class109.field1458) {
                                            if (var11.field2105) {
                                                class109.method779(var83, var84, var11.field2168, var11.field2046, var81, var82);
                                            } else {
                                                class109.method763(var83, var84, var81, var82);
                                                class109.method760((float) var11.field2066, (float) var11.field2046 * 1.5F);
                                            }
                                            class109.method751();
                                            class109.method753(true);
                                            class109.method740(false);
                                            class101.method699(21642, class326.field5123);
                                            if (class230.field3601) {
                                                class122.method898();
                                                class109.method755();
                                                class122.method885(arg1, arg9, arg2, arg6);
                                                class230.field3601 = false;
                                            }
                                            if (var11.field2002) {
                                                class109.method768();
                                            }
                                            int var85 = class31.field451[var11.field2145] * var11.field2168 >> 16;
                                            int var86 = class31.field467[var11.field2145] * var11.field2168 >> 16;
                                            if (var11.field2164) {
                                                var72.method402(0, var11.field2096, var11.field2119, var11.field2145, var11.field2075, var11.field2044 + var73 + var86, var85 - -var11.field2044, -1L);
                                            } else {
                                                var72.method402(0, var11.field2096, 0, var11.field2145, 0, var86, var85, -1L);
                                            }
                                            if (var11.field2002) {
                                                class109.method776();
                                            }
                                        } else {
                                            class31.method291(var83, var84);
                                            int var87 = class31.field467[var11.field2145] * var11.field2168 >> 16;
                                            int var88 = class31.field451[var11.field2145] * var11.field2168 >> 16;
                                            if (!var11.field2164) {
                                                var72.method402(0, var11.field2096, 0, var11.field2145, 0, var87, var88, -1L);
                                            } else if (var11.field2105) {
                                                ((class53) var72).method414(0, var11.field2096, var11.field2119, var11.field2145, var11.field2075, var11.field2044 + var73 + var87, var88 - -var11.field2044, var11.field2168);
                                            } else {
                                                var72.method402(0, var11.field2096, var11.field2119, var11.field2145, var11.field2075, var87 + var73 + var11.field2044, var11.field2044 + var88, -1L);
                                            }
                                            class31.method292();
                                        }
                                    }
                                } else {
                                    if (var11.field2063 == 7) {
                                        class321 var43 = var11.method991(false, class333.field5190);
                                        if (var43 == null) {
                                            if (class14.field223) {
                                                class167.method1250(var11, 412);
                                            }
                                            continue;
                                        }
                                        int var44 = 0;
                                        for (int var45 = 0; var45 < var11.field2104; var45++) {
                                            for (int var46 = 0; var46 < var11.field2048; var46++) {
                                                if (var11.field2146[var44] > 0) {
                                                    class316 var47 = class149.method1092((byte) -104, var11.field2146[var44] - 1);
                                                    String var48;
                                                    if (var47.field4981 != 1 && var11.field1992[var44] == 1) {
                                                        var48 = "<col=ff9040>" + var47.field4988 + "</col>";
                                                    } else {
                                                        var48 = "<col=ff9040>" + var47.field4988 + "</col> x" + class229.method1661(0, var11.field1992[var44]);
                                                    }
                                                    int var49 = (var11.field2074 + 115) * var46 + var15;
                                                    int var50 = (var11.field2071 + 12) * var45 + var13;
                                                    if (var11.field2021 == 0) {
                                                        var43.method2252(var48, var49, var50, var11.field2094, var11.field2015 ? 0 : -1);
                                                    } else if (var11.field2021 == 1) {
                                                        var43.method2258(var48, var49 + 57, var50, var11.field2094, var11.field2015 ? 0 : -1);
                                                    } else {
                                                        var43.method2263(var48, var49 + 115 - 1, var50, var11.field2094, var11.field2015 ? 0 : -1);
                                                    }
                                                }
                                                var44++;
                                            }
                                        }
                                    }
                                    if (var11.field2063 == 8 && class62.field917 == var11 && class237.field3717 == class110.field1523) {
                                        int var51 = 0;
                                        int var52 = 0;
                                        class321 var53 = class102.field1355;
                                        String var54 = var11.field2158;
                                        String var55 = class318.method2235(var11, (byte) -128, var54);
                                        while (var55.length() > 0) {
                                            int var56 = var55.indexOf("<br>");
                                            String var57;
                                            if (var56 == -1) {
                                                var57 = var55;
                                                var55 = "";
                                            } else {
                                                var57 = var55.substring(0, var56);
                                                var55 = var55.substring(var56 + 4);
                                            }
                                            int var58 = var53.method2254(var57);
                                            if (var58 > var51) {
                                                var51 = var58;
                                            }
                                            var52 += var53.field5060 + 1;
                                        }
                                        var52 += 7;
                                        int var59 = var11.field2078 + var13 + 5;
                                        if (var59 + var52 > arg6) {
                                            var59 = arg6 - var52;
                                        }
                                        var51 += 6;
                                        int var60 = var15 + var11.field2137 - var51 - 5;
                                        if (var15 + 5 > var60) {
                                            var60 = var15 + 5;
                                        }
                                        if (var51 + var60 > arg2) {
                                            var60 = arg2 - var51;
                                        }
                                        if (class109.field1458) {
                                            class122.method897(var60, var59, var51, var52, 16777120);
                                            class122.method888(var60, var59, var51, var52, 0);
                                        } else {
                                            class280.method1971(var60, var59, var51, var52, 16777120);
                                            class280.method1979(var60, var59, var51, var52, 0);
                                        }
                                        String var61 = var11.field2158;
                                        int var62 = var53.field5060 + var59 + 2;
                                        String var63 = class318.method2235(var11, (byte) 92, var61);
                                        while (var63.length() > 0) {
                                            int var64 = var63.indexOf("<br>");
                                            String var65;
                                            if (var64 == -1) {
                                                var65 = var63;
                                                var63 = "";
                                            } else {
                                                var65 = var63.substring(0, var64);
                                                var63 = var63.substring(var64 + 4);
                                            }
                                            var53.method2252(var65, var60 + 3, var62, 0, -1);
                                            var62 += var53.field5060 + 1;
                                        }
                                    }
                                    if (var11.field2063 == 9) {
                                        int var66;
                                        int var67;
                                        int var68;
                                        int var69;
                                        if (var11.field2081) {
                                            var69 = var15;
                                            var66 = var11.field2137 + var15;
                                            var67 = var11.field2078 + var13;
                                            var68 = var13;
                                        } else {
                                            var66 = var11.field2137 + var15;
                                            var67 = var13;
                                            var68 = var11.field2078 + var13;
                                            var69 = var15;
                                        }
                                        if (var11.field2079 == 1) {
                                            if (class109.field1458) {
                                                class122.method891(var69, var67, var66, var68, var11.field2094);
                                            } else {
                                                class280.method1976(var69, var67, var66, var68, var11.field2094);
                                            }
                                        } else if (class109.field1458) {
                                            class122.method895(var69, var67, var66, var68, var11.field2094, var11.field2079);
                                        } else {
                                            class280.method1985(var69, var67, var66, var68, var11.field2094, var11.field2079);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg4 < 52) {
            method2160(-44);
        }
    }

    @OriginalMember(owner = "client!qf", name = "i", descriptor = "(I)Lmh;", line = 1852)
    public final class287 method2174(int arg0) {
        this.field4870 = 0;
        field4862++;
        return arg0 == 256 ? this.method2164((byte) 121) : (class287) null;
    }
}
