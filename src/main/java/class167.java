import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class167 {

    @OriginalMember(owner = "client!sf", name = "n", descriptor = "[I")
    private int[] field3335 = new int[256];

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "[I")
    private int[] field3323 = new int[256];

    @OriginalMember(owner = "client!sf", name = "j", descriptor = "I")
    public static int field3331 = -1;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "I")
    public static int field3322;

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "I")
    private int field3324;

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "I")
    public static int field3325;

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "I")
    private int field3326;

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "I")
    public static int field3328;

    @OriginalMember(owner = "client!sf", name = "h", descriptor = "I")
    public static int field3329;

    @OriginalMember(owner = "client!sf", name = "i", descriptor = "I")
    private int field3330;

    @OriginalMember(owner = "client!sf", name = "k", descriptor = "I")
    public static int field3332;

    @OriginalMember(owner = "client!sf", name = "l", descriptor = "I")
    public static int field3333;

    @OriginalMember(owner = "client!sf", name = "m", descriptor = "I")
    private int field3334;

    @OriginalMember(owner = "client!sf", name = "o", descriptor = "I")
    public static int field3336;

    @OriginalMember(owner = "client!sf", name = "q", descriptor = "I")
    public static int field3338;

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "J")
    public static long field3327;

    @OriginalMember(owner = "client!sf", name = "p", descriptor = "Lgd;")
    public static class58 field3337;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)V")
    public static void method1022(int arg0) {
        field3337 = null;
        int var1 = -83 / ((arg0 + 56) / 49);
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(B)V")
    private final void method1023(byte arg0) {
        this.field3334 += ++this.field3330;
        field3325++;
        if (arg0 >= -5) {
            this.field3324 = -20;
        }
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field3335[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field3324 ^= this.field3324 << 13;
                } else {
                    this.field3324 ^= this.field3324 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field3324 ^= this.field3324 << 2;
            } else {
                this.field3324 ^= this.field3324 >>> 16;
            }
            this.field3324 += this.field3335[var2 + 128 & 0xFF];
            int var4;
            this.field3335[var2] = var4 = this.field3334 + this.field3324 + this.field3335[class27.method198(1020, var3) >> 2];
            this.field3323[var2] = this.field3334 = this.field3335[class27.method198(var4 >> 8, 1020) >> 2] + var3;
        }
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(I)V")
    private final void method1024(int arg0) {
        field3322++;
        int var2 = -1640531527;
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;
        int var9 = -1640531527;
        int var10 = 0;
        if (arg0 != -2) {
            field3328 = 5;
        }
        while (var10 < 4) {
            int var61 = var9 ^ var8 << 11;
            int var62 = var7 + var8;
            int var63 = var62 ^ var7 >>> 2;
            int var64 = var5 + var63;
            int var65 = var6 + var61;
            int var66 = var7 + var65;
            int var67 = var66 ^ var65 << 8;
            int var68 = var64 + var65;
            var6 = var68 ^ var64 >>> 16;
            int var69 = var4 + var67;
            int var70 = var64 + var69;
            var5 = var70 ^ var69 << 10;
            int var71 = var3 + var6;
            int var72 = var2 + var5;
            int var73 = var69 + var71;
            var4 = var73 ^ var71 >>> 4;
            int var74 = var4 + var61;
            int var75 = var71 + var72;
            var3 = var75 ^ var72 << 8;
            int var76 = var72 + var74;
            var8 = var3 + var63;
            var2 = var76 ^ var74 >>> 9;
            var9 = var8 + var74;
            var7 = var2 + var67;
            var10++;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field3323[var11 + 5] + var4;
            int var38 = this.field3323[var11 + 7] + var2;
            int var39 = this.field3323[var11] + var9;
            int var40 = this.field3323[var11 + 2] + var7;
            int var41 = this.field3323[var11 + 6] + var3;
            int var42 = this.field3323[var11 + 3] + var6;
            int var43 = this.field3323[var11 + 4] + var5;
            int var44 = this.field3323[var11 + 1] + var8;
            int var45 = var39 ^ var44 << 11;
            int var46 = var42 + var45;
            int var47 = var40 + var44;
            int var48 = var47 ^ var40 >>> 2;
            int var49 = var40 + var46;
            int var50 = var43 + var48;
            int var51 = var49 ^ var46 << 8;
            int var52 = var46 + var50;
            var6 = var52 ^ var50 >>> 16;
            int var53 = var37 + var51;
            int var54 = var50 + var53;
            int var55 = var6 + var41;
            var5 = var54 ^ var53 << 10;
            int var56 = var53 + var55;
            int var57 = var5 + var38;
            var4 = var56 ^ var55 >>> 4;
            int var58 = var4 + var45;
            int var59 = var55 + var57;
            var3 = var59 ^ var57 << 8;
            int var60 = var57 + var58;
            var2 = var60 ^ var58 >>> 9;
            var7 = var2 + var51;
            var8 = var3 + var48;
            var9 = var8 + var58;
            this.field3335[var11] = var9;
            this.field3335[var11 + 1] = var8;
            this.field3335[var11 + 2] = var7;
            this.field3335[var11 + 3] = var6;
            this.field3335[var11 + 4] = var5;
            this.field3335[var11 + 5] = var4;
            this.field3335[var11 + 6] = var3;
            this.field3335[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field3335[var12 + 2] + var7;
            int var14 = this.field3335[var12 + 6] + var3;
            int var15 = this.field3335[var12 + 1] + var8;
            int var16 = this.field3335[var12] + var9;
            int var17 = this.field3335[var12 + 4] + var5;
            int var18 = this.field3335[var12 + 3] + var6;
            int var19 = this.field3335[var12 + 5] + var4;
            int var20 = this.field3335[var12 + 7] + var2;
            int var21 = var16 ^ var15 << 11;
            int var22 = var18 + var21;
            int var23 = var13 + var15;
            int var24 = var23 ^ var13 >>> 2;
            int var25 = var13 + var22;
            int var26 = var17 + var24;
            int var27 = var25 ^ var22 << 8;
            int var28 = var22 + var26;
            int var29 = var19 + var27;
            var6 = var28 ^ var26 >>> 16;
            int var30 = var6 + var14;
            int var31 = var26 + var29;
            var5 = var31 ^ var29 << 10;
            int var32 = var29 + var30;
            var4 = var32 ^ var30 >>> 4;
            int var33 = var4 + var21;
            int var34 = var5 + var20;
            int var35 = var30 + var34;
            var3 = var35 ^ var34 << 8;
            var8 = var3 + var24;
            int var36 = var33 + var34;
            var2 = var36 ^ var33 >>> 9;
            var9 = var8 + var33;
            this.field3335[var12] = var9;
            var7 = var2 + var27;
            this.field3335[var12 + 1] = var8;
            this.field3335[var12 + 2] = var7;
            this.field3335[var12 + 3] = var6;
            this.field3335[var12 + 4] = var5;
            this.field3335[var12 + 5] = var4;
            this.field3335[var12 + 6] = var3;
            this.field3335[var12 + 7] = var2;
        }
        this.method1023((byte) -125);
        this.field3326 = 256;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(II)V")
    public static final void method1025(int arg0, int arg1) {
        if (arg1 != 3) {
            field3327 = -101L;
        }
        if (class190.field3775 == 0) {
            class203.field4001.method1312(arg0, -128);
        } else {
            class74.field1683 = arg0;
        }
        field3333++;
    }

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "([I)V")
    public class167(int[] arg0) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field3323[var2] = arg0[var2];
        }
        this.method1024(-2);
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IBI)I")
    public static final int method1026(int arg0, byte arg1, int arg2) {
        int var3 = class6.method33(arg0 - 1, arg2 + -1, (byte) 46) + class6.method33(arg0 - 1, arg2 + 1, (byte) 111) + class6.method33(arg0 + 1, arg2 + -1, (byte) 66) + class6.method33(arg0 + 1, arg2 - -1, (byte) 127);
        int var4 = -10 / ((-arg1 - 50) / 53);
        field3332++;
        int var5 = class6.method33(arg0, arg2 - 1, (byte) 70) + class6.method33(arg0, arg2 + 1, (byte) 40) + class6.method33(arg0 + -1, arg2, (byte) 93) + class6.method33(arg0 + 1, arg2, (byte) 111);
        int var6 = class6.method33(arg0, arg2, (byte) 100);
        return var6 / 4 + var3 / 16 + var5 / 8;
    }

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "(I)I")
    public final int method1027(int arg0) {
        field3329++;
        if (this.field3326-- == 0) {
            this.method1023((byte) -60);
            this.field3326 = 255;
        }
        int var2 = 49 % ((76 - arg0) / 46);
        return this.field3323[this.field3326];
    }
}
