import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bs")
public class class447 {

    @OriginalMember(owner = "client!bs", name = "h", descriptor = "[I")
    private int[] field6188;

    @OriginalMember(owner = "client!bs", name = "c", descriptor = "[I")
    private int[] field6183;

    @OriginalMember(owner = "client!bs", name = "g", descriptor = "Ldk;")
    public static class326 field6187 = new class326("Face here", "Hierhin drehen", "Regarder dans cette direction", "Virar para cá");

    @OriginalMember(owner = "client!bs", name = "l", descriptor = "Lkr;")
    public static class486 field6192 = new class486();

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "I")
    public static int field6181;

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "I")
    private int field6182;

    @OriginalMember(owner = "client!bs", name = "d", descriptor = "I")
    private int field6184;

    @OriginalMember(owner = "client!bs", name = "e", descriptor = "I")
    public static int field6185;

    @OriginalMember(owner = "client!bs", name = "f", descriptor = "I")
    public static int field6186;

    @OriginalMember(owner = "client!bs", name = "i", descriptor = "I")
    public static int field6189;

    @OriginalMember(owner = "client!bs", name = "j", descriptor = "I")
    private int field6190;

    @OriginalMember(owner = "client!bs", name = "k", descriptor = "I")
    private int field6191;

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(I)V")
    private final void method2608(int arg0) {
        field6186++;
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
            int var72 = var69 + var71;
            int var73 = var2 + var5;
            var4 = var72 ^ var71 >>> 4;
            int var74 = var4 + var61;
            int var75 = var71 + var73;
            var3 = var75 ^ var73 << 8;
            var8 = var3 + var64;
            int var76 = var73 + var74;
            var2 = var76 ^ var74 >>> 9;
            var9 = var8 + var74;
            var7 = var2 + var67;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field6183[var11 + 7] + var2;
            int var38 = this.field6183[var11 + 6] + var3;
            int var39 = this.field6183[var11 + 5] + var4;
            int var40 = this.field6183[var11] + var9;
            int var41 = this.field6183[var11 + 3] + var6;
            int var42 = this.field6183[var11 + 4] + var5;
            int var43 = this.field6183[var11 + 1] + var8;
            int var44 = this.field6183[var11 + 2] + var7;
            int var45 = var40 ^ var43 << 11;
            int var46 = var43 + var44;
            int var47 = var41 + var45;
            int var48 = var46 ^ var44 >>> 2;
            int var49 = var42 + var48;
            int var50 = var44 + var47;
            int var51 = var50 ^ var47 << 8;
            int var52 = var39 + var51;
            int var53 = var47 + var49;
            var6 = var53 ^ var49 >>> 16;
            int var54 = var49 + var52;
            int var55 = var6 + var38;
            var5 = var54 ^ var52 << 10;
            int var56 = var5 + var37;
            int var57 = var52 + var55;
            var4 = var57 ^ var55 >>> 4;
            int var58 = var4 + var45;
            int var59 = var55 + var56;
            var3 = var59 ^ var56 << 8;
            int var60 = var56 + var58;
            var8 = var3 + var48;
            var2 = var60 ^ var58 >>> 9;
            var7 = var2 + var51;
            var9 = var8 + var58;
            this.field6188[var11] = var9;
            this.field6188[var11 + 1] = var8;
            this.field6188[var11 + 2] = var7;
            this.field6188[var11 + 3] = var6;
            this.field6188[var11 + 4] = var5;
            this.field6188[var11 + 5] = var4;
            this.field6188[var11 + 6] = var3;
            this.field6188[var11 + 7] = var2;
        }
        int var12 = 0;
        if (arg0 != -271192984) {
            this.method2608(-92);
        }
        while (var12 < 256) {
            int var13 = this.field6188[var12 + 6] + var3;
            int var14 = this.field6188[var12 + 4] + var5;
            int var15 = this.field6188[var12 + 1] + var8;
            int var16 = this.field6188[var12] + var9;
            int var17 = this.field6188[var12 + 7] + var2;
            int var18 = this.field6188[var12 + 5] + var4;
            int var19 = this.field6188[var12 + 3] + var6;
            int var20 = this.field6188[var12 + 2] + var7;
            int var21 = var16 ^ var15 << 11;
            int var22 = var19 + var21;
            int var23 = var15 + var20;
            int var24 = var23 ^ var20 >>> 2;
            int var25 = var14 + var24;
            int var26 = var20 + var22;
            int var27 = var26 ^ var22 << 8;
            int var28 = var22 + var25;
            int var29 = var18 + var27;
            var6 = var28 ^ var25 >>> 16;
            int var30 = var25 + var29;
            int var31 = var6 + var13;
            var5 = var30 ^ var29 << 10;
            int var32 = var5 + var17;
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
            this.field6188[var12] = var9;
            this.field6188[var12 + 1] = var8;
            this.field6188[var12 + 2] = var7;
            this.field6188[var12 + 3] = var6;
            this.field6188[var12 + 4] = var5;
            this.field6188[var12 + 5] = var4;
            this.field6188[var12 + 6] = var3;
            this.field6188[var12 + 7] = var2;
            var12 += 8;
        }
        this.method2612((byte) -100);
        this.field6184 = 256;
    }

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "(I)V")
    public static void method2609(int arg0) {
        if (arg0 > 72) {
            field6192 = null;
            field6187 = null;
        }
    }

    @OriginalMember(owner = "client!bs", name = "c", descriptor = "(I)I")
    public final int method2610(int arg0) {
        field6181++;
        if (this.field6184 == 0) {
            this.method2612((byte) -100);
            this.field6184 = 256;
        }
        int var2 = -61 / ((-arg0 - 32) / 53);
        return this.field6183[--this.field6184];
    }

    @OriginalMember(owner = "client!bs", name = "<init>", descriptor = "()V")
    private class447() {
    }

    @OriginalMember(owner = "client!bs", name = "<init>", descriptor = "([I)V")
    public class447(int[] arg0) {
        this.field6188 = new int[256];
        this.field6183 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field6183[var2] = arg0[var2];
        }
        this.method2608(-271192984);
    }

    @OriginalMember(owner = "client!bs", name = "d", descriptor = "(I)I")
    public final int method2611(int arg0) {
        field6189++;
        if (this.field6184 == 0) {
            this.method2612((byte) -100);
            this.field6184 = 256;
        }
        if (arg0 <= 9) {
            this.field6184 = 57;
        }
        return this.field6183[this.field6184 - 1];
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(B)V")
    private final void method2612(byte arg0) {
        field6185++;
        this.field6190 += ++this.field6182;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field6188[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field6191 ^= this.field6191 << 13;
                } else {
                    this.field6191 ^= this.field6191 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field6191 ^= this.field6191 << 2;
            } else {
                this.field6191 ^= this.field6191 >>> 16;
            }
            this.field6191 += this.field6188[var2 + 128 & 0xFF];
            int var4;
            this.field6188[var2] = var4 = this.field6191 + this.field6190 + this.field6188[class367.method2256(var3, 1020) >> 2];
            this.field6183[var2] = this.field6190 = this.field6188[class367.method2256(var4 >> 8 >> 2, 255)] + var3;
        }
        if (arg0 != -100) {
            field6187 = null;
        }
    }
}
