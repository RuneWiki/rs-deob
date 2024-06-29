import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!js")
public class class302 extends class405 {

    @OriginalMember(owner = "client!js", name = "R", descriptor = "I")
    public int field4054 = 99;

    @OriginalMember(owner = "client!js", name = "P", descriptor = "Ljk;")
    public static class585 field4052 = new class585(25, 7);

    @OriginalMember(owner = "client!js", name = "K", descriptor = "I")
    public static int field4047;

    @OriginalMember(owner = "client!js", name = "L", descriptor = "I")
    public static int field4048;

    @OriginalMember(owner = "client!js", name = "M", descriptor = "I")
    public static int field4049;

    @OriginalMember(owner = "client!js", name = "N", descriptor = "I")
    public static int field4050;

    @OriginalMember(owner = "client!js", name = "O", descriptor = "I")
    public static int field4051;

    @OriginalMember(owner = "client!js", name = "Q", descriptor = "I")
    public static int field4053;

    @OriginalMember(owner = "client!js", name = "S", descriptor = "I")
    public static int field4055;

    @OriginalMember(owner = "client!js", name = "T", descriptor = "I")
    public static int field4056;

    @OriginalMember(owner = "client!js", name = "U", descriptor = "I")
    public static int field4057;

    @OriginalMember(owner = "client!js", name = "V", descriptor = "I")
    public static int field4058;

    // $FF: synthetic field
    @OriginalMember(owner = "client!js", name = "W", descriptor = "Ljava/lang/Class;")
    public static Class field4059;

    @OriginalMember(owner = "client!js", name = "<init>", descriptor = "(IIIZ)V")
    public class302(int arg0, int arg1, int arg2, boolean arg3) {
        super(arg0, arg1, arg2, arg3, class534.field7800, class176.field2178);
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(IILun;Lr;[IIIIIII)V")
    public final void method1788(int arg0, int arg1, class389 arg2, class165 arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        ++field4058;
        if (!super.field5716) {
            boolean var12 = false;
            class618 var13 = null;
            if (arg4 != null) {
                arg4[0] = -1;
            }
            int var14 = (arg7 & 7) * 8;
            if (arg9 >= -78) {
                method1793(50, -48, (class389) null);
            }
            int var15 = (7 & arg5) * 8;
            while (true) {
                while (~arg2.field5205.length < ~arg2.field5195) {
                    int var20 = arg2.method2229(255);
                    if (~var20 == -1) {
                        var13 = new class618(arg2);
                    } else if (~var20 == -2) {
                        int var21 = arg2.method2229(255);
                        if (var21 > 0) {
                            for (int var22 = 0; var22 < var21; ++var22) {
                                class475 var23 = new class475(arg3, arg2, 2);
                                if (~var23.field6644 == -32) {
                                    class251 var24 = class39.field731.method1390((byte) 120, arg2.method2260(-61));
                                    var23.method2792(var24.field3441, var24.field3437, var24.field3439, var24.field3438, 12560);
                                }
                                if (~arg3.method232() < -1) {
                                    class530 var25 = var23.field6647;
                                    int var26 = var25.method3118(34037) >> 9;
                                    int var27 = var25.method3115(-30190) >> 9;
                                    if (var23.field6636 == arg0 && var14 <= var26 && var26 < var14 + 8 && var27 >= var15 && var27 < var15 + 8) {
                                        int var28 = (arg1 << 9) + class148.method948(arg10, false, 4095 & var25.method3115(-30190), 4095 & var25.method3118(34037));
                                        int var29 = (arg8 << 9) + class515.method3051(false, arg10, var25.method3115(-30190) & 4095, 4095 & var25.method3118(34037));
                                        int var30 = var28 >> 9;
                                        int var31 = var29 >> 9;
                                        if (var30 >= 0 && ~var31 <= -1 && var30 < super.field5725 && var31 < super.field5741) {
                                            var25.method1159(super.field5728[arg0][var30][var31] + -var25.method3119(3553), var28, var29, false);
                                            class689.method3891(var23);
                                        }
                                    }
                                }
                            }
                        }
                    } else if (var20 == 2) {
                        if (var13 == null) {
                            var13 = new class618();
                        }
                        var13.method3535(arg2, -7495);
                    } else if (~var20 == -129) {
                        if (arg4 == null) {
                            arg2.field5195 += 10;
                        } else {
                            arg4[0] = arg2.method2260(-44);
                            arg4[1] = arg2.method2270((byte) 71);
                            arg4[2] = arg2.method2270((byte) 71);
                            arg4[3] = arg2.method2270((byte) 71);
                            arg4[4] = arg2.method2260(-101);
                        }
                    } else {
                        if (var20 != 129) {
                            throw new IllegalStateException("");
                        }
                        if (super.field5720 == null) {
                            super.field5720 = new byte[4][][];
                        }
                        for (int var32 = 0; ~var32 > -5; ++var32) {
                            byte var33 = arg2.method2249((byte) -70);
                            if (~var33 == -1 && super.field5720[arg6] != null) {
                                if (~arg0 <= ~var32) {
                                    int var34 = arg1;
                                    int var35 = arg1 - -7;
                                    int var36 = arg8;
                                    if (arg8 < 0) {
                                        var36 = 0;
                                    } else if (~arg8 <= ~super.field5741) {
                                        var36 = super.field5741;
                                    }
                                    int var37 = arg8 + 7;
                                    if (var35 >= 0) {
                                        if (var35 >= super.field5725) {
                                            var35 = super.field5725;
                                        }
                                    } else {
                                        var35 = 0;
                                    }
                                    if (arg1 >= 0) {
                                        if (~arg1 <= ~super.field5725) {
                                            var34 = super.field5725;
                                        }
                                    } else {
                                        var34 = 0;
                                    }
                                    if (~var37 <= -1) {
                                        if (~super.field5741 >= ~var37) {
                                            var37 = super.field5741;
                                        }
                                    } else {
                                        var37 = 0;
                                    }
                                    while (var35 > var34) {
                                        while (~var36 > ~var37) {
                                            super.field5720[arg6][var34][var36] = 0;
                                            ++var36;
                                        }
                                        ++var34;
                                    }
                                }
                            } else if (~var33 == -2) {
                                if (super.field5720[arg6] == null) {
                                    super.field5720[arg6] = new byte[super.field5725 + 1][super.field5741 + 1];
                                }
                                for (int var38 = 0; ~var38 > -65; var38 += 4) {
                                    for (int var39 = 0; var39 < 64; var39 += 4) {
                                        byte var40 = arg2.method2249((byte) -70);
                                        if (~var32 >= ~arg0) {
                                            for (int var41 = var38; ~(var38 + 4) < ~var41; ++var41) {
                                                for (int var42 = var39; var42 < var39 - -4; ++var42) {
                                                    if (var41 >= var14 && var14 + 8 > var41 && var42 >= var15 && ~(var15 + 8) < ~var15) {
                                                        int var43 = class30.method388(arg10, 7 & var42, var41 & 7, 7) + arg1;
                                                        int var44 = class163.method1026((byte) 109, 7 & var42, arg10, 7 & var41) + arg8;
                                                        if (~var43 <= -1 && var43 < super.field5725 && ~var44 <= -1 && var44 < super.field5741) {
                                                            super.field5720[arg6][var43][var44] = var40;
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
                    class15.method176(var13, 29167, arg8 >> 3, arg1 >> 3);
                }
                if (!var12 && super.field5720 != null && super.field5720[arg6] != null) {
                    int var16 = arg1 + 7;
                    int var17 = arg8 + 7;
                    for (int var18 = arg1; ~var16 < ~var18; ++var18) {
                        for (int var19 = arg8; var17 > var19; ++var19) {
                            super.field5720[arg6][var18][var19] = 0;
                        }
                    }
                    return;
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(IIB[ILr;Lun;)V")
    public final void method1789(int arg0, int arg1, byte arg2, int[] arg3, class165 arg4, class389 arg5) {
        ++field4049;
        if (!super.field5716) {
            boolean var7 = false;
            if (arg3 != null) {
                arg3[0] = -1;
            }
            class618 var8 = null;
            while (true) {
                int var20;
                label310: do {
                    while (true) {
                        while (~arg5.field5195 > ~arg5.field5205.length) {
                            int var19 = arg5.method2229(255);
                            if (var19 != 0) {
                                if (var19 == 1) {
                                    var20 = arg5.method2229(255);
                                    continue label310;
                                }
                                if (~var19 == -3) {
                                    if (var8 == null) {
                                        var8 = new class618();
                                    }
                                    var8.method3535(arg5, -7495);
                                } else if (~var19 == -129) {
                                    if (arg3 != null) {
                                        arg3[0] = arg5.method2260(-47);
                                        arg3[1] = arg5.method2270((byte) 71);
                                        arg3[2] = arg5.method2270((byte) 71);
                                        arg3[3] = arg5.method2270((byte) 71);
                                        arg3[4] = arg5.method2260(-59);
                                    } else {
                                        arg5.field5195 += 10;
                                    }
                                } else {
                                    if (var19 != 129) {
                                        throw new IllegalStateException("");
                                    }
                                    if (super.field5720 == null) {
                                        super.field5720 = new byte[4][][];
                                    }
                                    for (int var29 = 0; var29 < 4; ++var29) {
                                        byte var30 = arg5.method2249((byte) -70);
                                        if (~var30 == -1 && super.field5720[var29] != null) {
                                            int var31 = arg0;
                                            int var32 = arg0 + 64;
                                            int var33 = arg1;
                                            if (var32 >= 0) {
                                                if (~super.field5725 >= ~var32) {
                                                    var32 = super.field5725;
                                                }
                                            } else {
                                                var32 = 0;
                                            }
                                            if (~arg1 > -1) {
                                                var33 = 0;
                                            } else if (super.field5741 <= arg1) {
                                                var33 = super.field5741;
                                            }
                                            if (~arg0 > -1) {
                                                var31 = 0;
                                            } else if (~arg0 <= ~super.field5725) {
                                                var31 = super.field5725;
                                            }
                                            int var34 = arg1 + 64;
                                            if (~var34 > -1) {
                                                var34 = 0;
                                            } else if (~super.field5741 >= ~var34) {
                                                var34 = super.field5741;
                                            }
                                            while (~var32 < ~var31) {
                                                while (~var33 > ~var34) {
                                                    super.field5720[var29][var31][var33] = 0;
                                                    ++var33;
                                                }
                                                ++var31;
                                            }
                                        } else if (var30 != 1) {
                                            if (var30 == 2) {
                                                if (super.field5720[var29] == null) {
                                                    super.field5720[var29] = new byte[super.field5725 - -1][super.field5741 + 1];
                                                }
                                                if (var29 > 0) {
                                                    int var35 = arg0;
                                                    int var36 = arg0 - -64;
                                                    int var37 = arg1;
                                                    if (arg0 < 0) {
                                                        var35 = 0;
                                                    } else if (arg0 >= super.field5725) {
                                                        var35 = super.field5725;
                                                    }
                                                    if (var36 >= 0) {
                                                        if (~var36 <= ~super.field5725) {
                                                            var36 = super.field5725;
                                                        }
                                                    } else {
                                                        var36 = 0;
                                                    }
                                                    if (arg1 < 0) {
                                                        var37 = 0;
                                                    } else if (super.field5741 <= arg1) {
                                                        var37 = super.field5741;
                                                    }
                                                    int var38 = arg1 + 64;
                                                    if (var38 < 0) {
                                                        var38 = 0;
                                                    } else if (~var38 <= ~super.field5741) {
                                                        var38 = super.field5741;
                                                    }
                                                    while (~var35 > ~var36) {
                                                        while (~var38 < ~var37) {
                                                            super.field5720[var29][var35][var37] = super.field5720[var29 + -1][var35][var37];
                                                            ++var37;
                                                        }
                                                        ++var35;
                                                    }
                                                }
                                            }
                                        } else {
                                            if (super.field5720[var29] == null) {
                                                super.field5720[var29] = new byte[super.field5725 + 1][super.field5741 - -1];
                                            }
                                            for (int var39 = 0; var39 < 64; var39 += 4) {
                                                for (int var40 = 0; ~var40 > -65; var40 += 4) {
                                                    byte var41 = arg5.method2249((byte) -70);
                                                    for (int var42 = var39 - -arg0; ~var42 > ~(arg0 + var39 - -4); ++var42) {
                                                        for (int var43 = arg1 + var40; var43 < var40 + 4 + arg1; ++var43) {
                                                            if (var42 >= 0 && var42 < super.field5725 && var43 >= 0 && ~super.field5741 < ~var43) {
                                                                super.field5720[var29][var42][var43] = var41;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    var7 = true;
                                }
                            } else {
                                var8 = new class618(arg5);
                            }
                        }
                        int var9 = -82 % ((65 - arg2) / 42);
                        if (var8 != null) {
                            for (int var10 = 0; ~var10 > -9; ++var10) {
                                for (int var11 = 0; ~var11 > -9; ++var11) {
                                    int var12 = (arg0 >> 3) + var10;
                                    int var13 = (arg1 >> 3) + var11;
                                    if (var12 >= 0 && var12 < super.field5725 >> 3 && ~var13 <= -1 && super.field5741 >> 3 > var13) {
                                        class15.method176(var8, 29167, var13, var12);
                                    }
                                }
                            }
                        }
                        if (!var7 && super.field5720 != null) {
                            for (int var14 = 0; var14 < 4; ++var14) {
                                if (super.field5720[var14] != null) {
                                    for (int var15 = 0; ~var15 > -17; ++var15) {
                                        for (int var16 = 0; ~var16 > -17; ++var16) {
                                            int var17 = (arg0 >> 2) + var15;
                                            int var18 = (arg1 >> 2) + var16;
                                            if (~var17 <= -1 && var17 < 26 && var18 >= 0 && var18 < 26) {
                                                super.field5720[var14][var17][var18] = 0;
                                            }
                                        }
                                    }
                                }
                            }
                            return;
                        }
                        return;
                    }
                } while (~var20 >= -1);
                for (int var21 = 0; var21 < var20; ++var21) {
                    class475 var22 = new class475(arg4, arg5, 2);
                    if (var22.field6644 == 31) {
                        class251 var23 = class39.field731.method1390((byte) 105, arg5.method2260(-124));
                        var22.method2792(var23.field3441, var23.field3437, var23.field3439, var23.field3438, 12560);
                    }
                    if (arg4.method232() > 0) {
                        class530 var24 = var22.field6647;
                        int var25 = var24.method3118(34037) - -(arg0 << 9);
                        int var26 = var24.method3115(-30190) + (arg1 << 9);
                        int var27 = var25 >> 9;
                        int var28 = var26 >> 9;
                        if (var27 >= 0 && ~var28 <= -1 && var27 < super.field5725 && ~var28 > ~super.field5741) {
                            var24.method1159(super.field5728[var22.field6636][var27][var28] - var24.method3119(3553), var25, var26, false);
                            class689.method3891(var22);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(ILga;IIIILr;)V")
    public final void method1790(int arg0, class370 arg1, int arg2, int arg3, int arg4, int arg5, class165 arg6) {
        ++field4053;
        class691 var8 = null;
        if (arg4 == arg5) {
            var8 = (class691) class511.method3030(arg3, arg0, arg2);
        }
        if (~arg4 == -2) {
            var8 = (class691) class168.method1059(arg3, arg0, arg2);
        }
        if (~arg4 == -3) {
            var8 = (class691) class564.method3296(arg3, arg0, arg2, field4059 != null ? field4059 : (field4059 = method1798("pn")));
        }
        if (~arg4 == -4) {
            var8 = (class691) class403.method2429(arg3, arg0, arg2);
        }
        if (var8 != null) {
            class232 var9 = class37.field703.method807(0, var8.method1072(4378));
            int var10 = var8.method1070(arg5 ^ -24359);
            int var11 = var8.method1067((byte) 68);
            if (var9.method1415((byte) 105)) {
                class197.method1206(arg0, arg2, var9, (byte) -44, arg3);
            }
            if (var8.method1069(17819)) {
                var8.method1073((byte) 73, arg6);
            }
            if (arg4 == 0) {
                class177.method1110(arg3, arg0, arg2);
                if (~var9.field3016 != -1) {
                    arg1.method2146(var11, var9.field3058, arg2, arg5 + 134217728, arg0, var10, !var9.field3027);
                }
                if (~var9.field3039 == -2) {
                    if (~var11 != -1) {
                        if (~var11 != -2) {
                            if (var11 != 2) {
                                if (~var11 == -4) {
                                    class432.method2597(2, arg0, 8, arg2, arg3);
                                    return;
                                }
                            } else {
                                class432.method2597(1, arg0 + 1, 8, arg2, arg3);
                            }
                            return;
                        }
                        class432.method2597(2, arg0, arg5 ^ 8, arg2 + 1, arg3);
                        return;
                    }
                    class432.method2597(1, arg0, arg5 + 8, arg2, arg3);
                    return;
                }
                return;
            }
            if (~arg4 == -2) {
                class490.method2855(arg3, arg0, arg2);
                return;
            }
            if (arg4 == 2) {
                class547.method3210(arg3, arg0, arg2, field4059 != null ? field4059 : (field4059 = method1798("pn")));
                if (var9.field3016 != 0 && ~super.field5725 < ~(arg0 - -var9.field3066) && arg2 - -var9.field3066 < super.field5741 && var9.field3105 + arg0 < super.field5725 && var9.field3105 + arg2 < super.field5741) {
                    arg1.method2141(arg2, arg5 + 131072, var9.field3066, var9.field3105, !var9.field3027, var11, var9.field3058, arg0);
                    return;
                }
                return;
            }
            if (arg4 == 3) {
                class299.method1783(arg3, arg0, arg2);
                if (~var9.field3016 == -2) {
                    arg1.method2147(arg2, arg0, 31625);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(Lr;[Lga;III[B)V")
    public final void method1791(class165 arg0, class370[] arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        ++field4056;
        if (arg2 <= 15) {
            field4052 = null;
        }
        class389 var7 = new class389(arg5);
        int var8 = -1;
        while (true) {
            int var9 = var7.method2248(26213);
            if (var9 == 0) {
                return;
            }
            var8 += var9;
            int var10 = 0;
            while (true) {
                int var11 = var7.method2266((byte) 110);
                if (var11 == 0) {
                    break;
                }
                var10 += var11 - 1;
                int var12 = 63 & var10;
                int var13 = (var10 & 4081) >> 6;
                int var14 = var10 >> 12;
                int var15 = var7.method2229(255);
                int var16 = var15 >> 2;
                int var17 = 3 & var15;
                int var18 = var13 - -arg4;
                int var19 = var12 - -arg3;
                if (var18 > 0 && var19 > 0 && var18 < super.field5725 + -1 && super.field5741 + -1 > var19) {
                    class370 var20 = null;
                    if (!super.field5716) {
                        int var21 = var14;
                        if (~(2 & class73.field1104[1][var18][var19]) == -3) {
                            var21 = var14 - 1;
                        }
                        if (var21 >= 0) {
                            var20 = arg1[var21];
                        }
                    }
                    this.method1796(var20, var17, var18, var16, var8, 0, arg0, var19, var14, var14, -1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(B)V")
    public static final void method1792(byte arg0) {
        ++field4050;
        if (arg0 <= -119) {
            if (class68.field1045.method269()) {
                class68.field1045.method256(class646.field9190);
                class273.method1636((byte) 48);
                class68.field1045.method257(class646.field9190);
                class68.field1045.method294(class646.field9190);
            } else {
                class435.method2608(94, class375.field5039);
            }
            class100.method747(false);
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(IILun;)Ljava/lang/String;")
    public static final String method1793(int arg0, int arg1, class389 arg2) {
        ++field4047;
        try {
            int var3 = arg2.method2266((byte) 110);
            if (~arg0 > ~var3) {
                var3 = arg0;
            }
            byte[] var4 = new byte[var3];
            arg2.field5195 += class263.field3622.method2728(var3, 8, arg2.field5205, 0, var4, arg2.field5195);
            return class149.method965((byte) -107, var3, arg1, var4);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(II[Lga;[BILr;IIIII)V")
    public final void method1794(int arg0, int arg1, class370[] arg2, byte[] arg3, int arg4, class165 arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        ++field4048;
        class389 var12 = new class389(arg3);
        int var13 = -1;
        while (true) {
            int var14 = var12.method2248(26213);
            if (~var14 == -1) {
                if (arg10 != -2256) {
                    field4057 = -1;
                    return;
                }
                return;
            }
            var13 += var14;
            int var15 = 0;
            while (true) {
                int var16 = var12.method2266((byte) 110);
                if (var16 == 0) {
                    break;
                }
                var15 += var16 - 1;
                int var17 = 63 & var15;
                int var18 = var15 >> 6 & 63;
                int var19 = var15 >> 12;
                int var20 = var12.method2229(255);
                int var21 = var20 >> 2;
                int var22 = 3 & var20;
                if (~arg7 == ~var19 && ~arg1 >= ~var18 && var18 < arg1 - -8 && var17 >= arg6 && ~var17 > ~(arg6 + 8)) {
                    class232 var23 = class37.field703.method807(0, var13);
                    int var24 = arg0 - -class581.method3387(var17 & 7, arg10 ^ -29108, arg4, var22, var23.field3105, var18 & 7, var23.field3066);
                    int var25 = arg9 - -class246.method1497(var17 & 7, var23.field3066, 7 & var18, 114, var22, arg4, var23.field3105);
                    if (var24 > 0 && var25 > 0 && ~(super.field5725 + -1) < ~var24 && super.field5741 + -1 > var25) {
                        class370 var26 = null;
                        if (!super.field5716) {
                            int var27 = arg8;
                            if (~(2 & class73.field1104[1][var24][var25]) == -3) {
                                var27 = arg8 - 1;
                            }
                            if (var27 >= 0) {
                                var26 = arg2[var27];
                            }
                        }
                        this.method1796(var26, arg4 + var22 & 3, var24, var21, var13, 0, arg5, var25, arg8, arg8, -1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!js", name = "c", descriptor = "(I)V")
    public static void method1795(int arg0) {
        field4052 = null;
        if (arg0 != 0) {
            field4052 = null;
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(Lga;IIIIILr;IIII)V")
    public final void method1796(class370 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class165 arg6, int arg7, int arg8, int arg9, int arg10) {
        ++field4051;
        if (class221.field2851.method1747(0, class375.field5039) || class500.method2909(arg5 ^ -126, arg2, class656.field9319, arg9, arg7)) {
            if (this.field4054 > arg8) {
                this.field4054 = arg8;
            }
            class232 var12 = class37.field703.method807(0, arg4);
            if (!arg6.method247() || !class221.field2851.field4142 || !var12.field3059) {
                int var13;
                int var14;
                if (~arg1 != -2 && arg1 != 3) {
                    var13 = var12.field3066;
                    var14 = var12.field3105;
                } else {
                    var13 = var12.field3105;
                    var14 = var12.field3066;
                }
                int var15;
                int var16;
                if (~(arg2 + var13) >= ~super.field5725) {
                    var15 = (var13 >> 1) + arg2;
                    var16 = arg2 - -(var13 + 1 >> 1);
                } else {
                    var16 = arg2 + 1;
                    var15 = arg2;
                }
                int var17;
                int var18;
                if (~super.field5741 > ~(arg7 + var14)) {
                    var17 = arg7 + 1;
                    var18 = arg7;
                } else {
                    var17 = (var14 + 1 >> 1) + arg7;
                    var18 = (var14 >> 1) + arg7;
                }
                class37 var19 = class155.field1899[arg9];
                int var20 = var19.method437(arg5 + 119, var18, var15) + var19.method437(99, var18, var16) + (var19.method437(108, var17, var15) - -var19.method437(arg5 + 127, var17, var16)) >> 2;
                int var21 = (arg2 << 9) - -(var13 << 8);
                int var22 = (arg7 << 9) + (var14 << 8);
                boolean var23 = class237.field3191 && !super.field5716 && var12.field3031;
                if (var12.method1415((byte) 117)) {
                    class679.method3852(arg2, (byte) -99, arg1, (class557) null, arg8, arg7, var12, (class613) null);
                }
                boolean var24 = arg10 == -1 && ~var12.field3090 == 0 && var12.field3051 == null && var12.field3094 == null && !var12.field3064;
                if (!class289.field3929 || (!class466.method2732(0, arg3) || ~var12.field3039 == -2) && (!class40.method449(arg3, -127) || var12.field3039 != 0)) {
                    if (~arg3 == -23) {
                        if (class221.field2851.field4165 || var12.field3029 != 0 || var12.field3016 == 1 || var12.field3076) {
                            class524 var25;
                            if (!var24) {
                                var25 = new class440(arg6, var12, arg8, arg9, var21, var20, var22, super.field5716, arg1, arg10);
                            } else {
                                class687 var26 = new class687(arg6, var12, arg8, arg9, var21, var20, var22, super.field5716, arg1, var23);
                                if (var26.method1069(17819)) {
                                    var26.method1068(-110, arg6);
                                }
                                var25 = var26;
                            }
                            class120.method839(arg8, arg2, arg7, var25);
                            if (~var12.field3016 == -2 && arg0 != null) {
                                arg0.method2145(arg7, arg2, 0);
                            }
                        }
                    } else if (arg3 != 10 && arg3 != 11) {
                        if (~arg3 <= -13 && arg3 <= 17 || arg3 >= 18 && arg3 <= 21) {
                            class43 var27;
                            if (!var24) {
                                var27 = new class532(arg6, var12, arg8, arg9, var21, var20, var22, super.field5716, arg2, arg2 + var13 + -1, arg7, arg7 + var14 - 1, arg3, arg1, arg10);
                            } else {
                                class631 var28 = new class631(arg6, var12, arg8, arg9, var21, var20, var22, super.field5716, arg2, arg2 - (-var13 - -1), arg7, arg7 - -var14 - 1, arg3, arg1, var23);
                                if (var28.method1069(17819)) {
                                    var28.method1068(arg5 ^ -97, arg6);
                                }
                                var27 = var28;
                            }
                            class667.method3777(var27, false);
                            if (class237.field3191 && !super.field5716 && ~arg3 <= -13 && arg3 <= 17 && ~arg3 != -14 && ~arg8 < -1 && var12.field3039 != 0) {
                                super.field5734[arg8][arg2][arg7] = (byte) class242.method1474(super.field5734[arg8][arg2][arg7], 4);
                            }
                            if (~var12.field3016 != -1 && arg0 != null) {
                                arg0.method2144(var14, var13, !var12.field3027, arg2, 1073741824, arg7, var12.field3058);
                            }
                        } else if (arg3 == arg5) {
                            int var29 = var12.field3039;
                            if (class268.field3672 && var12.field3039 == -1) {
                                var29 = 1;
                            }
                            class242 var30;
                            if (!var24) {
                                var30 = new class170(arg6, var12, arg8, arg9, var21, var20, var22, super.field5716, arg3, arg1, arg10);
                            } else {
                                class421 var31 = new class421(arg6, var12, arg8, arg9, var21, var20, var22, super.field5716, arg3, arg1, var23);
                                if (var31.method1069(arg5 ^ 17819)) {
                                    var31.method1068(-124, arg6);
                                }
                                var30 = var31;
                            }
                            class354.method2002(arg8, arg2, arg7, var30, (class242) null);
                            if (arg1 != 0) {
                                if (arg1 != 1) {
                                    if (~arg1 != -3) {
                                        if (~arg1 == -4) {
                                            if (class237.field3191 && var12.field3014) {
                                                var19.method434(arg2, arg7, 50);
                                                var19.method434(arg2 + 1, arg7, 50);
                                            }
                                            if (var29 == 1 && !super.field5716) {
                                                class266.method1614(2, arg2, var12.field3036, var12.field3107, arg7, arg8, -90);
                                            }
                                        }
                                    } else {
                                        if (class237.field3191 && var12.field3014) {
                                            var19.method434(arg2 + 1, arg7, 50);
                                            var19.method434(arg2 + 1, arg7 - -1, 50);
                                        }
                                        if (var29 == 1 && !super.field5716) {
                                            class266.method1614(1, arg2 + 1, -var12.field3036, var12.field3107, arg7, arg8, -68);
                                        }
                                    }
                                } else {
                                    if (class237.field3191 && var12.field3014) {
                                        var19.method434(arg2, arg7 + 1, 50);
                                        var19.method434(arg2 + 1, arg7 + 1, 50);
                                    }
                                    if (~var29 == -2 && !super.field5716) {
                                        class266.method1614(2, arg2, -var12.field3036, var12.field3107, arg7 + 1, arg8, arg5 + -99);
                                    }
                                }
                            } else {
                                if (class237.field3191 && var12.field3014) {
                                    var19.method434(arg2, arg7, 50);
                                    var19.method434(arg2, arg7 + 1, 50);
                                }
                                if (~var29 == -2 && !super.field5716) {
                                    class266.method1614(1, arg2, var12.field3036, var12.field3107, arg7, arg8, -19);
                                }
                            }
                            if (~var12.field3016 != -1 && arg0 != null) {
                                arg0.method2134(arg3, !var12.field3027, arg2, arg7, var12.field3058, 20480, arg1);
                            }
                            if (~var12.field3071 != -65) {
                                class618.method3539(arg8, arg2, arg7, var12.field3071);
                            }
                        } else if (~arg3 == -2) {
                            class242 var32;
                            if (!var24) {
                                var32 = new class170(arg6, var12, arg8, arg9, var21, var20, var22, super.field5716, arg3, arg1, arg10);
                            } else {
                                class421 var33 = new class421(arg6, var12, arg8, arg9, var21, var20, var22, super.field5716, arg3, arg1, var23);
                                if (var33.method1069(17819)) {
                                    var33.method1068(arg5 + -127, arg6);
                                }
                                var32 = var33;
                            }
                            class354.method2002(arg8, arg2, arg7, var32, (class242) null);
                            if (var12.field3014 && class237.field3191) {
                                if (~arg1 != -1) {
                                    if (~arg1 != -2) {
                                        if (arg1 != 2) {
                                            if (~arg1 == -4) {
                                                var19.method434(arg2, arg7, 50);
                                            }
                                        } else {
                                            var19.method434(arg2 - -1, arg7, 50);
                                        }
                                    } else {
                                        var19.method434(arg2 - -1, arg7 + 1, 50);
                                    }
                                } else {
                                    var19.method434(arg2, arg7 - -1, 50);
                                }
                            }
                            if (var12.field3016 != 0 && arg0 != null) {
                                arg0.method2134(arg3, !var12.field3027, arg2, arg7, var12.field3058, arg5 + 20480, arg1);
                            }
                        } else if (arg3 == 2) {
                            int var34 = arg1 + 1 & 3;
                            class242 var35;
                            class242 var36;
                            if (!var24) {
                                var35 = new class170(arg6, var12, arg8, arg9, var21, var20, var22, super.field5716, arg3, arg1 - -4, arg10);
                                var36 = new class170(arg6, var12, arg8, arg9, var21, var20, var22, super.field5716, arg3, var34, arg10);
                            } else {
                                class421 var37 = new class421(arg6, var12, arg8, arg9, var21, var20, var22, super.field5716, arg3, arg1 + 4, var23);
                                class421 var38 = new class421(arg6, var12, arg8, arg9, var21, var20, var22, super.field5716, arg3, var34, var23);
                                if (var37.method1069(17819)) {
                                    var37.method1068(arg5 ^ -83, arg6);
                                }
                                var35 = var37;
                                var36 = var38;
                                if (var38.method1069(arg5 + 17819)) {
                                    var38.method1068(-85, arg6);
                                }
                            }
                            class354.method2002(arg8, arg2, arg7, var35, var36);
                            if ((var12.field3039 == 1 || class268.field3672 && ~var12.field3039 == 0) && !super.field5716) {
                                if (~arg1 == -1) {
                                    class266.method1614(1, arg2, var12.field3036, var12.field3107, arg7, arg8, -79);
                                    class266.method1614(2, arg2, var12.field3036, var12.field3107, arg7 - -1, arg8, -122);
                                } else if (~arg1 != -2) {
                                    if (arg1 != 2) {
                                        if (~arg1 == -4) {
                                            class266.method1614(1, arg2, var12.field3036, var12.field3107, arg7, arg8, -122);
                                            class266.method1614(2, arg2, var12.field3036, var12.field3107, arg7, arg8, 123);
                                        }
                                    } else {
                                        class266.method1614(1, arg2 + 1, var12.field3036, var12.field3107, arg7, arg8, -47);
                                        class266.method1614(2, arg2, var12.field3036, var12.field3107, arg7, arg8, 127);
                                    }
                                } else {
                                    class266.method1614(1, arg2 - -1, var12.field3036, var12.field3107, arg7, arg8, arg5 ^ 121);
                                    class266.method1614(2, arg2, var12.field3036, var12.field3107, arg7 + 1, arg8, arg5 ^ 21);
                                }
                            }
                            if (~var12.field3016 != -1 && arg0 != null) {
                                arg0.method2134(arg3, !var12.field3027, arg2, arg7, var12.field3058, 20480, arg1);
                            }
                            if (var12.field3071 != 64) {
                                class618.method3539(arg8, arg2, arg7, var12.field3071);
                            }
                        } else if (arg3 == 3) {
                            class242 var40;
                            if (var24) {
                                class421 var39 = new class421(arg6, var12, arg8, arg9, var21, var20, var22, super.field5716, arg3, arg1, var23);
                                if (var39.method1069(17819)) {
                                    var39.method1068(-107, arg6);
                                }
                                var40 = var39;
                            } else {
                                var40 = new class170(arg6, var12, arg8, arg9, var21, var20, var22, super.field5716, arg3, arg1, arg10);
                            }
                            class354.method2002(arg8, arg2, arg7, var40, (class242) null);
                            if (var12.field3014 && class237.field3191) {
                                if (arg1 != 0) {
                                    if (arg1 == 1) {
                                        var19.method434(arg2 + 1, arg7 + 1, 50);
                                    } else if (arg1 != 2) {
                                        if (~arg1 == -4) {
                                            var19.method434(arg2, arg7, 50);
                                        }
                                    } else {
                                        var19.method434(arg2 + 1, arg7, 50);
                                    }
                                } else {
                                    var19.method434(arg2, arg7 + 1, 50);
                                }
                            }
                            if (~var12.field3016 != -1 && arg0 != null) {
                                arg0.method2134(arg3, !var12.field3027, arg2, arg7, var12.field3058, 20480, arg1);
                            }
                        } else if (~arg3 == -10) {
                            class43 var41;
                            if (!var24) {
                                var41 = new class532(arg6, var12, arg8, arg9, var21, var20, var22, super.field5716, arg2, var13 - 1 + arg2, arg7, var14 + -1 + arg7, arg3, arg1, arg10);
                            } else {
                                class631 var42 = new class631(arg6, var12, arg8, arg9, var21, var20, var22, super.field5716, arg2, arg2, arg7, arg7, arg3, arg1, var23);
                                if (var42.method1069(17819)) {
                                    var42.method1068(arg5 + -71, arg6);
                                }
                                var41 = var42;
                            }
                            class667.method3777(var41, false);
                            if (~var12.field3016 != -1 && arg0 != null) {
                                arg0.method2144(var14, var13, !var12.field3027, arg2, 1073741824, arg7, var12.field3058);
                            }
                            if (~var12.field3071 != -65) {
                                class618.method3539(arg8, arg2, arg7, var12.field3071);
                            }
                        } else if (~arg3 == -5) {
                            class480 var43;
                            if (!var24) {
                                var43 = new class466(arg6, var12, arg8, arg9, var21, var20, var22, super.field5716, 0, 0, arg3, arg1, arg10);
                            } else {
                                class473 var44 = new class473(arg6, var12, arg8, arg9, var21, var20, var22, super.field5716, 0, 0, arg3, arg1);
                                var43 = var44;
                                if (var44.method1069(arg5 ^ 17819)) {
                                    var44.method1068(-46, arg6);
                                }
                            }
                            class351.method1996(arg8, arg2, arg7, var43, (class480) null);
                        } else if (~arg3 == -6) {
                            int var45 = 65;
                            class691 var46 = (class691) class511.method3030(arg8, arg2, arg7);
                            if (var46 != null) {
                                var45 = class37.field703.method807(0, var46.method1072(arg5 ^ 4378)).field3071 + 1;
                            }
                            class480 var47;
                            if (!var24) {
                                var47 = new class466(arg6, var12, arg8, arg9, var21, var20, var22, super.field5716, class186.field2274[arg1] * var45, class519.field7617[arg1] * var45, arg3, arg1, arg10);
                            } else {
                                class473 var48 = new class473(arg6, var12, arg8, arg9, var21, var20, var22, super.field5716, class186.field2274[arg1] * var45, class519.field7617[arg1] * var45, arg3, arg1);
                                var47 = var48;
                                if (var48.method1069(arg5 + 17819)) {
                                    var48.method1068(-77, arg6);
                                }
                            }
                            class351.method1996(arg8, arg2, arg7, var47, (class480) null);
                        } else if (arg3 == 6) {
                            int var49 = 33;
                            class691 var50 = (class691) class511.method3030(arg8, arg2, arg7);
                            if (var50 != null) {
                                var49 = 1 + class37.field703.method807(arg5, var50.method1072(4378)).field3071 / 2;
                            }
                            class480 var52;
                            if (var24) {
                                class473 var51 = new class473(arg6, var12, arg8, arg9, var21, var20, var22, super.field5716, class186.field2274[arg1] * var49, class519.field7617[arg1] * var49, arg3, arg1 + 4);
                                if (var51.method1069(17819)) {
                                    var51.method1068(arg5 ^ -96, arg6);
                                }
                                var52 = var51;
                            } else {
                                var52 = new class466(arg6, var12, arg8, arg9, var21, var20, var22, super.field5716, class680.field9741[arg1] * var49, class298.field4002[arg1] * var49, arg3, arg1 + 4, arg10);
                            }
                            class351.method1996(arg8, arg2, arg7, var52, (class480) null);
                        } else if (arg3 == 7) {
                            int var53 = 3 & arg1 + 2;
                            class480 var55;
                            if (var24) {
                                class473 var54 = new class473(arg6, var12, arg8, arg9, var21, var20, var22, super.field5716, 0, 0, arg3, var53 + 4);
                                if (var54.method1069(17819)) {
                                    var54.method1068(arg5 ^ -34, arg6);
                                }
                                var55 = var54;
                            } else {
                                var55 = new class466(arg6, var12, arg8, arg9, var21, var20, var22, super.field5716, 0, 0, arg3, var53 + 4, arg10);
                            }
                            class351.method1996(arg8, arg2, arg7, var55, (class480) null);
                        } else if (arg3 == 8) {
                            int var56 = arg1 + 2 & 3;
                            int var57 = 33;
                            class691 var58 = (class691) class511.method3030(arg8, arg2, arg7);
                            if (var58 != null) {
                                var57 = 1 + class37.field703.method807(0, var58.method1072(4378)).field3071 / 2;
                            }
                            class480 var61;
                            class480 var62;
                            if (var24) {
                                class473 var59 = new class473(arg6, var12, arg8, arg9, var21, var20, var22, super.field5716, class680.field9741[arg1] * var57, class298.field4002[arg1] * var57, arg3, arg1 + 4);
                                class473 var60 = new class473(arg6, var12, arg8, arg9, var21, var20, var22, super.field5716, 0, 0, arg3, var56 + 4);
                                if (var59.method1069(17819)) {
                                    var59.method1068(-85, arg6);
                                }
                                var61 = var60;
                                var62 = var59;
                                if (var60.method1069(17819)) {
                                    var60.method1068(arg5 + -42, arg6);
                                }
                            } else {
                                class466 var63 = new class466(arg6, var12, arg8, arg9, var21, var20, var22, super.field5716, class680.field9741[arg1] * var57, class298.field4002[arg1] * var57, arg3, arg1 + 4, arg10);
                                class466 var64 = new class466(arg6, var12, arg8, arg9, var21, var20, var22, super.field5716, 0, 0, arg3, var56 + 4, arg10);
                                var62 = var63;
                                var61 = var64;
                            }
                            class351.method1996(arg8, arg2, arg7, var62, var61);
                        }
                    } else {
                        class631 var65 = null;
                        int var67;
                        class43 var68;
                        if (var24) {
                            class631 var66 = new class631(arg6, var12, arg8, arg9, var21, var20, var22, super.field5716, arg2, arg2 - -var13 - 1, arg7, arg7 + var14 + -1, arg3, arg1, var23);
                            var65 = var66;
                            var67 = var66.method3615((byte) 120);
                            var68 = var66;
                        } else {
                            var67 = 15;
                            var68 = new class532(arg6, var12, arg8, arg9, var21, var20, var22, super.field5716, arg2, arg2 + -1 + var13, arg7, var14 - 1 + arg7, arg3, arg1, arg10);
                        }
                        if (class667.method3777(var68, false)) {
                            if (var65 != null && var65.method1069(17819)) {
                                var65.method1068(-46, arg6);
                            }
                            if (var12.field3014 && class237.field3191) {
                                if (~var67 < -31) {
                                    var67 = 30;
                                }
                                for (int var69 = 0; var69 <= var13; ++var69) {
                                    for (int var70 = 0; ~var70 >= ~var14; ++var70) {
                                        var19.method434(arg2 + var69, arg7 + var70, var67);
                                    }
                                }
                            }
                        }
                        if (~var12.field3016 != -1 && arg0 != null) {
                            arg0.method2144(var14, var13, !var12.field3027, arg2, 1073741824, arg7, var12.field3058);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(ILr;Z)V")
    public final void method1797(int arg0, class165 arg1, boolean arg2) {
        class184.method1145();
        ++field4055;
        if (arg0 >= -102) {
            field4057 = 73;
        }
        if (!arg2) {
            if (~super.field5732 < -2) {
                for (int var4 = 0; var4 < super.field5725; ++var4) {
                    for (int var5 = 0; var5 < super.field5741; ++var5) {
                        if ((2 & class73.field1104[1][var4][var5]) == 2) {
                            class32.method404(var4, var5);
                        }
                    }
                }
            }
            for (int var6 = 0; ~var6 > ~super.field5732; ++var6) {
                for (int var7 = 0; ~var7 >= ~super.field5741; ++var7) {
                    for (int var8 = 0; ~super.field5725 <= ~var8; ++var8) {
                        if ((super.field5734[var6][var8][var7] & 4) != 0) {
                            int var9 = var8;
                            int var10 = var8;
                            int var11 = var7;
                            int var12 = var7;
                            while (~var11 < -1 && ~(super.field5734[var6][var8][var11 + -1] & 4) != -1 && var12 - var11 < 10) {
                                --var11;
                            }
                            while (super.field5741 > var12 && (super.field5734[var6][var8][var12 + 1] & 4) != 0 && ~(var12 - var11) > -11) {
                                ++var12;
                            }
                            label117: while (var9 > 0 && ~(var10 - var9) > -11) {
                                for (int var13 = var11; var12 >= var13; ++var13) {
                                    if ((super.field5734[var6][var9 + -1][var13] & 4) == 0) {
                                        break label117;
                                    }
                                }
                                --var9;
                            }
                            label104: while (~super.field5725 < ~var10 && ~(-var9 + var10) > -11) {
                                for (int var14 = var11; ~var12 <= ~var14; ++var14) {
                                    if (~(4 & super.field5734[var6][var10 - -1][var14]) == -1) {
                                        break label104;
                                    }
                                }
                                ++var10;
                            }
                            if (~((var12 - (var11 + -1)) * (-var9 + 1 + var10)) <= -5) {
                                int var15 = super.field5728[var6][var9][var11];
                                class614.method3527((var12 << 9) + 512, var9 << 9, var6, var11 << 9, var15, (var10 << 9) + 512, 0, 4, var15);
                                for (int var16 = var9; var10 >= var16; ++var16) {
                                    for (int var17 = var11; ~var12 <= ~var17; ++var17) {
                                        super.field5734[var6][var16][var17] = (byte) class435.method2605(super.field5734[var6][var16][var17], -5);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            class55.method578(true);
        }
        super.field5734 = null;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!js", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1798(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
