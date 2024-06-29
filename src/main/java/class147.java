import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class147 {

    @OriginalMember(owner = "client!va", name = "r", descriptor = "[I")
    private int[] field3344 = new int[256];

    @OriginalMember(owner = "client!va", name = "a", descriptor = "[I")
    private int[] field3327 = new int[256];

    @OriginalMember(owner = "client!va", name = "h", descriptor = "Lec;")
    private static class32 field3334 = class73.method594("Sep", true);

    @OriginalMember(owner = "client!va", name = "c", descriptor = "Lec;")
    private static class32 field3329 = class73.method594("Oct", true);

    @OriginalMember(owner = "client!va", name = "f", descriptor = "Lec;")
    private static class32 field3332 = class73.method594("May", true);

    @OriginalMember(owner = "client!va", name = "j", descriptor = "Lec;")
    private static class32 field3336 = class73.method594("Aug", true);

    @OriginalMember(owner = "client!va", name = "o", descriptor = "Lec;")
    private static class32 field3341 = class73.method594("Invalid loginserver requested)3", true);

    @OriginalMember(owner = "client!va", name = "q", descriptor = "[S")
    public static short[] field3343 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!va", name = "b", descriptor = "Lec;")
    private static class32 field3328 = class73.method594("Jun", true);

    @OriginalMember(owner = "client!va", name = "p", descriptor = "Lec;")
    private static class32 field3342 = class73.method594("Apr", true);

    @OriginalMember(owner = "client!va", name = "d", descriptor = "Lec;")
    private static class32 field3330 = class73.method594("Nov", true);

    @OriginalMember(owner = "client!va", name = "n", descriptor = "Lec;")
    private static class32 field3340 = class73.method594("Feb", true);

    @OriginalMember(owner = "client!va", name = "m", descriptor = "Lec;")
    private static class32 field3339 = class73.method594("Jul", true);

    @OriginalMember(owner = "client!va", name = "x", descriptor = "Lec;")
    public static class32 field3350 = field3341;

    @OriginalMember(owner = "client!va", name = "A", descriptor = "Lec;")
    private static class32 field3353 = class73.method594("Jan", true);

    @OriginalMember(owner = "client!va", name = "C", descriptor = "Lec;")
    public static class32 field3355 = null;

    @OriginalMember(owner = "client!va", name = "z", descriptor = "Lec;")
    private static class32 field3352 = class73.method594("Mar", true);

    @OriginalMember(owner = "client!va", name = "B", descriptor = "Lec;")
    private static class32 field3354 = class73.method594("Dec", true);

    @OriginalMember(owner = "client!va", name = "i", descriptor = "[Lec;")
    public static class32[] field3335 = new class32[] { field3353, field3340, field3352, field3342, field3332, field3328, field3339, field3336, field3334, field3329, field3330, field3354 };

    @OriginalMember(owner = "client!va", name = "e", descriptor = "I")
    private int field3331;

    @OriginalMember(owner = "client!va", name = "g", descriptor = "I")
    public static int field3333;

    @OriginalMember(owner = "client!va", name = "k", descriptor = "I")
    public static int field3337;

    @OriginalMember(owner = "client!va", name = "l", descriptor = "I")
    public static int field3338;

    @OriginalMember(owner = "client!va", name = "s", descriptor = "I")
    private int field3345;

    @OriginalMember(owner = "client!va", name = "u", descriptor = "I")
    private int field3347;

    @OriginalMember(owner = "client!va", name = "w", descriptor = "I")
    private int field3349;

    @OriginalMember(owner = "client!va", name = "y", descriptor = "I")
    public static int field3351;

    @OriginalMember(owner = "client!va", name = "D", descriptor = "I")
    public static int field3356;

    @OriginalMember(owner = "client!va", name = "v", descriptor = "Lga;")
    public static class44 field3348;

    @OriginalMember(owner = "client!va", name = "t", descriptor = "[[B")
    public static byte[][] field3346;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(I)V")
    private final void method1098(int arg0) {
        int var2 = -56 / ((arg0 + 21) / 37);
        this.field3347 += ++this.field3345;
        for (int var3 = 0; var3 < 256; var3++) {
            int var4 = this.field3327[var3];
            if ((var3 & 0x2) == 0) {
                if ((var3 & 0x1) == 0) {
                    this.field3331 ^= this.field3331 << 13;
                } else {
                    this.field3331 ^= this.field3331 >>> 6;
                }
            } else if ((var3 & 0x1) == 0) {
                this.field3331 ^= this.field3331 << 2;
            } else {
                this.field3331 ^= this.field3331 >>> 16;
            }
            this.field3331 += this.field3327[var3 + 128 & 0xFF];
            int var5;
            this.field3327[var3] = var5 = this.field3347 + this.field3331 + this.field3327[class41.method326(1020, var4) >> 2];
            this.field3344[var3] = this.field3347 = this.field3327[class41.method326(261219, var5) >> 8 >> 2] + var4;
        }
        field3338++;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Z)V")
    private final void method1099(boolean arg0) {
        field3333++;
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
            int var63 = var6 + var61;
            int var64 = var62 ^ var7 >>> 2;
            int var65 = var7 + var63;
            int var66 = var65 ^ var63 << 8;
            int var67 = var5 + var64;
            int var68 = var4 + var66;
            int var69 = var63 + var67;
            var6 = var69 ^ var67 >>> 16;
            int var70 = var67 + var68;
            var5 = var70 ^ var68 << 10;
            int var71 = var2 + var5;
            int var72 = var3 + var6;
            int var73 = var68 + var72;
            var4 = var73 ^ var72 >>> 4;
            int var74 = var4 + var61;
            int var75 = var71 + var72;
            var3 = var75 ^ var71 << 8;
            var8 = var3 + var64;
            int var76 = var71 + var74;
            var2 = var76 ^ var74 >>> 9;
            var9 = var8 + var74;
            var7 = var2 + var66;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field3344[var11 + 1] + var8;
            int var38 = this.field3344[var11 + 6] + var3;
            int var39 = this.field3344[var11 + 5] + var4;
            int var40 = this.field3344[var11 + 3] + var6;
            int var41 = this.field3344[var11 + 4] + var5;
            int var42 = this.field3344[var11] + var9;
            int var43 = this.field3344[var11 + 7] + var2;
            int var44 = this.field3344[var11 + 2] + var7;
            int var45 = var42 ^ var37 << 11;
            int var46 = var40 + var45;
            int var47 = var37 + var44;
            int var48 = var47 ^ var44 >>> 2;
            int var49 = var41 + var48;
            int var50 = var44 + var46;
            int var51 = var50 ^ var46 << 8;
            int var52 = var46 + var49;
            var6 = var52 ^ var49 >>> 16;
            int var53 = var39 + var51;
            int var54 = var49 + var53;
            int var55 = var6 + var38;
            var5 = var54 ^ var53 << 10;
            int var56 = var53 + var55;
            int var57 = var5 + var43;
            var4 = var56 ^ var55 >>> 4;
            int var58 = var55 + var57;
            var3 = var58 ^ var57 << 8;
            int var59 = var4 + var45;
            int var60 = var57 + var59;
            var2 = var60 ^ var59 >>> 9;
            var8 = var3 + var48;
            var7 = var2 + var51;
            var9 = var8 + var59;
            this.field3327[var11] = var9;
            this.field3327[var11 + 1] = var8;
            this.field3327[var11 + 2] = var7;
            this.field3327[var11 + 3] = var6;
            this.field3327[var11 + 4] = var5;
            this.field3327[var11 + 5] = var4;
            this.field3327[var11 + 6] = var3;
            this.field3327[var11 + 7] = var2;
        }
        if (arg0) {
            return;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field3327[var12] + var9;
            int var14 = this.field3327[var12 + 5] + var4;
            int var15 = this.field3327[var12 + 4] + var5;
            int var16 = this.field3327[var12 + 1] + var8;
            int var17 = this.field3327[var12 + 7] + var2;
            int var18 = this.field3327[var12 + 2] + var7;
            int var19 = this.field3327[var12 + 3] + var6;
            int var20 = this.field3327[var12 + 6] + var3;
            int var21 = var13 ^ var16 << 11;
            int var22 = var19 + var21;
            int var23 = var16 + var18;
            int var24 = var23 ^ var18 >>> 2;
            int var25 = var18 + var22;
            int var26 = var25 ^ var22 << 8;
            int var27 = var15 + var24;
            int var28 = var22 + var27;
            var6 = var28 ^ var27 >>> 16;
            int var29 = var14 + var26;
            int var30 = var6 + var20;
            int var31 = var27 + var29;
            var5 = var31 ^ var29 << 10;
            int var32 = var5 + var17;
            int var33 = var29 + var30;
            var4 = var33 ^ var30 >>> 4;
            int var34 = var4 + var21;
            int var35 = var30 + var32;
            var3 = var35 ^ var32 << 8;
            var8 = var3 + var24;
            int var36 = var32 + var34;
            var2 = var36 ^ var34 >>> 9;
            var9 = var8 + var34;
            this.field3327[var12] = var9;
            var7 = var2 + var26;
            this.field3327[var12 + 1] = var8;
            this.field3327[var12 + 2] = var7;
            this.field3327[var12 + 3] = var6;
            this.field3327[var12 + 4] = var5;
            this.field3327[var12 + 5] = var4;
            this.field3327[var12 + 6] = var3;
            this.field3327[var12 + 7] = var2;
        }
        this.method1098(-117);
        this.field3349 = 256;
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(I)V")
    public static void method1100(int arg0) {
        field3340 = null;
        field3355 = null;
        field3336 = null;
        field3335 = null;
        field3343 = null;
        field3342 = null;
        field3346 = null;
        field3330 = null;
        field3350 = null;
        field3329 = null;
        if (arg0 != -6) {
            field3343 = null;
        }
        field3328 = null;
        field3334 = null;
        field3339 = null;
        field3332 = null;
        field3353 = null;
        field3341 = null;
        field3352 = null;
        field3348 = null;
        field3354 = null;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(BI)I")
    public static final int method1101(byte arg0, int arg1) {
        int var2 = 0;
        int var3 = 123 % ((arg0 - 21) / 57);
        field3337++;
        if (arg1 < 0 || arg1 >= 65536) {
            arg1 >>>= 0x10;
            var2 += 16;
        }
        if (arg1 >= 256) {
            var2 += 8;
            arg1 >>>= 0x8;
        }
        if (arg1 >= 16) {
            arg1 >>>= 0x4;
            var2 += 4;
        }
        if (arg1 >= 4) {
            arg1 >>>= 0x2;
            var2 += 2;
        }
        if (arg1 >= 1) {
            var2++;
            arg1 >>>= 0x1;
        }
        return arg1 + var2;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(ILf;)I")
    public static final int method1102(int arg0, class36 arg1) {
        field3351++;
        if (arg0 > -93) {
            return 7;
        } else {
            class38 var2 = (class38) class115.field2770.method1198(((long) arg1.field744 << 32) + ((long) arg1.field829), (byte) -106);
            return var2 == null ? arg1.field769 : var2.field901;
        }
    }

    @OriginalMember(owner = "client!va", name = "c", descriptor = "(I)I")
    public final int method1103(int arg0) {
        if (this.field3349-- == 0) {
            this.method1098(102);
            this.field3349 = 255;
        }
        field3356++;
        if (arg0 != 4) {
            this.method1098(72);
        }
        return this.field3344[this.field3349];
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "([I)V")
    public class147(int[] arg0) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field3344[var2] = arg0[var2];
        }
        this.method1099(false);
    }
}
