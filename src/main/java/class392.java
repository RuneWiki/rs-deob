import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class392 {

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "[I")
    private int[] field5946;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "[I")
    private int[] field5944;

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "Lss;")
    public static class213 field5948 = new class213("Self", "Mich", "Moi", "Eu");

    @OriginalMember(owner = "client!ei", name = "k", descriptor = "Lbi;")
    public static class104 field5954 = new class104(67, 6);

    @OriginalMember(owner = "client!ei", name = "m", descriptor = "Lbi;")
    public static class104 field5956 = new class104(31, 2);

    @OriginalMember(owner = "client!ei", name = "o", descriptor = "Lnj;")
    public static class317 field5958 = new class317();

    @OriginalMember(owner = "client!ei", name = "f", descriptor = "F")
    public static float field5949;

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "I")
    public static int field5945;

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "I")
    private int field5947;

    @OriginalMember(owner = "client!ei", name = "g", descriptor = "I")
    private int field5950;

    @OriginalMember(owner = "client!ei", name = "h", descriptor = "I")
    private int field5951;

    @OriginalMember(owner = "client!ei", name = "i", descriptor = "I")
    public static int field5952;

    @OriginalMember(owner = "client!ei", name = "j", descriptor = "I")
    private int field5953;

    @OriginalMember(owner = "client!ei", name = "l", descriptor = "I")
    public static int field5955;

    @OriginalMember(owner = "client!ei", name = "n", descriptor = "I")
    public static int field5957;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(B)V")
    public static void method2498(byte arg0) {
        if (arg0 > -86) {
            field5956 = null;
        }
        field5958 = null;
        field5956 = null;
        field5948 = null;
        field5954 = null;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(I)V")
    private final void method2499(int arg0) {
        field5955++;
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
            int var65 = var5 + var64;
            int var66 = var7 + var63;
            int var67 = var66 ^ var63 << 8;
            int var68 = var63 + var65;
            int var69 = var4 + var67;
            var6 = var68 ^ var65 >>> 16;
            int var70 = var3 + var6;
            int var71 = var65 + var69;
            var5 = var71 ^ var69 << 10;
            int var72 = var2 + var5;
            int var73 = var69 + var70;
            var4 = var73 ^ var70 >>> 4;
            int var74 = var4 + var61;
            int var75 = var70 + var72;
            var3 = var75 ^ var72 << 8;
            int var76 = var72 + var74;
            var8 = var3 + var64;
            var2 = var76 ^ var74 >>> 9;
            var9 = var8 + var74;
            var7 = var2 + var67;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field5946[var11] + var9;
            int var38 = this.field5946[var11 + 1] + var8;
            int var39 = this.field5946[var11 + 4] + var5;
            int var40 = this.field5946[var11 + 6] + var3;
            int var41 = this.field5946[var11 + 3] + var6;
            int var42 = this.field5946[var11 + 5] + var4;
            int var43 = this.field5946[var11 + 2] + var7;
            int var44 = this.field5946[var11 + 7] + var2;
            int var45 = var37 ^ var38 << 11;
            int var46 = var41 + var45;
            int var47 = var38 + var43;
            int var48 = var47 ^ var43 >>> 2;
            int var49 = var39 + var48;
            int var50 = var43 + var46;
            int var51 = var50 ^ var46 << 8;
            int var52 = var42 + var51;
            int var53 = var46 + var49;
            var6 = var53 ^ var49 >>> 16;
            int var54 = var49 + var52;
            int var55 = var6 + var40;
            var5 = var54 ^ var52 << 10;
            int var56 = var52 + var55;
            int var57 = var5 + var44;
            var4 = var56 ^ var55 >>> 4;
            int var58 = var4 + var45;
            int var59 = var55 + var57;
            var3 = var59 ^ var57 << 8;
            int var60 = var57 + var58;
            var8 = var3 + var48;
            var2 = var60 ^ var58 >>> 9;
            var7 = var2 + var51;
            var9 = var8 + var58;
            this.field5944[var11] = var9;
            this.field5944[var11 + 1] = var8;
            this.field5944[var11 + 2] = var7;
            this.field5944[var11 + 3] = var6;
            this.field5944[var11 + 4] = var5;
            this.field5944[var11 + 5] = var4;
            this.field5944[var11 + 6] = var3;
            this.field5944[var11 + 7] = var2;
        }
        int var12 = 0;
        if (arg0 != -14336) {
            return;
        }
        while (var12 < 256) {
            int var13 = this.field5944[var12 + 6] + var3;
            int var14 = this.field5944[var12 + 7] + var2;
            int var15 = this.field5944[var12 + 4] + var5;
            int var16 = this.field5944[var12] + var9;
            int var17 = this.field5944[var12 + 3] + var6;
            int var18 = this.field5944[var12 + 1] + var8;
            int var19 = this.field5944[var12 + 2] + var7;
            int var20 = this.field5944[var12 + 5] + var4;
            int var21 = var16 ^ var18 << 11;
            int var22 = var17 + var21;
            int var23 = var18 + var19;
            int var24 = var23 ^ var19 >>> 2;
            int var25 = var19 + var22;
            int var26 = var15 + var24;
            int var27 = var25 ^ var22 << 8;
            int var28 = var22 + var26;
            int var29 = var20 + var27;
            var6 = var28 ^ var26 >>> 16;
            int var30 = var26 + var29;
            int var31 = var6 + var13;
            var5 = var30 ^ var29 << 10;
            int var32 = var5 + var14;
            int var33 = var29 + var31;
            var4 = var33 ^ var31 >>> 4;
            int var34 = var4 + var21;
            int var35 = var31 + var32;
            var3 = var35 ^ var32 << 8;
            var8 = var3 + var24;
            int var36 = var32 + var34;
            var2 = var36 ^ var34 >>> 9;
            var9 = var8 + var34;
            var7 = var2 + var27;
            this.field5944[var12] = var9;
            this.field5944[var12 + 1] = var8;
            this.field5944[var12 + 2] = var7;
            this.field5944[var12 + 3] = var6;
            this.field5944[var12 + 4] = var5;
            this.field5944[var12 + 5] = var4;
            this.field5944[var12 + 6] = var3;
            this.field5944[var12 + 7] = var2;
            var12 += 8;
        }
        this.method2501(true);
        this.field5951 = 256;
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(I)I")
    public final int method2500(int arg0) {
        if (this.field5951 == 0) {
            this.method2501(true);
            this.field5951 = 256;
        }
        int var2 = 63 / ((3 - arg0) / 35);
        field5952++;
        return this.field5946[--this.field5951];
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Z)V")
    private final void method2501(boolean arg0) {
        field5957++;
        this.field5947 += ++this.field5950;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field5944[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field5953 ^= this.field5953 << 13;
                } else {
                    this.field5953 ^= this.field5953 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field5953 ^= this.field5953 << 2;
            } else {
                this.field5953 ^= this.field5953 >>> 16;
            }
            this.field5953 += this.field5944[var2 + 128 & 0xFF];
            int var4;
            this.field5944[var2] = var4 = this.field5944[class272.method1842(var3 >> 2, 255)] + (this.field5953 + this.field5947);
            this.field5946[var2] = this.field5947 = this.field5944[class272.method1842(255, var4 >> 8 >> 2)] + var3;
        }
        if (!arg0) {
            this.field5950 = -53;
        }
    }

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "()V")
    private class392() {
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(B)I")
    public final int method2502(byte arg0) {
        int var2 = -92 / ((arg0 + 45) / 35);
        if (this.field5951 == 0) {
            this.method2501(true);
            this.field5951 = 256;
        }
        field5945++;
        return this.field5946[this.field5951 - 1];
    }

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "([I)V")
    public class392(int[] arg0) {
        this.field5946 = new int[256];
        this.field5944 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field5946[var2] = arg0[var2];
        }
        this.method2499(-14336);
    }
}
