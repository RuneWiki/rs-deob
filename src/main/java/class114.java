import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class114 extends class183 {

    @OriginalMember(owner = "client!ke", name = "w", descriptor = "I")
    public int field2034;

    @OriginalMember(owner = "client!ke", name = "r", descriptor = "I")
    public int field2029;

    @OriginalMember(owner = "client!ke", name = "q", descriptor = "Ldj;")
    public static class44 field2028 = null;

    @OriginalMember(owner = "client!ke", name = "z", descriptor = "Ldj;")
    private static class44 field2037 = class89.method650(255, "Login server offline)3");

    @OriginalMember(owner = "client!ke", name = "y", descriptor = "Ldj;")
    public static class44 field2036 = class89.method650(255, "(U3");

    @OriginalMember(owner = "client!ke", name = "v", descriptor = "Ldj;")
    public static class44 field2033 = field2037;

    @OriginalMember(owner = "client!ke", name = "s", descriptor = "I")
    public static int field2030;

    @OriginalMember(owner = "client!ke", name = "t", descriptor = "I")
    public static int field2031;

    @OriginalMember(owner = "client!ke", name = "u", descriptor = "I")
    public static int field2032;

    @OriginalMember(owner = "client!ke", name = "x", descriptor = "I")
    public static int field2035;

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(B)V")
    public static final void method799(byte arg0) {
        int var1 = class223.field4168 * 128 + 64;
        int var2 = class205.field3677 * 128 + 64;
        field2030++;
        int var3 = class40.method278(var1, class194.field3403, var2, (byte) 101) - class153.field2655;
        if (var1 > class102.field1858) {
            class102.field1858 += (var1 - class102.field1858) * class211.field3775 / 1000 + class60.field1126;
            if (var1 < class102.field1858) {
                class102.field1858 = var1;
            }
        }
        if (class102.field1858 > var1) {
            class102.field1858 -= class60.field1126 + (class102.field1858 - var1) * class211.field3775 / 1000;
            if (var1 > class102.field1858) {
                class102.field1858 = var1;
            }
        }
        int var4 = class120.field2132 * 128 + 64;
        if (class168.field2878 < var2) {
            class168.field2878 += (var2 - class168.field2878) * class211.field3775 / 1000 + class60.field1126;
            if (class168.field2878 > var2) {
                class168.field2878 = var2;
            }
        }
        if (class35.field628 < var3) {
            class35.field628 += class60.field1126 + (var3 - class35.field628) * class211.field3775 / 1000;
            if (var3 < class35.field628) {
                class35.field628 = var3;
            }
        }
        if (var3 < class35.field628) {
            class35.field628 -= class60.field1126 + (class35.field628 - var3) * class211.field3775 / 1000;
            if (class35.field628 < var3) {
                class35.field628 = var3;
            }
        }
        if (class168.field2878 > var2) {
            class168.field2878 -= class60.field1126 + (class168.field2878 - var2) * class211.field3775 / 1000;
            if (class168.field2878 < var2) {
                class168.field2878 = var2;
            }
        }
        int var5 = class191.field3297 * 128 + 64;
        int var6 = class40.method278(var4, class194.field3403, var5, (byte) 101) - class63.field1180;
        int var7 = var5 - class168.field2878;
        int var8 = var4 - class102.field1858;
        int var9 = var6 - class35.field628;
        int var10 = -69 % ((arg0 - 42) / 54);
        int var11 = (int) Math.sqrt((double) (var7 * var7 + var8 * var8));
        int var12 = (int) (Math.atan2((double) var9, (double) var11) * 325.949D) & 0x7FF;
        int var13 = (int) (-325.949D * Math.atan2((double) var7, (double) var8)) & 0x7FF;
        int var14 = var13 - class38.field675;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var12 < 128) {
            var12 = 128;
        }
        if (var12 > 383) {
            var12 = 383;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 > 0) {
            class38.field675 += class145.field2562 * var14 / 1000 + class134.field2397;
            class38.field675 &= 0x7FF;
        }
        if (class199.field3527 < var12) {
            class199.field3527 += (var12 - class199.field3527) * class145.field2562 / 1000 + class134.field2397;
            if (class199.field3527 > var12) {
                class199.field3527 = var12;
            }
        }
        if (var12 < class199.field3527) {
            class199.field3527 -= (class199.field3527 - var12) * class145.field2562 / 1000 + class134.field2397;
            if (class199.field3527 < var12) {
                class199.field3527 = var12;
            }
        }
        if (var14 < 0) {
            class38.field675 -= -var14 * class145.field2562 / 1000 + class134.field2397;
            class38.field675 &= 0x7FF;
        }
        int var15 = var13 - class38.field675;
        if (var15 > 1024) {
            var15 -= 2048;
        }
        if (var15 < -1024) {
            var15 += 2048;
        }
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            class38.field675 = var13;
        }
    }

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "(I)V")
    public static final void method800(int arg0) {
        field2032++;
        for (class29 var1 = (class29) class78.field1503.method1189(arg0 + 30997); var1 != null; var1 = (class29) class78.field1503.method1192((byte) -94)) {
            if (var1.field508 != null) {
                var1.method206(0);
            }
        }
        if (arg0 != -30997) {
            method800(-97);
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIIII)V")
    public static final void method801(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= class66.field1205 * 128) {
            arg0 = class66.field1205 * 128 - 1;
        }
        if (arg2 < 0) {
            arg2 = 0;
        } else if (arg2 >= class21.field355 * 128) {
            arg2 = class21.field355 * 128 - 1;
        }
        class188.field3248++;
        class174.field3030 = class206.field3684[arg3];
        class156.field2705 = class206.field3700[arg3];
        class82.field1609 = class206.field3684[arg4];
        class77.field1494 = class206.field3700[arg4];
        class191.field3298 = arg0;
        class153.field2666 = arg1;
        class200.field3546 = arg2;
        class157.field2735 = arg0 / 128;
        class98.field1799 = arg2 / 128;
        class84.field1635 = arg5;
        class106.field1933 = class157.field2735 - class59.field1108;
        if (class106.field1933 < 0) {
            class106.field1933 = 0;
        }
        class115.field2046 = class98.field1799 - class59.field1108;
        if (class115.field2046 < 0) {
            class115.field2046 = 0;
        }
        class208.field3737 = class59.field1108 + class157.field2735;
        if (class208.field3737 > class66.field1205) {
            class208.field3737 = class66.field1205;
        }
        class218.field3960 = class98.field1799 + class59.field1108;
        if (class218.field3960 > class21.field355) {
            class218.field3960 = class21.field355;
        }
        short var6 = 3500;
        for (int var7 = 0; var7 < class59.field1108 + class59.field1108 + 2; var7++) {
            for (int var39 = 0; var39 < class59.field1108 + class59.field1108 + 2; var39++) {
                int var40 = (var7 - class59.field1108 << 7) - (arg0 & 0x7F);
                int var41 = (var39 - class59.field1108 << 7) - (arg2 & 0x7F);
                int var42 = class157.field2735 + var7 - class59.field1108;
                int var43 = class98.field1799 + var39 - class59.field1108;
                if (var42 >= 0 && var43 >= 0 && var42 < class66.field1205 && var43 < class21.field355) {
                    int var44 = class205.field3675[0][var42][var43] - arg1;
                    class202.field3607[var7][var39] = class210.method1360(var40, var44 - 2000, var44 + 128, var41, var6);
                } else {
                    class202.field3607[var7][var39] = false;
                }
            }
        }
        for (int var8 = 0; var8 < class59.field1108 + class59.field1108 + 1; var8++) {
            for (int var38 = 0; var38 < class59.field1108 + class59.field1108 + 1; var38++) {
                class162.field2809[var8][var38] = class202.field3607[var8][var38] || class202.field3607[var8 + 1][var38] || class202.field3607[var8][var38 + 1] || class202.field3607[var8 + 1][var38 + 1];
            }
        }
        class153.method989();
        class53.field961 = 0;
        for (int var9 = class62.field1158; var9 < class163.field2815; var9++) {
            class68[][] var34 = class32.field567[var9];
            for (int var35 = class106.field1933; var35 < class208.field3737; var35++) {
                for (int var36 = class115.field2046; var36 < class218.field3960; var36++) {
                    class68 var37 = var34[var35][var36];
                    if (var37 != null) {
                        if (var37.field1319 <= arg5 && class162.field2809[var35 + class59.field1108 - class157.field2735][var36 + class59.field1108 - class98.field1799]) {
                            var37.field1309 = true;
                            var37.field1296 = true;
                            if (var37.field1300 > 0) {
                                var37.field1305 = true;
                            } else {
                                var37.field1305 = false;
                            }
                            class53.field961++;
                        } else {
                            var37.field1309 = false;
                            var37.field1296 = false;
                            var37.field1307 = 0;
                        }
                    }
                }
            }
        }
        for (int var10 = class62.field1158; var10 < class163.field2815; var10++) {
            class68[][] var23 = class32.field567[var10];
            for (int var24 = -class59.field1108; var24 <= 0; var24++) {
                int var25 = class157.field2735 + var24;
                int var26 = class157.field2735 - var24;
                if (var25 >= class106.field1933 || var26 < class208.field3737) {
                    for (int var27 = -class59.field1108; var27 <= 0; var27++) {
                        int var28 = class98.field1799 + var27;
                        int var29 = class98.field1799 - var27;
                        if (var25 >= class106.field1933) {
                            if (var28 >= class115.field2046) {
                                class68 var30 = var23[var25][var28];
                                if (var30 != null && var30.field1309) {
                                    class228.method1496(var30, true);
                                }
                            }
                            if (var29 < class218.field3960) {
                                class68 var31 = var23[var25][var29];
                                if (var31 != null && var31.field1309) {
                                    class228.method1496(var31, true);
                                }
                            }
                        }
                        if (var26 < class208.field3737) {
                            if (var28 >= class115.field2046) {
                                class68 var32 = var23[var26][var28];
                                if (var32 != null && var32.field1309) {
                                    class228.method1496(var32, true);
                                }
                            }
                            if (var29 < class218.field3960) {
                                class68 var33 = var23[var26][var29];
                                if (var33 != null && var33.field1309) {
                                    class228.method1496(var33, true);
                                }
                            }
                        }
                        if (class53.field961 == 0) {
                            class72.field1374 = false;
                            return;
                        }
                    }
                }
            }
        }
        for (int var11 = class62.field1158; var11 < class163.field2815; var11++) {
            class68[][] var12 = class32.field567[var11];
            for (int var13 = -class59.field1108; var13 <= 0; var13++) {
                int var14 = class157.field2735 + var13;
                int var15 = class157.field2735 - var13;
                if (var14 >= class106.field1933 || var15 < class208.field3737) {
                    for (int var16 = -class59.field1108; var16 <= 0; var16++) {
                        int var17 = class98.field1799 + var16;
                        int var18 = class98.field1799 - var16;
                        if (var14 >= class106.field1933) {
                            if (var17 >= class115.field2046) {
                                class68 var19 = var12[var14][var17];
                                if (var19 != null && var19.field1309) {
                                    class228.method1496(var19, false);
                                }
                            }
                            if (var18 < class218.field3960) {
                                class68 var20 = var12[var14][var18];
                                if (var20 != null && var20.field1309) {
                                    class228.method1496(var20, false);
                                }
                            }
                        }
                        if (var15 < class208.field3737) {
                            if (var17 >= class115.field2046) {
                                class68 var21 = var12[var15][var17];
                                if (var21 != null && var21.field1309) {
                                    class228.method1496(var21, false);
                                }
                            }
                            if (var18 < class218.field3960) {
                                class68 var22 = var12[var15][var18];
                                if (var22 != null && var22.field1309) {
                                    class228.method1496(var22, false);
                                }
                            }
                        }
                        if (class53.field961 == 0) {
                            class72.field1374 = false;
                            return;
                        }
                    }
                }
            }
        }
        class72.field1374 = false;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILod;ILvc;ZII)V")
    public static final void method802(int arg0, class155 arg1, int arg2, class223 arg3, boolean arg4, int arg5, int arg6) {
        field2031++;
        if (arg1 == null) {
            return;
        }
        int var7 = arg2 * arg2 + arg6 * arg6;
        int var8 = class73.field1384 + class129.field2303 & 0x7FF;
        int var9 = Math.max(arg3.field4130 / 2, arg3.field4134 / 2) + 10;
        if (var7 > var9 * var9) {
            return;
        }
        int var10 = class206.field3684[var8];
        int var11 = var10 * 256 / (class218.field3959 + 256);
        int var12 = class206.field3700[var8];
        if (!arg4) {
            field2028 = null;
        }
        int var13 = var12 * 256 / (class218.field3959 + 256);
        int var14 = arg2 * var13 - arg6 * var11 >> 16;
        int var15 = arg2 * var11 + arg6 * var13 >> 16;
        arg1.method1022(arg3.field4130 / 2 + arg0 + var15 - arg1.field2689 / 2, arg3.field4134 / 2 + -var14 + -(arg1.field2692 / 2) + arg5, arg3.field4090, arg3.field4106);
    }

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "(B)V")
    public static void method803(byte arg0) {
        field2028 = null;
        field2033 = null;
        field2037 = null;
        int var1 = 117 % ((-arg0 - 6) / 46);
        field2036 = null;
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(II)V")
    public class114(int arg0, int arg1) {
        this.field2034 = arg1;
        this.field2029 = arg0;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ZII)I")
    public static final int method804(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            field2028 = null;
        }
        field2035++;
        class93 var3 = (class93) class54.field990.method828((long) arg2, (byte) -40);
        if (var3 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var3.field1729.length) {
            return var3.field1729[arg1];
        } else {
            return -1;
        }
    }
}
