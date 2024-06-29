import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class317 {

    @OriginalMember(owner = "client!w", name = "k", descriptor = "[I")
    private int[] field4552;

    @OriginalMember(owner = "client!w", name = "h", descriptor = "[I")
    private int[] field4549;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "I")
    private int field4542;

    @OriginalMember(owner = "client!w", name = "b", descriptor = "I")
    public static int field4543;

    @OriginalMember(owner = "client!w", name = "c", descriptor = "I")
    public static int field4544;

    @OriginalMember(owner = "client!w", name = "d", descriptor = "I")
    public static int field4545;

    @OriginalMember(owner = "client!w", name = "f", descriptor = "I")
    private int field4547;

    @OriginalMember(owner = "client!w", name = "g", descriptor = "I")
    private int field4548;

    @OriginalMember(owner = "client!w", name = "i", descriptor = "I")
    private int field4550;

    @OriginalMember(owner = "client!w", name = "j", descriptor = "I")
    public static int field4551;

    @OriginalMember(owner = "client!w", name = "l", descriptor = "I")
    public static int field4553;

    @OriginalMember(owner = "client!w", name = "e", descriptor = "Z")
    public static boolean field4546;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(I)I")
    public final int method1994(int arg0) {
        if (this.field4548 == 0) {
            this.method1995(-61);
            this.field4548 = 256;
        }
        field4545++;
        if (arg0 <= 8) {
            this.method1995(-31);
        }
        return this.field4552[this.field4548 - 1];
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(I)V")
    private final void method1995(int arg0) {
        field4551++;
        if (arg0 >= -59) {
            this.field4548 = 52;
        }
        this.field4550 += ++this.field4542;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field4549[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field4547 ^= this.field4547 << 13;
                } else {
                    this.field4547 ^= this.field4547 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field4547 ^= this.field4547 << 2;
            } else {
                this.field4547 ^= this.field4547 >>> 16;
            }
            this.field4547 += this.field4549[var2 + 128 & 0xFF];
            int var4;
            this.field4549[var2] = var4 = this.field4549[class440.method2643(255, var3 >> 2)] + (this.field4547 + this.field4550);
            this.field4552[var2] = this.field4550 = this.field4549[class440.method2643(261213, var4) >> 8 >> 2] + var3;
        }
    }

    @OriginalMember(owner = "client!w", name = "c", descriptor = "(I)I")
    public final int method1996(int arg0) {
        if (this.field4548 == 0) {
            this.method1995(-103);
            this.field4548 = 256;
        }
        field4553++;
        return arg0 >= -47 ? -55 : this.field4552[--this.field4548];
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Z)V")
    private final void method1997(boolean arg0) {
        field4543++;
        if (!arg0) {
            this.field4552 = null;
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
            int var62 = var7 + var8;
            int var63 = var6 + var61;
            int var64 = var62 ^ var7 >>> 2;
            int var65 = var5 + var64;
            int var66 = var7 + var63;
            int var67 = var66 ^ var63 << 8;
            int var68 = var63 + var65;
            int var69 = var4 + var67;
            var6 = var68 ^ var65 >>> 16;
            int var70 = var3 + var6;
            int var71 = var65 + var69;
            var5 = var71 ^ var69 << 10;
            int var72 = var69 + var70;
            int var73 = var2 + var5;
            var4 = var72 ^ var70 >>> 4;
            int var74 = var4 + var61;
            int var75 = var70 + var73;
            var3 = var75 ^ var73 << 8;
            var8 = var3 + var64;
            int var76 = var73 + var74;
            var2 = var76 ^ var74 >>> 9;
            var9 = var8 + var74;
            var7 = var2 + var67;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field4552[var11 + 7] + var2;
            int var38 = this.field4552[var11 + 1] + var8;
            int var39 = this.field4552[var11 + 5] + var4;
            int var40 = this.field4552[var11 + 3] + var6;
            int var41 = this.field4552[var11] + var9;
            int var42 = this.field4552[var11 + 2] + var7;
            int var43 = this.field4552[var11 + 4] + var5;
            int var44 = this.field4552[var11 + 6] + var3;
            int var45 = var41 ^ var38 << 11;
            int var46 = var40 + var45;
            int var47 = var38 + var42;
            int var48 = var47 ^ var42 >>> 2;
            int var49 = var42 + var46;
            int var50 = var43 + var48;
            int var51 = var49 ^ var46 << 8;
            int var52 = var46 + var50;
            int var53 = var39 + var51;
            var6 = var52 ^ var50 >>> 16;
            int var54 = var6 + var44;
            int var55 = var50 + var53;
            var5 = var55 ^ var53 << 10;
            int var56 = var5 + var37;
            int var57 = var53 + var54;
            var4 = var57 ^ var54 >>> 4;
            int var58 = var4 + var45;
            int var59 = var54 + var56;
            var3 = var59 ^ var56 << 8;
            var8 = var3 + var48;
            int var60 = var56 + var58;
            var2 = var60 ^ var58 >>> 9;
            var7 = var2 + var51;
            var9 = var8 + var58;
            this.field4549[var11] = var9;
            this.field4549[var11 + 1] = var8;
            this.field4549[var11 + 2] = var7;
            this.field4549[var11 + 3] = var6;
            this.field4549[var11 + 4] = var5;
            this.field4549[var11 + 5] = var4;
            this.field4549[var11 + 6] = var3;
            this.field4549[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field4549[var12 + 1] + var8;
            int var14 = this.field4549[var12 + 7] + var2;
            int var15 = this.field4549[var12 + 4] + var5;
            int var16 = this.field4549[var12 + 3] + var6;
            int var17 = this.field4549[var12 + 5] + var4;
            int var18 = this.field4549[var12 + 2] + var7;
            int var19 = this.field4549[var12] + var9;
            int var20 = this.field4549[var12 + 6] + var3;
            int var21 = var19 ^ var13 << 11;
            int var22 = var13 + var18;
            int var23 = var16 + var21;
            int var24 = var22 ^ var18 >>> 2;
            int var25 = var18 + var23;
            int var26 = var15 + var24;
            int var27 = var25 ^ var23 << 8;
            int var28 = var17 + var27;
            int var29 = var23 + var26;
            var6 = var29 ^ var26 >>> 16;
            int var30 = var6 + var20;
            int var31 = var26 + var28;
            var5 = var31 ^ var28 << 10;
            int var32 = var28 + var30;
            int var33 = var5 + var14;
            var4 = var32 ^ var30 >>> 4;
            int var34 = var4 + var21;
            int var35 = var30 + var33;
            var3 = var35 ^ var33 << 8;
            var8 = var3 + var24;
            int var36 = var33 + var34;
            var2 = var36 ^ var34 >>> 9;
            var7 = var2 + var27;
            var9 = var8 + var34;
            this.field4549[var12] = var9;
            this.field4549[var12 + 1] = var8;
            this.field4549[var12 + 2] = var7;
            this.field4549[var12 + 3] = var6;
            this.field4549[var12 + 4] = var5;
            this.field4549[var12 + 5] = var4;
            this.field4549[var12 + 6] = var3;
            this.field4549[var12 + 7] = var2;
        }
        this.method1995(-87);
        this.field4548 = 256;
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "()V")
    private class317() {
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "([I)V")
    public class317(int[] arg0) {
        this.field4552 = new int[256];
        this.field4549 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field4552[var2] = arg0[var2];
        }
        this.method1997(true);
    }
}
