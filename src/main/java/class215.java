import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class215 extends class236 {

    @OriginalMember(owner = "client!id", name = "z", descriptor = "[I")
    private int[] field3930;

    @OriginalMember(owner = "client!id", name = "D", descriptor = "[B")
    public byte[] field3934;

    @OriginalMember(owner = "client!id", name = "C", descriptor = "[S")
    public short[] field3933;

    @OriginalMember(owner = "client!id", name = "w", descriptor = "[B")
    public byte[] field3927;

    @OriginalMember(owner = "client!id", name = "y", descriptor = "[Lqf;")
    public class122[] field3929;

    @OriginalMember(owner = "client!id", name = "E", descriptor = "[B")
    public byte[] field3935;

    @OriginalMember(owner = "client!id", name = "v", descriptor = "[Lbd;")
    public class258[] field3926;

    @OriginalMember(owner = "client!id", name = "J", descriptor = "I")
    public int field3940;

    @OriginalMember(owner = "client!id", name = "F", descriptor = "I")
    public static int field3936 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!id", name = "B", descriptor = "Lsg;")
    public static class30 field3932 = class167.method1221((byte) 33, "ul");

    @OriginalMember(owner = "client!id", name = "s", descriptor = "I")
    public static int field3923;

    @OriginalMember(owner = "client!id", name = "t", descriptor = "I")
    public static int field3924;

    @OriginalMember(owner = "client!id", name = "u", descriptor = "I")
    public static int field3925;

    @OriginalMember(owner = "client!id", name = "x", descriptor = "I")
    public static int field3928;

    @OriginalMember(owner = "client!id", name = "A", descriptor = "I")
    public static int field3931;

    @OriginalMember(owner = "client!id", name = "G", descriptor = "I")
    public static int field3937;

    @OriginalMember(owner = "client!id", name = "I", descriptor = "Lmc;")
    public static class151 field3939;

    @OriginalMember(owner = "client!id", name = "H", descriptor = "[I")
    public static int[] field3938;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ZI)I")
    public static final int method1571(boolean arg0, int arg1) {
        if (!arg0) {
            method1577((class195) null, true);
        }
        field3937++;
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(B)V")
    public static final void method1572(byte arg0) {
        field3928++;
        if (arg0 == 126 && class74.field1659 != null) {
            class266 var1 = class74.field1659;
            synchronized (class74.field1659) {
                class74.field1659 = null;
            }
        }
    }

    @OriginalMember(owner = "client!id", name = "d", descriptor = "(I)V")
    public static void method1573(int arg0) {
        if (arg0 == 0) {
            field3939 = null;
            field3938 = null;
            field3932 = null;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "([BLda;[IB)Z")
    public final boolean method1574(byte[] arg0, class98 arg1, int[] arg2, byte arg3) {
        field3923++;
        int var5 = 0;
        class258 var6 = null;
        if (arg3 > -81) {
            this.field3926 = null;
        }
        boolean var7 = true;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg0 == null || arg0[var8] != 0) {
                int var9 = this.field3930[var8];
                if (var9 != 0) {
                    if (var5 != var9) {
                        var5 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var6 = arg1.method799(-91, arg2, var9 >> 2);
                        } else {
                            var6 = arg1.method802(var9 >> 2, arg2, -88);
                        }
                        if (var6 == null) {
                            var7 = false;
                        }
                    }
                    if (var6 != null) {
                        this.field3926[var8] = var6;
                        this.field3930[var8] = 0;
                    }
                }
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!id", name = "e", descriptor = "(I)V")
    public final void method1575(int arg0) {
        field3924++;
        if (arg0 < 108) {
            this.method1575(61);
        }
        this.field3930 = null;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(BLaa;)V")
    public static final void method1576(byte arg0, class8 arg1) {
        field3925++;
        int var2 = arg1.method45(false);
        class102.field2076 = new class211[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            class102.field2076[var3] = new class211();
            class102.field2076[var3].field3811 = arg1.method45(false);
            class102.field2076[var3].field3813 = arg1.method58(30634);
        }
        class212.field3839 = arg1.method45(false);
        class197.field3558 = arg1.method45(false);
        class114.field2257 = arg1.method45(false);
        class236.field4223 = new class205[class197.field3558 + 1 - class212.field3839];
        for (int var4 = 0; var4 < class114.field2257; var4++) {
            int var6 = arg1.method45(false);
            class205 var7 = class236.field4223[var6] = new class205();
            var7.field2181 = arg1.method63((byte) 115);
            var7.field2188 = arg1.method70(65280);
            var7.field3673 = class212.field3839 + var6;
            var7.field3665 = arg1.method58(30634);
            var7.field3669 = arg1.method58(30634);
        }
        int var5 = 72 % ((arg0 - 25) / 44);
        class40.field953 = arg1.method70(65280);
        class247.field4402 = true;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Lne;Z)V")
    public static final void method1577(class195 arg0, boolean arg1) {
        class163.field3029.method477(arg0, (byte) 6);
        while (true) {
            class195 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class195[][] var7;
            class195 var66;
            do {
                class195 var65;
                do {
                    class195 var64;
                    do {
                        class195 var63;
                        do {
                            do {
                                do {
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class195) class163.field3029.method481(-117);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field3542);
                                            var3 = var2.field3530;
                                            var4 = var2.field3525;
                                            var5 = var2.field3539;
                                            var6 = var2.field3527;
                                            var7 = class71.field1613[var5];
                                            if (!var2.field3538) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class195 var8 = class71.field1613[var5 - 1][var3][var4];
                                                    if (var8 != null && var8.field3542) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= class57.field1258 && var3 > class4.field58) {
                                                    class195 var9 = var7[var3 - 1][var4];
                                                    if (var9 != null && var9.field3542 && (var9.field3538 || (var2.field3528 & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= class57.field1258 && var3 < class150.field2850 - 1) {
                                                    class195 var10 = var7[var3 + 1][var4];
                                                    if (var10 != null && var10.field3542 && (var10.field3538 || (var2.field3528 & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= class15.field320 && var4 > class91.field1841) {
                                                    class195 var11 = var7[var3][var4 - 1];
                                                    if (var11 != null && var11.field3542 && (var11.field3538 || (var2.field3528 & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= class15.field320 && var4 < class88.field1804 - 1) {
                                                    class195 var12 = var7[var3][var4 + 1];
                                                    if (var12 != null && var12.field3542 && (var12.field3538 || (var2.field3528 & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field3538 = false;
                                            if (var2.field3524 != null) {
                                                class195 var13 = var2.field3524;
                                                if (var13.field3535 == null) {
                                                    if (var13.field3521 != null) {
                                                        if (class87.method731(0, var3, var4)) {
                                                            class170.method1256(var13.field3521, class149.field2837, class14.field273, class53.field1186, class273.field4795, var3, var4, true);
                                                        } else {
                                                            class170.method1256(var13.field3521, class149.field2837, class14.field273, class53.field1186, class273.field4795, var3, var4, false);
                                                        }
                                                    }
                                                } else if (class87.method731(0, var3, var4)) {
                                                    class6.method34(var13.field3535, 0, class149.field2837, class14.field273, class53.field1186, class273.field4795, var3, var4, true);
                                                } else {
                                                    class6.method34(var13.field3535, 0, class149.field2837, class14.field273, class53.field1186, class273.field4795, var3, var4, false);
                                                }
                                                class225 var14 = var13.field3532;
                                                if (var14 != null) {
                                                    var14.field4031.method21(0, class149.field2837, class14.field273, class53.field1186, class273.field4795, var14.field4025 - class254.field4478, var14.field4032 - class21.field382, var14.field4038 - class108.field2177, var14.field4039);
                                                }
                                                for (int var15 = 0; var15 < var13.field3522; var15++) {
                                                    class35 var16 = var13.field3540[var15];
                                                    if (var16 != null) {
                                                        var16.field857.method21(var16.field845, class149.field2837, class14.field273, class53.field1186, class273.field4795, var16.field847 - class254.field4478, var16.field852 - class21.field382, var16.field846 - class108.field2177, var16.field863);
                                                    }
                                                }
                                            }
                                            boolean var17 = false;
                                            if (var2.field3535 == null) {
                                                if (var2.field3521 != null) {
                                                    if (class87.method731(var6, var3, var4)) {
                                                        class170.method1256(var2.field3521, class149.field2837, class14.field273, class53.field1186, class273.field4795, var3, var4, true);
                                                    } else {
                                                        var17 = true;
                                                        class170.method1256(var2.field3521, class149.field2837, class14.field273, class53.field1186, class273.field4795, var3, var4, false);
                                                    }
                                                }
                                            } else if (class87.method731(var6, var3, var4)) {
                                                class6.method34(var2.field3535, var6, class149.field2837, class14.field273, class53.field1186, class273.field4795, var3, var4, true);
                                            } else {
                                                var17 = true;
                                                if (var2.field3535.field4112 != 12345678 || class45.field1059 && var5 <= class92.field1857) {
                                                    class6.method34(var2.field3535, var6, class149.field2837, class14.field273, class53.field1186, class273.field4795, var3, var4, false);
                                                }
                                            }
                                            if (var17) {
                                                class104 var18 = var2.field3541;
                                                if (var18 != null && (var18.field2087 & 0x80000000L) != 0L) {
                                                    var18.field2089.method21(0, class149.field2837, class14.field273, class53.field1186, class273.field4795, var18.field2104 - class254.field4478, var18.field2101 - class21.field382, var18.field2093 - class108.field2177, var18.field2087);
                                                }
                                            }
                                            int var19 = 0;
                                            int var20 = 0;
                                            class225 var21 = var2.field3532;
                                            class146 var22 = var2.field3537;
                                            if (var21 != null || var22 != null) {
                                                if (class57.field1258 == var3) {
                                                    var19++;
                                                } else if (class57.field1258 < var3) {
                                                    var19 += 2;
                                                }
                                                if (class15.field320 == var4) {
                                                    var19 += 3;
                                                } else if (class15.field320 > var4) {
                                                    var19 += 6;
                                                }
                                                var20 = class45.field1058[var19];
                                                var2.field3536 = class164.field3045[var19];
                                            }
                                            if (var21 != null) {
                                                if ((var21.field4023 & class212.field3817[var19]) == 0) {
                                                    var2.field3533 = 0;
                                                } else if (var21.field4023 == 16) {
                                                    var2.field3533 = 3;
                                                    var2.field3534 = class113.field2241[var19];
                                                    var2.field3523 = 3 - var2.field3534;
                                                } else if (var21.field4023 == 32) {
                                                    var2.field3533 = 6;
                                                    var2.field3534 = class117.field2308[var19];
                                                    var2.field3523 = 6 - var2.field3534;
                                                } else if (var21.field4023 == 64) {
                                                    var2.field3533 = 12;
                                                    var2.field3534 = class59.field1278[var19];
                                                    var2.field3523 = 12 - var2.field3534;
                                                } else {
                                                    var2.field3533 = 9;
                                                    var2.field3534 = class53.field1181[var19];
                                                    var2.field3523 = 9 - var2.field3534;
                                                }
                                                if ((var21.field4023 & var20) != 0 && !class130.method992(var6, var3, var4, var21.field4023)) {
                                                    var21.field4031.method21(0, class149.field2837, class14.field273, class53.field1186, class273.field4795, var21.field4025 - class254.field4478, var21.field4032 - class21.field382, var21.field4038 - class108.field2177, var21.field4039);
                                                }
                                                if ((var21.field4030 & var20) != 0 && !class130.method992(var6, var3, var4, var21.field4030)) {
                                                    var21.field4029.method21(0, class149.field2837, class14.field273, class53.field1186, class273.field4795, var21.field4025 - class254.field4478, var21.field4032 - class21.field382, var21.field4038 - class108.field2177, var21.field4039);
                                                }
                                            }
                                            if (var22 != null && !class250.method1750(var6, var3, var4, var22.field2800.method22())) {
                                                if ((var22.field2790 & var20) != 0) {
                                                    var22.field2800.method21(0, class149.field2837, class14.field273, class53.field1186, class273.field4795, var22.field2796 + var22.field2801 - class254.field4478, var22.field2793 - class21.field382, var22.field2797 + var22.field2789 - class108.field2177, var22.field2803);
                                                } else if (var22.field2790 == 256) {
                                                    int var23 = var22.field2796 - class254.field4478;
                                                    int var24 = var22.field2793 - class21.field382;
                                                    int var25 = var22.field2797 - class108.field2177;
                                                    int var26 = var22.field2792;
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
                                                        var22.field2800.method21(0, class149.field2837, class14.field273, class53.field1186, class273.field4795, var22.field2801 + var23, var24, var22.field2789 + var25, var22.field2803);
                                                    } else if (var22.field2798 != null) {
                                                        var22.field2798.method21(0, class149.field2837, class14.field273, class53.field1186, class273.field4795, var23, var24, var25, var22.field2803);
                                                    }
                                                }
                                            }
                                            if (var17) {
                                                class104 var29 = var2.field3541;
                                                if (var29 != null && (var29.field2087 & 0x80000000L) == 0L) {
                                                    var29.field2089.method21(0, class149.field2837, class14.field273, class53.field1186, class273.field4795, var29.field2104 - class254.field4478, var29.field2101 - class21.field382, var29.field2093 - class108.field2177, var29.field2087);
                                                }
                                                class177 var30 = var2.field3520;
                                                if (var30 != null && var30.field3284 == 0) {
                                                    if (var30.field3286 != null) {
                                                        var30.field3286.method21(0, class149.field2837, class14.field273, class53.field1186, class273.field4795, var30.field3282 - class254.field4478, var30.field3278 - class21.field382, var30.field3279 - class108.field2177, var30.field3285);
                                                    }
                                                    if (var30.field3290 != null) {
                                                        var30.field3290.method21(0, class149.field2837, class14.field273, class53.field1186, class273.field4795, var30.field3282 - class254.field4478, var30.field3278 - class21.field382, var30.field3279 - class108.field2177, var30.field3285);
                                                    }
                                                    if (var30.field3281 != null) {
                                                        var30.field3281.method21(0, class149.field2837, class14.field273, class53.field1186, class273.field4795, var30.field3282 - class254.field4478, var30.field3278 - class21.field382, var30.field3279 - class108.field2177, var30.field3285);
                                                    }
                                                }
                                            }
                                            int var31 = var2.field3528;
                                            if (var31 != 0) {
                                                if (var3 < class57.field1258 && (var31 & 0x4) != 0) {
                                                    class195 var32 = var7[var3 + 1][var4];
                                                    if (var32 != null && var32.field3542) {
                                                        class163.field3029.method477(var32, (byte) 6);
                                                    }
                                                }
                                                if (var4 < class15.field320 && (var31 & 0x2) != 0) {
                                                    class195 var33 = var7[var3][var4 + 1];
                                                    if (var33 != null && var33.field3542) {
                                                        class163.field3029.method477(var33, (byte) 6);
                                                    }
                                                }
                                                if (var3 > class57.field1258 && (var31 & 0x1) != 0) {
                                                    class195 var34 = var7[var3 - 1][var4];
                                                    if (var34 != null && var34.field3542) {
                                                        class163.field3029.method477(var34, (byte) 6);
                                                    }
                                                }
                                                if (var4 > class15.field320 && (var31 & 0x8) != 0) {
                                                    class195 var35 = var7[var3][var4 - 1];
                                                    if (var35 != null && var35.field3542) {
                                                        class163.field3029.method477(var35, (byte) 6);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field3533 != 0) {
                                            boolean var36 = true;
                                            for (int var37 = 0; var37 < var2.field3522; var37++) {
                                                if (class250.field4425 != var2.field3540[var37].field855 && (var2.field3529[var37] & var2.field3533) == var2.field3534) {
                                                    var36 = false;
                                                    break;
                                                }
                                            }
                                            if (var36) {
                                                class225 var38 = var2.field3532;
                                                if (!class130.method992(var6, var3, var4, var38.field4023)) {
                                                    var38.field4031.method21(0, class149.field2837, class14.field273, class53.field1186, class273.field4795, var38.field4025 - class254.field4478, var38.field4032 - class21.field382, var38.field4038 - class108.field2177, var38.field4039);
                                                }
                                                var2.field3533 = 0;
                                            }
                                        }
                                        if (!var2.field3526) {
                                            break;
                                        }
                                        try {
                                            int var39 = var2.field3522;
                                            var2.field3526 = false;
                                            int var40 = 0;
                                            label572: for (int var41 = 0; var41 < var39; var41++) {
                                                class35 var42 = var2.field3540[var41];
                                                if (class250.field4425 != var42.field855) {
                                                    for (int var43 = var42.field854; var43 <= var42.field844; var43++) {
                                                        for (int var44 = var42.field856; var44 <= var42.field853; var44++) {
                                                            class195 var45 = var7[var43][var44];
                                                            if (var45.field3538) {
                                                                var2.field3526 = true;
                                                                continue label572;
                                                            }
                                                            if (var45.field3533 != 0) {
                                                                int var46 = 0;
                                                                if (var43 > var42.field854) {
                                                                    var46++;
                                                                }
                                                                if (var43 < var42.field844) {
                                                                    var46 += 4;
                                                                }
                                                                if (var44 > var42.field856) {
                                                                    var46 += 8;
                                                                }
                                                                if (var44 < var42.field853) {
                                                                    var46 += 2;
                                                                }
                                                                if ((var46 & var45.field3533) == var2.field3523) {
                                                                    var2.field3526 = true;
                                                                    continue label572;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class36.field869[var40++] = var42;
                                                    int var47 = class57.field1258 - var42.field854;
                                                    int var48 = var42.field844 - class57.field1258;
                                                    if (var48 > var47) {
                                                        var47 = var48;
                                                    }
                                                    int var49 = class15.field320 - var42.field856;
                                                    int var50 = var42.field853 - class15.field320;
                                                    if (var50 > var49) {
                                                        var42.field851 = var47 + var50;
                                                    } else {
                                                        var42.field851 = var47 + var49;
                                                    }
                                                }
                                            }
                                            while (var40 > 0) {
                                                int var51 = -50;
                                                int var52 = -1;
                                                for (int var53 = 0; var53 < var40; var53++) {
                                                    class35 var54 = class36.field869[var53];
                                                    if (class250.field4425 != var54.field855) {
                                                        if (var54.field851 > var51) {
                                                            var51 = var54.field851;
                                                            var52 = var53;
                                                        } else if (var54.field851 == var51) {
                                                            int var55 = var54.field847 - class254.field4478;
                                                            int var56 = var54.field846 - class108.field2177;
                                                            int var57 = class36.field869[var52].field847 - class254.field4478;
                                                            int var58 = class36.field869[var52].field846 - class108.field2177;
                                                            if (var55 * var55 + var56 * var56 > var57 * var57 + var58 * var58) {
                                                                var52 = var53;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var52 == -1) {
                                                    break;
                                                }
                                                class35 var59 = class36.field869[var52];
                                                var59.field855 = class250.field4425;
                                                if (!class242.method1714(var6, var59.field854, var59.field844, var59.field856, var59.field853, var59.field857.method22())) {
                                                    var59.field857.method21(var59.field845, class149.field2837, class14.field273, class53.field1186, class273.field4795, var59.field847 - class254.field4478, var59.field852 - class21.field382, var59.field846 - class108.field2177, var59.field863);
                                                }
                                                for (int var60 = var59.field854; var60 <= var59.field844; var60++) {
                                                    for (int var61 = var59.field856; var61 <= var59.field853; var61++) {
                                                        class195 var62 = var7[var60][var61];
                                                        if (var62.field3533 != 0) {
                                                            class163.field3029.method477(var62, (byte) 6);
                                                        } else if ((var3 != var60 || var4 != var61) && var62.field3542) {
                                                            class163.field3029.method477(var62, (byte) 6);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field3526) {
                                                break;
                                            }
                                        } catch (Exception var81) {
                                            var2.field3526 = false;
                                            break;
                                        }
                                    }
                                } while (!var2.field3542);
                            } while (var2.field3533 != 0);
                            if (var3 > class57.field1258 || var3 <= class4.field58) {
                                break;
                            }
                            var63 = var7[var3 - 1][var4];
                        } while (var63 != null && var63.field3542);
                        if (var3 < class57.field1258 || var3 >= class150.field2850 - 1) {
                            break;
                        }
                        var64 = var7[var3 + 1][var4];
                    } while (var64 != null && var64.field3542);
                    if (var4 > class15.field320 || var4 <= class91.field1841) {
                        break;
                    }
                    var65 = var7[var3][var4 - 1];
                } while (var65 != null && var65.field3542);
                if (var4 < class15.field320 || var4 >= class88.field1804 - 1) {
                    break;
                }
                var66 = var7[var3][var4 + 1];
            } while (var66 != null && var66.field3542);
            var2.field3542 = false;
            class123.field2415--;
            class177 var67 = var2.field3520;
            if (var67 != null && var67.field3284 != 0) {
                if (var67.field3286 != null) {
                    var67.field3286.method21(0, class149.field2837, class14.field273, class53.field1186, class273.field4795, var67.field3282 - class254.field4478, var67.field3278 - class21.field382 - var67.field3284, var67.field3279 - class108.field2177, var67.field3285);
                }
                if (var67.field3290 != null) {
                    var67.field3290.method21(0, class149.field2837, class14.field273, class53.field1186, class273.field4795, var67.field3282 - class254.field4478, var67.field3278 - class21.field382 - var67.field3284, var67.field3279 - class108.field2177, var67.field3285);
                }
                if (var67.field3281 != null) {
                    var67.field3281.method21(0, class149.field2837, class14.field273, class53.field1186, class273.field4795, var67.field3282 - class254.field4478, var67.field3278 - class21.field382 - var67.field3284, var67.field3279 - class108.field2177, var67.field3285);
                }
            }
            if (var2.field3536 != 0) {
                class146 var68 = var2.field3537;
                if (var68 != null && !class250.method1750(var6, var3, var4, var68.field2800.method22())) {
                    if ((var68.field2790 & var2.field3536) != 0) {
                        var68.field2800.method21(0, class149.field2837, class14.field273, class53.field1186, class273.field4795, var68.field2796 + var68.field2801 - class254.field4478, var68.field2793 - class21.field382, var68.field2797 + var68.field2789 - class108.field2177, var68.field2803);
                    } else if (var68.field2790 == 256) {
                        int var69 = var68.field2796 - class254.field4478;
                        int var70 = var68.field2793 - class21.field382;
                        int var71 = var68.field2797 - class108.field2177;
                        int var72 = var68.field2792;
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
                            var68.field2800.method21(0, class149.field2837, class14.field273, class53.field1186, class273.field4795, var68.field2801 + var69, var70, var68.field2789 + var71, var68.field2803);
                        } else if (var68.field2798 != null) {
                            var68.field2798.method21(0, class149.field2837, class14.field273, class53.field1186, class273.field4795, var69, var70, var71, var68.field2803);
                        }
                    }
                }
                class225 var75 = var2.field3532;
                if (var75 != null) {
                    if ((var75.field4030 & var2.field3536) != 0 && !class130.method992(var6, var3, var4, var75.field4030)) {
                        var75.field4029.method21(0, class149.field2837, class14.field273, class53.field1186, class273.field4795, var75.field4025 - class254.field4478, var75.field4032 - class21.field382, var75.field4038 - class108.field2177, var75.field4039);
                    }
                    if ((var75.field4023 & var2.field3536) != 0 && !class130.method992(var6, var3, var4, var75.field4023)) {
                        var75.field4031.method21(0, class149.field2837, class14.field273, class53.field1186, class273.field4795, var75.field4025 - class254.field4478, var75.field4032 - class21.field382, var75.field4038 - class108.field2177, var75.field4039);
                    }
                }
            }
            if (var5 < class182.field3347 - 1) {
                class195 var76 = class71.field1613[var5 + 1][var3][var4];
                if (var76 != null && var76.field3542) {
                    class163.field3029.method477(var76, (byte) 6);
                }
            }
            if (var3 < class57.field1258) {
                class195 var77 = var7[var3 + 1][var4];
                if (var77 != null && var77.field3542) {
                    class163.field3029.method477(var77, (byte) 6);
                }
            }
            if (var4 < class15.field320) {
                class195 var78 = var7[var3][var4 + 1];
                if (var78 != null && var78.field3542) {
                    class163.field3029.method477(var78, (byte) 6);
                }
            }
            if (var3 > class57.field1258) {
                class195 var79 = var7[var3 - 1][var4];
                if (var79 != null && var79.field3542) {
                    class163.field3029.method477(var79, (byte) 6);
                }
            }
            if (var4 > class15.field320) {
                class195 var80 = var7[var3][var4 - 1];
                if (var80 != null && var80.field3542) {
                    class163.field3029.method477(var80, (byte) 6);
                }
            }
        }
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "()V")
    public class215() {
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "([B)V")
    public class215(byte[] arg0) {
        this.field3930 = new int[128];
        this.field3934 = new byte[128];
        this.field3933 = new short[128];
        this.field3927 = new byte[128];
        this.field3929 = new class122[128];
        this.field3935 = new byte[128];
        this.field3926 = new class258[128];
        class8 var2 = new class8(arg0);
        int var3;
        for (var3 = 0; var2.field124[var2.field146 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method98(1);
        }
        var3++;
        int var6 = 0;
        var2.field146++;
        int var7 = var2.field146;
        var2.field146 += var3;
        while (var2.field124[var2.field146 + var6] != 0) {
            var6++;
        }
        byte[] var8 = new byte[var6];
        for (int var9 = 0; var9 < var6; var9++) {
            var8[var9] = var2.method98(1);
        }
        var6++;
        var2.field146++;
        int var10 = 0;
        int var11 = var2.field146;
        var2.field146 += var6;
        while (var2.field124[var2.field146 + var10] != 0) {
            var10++;
        }
        byte[] var12 = new byte[var10];
        for (int var13 = 0; var13 < var10; var13++) {
            var12[var13] = var2.method98(1);
        }
        var10++;
        var2.field146++;
        byte[] var14 = new byte[var10];
        int var15;
        if (var10 <= 1) {
            var15 = var10;
        } else {
            var14[1] = 1;
            var15 = 2;
            int var16 = 1;
            for (int var17 = 2; var17 < var10; var17++) {
                int var105 = var2.method63((byte) 113);
                if (var105 == 0) {
                    var16 = var15++;
                } else {
                    if (var16 >= var105) {
                        var105--;
                    }
                    var16 = var105;
                }
                var14[var17] = (byte) var16;
            }
        }
        class122[] var18 = new class122[var15];
        for (int var19 = 0; var19 < var18.length; var19++) {
            class122 var102 = var18[var19] = new class122();
            int var103 = var2.method63((byte) 45);
            if (var103 > 0) {
                var102.field2411 = new byte[var103 * 2];
            }
            int var104 = var2.method63((byte) 127);
            if (var104 > 0) {
                var102.field2410 = new byte[var104 * 2 + 2];
                var102.field2410[1] = 64;
            }
        }
        int var20 = var2.method63((byte) 48);
        byte[] var21 = var20 > 0 ? new byte[var20 * 2] : null;
        int var22 = var2.method63((byte) 80);
        byte[] var23 = var22 > 0 ? new byte[var22 * 2] : null;
        int var24;
        for (var24 = 0; var2.field124[var2.field146 + var24] != 0; var24++) {
        }
        byte[] var25 = new byte[var24];
        for (int var26 = 0; var26 < var24; var26++) {
            var25[var26] = var2.method98(1);
        }
        var2.field146++;
        int var27 = 0;
        for (int var28 = 0; var28 < 128; var28++) {
            var27 += var2.method63((byte) 120);
            this.field3933[var28] = (short) var27;
        }
        var24++;
        int var29 = 0;
        for (int var30 = 0; var30 < 128; var30++) {
            var29 += var2.method63((byte) 91);
            this.field3933[var30] = (short) (this.field3933[var30] + (var29 << 8));
        }
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        for (int var34 = 0; var34 < 128; var34++) {
            if (var31 == 0) {
                if (var33 >= var25.length) {
                    var31 = -1;
                } else {
                    var31 = var25[var33++];
                }
                var32 = var2.method93(9);
            }
            var31--;
            this.field3933[var34] = (short) (this.field3933[var34] + class68.method612(var32 - 1 << 14, 32768));
            this.field3930[var34] = var32;
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (this.field3930[var38] != 0) {
                if (var37 == 0) {
                    if (var36 >= var4.length) {
                        var37 = -1;
                    } else {
                        var37 = var4[var36++];
                    }
                    var35 = var2.field124[var7++] - 1;
                }
                this.field3935[var38] = (byte) var35;
                var37--;
            }
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field3930[var42] != 0) {
                if (var40 == 0) {
                    if (var39 < var8.length) {
                        var40 = var8[var39++];
                    } else {
                        var40 = -1;
                    }
                    var41 = var2.field124[var11++] + 16 << 2;
                }
                var40--;
                this.field3934[var42] = (byte) var41;
            }
        }
        int var43 = 0;
        int var44 = 0;
        class122 var45 = null;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field3930[var46] != 0) {
                if (var44 == 0) {
                    var45 = var18[var14[var43]];
                    if (var12.length > var43) {
                        var44 = var12[var43++];
                    } else {
                        var44 = -1;
                    }
                }
                var44--;
                this.field3929[var46] = var45;
            }
        }
        int var47 = 0;
        int var48 = 0;
        int var49 = 0;
        for (int var50 = 0; var50 < 128; var50++) {
            if (var47 == 0) {
                if (var25.length <= var49) {
                    var47 = -1;
                } else {
                    var47 = var25[var49++];
                }
                if (this.field3930[var50] > 0) {
                    var48 = var2.method63((byte) 54) + 1;
                }
            }
            var47--;
            this.field3927[var50] = (byte) var48;
        }
        this.field3940 = var2.method63((byte) 90) + 1;
        for (int var51 = 0; var51 < var15; var51++) {
            class122 var99 = var18[var51];
            if (var99.field2411 != null) {
                for (int var100 = 1; var100 < var99.field2411.length; var100 += 2) {
                    var99.field2411[var100] = var2.method98(1);
                }
            }
            if (var99.field2410 != null) {
                for (int var101 = 3; var101 < var99.field2410.length - 2; var101 += 2) {
                    var99.field2410[var101] = var2.method98(1);
                }
            }
        }
        if (var21 != null) {
            for (int var52 = 1; var52 < var21.length; var52 += 2) {
                var21[var52] = var2.method98(1);
            }
        }
        if (var23 != null) {
            for (int var53 = 1; var53 < var23.length; var53 += 2) {
                var23[var53] = var2.method98(1);
            }
        }
        for (int var54 = 0; var54 < var15; var54++) {
            class122 var96 = var18[var54];
            if (var96.field2410 != null) {
                int var97 = 0;
                for (int var98 = 2; var98 < var96.field2410.length; var98 += 2) {
                    var97 = var2.method63((byte) 106) + var97 + 1;
                    var96.field2410[var98] = (byte) var97;
                }
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class122 var93 = var18[var55];
            if (var93.field2411 != null) {
                int var94 = 0;
                for (int var95 = 2; var95 < var93.field2411.length; var95 += 2) {
                    var94 += var2.method63((byte) 87) + 1;
                    var93.field2411[var95] = (byte) var94;
                }
            }
        }
        if (var21 != null) {
            int var56 = var2.method63((byte) 95);
            var21[0] = (byte) var56;
            for (int var57 = 2; var57 < var21.length; var57 += 2) {
                var56 = var2.method63((byte) 121) + var56 + 1;
                var21[var57] = (byte) var56;
            }
            byte var58 = var21[0];
            byte var59 = var21[1];
            for (int var60 = 0; var60 < var58; var60++) {
                this.field3927[var60] = (byte) (this.field3927[var60] * var59 + 32 >> 6);
            }
            int var61 = 2;
            while (var21.length > var61) {
                byte var64 = var21[var61];
                byte var65 = var21[var61 + 1];
                var61 += 2;
                int var66 = (var64 - var58) / 2 + (var64 - var58) * var59;
                for (int var67 = var58; var67 < var64; var67++) {
                    int var68 = class114.method890(-1394, var64 - var58, var66);
                    this.field3927[var67] = (byte) (this.field3927[var67] * var68 + 32 >> 6);
                    var66 += var65 - var59;
                }
                var59 = var65;
                var58 = var64;
            }
            Object var62 = null;
            for (int var63 = var58; var63 < 128; var63++) {
                this.field3927[var63] = (byte) (this.field3927[var63] * var59 + 32 >> 6);
            }
        }
        if (var23 != null) {
            int var69 = var2.method63((byte) 103);
            var23[0] = (byte) var69;
            for (int var70 = 2; var70 < var23.length; var70 += 2) {
                var69 -= -var2.method63((byte) 108) - 1;
                var23[var70] = (byte) var69;
            }
            byte var71 = var23[0];
            int var72 = var23[1] << 1;
            for (int var73 = 0; var73 < var71; var73++) {
                int var84 = (this.field3934[var73] & 0xFF) + var72;
                if (var84 < 0) {
                    var84 = 0;
                }
                if (var84 > 128) {
                    var84 = 128;
                }
                this.field3934[var73] = (byte) var84;
            }
            int var74 = 2;
            while (var23.length > var74) {
                byte var78 = var23[var74];
                int var79 = var23[var74 + 1] << 1;
                var74 += 2;
                int var80 = (var78 - var71) / 2 + (var78 - var71) * var72;
                for (int var81 = var71; var81 < var78; var81++) {
                    int var82 = class114.method890(-1394, var78 - var71, var80);
                    var80 += var79 - var72;
                    int var83 = (this.field3934[var81] & 0xFF) + var82;
                    if (var83 < 0) {
                        var83 = 0;
                    }
                    if (var83 > 128) {
                        var83 = 128;
                    }
                    this.field3934[var81] = (byte) var83;
                }
                var72 = var79;
                var71 = var78;
            }
            Object var75 = null;
            for (int var76 = var71; var76 < 128; var76++) {
                int var77 = (this.field3934[var76] & 0xFF) + var72;
                if (var77 < 0) {
                    var77 = 0;
                }
                if (var77 > 128) {
                    var77 = 128;
                }
                this.field3934[var76] = (byte) var77;
            }
        }
        for (int var85 = 0; var85 < var15; var85++) {
            var18[var85].field2406 = var2.method63((byte) 122);
        }
        for (int var86 = 0; var86 < var15; var86++) {
            class122 var92 = var18[var86];
            if (var92.field2411 != null) {
                var92.field2400 = var2.method63((byte) 123);
            }
            if (var92.field2410 != null) {
                var92.field2407 = var2.method63((byte) 99);
            }
            if (var92.field2406 > 0) {
                var92.field2399 = var2.method63((byte) 124);
            }
        }
        for (int var87 = 0; var87 < var15; var87++) {
            var18[var87].field2395 = var2.method63((byte) 109);
        }
        for (int var88 = 0; var88 < var15; var88++) {
            class122 var91 = var18[var88];
            if (var91.field2395 > 0) {
                var91.field2398 = var2.method63((byte) 60);
            }
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class122 var90 = var18[var89];
            if (var90.field2398 > 0) {
                var90.field2402 = var2.method63((byte) 55);
            }
        }
    }
}
