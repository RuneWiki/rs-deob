import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class101 extends class8 {

    @OriginalMember(owner = "client!uh", name = "I", descriptor = "I")
    private int field1652 = 6;

    @OriginalMember(owner = "client!uh", name = "V", descriptor = "Ljava/lang/String;")
    public static String field1665 = null;

    @OriginalMember(owner = "client!uh", name = "K", descriptor = "I")
    public static int field1654;

    @OriginalMember(owner = "client!uh", name = "L", descriptor = "I")
    public static int field1655;

    @OriginalMember(owner = "client!uh", name = "M", descriptor = "I")
    public static int field1656;

    @OriginalMember(owner = "client!uh", name = "N", descriptor = "I")
    public static int field1657;

    @OriginalMember(owner = "client!uh", name = "O", descriptor = "I")
    public static int field1658;

    @OriginalMember(owner = "client!uh", name = "P", descriptor = "I")
    public static int field1659;

    @OriginalMember(owner = "client!uh", name = "Q", descriptor = "I")
    public static int field1660;

    @OriginalMember(owner = "client!uh", name = "R", descriptor = "I")
    public static int field1661;

    @OriginalMember(owner = "client!uh", name = "S", descriptor = "I")
    public static int field1662;

    @OriginalMember(owner = "client!uh", name = "T", descriptor = "I")
    public static int field1663;

    @OriginalMember(owner = "client!uh", name = "U", descriptor = "I")
    public static int field1664;

    @OriginalMember(owner = "client!uh", name = "W", descriptor = "I")
    public static int field1666;

    @OriginalMember(owner = "client!uh", name = "X", descriptor = "I")
    public static int field1667;

    @OriginalMember(owner = "client!uh", name = "Y", descriptor = "I")
    public static int field1668;

    @OriginalMember(owner = "client!uh", name = "J", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field1653;

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(II)[I")
    public final int[] method44(int arg0, int arg1) {
        int[] var3 = super.field110.method1585(arg0 ^ arg0, arg1);
        if (super.field110.field3734) {
            int[] var4 = this.method61(arg1, 121, 0);
            int[] var5 = this.method61(arg1, -91, 1);
            int var6 = this.field1652;
            if (var6 != 1) {
                if (~var6 != -3) {
                    if (var6 != 3) {
                        if (~var6 != -5) {
                            if (~var6 != -6) {
                                if (~var6 != -7) {
                                    if (var6 != 7) {
                                        if (~var6 != -9) {
                                            if (var6 != 9) {
                                                if (~var6 != -11) {
                                                    if (var6 != 11) {
                                                        if (var6 == 12) {
                                                            for (int var7 = 0; class231.field3798 > var7; ++var7) {
                                                                int var8 = var4[var7];
                                                                int var9 = var5[var7];
                                                                var3[var7] = -(var8 * var9 >> 11) + var8 + var9;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var10 = 0; ~var10 > ~class231.field3798; ++var10) {
                                                            int var11 = var5[var10];
                                                            int var12 = var4[var10];
                                                            var3[var10] = var11 >= var12 ? var11 - var12 : var12 - var11;
                                                        }
                                                    }
                                                } else {
                                                    for (int var13 = 0; var13 < class231.field3798; ++var13) {
                                                        int var14 = var4[var13];
                                                        int var15 = var5[var13];
                                                        var3[var13] = var15 >= var14 ? var15 : var14;
                                                    }
                                                }
                                            } else {
                                                for (int var16 = 0; ~var16 > ~class231.field3798; ++var16) {
                                                    int var17 = var4[var16];
                                                    int var18 = var5[var16];
                                                    var3[var16] = ~var18 < ~var17 ? var17 : var18;
                                                }
                                            }
                                        } else {
                                            for (int var19 = 0; ~class231.field3798 < ~var19; ++var19) {
                                                int var20 = var4[var19];
                                                var3[var19] = var20 != 0 ? 4096 - (-var5[var19] + 4096 << 12) / var20 : 0;
                                            }
                                        }
                                    } else {
                                        for (int var21 = 0; ~var21 > ~class231.field3798; ++var21) {
                                            int var22 = var4[var21];
                                            var3[var21] = ~var22 == -4097 ? 4096 : (var5[var21] << 12) / (-var22 + 4096);
                                        }
                                    }
                                } else {
                                    for (int var23 = 0; ~var23 > ~class231.field3798; ++var23) {
                                        int var24 = var5[var23];
                                        var3[var23] = var24 >= 2048 ? -((-var4[var23] + 4096) * (-var24 + 4096) >> 11) + 4096 : var4[var23] * var24 >> 11;
                                    }
                                }
                            } else {
                                for (int var25 = 0; var25 < class231.field3798; ++var25) {
                                    var3[var25] = -((-var4[var25] + 4096) * (-var5[var25] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var26 = 0; ~var26 > ~class231.field3798; ++var26) {
                                int var27 = var5[var26];
                                var3[var26] = ~var27 != -1 ? (var4[var26] << 12) / var27 : 4096;
                            }
                        }
                    } else {
                        for (int var28 = 0; class231.field3798 > var28; ++var28) {
                            var3[var28] = var4[var28] * var5[var28] >> 12;
                        }
                    }
                } else {
                    for (int var29 = 0; var29 < class231.field3798; ++var29) {
                        var3[var29] = var4[var29] + -var5[var29];
                    }
                }
            } else {
                for (int var30 = 0; var30 < class231.field3798; ++var30) {
                    var3[var30] = var4[var30] + var5[var30];
                }
            }
        }
        ++field1654;
        return var3;
    }

    @OriginalMember(owner = "client!uh", name = "<init>", descriptor = "()V")
    public class101() {
        super(2, false);
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(BI)V")
    public static final void method739(byte arg0, int arg1) {
        class136.field2246.method476(false, arg1);
        class27.field433.method476(false, arg1);
        class179.field2819.method476(false, arg1);
        if (arg0 == -25) {
            class121.field1966.method476(false, arg1);
            ++field1659;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "([BIZ)Ljava/lang/Object;")
    public static final Object method740(byte[] arg0, int arg1, boolean arg2) {
        ++field1658;
        if (arg0 == null) {
            return null;
        } else {
            if (~arg0.length < -137 && !class152.field2458) {
                try {
                    class63 var3 = (class63) Class.forName("fl").newInstance();
                    var3.method448(arg0, true);
                    return var3;
                } catch (Throwable var4) {
                    class152.field2458 = true;
                }
            }
            if (arg1 != 0) {
                return null;
            } else {
                return arg2 ? class146.method996(arg1 + -17507, arg0) : arg0;
            }
        }
    }

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "(B)I")
    public static final int method741(byte arg0) {
        ++field1664;
        if (arg0 != -93) {
            field1665 = null;
        }
        return 6;
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(BI)Z")
    public static final boolean method742(byte arg0, int arg1) {
        ++field1656;
        if (arg1 >= 0 && ~class132.field2102.length < ~arg1) {
            if (arg0 != 70) {
                method745((byte) -48, -111, -65, (class238) null, 32, 89, (class36) null);
            }
            return class132.field2102[arg1];
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IZ)V")
    public static final void method743(int arg0, boolean arg1) {
        if (arg0 != -337312853) {
            method741((byte) 50);
        }
        ++field1662;
        if (class176.field2782 == !arg1) {
            class176.field2782 = arg1;
            class204.method1406(0);
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lqh;Lqh;I)V")
    public static final void method744(class201 arg0, class201 arg1, int arg2) {
        class91.field1502 = arg0;
        ++field1657;
        int var3 = -84 % ((arg2 - -12) / 53);
        class193.field3101 = arg1;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IB)[[I")
    public final int[][] method65(int arg0, byte arg1) {
        ++field1668;
        int[][] var3 = super.field93.method248(arg0, 17416);
        if (super.field93.field470) {
            int[][] var4 = this.method60(arg0, 0, 104);
            int[][] var5 = this.method60(arg0, 1, 92);
            int[] var6 = var3[1];
            int[] var7 = var3[0];
            int[] var8 = var3[2];
            int[] var9 = var4[1];
            int[] var10 = var4[0];
            int[] var11 = var5[0];
            int[] var12 = var4[2];
            int[] var13 = var5[1];
            int[] var14 = var5[2];
            int var15 = this.field1652;
            if (~var15 != -2) {
                if (var15 != 2) {
                    if (~var15 != -4) {
                        if (var15 != 4) {
                            if (~var15 != -6) {
                                if (~var15 != -7) {
                                    if (var15 != 7) {
                                        if (~var15 != -9) {
                                            if (~var15 != -10) {
                                                if (~var15 != -11) {
                                                    if (~var15 != -12) {
                                                        if (~var15 == -13) {
                                                            for (int var16 = 0; ~var16 > ~class231.field3798; ++var16) {
                                                                int var17 = var14[var16];
                                                                int var18 = var10[var16];
                                                                int var19 = var13[var16];
                                                                int var20 = var9[var16];
                                                                int var21 = var11[var16];
                                                                int var22 = var12[var16];
                                                                var7[var16] = var18 - (var18 * var21 >> 11) + var21;
                                                                var6[var16] = var20 - -var19 + -(var19 * var20 >> 11);
                                                                var8[var16] = var17 + var22 + -(var17 * var22 >> 11);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var23 = 0; var23 < class231.field3798; ++var23) {
                                                            int var24 = var10[var23];
                                                            int var25 = var9[var23];
                                                            int var26 = var13[var23];
                                                            int var27 = var11[var23];
                                                            int var28 = var14[var23];
                                                            int var29 = var12[var23];
                                                            var7[var23] = ~var24 < ~var27 ? -var27 + var24 : var27 - var24;
                                                            var6[var23] = ~var26 > ~var25 ? -var26 + var25 : var26 - var25;
                                                            var8[var23] = var28 < var29 ? -var28 + var29 : var28 - var29;
                                                        }
                                                    }
                                                } else {
                                                    for (int var30 = 0; class231.field3798 > var30; ++var30) {
                                                        int var31 = var9[var30];
                                                        int var32 = var12[var30];
                                                        int var33 = var11[var30];
                                                        int var34 = var14[var30];
                                                        int var35 = var13[var30];
                                                        int var36 = var10[var30];
                                                        var7[var30] = ~var33 <= ~var36 ? var33 : var36;
                                                        var6[var30] = ~var35 <= ~var31 ? var35 : var31;
                                                        var8[var30] = var32 > var34 ? var32 : var34;
                                                    }
                                                }
                                            } else {
                                                for (int var37 = 0; ~var37 > ~class231.field3798; ++var37) {
                                                    int var38 = var9[var37];
                                                    int var39 = var14[var37];
                                                    int var40 = var12[var37];
                                                    int var41 = var10[var37];
                                                    int var42 = var11[var37];
                                                    int var43 = var13[var37];
                                                    var7[var37] = ~var41 > ~var42 ? var41 : var42;
                                                    var6[var37] = ~var38 <= ~var43 ? var43 : var38;
                                                    var8[var37] = var40 < var39 ? var40 : var39;
                                                }
                                            }
                                        } else {
                                            for (int var44 = 0; class231.field3798 > var44; ++var44) {
                                                int var45 = var10[var44];
                                                int var46 = var12[var44];
                                                int var47 = var9[var44];
                                                var7[var44] = ~var45 == -1 ? 0 : -((-var11[var44] + 4096 << 12) / var45) + 4096;
                                                var6[var44] = ~var47 == -1 ? 0 : -((-var13[var44] + 4096 << 12) / var47) + 4096;
                                                var8[var44] = ~var46 == -1 ? 0 : 4096 - (-var14[var44] + 4096 << 12) / var46;
                                            }
                                        }
                                    } else {
                                        for (int var48 = 0; var48 < class231.field3798; ++var48) {
                                            int var49 = var10[var48];
                                            int var50 = var12[var48];
                                            int var51 = var9[var48];
                                            var7[var48] = var49 == 4096 ? 4096 : (var11[var48] << 12) / (-var49 + 4096);
                                            var6[var48] = var51 != 4096 ? (var13[var48] << 12) / (-var51 + 4096) : 4096;
                                            var8[var48] = var50 == 4096 ? 4096 : (var14[var48] << 12) / (-var50 + 4096);
                                        }
                                    }
                                } else {
                                    for (int var52 = 0; ~class231.field3798 < ~var52; ++var52) {
                                        int var53 = var11[var52];
                                        int var54 = var14[var52];
                                        int var55 = var13[var52];
                                        var7[var52] = ~var53 > -2049 ? var10[var52] * var53 >> 11 : -((-var10[var52] + 4096) * (-var53 + 4096) >> 11) + 4096;
                                        var6[var52] = ~var55 > -2049 ? var9[var52] * var55 >> 11 : -((-var9[var52] + 4096) * (-var55 + 4096) >> 11) + 4096;
                                        var8[var52] = var54 < 2048 ? var12[var52] * var54 >> 11 : 4096 - ((4096 - var12[var52]) * (-var54 + 4096) >> 11);
                                    }
                                }
                            } else {
                                for (int var56 = 0; var56 < class231.field3798; ++var56) {
                                    var7[var56] = -((-var10[var56] + 4096) * (-var11[var56] + 4096) >> 12) + 4096;
                                    var6[var56] = 4096 - ((4096 - var13[var56]) * (-var9[var56] + 4096) >> 12);
                                    var8[var56] = 4096 - ((4096 - var12[var56]) * (-var14[var56] + 4096) >> 12);
                                }
                            }
                        } else {
                            for (int var57 = 0; ~var57 > ~class231.field3798; ++var57) {
                                int var58 = var13[var57];
                                int var59 = var11[var57];
                                int var60 = var14[var57];
                                var7[var57] = ~var59 == -1 ? 4096 : (var10[var57] << 12) / var59;
                                var6[var57] = var58 == 0 ? 4096 : (var9[var57] << 12) / var58;
                                var8[var57] = ~var60 == -1 ? 4096 : (var12[var57] << 12) / var60;
                            }
                        }
                    } else {
                        for (int var61 = 0; class231.field3798 > var61; ++var61) {
                            var7[var61] = var10[var61] * var11[var61] >> 12;
                            var6[var61] = var9[var61] * var13[var61] >> 12;
                            var8[var61] = var12[var61] * var14[var61] >> 12;
                        }
                    }
                } else {
                    for (int var62 = 0; var62 < class231.field3798; ++var62) {
                        var7[var62] = var10[var62] - var11[var62];
                        var6[var62] = var9[var62] + -var13[var62];
                        var8[var62] = var12[var62] + -var14[var62];
                    }
                }
            } else {
                for (int var63 = 0; class231.field3798 > var63; ++var63) {
                    var7[var63] = var10[var63] + var11[var63];
                    var6[var63] = var9[var63] - -var13[var63];
                    var8[var63] = var12[var63] + var14[var63];
                }
            }
        }
        int var64 = -100 / ((arg1 - -48) / 46);
        return var3;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(BIILd;IILf;)V")
    public static final void method745(byte arg0, int arg1, int arg2, class238 arg3, int arg4, int arg5, class36 arg6) {
        ++field1655;
        if (arg3 != null) {
            int var7 = 2047 & class122.field1985 + class120.field1956;
            int var8 = Math.max(arg6.field642 / 2, arg6.field676 / 2) + 10;
            if (arg0 != -2) {
                field1661 = -56;
            }
            int var9 = arg2 * arg2 + arg5 * arg5;
            if (~(var8 * var8) <= ~var9) {
                int var10 = class69.field1147[var7];
                int var11 = var10 * 256 / (class87.field1385 + 256);
                int var12 = class69.field1137[var7];
                int var13 = var12 * 256 / (class87.field1385 + 256);
                int var14 = arg5 * var13 + -(arg2 * var11) >> 16;
                int var15 = arg2 * var13 + arg5 * var11 >> 16;
                ((class37) arg3).method313(arg6.field642 / 2 - -var15 + -(arg3.field3867 / 2) + arg4, arg6.field676 / 2 + arg1 + -(arg3.field3871 / 2) + -var14, arg6.field681, arg6.field553);
            }
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IZIZZIII)Ld;")
    public static final class238 method746(int arg0, boolean arg1, int arg2, boolean arg3, boolean arg4, int arg5, int arg6, int arg7) {
        class12 var8 = class83.method595(arg6, -72);
        ++field1663;
        if (~arg7 < -2 && var8.field173 != null) {
            int var9 = -1;
            for (int var10 = 0; var10 < 10; ++var10) {
                if (arg7 >= var8.field191[var10] && var8.field191[var10] != 0) {
                    var9 = var8.field173[var10];
                }
            }
            if (var9 != -1) {
                var8 = class83.method595(var9, arg5 + -107);
            }
        }
        class187 var11 = var8.method104(true);
        if (var11 == null) {
            return null;
        } else {
            class37 var12 = null;
            if (var8.field206 != -1) {
                var12 = (class37) method746(1, false, 0, true, true, 0, var8.field232, 10);
                if (var12 == null) {
                    return null;
                }
            } else if (~var8.field186 != 0) {
                var12 = (class37) method746(arg0, false, arg2, false, true, 0, var8.field197, arg7);
                if (var12 == null) {
                    return null;
                }
            }
            int var13 = class2.field36;
            int[] var14 = class2.field34;
            int var15 = class2.field35;
            int[] var16 = new int[4];
            class2.method31(var16);
            class37 var17 = new class37(36, 32);
            class2.method15(var17.field723, 36, 32);
            class69.method485();
            class69.method502(16, 16);
            class69.field1136 = false;
            int var18 = var8.field200;
            if (!arg3) {
                if (arg0 == 2) {
                    var18 = (int) ((double) var18 * 1.04D);
                }
            } else {
                var18 = (int) ((double) var18 * 1.5D);
            }
            int var19 = class69.field1147[var8.field216] * var18 >> 16;
            int var20 = class69.field1137[var8.field216] * var18 >> 16;
            var11.method569(arg5, var8.field178, var8.field184, var8.field216, var8.field202, var19 + -(var11.method119() / 2) - -var8.field161, var8.field161 + var20, -1L);
            if (~arg0 <= -2) {
                var17.method334(1);
                if (~arg0 <= -3) {
                    var17.method334(16777215);
                }
                class2.method15(var17.field723, 36, 32);
            }
            if (arg2 != 0) {
                var17.method330(arg2);
            }
            if (var8.field206 != -1) {
                var12.method332(0, 0);
            } else if (~var8.field186 != 0) {
                class2.method15(var12.field723, 36, 32);
                var17.method332(0, 0);
                var17 = var12;
            }
            if (arg1 && (~var8.field223 == -2 || ~arg7 != -2) && arg7 != -1) {
                class210.field3436.method1811(class92.method697(arg7, true), 0, 9, 16776960, 1);
            }
            class2.method15(var14, var13, var15);
            class2.method17(var16);
            class69.method485();
            class69.field1136 = true;
            return var17;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(BLog;I)V")
    public final void method64(byte arg0, class221 arg1, int arg2) {
        if (arg0 < 62) {
            field1653 = null;
        }
        if (arg2 != 0) {
            if (~arg2 == -2) {
                super.field115 = arg1.method1517((byte) -96) == 1;
            }
        } else {
            this.field1652 = arg1.method1517((byte) -96);
        }
        ++field1666;
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(IZ)V")
    public static final void method747(int arg0, boolean arg1) {
        ++field1660;
        if (~arg0 <= -1) {
            int var2 = class253.field4035[arg0];
            int var3 = class200.field3190[arg0];
            int var4 = class279.field4427[arg0];
            int var5 = (int) class214.field3506[arg0];
            if (var4 >= 2000) {
                var4 -= 2000;
            }
            long var6 = class214.field3506[arg0];
            if (var4 == 18) {
                boolean var8 = true;
                class36 var9 = class64.method455(var3, 592427152);
                if (var9.field570 > 0) {
                    var8 = class7.method51(887, var9);
                }
                if (var8) {
                    ++class110.field1825;
                    class68.field1113.method534((byte) 33, 107);
                    class68.field1113.method1529((byte) 117, var3);
                }
            }
            if (~var4 == -14 && class262.method1784(var6, var3, 2, var2)) {
                ++class281.field4456;
                class68.field1113.method534((byte) 124, 90);
                class68.field1113.method1514((int) (var6 >>> 32) & Integer.MAX_VALUE, (byte) -112);
                class68.field1113.method1559((byte) 118, class214.field3501 + var3);
                class68.field1113.method1529((byte) 122, class86.field1375);
                class68.field1113.method1554(class22.field384, (byte) 89);
                class68.field1113.method1559((byte) 118, class50.field884 + var2);
                class68.field1113.method1559((byte) 118, class45.field823);
            }
            if (var4 == 28) {
                class33 var10 = class35.field548[var5];
                if (var10 != null) {
                    class85.method621(class167.field2655.field3340[0], class167.field2655.field3321[0], 1, var10.field3321[0], 1, 2, 0, 11027, 0, 0, false, var10.field3340[0]);
                    ++class24.field396;
                    class184.field2903 = class235.field3829;
                    class41.field771 = class248.field3953;
                    class39.field732 = 0;
                    class252.field4019 = 2;
                    class68.field1113.method534((byte) 79, 37);
                    class68.field1113.method1559((byte) 118, var5);
                    class68.field1113.method1529((byte) 127, class253.field4032);
                    class68.field1113.method1514(class281.field4452, (byte) -84);
                }
            }
            if (~var4 == -31) {
                class33 var11 = class35.field548[var5];
                if (var11 != null) {
                    class85.method621(class167.field2655.field3340[0], class167.field2655.field3321[0], 1, var11.field3321[0], 1, 2, 0, 11027, 0, 0, false, var11.field3340[0]);
                    ++class170.field2699;
                    class184.field2903 = class235.field3829;
                    class41.field771 = class248.field3953;
                    class39.field732 = 0;
                    class252.field4019 = 2;
                    class68.field1113.method534((byte) -113, 43);
                    class68.field1113.method1559((byte) 118, var5);
                }
            }
            if (~var4 == -1002) {
                class36 var12 = class64.method455(var3, 592427152);
                if (var12 != null && var12.field714[var2] >= 100000) {
                    class226.method1588("", 0, (byte) -78, var12.field714[var2] + " x " + class83.method595(var5, -104).field174);
                } else {
                    ++class214.field3505;
                    class68.field1113.method534((byte) -97, 64);
                    class68.field1113.method1554(var5, (byte) 89);
                }
                class34.field539 = 0;
                class201.field3231 = class64.method455(var3, 592427152);
                class188.field3048 = var2;
            }
            if (var4 == 19) {
                class68.field1113.method534((byte) 39, 107);
                class68.field1113.method1529((byte) 126, var3);
                class36 var13 = class64.method455(var3, 592427152);
                ++class110.field1825;
                if (var13.field721 != null && var13.field721[0][0] == 5) {
                    int var14 = var13.field721[0][1];
                    if (class82.field1289[var14] != var13.field572[0]) {
                        class82.field1289[var14] = var13.field572[0];
                        class111.method813(var14, 118);
                    }
                }
            }
            if (~var4 == -47) {
                class33 var15 = class35.field548[var5];
                if (var15 != null) {
                    class85.method621(class167.field2655.field3340[0], class167.field2655.field3321[0], 1, var15.field3321[0], 1, 2, 0, 11027, 0, 0, false, var15.field3340[0]);
                    class39.field732 = 0;
                    class252.field4019 = 2;
                    ++class198.field3160;
                    class184.field2903 = class235.field3829;
                    class41.field771 = class248.field3953;
                    class68.field1113.method534((byte) -100, 167);
                    class68.field1113.method1559((byte) 118, var5);
                }
            }
            if (var4 == 40) {
                ++class156.field2538;
                boolean var16 = class85.method621(class167.field2655.field3340[0], class167.field2655.field3321[0], 0, var3, 0, 2, 0, 11027, 0, 0, false, var2);
                if (!var16) {
                    class85.method621(class167.field2655.field3340[0], class167.field2655.field3321[0], 1, var3, 1, 2, 0, 11027, 0, 0, false, var2);
                }
                class252.field4019 = 2;
                class39.field732 = 0;
                class41.field771 = class248.field3953;
                class184.field2903 = class235.field3829;
                class68.field1113.method534((byte) -124, 220);
                class68.field1113.method1546(class86.field1375, (byte) -125);
                class68.field1113.method1554(class45.field823, (byte) 89);
                class68.field1113.method1514(class214.field3501 + var3, (byte) -110);
                class68.field1113.method1554(class50.field884 + var2, (byte) 89);
                class68.field1113.method1547(class22.field384, (byte) 58);
                class68.field1113.method1514(var5, (byte) -120);
            }
            if (~var4 == -60) {
                class15 var18 = class137.field2260[var5];
                if (var18 != null) {
                    ++class162.field2580;
                    class85.method621(class167.field2655.field3340[0], class167.field2655.field3321[0], 1, var18.field3321[0], 1, 2, 0, 11027, 0, 0, false, var18.field3340[0]);
                    class39.field732 = 0;
                    class252.field4019 = 2;
                    class184.field2903 = class235.field3829;
                    class41.field771 = class248.field3953;
                    class68.field1113.method534((byte) -128, 164);
                    class68.field1113.method1529((byte) 123, class253.field4032);
                    class68.field1113.method1547(var5, (byte) 58);
                    class68.field1113.method1559((byte) 118, class281.field4452);
                }
            }
            if (var4 == 24) {
                class68.field1113.method534((byte) 37, 195);
                class68.field1113.method1547(var5, (byte) 58);
                ++class273.field4325;
                class68.field1113.method1504((byte) 113, var3);
                class68.field1113.method1554(var2, (byte) 89);
                class34.field539 = 0;
                class201.field3231 = class64.method455(var3, 592427152);
                class188.field3048 = var2;
            }
            if (~var4 == -24) {
                ++class181.field2840;
                class68.field1113.method534((byte) -128, 201);
                class68.field1113.method1504((byte) -118, var3);
                class68.field1113.method1554(var5, (byte) 89);
                class68.field1113.method1547(var2, (byte) 58);
                class34.field539 = 0;
                class201.field3231 = class64.method455(var3, 592427152);
                class188.field3048 = var2;
            }
            if (var4 == 1) {
                ++class225.field3720;
                class68.field1113.method534((byte) 67, 148);
                class68.field1113.method1547(var2, (byte) 58);
                class68.field1113.method1554(var5, (byte) 89);
                class68.field1113.method1557(var3, (byte) -92);
                class34.field539 = 0;
                class201.field3231 = class64.method455(var3, 592427152);
                class188.field3048 = var2;
            }
            if (~var4 == -33) {
                class262.method1784(var6, var3, 2, var2);
                ++class42.field784;
                class68.field1113.method534((byte) -108, 30);
                class68.field1113.method1547(class214.field3501 + var3, (byte) 58);
                class68.field1113.method1554(var2 - -class50.field884, (byte) 89);
                class68.field1113.method1514(Integer.MAX_VALUE & (int) (var6 >>> 32), (byte) -121);
            }
            if (var4 == 4) {
                ++class217.field3541;
                if (~class111.field1837 == -2) {
                    class85.method621(class167.field2655.field3340[0], class167.field2655.field3321[0], 1, var3, 1, 2, 0, 11027, 0, 0, false, var2);
                } else {
                    boolean var19 = class85.method621(class167.field2655.field3340[0], class167.field2655.field3321[0], 0, var3, 0, 2, 0, 11027, 0, 0, false, var2);
                    if (!var19) {
                        class85.method621(class167.field2655.field3340[0], class167.field2655.field3321[0], 1, var3, 1, 2, 0, 11027, 0, 0, false, var2);
                    }
                }
                class184.field2903 = class235.field3829;
                class252.field4019 = 2;
                class41.field771 = class248.field3953;
                class39.field732 = 0;
                class68.field1113.method534((byte) -108, 252);
                class68.field1113.method1554(class50.field884 + var2, (byte) 89);
                class68.field1113.method1559((byte) 118, var5);
                class68.field1113.method1559((byte) 118, class214.field3501 + var3);
            }
            if (~var4 == -48) {
                class273.method1845((byte) -115);
            }
            if (~var4 == -49) {
                class262.method1784(var6, var3, 2, var2);
                class68.field1113.method534((byte) 123, 168);
                class68.field1113.method1559((byte) 118, class214.field3501 + var3);
                class68.field1113.method1547(class50.field884 + var2, (byte) 58);
                ++class122.field1978;
                class68.field1113.method1559((byte) 118, Integer.MAX_VALUE & (int) (var6 >>> 32));
            }
            if (var4 == 21) {
                class15 var21 = class137.field2260[var5];
                if (var21 != null) {
                    class85.method621(class167.field2655.field3340[0], class167.field2655.field3321[0], 1, var21.field3321[0], 1, 2, 0, 11027, 0, 0, false, var21.field3340[0]);
                    class184.field2903 = class235.field3829;
                    ++class109.field1804;
                    class252.field4019 = 2;
                    class41.field771 = class248.field3953;
                    class39.field732 = 0;
                    class68.field1113.method534((byte) -95, 114);
                    class68.field1113.method1554(var5, (byte) 89);
                }
            }
            if (var4 == 20) {
                if (var5 == 0) {
                    class43.field791 = 1;
                    class158.method1103(class250.field3980, var2, var3);
                } else if (class144.field2313 > 0 && class73.field1193[82] && class73.field1193[81]) {
                    class241.method1666(class214.field3501 - -var3, class250.field3980, class50.field884 + var2, -2358);
                } else {
                    class68.field1113.method534((byte) 63, 153);
                    ++class143.field2303;
                    class68.field1113.method1559((byte) 118, class214.field3501 + var3);
                    class68.field1113.method1514(class50.field884 - -var2, (byte) -90);
                }
            }
            if (var4 == 39) {
                class33 var22 = class35.field548[var5];
                if (var22 != null) {
                    class85.method621(class167.field2655.field3340[0], class167.field2655.field3321[0], 1, var22.field3321[0], 1, 2, 0, 11027, 0, 0, false, var22.field3340[0]);
                    class39.field732 = 0;
                    ++class100.field1650;
                    class252.field4019 = 2;
                    class184.field2903 = class235.field3829;
                    class41.field771 = class248.field3953;
                    class68.field1113.method534((byte) -119, 247);
                    class68.field1113.method1547(var5, (byte) 58);
                }
            }
            if (~var4 == -42) {
                ++class158.field2557;
                class68.field1113.method534((byte) -105, 6);
                class68.field1113.method1554(var5, (byte) 89);
                class68.field1113.method1546(var3, (byte) 122);
                class68.field1113.method1514(var2, (byte) -128);
                class34.field539 = 0;
                class201.field3231 = class64.method455(var3, 592427152);
                class188.field3048 = var2;
            }
            if (var4 == 14) {
                ++class255.field4053;
                if (~class111.field1837 != -2) {
                    boolean var23 = class85.method621(class167.field2655.field3340[0], class167.field2655.field3321[0], 0, var3, 0, 2, 0, 11027, 0, 0, false, var2);
                    if (!var23) {
                        class85.method621(class167.field2655.field3340[0], class167.field2655.field3321[0], 1, var3, 1, 2, 0, 11027, 0, 0, false, var2);
                    }
                } else {
                    class85.method621(class167.field2655.field3340[0], class167.field2655.field3321[0], 1, var3, 1, 2, 0, 11027, 0, 0, false, var2);
                }
                class39.field732 = 0;
                class252.field4019 = 2;
                class41.field771 = class248.field3953;
                class184.field2903 = class235.field3829;
                class68.field1113.method534((byte) -119, 246);
                class68.field1113.method1547(var2 - -class50.field884, (byte) 58);
                class68.field1113.method1559((byte) 118, var3 - -class214.field3501);
                class68.field1113.method1554(var5, (byte) 89);
            }
            if (var4 == 2) {
                class262.method1784(var6, var3, 2, var2);
                ++class6.field71;
                class68.field1113.method534((byte) 38, 237);
                class68.field1113.method1554((int) (var6 >>> 32) & Integer.MAX_VALUE, (byte) 89);
                class68.field1113.method1554(class214.field3501 + var3, (byte) 89);
                class68.field1113.method1547(class50.field884 + var2, (byte) 58);
            }
            if (~var4 == -1005) {
                ++class214.field3505;
                class184.field2903 = class235.field3829;
                class41.field771 = class248.field3953;
                class39.field732 = 0;
                class252.field4019 = 2;
                class68.field1113.method534((byte) 22, 64);
                class68.field1113.method1554(var5, (byte) 89);
            }
            if (~var4 == -35) {
                class33 var25 = class35.field548[var5];
                if (var25 != null) {
                    class85.method621(class167.field2655.field3340[0], class167.field2655.field3321[0], 1, var25.field3321[0], 1, 2, 0, 11027, 0, 0, false, var25.field3340[0]);
                    ++class19.field321;
                    class41.field771 = class248.field3953;
                    class252.field4019 = 2;
                    class184.field2903 = class235.field3829;
                    class39.field732 = 0;
                    class68.field1113.method534((byte) 75, 96);
                    class68.field1113.method1559((byte) 118, var5);
                }
            }
            if (~var4 == -17 && class262.method1784(var6, var3, 2, var2)) {
                ++class206.field3303;
                class68.field1113.method534((byte) 122, 173);
                class68.field1113.method1554((int) (var6 >>> 32) & Integer.MAX_VALUE, (byte) 89);
                class68.field1113.method1554(class214.field3501 + var3, (byte) 89);
                class68.field1113.method1504((byte) 115, class253.field4032);
                class68.field1113.method1514(class281.field4452, (byte) -125);
                class68.field1113.method1554(var2 - -class50.field884, (byte) 89);
            }
            if (var4 == 35) {
                class33 var26 = class35.field548[var5];
                if (var26 != null) {
                    ++class54.field922;
                    class85.method621(class167.field2655.field3340[0], class167.field2655.field3321[0], 1, var26.field3321[0], 1, 2, 0, 11027, 0, 0, false, var26.field3340[0]);
                    class39.field732 = 0;
                    class252.field4019 = 2;
                    class184.field2903 = class235.field3829;
                    class41.field771 = class248.field3953;
                    class68.field1113.method534((byte) -103, 189);
                    class68.field1113.method1554(var5, (byte) 89);
                }
            }
            if (~var4 == -58) {
                ++class247.field3940;
                class68.field1113.method534((byte) 28, 5);
                class68.field1113.method1514(var2, (byte) -125);
                class68.field1113.method1546(var3, (byte) 17);
                class68.field1113.method1546(class253.field4032, (byte) -16);
                class68.field1113.method1547(class281.field4452, (byte) 58);
                class68.field1113.method1514(var5, (byte) -86);
                class34.field539 = 0;
                class201.field3231 = class64.method455(var3, 592427152);
                class188.field3048 = var2;
            }
            if (~var4 == -39) {
                class15 var27 = class137.field2260[var5];
                if (var27 != null) {
                    class85.method621(class167.field2655.field3340[0], class167.field2655.field3321[0], 1, var27.field3321[0], 1, 2, 0, 11027, 0, 0, false, var27.field3340[0]);
                    ++class5.field61;
                    class41.field771 = class248.field3953;
                    class184.field2903 = class235.field3829;
                    class39.field732 = 0;
                    class252.field4019 = 2;
                    class68.field1113.method534((byte) 115, 154);
                    class68.field1113.method1547(var5, (byte) 58);
                    class68.field1113.method1514(class45.field823, (byte) -127);
                    class68.field1113.method1557(class86.field1375, (byte) -92);
                    class68.field1113.method1514(class22.field384, (byte) -80);
                }
            }
            if (var4 == 33) {
                ++class17.field289;
                boolean var28 = class85.method621(class167.field2655.field3340[0], class167.field2655.field3321[0], 0, var3, 0, 2, 0, 11027, 0, 0, false, var2);
                if (!var28) {
                    class85.method621(class167.field2655.field3340[0], class167.field2655.field3321[0], 1, var3, 1, 2, 0, 11027, 0, 0, false, var2);
                }
                class252.field4019 = 2;
                class184.field2903 = class235.field3829;
                class41.field771 = class248.field3953;
                class39.field732 = 0;
                class68.field1113.method534((byte) 83, 181);
                class68.field1113.method1554(class281.field4452, (byte) 89);
                class68.field1113.method1547(class50.field884 + var2, (byte) 58);
                class68.field1113.method1547(var5, (byte) 58);
                class68.field1113.method1529((byte) 125, class253.field4032);
                class68.field1113.method1514(var3 - -class214.field3501, (byte) -111);
            }
            if (~var4 == -45) {
                class33 var30 = class35.field548[var5];
                if (var30 != null) {
                    ++class13.field238;
                    class85.method621(class167.field2655.field3340[0], class167.field2655.field3321[0], 1, var30.field3321[0], 1, 2, 0, 11027, 0, 0, false, var30.field3340[0]);
                    class184.field2903 = class235.field3829;
                    class39.field732 = 0;
                    class252.field4019 = 2;
                    class41.field771 = class248.field3953;
                    class68.field1113.method534((byte) -109, 60);
                    class68.field1113.method1547(var5, (byte) 58);
                }
            }
            if (~var4 == -52) {
                class33 var31 = class35.field548[var5];
                if (var31 != null) {
                    class85.method621(class167.field2655.field3340[0], class167.field2655.field3321[0], 1, var31.field3321[0], 1, 2, 0, 11027, 0, 0, false, var31.field3340[0]);
                    ++class264.field4210;
                    class41.field771 = class248.field3953;
                    class39.field732 = 0;
                    class184.field2903 = class235.field3829;
                    class252.field4019 = 2;
                    class68.field1113.method534((byte) 121, 193);
                    class68.field1113.method1559((byte) 118, var5);
                    class68.field1113.method1554(class45.field823, (byte) 89);
                    class68.field1113.method1504((byte) 106, class86.field1375);
                    class68.field1113.method1559((byte) 118, class22.field384);
                }
            }
            if (var4 == 3) {
                class262.method1784(var6, var3, 2, var2);
                class68.field1113.method534((byte) -101, 122);
                class68.field1113.method1559((byte) 118, (int) (var6 >>> 32) & Integer.MAX_VALUE);
                ++class143.field2304;
                class68.field1113.method1554(class214.field3501 + var3, (byte) 89);
                class68.field1113.method1514(var2 - -class50.field884, (byte) -99);
            }
            if (~var4 == -16) {
                class86.method627((byte) -41);
                class36 var32 = class64.method455(var3, 592427152);
                class22.field384 = var5;
                class86.field1375 = var3;
                class45.field823 = var2;
                class51.field894 = 1;
                class280.method1886(var32, 32);
                class197.field3152 = "<col=ff9040>" + class83.method595(var5, -123).field174 + "<col=ffffff>";
                if (class197.field3152 == null) {
                    class197.field3152 = "null";
                }
            } else {
                if (var4 == 8) {
                    class15 var33 = class137.field2260[var5];
                    if (var33 != null) {
                        ++class282.field4471;
                        class85.method621(class167.field2655.field3340[0], class167.field2655.field3321[0], 1, var33.field3321[0], 1, 2, 0, 11027, 0, 0, false, var33.field3340[0]);
                        class252.field4019 = 2;
                        class184.field2903 = class235.field3829;
                        class39.field732 = 0;
                        class41.field771 = class248.field3953;
                        class68.field1113.method534((byte) -108, 255);
                        class68.field1113.method1559((byte) 118, var5);
                    }
                }
                if (var4 == 5) {
                    ++class221.field3634;
                    if (class111.field1837 != 1) {
                        boolean var34 = class85.method621(class167.field2655.field3340[0], class167.field2655.field3321[0], 0, var3, 0, 2, 0, 11027, 0, 0, false, var2);
                        if (!var34) {
                            class85.method621(class167.field2655.field3340[0], class167.field2655.field3321[0], 1, var3, 1, 2, 0, 11027, 0, 0, false, var2);
                        }
                    } else {
                        class85.method621(class167.field2655.field3340[0], class167.field2655.field3321[0], 1, var3, 1, 2, 0, 11027, 0, 0, false, var2);
                    }
                    class184.field2903 = class235.field3829;
                    class39.field732 = 0;
                    class252.field4019 = 2;
                    class41.field771 = class248.field3953;
                    class68.field1113.method534((byte) 97, 11);
                    class68.field1113.method1514(var3 - -class214.field3501, (byte) -84);
                    class68.field1113.method1547(var5, (byte) 58);
                    class68.field1113.method1514(var2 - -class50.field884, (byte) -90);
                }
                if (~var4 == -30) {
                    ++class259.field4115;
                    class68.field1113.method534((byte) 21, 57);
                    class68.field1113.method1546(var3, (byte) 35);
                    class68.field1113.method1547(var2, (byte) 58);
                    class68.field1113.method1514(var5, (byte) -84);
                    class34.field539 = 0;
                    class201.field3231 = class64.method455(var3, 592427152);
                    class188.field3048 = var2;
                }
                if (var4 == 1006) {
                    class262.method1784(var6, var3, 2, var2);
                    ++class137.field2259;
                    class68.field1113.method534((byte) -117, 110);
                    class68.field1113.method1559((byte) 118, class50.field884 + var2);
                    class68.field1113.method1547((int) (var6 >>> 32) & Integer.MAX_VALUE, (byte) 58);
                    class68.field1113.method1547(class214.field3501 + var3, (byte) 58);
                }
                if (var4 == 49) {
                    ++class176.field2774;
                    if (class111.field1837 != 1) {
                        boolean var36 = class85.method621(class167.field2655.field3340[0], class167.field2655.field3321[0], 0, var3, 0, 2, 0, 11027, 0, 0, false, var2);
                        if (!var36) {
                            class85.method621(class167.field2655.field3340[0], class167.field2655.field3321[0], 1, var3, 1, 2, 0, 11027, 0, 0, false, var2);
                        }
                    } else {
                        class85.method621(class167.field2655.field3340[0], class167.field2655.field3321[0], 1, var3, 1, 2, 0, 11027, 0, 0, false, var2);
                    }
                    class252.field4019 = 2;
                    class184.field2903 = class235.field3829;
                    class41.field771 = class248.field3953;
                    class39.field732 = 0;
                    class68.field1113.method534((byte) 86, 214);
                    class68.field1113.method1554(class214.field3501 + var3, (byte) 89);
                    class68.field1113.method1514(var5, (byte) -89);
                    class68.field1113.method1514(class50.field884 + var2, (byte) -112);
                }
                if (var4 == 1003) {
                    class41.field771 = class248.field3953;
                    class184.field2903 = class235.field3829;
                    class39.field732 = 0;
                    class252.field4019 = 2;
                    class15 var38 = class137.field2260[var5];
                    if (var38 != null) {
                        class107 var39 = var38.field258;
                        if (var39.field1716 != null) {
                            var39 = var39.method775(!arg1);
                        }
                        if (var39 != null) {
                            ++class138.field2273;
                            class68.field1113.method534((byte) -115, 67);
                            class68.field1113.method1547(var39.field1724, (byte) 58);
                        }
                    }
                }
                if (var4 == 26) {
                    if (~var5 != -1) {
                        if (var5 == 1) {
                            class68.field1113.method534((byte) 23, 187);
                            class68.field1113.method1547(class214.field3501 + var3, (byte) 58);
                            class68.field1113.method1514(class50.field884 + var2, (byte) -116);
                            ++class145.field2325;
                            class68.field1113.method1557(class253.field4032, (byte) -92);
                            class68.field1113.method1554(class281.field4452, (byte) 89);
                        }
                    } else {
                        class51.field891 = 1;
                        class158.method1103(class250.field3980, var2, var3);
                    }
                }
                if (!arg1) {
                    method740((byte[]) null, 7, true);
                }
                if (var4 == 7) {
                    class15 var40 = class137.field2260[var5];
                    if (var40 != null) {
                        ++class44.field805;
                        class85.method621(class167.field2655.field3340[0], class167.field2655.field3321[0], 1, var40.field3321[0], 1, 2, 0, 11027, 0, 0, false, var40.field3340[0]);
                        class184.field2903 = class235.field3829;
                        class41.field771 = class248.field3953;
                        class252.field4019 = 2;
                        class39.field732 = 0;
                        class68.field1113.method534((byte) -96, 77);
                        class68.field1113.method1547(var5, (byte) 58);
                    }
                }
                if (~var4 == -43) {
                    class33 var41 = class35.field548[var5];
                    if (var41 != null) {
                        class85.method621(class167.field2655.field3340[0], class167.field2655.field3321[0], 1, var41.field3321[0], 1, 2, 0, 11027, 0, 0, false, var41.field3340[0]);
                        class252.field4019 = 2;
                        ++class262.field4160;
                        class41.field771 = class248.field3953;
                        class39.field732 = 0;
                        class184.field2903 = class235.field3829;
                        class68.field1113.method534((byte) -96, 245);
                        class68.field1113.method1554(var5, (byte) 89);
                    }
                }
                if (~var4 == -23) {
                    class68.field1113.method534((byte) 17, 46);
                    class68.field1113.method1529((byte) 125, var3);
                    ++class48.field860;
                    class68.field1113.method1559((byte) 118, var2);
                    class68.field1113.method1514(var5, (byte) -105);
                    class34.field539 = 0;
                    class201.field3231 = class64.method455(var3, 592427152);
                    class188.field3048 = var2;
                }
                if (~var4 == -1008) {
                    class184.field2903 = class235.field3829;
                    class39.field732 = 0;
                    class41.field771 = class248.field3953;
                    ++class262.field4149;
                    class252.field4019 = 2;
                    class68.field1113.method534((byte) -126, 129);
                    class68.field1113.method1554(var5, (byte) 89);
                }
                if (~var4 == -37 && class207.field3333 == null) {
                    class7.method52(var3, var2, -28346);
                    class207.field3333 = class230.method1612(1, var2, var3);
                    class280.method1886(class207.field3333, 32);
                }
                if (var4 == 6) {
                    class15 var42 = class137.field2260[var5];
                    if (var42 != null) {
                        ++class145.field2337;
                        class85.method621(class167.field2655.field3340[0], class167.field2655.field3321[0], 1, var42.field3321[0], 1, 2, 0, 11027, 0, 0, false, var42.field3340[0]);
                        class39.field732 = 0;
                        class252.field4019 = 2;
                        class41.field771 = class248.field3953;
                        class184.field2903 = class235.field3829;
                        class68.field1113.method534((byte) -111, 50);
                        class68.field1113.method1559((byte) 118, var5);
                    }
                }
                if (var4 == 9) {
                    class68.field1113.method534((byte) -98, 95);
                    class68.field1113.method1559((byte) 118, var5);
                    ++class177.field2788;
                    class68.field1113.method1514(var2, (byte) -94);
                    class68.field1113.method1546(var3, (byte) 52);
                    class34.field539 = 0;
                    class201.field3231 = class64.method455(var3, 592427152);
                    class188.field3048 = var2;
                }
                if (var4 == 45) {
                    ++class110.field1825;
                    class68.field1113.method534((byte) -125, 107);
                    class68.field1113.method1529((byte) 126, var3);
                    class36 var43 = class64.method455(var3, 592427152);
                    if (var43.field721 != null && ~var43.field721[0][0] == -6) {
                        int var44 = var43.field721[0][1];
                        class82.field1289[var44] = 1 - class82.field1289[var44];
                        class111.method813(var44, 121);
                    }
                }
                if (~var4 == -12) {
                    ++class224.field3712;
                    class68.field1113.method534((byte) -5, 141);
                    class68.field1113.method1529((byte) 125, class253.field4032);
                    class68.field1113.method1529((byte) 123, var3);
                    class68.field1113.method1559((byte) 118, class281.field4452);
                    class68.field1113.method1559((byte) 118, var2);
                }
                if (~var4 == -38) {
                    ++class176.field2775;
                    class68.field1113.method534((byte) 7, 103);
                    class68.field1113.method1546(var3, (byte) -106);
                    class68.field1113.method1559((byte) 118, var5);
                    class68.field1113.method1559((byte) 118, var2);
                    class34.field539 = 0;
                    class201.field3231 = class64.method455(var3, 592427152);
                    class188.field3048 = var2;
                }
                if (var4 == 17) {
                    class36 var45 = class230.method1612(1, var2, var3);
                    if (var45 != null) {
                        class86.method627((byte) -88);
                        class84 var46 = client.method1093(var45);
                        class155.method1076(var3, 1000000, var45.field682, var46.field1328, var46.method606(1596737886), var2, var45.field608);
                        class51.field894 = 0;
                        class154.field2496 = class47.method378(var45, (byte) -113);
                        if (!var45.field597) {
                            class149.field2403 = "<col=00ff00>" + var45.field590 + "<col=ffffff>";
                        } else {
                            class149.field2403 = var45.field671 + "<col=ffffff>";
                        }
                        if (class154.field2496 == null) {
                            class154.field2496 = "Null";
                        }
                    }
                } else {
                    if (var4 == 31 || var4 == 1005) {
                        class25.method226(var2, var5, false, class113.field1893[arg0], var3);
                    }
                    if (~var4 == -13) {
                        ++class199.field3172;
                        class68.field1113.method534((byte) 17, 71);
                        class68.field1113.method1547(var5, (byte) 58);
                        class68.field1113.method1557(var3, (byte) -92);
                        class68.field1113.method1514(var2, (byte) -95);
                        class34.field539 = 0;
                        class201.field3231 = class64.method455(var3, 592427152);
                        class188.field3048 = var2;
                    }
                    if (~var4 == -59) {
                        class68.field1113.method534((byte) 84, 179);
                        ++class105.field1683;
                        class68.field1113.method1514(var2, (byte) -122);
                        class68.field1113.method1546(var3, (byte) -35);
                        class68.field1113.method1514(var5, (byte) -127);
                        class34.field539 = 0;
                        class201.field3231 = class64.method455(var3, 592427152);
                        class188.field3048 = var2;
                    }
                    if (var4 == 43) {
                        ++class131.field2098;
                        if (class111.field1837 == 1) {
                            class85.method621(class167.field2655.field3340[0], class167.field2655.field3321[0], 1, var3, 1, 2, 0, 11027, 0, 0, false, var2);
                        } else {
                            boolean var47 = class85.method621(class167.field2655.field3340[0], class167.field2655.field3321[0], 0, var3, 0, 2, 0, 11027, 0, 0, false, var2);
                            if (!var47) {
                                class85.method621(class167.field2655.field3340[0], class167.field2655.field3321[0], 1, var3, 1, 2, 0, 11027, 0, 0, false, var2);
                            }
                        }
                        class184.field2903 = class235.field3829;
                        class39.field732 = 0;
                        class41.field771 = class248.field3953;
                        class252.field4019 = 2;
                        class68.field1113.method534((byte) 109, 74);
                        class68.field1113.method1559((byte) 118, var3 - -class214.field3501);
                        class68.field1113.method1554(class50.field884 + var2, (byte) 89);
                        class68.field1113.method1554(var5, (byte) 89);
                    }
                    if (~var4 == -26) {
                        class15 var49 = class137.field2260[var5];
                        if (var49 != null) {
                            class85.method621(class167.field2655.field3340[0], class167.field2655.field3321[0], 1, var49.field3321[0], 1, 2, 0, 11027, 0, 0, false, var49.field3340[0]);
                            class41.field771 = class248.field3953;
                            class184.field2903 = class235.field3829;
                            ++class56.field957;
                            class39.field732 = 0;
                            class252.field4019 = 2;
                            class68.field1113.method534((byte) 84, 236);
                            class68.field1113.method1559((byte) 118, var5);
                        }
                    }
                    if (~var4 == -51) {
                        if (var5 != 0) {
                            if (~var5 == -2) {
                                if (~class144.field2313 < -1 && class73.field1193[82] && class73.field1193[81]) {
                                    class241.method1666(class214.field3501 + var3, class250.field3980, class50.field884 + var2, -2358);
                                } else if (class85.method621(class167.field2655.field3340[0], class167.field2655.field3321[0], 0, var3, 0, 1, 0, 11027, 0, 0, true, var2)) {
                                    class68.field1113.method1548(-494964184, class245.field3926);
                                    class68.field1113.method1548(-494964184, class68.field1131);
                                    class68.field1113.method1554(class122.field1985, (byte) 89);
                                    class68.field1113.method1548(-494964184, 57);
                                    class68.field1113.method1548(-494964184, class120.field1956);
                                    class68.field1113.method1548(-494964184, class87.field1385);
                                    class68.field1113.method1548(-494964184, 89);
                                    class68.field1113.method1554(class167.field2655.field3389, (byte) 89);
                                    class68.field1113.method1554(class167.field2655.field3341, (byte) 89);
                                    class68.field1113.method1548(-494964184, class84.field1317);
                                    class68.field1113.method1548(-494964184, 63);
                                }
                            }
                        } else {
                            class158.method1103(class250.field3980, var2, var3);
                        }
                    }
                    if (var4 == 10) {
                        ++class266.field4216;
                        class68.field1113.method534((byte) -101, 81);
                        class68.field1113.method1547(class45.field823, (byte) 58);
                        class68.field1113.method1546(var3, (byte) -111);
                        class68.field1113.method1559((byte) 118, var2);
                        class68.field1113.method1554(var5, (byte) 89);
                        class68.field1113.method1559((byte) 118, class22.field384);
                        class68.field1113.method1504((byte) -75, class86.field1375);
                        class34.field539 = 0;
                        class201.field3231 = class64.method455(var3, 592427152);
                        class188.field3048 = var2;
                    }
                    if (~var4 == -61) {
                        class33 var50 = class35.field548[var5];
                        if (var50 != null) {
                            class85.method621(class167.field2655.field3340[0], class167.field2655.field3321[0], 1, var50.field3321[0], 1, 2, 0, 11027, 0, 0, false, var50.field3340[0]);
                            class41.field771 = class248.field3953;
                            ++class280.field4440;
                            class184.field2903 = class235.field3829;
                            class39.field732 = 0;
                            class252.field4019 = 2;
                            class68.field1113.method534((byte) -15, 172);
                            class68.field1113.method1514(var5, (byte) -85);
                        }
                    }
                    if (class51.field894 != 0) {
                        class51.field894 = 0;
                        class280.method1886(class64.method455(class86.field1375, 592427152), 32);
                    }
                    if (class288.field4560) {
                        class86.method627((byte) -97);
                    }
                    if (class201.field3231 != null && class34.field539 == 0) {
                        class280.method1886(class201.field3231, 32);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "(B)V")
    public static void method748(byte arg0) {
        field1665 = null;
        field1653 = null;
        int var1 = -56 % ((-72 - arg0) / 43);
    }
}
