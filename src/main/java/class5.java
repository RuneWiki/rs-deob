import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!c")
public class class5 {

    @OriginalMember(owner = "mapview!c", name = "e", descriptor = "[I")
    public int[] field56 = new int[1500];

    @OriginalMember(owner = "mapview!c", name = "k", descriptor = "[I")
    public int[] field62 = new int[1500];

    @OriginalMember(owner = "mapview!c", name = "h", descriptor = "[I")
    private int[] field59 = new int[1500];

    @OriginalMember(owner = "mapview!c", name = "g", descriptor = "[I")
    private int[] field58 = new int[1500];

    @OriginalMember(owner = "mapview!c", name = "n", descriptor = "[I")
    private int[] field65 = new int[1500];

    @OriginalMember(owner = "mapview!c", name = "m", descriptor = "[I")
    public int[] field64 = new int[1500];

    @OriginalMember(owner = "mapview!c", name = "f", descriptor = "I")
    private int field57 = 0;

    @OriginalMember(owner = "mapview!c", name = "b", descriptor = "Ld;")
    private static class7 field53 = class38.method251((byte) 125, "world");

    @OriginalMember(owner = "mapview!c", name = "d", descriptor = "Ld;")
    public static class7 field55 = class38.method251((byte) 121, "Clothes Shop");

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "Ld;")
    public static class7 field52 = class38.method251((byte) 58, "Windmill");

    @OriginalMember(owner = "mapview!c", name = "j", descriptor = "Ld;")
    public static class7 field61 = class38.method251((byte) 69, "Candle Shop");

    @OriginalMember(owner = "mapview!c", name = "i", descriptor = "Ld;")
    public static class7 field60 = class38.method251((byte) -114, "Anvil");

    @OriginalMember(owner = "mapview!c", name = "l", descriptor = "I")
    public static int field63 = 20;

    @OriginalMember(owner = "mapview!c", name = "o", descriptor = "Ld;")
    public static class7 field66 = class38.method251((byte) -73, "Scimitar Shop");

    @OriginalMember(owner = "mapview!c", name = "c", descriptor = "I")
    public static int field54;

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "([BB)V", line = 6)
    private final void method28(byte[] arg0, byte arg1) {
        if (arg1 <= 23) {
            return;
        }
        int var3 = 0;
        while (true) {
            while (arg0.length > var3) {
                int var4 = (arg0[var3++] & 0xFF) * 64 - class25.field273;
                int var5 = (arg0[var3++] & 0xFF) * 64 - class37.field497;
                if (var4 > 0 && var5 > 0 && class37.field489 > var4 + 64 && var5 + 64 < class4.field50) {
                    field54 = var4 >> 6;
                    class29.field428 = class4.field50 - var5 - 1 >> 6;
                    for (int var6 = 0; var6 < 64; var6++) {
                        for (int var7 = -64; var7 < 0; var7++) {
                            int var8 = arg0[var3++] & 0xFF;
                            if (var8 != 0) {
                                byte var9 = arg0[var3++];
                                mapview.method196(3, (byte) 46, class4.field50 - var5 - var7 - 1 - 64, var9, var4 + var6);
                                if (class25.field274[class29.field428][field54] == null) {
                                    class25.field274[class29.field428][field54] = new class15();
                                    class25.field274[class29.field428][field54].field164 = new byte[4096];
                                }
                                class25.field274[class29.field428][field54].field164[(-(var7 + 1) << 6) + var6] = (byte) var8;
                            }
                        }
                    }
                    if (class25.field274[class29.field428][field54] != null) {
                        class25.field274[class29.field428][field54].method114(-78);
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

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(IIILk;)Lea;", line = 88)
    public static final class10 method29(int arg0, int arg1, int arg2, class20 arg3) {
        if (class29.method209(arg3, arg0 - 1459520662, arg1, arg2)) {
            if (arg0 != 1459544641) {
                method31((byte) -110);
            }
            return mapview.method179((byte) 100);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(IIIIIIIIDI)V", line = 102)
    public final void method30(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, double arg8, int arg9) {
        int var12 = arg9 - arg5;
        int var13 = arg6 - arg4;
        int var14 = (arg2 - arg0 << 16) / var12;
        int var15 = (arg3 - arg7 << 16) / var13;
        if (arg2 - arg0 < -arg5 + arg9) {
            return;
        }
        this.field57 = 0;
        if (arg1 != 5) {
            this.method44(12, 59, 91, (byte) 28, 86, -57, -109, 45, -125);
        }
        for (int var16 = 0; var16 < var12; var16++) {
            int var17 = var14 * var16 >> 16;
            int var18 = (var16 + 1) * var14 >> 16;
            int var19 = var18 - var17;
            if (var19 > 0) {
                class15.method115(true, var16 + arg5, arg4);
                for (int var20 = 0; var20 < var13; var20++) {
                    int var21 = var15 * var20 >> 16;
                    int var22 = (var20 + 1) * var15 >> 16;
                    int var23 = var22 - var21;
                    if (var23 > 0) {
                        int var24 = method34((byte) 64) & 0xFF;
                        if (var24 != 0) {
                            if (var24 == 47 || var24 == 53) {
                                if (!(arg8 < 4.0D) && arg8 > 4.2D && !(arg8 > 6.2D)) {
                                }
                                class20.field216[var24 - 1].method201(var17, var21, var19 * 2 + 1, var23 * 2 - -1);
                            } else {
                                class20.field216[var24 - 1].method201(var17 - var19 / 2, -(var23 / 2) + var21, var19 * 2, var23 * 2);
                            }
                        }
                    }
                    class30.method213(-53);
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(B)Lka;", line = 224)
    public static final class21 method31(byte arg0) {
        try {
            if (arg0 <= 50) {
                field54 = 8;
            }
            return (class21) Class.forName("ia").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return new class16();
        }
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(I)V", line = 237)
    public static void method32(int arg0) {
        field66 = null;
        field53 = null;
        field61 = null;
        field55 = null;
        field52 = null;
        field60 = null;
        int var1 = 58 % ((arg0 + 26) / 53);
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(IIBIIIIIIII)V", line = 254)
    public final void method33(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (this.field57 == 0) {
            int var12 = arg4 - arg0;
            int var13 = arg10 - arg5;
            int var14 = (arg6 - arg8 << 16) / var12;
            int var15 = (arg3 - arg1 << 16) / var13;
            for (int var16 = 0; var16 < var12; var16++) {
                int var17 = var14 * var16 >> 16;
                int var18 = (var16 + 1) * var14 >> 16;
                int var19 = var18 - var17;
                if (var19 > 0) {
                    class15.method115(true, arg0 + var16, arg5);
                    for (int var20 = 0; var20 < var13; var20++) {
                        int var21 = var15 * var20 >> 16;
                        int var22 = (var20 + 1) * var15 >> 16;
                        int var23 = var22 - var21;
                        if (var23 > 0) {
                            int var24 = class38.method248(-11177) & 0xFF;
                            if (var24 != 0) {
                                this.field59[this.field57] = var24 - 1;
                                this.field58[this.field57] = var19 / 2 + var17;
                                this.field65[this.field57] = var23 / 2 + var21;
                                this.field57++;
                            }
                        }
                        class30.method213(-32);
                    }
                }
            }
        }
        if (arg2 != -56) {
            field61 = null;
        }
        for (int var25 = 0; var25 < this.field57; var25++) {
            if (class23.field250[this.field59[var25]] != null) {
                class23.field250[this.field59[var25]].method88(this.field58[var25] - 7, this.field65[var25] + -7);
            }
        }
        if (arg7 > 0) {
            for (int var26 = 0; var26 < this.field57; var26++) {
                if (this.field59[var26] == arg9) {
                    class23.field250[this.field59[var26]].method88(this.field58[var26] - 7, this.field65[var26] + -7);
                    if (arg7 % 10 < 5) {
                        class19.method138(this.field58[var26], this.field65[var26], 15, 16776960, 128);
                        class19.method138(this.field58[var26], this.field65[var26], 7, 16777215, 256);
                    }
                }
            }
        }
        this.field57 = 0;
    }

    @OriginalMember(owner = "mapview!c", name = "b", descriptor = "(B)B", line = 371)
    private static final byte method34(byte arg0) {
        int var1 = 29 / (arg0 / 63);
        return class24.field263 == null ? 0 : class24.field263[class2.field10];
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(IIIIIIIII)V", line = 387)
    public final void method35(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field57 = 0;
        int var10 = arg3 - arg5;
        int var11 = arg2 - arg7;
        if (arg8 < 119) {
            this.field62 = null;
        }
        int var12 = (arg6 - arg1 << 16) / var11;
        int var13 = (arg0 - arg4 << 16) / var10;
        for (int var14 = 0; var14 < var11; var14++) {
            int var15 = var12 * var14 >> 16;
            int var16 = (var14 + 1) * var12 >> 16;
            int var17 = var16 - var15;
            if (var17 > 0) {
                class15.method115(true, var14 + arg7, arg5);
                for (int var18 = 0; var18 < var10; var18++) {
                    int var19 = var13 * var18 >> 16;
                    int var20 = (var18 + 1) * var13 >> 16;
                    int var21 = var20 - var19;
                    if (var21 > 0) {
                        int var22 = class24.method168(40) & 0xFF;
                        if (var22 != 0) {
                            int var23;
                            if (var17 == 1) {
                                var23 = var15;
                            } else {
                                var23 = var16 - 1;
                            }
                            int var24;
                            if (var21 == 1) {
                                var24 = var19;
                            } else {
                                var24 = var20 - 1;
                            }
                            int var25 = 13421772;
                            if (var22 >= 5 && var22 <= 8 || var22 >= 13 && var22 <= 16 || var22 >= 21 && var22 <= 24 || var22 == 27 || var22 == 28) {
                                var22 -= 4;
                                var25 = 13369344;
                            }
                            if (var22 == 1) {
                                class19.method129(var15, var19, var21, var25);
                            } else if (var22 == 2) {
                                class19.method139(var15, var19, var17, var25);
                            } else if (var22 == 3) {
                                class19.method129(var23, var19, var21, var25);
                            } else if (var22 == 4) {
                                class19.method139(var15, var24, var17, var25);
                            } else if (var22 == 9) {
                                class19.method129(var15, var19, var21, 16777215);
                                class19.method139(var15, var19, var17, var25);
                            } else if (var22 == 10) {
                                class19.method129(var23, var19, var21, 16777215);
                                class19.method139(var15, var19, var17, var25);
                            } else if (var22 == 11) {
                                class19.method129(var23, var19, var21, 16777215);
                                class19.method139(var15, var24, var17, var25);
                            } else if (var22 == 12) {
                                class19.method129(var15, var19, var21, 16777215);
                                class19.method139(var15, var24, var17, var25);
                            } else if (var22 == 17) {
                                class19.method139(var15, var19, 1, var25);
                            } else if (var22 == 18) {
                                class19.method139(var23, var19, 1, var25);
                            } else if (var22 == 19) {
                                class19.method139(var23, var24, 1, var25);
                            } else if (var22 == 20) {
                                class19.method139(var15, var24, 1, var25);
                            } else if (var22 == 25) {
                                for (int var26 = 0; var26 < var21; var26++) {
                                    class19.method139(var15 + var26, -var26 + var24, 1, var25);
                                }
                            } else if (var22 == 26) {
                                for (int var27 = 0; var27 < var21; var27++) {
                                    class19.method139(var15 + var27, var19 + var27, 1, var25);
                                }
                            }
                        }
                        int var28 = class38.method248(-11177) & 0xFF;
                        if (var28 != 0) {
                            this.field59[this.field57] = var28 - 1;
                            this.field58[this.field57] = var17 / 2 + var15;
                            this.field65[this.field57] = var21 / 2 + var19;
                            this.field57++;
                        }
                    }
                    class30.method213(-53);
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(I[B)V", line = 572)
    private final void method36(int arg0, byte[] arg1) {
        int var3 = 0;
        if (arg0 != -22666) {
            return;
        }
        while (true) {
            while (var3 < arg1.length) {
                int var4 = (arg1[var3++] & 0xFF) * 64 - class25.field273;
                int var5 = (arg1[var3++] & 0xFF) * 64 - class37.field497;
                if (var4 > 0 && var5 > 0 && var4 + 64 < class37.field489 && var5 + 64 < class4.field50) {
                    for (int var6 = 0; var6 < 64; var6++) {
                        int var7 = class4.field50 - var5 - 1;
                        for (int var8 = -64; var8 < 0; var8++) {
                            while (true) {
                                int var9 = arg1[var3++] & 0xFF;
                                if (var9 == 0) {
                                    break;
                                }
                                if (var9 < 29) {
                                    mapview.method196(0, (byte) 46, class4.field50 - var5 - var8 - 64 - 1, (byte) var9, var4 + var6);
                                } else if (var9 >= 160) {
                                    mapview.method196(2, (byte) 46, class4.field50 - var8 - var5 - 1 - 64, (byte) (var9 - 159), var4 + var6);
                                    if (class24.field262 >= 1500) {
                                        break;
                                    }
                                    this.field64[class24.field262] = var6 + var4;
                                    this.field62[class24.field262] = var7;
                                    this.field56[class24.field262] = var9 - 160;
                                    class24.field262++;
                                } else {
                                    mapview.method196(1, (byte) 46, class4.field50 - var5 - var8 - 64 - 1, (byte) (var9 + -28), var4 + var6);
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

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "([[BI)V", line = 677)
    private final void method37(byte[][] arg0, int arg1) {
        if (arg1 != -805761292) {
            this.method43(-0.22114498681308958D, 0.7535636653939901D, -1.7870034327933761D, 93);
        }
        int var3 = class37.field489;
        int var4 = class4.field50;
        int[] var5 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var5[var6] = 0;
        }
        for (int var7 = 5; var7 < var3 - 5; var7++) {
            byte[] var8 = arg0[var7 + 5];
            byte[] var9 = arg0[var7 - 5];
            for (int var10 = 0; var10 < var4; var10++) {
                int var11 = class18.field199[var8[var10] & 0xFF];
                int var12 = class18.field199[var9[var10] & 0xFF];
                if (var11 <= 0 && class23.method164(var10, (byte) 118, var7 + 5) > 0) {
                    var11 = 64;
                }
                if (var12 <= 0 && class23.method164(var10, (byte) -81, var7 - 5) > 0) {
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
                    var13 += (var17 >> 20) - (var18 >> 20);
                    var14 += (var17 & 0x3FF) - (var18 & 0x3FF);
                    var15 += (var17 >> 10 & 0x3FF) - ((var18 & 0xFFDA5) >> 10);
                    if (var14 > 0) {
                        int var19 = var7 >> 6;
                        int var20 = var16 >> 6;
                        if (class8.field94[var20][var19] == null) {
                            class8.field94[var20][var19] = new int[4096];
                        }
                        if ((arg0[var7][var16] & 0xFF) > 0) {
                            class8.field94[var20][var19][class38.method243(var7, 63) + class38.method243(var16 << 6, 4032)] = this.method43((double) var15 / 8533.0D, (double) var13 / 8533.0D, (double) var14 / 8533.0D, -19666);
                        } else {
                            class8.field94[var20][var19][class38.method243(63, var7) + (class38.method243(var16, 63) << 6)] = 0;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(Lla;I)V", line = 779)
    public final void method38(class23 arg0, int arg1) {
        class35 var3 = new class35(arg0.method146(field53, class37.field492, (byte) -128));
        int var4 = var3.method231(arg1 - 951);
        int var5 = var3.method231(-887);
        int var6 = var3.method231(-887);
        int var7 = var3.method231(arg1 ^ 0xFFFFFCC9);
        int var8 = var3.method231(-887);
        int var9 = var3.method231(-887);
        var3.method227(true);
        class25.field273 = arg1 * var4;
        class37.field489 = (var6 - var4) * 64 + 64;
        class37.field497 = var5 * 64;
        class30.field436 = var8 * 64 - class25.field273;
        class4.field50 = (var7 + 1 - var5) * 64;
        class20.field225 = class4.field50 + class37.field497 - var9 * 64;
        this.method40(class37.field489, false, class4.field50);
        class35 var10 = new class35(arg0.method146(field53, class25.field271, (byte) -128));
        int var11 = var10.method231(arg1 - 951);
        class18.field199 = new int[var11 + 1];
        for (int var12 = 0; var12 < var11; var12++) {
            class18.field199[var12 + 1] = var10.method228((byte) -20);
        }
        int var13 = var10.method231(-887);
        class12.field135 = new int[var13 + 1];
        for (int var14 = 0; var14 < var13; var14++) {
            class12.field135[var14 + 1] = var10.method228((byte) -20);
        }
        byte[] var15 = arg0.method146(field53, class29.field427, (byte) -128);
        byte[][] var16 = new byte[class37.field489][class4.field50];
        this.method41(var15, var16, (byte) 83);
        byte[] var17 = arg0.method146(field53, class36.field482, (byte) -128);
        this.method28(var17, (byte) 47);
        byte[] var18 = arg0.method146(field53, class36.field486, (byte) -128);
        this.method42(arg1 ^ 0xFFFFFFBC, var18);
        byte[] var19 = arg0.method146(field53, class29.field429, (byte) -128);
        class24.field262 = 0;
        this.method36(-22666, var19);
        this.method37(var16, -805761292);
        if (class38.field509) {
        }
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(IIZ[IIIIIII)V", line = 860)
    private final void method39(int arg0, int arg1, boolean arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg6 == 9) {
            arg6 = 1;
            arg4 = arg4 + 1 & 0x3;
        }
        if (arg5 < 65) {
            field54 = 83;
        }
        if (arg6 == 10) {
            arg6 = 1;
            arg4 = arg4 + 3 & 0x3;
        }
        if (arg6 == 11) {
            arg6 = 8;
            arg4 = arg4 + 3 & 0x3;
        }
        int var11 = class19.field201 - arg0;
        if (arg6 == 1) {
            if (arg4 == 0) {
                for (int var18 = 0; var18 < arg8; var18++) {
                    for (int var19 = 0; var19 < arg0; var19++) {
                        if (var18 >= var19) {
                            arg3[arg9] = arg1;
                        } else if (arg2) {
                            arg3[arg9] = arg7;
                        }
                        arg9++;
                    }
                    arg9 += var11;
                }
            } else if (arg4 == 1) {
                for (int var12 = arg8 - 1; var12 >= 0; var12--) {
                    for (int var13 = 0; var13 < arg0; var13++) {
                        if (var12 >= var13) {
                            arg3[arg9] = arg1;
                        } else if (arg2) {
                            arg3[arg9] = arg7;
                        }
                        arg9++;
                    }
                    arg9 += var11;
                }
            } else if (arg4 == 2) {
                for (int var16 = 0; var16 < arg8; var16++) {
                    for (int var17 = 0; var17 < arg0; var17++) {
                        if (var16 <= var17) {
                            arg3[arg9] = arg1;
                        } else if (arg2) {
                            arg3[arg9] = arg7;
                        }
                        arg9++;
                    }
                    arg9 += var11;
                }
            } else if (arg4 == 3) {
                for (int var14 = arg8 - 1; var14 >= 0; var14--) {
                    for (int var15 = 0; var15 < arg0; var15++) {
                        if (var15 >= var14) {
                            arg3[arg9] = arg1;
                        } else if (arg2) {
                            arg3[arg9] = arg7;
                        }
                        arg9++;
                    }
                    arg9 += var11;
                }
            }
        } else if (arg6 == 2) {
            if (arg4 == 0) {
                for (int var20 = arg8 - 1; var20 >= 0; var20--) {
                    for (int var21 = 0; var21 < arg0; var21++) {
                        if (var20 >> 1 >= var21) {
                            arg3[arg9] = arg1;
                        } else if (arg2) {
                            arg3[arg9] = arg7;
                        }
                        arg9++;
                    }
                    arg9 += var11;
                }
            } else if (arg4 == 1) {
                for (int var26 = 0; var26 < arg8; var26++) {
                    for (int var27 = 0; var27 < arg0; var27++) {
                        if (var27 >= var26 << 1) {
                            arg3[arg9] = arg1;
                        } else if (arg2) {
                            arg3[arg9] = arg7;
                        }
                        arg9++;
                    }
                    arg9 += var11;
                }
            } else if (arg4 == 2) {
                for (int var22 = 0; var22 < arg8; var22++) {
                    for (int var23 = arg0 - 1; var23 >= 0; var23--) {
                        if (var22 >> 1 >= var23) {
                            arg3[arg9] = arg1;
                        } else if (arg2) {
                            arg3[arg9] = arg7;
                        }
                        arg9++;
                    }
                    arg9 += var11;
                }
            } else if (arg4 == 3) {
                for (int var24 = arg8 - 1; var24 >= 0; var24--) {
                    for (int var25 = arg0 - 1; var25 >= 0; var25--) {
                        if (var25 >= var24 << 1) {
                            arg3[arg9] = arg1;
                        } else if (arg2) {
                            arg3[arg9] = arg7;
                        }
                        arg9++;
                    }
                    arg9 += var11;
                }
            }
        } else if (arg6 == 3) {
            if (arg4 == 0) {
                for (int var28 = arg8 - 1; var28 >= 0; var28--) {
                    for (int var29 = arg0 - 1; var29 >= 0; var29--) {
                        if (var28 >> 1 >= var29) {
                            arg3[arg9] = arg1;
                        } else if (arg2) {
                            arg3[arg9] = arg7;
                        }
                        arg9++;
                    }
                    arg9 += var11;
                }
            } else if (arg4 == 1) {
                for (int var34 = arg8 - 1; var34 >= 0; var34--) {
                    for (int var35 = 0; var35 < arg0; var35++) {
                        if (var34 << 1 <= var35) {
                            arg3[arg9] = arg1;
                        } else if (arg2) {
                            arg3[arg9] = arg7;
                        }
                        arg9++;
                    }
                    arg9 += var11;
                }
            } else if (arg4 == 2) {
                for (int var30 = 0; var30 < arg8; var30++) {
                    for (int var31 = 0; var31 < arg0; var31++) {
                        if (var31 <= var30 >> 1) {
                            arg3[arg9] = arg1;
                        } else if (arg2) {
                            arg3[arg9] = arg7;
                        }
                        arg9++;
                    }
                    arg9 += var11;
                }
            } else if (arg4 == 3) {
                for (int var32 = 0; var32 < arg8; var32++) {
                    for (int var33 = arg0 - 1; var33 >= 0; var33--) {
                        if (var33 >= var32 << 1) {
                            arg3[arg9] = arg1;
                        } else if (arg2) {
                            arg3[arg9] = arg7;
                        }
                        arg9++;
                    }
                    arg9 += var11;
                }
            }
        } else if (arg6 == 4) {
            if (arg4 == 0) {
                for (int var74 = arg8 - 1; var74 >= 0; var74--) {
                    for (int var75 = 0; var75 < arg0; var75++) {
                        if (var75 >= var74 >> 1) {
                            arg3[arg9] = arg1;
                        } else if (arg2) {
                            arg3[arg9] = arg7;
                        }
                        arg9++;
                    }
                    arg9 += var11;
                }
            } else if (arg4 == 1) {
                for (int var72 = 0; var72 < arg8; var72++) {
                    for (int var73 = 0; var73 < arg0; var73++) {
                        if (var72 << 1 >= var73) {
                            arg3[arg9] = arg1;
                        } else if (arg2) {
                            arg3[arg9] = arg7;
                        }
                        arg9++;
                    }
                    arg9 += var11;
                }
            } else if (arg4 == 2) {
                for (int var68 = 0; var68 < arg8; var68++) {
                    for (int var69 = arg0 - 1; var69 >= 0; var69--) {
                        if (var68 >> 1 <= var69) {
                            arg3[arg9] = arg1;
                        } else if (arg2) {
                            arg3[arg9] = arg7;
                        }
                        arg9++;
                    }
                    arg9 += var11;
                }
            } else if (arg4 == 3) {
                for (int var70 = arg8 - 1; var70 >= 0; var70--) {
                    for (int var71 = arg0 - 1; var71 >= 0; var71--) {
                        if (var70 << 1 >= var71) {
                            arg3[arg9] = arg1;
                        } else if (arg2) {
                            arg3[arg9] = arg7;
                        }
                        arg9++;
                    }
                    arg9 += var11;
                }
            }
        } else if (arg6 != 5) {
            if (arg6 == 6) {
                if (arg4 == 0) {
                    for (int var36 = 0; var36 < arg8; var36++) {
                        for (int var37 = 0; var37 < arg0; var37++) {
                            if (var37 <= arg0 / 2) {
                                arg3[arg9] = arg1;
                            } else if (arg2) {
                                arg3[arg9] = arg7;
                            }
                            arg9++;
                        }
                        arg9 += var11;
                    }
                    return;
                }
                if (arg4 == 1) {
                    for (int var58 = 0; var58 < arg8; var58++) {
                        for (int var59 = 0; var59 < arg0; var59++) {
                            if (arg8 / 2 >= var58) {
                                arg3[arg9] = arg1;
                            } else if (arg2) {
                                arg3[arg9] = arg7;
                            }
                            arg9++;
                        }
                        arg9 += var11;
                    }
                    return;
                }
                if (arg4 == 2) {
                    for (int var56 = 0; var56 < arg8; var56++) {
                        for (int var57 = 0; var57 < arg0; var57++) {
                            if (arg0 / 2 <= var57) {
                                arg3[arg9] = arg1;
                            } else if (arg2) {
                                arg3[arg9] = arg7;
                            }
                            arg9++;
                        }
                        arg9 += var11;
                    }
                    return;
                }
                if (arg4 == 3) {
                    for (int var38 = 0; var38 < arg8; var38++) {
                        for (int var39 = 0; var39 < arg0; var39++) {
                            if (var38 >= arg8 / 2) {
                                arg3[arg9] = arg1;
                            } else if (arg2) {
                                arg3[arg9] = arg7;
                            }
                            arg9++;
                        }
                        arg9 += var11;
                    }
                    return;
                }
            }
            if (arg6 == 7) {
                if (arg4 == 0) {
                    for (int var54 = 0; var54 < arg8; var54++) {
                        for (int var55 = 0; var55 < arg0; var55++) {
                            if (var54 - arg8 / 2 >= var55) {
                                arg3[arg9] = arg1;
                            } else if (arg2) {
                                arg3[arg9] = arg7;
                            }
                            arg9++;
                        }
                        arg9 += var11;
                    }
                    return;
                }
                if (arg4 == 1) {
                    for (int var52 = arg8 - 1; var52 >= 0; var52--) {
                        for (int var53 = 0; var53 < arg0; var53++) {
                            if (var53 <= var52 - arg8 / 2) {
                                arg3[arg9] = arg1;
                            } else if (arg2) {
                                arg3[arg9] = arg7;
                            }
                            arg9++;
                        }
                        arg9 += var11;
                    }
                    return;
                }
                if (arg4 == 2) {
                    for (int var50 = arg8 - 1; var50 >= 0; var50--) {
                        for (int var51 = arg0 - 1; var51 >= 0; var51--) {
                            if (var51 <= var50 - arg8 / 2) {
                                arg3[arg9] = arg1;
                            } else if (arg2) {
                                arg3[arg9] = arg7;
                            }
                            arg9++;
                        }
                        arg9 += var11;
                    }
                    return;
                }
                if (arg4 == 3) {
                    for (int var40 = 0; var40 < arg8; var40++) {
                        for (int var41 = arg0 - 1; var41 >= 0; var41--) {
                            if (var40 - arg8 / 2 >= var41) {
                                arg3[arg9] = arg1;
                            } else if (arg2) {
                                arg3[arg9] = arg7;
                            }
                            arg9++;
                        }
                        arg9 += var11;
                    }
                    return;
                }
            }
            if (arg6 == 8) {
                if (arg4 == 0) {
                    for (int var42 = 0; var42 < arg8; var42++) {
                        for (int var43 = 0; var43 < arg0; var43++) {
                            if (var42 - arg8 / 2 <= var43) {
                                arg3[arg9] = arg1;
                            } else if (arg2) {
                                arg3[arg9] = arg7;
                            }
                            arg9++;
                        }
                        arg9 += var11;
                    }
                    return;
                }
                if (arg4 == 1) {
                    for (int var48 = arg8 - 1; var48 >= 0; var48--) {
                        for (int var49 = 0; var49 < arg0; var49++) {
                            if (var48 - arg8 / 2 <= var49) {
                                arg3[arg9] = arg1;
                            } else if (arg2) {
                                arg3[arg9] = arg7;
                            }
                            arg9++;
                        }
                        arg9 += var11;
                    }
                    return;
                }
                if (arg4 == 2) {
                    for (int var44 = arg8 - 1; var44 >= 0; var44--) {
                        for (int var45 = arg0 - 1; var45 >= 0; var45--) {
                            if (var44 - arg8 / 2 <= var45) {
                                arg3[arg9] = arg1;
                            } else if (arg2) {
                                arg3[arg9] = arg7;
                            }
                            arg9++;
                        }
                        arg9 += var11;
                    }
                    return;
                }
                if (arg4 == 3) {
                    for (int var46 = 0; var46 < arg8; var46++) {
                        for (int var47 = arg0 - 1; var47 >= 0; var47--) {
                            if (var46 - arg8 / 2 <= var47) {
                                arg3[arg9] = arg1;
                            } else if (arg2) {
                                arg3[arg9] = arg7;
                            }
                            arg9++;
                        }
                        arg9 += var11;
                    }
                    return;
                }
            }
        } else if (arg4 == 0) {
            for (int var66 = arg8 - 1; var66 >= 0; var66--) {
                for (int var67 = arg0 - 1; var67 >= 0; var67--) {
                    if (var67 >= var66 >> 1) {
                        arg3[arg9] = arg1;
                    } else if (arg2) {
                        arg3[arg9] = arg7;
                    }
                    arg9++;
                }
                arg9 += var11;
            }
        } else if (arg4 == 1) {
            for (int var64 = arg8 - 1; var64 >= 0; var64--) {
                for (int var65 = 0; var65 < arg0; var65++) {
                    if (var65 <= var64 << 1) {
                        arg3[arg9] = arg1;
                    } else if (arg2) {
                        arg3[arg9] = arg7;
                    }
                    arg9++;
                }
                arg9 += var11;
            }
        } else if (arg4 == 2) {
            for (int var62 = 0; var62 < arg8; var62++) {
                for (int var63 = 0; var63 < arg0; var63++) {
                    if (var62 >> 1 <= var63) {
                        arg3[arg9] = arg1;
                    } else if (arg2) {
                        arg3[arg9] = arg7;
                    }
                    arg9++;
                }
                arg9 += var11;
            }
        } else if (arg4 == 3) {
            for (int var60 = 0; var60 < arg8; var60++) {
                for (int var61 = arg0 - 1; var61 >= 0; var61--) {
                    if (var60 << 1 >= var61) {
                        arg3[arg9] = arg1;
                    } else if (arg2) {
                        arg3[arg9] = arg7;
                    }
                    arg9++;
                }
                arg9 += var11;
            }
        }
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(IZI)V", line = 1997)
    private final void method40(int arg0, boolean arg1, int arg2) {
        int var4 = arg0 >> 6;
        int var5 = arg2 >> 6;
        if (arg1) {
            return;
        }
        class16.field171[1] = new byte[var5][var4][];
        class8.field94 = new int[var5][var4][];
        class16.field171[3] = new byte[var5][var4][];
        class2.field11 = new class15[var5][var4];
        class16.field171[4] = new byte[var5][var4][];
        class16.field171[0] = new byte[var5][var4][];
        class16.field171[2] = new byte[var5][var4][];
        class25.field274 = new class15[var5][var4];
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "([B[[BB)V", line = 2026)
    private final void method41(byte[] arg0, byte[][] arg1, byte arg2) {
        if (arg2 <= 17) {
            return;
        }
        int var4 = 0;
        while (true) {
            while (var4 < arg0.length) {
                int var5 = (arg0[var4++] & 0xFF) * 64 - class25.field273;
                int var6 = (arg0[var4++] & 0xFF) * 64 - class37.field497;
                if (var5 > 0 && var6 > 0 && var5 + 64 < class37.field489 && class4.field50 > var6 + 64) {
                    for (int var7 = 0; var7 < 64; var7++) {
                        byte[] var8 = arg1[var5 + var7];
                        int var9 = class4.field50 - var6 - 1;
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

    @OriginalMember(owner = "mapview!c", name = "b", descriptor = "(I[B)V", line = 2073)
    private final void method42(int arg0, byte[] arg1) {
        if (arg0 != -4) {
            return;
        }
        int var3 = 0;
        while (true) {
            while (arg1.length > var3) {
                int var4 = (arg1[var3++] & 0xFF) * 64 - class25.field273;
                int var5 = (arg1[var3++] & 0xFF) * 64 - class37.field497;
                if (var4 > 0 && var5 > 0 && var4 + 64 < class37.field489 && class4.field50 > var5 + 64) {
                    class29.field428 = class4.field50 - var5 - 1 >> 6;
                    field54 = var4 >> 6;
                    for (int var6 = 0; var6 < 64; var6++) {
                        for (int var7 = -64; var7 < 0; var7++) {
                            int var8 = arg1[var3++] & 0xFF;
                            if (var8 != 0) {
                                byte var9 = arg1[var3++];
                                mapview.method196(4, (byte) 46, class4.field50 - var5 - var7 - 65, var9, var4 + var6);
                                if (class2.field11[class29.field428][field54] == null) {
                                    class2.field11[class29.field428][field54] = new class15();
                                    class2.field11[class29.field428][field54].field164 = new byte[4096];
                                }
                                class2.field11[class29.field428][field54].field164[(-(var7 + 1) << 6) + var6] = (byte) var8;
                            }
                        }
                    }
                    if (class2.field11[class29.field428][field54] != null) {
                        class2.field11[class29.field428][field54].method114(arg0 - 57);
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

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(DDDI)I", line = 2161)
    private final int method43(double arg0, double arg1, double arg2, int arg3) {
        double var8 = arg2;
        if (arg3 != -19666) {
            return -13;
        }
        double var10 = arg2;
        double var12 = arg2;
        if (arg0 != 0.0D) {
            double var14;
            if (arg2 < 0.5D) {
                var14 = (arg0 + 1.0D) * arg2;
            } else {
                var14 = arg0 + arg2 - arg0 * arg2;
            }
            double var16 = arg2 * 2.0D - var14;
            double var18 = arg1 + 0.3333333333333333D;
            if (var18 > 1.0D) {
                var18--;
            }
            if (var18 * 6.0D < 1.0D) {
                var8 = (var14 - var16) * 6.0D * var18 + var16;
            } else if (var18 * 2.0D < 1.0D) {
                var8 = var14;
            } else if (var18 * 3.0D < 2.0D) {
                var8 = (var14 - var16) * (-var18 + 0.6666666666666666D) * 6.0D + var16;
            } else {
                var8 = var16;
            }
            if (arg1 * 6.0D < 1.0D) {
                var12 = (var14 - var16) * 6.0D * arg1 + var16;
            } else if (arg1 * 2.0D < 1.0D) {
                var12 = var14;
            } else if (arg1 * 3.0D < 2.0D) {
                var12 = (var14 - var16) * (-arg1 + 0.6666666666666666D) * 6.0D + var16;
            } else {
                var12 = var16;
            }
            double var22 = arg1 - 0.3333333333333333D;
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
        int var26 = (int) (var12 * 256.0D);
        return (var24 << 16) + (var26 << 8) + var25;
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(IIIBIIIII)V", line = 2251)
    public final void method44(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var10 = arg2 - arg8;
        int var11 = arg4 - arg1;
        if (arg3 > -33) {
            return;
        }
        int var12 = (arg6 - arg5 << 16) / var10;
        int var13 = (arg0 - arg7 << 16) / var11;
        for (int var14 = 0; var14 < var11; var14++) {
            int var15 = var13 * var14 >> 16;
            int var16 = (var14 + 1) * var13 >> 16;
            int var17 = var16 - var15;
            if (var17 > 0) {
                class15.method115(true, arg1 + var14, arg8);
                int var18 = arg7 + var16;
                int var19 = arg7 + var15;
                for (int var20 = 0; var20 < var10; var20++) {
                    int var21 = var12 * var20 >> 16;
                    int var22 = (var20 + 1) * var12 >> 16;
                    int var23 = var22 - var21;
                    if (var23 > 0) {
                        int var24 = arg5 + var22;
                        int var25 = class21.method156(255);
                        int var26 = arg5 + var21;
                        int var27 = class11.method104(0);
                        if (var25 == 0 && var27 == 0) {
                            class19.method131(var19, var26, var18 - var19, -var26 + var24, class11.method100((byte) 93));
                        } else {
                            byte var28 = class26.method200((byte) 121);
                            int var29 = var28 & 0xFC;
                            if (var29 == 0 || var17 <= 1 || var23 <= 1) {
                                class19.method131(var19, var26, var17, var23, var25);
                            } else {
                                this.method39(var17, var25, true, class19.field203, var28 & 0x3, 87, var29 >> 2, class11.method100((byte) 121), var23, class19.field201 * var26 + var19);
                            }
                            if (var27 > 0) {
                                byte var30 = class7.method73(-19278);
                                int var31 = var30 & 0xFC;
                                if (var31 == 0 || var17 <= 1 || var23 <= 1) {
                                    class19.method131(var19, var26, var17, var23, var27);
                                }
                                this.method39(var17, var27, var25 == 0, class19.field203, var30 & 0x3, 69, var31 >> 2, class11.method100((byte) 107), var23, class19.field201 * var26 + var19);
                            }
                        }
                    }
                    class30.method213(-114);
                }
            }
        }
    }
}
