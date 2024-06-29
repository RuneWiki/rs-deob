import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ba")
public class class4 {

    @OriginalMember(owner = "mapview!ba", name = "e", descriptor = "I")
    private int field100 = 0;

    @OriginalMember(owner = "mapview!ba", name = "c", descriptor = "[I")
    public int[] field98 = new int[1500];

    @OriginalMember(owner = "mapview!ba", name = "k", descriptor = "[I")
    private int[] field106 = new int[1500];

    @OriginalMember(owner = "mapview!ba", name = "j", descriptor = "[I")
    public int[] field105 = new int[1500];

    @OriginalMember(owner = "mapview!ba", name = "q", descriptor = "[I")
    public int[] field112 = new int[1500];

    @OriginalMember(owner = "mapview!ba", name = "r", descriptor = "[I")
    private int[] field113 = new int[1500];

    @OriginalMember(owner = "mapview!ba", name = "b", descriptor = "[I")
    private int[] field97 = new int[1500];

    @OriginalMember(owner = "mapview!ba", name = "d", descriptor = "Z")
    public static boolean field99 = true;

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "Lj;")
    public static class17 field96 = class30.method190(-88, "Furnace");

    @OriginalMember(owner = "mapview!ba", name = "h", descriptor = "Lj;")
    public static class17 field103 = class30.method190(-126, "75(U");

    @OriginalMember(owner = "mapview!ba", name = "f", descriptor = "[[B")
    public static byte[][] field101 = new byte[50][];

    @OriginalMember(owner = "mapview!ba", name = "i", descriptor = "Lj;")
    public static class17 field104 = class30.method190(-111, "Crafting Shop");

    @OriginalMember(owner = "mapview!ba", name = "o", descriptor = "Lj;")
    public static class17 field110 = class30.method190(-122, "Sword Shop");

    @OriginalMember(owner = "mapview!ba", name = "p", descriptor = "I")
    public static int field111 = 0;

    @OriginalMember(owner = "mapview!ba", name = "l", descriptor = "I")
    public static int field107 = 0;

    @OriginalMember(owner = "mapview!ba", name = "m", descriptor = "I")
    public static int field108 = 20;

    @OriginalMember(owner = "mapview!ba", name = "n", descriptor = "J")
    public static long field109 = 0L;

    @OriginalMember(owner = "mapview!ba", name = "t", descriptor = "I")
    public static int field115 = 0;

    @OriginalMember(owner = "mapview!ba", name = "u", descriptor = "Lj;")
    public static class17 field116 = class30.method190(-92, "Scimitar Shop");

    @OriginalMember(owner = "mapview!ba", name = "g", descriptor = "I")
    public static int field102;

    @OriginalMember(owner = "mapview!ba", name = "s", descriptor = "[B")
    public static byte[] field114;

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "(IIIIIIIII)V", line = 5)
    public final void method33(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var10 = arg0 - arg6;
        int var11 = (arg3 - arg8 << 16) / var10;
        int var12 = 112 % ((arg1 + 62) / 46);
        int var13 = arg2 - arg5;
        this.field100 = 0;
        int var14 = (arg4 - arg7 << 16) / var13;
        for (int var15 = 0; var15 < var10; var15++) {
            int var16 = var11 * var15 >> 16;
            int var17 = (var15 + 1) * var11 >> 16;
            int var18 = var17 - var16;
            if (var18 > 0) {
                class8.method78((byte) -128, arg5, arg6 + var15);
                for (int var19 = 0; var19 < var13; var19++) {
                    int var20 = var14 * var19 >> 16;
                    int var21 = (var19 + 1) * var14 >> 16;
                    int var22 = var21 - var20;
                    if (var22 > 0) {
                        int var23 = class18.method137((byte) 113) & 0xFF;
                        if (var23 != 0) {
                            int var24;
                            if (var18 == 1) {
                                var24 = var16;
                            } else {
                                var24 = var17 - 1;
                            }
                            int var25;
                            if (var22 == 1) {
                                var25 = var20;
                            } else {
                                var25 = var21 - 1;
                            }
                            int var26 = 13421772;
                            if (var23 >= 5 && var23 <= 8 || var23 >= 13 && var23 <= 16 || var23 >= 21 && var23 <= 24 || var23 == 27 || var23 == 28) {
                                var26 = 13369344;
                                var23 -= 4;
                            }
                            if (var23 == 1) {
                                class25.method170(var16, var20, var22, var26);
                            } else if (var23 == 2) {
                                class25.method168(var16, var20, var18, var26);
                            } else if (var23 == 3) {
                                class25.method170(var24, var20, var22, var26);
                            } else if (var23 == 4) {
                                class25.method168(var16, var25, var18, var26);
                            } else if (var23 == 9) {
                                class25.method170(var16, var20, var22, 16777215);
                                class25.method168(var16, var20, var18, var26);
                            } else if (var23 == 10) {
                                class25.method170(var24, var20, var22, 16777215);
                                class25.method168(var16, var20, var18, var26);
                            } else if (var23 == 11) {
                                class25.method170(var24, var20, var22, 16777215);
                                class25.method168(var16, var25, var18, var26);
                            } else if (var23 == 12) {
                                class25.method170(var16, var20, var22, 16777215);
                                class25.method168(var16, var25, var18, var26);
                            } else if (var23 == 17) {
                                class25.method168(var16, var20, 1, var26);
                            } else if (var23 == 18) {
                                class25.method168(var24, var20, 1, var26);
                            } else if (var23 == 19) {
                                class25.method168(var24, var25, 1, var26);
                            } else if (var23 == 20) {
                                class25.method168(var16, var25, 1, var26);
                            } else if (var23 == 25) {
                                for (int var28 = 0; var28 < var22; var28++) {
                                    class25.method168(var16 + var28, var25 - var28, 1, var26);
                                }
                            } else if (var23 == 26) {
                                for (int var27 = 0; var27 < var22; var27++) {
                                    class25.method168(var16 + var27, var20 + var27, 1, var26);
                                }
                            }
                        }
                        int var29 = class24.method162(31072) & 0xFF;
                        if (var29 != 0) {
                            this.field97[this.field100] = var29 - 1;
                            this.field106[this.field100] = var18 / 2 + var16;
                            this.field113[this.field100] = var20 + var22 / 2;
                            this.field100++;
                        }
                    }
                    class33.method222(-1393530170);
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "(I[[B)V", line = 190)
    private final void method34(int arg0, byte[][] arg1) {
        int var3 = class23.field300;
        int var4 = class3.field90;
        int[] var5 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var5[var6] = 0;
        }
        if (arg0 != 12377) {
            return;
        }
        for (int var7 = 5; var7 < var3 - 5; var7++) {
            byte[] var8 = arg1[var7 + 5];
            byte[] var9 = arg1[var7 - 5];
            for (int var10 = 0; var10 < var4; var10++) {
                int var11 = class3.field94[var8[var10] & 0xFF];
                int var12 = class3.field94[var9[var10] & 0xFF];
                if (var11 <= 0 && class15.method107(var10, 0, var7 + 5) > 0) {
                    var11 = 64;
                }
                if (var12 <= 0 && class15.method107(var10, 0, var7 - 5) > 0) {
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
                    var14 += (var17 >> 10 & 0x3FF) - (var18 >> 10 & 0x3FF);
                    var13 += (var17 >> 20) - (var18 >> 20);
                    var15 += (var17 & 0x3FF) - (var18 & 0x3FF);
                    if (var15 > 0) {
                        int var19 = var7 >> 6;
                        int var20 = var16 >> 6;
                        if (class33.field408[var20][var19] == null) {
                            class33.field408[var20][var19] = new int[4096];
                        }
                        if ((arg1[var7][var16] & 0xFF) > 0) {
                            class33.field408[var20][var19][class32.method205(var7, 63) + class32.method205(4032, var16 << 6)] = this.method38((byte) -92, (double) var14 / 8533.0D, (double) var15 / 8533.0D, (double) var13 / 8533.0D);
                        } else {
                            class33.field408[var20][var19][class32.method205(4032, var16 << 6) + class32.method205(var7, 63)] = 0;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "(I[B)V", line = 296)
    private final void method35(int arg0, byte[] arg1) {
        if (arg0 <= 69) {
            field102 = 49;
        }
        int var3 = 0;
        while (true) {
            while (var3 < arg1.length) {
                int var4 = (arg1[var3++] & 0xFF) * 64 - class26.field337;
                int var5 = (arg1[var3++] & 0xFF) * 64 - mapview.field23;
                if (var4 > 0 && var5 > 0 && class23.field300 > var4 + 64 && class3.field90 > var5 + 64) {
                    class18.field276 = var4 >> 6;
                    class23.field305 = class3.field90 - var5 - 1 >> 6;
                    for (int var6 = 0; var6 < 64; var6++) {
                        for (int var7 = -64; var7 < 0; var7++) {
                            int var8 = arg1[var3++] & 0xFF;
                            if (var8 != 0) {
                                byte var9 = arg1[var3++];
                                class18.method138(class3.field90 - var7 - var5 - 1 - 64, var4 - -var6, -11001, var9, 3);
                                if (class20.field293[class23.field305][class18.field276] == null) {
                                    class20.field293[class23.field305][class18.field276] = new class28();
                                    class20.field293[class23.field305][class18.field276].field366 = new byte[4096];
                                }
                                class20.field293[class23.field305][class18.field276].field366[(-(var7 + 1) << 6) + var6] = (byte) var8;
                            }
                        }
                    }
                    if (class20.field293[class23.field305][class18.field276] != null) {
                        class20.field293[class23.field305][class18.field276].method183((byte) -6);
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

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "(Z)V", line = 381)
    public static void method36(boolean arg0) {
        field114 = null;
        field103 = null;
        field116 = null;
        field104 = null;
        field96 = null;
        field110 = null;
        field101 = null;
        if (!arg0) {
            field103 = null;
        }
    }

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "(B[[B[B)V", line = 398)
    private final void method37(byte arg0, byte[][] arg1, byte[] arg2) {
        if (arg0 != -19) {
            return;
        }
        int var4 = 0;
        while (true) {
            while (arg2.length > var4) {
                int var5 = (arg2[var4++] & 0xFF) * 64 - class26.field337;
                int var6 = (arg2[var4++] & 0xFF) * 64 - mapview.field23;
                if (var5 > 0 && var6 > 0 && var5 + 64 < class23.field300 && var6 + 64 < class3.field90) {
                    for (int var7 = 0; var7 < 64; var7++) {
                        int var8 = class3.field90 - var6 - 1;
                        byte[] var9 = arg1[var5 + var7];
                        for (int var10 = -64; var10 < 0; var10++) {
                            var9[var8--] = arg2[var4++];
                        }
                    }
                } else {
                    var4 += 4096;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "(BDDD)I", line = 459)
    private final int method38(byte arg0, double arg1, double arg2, double arg3) {
        double var8 = arg2;
        double var10 = arg2;
        double var12 = arg2;
        if (arg1 != 0.0D) {
            double var14;
            if (arg2 < 0.5D) {
                var14 = (arg1 + 1.0D) * arg2;
            } else {
                var14 = arg1 + arg2 - arg1 * arg2;
            }
            double var16 = arg2 * 2.0D - var14;
            double var18 = arg3 + 0.3333333333333333D;
            if (var18 > 1.0D) {
                var18--;
            }
            if (arg3 * 6.0D < 1.0D) {
                var8 = (var14 - var16) * 6.0D * arg3 + var16;
            } else if (arg3 * 2.0D < 1.0D) {
                var8 = var14;
            } else if (arg3 * 3.0D < 2.0D) {
                var8 = (var14 - var16) * (-arg3 + 0.6666666666666666D) * 6.0D + var16;
            } else {
                var8 = var16;
            }
            if (var18 * 6.0D < 1.0D) {
                var10 = (var14 - var16) * 6.0D * var18 + var16;
            } else if (var18 * 2.0D < 1.0D) {
                var10 = var14;
            } else if (var18 * 3.0D < 2.0D) {
                var10 = (var14 - var16) * (-var18 + 0.6666666666666666D) * 6.0D + var16;
            } else {
                var10 = var16;
            }
            double var22 = arg3 - 0.3333333333333333D;
            if (var22 < 0.0D) {
                var22++;
            }
            if (var22 * 6.0D < 1.0D) {
                var12 = (var14 - var16) * 6.0D * var22 + var16;
            } else if (var22 * 2.0D < 1.0D) {
                var12 = var14;
            } else if (var22 * 3.0D < 2.0D) {
                var12 = (0.6666666666666666D - var22) * (-var16 + var14) * 6.0D + var16;
            } else {
                var12 = var16;
            }
        }
        int var24 = (int) (var10 * 256.0D);
        if (arg0 == -92) {
            int var25 = (int) (var8 * 256.0D);
            int var26 = (int) (var12 * 256.0D);
            return (var25 << 8) + (var24 << 16) + var26;
        } else {
            return 127;
        }
    }

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "(III)V", line = 545)
    private final void method39(int arg0, int arg1, int arg2) {
        int var4 = arg1 >> 6;
        int var5 = arg2 >> 6;
        if (arg0 != -1) {
            method41(null, null, true, null);
        }
        class2.field84[0] = new byte[var5][var4][];
        class2.field84[1] = new byte[var5][var4][];
        class2.field84[2] = new byte[var5][var4][];
        class2.field84[3] = new byte[var5][var4][];
        class2.field84[4] = new byte[var5][var4][];
        mapview.field36 = new class28[var5][var4];
        class33.field408 = new int[var5][var4][];
        class20.field293 = new class28[var5][var4];
    }

    @OriginalMember(owner = "mapview!ba", name = "b", descriptor = "(I[B)V", line = 567)
    private final void method40(int arg0, byte[] arg1) {
        int var3 = 0;
        if (arg0 > -93) {
            return;
        }
        while (true) {
            while (arg1.length > var3) {
                int var4 = (arg1[var3++] & 0xFF) * 64 - class26.field337;
                int var5 = (arg1[var3++] & 0xFF) * 64 - mapview.field23;
                if (var4 > 0 && var5 > 0 && class23.field300 > var4 + 64 && var5 + 64 < class3.field90) {
                    class23.field305 = class3.field90 - var5 - 1 >> 6;
                    class18.field276 = var4 >> 6;
                    for (int var6 = 0; var6 < 64; var6++) {
                        for (int var7 = -64; var7 < 0; var7++) {
                            int var8 = arg1[var3++] & 0xFF;
                            if (var8 != 0) {
                                byte var9 = arg1[var3++];
                                class18.method138(class3.field90 - var5 - var7 - 1 - 64, var4 + var6, -11001, var9, 4);
                                if (mapview.field36[class23.field305][class18.field276] == null) {
                                    mapview.field36[class23.field305][class18.field276] = new class28();
                                    mapview.field36[class23.field305][class18.field276].field366 = new byte[4096];
                                }
                                mapview.field36[class23.field305][class18.field276].field366[(-(var7 + 1) << 6) + var6] = (byte) var8;
                            }
                        }
                    }
                    if (mapview.field36[class23.field305][class18.field276] != null) {
                        mapview.field36[class23.field305][class18.field276].method183((byte) 16);
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

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "(Lt;Lj;ZLj;)[Lla;", line = 654)
    public static final class22[] method41(class34 arg0, class17 arg1, boolean arg2, class17 arg3) {
        int var4 = arg0.method227(-30, arg3);
        int var5 = arg0.method232(arg1, var4, (byte) -51);
        return arg2 ? (class22[]) null : class23.method159(127, arg0, var4, var5);
    }

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "(I[BI)I", line = 681)
    public static final int method42(int arg0, byte[] arg1, int arg2) {
        if (arg2 != 0) {
            method41(null, null, true, null);
        }
        return method49(arg1, 0, arg0, (byte) -124);
    }

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "(Lga;Z)V", line = 696)
    public final void method43(class12 arg0, boolean arg1) {
        class33 var3 = new class33(arg0.method230(10646, class3.field93, class2.field86));
        int var4 = var3.method218(810291624);
        int var5 = var3.method218(810291624);
        int var6 = var3.method218(810291624);
        int var7 = var3.method218(810291624);
        int var8 = var3.method218(810291624);
        int var9 = var3.method218(810291624);
        var3.method221(-598525000);
        class3.field90 = (var7 + 1 - var5) * 64;
        class23.field300 = (var6 - var4) * 64 + 64;
        mapview.field23 = var5 * 64;
        class26.field337 = var4 * 64;
        class20.field287 = mapview.field23 + class3.field90 - var9 * 64;
        class16.field253 = var8 * 64 - class26.field337;
        this.method39(-1, class23.field300, class3.field90);
        class33 var10 = new class33(arg0.method230(10646, class17.field260, class2.field86));
        int var11 = var10.method218(810291624);
        class3.field94 = new int[var11 + 1];
        for (int var12 = 0; var12 < var11; var12++) {
            class3.field94[var12 + 1] = var10.method219(0);
        }
        int var13 = var10.method218(810291624);
        class11.field220 = new int[var13 + 1];
        for (int var14 = 0; var14 < var13; var14++) {
            class11.field220[var14 + 1] = var10.method219(0);
        }
        byte[] var15 = arg0.method230(10646, class11.field221, class2.field86);
        byte[][] var16 = new byte[class23.field300][class3.field90];
        if (!arg1) {
            return;
        }
        this.method37((byte) -19, var16, var15);
        byte[] var17 = arg0.method230(10646, class17.field259, class2.field86);
        this.method35(115, var17);
        byte[] var18 = arg0.method230(10646, class18.field274, class2.field86);
        this.method40(-125, var18);
        byte[] var19 = arg0.method230(10646, class24.field315, class2.field86);
        class30.field387 = 0;
        this.method45(var19, arg1);
        this.method34(12377, var16);
    }

    @OriginalMember(owner = "mapview!ba", name = "b", descriptor = "(IIIIIIIII)V", line = 771)
    public final void method44(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var10 = arg7 - arg4;
        int var11 = arg0 - arg8;
        if (arg3 <= 101) {
            return;
        }
        int var12 = (arg2 - arg6 << 16) / var10;
        int var13 = (arg1 - arg5 << 16) / var11;
        for (int var14 = 0; var14 < var11; var14++) {
            int var15 = (var14 + 1) * var13 >> 16;
            int var16 = var13 * var14 >> 16;
            int var17 = var15 - var16;
            if (var17 > 0) {
                int var18 = arg5 + var16;
                class8.method78((byte) -128, arg4, arg8 + var14);
                int var19 = arg5 + var15;
                for (int var20 = 0; var20 < var10; var20++) {
                    int var21 = var12 * var20 >> 16;
                    int var22 = (var20 + 1) * var12 >> 16;
                    int var23 = var22 - var21;
                    if (var23 > 0) {
                        int var24 = arg6 + var22;
                        int var25 = arg6 + var21;
                        int var26 = class35.method238((byte) -54);
                        int var27 = class31.method203(0);
                        if (var26 == 0 && var27 == 0) {
                            class25.method174(var18, var25, var19 - var18, var24 - var25, class1.method22(false));
                        } else {
                            byte var28 = class23.method155(-4333);
                            int var29 = var28 & 0xFC;
                            if (var29 == 0 || var17 <= 1 || var23 <= 1) {
                                class25.method174(var18, var25, var17, var23, var26);
                            } else {
                                this.method48(var23, class1.method22(false), -13, var17, var26, class25.field330 * var25 + var18, true, var29 >> 2, class25.field325, var28 & 0x3);
                            }
                            if (var27 > 0) {
                                byte var30 = class29.method185((byte) 72);
                                int var31 = var30 & 0xFC;
                                if (var31 == 0 || var17 <= 1 || var23 <= 1) {
                                    class25.method174(var18, var25, var17, var23, var27);
                                }
                                this.method48(var23, class1.method22(false), -97, var17, var27, class25.field330 * var25 + var18, var26 == 0, var31 >> 2, class25.field325, var30 & 0x3);
                            }
                        }
                    }
                    class33.method222(-1393530170);
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "([BZ)V", line = 864)
    private final void method45(byte[] arg0, boolean arg1) {
        if (!arg1) {
            return;
        }
        int var3 = 0;
        while (true) {
            while (arg0.length > var3) {
                int var4 = (arg0[var3++] & 0xFF) * 64 - class26.field337;
                int var5 = (arg0[var3++] & 0xFF) * 64 - mapview.field23;
                if (var4 > 0 && var5 > 0 && class23.field300 > var4 + 64 && var5 + 64 < class3.field90) {
                    for (int var6 = 0; var6 < 64; var6++) {
                        int var7 = class3.field90 - var5 - 1;
                        for (int var8 = -64; var8 < 0; var8++) {
                            while (true) {
                                int var9 = arg0[var3++] & 0xFF;
                                if (var9 == 0) {
                                    break;
                                }
                                if (var9 < 29) {
                                    class18.method138(class3.field90 - var8 - var5 - 1 - 64, var4 + var6, -11001, (byte) var9, 0);
                                } else if (var9 < 160) {
                                    class18.method138(class3.field90 - var8 - var5 - 1 - 64, var4 + var6, -11001, (byte) (var9 - 28), 1);
                                } else {
                                    class18.method138(class3.field90 - var5 - var8 - 64 - 1, var4 - -var6, -11001, (byte) (var9 - 159), 2);
                                    if (class30.field387 >= 1500) {
                                        break;
                                    }
                                    this.field105[class30.field387] = var4 + var6;
                                    this.field112[class30.field387] = var7;
                                    this.field98[class30.field387] = var9 - 160;
                                    class30.field387++;
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

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "(B)V", line = 979)
    public static final void method46(byte arg0) {
        class2 var1 = class28.field367;
        synchronized (class28.field367) {
            field115 = class33.field412;
            int var2 = -78 % ((arg0 + 30) / 45);
            class32.field407 = class13.field237;
            class23.field299 = class2.field87;
            class35.field446 = class16.field251;
            class2.field85 = class23.field302;
            class20.field285 = class13.field235;
            class16.field251 = 0;
        }
    }

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "(DIIIIIIIII)V", line = 1004)
    public final void method47(double arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var12 = arg7 - arg6;
        int var13 = (arg1 - arg9 << 16) / var12;
        int var14 = arg2 - arg5;
        int var15 = (arg4 - arg3 << 16) / var14;
        if (arg7 - arg6 > -arg9 + arg1) {
            return;
        }
        this.field100 = 0;
        if (arg8 != -17204) {
            this.method35(-66, null);
        }
        for (int var16 = 0; var16 < var12; var16++) {
            int var17 = var13 * var16 >> 16;
            int var18 = (var16 + 1) * var13 >> 16;
            int var19 = var18 - var17;
            if (var19 > 0) {
                class8.method78((byte) -121, arg5, arg6 + var16);
                for (int var20 = 0; var20 < var14; var20++) {
                    int var21 = var15 * var20 >> 16;
                    int var22 = (var20 + 1) * var15 >> 16;
                    int var23 = var22 - var21;
                    if (var23 > 0) {
                        int var24 = class16.method111(true) & 0xFF;
                        if (var24 != 0) {
                            if (var24 == 47 || var24 == 53) {
                                class24.field321[var24 - 1].method242(var17, var21, var19 * 2 + 1, var23 * 2 + 1);
                                if (!(arg0 < 4.0D) && arg0 > 4.2D && arg0 > 6.2D) {
                                }
                            } else {
                                class24.field321[var24 - 1].method242(var17 - var19 / 2, -(var23 / 2) + var21, var19 * 2, var23 * 2);
                            }
                        }
                    }
                    class33.method222(-1393530170);
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "(IIIIIIZI[II)V", line = 1134)
    private final void method48(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int[] arg8, int arg9) {
        if (arg7 == 9) {
            arg9 = arg9 + 1 & 0x3;
            arg7 = 1;
        }
        if (arg7 == 10) {
            arg7 = 1;
            arg9 = arg9 + 3 & 0x3;
        }
        if (arg7 == 11) {
            arg9 = arg9 + 3 & 0x3;
            arg7 = 8;
        }
        int var11 = class25.field330 - arg3;
        int var12 = -63 % ((arg2 + 52) / 35);
        if (arg7 == 1) {
            if (arg9 == 0) {
                for (int var69 = 0; var69 < arg0; var69++) {
                    for (int var70 = 0; var70 < arg3; var70++) {
                        if (var70 <= var69) {
                            arg8[arg5] = arg4;
                        } else if (arg6) {
                            arg8[arg5] = arg1;
                        }
                        arg5++;
                    }
                    arg5 += var11;
                }
            } else if (arg9 == 1) {
                for (int var71 = arg0 - 1; var71 >= 0; var71--) {
                    for (int var72 = 0; var72 < arg3; var72++) {
                        if (var72 <= var71) {
                            arg8[arg5] = arg4;
                        } else if (arg6) {
                            arg8[arg5] = arg1;
                        }
                        arg5++;
                    }
                    arg5 += var11;
                }
            } else if (arg9 == 2) {
                for (int var75 = 0; var75 < arg0; var75++) {
                    for (int var76 = 0; var76 < arg3; var76++) {
                        if (var75 <= var76) {
                            arg8[arg5] = arg4;
                        } else if (arg6) {
                            arg8[arg5] = arg1;
                        }
                        arg5++;
                    }
                    arg5 += var11;
                }
            } else if (arg9 == 3) {
                for (int var73 = arg0 - 1; var73 >= 0; var73--) {
                    for (int var74 = 0; var74 < arg3; var74++) {
                        if (var73 <= var74) {
                            arg8[arg5] = arg4;
                        } else if (arg6) {
                            arg8[arg5] = arg1;
                        }
                        arg5++;
                    }
                    arg5 += var11;
                }
            }
        } else if (arg7 == 2) {
            if (arg9 == 0) {
                for (int var67 = arg0 - 1; var67 >= 0; var67--) {
                    for (int var68 = 0; var68 < arg3; var68++) {
                        if (var68 <= var67 >> 1) {
                            arg8[arg5] = arg4;
                        } else if (arg6) {
                            arg8[arg5] = arg1;
                        }
                        arg5++;
                    }
                    arg5 += var11;
                }
            } else if (arg9 == 1) {
                for (int var65 = 0; var65 < arg0; var65++) {
                    for (int var66 = 0; var66 < arg3; var66++) {
                        if (var66 >= var65 << 1) {
                            arg8[arg5] = arg4;
                        } else if (arg6) {
                            arg8[arg5] = arg1;
                        }
                        arg5++;
                    }
                    arg5 += var11;
                }
            } else if (arg9 == 2) {
                for (int var63 = 0; var63 < arg0; var63++) {
                    for (int var64 = arg3 - 1; var64 >= 0; var64--) {
                        if (var63 >> 1 >= var64) {
                            arg8[arg5] = arg4;
                        } else if (arg6) {
                            arg8[arg5] = arg1;
                        }
                        arg5++;
                    }
                    arg5 += var11;
                }
            } else if (arg9 == 3) {
                for (int var61 = arg0 - 1; var61 >= 0; var61--) {
                    for (int var62 = arg3 - 1; var62 >= 0; var62--) {
                        if (var62 >= var61 << 1) {
                            arg8[arg5] = arg4;
                        } else if (arg6) {
                            arg8[arg5] = arg1;
                        }
                        arg5++;
                    }
                    arg5 += var11;
                }
            }
        } else if (arg7 == 3) {
            if (arg9 == 0) {
                for (int var59 = arg0 - 1; var59 >= 0; var59--) {
                    for (int var60 = arg3 - 1; var60 >= 0; var60--) {
                        if (var59 >> 1 >= var60) {
                            arg8[arg5] = arg4;
                        } else if (arg6) {
                            arg8[arg5] = arg1;
                        }
                        arg5++;
                    }
                    arg5 += var11;
                }
            } else if (arg9 == 1) {
                for (int var53 = arg0 - 1; var53 >= 0; var53--) {
                    for (int var54 = 0; var54 < arg3; var54++) {
                        if (var53 << 1 <= var54) {
                            arg8[arg5] = arg4;
                        } else if (arg6) {
                            arg8[arg5] = arg1;
                        }
                        arg5++;
                    }
                    arg5 += var11;
                }
            } else if (arg9 == 2) {
                for (int var55 = 0; var55 < arg0; var55++) {
                    for (int var56 = 0; var56 < arg3; var56++) {
                        if (var55 >> 1 >= var56) {
                            arg8[arg5] = arg4;
                        } else if (arg6) {
                            arg8[arg5] = arg1;
                        }
                        arg5++;
                    }
                    arg5 += var11;
                }
            } else if (arg9 == 3) {
                for (int var57 = 0; var57 < arg0; var57++) {
                    for (int var58 = arg3 - 1; var58 >= 0; var58--) {
                        if (var57 << 1 <= var58) {
                            arg8[arg5] = arg4;
                        } else if (arg6) {
                            arg8[arg5] = arg1;
                        }
                        arg5++;
                    }
                    arg5 += var11;
                }
            }
        } else if (arg7 == 4) {
            if (arg9 == 0) {
                for (int var45 = arg0 - 1; var45 >= 0; var45--) {
                    for (int var46 = 0; var46 < arg3; var46++) {
                        if (var46 >= var45 >> 1) {
                            arg8[arg5] = arg4;
                        } else if (arg6) {
                            arg8[arg5] = arg1;
                        }
                        arg5++;
                    }
                    arg5 += var11;
                }
            } else if (arg9 == 1) {
                for (int var51 = 0; var51 < arg0; var51++) {
                    for (int var52 = 0; var52 < arg3; var52++) {
                        if (var52 <= var51 << 1) {
                            arg8[arg5] = arg4;
                        } else if (arg6) {
                            arg8[arg5] = arg1;
                        }
                        arg5++;
                    }
                    arg5 += var11;
                }
            } else if (arg9 == 2) {
                for (int var49 = 0; var49 < arg0; var49++) {
                    for (int var50 = arg3 - 1; var50 >= 0; var50--) {
                        if (var50 >= var49 >> 1) {
                            arg8[arg5] = arg4;
                        } else if (arg6) {
                            arg8[arg5] = arg1;
                        }
                        arg5++;
                    }
                    arg5 += var11;
                }
            } else if (arg9 == 3) {
                for (int var47 = arg0 - 1; var47 >= 0; var47--) {
                    for (int var48 = arg3 - 1; var48 >= 0; var48--) {
                        if (var47 << 1 >= var48) {
                            arg8[arg5] = arg4;
                        } else if (arg6) {
                            arg8[arg5] = arg1;
                        }
                        arg5++;
                    }
                    arg5 += var11;
                }
            }
        } else if (arg7 != 5) {
            if (arg7 == 6) {
                if (arg9 == 0) {
                    for (int var13 = 0; var13 < arg0; var13++) {
                        for (int var14 = 0; var14 < arg3; var14++) {
                            if (var14 <= arg3 / 2) {
                                arg8[arg5] = arg4;
                            } else if (arg6) {
                                arg8[arg5] = arg1;
                            }
                            arg5++;
                        }
                        arg5 += var11;
                    }
                    return;
                }
                if (arg9 == 1) {
                    for (int var35 = 0; var35 < arg0; var35++) {
                        for (int var36 = 0; var36 < arg3; var36++) {
                            if (var35 <= arg0 / 2) {
                                arg8[arg5] = arg4;
                            } else if (arg6) {
                                arg8[arg5] = arg1;
                            }
                            arg5++;
                        }
                        arg5 += var11;
                    }
                    return;
                }
                if (arg9 == 2) {
                    for (int var33 = 0; var33 < arg0; var33++) {
                        for (int var34 = 0; var34 < arg3; var34++) {
                            if (var34 >= arg3 / 2) {
                                arg8[arg5] = arg4;
                            } else if (arg6) {
                                arg8[arg5] = arg1;
                            }
                            arg5++;
                        }
                        arg5 += var11;
                    }
                    return;
                }
                if (arg9 == 3) {
                    for (int var15 = 0; var15 < arg0; var15++) {
                        for (int var16 = 0; var16 < arg3; var16++) {
                            if (var15 >= arg0 / 2) {
                                arg8[arg5] = arg4;
                            } else if (arg6) {
                                arg8[arg5] = arg1;
                            }
                            arg5++;
                        }
                        arg5 += var11;
                    }
                    return;
                }
            }
            if (arg7 == 7) {
                if (arg9 == 0) {
                    for (int var17 = 0; var17 < arg0; var17++) {
                        for (int var18 = 0; var18 < arg3; var18++) {
                            if (var18 <= var17 - arg0 / 2) {
                                arg8[arg5] = arg4;
                            } else if (arg6) {
                                arg8[arg5] = arg1;
                            }
                            arg5++;
                        }
                        arg5 += var11;
                    }
                    return;
                }
                if (arg9 == 1) {
                    for (int var19 = arg0 - 1; var19 >= 0; var19--) {
                        for (int var20 = 0; var20 < arg3; var20++) {
                            if (var20 <= var19 - arg0 / 2) {
                                arg8[arg5] = arg4;
                            } else if (arg6) {
                                arg8[arg5] = arg1;
                            }
                            arg5++;
                        }
                        arg5 += var11;
                    }
                    return;
                }
                if (arg9 == 2) {
                    for (int var23 = arg0 - 1; var23 >= 0; var23--) {
                        for (int var24 = arg3 - 1; var24 >= 0; var24--) {
                            if (var24 <= var23 - arg0 / 2) {
                                arg8[arg5] = arg4;
                            } else if (arg6) {
                                arg8[arg5] = arg1;
                            }
                            arg5++;
                        }
                        arg5 += var11;
                    }
                    return;
                }
                if (arg9 == 3) {
                    for (int var21 = 0; var21 < arg0; var21++) {
                        for (int var22 = arg3 - 1; var22 >= 0; var22--) {
                            if (var22 <= var21 - arg0 / 2) {
                                arg8[arg5] = arg4;
                            } else if (arg6) {
                                arg8[arg5] = arg1;
                            }
                            arg5++;
                        }
                        arg5 += var11;
                    }
                    return;
                }
            }
            if (arg7 == 8) {
                if (arg9 == 0) {
                    for (int var31 = 0; var31 < arg0; var31++) {
                        for (int var32 = 0; var32 < arg3; var32++) {
                            if (var31 - arg0 / 2 <= var32) {
                                arg8[arg5] = arg4;
                            } else if (arg6) {
                                arg8[arg5] = arg1;
                            }
                            arg5++;
                        }
                        arg5 += var11;
                    }
                    return;
                }
                if (arg9 == 1) {
                    for (int var25 = arg0 - 1; var25 >= 0; var25--) {
                        for (int var26 = 0; var26 < arg3; var26++) {
                            if (var26 >= var25 - arg0 / 2) {
                                arg8[arg5] = arg4;
                            } else if (arg6) {
                                arg8[arg5] = arg1;
                            }
                            arg5++;
                        }
                        arg5 += var11;
                    }
                    return;
                }
                if (arg9 == 2) {
                    for (int var29 = arg0 - 1; var29 >= 0; var29--) {
                        for (int var30 = arg3 - 1; var30 >= 0; var30--) {
                            if (var29 - arg0 / 2 <= var30) {
                                arg8[arg5] = arg4;
                            } else if (arg6) {
                                arg8[arg5] = arg1;
                            }
                            arg5++;
                        }
                        arg5 += var11;
                    }
                    return;
                }
                if (arg9 == 3) {
                    for (int var27 = 0; var27 < arg0; var27++) {
                        for (int var28 = arg3 - 1; var28 >= 0; var28--) {
                            if (var27 - arg0 / 2 <= var28) {
                                arg8[arg5] = arg4;
                            } else if (arg6) {
                                arg8[arg5] = arg1;
                            }
                            arg5++;
                        }
                        arg5 += var11;
                    }
                    return;
                }
            }
        } else if (arg9 == 0) {
            for (int var37 = arg0 - 1; var37 >= 0; var37--) {
                for (int var38 = arg3 - 1; var38 >= 0; var38--) {
                    if (var37 >> 1 <= var38) {
                        arg8[arg5] = arg4;
                    } else if (arg6) {
                        arg8[arg5] = arg1;
                    }
                    arg5++;
                }
                arg5 += var11;
            }
        } else if (arg9 == 1) {
            for (int var39 = arg0 - 1; var39 >= 0; var39--) {
                for (int var40 = 0; var40 < arg3; var40++) {
                    if (var40 <= var39 << 1) {
                        arg8[arg5] = arg4;
                    } else if (arg6) {
                        arg8[arg5] = arg1;
                    }
                    arg5++;
                }
                arg5 += var11;
            }
        } else if (arg9 == 2) {
            for (int var41 = 0; var41 < arg0; var41++) {
                for (int var42 = 0; var42 < arg3; var42++) {
                    if (var42 >= var41 >> 1) {
                        arg8[arg5] = arg4;
                    } else if (arg6) {
                        arg8[arg5] = arg1;
                    }
                    arg5++;
                }
                arg5 += var11;
            }
        } else if (arg9 == 3) {
            for (int var43 = 0; var43 < arg0; var43++) {
                for (int var44 = arg3 - 1; var44 >= 0; var44--) {
                    if (var44 <= var43 << 1) {
                        arg8[arg5] = arg4;
                    } else if (arg6) {
                        arg8[arg5] = arg1;
                    }
                    arg5++;
                }
                arg5 += var11;
            }
        }
    }

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "([BIIB)I", line = 2276)
    private static final int method49(byte[] arg0, int arg1, int arg2, byte arg3) {
        int var4 = -96 / ((51 - arg3) / 37);
        int var5 = -1;
        for (int var6 = arg1; var6 < arg2; var6++) {
            var5 = var5 >>> 8 ^ class8.field159[(var5 ^ arg0[var6]) & 0xFF];
        }
        return ~var5;
    }

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "(IIIIIIIIIII)V", line = 2303)
    public final void method50(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (this.field100 == 0) {
            int var12 = arg7 - arg0;
            int var13 = arg3 - arg4;
            int var14 = (arg8 - arg10 << 16) / var13;
            int var15 = (arg1 - arg2 << 16) / var12;
            for (int var16 = 0; var16 < var12; var16++) {
                int var17 = var15 * var16 >> 16;
                int var18 = (var16 + 1) * var15 >> 16;
                int var19 = var18 - var17;
                if (var19 > 0) {
                    class8.method78((byte) -122, arg4, var16 + arg0);
                    for (int var20 = 0; var20 < var13; var20++) {
                        int var21 = (var20 + 1) * var14 >> 16;
                        int var22 = var14 * var20 >> 16;
                        int var23 = var21 - var22;
                        if (var23 > 0) {
                            int var24 = class24.method162(31072) & 0xFF;
                            if (var24 != 0) {
                                this.field97[this.field100] = var24 - 1;
                                this.field106[this.field100] = var17 + var19 / 2;
                                this.field113[this.field100] = var22 + var23 / 2;
                                this.field100++;
                            }
                        }
                        class33.method222(arg9 - 1393530169);
                    }
                }
            }
        }
        for (int var25 = 0; var25 < this.field100; var25++) {
            if (class33.field417[this.field97[var25]] != null) {
                class33.field417[this.field97[var25]].method153(this.field106[var25] - 7, this.field113[var25] + -7);
            }
        }
        if (arg9 > ~arg6) {
            for (int var26 = 0; var26 < this.field100; var26++) {
                if (this.field97[var26] == arg5) {
                    class33.field417[this.field97[var26]].method153(this.field106[var26] - 7, this.field113[var26] + -7);
                    if (arg6 % 10 < 5) {
                        class25.method166(this.field106[var26], this.field113[var26], 15, 16776960, 128);
                        class25.method166(this.field106[var26], this.field113[var26], 7, 16777215, 256);
                    }
                }
            }
        }
        this.field100 = 0;
    }
}
