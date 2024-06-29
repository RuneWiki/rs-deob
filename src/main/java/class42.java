import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class42 {

    @OriginalMember(owner = "client!lj", name = "n", descriptor = "[I")
    private int[] field506;

    @OriginalMember(owner = "client!lj", name = "o", descriptor = "[I")
    private int[] field507;

    @OriginalMember(owner = "client!lj", name = "j", descriptor = "Ljava/lang/String;")
    public static String field502 = "glow3:";

    @OriginalMember(owner = "client!lj", name = "g", descriptor = "I")
    public static volatile int field499 = -1;

    @OriginalMember(owner = "client!lj", name = "l", descriptor = "I")
    public static int field504 = 0;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "I")
    private int field493;

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "I")
    private int field494;

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "I")
    public static int field495;

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "I")
    public static int field496;

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "I")
    private int field497;

    @OriginalMember(owner = "client!lj", name = "f", descriptor = "I")
    private int field498;

    @OriginalMember(owner = "client!lj", name = "h", descriptor = "I")
    public static int field500;

    @OriginalMember(owner = "client!lj", name = "i", descriptor = "I")
    public static int field501;

    @OriginalMember(owner = "client!lj", name = "k", descriptor = "I")
    public static int field503;

    @OriginalMember(owner = "client!lj", name = "m", descriptor = "I")
    public static int field505;

    @OriginalMember(owner = "client!lj", name = "p", descriptor = "I")
    public static int field508;

    @OriginalMember(owner = "client!lj", name = "q", descriptor = "I")
    public static int field509;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Z)V")
    private final void method321(boolean arg0) {
        field501++;
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
            int var68 = var4 + var67;
            int var69 = var63 + var66;
            var6 = var69 ^ var66 >>> 16;
            int var70 = var3 + var6;
            int var71 = var66 + var68;
            var5 = var71 ^ var68 << 10;
            int var72 = var68 + var70;
            int var73 = var2 + var5;
            var4 = var72 ^ var70 >>> 4;
            int var74 = var70 + var73;
            var3 = var74 ^ var73 << 8;
            var8 = var3 + var64;
            int var75 = var4 + var61;
            int var76 = var73 + var75;
            var2 = var76 ^ var75 >>> 9;
            var7 = var2 + var67;
            var9 = var8 + var75;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field506[var11 + 2] + var7;
            int var38 = this.field506[var11 + 3] + var6;
            int var39 = this.field506[var11] + var9;
            int var40 = this.field506[var11 + 5] + var4;
            int var41 = this.field506[var11 + 1] + var8;
            int var42 = this.field506[var11 + 4] + var5;
            int var43 = var39 ^ var41 << 11;
            int var44 = this.field506[var11 + 7] + var2;
            int var45 = var38 + var43;
            int var46 = this.field506[var11 + 6] + var3;
            int var47 = var37 + var41;
            int var48 = var47 ^ var37 >>> 2;
            int var49 = var37 + var45;
            int var50 = var42 + var48;
            int var51 = var49 ^ var45 << 8;
            int var52 = var45 + var50;
            var6 = var52 ^ var50 >>> 16;
            int var53 = var6 + var46;
            int var54 = var40 + var51;
            int var55 = var50 + var54;
            var5 = var55 ^ var54 << 10;
            int var56 = var5 + var44;
            int var57 = var53 + var54;
            var4 = var57 ^ var53 >>> 4;
            int var58 = var53 + var56;
            var3 = var58 ^ var56 << 8;
            int var59 = var4 + var43;
            var8 = var3 + var48;
            int var60 = var56 + var59;
            var2 = var60 ^ var59 >>> 9;
            var9 = var8 + var59;
            this.field507[var11] = var9;
            this.field507[var11 + 1] = var8;
            var7 = var2 + var51;
            this.field507[var11 + 2] = var7;
            this.field507[var11 + 3] = var6;
            this.field507[var11 + 4] = var5;
            this.field507[var11 + 5] = var4;
            this.field507[var11 + 6] = var3;
            this.field507[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field507[var12 + 3] + var6;
            int var14 = this.field507[var12 + 5] + var4;
            int var15 = this.field507[var12] + var9;
            int var16 = this.field507[var12 + 2] + var7;
            int var17 = this.field507[var12 + 1] + var8;
            int var18 = this.field507[var12 + 4] + var5;
            int var19 = var15 ^ var17 << 11;
            int var20 = this.field507[var12 + 6] + var3;
            int var21 = var16 + var17;
            int var22 = var13 + var19;
            int var23 = var21 ^ var16 >>> 2;
            int var24 = var16 + var22;
            int var25 = var24 ^ var22 << 8;
            int var26 = var14 + var25;
            int var27 = this.field507[var12 + 7] + var2;
            int var28 = var18 + var23;
            int var29 = var22 + var28;
            var6 = var29 ^ var28 >>> 16;
            int var30 = var26 + var28;
            int var31 = var6 + var20;
            var5 = var30 ^ var26 << 10;
            int var32 = var26 + var31;
            int var33 = var5 + var27;
            var4 = var32 ^ var31 >>> 4;
            int var34 = var4 + var19;
            int var35 = var31 + var33;
            var3 = var35 ^ var33 << 8;
            int var36 = var33 + var34;
            var2 = var36 ^ var34 >>> 9;
            var8 = var3 + var23;
            var7 = var2 + var25;
            var9 = var8 + var34;
            this.field507[var12] = var9;
            this.field507[var12 + 1] = var8;
            this.field507[var12 + 2] = var7;
            this.field507[var12 + 3] = var6;
            this.field507[var12 + 4] = var5;
            this.field507[var12 + 5] = var4;
            this.field507[var12 + 6] = var3;
            this.field507[var12 + 7] = var2;
        }
        if (!arg0) {
            this.method324(26);
        }
        this.method324(78941357);
        this.field498 = 256;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(B)I")
    public final int method322(byte arg0) {
        if (this.field498-- == 0) {
            this.method324(78941357);
            this.field498 = 255;
        }
        if (arg0 != 121) {
            this.method321(true);
        }
        field508++;
        return this.field506[this.field498];
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IJ)V")
    public static final void method323(int arg0, long arg1) {
        try {
            Thread.sleep(arg1);
        } catch (InterruptedException var3) {
        }
        if (arg0 > -78) {
            field499 = -48;
        }
        field495++;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(I)V")
    private final void method324(int arg0) {
        field505++;
        this.field493 += ++this.field494;
        if (arg0 != 78941357) {
            return;
        }
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field507[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field497 ^= this.field497 << 13;
                } else {
                    this.field497 ^= this.field497 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field497 ^= this.field497 << 2;
            } else {
                this.field497 ^= this.field497 >>> 16;
            }
            this.field497 += this.field507[var2 + 128 & 0xFF];
            int var4;
            this.field507[var2] = var4 = this.field507[class204.method1369(255, var3 >> 2)] + this.field497 + this.field493;
            this.field506[var2] = this.field493 = this.field507[class204.method1369(255, var4 >> 8 >> 2)] + var3;
        }
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(I)V")
    public static void method325(int arg0) {
        field502 = null;
        if (arg0 != 5) {
            method325(-50);
        }
    }

    @OriginalMember(owner = "client!lj", name = "<init>", descriptor = "()V")
    private class42() {
    }

    @OriginalMember(owner = "client!lj", name = "<init>", descriptor = "([I)V")
    public class42(int[] arg0) {
        this.field506 = new int[256];
        this.field507 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field506[var2] = arg0[var2];
        }
        this.method321(true);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(ILjj;)V")
    public static final void method326(int arg0, class134 arg1) {
        if (arg0 < 38) {
            field499 = -98;
        }
        class28.field337 = arg1;
        field503++;
    }
}
