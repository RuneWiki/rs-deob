import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class157 {

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "[I")
    private int[] field2411;

    @OriginalMember(owner = "client!gi", name = "i", descriptor = "[I")
    private int[] field2418;

    @OriginalMember(owner = "client!gi", name = "m", descriptor = "I")
    public static int field2422 = -1;

    @OriginalMember(owner = "client!gi", name = "g", descriptor = "Z")
    public static boolean field2416 = false;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "I")
    public static int field2410;

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "I")
    public static int field2412;

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "I")
    public static int field2414;

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "I")
    private int field2415;

    @OriginalMember(owner = "client!gi", name = "j", descriptor = "I")
    private int field2419;

    @OriginalMember(owner = "client!gi", name = "k", descriptor = "I")
    private int field2420;

    @OriginalMember(owner = "client!gi", name = "l", descriptor = "I")
    private int field2421;

    @OriginalMember(owner = "client!gi", name = "n", descriptor = "I")
    public static int field2423;

    @OriginalMember(owner = "client!gi", name = "h", descriptor = "Lag;")
    public static class188 field2417;

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "[[[B")
    public static byte[][][] field2413;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(I)V")
    public static void method1065(int arg0) {
        field2413 = null;
        field2417 = null;
        if (arg0 != 256) {
            field2422 = -92;
        }
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(I)I")
    public final int method1066(int arg0) {
        field2412++;
        if (this.field2421-- == arg0) {
            this.method1068(arg0 - 18410);
            this.field2421 = 255;
        }
        return this.field2411[this.field2421];
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(B)V")
    private final void method1067(byte arg0) {
        field2410++;
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
            int var66 = var65 ^ var62 << 8;
            int var67 = var4 + var66;
            int var68 = var5 + var64;
            int var69 = var62 + var68;
            var6 = var69 ^ var68 >>> 16;
            int var70 = var3 + var6;
            int var71 = var67 + var68;
            var5 = var71 ^ var67 << 10;
            int var72 = var2 + var5;
            int var73 = var67 + var70;
            var4 = var73 ^ var70 >>> 4;
            int var74 = var4 + var61;
            int var75 = var70 + var72;
            var3 = var75 ^ var72 << 8;
            var8 = var3 + var64;
            int var76 = var72 + var74;
            var2 = var76 ^ var74 >>> 9;
            var7 = var2 + var66;
            var9 = var8 + var74;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field2411[var11 + 4] + var5;
            int var38 = this.field2411[var11 + 3] + var6;
            int var39 = this.field2411[var11 + 6] + var3;
            int var40 = this.field2411[var11 + 2] + var7;
            int var41 = this.field2411[var11] + var9;
            int var42 = this.field2411[var11 + 5] + var4;
            int var43 = this.field2411[var11 + 7] + var2;
            int var44 = this.field2411[var11 + 1] + var8;
            int var45 = var41 ^ var44 << 11;
            int var46 = var38 + var45;
            int var47 = var40 + var44;
            int var48 = var47 ^ var40 >>> 2;
            int var49 = var40 + var46;
            int var50 = var49 ^ var46 << 8;
            int var51 = var37 + var48;
            int var52 = var42 + var50;
            int var53 = var46 + var51;
            var6 = var53 ^ var51 >>> 16;
            int var54 = var6 + var39;
            int var55 = var51 + var52;
            var5 = var55 ^ var52 << 10;
            int var56 = var52 + var54;
            int var57 = var5 + var43;
            var4 = var56 ^ var54 >>> 4;
            int var58 = var54 + var57;
            int var59 = var4 + var45;
            var3 = var58 ^ var57 << 8;
            var8 = var3 + var48;
            int var60 = var57 + var59;
            var2 = var60 ^ var59 >>> 9;
            var7 = var2 + var50;
            var9 = var8 + var59;
            this.field2418[var11] = var9;
            this.field2418[var11 + 1] = var8;
            this.field2418[var11 + 2] = var7;
            this.field2418[var11 + 3] = var6;
            this.field2418[var11 + 4] = var5;
            this.field2418[var11 + 5] = var4;
            this.field2418[var11 + 6] = var3;
            this.field2418[var11 + 7] = var2;
        }
        if (arg0 != 13) {
            field2422 = 49;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field2418[var12 + 3] + var6;
            int var14 = this.field2418[var12 + 5] + var4;
            int var15 = this.field2418[var12 + 7] + var2;
            int var16 = this.field2418[var12 + 2] + var7;
            int var17 = this.field2418[var12 + 6] + var3;
            int var18 = this.field2418[var12 + 4] + var5;
            int var19 = this.field2418[var12 + 1] + var8;
            int var20 = this.field2418[var12] + var9;
            int var21 = var20 ^ var19 << 11;
            int var22 = var13 + var21;
            int var23 = var16 + var19;
            int var24 = var23 ^ var16 >>> 2;
            int var25 = var18 + var24;
            int var26 = var16 + var22;
            int var27 = var26 ^ var22 << 8;
            int var28 = var22 + var25;
            int var29 = var14 + var27;
            var6 = var28 ^ var25 >>> 16;
            int var30 = var25 + var29;
            int var31 = var6 + var17;
            var5 = var30 ^ var29 << 10;
            int var32 = var5 + var15;
            int var33 = var29 + var31;
            var4 = var33 ^ var31 >>> 4;
            int var34 = var31 + var32;
            var3 = var34 ^ var32 << 8;
            int var35 = var4 + var21;
            var8 = var3 + var24;
            int var36 = var32 + var35;
            var2 = var36 ^ var35 >>> 9;
            var9 = var8 + var35;
            this.field2418[var12] = var9;
            this.field2418[var12 + 1] = var8;
            var7 = var2 + var27;
            this.field2418[var12 + 2] = var7;
            this.field2418[var12 + 3] = var6;
            this.field2418[var12 + 4] = var5;
            this.field2418[var12 + 5] = var4;
            this.field2418[var12 + 6] = var3;
            this.field2418[var12 + 7] = var2;
        }
        this.method1068(-18410);
        this.field2421 = 256;
    }

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "(I)V")
    private final void method1068(int arg0) {
        if (arg0 != -18410) {
            method1065(-98);
        }
        field2423++;
        this.field2420 += ++this.field2419;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field2418[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field2415 ^= this.field2415 << 13;
                } else {
                    this.field2415 ^= this.field2415 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field2415 ^= this.field2415 << 2;
            } else {
                this.field2415 ^= this.field2415 >>> 16;
            }
            this.field2415 += this.field2418[var2 + 128 & 0xFF];
            int var4;
            this.field2418[var2] = var4 = this.field2418[class3.method48(var3, 1020) >> 2] + this.field2415 + this.field2420;
            this.field2411[var2] = this.field2420 = var3 + this.field2418[class3.method48(255, var4 >> 8 >> 2)];
        }
    }

    @OriginalMember(owner = "client!gi", name = "<init>", descriptor = "()V")
    private class157() {
    }

    @OriginalMember(owner = "client!gi", name = "<init>", descriptor = "([I)V")
    public class157(int[] arg0) {
        this.field2411 = new int[256];
        this.field2418 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field2411[var2] = arg0[var2];
        }
        this.method1067((byte) 13);
    }
}
