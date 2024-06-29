import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class165 extends class145 {

    @OriginalMember(owner = "client!de", name = "F", descriptor = "I")
    private int field2420 = 0;

    @OriginalMember(owner = "client!de", name = "P", descriptor = "I")
    private int field2430 = 1024;

    @OriginalMember(owner = "client!de", name = "U", descriptor = "I")
    private int field2435 = 409;

    @OriginalMember(owner = "client!de", name = "K", descriptor = "I")
    private int field2425 = 1024;

    @OriginalMember(owner = "client!de", name = "T", descriptor = "I")
    private int field2434 = 1024;

    @OriginalMember(owner = "client!de", name = "Y", descriptor = "I")
    private int field2439 = 819;

    @OriginalMember(owner = "client!de", name = "Z", descriptor = "I")
    private int field2440 = 2048;

    @OriginalMember(owner = "client!de", name = "I", descriptor = "I")
    private int field2423 = 0;

    @OriginalMember(owner = "client!de", name = "W", descriptor = "I")
    private int field2437 = 1024;

    @OriginalMember(owner = "client!de", name = "S", descriptor = "I")
    public static int field2433 = 1;

    @OriginalMember(owner = "client!de", name = "Q", descriptor = "I")
    public static int field2431 = 0;

    @OriginalMember(owner = "client!de", name = "db", descriptor = "Ljava/lang/String;")
    public static String field2444 = "Connected to update server";

    @OriginalMember(owner = "client!de", name = "G", descriptor = "I")
    public static int field2421;

    @OriginalMember(owner = "client!de", name = "H", descriptor = "I")
    private int field2422;

    @OriginalMember(owner = "client!de", name = "L", descriptor = "I")
    public static int field2426;

    @OriginalMember(owner = "client!de", name = "M", descriptor = "I")
    public static int field2427;

    @OriginalMember(owner = "client!de", name = "N", descriptor = "I")
    public static int field2428;

    @OriginalMember(owner = "client!de", name = "O", descriptor = "I")
    public static int field2429;

    @OriginalMember(owner = "client!de", name = "R", descriptor = "I")
    public static int field2432;

    @OriginalMember(owner = "client!de", name = "V", descriptor = "I")
    public static int field2436;

    @OriginalMember(owner = "client!de", name = "X", descriptor = "I")
    public static int field2438;

    @OriginalMember(owner = "client!de", name = "ab", descriptor = "I")
    public static int field2441;

    @OriginalMember(owner = "client!de", name = "bb", descriptor = "I")
    public static int field2442;

    @OriginalMember(owner = "client!de", name = "cb", descriptor = "I")
    public static int field2443;

    @OriginalMember(owner = "client!de", name = "J", descriptor = "Lud;")
    public static class2 field2424;

    @OriginalMember(owner = "client!de", name = "d", descriptor = "(B)V", line = 5)
    public final void method87(byte arg0) {
        if (arg0 != 77) {
            this.field2434 = -21;
        }
        ++field2443;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Lap;BI)V", line = 15)
    public final void method2(class289 arg0, byte arg1, int arg2) {
        ++field2441;
        int var4 = 104 / ((11 - arg1) / 52);
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (~arg2 != -3) {
                    if (~arg2 != -4) {
                        if (arg2 != 4) {
                            if (arg2 != 5) {
                                if (~arg2 != -7) {
                                    if (arg2 != 7) {
                                        if (~arg2 == -9) {
                                            this.field2437 = arg0.method1853(-83);
                                        }
                                    } else {
                                        this.field2434 = arg0.method1853(88);
                                    }
                                } else {
                                    this.field2423 = arg0.method1861((byte) -72);
                                }
                            } else {
                                this.field2430 = arg0.method1853(96);
                            }
                        } else {
                            this.field2439 = arg0.method1853(127);
                        }
                    } else {
                        this.field2435 = arg0.method1853(123);
                    }
                } else {
                    this.field2440 = arg0.method1853(97);
                }
            } else {
                this.field2425 = arg0.method1853(-21);
            }
        } else {
            this.field2420 = arg0.method1861((byte) -72);
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IB)V", line = 109)
    public static final void method1225(int arg0, byte arg1) {
        ++field2438;
        if (arg1 != 60) {
            field2433 = -109;
        }
        class450 var2 = class59.method540(4, arg0, 1000);
        var2.method2798(arg1 + -664529038);
    }

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "()V", line = 123)
    public class165() {
        super(0, true);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Lrk;I)V", line = 129)
    public static final void method1226(class427 arg0, int arg1) {
        ++field2421;
        class109.field1585 = arg0;
        class212.field2943 = class109.field1585.method2626(arg1, 52);
    }

    @OriginalMember(owner = "client!de", name = "e", descriptor = "(I)V", line = 148)
    public static final void method1227(int arg0) {
        ++field2442;
        int var1 = 32 / ((79 - arg0) / 44);
        for (class128 var2 = (class128) class399.field5584.method1240((byte) -95); var2 != null; var2 = (class128) class399.field5584.method1245(1)) {
            if (var2.field1812 == -1) {
                var2.field1822 = 0;
                class3.method14(102, var2);
            } else {
                var2.method2367(5);
            }
        }
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(II)I", line = 172)
    public static final int method1228(int arg0, int arg1) {
        ++field2429;
        if (arg1 != 14761) {
            field2444 = null;
        }
        return 127 & arg0;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(II)[I", line = 184)
    public final int[] method3(int arg0, int arg1) {
        ++field2428;
        int[] var3 = super.field2218.method1614(117, arg0);
        int var4 = 113 % ((16 - arg1) / 49);
        if (super.field2218.field3396) {
            int[][] var5 = super.field2218.method1610(0);
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            int var10 = 0;
            boolean var11 = true;
            boolean var12 = true;
            int var13 = 0;
            int var14 = 0;
            int var15 = class156.field2364 * this.field2425 >> 12;
            int var16 = class156.field2364 * this.field2440 >> 12;
            int var17 = class81.field1209 * this.field2435 >> 12;
            int var18 = class81.field1209 * this.field2439 >> 12;
            if (~var18 >= -2) {
                return var5[arg0];
            } else {
                this.field2422 = class156.field2364 / 8 * this.field2430 >> 12;
                int var19 = class156.field2364 / var15 + 1;
                int[][] var20 = new int[var19][3];
                int[][] var21 = new int[var19][3];
                Random var22 = new Random((long) this.field2420);
                while (true) {
                    while (true) {
                        int var23 = class283.method1785((byte) 23, -var15 + var16, var22) + var15;
                        int var24 = class283.method1785((byte) 23, var18 - var17, var22) + var17;
                        int var25 = var9 + var23;
                        if (~var25 < ~class156.field2364) {
                            var23 = -var9 + class156.field2364;
                            var25 = class156.field2364;
                        }
                        int var31;
                        if (var12) {
                            var31 = 0;
                        } else {
                            int var26 = var10;
                            int[] var27 = var21[var10];
                            int var28 = 0;
                            int var29 = var6 + var25;
                            if (var29 < 0) {
                                var29 += class156.field2364;
                            }
                            if (var29 > class156.field2364) {
                                var29 -= class156.field2364;
                            }
                            while (true) {
                                int[] var30 = var21[var26];
                                if (~var30[0] >= ~var29 && ~var29 >= ~var30[1]) {
                                    var31 = var27[2];
                                    if (var10 != var26) {
                                        int var32 = var6 + var9;
                                        if (~var32 > -1) {
                                            var32 += class156.field2364;
                                        }
                                        if (~var32 < ~class156.field2364) {
                                            var32 -= class156.field2364;
                                        }
                                        for (int var33 = 1; ~var28 <= ~var33; ++var33) {
                                            int[] var41 = var21[(var10 + var33) % var13];
                                            var31 = Math.max(var31, var41[2]);
                                        }
                                        for (int var34 = 0; var28 >= var34; ++var34) {
                                            int[] var35 = var21[(var10 + var34) % var13];
                                            int var36 = var35[2];
                                            if (var31 != var36) {
                                                int var37 = var35[0];
                                                int var38 = var35[1];
                                                int var39;
                                                int var40;
                                                if (var29 > var32) {
                                                    var39 = Math.max(var32, var37);
                                                    var40 = Math.min(var29, var38);
                                                } else if (var37 != 0) {
                                                    var39 = Math.max(var32, var37);
                                                    var40 = class156.field2364;
                                                } else {
                                                    var39 = 0;
                                                    var40 = Math.min(var29, var38);
                                                }
                                                this.method1233(-963571924, var8 + var39, var31 - var36, var5, var36, -var39 + var40, var22);
                                            }
                                        }
                                    }
                                    var10 = var26;
                                    break;
                                }
                                ++var26;
                                if (var13 <= var26) {
                                    var26 = 0;
                                }
                                ++var28;
                            }
                        }
                        if (~(var31 - -var24) >= ~class81.field1209) {
                            var11 = false;
                        } else {
                            var24 = -var31 + class81.field1209;
                        }
                        if (class156.field2364 == var25) {
                            this.method1233(-963571924, var7 + var9, var24, var5, var31, var23, var22);
                            if (var11) {
                                return var3;
                            }
                            var11 = true;
                            int[] var42 = var20[var14++];
                            var42[1] = var25;
                            var42[0] = var9;
                            var42[2] = var24 + var31;
                            int[][] var43 = var21;
                            var21 = var20;
                            var20 = var43;
                            var13 = var14;
                            var8 = var7;
                            var14 = 0;
                            var7 = class283.method1785((byte) 23, class156.field2364, var22);
                            var6 = var7 - var8;
                            var9 = 0;
                            int var44 = var6;
                            if (~var6 > -1) {
                                var44 = class156.field2364 + var6;
                            }
                            if (class156.field2364 < var44) {
                                var44 -= class156.field2364;
                            }
                            var10 = 0;
                            var12 = false;
                            while (true) {
                                int[] var45 = var21[var10];
                                if (var44 >= var45[0] && ~var45[1] <= ~var44) {
                                    break;
                                }
                                ++var10;
                                if (var13 <= var10) {
                                    var10 = 0;
                                }
                            }
                        } else {
                            int[] var46 = var20[var14++];
                            var46[1] = var25;
                            var46[2] = var24 + var31;
                            var46[0] = var9;
                            this.method1233(-963571924, var7 + var9, var24, var5, var31, var23, var22);
                            var9 = var25;
                        }
                    }
                }
            }
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!de", name = "e", descriptor = "(B)V", line = 442)
    public static void method1229(byte arg0) {
        field2444 = null;
        if (arg0 < 40) {
            field2444 = null;
        }
        field2424 = null;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ICB)C", line = 453)
    public static final char method1230(int arg0, char arg1, byte arg2) {
        ++field2427;
        if (arg1 >= 192 && arg1 <= 255) {
            if (~arg1 <= -193 && arg1 <= 198) {
                return 'A';
            }
            if (arg1 == 199) {
                return 'C';
            }
            if (arg1 >= 200 && arg1 <= 203) {
                return 'E';
            }
            if (arg1 >= 204 && arg1 <= 207) {
                return 'I';
            }
            if (arg1 == 209 && ~arg0 != -1) {
                return 'N';
            }
            if (~arg1 <= -211 && ~arg1 >= -215) {
                return 'O';
            }
            if (arg1 >= 217 && arg1 <= 220) {
                return 'U';
            }
            if (~arg1 == -222) {
                return 'Y';
            }
            if (arg1 == 223) {
                return 's';
            }
            if (~arg1 <= -225 && ~arg1 >= -231) {
                return 'a';
            }
            if (arg1 == 231) {
                return 'c';
            }
            if (arg1 >= 232 && ~arg1 >= -236) {
                return 'e';
            }
            if (arg1 >= 236 && arg1 <= 239) {
                return 'i';
            }
            if (arg1 == 241 && ~arg0 != -1) {
                return 'n';
            }
            if (~arg1 <= -243 && arg1 <= 246) {
                return 'o';
            }
            if (~arg1 <= -250 && arg1 <= 252) {
                return 'u';
            }
            if (~arg1 == -254 || arg1 == 255) {
                return 'y';
            }
        }
        if (arg2 != -15) {
            field2424 = null;
        }
        if (~arg1 == -339) {
            return 'O';
        } else if (arg1 == 339) {
            return 'o';
        } else if (~arg1 == -377) {
            return 'Y';
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IIILcc;)V", line = 553)
    public static final void method1231(int arg0, int arg1, int arg2, class338 arg3) {
        if (arg2 < 61) {
            field2444 = null;
        }
        if (arg3.field4980 == arg1 && arg1 != -1) {
            class209 var4 = class288.method1819(arg1, (byte) 105);
            int var5 = var4.field2917;
            if (var5 == 1) {
                arg3.field4993 = 1;
                arg3.field4934 = arg0;
                arg3.field4959 = 0;
                arg3.field4985 = 0;
                arg3.field4962 = 0;
                class232.method1547(13238, var4, arg3.field3167, class95.field1379 == arg3, arg3.field4959, arg3.field3176);
            }
            if (var5 == 2) {
                arg3.field4962 = 0;
            }
        } else if (~arg1 == 0 || arg3.field4980 == -1 || ~class288.method1819(arg1, (byte) 105).field2906 <= ~class288.method1819(arg3.field4980, (byte) 105).field2906) {
            arg3.field4999 = arg3.field5009;
            arg3.field4985 = 0;
            arg3.field4962 = 0;
            arg3.field4959 = 0;
            arg3.field4934 = arg0;
            arg3.field4993 = 1;
            arg3.field4980 = arg1;
            if (~arg3.field4980 != 0) {
                class232.method1547(13238, class288.method1819(arg3.field4980, (byte) 105), arg3.field3167, class95.field1379 == arg3, arg3.field4959, arg3.field3176);
            }
        }
        ++field2432;
    }

    @OriginalMember(owner = "client!de", name = "f", descriptor = "(I)V", line = 606)
    public static final void method1232(int arg0) {
        if (class406.field5635 != arg0) {
            class275.method1762(-1, false, 0, class406.field5635, -1);
            class406.field5635 = -1;
        }
        ++field2426;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(III[[IIILjava/util/Random;)V", line = 632)
    private final void method1233(int arg0, int arg1, int arg2, int[][] arg3, int arg4, int arg5, Random arg6) {
        ++field2436;
        int var8 = ~this.field2437 >= -1 ? 4096 : -class283.method1785((byte) 23, this.field2437, arg6) + 4096;
        int var9 = this.field2434 * this.field2422 >> 12;
        int var10 = this.field2422 - (var9 <= 0 ? 0 : class283.method1785((byte) 23, var9, arg6));
        if (~class156.field2364 >= ~arg1) {
            arg1 -= class156.field2364;
        }
        if (arg0 == -963571924) {
            if (var10 <= 0) {
                if (class156.field2364 < arg1 + arg5) {
                    int var11 = -arg1 + class156.field2364;
                    for (int var12 = 0; var12 < arg2; ++var12) {
                        int[] var13 = arg3[arg4 + var12];
                        class152.method1171(var13, arg1, var11, var8);
                        class152.method1171(var13, 0, -var11 + arg5, var8);
                    }
                } else {
                    for (int var14 = 0; ~arg2 < ~var14; ++var14) {
                        class152.method1171(arg3[arg4 + var14], arg1, arg5, var8);
                    }
                }
            } else if (arg2 > 0 && arg5 > 0) {
                int var15 = arg5 / 2;
                int var16 = arg2 / 2;
                int var17 = ~var15 > ~var10 ? var15 : var10;
                int var18 = var10 > var16 ? var16 : var10;
                int var19 = arg1 + var17;
                int var20 = arg5 - var17 * 2;
                for (int var21 = 0; arg2 > var21; ++var21) {
                    int[] var22 = arg3[var21 - -arg4];
                    if (var18 > var21) {
                        int var23 = var8 * var21 / var18;
                        if (~this.field2423 != -1) {
                            for (int var24 = 0; ~var17 < ~var24; ++var24) {
                                int var25 = var8 * var24 / var17;
                                var22[class323.method2059(class40.field606, arg1 - -var24)] = var22[class323.method2059(-var24 + -1 + arg1 + arg5, class40.field606)] = ~var23 >= ~var25 ? var23 : var25;
                            }
                        } else {
                            for (int var26 = 0; var17 > var26; ++var26) {
                                int var28 = var8 * var26 / var17;
                                var22[class323.method2059(class40.field606, arg1 - -var26)] = var22[class323.method2059(class40.field606, arg1 + arg5 - var26 + -1)] = var23 * var28 >> 12;
                            }
                        }
                        if (~class156.field2364 > ~(var19 + var20)) {
                            int var27 = -var19 + class156.field2364;
                            class152.method1171(var22, var19, var27, var23);
                            class152.method1171(var22, 0, var20 - var27, var23);
                        } else {
                            class152.method1171(var22, var19, var20, var23);
                        }
                    } else {
                        int var29 = arg2 + -1 + -var21;
                        if (~var18 < ~var29) {
                            int var30 = var8 * var29 / var18;
                            if (~this.field2423 != -1) {
                                for (int var31 = 0; ~var31 > ~var17; ++var31) {
                                    int var32 = var8 * var31 / var17;
                                    var22[class323.method2059(class40.field606, arg1 + var31)] = var22[class323.method2059(arg1 + arg5 + -var31 + -1, class40.field606)] = ~var32 > ~var30 ? var32 : var30;
                                }
                            } else {
                                for (int var33 = 0; ~var17 < ~var33; ++var33) {
                                    int var35 = var8 * var33 / var17;
                                    var22[class323.method2059(arg1 + var33, class40.field606)] = var22[class323.method2059(arg1 - -arg5 + -var33 - 1, class40.field606)] = var30 * var35 >> 12;
                                }
                            }
                            if (~(var19 + var20) >= ~class156.field2364) {
                                class152.method1171(var22, var19, var20, var30);
                            } else {
                                int var34 = -var19 + class156.field2364;
                                class152.method1171(var22, var19, var34, var30);
                                class152.method1171(var22, 0, -var34 + var20, var30);
                            }
                        } else {
                            for (int var36 = 0; var17 > var36; ++var36) {
                                var22[class323.method2059(arg1 + var36, class40.field606)] = var22[class323.method2059(arg5 + -1 + arg1 + -var36, class40.field606)] = var8 * var36 / var17;
                            }
                            if (var19 - -var20 <= class156.field2364) {
                                class152.method1171(var22, var19, var20, var8);
                            } else {
                                int var37 = -var19 + class156.field2364;
                                class152.method1171(var22, var19, var37, var8);
                                class152.method1171(var22, 0, -var37 + var20, var8);
                            }
                        }
                    }
                }
            }
        }
    }
}
