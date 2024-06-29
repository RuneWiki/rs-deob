import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class137 {

    @OriginalMember(owner = "client!mg", name = "n", descriptor = "[I")
    private int[] field2537;

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "[I")
    private int[] field2527;

    @OriginalMember(owner = "client!mg", name = "g", descriptor = "Lqe;")
    public static class179 field2530 = class206.method1380(":assistreq:", (byte) 26);

    @OriginalMember(owner = "client!mg", name = "h", descriptor = "Lqe;")
    private static class179 field2531 = class206.method1380("Click to switch", (byte) -128);

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "Lqe;")
    public static class179 field2528 = field2531;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "I")
    public static int field2524;

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "I")
    public static int field2525;

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "I")
    private int field2526;

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "I")
    private int field2529;

    @OriginalMember(owner = "client!mg", name = "i", descriptor = "I")
    private int field2532;

    @OriginalMember(owner = "client!mg", name = "j", descriptor = "I")
    public static int field2533;

    @OriginalMember(owner = "client!mg", name = "k", descriptor = "I")
    public static int field2534;

    @OriginalMember(owner = "client!mg", name = "l", descriptor = "I")
    public static int field2535;

    @OriginalMember(owner = "client!mg", name = "m", descriptor = "I")
    private int field2536;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)V")
    private final void method870(int arg0) {
        field2534++;
        this.field2532 += ++this.field2526;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field2527[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field2536 ^= this.field2536 << 13;
                } else {
                    this.field2536 ^= this.field2536 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field2536 ^= this.field2536 << 2;
            } else {
                this.field2536 ^= this.field2536 >>> 16;
            }
            this.field2536 += this.field2527[var2 + 128 & 0xFF];
            int var4;
            this.field2527[var2] = var4 = this.field2532 + this.field2527[class107.method696(255, var3 >> 2)] + this.field2536;
            this.field2537[var2] = this.field2532 = var3 + this.field2527[class107.method696(var4 >> 8 >> 2, 255)];
        }
        if (arg0 != -1640531527) {
            this.method872(-96);
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(B)I")
    public final int method871(byte arg0) {
        if (this.field2529-- == 0) {
            this.method870(-1640531527);
            this.field2529 = 255;
        }
        if (arg0 == 73) {
            field2533++;
            return this.field2537[this.field2529];
        } else {
            return 44;
        }
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(I)V")
    private final void method872(int arg0) {
        field2525++;
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
            int var70 = var67 + var68;
            var5 = var70 ^ var67 << 10;
            int var71 = var2 + var5;
            int var72 = var3 + var6;
            int var73 = var67 + var72;
            var4 = var73 ^ var72 >>> 4;
            int var74 = var71 + var72;
            int var75 = var4 + var61;
            var3 = var74 ^ var71 << 8;
            int var76 = var71 + var75;
            var2 = var76 ^ var75 >>> 9;
            var7 = var2 + var66;
            var8 = var3 + var64;
            var9 = var8 + var75;
        }
        if (arg0 != -5888) {
            method873(-45L, 27);
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field2537[var11 + 5] + var4;
            int var38 = this.field2537[var11 + 3] + var6;
            int var39 = this.field2537[var11 + 6] + var3;
            int var40 = this.field2537[var11 + 4] + var5;
            int var41 = this.field2537[var11 + 2] + var7;
            int var42 = this.field2537[var11 + 1] + var8;
            int var43 = this.field2537[var11 + 7] + var2;
            int var44 = this.field2537[var11] + var9;
            int var45 = var44 ^ var42 << 11;
            int var46 = var38 + var45;
            int var47 = var41 + var42;
            int var48 = var47 ^ var41 >>> 2;
            int var49 = var41 + var46;
            int var50 = var49 ^ var46 << 8;
            int var51 = var37 + var50;
            int var52 = var40 + var48;
            int var53 = var46 + var52;
            var6 = var53 ^ var52 >>> 16;
            int var54 = var6 + var39;
            int var55 = var51 + var52;
            var5 = var55 ^ var51 << 10;
            int var56 = var5 + var43;
            int var57 = var51 + var54;
            var4 = var57 ^ var54 >>> 4;
            int var58 = var4 + var45;
            int var59 = var54 + var56;
            var3 = var59 ^ var56 << 8;
            var8 = var3 + var48;
            int var60 = var56 + var58;
            var2 = var60 ^ var58 >>> 9;
            var9 = var8 + var58;
            this.field2527[var11] = var9;
            var7 = var2 + var50;
            this.field2527[var11 + 1] = var8;
            this.field2527[var11 + 2] = var7;
            this.field2527[var11 + 3] = var6;
            this.field2527[var11 + 4] = var5;
            this.field2527[var11 + 5] = var4;
            this.field2527[var11 + 6] = var3;
            this.field2527[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field2527[var12 + 1] + var8;
            int var14 = this.field2527[var12 + 3] + var6;
            int var15 = this.field2527[var12 + 7] + var2;
            int var16 = this.field2527[var12] + var9;
            int var17 = this.field2527[var12 + 6] + var3;
            int var18 = this.field2527[var12 + 2] + var7;
            int var19 = this.field2527[var12 + 5] + var4;
            int var20 = this.field2527[var12 + 4] + var5;
            int var21 = var16 ^ var13 << 11;
            int var22 = var13 + var18;
            int var23 = var22 ^ var18 >>> 2;
            int var24 = var20 + var23;
            int var25 = var14 + var21;
            int var26 = var18 + var25;
            int var27 = var26 ^ var25 << 8;
            int var28 = var24 + var25;
            int var29 = var19 + var27;
            var6 = var28 ^ var24 >>> 16;
            int var30 = var6 + var17;
            int var31 = var24 + var29;
            var5 = var31 ^ var29 << 10;
            int var32 = var5 + var15;
            int var33 = var29 + var30;
            var4 = var33 ^ var30 >>> 4;
            int var34 = var4 + var21;
            int var35 = var30 + var32;
            var3 = var35 ^ var32 << 8;
            var8 = var3 + var23;
            int var36 = var32 + var34;
            var2 = var36 ^ var34 >>> 9;
            var7 = var2 + var27;
            var9 = var8 + var34;
            this.field2527[var12] = var9;
            this.field2527[var12 + 1] = var8;
            this.field2527[var12 + 2] = var7;
            this.field2527[var12 + 3] = var6;
            this.field2527[var12 + 4] = var5;
            this.field2527[var12 + 5] = var4;
            this.field2527[var12 + 6] = var3;
            this.field2527[var12 + 7] = var2;
        }
        this.method870(-1640531527);
        this.field2529 = 256;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(JI)V")
    public static final void method873(long arg0, int arg1) {
        field2535++;
        if (arg0 <= 0L) {
            return;
        }
        if (arg1 != -967787128) {
            field2531 = null;
        }
        if (arg0 % 10L == 0L) {
            class197.method1318(arg1 ^ 0xC650BD8D, arg0 - 1L);
            class197.method1318(5, 1L);
        } else {
            class197.method1318(5, arg0);
        }
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(B)V")
    public static void method874(byte arg0) {
        field2528 = null;
        field2530 = null;
        if (arg0 != 11) {
            field2524 = -68;
        }
        field2531 = null;
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "()V")
    private class137() {
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "([I)V")
    public class137(int[] arg0) {
        this.field2537 = new int[256];
        this.field2527 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field2537[var2] = arg0[var2];
        }
        this.method872(-5888);
    }
}
