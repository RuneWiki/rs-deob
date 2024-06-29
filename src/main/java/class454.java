import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class454 extends class317 {

    @OriginalMember(owner = "client!pg", name = "P", descriptor = "I")
    public int field6436 = 99;

    @OriginalMember(owner = "client!pg", name = "J", descriptor = "Z")
    public static boolean field6430 = false;

    @OriginalMember(owner = "client!pg", name = "O", descriptor = "Lch;")
    public static class151 field6435 = new class151("flash1:", "blinken1:", "clignotant1:", "flash1:");

    @OriginalMember(owner = "client!pg", name = "R", descriptor = "I")
    public static int field6438 = 0;

    @OriginalMember(owner = "client!pg", name = "G", descriptor = "I")
    public static int field6427;

    @OriginalMember(owner = "client!pg", name = "I", descriptor = "I")
    public static int field6429;

    @OriginalMember(owner = "client!pg", name = "K", descriptor = "I")
    public static int field6431;

    @OriginalMember(owner = "client!pg", name = "L", descriptor = "I")
    public static int field6432;

    @OriginalMember(owner = "client!pg", name = "M", descriptor = "I")
    public static int field6433;

    @OriginalMember(owner = "client!pg", name = "N", descriptor = "I")
    public static int field6434;

    @OriginalMember(owner = "client!pg", name = "S", descriptor = "I")
    public static int field6439;

    @OriginalMember(owner = "client!pg", name = "U", descriptor = "I")
    public static int field6441;

    @OriginalMember(owner = "client!pg", name = "Q", descriptor = "Lrn;")
    public static class417 field6437;

    @OriginalMember(owner = "client!pg", name = "T", descriptor = "Lnl;")
    public static class435 field6440;

    // $FF: synthetic field
    @OriginalMember(owner = "client!pg", name = "V", descriptor = "Ljava/lang/Class;")
    public static Class field6442;

    @OriginalMember(owner = "client!pg", name = "H", descriptor = "[B")
    public static byte[] field6428;

    @OriginalMember(owner = "client!pg", name = "F", descriptor = "[I")
    public static int[] field6426;

    // $FF: synthetic method
    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2739(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(ILvc;IIIILpf;)V", line = 9)
    public final void method2731(int arg0, class89 arg1, int arg2, int arg3, int arg4, int arg5, class18 arg6) {
        int var8 = -52 / ((arg4 - 22) / 39);
        ++field6434;
        class210 var9 = null;
        if (~arg0 == -1) {
            var9 = (class210) class133.method991(arg3, arg2, arg5);
        }
        if (arg0 == 1) {
            var9 = (class210) class418.method2504(arg3, arg2, arg5);
        }
        if (~arg0 == -3) {
            var9 = (class210) class106.method847(arg3, arg2, arg5, field6442 != null ? field6442 : (field6442 = method2739("dc")));
        }
        if (~arg0 == -4) {
            var9 = (class210) class86.method730(arg3, arg2, arg5);
        }
        if (var9 != null) {
            class267 var10 = class468.field6599.method506(-121, var9.method80(10143));
            int var11 = var9.method83((byte) 104);
            int var12 = var9.method71((byte) 84);
            if (var10.method1813((byte) -1)) {
                class209.method1430(arg5, var10, arg3, arg2, -25457);
            }
            if (var9.method82((byte) 105)) {
                var9.method78(true, arg1);
            }
            if (~arg0 == -1) {
                class421 var13 = class133.method991(arg3, arg2, arg5);
                if (!(var13 instanceof class281)) {
                    class133.method989(arg3, arg2, arg5);
                } else {
                    ((class281) var13).field4037 = null;
                }
                if (var10.field3847 != 0) {
                    arg6.method115(var12, arg2, arg5, !var10.field3863, 536870912, var10.field3874, var11);
                    return;
                }
                return;
            }
            if (~arg0 == -2) {
                class371 var14 = class418.method2504(arg3, arg2, arg5);
                if (var14 instanceof class366) {
                    ((class366) var14).field5032 = null;
                    return;
                }
                class387.method2353(arg3, arg2, arg5);
                return;
            }
            if (arg0 == 2) {
                class325 var15 = class106.method847(arg3, arg2, arg5, field6442 != null ? field6442 : (field6442 = method2739("dc")));
                if (var15 instanceof class158 && ~var15.field4535 == ~arg2 && ~var15.field4539 == ~arg5) {
                    ((class158) var15).field2253 = null;
                } else {
                    class409.method2450(arg3, arg2, arg5, field6442 != null ? field6442 : (field6442 = method2739("dc")));
                }
                if (~var10.field3847 != -1 && var10.field3843 + arg2 < super.field4465 && ~super.field4488 < ~(arg5 - -var10.field3843) && super.field4465 > var10.field3856 + arg2 && ~(var10.field3856 + arg5) > ~super.field4488) {
                    arg6.method117(var10.field3856, var10.field3843, arg5, var12, var10.field3874, !var10.field3863, (byte) 68, arg2);
                    return;
                }
                return;
            }
            if (~arg0 == -4) {
                class390 var16 = class86.method730(arg3, arg2, arg5);
                if (var16 instanceof class469) {
                    ((class469) var16).field6616 = null;
                } else {
                    class104.method835(arg3, arg2, arg5);
                }
                if (var10.field3847 == 1) {
                    arg6.method113(-262145, arg5, arg2);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IILpf;Lvc;IIIIIII)V", line = 121)
    public final void method2732(int arg0, int arg1, class18 arg2, class89 arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        ++field6433;
        if (class435.method2628(2) || class190.method1339(0, arg4, class259.field3691, arg8, arg6)) {
            if (arg8 < this.field6436) {
                this.field6436 = arg8;
            }
            class267 var12 = class468.field6599.method506(arg10 + 30447, arg5);
            if (class377.field5192 != 1 || !var12.field3845) {
                int var13;
                int var14;
                if (~arg0 != -2 && ~arg0 != -4) {
                    var13 = var12.field3843;
                    var14 = var12.field3856;
                } else {
                    var13 = var12.field3856;
                    var14 = var12.field3843;
                }
                int var15;
                int var16;
                if (~super.field4465 <= ~(arg6 + var13)) {
                    var15 = (var13 - -1 >> 1) + arg6;
                    var16 = (var13 >> 1) + arg6;
                } else {
                    var15 = arg6 + 1;
                    var16 = arg6;
                }
                int var17;
                int var18;
                if (~super.field4488 > ~(arg4 + var14)) {
                    var17 = arg4;
                    var18 = arg4 - -1;
                } else {
                    var17 = (var14 >> 1) + arg4;
                    var18 = (var14 + 1 >> 1) + arg4;
                }
                class241 var19 = class340.field4692[arg7];
                int var20 = var19.method591(var16, var17) + var19.method591(var15, var17) + var19.method591(var16, var18) + var19.method591(var15, var18) >> 2;
                int var21 = (arg6 << 7) + (var13 << 6);
                int var22 = (arg4 << 7) + (var14 << 6);
                boolean var23 = class303.field4308 && !super.field4478 && var12.field3858;
                if (var12.method1813((byte) -1)) {
                    class68.method634((class361) null, arg6, arg0, 128, arg4, arg8, (class39) null, var12);
                }
                boolean var24 = arg1 == -1 && ~var12.field3869 == 0 && var12.field3870 == null && var12.field3846 == null && !var12.field3913;
                if (!class19.field200 || var12.field3895 == 1) {
                    if (~arg9 == -23) {
                        if (class181.field2743 || ~var12.field3902 != -1 || ~var12.field3847 == -2 || var12.field3899) {
                            class390 var25;
                            if (!var24) {
                                var25 = new class466(arg3, var12, arg8, arg7, var21, var20, var22, super.field4478, arg0, arg1);
                            } else {
                                class440 var26 = new class440(arg3, var12, arg7, var21, var20, var22, super.field4478, arg0, var23);
                                if (var26.method82((byte) 110)) {
                                    var26.method85(arg3, (byte) -24);
                                }
                                var25 = var26;
                            }
                            class390 var27 = class86.method730(arg8, arg6, arg4);
                            if (!(var27 instanceof class469)) {
                                class18.method120(arg8, arg6, arg4, var25);
                            } else {
                                ((class469) var27).field6616 = var25;
                            }
                            if (~var12.field3847 == -2 && arg2 != null) {
                                arg2.method122(arg4, arg6, false);
                            }
                        }
                    } else if (~arg9 != -11 && arg9 != 11) {
                        if (arg9 >= 12 && ~arg9 >= -18 || ~arg9 <= -19 && arg9 <= 21) {
                            class325 var29;
                            if (var24) {
                                class416 var28 = new class416(arg3, var12, arg8, arg7, var21, var20, var22, super.field4478, arg6, var13 + -1 + arg6, arg4, arg4 + var14 - 1, arg9, arg0, var23);
                                var29 = var28;
                                if (var28.method82((byte) 125)) {
                                    var28.method85(arg3, (byte) -24);
                                }
                            } else {
                                var29 = new class111(arg3, var12, arg8, arg7, var21, var20, var22, super.field4478, arg6, arg6 + -1 + var13, arg4, arg4 + var14 + -1, arg9, arg0, arg1);
                            }
                            class325 var30 = class106.method847(arg8, arg6, arg4, field6442 != null ? field6442 : (field6442 = method2739("dc")));
                            if (var30 instanceof class158 && var30.field4535 == arg6 && var30.field4539 == arg4) {
                                ((class158) var30).field2253 = var29;
                            } else {
                                class363.method2230(var29, false);
                            }
                            if (class303.field4308 && !super.field4478 && arg9 >= 12 && arg9 <= 17 && ~arg9 != -14 && arg8 > 0 && var12.field3895 != 0) {
                                super.field4487[arg8][arg6][arg4] = (byte) class142.method1024(super.field4487[arg8][arg6][arg4], 4);
                            }
                            if (var12.field3847 != 0 && arg2 != null) {
                                arg2.method130(!var12.field3863, true, var14, var13, arg4, var12.field3874, arg6);
                            }
                        } else if (~arg9 == -1) {
                            class421 var32;
                            if (var24) {
                                class13 var31 = new class13(arg3, var12, arg7, var21, var20, var22, super.field4478, arg9, arg0, var23);
                                var32 = var31;
                                if (var31.method82((byte) 97)) {
                                    var31.method85(arg3, (byte) -24);
                                }
                            } else {
                                var32 = new class345(arg3, var12, arg8, arg7, var21, var20, var22, super.field4478, arg9, arg0, arg1);
                            }
                            class421 var33 = class133.method991(arg8, arg6, arg4);
                            if (var33 instanceof class281) {
                                ((class281) var33).field4037 = var32;
                            } else {
                                class398.method2393(arg8, arg6, arg4, var32, (class421) null);
                            }
                            if (class303.field4308) {
                                if (arg0 != 0) {
                                    if (arg0 != 1) {
                                        if (~arg0 == -3) {
                                            if (var12.field3916) {
                                                var19.method576(arg6 + 1, arg4, 50);
                                                var19.method576(arg6 - -1, arg4 + 1, 50);
                                            }
                                            if (var12.field3895 == 1 && !super.field4478) {
                                                super.field4487[arg8][arg6 + 1][arg4] = (byte) class142.method1024(super.field4487[arg8][arg6 + 1][arg4], 1);
                                            }
                                        } else if (~arg0 == -4) {
                                            if (var12.field3916) {
                                                var19.method576(arg6, arg4, 50);
                                                var19.method576(arg6 - -1, arg4, 50);
                                            }
                                            if (var12.field3895 == 1 && !super.field4478) {
                                                super.field4487[arg8][arg6][arg4] = (byte) class142.method1024(super.field4487[arg8][arg6][arg4], 2);
                                            }
                                        }
                                    } else {
                                        if (var12.field3916) {
                                            var19.method576(arg6, arg4 + 1, 50);
                                            var19.method576(arg6 + 1, arg4 - -1, 50);
                                        }
                                        if (var12.field3895 == 1 && !super.field4478) {
                                            super.field4487[arg8][arg6][arg4 - -1] = (byte) class142.method1024(super.field4487[arg8][arg6][arg4 - -1], 2);
                                        }
                                    }
                                } else {
                                    if (var12.field3916) {
                                        var19.method576(arg6, arg4, 50);
                                        var19.method576(arg6, arg4 + 1, 50);
                                    }
                                    if (var12.field3895 == 1 && !super.field4478) {
                                        super.field4487[arg8][arg6][arg4] = (byte) class142.method1024(super.field4487[arg8][arg6][arg4], 1);
                                    }
                                }
                            }
                            if (~var12.field3847 != -1 && arg2 != null) {
                                arg2.method128(var12.field3874, -105, arg4, arg0, arg6, arg9, !var12.field3863);
                            }
                            if (var12.field3851 != 16) {
                                class143.method1027(arg8, arg6, arg4, var12.field3851);
                            }
                        } else if (arg9 == 1) {
                            class421 var34;
                            if (!var24) {
                                var34 = new class345(arg3, var12, arg8, arg7, var21, var20, var22, super.field4478, arg9, arg0, arg1);
                            } else {
                                class13 var35 = new class13(arg3, var12, arg7, var21, var20, var22, super.field4478, arg9, arg0, var23);
                                if (var35.method82((byte) 98)) {
                                    var35.method85(arg3, (byte) -24);
                                }
                                var34 = var35;
                            }
                            class421 var36 = class133.method991(arg8, arg6, arg4);
                            if (var36 instanceof class281) {
                                ((class281) var36).field4037 = var34;
                            } else {
                                class398.method2393(arg8, arg6, arg4, var34, (class421) null);
                            }
                            if (var12.field3916 && class303.field4308) {
                                if (arg0 != 0) {
                                    if (~arg0 != -2) {
                                        if (arg0 != 2) {
                                            if (arg0 == 3) {
                                                var19.method576(arg6, arg4, 50);
                                            }
                                        } else {
                                            var19.method576(arg6 + 1, arg4, 50);
                                        }
                                    } else {
                                        var19.method576(arg6 + 1, arg4 + 1, 50);
                                    }
                                } else {
                                    var19.method576(arg6, arg4 - -1, 50);
                                }
                            }
                            if (~var12.field3847 != -1 && arg2 != null) {
                                arg2.method128(var12.field3874, -103, arg4, arg0, arg6, arg9, !var12.field3863);
                            }
                        } else if (~arg9 == -3) {
                            int var37 = 3 & arg0 + 1;
                            class421 var40;
                            class421 var41;
                            if (var24) {
                                class13 var38 = new class13(arg3, var12, arg7, var21, var20, var22, super.field4478, arg9, arg0 + 4, var23);
                                class13 var39 = new class13(arg3, var12, arg7, var21, var20, var22, super.field4478, arg9, var37, var23);
                                if (var38.method82((byte) 97)) {
                                    var38.method85(arg3, (byte) -24);
                                }
                                var40 = var39;
                                var41 = var38;
                                if (var39.method82((byte) 100)) {
                                    var39.method85(arg3, (byte) -24);
                                }
                            } else {
                                var41 = new class345(arg3, var12, arg8, arg7, var21, var20, var22, super.field4478, arg9, arg0 + 4, arg1);
                                var40 = new class345(arg3, var12, arg8, arg7, var21, var20, var22, super.field4478, arg9, var37, arg1);
                            }
                            class398.method2393(arg8, arg6, arg4, var41, var40);
                            if (~var12.field3895 == -2 && class303.field4308 && !super.field4478) {
                                if (arg0 == 0) {
                                    super.field4487[arg8][arg6][arg4] = (byte) class142.method1024(super.field4487[arg8][arg6][arg4], 1);
                                    super.field4487[arg8][arg6][arg4 - -1] = (byte) class142.method1024(super.field4487[arg8][arg6][arg4 - -1], 2);
                                } else if (~arg0 != -2) {
                                    if (~arg0 != -3) {
                                        if (arg0 == 3) {
                                            super.field4487[arg8][arg6][arg4] = (byte) class142.method1024(super.field4487[arg8][arg6][arg4], 2);
                                            super.field4487[arg8][arg6][arg4] = (byte) class142.method1024(super.field4487[arg8][arg6][arg4], 1);
                                        }
                                    } else {
                                        super.field4487[arg8][arg6 - -1][arg4] = (byte) class142.method1024(super.field4487[arg8][arg6 - -1][arg4], 1);
                                        super.field4487[arg8][arg6][arg4] = (byte) class142.method1024(super.field4487[arg8][arg6][arg4], 2);
                                    }
                                } else {
                                    super.field4487[arg8][arg6][arg4 + 1] = (byte) class142.method1024(super.field4487[arg8][arg6][arg4 + 1], 2);
                                    super.field4487[arg8][arg6 + 1][arg4] = (byte) class142.method1024(super.field4487[arg8][arg6 + 1][arg4], 1);
                                }
                            }
                            if (var12.field3847 != 0 && arg2 != null) {
                                arg2.method128(var12.field3874, -126, arg4, arg0, arg6, arg9, !var12.field3863);
                            }
                            if (~var12.field3851 != -17) {
                                class143.method1027(arg8, arg6, arg4, var12.field3851);
                            }
                        } else if (arg9 == 3) {
                            class421 var43;
                            if (var24) {
                                class13 var42 = new class13(arg3, var12, arg7, var21, var20, var22, super.field4478, arg9, arg0, var23);
                                var43 = var42;
                                if (var42.method82((byte) 124)) {
                                    var42.method85(arg3, (byte) -24);
                                }
                            } else {
                                var43 = new class345(arg3, var12, arg8, arg7, var21, var20, var22, super.field4478, arg9, arg0, arg1);
                            }
                            class421 var44 = class133.method991(arg8, arg6, arg4);
                            if (!(var44 instanceof class281)) {
                                class398.method2393(arg8, arg6, arg4, var43, (class421) null);
                            } else {
                                ((class281) var44).field4037 = var43;
                            }
                            if (var12.field3916 && class303.field4308) {
                                if (arg0 != 0) {
                                    if (arg0 == 1) {
                                        var19.method576(arg6 + 1, arg4 + 1, 50);
                                    } else if (~arg0 != -3) {
                                        if (arg0 == 3) {
                                            var19.method576(arg6, arg4, 50);
                                        }
                                    } else {
                                        var19.method576(arg6 - -1, arg4, 50);
                                    }
                                } else {
                                    var19.method576(arg6, arg4 - -1, 50);
                                }
                            }
                            if (~var12.field3847 != -1 && arg2 != null) {
                                arg2.method128(var12.field3874, -111, arg4, arg0, arg6, arg9, !var12.field3863);
                            }
                        } else if (arg9 == 9) {
                            class325 var45;
                            if (!var24) {
                                var45 = new class111(arg3, var12, arg8, arg7, var21, var20, var22, super.field4478, arg6, arg6 - (-var13 + 1), arg4, arg4 - (-var14 + 1), arg9, arg0, arg1);
                            } else {
                                class416 var46 = new class416(arg3, var12, arg8, arg7, var21, var20, var22, super.field4478, arg6, arg6, arg4, arg4, arg9, arg0, var23);
                                var45 = var46;
                                if (var46.method82((byte) 107)) {
                                    var46.method85(arg3, (byte) -24);
                                }
                            }
                            class325 var47 = class106.method847(arg8, arg6, arg4, field6442 != null ? field6442 : (field6442 = method2739("dc")));
                            if (var47 instanceof class158 && ~var47.field4535 == ~arg6 && var47.field4539 == arg4) {
                                ((class158) var47).field2253 = var45;
                            } else {
                                class363.method2230(var45, false);
                            }
                            if (~var12.field3847 != -1 && arg2 != null) {
                                arg2.method130(!var12.field3863, true, var14, var13, arg4, var12.field3874, arg6);
                            }
                            if (~var12.field3851 != -17) {
                                class143.method1027(arg8, arg6, arg4, var12.field3851);
                            }
                        } else if (arg9 == 4) {
                            class371 var48;
                            if (!var24) {
                                var48 = new class97(arg3, var12, arg8, arg7, var21, var20, var22, super.field4478, 0, 0, 0, arg9, arg0, arg1);
                            } else {
                                class236 var49 = new class236(arg3, var12, arg7, var21, var20, var22, super.field4478, 0, 0, 0, arg9, arg0);
                                var48 = var49;
                                if (var49.method82((byte) 98)) {
                                    var49.method85(arg3, (byte) -24);
                                }
                            }
                            class371 var50 = class418.method2504(arg8, arg6, arg4);
                            if (!(var50 instanceof class366)) {
                                class266.method1794(arg8, arg6, arg4, var48, (class371) null);
                            } else {
                                ((class366) var50).field5032 = var48;
                            }
                        } else if (~arg9 == -6) {
                            int var51 = 16;
                            class210 var52 = (class210) class133.method991(arg8, arg6, arg4);
                            if (var52 != null) {
                                var51 = class468.field6599.method506(-127, var52.method80(arg10 ^ -20727)).field3851;
                            }
                            class371 var53;
                            if (!var24) {
                                var53 = new class97(arg3, var12, arg8, arg7, var21, var20, var22, super.field4478, 0, class269.field3932[arg0] * var51, client.field856[arg0] * var51, arg9, arg0, arg1);
                            } else {
                                class236 var54 = new class236(arg3, var12, arg7, var21, var20, var22, super.field4478, 0, class269.field3932[arg0] * var51, client.field856[arg0] * var51, arg9, arg0);
                                var53 = var54;
                                if (var54.method82((byte) 121)) {
                                    var54.method85(arg3, (byte) -24);
                                }
                            }
                            class371 var55 = class418.method2504(arg8, arg6, arg4);
                            if (!(var55 instanceof class366)) {
                                class266.method1794(arg8, arg6, arg4, var53, (class371) null);
                            } else {
                                ((class366) var55).field5032 = var53;
                            }
                        } else if (arg10 == -30570) {
                            if (arg9 == 6) {
                                int var56 = 8;
                                class210 var57 = (class210) class133.method991(arg8, arg6, arg4);
                                if (var57 != null) {
                                    var56 = class468.field6599.method506(-123, var57.method80(10143)).field3851 / 2;
                                }
                                class371 var59;
                                if (var24) {
                                    class236 var58 = new class236(arg3, var12, arg7, var21, var20, var22, super.field4478, arg0, class269.field3932[arg0] * var56, client.field856[arg0] * var56, arg9, arg0 + 4);
                                    var59 = var58;
                                    if (var58.method82((byte) 110)) {
                                        var58.method85(arg3, (byte) -24);
                                    }
                                } else {
                                    var59 = new class97(arg3, var12, arg8, arg7, var21, var20, var22, super.field4478, arg0, class69.field1011[arg0] * var56, class218.field3164[arg0] * var56, arg9, arg0 + 4, arg1);
                                }
                                class371 var60 = class418.method2504(arg8, arg6, arg4);
                                if (!(var60 instanceof class366)) {
                                    class266.method1794(arg8, arg6, arg4, var59, (class371) null);
                                } else {
                                    ((class366) var60).field5032 = var59;
                                }
                            } else if (arg9 == 7) {
                                int var61 = arg0 + 2 & 3;
                                class371 var63;
                                if (var24) {
                                    class236 var62 = new class236(arg3, var12, arg7, var21, var20, var22, super.field4478, var61, 0, 0, arg9, var61 + 4);
                                    var63 = var62;
                                    if (var62.method82((byte) 107)) {
                                        var62.method85(arg3, (byte) -24);
                                    }
                                } else {
                                    var63 = new class97(arg3, var12, arg8, arg7, var21, var20, var22, super.field4478, var61, 0, 0, arg9, var61 - -4, arg1);
                                }
                                class371 var64 = class418.method2504(arg8, arg6, arg4);
                                if (var64 instanceof class366) {
                                    ((class366) var64).field5032 = var63;
                                } else {
                                    class266.method1794(arg8, arg6, arg4, var63, (class371) null);
                                }
                            } else if (~arg9 == -9) {
                                int var65 = arg0 + 2 & 3;
                                int var66 = 8;
                                class210 var67 = (class210) class133.method991(arg8, arg6, arg4);
                                if (var67 != null) {
                                    var66 = class468.field6599.method506(-123, var67.method80(10143)).field3851 / 2;
                                }
                                class371 var70;
                                class371 var71;
                                if (var24) {
                                    class236 var68 = new class236(arg3, var12, arg7, var21, var20, var22, super.field4478, arg0, class69.field1011[arg0] * var66, class218.field3164[arg0] * var66, arg9, arg0 + 4);
                                    class236 var69 = new class236(arg3, var12, arg7, var21, var20, var22, super.field4478, arg0, 0, 0, arg9, var65 + 4);
                                    if (var68.method82((byte) 108)) {
                                        var68.method85(arg3, (byte) -24);
                                    }
                                    var70 = var69;
                                    if (var69.method82((byte) 123)) {
                                        var69.method85(arg3, (byte) -24);
                                    }
                                    var71 = var68;
                                } else {
                                    class97 var72 = new class97(arg3, var12, arg8, arg7, var21, var20, var22, super.field4478, arg0, class69.field1011[arg0] * var66, class218.field3164[arg0] * var66, arg9, arg0 - -4, arg1);
                                    class97 var73 = new class97(arg3, var12, arg8, arg7, var21, var20, var22, super.field4478, arg0, 0, 0, arg9, var65 + 4, arg1);
                                    var71 = var72;
                                    var70 = var73;
                                }
                                class266.method1794(arg8, arg6, arg4, var71, var70);
                            }
                        }
                    } else {
                        class416 var74 = null;
                        class325 var76;
                        int var77;
                        if (var24) {
                            class416 var75 = new class416(arg3, var12, arg8, arg7, var21, var20, var22, super.field4478, arg6, arg6 - -var13 + -1, arg4, arg4 - -var14 + -1, arg9, arg0, var23);
                            var76 = var75;
                            var74 = var75;
                            var77 = var75.method2487(4);
                        } else {
                            var77 = 15;
                            var76 = new class111(arg3, var12, arg8, arg7, var21, var20, var22, super.field4478, arg6, arg6 + var13 + -1, arg4, arg4 + var14 + -1, arg9, arg0, arg1);
                        }
                        class325 var78 = class106.method847(arg8, arg6, arg4, field6442 != null ? field6442 : (field6442 = method2739("dc")));
                        boolean var79 = false;
                        if (var78 instanceof class158 && ~var78.field4535 == ~arg6 && var78.field4539 == arg4) {
                            ((class158) var78).field2253 = var76;
                            var79 = true;
                        }
                        if (var79 || class363.method2230(var76, false)) {
                            if (var74 != null && var74.method82((byte) 113)) {
                                var74.method85(arg3, (byte) -24);
                            }
                            if (var12.field3916 && class303.field4308) {
                                if (~var77 < -31) {
                                    var77 = 30;
                                }
                                for (int var80 = 0; ~var13 <= ~var80; ++var80) {
                                    for (int var81 = 0; ~var14 <= ~var81; ++var81) {
                                        var19.method576(arg6 + var80, arg4 + var81, var77);
                                    }
                                }
                            }
                        }
                        if (var12.field3847 != 0 && arg2 != null) {
                            arg2.method130(!var12.field3863, true, var14, var13, arg4, var12.field3874, arg6);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "([Lpf;Lvc;B[BII)V", line = 826)
    public final void method2733(class18[] arg0, class89 arg1, byte arg2, byte[] arg3, int arg4, int arg5) {
        ++field6439;
        class161 var7 = new class161(arg3);
        int var8 = -1 % ((arg2 - 2) / 34);
        int var9 = -1;
        while (true) {
            int var10 = var7.method1141(11160);
            if (var10 == 0) {
                return;
            }
            var9 += var10;
            int var11 = 0;
            while (true) {
                int var12 = var7.method1133(0);
                if (var12 == 0) {
                    break;
                }
                var11 += var12 + -1;
                int var13 = 63 & var11;
                int var14 = 63 & var11 >> 6;
                int var15 = var11 >> 12;
                int var16 = var7.method1172((byte) -113);
                int var17 = var16 >> 2;
                int var18 = var16 & 3;
                int var19 = arg5 + var14;
                int var20 = arg4 + var13;
                if (var19 > 0 && var20 > 0 && ~(super.field4465 + -1) < ~var19 && ~var20 > ~(super.field4488 + -1)) {
                    class18 var21 = null;
                    if (!super.field4478) {
                        int var22 = var15;
                        if (~(class372.field5120[1][var19][var20] & 2) == -3) {
                            var22 = var15 - 1;
                        }
                        if (var22 >= 0) {
                            var21 = arg0[var22];
                        }
                    }
                    this.method2732(var18, -1, var21, arg1, var20, var9, var19, var15, var15, var17, -30570);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(I)V", line = 903)
    public static void method2734(int arg0) {
        field6426 = null;
        field6428 = null;
        field6435 = null;
        field6440 = null;
        if (arg0 <= 99) {
            method2734(2);
        }
        field6437 = null;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IB[IILvc;Lkk;)V", line = 920)
    public final void method2735(int arg0, byte arg1, int[] arg2, int arg3, class89 arg4, class161 arg5) {
        ++field6441;
        if (!super.field4478) {
            if (arg1 == 79) {
                boolean var7 = false;
                if (arg2 != null) {
                    arg2[0] = -1;
                }
                class483 var8 = null;
                while (true) {
                    while (arg5.field2298 < arg5.field2262.length) {
                        int var18 = arg5.method1172((byte) 49);
                        if (~var18 == -1) {
                            var8 = new class483(arg5);
                        } else if (var18 == 1) {
                            int var34 = arg5.method1172((byte) -122);
                            if (var34 > 0) {
                                for (int var35 = 0; var34 > var35; ++var35) {
                                    class87 var36 = new class87(arg5);
                                    if (var36.field1231 == 31) {
                                        class125 var37 = class84.field1213.method2444(arg5.method1134(arg1 + -16927), 127);
                                        var36.method735((byte) -36, var37.field1690, var37.field1694, var37.field1693, var37.field1696);
                                    }
                                    var36.field1466 += arg3 << 7;
                                    var36.field1461 += arg0 << 7;
                                    int var38 = var36.field1466 >> 7;
                                    int var39 = var36.field1461 >> 7;
                                    if (var38 >= 0 && ~var39 <= -1 && ~super.field4465 < ~var38 && ~super.field4488 < ~var39) {
                                        var36.field1465 = super.field4484[var36.field1226][var38][var39] + -var36.field1465;
                                        if (~arg4.method403() < -1) {
                                            class6.method34(var36);
                                        }
                                    }
                                }
                            }
                        } else if (~var18 == -3) {
                            if (var8 == null) {
                                var8 = new class483();
                            }
                            var8.method2846(8, arg5);
                        } else if (var18 == 128) {
                            if (arg2 != null) {
                                arg2[0] = arg5.method1134(-16848);
                                arg2[1] = arg5.method1163(arg1 + 9909);
                                arg2[2] = arg5.method1163(9988);
                                arg2[3] = arg5.method1163(9988);
                                arg2[4] = arg5.method1134(-16848);
                            } else {
                                arg5.field2298 += 10;
                            }
                        } else {
                            if (~var18 != -130) {
                                throw new IllegalStateException((String) null);
                            }
                            if (super.field4462 == null) {
                                super.field4462 = new byte[4][][];
                            }
                            for (int var19 = 0; ~var19 > -5; ++var19) {
                                byte var20 = arg5.method1152(arg1 ^ -1910700841);
                                if (~var20 == -1 && super.field4462[var19] != null) {
                                    int var21 = arg3;
                                    int var22 = arg3 - -64;
                                    int var23 = arg0;
                                    if (~arg3 > -1) {
                                        var21 = 0;
                                    } else if (super.field4465 <= arg3) {
                                        var21 = super.field4465;
                                    }
                                    int var24 = arg0 + 64;
                                    if (~arg0 > -1) {
                                        var23 = 0;
                                    } else if (~super.field4488 >= ~arg0) {
                                        var23 = super.field4488;
                                    }
                                    if (~var22 <= -1) {
                                        if (var22 >= super.field4465) {
                                            var22 = super.field4465;
                                        }
                                    } else {
                                        var22 = 0;
                                    }
                                    if (~var24 > -1) {
                                        var24 = 0;
                                    } else if (super.field4488 <= var24) {
                                        var24 = super.field4488;
                                    }
                                    while (~var21 > ~var22) {
                                        while (var24 > var23) {
                                            super.field4462[var19][var21][var23] = 0;
                                            ++var23;
                                        }
                                        ++var21;
                                    }
                                } else if (~var20 != -2) {
                                    if (~var20 == -3) {
                                        if (super.field4462[var19] == null) {
                                            super.field4462[var19] = new byte[super.field4465 + 1][super.field4488 + 1];
                                        }
                                        if (var19 > 0) {
                                            int var25 = arg3;
                                            int var26 = arg3 + 64;
                                            int var27 = arg0;
                                            if (~var26 > -1) {
                                                var26 = 0;
                                            } else if (super.field4465 <= var26) {
                                                var26 = super.field4465;
                                            }
                                            if (~arg0 <= -1) {
                                                if (super.field4488 <= arg0) {
                                                    var27 = super.field4488;
                                                }
                                            } else {
                                                var27 = 0;
                                            }
                                            if (~arg3 > -1) {
                                                var25 = 0;
                                            } else if (~arg3 <= ~super.field4465) {
                                                var25 = super.field4465;
                                            }
                                            int var28 = arg0 + 64;
                                            if (~var28 > -1) {
                                                var28 = 0;
                                            } else if (var28 >= super.field4488) {
                                                var28 = super.field4488;
                                            }
                                            while (~var26 < ~var25) {
                                                while (~var28 < ~var27) {
                                                    super.field4462[var19][var25][var27] = super.field4462[var19 + -1][var25][var27];
                                                    ++var27;
                                                }
                                                ++var25;
                                            }
                                        }
                                    }
                                } else {
                                    if (super.field4462[var19] == null) {
                                        super.field4462[var19] = new byte[super.field4465 + 1][super.field4488 + 1];
                                    }
                                    for (int var29 = 0; ~var29 > -65; var29 += 4) {
                                        for (int var30 = 0; ~var30 > -65; var30 += 4) {
                                            byte var31 = arg5.method1152(-1910700904);
                                            for (int var32 = arg3 + var29; arg3 - -4 + var29 > var32; ++var32) {
                                                for (int var33 = arg0 + var30; var33 < var30 - -4 + arg0; ++var33) {
                                                    if (~var32 <= -1 && ~var32 > ~super.field4465 && var33 >= 0 && var33 < super.field4488) {
                                                        super.field4462[var19][var32][var33] = var31;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            var7 = true;
                        }
                    }
                    if (var8 != null) {
                        for (int var9 = 0; var9 < 8; ++var9) {
                            for (int var10 = 0; var10 < 8; ++var10) {
                                int var11 = (arg3 >> 3) - -var9;
                                int var12 = (arg0 >> 3) + var10;
                                if (~var11 <= -1 && var11 < super.field4465 >> 3 && var12 >= 0 && ~(super.field4488 >> 3) < ~var12) {
                                    class9.method50(var11, var12, var8, (byte) 65);
                                }
                            }
                        }
                    }
                    if (!var7 && super.field4462 != null) {
                        for (int var13 = 0; ~var13 > -5; ++var13) {
                            if (super.field4462[var13] != null) {
                                for (int var14 = 0; var14 < 16; ++var14) {
                                    for (int var15 = 0; var15 < 16; ++var15) {
                                        int var16 = (arg3 >> 2) + var14;
                                        int var17 = (arg0 >> 2) + var15;
                                        if (~var16 <= -1 && var16 < 26 && ~var17 <= -1 && ~var17 > -27) {
                                            super.field4462[var13][var16][var17] = 0;
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

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(IIIZ)V", line = 1277)
    public class454(int arg0, int arg1, int arg2, boolean arg3) {
        super(arg0, arg1, arg2, arg3, class305.field4337, class110.field1541);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lvc;I)V", line = 1281)
    public final void method2736(class89 arg0, int arg1) {
        class436.method2666(arg0);
        if (arg1 <= 29) {
            field6435 = null;
        }
        ++field6427;
        if (super.field4474 > 1) {
            for (int var3 = 0; ~var3 > ~super.field4465; ++var3) {
                for (int var4 = 0; ~var4 > ~super.field4488; ++var4) {
                    if ((class372.field5120[1][var3][var4] & 2) == 2) {
                        class162.method1199(var3, var4);
                    }
                }
            }
        }
        for (int var5 = 0; var5 < super.field4474; ++var5) {
            for (int var6 = 0; var6 <= super.field4488; ++var6) {
                for (int var7 = 0; ~var7 >= ~super.field4465; ++var7) {
                    if (~(super.field4487[var5][var7][var6] & 1) != -1) {
                        int var8 = var6;
                        int var9 = var6;
                        int var10 = var5;
                        int var11 = var5;
                        while (super.field4488 > var9 && (1 & super.field4487[var5][var7][var9 + 1]) != 0) {
                            ++var9;
                        }
                        while (~var8 < -1 && (1 & super.field4487[var5][var7][var8 + -1]) != 0) {
                            --var8;
                        }
                        label169: while (~var10 < -1) {
                            for (int var12 = var8; ~var9 <= ~var12; ++var12) {
                                if ((1 & super.field4487[var10 + -1][var7][var12]) == 0) {
                                    break label169;
                                }
                            }
                            --var10;
                        }
                        label158: while (var11 < 3) {
                            for (int var13 = var8; ~var9 <= ~var13; ++var13) {
                                if (~(1 & super.field4487[var11 + 1][var7][var13]) == -1) {
                                    break label158;
                                }
                            }
                            ++var11;
                        }
                        int var14 = (-var8 + var9 + 1) * (-var10 + 1 + var11);
                        if (var14 >= 2) {
                            short var15 = 240;
                            int var16 = super.field4484[var11][var7][var8] + -var15;
                            int var17 = super.field4484[var10][var7][var8];
                            class96.method797(1, var7 * 128, var7 * 128, var8 * 128, var9 * 128 + 128, var16, var17);
                            for (int var18 = var10; var11 >= var18; ++var18) {
                                for (int var19 = var8; ~var9 <= ~var19; ++var19) {
                                    super.field4487[var18][var7][var19] = (byte) class88.method739(super.field4487[var18][var7][var19], -2);
                                }
                            }
                        }
                    }
                    if (~(super.field4487[var5][var7][var6] & 2) != -1) {
                        int var20 = var7;
                        int var21 = var7;
                        int var22 = var5;
                        while (~var20 < -1 && ~(super.field4487[var5][var20 + -1][var6] & 2) != -1) {
                            --var20;
                        }
                        while (super.field4465 > var21 && (2 & super.field4487[var5][var21 - -1][var6]) != 0) {
                            ++var21;
                        }
                        int var23 = var5;
                        label222: while (var22 > 0) {
                            for (int var24 = var20; var24 <= var21; ++var24) {
                                if ((super.field4487[var22 - 1][var24][var6] & 2) == 0) {
                                    break label222;
                                }
                            }
                            --var22;
                        }
                        label211: while (~var23 > -4) {
                            for (int var25 = var20; var25 <= var21; ++var25) {
                                if (~(super.field4487[var23 + 1][var25][var6] & 2) == -1) {
                                    break label211;
                                }
                            }
                            ++var23;
                        }
                        int var26 = (-var20 + var21 - -1) * (var23 - (var22 + -1));
                        if (~var26 <= -3) {
                            short var27 = 240;
                            int var28 = super.field4484[var23][var20][var6] + -var27;
                            int var29 = super.field4484[var22][var20][var6];
                            class96.method797(2, var20 * 128, var21 * 128 + 128, var6 * 128, var6 * 128, var28, var29);
                            for (int var30 = var22; var23 >= var30; ++var30) {
                                for (int var31 = var20; ~var31 >= ~var21; ++var31) {
                                    super.field4487[var30][var31][var6] = (byte) class88.method739(super.field4487[var30][var31][var6], -3);
                                }
                            }
                        }
                    }
                    if (~(4 & super.field4487[var5][var7][var6]) != -1) {
                        int var32 = var7;
                        int var33 = var7;
                        int var34 = var6;
                        int var35 = var6;
                        while (~var34 < -1 && (4 & super.field4487[var5][var7][var34 + -1]) != 0) {
                            --var34;
                        }
                        while (var35 < super.field4488 && (4 & super.field4487[var5][var7][var35 - -1]) != 0) {
                            ++var35;
                        }
                        label276: while (~var32 < -1) {
                            for (int var36 = var34; ~var35 <= ~var36; ++var36) {
                                if (~(4 & super.field4487[var5][var32 + -1][var36]) == -1) {
                                    break label276;
                                }
                            }
                            --var32;
                        }
                        label265: while (~var33 > ~super.field4465) {
                            for (int var37 = var34; ~var37 >= ~var35; ++var37) {
                                if ((super.field4487[var5][var33 - -1][var37] & 4) == 0) {
                                    break label265;
                                }
                            }
                            ++var33;
                        }
                        if ((-var32 + var33 - -1) * (var35 - var34 + 1) >= 4) {
                            int var38 = super.field4484[var5][var32][var34];
                            class96.method797(4, var32 * 128, var33 * 128 + 128, var34 * 128, var35 * 128 + 128, var38, var38);
                            for (int var39 = var32; var33 >= var39; ++var39) {
                                for (int var40 = var34; var35 >= var40; ++var40) {
                                    super.field4487[var5][var39][var40] = (byte) class88.method739(super.field4487[var5][var39][var40], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
        super.field4487 = null;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IILvc;Lkk;IIIIII[I)V", line = 1581)
    public final void method2737(int arg0, int arg1, class89 arg2, class161 arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int[] arg10) {
        ++field6431;
        if (!super.field4478) {
            boolean var12 = false;
            class483 var13 = null;
            if (arg10 != null) {
                arg10[0] = -1;
            }
            if (arg9 == -1) {
                int var14 = (7 & arg0) * 8;
                int var15 = (arg8 & 7) * 8;
                while (true) {
                    while (true) {
                        while (true) {
                            while (~arg3.field2298 > ~arg3.field2262.length) {
                                int var20 = arg3.method1172((byte) 72);
                                if (~var20 != -1) {
                                    if (~var20 != -2) {
                                        if (var20 == 2) {
                                            if (var13 == null) {
                                                var13 = new class483();
                                            }
                                            var13.method2846(8, arg3);
                                        } else if (var20 == 128) {
                                            if (arg10 == null) {
                                                arg3.field2298 += 10;
                                            } else {
                                                arg10[0] = arg3.method1134(-16848);
                                                arg10[1] = arg3.method1163(9988);
                                                arg10[2] = arg3.method1163(class134.method993(arg9, -9989));
                                                arg10[3] = arg3.method1163(9988);
                                                arg10[4] = arg3.method1134(-16848);
                                            }
                                        } else {
                                            if (var20 != 129) {
                                                throw new IllegalStateException("");
                                            }
                                            if (super.field4462 == null) {
                                                super.field4462 = new byte[4][][];
                                            }
                                            for (int var21 = 0; ~var21 > -5; ++var21) {
                                                byte var22 = arg3.method1152(-1910700904);
                                                if (var22 == 0 && super.field4462[arg5] != null) {
                                                    if (~var21 >= ~arg7) {
                                                        int var23 = arg4;
                                                        int var24 = arg4 + 7;
                                                        int var25 = arg1;
                                                        if (~arg4 > -1) {
                                                            var23 = 0;
                                                        } else if (~arg4 <= ~super.field4465) {
                                                            var23 = super.field4465;
                                                        }
                                                        if (~arg1 <= -1) {
                                                            if (arg1 >= super.field4488) {
                                                                var25 = super.field4488;
                                                            }
                                                        } else {
                                                            var25 = 0;
                                                        }
                                                        if (~var24 > -1) {
                                                            var24 = 0;
                                                        } else if (var24 >= super.field4465) {
                                                            var24 = super.field4465;
                                                        }
                                                        int var26 = arg1 + 7;
                                                        if (~var26 > -1) {
                                                            var26 = 0;
                                                        } else if (super.field4488 <= var26) {
                                                            var26 = super.field4488;
                                                        }
                                                        while (~var24 < ~var23) {
                                                            while (~var26 < ~var25) {
                                                                super.field4462[arg5][var23][var25] = 0;
                                                                ++var25;
                                                            }
                                                            ++var23;
                                                        }
                                                    }
                                                } else if (var22 == 1) {
                                                    if (super.field4462[arg5] == null) {
                                                        super.field4462[arg5] = new byte[super.field4465 + 1][super.field4488 - -1];
                                                    }
                                                    for (int var27 = 0; var27 < 64; var27 += 4) {
                                                        for (int var28 = 0; var28 < 64; var28 += 4) {
                                                            byte var29 = arg3.method1152(-1910700904);
                                                            if (~arg7 <= ~var21) {
                                                                for (int var30 = var27; var30 < var27 + 4; ++var30) {
                                                                    for (int var31 = var28; var28 + 4 > var31; ++var31) {
                                                                        if (~var14 >= ~var30 && var14 + 8 > var30 && var31 >= var15 && ~var15 > ~(var15 + 8)) {
                                                                            int var32 = arg4 - -class372.method2270(arg6, 7 & var31, var30 & 7, 1);
                                                                            int var33 = class46.method473(arg6, var31 & 7, 7 & var30, -95) + arg1;
                                                                            if (~var32 <= -1 && var32 < super.field4465 && ~var33 <= -1 && ~var33 > ~super.field4488) {
                                                                                super.field4462[arg5][var32][var33] = var29;
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
                                    } else {
                                        int var34 = arg3.method1172((byte) -124);
                                        if (var34 > 0) {
                                            for (int var35 = 0; var35 < var34; ++var35) {
                                                class87 var36 = new class87(arg3);
                                                if (~var36.field1231 == -32) {
                                                    class125 var37 = class84.field1213.method2444(arg3.method1134(-16848), 123);
                                                    var36.method735((byte) -36, var37.field1690, var37.field1694, var37.field1693, var37.field1696);
                                                }
                                                int var38 = var36.field1466 >> 7;
                                                int var39 = var36.field1461 >> 7;
                                                if (~var36.field1226 == ~arg7 && ~var14 >= ~var38 && var38 < var14 + 8 && ~var15 >= ~var39 && ~var39 > ~(var15 + 8)) {
                                                    int var40 = class440.method2679(1023 & var36.field1466, arg6, 1023 & var36.field1461, -14767) + (arg4 << 7);
                                                    int var41 = (arg1 << 7) + class104.method836(arg6, var36.field1466 & 1023, var36.field1461 & 1023, (byte) -100);
                                                    var36.field1461 = var41;
                                                    var36.field1466 = var40;
                                                    int var42 = var36.field1466 >> 7;
                                                    int var43 = var36.field1461 >> 7;
                                                    if (var42 >= 0 && ~var43 <= -1 && super.field4465 > var42 && super.field4488 > var43) {
                                                        var36.field1465 = super.field4484[arg7][var42][var43] + -var36.field1465;
                                                        if (arg2.method403() > 0) {
                                                            class6.method34(var36);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    var13 = new class483(arg3);
                                }
                            }
                            if (var13 != null) {
                                class9.method50(arg4 >> 3, arg1 >> 3, var13, (byte) 65);
                            }
                            if (!var12 && super.field4462 != null && super.field4462[arg5] != null) {
                                int var16 = arg4 + 7;
                                int var17 = arg1 - -7;
                                for (int var18 = arg4; ~var16 < ~var18; ++var18) {
                                    for (int var19 = arg1; var17 > var19; ++var19) {
                                        super.field4462[arg5][var18][var19] = 0;
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

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lvc;IIII[Lpf;II[BII)V", line = 1874)
    public final void method2738(class89 arg0, int arg1, int arg2, int arg3, int arg4, class18[] arg5, int arg6, int arg7, byte[] arg8, int arg9, int arg10) {
        ++field6429;
        class161 var12 = new class161(arg8);
        int var13 = arg4;
        while (true) {
            int var14 = var12.method1141(11160);
            if (~var14 == -1) {
                return;
            }
            var13 += var14;
            int var15 = 0;
            while (true) {
                int var16 = var12.method1133(0);
                if (var16 == 0) {
                    break;
                }
                var15 += var16 + -1;
                int var17 = var15 & 63;
                int var18 = (4077 & var15) >> 6;
                int var19 = var15 >> 12;
                int var20 = var12.method1172((byte) -114);
                int var21 = var20 >> 2;
                int var22 = var20 & 3;
                if (arg1 == var19 && arg2 <= var18 && ~var18 > ~(arg2 + 8) && arg7 <= var17 && arg7 + 8 > var17) {
                    class267 var23 = class468.field6599.method506(-119, var13);
                    int var24 = class59.method527(var22, 7 & var18, var23.field3856, 7 & var17, arg3, var23.field3843, (byte) 85) + arg6;
                    int var25 = arg9 - -class95.method792(7 & var17, 7 & var18, var23.field3856, -128, arg3, var23.field3843, var22);
                    if (~var24 < -1 && var25 > 0 && super.field4465 + -1 > var24 && super.field4488 + -1 > var25) {
                        class18 var26 = null;
                        if (!super.field4478) {
                            int var27 = arg10;
                            if ((class372.field5120[1][var24][var25] & 2) == 2) {
                                var27 = arg10 - 1;
                            }
                            if (~var27 <= -1) {
                                var26 = arg5[var27];
                            }
                        }
                        this.method2732(arg3 + var22 & 3, -1, var26, arg0, var25, var13, var24, arg10, arg10, var21, -30570);
                    }
                }
            }
        }
    }
}
