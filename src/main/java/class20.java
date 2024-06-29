import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public class class20 {

    @OriginalMember(owner = "client!qo", name = "f", descriptor = "[[Lmca;")
    private class28[][] field236 = new class28[1600][64];

    @OriginalMember(owner = "client!qo", name = "h", descriptor = "[[Lmca;")
    private class28[][] field238 = new class28[64][768];

    @OriginalMember(owner = "client!qo", name = "e", descriptor = "[I")
    private int[] field235 = new int[8191];

    @OriginalMember(owner = "client!qo", name = "n", descriptor = "I")
    private int field244 = 0;

    @OriginalMember(owner = "client!qo", name = "m", descriptor = "[I")
    private int[] field243 = new int[1600];

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "[I")
    private int[] field231 = new int[64];

    @OriginalMember(owner = "client!qo", name = "s", descriptor = "Llu;")
    private class609 field249;

    @OriginalMember(owner = "client!qo", name = "p", descriptor = "Ltq;")
    private class538 field246;

    @OriginalMember(owner = "client!qo", name = "o", descriptor = "Luj;")
    private class321 field245;

    @OriginalMember(owner = "client!qo", name = "k", descriptor = "Lej;")
    public static class104 field241 = new class104("You can't add yourself to your own ignore list.", "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste noire.", "Você não pode adicionar a si próprio à sua lista de ignorados.");

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "I")
    public static int field232;

    @OriginalMember(owner = "client!qo", name = "c", descriptor = "I")
    public static int field233;

    @OriginalMember(owner = "client!qo", name = "d", descriptor = "I")
    public static int field234;

    @OriginalMember(owner = "client!qo", name = "g", descriptor = "I")
    public static int field237;

    @OriginalMember(owner = "client!qo", name = "i", descriptor = "I")
    public static int field239;

    @OriginalMember(owner = "client!qo", name = "j", descriptor = "I")
    public static int field240;

    @OriginalMember(owner = "client!qo", name = "l", descriptor = "I")
    public static int field242;

    @OriginalMember(owner = "client!qo", name = "q", descriptor = "I")
    public static int field247;

    @OriginalMember(owner = "client!qo", name = "r", descriptor = "I")
    public static int field248;

    @OriginalMember(owner = "client!qo", name = "u", descriptor = "I")
    public static int field251;

    @OriginalMember(owner = "client!qo", name = "w", descriptor = "I")
    public static int field253;

    @OriginalMember(owner = "client!qo", name = "v", descriptor = "Lao;")
    public static class240 field252;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qo", name = "x", descriptor = "Ljava/lang/Class;")
    public static Class field254;

    @OriginalMember(owner = "client!qo", name = "t", descriptor = "[[B")
    public static byte[][] field250;

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIII)Z")
    public static final boolean method200(int arg0, int arg1, int arg2, int arg3) {
        if (!class427.method2538(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << class272.field3786;
        int var5 = arg2 << class272.field3786;
        int var6 = class590.field8430[arg0].method1104(arg1, arg2) - 1;
        int var7 = var6 - (0x78 << class272.field3786 - 7);
        int var8 = var6 - (0xE6 << class272.field3786 - 7);
        int var9 = var6 - (0xEE << class272.field3786 - 7);
        if (arg3 == 1) {
            if (var4 > class2.field31) {
                if (!class239.method1492(var4, var6, var5)) {
                    return false;
                }
                if (!class239.method1492(var4, var6, class194.field2745 + var5)) {
                    return false;
                }
                if (!class239.method1492(var4, var6, class41.field808 + var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class239.method1492(var4, var7, var5)) {
                    return false;
                }
                if (!class239.method1492(var4, var7, class194.field2745 + var5)) {
                    return false;
                }
                if (!class239.method1492(var4, var7, class41.field808 + var5)) {
                    return false;
                }
            }
            if (!class239.method1492(var4, var8, var5)) {
                return false;
            } else if (class239.method1492(var4, var8, class194.field2745 + var5)) {
                return class239.method1492(var4, var8, class41.field808 + var5);
            } else {
                return false;
            }
        } else if (arg3 == 2) {
            if (var5 < class454.field6417) {
                if (!class239.method1492(var4, var6, class41.field808 + var5)) {
                    return false;
                }
                if (!class239.method1492(class194.field2745 + var4, var6, class41.field808 + var5)) {
                    return false;
                }
                if (!class239.method1492(class41.field808 + var4, var6, class41.field808 + var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class239.method1492(var4, var7, class41.field808 + var5)) {
                    return false;
                }
                if (!class239.method1492(class194.field2745 + var4, var7, class41.field808 + var5)) {
                    return false;
                }
                if (!class239.method1492(class41.field808 + var4, var7, class41.field808 + var5)) {
                    return false;
                }
            }
            if (!class239.method1492(var4, var8, class41.field808 + var5)) {
                return false;
            } else if (class239.method1492(class194.field2745 + var4, var8, class41.field808 + var5)) {
                return class239.method1492(class41.field808 + var4, var8, class41.field808 + var5);
            } else {
                return false;
            }
        } else if (arg3 == 4) {
            if (var4 < class2.field31) {
                if (!class239.method1492(class41.field808 + var4, var6, var5)) {
                    return false;
                }
                if (!class239.method1492(class41.field808 + var4, var6, class194.field2745 + var5)) {
                    return false;
                }
                if (!class239.method1492(class41.field808 + var4, var6, class41.field808 + var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class239.method1492(class41.field808 + var4, var7, var5)) {
                    return false;
                }
                if (!class239.method1492(class41.field808 + var4, var7, class194.field2745 + var5)) {
                    return false;
                }
                if (!class239.method1492(class41.field808 + var4, var7, class41.field808 + var5)) {
                    return false;
                }
            }
            if (!class239.method1492(class41.field808 + var4, var8, var5)) {
                return false;
            } else if (class239.method1492(class41.field808 + var4, var8, class194.field2745 + var5)) {
                return class239.method1492(class41.field808 + var4, var8, class41.field808 + var5);
            } else {
                return false;
            }
        } else if (arg3 == 8) {
            if (var5 > class454.field6417) {
                if (!class239.method1492(var4, var6, var5)) {
                    return false;
                }
                if (!class239.method1492(class194.field2745 + var4, var6, var5)) {
                    return false;
                }
                if (!class239.method1492(class41.field808 + var4, var6, var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class239.method1492(var4, var7, var5)) {
                    return false;
                }
                if (!class239.method1492(class194.field2745 + var4, var7, var5)) {
                    return false;
                }
                if (!class239.method1492(class41.field808 + var4, var7, var5)) {
                    return false;
                }
            }
            if (!class239.method1492(var4, var8, var5)) {
                return false;
            } else if (class239.method1492(class194.field2745 + var4, var8, var5)) {
                return class239.method1492(class41.field808 + var4, var8, var5);
            } else {
                return false;
            }
        } else if (!class239.method1492(class194.field2745 + var4, var9, class194.field2745 + var5)) {
            return false;
        } else if (arg3 == 16) {
            return class239.method1492(var4, var8, class41.field808 + var5);
        } else if (arg3 == 32) {
            return class239.method1492(class41.field808 + var4, var8, class41.field808 + var5);
        } else if (arg3 == 64) {
            return class239.method1492(class41.field808 + var4, var8, var5);
        } else if (arg3 == 128) {
            return class239.method1492(var4, var8, var5);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(B)V")
    public static final void method201(byte arg0) {
        int var1 = -90 % ((4 - arg0) / 42);
        for (class336 var2 = (class336) class399.field5691.method456((byte) -55); var2 != null; var2 = (class336) class399.field5691.method460((byte) 64)) {
            if (class356.field4807 == null) {
                var2.method1117(0);
            } else if (var2.field4488 <= class405.field5763) {
                int var3 = class147.field2269[var2.field4468];
                if (var3 == 0) {
                    class344 var4 = class265.method1739(var2.field4473, var2.field4479, var2.field4491);
                    if (var4 instanceof class214) {
                        class431.method2562(var2.field4473, var2.field4479, var2.field4491);
                        class214 var5 = (class214) var4;
                        if (var5.field3030 != null) {
                            class444.method2628(var2.field4473, var2.field4479, var2.field4491, var5.field3030, null);
                        }
                    }
                } else if (var3 == 1) {
                    class23 var10 = class548.method3127(var2.field4473, var2.field4479, var2.field4491);
                    if (var10 instanceof class191) {
                        class133.method901(var2.field4473, var2.field4479, var2.field4491);
                        class191 var11 = (class191) var10;
                        if (var11.field2703 != null) {
                            class600.method3540(var2.field4473, var2.field4479, var2.field4491, var11.field2703, null);
                        }
                    }
                } else if (var3 == 2) {
                    class425 var6 = class582.method3324(var2.field4473, var2.field4479, var2.field4491, field254 == null ? (field254 = method212("wf")) : field254);
                    if (var6 instanceof class130) {
                        class78.method605(var2.field4473, var2.field4479, var2.field4491, field254 == null ? (field254 = method212("wf")) : field254);
                        class130 var7 = (class130) var6;
                        if (var7.field2073 != null) {
                            class108.method761(var7.field2073, false);
                        }
                    }
                } else if (var3 == 3) {
                    class197 var8 = class404.method2411(var2.field4473, var2.field4479, var2.field4491);
                    if (var8 instanceof class469) {
                        class194.method1208(var2.field4473, var2.field4479, var2.field4491);
                        class469 var9 = (class469) var8;
                        if (var9.field6602 != null) {
                            class112.method782(var2.field4473, var2.field4479, var2.field4491, var9.field6602);
                        }
                    }
                }
                var2.method1117(0);
            } else if (class405.field5763 == var2.field4478) {
                int var12 = class147.field2269[var2.field4468];
                if (var12 == 0) {
                    class344 var22 = class265.method1739(var2.field4473, var2.field4479, var2.field4491);
                    if (var22 instanceof class214) {
                        var2.method1117(0);
                    } else if (class282.method1817(var2.field4473, var2.field4479, var2.field4491) == null) {
                        class214 var23 = new class214(var2.field4468, var2.field4469, var2.field4490, var2.field4484, var2.field4480, var22);
                        class444.method2628(var2.field4473, var2.field4479, var2.field4491, var23, null);
                    } else {
                        var2.method1117(0);
                    }
                } else if (var12 == 1) {
                    class23 var13 = class548.method3127(var2.field4473, var2.field4479, var2.field4491);
                    if (var13 instanceof class191) {
                        var2.method1117(0);
                    } else if (class498.method2892(var2.field4473, var2.field4479, var2.field4491) == null) {
                        class191 var14 = new class191(var2.field4468, var2.field4469, var2.field4490, var2.field4484, var2.field4480, var13);
                        class600.method3540(var2.field4473, var2.field4479, var2.field4491, var14, null);
                    } else {
                        var2.method1117(0);
                    }
                } else if (var12 == 2) {
                    class425 var17 = class582.method3324(var2.field4473, var2.field4479, var2.field4491, field254 == null ? (field254 = method212("wf")) : field254);
                    if (var17 instanceof class130) {
                        var2.method1117(0);
                    } else {
                        class78.method605(var2.field4473, var2.field4479, var2.field4491, field254 == null ? (field254 = method212("wf")) : field254);
                        class364 var18 = class18.field227.method1201((byte) 120, var2.field4467);
                        int var19;
                        int var20;
                        if (var2.field4469 == 1 || var2.field4469 == 3) {
                            var20 = var18.field4910;
                            var19 = var18.field4926;
                        } else {
                            var19 = var18.field4910;
                            var20 = var18.field4926;
                        }
                        class130 var21 = new class130(var2.field4468, var2.field4469, var2.field4473, var2.field4490, var2.field4484, var2.field4480, var2.field4479, var19 + var2.field4479 - 1, var2.field4491, var2.field4491 + var20 - 1, var17);
                        class108.method761(var21, false);
                    }
                } else if (var12 == 3) {
                    class197 var15 = class404.method2411(var2.field4473, var2.field4479, var2.field4491);
                    if (var15 instanceof class469) {
                        var2.method1117(0);
                    } else {
                        class469 var16 = new class469(var2.field4490, var2.field4484, var2.field4480, var15);
                        class112.method782(var2.field4473, var2.field4479, var2.field4491, var16);
                    }
                }
            }
        }
        field242++;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(Z)V")
    public static final void method202(boolean arg0) {
        field232++;
        if (class348.field4669 == 6) {
            if (!arg0) {
                field252 = null;
            }
            class348.field4669 = 7;
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lwr;B)V")
    private final void method203(class388 arg0, byte arg1) {
        class425.field6048 = arg0.field5469;
        field237++;
        arg0.method2279(-20873);
        arg0.method2307(60, false);
        if (arg1 != -10) {
            this.method205(3);
        }
        arg0.method2275(arg1 - 32481, false);
        arg0.method2339(30101);
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lwr;I)V")
    public final void method204(class388 arg0, int arg1) {
        field251++;
        this.field249.method619(24, arg1 ^ 0xFFFFBA5D, 196584);
        if (arg1 != 17877) {
            field250 = null;
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(I)V")
    public final void method205(int arg0) {
        field234++;
        if (arg0 != 2084491404) {
            field250 = null;
        }
        this.field249.method618((byte) 121);
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IBLwr;)V")
    private final void method206(int arg0, byte arg1, class388 arg2) {
        field240++;
        int var4 = 0;
        class557 var5 = arg2.method2297((byte) 95);
        float var6 = var5.field7721;
        if (arg1 <= 113) {
            this.field235 = null;
        }
        float var7 = var5.field7730;
        float var8 = var5.field7723;
        float var9 = var5.field7702;
        float var10 = var5.field7687;
        float var11 = var5.field7707;
        float var12 = var6 + var9;
        float var13 = var7 + var10;
        float var14 = var8 + var11;
        float var15 = var6 - var9;
        float var16 = var7 - var10;
        float var17 = var8 - var11;
        float var18 = var9 - var6;
        float var19 = var10 - var7;
        float var20 = var11 - var8;
        Buffer var21 = this.field249.method613(true, -25838);
        if (var21 == null) {
            return;
        }
        Stream var22 = arg2.method2269(82, var21);
        if (Stream.method3294()) {
            for (int var23 = arg0 - 1; var23 >= 0; var23--) {
                int var24 = this.field243[var23] <= 64 ? this.field243[var23] : 64;
                if (var24 > 0) {
                    for (int var25 = var24 - 1; var25 >= 0; var25--) {
                        class28 var38 = this.field236[var23][var25];
                        int var39 = var38.field480;
                        byte var40 = (byte) (var39 >> 16);
                        byte var41 = (byte) (var39 >> 8);
                        byte var42 = (byte) var39;
                        byte var43 = (byte) (var39 >>> 24);
                        float var44 = (float) (var38.field468 >> 12);
                        float var45 = (float) (var38.field478 >> 12);
                        float var46 = (float) (var38.field479 >> 12);
                        int var47 = var38.field475 >> 12;
                        var22.method3289((float) (-var47) * var12 + var44);
                        var22.method3289((float) (-var47) * var13 + var45);
                        var22.method3289((float) (-var47) * var14 + var46);
                        var22.method3297(var42);
                        var22.method3297(var41);
                        var22.method3297(var40);
                        var22.method3297(var43);
                        var22.method3289(0.0F);
                        var22.method3289(0.0F);
                        var22.method3289((float) var47 * var15 + var44);
                        var22.method3289((float) var47 * var16 + var45);
                        var22.method3289((float) var47 * var17 + var46);
                        var22.method3297(var42);
                        var22.method3297(var41);
                        var22.method3297(var40);
                        var22.method3297(var43);
                        var22.method3289(1.0F);
                        var22.method3289(0.0F);
                        var22.method3289((float) var47 * var12 + var44);
                        var22.method3289((float) var47 * var13 + var45);
                        var22.method3289((float) var47 * var14 + var46);
                        var22.method3297(var42);
                        var22.method3297(var41);
                        var22.method3297(var40);
                        var22.method3297(var43);
                        var22.method3289(1.0F);
                        var22.method3289(1.0F);
                        var22.method3289((float) var47 * var18 + var44);
                        var22.method3289((float) var47 * var19 + var45);
                        var22.method3289((float) var47 * var20 + var46);
                        var22.method3297(var42);
                        var22.method3297(var41);
                        var22.method3297(var40);
                        var22.method3297(var43);
                        var22.method3289(0.0F);
                        var4++;
                        var22.method3289(1.0F);
                    }
                    if (this.field243[var23] > 64) {
                        int var26 = this.field243[var23] - 64 - 1;
                        for (int var27 = this.field231[var26] - 1; var27 >= 0; var27--) {
                            class28 var28 = this.field238[var26][var27];
                            int var29 = var28.field480;
                            byte var30 = (byte) (var29 >> 16);
                            byte var31 = (byte) (var29 >> 8);
                            byte var32 = (byte) var29;
                            byte var33 = (byte) (var29 >>> 24);
                            float var34 = (float) (var28.field468 >> 12);
                            float var35 = (float) (var28.field478 >> 12);
                            float var36 = (float) (var28.field479 >> 12);
                            int var37 = var28.field475 >> 12;
                            var22.method3289((float) (-var37) * var12 + var34);
                            var22.method3289((float) (-var37) * var13 + var35);
                            var22.method3289((float) (-var37) * var14 + var36);
                            var22.method3297(var32);
                            var22.method3297(var31);
                            var22.method3297(var30);
                            var22.method3297(var33);
                            var22.method3289(0.0F);
                            var22.method3289(0.0F);
                            var22.method3289((float) var37 * var15 + var34);
                            var22.method3289((float) var37 * var16 + var35);
                            var22.method3289((float) var37 * var17 + var36);
                            var22.method3297(var32);
                            var22.method3297(var31);
                            var22.method3297(var30);
                            var22.method3297(var33);
                            var22.method3289(1.0F);
                            var22.method3289(0.0F);
                            var22.method3289((float) var37 * var12 + var34);
                            var22.method3289((float) var37 * var13 + var35);
                            var22.method3289((float) var37 * var14 + var36);
                            var22.method3297(var32);
                            var22.method3297(var31);
                            var22.method3297(var30);
                            var22.method3297(var33);
                            var22.method3289(1.0F);
                            var22.method3289(1.0F);
                            var22.method3289((float) var37 * var18 + var34);
                            var22.method3289((float) var37 * var19 + var35);
                            var22.method3289((float) var37 * var20 + var36);
                            var22.method3297(var32);
                            var22.method3297(var31);
                            var22.method3297(var30);
                            var22.method3297(var33);
                            var22.method3289(0.0F);
                            var22.method3289(1.0F);
                            var4++;
                        }
                    }
                }
            }
        } else {
            for (int var48 = arg0 - 1; var48 >= 0; var48--) {
                int var49 = this.field243[var48] > 64 ? 64 : this.field243[var48];
                if (var49 > 0) {
                    for (int var50 = var49 - 1; var50 >= 0; var50--) {
                        class28 var63 = this.field236[var48][var50];
                        int var64 = var63.field480;
                        byte var65 = (byte) (var64 >> 16);
                        byte var66 = (byte) (var64 >> 8);
                        byte var67 = (byte) var64;
                        byte var68 = (byte) (var64 >>> 24);
                        float var69 = (float) (var63.field468 >> 12);
                        float var70 = (float) (var63.field478 >> 12);
                        float var71 = (float) (var63.field479 >> 12);
                        int var72 = var63.field475 >> 12;
                        var22.method3293((float) (-var72) * var12 + var69);
                        var22.method3293((float) (-var72) * var13 + var70);
                        var22.method3293((float) (-var72) * var14 + var71);
                        var22.method3297(var67);
                        var22.method3297(var66);
                        var22.method3297(var65);
                        var22.method3297(var68);
                        var22.method3293(0.0F);
                        var22.method3293(0.0F);
                        var22.method3293((float) var72 * var15 + var69);
                        var22.method3293((float) var72 * var16 + var70);
                        var22.method3293((float) var72 * var17 + var71);
                        var22.method3297(var67);
                        var22.method3297(var66);
                        var22.method3297(var65);
                        var22.method3297(var68);
                        var22.method3293(1.0F);
                        var22.method3293(0.0F);
                        var22.method3293((float) var72 * var12 + var69);
                        var22.method3293((float) var72 * var13 + var70);
                        var22.method3293((float) var72 * var14 + var71);
                        var22.method3297(var67);
                        var22.method3297(var66);
                        var22.method3297(var65);
                        var22.method3297(var68);
                        var22.method3293(1.0F);
                        var22.method3293(1.0F);
                        var22.method3293((float) var72 * var18 + var69);
                        var22.method3293((float) var72 * var19 + var70);
                        var22.method3293((float) var72 * var20 + var71);
                        var22.method3297(var67);
                        var22.method3297(var66);
                        var22.method3297(var65);
                        var22.method3297(var68);
                        var22.method3293(0.0F);
                        var4++;
                        var22.method3293(1.0F);
                    }
                    if (this.field243[var48] > 64) {
                        int var51 = this.field243[var48] - 64 - 1;
                        for (int var52 = this.field231[var51] - 1; var52 >= 0; var52--) {
                            class28 var53 = this.field238[var51][var52];
                            int var54 = var53.field480;
                            byte var55 = (byte) (var54 >> 16);
                            byte var56 = (byte) (var54 >> 8);
                            byte var57 = (byte) var54;
                            byte var58 = (byte) (var54 >>> 24);
                            float var59 = (float) (var53.field468 >> 12);
                            float var60 = (float) (var53.field478 >> 12);
                            float var61 = (float) (var53.field479 >> 12);
                            int var62 = var53.field475 >> 12;
                            var22.method3293((float) (-var62) * var12 + var59);
                            var22.method3293((float) (-var62) * var13 + var60);
                            var22.method3293((float) (-var62) * var14 + var61);
                            var22.method3297(var57);
                            var22.method3297(var56);
                            var22.method3297(var55);
                            var22.method3297(var58);
                            var22.method3293(0.0F);
                            var22.method3293(0.0F);
                            var22.method3293((float) var62 * var15 + var59);
                            var22.method3293((float) var62 * var16 + var60);
                            var22.method3293((float) var62 * var17 + var61);
                            var22.method3297(var57);
                            var22.method3297(var56);
                            var22.method3297(var55);
                            var22.method3297(var58);
                            var22.method3293(1.0F);
                            var22.method3293(0.0F);
                            var22.method3293((float) var62 * var12 + var59);
                            var22.method3293((float) var62 * var13 + var60);
                            var22.method3293((float) var62 * var14 + var61);
                            var22.method3297(var57);
                            var22.method3297(var56);
                            var22.method3297(var55);
                            var22.method3297(var58);
                            var22.method3293(1.0F);
                            var22.method3293(1.0F);
                            var22.method3293((float) var62 * var18 + var59);
                            var22.method3293((float) var62 * var19 + var60);
                            var22.method3293((float) var62 * var20 + var61);
                            var22.method3297(var57);
                            var22.method3297(var56);
                            var22.method3297(var55);
                            var22.method3297(var58);
                            var22.method3293(0.0F);
                            var4++;
                            var22.method3293(1.0F);
                        }
                    }
                }
            }
        }
        var22.method3288();
        if (this.field249.method616((byte) -111)) {
            arg2.method1609(this.field246, 39);
            arg2.method1607(this.field249, 0, false);
            arg2.method1615(false, var4 * 4, this.field245, 0, var4 * 2, 0, class481.field6784);
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(BI)V")
    public static final void method207(byte arg0, int arg1) {
        field239++;
        class6.field77.method3253(arg1, arg0 - 195);
        class2.field24.method3253(arg1, -121);
        class447.field6345.method3253(arg1, arg0 - 195);
        if (arg0 == 67) {
            class348.field4671.method3253(arg1, -124);
            class343.field4620.method3253(arg1, -125);
        }
    }

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "(Lwr;B)V")
    private final void method208(class388 arg0, byte arg1) {
        field247++;
        arg0.method2275(-32491, true);
        arg0.method2307(49, true);
        int var3 = -101 / ((arg1 + 29) / 38);
        if (class425.field6048 != arg0.field5469) {
            arg0.method1295(class425.field6048);
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(ILdaa;)Lsba;")
    public static final class183 method209(int arg0, class11 arg1) {
        field253++;
        if (arg0 == -423973748) {
            class183 var2 = new class183();
            var2.field2584 = arg1.method93((byte) 105);
            var2.field2582 = class451.field6374.method2202(var2.field2584, 116);
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lwr;BLhp;)V")
    public final void method210(class388 arg0, byte arg1, class274 arg2) {
        field233++;
        if (arg0.field5383 == null) {
            return;
        }
        this.method203(arg0, (byte) -10);
        float var4 = arg0.field5383.field7695;
        float var5 = arg0.field5383.field7685;
        float var6 = arg0.field5383.field7708;
        float var7 = arg0.field5383.field7693;
        if (arg1 > -32) {
            method201((byte) 58);
        }
        try {
            if (arg2.field3803) {
                int var26 = arg2.field3804 - arg2.field3805;
                int var27;
                if (var26 + 2 > 1600) {
                    var27 = class98.method703(var26, 0) + 1 - class485.field6821;
                    var26 = (var26 >> var27) + 2;
                } else {
                    var27 = 0;
                    var26 += 2;
                }
                class590 var28 = arg2.field3798.field3267;
                class590 var29 = var28.field8428;
                int var30 = -2;
                boolean var31 = true;
                boolean var32 = true;
                while (var28 != var29) {
                    this.field244 = 0;
                    for (int var33 = 0; var33 < var26; var33++) {
                        this.field243[var33] = 0;
                    }
                    for (int var34 = 0; var34 < 64; var34++) {
                        this.field231[var34] = 0;
                    }
                    while (var28 != var29) {
                        class28 var35 = (class28) var29;
                        if (var32) {
                            var32 = false;
                            var31 = var35.field481;
                            var30 = var35.field469;
                        } else if (var35.field469 != var30 || var35.field481 != var31) {
                            var32 = true;
                            break;
                        }
                        int var36 = (int) ((float) (var35.field479 >> 12) * var6 + (float) (var35.field478 >> 12) * var5 + (float) (var35.field468 >> 12) * var4 + var7) - arg2.field3805 >> var27;
                        if (var36 < 1600) {
                            if (this.field243[var36] < 64) {
                                this.field236[var36][this.field243[var36]++] = var35;
                            } else {
                                label148: {
                                    if (this.field243[var36] == 64) {
                                        if (this.field244 == 64) {
                                            break label148;
                                        }
                                        this.field243[var36] += this.field244++ + 1;
                                    }
                                    this.field238[this.field243[var36] - 1 - 64][this.field231[this.field243[var36] - 64 - 1]++] = var35;
                                }
                            }
                        }
                        var29 = var29.field8428;
                    }
                    arg0.method2344((byte) 53, var30 < 0 ? -1 : var30, false, false);
                    if (var31 && class425.field6048 != arg0.field5469) {
                        arg0.method1295(class425.field6048);
                    } else if (arg0.field5469 != 1.0F) {
                        arg0.method1295(1.0F);
                    }
                    this.method206(var26, (byte) 123, arg0);
                }
            } else {
                int var8 = 0;
                int var9 = Integer.MAX_VALUE;
                int var10 = 0;
                class590 var11 = arg2.field3798.field3267;
                for (class590 var12 = var11.field8428; var12 != var11; var12 = var12.field8428) {
                    class28 var13 = (class28) var12;
                    int var14 = (int) ((float) (var13.field479 >> 12) * var6 + (float) (var13.field478 >> 12) * var5 + (float) (var13.field468 >> 12) * var4 + var7);
                    this.field235[var8++] = var14;
                    if (var10 < var14) {
                        var10 = var14;
                    }
                    if (var14 < var9) {
                        var9 = var14;
                    }
                }
                int var15 = var10 - var9;
                int var16;
                if ((var15 + 2) <= 1600) {
                    var16 = 0;
                    var15 += 2;
                } else {
                    var16 = class98.method703(var15, 0) + (1 - class485.field6821);
                    var15 = (var15 >> var16) + 2;
                }
                int var17 = 0;
                class590 var18 = var11.field8428;
                int var19 = -2;
                boolean var20 = true;
                boolean var21 = true;
                while (var11 != var18) {
                    this.field244 = 0;
                    for (int var22 = 0; var22 < var15; var22++) {
                        this.field243[var22] = 0;
                    }
                    for (int var23 = 0; var23 < 64; var23++) {
                        this.field231[var23] = 0;
                    }
                    while (var11 != var18) {
                        class28 var24 = (class28) var18;
                        if (var21) {
                            var20 = var24.field481;
                            var21 = false;
                            var19 = var24.field469;
                        }
                        if (var17 > 0 && (var24.field469 != var19 || var20 != var24.field481)) {
                            var21 = true;
                            break;
                        }
                        int var25 = this.field235[var17++] - var9 >> var16;
                        if (var25 < 1600) {
                            if (this.field243[var25] >= 64) {
                                label193: {
                                    if (this.field243[var25] == 64) {
                                        if (this.field244 == 64) {
                                            break label193;
                                        }
                                        this.field243[var25] += (this.field244++) + 1;
                                    }
                                    this.field238[this.field243[var25] - 65][this.field231[this.field243[var25] - 1 - 64]++] = var24;
                                }
                            } else {
                                this.field236[var25][this.field243[var25]++] = var24;
                            }
                        }
                        var18 = var18.field8428;
                    }
                    arg0.method2344((byte) 88, var19 >= 0 ? var19 : -1, false, false);
                    if (var20 && class425.field6048 != arg0.field5469) {
                        arg0.method1295(class425.field6048);
                    } else if (arg0.field5469 != 1.0F) {
                        arg0.method1295(1.0F);
                    }
                    this.method206(var15, (byte) 125, arg0);
                }
            }
        } catch (Exception var37) {
        }
        this.method208(arg0, (byte) 46);
    }

    @OriginalMember(owner = "client!qo", name = "<init>", descriptor = "(Lwr;)V")
    public class20(class388 arg0) {
        this.field249 = arg0.method1644((byte) 115, true);
        this.field246 = arg0.method1643(new class14[] { new class14(new class94[] { class94.field1441, class94.field1445, class94.field1447 }) }, false);
        this.field245 = arg0.method1588(false, (byte) 121);
        this.field245.method1477(-18855, 49146);
        Buffer var2 = this.field245.method613(true, -25838);
        if (var2 != null) {
            Stream var3 = arg0.method2269(68, var2);
            if (Stream.method3294()) {
                for (int var6 = 0; var6 < 8191; var6++) {
                    int var7 = var6 * 4;
                    var3.method3291(var7);
                    var3.method3291(var7 + 1);
                    var3.method3291(var7 + 2);
                    var3.method3291(var7 + 2);
                    var3.method3291(var7 + 3);
                    var3.method3291(var7);
                }
            } else {
                for (int var4 = 0; var4 < 8191; var4++) {
                    int var5 = var4 * 4;
                    var3.method3298(var5);
                    var3.method3298(var5 + 1);
                    var3.method3298(var5 + 2);
                    var3.method3298(var5 + 2);
                    var3.method3298(var5 + 3);
                    var3.method3298(var5);
                }
            }
            var3.method3288();
            this.field245.method616((byte) -81);
        }
    }

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "(I)V")
    public static void method211(int arg0) {
        field241 = null;
        field250 = null;
        if (arg0 != -1) {
            method202(true);
        }
        field252 = null;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method212(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
