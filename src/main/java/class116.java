import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class116 {

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "[I")
    private int[] field2075;

    @OriginalMember(owner = "client!gd", name = "q", descriptor = "[I")
    private int[] field2088;

    @OriginalMember(owner = "client!gd", name = "j", descriptor = "Lsb;")
    private static class98 field2081 = class47.method368("You can(Wt add yourself to your own ignore list)3", 0);

    @OriginalMember(owner = "client!gd", name = "m", descriptor = "Lsb;")
    public static class98 field2084 = field2081;

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "I")
    public static int field2077 = 0;

    @OriginalMember(owner = "client!gd", name = "o", descriptor = "I")
    public static int field2086 = 0;

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "Lgj;")
    public static class226 field2074 = new class226(50);

    @OriginalMember(owner = "client!gd", name = "p", descriptor = "Llb;")
    public static class190 field2087 = new class190(16);

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "I")
    private int field2073;

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "I")
    private int field2076;

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "I")
    public static int field2078;

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "I")
    private int field2079;

    @OriginalMember(owner = "client!gd", name = "i", descriptor = "I")
    public static int field2080;

    @OriginalMember(owner = "client!gd", name = "l", descriptor = "I")
    public static int field2083;

    @OriginalMember(owner = "client!gd", name = "n", descriptor = "I")
    private int field2085;

    @OriginalMember(owner = "client!gd", name = "k", descriptor = "J")
    public static long field2082;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "Ltg;")
    public static class75 field2072;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V")
    private final void method868(int arg0) {
        this.field2073 += ++this.field2085;
        if (arg0 != 1) {
            field2082 = 73L;
        }
        field2078++;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field2075[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field2079 ^= this.field2079 << 13;
                } else {
                    this.field2079 ^= this.field2079 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field2079 ^= this.field2079 << 2;
            } else {
                this.field2079 ^= this.field2079 >>> 16;
            }
            this.field2079 += this.field2075[var2 + 128 & 0xFF];
            int var4;
            this.field2075[var2] = var4 = this.field2073 + this.field2075[class214.method1427(1020, var3) >> 2] + this.field2079;
            this.field2088[var2] = this.field2073 = var3 + this.field2075[class214.method1427(var4, 261353) >> 8 >> 2];
        }
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(I)V")
    public static void method869(int arg0) {
        field2074 = null;
        if (arg0 <= -56) {
            field2087 = null;
            field2072 = null;
            field2081 = null;
            field2084 = null;
        }
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(I)V")
    private final void method870(int arg0) {
        field2083++;
        if (arg0 != -1488592728) {
            return;
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
            int var62 = var6 + var61;
            int var63 = var7 + var8;
            int var64 = var63 ^ var7 >>> 2;
            int var65 = var5 + var64;
            int var66 = var7 + var62;
            int var67 = var66 ^ var62 << 8;
            int var68 = var62 + var65;
            int var69 = var4 + var67;
            var6 = var68 ^ var65 >>> 16;
            int var70 = var65 + var69;
            var5 = var70 ^ var69 << 10;
            int var71 = var3 + var6;
            int var72 = var2 + var5;
            int var73 = var69 + var71;
            var4 = var73 ^ var71 >>> 4;
            int var74 = var71 + var72;
            var3 = var74 ^ var72 << 8;
            int var75 = var4 + var61;
            var8 = var3 + var64;
            int var76 = var72 + var75;
            var2 = var76 ^ var75 >>> 9;
            var9 = var8 + var75;
            var7 = var2 + var67;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field2088[var11 + 4] + var5;
            int var38 = this.field2088[var11 + 5] + var4;
            int var39 = this.field2088[var11] + var9;
            int var40 = this.field2088[var11 + 3] + var6;
            int var41 = this.field2088[var11 + 6] + var3;
            int var42 = this.field2088[var11 + 1] + var8;
            int var43 = var39 ^ var42 << 11;
            int var44 = var40 + var43;
            int var45 = this.field2088[var11 + 2] + var7;
            int var46 = this.field2088[var11 + 7] + var2;
            int var47 = var42 + var45;
            int var48 = var47 ^ var45 >>> 2;
            int var49 = var44 + var45;
            int var50 = var49 ^ var44 << 8;
            int var51 = var37 + var48;
            int var52 = var38 + var50;
            int var53 = var44 + var51;
            var6 = var53 ^ var51 >>> 16;
            int var54 = var6 + var41;
            int var55 = var51 + var52;
            var5 = var55 ^ var52 << 10;
            int var56 = var52 + var54;
            int var57 = var5 + var46;
            var4 = var56 ^ var54 >>> 4;
            int var58 = var4 + var43;
            int var59 = var54 + var57;
            var3 = var59 ^ var57 << 8;
            int var60 = var57 + var58;
            var2 = var60 ^ var58 >>> 9;
            var7 = var2 + var50;
            var8 = var3 + var48;
            var9 = var8 + var58;
            this.field2075[var11] = var9;
            this.field2075[var11 + 1] = var8;
            this.field2075[var11 + 2] = var7;
            this.field2075[var11 + 3] = var6;
            this.field2075[var11 + 4] = var5;
            this.field2075[var11 + 5] = var4;
            this.field2075[var11 + 6] = var3;
            this.field2075[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field2075[var12 + 4] + var5;
            int var14 = this.field2075[var12 + 7] + var2;
            int var15 = this.field2075[var12 + 1] + var8;
            int var16 = this.field2075[var12 + 5] + var4;
            int var17 = this.field2075[var12 + 3] + var6;
            int var18 = this.field2075[var12 + 2] + var7;
            int var19 = this.field2075[var12 + 6] + var3;
            int var20 = this.field2075[var12] + var9;
            int var21 = var20 ^ var15 << 11;
            int var22 = var15 + var18;
            int var23 = var17 + var21;
            int var24 = var22 ^ var18 >>> 2;
            int var25 = var13 + var24;
            int var26 = var18 + var23;
            int var27 = var26 ^ var23 << 8;
            int var28 = var16 + var27;
            int var29 = var23 + var25;
            var6 = var29 ^ var25 >>> 16;
            int var30 = var25 + var28;
            int var31 = var6 + var19;
            var5 = var30 ^ var28 << 10;
            int var32 = var5 + var14;
            int var33 = var28 + var31;
            var4 = var33 ^ var31 >>> 4;
            int var34 = var31 + var32;
            var3 = var34 ^ var32 << 8;
            int var35 = var4 + var21;
            int var36 = var32 + var35;
            var2 = var36 ^ var35 >>> 9;
            var8 = var3 + var24;
            var7 = var2 + var27;
            var9 = var8 + var35;
            this.field2075[var12] = var9;
            this.field2075[var12 + 1] = var8;
            this.field2075[var12 + 2] = var7;
            this.field2075[var12 + 3] = var6;
            this.field2075[var12 + 4] = var5;
            this.field2075[var12 + 5] = var4;
            this.field2075[var12 + 6] = var3;
            this.field2075[var12 + 7] = var2;
        }
        this.method868(1);
        this.field2076 = 256;
    }

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "(I)I")
    public final int method871(int arg0) {
        if (arg0 != -4578) {
            method869(-59);
        }
        if ((this.field2076--) == 0) {
            this.method868(1);
            this.field2076 = 255;
        }
        field2080++;
        return this.field2088[this.field2076];
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "()V")
    private class116() {
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "([I)V")
    public class116(int[] arg0) {
        this.field2075 = new int[256];
        this.field2088 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field2088[var2] = arg0[var2];
        }
        this.method870(-1488592728);
    }
}
