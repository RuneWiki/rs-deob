import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class57 {

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "[I")
    public static int[] field823 = new int[5];

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "I")
    public static int field824 = 0;

    @OriginalMember(owner = "client!rf", name = "i", descriptor = "I")
    public static int field830 = 0;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "I")
    public static int field822;

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "I")
    public static int field825;

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "I")
    public static int field826;

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "I")
    public static int field827;

    @OriginalMember(owner = "client!rf", name = "g", descriptor = "I")
    public static int field828;

    @OriginalMember(owner = "client!rf", name = "j", descriptor = "I")
    public static int field831;

    @OriginalMember(owner = "client!rf", name = "h", descriptor = "[Lf;")
    public static class528[] field829;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)V", line = 8)
    public static void method405(int arg0) {
        if (arg0 == 31) {
            field823 = null;
            field829 = null;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(ILtn;IILqa;)V", line = 20)
    public static final void method406(int arg0, class58 arg1, int arg2, int arg3, class162 arg4) {
        if (arg0 != 16383) {
            return;
        }
        field828++;
        class381 var5 = arg1.method415(arg4, 1816933795);
        if (var5 == null) {
            return;
        }
        arg4.method509(arg2, arg3, arg1.field925 + arg2, arg1.field896 + arg3);
        if (class406.field5977 == 2 || class406.field5977 == 5 || class162.field2440 == null) {
            arg4.method434(-16777216, var5, arg2, arg3);
            return;
        }
        int var6;
        int var7;
        int var8;
        int var9;
        if (class403.field5944 == 4) {
            var6 = class380.field5663;
            var7 = class117.field1850;
            var8 = (int) (-class66.field1161) & 0x3FFF;
            var9 = 4096;
        } else {
            var6 = class95.field1558.field5539;
            var9 = 4096 - (class43.field662 * 16);
            var7 = class95.field1558.field5529;
            var8 = (int) (-class66.field1161) + class8.field114 & 0x3FFF;
        }
        int var10 = var7 / 32 + 208 + 48 - (class237.field3436 * 2);
        int var11 = class83.field1366 * 4 + 48 + 208 - (class83.field1366 * 2) - var6 / 32;
        class162.field2440.method3126((float) arg1.field925 / 2.0F + (float) arg2, (float) arg1.field896 / 2.0F + (float) arg3, (float) var10, (float) var11, var9, var8 << 2, var5, arg2, arg3);
        for (class242 var12 = (class242) class523.field7691.method2257((byte) 123); var12 != null; var12 = (class242) class523.field7691.method2256(-56)) {
            int var54 = var12.field3509;
            int var55 = (class518.field7617.field5749[var54] >> 14 & 0x3FFF) - class483.field7082;
            int var56 = (class518.field7617.field5749[var54] & 0x3FFF) - class465.field6840;
            int var57 = var55 * 4 + 2 - (var7 / 32);
            int var58 = var56 * 4 + 2 - (var6 / 32);
            class39.method298(arg1, var5, arg3, arg0 ^ 0x3FFF, arg2, var57, arg4, class518.field7617.field5750[var54], var58);
        }
        for (int var13 = 0; var13 < class324.field4962; var13++) {
            int var51 = class522.field7671[var13] * 4 - ((var7 / 32) - 2);
            int var52 = class225.field3264[var13] * 4 + 2 - (var6 / 32);
            class510 var53 = class246.field3567.method609(111, class207.field2984[var13]);
            if (var53.field7497 != null) {
                var53 = var53.method3027(class526.field7733, -12889);
                if (var53 == null || var53.field7533 == -1) {
                    continue;
                }
            }
            class39.method298(arg1, var5, arg3, 0, arg2, var51, arg4, var53.field7533, var52);
        }
        for (class63 var14 = (class63) class73.field1218.method2483(arg0 ^ 0xFFFFC071); var14 != null; var14 = (class63) class73.field1218.method2481((byte) -27)) {
            int var48 = (int) (var14.field6399 >> 28 & 0x3L);
            if (class56.field818 == var48) {
                int var49 = (int) (var14.field6399 & 0x3FFFL) * 4 + 2 - (var7 / 32);
                int var50 = (int) (var14.field6399 >> 14 & 0x3FFFL) * 4 + 2 - (var6 / 32);
                class271.method1739(arg2, class74.field1239[0], (byte) 42, var50, arg3, arg1, var49, var5);
            }
        }
        for (int var15 = 0; var15 < class322.field4943; var15++) {
            class13 var44 = class132.field2030[class101.field1623[var15]];
            if (var44 != null && var44.method118(3) && class95.field1558.field5538 == var44.field5538) {
                class148 var45 = var44.field210;
                if (var45 != null && var45.field2193 != null) {
                    var45 = var45.method1059((byte) -51, class526.field7733);
                }
                if (var45 != null && var45.field2185 && var45.field2170) {
                    int var46 = var44.field5529 / 32 - var7 / 32;
                    int var47 = var44.field5539 / 32 - (var6 / 32);
                    if (var45.field2239 == -1) {
                        class271.method1739(arg2, class74.field1239[1], (byte) 65, var47, arg3, arg1, var46, var5);
                    } else {
                        class39.method298(arg1, var5, arg3, arg0 ^ 0x3FFF, arg2, var46, arg4, var45.field2239, var47);
                    }
                }
            }
        }
        int var16 = class333.field5117;
        int[] var17 = class459.field6766;
        for (int var18 = 0; var18 < var16; var18++) {
            class62 var36 = class390.field5783[var17[var18]];
            if (var36 != null && var36.method557(3) && class95.field1558 != var36 && class95.field1558.field5538 == var36.field5538) {
                int var37 = var36.field5529 / 32 - (var7 / 32);
                int var38 = var36.field5539 / 32 - (var6 / 32);
                boolean var39 = false;
                for (int var40 = 0; var40 < class424.field6218; var40++) {
                    if (var36.field1094.equals(class469.field6908[var40]) && class222.field3219[var40] != 0) {
                        var39 = true;
                        break;
                    }
                }
                boolean var41 = false;
                for (int var42 = 0; var42 < class22.field395; var42++) {
                    if (var36.field1094.equals(class172.field2628[var42].field4199)) {
                        var41 = true;
                        break;
                    }
                }
                boolean var43 = false;
                if (class95.field1558.field1061 != 0 && var36.field1061 != 0 && class95.field1558.field1061 == var36.field1061) {
                    var43 = true;
                }
                if (var36.field1102) {
                    class271.method1739(arg2, class74.field1239[6], (byte) 27, var38, arg3, arg1, var37, var5);
                } else if (var39) {
                    class271.method1739(arg2, class74.field1239[3], (byte) 89, var38, arg3, arg1, var37, var5);
                } else if (var41) {
                    class271.method1739(arg2, class74.field1239[5], (byte) 33, var38, arg3, arg1, var37, var5);
                } else if (var43) {
                    class271.method1739(arg2, class74.field1239[4], (byte) 37, var38, arg3, arg1, var37, var5);
                } else {
                    class271.method1739(arg2, class74.field1239[2], (byte) 78, var38, arg3, arg1, var37, var5);
                }
            }
        }
        class324[] var19 = class187.field2777;
        for (int var20 = 0; var20 < var19.length; var20++) {
            class324 var23 = var19[var20];
            if (var23 != null && var23.field4969 != 0 && class180.field2734 % 20 < 10) {
                if (var23.field4969 == 1 && var23.field4972 >= 0 && var23.field4972 < class132.field2030.length) {
                    class13 var24 = class132.field2030[var23.field4972];
                    if (var24 != null) {
                        int var25 = var24.field5529 / 32 - (var7 / 32);
                        int var26 = var24.field5539 / 32 - (var6 / 32);
                        class380.method2410(var25, 256, var23.field4976, arg3, arg2, var5, arg1, 360000L, var26);
                    }
                }
                if (var23.field4969 == 2) {
                    int var27 = var23.field4971 / 32 - var7 / 32;
                    int var28 = var23.field4968 / 32 - var6 / 32;
                    long var29 = (long) (var23.field4975 << 5);
                    long var31 = var29 * var29;
                    class380.method2410(var27, 256, var23.field4976, arg3, arg2, var5, arg1, var31, var28);
                }
                if (var23.field4969 == 10 && var23.field4972 >= 0 && class390.field5783.length > var23.field4972) {
                    class62 var33 = class390.field5783[var23.field4972];
                    if (var33 != null) {
                        int var34 = var33.field5529 / 32 - (var7 / 32);
                        int var35 = var33.field5539 / 32 - (var6 / 32);
                        class380.method2410(var34, 256, var23.field4976, arg3, arg2, var5, arg1, 360000L, var35);
                    }
                }
            }
        }
        if (class403.field5944 == 4) {
            return;
        }
        if (class403.field5926 != 0) {
            int var21 = class403.field5926 * 4 + ((class95.field1558.method184(1) + -1) * 2) + 2 - (var7 / 32);
            int var22 = class48.field723 * 4 + (class95.field1558.method184(1) + -1) * 2 + 2 - (var6 / 32);
            class271.method1739(arg2, class267.field3856[class425.field6240 ? 1 : 0], (byte) 127, var22, arg3, arg1, var21, var5);
        }
        arg4.method1175(3, 8, arg1.field925 / 2 + arg2 - 1, -1, 3, arg3 - (1 - (arg1.field896 / 2)));
        return;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IB)I", line = 330)
    public static final int method407(int arg0, byte arg1) {
        if (arg1 != -115) {
            field827 = -66;
        }
        field825++;
        return arg0 & 0x7F;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lqf;II)V", line = 342)
    public static final void method408(class477 arg0, int arg1, int arg2) {
        class165.field2467 = arg2;
        field826++;
        class396.field5829 = false;
        class488.method2923(arg0, (byte) 119);
        class309.method1938(0, arg0);
        if (class396.field5829) {
            System.out.println("---endgpp---");
        }
        if (arg0.field4333 != arg1) {
            throw new RuntimeException("gpi1 pos:" + arg0.field4333 + " psize:" + arg1);
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIII)Z", line = 364)
    public static final boolean method409(int arg0, int arg1, int arg2, int arg3) {
        if (!class170.method1208(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << class225.field3278;
        int var5 = arg2 << class225.field3278;
        int var6 = class529.field7807[arg0].method271(arg1, arg2) - 1;
        int var7 = var6 - (0x78 << class225.field3278 - 7);
        int var8 = var6 - (0xE6 << class225.field3278 - 7);
        int var9 = var6 - (0xEE << class225.field3278 - 7);
        if (arg3 == 1) {
            if (var4 > class466.field6858) {
                if (!class475.method2842(var4, var6, var5)) {
                    return false;
                }
                if (!class475.method2842(var4, var6, class495.field7211 + var5)) {
                    return false;
                }
                if (!class475.method2842(var4, var6, class427.field6246 + var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class475.method2842(var4, var7, var5)) {
                    return false;
                }
                if (!class475.method2842(var4, var7, class495.field7211 + var5)) {
                    return false;
                }
                if (!class475.method2842(var4, var7, class427.field6246 + var5)) {
                    return false;
                }
            }
            if (!class475.method2842(var4, var8, var5)) {
                return false;
            } else if (class475.method2842(var4, var8, class495.field7211 + var5)) {
                return class475.method2842(var4, var8, class427.field6246 + var5);
            } else {
                return false;
            }
        } else if (arg3 == 2) {
            if (var5 < class504.field7401) {
                if (!class475.method2842(var4, var6, class427.field6246 + var5)) {
                    return false;
                }
                if (!class475.method2842(class495.field7211 + var4, var6, class427.field6246 + var5)) {
                    return false;
                }
                if (!class475.method2842(class427.field6246 + var4, var6, class427.field6246 + var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class475.method2842(var4, var7, class427.field6246 + var5)) {
                    return false;
                }
                if (!class475.method2842(class495.field7211 + var4, var7, class427.field6246 + var5)) {
                    return false;
                }
                if (!class475.method2842(class427.field6246 + var4, var7, class427.field6246 + var5)) {
                    return false;
                }
            }
            if (!class475.method2842(var4, var8, class427.field6246 + var5)) {
                return false;
            } else if (class475.method2842(class495.field7211 + var4, var8, class427.field6246 + var5)) {
                return class475.method2842(class427.field6246 + var4, var8, class427.field6246 + var5);
            } else {
                return false;
            }
        } else if (arg3 == 4) {
            if (var4 < class466.field6858) {
                if (!class475.method2842(class427.field6246 + var4, var6, var5)) {
                    return false;
                }
                if (!class475.method2842(class427.field6246 + var4, var6, class495.field7211 + var5)) {
                    return false;
                }
                if (!class475.method2842(class427.field6246 + var4, var6, class427.field6246 + var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class475.method2842(class427.field6246 + var4, var7, var5)) {
                    return false;
                }
                if (!class475.method2842(class427.field6246 + var4, var7, class495.field7211 + var5)) {
                    return false;
                }
                if (!class475.method2842(class427.field6246 + var4, var7, class427.field6246 + var5)) {
                    return false;
                }
            }
            if (!class475.method2842(class427.field6246 + var4, var8, var5)) {
                return false;
            } else if (class475.method2842(class427.field6246 + var4, var8, class495.field7211 + var5)) {
                return class475.method2842(class427.field6246 + var4, var8, class427.field6246 + var5);
            } else {
                return false;
            }
        } else if (arg3 == 8) {
            if (var5 > class504.field7401) {
                if (!class475.method2842(var4, var6, var5)) {
                    return false;
                }
                if (!class475.method2842(class495.field7211 + var4, var6, var5)) {
                    return false;
                }
                if (!class475.method2842(class427.field6246 + var4, var6, var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class475.method2842(var4, var7, var5)) {
                    return false;
                }
                if (!class475.method2842(class495.field7211 + var4, var7, var5)) {
                    return false;
                }
                if (!class475.method2842(class427.field6246 + var4, var7, var5)) {
                    return false;
                }
            }
            if (!class475.method2842(var4, var8, var5)) {
                return false;
            } else if (class475.method2842(class495.field7211 + var4, var8, var5)) {
                return class475.method2842(class427.field6246 + var4, var8, var5);
            } else {
                return false;
            }
        } else if (!class475.method2842(class495.field7211 + var4, var9, class495.field7211 + var5)) {
            return false;
        } else if (arg3 == 16) {
            return class475.method2842(var4, var8, class427.field6246 + var5);
        } else if (arg3 == 32) {
            return class475.method2842(class427.field6246 + var4, var8, class427.field6246 + var5);
        } else if (arg3 == 64) {
            return class475.method2842(class427.field6246 + var4, var8, var5);
        } else if (arg3 == 128) {
            return class475.method2842(var4, var8, var5);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(B)V", line = 580)
    public static final void method410(byte arg0) {
        if (arg0 <= 79) {
            method409(71, -98, 8, 45);
        }
        if (class200.field2918 > 1) {
            class371.field5563 = class285.field4130;
            class200.field2918--;
        }
        if (class134.field2068 > 0) {
            class134.field2068--;
        }
        field831++;
        if (class359.field5432) {
            class359.field5432 = false;
            class177.method1263((byte) 54);
            return;
        }
        if (!class314.field4487) {
            class346.method2244(-93);
        }
        for (int var1 = 0; var1 < 100 && class237.method1538(true); var1++) {
        }
        if (class17.field266 != 30) {
            return;
        }
        class488.method2908(class86.field1436, class298.field4252.method928(-1), true);
        if (class177.field2685 == null) {
            if (class464.method2773((byte) 103) >= class469.field6901) {
                class177.field2685 = class47.field722.method216(class102.field1633, 915);
            }
        } else if (class177.field2685.field4956 != -1) {
            class114.method841(false, class351.field5321);
            class86.field1436.method1874(class177.field2685.field4956, (byte) -110);
            class177.field2685 = null;
            class469.field6901 = class464.method2773((byte) 103) + 30000L;
        }
        class157 var2 = (class157) class448.field6552.method2257((byte) 125);
        if (var2 != null || class464.method2773((byte) 103) - 2000L > class295.field4210) {
            boolean var3 = false;
            int var4 = class86.field1436.field4333;
            for (class157 var5 = (class157) class371.field5562.method2257((byte) 100); var5 != null && (class86.field1436.field4333 - var4) < 240; var5 = (class157) class371.field5562.method2256(-102)) {
                var5.method2663(-127);
                int var6 = var5.method1103(5);
                if (var6 < 0) {
                    var6 = 0;
                } else if (var6 > 65534) {
                    var6 = 65534;
                }
                int var7 = var5.method1102(true);
                if (var7 < 0) {
                    var7 = 0;
                } else if (var7 > 65534) {
                    var7 = 65534;
                }
                boolean var8 = false;
                if (var5.method1103(5) == -1 && var5.method1102(true) == -1) {
                    var8 = true;
                    var7 = -1;
                    var6 = -1;
                }
                if (class74.field1243 != var7 || class38.field577 != var6) {
                    if (!var3) {
                        class114.method841(false, class241.field3507);
                        class301.field4281++;
                        class86.field1436.method1923((byte) 62, 0);
                        var3 = true;
                        var4 = class86.field1436.field4333;
                    }
                    int var9 = var7 - class74.field1243;
                    class74.field1243 = var7;
                    int var10 = var6 - class38.field577;
                    class38.field577 = var6;
                    int var11 = (int) ((var5.method1101((byte) -48) - class295.field4210) / 20L);
                    if (var11 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                        var10 += 32;
                        var9 += 32;
                        class86.field1436.method1874((var11 << 12) - (-(var9 << 6) - var10), (byte) -110);
                    } else if (var11 < 32 && var9 >= -128 && var9 <= 127 && var10 >= -128 && var10 <= 127) {
                        var10 += 128;
                        class86.field1436.method1923((byte) 62, var11 + 128);
                        var9 += 128;
                        class86.field1436.method1874((var9 << 8) + var10, (byte) -110);
                    } else if (var11 >= 32) {
                        class86.field1436.method1874(var11 + 57344, (byte) -110);
                        if (var8) {
                            class86.field1436.method1892(397825512, Integer.MIN_VALUE);
                        } else {
                            class86.field1436.method1892(397825512, var7 | var6 << 16);
                        }
                    } else {
                        class86.field1436.method1923((byte) 62, var11 + 192);
                        if (var8) {
                            class86.field1436.method1892(397825512, Integer.MIN_VALUE);
                        } else {
                            class86.field1436.method1892(397825512, var6 << 16 | var7);
                        }
                    }
                    class295.field4210 = var5.method1101((byte) -48);
                }
            }
            if (var3) {
                class86.field1436.method1897(class86.field1436.field4333 - var4, 255);
            }
        }
        if (var2 != null) {
            long var12 = (var2.method1101((byte) -48) - class493.field7193) / 50L;
            if (var12 > 32767L) {
                var12 = 32767L;
            }
            class493.field7193 = var2.method1101((byte) -48);
            int var14 = var2.method1103(5);
            if (var14 < 0) {
                var14 = 0;
            } else if (var14 > 65535) {
                var14 = 65535;
            }
            int var15 = var2.method1102(true);
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 65535) {
                var15 = 65535;
            }
            byte var16 = 0;
            if (var2.method1097(27) == 2) {
                var16 = 1;
            }
            int var17 = (int) var12;
            class110.field1746++;
            class114.method841(false, class381.field5679);
            class86.field1436.method1874(var17 | var16 << 15, (byte) -110);
            class86.field1436.method1878(44, var15 | var14 << 16);
        }
        if (class42.field643 > 0) {
            int var18 = 0;
            for (int var19 = 0; var19 < class42.field643; var19++) {
                if (class125.field1922[var19].method238((byte) 94)) {
                    var18++;
                }
            }
            if (var18 > 0) {
                if (var18 > 75) {
                    var18 = 75;
                }
                class114.method841(false, class435.field6322);
                class36.field541++;
                class86.field1436.method1923((byte) 62, var18 * 3);
                for (int var20 = 0; var20 < class42.field643; var20++) {
                    class420 var21 = class125.field1922[var20];
                    if (var21.method238((byte) 94)) {
                        long var22 = (var21.method242(true) - class242.field3510) / 50L;
                        if (var22 > 65535L) {
                            var22 = 65535L;
                        }
                        class242.field3510 = var21.method242(true);
                        class86.field1436.method1923((byte) 62, var21.method244((byte) -117));
                        class86.field1436.method1874((int) var22, (byte) -110);
                    }
                }
            }
        }
        if (class389.field5761 > 0) {
            class389.field5761--;
        }
        if (class163.field2465 && class389.field5761 <= 0) {
            class163.field2465 = false;
            class389.field5761 = 20;
            class239.field3477++;
            class114.method841(false, class288.field4147);
            class86.field1436.method1905((int) class382.field5684 >> 3, -40);
            class86.field1436.method1905((int) class66.field1161 >> 3, -123);
        }
        if (class407.field5987 && !class420.field6183) {
            class420.field6183 = true;
            class54.field794++;
            class114.method841(false, class483.field7083);
            class86.field1436.method1923((byte) 62, 1);
        }
        if (!class407.field5987 && class420.field6183) {
            class420.field6183 = false;
            class54.field794++;
            class114.method841(false, class483.field7083);
            class86.field1436.method1923((byte) 62, 0);
        }
        if (!class439.field6395) {
            class114.method841(false, class264.field3811);
            class250.field3605++;
            class86.field1436.method1923((byte) 62, 0);
            int var24 = class86.field1436.field4333;
            class303 var25 = class397.field5830.method1296(3809);
            class86.field1436.method1876(0, 4, var25.field4326, var25.field4333);
            class86.field1436.method1897(class86.field1436.field4333 - var24, 255);
            class439.field6395 = true;
        }
        if (class36.field545 != null) {
            if (class403.field5944 == 2) {
                class120.method870(99);
            } else if (class403.field5944 == 3) {
                class373.method2386(-109);
            }
        }
        if (class378.field5635) {
            class378.field5635 = false;
        } else {
            class278.field4008 /= 2.0F;
        }
        if (class342.field5222) {
            class342.field5222 = false;
        } else {
            class434.field6315 /= 2.0F;
        }
        class160.method1159((byte) -64);
        if (class17.field266 != 30) {
            return;
        }
        class206.method1379((byte) -53);
        class425.method2598((byte) -55);
        class389.method2443(false);
        class518.method3062(115);
        class461.field6805++;
        if (class461.field6805 > 750) {
            class177.method1263((byte) 54);
            return;
        }
        class159.method1145(0);
        class41.method318((byte) -126);
        class363.method2332((byte) 64);
        for (int var26 = class526.field7733.method2826(94, true); var26 != -1; var26 = class526.field7733.method2826(98, false)) {
            class359.method2314(var26, (byte) -102);
            class411.field6047[class388.method2441(31, class493.field7192++)] = var26;
        }
        for (class434 var27 = class351.method2280(0); var27 != null; var27 = class351.method2280(0)) {
            int var28 = var27.method2630(false);
            int var29 = var27.method2624((byte) 88);
            if (var28 == 1) {
                class400.field5869[var29] = var27.field6310;
                class45.field678 |= class424.field6226[var29];
                class202.field2926[class388.method2441(class229.field3350++, 31)] = var29;
            } else if (var28 == 2) {
                class123.field1915[var29] = var27.field6318;
                class220.field3171[class388.method2441(class45.field684++, 31)] = var29;
            } else if (var28 == 3) {
                class58 var30 = class421.method2578(-4179, var29);
                if (!var27.field6318.equals(var30.field859)) {
                    var30.field859 = var27.field6318;
                    class139.method1027(var30, false);
                }
            } else if (var28 == 4) {
                class58 var48 = class421.method2578(-4179, var29);
                int var49 = var27.field6310;
                int var50 = var27.field6314;
                int var51 = var27.field6306;
                if (var48.field945 != var49 || var48.field966 != var50 || var48.field894 != var51) {
                    var48.field945 = var49;
                    var48.field894 = var51;
                    var48.field966 = var50;
                    class139.method1027(var48, false);
                }
            } else if (var28 == 5) {
                class58 var31 = class421.method2578(-4179, var29);
                if (var27.field6310 != var31.field909 || var27.field6310 == -1) {
                    var31.field909 = var27.field6310;
                    var31.field866 = 0;
                    var31.field901 = 1;
                    var31.field944 = 0;
                    class139.method1027(var31, false);
                }
            } else if (var28 == 6) {
                int var32 = var27.field6310;
                int var33 = var32 >> 10 & 0x1F;
                int var34 = (var32 & 0x3E2) >> 5;
                int var35 = var32 & 0x1F;
                int var36 = (var35 << 3) + (var33 << 19) + (var34 << 11);
                class58 var37 = class421.method2578(-4179, var29);
                if (var37.field943 != var36) {
                    var37.field943 = var36;
                    class139.method1027(var37, false);
                }
            } else if (var28 == 7) {
                class58 var46 = class421.method2578(-4179, var29);
                boolean var47 = var27.field6310 == 1;
                if (var46.field924 != var47) {
                    var46.field924 = var47;
                    class139.method1027(var46, false);
                }
            } else if (var28 == 8) {
                class58 var45 = class421.method2578(-4179, var29);
                if (var27.field6310 != var45.field990 || var27.field6314 != var45.field872 || var27.field6306 != var45.field835) {
                    var45.field872 = var27.field6314;
                    var45.field835 = var27.field6306;
                    var45.field990 = var27.field6310;
                    if (var45.field946 != -1) {
                        if (var45.field857 > 0) {
                            var45.field835 = var45.field835 * 32 / var45.field857;
                        } else if (var45.field877 > 0) {
                            var45.field835 = var45.field835 * 32 / var45.field877;
                        }
                    }
                    class139.method1027(var45, false);
                }
            } else if (var28 == 9) {
                class58 var38 = class421.method2578(-4179, var29);
                if (var27.field6310 != var38.field946 || var27.field6314 != var38.field977) {
                    var38.field977 = var27.field6314;
                    var38.field946 = var27.field6310;
                    class139.method1027(var38, false);
                }
            } else if (var28 == 10) {
                class58 var39 = class421.method2578(-4179, var29);
                if (var27.field6310 != var39.field847 || var27.field6314 != var39.field869 || var27.field6306 != var39.field932) {
                    var39.field932 = var27.field6306;
                    var39.field869 = var27.field6314;
                    var39.field847 = var27.field6310;
                    class139.method1027(var39, false);
                }
            } else if (var28 == 11) {
                class58 var44 = class421.method2578(-4179, var29);
                var44.field899 = var44.field846 = var27.field6314;
                var44.field916 = 0;
                var44.field845 = var44.field886 = var27.field6310;
                var44.field933 = 0;
                class139.method1027(var44, false);
            } else if (var28 == 12) {
                class58 var40 = class421.method2578(-4179, var29);
                int var41 = var27.field6310;
                if (var40 != null && var40.field843 == 0) {
                    if (var41 > var40.field879 - var40.field896) {
                        var41 = var40.field879 - var40.field896;
                    }
                    if (var41 < 0) {
                        var41 = 0;
                    }
                    if (var40.field855 != var41) {
                        var40.field855 = var41;
                        class139.method1027(var40, false);
                    }
                }
            } else if (var28 == 14) {
                class58 var43 = class421.method2578(-4179, var29);
                var43.field980 = var27.field6310;
            } else if (var28 == 15) {
                class425.field6240 = true;
                class48.field723 = var27.field6314;
                class403.field5926 = var27.field6310;
            } else if (var28 == 16) {
                class58 var42 = class421.method2578(-4179, var29);
                var42.field891 = var27.field6310;
            }
        }
        if (class133.field2062 != 0) {
            class220.field3185 += 20;
            if (class220.field3185 >= 400) {
                class133.field2062 = 0;
            }
        }
        class228.field3343++;
        if (class17.field271 != null) {
            class193.field2832++;
            if (class193.field2832 >= 15) {
                class139.method1027(class17.field271, false);
                class17.field271 = null;
            }
        }
        class427.field6247 = null;
        class83.field1363 = false;
        class373.field5588 = null;
        class216.field3101 = false;
        class440.method2669(-1, (byte) -82, -1, null);
        class414.method2557(-1, null, true, -1);
        if (!class301.field4287) {
            class508.field7429 = -1;
        }
        class22.method193(100);
        class285.field4130++;
        if (class271.field3932) {
            class168.field2516++;
            class114.method841(false, class373.field5587);
            class86.field1436.method1878(46, class188.field2787 | class530.field7825 << 28 | class230.field3356 << 14);
            class271.field3932 = false;
        }
        while (true) {
            class519 var52;
            class58 var53;
            class58 var54;
            do {
                var52 = (class519) class98.field1595.method2254(-8);
                if (var52 == null) {
                    while (true) {
                        class519 var55;
                        class58 var56;
                        class58 var57;
                        do {
                            var55 = (class519) class407.field5986.method2254(-8);
                            if (var55 == null) {
                                while (true) {
                                    class519 var58;
                                    class58 var59;
                                    class58 var60;
                                    do {
                                        var58 = (class519) class481.field7066.method2254(-8);
                                        if (var58 == null) {
                                            if (class373.field5588 == null) {
                                                class459.field6781 = 0;
                                            }
                                            if (class13.field221 != null) {
                                                class206.method1380((byte) -62);
                                            }
                                            if (class42.field642 > 0 && class351.field5334.method1767(82, (byte) -121) && class351.field5334.method1767(81, (byte) -128) && class214.field3083 != 0) {
                                                int var61 = class95.field1558.field5538 - class214.field3083;
                                                if (var61 < 0) {
                                                    var61 = 0;
                                                } else if (var61 > 3) {
                                                    var61 = 3;
                                                }
                                                class364.method2341((byte) 80, class465.field6840 + class95.field1558.field416[0], class95.field1558.field409[0] + class483.field7082, var61);
                                            }
                                            class326.method2101(114);
                                            for (int var62 = 0; var62 < 5; var62++) {
                                                int var10002 = class530.field7816[var62]++;
                                            }
                                            if (class45.field678 && (class464.method2773((byte) 103) - 60000L) > class99.field1601) {
                                                client.method1344((byte) 125);
                                            }
                                            class404.field5956++;
                                            if (class404.field5956 > 500) {
                                                class404.field5956 = 0;
                                                int var63 = (int) (Math.random() * 8.0D);
                                                if ((var63 & 0x1) == 1) {
                                                    class379.field5655 += class503.field7379;
                                                }
                                                if ((var63 & 0x4) == 4) {
                                                    class392.field5801 += class238.field3453;
                                                }
                                                if ((var63 & 0x2) == 2) {
                                                    class314.field4492 += class119.field1876;
                                                }
                                            }
                                            if (class379.field5655 < -50) {
                                                class503.field7379 = 2;
                                            }
                                            if (class379.field5655 > 50) {
                                                class503.field7379 = -2;
                                            }
                                            if (class314.field4492 < -55) {
                                                class119.field1876 = 2;
                                            }
                                            if (class314.field4492 > 55) {
                                                class119.field1876 = -2;
                                            }
                                            if (class392.field5801 < -40) {
                                                class238.field3453 = 1;
                                            }
                                            if (class392.field5801 > 40) {
                                                class238.field3453 = -1;
                                            }
                                            class266.field3843++;
                                            if (class266.field3843 > 500) {
                                                class266.field3843 = 0;
                                                int var64 = (int) (Math.random() * 8.0D);
                                                if ((var64 & 0x2) == 2) {
                                                    class43.field662 += class388.field5752;
                                                }
                                                if ((var64 & 0x1) == 1) {
                                                    class8.field114 += class353.field5346;
                                                }
                                            }
                                            if (class8.field114 < -60) {
                                                class353.field5346 = 2;
                                            }
                                            if (class8.field114 > 60) {
                                                class353.field5346 = -2;
                                            }
                                            if (class43.field662 < -20) {
                                                class388.field5752 = 1;
                                            }
                                            if (class43.field662 > 10) {
                                                class388.field5752 = -1;
                                            }
                                            field830++;
                                            if (field830 > 50) {
                                                class114.method841(false, class297.field4241);
                                                class414.field6097++;
                                            }
                                            if (class51.field750) {
                                                class358.method2312(67);
                                                class51.field750 = false;
                                            }
                                            try {
                                                if (class138.field2091 != null && class86.field1436.field4333 > 0) {
                                                    class422.field6202 += class86.field1436.field4333;
                                                    class138.field2091.method695(class86.field1436.field4333, 0, class86.field1436.field4326, (byte) 119);
                                                    field830 = 0;
                                                    class86.field1436.field4333 = 0;
                                                    return;
                                                }
                                                return;
                                            } catch (IOException var65) {
                                                class177.method1263((byte) 54);
                                                return;
                                            }
                                        }
                                        var59 = var58.field7625;
                                        if (var59.field840 < 0) {
                                            break;
                                        }
                                        var60 = class421.method2578(-4179, var59.field876);
                                    } while (var60 == null || var60.field910 == null || var59.field840 >= var60.field910.length || var60.field910[var59.field840] != var59);
                                    class150.method1086(var58);
                                }
                            }
                            var56 = var55.field7625;
                            if (var56.field840 < 0) {
                                break;
                            }
                            var57 = class421.method2578(-4179, var56.field876);
                        } while (var57 == null || var57.field910 == null || var56.field840 >= var57.field910.length || var57.field910[var56.field840] != var56);
                        class150.method1086(var55);
                    }
                }
                var53 = var52.field7625;
                if (var53.field840 < 0) {
                    break;
                }
                var54 = class421.method2578(-4179, var53.field876);
            } while (var54 == null || var54.field910 == null || var53.field840 >= var54.field910.length || var54.field910[var53.field840] != var53);
            class150.method1086(var52);
        }
    }
}
