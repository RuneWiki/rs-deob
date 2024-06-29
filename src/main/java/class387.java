import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class387 extends class223 {

    @OriginalMember(owner = "client!mf", name = "n", descriptor = "Lqfa;")
    public static class85 field5666 = new class85(79, 6);

    @OriginalMember(owner = "client!mf", name = "p", descriptor = "Lsb;")
    public static class266 field5668 = new class266(11, 6);

    @OriginalMember(owner = "client!mf", name = "o", descriptor = "I")
    public static int field5667;

    // $FF: synthetic field
    @OriginalMember(owner = "client!mf", name = "q", descriptor = "Ljava/lang/Class;")
    public static Class field5669;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(ILr;I)Z")
    public static final boolean method2387(int arg0, class167 arg1, int arg2) {
        field5667++;
        int var3 = (class675.field9604 - 104) / 2;
        int var4 = (class218.field3316 - 104) / 2;
        boolean var5 = true;
        for (int var6 = var3; var6 < var3 + 104; var6++) {
            for (int var57 = var4; var57 < var4 + 104; var57++) {
                for (int var58 = arg0; var58 <= 3; var58++) {
                    if (class575.method3300(arg0, var58, var57, (byte) -16, var6)) {
                        int var59 = var58;
                        if (class89.method868(5125, var6, var57)) {
                            var59 = var58 - 1;
                        }
                        if (var59 >= 0) {
                            var5 &= class515.method3038(var57, var6, var59, 9200);
                        }
                    }
                }
            }
        }
        if (!var5) {
            return false;
        }
        int[] var7 = new int[262144];
        for (int var8 = 0; var8 < var7.length; var8++) {
            var7[var8] = -16777216;
        }
        class339.field5053 = arg1.method54(var7, 0, 512, 512, 512);
        class691.method3869(-240);
        int var9 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) - (-((int) (Math.random() * 20.0D) + 228 << 8) - ((int) (Math.random() * 20.0D) + 238)) - 10 | 0xFF000000;
        int var10 = ((int) (Math.random() * 20.0D) + 238 - 10 | 0x7818FF00) << 16;
        if (arg2 != 1024) {
            field5668 = null;
        }
        int var11 = (int) (Math.random() * 8.0D) | (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D) << 8;
        boolean[][] var12 = new boolean[class108.field1913 + 1][class108.field1913 + 1];
        for (int var13 = var3; var13 < var3 + 104; var13 += class108.field1913) {
            for (int var36 = var4; var36 < (var4 + 104); var36 += class108.field1913) {
                int var37 = 0;
                int var38 = 0;
                int var39 = var13;
                if (var13 > 0) {
                    var39 = var13 - 1;
                    var37 += 4;
                }
                int var40 = var36;
                if (var36 > 0) {
                    var40 = var36 - 1;
                }
                int var41 = class108.field1913 + var13;
                if (var41 < 104) {
                    var41++;
                }
                int var42 = class108.field1913 + var36;
                if (var42 < 104) {
                    var38 += 4;
                    var42++;
                }
                arg1.method142(0, 0, var37 + (class108.field1913 * 4), class108.field1913 * 4 + var38);
                arg1.method42(-16777216);
                for (int var43 = arg0; var43 <= 3; var43++) {
                    for (int var50 = 0; var50 <= class108.field1913; var50++) {
                        for (int var56 = 0; var56 <= class108.field1913; var56++) {
                            var12[var50][var56] = class575.method3300(arg0, var43, var40 + var56, (byte) -16, var39 + var50);
                        }
                    }
                    class185.field2987[var43].method553(0, 0, 1024, var39, var40, var41, var42, var12);
                    if (!class254.field3765) {
                        for (int var51 = -4; var51 < class108.field1913; var51++) {
                            for (int var52 = -4; var52 < class108.field1913; var52++) {
                                int var53 = var13 + var51;
                                int var54 = var36 + var52;
                                if (var53 >= var3 && var54 >= var4 && class575.method3300(arg0, var43, var54, (byte) -16, var53)) {
                                    int var55 = var43;
                                    if (class89.method868(5125, var53, var54)) {
                                        var55 = var43 - 1;
                                    }
                                    if (var55 >= 0) {
                                        class635.method3623(false, (class108.field1913 - var52) * 4 + var38 - 4, var51 * 4 + var37, var9, var55, var54, var53, var10, arg1);
                                    }
                                }
                            }
                        }
                    }
                }
                if (class254.field3765) {
                    class605 var44 = class223.field3352[arg0];
                    for (int var45 = 0; var45 < class108.field1913; var45++) {
                        for (int var46 = 0; var46 < class108.field1913; var46++) {
                            int var47 = var13 + var45;
                            int var48 = var36 + var46;
                            int var49 = var44.field8803[var47 - var44.field8796][var48 - var44.field8807];
                            if ((var49 & 0x40240000) != 0) {
                                arg1.method1267((class108.field1913 - var46) * 4 + var38 - 4, 4, 1, 4, var45 * 4 + var37, -1713569622);
                            } else if ((var49 & 0x800000) != 0) {
                                arg1.method1270(var45 * 4 + var37, -1713569622, 4, (byte) -32, var38 + ((class108.field1913 - var46) * 4) - 4);
                            } else if ((var49 & 0x2000000) != 0) {
                                arg1.method1272((byte) 22, var37 + (var45 * 4) + 3, 4, -1713569622, (class108.field1913 - var46) * 4 + var38 - 4);
                            } else if ((var49 & 0x8000000) != 0) {
                                arg1.method1270(var45 * 4 + var37, -1713569622, 4, (byte) -32, (class108.field1913 - var46) * 4 + var38 - 1);
                            } else if ((var49 & 0x20000000) != 0) {
                                arg1.method1272((byte) 49, var45 * 4 + var37, 4, -1713569622, (class108.field1913 - var46) * 4 + var38 - 4);
                            }
                        }
                    }
                }
                arg1.method4(var37, var38, class108.field1913 * 4, class108.field1913 * 4, var11, 2);
                class339.field5053.method1742((var13 - var3) * 4 + 48, -((-var4 + var36) * 4) + 464 - class108.field1913 * 4, class108.field1913 * 4, class108.field1913 * 4, var37, var38);
            }
        }
        arg1.method107();
        arg1.method42(-16777215);
        class293.method1954(0);
        class232.field3482 = 0;
        class86.field1619.method1222((byte) -94);
        if (!class254.field3765) {
            for (int var14 = var3; var14 < var3 + 104; var14++) {
                for (int var20 = var4; var20 < var4 + 104; var20++) {
                    for (int var21 = arg0; arg0 + 1 >= var21 && var21 <= 3; var21++) {
                        if (class575.method3300(arg0, var21, var20, (byte) -16, var14)) {
                            class83 var22 = (class83) class697.method3897(var21, var14, var20);
                            if (var22 == null) {
                                var22 = (class83) class63.method756(var21, var14, var20, field5669 == null ? (field5669 = method2389("qu")) : field5669);
                            }
                            if (var22 == null) {
                                var22 = (class83) class264.method1729(var21, var14, var20);
                            }
                            if (var22 == null) {
                                var22 = (class83) class275.method1797(var21, var14, var20);
                            }
                            if (var22 != null) {
                                class56 var23 = class237.field3521.method3515(var22.method841((byte) 52), 50);
                                if (!var23.field1254 || class294.field4411) {
                                    int var24 = var23.field1296;
                                    if (var23.field1248 != null) {
                                        for (int var25 = 0; var25 < var23.field1248.length; var25++) {
                                            if (var23.field1248[var25] != -1) {
                                                class56 var26 = class237.field3521.method3515(var23.field1248[var25], arg2 ^ 0x432);
                                                if (var26.field1296 >= 0) {
                                                    var24 = var26.field1296;
                                                }
                                            }
                                        }
                                    }
                                    if (var24 >= 0) {
                                        boolean var27 = false;
                                        if (var24 >= 0) {
                                            class288 var28 = class342.field5099.method3355(var24, (byte) -127);
                                            if (var28 != null && var28.field4301) {
                                                var27 = true;
                                            }
                                        }
                                        int var29 = var14;
                                        int var30 = var20;
                                        if (var27) {
                                            int[][] var31 = class223.field3352[var21].field8803;
                                            int var32 = class223.field3352[var21].field8796;
                                            int var33 = class223.field3352[var21].field8807;
                                            for (int var34 = 0; var34 < 10; var34++) {
                                                int var35 = (int) (Math.random() * 4.0D);
                                                if (var35 == 0 && var3 < var29 && var29 > (var14 - 3) && (var31[var29 - var32 - 1][var30 - var33] & 0x2C0108) == 0) {
                                                    var29--;
                                                }
                                                if (var35 == 1 && (var3 + 104 - 1) > var29 && var14 + 3 > var29 && (var31[var29 + 1 - var32][var30 - var33] & 0x2C0180) == 0) {
                                                    var29++;
                                                }
                                                if (var35 == 2 && var30 > var4 && var30 > var20 - 3 && (var31[var29 - var32][var30 - var33 - 1] & 0x2C0102) == 0) {
                                                    var30--;
                                                }
                                                if (var35 == 3 && var30 < var4 + 104 - 1 && var30 < (var20 + 3) && (var31[var29 - var32][var30 + 1 - var33] & 0x2C0120) == 0) {
                                                    var30++;
                                                }
                                            }
                                        }
                                        class471.field6685[class232.field3482] = var23.field1272;
                                        class157.field2680[class232.field3482] = var29;
                                        class705.field9927[class232.field3482] = var30;
                                        class232.field3482++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (class696.field9803 != null) {
                class213.field3263.field5152 = 1;
                class342.field5099.method3356((byte) 119, 64, 1024);
                for (int var15 = 0; var15 < class696.field9803.field3034; var15++) {
                    int var16 = class696.field9803.field3036[var15];
                    if ((var16 >> 28) == class532.field7456.field9814) {
                        int var17 = (var16 >> 14 & 0x3FFF) - class33.field967;
                        int var18 = (var16 & 0x3FFF) - class323.field4749;
                        if (var17 >= 0 && class675.field9604 > var17 && var18 >= 0 && class218.field3316 > var18) {
                            class86.field1619.method1229(new class149(var15), (byte) 120);
                        } else {
                            class288 var19 = class342.field5099.method3355(class696.field9803.field3035[var15], (byte) -128);
                            if (var19.field4295 != null && var19.field4315 + var17 >= 0 && var19.field4333 + var17 < class675.field9604 && (var19.field4307 + var18) >= 0 && class218.field3316 > var19.field4332 + var18) {
                                class86.field1619.method1229(new class149(var15), (byte) 120);
                            }
                        }
                    }
                }
                class342.field5099.method3356((byte) 115, 64, 128);
                class213.field3263.field5152 = 2;
                class213.field3263.method2225((byte) -116);
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "(I)V")
    public static void method2388(int arg0) {
        if (arg0 >= -53) {
            field5668 = null;
        }
        field5666 = null;
        field5668 = null;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2389(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
