import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class227 {

    @OriginalMember(owner = "client!md", name = "k", descriptor = "[I")
    private int[] field3406;

    @OriginalMember(owner = "client!md", name = "d", descriptor = "[I")
    private int[] field3399;

    @OriginalMember(owner = "client!md", name = "b", descriptor = "I")
    public static int field3397 = 0;

    @OriginalMember(owner = "client!md", name = "m", descriptor = "Ljava/lang/String;")
    public static String field3408 = "shake:";

    @OriginalMember(owner = "client!md", name = "c", descriptor = "I")
    public static int field3398;

    @OriginalMember(owner = "client!md", name = "f", descriptor = "I")
    public static int field3401;

    @OriginalMember(owner = "client!md", name = "g", descriptor = "I")
    private int field3402;

    @OriginalMember(owner = "client!md", name = "h", descriptor = "I")
    public static int field3403;

    @OriginalMember(owner = "client!md", name = "i", descriptor = "I")
    private int field3404;

    @OriginalMember(owner = "client!md", name = "l", descriptor = "I")
    private int field3407;

    @OriginalMember(owner = "client!md", name = "n", descriptor = "I")
    public static int field3409;

    @OriginalMember(owner = "client!md", name = "o", descriptor = "I")
    private int field3410;

    @OriginalMember(owner = "client!md", name = "p", descriptor = "I")
    public static int field3411;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "Lpf;")
    public static class294 field3396;

    @OriginalMember(owner = "client!md", name = "e", descriptor = "Lpf;")
    public static class294 field3400;

    @OriginalMember(owner = "client!md", name = "j", descriptor = "Lpf;")
    public static class294 field3405;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V")
    public static void method1446(int arg0) {
        field3396 = null;
        field3400 = null;
        field3405 = null;
        field3408 = null;
        if (arg0 < 37) {
            field3405 = null;
        }
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(I)V")
    public static final void method1447(int arg0) {
        for (class199 var1 = (class199) class229.field3449.method1665(arg0 ^ 0x15); var1 != null; var1 = (class199) class229.field3449.method1659((byte) -118)) {
            int var2 = var1.field3026;
            if (class294.method1943((byte) 111, var2)) {
                boolean var3 = true;
                class289[] var4 = class234.field3532[var2];
                for (int var5 = 0; var5 < var4.length; var5++) {
                    if (var4[var5] != null) {
                        var3 = var4[var5].field4495;
                        break;
                    }
                }
                if (!var3) {
                    int var6 = (int) var1.field1321;
                    class289 var7 = class89.method574((byte) -15, var6);
                    if (var7 != null) {
                        class295.method1980(var7, 0);
                    }
                }
            }
        }
        if (arg0 != 5) {
            field3397 = -72;
        }
        field3411++;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(B)V")
    private final void method1448(byte arg0) {
        if (arg0 >= -19) {
            this.method1448((byte) 124);
        }
        field3409++;
        this.field3407 += ++this.field3402;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field3399[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field3410 ^= this.field3410 << 13;
                } else {
                    this.field3410 ^= this.field3410 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field3410 ^= this.field3410 << 2;
            } else {
                this.field3410 ^= this.field3410 >>> 16;
            }
            this.field3410 += this.field3399[var2 + 128 & 0xFF];
            int var4;
            this.field3399[var2] = var4 = this.field3399[class94.method598(1020, var3) >> 2] - (-this.field3410 - this.field3407);
            this.field3406[var2] = this.field3407 = var3 + this.field3399[class94.method598(1020, var4 >> 8) >> 2];
        }
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(B)I")
    public final int method1449(byte arg0) {
        field3401++;
        if (arg0 != -65) {
            return 55;
        }
        if ((this.field3404--) == 0) {
            this.method1448((byte) -22);
            this.field3404 = 255;
        }
        return this.field3406[this.field3404];
    }

    @OriginalMember(owner = "client!md", name = "c", descriptor = "(I)V")
    private final void method1450(int arg0) {
        field3403++;
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
            int var63 = var62 ^ var7 >>> 2;
            int var64 = var5 + var63;
            int var65 = var6 + var61;
            int var66 = var7 + var65;
            int var67 = var66 ^ var65 << 8;
            int var68 = var4 + var67;
            int var69 = var64 + var65;
            var6 = var69 ^ var64 >>> 16;
            int var70 = var3 + var6;
            int var71 = var64 + var68;
            var5 = var71 ^ var68 << 10;
            int var72 = var68 + var70;
            var4 = var72 ^ var70 >>> 4;
            int var73 = var2 + var5;
            int var74 = var4 + var61;
            int var75 = var70 + var73;
            var3 = var75 ^ var73 << 8;
            int var76 = var73 + var74;
            var2 = var76 ^ var74 >>> 9;
            var7 = var2 + var67;
            var8 = var3 + var63;
            var9 = var8 + var74;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field3406[var11 + 4] + var5;
            int var38 = this.field3406[var11 + 2] + var7;
            int var39 = this.field3406[var11 + 6] + var3;
            int var40 = this.field3406[var11] + var9;
            int var41 = this.field3406[var11 + 1] + var8;
            int var42 = this.field3406[var11 + 5] + var4;
            int var43 = var40 ^ var41 << 11;
            int var44 = this.field3406[var11 + 3] + var6;
            int var45 = var43 + var44;
            int var46 = var38 + var41;
            int var47 = this.field3406[var11 + 7] + var2;
            int var48 = var46 ^ var38 >>> 2;
            int var49 = var37 + var48;
            int var50 = var38 + var45;
            int var51 = var50 ^ var45 << 8;
            int var52 = var45 + var49;
            int var53 = var42 + var51;
            var6 = var52 ^ var49 >>> 16;
            int var54 = var49 + var53;
            int var55 = var6 + var39;
            var5 = var54 ^ var53 << 10;
            int var56 = var5 + var47;
            int var57 = var53 + var55;
            var4 = var57 ^ var55 >>> 4;
            int var58 = var4 + var43;
            int var59 = var55 + var56;
            var3 = var59 ^ var56 << 8;
            var8 = var3 + var48;
            int var60 = var56 + var58;
            var2 = var60 ^ var58 >>> 9;
            var7 = var2 + var51;
            var9 = var8 + var58;
            this.field3399[var11] = var9;
            this.field3399[var11 + 1] = var8;
            this.field3399[var11 + 2] = var7;
            this.field3399[var11 + 3] = var6;
            this.field3399[var11 + 4] = var5;
            this.field3399[var11 + 5] = var4;
            this.field3399[var11 + 6] = var3;
            this.field3399[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field3399[var12 + 5] + var4;
            int var14 = this.field3399[var12 + 7] + var2;
            int var15 = this.field3399[var12 + 3] + var6;
            int var16 = this.field3399[var12 + 4] + var5;
            int var17 = this.field3399[var12 + 2] + var7;
            int var18 = this.field3399[var12 + 1] + var8;
            int var19 = this.field3399[var12 + 6] + var3;
            int var20 = this.field3399[var12] + var9;
            int var21 = var20 ^ var18 << 11;
            int var22 = var17 + var18;
            int var23 = var15 + var21;
            int var24 = var22 ^ var17 >>> 2;
            int var25 = var17 + var23;
            int var26 = var25 ^ var23 << 8;
            int var27 = var13 + var26;
            int var28 = var16 + var24;
            int var29 = var23 + var28;
            var6 = var29 ^ var28 >>> 16;
            int var30 = var6 + var19;
            int var31 = var27 + var28;
            var5 = var31 ^ var27 << 10;
            int var32 = var5 + var14;
            int var33 = var27 + var30;
            var4 = var33 ^ var30 >>> 4;
            int var34 = var30 + var32;
            var3 = var34 ^ var32 << 8;
            int var35 = var4 + var21;
            var8 = var3 + var24;
            int var36 = var32 + var35;
            var2 = var36 ^ var35 >>> 9;
            var7 = var2 + var26;
            var9 = var8 + var35;
            this.field3399[var12] = var9;
            this.field3399[var12 + 1] = var8;
            this.field3399[var12 + 2] = var7;
            this.field3399[var12 + 3] = var6;
            this.field3399[var12 + 4] = var5;
            this.field3399[var12 + 5] = var4;
            this.field3399[var12 + 6] = var3;
            this.field3399[var12 + 7] = var2;
        }
        this.method1448((byte) -20);
        this.field3404 = 256;
        if (arg0 != -316918332) {
            method1447(-29);
        }
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "()V")
    private class227() {
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Lpf;Lhl;Lpf;ILpf;)Z")
    public static final boolean method1451(class294 arg0, class40 arg1, class294 arg2, int arg3, class294 arg4) {
        class86.field1383 = arg1;
        class289.field4404 = arg2;
        field3398++;
        class198.field3009 = arg4;
        class226.field3395 = arg0;
        if (arg3 != 0) {
            method1447(-81);
        }
        return true;
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "([I)V")
    public class227(int[] arg0) {
        this.field3406 = new int[256];
        this.field3399 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field3406[var2] = arg0[var2];
        }
        this.method1450(-316918332);
    }
}
