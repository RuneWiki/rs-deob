import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public abstract class class44 extends class116 {

    @OriginalMember(owner = "client!ui", name = "P", descriptor = "Z")
    public volatile boolean field748 = true;

    @OriginalMember(owner = "client!ui", name = "L", descriptor = "Lne;")
    public static class137 field744 = new class137(20);

    @OriginalMember(owner = "client!ui", name = "N", descriptor = "I")
    public static int field746 = 0;

    @OriginalMember(owner = "client!ui", name = "R", descriptor = "I")
    public static int field750 = -1;

    @OriginalMember(owner = "client!ui", name = "S", descriptor = "[[B")
    public static byte[][] field751 = new byte[1000][];

    @OriginalMember(owner = "client!ui", name = "O", descriptor = "Lda;")
    public static class275 field747 = class255.method1672(103, "(U1");

    @OriginalMember(owner = "client!ui", name = "J", descriptor = "I")
    public static int field742;

    @OriginalMember(owner = "client!ui", name = "M", descriptor = "I")
    public static int field745;

    @OriginalMember(owner = "client!ui", name = "Q", descriptor = "Lwb;")
    public static class179 field749;

    @OriginalMember(owner = "client!ui", name = "A", descriptor = "Z")
    public boolean field741;

    @OriginalMember(owner = "client!ui", name = "K", descriptor = "Z")
    public boolean field743;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Z)I")
    public abstract int method260(boolean arg0);

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(B)V")
    public static void method261(byte arg0) {
        field744 = null;
        field747 = null;
        field751 = null;
        if (arg0 != 23) {
            field749 = null;
        }
        field749 = null;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIIIZ)V")
    public static final void method262(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class247.field4359 = arg1;
        class172.field2997 = arg2;
        class275.field4759 = arg3;
        class185.field3173 = new class3[arg0][class247.field4359][class172.field2997];
        class273.field4725 = new int[arg0][class247.field4359 + 1][class172.field2997 + 1];
        if (arg4) {
            class235.field4094 = new class3[1][class247.field4359][class172.field2997];
            class13.field202 = new int[class247.field4359][class172.field2997];
            class187.field3181 = new int[1][class247.field4359 + 1][class172.field2997 + 1];
        } else {
            class235.field4094 = null;
            class13.field202 = null;
            class187.field3181 = null;
        }
        class215.method1381(false);
        class158.field2776 = new class151[500];
        class107.field1859 = 0;
        class1.field7 = new class151[500];
        class193.field3316 = 0;
        class1.field4 = new int[arg0][class247.field4359 + 1][class172.field2997 + 1];
        class229.field3958 = new class37[5000];
        class235.field4104 = 0;
        class5.field70 = new class37[100];
        class149.field2594 = new boolean[class275.field4759 + class275.field4759 + 1][class275.field4759 + class275.field4759 + 1];
        class268.field4649 = new boolean[class275.field4759 + class275.field4759 + 2][class275.field4759 + class275.field4759 + 2];
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IZIIIIIIIII)V")
    public static final void method263(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field742++;
        int var11 = arg9 - arg7;
        if (class5.field67 > arg9) {
            var11++;
        }
        int var12 = arg5 - arg3;
        if (arg5 < class255.field4497) {
            var12++;
        }
        if (!arg1) {
            return;
        }
        int var10000;
        for (int var13 = 0; var13 < var12; var13++) {
            int var44 = arg2 + (arg4 * var13) >> 16;
            int var45 = (var13 + 1) * arg4 + arg2 >> 16;
            int var46 = var45 - var44;
            if (var46 > 0) {
                int var47 = arg3 + var13 >> 6;
                if (var47 >= 0 && var47 <= (class262.field4556.length - 1)) {
                    int var48 = arg6 + var44;
                    int[][] var49 = class262.field4556[var47];
                    int var50 = arg6 + var45;
                    byte[][] var51 = class123.field2207[var47];
                    byte[][] var52 = class144.field2526[var47];
                    byte[][] var53 = class83.field1341[var47];
                    byte[][] var54 = class157.field2768[var47];
                    byte[][] var55 = class57.field964[var47];
                    for (int var56 = 0; var56 < var11; var56++) {
                        int var57 = arg0 * var56 + arg10 >> 16;
                        int var58 = (var56 + 1) * arg0 + arg10 >> 16;
                        int var59 = var58 - var57;
                        if (var59 > 0) {
                            int var60 = arg8 + var57;
                            int var61 = arg8 + var58;
                            int var62 = arg7 + var56 >> 6;
                            int var63 = arg7 + var56 & 0x3F;
                            int var64 = arg3 + var13 & 0x3F;
                            int var65 = (var63 << 6) + var64;
                            int var66;
                            if (var62 < 0 || var62 > (var49.length - 1) || var49[var62] == null) {
                                if (class233.field4075.field3805 != -1) {
                                    var66 = class233.field4075.field3805;
                                } else if ((var13 + arg3 & 0x4) == (arg7 + var56 & 0x4)) {
                                    var66 = class114.field2027[class252.field4479 + 1];
                                } else {
                                    var66 = 4936552;
                                }
                                if (var62 < 0 || (var49.length - 1) < var62) {
                                    if (var66 == 0) {
                                        var66 = 1;
                                    }
                                    class47.method299(var48, var60, var46, var59, var66);
                                    continue;
                                }
                            } else {
                                var66 = var49[var62][var65];
                            }
                            int var67 = var51[var62] == null ? 0 : class114.field2027[var51[var62][var65] & 0xFF];
                            int var68 = var53[var62] == null ? 0 : class114.field2027[var53[var62][var65] & 0xFF];
                            if (var66 == 0) {
                                var66 = 1;
                            }
                            if (var67 == 0 && var68 == 0) {
                                class47.method299(var48, var60, var46, var59, var66);
                            } else {
                                if (var67 != 0) {
                                    if (var67 == -1) {
                                        var67 = 1;
                                    }
                                    byte var69 = var52[var62] == null ? 0 : var52[var62][var65];
                                    int var70 = var69 & 0xFC;
                                    if (var70 == 0 || var46 <= 1 || var59 <= 1) {
                                        class47.method299(var48, var60, var46, var59, var67);
                                    } else {
                                        class69.method455(var69 & 0x3, class47.field786, true, var46, var60, var48, var67, var70 >> 2, var59, -22045, var66);
                                    }
                                }
                                if (var68 != 0) {
                                    if (var68 == -1) {
                                        var68 = var66;
                                    }
                                    byte var71 = var54[var62][var65];
                                    int var72 = var71 & 0xFC;
                                    if (var72 == 0 || var46 <= 1 || var59 <= 1) {
                                        class47.method299(var48, var60, var46, var59, var68);
                                    }
                                    class69.method455(var71 & 0x3, class47.field786, var67 == 0, var46, var60, var48, var68, var72 >> 2, var59, -22045, 0);
                                }
                            }
                            if (var55[var62] != null) {
                                int var73 = var55[var62][var65] & 0xFF;
                                if (var73 != 0) {
                                    int var74;
                                    if (var46 == 1) {
                                        var74 = var48;
                                    } else {
                                        var74 = var50 - 1;
                                    }
                                    int var75 = 13421772;
                                    if (var73 >= 5 && var73 <= 8 || var73 >= 13 && var73 <= 16 || var73 >= 21 && var73 <= 24 || var73 == 27 || var73 == 28) {
                                        var73 -= 4;
                                        var75 = 13369344;
                                    }
                                    int var76;
                                    if (var59 == 1) {
                                        var76 = var60;
                                    } else {
                                        var76 = var61 - 1;
                                    }
                                    if (var73 == 1) {
                                        class47.method304(var48, var60, var59, var75);
                                    } else if (var73 == 2) {
                                        class47.method294(var48, var60, var46, var75);
                                    } else if (var73 == 3) {
                                        class47.method304(var74, var60, var59, var75);
                                    } else if (var73 == 4) {
                                        class47.method294(var48, var76, var46, var75);
                                    } else if (var73 == 9) {
                                        class47.method304(var48, var60, var59, 16777215);
                                        class47.method294(var48, var60, var46, var75);
                                    } else if (var73 == 10) {
                                        class47.method304(var74, var60, var59, 16777215);
                                        class47.method294(var48, var60, var46, var75);
                                    } else if (var73 == 11) {
                                        class47.method304(var74, var60, var59, 16777215);
                                        class47.method294(var48, var76, var46, var75);
                                    } else if (var73 == 12) {
                                        class47.method304(var48, var60, var59, 16777215);
                                        class47.method294(var48, var76, var46, var75);
                                    } else if (var73 == 17) {
                                        class47.method294(var48, var60, 1, var75);
                                    } else if (var73 == 18) {
                                        class47.method294(var74, var60, 1, var75);
                                    } else if (var73 == 19) {
                                        class47.method294(var74, var76, 1, var75);
                                    } else if (var73 == 20) {
                                        class47.method294(var48, var76, 1, var75);
                                    } else if (var73 == 25) {
                                        for (int var77 = 0; var77 < var59; var77++) {
                                            class47.method294(var48 + var77, var76 - var77, 1, var75);
                                        }
                                    } else if (var73 == 26) {
                                        for (int var78 = 0; var78 < var59; var78++) {
                                            class47.method294(var48 + var78, var60 - -var78, 1, var75);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    var10000 = arg6 + var45;
                    int var80 = arg6 + var44;
                    for (int var81 = 0; var81 < var11; var81++) {
                        int var82 = ((var81 + 1) * arg0 + arg10 >> 16) + arg8;
                        int var83;
                        if (class233.field4075.field3805 != -1) {
                            var83 = class233.field4075.field3805;
                        } else if ((var13 + arg3 & 0x4) == (arg7 + var81 & 0x4)) {
                            var83 = class114.field2027[class252.field4479 + 1];
                        } else {
                            var83 = 4936552;
                        }
                        int var84 = (arg0 * var81 + arg10 >> 16) + arg8;
                        if (var83 == 0) {
                            var83 = 1;
                        }
                        int var85 = var82 - var84;
                        class47.method299(var80, var84, var46, var85, var83);
                    }
                }
            }
        }
        for (int var14 = -2; var14 < (var12 + 2); var14++) {
            int var15 = arg4 * var14 + arg2 >> 16;
            int var16 = (var14 + 1) * arg4 + arg2 >> 16;
            int var17 = var16 - var15;
            if (var17 > 0) {
                int var18 = arg6 + var15;
                var10000 = arg6 + var16;
                int var20 = arg3 + var14 >> 6;
                if (var20 >= 0 && (class107.field1855.length - 1) >= var20) {
                    short[][] var21 = class107.field1855[var20];
                    for (int var22 = -2; var22 < var11 + 2; var22++) {
                        int var23 = arg0 * var22 + arg10 >> 16;
                        int var24 = (var22 + 1) * arg0 + arg10 >> 16;
                        int var25 = var24 - var23;
                        if (var25 > 0) {
                            int var26 = var22 + arg7 >> 6;
                            int var27 = arg8 + var23;
                            var10000 = arg8 + var24;
                            if (var26 >= 0 && var26 <= var21.length - 1) {
                                int var29 = (var22 + arg7 & 0x3F << 6) + (arg3 + var14 & 0x3F);
                                if (var21[var26] != null) {
                                    int var30 = (var21[var26][var29] & 0xEB28) >> 14;
                                    int var31 = var21[var26][var29] & 0x3FFF;
                                    if (var31 != 0) {
                                        if (var30 == 0) {
                                            int var41 = class262.field4554[var31 - 1].field201 * var25 / 4;
                                            int var42 = class262.field4554[var31 - 1].field194 * var17 / 4;
                                            int var43 = class262.field4554[var31 - 1].field209 * var25 / 4;
                                            class262.field4554[var31 - 1].method101(var18, var27 - var43, var42, var41);
                                        } else if (var30 == 1) {
                                            int var32 = class94.field1605[var31 - 1].field201 * var25 / 4;
                                            int var33 = class94.field1605[var31 - 1].field194 * var17 / 4;
                                            int var34 = class94.field1605[var31 - 1].field209 * var25 / 4;
                                            class94.field1605[var31 - 1].method101(var18, var27 - var34, var33, var32);
                                        } else if (var30 == 2) {
                                            int var38 = class228.field3855[var31 - 1].field201 * var25 / 4;
                                            int var39 = class228.field3855[var31 - 1].field194 * var17 / 4;
                                            int var40 = class228.field3855[var31 - 1].field209 * var25 / 4;
                                            class228.field3855[var31 - 1].method101(var18, var27 - var40, var39, var38);
                                        } else if (var30 == 3) {
                                            int var35 = class77.field1259[var31 - 1].field194 * var17 / 4;
                                            int var36 = class77.field1259[var31 - 1].field201 * var25 / 4;
                                            int var37 = class77.field1259[var31 - 1].field209 * var25 / 4;
                                            class77.field1259[var31 - 1].method101(var18, var27 - var37, var35, var36);
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

    @OriginalMember(owner = "client!ui", name = "g", descriptor = "(I)[B")
    public abstract byte[] method264(int arg0);

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIIIIIIIIII)V")
    public static final void method265(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field745++;
        int var11 = arg0 - arg1;
        int var12 = arg10 - arg8;
        boolean var13;
        if (class29.field446 > 0 && class29.field446 % 10 < 5) {
            var13 = true;
        } else {
            var13 = false;
        }
        int var14 = -71 % ((-arg5 - 11) / 45);
        int var15 = 983040 / arg3;
        int var16 = 983040 / arg4;
        for (int var17 = -var15; var17 < var11 + var15; var17++) {
            int var19 = arg3 * var17 + arg9 >> 16;
            int var20 = (var17 + 1) * arg3 + arg9 >> 16;
            int var21 = var20 - var19;
            if (var21 > 0) {
                int var10000 = arg2 + var20;
                int var23 = arg1 + var17 >> 6;
                int var24 = arg2 + var19;
                if (var23 >= 0 && var23 <= class51.field839.length - 1) {
                    int[][] var25 = class51.field839[var23];
                    for (int var26 = -var16; var26 < (var12 + var16); var26++) {
                        int var27 = (var26 + 1) * arg4 + arg7 >> 16;
                        int var28 = arg4 * var26 + arg7 >> 16;
                        int var29 = var27 - var28;
                        if (var29 > 0) {
                            int var30 = arg6 + var28;
                            var10000 = arg6 + var27;
                            int var32 = arg8 + var26 >> 6;
                            if (var32 >= 0 && (var25.length - 1) >= var32 && var25[var32] != null) {
                                int var33 = ((var26 + arg8 & 0x3F) << 6) + (arg1 + var17 & 0x3F);
                                int var34 = var25[var32][var33];
                                if (var34 != 0) {
                                    class34 var35 = class146.method1040(-89, var34 - 1);
                                    if (var13 && class32.field484 == var35.field509) {
                                        class143 var36 = new class143();
                                        var36.field2508 = var24;
                                        var36.field2513 = var35.field509;
                                        var36.field2505 = var30;
                                        class162.field2828.method547(104, var36);
                                    }
                                    class209.field3537[var35.field509].method728(var24 - 7, var30 + -7);
                                }
                            }
                        }
                    }
                }
            }
        }
        for (class143 var18 = (class143) class162.field2828.method550(-78); var18 != null; var18 = (class143) class162.field2828.method545(104)) {
            class209.field3537[var18.field2513].method728(var18.field2508 - 7, var18.field2505 + -7);
            class47.method301(var18.field2508, var18.field2505, 15, 16776960, 128);
            class47.method301(var18.field2508, var18.field2505, 7, 16777215, 256);
        }
        class162.field2828.method549((byte) -71);
    }
}
