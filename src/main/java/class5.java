import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!c")
public class class5 {

    @OriginalMember(owner = "mapview!c", name = "i", descriptor = "[I")
    private int[] field51 = new int[1500];

    @OriginalMember(owner = "mapview!c", name = "b", descriptor = "[I")
    private int[] field44 = new int[1500];

    @OriginalMember(owner = "mapview!c", name = "e", descriptor = "[I")
    public int[] field47 = new int[1500];

    @OriginalMember(owner = "mapview!c", name = "h", descriptor = "[I")
    public int[] field50 = new int[1500];

    @OriginalMember(owner = "mapview!c", name = "m", descriptor = "[I")
    public int[] field55 = new int[1500];

    @OriginalMember(owner = "mapview!c", name = "o", descriptor = "I")
    private int field57 = 0;

    @OriginalMember(owner = "mapview!c", name = "q", descriptor = "[I")
    private int[] field59 = new int[1500];

    @OriginalMember(owner = "mapview!c", name = "c", descriptor = "Lt;")
    public static class36 field45 = class3.method8(13631, "Clothes Shop");

    @OriginalMember(owner = "mapview!c", name = "g", descriptor = "Lt;")
    public static class36 field49 = class3.method8(13631, "Sword Shop");

    @OriginalMember(owner = "mapview!c", name = "f", descriptor = "[[B")
    public static byte[][] field48 = new byte[1000][];

    @OriginalMember(owner = "mapview!c", name = "k", descriptor = "Lt;")
    public static class36 field53 = class3.method8(13631, " ");

    @OriginalMember(owner = "mapview!c", name = "j", descriptor = "[[B")
    public static byte[][] field52 = new byte[250][];

    @OriginalMember(owner = "mapview!c", name = "d", descriptor = "Lt;")
    public static class36 field46 = class3.method8(13631, "Prev page");

    @OriginalMember(owner = "mapview!c", name = "l", descriptor = "Lt;")
    public static class36 field54 = class3.method8(13631, "-5bersicht");

    @OriginalMember(owner = "mapview!c", name = "p", descriptor = "Lt;")
    public static class36 field58 = class3.method8(13631, "Please wait)3)3)3 Rendering Map");

    @OriginalMember(owner = "mapview!c", name = "n", descriptor = "I")
    public static int field56;

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "[Lqa;")
    public static class31[] field43;

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "([BZ[[B)V", line = 6)
    private final void method11(byte[] arg0, boolean arg1, byte[][] arg2) {
        int var4 = 0;
        while (true) {
            while (var4 < arg0.length) {
                int var5 = (arg0[var4++] & 0xFF) * 64 - class19.field231;
                int var6 = (arg0[var4++] & 0xFF) * 64 - class27.field404;
                if (var5 > 0 && var6 > 0 && class6.field71 > var5 + 64 && class6.field66 > var6 + 64) {
                    for (int var7 = 0; var7 < 64; var7++) {
                        byte[] var8 = arg2[var5 + var7];
                        int var9 = class6.field66 - var6 - 1;
                        for (int var10 = -64; var10 < 0; var10++) {
                            var8[var9--] = arg0[var4++];
                        }
                    }
                } else {
                    var4 += 4096;
                }
            }
            if (arg1) {
                field46 = null;
            }
            return;
        }
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(IIIIIIIIZII)V", line = 56)
    public final void method12(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9, int arg10) {
        if (this.field57 == 0) {
            int var12 = arg4 - arg6;
            int var13 = arg0 - arg3;
            int var14 = (arg1 - arg7 << 16) / var12;
            int var15 = (arg5 - arg2 << 16) / var13;
            for (int var16 = 0; var16 < var12; var16++) {
                int var17 = var14 * var16 >> 16;
                int var18 = (var16 + 1) * var14 >> 16;
                int var19 = var18 - var17;
                if (var19 > 0) {
                    class17.method92(arg3, arg6 + var16, 14737);
                    for (int var20 = 0; var20 < var13; var20++) {
                        int var21 = var15 * var20 >> 16;
                        int var22 = (var20 + 1) * var15 >> 16;
                        int var23 = var22 - var21;
                        if (var23 > 0) {
                            int var24 = class7.method27(-105) & 0xFF;
                            if (var24 != 0) {
                                this.field44[this.field57] = var24 - 1;
                                this.field59[this.field57] = var19 / 2 + var17;
                                this.field51[this.field57] = var23 / 2 + var21;
                                this.field57++;
                            }
                        }
                        class19.method107(0);
                    }
                }
            }
        }
        if (!arg8) {
            field56 = -101;
        }
        for (int var25 = 0; var25 < this.field57; var25++) {
            if (field43[this.field44[var25]] != null) {
                field43[this.field44[var25]].method180(this.field59[var25] - 7, this.field51[var25] + -7);
            }
        }
        if (arg9 > 0) {
            for (int var26 = 0; var26 < this.field57; var26++) {
                if (this.field44[var26] == arg10) {
                    field43[this.field44[var26]].method180(this.field59[var26] - 7, this.field51[var26] - 7);
                    if (arg9 % 10 < 5) {
                        class37.method221(this.field59[var26], this.field51[var26], 15, 16776960, 128);
                        class37.method221(this.field59[var26], this.field51[var26], 7, 16777215, 256);
                    }
                }
            }
        }
        this.field57 = 0;
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(IIIIIIIIZ)V", line = 167)
    public final void method13(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        int var10 = arg6 - arg4;
        int var11 = arg5 - arg3;
        if (!arg8) {
            this.method13(-3, -57, -121, 70, -51, -69, 55, -38, false);
        }
        int var12 = (arg7 - arg0 << 16) / var11;
        int var13 = (arg2 - arg1 << 16) / var10;
        for (int var14 = 0; var14 < var10; var14++) {
            int var15 = (var14 + 1) * var13 >> 16;
            int var16 = var13 * var14 >> 16;
            int var17 = var15 - var16;
            if (var17 > 0) {
                class17.method92(arg3, var14 + arg4, 14737);
                int var18 = arg1 + var16;
                int var19 = arg1 + var15;
                for (int var20 = 0; var20 < var11; var20++) {
                    int var21 = var12 * var20 >> 16;
                    int var22 = (var20 + 1) * var12 >> 16;
                    int var23 = var22 - var21;
                    if (var23 > 0) {
                        int var24 = arg0 + var22;
                        int var25 = arg0 + var21;
                        int var26 = class9.method39(false);
                        int var27 = class24.method130(-1);
                        if (var26 == 0 && var27 == 0) {
                            class37.method226(var18, var25, var19 - var18, -var25 + var24, class36.method210(118));
                        } else {
                            byte var28 = class39.method257((byte) 126);
                            int var29 = var28 & 0xFC;
                            if (var29 == 0 || var17 <= 1 || var23 <= 1) {
                                class37.method226(var18, var25, var17, var23, var26);
                            } else {
                                this.method20(class37.field502 * var25 + var18, true, var23, class37.field501, var26, var28 & 0x3, -93, var17, class36.method210(107), var29 >> 2);
                            }
                            if (var27 > 0) {
                                byte var30 = class4.method10(0);
                                int var31 = var30 & 0xFC;
                                if (var31 == 0 || var17 <= 1 || var23 <= 1) {
                                    class37.method226(var18, var25, var17, var23, var27);
                                }
                                this.method20(class37.field502 * var25 + var18, var26 == 0, var23, class37.field501, var27, var30 & 0x3, -125, var17, class36.method210(105), var31 >> 2);
                            }
                        }
                    }
                    class19.method107(0);
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(III)V", line = 257)
    private final void method14(int arg0, int arg1, int arg2) {
        if (arg2 != 31850) {
            this.method14(55, 91, -43);
        }
        int var4 = arg1 >> 6;
        int var5 = arg0 >> 6;
        class8.field88[2] = new byte[var5][var4][];
        class8.field88[0] = new byte[var5][var4][];
        class8.field88[4] = new byte[var5][var4][];
        class8.field88[3] = new byte[var5][var4][];
        class9.field94 = new class41[var5][var4];
        class20.field253 = new int[var5][var4][];
        class8.field88[1] = new byte[var5][var4][];
        class4.field39 = new class41[var5][var4];
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(Lda;B)V", line = 277)
    public final void method15(class7 arg0, byte arg1) {
        class39 var3 = new class39(arg0.method101(0, class27.field406, class40.field533));
        int var4 = var3.method254(65280);
        int var5 = var3.method254(65280);
        int var6 = var3.method254(65280);
        int var7 = var3.method254(65280);
        int var8 = var3.method254(65280);
        int var9 = var3.method254(65280);
        var3.method249((byte) 39);
        class27.field404 = var5 * 64;
        class19.field231 = var4 * 64;
        class6.field66 = (var7 + 1 - var5) * 64;
        class17.field221 = var8 * 64 - class19.field231;
        class6.field71 = (var6 - var4) * 64 + 64;
        class15.field175 = class27.field404 + class6.field66 - var9 * 64;
        this.method14(class6.field66, class6.field71, 31850);
        class39 var10 = new class39(arg0.method101(0, class27.field406, class26.field400));
        int var11 = var10.method254(65280);
        class24.field288 = new int[var11 + 1];
        for (int var12 = 0; var12 < var11; var12++) {
            class24.field288[var12 + 1] = var10.method255(8080);
        }
        int var13 = var10.method254(65280);
        class7.field75 = new int[var13 + 1];
        for (int var14 = 0; var14 < var13; var14++) {
            class7.field75[var14 + 1] = var10.method255(8080);
        }
        if (arg1 >= -61) {
            this.method20(-114, false, -50, null, 112, 118, -20, 57, -71, 118);
        }
        byte[] var15 = arg0.method101(0, class27.field406, class24.field287);
        byte[][] var16 = new byte[class6.field71][class6.field66];
        this.method11(var15, false, var16);
        byte[] var17 = arg0.method101(0, class27.field406, class2.field13);
        this.method22(-10169, var17);
        byte[] var18 = arg0.method101(0, class27.field406, class36.field488);
        this.method23(-290, var18);
        byte[] var19 = arg0.method101(0, class27.field406, class8.field83);
        class2.field12 = 0;
        this.method24((byte) 118, var19);
        this.method19(var16, -51);
        if (class20.field259) {
        }
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(B)V", line = 354)
    public static void method16(byte arg0) {
        field46 = null;
        field45 = null;
        field43 = null;
        field49 = null;
        if (arg0 < 89) {
            field52 = null;
        }
        field52 = null;
        field53 = null;
        field54 = null;
        field58 = null;
        field48 = null;
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(IIIIIIIII)V", line = 372)
    public final void method17(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field57 = 0;
        int var10 = arg2 - arg3;
        int var11 = arg5 - arg8;
        if (arg0 != 19) {
            return;
        }
        int var12 = (arg7 - arg1 << 16) / var10;
        int var13 = (arg4 - arg6 << 16) / var11;
        for (int var14 = 0; var14 < var10; var14++) {
            int var15 = var12 * var14 >> 16;
            int var16 = (var14 + 1) * var12 >> 16;
            int var17 = var16 - var15;
            if (var17 > 0) {
                class17.method92(arg8, var14 + arg3, arg0 + 14718);
                for (int var18 = 0; var18 < var11; var18++) {
                    int var19 = var13 * var18 >> 16;
                    int var20 = (var18 + 1) * var13 >> 16;
                    int var21 = var20 - var19;
                    if (var21 > 0) {
                        int var22 = class27.method162(0) & 0xFF;
                        if (var22 != 0) {
                            int var23;
                            if (var17 == 1) {
                                var23 = var15;
                            } else {
                                var23 = var16 - 1;
                            }
                            int var24 = 13421772;
                            int var25;
                            if (var21 == 1) {
                                var25 = var19;
                            } else {
                                var25 = var20 - 1;
                            }
                            if (var22 >= 5 && var22 <= 8 || var22 >= 13 && var22 <= 16 || var22 >= 21 && var22 <= 24 || var22 == 27 || var22 == 28) {
                                var22 -= 4;
                                var24 = 13369344;
                            }
                            if (var22 == 1) {
                                class37.method228(var15, var19, var21, var24);
                            } else if (var22 == 2) {
                                class37.method231(var15, var19, var17, var24);
                            } else if (var22 == 3) {
                                class37.method228(var23, var19, var21, var24);
                            } else if (var22 == 4) {
                                class37.method231(var15, var25, var17, var24);
                            } else if (var22 == 9) {
                                class37.method228(var15, var19, var21, 16777215);
                                class37.method231(var15, var19, var17, var24);
                            } else if (var22 == 10) {
                                class37.method228(var23, var19, var21, 16777215);
                                class37.method231(var15, var19, var17, var24);
                            } else if (var22 == 11) {
                                class37.method228(var23, var19, var21, 16777215);
                                class37.method231(var15, var25, var17, var24);
                            } else if (var22 == 12) {
                                class37.method228(var15, var19, var21, 16777215);
                                class37.method231(var15, var25, var17, var24);
                            } else if (var22 == 17) {
                                class37.method231(var15, var19, 1, var24);
                            } else if (var22 == 18) {
                                class37.method231(var23, var19, 1, var24);
                            } else if (var22 == 19) {
                                class37.method231(var23, var25, 1, var24);
                            } else if (var22 == 20) {
                                class37.method231(var15, var25, 1, var24);
                            } else if (var22 == 25) {
                                for (int var26 = 0; var26 < var21; var26++) {
                                    class37.method231(var15 + var26, -var26 + var25, 1, var24);
                                }
                            } else if (var22 == 26) {
                                for (int var27 = 0; var27 < var21; var27++) {
                                    class37.method231(var15 + var27, var19 + var27, 1, var24);
                                }
                            }
                        }
                        int var28 = class7.method27(58) & 0xFF;
                        if (var28 != 0) {
                            this.field44[this.field57] = var28 - 1;
                            this.field59[this.field57] = var17 / 2 + var15;
                            this.field51[this.field57] = var19 + var21 / 2;
                            this.field57++;
                        }
                    }
                    class19.method107(0);
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(Ljava/awt/Component;Z)V", line = 565)
    public static final void method18(Component arg0, boolean arg1) {
        if (arg1) {
            arg0.removeKeyListener(class20.field248);
            arg0.removeFocusListener(class20.field248);
            class2.field16 = -1;
        }
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "([[BI)V", line = 593)
    private final void method19(byte[][] arg0, int arg1) {
        int var3 = class6.field66;
        int[] var4 = new int[var3];
        int var5 = class6.field71;
        for (int var6 = 0; var6 < var3; var6++) {
            var4[var6] = 0;
        }
        if (arg1 > -27) {
            this.method21(-65, 1.552446685497734D, 0.26171182715542624D, -1.1777378129059177D);
        }
        for (int var7 = 5; var7 < var5 - 5; var7++) {
            byte[] var8 = arg0[var7 + 5];
            byte[] var9 = arg0[var7 - 5];
            for (int var10 = 0; var10 < var3; var10++) {
                int var11 = class24.field288[var8[var10] & 0xFF];
                int var12 = class24.field288[var9[var10] & 0xFF];
                if (var11 <= 0 && class27.method163(var10, 4032, var7 + 5) > 0) {
                    var11 = 64;
                }
                if (var12 <= 0 && class27.method163(var10, 4032, var7 - 5) > 0) {
                    var12 = 64;
                }
                var4[var10] += var11 - var12;
            }
            if (var7 > 10 && var5 - 10 > var7) {
                int var13 = 0;
                int var14 = 0;
                int var15 = 0;
                for (int var16 = 5; var16 < var3 - 5; var16++) {
                    int var17 = var4[var16 - 5];
                    int var18 = var4[var16 + 5];
                    var15 += (var18 >> 20) - (var17 >> 20);
                    var13 += (var18 >> 10 & 0x3FF) - ((var17 & 0xFFC2D) >> 10);
                    var14 += (var18 & 0x3FF) - (var17 & 0x3FF);
                    if (var14 > 0) {
                        int var19 = var16 >> 6;
                        int var20 = var7 >> 6;
                        if (class20.field253[var19][var20] == null) {
                            class20.field253[var19][var20] = new int[4096];
                        }
                        if ((arg0[var7][var16] & 0xFF) > 0) {
                            class20.field253[var19][var20][class19.method97(63, var7) + (class19.method97(63, var16) << 6)] = this.method21(-23509, (double) var14 / 8533.0D, (double) var15 / 8533.0D, (double) var13 / 8533.0D);
                        } else {
                            class20.field253[var19][var20][class19.method97(63, var7) + class19.method97(4032, var16 << 6)] = 0;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(IZI[IIIIIII)V", line = 704)
    private final void method20(int arg0, boolean arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var11 = class37.field502 - arg7;
        if (arg9 == 9) {
            arg5 = arg5 + 1 & 0x3;
            arg9 = 1;
        }
        if (arg9 == 10) {
            arg9 = 1;
            arg5 = arg5 + 3 & 0x3;
        }
        if (arg9 == 11) {
            arg9 = 8;
            arg5 = arg5 + 3 & 0x3;
        }
        if (arg9 == 1) {
            if (arg5 == 0) {
                for (int var12 = 0; var12 < arg2; var12++) {
                    for (int var13 = 0; var13 < arg7; var13++) {
                        if (var12 >= var13) {
                            arg3[arg0] = arg4;
                        } else if (arg1) {
                            arg3[arg0] = arg8;
                        }
                        arg0++;
                    }
                    arg0 += var11;
                }
            } else if (arg5 == 1) {
                for (int var18 = arg2 - 1; var18 >= 0; var18--) {
                    for (int var19 = 0; var19 < arg7; var19++) {
                        if (var19 <= var18) {
                            arg3[arg0] = arg4;
                        } else if (arg1) {
                            arg3[arg0] = arg8;
                        }
                        arg0++;
                    }
                    arg0 += var11;
                }
            } else if (arg5 == 2) {
                for (int var16 = 0; var16 < arg2; var16++) {
                    for (int var17 = 0; var17 < arg7; var17++) {
                        if (var16 <= var17) {
                            arg3[arg0] = arg4;
                        } else if (arg1) {
                            arg3[arg0] = arg8;
                        }
                        arg0++;
                    }
                    arg0 += var11;
                }
            } else if (arg5 == 3) {
                for (int var14 = arg2 - 1; var14 >= 0; var14--) {
                    for (int var15 = 0; var15 < arg7; var15++) {
                        if (var15 >= var14) {
                            arg3[arg0] = arg4;
                        } else if (arg1) {
                            arg3[arg0] = arg8;
                        }
                        arg0++;
                    }
                    arg0 += var11;
                }
            }
        } else if (arg9 == 2) {
            if (arg5 == 0) {
                for (int var20 = arg2 - 1; var20 >= 0; var20--) {
                    for (int var21 = 0; var21 < arg7; var21++) {
                        if (var20 >> 1 >= var21) {
                            arg3[arg0] = arg4;
                        } else if (arg1) {
                            arg3[arg0] = arg8;
                        }
                        arg0++;
                    }
                    arg0 += var11;
                }
            } else if (arg5 == 1) {
                for (int var22 = 0; var22 < arg2; var22++) {
                    for (int var23 = 0; var23 < arg7; var23++) {
                        if (var23 >= var22 << 1) {
                            arg3[arg0] = arg4;
                        } else if (arg1) {
                            arg3[arg0] = arg8;
                        }
                        arg0++;
                    }
                    arg0 += var11;
                }
            } else if (arg5 == 2) {
                for (int var26 = 0; var26 < arg2; var26++) {
                    for (int var27 = arg7 - 1; var27 >= 0; var27--) {
                        if (var26 >> 1 >= var27) {
                            arg3[arg0] = arg4;
                        } else if (arg1) {
                            arg3[arg0] = arg8;
                        }
                        arg0++;
                    }
                    arg0 += var11;
                }
            } else if (arg5 == 3) {
                for (int var24 = arg2 - 1; var24 >= 0; var24--) {
                    for (int var25 = arg7 - 1; var25 >= 0; var25--) {
                        if (var24 << 1 <= var25) {
                            arg3[arg0] = arg4;
                        } else if (arg1) {
                            arg3[arg0] = arg8;
                        }
                        arg0++;
                    }
                    arg0 += var11;
                }
            }
        } else if (arg9 != 3) {
            if (arg6 >= -85) {
                field56 = -15;
            }
            if (arg9 == 4) {
                if (arg5 == 0) {
                    for (int var68 = arg2 - 1; var68 >= 0; var68--) {
                        for (int var69 = 0; var69 < arg7; var69++) {
                            if (var68 >> 1 <= var69) {
                                arg3[arg0] = arg4;
                            } else if (arg1) {
                                arg3[arg0] = arg8;
                            }
                            arg0++;
                        }
                        arg0 += var11;
                    }
                } else if (arg5 == 1) {
                    for (int var70 = 0; var70 < arg2; var70++) {
                        for (int var71 = 0; var71 < arg7; var71++) {
                            if (var70 << 1 >= var71) {
                                arg3[arg0] = arg4;
                            } else if (arg1) {
                                arg3[arg0] = arg8;
                            }
                            arg0++;
                        }
                        arg0 += var11;
                    }
                } else if (arg5 == 2) {
                    for (int var74 = 0; var74 < arg2; var74++) {
                        for (int var75 = arg7 - 1; var75 >= 0; var75--) {
                            if (var74 >> 1 <= var75) {
                                arg3[arg0] = arg4;
                            } else if (arg1) {
                                arg3[arg0] = arg8;
                            }
                            arg0++;
                        }
                        arg0 += var11;
                    }
                } else if (arg5 == 3) {
                    for (int var72 = arg2 - 1; var72 >= 0; var72--) {
                        for (int var73 = arg7 - 1; var73 >= 0; var73--) {
                            if (var73 <= var72 << 1) {
                                arg3[arg0] = arg4;
                            } else if (arg1) {
                                arg3[arg0] = arg8;
                            }
                            arg0++;
                        }
                        arg0 += var11;
                    }
                }
            } else if (arg9 != 5) {
                if (arg9 == 6) {
                    if (arg5 == 0) {
                        for (int var66 = 0; var66 < arg2; var66++) {
                            for (int var67 = 0; var67 < arg7; var67++) {
                                if (arg7 / 2 >= var67) {
                                    arg3[arg0] = arg4;
                                } else if (arg1) {
                                    arg3[arg0] = arg8;
                                }
                                arg0++;
                            }
                            arg0 += var11;
                        }
                        return;
                    }
                    if (arg5 == 1) {
                        for (int var64 = 0; var64 < arg2; var64++) {
                            for (int var65 = 0; var65 < arg7; var65++) {
                                if (arg2 / 2 >= var64) {
                                    arg3[arg0] = arg4;
                                } else if (arg1) {
                                    arg3[arg0] = arg8;
                                }
                                arg0++;
                            }
                            arg0 += var11;
                        }
                        return;
                    }
                    if (arg5 == 2) {
                        for (int var62 = 0; var62 < arg2; var62++) {
                            for (int var63 = 0; var63 < arg7; var63++) {
                                if (var63 >= arg7 / 2) {
                                    arg3[arg0] = arg4;
                                } else if (arg1) {
                                    arg3[arg0] = arg8;
                                }
                                arg0++;
                            }
                            arg0 += var11;
                        }
                        return;
                    }
                    if (arg5 == 3) {
                        for (int var60 = 0; var60 < arg2; var60++) {
                            for (int var61 = 0; var61 < arg7; var61++) {
                                if (arg2 / 2 <= var60) {
                                    arg3[arg0] = arg4;
                                } else if (arg1) {
                                    arg3[arg0] = arg8;
                                }
                                arg0++;
                            }
                            arg0 += var11;
                        }
                        return;
                    }
                }
                if (arg9 == 7) {
                    if (arg5 == 0) {
                        for (int var44 = 0; var44 < arg2; var44++) {
                            for (int var45 = 0; var45 < arg7; var45++) {
                                if (var44 - arg2 / 2 >= var45) {
                                    arg3[arg0] = arg4;
                                } else if (arg1) {
                                    arg3[arg0] = arg8;
                                }
                                arg0++;
                            }
                            arg0 += var11;
                        }
                        return;
                    }
                    if (arg5 == 1) {
                        for (int var50 = arg2 - 1; var50 >= 0; var50--) {
                            for (int var51 = 0; var51 < arg7; var51++) {
                                if (var50 - arg2 / 2 >= var51) {
                                    arg3[arg0] = arg4;
                                } else if (arg1) {
                                    arg3[arg0] = arg8;
                                }
                                arg0++;
                            }
                            arg0 += var11;
                        }
                        return;
                    }
                    if (arg5 == 2) {
                        for (int var46 = arg2 - 1; var46 >= 0; var46--) {
                            for (int var47 = arg7 - 1; var47 >= 0; var47--) {
                                if (var46 - arg2 / 2 >= var47) {
                                    arg3[arg0] = arg4;
                                } else if (arg1) {
                                    arg3[arg0] = arg8;
                                }
                                arg0++;
                            }
                            arg0 += var11;
                        }
                        return;
                    }
                    if (arg5 == 3) {
                        for (int var48 = 0; var48 < arg2; var48++) {
                            for (int var49 = arg7 - 1; var49 >= 0; var49--) {
                                if (var48 - arg2 / 2 >= var49) {
                                    arg3[arg0] = arg4;
                                } else if (arg1) {
                                    arg3[arg0] = arg8;
                                }
                                arg0++;
                            }
                            arg0 += var11;
                        }
                        return;
                    }
                }
                if (arg9 == 8) {
                    if (arg5 == 0) {
                        for (int var52 = 0; var52 < arg2; var52++) {
                            for (int var53 = 0; var53 < arg7; var53++) {
                                if (var53 >= var52 - arg2 / 2) {
                                    arg3[arg0] = arg4;
                                } else if (arg1) {
                                    arg3[arg0] = arg8;
                                }
                                arg0++;
                            }
                            arg0 += var11;
                        }
                        return;
                    }
                    if (arg5 == 1) {
                        for (int var58 = arg2 - 1; var58 >= 0; var58--) {
                            for (int var59 = 0; var59 < arg7; var59++) {
                                if (var58 - arg2 / 2 <= var59) {
                                    arg3[arg0] = arg4;
                                } else if (arg1) {
                                    arg3[arg0] = arg8;
                                }
                                arg0++;
                            }
                            arg0 += var11;
                        }
                        return;
                    }
                    if (arg5 == 2) {
                        for (int var56 = arg2 - 1; var56 >= 0; var56--) {
                            for (int var57 = arg7 - 1; var57 >= 0; var57--) {
                                if (var56 - arg2 / 2 <= var57) {
                                    arg3[arg0] = arg4;
                                } else if (arg1) {
                                    arg3[arg0] = arg8;
                                }
                                arg0++;
                            }
                            arg0 += var11;
                        }
                        return;
                    }
                    if (arg5 == 3) {
                        for (int var54 = 0; var54 < arg2; var54++) {
                            for (int var55 = arg7 - 1; var55 >= 0; var55--) {
                                if (var54 - arg2 / 2 <= var55) {
                                    arg3[arg0] = arg4;
                                } else if (arg1) {
                                    arg3[arg0] = arg8;
                                }
                                arg0++;
                            }
                            arg0 += var11;
                        }
                        return;
                    }
                }
            } else if (arg5 == 0) {
                for (int var36 = arg2 - 1; var36 >= 0; var36--) {
                    for (int var37 = arg7 - 1; var37 >= 0; var37--) {
                        if (var37 >= var36 >> 1) {
                            arg3[arg0] = arg4;
                        } else if (arg1) {
                            arg3[arg0] = arg8;
                        }
                        arg0++;
                    }
                    arg0 += var11;
                }
            } else if (arg5 == 1) {
                for (int var42 = arg2 - 1; var42 >= 0; var42--) {
                    for (int var43 = 0; var43 < arg7; var43++) {
                        if (var42 << 1 >= var43) {
                            arg3[arg0] = arg4;
                        } else if (arg1) {
                            arg3[arg0] = arg8;
                        }
                        arg0++;
                    }
                    arg0 += var11;
                }
            } else if (arg5 == 2) {
                for (int var38 = 0; var38 < arg2; var38++) {
                    for (int var39 = 0; var39 < arg7; var39++) {
                        if (var39 >= var38 >> 1) {
                            arg3[arg0] = arg4;
                        } else if (arg1) {
                            arg3[arg0] = arg8;
                        }
                        arg0++;
                    }
                    arg0 += var11;
                }
            } else if (arg5 == 3) {
                for (int var40 = 0; var40 < arg2; var40++) {
                    for (int var41 = arg7 - 1; var41 >= 0; var41--) {
                        if (var40 << 1 >= var41) {
                            arg3[arg0] = arg4;
                        } else if (arg1) {
                            arg3[arg0] = arg8;
                        }
                        arg0++;
                    }
                    arg0 += var11;
                }
            }
        } else if (arg5 == 0) {
            for (int var34 = arg2 - 1; var34 >= 0; var34--) {
                for (int var35 = arg7 - 1; var35 >= 0; var35--) {
                    if (var34 >> 1 >= var35) {
                        arg3[arg0] = arg4;
                    } else if (arg1) {
                        arg3[arg0] = arg8;
                    }
                    arg0++;
                }
                arg0 += var11;
            }
        } else if (arg5 == 1) {
            for (int var32 = arg2 - 1; var32 >= 0; var32--) {
                for (int var33 = 0; var33 < arg7; var33++) {
                    if (var33 >= var32 << 1) {
                        arg3[arg0] = arg4;
                    } else if (arg1) {
                        arg3[arg0] = arg8;
                    }
                    arg0++;
                }
                arg0 += var11;
            }
        } else if (arg5 == 2) {
            for (int var28 = 0; var28 < arg2; var28++) {
                for (int var29 = 0; var29 < arg7; var29++) {
                    if (var29 <= var28 >> 1) {
                        arg3[arg0] = arg4;
                    } else if (arg1) {
                        arg3[arg0] = arg8;
                    }
                    arg0++;
                }
                arg0 += var11;
            }
        } else if (arg5 == 3) {
            for (int var30 = 0; var30 < arg2; var30++) {
                for (int var31 = arg7 - 1; var31 >= 0; var31--) {
                    if (var31 >= var30 << 1) {
                        arg3[arg0] = arg4;
                    } else if (arg1) {
                        arg3[arg0] = arg8;
                    }
                    arg0++;
                }
                arg0 += var11;
            }
        }
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(IDDD)I", line = 1836)
    private final int method21(int arg0, double arg1, double arg2, double arg3) {
        double var8 = arg1;
        double var10 = arg1;
        double var12 = arg1;
        if (arg3 != 0.0D) {
            double var14;
            if (arg1 < 0.5D) {
                var14 = (arg3 + 1.0D) * arg1;
            } else {
                var14 = arg1 + arg3 - arg1 * arg3;
            }
            double var16 = arg2 + 0.3333333333333333D;
            double var18 = arg2 - 0.3333333333333333D;
            if (var18 < 0.0D) {
                var18++;
            }
            double var20 = arg1 * 2.0D - var14;
            if (var18 * 6.0D < 1.0D) {
                var12 = (var14 - var20) * 6.0D * var18 + var20;
            } else if (var18 * 2.0D < 1.0D) {
                var12 = var14;
            } else if (var18 * 3.0D < 2.0D) {
                var12 = (0.6666666666666666D - var18) * (-var20 + var14) * 6.0D + var20;
            } else {
                var12 = var20;
            }
            if (arg2 * 6.0D < 1.0D) {
                var8 = (var14 - var20) * 6.0D * arg2 + var20;
            } else if (arg2 * 2.0D < 1.0D) {
                var8 = var14;
            } else if (arg2 * 3.0D < 2.0D) {
                var8 = (var14 - var20) * (-arg2 + 0.6666666666666666D) * 6.0D + var20;
            } else {
                var8 = var20;
            }
            if (var16 > 1.0D) {
                var16--;
            }
            if (var16 * 6.0D < 1.0D) {
                var10 = (var14 - var20) * 6.0D * var16 + var20;
            } else if (var16 * 2.0D < 1.0D) {
                var10 = var14;
            } else if (var16 * 3.0D < 2.0D) {
                var10 = (0.6666666666666666D - var16) * (-var20 + var14) * 6.0D + var20;
            } else {
                var10 = var20;
            }
        }
        if (arg0 != -23509) {
            this.method21(-61, -2.6279736590022593D, -0.9577791869076775D, -0.34208156313731375D);
        }
        int var24 = (int) (var10 * 256.0D);
        int var25 = (int) (var8 * 256.0D);
        int var26 = (int) (var12 * 256.0D);
        return (var24 << 16) + (var25 << 8) + var26;
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(I[B)V", line = 1927)
    private final void method22(int arg0, byte[] arg1) {
        int var3 = 0;
        if (arg0 != -10169) {
            this.method14(99, 43, 80);
        }
        while (true) {
            while (arg1.length > var3) {
                int var4 = (arg1[var3++] & 0xFF) * 64 - class19.field231;
                int var5 = (arg1[var3++] & 0xFF) * 64 - class27.field404;
                if (var4 > 0 && var5 > 0 && var4 + 64 < class6.field71 && class6.field66 > var5 + 64) {
                    class2.field10 = var4 >> 6;
                    class1.field7 = class6.field66 - var5 - 1 >> 6;
                    for (int var6 = 0; var6 < 64; var6++) {
                        for (int var7 = -64; var7 < 0; var7++) {
                            int var8 = arg1[var3++] & 0xFF;
                            if (var8 != 0) {
                                byte var9 = arg1[var3++];
                                class26.method158((byte) -4, var9, var4 + var6, 3, class6.field66 - var5 - var7 - 64 - 1);
                                if (class9.field94[class1.field7][class2.field10] == null) {
                                    class9.field94[class1.field7][class2.field10] = new class41();
                                    class9.field94[class1.field7][class2.field10].field537 = new byte[4096];
                                }
                                class9.field94[class1.field7][class2.field10].field537[(-(var7 + 1) << 6) + var6] = (byte) var8;
                            }
                        }
                    }
                    if (class9.field94[class1.field7][class2.field10] != null) {
                        class9.field94[class1.field7][class2.field10].method267(0);
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

    @OriginalMember(owner = "mapview!c", name = "b", descriptor = "(I[B)V", line = 2010)
    private final void method23(int arg0, byte[] arg1) {
        int var3 = 0;
        if (arg0 != -290) {
            this.method14(13, -79, 126);
        }
        while (true) {
            while (var3 < arg1.length) {
                int var4 = (arg1[var3++] & 0xFF) * 64 - class19.field231;
                int var5 = (arg1[var3++] & 0xFF) * 64 - class27.field404;
                if (var4 > 0 && var5 > 0 && class6.field71 > var4 + 64 && var5 + 64 < class6.field66) {
                    class1.field7 = class6.field66 - var5 - 1 >> 6;
                    class2.field10 = var4 >> 6;
                    for (int var6 = 0; var6 < 64; var6++) {
                        for (int var7 = -64; var7 < 0; var7++) {
                            int var8 = arg1[var3++] & 0xFF;
                            if (var8 != 0) {
                                byte var9 = arg1[var3++];
                                class26.method158((byte) -4, var9, var4 + var6, 4, class6.field66 - var5 - var7 - 64 - 1);
                                if (class4.field39[class1.field7][class2.field10] == null) {
                                    class4.field39[class1.field7][class2.field10] = new class41();
                                    class4.field39[class1.field7][class2.field10].field537 = new byte[4096];
                                }
                                class4.field39[class1.field7][class2.field10].field537[(-(var7 + 1) << 6) + var6] = (byte) var8;
                            }
                        }
                    }
                    if (class4.field39[class1.field7][class2.field10] != null) {
                        class4.field39[class1.field7][class2.field10].method267(0);
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

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(B[B)V", line = 2114)
    private final void method24(byte arg0, byte[] arg1) {
        int var3 = 125 % ((-arg0 - 30) / 42);
        int var4 = 0;
        while (true) {
            while (var4 < arg1.length) {
                int var5 = (arg1[var4++] & 0xFF) * 64 - class19.field231;
                int var6 = (arg1[var4++] & 0xFF) * 64 - class27.field404;
                if (var5 > 0 && var6 > 0 && class6.field71 > var5 + 64 && class6.field66 > var6 + 64) {
                    for (int var7 = 0; var7 < 64; var7++) {
                        int var8 = class6.field66 - var6 - 1;
                        for (int var9 = -64; var9 < 0; var9++) {
                            while (true) {
                                int var10 = arg1[var4++] & 0xFF;
                                if (var10 == 0) {
                                    break;
                                }
                                if (var10 < 29) {
                                    class26.method158((byte) -4, (byte) var10, var5 + var7, 0, class6.field66 - var9 - var6 - 65);
                                } else if (var10 >= 160) {
                                    class26.method158((byte) -4, (byte) (var10 - 159), var5 + var7, 2, class6.field66 - var6 - var9 - 64 - 1);
                                    if (class2.field12 >= 1500) {
                                        break;
                                    }
                                    this.field55[class2.field12] = var7 + var5;
                                    this.field50[class2.field12] = var8;
                                    this.field47[class2.field12] = var10 - 160;
                                    class2.field12++;
                                } else {
                                    class26.method158((byte) -4, (byte) (var10 - 28), var5 + var7, 1, class6.field66 - var9 - var6 - 1 - 64);
                                }
                            }
                            var8--;
                        }
                    }
                } else {
                    for (int var11 = 0; var11 < 64; var11++) {
                        byte var13;
                        for (int var12 = -64; var12 < 0; var12++) {
                            do {
                                var13 = arg1[var4++];
                            } while (var13 != 0);
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(IIIIIIIBDI)V", line = 2230)
    public final void method25(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, double arg8, int arg9) {
        int var12 = arg6 - arg4;
        int var13 = arg5 - arg3;
        int var14 = (arg2 - arg0 << 16) / var13;
        int var15 = (arg9 - arg1 << 16) / var12;
        if (arg6 - arg4 > -arg1 + arg9) {
            return;
        }
        if (arg7 >= -86) {
            field46 = null;
        }
        this.field57 = 0;
        for (int var16 = 0; var16 < var12; var16++) {
            int var17 = var15 * var16 >> 16;
            int var18 = (var16 + 1) * var15 >> 16;
            int var19 = var18 - var17;
            if (var19 > 0) {
                class17.method92(arg3, arg4 + var16, 14737);
                for (int var20 = 0; var20 < var13; var20++) {
                    int var21 = (var20 + 1) * var14 >> 16;
                    int var22 = var14 * var20 >> 16;
                    int var23 = var21 - var22;
                    if (var23 > 0) {
                        int var24 = class39.method251(103) & 0xFF;
                        if (var24 != 0) {
                            if (var24 == 47 || var24 == 53) {
                                class35.field486[var24 - 1].method176(var17, var22, var19 * 2 + 1, var23 * 2 - -1);
                                if (!(arg8 < 4.0D) && arg8 > 4.2D && !(arg8 > 6.2D)) {
                                }
                            } else {
                                class35.field486[var24 - 1].method176(var17 - var19 / 2, -(var23 / 2) + var22, var19 * 2, var23 * 2);
                            }
                        }
                    }
                    class19.method107(0);
                }
            }
        }
    }
}
