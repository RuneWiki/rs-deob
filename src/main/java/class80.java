import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tt")
public class class80 {

    @OriginalMember(owner = "client!tt", name = "i", descriptor = "[[Laca;")
    private class663[][] field838 = new class663[64][768];

    @OriginalMember(owner = "client!tt", name = "l", descriptor = "[I")
    private int[] field841 = new int[64];

    @OriginalMember(owner = "client!tt", name = "d", descriptor = "[[Laca;")
    private class663[][] field833 = new class663[1600][64];

    @OriginalMember(owner = "client!tt", name = "k", descriptor = "I")
    private int field840 = 0;

    @OriginalMember(owner = "client!tt", name = "j", descriptor = "[I")
    private int[] field839 = new int[8191];

    @OriginalMember(owner = "client!tt", name = "u", descriptor = "[I")
    private int[] field850 = new int[1600];

    @OriginalMember(owner = "client!tt", name = "e", descriptor = "Leh;")
    private class328 field834;

    @OriginalMember(owner = "client!tt", name = "r", descriptor = "Ltfa;")
    private class31 field847;

    @OriginalMember(owner = "client!tt", name = "n", descriptor = "Ltfa;")
    private class31 field843;

    @OriginalMember(owner = "client!tt", name = "o", descriptor = "Ltj;")
    private class180 field844;

    @OriginalMember(owner = "client!tt", name = "c", descriptor = "I")
    public static int field832 = -1;

    @OriginalMember(owner = "client!tt", name = "s", descriptor = "I")
    public static int field848 = -1;

    @OriginalMember(owner = "client!tt", name = "m", descriptor = "Lpr;")
    public static class407 field842 = new class407(91, -1);

    @OriginalMember(owner = "client!tt", name = "v", descriptor = "[I")
    public static int[] field851 = new int[25];

    @OriginalMember(owner = "client!tt", name = "z", descriptor = "I")
    public static int field855 = -1;

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "I")
    public static int field830;

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "I")
    public static int field831;

    @OriginalMember(owner = "client!tt", name = "f", descriptor = "I")
    public static int field835;

    @OriginalMember(owner = "client!tt", name = "g", descriptor = "I")
    public static int field836;

    @OriginalMember(owner = "client!tt", name = "h", descriptor = "I")
    public static int field837;

    @OriginalMember(owner = "client!tt", name = "p", descriptor = "I")
    public static int field845;

    @OriginalMember(owner = "client!tt", name = "q", descriptor = "I")
    public static int field846;

    @OriginalMember(owner = "client!tt", name = "t", descriptor = "I")
    public static int field849;

    @OriginalMember(owner = "client!tt", name = "w", descriptor = "I")
    public static int field852;

    @OriginalMember(owner = "client!tt", name = "x", descriptor = "I")
    public static int field853;

    @OriginalMember(owner = "client!tt", name = "y", descriptor = "Lgm;")
    public static class110 field854;

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lfo;Z)V", line = 7)
    private final void method509(class473 arg0, boolean arg1) {
        class208.field2521 = arg0.field6873;
        field846++;
        arg0.method2697(true);
        arg0.method2703(-66, false);
        arg0.method2716(true, arg1);
        arg0.method2712(5);
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(B)V", line = 19)
    public static void method510(byte arg0) {
        field851 = null;
        field842 = null;
        if (arg0 == -82) {
            field854 = null;
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(ZLfo;)V", line = 32)
    public final void method511(boolean arg0, class473 arg1) {
        this.field847.method169(786336, 24, 1103);
        if (!arg0) {
            method514(34, -101, (byte) -49);
        }
        field852++;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lfo;I)V", line = 43)
    private final void method512(class473 arg0, int arg1) {
        if (arg1 >= -14) {
            field849 = 86;
        }
        field853++;
        arg0.method2716(true, true);
        arg0.method2703(-93, true);
        if (class208.field2521 != arg0.field6873) {
            arg0.method368(class208.field2521);
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lfo;ILtg;)V", line = 59)
    public final void method513(class473 arg0, int arg1, class211 arg2) {
        field836++;
        if (arg0.field6779 == null) {
            return;
        }
        this.method509(arg0, false);
        float var4 = arg0.field6779.field9520;
        float var5 = arg0.field6779.field9522;
        float var6 = arg0.field6779.field9523;
        float var7 = arg0.field6779.field9505;
        try {
            if (arg2.field2562) {
                int var8 = arg2.field2560 - arg2.field2563;
                int var9;
                if ((var8 + 2) > 1600) {
                    var9 = class465.method2644(var8, 4) + 1 - class28.field341;
                    var8 = (var8 >> var9) + 2;
                } else {
                    var8 += 2;
                    var9 = 0;
                }
                class342 var10 = arg2.field2558.field7894;
                class342 var11 = var10.field4441;
                int var12 = -2;
                boolean var13 = true;
                boolean var14 = true;
                while (var10 != var11) {
                    this.field840 = 0;
                    for (int var15 = 0; var15 < var8; var15++) {
                        this.field850[var15] = 0;
                    }
                    for (int var16 = 0; var16 < 64; var16++) {
                        this.field841[var16] = 0;
                    }
                    while (var10 != var11) {
                        class663 var17 = (class663) var11;
                        if (var14) {
                            var12 = var17.field9425;
                            var14 = false;
                            var13 = var17.field9419;
                        } else if (var17.field9425 != var12 || var17.field9419 != var13) {
                            var14 = true;
                            break;
                        }
                        int var18 = (int) ((float) (var17.field9423 >> 12) * var6 + (float) (var17.field9426 >> 12) * var4 + (float) (var17.field9421 >> 12) * var5 + var7) - arg2.field2563 >> var9;
                        if (var18 < 1600) {
                            if (this.field850[var18] < 64) {
                                this.field833[var18][this.field850[var18]++] = var17;
                            } else {
                                label196: {
                                    if (this.field850[var18] == 64) {
                                        if (this.field840 == 64) {
                                            break label196;
                                        }
                                        this.field850[var18] += this.field840++ + 1;
                                    }
                                    this.field838[this.field850[var18] - 64 - 1][this.field841[this.field850[var18] - 1 - 64]++] = var17;
                                }
                            }
                        }
                        var11 = var11.field4441;
                    }
                    arg0.method2733(var12 > 0 ? var12 : -1, 81, false, false);
                    if (var13 && class208.field2521 != arg0.field6873) {
                        arg0.method368(class208.field2521);
                    } else if (arg0.field6873 != 1.0F) {
                        arg0.method368(1.0F);
                    }
                    this.method516(var8, arg0, (byte) -112);
                }
            } else {
                int var19 = 0;
                int var20 = Integer.MAX_VALUE;
                int var21 = 0;
                class342 var22 = arg2.field2558.field7894;
                for (class342 var23 = var22.field4441; var23 != var22; var23 = var23.field4441) {
                    class663 var24 = (class663) var23;
                    int var25 = (int) ((float) (var24.field9423 >> 12) * var6 + (float) (var24.field9426 >> 12) * var4 + (float) (var24.field9421 >> 12) * var5 + var7);
                    if (var25 > var21) {
                        var21 = var25;
                    }
                    if (var20 > var25) {
                        var20 = var25;
                    }
                    this.field839[var19++] = var25;
                }
                int var26 = var21 - var20;
                int var27;
                if ((var26 + 2) <= 1600) {
                    var27 = 0;
                    var26 += 2;
                } else {
                    var27 = class465.method2644(var26, 4) + 1 - class28.field341;
                    var26 = (var26 >> var27) + 2;
                }
                class342 var28 = var22.field4441;
                int var29 = 0;
                int var30 = -2;
                boolean var31 = true;
                boolean var32 = true;
                while (var22 != var28) {
                    this.field840 = 0;
                    for (int var33 = 0; var33 < var26; var33++) {
                        this.field850[var33] = 0;
                    }
                    for (int var34 = 0; var34 < 64; var34++) {
                        this.field841[var34] = 0;
                    }
                    while (var22 != var28) {
                        class663 var35 = (class663) var28;
                        if (var32) {
                            var31 = var35.field9419;
                            var32 = false;
                            var30 = var35.field9425;
                        }
                        if (var29 > 0 && (var35.field9425 != var30 || var35.field9419 != var31)) {
                            var32 = true;
                            break;
                        }
                        int var36 = this.field839[var29++] - var20 >> var27;
                        if (var36 < 1600) {
                            if (this.field850[var36] >= 64) {
                                label146: {
                                    if (this.field850[var36] == 64) {
                                        if (this.field840 == 64) {
                                            break label146;
                                        }
                                        this.field850[var36] += this.field840++ + 1;
                                    }
                                    class663[] var10000 = this.field838[this.field850[var36] - 64 - 1];
                                    int var10002 = this.field850[var36] - 65;
                                    int var10004 = this.field841[this.field850[var36] - 65];
                                    this.field841[var10002] = this.field841[this.field850[var36] - 65] + 1;
                                    var10000[var10004] = var35;
                                }
                            } else {
                                this.field833[var36][this.field850[var36]++] = var35;
                            }
                        }
                        var28 = var28.field4441;
                    }
                    arg0.method2733(var30 >= 0 ? var30 : -1, 82, false, false);
                    if (var31 && class208.field2521 != arg0.field6873) {
                        arg0.method368(class208.field2521);
                    } else if (arg0.field6873 != 1.0F) {
                        arg0.method368(1.0F);
                    }
                    this.method516(var26, arg0, (byte) 44);
                }
            }
        } catch (Exception var37) {
        }
        this.method512(arg0, -55);
        if (arg1 != -64) {
            method514(-58, -39, (byte) -90);
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(IIB)I", line = 332)
    public static final int method514(int arg0, int arg1, byte arg2) {
        field831++;
        int var3 = (arg0 & 0x7F) * arg1 >> 7;
        if (arg2 >= -103) {
            field848 = 45;
        }
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg0 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!tt", name = "<init>", descriptor = "(Lfo;)V", line = 827)
    public class80(class473 arg0) {
        this.field834 = arg0.method1161((byte) 93, new class150[] { new class150(new class546[] { class546.field7810, class546.field7815, class546.field7817 }), new class150(class546.field7813) });
        this.field847 = arg0.method1203(true, false);
        this.field843 = arg0.method1203(false, false);
        this.field843.method169(393168, 12, 1103);
        this.field844 = arg0.method1181((byte) 121, false);
        this.field844.method1024(-111, 49146);
        Buffer var2 = this.field844.method167(18829, true);
        if (var2 != null) {
            Stream var3 = arg0.method2714(var2, (byte) -11);
            if (Stream.method3440()) {
                for (int var4 = 0; var4 < 8191; var4++) {
                    int var5 = var4 * 4;
                    var3.method3435(var5);
                    var3.method3435(var5 + 1);
                    var3.method3435(var5 + 2);
                    var3.method3435(var5 + 2);
                    var3.method3435(var5 + 3);
                    var3.method3435(var5);
                }
            } else {
                for (int var6 = 0; var6 < 8191; var6++) {
                    int var7 = var6 * 4;
                    var3.method3439(var7);
                    var3.method3439(var7 + 1);
                    var3.method3439(var7 + 2);
                    var3.method3439(var7 + 2);
                    var3.method3439(var7 + 3);
                    var3.method3439(var7);
                }
            }
            var3.method3434();
            this.field844.method170(9406);
        }
        Buffer var8 = this.field843.method167(18829, true);
        if (var8 != null) {
            Stream var9 = arg0.method2714(var8, (byte) -103);
            if (Stream.method3440()) {
                for (int var10 = 0; var10 < 8191; var10++) {
                    var9.method3438(0.0F);
                    var9.method3438(-1.0F);
                    var9.method3438(0.0F);
                    var9.method3438(0.0F);
                    var9.method3438(-1.0F);
                    var9.method3438(0.0F);
                    var9.method3438(0.0F);
                    var9.method3438(-1.0F);
                    var9.method3438(0.0F);
                    var9.method3438(0.0F);
                    var9.method3438(-1.0F);
                    var9.method3438(0.0F);
                }
            } else {
                for (int var11 = 0; var11 < 8191; var11++) {
                    var9.method3444(0.0F);
                    var9.method3444(-1.0F);
                    var9.method3444(0.0F);
                    var9.method3444(0.0F);
                    var9.method3444(-1.0F);
                    var9.method3444(0.0F);
                    var9.method3444(0.0F);
                    var9.method3444(-1.0F);
                    var9.method3444(0.0F);
                    var9.method3444(0.0F);
                    var9.method3444(-1.0F);
                    var9.method3444(0.0F);
                }
            }
            var9.method3434();
            this.field843.method170(9406);
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(Z)V", line = 361)
    public final void method515(boolean arg0) {
        field845++;
        if (arg0) {
            field851 = null;
        }
        this.field847.method166((byte) -38);
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(ILfo;B)V", line = 384)
    private final void method516(int arg0, class473 arg1, byte arg2) {
        field830++;
        int var4 = 0;
        class667 var5 = arg1.method2737(0);
        float var6 = var5.field9487;
        float var7 = var5.field9500;
        float var8 = var5.field9492;
        float var9 = var5.field9499;
        float var10 = var5.field9479;
        float var11 = var5.field9511;
        float var12 = var6 + var9;
        float var13 = var7 + var10;
        float var14 = var8 + var11;
        float var15 = var6 - var9;
        float var16 = var7 - var10;
        float var17 = var8 - var11;
        float var18 = var9 - var6;
        float var19 = var10 - var7;
        float var20 = var11 - var8;
        Buffer var21 = this.field847.method167(18829, true);
        int var22 = -2 % ((arg2 + 38) / 52);
        if (var21 == null) {
            return;
        }
        Stream var23 = arg1.method2714(var21, (byte) -106);
        if (Stream.method3440()) {
            for (int var49 = arg0 - 1; var49 >= 0; var49--) {
                int var50 = this.field850[var49] > 64 ? 64 : this.field850[var49];
                if (var50 > 0) {
                    for (int var51 = var50 - 1; var51 >= 0; var51--) {
                        class663 var64 = this.field833[var49][var51];
                        int var65 = var64.field9427;
                        byte var66 = (byte) (var65 >> 16);
                        byte var67 = (byte) (var65 >> 8);
                        byte var68 = (byte) var65;
                        byte var69 = (byte) (var65 >>> 24);
                        float var70 = (float) (var64.field9426 >> 12);
                        float var71 = (float) (var64.field9421 >> 12);
                        float var72 = (float) (var64.field9423 >> 12);
                        int var73 = var64.field9418 >> 12;
                        var23.method3438((float) (-var73) * var12 + var70);
                        var23.method3438((float) (-var73) * var13 + var71);
                        var23.method3438((float) (-var73) * var14 + var72);
                        if (arg1.field6825 == 0) {
                            var23.method3442(var66, var67, var68, var69);
                        } else {
                            var23.method3437(var66, var67, var68, var69);
                        }
                        var23.method3438(0.0F);
                        var23.method3438(0.0F);
                        var23.method3438((float) var73 * var15 + var70);
                        var23.method3438((float) var73 * var16 + var71);
                        var23.method3438((float) var73 * var17 + var72);
                        if (arg1.field6825 == 0) {
                            var23.method3442(var66, var67, var68, var69);
                        } else {
                            var23.method3437(var66, var67, var68, var69);
                        }
                        var23.method3438(1.0F);
                        var23.method3438(0.0F);
                        var23.method3438((float) var73 * var12 + var70);
                        var23.method3438((float) var73 * var13 + var71);
                        var23.method3438((float) var73 * var14 + var72);
                        if (arg1.field6825 == 0) {
                            var23.method3442(var66, var67, var68, var69);
                        } else {
                            var23.method3437(var66, var67, var68, var69);
                        }
                        var23.method3438(1.0F);
                        var23.method3438(1.0F);
                        var23.method3438((float) var73 * var18 + var70);
                        var23.method3438((float) var73 * var19 + var71);
                        var23.method3438((float) var73 * var20 + var72);
                        if (arg1.field6825 == 0) {
                            var23.method3442(var66, var67, var68, var69);
                        } else {
                            var23.method3437(var66, var67, var68, var69);
                        }
                        var23.method3438(0.0F);
                        var4++;
                        var23.method3438(1.0F);
                    }
                    if (this.field850[var49] > 64) {
                        int var52 = this.field850[var49] - 65;
                        for (int var53 = this.field841[var52] - 1; var53 >= 0; var53--) {
                            class663 var54 = this.field838[var52][var53];
                            int var55 = var54.field9427;
                            byte var56 = (byte) (var55 >> 16);
                            byte var57 = (byte) (var55 >> 8);
                            byte var58 = (byte) var55;
                            byte var59 = (byte) (var55 >>> 24);
                            float var60 = (float) (var54.field9426 >> 12);
                            float var61 = (float) (var54.field9421 >> 12);
                            float var62 = (float) (var54.field9423 >> 12);
                            int var63 = var54.field9418 >> 12;
                            var23.method3438((float) (-var63) * var12 + var60);
                            var23.method3438((float) (-var63) * var13 + var61);
                            var23.method3438((float) (-var63) * var14 + var62);
                            if (arg1.field6825 == 0) {
                                var23.method3442(var56, var57, var58, var59);
                            } else {
                                var23.method3437(var56, var57, var58, var59);
                            }
                            var23.method3438(0.0F);
                            var23.method3438(0.0F);
                            var23.method3438((float) var63 * var15 + var60);
                            var23.method3438((float) var63 * var16 + var61);
                            var23.method3438((float) var63 * var17 + var62);
                            if (arg1.field6825 == 0) {
                                var23.method3442(var56, var57, var58, var59);
                            } else {
                                var23.method3437(var56, var57, var58, var59);
                            }
                            var23.method3438(1.0F);
                            var23.method3438(0.0F);
                            var23.method3438((float) var63 * var12 + var60);
                            var23.method3438((float) var63 * var13 + var61);
                            var23.method3438((float) var63 * var14 + var62);
                            if (arg1.field6825 == 0) {
                                var23.method3442(var56, var57, var58, var59);
                            } else {
                                var23.method3437(var56, var57, var58, var59);
                            }
                            var23.method3438(1.0F);
                            var23.method3438(1.0F);
                            var23.method3438((float) var63 * var18 + var60);
                            var23.method3438((float) var63 * var19 + var61);
                            var23.method3438((float) var63 * var20 + var62);
                            if (arg1.field6825 == 0) {
                                var23.method3442(var56, var57, var58, var59);
                            } else {
                                var23.method3437(var56, var57, var58, var59);
                            }
                            var23.method3438(0.0F);
                            var4++;
                            var23.method3438(1.0F);
                        }
                    }
                }
            }
        } else {
            for (int var24 = arg0 - 1; var24 >= 0; var24--) {
                int var25 = this.field850[var24] > 64 ? 64 : this.field850[var24];
                if (var25 > 0) {
                    for (int var26 = var25 - 1; var26 >= 0; var26--) {
                        class663 var39 = this.field833[var24][var26];
                        int var40 = var39.field9427;
                        byte var41 = (byte) (var40 >> 16);
                        byte var42 = (byte) (var40 >> 8);
                        byte var43 = (byte) var40;
                        byte var44 = (byte) (var40 >>> 24);
                        float var45 = (float) (var39.field9426 >> 12);
                        float var46 = (float) (var39.field9421 >> 12);
                        float var47 = (float) (var39.field9423 >> 12);
                        int var48 = var39.field9418 >> 12;
                        var23.method3444((float) (-var48) * var12 + var45);
                        var23.method3444((float) (-var48) * var13 + var46);
                        var23.method3444((float) (-var48) * var14 + var47);
                        if (arg1.field6825 == 0) {
                            var23.method3442(var41, var42, var43, var44);
                        } else {
                            var23.method3437(var41, var42, var43, var44);
                        }
                        var23.method3444(0.0F);
                        var23.method3444(0.0F);
                        var23.method3444((float) var48 * var15 + var45);
                        var23.method3444((float) var48 * var16 + var46);
                        var23.method3444((float) var48 * var17 + var47);
                        if (arg1.field6825 == 0) {
                            var23.method3442(var41, var42, var43, var44);
                        } else {
                            var23.method3437(var41, var42, var43, var44);
                        }
                        var23.method3444(1.0F);
                        var23.method3444(0.0F);
                        var23.method3444((float) var48 * var12 + var45);
                        var23.method3444((float) var48 * var13 + var46);
                        var23.method3444((float) var48 * var14 + var47);
                        if (arg1.field6825 == 0) {
                            var23.method3442(var41, var42, var43, var44);
                        } else {
                            var23.method3437(var41, var42, var43, var44);
                        }
                        var23.method3444(1.0F);
                        var23.method3444(1.0F);
                        var23.method3444((float) var48 * var18 + var45);
                        var23.method3444((float) var48 * var19 + var46);
                        var23.method3444((float) var48 * var20 + var47);
                        if (arg1.field6825 == 0) {
                            var23.method3442(var41, var42, var43, var44);
                        } else {
                            var23.method3437(var41, var42, var43, var44);
                        }
                        var23.method3444(0.0F);
                        var23.method3444(1.0F);
                        var4++;
                    }
                    if (this.field850[var24] > 64) {
                        int var27 = this.field850[var24] - 1 - 64;
                        for (int var28 = this.field841[var27] - 1; var28 >= 0; var28--) {
                            class663 var29 = this.field838[var27][var28];
                            int var30 = var29.field9427;
                            byte var31 = (byte) (var30 >> 16);
                            byte var32 = (byte) (var30 >> 8);
                            byte var33 = (byte) var30;
                            byte var34 = (byte) (var30 >>> 24);
                            float var35 = (float) (var29.field9426 >> 12);
                            float var36 = (float) (var29.field9421 >> 12);
                            float var37 = (float) (var29.field9423 >> 12);
                            int var38 = var29.field9418 >> 12;
                            var23.method3444((float) (-var38) * var12 + var35);
                            var23.method3444((float) (-var38) * var13 + var36);
                            var23.method3444((float) (-var38) * var14 + var37);
                            if (arg1.field6825 == 0) {
                                var23.method3442(var31, var32, var33, var34);
                            } else {
                                var23.method3437(var31, var32, var33, var34);
                            }
                            var23.method3444(0.0F);
                            var23.method3444(0.0F);
                            var23.method3444((float) var38 * var15 + var35);
                            var23.method3444((float) var38 * var16 + var36);
                            var23.method3444((float) var38 * var17 + var37);
                            if (arg1.field6825 == 0) {
                                var23.method3442(var31, var32, var33, var34);
                            } else {
                                var23.method3437(var31, var32, var33, var34);
                            }
                            var23.method3444(1.0F);
                            var23.method3444(0.0F);
                            var23.method3444((float) var38 * var12 + var35);
                            var23.method3444((float) var38 * var13 + var36);
                            var23.method3444((float) var38 * var14 + var37);
                            if (arg1.field6825 == 0) {
                                var23.method3442(var31, var32, var33, var34);
                            } else {
                                var23.method3437(var31, var32, var33, var34);
                            }
                            var23.method3444(1.0F);
                            var23.method3444(1.0F);
                            var23.method3444((float) var38 * var18 + var35);
                            var23.method3444((float) var38 * var19 + var36);
                            var23.method3444((float) var38 * var20 + var37);
                            if (arg1.field6825 == 0) {
                                var23.method3442(var31, var32, var33, var34);
                            } else {
                                var23.method3437(var31, var32, var33, var34);
                            }
                            var23.method3444(0.0F);
                            var4++;
                            var23.method3444(1.0F);
                        }
                    }
                }
            }
        }
        var23.method3434();
        if (this.field847.method170(9406)) {
            arg1.method1198(0, (byte) 118, this.field847);
            arg1.method1198(1, (byte) 110, this.field843);
            arg1.method1174(0, this.field834);
            arg1.method1154(0, 0, (byte) 29, class565.field8009, this.field844, var4 * 2, var4 * 4);
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(III)Z", line = 775)
    public static final boolean method517(int arg0, int arg1, int arg2) {
        int var3 = 32 % ((-arg0 - 43) / 54);
        field837++;
        return (arg1 & 0x21) != 0;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(ZLoa;Lgf;)I", line = 785)
    public static final int method518(boolean arg0, class635 arg1, class250 arg2) {
        if (!arg0) {
            method510((byte) -33);
        }
        field835++;
        if (arg2.field3204 != -1) {
            return arg2.field3204;
        }
        if (arg2.field3208 != -1) {
            class414 var3 = arg1.field8990.method846((byte) -121, arg1.method315() ? arg2.field3208 : arg2.field3214);
            if (!var3.field5492) {
                return var3.field5480;
            }
        }
        return arg2.field3203;
    }
}
