import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class417 {

    @OriginalMember(owner = "client!lg", name = "m", descriptor = "[I")
    private int[] field5764;

    @OriginalMember(owner = "client!lg", name = "g", descriptor = "[I")
    private int[] field5758;

    @OriginalMember(owner = "client!lg", name = "i", descriptor = "F")
    public static float field5760;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "I")
    public static int field5752;

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "I")
    private int field5753;

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "I")
    private int field5755;

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "I")
    public static int field5756;

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "I")
    private int field5757;

    @OriginalMember(owner = "client!lg", name = "h", descriptor = "I")
    public static int field5759;

    @OriginalMember(owner = "client!lg", name = "j", descriptor = "I")
    private int field5761;

    @OriginalMember(owner = "client!lg", name = "k", descriptor = "I")
    public static int field5762;

    @OriginalMember(owner = "client!lg", name = "l", descriptor = "I")
    public static int field5763;

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "Lgw;")
    public static class172 field5754;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(B)I")
    public final int method2418(byte arg0) {
        if (arg0 > -117) {
            return 19;
        }
        field5756++;
        if (this.field5761 == 0) {
            this.method2420(12423);
            this.field5761 = 256;
        }
        return this.field5758[--this.field5761];
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(B)I")
    public final int method2419(byte arg0) {
        field5762++;
        if (this.field5761 == 0) {
            this.method2420(12423);
            this.field5761 = 256;
        }
        int var2 = 111 % ((55 - arg0) / 39);
        return this.field5758[this.field5761 - 1];
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)V")
    private final void method2420(int arg0) {
        field5752++;
        this.field5753 += ++this.field5757;
        if (arg0 != 12423) {
            this.field5757 = 112;
        }
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field5764[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field5755 ^= this.field5755 << 13;
                } else {
                    this.field5755 ^= this.field5755 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field5755 ^= this.field5755 << 2;
            } else {
                this.field5755 ^= this.field5755 >>> 16;
            }
            this.field5755 += this.field5764[var2 + 128 & 0xFF];
            int var4;
            this.field5764[var2] = var4 = this.field5764[class48.method346(var3, 1020) >> 2] + this.field5755 + this.field5753;
            this.field5758[var2] = this.field5753 = var3 + this.field5764[class48.method346(var4, 261152) >> 8 >> 2];
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lfa;Z)Ljava/lang/String;")
    public static final String method2421(class236 arg0, boolean arg1) {
        if (!arg1) {
            field5754 = null;
        }
        field5763++;
        return arg0.field3320 + " <col=ffffff>>";
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(I)V")
    public static void method2422(int arg0) {
        if (arg0 != -22833) {
            field5760 = 1.5757205F;
        }
        field5754 = null;
    }

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "(B)V")
    private final void method2423(byte arg0) {
        field5759++;
        int var2 = -90 / ((16 - arg0) / 55);
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;
        int var9 = -1640531527;
        int var10 = -1640531527;
        for (int var11 = 0; var11 < 4; var11++) {
            int var62 = var10 ^ var9 << 11;
            int var63 = var8 + var9;
            int var64 = var7 + var62;
            int var65 = var63 ^ var8 >>> 2;
            int var66 = var6 + var65;
            int var67 = var8 + var64;
            int var68 = var67 ^ var64 << 8;
            int var69 = var5 + var68;
            int var70 = var64 + var66;
            var7 = var70 ^ var66 >>> 16;
            int var71 = var66 + var69;
            int var72 = var4 + var7;
            var6 = var71 ^ var69 << 10;
            int var73 = var69 + var72;
            int var74 = var3 + var6;
            var5 = var73 ^ var72 >>> 4;
            int var75 = var5 + var62;
            int var76 = var72 + var74;
            var4 = var76 ^ var74 << 8;
            var9 = var4 + var65;
            int var77 = var74 + var75;
            var3 = var77 ^ var75 >>> 9;
            var8 = var3 + var68;
            var10 = var9 + var75;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var38 = this.field5758[var12 + 4] + var6;
            int var39 = this.field5758[var12 + 3] + var7;
            int var40 = this.field5758[var12 + 2] + var8;
            int var41 = this.field5758[var12 + 6] + var4;
            int var42 = this.field5758[var12 + 7] + var3;
            int var43 = this.field5758[var12] + var10;
            int var44 = this.field5758[var12 + 1] + var9;
            int var45 = this.field5758[var12 + 5] + var5;
            int var46 = var43 ^ var44 << 11;
            int var47 = var39 + var46;
            int var48 = var40 + var44;
            int var49 = var48 ^ var40 >>> 2;
            int var50 = var38 + var49;
            int var51 = var40 + var47;
            int var52 = var51 ^ var47 << 8;
            int var53 = var47 + var50;
            int var54 = var45 + var52;
            var7 = var53 ^ var50 >>> 16;
            int var55 = var50 + var54;
            int var56 = var7 + var41;
            var6 = var55 ^ var54 << 10;
            int var57 = var6 + var42;
            int var58 = var54 + var56;
            var5 = var58 ^ var56 >>> 4;
            int var59 = var56 + var57;
            int var60 = var5 + var46;
            var4 = var59 ^ var57 << 8;
            int var61 = var57 + var60;
            var9 = var4 + var49;
            var3 = var61 ^ var60 >>> 9;
            var8 = var3 + var52;
            var10 = var9 + var60;
            this.field5764[var12] = var10;
            this.field5764[var12 + 1] = var9;
            this.field5764[var12 + 2] = var8;
            this.field5764[var12 + 3] = var7;
            this.field5764[var12 + 4] = var6;
            this.field5764[var12 + 5] = var5;
            this.field5764[var12 + 6] = var4;
            this.field5764[var12 + 7] = var3;
        }
        for (int var13 = 0; var13 < 256; var13 += 8) {
            int var14 = this.field5764[var13 + 3] + var7;
            int var15 = this.field5764[var13 + 4] + var6;
            int var16 = this.field5764[var13 + 6] + var4;
            int var17 = this.field5764[var13] + var10;
            int var18 = this.field5764[var13 + 5] + var5;
            int var19 = this.field5764[var13 + 2] + var8;
            int var20 = this.field5764[var13 + 1] + var9;
            int var21 = this.field5764[var13 + 7] + var3;
            int var22 = var17 ^ var20 << 11;
            int var23 = var19 + var20;
            int var24 = var14 + var22;
            int var25 = var23 ^ var19 >>> 2;
            int var26 = var15 + var25;
            int var27 = var19 + var24;
            int var28 = var27 ^ var24 << 8;
            int var29 = var18 + var28;
            int var30 = var24 + var26;
            var7 = var30 ^ var26 >>> 16;
            int var31 = var7 + var16;
            int var32 = var26 + var29;
            var6 = var32 ^ var29 << 10;
            int var33 = var6 + var21;
            int var34 = var29 + var31;
            var5 = var34 ^ var31 >>> 4;
            int var35 = var31 + var33;
            int var36 = var5 + var22;
            var4 = var35 ^ var33 << 8;
            int var37 = var33 + var36;
            var9 = var4 + var25;
            var3 = var37 ^ var36 >>> 9;
            var10 = var9 + var36;
            var8 = var3 + var28;
            this.field5764[var13] = var10;
            this.field5764[var13 + 1] = var9;
            this.field5764[var13 + 2] = var8;
            this.field5764[var13 + 3] = var7;
            this.field5764[var13 + 4] = var6;
            this.field5764[var13 + 5] = var5;
            this.field5764[var13 + 6] = var4;
            this.field5764[var13 + 7] = var3;
        }
        this.method2420(12423);
        this.field5761 = 256;
    }

    @OriginalMember(owner = "client!lg", name = "<init>", descriptor = "()V")
    private class417() {
    }

    @OriginalMember(owner = "client!lg", name = "<init>", descriptor = "([I)V")
    public class417(int[] arg0) {
        this.field5764 = new int[256];
        this.field5758 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field5758[var2] = arg0[var2];
        }
        this.method2423((byte) 98);
    }
}
