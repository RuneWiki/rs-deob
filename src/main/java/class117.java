import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class117 extends class398 {

    @OriginalMember(owner = "client!ld", name = "K", descriptor = "I")
    private int field1637 = 6;

    @OriginalMember(owner = "client!ld", name = "R", descriptor = "[I")
    public static int[] field1644 = new int[16384];

    @OriginalMember(owner = "client!ld", name = "J", descriptor = "[I")
    public static int[] field1636 = new int[16384];

    @OriginalMember(owner = "client!ld", name = "X", descriptor = "Ljava/lang/String;")
    public static String field1650;

    @OriginalMember(owner = "client!ld", name = "V", descriptor = "I")
    public static int field1648;

    @OriginalMember(owner = "client!ld", name = "Z", descriptor = "I")
    public static int field1652;

    @OriginalMember(owner = "client!ld", name = "L", descriptor = "I")
    public static int field1638;

    @OriginalMember(owner = "client!ld", name = "M", descriptor = "I")
    public static int field1639;

    @OriginalMember(owner = "client!ld", name = "N", descriptor = "I")
    public static int field1640;

    @OriginalMember(owner = "client!ld", name = "P", descriptor = "I")
    public static int field1642;

    @OriginalMember(owner = "client!ld", name = "Q", descriptor = "I")
    public static int field1643;

    @OriginalMember(owner = "client!ld", name = "T", descriptor = "I")
    public static int field1646;

    @OriginalMember(owner = "client!ld", name = "U", descriptor = "I")
    public static int field1647;

    @OriginalMember(owner = "client!ld", name = "W", descriptor = "I")
    public static int field1649;

    @OriginalMember(owner = "client!ld", name = "S", descriptor = "Llm;")
    public static class347 field1645;

    @OriginalMember(owner = "client!ld", name = "Y", descriptor = "Llm;")
    public static class347 field1651;

    @OriginalMember(owner = "client!ld", name = "O", descriptor = "[I")
    public static int[] field1641;

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; ~var2 > -16385; ++var2) {
            field1644[var2] = (int) (32768.0D * Math.sin((double) var2 * var0));
            field1636[var2] = (int) (32768.0D * Math.cos((double) var2 * var0));
        }
        field1650 = "M";
        field1648 = 0;
        field1652 = 0;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lnj;II)V", line = 4)
    public final void method208(class228 arg0, int arg1, int arg2) {
        ++field1649;
        if (arg1 != 0) {
            if (~arg1 == -2) {
                super.field5931 = ~arg0.method1348(arg2 + 13044) == -2;
            }
        } else {
            this.field1637 = arg0.method1348(-109);
        }
        if (arg2 != -13132) {
            method760((byte) -56);
        }
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(II)[[I", line = 39)
    public final int[][] method99(int arg0, int arg1) {
        ++field1640;
        int[][] var3 = super.field5933.method2205((byte) -114, arg0);
        if (arg1 != 2) {
            this.method95(-52, 50);
        }
        if (super.field5933.field4847) {
            int[][] var4 = this.method2561(arg0, (byte) -83, 0);
            int[][] var5 = this.method2561(arg0, (byte) -59, 1);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int[] var12 = var5[0];
            int[] var13 = var5[1];
            int[] var14 = var5[2];
            int var15 = this.field1637;
            if (var15 != 1) {
                if (~var15 != -3) {
                    if (var15 != 3) {
                        if (~var15 != -5) {
                            if (~var15 != -6) {
                                if (~var15 != -7) {
                                    if (~var15 != -8) {
                                        if (~var15 != -9) {
                                            if (var15 != 9) {
                                                if (var15 != 10) {
                                                    if (~var15 != -12) {
                                                        if (~var15 == -13) {
                                                            for (int var16 = 0; ~var16 > ~class140.field1922; ++var16) {
                                                                int var17 = var13[var16];
                                                                int var18 = var11[var16];
                                                                int var19 = var9[var16];
                                                                int var20 = var10[var16];
                                                                int var21 = var12[var16];
                                                                int var22 = var14[var16];
                                                                var6[var16] = -(var19 * var21 >> 11) + var19 + var21;
                                                                var7[var16] = var17 + var20 + -(var17 * var20 >> 11);
                                                                var8[var16] = var18 - (var18 * var22 >> 11) + var22;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var23 = 0; var23 < class140.field1922; ++var23) {
                                                            int var24 = var14[var23];
                                                            int var25 = var9[var23];
                                                            int var26 = var10[var23];
                                                            int var27 = var13[var23];
                                                            int var28 = var12[var23];
                                                            int var29 = var11[var23];
                                                            var6[var23] = var28 >= var25 ? -var25 + var28 : -var28 + var25;
                                                            var7[var23] = ~var26 < ~var27 ? -var27 + var26 : -var26 + var27;
                                                            var8[var23] = var24 < var29 ? -var24 + var29 : var24 - var29;
                                                        }
                                                    }
                                                } else {
                                                    for (int var30 = 0; class140.field1922 > var30; ++var30) {
                                                        int var31 = var14[var30];
                                                        int var32 = var11[var30];
                                                        int var33 = var9[var30];
                                                        int var34 = var12[var30];
                                                        int var35 = var10[var30];
                                                        int var36 = var13[var30];
                                                        var6[var30] = var33 <= var34 ? var34 : var33;
                                                        var7[var30] = ~var35 >= ~var36 ? var36 : var35;
                                                        var8[var30] = var32 > var31 ? var32 : var31;
                                                    }
                                                }
                                            } else {
                                                for (int var37 = 0; ~var37 > ~class140.field1922; ++var37) {
                                                    int var38 = var14[var37];
                                                    int var39 = var9[var37];
                                                    int var40 = var12[var37];
                                                    int var41 = var10[var37];
                                                    int var42 = var11[var37];
                                                    int var43 = var13[var37];
                                                    var6[var37] = var40 > var39 ? var39 : var40;
                                                    var7[var37] = var43 <= var41 ? var43 : var41;
                                                    var8[var37] = var38 <= var42 ? var38 : var42;
                                                }
                                            }
                                        } else {
                                            for (int var44 = 0; class140.field1922 > var44; ++var44) {
                                                int var45 = var9[var44];
                                                int var46 = var11[var44];
                                                int var47 = var10[var44];
                                                var6[var44] = ~var45 != -1 ? -((-var12[var44] + 4096 << 12) / var45) + 4096 : 0;
                                                var7[var44] = ~var47 != -1 ? -((-var13[var44] + 4096 << 12) / var47) + 4096 : 0;
                                                var8[var44] = var46 != 0 ? -((-var14[var44] + 4096 << 12) / var46) + 4096 : 0;
                                            }
                                        }
                                    } else {
                                        for (int var48 = 0; class140.field1922 > var48; ++var48) {
                                            int var49 = var11[var48];
                                            int var50 = var10[var48];
                                            int var51 = var9[var48];
                                            var6[var48] = ~var51 == -4097 ? 4096 : (var12[var48] << 12) / (-var51 + 4096);
                                            var7[var48] = ~var50 == -4097 ? 4096 : (var13[var48] << 12) / (4096 - var50);
                                            var8[var48] = ~var49 != -4097 ? (var14[var48] << 12) / (-var49 + 4096) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var52 = 0; ~class140.field1922 < ~var52; ++var52) {
                                        int var53 = var12[var52];
                                        int var54 = var13[var52];
                                        int var55 = var14[var52];
                                        var6[var52] = var53 >= 2048 ? -((4096 - var53) * (-var9[var52] + 4096) >> 11) + 4096 : var9[var52] * var53 >> 11;
                                        var7[var52] = var54 >= 2048 ? -((-var10[var52] + 4096) * (-var54 + 4096) >> 11) + 4096 : var10[var52] * var54 >> 11;
                                        var8[var52] = ~var55 > -2049 ? var11[var52] * var55 >> 11 : -((-var11[var52] + 4096) * (-var55 + 4096) >> 11) + 4096;
                                    }
                                }
                            } else {
                                for (int var56 = 0; class140.field1922 > var56; ++var56) {
                                    var6[var56] = -((-var9[var56] + 4096) * (-var12[var56] + 4096) >> 12) + 4096;
                                    var7[var56] = 4096 - ((-var10[var56] + 4096) * (-var13[var56] + 4096) >> 12);
                                    var8[var56] = -((-var11[var56] + 4096) * (-var14[var56] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var57 = 0; class140.field1922 > var57; ++var57) {
                                int var58 = var14[var57];
                                int var59 = var13[var57];
                                int var60 = var12[var57];
                                var6[var57] = var60 != 0 ? (var9[var57] << 12) / var60 : 4096;
                                var7[var57] = ~var59 != -1 ? (var10[var57] << 12) / var59 : 4096;
                                var8[var57] = ~var58 == -1 ? 4096 : (var11[var57] << 12) / var58;
                            }
                        }
                    } else {
                        for (int var61 = 0; class140.field1922 > var61; ++var61) {
                            var6[var61] = var9[var61] * var12[var61] >> 12;
                            var7[var61] = var10[var61] * var13[var61] >> 12;
                            var8[var61] = var11[var61] * var14[var61] >> 12;
                        }
                    }
                } else {
                    for (int var62 = 0; var62 < class140.field1922; ++var62) {
                        var6[var62] = var9[var62] + -var12[var62];
                        var7[var62] = var10[var62] + -var13[var62];
                        var8[var62] = var11[var62] + -var14[var62];
                    }
                }
            } else {
                for (int var63 = 0; ~class140.field1922 < ~var63; ++var63) {
                    var6[var63] = var9[var63] + var12[var63];
                    var7[var63] = var10[var63] + var13[var63];
                    var8[var63] = var11[var63] + var14[var63];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "(II)V", line = 354)
    public static final void method758(int arg0, int arg1) {
        class377.field5489.method1142((byte) -52, arg1);
        if (arg0 != 13346) {
            method758(21, 74);
        }
        ++field1639;
    }

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "(I)V", line = 373)
    public static void method759(int arg0) {
        field1650 = null;
        field1645 = null;
        field1636 = null;
        field1644 = null;
        field1641 = null;
        if (arg0 != 4096) {
            field1644 = null;
        }
        field1651 = null;
    }

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "()V", line = 390)
    public class117() {
        super(2, false);
    }

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "(B)V", line = 393)
    public static final void method760(byte arg0) {
        if (arg0 != -92) {
            field1644 = null;
        }
        ++field1643;
        class189 var1 = class439.field6453;
        synchronized (class439.field6453) {
            class439.field6453.method1136((byte) -107);
        }
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(IB)I", line = 407)
    public static final int method761(int arg0, byte arg1) {
        ++field1642;
        int var2 = -105 / ((-46 - arg1) / 61);
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 447)
    public static final int method762(String arg0, int arg1) {
        ++field1646;
        int var2 = arg0.length();
        int var3 = 0;
        for (int var4 = arg1; var2 > var4; ++var4) {
            var3 = (var3 << 5) - var3 + arg0.charAt(var4);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(II)[I", line = 466)
    public final int[] method95(int arg0, int arg1) {
        if (arg1 != 0) {
            return null;
        } else {
            ++field1638;
            int[] var3 = super.field5927.method305(arg0, (byte) 122);
            if (super.field5927.field591) {
                int[] var4 = this.method2558(0, 29295, arg0);
                int[] var5 = this.method2558(1, 29295, arg0);
                int var6 = this.field1637;
                if (~var6 != -2) {
                    if (var6 != 2) {
                        if (~var6 != -4) {
                            if (~var6 != -5) {
                                if (~var6 != -6) {
                                    if (var6 != 6) {
                                        if (~var6 != -8) {
                                            if (~var6 != -9) {
                                                if (~var6 != -10) {
                                                    if (~var6 != -11) {
                                                        if (var6 != 11) {
                                                            if (var6 == 12) {
                                                                for (int var7 = 0; var7 < class140.field1922; ++var7) {
                                                                    int var8 = var4[var7];
                                                                    int var9 = var5[var7];
                                                                    var3[var7] = var9 - (var8 * var9 >> 11) + var8;
                                                                }
                                                            }
                                                        } else {
                                                            for (int var10 = 0; var10 < class140.field1922; ++var10) {
                                                                int var11 = var5[var10];
                                                                int var12 = var4[var10];
                                                                var3[var10] = var12 > var11 ? -var11 + var12 : var11 - var12;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var13 = 0; var13 < class140.field1922; ++var13) {
                                                            int var14 = var4[var13];
                                                            int var15 = var5[var13];
                                                            var3[var13] = var15 >= var14 ? var15 : var14;
                                                        }
                                                    }
                                                } else {
                                                    for (int var16 = 0; var16 < class140.field1922; ++var16) {
                                                        int var17 = var4[var16];
                                                        int var18 = var5[var16];
                                                        var3[var16] = var18 > var17 ? var17 : var18;
                                                    }
                                                }
                                            } else {
                                                for (int var19 = 0; ~class140.field1922 < ~var19; ++var19) {
                                                    int var20 = var4[var19];
                                                    var3[var19] = var20 == 0 ? 0 : -((-var5[var19] + 4096 << 12) / var20) + 4096;
                                                }
                                            }
                                        } else {
                                            for (int var21 = 0; ~class140.field1922 < ~var21; ++var21) {
                                                int var22 = var4[var21];
                                                var3[var21] = var22 != 4096 ? (var5[var21] << 12) / (4096 - var22) : 4096;
                                            }
                                        }
                                    } else {
                                        for (int var23 = 0; ~class140.field1922 < ~var23; ++var23) {
                                            int var24 = var5[var23];
                                            var3[var23] = var24 >= 2048 ? -((4096 - var4[var23]) * (-var24 + 4096) >> 11) + 4096 : var4[var23] * var24 >> 11;
                                        }
                                    }
                                } else {
                                    for (int var25 = 0; ~class140.field1922 < ~var25; ++var25) {
                                        var3[var25] = 4096 - ((-var4[var25] + 4096) * (-var5[var25] + 4096) >> 12);
                                    }
                                }
                            } else {
                                for (int var26 = 0; ~var26 > ~class140.field1922; ++var26) {
                                    int var27 = var5[var26];
                                    var3[var26] = var27 == 0 ? 4096 : (var4[var26] << 12) / var27;
                                }
                            }
                        } else {
                            for (int var28 = 0; class140.field1922 > var28; ++var28) {
                                var3[var28] = var4[var28] * var5[var28] >> 12;
                            }
                        }
                    } else {
                        for (int var29 = 0; ~class140.field1922 < ~var29; ++var29) {
                            var3[var29] = var4[var29] + -var5[var29];
                        }
                    }
                } else {
                    for (int var30 = 0; ~class140.field1922 < ~var30; ++var30) {
                        var3[var30] = var4[var30] + var5[var30];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "(I)V", line = 718)
    public static final void method763(int arg0) {
        ++field1647;
        class236 var1 = class445.field6523;
        synchronized (class445.field6523) {
            ++class75.field1077;
            if (arg0 != 4096) {
                method760((byte) -14);
            }
            class213.field2846 = class134.field1870;
            if (~class349.field5048 <= -1) {
                while (~class349.field5048 != ~class329.field4799) {
                    int var2 = class162.field2163[class329.field4799];
                    class329.field4799 = class329.field4799 + 1 & 127;
                    if (var2 >= 0) {
                        class30.field437[var2] = true;
                    } else {
                        class30.field437[~var2] = false;
                    }
                }
            } else {
                for (int var3 = 0; var3 < 112; ++var3) {
                    class30.field437[var3] = false;
                }
                class349.field5048 = class329.field4799;
            }
            class134.field1870 = class125.field1748;
        }
    }
}
