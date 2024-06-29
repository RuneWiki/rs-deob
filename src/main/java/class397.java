import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qp")
public class class397 extends class13 {

    @OriginalMember(owner = "client!qp", name = "I", descriptor = "I")
    private int field5677 = 0;

    @OriginalMember(owner = "client!qp", name = "K", descriptor = "I")
    private int field5679 = 4096;

    @OriginalMember(owner = "client!qp", name = "N", descriptor = "I")
    public static int field5682 = -1;

    @OriginalMember(owner = "client!qp", name = "E", descriptor = "I")
    public static int field5673;

    @OriginalMember(owner = "client!qp", name = "G", descriptor = "I")
    public static int field5675;

    @OriginalMember(owner = "client!qp", name = "J", descriptor = "I")
    public static int field5678;

    @OriginalMember(owner = "client!qp", name = "L", descriptor = "I")
    public static int field5680;

    @OriginalMember(owner = "client!qp", name = "M", descriptor = "I")
    public static int field5681;

    @OriginalMember(owner = "client!qp", name = "O", descriptor = "I")
    public static int field5683;

    @OriginalMember(owner = "client!qp", name = "P", descriptor = "I")
    public static int field5684;

    @OriginalMember(owner = "client!qp", name = "Q", descriptor = "I")
    public static int field5685;

    @OriginalMember(owner = "client!qp", name = "H", descriptor = "Lnq;")
    public static class268 field5676;

    @OriginalMember(owner = "client!qp", name = "F", descriptor = "Ljava/lang/String;")
    public static String field5674;

    @OriginalMember(owner = "client!qp", name = "D", descriptor = "[I")
    public static int[] field5672;

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(Z)V", line = 5)
    public static void method2508(boolean arg0) {
        field5674 = null;
        field5672 = null;
        if (arg0) {
            field5674 = null;
        }
        field5676 = null;
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "([IZ[ILkm;[I)V", line = 19)
    public static final void method2509(int[] arg0, boolean arg1, int[] arg2, class198 arg3, int[] arg4) {
        if (arg1) {
            method2509((int[]) null, true, (int[]) null, (class198) null, (int[]) null);
        }
        for (int var5 = 0; var5 < arg0.length; ++var5) {
            int var6 = arg0[var5];
            int var7 = arg2[var5];
            int var8 = arg4[var5];
            for (int var9 = 0; var7 != 0 && arg3.field5296.length > var9; ++var9) {
                if ((var7 & 1) != 0) {
                    if (var6 != -1) {
                        class411 var10 = class108.method761((byte) -82, var6);
                        int var11 = var10.field5832;
                        class66 var12 = arg3.field5296[var9];
                        if (var12 != null) {
                            if (var12.field980 == var6) {
                                if (~var11 == -1) {
                                    var12 = arg3.field5296[var9] = null;
                                } else if (~var11 != -2) {
                                    if (~var11 == -3) {
                                        var12.field979 = 0;
                                    }
                                } else {
                                    var12.field979 = 0;
                                    var12.field982 = 0;
                                    var12.field985 = var8;
                                    var12.field975 = 1;
                                    var12.field973 = 0;
                                    class431.method2721(arg3.field6266, arg3.field6262, var10, -124, false, 0);
                                }
                            } else if (var10.field5825 >= class108.method761((byte) -82, var12.field980).field5825) {
                                var12 = arg3.field5296[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class66 var13 = arg3.field5296[var9] = new class66();
                            var13.field979 = 0;
                            var13.field973 = 0;
                            var13.field985 = var8;
                            var13.field982 = 0;
                            var13.field975 = 1;
                            var13.field980 = var6;
                            class431.method2721(arg3.field6266, arg3.field6262, var10, -60, false, 0);
                        }
                    } else {
                        arg3.field5296[var9] = null;
                    }
                }
                var7 >>>= 1;
            }
        }
        ++field5678;
    }

    @OriginalMember(owner = "client!qp", name = "e", descriptor = "(B)V", line = 116)
    public static final void method2510(byte arg0) {
        ++field5683;
        int var1 = class333.field4591.method1186((byte) -97, 8);
        if (~class26.field467 < ~var1) {
            for (int var2 = var1; ~var2 > ~class26.field467; ++var2) {
                class112.field1627[class99.field1368++] = class66.field974[var2];
            }
        }
        if (class26.field467 < var1) {
            throw new RuntimeException("gppov1");
        } else {
            class26.field467 = 0;
            for (int var3 = 0; var3 < var1; ++var3) {
                int var5 = class66.field974[var3];
                class134 var6 = class381.field5447[var5];
                int var7 = class333.field4591.method1186((byte) -97, 1);
                if (var7 == 0) {
                    class66.field974[class26.field467++] = var5;
                    var6.field5260 = class276.field3837;
                } else {
                    int var8 = class333.field4591.method1186((byte) -97, 2);
                    if (var8 == 0) {
                        class66.field974[class26.field467++] = var5;
                        var6.field5260 = class276.field3837;
                        class314.field4301[class438.field6171++] = var5;
                    } else if (var8 == 1) {
                        class66.field974[class26.field467++] = var5;
                        var6.field5260 = class276.field3837;
                        int var9 = class333.field4591.method1186((byte) -97, 3);
                        var6.method932(1, var9, (byte) 111);
                        int var10 = class333.field4591.method1186((byte) -97, 1);
                        if (~var10 == -2) {
                            class314.field4301[class438.field6171++] = var5;
                        }
                    } else if (~var8 == -3) {
                        class66.field974[class26.field467++] = var5;
                        var6.field5260 = class276.field3837;
                        if (~class333.field4591.method1186((byte) -97, 1) != -2) {
                            int var11 = class333.field4591.method1186((byte) -97, 3);
                            var6.method932(0, var11, (byte) 116);
                        } else {
                            int var12 = class333.field4591.method1186((byte) -97, 3);
                            var6.method932(2, var12, (byte) 100);
                            int var13 = class333.field4591.method1186((byte) -97, 3);
                            var6.method932(2, var13, (byte) 98);
                        }
                        int var14 = class333.field4591.method1186((byte) -97, 1);
                        if (var14 == 1) {
                            class314.field4301[class438.field6171++] = var5;
                        }
                    } else if (~var8 == -4) {
                        class112.field1627[class99.field1368++] = var5;
                    }
                }
            }
            int var4 = 72 / ((-43 - arg0) / 39);
        }
    }

    @OriginalMember(owner = "client!qp", name = "f", descriptor = "(B)I", line = 229)
    public static final int method2511(byte arg0) {
        ++field5680;
        try {
            if (arg0 != -104) {
                method2512(10, (class394) null, -113, 84, (class345) null, -46, 110, 17, false, 103, 64, (class411) null, -75, 48, 69);
            }
            if (class39.field573 == 0) {
                if (class334.field4605 > -5000L + class385.method2442(-6631)) {
                    return 0;
                }
                class371.field5206 = class241.field3426.method1912(class129.field1811, 1, class173.field2375);
                class164.field2268 = class385.method2442(-6631);
                class39.field573 = 1;
            }
            if (~(class164.field2268 + 30000L) > ~class385.method2442(-6631)) {
                return class100.method719(true, 1000);
            } else {
                if (class39.field573 == 1) {
                    if (class371.field5206.field3998 == 2) {
                        return class100.method719(true, 1001);
                    }
                    if (~class371.field5206.field3998 != -2) {
                        return -1;
                    }
                    class156.field2207 = new class348((Socket) class371.field5206.field3999, class241.field3426);
                    class371.field5206 = null;
                    int var1 = 0;
                    class46.field648.field191 = 0;
                    if (class327.field4481) {
                        var1 = class188.field2601;
                    }
                    class46.field648.method173(23, 255);
                    class46.field648.method155(arg0 ^ -15591, var1);
                    class156.field2207.method2203(class46.field648.field230, 0, class46.field648.field191, 112);
                    if (class417.field5927 != null) {
                        class417.field5927.method272(2);
                    }
                    if (class119.field1682 != null) {
                        class119.field1682.method272(2);
                    }
                    int var2 = class156.field2207.method2207(arg0 + 16777064);
                    if (class417.field5927 != null) {
                        class417.field5927.method272(2);
                    }
                    if (class119.field1682 != null) {
                        class119.field1682.method272(2);
                    }
                    if (~var2 != -1) {
                        return class100.method719(true, var2);
                    }
                    class39.field573 = 2;
                }
                if (~class39.field573 == -3) {
                    if (class156.field2207.method2213(122) < 2) {
                        return -1;
                    }
                    class240.field3419 = class156.field2207.method2207(arg0 ^ -16777064);
                    class240.field3419 <<= 8;
                    class240.field3419 += class156.field2207.method2207(arg0 ^ -16777064);
                    class56.field766 = 0;
                    class39.field573 = 3;
                    class34.field529 = new byte[class240.field3419];
                }
                if (~class39.field573 == -4) {
                    int var3 = class156.field2207.method2213(123);
                    if (var3 < 1) {
                        return -1;
                    } else {
                        if (~(-class56.field766 + class240.field3419) > ~var3) {
                            var3 = -class56.field766 + class240.field3419;
                        }
                        class156.field2207.method2209(var3, class34.field529, class56.field766, 1509);
                        class56.field766 += var3;
                        if (class240.field3419 > class56.field766) {
                            return -1;
                        } else if (!class154.method1037(false, class34.field529)) {
                            return class100.method719(true, 1002);
                        } else {
                            class198.field2753 = new class437[class258.field3629];
                            int var4 = 0;
                            for (int var5 = class200.field2771; class139.field1989 >= var5; ++var5) {
                                class437 var6 = class302.method1949(var5, (byte) -109);
                                if (var6 != null) {
                                    class198.field2753[var4++] = var6;
                                }
                            }
                            class333.field4589 = 0;
                            class253.field3560 = null;
                            class156.field2207.method2210(-2);
                            class39.field573 = 0;
                            class156.field2207 = null;
                            class268.field3723 = 0;
                            class34.field529 = null;
                            class334.field4605 = class385.method2442(-6631);
                            return 0;
                        }
                    }
                } else {
                    return -1;
                }
            }
        } catch (IOException var7) {
            return class100.method719(true, 1003);
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(ZI)[I", line = 370)
    public final int[] method29(boolean arg0, int arg1) {
        ++field5673;
        if (!arg0) {
            return null;
        } else {
            int[] var3 = super.field263.method893(arg1, 1578);
            if (super.field263.field1845) {
                int[] var4 = this.method223(0, -11541, arg1);
                for (int var5 = 0; class269.field3751 > var5; ++var5) {
                    int var6 = var4[var5];
                    var3[var5] = this.field5677 <= var6 && ~var6 >= ~this.field5679 ? 4096 : 0;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!qp", name = "<init>", descriptor = "()V", line = 655)
    public class397() {
        super(1, true);
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(Lkh;BI)V", line = 408)
    public final void method31(class11 arg0, byte arg1, int arg2) {
        if (arg1 > 50) {
            if (arg2 != 0) {
                if (arg2 == 1) {
                    this.field5679 = arg0.method174(255);
                }
            } else {
                this.field5677 = arg0.method174(255);
            }
            ++field5681;
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(ILmj;IILuo;IIIZIILjm;III)Lmj;", line = 445)
    public static final class394 method2512(int arg0, class394 arg1, int arg2, int arg3, class345 arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9, int arg10, class411 arg11, int arg12, int arg13, int arg14) {
        ++field5684;
        if (arg1 == null) {
            return null;
        } else {
            int var15 = 1031;
            if (arg11 != null) {
                int var16 = var15 | arg11.method2573(false, -119, arg9, -1);
                var15 = var16 & -513;
            }
            long var17 = ((long) arg7 << 48) + ((long) arg5 << 32) + (long) ((arg6 << 16) + (arg13 << 24) + arg3);
            class131 var19 = class67.field1004;
            class394 var20;
            synchronized (class67.field1004) {
                var20 = (class394) class67.field1004.method904(false, var17);
            }
            if (var20 == null || arg4.method139(var20.method1424(), var15) != 0) {
                if (var20 != null) {
                    var15 = arg4.method108(var15, var20.method1424());
                }
                byte var21;
                if (arg3 != 1) {
                    if (arg3 != 2) {
                        if (arg3 != 3) {
                            if (arg3 != 4) {
                                var21 = 21;
                            } else {
                                var21 = 18;
                            }
                        } else {
                            var21 = 15;
                        }
                    } else {
                        var21 = 12;
                    }
                } else {
                    var21 = 9;
                }
                byte var22 = 3;
                int[] var23 = new int[] { 64, 96, 128 };
                class223 var24 = new class223(var21 * var22 + 1, var21 * var22 * 2 + -var21, 0);
                int var25 = var24.method1486((byte) -88, 0, 0, 0);
                int[][] var26 = new int[var22][var21];
                for (int var27 = 0; ~var22 < ~var27; ++var27) {
                    int var28 = var23[var27];
                    int var29 = var23[var27];
                    for (int var30 = 0; var21 > var30; ++var30) {
                        int var31 = (var30 << 14) / var21;
                        int var32 = class133.field1913[var31] * var28 >> 15;
                        int var33 = class133.field1908[var31] * var29 >> 15;
                        var26[var27][var30] = var24.method1486((byte) -95, var32, 0, var33);
                    }
                }
                for (int var34 = 0; ~var22 < ~var34; ++var34) {
                    int var35 = (var34 * 256 - -128) / var22;
                    int var36 = -var35 + 256;
                    byte var37 = (byte) (arg6 * var36 + arg13 * var35 >> 8);
                    short var38 = (short) ((32512 & (127 & arg5) * var36 + (arg7 & 127) * var35) + ((arg5 & 896) * var36 + (arg7 & 896) * var35 & 229376) + ((64512 & arg5) * var36 + (arg7 & 64512) * var35 & 16515072) >> 8);
                    for (int var39 = 0; ~var21 < ~var39; ++var39) {
                        if (~var34 == -1) {
                            var24.method1493((short) -1, (byte) -112, var25, (byte) 1, var26[0][var39], (byte) -1, var38, var37, var26[0][(var39 - -1) % var21]);
                        } else {
                            var24.method1493((short) -1, (byte) -111, var26[var34 + -1][var39], (byte) 1, var26[var34][(var39 + 1) % var21], (byte) -1, var38, var37, var26[var34 + -1][(var39 + 1) % var21]);
                            var24.method1493((short) -1, (byte) -126, var26[var34 + -1][var39], (byte) 1, var26[var34][var39], (byte) -1, var38, var37, var26[var34][(var39 + 1) % var21]);
                        }
                    }
                }
                var20 = arg4.method62(var24, var15, class242.field3437, 64, 768);
                class131 var40 = class67.field1004;
                synchronized (class67.field1004) {
                    class67.field1004.method902(var17, (byte) 112, var20);
                }
            }
            int var41 = arg3 * 64 + -1;
            int var42 = -var41;
            int var43 = -var41;
            int var44 = var41;
            int var45 = var41;
            if (arg8) {
                if (~arg12 < -9217 && arg12 < 15360) {
                    var44 = var41 + 128;
                }
                if (~arg12 < -1025 && ~arg12 > -7169) {
                    var42 -= 128;
                }
                if (~arg12 < -5121 && arg12 < 11264) {
                    var45 = var41 + 128;
                }
                if (~arg12 < -13313 || ~arg12 > -3073) {
                    var43 -= 128;
                }
            }
            int var46 = arg1.method1450();
            int var47 = arg1.method1458();
            int var48 = arg1.method1433();
            if (var46 < var42) {
                var46 = var42;
            }
            int var49 = arg1.method1414();
            if (~var43 < ~var48) {
                var48 = var43;
            }
            if (var47 > var44) {
                var47 = var44;
            }
            if (var45 < var49) {
                var49 = var45;
            }
            class386 var50 = null;
            if (arg11 != null) {
                int var51 = arg11.field5824[arg9];
                var50 = class171.method1127(var51 >> 16, false);
                arg9 = var51 & 65535;
            }
            class394 var52;
            if (var50 == null) {
                var52 = var20.method1430((byte) 3, var15, true);
                var52.method1415((var47 - var46) / 2, 128, (-var48 + var49) / 2);
                var52.method1455((var46 - -var47) / 2, 0, (var48 + var49) / 2);
            } else {
                var52 = var20.method1430((byte) 3, var15, true);
                var52.method1415((-var46 + var47) / 2, 128, (-var48 + var49) / 2);
                var52.method1455((var46 + var47) / 2, 0, (var48 + var49) / 2);
                var52.method2490(0, var50, arg9);
            }
            if (~arg14 != -1) {
                var52.method1413(arg14);
            }
            if (arg0 != 0) {
                var52.method1427(arg0);
            }
            if (arg2 != arg10) {
                var52.method1455(0, arg10, 0);
            }
            return var52;
        }
    }
}
