import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class56 {

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "I")
    public int field675 = 0;

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "I")
    public int field674 = 0;

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "I")
    public int field672 = 2048;

    @OriginalMember(owner = "client!ra", name = "l", descriptor = "I")
    public int field681 = 2048;

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "I")
    public static int field676 = 0;

    @OriginalMember(owner = "client!ra", name = "k", descriptor = "[Ljava/lang/String;")
    public static String[] field680 = new String[100];

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "I")
    public static int field670;

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "I")
    public static int field671;

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "I")
    public static int field673;

    @OriginalMember(owner = "client!ra", name = "h", descriptor = "I")
    public static int field677;

    @OriginalMember(owner = "client!ra", name = "j", descriptor = "I")
    public static int field679;

    @OriginalMember(owner = "client!ra", name = "i", descriptor = "[I")
    public static int[] field678;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IZIIII)V", line = 4)
    public static final void method321(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        field677++;
        long var6 = (long) ((arg1 ? Integer.MIN_VALUE : 0) | arg0);
        class411 var8 = (class411) class324.field4614.method1888(var6, (byte) -30);
        if (var8 == null) {
            var8 = new class411();
            class324.field4614.method1886(var8, var6, 1);
        }
        if (arg5 >= var8.field5904.length) {
            int[] var9 = new int[arg5 + 1];
            int[] var10 = new int[arg5 + 1];
            for (int var11 = 0; var11 < var8.field5904.length; var11++) {
                var9[var11] = var8.field5904[var11];
                var10[var11] = var8.field5902[var11];
            }
            for (int var12 = var8.field5904.length; var12 < arg5; var12++) {
                var9[var12] = -1;
                var10[var12] = 0;
            }
            var8.field5902 = var10;
            var8.field5904 = var9;
        }
        var8.field5904[arg5] = arg2;
        var8.field5902[arg5] = arg3;
        if (arg4 < 121) {
            field680 = null;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIILdg;)V", line = 58)
    private final void method322(int arg0, int arg1, int arg2, class236 arg3) {
        if (arg2 == 1) {
            this.field674 = arg3.method1574(-79);
        } else if (arg2 == 2) {
            this.field672 = arg3.method1617((byte) 48);
        } else if (arg2 == 3) {
            this.field681 = arg3.method1617((byte) 48);
        } else if (arg2 == 4) {
            this.field675 = arg3.method1613(79);
        }
        field679++;
        if (arg1 != 28114) {
            method321(-103, true, -4, -126, -89, -118);
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ZIIIB[Lp;IIIILae;[B)[I", line = 93)
    public static final int[] method323(boolean arg0, int arg1, int arg2, int arg3, byte arg4, class119[] arg5, int arg6, int arg7, int arg8, int arg9, class134 arg10, byte[] arg11) {
        field670++;
        int var12 = (arg2 & 0x7) * 8;
        int var13 = (arg3 & 0x7) * 8;
        byte var14;
        if (arg0) {
            var14 = 1;
        } else {
            var14 = 4;
        }
        if (!arg0) {
            class119 var15 = arg5[arg6];
            for (int var16 = 0; var16 < 8; var16++) {
                for (int var17 = 0; var17 < 8; var17++) {
                    int var18 = arg7 + class450.method2787(var16 & 0x7, var17 & 0x7, 0, arg1);
                    int var19 = arg8 + class298.method1970(false, var16 & 0x7, var17 & 0x7, arg1);
                    if (var18 > 0 && var18 < class176.field2403 - 1 && var19 > 0 && var19 < (class383.field5395 - 1)) {
                        var15.method737(var18, var19, -2097153);
                    }
                }
            }
        }
        class236 var20 = new class236(arg11);
        int var21 = arg2 & 0x1FFFFFF8 << 3;
        int var22 = (arg3 & 0xFFFFFFF8) << 3;
        byte var23 = 0;
        byte var24 = 0;
        if (arg1 == 1) {
            var24 = 1;
        } else if (arg1 == 2) {
            var24 = 1;
            var23 = 1;
        } else if (arg1 == 3) {
            var23 = 1;
        }
        int var25 = 53 % ((-arg4 - 86) / 34);
        for (int var26 = 0; var26 < var14; var26++) {
            for (int var59 = 0; var59 < 64; var59++) {
                for (int var60 = 0; var60 < 64; var60++) {
                    if (arg9 != var26 || var59 < var12 || var59 > var12 + 8 || var13 > var60 || var13 + 8 < var60) {
                        class94.method521(0, 0, arg0, -1, -124, 0, 0, 0, false, 0, -1, var20);
                    } else if ((var12 + 8) == var59 || var13 + 8 == var60) {
                        int var67;
                        int var68;
                        if (arg1 == 0) {
                            var67 = var60 + arg8 - var13;
                            var68 = arg7 + var59 - var12;
                        } else if (arg1 == 1) {
                            var67 = arg8 + var12 + 8 - var59;
                            var68 = var60 - (var13 - arg7);
                        } else if (arg1 == 2) {
                            var67 = arg8 + var13 + 8 - var60;
                            var68 = var12 + arg7 + 8 - var59;
                        } else {
                            var67 = arg8 + var59 - var12;
                            var68 = arg7 + var13 + 8 - var60;
                        }
                        class94.method521(var22 + var60, 0, arg0, var68, -105, 0, 0, var21 + var59, true, arg6, var67, var20);
                    } else {
                        int var61 = class450.method2787(var59 & 0x7, var60 & 0x7, 0, arg1) + arg7;
                        int var62 = class298.method1970(false, var59 & 0x7, var60 & 0x7, arg1) + arg8;
                        class94.method521(var22 + var60, var23, arg0, var61, -115, arg1, var24, var21 + var59, false, arg6, var62, var20);
                        if (var59 == 63 || var60 == 63) {
                            int var63 = var59 == 63 ? 64 : var59;
                            int var64 = var60 == 63 ? 64 : var60;
                            int var65;
                            int var66;
                            if (arg1 == 0) {
                                var65 = arg7 + var63 - var12;
                                var66 = var64 + arg8 - var13;
                            } else if (arg1 == 1) {
                                var65 = var64 + arg7 - var13;
                                var66 = arg8 + var12 + 8 - var63;
                            } else if (arg1 == 2) {
                                var65 = arg7 + 8 - (var63 - var12);
                                var66 = arg8 + var13 + 8 - var64;
                            } else {
                                var65 = arg7 + var13 + 8 - var64;
                                var66 = var63 + arg8 - var12;
                            }
                            if (var65 >= 0 && class176.field2403 > var65 && var66 >= 0 && class383.field5395 > var66) {
                                class419.field5994[arg6][var65][var66] = class419.field5994[arg6][var23 + var61][var62 + var24];
                            }
                        }
                    }
                }
            }
        }
        boolean var27 = false;
        boolean var28 = false;
        while (var20.field3320 < var20.field3364.length) {
            int var29 = var20.method1574(-50);
            if (var29 == 128) {
                class189.field2723[0] = var20.method1617((byte) 48);
                class189.field2723[1] = var20.method1613(125);
                class189.field2723[2] = var20.method1613(96);
                class189.field2723[3] = var20.method1613(109);
                var27 = true;
                class189.field2723[4] = var20.method1617((byte) 48);
            } else {
                if (var29 != 129) {
                    var20.field3320--;
                    break;
                }
                if (class327.field4639 == null) {
                    class327.field4639 = new byte[4][][];
                }
                for (int var46 = 0; var46 < 4; var46++) {
                    byte var47 = var20.method1589(false);
                    if (var47 == 0 && class327.field4639[arg6] != null) {
                        if (arg9 >= var46) {
                            int var48 = arg7;
                            int var49 = arg7 + 7;
                            int var50 = arg8;
                            int var51 = arg8 + 7;
                            if (arg8 < 0) {
                                var50 = 0;
                            } else if (arg8 >= class383.field5395) {
                                var50 = class383.field5395;
                            }
                            if (var49 < 0) {
                                var49 = 0;
                            } else if (class176.field2403 <= var49) {
                                var49 = class176.field2403;
                            }
                            if (arg7 < 0) {
                                var48 = 0;
                            } else if (class176.field2403 <= arg7) {
                                var48 = class176.field2403;
                            }
                            if (var51 < 0) {
                                var51 = 0;
                            } else if (class383.field5395 <= var51) {
                                var51 = class383.field5395;
                            }
                            while (var48 < var49) {
                                while (var51 > var50) {
                                    class327.field4639[arg6][var48][var50] = 0;
                                    var50++;
                                }
                                var48++;
                            }
                        }
                    } else if (var47 == 1) {
                        if (class327.field4639[arg6] == null) {
                            class327.field4639[arg6] = new byte[class176.field2403 + 1][class383.field5395 + 1];
                        }
                        for (int var52 = 0; var52 < 64; var52 += 4) {
                            for (int var53 = 0; var53 < 64; var53 += 4) {
                                byte var54 = var20.method1589(false);
                                if (arg9 >= var46) {
                                    for (int var55 = var52; var55 < (var52 + 4); var55++) {
                                        for (int var56 = var53; var56 < var53 + 4; var56++) {
                                            if (var55 >= var12 && var55 < var12 + 8 && var13 <= var56 && var13 < (var13 + 8)) {
                                                int var57 = class450.method2787(var55 & 0x7, var56 & 0x7, 0, arg1) + arg7;
                                                int var58 = class298.method1970(false, var55 & 0x7, var56 & 0x7, arg1) + arg8;
                                                if (var57 >= 0 && class176.field2403 > var57 && var58 >= 0 && var58 < class383.field5395) {
                                                    class327.field4639[arg6][var57][var58] = var54;
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
        if (!arg0) {
            class180 var30 = null;
            label283: while (true) {
                while (true) {
                    while (var20.field3320 < var20.field3364.length) {
                        int var31 = var20.method1574(-128);
                        if (var31 == 0) {
                            var30 = new class180(var20);
                        } else if (var31 == 1) {
                            int var32 = var20.method1574(-125);
                            if (var32 > 0) {
                                for (int var33 = 0; var33 < var32; var33++) {
                                    class12 var34 = new class12(var20);
                                    if (var34.field164 == 31) {
                                        class56 var35 = class396.method2528(-3400, var20.method1617((byte) 48));
                                        var34.method85((byte) 120, var35.field672, var35.field674, var35.field675, var35.field681);
                                    }
                                    int var36 = var34.field5682 >> 7;
                                    int var37 = var34.field5687 >> 7;
                                    if (var34.field167 == arg9 && var36 >= var12 && var12 + 8 > var36 && var13 <= var37 && var37 < var13 + 8) {
                                        int var38 = class355.method2265(var34.field5682 & 0x3FF, arg1, 107, var34.field5687 & 0x3FF) + (arg7 << 7);
                                        int var39 = (arg8 << 7) + class235.method1553(var34.field5682 & 0x3FF, (byte) -84, arg1, var34.field5687 & 0x3FF);
                                        var34.field5682 = var38;
                                        var34.field5687 = var39;
                                        int var40 = var34.field5682 >> 7;
                                        int var41 = var34.field5687 >> 7;
                                        if (var40 >= 0 && var41 >= 0 && class176.field2403 > var40 && var41 < class383.field5395) {
                                            var34.field5680 = class419.field5994[arg9][var40][var41] - var34.field5680;
                                            if (arg10.method602() > 0) {
                                                class303.method2003(var34);
                                            }
                                        }
                                    }
                                }
                            }
                        } else if (var31 == 2) {
                            if (var30 == null) {
                                var30 = new class180();
                            }
                            var30.method1213(var20, 128);
                        } else {
                            throw new IllegalStateException();
                        }
                    }
                    if (var30 != null) {
                        class232.method1537(arg7 >> 3, (byte) -111, arg8 >> 3, var30);
                    }
                    break label283;
                }
            }
        }
        if (!var28 && class327.field4639 != null && class327.field4639[arg6] != null) {
            int var42 = arg7 + 7;
            int var43 = arg8 + 7;
            for (int var44 = arg7; var44 < var42; var44++) {
                for (int var45 = arg8; var45 < var43; var45++) {
                    class327.field4639[arg6][var44][var45] = 0;
                }
            }
        }
        if (var27) {
            return class189.field2723;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Z)V", line = 561)
    public static final void method324(boolean arg0) {
        class17.method112(28450, false);
        if (!arg0) {
            field678 = null;
        }
        field673++;
        if (class176.field2400 >= 0 && class176.field2400 != 0) {
            class377.method2441(class176.field2400, (byte) -117);
            class176.field2400 = -1;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(B)V", line = 583)
    public static void method325(byte arg0) {
        field678 = null;
        if (arg0 > -105) {
            field678 = null;
        }
        field680 = null;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Ldg;II)V", line = 602)
    public final void method326(class236 arg0, int arg1, int arg2) {
        int var4 = 97 % ((-arg1 - 46) / 36);
        field671++;
        while (true) {
            int var5 = arg0.method1574(-45);
            if (var5 == 0) {
                return;
            }
            this.method322(arg2, 28114, var5, arg0);
        }
    }
}
