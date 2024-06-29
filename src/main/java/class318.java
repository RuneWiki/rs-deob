import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class318 {

    @OriginalMember(owner = "client!na", name = "a", descriptor = "I")
    public static int field4617;

    @OriginalMember(owner = "client!na", name = "b", descriptor = "I")
    public static int field4618;

    @OriginalMember(owner = "client!na", name = "c", descriptor = "I")
    public static int field4619;

    @OriginalMember(owner = "client!na", name = "d", descriptor = "Lfa;")
    public static class482 field4620;

    // $FF: synthetic field
    @OriginalMember(owner = "client!na", name = "e", descriptor = "Ljava/lang/Class;")
    public static Class field4621;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Z)V")
    public static void method1952(boolean arg0) {
        field4620 = null;
        if (arg0) {
            method1952(true);
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(BLqa;I)Z")
    public static final boolean method1953(byte arg0, class167 arg1, int arg2) {
        field4617++;
        int var3 = (class146.field2247 - 104) / 2;
        int var4 = (class66.field990 - 104) / 2;
        boolean var5 = true;
        for (int var6 = var3; var6 < (var3 + 104); var6++) {
            for (int var57 = var4; var57 < (var4 + 104); var57++) {
                for (int var58 = arg2; var58 <= 3; var58++) {
                    if (class85.method774(var57, var6, (byte) 51, arg2, var58)) {
                        int var59 = var58;
                        if (class402.method2455(var57, var6, arg0 ^ 0x7BD2)) {
                            var59 = var58 - 1;
                        }
                        if (var59 >= 0) {
                            var5 &= class414.method2502(var6, arg0 ^ 0xA4D3422B, var57, var59);
                        }
                    }
                }
            }
        }
        if (!var5) {
            return false;
        }
        int[] var7 = new int[262144];
        if (arg0 != 11) {
            method1952(false);
        }
        for (int var8 = 0; var8 < var7.length; var8++) {
            var7[var8] = -16777216;
        }
        class531.field7382 = arg1.method528(var7, 0, 512, 512, 512);
        class277.method1786((byte) 122);
        int var9 = (int) (Math.random() * 20.0D) + (((int) (Math.random() * 20.0D)) + 238 - 10 << 8) + (-10 + (int) (Math.random() * 20.0D) + 238 << 16) + 228 | 0xFF000000;
        int var10 = (int) (Math.random() * 20.0D) + 228 | 0xFF00 << 16;
        int var11 = (int) (Math.random() * 8.0D) | (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D) << 16;
        boolean[][] var12 = new boolean[class294.field4252 + 1][class294.field4252 + 1];
        for (int var13 = var3; var13 < var3 + 104; var13 += class294.field4252) {
            for (int var36 = var4; var36 < var4 + 104; var36 += class294.field4252) {
                int var37 = 0;
                int var38 = 0;
                int var39 = var13;
                if (var13 > 0) {
                    var37 += 4;
                    var39 = var13 - 1;
                }
                int var40 = var36;
                if (var36 > 0) {
                    var40 = var36 - 1;
                }
                int var41 = class294.field4252 + var13;
                if (var41 < 104) {
                    var41++;
                }
                int var42 = var36 + class294.field4252;
                if (var42 < 104) {
                    var42++;
                    var38 += 4;
                }
                arg1.method615(0, 0, class294.field4252 * 4 + var37, var38 - -(class294.field4252 * 4));
                arg1.method121(-16777216);
                for (int var43 = arg2; var43 <= 3; var43++) {
                    for (int var50 = 0; var50 <= class294.field4252; var50++) {
                        for (int var56 = 0; var56 <= class294.field4252; var56++) {
                            var12[var50][var56] = class85.method774(var40 + var56, var39 + var50, (byte) 51, arg2, var43);
                        }
                    }
                    class587.field8363[var43].method688(0, 0, 1024, var39, var40, var41, var42, var12);
                    if (!class325.field4674) {
                        for (int var51 = -4; var51 < class294.field4252; var51++) {
                            for (int var52 = -4; var52 < class294.field4252; var52++) {
                                int var53 = var13 + var51;
                                int var54 = var36 + var52;
                                if (var53 >= var3 && var4 <= var54 && class85.method774(var54, var53, (byte) 51, arg2, var43)) {
                                    int var55 = var43;
                                    if (class402.method2455(var54, var53, 31705)) {
                                        var55 = var43 - 1;
                                    }
                                    if (var55 >= 0) {
                                        class573.method3277(var10, -112, var9, var51 * 4 + var37, (class294.field4252 - var52) * 4 + var38 - 4, var54, var53, arg1, var55);
                                    }
                                }
                            }
                        }
                    }
                }
                if (class325.field4674) {
                    class39 var44 = class268.field3916[arg2];
                    for (int var45 = 0; var45 < class294.field4252; var45++) {
                        for (int var46 = 0; var46 < class294.field4252; var46++) {
                            int var47 = var13 + var45;
                            int var48 = var36 + var46;
                            int var49 = var44.field526[var47 - var44.field531][var48 - var44.field530];
                            if ((var49 & 0x40240000) != 0) {
                                arg1.method1159(-1713569622, 4, (class294.field4252 - var46) * 4 + var38 - 4, var45 * 4 + var37, (byte) 96, 4);
                            } else if ((var49 & 0x800000) != 0) {
                                arg1.method1160(4, var38 - (4 - ((class294.field4252 - var46) * 4)), var45 * 4 + var37, -3, -1713569622);
                            } else if ((var49 & 0x2000000) != 0) {
                                arg1.method1164(4, var45 * 4 + var37 + 3, 1, (class294.field4252 - var46) * 4 + var38 - 4, -1713569622);
                            } else if ((var49 & 0x8000000) != 0) {
                                arg1.method1160(4, (class294.field4252 - var46) * 4 + var38 - 1, var37 - -(var45 * 4), -3, -1713569622);
                            } else if ((var49 & 0x20000000) != 0) {
                                arg1.method1164(4, var37 + (var45 * 4), 1, var38 + ((class294.field4252 - var46) * 4) - 4, -1713569622);
                            }
                        }
                    }
                }
                arg1.method653(var37, var38, class294.field4252 * 4, class294.field4252 * 4, var11, 2);
                class531.field7382.method662((var13 - var3) * 4 + 48, -((-var4 + var36) * 4) + -(class294.field4252 * 4) + 464, class294.field4252 * 4, class294.field4252 * 4, var37, var38);
            }
        }
        arg1.method657();
        arg1.method121(-16777215);
        class530.method2980(-6891);
        class141.field2211 = 0;
        class593.field8421.method425(-100);
        if (!class325.field4674) {
            for (int var14 = var3; var14 < var3 + 104; var14++) {
                for (int var20 = var4; var20 < var4 + 104; var20++) {
                    for (int var21 = arg2; (arg2 + 1) >= var21 && var21 <= 3; var21++) {
                        if (class85.method774(var20, var14, (byte) 51, arg2, var21)) {
                            class231 var22 = (class231) class621.method3504(var21, var14, var20);
                            if (var22 == null) {
                                var22 = (class231) class460.method2691(var21, var14, var20, field4621 == null ? (field4621 = method1955("p")) : field4621);
                            }
                            if (var22 == null) {
                                var22 = (class231) class507.method2859(var21, var14, var20);
                            }
                            if (var22 == null) {
                                var22 = (class231) class485.method2786(var21, var14, var20);
                            }
                            if (var22 != null) {
                                class370 var23 = class552.field7819.method2890(0, var22.method264(-25792));
                                if (!var23.field5347 || class56.field800) {
                                    int var24 = var23.field5328;
                                    if (var23.field5272 != null) {
                                        for (int var25 = 0; var25 < var23.field5272.length; var25++) {
                                            if (var23.field5272[var25] != -1) {
                                                class370 var26 = class552.field7819.method2890(0, var23.field5272[var25]);
                                                if (var26.field5328 >= 0) {
                                                    var24 = var26.field5328;
                                                }
                                            }
                                        }
                                    }
                                    if (var24 >= 0) {
                                        boolean var27 = false;
                                        if (var24 >= 0) {
                                            class192 var28 = class249.field3634.method70(var24, 104);
                                            if (var28 != null && var28.field2771) {
                                                var27 = true;
                                            }
                                        }
                                        int var29 = var14;
                                        int var30 = var20;
                                        if (var27) {
                                            int[][] var31 = class268.field3916[var21].field526;
                                            int var32 = class268.field3916[var21].field531;
                                            int var33 = class268.field3916[var21].field530;
                                            for (int var34 = 0; var34 < 10; var34++) {
                                                int var35 = (int) (Math.random() * 4.0D);
                                                if (var35 == 0 && var29 > var3 && var14 - 3 < var29 && (var31[var29 - var32 - 1][var30 - var33] & 0x2C0108) == 0) {
                                                    var29--;
                                                }
                                                if (var35 == 1 && var29 < var3 + 104 - 1 && var29 < var14 + 3 && (var31[var29 + 1 - var32][var30 - var33] & 0x2C0180) == 0) {
                                                    var29++;
                                                }
                                                if (var35 == 2 && var30 > var4 && var30 > var20 - 3 && (var31[var29 - var32][var30 - var33 - 1] & 0x2C0102) == 0) {
                                                    var30--;
                                                }
                                                if (var35 == 3 && var30 < (var4 + 103) && var30 < (var20 + 3) && (var31[var29 - var32][var30 + 1 - var33] & 0x2C0120) == 0) {
                                                    var30++;
                                                }
                                            }
                                        }
                                        class633.field9205[class141.field2211] = var23.field5335;
                                        class616.field8721[class141.field2211] = var29;
                                        class521.field7241[class141.field2211] = var30;
                                        class141.field2211++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (class254.field3704 != null) {
                class352.field5018.field8003 = 1;
                class249.field3634.method67(1024, 128, 64);
                for (int var15 = 0; var15 < class254.field3704.field4569; var15++) {
                    int var16 = class254.field3704.field4566[var15];
                    if (var16 >> 28 == class644.field9367.field5116) {
                        int var17 = ((var16 & 0xFFFD857) >> 14) - class382.field5687;
                        int var18 = (var16 & 0x3FFF) - class597.field8500;
                        if (var17 >= 0 && var17 < class146.field2247 && var18 >= 0 && class66.field990 > var18) {
                            class593.field8421.method414(new class264(var15), (byte) 108);
                        } else {
                            class192 var19 = class249.field3634.method70(class254.field3704.field4563[var15], arg0 ^ 0x72);
                            if (var19.field2737 != null && (var17 + var19.field2773) >= 0 && (var19.field2758 + var17) < class146.field2247 && (var18 + var19.field2739) >= 0 && (var18 + var19.field2766) < class66.field990) {
                                class593.field8421.method414(new class264(var15), (byte) 75);
                            }
                        }
                    }
                }
                class249.field3634.method67(128, 128, 64);
                class352.field5018.field8003 = 2;
                class352.field5018.method3165(true);
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(III)V")
    public static final void method1954(int arg0, int arg1, int arg2) {
        field4618++;
        class21 var3 = class601.method3413(arg1, 1, (byte) 125);
        if (arg0 == 23454) {
            var3.method230(arg0 - 5114);
            var3.field308 = arg2;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1955(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
