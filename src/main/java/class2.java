import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!b")
public class class2 {

    @OriginalMember(owner = "mapview!b", name = "c", descriptor = "[I")
    public int[] field10 = new int[1500];

    @OriginalMember(owner = "mapview!b", name = "n", descriptor = "[I")
    private int[] field21 = new int[1500];

    @OriginalMember(owner = "mapview!b", name = "k", descriptor = "[I")
    private int[] field18 = new int[1500];

    @OriginalMember(owner = "mapview!b", name = "s", descriptor = "I")
    private int field26 = 0;

    @OriginalMember(owner = "mapview!b", name = "p", descriptor = "[I")
    private int[] field23 = new int[1500];

    @OriginalMember(owner = "mapview!b", name = "g", descriptor = "[I")
    public int[] field14 = new int[1500];

    @OriginalMember(owner = "mapview!b", name = "r", descriptor = "[I")
    public int[] field25 = new int[1500];

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "Lna;")
    public static class26 field8 = class33.method219("75(U", 87);

    @OriginalMember(owner = "mapview!b", name = "f", descriptor = "[[B")
    public static byte[][] field13 = new byte[250][];

    @OriginalMember(owner = "mapview!b", name = "d", descriptor = "I")
    public static int field11 = 0;

    @OriginalMember(owner = "mapview!b", name = "i", descriptor = "Lna;")
    public static class26 field16 = class33.method219("Dungeon", 79);

    @OriginalMember(owner = "mapview!b", name = "h", descriptor = "Lna;")
    public static class26 field15 = class33.method219("POH Portal", 108);

    @OriginalMember(owner = "mapview!b", name = "q", descriptor = "I")
    public static int field24 = 0;

    @OriginalMember(owner = "mapview!b", name = "l", descriptor = "Lna;")
    public static class26 field19 = class33.method219("Loom", 93);

    @OriginalMember(owner = "mapview!b", name = "e", descriptor = "I")
    public static int field12 = 0;

    @OriginalMember(owner = "mapview!b", name = "j", descriptor = "Lna;")
    public static class26 field17 = class33.method219("Next page", 90);

    @OriginalMember(owner = "mapview!b", name = "m", descriptor = "Z")
    public static boolean field20 = true;

    @OriginalMember(owner = "mapview!b", name = "b", descriptor = "I")
    public static int field9;

    @OriginalMember(owner = "mapview!b", name = "o", descriptor = "[B")
    public static byte[] field22;

    @OriginalMember(owner = "mapview!b", name = "t", descriptor = "[[B")
    public static byte[][] field27;

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(IDDD)I", line = 9)
    private final int method5(int arg0, double arg1, double arg2, double arg3) {
        int var8 = -69 / (arg0 / 43);
        double var9 = arg2;
        double var11 = arg2;
        double var13 = arg2;
        if (arg3 != 0.0D) {
            double var15;
            if (arg2 < 0.5D) {
                var15 = (arg3 + 1.0D) * arg2;
            } else {
                var15 = arg2 + arg3 - arg2 * arg3;
            }
            double var17 = arg2 * 2.0D - var15;
            double var19 = arg1 + 0.3333333333333333D;
            if (arg1 * 6.0D < 1.0D) {
                var9 = (var15 - var17) * 6.0D * arg1 + var17;
            } else if (arg1 * 2.0D < 1.0D) {
                var9 = var15;
            } else if (arg1 * 3.0D < 2.0D) {
                var9 = (0.6666666666666666D - arg1) * (-var17 + var15) * 6.0D + var17;
            } else {
                var9 = var17;
            }
            if (var19 > 1.0D) {
                var19--;
            }
            if (var19 * 6.0D < 1.0D) {
                var11 = (var15 - var17) * 6.0D * var19 + var17;
            } else if (var19 * 2.0D < 1.0D) {
                var11 = var15;
            } else if (var19 * 3.0D < 2.0D) {
                var11 = (0.6666666666666666D - var19) * (-var17 + var15) * 6.0D + var17;
            } else {
                var11 = var17;
            }
            double var23 = arg1 - 0.3333333333333333D;
            if (var23 < 0.0D) {
                var23++;
            }
            if (var23 * 6.0D < 1.0D) {
                var13 = (var15 - var17) * 6.0D * var23 + var17;
            } else if (var23 * 2.0D < 1.0D) {
                var13 = var15;
            } else if (var23 * 3.0D < 2.0D) {
                var13 = (var15 - var17) * (-var23 + 0.6666666666666666D) * 6.0D + var17;
            } else {
                var13 = var17;
            }
        }
        int var25 = (int) (var11 * 256.0D);
        int var26 = (int) (var9 * 256.0D);
        int var27 = (int) (var13 * 256.0D);
        return (var25 << 16) + (var26 << 8) + var27;
    }

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(Z)Lo;", line = 102)
    public static final class27 method6(boolean arg0) {
        try {
            if (arg0) {
                field9 = 3;
            }
            return (class27) Class.forName("k").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return new class34();
        }
    }

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(Laa;I)V", line = 119)
    public final void method7(class1 arg0, int arg1) {
        class40 var3 = new class40(arg0.method204(class4.field37, class40.field524, true));
        int var4 = var3.method246(-25327);
        int var5 = var3.method246(-25327);
        int var6 = var3.method246(-25327);
        int var7 = var3.method246(-25327);
        int var8 = var3.method246(-25327);
        int var9 = var3.method246(-25327);
        var3.method255((byte) 127);
        if (arg1 > -15) {
            method19(-31);
        }
        class39.field519 = (var7 + 1 - var5) * 64;
        class4.field47 = var5 * 64;
        class11.field103 = var4 * 64;
        class26.field399 = (var6 - var4) * 64 + 64;
        class4.field45 = class4.field47 + class39.field519 - var9 * 64;
        class39.field522 = var8 * 64 - class11.field103;
        this.method21(class26.field399, class39.field519, 110);
        class40 var10 = new class40(arg0.method204(class11.field111, class40.field524, true));
        int var11 = var10.method246(-25327);
        class39.field521 = new int[var11 + 1];
        for (int var12 = 0; var12 < var11; var12++) {
            class39.field521[var12 + 1] = var10.method248(255);
        }
        int var13 = var10.method246(-25327);
        class12.field118 = new int[var13 + 1];
        for (int var14 = 0; var14 < var13; var14++) {
            class12.field118[var14 + 1] = var10.method248(255);
        }
        byte[] var15 = arg0.method204(class24.field253, class40.field524, true);
        byte[][] var16 = new byte[class26.field399][class39.field519];
        this.method12(var15, var16, false);
        byte[] var17 = arg0.method204(class10.field102, class40.field524, true);
        this.method11(var17, 0);
        byte[] var18 = arg0.method204(mapview.field266, class40.field524, true);
        this.method8(-332, var18);
        byte[] var19 = arg0.method204(class29.field432, class40.field524, true);
        field12 = 0;
        this.method16(var19, -28033);
        this.method9(var16, -828293974);
    }

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(I[B)V", line = 192)
    private final void method8(int arg0, byte[] arg1) {
        if (arg0 != -332) {
            this.method21(-23, 119, 12);
        }
        int var3 = 0;
        while (true) {
            while (arg1.length > var3) {
                int var4 = (arg1[var3++] & 0xFF) * 64 - class11.field103;
                int var5 = (arg1[var3++] & 0xFF) * 64 - class4.field47;
                if (var4 > 0 && var5 > 0 && class26.field399 > var4 + 64 && var5 + 64 < class39.field519) {
                    class5.field53 = class39.field519 - var5 - 1 >> 6;
                    class8.field77 = var4 >> 6;
                    for (int var6 = 0; var6 < 64; var6++) {
                        for (int var7 = -64; var7 < 0; var7++) {
                            int var8 = arg1[var3++] & 0xFF;
                            if (var8 != 0) {
                                byte var9 = arg1[var3++];
                                class34.method227(var4 + var6, arg0 + 192057842, var9, class39.field519 - var5 - var7 - 64 - 1, 4);
                                if (class8.field79[class5.field53][class8.field77] == null) {
                                    class8.field79[class5.field53][class8.field77] = new class38();
                                    class8.field79[class5.field53][class8.field77].field503 = new byte[4096];
                                }
                                class8.field79[class5.field53][class8.field77].field503[(-(var7 + 1) << 6) + var6] = (byte) var8;
                            }
                        }
                    }
                    if (class8.field79[class5.field53][class8.field77] != null) {
                        class8.field79[class5.field53][class8.field77].method240(0);
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

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "([[BI)V", line = 278)
    private final void method9(byte[][] arg0, int arg1) {
        int var3 = class26.field399;
        int var4 = class39.field519;
        int[] var5 = new int[var4];
        if (arg1 != -828293974) {
            this.method12(null, null, true);
        }
        for (int var6 = 0; var6 < var4; var6++) {
            var5[var6] = 0;
        }
        for (int var7 = 5; var7 < var3 - 5; var7++) {
            byte[] var8 = arg0[var7 - 5];
            byte[] var9 = arg0[var7 + 5];
            for (int var10 = 0; var10 < var4; var10++) {
                int var11 = class39.field521[var9[var10] & 0xFF];
                int var12 = class39.field521[var8[var10] & 0xFF];
                if (var11 <= 0 && class25.method162(false, var7 + 5, var10) > 0) {
                    var11 = 64;
                }
                if (var12 <= 0 && class25.method162(false, var7 - 5, var10) > 0) {
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
                    var14 += (var17 & 0x3FF) - (var18 & 0x3FF);
                    var13 += (var17 >> 20) - (var18 >> 20);
                    var15 += (var17 >> 10 & 0x3FF) - (var18 >> 10 & 0x3FF);
                    if (var14 > 0) {
                        int var19 = var7 >> 6;
                        int var20 = var16 >> 6;
                        if (class23.field246[var20][var19] == null) {
                            class23.field246[var20][var19] = new int[4096];
                        }
                        if ((arg0[var7][var16] & 0xFF) <= 0) {
                            class23.field246[var20][var19][class22.method119(4032, var16 << 6) + class22.method119(63, var7)] = 0;
                        } else {
                            class23.field246[var20][var19][class22.method119(63, var7) + class22.method119(var16 << 6, 4032)] = this.method5(arg1 + 828294093, (double) var13 / 8533.0D, (double) var14 / 8533.0D, (double) var15 / 8533.0D);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(IZ)I", line = 377)
    public static final int method10(int arg0, boolean arg1) {
        if (arg1) {
            field8 = null;
        }
        if (arg0 >= 65 && arg0 <= 90) {
            arg0 += 32;
        }
        return arg0;
    }

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "([BI)V", line = 395)
    private final void method11(byte[] arg0, int arg1) {
        int var3 = arg1;
        while (true) {
            while (var3 < arg0.length) {
                int var4 = (arg0[var3++] & 0xFF) * 64 - class11.field103;
                int var5 = (arg0[var3++] & 0xFF) * 64 - class4.field47;
                if (var4 > 0 && var5 > 0 && var4 + 64 < class26.field399 && class39.field519 > var5 + 64) {
                    class8.field77 = var4 >> 6;
                    class5.field53 = class39.field519 - var5 - 1 >> 6;
                    for (int var6 = 0; var6 < 64; var6++) {
                        for (int var7 = -64; var7 < 0; var7++) {
                            int var8 = arg0[var3++] & 0xFF;
                            if (var8 != 0) {
                                byte var9 = arg0[var3++];
                                class34.method227(var4 + var6, 192057510, var9, class39.field519 - var7 - var5 - 1 - 64, 3);
                                if (class25.field388[class5.field53][class8.field77] == null) {
                                    class25.field388[class5.field53][class8.field77] = new class38();
                                    class25.field388[class5.field53][class8.field77].field503 = new byte[4096];
                                }
                                class25.field388[class5.field53][class8.field77].field503[(-(var7 + 1) << 6) + var6] = (byte) var8;
                            }
                        }
                    }
                    if (class25.field388[class5.field53][class8.field77] != null) {
                        class25.field388[class5.field53][class8.field77].method240(0);
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

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "([B[[BZ)V", line = 471)
    private final void method12(byte[] arg0, byte[][] arg1, boolean arg2) {
        if (arg2) {
            method10(-2, false);
        }
        int var4 = 0;
        while (true) {
            while (var4 < arg0.length) {
                int var5 = (arg0[var4++] & 0xFF) * 64 - class11.field103;
                int var6 = (arg0[var4++] & 0xFF) * 64 - class4.field47;
                if (var5 > 0 && var6 > 0 && class26.field399 > var5 + 64 && class39.field519 > var6 + 64) {
                    for (int var7 = 0; var7 < 64; var7++) {
                        int var8 = class39.field519 - var6 - 1;
                        byte[] var9 = arg1[var5 + var7];
                        for (int var10 = -64; var10 < 0; var10++) {
                            var9[var8--] = arg0[var4++];
                        }
                    }
                } else {
                    var4 += 4096;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(IIDIIIIIIZ)V", line = 519)
    public final void method13(int arg0, int arg1, double arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
        int var12 = arg6 - arg3;
        int var13 = arg5 - arg8;
        int var14 = (arg7 - arg1 << 16) / var12;
        int var15 = (arg0 - arg4 << 16) / var13;
        if (arg6 - arg3 > arg7 - arg1) {
            return;
        }
        this.field26 = 0;
        if (arg9) {
            return;
        }
        for (int var16 = 0; var16 < var12; var16++) {
            int var17 = var14 * var16 >> 16;
            int var18 = (var16 + 1) * var14 >> 16;
            int var19 = var18 - var17;
            if (var19 > 0) {
                class4.method30(63, arg3 + var16, arg8);
                for (int var20 = 0; var20 < var13; var20++) {
                    int var21 = (var20 + 1) * var15 >> 16;
                    int var22 = var15 * var20 >> 16;
                    int var23 = var21 - var22;
                    if (var23 > 0) {
                        int var24 = class11.method60(-116) & 0xFF;
                        if (var24 != 0) {
                            if (var24 == 47 || var24 == 53) {
                                if (!(arg2 < 4.0D) && arg2 > 4.2D && !(arg2 > 6.2D)) {
                                }
                                class26.field396[var24 - 1].method47(var17, var22, var19 * 2 + 1, var23 * 2 + 1);
                            } else {
                                class26.field396[var24 - 1].method47(var17 - var19 / 2, var22 - var23 / 2, var19 * 2, var23 * 2);
                            }
                        }
                    }
                    class24.method135(114);
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(IIIIIIIII)V", line = 643)
    public final void method14(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field26 = 0;
        int var10 = arg1 - arg2;
        int var11 = arg0 - arg4;
        int var12 = (arg7 - arg6 << 16) / var10;
        int var13 = (arg3 - arg8 << 16) / var11;
        for (int var14 = 0; var14 < var10; var14++) {
            int var15 = var12 * var14 >> 16;
            int var16 = (var14 + 1) * var12 >> 16;
            int var17 = var16 - var15;
            if (var17 > 0) {
                class4.method30(63, arg2 + var14, arg4);
                for (int var18 = 0; var18 < var11; var18++) {
                    int var19 = var13 * var18 >> 16;
                    int var20 = (var18 + 1) * var13 >> 16;
                    int var21 = var20 - var19;
                    if (var21 > 0) {
                        int var22 = class5.method33(arg5 ^ 0xFFFFFFAC) & 0xFF;
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
                                class13.method65(var15, var19, var21, var25);
                            } else if (var22 == 2) {
                                class13.method75(var15, var19, var17, var25);
                            } else if (var22 == 3) {
                                class13.method65(var23, var19, var21, var25);
                            } else if (var22 == 4) {
                                class13.method75(var15, var24, var17, var25);
                            } else if (var22 == 9) {
                                class13.method65(var15, var19, var21, 16777215);
                                class13.method75(var15, var19, var17, var25);
                            } else if (var22 == 10) {
                                class13.method65(var23, var19, var21, 16777215);
                                class13.method75(var15, var19, var17, var25);
                            } else if (var22 == 11) {
                                class13.method65(var23, var19, var21, 16777215);
                                class13.method75(var15, var24, var17, var25);
                            } else if (var22 == 12) {
                                class13.method65(var15, var19, var21, 16777215);
                                class13.method75(var15, var24, var17, var25);
                            } else if (var22 == 17) {
                                class13.method75(var15, var19, 1, var25);
                            } else if (var22 == 18) {
                                class13.method75(var23, var19, 1, var25);
                            } else if (var22 == 19) {
                                class13.method75(var23, var24, 1, var25);
                            } else if (var22 == 20) {
                                class13.method75(var15, var24, 1, var25);
                            } else if (var22 == 25) {
                                for (int var27 = 0; var27 < var21; var27++) {
                                    class13.method75(var15 + var27, -var27 + var24, 1, var25);
                                }
                            } else if (var22 == 26) {
                                for (int var26 = 0; var26 < var21; var26++) {
                                    class13.method75(var15 + var26, var19 + var26, 1, var25);
                                }
                            }
                        }
                        int var28 = class23.method122(24960) & 0xFF;
                        if (var28 != 0) {
                            this.field18[this.field26] = var28 - 1;
                            this.field21[this.field26] = var17 / 2 + var15;
                            this.field23[this.field26] = var21 / 2 + var19;
                            this.field26++;
                        }
                    }
                    class24.method135(arg5 ^ 0xFFFFFFAB);
                }
            }
        }
        if (arg5 != -21) {
            method10(106, true);
        }
    }

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(IIIIIIIIIII)V", line = 826)
    public final void method15(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (this.field26 == 0) {
            int var12 = arg5 - arg7;
            int var13 = (arg6 - arg0 << 16) / var12;
            int var14 = arg2 - arg3;
            int var15 = (arg4 - arg8 << 16) / var14;
            for (int var16 = 0; var16 < var12; var16++) {
                int var17 = var13 * var16 >> 16;
                int var18 = (var16 + 1) * var13 >> 16;
                int var19 = var18 - var17;
                if (var19 > 0) {
                    class4.method30(63, arg7 + var16, arg3);
                    for (int var20 = 0; var20 < var14; var20++) {
                        int var21 = var15 * var20 >> 16;
                        int var22 = (var20 + 1) * var15 >> 16;
                        int var23 = var22 - var21;
                        if (var23 > 0) {
                            int var24 = class23.method122(24960) & 0xFF;
                            if (var24 != 0) {
                                this.field18[this.field26] = var24 - 1;
                                this.field21[this.field26] = var19 / 2 + var17;
                                this.field23[this.field26] = var23 / 2 + var21;
                                this.field26++;
                            }
                        }
                        class24.method135(-84);
                    }
                }
            }
        }
        for (int var25 = 0; var25 < this.field26; var25++) {
            if (class15.field152[this.field18[var25]] != null) {
                class15.field152[this.field18[var25]].method213(this.field21[var25] - 7, this.field23[var25] + -7);
            }
        }
        if (arg9 > 0) {
            for (int var26 = 0; var26 < this.field26; var26++) {
                if (this.field18[var26] == arg1) {
                    class15.field152[this.field18[var26]].method213(this.field21[var26] - 7, this.field23[var26] - 7);
                    if (arg9 % 10 < 5) {
                        class13.method73(this.field21[var26], this.field23[var26], 15, 16776960, 128);
                        class13.method73(this.field21[var26], this.field23[var26], 7, 16777215, 256);
                    }
                }
            }
        }
        if (arg10 != -7) {
            this.method8(52, null);
        }
        this.field26 = 0;
    }

    @OriginalMember(owner = "mapview!b", name = "b", descriptor = "([BI)V", line = 939)
    private final void method16(byte[] arg0, int arg1) {
        int var3 = 0;
        if (arg1 != -28033) {
            field19 = null;
        }
        while (true) {
            while (var3 < arg0.length) {
                int var4 = (arg0[var3++] & 0xFF) * 64 - class11.field103;
                int var5 = (arg0[var3++] & 0xFF) * 64 - class4.field47;
                if (var4 > 0 && var5 > 0 && class26.field399 > var4 + 64 && class39.field519 > var5 + 64) {
                    for (int var6 = 0; var6 < 64; var6++) {
                        int var7 = class39.field519 - var5 - 1;
                        for (int var8 = -64; var8 < 0; var8++) {
                            while (true) {
                                int var9 = arg0[var3++] & 0xFF;
                                if (var9 == 0) {
                                    break;
                                }
                                if (var9 < 29) {
                                    class34.method227(var4 + var6, 192057510, (byte) var9, class39.field519 - var5 - var8 - 1 - 64, 0);
                                } else if (var9 < 160) {
                                    class34.method227(var4 + var6, 192057510, (byte) (var9 - 28), class39.field519 - var5 - var8 - 64 - 1, 1);
                                } else {
                                    class34.method227(var4 + var6, 192057510, (byte) (var9 - 159), class39.field519 - var8 - var5 - 1 - 64, 2);
                                    if (field12 >= 1500) {
                                        break;
                                    }
                                    this.field14[field12] = var4 + var6;
                                    this.field25[field12] = var7;
                                    this.field10[field12] = var9 - 160;
                                    field12++;
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

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(I[BI)I", line = 1049)
    public static final int method17(int arg0, byte[] arg1, int arg2) {
        if (arg2 != 5702) {
            method17(-46, null, 16);
        }
        return mapview.method141(arg0, arg1, -124, 0);
    }

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(ZIIIIIII[II)V", line = 1062)
    private final void method18(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, int arg9) {
        if (arg5 == 9) {
            arg5 = 1;
            arg6 = arg6 + 1 & 0x3;
        }
        if (arg5 == 10) {
            arg5 = 1;
            arg6 = arg6 + 3 & 0x3;
        }
        if (arg5 == 11) {
            arg6 = arg6 + 3 & 0x3;
            arg5 = 8;
        }
        int var11 = class13.field133 - arg4;
        if (arg5 == 1) {
            if (arg6 == 0) {
                for (int var18 = 0; var18 < arg3; var18++) {
                    for (int var19 = 0; var19 < arg4; var19++) {
                        if (var18 >= var19) {
                            arg8[arg2] = arg9;
                        } else if (arg0) {
                            arg8[arg2] = arg1;
                        }
                        arg2++;
                    }
                    arg2 += var11;
                }
            } else if (arg6 == 1) {
                for (int var16 = arg3 - 1; var16 >= 0; var16--) {
                    for (int var17 = 0; var17 < arg4; var17++) {
                        if (var16 >= var17) {
                            arg8[arg2] = arg9;
                        } else if (arg0) {
                            arg8[arg2] = arg1;
                        }
                        arg2++;
                    }
                    arg2 += var11;
                }
            } else if (arg6 == 2) {
                for (int var12 = 0; var12 < arg3; var12++) {
                    for (int var13 = 0; var13 < arg4; var13++) {
                        if (var12 <= var13) {
                            arg8[arg2] = arg9;
                        } else if (arg0) {
                            arg8[arg2] = arg1;
                        }
                        arg2++;
                    }
                    arg2 += var11;
                }
            } else if (arg6 == 3) {
                for (int var14 = arg3 - 1; var14 >= 0; var14--) {
                    for (int var15 = 0; var15 < arg4; var15++) {
                        if (var15 >= var14) {
                            arg8[arg2] = arg9;
                        } else if (arg0) {
                            arg8[arg2] = arg1;
                        }
                        arg2++;
                    }
                    arg2 += var11;
                }
            }
        } else if (arg5 == 2) {
            if (arg6 == 0) {
                for (int var20 = arg3 - 1; var20 >= 0; var20--) {
                    for (int var21 = 0; var21 < arg4; var21++) {
                        if (var20 >> 1 >= var21) {
                            arg8[arg2] = arg9;
                        } else if (arg0) {
                            arg8[arg2] = arg1;
                        }
                        arg2++;
                    }
                    arg2 += var11;
                }
            } else if (arg6 == 1) {
                for (int var22 = 0; var22 < arg3; var22++) {
                    for (int var23 = 0; var23 < arg4; var23++) {
                        if (var22 << 1 <= var23) {
                            arg8[arg2] = arg9;
                        } else if (arg0) {
                            arg8[arg2] = arg1;
                        }
                        arg2++;
                    }
                    arg2 += var11;
                }
            } else if (arg6 == 2) {
                for (int var24 = 0; var24 < arg3; var24++) {
                    for (int var25 = arg4 - 1; var25 >= 0; var25--) {
                        if (var25 <= var24 >> 1) {
                            arg8[arg2] = arg9;
                        } else if (arg0) {
                            arg8[arg2] = arg1;
                        }
                        arg2++;
                    }
                    arg2 += var11;
                }
            } else if (arg6 == 3) {
                for (int var26 = arg3 - 1; var26 >= 0; var26--) {
                    for (int var27 = arg4 - 1; var27 >= 0; var27--) {
                        if (var27 >= var26 << 1) {
                            arg8[arg2] = arg9;
                        } else if (arg0) {
                            arg8[arg2] = arg1;
                        }
                        arg2++;
                    }
                    arg2 += var11;
                }
            }
        } else if (arg5 == 3) {
            if (arg6 == 0) {
                for (int var28 = arg3 - 1; var28 >= 0; var28--) {
                    for (int var29 = arg4 - 1; var29 >= 0; var29--) {
                        if (var29 <= var28 >> 1) {
                            arg8[arg2] = arg9;
                        } else if (arg0) {
                            arg8[arg2] = arg1;
                        }
                        arg2++;
                    }
                    arg2 += var11;
                }
            } else if (arg6 == 1) {
                for (int var34 = arg3 - 1; var34 >= 0; var34--) {
                    for (int var35 = 0; var35 < arg4; var35++) {
                        if (var35 >= var34 << 1) {
                            arg8[arg2] = arg9;
                        } else if (arg0) {
                            arg8[arg2] = arg1;
                        }
                        arg2++;
                    }
                    arg2 += var11;
                }
            } else if (arg6 == 2) {
                for (int var32 = 0; var32 < arg3; var32++) {
                    for (int var33 = 0; var33 < arg4; var33++) {
                        if (var33 <= var32 >> 1) {
                            arg8[arg2] = arg9;
                        } else if (arg0) {
                            arg8[arg2] = arg1;
                        }
                        arg2++;
                    }
                    arg2 += var11;
                }
            } else if (arg6 == 3) {
                for (int var30 = 0; var30 < arg3; var30++) {
                    for (int var31 = arg4 - 1; var31 >= 0; var31--) {
                        if (var30 << 1 <= var31) {
                            arg8[arg2] = arg9;
                        } else if (arg0) {
                            arg8[arg2] = arg1;
                        }
                        arg2++;
                    }
                    arg2 += var11;
                }
            }
        } else if (arg5 == 4) {
            if (arg6 == 0) {
                for (int var42 = arg3 - 1; var42 >= 0; var42--) {
                    for (int var43 = 0; var43 < arg4; var43++) {
                        if (var43 >= var42 >> 1) {
                            arg8[arg2] = arg9;
                        } else if (arg0) {
                            arg8[arg2] = arg1;
                        }
                        arg2++;
                    }
                    arg2 += var11;
                }
            } else if (arg6 == 1) {
                for (int var40 = 0; var40 < arg3; var40++) {
                    for (int var41 = 0; var41 < arg4; var41++) {
                        if (var41 <= var40 << 1) {
                            arg8[arg2] = arg9;
                        } else if (arg0) {
                            arg8[arg2] = arg1;
                        }
                        arg2++;
                    }
                    arg2 += var11;
                }
            } else if (arg6 == 2) {
                for (int var36 = 0; var36 < arg3; var36++) {
                    for (int var37 = arg4 - 1; var37 >= 0; var37--) {
                        if (var37 >= var36 >> 1) {
                            arg8[arg2] = arg9;
                        } else if (arg0) {
                            arg8[arg2] = arg1;
                        }
                        arg2++;
                    }
                    arg2 += var11;
                }
            } else if (arg6 == 3) {
                for (int var38 = arg3 - 1; var38 >= 0; var38--) {
                    for (int var39 = arg4 - 1; var39 >= 0; var39--) {
                        if (var39 <= var38 << 1) {
                            arg8[arg2] = arg9;
                        } else if (arg0) {
                            arg8[arg2] = arg1;
                        }
                        arg2++;
                    }
                    arg2 += var11;
                }
            }
        } else if (arg5 != 5) {
            if (arg5 == 6) {
                if (arg6 == 0) {
                    for (int var52 = 0; var52 < arg3; var52++) {
                        for (int var53 = 0; var53 < arg4; var53++) {
                            if (var53 <= arg4 / 2) {
                                arg8[arg2] = arg9;
                            } else if (arg0) {
                                arg8[arg2] = arg1;
                            }
                            arg2++;
                        }
                        arg2 += var11;
                    }
                    return;
                }
                if (arg6 == 1) {
                    for (int var58 = 0; var58 < arg3; var58++) {
                        for (int var59 = 0; var59 < arg4; var59++) {
                            if (arg3 / 2 >= var58) {
                                arg8[arg2] = arg9;
                            } else if (arg0) {
                                arg8[arg2] = arg1;
                            }
                            arg2++;
                        }
                        arg2 += var11;
                    }
                    return;
                }
                if (arg6 == 2) {
                    for (int var56 = 0; var56 < arg3; var56++) {
                        for (int var57 = 0; var57 < arg4; var57++) {
                            if (var57 >= arg4 / 2) {
                                arg8[arg2] = arg9;
                            } else if (arg0) {
                                arg8[arg2] = arg1;
                            }
                            arg2++;
                        }
                        arg2 += var11;
                    }
                    return;
                }
                if (arg6 == 3) {
                    for (int var54 = 0; var54 < arg3; var54++) {
                        for (int var55 = 0; var55 < arg4; var55++) {
                            if (arg3 / 2 <= var54) {
                                arg8[arg2] = arg9;
                            } else if (arg0) {
                                arg8[arg2] = arg1;
                            }
                            arg2++;
                        }
                        arg2 += var11;
                    }
                    return;
                }
            }
            if (arg5 == 7) {
                if (arg6 == 0) {
                    for (int var66 = 0; var66 < arg3; var66++) {
                        for (int var67 = 0; var67 < arg4; var67++) {
                            if (var66 - arg3 / 2 >= var67) {
                                arg8[arg2] = arg9;
                            } else if (arg0) {
                                arg8[arg2] = arg1;
                            }
                            arg2++;
                        }
                        arg2 += var11;
                    }
                    return;
                }
                if (arg6 == 1) {
                    for (int var60 = arg3 - 1; var60 >= 0; var60--) {
                        for (int var61 = 0; var61 < arg4; var61++) {
                            if (var61 <= var60 - arg3 / 2) {
                                arg8[arg2] = arg9;
                            } else if (arg0) {
                                arg8[arg2] = arg1;
                            }
                            arg2++;
                        }
                        arg2 += var11;
                    }
                    return;
                }
                if (arg6 == 2) {
                    for (int var62 = arg3 - 1; var62 >= 0; var62--) {
                        for (int var63 = arg4 - 1; var63 >= 0; var63--) {
                            if (var63 <= var62 - arg3 / 2) {
                                arg8[arg2] = arg9;
                            } else if (arg0) {
                                arg8[arg2] = arg1;
                            }
                            arg2++;
                        }
                        arg2 += var11;
                    }
                    return;
                }
                if (arg6 == 3) {
                    for (int var64 = 0; var64 < arg3; var64++) {
                        for (int var65 = arg4 - 1; var65 >= 0; var65--) {
                            if (var64 - arg3 / 2 >= var65) {
                                arg8[arg2] = arg9;
                            } else if (arg0) {
                                arg8[arg2] = arg1;
                            }
                            arg2++;
                        }
                        arg2 += var11;
                    }
                    return;
                }
            }
            if (arg7 < -76 && arg5 == 8) {
                if (arg6 == 0) {
                    for (int var74 = 0; var74 < arg3; var74++) {
                        for (int var75 = 0; var75 < arg4; var75++) {
                            if (var74 - arg3 / 2 <= var75) {
                                arg8[arg2] = arg9;
                            } else if (arg0) {
                                arg8[arg2] = arg1;
                            }
                            arg2++;
                        }
                        arg2 += var11;
                    }
                    return;
                }
                if (arg6 == 1) {
                    for (int var68 = arg3 - 1; var68 >= 0; var68--) {
                        for (int var69 = 0; var69 < arg4; var69++) {
                            if (var69 >= var68 - arg3 / 2) {
                                arg8[arg2] = arg9;
                            } else if (arg0) {
                                arg8[arg2] = arg1;
                            }
                            arg2++;
                        }
                        arg2 += var11;
                    }
                    return;
                }
                if (arg6 == 2) {
                    for (int var72 = arg3 - 1; var72 >= 0; var72--) {
                        for (int var73 = arg4 - 1; var73 >= 0; var73--) {
                            if (var72 - arg3 / 2 <= var73) {
                                arg8[arg2] = arg9;
                            } else if (arg0) {
                                arg8[arg2] = arg1;
                            }
                            arg2++;
                        }
                        arg2 += var11;
                    }
                    return;
                }
                if (arg6 == 3) {
                    for (int var70 = 0; var70 < arg3; var70++) {
                        for (int var71 = arg4 - 1; var71 >= 0; var71--) {
                            if (var70 - arg3 / 2 <= var71) {
                                arg8[arg2] = arg9;
                            } else if (arg0) {
                                arg8[arg2] = arg1;
                            }
                            arg2++;
                        }
                        arg2 += var11;
                    }
                    return;
                }
            }
        } else if (arg6 == 0) {
            for (int var44 = arg3 - 1; var44 >= 0; var44--) {
                for (int var45 = arg4 - 1; var45 >= 0; var45--) {
                    if (var45 >= var44 >> 1) {
                        arg8[arg2] = arg9;
                    } else if (arg0) {
                        arg8[arg2] = arg1;
                    }
                    arg2++;
                }
                arg2 += var11;
            }
        } else if (arg6 == 1) {
            for (int var50 = arg3 - 1; var50 >= 0; var50--) {
                for (int var51 = 0; var51 < arg4; var51++) {
                    if (var51 <= var50 << 1) {
                        arg8[arg2] = arg9;
                    } else if (arg0) {
                        arg8[arg2] = arg1;
                    }
                    arg2++;
                }
                arg2 += var11;
            }
        } else if (arg6 == 2) {
            for (int var48 = 0; var48 < arg3; var48++) {
                for (int var49 = 0; var49 < arg4; var49++) {
                    if (var48 >> 1 <= var49) {
                        arg8[arg2] = arg9;
                    } else if (arg0) {
                        arg8[arg2] = arg1;
                    }
                    arg2++;
                }
                arg2 += var11;
            }
        } else if (arg6 == 3) {
            for (int var46 = 0; var46 < arg3; var46++) {
                for (int var47 = arg4 - 1; var47 >= 0; var47--) {
                    if (var46 << 1 >= var47) {
                        arg8[arg2] = arg9;
                    } else if (arg0) {
                        arg8[arg2] = arg1;
                    }
                    arg2++;
                }
                arg2 += var11;
            }
        }
    }

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(I)V", line = 2190)
    public static void method19(int arg0) {
        field17 = null;
        field8 = null;
        field13 = null;
        field27 = null;
        field16 = null;
        field22 = null;
        field15 = null;
        field19 = null;
        if (arg0 != 3) {
            method6(true);
        }
    }

    @OriginalMember(owner = "mapview!b", name = "b", descriptor = "(IIIIIIIII)V", line = 2236)
    public final void method20(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var10 = arg8 - arg5;
        if (arg0 >= -20) {
            this.method12(null, null, false);
        }
        int var11 = arg6 - arg7;
        int var12 = (arg4 - arg3 << 16) / var10;
        int var13 = (arg2 - arg1 << 16) / var11;
        for (int var14 = 0; var14 < var10; var14++) {
            int var15 = (var14 + 1) * var12 >> 16;
            int var16 = var12 * var14 >> 16;
            int var17 = var15 - var16;
            if (var17 > 0) {
                int var18 = arg3 + var16;
                class4.method30(63, var14 + arg5, arg7);
                int var19 = arg3 + var15;
                for (int var20 = 0; var20 < var11; var20++) {
                    int var21 = (var20 + 1) * var13 >> 16;
                    int var22 = var13 * var20 >> 16;
                    int var23 = var21 - var22;
                    if (var23 > 0) {
                        int var24 = arg1 + var22;
                        int var25 = arg1 + var21;
                        int var26 = class38.method243(255);
                        int var27 = class33.method220(1);
                        if (var26 == 0 && var27 == 0) {
                            class13.method76(var18, var24, var19 - var18, -var24 + var25, class22.method120((byte) 55));
                        } else {
                            byte var28 = class29.method205(-1);
                            int var29 = var28 & 0xFC;
                            if (var29 == 0 || var17 <= 1 || var23 <= 1) {
                                class13.method76(var18, var24, var17, var23, var26);
                            } else {
                                this.method18(true, class22.method120((byte) 72), class13.field133 * var24 + var18, var23, var17, var29 >> 2, var28 & 0x3, -103, class13.field128, var26);
                            }
                            if (var27 > 0) {
                                byte var30 = class40.method247(true);
                                int var31 = var30 & 0xFC;
                                if (var31 == 0 || var17 <= 1 || var23 <= 1) {
                                    class13.method76(var18, var24, var17, var23, var27);
                                }
                                this.method18(var26 == 0, class22.method120((byte) 31), class13.field133 * var24 + var18, var23, var17, var31 >> 2, var30 & 0x3, -112, class13.field128, var27);
                            }
                        }
                    }
                    class24.method135(121);
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(III)V", line = 2327)
    private final void method21(int arg0, int arg1, int arg2) {
        if (arg2 <= 22) {
            return;
        }
        int var4 = arg0 >> 6;
        int var5 = arg1 >> 6;
        class25.field388 = new class38[var5][var4];
        class38.field506[3] = new byte[var5][var4][];
        class38.field506[4] = new byte[var5][var4][];
        class38.field506[0] = new byte[var5][var4][];
        class38.field506[1] = new byte[var5][var4][];
        class8.field79 = new class38[var5][var4];
        class23.field246 = new int[var5][var4][];
        class38.field506[2] = new byte[var5][var4][];
    }
}
