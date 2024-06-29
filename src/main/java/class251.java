import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class251 {

    @OriginalMember(owner = "client!qf", name = "l", descriptor = "Ljava/lang/String;")
    public static String field3845 = "wave:";

    @OriginalMember(owner = "client!qf", name = "k", descriptor = "I")
    public static int field3844 = 0;

    @OriginalMember(owner = "client!qf", name = "m", descriptor = "[[B")
    public static byte[][] field3846 = new byte[50][];

    @OriginalMember(owner = "client!qf", name = "n", descriptor = "Z")
    public static boolean field3847 = true;

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "I")
    public static int field3835;

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "I")
    public static int field3837;

    @OriginalMember(owner = "client!qf", name = "i", descriptor = "I")
    public static int field3842;

    @OriginalMember(owner = "client!qf", name = "j", descriptor = "I")
    public static int field3843;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "S")
    public short field3834;

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "Z")
    public boolean field3838;

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "Z")
    public boolean field3840;

    @OriginalMember(owner = "client!qf", name = "h", descriptor = "Z")
    public boolean field3841;

    @OriginalMember(owner = "client!qf", name = "o", descriptor = "Z")
    public boolean field3848;

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "[I")
    public static int[] field3839;

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "[[[B")
    public static byte[][][] field3836;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIILsa;JZ)V")
    public static final void method1679(int arg0, int arg1, int arg2, int arg3, class268 arg4, long arg5, boolean arg6) {
        if (arg4 == null) {
            return;
        }
        class23 var8 = new class23();
        var8.field328 = arg4;
        var8.field325 = arg1 * 128 + 64;
        var8.field326 = arg2 * 128 + 64;
        var8.field323 = arg3;
        var8.field322 = arg5;
        if (class194.field2682[arg0][arg1][arg2] == null) {
            class194.field2682[arg0][arg1][arg2] = new class89(arg0, arg1, arg2);
        }
        class194.field2682[arg0][arg1][arg2].field1237 = var8;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method1680(String arg0, int arg1) {
        field3837++;
        if (arg1 <= 6) {
            field3836 = null;
        }
        class218.field3287 = arg0;
        if (class200.field2784.field3715 == null) {
            return;
        }
        try {
            String var2 = class200.field2784.field3715.getParameter("cookieprefix");
            String var3 = class200.field2784.field3715.getParameter("cookiehost");
            String var4 = var2 + "settings=" + arg0 + "; version=1; path=/; domain=" + var3;
            String var5;
            if (arg0.length() == 0) {
                var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var5 = var4 + "; Expires=" + class79.method506(23174, class223.method1433((byte) -96) + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            class259.method1723(class200.field2784.field3715, "document.cookie=\"" + var5 + "\"", 22730);
        } catch (Throwable var6) {
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIII[Ljb;IZ[BII)[I")
    public static final int[] method1681(int arg0, int arg1, int arg2, int arg3, int arg4, class276[] arg5, int arg6, boolean arg7, byte[] arg8, int arg9, int arg10) {
        field3842++;
        int var11 = (arg0 & 0x7) * 8;
        byte var12;
        if (arg7) {
            var12 = 1;
        } else {
            var12 = 4;
        }
        if (!arg7) {
            for (int var13 = 0; var13 < 8; var13++) {
                for (int var14 = 0; var14 < 8; var14++) {
                    int var15 = arg4 + class242.method1625(arg1, true, var14 & 0x7, var13 & 0x7);
                    int var16 = arg2 + class74.method472((byte) 98, arg1, var13 & 0x7, var14 & 0x7);
                    if (var15 > 0 && var15 < 103 && var16 > 0 && var16 < 103) {
                        arg5[arg3].field4272[var15][var16] = class235.method1572(arg5[arg3].field4272[var15][var16], -2097153);
                    }
                }
            }
        }
        int var17 = (arg10 & 0x7) * 8;
        int var18 = arg0 & 0x1FFFFFF8 << 3;
        class224 var19 = new class224(arg8);
        int var20 = (arg10 & 0xFFFFFFF8) << 3;
        for (int var21 = 0; var21 < var12; var21++) {
            for (int var42 = 0; var42 < 64; var42++) {
                for (int var43 = 0; var43 < 64; var43++) {
                    if (arg9 != var21 || var11 > var42 || var42 > var11 + 8 || var43 < var17 || var43 > (var17 + 8)) {
                        class135.method916(0, 104, -1, 0, 0, -1, 0, false, arg7, var19);
                    } else if (var11 + 8 == var42 || var17 + 8 == var43) {
                        int var50;
                        int var51;
                        if (arg1 == 0) {
                            var50 = var42 + arg4 - var11;
                            var51 = arg2 - (var17 - var43);
                        } else if (arg1 == 1) {
                            var50 = arg4 + var43 - var17;
                            var51 = arg2 + var11 + 8 - var42;
                        } else if (arg1 == 2) {
                            var50 = var11 + arg4 + 8 - var42;
                            var51 = -var43 - (-var17 - (arg2 + 8));
                        } else {
                            var50 = arg4 + var17 + 8 - var43;
                            var51 = var42 + arg2 - var11;
                        }
                        class135.method916(var20 + var43, 97, var50, var18 + var42, arg3, var51, 0, true, arg7, var19);
                    } else {
                        int var44 = arg4 + class242.method1625(arg1, true, var43 & 0x7, var42 & 0x7);
                        int var45 = class74.method472((byte) 98, arg1, var42 & 0x7, var43 & 0x7) + arg2;
                        class135.method916(var20 + var43, 103, var44, var18 + var42, arg3, var45, arg1, false, arg7, var19);
                        if (var42 == 63 || var43 == 63) {
                            int var46 = var42 == 63 ? 64 : var42;
                            int var47 = var43 == 63 ? 64 : var43;
                            int var48;
                            int var49;
                            if (arg1 == 0) {
                                var48 = var47 + arg2 - var17;
                                var49 = arg4 + var46 - var11;
                            } else if (arg1 == 1) {
                                var49 = var47 - (var17 - arg4);
                                var48 = arg2 + 8 - (var46 - var11);
                            } else if (arg1 == 2) {
                                var49 = var11 + arg4 + 8 - var46;
                                var48 = 8 - var47 - (-var17 - arg2);
                            } else {
                                var49 = var17 + arg4 + 8 - var47;
                                var48 = arg2 + var46 - var11;
                            }
                            if (var49 >= 0 && var49 < 104 && var48 >= 0 && var48 < 104) {
                                class200.field2788[var21][var49][var48] = class200.field2788[var21][var44][var45];
                            }
                        }
                    }
                }
            }
        }
        boolean var22 = false;
        if (arg6 != 4) {
            field3836 = null;
        }
        boolean var23 = false;
        while (var19.field3336.length > var19.field3402) {
            int var24 = var19.method1453((byte) -127);
            if (var24 == 128) {
                var22 = true;
                class285.field4471[0] = var19.method1445(false);
                class285.field4471[1] = var19.method1479(false);
                class285.field4471[2] = var19.method1479(false);
                class285.field4471[3] = var19.method1479(false);
                class285.field4471[4] = var19.method1445(false);
            } else {
                if (var24 != 129) {
                    var19.field3402--;
                    break;
                }
                for (int var29 = 0; var29 < 4; var29++) {
                    byte var30 = var19.method1437((byte) -72);
                    if (var30 == 0) {
                        if (var29 <= arg9) {
                            int var31 = arg4;
                            if (arg4 < 0) {
                                var31 = 0;
                            } else if (arg4 >= 104) {
                                var31 = 104;
                            }
                            int var32 = arg4 + 7;
                            if (var32 < 0) {
                                var32 = 0;
                            } else if (var32 >= 104) {
                                var32 = 104;
                            }
                            int var33 = arg2;
                            int var34 = arg2 + 7;
                            if (var34 < 0) {
                                var34 = 0;
                            } else if (var34 >= 104) {
                                var34 = 104;
                            }
                            if (arg2 < 0) {
                                var33 = 0;
                            } else if (arg2 >= 104) {
                                var33 = 104;
                            }
                            while (var32 > var31) {
                                while (var34 > var33) {
                                    class228.field3447[arg3][var31][var33] = 0;
                                    var33++;
                                }
                                var31++;
                            }
                        }
                    } else if (var30 == 1) {
                        for (int var35 = 0; var35 < 64; var35 += 4) {
                            for (int var36 = 0; var36 < 64; var36 += 4) {
                                byte var37 = var19.method1437((byte) -127);
                                if (var29 <= arg9) {
                                    for (int var38 = var35; var38 < (var35 + 4); var38++) {
                                        for (int var39 = var36; var39 < (var36 + 4); var39++) {
                                            if (var11 <= var38 && var38 < var11 + 8 && var39 >= var17 && (var17 + 8) > var17) {
                                                int var40 = arg4 + class242.method1625(arg1, true, var39 & 0x7, var38 & 0x7);
                                                int var41 = class74.method472((byte) 98, arg1, var38 & 0x7, var39 & 0x7) + arg2;
                                                if (var40 >= 0 && var40 < 104 && var41 >= 0 && var41 < 104) {
                                                    class228.field3447[arg3][var40][var41] = var37;
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
        if (!var23) {
            int var25 = arg2 + 7;
            int var26 = arg4 + 7;
            for (int var27 = arg4; var27 < var26; var27++) {
                for (int var28 = arg2; var28 < var25; var28++) {
                    class228.field3447[arg3][var27][var28] = 0;
                }
            }
        }
        if (var22) {
            return class285.field4471;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(II)I")
    public static final int method1682(int arg0, int arg1) {
        if (arg1 < 9) {
            field3844 = -117;
        }
        field3843++;
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1683(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class173 var7 = new class173();
        var7.field2428 = arg1 / 128;
        var7.field2424 = arg2 / 128;
        var7.field2403 = arg3 / 128;
        var7.field2429 = arg4 / 128;
        var7.field2417 = arg0;
        var7.field2409 = arg1;
        var7.field2406 = arg2;
        var7.field2404 = arg3;
        var7.field2425 = arg4;
        var7.field2421 = arg5;
        var7.field2413 = arg6;
        class265.field3978[class204.field2845++] = var7;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)V")
    public static void method1684(int arg0) {
        field3836 = null;
        field3839 = null;
        if (arg0 != 0) {
            method1680((String) null, 109);
        }
        field3845 = null;
        field3846 = null;
    }
}
