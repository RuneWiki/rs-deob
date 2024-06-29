import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class159 {

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "[I")
    private int[] field2597;

    @OriginalMember(owner = "client!vk", name = "q", descriptor = "[I")
    private int[] field2610;

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "Z")
    public static boolean field2596 = false;

    @OriginalMember(owner = "client!vk", name = "m", descriptor = "Z")
    public static boolean field2606 = false;

    @OriginalMember(owner = "client!vk", name = "n", descriptor = "[I")
    public static int[] field2607 = new int[100];

    @OriginalMember(owner = "client!vk", name = "j", descriptor = "Lhg;")
    public static class207 field2603 = null;

    @OriginalMember(owner = "client!vk", name = "l", descriptor = "Ljg;")
    public static class42 field2605 = new class42(64);

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "I")
    private int field2594;

    @OriginalMember(owner = "client!vk", name = "e", descriptor = "I")
    private int field2598;

    @OriginalMember(owner = "client!vk", name = "f", descriptor = "I")
    public static int field2599;

    @OriginalMember(owner = "client!vk", name = "g", descriptor = "I")
    public static int field2600;

    @OriginalMember(owner = "client!vk", name = "h", descriptor = "I")
    public static int field2601;

    @OriginalMember(owner = "client!vk", name = "i", descriptor = "I")
    private int field2602;

    @OriginalMember(owner = "client!vk", name = "k", descriptor = "I")
    public static int field2604;

    @OriginalMember(owner = "client!vk", name = "o", descriptor = "I")
    private int field2608;

    @OriginalMember(owner = "client!vk", name = "p", descriptor = "Lka;")
    public static class144 field2609;

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "Lci;")
    public static class83 field2595;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(I)I")
    public final int method1186(int arg0) {
        if ((this.field2608--) == 0) {
            this.method1189(-21726);
            this.field2608 = 255;
        }
        if (arg0 != 2034002216) {
            this.field2610 = null;
        }
        field2600++;
        return this.field2610[this.field2608];
    }

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "(I)V")
    public static final void method1187(int arg0) {
        if (arg0 != -659813974) {
            method1187(-3);
        }
        field2599++;
        if (class272.field4546 != null) {
            class272.field4546.method1717(-6);
        }
        if (class95.field1543 != null) {
            class95.field1543.method1717(-6);
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(B)V")
    public static void method1188(byte arg0) {
        field2609 = null;
        field2605 = null;
        field2603 = null;
        int var1 = -92 / ((-arg0 - 12) / 58);
        field2607 = null;
        field2595 = null;
    }

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "(I)V")
    private final void method1189(int arg0) {
        field2601++;
        this.field2598 += ++this.field2602;
        int var2 = 0;
        if (arg0 != -21726) {
            return;
        }
        while (var2 < 256) {
            int var3 = this.field2597[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field2594 ^= this.field2594 << 13;
                } else {
                    this.field2594 ^= this.field2594 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field2594 ^= this.field2594 << 2;
            } else {
                this.field2594 ^= this.field2594 >>> 16;
            }
            this.field2594 += this.field2597[var2 + 128 & 0xFF];
            int var4;
            this.field2597[var2] = var4 = this.field2597[class15.method84(255, var3 >> 2)] - (-this.field2598 - this.field2594);
            this.field2610[var2] = this.field2598 = var3 + this.field2597[class15.method84(261178, var4) >> 8 >> 2];
            var2++;
        }
    }

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "(I)V")
    private final void method1190(int arg0) {
        field2604++;
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
            var6 = var68 ^ var65 >>> 16;
            int var69 = var4 + var67;
            int var70 = var3 + var6;
            int var71 = var65 + var69;
            var5 = var71 ^ var69 << 10;
            int var72 = var2 + var5;
            int var73 = var69 + var70;
            var4 = var73 ^ var70 >>> 4;
            int var74 = var70 + var72;
            var3 = var74 ^ var72 << 8;
            var8 = var3 + var64;
            int var75 = var4 + var61;
            int var76 = var72 + var75;
            var2 = var76 ^ var75 >>> 9;
            var9 = var8 + var75;
            var7 = var2 + var67;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field2610[var11 + 3] + var6;
            int var38 = this.field2610[var11 + 5] + var4;
            int var39 = this.field2610[var11 + 2] + var7;
            int var40 = this.field2610[var11 + 4] + var5;
            int var41 = this.field2610[var11 + 7] + var2;
            int var42 = this.field2610[var11] + var9;
            int var43 = this.field2610[var11 + 6] + var3;
            int var44 = this.field2610[var11 + 1] + var8;
            int var45 = var42 ^ var44 << 11;
            int var46 = var37 + var45;
            int var47 = var39 + var44;
            int var48 = var47 ^ var39 >>> 2;
            int var49 = var40 + var48;
            int var50 = var39 + var46;
            int var51 = var50 ^ var46 << 8;
            int var52 = var38 + var51;
            int var53 = var46 + var49;
            var6 = var53 ^ var49 >>> 16;
            int var54 = var49 + var52;
            int var55 = var6 + var43;
            var5 = var54 ^ var52 << 10;
            int var56 = var52 + var55;
            var4 = var56 ^ var55 >>> 4;
            int var57 = var4 + var45;
            int var58 = var5 + var41;
            int var59 = var55 + var58;
            var3 = var59 ^ var58 << 8;
            int var60 = var57 + var58;
            var2 = var60 ^ var57 >>> 9;
            var7 = var2 + var51;
            var8 = var3 + var48;
            var9 = var8 + var57;
            this.field2597[var11] = var9;
            this.field2597[var11 + 1] = var8;
            this.field2597[var11 + 2] = var7;
            this.field2597[var11 + 3] = var6;
            this.field2597[var11 + 4] = var5;
            this.field2597[var11 + 5] = var4;
            this.field2597[var11 + 6] = var3;
            this.field2597[var11 + 7] = var2;
        }
        int var12 = 0;
        if (arg0 != 20229) {
            field2595 = null;
        }
        while (var12 < 256) {
            int var13 = this.field2597[var12 + 6] + var3;
            int var14 = this.field2597[var12 + 3] + var6;
            int var15 = this.field2597[var12 + 1] + var8;
            int var16 = this.field2597[var12 + 5] + var4;
            int var17 = this.field2597[var12 + 4] + var5;
            int var18 = this.field2597[var12] + var9;
            int var19 = var18 ^ var15 << 11;
            int var20 = this.field2597[var12 + 2] + var7;
            int var21 = this.field2597[var12 + 7] + var2;
            int var22 = var15 + var20;
            int var23 = var14 + var19;
            int var24 = var22 ^ var20 >>> 2;
            int var25 = var17 + var24;
            int var26 = var20 + var23;
            int var27 = var26 ^ var23 << 8;
            int var28 = var16 + var27;
            int var29 = var23 + var25;
            var6 = var29 ^ var25 >>> 16;
            int var30 = var6 + var13;
            int var31 = var25 + var28;
            var5 = var31 ^ var28 << 10;
            int var32 = var28 + var30;
            int var33 = var5 + var21;
            var4 = var32 ^ var30 >>> 4;
            int var34 = var30 + var33;
            int var35 = var4 + var19;
            var3 = var34 ^ var33 << 8;
            int var36 = var33 + var35;
            var8 = var3 + var24;
            var2 = var36 ^ var35 >>> 9;
            var7 = var2 + var27;
            var9 = var8 + var35;
            this.field2597[var12] = var9;
            this.field2597[var12 + 1] = var8;
            this.field2597[var12 + 2] = var7;
            this.field2597[var12 + 3] = var6;
            this.field2597[var12 + 4] = var5;
            this.field2597[var12 + 5] = var4;
            this.field2597[var12 + 6] = var3;
            this.field2597[var12 + 7] = var2;
            var12 += 8;
        }
        this.method1189(arg0 ^ 0xFFFFE427);
        this.field2608 = 256;
    }

    @OriginalMember(owner = "client!vk", name = "<init>", descriptor = "()V")
    private class159() {
    }

    @OriginalMember(owner = "client!vk", name = "<init>", descriptor = "([I)V")
    public class159(int[] arg0) {
        this.field2597 = new int[256];
        this.field2610 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field2610[var2] = arg0[var2];
        }
        this.method1190(20229);
    }
}
