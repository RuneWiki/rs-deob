import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jba")
public class class366 {

    @OriginalMember(owner = "client!jba", name = "e", descriptor = "[I")
    private int[] field4923 = new int[8191];

    @OriginalMember(owner = "client!jba", name = "d", descriptor = "I")
    private int field4922 = 0;

    @OriginalMember(owner = "client!jba", name = "g", descriptor = "[[Lmca;")
    private class29[][] field4925 = new class29[1600][64];

    @OriginalMember(owner = "client!jba", name = "l", descriptor = "[I")
    private int[] field4930 = new int[1600];

    @OriginalMember(owner = "client!jba", name = "m", descriptor = "[[Lmca;")
    private class29[][] field4931 = new class29[64][768];

    @OriginalMember(owner = "client!jba", name = "r", descriptor = "[I")
    private int[] field4936 = new int[64];

    @OriginalMember(owner = "client!jba", name = "t", descriptor = "Lfj;")
    private class607 field4938;

    @OriginalMember(owner = "client!jba", name = "f", descriptor = "Lel;")
    private class508 field4924;

    @OriginalMember(owner = "client!jba", name = "b", descriptor = "Lel;")
    private class508 field4920;

    @OriginalMember(owner = "client!jba", name = "i", descriptor = "Lcda;")
    private class154 field4927;

    @OriginalMember(owner = "client!jba", name = "j", descriptor = "Luf;")
    public static class414 field4928 = new class414();

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "I")
    public static int field4919;

    @OriginalMember(owner = "client!jba", name = "c", descriptor = "I")
    public static int field4921;

    @OriginalMember(owner = "client!jba", name = "h", descriptor = "I")
    public static int field4926;

    @OriginalMember(owner = "client!jba", name = "k", descriptor = "I")
    public static int field4929;

    @OriginalMember(owner = "client!jba", name = "n", descriptor = "I")
    public static int field4932;

    @OriginalMember(owner = "client!jba", name = "o", descriptor = "I")
    public static int field4933;

    @OriginalMember(owner = "client!jba", name = "p", descriptor = "I")
    public static int field4934;

    @OriginalMember(owner = "client!jba", name = "q", descriptor = "I")
    public static int field4935;

    @OriginalMember(owner = "client!jba", name = "s", descriptor = "I")
    public static int field4937;

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(IILifa;Lso;)V", line = 4)
    public final void method2116(int arg0, int arg1, class393 arg2, class436 arg3) {
        field4934++;
        if (arg2.field5432 == null) {
            return;
        }
        if (arg1 >= 0) {
            this.method2117(arg1, arg0 ^ 0x7D08112C, arg2);
        } else {
            this.method2122(arg2, arg0 ^ 0x7D08116C);
        }
        float var5 = arg2.field5432.field9247;
        float var6 = arg2.field5432.field9268;
        float var7 = arg2.field5432.field9253;
        float var8 = arg2.field5432.field9265;
        try {
            int var9 = 0;
            int var10 = Integer.MAX_VALUE;
            int var11 = 0;
            class589 var12 = arg3.field6248.field1611;
            for (class589 var13 = var12.field8537; var13 != var12; var13 = var13.field8537) {
                class29 var14 = (class29) var13;
                int var15 = (int) ((float) (var14.field625 >> 12) * var7 + (float) (var14.field624 >> 12) * var5 + (float) (var14.field623 >> 12) * var6 + var8);
                if (var10 > var15) {
                    var10 = var15;
                }
                if (var11 < var15) {
                    var11 = var15;
                }
                this.field4923[var9++] = var15;
            }
            int var16 = var11 - var10;
            int var17;
            if ((var16 + 2) <= 1600) {
                var16 += 2;
                var17 = 0;
            } else {
                var17 = class565.method3314((byte) 17, var16) + 1 - class582.field8482;
                var16 = (var16 >> var17) + 2;
            }
            class589 var18 = var12.field8537;
            int var19 = 0;
            int var20 = -2;
            boolean var21 = true;
            boolean var22 = true;
            while (var12 != var18) {
                this.field4922 = 0;
                for (int var23 = 0; var23 < var16; var23++) {
                    this.field4930[var23] = 0;
                }
                for (int var24 = 0; var24 < 64; var24++) {
                    this.field4936[var24] = 0;
                }
                while (var12 != var18) {
                    class29 var25 = (class29) var18;
                    if (var22) {
                        var21 = var25.field620;
                        var20 = var25.field626;
                        var22 = false;
                    }
                    if (var19 > 0 && (var25.field626 != var20 || var25.field620 != var21)) {
                        var22 = true;
                        break;
                    }
                    int var26 = this.field4923[var19++] - var10 >> var17;
                    if (var26 < 1600) {
                        if (this.field4930[var26] < 64) {
                            this.field4925[var26][this.field4930[var26]++] = var25;
                        } else {
                            label109: {
                                if (this.field4930[var26] == 64) {
                                    if (this.field4922 == 64) {
                                        break label109;
                                    }
                                    this.field4930[var26] += this.field4922++ + 1;
                                }
                                this.field4931[this.field4930[var26] - 64 - 1][this.field4936[this.field4930[var26] - 1 - 64]++] = var25;
                            }
                        }
                    }
                    var18 = var18.field8537;
                }
                arg2.method2322(-68, var20 >= 0 ? var20 : -1, false, false);
                if (var21 && class499.field6970 != arg2.field5491) {
                    arg2.method239(class499.field6970);
                } else if (arg2.field5491 != 1.0F) {
                    arg2.method239(1.0F);
                }
                this.method2123(var16, arg2, (byte) -22);
            }
            if (arg0 != 2097680684) {
                field4932 = 56;
            }
        } catch (Exception var27) {
        }
        this.method2121(90, arg2);
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(IILifa;)V", line = 163)
    private final void method2117(int arg0, int arg1, class393 arg2) {
        class499.field6970 = arg2.field5491;
        field4933++;
        if (arg1 != 0) {
            this.method2121(10, null);
        }
        arg2.method2382(29065, (float) arg0);
        arg2.method2308(true);
        arg2.method2312(arg1 ^ 0x3, false);
        arg2.method2306(4345, false);
        arg2.method2323(111);
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(Lifa;B)V", line = 184)
    public final void method2118(class393 arg0, byte arg1) {
        if (arg1 < 6) {
            field4928 = null;
        }
        field4921++;
        this.field4924.method742(24, 786336, true);
    }

    @OriginalMember(owner = "client!jba", name = "<init>", descriptor = "(Lifa;)V", line = 684)
    public class366(class393 arg0) {
        this.field4938 = arg0.method504((byte) 31, new class253[] { new class253(new class397[] { class397.field5604, class397.field5612, class397.field5614 }), new class253(class397.field5611) });
        this.field4924 = arg0.method516((byte) 124, true);
        this.field4920 = arg0.method516((byte) 115, false);
        this.field4920.method742(12, 393168, true);
        this.field4927 = arg0.method475(false, -30974);
        this.field4927.method13(49146, -6482);
        Buffer var2 = this.field4927.method14(true, (byte) -60);
        if (var2 != null) {
            Stream var3 = arg0.method2350(var2, true);
            if (Stream.method3579()) {
                for (int var4 = 0; var4 < 8191; var4++) {
                    int var5 = var4 * 4;
                    var3.method3581(var5);
                    var3.method3581(var5 + 1);
                    var3.method3581(var5 + 2);
                    var3.method3581(var5 + 2);
                    var3.method3581(var5 + 3);
                    var3.method3581(var5);
                }
            } else {
                for (int var6 = 0; var6 < 8191; var6++) {
                    int var7 = var6 * 4;
                    var3.method3586(var7);
                    var3.method3586(var7 + 1);
                    var3.method3586(var7 + 2);
                    var3.method3586(var7 + 2);
                    var3.method3586(var7 + 3);
                    var3.method3586(var7);
                }
            }
            var3.method3578();
            this.field4927.method15(-1969);
        }
        Buffer var8 = this.field4920.method741(true, false);
        if (var8 != null) {
            Stream var9 = arg0.method2350(var8, true);
            if (Stream.method3579()) {
                for (int var10 = 0; var10 < 8191; var10++) {
                    var9.method3584(0.0F);
                    var9.method3584(-1.0F);
                    var9.method3584(0.0F);
                    var9.method3584(0.0F);
                    var9.method3584(-1.0F);
                    var9.method3584(0.0F);
                    var9.method3584(0.0F);
                    var9.method3584(-1.0F);
                    var9.method3584(0.0F);
                    var9.method3584(0.0F);
                    var9.method3584(-1.0F);
                    var9.method3584(0.0F);
                }
            } else {
                for (int var11 = 0; var11 < 8191; var11++) {
                    var9.method3577(0.0F);
                    var9.method3577(-1.0F);
                    var9.method3577(0.0F);
                    var9.method3577(0.0F);
                    var9.method3577(-1.0F);
                    var9.method3577(0.0F);
                    var9.method3577(0.0F);
                    var9.method3577(-1.0F);
                    var9.method3577(0.0F);
                    var9.method3577(0.0F);
                    var9.method3577(-1.0F);
                    var9.method3577(0.0F);
                }
            }
            var9.method3578();
            this.field4920.method740(95);
        }
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(I)V", line = 205)
    public static void method2119(int arg0) {
        field4928 = null;
        if (arg0 != -27715) {
            method2124(null, -24);
        }
    }

    @OriginalMember(owner = "client!jba", name = "b", descriptor = "(I)V", line = 215)
    public final void method2120(int arg0) {
        if (arg0 == 0) {
            field4937++;
            this.field4924.method11((byte) 8);
        }
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(ILifa;)V", line = 242)
    private final void method2121(int arg0, class393 arg1) {
        arg1.method2306(4345, true);
        field4926++;
        arg1.method2312(3, true);
        int var3 = 65 / ((arg0 + 46) / 40);
        if (class499.field6970 != arg1.field5491) {
            arg1.method239(class499.field6970);
        }
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(Lifa;I)V", line = 260)
    private final void method2122(class393 arg0, int arg1) {
        class499.field6970 = arg0.field5491;
        field4929++;
        arg0.method2327((byte) -120);
        if (arg1 != 64) {
            this.method2118(null, (byte) -49);
        }
        arg0.method2312(3, false);
        arg0.method2306(4345, false);
        arg0.method2323(110);
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(ILifa;B)V", line = 276)
    private final void method2123(int arg0, class393 arg1, byte arg2) {
        field4919++;
        int var4 = 0;
        class653 var5 = arg1.method2354((byte) 119);
        float var6 = var5.field9277;
        float var7 = var5.field9281;
        float var8 = var5.field9255;
        float var9 = var5.field9272;
        float var10 = var5.field9245;
        float var11 = var5.field9283;
        float var12 = var6 + var9;
        if (arg2 >= -3) {
            method2124(null, -107);
        }
        float var13 = var7 + var10;
        float var14 = var8 + var11;
        float var15 = var6 - var9;
        float var16 = var7 - var10;
        float var17 = var8 - var11;
        float var18 = var9 - var6;
        float var19 = var10 - var7;
        float var20 = var11 - var8;
        Buffer var21 = this.field4924.method741(true, false);
        if (var21 == null) {
            return;
        }
        Stream var22 = arg1.method2350(var21, true);
        if (Stream.method3579()) {
            for (int var48 = arg0 - 1; var48 >= 0; var48--) {
                int var49 = this.field4930[var48] <= 64 ? this.field4930[var48] : 64;
                if (var49 > 0) {
                    for (int var50 = var49 - 1; var50 >= 0; var50--) {
                        class29 var63 = this.field4925[var48][var50];
                        int var64 = var63.field618;
                        byte var65 = (byte) (var64 >> 16);
                        byte var66 = (byte) (var64 >> 8);
                        byte var67 = (byte) var64;
                        byte var68 = (byte) (var64 >>> 24);
                        float var69 = (float) (var63.field624 >> 12);
                        float var70 = (float) (var63.field623 >> 12);
                        float var71 = (float) (var63.field625 >> 12);
                        int var72 = var63.field622 >> 12;
                        var22.method3584((float) (-var72) * var12 + var69);
                        var22.method3584((float) (-var72) * var13 + var70);
                        var22.method3584((float) (-var72) * var14 + var71);
                        if (arg1.field5443 == 0) {
                            var22.method3582(var65, var66, var67, var68);
                        } else {
                            var22.method3575(var65, var66, var67, var68);
                        }
                        var22.method3584(0.0F);
                        var22.method3584(0.0F);
                        var22.method3584((float) var72 * var15 + var69);
                        var22.method3584((float) var72 * var16 + var70);
                        var22.method3584((float) var72 * var17 + var71);
                        if (arg1.field5443 == 0) {
                            var22.method3582(var65, var66, var67, var68);
                        } else {
                            var22.method3575(var65, var66, var67, var68);
                        }
                        var22.method3584(1.0F);
                        var22.method3584(0.0F);
                        var22.method3584((float) var72 * var12 + var69);
                        var22.method3584((float) var72 * var13 + var70);
                        var22.method3584((float) var72 * var14 + var71);
                        if (arg1.field5443 == 0) {
                            var22.method3582(var65, var66, var67, var68);
                        } else {
                            var22.method3575(var65, var66, var67, var68);
                        }
                        var22.method3584(1.0F);
                        var22.method3584(1.0F);
                        var22.method3584((float) var72 * var18 + var69);
                        var22.method3584((float) var72 * var19 + var70);
                        var22.method3584((float) var72 * var20 + var71);
                        if (arg1.field5443 == 0) {
                            var22.method3582(var65, var66, var67, var68);
                        } else {
                            var22.method3575(var65, var66, var67, var68);
                        }
                        var22.method3584(0.0F);
                        var22.method3584(1.0F);
                        var4++;
                    }
                    if (this.field4930[var48] > 64) {
                        int var51 = this.field4930[var48] - 65;
                        for (int var52 = this.field4936[var51] - 1; var52 >= 0; var52--) {
                            class29 var53 = this.field4931[var51][var52];
                            int var54 = var53.field618;
                            byte var55 = (byte) (var54 >> 16);
                            byte var56 = (byte) (var54 >> 8);
                            byte var57 = (byte) var54;
                            byte var58 = (byte) (var54 >>> 24);
                            float var59 = (float) (var53.field624 >> 12);
                            float var60 = (float) (var53.field623 >> 12);
                            float var61 = (float) (var53.field625 >> 12);
                            int var62 = var53.field622 >> 12;
                            var22.method3584((float) (-var62) * var12 + var59);
                            var22.method3584((float) (-var62) * var13 + var60);
                            var22.method3584((float) (-var62) * var14 + var61);
                            if (arg1.field5443 == 0) {
                                var22.method3582(var55, var56, var57, var58);
                            } else {
                                var22.method3575(var55, var56, var57, var58);
                            }
                            var22.method3584(0.0F);
                            var22.method3584(0.0F);
                            var22.method3584((float) var62 * var15 + var59);
                            var22.method3584((float) var62 * var16 + var60);
                            var22.method3584((float) var62 * var17 + var61);
                            if (arg1.field5443 == 0) {
                                var22.method3582(var55, var56, var57, var58);
                            } else {
                                var22.method3575(var55, var56, var57, var58);
                            }
                            var22.method3584(1.0F);
                            var22.method3584(0.0F);
                            var22.method3584((float) var62 * var12 + var59);
                            var22.method3584((float) var62 * var13 + var60);
                            var22.method3584((float) var62 * var14 + var61);
                            if (arg1.field5443 == 0) {
                                var22.method3582(var55, var56, var57, var58);
                            } else {
                                var22.method3575(var55, var56, var57, var58);
                            }
                            var22.method3584(1.0F);
                            var22.method3584(1.0F);
                            var22.method3584((float) var62 * var18 + var59);
                            var22.method3584((float) var62 * var19 + var60);
                            var22.method3584((float) var62 * var20 + var61);
                            if (arg1.field5443 == 0) {
                                var22.method3582(var55, var56, var57, var58);
                            } else {
                                var22.method3575(var55, var56, var57, var58);
                            }
                            var22.method3584(0.0F);
                            var4++;
                            var22.method3584(1.0F);
                        }
                    }
                }
            }
        } else {
            for (int var23 = arg0 - 1; var23 >= 0; var23--) {
                int var24 = this.field4930[var23] <= 64 ? this.field4930[var23] : 64;
                if (var24 > 0) {
                    for (int var25 = var24 - 1; var25 >= 0; var25--) {
                        class29 var38 = this.field4925[var23][var25];
                        int var39 = var38.field618;
                        byte var40 = (byte) (var39 >> 16);
                        byte var41 = (byte) (var39 >> 8);
                        byte var42 = (byte) var39;
                        byte var43 = (byte) (var39 >>> 24);
                        float var44 = (float) (var38.field624 >> 12);
                        float var45 = (float) (var38.field623 >> 12);
                        float var46 = (float) (var38.field625 >> 12);
                        int var47 = var38.field622 >> 12;
                        var22.method3577((float) (-var47) * var12 + var44);
                        var22.method3577((float) (-var47) * var13 + var45);
                        var22.method3577((float) (-var47) * var14 + var46);
                        if (arg1.field5443 == 0) {
                            var22.method3582(var40, var41, var42, var43);
                        } else {
                            var22.method3575(var40, var41, var42, var43);
                        }
                        var22.method3577(0.0F);
                        var22.method3577(0.0F);
                        var22.method3577((float) var47 * var15 + var44);
                        var22.method3577((float) var47 * var16 + var45);
                        var22.method3577((float) var47 * var17 + var46);
                        if (arg1.field5443 == 0) {
                            var22.method3582(var40, var41, var42, var43);
                        } else {
                            var22.method3575(var40, var41, var42, var43);
                        }
                        var22.method3577(1.0F);
                        var22.method3577(0.0F);
                        var22.method3577((float) var47 * var12 + var44);
                        var22.method3577((float) var47 * var13 + var45);
                        var22.method3577((float) var47 * var14 + var46);
                        if (arg1.field5443 == 0) {
                            var22.method3582(var40, var41, var42, var43);
                        } else {
                            var22.method3575(var40, var41, var42, var43);
                        }
                        var22.method3577(1.0F);
                        var22.method3577(1.0F);
                        var22.method3577((float) var47 * var18 + var44);
                        var22.method3577((float) var47 * var19 + var45);
                        var22.method3577((float) var47 * var20 + var46);
                        if (arg1.field5443 == 0) {
                            var22.method3582(var40, var41, var42, var43);
                        } else {
                            var22.method3575(var40, var41, var42, var43);
                        }
                        var22.method3577(0.0F);
                        var22.method3577(1.0F);
                        var4++;
                    }
                    if (this.field4930[var23] > 64) {
                        int var26 = this.field4930[var23] - 65;
                        for (int var27 = this.field4936[var26] - 1; var27 >= 0; var27--) {
                            class29 var28 = this.field4931[var26][var27];
                            int var29 = var28.field618;
                            byte var30 = (byte) (var29 >> 16);
                            byte var31 = (byte) (var29 >> 8);
                            byte var32 = (byte) var29;
                            byte var33 = (byte) (var29 >>> 24);
                            float var34 = (float) (var28.field624 >> 12);
                            float var35 = (float) (var28.field623 >> 12);
                            float var36 = (float) (var28.field625 >> 12);
                            int var37 = var28.field622 >> 12;
                            var22.method3577((float) (-var37) * var12 + var34);
                            var22.method3577((float) (-var37) * var13 + var35);
                            var22.method3577((float) (-var37) * var14 + var36);
                            if (arg1.field5443 == 0) {
                                var22.method3582(var30, var31, var32, var33);
                            } else {
                                var22.method3575(var30, var31, var32, var33);
                            }
                            var22.method3577(0.0F);
                            var22.method3577(0.0F);
                            var22.method3577((float) var37 * var15 + var34);
                            var22.method3577((float) var37 * var16 + var35);
                            var22.method3577((float) var37 * var17 + var36);
                            if (arg1.field5443 == 0) {
                                var22.method3582(var30, var31, var32, var33);
                            } else {
                                var22.method3575(var30, var31, var32, var33);
                            }
                            var22.method3577(1.0F);
                            var22.method3577(0.0F);
                            var22.method3577((float) var37 * var12 + var34);
                            var22.method3577((float) var37 * var13 + var35);
                            var22.method3577((float) var37 * var14 + var36);
                            if (arg1.field5443 == 0) {
                                var22.method3582(var30, var31, var32, var33);
                            } else {
                                var22.method3575(var30, var31, var32, var33);
                            }
                            var22.method3577(1.0F);
                            var22.method3577(1.0F);
                            var22.method3577((float) var37 * var18 + var34);
                            var22.method3577((float) var37 * var19 + var35);
                            var22.method3577((float) var37 * var20 + var36);
                            if (arg1.field5443 == 0) {
                                var22.method3582(var30, var31, var32, var33);
                            } else {
                                var22.method3575(var30, var31, var32, var33);
                            }
                            var22.method3577(0.0F);
                            var22.method3577(1.0F);
                            var4++;
                        }
                    }
                }
            }
        }
        var22.method3578();
        if (this.field4924.method740(105)) {
            arg1.method493(0, 0, this.field4924);
            arg1.method493(0, 1, this.field4920);
            arg1.method480(this.field4938, 87);
            arg1.method528(0, class73.field1094, var4 * 2, 0, var4 * 4, this.field4927, (byte) 122);
        }
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(Lrm;I)V", line = 664)
    public static final void method2124(class377 arg0, int arg1) {
        if (arg1 != 0) {
            return;
        }
        field4935++;
        if (!class361.field4805) {
            arg0.method3045(true);
            class271.field3704--;
        }
    }
}
