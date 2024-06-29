import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class154 {

    @OriginalMember(owner = "client!mh", name = "f", descriptor = "[I")
    private int[] field2135;

    @OriginalMember(owner = "client!mh", name = "u", descriptor = "[I")
    private int[] field2150;

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "I")
    public static int field2131 = 0;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "I")
    public static int field2130 = 0;

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "[Lai;")
    public static class88[] field2133 = new class88[2048];

    @OriginalMember(owner = "client!mh", name = "g", descriptor = "I")
    public static int field2136 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!mh", name = "w", descriptor = "I")
    public static int field2152 = -1;

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "I")
    public static int field2132;

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "I")
    public static int field2134;

    @OriginalMember(owner = "client!mh", name = "i", descriptor = "I")
    private int field2138;

    @OriginalMember(owner = "client!mh", name = "j", descriptor = "I")
    public static int field2139;

    @OriginalMember(owner = "client!mh", name = "k", descriptor = "I")
    public static int field2140;

    @OriginalMember(owner = "client!mh", name = "l", descriptor = "I")
    public static int field2141;

    @OriginalMember(owner = "client!mh", name = "n", descriptor = "I")
    private int field2143;

    @OriginalMember(owner = "client!mh", name = "o", descriptor = "I")
    public static int field2144;

    @OriginalMember(owner = "client!mh", name = "p", descriptor = "I")
    public static int field2145;

    @OriginalMember(owner = "client!mh", name = "q", descriptor = "I")
    public static int field2146;

    @OriginalMember(owner = "client!mh", name = "r", descriptor = "I")
    public static int field2147;

    @OriginalMember(owner = "client!mh", name = "s", descriptor = "I")
    private int field2148;

    @OriginalMember(owner = "client!mh", name = "t", descriptor = "I")
    private int field2149;

    @OriginalMember(owner = "client!mh", name = "v", descriptor = "I")
    public static int field2151;

    @OriginalMember(owner = "client!mh", name = "h", descriptor = "Lhc;")
    public static class235 field2137;

    @OriginalMember(owner = "client!mh", name = "m", descriptor = "[[B")
    public static byte[][] field2142;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Z)V")
    public static final void method1020(boolean arg0) {
        class265.field3973 = null;
        class34.field528 = null;
        if (!arg0) {
            field2142 = null;
        }
        class198.field2758 = null;
        field2145++;
        class9.field80 = null;
        class34.field530 = null;
        class69.field940 = null;
        class264.field3966 = null;
        class82.field1120 = null;
        client.field2180 = null;
        class247.field3788 = null;
        class184.field2553 = null;
        class285.field4471 = null;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(I[BIZILjava/lang/String;)I")
    public static final int method1021(int arg0, byte[] arg1, int arg2, boolean arg3, int arg4, String arg5) {
        int var6 = arg4 - arg2;
        field2140++;
        int var7 = 0;
        if (arg3) {
            method1025(-11, false, (class211) null);
        }
        while (var6 > var7) {
            char var8 = arg5.charAt(arg2 + var7);
            if (var8 > '\u0000' && var8 < '\u0080' || var8 >= ' ' && var8 <= 'ÿ') {
                arg1[arg0 + var7] = (byte) var8;
            } else if (var8 == '€') {
                arg1[arg0 + var7] = -128;
            } else if (var8 == '‚') {
                arg1[arg0 + var7] = -126;
            } else if (var8 == 'ƒ') {
                arg1[arg0 + var7] = -125;
            } else if (var8 == '„') {
                arg1[arg0 + var7] = -124;
            } else if (var8 == '…') {
                arg1[arg0 + var7] = -123;
            } else if (var8 == '†') {
                arg1[arg0 + var7] = -122;
            } else if (var8 == '‡') {
                arg1[arg0 + var7] = -121;
            } else if (var8 == 'ˆ') {
                arg1[arg0 + var7] = -120;
            } else if (var8 == '‰') {
                arg1[arg0 + var7] = -119;
            } else if (var8 == 'Š') {
                arg1[arg0 + var7] = -118;
            } else if (var8 == '‹') {
                arg1[arg0 + var7] = -117;
            } else if (var8 == 'Œ') {
                arg1[arg0 + var7] = -116;
            } else if (var8 == 'Ž') {
                arg1[arg0 + var7] = -114;
            } else if (var8 == '‘') {
                arg1[arg0 + var7] = -111;
            } else if (var8 == '’') {
                arg1[arg0 + var7] = -110;
            } else if (var8 == '“') {
                arg1[arg0 + var7] = -109;
            } else if (var8 == '”') {
                arg1[arg0 + var7] = -108;
            } else if (var8 == '•') {
                arg1[arg0 + var7] = -107;
            } else if (var8 == '–') {
                arg1[arg0 + var7] = -106;
            } else if (var8 == '—') {
                arg1[arg0 + var7] = -105;
            } else if (var8 == '˜') {
                arg1[arg0 + var7] = -104;
            } else if (var8 == '™') {
                arg1[arg0 + var7] = -103;
            } else if (var8 == 'š') {
                arg1[arg0 + var7] = -102;
            } else if (var8 == '›') {
                arg1[arg0 + var7] = -101;
            } else if (var8 == 'œ') {
                arg1[arg0 + var7] = -100;
            } else if (var8 == 'ž') {
                arg1[arg0 + var7] = -98;
            } else if (var8 == 'Ÿ') {
                arg1[arg0 + var7] = -97;
            } else {
                arg1[arg0 + var7] = 63;
            }
            var7++;
        }
        return var6;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(I)V")
    private final void method1022(int arg0) {
        this.field2143 += ++this.field2148;
        if (arg0 != -10004) {
            this.method1023((byte) 17);
        }
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field2135[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field2138 ^= this.field2138 << 13;
                } else {
                    this.field2138 ^= this.field2138 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field2138 ^= this.field2138 << 2;
            } else {
                this.field2138 ^= this.field2138 >>> 16;
            }
            this.field2138 += this.field2135[var2 + 128 & 0xFF];
            int var4;
            this.field2135[var2] = var4 = this.field2143 + this.field2138 + this.field2135[class235.method1572(255, var3 >> 2)];
            this.field2150[var2] = this.field2143 = this.field2135[class235.method1572(1020, var4 >> 8) >> 2] + var3;
        }
        field2147++;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(B)I")
    public final int method1023(byte arg0) {
        if (arg0 > -43) {
            method1029(87, 1, -116, 116);
        }
        field2132++;
        if (this.field2149-- == 0) {
            this.method1022(-10004);
            this.field2149 = 255;
        }
        return this.field2150[this.field2149];
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(I)V")
    private final void method1024(int arg0) {
        field2139++;
        int var2 = -1640531527;
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;
        int var9 = -1640531527;
        for (int var10 = 0; var10 < 4; var10++) {
            int var61 = var9 ^ var8 << 11;
            int var62 = var6 + var61;
            int var63 = var7 + var8;
            int var64 = var63 ^ var7 >>> 2;
            int var65 = var7 + var62;
            int var66 = var5 + var64;
            int var67 = var65 ^ var62 << 8;
            int var68 = var4 + var67;
            int var69 = var62 + var66;
            var6 = var69 ^ var66 >>> 16;
            int var70 = var66 + var68;
            int var71 = var3 + var6;
            var5 = var70 ^ var68 << 10;
            int var72 = var2 + var5;
            int var73 = var68 + var71;
            var4 = var73 ^ var71 >>> 4;
            int var74 = var4 + var61;
            int var75 = var71 + var72;
            var3 = var75 ^ var72 << 8;
            int var76 = var72 + var74;
            var8 = var3 + var64;
            var2 = var76 ^ var74 >>> 9;
            var9 = var8 + var74;
            var7 = var2 + var67;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field2150[var11 + 5] + var4;
            int var38 = this.field2150[var11] + var9;
            int var39 = this.field2150[var11 + 7] + var2;
            int var40 = this.field2150[var11 + 2] + var7;
            int var41 = this.field2150[var11 + 4] + var5;
            int var42 = this.field2150[var11 + 1] + var8;
            int var43 = this.field2150[var11 + 6] + var3;
            int var44 = this.field2150[var11 + 3] + var6;
            int var45 = var38 ^ var42 << 11;
            int var46 = var40 + var42;
            int var47 = var46 ^ var40 >>> 2;
            int var48 = var41 + var47;
            int var49 = var44 + var45;
            int var50 = var40 + var49;
            int var51 = var50 ^ var49 << 8;
            int var52 = var48 + var49;
            int var53 = var37 + var51;
            var6 = var52 ^ var48 >>> 16;
            int var54 = var48 + var53;
            int var55 = var6 + var43;
            var5 = var54 ^ var53 << 10;
            int var56 = var53 + var55;
            int var57 = var5 + var39;
            var4 = var56 ^ var55 >>> 4;
            int var58 = var55 + var57;
            var3 = var58 ^ var57 << 8;
            int var59 = var4 + var45;
            var8 = var3 + var47;
            int var60 = var57 + var59;
            var2 = var60 ^ var59 >>> 9;
            var9 = var8 + var59;
            var7 = var2 + var51;
            this.field2135[var11] = var9;
            this.field2135[var11 + 1] = var8;
            this.field2135[var11 + 2] = var7;
            this.field2135[var11 + 3] = var6;
            this.field2135[var11 + 4] = var5;
            this.field2135[var11 + 5] = var4;
            this.field2135[var11 + 6] = var3;
            this.field2135[var11 + 7] = var2;
        }
        int var12 = 0;
        if (arg0 != 128) {
            this.method1024(-120);
        }
        while (var12 < 256) {
            int var13 = this.field2135[var12 + 5] + var4;
            int var14 = this.field2135[var12 + 6] + var3;
            int var15 = this.field2135[var12 + 3] + var6;
            int var16 = this.field2135[var12] + var9;
            int var17 = this.field2135[var12 + 7] + var2;
            int var18 = this.field2135[var12 + 1] + var8;
            int var19 = this.field2135[var12 + 2] + var7;
            int var20 = var16 ^ var18 << 11;
            int var21 = var15 + var20;
            int var22 = var18 + var19;
            int var23 = var22 ^ var19 >>> 2;
            int var24 = var19 + var21;
            int var25 = this.field2135[var12 + 4] + var5;
            int var26 = var23 + var25;
            int var27 = var24 ^ var21 << 8;
            int var28 = var13 + var27;
            int var29 = var21 + var26;
            var6 = var29 ^ var26 >>> 16;
            int var30 = var6 + var14;
            int var31 = var26 + var28;
            var5 = var31 ^ var28 << 10;
            int var32 = var28 + var30;
            var4 = var32 ^ var30 >>> 4;
            int var33 = var4 + var20;
            int var34 = var5 + var17;
            int var35 = var30 + var34;
            var3 = var35 ^ var34 << 8;
            int var36 = var33 + var34;
            var2 = var36 ^ var33 >>> 9;
            var7 = var2 + var27;
            var8 = var3 + var23;
            var9 = var8 + var33;
            this.field2135[var12] = var9;
            this.field2135[var12 + 1] = var8;
            this.field2135[var12 + 2] = var7;
            this.field2135[var12 + 3] = var6;
            this.field2135[var12 + 4] = var5;
            this.field2135[var12 + 5] = var4;
            this.field2135[var12 + 6] = var3;
            this.field2135[var12 + 7] = var2;
            var12 += 8;
        }
        this.method1022(-10004);
        this.field2149 = 256;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IZLse;)V")
    public static final void method1025(int arg0, boolean arg1, class211 arg2) {
        int var3 = 104 / ((-arg0 - 20) / 42);
        int var4 = arg2.field3165 == 0 ? arg2.field3112 : arg2.field3165;
        field2134++;
        int var5 = arg2.field3146 == 0 ? arg2.field3166 : arg2.field3146;
        class42.method282(var5, arg2.field3093, (byte) 102, class158.field2208[arg2.field3093 >> 16], var4, arg1);
        if (arg2.field3180 != null) {
            class42.method282(var5, arg2.field3093, (byte) 33, arg2.field3180, var4, arg1);
        }
        class56 var6 = (class56) class289.field4559.method23(216, (long) arg2.field3093);
        if (var6 != null) {
            class240.method1607(var6.field808, arg1, var5, -113, var4);
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(II)Ljava/lang/String;")
    public static final String method1026(int arg0, int arg1) {
        field2141++;
        if (arg1 != 0) {
            field2136 = 5;
        }
        return arg0 < 999999999 ? Integer.toString(arg0) : "*";
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(Z)V")
    public static void method1027(boolean arg0) {
        if (!arg0) {
            method1029(-53, -34, -126, 45);
        }
        field2142 = null;
        field2137 = null;
        field2133 = null;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(I[IIII)V")
    public static final void method1028(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var8 = arg4 - 1;
        int var5 = var8 - 7;
        field2144++;
        arg3--;
        while (var5 > arg3) {
            int var6 = arg3 + 1;
            arg1[var6] = arg2;
            int var7 = var6 + 1;
            arg1[var7] = arg2;
            int var9 = var7 + 1;
            arg1[var9] = arg2;
            int var10 = var9 + 1;
            arg1[var10] = arg2;
            int var11 = var10 + 1;
            arg1[var11] = arg2;
            int var12 = var11 + 1;
            arg1[var12] = arg2;
            int var13 = var12 + 1;
            arg1[var13] = arg2;
            arg3 = var13 + 1;
            arg1[arg3] = arg2;
        }
        while (var8 > arg3) {
            arg3++;
            arg1[arg3] = arg2;
        }
        if (arg0 != -353) {
            method1020(true);
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIII)Z")
    public static final boolean method1029(int arg0, int arg1, int arg2, int arg3) {
        if (!class239.method1600(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << 7;
        int var5 = arg2 << 7;
        int var6 = class200.field2788[arg0][arg1][arg2] - 1;
        int var7 = var6 - 120;
        int var8 = var6 - 230;
        int var9 = var6 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var4 > class124.field1745) {
                    if (!class36.method242(var4, var6, var5)) {
                        return false;
                    }
                    if (!class36.method242(var4, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class36.method242(var4, var7, var5)) {
                        return false;
                    }
                    if (!class36.method242(var4, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class36.method242(var4, var8, var5)) {
                    return false;
                }
                if (!class36.method242(var4, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 2) {
                if (var5 < class65.field889) {
                    if (!class36.method242(var4, var6, var5 + 128)) {
                        return false;
                    }
                    if (!class36.method242(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class36.method242(var4, var7, var5 + 128)) {
                        return false;
                    }
                    if (!class36.method242(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class36.method242(var4, var8, var5 + 128)) {
                    return false;
                }
                if (!class36.method242(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 4) {
                if (var4 < class124.field1745) {
                    if (!class36.method242(var4 + 128, var6, var5)) {
                        return false;
                    }
                    if (!class36.method242(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class36.method242(var4 + 128, var7, var5)) {
                        return false;
                    }
                    if (!class36.method242(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class36.method242(var4 + 128, var8, var5)) {
                    return false;
                }
                if (!class36.method242(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 8) {
                if (var5 > class65.field889) {
                    if (!class36.method242(var4, var6, var5)) {
                        return false;
                    }
                    if (!class36.method242(var4 + 128, var6, var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class36.method242(var4, var7, var5)) {
                        return false;
                    }
                    if (!class36.method242(var4 + 128, var7, var5)) {
                        return false;
                    }
                }
                if (!class36.method242(var4, var8, var5)) {
                    return false;
                }
                if (!class36.method242(var4 + 128, var8, var5)) {
                    return false;
                }
                return true;
            }
        }
        if (!class36.method242(var4 + 64, var9, var5 + 64)) {
            return false;
        } else if (arg3 == 16) {
            return class36.method242(var4, var8, var5 + 128);
        } else if (arg3 == 32) {
            return class36.method242(var4 + 128, var8, var5 + 128);
        } else if (arg3 == 64) {
            return class36.method242(var4 + 128, var8, var5);
        } else if (arg3 == 128) {
            return class36.method242(var4, var8, var5);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!mh", name = "<init>", descriptor = "()V")
    private class154() {
    }

    @OriginalMember(owner = "client!mh", name = "<init>", descriptor = "([I)V")
    public class154(int[] arg0) {
        this.field2135 = new int[256];
        this.field2150 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field2150[var2] = arg0[var2];
        }
        this.method1024(128);
    }
}
