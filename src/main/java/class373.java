import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sea")
public class class373 {

    @OriginalMember(owner = "client!sea", name = "c", descriptor = "Ljava/lang/String;")
    public String field5511;

    @OriginalMember(owner = "client!sea", name = "k", descriptor = "I")
    public int field5519;

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "I")
    public static int field5509 = -1;

    @OriginalMember(owner = "client!sea", name = "b", descriptor = "Ldc;")
    public static class302 field5510 = new class302();

    @OriginalMember(owner = "client!sea", name = "l", descriptor = "I")
    public static int field5520 = 0;

    @OriginalMember(owner = "client!sea", name = "m", descriptor = "I")
    public static int field5521 = -1;

    @OriginalMember(owner = "client!sea", name = "d", descriptor = "I")
    public static int field5512;

    @OriginalMember(owner = "client!sea", name = "e", descriptor = "I")
    public static int field5513;

    @OriginalMember(owner = "client!sea", name = "f", descriptor = "I")
    public static int field5514;

    @OriginalMember(owner = "client!sea", name = "g", descriptor = "I")
    public static int field5515;

    @OriginalMember(owner = "client!sea", name = "h", descriptor = "I")
    public static int field5516;

    @OriginalMember(owner = "client!sea", name = "i", descriptor = "I")
    public static int field5517;

    @OriginalMember(owner = "client!sea", name = "j", descriptor = "I")
    public static int field5518;

    // $FF: synthetic field
    @OriginalMember(owner = "client!sea", name = "n", descriptor = "Ljava/lang/Class;")
    public static Class field5522;

    // $FF: synthetic method
    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2302(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(I)V", line = 3)
    public static void method2295(int arg0) {
        field5510 = null;
        if (arg0 != -263) {
            method2300(-1, 1.2441678F, -36, null, true, 87, 30, -30, 0.47817537F, -35, -81);
        }
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(ILlr;I)V", line = 16)
    public static final void method2296(int arg0, class311 arg1, int arg2) {
        field5512++;
        boolean var3 = arg1.method1946(1, (byte) 124) == 1;
        if (var3) {
            class191.field2586[class440.field6397++] = arg2;
        }
        int var4 = arg1.method1946(2, (byte) 122);
        class71 var5 = class35.field551[arg2];
        if (var4 == 0) {
            if (var3) {
                var5.field1108 = false;
            } else if (class478.field6850 == arg2) {
                throw new RuntimeException("s:lr");
            } else {
                class143 var6 = class262.field3402[arg2] = new class143();
                var6.field2065 = (var5.field7430[0] + class397.field6005 >> 6 << 14) + (var5.field7905 << 28) + (class403.field6049 - -var5.field7429[0] >> 6);
                if (var5.field1116 == -1) {
                    var6.field2063 = var5.field7349.method2129(true);
                } else {
                    var6.field2063 = var5.field1116;
                }
                var6.field2064 = var5.field1140;
                var6.field2062 = var5.field7423;
                if (var5.field1122 > 0) {
                    class97.method603((byte) 119, var5);
                }
                class35.field551[arg2] = null;
                if (arg1.method1946(1, (byte) 120) != 0) {
                    class106.method752(arg1, (byte) -102, arg2);
                }
            }
        } else if (var4 == 1) {
            int var7 = arg1.method1946(3, (byte) 127);
            int var8 = var5.field7430[0];
            int var9 = var5.field7429[0];
            if (var7 == 0) {
                var9--;
                var8--;
            } else if (var7 == 1) {
                var9--;
            } else if (var7 == 2) {
                var8++;
                var9--;
            } else if (var7 == 3) {
                var8--;
            } else if (var7 == 4) {
                var8++;
            } else if (var7 == 5) {
                var9++;
                var8--;
            } else if (var7 == 6) {
                var9++;
            } else if (var7 == 7) {
                var9++;
                var8++;
            }
            if (var3) {
                var5.field1108 = true;
                var5.field1132 = var8;
                var5.field1135 = var9;
            } else {
                var5.method421((byte) -124, var9, var8, class647.field9308[arg2]);
            }
        } else if (var4 == 2) {
            int var10 = arg1.method1946(4, (byte) 124);
            int var11 = var5.field7430[0];
            int var12 = var5.field7429[0];
            if (var10 == 0) {
                var12 -= 2;
                var11 -= 2;
            } else if (var10 == 1) {
                var11--;
                var12 -= 2;
            } else if (var10 == 2) {
                var12 -= 2;
            } else if (var10 == 3) {
                var12 -= 2;
                var11++;
            } else if (var10 == 4) {
                var11 += 2;
                var12 -= 2;
            } else if (var10 == 5) {
                var12--;
                var11 -= 2;
            } else if (var10 == 6) {
                var11 += 2;
                var12--;
            } else if (var10 == 7) {
                var11 -= 2;
            } else if (var10 == 8) {
                var11 += 2;
            } else if (var10 == 9) {
                var11 -= 2;
                var12++;
            } else if (var10 == 10) {
                var11 += 2;
                var12++;
            } else if (var10 == 11) {
                var12 += 2;
                var11 -= 2;
            } else if (var10 == 12) {
                var11--;
                var12 += 2;
            } else if (var10 == 13) {
                var12 += 2;
            } else if (var10 == 14) {
                var12 += 2;
                var11++;
            } else if (var10 == 15) {
                var12 += 2;
                var11 += 2;
            }
            if (var3) {
                var5.field1132 = var11;
                var5.field1108 = true;
                var5.field1135 = var12;
            } else {
                var5.method421((byte) -128, var12, var11, class647.field9308[arg2]);
            }
        } else {
            int var13 = arg1.method1946(1, (byte) 125);
            if (var13 == 0) {
                int var14 = arg1.method1946(12, (byte) 124);
                int var15 = var14 >> 10;
                int var16 = var14 >> 5 & 0x1F;
                if (var16 > 15) {
                    var16 -= 32;
                }
                int var17 = var14 & 0x1F;
                if (var17 > 15) {
                    var17 -= 32;
                }
                int var18 = var5.field7430[0] + var16;
                int var19 = var5.field7429[0] + var17;
                if (var3) {
                    var5.field1132 = var18;
                    var5.field1135 = var19;
                    var5.field1108 = true;
                } else {
                    var5.method421((byte) -124, var19, var18, class647.field9308[arg2]);
                }
                var5.field7905 = var5.field7900 = (byte) (var5.field7905 + var15 & 0x3);
                if (class125.method898(111, var18, var19)) {
                    var5.field7900++;
                }
                if (class478.field6850 == arg2) {
                    class49.field779 = var5.field7905;
                }
            } else {
                int var20 = arg1.method1946(30, (byte) 123);
                int var21 = var20 >> 28;
                if (arg0 != 2737) {
                    field5521 = -119;
                }
                int var22 = (var20 & 0xFFFC1B7) >> 14;
                int var23 = var20 & 0x3FFF;
                int var24 = (class397.field6005 + var22 + var5.field7430[0] & 0x3FFF) - class397.field6005;
                int var25 = (var5.field7429[0] + class403.field6049 + var23 & 0x3FFF) - class403.field6049;
                if (var3) {
                    var5.field1132 = var24;
                    var5.field1135 = var25;
                    var5.field1108 = true;
                } else {
                    var5.method421((byte) -126, var25, var24, class647.field9308[arg2]);
                }
                var5.field7905 = var5.field7900 = (byte) (var5.field7905 + var21 & 0x3);
                if (class125.method898(94, var24, var25)) {
                    var5.field7900++;
                }
                if (class478.field6850 == arg2) {
                    class49.field779 = var5.field7905;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(Lr;II)Z", line = 338)
    public static final boolean method2297(class98 arg0, int arg1, int arg2) {
        field5514++;
        int var3 = (class72.field1144 - 104) / 2;
        int var4 = (class668.field9444 - 104) / 2;
        boolean var5 = true;
        for (int var6 = var3; var6 < var3 + 104; var6++) {
            for (int var57 = var4; var57 < (var4 + 104); var57++) {
                for (int var58 = arg1; var58 <= 3; var58++) {
                    if (class257.method1538(arg2 + 28388, var57, arg1, var6, var58)) {
                        int var59 = var58;
                        if (class125.method898(106, var6, var57)) {
                            var59 = var58 - 1;
                        }
                        if (var59 >= 0) {
                            var5 &= class21.method139(var59, (byte) 15, var6, var57);
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
        class11.field269 = arg0.method704(var7, 0, 512, 512, 512);
        class321.method1991(-200);
        int var9 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (238 - (-((int) (Math.random() * 20.0D)) - -10) << 16) + 238 - 10 | 0xFF000000;
        int var10 = (int) (Math.random() * 20.0D) + 238 - 10 | 0xFF00 << 16;
        if (arg2 != -28322) {
            return true;
        }
        int var11 = (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D);
        boolean[][] var12 = new boolean[class566.field8260 + 2 + 1][class566.field8260 + 1 + 2];
        for (int var13 = var3; var13 < var3 + 104; var13 += class566.field8260) {
            for (int var36 = var4; var36 < (var4 + 104); var36 += class566.field8260) {
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
                int var41 = class566.field8260 + var13;
                if (var41 < 104) {
                    var41++;
                }
                int var42 = class566.field8260 + var36;
                if (var42 < 104) {
                    var38 += 4;
                    var42++;
                }
                arg0.method652(0, 0, var37 + (class566.field8260 * 4), class566.field8260 * 4 + var38);
                arg0.method646(-16777216);
                for (int var43 = arg1; var43 <= 3; var43++) {
                    for (int var50 = 0; var50 <= class566.field8260; var50++) {
                        for (int var56 = 0; var56 <= class566.field8260; var56++) {
                            var12[var50][var56] = class257.method1538(arg2 + 28384, var40 + var56, arg1, var39 + var50, var43);
                        }
                    }
                    class262.field3404[var43].method2170(0, 0, 1024, var39, var40, var41, var42, var12);
                    if (!class32.field539) {
                        for (int var51 = -4; var51 < class566.field8260; var51++) {
                            for (int var52 = -4; var52 < class566.field8260; var52++) {
                                int var53 = var13 + var51;
                                int var54 = var36 + var52;
                                if (var53 >= var3 && var54 >= var4 && class257.method1538(75, var54, arg1, var53, var43)) {
                                    int var55 = var43;
                                    if (class125.method898(93, var53, var54)) {
                                        var55 = var43 - 1;
                                    }
                                    if (var55 >= 0) {
                                        class474.method2729(var9, true, (class566.field8260 - var52) * 4 + var38 - 4, var10, var51 * 4 + var37, var55, arg0, var54, var53);
                                    }
                                }
                            }
                        }
                    }
                }
                if (class32.field539) {
                    class516 var44 = class629.field9104[arg1];
                    for (int var45 = 0; var45 < class566.field8260; var45++) {
                        for (int var46 = 0; var46 < class566.field8260; var46++) {
                            int var47 = var13 + var45;
                            int var48 = var36 + var46;
                            int var49 = var44.field7243[var47 - var44.field7242][var48 - var44.field7247];
                            if ((var49 & 0x40240000) != 0) {
                                arg0.method710((class566.field8260 - var46) * 4 + var38 - 4, 22339, -1713569622, 4, var45 * 4 + var37, 4);
                            } else if ((var49 & 0x800000) != 0) {
                                arg0.method695(-1713569622, (class566.field8260 - var46) * 4 + (var38 - 4), var37 - -(var45 * 4), 4, (byte) 93);
                            } else if ((var49 & 0x2000000) != 0) {
                                arg0.method644(-1713569622, 4, var38 + ((class566.field8260 - var46) * 4) - 4, var45 * 4 + var37 - -3, true);
                            } else if ((var49 & 0x8000000) != 0) {
                                arg0.method695(-1713569622, (class566.field8260 - var46) * 4 + var38 + 3 - 4, var45 * 4 + var37, 4, (byte) 99);
                            } else if ((var49 & 0x20000000) != 0) {
                                arg0.method644(-1713569622, 4, (class566.field8260 - var46) * 4 + var38 - 4, var45 * 4 + var37, true);
                            }
                        }
                    }
                }
                arg0.method700(var37, var38, class566.field8260 * 4, class566.field8260 * 4, var11, 2);
                class11.field269.method44((var13 - var3) * 4 + 48, -((var36 - var4) * 4) + 464 - class566.field8260 * 4, class566.field8260 * 4, class566.field8260 * 4, var37, var38);
            }
        }
        arg0.method699();
        arg0.method646(-16777215);
        class12.method83((byte) -83);
        class147.field2095 = 0;
        class586.field8500.method1905(0);
        if (!class32.field539) {
            for (int var14 = var3; var14 < var3 + 104; var14++) {
                for (int var20 = var4; var20 < (var4 + 104); var20++) {
                    for (int var21 = arg1; var21 <= (arg1 + 1) && var21 <= 3; var21++) {
                        if (class257.method1538(98, var20, arg1, var14, var21)) {
                            class83 var22 = (class83) class566.method3261(var21, var14, var20);
                            if (var22 == null) {
                                var22 = (class83) class434.method2583(var21, var14, var20, field5522 == null ? (field5522 = method2302("je")) : field5522);
                            }
                            if (var22 == null) {
                                var22 = (class83) class386.method2381(var21, var14, var20);
                            }
                            if (var22 == null) {
                                var22 = (class83) class374.method2304(var21, var14, var20);
                            }
                            if (var22 != null) {
                                class289 var23 = class60.field965.method2596(arg2 ^ 0xFFFF915E, var22.method277((byte) 95));
                                if (!var23.field4265 || class232.field3066) {
                                    int var24 = var23.field4266;
                                    if (var23.field4213 != null) {
                                        for (int var25 = 0; var25 < var23.field4213.length; var25++) {
                                            if (var23.field4213[var25] != -1) {
                                                class289 var26 = class60.field965.method2596(0, var23.field4213[var25]);
                                                if (var26.field4266 >= 0) {
                                                    var24 = var26.field4266;
                                                }
                                            }
                                        }
                                    }
                                    if (var24 >= 0) {
                                        boolean var27 = false;
                                        if (var24 >= 0) {
                                            class168 var28 = class189.field2572.method2757(var24, (byte) -46);
                                            if (var28 != null && var28.field2381) {
                                                var27 = true;
                                            }
                                        }
                                        int var29 = var14;
                                        int var30 = var20;
                                        if (var27) {
                                            int[][] var31 = class629.field9104[var21].field7243;
                                            int var32 = class629.field9104[var21].field7242;
                                            int var33 = class629.field9104[var21].field7247;
                                            for (int var34 = 0; var34 < 10; var34++) {
                                                int var35 = (int) (Math.random() * 4.0D);
                                                if (var35 == 0 && var29 > var3 && var29 > (var14 - 3) && (var31[var29 - var32 - 1][var30 - var33] & 0x2C0108) == 0) {
                                                    var29--;
                                                }
                                                if (var35 == 1 && var29 < (var3 + 104 - 1) && var29 < (var14 + 3) && (var31[var29 + 1 - var32][var30 - var33] & 0x2C0180) == 0) {
                                                    var29++;
                                                }
                                                if (var35 == 2 && var4 < var30 && var20 - 3 < var30 && (var31[var29 - var32][var30 - var33 - 1] & 0x2C0102) == 0) {
                                                    var30--;
                                                }
                                                if (var35 == 3 && var30 < var4 + 104 - 1 && var30 < var20 + 3 && (var31[var29 - var32][var30 + 1 - var33] & 0x2C0120) == 0) {
                                                    var30++;
                                                }
                                            }
                                        }
                                        class157.field2237[class147.field2095] = var23.field4224;
                                        class326.field4720[class147.field2095] = var29;
                                        class8.field230[class147.field2095] = var30;
                                        class147.field2095++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (class103.field1546 != null) {
                class223.field2947.field4344 = 1;
                class189.field2572.method2752(36, 1024, 64);
                for (int var15 = 0; var15 < class103.field1546.field1081; var15++) {
                    int var16 = class103.field1546.field1080[var15];
                    if (var16 >> 28 == class321.field4681.field7905) {
                        int var17 = ((var16 & 0xFFFECF4) >> 14) - class397.field6005;
                        int var18 = (var16 & 0x3FFF) - class403.field6049;
                        if (var17 >= 0 && var17 < class72.field1144 && var18 >= 0 && class668.field9444 > var18) {
                            class586.field8500.method1909(new class258(var15), (byte) -81);
                        } else {
                            class168 var19 = class189.field2572.method2757(class103.field1546.field1079[var15], (byte) -46);
                            if (var19.field2361 != null && var19.field2344 + var17 >= 0 && class72.field1144 > (var19.field2373 + var17) && (var19.field2355 + var18) >= 0 && var19.field2374 + var18 < class668.field9444) {
                                class586.field8500.method1909(new class258(var15), (byte) -81);
                            }
                        }
                    }
                }
                class189.field2572.method2752(36, 128, 64);
                class223.field2947.field4344 = 2;
                class223.field2947.method1829(0);
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(III)Z", line = 788)
    public static final boolean method2298(int arg0, int arg1, int arg2) {
        if (arg1 != 16383) {
            method2297(null, -57, 6);
        }
        field5518++;
        return false;
    }

    @OriginalMember(owner = "client!sea", name = "toString", descriptor = "()Ljava/lang/String;", line = 800)
    public final String toString() {
        field5517++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(Z)V", line = 811)
    public static final void method2299(boolean arg0) {
        class474.field6805.method1905(0);
        field5516++;
        class267.field3485 = 0;
        if (!arg0) {
            field5521 = 11;
        }
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(IFI[FZIIIFII)V", line = 830)
    public static final void method2300(int arg0, float arg1, int arg2, float[] arg3, boolean arg4, int arg5, int arg6, int arg7, float arg8, int arg9, int arg10) {
        int var11 = arg10 - arg0;
        int var12 = arg7 - arg6;
        int var13 = arg5 - arg2;
        field5513++;
        float var14 = arg3[2] * (float) var13 + arg3[1] * (float) var11 + arg3[0] * (float) var12;
        float var15 = arg3[5] * (float) var13 + arg3[3] * (float) var12 + arg3[4] * (float) var11;
        float var16 = arg3[8] * (float) var13 + arg3[7] * (float) var11 + arg3[6] * (float) var12;
        float var17 = (float) Math.atan2((double) var14, (double) var16) / 6.2831855F + 0.5F;
        if (arg8 != 1.0F) {
            var17 = arg8 * var17;
        }
        float var18 = var15 + arg1 + 0.5F;
        if (!arg4) {
            return;
        }
        if (arg9 == 1) {
            float var19 = var17;
            var17 = -var18;
            var18 = var19;
        } else if (arg9 == 2) {
            var18 = -var18;
            var17 = -var17;
        } else if (arg9 == 3) {
            float var20 = var17;
            var17 = var18;
            var18 = -var20;
        }
        class109.field1623 = var18;
        class623.field9015 = var17;
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(IIIIII)V", line = 885)
    public static final void method2301(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg2 != -3) {
            method2300(83, 0.48403454F, -54, null, false, -25, -63, 17, 0.8897592F, 76, 10);
        }
        field5515++;
        if (arg5 > class148.field2106 || class323.field4704 > arg4) {
            return;
        }
        boolean var6;
        if (class175.field2455 > arg3) {
            var6 = false;
            arg3 = class175.field2455;
        } else if (arg3 <= class375.field5631) {
            var6 = true;
        } else {
            arg3 = class375.field5631;
            var6 = false;
        }
        boolean var7;
        if (class175.field2455 > arg0) {
            arg0 = class175.field2455;
            var7 = false;
        } else if (class375.field5631 >= arg0) {
            var7 = true;
        } else {
            var7 = false;
            arg0 = class375.field5631;
        }
        if (arg5 >= class323.field4704) {
            class41.method235(arg3, class565.field8253[arg5++], 0, arg0, arg1);
        } else {
            arg5 = class323.field4704;
        }
        if (arg4 > class148.field2106) {
            arg4 = class148.field2106;
        } else {
            class41.method235(arg3, class565.field8253[arg4--], arg2 + 3, arg0, arg1);
        }
        if (var6 && var7) {
            for (int var8 = arg5; var8 <= arg4; var8++) {
                int[] var9 = class565.field8253[var8];
                var9[arg3] = var9[arg0] = arg1;
            }
            return;
        }
        if (var6) {
            for (int var10 = arg5; var10 <= arg4; var10++) {
                class565.field8253[var10][arg3] = arg1;
            }
            return;
        }
        if (var7) {
            for (int var11 = arg5; var11 <= arg4; var11++) {
                class565.field8253[var11][arg0] = arg1;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!sea", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 998)
    public class373(String arg0, int arg1) {
        this.field5511 = arg0;
        this.field5519 = arg1;
    }
}
