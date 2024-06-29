import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class160 {

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "I")
    public static int field2521 = 1;

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "I")
    public static int field2523 = -1;

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "Lec;")
    public static class25 field2525 = new class25(20);

    @OriginalMember(owner = "client!mh", name = "h", descriptor = "Ljava/lang/String;")
    public static String field2528 = "Connected to update server";

    @OriginalMember(owner = "client!mh", name = "j", descriptor = "Ljava/lang/String;")
    public static String field2530 = " from your friend list first.";

    @OriginalMember(owner = "client!mh", name = "i", descriptor = "[Lwk;")
    public static class295[] field2529 = new class295[6];

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "I")
    public static int field2522;

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "I")
    public int field2524;

    @OriginalMember(owner = "client!mh", name = "g", descriptor = "I")
    public static int field2527;

    @OriginalMember(owner = "client!mh", name = "k", descriptor = "I")
    public static int field2531;

    @OriginalMember(owner = "client!mh", name = "f", descriptor = "Ljava/lang/String;")
    public String field2526;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(B)V")
    public static void method1061(byte arg0) {
        field2528 = null;
        if (arg0 != 78) {
            field2523 = 94;
        }
        field2525 = null;
        field2530 = null;
        field2529 = null;
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(B)V")
    public static final void method1062(byte arg0) {
        class107.field1653 = null;
        field2522++;
        if (arg0 != 42) {
            method1061((byte) -13);
        }
        class237.method1643(0, 0, 0, -1, field2523, class79.field1254, class169.field2644, -78, 0);
        if (class107.field1653 != null) {
            class209.method1484(class79.field1254, class227.field3593, class197.field3130.field4072, 0, class107.field1653, arg0 - 168, class169.field2644, -1412584499, class156.field2475, 0);
            class107.field1653 = null;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "([B[Lwi;BIIZII)[I")
    public static final int[] method1063(byte[] arg0, class142[] arg1, byte arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        field2531++;
        if (!arg5) {
            for (int var8 = 0; var8 < 4; var8++) {
                for (int var9 = 0; var9 < 64; var9++) {
                    for (int var10 = 0; var10 < 64; var10++) {
                        if (arg3 + var9 > 0 && (arg3 + var9) < 103 && (arg7 + var10) > 0 && (arg7 + var10) < 103) {
                            arg1[var8].field2211[arg3 + var9][arg7 + var10] = class10.method53(arg1[var8].field2211[arg3 + var9][arg7 + var10], -2097153);
                        }
                    }
                }
            }
        }
        byte var11;
        if (arg5) {
            var11 = 1;
        } else {
            var11 = 4;
        }
        if (arg2 != 78) {
            method1061((byte) 27);
        }
        class202 var12 = new class202(arg0);
        int var13 = arg3 + arg6;
        int var14 = arg4 + arg7;
        for (int var15 = 0; var15 < var11; var15++) {
            for (int var39 = 0; var39 < 64; var39++) {
                for (int var40 = 0; var40 < 64; var40++) {
                    class164.method1104(var14 + var40, arg5, var15, arg3 + var39, 0, 0, var12, 0, var13 + var39, (byte) -122, arg7 + var40, false);
                }
            }
        }
        boolean var16 = false;
        boolean var17 = false;
        while (var12.field3234.length > var12.field3272) {
            int var18 = var12.method1420((byte) 0);
            if (var18 == 128) {
                class179.field2779[0] = var12.method1419(120);
                var17 = true;
                class179.field2779[1] = var12.method1442(-1970239824);
                class179.field2779[2] = var12.method1442(arg2 - 1970239902);
                class179.field2779[3] = var12.method1442(-1970239824);
                class179.field2779[4] = var12.method1419(123);
            } else {
                if (var18 != 129) {
                    var12.field3272--;
                    break;
                }
                for (int var19 = 0; var19 < 4; var19++) {
                    byte var20 = var12.method1457((byte) -80);
                    if (var20 == 0) {
                        int var30 = arg3;
                        int var31 = arg3 + 64;
                        int var32 = arg7;
                        if (arg7 < 0) {
                            var32 = 0;
                        } else if (arg7 >= 104) {
                            var32 = 104;
                        }
                        if (arg3 < 0) {
                            var30 = 0;
                        } else if (arg3 >= 104) {
                            var30 = 104;
                        }
                        if (var31 < 0) {
                            var31 = 0;
                        } else if (var31 >= 104) {
                            var31 = 104;
                        }
                        int var33 = arg7 + 64;
                        if (var33 < 0) {
                            var33 = 0;
                        } else if (var33 >= 104) {
                            var33 = 104;
                        }
                        while (var31 > var30) {
                            while (var32 < var33) {
                                class148.field2318[var19][var30][var32] = 0;
                                var32++;
                            }
                            var30++;
                        }
                    } else if (var20 == 1) {
                        for (int var25 = 0; var25 < 64; var25 += 4) {
                            for (int var26 = 0; var26 < 64; var26 += 4) {
                                byte var27 = var12.method1457((byte) -78);
                                for (int var28 = arg3 + var25; var28 < arg3 + var25 + 4; var28++) {
                                    for (int var29 = var26 + arg7; var29 < arg7 + var26 + 4; var29++) {
                                        if (var28 >= 0 && var28 < 104 && var29 >= 0 && var29 < 104) {
                                            class148.field2318[var19][var28][var29] = var27;
                                        }
                                    }
                                }
                            }
                        }
                    } else if (var20 == 2 && var19 > 0) {
                        int var21 = arg3;
                        int var22 = arg3 + 64;
                        int var23 = arg7;
                        if (arg7 < 0) {
                            var23 = 0;
                        } else if (arg7 >= 104) {
                            var23 = 104;
                        }
                        if (var22 < 0) {
                            var22 = 0;
                        } else if (var22 >= 104) {
                            var22 = 104;
                        }
                        int var24 = arg7 + 64;
                        if (arg3 < 0) {
                            var21 = 0;
                        } else if (arg3 >= 104) {
                            var21 = 104;
                        }
                        if (var24 < 0) {
                            var24 = 0;
                        } else if (var24 >= 104) {
                            var24 = 104;
                        }
                        while (var22 > var21) {
                            while (var24 > var23) {
                                class148.field2318[var19][var21][var23] = class148.field2318[var19 - 1][var21][var23];
                                var23++;
                            }
                            var21++;
                        }
                    }
                }
                var16 = true;
            }
        }
        if (!var16) {
            for (int var34 = 0; var34 < 4; var34++) {
                for (int var35 = 0; var35 < 16; var35++) {
                    for (int var36 = 0; var36 < 16; var36++) {
                        int var37 = (arg7 >> 2) + var36;
                        int var38 = (arg3 >> 2) + var35;
                        if (var38 >= 0 && var38 < 26 && var37 >= 0 && var37 < 26) {
                            class148.field2318[var34][var38][var37] = 0;
                        }
                    }
                }
            }
        }
        if (var17) {
            return class179.field2779;
        } else {
            return null;
        }
    }
}
