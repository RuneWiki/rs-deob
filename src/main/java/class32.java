import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!q")
public class class32 {

    @OriginalMember(owner = "mapview!q", name = "i", descriptor = "[I")
    public int[] field412 = new int[1500];

    @OriginalMember(owner = "mapview!q", name = "f", descriptor = "[I")
    private int[] field409 = new int[1500];

    @OriginalMember(owner = "mapview!q", name = "c", descriptor = "[I")
    private int[] field406 = new int[1500];

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "[I")
    public int[] field404 = new int[1500];

    @OriginalMember(owner = "mapview!q", name = "b", descriptor = "I")
    private int field405 = 0;

    @OriginalMember(owner = "mapview!q", name = "m", descriptor = "[I")
    private int[] field416 = new int[1500];

    @OriginalMember(owner = "mapview!q", name = "n", descriptor = "[I")
    public int[] field417 = new int[1500];

    @OriginalMember(owner = "mapview!q", name = "d", descriptor = "Lba;")
    public static class4 field407 = class14.method105((byte) -98, "Dungeon");

    @OriginalMember(owner = "mapview!q", name = "e", descriptor = "Lba;")
    public static class4 field408 = class14.method105((byte) -96, "Hair Dressers");

    @OriginalMember(owner = "mapview!q", name = "g", descriptor = "Lba;")
    public static class4 field410 = class14.method105((byte) -91, "Loading )3)3)3");

    @OriginalMember(owner = "mapview!q", name = "k", descriptor = "Lba;")
    public static class4 field414 = class14.method105((byte) -88, "Clothes Shop");

    @OriginalMember(owner = "mapview!q", name = "h", descriptor = "I")
    public static int field411;

    @OriginalMember(owner = "mapview!q", name = "j", descriptor = "I")
    public static int field413;

    @OriginalMember(owner = "mapview!q", name = "l", descriptor = "I")
    public static int field415;

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "(Z)Lka;", line = 4)
    public static final class21 method195(boolean arg0) {
        if (arg0) {
            class21 var1 = new class21(class24.field291, class5.field104, class29.field370, class22.field274, class9.field149);
            class35.method224(-6063);
            return var1;
        } else {
            return (class21) null;
        }
    }

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "(IIIIIZIII)V", line = 21)
    public final void method196(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8) {
        if (!arg5) {
            method209(-4);
        }
        int var10 = arg6 - arg2;
        this.field405 = 0;
        int var11 = arg7 - arg4;
        int var12 = (arg1 - arg0 << 16) / var11;
        int var13 = (arg3 - arg8 << 16) / var10;
        for (int var14 = 0; var14 < var10; var14++) {
            int var15 = var13 * var14 >> 16;
            int var16 = (var14 + 1) * var13 >> 16;
            int var17 = var16 - var15;
            if (var17 > 0) {
                class20.method138(var14 + arg2, arg4, 14209);
                for (int var18 = 0; var18 < var11; var18++) {
                    int var19 = (var18 + 1) * var12 >> 16;
                    int var20 = var12 * var18 >> 16;
                    int var21 = var19 - var20;
                    if (var21 > 0) {
                        int var22 = class35.method222(-18807) & 0xFF;
                        if (var22 != 0) {
                            int var23;
                            if (var17 == 1) {
                                var23 = var15;
                            } else {
                                var23 = var16 - 1;
                            }
                            int var24;
                            if (var21 == 1) {
                                var24 = var20;
                            } else {
                                var24 = var19 - 1;
                            }
                            int var25 = 13421772;
                            if (var22 >= 5 && var22 <= 8 || var22 >= 13 && var22 <= 16 || var22 >= 21 && var22 <= 24 || var22 == 27 || var22 == 28) {
                                var22 -= 4;
                                var25 = 13369344;
                            }
                            if (var22 == 1) {
                                class37.method239(var15, var20, var21, var25);
                            } else if (var22 == 2) {
                                class37.method234(var15, var20, var17, var25);
                            } else if (var22 == 3) {
                                class37.method239(var23, var20, var21, var25);
                            } else if (var22 == 4) {
                                class37.method234(var15, var24, var17, var25);
                            } else if (var22 == 9) {
                                class37.method239(var15, var20, var21, 16777215);
                                class37.method234(var15, var20, var17, var25);
                            } else if (var22 == 10) {
                                class37.method239(var23, var20, var21, 16777215);
                                class37.method234(var15, var20, var17, var25);
                            } else if (var22 == 11) {
                                class37.method239(var23, var20, var21, 16777215);
                                class37.method234(var15, var24, var17, var25);
                            } else if (var22 == 12) {
                                class37.method239(var15, var20, var21, 16777215);
                                class37.method234(var15, var24, var17, var25);
                            } else if (var22 == 17) {
                                class37.method234(var15, var20, 1, var25);
                            } else if (var22 == 18) {
                                class37.method234(var23, var20, 1, var25);
                            } else if (var22 == 19) {
                                class37.method234(var23, var24, 1, var25);
                            } else if (var22 == 20) {
                                class37.method234(var15, var24, 1, var25);
                            } else if (var22 == 25) {
                                for (int var27 = 0; var27 < var21; var27++) {
                                    class37.method234(var15 + var27, -var27 + var24, 1, var25);
                                }
                            } else if (var22 == 26) {
                                for (int var26 = 0; var26 < var21; var26++) {
                                    class37.method234(var15 + var26, var20 + var26, 1, var25);
                                }
                            }
                        }
                        int var28 = class31.method193(true) & 0xFF;
                        if (var28 != 0) {
                            this.field416[this.field405] = var28 - 1;
                            this.field409[this.field405] = var15 + var17 / 2;
                            this.field406[this.field405] = var20 + var21 / 2;
                            this.field405++;
                        }
                    }
                    class4.method37(arg5);
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "(BII)V", line = 207)
    private final void method197(byte arg0, int arg1, int arg2) {
        int var4 = arg2 >> 6;
        if (arg0 < 58) {
            return;
        }
        int var5 = arg1 >> 6;
        class13.field180[0] = new byte[var5][var4][];
        class13.field180[1] = new byte[var5][var4][];
        class13.field180[2] = new byte[var5][var4][];
        class13.field180[3] = new byte[var5][var4][];
        class13.field180[4] = new byte[var5][var4][];
        class17.field215 = new class29[var5][var4];
        class31.field393 = new class29[var5][var4];
        class23.field286 = new int[var5][var4][];
    }

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "(Z[[B)V", line = 228)
    private final void method198(boolean arg0, byte[][] arg1) {
        if (!arg0) {
            return;
        }
        int var3 = class13.field183;
        int var4 = field411;
        int[] var5 = new int[var3];
        for (int var6 = 0; var6 < var3; var6++) {
            var5[var6] = 0;
        }
        for (int var7 = 5; var7 < var4 - 5; var7++) {
            byte[] var8 = arg1[var7 - 5];
            byte[] var9 = arg1[var7 + 5];
            for (int var10 = 0; var10 < var3; var10++) {
                int var11 = class13.field181[var9[var10] & 0xFF];
                int var12 = class13.field181[var8[var10] & 0xFF];
                if (var11 <= 0 && class30.method187(var7 + 5, 15956, var10) > 0) {
                    var11 = 64;
                }
                if (var12 <= 0 && class30.method187(var7 - 5, 15956, var10) > 0) {
                    var12 = 64;
                }
                var5[var10] += var11 - var12;
            }
            if (var7 > 10 && var7 < var4 - 10) {
                int var13 = 0;
                int var14 = 0;
                int var15 = 0;
                for (int var16 = 5; var16 < var3 - 5; var16++) {
                    int var17 = var5[var16 + 5];
                    int var18 = var5[var16 - 5];
                    var15 += (var17 & 0x3FF) - (var18 & 0x3FF);
                    var14 += (var17 >> 10 & 0x3FF) - (var18 >> 10 & 0x3FF);
                    var13 += (var17 >> 20) - (var18 >> 20);
                    if (var15 > 0) {
                        int var19 = var16 >> 6;
                        int var20 = var7 >> 6;
                        if (class23.field286[var19][var20] == null) {
                            class23.field286[var19][var20] = new int[4096];
                        }
                        if ((arg1[var7][var16] & 0xFF) > 0) {
                            class23.field286[var19][var20][(class3.method25(var16, 63) << 6) + class3.method25(var7, 63)] = this.method207((double) var15 / 8533.0D, (double) var14 / 8533.0D, 3, (double) var13 / 8533.0D);
                        } else {
                            class23.field286[var19][var20][class3.method25(63, var7) + (class3.method25(var16, 63) << 6)] = 0;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "(I[B)V", line = 337)
    private final void method199(int arg0, byte[] arg1) {
        if (arg0 != 1682) {
            this.method196(-19, -50, -75, -39, 56, true, 95, -115, -76);
        }
        int var3 = 0;
        while (true) {
            while (arg1.length > var3) {
                int var4 = (arg1[var3++] & 0xFF) * 64 - class27.field318;
                int var5 = (arg1[var3++] & 0xFF) * 64 - class1.field67;
                if (var4 > 0 && var5 > 0 && field411 > var4 + 64 && var5 + 64 < class13.field183) {
                    for (int var6 = 0; var6 < 64; var6++) {
                        int var7 = class13.field183 - var5 - 1;
                        for (int var8 = -64; var8 < 0; var8++) {
                            while (true) {
                                int var9 = arg1[var3++] & 0xFF;
                                if (var9 == 0) {
                                    break;
                                }
                                if (var9 < 29) {
                                    class31.method194(class13.field183 - var5 - var8 - 64 - 1, (byte) var9, 0, (byte) 98, var4 + var6);
                                } else if (var9 < 160) {
                                    class31.method194(class13.field183 - var5 - var8 - 64 - 1, (byte) (var9 + -28), 1, (byte) 67, var4 + var6);
                                } else {
                                    class31.method194(class13.field183 - var8 - var5 - 64 - 1, (byte) (var9 + -159), 2, (byte) 83, var4 + var6);
                                    if (class35.field436 >= 1500) {
                                        break;
                                    }
                                    this.field404[class35.field436] = var6 + var4;
                                    this.field417[class35.field436] = var7;
                                    this.field412[class35.field436] = var9 - 160;
                                    class35.field436++;
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
                                var12 = arg1[var3++];
                            } while (var12 != 0);
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "([BB[[B)V", line = 442)
    private final void method200(byte[] arg0, byte arg1, byte[][] arg2) {
        if (arg1 <= 126) {
            field407 = null;
        }
        int var4 = 0;
        while (true) {
            while (var4 < arg0.length) {
                int var5 = (arg0[var4++] & 0xFF) * 64 - class27.field318;
                int var6 = (arg0[var4++] & 0xFF) * 64 - class1.field67;
                if (var5 > 0 && var6 > 0 && var5 + 64 < field411 && var6 + 64 < class13.field183) {
                    for (int var7 = 0; var7 < 64; var7++) {
                        byte[] var8 = arg2[var7 + var5];
                        int var9 = class13.field183 - var6 - 1;
                        for (int var10 = -64; var10 < 0; var10++) {
                            var8[var9--] = arg0[var4++];
                        }
                    }
                } else {
                    var4 += 4096;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "(IIIIZ[IIIII)V", line = 497)
    private final void method201(int arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg7 == 9) {
            arg1 = arg1 + 1 & 0x3;
            arg7 = 1;
        }
        if (arg7 == 10) {
            arg1 = arg1 + 3 & 0x3;
            arg7 = 1;
        }
        int var11 = class37.field456 - arg9;
        if (arg7 == 11) {
            arg1 = arg1 + 3 & 0x3;
            arg7 = 8;
        }
        if (arg7 == 1) {
            if (arg1 == 0) {
                for (int var68 = 0; var68 < arg3; var68++) {
                    for (int var69 = 0; var69 < arg9; var69++) {
                        if (var69 <= var68) {
                            arg5[arg0] = arg2;
                        } else if (arg4) {
                            arg5[arg0] = arg8;
                        }
                        arg0++;
                    }
                    arg0 += var11;
                }
            } else if (arg1 == 1) {
                for (int var70 = arg3 - 1; var70 >= 0; var70--) {
                    for (int var71 = 0; var71 < arg9; var71++) {
                        if (var70 >= var71) {
                            arg5[arg0] = arg2;
                        } else if (arg4) {
                            arg5[arg0] = arg8;
                        }
                        arg0++;
                    }
                    arg0 += var11;
                }
            } else if (arg1 == 2) {
                for (int var72 = 0; var72 < arg3; var72++) {
                    for (int var73 = 0; var73 < arg9; var73++) {
                        if (var72 <= var73) {
                            arg5[arg0] = arg2;
                        } else if (arg4) {
                            arg5[arg0] = arg8;
                        }
                        arg0++;
                    }
                    arg0 += var11;
                }
            } else if (arg1 == 3) {
                for (int var74 = arg3 - 1; var74 >= 0; var74--) {
                    for (int var75 = 0; var75 < arg9; var75++) {
                        if (var74 <= var75) {
                            arg5[arg0] = arg2;
                        } else if (arg4) {
                            arg5[arg0] = arg8;
                        }
                        arg0++;
                    }
                    arg0 += var11;
                }
            }
        } else if (arg7 == 2) {
            if (arg1 == 0) {
                for (int var60 = arg3 - 1; var60 >= 0; var60--) {
                    for (int var61 = 0; var61 < arg9; var61++) {
                        if (var61 <= var60 >> 1) {
                            arg5[arg0] = arg2;
                        } else if (arg4) {
                            arg5[arg0] = arg8;
                        }
                        arg0++;
                    }
                    arg0 += var11;
                }
            } else if (arg1 == 1) {
                for (int var66 = 0; var66 < arg3; var66++) {
                    for (int var67 = 0; var67 < arg9; var67++) {
                        if (var66 << 1 <= var67) {
                            arg5[arg0] = arg2;
                        } else if (arg4) {
                            arg5[arg0] = arg8;
                        }
                        arg0++;
                    }
                    arg0 += var11;
                }
            } else if (arg1 == 2) {
                for (int var62 = 0; var62 < arg3; var62++) {
                    for (int var63 = arg9 - 1; var63 >= 0; var63--) {
                        if (var63 <= var62 >> 1) {
                            arg5[arg0] = arg2;
                        } else if (arg4) {
                            arg5[arg0] = arg8;
                        }
                        arg0++;
                    }
                    arg0 += var11;
                }
            } else if (arg1 == 3) {
                for (int var64 = arg3 - 1; var64 >= 0; var64--) {
                    for (int var65 = arg9 - 1; var65 >= 0; var65--) {
                        if (var64 << 1 <= var65) {
                            arg5[arg0] = arg2;
                        } else if (arg4) {
                            arg5[arg0] = arg8;
                        }
                        arg0++;
                    }
                    arg0 += var11;
                }
            }
        } else if (arg7 == 3) {
            if (arg1 == 0) {
                for (int var18 = arg3 - 1; var18 >= 0; var18--) {
                    for (int var19 = arg9 - 1; var19 >= 0; var19--) {
                        if (var19 <= var18 >> 1) {
                            arg5[arg0] = arg2;
                        } else if (arg4) {
                            arg5[arg0] = arg8;
                        }
                        arg0++;
                    }
                    arg0 += var11;
                }
            } else if (arg1 == 1) {
                for (int var16 = arg3 - 1; var16 >= 0; var16--) {
                    for (int var17 = 0; var17 < arg9; var17++) {
                        if (var16 << 1 <= var17) {
                            arg5[arg0] = arg2;
                        } else if (arg4) {
                            arg5[arg0] = arg8;
                        }
                        arg0++;
                    }
                    arg0 += var11;
                }
            } else if (arg1 == 2) {
                for (int var12 = 0; var12 < arg3; var12++) {
                    for (int var13 = 0; var13 < arg9; var13++) {
                        if (var13 <= var12 >> 1) {
                            arg5[arg0] = arg2;
                        } else if (arg4) {
                            arg5[arg0] = arg8;
                        }
                        arg0++;
                    }
                    arg0 += var11;
                }
            } else if (arg1 == 3) {
                for (int var14 = 0; var14 < arg3; var14++) {
                    for (int var15 = arg9 - 1; var15 >= 0; var15--) {
                        if (var14 << 1 <= var15) {
                            arg5[arg0] = arg2;
                        } else if (arg4) {
                            arg5[arg0] = arg8;
                        }
                        arg0++;
                    }
                    arg0 += var11;
                }
            }
        } else if (arg7 == 4) {
            if (arg1 == 0) {
                for (int var58 = arg3 - 1; var58 >= 0; var58--) {
                    for (int var59 = 0; var59 < arg9; var59++) {
                        if (var59 >= var58 >> 1) {
                            arg5[arg0] = arg2;
                        } else if (arg4) {
                            arg5[arg0] = arg8;
                        }
                        arg0++;
                    }
                    arg0 += var11;
                }
            } else if (arg1 == 1) {
                for (int var52 = 0; var52 < arg3; var52++) {
                    for (int var53 = 0; var53 < arg9; var53++) {
                        if (var52 << 1 >= var53) {
                            arg5[arg0] = arg2;
                        } else if (arg4) {
                            arg5[arg0] = arg8;
                        }
                        arg0++;
                    }
                    arg0 += var11;
                }
            } else if (arg1 == 2) {
                for (int var54 = 0; var54 < arg3; var54++) {
                    for (int var55 = arg9 - 1; var55 >= 0; var55--) {
                        if (var54 >> 1 <= var55) {
                            arg5[arg0] = arg2;
                        } else if (arg4) {
                            arg5[arg0] = arg8;
                        }
                        arg0++;
                    }
                    arg0 += var11;
                }
            } else if (arg1 == 3) {
                for (int var56 = arg3 - 1; var56 >= 0; var56--) {
                    for (int var57 = arg9 - 1; var57 >= 0; var57--) {
                        if (var57 <= var56 << 1) {
                            arg5[arg0] = arg2;
                        } else if (arg4) {
                            arg5[arg0] = arg8;
                        }
                        arg0++;
                    }
                    arg0 += var11;
                }
            }
        } else if (arg7 != 5) {
            if (arg7 == 6) {
                if (arg1 == 0) {
                    for (int var50 = 0; var50 < arg3; var50++) {
                        for (int var51 = 0; var51 < arg9; var51++) {
                            if (var51 <= arg9 / 2) {
                                arg5[arg0] = arg2;
                            } else if (arg4) {
                                arg5[arg0] = arg8;
                            }
                            arg0++;
                        }
                        arg0 += var11;
                    }
                    return;
                }
                if (arg1 == 1) {
                    for (int var28 = 0; var28 < arg3; var28++) {
                        for (int var29 = 0; var29 < arg9; var29++) {
                            if (arg3 / 2 >= var28) {
                                arg5[arg0] = arg2;
                            } else if (arg4) {
                                arg5[arg0] = arg8;
                            }
                            arg0++;
                        }
                        arg0 += var11;
                    }
                    return;
                }
                if (arg1 == 2) {
                    for (int var48 = 0; var48 < arg3; var48++) {
                        for (int var49 = 0; var49 < arg9; var49++) {
                            if (var49 >= arg9 / 2) {
                                arg5[arg0] = arg2;
                            } else if (arg4) {
                                arg5[arg0] = arg8;
                            }
                            arg0++;
                        }
                        arg0 += var11;
                    }
                    return;
                }
                if (arg1 == 3) {
                    for (int var30 = 0; var30 < arg3; var30++) {
                        for (int var31 = 0; var31 < arg9; var31++) {
                            if (arg3 / 2 <= var30) {
                                arg5[arg0] = arg2;
                            } else if (arg4) {
                                arg5[arg0] = arg8;
                            }
                            arg0++;
                        }
                        arg0 += var11;
                    }
                    return;
                }
            }
            if (arg7 == 7) {
                if (arg1 == 0) {
                    for (int var38 = 0; var38 < arg3; var38++) {
                        for (int var39 = 0; var39 < arg9; var39++) {
                            if (var38 - arg3 / 2 >= var39) {
                                arg5[arg0] = arg2;
                            } else if (arg4) {
                                arg5[arg0] = arg8;
                            }
                            arg0++;
                        }
                        arg0 += var11;
                    }
                    return;
                }
                if (arg1 == 1) {
                    for (int var32 = arg3 - 1; var32 >= 0; var32--) {
                        for (int var33 = 0; var33 < arg9; var33++) {
                            if (var33 <= var32 - arg3 / 2) {
                                arg5[arg0] = arg2;
                            } else if (arg4) {
                                arg5[arg0] = arg8;
                            }
                            arg0++;
                        }
                        arg0 += var11;
                    }
                    return;
                }
                if (arg1 == 2) {
                    for (int var34 = arg3 - 1; var34 >= 0; var34--) {
                        for (int var35 = arg9 - 1; var35 >= 0; var35--) {
                            if (var35 <= var34 - arg3 / 2) {
                                arg5[arg0] = arg2;
                            } else if (arg4) {
                                arg5[arg0] = arg8;
                            }
                            arg0++;
                        }
                        arg0 += var11;
                    }
                    return;
                }
                if (arg1 == 3) {
                    for (int var36 = 0; var36 < arg3; var36++) {
                        for (int var37 = arg9 - 1; var37 >= 0; var37--) {
                            if (var36 - arg3 / 2 >= var37) {
                                arg5[arg0] = arg2;
                            } else if (arg4) {
                                arg5[arg0] = arg8;
                            }
                            arg0++;
                        }
                        arg0 += var11;
                    }
                    return;
                }
            }
            if (arg6 > -102) {
                this.field405 = -48;
            }
            if (arg7 == 8) {
                if (arg1 == 0) {
                    for (int var40 = 0; var40 < arg3; var40++) {
                        for (int var41 = 0; var41 < arg9; var41++) {
                            if (var41 >= var40 - arg3 / 2) {
                                arg5[arg0] = arg2;
                            } else if (arg4) {
                                arg5[arg0] = arg8;
                            }
                            arg0++;
                        }
                        arg0 += var11;
                    }
                    return;
                }
                if (arg1 == 1) {
                    for (int var46 = arg3 - 1; var46 >= 0; var46--) {
                        for (int var47 = 0; var47 < arg9; var47++) {
                            if (var46 - arg3 / 2 <= var47) {
                                arg5[arg0] = arg2;
                            } else if (arg4) {
                                arg5[arg0] = arg8;
                            }
                            arg0++;
                        }
                        arg0 += var11;
                    }
                    return;
                }
                if (arg1 == 2) {
                    for (int var42 = arg3 - 1; var42 >= 0; var42--) {
                        for (int var43 = arg9 - 1; var43 >= 0; var43--) {
                            if (var42 - arg3 / 2 <= var43) {
                                arg5[arg0] = arg2;
                            } else if (arg4) {
                                arg5[arg0] = arg8;
                            }
                            arg0++;
                        }
                        arg0 += var11;
                    }
                    return;
                }
                if (arg1 == 3) {
                    for (int var44 = 0; var44 < arg3; var44++) {
                        for (int var45 = arg9 - 1; var45 >= 0; var45--) {
                            if (var45 >= var44 - arg3 / 2) {
                                arg5[arg0] = arg2;
                            } else if (arg4) {
                                arg5[arg0] = arg8;
                            }
                            arg0++;
                        }
                        arg0 += var11;
                    }
                    return;
                }
            }
        } else if (arg1 == 0) {
            for (int var26 = arg3 - 1; var26 >= 0; var26--) {
                for (int var27 = arg9 - 1; var27 >= 0; var27--) {
                    if (var26 >> 1 <= var27) {
                        arg5[arg0] = arg2;
                    } else if (arg4) {
                        arg5[arg0] = arg8;
                    }
                    arg0++;
                }
                arg0 += var11;
            }
        } else if (arg1 == 1) {
            for (int var24 = arg3 - 1; var24 >= 0; var24--) {
                for (int var25 = 0; var25 < arg9; var25++) {
                    if (var24 << 1 >= var25) {
                        arg5[arg0] = arg2;
                    } else if (arg4) {
                        arg5[arg0] = arg8;
                    }
                    arg0++;
                }
                arg0 += var11;
            }
        } else if (arg1 == 2) {
            for (int var20 = 0; var20 < arg3; var20++) {
                for (int var21 = 0; var21 < arg9; var21++) {
                    if (var20 >> 1 <= var21) {
                        arg5[arg0] = arg2;
                    } else if (arg4) {
                        arg5[arg0] = arg8;
                    }
                    arg0++;
                }
                arg0 += var11;
            }
        } else if (arg1 == 3) {
            for (int var22 = 0; var22 < arg3; var22++) {
                for (int var23 = arg9 - 1; var23 >= 0; var23--) {
                    if (var23 <= var22 << 1) {
                        arg5[arg0] = arg2;
                    } else if (arg4) {
                        arg5[arg0] = arg8;
                    }
                    arg0++;
                }
                arg0 += var11;
            }
        }
    }

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "(IIBIIIDIII)V", line = 1628)
    public final void method202(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, double arg6, int arg7, int arg8, int arg9) {
        int var12 = arg0 - arg4;
        int var13 = arg5 - arg1;
        int var14 = (arg9 - arg7 << 16) / var12;
        int var15 = (arg3 - arg8 << 16) / var13;
        if (arg9 - arg7 < arg0 - arg4) {
            return;
        }
        this.field405 = 0;
        if (arg2 > -101) {
            return;
        }
        for (int var16 = 0; var16 < var12; var16++) {
            int var17 = var14 * var16 >> 16;
            int var18 = (var16 + 1) * var14 >> 16;
            int var19 = var18 - var17;
            if (var19 > 0) {
                class20.method138(arg4 + var16, arg1, 14209);
                for (int var20 = 0; var20 < var13; var20++) {
                    int var21 = var15 * var20 >> 16;
                    int var22 = (var20 + 1) * var15 >> 16;
                    int var23 = var22 - var21;
                    if (var23 > 0) {
                        int var24 = class15.method116(7393) & 0xFF;
                        if (var24 != 0) {
                            if (var24 == 47 || var24 == 53) {
                                if (!(arg6 < 4.0D) && arg6 > 4.2D && arg6 > 6.2D) {
                                }
                                class23.field288[var24 - 1].method65(var17, var21, var19 * 2 + 1, var23 * 2 + 1);
                            } else {
                                class23.field288[var24 - 1].method65(var17 - var19 / 2, -(var23 / 2) + var21, var19 * 2, var23 * 2);
                            }
                        }
                    }
                    class4.method37(true);
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "([BI)V", line = 1746)
    private final void method203(byte[] arg0, int arg1) {
        int var3 = 0;
        if (arg1 != 1) {
            this.method207(-1.5957084175091911D, -0.5657304389532118D, 3, -0.3842114041924204D);
        }
        while (true) {
            while (arg0.length > var3) {
                int var4 = (arg0[var3++] & 0xFF) * 64 - class27.field318;
                int var5 = (arg0[var3++] & 0xFF) * 64 - class1.field67;
                if (var4 > 0 && var5 > 0 && var4 + 64 < field411 && class13.field183 > var5 + 64) {
                    class31.field396 = var4 >> 6;
                    class24.field296 = class13.field183 - var5 - 1 >> 6;
                    for (int var6 = 0; var6 < 64; var6++) {
                        for (int var7 = -64; var7 < 0; var7++) {
                            int var8 = arg0[var3++] & 0xFF;
                            if (var8 != 0) {
                                byte var9 = arg0[var3++];
                                class31.method194(class13.field183 - var5 - var7 - 64 - 1, var9, 3, (byte) 72, var4 + var6);
                                if (class17.field215[class24.field296][class31.field396] == null) {
                                    class17.field215[class24.field296][class31.field396] = new class29();
                                    class17.field215[class24.field296][class31.field396].field362 = new byte[4096];
                                }
                                class17.field215[class24.field296][class31.field396].field362[(-(var7 + 1) << 6) + var6] = (byte) var8;
                            }
                        }
                    }
                    if (class17.field215[class24.field296][class31.field396] != null) {
                        class17.field215[class24.field296][class31.field396].method183(16497);
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

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "(Lu;I)V", line = 1830)
    public final void method204(class36 arg0, int arg1) {
        class20 var3 = new class20(arg0.method60(class31.field402, class28.field345, arg1 + 29416));
        int var4 = var3.method140(-114);
        int var5 = var3.method140(-66);
        int var6 = var3.method140(arg1 + 29342);
        int var7 = var3.method140(arg1 + 29326);
        int var8 = var3.method140(-112);
        if (arg1 != -29416) {
            return;
        }
        int var9 = var3.method140(-59);
        var3.method135((byte) 9);
        class13.field183 = (var7 + 1 - var5) * 64;
        class27.field318 = var4 * 64;
        field411 = (var6 - var4) * 64 + 64;
        class1.field67 = var5 * 64;
        mapview.field25 = class1.field67 + class13.field183 - var9 * 64;
        field415 = var8 * 64 - class27.field318;
        this.method197((byte) 97, class13.field183, field411);
        class20 var10 = new class20(arg0.method60(class30.field374, class28.field345, arg1 + 29416));
        int var11 = var10.method140(arg1 + 29298);
        class13.field181 = new int[var11 + 1];
        for (int var12 = 0; var12 < var11; var12++) {
            class13.field181[var12 + 1] = var10.method134((byte) -71);
        }
        int var13 = var10.method140(-57);
        class27.field311 = new int[var13 + 1];
        for (int var14 = 0; var14 < var13; var14++) {
            class27.field311[var14 + 1] = var10.method134((byte) -49);
        }
        byte[] var15 = arg0.method60(class1.field71, class28.field345, 0);
        byte[][] var16 = new byte[field411][class13.field183];
        this.method200(var15, (byte) 127, var16);
        byte[] var17 = arg0.method60(class34.field429, class28.field345, 0);
        this.method203(var17, 1);
        byte[] var18 = arg0.method60(class22.field263, class28.field345, arg1 ^ 0xFFFF8D18);
        this.method206(30399, var18);
        byte[] var19 = arg0.method60(class14.field186, class28.field345, 0);
        class35.field436 = 0;
        this.method199(1682, var19);
        this.method198(true, var16);
    }

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "(IIIIIIIIIII)V", line = 1917)
    public final void method205(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (this.field405 == 0) {
            int var12 = arg5 - arg8;
            int var13 = (arg0 - arg10 << 16) / var12;
            int var14 = arg6 - arg1;
            int var15 = (arg3 - arg2 << 16) / var14;
            for (int var16 = 0; var16 < var12; var16++) {
                int var17 = var13 * var16 >> 16;
                int var18 = (var16 + 1) * var13 >> 16;
                int var19 = var18 - var17;
                if (var19 > 0) {
                    class20.method138(arg8 + var16, arg1, 14209);
                    for (int var20 = 0; var20 < var14; var20++) {
                        int var21 = (var20 + 1) * var15 >> 16;
                        int var22 = var15 * var20 >> 16;
                        int var23 = var21 - var22;
                        if (var23 > 0) {
                            int var24 = class31.method193(true) & 0xFF;
                            if (var24 != 0) {
                                this.field416[this.field405] = var24 - 1;
                                this.field409[this.field405] = var19 / 2 + var17;
                                this.field406[this.field405] = var23 / 2 + var22;
                                this.field405++;
                            }
                        }
                        class4.method37(true);
                    }
                }
            }
        }
        if (arg4 != -26808) {
            this.method196(80, -17, -73, -47, 66, false, -122, 53, 116);
        }
        for (int var25 = 0; var25 < this.field405; var25++) {
            if (class20.field233[this.field416[var25]] != null) {
                class20.field233[this.field416[var25]].method92(this.field409[var25] - 7, this.field406[var25] - 7);
            }
        }
        if (arg7 > 0) {
            for (int var26 = 0; var26 < this.field405; var26++) {
                if (this.field416[var26] == arg9) {
                    class20.field233[this.field416[var26]].method92(this.field409[var26] - 7, this.field406[var26] + -7);
                    if (arg7 % 10 < 5) {
                        class37.method233(this.field409[var26], this.field406[var26], 15, 16776960, 128);
                        class37.method233(this.field409[var26], this.field406[var26], 7, 16777215, 256);
                    }
                }
            }
        }
        this.field405 = 0;
    }

    @OriginalMember(owner = "mapview!q", name = "b", descriptor = "(I[B)V", line = 2037)
    private final void method206(int arg0, byte[] arg1) {
        if (arg0 != 30399) {
            this.method205(55, -35, 4, 78, 14, -40, -91, 2, -128, -14, -82);
        }
        int var3 = 0;
        while (true) {
            while (arg1.length > var3) {
                int var4 = (arg1[var3++] & 0xFF) * 64 - class27.field318;
                int var5 = (arg1[var3++] & 0xFF) * 64 - class1.field67;
                if (var4 > 0 && var5 > 0 && var4 + 64 < field411 && var5 + 64 < class13.field183) {
                    class24.field296 = class13.field183 - var5 - 1 >> 6;
                    class31.field396 = var4 >> 6;
                    for (int var6 = 0; var6 < 64; var6++) {
                        for (int var7 = -64; var7 < 0; var7++) {
                            int var8 = arg1[var3++] & 0xFF;
                            if (var8 != 0) {
                                byte var9 = arg1[var3++];
                                class31.method194(class13.field183 - var7 - var5 - 1 - 64, var9, 4, (byte) 63, var4 + var6);
                                if (class31.field393[class24.field296][class31.field396] == null) {
                                    class31.field393[class24.field296][class31.field396] = new class29();
                                    class31.field393[class24.field296][class31.field396].field362 = new byte[4096];
                                }
                                class31.field393[class24.field296][class31.field396].field362[(-(var7 + 1) << 6) + var6] = (byte) var8;
                            }
                        }
                    }
                    if (class31.field393[class24.field296][class31.field396] != null) {
                        class31.field393[class24.field296][class31.field396].method183(16497);
                    }
                } else {
                    for (int var10 = -4096; var10 < 0; var10++) {
                        byte var11 = arg1[var3++];
                        if (var11 != 0) {
                            var3++;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "(DDID)I", line = 2125)
    private final int method207(double arg0, double arg1, int arg2, double arg3) {
        double var8 = arg0;
        if (arg2 != 3) {
            this.method197((byte) 92, -128, 24);
        }
        double var10 = arg0;
        double var12 = arg0;
        if (arg1 != 0.0D) {
            double var14;
            if (arg0 < 0.5D) {
                var14 = (arg1 + 1.0D) * arg0;
            } else {
                var14 = arg0 + arg1 - arg0 * arg1;
            }
            double var16 = arg0 * 2.0D - var14;
            if (arg3 * 6.0D < 1.0D) {
                var10 = (var14 - var16) * 6.0D * arg3 + var16;
            } else if (arg3 * 2.0D < 1.0D) {
                var10 = var14;
            } else if (arg3 * 3.0D < 2.0D) {
                var10 = (var14 - var16) * (0.6666666666666666D - arg3) * 6.0D + var16;
            } else {
                var10 = var16;
            }
            double var20 = arg3 - 0.3333333333333333D;
            if (var20 < 0.0D) {
                var20++;
            }
            double var22 = arg3 + 0.3333333333333333D;
            if (var20 * 6.0D < 1.0D) {
                var12 = (var14 - var16) * 6.0D * var20 + var16;
            } else if (var20 * 2.0D < 1.0D) {
                var12 = var14;
            } else if (var20 * 3.0D < 2.0D) {
                var12 = (var14 - var16) * (-var20 + 0.6666666666666666D) * 6.0D + var16;
            } else {
                var12 = var16;
            }
            if (var22 > 1.0D) {
                var22--;
            }
            if (var22 * 6.0D < 1.0D) {
                var8 = (var14 - var16) * 6.0D * var22 + var16;
            } else if (var22 * 2.0D < 1.0D) {
                var8 = var14;
            } else if (var22 * 3.0D < 2.0D) {
                var8 = (var14 - var16) * (-var22 + 0.6666666666666666D) * 6.0D + var16;
            } else {
                var8 = var16;
            }
        }
        int var24 = (int) (var12 * 256.0D);
        int var25 = (int) (var10 * 256.0D);
        int var26 = (int) (var8 * 256.0D);
        return (var26 << 16) + (var25 << 8) + var24;
    }

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "(IIIIIIIII)V", line = 2226)
    public final void method208(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var10 = arg8 - arg6;
        if (arg5 != 4096) {
            return;
        }
        int var11 = (arg3 - arg2 << 16) / var10;
        int var12 = arg0 - arg4;
        int var13 = (arg1 - arg7 << 16) / var12;
        for (int var14 = 0; var14 < var10; var14++) {
            int var15 = var11 * var14 >> 16;
            int var16 = (var14 + 1) * var11 >> 16;
            int var17 = var16 - var15;
            if (var17 > 0) {
                class20.method138(arg6 + var14, arg4, arg5 + 10113);
                int var18 = arg2 + var15;
                int var19 = arg2 + var16;
                for (int var20 = 0; var20 < var12; var20++) {
                    int var21 = var13 * var20 >> 16;
                    int var22 = (var20 + 1) * var13 >> 16;
                    int var23 = var22 - var21;
                    if (var23 > 0) {
                        int var24 = class15.method109(false);
                        int var25 = arg7 + var21;
                        int var26 = arg7 + var22;
                        int var27 = class27.method173((byte) -123);
                        if (var24 == 0 && var27 == 0) {
                            class37.method235(var18, var25, var19 - var18, var26 - var25, class29.method179(true));
                        } else {
                            byte var28 = class23.method160(125);
                            int var29 = var28 & 0xFC;
                            if (var29 == 0 || var17 <= 1 || var23 <= 1) {
                                class37.method235(var18, var25, var17, var23, var24);
                            } else {
                                this.method201(class37.field456 * var25 + var18, var28 & 0x3, var24, var23, true, class37.field457, arg5 ^ 0xFFFFEF93, var29 >> 2, class29.method179(true), var17);
                            }
                            if (var27 > 0) {
                                byte var30 = class28.method178(0);
                                int var31 = var30 & 0xFC;
                                if (var31 == 0 || var17 <= 1 || var23 <= 1) {
                                    class37.method235(var18, var25, var17, var23, var27);
                                }
                                this.method201(class37.field456 * var25 + var18, var30 & 0x3, var27, var23, var24 == 0, class37.field457, arg5 ^ 0xFFFFEF85, var31 >> 2, class29.method179(true), var17);
                            }
                        }
                    }
                    class4.method37(true);
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "(I)V", line = 2325)
    public static void method209(int arg0) {
        field407 = null;
        field408 = null;
        field414 = null;
        field410 = null;
        if (arg0 != 12035) {
            method209(85);
        }
    }
}
