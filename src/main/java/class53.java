import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class53 {

    @OriginalMember(owner = "client!fe", name = "n", descriptor = "[I")
    private int[] field886 = new int[256];

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "[I")
    private int[] field877 = new int[256];

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "Lnb;")
    public static class120 field878 = new class120(50);

    @OriginalMember(owner = "client!fe", name = "t", descriptor = "I")
    public static int field892 = 0;

    @OriginalMember(owner = "client!fe", name = "s", descriptor = "I")
    public static int field891 = 0;

    @OriginalMember(owner = "client!fe", name = "r", descriptor = "Lkb;")
    private static class93 field890 = class76.method390("Service unavailable)3", 0);

    @OriginalMember(owner = "client!fe", name = "q", descriptor = "Lkb;")
    public static class93 field889 = field890;

    @OriginalMember(owner = "client!fe", name = "p", descriptor = "Lkb;")
    public static class93 field888 = class76.method390("<img=1>", 0);

    @OriginalMember(owner = "client!fe", name = "x", descriptor = "Lkb;")
    private static class93 field896 = class76.method390("Please contact customer support)3", 0);

    @OriginalMember(owner = "client!fe", name = "w", descriptor = "Lkb;")
    public static class93 field895 = field896;

    @OriginalMember(owner = "client!fe", name = "y", descriptor = "[I")
    public static int[] field897 = new int[500];

    @OriginalMember(owner = "client!fe", name = "z", descriptor = "Lkb;")
    public static class93 field898 = class76.method390("Schlie-8en", 0);

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "I")
    public static int field873;

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "I")
    public static int field874;

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "I")
    public static int field875;

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "I")
    public static int field876;

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "I")
    public static int field879;

    @OriginalMember(owner = "client!fe", name = "h", descriptor = "I")
    private int field880;

    @OriginalMember(owner = "client!fe", name = "i", descriptor = "I")
    public static int field881;

    @OriginalMember(owner = "client!fe", name = "j", descriptor = "I")
    private int field882;

    @OriginalMember(owner = "client!fe", name = "k", descriptor = "I")
    private int field883;

    @OriginalMember(owner = "client!fe", name = "l", descriptor = "I")
    public static int field884;

    @OriginalMember(owner = "client!fe", name = "m", descriptor = "I")
    private int field885;

    @OriginalMember(owner = "client!fe", name = "o", descriptor = "I")
    public static int field887;

    @OriginalMember(owner = "client!fe", name = "v", descriptor = "I")
    public static int field894;

    @OriginalMember(owner = "client!fe", name = "u", descriptor = "Ljg;")
    public static class89 field893;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(III)I")
    public static final int method286(int arg0, int arg1, int arg2) {
        field875++;
        if (arg2 != 1572585255) {
            field898 = null;
        }
        long var3 = (long) ((arg1 << 16) + arg0);
        return class191.field3736 != null && class191.field3736.field718 == var3 ? class79.field1414.field3153 * 99 / (class79.field1414.field3162.length - class191.field3736.field3218) + 1 : 0;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V")
    private final void method287(int arg0) {
        field879++;
        this.field883 += ++this.field882;
        if (arg0 != 128) {
            method286(-3, -35, -121);
        }
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field886[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field885 ^= this.field885 << 13;
                } else {
                    this.field885 ^= this.field885 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field885 ^= this.field885 << 2;
            } else {
                this.field885 ^= this.field885 >>> 16;
            }
            this.field885 += this.field886[var2 + 128 & 0xFF];
            int var4;
            this.field886[var2] = var4 = this.field883 + this.field886[class91.method479(var3, 1020) >> 2] + this.field885;
            this.field877[var2] = this.field883 = var3 + this.field886[class91.method479(var4 >> 8, 1020) >> 2];
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Z)V")
    public static final void method288(boolean arg0) {
        field881++;
        class201.field3899 = null;
        class195.field3825 = null;
        class10.field159 = null;
        if (!arg0) {
            method288(false);
        }
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(I)V")
    public static final void method289(int arg0) {
        class174.field3446 = 0;
        field884++;
        int var1 = (class106.field1940.field2045 >> 7) + class68.field1242;
        if (arg0 != 3062) {
            field898 = null;
        }
        int var2 = (class106.field1940.field2032 >> 7) + class49.field787;
        if (var2 >= 3053 && var2 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            class174.field3446 = 1;
        }
        if (var2 >= 3072 && var2 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            class174.field3446 = 1;
        }
        if (class174.field3446 == 1 && var2 >= 3139 && var2 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            class174.field3446 = 0;
        }
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(Z)V")
    public static void method290(boolean arg0) {
        field890 = null;
        field889 = null;
        field878 = null;
        field893 = null;
        field895 = null;
        field898 = null;
        field888 = null;
        field897 = null;
        if (arg0) {
            field896 = null;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(II)V")
    public static final void method291(int arg0, int arg1) {
        field873++;
        class81.field1499 += arg0 * 128;
        short var2 = 256;
        if (class2.field30.length < class81.field1499) {
            int var3 = (int) (Math.random() * 12.0D);
            class81.field1499 -= class2.field30.length;
            class16.method96(class139.field2707[var3], 0);
        }
        int var4 = 0;
        int var5 = (var2 - arg0) * 128;
        int var6 = arg0 * 128;
        for (int var7 = 0; var7 < var5; var7++) {
            int var27 = class64.field1029[var4 + var6] - class2.field30[class2.field30.length - 1 & class81.field1499 + var4] * arg0 / 6;
            if (var27 < 0) {
                var27 = 0;
            }
            class64.field1029[var4++] = var27;
        }
        for (int var8 = var2 - arg0; var8 < var2; var8++) {
            int var24 = var8 * 128;
            for (int var25 = 0; var25 < 128; var25++) {
                int var26 = (int) (Math.random() * 100.0D);
                if (var26 < 50 && var25 > 10 && var25 < 118) {
                    class64.field1029[var24 + var25] = 255;
                } else {
                    class64.field1029[var24 + var25] = 0;
                }
            }
        }
        if (class82.field1504 > 0) {
            class82.field1504 -= arg0 * 4;
        }
        if (class101.field1867 > 0) {
            class101.field1867 -= arg0 * 4;
        }
        if (class82.field1504 == 0 && class101.field1867 == 0) {
            int var9 = (int) ((double) (2000 / arg0) * Math.random());
            if (var9 == 1) {
                class101.field1867 = 1024;
            }
            if (var9 == 0) {
                class82.field1504 = 1024;
            }
        }
        for (int var10 = arg1; var10 < var2 - arg0; var10++) {
            class25.field382[var10] = class25.field382[arg0 + var10];
        }
        for (int var11 = var2 - arg0; var11 < var2; var11++) {
            class25.field382[var11] = (int) (Math.sin((double) class19.field319 / 14.0D) * 16.0D + Math.sin((double) class19.field319 / 15.0D) * 14.0D + Math.sin((double) class19.field319 / 16.0D) * 12.0D);
            class19.field319++;
        }
        class103.field1897 += arg0;
        int var12 = ((class21.field338 & 0x1) + arg0) / 2;
        if (var12 <= 0) {
            return;
        }
        for (int var13 = 0; var13 < class103.field1897 * 100; var13++) {
            int var22 = (int) (Math.random() * 128.0D) + 128;
            int var23 = (int) (Math.random() * 124.0D) + 2;
            class64.field1029[var23 + (var22 << 7)] = 192;
        }
        class103.field1897 = 0;
        for (int var14 = 0; var14 < var2; var14++) {
            int var19 = var14 * 128;
            int var20 = 0;
            for (int var21 = -var12; var21 < 128; var21++) {
                if (var12 + var21 < 128) {
                    var20 += class64.field1029[var21 + var12 + var19];
                }
                if (var21 - var12 - 1 >= 0) {
                    var20 -= class64.field1029[var21 + var19 - var12 - 1];
                }
                if (var21 >= 0) {
                    class76.field1378[var19 + var21] = var20 / (var12 * 2 + 1);
                }
            }
        }
        for (int var15 = 0; var15 < 128; var15++) {
            int var16 = 0;
            for (int var17 = -var12; var17 < var2; var17++) {
                int var18 = var17 * 128;
                if (var2 > var12 + var17) {
                    var16 += class76.field1378[var12 * 128 + var15 + var18];
                }
                if (var17 - var12 - 1 >= 0) {
                    var16 -= class76.field1378[var15 + var18 - var12 * 128 - 128];
                }
                if (var17 >= 0) {
                    class64.field1029[var15 + var18] = var16 / (var12 * 2 + 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(B)V")
    private final void method292(byte arg0) {
        field887++;
        if (arg0 > -18) {
            this.field880 = -6;
        }
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
            int var68 = var64 + var65;
            var6 = var68 ^ var64 >>> 16;
            int var69 = var3 + var6;
            int var70 = var4 + var67;
            int var71 = var64 + var70;
            var5 = var71 ^ var70 << 10;
            int var72 = var69 + var70;
            int var73 = var2 + var5;
            var4 = var72 ^ var69 >>> 4;
            int var74 = var69 + var73;
            var3 = var74 ^ var73 << 8;
            int var75 = var4 + var61;
            var8 = var3 + var63;
            int var76 = var73 + var75;
            var2 = var76 ^ var75 >>> 9;
            var9 = var8 + var75;
            var7 = var2 + var67;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field877[var11] + var9;
            int var38 = this.field877[var11 + 5] + var4;
            int var39 = this.field877[var11 + 6] + var3;
            int var40 = this.field877[var11 + 7] + var2;
            int var41 = this.field877[var11 + 4] + var5;
            int var42 = this.field877[var11 + 1] + var8;
            int var43 = this.field877[var11 + 3] + var6;
            int var44 = this.field877[var11 + 2] + var7;
            int var45 = var37 ^ var42 << 11;
            int var46 = var42 + var44;
            int var47 = var46 ^ var44 >>> 2;
            int var48 = var43 + var45;
            int var49 = var41 + var47;
            int var50 = var44 + var48;
            int var51 = var50 ^ var48 << 8;
            int var52 = var38 + var51;
            int var53 = var48 + var49;
            var6 = var53 ^ var49 >>> 16;
            int var54 = var49 + var52;
            var5 = var54 ^ var52 << 10;
            int var55 = var5 + var40;
            int var56 = var6 + var39;
            int var57 = var52 + var56;
            var4 = var57 ^ var56 >>> 4;
            int var58 = var4 + var45;
            int var59 = var55 + var56;
            var3 = var59 ^ var55 << 8;
            var8 = var3 + var47;
            int var60 = var55 + var58;
            var2 = var60 ^ var58 >>> 9;
            var9 = var8 + var58;
            var7 = var2 + var51;
            this.field886[var11] = var9;
            this.field886[var11 + 1] = var8;
            this.field886[var11 + 2] = var7;
            this.field886[var11 + 3] = var6;
            this.field886[var11 + 4] = var5;
            this.field886[var11 + 5] = var4;
            this.field886[var11 + 6] = var3;
            this.field886[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field886[var12] + var9;
            int var14 = this.field886[var12 + 4] + var5;
            int var15 = this.field886[var12 + 1] + var8;
            int var16 = this.field886[var12 + 5] + var4;
            int var17 = this.field886[var12 + 6] + var3;
            int var18 = var13 ^ var15 << 11;
            int var19 = this.field886[var12 + 7] + var2;
            int var20 = this.field886[var12 + 3] + var6;
            int var21 = this.field886[var12 + 2] + var7;
            int var22 = var18 + var20;
            int var23 = var15 + var21;
            int var24 = var23 ^ var21 >>> 2;
            int var25 = var21 + var22;
            int var26 = var25 ^ var22 << 8;
            int var27 = var14 + var24;
            int var28 = var16 + var26;
            int var29 = var22 + var27;
            var6 = var29 ^ var27 >>> 16;
            int var30 = var27 + var28;
            var5 = var30 ^ var28 << 10;
            int var31 = var5 + var19;
            int var32 = var6 + var17;
            int var33 = var28 + var32;
            var4 = var33 ^ var32 >>> 4;
            int var34 = var4 + var18;
            int var35 = var31 + var32;
            var3 = var35 ^ var31 << 8;
            var8 = var3 + var24;
            int var36 = var31 + var34;
            var2 = var36 ^ var34 >>> 9;
            var9 = var8 + var34;
            this.field886[var12] = var9;
            this.field886[var12 + 1] = var8;
            var7 = var2 + var26;
            this.field886[var12 + 2] = var7;
            this.field886[var12 + 3] = var6;
            this.field886[var12 + 4] = var5;
            this.field886[var12 + 5] = var4;
            this.field886[var12 + 6] = var3;
            this.field886[var12 + 7] = var2;
        }
        this.method287(128);
        this.field880 = 256;
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(III)I")
    public static final int method293(int arg0, int arg1, int arg2) {
        int var3 = 1;
        while (arg1 > 1) {
            if ((arg1 & 0x1) != 0) {
                var3 = arg0 * var3;
            }
            arg1 >>= 0x1;
            arg0 *= arg0;
        }
        if (arg2 >= -69) {
            field897 = null;
        }
        field876++;
        if (arg1 == 1) {
            return arg0 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "(I)I")
    public final int method294(int arg0) {
        if (this.field880-- == 0) {
            this.method287(128);
            this.field880 = 255;
        }
        if (arg0 == 255) {
            field874++;
            return this.field877[this.field880];
        } else {
            return 123;
        }
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "([I)V")
    public class53(int[] arg0) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field877[var2] = arg0[var2];
        }
        this.method292((byte) -108);
    }
}
