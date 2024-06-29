import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public class class338 extends class337 implements class18 {

    @OriginalMember(owner = "client!pp", name = "I", descriptor = "Z")
    private boolean field5033;

    @OriginalMember(owner = "client!pp", name = "H", descriptor = "B")
    private byte field5032;

    @OriginalMember(owner = "client!pp", name = "w", descriptor = "B")
    private byte field5021;

    @OriginalMember(owner = "client!pp", name = "Q", descriptor = "S")
    private short field5041;

    @OriginalMember(owner = "client!pp", name = "E", descriptor = "B")
    private byte field5029;

    @OriginalMember(owner = "client!pp", name = "T", descriptor = "Z")
    private boolean field5044;

    @OriginalMember(owner = "client!pp", name = "D", descriptor = "Z")
    private boolean field5028;

    @OriginalMember(owner = "client!pp", name = "K", descriptor = "Lwp;")
    private class292 field5035;

    @OriginalMember(owner = "client!pp", name = "C", descriptor = "Lqn;")
    private class380 field5027;

    @OriginalMember(owner = "client!pp", name = "V", descriptor = "Z")
    public static boolean field5046 = false;

    @OriginalMember(owner = "client!pp", name = "L", descriptor = "Lci;")
    public static class100 field5036 = class427.method2633(-13735);

    @OriginalMember(owner = "client!pp", name = "W", descriptor = "I")
    public static int field5047 = -1;

    @OriginalMember(owner = "client!pp", name = "X", descriptor = "Ljg;")
    public static class241 field5048 = new class241(50);

    @OriginalMember(owner = "client!pp", name = "v", descriptor = "I")
    public static int field5020;

    @OriginalMember(owner = "client!pp", name = "x", descriptor = "I")
    public static int field5022;

    @OriginalMember(owner = "client!pp", name = "y", descriptor = "I")
    public static int field5023;

    @OriginalMember(owner = "client!pp", name = "z", descriptor = "I")
    public static int field5024;

    @OriginalMember(owner = "client!pp", name = "A", descriptor = "I")
    public static int field5025;

    @OriginalMember(owner = "client!pp", name = "B", descriptor = "I")
    public static int field5026;

    @OriginalMember(owner = "client!pp", name = "F", descriptor = "I")
    public static int field5030;

    @OriginalMember(owner = "client!pp", name = "G", descriptor = "I")
    public static int field5031;

    @OriginalMember(owner = "client!pp", name = "J", descriptor = "I")
    public static int field5034;

    @OriginalMember(owner = "client!pp", name = "M", descriptor = "I")
    public static int field5037;

    @OriginalMember(owner = "client!pp", name = "N", descriptor = "I")
    public static int field5038;

    @OriginalMember(owner = "client!pp", name = "O", descriptor = "I")
    public static int field5039;

    @OriginalMember(owner = "client!pp", name = "P", descriptor = "I")
    public static int field5040;

    @OriginalMember(owner = "client!pp", name = "R", descriptor = "I")
    public static int field5042;

    @OriginalMember(owner = "client!pp", name = "S", descriptor = "I")
    public static int field5043;

    @OriginalMember(owner = "client!pp", name = "U", descriptor = "I")
    public static int field5045;

    // $FF: synthetic field
    @OriginalMember(owner = "client!pp", name = "Y", descriptor = "Ljava/lang/Class;")
    public static Class field5049;

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "(I)I")
    public final int method9(int arg0) {
        ++field5039;
        if (arg0 < 26) {
            this.method4(-62, -54, (class261) null, 112);
        }
        return this.field5021;
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(Ldr;I)V")
    public final void method6(class261 arg0, int arg1) {
        ++field5020;
        Object var3 = null;
        class380 var5;
        if (this.field5027 == null && this.field5028) {
            class221 var4 = this.method2066((byte) 118, arg0, true, 131072);
            var5 = var4 != null ? var4.field3366 : null;
        } else {
            var5 = this.field5027;
            this.field5027 = null;
        }
        if (arg1 >= -68) {
            field5036 = null;
        }
        if (var5 != null) {
            class85.method557(var5, this.field5029, super.field5017, super.field5013, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(IILdr;)Lwp;")
    private final class292 method2063(int arg0, int arg1, class261 arg2) {
        ++field5026;
        if (arg1 >= -101) {
            this.field5028 = false;
        }
        if (this.field5035 != null && arg2.method372(this.field5035.method1274(), arg0) == 0) {
            return this.field5035;
        } else {
            class221 var4 = this.method2066((byte) 96, arg2, false, arg0);
            return var4 == null ? null : var4.field3362;
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(B[I[I[ILwn;)V")
    public static final void method2064(byte arg0, int[] arg1, int[] arg2, int[] arg3, class155 arg4) {
        if (arg0 != 112) {
            method2067(18);
        }
        for (int var5 = 0; arg2.length > var5; ++var5) {
            int var6 = arg2[var5];
            int var7 = arg1[var5];
            int var8 = arg3[var5];
            int var9 = 0;
            while (~var7 != -1 && ~arg4.field1947.length < ~var9) {
                if (~(1 & var7) != -1) {
                    if (var6 != -1) {
                        class379 var10 = class98.method629(var6, (byte) -115);
                        int var11 = var10.field5531;
                        class410 var12 = arg4.field1947[var9];
                        if (var12 != null) {
                            if (~var12.field6105 != ~var6) {
                                if (~var10.field5536 <= ~class98.method629(var12.field6105, (byte) -115).field5536) {
                                    var12 = arg4.field1947[var9] = null;
                                }
                            } else if (var11 != 0) {
                                if (~var11 != -2) {
                                    if (~var11 == -3) {
                                        var12.field6111 = 0;
                                    }
                                } else {
                                    var12.field6102 = 0;
                                    var12.field6103 = var8;
                                    var12.field6107 = 1;
                                    var12.field6111 = 0;
                                    var12.field6106 = 0;
                                    class251.method1528(false, 0, arg4.field1892, arg4.field1900, var10, arg4.field1902, (byte) -118);
                                }
                            } else {
                                var12 = arg4.field1947[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class410 var13 = arg4.field1947[var9] = new class410();
                            var13.field6107 = 1;
                            var13.field6111 = 0;
                            var13.field6105 = var6;
                            var13.field6102 = 0;
                            var13.field6106 = 0;
                            var13.field6103 = var8;
                            class251.method1528(false, 0, arg4.field1892, arg4.field1900, var10, arg4.field1902, (byte) -118);
                        }
                    } else {
                        arg4.field1947[var9] = null;
                    }
                }
                ++var9;
                var7 >>>= 1;
            }
        }
        ++field5025;
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(B)I")
    public final int method3(byte arg0) {
        if (arg0 >= -3) {
            method2065(-49, -41, (class261) null);
        }
        ++field5024;
        return this.field5032;
    }

    @OriginalMember(owner = "client!pp", name = "c", descriptor = "(B)I")
    public final int method16(byte arg0) {
        if (arg0 >= -93) {
            this.field5028 = true;
        }
        ++field5022;
        return this.field5035 != null ? this.field5035.method1263() : 0;
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(IILdr;I)Z")
    public final boolean method4(int arg0, int arg1, class261 arg2, int arg3) {
        ++field5038;
        if (arg3 != 2) {
            this.field5028 = false;
        }
        class292 var5 = this.method2063(65536, -106, arg2);
        if (var5 != null) {
            class361 var6 = arg2.method434();
            var6.method611(super.field5017, super.field5012, super.field5013);
            return var5.method1297(arg0, arg1, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "(IILdr;)Z")
    public static final boolean method2065(int arg0, int arg1, class261 arg2) {
        ++field5040;
        int var3 = (class115.field1522 + -104) / 2;
        int var4 = (class198.field3004 + -104) / 2;
        boolean var5 = true;
        for (int var6 = var3; var3 + 104 > var6; ++var6) {
            for (int var51 = var4; ~(var4 + 104) < ~var51; ++var51) {
                for (int var52 = arg0; ~var52 >= -4; ++var52) {
                    if (class56.method319(var6, var51, arg0, (byte) 30, var52)) {
                        int var53 = var52;
                        if (class430.method2646(arg1 ^ -8576, var6, var51)) {
                            var53 = var52 - 1;
                        }
                        if (var53 >= 0) {
                            var5 &= class135.method848(var53, var51, var6, (byte) -128);
                        }
                    }
                }
            }
        }
        if (!var5) {
            return false;
        } else {
            int[] var7 = new int[262144];
            for (int var8 = 0; var7.length > var8; ++var8) {
                var7[var8] = -16777216;
            }
            class66.field856 = arg2.method401(var7, 0, 512, 512, 512);
            class21.method139(-24766);
            int var9 = -10 + (int) (Math.random() * 20.0D) + 238 + ((int) (20.0D * Math.random()) + 228 << 8) + (-10 + (int) (20.0D * Math.random()) + 238 << 16) | -16777216;
            int var10 = 228 - -((int) (20.0D * Math.random())) << 16 | -16777216;
            int var11 = (int) (Math.random() * 8.0D) | (int) (8.0D * Math.random()) << 8 | (int) (Math.random() * 8.0D) << 16;
            boolean[][] var12 = new boolean[class446.field6579][class446.field6579];
            for (int var13 = var3; ~var13 > ~(var3 - -104); var13 += class446.field6579) {
                for (int var36 = var4; ~var36 > ~(var4 + 104); var36 += class446.field6579) {
                    arg2.method436(0, 0, class446.field6579 * 4, class446.field6579 * 4);
                    arg2.method437(-16777216);
                    for (int var37 = arg0; var37 <= 3; ++var37) {
                        for (int var44 = 0; class446.field6579 > var44; ++var44) {
                            for (int var50 = 0; var50 < class446.field6579; ++var50) {
                                var12[var44][var50] = class56.method319(var13 + var44, var36 - -var50, arg0, (byte) 22, var37);
                            }
                        }
                        class85.field1201[var37].method111(0, 0, 1024, var13, var36, var13 - -class446.field6579, var36 - -class446.field6579, var12);
                        if (!class447.field6590) {
                            for (int var45 = -4; ~class446.field6579 < ~var45; ++var45) {
                                for (int var46 = -4; ~var46 > ~class446.field6579; ++var46) {
                                    int var47 = var13 - -var45;
                                    int var48 = var36 + var46;
                                    if (var47 >= var3 && var48 >= var4 && class56.method319(var47, var48, arg0, (byte) 97, var37)) {
                                        int var49 = var37;
                                        if (class430.method2646(27156, var47, var48)) {
                                            var49 = var37 - 1;
                                        }
                                        if (~var49 <= -1) {
                                            class217.method1321(arg1 + -2857, arg2, var47, var45 * 4, var10, (class446.field6579 - var46) * 4 + -4, var49, var48, var9);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (class447.field6590) {
                        class375 var38 = class449.field6599[arg0];
                        for (int var39 = 0; var39 < class446.field6579; ++var39) {
                            for (int var40 = 0; var40 < class446.field6579; ++var40) {
                                int var41 = var13 + var39;
                                int var42 = var36 + var40;
                                int var43 = var38.field5455[-var38.field5452 + var41][var42 - var38.field5456];
                                if ((1076101120 & var43) == 0) {
                                    if (~(8388608 & var43) != -1) {
                                        arg2.method1611(4, (-var40 + class446.field6579) * 4 + -4, false, var39 * 4, -1713569622);
                                    } else if (~(33554432 & var43) != -1) {
                                        arg2.method1622((class446.field6579 - var40) * 4 + -4, -1713569622, 4, var39 * 4 + 3, true);
                                    } else if ((var43 & 134217728) != 0) {
                                        arg2.method1611(4, (-var40 + class446.field6579) * 4 - 4 + 3, false, var39 * 4, -1713569622);
                                    } else if (~(var43 & 536870912) != -1) {
                                        arg2.method1622((-var40 + class446.field6579) * 4 - 4, -1713569622, 4, var39 * 4, true);
                                    }
                                } else {
                                    arg2.method1615(4, -1713569622, 4, var39 * 4, (-var40 + class446.field6579) * 4 - 4, (byte) -119);
                                }
                            }
                        }
                    }
                    arg2.method358(0, 0, class446.field6579 * 4, class446.field6579 * 4, var11, 2);
                    class66.field856.method1413((-var3 + var13) * 4 + 48, 464 - (-var4 + var36) * 4 - class446.field6579 * 4, class446.field6579 * 4, class446.field6579 * 4, 0, 0);
                }
            }
            if (arg1 != -19308) {
                method2065(39, 98, (class261) null);
            }
            arg2.method433();
            arg2.method437(-16777215);
            class141.method887((byte) -85);
            class137.field1850 = 0;
            class365.field5369.method2512((byte) 4);
            if (!class447.field6590) {
                for (int var14 = var3; ~(var3 + 104) < ~var14; ++var14) {
                    for (int var20 = var4; ~(var4 + 104) < ~var20; ++var20) {
                        for (int var21 = arg0; ~var21 >= ~(arg0 + 1) && ~var21 >= -4; ++var21) {
                            if (class56.method319(var14, var20, arg0, (byte) 35, var21)) {
                                class18 var22 = (class18) class386.method2385(var21, var14, var20);
                                if (var22 == null) {
                                    var22 = (class18) class51.method293(var21, var14, var20, field5049 != null ? field5049 : (field5049 = method2068("rc")));
                                }
                                if (var22 == null) {
                                    var22 = (class18) class37.method211(var21, var14, var20);
                                }
                                if (var22 == null) {
                                    var22 = (class18) class213.method1245(var21, var14, var20);
                                }
                                if (var22 != null) {
                                    class85 var23 = class411.method2575(arg1 ^ -19308, var22.method7(true));
                                    if (!var23.field1138 || class66.field859) {
                                        int var24 = var23.field1132;
                                        if (var23.field1133 != null) {
                                            for (int var25 = 0; ~var23.field1133.length < ~var25; ++var25) {
                                                if (~var23.field1133[var25] != 0) {
                                                    class85 var26 = class411.method2575(arg1 + 19308, var23.field1133[var25]);
                                                    if (~var26.field1132 <= -1) {
                                                        var24 = var26.field1132;
                                                    }
                                                }
                                            }
                                        }
                                        if (var24 >= 0) {
                                            boolean var27 = false;
                                            if (var24 >= 0) {
                                                class228 var28 = class20.method125(var24, 36);
                                                if (var28 != null && var28.field3457) {
                                                    var27 = true;
                                                }
                                            }
                                            int var29 = var14;
                                            int var30 = var20;
                                            if (var27) {
                                                int[][] var31 = class449.field6599[var21].field5455;
                                                int var32 = class449.field6599[var21].field5452;
                                                int var33 = class449.field6599[var21].field5456;
                                                for (int var34 = 0; ~var34 > -11; ++var34) {
                                                    int var35 = (int) (4.0D * Math.random());
                                                    if (~var35 == -1 && ~var29 < ~var3 && var29 > var14 + -3 && (2883848 & var31[-var32 + var29 + -1][var30 - var33]) == 0) {
                                                        --var29;
                                                    }
                                                    if (var35 == 1 && var3 + -1 + 104 > var29 && var29 < var14 - -3 && ~(var31[-var32 + 1 + var29][var30 - var33] & 2883968) == -1) {
                                                        ++var29;
                                                    }
                                                    if (var35 == 2 && var30 > var4 && var20 + -3 < var30 && ~(var31[var29 - var32][var30 + -1 + -var33] & 2883842) == -1) {
                                                        --var30;
                                                    }
                                                    if (~var35 == -4 && var30 < var4 + 103 && ~(var20 + 3) < ~var30 && (var31[-var32 + var29][var30 - -1 - var33] & 2883872) == 0) {
                                                        ++var30;
                                                    }
                                                }
                                            }
                                            class184.field2771[class137.field1850] = var23.field1156;
                                            class14.field178[class137.field1850] = var29;
                                            class390.field5758[class137.field1850] = var30;
                                            ++class137.field1850;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (class430.field6325 != null) {
                    class296.field4494.field1767 = 1;
                    class238.method1432(64, arg1 + 19307, 1024);
                    for (int var15 = 0; class430.field6325.field5506 > var15; ++var15) {
                        int var16 = class430.field6325.field5512[var15];
                        if (~(var16 >> 28) == ~class113.field1500.field1902) {
                            int var17 = (var16 >> 14 & 16383) + -class17.field250;
                            int var18 = (var16 & 16383) + -class112.field1487;
                            if (var17 >= 0 && ~var17 > ~class115.field1522 && var18 >= 0 && class198.field3004 > var18) {
                                class365.field5369.method2504(42, new class350(var15));
                            } else {
                                class228 var19 = class20.method125(class430.field6325.field5509[var15], 36);
                                if (var19.field3474 != null && var19.field3484 + var17 >= 0 && class115.field1522 > var17 - -var19.field3460 && var19.field3476 + var18 >= 0 && var19.field3485 + var18 < class198.field3004) {
                                    class365.field5369.method2504(arg1 ^ -19266, new class350(var15));
                                }
                            }
                        }
                    }
                    class238.method1432(64, -1, 128);
                    class296.field4494.field1767 = 2;
                    class296.field4494.method818(-65);
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(BLdr;)V")
    public final void method2(byte arg0, class261 arg1) {
        ++field5042;
        Object var3 = null;
        class380 var5;
        if (this.field5027 == null && this.field5028) {
            class221 var4 = this.method2066((byte) 89, arg1, true, 131072);
            var5 = var4 != null ? var4.field3366 : null;
        } else {
            var5 = this.field5027;
            this.field5027 = null;
        }
        if (arg0 == 76) {
            if (var5 != null) {
                class177.method1080(var5, this.field5029, super.field5017, super.field5013, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!pp", name = "d", descriptor = "(Ldr;I)Lkq;")
    public final class70 method10(class261 arg0, int arg1) {
        ++field5037;
        if (this.field5035 == null) {
            return null;
        } else {
            class361 var3 = arg0.method434();
            var3.method611(super.field5017 + super.field5010, super.field5012, super.field5013 - -super.field5014);
            if (arg1 != 7) {
                return null;
            } else {
                class70 var4 = null;
                if (this.field5033) {
                    var4 = class383.method2309(arg1 ^ 80, 1);
                }
                this.field5035.method1282(var3, var4 == null ? null : var4.field899[0], 0);
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!pp", name = "c", descriptor = "(I)V")
    public final void method11(int arg0) {
        ++field5023;
        if (arg0 != -21910) {
            field5048 = null;
        }
        if (this.field5035 != null) {
            this.field5035.method1249();
        }
    }

    @OriginalMember(owner = "client!pp", name = "<init>", descriptor = "(Ldr;Lfq;IIIIZIIIII)V")
    public class338(class261 arg0, class85 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg3, arg4, arg5, arg7, arg8, arg9, class120.method722(arg10, arg11, -20999));
        this.field5033 = ~arg1.field1184 != -1 && !arg6;
        this.field5032 = (byte) arg11;
        this.field5021 = (byte) arg10;
        super.field5017 = (short) arg3;
        this.field5041 = (short) arg1.field1156;
        this.field5029 = (byte) arg2;
        super.field5013 = (short) arg5;
        this.field5044 = arg6;
        this.field5028 = arg0.method427() && arg1.field1158 && !this.field5044 && class97.field1334 != 0;
        class221 var13 = this.method2066((byte) 93, arg0, this.field5028, 1024);
        if (var13 != null) {
            this.field5035 = var13.field3362;
            this.field5027 = var13.field3366;
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(BLdr;ZI)Luq;")
    private final class221 method2066(byte arg0, class261 arg1, boolean arg2, int arg3) {
        ++field5045;
        class85 var5 = class411.method2575(0, this.field5041 & 65535);
        if (arg0 <= 77) {
            return null;
        } else {
            class143 var6;
            class143 var7;
            if (this.field5044) {
                var6 = class154.field2118[this.field5029];
                var7 = class85.field1201[0];
            } else {
                if (this.field5029 < 3) {
                    var7 = class85.field1201[this.field5029 + 1];
                } else {
                    var7 = null;
                }
                var6 = class85.field1201[this.field5029];
            }
            return var5.method538(var7, -102, super.field5013, this.field5032, this.field5021, var6, arg3, super.field5012, arg1, super.field5017, arg2);
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(I)Z")
    public final boolean method1(int arg0) {
        ++field5030;
        int var2 = -76 % ((arg0 - -1) / 46);
        return this.field5028;
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(Z)I")
    public final int method7(boolean arg0) {
        ++field5043;
        if (!arg0) {
            this.method2((byte) -51, (class261) null);
        }
        return 65535 & this.field5041;
    }

    @OriginalMember(owner = "client!pp", name = "e", descriptor = "(I)V")
    public static void method2067(int arg0) {
        field5036 = null;
        field5048 = null;
        if (arg0 != 6000) {
            method2065(113, -20, (class261) null);
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(Ldr;IB)Lwp;")
    public final class292 method12(class261 arg0, int arg1, byte arg2) {
        ++field5034;
        int var4 = -83 / ((arg2 - 46) / 47);
        return this.method2063(arg1, -117, arg0);
    }

    @OriginalMember(owner = "client!pp", name = "c", descriptor = "(Ldr;I)V")
    public final void method15(class261 arg0, int arg1) {
        ++field5031;
        if (arg1 <= 114) {
            field5036 = null;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2068(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
