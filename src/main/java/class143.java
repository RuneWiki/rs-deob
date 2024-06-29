import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class143 {

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "[I")
    private int[] field3377 = new int[256];

    @OriginalMember(owner = "client!ue", name = "m", descriptor = "[I")
    private int[] field3387 = new int[256];

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "Lgd;")
    public static class46 field3380 = new class46(100);

    @OriginalMember(owner = "client!ue", name = "o", descriptor = "Laf;")
    private static class7 field3389 = class48.method406(40, " ");

    @OriginalMember(owner = "client!ue", name = "j", descriptor = "Laf;")
    public static class7 field3384 = field3389;

    @OriginalMember(owner = "client!ue", name = "l", descriptor = "Lgd;")
    public static class46 field3386 = new class46(64);

    @OriginalMember(owner = "client!ue", name = "u", descriptor = "I")
    public static int field3395 = 0;

    @OriginalMember(owner = "client!ue", name = "t", descriptor = "I")
    public static volatile int field3394 = 0;

    @OriginalMember(owner = "client!ue", name = "s", descriptor = "I")
    public static int field3393 = 0;

    @OriginalMember(owner = "client!ue", name = "x", descriptor = "Z")
    public static volatile boolean field3398 = true;

    @OriginalMember(owner = "client!ue", name = "w", descriptor = "B")
    public static byte field3397 = 0;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "I")
    public static int field3375;

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "I")
    public static int field3376;

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "I")
    public static int field3378;

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "I")
    private int field3379;

    @OriginalMember(owner = "client!ue", name = "g", descriptor = "I")
    public static int field3381;

    @OriginalMember(owner = "client!ue", name = "h", descriptor = "I")
    public static int field3382;

    @OriginalMember(owner = "client!ue", name = "i", descriptor = "I")
    private int field3383;

    @OriginalMember(owner = "client!ue", name = "k", descriptor = "I")
    private int field3385;

    @OriginalMember(owner = "client!ue", name = "n", descriptor = "I")
    public static int field3388;

    @OriginalMember(owner = "client!ue", name = "p", descriptor = "I")
    private int field3390;

    @OriginalMember(owner = "client!ue", name = "q", descriptor = "I")
    public static int field3391;

    @OriginalMember(owner = "client!ue", name = "r", descriptor = "I")
    public static int field3392;

    @OriginalMember(owner = "client!ue", name = "v", descriptor = "I")
    public static int field3396;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)V")
    private final void method1160(int arg0) {
        field3375++;
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
            int var62 = var7 + var8;
            int var63 = var62 ^ var7 >>> 2;
            int var64 = var5 + var63;
            int var65 = var6 + var61;
            int var66 = var7 + var65;
            int var67 = var66 ^ var65 << 8;
            int var68 = var4 + var67;
            int var69 = var64 + var65;
            var6 = var69 ^ var64 >>> 16;
            int var70 = var3 + var6;
            int var71 = var64 + var68;
            var5 = var71 ^ var68 << 10;
            int var72 = var2 + var5;
            int var73 = var68 + var70;
            var4 = var73 ^ var70 >>> 4;
            int var74 = var4 + var61;
            int var75 = var70 + var72;
            var3 = var75 ^ var72 << 8;
            int var76 = var72 + var74;
            var2 = var76 ^ var74 >>> 9;
            var8 = var3 + var63;
            var7 = var2 + var67;
            var9 = var8 + var74;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field3377[var11 + 1] + var8;
            int var38 = this.field3377[var11 + 6] + var3;
            int var39 = this.field3377[var11 + 5] + var4;
            int var40 = this.field3377[var11] + var9;
            int var41 = var40 ^ var37 << 11;
            int var42 = this.field3377[var11 + 7] + var2;
            int var43 = this.field3377[var11 + 2] + var7;
            int var44 = var37 + var43;
            int var45 = var44 ^ var43 >>> 2;
            int var46 = this.field3377[var11 + 3] + var6;
            int var47 = this.field3377[var11 + 4] + var5;
            int var48 = var45 + var47;
            int var49 = var41 + var46;
            int var50 = var43 + var49;
            int var51 = var50 ^ var49 << 8;
            int var52 = var48 + var49;
            int var53 = var39 + var51;
            var6 = var52 ^ var48 >>> 16;
            int var54 = var6 + var38;
            int var55 = var48 + var53;
            var5 = var55 ^ var53 << 10;
            int var56 = var53 + var54;
            int var57 = var5 + var42;
            var4 = var56 ^ var54 >>> 4;
            int var58 = var54 + var57;
            int var59 = var4 + var41;
            var3 = var58 ^ var57 << 8;
            int var60 = var57 + var59;
            var2 = var60 ^ var59 >>> 9;
            var7 = var2 + var51;
            var8 = var3 + var45;
            var9 = var8 + var59;
            this.field3387[var11] = var9;
            this.field3387[var11 + 1] = var8;
            this.field3387[var11 + 2] = var7;
            this.field3387[var11 + 3] = var6;
            this.field3387[var11 + 4] = var5;
            this.field3387[var11 + 5] = var4;
            this.field3387[var11 + 6] = var3;
            this.field3387[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field3387[var12] + var9;
            int var14 = this.field3387[var12 + 6] + var3;
            int var15 = this.field3387[var12 + 7] + var2;
            int var16 = this.field3387[var12 + 1] + var8;
            int var17 = this.field3387[var12 + 3] + var6;
            int var18 = var13 ^ var16 << 11;
            int var19 = this.field3387[var12 + 4] + var5;
            int var20 = this.field3387[var12 + 2] + var7;
            int var21 = var17 + var18;
            int var22 = var16 + var20;
            int var23 = var22 ^ var20 >>> 2;
            int var24 = this.field3387[var12 + 5] + var4;
            int var25 = var19 + var23;
            int var26 = var20 + var21;
            int var27 = var26 ^ var21 << 8;
            int var28 = var24 + var27;
            int var29 = var21 + var25;
            var6 = var29 ^ var25 >>> 16;
            int var30 = var6 + var14;
            int var31 = var25 + var28;
            var5 = var31 ^ var28 << 10;
            int var32 = var5 + var15;
            int var33 = var28 + var30;
            var4 = var33 ^ var30 >>> 4;
            int var34 = var30 + var32;
            int var35 = var4 + var18;
            var3 = var34 ^ var32 << 8;
            var8 = var3 + var23;
            int var36 = var32 + var35;
            var2 = var36 ^ var35 >>> 9;
            var9 = var8 + var35;
            var7 = var2 + var27;
            this.field3387[var12] = var9;
            this.field3387[var12 + 1] = var8;
            this.field3387[var12 + 2] = var7;
            this.field3387[var12 + 3] = var6;
            this.field3387[var12 + 4] = var5;
            this.field3387[var12 + 5] = var4;
            this.field3387[var12 + 6] = var3;
            this.field3387[var12 + 7] = var2;
        }
        if (arg0 < 109) {
            method1163(60, (byte) 75, -125, null, -51);
        }
        this.method1165(118);
        this.field3385 = 256;
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(I)V")
    public static void method1161(int arg0) {
        field3389 = null;
        if (arg0 != 508) {
            field3384 = null;
        }
        field3386 = null;
        field3380 = null;
        field3384 = null;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Z)I")
    public final int method1162(boolean arg0) {
        field3388++;
        if (!arg0) {
            this.method1165(-110);
        }
        if (this.field3385-- == 0) {
            this.method1165(121);
            this.field3385 = 255;
        }
        return this.field3377[this.field3385];
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IBILnb;I)V")
    public static final void method1163(int arg0, byte arg1, int arg2, class92 arg3, int arg4) {
        int var5 = 114 / ((arg1 + 92) / 33);
        field3378++;
        if (class21.field531 == arg3 || class19.field449 >= 400) {
            return;
        }
        class7 var6;
        if (arg3.field2136 == 0) {
            var6 = class116.method905(new class7[] { arg3.field2121, class11.method118(arg3.field2135, class21.field531.field2135, -7), class103.field2488, class37.field940, class51.method421((byte) 127, arg3.field2135), class86.field2006 }, 1);
        } else {
            var6 = class116.method905(new class7[] { arg3.field2121, class103.field2488, class71.field1551, class51.method421((byte) -17, arg3.field2136), class86.field2006 }, 1);
        }
        if (class142.field3348 == 1) {
            class19.method176(arg2, arg4, class116.method905(new class7[] { class83.field1956, class127.field3035, var6 }, 1), class75.field1732, 3, 16, arg0);
            class13.field325++;
        } else if (!class50.field1206) {
            for (int var7 = 4; var7 >= 0; var7--) {
                if (class72.field1598[var7] != null) {
                    class155.field3597++;
                    int var8 = 0;
                    short var9 = 0;
                    if (class72.field1598[var7].method84(class49.field1186, 125)) {
                        if (arg3.field2135 > class21.field531.field2135) {
                            var9 = 2000;
                        }
                        if (class21.field531.field2134 != 0 && arg3.field2134 != 0) {
                            if (class21.field531.field2134 == arg3.field2134) {
                                var9 = 2000;
                            } else {
                                var9 = 0;
                            }
                        }
                    } else if (class66.field1440[var7]) {
                        var9 = 2000;
                    }
                    if (var7 == 0) {
                        var8 = var9 + 17;
                    }
                    if (var7 == 1) {
                        var8 = var9 + 31;
                    }
                    if (var7 == 2) {
                        var8 = var9 + 3;
                    }
                    if (var7 == 3) {
                        var8 = var9 + 8;
                    }
                    if (var7 == 4) {
                        var8 = var9 + 21;
                    }
                    class19.method176(arg2, arg4, class116.method905(new class7[] { class19.field452, var6 }, 1), class72.field1598[var7], 3, var8, arg0);
                }
            }
        } else if ((class9.field246 & 0x8) == 8) {
            class19.method176(arg2, arg4, class116.method905(new class7[] { class126.field3013, class127.field3035, var6 }, 1), class92.field2132, 3, 42, arg0);
            class66.field1446++;
        }
        for (int var10 = 0; var10 < class19.field449; var10++) {
            if (class147.field3473[var10] == 38) {
                class84.field1977[var10] = class116.method905(new class7[] { class19.field452, var6 }, 1);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(B)V")
    public static final void method1164(byte arg0) {
        field3382++;
        class44.field1050 = 0;
        int var1 = (class21.field531.field505 >> 7) + class153.field3585;
        int var2 = (class21.field531.field491 >> 7) + class32.field843;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class44.field1050 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class44.field1050 = 1;
        }
        int var3 = 39 % ((arg0 + 39) / 49);
        if (class44.field1050 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class44.field1050 = 0;
        }
    }

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "(I)V")
    private final void method1165(int arg0) {
        if (arg0 < 114) {
            field3389 = null;
        }
        field3376++;
        this.field3379 += ++this.field3383;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field3387[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field3390 ^= this.field3390 << 13;
                } else {
                    this.field3390 ^= this.field3390 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field3390 ^= this.field3390 << 2;
            } else {
                this.field3390 ^= this.field3390 >>> 16;
            }
            this.field3390 += this.field3387[var2 + 128 & 0xFF];
            int var4;
            this.field3387[var2] = var4 = this.field3379 + this.field3387[class84.method705(255, var3 >> 2)] + this.field3390;
            this.field3377[var2] = this.field3379 = var3 + this.field3387[class84.method705(255, var4 >> 8 >> 2)];
        }
    }

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "([I)V")
    public class143(int[] arg0) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field3377[var2] = arg0[var2];
        }
        this.method1160(117);
    }
}
