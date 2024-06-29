import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lha")
public class class709 extends class518 {

    @OriginalMember(owner = "client!lha", name = "J", descriptor = "I")
    private int field9893 = 4096;

    @OriginalMember(owner = "client!lha", name = "F", descriptor = "I")
    private int field9899 = 16;

    @OriginalMember(owner = "client!lha", name = "C", descriptor = "I")
    private int field9898 = 2000;

    @OriginalMember(owner = "client!lha", name = "I", descriptor = "I")
    private int field9900 = 0;

    @OriginalMember(owner = "client!lha", name = "N", descriptor = "I")
    private int field9902 = 0;

    @OriginalMember(owner = "client!lha", name = "O", descriptor = "[Ljava/lang/String;")
    private static final String[] field9904 = new String[] { method5076(method5075("Ef=,3\u0001")), method5076(method5075("Ef=,:\u0001")), method5076(method5075("G{0n")), method5076(method5075("R r,\u0004")), method5076(method5075("Ef=,=\u0001")), method5076(method5075("Ef=,;\u0001")), method5076(method5075("Ef=,>\u0001")) };

    @OriginalMember(owner = "client!lha", name = "L", descriptor = "Lmv;")
    public static class125 field9892 = new class125(61, 3);

    @OriginalMember(owner = "client!lha", name = "D", descriptor = "Lcb;")
    public static class700 field9896 = new class700();

    @OriginalMember(owner = "client!lha", name = "H", descriptor = "I")
    public static int field9891;

    @OriginalMember(owner = "client!lha", name = "M", descriptor = "I")
    public static int field9894;

    @OriginalMember(owner = "client!lha", name = "B", descriptor = "I")
    public static int field9895;

    @OriginalMember(owner = "client!lha", name = "E", descriptor = "I")
    public static int field9897;

    @OriginalMember(owner = "client!lha", name = "G", descriptor = "Lft;")
    public static class188 field9903;

    @OriginalMember(owner = "client!lha", name = "K", descriptor = "[[[B")
    public static byte[][][] field9901;

    @OriginalMember(owner = "client!lha", name = "f", descriptor = "(I)V")
    public static void method5073(int arg0) {
        try {
            field9901 = null;
            int var1 = 22 / ((arg0 - -68) / 54);
            field9903 = null;
            field9896 = null;
            field9892 = null;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field9904[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lha", name = "b", descriptor = "(II)[I")
    public final int[] method14(int arg0, int arg1) {
        try {
            ++field9891;
            int[] var3 = super.field7564.method4462(26041, arg0);
            if (super.field7564.field8652) {
                int var4 = this.field9893 >> 1;
                int[][] var5 = super.field7564.method4459((byte) 71);
                Random var6 = new Random((long) this.field9900);
                for (int var7 = 0; ~var7 > ~this.field9898; ++var7) {
                    int var8 = this.field9893 <= 0 ? this.field9902 : this.field9902 - (-class70.method723(var6, this.field9893, (byte) 58) - -var4);
                    int var9 = var8 >> 4 & 255;
                    int var10 = class70.method723(var6, class110.field1436, (byte) 58);
                    int var11 = class70.method723(var6, class606.field8689, (byte) 58);
                    int var12 = (class412.field5931[var9] * this.field9899 >> 12) + var10;
                    int var13 = var11 - -(class129.field1608[var9] * this.field9899 >> 12);
                    int var14 = -var11 + var13;
                    int var15 = -var10 + var12;
                    if (var15 != 0 || ~var14 != -1) {
                        if (var15 < 0) {
                            var15 = -var15;
                        }
                        if (var14 < 0) {
                            var14 = -var14;
                        }
                        boolean var16 = ~var14 < ~var15;
                        if (var16) {
                            int var17 = var10;
                            var10 = var11;
                            int var18 = var12;
                            var11 = var17;
                            var12 = var13;
                            var13 = var18;
                        }
                        if (var12 < var10) {
                            int var19 = var10;
                            int var20 = var11;
                            var10 = var12;
                            var11 = var13;
                            var12 = var19;
                            var13 = var20;
                        }
                        int var21 = var11;
                        int var22 = -var10 + var12;
                        int var23 = -var11 + var13;
                        int var24 = -var22 / 2;
                        int var25 = 2048 / var22;
                        int var26 = 1024 + -(class70.method723(var6, 4096, (byte) 58) >> 2);
                        if (~var23 > -1) {
                            var23 = -var23;
                        }
                        int var27 = ~var11 > ~var13 ? 1 : -1;
                        for (int var28 = var10; ~var28 > ~var12; ++var28) {
                            int var29 = var26 + 1024 - -((var28 - var10) * var25);
                            int var30 = var28 & class247.field3543;
                            int var31 = class478.field7048 & var21;
                            var24 += var23;
                            if (var16) {
                                var5[var31][var30] = var29;
                            } else {
                                var5[var30][var31] = var29;
                            }
                            if (~var24 < -1) {
                                var21 += var27;
                                var24 += -var22;
                            }
                        }
                    }
                }
            }
            int var32 = -15 % ((arg1 - -57) / 55);
            return var3;
        } catch (RuntimeException var34) {
            throw class665.method4799(var34, field9904[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!lha", name = "b", descriptor = "(I)V")
    public final void method12(int arg0) {
        try {
            ++field9897;
            if (arg0 <= 38) {
                method5074((class339) null, -16, -108, -60, (class476) null);
            }
            class119.method1079(1);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field9904[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lha", name = "<init>", descriptor = "()V")
    public class709() {
        super(0, true);
    }

    @OriginalMember(owner = "client!lha", name = "a", descriptor = "(ILjc;I)V")
    public final void method17(int arg0, class711 arg1, int arg2) {
        try {
            ++field9894;
            if (arg2 == -3) {
                if (~arg0 != -1) {
                    if (arg0 != 1) {
                        if (arg0 != 2) {
                            if (~arg0 != -4) {
                                if (~arg0 == -5) {
                                    this.field9893 = arg1.method5116((byte) -107);
                                }
                            } else {
                                this.field9902 = arg1.method5116((byte) -128);
                            }
                        } else {
                            this.field9899 = arg1.method5128(arg2 ^ -3);
                        }
                    } else {
                        this.field9898 = arg1.method5116((byte) -118);
                    }
                } else {
                    this.field9900 = arg1.method5128(0);
                }
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field9904[1] + arg0 + ',' + (arg1 != null ? field9904[3] : field9904[2]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!lha", name = "a", descriptor = "(Lem;IIILeea;)V")
    public static final void method5074(class339 arg0, int arg1, int arg2, int arg3, class476 arg4) {
        try {
            ++field9895;
            byte var5 = -1;
            if (~(arg1 & 1) != -1) {
                int var6 = arg4.method5140((byte) -2);
                int var7 = arg4.method5120((byte) 51);
                if (~var6 == -65536) {
                    var6 = -1;
                }
                int var8 = arg4.method5119(123);
                int var9 = 7 & var8;
                int var10 = (125 & var8) >> 3;
                if (var10 == 15) {
                    var10 = -1;
                }
                arg0.method1433(0, false, var10, var7, (byte) -86, var6, var9);
            }
            if ((arg1 & 262144) != 0) {
                int var11 = arg4.method5128(0);
                int[] var12 = new int[var11];
                int[] var13 = new int[var11];
                for (int var14 = 0; ~var14 > ~var11; ++var14) {
                    int var15 = arg4.method5140((byte) -2);
                    if ((var15 & 49152) != 49152) {
                        var12[var14] = var15;
                    } else {
                        int var16 = arg4.method5146(-31933);
                        var12[var14] = class10.method71(var16, var15 << 16);
                    }
                    var13[var14] = arg4.method5116((byte) -116);
                }
                arg0.method1435(var12, (byte) 120, var13);
            }
            if ((arg1 & 2048) != 0) {
                int var17 = arg4.method5103((byte) 96);
                arg0.field2202 = arg4.method5119(arg2 + 120);
                arg0.field2185 = arg4.method5132((byte) 16);
                arg0.field2225 = var17 & 32767;
                arg0.field2220 = (var17 & 32768) != 0;
                arg0.field2177 = class694.field9700 - (-arg0.field2225 - arg0.field2202);
            }
            if ((16 & arg1) != 0) {
                int var18 = arg4.method5132((byte) 16);
                if (~var18 < -1) {
                    for (int var19 = 0; ~var18 < ~var19; ++var19) {
                        int var20 = -1;
                        int var21 = -1;
                        int var22 = arg4.method5090(arg2 + -90);
                        int var23 = -1;
                        if (~var22 != -32768) {
                            if (var22 != 32766) {
                                var21 = arg4.method5090(-65);
                            } else {
                                var22 = -1;
                            }
                        } else {
                            var22 = arg4.method5090(-120);
                            var21 = arg4.method5090(-50);
                            var20 = arg4.method5090(-94);
                            var23 = arg4.method5090(arg2 + -116);
                        }
                        int var24 = arg4.method5090(-94);
                        int var25 = arg4.method5128(~arg2);
                        arg0.method1444(var22, class694.field9700, var25, var20, -19284, var21, var23, var24);
                    }
                }
            }
            if ((arg1 & 4) != 0) {
                int var26 = arg4.method5128(0);
                byte[] var27 = new byte[var26];
                class711 var28 = new class711(var27);
                arg4.method5110(var27, 0, arg2 + 112, var26);
                class320.field4366[arg3] = var28;
                arg0.method2722(var28, 5100);
            }
            if ((arg1 & 65536) != 0) {
                arg0.field4910 = arg4.method5132((byte) 16) == 1;
            }
            if (~(512 & arg1) != -1) {
                int var29 = arg4.method5140((byte) -2);
                int var30 = arg4.method5113(18443);
                if (var29 == 65535) {
                    var29 = -1;
                }
                int var31 = arg4.method5128(0);
                int var32 = var31 & 7;
                int var33 = var31 >> 3 & 15;
                if (var33 == 15) {
                    var33 = -1;
                }
                arg0.method1433(1, false, var33, var30, (byte) -83, var29, var32);
            }
            if ((arg1 & 256) != 0) {
                var5 = arg4.method5088(-16996);
            }
            if ((arg1 & 32768) != 0) {
                arg0.field2170 = arg4.method5144(-16414);
                if (arg0.field2170.charAt(0) != '~') {
                    if (class203.field2988 == arg0) {
                        class459.method3533(arg0.method2717(true, -1), (byte) 55, arg0.field4941, arg0.method2719(0, false), 0, arg0.field2170, 2);
                    }
                } else {
                    arg0.field2170 = arg0.field2170.substring(1);
                    class459.method3533(arg0.method2717(true, -1), (byte) 55, arg0.field4941, arg0.method2719(0, false), 0, arg0.field2170, 2);
                }
                arg0.field2205 = 0;
                arg0.field2175 = 0;
                arg0.field2222 = 150;
            }
            if (~(131072 & arg1) != arg2) {
                int var34 = arg4.method5146(arg2 + -31932);
                int var35 = arg4.method5149(18547);
                if (var34 == 65535) {
                    var34 = -1;
                }
                int var36 = arg4.method5119(87);
                int var37 = 7 & var36;
                int var38 = (var36 & 121) >> 3;
                if (~var38 == -16) {
                    var38 = -1;
                }
                arg0.method1433(2, false, var38, var35, (byte) -83, var34, var37);
            }
            if ((4096 & arg1) != 0) {
                arg0.field2233 = arg4.method5112(arg2 + 129);
                arg0.field2244 = arg4.method5112(128);
                arg0.field2240 = arg4.method5088(arg2 ^ 16995);
                arg0.field2247 = arg4.method5125((byte) -110);
                arg0.field2237 = arg4.method5116((byte) -109) - -class694.field9700;
                arg0.field2246 = arg4.method5116((byte) -106) + class694.field9700;
                arg0.field2238 = arg4.method5119(88);
                if (arg0.field4916) {
                    arg0.field2247 += arg0.field4902;
                    arg0.field2257 = 0;
                    arg0.field2233 += arg0.field4900;
                    arg0.field2240 += arg0.field4900;
                    arg0.field2244 += arg0.field4902;
                } else {
                    arg0.field2240 += arg0.field2252[0];
                    arg0.field2244 += arg0.field2256[0];
                    arg0.field2247 += arg0.field2256[0];
                    arg0.field2233 += arg0.field2252[0];
                    arg0.field2257 = 1;
                }
                arg0.field2258 = 0;
            }
            if (~(arg1 & 32) != -1) {
                int[] var39 = new int[4];
                for (int var40 = 0; var40 < 4; ++var40) {
                    var39[var40] = arg4.method5116((byte) -122);
                    if (var39[var40] == 65535) {
                        var39[var40] = -1;
                    }
                }
                int var41 = arg4.method5119(98);
                class688.method4920(var39, arg0, var41, false, 1);
            }
            if (~(128 & arg1) != -1) {
                arg0.field4921 = arg4.method5103((byte) 125);
                if (arg0.field2257 == 0) {
                    arg0.method1432(16383, arg0.field4921);
                    arg0.field4921 = -1;
                }
            }
            if (~(16384 & arg1) != -1) {
                int var42 = arg4.method5134(-18632);
                int[] var43 = new int[var42];
                int[] var44 = new int[var42];
                int[] var45 = new int[var42];
                for (int var46 = 0; ~var46 > ~var42; ++var46) {
                    int var47 = arg4.method5140((byte) -2);
                    if (var47 == 65535) {
                        var47 = -1;
                    }
                    var43[var46] = var47;
                    var44[var46] = arg4.method5119(93);
                    var45[var46] = arg4.method5116((byte) -105);
                }
                class669.method4814(arg2 + 11302, var43, arg0, var44, var45);
            }
            if ((2 & arg1) != 0) {
                class176.field2308[arg3] = arg4.method5131((byte) 111);
            }
            if (~(arg1 & 64) != -1) {
                int var48 = arg4.method5103((byte) 78);
                if (var48 == 65535) {
                    var48 = -1;
                }
                arg0.field2219 = var48;
            }
            if ((arg1 & 524288) != 0) {
                arg0.field2229 = arg4.method5088(-16996);
                arg0.field2242 = arg4.method5131((byte) 66);
                arg0.field2241 = arg4.method5112(128);
                arg0.field2236 = (byte) arg4.method5134(-18632);
                arg0.field2249 = class694.field9700 + arg4.method5146(-31933);
                arg0.field2245 = class694.field9700 + arg4.method5146(-31933);
            }
            if ((arg1 & 8192) != 0) {
                arg0.field4909 = arg4.method5128(0) == 1;
            }
            if (arg0.field4916) {
                if (~var5 != -128) {
                    byte var49;
                    if (var5 != -1) {
                        var49 = var5;
                    } else {
                        var49 = class176.field2308[arg3];
                    }
                    class558.method4176(arg0, var49, (byte) 1);
                    arg0.method2721(arg0.field4902, 80, arg0.field4900, var49);
                } else {
                    arg0.method2723(arg0.field4900, arg0.field4902, 3556);
                }
            }
        } catch (RuntimeException var51) {
            throw class665.method4799(var51, field9904[5] + (arg0 != null ? field9904[3] : field9904[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field9904[3] : field9904[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!lha", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5075(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 121);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!lha", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5076(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 41;
                    break;
                case 1:
                    var10005 = 14;
                    break;
                case 2:
                    var10005 = 92;
                    break;
                case 3:
                    var10005 = 2;
                    break;
                default:
                    var10005 = 121;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
