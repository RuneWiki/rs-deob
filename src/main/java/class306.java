import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class306 {

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "Lwia;")
    private class791 field4401;

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "Lwia;")
    private class791 field4402;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "Lvv;")
    public static class343 field4398 = new class343();

    @OriginalMember(owner = "client!sb", name = "n", descriptor = "[[I")
    public static int[][] field4411 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!sb", name = "o", descriptor = "Lvea;")
    public static class288 field4412 = new class288(3);

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "I")
    public static int field4399;

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "I")
    public static int field4400;

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "I")
    public static int field4403;

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "I")
    public static int field4404;

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "I")
    public static int field4405;

    @OriginalMember(owner = "client!sb", name = "j", descriptor = "I")
    public static int field4407;

    @OriginalMember(owner = "client!sb", name = "k", descriptor = "I")
    public static int field4408;

    @OriginalMember(owner = "client!sb", name = "l", descriptor = "I")
    public static int field4409;

    @OriginalMember(owner = "client!sb", name = "m", descriptor = "I")
    public static int field4410;

    @OriginalMember(owner = "client!sb", name = "i", descriptor = "Llk;")
    private class612 field4406;

    // $FF: synthetic field
    @OriginalMember(owner = "client!sb", name = "p", descriptor = "Ljava/lang/Class;")
    public static Class field4413;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Z)I")
    public static final int method1977(boolean arg0) {
        if (!arg0) {
            field4398 = null;
        }
        field4408++;
        return 16;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IB)I")
    public static final int method1978(int arg0, byte arg1) {
        field4407++;
        double var2 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var4 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var6 = (double) (arg0 & 0xFF) / 256.0D;
        double var8 = var2;
        if (arg1 != 64) {
            return -25;
        }
        if (var2 > var4) {
            var8 = var4;
        }
        if (var6 < var8) {
            var8 = var6;
        }
        double var10 = var2;
        if (var2 < var4) {
            var10 = var4;
        }
        if (var10 < var6) {
            var10 = var6;
        }
        double var12 = 0.0D;
        double var14 = 0.0D;
        double var16 = (var8 + var10) / 2.0D;
        if (var8 != var10) {
            if (var16 < 0.5D) {
                var14 = (var10 - var8) / (var8 + var10);
            }
            if (var16 >= 0.5D) {
                var14 = (var10 - var8) / (2.0D - var10 - var8);
            }
            if (var2 == var10) {
                var12 = (var4 - var6) / (var10 - var8);
            } else if (var4 == var10) {
                var12 = (var6 - var2) / (var10 - var8) + 2.0D;
            } else if (var6 == var10) {
                var12 = (var2 - var4) / (var10 - var8) + 4.0D;
            }
        }
        double var18 = var12 / 6.0D;
        int var20 = (int) (var18 * 256.0D);
        int var21 = (int) (var14 * 256.0D);
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        int var22 = (int) (var16 * 256.0D);
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        if (var22 > 243) {
            var21 >>= 0x4;
        } else if (var22 > 217) {
            var21 >>= 0x3;
        } else if (var22 > 192) {
            var21 >>= 0x2;
        } else if (var22 > 179) {
            var21 >>= 0x1;
        }
        return (var22 >> 1) + (((var20 & 0xFF) >> 2 << 10) + (var21 >> 5 << 7));
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lha;BI)Z")
    public static final boolean method1979(class65 arg0, byte arg1, int arg2) {
        field4410++;
        int var3 = (class768.field10571 - 104) / 2;
        int var4 = (class350.field4898 - 104) / 2;
        boolean var5 = true;
        for (int var6 = var3; var6 < (var3 + 104); var6++) {
            for (int var57 = var4; var57 < (var4 + 104); var57++) {
                for (int var58 = arg2; var58 <= 3; var58++) {
                    if (class580.method3400(var6, var58, var57, arg2, 51)) {
                        int var59 = var58;
                        if (class124.method941(4, var57, var6)) {
                            var59 = var58 - 1;
                        }
                        if (var59 >= 0) {
                            var5 &= class125.method946((byte) -40, var57, var59, var6);
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
        class779.field10693 = arg0.method458((byte) 125, 512, 512, var7, 512, 0);
        class738.method4107(0);
        int var9 = ((int) (Math.random() * 20.0D) + 228 << 16) + ((int) (Math.random() * 20.0D) + 228 << 8) + (int) (Math.random() * 20.0D) + 238 - 10 | 0xFF000000;
        int var10 = (int) (Math.random() * 20.0D) + 238 - 10 | 0xFF00 << 16;
        int var11 = (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D);
        boolean[][] var12 = new boolean[class321.field4538 + 1 + 2][class321.field4538 + 1 + 2];
        for (int var13 = var3; var13 < var3 + 104; var13 += class321.field4538) {
            for (int var36 = var4; var36 < (var4 + 104); var36 += class321.field4538) {
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
                int var41 = class321.field4538 + var13;
                if (var41 < 104) {
                    var41++;
                }
                int var42 = class321.field4538 + var36;
                if (var42 < 104) {
                    var38 += 4;
                    var42++;
                }
                arg0.method434(0, 0, class321.field4538 * 4 + var37, var38 - -(class321.field4538 * 4));
                arg0.method509(-16777216);
                for (int var43 = arg2; var43 <= 3; var43++) {
                    for (int var50 = 0; var50 <= class321.field4538; var50++) {
                        for (int var56 = 0; var56 <= class321.field4538; var56++) {
                            var12[var50][var56] = class580.method3400(var39 + var50, var43, var40 + var56, arg2, 66);
                        }
                    }
                    class411.field5572[var43].method1914(0, 0, 1024, var39, var40, var41, var42, var12);
                    if (!class409.field5559) {
                        for (int var51 = -4; var51 < class321.field4538; var51++) {
                            for (int var52 = -4; var52 < class321.field4538; var52++) {
                                int var53 = var13 + var51;
                                int var54 = var36 + var52;
                                if (var53 >= var3 && var54 >= var4 && class580.method3400(var53, var43, var54, arg2, 127)) {
                                    int var55 = var43;
                                    if (class124.method941(4, var54, var53)) {
                                        var55 = var43 - 1;
                                    }
                                    if (var55 >= 0) {
                                        class480.method2861(var55, var10, var53, 1, var9, var54, var51 * 4 + var37, var38 - -((class321.field4538 - var52) * 4) - 4, arg0);
                                    }
                                }
                            }
                        }
                    }
                }
                if (class409.field5559) {
                    class274 var44 = class346.field4838[arg2];
                    for (int var45 = 0; var45 < class321.field4538; var45++) {
                        for (int var46 = 0; var46 < class321.field4538; var46++) {
                            int var47 = var13 + var45;
                            int var48 = var36 + var46;
                            int var49 = var44.field3974[var47 - var44.field3968][var48 - var44.field3978];
                            if ((var49 & 0x40240000) != 0) {
                                arg0.method436(var37 + (var45 * 4), 4, -1713569622, (class321.field4538 - var46) * 4 + var38 - 4, true, 4);
                            } else if ((var49 & 0x800000) != 0) {
                                arg0.method465(4, 1, (class321.field4538 - var46) * 4 + var38 - 4, -1713569622, var37 + (var45 * 4));
                            } else if ((var49 & 0x2000000) != 0) {
                                arg0.method547(var45 * 4 + var37 + 3, 116, 4, var38 + ((-var46 + class321.field4538) * 4) - 4, -1713569622);
                            } else if ((var49 & 0x8000000) != 0) {
                                arg0.method465(4, 1, (class321.field4538 - var46) * 4 + var38 - 1, -1713569622, var45 * 4 + var37);
                            } else if ((var49 & 0x20000000) != 0) {
                                arg0.method547(var45 * 4 + var37, 126, 4, (class321.field4538 - var46) * 4 + var38 - 4, -1713569622);
                            }
                        }
                    }
                }
                arg0.method495(var37, var38, class321.field4538 * 4, class321.field4538 * 4, var11, 2);
                class779.field10693.method360(((var13 - var3) * 4) + 48, -(class321.field4538 * 4) + 464 - (-var4 + var36) * 4, class321.field4538 * 4, class321.field4538 * 4, var37, var38);
            }
        }
        arg0.method511();
        if (arg1 > -13) {
            return true;
        }
        arg0.method509(-16777215);
        class351.method2224((byte) 119);
        class11.field213 = 0;
        class174.field2692.method1729((byte) -128);
        if (!class409.field5559) {
            for (int var14 = var3; var14 < (var3 + 104); var14++) {
                for (int var20 = var4; var20 < var4 + 104; var20++) {
                    for (int var21 = arg2; (arg2 + 1) >= var21 && var21 <= 3; var21++) {
                        if (class580.method3400(var14, var21, var20, arg2, 71)) {
                            class484 var22 = (class484) class266.method1725(var21, var14, var20);
                            if (var22 == null) {
                                var22 = (class484) class537.method3227(var21, var14, var20, field4413 == null ? (field4413 = method1987("nq")) : field4413);
                            }
                            if (var22 == null) {
                                var22 = (class484) class335.method2132(var21, var14, var20);
                            }
                            if (var22 == null) {
                                var22 = (class484) class26.method241(var21, var14, var20);
                            }
                            if (var22 != null) {
                                class282 var23 = class277.field4038.method3919(true, var22.method1483(24853));
                                if (!var23.field4166 || class792.field10895) {
                                    int var24 = var23.field4093;
                                    if (var23.field4117 != null) {
                                        for (int var25 = 0; var25 < var23.field4117.length; var25++) {
                                            if (var23.field4117[var25] != -1) {
                                                class282 var26 = class277.field4038.method3919(true, var23.field4117[var25]);
                                                if (var26.field4093 >= 0) {
                                                    var24 = var26.field4093;
                                                }
                                            }
                                        }
                                    }
                                    if (var24 >= 0) {
                                        boolean var27 = false;
                                        if (var24 >= 0) {
                                            class413 var28 = class53.field669.method1231(44, var24);
                                            if (var28 != null && var28.field5612) {
                                                var27 = true;
                                            }
                                        }
                                        int var29 = var14;
                                        int var30 = var20;
                                        if (var27) {
                                            int[][] var31 = class346.field4838[var21].field3974;
                                            int var32 = class346.field4838[var21].field3968;
                                            int var33 = class346.field4838[var21].field3978;
                                            for (int var34 = 0; var34 < 10; var34++) {
                                                int var35 = (int) (Math.random() * 4.0D);
                                                if (var35 == 0 && var3 < var29 && var29 > (var14 - 3) && (var31[var29 - var32 - 1][var30 - var33] & 0x2C0108) == 0) {
                                                    var29--;
                                                }
                                                if (var35 == 1 && var29 < var3 + 104 - 1 && var29 < var14 + 3 && (var31[var29 + 1 - var32][var30 - var33] & 0x2C0180) == 0) {
                                                    var29++;
                                                }
                                                if (var35 == 2 && var30 > var4 && var20 - 3 < var30 && (var31[var29 - var32][var30 - var33 - 1] & 0x2C0102) == 0) {
                                                    var30--;
                                                }
                                                if (var35 == 3 && (var4 + 104 - 1) > var30 && var30 < (var20 + 3) && (var31[var29 - var32][var30 + 1 - var33] & 0x2C0120) == 0) {
                                                    var30++;
                                                }
                                            }
                                        }
                                        class109.field1605[class11.field213] = var23.field4100;
                                        class444.field6045[class11.field213] = var29;
                                        class481.field6763[class11.field213] = var30;
                                        class11.field213++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (class161.field2550 != null) {
                class564.field8000.field10884 = 1;
                class53.field669.method1237(1024, 0, 64);
                for (int var15 = 0; var15 < class161.field2550.field8878; var15++) {
                    int var16 = class161.field2550.field8880[var15];
                    if (var16 >> 28 == class210.field3250.field5755) {
                        int var17 = ((var16 & 0xFFFE294) >> 14) - class124.field1922;
                        int var18 = (var16 & 0x3FFF) - class88.field999;
                        if (var17 >= 0 && class768.field10571 > var17 && var18 >= 0 && var18 < class350.field4898) {
                            class174.field2692.method1727(new class489(var15), (byte) 82);
                        } else {
                            class413 var19 = class53.field669.method1231(78, class161.field2550.field8883[var15]);
                            if (var19.field5629 != null && (var19.field5635 + var17) >= 0 && class768.field10571 > (var19.field5661 + var17) && var19.field5640 + var18 >= 0 && class350.field4898 > var19.field5650 + var18) {
                                class174.field2692.method1727(new class489(var15), (byte) 86);
                            }
                        }
                    }
                }
                class53.field669.method1237(128, 0, 64);
                class564.field8000.field10884 = 2;
                class564.field8000.method4340((byte) -111);
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(BLcn;)Laj;")
    public final class331 method1980(byte arg0, class540 arg1) {
        field4409++;
        if (arg1 == null) {
            return null;
        }
        class345 var3 = arg1.method1656(0);
        if (arg0 != 25) {
            field4412 = null;
        }
        if (class422.field5777 == var3) {
            return new class208((class457) arg1);
        } else if (class686.field9546 == var3) {
            return new class719(this.method1981(8388608), (class449) arg1);
        } else if (class523.field7392 == var3) {
            return new class39(this.field4402, (class687) arg1);
        } else if (class463.field6534 == var3) {
            return new class661(this.field4402, (class629) arg1);
        } else if (class65.field793 == var3) {
            return new class295(this.field4402, this.field4401, (class287) arg1);
        } else if (class759.field10480 == var3) {
            return new class764(this.field4402, this.field4401, (class730) arg1);
        } else if (class450.field6161 == var3) {
            return new class476(this.field4402, this.field4401, (class253) arg1);
        } else if (class384.field5287 == var3) {
            return new class159(this.field4402, this.field4401, (class393) arg1);
        } else if (class668.field9298 == var3) {
            return new class423(this.field4402, (class713) arg1);
        } else if (class95.field1076 == var3) {
            return new class603(this.field4402, this.field4401, (class606) arg1);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)Llk;")
    private final class612 method1981(int arg0) {
        field4404++;
        if (this.field4406 == null) {
            this.field4406 = new class612();
        }
        if (arg0 != 8388608) {
            method1979(null, (byte) -96, -118);
        }
        return this.field4406;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIIIILmb;IIIII)Z")
    public static final boolean method1982(int arg0, int arg1, int arg2, int arg3, int arg4, class274 arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field4403++;
        int var11 = arg6;
        int var12 = arg8;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg6 - var13;
        class228.field3495[var13][var14] = 99;
        int var16 = arg8 - var14;
        class673.field9380[var13][var14] = 0;
        byte var17 = 0;
        int var18 = 0;
        class753.field10404[var17] = arg6;
        byte var10001 = var17;
        int var27 = var17 + 1;
        class511.field7231[var10001] = arg8;
        int[][] var19 = arg5.field3974;
        int var20 = 105 / ((arg3 - 4) / 40);
        while (var27 != var18) {
            var12 = class511.field7231[var18];
            var11 = class753.field10404[var18];
            int var21 = var11 - var15;
            int var22 = var12 - arg5.field3978;
            var18 = var18 + 1 & 0xFFF;
            int var23 = var12 - var16;
            int var24 = var11 - arg5.field3968;
            if (arg10 == -4) {
                if (arg1 == var11 && arg9 == var12) {
                    class666.field9268 = var11;
                    class506.field7193 = var12;
                    return true;
                }
            } else if (arg10 == -3) {
                if (class12.method133(var11, (byte) 64, 1, arg9, var12, 1, arg1, arg0, arg2)) {
                    class506.field7193 = var12;
                    class666.field9268 = var11;
                    return true;
                }
            } else if (arg10 == -2) {
                if (arg5.method1779(var12, 1, arg2, arg1, arg7, var11, arg9, arg0, 1, (byte) 101)) {
                    class506.field7193 = var12;
                    class666.field9268 = var11;
                    return true;
                }
            } else if (arg10 == -1) {
                if (arg5.method1771(arg9, arg2, 1, arg0, var11, (byte) 69, var12, arg1, arg7)) {
                    class506.field7193 = var12;
                    class666.field9268 = var11;
                    return true;
                }
            } else if (arg10 == 0 || arg10 == 1 || arg10 == 2 || arg10 == 3 || arg10 == 9) {
                if (arg5.method1769(1, var12, arg9, 29514, var11, arg4, arg1, arg10)) {
                    class666.field9268 = var11;
                    class506.field7193 = var12;
                    return true;
                }
            } else if (arg5.method1776((byte) 45, 1, arg9, arg10, var12, var11, arg1, arg4)) {
                class666.field9268 = var11;
                class506.field7193 = var12;
                return true;
            }
            int var26 = class673.field9380[var21][var23] + 1;
            if (var21 > 0 && class228.field3495[var21 - 1][var23] == 0 && (var19[var24 - 1][var22] & 0x42240000) == 0) {
                class753.field10404[var27] = var11 - 1;
                class511.field7231[var27] = var12;
                class228.field3495[var21 - 1][var23] = 2;
                var27 = var27 + 1 & 0xFFF;
                class673.field9380[var21 - 1][var23] = var26;
            }
            if (var21 < 127 && class228.field3495[var21 + 1][var23] == 0 && (var19[var24 + 1][var22] & 0x60240000) == 0) {
                class753.field10404[var27] = var11 + 1;
                class511.field7231[var27] = var12;
                class228.field3495[var21 + 1][var23] = 8;
                var27 = var27 + 1 & 0xFFF;
                class673.field9380[var21 + 1][var23] = var26;
            }
            if (var23 > 0 && class228.field3495[var21][var23 - 1] == 0 && (var19[var24][var22 - 1] & 0x40A40000) == 0) {
                class753.field10404[var27] = var11;
                class511.field7231[var27] = var12 - 1;
                var27 = var27 + 1 & 0xFFF;
                class228.field3495[var21][var23 - 1] = 1;
                class673.field9380[var21][var23 - 1] = var26;
            }
            if (var23 < 127 && class228.field3495[var21][var23 + 1] == 0 && (var19[var24][var22 + 1] & 0x48240000) == 0) {
                class753.field10404[var27] = var11;
                class511.field7231[var27] = var12 + 1;
                class228.field3495[var21][var23 + 1] = 4;
                var27 = var27 + 1 & 0xFFF;
                class673.field9380[var21][var23 + 1] = var26;
            }
            if (var21 > 0 && var23 > 0 && class228.field3495[var21 - 1][var23 - 1] == 0 && (var19[var24 - 1][var22 - 1] & 0x43A40000) == 0 && (var19[var24 - 1][var22] & 0x42240000) == 0 && (var19[var24][var22 - 1] & 0x40A40000) == 0) {
                class753.field10404[var27] = var11 - 1;
                class511.field7231[var27] = var12 - 1;
                var27 = var27 + 1 & 0xFFF;
                class228.field3495[var21 - 1][var23 - 1] = 3;
                class673.field9380[var21 - 1][var23 - 1] = var26;
            }
            if (var21 < 127 && var23 > 0 && class228.field3495[var21 + 1][var23 - 1] == 0 && (var19[var24 + 1][var22 - 1] & 0x60E40000) == 0 && (var19[var24 + 1][var22] & 0x60240000) == 0 && (var19[var24][var22 - 1] & 0x40A40000) == 0) {
                class753.field10404[var27] = var11 + 1;
                class511.field7231[var27] = var12 - 1;
                var27 = var27 + 1 & 0xFFF;
                class228.field3495[var21 + 1][var23 - 1] = 9;
                class673.field9380[var21 + 1][var23 - 1] = var26;
            }
            if (var21 > 0 && var23 < 127 && class228.field3495[var21 - 1][var23 + 1] == 0 && (var19[var24 - 1][var22 + 1] & 0x4E240000) == 0 && (var19[var24 - 1][var22] & 0x42240000) == 0 && (var19[var24][var22 + 1] & 0x48240000) == 0) {
                class753.field10404[var27] = var11 - 1;
                class511.field7231[var27] = var12 + 1;
                class228.field3495[var21 - 1][var23 + 1] = 6;
                var27 = var27 + 1 & 0xFFF;
                class673.field9380[var21 - 1][var23 + 1] = var26;
            }
            if (var21 < 127 && var23 < 127 && class228.field3495[var21 + 1][var23 + 1] == 0 && (var19[var24 + 1][var22 + 1] & 0x78240000) == 0 && (var19[var24 + 1][var22] & 0x60240000) == 0 && (var19[var24][var22 + 1] & 0x48240000) == 0) {
                class753.field10404[var27] = var11 + 1;
                class511.field7231[var27] = var12 + 1;
                class228.field3495[var21 + 1][var23 + 1] = 12;
                var27 = var27 + 1 & 0xFFF;
                class673.field9380[var21 + 1][var23 + 1] = var26;
            }
        }
        class666.field9268 = var11;
        class506.field7193 = var12;
        return false;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(BIII)V")
    public static final void method1983(byte arg0, int arg1, int arg2, int arg3) {
        field4399++;
        if (class23.field381 == arg3 && class633.field8891 == arg2 && class9.field90 == arg1) {
            return;
        }
        class633.field8891 = arg2;
        class9.field90 = arg1;
        class23.field381 = arg3;
        class98.field1115 = true;
        double var4 = -((double) (arg3 * 2) * 3.141592653589793D) / 16384.0D;
        double var6 = -((double) (arg2 * 2) * 3.141592653589793D) / 16384.0D;
        double var8 = Math.cos(var6);
        double var10 = Math.sin(var6);
        double var12 = Math.cos(var4);
        double var14 = Math.sin(var4);
        if (arg0 >= -21) {
            method1983((byte) 22, 51, -39, 96);
        }
        class283.field4190 = 0.0D;
        class242.field3615 = -var8 * var14;
        class27.field403 = -var10 * var12;
        class438.field5905 = var14;
        class442.field6030 = var10 * var14;
        class77.field877 = var10;
        class246.field3654 = var8 * var12;
        class3.field21 = var8;
        class582.field8225 = var12;
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(Z)V")
    public static void method1984(boolean arg0) {
        field4411 = null;
        field4398 = null;
        if (arg0) {
            field4412 = null;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(BII)Z")
    public static final boolean method1985(byte arg0, int arg1, int arg2) {
        if (arg0 < 103) {
            method1985((byte) -75, -103, -125);
        }
        field4405++;
        return (arg1 & 0x100100) != 0;
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Lwia;Lwia;)V")
    public class306(class791 arg0, class791 arg1) {
        this.field4401 = arg1;
        this.field4402 = arg0;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;IZ)V")
    public static final void method1986(String arg0, int arg1, String arg2, int arg3, boolean arg4) {
        field4400++;
        class312 var5 = class45.method326((byte) -73);
        var5.field4445.method2952(0, class763.field10510.field7314);
        var5.field4445.method2957(0, 1267307848);
        int var6 = var5.field4445.field7042;
        var5.field4445.method2957(650, 1267307848);
        int[] var7 = class17.method160(var5, (byte) 89);
        int var8 = var5.field4445.field7042;
        var5.field4445.method2953(arg2, -28136);
        var5.field4445.method2957(class467.field6560, 1267307848);
        var5.field4445.method2953(arg0, -28136);
        var5.field4445.method3003(class243.field3624, (byte) 121);
        var5.field4445.method2952(0, class140.field2081);
        var5.field4445.method2952(0, class60.field734.field3718);
        class453.method2707((byte) 104, var5.field4445);
        String var9 = class12.field231;
        var5.field4445.method2952(0, var9 == null ? 0 : 1);
        if (var9 != null) {
            var5.field4445.method2953(var9, -28136);
        }
        if (arg3 > -92) {
            return;
        }
        var5.field4445.method2952(0, arg1);
        var5.field4445.method2952(0, arg4 ? 1 : 0);
        var5.field4445.field7042 += 7;
        var5.field4445.method2963(var7, var8, 599866564, var5.field4445.field7042);
        var5.field4445.method2937(var5.field4445.field7042 - var6, (byte) 125);
        class208.method1440(var5, 111);
        class96.field1095 = 0;
        class617.field8633 = -3;
        class335.field4720 = 0;
        class339.field4745 = 1;
        if (arg1 < 13) {
            class337.field4726 = true;
            class583.method3411(86400000);
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1987(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
