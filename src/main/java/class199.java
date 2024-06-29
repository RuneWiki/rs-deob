import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mu")
public class class199 {

    @OriginalMember(owner = "client!mu", name = "f", descriptor = "[I")
    private int[] field2642;

    @OriginalMember(owner = "client!mu", name = "l", descriptor = "[I")
    private int[] field2648;

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "Lco;")
    public static class77 field2637 = new class77("WTRC", 1);

    @OriginalMember(owner = "client!mu", name = "n", descriptor = "[B")
    public static byte[] field2650;

    @OriginalMember(owner = "client!mu", name = "p", descriptor = "Lni;")
    public static class367 field2652;

    @OriginalMember(owner = "client!mu", name = "t", descriptor = "Lga;")
    public static class282 field2656;

    @OriginalMember(owner = "client!mu", name = "s", descriptor = "I")
    public static int field2655;

    @OriginalMember(owner = "client!mu", name = "b", descriptor = "I")
    private int field2638;

    @OriginalMember(owner = "client!mu", name = "c", descriptor = "I")
    public static int field2639;

    @OriginalMember(owner = "client!mu", name = "d", descriptor = "I")
    public static int field2640;

    @OriginalMember(owner = "client!mu", name = "e", descriptor = "I")
    public static int field2641;

    @OriginalMember(owner = "client!mu", name = "g", descriptor = "I")
    public static int field2643;

    @OriginalMember(owner = "client!mu", name = "h", descriptor = "I")
    private int field2644;

    @OriginalMember(owner = "client!mu", name = "i", descriptor = "I")
    public static int field2645;

    @OriginalMember(owner = "client!mu", name = "j", descriptor = "I")
    public static int field2646;

    @OriginalMember(owner = "client!mu", name = "k", descriptor = "I")
    private int field2647;

    @OriginalMember(owner = "client!mu", name = "m", descriptor = "I")
    private int field2649;

    @OriginalMember(owner = "client!mu", name = "o", descriptor = "I")
    public static int field2651;

    @OriginalMember(owner = "client!mu", name = "r", descriptor = "I")
    public static int field2654;

    @OriginalMember(owner = "client!mu", name = "q", descriptor = "Lba;")
    public static class268 field2653;

    static {
        int var0 = 0;
        field2650 = new byte[32896];
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field2650[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
            }
        }
        field2652 = new class367(0, 0);
        field2656 = null;
        field2655 = 0;
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(I)I", line = 3)
    public final int method1322(int arg0) {
        if (arg0 != -13908) {
            this.field2644 = -114;
        }
        if (this.field2638 == 0) {
            this.method1323(true);
            this.field2638 = 256;
        }
        field2645++;
        return this.field2642[this.field2638 - 1];
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(Z)V", line = 23)
    private final void method1323(boolean arg0) {
        field2651++;
        if (!arg0) {
            method1324(-43);
        }
        this.field2647 += ++this.field2649;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field2648[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field2644 ^= this.field2644 << 13;
                } else {
                    this.field2644 ^= this.field2644 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field2644 ^= this.field2644 << 2;
            } else {
                this.field2644 ^= this.field2644 >>> 16;
            }
            this.field2644 += this.field2648[var2 + 128 & 0xFF];
            int var4;
            this.field2648[var2] = var4 = this.field2647 + (this.field2648[class519.method3092(var3, 1020) >> 2] + this.field2644);
            this.field2642[var2] = this.field2647 = this.field2648[class519.method3092(var4 >> 8 >> 2, 255)] + var3;
        }
    }

    @OriginalMember(owner = "client!mu", name = "b", descriptor = "(I)V", line = 65)
    public static void method1324(int arg0) {
        field2637 = null;
        field2650 = null;
        field2652 = null;
        field2656 = null;
        if (arg0 == 4) {
            field2653 = null;
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(CI)Z", line = 79)
    public static final boolean method1325(char arg0, int arg1) {
        field2643++;
        if (arg1 != 122) {
            field2637 = null;
        }
        return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
    }

    @OriginalMember(owner = "client!mu", name = "c", descriptor = "(I)V", line = 93)
    private final void method1326(int arg0) {
        field2641++;
        if (arg0 != -3730) {
            this.field2644 = -7;
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
            int var70 = var3 + var6;
            int var71 = var65 + var69;
            var5 = var71 ^ var69 << 10;
            int var72 = var2 + var5;
            int var73 = var69 + var70;
            var4 = var73 ^ var70 >>> 4;
            int var74 = var70 + var72;
            int var75 = var4 + var61;
            var3 = var74 ^ var72 << 8;
            var8 = var3 + var64;
            int var76 = var72 + var75;
            var2 = var76 ^ var75 >>> 9;
            var9 = var8 + var75;
            var7 = var2 + var67;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field2642[var11 + 3] + var6;
            int var38 = this.field2642[var11 + 7] + var2;
            int var39 = this.field2642[var11 + 4] + var5;
            int var40 = this.field2642[var11 + 2] + var7;
            int var41 = this.field2642[var11 + 6] + var3;
            int var42 = this.field2642[var11 + 1] + var8;
            int var43 = this.field2642[var11 + 5] + var4;
            int var44 = this.field2642[var11] + var9;
            int var45 = var44 ^ var42 << 11;
            int var46 = var37 + var45;
            int var47 = var40 + var42;
            int var48 = var47 ^ var40 >>> 2;
            int var49 = var39 + var48;
            int var50 = var40 + var46;
            int var51 = var50 ^ var46 << 8;
            int var52 = var43 + var51;
            int var53 = var46 + var49;
            var6 = var53 ^ var49 >>> 16;
            int var54 = var49 + var52;
            int var55 = var6 + var41;
            var5 = var54 ^ var52 << 10;
            int var56 = var52 + var55;
            int var57 = var5 + var38;
            var4 = var56 ^ var55 >>> 4;
            int var58 = var55 + var57;
            int var59 = var4 + var45;
            var3 = var58 ^ var57 << 8;
            int var60 = var57 + var59;
            var8 = var3 + var48;
            var2 = var60 ^ var59 >>> 9;
            var9 = var8 + var59;
            var7 = var2 + var51;
            this.field2648[var11] = var9;
            this.field2648[var11 + 1] = var8;
            this.field2648[var11 + 2] = var7;
            this.field2648[var11 + 3] = var6;
            this.field2648[var11 + 4] = var5;
            this.field2648[var11 + 5] = var4;
            this.field2648[var11 + 6] = var3;
            this.field2648[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field2648[var12 + 6] + var3;
            int var14 = this.field2648[var12 + 1] + var8;
            int var15 = this.field2648[var12 + 3] + var6;
            int var16 = this.field2648[var12 + 7] + var2;
            int var17 = this.field2648[var12 + 5] + var4;
            int var18 = this.field2648[var12] + var9;
            int var19 = this.field2648[var12 + 4] + var5;
            int var20 = this.field2648[var12 + 2] + var7;
            int var21 = var18 ^ var14 << 11;
            int var22 = var14 + var20;
            int var23 = var15 + var21;
            int var24 = var22 ^ var20 >>> 2;
            int var25 = var20 + var23;
            int var26 = var19 + var24;
            int var27 = var25 ^ var23 << 8;
            int var28 = var23 + var26;
            int var29 = var17 + var27;
            var6 = var28 ^ var26 >>> 16;
            int var30 = var26 + var29;
            int var31 = var6 + var13;
            var5 = var30 ^ var29 << 10;
            int var32 = var5 + var16;
            int var33 = var29 + var31;
            var4 = var33 ^ var31 >>> 4;
            int var34 = var31 + var32;
            int var35 = var4 + var21;
            var3 = var34 ^ var32 << 8;
            var8 = var3 + var24;
            int var36 = var32 + var35;
            var2 = var36 ^ var35 >>> 9;
            var7 = var2 + var27;
            var9 = var8 + var35;
            this.field2648[var12] = var9;
            this.field2648[var12 + 1] = var8;
            this.field2648[var12 + 2] = var7;
            this.field2648[var12 + 3] = var6;
            this.field2648[var12 + 4] = var5;
            this.field2648[var12 + 5] = var4;
            this.field2648[var12 + 6] = var3;
            this.field2648[var12 + 7] = var2;
        }
        this.method1323(true);
        this.field2638 = 256;
    }

    @OriginalMember(owner = "client!mu", name = "d", descriptor = "(I)I", line = 242)
    public final int method1327(int arg0) {
        if (~this.field2638 == arg0) {
            this.method1323(true);
            this.field2638 = 256;
        }
        field2639++;
        return this.field2642[--this.field2638];
    }

    @OriginalMember(owner = "client!mu", name = "e", descriptor = "(I)Z", line = 267)
    public static final boolean method1328(int arg0) {
        if (arg0 < 60) {
            field2650 = null;
        }
        field2640++;
        if (class211.field2989) {
            try {
                if ((Boolean) class305.method1920(class312.field4572.field7381, "showingVideoAd", 21694)) {
                    return false;
                }
                return true;
            } catch (Throwable var1) {
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!mu", name = "<init>", descriptor = "()V", line = 311)
    private class199() {
    }

    @OriginalMember(owner = "client!mu", name = "<init>", descriptor = "([I)V", line = 313)
    public class199(int[] arg0) {
        this.field2642 = new int[256];
        this.field2648 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field2642[var2] = arg0[var2];
        }
        this.method1326(-3730);
    }
}
