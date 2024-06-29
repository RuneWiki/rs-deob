import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class48 extends class1 {

    @OriginalMember(owner = "client!ec", name = "pb", descriptor = "[Z")
    public static boolean[] field989 = new boolean[100];

    @OriginalMember(owner = "client!ec", name = "kb", descriptor = "Lk;")
    public static class108 field984 = new class108(5000);

    @OriginalMember(owner = "client!ec", name = "rb", descriptor = "Loc;")
    public static class151 field991 = class137.method873(2, "k");

    @OriginalMember(owner = "client!ec", name = "gb", descriptor = "I")
    public static int field980;

    @OriginalMember(owner = "client!ec", name = "hb", descriptor = "I")
    public static int field981;

    @OriginalMember(owner = "client!ec", name = "ib", descriptor = "I")
    public static int field982;

    @OriginalMember(owner = "client!ec", name = "jb", descriptor = "I")
    public static int field983;

    @OriginalMember(owner = "client!ec", name = "lb", descriptor = "I")
    public static int field985;

    @OriginalMember(owner = "client!ec", name = "mb", descriptor = "I")
    public static int field986;

    @OriginalMember(owner = "client!ec", name = "nb", descriptor = "I")
    public static int field987;

    @OriginalMember(owner = "client!ec", name = "ob", descriptor = "I")
    public static int field988;

    @OriginalMember(owner = "client!ec", name = "qb", descriptor = "I")
    public static int field990;

    @OriginalMember(owner = "client!ec", name = "sb", descriptor = "I")
    public static int field992;

    @OriginalMember(owner = "client!ec", name = "tb", descriptor = "Lnd;")
    public static class142 field993;

    @OriginalMember(owner = "client!ec", name = "ub", descriptor = "Lha;")
    public static class77 field994;

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(BI)I")
    public static final int method340(byte arg0, int arg1) {
        if (arg0 != -16) {
            method341((byte) -93);
        }
        ++field990;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(II)[[I")
    public final int[][] method14(int arg0, int arg1) {
        if (arg1 != -81) {
            method347(false);
        }
        ++field988;
        int[][] var3 = super.field13.method578(arg0, -1);
        if (super.field13.field1658) {
            int[] var4 = this.method4(arg0, -122, 2);
            int[][] var5 = this.method8(0, (byte) 119, arg0);
            int[][] var6 = this.method8(1, (byte) -100, arg0);
            int[] var7 = var3[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var5[0];
            int[] var11 = var5[2];
            int[] var12 = var6[0];
            int[] var13 = var6[1];
            int[] var14 = var6[2];
            int[] var15 = var5[1];
            for (int var16 = 0; ~class202.field3603 < ~var16; ++var16) {
                int var17 = var4[var16];
                if (~var17 == -4097) {
                    var8[var16] = var10[var16];
                    var9[var16] = var15[var16];
                    var7[var16] = var11[var16];
                } else if (var17 != 0) {
                    int var18 = -var17 + 4096;
                    var8[var16] = var10[var16] * var17 + var12[var16] * var18 >> 12;
                    var9[var16] = var15[var16] * var17 - -(var13[var16] * var18) >> 12;
                    var7[var16] = var11[var16] * var17 + var14[var16] * var18 >> 12;
                } else {
                    var8[var16] = var12[var16];
                    var9[var16] = var13[var16];
                    var7[var16] = var14[var16];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "(B)V")
    public static final void method341(byte arg0) {
        ++field987;
        if (arg0 != 102) {
            method340((byte) -1, 23);
        }
        if (class229.field4052 != null) {
            class229.field4052.method336(-13112);
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IILwa;)V")
    public final void method13(int arg0, int arg1, class229 arg2) {
        if (arg0 == arg1) {
            super.field27 = ~arg2.method1475(255) == -2;
        }
        ++field985;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(BI)[I")
    public final int[] method11(byte arg0, int arg1) {
        ++field980;
        int[] var3 = super.field21.method1182(arg1, -31709);
        if (super.field21.field3388) {
            int[] var4 = this.method4(arg1, -111, 0);
            int[] var5 = this.method4(arg1, arg0 + -227, 1);
            int[] var6 = this.method4(arg1, -111, 2);
            for (int var7 = 0; ~class202.field3603 < ~var7; ++var7) {
                int var8 = var6[var7];
                if (~var8 != -4097) {
                    if (var8 != 0) {
                        var3[var7] = (4096 - var8) * var5[var7] + var4[var7] * var8 >> 12;
                    } else {
                        var3[var7] = var5[var7];
                    }
                } else {
                    var3[var7] = var4[var7];
                }
            }
        }
        if (arg0 != 107) {
            field989 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "(II)Lgi;")
    public static final class74 method342(int arg0, int arg1) {
        class74 var2 = (class74) class37.field775.method1318((byte) -115, (long) arg1);
        ++field982;
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class56.field1132.method1208(arg1, (byte) -74, 4);
            class74 var4 = new class74();
            if (arg0 != -1817) {
                field992 = -94;
            }
            if (var3 != null) {
                var4.method483(arg1, (byte) 91, new class229(var3));
            }
            class37.field775.method1324(var4, 18373, (long) arg1);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "(II)V")
    public static final void method343(int arg0, int arg1) {
        ++field986;
        if (~arg0 != 0) {
            if (class116.field2089[arg0]) {
                class67.field1281.method1192(arg0, -33);
                if (class115.field2067[arg0] != null) {
                    boolean var2 = true;
                    for (int var3 = arg1; class115.field2067[arg0].length > var3; ++var3) {
                        if (class115.field2067[arg0][var3] != null) {
                            if (class115.field2067[arg0][var3].field4173 == 2) {
                                var2 = false;
                            } else {
                                class115.field2067[arg0][var3] = null;
                            }
                        }
                    }
                    if (var2) {
                        class115.field2067[arg0] = null;
                    }
                    class116.field2089[arg0] = false;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "(B)V")
    public static final void method344(byte arg0) {
        class128.method775(false, (byte) 127);
        ++field983;
        class209.field3673 = 0;
        boolean var1 = true;
        int var2 = 0;
        if (arg0 < 19) {
            method341((byte) -90);
        }
        while (~class114.field2035.length < ~var2) {
            if (~class220.field3828[var2] != 0 && class114.field2035[var2] == null) {
                class114.field2035[var2] = class140.field2548.method1208(0, (byte) -71, class220.field3828[var2]);
                if (class114.field2035[var2] == null) {
                    ++class209.field3673;
                    var1 = false;
                }
            }
            if (class102.field1844[var2] != -1 && class169.field3078[var2] == null) {
                class169.field3078[var2] = class140.field2548.method1213(-2, class102.field1844[var2], class181.field3268[var2], 0);
                if (class169.field3078[var2] == null) {
                    ++class209.field3673;
                    var1 = false;
                }
            }
            ++var2;
        }
        if (!var1) {
            class92.field1685 = 1;
        } else {
            boolean var3 = true;
            class91.field1671 = 0;
            for (int var4 = 0; var4 < class114.field2035.length; ++var4) {
                byte[] var56 = class169.field3078[var4];
                if (var56 != null) {
                    int var57 = (255 & class109.field1936[var4]) * 64 + -class64.field1255;
                    int var58 = (class109.field1936[var4] >> 8) * 64 - class232.field4188;
                    if (class159.field2855) {
                        var58 = 10;
                        var57 = 10;
                    }
                    var3 &= class43.method305(var56, var58, -34, var57);
                }
            }
            if (!var3) {
                class92.field1685 = 2;
            } else {
                if (class92.field1685 != 0) {
                    class192.method1207(class126.method761(new class151[] { class190.field3365, class237.field4420 }, 10260), true, 255);
                }
                class16.method131(-11903);
                class64.method429(-100);
                class16.method131(-11903);
                class224.method1409();
                class16.method131(-11903);
                System.gc();
                for (int var5 = 0; var5 < 4; ++var5) {
                    class95.field1768[var5].method886((byte) 118);
                }
                for (int var6 = 0; ~var6 > -5; ++var6) {
                    for (int var54 = 0; ~var54 > -105; ++var54) {
                        for (int var55 = 0; ~var55 > -105; ++var55) {
                            class122.field2191[var6][var54][var55] = 0;
                        }
                    }
                }
                class16.method131(-11903);
                class204.method1289((byte) 107);
                int var7 = class114.field2035.length;
                class102.method623(12051);
                class128.method775(true, (byte) 126);
                if (!class159.field2855) {
                    for (int var8 = 0; var8 < var7; ++var8) {
                        byte[] var17 = class114.field2035[var8];
                        int var18 = (class109.field1936[var8] >> 8) * 64 + -class232.field4188;
                        int var19 = (255 & class109.field1936[var8]) * 64 + -class64.field1255;
                        if (var17 != null) {
                            class16.method131(-11903);
                            class140.method902(var19, var18, class95.field1768, (class169.field3089 - 6) * 8, (class233.field4297 + -6) * 8, 0, var17);
                        }
                    }
                    for (int var9 = 0; var7 > var9; ++var9) {
                        int var14 = (class109.field1936[var9] >> 8) * 64 + -class232.field4188;
                        int var15 = (255 & class109.field1936[var9]) * 64 + -class64.field1255;
                        byte[] var16 = class114.field2035[var9];
                        if (var16 == null && class233.field4297 < 800) {
                            class16.method131(-11903);
                            class129.method797(true, 64, var14, 64, var15);
                        }
                    }
                    class128.method775(true, (byte) 123);
                    for (int var10 = 0; var10 < var7; ++var10) {
                        byte[] var11 = class169.field3078[var10];
                        if (var11 != null) {
                            int var12 = (class109.field1936[var10] >> 8) * 64 - class232.field4188;
                            int var13 = (class109.field1936[var10] & 255) * 64 - class64.field1255;
                            class16.method131(-11903);
                            class170.method1096(var13, class95.field1768, (byte) -115, var12, var11);
                        }
                    }
                }
                if (class159.field2855) {
                    for (int var20 = 0; var20 < 4; ++var20) {
                        class16.method131(-11903);
                        for (int var34 = 0; ~var34 > -14; ++var34) {
                            for (int var35 = 0; var35 < 13; ++var35) {
                                int var36 = class211.field3706[var20][var34][var35];
                                boolean var37 = false;
                                if (~var36 != 0) {
                                    int var38 = var36 >> 24 & 3;
                                    int var39 = (6 & var36) >> 1;
                                    int var40 = (16379 & var36) >> 3;
                                    int var41 = 1023 & var36 >> 14;
                                    int var42 = (var41 / 8 << 8) + var40 / 8;
                                    for (int var43 = 0; ~var43 > ~class109.field1936.length; ++var43) {
                                        if (~class109.field1936[var43] == ~var42 && class114.field2035[var43] != null) {
                                            class165.method1059(var35 * 8, class95.field1768, (7 & var41) * 8, class114.field2035[var43], -30, (7 & var40) * 8, var20, var38, var39, var34 * 8);
                                            var37 = true;
                                            break;
                                        }
                                    }
                                }
                                if (!var37) {
                                    class158.method1034(var20, var35 * 8, 121, var34 * 8);
                                }
                            }
                        }
                    }
                    for (int var21 = 0; ~var21 > -14; ++var21) {
                        for (int var32 = 0; var32 < 13; ++var32) {
                            int var33 = class211.field3706[0][var21][var32];
                            if (~var33 == 0) {
                                class129.method797(true, 8, var21 * 8, 8, var32 * 8);
                            }
                        }
                    }
                    class128.method775(true, (byte) 127);
                    for (int var22 = 0; ~var22 > -5; ++var22) {
                        class16.method131(-11903);
                        for (int var23 = 0; ~var23 > -14; ++var23) {
                            for (int var24 = 0; var24 < 13; ++var24) {
                                int var25 = class211.field3706[var22][var23][var24];
                                if (var25 != -1) {
                                    int var26 = (50512301 & var25) >> 24;
                                    int var27 = 3 & var25 >> 1;
                                    int var28 = (16381 & var25) >> 3;
                                    int var29 = (var25 & 16761950) >> 14;
                                    int var30 = (var29 / 8 << 8) + var28 / 8;
                                    for (int var31 = 0; ~var31 > ~class109.field1936.length; ++var31) {
                                        if (class109.field1936[var31] == var30 && class169.field3078[var31] != null) {
                                            class130.method811(class169.field3078[var31], var26, (var29 & 7) * 8, (7 & var28) * 8, (byte) -65, var22, var23 * 8, var24 * 8, class95.field1768, var27);
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                class128.method775(true, (byte) 127);
                class64.method429(-126);
                class16.method131(-11903);
                class7.method43(class95.field1768, (byte) -34);
                class128.method775(true, (byte) -57);
                int var44 = class53.field1067;
                if (var44 > class234.field4325) {
                    var44 = class234.field4325;
                }
                if (~(class234.field4325 + -1) < ~var44) {
                    int var45 = class234.field4325 - 1;
                }
                if (class13.field300) {
                    method345(class53.field1067);
                } else {
                    method345(0);
                }
                for (int var46 = 0; var46 < 104; ++var46) {
                    for (int var53 = 0; ~var53 > -105; ++var53) {
                        class167.method1087(var46, var53, 8);
                    }
                }
                class16.method131(-11903);
                class94.method599(0);
                class64.method429(-101);
                if (class189.field3348 != null) {
                    ++class141.field2559;
                    field984.method650(-13721, 9);
                    field984.method1461(1057001181, (byte) 65);
                }
                if (!class159.field2855) {
                    int var47 = (class169.field3089 + -6) / 8;
                    int var48 = (class169.field3089 + 6) / 8;
                    int var49 = (class233.field4297 + -6) / 8;
                    int var50 = (class233.field4297 - -6) / 8;
                    for (int var51 = var47 + -1; var48 + 1 >= var51; ++var51) {
                        for (int var52 = var49 + -1; var52 <= var50 + 1; ++var52) {
                            if (~var47 < ~var51 || var51 > var48 || var49 > var52 || ~var50 > ~var52) {
                                class140.field2548.method1196(class126.method761(new class151[] { class65.field1263, class137.method874(var51, false), class158.field2849, class137.method874(var52, false) }, 10260), 0);
                                class140.field2548.method1196(class126.method761(new class151[] { class66.field1278, class137.method874(var51, false), class158.field2849, class137.method874(var52, false) }, 10260), 0);
                            }
                        }
                    }
                }
                class137.method871(30, (byte) 123);
                class16.method131(-11903);
                class227.method1424(false);
                field984.method650(-13721, 235);
                class5.method34(98);
            }
        }
    }

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "(I)V")
    private static final void method345(int arg0) {
        class212.field3734 = arg0;
        for (int var1 = 0; var1 < class228.field4032; ++var1) {
            for (int var2 = 0; var2 < class225.field3924; ++var2) {
                if (class95.field1776[arg0][var1][var2] == null) {
                    class95.field1776[arg0][var1][var2] = new class72(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IZ)Z")
    public static final boolean method346(int arg0, boolean arg1) {
        ++field981;
        if (arg1) {
            return false;
        } else {
            return ~arg0 <= -49 && ~arg0 >= -58;
        }
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(Z)V")
    public static void method347(boolean arg0) {
        field993 = null;
        field991 = null;
        field984 = null;
        field994 = null;
        if (arg0) {
            method341((byte) -23);
        }
        field989 = null;
    }

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "()V")
    public class48() {
        super(3, false);
    }
}
