import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class122 {

    @OriginalMember(owner = "client!ne", name = "n", descriptor = "[I")
    private int[] field2704 = new int[256];

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "[I")
    private int[] field2691 = new int[256];

    @OriginalMember(owner = "client!ne", name = "i", descriptor = "Lgg;")
    public static class63 field2699 = class116.method911(43, "Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q");

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "Lgg;")
    public static class63 field2695 = class116.method911(43, "http:)4)4");

    @OriginalMember(owner = "client!ne", name = "o", descriptor = "Lgg;")
    public static class63 field2705 = class116.method911(43, "Ladevorgang )2 bitte warten Sie)3");

    @OriginalMember(owner = "client!ne", name = "k", descriptor = "Lgg;")
    public static class63 field2701 = class116.method911(43, "Keine Antwort vom Anmelde)2Server)3");

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "I")
    public static int field2692;

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "I")
    public static int field2693;

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "I")
    public static int field2694;

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "I")
    public static int field2696;

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "I")
    private int field2697;

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "I")
    private int field2698;

    @OriginalMember(owner = "client!ne", name = "j", descriptor = "I")
    private int field2700;

    @OriginalMember(owner = "client!ne", name = "l", descriptor = "I")
    private int field2702;

    @OriginalMember(owner = "client!ne", name = "m", descriptor = "I")
    public static int field2703;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(II)V")
    public static final void method934(int arg0, int arg1) {
        field2694++;
        if (arg1 != 113152226) {
            field2695 = null;
        }
        class90 var2 = (class90) class110.field2484.method694(-23979, (long) arg0);
        if (var2 != null) {
            var2.method1172(-62);
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)I")
    public final int method935(int arg0) {
        field2693++;
        if (this.field2702-- == 0) {
            this.method937(126);
            this.field2702 = 255;
        }
        return arg0 == 3120 ? this.field2704[this.field2702] : 102;
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(I)V")
    private final void method936(int arg0) {
        field2703++;
        int var2 = -1640531527;
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;
        int var9 = -1640531527;
        int var10 = 0;
        if (arg0 != 7135) {
            this.method935(-71);
        }
        while (var10 < 4) {
            int var61 = var9 ^ var8 << 11;
            int var62 = var6 + var61;
            int var63 = var7 + var8;
            int var64 = var63 ^ var7 >>> 2;
            int var65 = var5 + var64;
            int var66 = var7 + var62;
            int var67 = var66 ^ var62 << 8;
            int var68 = var62 + var65;
            var6 = var68 ^ var65 >>> 16;
            int var69 = var3 + var6;
            int var70 = var4 + var67;
            int var71 = var65 + var70;
            var5 = var71 ^ var70 << 10;
            int var72 = var69 + var70;
            var4 = var72 ^ var69 >>> 4;
            int var73 = var2 + var5;
            int var74 = var69 + var73;
            int var75 = var4 + var61;
            var3 = var74 ^ var73 << 8;
            int var76 = var73 + var75;
            var8 = var3 + var64;
            var2 = var76 ^ var75 >>> 9;
            var9 = var8 + var75;
            var7 = var2 + var67;
            var10++;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field2704[var11 + 3] + var6;
            int var38 = this.field2704[var11 + 5] + var4;
            int var39 = this.field2704[var11 + 7] + var2;
            int var40 = this.field2704[var11] + var9;
            int var41 = this.field2704[var11 + 1] + var8;
            int var42 = this.field2704[var11 + 6] + var3;
            int var43 = this.field2704[var11 + 4] + var5;
            int var44 = var40 ^ var41 << 11;
            int var45 = this.field2704[var11 + 2] + var7;
            int var46 = var37 + var44;
            int var47 = var41 + var45;
            int var48 = var47 ^ var45 >>> 2;
            int var49 = var43 + var48;
            int var50 = var45 + var46;
            int var51 = var50 ^ var46 << 8;
            int var52 = var46 + var49;
            int var53 = var38 + var51;
            var6 = var52 ^ var49 >>> 16;
            int var54 = var6 + var42;
            int var55 = var49 + var53;
            var5 = var55 ^ var53 << 10;
            int var56 = var5 + var39;
            int var57 = var53 + var54;
            var4 = var57 ^ var54 >>> 4;
            int var58 = var54 + var56;
            var3 = var58 ^ var56 << 8;
            var8 = var3 + var48;
            int var59 = var4 + var44;
            int var60 = var56 + var59;
            var2 = var60 ^ var59 >>> 9;
            var7 = var2 + var51;
            var9 = var8 + var59;
            this.field2691[var11] = var9;
            this.field2691[var11 + 1] = var8;
            this.field2691[var11 + 2] = var7;
            this.field2691[var11 + 3] = var6;
            this.field2691[var11 + 4] = var5;
            this.field2691[var11 + 5] = var4;
            this.field2691[var11 + 6] = var3;
            this.field2691[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field2691[var12 + 5] + var4;
            int var14 = this.field2691[var12 + 2] + var7;
            int var15 = this.field2691[var12 + 3] + var6;
            int var16 = this.field2691[var12 + 1] + var8;
            int var17 = this.field2691[var12 + 6] + var3;
            int var18 = this.field2691[var12] + var9;
            int var19 = var18 ^ var16 << 11;
            int var20 = this.field2691[var12 + 4] + var5;
            int var21 = var14 + var16;
            int var22 = var15 + var19;
            int var23 = this.field2691[var12 + 7] + var2;
            int var24 = var21 ^ var14 >>> 2;
            int var25 = var20 + var24;
            int var26 = var14 + var22;
            int var27 = var26 ^ var22 << 8;
            int var28 = var13 + var27;
            int var29 = var22 + var25;
            var6 = var29 ^ var25 >>> 16;
            int var30 = var25 + var28;
            int var31 = var6 + var17;
            var5 = var30 ^ var28 << 10;
            int var32 = var5 + var23;
            int var33 = var28 + var31;
            var4 = var33 ^ var31 >>> 4;
            int var34 = var4 + var19;
            int var35 = var31 + var32;
            var3 = var35 ^ var32 << 8;
            var8 = var3 + var24;
            int var36 = var32 + var34;
            var2 = var36 ^ var34 >>> 9;
            var7 = var2 + var27;
            var9 = var8 + var34;
            this.field2691[var12] = var9;
            this.field2691[var12 + 1] = var8;
            this.field2691[var12 + 2] = var7;
            this.field2691[var12 + 3] = var6;
            this.field2691[var12 + 4] = var5;
            this.field2691[var12 + 5] = var4;
            this.field2691[var12 + 6] = var3;
            this.field2691[var12 + 7] = var2;
        }
        this.method937(98);
        this.field2702 = 256;
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(I)V")
    private final void method937(int arg0) {
        this.field2698 += ++this.field2700;
        field2696++;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field2691[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field2697 ^= this.field2697 << 13;
                } else {
                    this.field2697 ^= this.field2697 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field2697 ^= this.field2697 << 2;
            } else {
                this.field2697 ^= this.field2697 >>> 16;
            }
            this.field2697 += this.field2691[var2 + 128 & 0xFF];
            int var4;
            this.field2691[var2] = var4 = this.field2691[class110.method881(1020, var3) >> 2] + this.field2697 + this.field2698;
            this.field2704[var2] = this.field2698 = var3 + this.field2691[class110.method881(var4 >> 8 >> 2, 255)];
        }
        if (arg0 <= 95) {
            method938((byte) 122);
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(B)V")
    public static void method938(byte arg0) {
        field2705 = null;
        if (arg0 > 103) {
            field2701 = null;
            field2699 = null;
            field2695 = null;
        }
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "([I)V")
    public class122(int[] arg0) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field2704[var2] = arg0[var2];
        }
        this.method936(7135);
    }
}
