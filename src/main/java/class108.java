import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class108 {

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "[I")
    public static int[] field1680 = new int[100];

    @OriginalMember(owner = "client!jj", name = "f", descriptor = "I")
    public static int field1683 = 5063219;

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "Lnf;")
    public static class162 field1681 = new class162(5);

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "I")
    public static int field1678;

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "Z")
    public static boolean field1682;

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "[[[Lpc;")
    public static class22[][][] field1679;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(B)V")
    public static void method812(byte arg0) {
        if (arg0 == 52) {
            field1679 = null;
            field1680 = null;
            field1681 = null;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IZ[Lai;IIII[BIIZ)[I")
    public static final int[] method813(int arg0, boolean arg1, class89[] arg2, int arg3, int arg4, int arg5, int arg6, byte[] arg7, int arg8, int arg9, boolean arg10) {
        int var11 = (arg9 & 0x7) * 8;
        byte var12;
        if (arg1) {
            var12 = 1;
        } else {
            var12 = 4;
        }
        int var13 = (arg4 & 0x7) * 8;
        field1678++;
        if (!arg1) {
            for (int var14 = 0; var14 < 8; var14++) {
                for (int var15 = 0; var15 < 8; var15++) {
                    int var16 = class234.method1603(var15 & 0x7, arg3, false, var14 & 0x7) + arg0;
                    int var17 = class194.method1379((byte) -122, var15 & 0x7, var14 & 0x7, arg3) + arg6;
                    if (var16 > 0 && var16 < 103 && var17 > 0 && var17 < 103) {
                        arg2[arg8].field1396[var16][var17] = class118.method863(arg2[arg8].field1396[var16][var17], -2097153);
                    }
                }
            }
        }
        int var18 = (arg9 & 0xFFFFFFF8) << 3;
        class31 var19 = new class31(arg7);
        if (!arg10) {
            method812((byte) 22);
        }
        int var20 = (arg4 & 0xFFFFFFF8) << 3;
        byte var21 = 0;
        byte var22 = 0;
        if (arg3 == 1) {
            var22 = 1;
        } else if (arg3 == 2) {
            var22 = 1;
            var21 = 1;
        } else if (arg3 == 3) {
            var21 = 1;
        }
        for (int var23 = 0; var23 < var12; var23++) {
            for (int var44 = 0; var44 < 64; var44++) {
                for (int var45 = 0; var45 < 64; var45++) {
                    if (arg5 != var23 || var44 < var11 || var44 > (var11 + 8) || var45 < var13 || var13 + 8 < var45) {
                        class152.method1098(arg1, 0, 0, -1, 0, 0, false, 0, var19, 0, (byte) 115, -1);
                    } else if ((var11 + 8) == var44 || var13 + 8 == var45) {
                        int var52;
                        int var53;
                        if (arg3 == 0) {
                            var52 = arg0 + var44 - var11;
                            var53 = var45 + arg6 - var13;
                        } else if (arg3 == 1) {
                            var52 = arg0 + var45 - var13;
                            var53 = var11 + arg6 + 8 - var44;
                        } else if (arg3 == 2) {
                            var52 = var11 + arg0 + 8 - var44;
                            var53 = var13 + arg6 + 8 - var45;
                        } else {
                            var53 = arg6 + var44 - var11;
                            var52 = arg0 + var13 + 8 - var45;
                        }
                        class152.method1098(arg1, 0, var20 + var45, var52, arg8, 0, true, 0, var19, var18 + var44, (byte) 82, var53);
                    } else {
                        int var46 = class234.method1603(var45 & 0x7, arg3, false, var44 & 0x7) + arg0;
                        int var47 = class194.method1379((byte) -122, var45 & 0x7, var44 & 0x7, arg3) + arg6;
                        class152.method1098(arg1, var21, var20 + var45, var46, arg8, var22, false, arg3, var19, var18 + var44, (byte) 119, var47);
                        if (var44 == 63 || var45 == 63) {
                            int var48 = var45 == 63 ? 64 : var45;
                            int var49 = var44 == 63 ? 64 : var44;
                            int var50;
                            int var51;
                            if (arg3 == 0) {
                                var50 = var49 + arg0 - var11;
                                var51 = arg6 + var48 - var13;
                            } else if (arg3 == 1) {
                                var50 = arg0 + var48 - var13;
                                var51 = -var49 - (-var11 - arg6 - 8);
                            } else if (arg3 == 2) {
                                var51 = arg6 - (var48 - var13 - 8);
                                var50 = var11 - (var49 - (arg0 + 8));
                            } else {
                                var50 = var13 - (var48 - (arg0 + 8));
                                var51 = -var11 - (-var49 - arg6);
                            }
                            if (var50 >= 0 && var50 < 104 && var51 >= 0 && var51 < 104) {
                                class233.field3684[arg8][var50][var51] = class233.field3684[arg8][var21 + var46][var22 + var47];
                            }
                        }
                    }
                }
            }
        }
        boolean var24 = false;
        boolean var25 = false;
        while (var19.field560.length > var19.field541) {
            int var26 = var19.method265(-90);
            if (var26 == 128) {
                var24 = true;
                class202.field3125[0] = var19.method260((byte) -67);
                class202.field3125[1] = var19.method308((byte) -121);
                class202.field3125[2] = var19.method308((byte) -118);
                class202.field3125[3] = var19.method308((byte) 99);
                class202.field3125[4] = var19.method260((byte) -67);
            } else {
                if (var26 != 129) {
                    var19.field541--;
                    break;
                }
                for (int var27 = 0; var27 < 4; var27++) {
                    byte var28 = var19.method266(-129);
                    if (var28 == 0) {
                        if (var27 <= arg5) {
                            int var36 = arg0;
                            if (arg0 < 0) {
                                var36 = 0;
                            } else if (arg0 >= 104) {
                                var36 = 104;
                            }
                            int var37 = arg0 + 7;
                            int var38 = arg6;
                            if (var37 < 0) {
                                var37 = 0;
                            } else if (var37 >= 104) {
                                var37 = 104;
                            }
                            int var39 = arg6 + 7;
                            if (var39 < 0) {
                                var39 = 0;
                            } else if (var39 >= 104) {
                                var39 = 104;
                            }
                            if (arg6 < 0) {
                                var38 = 0;
                            } else if (arg6 >= 104) {
                                var38 = 104;
                            }
                            while (var37 > var36) {
                                while (var38 < var39) {
                                    class107.field1671[arg8][var36][var38] = 0;
                                    var38++;
                                }
                                var36++;
                            }
                        }
                    } else if (var28 == 1) {
                        for (int var29 = 0; var29 < 64; var29 += 4) {
                            for (int var30 = 0; var30 < 64; var30 += 4) {
                                byte var31 = var19.method266(-129);
                                if (var27 <= arg5) {
                                    for (int var32 = var29; var32 < var29 + 4; var32++) {
                                        for (int var33 = var30; var33 < (var30 + 4); var33++) {
                                            if (var32 >= var11 && var32 < (var11 + 8) && var33 >= var13 && var13 + 8 > var13) {
                                                int var34 = class234.method1603(var33 & 0x7, arg3, false, var32 & 0x7) + arg0;
                                                int var35 = arg6 + class194.method1379((byte) -122, var33 & 0x7, var32 & 0x7, arg3);
                                                if (var34 >= 0 && var34 < 104 && var35 >= 0 && var35 < 104) {
                                                    class107.field1671[arg8][var34][var35] = var31;
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
        if (!var25) {
            int var40 = arg0 + 7;
            int var41 = arg6 + 7;
            for (int var42 = arg0; var42 < var40; var42++) {
                for (int var43 = arg6; var43 < var41; var43++) {
                    class107.field1671[arg8][var42][var43] = 0;
                }
            }
        }
        if (var24) {
            return class202.field3125;
        } else {
            return null;
        }
    }
}
