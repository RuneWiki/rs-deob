import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dp")
public class class3 {

    @OriginalMember(owner = "client!dp", name = "m", descriptor = "[I")
    private int[] field42;

    @OriginalMember(owner = "client!dp", name = "j", descriptor = "[I")
    private int[] field39;

    @OriginalMember(owner = "client!dp", name = "e", descriptor = "Lbg;")
    public static class324 field34 = new class324(35, -2);

    @OriginalMember(owner = "client!dp", name = "i", descriptor = "I")
    public static int field38 = 0;

    @OriginalMember(owner = "client!dp", name = "f", descriptor = "Lho;")
    public static class102 field35 = new class102(8, 0, 4, 1);

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "I")
    private int field30;

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "I")
    public static int field31;

    @OriginalMember(owner = "client!dp", name = "c", descriptor = "I")
    private int field32;

    @OriginalMember(owner = "client!dp", name = "d", descriptor = "I")
    public static int field33;

    @OriginalMember(owner = "client!dp", name = "g", descriptor = "I")
    public static int field36;

    @OriginalMember(owner = "client!dp", name = "h", descriptor = "I")
    public static int field37;

    @OriginalMember(owner = "client!dp", name = "k", descriptor = "I")
    private int field40;

    @OriginalMember(owner = "client!dp", name = "l", descriptor = "I")
    private int field41;

    @OriginalMember(owner = "client!dp", name = "n", descriptor = "I")
    public static int field43;

    @OriginalMember(owner = "client!dp", name = "o", descriptor = "Lfs;")
    public static class387 field44;

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(I)V")
    public static void method16(int arg0) {
        if (arg0 != 1049069386) {
            field34 = null;
        }
        field34 = null;
        field35 = null;
        field44 = null;
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(B)V")
    private final void method17(byte arg0) {
        field31++;
        if (arg0 >= -31) {
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
            int var65 = var7 + var62;
            int var66 = var5 + var64;
            int var67 = var65 ^ var62 << 8;
            int var68 = var4 + var67;
            int var69 = var62 + var66;
            var6 = var69 ^ var66 >>> 16;
            int var70 = var3 + var6;
            int var71 = var66 + var68;
            var5 = var71 ^ var68 << 10;
            int var72 = var68 + var70;
            int var73 = var2 + var5;
            var4 = var72 ^ var70 >>> 4;
            int var74 = var70 + var73;
            int var75 = var4 + var61;
            var3 = var74 ^ var73 << 8;
            int var76 = var73 + var75;
            var8 = var3 + var64;
            var2 = var76 ^ var75 >>> 9;
            var9 = var8 + var75;
            var7 = var2 + var67;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field42[var11 + 2] + var7;
            int var38 = this.field42[var11 + 7] + var2;
            int var39 = this.field42[var11 + 5] + var4;
            int var40 = this.field42[var11 + 4] + var5;
            int var41 = this.field42[var11 + 6] + var3;
            int var42 = this.field42[var11 + 3] + var6;
            int var43 = this.field42[var11] + var9;
            int var44 = this.field42[var11 + 1] + var8;
            int var45 = var43 ^ var44 << 11;
            int var46 = var42 + var45;
            int var47 = var37 + var44;
            int var48 = var47 ^ var37 >>> 2;
            int var49 = var37 + var46;
            int var50 = var40 + var48;
            int var51 = var49 ^ var46 << 8;
            int var52 = var46 + var50;
            int var53 = var39 + var51;
            var6 = var52 ^ var50 >>> 16;
            int var54 = var6 + var41;
            int var55 = var50 + var53;
            var5 = var55 ^ var53 << 10;
            int var56 = var53 + var54;
            int var57 = var5 + var38;
            var4 = var56 ^ var54 >>> 4;
            int var58 = var4 + var45;
            int var59 = var54 + var57;
            var3 = var59 ^ var57 << 8;
            int var60 = var57 + var58;
            var8 = var3 + var48;
            var2 = var60 ^ var58 >>> 9;
            var7 = var2 + var51;
            var9 = var8 + var58;
            this.field39[var11] = var9;
            this.field39[var11 + 1] = var8;
            this.field39[var11 + 2] = var7;
            this.field39[var11 + 3] = var6;
            this.field39[var11 + 4] = var5;
            this.field39[var11 + 5] = var4;
            this.field39[var11 + 6] = var3;
            this.field39[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field39[var12 + 4] + var5;
            int var14 = this.field39[var12 + 3] + var6;
            int var15 = this.field39[var12 + 1] + var8;
            int var16 = this.field39[var12 + 2] + var7;
            int var17 = this.field39[var12 + 6] + var3;
            int var18 = this.field39[var12] + var9;
            int var19 = this.field39[var12 + 7] + var2;
            int var20 = this.field39[var12 + 5] + var4;
            int var21 = var18 ^ var15 << 11;
            int var22 = var15 + var16;
            int var23 = var14 + var21;
            int var24 = var22 ^ var16 >>> 2;
            int var25 = var16 + var23;
            int var26 = var13 + var24;
            int var27 = var25 ^ var23 << 8;
            int var28 = var20 + var27;
            int var29 = var23 + var26;
            var6 = var29 ^ var26 >>> 16;
            int var30 = var6 + var17;
            int var31 = var26 + var28;
            var5 = var31 ^ var28 << 10;
            int var32 = var5 + var19;
            int var33 = var28 + var30;
            var4 = var33 ^ var30 >>> 4;
            int var34 = var4 + var21;
            int var35 = var30 + var32;
            var3 = var35 ^ var32 << 8;
            var8 = var3 + var24;
            int var36 = var32 + var34;
            var2 = var36 ^ var34 >>> 9;
            var7 = var2 + var27;
            var9 = var8 + var34;
            this.field39[var12] = var9;
            this.field39[var12 + 1] = var8;
            this.field39[var12 + 2] = var7;
            this.field39[var12 + 3] = var6;
            this.field39[var12 + 4] = var5;
            this.field39[var12 + 5] = var4;
            this.field39[var12 + 6] = var3;
            this.field39[var12 + 7] = var2;
        }
        this.method20(115);
        this.field41 = 256;
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(BIII)I")
    public static final int method18(byte arg0, int arg1, int arg2, int arg3) {
        field37++;
        if (arg2 == arg3) {
            return arg2;
        } else if (arg0 == 86) {
            int var4 = 128 - arg1;
            int var5 = (arg2 & 0x7F) * var4 + (arg3 & 0x7F) * arg1 >> 7;
            int var6 = (arg2 & 0x380) * var4 + (arg3 & 0x380) * arg1 >> 7;
            int var7 = (arg2 & 0xFC00) * var4 + (arg3 & 0xFC00) * arg1 >> 7;
            return var7 & 0xFC00 | var6 & 0x380 | var5 & 0x7F;
        } else {
            return 6;
        }
    }

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "(B)I")
    public final int method19(byte arg0) {
        field43++;
        if (this.field41 == 0) {
            this.method20(117);
            this.field41 = 256;
        }
        return arg0 > -77 ? 65 : this.field42[--this.field41];
    }

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "(I)V")
    private final void method20(int arg0) {
        if (arg0 <= 94) {
            this.field32 = 7;
        }
        field36++;
        this.field30 += ++this.field40;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field39[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field32 ^= this.field32 << 13;
                } else {
                    this.field32 ^= this.field32 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field32 ^= this.field32 << 2;
            } else {
                this.field32 ^= this.field32 >>> 16;
            }
            this.field32 += this.field39[var2 + 128 & 0xFF];
            int var4;
            this.field39[var2] = var4 = this.field30 + this.field39[class345.method2089(255, var3 >> 2)] + this.field32;
            this.field42[var2] = this.field30 = var3 + this.field39[class345.method2089(1020, var4 >> 8) >> 2];
        }
    }

    @OriginalMember(owner = "client!dp", name = "c", descriptor = "(I)I")
    public final int method21(int arg0) {
        field33++;
        if (this.field41 == 0) {
            this.method20(122);
            this.field41 = 256;
        }
        if (arg0 != 855258338) {
            this.field40 = -67;
        }
        return this.field42[this.field41 - 1];
    }

    @OriginalMember(owner = "client!dp", name = "<init>", descriptor = "()V")
    private class3() {
    }

    @OriginalMember(owner = "client!dp", name = "<init>", descriptor = "([I)V")
    public class3(int[] arg0) {
        this.field42 = new int[256];
        this.field39 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field42[var2] = arg0[var2];
        }
        this.method17((byte) -84);
    }
}
