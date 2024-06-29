import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class191 extends class87 {

    @OriginalMember(owner = "client!qe", name = "J", descriptor = "I")
    private int field2820 = 0;

    @OriginalMember(owner = "client!qe", name = "H", descriptor = "I")
    private int field2819 = 4096;

    @OriginalMember(owner = "client!qe", name = "M", descriptor = "Z")
    public static boolean field2823 = false;

    @OriginalMember(owner = "client!qe", name = "R", descriptor = "Z")
    public static boolean field2828 = false;

    @OriginalMember(owner = "client!qe", name = "G", descriptor = "I")
    public static int field2818;

    @OriginalMember(owner = "client!qe", name = "K", descriptor = "I")
    public static int field2821;

    @OriginalMember(owner = "client!qe", name = "L", descriptor = "I")
    public static int field2822;

    @OriginalMember(owner = "client!qe", name = "N", descriptor = "I")
    public static int field2824;

    @OriginalMember(owner = "client!qe", name = "O", descriptor = "I")
    public static int field2825;

    @OriginalMember(owner = "client!qe", name = "P", descriptor = "I")
    public static int field2826;

    @OriginalMember(owner = "client!qe", name = "S", descriptor = "I")
    public static int field2829;

    @OriginalMember(owner = "client!qe", name = "T", descriptor = "I")
    public static int field2830;

    @OriginalMember(owner = "client!qe", name = "U", descriptor = "I")
    public static int field2831;

    @OriginalMember(owner = "client!qe", name = "Q", descriptor = "Llc;")
    public static class270 field2827;

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(II)V")
    public static final void method1353(int arg0, int arg1) {
        ++field2825;
        if (~arg1 != 0) {
            if (class309.method2092(91923, arg1)) {
                class263[] var2 = class134.field2195[arg1];
                for (int var3 = arg0; ~var2.length < ~var3; ++var3) {
                    class263 var4 = var2[var3];
                    if (var4.field4068 != null) {
                        class234 var5 = new class234();
                        var5.field3423 = var4;
                        var5.field3419 = var4.field4068;
                        class170.method1212(var5, arg0 + 57, 2000000);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "()V")
    public class191() {
        super(1, true);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIBZZ)V")
    public static final void method1354(int arg0, int arg1, byte arg2, boolean arg3, boolean arg4) {
        class63.method483(arg3, arg0, 0, arg4, class290.field4625.length + -1, false, arg1);
        int var5 = 16 % ((-19 - arg2) / 41);
        ++field2831;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lhc;II)V")
    public final void method40(class53 arg0, int arg1, int arg2) {
        if (arg2 != 25645) {
            method1354(-114, -56, (byte) 53, false, true);
        }
        if (arg1 != 0) {
            if (arg1 == 1) {
                this.field2819 = arg0.method331(-114);
            }
        } else {
            this.field2820 = arg0.method331(-90);
        }
        ++field2822;
    }

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "(B)Ldj;")
    public static final class138 method1355(byte arg0) {
        if (arg0 >= -77) {
            method1353(-30, -117);
        }
        ++field2829;
        class176 var1 = new class176(class250.field3792, class19.field202, class32.field399[0], class297.field4765[0], class165.field2534[0], class283.field4559[0], class280.field4506[0], class53.field748);
        class137.method1032(-126);
        return var1;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IZ)[I")
    public final int[] method37(int arg0, boolean arg1) {
        ++field2826;
        int[] var3 = super.field1378.method319(arg0, arg1);
        if (super.field1378.field733) {
            int[] var4 = this.method642(0, arg0, true);
            for (int var5 = 0; var5 < class206.field3032; ++var5) {
                int var6 = var4[var5];
                var3[var5] = ~var6 <= ~this.field2820 && ~var6 >= ~this.field2819 ? 4096 : 0;
            }
        }
        return arg1 ? null : var3;
    }

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "(I)V")
    public static void method1356(int arg0) {
        field2827 = null;
        if (arg0 != 32) {
            field2828 = true;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IC)Z")
    public static final boolean method1357(int arg0, char arg1) {
        ++field2824;
        if (arg0 != 1691) {
            field2823 = false;
        }
        if ((arg1 <= 0 || arg1 >= 128) && (~arg1 > -161 || ~arg1 < -256)) {
            if (~arg1 != -1) {
                char[] var2 = class217.field3177;
                for (int var3 = 0; ~var2.length < ~var3; ++var3) {
                    char var4 = var2[var3];
                    if (~arg1 == ~var4) {
                        return true;
                    }
                }
            }
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IBIILmh;)V")
    public static final void method1358(int arg0, byte arg1, int arg2, int arg3, class263 arg4) {
        ++field2821;
        class52.method316((byte) -107);
        class130.method982(arg0, arg3, arg0 - -arg4.field4215, arg4.field4046 + arg3);
        if (arg1 >= -89) {
            field2823 = true;
        }
        if (class201.field2963 != 2 && ~class201.field2963 != -6 && class308.field4968 != null) {
            int var5 = 2047 & (int) class102.field1736 + class267.field4279;
            int var6 = class213.field3139.field3660 / 32 + 48;
            int var7 = 464 - class213.field3139.field3753 / 32;
            ((class148) class308.field4968).method865(arg0, arg3, arg4.field4215, arg4.field4046, var6, var7, var5, 256 - -class131.field2168, arg4.field4220, arg4.field4168);
            if (class199.field2937 != null) {
                for (int var8 = 0; class199.field2937.field149 > var8; ++var8) {
                    if (class199.field2937.field157[var8] != null && class199.field2937.field156[var8] >> 28 == class37.field474) {
                        int var9 = (16383 & class199.field2937.field156[var8] >> 14) + -class163.field2520;
                        int var10 = (16383 & class199.field2937.field156[var8]) + -class149.field2390;
                        if (var9 >= 0 && var9 < 104 && var10 >= 0 && var10 < 104) {
                            int var11 = var10 * 4 + -(class213.field3139.field3753 / 32) + 2;
                            int var12 = var9 * 4 + 2 + -(class213.field3139.field3660 / 32);
                            class217.method1511(class199.field2937.field157[var8].field2466, arg0, arg4, var12, arg3, 4, var11);
                        }
                    }
                }
            }
            for (int var13 = 0; class99.field1680 > var13; ++var13) {
                int var50 = class301.field4875[var13] * 4 + -(class213.field3139.field3660 / 32) + 2;
                int var51 = class209.field3098[var13] * 4 + 2 - class213.field3139.field3753 / 32;
                class93 var52 = class48.method297(false, class40.field538[var13]);
                if (var52.field1528 != null) {
                    var52 = var52.method710(0);
                    if (var52 == null || ~var52.field1571 == 0) {
                        continue;
                    }
                }
                class217.method1511(var52.field1571, arg0, arg4, var50, arg3, 4, var51);
            }
            for (int var14 = 0; var14 < 104; ++var14) {
                for (int var46 = 0; var46 < 104; ++var46) {
                    class2 var47 = class37.field475[class37.field474][var14][var46];
                    if (var47 != null) {
                        int var48 = var14 * 4 + -(class213.field3139.field3660 / 32) + 2;
                        int var49 = var46 * 4 + -(class213.field3139.field3753 / 32) + 2;
                        class238.method1636(var49, 27191, arg3, var48, arg4, arg0, class292.field4648[0]);
                    }
                }
            }
            for (int var15 = 0; ~class12.field135 < ~var15; ++var15) {
                class12 var42 = class255.field3856[class14.field159[var15]];
                if (var42 != null && var42.method91(118)) {
                    class102 var43 = var42.field137;
                    if (var43 != null && var43.field1752 != null) {
                        var43 = var43.method795(65535);
                    }
                    if (var43 != null && var43.field1773 && var43.field1755) {
                        int var44 = var42.field3660 / 32 + -(class213.field3139.field3660 / 32);
                        int var45 = var42.field3753 / 32 + -(class213.field3139.field3753 / 32);
                        if (~var43.field1786 == 0) {
                            class238.method1636(var45, 27191, arg3, var44, arg4, arg0, class292.field4648[1]);
                        } else {
                            class217.method1511(var43.field1786, arg0, arg4, var44, arg3, 4, var45);
                        }
                    }
                }
            }
            for (int var16 = 0; ~class103.field1791 < ~var16; ++var16) {
                class207 var32 = class92.field1475[class162.field2518[var16]];
                if (var32 != null && var32.method91(46)) {
                    int var33 = var32.field3660 / 32 + -(class213.field3139.field3660 / 32);
                    boolean var34 = false;
                    int var35 = var32.field3753 / 32 + -(class213.field3139.field3753 / 32);
                    long var36 = class143.method1064((byte) -116, var32.field3069);
                    for (int var38 = 0; ~class110.field1832 < ~var38; ++var38) {
                        if (class245.field3605[var38] == var36 && class268.field4315[var38] != 0) {
                            var34 = true;
                            break;
                        }
                    }
                    boolean var39 = false;
                    for (int var40 = 0; class78.field1261 > var40; ++var40) {
                        if (~class62.field939[var40].field4008 == ~var36) {
                            var39 = true;
                            break;
                        }
                    }
                    boolean var41 = false;
                    if (class213.field3139.field3058 != 0 && ~var32.field3058 != -1 && class213.field3139.field3058 == var32.field3058) {
                        var41 = true;
                    }
                    if (!var34) {
                        if (!var39) {
                            if (!var41) {
                                class238.method1636(var35, 27191, arg3, var33, arg4, arg0, class292.field4648[2]);
                            } else {
                                class238.method1636(var35, 27191, arg3, var33, arg4, arg0, class292.field4648[4]);
                            }
                        } else {
                            class238.method1636(var35, 27191, arg3, var33, arg4, arg0, class292.field4648[5]);
                        }
                    } else {
                        class238.method1636(var35, 27191, arg3, var33, arg4, arg0, class292.field4648[3]);
                    }
                }
            }
            class147[] var17 = class142.field2301;
            for (int var18 = 0; ~var17.length < ~var18; ++var18) {
                class147 var21 = var17[var18];
                if (var21 != null && ~var21.field2362 != -1 && ~(class199.field2930 % 20) > -11) {
                    if (var21.field2362 == 1 && var21.field2367 >= 0 && var21.field2367 < class255.field3856.length) {
                        class12 var22 = class255.field3856[var21.field2367];
                        if (var22 != null) {
                            int var23 = var22.field3660 / 32 + -(class213.field3139.field3660 / 32);
                            int var24 = var22.field3753 / 32 + -(class213.field3139.field3753 / 32);
                            class33.method216(var24, 360000, var23, arg3, (byte) -44, arg0, arg4, var21.field2364);
                        }
                    }
                    if (~var21.field2362 == -3) {
                        int var25 = (-class163.field2520 + var21.field2353) * 4 + 2 - class213.field3139.field3660 / 32;
                        int var26 = var21.field2359 * 4;
                        int var27 = var26 * var26;
                        int var28 = (-class149.field2390 + var21.field2373) * 4 + -(class213.field3139.field3753 / 32) + 2;
                        class33.method216(var28, var27, var25, arg3, (byte) -94, arg0, arg4, var21.field2364);
                    }
                    if (var21.field2362 == 10 && var21.field2367 >= 0 && ~var21.field2367 > ~class92.field1475.length) {
                        class207 var29 = class92.field1475[var21.field2367];
                        if (var29 != null) {
                            int var30 = var29.field3753 / 32 + -(class213.field3139.field3753 / 32);
                            int var31 = var29.field3660 / 32 - class213.field3139.field3660 / 32;
                            class33.method216(var30, 360000, var31, arg3, (byte) -118, arg0, arg4, var21.field2364);
                        }
                    }
                }
            }
            if (~class113.field1883 != -1) {
                int var19 = class113.field1883 * 4 + 2 + -(class213.field3139.field3660 / 32) + 2 * (class213.field3139.method1467(0) + -1);
                int var20 = class255.field3855 * 4 + 2 + -(class213.field3139.field3753 / 32) - -((-1 + class213.field3139.method1467(0)) * 2);
                class238.method1636(var20, 27191, arg3, var19, arg4, arg0, class133.field2180[!class258.field4001 ? 0 : 1]);
            }
            class130.method996(arg4.field4215 / 2 + arg0 + -1, arg4.field4046 / 2 + arg3 + -1, 3, 3, 16777215);
        } else {
            class130.method990(arg0, arg3, 0, arg4.field4220, arg4.field4168);
        }
        class91.field1468[arg2] = true;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(BIIII)V")
    public static final void method1359(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field2818;
        if (arg0 < -31) {
            for (int var5 = 0; ~var5 > ~class64.field968; ++var5) {
                if (~arg1 > ~(class59.field873[var5] + class267.field4276[var5]) && ~class59.field873[var5] > ~(arg1 + arg3) && class76.field1188[var5] + class186.field2772[var5] > arg2 && ~(arg2 + arg4) < ~class76.field1188[var5]) {
                    class91.field1468[var5] = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "(III)Lah;")
    public static final class156 method1360(int arg0, int arg1, int arg2) {
        class313 var3 = class223.field3286[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            for (int var4 = 0; var4 < var3.field5022; ++var4) {
                class156 var5 = var3.field5037[var4];
                if ((var5.field2431 >> 29 & 3L) == 2L && var5.field2443 == arg1 && var5.field2432 == arg2) {
                    return var5;
                }
            }
            return null;
        }
    }
}
