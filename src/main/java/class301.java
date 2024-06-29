import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class301 {

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "[[Lan;")
    private class169[][] field4455 = new class169[64][768];

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "[I")
    private int[] field4457 = new int[8191];

    @OriginalMember(owner = "client!pi", name = "i", descriptor = "[[Lan;")
    private class169[][] field4463 = new class169[1600][64];

    @OriginalMember(owner = "client!pi", name = "o", descriptor = "[I")
    private int[] field4469 = new int[64];

    @OriginalMember(owner = "client!pi", name = "s", descriptor = "[I")
    private int[] field4473 = new int[1600];

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "I")
    private int field4459 = 0;

    @OriginalMember(owner = "client!pi", name = "r", descriptor = "Lcl;")
    private class314 field4472;

    @OriginalMember(owner = "client!pi", name = "j", descriptor = "Lega;")
    private class184 field4464;

    @OriginalMember(owner = "client!pi", name = "h", descriptor = "Lega;")
    private class184 field4462;

    @OriginalMember(owner = "client!pi", name = "n", descriptor = "Lip;")
    private class532 field4468;

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "I")
    public static int field4456;

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "I")
    public static int field4458;

    @OriginalMember(owner = "client!pi", name = "f", descriptor = "I")
    public static int field4460;

    @OriginalMember(owner = "client!pi", name = "g", descriptor = "I")
    public static int field4461;

    @OriginalMember(owner = "client!pi", name = "k", descriptor = "I")
    public static int field4465;

    @OriginalMember(owner = "client!pi", name = "l", descriptor = "I")
    public static int field4466;

    @OriginalMember(owner = "client!pi", name = "m", descriptor = "I")
    public static int field4467;

    @OriginalMember(owner = "client!pi", name = "p", descriptor = "I")
    public static int field4470;

    @OriginalMember(owner = "client!pi", name = "q", descriptor = "I")
    public static int field4471;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(ILum;ILuo;)V")
    public final void method1889(int arg0, class528 arg1, int arg2, class620 arg3) {
        field4471++;
        if (arg1.field7676 == null) {
            return;
        }
        if (arg0 >= 0) {
            this.method1891(334, arg1, arg0);
        } else {
            this.method1893(arg1, arg2 ^ 0x78);
        }
        float var5 = arg1.field7676.field4436;
        float var6 = arg1.field7676.field4404;
        float var7 = arg1.field7676.field4432;
        float var8 = arg1.field7676.field4402;
        try {
            int var9 = 0;
            int var10 = Integer.MAX_VALUE;
            int var11 = 0;
            class400 var12 = arg3.field8978.field6446;
            for (class400 var13 = var12.field6020; var13 != var12; var13 = var13.field6020) {
                class169 var14 = (class169) var13;
                int var15 = (int) ((float) (var14.field2393 >> 12) * var7 + (float) (var14.field2395 >> 12) * var5 + (float) (var14.field2386 >> 12) * var6 + var8);
                if (var10 > var15) {
                    var10 = var15;
                }
                this.field4457[var9++] = var15;
                if (var15 > var11) {
                    var11 = var15;
                }
            }
            int var16 = var11 - var10;
            int var17;
            if ((arg2 + var16) <= 1600) {
                var17 = 0;
                var16 += 2;
            } else {
                var17 = class341.method2115(27279, var16) + 1 - class257.field3342;
                var16 = (var16 >> var17) + 2;
            }
            class400 var18 = var12.field6020;
            int var19 = 0;
            int var20 = -2;
            boolean var21 = true;
            boolean var22 = true;
            while (var12 != var18) {
                this.field4459 = 0;
                for (int var23 = 0; var23 < var16; var23++) {
                    this.field4473[var23] = 0;
                }
                for (int var24 = 0; var24 < 64; var24++) {
                    this.field4469[var24] = 0;
                }
                while (var12 != var18) {
                    class169 var25 = (class169) var18;
                    if (var22) {
                        var21 = var25.field2394;
                        var20 = var25.field2392;
                        var22 = false;
                    }
                    if (var19 > 0 && (var25.field2392 != var20 || var21 != var25.field2394)) {
                        var22 = true;
                        break;
                    }
                    int var26 = this.field4457[var19++] - var10 >> var17;
                    if (var26 < 1600) {
                        if (this.field4473[var26] < 64) {
                            this.field4463[var26][this.field4473[var26]++] = var25;
                        } else {
                            label101: {
                                if (this.field4473[var26] == 64) {
                                    if (this.field4459 == 64) {
                                        break label101;
                                    }
                                    this.field4473[var26] += this.field4459++ + 1;
                                }
                                this.field4455[this.field4473[var26] - 1 - 64][this.field4469[this.field4473[var26] - 64 - 1]++] = var25;
                            }
                        }
                    }
                    var18 = var18.field6020;
                }
                arg1.method3058(false, var20 >= 0 ? var20 : -1, (byte) -120, false);
                if (var21 && class27.field477 != arg1.field7777) {
                    arg1.method711(class27.field477);
                } else if (arg1.field7777 != 1.0F) {
                    arg1.method711(1.0F);
                }
                this.method1890((byte) 27, var16, arg1);
            }
        } catch (Exception var27) {
        }
        this.method1896((byte) -8, arg1);
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(BILum;)V")
    private final void method1890(byte arg0, int arg1, class528 arg2) {
        field4467++;
        int var4 = 0;
        class300 var5 = arg2.method3004(125);
        float var6 = var5.field4438;
        float var7 = var5.field4418;
        float var8 = var5.field4439;
        if (arg0 != 27) {
            return;
        }
        float var9 = var5.field4431;
        float var10 = var5.field4415;
        float var11 = var5.field4414;
        float var12 = var6 + var9;
        float var13 = var7 + var10;
        float var14 = var8 + var11;
        float var15 = var6 - var9;
        float var16 = var7 - var10;
        float var17 = var8 - var11;
        float var18 = var9 - var6;
        float var19 = var10 - var7;
        float var20 = var11 - var8;
        Buffer var21 = this.field4464.method1231(true, 3696);
        if (var21 == null) {
            return;
        }
        Stream var22 = arg2.method3038(-10641, var21);
        if (Stream.method2077()) {
            for (int var48 = arg1 - 1; var48 >= 0; var48--) {
                int var49 = this.field4473[var48] > 64 ? 64 : this.field4473[var48];
                if (var49 > 0) {
                    for (int var50 = var49 - 1; var50 >= 0; var50--) {
                        class169 var63 = this.field4463[var48][var50];
                        int var64 = var63.field2384;
                        byte var65 = (byte) (var64 >> 16);
                        byte var66 = (byte) (var64 >> 8);
                        byte var67 = (byte) var64;
                        byte var68 = (byte) (var64 >>> 24);
                        float var69 = (float) (var63.field2395 >> 12);
                        float var70 = (float) (var63.field2386 >> 12);
                        float var71 = (float) (var63.field2393 >> 12);
                        int var72 = var63.field2391 >> 12;
                        var22.method2075((float) (-var72) * var12 + var69);
                        var22.method2075((float) (-var72) * var13 + var70);
                        var22.method2075((float) (-var72) * var14 + var71);
                        if (arg2.field7764 == 0) {
                            var22.method2089(var65, var66, var67, var68);
                        } else {
                            var22.method2079(var65, var66, var67, var68);
                        }
                        var22.method2075(0.0F);
                        var22.method2075(0.0F);
                        var22.method2075((float) var72 * var15 + var69);
                        var22.method2075((float) var72 * var16 + var70);
                        var22.method2075((float) var72 * var17 + var71);
                        if (arg2.field7764 == 0) {
                            var22.method2089(var65, var66, var67, var68);
                        } else {
                            var22.method2079(var65, var66, var67, var68);
                        }
                        var22.method2075(1.0F);
                        var22.method2075(0.0F);
                        var22.method2075((float) var72 * var12 + var69);
                        var22.method2075((float) var72 * var13 + var70);
                        var22.method2075((float) var72 * var14 + var71);
                        if (arg2.field7764 == 0) {
                            var22.method2089(var65, var66, var67, var68);
                        } else {
                            var22.method2079(var65, var66, var67, var68);
                        }
                        var22.method2075(1.0F);
                        var22.method2075(1.0F);
                        var22.method2075((float) var72 * var18 + var69);
                        var22.method2075((float) var72 * var19 + var70);
                        var22.method2075((float) var72 * var20 + var71);
                        if (arg2.field7764 == 0) {
                            var22.method2089(var65, var66, var67, var68);
                        } else {
                            var22.method2079(var65, var66, var67, var68);
                        }
                        var22.method2075(0.0F);
                        var22.method2075(1.0F);
                        var4++;
                    }
                    if (this.field4473[var48] > 64) {
                        int var51 = this.field4473[var48] - 1 - 64;
                        for (int var52 = this.field4469[var51] - 1; var52 >= 0; var52--) {
                            class169 var53 = this.field4455[var51][var52];
                            int var54 = var53.field2384;
                            byte var55 = (byte) (var54 >> 16);
                            byte var56 = (byte) (var54 >> 8);
                            byte var57 = (byte) var54;
                            byte var58 = (byte) (var54 >>> 24);
                            float var59 = (float) (var53.field2395 >> 12);
                            float var60 = (float) (var53.field2386 >> 12);
                            float var61 = (float) (var53.field2393 >> 12);
                            int var62 = var53.field2391 >> 12;
                            var22.method2075((float) (-var62) * var12 + var59);
                            var22.method2075((float) (-var62) * var13 + var60);
                            var22.method2075((float) (-var62) * var14 + var61);
                            if (arg2.field7764 == 0) {
                                var22.method2089(var55, var56, var57, var58);
                            } else {
                                var22.method2079(var55, var56, var57, var58);
                            }
                            var22.method2075(0.0F);
                            var22.method2075(0.0F);
                            var22.method2075((float) var62 * var15 + var59);
                            var22.method2075((float) var62 * var16 + var60);
                            var22.method2075((float) var62 * var17 + var61);
                            if (arg2.field7764 == 0) {
                                var22.method2089(var55, var56, var57, var58);
                            } else {
                                var22.method2079(var55, var56, var57, var58);
                            }
                            var22.method2075(1.0F);
                            var22.method2075(0.0F);
                            var22.method2075((float) var62 * var12 + var59);
                            var22.method2075((float) var62 * var13 + var60);
                            var22.method2075((float) var62 * var14 + var61);
                            if (arg2.field7764 == 0) {
                                var22.method2089(var55, var56, var57, var58);
                            } else {
                                var22.method2079(var55, var56, var57, var58);
                            }
                            var22.method2075(1.0F);
                            var22.method2075(1.0F);
                            var22.method2075((float) var62 * var18 + var59);
                            var22.method2075((float) var62 * var19 + var60);
                            var22.method2075((float) var62 * var20 + var61);
                            if (arg2.field7764 == 0) {
                                var22.method2089(var55, var56, var57, var58);
                            } else {
                                var22.method2079(var55, var56, var57, var58);
                            }
                            var22.method2075(0.0F);
                            var4++;
                            var22.method2075(1.0F);
                        }
                    }
                }
            }
        } else {
            for (int var23 = arg1 - 1; var23 >= 0; var23--) {
                int var24 = this.field4473[var23] > 64 ? 64 : this.field4473[var23];
                if (var24 > 0) {
                    for (int var25 = var24 - 1; var25 >= 0; var25--) {
                        class169 var38 = this.field4463[var23][var25];
                        int var39 = var38.field2384;
                        byte var40 = (byte) (var39 >> 16);
                        byte var41 = (byte) (var39 >> 8);
                        byte var42 = (byte) var39;
                        byte var43 = (byte) (var39 >>> 24);
                        float var44 = (float) (var38.field2395 >> 12);
                        float var45 = (float) (var38.field2386 >> 12);
                        float var46 = (float) (var38.field2393 >> 12);
                        int var47 = var38.field2391 >> 12;
                        var22.method2088((float) (-var47) * var12 + var44);
                        var22.method2088((float) (-var47) * var13 + var45);
                        var22.method2088((float) (-var47) * var14 + var46);
                        if (arg2.field7764 == 0) {
                            var22.method2089(var40, var41, var42, var43);
                        } else {
                            var22.method2079(var40, var41, var42, var43);
                        }
                        var22.method2088(0.0F);
                        var22.method2088(0.0F);
                        var22.method2088((float) var47 * var15 + var44);
                        var22.method2088((float) var47 * var16 + var45);
                        var22.method2088((float) var47 * var17 + var46);
                        if (arg2.field7764 == 0) {
                            var22.method2089(var40, var41, var42, var43);
                        } else {
                            var22.method2079(var40, var41, var42, var43);
                        }
                        var22.method2088(1.0F);
                        var22.method2088(0.0F);
                        var22.method2088((float) var47 * var12 + var44);
                        var22.method2088((float) var47 * var13 + var45);
                        var22.method2088((float) var47 * var14 + var46);
                        if (arg2.field7764 == 0) {
                            var22.method2089(var40, var41, var42, var43);
                        } else {
                            var22.method2079(var40, var41, var42, var43);
                        }
                        var22.method2088(1.0F);
                        var22.method2088(1.0F);
                        var22.method2088((float) var47 * var18 + var44);
                        var22.method2088((float) var47 * var19 + var45);
                        var22.method2088((float) var47 * var20 + var46);
                        if (arg2.field7764 == 0) {
                            var22.method2089(var40, var41, var42, var43);
                        } else {
                            var22.method2079(var40, var41, var42, var43);
                        }
                        var22.method2088(0.0F);
                        var22.method2088(1.0F);
                        var4++;
                    }
                    if (this.field4473[var23] > 64) {
                        int var26 = this.field4473[var23] - 1 - 64;
                        for (int var27 = this.field4469[var26] - 1; var27 >= 0; var27--) {
                            class169 var28 = this.field4455[var26][var27];
                            int var29 = var28.field2384;
                            byte var30 = (byte) (var29 >> 16);
                            byte var31 = (byte) (var29 >> 8);
                            byte var32 = (byte) var29;
                            byte var33 = (byte) (var29 >>> 24);
                            float var34 = (float) (var28.field2395 >> 12);
                            float var35 = (float) (var28.field2386 >> 12);
                            float var36 = (float) (var28.field2393 >> 12);
                            int var37 = var28.field2391 >> 12;
                            var22.method2088((float) (-var37) * var12 + var34);
                            var22.method2088((float) (-var37) * var13 + var35);
                            var22.method2088((float) (-var37) * var14 + var36);
                            if (arg2.field7764 == 0) {
                                var22.method2089(var30, var31, var32, var33);
                            } else {
                                var22.method2079(var30, var31, var32, var33);
                            }
                            var22.method2088(0.0F);
                            var22.method2088(0.0F);
                            var22.method2088((float) var37 * var15 + var34);
                            var22.method2088((float) var37 * var16 + var35);
                            var22.method2088((float) var37 * var17 + var36);
                            if (arg2.field7764 == 0) {
                                var22.method2089(var30, var31, var32, var33);
                            } else {
                                var22.method2079(var30, var31, var32, var33);
                            }
                            var22.method2088(1.0F);
                            var22.method2088(0.0F);
                            var22.method2088((float) var37 * var12 + var34);
                            var22.method2088((float) var37 * var13 + var35);
                            var22.method2088((float) var37 * var14 + var36);
                            if (arg2.field7764 == 0) {
                                var22.method2089(var30, var31, var32, var33);
                            } else {
                                var22.method2079(var30, var31, var32, var33);
                            }
                            var22.method2088(1.0F);
                            var22.method2088(1.0F);
                            var22.method2088((float) var37 * var18 + var34);
                            var22.method2088((float) var37 * var19 + var35);
                            var22.method2088((float) var37 * var20 + var36);
                            if (arg2.field7764 == 0) {
                                var22.method2089(var30, var31, var32, var33);
                            } else {
                                var22.method2079(var30, var31, var32, var33);
                            }
                            var22.method2088(0.0F);
                            var22.method2088(1.0F);
                            var4++;
                        }
                    }
                }
            }
        }
        var22.method2084();
        if (this.field4464.method1230(arg0 ^ 0xFFFFFFB9)) {
            arg2.method754(this.field4464, 0, arg0 + 27883);
            arg2.method754(this.field4462, 1, 27910);
            arg2.method811(this.field4472, (byte) -61);
            arg2.method756(0, var4 * 4, 11897, class433.field6280, var4 * 2, this.field4468, 0);
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(ILum;I)V")
    private final void method1891(int arg0, class528 arg1, int arg2) {
        field4460++;
        class27.field477 = arg1.field7777;
        if (arg0 != 334) {
            return;
        }
        arg1.method3036((byte) 82, (float) arg2);
        arg1.method3042((byte) -127);
        arg1.method3021(false, false);
        arg1.method3056(false, (byte) 113);
        arg1.method3065(0);
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(ILum;)V")
    public final void method1892(int arg0, class528 arg1) {
        field4465++;
        if (arg0 != 2) {
            method1894(121, 126, -66, 114, false, 109, -64, -96);
        }
        this.field4464.method1229(786336, 24, 29812);
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lum;I)V")
    private final void method1893(class528 arg0, int arg1) {
        field4461++;
        class27.field477 = arg0.field7777;
        arg0.method2993(8);
        arg0.method3021(false, false);
        int var3 = 35 % ((35 - arg1) / 58);
        arg0.method3056(false, (byte) 118);
        arg0.method3065(0);
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIIIZIII)V")
    public static final void method1894(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7) {
        field4458++;
        int var8 = arg3 - 334;
        if (var8 < 0) {
            var8 = 0;
        } else if (var8 > 100) {
            var8 = 100;
        }
        int var9 = class97.field1484 + ((class73.field1153 - class97.field1484) * var8 / 100);
        int var10 = arg0 * var9 >> 8;
        int var11 = 16384 - arg6 & 0x3FFF;
        int var12 = 16384 - arg5 & 0x3FFF;
        int var13 = 0;
        int var14 = 0;
        int var15 = var10;
        if (var11 != 0) {
            var14 = class271.field3549[var11] * -var10 >> 14;
            var15 = class271.field3544[var11] * var10 >> 14;
        }
        if (arg4) {
            method1895(74, 68, (byte) 21);
        }
        if (var12 != 0) {
            var13 = class271.field3549[var12] * var15 >> 14;
            var15 = class271.field3544[var12] * var15 >> 14;
        }
        class246.field3255 = arg6;
        class481.field6886 = arg5;
        class306.field4529 = arg2 - var13;
        class533.field7839 = arg7 - var14;
        class276.field3597 = 0;
        class603.field8702 = arg1 - var15;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIB)Z")
    public static final boolean method1895(int arg0, int arg1, byte arg2) {
        field4470++;
        if (arg2 != -53) {
            method1894(-125, 7, -63, -20, false, 67, -99, 19);
        }
        return (arg1 & 0x8000) != 0;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(BLum;)V")
    private final void method1896(byte arg0, class528 arg1) {
        field4466++;
        arg1.method3056(true, (byte) 115);
        arg1.method3021(false, true);
        if (class27.field477 != arg1.field7777) {
            arg1.method711(class27.field477);
        }
        if (arg0 != -8) {
            this.field4468 = null;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)V")
    public final void method1897(int arg0) {
        this.field4464.method987(-116);
        field4456++;
        if (arg0 != 1600) {
            this.field4459 = 60;
        }
    }

    @OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(Lum;)V")
    public class301(class528 arg0) {
        this.field4472 = arg0.method781(new class680[] { new class680(new class455[] { class455.field6559, class455.field6567, class455.field6569 }), new class680(class455.field6566) }, -44);
        this.field4464 = arg0.method806(10, true);
        this.field4462 = arg0.method806(10, false);
        this.field4462.method1229(393168, 12, 29812);
        this.field4468 = arg0.method800(false, -25475);
        this.field4468.method984(49146, 122);
        Buffer var2 = this.field4468.method985((byte) -118, true);
        if (var2 != null) {
            Stream var3 = arg0.method3038(-10641, var2);
            if (Stream.method2077()) {
                for (int var6 = 0; var6 < 8191; var6++) {
                    int var7 = var6 * 4;
                    var3.method2083(var7);
                    var3.method2083(var7 + 1);
                    var3.method2083(var7 + 2);
                    var3.method2083(var7 + 2);
                    var3.method2083(var7 + 3);
                    var3.method2083(var7);
                }
            } else {
                for (int var4 = 0; var4 < 8191; var4++) {
                    int var5 = var4 * 4;
                    var3.method2080(var5);
                    var3.method2080(var5 + 1);
                    var3.method2080(var5 + 2);
                    var3.method2080(var5 + 2);
                    var3.method2080(var5 + 3);
                    var3.method2080(var5);
                }
            }
            var3.method2084();
            this.field4468.method986(true);
        }
        Buffer var8 = this.field4462.method1231(true, 3696);
        if (var8 != null) {
            Stream var9 = arg0.method3038(-10641, var8);
            if (Stream.method2077()) {
                for (int var10 = 0; var10 < 8191; var10++) {
                    var9.method2075(0.0F);
                    var9.method2075(-1.0F);
                    var9.method2075(0.0F);
                    var9.method2075(0.0F);
                    var9.method2075(-1.0F);
                    var9.method2075(0.0F);
                    var9.method2075(0.0F);
                    var9.method2075(-1.0F);
                    var9.method2075(0.0F);
                    var9.method2075(0.0F);
                    var9.method2075(-1.0F);
                    var9.method2075(0.0F);
                }
            } else {
                for (int var11 = 0; var11 < 8191; var11++) {
                    var9.method2088(0.0F);
                    var9.method2088(-1.0F);
                    var9.method2088(0.0F);
                    var9.method2088(0.0F);
                    var9.method2088(-1.0F);
                    var9.method2088(0.0F);
                    var9.method2088(0.0F);
                    var9.method2088(-1.0F);
                    var9.method2088(0.0F);
                    var9.method2088(0.0F);
                    var9.method2088(-1.0F);
                    var9.method2088(0.0F);
                }
            }
            var9.method2084();
            this.field4462.method1230(-73);
        }
    }
}
