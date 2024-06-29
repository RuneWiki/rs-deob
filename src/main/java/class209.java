import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class209 extends class87 {

    @OriginalMember(owner = "client!ni", name = "R", descriptor = "I")
    private int field3099 = 6;

    @OriginalMember(owner = "client!ni", name = "H", descriptor = "I")
    public static int field3089 = 0;

    @OriginalMember(owner = "client!ni", name = "G", descriptor = "[I")
    public static int[] field3088 = new int[2];

    @OriginalMember(owner = "client!ni", name = "M", descriptor = "Ljava/lang/String;")
    public static String field3094 = "flash3:";

    @OriginalMember(owner = "client!ni", name = "Q", descriptor = "[I")
    public static int[] field3098 = new int[1000];

    @OriginalMember(owner = "client!ni", name = "I", descriptor = "I")
    public static int field3090;

    @OriginalMember(owner = "client!ni", name = "J", descriptor = "I")
    public static int field3091;

    @OriginalMember(owner = "client!ni", name = "K", descriptor = "I")
    public static int field3092;

    @OriginalMember(owner = "client!ni", name = "L", descriptor = "I")
    public static int field3093;

    @OriginalMember(owner = "client!ni", name = "N", descriptor = "I")
    public static int field3095;

    @OriginalMember(owner = "client!ni", name = "S", descriptor = "I")
    public static int field3100;

    @OriginalMember(owner = "client!ni", name = "T", descriptor = "I")
    public static int field3101;

    @OriginalMember(owner = "client!ni", name = "O", descriptor = "[I")
    public static int[] field3096;

    @OriginalMember(owner = "client!ni", name = "P", descriptor = "[Ljava/lang/String;")
    public static String[] field3097;

    @OriginalMember(owner = "client!ni", name = "<init>", descriptor = "()V")
    public class209() {
        super(2, false);
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(JI)V")
    public static final void method1474(long arg0, int arg1) {
        ++field3091;
        if (~arg0 != -1L) {
            if (arg1 != -23814) {
                method1474(-37L, 48);
            }
            for (int var3 = 0; ~var3 > ~class110.field1832; ++var3) {
                if (class245.field3605[var3] == arg0) {
                    ++class237.field3461;
                    --class110.field1832;
                    for (int var4 = var3; var4 < class110.field1832; ++var4) {
                        class223.field3268[var4] = class223.field3268[var4 - -1];
                        class268.field4315[var4] = class268.field4315[var4 + 1];
                        class258.field3980[var4] = class258.field3980[var4 + 1];
                        class245.field3605[var4] = class245.field3605[var4 + 1];
                        class292.field4637[var4] = class292.field4637[var4 + 1];
                        class240.field3519[var4] = class240.field3519[var4 + 1];
                    }
                    class135.field2210 = class248.field3705;
                    class144.field2338.method683(true, 172);
                    class144.field2338.method382(902642416, arg0);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(III[Ljava/lang/String;)Ljava/lang/String;")
    public static final String method1475(int arg0, int arg1, int arg2, String[] arg3) {
        ++field3095;
        if (~arg0 == -1) {
            return "";
        } else if (arg0 == arg2) {
            String var4 = arg3[arg1];
            return var4 == null ? "null" : var4.toString();
        } else {
            int var5 = arg0 + arg1;
            int var6 = 0;
            for (int var7 = arg1; ~var5 < ~var7; ++var7) {
                String var11 = arg3[var7];
                if (var11 == null) {
                    var6 += 4;
                } else {
                    var6 += var11.length();
                }
            }
            StringBuffer var8 = new StringBuffer(var6);
            for (int var9 = arg1; ~var9 > ~var5; ++var9) {
                String var10 = arg3[var9];
                if (var10 != null) {
                    var8.append(var10);
                } else {
                    var8.append("null");
                }
            }
            return var8.toString();
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lhc;II)V")
    public final void method40(class53 arg0, int arg1, int arg2) {
        if (~arg1 != -1) {
            if (~arg1 == -2) {
                super.field1381 = arg0.method366(arg2 + -42150) == 1;
            }
        } else {
            this.field3099 = arg0.method366(-16505);
        }
        if (arg2 != 25645) {
            method1475(-89, 87, -10, (String[]) null);
        }
        ++field3092;
    }

    @OriginalMember(owner = "client!ni", name = "f", descriptor = "(I)V")
    public static void method1476(int arg0) {
        field3096 = null;
        field3098 = null;
        field3094 = null;
        field3097 = null;
        field3088 = null;
        if (arg0 != 0) {
            field3089 = -111;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IBLmh;)I")
    public static final int method1477(int arg0, byte arg1, class263 arg2) {
        ++field3093;
        if (!client.method903(arg2).method1732(arg0, (byte) 38) && arg2.field4117 == null) {
            return -1;
        } else {
            if (arg1 > -85) {
                method1478((byte) 121, -127);
            }
            return arg2.field4042 != null && ~arg0 > ~arg2.field4042.length ? arg2.field4042[arg0] : -1;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IZ)[I")
    public final int[] method37(int arg0, boolean arg1) {
        ++field3100;
        int[] var3 = super.field1378.method319(arg0, arg1);
        if (super.field1378.field733) {
            int[] var4 = this.method642(0, arg0, !arg1);
            int[] var5 = this.method642(1, arg0, !arg1);
            int var6 = this.field3099;
            if (~var6 != -2) {
                if (~var6 != -3) {
                    if (var6 != 3) {
                        if (~var6 != -5) {
                            if (var6 != 5) {
                                if (var6 != 6) {
                                    if (var6 != 7) {
                                        if (~var6 != -9) {
                                            if (var6 != 9) {
                                                if (var6 != 10) {
                                                    if (var6 != 11) {
                                                        if (var6 == 12) {
                                                            for (int var7 = 0; ~var7 > ~class206.field3032; ++var7) {
                                                                int var8 = var5[var7];
                                                                int var9 = var4[var7];
                                                                var3[var7] = var9 - -var8 - (var8 * var9 >> 11);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var10 = 0; var10 < class206.field3032; ++var10) {
                                                            int var11 = var5[var10];
                                                            int var12 = var4[var10];
                                                            var3[var10] = ~var12 < ~var11 ? -var11 + var12 : -var12 + var11;
                                                        }
                                                    }
                                                } else {
                                                    for (int var13 = 0; var13 < class206.field3032; ++var13) {
                                                        int var14 = var5[var13];
                                                        int var15 = var4[var13];
                                                        var3[var13] = ~var14 <= ~var15 ? var14 : var15;
                                                    }
                                                }
                                            } else {
                                                for (int var16 = 0; ~var16 > ~class206.field3032; ++var16) {
                                                    int var17 = var4[var16];
                                                    int var18 = var5[var16];
                                                    var3[var16] = ~var17 > ~var18 ? var17 : var18;
                                                }
                                            }
                                        } else {
                                            for (int var19 = 0; ~var19 > ~class206.field3032; ++var19) {
                                                int var20 = var4[var19];
                                                var3[var19] = var20 != 0 ? -((-var5[var19] + 4096 << 12) / var20) + 4096 : 0;
                                            }
                                        }
                                    } else {
                                        for (int var21 = 0; ~class206.field3032 < ~var21; ++var21) {
                                            int var22 = var4[var21];
                                            var3[var21] = ~var22 == -4097 ? 4096 : (var5[var21] << 12) / (4096 - var22);
                                        }
                                    }
                                } else {
                                    for (int var23 = 0; var23 < class206.field3032; ++var23) {
                                        int var24 = var5[var23];
                                        var3[var23] = ~var24 <= -2049 ? 4096 - ((4096 - var24) * (-var4[var23] + 4096) >> 11) : var4[var23] * var24 >> 11;
                                    }
                                }
                            } else {
                                for (int var25 = 0; class206.field3032 > var25; ++var25) {
                                    var3[var25] = -((-var4[var25] + 4096) * (-var5[var25] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var26 = 0; class206.field3032 > var26; ++var26) {
                                int var27 = var5[var26];
                                var3[var26] = ~var27 == -1 ? 4096 : (var4[var26] << 12) / var27;
                            }
                        }
                    } else {
                        for (int var28 = 0; var28 < class206.field3032; ++var28) {
                            var3[var28] = var4[var28] * var5[var28] >> 12;
                        }
                    }
                } else {
                    for (int var29 = 0; ~class206.field3032 < ~var29; ++var29) {
                        var3[var29] = var4[var29] + -var5[var29];
                    }
                }
            } else {
                for (int var30 = 0; class206.field3032 > var30; ++var30) {
                    var3[var30] = var4[var30] + var5[var30];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(BI)I")
    public static final int method1478(byte arg0, int arg1) {
        if (arg0 < 70) {
            field3094 = null;
        }
        ++field3101;
        return arg1 >>> 10;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(II)[[I")
    public final int[][] method143(int arg0, int arg1) {
        if (arg1 != 6) {
            this.method37(-24, false);
        }
        ++field3090;
        int[][] var3 = super.field1390.method1902(-108, arg0);
        if (super.field1390.field4428) {
            int[][] var4 = this.method648(arg0, 53, 0);
            int[][] var5 = this.method648(arg0, -114, 1);
            int[] var6 = var3[1];
            int[] var7 = var3[0];
            int[] var8 = var4[2];
            int[] var9 = var3[2];
            int[] var10 = var4[1];
            int[] var11 = var5[0];
            int[] var12 = var5[1];
            int[] var13 = var4[0];
            int[] var14 = var5[2];
            int var15 = this.field3099;
            if (var15 != 1) {
                if (var15 != 2) {
                    if (~var15 != -4) {
                        if (var15 != 4) {
                            if (~var15 != -6) {
                                if (var15 != 6) {
                                    if (~var15 != -8) {
                                        if (var15 != 8) {
                                            if (~var15 != -10) {
                                                if (var15 != 10) {
                                                    if (~var15 != -12) {
                                                        if (var15 == 12) {
                                                            for (int var16 = 0; class206.field3032 > var16; ++var16) {
                                                                int var17 = var14[var16];
                                                                int var18 = var11[var16];
                                                                int var19 = var13[var16];
                                                                int var20 = var8[var16];
                                                                int var21 = var12[var16];
                                                                int var22 = var10[var16];
                                                                var7[var16] = var18 + var19 - (var18 * var19 >> 11);
                                                                var6[var16] = var21 + var22 + -(var21 * var22 >> 11);
                                                                var9[var16] = -(var17 * var20 >> 11) + var20 + var17;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var23 = 0; var23 < class206.field3032; ++var23) {
                                                            int var24 = var8[var23];
                                                            int var25 = var13[var23];
                                                            int var26 = var12[var23];
                                                            int var27 = var14[var23];
                                                            int var28 = var10[var23];
                                                            int var29 = var11[var23];
                                                            var7[var23] = var29 < var25 ? -var29 + var25 : -var25 + var29;
                                                            var6[var23] = var26 >= var28 ? -var28 + var26 : -var26 + var28;
                                                            var9[var23] = ~var27 <= ~var24 ? -var24 + var27 : -var27 + var24;
                                                        }
                                                    }
                                                } else {
                                                    for (int var30 = 0; class206.field3032 > var30; ++var30) {
                                                        int var31 = var12[var30];
                                                        int var32 = var10[var30];
                                                        int var33 = var8[var30];
                                                        int var34 = var11[var30];
                                                        int var35 = var14[var30];
                                                        int var36 = var13[var30];
                                                        var7[var30] = ~var34 > ~var36 ? var36 : var34;
                                                        var6[var30] = var31 < var32 ? var32 : var31;
                                                        var9[var30] = ~var33 >= ~var35 ? var35 : var33;
                                                    }
                                                }
                                            } else {
                                                for (int var37 = 0; ~class206.field3032 < ~var37; ++var37) {
                                                    int var38 = var13[var37];
                                                    int var39 = var8[var37];
                                                    int var40 = var12[var37];
                                                    int var41 = var11[var37];
                                                    int var42 = var10[var37];
                                                    int var43 = var14[var37];
                                                    var7[var37] = var41 > var38 ? var38 : var41;
                                                    var6[var37] = ~var40 < ~var42 ? var42 : var40;
                                                    var9[var37] = var43 > var39 ? var39 : var43;
                                                }
                                            }
                                        } else {
                                            for (int var44 = 0; var44 < class206.field3032; ++var44) {
                                                int var45 = var13[var44];
                                                int var46 = var10[var44];
                                                int var47 = var8[var44];
                                                var7[var44] = var45 != 0 ? -((4096 - var11[var44] << 12) / var45) + 4096 : 0;
                                                var6[var44] = var46 != 0 ? -((-var12[var44] + 4096 << 12) / var46) + 4096 : 0;
                                                var9[var44] = var47 != 0 ? 4096 - (-var14[var44] + 4096 << 12) / var47 : 0;
                                            }
                                        }
                                    } else {
                                        for (int var48 = 0; var48 < class206.field3032; ++var48) {
                                            int var49 = var13[var48];
                                            int var50 = var8[var48];
                                            int var51 = var10[var48];
                                            var7[var48] = var49 != 4096 ? (var11[var48] << 12) / (-var49 + 4096) : 4096;
                                            var6[var48] = ~var51 != -4097 ? (var12[var48] << 12) / (-var51 + 4096) : 4096;
                                            var9[var48] = ~var50 == -4097 ? 4096 : (var14[var48] << 12) / (-var50 + 4096);
                                        }
                                    }
                                } else {
                                    for (int var52 = 0; var52 < class206.field3032; ++var52) {
                                        int var53 = var14[var52];
                                        int var54 = var12[var52];
                                        int var55 = var11[var52];
                                        var7[var52] = var55 < 2048 ? var13[var52] * var55 >> 11 : -((4096 - var13[var52]) * (-var55 + 4096) >> 11) + 4096;
                                        var6[var52] = ~var54 > -2049 ? var10[var52] * var54 >> 11 : -((-var10[var52] + 4096) * (-var54 + 4096) >> 11) + 4096;
                                        var9[var52] = ~var53 > -2049 ? var8[var52] * var53 >> 11 : -((-var8[var52] + 4096) * (-var53 + 4096) >> 11) + 4096;
                                    }
                                }
                            } else {
                                for (int var56 = 0; var56 < class206.field3032; ++var56) {
                                    var7[var56] = 4096 - ((-var11[var56] + 4096) * (-var13[var56] + 4096) >> 12);
                                    var6[var56] = -((4096 - var10[var56]) * (4096 - var12[var56]) >> 12) + 4096;
                                    var9[var56] = -((-var8[var56] + 4096) * (-var14[var56] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var57 = 0; var57 < class206.field3032; ++var57) {
                                int var58 = var11[var57];
                                int var59 = var12[var57];
                                int var60 = var14[var57];
                                var7[var57] = var58 != 0 ? (var13[var57] << 12) / var58 : 4096;
                                var6[var57] = var59 != 0 ? (var10[var57] << 12) / var59 : 4096;
                                var9[var57] = var60 == 0 ? 4096 : (var8[var57] << 12) / var60;
                            }
                        }
                    } else {
                        for (int var61 = 0; class206.field3032 > var61; ++var61) {
                            var7[var61] = var11[var61] * var13[var61] >> 12;
                            var6[var61] = var10[var61] * var12[var61] >> 12;
                            var9[var61] = var8[var61] * var14[var61] >> 12;
                        }
                    }
                } else {
                    for (int var62 = 0; var62 < class206.field3032; ++var62) {
                        var7[var62] = var13[var62] + -var11[var62];
                        var6[var62] = var10[var62] + -var12[var62];
                        var9[var62] = var8[var62] + -var14[var62];
                    }
                }
            } else {
                for (int var63 = 0; ~var63 > ~class206.field3032; ++var63) {
                    var7[var63] = var11[var63] + var13[var63];
                    var6[var63] = var10[var63] + var12[var63];
                    var9[var63] = var8[var63] + var14[var63];
                }
            }
        }
        return var3;
    }
}
