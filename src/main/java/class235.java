import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nt")
public class class235 {

    @OriginalMember(owner = "client!nt", name = "j", descriptor = "Lew;")
    private class520 field3181;

    @OriginalMember(owner = "client!nt", name = "f", descriptor = "Lai;")
    private class626 field3177;

    @OriginalMember(owner = "client!nt", name = "i", descriptor = "I")
    public int field3180;

    @OriginalMember(owner = "client!nt", name = "b", descriptor = "I")
    private int field3173;

    @OriginalMember(owner = "client!nt", name = "g", descriptor = "I")
    private int field3178;

    @OriginalMember(owner = "client!nt", name = "p", descriptor = "[B")
    public byte[] field3187;

    @OriginalMember(owner = "client!nt", name = "d", descriptor = "I")
    private int field3175;

    @OriginalMember(owner = "client!nt", name = "u", descriptor = "I")
    private int field3192;

    @OriginalMember(owner = "client!nt", name = "c", descriptor = "Lwt;")
    public static class330 field3174 = new class330();

    @OriginalMember(owner = "client!nt", name = "t", descriptor = "I")
    public static int field3191 = 0;

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "I")
    public static int field3172;

    @OriginalMember(owner = "client!nt", name = "e", descriptor = "I")
    public static int field3176;

    @OriginalMember(owner = "client!nt", name = "k", descriptor = "I")
    public static int field3182;

    @OriginalMember(owner = "client!nt", name = "l", descriptor = "I")
    public static int field3183;

    @OriginalMember(owner = "client!nt", name = "m", descriptor = "I")
    public static int field3184;

    @OriginalMember(owner = "client!nt", name = "n", descriptor = "I")
    public static int field3185;

    @OriginalMember(owner = "client!nt", name = "o", descriptor = "I")
    public static int field3186;

    @OriginalMember(owner = "client!nt", name = "q", descriptor = "I")
    public static int field3188;

    @OriginalMember(owner = "client!nt", name = "r", descriptor = "I")
    public static int field3189;

    @OriginalMember(owner = "client!nt", name = "s", descriptor = "Lu;")
    public static class80 field3190;

    @OriginalMember(owner = "client!nt", name = "h", descriptor = "[[Lhp;")
    private class348[][] field3179;

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(I)V")
    public final void method1521(int arg0) {
        this.field3179 = new class348[this.field3175][this.field3192];
        field3186++;
        for (int var2 = 0; var2 < this.field3192; var2++) {
            for (int var4 = 0; var4 < this.field3175; var4++) {
                this.field3179[var4][var2] = new class348(this.field3177, this, this.field3181, var4, var2, this.field3178, var4 * 128 + 1, var2 * 128 - -1);
                if (this.field3179[var4][var2].field5115 == 0) {
                    this.field3179[var4][var2] = null;
                }
            }
        }
        int var3 = 40 / ((arg0 + 53) / 32);
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(B)V")
    public static void method1522(byte arg0) {
        field3190 = null;
        field3174 = null;
        int var1 = -82 / ((-arg0 - 37) / 59);
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(IIIII)V")
    private final void method1523(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3183++;
        if (this.field3179 == null) {
            return;
        }
        int var6 = arg3 - 1 >> 7;
        if (arg4 != 28004) {
            method1525(96, -101, -112, 37, -32, -123, (byte) 68, 105, -93);
        }
        int var7 = arg3 - (1 - arg2) - 1 >> 7;
        int var8 = arg0 - 1 >> 7;
        int var9 = arg0 + arg1 - 2 >> 7;
        for (int var10 = var6; var10 <= var7; var10++) {
            class348[] var11 = this.field3179[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                if (var11[var12] != null) {
                    var11[var12].field5111 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(IIILr;)V")
    public final void method1524(int arg0, int arg1, int arg2, class195 arg3) {
        field3184++;
        class558 var5 = (class558) arg3;
        int var6 = var5.field7510 + arg2 + 1;
        int var7 = var5.field7508 + arg1 + 1;
        int var8 = var7 + (this.field3180 * var6);
        int var9 = 0;
        int var10 = var5.field7509;
        int var11 = var5.field7513;
        int var12 = this.field3180 - var11;
        if (var6 <= 0) {
            int var13 = 1 - var6;
            var6 = 1;
            var8 += this.field3180 * var13;
            var10 -= var13;
            var9 += var11 * var13;
        }
        int var14 = 0;
        if (this.field3173 <= (var6 + var10)) {
            int var15 = var6 + var10 + 1 - this.field3173;
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var9 += var16;
            var7 = 1;
            var8 += var16;
            var11 -= var16;
            var12 += var16;
            var14 += var16;
        }
        if ((var7 + var11) >= this.field3180) {
            int var17 = var7 + var11 + 1 - this.field3180;
            var11 -= var17;
            var12 += var17;
            var14 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            int var18 = -70 % ((arg0 + 5) / 55);
            class281.method1813(var10, true, this.field3187, var11, var8, var9, var5.field7515, var14, var12);
            this.method1523(var6, var10, var11, var7, 28004);
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(IIIIIIBII)V")
    public static final void method1525(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8) {
        class517.field7061[class135.field1988++] = new class723(arg4, arg7, arg8, arg2, arg2, arg8, arg1, arg0, arg0, arg1, arg5, arg5, arg3, arg3);
        field3188++;
        int var9 = -61 % ((arg6 - 21) / 42);
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(BZII[[ZI)V")
    public final void method1526(byte arg0, boolean arg1, int arg2, int arg3, boolean[][] arg4, int arg5) {
        field3182++;
        this.field3177.method3472((byte) -68, false);
        this.field3177.method3500((byte) -24, false);
        this.field3177.method3460(0, 1);
        if (arg0 < 125) {
            method1525(67, -116, 2, 89, 114, -43, (byte) -103, -101, 68);
        }
        this.field3177.method3503((byte) -127, 1);
        this.field3177.method3502(false, -2, false, (byte) -112);
        float var7 = 1.0F / (float) (this.field3177.field8720 * 128);
        if (arg1) {
            for (int var26 = 0; var26 < this.field3192; var26++) {
                int var27 = var26 << this.field3178;
                int var28 = var26 + 1 << this.field3178;
                label94: for (int var29 = 0; var29 < this.field3175; var29++) {
                    if (this.field3179[var29][var26] != null) {
                        int var30 = var29 << this.field3178;
                        int var31 = var29 + 1 << this.field3178;
                        for (int var32 = var30; var32 < var31; var32++) {
                            if (var32 - arg3 >= -arg5 && arg5 >= (var32 - arg3)) {
                                for (int var33 = var27; var33 < var28; var33++) {
                                    if (-arg5 <= var33 - arg2 && arg5 >= var33 - arg2 && arg4[arg5 + var32 - arg3][var33 + arg5 - arg2]) {
                                        class754 var34 = this.field3177.method3506((byte) -117);
                                        var34.method4197((byte) -97, var7, 1.0F, var7);
                                        var34.method970(-var29, -var26, 0);
                                        this.field3177.method3471(114, class413.field5937);
                                        this.field3179[var29][var26].method2200((byte) 8);
                                        continue label94;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field3192; var8++) {
                int var9 = var8 << this.field3178;
                int var10 = var8 + 1 << this.field3178;
                for (int var11 = 0; var11 < this.field3175; var11++) {
                    class348 var12 = this.field3179[var11][var8];
                    if (var12 != null) {
                        class427 var13 = this.field3177.method3492((byte) 31, var12.field5115 * 3);
                        Buffer var14 = var13.method2613(true, 3754);
                        if (var14 != null) {
                            Stream var15 = this.field3177.method3445(9, var14);
                            int var16 = 0;
                            int var17 = var11 << this.field3178;
                            int var18 = var11 + 1 << this.field3178;
                            for (int var19 = var9; var19 < var10; var19++) {
                                if ((-arg5) <= (var19 - arg2) && arg5 >= (var19 - arg2)) {
                                    int var21 = this.field3181.field4301 * var19 + var17;
                                    for (int var22 = var17; var22 < var18; var22++) {
                                        if ((var22 - arg3) >= (-arg5) && (var22 - arg3) <= arg5 && arg4[var22 + arg5 - arg3][arg5 + var19 - arg2]) {
                                            short[] var23 = this.field3181.field7119[var21];
                                            if (var23 != null) {
                                                if (Stream.method3926()) {
                                                    for (int var25 = 0; var25 < var23.length; var25++) {
                                                        var15.method3918(var23[var25] & 0xFFFF);
                                                        var16++;
                                                    }
                                                } else {
                                                    for (int var24 = 0; var24 < var23.length; var24++) {
                                                        var16++;
                                                        var15.method3921(var23[var24] & 0xFFFF);
                                                    }
                                                }
                                            }
                                        }
                                        var21++;
                                    }
                                }
                            }
                            var15.method3922();
                            if (var13.method2611(26937) && var16 > 0) {
                                class754 var20 = this.field3177.method3506((byte) -107);
                                var20.method4197((byte) -122, var7, 1.0F, var7);
                                var20.method970(-var11, -var8, 0);
                                this.field3177.method3471(59, class413.field5937);
                                var12.method2198(var13, false, var16 / 3);
                            }
                        }
                    }
                }
            }
        }
        this.field3177.method3504((byte) -57);
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(ILr;ZI)V")
    public final void method1527(int arg0, class195 arg1, boolean arg2, int arg3) {
        field3176++;
        class558 var5 = (class558) arg1;
        int var6 = var5.field7508 + arg3 + 1;
        int var7 = var5.field7510 + arg0 + 1;
        if (!arg2) {
            method1525(-113, -50, -27, -36, 109, 46, (byte) 123, 101, -96);
        }
        int var8 = var6 + (this.field3180 * var7);
        int var9 = 0;
        int var10 = var5.field7509;
        int var11 = var5.field7513;
        int var12 = this.field3180 - var11;
        int var13 = 0;
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var10 -= var14;
            var8 += this.field3180 * var14;
            var9 += var11 * var14;
            var7 = 1;
        }
        if (this.field3173 <= (var7 + var10)) {
            int var15 = var10 + var7 + 1 - this.field3173;
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var8 += var16;
            var6 = 1;
            var9 += var16;
            var12 += var16;
            var11 -= var16;
            var13 += var16;
        }
        if (var6 + var11 >= this.field3180) {
            int var17 = var6 + var11 + 1 - this.field3180;
            var12 += var17;
            var11 -= var17;
            var13 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class662.method3658(var5.field7515, var12, var13, this.field3187, var8, var11, var9, var10, false);
            this.method1523(var7, var10, var11, var6, 28004);
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(Ltja;I)V")
    public static final void method1528(class288 arg0, int arg1) {
        field3172++;
        if (class688.field9674 == arg0) {
            int var2 = class89.field1233.method2398(-1372747256);
            int var3 = var2 >> 2;
            int var4 = var2 & 0x3;
            int var5 = class332.field4810[var3];
            int var6 = class89.field1233.method2381(-116);
            int var7 = ((var6 & 0x7D) >> 4) + class438.field6170;
            int var8 = (var6 & 0x7) + class13.field214;
            if (class684.method3804(25757, class184.field2474) || var7 >= 0 && var8 >= 0 && var7 < class597.field8132 && class628.field8800 > var8) {
                class718.method4011(var3, class146.field2072, var4, 2899, -1, var8, var7, var5);
            }
        } else if (class676.field9477 == arg0) {
            int var9 = class89.field1233.method2398(-1372747256);
            int var10 = (var9 >> 4 & 0x7) + class438.field6170;
            int var11 = (var9 & 0x7) + class13.field214;
            int var12 = class89.field1233.method2359(-1);
            if (var12 == 65535) {
                var12 = -1;
            }
            int var13 = class89.field1233.method2398(-1372747256);
            int var14 = (var13 & 0xFE) >> 4;
            int var15 = var13 & 0x7;
            int var16 = class89.field1233.method2398(-1372747256);
            int var17 = class89.field1233.method2398(-1372747256);
            int var18 = class89.field1233.method2359(-1);
            if (var10 >= 0 && var11 >= 0 && class597.field8132 > var10 && class628.field8800 > var11) {
                int var19 = var14 + 1;
                if (class551.field7456.field1890[0] >= var10 - var19 && (var10 + var19) >= class551.field7456.field1890[0] && class551.field7456.field1884[0] >= (var11 - var19) && class551.field7456.field1884[0] <= var11 + var19) {
                    class422.method2595(var17, var15, 50, var16, var12, (var10 << 16) + (class146.field2072 << 24) + (var11 << 8) + var14, var18, false);
                }
            }
        } else if (class582.field7780 == arg0) {
            int var20 = class89.field1233.method2381(-110);
            int var21 = class13.field214 + (var20 & 0x7);
            int var22 = class230.field3147 + var21;
            int var23 = ((var20 & 0x7E) >> 4) + class438.field6170;
            int var24 = class121.field1765 + var23;
            int var25 = class89.field1233.method2410(65280);
            class193 var26 = (class193) class558.field7516.method3953((long) (var24 | class146.field2072 << 28 | var22 << 14), 14);
            if (var26 != null) {
                for (class309 var27 = (class309) var26.field2590.method2551((byte) -108); var27 != null; var27 = (class309) var26.field2590.method2542(-117)) {
                    if ((var25 & 0x7FFF) == var27.field4453) {
                        var27.method792((byte) -102);
                        break;
                    }
                }
                if (var26.field2590.method2540(false)) {
                    var26.method792((byte) -117);
                }
                if (var23 >= 0 && var21 >= 0 && class597.field8132 > var23 && class628.field8800 > var21) {
                    class27.method201(127, var21, class146.field2072, var23);
                }
            }
        } else if (class83.field1174 == arg0) {
            int var28 = class89.field1233.method2398(-1372747256);
            int var29 = (var28 & 0x7) + class13.field214;
            int var30 = var29 + class230.field3147;
            int var31 = ((var28 & 0x7A) >> 4) + class438.field6170;
            int var32 = class121.field1765 + var31;
            int var33 = class89.field1233.method2359(-1);
            int var34 = class89.field1233.method2359(-1);
            int var35 = class89.field1233.method2359(-1);
            if (class558.field7516 != null) {
                class193 var36 = (class193) class558.field7516.method3953((long) (var32 | var30 << 14 | class146.field2072 << 28), 14);
                if (var36 != null) {
                    for (class309 var37 = (class309) var36.field2590.method2551((byte) -108); var37 != null; var37 = (class309) var36.field2590.method2542(-96)) {
                        if ((var33 & 0x7FFF) == var37.field4453 && var37.field4455 == var34) {
                            var37.method792((byte) -108);
                            var37.field4455 = var35;
                            class8.method61(var30, class146.field2072, var37, -1, var32);
                            break;
                        }
                    }
                    if (var31 >= 0 && var29 >= 0 && var31 < class597.field8132 && var29 < class628.field8800) {
                        class27.method201(123, var29, class146.field2072, var31);
                    }
                }
            }
        } else if (class600.field8162 == arg0) {
            int var38 = class89.field1233.method2410(65280);
            int var39 = class89.field1233.method2405(-361);
            int var40 = class89.field1233.method2381(-45);
            int var41 = class13.field214 + (var40 & 0x7);
            int var42 = class230.field3147 + var41;
            int var43 = (var40 >> 4 & 0x7) + class438.field6170;
            int var44 = class121.field1765 + var43;
            boolean var45 = var43 >= 0 && var41 >= 0 && var43 < class597.field8132 && class628.field8800 > var41;
            if (var45 || class684.method3804(25757, class184.field2474)) {
                class8.method61(var42, class146.field2072, new class309(var38, var39), -1, var44);
                if (var45) {
                    class27.method201(118, var41, class146.field2072, var43);
                }
            }
        } else {
            if (arg1 <= 34) {
                field3191 = -64;
            }
            if (class686.field9644 == arg0) {
                int var46 = class89.field1233.method2398(-1372747256);
                int var47 = ((var46 & 0xFF) >> 4) + class438.field6170 * 2;
                int var48 = (var46 & 0xF) + class13.field214 * 2;
                int var49 = class89.field1233.method2398(-1372747256);
                boolean var50 = (var49 & 0x1) != 0;
                boolean var51 = (var49 & 0x2) != 0;
                int var52 = var51 ? var49 >> 2 : -1;
                int var53 = var47 + class89.field1233.method2387((byte) -86);
                int var54 = class89.field1233.method2387((byte) 49) + var48;
                int var55 = class89.field1233.method2355(3);
                int var56 = class89.field1233.method2355(3);
                int var57 = class89.field1233.method2359(-1);
                int var58 = class89.field1233.method2398(-1372747256);
                int var59;
                if (var51) {
                    var59 = (byte) var58;
                } else {
                    var59 = var58 * 4;
                }
                int var60 = class89.field1233.method2398(-1372747256) * 4;
                int var61 = class89.field1233.method2359(-1);
                int var62 = class89.field1233.method2359(-1);
                int var63 = class89.field1233.method2398(-1372747256);
                if (var63 == 255) {
                    var63 = -1;
                }
                int var64 = class89.field1233.method2359(-1);
                if (var47 >= 0 && var48 >= 0 && class597.field8132 * 2 > var47 && var48 < (class597.field8132 * 2) && var53 >= 0 && var54 >= 0 && var53 < class628.field8800 * 2 && class628.field8800 * 2 > var54 && var57 != 65535) {
                    int var65 = var48 * 256;
                    int var66 = var47 * 256;
                    int var67 = var60 << 2;
                    int var68 = var64 << 2;
                    int var69 = var53 * 256;
                    int var70 = var54 * 256;
                    int var71 = var59 << 2;
                    if (var55 != 0 && var52 != -1) {
                        class124 var72 = null;
                        if (var55 >= 0) {
                            int var73 = var55 - 1;
                            class174 var74 = (class174) class234.field3169.method3953((long) var73, 14);
                            if (var74 != null) {
                                var72 = var74.field2336;
                            }
                        } else {
                            int var75 = -var55 - 1;
                            if (class363.field5292 == var75) {
                                var72 = class551.field7456;
                            } else {
                                var72 = class599.field8149[var75];
                            }
                        }
                        if (var72 != null) {
                            class208 var76 = var72.method1014((byte) -34);
                            if (var76.field2718 != null && var76.field2718[var52] != null) {
                                var71 -= var76.field2718[var52][1];
                            }
                            if (var76.field2767 != null && var76.field2767[var52] != null) {
                                var71 -= var76.field2767[var52][1];
                            }
                        }
                    }
                    class31 var77 = new class31(var57, class146.field2072, class146.field2072, var66, var65, var71, class100.field1401 + var61, class100.field1401 + var62, var63, var68, var55, var56, var67, var50, var52);
                    var77.method221(class100.field1401 + var61, (byte) -4, var69, class783.method4338(class146.field2072, var69, -12040, var70) - var67, var70);
                    class765.field10575.method2545(-127, new class385(var77));
                }
            } else if (class164.field2218 == arg0) {
                int var78 = class89.field1233.method2398(-1372747256);
                int var79 = (var78 >> 4 & 0x7) + class438.field6170;
                int var80 = class13.field214 + (var78 & 0x7);
                int var81 = class89.field1233.method2375((byte) 31);
                int var82 = var81 >> 2;
                int var83 = var81 & 0x3;
                int var84 = class332.field4810[var82];
                int var85 = class89.field1233.method2359(-1);
                if (var85 == 65535) {
                    var85 = -1;
                }
                class194.method1334(var80, var82, (byte) -8, var84, var83, class146.field2072, var79, var85);
            } else if (class140.field2049 == arg0) {
                int var86 = class89.field1233.method2398(-1372747256);
                int var87 = ((var86 & 0x72) >> 4) + class438.field6170;
                int var88 = (var86 & 0x7) + class13.field214;
                int var89 = class89.field1233.method2359(-1);
                int var90 = class89.field1233.method2398(-1372747256);
                int var91 = class89.field1233.method2359(-1);
                int var92 = class89.field1233.method2398(-1372747256);
                if (var87 >= 0 && var88 >= 0 && class597.field8132 > var87 && var88 < class628.field8800) {
                    int var93 = var87 * 512 + 256;
                    int var94 = var88 * 512 + 256;
                    int var95 = class146.field2072;
                    if (var95 < 3 && class74.method661(var87, var88, 1)) {
                        var95++;
                    }
                    class657 var96 = new class657(var89, var91, class100.field1401, class146.field2072, var95, var93, class783.method4338(class146.field2072, var93, -12040, var94) - var90, var94, var87, var87, var88, var88, var92);
                    class229.field3116.method2545(-126, new class744(var96));
                }
            } else if (class59.field815 == arg0) {
                int var97 = class89.field1233.method2398(-1372747256);
                boolean var98 = (var97 & 0x80) != 0;
                int var99 = ((var97 & 0x3D) >> 3) + class438.field6170;
                int var100 = (var97 & 0x7) + class13.field214;
                int var101 = class89.field1233.method2387((byte) 120) + var99;
                int var102 = var100 + class89.field1233.method2387((byte) -110);
                int var103 = class89.field1233.method2355(3);
                int var104 = class89.field1233.method2359(-1);
                int var105 = class89.field1233.method2398(-1372747256) * 4;
                int var106 = class89.field1233.method2398(-1372747256) * 4;
                int var107 = class89.field1233.method2359(-1);
                int var108 = class89.field1233.method2359(-1);
                int var109 = class89.field1233.method2398(-1372747256);
                if (var109 == 255) {
                    var109 = -1;
                }
                int var110 = class89.field1233.method2359(-1);
                if (var99 >= 0 && var100 >= 0 && var99 < class597.field8132 && var100 < class628.field8800 && var101 >= 0 && var102 >= 0 && class597.field8132 > var101 && class628.field8800 > var102 && var104 != 65535) {
                    int var111 = var102 * 512 + 256;
                    int var112 = var105 << 2;
                    int var113 = var101 * 512 + 256;
                    int var114 = var106 << 2;
                    int var115 = var100 * 512 + 256;
                    int var116 = var99 * 512 + 256;
                    int var117 = var110 << 2;
                    class31 var118 = new class31(var104, class146.field2072, class146.field2072, var116, var115, var112, class100.field1401 + var107, class100.field1401 + var108, var109, var117, 0, var103, var114, var98, -1);
                    var118.method221(class100.field1401 + var107, (byte) -4, var113, class783.method4338(class146.field2072, var113, -12040, var111) - var114, var111);
                    class765.field10575.method2545(-128, new class385(var118));
                }
            } else if (class195.field2609 == arg0) {
                int var119 = class89.field1233.method2358((byte) -30);
                int var120 = class89.field1233.method2358((byte) -30);
                int var121 = class89.field1233.method2381(-85);
                int var122 = (var121 & 0x7) + class13.field214;
                int var123 = class230.field3147 + var122;
                int var124 = (var121 >> 4 & 0x7) + class438.field6170;
                int var125 = class121.field1765 + var124;
                int var126 = class89.field1233.method2358((byte) -30);
                if (class363.field5292 != var126) {
                    boolean var127 = var124 >= 0 && var122 >= 0 && class597.field8132 > var124 && var122 < class628.field8800;
                    if (var127 || class684.method3804(25757, class184.field2474)) {
                        class8.method61(var123, class146.field2072, new class309(var120, var119), -1, var125);
                        if (var127) {
                            class27.method201(125, var122, class146.field2072, var124);
                        }
                    }
                }
            } else if (class69.field963 == arg0) {
                int var128 = class89.field1233.method2398(-1372747256);
                int var129 = var128 >> 2;
                int var130 = class332.field4810[var129];
                int var131 = class89.field1233.method2359(-1);
                class589 var132 = class350.field5132.method3732((byte) 55, var131);
                int var133 = class89.field1233.method2375((byte) 31);
                int var134 = class89.field1233.method2381(-34);
                int var135 = (var134 >> 4 & 0x7) + class438.field6170;
                int var136 = (var134 & 0x7) + class13.field214;
                if (var129 == 11) {
                    var129 = 10;
                }
                int var137 = 0;
                if (var132.field7919 != null) {
                    int var138 = -1;
                    for (int var139 = 0; var139 < var132.field7919.length; var139++) {
                        if (var132.field7919[var139] == var129) {
                            var138 = var139;
                            break;
                        }
                    }
                    var137 = var132.field7906[var138].length;
                }
                int var140 = 0;
                if (var132.field7898 != null) {
                    var140 = var132.field7898.length;
                }
                int var141 = 0;
                if (var132.field7879 != null) {
                    var141 = var132.field7879.length;
                }
                if ((var133 & 0x1) == 1) {
                    class445.method2672(var136, var135, null, 9288, var130, class146.field2072);
                } else {
                    int[] var142 = null;
                    if ((var133 & 0x2) == 2) {
                        var142 = new int[var137];
                        for (int var143 = 0; var143 < var137; var143++) {
                            var142[var143] = class89.field1233.method2359(-1);
                        }
                    }
                    short[] var144 = null;
                    if ((var133 & 0x4) == 4) {
                        var144 = new short[var140];
                        for (int var145 = 0; var145 < var140; var145++) {
                            var144[var145] = (short) class89.field1233.method2359(-1);
                        }
                    }
                    short[] var146 = null;
                    if ((var133 & 0x8) == 8) {
                        var146 = new short[var141];
                        for (int var147 = 0; var147 < var141; var147++) {
                            var146[var147] = (short) class89.field1233.method2359(-1);
                        }
                    }
                    class445.method2672(var136, var135, new class596((long) (class533.field7259++), var142, var144, var146), 9288, var130, class146.field2072);
                }
            } else if (class419.field6013 == arg0) {
                class89.field1233.method2398(-1372747256);
                int var148 = class89.field1233.method2398(-1372747256);
                int var149 = ((var148 & 0x7A) >> 4) + class438.field6170;
                int var150 = (var148 & 0x7) + class13.field214;
                int var151 = class89.field1233.method2359(-1);
                int var152 = class89.field1233.method2398(-1372747256);
                int var153 = class89.field1233.method2373(1223262424);
                String var154 = class89.field1233.method2379((byte) 85);
                class90.method725(var151, class146.field2072, var149, false, var150, var152, var153, var154);
            } else if (class389.field5665 == arg0) {
                int var155 = class89.field1233.method2398(-1372747256);
                int var156 = (var155 >> 4 & 0x7) + class438.field6170;
                int var157 = (var155 & 0x7) + class13.field214;
                int var158 = class89.field1233.method2359(-1);
                if (var158 == 65535) {
                    var158 = -1;
                }
                int var159 = class89.field1233.method2398(-1372747256);
                int var160 = (var159 & 0xF0) >> 4;
                int var161 = var159 & 0x7;
                int var162 = class89.field1233.method2398(-1372747256);
                int var163 = class89.field1233.method2398(-1372747256);
                int var164 = class89.field1233.method2359(-1);
                if (var156 >= 0 && var157 >= 0 && class597.field8132 > var156 && class628.field8800 > var157) {
                    int var165 = var160 + 1;
                    if (class551.field7456.field1890[0] >= (var156 - var165) && class551.field7456.field1890[0] <= (var156 + var165) && class551.field7456.field1884[0] >= var157 - var165 && (var157 + var165) >= class551.field7456.field1884[0]) {
                        class82.method688(var161, var163, var164, var162, true, (class146.field2072 << 24) + (var156 << 16) + var160 + (var157 << 8), var158);
                    }
                }
            } else if (class132.field1950 == arg0) {
                int var166 = class89.field1233.method2412(-98);
                int var167 = (var166 >> 4 & 0x7) + class438.field6170;
                int var168 = (var166 & 0x7) + class13.field214;
                int var169 = class89.field1233.method2405(-361);
                int var170 = class89.field1233.method2412(-104);
                int var171 = var170 >> 2;
                int var172 = var170 & 0x3;
                int var173 = class332.field4810[var171];
                if (class684.method3804(25757, class184.field2474) || var167 >= 0 && var168 >= 0 && var167 < class597.field8132 && class628.field8800 > var168) {
                    class718.method4011(var171, class146.field2072, var172, 2899, var169, var168, var167, var173);
                }
            } else if (class39.field628 == arg0) {
                int var174 = class89.field1233.method2359(-1);
                int var175 = class89.field1233.method2398(-1372747256);
                class350.field5132.method3732((byte) 113, var174).method3292(0, var175);
            } else {
                class664.method3681((byte) 98, "T3 - " + arg0, null);
                class631.method3541(48, false);
            }
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(IILr;I)Z")
    public final boolean method1529(int arg0, int arg1, class195 arg2, int arg3) {
        field3185++;
        class558 var5 = (class558) arg2;
        int var6 = var5.field7508 + arg0 + 1;
        int var7 = var5.field7510 + arg1 + 1;
        int var8 = this.field3180 * var7 + var6;
        if (arg3 < 117) {
            return true;
        }
        int var9 = var5.field7509;
        int var10 = var5.field7513;
        int var11 = this.field3180 - var10;
        if (var7 <= 0) {
            int var12 = 1 - var7;
            var7 = 1;
            var8 += this.field3180 * var12;
            var9 -= var12;
        }
        if (this.field3173 <= (var7 + var9)) {
            int var13 = var7 + var9 + 1 - this.field3173;
            var9 -= var13;
        }
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var11 += var14;
            var10 -= var14;
            var6 = 1;
            var8 += var14;
        }
        if (this.field3180 <= (var6 + var10)) {
            int var15 = var6 - this.field3180 - (-var10 + -1);
            var10 -= var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            byte var16 = 8;
            int var17 = (var16 - 1) * this.field3180 + var11;
            return class433.method2628(var10, var9, var16, var17, var8, 31292, this.field3187);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!nt", name = "<init>", descriptor = "(Lai;Lew;)V")
    public class235(class626 arg0, class520 arg1) {
        this.field3181 = arg1;
        this.field3177 = arg0;
        this.field3180 = (this.field3181.field4301 * this.field3181.field4295 >> this.field3177.field8643) + 2;
        this.field3173 = (this.field3181.field4300 * this.field3181.field4295 >> this.field3177.field8643) + 2;
        this.field3178 = this.field3177.field8643 + 7 - this.field3181.field4297;
        this.field3187 = new byte[this.field3180 * this.field3173];
        this.field3175 = this.field3181.field4301 >> this.field3178;
        this.field3192 = this.field3181.field4300 >> this.field3178;
    }
}
