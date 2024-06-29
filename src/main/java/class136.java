import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class136 {

    @OriginalMember(owner = "client!kg", name = "l", descriptor = "I")
    private int field2385 = -1;

    @OriginalMember(owner = "client!kg", name = "i", descriptor = "I")
    private int field2382 = 0;

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "Lcf;")
    public static class93 field2377 = class147.method1066(")4l=", -48);

    @OriginalMember(owner = "client!kg", name = "k", descriptor = "[I")
    public static int[] field2384 = new int[32];

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "I")
    public static int field2374;

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "I")
    public static int field2375;

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "I")
    public static int field2376;

    @OriginalMember(owner = "client!kg", name = "f", descriptor = "I")
    public static int field2379;

    @OriginalMember(owner = "client!kg", name = "g", descriptor = "I")
    public int field2380;

    @OriginalMember(owner = "client!kg", name = "h", descriptor = "I")
    public static int field2381;

    @OriginalMember(owner = "client!kg", name = "j", descriptor = "I")
    public int field2383;

    @OriginalMember(owner = "client!kg", name = "m", descriptor = "I")
    public static int field2386;

    @OriginalMember(owner = "client!kg", name = "n", descriptor = "I")
    public int field2387;

    @OriginalMember(owner = "client!kg", name = "o", descriptor = "I")
    public static int field2388;

    @OriginalMember(owner = "client!kg", name = "p", descriptor = "I")
    public int field2389;

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "Lhg;")
    public static class177 field2378;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(II)V")
    private final void method989(int arg0, int arg1) {
        field2386++;
        double var3 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        if (arg1 != 15143) {
            return;
        }
        double var5 = (double) ((arg0 & 0xFF228C) >> 16) / 256.0D;
        double var7 = (double) (arg0 & 0xFF) / 256.0D;
        double var9 = var5;
        double var11 = 0.0D;
        double var13 = 0.0D;
        double var15 = var5;
        if (var3 > var5) {
            var15 = var3;
        }
        if (var3 < var5) {
            var9 = var3;
        }
        if (var9 > var7) {
            var9 = var7;
        }
        if (var15 < var7) {
            var15 = var7;
        }
        double var17 = (var9 + var15) / 2.0D;
        this.field2383 = (int) (var17 * 256.0D);
        if (this.field2383 < 0) {
            this.field2383 = 0;
        } else if (this.field2383 > 255) {
            this.field2383 = 255;
        }
        if (var9 != var15) {
            if (var17 < 0.5D) {
                var11 = (var15 - var9) / (var9 + var15);
            }
            if (var5 == var15) {
                var13 = (var3 - var7) / (var15 - var9);
            } else if (var3 == var15) {
                var13 = (var7 - var5) / (var15 - var9) + 2.0D;
            } else if (var7 == var15) {
                var13 = (var5 - var3) / (var15 - var9) + 4.0D;
            }
            if (var17 >= 0.5D) {
                var11 = (var15 - var9) / (2.0D - var15 - var9);
            }
        }
        this.field2380 = (int) (var11 * 256.0D);
        double var19 = var13 / 6.0D;
        if (this.field2380 < 0) {
            this.field2380 = 0;
        } else if (this.field2380 > 255) {
            this.field2380 = 255;
        }
        if ((var17 > 0.5D)) {
            this.field2389 = (int) ((1.0D - var17) * var11 * 512.0D);
        } else {
            this.field2389 = (int) (var11 * var17 * 512.0D);
        }
        if (this.field2389 < 1) {
            this.field2389 = 1;
        }
        this.field2387 = (int) ((double) this.field2389 * var19);
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(ILee;I)V")
    public final void method990(int arg0, class280 arg1, int arg2) {
        while (true) {
            int var4 = arg1.method1907(16832);
            if (var4 == 0) {
                if (arg2 != 4002) {
                    method997(26, 69, 46);
                }
                field2374++;
                return;
            }
            this.method998(var4, arg1, -10933, arg0);
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(B)[Ldh;")
    public static final class120[] method991(byte arg0) {
        class120[] var1 = new class120[class245.field4415];
        int var2 = 0;
        if (arg0 != -65) {
            return null;
        }
        while (var2 < class245.field4415) {
            int var3 = class42.field663[var2] * class246.field4435[var2];
            byte[] var4 = class255.field4614[var2];
            int[] var5 = new int[var3];
            for (int var6 = 0; var6 < var3; var6++) {
                var5[var6] = class248.field4475[class58.method333(255, var4[var6])];
            }
            var1[var2] = new class158(class153.field2693, class226.field4044, class169.field2974[var2], class67.field1230[var2], class246.field4435[var2], class42.field663[var2], var5);
            var2++;
        }
        field2388++;
        class50.method276((byte) 120);
        return var1;
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(B)V")
    public static void method992(byte arg0) {
        field2378 = null;
        int var1 = -112 % ((arg0 - 10) / 42);
        field2377 = null;
        field2384 = null;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Ljava/lang/String;Z)V")
    public static final void method993(String arg0, boolean arg1) {
        field2381++;
        System.out.println("Bad " + arg0 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
        System.exit(1);
        if (arg1) {
            field2378 = null;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lr;Z)V")
    public static final void method994(class41 arg0, boolean arg1) {
        class77.field1434.method1152((byte) -5, arg0);
        while (true) {
            class41 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class41[][] var7;
            class41 var66;
            do {
                class41 var65;
                do {
                    class41 var64;
                    do {
                        class41 var63;
                        do {
                            do {
                                do {
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class41) class77.field1434.method1158(1375765729);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field649);
                                            var3 = var2.field647;
                                            var4 = var2.field654;
                                            var5 = var2.field655;
                                            var6 = var2.field638;
                                            var7 = class232.field4138[var5];
                                            if (!var2.field635) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class41 var8 = class232.field4138[var5 - 1][var3][var4];
                                                    if (var8 != null && var8.field649) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= class206.field3703 && var3 > class246.field4427) {
                                                    class41 var9 = var7[var3 - 1][var4];
                                                    if (var9 != null && var9.field649 && (var9.field635 || (var2.field648 & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= class206.field3703 && var3 < class273.field4862 - 1) {
                                                    class41 var10 = var7[var3 + 1][var4];
                                                    if (var10 != null && var10.field649 && (var10.field635 || (var2.field648 & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= class133.field2335 && var4 > class37.field560) {
                                                    class41 var11 = var7[var3][var4 - 1];
                                                    if (var11 != null && var11.field649 && (var11.field635 || (var2.field648 & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= class133.field2335 && var4 < class5.field65 - 1) {
                                                    class41 var12 = var7[var3][var4 + 1];
                                                    if (var12 != null && var12.field649 && (var12.field635 || (var2.field648 & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field635 = false;
                                            if (var2.field640 != null) {
                                                class41 var13 = var2.field640;
                                                if (var13.field633 == null) {
                                                    if (var13.field639 != null) {
                                                        if (class160.method1162(0, var3, var4)) {
                                                            class172.method1232(var13.field639, class218.field3981, class266.field4734, class53.field867, class40.field624, var3, var4, true);
                                                        } else {
                                                            class172.method1232(var13.field639, class218.field3981, class266.field4734, class53.field867, class40.field624, var3, var4, false);
                                                        }
                                                    }
                                                } else if (class160.method1162(0, var3, var4)) {
                                                    class216.method1518(var13.field633, 0, class218.field3981, class266.field4734, class53.field867, class40.field624, var3, var4, true);
                                                } else {
                                                    class216.method1518(var13.field633, 0, class218.field3981, class266.field4734, class53.field867, class40.field624, var3, var4, false);
                                                }
                                                class70 var14 = var13.field643;
                                                if (var14 != null) {
                                                    var14.field1269.method106(0, class218.field3981, class266.field4734, class53.field867, class40.field624, var14.field1271 - class166.field2931, var14.field1272 - class263.field4692, var14.field1270 - class272.field4825, var14.field1276, var5, (class91) null);
                                                }
                                                for (int var15 = 0; var15 < var13.field645; var15++) {
                                                    class229 var16 = var13.field637[var15];
                                                    if (var16 != null) {
                                                        var16.field4104.method106(var16.field4096, class218.field3981, class266.field4734, class53.field867, class40.field624, var16.field4109 - class166.field2931, var16.field4107 - class263.field4692, var16.field4102 - class272.field4825, var16.field4094, var5, (class91) null);
                                                    }
                                                }
                                            }
                                            boolean var17 = false;
                                            if (var2.field633 == null) {
                                                if (var2.field639 != null) {
                                                    if (class160.method1162(var6, var3, var4)) {
                                                        class172.method1232(var2.field639, class218.field3981, class266.field4734, class53.field867, class40.field624, var3, var4, true);
                                                    } else {
                                                        var17 = true;
                                                        class172.method1232(var2.field639, class218.field3981, class266.field4734, class53.field867, class40.field624, var3, var4, false);
                                                    }
                                                }
                                            } else if (class160.method1162(var6, var3, var4)) {
                                                class216.method1518(var2.field633, var6, class218.field3981, class266.field4734, class53.field867, class40.field624, var3, var4, true);
                                            } else {
                                                var17 = true;
                                                if (var2.field633.field1029 != 12345678 || class198.field3599 && var5 <= class53.field875) {
                                                    class216.method1518(var2.field633, var6, class218.field3981, class266.field4734, class53.field867, class40.field624, var3, var4, false);
                                                }
                                            }
                                            if (var17) {
                                                class30 var18 = var2.field652;
                                                if (var18 != null && (var18.field440 & 0x80000000L) != 0L) {
                                                    var18.field459.method106(0, class218.field3981, class266.field4734, class53.field867, class40.field624, var18.field447 - class166.field2931, var18.field449 - class263.field4692, var18.field442 - class272.field4825, var18.field440, var5, (class91) null);
                                                }
                                            }
                                            int var19 = 0;
                                            int var20 = 0;
                                            class70 var21 = var2.field643;
                                            class24 var22 = var2.field641;
                                            if (var21 != null || var22 != null) {
                                                if (class206.field3703 == var3) {
                                                    var19++;
                                                } else if (class206.field3703 < var3) {
                                                    var19 += 2;
                                                }
                                                if (class133.field2335 == var4) {
                                                    var19 += 3;
                                                } else if (class133.field2335 > var4) {
                                                    var19 += 6;
                                                }
                                                var20 = class13.field166[var19];
                                                var2.field644 = class125.field2215[var19];
                                            }
                                            if (var21 != null) {
                                                if ((var21.field1267 & class182.field3368[var19]) == 0) {
                                                    var2.field653 = 0;
                                                } else if (var21.field1267 == 16) {
                                                    var2.field653 = 3;
                                                    var2.field636 = class288.field5149[var19];
                                                    var2.field656 = 3 - var2.field636;
                                                } else if (var21.field1267 == 32) {
                                                    var2.field653 = 6;
                                                    var2.field636 = class139.field2421[var19];
                                                    var2.field656 = 6 - var2.field636;
                                                } else if (var21.field1267 == 64) {
                                                    var2.field653 = 12;
                                                    var2.field636 = class80.field1485[var19];
                                                    var2.field656 = 12 - var2.field636;
                                                } else {
                                                    var2.field653 = 9;
                                                    var2.field636 = class135.field2351[var19];
                                                    var2.field656 = 9 - var2.field636;
                                                }
                                                if ((var21.field1267 & var20) != 0 && !class164.method1183(var6, var3, var4, var21.field1267)) {
                                                    var21.field1269.method106(0, class218.field3981, class266.field4734, class53.field867, class40.field624, var21.field1271 - class166.field2931, var21.field1272 - class263.field4692, var21.field1270 - class272.field4825, var21.field1276, var5, (class91) null);
                                                }
                                                if ((var21.field1273 & var20) != 0 && !class164.method1183(var6, var3, var4, var21.field1273)) {
                                                    var21.field1274.method106(0, class218.field3981, class266.field4734, class53.field867, class40.field624, var21.field1271 - class166.field2931, var21.field1272 - class263.field4692, var21.field1270 - class272.field4825, var21.field1276, var5, (class91) null);
                                                }
                                            }
                                            if (var22 != null && !class74.method503(var6, var3, var4, var22.field295.method93())) {
                                                if ((var22.field305 & var20) != 0) {
                                                    var22.field295.method106(0, class218.field3981, class266.field4734, class53.field867, class40.field624, var22.field293 + var22.field302 - class166.field2931, var22.field307 - class263.field4692, var22.field304 + var22.field297 - class272.field4825, var22.field303, var5, (class91) null);
                                                } else if (var22.field305 == 256) {
                                                    int var23 = var22.field293 - class166.field2931;
                                                    int var24 = var22.field307 - class263.field4692;
                                                    int var25 = var22.field304 - class272.field4825;
                                                    int var26 = var22.field299;
                                                    int var27;
                                                    if (var26 == 1 || var26 == 2) {
                                                        var27 = -var23;
                                                    } else {
                                                        var27 = var23;
                                                    }
                                                    int var28;
                                                    if (var26 == 2 || var26 == 3) {
                                                        var28 = -var25;
                                                    } else {
                                                        var28 = var25;
                                                    }
                                                    if (var28 < var27) {
                                                        var22.field295.method106(0, class218.field3981, class266.field4734, class53.field867, class40.field624, var22.field302 + var23, var24, var22.field297 + var25, var22.field303, var5, (class91) null);
                                                    } else if (var22.field301 != null) {
                                                        var22.field301.method106(0, class218.field3981, class266.field4734, class53.field867, class40.field624, var23, var24, var25, var22.field303, var5, (class91) null);
                                                    }
                                                }
                                            }
                                            if (var17) {
                                                class30 var29 = var2.field652;
                                                if (var29 != null && (var29.field440 & 0x80000000L) == 0L) {
                                                    var29.field459.method106(0, class218.field3981, class266.field4734, class53.field867, class40.field624, var29.field447 - class166.field2931, var29.field449 - class263.field4692, var29.field442 - class272.field4825, var29.field440, var5, (class91) null);
                                                }
                                                class112 var30 = var2.field646;
                                                if (var30 != null && var30.field1908 == 0) {
                                                    if (var30.field1915 != null) {
                                                        var30.field1915.method106(0, class218.field3981, class266.field4734, class53.field867, class40.field624, var30.field1918 - class166.field2931, var30.field1911 - class263.field4692, var30.field1902 - class272.field4825, var30.field1910, var5, (class91) null);
                                                    }
                                                    if (var30.field1905 != null) {
                                                        var30.field1905.method106(0, class218.field3981, class266.field4734, class53.field867, class40.field624, var30.field1918 - class166.field2931, var30.field1911 - class263.field4692, var30.field1902 - class272.field4825, var30.field1910, var5, (class91) null);
                                                    }
                                                    if (var30.field1912 != null) {
                                                        var30.field1912.method106(0, class218.field3981, class266.field4734, class53.field867, class40.field624, var30.field1918 - class166.field2931, var30.field1911 - class263.field4692, var30.field1902 - class272.field4825, var30.field1910, var5, (class91) null);
                                                    }
                                                }
                                            }
                                            int var31 = var2.field648;
                                            if (var31 != 0) {
                                                if (var3 < class206.field3703 && (var31 & 0x4) != 0) {
                                                    class41 var32 = var7[var3 + 1][var4];
                                                    if (var32 != null && var32.field649) {
                                                        class77.field1434.method1152((byte) -5, var32);
                                                    }
                                                }
                                                if (var4 < class133.field2335 && (var31 & 0x2) != 0) {
                                                    class41 var33 = var7[var3][var4 + 1];
                                                    if (var33 != null && var33.field649) {
                                                        class77.field1434.method1152((byte) -5, var33);
                                                    }
                                                }
                                                if (var3 > class206.field3703 && (var31 & 0x1) != 0) {
                                                    class41 var34 = var7[var3 - 1][var4];
                                                    if (var34 != null && var34.field649) {
                                                        class77.field1434.method1152((byte) -5, var34);
                                                    }
                                                }
                                                if (var4 > class133.field2335 && (var31 & 0x8) != 0) {
                                                    class41 var35 = var7[var3][var4 - 1];
                                                    if (var35 != null && var35.field649) {
                                                        class77.field1434.method1152((byte) -5, var35);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field653 != 0) {
                                            boolean var36 = true;
                                            for (int var37 = 0; var37 < var2.field645; var37++) {
                                                if (class150.field2639 != var2.field637[var37].field4106 && (var2.field634[var37] & var2.field653) == var2.field636) {
                                                    var36 = false;
                                                    break;
                                                }
                                            }
                                            if (var36) {
                                                class70 var38 = var2.field643;
                                                if (!class164.method1183(var6, var3, var4, var38.field1267)) {
                                                    var38.field1269.method106(0, class218.field3981, class266.field4734, class53.field867, class40.field624, var38.field1271 - class166.field2931, var38.field1272 - class263.field4692, var38.field1270 - class272.field4825, var38.field1276, var5, (class91) null);
                                                }
                                                var2.field653 = 0;
                                            }
                                        }
                                        if (!var2.field650) {
                                            break;
                                        }
                                        try {
                                            int var39 = var2.field645;
                                            var2.field650 = false;
                                            int var40 = 0;
                                            label572: for (int var41 = 0; var41 < var39; var41++) {
                                                class229 var42 = var2.field637[var41];
                                                if (class150.field2639 != var42.field4106) {
                                                    for (int var43 = var42.field4095; var43 <= var42.field4100; var43++) {
                                                        for (int var44 = var42.field4099; var44 <= var42.field4110; var44++) {
                                                            class41 var45 = var7[var43][var44];
                                                            if (var45.field635) {
                                                                var2.field650 = true;
                                                                continue label572;
                                                            }
                                                            if (var45.field653 != 0) {
                                                                int var46 = 0;
                                                                if (var43 > var42.field4095) {
                                                                    var46++;
                                                                }
                                                                if (var43 < var42.field4100) {
                                                                    var46 += 4;
                                                                }
                                                                if (var44 > var42.field4099) {
                                                                    var46 += 8;
                                                                }
                                                                if (var44 < var42.field4110) {
                                                                    var46 += 2;
                                                                }
                                                                if ((var46 & var45.field653) == var2.field656) {
                                                                    var2.field650 = true;
                                                                    continue label572;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class264.field4701[var40++] = var42;
                                                    int var47 = class206.field3703 - var42.field4095;
                                                    int var48 = var42.field4100 - class206.field3703;
                                                    if (var48 > var47) {
                                                        var47 = var48;
                                                    }
                                                    int var49 = class133.field2335 - var42.field4099;
                                                    int var50 = var42.field4110 - class133.field2335;
                                                    if (var50 > var49) {
                                                        var42.field4103 = var47 + var50;
                                                    } else {
                                                        var42.field4103 = var47 + var49;
                                                    }
                                                }
                                            }
                                            while (var40 > 0) {
                                                int var51 = -50;
                                                int var52 = -1;
                                                for (int var53 = 0; var53 < var40; var53++) {
                                                    class229 var54 = class264.field4701[var53];
                                                    if (class150.field2639 != var54.field4106) {
                                                        if (var54.field4103 > var51) {
                                                            var51 = var54.field4103;
                                                            var52 = var53;
                                                        } else if (var54.field4103 == var51) {
                                                            int var55 = var54.field4109 - class166.field2931;
                                                            int var56 = var54.field4102 - class272.field4825;
                                                            int var57 = class264.field4701[var52].field4109 - class166.field2931;
                                                            int var58 = class264.field4701[var52].field4102 - class272.field4825;
                                                            if (var55 * var55 + var56 * var56 > var57 * var57 + var58 * var58) {
                                                                var52 = var53;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var52 == -1) {
                                                    break;
                                                }
                                                class229 var59 = class264.field4701[var52];
                                                var59.field4106 = class150.field2639;
                                                if (!class104.method758(var6, var59.field4095, var59.field4100, var59.field4099, var59.field4110, var59.field4104.method93())) {
                                                    var59.field4104.method106(var59.field4096, class218.field3981, class266.field4734, class53.field867, class40.field624, var59.field4109 - class166.field2931, var59.field4107 - class263.field4692, var59.field4102 - class272.field4825, var59.field4094, var5, (class91) null);
                                                }
                                                for (int var60 = var59.field4095; var60 <= var59.field4100; var60++) {
                                                    for (int var61 = var59.field4099; var61 <= var59.field4110; var61++) {
                                                        class41 var62 = var7[var60][var61];
                                                        if (var62.field653 != 0) {
                                                            class77.field1434.method1152((byte) -5, var62);
                                                        } else if ((var3 != var60 || var4 != var61) && var62.field649) {
                                                            class77.field1434.method1152((byte) -5, var62);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field650) {
                                                break;
                                            }
                                        } catch (Exception var81) {
                                            var2.field650 = false;
                                            break;
                                        }
                                    }
                                } while (!var2.field649);
                            } while (var2.field653 != 0);
                            if (var3 > class206.field3703 || var3 <= class246.field4427) {
                                break;
                            }
                            var63 = var7[var3 - 1][var4];
                        } while (var63 != null && var63.field649);
                        if (var3 < class206.field3703 || var3 >= class273.field4862 - 1) {
                            break;
                        }
                        var64 = var7[var3 + 1][var4];
                    } while (var64 != null && var64.field649);
                    if (var4 > class133.field2335 || var4 <= class37.field560) {
                        break;
                    }
                    var65 = var7[var3][var4 - 1];
                } while (var65 != null && var65.field649);
                if (var4 < class133.field2335 || var4 >= class5.field65 - 1) {
                    break;
                }
                var66 = var7[var3][var4 + 1];
            } while (var66 != null && var66.field649);
            var2.field649 = false;
            class137.field2396--;
            class112 var67 = var2.field646;
            if (var67 != null && var67.field1908 != 0) {
                if (var67.field1915 != null) {
                    var67.field1915.method106(0, class218.field3981, class266.field4734, class53.field867, class40.field624, var67.field1918 - class166.field2931, var67.field1911 - class263.field4692 - var67.field1908, var67.field1902 - class272.field4825, var67.field1910, var5, (class91) null);
                }
                if (var67.field1905 != null) {
                    var67.field1905.method106(0, class218.field3981, class266.field4734, class53.field867, class40.field624, var67.field1918 - class166.field2931, var67.field1911 - class263.field4692 - var67.field1908, var67.field1902 - class272.field4825, var67.field1910, var5, (class91) null);
                }
                if (var67.field1912 != null) {
                    var67.field1912.method106(0, class218.field3981, class266.field4734, class53.field867, class40.field624, var67.field1918 - class166.field2931, var67.field1911 - class263.field4692 - var67.field1908, var67.field1902 - class272.field4825, var67.field1910, var5, (class91) null);
                }
            }
            if (var2.field644 != 0) {
                class24 var68 = var2.field641;
                if (var68 != null && !class74.method503(var6, var3, var4, var68.field295.method93())) {
                    if ((var68.field305 & var2.field644) != 0) {
                        var68.field295.method106(0, class218.field3981, class266.field4734, class53.field867, class40.field624, var68.field293 + var68.field302 - class166.field2931, var68.field307 - class263.field4692, var68.field304 + var68.field297 - class272.field4825, var68.field303, var5, (class91) null);
                    } else if (var68.field305 == 256) {
                        int var69 = var68.field293 - class166.field2931;
                        int var70 = var68.field307 - class263.field4692;
                        int var71 = var68.field304 - class272.field4825;
                        int var72 = var68.field299;
                        int var73;
                        if (var72 == 1 || var72 == 2) {
                            var73 = -var69;
                        } else {
                            var73 = var69;
                        }
                        int var74;
                        if (var72 == 2 || var72 == 3) {
                            var74 = -var71;
                        } else {
                            var74 = var71;
                        }
                        if (var74 >= var73) {
                            var68.field295.method106(0, class218.field3981, class266.field4734, class53.field867, class40.field624, var68.field302 + var69, var70, var68.field297 + var71, var68.field303, var5, (class91) null);
                        } else if (var68.field301 != null) {
                            var68.field301.method106(0, class218.field3981, class266.field4734, class53.field867, class40.field624, var69, var70, var71, var68.field303, var5, (class91) null);
                        }
                    }
                }
                class70 var75 = var2.field643;
                if (var75 != null) {
                    if ((var75.field1273 & var2.field644) != 0 && !class164.method1183(var6, var3, var4, var75.field1273)) {
                        var75.field1274.method106(0, class218.field3981, class266.field4734, class53.field867, class40.field624, var75.field1271 - class166.field2931, var75.field1272 - class263.field4692, var75.field1270 - class272.field4825, var75.field1276, var5, (class91) null);
                    }
                    if ((var75.field1267 & var2.field644) != 0 && !class164.method1183(var6, var3, var4, var75.field1267)) {
                        var75.field1269.method106(0, class218.field3981, class266.field4734, class53.field867, class40.field624, var75.field1271 - class166.field2931, var75.field1272 - class263.field4692, var75.field1270 - class272.field4825, var75.field1276, var5, (class91) null);
                    }
                }
            }
            if (var5 < class170.field3002 - 1) {
                class41 var76 = class232.field4138[var5 + 1][var3][var4];
                if (var76 != null && var76.field649) {
                    class77.field1434.method1152((byte) -5, var76);
                }
            }
            if (var3 < class206.field3703) {
                class41 var77 = var7[var3 + 1][var4];
                if (var77 != null && var77.field649) {
                    class77.field1434.method1152((byte) -5, var77);
                }
            }
            if (var4 < class133.field2335) {
                class41 var78 = var7[var3][var4 + 1];
                if (var78 != null && var78.field649) {
                    class77.field1434.method1152((byte) -5, var78);
                }
            }
            if (var3 > class206.field3703) {
                class41 var79 = var7[var3 - 1][var4];
                if (var79 != null && var79.field649) {
                    class77.field1434.method1152((byte) -5, var79);
                }
            }
            if (var4 > class133.field2335) {
                class41 var80 = var7[var3][var4 - 1];
                if (var80 != null && var80.field649) {
                    class77.field1434.method1152((byte) -5, var80);
                }
            }
        }
    }

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "(B)V")
    public static final void method995(byte arg0) {
        field2375++;
        int var1 = -22 / ((arg0 + 52) / 52);
        int var2 = class166.field2927.field3868 + client.field2736;
        int var3 = class38.field595 + class166.field2927.field3784;
        if ((class47.field755 - var2) < -500 || (class47.field755 - var2) > 500 || class78.field1456 - var3 < -500 || class78.field1456 - var3 > 500) {
            class47.field755 = var2;
            class78.field1456 = var3;
        }
        if (class78.field1456 != var3) {
            class78.field1456 += (var3 - class78.field1456) / 16;
        }
        if (class47.field755 != var2) {
            class47.field755 += (var2 - class47.field755) / 16;
        }
        if (class223.field4026) {
            for (int var4 = 0; var4 < class243.field4386; var4++) {
                int var5 = class257.field4629[var4];
                if (var5 == 98) {
                    class211.field3875 = class211.field3875 + 47 & 0xFFFFFFF0;
                } else if (var5 == 99) {
                    class211.field3875 = class211.field3875 - 17 & 0xFFFFFFF0;
                } else if (var5 == 96) {
                    class50.field825 = class50.field825 - 65 & 0xFFFFFF80;
                } else if (var5 == 97) {
                    class50.field825 = class50.field825 + 191 & 0xFFFFFF80;
                }
            }
        } else {
            if (class176.field3048[96]) {
                class267.field4746 += (-class267.field4746 - 24) / 2;
            } else if (class176.field3048[97]) {
                class267.field4746 += (24 - class267.field4746) / 2;
            } else {
                class267.field4746 /= 2;
            }
            class50.field825 += class267.field4746 / 2;
            if (class176.field3048[98]) {
                class236.field4213 += (12 - class236.field4213) / 2;
            } else if (class176.field3048[99]) {
                class236.field4213 += (-class236.field4213 - 12) / 2;
            } else {
                class236.field4213 /= 2;
            }
            class211.field3875 += class236.field4213 / 2;
        }
        class19.method89((byte) 110);
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lcf;B)V")
    public static final void method996(class93 arg0, byte arg1) {
        field2379++;
        class123.field2197 = arg0;
        if (class169.field2967.field5113 == null || arg1 > -46) {
            return;
        }
        try {
            class93 var2 = class187.field3443.method656(class169.field2967.field5113, 0);
            class93 var3 = class82.field1516.method656(class169.field2967.field5113, 0);
            class93 var4 = class130.method949((byte) -77, new class93[] { var2, class166.field2924, arg0, class267.field4755, var3 });
            class93 var5;
            if (arg0.method666(false) == 0) {
                var5 = class130.method949((byte) -77, new class93[] { var4, class44.field700 });
            } else {
                var5 = class130.method949((byte) -77, new class93[] { var4, class54.field891, class245.method1663((byte) 55, class28.method155((byte) 121) + 94608000000L), class41.field627, class245.method1668((byte) -103, 94608000L) });
            }
            class130.method949((byte) -77, new class93[] { class169.field2972, var5, class104.field1810 }).method644(class169.field2967.field5113, 0);
        } catch (Throwable var6) {
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(III)Lha;")
    public static final class30 method997(int arg0, int arg1, int arg2) {
        class41 var3 = class232.field4138[arg0][arg1][arg2];
        return var3 == null || var3.field652 == null ? null : var3.field652;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(ILee;II)V")
    private final void method998(int arg0, class280 arg1, int arg2, int arg3) {
        if (arg2 != -10933) {
            this.field2380 = 22;
        }
        field2376++;
        if (arg0 == 1) {
            this.field2382 = arg1.method1893((byte) 74);
            this.method989(this.field2382, arg2 ^ 0xFFFFEE6C);
        } else if (arg0 == 2) {
            this.field2385 = arg1.method1891(-121);
            if (this.field2385 == 65535) {
                this.field2385 = -1;
                return;
            }
            return;
        } else if (arg0 == 3) {
            arg1.method1891(arg2 + 10816);
            return;
        }
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(III)Lgh;")
    public static final class24 method999(int arg0, int arg1, int arg2) {
        class41 var3 = class232.field4138[arg0][arg1][arg2];
        return var3 == null ? null : var3.field641;
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2384[var1] = var0 - 1;
            var0 += var0;
        }
    }
}
