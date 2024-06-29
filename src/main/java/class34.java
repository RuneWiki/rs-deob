import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class34 {

    @OriginalMember(owner = "client!ij", name = "g", descriptor = "[I")
    private int[] field436;

    @OriginalMember(owner = "client!ij", name = "k", descriptor = "[I")
    private int[] field440;

    @OriginalMember(owner = "client!ij", name = "h", descriptor = "I")
    public static int field437 = 0;

    @OriginalMember(owner = "client!ij", name = "l", descriptor = "I")
    public static int field441 = 127;

    @OriginalMember(owner = "client!ij", name = "i", descriptor = "Leg;")
    public static class188 field438 = new class188(16);

    @OriginalMember(owner = "client!ij", name = "p", descriptor = "I")
    public static int field445 = -1;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "I")
    private int field430;

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "I")
    public static int field431;

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "I")
    private int field432;

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "I")
    private int field433;

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "I")
    public static int field434;

    @OriginalMember(owner = "client!ij", name = "j", descriptor = "I")
    public static int field439;

    @OriginalMember(owner = "client!ij", name = "m", descriptor = "I")
    public static int field442;

    @OriginalMember(owner = "client!ij", name = "n", descriptor = "I")
    public static int field443;

    @OriginalMember(owner = "client!ij", name = "o", descriptor = "I")
    private int field444;

    @OriginalMember(owner = "client!ij", name = "f", descriptor = "[[[B")
    public static byte[][][] field435;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)V", line = 13)
    private final void method251(int arg0) {
        this.field444 += ++this.field433;
        if (arg0 != 5576) {
            field437 = -92;
        }
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field440[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field430 ^= this.field430 << 13;
                } else {
                    this.field430 ^= this.field430 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field430 ^= this.field430 << 2;
            } else {
                this.field430 ^= this.field430 >>> 16;
            }
            this.field430 += this.field440[var2 + 128 & 0xFF];
            int var4;
            this.field440[var2] = var4 = this.field444 + this.field430 + this.field440[class311.method2135(var3 >> 2, 255)];
            this.field436[var2] = this.field444 = this.field440[class311.method2135(255, var4 >> 8 >> 2)] + var3;
        }
        field442++;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Z)V", line = 59)
    public static final void method252(boolean arg0) {
        if (!arg0) {
            field431++;
            if (class146.field2290 == 5) {
                class146.field2290 = 6;
            }
        }
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(I)I", line = 79)
    public final int method253(int arg0) {
        field439++;
        if (this.field432-- == 0) {
            this.method251(5576);
            this.field432 = 255;
        }
        int var2 = 35 % ((-arg0 - 75) / 38);
        return this.field436[this.field432];
    }

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "(I)V", line = 101)
    private final void method254(int arg0) {
        field434++;
        int var2 = -1640531527;
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;
        int var9 = -1640531527;
        for (int var10 = 0; var10 < 4; var10++) {
            int var11 = var9 ^ var8 << 11;
            int var12 = var6 + var11;
            int var13 = var7 + var8;
            int var14 = var13 ^ var7 >>> 2;
            int var15 = var7 + var12;
            int var16 = var15 ^ var12 << 8;
            int var17 = var5 + var14;
            int var18 = var4 + var16;
            int var19 = var12 + var17;
            var6 = var19 ^ var17 >>> 16;
            int var20 = var3 + var6;
            int var21 = var17 + var18;
            var5 = var21 ^ var18 << 10;
            int var22 = var2 + var5;
            int var23 = var18 + var20;
            var4 = var23 ^ var20 >>> 4;
            int var24 = var20 + var22;
            var3 = var24 ^ var22 << 8;
            int var25 = var4 + var11;
            int var26 = var22 + var25;
            var2 = var26 ^ var25 >>> 9;
            var8 = var3 + var14;
            var7 = var2 + var16;
            var9 = var8 + var25;
        }
        for (int var27 = 0; var27 < 256; var27 += 8) {
            int var28 = this.field436[var27 + 3] + var6;
            int var29 = this.field436[var27] + var9;
            int var30 = this.field436[var27 + 4] + var5;
            int var31 = this.field436[var27 + 2] + var7;
            int var32 = this.field436[var27 + 7] + var2;
            int var33 = this.field436[var27 + 1] + var8;
            int var34 = this.field436[var27 + 5] + var4;
            int var35 = var29 ^ var33 << 11;
            int var36 = var31 + var33;
            int var37 = var36 ^ var31 >>> 2;
            int var38 = var28 + var35;
            int var39 = this.field436[var27 + 6] + var3;
            int var40 = var31 + var38;
            int var41 = var30 + var37;
            int var42 = var40 ^ var38 << 8;
            int var43 = var38 + var41;
            var6 = var43 ^ var41 >>> 16;
            int var44 = var34 + var42;
            int var45 = var41 + var44;
            var5 = var45 ^ var44 << 10;
            int var46 = var6 + var39;
            int var47 = var5 + var32;
            int var48 = var44 + var46;
            var4 = var48 ^ var46 >>> 4;
            int var49 = var4 + var35;
            int var50 = var46 + var47;
            var3 = var50 ^ var47 << 8;
            var8 = var3 + var37;
            int var51 = var47 + var49;
            var2 = var51 ^ var49 >>> 9;
            var9 = var8 + var49;
            this.field440[var27] = var9;
            this.field440[var27 + 1] = var8;
            var7 = var2 + var42;
            this.field440[var27 + 2] = var7;
            this.field440[var27 + 3] = var6;
            this.field440[var27 + 4] = var5;
            this.field440[var27 + 5] = var4;
            this.field440[var27 + 6] = var3;
            this.field440[var27 + 7] = var2;
        }
        int var52 = 0;
        if (arg0 != 30696) {
            this.field444 = -90;
        }
        while (var52 < 256) {
            int var53 = this.field440[var52 + 6] + var3;
            int var54 = this.field440[var52 + 1] + var8;
            int var55 = this.field440[var52] + var9;
            int var56 = this.field440[var52 + 4] + var5;
            int var57 = this.field440[var52 + 7] + var2;
            int var58 = var55 ^ var54 << 11;
            int var59 = this.field440[var52 + 3] + var6;
            int var60 = this.field440[var52 + 2] + var7;
            int var61 = var54 + var60;
            int var62 = var61 ^ var60 >>> 2;
            int var63 = var58 + var59;
            int var64 = var60 + var63;
            int var65 = this.field440[var52 + 5] + var4;
            int var66 = var56 + var62;
            int var67 = var64 ^ var63 << 8;
            int var68 = var65 + var67;
            int var69 = var63 + var66;
            var6 = var69 ^ var66 >>> 16;
            int var70 = var66 + var68;
            var5 = var70 ^ var68 << 10;
            int var71 = var5 + var57;
            int var72 = var6 + var53;
            int var73 = var68 + var72;
            var4 = var73 ^ var72 >>> 4;
            int var74 = var4 + var58;
            int var75 = var71 + var72;
            var3 = var75 ^ var71 << 8;
            var8 = var3 + var62;
            int var76 = var71 + var74;
            var2 = var76 ^ var74 >>> 9;
            var9 = var8 + var74;
            var7 = var2 + var67;
            this.field440[var52] = var9;
            this.field440[var52 + 1] = var8;
            this.field440[var52 + 2] = var7;
            this.field440[var52 + 3] = var6;
            this.field440[var52 + 4] = var5;
            this.field440[var52 + 5] = var4;
            this.field440[var52 + 6] = var3;
            this.field440[var52 + 7] = var2;
            var52 += 8;
        }
        this.method251(5576);
        this.field432 = 256;
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(Z)V", line = 253)
    public static void method255(boolean arg0) {
        if (arg0) {
            method252(false);
        }
        field435 = (byte[][][]) null;
        field438 = null;
    }

    @OriginalMember(owner = "client!ij", name = "<init>", descriptor = "()V", line = 269)
    private class34() {
    }

    @OriginalMember(owner = "client!ij", name = "<init>", descriptor = "([I)V", line = 272)
    public class34(int[] arg0) {
        this.field436 = new int[256];
        this.field440 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field436[var2] = arg0[var2];
        }
        this.method254(30696);
    }
}
