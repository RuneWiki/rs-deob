import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public class class308 extends class210 {

    @OriginalMember(owner = "client!wm", name = "M", descriptor = "I")
    private int field4544 = 6;

    @OriginalMember(owner = "client!wm", name = "P", descriptor = "[I")
    public static int[] field4546 = new int[256];

    @OriginalMember(owner = "client!wm", name = "T", descriptor = "I")
    public static int field4550;

    @OriginalMember(owner = "client!wm", name = "W", descriptor = "Ljm;")
    public static class167 field4553;

    @OriginalMember(owner = "client!wm", name = "Y", descriptor = "[I")
    public static int[] field4555;

    @OriginalMember(owner = "client!wm", name = "I", descriptor = "I")
    public static int field4540;

    @OriginalMember(owner = "client!wm", name = "J", descriptor = "I")
    public static int field4541;

    @OriginalMember(owner = "client!wm", name = "K", descriptor = "I")
    public static int field4542;

    @OriginalMember(owner = "client!wm", name = "L", descriptor = "I")
    public static int field4543;

    @OriginalMember(owner = "client!wm", name = "N", descriptor = "I")
    public static int field4545;

    @OriginalMember(owner = "client!wm", name = "Q", descriptor = "I")
    public static int field4547;

    @OriginalMember(owner = "client!wm", name = "R", descriptor = "I")
    public static int field4548;

    @OriginalMember(owner = "client!wm", name = "S", descriptor = "I")
    public static int field4549;

    @OriginalMember(owner = "client!wm", name = "X", descriptor = "I")
    public static int field4554;

    @OriginalMember(owner = "client!wm", name = "V", descriptor = "Lct;")
    public static class104 field4552;

    @OriginalMember(owner = "client!wm", name = "U", descriptor = "Llf;")
    public static class350 field4551;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(BI)V")
    public static final void method2053(byte arg0, int arg1) {
        class84.field1030 = arg1;
        ++field4542;
        class363 var2 = class272.field4022;
        synchronized (class272.field4022) {
            int var3 = 33 / ((arg0 - 59) / 34);
            class272.field4022.method2313(98);
        }
        class363 var4 = class283.field4166;
        synchronized (class283.field4166) {
            class283.field4166.method2313(124);
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(IB)[I")
    public final int[] method361(int arg0, byte arg1) {
        ++field4543;
        if (arg1 != -38) {
            return null;
        } else {
            int[] var3 = super.field2950.method1892(arg0, (byte) -115);
            if (super.field2950.field4111) {
                int[] var4 = this.method1447(arg0, -124, 0);
                int[] var5 = this.method1447(arg0, -114, 1);
                int var6 = this.field4544;
                if (var6 != 1) {
                    if (~var6 != -3) {
                        if (~var6 != -4) {
                            if (var6 != 4) {
                                if (~var6 != -6) {
                                    if (var6 != 6) {
                                        if (var6 != 7) {
                                            if (var6 != 8) {
                                                if (~var6 != -10) {
                                                    if (var6 != 10) {
                                                        if (~var6 != -12) {
                                                            if (var6 == 12) {
                                                                for (int var7 = 0; var7 < class202.field2852; ++var7) {
                                                                    int var8 = var5[var7];
                                                                    int var9 = var4[var7];
                                                                    var3[var7] = var8 + var9 - (var8 * var9 >> 11);
                                                                }
                                                            }
                                                        } else {
                                                            for (int var10 = 0; ~class202.field2852 < ~var10; ++var10) {
                                                                int var11 = var5[var10];
                                                                int var12 = var4[var10];
                                                                var3[var10] = var11 >= var12 ? -var12 + var11 : -var11 + var12;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var13 = 0; ~class202.field2852 < ~var13; ++var13) {
                                                            int var14 = var4[var13];
                                                            int var15 = var5[var13];
                                                            var3[var13] = var14 > var15 ? var14 : var15;
                                                        }
                                                    }
                                                } else {
                                                    for (int var16 = 0; class202.field2852 > var16; ++var16) {
                                                        int var17 = var5[var16];
                                                        int var18 = var4[var16];
                                                        var3[var16] = var17 <= var18 ? var17 : var18;
                                                    }
                                                }
                                            } else {
                                                for (int var19 = 0; var19 < class202.field2852; ++var19) {
                                                    int var20 = var4[var19];
                                                    var3[var19] = var20 != 0 ? 4096 - (-var5[var19] + 4096 << 12) / var20 : 0;
                                                }
                                            }
                                        } else {
                                            for (int var21 = 0; class202.field2852 > var21; ++var21) {
                                                int var22 = var4[var21];
                                                var3[var21] = var22 == 4096 ? 4096 : (var5[var21] << 12) / (-var22 + 4096);
                                            }
                                        }
                                    } else {
                                        for (int var23 = 0; ~class202.field2852 < ~var23; ++var23) {
                                            int var24 = var5[var23];
                                            var3[var23] = var24 < 2048 ? var4[var23] * var24 >> 11 : -((-var4[var23] + 4096) * (-var24 + 4096) >> 11) + 4096;
                                        }
                                    }
                                } else {
                                    for (int var25 = 0; ~class202.field2852 < ~var25; ++var25) {
                                        var3[var25] = -((4096 - var4[var25]) * (4096 - var5[var25]) >> 12) + 4096;
                                    }
                                }
                            } else {
                                for (int var26 = 0; ~var26 > ~class202.field2852; ++var26) {
                                    int var27 = var5[var26];
                                    var3[var26] = ~var27 == -1 ? 4096 : (var4[var26] << 12) / var27;
                                }
                            }
                        } else {
                            for (int var28 = 0; ~class202.field2852 < ~var28; ++var28) {
                                var3[var28] = var4[var28] * var5[var28] >> 12;
                            }
                        }
                    } else {
                        for (int var29 = 0; ~var29 > ~class202.field2852; ++var29) {
                            var3[var29] = var4[var29] + -var5[var29];
                        }
                    }
                } else {
                    for (int var30 = 0; var30 < class202.field2852; ++var30) {
                        var3[var30] = var4[var30] + var5[var30];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(IZIII)Lih;")
    public static final class339 method2054(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        ++field4541;
        class306[] var5 = null;
        if (arg1) {
            return null;
        } else {
            class234 var6 = class432.method2650(arg4, 29);
            if (var6.field3511 != null) {
                var5 = new class306[var6.field3511.length];
                for (int var7 = 0; ~var7 > ~var5.length; ++var7) {
                    class247 var8 = class270.method1853((byte) -72, var6.field3511[var7]);
                    var5[var7] = new class306(var8.field3632, var8.field3636, var8.field3637, var8.field3635, var8.field3628, var8.field3629, var8.field3634, var8.field3630);
                }
            }
            return new class339(var6.field3506, var5, var6.field3508, arg2, arg3, arg0);
        }
    }

    @OriginalMember(owner = "client!wm", name = "<init>", descriptor = "()V")
    public class308() {
        super(2, false);
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(IILat;)V")
    public final void method56(int arg0, int arg1, class256 arg2) {
        if (~arg0 != -1) {
            if (~arg0 == -2) {
                super.field2956 = arg2.method1738((byte) 61) == 1;
            }
        } else {
            this.field4544 = arg2.method1738((byte) 83);
        }
        ++field4545;
        if (arg1 != -11941) {
            field4546 = null;
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(II)[[I")
    public final int[][] method58(int arg0, int arg1) {
        ++field4547;
        if (arg1 <= 94) {
            field4552 = null;
        }
        int[][] var3 = super.field2967.method1572(127, arg0);
        if (super.field2967.field3454) {
            int[][] var4 = this.method1444(1, 0, arg0);
            int[][] var5 = this.method1444(1, 1, arg0);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int[] var12 = var5[0];
            int[] var13 = var5[1];
            int[] var14 = var5[2];
            int var15 = this.field4544;
            if (var15 != 1) {
                if (~var15 != -3) {
                    if (~var15 != -4) {
                        if (var15 != 4) {
                            if (var15 != 5) {
                                if (~var15 != -7) {
                                    if (var15 != 7) {
                                        if (~var15 != -9) {
                                            if (var15 != 9) {
                                                if (var15 != 10) {
                                                    if (~var15 != -12) {
                                                        if (~var15 == -13) {
                                                            for (int var16 = 0; ~var16 > ~class202.field2852; ++var16) {
                                                                int var17 = var11[var16];
                                                                int var18 = var13[var16];
                                                                int var19 = var10[var16];
                                                                int var20 = var9[var16];
                                                                int var21 = var14[var16];
                                                                int var22 = var12[var16];
                                                                var6[var16] = -(var20 * var22 >> 11) + var22 + var20;
                                                                var7[var16] = var18 + var19 + -(var18 * var19 >> 11);
                                                                var8[var16] = var17 + var21 + -(var17 * var21 >> 11);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var23 = 0; ~class202.field2852 < ~var23; ++var23) {
                                                            int var24 = var13[var23];
                                                            int var25 = var12[var23];
                                                            int var26 = var14[var23];
                                                            int var27 = var10[var23];
                                                            int var28 = var9[var23];
                                                            int var29 = var11[var23];
                                                            var6[var23] = var25 >= var28 ? -var28 + var25 : -var25 + var28;
                                                            var7[var23] = var27 > var24 ? -var24 + var27 : var24 - var27;
                                                            var8[var23] = var26 >= var29 ? -var29 + var26 : -var26 + var29;
                                                        }
                                                    }
                                                } else {
                                                    for (int var30 = 0; ~var30 > ~class202.field2852; ++var30) {
                                                        int var31 = var14[var30];
                                                        int var32 = var13[var30];
                                                        int var33 = var11[var30];
                                                        int var34 = var9[var30];
                                                        int var35 = var12[var30];
                                                        int var36 = var10[var30];
                                                        var6[var30] = ~var35 > ~var34 ? var34 : var35;
                                                        var7[var30] = ~var36 < ~var32 ? var36 : var32;
                                                        var8[var30] = var33 > var31 ? var33 : var31;
                                                    }
                                                }
                                            } else {
                                                for (int var37 = 0; ~var37 > ~class202.field2852; ++var37) {
                                                    int var38 = var13[var37];
                                                    int var39 = var14[var37];
                                                    int var40 = var10[var37];
                                                    int var41 = var12[var37];
                                                    int var42 = var9[var37];
                                                    int var43 = var11[var37];
                                                    var6[var37] = ~var42 > ~var41 ? var42 : var41;
                                                    var7[var37] = ~var38 < ~var40 ? var40 : var38;
                                                    var8[var37] = var39 > var43 ? var43 : var39;
                                                }
                                            }
                                        } else {
                                            for (int var44 = 0; ~var44 > ~class202.field2852; ++var44) {
                                                int var45 = var11[var44];
                                                int var46 = var9[var44];
                                                int var47 = var10[var44];
                                                var6[var44] = var46 == 0 ? 0 : -((-var12[var44] + 4096 << 12) / var46) + 4096;
                                                var7[var44] = ~var47 != -1 ? -((-var13[var44] + 4096 << 12) / var47) + 4096 : 0;
                                                var8[var44] = ~var45 == -1 ? 0 : -((-var14[var44] + 4096 << 12) / var45) + 4096;
                                            }
                                        }
                                    } else {
                                        for (int var48 = 0; ~var48 > ~class202.field2852; ++var48) {
                                            int var49 = var10[var48];
                                            int var50 = var9[var48];
                                            int var51 = var11[var48];
                                            var6[var48] = ~var50 == -4097 ? 4096 : (var12[var48] << 12) / (-var50 + 4096);
                                            var7[var48] = ~var49 == -4097 ? 4096 : (var13[var48] << 12) / (4096 - var49);
                                            var8[var48] = ~var51 != -4097 ? (var14[var48] << 12) / (-var51 + 4096) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var52 = 0; var52 < class202.field2852; ++var52) {
                                        int var53 = var12[var52];
                                        int var54 = var14[var52];
                                        int var55 = var13[var52];
                                        var6[var52] = var53 < 2048 ? var9[var52] * var53 >> 11 : -((-var9[var52] + 4096) * (-var53 + 4096) >> 11) + 4096;
                                        var7[var52] = var55 >= 2048 ? -((4096 - var10[var52]) * (-var55 + 4096) >> 11) + 4096 : var10[var52] * var55 >> 11;
                                        var8[var52] = var54 >= 2048 ? -((-var11[var52] + 4096) * (-var54 + 4096) >> 11) + 4096 : var11[var52] * var54 >> 11;
                                    }
                                }
                            } else {
                                for (int var56 = 0; ~class202.field2852 < ~var56; ++var56) {
                                    var6[var56] = -((4096 - var9[var56]) * (-var12[var56] + 4096) >> 12) + 4096;
                                    var7[var56] = -((4096 - var13[var56]) * (-var10[var56] + 4096) >> 12) + 4096;
                                    var8[var56] = 4096 - ((-var11[var56] + 4096) * (-var14[var56] + 4096) >> 12);
                                }
                            }
                        } else {
                            for (int var57 = 0; class202.field2852 > var57; ++var57) {
                                int var58 = var12[var57];
                                int var59 = var13[var57];
                                int var60 = var14[var57];
                                var6[var57] = var58 == 0 ? 4096 : (var9[var57] << 12) / var58;
                                var7[var57] = ~var59 == -1 ? 4096 : (var10[var57] << 12) / var59;
                                var8[var57] = var60 != 0 ? (var11[var57] << 12) / var60 : 4096;
                            }
                        }
                    } else {
                        for (int var61 = 0; var61 < class202.field2852; ++var61) {
                            var6[var61] = var9[var61] * var12[var61] >> 12;
                            var7[var61] = var10[var61] * var13[var61] >> 12;
                            var8[var61] = var11[var61] * var14[var61] >> 12;
                        }
                    }
                } else {
                    for (int var62 = 0; ~var62 > ~class202.field2852; ++var62) {
                        var6[var62] = var9[var62] - var12[var62];
                        var7[var62] = var10[var62] - var13[var62];
                        var8[var62] = var11[var62] - var14[var62];
                    }
                }
            } else {
                for (int var63 = 0; ~class202.field2852 < ~var63; ++var63) {
                    var6[var63] = var9[var63] - -var12[var63];
                    var7[var63] = var10[var63] + var13[var63];
                    var8[var63] = var11[var63] + var14[var63];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wm", name = "g", descriptor = "(I)V")
    public static void method2055(int arg0) {
        field4555 = null;
        field4553 = null;
        field4546 = null;
        field4551 = null;
        if (arg0 == -606754164) {
            field4552 = null;
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "()V")
    public static final void method2056() {
        class200.field2827 = 0;
        label191: for (int var0 = 0; var0 < class215.field3062; ++var0) {
            class96 var1 = class234.field3515[var0];
            if (class14.field233 != null) {
                for (int var2 = 0; var2 < class14.field233.length; ++var2) {
                    if (class14.field233[var2] != -1000000 && (var1.field1194 <= class14.field233[var2] || var1.field1189 <= class14.field233[var2]) && (var1.field1184 <= class443.field6468[var2] || var1.field1200 <= class443.field6468[var2]) && (var1.field1184 >= class400.field5779[var2] || var1.field1200 >= class400.field5779[var2]) && (var1.field1186 <= class304.field4458[var2] || var1.field1182 <= class304.field4458[var2]) && (var1.field1186 >= class322.field4761[var2] || var1.field1182 >= class322.field4761[var2])) {
                        continue label191;
                    }
                }
            }
            if (var1.field1199 == 1) {
                int var3 = var1.field1201 - class145.field1969 + class31.field431;
                if (var3 >= 0 && var3 <= class31.field431 + class31.field431) {
                    int var4 = var1.field1203 - class189.field2651 + class31.field431;
                    if (var4 < 0) {
                        var4 = 0;
                    }
                    int var5 = var1.field1181 - class189.field2651 + class31.field431;
                    if (var5 > class31.field431 + class31.field431) {
                        var5 = class31.field431 + class31.field431;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class57.field694[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class339.field5004 - var1.field1184;
                        if (var7 > class100.field1255) {
                            var1.field1195 = 1;
                        } else {
                            if (var7 >= -class100.field1255) {
                                continue;
                            }
                            var1.field1195 = 2;
                            var7 = -var7;
                        }
                        var1.field1185 = (var1.field1186 - class136.field1862 << 8) / var7;
                        var1.field1198 = (var1.field1182 - class136.field1862 << 8) / var7;
                        var1.field1191 = (var1.field1194 - class264.field3901 << 8) / var7;
                        var1.field1202 = (var1.field1189 - class264.field3901 << 8) / var7;
                        class373.field5448[class200.field2827++] = var1;
                    }
                }
            } else if (var1.field1199 == 2) {
                int var8 = var1.field1203 - class189.field2651 + class31.field431;
                if (var8 >= 0 && var8 <= class31.field431 + class31.field431) {
                    int var9 = var1.field1201 - class145.field1969 + class31.field431;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    int var10 = var1.field1188 - class145.field1969 + class31.field431;
                    if (var10 > class31.field431 + class31.field431) {
                        var10 = class31.field431 + class31.field431;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class57.field694[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class136.field1862 - var1.field1186;
                        if (var12 > class100.field1255) {
                            var1.field1195 = 3;
                        } else {
                            if (var12 >= -class100.field1255) {
                                continue;
                            }
                            var1.field1195 = 4;
                            var12 = -var12;
                        }
                        var1.field1190 = (var1.field1184 - class339.field5004 << 8) / var12;
                        var1.field1183 = (var1.field1200 - class339.field5004 << 8) / var12;
                        var1.field1191 = (var1.field1194 - class264.field3901 << 8) / var12;
                        var1.field1202 = (var1.field1189 - class264.field3901 << 8) / var12;
                        class373.field5448[class200.field2827++] = var1;
                    }
                }
            } else if (var1.field1199 == 4) {
                int var13 = var1.field1194 - class264.field3901;
                if (var13 > class100.field1256) {
                    int var14 = var1.field1203 - class189.field2651 + class31.field431;
                    if (var14 < 0) {
                        var14 = 0;
                    }
                    int var15 = var1.field1181 - class189.field2651 + class31.field431;
                    if (var15 > class31.field431 + class31.field431) {
                        var15 = class31.field431 + class31.field431;
                    }
                    if (var14 <= var15) {
                        int var16 = var1.field1201 - class145.field1969 + class31.field431;
                        if (var16 < 0) {
                            var16 = 0;
                        }
                        int var17 = var1.field1188 - class145.field1969 + class31.field431;
                        if (var17 > class31.field431 + class31.field431) {
                            var17 = class31.field431 + class31.field431;
                        }
                        boolean var18 = false;
                        label163: for (int var19 = var16; var19 <= var17; ++var19) {
                            for (int var20 = var14; var20 <= var15; ++var20) {
                                if (class57.field694[var19][var20]) {
                                    var18 = true;
                                    break label163;
                                }
                            }
                        }
                        if (var18) {
                            var1.field1195 = 5;
                            var1.field1190 = (var1.field1184 - class339.field5004 << 8) / var13;
                            var1.field1183 = (var1.field1200 - class339.field5004 << 8) / var13;
                            var1.field1185 = (var1.field1186 - class136.field1862 << 8) / var13;
                            var1.field1198 = (var1.field1182 - class136.field1862 << 8) / var13;
                            class373.field5448[class200.field2827++] = var1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(IBI)Ljava/lang/String;")
    public static final String method2057(int arg0, byte arg1, int arg2) {
        int var3 = -90 % ((20 - arg1) / 60);
        ++field4548;
        int var4 = arg0 - arg2;
        if (var4 < -9) {
            return "<col=ff0000>";
        } else if (var4 < -6) {
            return "<col=ff3000>";
        } else if (~var4 > 2) {
            return "<col=ff7000>";
        } else if (var4 < 0) {
            return "<col=ffb000>";
        } else if (~var4 < -10) {
            return "<col=00ff00>";
        } else if (~var4 < -7) {
            return "<col=40ff00>";
        } else if (~var4 < -4) {
            return "<col=80ff00>";
        } else {
            return ~var4 < -1 ? "<col=c0ff00>" : "<col=ffff00>";
        }
    }

    @OriginalMember(owner = "client!wm", name = "c", descriptor = "(B)V")
    public static final void method2058(byte arg0) {
        for (int var1 = 0; ~var1 > -6; ++var1) {
            class260.field3858[var1] = false;
        }
        if (arg0 > -100) {
            field4555 = null;
        }
        ++field4549;
        class15.field238 = 0;
        class28.field402 = 5;
        class359.field5225 = 0;
        class371.field5432 = class164.field2171;
        class34.field493 = class388.field5665;
        class70.field922 = class345.field5077;
        class281.field4136 = class298.field4343;
        class363.field5256 = class136.field1867;
        class447.field6538 = -1;
        class77.field982 = class103.field1341;
        class244.field3612 = -1;
    }

    static {
        for (int var0 = 0; ~var0 > -257; ++var0) {
            int var1 = var0;
            for (int var2 = 0; ~var2 > -9; ++var2) {
                if ((1 & var1) != 1) {
                    var1 >>>= 1;
                } else {
                    var1 = var1 >>> 1 ^ -306674912;
                }
            }
            field4546[var0] = var1;
        }
        field4550 = 0;
        field4553 = new class167("", 14);
        field4555 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };
    }
}
