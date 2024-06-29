import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class243 {

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "[I")
    public static int[] field3636 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "I")
    public static int field3639 = 0;

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "I")
    public static int field3638 = 0;

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "Ljava/lang/String;")
    public static String field3637 = "Loading textures - ";

    @OriginalMember(owner = "client!gh", name = "g", descriptor = "Lpd;")
    public static class3 field3641 = new class3(16);

    @OriginalMember(owner = "client!gh", name = "k", descriptor = "Lik;")
    public static class274 field3645 = new class274();

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "I")
    public static int field3635;

    @OriginalMember(owner = "client!gh", name = "f", descriptor = "I")
    public static int field3640;

    @OriginalMember(owner = "client!gh", name = "j", descriptor = "I")
    public static int field3644;

    @OriginalMember(owner = "client!gh", name = "i", descriptor = "Lpk;")
    public static class120 field3643;

    @OriginalMember(owner = "client!gh", name = "h", descriptor = "Lbn;")
    public static class72 field3642;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(III)V", line = 9)
    public static final void method1715(int arg0, int arg1, int arg2) {
        if (arg2 >= -82) {
            method1716(118, -33, (String) null, -33, -110);
        }
        field3644++;
        class170 var3 = class221.method1613(1, arg0, -8410);
        var3.method1269(false);
        var3.field2730 = arg1;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IILjava/lang/String;II)V", line = 23)
    public static final void method1716(int arg0, int arg1, String arg2, int arg3, int arg4) {
        field3635++;
        class266 var5 = class77.method604(arg3, arg4, -10316);
        if (var5 == null) {
            return;
        }
        if (var5.field4037 != null) {
            class150 var6 = new class150();
            var6.field2459 = arg1;
            var6.field2450 = var5.field4037;
            var6.field2458 = var5;
            var6.field2442 = arg2;
            class172.method1280(var6, (byte) 12);
        }
        boolean var7 = true;
        if (arg0 >= -46) {
            return;
        }
        if (var5.field4064 > 0) {
            var7 = class291.method2041(-111, var5);
        }
        if (!var7 || !client.method1867(var5).method1779(-1, arg1 - 1)) {
            return;
        }
        if (arg1 == 1) {
            class209.field3296++;
            class209.field3305.method1808((byte) -74, 152);
            class209.field3305.method11(arg4, 31932);
            class209.field3305.method14(-246866616, arg3);
        }
        if (arg1 == 2) {
            class149.field2431++;
            class209.field3305.method1808((byte) -74, 126);
            class209.field3305.method11(arg4, 31932);
            class209.field3305.method14(-246866616, arg3);
        }
        if (arg1 == 3) {
            class121.field1977++;
            class209.field3305.method1808((byte) -74, 12);
            class209.field3305.method11(arg4, 31932);
            class209.field3305.method14(-246866616, arg3);
        }
        if (arg1 == 4) {
            class150.field2451++;
            class209.field3305.method1808((byte) -74, 70);
            class209.field3305.method11(arg4, 31932);
            class209.field3305.method14(-246866616, arg3);
        }
        if (arg1 == 5) {
            class209.field3305.method1808((byte) -74, 190);
            class226.field3501++;
            class209.field3305.method11(arg4, 31932);
            class209.field3305.method14(-246866616, arg3);
        }
        if (arg1 == 6) {
            class25.field424++;
            class209.field3305.method1808((byte) -74, 117);
            class209.field3305.method11(arg4, 31932);
            class209.field3305.method14(-246866616, arg3);
        }
        if (arg1 == 7) {
            class209.field3305.method1808((byte) -74, 158);
            class209.field3305.method11(arg4, 31932);
            class118.field1918++;
            class209.field3305.method14(-246866616, arg3);
        }
        if (arg1 == 8) {
            class105.field1729++;
            class209.field3305.method1808((byte) -74, 63);
            class209.field3305.method11(arg4, 31932);
            class209.field3305.method14(-246866616, arg3);
        }
        if (arg1 == 9) {
            class190.field2984++;
            class209.field3305.method1808((byte) -74, 44);
            class209.field3305.method11(arg4, 31932);
            class209.field3305.method14(-246866616, arg3);
        }
        if (arg1 == 10) {
            class171.field2753++;
            class209.field3305.method1808((byte) -74, 165);
            class209.field3305.method11(arg4, 31932);
            class209.field3305.method14(-246866616, arg3);
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(B)V", line = 156)
    public static void method1717(byte arg0) {
        field3637 = null;
        field3643 = null;
        field3642 = null;
        field3641 = null;
        field3645 = null;
        field3636 = null;
        if (arg0 >= -1) {
            field3645 = (class274) null;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIZI[B[Lmf;II)[I", line = 183)
    public static final int[] method1718(int arg0, int arg1, boolean arg2, int arg3, byte[] arg4, class53[] arg5, int arg6, int arg7) {
        byte var8;
        if (arg2) {
            var8 = 1;
        } else {
            var8 = 4;
        }
        field3640++;
        if (!arg2) {
            for (int var9 = 0; var9 < 4; var9++) {
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        if ((arg7 + var10) > 0 && arg7 + var10 < 103 && (arg3 + var11) > 0 && (arg3 + var11) < 103) {
                            arg5[var9].field796[arg7 + var10][arg3 + var11] = class164.method1234(arg5[var9].field796[arg7 + var10][arg3 + var11], -2097153);
                        }
                    }
                }
            }
        }
        class1 var12 = new class1(arg4);
        int var13 = arg0 + arg3;
        int var14 = arg1 + arg7;
        for (int var15 = 0; var15 < var8; var15++) {
            for (int var16 = 0; var16 < 64; var16++) {
                for (int var17 = 0; var17 < 64; var17++) {
                    class242.method1710(var12, false, var13 + var17, arg3 + var17, var15, arg7 + var16, 0, 0, var14 + var16, 0, arg2, (byte) 40);
                }
            }
        }
        boolean var18 = false;
        if (arg6 != 13) {
            return (int[]) null;
        }
        boolean var19 = false;
        while (var12.field48 < var12.field34.length) {
            int var20 = var12.method15((byte) 114);
            if (var20 == 128) {
                var18 = true;
                class282.field4417[0] = var12.method56(arg6 + 19599);
                class282.field4417[1] = var12.method41((byte) -66);
                class282.field4417[2] = var12.method41((byte) -66);
                class282.field4417[3] = var12.method41((byte) -66);
                class282.field4417[4] = var12.method56(arg6 + 19599);
            } else {
                if (var20 != 129) {
                    var12.field48--;
                    break;
                }
                var19 = true;
                for (int var21 = 0; var21 < 4; var21++) {
                    byte var22 = var12.method55(arg6 - 9);
                    if (var22 == 0) {
                        int var32 = arg7;
                        int var33 = arg7 + 64;
                        if (var33 < 0) {
                            var33 = 0;
                        } else if (var33 >= 104) {
                            var33 = 104;
                        }
                        if (arg7 < 0) {
                            var32 = 0;
                        } else if (arg7 >= 104) {
                            var32 = 104;
                        }
                        int var34 = arg3 + 64;
                        int var35 = arg3;
                        if (var34 < 0) {
                            var34 = 0;
                        } else if (var34 >= 104) {
                            var34 = 104;
                        }
                        if (arg3 < 0) {
                            var35 = 0;
                        } else if (arg3 >= 104) {
                            var35 = 104;
                        }
                        while (var33 > var32) {
                            while (var35 < var34) {
                                class50.field766[var21][var32][var35] = 0;
                                var35++;
                            }
                            var32++;
                        }
                    } else if (var22 == 1) {
                        for (int var27 = 0; var27 < 64; var27 += 4) {
                            for (int var28 = 0; var28 < 64; var28 += 4) {
                                byte var29 = var12.method55(4);
                                for (int var30 = arg7 + var27; var30 < arg7 + var27 + 4; var30++) {
                                    for (int var31 = arg3 + var28; var31 < (var28 + arg3 + 4); var31++) {
                                        if (var30 >= 0 && var30 < 104 && var31 >= 0 && var31 < 104) {
                                            class50.field766[var21][var30][var31] = var29;
                                        }
                                    }
                                }
                            }
                        }
                    } else if (var22 == 2 && var21 > 0) {
                        int var23 = arg7;
                        if (arg7 < 0) {
                            var23 = 0;
                        } else if (arg7 >= 104) {
                            var23 = 104;
                        }
                        int var24 = arg7 + 64;
                        int var25 = arg3;
                        if (arg3 < 0) {
                            var25 = 0;
                        } else if (arg3 >= 104) {
                            var25 = 104;
                        }
                        if (var24 < 0) {
                            var24 = 0;
                        } else if (var24 >= 104) {
                            var24 = 104;
                        }
                        int var26 = arg3 + 64;
                        if (var26 < 0) {
                            var26 = 0;
                        } else if (var26 >= 104) {
                            var26 = 104;
                        }
                        while (var24 > var23) {
                            while (var26 > var25) {
                                class50.field766[var21][var23][var25] = class50.field766[var21 - 1][var23][var25];
                                var25++;
                            }
                            var23++;
                        }
                    }
                }
            }
        }
        if (class162.field2623 && !arg2) {
            class75 var36 = null;
            while (true) {
                while (var12.field34.length > var12.field48) {
                    int var37 = var12.method15((byte) 97);
                    if (var37 == 0) {
                        var36 = new class75(var12);
                    } else if (var37 == 1) {
                        int var38 = var12.method15((byte) 121);
                        if (var38 > 0) {
                            for (int var39 = 0; var39 < var38; var39++) {
                                class253 var40 = new class253(var12);
                                if (var40.field3731 == 31) {
                                    class166 var41 = class155.method1159(0, var12.method56(arg6 ^ 0x4C91));
                                    var40.method1757(var41.field2685, var41.field2683, (byte) 46, var41.field2678, var41.field2676);
                                }
                                var40.field3725 += arg7 << 7;
                                var40.field3747 += arg3 << 7;
                                int var42 = var40.field3725 >> 7;
                                int var43 = var40.field3747 >> 7;
                                if (var42 >= 0 && var43 >= 0 && var42 < 104 && var43 < 104) {
                                    var40.field3737 = (class332.field5184[1][var42][var43] & 0x2) != 0;
                                    var40.field3723 = class85.field1374[var40.field3736][var42][var43] - var40.field3723;
                                    class219.method1589(var40);
                                }
                            }
                        }
                    } else if (var37 == 2) {
                        if (var36 == null) {
                            var36 = new class75();
                        }
                        var36.method593(-103, var12);
                    } else {
                        throw new IllegalStateException();
                    }
                }
                if (var36 == null) {
                    var36 = new class75();
                }
                for (int var44 = 0; var44 < 8; var44++) {
                    for (int var45 = 0; var45 < 8; var45++) {
                        int var46 = (arg7 >> 3) + var44;
                        int var47 = (arg3 >> 3) + var45;
                        if (var46 >= 0 && var46 < 13 && var47 >= 0 && var47 < 13) {
                            class155.field2520[var46][var47] = var36;
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
                        int var51 = (arg7 >> 2) + var49;
                        int var52 = (arg3 >> 2) + var50;
                        if (var51 >= 0 && var51 < 26 && var52 >= 0 && var52 < 26) {
                            class50.field766[var48][var51][var52] = 0;
                        }
                    }
                }
            }
        }
        return var18 ? class282.field4417 : null;
    }
}
