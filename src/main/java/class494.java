import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class494 {

    @OriginalMember(owner = "client!fj", name = "g", descriptor = "[I")
    private int[] field7230;

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "[I")
    private int[] field7228;

    @OriginalMember(owner = "client!fj", name = "k", descriptor = "Lgt;")
    public static class65 field7234 = null;

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "I")
    public static int field7225 = 1406;

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "I")
    private int field7226;

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "I")
    private int field7227;

    @OriginalMember(owner = "client!fj", name = "f", descriptor = "I")
    private int field7229;

    @OriginalMember(owner = "client!fj", name = "h", descriptor = "I")
    public static int field7231;

    @OriginalMember(owner = "client!fj", name = "i", descriptor = "I")
    private int field7232;

    @OriginalMember(owner = "client!fj", name = "j", descriptor = "I")
    public static int field7233;

    @OriginalMember(owner = "client!fj", name = "l", descriptor = "I")
    public static int field7235;

    @OriginalMember(owner = "client!fj", name = "m", descriptor = "I")
    public static int field7236;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "Ldn;")
    public static class201 field7224;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Z)I")
    public final int method2954(boolean arg0) {
        field7231++;
        if (this.field7232 == 0) {
            this.method2956(-107);
            this.field7232 = 256;
        }
        if (arg0) {
            this.method2957(-101);
        }
        return this.field7230[this.field7232 - 1];
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(I)V")
    public static void method2955(int arg0) {
        field7234 = null;
        field7224 = null;
        if (arg0 >= -58) {
            field7225 = -6;
        }
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(I)V")
    private final void method2956(int arg0) {
        field7233++;
        this.field7229 += ++this.field7226;
        for (int var2 = 0; var2 < 256; var2++) {
            int var4 = this.field7228[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field7227 ^= this.field7227 << 13;
                } else {
                    this.field7227 ^= this.field7227 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field7227 ^= this.field7227 << 2;
            } else {
                this.field7227 ^= this.field7227 >>> 16;
            }
            this.field7227 += this.field7228[var2 + 128 & 0xFF];
            int var5;
            this.field7228[var2] = var5 = this.field7227 + (this.field7228[class60.method339(var4, 1020) >> 2] + this.field7229);
            this.field7230[var2] = this.field7229 = this.field7228[class60.method339(1020, var5 >> 8) >> 2] + var4;
        }
        int var3 = 56 / ((6 - arg0) / 51);
    }

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "(I)I")
    public final int method2957(int arg0) {
        if (this.field7232 == 0) {
            this.method2956(-112);
            this.field7232 = 256;
        }
        if (arg0 == -9570) {
            field7236++;
            return this.field7230[--this.field7232];
        } else {
            return 99;
        }
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(Z)V")
    private final void method2958(boolean arg0) {
        field7235++;
        if (!arg0) {
            this.method2957(60);
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
            int var71 = var3 + var6;
            var5 = var70 ^ var69 << 10;
            int var72 = var2 + var5;
            int var73 = var69 + var71;
            var4 = var73 ^ var71 >>> 4;
            int var74 = var4 + var61;
            int var75 = var71 + var72;
            var3 = var75 ^ var72 << 8;
            int var76 = var72 + var74;
            var8 = var3 + var64;
            var2 = var76 ^ var74 >>> 9;
            var7 = var2 + var67;
            var9 = var8 + var74;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field7230[var11 + 1] + var8;
            int var38 = this.field7230[var11 + 4] + var5;
            int var39 = this.field7230[var11 + 6] + var3;
            int var40 = this.field7230[var11 + 2] + var7;
            int var41 = this.field7230[var11 + 7] + var2;
            int var42 = this.field7230[var11 + 5] + var4;
            int var43 = this.field7230[var11 + 3] + var6;
            int var44 = this.field7230[var11] + var9;
            int var45 = var44 ^ var37 << 11;
            int var46 = var37 + var40;
            int var47 = var43 + var45;
            int var48 = var46 ^ var40 >>> 2;
            int var49 = var38 + var48;
            int var50 = var40 + var47;
            int var51 = var50 ^ var47 << 8;
            int var52 = var47 + var49;
            int var53 = var42 + var51;
            var6 = var52 ^ var49 >>> 16;
            int var54 = var49 + var53;
            int var55 = var6 + var39;
            var5 = var54 ^ var53 << 10;
            int var56 = var53 + var55;
            int var57 = var5 + var41;
            var4 = var56 ^ var55 >>> 4;
            int var58 = var55 + var57;
            int var59 = var4 + var45;
            var3 = var58 ^ var57 << 8;
            var8 = var3 + var48;
            int var60 = var57 + var59;
            var2 = var60 ^ var59 >>> 9;
            var7 = var2 + var51;
            var9 = var8 + var59;
            this.field7228[var11] = var9;
            this.field7228[var11 + 1] = var8;
            this.field7228[var11 + 2] = var7;
            this.field7228[var11 + 3] = var6;
            this.field7228[var11 + 4] = var5;
            this.field7228[var11 + 5] = var4;
            this.field7228[var11 + 6] = var3;
            this.field7228[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field7228[var12 + 5] + var4;
            int var14 = this.field7228[var12 + 6] + var3;
            int var15 = this.field7228[var12 + 2] + var7;
            int var16 = this.field7228[var12] + var9;
            int var17 = this.field7228[var12 + 1] + var8;
            int var18 = this.field7228[var12 + 4] + var5;
            int var19 = this.field7228[var12 + 7] + var2;
            int var20 = this.field7228[var12 + 3] + var6;
            int var21 = var16 ^ var17 << 11;
            int var22 = var20 + var21;
            int var23 = var15 + var17;
            int var24 = var23 ^ var15 >>> 2;
            int var25 = var15 + var22;
            int var26 = var18 + var24;
            int var27 = var25 ^ var22 << 8;
            int var28 = var13 + var27;
            int var29 = var22 + var26;
            var6 = var29 ^ var26 >>> 16;
            int var30 = var6 + var14;
            int var31 = var26 + var28;
            var5 = var31 ^ var28 << 10;
            int var32 = var28 + var30;
            int var33 = var5 + var19;
            var4 = var32 ^ var30 >>> 4;
            int var34 = var4 + var21;
            int var35 = var30 + var33;
            var3 = var35 ^ var33 << 8;
            var8 = var3 + var24;
            int var36 = var33 + var34;
            var2 = var36 ^ var34 >>> 9;
            var9 = var8 + var34;
            var7 = var2 + var27;
            this.field7228[var12] = var9;
            this.field7228[var12 + 1] = var8;
            this.field7228[var12 + 2] = var7;
            this.field7228[var12 + 3] = var6;
            this.field7228[var12 + 4] = var5;
            this.field7228[var12 + 5] = var4;
            this.field7228[var12 + 6] = var3;
            this.field7228[var12 + 7] = var2;
        }
        this.method2956(90);
        this.field7232 = 256;
    }

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "()V")
    private class494() {
    }

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "([I)V")
    public class494(int[] arg0) {
        this.field7230 = new int[256];
        this.field7228 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field7230[var2] = arg0[var2];
        }
        this.method2958(true);
    }
}
