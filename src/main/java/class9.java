import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!e")
public class class9 {

    @OriginalMember(owner = "mapview!e", name = "b", descriptor = "[I")
    public int[] field73 = new int[1500];

    @OriginalMember(owner = "mapview!e", name = "f", descriptor = "[I")
    public int[] field77 = new int[1500];

    @OriginalMember(owner = "mapview!e", name = "k", descriptor = "I")
    private int field82 = 0;

    @OriginalMember(owner = "mapview!e", name = "m", descriptor = "[I")
    private int[] field84 = new int[1500];

    @OriginalMember(owner = "mapview!e", name = "l", descriptor = "[I")
    private int[] field83 = new int[1500];

    @OriginalMember(owner = "mapview!e", name = "c", descriptor = "[I")
    private int[] field74 = new int[1500];

    @OriginalMember(owner = "mapview!e", name = "o", descriptor = "[I")
    public int[] field86 = new int[1500];

    @OriginalMember(owner = "mapview!e", name = "e", descriptor = "Lu;")
    public static class38 field76 = method45(-41, " ");

    @OriginalMember(owner = "mapview!e", name = "h", descriptor = "Lu;")
    public static class38 field79 = method45(-41, "map");

    @OriginalMember(owner = "mapview!e", name = "j", descriptor = "Lu;")
    public static class38 field81 = method45(-41, "Loading )3)3)3");

    @OriginalMember(owner = "mapview!e", name = "d", descriptor = "Lu;")
    public static class38 field75 = method45(-41, "Next page");

    @OriginalMember(owner = "mapview!e", name = "n", descriptor = "Lu;")
    public static class38 field85 = method45(-41, "Combat Training");

    @OriginalMember(owner = "mapview!e", name = "a", descriptor = "[I")
    public static int[] field72 = new int[128];

    @OriginalMember(owner = "mapview!e", name = "i", descriptor = "I")
    public static int field80 = 0;

    @OriginalMember(owner = "mapview!e", name = "p", descriptor = "Lu;")
    public static class38 field87 = method45(-41, "Helmet Shop");

    @OriginalMember(owner = "mapview!e", name = "q", descriptor = "Lu;")
    public static class38 field88 = method45(-41, "Shield Shop");

    @OriginalMember(owner = "mapview!e", name = "g", descriptor = "[I")
    public static int[] field78;

    @OriginalMember(owner = "mapview!e", name = "a", descriptor = "(IIB)V", line = 7)
    private final void method37(int arg0, int arg1, byte arg2) {
        int var4 = arg1 >> 6;
        int var5 = arg0 >> 6;
        class23.field215[2] = new byte[var4][var5][];
        if (arg2 != -91) {
            this.field84 = null;
        }
        class23.field215[3] = new byte[var4][var5][];
        class28.field347 = new class35[var4][var5];
        class31.field379 = new class35[var4][var5];
        class14.field135 = new int[var4][var5][];
        class23.field215[4] = new byte[var4][var5][];
        class23.field215[0] = new byte[var4][var5][];
        class23.field215[1] = new byte[var4][var5][];
    }

    @OriginalMember(owner = "mapview!e", name = "a", descriptor = "(IZIIIII[III)V", line = 26)
    private final void method38(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int[] arg7, int arg8, int arg9) {
        if (arg6 == 9) {
            arg3 = arg3 + 1 & 0x3;
            arg6 = 1;
        }
        if (arg6 == 10) {
            arg6 = 1;
            arg3 = arg3 + 3 & 0x3;
        }
        if (arg6 == 11) {
            arg6 = 8;
            arg3 = arg3 + 3 & 0x3;
        }
        int var11 = class27.field337 - arg5;
        if (arg6 == 1) {
            if (arg3 == 0) {
                for (int var68 = 0; var68 < arg0; var68++) {
                    for (int var69 = 0; var69 < arg5; var69++) {
                        if (var68 >= var69) {
                            arg7[arg9] = arg4;
                        } else if (arg1) {
                            arg7[arg9] = arg8;
                        }
                        arg9++;
                    }
                    arg9 += var11;
                }
            } else if (arg3 == 1) {
                for (int var70 = arg0 - 1; var70 >= 0; var70--) {
                    for (int var71 = 0; var71 < arg5; var71++) {
                        if (var70 >= var71) {
                            arg7[arg9] = arg4;
                        } else if (arg1) {
                            arg7[arg9] = arg8;
                        }
                        arg9++;
                    }
                    arg9 += var11;
                }
            } else if (arg3 == 2) {
                for (int var72 = 0; var72 < arg0; var72++) {
                    for (int var73 = 0; var73 < arg5; var73++) {
                        if (var72 <= var73) {
                            arg7[arg9] = arg4;
                        } else if (arg1) {
                            arg7[arg9] = arg8;
                        }
                        arg9++;
                    }
                    arg9 += var11;
                }
            } else if (arg3 == 3) {
                for (int var74 = arg0 - 1; var74 >= 0; var74--) {
                    for (int var75 = 0; var75 < arg5; var75++) {
                        if (var74 <= var75) {
                            arg7[arg9] = arg4;
                        } else if (arg1) {
                            arg7[arg9] = arg8;
                        }
                        arg9++;
                    }
                    arg9 += var11;
                }
            }
        } else if (arg6 == 2) {
            if (arg3 == 0) {
                for (int var18 = arg0 - 1; var18 >= 0; var18--) {
                    for (int var19 = 0; var19 < arg5; var19++) {
                        if (var18 >> 1 >= var19) {
                            arg7[arg9] = arg4;
                        } else if (arg1) {
                            arg7[arg9] = arg8;
                        }
                        arg9++;
                    }
                    arg9 += var11;
                }
            } else if (arg3 == 1) {
                for (int var12 = 0; var12 < arg0; var12++) {
                    for (int var13 = 0; var13 < arg5; var13++) {
                        if (var13 >= var12 << 1) {
                            arg7[arg9] = arg4;
                        } else if (arg1) {
                            arg7[arg9] = arg8;
                        }
                        arg9++;
                    }
                    arg9 += var11;
                }
            } else if (arg3 == 2) {
                for (int var14 = 0; var14 < arg0; var14++) {
                    for (int var15 = arg5 - 1; var15 >= 0; var15--) {
                        if (var15 <= var14 >> 1) {
                            arg7[arg9] = arg4;
                        } else if (arg1) {
                            arg7[arg9] = arg8;
                        }
                        arg9++;
                    }
                    arg9 += var11;
                }
            } else if (arg3 == 3) {
                for (int var16 = arg0 - 1; var16 >= 0; var16--) {
                    for (int var17 = arg5 - 1; var17 >= 0; var17--) {
                        if (var17 >= var16 << 1) {
                            arg7[arg9] = arg4;
                        } else if (arg1) {
                            arg7[arg9] = arg8;
                        }
                        arg9++;
                    }
                    arg9 += var11;
                }
            }
        } else if (arg6 != 3) {
            if (arg2 != 1) {
                this.field86 = null;
            }
            if (arg6 == 4) {
                if (arg3 == 0) {
                    for (int var34 = arg0 - 1; var34 >= 0; var34--) {
                        for (int var35 = 0; var35 < arg5; var35++) {
                            if (var34 >> 1 <= var35) {
                                arg7[arg9] = arg4;
                            } else if (arg1) {
                                arg7[arg9] = arg8;
                            }
                            arg9++;
                        }
                        arg9 += var11;
                    }
                } else if (arg3 == 1) {
                    for (int var28 = 0; var28 < arg0; var28++) {
                        for (int var29 = 0; var29 < arg5; var29++) {
                            if (var28 << 1 >= var29) {
                                arg7[arg9] = arg4;
                            } else if (arg1) {
                                arg7[arg9] = arg8;
                            }
                            arg9++;
                        }
                        arg9 += var11;
                    }
                } else if (arg3 == 2) {
                    for (int var30 = 0; var30 < arg0; var30++) {
                        for (int var31 = arg5 - 1; var31 >= 0; var31--) {
                            if (var30 >> 1 <= var31) {
                                arg7[arg9] = arg4;
                            } else if (arg1) {
                                arg7[arg9] = arg8;
                            }
                            arg9++;
                        }
                        arg9 += var11;
                    }
                } else if (arg3 == 3) {
                    for (int var32 = arg0 - 1; var32 >= 0; var32--) {
                        for (int var33 = arg5 - 1; var33 >= 0; var33--) {
                            if (var32 << 1 >= var33) {
                                arg7[arg9] = arg4;
                            } else if (arg1) {
                                arg7[arg9] = arg8;
                            }
                            arg9++;
                        }
                        arg9 += var11;
                    }
                }
            } else if (arg6 != 5) {
                if (arg6 == 6) {
                    if (arg3 == 0) {
                        for (int var36 = 0; var36 < arg0; var36++) {
                            for (int var37 = 0; var37 < arg5; var37++) {
                                if (arg5 / 2 >= var37) {
                                    arg7[arg9] = arg4;
                                } else if (arg1) {
                                    arg7[arg9] = arg8;
                                }
                                arg9++;
                            }
                            arg9 += var11;
                        }
                        return;
                    }
                    if (arg3 == 1) {
                        for (int var38 = 0; var38 < arg0; var38++) {
                            for (int var39 = 0; var39 < arg5; var39++) {
                                if (var38 <= arg0 / 2) {
                                    arg7[arg9] = arg4;
                                } else if (arg1) {
                                    arg7[arg9] = arg8;
                                }
                                arg9++;
                            }
                            arg9 += var11;
                        }
                        return;
                    }
                    if (arg3 == 2) {
                        for (int var40 = 0; var40 < arg0; var40++) {
                            for (int var41 = 0; var41 < arg5; var41++) {
                                if (arg5 / 2 <= var41) {
                                    arg7[arg9] = arg4;
                                } else if (arg1) {
                                    arg7[arg9] = arg8;
                                }
                                arg9++;
                            }
                            arg9 += var11;
                        }
                        return;
                    }
                    if (arg3 == 3) {
                        for (int var58 = 0; var58 < arg0; var58++) {
                            for (int var59 = 0; var59 < arg5; var59++) {
                                if (arg0 / 2 <= var58) {
                                    arg7[arg9] = arg4;
                                } else if (arg1) {
                                    arg7[arg9] = arg8;
                                }
                                arg9++;
                            }
                            arg9 += var11;
                        }
                        return;
                    }
                }
                if (arg6 == 7) {
                    if (arg3 == 0) {
                        for (int var42 = 0; var42 < arg0; var42++) {
                            for (int var43 = 0; var43 < arg5; var43++) {
                                if (var43 <= var42 - arg0 / 2) {
                                    arg7[arg9] = arg4;
                                } else if (arg1) {
                                    arg7[arg9] = arg8;
                                }
                                arg9++;
                            }
                            arg9 += var11;
                        }
                        return;
                    }
                    if (arg3 == 1) {
                        for (int var44 = arg0 - 1; var44 >= 0; var44--) {
                            for (int var45 = 0; var45 < arg5; var45++) {
                                if (var44 - arg0 / 2 >= var45) {
                                    arg7[arg9] = arg4;
                                } else if (arg1) {
                                    arg7[arg9] = arg8;
                                }
                                arg9++;
                            }
                            arg9 += var11;
                        }
                        return;
                    }
                    if (arg3 == 2) {
                        for (int var48 = arg0 - 1; var48 >= 0; var48--) {
                            for (int var49 = arg5 - 1; var49 >= 0; var49--) {
                                if (var49 <= var48 - arg0 / 2) {
                                    arg7[arg9] = arg4;
                                } else if (arg1) {
                                    arg7[arg9] = arg8;
                                }
                                arg9++;
                            }
                            arg9 += var11;
                        }
                        return;
                    }
                    if (arg3 == 3) {
                        for (int var46 = 0; var46 < arg0; var46++) {
                            for (int var47 = arg5 - 1; var47 >= 0; var47--) {
                                if (var46 - arg0 / 2 >= var47) {
                                    arg7[arg9] = arg4;
                                } else if (arg1) {
                                    arg7[arg9] = arg8;
                                }
                                arg9++;
                            }
                            arg9 += var11;
                        }
                        return;
                    }
                }
                if (arg6 == 8) {
                    if (arg3 == 0) {
                        for (int var50 = 0; var50 < arg0; var50++) {
                            for (int var51 = 0; var51 < arg5; var51++) {
                                if (var51 >= var50 - arg0 / 2) {
                                    arg7[arg9] = arg4;
                                } else if (arg1) {
                                    arg7[arg9] = arg8;
                                }
                                arg9++;
                            }
                            arg9 += var11;
                        }
                        return;
                    }
                    if (arg3 == 1) {
                        for (int var52 = arg0 - 1; var52 >= 0; var52--) {
                            for (int var53 = 0; var53 < arg5; var53++) {
                                if (var53 >= var52 - arg0 / 2) {
                                    arg7[arg9] = arg4;
                                } else if (arg1) {
                                    arg7[arg9] = arg8;
                                }
                                arg9++;
                            }
                            arg9 += var11;
                        }
                        return;
                    }
                    if (arg3 == 2) {
                        for (int var54 = arg0 - 1; var54 >= 0; var54--) {
                            for (int var55 = arg5 - 1; var55 >= 0; var55--) {
                                if (var55 >= var54 - arg0 / 2) {
                                    arg7[arg9] = arg4;
                                } else if (arg1) {
                                    arg7[arg9] = arg8;
                                }
                                arg9++;
                            }
                            arg9 += var11;
                        }
                        return;
                    }
                    if (arg3 == 3) {
                        for (int var56 = 0; var56 < arg0; var56++) {
                            for (int var57 = arg5 - 1; var57 >= 0; var57--) {
                                if (var57 >= var56 - arg0 / 2) {
                                    arg7[arg9] = arg4;
                                } else if (arg1) {
                                    arg7[arg9] = arg8;
                                }
                                arg9++;
                            }
                            arg9 += var11;
                        }
                        return;
                    }
                }
            } else if (arg3 == 0) {
                for (int var60 = arg0 - 1; var60 >= 0; var60--) {
                    for (int var61 = arg5 - 1; var61 >= 0; var61--) {
                        if (var60 >> 1 <= var61) {
                            arg7[arg9] = arg4;
                        } else if (arg1) {
                            arg7[arg9] = arg8;
                        }
                        arg9++;
                    }
                    arg9 += var11;
                }
            } else if (arg3 == 1) {
                for (int var62 = arg0 - 1; var62 >= 0; var62--) {
                    for (int var63 = 0; var63 < arg5; var63++) {
                        if (var62 << 1 >= var63) {
                            arg7[arg9] = arg4;
                        } else if (arg1) {
                            arg7[arg9] = arg8;
                        }
                        arg9++;
                    }
                    arg9 += var11;
                }
            } else if (arg3 == 2) {
                for (int var64 = 0; var64 < arg0; var64++) {
                    for (int var65 = 0; var65 < arg5; var65++) {
                        if (var64 >> 1 <= var65) {
                            arg7[arg9] = arg4;
                        } else if (arg1) {
                            arg7[arg9] = arg8;
                        }
                        arg9++;
                    }
                    arg9 += var11;
                }
            } else if (arg3 == 3) {
                for (int var66 = 0; var66 < arg0; var66++) {
                    for (int var67 = arg5 - 1; var67 >= 0; var67--) {
                        if (var66 << 1 >= var67) {
                            arg7[arg9] = arg4;
                        } else if (arg1) {
                            arg7[arg9] = arg8;
                        }
                        arg9++;
                    }
                    arg9 += var11;
                }
            }
        } else if (arg3 == 0) {
            for (int var20 = arg0 - 1; var20 >= 0; var20--) {
                for (int var21 = arg5 - 1; var21 >= 0; var21--) {
                    if (var20 >> 1 >= var21) {
                        arg7[arg9] = arg4;
                    } else if (arg1) {
                        arg7[arg9] = arg8;
                    }
                    arg9++;
                }
                arg9 += var11;
            }
        } else if (arg3 == 1) {
            for (int var26 = arg0 - 1; var26 >= 0; var26--) {
                for (int var27 = 0; var27 < arg5; var27++) {
                    if (var27 >= var26 << 1) {
                        arg7[arg9] = arg4;
                    } else if (arg1) {
                        arg7[arg9] = arg8;
                    }
                    arg9++;
                }
                arg9 += var11;
            }
        } else if (arg3 == 2) {
            for (int var22 = 0; var22 < arg0; var22++) {
                for (int var23 = 0; var23 < arg5; var23++) {
                    if (var22 >> 1 >= var23) {
                        arg7[arg9] = arg4;
                    } else if (arg1) {
                        arg7[arg9] = arg8;
                    }
                    arg9++;
                }
                arg9 += var11;
            }
        } else if (arg3 == 3) {
            for (int var24 = 0; var24 < arg0; var24++) {
                for (int var25 = arg5 - 1; var25 >= 0; var25--) {
                    if (var24 << 1 <= var25) {
                        arg7[arg9] = arg4;
                    } else if (arg1) {
                        arg7[arg9] = arg8;
                    }
                    arg9++;
                }
                arg9 += var11;
            }
        }
    }

    @OriginalMember(owner = "mapview!e", name = "a", descriptor = "(I[B[[B)V", line = 1151)
    private final void method39(int arg0, byte[] arg1, byte[][] arg2) {
        int var4 = 0;
        while (true) {
            while (var4 < arg1.length) {
                int var5 = (arg1[var4++] & 0xFF) * 64 - class11.field111;
                int var6 = (arg1[var4++] & 0xFF) * 64 - class30.field363;
                if (var5 > 0 && var6 > 0 && class16.field154 > var5 + 64 && var6 + 64 < class11.field114) {
                    for (int var7 = 0; var7 < 64; var7++) {
                        byte[] var8 = arg2[var5 + var7];
                        int var9 = class11.field114 - var6 - 1;
                        for (int var10 = -64; var10 < 0; var10++) {
                            var8[var9--] = arg1[var4++];
                        }
                    }
                } else {
                    var4 += 4096;
                }
            }
            if (arg0 != -10531) {
                this.method48((byte) 3, null);
            }
            return;
        }
    }

    @OriginalMember(owner = "mapview!e", name = "a", descriptor = "([BI)V", line = 1199)
    private final void method40(byte[] arg0, int arg1) {
        if (arg1 != -1) {
            field72 = null;
        }
        int var3 = 0;
        while (true) {
            while (arg0.length > var3) {
                int var4 = (arg0[var3++] & 0xFF) * 64 - class11.field111;
                int var5 = (arg0[var3++] & 0xFF) * 64 - class30.field363;
                if (var4 > 0 && var5 > 0 && var4 + 64 < class16.field154 && var5 + 64 < class11.field114) {
                    class18.field159 = var4 >> 6;
                    class30.field365 = class11.field114 - var5 - 1 >> 6;
                    for (int var6 = 0; var6 < 64; var6++) {
                        for (int var7 = -64; var7 < 0; var7++) {
                            int var8 = arg0[var3++] & 0xFF;
                            if (var8 != 0) {
                                byte var9 = arg0[var3++];
                                class41.method257(var4 + var6, var9, class11.field114 - var5 - var7 - 65, true, 3);
                                if (class31.field379[class30.field365][class18.field159] == null) {
                                    class31.field379[class30.field365][class18.field159] = new class35();
                                    class31.field379[class30.field365][class18.field159].field445 = new byte[4096];
                                }
                                class31.field379[class30.field365][class18.field159].field445[(-(var7 + 1) << 6) + var6] = (byte) var8;
                            }
                        }
                    }
                    if (class31.field379[class30.field365][class18.field159] != null) {
                        class31.field379[class30.field365][class18.field159].method200(-12497);
                    }
                } else {
                    for (int var10 = -4096; var10 < 0; var10++) {
                        byte var11 = arg0[var3++];
                        if (var11 != 0) {
                            var3++;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "mapview!e", name = "a", descriptor = "(IIIIIIIII)V", line = 1289)
    public final void method41(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var10 = arg7 - arg4;
        int var11 = arg3 - arg1;
        int var12 = (arg0 - arg6 << 16) / var11;
        int var13 = (arg8 - arg5 << 16) / var10;
        int var14 = 0;
        if (arg2 != -17556) {
            this.method39(-45, null, null);
        }
        while (var14 < var11) {
            int var15 = (var14 + 1) * var12 >> 16;
            int var16 = var12 * var14 >> 16;
            int var17 = var15 - var16;
            if (var17 > 0) {
                int var18 = arg6 + var15;
                class28.method161(116, arg4, arg1 + var14);
                int var19 = arg6 + var16;
                for (int var20 = 0; var20 < var10; var20++) {
                    int var21 = var13 * var20 >> 16;
                    int var22 = (var20 + 1) * var13 >> 16;
                    int var23 = var22 - var21;
                    if (var23 > 0) {
                        int var24 = arg5 + var22;
                        int var25 = arg5 + var21;
                        int var26 = class23.method106((byte) 55);
                        int var27 = class13.method74((byte) 61);
                        if (var26 == 0 && var27 == 0) {
                            class27.method153(var19, var25, var18 - var19, -var25 + var24, class19.method94((byte) 100));
                        } else {
                            byte var28 = class5.method17(false);
                            int var29 = var28 & 0xFC;
                            if (var29 == 0 || var17 <= 1 || var23 <= 1) {
                                class27.method153(var19, var25, var17, var23, var26);
                            } else {
                                this.method38(var23, true, 1, var28 & 0x3, var26, var17, var29 >> 2, class27.field338, class19.method94((byte) 101), class27.field337 * var25 + var19);
                            }
                            if (var27 > 0) {
                                byte var30 = class5.method16(arg2 ^ 0xFFFFBB6C);
                                int var31 = var30 & 0xFC;
                                if (var31 == 0 || var17 <= 1 || var23 <= 1) {
                                    class27.method153(var19, var25, var17, var23, var27);
                                }
                                this.method38(var23, var26 == 0, 1, var30 & 0x3, var27, var17, var31 >> 2, class27.field338, class19.method94((byte) 119), class27.field337 * var25 + var19);
                            }
                        }
                    }
                    class1.method2((byte) -91);
                }
            }
            var14++;
        }
    }

    @OriginalMember(owner = "mapview!e", name = "b", descriptor = "(IIIIIIIII)V", line = 1378)
    public final void method42(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var10 = arg6 - arg7;
        this.field82 = 0;
        int var11 = (arg2 - arg3 << 16) / var10;
        int var12 = arg5 - arg8;
        int var13 = (arg0 - arg4 << 16) / var12;
        for (int var14 = 0; var14 < var10; var14++) {
            int var15 = var11 * var14 >> 16;
            int var16 = (var14 + 1) * var11 >> 16;
            int var17 = var16 - var15;
            if (var17 > 0) {
                class28.method161(arg1 - 165, arg8, arg7 + var14);
                for (int var18 = 0; var18 < var12; var18++) {
                    int var19 = var13 * var18 >> 16;
                    int var20 = (var18 + 1) * var13 >> 16;
                    int var21 = var20 - var19;
                    if (var21 > 0) {
                        int var22 = class10.method55((byte) -53) & 0xFF;
                        if (var22 != 0) {
                            int var23;
                            if (var21 == 1) {
                                var23 = var19;
                            } else {
                                var23 = var20 - 1;
                            }
                            int var24 = 13421772;
                            if (var22 >= 5 && var22 <= 8 || var22 >= 13 && var22 <= 16 || var22 >= 21 && var22 <= 24 || var22 == 27 || var22 == 28) {
                                var24 = 13369344;
                                var22 -= 4;
                            }
                            int var25;
                            if (var17 == 1) {
                                var25 = var15;
                            } else {
                                var25 = var16 - 1;
                            }
                            if (var22 == 1) {
                                class27.method152(var15, var19, var21, var24);
                            } else if (var22 == 2) {
                                class27.method157(var15, var19, var17, var24);
                            } else if (var22 == 3) {
                                class27.method152(var25, var19, var21, var24);
                            } else if (var22 == 4) {
                                class27.method157(var15, var23, var17, var24);
                            } else if (var22 == 9) {
                                class27.method152(var15, var19, var21, 16777215);
                                class27.method157(var15, var19, var17, var24);
                            } else if (var22 == 10) {
                                class27.method152(var25, var19, var21, 16777215);
                                class27.method157(var15, var19, var17, var24);
                            } else if (var22 == 11) {
                                class27.method152(var25, var19, var21, 16777215);
                                class27.method157(var15, var23, var17, var24);
                            } else if (var22 == 12) {
                                class27.method152(var15, var19, var21, 16777215);
                                class27.method157(var15, var23, var17, var24);
                            } else if (var22 == 17) {
                                class27.method157(var15, var19, 1, var24);
                            } else if (var22 == 18) {
                                class27.method157(var25, var19, 1, var24);
                            } else if (var22 == 19) {
                                class27.method157(var25, var23, 1, var24);
                            } else if (var22 == 20) {
                                class27.method157(var15, var23, 1, var24);
                            } else if (var22 == 25) {
                                for (int var27 = 0; var27 < var21; var27++) {
                                    class27.method157(var15 + var27, -var27 + var23, 1, var24);
                                }
                            } else if (var22 == 26) {
                                for (int var26 = 0; var26 < var21; var26++) {
                                    class27.method157(var15 + var26, var19 + var26, 1, var24);
                                }
                            }
                        }
                        int var28 = class20.method97(true) & 0xFF;
                        if (var28 != 0) {
                            this.field74[this.field82] = var28 - 1;
                            this.field84[this.field82] = var17 / 2 + var15;
                            this.field83[this.field82] = var21 / 2 + var19;
                            this.field82++;
                        }
                    }
                    class1.method2((byte) -14);
                }
            }
        }
        if (arg1 != 255) {
            this.method38(73, true, -4, 13, 82, 71, 18, null, -50, 117);
        }
    }

    @OriginalMember(owner = "mapview!e", name = "a", descriptor = "(IIIIIBIIIII)V", line = 1553)
    public final void method43(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (this.field82 == 0) {
            int var12 = arg8 - arg0;
            int var13 = arg4 - arg6;
            int var14 = (arg3 - arg1 << 16) / var12;
            int var15 = (arg10 - arg7 << 16) / var13;
            for (int var16 = 0; var16 < var12; var16++) {
                int var17 = var14 * var16 >> 16;
                int var18 = (var16 + 1) * var14 >> 16;
                int var19 = var18 - var17;
                if (var19 > 0) {
                    class28.method161(92, arg6, arg0 + var16);
                    for (int var20 = 0; var20 < var13; var20++) {
                        int var21 = var15 * var20 >> 16;
                        int var22 = (var20 + 1) * var15 >> 16;
                        int var23 = var22 - var21;
                        if (var23 > 0) {
                            int var24 = class20.method97(true) & 0xFF;
                            if (var24 != 0) {
                                this.field74[this.field82] = var24 - 1;
                                this.field84[this.field82] = var19 / 2 + var17;
                                this.field83[this.field82] = var23 / 2 + var21;
                                this.field82++;
                            }
                        }
                        class1.method2((byte) -123);
                    }
                }
            }
        }
        if (arg5 <= 95) {
            return;
        }
        for (int var25 = 0; var25 < this.field82; var25++) {
            if (mapview.field282[this.field74[var25]] != null) {
                mapview.field282[this.field74[var25]].method167(this.field84[var25] - 7, this.field83[var25] + -7);
            }
        }
        if (arg2 > 0) {
            for (int var26 = 0; var26 < this.field82; var26++) {
                if (this.field74[var26] == arg9) {
                    mapview.field282[this.field74[var26]].method167(this.field84[var26] - 7, this.field83[var26] + -7);
                    if (arg2 % 10 < 5) {
                        class27.method159(this.field84[var26], this.field83[var26], 15, 16776960, 128);
                        class27.method159(this.field84[var26], this.field83[var26], 7, 16777215, 256);
                    }
                }
            }
        }
        this.field82 = 0;
    }

    @OriginalMember(owner = "mapview!e", name = "b", descriptor = "([BI)V", line = 1659)
    private final void method44(byte[] arg0, int arg1) {
        if (arg1 != 255) {
            this.field77 = null;
        }
        int var3 = 0;
        while (true) {
            while (arg0.length > var3) {
                int var4 = (arg0[var3++] & 0xFF) * 64 - class11.field111;
                int var5 = (arg0[var3++] & 0xFF) * 64 - class30.field363;
                if (var4 > 0 && var5 > 0 && class16.field154 > var4 + 64 && class11.field114 > var5 + 64) {
                    class18.field159 = var4 >> 6;
                    class30.field365 = class11.field114 - var5 - 1 >> 6;
                    for (int var6 = 0; var6 < 64; var6++) {
                        for (int var7 = -64; var7 < 0; var7++) {
                            int var8 = arg0[var3++] & 0xFF;
                            if (var8 != 0) {
                                byte var9 = arg0[var3++];
                                class41.method257(var4 + var6, var9, class11.field114 - var7 - var5 - 1 - 64, true, 4);
                                if (class28.field347[class30.field365][class18.field159] == null) {
                                    class28.field347[class30.field365][class18.field159] = new class35();
                                    class28.field347[class30.field365][class18.field159].field445 = new byte[4096];
                                }
                                class28.field347[class30.field365][class18.field159].field445[(-(var7 + 1) << 6) + var6] = (byte) var8;
                            }
                        }
                    }
                    if (class28.field347[class30.field365][class18.field159] != null) {
                        class28.field347[class30.field365][class18.field159].method200(arg1 - 12752);
                    }
                } else {
                    for (int var10 = -4096; var10 < 0; var10++) {
                        byte var11 = arg0[var3++];
                        if (var11 != 0) {
                            var3++;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "mapview!e", name = "a", descriptor = "(ILjava/lang/String;)Lu;", line = 1745)
    public static final class38 method45(int arg0, String arg1) {
        if (arg0 != -41) {
            return (class38) null;
        }
        byte[] var2 = arg1.getBytes();
        int var3 = var2.length;
        int var4 = 0;
        class38 var5 = new class38();
        var5.field487 = new byte[var3];
        while (var3 > var4) {
            int var6 = var2[var4++] & 0xFF;
            if (var6 <= 45 && var6 >= 40) {
                if (var3 <= var4) {
                    break;
                }
                int var7 = var2[var4++] & 0xFF;
                var5.field487[var5.field492++] = (byte) (var6 * 43 + var7 - 1720 - 48);
            } else if (var6 != 0) {
                var5.field487[var5.field492++] = (byte) var6;
            }
        }
        var5.method242(23463);
        return var5.method222(arg0 ^ 0x752A);
    }

    @OriginalMember(owner = "mapview!e", name = "a", descriptor = "(DBDD)I", line = 1787)
    private final int method46(double arg0, byte arg1, double arg2, double arg3) {
        double var8 = arg0;
        double var10 = arg0;
        double var12 = arg0;
        if (arg2 != 0.0D) {
            double var14;
            if (arg0 < 0.5D) {
                var14 = (arg2 + 1.0D) * arg0;
            } else {
                var14 = arg0 + arg2 - arg0 * arg2;
            }
            double var16 = arg0 * 2.0D - var14;
            double var20 = arg3 + 0.3333333333333333D;
            if (var20 > 1.0D) {
                var20--;
            }
            if (var20 * 6.0D < 1.0D) {
                var8 = (var14 - var16) * 6.0D * var20 + var16;
            } else if (var20 * 2.0D < 1.0D) {
                var8 = var14;
            } else if (var20 * 3.0D < 2.0D) {
                var8 = (var14 - var16) * (-var20 + 0.6666666666666666D) * 6.0D + var16;
            } else {
                var8 = var16;
            }
            if (arg3 * 6.0D < 1.0D) {
                var12 = (var14 - var16) * 6.0D * arg3 + var16;
            } else if (arg3 * 2.0D < 1.0D) {
                var12 = var14;
            } else if (arg3 * 3.0D < 2.0D) {
                var12 = (0.6666666666666666D - arg3) * (-var16 + var14) * 6.0D + var16;
            } else {
                var12 = var16;
            }
            double var22 = arg3 - 0.3333333333333333D;
            if (var22 < 0.0D) {
                var22++;
            }
            if (var22 * 6.0D < 1.0D) {
                var10 = (var14 - var16) * 6.0D * var22 + var16;
            } else if (var22 * 2.0D < 1.0D) {
                var10 = var14;
            } else if (var22 * 3.0D < 2.0D) {
                var10 = (var14 - var16) * (-var22 + 0.6666666666666666D) * 6.0D + var16;
            } else {
                var10 = var16;
            }
        }
        int var24 = (int) (var8 * 256.0D);
        int var25 = (int) (var10 * 256.0D);
        if (arg1 > -38) {
            this.method49(120, 106, 0.24258530165415035D, -82, 40, 30, -18, -16, 96, 56);
        }
        int var26 = (int) (var12 * 256.0D);
        return (var24 << 16) + (var26 << 8) + var25;
    }

    @OriginalMember(owner = "mapview!e", name = "a", descriptor = "([Lu;I)Lu;", line = 1880)
    public static final class38 method47(class38[] arg0, int arg1) {
        if (arg0.length < 2) {
            throw new IllegalArgumentException();
        } else if (arg1 >= -92) {
            return (class38) null;
        } else {
            return class10.method53(arg0, arg0.length, true, 0);
        }
    }

    @OriginalMember(owner = "mapview!e", name = "a", descriptor = "(BLg;)V", line = 1917)
    public final void method48(byte arg0, class13 arg1) {
        class33 var3 = new class33(arg1.method265((byte) 83, class8.field69, class31.field384));
        int var4 = var3.method186(-253);
        int var5 = var3.method186(-253);
        int var6 = var3.method186(-253);
        int var7 = var3.method186(-253);
        int var8 = var3.method186(-253);
        int var9 = var3.method186(-253);
        var3.method192(74);
        class11.field111 = var4 * 64;
        class11.field114 = (var7 + 1 - var5) * 64;
        class16.field154 = (var6 + 1 - var4) * 64;
        class18.field172 = var8 * 64 - class11.field111;
        class30.field363 = var5 * 64;
        class5.field34 = class30.field363 + class11.field114 - var9 * 64;
        this.method37(class16.field154, class11.field114, (byte) -91);
        class33 var10 = new class33(arg1.method265((byte) 83, class8.field69, class19.field176));
        int var11 = var10.method186(-253);
        class11.field110 = new int[var11 + 1];
        for (int var12 = 0; var12 < var11; var12++) {
            class11.field110[var12 + 1] = var10.method190(4096);
        }
        int var13 = var10.method186(-253);
        class16.field156 = new int[var13 + 1];
        for (int var14 = 0; var14 < var13; var14++) {
            class16.field156[var14 + 1] = var10.method190(4096);
        }
        if (arg0 <= 42) {
            this.method38(81, false, -79, 32, -3, 2, 33, null, -119, 95);
        }
        byte[] var15 = arg1.method265((byte) 83, class8.field69, class22.field210);
        byte[][] var16 = new byte[class16.field154][class11.field114];
        this.method39(-10531, var15, var16);
        byte[] var17 = arg1.method265((byte) 83, class8.field69, class28.field352);
        this.method40(var17, -1);
        byte[] var18 = arg1.method265((byte) 83, class8.field69, class10.field96);
        this.method44(var18, 255);
        byte[] var19 = arg1.method265((byte) 83, class8.field69, class2.field11);
        class31.field380 = 0;
        this.method51(var19, -1501);
        this.method52(var16, 1257028784);
    }

    @OriginalMember(owner = "mapview!e", name = "a", descriptor = "(IIDIIIIIII)V", line = 1982)
    public final void method49(int arg0, int arg1, double arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var12 = arg1 - arg5;
        int var13 = arg6 - arg9;
        int var14 = (arg4 - arg8 << 16) / var12;
        int var15 = (arg3 - arg0 << 16) / var13;
        if (arg3 - arg0 < arg6 - arg9) {
            return;
        }
        this.field82 = 0;
        for (int var16 = arg7; var16 < var13; var16++) {
            int var17 = var15 * var16 >> 16;
            int var18 = (var16 + 1) * var15 >> 16;
            int var19 = var18 - var17;
            if (var19 > 0) {
                class28.method161(88, arg5, arg9 + var16);
                for (int var20 = 0; var20 < var12; var20++) {
                    int var21 = var14 * var20 >> 16;
                    int var22 = (var20 + 1) * var14 >> 16;
                    int var23 = var22 - var21;
                    if (var23 > 0) {
                        int var24 = class38.method219((byte) 34) & 0xFF;
                        if (var24 != 0) {
                            if (var24 == 47 || var24 == 53) {
                                class41.field526[var24 - 1].method29(var17, var21, var19 * 2 + 1, var23 * 2 + 1);
                                if (!(arg2 < 4.0D) && arg2 > 4.2D && !(arg2 > 6.2D)) {
                                }
                            } else {
                                class41.field526[var24 - 1].method29(var17 - var19 / 2, -(var23 / 2) + var21, var19 * 2, var23 * 2);
                            }
                        }
                    }
                    class1.method2((byte) -20);
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!e", name = "a", descriptor = "(I)V", line = 2106)
    public static void method50(int arg0) {
        field88 = null;
        field81 = null;
        field76 = null;
        field75 = null;
        field79 = null;
        field78 = null;
        field87 = null;
        field85 = null;
        field72 = null;
        int var1 = -104 % ((arg0 - 50) / 43);
    }

    @OriginalMember(owner = "mapview!e", name = "c", descriptor = "([BI)V", line = 2164)
    private final void method51(byte[] arg0, int arg1) {
        int var3 = 0;
        if (arg1 != -1501) {
            field79 = null;
        }
        while (true) {
            while (var3 < arg0.length) {
                int var4 = (arg0[var3++] & 0xFF) * 64 - class11.field111;
                int var5 = (arg0[var3++] & 0xFF) * 64 - class30.field363;
                if (var4 > 0 && var5 > 0 && var4 + 64 < class16.field154 && class11.field114 > var5 + 64) {
                    for (int var6 = 0; var6 < 64; var6++) {
                        int var7 = class11.field114 - var5 - 1;
                        for (int var8 = -64; var8 < 0; var8++) {
                            while (true) {
                                int var9 = arg0[var3++] & 0xFF;
                                if (var9 == 0) {
                                    break;
                                }
                                if (var9 < 29) {
                                    class41.method257(var4 + var6, (byte) var9, class11.field114 - var5 - var8 - 64 - 1, true, 0);
                                } else if (var9 >= 160) {
                                    class41.method257(var4 + var6, (byte) (var9 + -159), class11.field114 - var5 - var8 - 64 - 1, true, 2);
                                    if (class31.field380 >= 1500) {
                                        break;
                                    }
                                    this.field77[class31.field380] = var4 + var6;
                                    this.field73[class31.field380] = var7;
                                    this.field86[class31.field380] = var9 - 160;
                                    class31.field380++;
                                } else {
                                    class41.method257(var4 + var6, (byte) (var9 + -28), class11.field114 - var5 - var8 - 64 - 1, true, 1);
                                }
                            }
                            var7--;
                        }
                    }
                } else {
                    for (int var10 = 0; var10 < 64; var10++) {
                        byte var12;
                        for (int var11 = -64; var11 < 0; var11++) {
                            do {
                                var12 = arg0[var3++];
                            } while (var12 != 0);
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "mapview!e", name = "a", descriptor = "([[BI)V", line = 2275)
    private final void method52(byte[][] arg0, int arg1) {
        int var3 = class16.field154;
        int var4 = class11.field114;
        int[] var5 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var5[var6] = 0;
        }
        if (arg1 != 1257028784) {
            this.method43(89, 79, -58, -15, 70, (byte) -76, -90, 27, 73, 44, 9);
        }
        for (int var7 = 5; var7 < var3 - 5; var7++) {
            byte[] var8 = arg0[var7 + 5];
            byte[] var9 = arg0[var7 - 5];
            for (int var10 = 0; var10 < var4; var10++) {
                int var11 = class11.field110[var8[var10] & 0xFF];
                int var12 = class11.field110[var9[var10] & 0xFF];
                if (var11 <= 0 && class11.method60(var10, 63, var7 + 5) > 0) {
                    var11 = 64;
                }
                if (var12 <= 0 && class11.method60(var10, 63, var7 - 5) > 0) {
                    var12 = 64;
                }
                var5[var10] += var11 - var12;
            }
            if (var7 > 10 && var7 < var3 - 10) {
                int var13 = 0;
                int var14 = 0;
                int var15 = 0;
                for (int var16 = 5; var16 < var4 - 5; var16++) {
                    int var17 = var5[var16 - 5];
                    int var18 = var5[var16 + 5];
                    var15 += (var18 & 0x3FF) - (var17 & 0x3FF);
                    var14 += (var18 >> 10 & 0x3FF) - (var17 >> 10 & 0x3FF);
                    var13 += (var18 >> 20) - (var17 >> 20);
                    if (var15 > 0) {
                        int var19 = var7 >> 6;
                        int var20 = var16 >> 6;
                        if (class14.field135[var20][var19] == null) {
                            class14.field135[var20][var19] = new int[4096];
                        }
                        if ((arg0[var7][var16] & 0xFF) <= 0) {
                            class14.field135[var20][var19][class18.method90(var16 << 6, 4032) + class18.method90(var7, 63)] = 0;
                        } else {
                            class14.field135[var20][var19][class18.method90(4032, var16 << 6) + class18.method90(var7, 63)] = this.method46((double) var15 / 8533.0D, (byte) -47, (double) var14 / 8533.0D, (double) var13 / 8533.0D);
                        }
                    }
                }
            }
        }
    }
}
