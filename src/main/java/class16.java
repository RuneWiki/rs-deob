import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class16 extends class74 {

    @OriginalMember(owner = "client!n", name = "R", descriptor = "I")
    private int field259 = 4096;

    @OriginalMember(owner = "client!n", name = "Q", descriptor = "I")
    private int field258 = 4096;

    @OriginalMember(owner = "client!n", name = "ab", descriptor = "I")
    private int field268 = 4096;

    @OriginalMember(owner = "client!n", name = "X", descriptor = "[I")
    public static int[] field265 = new int[5];

    @OriginalMember(owner = "client!n", name = "M", descriptor = "Ljava/lang/String;")
    public static String field254 = "wishes to trade with you.";

    @OriginalMember(owner = "client!n", name = "V", descriptor = "Lta;")
    public static class262 field263 = new class262(64);

    @OriginalMember(owner = "client!n", name = "Y", descriptor = "I")
    public static int field266 = 0;

    @OriginalMember(owner = "client!n", name = "Z", descriptor = "J")
    public static volatile long field267 = 0L;

    @OriginalMember(owner = "client!n", name = "N", descriptor = "I")
    public static int field255;

    @OriginalMember(owner = "client!n", name = "O", descriptor = "I")
    public static int field256;

    @OriginalMember(owner = "client!n", name = "P", descriptor = "I")
    public static int field257;

    @OriginalMember(owner = "client!n", name = "S", descriptor = "I")
    public static int field260;

    @OriginalMember(owner = "client!n", name = "T", descriptor = "I")
    public static int field261;

    @OriginalMember(owner = "client!n", name = "U", descriptor = "I")
    public static int field262;

    @OriginalMember(owner = "client!n", name = "W", descriptor = "I")
    public static int field264;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "([Lng;[BZIIIIBIII)[I")
    public static final int[] method154(class77[] arg0, byte[] arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8, int arg9, int arg10) {
        ++field262;
        int var11 = (7 & arg3) * 8;
        int var12 = (7 & arg8) * 8;
        byte var13;
        if (arg2) {
            var13 = 1;
        } else {
            var13 = 4;
        }
        if (!arg2) {
            for (int var14 = 0; ~var14 > -9; ++var14) {
                for (int var15 = 0; ~var15 > -9; ++var15) {
                    int var16 = class191.method1293(7 & var14, 7 & var15, -32, arg6) + arg9;
                    int var17 = arg4 + class8.method95(arg6, 7 & var15, 7 & var14, (byte) 125);
                    if (~var16 < -1 && var16 < 103 && var17 > 0 && ~var17 > -104) {
                        arg0[arg10].field1286[var16][var17] = class3.method48(arg0[arg10].field1286[var16][var17], -2097153);
                    }
                }
            }
        }
        int var18 = (arg3 & -8) << 3;
        class37 var19 = new class37(arg1);
        byte var20 = 0;
        int var21 = arg8 << 3 & -64;
        byte var22 = 0;
        if (~arg6 != -2) {
            if (arg6 == 2) {
                var20 = 1;
                var22 = 1;
            } else if (~arg6 == -4) {
                var20 = 1;
            }
        } else {
            var22 = 1;
        }
        for (int var23 = 0; ~var13 < ~var23; ++var23) {
            for (int var44 = 0; var44 < 64; ++var44) {
                for (int var45 = 0; ~var45 > -65; ++var45) {
                    if (~arg5 == ~var23 && var11 <= var44 && ~var44 >= ~(var11 + 8) && var12 <= var45 && var45 <= var12 - -8) {
                        if (~(var11 - -8) != ~var44 && var12 + 8 != var45) {
                            int var46 = class191.method1293(var44 & 7, 7 & var45, -88, arg6) + arg9;
                            int var47 = class8.method95(arg6, 7 & var45, var44 & 7, (byte) 125) + arg4;
                            class242.method1634(var20, var46, var18 + var44, var22, arg2, var19, false, var47, arg10, arg6, false, var21 + var45);
                            if (~var44 == -64 || var45 == 63) {
                                int var48 = var45 == 63 ? 64 : var45;
                                int var49 = var44 != 63 ? var44 : 64;
                                int var50;
                                int var51;
                                if (~arg6 != -1) {
                                    if (~arg6 == -2) {
                                        var50 = arg9 - (-var48 - -var12);
                                        var51 = arg4 - var49 + 8 + var11;
                                    } else if (arg6 != 2) {
                                        var51 = -var11 + var49 + arg4;
                                        var50 = arg9 - -var12 + 8 - var48;
                                    } else {
                                        var51 = arg4 + 8 + -var48 - -var12;
                                        var50 = arg9 + 8 - var49 + var11;
                                    }
                                } else {
                                    var50 = -var11 + var49 + arg9;
                                    var51 = arg4 + var48 + -var12;
                                }
                                if (var50 >= 0 && var50 < 104 && var51 >= 0 && var51 < 104) {
                                    class68.field1079[arg10][var50][var51] = class68.field1079[arg10][var46 - -var20][var47 - -var22];
                                }
                            }
                        } else {
                            int var52;
                            int var53;
                            if (~arg6 != -1) {
                                if (~arg6 != -2) {
                                    if (arg6 == 2) {
                                        var52 = -var44 + var11 + arg9 + 8;
                                        var53 = -var45 - (-var12 - (arg4 + 8));
                                    } else {
                                        var53 = -var11 - (-var44 - arg4);
                                        var52 = -var45 - (-var12 - arg9) + 8;
                                    }
                                } else {
                                    var52 = arg9 - var12 - -var45;
                                    var53 = arg4 + 8 + var11 + -var44;
                                }
                            } else {
                                var53 = arg4 + var45 - var12;
                                var52 = var44 - (var11 - arg9);
                            }
                            class242.method1634(0, var52, var18 + var44, 0, arg2, var19, true, var53, arg10, 0, false, var21 + var45);
                        }
                    } else {
                        class242.method1634(0, -1, 0, 0, arg2, var19, false, -1, 0, 0, false, 0);
                    }
                }
            }
        }
        boolean var24 = false;
        if (arg7 > -6) {
            field267 = 31L;
        }
        while (~var19.field588 > ~var19.field583.length) {
            int var25 = var19.method333((byte) -59);
            if (~var25 == -129) {
                var24 = true;
                class109.field1728[0] = var19.method293(-95);
                class109.field1728[1] = var19.method306(111);
                class109.field1728[2] = var19.method306(98);
                class109.field1728[3] = var19.method306(117);
                class109.field1728[4] = var19.method293(111);
            } else {
                if (var25 != 129) {
                    --var19.field588;
                    break;
                }
                for (int var31 = 0; var31 < 4; ++var31) {
                    byte var32 = var19.method322((byte) 11);
                    if (~var32 == -1) {
                        if (~arg5 <= ~var31) {
                            int var33 = arg9;
                            if (arg9 >= 0) {
                                if (arg9 >= 104) {
                                    var33 = 104;
                                }
                            } else {
                                var33 = 0;
                            }
                            int var34 = arg9 + 7;
                            if (~var34 > -1) {
                                var34 = 0;
                            } else if (var34 >= 104) {
                                var34 = 104;
                            }
                            int var35 = arg4;
                            int var36 = arg4 + 7;
                            if (~var36 > -1) {
                                var36 = 0;
                            } else if (var36 >= 104) {
                                var36 = 104;
                            }
                            if (arg4 < 0) {
                                var35 = 0;
                            } else if (~arg4 <= -105) {
                                var35 = 104;
                            }
                            while (~var33 > ~var34) {
                                while (var35 < var36) {
                                    class217.field3379[arg10][var33][var35] = 0;
                                    ++var35;
                                }
                                ++var33;
                            }
                        }
                    } else if (var32 == 1) {
                        for (int var37 = 0; var37 < 64; var37 += 4) {
                            for (int var38 = 0; ~var38 > -65; var38 += 4) {
                                byte var39 = var19.method322((byte) 68);
                                if (~arg5 <= ~var31) {
                                    for (int var40 = var37; ~var40 > ~(var37 + 4); ++var40) {
                                        for (int var41 = var38; var41 < var38 - -4; ++var41) {
                                            if (var11 <= var40 && var11 + 8 > var40 && var12 <= var41 && ~(var12 - -8) < ~var12) {
                                                int var42 = class191.method1293(var40 & 7, 7 & var41, -122, arg6) + arg9;
                                                int var43 = arg4 - -class8.method95(arg6, 7 & var41, 7 & var40, (byte) 125);
                                                if (~var42 <= -1 && ~var42 > -105 && ~var43 <= -1 && var43 < 104) {
                                                    class217.field3379[arg10][var42][var43] = var39;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean var26 = false;
        if (!var26) {
            int var27 = arg9 + 7;
            int var28 = arg4 + 7;
            for (int var29 = arg9; var29 < var27; ++var29) {
                for (int var30 = arg4; ~var30 > ~var28; ++var30) {
                    class217.field3379[arg10][var29][var30] = 0;
                }
            }
        }
        if (!var24) {
            return null;
        } else {
            return class109.field1728;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Luf;ILuf;Z)V")
    public static final void method155(class176 arg0, int arg1, class176 arg2, boolean arg3) {
        class177.field2658 = arg2;
        class124.field1961 = arg0;
        class181.field2693 = arg3;
        int var4 = 10 % ((arg1 - -67) / 51);
        ++field255;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(BLf;I)V")
    public final void method80(byte arg0, class37 arg1, int arg2) {
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (arg2 == 2) {
                    this.field258 = arg1.method293(91);
                }
            } else {
                this.field268 = arg1.method293(112);
            }
        } else {
            this.field259 = arg1.method293(100);
        }
        ++field260;
        if (arg0 != -79) {
            method154((class77[]) null, (byte[]) null, true, 102, -124, -119, 75, (byte) -78, -16, -85, -122);
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IB)[[I")
    public final int[][] method82(int arg0, byte arg1) {
        ++field261;
        int[][] var3 = super.field1248.method269(false, arg0);
        if (super.field1248.field550) {
            int[][] var4 = this.method592(arg0, 0, 85);
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var3[0];
            int[] var8 = var4[2];
            int[] var9 = var3[2];
            int[] var10 = var3[1];
            for (int var11 = 0; ~var11 > ~class178.field2662; ++var11) {
                int var12 = var6[var11];
                int var13 = var8[var11];
                int var14 = var5[var11];
                if (var12 == var13 && var13 == var14) {
                    var7[var11] = this.field259 * var12 >> 12;
                    var10[var11] = this.field268 * var13 >> 12;
                    var9[var11] = this.field258 * var14 >> 12;
                } else {
                    var7[var11] = this.field259;
                    var10[var11] = this.field268;
                    var9[var11] = this.field258;
                }
            }
        }
        if (arg1 > -112) {
            method156(-90);
        }
        return var3;
    }

    @OriginalMember(owner = "client!n", name = "f", descriptor = "(I)V")
    public static void method156(int arg0) {
        field263 = null;
        field254 = null;
        if (arg0 <= 21) {
            field267 = -89L;
        }
        field265 = null;
    }

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "()V")
    public class16() {
        super(1, false);
    }
}
