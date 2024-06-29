import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tu")
public class class476 {

    @OriginalMember(owner = "client!tu", name = "l", descriptor = "[I")
    private int[] field6913 = new int[8191];

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "[[Lej;")
    private class176[][] field6903 = new class176[1600][64];

    @OriginalMember(owner = "client!tu", name = "s", descriptor = "[[Lej;")
    private class176[][] field6920 = new class176[64][768];

    @OriginalMember(owner = "client!tu", name = "r", descriptor = "[I")
    private int[] field6919 = new int[64];

    @OriginalMember(owner = "client!tu", name = "u", descriptor = "[I")
    private int[] field6922 = new int[1600];

    @OriginalMember(owner = "client!tu", name = "y", descriptor = "I")
    private int field6926 = 0;

    @OriginalMember(owner = "client!tu", name = "h", descriptor = "Lfk;")
    private class313 field6909;

    @OriginalMember(owner = "client!tu", name = "i", descriptor = "Lfb;")
    private class669 field6910;

    @OriginalMember(owner = "client!tu", name = "f", descriptor = "Lfb;")
    private class669 field6907;

    @OriginalMember(owner = "client!tu", name = "j", descriptor = "Loq;")
    private class743 field6911;

    @OriginalMember(owner = "client!tu", name = "o", descriptor = "Z")
    public static boolean field6916 = false;

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "I")
    public static int field6902;

    @OriginalMember(owner = "client!tu", name = "c", descriptor = "I")
    public static int field6904;

    @OriginalMember(owner = "client!tu", name = "d", descriptor = "I")
    public static int field6905;

    @OriginalMember(owner = "client!tu", name = "e", descriptor = "I")
    public static int field6906;

    @OriginalMember(owner = "client!tu", name = "g", descriptor = "I")
    public static int field6908;

    @OriginalMember(owner = "client!tu", name = "m", descriptor = "I")
    public static int field6914;

    @OriginalMember(owner = "client!tu", name = "n", descriptor = "I")
    public static int field6915;

    @OriginalMember(owner = "client!tu", name = "p", descriptor = "I")
    public static int field6917;

    @OriginalMember(owner = "client!tu", name = "q", descriptor = "I")
    public static int field6918;

    @OriginalMember(owner = "client!tu", name = "t", descriptor = "I")
    public static int field6921;

    @OriginalMember(owner = "client!tu", name = "v", descriptor = "I")
    public static int field6923;

    @OriginalMember(owner = "client!tu", name = "w", descriptor = "I")
    public static int field6924;

    @OriginalMember(owner = "client!tu", name = "x", descriptor = "I")
    public static int field6925;

    @OriginalMember(owner = "client!tu", name = "k", descriptor = "Lla;")
    public static class422 field6912;

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(III)Z", line = 5)
    public static final boolean method2888(int arg0, int arg1, int arg2) {
        field6921++;
        return arg0 == 11149 ? class635.method3597(arg1, arg2, arg0 - 1206) & class55.method522(arg1, 2048, arg2) : true;
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(IIII)I", line = 19)
    public static final int method2889(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 > 243) {
            arg2 >>= 0x4;
        } else if (arg3 > 217) {
            arg2 >>= 0x3;
        } else if (arg3 > 192) {
            arg2 >>= 0x2;
        } else if (arg3 > 179) {
            arg2 >>= 0x1;
        }
        field6924++;
        if (arg1 != 197891498) {
            field6916 = false;
        }
        return ((arg0 & 0xFF) >> 2 << 10) + (arg2 >> 5 << 7) + (arg3 >> 1);
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(ILpj;)V", line = 49)
    private final void method2890(int arg0, class38 arg1) {
        class732.field10309 = arg1.field651;
        field6918++;
        if (arg0 != -545) {
            this.field6926 = 118;
        }
        arg1.method336(false);
        arg1.method272(false, 32);
        arg1.method394(13119, false);
        arg1.method432(5);
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(Lpj;II)V", line = 64)
    private final void method2891(class38 arg0, int arg1, int arg2) {
        field6923++;
        int var4 = 0;
        if (arg1 > -9) {
            method2896(-106, 111, 59);
        }
        class341 var5 = arg0.method398(3535);
        float var6 = var5.field5023;
        float var7 = var5.field5045;
        float var8 = var5.field5015;
        float var9 = var5.field5024;
        float var10 = var5.field5036;
        float var11 = var5.field5027;
        float var12 = var6 + var9;
        float var13 = var7 + var10;
        float var14 = var8 + var11;
        float var15 = var6 - var9;
        float var16 = var7 - var10;
        float var17 = var8 - var11;
        float var18 = var9 - var6;
        float var19 = var10 - var7;
        float var20 = var11 - var8;
        Buffer var21 = this.field6910.method692(true, -31414);
        if (var21 == null) {
            return;
        }
        Stream var22 = arg0.method368((byte) -121, var21);
        if (Stream.method2572()) {
            for (int var23 = arg2 - 1; var23 >= 0; var23--) {
                int var24 = this.field6922[var23] > 64 ? 64 : this.field6922[var23];
                if (var24 > 0) {
                    for (int var25 = var24 - 1; var25 >= 0; var25--) {
                        class176 var38 = this.field6903[var23][var25];
                        int var39 = var38.field3021;
                        byte var40 = (byte) (var39 >> 16);
                        byte var41 = (byte) (var39 >> 8);
                        byte var42 = (byte) var39;
                        byte var43 = (byte) (var39 >>> 24);
                        float var44 = (float) (var38.field3015 >> 12);
                        float var45 = (float) (var38.field3022 >> 12);
                        float var46 = (float) (var38.field3016 >> 12);
                        int var47 = var38.field3017 >> 12;
                        var22.method2576((float) (-var47) * var12 + var44);
                        var22.method2576((float) (-var47) * var13 + var45);
                        var22.method2576((float) (-var47) * var14 + var46);
                        if (arg0.field628 == 0) {
                            var22.method2582(var40, var41, var42, var43);
                        } else {
                            var22.method2586(var40, var41, var42, var43);
                        }
                        var22.method2576(0.0F);
                        var22.method2576(0.0F);
                        var22.method2576((float) var47 * var15 + var44);
                        var22.method2576((float) var47 * var16 + var45);
                        var22.method2576((float) var47 * var17 + var46);
                        if (arg0.field628 == 0) {
                            var22.method2582(var40, var41, var42, var43);
                        } else {
                            var22.method2586(var40, var41, var42, var43);
                        }
                        var22.method2576(1.0F);
                        var22.method2576(0.0F);
                        var22.method2576((float) var47 * var12 + var44);
                        var22.method2576((float) var47 * var13 + var45);
                        var22.method2576((float) var47 * var14 + var46);
                        if (arg0.field628 == 0) {
                            var22.method2582(var40, var41, var42, var43);
                        } else {
                            var22.method2586(var40, var41, var42, var43);
                        }
                        var22.method2576(1.0F);
                        var22.method2576(1.0F);
                        var22.method2576((float) var47 * var18 + var44);
                        var22.method2576((float) var47 * var19 + var45);
                        var22.method2576((float) var47 * var20 + var46);
                        if (arg0.field628 == 0) {
                            var22.method2582(var40, var41, var42, var43);
                        } else {
                            var22.method2586(var40, var41, var42, var43);
                        }
                        var22.method2576(0.0F);
                        var4++;
                        var22.method2576(1.0F);
                    }
                    if (this.field6922[var23] > 64) {
                        int var26 = this.field6922[var23] - 65;
                        for (int var27 = this.field6919[var26] - 1; var27 >= 0; var27--) {
                            class176 var28 = this.field6920[var26][var27];
                            int var29 = var28.field3021;
                            byte var30 = (byte) (var29 >> 16);
                            byte var31 = (byte) (var29 >> 8);
                            byte var32 = (byte) var29;
                            byte var33 = (byte) (var29 >>> 24);
                            float var34 = (float) (var28.field3015 >> 12);
                            float var35 = (float) (var28.field3022 >> 12);
                            float var36 = (float) (var28.field3016 >> 12);
                            int var37 = var28.field3017 >> 12;
                            var22.method2576((float) (-var37) * var12 + var34);
                            var22.method2576((float) (-var37) * var13 + var35);
                            var22.method2576((float) (-var37) * var14 + var36);
                            if (arg0.field628 == 0) {
                                var22.method2582(var30, var31, var32, var33);
                            } else {
                                var22.method2586(var30, var31, var32, var33);
                            }
                            var22.method2576(0.0F);
                            var22.method2576(0.0F);
                            var22.method2576((float) var37 * var15 + var34);
                            var22.method2576((float) var37 * var16 + var35);
                            var22.method2576((float) var37 * var17 + var36);
                            if (arg0.field628 == 0) {
                                var22.method2582(var30, var31, var32, var33);
                            } else {
                                var22.method2586(var30, var31, var32, var33);
                            }
                            var22.method2576(1.0F);
                            var22.method2576(0.0F);
                            var22.method2576((float) var37 * var12 + var34);
                            var22.method2576((float) var37 * var13 + var35);
                            var22.method2576((float) var37 * var14 + var36);
                            if (arg0.field628 == 0) {
                                var22.method2582(var30, var31, var32, var33);
                            } else {
                                var22.method2586(var30, var31, var32, var33);
                            }
                            var22.method2576(1.0F);
                            var22.method2576(1.0F);
                            var22.method2576((float) var37 * var18 + var34);
                            var22.method2576((float) var37 * var19 + var35);
                            var22.method2576((float) var37 * var20 + var36);
                            if (arg0.field628 == 0) {
                                var22.method2582(var30, var31, var32, var33);
                            } else {
                                var22.method2586(var30, var31, var32, var33);
                            }
                            var22.method2576(0.0F);
                            var4++;
                            var22.method2576(1.0F);
                        }
                    }
                }
            }
        } else {
            for (int var48 = arg2 - 1; var48 >= 0; var48--) {
                int var49 = this.field6922[var48] > 64 ? 64 : this.field6922[var48];
                if (var49 > 0) {
                    for (int var50 = var49 - 1; var50 >= 0; var50--) {
                        class176 var63 = this.field6903[var48][var50];
                        int var64 = var63.field3021;
                        byte var65 = (byte) (var64 >> 16);
                        byte var66 = (byte) (var64 >> 8);
                        byte var67 = (byte) var64;
                        byte var68 = (byte) (var64 >>> 24);
                        float var69 = (float) (var63.field3015 >> 12);
                        float var70 = (float) (var63.field3022 >> 12);
                        float var71 = (float) (var63.field3016 >> 12);
                        int var72 = var63.field3017 >> 12;
                        var22.method2579((float) (-var72) * var12 + var69);
                        var22.method2579((float) (-var72) * var13 + var70);
                        var22.method2579((float) (-var72) * var14 + var71);
                        if (arg0.field628 == 0) {
                            var22.method2582(var65, var66, var67, var68);
                        } else {
                            var22.method2586(var65, var66, var67, var68);
                        }
                        var22.method2579(0.0F);
                        var22.method2579(0.0F);
                        var22.method2579((float) var72 * var15 + var69);
                        var22.method2579((float) var72 * var16 + var70);
                        var22.method2579((float) var72 * var17 + var71);
                        if (arg0.field628 == 0) {
                            var22.method2582(var65, var66, var67, var68);
                        } else {
                            var22.method2586(var65, var66, var67, var68);
                        }
                        var22.method2579(1.0F);
                        var22.method2579(0.0F);
                        var22.method2579((float) var72 * var12 + var69);
                        var22.method2579((float) var72 * var13 + var70);
                        var22.method2579((float) var72 * var14 + var71);
                        if (arg0.field628 == 0) {
                            var22.method2582(var65, var66, var67, var68);
                        } else {
                            var22.method2586(var65, var66, var67, var68);
                        }
                        var22.method2579(1.0F);
                        var22.method2579(1.0F);
                        var22.method2579((float) var72 * var18 + var69);
                        var22.method2579((float) var72 * var19 + var70);
                        var22.method2579((float) var72 * var20 + var71);
                        if (arg0.field628 == 0) {
                            var22.method2582(var65, var66, var67, var68);
                        } else {
                            var22.method2586(var65, var66, var67, var68);
                        }
                        var22.method2579(0.0F);
                        var4++;
                        var22.method2579(1.0F);
                    }
                    if (this.field6922[var48] > 64) {
                        int var51 = this.field6922[var48] - 1 - 64;
                        for (int var52 = this.field6919[var51] - 1; var52 >= 0; var52--) {
                            class176 var53 = this.field6920[var51][var52];
                            int var54 = var53.field3021;
                            byte var55 = (byte) (var54 >> 16);
                            byte var56 = (byte) (var54 >> 8);
                            byte var57 = (byte) var54;
                            byte var58 = (byte) (var54 >>> 24);
                            float var59 = (float) (var53.field3015 >> 12);
                            float var60 = (float) (var53.field3022 >> 12);
                            float var61 = (float) (var53.field3016 >> 12);
                            int var62 = var53.field3017 >> 12;
                            var22.method2579((float) (-var62) * var12 + var59);
                            var22.method2579((float) (-var62) * var13 + var60);
                            var22.method2579((float) (-var62) * var14 + var61);
                            if (arg0.field628 == 0) {
                                var22.method2582(var55, var56, var57, var58);
                            } else {
                                var22.method2586(var55, var56, var57, var58);
                            }
                            var22.method2579(0.0F);
                            var22.method2579(0.0F);
                            var22.method2579((float) var62 * var15 + var59);
                            var22.method2579((float) var62 * var16 + var60);
                            var22.method2579((float) var62 * var17 + var61);
                            if (arg0.field628 == 0) {
                                var22.method2582(var55, var56, var57, var58);
                            } else {
                                var22.method2586(var55, var56, var57, var58);
                            }
                            var22.method2579(1.0F);
                            var22.method2579(0.0F);
                            var22.method2579((float) var62 * var12 + var59);
                            var22.method2579((float) var62 * var13 + var60);
                            var22.method2579((float) var62 * var14 + var61);
                            if (arg0.field628 == 0) {
                                var22.method2582(var55, var56, var57, var58);
                            } else {
                                var22.method2586(var55, var56, var57, var58);
                            }
                            var22.method2579(1.0F);
                            var22.method2579(1.0F);
                            var22.method2579((float) var62 * var18 + var59);
                            var22.method2579((float) var62 * var19 + var60);
                            var22.method2579((float) var62 * var20 + var61);
                            if (arg0.field628 == 0) {
                                var22.method2582(var55, var56, var57, var58);
                            } else {
                                var22.method2586(var55, var56, var57, var58);
                            }
                            var22.method2579(0.0F);
                            var22.method2579(1.0F);
                            var4++;
                        }
                    }
                }
            }
        }
        var22.method2573();
        if (this.field6910.method696(-11404)) {
            arg0.method327(this.field6910, 0, 0);
            arg0.method327(this.field6907, 0, 1);
            arg0.method330(19661, this.field6909);
            arg0.method289(var4 * 2, var4 * 4, 0, this.field6911, 0, class386.field5775, 0);
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(Z)V", line = 452)
    public final void method2892(boolean arg0) {
        this.field6910.method697(-18934);
        field6915++;
        if (arg0) {
            method2894(-117, -64, 66, 29);
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(Lpj;BI)V", line = 463)
    private final void method2893(class38 arg0, byte arg1, int arg2) {
        class732.field10309 = arg0.field651;
        field6914++;
        arg0.method386((float) arg2, (byte) -102);
        arg0.method302(Integer.MAX_VALUE);
        arg0.method272(false, 32);
        if (arg1 == -76) {
            arg0.method394(13119, false);
            arg0.method432(arg1 + 81);
        }
    }

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "(IIII)I", line = 482)
    public static final int method2894(int arg0, int arg1, int arg2, int arg3) {
        field6925++;
        int var4 = arg0 / arg3;
        int var5 = arg3 - 1 & arg0;
        int var6 = arg2 / arg3;
        int var7 = arg3 - 1 & arg2;
        int var8 = class617.method3523(1, var4, var6);
        int var9 = class617.method3523(arg1 - 26566, var4 + 1, var6);
        int var10 = class617.method3523(1, var4, var6 + 1);
        if (arg1 != 26567) {
            method2895(-44, (char) 65436);
        }
        int var11 = class617.method3523(1, var4 + 1, var6 + 1);
        int var12 = class414.method2543(var5, var9, arg3, var8, arg1 - 26692);
        int var13 = class414.method2543(var5, var11, arg3, var10, -114);
        return class414.method2543(var7, var13, arg3, var12, arg1 - 26673);
    }

    @OriginalMember(owner = "client!tu", name = "<init>", descriptor = "(Lpj;)V", line = 822)
    public class476(class38 arg0) {
        this.field6909 = arg0.method219(2, new class468[] { new class468(new class531[] { class531.field7629, class531.field7635, class531.field7637 }), new class468(class531.field7634) });
        this.field6910 = arg0.method293(true, 6);
        this.field6907 = arg0.method293(false, 6);
        this.field6907.method693(true, 393168, 12);
        this.field6911 = arg0.method428(-112, false);
        this.field6911.method924((byte) -120, 49146);
        Buffer var2 = this.field6911.method926(true, -29944);
        if (var2 != null) {
            Stream var3 = arg0.method368((byte) -121, var2);
            if (Stream.method2572()) {
                for (int var6 = 0; var6 < 8191; var6++) {
                    int var7 = var6 * 4;
                    var3.method2585(var7);
                    var3.method2585(var7 + 1);
                    var3.method2585(var7 + 2);
                    var3.method2585(var7 + 2);
                    var3.method2585(var7 + 3);
                    var3.method2585(var7);
                }
            } else {
                for (int var4 = 0; var4 < 8191; var4++) {
                    int var5 = var4 * 4;
                    var3.method2584(var5);
                    var3.method2584(var5 + 1);
                    var3.method2584(var5 + 2);
                    var3.method2584(var5 + 2);
                    var3.method2584(var5 + 3);
                    var3.method2584(var5);
                }
            }
            var3.method2573();
            this.field6911.method925((byte) 78);
        }
        Buffer var8 = this.field6907.method692(true, -31414);
        if (var8 != null) {
            Stream var9 = arg0.method368((byte) -121, var8);
            if (Stream.method2572()) {
                for (int var10 = 0; var10 < 8191; var10++) {
                    var9.method2576(0.0F);
                    var9.method2576(-1.0F);
                    var9.method2576(0.0F);
                    var9.method2576(0.0F);
                    var9.method2576(-1.0F);
                    var9.method2576(0.0F);
                    var9.method2576(0.0F);
                    var9.method2576(-1.0F);
                    var9.method2576(0.0F);
                    var9.method2576(0.0F);
                    var9.method2576(-1.0F);
                    var9.method2576(0.0F);
                }
            } else {
                for (int var11 = 0; var11 < 8191; var11++) {
                    var9.method2579(0.0F);
                    var9.method2579(-1.0F);
                    var9.method2579(0.0F);
                    var9.method2579(0.0F);
                    var9.method2579(-1.0F);
                    var9.method2579(0.0F);
                    var9.method2579(0.0F);
                    var9.method2579(-1.0F);
                    var9.method2579(0.0F);
                    var9.method2579(0.0F);
                    var9.method2579(-1.0F);
                    var9.method2579(0.0F);
                }
            }
            var9.method2573();
            this.field6907.method696(-11404);
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(IC)Z", line = 517)
    public static final boolean method2895(int arg0, char arg1) {
        field6902++;
        if (Character.isISOControl(arg1)) {
            return false;
        } else if (class223.method1578(arg0 - 30852, arg1)) {
            return true;
        } else {
            char[] var2 = class338.field4950;
            for (int var3 = arg0; var3 < var2.length; var3++) {
                char var7 = var2[var3];
                if (arg1 == var7) {
                    return true;
                }
            }
            char[] var4 = class660.field9407;
            for (int var5 = 0; var5 < var4.length; var5++) {
                char var6 = var4[var5];
                if (arg1 == var6) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "(III)Z", line = 559)
    public static final boolean method2896(int arg0, int arg1, int arg2) {
        if (arg1 != 24) {
            field6912 = null;
        }
        field6905++;
        return (arg0 & 0x18) != 0 | (arg0 & 0x220) == 544;
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(Lpj;ILmp;Z)V", line = 570)
    public final void method2897(class38 arg0, int arg1, class315 arg2, boolean arg3) {
        field6917++;
        if (arg0.field568 == null) {
            return;
        }
        if (arg1 >= 0) {
            this.method2893(arg0, (byte) -76, arg1);
        } else {
            this.method2890(-545, arg0);
        }
        if (arg3) {
            return;
        }
        float var5 = arg0.field568.field5032;
        float var6 = arg0.field568.field5029;
        float var7 = arg0.field568.field5037;
        float var8 = arg0.field568.field5048;
        try {
            int var9 = 0;
            int var10 = Integer.MAX_VALUE;
            int var11 = 0;
            class220 var12 = arg2.field4735.field3325;
            for (class220 var13 = var12.field3589; var13 != var12; var13 = var13.field3589) {
                class176 var14 = (class176) var13;
                int var15 = (int) ((float) (var14.field3016 >> 12) * var7 + (float) (var14.field3022 >> 12) * var6 + (float) (var14.field3015 >> 12) * var5 + var8);
                if (var15 > var11) {
                    var11 = var15;
                }
                this.field6913[var9++] = var15;
                if (var15 < var10) {
                    var10 = var15;
                }
            }
            int var16 = var11 - var10;
            int var17;
            if (var16 + 2 <= 1600) {
                var17 = 0;
                var16 += 2;
            } else {
                var17 = class730.method4052(var16, -83) + (1 - class431.field6299);
                var16 = (var16 >> var17) + 2;
            }
            int var18 = 0;
            class220 var19 = var12.field3589;
            int var20 = -2;
            boolean var21 = true;
            boolean var22 = true;
            while (var12 != var19) {
                this.field6926 = 0;
                for (int var23 = 0; var23 < var16; var23++) {
                    this.field6922[var23] = 0;
                }
                for (int var24 = 0; var24 < 64; var24++) {
                    this.field6919[var24] = 0;
                }
                while (var12 != var19) {
                    class176 var25 = (class176) var19;
                    if (var22) {
                        var21 = var25.field3024;
                        var22 = false;
                        var20 = var25.field3018;
                    }
                    if (var18 > 0 && (var25.field3018 != var20 || var25.field3024 != var21)) {
                        var22 = true;
                        break;
                    }
                    int var26 = this.field6913[var18++] - var10 >> var17;
                    if (var26 < 1600) {
                        if (this.field6922[var26] >= 64) {
                            label98: {
                                if (this.field6922[var26] == 64) {
                                    if (this.field6926 == 64) {
                                        break label98;
                                    }
                                    this.field6922[var26] += (this.field6926++) + 1;
                                }
                                this.field6920[this.field6922[var26] - 65][this.field6919[this.field6922[var26] - 1 - 64]++] = var25;
                            }
                        } else {
                            this.field6903[var26][this.field6922[var26]++] = var25;
                        }
                    }
                    var19 = var19.field3589;
                }
                arg0.method421(false, 15, var20 >= 0 ? var20 : -1, false);
                if (var21 && class732.field10309 != arg0.field651) {
                    arg0.method328(class732.field10309);
                } else if (arg0.field651 != 1.0F) {
                    arg0.method328(1.0F);
                }
                this.method2891(arg0, -19, var16);
            }
        } catch (Exception var27) {
        }
        this.method2900((byte) -4, arg0);
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(Lpj;I)V", line = 734)
    public final void method2898(class38 arg0, int arg1) {
        this.field6910.method693(true, arg1, 24);
        field6908++;
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(I)V", line = 746)
    public static void method2899(int arg0) {
        if (arg0 == 8191) {
            field6912 = null;
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(BLpj;)V", line = 760)
    private final void method2900(byte arg0, class38 arg1) {
        arg1.method394(arg0 + 13123, true);
        field6906++;
        if (arg0 != -4) {
            this.method2898(null, -62);
        }
        arg1.method272(true, 32);
        if (class732.field10309 != arg1.field651) {
            arg1.method328(class732.field10309);
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(IZII)V", line = 790)
    public static final void method2901(int arg0, boolean arg1, int arg2, int arg3) {
        if (class662.field9426.method3512(true, (long) arg2) == null) {
            if (class364.field5568) {
                class124 var4 = new class124(arg2, new class154(4096, class637.field8949, arg2), arg3, arg1);
                var4.field1904.method4080(class638.field8960[class467.field6804], (byte) -109);
                class662.field9426.method3516(255, (long) arg2, var4);
            } else {
                class417.method2567((byte) 47, arg2, arg1);
            }
        }
        field6904++;
        if (arg0 > -10) {
            field6912 = null;
        }
    }
}
