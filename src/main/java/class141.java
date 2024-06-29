import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class141 {

    @OriginalMember(owner = "client!pf", name = "g", descriptor = "[[I")
    private int[][] field3030;

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "I")
    private int field3027;

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "I")
    private int field3028;

    @OriginalMember(owner = "client!pf", name = "h", descriptor = "Lle;")
    public static class104 field3031 = new class104(5000);

    @OriginalMember(owner = "client!pf", name = "j", descriptor = "[I")
    public static int[] field3033 = new int[4000];

    @OriginalMember(owner = "client!pf", name = "k", descriptor = "Lgg;")
    public static class63 field3034 = class116.method911(43, "Texturen geladen)3");

    @OriginalMember(owner = "client!pf", name = "m", descriptor = "Lgg;")
    private static class63 field3036 = class116.method911(43, "Drop");

    @OriginalMember(owner = "client!pf", name = "i", descriptor = "Lgg;")
    public static class63 field3032 = field3036;

    @OriginalMember(owner = "client!pf", name = "l", descriptor = "Lgg;")
    public static class63 field3035 = class116.method911(43, "gelb:");

    @OriginalMember(owner = "client!pf", name = "n", descriptor = "J")
    public static long field3037 = 0L;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "I")
    public static int field3024;

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "I")
    public static int field3025;

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "I")
    public static int field3026;

    @OriginalMember(owner = "client!pf", name = "f", descriptor = "I")
    public static int field3029;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IB)I")
    public final int method1013(int arg0, byte arg1) {
        if (arg1 != 28) {
            return 47;
        }
        if (this.field3030 != null) {
            arg0 = (int) ((long) this.field3028 * (long) arg0 / (long) this.field3027);
        }
        field3025++;
        return arg0;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)V")
    public static void method1014(int arg0) {
        field3031 = null;
        field3033 = null;
        field3034 = null;
        int var1 = -67 % ((20 - arg0) / 35);
        field3036 = null;
        field3035 = null;
        field3032 = null;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(B)V")
    public static final void method1015(byte arg0) {
        field3024++;
        if (class88.field2073 > 1) {
            class88.field2073--;
        }
        if (class78.field1888 > 0) {
            class78.field1888--;
        }
        if (class63.field1587) {
            class63.field1587 = false;
            class13.method154((byte) -89);
            return;
        }
        for (int var1 = 0; var1 < 100 && class83.method735(2047); var1++) {
        }
        if (class136.field2932 != 30) {
            return;
        }
        class4.method82(field3031, 219, (byte) -1);
        Object var2 = class114.field2548.field3790;
        synchronized (class114.field2548.field3790) {
            if (!class39.field927) {
                class114.field2548.field3792 = 0;
            } else if (class158.field3280 != 0 || class114.field2548.field3792 >= 40) {
                class59.field1513++;
                field3031.method854(215, true);
                field3031.method66(2, 0);
                int var3 = 0;
                int var4 = field3031.field54;
                for (int var5 = 0; var5 < class114.field2548.field3792 && field3031.field54 - var4 < 240; var5++) {
                    var3++;
                    int var6 = class114.field2548.field3798[var5];
                    int var7 = class114.field2548.field3793[var5];
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
                    if (class114.field2548.field3793[var5] == -1 && class114.field2548.field3798[var5] == -1) {
                        var7 = -1;
                        var8 = 524287;
                        var6 = -1;
                    }
                    if (class121.field2681 != var6 || class199.field3980 != var7) {
                        int var9 = var6 - class121.field2681;
                        class121.field2681 = var6;
                        int var10 = var7 - class199.field3980;
                        class199.field3980 = var7;
                        if (class129.field2821 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                            var10 += 32;
                            var9 += 32;
                            field3031.method62((class129.field2821 << 12) + (var9 << 6) + var10, (byte) -116);
                            class129.field2821 = 0;
                        } else if (class129.field2821 < 8) {
                            field3031.method57(3, (class129.field2821 << 19) + var8 + 8388608);
                            class129.field2821 = 0;
                        } else {
                            field3031.method76((class129.field2821 << 19) + var8 - 1073741824, (byte) 114);
                            class129.field2821 = 0;
                        }
                    } else if (class129.field2821 < 2047) {
                        class129.field2821++;
                    }
                }
                field3031.method48((byte) 50, field3031.field54 - var4);
                if (class114.field2548.field3792 > var3) {
                    class114.field2548.field3792 -= var3;
                    for (int var11 = 0; var11 < class114.field2548.field3792; var11++) {
                        class114.field2548.field3798[var11] = class114.field2548.field3798[var3 + var11];
                        class114.field2548.field3793[var11] = class114.field2548.field3793[var3 + var11];
                    }
                } else {
                    class114.field2548.field3792 = 0;
                }
            }
        }
        if (class158.field3280 != 0) {
            long var12 = (class123.field2723 - class54.field1357) / 50L;
            int var14 = class143.field3074;
            if (var12 > 4095L) {
                var12 = 4095L;
            }
            class33.field801++;
            if (var14 < 0) {
                var14 = 0;
            } else if (var14 > 502) {
                var14 = 502;
            }
            class54.field1357 = class123.field2723;
            int var15 = class110.field2480;
            int var16 = (int) var12;
            byte var17 = 0;
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 764) {
                var15 = 764;
            }
            if (class158.field3280 == 2) {
                var17 = 1;
            }
            field3031.method854(99, true);
            int var18 = var14 * 765 + var15;
            field3031.method44((byte) 119, (var16 << 20) + (var17 << 19) + var18);
        }
        if (class9.field189[96] || class9.field189[97] || class9.field189[98] || class9.field189[99]) {
            class59.field1519 = true;
        }
        if (class79.field1911 > 0) {
            class79.field1911--;
        }
        if (class59.field1519 && class79.field1911 <= 0) {
            class59.field1519 = false;
            class111.field2501++;
            class79.field1911 = 20;
            field3031.method854(147, true);
            field3031.method62(class89.field2088, (byte) 105);
            field3031.method54((byte) -14, class68.field1710);
        }
        if (class144.field3080 && !class100.field2360) {
            class100.field2360 = true;
            field3031.method854(7, true);
            field3031.method66(2, 1);
            class22.field519++;
        }
        if (!class144.field3080 && class100.field2360) {
            class22.field519++;
            class100.field2360 = false;
            field3031.method854(7, true);
            field3031.method66(2, 0);
        }
        class100.method840(-87);
        if (class136.field2932 != 30) {
            return;
        }
        class202.method1334(-103);
        class191.method1261((byte) 65);
        class90.field2117++;
        if (class90.field2117 > 750) {
            class13.method154((byte) -63);
            return;
        }
        class150.method1051(0);
        class151.method1062(false);
        class193.method1270(arg0 ^ 0x13CA);
        class131.field2852++;
        if (class6.field149 != 0) {
            class182.field3693 += 20;
            if (class182.field3693 >= 400) {
                class6.field149 = 0;
            }
        }
        if (class162.field3332 != null) {
            class113.field2537++;
            if (class113.field2537 >= 15) {
                class113.method901(arg0 + 84, class162.field3332);
                class162.field3332 = null;
            }
        }
        if (class89.field2094 != null) {
            class113.method901(0, class89.field2094);
            class71.field1798++;
            if (class182.field3682 + 5 < class100.field2365 || class100.field2365 < class182.field3682 - 5 || class188.field3794 > class88.field2064 + 5 || class88.field2064 - 5 > class188.field3794) {
                class16.field375 = true;
            }
            if (class168.field3471 == 0) {
                if (class16.field375 && class71.field1798 >= 5) {
                    if (class89.field2094 == class13.field307 && class165.field3385 != class14.field336) {
                        class173.field3570++;
                        class54 var19 = class89.field2094;
                        byte var20 = 0;
                        if (class203.field4037 == 1 && var19.field1367 == 206) {
                            var20 = 1;
                        }
                        if (var19.field1324[class14.field336] <= 0) {
                            var20 = 0;
                        }
                        if (class29.method283(class10.method136((byte) -110, var19), false)) {
                            int var21 = class165.field3385;
                            int var22 = class14.field336;
                            var19.field1324[var22] = var19.field1324[var21];
                            var19.field1315[var22] = var19.field1315[var21];
                            var19.field1324[var21] = -1;
                            var19.field1315[var21] = 0;
                        } else if (var20 == 1) {
                            int var23 = class14.field336;
                            int var24 = class165.field3385;
                            while (var23 != var24) {
                                if (var24 > var23) {
                                    var19.method527(var24, var24 - 1, (byte) -128);
                                    var24--;
                                } else if (var23 > var24) {
                                    var19.method527(var24, var24 + 1, (byte) -107);
                                    var24++;
                                }
                            }
                        } else {
                            var19.method527(class165.field3385, class14.field336, (byte) -105);
                        }
                        field3031.method854(253, true);
                        field3031.method54((byte) -14, class165.field3385);
                        field3031.method44((byte) 61, class89.field2094.field1323);
                        field3031.method62(class14.field336, (byte) -82);
                        field3031.method61(var20, false);
                    }
                } else if ((class182.field3694 == 1 || class127.method955((byte) 127, class166.field3404 - 1)) && class166.field3404 > 2) {
                    class186.method1223((byte) -123);
                } else if (class166.field3404 > 0) {
                    class116.method912((byte) 97, class166.field3404 - 1);
                }
                class89.field2094 = null;
                class113.field2537 = 10;
                class158.field3280 = 0;
            }
        }
        class142.field3051 = false;
        class140.field3014 = 0;
        class54 var25 = class114.field2557;
        class114.field2557 = null;
        class54 var26 = class11.field257;
        class162.field3338 = false;
        class11.field257 = null;
        class106.field2411 = null;
        while (class166.method1122((byte) 119) && class140.field3014 < 128) {
            class148.field3119[class140.field3014] = class117.field2624;
            class191.field3884[class140.field3014] = class108.field2444;
            class140.field3014++;
        }
        if (class130.field2836 != -1) {
            class196.method1283(0, 0, 0, 765, class130.field2836, 503, 0, (byte) 83);
        }
        class72.field1807++;
        while (true) {
            class131 var27;
            class54 var28;
            class54 var29;
            do {
                var27 = (class131) class163.field3358.method1036(-31644);
                if (var27 == null) {
                    while (true) {
                        class131 var30;
                        class54 var31;
                        class54 var32;
                        do {
                            var30 = (class131) class163.field3362.method1036(-31644);
                            if (var30 == null) {
                                while (true) {
                                    class131 var33;
                                    class54 var34;
                                    class54 var35;
                                    do {
                                        var33 = (class131) class157.field3263.method1036(-31644);
                                        if (var33 == null) {
                                            if (class198.field3963 != null) {
                                                client.method299((byte) -105);
                                            }
                                            if (class198.field3960 != -1) {
                                                int var36 = class198.field3960;
                                                int var37 = class18.field425;
                                                boolean var38 = class162.method1105(0, class3.field72.field1117[0], 0, 0, 0, 0, var36, class3.field72.field1164[0], var37, true, (byte) -38, 0);
                                                class198.field3960 = -1;
                                                if (var38) {
                                                    class49.field1188 = class143.field3074;
                                                    class32.field785 = class110.field2480;
                                                    class6.field149 = 1;
                                                    class182.field3693 = 0;
                                                }
                                            }
                                            class8.method114(1);
                                            if (class11.field257 != var26) {
                                                if (var26 != null) {
                                                    class113.method901(0, var26);
                                                }
                                                if (class11.field257 != null) {
                                                    class113.method901(arg0 ^ 0xFFFFFFAC, class11.field257);
                                                }
                                            }
                                            if (class114.field2557 != var25 && class41.field954 == class165.field3387) {
                                                if (var25 != null) {
                                                    class113.method901(0, var25);
                                                }
                                                if (class114.field2557 != null) {
                                                    class113.method901(0, class114.field2557);
                                                }
                                            }
                                            if (class114.field2557 == null) {
                                                if (class41.field954 > 0) {
                                                    class41.field954--;
                                                }
                                            } else if (class41.field954 < class165.field3387) {
                                                class41.field954++;
                                                if (class41.field954 == class165.field3387) {
                                                    class113.method901(0, class114.field2557);
                                                }
                                            }
                                            class198.method1296((byte) -102);
                                            if (class83.field1968) {
                                                class110.method880((byte) 47);
                                            }
                                            if (arg0 != -84) {
                                                return;
                                            }
                                            for (int var39 = 0; var39 < 5; var39++) {
                                                int var10002 = class28.field657[var39]++;
                                            }
                                            int var40 = class150.method1052((byte) 83);
                                            int var41 = class29.method290((byte) 92);
                                            if (var40 > 4500 && var41 > 4500) {
                                                class125.field2772++;
                                                class78.field1888 = 250;
                                                class189.method1237((byte) -65, 4000);
                                                field3031.method854(42, true);
                                            }
                                            class8.field177++;
                                            class198.field3962++;
                                            if (class198.field3962 > 500) {
                                                class198.field3962 = 0;
                                                int var42 = (int) (Math.random() * 8.0D);
                                                if ((var42 & 0x4) == 4) {
                                                    class91.field2128 += class162.field3341;
                                                }
                                                if ((var42 & 0x2) == 2) {
                                                    class174.field3578 += class100.field2346;
                                                }
                                                if ((var42 & 0x1) == 1) {
                                                    class189.field3841 += class29.field685;
                                                }
                                            }
                                            class161.field3320++;
                                            if (class174.field3578 < -55) {
                                                class100.field2346 = 2;
                                            }
                                            if (class161.field3320 > 500) {
                                                class161.field3320 = 0;
                                                int var43 = (int) (Math.random() * 8.0D);
                                                if ((var43 & 0x1) == 1) {
                                                    class121.field2690 += class93.field2191;
                                                }
                                                if ((var43 & 0x2) == 2) {
                                                    class199.field3977 += class140.field3005;
                                                }
                                            }
                                            if (class121.field2690 < -60) {
                                                class93.field2191 = 2;
                                            }
                                            if (class199.field3977 < -20) {
                                                class140.field3005 = 1;
                                            }
                                            if (class189.field3841 < -50) {
                                                class29.field685 = 2;
                                            }
                                            if (class199.field3977 > 10) {
                                                class140.field3005 = -1;
                                            }
                                            if (class91.field2128 < -40) {
                                                class162.field3341 = 1;
                                            }
                                            if (class91.field2128 > 40) {
                                                class162.field3341 = -1;
                                            }
                                            if (class189.field3841 > 50) {
                                                class29.field685 = -2;
                                            }
                                            if (class121.field2690 > 60) {
                                                class93.field2191 = -2;
                                            }
                                            if (class174.field3578 > 55) {
                                                class100.field2346 = -2;
                                            }
                                            if (class8.field177 > 50) {
                                                field3031.method854(82, true);
                                                class8.field180++;
                                            }
                                            try {
                                                if (class171.field3553 != null && field3031.field54 > 0) {
                                                    class171.field3553.method512(0, field3031.field54, field3031.field48, (byte) -43);
                                                    class8.field177 = 0;
                                                    field3031.field54 = 0;
                                                    return;
                                                }
                                                return;
                                            } catch (IOException var44) {
                                                class13.method154((byte) -117);
                                                return;
                                            }
                                        }
                                        var34 = var33.field2862;
                                        if (var34.field1408 < 0) {
                                            break;
                                        }
                                        var35 = class59.method555(var34.field1353, 32173);
                                    } while (var35 == null || var35.field1368 == null || var34.field1408 >= var35.field1368.length || var35.field1368[var34.field1408] != var34);
                                    class130.method963(var33, (byte) -62);
                                }
                            }
                            var31 = var30.field2862;
                            if (var31.field1408 < 0) {
                                break;
                            }
                            var32 = class59.method555(var31.field1353, 32173);
                        } while (var32 == null || var32.field1368 == null || var32.field1368.length <= var31.field1408 || var32.field1368[var31.field1408] != var31);
                        class130.method963(var30, (byte) -94);
                    }
                }
                var28 = var27.field2862;
                if (var28.field1408 < 0) {
                    break;
                }
                var29 = class59.method555(var28.field1353, arg0 + 32257);
            } while (var29 == null || var29.field1368 == null || var29.field1368.length <= var28.field1408 || var29.field1368[var28.field1408] != var28);
            class130.method963(var27, (byte) -83);
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(I[B)[B")
    public final byte[] method1016(int arg0, byte[] arg1) {
        if (this.field3030 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field3028 / (long) this.field3027) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                byte var10 = arg1[var7];
                int[] var11 = this.field3030[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field3028 + var6;
                int var14 = var13 / this.field3027;
                var5 += var14;
                var6 = var13 - this.field3027 * var14;
            }
            arg1 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var4[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg1[var8] = -128;
                } else if (var9 > 127) {
                    arg1[var8] = 127;
                } else {
                    arg1[var8] = (byte) var9;
                }
            }
        }
        field3026++;
        if (arg0 != 12020) {
            this.method1016(40, null);
        }
        return arg1;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(II)I")
    public final int method1017(int arg0, int arg1) {
        field3029++;
        if (this.field3030 != null) {
            arg1 = (int) ((long) this.field3028 * (long) arg1 / (long) this.field3027) + 6;
        }
        return arg0 == 6 ? arg1 : -113;
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(II)V")
    public class141(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class14.method165(arg1, arg0, -1);
            int var4 = arg0 / var3;
            this.field3030 = new int[var4][14];
            int var5 = arg1 / var3;
            this.field3027 = var4;
            this.field3028 = var5;
            for (int var6 = 0; var6 < var4; var6++) {
                int[] var7 = this.field3030[var6];
                double var8 = (double) var6 / (double) var4 + 6.0D;
                double var10 = (double) var5 / (double) var4;
                int var12 = (int) Math.floor(var8 + 1.0D - 7.0D);
                int var13 = (int) Math.ceil(var8 + 7.0D);
                if (var12 < 0) {
                    var12 = 0;
                }
                if (var13 > 14) {
                    var13 = 14;
                }
                while (var13 > var12) {
                    double var14 = ((double) var12 - var8) * 3.141592653589793D;
                    double var16 = var10;
                    if (var14 < -1.0E-4D || var14 > 1.0E-4D) {
                        var16 = var10 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var12 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var12] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var12++;
                }
            }
        }
    }
}
