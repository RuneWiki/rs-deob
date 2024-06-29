import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class185 {

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "Li;")
    private class112 field3004 = new class112(256);

    @OriginalMember(owner = "client!ug", name = "m", descriptor = "Li;")
    private class112 field3010 = new class112(256);

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "Lvh;")
    private class108 field2999;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "Lvh;")
    private class108 field2998;

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field3001 = null;

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "I")
    public static int field3002 = 0;

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "I")
    public static int field3000;

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "I")
    public static int field3003;

    @OriginalMember(owner = "client!ug", name = "h", descriptor = "I")
    public static int field3005;

    @OriginalMember(owner = "client!ug", name = "i", descriptor = "I")
    public static int field3006;

    @OriginalMember(owner = "client!ug", name = "j", descriptor = "I")
    public static int field3007;

    @OriginalMember(owner = "client!ug", name = "k", descriptor = "I")
    public static int field3008;

    @OriginalMember(owner = "client!ug", name = "l", descriptor = "I")
    public static int field3009;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(II[II)Lph;")
    private final class202 method1213(int arg0, int arg1, int[] arg2, int arg3) {
        if (arg1 != -2141725468) {
            method1221(32);
        }
        field3008++;
        int var5 = arg3 ^ (arg0 << 4 & 0xFFF8 | arg0 >>> 12);
        int var6 = var5 | arg0 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class202 var9 = (class202) this.field3010.method779(111, var7);
        if (var9 != null) {
            return var9;
        } else if (arg2 == null || arg2[0] > 0) {
            class214 var10 = (class214) this.field3004.method779(arg1 + 2141725391, var7);
            if (var10 == null) {
                var10 = class214.method1425(this.field2998, arg0, arg3);
                if (var10 == null) {
                    return null;
                }
                this.field3004.method780((byte) -78, var7, var10);
            }
            class202 var11 = var10.method1432(arg2);
            if (var11 == null) {
                return null;
            } else {
                var10.method547(10026);
                this.field3010.method780((byte) -78, var7, var11);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "([IIB)Lph;")
    public final class202 method1214(int[] arg0, int arg1, byte arg2) {
        field3000++;
        if (arg2 < 4) {
            this.method1215(-27, (int[]) null, -65);
        }
        if (this.field2999.method757(-1) == 1) {
            return this.method1217(arg0, arg1, 0, 128);
        } else if (this.field2999.method754(120, arg1) == 1) {
            return this.method1217(arg0, 0, arg1, 128);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(I[II)Lph;")
    public final class202 method1215(int arg0, int[] arg1, int arg2) {
        field3005++;
        if (this.field2998.method757(-1) == 1) {
            return this.method1213(0, -2141725468, arg1, arg0);
        } else if (this.field2998.method754(127, arg0) == 1) {
            return this.method1213(arg0, arg2 ^ 0x7FA8369D, arg1, 0);
        } else if (arg2 == -5511) {
            throw new RuntimeException();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIIIIZ[BI[Lta;I)[I")
    public static final int[] method1216(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, byte[] arg7, int arg8, class189[] arg9, int arg10) {
        field3006++;
        int var11 = (arg1 & 0x7) * 8;
        int var12 = (arg2 & 0x7) * 8;
        if (!arg6) {
            for (int var13 = 0; var13 < 8; var13++) {
                for (int var14 = 0; var14 < 8; var14++) {
                    int var15 = class255.method1688(-98, var14 & 0x7, var13 & 0x7, arg4) + arg8;
                    int var16 = class121.method827(var13 & 0x7, arg4, var14 & 0x7, 2443) + arg5;
                    if (var15 > 0 && var15 < 103 && var16 > 0 && var16 < 103) {
                        arg9[arg0].field3061[var15][var16] = class113.method791(arg9[arg0].field3061[var15][var16], -2097153);
                    }
                }
            }
        }
        byte var17;
        if (arg6) {
            var17 = 1;
        } else {
            var17 = 4;
        }
        class101 var18 = new class101(arg7);
        int var19 = arg1 & 0x1FFFFFF8 << 3;
        int var20 = (arg2 & 0xFFFFFFF8) << 3;
        for (int var21 = arg10; var21 < var17; var21++) {
            for (int var42 = 0; var42 < 64; var42++) {
                for (int var43 = 0; var43 < 64; var43++) {
                    if (arg3 != var21 || var42 < var11 || var11 + 8 < var42 || var43 < var12 || var12 + 8 < var43) {
                        class163.method1100(0, 0, 0, -1, -1, arg6, false, -924, var18, 0);
                    } else if ((var11 + 8) == var42 || var12 + 8 == var43) {
                        int var50;
                        int var51;
                        if (arg4 == 0) {
                            var51 = var42 + arg8 - var11;
                            var50 = arg5 + var43 - var12;
                        } else if (arg4 == 1) {
                            var50 = var11 + (arg5 - -8) - var42;
                            var51 = arg8 + var43 - var12;
                        } else if (arg4 == 2) {
                            var50 = arg5 + var12 + 8 - var43;
                            var51 = arg8 + var11 + 8 - var42;
                        } else {
                            var50 = arg5 + var42 - var11;
                            var51 = arg8 + var12 + 8 - var43;
                        }
                        class163.method1100(var20 + var43, 0, var19 + var42, var50, var51, arg6, true, arg10 - 924, var18, arg0);
                    } else {
                        int var44 = arg8 + class255.method1688(-98, var43 & 0x7, var42 & 0x7, arg4);
                        int var45 = class121.method827(var42 & 0x7, arg4, var43 & 0x7, 2443) + arg5;
                        class163.method1100(var20 + var43, arg4, var19 + var42, var45, var44, arg6, false, arg10 ^ 0xFFFFFC64, var18, arg0);
                        if (var42 == 63 || var43 == 63) {
                            int var46 = var43 == 63 ? 64 : var43;
                            int var47 = var42 == 63 ? 64 : var42;
                            int var48;
                            int var49;
                            if (arg4 == 0) {
                                var48 = arg5 + var46 - var12;
                                var49 = arg8 + var47 - var11;
                            } else if (arg4 == 1) {
                                var49 = arg8 + var46 - var12;
                                var48 = var11 - (var47 - arg5 - 8);
                            } else if (arg4 == 2) {
                                var48 = var12 + arg5 - (var46 - 8);
                                var49 = var11 + arg8 + 8 - var47;
                            } else {
                                var48 = arg5 + var47 - var11;
                                var49 = var12 + arg8 - (var46 - 8);
                            }
                            if (var49 >= 0 && var49 < 104 && var48 >= 0 && var48 < 104) {
                                class95.field1642[var21][var49][var48] = class95.field1642[var21][var44][var45];
                            }
                        }
                    }
                }
            }
        }
        boolean var22 = false;
        while (var18.field1730.length > var18.field1762) {
            int var23 = var18.method669((byte) 36);
            if (var23 == 128) {
                class296.field4700[0] = var18.method677(false);
                class296.field4700[1] = var18.method686(arg10 - 3);
                var22 = true;
                class296.field4700[2] = var18.method686(-3);
                class296.field4700[3] = var18.method686(-3);
                class296.field4700[4] = var18.method677(false);
            } else {
                if (var23 != 129) {
                    var18.field1762--;
                    break;
                }
                for (int var24 = 0; var24 < 4; var24++) {
                    byte var25 = var18.method646(arg10 ^ 0xFFFFFFCE);
                    if (var25 == 0) {
                        if (arg3 >= var24) {
                            int var26 = arg8;
                            if (arg8 < 0) {
                                var26 = 0;
                            } else if (arg8 >= 104) {
                                var26 = 104;
                            }
                            int var27 = arg8 + 7;
                            if (var27 < 0) {
                                var27 = 0;
                            } else if (var27 >= 104) {
                                var27 = 104;
                            }
                            int var28 = arg5;
                            if (arg5 < 0) {
                                var28 = 0;
                            } else if (arg5 >= 104) {
                                var28 = 104;
                            }
                            int var29 = arg5 + 7;
                            if (var29 < 0) {
                                var29 = 0;
                            } else if (var29 >= 104) {
                                var29 = 104;
                            }
                            while (var26 < var27) {
                                while (var28 < var29) {
                                    class99.field1700[arg0][var26][var28] = 0;
                                    var28++;
                                }
                                var26++;
                            }
                        }
                    } else if (var25 == 1) {
                        for (int var30 = 0; var30 < 64; var30 += 4) {
                            for (int var31 = 0; var31 < 64; var31 += 4) {
                                byte var32 = var18.method646(-42);
                                if (arg3 >= var24) {
                                    for (int var33 = var30; var33 < (var30 + 4); var33++) {
                                        for (int var34 = var31; var34 < (var31 + 4); var34++) {
                                            if (var33 >= var11 && var33 < (var11 + 8) && var12 <= var34 && var12 + 8 > var12) {
                                                int var35 = class255.method1688(-98, var34 & 0x7, var33 & 0x7, arg4) + arg8;
                                                int var36 = class121.method827(var33 & 0x7, arg4, var34 & 0x7, arg10 + 2443) + arg5;
                                                if (var35 >= 0 && var35 < 104 && var36 >= 0 && var36 < 104) {
                                                    class99.field1700[arg0][var35][var36] = var32;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean var37 = false;
        if (!var37) {
            int var38 = arg8 + 7;
            int var39 = arg5 + 7;
            for (int var40 = arg8; var40 < var38; var40++) {
                for (int var41 = arg5; var41 < var39; var41++) {
                    class99.field1700[arg0][var40][var41] = 0;
                }
            }
        }
        if (var22) {
            return class296.field4700;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "([IIII)Lph;")
    private final class202 method1217(int[] arg0, int arg1, int arg2, int arg3) {
        int var5 = ((arg2 & 0x20000FFF) << 4 | arg2 >>> 12) ^ arg1;
        int var6 = var5 | arg2 << 16;
        field3003++;
        long var7 = (long) var6;
        class202 var9 = (class202) this.field3010.method779(-126, var7);
        if (var9 != null) {
            return var9;
        } else if (arg0 == null || arg0[0] > 0) {
            class218 var10 = class218.method1446(this.field2999, arg2, arg1);
            if (var10 == null) {
                return null;
            } else if (arg3 == 128) {
                class202 var11 = var10.method1448();
                this.field3010.method780((byte) -78, var7, var11);
                if (arg0 != null) {
                    arg0[0] -= var11.field3316.length;
                }
                return var11;
            } else {
                return null;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ZBZIZ)Lvh;")
    public static final class108 method1218(boolean arg0, byte arg1, boolean arg2, int arg3, boolean arg4) {
        field3009++;
        if (arg1 < 103) {
            field3002 = -21;
        }
        class126 var5 = null;
        if (class9.field100 != null) {
            var5 = new class126(arg3, class9.field100, class192.field3100[arg3], 1000000);
        }
        class55.field948[arg3] = class61.field1070.method542(var5, arg3, -24338, class194.field3136);
        if (arg4) {
            class55.field948[arg3].method950(6298);
        }
        return new class108(class55.field948[arg3], arg2, arg0);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(II)V")
    public static final void method1219(int arg0, int arg1) {
        if (arg1 != 1) {
            field3001 = null;
        }
        field3007++;
        class80 var2 = class253.field4140;
        synchronized (class253.field4140) {
            class206.field3424 = arg0;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1220(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class158 var7 = new class158();
        var7.field2656 = arg1 / 128;
        var7.field2638 = arg2 / 128;
        var7.field2652 = arg3 / 128;
        var7.field2631 = arg4 / 128;
        var7.field2649 = arg0;
        var7.field2657 = arg1;
        var7.field2647 = arg2;
        var7.field2658 = arg3;
        var7.field2651 = arg4;
        var7.field2635 = arg5;
        var7.field2644 = arg6;
        class291.field4648[class165.field2701++] = var7;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)V")
    public static void method1221(int arg0) {
        if (arg0 > 24) {
            field3001 = null;
        }
    }

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(Lvh;Lvh;)V")
    public class185(class108 arg0, class108 arg1) {
        this.field2999 = arg0;
        this.field2998 = arg1;
    }
}
