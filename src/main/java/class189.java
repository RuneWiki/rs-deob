import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dga")
public class class189 {

    @OriginalMember(owner = "client!dga", name = "h", descriptor = "[I")
    private int[] field2790 = new int[1600];

    @OriginalMember(owner = "client!dga", name = "j", descriptor = "[I")
    private int[] field2792 = new int[8191];

    @OriginalMember(owner = "client!dga", name = "p", descriptor = "I")
    private int field2798 = 0;

    @OriginalMember(owner = "client!dga", name = "c", descriptor = "[[Lcq;")
    private class429[][] field2785 = new class429[1600][64];

    @OriginalMember(owner = "client!dga", name = "n", descriptor = "[I")
    private int[] field2796 = new int[64];

    @OriginalMember(owner = "client!dga", name = "q", descriptor = "[[Lcq;")
    private class429[][] field2799 = new class429[64][768];

    @OriginalMember(owner = "client!dga", name = "s", descriptor = "Lfl;")
    private class677 field2801;

    @OriginalMember(owner = "client!dga", name = "d", descriptor = "Liq;")
    private class555 field2786;

    @OriginalMember(owner = "client!dga", name = "k", descriptor = "Liq;")
    private class555 field2793;

    @OriginalMember(owner = "client!dga", name = "b", descriptor = "Ljn;")
    private class659 field2784;

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "I")
    public static int field2783;

    @OriginalMember(owner = "client!dga", name = "e", descriptor = "I")
    public static int field2787;

    @OriginalMember(owner = "client!dga", name = "f", descriptor = "I")
    public static int field2788;

    @OriginalMember(owner = "client!dga", name = "g", descriptor = "I")
    public static int field2789;

    @OriginalMember(owner = "client!dga", name = "i", descriptor = "I")
    public static int field2791;

    @OriginalMember(owner = "client!dga", name = "l", descriptor = "I")
    public static int field2794;

    @OriginalMember(owner = "client!dga", name = "m", descriptor = "I")
    public static int field2795;

    @OriginalMember(owner = "client!dga", name = "o", descriptor = "I")
    public static int field2797;

    @OriginalMember(owner = "client!dga", name = "r", descriptor = "I")
    public static int field2800;

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(ILgj;Lhfa;)V", line = 3)
    public final void method1252(int arg0, class580 arg1, class281 arg2) {
        field2787++;
        if (arg1.field7963 == null) {
            return;
        }
        this.method1255(false, arg1);
        float var4 = arg1.field7963.field5248;
        float var5 = arg1.field7963.field5249;
        float var6 = arg1.field7963.field5244;
        float var7 = arg1.field7963.field5208;
        try {
            if (arg0 != 30670) {
                this.method1255(false, null);
            }
            if (arg2.field3930) {
                int var26 = arg2.field3926 - arg2.field3928;
                int var27;
                if (var26 + 2 <= 1600) {
                    var27 = 0;
                    var26 += 2;
                } else {
                    var27 = class565.method3125(-257, var26) + 1 - class387.field5435;
                    var26 = (var26 >> var27) + 2;
                }
                class226 var28 = arg2.field3924.field5393;
                class226 var29 = var28.field3254;
                int var30 = -2;
                boolean var31 = true;
                boolean var32 = true;
                while (var28 != var29) {
                    this.field2798 = 0;
                    for (int var33 = 0; var33 < var26; var33++) {
                        this.field2790[var33] = 0;
                    }
                    for (int var34 = 0; var34 < 64; var34++) {
                        this.field2796[var34] = 0;
                    }
                    while (var28 != var29) {
                        class429 var35 = (class429) var29;
                        if (var32) {
                            var32 = false;
                            var30 = var35.field6024;
                            var31 = var35.field6029;
                        } else if (var35.field6024 != var30 || var35.field6029 != var31) {
                            var32 = true;
                            break;
                        }
                        int var36 = (int) ((float) (var35.field6031 >> 12) * var6 + (float) (var35.field6025 >> 12) * var4 + (float) (var35.field6021 >> 12) * var5 + var7) - arg2.field3928 >> var27;
                        if (var36 < 1600) {
                            if (this.field2790[var36] >= 64) {
                                label140: {
                                    if (this.field2790[var36] == 64) {
                                        if (this.field2798 == 64) {
                                            break label140;
                                        }
                                        this.field2790[var36] += (this.field2798++) + 1;
                                    }
                                    this.field2799[this.field2790[var36] - 65][this.field2796[this.field2790[var36] - 64 - 1]++] = var35;
                                }
                            } else {
                                this.field2785[var36][this.field2790[var36]++] = var35;
                            }
                        }
                        var29 = var29.field3254;
                    }
                    arg1.method3183(false, 128, var30 > 0 ? var30 : -1, false);
                    if (var31 && class177.field2627 != arg1.field8039) {
                        arg1.method465(class177.field2627);
                    } else if (arg1.field8039 != 1.0F) {
                        arg1.method465(1.0F);
                    }
                    this.method1257(var26, arg0 - 30642, arg1);
                }
            } else {
                int var8 = 0;
                int var9 = Integer.MAX_VALUE;
                int var10 = 0;
                class226 var11 = arg2.field3924.field5393;
                for (class226 var12 = var11.field3254; var12 != var11; var12 = var12.field3254) {
                    class429 var13 = (class429) var12;
                    int var14 = (int) ((float) (var13.field6031 >> 12) * var6 + (float) (var13.field6025 >> 12) * var4 + (float) (var13.field6021 >> 12) * var5 + var7);
                    this.field2792[var8++] = var14;
                    if (var10 < var14) {
                        var10 = var14;
                    }
                    if (var9 > var14) {
                        var9 = var14;
                    }
                }
                int var15 = var10 - var9;
                int var16;
                if ((var15 + 2) <= 1600) {
                    var16 = 0;
                    var15 += 2;
                } else {
                    var16 = class565.method3125(-257, var15) + 1 - class387.field5435;
                    var15 = (var15 >> var16) + 2;
                }
                class226 var17 = var11.field3254;
                int var18 = 0;
                int var19 = -2;
                boolean var20 = true;
                boolean var21 = true;
                while (var11 != var17) {
                    this.field2798 = 0;
                    for (int var22 = 0; var22 < var15; var22++) {
                        this.field2790[var22] = 0;
                    }
                    for (int var23 = 0; var23 < 64; var23++) {
                        this.field2796[var23] = 0;
                    }
                    while (var11 != var17) {
                        class429 var24 = (class429) var17;
                        if (var21) {
                            var19 = var24.field6024;
                            var21 = false;
                            var20 = var24.field6029;
                        }
                        if (var18 > 0 && (var24.field6024 != var19 || var20 != var24.field6029)) {
                            var21 = true;
                            break;
                        }
                        int var25 = this.field2792[var18++] - var9 >> var16;
                        if (var25 < 1600) {
                            if (this.field2790[var25] >= 64) {
                                label185: {
                                    if (this.field2790[var25] == 64) {
                                        if (this.field2798 == 64) {
                                            break label185;
                                        }
                                        this.field2790[var25] += (this.field2798++) + 1;
                                    }
                                    this.field2799[this.field2790[var25] - 1 - 64][this.field2796[this.field2790[var25] - 1 - 64]++] = var24;
                                }
                            } else {
                                this.field2785[var25][this.field2790[var25]++] = var24;
                            }
                        }
                        var17 = var17.field3254;
                    }
                    arg1.method3183(false, 128, var19 >= 0 ? var19 : -1, false);
                    if (var20 && class177.field2627 != arg1.field8039) {
                        arg1.method465(class177.field2627);
                    } else if (arg1.field8039 != 1.0F) {
                        arg1.method465(1.0F);
                    }
                    this.method1257(var15, arg0 ^ 0x77B6, arg1);
                }
            }
        } catch (Exception var37) {
        }
        this.method1256(arg0 - 20730, arg1);
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(Lgj;I)V", line = 278)
    public final void method1253(class580 arg0, int arg1) {
        field2795++;
        this.field2786.method1249(786336, arg1, (byte) -120);
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(B)V", line = 291)
    public final void method1254(byte arg0) {
        field2789++;
        if (arg0 != -126) {
            this.method1257(-23, -24, null);
        }
        this.field2786.method776(false);
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(ZLgj;)V", line = 303)
    private final void method1255(boolean arg0, class580 arg1) {
        class177.field2627 = arg1.field8039;
        field2797++;
        arg1.method3215(false);
        arg1.method3175(false, (byte) 67);
        arg1.method3250(false, arg0);
        arg1.method3251((byte) 123);
    }

    @OriginalMember(owner = "client!dga", name = "<init>", descriptor = "(Lgj;)V", line = 802)
    public class189(class580 arg0) {
        this.field2801 = arg0.method307(new class215[] { new class215(new class657[] { class657.field9245, class657.field9253, class657.field9255 }), new class215(class657.field9252) }, (byte) 107);
        this.field2786 = arg0.method337((byte) -61, true);
        this.field2793 = arg0.method337((byte) -61, false);
        this.field2793.method1249(393168, 12, (byte) -120);
        this.field2784 = arg0.method290(false, 0);
        this.field2784.method777(49146, (byte) 73);
        Buffer var2 = this.field2784.method779((byte) -20, true);
        if (var2 != null) {
            Stream var3 = arg0.method3212(var2, (byte) 52);
            if (Stream.method3418()) {
                for (int var4 = 0; var4 < 8191; var4++) {
                    int var5 = var4 * 4;
                    var3.method3425(var5);
                    var3.method3425(var5 + 1);
                    var3.method3425(var5 + 2);
                    var3.method3425(var5 + 2);
                    var3.method3425(var5 + 3);
                    var3.method3425(var5);
                }
            } else {
                for (int var6 = 0; var6 < 8191; var6++) {
                    int var7 = var6 * 4;
                    var3.method3416(var7);
                    var3.method3416(var7 + 1);
                    var3.method3416(var7 + 2);
                    var3.method3416(var7 + 2);
                    var3.method3416(var7 + 3);
                    var3.method3416(var7);
                }
            }
            var3.method3426();
            this.field2784.method774(-22324);
        }
        Buffer var8 = this.field2793.method779((byte) -20, true);
        if (var8 != null) {
            Stream var9 = arg0.method3212(var8, (byte) -112);
            if (Stream.method3418()) {
                for (int var10 = 0; var10 < 8191; var10++) {
                    var9.method3421(0.0F);
                    var9.method3421(-1.0F);
                    var9.method3421(0.0F);
                    var9.method3421(0.0F);
                    var9.method3421(-1.0F);
                    var9.method3421(0.0F);
                    var9.method3421(0.0F);
                    var9.method3421(-1.0F);
                    var9.method3421(0.0F);
                    var9.method3421(0.0F);
                    var9.method3421(-1.0F);
                    var9.method3421(0.0F);
                }
            } else {
                for (int var11 = 0; var11 < 8191; var11++) {
                    var9.method3428(0.0F);
                    var9.method3428(-1.0F);
                    var9.method3428(0.0F);
                    var9.method3428(0.0F);
                    var9.method3428(-1.0F);
                    var9.method3428(0.0F);
                    var9.method3428(0.0F);
                    var9.method3428(-1.0F);
                    var9.method3428(0.0F);
                    var9.method3428(0.0F);
                    var9.method3428(-1.0F);
                    var9.method3428(0.0F);
                }
            }
            var9.method3426();
            this.field2793.method774(-22324);
        }
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(ILgj;)V", line = 324)
    private final void method1256(int arg0, class580 arg1) {
        arg1.method3250(true, false);
        if (arg0 != 9940) {
            this.field2785 = null;
        }
        field2783++;
        arg1.method3175(true, (byte) 67);
        if (class177.field2627 != arg1.field8039) {
            arg1.method465(class177.field2627);
        }
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(IILgj;)V", line = 348)
    private final void method1257(int arg0, int arg1, class580 arg2) {
        field2794++;
        int var4 = 0;
        class367 var5 = arg2.method3196(46);
        float var6 = var5.field5239;
        float var7 = var5.field5215;
        float var8 = var5.field5217;
        float var9 = var5.field5224;
        float var10 = var5.field5246;
        float var11 = var5.field5212;
        float var12 = var6 + var9;
        float var13 = var7 + var10;
        int var14 = -12 % ((arg1 + 61) / 59);
        float var15 = var8 + var11;
        float var16 = var6 - var9;
        float var17 = var7 - var10;
        float var18 = var8 - var11;
        float var19 = var9 - var6;
        float var20 = var10 - var7;
        float var21 = var11 - var8;
        Buffer var22 = this.field2786.method779((byte) -20, true);
        if (var22 == null) {
            return;
        }
        Stream var23 = arg2.method3212(var22, (byte) 71);
        if (Stream.method3418()) {
            for (int var49 = arg0 - 1; var49 >= 0; var49--) {
                int var50 = this.field2790[var49] > 64 ? 64 : this.field2790[var49];
                if (var50 > 0) {
                    for (int var51 = var50 - 1; var51 >= 0; var51--) {
                        class429 var64 = this.field2785[var49][var51];
                        int var65 = var64.field6023;
                        byte var66 = (byte) (var65 >> 16);
                        byte var67 = (byte) (var65 >> 8);
                        byte var68 = (byte) var65;
                        byte var69 = (byte) (var65 >>> 24);
                        float var70 = (float) (var64.field6025 >> 12);
                        float var71 = (float) (var64.field6021 >> 12);
                        float var72 = (float) (var64.field6031 >> 12);
                        int var73 = var64.field6028 >> 12;
                        var23.method3421((float) (-var73) * var12 + var70);
                        var23.method3421((float) (-var73) * var13 + var71);
                        var23.method3421((float) (-var73) * var15 + var72);
                        if (arg2.field7999 == 0) {
                            var23.method3415(var66, var67, var68, var69);
                        } else {
                            var23.method3423(var66, var67, var68, var69);
                        }
                        var23.method3421(0.0F);
                        var23.method3421(0.0F);
                        var23.method3421((float) var73 * var16 + var70);
                        var23.method3421((float) var73 * var17 + var71);
                        var23.method3421((float) var73 * var18 + var72);
                        if (arg2.field7999 == 0) {
                            var23.method3415(var66, var67, var68, var69);
                        } else {
                            var23.method3423(var66, var67, var68, var69);
                        }
                        var23.method3421(1.0F);
                        var23.method3421(0.0F);
                        var23.method3421((float) var73 * var12 + var70);
                        var23.method3421((float) var73 * var13 + var71);
                        var23.method3421((float) var73 * var15 + var72);
                        if (arg2.field7999 == 0) {
                            var23.method3415(var66, var67, var68, var69);
                        } else {
                            var23.method3423(var66, var67, var68, var69);
                        }
                        var23.method3421(1.0F);
                        var23.method3421(1.0F);
                        var23.method3421((float) var73 * var19 + var70);
                        var23.method3421((float) var73 * var20 + var71);
                        var23.method3421((float) var73 * var21 + var72);
                        if (arg2.field7999 == 0) {
                            var23.method3415(var66, var67, var68, var69);
                        } else {
                            var23.method3423(var66, var67, var68, var69);
                        }
                        var23.method3421(0.0F);
                        var23.method3421(1.0F);
                        var4++;
                    }
                    if (this.field2790[var49] > 64) {
                        int var52 = this.field2790[var49] - 64 - 1;
                        for (int var53 = this.field2796[var52] - 1; var53 >= 0; var53--) {
                            class429 var54 = this.field2799[var52][var53];
                            int var55 = var54.field6023;
                            byte var56 = (byte) (var55 >> 16);
                            byte var57 = (byte) (var55 >> 8);
                            byte var58 = (byte) var55;
                            byte var59 = (byte) (var55 >>> 24);
                            float var60 = (float) (var54.field6025 >> 12);
                            float var61 = (float) (var54.field6021 >> 12);
                            float var62 = (float) (var54.field6031 >> 12);
                            int var63 = var54.field6028 >> 12;
                            var23.method3421((float) (-var63) * var12 + var60);
                            var23.method3421((float) (-var63) * var13 + var61);
                            var23.method3421((float) (-var63) * var15 + var62);
                            if (arg2.field7999 == 0) {
                                var23.method3415(var56, var57, var58, var59);
                            } else {
                                var23.method3423(var56, var57, var58, var59);
                            }
                            var23.method3421(0.0F);
                            var23.method3421(0.0F);
                            var23.method3421((float) var63 * var16 + var60);
                            var23.method3421((float) var63 * var17 + var61);
                            var23.method3421((float) var63 * var18 + var62);
                            if (arg2.field7999 == 0) {
                                var23.method3415(var56, var57, var58, var59);
                            } else {
                                var23.method3423(var56, var57, var58, var59);
                            }
                            var23.method3421(1.0F);
                            var23.method3421(0.0F);
                            var23.method3421((float) var63 * var12 + var60);
                            var23.method3421((float) var63 * var13 + var61);
                            var23.method3421((float) var63 * var15 + var62);
                            if (arg2.field7999 == 0) {
                                var23.method3415(var56, var57, var58, var59);
                            } else {
                                var23.method3423(var56, var57, var58, var59);
                            }
                            var23.method3421(1.0F);
                            var23.method3421(1.0F);
                            var23.method3421((float) var63 * var19 + var60);
                            var23.method3421((float) var63 * var20 + var61);
                            var23.method3421((float) var63 * var21 + var62);
                            if (arg2.field7999 == 0) {
                                var23.method3415(var56, var57, var58, var59);
                            } else {
                                var23.method3423(var56, var57, var58, var59);
                            }
                            var23.method3421(0.0F);
                            var23.method3421(1.0F);
                            var4++;
                        }
                    }
                }
            }
        } else {
            for (int var24 = arg0 - 1; var24 >= 0; var24--) {
                int var25 = this.field2790[var24] <= 64 ? this.field2790[var24] : 64;
                if (var25 > 0) {
                    for (int var26 = var25 - 1; var26 >= 0; var26--) {
                        class429 var39 = this.field2785[var24][var26];
                        int var40 = var39.field6023;
                        byte var41 = (byte) (var40 >> 16);
                        byte var42 = (byte) (var40 >> 8);
                        byte var43 = (byte) var40;
                        byte var44 = (byte) (var40 >>> 24);
                        float var45 = (float) (var39.field6025 >> 12);
                        float var46 = (float) (var39.field6021 >> 12);
                        float var47 = (float) (var39.field6031 >> 12);
                        int var48 = var39.field6028 >> 12;
                        var23.method3428((float) (-var48) * var12 + var45);
                        var23.method3428((float) (-var48) * var13 + var46);
                        var23.method3428((float) (-var48) * var15 + var47);
                        if (arg2.field7999 == 0) {
                            var23.method3415(var41, var42, var43, var44);
                        } else {
                            var23.method3423(var41, var42, var43, var44);
                        }
                        var23.method3428(0.0F);
                        var23.method3428(0.0F);
                        var23.method3428((float) var48 * var16 + var45);
                        var23.method3428((float) var48 * var17 + var46);
                        var23.method3428((float) var48 * var18 + var47);
                        if (arg2.field7999 == 0) {
                            var23.method3415(var41, var42, var43, var44);
                        } else {
                            var23.method3423(var41, var42, var43, var44);
                        }
                        var23.method3428(1.0F);
                        var23.method3428(0.0F);
                        var23.method3428((float) var48 * var12 + var45);
                        var23.method3428((float) var48 * var13 + var46);
                        var23.method3428((float) var48 * var15 + var47);
                        if (arg2.field7999 == 0) {
                            var23.method3415(var41, var42, var43, var44);
                        } else {
                            var23.method3423(var41, var42, var43, var44);
                        }
                        var23.method3428(1.0F);
                        var23.method3428(1.0F);
                        var23.method3428((float) var48 * var19 + var45);
                        var23.method3428((float) var48 * var20 + var46);
                        var23.method3428((float) var48 * var21 + var47);
                        if (arg2.field7999 == 0) {
                            var23.method3415(var41, var42, var43, var44);
                        } else {
                            var23.method3423(var41, var42, var43, var44);
                        }
                        var23.method3428(0.0F);
                        var4++;
                        var23.method3428(1.0F);
                    }
                    if (this.field2790[var24] > 64) {
                        int var27 = this.field2790[var24] - 64 - 1;
                        for (int var28 = this.field2796[var27] - 1; var28 >= 0; var28--) {
                            class429 var29 = this.field2799[var27][var28];
                            int var30 = var29.field6023;
                            byte var31 = (byte) (var30 >> 16);
                            byte var32 = (byte) (var30 >> 8);
                            byte var33 = (byte) var30;
                            byte var34 = (byte) (var30 >>> 24);
                            float var35 = (float) (var29.field6025 >> 12);
                            float var36 = (float) (var29.field6021 >> 12);
                            float var37 = (float) (var29.field6031 >> 12);
                            int var38 = var29.field6028 >> 12;
                            var23.method3428((float) (-var38) * var12 + var35);
                            var23.method3428((float) (-var38) * var13 + var36);
                            var23.method3428((float) (-var38) * var15 + var37);
                            if (arg2.field7999 == 0) {
                                var23.method3415(var31, var32, var33, var34);
                            } else {
                                var23.method3423(var31, var32, var33, var34);
                            }
                            var23.method3428(0.0F);
                            var23.method3428(0.0F);
                            var23.method3428((float) var38 * var16 + var35);
                            var23.method3428((float) var38 * var17 + var36);
                            var23.method3428((float) var38 * var18 + var37);
                            if (arg2.field7999 == 0) {
                                var23.method3415(var31, var32, var33, var34);
                            } else {
                                var23.method3423(var31, var32, var33, var34);
                            }
                            var23.method3428(1.0F);
                            var23.method3428(0.0F);
                            var23.method3428((float) var38 * var12 + var35);
                            var23.method3428((float) var38 * var13 + var36);
                            var23.method3428((float) var38 * var15 + var37);
                            if (arg2.field7999 == 0) {
                                var23.method3415(var31, var32, var33, var34);
                            } else {
                                var23.method3423(var31, var32, var33, var34);
                            }
                            var23.method3428(1.0F);
                            var23.method3428(1.0F);
                            var23.method3428((float) var38 * var19 + var35);
                            var23.method3428((float) var38 * var20 + var36);
                            var23.method3428((float) var38 * var21 + var37);
                            if (arg2.field7999 == 0) {
                                var23.method3415(var31, var32, var33, var34);
                            } else {
                                var23.method3423(var31, var32, var33, var34);
                            }
                            var23.method3428(0.0F);
                            var23.method3428(1.0F);
                            var4++;
                        }
                    }
                }
            }
        }
        var23.method3426();
        if (this.field2786.method774(-22324)) {
            arg2.method313(this.field2786, 15, 0);
            arg2.method313(this.field2793, 15, 1);
            arg2.method348((byte) -62, this.field2801);
            arg2.method318(var4 * 4, 4025, var4 * 2, 0, this.field2784, class47.field697, 0);
        }
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(IBI)V", line = 736)
    public static final void method1258(int arg0, byte arg1, int arg2) {
        class623.field8692 = arg2 - class148.field2208;
        if (arg1 >= 17) {
            field2788++;
            class675.field9543 = arg0 - class148.field2206;
        }
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(I)V", line = 749)
    public static final void method1259(int arg0) {
        field2791++;
        if (arg0 != -9381) {
            method1258(8, (byte) -37, 106);
        }
        if (class79.field1093.toLowerCase().indexOf("microsoft") != -1) {
            class656.field9238[186] = 57;
            class656.field9238[221] = 43;
            class656.field9238[192] = 58;
            class656.field9238[188] = 71;
            class656.field9238[189] = 26;
            class656.field9238[222] = 59;
            class656.field9238[187] = 27;
            class656.field9238[190] = 72;
            class656.field9238[223] = 28;
            class656.field9238[219] = 42;
            class656.field9238[191] = 73;
            class656.field9238[220] = 74;
            return;
        }
        if (class79.field1089 == null) {
            class656.field9238[222] = 59;
            class656.field9238[192] = 58;
        } else {
            class656.field9238[520] = 59;
            class656.field9238[192] = 28;
            class656.field9238[222] = 58;
        }
        class656.field9238[92] = 74;
        class656.field9238[91] = 42;
        class656.field9238[46] = 72;
        class656.field9238[45] = 26;
        class656.field9238[44] = 71;
        class656.field9238[47] = 73;
        class656.field9238[61] = 27;
        class656.field9238[93] = 43;
        class656.field9238[59] = 57;
    }
}
