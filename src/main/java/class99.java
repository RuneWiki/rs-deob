import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iaa")
public class class99 extends class325 {

    @OriginalMember(owner = "client!iaa", name = "Q", descriptor = "I")
    public int field1319 = 99;

    @OriginalMember(owner = "client!iaa", name = "G", descriptor = "I")
    public static int field1309 = 100;

    @OriginalMember(owner = "client!iaa", name = "H", descriptor = "I")
    public static int field1310;

    @OriginalMember(owner = "client!iaa", name = "I", descriptor = "I")
    public static int field1311;

    @OriginalMember(owner = "client!iaa", name = "J", descriptor = "I")
    public static int field1312;

    @OriginalMember(owner = "client!iaa", name = "K", descriptor = "I")
    public static int field1313;

    @OriginalMember(owner = "client!iaa", name = "L", descriptor = "I")
    public static int field1314;

    @OriginalMember(owner = "client!iaa", name = "M", descriptor = "I")
    public static int field1315;

    @OriginalMember(owner = "client!iaa", name = "N", descriptor = "I")
    public static int field1316;

    @OriginalMember(owner = "client!iaa", name = "O", descriptor = "I")
    public static int field1317;

    @OriginalMember(owner = "client!iaa", name = "P", descriptor = "I")
    public static int field1318;

    @OriginalMember(owner = "client!iaa", name = "R", descriptor = "I")
    public static int field1320;

    // $FF: synthetic field
    @OriginalMember(owner = "client!iaa", name = "S", descriptor = "Ljava/lang/Class;")
    public static Class field1321;

    // $FF: synthetic method
    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method749(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;", line = 3)
    public static final String method739(byte arg0, String arg1) {
        ++field1320;
        StringBuffer var2 = new StringBuffer();
        int var3 = arg1.length();
        for (int var4 = 0; ~var3 < ~var4; ++var4) {
            char var6 = arg1.charAt(var4);
            if (var6 == '%' && var3 > var4 + 2) {
                char var7 = arg1.charAt(var4 + 1);
                boolean var8 = false;
                int var9;
                if (var7 >= '0' && var7 <= '9') {
                    var9 = var7 + -48;
                } else if (var7 >= 'a' && ~var7 >= -103) {
                    var9 = var7 + -97 + 10;
                } else {
                    if (var7 < 'A' || var7 > 'F') {
                        var2.append('%');
                        continue;
                    }
                    var9 = var7 + '\n' + -65;
                }
                char var10 = arg1.charAt(var4 + 2);
                int var11 = var9 * 16;
                int var12;
                if (~var10 <= -49 && var10 <= '9') {
                    var12 = var10 + -48 + var11;
                } else if (var10 >= 'a' && ~var10 >= -103) {
                    var12 = var10 + -97 + 10 + var11;
                } else {
                    if (~var10 > -66 || var10 > 'F') {
                        var2.append('%');
                        continue;
                    }
                    var12 = var10 + '\n' + -65 + var11;
                }
                if (var12 != 0 && class666.method3644((byte) var12, false)) {
                    var2.append(class103.method778(12270, (byte) var12));
                }
                var4 += 2;
            } else if (var6 != '+') {
                var2.append(var6);
            } else {
                var2.append(' ');
            }
        }
        int var5 = 51 / ((arg0 - -30) / 50);
        return var2.toString();
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(IIIIIII[Lwca;[BLoa;I)V", line = 79)
    public final void method740(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class36[] arg7, byte[] arg8, class43 arg9, int arg10) {
        ++field1317;
        class418 var12 = new class418(arg8);
        int var13 = arg5;
        while (true) {
            int var14 = var12.method2415((byte) -125);
            if (~var14 == -1) {
                return;
            }
            var13 += var14;
            int var15 = 0;
            while (true) {
                int var16 = var12.method2400((byte) 36);
                if (var16 == 0) {
                    break;
                }
                var15 += var16 + -1;
                int var17 = var15 & 63;
                int var18 = (var15 & 4057) >> 6;
                int var19 = var15 >> 12;
                int var20 = var12.method2396(-14);
                int var21 = var20 >> 2;
                int var22 = 3 & var20;
                if (~arg1 == ~var19 && ~var18 <= ~arg2 && ~var18 > ~(arg2 + 8) && arg4 <= var17 && ~(arg4 + 8) < ~var17) {
                    class698 var23 = class348.field4436.method1900(arg5 + -118, var13);
                    int var24 = class144.method1079(arg3, 7 & var17, var23.field9589, var22, var23.field9654, var18 & 7, 1) + arg6;
                    int var25 = arg0 + class60.method511(var23.field9654, 7 & var18, 0, var23.field9589, var22, 7 & var17, arg3);
                    if (var24 > 0 && var25 > 0 && ~(super.field4232 + -1) < ~var24 && super.field4224 + -1 > var25) {
                        class36 var26 = null;
                        if (!super.field4215) {
                            int var27 = arg10;
                            if (~(2 & class159.field1994[1][var24][var25]) == -3) {
                                var27 = arg10 - 1;
                            }
                            if (~var27 <= -1) {
                                var26 = arg7[var27];
                            }
                        }
                        this.method746(var24, arg10, var25, arg10, arg5 ^ -98, var26, -1, arg3 + var22 & 3, var13, var21, arg9);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(IIILba;Ljq;ILoa;IIIIIIZI)Lba;", line = 163)
    public static final class107 method741(int arg0, int arg1, int arg2, class107 arg3, class348 arg4, int arg5, class43 arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, boolean arg13, int arg14) {
        ++field1310;
        if (arg3 == null) {
            return null;
        } else {
            int var15 = 2055;
            if (arg4 != null) {
                int var16 = var15 | arg4.method2005(-1, (byte) 18, false, arg0);
                var15 = var16 & -513;
            }
            long var17 = (long) ((arg11 << 16) + (arg8 - -(arg5 << 24))) - (-((long) arg7 << 32) + -((long) arg14 << 48));
            class668 var19 = class369.field4757;
            class107 var20;
            synchronized (class369.field4757) {
                var20 = (class107) class369.field4757.method3655(-125, var17);
            }
            if (var20 == null || ~arg6.method377(var20.method796(), var15) != -1) {
                if (var20 != null) {
                    var15 = arg6.method370(var15, var20.method796());
                }
                byte var21;
                if (arg8 != 1) {
                    if (arg8 != 2) {
                        if (~arg8 != -4) {
                            if (~arg8 != -5) {
                                var21 = 21;
                            } else {
                                var21 = 18;
                            }
                        } else {
                            var21 = 15;
                        }
                    } else {
                        var21 = 12;
                    }
                } else {
                    var21 = 9;
                }
                byte var22 = 3;
                int[] var23 = new int[] { 64, 96, 128 };
                class645 var24 = new class645(var21 * var22 + 1, var22 * 2 * var21 - var21, 0);
                int var25 = var24.method3549(0, 0, -26138, 0);
                int[][] var26 = new int[var22][var21];
                for (int var27 = 0; var27 < var22; ++var27) {
                    int var28 = var23[var27];
                    int var29 = var23[var27];
                    for (int var30 = 0; var30 < var21; ++var30) {
                        int var31 = (var30 << 14) / var21;
                        int var32 = class237.field3193[var31] * var28 >> 14;
                        int var33 = class237.field3196[var31] * var29 >> 14;
                        var26[var27][var30] = var24.method3549(var32, 0, -26138, var33);
                    }
                }
                for (int var34 = 0; var22 > var34; ++var34) {
                    int var35 = (var34 * 256 - -128) / var22;
                    int var36 = -var35 + 256;
                    byte var37 = (byte) (arg5 * var35 + arg11 * var36 >> 8);
                    short var38 = (short) ((32512 & (127 & arg7) * var36 + (arg14 & 127) * var35) + (16515072 & (64512 & arg7) * var36 + (64512 & arg14) * var35) + (229376 & (896 & arg7) * var36 + (896 & arg14) * var35) >> 8);
                    for (int var39 = 0; var39 < var21; ++var39) {
                        if (~var34 != -1) {
                            var24.method3538((byte) 1, var37, var38, (short) -1, var26[var34 + -1][var39], (byte) -99, (byte) -1, var26[var34 + -1][(var39 - -1) % var21], var26[var34][(var39 - -1) % var21]);
                            var24.method3538((byte) 1, var37, var38, (short) -1, var26[var34 - 1][var39], (byte) -106, (byte) -1, var26[var34][(var39 - -1) % var21], var26[var34][var39]);
                        } else {
                            var24.method3538((byte) 1, var37, var38, (short) -1, var25, (byte) -124, (byte) -1, var26[0][(var39 + 1) % var21], var26[0][var39]);
                        }
                    }
                }
                var20 = arg6.method410(var24, var15, class451.field5886, 64, 768);
                class668 var40 = class369.field4757;
                synchronized (class369.field4757) {
                    class369.field4757.method3650(var17, -106, var20);
                }
            }
            int var41 = (arg8 << 8) + -1;
            int var42 = -var41;
            int var43 = -var41;
            int var44 = var41;
            int var45 = var41;
            if (arg9 != 0) {
                if (~(4 & arg9) != -1) {
                    var44 = var41 + 512;
                }
                if (~(2 & arg9) != -1) {
                    var43 -= 512;
                }
                if ((1 & arg9) != 0) {
                    var45 = var41 + 512;
                }
                if (~(arg9 & 8) != -1) {
                    var42 -= 512;
                }
            }
            int var46 = arg3.method820();
            int var47 = arg3.method799();
            int var48 = arg3.method805();
            if (~var46 > ~var42) {
                var46 = var42;
            }
            int var49 = arg3.method810();
            if (var47 > var44) {
                var47 = var44;
            }
            if (var48 < var43) {
                var48 = var43;
            }
            if (~var45 > ~var49) {
                var49 = var45;
            }
            class63 var50 = null;
            if (arg4 != null) {
                int var51 = arg4.field4463[arg0];
                var50 = class552.field7163.method3034(-109, var51 >> 16);
                arg0 = var51 & 65535;
            }
            class107 var52;
            if (var50 != null) {
                var52 = var20.method479((byte) 3, var15, true);
                var52.method789(-var46 + var47 >> 1, 128, -var48 + var49 >> 1);
                var52.method804(var46 + var47 >> 1, 0, var48 + var49 >> 1);
                var52.method814(arg0, var50, -22627);
            } else {
                var52 = var20.method479((byte) 3, var15, true);
                var52.method789(var47 - var46 >> 1, 128, -var48 + var49 >> 1);
                var52.method804(var46 - -var47 >> 1, 0, var48 + var49 >> 1);
            }
            if (arg13) {
                method743(-23, 40, -84, -92, (byte) 59, 86, 94);
            }
            if (~arg1 != -1) {
                var52.method800(arg1);
            }
            if (~arg10 != -1) {
                var52.method803(arg10);
            }
            if (~arg12 != -1) {
                var52.method804(0, arg12, 0);
            }
            return var52;
        }
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(III[Lwca;Loa;[B)V", line = 377)
    public final void method742(int arg0, int arg1, int arg2, class36[] arg3, class43 arg4, byte[] arg5) {
        int var7 = 39 % ((arg1 - 65) / 57);
        ++field1316;
        class418 var8 = new class418(arg5);
        int var9 = -1;
        while (true) {
            int var10 = var8.method2415((byte) -77);
            if (~var10 == -1) {
                return;
            }
            var9 += var10;
            int var11 = 0;
            while (true) {
                int var12 = var8.method2400((byte) 36);
                if (~var12 == -1) {
                    break;
                }
                var11 += var12 - 1;
                int var13 = 63 & var11;
                int var14 = (var11 & 4046) >> 6;
                int var15 = var11 >> 12;
                int var16 = var8.method2396(11);
                int var17 = var16 >> 2;
                int var18 = var16 & 3;
                int var19 = var14 - -arg0;
                int var20 = arg2 + var13;
                if (~var19 < -1 && ~var20 < -1 && var19 < super.field4232 + -1 && ~var20 > ~(super.field4224 + -1)) {
                    class36 var21 = null;
                    if (!super.field4215) {
                        int var22 = var15;
                        if (~(class159.field1994[1][var19][var20] & 2) == -3) {
                            var22 = var15 - 1;
                        }
                        if (var22 >= 0) {
                            var21 = arg3[var22];
                        }
                    }
                    this.method746(var19, var15, var20, var15, 97, var21, -1, var18, var9, var17, arg4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(IIIIBII)V", line = 448)
    public static final void method743(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        ++field1312;
        if (arg4 >= -17) {
            method741(9, 35, 84, (class107) null, (class348) null, 87, (class43) null, 84, -127, -71, 53, -5, -108, true, 88);
        }
        if (~class265.field3552 >= ~arg0 && class641.field8924 >= arg1 && ~arg2 <= ~class165.field2061 && ~arg6 >= ~field1309) {
            if (~arg3 == -2) {
                class50.method452(arg2, arg1, arg0, 1, arg6, arg5);
            } else {
                class265.method1635(arg1, (byte) 48, arg6, arg2, arg5, arg3, arg0);
            }
        } else if (~arg3 == -2) {
            class522.method2801(arg2, arg5, arg6, arg1, false, arg0);
        } else {
            class652.method3582((byte) -116, arg0, arg2, arg3, arg6, arg1, arg5);
        }
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(IIIILfd;IIILoa;[II)V", line = 480)
    public final void method744(int arg0, int arg1, int arg2, int arg3, class418 arg4, int arg5, int arg6, int arg7, class43 arg8, int[] arg9, int arg10) {
        ++field1311;
        if (!super.field4215) {
            boolean var12 = false;
            if (arg9 != null) {
                arg9[0] = -1;
            }
            if (arg7 != 4) {
                this.field1319 = -40;
            }
            class559 var13 = null;
            int var14 = (arg0 & 7) * 8;
            int var15 = (arg1 & 7) * 8;
            while (true) {
                while (arg4.field5367 < arg4.field5393.length) {
                    int var20 = arg4.method2396(25);
                    if (var20 == 0) {
                        var13 = new class559(arg4);
                    } else if (var20 == 1) {
                        int var21 = arg4.method2396(-123);
                        if (~var21 < -1) {
                            for (int var22 = 0; ~var22 > ~var21; ++var22) {
                                class357 var23 = new class357(arg8, arg4, 2);
                                if (~var23.field4618 == -32) {
                                    class362 var24 = class64.field882.method3727(arg4.method2393(-30727), (byte) -35);
                                    var23.method2053((byte) 69, var24.field4681, var24.field4676, var24.field4682, var24.field4677);
                                }
                                if (~arg8.method384() < -1) {
                                    class296 var25 = var23.field4631;
                                    int var26 = var25.method1754(34) >> 9;
                                    int var27 = var25.method1755(arg7 ^ 125) >> 9;
                                    if (var23.field4632 == arg10 && var26 >= var14 && ~(var14 - -8) < ~var26 && var27 >= var15 && var15 + 8 > var27) {
                                        int var28 = (arg2 << 9) + class228.method1437(arg5, 4095 & var25.method1755(arg7 ^ 93), 4095 & var25.method1754(86), (byte) -117);
                                        int var29 = class469.method2599(var25.method1754(121) & 4095, false, arg5, var25.method1755(127) & 4095) + (arg3 << 9);
                                        int var30 = var28 >> 9;
                                        int var31 = var29 >> 9;
                                        if (var30 >= 0 && var31 >= 0 && var30 < super.field4232 && super.field4224 > var31) {
                                            var25.method1309((byte) 111, var29, var28, super.field4226[arg10][var30][var31] + -var25.method1753((byte) 127));
                                            class655.method3609(var23);
                                        }
                                    }
                                }
                            }
                        }
                    } else if (~var20 == -3) {
                        if (var13 == null) {
                            var13 = new class559();
                        }
                        var13.method2991(arg4, 8);
                    } else if (~var20 == -129) {
                        if (arg9 != null) {
                            arg9[0] = arg4.method2393(arg7 + -30731);
                            arg9[1] = arg4.method2383(65280);
                            arg9[2] = arg4.method2383(class392.method2234(arg7, 65284));
                            arg9[3] = arg4.method2383(65280);
                            arg9[4] = arg4.method2393(-30727);
                        } else {
                            arg4.field5367 += 10;
                        }
                    } else {
                        if (var20 != 129) {
                            throw new IllegalStateException("");
                        }
                        if (super.field4228 == null) {
                            super.field4228 = new byte[4][][];
                        }
                        for (int var32 = 0; var32 < 4; ++var32) {
                            byte var33 = arg4.method2387((byte) -67);
                            if (var33 == 0 && super.field4228[arg6] != null) {
                                if (~arg10 <= ~var32) {
                                    int var34 = arg2;
                                    int var35 = arg2 + 7;
                                    int var36 = arg3;
                                    if (var35 >= 0) {
                                        if (~var35 <= ~super.field4232) {
                                            var35 = super.field4232;
                                        }
                                    } else {
                                        var35 = 0;
                                    }
                                    int var37 = arg3 + 7;
                                    if (~arg2 <= -1) {
                                        if (arg2 >= super.field4232) {
                                            var34 = super.field4232;
                                        }
                                    } else {
                                        var34 = 0;
                                    }
                                    if (~arg3 <= -1) {
                                        if (~super.field4224 >= ~arg3) {
                                            var36 = super.field4224;
                                        }
                                    } else {
                                        var36 = 0;
                                    }
                                    if (var37 < 0) {
                                        var37 = 0;
                                    } else if (var37 >= super.field4224) {
                                        var37 = super.field4224;
                                    }
                                    while (var35 > var34) {
                                        while (~var36 > ~var37) {
                                            super.field4228[arg6][var34][var36] = 0;
                                            ++var36;
                                        }
                                        ++var34;
                                    }
                                }
                            } else if (~var33 == -2) {
                                if (super.field4228[arg6] == null) {
                                    super.field4228[arg6] = new byte[super.field4232 + 1][super.field4224 - -1];
                                }
                                for (int var38 = 0; ~var38 > -65; var38 += 4) {
                                    for (int var39 = 0; var39 < 64; var39 += 4) {
                                        byte var40 = arg4.method2387((byte) -24);
                                        if (var32 <= arg10) {
                                            for (int var41 = var38; var41 < var38 + 4; ++var41) {
                                                for (int var42 = var39; ~(var39 + 4) < ~var42; ++var42) {
                                                    if (var41 >= var14 && ~var41 > ~(var14 + 8) && var42 >= var15 && var15 < var15 + 8) {
                                                        int var43 = arg2 + class185.method1235(arg5, 1, var41 & 7, 7 & var42);
                                                        int var44 = arg3 - -class380.method2172(arg7 + 3, arg5, var42 & 7, var41 & 7);
                                                        if (~var43 <= -1 && var43 < super.field4232 && var44 >= 0 && ~super.field4224 < ~var44) {
                                                            super.field4228[arg6][var43][var44] = var40;
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
                if (var13 != null) {
                    class9.method44(19, var13, arg2 >> 3, arg3 >> 3);
                }
                if (!var12 && super.field4228 != null && super.field4228[arg6] != null) {
                    int var16 = arg2 + 7;
                    int var17 = arg3 + 7;
                    for (int var18 = arg2; ~var16 < ~var18; ++var18) {
                        for (int var19 = arg3; ~var19 > ~var17; ++var19) {
                            super.field4228[arg6][var18][var19] = 0;
                        }
                    }
                    return;
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(IILoa;IILwca;I)V", line = 776)
    public final void method745(int arg0, int arg1, class43 arg2, int arg3, int arg4, class36 arg5, int arg6) {
        ++field1314;
        if (arg0 != -2) {
            this.field1319 = 94;
        }
        class620 var8 = null;
        if (arg1 == 0) {
            var8 = (class620) class549.method2909(arg6, arg3, arg4);
        }
        if (arg1 == 1) {
            var8 = (class620) class186.method1237(arg6, arg3, arg4);
        }
        if (~arg1 == -3) {
            var8 = (class620) class47.method432(arg6, arg3, arg4, field1321 != null ? field1321 : (field1321 = method749("ut")));
        }
        if (arg1 == 3) {
            var8 = (class620) class377.method2155(arg6, arg3, arg4);
        }
        if (var8 != null) {
            class698 var9 = class348.field4436.method1900(-113, var8.method76((byte) -124));
            int var10 = var8.method66((byte) -42);
            int var11 = var8.method70(true);
            if (var9.method3808(54)) {
                class54.method474(arg0 ^ 10083, arg3, var9, arg6, arg4);
            }
            if (var8.method75(arg0 ^ -99)) {
                var8.method65(arg2, -123);
            }
            if (arg1 == 0) {
                class17 var12 = class549.method2909(arg6, arg3, arg4);
                if (var12 instanceof class13) {
                    ((class13) var12).field128 = null;
                } else {
                    class62.method526(arg6, arg3, arg4);
                }
                if (~var9.field9673 != -1) {
                    arg5.method289(var9.field9619, arg4, 75, var11, !var9.field9661, arg3, var10);
                    return;
                }
            } else if (~arg1 != -2) {
                if (~arg1 == -3) {
                    class34 var13 = class47.method432(arg6, arg3, arg4, field1321 != null ? field1321 : (field1321 = method749("ut")));
                    if (var13 instanceof class166 && ~var13.field497 == ~arg3 && var13.field502 == arg4) {
                        ((class166) var13).field2075 = null;
                    } else {
                        class650.method3575(arg6, arg3, arg4, field1321 != null ? field1321 : (field1321 = method749("ut")));
                    }
                    if (~var9.field9673 != -1 && super.field4232 > var9.field9589 + arg3 && ~super.field4224 < ~(var9.field9589 + arg4) && ~(var9.field9654 + arg3) > ~super.field4232 && super.field4224 > var9.field9654 + arg4) {
                        arg5.method286(var9.field9589, !var9.field9661, var9.field9619, var9.field9654, false, arg4, var11, arg3);
                        return;
                    }
                    return;
                }
                if (arg1 == 3) {
                    class152 var14 = class377.method2155(arg6, arg3, arg4);
                    if (!(var14 instanceof class469)) {
                        class648.method3567(arg6, arg3, arg4);
                    } else {
                        ((class469) var14).field6121 = null;
                    }
                    if (~var9.field9673 == -2) {
                        arg5.method285(true, arg3, arg4);
                        return;
                    }
                }
            } else {
                class237 var15 = class186.method1237(arg6, arg3, arg4);
                if (!(var15 instanceof class550)) {
                    class126.method921(arg6, arg3, arg4);
                    return;
                }
                ((class550) var15).field7141 = null;
            }
        }
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(IIIIILwca;IIIILoa;)V", line = 888)
    public final void method746(int arg0, int arg1, int arg2, int arg3, int arg4, class36 arg5, int arg6, int arg7, int arg8, int arg9, class43 arg10) {
        ++field1315;
        if (class260.field3509.method1571(class364.field4697, -23572) || class133.method969(arg1, class517.field6768, 110, arg2, arg0)) {
            if (arg3 < this.field1319) {
                this.field1319 = arg3;
            }
            class698 var12 = class348.field4436.method1900(-127, arg8);
            if (!arg10.method338() || !class260.field3509.field1286 || !var12.field9615) {
                int var13;
                int var14;
                if (~arg7 != -2 && arg7 != 3) {
                    var13 = var12.field9589;
                    var14 = var12.field9654;
                } else {
                    var14 = var12.field9589;
                    var13 = var12.field9654;
                }
                int var15;
                int var16;
                if (~(arg0 - -var13) >= ~super.field4232) {
                    var15 = (var13 + 1 >> 1) + arg0;
                    var16 = (var13 >> 1) + arg0;
                } else {
                    var15 = arg0 + 1;
                    var16 = arg0;
                }
                if (arg4 < 74) {
                    this.field1319 = 27;
                }
                int var17;
                int var18;
                if (arg2 + var14 > super.field4224) {
                    var17 = arg2 + 1;
                    var18 = arg2;
                } else {
                    var18 = (var14 >> 1) + arg2;
                    var17 = (var14 + 1 >> 1) + arg2;
                }
                class88 var19 = class392.field4997[arg1];
                int var20 = var19.method668(var16, var18) + var19.method668(var15, var18) + (var19.method668(var16, var17) - -var19.method668(var15, var17)) >> 2;
                int var21 = (arg0 << 9) + (var13 << 8);
                int var22 = (arg2 << 9) + (var14 << 8);
                boolean var23 = class43.field599 && !super.field4215 && var12.field9639;
                if (var12.method3808(57)) {
                    class64.method535((byte) -111, arg0, var12, (class532) null, arg7, (class193) null, arg3, arg2);
                }
                boolean var24 = ~arg6 == 0 && var12.field9637 == -1 && var12.field9653 == null && var12.field9630 == null && !var12.field9601;
                if (!class63.field859 || (!class529.method2816(0, arg9) || var12.field9640 == 1) && (!class30.method253(arg9, (byte) -9) || ~var12.field9640 != -1)) {
                    if (arg9 == 22) {
                        if (class260.field3509.field1267 || ~var12.field9660 != -1 || ~var12.field9673 == -2 || var12.field9670) {
                            class152 var25;
                            if (!var24) {
                                var25 = new class402(arg10, var12, arg3, arg1, var21, var20, var22, super.field4215, arg7, arg6);
                            } else {
                                class122 var26 = new class122(arg10, var12, arg1, var21, var20, var22, super.field4215, arg7, var23);
                                if (var26.method75(69)) {
                                    var26.method62(arg10, 6526);
                                }
                                var25 = var26;
                            }
                            class152 var27 = class377.method2155(arg3, arg0, arg2);
                            if (var27 instanceof class469) {
                                ((class469) var27).field6121 = var25;
                            } else {
                                class45.method422(arg3, arg0, arg2, var25);
                            }
                            if (~var12.field9673 == -2 && arg5 != null) {
                                arg5.method287(true, arg0, arg2);
                            }
                        }
                    } else if (~arg9 != -11 && arg9 != 11) {
                        if (arg9 >= 12 && arg9 <= 17 || ~arg9 <= -19 && ~arg9 >= -22) {
                            class34 var29;
                            if (var24) {
                                class399 var28 = new class399(arg10, var12, arg3, arg1, var21, var20, var22, super.field4215, arg0, arg0 + -1 - -var13, arg2, arg2 - 1 + var14, arg9, arg7, var23);
                                if (var28.method75(-116)) {
                                    var28.method62(arg10, 6526);
                                }
                                var29 = var28;
                            } else {
                                var29 = new class248(arg10, var12, arg3, arg1, var21, var20, var22, super.field4215, arg0, var13 + -1 + arg0, arg2, arg2 + var14 + -1, arg9, arg7, arg6);
                            }
                            class34 var30 = class47.method432(arg3, arg0, arg2, field1321 != null ? field1321 : (field1321 = method749("ut")));
                            if (var30 instanceof class166 && var30.field497 == arg0 && ~var30.field502 == ~arg2) {
                                ((class166) var30).field2075 = var29;
                            } else {
                                class587.method3203(var29, false);
                            }
                            if (class43.field599 && !super.field4215 && arg9 >= 12 && arg9 <= 17 && ~arg9 != -14 && ~arg3 < -1 && ~var12.field9640 != -1) {
                                super.field4218[arg3][arg0][arg2] = (byte) class131.method954(super.field4218[arg3][arg0][arg2], 4);
                            }
                            if (~var12.field9673 != -1 && arg5 != null) {
                                arg5.method297(var14, arg0, !var12.field9661, var13, arg2, var12.field9619, -29);
                            }
                        } else if (~arg9 == -1) {
                            int var31 = var12.field9640;
                            if (class166.field2083 && var12.field9640 == -1) {
                                var31 = 1;
                            }
                            class17 var32;
                            if (!var24) {
                                var32 = new class79(arg10, var12, arg3, arg1, var21, var20, var22, super.field4215, arg9, arg7, arg6);
                            } else {
                                class188 var33 = new class188(arg10, var12, arg1, var21, var20, var22, super.field4215, arg9, arg7, var23);
                                var32 = var33;
                                if (var33.method75(-101)) {
                                    var33.method62(arg10, 6526);
                                }
                            }
                            class17 var34 = class549.method2909(arg3, arg0, arg2);
                            if (var34 instanceof class13) {
                                ((class13) var34).field128 = var32;
                            } else {
                                class133.method966(arg3, arg0, arg2, var32, (class17) null);
                            }
                            if (class43.field599) {
                                if (arg7 != 0) {
                                    if (~arg7 == -2) {
                                        if (var12.field9663) {
                                            var19.method662(arg0, arg2 + 1, 50);
                                            var19.method662(arg0 - -1, arg2 - -1, 50);
                                        }
                                        if (var31 == 1 && !super.field4215) {
                                            super.field4218[arg3][arg0][arg2 - -1] = (byte) class131.method954(super.field4218[arg3][arg0][arg2 - -1], 2);
                                        }
                                    } else if (arg7 != 2) {
                                        if (~arg7 == -4) {
                                            if (var12.field9663) {
                                                var19.method662(arg0, arg2, 50);
                                                var19.method662(arg0 - -1, arg2, 50);
                                            }
                                            if (var31 == 1 && !super.field4215) {
                                                super.field4218[arg3][arg0][arg2] = (byte) class131.method954(super.field4218[arg3][arg0][arg2], 2);
                                            }
                                        }
                                    } else {
                                        if (var12.field9663) {
                                            var19.method662(arg0 + 1, arg2, 50);
                                            var19.method662(arg0 + 1, arg2 - -1, 50);
                                        }
                                        if (var31 == 1 && !super.field4215) {
                                            super.field4218[arg3][arg0 + 1][arg2] = (byte) class131.method954(super.field4218[arg3][arg0 + 1][arg2], 1);
                                        }
                                    }
                                } else {
                                    if (var12.field9663) {
                                        var19.method662(arg0, arg2, 50);
                                        var19.method662(arg0, arg2 + 1, 50);
                                    }
                                    if (~var31 == -2 && !super.field4215) {
                                        super.field4218[arg3][arg0][arg2] = (byte) class131.method954(super.field4218[arg3][arg0][arg2], 1);
                                    }
                                }
                            }
                            if (var12.field9673 != 0 && arg5 != null) {
                                arg5.method283(var12.field9619, arg9, !var12.field9661, arg7, (byte) 77, arg2, arg0);
                            }
                            if (~var12.field9597 != -65) {
                                class552.method2960(arg3, arg0, arg2, var12.field9597);
                            }
                        } else if (~arg9 == -2) {
                            class17 var36;
                            if (var24) {
                                class188 var35 = new class188(arg10, var12, arg1, var21, var20, var22, super.field4215, arg9, arg7, var23);
                                var36 = var35;
                                if (var35.method75(85)) {
                                    var35.method62(arg10, 6526);
                                }
                            } else {
                                var36 = new class79(arg10, var12, arg3, arg1, var21, var20, var22, super.field4215, arg9, arg7, arg6);
                            }
                            class17 var37 = class549.method2909(arg3, arg0, arg2);
                            if (!(var37 instanceof class13)) {
                                class133.method966(arg3, arg0, arg2, var36, (class17) null);
                            } else {
                                ((class13) var37).field128 = var36;
                            }
                            if (var12.field9663 && class43.field599) {
                                if (~arg7 == -1) {
                                    var19.method662(arg0, arg2 + 1, 50);
                                } else if (arg7 == 1) {
                                    var19.method662(arg0 + 1, arg2 - -1, 50);
                                } else if (~arg7 != -3) {
                                    if (arg7 == 3) {
                                        var19.method662(arg0, arg2, 50);
                                    }
                                } else {
                                    var19.method662(arg0 + 1, arg2, 50);
                                }
                            }
                            if (~var12.field9673 != -1 && arg5 != null) {
                                arg5.method283(var12.field9619, arg9, !var12.field9661, arg7, (byte) 77, arg2, arg0);
                            }
                        } else if (arg9 == 2) {
                            int var38 = 3 & arg7 - -1;
                            class17 var41;
                            class17 var42;
                            if (var24) {
                                class188 var39 = new class188(arg10, var12, arg1, var21, var20, var22, super.field4215, arg9, arg7 - -4, var23);
                                class188 var40 = new class188(arg10, var12, arg1, var21, var20, var22, super.field4215, arg9, var38, var23);
                                if (var39.method75(121)) {
                                    var39.method62(arg10, 6526);
                                }
                                if (var40.method75(-109)) {
                                    var40.method62(arg10, 6526);
                                }
                                var41 = var39;
                                var42 = var40;
                            } else {
                                var41 = new class79(arg10, var12, arg3, arg1, var21, var20, var22, super.field4215, arg9, arg7 + 4, arg6);
                                var42 = new class79(arg10, var12, arg3, arg1, var21, var20, var22, super.field4215, arg9, var38, arg6);
                            }
                            class133.method966(arg3, arg0, arg2, var41, var42);
                            if (~var12.field9640 == -2 && class43.field599 && !super.field4215) {
                                if (arg7 == 0) {
                                    super.field4218[arg3][arg0][arg2] = (byte) class131.method954(super.field4218[arg3][arg0][arg2], 1);
                                    super.field4218[arg3][arg0][arg2 - -1] = (byte) class131.method954(super.field4218[arg3][arg0][arg2 - -1], 2);
                                } else if (~arg7 != -2) {
                                    if (arg7 != 2) {
                                        if (arg7 == 3) {
                                            super.field4218[arg3][arg0][arg2] = (byte) class131.method954(super.field4218[arg3][arg0][arg2], 2);
                                            super.field4218[arg3][arg0][arg2] = (byte) class131.method954(super.field4218[arg3][arg0][arg2], 1);
                                        }
                                    } else {
                                        super.field4218[arg3][arg0 - -1][arg2] = (byte) class131.method954(super.field4218[arg3][arg0 - -1][arg2], 1);
                                        super.field4218[arg3][arg0][arg2] = (byte) class131.method954(super.field4218[arg3][arg0][arg2], 2);
                                    }
                                } else {
                                    super.field4218[arg3][arg0][arg2 - -1] = (byte) class131.method954(super.field4218[arg3][arg0][arg2 - -1], 2);
                                    super.field4218[arg3][arg0 + 1][arg2] = (byte) class131.method954(super.field4218[arg3][arg0 + 1][arg2], 1);
                                }
                            }
                            if (var12.field9673 != 0 && arg5 != null) {
                                arg5.method283(var12.field9619, arg9, !var12.field9661, arg7, (byte) 77, arg2, arg0);
                            }
                            if (~var12.field9597 != -65) {
                                class552.method2960(arg3, arg0, arg2, var12.field9597);
                            }
                        } else if (~arg9 == -4) {
                            class17 var44;
                            if (var24) {
                                class188 var43 = new class188(arg10, var12, arg1, var21, var20, var22, super.field4215, arg9, arg7, var23);
                                var44 = var43;
                                if (var43.method75(-44)) {
                                    var43.method62(arg10, 6526);
                                }
                            } else {
                                var44 = new class79(arg10, var12, arg3, arg1, var21, var20, var22, super.field4215, arg9, arg7, arg6);
                            }
                            class17 var45 = class549.method2909(arg3, arg0, arg2);
                            if (!(var45 instanceof class13)) {
                                class133.method966(arg3, arg0, arg2, var44, (class17) null);
                            } else {
                                ((class13) var45).field128 = var44;
                            }
                            if (var12.field9663 && class43.field599) {
                                if (arg7 != 0) {
                                    if (~arg7 == -2) {
                                        var19.method662(arg0 - -1, arg2 - -1, 50);
                                    } else if (~arg7 == -3) {
                                        var19.method662(arg0 + 1, arg2, 50);
                                    } else if (~arg7 == -4) {
                                        var19.method662(arg0, arg2, 50);
                                    }
                                } else {
                                    var19.method662(arg0, arg2 + 1, 50);
                                }
                            }
                            if (~var12.field9673 != -1 && arg5 != null) {
                                arg5.method283(var12.field9619, arg9, !var12.field9661, arg7, (byte) 77, arg2, arg0);
                            }
                        } else if (~arg9 == -10) {
                            class34 var47;
                            if (var24) {
                                class399 var46 = new class399(arg10, var12, arg3, arg1, var21, var20, var22, super.field4215, arg0, arg0, arg2, arg2, arg9, arg7, var23);
                                var47 = var46;
                                if (var46.method75(94)) {
                                    var46.method62(arg10, 6526);
                                }
                            } else {
                                var47 = new class248(arg10, var12, arg3, arg1, var21, var20, var22, super.field4215, arg0, var13 + -1 + arg0, arg2, var14 + -1 + arg2, arg9, arg7, arg6);
                            }
                            class34 var48 = class47.method432(arg3, arg0, arg2, field1321 != null ? field1321 : (field1321 = method749("ut")));
                            if (var48 instanceof class166 && var48.field497 == arg0 && var48.field502 == arg2) {
                                ((class166) var48).field2075 = var47;
                            } else {
                                class587.method3203(var47, false);
                            }
                            if (~var12.field9673 != -1 && arg5 != null) {
                                arg5.method297(var14, arg0, !var12.field9661, var13, arg2, var12.field9619, -106);
                            }
                            if (~var12.field9597 != -65) {
                                class552.method2960(arg3, arg0, arg2, var12.field9597);
                            }
                        } else if (~arg9 == -5) {
                            class237 var49;
                            if (!var24) {
                                var49 = new class595(arg10, var12, arg3, arg1, var21, var20, var22, super.field4215, 0, 0, 0, arg9, arg7, arg6);
                            } else {
                                class476 var50 = new class476(arg10, var12, arg1, var21, var20, var22, super.field4215, 0, 0, 0, arg9, arg7);
                                if (var50.method75(-18)) {
                                    var50.method62(arg10, 6526);
                                }
                                var49 = var50;
                            }
                            class237 var51 = class186.method1237(arg3, arg0, arg2);
                            if (!(var51 instanceof class550)) {
                                class577.method3161(arg3, arg0, arg2, var49, (class237) null);
                            } else {
                                ((class550) var51).field7141 = var49;
                            }
                        } else if (arg9 == 5) {
                            int var52 = 65;
                            class620 var53 = (class620) class549.method2909(arg3, arg0, arg2);
                            if (var53 != null) {
                                var52 = class348.field4436.method1900(73, var53.method76((byte) -115)).field9597 + 1;
                            }
                            class237 var55;
                            if (var24) {
                                class476 var54 = new class476(arg10, var12, arg1, var21, var20, var22, super.field4215, 0, class148.field1916[arg7] * var52, class233.field3126[arg7] * var52, arg9, arg7);
                                var55 = var54;
                                if (var54.method75(-99)) {
                                    var54.method62(arg10, 6526);
                                }
                            } else {
                                var55 = new class595(arg10, var12, arg3, arg1, var21, var20, var22, super.field4215, 0, class148.field1916[arg7] * var52, class233.field3126[arg7] * var52, arg9, arg7, arg6);
                            }
                            class237 var56 = class186.method1237(arg3, arg0, arg2);
                            if (!(var56 instanceof class550)) {
                                class577.method3161(arg3, arg0, arg2, var55, (class237) null);
                            } else {
                                ((class550) var56).field7141 = var55;
                            }
                        } else if (~arg9 == -7) {
                            int var57 = 33;
                            class620 var58 = (class620) class549.method2909(arg3, arg0, arg2);
                            if (var58 != null) {
                                var57 = class348.field4436.method1900(97, var58.method76((byte) -125)).field9597 / 2 - -1;
                            }
                            class237 var60;
                            if (var24) {
                                class476 var59 = new class476(arg10, var12, arg1, var21, var20, var22, super.field4215, arg7, class148.field1916[arg7] * var57, class233.field3126[arg7] * var57, arg9, arg7 + 4);
                                var60 = var59;
                                if (var59.method75(80)) {
                                    var59.method62(arg10, 6526);
                                }
                            } else {
                                var60 = new class595(arg10, var12, arg3, arg1, var21, var20, var22, super.field4215, arg7, class696.field9561[arg7] * var57, class141.field1862[arg7] * var57, arg9, arg7 + 4, arg6);
                            }
                            class237 var61 = class186.method1237(arg3, arg0, arg2);
                            if (!(var61 instanceof class550)) {
                                class577.method3161(arg3, arg0, arg2, var60, (class237) null);
                            } else {
                                ((class550) var61).field7141 = var60;
                            }
                        } else if (~arg9 == -8) {
                            int var62 = arg7 - -2 & 3;
                            class237 var64;
                            if (var24) {
                                class476 var63 = new class476(arg10, var12, arg1, var21, var20, var22, super.field4215, var62, 0, 0, arg9, var62 - -4);
                                var64 = var63;
                                if (var63.method75(-52)) {
                                    var63.method62(arg10, 6526);
                                }
                            } else {
                                var64 = new class595(arg10, var12, arg3, arg1, var21, var20, var22, super.field4215, var62, 0, 0, arg9, var62 + 4, arg6);
                            }
                            class237 var65 = class186.method1237(arg3, arg0, arg2);
                            if (!(var65 instanceof class550)) {
                                class577.method3161(arg3, arg0, arg2, var64, (class237) null);
                            } else {
                                ((class550) var65).field7141 = var64;
                            }
                        } else if (arg9 == 8) {
                            int var66 = arg7 + 2 & 3;
                            int var67 = 33;
                            class620 var68 = (class620) class549.method2909(arg3, arg0, arg2);
                            if (var68 != null) {
                                var67 = class348.field4436.method1900(-127, var68.method76((byte) -110)).field9597 / 2 - -1;
                            }
                            class237 var71;
                            class237 var72;
                            if (var24) {
                                class476 var69 = new class476(arg10, var12, arg1, var21, var20, var22, super.field4215, arg7, class696.field9561[arg7] * var67, class141.field1862[arg7] * var67, arg9, arg7 + 4);
                                class476 var70 = new class476(arg10, var12, arg1, var21, var20, var22, super.field4215, arg7, 0, 0, arg9, var66 + 4);
                                if (var69.method75(72)) {
                                    var69.method62(arg10, 6526);
                                }
                                if (var70.method75(-64)) {
                                    var70.method62(arg10, 6526);
                                }
                                var71 = var70;
                                var72 = var69;
                            } else {
                                class595 var73 = new class595(arg10, var12, arg3, arg1, var21, var20, var22, super.field4215, arg7, class696.field9561[arg7] * var67, class141.field1862[arg7] * var67, arg9, arg7 + 4, arg6);
                                var72 = var73;
                                class595 var74 = new class595(arg10, var12, arg3, arg1, var21, var20, var22, super.field4215, arg7, 0, 0, arg9, var66 + 4, arg6);
                                var71 = var74;
                            }
                            class577.method3161(arg3, arg0, arg2, var72, var71);
                        }
                    } else {
                        class399 var75 = null;
                        class34 var77;
                        int var78;
                        if (var24) {
                            class399 var76 = new class399(arg10, var12, arg3, arg1, var21, var20, var22, super.field4215, arg0, arg0 - -var13 + -1, arg2, arg2 + -1 + var14, arg9, arg7, var23);
                            var75 = var76;
                            var77 = var76;
                            var78 = var76.method2280(19912);
                        } else {
                            var77 = new class248(arg10, var12, arg3, arg1, var21, var20, var22, super.field4215, arg0, arg0 - 1 + var13, arg2, arg2 + var14 + -1, arg9, arg7, arg6);
                            var78 = 15;
                        }
                        class34 var79 = class47.method432(arg3, arg0, arg2, field1321 != null ? field1321 : (field1321 = method749("ut")));
                        boolean var80 = false;
                        if (var79 instanceof class166 && ~var79.field497 == ~arg0 && ~var79.field502 == ~arg2) {
                            var80 = true;
                            ((class166) var79).field2075 = var77;
                        }
                        if (var80 || class587.method3203(var77, false)) {
                            if (var75 != null && var75.method75(-77)) {
                                var75.method62(arg10, 6526);
                            }
                            if (var12.field9663 && class43.field599) {
                                if (~var78 < -31) {
                                    var78 = 30;
                                }
                                for (int var81 = 0; ~var81 >= ~var13; ++var81) {
                                    for (int var82 = 0; ~var14 <= ~var82; ++var82) {
                                        var19.method662(arg0 + var81, arg2 - -var82, var78);
                                    }
                                }
                            }
                        }
                        if (var12.field9673 != 0 && arg5 != null) {
                            arg5.method297(var14, arg0, !var12.field9661, var13, arg2, var12.field9619, -67);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!iaa", name = "<init>", descriptor = "(IIIZ)V", line = 1594)
    public class99(int arg0, int arg1, int arg2, boolean arg3) {
        super(arg0, arg1, arg2, arg3, class700.field9771, class2.field9);
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(ZLoa;)V", line = 1599)
    public final void method747(boolean arg0, class43 arg1) {
        class544.method2883(arg1);
        ++field1318;
        if (super.field4216 > 1) {
            for (int var3 = 0; super.field4232 > var3; ++var3) {
                for (int var4 = 0; var4 < super.field4224; ++var4) {
                    if (~(2 & class159.field1994[1][var3][var4]) == -3) {
                        class227.method1431(var3, var4);
                    }
                }
            }
        }
        for (int var5 = 0; super.field4216 > var5; ++var5) {
            for (int var6 = 0; ~var6 >= ~super.field4224; ++var6) {
                for (int var7 = 0; var7 <= super.field4232; ++var7) {
                    if ((super.field4218[var5][var7][var6] & 1) != 0) {
                        int var8 = var6;
                        int var9 = var6;
                        int var10 = var5;
                        while (~var9 > ~super.field4224 && ~(1 & super.field4218[var5][var7][var9 + 1]) != -1) {
                            ++var9;
                        }
                        while (var8 > 0 && ~(1 & super.field4218[var5][var7][var8 + -1]) != -1) {
                            --var8;
                        }
                        int var11 = var5;
                        label172: while (~var10 < -1) {
                            for (int var12 = var8; ~var9 <= ~var12; ++var12) {
                                if (~(super.field4218[var10 + -1][var7][var12] & 1) == -1) {
                                    break label172;
                                }
                            }
                            --var10;
                        }
                        label161: while (~var11 > -4) {
                            for (int var13 = var8; ~var9 <= ~var13; ++var13) {
                                if (~(super.field4218[var11 - -1][var7][var13] & 1) == -1) {
                                    break label161;
                                }
                            }
                            ++var11;
                        }
                        int var14 = (var11 + 1 - var10) * (var9 - -1 + -var8);
                        if (var14 >= 2) {
                            short var15 = 960;
                            int var16 = super.field4226[var11][var7][var8] - var15;
                            int var17 = super.field4226[var10][var7][var8];
                            class185.method1236(1, var7 << 9, var7 << 9, var8 << 9, (var9 << 9) + 512, var16, var17);
                            for (int var18 = var10; ~var11 <= ~var18; ++var18) {
                                for (int var19 = var8; var19 <= var9; ++var19) {
                                    super.field4218[var18][var7][var19] = (byte) class597.method3238(super.field4218[var18][var7][var19], -2);
                                }
                            }
                        }
                    }
                    if ((2 & super.field4218[var5][var7][var6]) != 0) {
                        int var20 = var7;
                        int var21 = var7;
                        int var22 = var5;
                        while (var21 < super.field4232 && (2 & super.field4218[var5][var21 + 1][var6]) != 0) {
                            ++var21;
                        }
                        int var23 = var5;
                        while (~var20 < -1 && (super.field4218[var5][var20 + -1][var6] & 2) != 0) {
                            --var20;
                        }
                        label226: while (~var22 < -1) {
                            for (int var24 = var20; var24 <= var21; ++var24) {
                                if (~(2 & super.field4218[var22 + -1][var24][var6]) == -1) {
                                    break label226;
                                }
                            }
                            --var22;
                        }
                        label215: while (var23 < 3) {
                            for (int var25 = var20; ~var25 >= ~var21; ++var25) {
                                if ((2 & super.field4218[var23 - -1][var25][var6]) == 0) {
                                    break label215;
                                }
                            }
                            ++var23;
                        }
                        int var26 = (var23 - (var22 + -1)) * (-var20 + 1 + var21);
                        if (~var26 <= -3) {
                            short var27 = 960;
                            int var28 = super.field4226[var23][var20][var6] + -var27;
                            int var29 = super.field4226[var22][var20][var6];
                            class185.method1236(2, var20 << 9, (var21 << 9) - -512, var6 << 9, var6 << 9, var28, var29);
                            for (int var30 = var22; var23 >= var30; ++var30) {
                                for (int var31 = var20; var21 >= var31; ++var31) {
                                    super.field4218[var30][var31][var6] = (byte) class597.method3238(super.field4218[var30][var31][var6], -3);
                                }
                            }
                        }
                    }
                    if ((super.field4218[var5][var7][var6] & 4) != 0) {
                        int var32 = var7;
                        int var33 = var7;
                        int var34;
                        for (var34 = var6; var34 > 0 && ~(super.field4218[var5][var7][var34 + -1] & 4) != -1; --var34) {
                        }
                        int var35;
                        for (var35 = var6; super.field4224 > var35 && (4 & super.field4218[var5][var7][var35 - -1]) != 0; ++var35) {
                        }
                        label280: while (var32 > 0) {
                            for (int var36 = var34; var35 >= var36; ++var36) {
                                if ((super.field4218[var5][var32 + -1][var36] & 4) == 0) {
                                    break label280;
                                }
                            }
                            --var32;
                        }
                        label269: while (super.field4232 > var33) {
                            for (int var37 = var34; var35 >= var37; ++var37) {
                                if ((4 & super.field4218[var5][var33 + 1][var37]) == 0) {
                                    break label269;
                                }
                            }
                            ++var33;
                        }
                        if (~((-var32 + var33 - -1) * (var35 + 1 - var34)) <= -5) {
                            int var38 = super.field4226[var5][var32][var34];
                            class185.method1236(4, var32 << 9, (var33 << 9) + 512, var34 << 9, (var35 << 9) - -512, var38, var38);
                            for (int var39 = var32; ~var33 <= ~var39; ++var39) {
                                for (int var40 = var34; ~var35 <= ~var40; ++var40) {
                                    super.field4218[var5][var39][var40] = (byte) class597.method3238(super.field4218[var5][var39][var40], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg0) {
            this.method746(65, -38, 10, -105, -2, (class36) null, -80, 26, 125, 89, (class43) null);
        }
        super.field4218 = null;
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(B[IILfd;ILoa;)V", line = 1895)
    public final void method748(byte arg0, int[] arg1, int arg2, class418 arg3, int arg4, class43 arg5) {
        ++field1313;
        if (!super.field4215) {
            boolean var7 = false;
            if (arg0 == 84) {
                class559 var8 = null;
                if (arg1 != null) {
                    arg1[0] = -1;
                }
                while (true) {
                    while (true) {
                        while (true) {
                            while (true) {
                                while (arg3.field5393.length > arg3.field5367) {
                                    int var18 = arg3.method2396(-120);
                                    if (~var18 != -1) {
                                        if (~var18 != -2) {
                                            if (~var18 != -3) {
                                                if (~var18 != -129) {
                                                    if (~var18 != -130) {
                                                        throw new IllegalStateException("");
                                                    }
                                                    if (super.field4228 == null) {
                                                        super.field4228 = new byte[4][][];
                                                    }
                                                    for (int var19 = 0; var19 < 4; ++var19) {
                                                        byte var20 = arg3.method2387((byte) 115);
                                                        if (~var20 == -1 && super.field4228[var19] != null) {
                                                            int var21 = arg4;
                                                            int var22 = arg4 + 64;
                                                            int var23 = arg2;
                                                            if (~arg4 > -1) {
                                                                var21 = 0;
                                                            } else if (super.field4232 <= arg4) {
                                                                var21 = super.field4232;
                                                            }
                                                            if (var22 >= 0) {
                                                                if (super.field4232 <= var22) {
                                                                    var22 = super.field4232;
                                                                }
                                                            } else {
                                                                var22 = 0;
                                                            }
                                                            if (arg2 >= 0) {
                                                                if (~super.field4224 >= ~arg2) {
                                                                    var23 = super.field4224;
                                                                }
                                                            } else {
                                                                var23 = 0;
                                                            }
                                                            int var24 = arg2 + 64;
                                                            if (var24 < 0) {
                                                                var24 = 0;
                                                            } else if (~var24 <= ~super.field4224) {
                                                                var24 = super.field4224;
                                                            }
                                                            while (var21 < var22) {
                                                                while (var23 < var24) {
                                                                    super.field4228[var19][var21][var23] = 0;
                                                                    ++var23;
                                                                }
                                                                ++var21;
                                                            }
                                                        } else if (~var20 == -2) {
                                                            if (super.field4228[var19] == null) {
                                                                super.field4228[var19] = new byte[super.field4232 + 1][super.field4224 - -1];
                                                            }
                                                            for (int var25 = 0; var25 < 64; var25 += 4) {
                                                                for (int var26 = 0; ~var26 > -65; var26 += 4) {
                                                                    byte var27 = arg3.method2387((byte) 102);
                                                                    for (int var28 = arg4 + var25; var28 < arg4 + var25 - -4; ++var28) {
                                                                        for (int var29 = arg2 + var26; ~var29 > ~(arg2 + var26 + 4); ++var29) {
                                                                            if (~var28 <= -1 && super.field4232 > var28 && var29 >= 0 && ~super.field4224 < ~var29) {
                                                                                super.field4228[var19][var28][var29] = var27;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        } else if (var20 == 2) {
                                                            if (super.field4228[var19] == null) {
                                                                super.field4228[var19] = new byte[super.field4232 - -1][super.field4224 + 1];
                                                            }
                                                            if (~var19 < -1) {
                                                                int var30 = arg4;
                                                                int var31 = arg4 + 64;
                                                                int var32 = arg2;
                                                                if (arg4 < 0) {
                                                                    var30 = 0;
                                                                } else if (super.field4232 <= arg4) {
                                                                    var30 = super.field4232;
                                                                }
                                                                if (var31 < 0) {
                                                                    var31 = 0;
                                                                } else if (~super.field4232 >= ~var31) {
                                                                    var31 = super.field4232;
                                                                }
                                                                if (~arg2 > -1) {
                                                                    var32 = 0;
                                                                } else if (arg2 >= super.field4224) {
                                                                    var32 = super.field4224;
                                                                }
                                                                int var33 = arg2 + 64;
                                                                if (var33 < 0) {
                                                                    var33 = 0;
                                                                } else if (var33 >= super.field4224) {
                                                                    var33 = super.field4224;
                                                                }
                                                                while (~var30 > ~var31) {
                                                                    while (var33 > var32) {
                                                                        super.field4228[var19][var30][var32] = super.field4228[var19 + -1][var30][var32];
                                                                        ++var32;
                                                                    }
                                                                    ++var30;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    var7 = true;
                                                } else if (arg1 != null) {
                                                    arg1[0] = arg3.method2393(class392.method2234(arg0, -30803));
                                                    arg1[1] = arg3.method2383(65280);
                                                    arg1[2] = arg3.method2383(65280);
                                                    arg1[3] = arg3.method2383(arg0 + 65196);
                                                    arg1[4] = arg3.method2393(-30727);
                                                } else {
                                                    arg3.field5367 += 10;
                                                }
                                            } else {
                                                if (var8 == null) {
                                                    var8 = new class559();
                                                }
                                                var8.method2991(arg3, 8);
                                            }
                                        } else {
                                            int var34 = arg3.method2396(arg0 ^ -39);
                                            if (~var34 < -1) {
                                                for (int var35 = 0; ~var34 < ~var35; ++var35) {
                                                    class357 var36 = new class357(arg5, arg3, 2);
                                                    if (var36.field4618 == 31) {
                                                        class362 var37 = class64.field882.method3727(arg3.method2393(arg0 + -30811), (byte) -40);
                                                        var36.method2053((byte) 79, var37.field4681, var37.field4676, var37.field4682, var37.field4677);
                                                    }
                                                    if (arg5.method384() > 0) {
                                                        class296 var38 = var36.field4631;
                                                        int var39 = (arg4 << 9) + var38.method1754(21);
                                                        int var40 = (arg2 << 9) + var38.method1755(arg0 + 27);
                                                        int var41 = var39 >> 9;
                                                        int var42 = var40 >> 9;
                                                        if (var41 >= 0 && ~var42 <= -1 && super.field4232 > var41 && super.field4224 > var42) {
                                                            var38.method1309((byte) 122, var40, var39, super.field4226[var36.field4632][var41][var42] + -var38.method1753((byte) 127));
                                                            class655.method3609(var36);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        var8 = new class559(arg3);
                                    }
                                }
                                if (var8 != null) {
                                    for (int var9 = 0; var9 < 8; ++var9) {
                                        for (int var10 = 0; var10 < 8; ++var10) {
                                            int var11 = (arg4 >> 3) + var9;
                                            int var12 = (arg2 >> 3) + var10;
                                            if (var11 >= 0 && ~(super.field4232 >> 3) < ~var11 && ~var12 <= -1 && super.field4224 >> 3 > var12) {
                                                class9.method44(arg0 ^ 5, var8, var11, var12);
                                            }
                                        }
                                    }
                                }
                                if (!var7 && super.field4228 != null) {
                                    for (int var13 = 0; var13 < 4; ++var13) {
                                        if (super.field4228[var13] != null) {
                                            for (int var14 = 0; var14 < 16; ++var14) {
                                                for (int var15 = 0; ~var15 > -17; ++var15) {
                                                    int var16 = (arg4 >> 2) + var14;
                                                    int var17 = (arg2 >> 2) + var15;
                                                    if (var16 >= 0 && var16 < 26 && var17 >= 0 && ~var17 > -27) {
                                                        super.field4228[var13][var16][var17] = 0;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    return;
                                }
                                return;
                            }
                        }
                    }
                }
            }
        }
    }
}
