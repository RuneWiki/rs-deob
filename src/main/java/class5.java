import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!c")
public class class5 {

    @OriginalMember(owner = "mapview!c", name = "b", descriptor = "I")
    private int field56 = 0;

    @OriginalMember(owner = "mapview!c", name = "g", descriptor = "[I")
    private int[] field61 = new int[1500];

    @OriginalMember(owner = "mapview!c", name = "c", descriptor = "[I")
    private int[] field57 = new int[1500];

    @OriginalMember(owner = "mapview!c", name = "j", descriptor = "[I")
    public int[] field64 = new int[1500];

    @OriginalMember(owner = "mapview!c", name = "d", descriptor = "[I")
    public int[] field58 = new int[1500];

    @OriginalMember(owner = "mapview!c", name = "m", descriptor = "[I")
    private int[] field67 = new int[1500];

    @OriginalMember(owner = "mapview!c", name = "n", descriptor = "[I")
    public int[] field68 = new int[1500];

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "Z")
    public static boolean field55 = true;

    @OriginalMember(owner = "mapview!c", name = "f", descriptor = "Lna;")
    public static class26 field60 = class6.method40("Apothecary", 48);

    @OriginalMember(owner = "mapview!c", name = "h", descriptor = "Lna;")
    public static class26 field62 = class6.method40("POH Portal", 48);

    @OriginalMember(owner = "mapview!c", name = "e", descriptor = "Lna;")
    public static class26 field59 = class6.method40("Chainmail Shop", 48);

    @OriginalMember(owner = "mapview!c", name = "k", descriptor = "Lna;")
    public static class26 field65 = class6.method40("Requesting", 48);

    @OriginalMember(owner = "mapview!c", name = "l", descriptor = "Lna;")
    public static class26 field66 = class6.method40("Overview", 48);

    @OriginalMember(owner = "mapview!c", name = "i", descriptor = "[Lna;")
    public static class26[] field63;

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(IIIIIIIIIIB)V", line = 16)
    public final void method26(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, byte arg10) {
        if (this.field56 == 0) {
            int var12 = arg9 - arg4;
            int var13 = arg3 - arg6;
            int var14 = (arg8 - arg5 << 16) / var13;
            int var15 = (arg0 - arg1 << 16) / var12;
            for (int var16 = 0; var16 < var13; var16++) {
                int var17 = (var16 + 1) * var14 >> 16;
                int var18 = var14 * var16 >> 16;
                int var19 = var17 - var18;
                if (var19 > 0) {
                    class31.method227(arg4, (byte) 106, arg6 + var16);
                    for (int var20 = 0; var20 < var12; var20++) {
                        int var21 = var15 * var20 >> 16;
                        int var22 = (var20 + 1) * var15 >> 16;
                        int var23 = var22 - var21;
                        if (var23 > 0) {
                            int var24 = class13.method78(false) & 0xFF;
                            if (var24 != 0) {
                                this.field61[this.field56] = var24 - 1;
                                this.field57[this.field56] = var18 + var19 / 2;
                                this.field67[this.field56] = var23 / 2 + var21;
                                this.field56++;
                            }
                        }
                        mapview.method170((byte) -78);
                    }
                }
            }
        }
        if (arg10 <= 89) {
            this.method37(1.7880440738638705D, 0.9263954464857368D, -0.06633061903115785D, -83);
        }
        for (int var25 = 0; var25 < this.field56; var25++) {
            if (mapview.field306[this.field61[var25]] != null) {
                mapview.field306[this.field61[var25]].method221(this.field57[var25] - 7, this.field67[var25] + -7);
            }
        }
        if (arg7 > 0) {
            for (int var26 = 0; var26 < this.field56; var26++) {
                if (this.field61[var26] == arg2) {
                    mapview.field306[this.field61[var26]].method221(this.field57[var26] - 7, this.field67[var26] + -7);
                    if (arg7 % 10 < 5) {
                        class15.method95(this.field57[var26], this.field67[var26], 15, 16776960, 128);
                        class15.method95(this.field57[var26], this.field67[var26], 7, 16777215, 256);
                    }
                }
            }
        }
        this.field56 = 0;
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "([BI)V", line = 131)
    private final void method27(byte[] arg0, int arg1) {
        int var3 = 0;
        if (arg1 != -1) {
            this.method30(-86, null);
        }
        while (true) {
            while (var3 < arg0.length) {
                int var4 = (arg0[var3++] & 0xFF) * 64 - class32.field418;
                int var5 = (arg0[var3++] & 0xFF) * 64 - class35.field453;
                if (var4 > 0 && var5 > 0 && class13.field160 > var4 + 64 && class34.field446 > var5 + 64) {
                    for (int var6 = 0; var6 < 64; var6++) {
                        int var7 = class34.field446 - var5 - 1;
                        for (int var8 = -64; var8 < 0; var8++) {
                            while (true) {
                                int var9 = arg0[var3++] & 0xFF;
                                if (var9 == 0) {
                                    break;
                                }
                                if (var9 < 29) {
                                    class1.method1((byte) var9, class34.field446 - var8 - var5 - 1 - 64, 0, -339164858, var4 + var6);
                                } else if (var9 < 160) {
                                    class1.method1((byte) (var9 - 28), class34.field446 - var8 - var5 - 64 - 1, 1, arg1 - 339164857, var4 - -var6);
                                } else {
                                    class1.method1((byte) (var9 - 159), class34.field446 - var5 - var8 - 65, 2, -339164858, var4 + var6);
                                    if (class12.field154 >= 1500) {
                                        break;
                                    }
                                    this.field64[class12.field154] = var4 + var6;
                                    this.field58[class12.field154] = var7;
                                    this.field68[class12.field154] = var9 - 160;
                                    class12.field154++;
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

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(I[[B[B)V", line = 239)
    private final void method28(int arg0, byte[][] arg1, byte[] arg2) {
        if (arg0 < 98) {
            return;
        }
        int var4 = 0;
        while (true) {
            while (var4 < arg2.length) {
                int var5 = (arg2[var4++] & 0xFF) * 64 - class32.field418;
                int var6 = (arg2[var4++] & 0xFF) * 64 - class35.field453;
                if (var5 > 0 && var6 > 0 && class13.field160 > var5 + 64 && class34.field446 > var6 + 64) {
                    for (int var7 = 0; var7 < 64; var7++) {
                        byte[] var8 = arg1[var5 + var7];
                        int var9 = class34.field446 - var6 - 1;
                        for (int var10 = -64; var10 < 0; var10++) {
                            var8[var9--] = arg2[var4++];
                        }
                    }
                } else {
                    var4 += 4096;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(I)V", line = 289)
    public static void method29(int arg0) {
        if (arg0 != -5628) {
            method29(2);
        }
        field62 = null;
        field59 = null;
        field63 = null;
        field66 = null;
        field65 = null;
        field60 = null;
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(ILda;)V", line = 324)
    public final void method30(int arg0, class8 arg1) {
        class10 var3 = new class10(arg1.method3((byte) 3, class2.field25, class10.field124));
        int var4 = var3.method68((byte) -87);
        int var5 = var3.method68((byte) 109);
        if (arg0 <= 31) {
            this.field56 = 3;
        }
        int var6 = var3.method68((byte) -38);
        int var7 = var3.method68((byte) 94);
        int var8 = var3.method68((byte) -51);
        int var9 = var3.method68((byte) 94);
        var3.method63(15596);
        class34.field446 = (var7 + 1 - var5) * 64;
        class35.field453 = var5 * 64;
        class32.field418 = var4 * 64;
        class23.field236 = var8 * 64 - class32.field418;
        class31.field400 = class35.field453 + class34.field446 - var9 * 64;
        class13.field160 = (var6 - var4) * 64 + 64;
        this.method36(class13.field160, class34.field446, (byte) -19);
        class10 var10 = new class10(arg1.method3((byte) 3, class9.field106, class10.field124));
        int var11 = var10.method68((byte) -53);
        class6.field73 = new int[var11 + 1];
        for (int var12 = 0; var12 < var11; var12++) {
            class6.field73[var12 + 1] = var10.method69((byte) 111);
        }
        int var13 = var10.method68((byte) -71);
        class34.field436 = new int[var13 + 1];
        for (int var14 = 0; var14 < var13; var14++) {
            class34.field436[var14 + 1] = var10.method69((byte) 107);
        }
        byte[] var15 = arg1.method3((byte) 3, class31.field405, class10.field124);
        byte[][] var16 = new byte[class13.field160][class34.field446];
        this.method28(124, var16, var15);
        byte[] var17 = arg1.method3((byte) 3, class33.field424, class10.field124);
        this.method38(var17, -74);
        byte[] var18 = arg1.method3((byte) 3, class38.field470, class10.field124);
        this.method39(var18, -5);
        byte[] var19 = arg1.method3((byte) 3, class6.field80, class10.field124);
        class12.field154 = 0;
        this.method27(var19, -1);
        this.method33(var16, -9590);
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(II[IIIIIIIZ)V", line = 399)
    private final void method31(int arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
        int var11 = class15.field175 - arg8;
        if (arg4 == 9) {
            arg5 = arg5 + 1 & 0x3;
            arg4 = 1;
        }
        if (arg4 == 10) {
            arg5 = arg5 + 3 & 0x3;
            arg4 = 1;
        }
        if (arg4 == 11) {
            arg4 = 8;
            arg5 = arg5 + 3 & 0x3;
        }
        if (arg4 == 1) {
            if (arg5 == 0) {
                for (int var68 = 0; var68 < arg1; var68++) {
                    for (int var69 = 0; var69 < arg8; var69++) {
                        if (var69 <= var68) {
                            arg2[arg6] = arg0;
                        } else if (arg9) {
                            arg2[arg6] = arg7;
                        }
                        arg6++;
                    }
                    arg6 += var11;
                }
            } else if (arg5 == 1) {
                for (int var74 = arg1 - 1; var74 >= 0; var74--) {
                    for (int var75 = 0; var75 < arg8; var75++) {
                        if (var74 >= var75) {
                            arg2[arg6] = arg0;
                        } else if (arg9) {
                            arg2[arg6] = arg7;
                        }
                        arg6++;
                    }
                    arg6 += var11;
                }
            } else if (arg5 == 2) {
                for (int var70 = 0; var70 < arg1; var70++) {
                    for (int var71 = 0; var71 < arg8; var71++) {
                        if (var70 <= var71) {
                            arg2[arg6] = arg0;
                        } else if (arg9) {
                            arg2[arg6] = arg7;
                        }
                        arg6++;
                    }
                    arg6 += var11;
                }
            } else if (arg5 == 3) {
                for (int var72 = arg1 - 1; var72 >= 0; var72--) {
                    for (int var73 = 0; var73 < arg8; var73++) {
                        if (var73 >= var72) {
                            arg2[arg6] = arg0;
                        } else if (arg9) {
                            arg2[arg6] = arg7;
                        }
                        arg6++;
                    }
                    arg6 += var11;
                }
            }
        } else if (arg4 != 2) {
            if (arg3 != 1) {
                this.method30(46, null);
            }
            if (arg4 == 3) {
                if (arg5 == 0) {
                    for (int var58 = arg1 - 1; var58 >= 0; var58--) {
                        for (int var59 = arg8 - 1; var59 >= 0; var59--) {
                            if (var58 >> 1 >= var59) {
                                arg2[arg6] = arg0;
                            } else if (arg9) {
                                arg2[arg6] = arg7;
                            }
                            arg6++;
                        }
                        arg6 += var11;
                    }
                } else if (arg5 == 1) {
                    for (int var56 = arg1 - 1; var56 >= 0; var56--) {
                        for (int var57 = 0; var57 < arg8; var57++) {
                            if (var56 << 1 <= var57) {
                                arg2[arg6] = arg0;
                            } else if (arg9) {
                                arg2[arg6] = arg7;
                            }
                            arg6++;
                        }
                        arg6 += var11;
                    }
                } else if (arg5 == 2) {
                    for (int var52 = 0; var52 < arg1; var52++) {
                        for (int var53 = 0; var53 < arg8; var53++) {
                            if (var53 <= var52 >> 1) {
                                arg2[arg6] = arg0;
                            } else if (arg9) {
                                arg2[arg6] = arg7;
                            }
                            arg6++;
                        }
                        arg6 += var11;
                    }
                } else if (arg5 == 3) {
                    for (int var54 = 0; var54 < arg1; var54++) {
                        for (int var55 = arg8 - 1; var55 >= 0; var55--) {
                            if (var54 << 1 <= var55) {
                                arg2[arg6] = arg0;
                            } else if (arg9) {
                                arg2[arg6] = arg7;
                            }
                            arg6++;
                        }
                        arg6 += var11;
                    }
                }
            } else if (arg4 == 4) {
                if (arg5 == 0) {
                    for (int var12 = arg1 - 1; var12 >= 0; var12--) {
                        for (int var13 = 0; var13 < arg8; var13++) {
                            if (var13 >= var12 >> 1) {
                                arg2[arg6] = arg0;
                            } else if (arg9) {
                                arg2[arg6] = arg7;
                            }
                            arg6++;
                        }
                        arg6 += var11;
                    }
                } else if (arg5 == 1) {
                    for (int var18 = 0; var18 < arg1; var18++) {
                        for (int var19 = 0; var19 < arg8; var19++) {
                            if (var18 << 1 >= var19) {
                                arg2[arg6] = arg0;
                            } else if (arg9) {
                                arg2[arg6] = arg7;
                            }
                            arg6++;
                        }
                        arg6 += var11;
                    }
                } else if (arg5 == 2) {
                    for (int var14 = 0; var14 < arg1; var14++) {
                        for (int var15 = arg8 - 1; var15 >= 0; var15--) {
                            if (var15 >= var14 >> 1) {
                                arg2[arg6] = arg0;
                            } else if (arg9) {
                                arg2[arg6] = arg7;
                            }
                            arg6++;
                        }
                        arg6 += var11;
                    }
                } else if (arg5 == 3) {
                    for (int var16 = arg1 - 1; var16 >= 0; var16--) {
                        for (int var17 = arg8 - 1; var17 >= 0; var17--) {
                            if (var17 <= var16 << 1) {
                                arg2[arg6] = arg0;
                            } else if (arg9) {
                                arg2[arg6] = arg7;
                            }
                            arg6++;
                        }
                        arg6 += var11;
                    }
                }
            } else if (arg4 != 5) {
                if (arg4 == 6) {
                    if (arg5 == 0) {
                        for (int var34 = 0; var34 < arg1; var34++) {
                            for (int var35 = 0; var35 < arg8; var35++) {
                                if (arg8 / 2 >= var35) {
                                    arg2[arg6] = arg0;
                                } else if (arg9) {
                                    arg2[arg6] = arg7;
                                }
                                arg6++;
                            }
                            arg6 += var11;
                        }
                        return;
                    }
                    if (arg5 == 1) {
                        for (int var32 = 0; var32 < arg1; var32++) {
                            for (int var33 = 0; var33 < arg8; var33++) {
                                if (var32 <= arg1 / 2) {
                                    arg2[arg6] = arg0;
                                } else if (arg9) {
                                    arg2[arg6] = arg7;
                                }
                                arg6++;
                            }
                            arg6 += var11;
                        }
                        return;
                    }
                    if (arg5 == 2) {
                        for (int var28 = 0; var28 < arg1; var28++) {
                            for (int var29 = 0; var29 < arg8; var29++) {
                                if (var29 >= arg8 / 2) {
                                    arg2[arg6] = arg0;
                                } else if (arg9) {
                                    arg2[arg6] = arg7;
                                }
                                arg6++;
                            }
                            arg6 += var11;
                        }
                        return;
                    }
                    if (arg5 == 3) {
                        for (int var30 = 0; var30 < arg1; var30++) {
                            for (int var31 = 0; var31 < arg8; var31++) {
                                if (arg1 / 2 <= var30) {
                                    arg2[arg6] = arg0;
                                } else if (arg9) {
                                    arg2[arg6] = arg7;
                                }
                                arg6++;
                            }
                            arg6 += var11;
                        }
                        return;
                    }
                }
                if (arg4 == 7) {
                    if (arg5 == 0) {
                        for (int var50 = 0; var50 < arg1; var50++) {
                            for (int var51 = 0; var51 < arg8; var51++) {
                                if (var51 <= var50 - arg1 / 2) {
                                    arg2[arg6] = arg0;
                                } else if (arg9) {
                                    arg2[arg6] = arg7;
                                }
                                arg6++;
                            }
                            arg6 += var11;
                        }
                        return;
                    }
                    if (arg5 == 1) {
                        for (int var36 = arg1 - 1; var36 >= 0; var36--) {
                            for (int var37 = 0; var37 < arg8; var37++) {
                                if (var36 - arg1 / 2 >= var37) {
                                    arg2[arg6] = arg0;
                                } else if (arg9) {
                                    arg2[arg6] = arg7;
                                }
                                arg6++;
                            }
                            arg6 += var11;
                        }
                        return;
                    }
                    if (arg5 == 2) {
                        for (int var38 = arg1 - 1; var38 >= 0; var38--) {
                            for (int var39 = arg8 - 1; var39 >= 0; var39--) {
                                if (var38 - arg1 / 2 >= var39) {
                                    arg2[arg6] = arg0;
                                } else if (arg9) {
                                    arg2[arg6] = arg7;
                                }
                                arg6++;
                            }
                            arg6 += var11;
                        }
                        return;
                    }
                    if (arg5 == 3) {
                        for (int var48 = 0; var48 < arg1; var48++) {
                            for (int var49 = arg8 - 1; var49 >= 0; var49--) {
                                if (var49 <= var48 - arg1 / 2) {
                                    arg2[arg6] = arg0;
                                } else if (arg9) {
                                    arg2[arg6] = arg7;
                                }
                                arg6++;
                            }
                            arg6 += var11;
                        }
                        return;
                    }
                }
                if (arg4 == 8) {
                    if (arg5 == 0) {
                        for (int var40 = 0; var40 < arg1; var40++) {
                            for (int var41 = 0; var41 < arg8; var41++) {
                                if (var40 - arg1 / 2 <= var41) {
                                    arg2[arg6] = arg0;
                                } else if (arg9) {
                                    arg2[arg6] = arg7;
                                }
                                arg6++;
                            }
                            arg6 += var11;
                        }
                        return;
                    }
                    if (arg5 == 1) {
                        for (int var42 = arg1 - 1; var42 >= 0; var42--) {
                            for (int var43 = 0; var43 < arg8; var43++) {
                                if (var42 - arg1 / 2 <= var43) {
                                    arg2[arg6] = arg0;
                                } else if (arg9) {
                                    arg2[arg6] = arg7;
                                }
                                arg6++;
                            }
                            arg6 += var11;
                        }
                        return;
                    }
                    if (arg5 == 2) {
                        for (int var44 = arg1 - 1; var44 >= 0; var44--) {
                            for (int var45 = arg8 - 1; var45 >= 0; var45--) {
                                if (var44 - arg1 / 2 <= var45) {
                                    arg2[arg6] = arg0;
                                } else if (arg9) {
                                    arg2[arg6] = arg7;
                                }
                                arg6++;
                            }
                            arg6 += var11;
                        }
                        return;
                    }
                    if (arg5 == 3) {
                        for (int var46 = 0; var46 < arg1; var46++) {
                            for (int var47 = arg8 - 1; var47 >= 0; var47--) {
                                if (var47 >= var46 - arg1 / 2) {
                                    arg2[arg6] = arg0;
                                } else if (arg9) {
                                    arg2[arg6] = arg7;
                                }
                                arg6++;
                            }
                            arg6 += var11;
                        }
                        return;
                    }
                }
            } else if (arg5 == 0) {
                for (int var26 = arg1 - 1; var26 >= 0; var26--) {
                    for (int var27 = arg8 - 1; var27 >= 0; var27--) {
                        if (var26 >> 1 <= var27) {
                            arg2[arg6] = arg0;
                        } else if (arg9) {
                            arg2[arg6] = arg7;
                        }
                        arg6++;
                    }
                    arg6 += var11;
                }
            } else if (arg5 == 1) {
                for (int var20 = arg1 - 1; var20 >= 0; var20--) {
                    for (int var21 = 0; var21 < arg8; var21++) {
                        if (var20 << 1 >= var21) {
                            arg2[arg6] = arg0;
                        } else if (arg9) {
                            arg2[arg6] = arg7;
                        }
                        arg6++;
                    }
                    arg6 += var11;
                }
            } else if (arg5 == 2) {
                for (int var24 = 0; var24 < arg1; var24++) {
                    for (int var25 = 0; var25 < arg8; var25++) {
                        if (var24 >> 1 <= var25) {
                            arg2[arg6] = arg0;
                        } else if (arg9) {
                            arg2[arg6] = arg7;
                        }
                        arg6++;
                    }
                    arg6 += var11;
                }
            } else if (arg5 == 3) {
                for (int var22 = 0; var22 < arg1; var22++) {
                    for (int var23 = arg8 - 1; var23 >= 0; var23--) {
                        if (var22 << 1 >= var23) {
                            arg2[arg6] = arg0;
                        } else if (arg9) {
                            arg2[arg6] = arg7;
                        }
                        arg6++;
                    }
                    arg6 += var11;
                }
            }
        } else if (arg5 == 0) {
            for (int var60 = arg1 - 1; var60 >= 0; var60--) {
                for (int var61 = 0; var61 < arg8; var61++) {
                    if (var60 >> 1 >= var61) {
                        arg2[arg6] = arg0;
                    } else if (arg9) {
                        arg2[arg6] = arg7;
                    }
                    arg6++;
                }
                arg6 += var11;
            }
        } else if (arg5 == 1) {
            for (int var66 = 0; var66 < arg1; var66++) {
                for (int var67 = 0; var67 < arg8; var67++) {
                    if (var66 << 1 <= var67) {
                        arg2[arg6] = arg0;
                    } else if (arg9) {
                        arg2[arg6] = arg7;
                    }
                    arg6++;
                }
                arg6 += var11;
            }
        } else if (arg5 == 2) {
            for (int var62 = 0; var62 < arg1; var62++) {
                for (int var63 = arg8 - 1; var63 >= 0; var63--) {
                    if (var63 <= var62 >> 1) {
                        arg2[arg6] = arg0;
                    } else if (arg9) {
                        arg2[arg6] = arg7;
                    }
                    arg6++;
                }
                arg6 += var11;
            }
        } else if (arg5 == 3) {
            for (int var64 = arg1 - 1; var64 >= 0; var64--) {
                for (int var65 = arg8 - 1; var65 >= 0; var65--) {
                    if (var64 << 1 <= var65) {
                        arg2[arg6] = arg0;
                    } else if (arg9) {
                        arg2[arg6] = arg7;
                    }
                    arg6++;
                }
                arg6 += var11;
            }
        }
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(IIIIBIIII)V", line = 1532)
    public final void method32(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8) {
        int var10 = arg6 - arg5;
        int var11 = arg2 - arg3;
        int var12 = (arg0 - arg1 << 16) / var10;
        int var13 = (arg8 - arg7 << 16) / var11;
        if (arg4 > -124) {
            this.field68 = null;
        }
        for (int var14 = 0; var14 < var10; var14++) {
            int var15 = (var14 + 1) * var12 >> 16;
            int var16 = var12 * var14 >> 16;
            int var17 = var15 - var16;
            if (var17 > 0) {
                int var18 = arg1 + var16;
                int var19 = arg1 + var15;
                class31.method227(arg3, (byte) -18, arg5 + var14);
                for (int var20 = 0; var20 < var11; var20++) {
                    int var21 = var13 * var20 >> 16;
                    int var22 = (var20 + 1) * var13 >> 16;
                    int var23 = var22 - var21;
                    if (var23 > 0) {
                        int var24 = arg7 + var21;
                        int var25 = arg7 + var22;
                        int var26 = class6.method43(2);
                        int var27 = class8.method53(10735);
                        if (var26 == 0 && var27 == 0) {
                            class15.method94(var18, var24, var19 - var18, -var24 + var25, class35.method250(-14583));
                        } else {
                            byte var28 = class33.method232(-1);
                            int var29 = var28 & 0xFC;
                            if (var29 == 0 || var17 <= 1 || var23 <= 1) {
                                class15.method94(var18, var24, var17, var23, var26);
                            } else {
                                this.method31(var26, var23, class15.field172, 1, var29 >> 2, var28 & 0x3, class15.field175 * var24 + var18, class35.method250(-14583), var17, true);
                            }
                            if (var27 > 0) {
                                byte var30 = class7.method49((byte) 100);
                                int var31 = var30 & 0xFC;
                                if (var31 == 0 || var17 <= 1 || var23 <= 1) {
                                    class15.method94(var18, var24, var17, var23, var27);
                                }
                                this.method31(var27, var23, class15.field172, 1, var31 >> 2, var30 & 0x3, class15.field175 * var24 + var18, class35.method250(-14583), var17, var26 == 0);
                            }
                        }
                    }
                    mapview.method170((byte) 43);
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "([[BI)V", line = 1623)
    private final void method33(byte[][] arg0, int arg1) {
        int var3 = class13.field160;
        int var4 = class34.field446;
        int[] var5 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var5[var6] = 0;
        }
        for (int var7 = 5; var7 < var3 - 5; var7++) {
            byte[] var8 = arg0[var7 + 5];
            byte[] var9 = arg0[var7 - 5];
            for (int var10 = 0; var10 < var4; var10++) {
                int var11 = class6.field73[var8[var10] & 0xFF];
                int var12 = class6.field73[var9[var10] & 0xFF];
                if (var11 <= 0 && class35.method248(var10, var7 + 5, arg1 ^ 0x2507) > 0) {
                    var11 = 64;
                }
                if (var12 <= 0 && class35.method248(var10, var7 - 5, -95) > 0) {
                    var12 = 64;
                }
                var5[var10] += var11 - var12;
            }
            if (var7 > 10 && var7 < var3 - 10) {
                int var13 = 0;
                int var14 = 0;
                int var15 = 0;
                for (int var16 = 5; var16 < var4 - 5; var16++) {
                    int var17 = var5[var16 + 5];
                    int var18 = var5[var16 - 5];
                    var15 += (var17 & 0x3FF) - (var18 & 0x3FF);
                    var14 += (var17 >> 10 & 0x3FF) - ((var18 & 0xFFF27) >> 10);
                    var13 += (var17 >> 20) - (var18 >> 20);
                    if (var15 > 0) {
                        int var19 = var7 >> 6;
                        int var20 = var16 >> 6;
                        if (class26.field372[var20][var19] == null) {
                            class26.field372[var20][var19] = new int[4096];
                        }
                        if ((arg0[var7][var16] & 0xFF) <= 0) {
                            class26.field372[var20][var19][class8.method51(63, var7) + (class8.method51(var16, 63) << 6)] = 0;
                        } else {
                            class26.field372[var20][var19][class8.method51(63, var7) + class8.method51(4032, var16 << 6)] = this.method37((double) var14 / 8533.0D, (double) var15 / 8533.0D, (double) var13 / 8533.0D, 109);
                        }
                    }
                }
            }
        }
        if (arg1 != -9590) {
            this.field67 = null;
        }
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(IIIIIIIII)V", line = 1722)
    public final void method34(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field56 = 0;
        if (arg1 != 2) {
            return;
        }
        int var10 = arg0 - arg6;
        int var11 = arg5 - arg8;
        int var12 = (arg7 - arg3 << 16) / var10;
        int var13 = (arg4 - arg2 << 16) / var11;
        for (int var14 = 0; var14 < var11; var14++) {
            int var15 = var13 * var14 >> 16;
            int var16 = (var14 + 1) * var13 >> 16;
            int var17 = var16 - var15;
            if (var17 > 0) {
                class31.method227(arg6, (byte) 115, arg8 + var14);
                for (int var18 = 0; var18 < var10; var18++) {
                    int var19 = var12 * var18 >> 16;
                    int var20 = (var18 + 1) * var12 >> 16;
                    int var21 = var20 - var19;
                    if (var21 > 0) {
                        int var22 = class8.method50(true) & 0xFF;
                        if (var22 != 0) {
                            int var23;
                            if (var21 == 1) {
                                var23 = var19;
                            } else {
                                var23 = var20 - 1;
                            }
                            int var24 = 13421772;
                            if (var22 >= 5 && var22 <= 8 || var22 >= 13 && var22 <= 16 || var22 >= 21 && var22 <= 24 || var22 == 27 || var22 == 28) {
                                var22 -= 4;
                                var24 = 13369344;
                            }
                            int var25;
                            if (var17 == 1) {
                                var25 = var15;
                            } else {
                                var25 = var16 - 1;
                            }
                            if (var22 == 1) {
                                class15.method88(var15, var19, var21, var24);
                            } else if (var22 == 2) {
                                class15.method98(var15, var19, var17, var24);
                            } else if (var22 == 3) {
                                class15.method88(var25, var19, var21, var24);
                            } else if (var22 == 4) {
                                class15.method98(var15, var23, var17, var24);
                            } else if (var22 == 9) {
                                class15.method88(var15, var19, var21, 16777215);
                                class15.method98(var15, var19, var17, var24);
                            } else if (var22 == 10) {
                                class15.method88(var25, var19, var21, 16777215);
                                class15.method98(var15, var19, var17, var24);
                            } else if (var22 == 11) {
                                class15.method88(var25, var19, var21, 16777215);
                                class15.method98(var15, var23, var17, var24);
                            } else if (var22 == 12) {
                                class15.method88(var15, var19, var21, 16777215);
                                class15.method98(var15, var23, var17, var24);
                            } else if (var22 == 17) {
                                class15.method98(var15, var19, 1, var24);
                            } else if (var22 == 18) {
                                class15.method98(var25, var19, 1, var24);
                            } else if (var22 == 19) {
                                class15.method98(var25, var23, 1, var24);
                            } else if (var22 == 20) {
                                class15.method98(var15, var23, 1, var24);
                            } else if (var22 == 25) {
                                for (int var27 = 0; var27 < var21; var27++) {
                                    class15.method98(var15 + var27, -var27 + var23, 1, var24);
                                }
                            } else if (var22 == 26) {
                                for (int var26 = 0; var26 < var21; var26++) {
                                    class15.method98(var15 + var26, var19 + var26, 1, var24);
                                }
                            }
                        }
                        int var28 = class13.method78(false) & 0xFF;
                        if (var28 != 0) {
                            this.field61[this.field56] = var28 - 1;
                            this.field57[this.field56] = var15 + var17 / 2;
                            this.field67[this.field56] = var21 / 2 + var19;
                            this.field56++;
                        }
                    }
                    mapview.method170((byte) -97);
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(IIIIDIIIII)V", line = 1904)
    public final void method35(int arg0, int arg1, int arg2, int arg3, double arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var12 = arg3 - arg7;
        int var13 = arg1 - arg8;
        int var14 = (arg6 - arg0 << 16) / var13;
        int var15 = (arg9 - arg5 << 16) / var12;
        if (arg1 - arg8 > arg6 - arg0) {
            return;
        }
        this.field56 = 0;
        for (int var16 = 0; var16 < var13; var16++) {
            int var17 = var14 * var16 >> 16;
            int var18 = (var16 + 1) * var14 >> 16;
            int var19 = var18 - var17;
            if (var19 > 0) {
                class31.method227(arg7, (byte) 115, arg8 + var16);
                for (int var20 = 0; var20 < var12; var20++) {
                    int var21 = var15 * var20 >> 16;
                    int var22 = (var20 + 1) * var15 >> 16;
                    int var23 = var22 - var21;
                    if (var23 > 0) {
                        int var24 = class21.method125(true) & 0xFF;
                        if (var24 != 0) {
                            if (var24 == 47 || var24 == 53) {
                                class1.field19[var24 - 1].method199(var17, var21, var19 * 2 + 1, var23 * 2 + 1);
                                if (!(arg4 < 4.0D) && arg4 > 4.2D && arg4 > 6.2D) {
                                }
                            } else {
                                class1.field19[var24 - 1].method199(var17 - var19 / 2, -(var23 / 2) + var21, var19 * 2, var23 * 2);
                            }
                        }
                    }
                    mapview.method170((byte) 119);
                }
            }
        }
        if (arg2 != 1758997384) {
            this.field56 = -21;
        }
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(IIB)V", line = 2029)
    private final void method36(int arg0, int arg1, byte arg2) {
        int var4 = arg1 >> 6;
        int var5 = arg0 >> 6;
        class7.field88[1] = new byte[var4][var5][];
        class12.field146 = new class4[var4][var5];
        class26.field372 = new int[var4][var5][];
        class7.field88[0] = new byte[var4][var5][];
        class7.field88[3] = new byte[var4][var5][];
        class34.field447 = new class4[var4][var5];
        if (arg2 != -19) {
            this.field58 = null;
        }
        class7.field88[4] = new byte[var4][var5][];
        class7.field88[2] = new byte[var4][var5][];
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(DDDI)I", line = 2051)
    private final int method37(double arg0, double arg1, double arg2, int arg3) {
        if (arg3 < 101) {
            return 13;
        }
        double var8 = arg1;
        double var10 = arg1;
        double var12 = arg1;
        if (arg0 != 0.0D) {
            double var14;
            if (arg1 < 0.5D) {
                var14 = (arg0 + 1.0D) * arg1;
            } else {
                var14 = arg0 + arg1 - arg0 * arg1;
            }
            double var16 = arg2 + 0.3333333333333333D;
            if (var16 > 1.0D) {
                var16--;
            }
            double var18 = arg1 * 2.0D - var14;
            if (var16 * 6.0D < 1.0D) {
                var8 = (var14 - var18) * 6.0D * var16 + var18;
            } else if (var16 * 2.0D < 1.0D) {
                var8 = var14;
            } else if (var16 * 3.0D < 2.0D) {
                var8 = (var14 - var18) * (0.6666666666666666D - var16) * 6.0D + var18;
            } else {
                var8 = var18;
            }
            double var22 = arg2 - 0.3333333333333333D;
            if (arg2 * 6.0D < 1.0D) {
                var10 = (var14 - var18) * 6.0D * arg2 + var18;
            } else if (arg2 * 2.0D < 1.0D) {
                var10 = var14;
            } else if (arg2 * 3.0D < 2.0D) {
                var10 = (var14 - var18) * (-arg2 + 0.6666666666666666D) * 6.0D + var18;
            } else {
                var10 = var18;
            }
            if (var22 < 0.0D) {
                var22++;
            }
            if (var22 * 6.0D < 1.0D) {
                var12 = (var14 - var18) * 6.0D * var22 + var18;
            } else if (var22 * 2.0D < 1.0D) {
                var12 = var14;
            } else if (var22 * 3.0D < 2.0D) {
                var12 = (0.6666666666666666D - var22) * (-var18 + var14) * 6.0D + var18;
            } else {
                var12 = var18;
            }
        }
        int var24 = (int) (var8 * 256.0D);
        int var25 = (int) (var10 * 256.0D);
        int var26 = (int) (var12 * 256.0D);
        return (var24 << 16) + (var25 << 8) + var26;
    }

    @OriginalMember(owner = "mapview!c", name = "b", descriptor = "([BI)V", line = 2140)
    private final void method38(byte[] arg0, int arg1) {
        int var3 = 102 / ((arg1 - 65) / 58);
        int var4 = 0;
        while (true) {
            while (var4 < arg0.length) {
                int var5 = (arg0[var4++] & 0xFF) * 64 - class32.field418;
                int var6 = (arg0[var4++] & 0xFF) * 64 - class35.field453;
                if (var5 > 0 && var6 > 0 && class13.field160 > var5 + 64 && class34.field446 > var6 + 64) {
                    class34.field439 = var5 >> 6;
                    class1.field20 = class34.field446 - var6 - 1 >> 6;
                    for (int var7 = 0; var7 < 64; var7++) {
                        for (int var8 = -64; var8 < 0; var8++) {
                            int var9 = arg0[var4++] & 0xFF;
                            if (var9 != 0) {
                                byte var10 = arg0[var4++];
                                class1.method1(var10, class34.field446 - var6 - var8 - 65, 3, -339164858, var5 + var7);
                                if (class34.field447[class1.field20][class34.field439] == null) {
                                    class34.field447[class1.field20][class34.field439] = new class4();
                                    class34.field447[class1.field20][class34.field439].field49 = new byte[4096];
                                }
                                class34.field447[class1.field20][class34.field439].field49[(-(var8 + 1) << 6) + var7] = (byte) var9;
                            }
                        }
                    }
                    if (class34.field447[class1.field20][class34.field439] != null) {
                        class34.field447[class1.field20][class34.field439].method24(112);
                    }
                } else {
                    for (int var11 = -4096; var11 < 0; var11++) {
                        byte var12 = arg0[var4++];
                        if (var12 != 0) {
                            var4++;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "mapview!c", name = "c", descriptor = "([BI)V", line = 2222)
    private final void method39(byte[] arg0, int arg1) {
        int var3 = 0;
        if (arg1 != -5) {
            return;
        }
        while (true) {
            while (arg0.length > var3) {
                int var4 = (arg0[var3++] & 0xFF) * 64 - class32.field418;
                int var5 = (arg0[var3++] & 0xFF) * 64 - class35.field453;
                if (var4 > 0 && var5 > 0 && class13.field160 > var4 + 64 && var5 + 64 < class34.field446) {
                    class34.field439 = var4 >> 6;
                    class1.field20 = class34.field446 - var5 - 1 >> 6;
                    for (int var6 = 0; var6 < 64; var6++) {
                        for (int var7 = -64; var7 < 0; var7++) {
                            int var8 = arg0[var3++] & 0xFF;
                            if (var8 != 0) {
                                byte var9 = arg0[var3++];
                                class1.method1(var9, class34.field446 - var5 - var7 - 64 - 1, 4, arg1 - 339164853, var4 - -var6);
                                if (class12.field146[class1.field20][class34.field439] == null) {
                                    class12.field146[class1.field20][class34.field439] = new class4();
                                    class12.field146[class1.field20][class34.field439].field49 = new byte[4096];
                                }
                                class12.field146[class1.field20][class34.field439].field49[(-(var7 + 1) << 6) + var6] = (byte) var8;
                            }
                        }
                    }
                    if (class12.field146[class1.field20][class34.field439] != null) {
                        class12.field146[class1.field20][class34.field439].method24(107);
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
}
