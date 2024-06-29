import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class24 {

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "Ljava/lang/String;")
    public static String field386 = "Choose Option";

    @OriginalMember(owner = "client!wg", name = "h", descriptor = "Ljava/lang/String;")
    public static String field388 = "Allocating memory";

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "Ljava/lang/String;")
    public static String field381 = "flash1:";

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "I")
    public static int field383;

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "I")
    public static int field384;

    @OriginalMember(owner = "client!wg", name = "g", descriptor = "I")
    public static int field387;

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "Lf;")
    public static class241 field382;

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "Lnh;")
    public static class305 field385;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IB)Ljava/lang/String;")
    public static final String method155(int arg0, byte arg1) {
        field384++;
        if (arg1 != -115) {
            method157(82, -63, (byte) 37, 1, false, (class213[]) null, -120, 69, -11, (byte[]) null, 59);
        }
        return arg0 < 999999999 ? Integer.toString(arg0) : "*";
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)V")
    public static void method156(int arg0) {
        if (arg0 != -30412) {
            field385 = null;
        }
        field388 = null;
        field381 = null;
        field385 = null;
        field382 = null;
        field386 = null;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIBIZ[Lej;III[BI)[I")
    public static final int[] method157(int arg0, int arg1, byte arg2, int arg3, boolean arg4, class213[] arg5, int arg6, int arg7, int arg8, byte[] arg9, int arg10) {
        field383++;
        int var11 = (arg1 & 0x7) * 8;
        if (!arg4) {
            for (int var12 = 0; var12 < 8; var12++) {
                for (int var13 = 0; var13 < 8; var13++) {
                    int var14 = class257.method1686(arg2 ^ 0xFFFFA123, var13 & 0x7, arg10, var12 & 0x7) + arg6;
                    int var15 = class170.method1085((byte) 114, var12 & 0x7, arg10, var13 & 0x7) + arg3;
                    if (var14 > 0 && var14 < 103 && var15 > 0 && var15 < 103) {
                        arg5[arg7].field3204[var14][var15] = class32.method199(arg5[arg7].field3204[var14][var15], -2097153);
                    }
                }
            }
        }
        int var16 = (arg8 & 0x7) * 8;
        byte var17;
        if (arg4) {
            var17 = 1;
        } else {
            var17 = 4;
        }
        class215 var18 = new class215(arg9);
        if (arg2 != 71) {
            field388 = null;
        }
        byte var19 = 0;
        int var20 = arg1 & 0x1FFFFFF8 << 3;
        int var21 = (arg8 & 0xFFFFFFF8) << 3;
        byte var22 = 0;
        if (arg10 == 1) {
            var22 = 1;
        } else if (arg10 == 2) {
            var22 = 1;
            var19 = 1;
        } else if (arg10 == 3) {
            var19 = 1;
        }
        for (int var23 = 0; var23 < var17; var23++) {
            for (int var44 = 0; var44 < 64; var44++) {
                for (int var45 = 0; var45 < 64; var45++) {
                    if (arg0 != var23 || var11 > var44 || (var11 + 8) < var44 || var45 < var16 || var16 + 8 < var45) {
                        class10.method62(var18, 0, -1, 0, 0, arg4, 0, 0, 0, false, arg2 - 71, -1);
                    } else if (var11 + 8 == var44 || (var16 + 8) == var45) {
                        int var52;
                        int var53;
                        if (arg10 == 0) {
                            var53 = var45 - (var16 - arg3);
                            var52 = arg6 + var44 - var11;
                        } else if (arg10 == 1) {
                            var52 = var45 + arg6 - var16;
                            var53 = arg3 + var11 + 8 - var44;
                        } else if (arg10 == 2) {
                            var52 = arg6 + var11 + 8 - var44;
                            var53 = var16 + arg3 + 8 - var45;
                        } else {
                            var52 = arg6 + var16 + 8 - var45;
                            var53 = var44 + arg3 - var11;
                        }
                        class10.method62(var18, 0, var53, 0, 0, arg4, var20 + var44, arg7, var21 + var45, true, 0, var52);
                    } else {
                        int var46 = arg6 + class257.method1686(-24220, var45 & 0x7, arg10, var44 & 0x7);
                        int var47 = class170.method1085((byte) 114, var44 & 0x7, arg10, var45 & 0x7) + arg3;
                        class10.method62(var18, arg10, var47, var22, var19, arg4, var20 + var44, arg7, var21 + var45, false, 0, var46);
                        if (var44 == 63 || var45 == 63) {
                            int var48 = var44 == 63 ? 64 : var44;
                            int var49 = var45 == 63 ? 64 : var45;
                            int var50;
                            int var51;
                            if (arg10 == 0) {
                                var50 = var49 + arg3 - var16;
                                var51 = arg6 - (var11 - var48);
                            } else if (arg10 == 1) {
                                var51 = var49 + arg6 - var16;
                                var50 = arg3 + var11 + 8 - var48;
                            } else if (arg10 == 2) {
                                var50 = arg3 + var16 + 8 - var49;
                                var51 = var11 - (var48 - arg6 - 8);
                            } else {
                                var50 = var48 - (var11 - arg3);
                                var51 = var16 + arg6 + 8 - var49;
                            }
                            if (var51 >= 0 && var51 < 104 && var50 >= 0 && var50 < 104) {
                                class185.field2812[arg7][var51][var50] = class185.field2812[arg7][var19 + var46][var47 + var22];
                            }
                        }
                    }
                }
            }
        }
        boolean var24 = false;
        while (var18.field3280 < var18.field3287.length) {
            int var25 = var18.method1374((byte) -60);
            if (var25 == 128) {
                var24 = true;
                class20.field328[0] = var18.method1379(-125);
                class20.field328[1] = var18.method1356(false);
                class20.field328[2] = var18.method1356(false);
                class20.field328[3] = var18.method1356(false);
                class20.field328[4] = var18.method1379(-93);
            } else {
                if (var25 != 129) {
                    var18.field3280--;
                    break;
                }
                for (int var26 = 0; var26 < 4; var26++) {
                    byte var27 = var18.method1350((byte) 124);
                    if (var27 == 0) {
                        if (var26 <= arg0) {
                            int var35 = arg6 + 7;
                            int var36 = arg3;
                            if (arg3 < 0) {
                                var36 = 0;
                            } else if (arg3 >= 104) {
                                var36 = 104;
                            }
                            if (var35 < 0) {
                                var35 = 0;
                            } else if (var35 >= 104) {
                                var35 = 104;
                            }
                            int var37 = arg6;
                            if (arg6 < 0) {
                                var37 = 0;
                            } else if (arg6 >= 104) {
                                var37 = 104;
                            }
                            int var38 = arg3 + 7;
                            if (var38 < 0) {
                                var38 = 0;
                            } else if (var38 >= 104) {
                                var38 = 104;
                            }
                            while (var37 < var35) {
                                while (var38 > var36) {
                                    class151.field2097[arg7][var37][var36] = 0;
                                    var36++;
                                }
                                var37++;
                            }
                        }
                    } else if (var27 == 1) {
                        for (int var28 = 0; var28 < 64; var28 += 4) {
                            for (int var29 = 0; var29 < 64; var29 += 4) {
                                byte var30 = var18.method1350((byte) -54);
                                if (var26 <= arg0) {
                                    for (int var31 = var28; var31 < var28 + 4; var31++) {
                                        for (int var32 = var29; var32 < (var29 + 4); var32++) {
                                            if (var11 <= var31 && var31 < (var11 + 8) && var16 <= var32 && (var16 + 8) > var16) {
                                                int var33 = arg6 + class257.method1686(-24220, var32 & 0x7, arg10, var31 & 0x7);
                                                int var34 = class170.method1085((byte) 114, var31 & 0x7, arg10, var32 & 0x7) + arg3;
                                                if (var33 >= 0 && var33 < 104 && var34 >= 0 && var34 < 104) {
                                                    class151.field2097[arg7][var33][var34] = var30;
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
        boolean var39 = false;
        if (!var39) {
            int var40 = arg3 + 7;
            int var41 = arg6 + 7;
            for (int var42 = arg6; var42 < var41; var42++) {
                for (int var43 = arg3; var43 < var40; var43++) {
                    class151.field2097[arg7][var42][var43] = 0;
                }
            }
        }
        if (var24) {
            return class20.field328;
        } else {
            return null;
        }
    }
}
