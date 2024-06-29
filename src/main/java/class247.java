import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class247 extends class110 {

    @OriginalMember(owner = "client!ed", name = "r", descriptor = "Lpf;")
    public static class342 field3898 = new class342(5000);

    @OriginalMember(owner = "client!ed", name = "s", descriptor = "Z")
    public static boolean field3899 = false;

    @OriginalMember(owner = "client!ed", name = "t", descriptor = "I")
    public static int field3900 = 0;

    @OriginalMember(owner = "client!ed", name = "u", descriptor = "I")
    public static int field3901 = 0;

    @OriginalMember(owner = "client!ed", name = "p", descriptor = "I")
    public static int field3896;

    @OriginalMember(owner = "client!ed", name = "q", descriptor = "I")
    public static int field3897;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIILj;IJIIII)Z", line = 3)
    public static final boolean method1762(int arg0, int arg1, int arg2, int arg3, class7 arg4, int arg5, long arg6, int arg7, int arg8, int arg9, int arg10) {
        return arg4 == null ? true : class126.method915(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(III[BZ[Lac;ZI)[I", line = 16)
    public static final int[] method1763(int arg0, int arg1, int arg2, byte[] arg3, boolean arg4, class108[] arg5, boolean arg6, int arg7) {
        byte var8;
        if (arg4) {
            var8 = 1;
        } else {
            var8 = 4;
        }
        if (!arg4) {
            for (int var9 = 0; var9 < 4; var9++) {
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        if (arg0 + var10 > 0 && arg0 + var10 < 103 && (arg2 + var11) > 0 && arg2 + var11 < 103) {
                            arg5[var9].field1592[arg0 + var10][arg2 + var11] = client.method767(arg5[var9].field1592[arg0 + var10][arg2 + var11], -2097153);
                        }
                    }
                }
            }
        }
        field3896++;
        class44 var12 = new class44(arg3);
        int var13 = arg2 + arg7;
        int var14 = arg1 + arg0;
        int var15 = 0;
        if (!arg6) {
            method1764(-103);
        }
        while (var8 > var15) {
            for (int var16 = 0; var16 < 64; var16++) {
                for (int var17 = 0; var17 < 64; var17++) {
                    class296.method2116(arg4, var17 + arg2, 0, var15, 0, false, -115, var14 + var16, var12, 0, var13 + var17, arg0 + var16);
                }
            }
            var15++;
        }
        boolean var18 = false;
        boolean var19 = false;
        while (var12.field573.length > var12.field586) {
            int var20 = var12.method286((byte) -109);
            if (var20 == 128) {
                var18 = true;
                class199.field3238[0] = var12.method271(21081);
                class199.field3238[1] = var12.method228(true);
                class199.field3238[2] = var12.method228(true);
                class199.field3238[3] = var12.method228(true);
                class199.field3238[4] = var12.method271(21081);
            } else {
                if (var20 != 129) {
                    var12.field586--;
                    break;
                }
                var19 = true;
                for (int var21 = 0; var21 < 4; var21++) {
                    byte var22 = var12.method246((byte) -100);
                    if (var22 == 0) {
                        int var23 = arg0 + 64;
                        if (var23 < 0) {
                            var23 = 0;
                        } else if (var23 >= 104) {
                            var23 = 104;
                        }
                        int var24 = arg2;
                        if (arg2 < 0) {
                            var24 = 0;
                        } else if (arg2 >= 104) {
                            var24 = 104;
                        }
                        int var25 = arg0;
                        int var26 = arg2 + 64;
                        if (arg0 < 0) {
                            var25 = 0;
                        } else if (arg0 >= 104) {
                            var25 = 104;
                        }
                        if (var26 < 0) {
                            var26 = 0;
                        } else if (var26 >= 104) {
                            var26 = 104;
                        }
                        while (var23 > var25) {
                            while (var24 < var26) {
                                class201.field3272[var21][var25][var24] = 0;
                                var24++;
                            }
                            var25++;
                        }
                    } else if (var22 == 1) {
                        for (int var27 = 0; var27 < 64; var27 += 4) {
                            for (int var28 = 0; var28 < 64; var28 += 4) {
                                byte var29 = var12.method246((byte) -36);
                                for (int var30 = arg0 + var27; var30 < var27 + arg0 + 4; var30++) {
                                    for (int var31 = arg2 + var28; var31 < arg2 + var28 + 4; var31++) {
                                        if (var30 >= 0 && var30 < 104 && var31 >= 0 && var31 < 104) {
                                            class201.field3272[var21][var30][var31] = var29;
                                        }
                                    }
                                }
                            }
                        }
                    } else if (var22 == 2 && var21 > 0) {
                        int var32 = arg2;
                        int var33 = arg2 + 64;
                        if (arg2 < 0) {
                            var32 = 0;
                        } else if (arg2 >= 104) {
                            var32 = 104;
                        }
                        int var34 = arg0;
                        if (arg0 < 0) {
                            var34 = 0;
                        } else if (arg0 >= 104) {
                            var34 = 104;
                        }
                        if (var33 < 0) {
                            var33 = 0;
                        } else if (var33 >= 104) {
                            var33 = 104;
                        }
                        int var35 = arg0 + 64;
                        if (var35 < 0) {
                            var35 = 0;
                        } else if (var35 >= 104) {
                            var35 = 104;
                        }
                        while (var35 > var34) {
                            while (var32 < var33) {
                                class201.field3272[var21][var34][var32] = class201.field3272[var21 - 1][var34][var32];
                                var32++;
                            }
                            var34++;
                        }
                    }
                }
            }
        }
        if (class232.field3690 && !arg4) {
            class149 var36 = null;
            while (true) {
                while (var12.field573.length > var12.field586) {
                    int var37 = var12.method286((byte) -125);
                    if (var37 == 0) {
                        var36 = new class149(var12);
                    } else if (var37 == 1) {
                        int var38 = var12.method286((byte) -128);
                        if (var38 > 0) {
                            for (int var39 = 0; var39 < var38; var39++) {
                                class48 var40 = new class48(var12);
                                if (var40.field681 == 31) {
                                    class79 var41 = class273.method1979(120, var12.method271(21081));
                                    var40.method314(222, var41.field1104, var41.field1112, var41.field1107, var41.field1105);
                                }
                                var40.field678 += arg0 << 7;
                                var40.field657 += arg2 << 7;
                                int var42 = var40.field678 >> 7;
                                int var43 = var40.field657 >> 7;
                                if (var42 >= 0 && var43 >= 0 && var42 < 104 && var43 < 104) {
                                    var40.field661 = (class129.field2025[1][var42][var43] & 0x2) != 0;
                                    var40.field682 = class110.field1642[var40.field666][var42][var43] - var40.field682;
                                    class118.method816(var40);
                                }
                            }
                        }
                    } else if (var37 == 2) {
                        if (var36 == null) {
                            var36 = new class149();
                        }
                        var36.method1090(var12, -9537);
                    } else {
                        throw new IllegalStateException();
                    }
                }
                if (var36 == null) {
                    var36 = new class149();
                }
                for (int var44 = 0; var44 < 8; var44++) {
                    for (int var45 = 0; var45 < 8; var45++) {
                        int var46 = (arg2 >> 3) + var45;
                        int var47 = (arg0 >> 3) + var44;
                        if (var47 >= 0 && var47 < 13 && var46 >= 0 && var46 < 13) {
                            class61.field870[var47][var46] = var36;
                        }
                    }
                }
                break;
            }
        }
        if (!var19) {
            for (int var48 = 0; var48 < 4; var48++) {
                for (int var49 = 0; var49 < 16; var49++) {
                    for (int var50 = 0; var50 < 16; var50++) {
                        int var51 = (arg2 >> 2) + var50;
                        int var52 = (arg0 >> 2) + var49;
                        if (var52 >= 0 && var52 < 26 && var51 >= 0 && var51 < 26) {
                            class201.field3272[var48][var52][var51] = 0;
                        }
                    }
                }
            }
        }
        return var18 ? class199.field3238 : null;
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(I)V", line = 431)
    public static void method1764(int arg0) {
        field3898 = null;
        if (arg0 >= -31) {
            field3901 = -128;
        }
    }
}
