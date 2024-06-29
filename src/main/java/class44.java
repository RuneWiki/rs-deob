import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class44 {

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "[Lcg;")
    public static class165[] field730 = new class165[50];

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "I")
    public static int field732 = 0;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "Lp;")
    public static class280 field726 = class18.method140((byte) -119, "Chargement en cours)3 Veuillez patienter)3");

    @OriginalMember(owner = "client!sd", name = "n", descriptor = "Z")
    public static boolean field739 = false;

    @OriginalMember(owner = "client!sd", name = "m", descriptor = "Lp;")
    private static class280 field738 = class18.method140((byte) -124, "Loading interfaces )2 ");

    @OriginalMember(owner = "client!sd", name = "k", descriptor = "Lp;")
    public static class280 field736 = field738;

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "I")
    public static int field728;

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "I")
    public static int field729;

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "I")
    public static int field731;

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "I")
    public static int field733;

    @OriginalMember(owner = "client!sd", name = "i", descriptor = "I")
    public static int field734;

    @OriginalMember(owner = "client!sd", name = "j", descriptor = "I")
    public static int field735;

    @OriginalMember(owner = "client!sd", name = "l", descriptor = "I")
    public static int field737;

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "Lal;")
    public static class227 field727;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IZIBI)V")
    public static final void method332(int arg0, boolean arg1, int arg2, byte arg3, int arg4) {
        if (arg3 == 81) {
            field731++;
            if (class48.method356(-664, arg4)) {
                class130.method890(arg2, (byte) -119, class251.field4394[arg4], arg0, arg1, -1);
            }
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIILtg;)[Lde;")
    public static final class108[] method333(int arg0, int arg1, int arg2, class180 arg3) {
        field728++;
        if (class90.method648(arg2, arg1, arg3, -41)) {
            if (arg0 != 1) {
                method332(29, true, 31, (byte) 53, -85);
            }
            return class246.method1670(false);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lae;IIIIIIIZ)V")
    public static final void method334(class169 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        int var9;
        int var10 = var9 = (arg6 << 7) - class51.field841;
        int var11;
        int var12 = var11 = (arg7 << 7) - class108.field1786;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = class145.field2529[arg1][arg6][arg7] - class277.field4814;
        int var18 = class145.field2529[arg1][arg6 + 1][arg7] - class277.field4814;
        int var19 = class145.field2529[arg1][arg6 + 1][arg7 + 1] - class277.field4814;
        int var20 = class145.field2529[arg1][arg6][arg7 + 1] - class277.field4814;
        int var21 = arg4 * var12 + arg5 * var10 >> 16;
        int var22 = arg5 * var12 - arg4 * var10 >> 16;
        int var24 = arg3 * var17 - arg2 * var22 >> 16;
        int var25 = arg2 * var17 + arg3 * var22 >> 16;
        if (var25 < 50) {
            return;
        }
        int var27 = arg4 * var11 + arg5 * var14 >> 16;
        int var28 = arg5 * var11 - arg4 * var14 >> 16;
        int var30 = arg3 * var18 - arg2 * var28 >> 16;
        int var31 = arg2 * var18 + arg3 * var28 >> 16;
        if (var31 < 50) {
            return;
        }
        int var33 = arg4 * var16 + arg5 * var13 >> 16;
        int var34 = arg5 * var16 - arg4 * var13 >> 16;
        int var36 = arg3 * var19 - arg2 * var34 >> 16;
        int var37 = arg2 * var19 + arg3 * var34 >> 16;
        if (var37 < 50) {
            return;
        }
        int var39 = arg4 * var15 + arg5 * var9 >> 16;
        int var40 = arg5 * var15 - arg4 * var9 >> 16;
        int var42 = arg3 * var20 - arg2 * var40 >> 16;
        int var43 = arg2 * var20 + arg3 * var40 >> 16;
        if (var43 < 50) {
            return;
        }
        int var45 = (var21 << 9) / var25 + class146.field2549;
        int var46 = (var24 << 9) / var25 + class146.field2556;
        int var47 = (var27 << 9) / var31 + class146.field2549;
        int var48 = (var30 << 9) / var31 + class146.field2556;
        int var49 = (var33 << 9) / var37 + class146.field2549;
        int var50 = (var36 << 9) / var37 + class146.field2556;
        int var51 = (var39 << 9) / var43 + class146.field2549;
        int var52 = (var42 << 9) / var43 + class146.field2556;
        class146.field2542 = 0;
        if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0) {
            if (class193.field3397 && class237.method1588(class258.field4574 + class146.field2549, class282.field4959 + class146.field2556, var50, var52, var48, var49, var51, var47)) {
                class115.field2091 = arg6;
                class147.field2560 = arg7;
            }
            if (!arg8) {
                class146.field2551 = false;
                if (var49 < 0 || var51 < 0 || var47 < 0 || var49 > class146.field2548 || var51 > class146.field2548 || var47 > class146.field2548) {
                    class146.field2551 = true;
                }
                if (arg0.field2949 == -1) {
                    if (arg0.field2948 != 12345678) {
                        class146.method1020(var50, var52, var48, var49, var51, var47, arg0.field2948, arg0.field2945, arg0.field2955);
                    }
                } else if (!class81.field1332) {
                    int var53 = class146.field2539.method1439(arg0.field2949, -11728);
                    class146.method1020(var50, var52, var48, var49, var51, var47, class9.method86(var53, arg0.field2948), class9.method86(var53, arg0.field2945), class9.method86(var53, arg0.field2955));
                } else if (arg0.field2947) {
                    class146.method1012(var50, var52, var48, var49, var51, var47, arg0.field2948, arg0.field2945, arg0.field2955, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field2949);
                } else {
                    class146.method1012(var50, var52, var48, var49, var51, var47, arg0.field2948, arg0.field2945, arg0.field2955, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field2949);
                }
            }
        }
        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) <= 0) {
            return;
        }
        if (class193.field3397 && class237.method1588(class258.field4574 + class146.field2549, class282.field4959 + class146.field2556, var46, var48, var52, var45, var47, var51)) {
            class115.field2091 = arg6;
            class147.field2560 = arg7;
        }
        if (arg8) {
            return;
        }
        class146.field2551 = false;
        if (var45 < 0 || var47 < 0 || var51 < 0 || var45 > class146.field2548 || var47 > class146.field2548 || var51 > class146.field2548) {
            class146.field2551 = true;
        }
        if (arg0.field2949 != -1) {
            if (class81.field1332) {
                class146.method1012(var46, var48, var52, var45, var47, var51, arg0.field2946, arg0.field2955, arg0.field2945, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field2949);
                return;
            }
            int var54 = class146.field2539.method1439(arg0.field2949, -11728);
            class146.method1020(var46, var48, var52, var45, var47, var51, class9.method86(var54, arg0.field2946), class9.method86(var54, arg0.field2955), class9.method86(var54, arg0.field2945));
        } else if (arg0.field2946 != 12345678) {
            class146.method1020(var46, var48, var52, var45, var47, var51, arg0.field2946, arg0.field2955, arg0.field2945);
            return;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IB)I")
    public static final int method335(int arg0, byte arg1) {
        if (arg1 > -8) {
            return 98;
        } else {
            field735++;
            return arg0 & 0x3FF;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(B)V")
    public static void method336(byte arg0) {
        field738 = null;
        if (arg0 <= -47) {
            field730 = null;
            field736 = null;
            field727 = null;
            field726 = null;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IBIIII)V")
    public static final void method337(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        field734++;
        long var6 = class113.method798(arg2, arg5, arg4);
        if (var6 != 0L) {
            int var8 = ((int) var6 & 0x3B58FA) >> 20;
            int var9 = ((int) var6 & 0x7C559) >> 14;
            int var10 = Integer.MAX_VALUE & (int) (var6 >>> 32);
            class130 var11 = class32.method277((byte) -70, var10);
            if (var11.field2294 == -1) {
                int var14 = arg3;
                int var15 = 24624 - (-(arg5 * 4) - (52736 - arg4 * 512) * 4);
                int[] var16 = class151.field2616;
                if (var6 > 0L) {
                    var14 = arg0;
                }
                if (var9 == 0 || var9 == 2) {
                    if (var8 == 0) {
                        var16[var15] = var14;
                        var16[var15 + 512] = var14;
                        var16[var15 + 1024] = var14;
                        var16[var15 + 1536] = var14;
                    } else if (var8 == 1) {
                        var16[var15] = var14;
                        var16[var15 + 1] = var14;
                        var16[var15 + 2] = var14;
                        var16[var15 + 3] = var14;
                    } else if (var8 == 2) {
                        var16[var15 + 3] = var14;
                        var16[var15 + 515] = var14;
                        var16[var15 + 3 + 1024] = var14;
                        var16[var15 + 3 + 1536] = var14;
                    } else if (var8 == 3) {
                        var16[var15 + 1536] = var14;
                        var16[var15 + 1536 + 1] = var14;
                        var16[var15 + 1536 + 2] = var14;
                        var16[var15 + 1536 + 3] = var14;
                    }
                }
                if (var9 == 3) {
                    if (var8 == 0) {
                        var16[var15] = var14;
                    } else if (var8 == 1) {
                        var16[var15 + 3] = var14;
                    } else if (var8 == 2) {
                        var16[var15 + 1536 + 3] = var14;
                    } else if (var8 == 3) {
                        var16[var15 + 1536] = var14;
                    }
                }
                if (var9 == 2) {
                    if (var8 == 3) {
                        var16[var15] = var14;
                        var16[var15 + 512] = var14;
                        var16[var15 + 1024] = var14;
                        var16[var15 + 1536] = var14;
                    } else if (var8 == 0) {
                        var16[var15] = var14;
                        var16[var15 + 1] = var14;
                        var16[var15 + 2] = var14;
                        var16[var15 + 3] = var14;
                    } else if (var8 == 1) {
                        var16[var15 + 3] = var14;
                        var16[var15 + 515] = var14;
                        var16[var15 + 3 + 1024] = var14;
                        var16[var15 + 1539] = var14;
                    } else if (var8 == 2) {
                        var16[var15 + 1536] = var14;
                        var16[var15 + 1 + 1536] = var14;
                        var16[var15 + 1536 + 2] = var14;
                        var16[var15 + 1536 + 3] = var14;
                    }
                }
            } else {
                class5 var12 = null;
                int var13 = var11.field2265;
                if (!var11.field2257) {
                    var12 = class276.field4781[var11.field2294];
                } else if (var8 == 0) {
                    var12 = class276.field4781[var11.field2294];
                } else if (var8 == 1) {
                    var13 = var11.field2277;
                    var12 = class203.field3525[var11.field2294];
                } else if (var8 == 2) {
                    var12 = class191.field3346[var11.field2294];
                } else if (var8 == 3) {
                    var12 = class199.field3487[var11.field2294];
                    var13 = var11.field2277;
                }
                if (var12 != null) {
                    var12.method62(arg5 * 4 + 48, (104 - arg4 + -var13) * 4 + 48);
                }
            }
        }
        long var17 = class155.method1108(arg2, arg5, arg4);
        if (arg1 <= 53) {
            method336((byte) 121);
        }
        if (var17 != 0L) {
            int var19 = ((int) var17 & 0x3FE1A5) >> 20;
            int var20 = (int) var17 >> 14 & 0x1F;
            int var21 = (int) (var17 >>> 32) & Integer.MAX_VALUE;
            class130 var22 = class32.method277((byte) -93, var21);
            if (var22.field2294 != -1) {
                class5 var26 = null;
                int var27 = var22.field2265;
                if (!var22.field2257) {
                    var26 = class276.field4781[var22.field2294];
                } else if (var19 == 0) {
                    var26 = class276.field4781[var22.field2294];
                } else if (var19 == 1) {
                    var27 = var22.field2277;
                    var26 = class203.field3525[var22.field2294];
                } else if (var19 == 2) {
                    var26 = class191.field3346[var22.field2294];
                } else if (var19 == 3) {
                    var27 = var22.field2277;
                    var26 = class199.field3487[var22.field2294];
                }
                if (var26 != null) {
                    var26.method62(arg5 * 4 + 48, (-arg4 + 104 - var27) * 4 + 48);
                }
            } else if (var20 == 9) {
                int var23 = 15658734;
                if (var17 > 0L) {
                    var23 = 15597568;
                }
                int var24 = (arg5 * 4) + ((-arg4 + 103) * 512 * 4) + 24624;
                int[] var25 = class151.field2616;
                if (var19 == 0 || var19 == 2) {
                    var25[var24 + 1536] = var23;
                    var25[var24 + 1025] = var23;
                    var25[var24 + 512 + 2] = var23;
                    var25[var24 + 3] = var23;
                } else {
                    var25[var24] = var23;
                    var25[var24 + 512 + 1] = var23;
                    var25[var24 + 1026] = var23;
                    var25[var24 + 1539] = var23;
                }
            }
        }
        long var28 = class27.method242(arg2, arg5, arg4);
        if (var28 == 0L) {
            return;
        }
        int var30 = (int) var28 >> 20 & 0x3;
        int var31 = (int) (var28 >>> 32) & Integer.MAX_VALUE;
        class130 var32 = class32.method277((byte) -69, var31);
        if (var32.field2294 == -1) {
            return;
        }
        class5 var33 = null;
        int var34 = var32.field2265;
        if (!var32.field2257) {
            var33 = class276.field4781[var32.field2294];
        } else if (var30 == 0) {
            var33 = class276.field4781[var32.field2294];
        } else if (var30 == 1) {
            var34 = var32.field2277;
            var33 = class203.field3525[var32.field2294];
        } else if (var30 == 2) {
            var33 = class191.field3346[var32.field2294];
        } else if (var30 == 3) {
            var33 = class199.field3487[var32.field2294];
            var34 = var32.field2277;
        }
        if (var33 != null) {
            var33.method62(arg5 * 4 + 48, 48 - -((104 - var34 + -arg4) * 4));
            return;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ZB)V")
    public static final void method338(boolean arg0, byte arg1) {
        field737++;
        if (arg1 >= 98) {
            method332(class103.field1724, arg0, class190.field3328, (byte) 81, class246.field4315);
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Loc;B)I")
    public static final int method339(class61 arg0, byte arg1) {
        field729++;
        class255 var2 = arg0.field987;
        if (arg1 != 112) {
            method334((class169) null, 26, -97, 50, 102, -52, -10, 97, false);
        }
        if (var2.field4516 != null) {
            var2 = var2.method1717(false);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field4464;
        if (arg0.field4834 == arg0.field4803) {
            var3 = var2.field4519;
        } else if (arg0.field4803 == arg0.field4794) {
            var3 = var2.field4491;
        }
        return var3;
    }
}
