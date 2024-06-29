import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cw")
public class class180 {

    @OriginalMember(owner = "client!cw", name = "d", descriptor = "[[Lgi;")
    private class676[][] field2118 = new class676[1600][64];

    @OriginalMember(owner = "client!cw", name = "j", descriptor = "[[Lgi;")
    private class676[][] field2124 = new class676[64][768];

    @OriginalMember(owner = "client!cw", name = "k", descriptor = "I")
    private int field2125 = 0;

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "[I")
    private int[] field2115 = new int[64];

    @OriginalMember(owner = "client!cw", name = "i", descriptor = "[I")
    private int[] field2123 = new int[8191];

    @OriginalMember(owner = "client!cw", name = "u", descriptor = "[I")
    private int[] field2135 = new int[1600];

    @OriginalMember(owner = "client!cw", name = "b", descriptor = "Lf;")
    private class753 field2116;

    @OriginalMember(owner = "client!cw", name = "c", descriptor = "Lel;")
    private class545 field2117;

    @OriginalMember(owner = "client!cw", name = "r", descriptor = "Lel;")
    private class545 field2132;

    @OriginalMember(owner = "client!cw", name = "l", descriptor = "Lkga;")
    private class543 field2126;

    @OriginalMember(owner = "client!cw", name = "g", descriptor = "[[I")
    public static int[][] field2121 = new int[128][128];

    @OriginalMember(owner = "client!cw", name = "n", descriptor = "[Lkw;")
    public static class249[] field2128 = new class249[300];

    @OriginalMember(owner = "client!cw", name = "e", descriptor = "I")
    public static int field2119;

    @OriginalMember(owner = "client!cw", name = "f", descriptor = "I")
    public static int field2120;

    @OriginalMember(owner = "client!cw", name = "h", descriptor = "I")
    public static int field2122;

    @OriginalMember(owner = "client!cw", name = "m", descriptor = "I")
    public static int field2127;

    @OriginalMember(owner = "client!cw", name = "o", descriptor = "I")
    public static int field2129;

    @OriginalMember(owner = "client!cw", name = "p", descriptor = "I")
    public static int field2130;

    @OriginalMember(owner = "client!cw", name = "s", descriptor = "I")
    public static int field2133;

    @OriginalMember(owner = "client!cw", name = "t", descriptor = "I")
    public static int field2134;

    @OriginalMember(owner = "client!cw", name = "v", descriptor = "I")
    public static int field2136;

    @OriginalMember(owner = "client!cw", name = "w", descriptor = "I")
    public static int field2137;

    @OriginalMember(owner = "client!cw", name = "q", descriptor = "Ljava/awt/Font;")
    public static Font field2131;

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(IIBI)I")
    public static final int method1111(int arg0, int arg1, byte arg2, int arg3) {
        field2134++;
        if (arg2 <= 24) {
            field2121 = null;
        }
        if (class284.field3471 < 100) {
            return -2;
        }
        int var4 = -2;
        int var5 = Integer.MAX_VALUE;
        int var6 = arg3 - class656.field9386;
        int var7 = arg1 - class656.field9374;
        for (class191 var8 = (class191) class656.field9361.method1719(65280); var8 != null; var8 = (class191) class656.field9361.method1723(-20665)) {
            if (var8.field2252 == arg0) {
                int var9 = var8.field2251;
                int var10 = var8.field2256;
                int var11 = class656.field9374 + var10 | class656.field9386 + var9 << 14;
                int var12 = (var6 - var9) * (var6 - var9) + ((var7 - var10) * (var7 - var10));
                if (var4 < 0 || var5 > var12) {
                    var5 = var12;
                    var4 = var11;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(I)V")
    public final void method1112(int arg0) {
        field2136++;
        if (arg0 != 25847) {
            this.method1114(null, -21, -126);
        }
        this.field2117.method262(true);
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(ILln;I)V")
    private final void method1113(int arg0, class377 arg1, int arg2) {
        field2127++;
        int var4 = 0;
        class427 var5 = arg1.method2203((byte) 24);
        float var6 = var5.field6189;
        float var7 = var5.field6171;
        if (arg2 != -13) {
            field2121 = null;
        }
        float var8 = var5.field6169;
        float var9 = var5.field6167;
        float var10 = var5.field6182;
        float var11 = var5.field6195;
        float var12 = var6 + var9;
        float var13 = var7 + var10;
        float var14 = var8 + var11;
        float var15 = var6 - var9;
        float var16 = var7 - var10;
        float var17 = var8 - var11;
        float var18 = var9 - var6;
        float var19 = var10 - var7;
        float var20 = var11 - var8;
        Buffer var21 = this.field2117.method3109(true, -22228);
        if (var21 == null) {
            return;
        }
        Stream var22 = arg1.method2299(var21, 0);
        if (Stream.method3823()) {
            for (int var23 = arg0 - 1; var23 >= 0; var23--) {
                int var24 = this.field2135[var23] <= 64 ? this.field2135[var23] : 64;
                if (var24 > 0) {
                    for (int var25 = var24 - 1; var25 >= 0; var25--) {
                        class676 var38 = this.field2118[var23][var25];
                        int var39 = var38.field9576;
                        byte var40 = (byte) (var39 >> 16);
                        byte var41 = (byte) (var39 >> 8);
                        byte var42 = (byte) var39;
                        byte var43 = (byte) (var39 >>> 24);
                        float var44 = (float) (var38.field9573 >> 12);
                        float var45 = (float) (var38.field9578 >> 12);
                        float var46 = (float) (var38.field9571 >> 12);
                        int var47 = var38.field9566 >> 12;
                        var22.method3810((float) (-var47) * var12 + var44);
                        var22.method3810((float) (-var47) * var13 + var45);
                        var22.method3810((float) (-var47) * var14 + var46);
                        if (arg1.field5074 == 0) {
                            var22.method3812(var40, var41, var42, var43);
                        } else {
                            var22.method3819(var40, var41, var42, var43);
                        }
                        var22.method3810(0.0F);
                        var22.method3810(0.0F);
                        var22.method3810((float) var47 * var15 + var44);
                        var22.method3810((float) var47 * var16 + var45);
                        var22.method3810((float) var47 * var17 + var46);
                        if (arg1.field5074 == 0) {
                            var22.method3812(var40, var41, var42, var43);
                        } else {
                            var22.method3819(var40, var41, var42, var43);
                        }
                        var22.method3810(1.0F);
                        var22.method3810(0.0F);
                        var22.method3810((float) var47 * var12 + var44);
                        var22.method3810((float) var47 * var13 + var45);
                        var22.method3810((float) var47 * var14 + var46);
                        if (arg1.field5074 == 0) {
                            var22.method3812(var40, var41, var42, var43);
                        } else {
                            var22.method3819(var40, var41, var42, var43);
                        }
                        var22.method3810(1.0F);
                        var22.method3810(1.0F);
                        var22.method3810((float) var47 * var18 + var44);
                        var22.method3810((float) var47 * var19 + var45);
                        var22.method3810((float) var47 * var20 + var46);
                        if (arg1.field5074 == 0) {
                            var22.method3812(var40, var41, var42, var43);
                        } else {
                            var22.method3819(var40, var41, var42, var43);
                        }
                        var22.method3810(0.0F);
                        var4++;
                        var22.method3810(1.0F);
                    }
                    if (this.field2135[var23] > 64) {
                        int var26 = this.field2135[var23] - 65;
                        for (int var27 = this.field2115[var26] - 1; var27 >= 0; var27--) {
                            class676 var28 = this.field2124[var26][var27];
                            int var29 = var28.field9576;
                            byte var30 = (byte) (var29 >> 16);
                            byte var31 = (byte) (var29 >> 8);
                            byte var32 = (byte) var29;
                            byte var33 = (byte) (var29 >>> 24);
                            float var34 = (float) (var28.field9573 >> 12);
                            float var35 = (float) (var28.field9578 >> 12);
                            float var36 = (float) (var28.field9571 >> 12);
                            int var37 = var28.field9566 >> 12;
                            var22.method3810((float) (-var37) * var12 + var34);
                            var22.method3810((float) (-var37) * var13 + var35);
                            var22.method3810((float) (-var37) * var14 + var36);
                            if (arg1.field5074 == 0) {
                                var22.method3812(var30, var31, var32, var33);
                            } else {
                                var22.method3819(var30, var31, var32, var33);
                            }
                            var22.method3810(0.0F);
                            var22.method3810(0.0F);
                            var22.method3810((float) var37 * var15 + var34);
                            var22.method3810((float) var37 * var16 + var35);
                            var22.method3810((float) var37 * var17 + var36);
                            if (arg1.field5074 == 0) {
                                var22.method3812(var30, var31, var32, var33);
                            } else {
                                var22.method3819(var30, var31, var32, var33);
                            }
                            var22.method3810(1.0F);
                            var22.method3810(0.0F);
                            var22.method3810((float) var37 * var12 + var34);
                            var22.method3810((float) var37 * var13 + var35);
                            var22.method3810((float) var37 * var14 + var36);
                            if (arg1.field5074 == 0) {
                                var22.method3812(var30, var31, var32, var33);
                            } else {
                                var22.method3819(var30, var31, var32, var33);
                            }
                            var22.method3810(1.0F);
                            var22.method3810(1.0F);
                            var22.method3810((float) var37 * var18 + var34);
                            var22.method3810((float) var37 * var19 + var35);
                            var22.method3810((float) var37 * var20 + var36);
                            if (arg1.field5074 == 0) {
                                var22.method3812(var30, var31, var32, var33);
                            } else {
                                var22.method3819(var30, var31, var32, var33);
                            }
                            var22.method3810(0.0F);
                            var22.method3810(1.0F);
                            var4++;
                        }
                    }
                }
            }
        } else {
            for (int var48 = arg0 - 1; var48 >= 0; var48--) {
                int var49 = this.field2135[var48] <= 64 ? this.field2135[var48] : 64;
                if (var49 > 0) {
                    for (int var50 = var49 - 1; var50 >= 0; var50--) {
                        class676 var63 = this.field2118[var48][var50];
                        int var64 = var63.field9576;
                        byte var65 = (byte) (var64 >> 16);
                        byte var66 = (byte) (var64 >> 8);
                        byte var67 = (byte) var64;
                        byte var68 = (byte) (var64 >>> 24);
                        float var69 = (float) (var63.field9573 >> 12);
                        float var70 = (float) (var63.field9578 >> 12);
                        float var71 = (float) (var63.field9571 >> 12);
                        int var72 = var63.field9566 >> 12;
                        var22.method3815((float) (-var72) * var12 + var69);
                        var22.method3815((float) (-var72) * var13 + var70);
                        var22.method3815((float) (-var72) * var14 + var71);
                        if (arg1.field5074 == 0) {
                            var22.method3812(var65, var66, var67, var68);
                        } else {
                            var22.method3819(var65, var66, var67, var68);
                        }
                        var22.method3815(0.0F);
                        var22.method3815(0.0F);
                        var22.method3815((float) var72 * var15 + var69);
                        var22.method3815((float) var72 * var16 + var70);
                        var22.method3815((float) var72 * var17 + var71);
                        if (arg1.field5074 == 0) {
                            var22.method3812(var65, var66, var67, var68);
                        } else {
                            var22.method3819(var65, var66, var67, var68);
                        }
                        var22.method3815(1.0F);
                        var22.method3815(0.0F);
                        var22.method3815((float) var72 * var12 + var69);
                        var22.method3815((float) var72 * var13 + var70);
                        var22.method3815((float) var72 * var14 + var71);
                        if (arg1.field5074 == 0) {
                            var22.method3812(var65, var66, var67, var68);
                        } else {
                            var22.method3819(var65, var66, var67, var68);
                        }
                        var22.method3815(1.0F);
                        var22.method3815(1.0F);
                        var22.method3815((float) var72 * var18 + var69);
                        var22.method3815((float) var72 * var19 + var70);
                        var22.method3815((float) var72 * var20 + var71);
                        if (arg1.field5074 == 0) {
                            var22.method3812(var65, var66, var67, var68);
                        } else {
                            var22.method3819(var65, var66, var67, var68);
                        }
                        var22.method3815(0.0F);
                        var22.method3815(1.0F);
                        var4++;
                    }
                    if (this.field2135[var48] > 64) {
                        int var51 = this.field2135[var48] - 64 - 1;
                        for (int var52 = this.field2115[var51] - 1; var52 >= 0; var52--) {
                            class676 var53 = this.field2124[var51][var52];
                            int var54 = var53.field9576;
                            byte var55 = (byte) (var54 >> 16);
                            byte var56 = (byte) (var54 >> 8);
                            byte var57 = (byte) var54;
                            byte var58 = (byte) (var54 >>> 24);
                            float var59 = (float) (var53.field9573 >> 12);
                            float var60 = (float) (var53.field9578 >> 12);
                            float var61 = (float) (var53.field9571 >> 12);
                            int var62 = var53.field9566 >> 12;
                            var22.method3815((float) (-var62) * var12 + var59);
                            var22.method3815((float) (-var62) * var13 + var60);
                            var22.method3815((float) (-var62) * var14 + var61);
                            if (arg1.field5074 == 0) {
                                var22.method3812(var55, var56, var57, var58);
                            } else {
                                var22.method3819(var55, var56, var57, var58);
                            }
                            var22.method3815(0.0F);
                            var22.method3815(0.0F);
                            var22.method3815((float) var62 * var15 + var59);
                            var22.method3815((float) var62 * var16 + var60);
                            var22.method3815((float) var62 * var17 + var61);
                            if (arg1.field5074 == 0) {
                                var22.method3812(var55, var56, var57, var58);
                            } else {
                                var22.method3819(var55, var56, var57, var58);
                            }
                            var22.method3815(1.0F);
                            var22.method3815(0.0F);
                            var22.method3815((float) var62 * var12 + var59);
                            var22.method3815((float) var62 * var13 + var60);
                            var22.method3815((float) var62 * var14 + var61);
                            if (arg1.field5074 == 0) {
                                var22.method3812(var55, var56, var57, var58);
                            } else {
                                var22.method3819(var55, var56, var57, var58);
                            }
                            var22.method3815(1.0F);
                            var22.method3815(1.0F);
                            var22.method3815((float) var62 * var18 + var59);
                            var22.method3815((float) var62 * var19 + var60);
                            var22.method3815((float) var62 * var20 + var61);
                            if (arg1.field5074 == 0) {
                                var22.method3812(var55, var56, var57, var58);
                            } else {
                                var22.method3819(var55, var56, var57, var58);
                            }
                            var22.method3815(0.0F);
                            var22.method3815(1.0F);
                            var4++;
                        }
                    }
                }
            }
        }
        var22.method3821();
        if (this.field2117.method3107((byte) 106)) {
            arg1.method2301(true, this.field2117, 0);
            arg1.method2301(true, this.field2132, 1);
            arg1.method2285(1, this.field2116);
            arg1.method2295(class178.field2092, -102, this.field2126, 0, var4 * 2, 0, var4 * 4);
        }
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(Lln;II)V")
    private final void method1114(class377 arg0, int arg1, int arg2) {
        class182.field2147 = arg0.field5116;
        if (arg2 <= 7) {
            this.field2116 = null;
        }
        field2130++;
        arg0.method2212(3, (float) arg1);
        arg0.method2218((byte) -52);
        arg0.method2245(false, -105);
        arg0.method2234(false, 0);
        arg0.method2294(true);
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(B)I")
    public static final int method1115(byte arg0) {
        field2129++;
        if (arg0 >= -50) {
            return 58;
        }
        if (class344.field4474 == null) {
            if (!class149.field1652 && class10.field74 != null) {
                return class10.field74.field9268;
            }
            int var1 = class353.field4537.method694((byte) -112);
            int var2 = class353.field4537.method691((byte) -106);
            if (class260.field3231) {
                if (class655.field9351 < var1 && var1 < (class655.field9351 + class236.field2806)) {
                    int var10 = -1;
                    for (int var11 = 0; var11 < class736.field10289; var11++) {
                        if (class644.field9214) {
                            int var16 = class183.field2187 + (var11 * 16) + 33;
                            if (var2 > var16 - 13 && (var16 + 3) >= var2) {
                                var10 = var11;
                            }
                        } else {
                            int var15 = var11 * 16 + class183.field2187 + 31;
                            if (var2 > var15 - 13 && var2 <= (var15 + 3)) {
                                var10 = var11;
                            }
                        }
                    }
                    if (var10 != -1) {
                        int var12 = 0;
                        class11 var13 = new class11(class331.field4291);
                        for (class177 var14 = (class177) var13.method46((byte) -84); var14 != null; var14 = (class177) var13.method49((byte) -28)) {
                            if ((var12++) == var10) {
                                if (var14.field2078 == 1) {
                                    return ((class649) var14.field2081.field4488.field8923).field9268;
                                }
                                return -1;
                            }
                        }
                    }
                } else if (class336.field4322 != null && class330.field4283 < var1 && var1 < (class750.field10484 + class330.field4283)) {
                    int var17 = -1;
                    for (int var18 = 0; var18 < class336.field4322.field2078; var18++) {
                        if (class644.field9214) {
                            int var22 = class210.field2484 - (-(var18 * 16) - 33);
                            if (var2 > var22 - 13 && var2 <= (var22 + 3)) {
                                var17 = var18;
                            }
                        } else {
                            int var23 = class210.field2484 - (-(var18 * 16) - 31);
                            if (var23 - 13 < var2 && var2 <= var23 + 3) {
                                var17 = var18;
                            }
                        }
                    }
                    if (var17 != -1) {
                        int var19 = 0;
                        class11 var20 = new class11(class336.field4322.field2081);
                        for (class649 var21 = (class649) var20.method46((byte) -112); var21 != null; var21 = (class649) var20.method49((byte) -101)) {
                            if (var19++ == var17) {
                                return var21.field9268;
                            }
                        }
                    }
                }
            } else if (class655.field9351 < var1 && var1 < (class655.field9351 + class236.field2806)) {
                int var3 = -1;
                for (int var4 = 0; var4 < class343.field4449; var4++) {
                    if (class644.field9214) {
                        int var9 = (class343.field4449 - var4 - 1) * 16 + class183.field2187 + 33;
                        if ((var9 - 13) < var2 && var2 <= (var9 + 3)) {
                            var3 = var4;
                        }
                    } else {
                        int var8 = (class343.field4449 - var4 - 1) * 16 + (class183.field2187 + 31);
                        if (var2 > var8 - 13 && var8 + 3 >= var2) {
                            var3 = var4;
                        }
                    }
                }
                if (var3 != -1) {
                    int var5 = 0;
                    class522 var6 = new class522(class265.field3289);
                    for (class649 var7 = (class649) var6.method3068(25561); var7 != null; var7 = (class649) var6.method3070(true)) {
                        if (var3 == var5++) {
                            return var7.field9268;
                        }
                    }
                }
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(Lpca;ZILln;)V")
    public final void method1116(class713 arg0, boolean arg1, int arg2, class377 arg3) {
        field2119++;
        if (arg3.field5051 == null) {
            return;
        }
        if (arg2 >= 0) {
            this.method1114(arg3, arg2, 36);
        } else {
            this.method1118(false, arg3);
        }
        float var5 = arg3.field5051.field6200;
        float var6 = arg3.field5051.field6213;
        float var7 = arg3.field5051.field6192;
        float var8 = arg3.field5051.field6204;
        try {
            int var9 = 0;
            int var10 = Integer.MAX_VALUE;
            int var11 = 0;
            class562 var12 = arg0.field10032.field2044;
            for (class562 var13 = var12.field8004; var13 != var12; var13 = var13.field8004) {
                class676 var14 = (class676) var13;
                int var15 = (int) ((float) (var14.field9571 >> 12) * var7 + (float) (var14.field9578 >> 12) * var6 + (float) (var14.field9573 >> 12) * var5 + var8);
                this.field2123[var9++] = var15;
                if (var10 > var15) {
                    var10 = var15;
                }
                if (var15 > var11) {
                    var11 = var15;
                }
            }
            int var16 = var11 - var10;
            int var17;
            if (var16 + 2 <= 1600) {
                var16 += 2;
                var17 = 0;
            } else {
                var17 = class544.method3197(var16, (byte) -112) + 1 - class33.field362;
                var16 = (var16 >> var17) + 2;
            }
            class562 var18 = var12.field8004;
            int var19 = 0;
            int var20 = -2;
            boolean var21 = arg1;
            boolean var22 = true;
            while (var12 != var18) {
                this.field2125 = 0;
                for (int var23 = 0; var23 < var16; var23++) {
                    this.field2135[var23] = 0;
                }
                for (int var24 = 0; var24 < 64; var24++) {
                    this.field2115[var24] = 0;
                }
                while (var12 != var18) {
                    class676 var25 = (class676) var18;
                    if (var22) {
                        var21 = var25.field9574;
                        var20 = var25.field9569;
                        var22 = false;
                    }
                    if (var19 > 0 && (var25.field9569 != var20 || var25.field9574 != var21)) {
                        var22 = true;
                        break;
                    }
                    int var26 = this.field2123[var19++] - var10 >> var17;
                    if (var26 < 1600) {
                        if (this.field2135[var26] < 64) {
                            this.field2118[var26][this.field2135[var26]++] = var25;
                        } else {
                            label102: {
                                if (this.field2135[var26] == 64) {
                                    if (this.field2125 == 64) {
                                        break label102;
                                    }
                                    this.field2135[var26] += this.field2125++ + 1;
                                }
                                this.field2124[this.field2135[var26] - 64 - 1][this.field2115[this.field2135[var26] - 64 - 1]++] = var25;
                            }
                        }
                    }
                    var18 = var18.field8004;
                }
                arg3.method2275(false, false, (byte) 24, var20 >= 0 ? var20 : -1);
                if (var21 && class182.field2147 != arg3.field5116) {
                    arg3.method360(class182.field2147);
                } else if (arg3.field5116 != 1.0F) {
                    arg3.method360(1.0F);
                }
                this.method1113(var16, arg3, -13);
            }
        } catch (Exception var27) {
        }
        this.method1119(arg3, (byte) -99);
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(BI)V")
    public static final void method1117(byte arg0, int arg1) {
        field2122++;
        if (class428.field6217 == arg1) {
            return;
        }
        class489.field6976 = class153.field1677 = class123.field1300[arg1];
        class374.method2182((byte) 11);
        class140.field1582 = new int[class489.field6976][class153.field1677];
        class366.field4673 = new int[4][class489.field6976 >> 3][class153.field1677 >> 3];
        class620.field8883 = new int[class489.field6976][class153.field1677];
        for (int var2 = 0; var2 < 4; var2++) {
            class205.field2430[var2] = class397.method2437(-1, class153.field1677, class489.field6976);
        }
        class637.field9155 = new byte[4][class489.field6976][class153.field1677];
        class717.method4000(class489.field6976, (byte) -57, class153.field1677, 4);
        if (arg0 >= -22) {
            method1121(-98);
        }
        class714.method3991(class489.field6976 >> 3, (byte) -86, class153.field1677 >> 3, class275.field3370);
        class428.field6217 = arg1;
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(ZLln;)V")
    private final void method1118(boolean arg0, class377 arg1) {
        field2133++;
        class182.field2147 = arg1.field5116;
        arg1.method2256(1);
        arg1.method2245(false, -97);
        arg1.method2234(arg0, 0);
        arg1.method2294(true);
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(Lln;B)V")
    private final void method1119(class377 arg0, byte arg1) {
        arg0.method2234(true, 0);
        if (arg1 != -99) {
            this.field2124 = null;
        }
        field2120++;
        arg0.method2245(true, 110);
        if (class182.field2147 != arg0.field5116) {
            arg0.method360(class182.field2147);
        }
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(BLln;)V")
    public final void method1120(byte arg0, class377 arg1) {
        if (arg0 <= -116) {
            this.field2117.method3110(2501, 24, 786336);
            field2137++;
        }
    }

    @OriginalMember(owner = "client!cw", name = "<init>", descriptor = "(Lln;)V")
    public class180(class377 arg0) {
        this.field2116 = arg0.method2312(new class231[] { new class231(new class467[] { class467.field6679, class467.field6683, class467.field6685 }), new class231(class467.field6682) }, 0);
        this.field2117 = arg0.method2306(true, 0);
        this.field2132 = arg0.method2306(false, 0);
        this.field2132.method3110(2501, 12, 393168);
        this.field2126 = arg0.method2235(false, 9);
        this.field2126.method267(30903, 49146);
        Buffer var2 = this.field2126.method263(13931, true);
        if (var2 != null) {
            Stream var3 = arg0.method2299(var2, 0);
            if (Stream.method3823()) {
                for (int var4 = 0; var4 < 8191; var4++) {
                    int var5 = var4 * 4;
                    var3.method3820(var5);
                    var3.method3820(var5 + 1);
                    var3.method3820(var5 + 2);
                    var3.method3820(var5 + 2);
                    var3.method3820(var5 + 3);
                    var3.method3820(var5);
                }
            } else {
                for (int var6 = 0; var6 < 8191; var6++) {
                    int var7 = var6 * 4;
                    var3.method3816(var7);
                    var3.method3816(var7 + 1);
                    var3.method3816(var7 + 2);
                    var3.method3816(var7 + 2);
                    var3.method3816(var7 + 3);
                    var3.method3816(var7);
                }
            }
            var3.method3821();
            this.field2126.method266(-19067);
        }
        Buffer var8 = this.field2132.method3109(true, -22228);
        if (var8 != null) {
            Stream var9 = arg0.method2299(var8, 0);
            if (Stream.method3823()) {
                for (int var11 = 0; var11 < 8191; var11++) {
                    var9.method3810(0.0F);
                    var9.method3810(-1.0F);
                    var9.method3810(0.0F);
                    var9.method3810(0.0F);
                    var9.method3810(-1.0F);
                    var9.method3810(0.0F);
                    var9.method3810(0.0F);
                    var9.method3810(-1.0F);
                    var9.method3810(0.0F);
                    var9.method3810(0.0F);
                    var9.method3810(-1.0F);
                    var9.method3810(0.0F);
                }
            } else {
                for (int var10 = 0; var10 < 8191; var10++) {
                    var9.method3815(0.0F);
                    var9.method3815(-1.0F);
                    var9.method3815(0.0F);
                    var9.method3815(0.0F);
                    var9.method3815(-1.0F);
                    var9.method3815(0.0F);
                    var9.method3815(0.0F);
                    var9.method3815(-1.0F);
                    var9.method3815(0.0F);
                    var9.method3815(0.0F);
                    var9.method3815(-1.0F);
                    var9.method3815(0.0F);
                }
            }
            var9.method3821();
            this.field2132.method3107((byte) 78);
        }
    }

    @OriginalMember(owner = "client!cw", name = "b", descriptor = "(I)V")
    public static void method1121(int arg0) {
        if (arg0 == -20526) {
            field2121 = null;
            field2128 = null;
            field2131 = null;
        }
    }
}
