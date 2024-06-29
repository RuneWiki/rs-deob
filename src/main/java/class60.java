import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class60 {

    @OriginalMember(owner = "client!id", name = "n", descriptor = "[I")
    private int[] field1495 = new int[256];

    @OriginalMember(owner = "client!id", name = "c", descriptor = "[I")
    private int[] field1484 = new int[256];

    @OriginalMember(owner = "client!id", name = "a", descriptor = "Lmb;")
    public static class84 field1482 = class79.method672(true, " weitere Optionen");

    @OriginalMember(owner = "client!id", name = "q", descriptor = "I")
    public static int field1498 = 0;

    @OriginalMember(owner = "client!id", name = "d", descriptor = "Z")
    public static boolean field1485 = false;

    @OriginalMember(owner = "client!id", name = "j", descriptor = "I")
    public static int field1491 = -1;

    @OriginalMember(owner = "client!id", name = "r", descriptor = "Lmb;")
    public static class84 field1499 = class79.method672(true, "welle:");

    @OriginalMember(owner = "client!id", name = "b", descriptor = "I")
    public static int field1483;

    @OriginalMember(owner = "client!id", name = "f", descriptor = "I")
    public static int field1487;

    @OriginalMember(owner = "client!id", name = "g", descriptor = "I")
    private int field1488;

    @OriginalMember(owner = "client!id", name = "h", descriptor = "I")
    private int field1489;

    @OriginalMember(owner = "client!id", name = "k", descriptor = "I")
    public static int field1492;

    @OriginalMember(owner = "client!id", name = "l", descriptor = "I")
    private int field1493;

    @OriginalMember(owner = "client!id", name = "m", descriptor = "I")
    public static int field1494;

    @OriginalMember(owner = "client!id", name = "o", descriptor = "I")
    private int field1496;

    @OriginalMember(owner = "client!id", name = "p", descriptor = "I")
    public static int field1497;

    @OriginalMember(owner = "client!id", name = "s", descriptor = "I")
    public static int field1500;

    @OriginalMember(owner = "client!id", name = "e", descriptor = "Lsd;")
    public static class122 field1486;

    @OriginalMember(owner = "client!id", name = "i", descriptor = "Lue;")
    public static class135 field1490;

    @OriginalMember(owner = "client!id", name = "t", descriptor = "[I")
    public static int[] field1501;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V")
    public static final void method522(int arg0) {
        class119.field2857.method966(false);
        field1487++;
        class15.field313.method966(false);
        class24.field564.method966(false);
        if (arg0 <= 8) {
            method527(-42, null);
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Z)I")
    public final int method523(boolean arg0) {
        if (!arg0) {
            return 22;
        }
        field1500++;
        if (this.field1493-- == 0) {
            this.method524(110);
            this.field1493 = 255;
        }
        return this.field1495[this.field1493];
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(I)V")
    private final void method524(int arg0) {
        this.field1488 += ++this.field1489;
        field1483++;
        if (arg0 < 20) {
            this.method525(true);
        }
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field1484[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field1496 ^= this.field1496 << 13;
                } else {
                    this.field1496 ^= this.field1496 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field1496 ^= this.field1496 << 2;
            } else {
                this.field1496 ^= this.field1496 >>> 16;
            }
            this.field1496 += this.field1484[var2 + 128 & 0xFF];
            int var4;
            this.field1484[var2] = var4 = this.field1484[client.method144(var3 >> 2, 255)] + this.field1496 + this.field1488;
            this.field1495[var2] = this.field1488 = this.field1484[client.method144(var4 >> 8, 1020) >> 2] + var3;
        }
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(Z)V")
    private final void method525(boolean arg0) {
        field1494++;
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
            int var66 = var5 + var64;
            int var67 = var65 ^ var63 << 8;
            int var68 = var63 + var66;
            int var69 = var4 + var67;
            var6 = var68 ^ var66 >>> 16;
            int var70 = var66 + var69;
            var5 = var70 ^ var69 << 10;
            int var71 = var2 + var5;
            int var72 = var3 + var6;
            int var73 = var69 + var72;
            var4 = var73 ^ var72 >>> 4;
            int var74 = var71 + var72;
            int var75 = var4 + var61;
            var3 = var74 ^ var71 << 8;
            int var76 = var71 + var75;
            var2 = var76 ^ var75 >>> 9;
            var7 = var2 + var67;
            var8 = var3 + var64;
            var9 = var8 + var75;
        }
        if (arg0) {
            return;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field1495[var11 + 1] + var8;
            int var38 = this.field1495[var11 + 4] + var5;
            int var39 = this.field1495[var11 + 3] + var6;
            int var40 = this.field1495[var11 + 5] + var4;
            int var41 = this.field1495[var11 + 2] + var7;
            int var42 = this.field1495[var11] + var9;
            int var43 = var42 ^ var37 << 11;
            int var44 = var39 + var43;
            int var45 = var37 + var41;
            int var46 = this.field1495[var11 + 6] + var3;
            int var47 = this.field1495[var11 + 7] + var2;
            int var48 = var45 ^ var41 >>> 2;
            int var49 = var41 + var44;
            int var50 = var38 + var48;
            int var51 = var49 ^ var44 << 8;
            int var52 = var44 + var50;
            int var53 = var40 + var51;
            var6 = var52 ^ var50 >>> 16;
            int var54 = var50 + var53;
            int var55 = var6 + var46;
            var5 = var54 ^ var53 << 10;
            int var56 = var53 + var55;
            var4 = var56 ^ var55 >>> 4;
            int var57 = var5 + var47;
            int var58 = var4 + var43;
            int var59 = var55 + var57;
            var3 = var59 ^ var57 << 8;
            int var60 = var57 + var58;
            var8 = var3 + var48;
            var2 = var60 ^ var58 >>> 9;
            var9 = var8 + var58;
            var7 = var2 + var51;
            this.field1484[var11] = var9;
            this.field1484[var11 + 1] = var8;
            this.field1484[var11 + 2] = var7;
            this.field1484[var11 + 3] = var6;
            this.field1484[var11 + 4] = var5;
            this.field1484[var11 + 5] = var4;
            this.field1484[var11 + 6] = var3;
            this.field1484[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field1484[var12 + 6] + var3;
            int var14 = this.field1484[var12 + 1] + var8;
            int var15 = this.field1484[var12 + 5] + var4;
            int var16 = this.field1484[var12 + 4] + var5;
            int var17 = this.field1484[var12 + 3] + var6;
            int var18 = this.field1484[var12] + var9;
            int var19 = this.field1484[var12 + 2] + var7;
            int var20 = var18 ^ var14 << 11;
            int var21 = var17 + var20;
            int var22 = var14 + var19;
            int var23 = var22 ^ var19 >>> 2;
            int var24 = this.field1484[var12 + 7] + var2;
            int var25 = var16 + var23;
            int var26 = var19 + var21;
            int var27 = var26 ^ var21 << 8;
            int var28 = var15 + var27;
            int var29 = var21 + var25;
            var6 = var29 ^ var25 >>> 16;
            int var30 = var25 + var28;
            var5 = var30 ^ var28 << 10;
            int var31 = var5 + var24;
            int var32 = var6 + var13;
            int var33 = var28 + var32;
            var4 = var33 ^ var32 >>> 4;
            int var34 = var31 + var32;
            int var35 = var4 + var20;
            var3 = var34 ^ var31 << 8;
            int var36 = var31 + var35;
            var8 = var3 + var23;
            var2 = var36 ^ var35 >>> 9;
            var7 = var2 + var27;
            var9 = var8 + var35;
            this.field1484[var12] = var9;
            this.field1484[var12 + 1] = var8;
            this.field1484[var12 + 2] = var7;
            this.field1484[var12 + 3] = var6;
            this.field1484[var12 + 4] = var5;
            this.field1484[var12 + 5] = var4;
            this.field1484[var12 + 6] = var3;
            this.field1484[var12 + 7] = var2;
        }
        this.method524(25);
        this.field1493 = 256;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(B)V")
    public static void method526(byte arg0) {
        if (arg0 >= -72) {
            return;
        }
        field1486 = null;
        field1490 = null;
        field1482 = null;
        field1499 = null;
        field1501 = null;
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "([I)V")
    public class60(int[] arg0) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field1495[var2] = arg0[var2];
        }
        this.method525(false);
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ILsd;)V")
    public static final void method527(int arg0, class122 arg1) {
        field1497++;
        class102.field2494 = arg1;
        class119.field2840 = class102.field2494.method989(16, -75);
        if (arg0 != 21049) {
            method526((byte) -34);
        }
    }
}
