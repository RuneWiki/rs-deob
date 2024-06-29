import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ku")
public class class536 extends class321 {

    @OriginalMember(owner = "client!ku", name = "j", descriptor = "Lcq;")
    public static class110 field7500 = new class110(93, 6);

    @OriginalMember(owner = "client!ku", name = "k", descriptor = "Loo;")
    public static class41 field7501 = new class41();

    @OriginalMember(owner = "client!ku", name = "l", descriptor = "I")
    public static int field7502;

    @OriginalMember(owner = "client!ku", name = "m", descriptor = "I")
    public static int field7503;

    @OriginalMember(owner = "client!ku", name = "h", descriptor = "Lku;")
    public class536 field7498;

    @OriginalMember(owner = "client!ku", name = "i", descriptor = "Lku;")
    public class536 field7499;

    @OriginalMember(owner = "client!ku", name = "n", descriptor = "Ltf;")
    public static class701 field7504;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ku", name = "o", descriptor = "Ljava/lang/Class;")
    public static Class field7505;

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(IILr;)Z")
    public static final boolean method3005(int arg0, int arg1, class564 arg2) {
        field7502++;
        int var3 = (class142.field1574 - 104) / 2;
        int var4 = (class140.field1550 - 104) / 2;
        boolean var5 = true;
        for (int var6 = var3; var6 < (var3 + 104); var6++) {
            for (int var57 = var4; var57 < (var4 + 104); var57++) {
                for (int var58 = arg0; var58 <= 3; var58++) {
                    if (class457.method2624(-25097, var6, var58, arg0, var57)) {
                        int var59 = var58;
                        if (class568.method3221(var57, var6, 0)) {
                            var59 = var58 - 1;
                        }
                        if (var59 >= 0) {
                            var5 &= class615.method3423(var6, var57, -105, var59);
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
        class256.field3204 = arg2.method1017(var7, 0, 512, 512, 512);
        class252.method1478(arg1 + 951946436);
        int var9 = (((int) (Math.random() * 20.0D)) + 228 << 8) + ((int) (Math.random() * 20.0D) + 228 << 16) - (-238 + (-((int) (Math.random() * 20.0D)) - -10)) | 0xFF000000;
        int var10 = ((int) (Math.random() * 20.0D) + 238 - 10 | 0x518EFF00) << 16;
        int var11 = (int) (Math.random() * 8.0D) | (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D) << 8;
        boolean[][] var12 = new boolean[class421.field5605 + 1][class421.field5605 + 1];
        for (int var13 = var3; var13 < var3 + 104; var13 += class421.field5605) {
            for (int var36 = var4; var36 < var4 + 104; var36 += class421.field5605) {
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
                int var41 = class421.field5605 + var13;
                if (var41 < 104) {
                    var41++;
                }
                int var42 = var36 + class421.field5605;
                if (var42 < 104) {
                    var42++;
                    var38 += 4;
                }
                arg2.method982(0, 0, class421.field5605 * 4 + var37, class421.field5605 * 4 + var38);
                arg2.method1002(-16777216);
                for (int var43 = arg0; var43 <= 3; var43++) {
                    for (int var50 = 0; var50 <= class421.field5605; var50++) {
                        for (int var56 = 0; var56 <= class421.field5605; var56++) {
                            var12[var50][var56] = class457.method2624(-25097, var39 + var50, var43, arg0, var40 + var56);
                        }
                    }
                    class385.field5193[var43].method378(0, 0, 1024, var39, var40, var41, var42, var12);
                    if (!class505.field7274) {
                        for (int var51 = -4; var51 < class421.field5605; var51++) {
                            for (int var52 = -4; var52 < class421.field5605; var52++) {
                                int var53 = var13 + var51;
                                int var54 = var36 + var52;
                                if (var3 <= var53 && var54 >= var4 && class457.method2624(-25097, var53, var43, arg0, var54)) {
                                    int var55 = var43;
                                    if (class568.method3221(var54, var53, arg1 - 31343400)) {
                                        var55 = var43 - 1;
                                    }
                                    if (var55 >= 0) {
                                        class628.method3530(var9, var55, var53, var54, var10, var37 + (var51 * 4), arg1 ^ 0x1DE43A8, arg2, (class421.field5605 - var52) * 4 + var38 - 4);
                                    }
                                }
                            }
                        }
                    }
                }
                if (class505.field7274) {
                    class263 var44 = class282.field3534[arg0];
                    for (int var45 = 0; var45 < class421.field5605; var45++) {
                        for (int var46 = 0; var46 < class421.field5605; var46++) {
                            int var47 = var13 + var45;
                            int var48 = var36 + var46;
                            int var49 = var44.field3286[var47 - var44.field3289][var48 - var44.field3274];
                            if ((var49 & 0x40240000) != 0) {
                                arg2.method3206(4, (byte) 111, var45 * 4 + var37, (class421.field5605 - var46) * 4 + (var38 - 4), -1713569622, 4);
                            } else if ((var49 & 0x800000) != 0) {
                                arg2.method3207(var45 * 4 + var37, var38 + -4 - -((-var46 + class421.field5605) * 4), 4, -1713569622, false);
                            } else if ((var49 & 0x2000000) != 0) {
                                arg2.method3202(1, (class421.field5605 - var46) * 4 + var38 - 4, -1713569622, var45 * 4 + var37 + 3, 4);
                            } else if ((var49 & 0x8000000) != 0) {
                                arg2.method3207(var45 * 4 + var37, var38 - -3 + (-var46 + class421.field5605) * 4 + -4, 4, -1713569622, false);
                            } else if ((var49 & 0x20000000) != 0) {
                                arg2.method3202(1, (class421.field5605 - var46) * 4 + var38 - 4, -1713569622, var45 * 4 + var37, 4);
                            }
                        }
                    }
                }
                arg2.method1022(var37, var38, class421.field5605 * 4, class421.field5605 * 4, var11, 2);
                class256.field3204.method485((var13 - var3) * 4 + 48, 464 - (-var4 + var36) * 4 + -(class421.field5605 * 4), class421.field5605 * 4, class421.field5605 * 4, var37, var38);
            }
        }
        if (arg1 != 31343400) {
            method3005(109, -53, null);
        }
        arg2.method1050();
        arg2.method1002(-16777215);
        class64.method346(8);
        class154.field1709 = 0;
        class138.field1523.method3438(16);
        if (!class505.field7274) {
            for (int var14 = var3; var14 < var3 + 104; var14++) {
                for (int var20 = var4; var20 < (var4 + 104); var20++) {
                    for (int var21 = arg0; var21 <= arg0 + 1 && var21 <= 3; var21++) {
                        if (class457.method2624(-25097, var14, var21, arg0, var20)) {
                            class49 var22 = (class49) class328.method1845(var21, var14, var20);
                            if (var22 == null) {
                                var22 = (class49) class362.method2121(var21, var14, var20, field7505 == null ? (field7505 = method3008("gda")) : field7505);
                            }
                            if (var22 == null) {
                                var22 = (class49) class578.method3272(var21, var14, var20);
                            }
                            if (var22 == null) {
                                var22 = (class49) class411.method2298(var21, var14, var20);
                            }
                            if (var22 != null) {
                                class638 var23 = class364.field4891.method2134(var22.method238(6518), true);
                                if (!var23.field9061 || class190.field2181) {
                                    int var24 = var23.field9069;
                                    if (var23.field8974 != null) {
                                        for (int var25 = 0; var25 < var23.field8974.length; var25++) {
                                            if (var23.field8974[var25] != -1) {
                                                class638 var26 = class364.field4891.method2134(var23.field8974[var25], true);
                                                if (var26.field9069 >= 0) {
                                                    var24 = var26.field9069;
                                                }
                                            }
                                        }
                                    }
                                    if (var24 >= 0) {
                                        boolean var27 = false;
                                        if (var24 >= 0) {
                                            class655 var28 = class247.field3060.method705(var24, -126);
                                            if (var28 != null && var28.field9220) {
                                                var27 = true;
                                            }
                                        }
                                        int var29 = var14;
                                        int var30 = var20;
                                        if (var27) {
                                            int[][] var31 = class282.field3534[var21].field3286;
                                            int var32 = class282.field3534[var21].field3289;
                                            int var33 = class282.field3534[var21].field3274;
                                            for (int var34 = 0; var34 < 10; var34++) {
                                                int var35 = (int) (Math.random() * 4.0D);
                                                if (var35 == 0 && var3 < var29 && var29 > (var14 - 3) && (var31[var29 - var32 - 1][var30 - var33] & 0x2C0108) == 0) {
                                                    var29--;
                                                }
                                                if (var35 == 1 && var3 + 104 - 1 > var29 && var29 < (var14 + 3) && (var31[var29 + 1 - var32][var30 - var33] & 0x2C0180) == 0) {
                                                    var29++;
                                                }
                                                if (var35 == 2 && var30 > var4 && var30 > (var20 - 3) && (var31[var29 - var32][var30 - var33 - 1] & 0x2C0102) == 0) {
                                                    var30--;
                                                }
                                                if (var35 == 3 && var30 < var4 + 103 && var30 < var20 + 3 && (var31[var29 - var32][var30 + 1 - var33] & 0x2C0120) == 0) {
                                                    var30++;
                                                }
                                            }
                                        }
                                        class656.field9235[class154.field1709] = var23.field9021;
                                        class263.field3288[class154.field1709] = var29;
                                        class266.field3325[class154.field1709] = var30;
                                        class154.field1709++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (class313.field3891 != null) {
                class388.field5257.field9837 = 1;
                class247.field3060.method704(1024, 64, true);
                for (int var15 = 0; var15 < class313.field3891.field2043; var15++) {
                    int var16 = class313.field3891.field2040[var15];
                    if (var16 >> 28 == class362.field4859.field5166) {
                        int var17 = (var16 >> 14 & 0x3FFF) - class26.field245;
                        int var18 = (var16 & 0x3FFF) - class231.field2860;
                        if (var17 >= 0 && var17 < class142.field1574 && var18 >= 0 && var18 < class140.field1550) {
                            class138.field1523.method3425(new class22(var15), false);
                        } else {
                            class655 var19 = class247.field3060.method705(class313.field3891.field2041[var15], -127);
                            if (var19.field9217 != null && var19.field9198 + var17 >= 0 && var17 + var19.field9199 < class142.field1574 && var19.field9204 + var18 >= 0 && (var19.field9229 + var18) < class140.field1550) {
                                class138.field1523.method3425(new class22(var15), false);
                            }
                        }
                    }
                }
                class247.field3060.method704(128, 64, true);
                class388.field5257.field9837 = 2;
                class388.field5257.method3867(false);
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(B)V")
    public final void method3006(byte arg0) {
        field7503++;
        if (this.field7498 == null) {
            return;
        }
        this.field7498.field7499 = this.field7499;
        if (arg0 != 118) {
            field7500 = null;
        }
        this.field7499.field7498 = this.field7498;
        this.field7498 = null;
        this.field7499 = null;
    }

    @OriginalMember(owner = "client!ku", name = "b", descriptor = "(B)V")
    public static void method3007(byte arg0) {
        field7504 = null;
        field7500 = null;
        if (arg0 != 40) {
            method3007((byte) -80);
        }
        field7501 = null;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method3008(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
