import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class313 {

    @OriginalMember(owner = "client!li", name = "c", descriptor = "[I")
    public static int[] field5038 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!li", name = "a", descriptor = "I")
    public static int field5036;

    @OriginalMember(owner = "client!li", name = "b", descriptor = "Z")
    public static boolean field5037;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(II[Lkb;[BIZII)[I")
    public static final int[] method2108(int arg0, int arg1, class55[] arg2, byte[] arg3, int arg4, boolean arg5, int arg6, int arg7) {
        field5036++;
        if (!arg5) {
            for (int var8 = 0; var8 < 4; var8++) {
                for (int var9 = 0; var9 < 64; var9++) {
                    for (int var10 = 0; var10 < 64; var10++) {
                        if ((arg1 + var9) > 0 && (arg1 + var9) < 103 && (arg6 + var10) > 0 && arg6 + var10 < 103) {
                            arg2[var8].field811[arg1 + var9][arg6 + var10] = class233.method1609(arg2[var8].field811[arg1 + var9][arg6 + var10], -2097153);
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
        class274 var12 = new class274(arg3);
        int var13 = arg4 + arg1;
        int var14 = arg6 + arg7;
        int var15 = 0;
        if (arg0 != 3) {
            return null;
        }
        while (var11 > var15) {
            for (int var39 = 0; var39 < 64; var39++) {
                for (int var40 = 0; var40 < 64; var40++) {
                    class138.method955(0, 0, var13 + var39, var15, arg6 + var40, 0, false, arg1 + var39, var14 + var40, true, var12, arg5);
                }
            }
            var15++;
        }
        boolean var16 = false;
        boolean var17 = false;
        while (var12.field4441.length > var12.field4458) {
            int var18 = var12.method1849(255);
            if (var18 == 128) {
                class93.field1474[0] = var12.method1837(252);
                var17 = true;
                class93.field1474[1] = var12.method1847(-404);
                class93.field1474[2] = var12.method1847(-404);
                class93.field1474[3] = var12.method1847(class81.method582(arg0, -401));
                class93.field1474[4] = var12.method1837(arg0 + 249);
            } else {
                if (var18 != 129) {
                    var12.field4458--;
                    break;
                }
                var16 = true;
                for (int var19 = 0; var19 < 4; var19++) {
                    byte var20 = var12.method1830((byte) -62);
                    if (var20 == 0) {
                        int var21 = arg1;
                        if (arg1 < 0) {
                            var21 = 0;
                        } else if (arg1 >= 104) {
                            var21 = 104;
                        }
                        int var22 = arg1 + 64;
                        int var23 = arg6;
                        int var24 = arg6 + 64;
                        if (arg6 < 0) {
                            var23 = 0;
                        } else if (arg6 >= 104) {
                            var23 = 104;
                        }
                        if (var22 < 0) {
                            var22 = 0;
                        } else if (var22 >= 104) {
                            var22 = 104;
                        }
                        if (var24 < 0) {
                            var24 = 0;
                        } else if (var24 >= 104) {
                            var24 = 104;
                        }
                        while (var22 > var21) {
                            while (var23 < var24) {
                                class54.field789[var19][var21][var23] = 0;
                                var23++;
                            }
                            var21++;
                        }
                    } else if (var20 == 1) {
                        for (int var25 = 0; var25 < 64; var25 += 4) {
                            for (int var26 = 0; var26 < 64; var26 += 4) {
                                byte var27 = var12.method1830((byte) -98);
                                for (int var28 = arg1 + var25; var28 < var25 + arg1 + 4; var28++) {
                                    for (int var29 = arg6 + var26; var29 < var26 + arg6 + 4; var29++) {
                                        if (var28 >= 0 && var28 < 104 && var29 >= 0 && var29 < 104) {
                                            class54.field789[var19][var28][var29] = var27;
                                        }
                                    }
                                }
                            }
                        }
                    } else if (var20 == 2 && var19 > 0) {
                        int var30 = arg1;
                        if (arg1 < 0) {
                            var30 = 0;
                        } else if (arg1 >= 104) {
                            var30 = 104;
                        }
                        int var31 = arg1 + 64;
                        if (var31 < 0) {
                            var31 = 0;
                        } else if (var31 >= 104) {
                            var31 = 104;
                        }
                        int var32 = arg6;
                        int var33 = arg6 + 64;
                        if (var33 < 0) {
                            var33 = 0;
                        } else if (var33 >= 104) {
                            var33 = 104;
                        }
                        if (arg6 < 0) {
                            var32 = 0;
                        } else if (arg6 >= 104) {
                            var32 = 104;
                        }
                        while (var31 > var30) {
                            while (var32 < var33) {
                                class54.field789[var19][var30][var32] = class54.field789[var19 - 1][var30][var32];
                                var32++;
                            }
                            var30++;
                        }
                    }
                }
            }
        }
        if (!var16) {
            for (int var34 = 0; var34 < 4; var34++) {
                for (int var35 = 0; var35 < 16; var35++) {
                    for (int var36 = 0; var36 < 16; var36++) {
                        int var37 = (arg1 >> 2) + var35;
                        int var38 = (arg6 >> 2) + var36;
                        if (var37 >= 0 && var37 < 26 && var38 >= 0 && var38 < 26) {
                            class54.field789[var34][var37][var38] = 0;
                        }
                    }
                }
            }
        }
        if (var17) {
            return class93.field1474;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Z)V")
    public static void method2109(boolean arg0) {
        field5038 = null;
        if (!arg0) {
            method2108(8, 122, (class55[]) null, (byte[]) null, 51, false, -40, -112);
        }
    }
}
