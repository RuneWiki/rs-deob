import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class90 {

    @OriginalMember(owner = "client!ja", name = "m", descriptor = "[I")
    private int[] field1343;

    @OriginalMember(owner = "client!ja", name = "h", descriptor = "[I")
    private int[] field1338;

    @OriginalMember(owner = "client!ja", name = "j", descriptor = "I")
    public static int field1340 = 0;

    @OriginalMember(owner = "client!ja", name = "n", descriptor = "Lwe;")
    public static class24 field1344 = new class24();

    @OriginalMember(owner = "client!ja", name = "o", descriptor = "J")
    public static long field1345 = 0L;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "I")
    private int field1331;

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "I")
    public static int field1332;

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "I")
    public static int field1333;

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "I")
    public static int field1334;

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "I")
    private int field1335;

    @OriginalMember(owner = "client!ja", name = "g", descriptor = "I")
    public static int field1337;

    @OriginalMember(owner = "client!ja", name = "i", descriptor = "I")
    private int field1339;

    @OriginalMember(owner = "client!ja", name = "k", descriptor = "I")
    public static int field1341;

    @OriginalMember(owner = "client!ja", name = "l", descriptor = "I")
    private int field1342;

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "Lkb;")
    public static class80 field1336;

    @OriginalMember(owner = "client!ja", name = "p", descriptor = "[I")
    public static int[] field1346;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)I", line = 5)
    public final int method795(int arg0) {
        if (this.field1331-- == 0) {
            this.method799(24331);
            this.field1331 = 255;
        }
        if (arg0 == 23051) {
            field1334++;
            return this.field1343[this.field1331];
        } else {
            return -6;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Z)V", line = 29)
    private final void method796(boolean arg0) {
        field1341++;
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
            var7 = var2 + var67;
            var9 = var8 + var75;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field1343[var11 + 1] + var8;
            int var38 = this.field1343[var11 + 4] + var5;
            int var39 = this.field1343[var11 + 6] + var3;
            int var40 = this.field1343[var11 + 5] + var4;
            int var41 = this.field1343[var11 + 3] + var6;
            int var42 = this.field1343[var11] + var9;
            int var43 = this.field1343[var11 + 2] + var7;
            int var44 = this.field1343[var11 + 7] + var2;
            int var45 = var42 ^ var37 << 11;
            int var46 = var37 + var43;
            int var47 = var41 + var45;
            int var48 = var46 ^ var43 >>> 2;
            int var49 = var43 + var47;
            int var50 = var38 + var48;
            int var51 = var49 ^ var47 << 8;
            int var52 = var40 + var51;
            int var53 = var47 + var50;
            var6 = var53 ^ var50 >>> 16;
            int var54 = var6 + var39;
            int var55 = var50 + var52;
            var5 = var55 ^ var52 << 10;
            int var56 = var52 + var54;
            int var57 = var5 + var44;
            var4 = var56 ^ var54 >>> 4;
            int var58 = var54 + var57;
            int var59 = var4 + var45;
            var3 = var58 ^ var57 << 8;
            int var60 = var57 + var59;
            var8 = var3 + var48;
            var2 = var60 ^ var59 >>> 9;
            var7 = var2 + var51;
            var9 = var8 + var59;
            this.field1338[var11] = var9;
            this.field1338[var11 + 1] = var8;
            this.field1338[var11 + 2] = var7;
            this.field1338[var11 + 3] = var6;
            this.field1338[var11 + 4] = var5;
            this.field1338[var11 + 5] = var4;
            this.field1338[var11 + 6] = var3;
            this.field1338[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field1338[var12 + 5] + var4;
            int var14 = this.field1338[var12 + 2] + var7;
            int var15 = this.field1338[var12] + var9;
            int var16 = this.field1338[var12 + 3] + var6;
            int var17 = this.field1338[var12 + 1] + var8;
            int var18 = this.field1338[var12 + 6] + var3;
            int var19 = this.field1338[var12 + 7] + var2;
            int var20 = this.field1338[var12 + 4] + var5;
            int var21 = var15 ^ var17 << 11;
            int var22 = var16 + var21;
            int var23 = var14 + var17;
            int var24 = var23 ^ var14 >>> 2;
            int var25 = var14 + var22;
            int var26 = var20 + var24;
            int var27 = var25 ^ var22 << 8;
            int var28 = var13 + var27;
            int var29 = var22 + var26;
            var6 = var29 ^ var26 >>> 16;
            int var30 = var6 + var18;
            int var31 = var26 + var28;
            var5 = var31 ^ var28 << 10;
            int var32 = var28 + var30;
            int var33 = var5 + var19;
            var4 = var32 ^ var30 >>> 4;
            int var34 = var30 + var33;
            int var35 = var4 + var21;
            var3 = var34 ^ var33 << 8;
            var8 = var3 + var24;
            int var36 = var33 + var35;
            var2 = var36 ^ var35 >>> 9;
            var7 = var2 + var27;
            var9 = var8 + var35;
            this.field1338[var12] = var9;
            this.field1338[var12 + 1] = var8;
            this.field1338[var12 + 2] = var7;
            this.field1338[var12 + 3] = var6;
            this.field1338[var12 + 4] = var5;
            this.field1338[var12 + 5] = var4;
            this.field1338[var12 + 6] = var3;
            this.field1338[var12 + 7] = var2;
        }
        if (!arg0) {
            this.field1338 = null;
        }
        this.method799(24331);
        this.field1331 = 256;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(BIIII)V", line = 176)
    public static final void method797(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = 7 / ((39 - arg0) / 48);
        field1333++;
        float var6 = (float) class99.field1435 / (float) class99.field1434;
        int var7 = arg2;
        int var8 = arg3;
        if ((var6 < 1.0F)) {
            var8 = (int) ((float) arg2 * var6);
        } else {
            var7 = (int) ((float) arg3 / var6);
        }
        int var9 = arg4 - (arg3 - var8) / 2;
        int var10 = arg1 - (arg2 - var7) / 2;
        class44.field709 = -1;
        class447.field6475 = class99.field1434 * var10 / var7;
        class39.field605 = -1;
        class172.field2519 = class99.field1435 - (class99.field1435 * var9 / var8);
        class156.method1196(true);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(B)V", line = 207)
    public static void method798(byte arg0) {
        field1344 = null;
        field1336 = null;
        field1346 = null;
        if (arg0 <= 91) {
            method798((byte) -122);
        }
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(I)V", line = 220)
    private final void method799(int arg0) {
        field1337++;
        this.field1335 += ++this.field1339;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field1338[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field1342 ^= this.field1342 << 13;
                } else {
                    this.field1342 ^= this.field1342 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field1342 ^= this.field1342 << 2;
            } else {
                this.field1342 ^= this.field1342 >>> 16;
            }
            this.field1342 += this.field1338[var2 + 128 & 0xFF];
            int var4;
            this.field1338[var2] = var4 = this.field1335 + (this.field1338[class323.method2059(var3, 1020) >> 2] + this.field1342);
            this.field1343[var2] = this.field1335 = var3 + this.field1338[class323.method2059(255, var4 >> 8 >> 2)];
        }
        if (arg0 != 24331) {
            method798((byte) -108);
        }
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "()V", line = 268)
    private class90() {
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "([I)V", line = 271)
    public class90(int[] arg0) {
        this.field1343 = new int[256];
        this.field1338 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field1343[var2] = arg0[var2];
        }
        this.method796(true);
    }
}
