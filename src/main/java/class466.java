import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!os")
public class class466 {

    @OriginalMember(owner = "client!os", name = "d", descriptor = "[I")
    private int[] field6794 = new int[64];

    @OriginalMember(owner = "client!os", name = "m", descriptor = "[[Lnh;")
    private class777[][] field6790 = new class777[1600][64];

    @OriginalMember(owner = "client!os", name = "i", descriptor = "[I")
    private int[] field6789 = new int[1600];

    @OriginalMember(owner = "client!os", name = "h", descriptor = "[[Lnh;")
    private class777[][] field6801 = new class777[64][768];

    @OriginalMember(owner = "client!os", name = "c", descriptor = "[I")
    private int[] field6805 = new int[8191];

    @OriginalMember(owner = "client!os", name = "j", descriptor = "I")
    private int field6804 = 0;

    @OriginalMember(owner = "client!os", name = "n", descriptor = "Lgn;")
    private class728 field6802;

    @OriginalMember(owner = "client!os", name = "f", descriptor = "Lsfa;")
    private class723 field6792;

    @OriginalMember(owner = "client!os", name = "e", descriptor = "Lsfa;")
    private class723 field6791;

    @OriginalMember(owner = "client!os", name = "l", descriptor = "Lje;")
    private class421 field6799;

    @OriginalMember(owner = "client!os", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6807 = new String[] { method3549(method3548("AX4bd")), method3549(method3548("U\u00054\u00051")), method3549(method3548("T\u0003v ")), method3549(method3548("U\u00054\u00041")), method3549(method3548("U\u00054\n1")), method3549(method3548("U\u00054\u000f1")), method3549(method3548("U\u00054\u000e1")), method3549(method3548("U\u00054ppT\u001fnr1")), method3549(method3548("U\u00054\r1")), method3549(method3548("U\u00054\u000b1")), method3549(method3548("U\u00054\b1")), method3549(method3548("U\u00054\t1")) };

    @OriginalMember(owner = "client!os", name = "b", descriptor = "I")
    public static int field6788;

    @OriginalMember(owner = "client!os", name = "r", descriptor = "I")
    public static int field6793;

    @OriginalMember(owner = "client!os", name = "g", descriptor = "I")
    public static int field6796;

    @OriginalMember(owner = "client!os", name = "p", descriptor = "I")
    public static int field6797;

    @OriginalMember(owner = "client!os", name = "a", descriptor = "I")
    public static int field6798;

    @OriginalMember(owner = "client!os", name = "o", descriptor = "I")
    public static int field6800;

    @OriginalMember(owner = "client!os", name = "k", descriptor = "I")
    public static int field6803;

    @OriginalMember(owner = "client!os", name = "q", descriptor = "I")
    public static int field6806;

    @OriginalMember(owner = "client!os", name = "s", descriptor = "Ljava/lang/String;")
    public static String field6795;

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(B)V")
    public final void method3539(byte arg0) {
        try {
            int var2 = -50 % ((arg0 + 37) / 44);
            field6793++;
            this.field6792.method20(true);
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field6807[11] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!os", name = "b", descriptor = "(I)V")
    public static void method3540(int arg0) {
        try {
            if (arg0 != 0) {
                field6795 = null;
            }
            field6795 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field6807[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(ILkd;)V")
    private final void method3541(int arg0, class296 arg1) {
        try {
            arg1.method2473((byte) -118, true);
            field6796++;
            if (arg0 >= 49) {
                arg1.method2423(true, 13660);
                if (class705.field10235 != arg1.field4601) {
                    arg1.method526(class705.field10235);
                }
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field6807[9] + arg0 + ',' + (arg1 == null ? field6807[2] : field6807[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(I)Z")
    public static final boolean method3542(int arg0) {
        try {
            field6806++;
            boolean var1 = true;
            if (class5.field46 == null) {
                if (class383.field5798.method3618(class620.field9108, 75)) {
                    class5.field46 = class481.method3669(class383.field5798, class620.field9108);
                } else {
                    var1 = false;
                }
            }
            if (class216.field3287 == null) {
                if (class383.field5798.method3618(class431.field6342, 83)) {
                    class216.field3287 = class481.method3669(class383.field5798, class431.field6342);
                } else {
                    var1 = false;
                }
            }
            if (class54.field590 == null) {
                if (class383.field5798.method3618(class382.field5788, 125)) {
                    class54.field590 = class481.method3669(class383.field5798, class382.field5788);
                } else {
                    var1 = false;
                }
            }
            if (class234.field3530 == null) {
                if (class753.field10953.method3618(class83.field932, 117)) {
                    class234.field3530 = class350.method2876(7, class83.field932, class753.field10953);
                } else {
                    var1 = false;
                }
            }
            if (class751.field10915 == null) {
                if (class383.field5798.method3618(class83.field932, 55)) {
                    class751.field10915 = class481.method3677(class383.field5798, class83.field932);
                } else {
                    var1 = false;
                }
            }
            int var2 = 102 / ((18 - arg0) / 49);
            return var1;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field6807[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(ILjw;Lkd;I)V")
    public final void method3543(int arg0, class580 arg1, class296 arg2, int arg3) {
        try {
            field6798++;
            if (arg2.field4547 != null) {
                if (arg0 >= 0) {
                    this.method3546(arg0, arg2, 118);
                } else {
                    this.method3545(-112, arg2);
                }
                float var5 = arg2.field4547.field11168;
                float var6 = arg2.field4547.field11193;
                float var7 = arg2.field4547.field11170;
                float var8 = arg2.field4547.field11153;
                try {
                    int var9 = 0;
                    int var10 = Integer.MAX_VALUE;
                    int var11 = 0;
                    class215 var12 = arg1.field8599.field7437;
                    if (arg3 > -99) {
                        this.method3543(46, null, null, -39);
                    }
                    for (class215 var13 = var12.field3274; var13 != var12; var13 = var13.field3274) {
                        class777 var14 = (class777) var13;
                        int var15 = (int) ((float) (var14.field11290 >> 12) * var7 + (float) (var14.field11291 >> 12) * var6 + (float) (var14.field11286 >> 12) * var5 + var8);
                        if (var11 < var15) {
                            var11 = var15;
                        }
                        if (var10 > var15) {
                            var10 = var15;
                        }
                        this.field6805[var9++] = var15;
                    }
                    int var16 = var11 - var10;
                    int var17;
                    if (var16 + 2 > 1600) {
                        var17 = class54.method410((byte) -106, var16) + 1 - class6.field59;
                        var16 = (var16 >> var17) + 2;
                    } else {
                        var17 = 0;
                        var16 += 2;
                    }
                    int var18 = 0;
                    class215 var19 = var12.field3274;
                    int var20 = -2;
                    boolean var21 = true;
                    boolean var22 = true;
                    while (var12 != var19) {
                        this.field6804 = 0;
                        for (int var23 = 0; var23 < var16; var23++) {
                            this.field6789[var23] = 0;
                        }
                        for (int var24 = 0; var24 < 64; var24++) {
                            this.field6794[var24] = 0;
                        }
                        while (var12 != var19) {
                            class777 var25 = (class777) var19;
                            if (var22) {
                                var21 = var25.field11283;
                                var22 = false;
                                var20 = var25.field11282;
                            }
                            if (var18 > 0 && (var25.field11282 != var20 || var21 != var25.field11283)) {
                                var22 = true;
                                break;
                            }
                            int var26 = this.field6805[var18++] - var10 >> var17;
                            if (var26 < 1600) {
                                if (this.field6789[var26] < 64) {
                                    this.field6790[var26][this.field6789[var26]++] = var25;
                                } else {
                                    label135: {
                                        if (this.field6789[var26] == 64) {
                                            if (this.field6804 == 64) {
                                                break label135;
                                            }
                                            this.field6789[var26] += this.field6804++ + 1;
                                        }
                                        this.field6801[this.field6789[var26] - 1 - 64][this.field6794[this.field6789[var26] - 64 - 1]++] = var25;
                                    }
                                }
                            }
                            var19 = var19.field3274;
                        }
                        arg2.method2477(0, false, var20 < 0 ? -1 : var20, false);
                        if (var21 && class705.field10235 != arg2.field4601) {
                            arg2.method526(class705.field10235);
                        } else if (arg2.field4601 != 1.0F) {
                            arg2.method526(1.0F);
                        }
                        this.method3544(arg2, -104, var16);
                    }
                } catch (Exception var28) {
                }
                this.method3541(56, arg2);
            }
        } catch (RuntimeException var29) {
            throw class759.method5498(var29, field6807[6] + arg0 + ',' + (arg1 == null ? field6807[2] : field6807[0]) + ',' + (arg2 == null ? field6807[2] : field6807[0]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Lkd;II)V")
    private final void method3544(class296 arg0, int arg1, int arg2) {
        try {
            field6800++;
            int var4 = 0;
            class770 var5 = arg0.method2497((byte) 101);
            float var6 = var5.field11176;
            float var7 = var5.field11182;
            float var8 = var5.field11184;
            float var9 = var5.field11187;
            float var10 = var5.field11179;
            float var11 = var5.field11145;
            float var12 = var6 + var9;
            if (arg1 >= -13) {
                this.method3545(-117, null);
            }
            float var13 = var7 + var10;
            float var14 = var8 + var11;
            float var15 = var6 - var9;
            float var16 = var7 - var10;
            float var17 = var8 - var11;
            float var18 = var9 - var6;
            float var19 = var10 - var7;
            float var20 = var11 - var8;
            Buffer var21 = this.field6792.method170(false, true);
            if (var21 != null) {
                Stream var22 = arg0.method2476(var21, (byte) -3);
                if (Stream.method5102()) {
                    for (int var48 = arg2 - 1; var48 >= 0; var48--) {
                        int var49 = this.field6789[var48] <= 64 ? this.field6789[var48] : 64;
                        if (var49 > 0) {
                            for (int var50 = var49 - 1; var50 >= 0; var50--) {
                                class777 var51 = this.field6790[var48][var50];
                                int var52 = var51.field11285;
                                byte var53 = (byte) (var52 >> 16);
                                byte var54 = (byte) (var52 >> 8);
                                byte var55 = (byte) var52;
                                byte var56 = (byte) (var52 >>> 24);
                                float var57 = (float) (var51.field11286 >> 12);
                                float var58 = (float) (var51.field11291 >> 12);
                                float var59 = (float) (var51.field11290 >> 12);
                                int var60 = var51.field11289 >> 12;
                                var22.method5112((float) (-var60) * var12 + var57);
                                var22.method5112((float) (-var60) * var13 + var58);
                                var22.method5112((float) (-var60) * var14 + var59);
                                if (arg0.field4595 == 0) {
                                    var22.method5113(var53, var54, var55, var56);
                                } else {
                                    var22.method5109(var53, var54, var55, var56);
                                }
                                var22.method5112(0.0F);
                                var22.method5112(0.0F);
                                var22.method5112((float) var60 * var15 + var57);
                                var22.method5112((float) var60 * var16 + var58);
                                var22.method5112((float) var60 * var17 + var59);
                                if (arg0.field4595 == 0) {
                                    var22.method5113(var53, var54, var55, var56);
                                } else {
                                    var22.method5109(var53, var54, var55, var56);
                                }
                                var22.method5112(1.0F);
                                var22.method5112(0.0F);
                                var22.method5112((float) var60 * var12 + var57);
                                var22.method5112((float) var60 * var13 + var58);
                                var22.method5112((float) var60 * var14 + var59);
                                if (arg0.field4595 == 0) {
                                    var22.method5113(var53, var54, var55, var56);
                                } else {
                                    var22.method5109(var53, var54, var55, var56);
                                }
                                var22.method5112(1.0F);
                                var22.method5112(1.0F);
                                var22.method5112((float) var60 * var18 + var57);
                                var22.method5112((float) var60 * var19 + var58);
                                var22.method5112((float) var60 * var20 + var59);
                                if (arg0.field4595 == 0) {
                                    var22.method5113(var53, var54, var55, var56);
                                } else {
                                    var22.method5109(var53, var54, var55, var56);
                                }
                                var22.method5112(0.0F);
                                var4++;
                                var22.method5112(1.0F);
                            }
                            if (this.field6789[var48] > 64) {
                                int var61 = this.field6789[var48] - 1 - 64;
                                for (int var62 = this.field6794[var61] - 1; var62 >= 0; var62--) {
                                    class777 var63 = this.field6801[var61][var62];
                                    int var64 = var63.field11285;
                                    byte var65 = (byte) (var64 >> 16);
                                    byte var66 = (byte) (var64 >> 8);
                                    byte var67 = (byte) var64;
                                    byte var68 = (byte) (var64 >>> 24);
                                    float var69 = (float) (var63.field11286 >> 12);
                                    float var70 = (float) (var63.field11291 >> 12);
                                    float var71 = (float) (var63.field11290 >> 12);
                                    int var72 = var63.field11289 >> 12;
                                    var22.method5112((float) (-var72) * var12 + var69);
                                    var22.method5112((float) (-var72) * var13 + var70);
                                    var22.method5112((float) (-var72) * var14 + var71);
                                    if (arg0.field4595 == 0) {
                                        var22.method5113(var65, var66, var67, var68);
                                    } else {
                                        var22.method5109(var65, var66, var67, var68);
                                    }
                                    var22.method5112(0.0F);
                                    var22.method5112(0.0F);
                                    var22.method5112((float) var72 * var15 + var69);
                                    var22.method5112((float) var72 * var16 + var70);
                                    var22.method5112((float) var72 * var17 + var71);
                                    if (arg0.field4595 == 0) {
                                        var22.method5113(var65, var66, var67, var68);
                                    } else {
                                        var22.method5109(var65, var66, var67, var68);
                                    }
                                    var22.method5112(1.0F);
                                    var22.method5112(0.0F);
                                    var22.method5112((float) var72 * var12 + var69);
                                    var22.method5112((float) var72 * var13 + var70);
                                    var22.method5112((float) var72 * var14 + var71);
                                    if (arg0.field4595 == 0) {
                                        var22.method5113(var65, var66, var67, var68);
                                    } else {
                                        var22.method5109(var65, var66, var67, var68);
                                    }
                                    var22.method5112(1.0F);
                                    var22.method5112(1.0F);
                                    var22.method5112((float) var72 * var18 + var69);
                                    var22.method5112((float) var72 * var19 + var70);
                                    var22.method5112((float) var72 * var20 + var71);
                                    if (arg0.field4595 == 0) {
                                        var22.method5113(var65, var66, var67, var68);
                                    } else {
                                        var22.method5109(var65, var66, var67, var68);
                                    }
                                    var22.method5112(0.0F);
                                    var22.method5112(1.0F);
                                    var4++;
                                }
                            }
                        }
                    }
                } else {
                    for (int var23 = arg2 - 1; var23 >= 0; var23--) {
                        int var24 = this.field6789[var23] <= 64 ? this.field6789[var23] : 64;
                        if (var24 > 0) {
                            for (int var25 = var24 - 1; var25 >= 0; var25--) {
                                class777 var26 = this.field6790[var23][var25];
                                int var27 = var26.field11285;
                                byte var28 = (byte) (var27 >> 16);
                                byte var29 = (byte) (var27 >> 8);
                                byte var30 = (byte) var27;
                                byte var31 = (byte) (var27 >>> 24);
                                float var32 = (float) (var26.field11286 >> 12);
                                float var33 = (float) (var26.field11291 >> 12);
                                float var34 = (float) (var26.field11290 >> 12);
                                int var35 = var26.field11289 >> 12;
                                var22.method5105((float) (-var35) * var12 + var32);
                                var22.method5105((float) (-var35) * var13 + var33);
                                var22.method5105((float) (-var35) * var14 + var34);
                                if (arg0.field4595 == 0) {
                                    var22.method5113(var28, var29, var30, var31);
                                } else {
                                    var22.method5109(var28, var29, var30, var31);
                                }
                                var22.method5105(0.0F);
                                var22.method5105(0.0F);
                                var22.method5105((float) var35 * var15 + var32);
                                var22.method5105((float) var35 * var16 + var33);
                                var22.method5105((float) var35 * var17 + var34);
                                if (arg0.field4595 == 0) {
                                    var22.method5113(var28, var29, var30, var31);
                                } else {
                                    var22.method5109(var28, var29, var30, var31);
                                }
                                var22.method5105(1.0F);
                                var22.method5105(0.0F);
                                var22.method5105((float) var35 * var12 + var32);
                                var22.method5105((float) var35 * var13 + var33);
                                var22.method5105((float) var35 * var14 + var34);
                                if (arg0.field4595 == 0) {
                                    var22.method5113(var28, var29, var30, var31);
                                } else {
                                    var22.method5109(var28, var29, var30, var31);
                                }
                                var22.method5105(1.0F);
                                var22.method5105(1.0F);
                                var22.method5105((float) var35 * var18 + var32);
                                var22.method5105((float) var35 * var19 + var33);
                                var22.method5105((float) var35 * var20 + var34);
                                if (arg0.field4595 == 0) {
                                    var22.method5113(var28, var29, var30, var31);
                                } else {
                                    var22.method5109(var28, var29, var30, var31);
                                }
                                var22.method5105(0.0F);
                                var4++;
                                var22.method5105(1.0F);
                            }
                            if (this.field6789[var23] > 64) {
                                int var36 = this.field6789[var23] - 1 - 64;
                                for (int var37 = this.field6794[var36] - 1; var37 >= 0; var37--) {
                                    class777 var38 = this.field6801[var36][var37];
                                    int var39 = var38.field11285;
                                    byte var40 = (byte) (var39 >> 16);
                                    byte var41 = (byte) (var39 >> 8);
                                    byte var42 = (byte) var39;
                                    byte var43 = (byte) (var39 >>> 24);
                                    float var44 = (float) (var38.field11286 >> 12);
                                    float var45 = (float) (var38.field11291 >> 12);
                                    float var46 = (float) (var38.field11290 >> 12);
                                    int var47 = var38.field11289 >> 12;
                                    var22.method5105((float) (-var47) * var12 + var44);
                                    var22.method5105((float) (-var47) * var13 + var45);
                                    var22.method5105((float) (-var47) * var14 + var46);
                                    if (arg0.field4595 == 0) {
                                        var22.method5113(var40, var41, var42, var43);
                                    } else {
                                        var22.method5109(var40, var41, var42, var43);
                                    }
                                    var22.method5105(0.0F);
                                    var22.method5105(0.0F);
                                    var22.method5105((float) var47 * var15 + var44);
                                    var22.method5105((float) var47 * var16 + var45);
                                    var22.method5105((float) var47 * var17 + var46);
                                    if (arg0.field4595 == 0) {
                                        var22.method5113(var40, var41, var42, var43);
                                    } else {
                                        var22.method5109(var40, var41, var42, var43);
                                    }
                                    var22.method5105(1.0F);
                                    var22.method5105(0.0F);
                                    var22.method5105((float) var47 * var12 + var44);
                                    var22.method5105((float) var47 * var13 + var45);
                                    var22.method5105((float) var47 * var14 + var46);
                                    if (arg0.field4595 == 0) {
                                        var22.method5113(var40, var41, var42, var43);
                                    } else {
                                        var22.method5109(var40, var41, var42, var43);
                                    }
                                    var22.method5105(1.0F);
                                    var22.method5105(1.0F);
                                    var22.method5105((float) var47 * var18 + var44);
                                    var22.method5105((float) var47 * var19 + var45);
                                    var22.method5105((float) var47 * var20 + var46);
                                    if (arg0.field4595 == 0) {
                                        var22.method5113(var40, var41, var42, var43);
                                    } else {
                                        var22.method5109(var40, var41, var42, var43);
                                    }
                                    var22.method5105(0.0F);
                                    var22.method5105(1.0F);
                                    var4++;
                                }
                            }
                        }
                    }
                }
                var22.method5103();
                if (this.field6792.method167(-20743)) {
                    arg0.method856(0, this.field6792, true);
                    arg0.method856(1, this.field6791, true);
                    arg0.method868(false, this.field6802);
                    arg0.method877(var4 * 4, this.field6799, 0, 0, class769.field11134, var4 * 2, (byte) -59);
                }
            }
        } catch (RuntimeException var74) {
            throw class759.method5498(var74, field6807[8] + (arg0 == null ? field6807[2] : field6807[0]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!os", name = "c", descriptor = "(ILkd;)V")
    private final void method3545(int arg0, class296 arg1) {
        try {
            class705.field10235 = arg1.field4601;
            field6803++;
            arg1.method2486(-8573);
            if (arg0 <= -17) {
                arg1.method2423(false, 13660);
                arg1.method2473((byte) -96, false);
                arg1.method2495(4);
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field6807[4] + arg0 + ',' + (arg1 == null ? field6807[2] : field6807[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(ILkd;I)V")
    private final void method3546(int arg0, class296 arg1, int arg2) {
        try {
            field6797++;
            if (arg2 <= 59) {
                this.method3541(118, null);
            }
            class705.field10235 = arg1.field4601;
            arg1.method2469((float) arg0, (byte) 52);
            arg1.method2458((byte) 20);
            arg1.method2423(false, 13660);
            arg1.method2473((byte) -103, false);
            arg1.method2495(4);
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field6807[1] + arg0 + ',' + (arg1 == null ? field6807[2] : field6807[0]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!os", name = "b", descriptor = "(ILkd;)V")
    public final void method3547(int arg0, class296 arg1) {
        try {
            this.field6792.method166(-91, 24, arg0);
            field6788++;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field6807[3] + arg0 + ',' + (arg1 == null ? field6807[2] : field6807[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!os", name = "<init>", descriptor = "(Lkd;)V")
    public class466(class296 arg0) {
        try {
            this.field6802 = arg0.method873(new class240[] { new class240(new class778[] { class778.field11295, class778.field11302, class778.field11304 }), new class240(class778.field11300) }, (byte) 84);
            this.field6792 = arg0.method850(true, 0);
            this.field6791 = arg0.method850(false, 0);
            this.field6791.method166(-84, 12, 393168);
            this.field6799 = arg0.method899(13, false);
            this.field6799.method24(49146, -10749);
            Buffer var2 = this.field6799.method3256(true, (byte) -122);
            if (var2 != null) {
                Stream var3 = arg0.method2476(var2, (byte) -3);
                if (Stream.method5102()) {
                    for (int var6 = 0; var6 < 8191; var6++) {
                        int var7 = var6 * 4;
                        var3.method5100(var7);
                        var3.method5100(var7 + 1);
                        var3.method5100(var7 + 2);
                        var3.method5100(var7 + 2);
                        var3.method5100(var7 + 3);
                        var3.method5100(var7);
                    }
                } else {
                    for (int var4 = 0; var4 < 8191; var4++) {
                        int var5 = var4 * 4;
                        var3.method5108(var5);
                        var3.method5108(var5 + 1);
                        var3.method5108(var5 + 2);
                        var3.method5108(var5 + 2);
                        var3.method5108(var5 + 3);
                        var3.method5108(var5);
                    }
                }
                var3.method5103();
                this.field6799.method3257(-3841);
            }
            Buffer var8 = this.field6791.method170(false, true);
            if (var8 != null) {
                Stream var9 = arg0.method2476(var8, (byte) -3);
                if (Stream.method5102()) {
                    for (int var11 = 0; var11 < 8191; var11++) {
                        var9.method5112(0.0F);
                        var9.method5112(-1.0F);
                        var9.method5112(0.0F);
                        var9.method5112(0.0F);
                        var9.method5112(-1.0F);
                        var9.method5112(0.0F);
                        var9.method5112(0.0F);
                        var9.method5112(-1.0F);
                        var9.method5112(0.0F);
                        var9.method5112(0.0F);
                        var9.method5112(-1.0F);
                        var9.method5112(0.0F);
                    }
                } else {
                    for (int var10 = 0; var10 < 8191; var10++) {
                        var9.method5105(0.0F);
                        var9.method5105(-1.0F);
                        var9.method5105(0.0F);
                        var9.method5105(0.0F);
                        var9.method5105(-1.0F);
                        var9.method5105(0.0F);
                        var9.method5105(0.0F);
                        var9.method5105(-1.0F);
                        var9.method5105(0.0F);
                        var9.method5105(0.0F);
                        var9.method5105(-1.0F);
                        var9.method5105(0.0F);
                    }
                }
                var9.method5103();
                this.field6791.method167(-20743);
            }
        } catch (RuntimeException var13) {
            throw class759.method5498(var13, field6807[7] + (arg0 == null ? field6807[2] : field6807[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!os", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3548(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x19);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!os", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3549(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 58;
                    break;
                case 1:
                    var10005 = 118;
                    break;
                case 2:
                    var10005 = 26;
                    break;
                case 3:
                    var10005 = 76;
                    break;
                default:
                    var10005 = 25;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
