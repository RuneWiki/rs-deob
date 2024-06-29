import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class202 {

    @OriginalMember(owner = "client!mc", name = "k", descriptor = "[I")
    private int[] field3241;

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "[I")
    private int[] field3233;

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "Z")
    public static boolean field3232 = false;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "I")
    public static int field3231;

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "I")
    public static int field3235;

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "I")
    private int field3236;

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "I")
    private int field3237;

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "I")
    public static int field3238;

    @OriginalMember(owner = "client!mc", name = "i", descriptor = "I")
    public static int field3239;

    @OriginalMember(owner = "client!mc", name = "j", descriptor = "I")
    private int field3240;

    @OriginalMember(owner = "client!mc", name = "l", descriptor = "I")
    public static int field3242;

    @OriginalMember(owner = "client!mc", name = "m", descriptor = "I")
    private int field3243;

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "Z")
    public static boolean field3234;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(B)V")
    public static final void method1484(byte arg0) {
        if (arg0 != 72) {
            method1484((byte) 115);
        }
        field3238++;
        class181.field2915.method1556((byte) 68);
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Z)V")
    private final void method1485(boolean arg0) {
        this.field3236 += ++this.field3243;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field3241[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field3240 ^= this.field3240 << 13;
                } else {
                    this.field3240 ^= this.field3240 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field3240 ^= this.field3240 << 2;
            } else {
                this.field3240 ^= this.field3240 >>> 16;
            }
            this.field3240 += this.field3241[var2 + 128 & 0xFF];
            int var4;
            this.field3241[var2] = var4 = this.field3240 + this.field3241[class179.method1337(var3 >> 2, 255)] + this.field3236;
            this.field3233[var2] = this.field3236 = this.field3241[class179.method1337(255, var4 >> 8 >> 2)] + var3;
        }
        if (arg0) {
            field3234 = false;
        }
        field3242++;
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(B)V")
    private final void method1486(byte arg0) {
        field3235++;
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
            int var70 = var66 + var68;
            int var71 = var3 + var6;
            var5 = var70 ^ var68 << 10;
            int var72 = var2 + var5;
            int var73 = var68 + var71;
            var4 = var73 ^ var71 >>> 4;
            int var74 = var4 + var61;
            int var75 = var71 + var72;
            var3 = var75 ^ var72 << 8;
            var8 = var3 + var64;
            int var76 = var72 + var74;
            var2 = var76 ^ var74 >>> 9;
            var7 = var2 + var67;
            var9 = var8 + var74;
        }
        if (arg0 != -22) {
            field3232 = true;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field3233[var11 + 5] + var4;
            int var38 = this.field3233[var11 + 3] + var6;
            int var39 = this.field3233[var11 + 6] + var3;
            int var40 = this.field3233[var11] + var9;
            int var41 = this.field3233[var11 + 7] + var2;
            int var42 = this.field3233[var11 + 4] + var5;
            int var43 = this.field3233[var11 + 1] + var8;
            int var44 = this.field3233[var11 + 2] + var7;
            int var45 = var40 ^ var43 << 11;
            int var46 = var38 + var45;
            int var47 = var43 + var44;
            int var48 = var47 ^ var44 >>> 2;
            int var49 = var42 + var48;
            int var50 = var44 + var46;
            int var51 = var50 ^ var46 << 8;
            int var52 = var37 + var51;
            int var53 = var46 + var49;
            var6 = var53 ^ var49 >>> 16;
            int var54 = var6 + var39;
            int var55 = var49 + var52;
            var5 = var55 ^ var52 << 10;
            int var56 = var52 + var54;
            var4 = var56 ^ var54 >>> 4;
            int var57 = var4 + var45;
            int var58 = var5 + var41;
            int var59 = var54 + var58;
            var3 = var59 ^ var58 << 8;
            var8 = var3 + var48;
            int var60 = var57 + var58;
            var2 = var60 ^ var57 >>> 9;
            var7 = var2 + var51;
            var9 = var8 + var57;
            this.field3241[var11] = var9;
            this.field3241[var11 + 1] = var8;
            this.field3241[var11 + 2] = var7;
            this.field3241[var11 + 3] = var6;
            this.field3241[var11 + 4] = var5;
            this.field3241[var11 + 5] = var4;
            this.field3241[var11 + 6] = var3;
            this.field3241[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field3241[var12 + 4] + var5;
            int var14 = this.field3241[var12] + var9;
            int var15 = this.field3241[var12 + 5] + var4;
            int var16 = this.field3241[var12 + 1] + var8;
            int var17 = this.field3241[var12 + 2] + var7;
            int var18 = this.field3241[var12 + 6] + var3;
            int var19 = this.field3241[var12 + 7] + var2;
            int var20 = var14 ^ var16 << 11;
            int var21 = this.field3241[var12 + 3] + var6;
            int var22 = var16 + var17;
            int var23 = var20 + var21;
            int var24 = var22 ^ var17 >>> 2;
            int var25 = var13 + var24;
            int var26 = var17 + var23;
            int var27 = var26 ^ var23 << 8;
            int var28 = var23 + var25;
            int var29 = var15 + var27;
            var6 = var28 ^ var25 >>> 16;
            int var30 = var6 + var18;
            int var31 = var25 + var29;
            var5 = var31 ^ var29 << 10;
            int var32 = var29 + var30;
            int var33 = var5 + var19;
            var4 = var32 ^ var30 >>> 4;
            int var34 = var30 + var33;
            var3 = var34 ^ var33 << 8;
            var8 = var3 + var24;
            int var35 = var4 + var20;
            int var36 = var33 + var35;
            var2 = var36 ^ var35 >>> 9;
            var7 = var2 + var27;
            var9 = var8 + var35;
            this.field3241[var12] = var9;
            this.field3241[var12 + 1] = var8;
            this.field3241[var12 + 2] = var7;
            this.field3241[var12 + 3] = var6;
            this.field3241[var12 + 4] = var5;
            this.field3241[var12 + 5] = var4;
            this.field3241[var12 + 6] = var3;
            this.field3241[var12 + 7] = var2;
        }
        this.method1485(false);
        this.field3237 = 256;
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(Z)I")
    public final int method1487(boolean arg0) {
        field3239++;
        if (this.field3237-- == 0) {
            this.method1485(false);
            this.field3237 = 255;
        }
        return arg0 ? 74 : this.field3233[this.field3237];
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "()V")
    private class202() {
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "([I)V")
    public class202(int[] arg0) {
        this.field3241 = new int[256];
        this.field3233 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field3233[var2] = arg0[var2];
        }
        this.method1486((byte) -22);
    }
}
