import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class190 extends class102 {

    @OriginalMember(owner = "client!rf", name = "S", descriptor = "[I")
    public static int[] field3536 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!rf", name = "O", descriptor = "I")
    public static volatile int field3532 = -1;

    @OriginalMember(owner = "client!rf", name = "V", descriptor = "I")
    public static int field3539 = 0;

    @OriginalMember(owner = "client!rf", name = "Y", descriptor = "Lqe;")
    public static class179 field3542 = class206.method1380("Bitte laden Sie die Seite neu)3", (byte) -126);

    @OriginalMember(owner = "client!rf", name = "N", descriptor = "I")
    public static int field3531;

    @OriginalMember(owner = "client!rf", name = "P", descriptor = "I")
    public static int field3533;

    @OriginalMember(owner = "client!rf", name = "Q", descriptor = "I")
    public static int field3534;

    @OriginalMember(owner = "client!rf", name = "R", descriptor = "I")
    public static int field3535;

    @OriginalMember(owner = "client!rf", name = "T", descriptor = "I")
    public static int field3537;

    @OriginalMember(owner = "client!rf", name = "W", descriptor = "I")
    public static int field3540;

    @OriginalMember(owner = "client!rf", name = "X", descriptor = "I")
    public static int field3541;

    @OriginalMember(owner = "client!rf", name = "U", descriptor = "J")
    public static long field3538;

    @OriginalMember(owner = "client!rf", name = "M", descriptor = "[I")
    public static int[] field3530;

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "(B)V")
    public static final void method1277(byte arg0) {
        class139.method880(class86.field1647, 100);
        ++field3541;
        ++class233.field4304;
        if (class54.field1187 && class84.field1628) {
            int var1 = class4.field61;
            int var2 = var1 - class150.field2701;
            if (var2 < class18.field476) {
                var2 = class18.field476;
            }
            int var3 = class139.field2559;
            int var4 = class86.field1647.field102;
            if (class86.field1647.field169 + var2 > class18.field476 + class123.field2280.field169) {
                var2 = class18.field476 + class123.field2280.field169 - class86.field1647.field169;
            }
            if (arg0 != -51) {
                field3542 = null;
            }
            int var5 = class123.field2280.field70 + var2 + -class18.field476;
            int var6 = var3 - class233.field4307;
            int var7 = var2 - class11.field294;
            if (~class196.field3640 < ~var6) {
                var6 = class196.field3640;
            }
            if (~(var6 - -class86.field1647.field73) < ~(class196.field3640 - -class123.field2280.field73)) {
                var6 = -class86.field1647.field73 + class123.field2280.field73 + class196.field3640;
            }
            int var8 = class123.field2280.field119 + var6 + -class196.field3640;
            int var9 = var6 - class141.field2583;
            if (~class86.field1647.field154 > ~class233.field4304 && (~var4 > ~var7 || var7 < -var4 || ~var9 < ~var4 || ~var9 > ~(-var4))) {
                class227.field4207 = true;
            }
            if (class86.field1647.field201 != null && class227.field4207) {
                class19 var10 = new class19();
                var10.field496 = var5;
                var10.field499 = class86.field1647;
                var10.field491 = class86.field1647.field201;
                var10.field489 = var8;
                class102.method681(arg0 ^ -200051, var10);
            }
            if (class40.field868 == 0) {
                if (!class227.field4207) {
                    if ((class205.field3839 == 1 || class202.method1346(class113.field2118 + -1, 104)) && class113.field2118 > 2) {
                        class191.method1285((byte) 79);
                    } else if (~class113.field2118 < -1) {
                        class8.method54(class113.field2118 + -1, 180);
                    }
                } else {
                    if (class86.field1647.field214 != null) {
                        class19 var11 = new class19();
                        var11.field489 = var8;
                        var11.field496 = var5;
                        var11.field499 = class86.field1647;
                        var11.field487 = class23.field560;
                        var11.field491 = class86.field1647.field214;
                        class102.method681(200000, var11);
                    }
                    if (class23.field560 != null && class100.method640(255, class86.field1647) != null) {
                        ++class97.field1822;
                        class81.field1564.method70((byte) -62, 204);
                        class81.field1564.method1208(-28417, class86.field1647.field130);
                        class81.field1564.method1246(class23.field560.field130, arg0 ^ -68);
                        class81.field1564.method1216((byte) 112, class86.field1647.field173);
                        class81.field1564.method1201(class23.field560.field173, arg0 ^ -62);
                    }
                }
                class86.field1647 = null;
            }
        } else {
            if (~class233.field4304 < -2) {
                class86.field1647 = null;
            }
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(ZI)[I")
    public final int[] method11(boolean arg0, int arg1) {
        if (!arg0) {
            method1281(-85);
        }
        ++field3531;
        int[] var3 = super.field1960.method699((byte) -74, arg1);
        if (super.field1960.field2007) {
            int var4 = class94.field1769[arg1];
            for (int var5 = 0; ~class155.field2796 < ~var5; ++var5) {
                var3[var5] = this.method1282(var4, arg0, class124.field2292[var5]) % 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIIIIZIIIIII)Z")
    public static final boolean method1278(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        ++field3534;
        for (int var12 = 0; ~var12 > -105; ++var12) {
            for (int var36 = 0; ~var36 > -105; ++var36) {
                class218.field4043[var12][var36] = 0;
                class129.field2357[var12][var36] = 99999999;
            }
        }
        if (arg4 < 19) {
            method1280(23);
        }
        class218.field4043[arg10][arg7] = 99;
        int var13 = arg10;
        int var14 = 0;
        class129.field2357[arg10][arg7] = 0;
        boolean var15 = false;
        int var16 = arg7;
        byte var17 = 0;
        class120.field2247[var17] = arg10;
        int var37 = var17 + 1;
        class71.field1420[var17] = arg7;
        int var18 = class120.field2247.length;
        int[][] var19 = class135.field2492[class49.field1038].field855;
        while (var14 != var37) {
            var13 = class120.field2247[var14];
            var16 = class71.field1420[var14];
            var14 = (var14 + 1) % var18;
            if (~arg1 == ~var13 && ~arg3 == ~var16) {
                var15 = true;
                break;
            }
            if (~arg9 != -1) {
                if ((arg9 < 5 || ~arg9 == -11) && class135.field2492[class49.field1038].method267(-1, var16, arg1, arg9 + -1, arg2, var13, arg3)) {
                    var15 = true;
                    break;
                }
                if (arg9 < 10 && class135.field2492[class49.field1038].method258(var13, arg3, var16, arg2, arg1, arg9 - 1, -75)) {
                    var15 = true;
                    break;
                }
            }
            if (arg8 != 0 && ~arg11 != -1 && class135.field2492[class49.field1038].method257(var16, arg1, -113, arg3, arg8, var13, arg11, arg6)) {
                var15 = true;
                break;
            }
            int var35 = class129.field2357[var13][var16] + 1;
            if (var13 > 0 && ~class218.field4043[var13 + -1][var16] == -1 && (19661064 & var19[var13 + -1][var16]) == 0) {
                class120.field2247[var37] = var13 + -1;
                class71.field1420[var37] = var16;
                class218.field4043[var13 - 1][var16] = 2;
                var37 = (var37 + 1) % var18;
                class129.field2357[var13 + -1][var16] = var35;
            }
            if (var13 < 103 && class218.field4043[var13 + 1][var16] == 0 && (var19[var13 + 1][var16] & 19661184) == 0) {
                class120.field2247[var37] = var13 + 1;
                class71.field1420[var37] = var16;
                var37 = (var37 + 1) % var18;
                class218.field4043[var13 - -1][var16] = 8;
                class129.field2357[var13 + 1][var16] = var35;
            }
            if (var16 > 0 && class218.field4043[var13][var16 - 1] == 0 && (var19[var13][var16 + -1] & 19661058) == 0) {
                class120.field2247[var37] = var13;
                class71.field1420[var37] = var16 + -1;
                var37 = (var37 + 1) % var18;
                class218.field4043[var13][var16 - 1] = 1;
                class129.field2357[var13][var16 + -1] = var35;
            }
            if (var16 < 103 && ~class218.field4043[var13][var16 - -1] == -1 && (var19[var13][var16 + 1] & 19661088) == 0) {
                class120.field2247[var37] = var13;
                class71.field1420[var37] = var16 + 1;
                class218.field4043[var13][var16 - -1] = 4;
                class129.field2357[var13][var16 + 1] = var35;
                var37 = (var37 - -1) % var18;
            }
            if (var13 > 0 && var16 > 0 && class218.field4043[var13 - 1][var16 + -1] == 0 && (19661070 & var19[var13 + -1][var16 - 1]) == 0 && ~(19661064 & var19[var13 - 1][var16]) == -1 && (var19[var13][var16 - 1] & 19661058) == 0) {
                class120.field2247[var37] = var13 + -1;
                class71.field1420[var37] = var16 - 1;
                var37 = (var37 + 1) % var18;
                class218.field4043[var13 + -1][var16 + -1] = 3;
                class129.field2357[var13 + -1][var16 + -1] = var35;
            }
            if (~var13 > -104 && ~var16 < -1 && ~class218.field4043[var13 + 1][var16 + -1] == -1 && ~(19661187 & var19[var13 + 1][var16 + -1]) == -1 && ~(19661184 & var19[var13 - -1][var16]) == -1 && (19661058 & var19[var13][var16 + -1]) == 0) {
                class120.field2247[var37] = var13 + 1;
                class71.field1420[var37] = var16 + -1;
                class218.field4043[var13 + 1][var16 + -1] = 9;
                class129.field2357[var13 + 1][var16 + -1] = var35;
                var37 = (var37 - -1) % var18;
            }
            if (~var13 < -1 && ~var16 > -104 && ~class218.field4043[var13 + -1][var16 + 1] == -1 && ~(var19[var13 + -1][var16 + 1] & 19661112) == -1 && ~(19661064 & var19[var13 + -1][var16]) == -1 && ~(19661088 & var19[var13][var16 - -1]) == -1) {
                class120.field2247[var37] = var13 + -1;
                class71.field1420[var37] = var16 + 1;
                var37 = (var37 + 1) % var18;
                class218.field4043[var13 - 1][var16 + 1] = 6;
                class129.field2357[var13 + -1][var16 + 1] = var35;
            }
            if (var13 < 103 && ~var16 > -104 && class218.field4043[var13 + 1][var16 + 1] == 0 && ~(var19[var13 - -1][var16 + 1] & 19661280) == -1 && (var19[var13 + 1][var16] & 19661184) == 0 && ~(var19[var13][var16 + 1] & 19661088) == -1) {
                class120.field2247[var37] = var13 + 1;
                class71.field1420[var37] = var16 - -1;
                class218.field4043[var13 - -1][var16 + 1] = 12;
                class129.field2357[var13 + 1][var16 - -1] = var35;
                var37 = (var37 - -1) % var18;
            }
        }
        class120.field2253 = 0;
        if (!var15) {
            if (!arg5) {
                return false;
            }
            int var20 = 100;
            byte var21 = 10;
            int var22 = 1000;
            for (int var23 = -var21 + arg1; ~var23 >= ~(arg1 - -var21); ++var23) {
                for (int var24 = -var21 + arg3; arg3 - -var21 >= var24; ++var24) {
                    if (var23 >= 0 && var24 >= 0 && ~var23 > -105 && var24 < 104 && ~class129.field2357[var23][var24] > -101) {
                        int var25 = 0;
                        int var26 = 0;
                        if (var23 >= arg1) {
                            if (~(arg1 + -1 - -arg8) > ~var23) {
                                var25 = -arg1 + 1 + var23 + -arg8;
                            }
                        } else {
                            var25 = arg1 - var23;
                        }
                        if (~arg3 < ~var24) {
                            var26 = arg3 - var24;
                        } else if (arg3 + arg11 + -1 < var24) {
                            var26 = -arg11 - -1 + -arg3 + var24;
                        }
                        int var27 = var25 * var25 + var26 * var26;
                        if (~var27 > ~var22 || ~var22 == ~var27 && var20 > class129.field2357[var23][var24]) {
                            var13 = var23;
                            var16 = var24;
                            var20 = class129.field2357[var23][var24];
                            var22 = var27;
                        }
                    }
                }
            }
            if (var22 == 1000) {
                return false;
            }
            if (~arg10 == ~var13 && arg7 == var16) {
                return false;
            }
            class120.field2253 = 1;
        }
        byte var28 = 0;
        class120.field2247[var28] = var13;
        int var38 = var28 + 1;
        class71.field1420[var28] = var16;
        int var29;
        int var30 = var29 = class218.field4043[var13][var16];
        while (~arg10 != ~var13 || ~arg7 != ~var16) {
            if (~var29 != ~var30) {
                class120.field2247[var38] = var13;
                class71.field1420[var38++] = var16;
                var29 = var30;
            }
            if ((1 & var30) == 0) {
                if ((4 & var30) != 0) {
                    --var16;
                }
            } else {
                ++var16;
            }
            if ((var30 & 2) != 0) {
                ++var13;
            } else if (~(8 & var30) != -1) {
                --var13;
            }
            var30 = class218.field4043[var13][var16];
        }
        if (~var38 >= -1) {
            if (arg0 == 1) {
                return false;
            } else {
                return true;
            }
        } else {
            int var31 = var38;
            if (var38 > 25) {
                var31 = 25;
            }
            --var38;
            int var32 = class71.field1420[var38];
            int var33 = class120.field2247[var38];
            if (arg0 == 0) {
                ++class53.field1172;
                class81.field1564.method70((byte) -62, 230);
                class81.field1564.method1230((byte) -78, var31 - -var31 + 3);
            }
            if (arg0 == 1) {
                class81.field1564.method70((byte) -62, 179);
                class81.field1564.method1230((byte) -65, var31 + var31 - -17);
                ++class128.field2335;
            }
            if (arg0 == 2) {
                class81.field1564.method70((byte) -62, 212);
                class81.field1564.method1230((byte) -94, var31 + var31 + 3);
                ++class93.field1748;
            }
            class81.field1564.method1255(!class84.field1618[82] ? 0 : 1, (byte) 25);
            class81.field1564.method1208(-28417, var33 - -class2.field26);
            class81.field1564.method1236(-26162, class141.field2582 + var32);
            class139.field2567 = class120.field2247[0];
            class199.field3704 = class71.field1420[0];
            for (int var34 = 1; var34 < var31; ++var34) {
                --var38;
                class81.field1564.method1230((byte) -84, class120.field2247[var38] - var33);
                class81.field1564.method1230((byte) -121, class71.field1420[var38] + -var32);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "(III)Z")
    public static final boolean method1279(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class217.field4026; ++var3) {
            class109 var4 = class10.field284[var3];
            if (var4.field2028 == 1) {
                int var5 = var4.field2035 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field2049 * var5 >> 8) + var4.field2041;
                    int var7 = (var4.field2033 * var5 >> 8) + var4.field2040;
                    int var8 = (var4.field2022 * var5 >> 8) + var4.field2023;
                    int var9 = (var4.field2024 * var5 >> 8) + var4.field2036;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field2028 == 2) {
                int var10 = arg0 - var4.field2035;
                if (var10 > 0) {
                    int var11 = (var4.field2049 * var10 >> 8) + var4.field2041;
                    int var12 = (var4.field2033 * var10 >> 8) + var4.field2040;
                    int var13 = (var4.field2022 * var10 >> 8) + var4.field2023;
                    int var14 = (var4.field2024 * var10 >> 8) + var4.field2036;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field2028 == 3) {
                int var15 = var4.field2041 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field2027 * var15 >> 8) + var4.field2035;
                    int var17 = (var4.field2048 * var15 >> 8) + var4.field2029;
                    int var18 = (var4.field2022 * var15 >> 8) + var4.field2023;
                    int var19 = (var4.field2024 * var15 >> 8) + var4.field2036;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field2028 == 4) {
                int var20 = arg2 - var4.field2041;
                if (var20 > 0) {
                    int var21 = (var4.field2027 * var20 >> 8) + var4.field2035;
                    int var22 = (var4.field2048 * var20 >> 8) + var4.field2029;
                    int var23 = (var4.field2022 * var20 >> 8) + var4.field2023;
                    int var24 = (var4.field2024 * var20 >> 8) + var4.field2036;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field2028 == 5) {
                int var25 = arg1 - var4.field2023;
                if (var25 > 0) {
                    int var26 = (var4.field2027 * var25 >> 8) + var4.field2035;
                    int var27 = (var4.field2048 * var25 >> 8) + var4.field2029;
                    int var28 = (var4.field2049 * var25 >> 8) + var4.field2041;
                    int var29 = (var4.field2033 * var25 >> 8) + var4.field2040;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "()V")
    public class190() {
        super(0, true);
    }

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "(I)V")
    public static void method1280(int arg0) {
        field3542 = null;
        field3536 = null;
        if (arg0 != 0) {
            method1278(88, -83, 15, 79, -16, false, 97, 35, 23, -6, -126, 119);
        }
        field3530 = null;
    }

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "(I)V")
    public static final void method1281(int arg0) {
        class36.field789.method73(false);
        int var1 = class36.field789.method71(1, 128);
        ++field3537;
        if (var1 != 0) {
            if (arg0 > -110) {
                method1280(-28);
            }
            int var2 = class36.field789.method71(2, 128);
            if (~var2 == -1) {
                class74.field1449[class202.field3742++] = 2047;
            } else if (~var2 == -2) {
                int var3 = class36.field789.method71(3, 128);
                class61.field1298.method1106(var3, (byte) 7, false);
                int var4 = class36.field789.method71(1, 128);
                if (var4 == 1) {
                    class74.field1449[class202.field3742++] = 2047;
                }
            } else if (~var2 == -3) {
                int var5 = class36.field789.method71(3, 128);
                class61.field1298.method1106(var5, (byte) 7, true);
                int var6 = class36.field789.method71(3, 128);
                class61.field1298.method1106(var6, (byte) 7, true);
                int var7 = class36.field789.method71(1, 128);
                if (var7 == 1) {
                    class74.field1449[class202.field3742++] = 2047;
                }
            } else if (~var2 == -4) {
                int var8 = class36.field789.method71(7, 128);
                int var9 = class36.field789.method71(1, 128);
                if (var9 == 1) {
                    class74.field1449[class202.field3742++] = 2047;
                }
                class49.field1038 = class36.field789.method71(2, 128);
                int var10 = class36.field789.method71(7, 128);
                int var11 = class36.field789.method71(1, 128);
                class61.field1298.method1108(var8, ~var11 == -2, var10, 20826);
            }
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IZI)I")
    private final int method1282(int arg0, boolean arg1, int arg2) {
        ++field3533;
        int var4 = arg2 - -(arg0 * 57);
        int var5 = var4 << 1 ^ var4;
        if (!arg1) {
            this.method1282(4, false, -60);
        }
        return -((Integer.MAX_VALUE & (var5 * 15731 * var5 - -789221) * var5 + 1376312589) / 262144) + 4096;
    }
}
