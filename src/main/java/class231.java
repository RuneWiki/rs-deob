import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class231 extends class248 {

    @OriginalMember(owner = "client!oh", name = "u", descriptor = "I")
    public int field3848 = -1;

    @OriginalMember(owner = "client!oh", name = "m", descriptor = "I")
    public static int field3840;

    @OriginalMember(owner = "client!oh", name = "n", descriptor = "I")
    public static int field3841;

    @OriginalMember(owner = "client!oh", name = "o", descriptor = "I")
    public static int field3842;

    @OriginalMember(owner = "client!oh", name = "p", descriptor = "I")
    public static int field3843;

    @OriginalMember(owner = "client!oh", name = "r", descriptor = "I")
    public static int field3845;

    @OriginalMember(owner = "client!oh", name = "s", descriptor = "I")
    public static int field3846;

    @OriginalMember(owner = "client!oh", name = "v", descriptor = "I")
    public int field3849;

    @OriginalMember(owner = "client!oh", name = "q", descriptor = "Ljava/lang/String;")
    public String field3844;

    @OriginalMember(owner = "client!oh", name = "t", descriptor = "Ljava/lang/String;")
    public String field3847;

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "(I)V")
    public static final void method1638(int arg0) {
        if (arg0 != 2015625216) {
            method1639(-74);
        }
        class368.field5580.method336(79);
        ++field3845;
    }

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "(I)V")
    public static final void method1639(int arg0) {
        ++field3840;
        if (class357.method2331((byte) 80) == 2) {
            byte var1 = (byte) (class264.field4260 + -4 & 255);
            int var2 = class264.field4260 % class80.field1003;
            for (int var3 = 0; var3 < 4; ++var3) {
                for (int var16 = 0; ~var16 > ~class380.field5751; ++var16) {
                    class427.field6304[var3][var2][var16] = var1;
                }
            }
            if (~class266.field4286 != -4) {
                for (int var4 = 0; ~var4 > -3; ++var4) {
                    class411.field6091[var4] = -1000000;
                    class414.field6126[var4] = 1000000;
                    class102.field1428[var4] = 0;
                    class377.field5699[var4] = 1000000;
                    class97.field1305[var4] = 0;
                }
                if (arg0 != -1) {
                    method1641(36, -57, 6, (class303) null, (class303) null);
                }
                if (class13.field194 == 1) {
                    if ((class31.field382[class266.field4286][class261.field4201.field724 >> 7][class261.field4201.field722 >> 7] & 4) != 0) {
                        class198.method1385(false, false, class423.field6252, class261.field4201.field724 >> 7, class261.field4201.field722 >> 7, 0);
                    }
                    if (class396.field5928 < 2560) {
                        int var5 = class427.field6301 >> 7;
                        int var6 = class290.field4631 >> 7;
                        int var7 = class261.field4201.field724 >> 7;
                        int var8 = class261.field4201.field722 >> 7;
                        int var9;
                        if (var7 <= var5) {
                            var9 = -var7 + var5;
                        } else {
                            var9 = var7 - var5;
                        }
                        int var10;
                        if (var8 > var6) {
                            var10 = -var6 + var8;
                        } else {
                            var10 = -var8 + var6;
                        }
                        if ((var9 != 0 || var10 != 0) && -class80.field1003 < var9 && ~class80.field1003 < ~var9 && ~(-class380.field5751) > ~var10 && class380.field5751 > var10) {
                            if (~var9 < ~var10) {
                                int var11 = var10 * 65536 / var9;
                                int var12 = 32768;
                                while (var5 != var7) {
                                    if (var7 > var5) {
                                        ++var5;
                                    } else if (var7 < var5) {
                                        --var5;
                                    }
                                    if (~(class31.field382[class266.field4286][var5][var6] & 4) != -1) {
                                        class198.method1385(false, false, class423.field6252, var5, var6, 1);
                                        return;
                                    }
                                    var12 += var11;
                                    if (~var12 <= -65537) {
                                        var12 -= 65536;
                                        if (~var8 >= ~var6) {
                                            if (~var8 > ~var6) {
                                                --var6;
                                            }
                                        } else {
                                            ++var6;
                                        }
                                        if (~(class31.field382[class266.field4286][var5][var6] & 4) != -1) {
                                            class198.method1385(false, false, class423.field6252, var5, var6, 1);
                                            return;
                                        }
                                    }
                                }
                                return;
                            }
                            int var13 = var9 * 65536 / var10;
                            int var14 = 32768;
                            while (var6 != var8) {
                                if (var8 <= var6) {
                                    if (~var6 < ~var8) {
                                        --var6;
                                    }
                                } else {
                                    ++var6;
                                }
                                if (~(4 & class31.field382[class266.field4286][var5][var6]) != -1) {
                                    class198.method1385(false, false, class423.field6252, var5, var6, 1);
                                    return;
                                }
                                var14 += var13;
                                if (var14 >= 65536) {
                                    if (var7 <= var5) {
                                        if (~var5 < ~var7) {
                                            --var5;
                                        }
                                    } else {
                                        ++var5;
                                    }
                                    var14 -= 65536;
                                    if ((class31.field382[class266.field4286][var5][var6] & 4) != 0) {
                                        class198.method1385(false, false, class423.field6252, var5, var6, 1);
                                        return;
                                    }
                                }
                            }
                            return;
                        }
                        class272.method1845((Throwable) null, 124, "RC: " + var5 + "," + var6 + " " + var7 + "," + var8 + " " + class409.field6048 + "," + class444.field6481);
                        return;
                    }
                } else {
                    int var15 = class58.method386(class266.field4286, (byte) -112, class427.field6301, class290.field4631);
                    if (~(-class379.field5733 + var15) <= -801 || (class31.field382[class266.field4286][class427.field6301 >> 7][class290.field4631 >> 7] & 4) == 0) {
                        return;
                    }
                    class198.method1385(false, false, class423.field6252, class427.field6301 >> 7, class290.field4631 >> 7, 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "(I)Lwb;")
    public final class179 method1640(int arg0) {
        if (arg0 != 21626) {
            this.field3849 = -35;
        }
        ++field3842;
        return class298.field4730[super.field4060];
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIILcb;Lcb;)V")
    public static final void method1641(int arg0, int arg1, int arg2, class303 arg3, class303 arg4) {
        if (class423.field6252[arg0][arg1][arg2] == null) {
            class362.method2345(arg0, arg1, arg2);
        }
        class423.field6252[arg0][arg1][arg2].field3878 = arg3;
        class423.field6252[arg0][arg1][arg2].field3889 = arg4;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIIIII)V")
    public static final void method1642(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field3846;
        int var6 = 0;
        int var7 = arg5;
        int var8 = arg1 * arg1;
        int var9 = arg5 * arg5;
        if (arg2 != 1653400929) {
            method1642(-114, -44, 102, 79, 49, -26);
        }
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg5 << 1;
        int var13 = (-var12 + 1) * var8 + var10;
        int var14 = -((var12 + -1) * var11) + var9;
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) - -3) * var10;
        int var18 = ((arg5 << 1) + -3) * var11;
        int var19 = (var6 + 1) * var16;
        if (~class99.field1378 >= ~arg4 && arg4 <= class396.field5925) {
            int var20 = class21.method153(arg0 + arg1, (byte) -74, class185.field3005, class406.field6033);
            int var21 = class21.method153(-arg1 + arg0, (byte) -113, class185.field3005, class406.field6033);
            class256.method1769(var20, class277.field4414[arg4], (byte) 86, arg3, var21);
        }
        int var22 = (arg5 + -1) * var15;
        while (var7 > 0) {
            if (~var13 > -1) {
                while (var13 < 0) {
                    var13 += var17;
                    var14 += var19;
                    var19 += var16;
                    ++var6;
                    var17 += var16;
                }
            }
            if (var14 < 0) {
                var14 += var19;
                var13 += var17;
                ++var6;
                var19 += var16;
                var17 += var16;
            }
            var13 += -var22;
            var14 += -var18;
            --var7;
            var18 -= var15;
            var22 -= var15;
            int var23 = -var7 + arg4;
            int var24 = arg4 - -var7;
            if (~var24 <= ~class99.field1378 && ~var23 >= ~class396.field5925) {
                int var25 = class21.method153(arg0 + var6, (byte) -100, class185.field3005, class406.field6033);
                int var26 = class21.method153(-var6 + arg0, (byte) -81, class185.field3005, class406.field6033);
                if (var23 >= class99.field1378) {
                    class256.method1769(var25, class277.field4414[var23], (byte) 96, arg3, var26);
                }
                if (~class396.field5925 <= ~var24) {
                    class256.method1769(var25, class277.field4414[var24], (byte) 79, arg3, var26);
                }
            }
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIIIZIIIIII)Z")
    public static final boolean method1643(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        ++field3843;
        int var11 = class341.method2239(arg10, class33.field413, arg1, -3, arg9, class73.field921, arg8, arg2, class162.field2547[class266.field4286], arg0, arg5, class261.field4201.method903(-60), arg4, arg3, arg6);
        if (~var11 > -2) {
            return false;
        } else {
            class19.field254 = class73.field921[var11 + -1];
            class132.field2062 = class33.field413[arg7 + var11];
            class357.field5460 = false;
            class375.method2394((byte) 23);
            return true;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIILfn;IIIIIII)Z")
    public static final boolean method1644(int arg0, int arg1, int arg2, class72 arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        ++field3841;
        int var11 = arg10;
        int var12 = arg2;
        byte var13 = 64;
        byte var14 = 64;
        if (arg1 != 1625554944) {
            return true;
        } else {
            int var15 = -var13 + arg10;
            class74.field939[var13][var14] = 99;
            int var16 = -var14 + arg2;
            class238.field3973[var13][var14] = 0;
            byte var17 = 0;
            class303.field4790[var17] = arg10;
            int var18 = 0;
            byte var10001 = var17;
            int var26 = var17 + 1;
            class354.field5453[var10001] = arg2;
            int[][] var19 = arg3.field889;
            while (~var26 != ~var18) {
                var11 = class303.field4790[var18];
                var12 = class354.field5453[var18];
                int var20 = -var16 + var12;
                int var21 = -var15 + var11;
                var18 = var18 + 1 & 4095;
                int var22 = -arg3.field896 + var11;
                int var23 = var12 - arg3.field911;
                if (~arg9 != 3) {
                    if (arg9 != -3) {
                        if (arg9 != -2) {
                            if (~arg9 != 0) {
                                if (arg9 != 0 && ~arg9 != -2 && arg9 != 2 && ~arg9 != -4 && arg9 != 9) {
                                    if (arg3.method463(arg5, 2, arg9, (byte) -127, arg6, var11, var12, arg7)) {
                                        class134.field2111 = var12;
                                        class193.field3142 = var11;
                                        return true;
                                    }
                                } else if (arg3.method462(arg9, var12, 2, arg6, arg5, var11, arg7, 38)) {
                                    class193.field3142 = var11;
                                    class134.field2111 = var12;
                                    return true;
                                }
                            } else if (arg3.method457(var11, arg0, 2, arg4, var12, 90, arg7, arg5, arg8)) {
                                class134.field2111 = var12;
                                class193.field3142 = var11;
                                return true;
                            }
                        } else if (arg3.method455(arg4, arg0, arg8, arg7, var11, 2, arg5, var12, arg1 ^ 1625583247, 2)) {
                            class193.field3142 = var11;
                            class134.field2111 = var12;
                            return true;
                        }
                    } else if (class62.method407(2, 2, true, var12, arg7, var11, arg8, arg0, arg5)) {
                        class193.field3142 = var11;
                        class134.field2111 = var12;
                        return true;
                    }
                } else if (~arg5 == ~var11 && arg7 == var12) {
                    class134.field2111 = var12;
                    class193.field3142 = var11;
                    return true;
                }
                int var25 = class238.field3973[var21][var20] - -1;
                if (var21 > 0 && class74.field939[var21 - 1][var20] == 0 && ~(1134821376 & var19[var22 - 1][var23]) == -1 && ~(var19[var22 - 1][var23 + 1] & 1310982144) == -1) {
                    class303.field4790[var26] = var11 - 1;
                    class354.field5453[var26] = var12;
                    var26 = var26 + 1 & 4095;
                    class74.field939[var21 + -1][var20] = 2;
                    class238.field3973[var21 - 1][var20] = var25;
                }
                if (~var21 > -127 && ~class74.field939[var21 + 1][var20] == -1 && ~(1625554944 & var19[var22 + 2][var23]) == -1 && ~(2015625216 & var19[var22 - -2][var23 + 1]) == -1) {
                    class303.field4790[var26] = var11 + 1;
                    class354.field5453[var26] = var12;
                    class74.field939[var21 + 1][var20] = 8;
                    var26 = 4095 & var26 + 1;
                    class238.field3973[var21 + 1][var20] = var25;
                }
                if (var20 > 0 && class74.field939[var21][var20 + -1] == 0 && (1134821376 & var19[var22][var23 + -1]) == 0 && (1625554944 & var19[var22 + 1][var23 + -1]) == 0) {
                    class303.field4790[var26] = var11;
                    class354.field5453[var26] = var12 + -1;
                    var26 = 4095 & var26 + 1;
                    class74.field939[var21][var20 + -1] = 1;
                    class238.field3973[var21][var20 + -1] = var25;
                }
                if (~var20 > -127 && ~class74.field939[var21][var20 + 1] == -1 && (1310982144 & var19[var22][var23 + 2]) == 0 && ~(2015625216 & var19[var22 + 1][var23 + 2]) == -1) {
                    class303.field4790[var26] = var11;
                    class354.field5453[var26] = var12 + 1;
                    class74.field939[var21][var20 + 1] = 4;
                    var26 = var26 + 1 & 4095;
                    class238.field3973[var21][var20 + 1] = var25;
                }
                if (var21 > 0 && var20 > 0 && class74.field939[var21 + -1][var20 - 1] == 0 && (var19[var22 + -1][var23] & 1336147968) == 0 && (var19[var22 + -1][var23 + -1] & 1134821376) == 0 && ~(var19[var22][var23 - 1] & 1675886592) == -1) {
                    class303.field4790[var26] = var11 - 1;
                    class354.field5453[var26] = var12 + -1;
                    class74.field939[var21 + -1][var20 - 1] = 3;
                    var26 = var26 + 1 & 4095;
                    class238.field3973[var21 - 1][var20 + -1] = var25;
                }
                if (var21 < 126 && var20 > 0 && ~class74.field939[var21 + 1][var20 + -1] == -1 && ~(var19[var22 + 1][var23 + -1] & 1675886592) == -1 && (1625554944 & var19[var22 - -2][var23 + -1]) == 0 && (var19[var22 + 2][var23] & 2028208128) == 0) {
                    class303.field4790[var26] = var11 - -1;
                    class354.field5453[var26] = var12 + -1;
                    class74.field939[var21 + 1][var20 + -1] = 9;
                    var26 = var26 + 1 & 4095;
                    class238.field3973[var21 + 1][var20 - 1] = var25;
                }
                if (var21 > 0 && var20 < 126 && class74.field939[var21 + -1][var20 - -1] == 0 && (1336147968 & var19[var22 + -1][var23 + 1]) == 0 && ~(1310982144 & var19[var22 + -1][var23 + 2]) == -1 && (var19[var22][var23 - -2] & 2116288512) == 0) {
                    class303.field4790[var26] = var11 + -1;
                    class354.field5453[var26] = var12 + 1;
                    var26 = var26 - -1 & 4095;
                    class74.field939[var21 + -1][var20 + 1] = 6;
                    class238.field3973[var21 + -1][var20 + 1] = var25;
                }
                if (~var21 > -127 && ~var20 > -127 && class74.field939[var21 + 1][var20 - -1] == 0 && ~(var19[var22 + 1][var23 - -2] & 2116288512) == -1 && (2015625216 & var19[var22 - -2][var23 + 2]) == 0 && (2028208128 & var19[var22 + 2][var23 + 1]) == 0) {
                    class303.field4790[var26] = var11 + 1;
                    class354.field5453[var26] = var12 - -1;
                    class74.field939[var21 + 1][var20 + 1] = 12;
                    var26 = var26 + 1 & 4095;
                    class238.field3973[var21 + 1][var20 + 1] = var25;
                }
            }
            class134.field2111 = var12;
            class193.field3142 = var11;
            return false;
        }
    }
}
