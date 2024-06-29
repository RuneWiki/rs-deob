import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class165 extends class34 {

    @OriginalMember(owner = "client!sg", name = "t", descriptor = "Z")
    public static boolean field2589 = false;

    @OriginalMember(owner = "client!sg", name = "v", descriptor = "[I")
    public static int[] field2591 = new int[50];

    @OriginalMember(owner = "client!sg", name = "r", descriptor = "Loh;")
    public static class281 field2587 = new class281(64);

    @OriginalMember(owner = "client!sg", name = "s", descriptor = "I")
    public static int field2588;

    @OriginalMember(owner = "client!sg", name = "u", descriptor = "I")
    public static int field2590;

    @OriginalMember(owner = "client!sg", name = "w", descriptor = "I")
    public static int field2592;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(BLai;)Ljava/lang/String;")
    public static final String method1113(byte arg0, class88 arg1) {
        field2588++;
        int var2 = 107 / ((arg0 + 41) / 45);
        return class267.method1800(0, 32767, arg1);
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIIBIZ[Lrh;[B)[I")
    public static final int[] method1114(int arg0, int arg1, int arg2, byte arg3, int arg4, boolean arg5, class47[] arg6, byte[] arg7) {
        field2592++;
        if (!arg5) {
            for (int var8 = 0; var8 < 4; var8++) {
                for (int var9 = 0; var9 < 64; var9++) {
                    for (int var10 = 0; var10 < 64; var10++) {
                        if ((arg0 + var9) > 0 && (arg0 + var9) < 103 && arg2 + var10 > 0 && arg2 + var10 < 103) {
                            arg6[var8].field673[arg0 + var9][arg2 + var10] = class55.method420(arg6[var8].field673[arg0 + var9][arg2 + var10], -2097153);
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
        int var12 = arg1 + arg0;
        int var13 = arg2 + arg4;
        class88 var14 = new class88(arg7);
        for (int var15 = 0; var15 < var11; var15++) {
            for (int var39 = 0; var39 < 64; var39++) {
                for (int var40 = 0; var40 < 64; var40++) {
                    class186.method1255(0, arg5, -108, var13 + var40, arg2 + var40, arg0 + var39, var12 - -var39, false, var15, var14);
                }
            }
        }
        if (arg3 != 14) {
            return null;
        }
        boolean var16 = false;
        boolean var17 = false;
        while (var14.field1535 < var14.field1471.length) {
            int var18 = var14.method633(68);
            if (var18 == 128) {
                var16 = true;
                class264.field4193[0] = var14.method645(arg3 + 11582);
                class264.field4193[1] = var14.method649(arg3 - 16);
                class264.field4193[2] = var14.method649(-2);
                class264.field4193[3] = var14.method649(arg3 - 16);
                class264.field4193[4] = var14.method645(11596);
            } else {
                if (var18 != 129) {
                    var14.field1535--;
                    break;
                }
                for (int var19 = 0; var19 < 4; var19++) {
                    byte var20 = var14.method656(-252);
                    if (var20 == 0) {
                        int var30 = arg0;
                        int var31 = arg0 + 64;
                        int var32 = arg2 + 64;
                        if (var32 < 0) {
                            var32 = 0;
                        } else if (var32 >= 104) {
                            var32 = 104;
                        }
                        if (var31 < 0) {
                            var31 = 0;
                        } else if (var31 >= 104) {
                            var31 = 104;
                        }
                        int var33 = arg2;
                        if (arg0 < 0) {
                            var30 = 0;
                        } else if (arg0 >= 104) {
                            var30 = 104;
                        }
                        if (arg2 < 0) {
                            var33 = 0;
                        } else if (arg2 >= 104) {
                            var33 = 104;
                        }
                        while (var30 < var31) {
                            while (var32 > var33) {
                                class160.field2502[var19][var30][var33] = 0;
                                var33++;
                            }
                            var30++;
                        }
                    } else if (var20 == 1) {
                        for (int var25 = 0; var25 < 64; var25 += 4) {
                            for (int var26 = 0; var26 < 64; var26 += 4) {
                                byte var27 = var14.method656(-252);
                                for (int var28 = arg0 + var25; var28 < (var25 + arg0 + 4); var28++) {
                                    for (int var29 = arg2 + var26; var29 < (var26 + arg2 + 4); var29++) {
                                        if (var28 >= 0 && var28 < 104 && var29 >= 0 && var29 < 104) {
                                            class160.field2502[var19][var28][var29] = var27;
                                        }
                                    }
                                }
                            }
                        }
                    } else if (var20 == 2 && var19 > 0) {
                        int var21 = arg0;
                        if (arg0 < 0) {
                            var21 = 0;
                        } else if (arg0 >= 104) {
                            var21 = 104;
                        }
                        int var22 = arg2;
                        if (arg2 < 0) {
                            var22 = 0;
                        } else if (arg2 >= 104) {
                            var22 = 104;
                        }
                        int var23 = arg2 + 64;
                        if (var23 < 0) {
                            var23 = 0;
                        } else if (var23 >= 104) {
                            var23 = 104;
                        }
                        int var24 = arg0 + 64;
                        if (var24 < 0) {
                            var24 = 0;
                        } else if (var24 >= 104) {
                            var24 = 104;
                        }
                        while (var24 > var21) {
                            while (var23 > var22) {
                                class160.field2502[var19][var21][var22] = class160.field2502[var19 - 1][var21][var22];
                                var22++;
                            }
                            var21++;
                        }
                    }
                }
                var17 = true;
            }
        }
        if (!var17) {
            for (int var34 = 0; var34 < 4; var34++) {
                for (int var35 = 0; var35 < 16; var35++) {
                    for (int var36 = 0; var36 < 16; var36++) {
                        int var37 = (arg0 >> 2) + var35;
                        int var38 = (arg2 >> 2) + var36;
                        if (var37 >= 0 && var37 < 26 && var38 >= 0 && var38 < 26) {
                            class160.field2502[var34][var37][var38] = 0;
                        }
                    }
                }
            }
        }
        if (var16) {
            return class264.field4193;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(II)V")
    public static final void method1115(int arg0, int arg1) {
        class6 var2 = class269.field4298[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class6 var4 = class269.field4298[var3][arg0][arg1] = class269.field4298[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field133--;
                for (int var5 = 0; var5 < var4.field125; var5++) {
                    class293 var6 = var4.field134[var5];
                    if ((var6.field4618 >> 29 & 0x3L) == 2L && var6.field4616 == arg0 && var6.field4612 == arg1) {
                        var6.field4613--;
                    }
                }
            }
        }
        if (class269.field4298[0][arg0][arg1] == null) {
            class269.field4298[0][arg0][arg1] = new class6(0, arg0, arg1);
        }
        class269.field4298[0][arg0][arg1].field145 = var2;
        class269.field4298[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(B)V")
    public static void method1116(byte arg0) {
        field2587 = null;
        field2591 = null;
        if (arg0 >= -73) {
            method1115(82, -32);
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(ILhc;Lhc;)V")
    public static final void method1117(int arg0, class235 arg1, class235 arg2) {
        class115.field1880 = arg2;
        class216.field3346 = arg1;
        int var3 = (int) (Math.random() * 21.0D) - 10;
        field2590++;
        class115.field1880.method1616(34, -12772);
        if (arg0 < 17) {
            method1116((byte) -3);
        }
        int var4 = (int) (Math.random() * 21.0D) - 10;
        int var5 = (int) (Math.random() * 41.0D) - 20;
        class20.field302 = var4 + var5;
        class46.field657 = var3 + var5;
        int var6 = (int) (Math.random() * 21.0D) - 10;
        class99.field1668 = var5 + var6;
    }
}
