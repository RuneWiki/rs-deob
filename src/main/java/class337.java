import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qq")
public class class337 extends class259 {

    @OriginalMember(owner = "client!qq", name = "O", descriptor = "I")
    public int field5227 = 99;

    @OriginalMember(owner = "client!qq", name = "T", descriptor = "I")
    public static int field5232;

    @OriginalMember(owner = "client!qq", name = "F", descriptor = "I")
    public static int field5218;

    @OriginalMember(owner = "client!qq", name = "G", descriptor = "I")
    public static int field5219;

    @OriginalMember(owner = "client!qq", name = "H", descriptor = "I")
    public static int field5220;

    @OriginalMember(owner = "client!qq", name = "I", descriptor = "I")
    public static int field5221;

    @OriginalMember(owner = "client!qq", name = "J", descriptor = "I")
    public static int field5222;

    @OriginalMember(owner = "client!qq", name = "K", descriptor = "I")
    public static int field5223;

    @OriginalMember(owner = "client!qq", name = "L", descriptor = "I")
    public static int field5224;

    @OriginalMember(owner = "client!qq", name = "M", descriptor = "I")
    public static int field5225;

    @OriginalMember(owner = "client!qq", name = "N", descriptor = "I")
    public static int field5226;

    @OriginalMember(owner = "client!qq", name = "P", descriptor = "I")
    public static int field5228;

    @OriginalMember(owner = "client!qq", name = "Q", descriptor = "I")
    public static int field5229;

    @OriginalMember(owner = "client!qq", name = "R", descriptor = "I")
    public static int field5230;

    @OriginalMember(owner = "client!qq", name = "S", descriptor = "I")
    public static int field5231;

    @OriginalMember(owner = "client!qq", name = "U", descriptor = "I")
    public static int field5233;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qq", name = "V", descriptor = "Ljava/lang/Class;")
    public static Class field5234;

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(ILqa;B[B[Lkg;I)V")
    public final void method2177(int arg0, class165 arg1, byte arg2, byte[] arg3, class181[] arg4, int arg5) {
        ++field5226;
        if (arg2 >= -117) {
            this.field5227 = 76;
        }
        class164 var7 = new class164(arg3);
        int var8 = -1;
        while (true) {
            int var9 = var7.method1063(-11);
            if (~var9 == -1) {
                return;
            }
            var8 += var9;
            int var10 = 0;
            while (true) {
                int var11 = var7.method1077((byte) -119);
                if (~var11 == -1) {
                    break;
                }
                var10 += var11 + -1;
                int var12 = 63 & var10;
                int var13 = 63 & var10 >> 6;
                int var14 = var10 >> 12;
                int var15 = var7.method1087(false);
                int var16 = var15 >> 2;
                int var17 = var15 & 3;
                int var18 = arg0 + var13;
                int var19 = var12 - -arg5;
                if (~var18 < -1 && ~var19 < -1 && ~(super.field3637 + -1) < ~var18 && ~var19 > ~(super.field3639 + -1)) {
                    class181 var20 = null;
                    if (!super.field3647) {
                        int var21 = var14;
                        if (~(2 & class178.field2382[1][var18][var19]) == -3) {
                            var21 = var14 - 1;
                        }
                        if (var21 >= 0) {
                            var20 = arg4[var21];
                        }
                    }
                    this.method2180(31774, -1, var19, var14, arg1, var17, var14, var8, var20, var16, var18);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "(II)V")
    public static final void method2178(int arg0, int arg1) {
        class291.field4259 = arg0;
        ++field5224;
        class376.field5712 = -1;
        class267.field3712 = arg1;
        class194.method1311(0);
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(I[IILnj;Lqa;B)V")
    public final void method2179(int arg0, int[] arg1, int arg2, class164 arg3, class165 arg4, byte arg5) {
        ++field5222;
        if (!super.field3647) {
            boolean var7 = false;
            class486 var8 = null;
            if (arg1 != null) {
                arg1[0] = -1;
            }
            while (true) {
                while (arg3.field2185 < arg3.field2219.length) {
                    int var18 = arg3.method1087(false);
                    if (var18 == 0) {
                        var8 = new class486(arg3);
                    } else if (var18 == 1) {
                        int var34 = arg3.method1087(false);
                        if (var34 > 0) {
                            for (int var35 = 0; var35 < var34; ++var35) {
                                class189 var36 = new class189(arg4, arg3, 0);
                                if (var36.field2520 == 31) {
                                    class120 var37 = class448.field6743.method2171(arg3.method1074(-635989152), 94);
                                    var36.method1261(var37.field1649, arg5 + 11, var37.field1651, var37.field1645, var37.field1650);
                                }
                                if (~arg4.method811() < -1) {
                                    class28 var38 = var36.field2518;
                                    int var39 = var38.method257(-109) + (arg2 << 7);
                                    int var40 = (arg0 << 7) + var38.method255(arg5 ^ 7121);
                                    int var41 = var39 >> 7;
                                    int var42 = var40 >> 7;
                                    if (var41 >= 0 && ~var42 <= -1 && var41 < super.field3637 && super.field3639 > var42) {
                                        var38.method259(var39, var40, arg5 ^ -41, super.field3645[var36.field2519][var41][var42] + -var38.method250((byte) 30));
                                        class514.method3067(var36);
                                    }
                                }
                            }
                        }
                    } else if (~var18 == -3) {
                        if (var8 == null) {
                            var8 = new class486();
                        }
                        var8.method2912(arg3, (byte) 33);
                    } else if (~var18 == -129) {
                        if (arg1 == null) {
                            arg3.field2185 += 10;
                        } else {
                            arg1[0] = arg3.method1074(-635989152);
                            arg1[1] = arg3.method1056(1024);
                            arg1[2] = arg3.method1056(1024);
                            arg1[3] = arg3.method1056(1024);
                            arg1[4] = arg3.method1074(-635989152);
                        }
                    } else {
                        if (var18 != 129) {
                            throw new IllegalStateException("");
                        }
                        if (super.field3651 == null) {
                            super.field3651 = new byte[4][][];
                        }
                        var7 = true;
                        for (int var19 = 0; ~var19 > -5; ++var19) {
                            byte var20 = arg3.method1088((byte) 106);
                            if (~var20 == -1 && super.field3651[var19] != null) {
                                int var21 = arg2;
                                int var22 = arg2 + 64;
                                int var23 = arg0;
                                if (var22 < 0) {
                                    var22 = 0;
                                } else if (~super.field3637 >= ~var22) {
                                    var22 = super.field3637;
                                }
                                int var24 = arg0 + 64;
                                if (~arg0 <= -1) {
                                    if (~super.field3639 >= ~arg0) {
                                        var23 = super.field3639;
                                    }
                                } else {
                                    var23 = 0;
                                }
                                if (arg2 >= 0) {
                                    if (arg2 >= super.field3637) {
                                        var21 = super.field3637;
                                    }
                                } else {
                                    var21 = 0;
                                }
                                if (~var24 <= -1) {
                                    if (super.field3639 <= var24) {
                                        var24 = super.field3639;
                                    }
                                } else {
                                    var24 = 0;
                                }
                                while (var21 < var22) {
                                    while (var23 < var24) {
                                        super.field3651[var19][var21][var23] = 0;
                                        ++var23;
                                    }
                                    ++var21;
                                }
                            } else if (var20 == 1) {
                                if (super.field3651[var19] == null) {
                                    super.field3651[var19] = new byte[super.field3637 + 1][super.field3639 + 1];
                                }
                                for (int var25 = 0; ~var25 > -65; var25 += 4) {
                                    for (int var26 = 0; var26 < 64; var26 += 4) {
                                        byte var27 = arg3.method1088((byte) 77);
                                        for (int var28 = arg2 + var25; ~var28 > ~(arg2 + 4 + var25); ++var28) {
                                            for (int var29 = arg0 + var26; var29 < arg0 + var26 + 4; ++var29) {
                                                if (var28 >= 0 && ~super.field3637 < ~var28 && var29 >= 0 && ~super.field3639 < ~var29) {
                                                    super.field3651[var19][var28][var29] = var27;
                                                }
                                            }
                                        }
                                    }
                                }
                            } else if (~var20 == -3) {
                                if (super.field3651[var19] == null) {
                                    super.field3651[var19] = new byte[super.field3637 + 1][super.field3639 + 1];
                                }
                                if (~var19 < -1) {
                                    int var30 = arg2;
                                    int var31 = arg2 + 64;
                                    int var32 = arg0;
                                    if (arg0 >= 0) {
                                        if (super.field3639 <= arg0) {
                                            var32 = super.field3639;
                                        }
                                    } else {
                                        var32 = 0;
                                    }
                                    if (arg2 >= 0) {
                                        if (arg2 >= super.field3637) {
                                            var30 = super.field3637;
                                        }
                                    } else {
                                        var30 = 0;
                                    }
                                    if (var31 >= 0) {
                                        if (~var31 <= ~super.field3637) {
                                            var31 = super.field3637;
                                        }
                                    } else {
                                        var31 = 0;
                                    }
                                    int var33 = arg0 - -64;
                                    if (var33 < 0) {
                                        var33 = 0;
                                    } else if (var33 >= super.field3639) {
                                        var33 = super.field3639;
                                    }
                                    while (var31 > var30) {
                                        while (~var33 < ~var32) {
                                            super.field3651[var19][var30][var32] = super.field3651[var19 + -1][var30][var32];
                                            ++var32;
                                        }
                                        ++var30;
                                    }
                                }
                            }
                        }
                    }
                }
                if (var8 != null) {
                    for (int var9 = 0; var9 < 8; ++var9) {
                        for (int var10 = 0; var10 < 8; ++var10) {
                            int var11 = (arg2 >> 3) + var9;
                            int var12 = (arg0 >> 3) + var10;
                            if (~var11 <= -1 && super.field3637 >> 3 > var11 && ~var12 <= -1 && var12 < super.field3639 >> 3) {
                                class386.method2413(var8, var11, (byte) -92, var12);
                            }
                        }
                    }
                }
                if (arg5 != -43) {
                    return;
                }
                if (!var7 && super.field3651 != null) {
                    for (int var13 = 0; ~var13 > -5; ++var13) {
                        if (super.field3651[var13] != null) {
                            for (int var14 = 0; ~var14 > -17; ++var14) {
                                for (int var15 = 0; ~var15 > -17; ++var15) {
                                    int var16 = (arg2 >> 2) + var14;
                                    int var17 = (arg0 >> 2) + var15;
                                    if (~var16 <= -1 && ~var16 > -27 && var17 >= 0 && ~var17 > -27) {
                                        super.field3651[var13][var16][var17] = 0;
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

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIIILqa;IIILkg;II)V")
    public final void method2180(int arg0, int arg1, int arg2, int arg3, class165 arg4, int arg5, int arg6, int arg7, class181 arg8, int arg9, int arg10) {
        ++field5223;
        if (class203.field2716.method15(class378.field5771, 0) || class519.method3091(arg2, class253.field3515, arg10, arg6, 109)) {
            if (this.field5227 > arg3) {
                this.field5227 = arg3;
            }
            class209 var12 = class432.field6575.method1872(arg7, false);
            if (!arg4.method818() || !class203.field2716.field1181 || !var12.field2955) {
                int var13;
                int var14;
                if (arg5 != 1 && ~arg5 != -4) {
                    var13 = var12.field2925;
                    var14 = var12.field2928;
                } else {
                    var14 = var12.field2925;
                    var13 = var12.field2928;
                }
                int var15;
                int var16;
                if (~(arg10 + var14) < ~super.field3637) {
                    var15 = arg10 + 1;
                    var16 = arg10;
                } else {
                    var15 = (var14 + 1 >> 1) + arg10;
                    var16 = arg10 - -(var14 >> 1);
                }
                int var17;
                int var18;
                if (arg2 + var13 <= super.field3639) {
                    var17 = arg2 - -(var13 + 1 >> 1);
                    var18 = (var13 >> 1) + arg2;
                } else {
                    var17 = arg2 - -1;
                    var18 = arg2;
                }
                class23 var19 = class306.field4447[arg6];
                int var20 = var19.method222(var16, var18) - (-var19.method222(var15, var18) + -var19.method222(var16, var17)) - -var19.method222(var15, var17) >> 2;
                int var21 = (arg10 << 7) - -(var14 << 6);
                int var22 = (arg2 << 7) + (var13 << 6);
                boolean var23 = class213.field3022 && !super.field3647 && var12.field2953;
                if (var12.method1443(arg0 ^ arg0)) {
                    class165.method1124(arg5, arg2, -2, (class17) null, arg3, var12, arg10, (class96) null);
                }
                boolean var24 = ~arg1 == 0 && ~var12.field2917 == 0 && var12.field2938 == null && var12.field2934 == null && !var12.field2956;
                if (!class269.field3741 || (!class21.method199(arg9, arg0 + -31682) || ~var12.field2952 == -2) && (!class434.method2645(arg9, 0) || var12.field2952 != 0)) {
                    if (~arg9 == -23) {
                        if (class203.field2716.field1155 || ~var12.field2930 != -1 || var12.field2910 == 1 || var12.field2903) {
                            class394 var26;
                            if (var24) {
                                class163 var25 = new class163(arg4, var12, arg6, var21, var20, var22, super.field3647, arg5, var23);
                                var26 = var25;
                                if (var25.method339(arg0 ^ 29153)) {
                                    var25.method333(true, arg4);
                                }
                            } else {
                                var26 = new class41(arg4, var12, arg3, arg6, var21, var20, var22, super.field3647, arg5, arg1);
                            }
                            class394 var27 = class471.method2823(arg3, arg10, arg2);
                            if (!(var27 instanceof class391)) {
                                class2.method6(arg3, arg10, arg2, var26);
                            } else {
                                ((class391) var27).field5964 = var26;
                            }
                            if (var12.field2910 == 1 && arg8 != null) {
                                arg8.method1212(arg10, arg2, (byte) 100);
                            }
                        }
                    } else if (arg9 != 10 && ~arg9 != -12) {
                        if (~arg9 <= -13 && arg9 <= 17 || ~arg9 <= -19 && ~arg9 >= -22) {
                            class140 var29;
                            if (var24) {
                                class159 var28 = new class159(arg4, var12, arg3, arg6, var21, var20, var22, super.field3647, arg10, arg10 + var14 + -1, arg2, arg2 - -var13 - 1, arg9, arg5, var23);
                                if (var28.method339(arg0 + -28191)) {
                                    var28.method333(true, arg4);
                                }
                                var29 = var28;
                            } else {
                                var29 = new class520(arg4, var12, arg3, arg6, var21, var20, var22, super.field3647, arg10, arg10 - -var14 - 1, arg2, arg2 + var13 + -1, arg9, arg5, arg1);
                            }
                            class140 var30 = class172.method1169(arg3, arg10, arg2, field5234 != null ? field5234 : (field5234 = method2190("jt")));
                            if (var30 instanceof class200 && var30.field1868 == arg10 && ~var30.field1863 == ~arg2) {
                                ((class200) var30).field2690 = var29;
                            } else {
                                class525.method3110(var29, false);
                            }
                            if (class213.field3022 && !super.field3647 && ~arg9 <= -13 && arg9 <= 17 && ~arg9 != -14 && arg3 > 0 && ~var12.field2952 != -1) {
                                super.field3652[arg3][arg10][arg2] = (byte) class311.method1956(super.field3652[arg3][arg10][arg2], 4);
                            }
                            if (~var12.field2910 != -1 && arg8 != null) {
                                arg8.method1229(!var12.field2905, var14, var13, arg10, -118, var12.field2963, arg2);
                            }
                        } else if (arg9 == 0) {
                            int var31 = var12.field2952;
                            if (class225.field3115 && var12.field2952 == -1) {
                                var31 = 1;
                            }
                            class535 var33;
                            if (var24) {
                                class52 var32 = new class52(arg4, var12, arg6, var21, var20, var22, super.field3647, arg9, arg5, var23);
                                var33 = var32;
                                if (var32.method339(arg0 ^ 29153)) {
                                    var32.method333(true, arg4);
                                }
                            } else {
                                var33 = new class521(arg4, var12, arg3, arg6, var21, var20, var22, super.field3647, arg9, arg5, arg1);
                            }
                            class535 var34 = class309.method1938(arg3, arg10, arg2);
                            if (!(var34 instanceof class109)) {
                                class443.method2692(arg3, arg10, arg2, var33, (class535) null);
                            } else {
                                ((class109) var34).field1531 = var33;
                            }
                            if (class213.field3022) {
                                if (arg5 != 0) {
                                    if (~arg5 == -2) {
                                        if (var12.field2950) {
                                            var19.method219(arg10, arg2 + 1, 50);
                                            var19.method219(arg10 + 1, arg2 + 1, 50);
                                        }
                                        if (var31 == 1 && !super.field3647) {
                                            super.field3652[arg3][arg10][arg2 + 1] = (byte) class311.method1956(super.field3652[arg3][arg10][arg2 + 1], 2);
                                        }
                                    } else if (~arg5 != -3) {
                                        if (~arg5 == -4) {
                                            if (var12.field2950) {
                                                var19.method219(arg10, arg2, 50);
                                                var19.method219(arg10 + 1, arg2, 50);
                                            }
                                            if (~var31 == -2 && !super.field3647) {
                                                super.field3652[arg3][arg10][arg2] = (byte) class311.method1956(super.field3652[arg3][arg10][arg2], 2);
                                            }
                                        }
                                    } else {
                                        if (var12.field2950) {
                                            var19.method219(arg10 + 1, arg2, 50);
                                            var19.method219(arg10 + 1, arg2 - -1, 50);
                                        }
                                        if (var31 == 1 && !super.field3647) {
                                            super.field3652[arg3][arg10 + 1][arg2] = (byte) class311.method1956(super.field3652[arg3][arg10 + 1][arg2], 1);
                                        }
                                    }
                                } else {
                                    if (var12.field2950) {
                                        var19.method219(arg10, arg2, 50);
                                        var19.method219(arg10, arg2 + 1, 50);
                                    }
                                    if (~var31 == -2 && !super.field3647) {
                                        super.field3652[arg3][arg10][arg2] = (byte) class311.method1956(super.field3652[arg3][arg10][arg2], 1);
                                    }
                                }
                            }
                            if (var12.field2910 != 0 && arg8 != null) {
                                arg8.method1215(arg5, arg2, var12.field2963, arg10, arg9, (byte) 120, !var12.field2905);
                            }
                            if (var12.field2973 != 16) {
                                class8.method97(arg3, arg10, arg2, var12.field2973);
                            }
                        } else if (~arg9 == -2) {
                            class535 var35;
                            if (!var24) {
                                var35 = new class521(arg4, var12, arg3, arg6, var21, var20, var22, super.field3647, arg9, arg5, arg1);
                            } else {
                                class52 var36 = new class52(arg4, var12, arg6, var21, var20, var22, super.field3647, arg9, arg5, var23);
                                if (var36.method339(3583)) {
                                    var36.method333(true, arg4);
                                }
                                var35 = var36;
                            }
                            class535 var37 = class309.method1938(arg3, arg10, arg2);
                            if (!(var37 instanceof class109)) {
                                class443.method2692(arg3, arg10, arg2, var35, (class535) null);
                            } else {
                                ((class109) var37).field1531 = var35;
                            }
                            if (var12.field2950 && class213.field3022) {
                                if (~arg5 != -1) {
                                    if (arg5 == 1) {
                                        var19.method219(arg10 + 1, arg2 + 1, 50);
                                    } else if (~arg5 != -3) {
                                        if (arg5 == 3) {
                                            var19.method219(arg10, arg2, 50);
                                        }
                                    } else {
                                        var19.method219(arg10 - -1, arg2, 50);
                                    }
                                } else {
                                    var19.method219(arg10, arg2 + 1, 50);
                                }
                            }
                            if (var12.field2910 != 0 && arg8 != null) {
                                arg8.method1215(arg5, arg2, var12.field2963, arg10, arg9, (byte) 120, !var12.field2905);
                            }
                        } else if (~arg9 == -3) {
                            int var38 = 3 & arg5 - -1;
                            class535 var41;
                            class535 var42;
                            if (var24) {
                                class52 var39 = new class52(arg4, var12, arg6, var21, var20, var22, super.field3647, arg9, arg5 + 4, var23);
                                class52 var40 = new class52(arg4, var12, arg6, var21, var20, var22, super.field3647, arg9, var38, var23);
                                if (var39.method339(3583)) {
                                    var39.method333(true, arg4);
                                }
                                var41 = var40;
                                var42 = var39;
                                if (var40.method339(3583)) {
                                    var40.method333(true, arg4);
                                }
                            } else {
                                var42 = new class521(arg4, var12, arg3, arg6, var21, var20, var22, super.field3647, arg9, arg5 + 4, arg1);
                                var41 = new class521(arg4, var12, arg3, arg6, var21, var20, var22, super.field3647, arg9, var38, arg1);
                            }
                            class443.method2692(arg3, arg10, arg2, var42, var41);
                            if (var12.field2952 == 1 && class213.field3022 && !super.field3647) {
                                if (~arg5 == -1) {
                                    super.field3652[arg3][arg10][arg2] = (byte) class311.method1956(super.field3652[arg3][arg10][arg2], 1);
                                    super.field3652[arg3][arg10][arg2 + 1] = (byte) class311.method1956(super.field3652[arg3][arg10][arg2 + 1], 2);
                                } else if (arg5 == 1) {
                                    super.field3652[arg3][arg10][arg2 + 1] = (byte) class311.method1956(super.field3652[arg3][arg10][arg2 + 1], 2);
                                    super.field3652[arg3][arg10 + 1][arg2] = (byte) class311.method1956(super.field3652[arg3][arg10 + 1][arg2], 1);
                                } else if (~arg5 == -3) {
                                    super.field3652[arg3][arg10 + 1][arg2] = (byte) class311.method1956(super.field3652[arg3][arg10 + 1][arg2], 1);
                                    super.field3652[arg3][arg10][arg2] = (byte) class311.method1956(super.field3652[arg3][arg10][arg2], 2);
                                } else if (arg5 == 3) {
                                    super.field3652[arg3][arg10][arg2] = (byte) class311.method1956(super.field3652[arg3][arg10][arg2], 2);
                                    super.field3652[arg3][arg10][arg2] = (byte) class311.method1956(super.field3652[arg3][arg10][arg2], 1);
                                }
                            }
                            if (var12.field2910 != 0 && arg8 != null) {
                                arg8.method1215(arg5, arg2, var12.field2963, arg10, arg9, (byte) 120, !var12.field2905);
                            }
                            if (var12.field2973 != 16) {
                                class8.method97(arg3, arg10, arg2, var12.field2973);
                            }
                        } else if (arg9 == 3) {
                            class535 var44;
                            if (var24) {
                                class52 var43 = new class52(arg4, var12, arg6, var21, var20, var22, super.field3647, arg9, arg5, var23);
                                if (var43.method339(3583)) {
                                    var43.method333(true, arg4);
                                }
                                var44 = var43;
                            } else {
                                var44 = new class521(arg4, var12, arg3, arg6, var21, var20, var22, super.field3647, arg9, arg5, arg1);
                            }
                            class535 var45 = class309.method1938(arg3, arg10, arg2);
                            if (var45 instanceof class109) {
                                ((class109) var45).field1531 = var44;
                            } else {
                                class443.method2692(arg3, arg10, arg2, var44, (class535) null);
                            }
                            if (var12.field2950 && class213.field3022) {
                                if (~arg5 == -1) {
                                    var19.method219(arg10, arg2 + 1, 50);
                                } else if (~arg5 != -2) {
                                    if (arg5 == 2) {
                                        var19.method219(arg10 - -1, arg2, 50);
                                    } else if (~arg5 == -4) {
                                        var19.method219(arg10, arg2, 50);
                                    }
                                } else {
                                    var19.method219(arg10 + 1, arg2 + 1, 50);
                                }
                            }
                            if (var12.field2910 != 0 && arg8 != null) {
                                arg8.method1215(arg5, arg2, var12.field2963, arg10, arg9, (byte) 120, !var12.field2905);
                            }
                        } else if (arg9 == 9) {
                            class140 var47;
                            if (var24) {
                                class159 var46 = new class159(arg4, var12, arg3, arg6, var21, var20, var22, super.field3647, arg10, arg10, arg2, arg2, arg9, arg5, var23);
                                if (var46.method339(3583)) {
                                    var46.method333(true, arg4);
                                }
                                var47 = var46;
                            } else {
                                var47 = new class520(arg4, var12, arg3, arg6, var21, var20, var22, super.field3647, arg10, var14 + -1 + arg10, arg2, arg2 + -1 + var13, arg9, arg5, arg1);
                            }
                            class140 var48 = class172.method1169(arg3, arg10, arg2, field5234 != null ? field5234 : (field5234 = method2190("jt")));
                            if (var48 instanceof class200 && var48.field1868 == arg10 && ~var48.field1863 == ~arg2) {
                                ((class200) var48).field2690 = var47;
                            } else {
                                class525.method3110(var47, false);
                            }
                            if (~var12.field2910 != -1 && arg8 != null) {
                                arg8.method1229(!var12.field2905, var14, var13, arg10, -115, var12.field2963, arg2);
                            }
                            if (var12.field2973 != 16) {
                                class8.method97(arg3, arg10, arg2, var12.field2973);
                            }
                        } else if (~arg9 == -5) {
                            class222 var49;
                            if (!var24) {
                                var49 = new class498(arg4, var12, arg3, arg6, var21, var20, var22, super.field3647, 0, 0, 0, arg9, arg5, arg1);
                            } else {
                                class361 var50 = new class361(arg4, var12, arg6, var21, var20, var22, super.field3647, 0, 0, 0, arg9, arg5);
                                var49 = var50;
                                if (var50.method339(3583)) {
                                    var50.method333(true, arg4);
                                }
                            }
                            class222 var51 = class307.method1926(arg3, arg10, arg2);
                            if (var51 instanceof class322) {
                                ((class322) var51).field4660 = var49;
                            } else {
                                class200.method1356(arg3, arg10, arg2, var49, (class222) null);
                            }
                        } else if (~arg9 == -6) {
                            int var52 = 17;
                            class68 var53 = (class68) class309.method1938(arg3, arg10, arg2);
                            if (var53 != null) {
                                var52 = class432.field6575.method1872(var53.method338(92), false).field2973 + 1;
                            }
                            class222 var54;
                            if (!var24) {
                                var54 = new class498(arg4, var12, arg3, arg6, var21, var20, var22, super.field3647, 0, class351.field5403[arg5] * var52, class456.field6846[arg5] * var52, arg9, arg5, arg1);
                            } else {
                                class361 var55 = new class361(arg4, var12, arg6, var21, var20, var22, super.field3647, 0, class351.field5403[arg5] * var52, class456.field6846[arg5] * var52, arg9, arg5);
                                if (var55.method339(3583)) {
                                    var55.method333(true, arg4);
                                }
                                var54 = var55;
                            }
                            class222 var56 = class307.method1926(arg3, arg10, arg2);
                            if (var56 instanceof class322) {
                                ((class322) var56).field4660 = var54;
                            } else {
                                class200.method1356(arg3, arg10, arg2, var54, (class222) null);
                            }
                        } else if (arg9 == 6) {
                            int var57 = 9;
                            class68 var58 = (class68) class309.method1938(arg3, arg10, arg2);
                            if (var58 != null) {
                                var57 = class432.field6575.method1872(var58.method338(arg0 + -31656), false).field2973 / 2 - -1;
                            }
                            class222 var60;
                            if (var24) {
                                class361 var59 = new class361(arg4, var12, arg6, var21, var20, var22, super.field3647, arg5, class351.field5403[arg5] * var57, class456.field6846[arg5] * var57, arg9, arg5 + 4);
                                var60 = var59;
                                if (var59.method339(3583)) {
                                    var59.method333(true, arg4);
                                }
                            } else {
                                var60 = new class498(arg4, var12, arg3, arg6, var21, var20, var22, super.field3647, arg5, class531.field7816[arg5] * var57, class525.field7711[arg5] * var57, arg9, arg5 + 4, arg1);
                            }
                            class222 var61 = class307.method1926(arg3, arg10, arg2);
                            if (var61 instanceof class322) {
                                ((class322) var61).field4660 = var60;
                            } else {
                                class200.method1356(arg3, arg10, arg2, var60, (class222) null);
                            }
                        } else if (arg9 == 7) {
                            int var62 = arg5 + 2 & 3;
                            class222 var64;
                            if (var24) {
                                class361 var63 = new class361(arg4, var12, arg6, var21, var20, var22, super.field3647, var62, 0, 0, arg9, var62 + 4);
                                var64 = var63;
                                if (var63.method339(3583)) {
                                    var63.method333(true, arg4);
                                }
                            } else {
                                var64 = new class498(arg4, var12, arg3, arg6, var21, var20, var22, super.field3647, var62, 0, 0, arg9, var62 + 4, arg1);
                            }
                            class222 var65 = class307.method1926(arg3, arg10, arg2);
                            if (var65 instanceof class322) {
                                ((class322) var65).field4660 = var64;
                            } else {
                                class200.method1356(arg3, arg10, arg2, var64, (class222) null);
                            }
                        } else if (arg9 == 8) {
                            int var66 = 3 & arg5 - -2;
                            int var67 = 9;
                            class68 var68 = (class68) class309.method1938(arg3, arg10, arg2);
                            if (var68 != null) {
                                var67 = 1 + class432.field6575.method1872(var68.method338(89), false).field2973 / 2;
                            }
                            class222 var71;
                            class222 var72;
                            if (var24) {
                                class361 var69 = new class361(arg4, var12, arg6, var21, var20, var22, super.field3647, arg5, class531.field7816[arg5] * var67, class525.field7711[arg5] * var67, arg9, arg5 + 4);
                                class361 var70 = new class361(arg4, var12, arg6, var21, var20, var22, super.field3647, arg5, 0, 0, arg9, var66 - -4);
                                if (var69.method339(3583)) {
                                    var69.method333(true, arg4);
                                }
                                var71 = var69;
                                var72 = var70;
                                if (var70.method339(3583)) {
                                    var70.method333(true, arg4);
                                }
                            } else {
                                class498 var73 = new class498(arg4, var12, arg3, arg6, var21, var20, var22, super.field3647, arg5, class531.field7816[arg5] * var67, class525.field7711[arg5] * var67, arg9, arg5 - -4, arg1);
                                var71 = var73;
                                class498 var74 = new class498(arg4, var12, arg3, arg6, var21, var20, var22, super.field3647, arg5, 0, 0, arg9, var66 + 4, arg1);
                                var72 = var74;
                            }
                            class200.method1356(arg3, arg10, arg2, var71, var72);
                        }
                    } else {
                        class159 var75 = null;
                        int var77;
                        class140 var78;
                        if (var24) {
                            class159 var76 = new class159(arg4, var12, arg3, arg6, var21, var20, var22, super.field3647, arg10, arg10 - -var14 - 1, arg2, var13 + -1 + arg2, arg9, arg5, var23);
                            var77 = var76.method1034(arg0 + -31774);
                            var78 = var76;
                            var75 = var76;
                        } else {
                            var78 = new class520(arg4, var12, arg3, arg6, var21, var20, var22, super.field3647, arg10, var14 + -1 + arg10, arg2, arg2 - (-var13 - -1), arg9, arg5, arg1);
                            var77 = 15;
                        }
                        class140 var79 = class172.method1169(arg3, arg10, arg2, field5234 != null ? field5234 : (field5234 = method2190("jt")));
                        boolean var80 = false;
                        if (var79 instanceof class200 && ~var79.field1868 == ~arg10 && ~var79.field1863 == ~arg2) {
                            ((class200) var79).field2690 = var78;
                            var80 = true;
                        }
                        if (var80 || class525.method3110(var78, false)) {
                            if (var75 != null && var75.method339(arg0 ^ 29153)) {
                                var75.method333(true, arg4);
                            }
                            if (var12.field2950 && class213.field3022) {
                                if (var77 > 30) {
                                    var77 = 30;
                                }
                                for (int var81 = 0; ~var81 >= ~var14; ++var81) {
                                    for (int var82 = 0; var13 >= var82; ++var82) {
                                        var19.method219(arg10 + var81, arg2 + var82, var77);
                                    }
                                }
                            }
                        }
                        if (var12.field2910 != 0 && arg8 != null) {
                            arg8.method1229(!var12.field2905, var14, var13, arg10, arg0 ^ -31845, var12.field2963, arg2);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIILqa;IIII[ILnj;I)V")
    public final void method2181(int arg0, int arg1, int arg2, class165 arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, class164 arg9, int arg10) {
        ++field5219;
        if (!super.field3647) {
            boolean var12 = false;
            class486 var13 = null;
            if (arg8 != null) {
                arg8[0] = -1;
            }
            int var14 = (7 & arg7) * 8;
            int var15 = (arg6 & 7) * 8;
            if (arg0 <= -60) {
                while (true) {
                    while (arg9.field2219.length > arg9.field2185) {
                        int var20 = arg9.method1087(false);
                        if (~var20 == -1) {
                            var13 = new class486(arg9);
                        } else if (var20 == 1) {
                            int var34 = arg9.method1087(false);
                            if (var34 > 0) {
                                for (int var35 = 0; ~var34 < ~var35; ++var35) {
                                    class189 var36 = new class189(arg3, arg9, 0);
                                    if (var36.field2520 == 31) {
                                        class120 var37 = class448.field6743.method2171(arg9.method1074(-635989152), 119);
                                        var36.method1261(var37.field1649, -32, var37.field1651, var37.field1645, var37.field1650);
                                    }
                                    if (~arg3.method811() < -1) {
                                        class28 var38 = var36.field2518;
                                        int var39 = var38.method257(-103) >> 7;
                                        int var40 = var38.method255(-7164) >> 7;
                                        if (var36.field2519 == arg5 && var14 <= var39 && ~(var14 + 8) < ~var39 && var40 >= var15 && ~(var15 - -8) < ~var40) {
                                            int var41 = class149.method980(arg10, 1023 & var38.method255(-7164), 0, var38.method257(-95) & 1023) + (arg2 << 7);
                                            int var42 = class150.method983((byte) 89, 1023 & var38.method255(-7164), arg10, 1023 & var38.method257(-46)) + (arg4 << 7);
                                            int var43 = var41 >> 7;
                                            int var44 = var42 >> 7;
                                            if (var43 >= 0 && ~var44 <= -1 && ~var43 > ~super.field3637 && ~var44 > ~super.field3639) {
                                                var38.method259(var41, var42, 2, super.field3645[arg5][var43][var44] + -var38.method250((byte) 85));
                                                class514.method3067(var36);
                                            }
                                        }
                                    }
                                }
                            }
                        } else if (var20 == 2) {
                            if (var13 == null) {
                                var13 = new class486();
                            }
                            var13.method2912(arg9, (byte) 33);
                        } else if (var20 == 128) {
                            if (arg8 == null) {
                                arg9.field2185 += 10;
                            } else {
                                arg8[0] = arg9.method1074(-635989152);
                                arg8[1] = arg9.method1056(1024);
                                arg8[2] = arg9.method1056(1024);
                                arg8[3] = arg9.method1056(1024);
                                arg8[4] = arg9.method1074(-635989152);
                            }
                        } else {
                            if (var20 != 129) {
                                throw new IllegalStateException("");
                            }
                            if (super.field3651 == null) {
                                super.field3651 = new byte[4][][];
                            }
                            for (int var21 = 0; ~var21 > -5; ++var21) {
                                byte var22 = arg9.method1088((byte) 62);
                                if (~var22 == -1 && super.field3651[arg1] != null) {
                                    if (var21 <= arg5) {
                                        int var23 = arg2;
                                        int var24 = arg2 + 7;
                                        int var25 = arg4;
                                        if (~arg2 > -1) {
                                            var23 = 0;
                                        } else if (~arg2 <= ~super.field3637) {
                                            var23 = super.field3637;
                                        }
                                        if (~var24 > -1) {
                                            var24 = 0;
                                        } else if (~super.field3637 >= ~var24) {
                                            var24 = super.field3637;
                                        }
                                        if (~arg4 <= -1) {
                                            if (~super.field3639 >= ~arg4) {
                                                var25 = super.field3639;
                                            }
                                        } else {
                                            var25 = 0;
                                        }
                                        int var26 = arg4 - -7;
                                        if (~var26 <= -1) {
                                            if (~var26 <= ~super.field3639) {
                                                var26 = super.field3639;
                                            }
                                        } else {
                                            var26 = 0;
                                        }
                                        while (~var23 > ~var24) {
                                            while (~var26 < ~var25) {
                                                super.field3651[arg1][var23][var25] = 0;
                                                ++var25;
                                            }
                                            ++var23;
                                        }
                                    }
                                } else if (var22 == 1) {
                                    if (super.field3651[arg1] == null) {
                                        super.field3651[arg1] = new byte[super.field3637 + 1][super.field3639 + 1];
                                    }
                                    for (int var27 = 0; var27 < 64; var27 += 4) {
                                        for (int var28 = 0; var28 < 64; var28 += 4) {
                                            byte var29 = arg9.method1088((byte) 96);
                                            if (arg5 >= var21) {
                                                for (int var30 = var27; var27 + 4 > var30; ++var30) {
                                                    for (int var31 = var28; ~(var28 + 4) < ~var31; ++var31) {
                                                        if (var30 >= var14 && ~var30 > ~(var14 - -8) && var15 <= var31 && ~(var15 - -8) < ~var15) {
                                                            int var32 = class333.method2150(arg10, var30 & 7, var31 & 7, (byte) -123) + arg2;
                                                            int var33 = class298.method1899(-3, arg10, var30 & 7, 7 & var31) + arg4;
                                                            if (~var32 <= -1 && super.field3637 > var32 && var33 >= 0 && var33 < super.field3639) {
                                                                super.field3651[arg1][var32][var33] = var29;
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
                        class386.method2413(var13, arg2 >> 3, (byte) -87, arg4 >> 3);
                    }
                    if (!var12 && super.field3651 != null && super.field3651[arg1] != null) {
                        int var16 = arg2 + 7;
                        int var17 = arg4 - -7;
                        for (int var18 = arg2; ~var16 < ~var18; ++var18) {
                            for (int var19 = arg4; var17 > var19; ++var19) {
                                super.field3651[arg1][var18][var19] = 0;
                            }
                        }
                        return;
                    }
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lqa;II[Lkg;IIII[BII)V")
    public final void method2182(class165 arg0, int arg1, int arg2, class181[] arg3, int arg4, int arg5, int arg6, int arg7, byte[] arg8, int arg9, int arg10) {
        ++field5221;
        class164 var12 = new class164(arg8);
        if (arg9 != -6037) {
            this.method2180(-95, -110, -38, -100, (class165) null, 110, -98, -91, (class181) null, 21, 10);
        }
        int var13 = -1;
        while (true) {
            int var14 = var12.method1063(-93);
            if (~var14 == -1) {
                return;
            }
            var13 += var14;
            int var15 = 0;
            while (true) {
                int var16 = var12.method1077((byte) -111);
                if (~var16 == -1) {
                    break;
                }
                var15 += var16 + -1;
                int var17 = 63 & var15;
                int var18 = var15 >> 6 & 63;
                int var19 = var15 >> 12;
                int var20 = var12.method1087(false);
                int var21 = var20 >> 2;
                int var22 = var20 & 3;
                if (~arg7 == ~var19 && arg4 <= var18 && var18 < arg4 + 8 && ~var17 <= ~arg5 && ~(arg5 - -8) < ~var17) {
                    class209 var23 = class432.field6575.method1872(var13, false);
                    int var24 = class354.method2276(var18 & 7, -1310, var23.field2928, var22, 7 & var17, var23.field2925, arg10) + arg1;
                    int var25 = class420.method2562(var18 & 7, var23.field2925, var23.field2928, arg10, var17 & 7, var22, (byte) -65) + arg2;
                    if (var24 > 0 && ~var25 < -1 && var24 < super.field3637 + -1 && var25 < super.field3639 + -1) {
                        class181 var26 = null;
                        if (!super.field3647) {
                            int var27 = arg6;
                            if ((class178.field2382[1][var24][var25] & 2) == 2) {
                                var27 = arg6 - 1;
                            }
                            if (var27 >= 0) {
                                var26 = arg3[var27];
                            }
                        }
                        this.method2180(arg9 ^ -27531, -1, var25, arg6, arg0, 3 & var22 - -arg10, arg6, var13, var26, var21, var24);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(ILkg;IIBLqa;I)V")
    public final void method2183(int arg0, class181 arg1, int arg2, int arg3, byte arg4, class165 arg5, int arg6) {
        ++field5220;
        class68 var8 = null;
        if (~arg2 == -1) {
            var8 = (class68) class309.method1938(arg6, arg3, arg0);
        }
        if (~arg2 == -2) {
            var8 = (class68) class307.method1926(arg6, arg3, arg0);
        }
        if (arg2 == 2) {
            var8 = (class68) class172.method1169(arg6, arg3, arg0, field5234 != null ? field5234 : (field5234 = method2190("jt")));
        }
        if (~arg2 == -4) {
            var8 = (class68) class471.method2823(arg6, arg3, arg0);
        }
        if (arg4 <= -38) {
            if (var8 != null) {
                class209 var9 = class432.field6575.method1872(var8.method338(125), false);
                int var10 = var8.method336(-6130);
                int var11 = var8.method332(6359);
                if (var9.method1443(0)) {
                    class418.method2557(arg6, var9, arg3, arg0, 5888);
                }
                if (var8.method339(3583)) {
                    var8.method330(arg5, 14470);
                }
                if (arg2 != 0) {
                    if (arg2 != 1) {
                        if (~arg2 == -3) {
                            class140 var12 = class172.method1169(arg6, arg3, arg0, field5234 != null ? field5234 : (field5234 = method2190("jt")));
                            if (var12 instanceof class200 && var12.field1868 == arg3 && var12.field1863 == arg0) {
                                ((class200) var12).field2690 = null;
                            } else {
                                class527.method3124(arg6, arg3, arg0, field5234 != null ? field5234 : (field5234 = method2190("jt")));
                            }
                            if (~var9.field2910 != -1 && ~super.field3637 < ~(var9.field2928 + arg3) && ~super.field3639 < ~(var9.field2928 + arg0) && ~(var9.field2925 + arg3) > ~super.field3637 && ~(var9.field2925 + arg0) > ~super.field3639) {
                                arg1.method1217(var9.field2963, !var9.field2905, arg3, (byte) 86, var11, var9.field2925, var9.field2928, arg0);
                                return;
                            }
                            return;
                        }
                        if (arg2 == 3) {
                            class394 var13 = class471.method2823(arg6, arg3, arg0);
                            if (!(var13 instanceof class391)) {
                                class296.method1889(arg6, arg3, arg0);
                            } else {
                                ((class391) var13).field5964 = null;
                            }
                            if (var9.field2910 == 1) {
                                arg1.method1221(-13419, arg3, arg0);
                                return;
                            }
                        }
                    } else {
                        class222 var14 = class307.method1926(arg6, arg3, arg0);
                        if (!(var14 instanceof class322)) {
                            class270.method1738(arg6, arg3, arg0);
                            return;
                        }
                        ((class322) var14).field4660 = null;
                    }
                    return;
                }
                class535 var15 = class309.method1938(arg6, arg3, arg0);
                if (!(var15 instanceof class109)) {
                    class270.method1735(arg6, arg3, arg0);
                } else {
                    ((class109) var15).field1531 = null;
                }
                if (~var9.field2910 != -1) {
                    arg1.method1226(arg0, var11, arg3, !var9.field2905, var9.field2963, -76, var10);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(II[Lga;IZI)V")
    public static final void method2184(int arg0, int arg1, class282[] arg2, int arg3, boolean arg4, int arg5) {
        for (int var6 = 0; arg2.length > var6; ++var6) {
            class282 var7 = arg2[var6];
            if (var7 != null && ~var7.field4122 == ~arg0) {
                class13.method137(arg3, arg4, arg1, (byte) 96, var7);
                class22.method204(1160694670, arg1, var7, arg3);
                if (~var7.field4091 < ~(-var7.field3991 + var7.field4086)) {
                    var7.field4091 = -var7.field3991 + var7.field4086;
                }
                if (~(-var7.field4043 + var7.field4096) > ~var7.field4129) {
                    var7.field4129 = -var7.field4043 + var7.field4096;
                }
                if (~var7.field4091 > -1) {
                    var7.field4091 = 0;
                }
                if (var7.field4129 < 0) {
                    var7.field4129 = 0;
                }
                if (~var7.field4103 == -1) {
                    class131.method893(var7, arg4, 1413331184);
                }
            }
        }
        ++field5225;
        if (arg5 != 1) {
            method2188(true, (String) null);
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(BII)I")
    public static final int method2185(byte arg0, int arg1, int arg2) {
        ++field5230;
        if (arg0 != 69) {
            field5231 = -55;
        }
        return ~arg2 != -2 && arg2 != 3 ? class462.field6908[arg1 & 3] : class324.field4686[3 & arg1];
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(ILnj;)V")
    public static final void method2186(int arg0, class164 arg1) {
        if (arg0 == -19999) {
            for (int var2 = 0; ~var2 > ~class497.field7328; ++var2) {
                int var3 = arg1.method1077((byte) -112);
                int var4 = arg1.method1074(arg0 + -635969153);
                if (~var4 == -65536) {
                    var4 = -1;
                }
                if (class278.field3944[var3] != null) {
                    class278.field3944[var3].field6155 = var4;
                }
            }
            ++field5229;
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lqa;I)V")
    public final void method2187(class165 arg0, int arg1) {
        class280.method1797(arg0);
        ++field5233;
        if (super.field3653 > 1) {
            for (int var3 = 0; ~var3 > ~super.field3637; ++var3) {
                for (int var4 = 0; super.field3639 > var4; ++var4) {
                    if (~(class178.field2382[1][var3][var4] & 2) == -3) {
                        class249.method1613(var3, var4);
                    }
                }
            }
        }
        for (int var5 = 0; ~var5 > ~super.field3653; ++var5) {
            for (int var6 = 0; var6 <= super.field3639; ++var6) {
                for (int var7 = 0; var7 <= super.field3637; ++var7) {
                    if ((super.field3652[var5][var7][var6] & 1) != 0) {
                        int var8 = var6;
                        int var9 = var6;
                        int var10 = var5;
                        while (var8 > 0 && ~(super.field3652[var5][var7][var8 - 1] & 1) != -1) {
                            --var8;
                        }
                        while (~super.field3639 < ~var9 && (super.field3652[var5][var7][var9 + 1] & 1) != 0) {
                            ++var9;
                        }
                        int var11 = var5;
                        label171: while (~var10 < -1) {
                            for (int var12 = var8; var9 >= var12; ++var12) {
                                if ((super.field3652[var10 + -1][var7][var12] & 1) == 0) {
                                    break label171;
                                }
                            }
                            --var10;
                        }
                        label160: while (~var11 > -4) {
                            for (int var13 = var8; var9 >= var13; ++var13) {
                                if (~(super.field3652[var11 + 1][var7][var13] & 1) == -1) {
                                    break label160;
                                }
                            }
                            ++var11;
                        }
                        int var14 = (-var8 + 1 + var9) * (var11 + 1 + -var10);
                        if (~var14 <= -3) {
                            short var15 = 240;
                            int var16 = super.field3645[var11][var7][var8] - var15;
                            int var17 = super.field3645[var10][var7][var8];
                            class405.method2494(1, var7 << 7, var7 << 7, var8 << 7, (var9 << 7) + 128, var16, var17);
                            for (int var18 = var10; var11 >= var18; ++var18) {
                                for (int var19 = var8; ~var19 >= ~var9; ++var19) {
                                    super.field3652[var18][var7][var19] = (byte) class519.method3092(super.field3652[var18][var7][var19], -2);
                                }
                            }
                        }
                    }
                    if (~(super.field3652[var5][var7][var6] & 2) != -1) {
                        int var20 = var7;
                        int var21 = var7;
                        int var22 = var5;
                        int var23 = var5;
                        while (~super.field3637 < ~var21 && (super.field3652[var5][var21 + 1][var6] & 2) != 0) {
                            ++var21;
                        }
                        while (var20 > 0 && ~(super.field3652[var5][var20 + -1][var6] & 2) != -1) {
                            --var20;
                        }
                        label225: while (~var22 < -1) {
                            for (int var24 = var20; ~var21 <= ~var24; ++var24) {
                                if (~(2 & super.field3652[var22 + -1][var24][var6]) == -1) {
                                    break label225;
                                }
                            }
                            --var22;
                        }
                        label214: while (~var23 > -4) {
                            for (int var25 = var20; var25 <= var21; ++var25) {
                                if (~(super.field3652[var23 + 1][var25][var6] & 2) == -1) {
                                    break label214;
                                }
                            }
                            ++var23;
                        }
                        int var26 = (var21 - var20 + 1) * (var23 + 1 + -var22);
                        if (~var26 <= -3) {
                            short var27 = 240;
                            int var28 = super.field3645[var23][var20][var6] + -var27;
                            int var29 = super.field3645[var22][var20][var6];
                            class405.method2494(2, var20 << 7, (var21 << 7) + 128, var6 << 7, var6 << 7, var28, var29);
                            for (int var30 = var22; var30 <= var23; ++var30) {
                                for (int var31 = var20; ~var31 >= ~var21; ++var31) {
                                    super.field3652[var30][var31][var6] = (byte) class519.method3092(super.field3652[var30][var31][var6], -3);
                                }
                            }
                        }
                    }
                    if ((4 & super.field3652[var5][var7][var6]) != 0) {
                        int var32 = var7;
                        int var33 = var7;
                        int var34;
                        for (var34 = var6; ~var34 < -1 && (super.field3652[var5][var7][var34 - 1] & 4) != 0; --var34) {
                        }
                        int var35;
                        for (var35 = var6; var35 < super.field3639 && ~(4 & super.field3652[var5][var7][var35 + 1]) != -1; ++var35) {
                        }
                        label278: while (var32 > 0) {
                            for (int var36 = var34; ~var36 >= ~var35; ++var36) {
                                if (~(super.field3652[var5][var32 + -1][var36] & 4) == -1) {
                                    break label278;
                                }
                            }
                            --var32;
                        }
                        label267: while (~var33 > ~super.field3637) {
                            for (int var37 = var34; ~var35 <= ~var37; ++var37) {
                                if ((4 & super.field3652[var5][var33 + 1][var37]) == 0) {
                                    break label267;
                                }
                            }
                            ++var33;
                        }
                        if (~((-var34 + var35 - -1) * (var33 + 1 + -var32)) <= -5) {
                            int var38 = super.field3645[var5][var32][var34];
                            class405.method2494(4, var32 << 7, (var33 << 7) + 128, var34 << 7, (var35 << 7) + 128, var38, var38);
                            for (int var39 = var32; var33 >= var39; ++var39) {
                                for (int var40 = var34; ~var35 <= ~var40; ++var40) {
                                    super.field3652[var5][var39][var40] = (byte) class519.method3092(super.field3652[var5][var39][var40], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg1 >= -78) {
            this.method2179(36, (int[]) null, 4, (class164) null, (class165) null, (byte) -53);
        }
        super.field3652 = null;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(ZLjava/lang/String;)V")
    public static final void method2188(boolean arg0, String arg1) {
        System.out.println("Error: " + class233.method1561("%0a", "\n", arg1, (byte) 127));
        if (arg0) {
            ++field5228;
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(BIZLuu;III)V")
    public static final void method2189(byte arg0, int arg1, boolean arg2, class191 arg3, int arg4, int arg5, int arg6) {
        class445.field6686 = arg3;
        ++field5218;
        class372.field5667 = arg6;
        class342.field5271 = arg5;
        class406.field6164 = 1;
        class433.field6577 = arg2;
        int var7 = -63 % ((-19 - arg0) / 43);
        class162.field2114 = arg1;
        class474.field7042 = class480.field7082.method1411(16) / arg4;
        if (class474.field7042 < 1) {
            class474.field7042 = 1;
        }
    }

    @OriginalMember(owner = "client!qq", name = "<init>", descriptor = "(IIIZ)V")
    public class337(int arg0, int arg1, int arg2, boolean arg3) {
        super(arg0, arg1, arg2, arg3, class225.field3116, class306.field4441);
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2190(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class446("Invalid teleport!", "Unzulässiger Teleport!", "Téléportation non valide !", "Teleporte inválido!");
        field5232 = -1;
    }
}
