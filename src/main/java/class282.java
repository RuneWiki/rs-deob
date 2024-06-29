import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class282 {

    @OriginalMember(owner = "client!rf", name = "p", descriptor = "[I")
    private int[] field4475;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "[I")
    private int[] field4460;

    @OriginalMember(owner = "client!rf", name = "g", descriptor = "[I")
    public static int[] field4466 = new int[14];

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "I")
    public static int field4463 = 0;

    @OriginalMember(owner = "client!rf", name = "h", descriptor = "Ljava/lang/String;")
    public static String field4467 = "Loaded textures";

    @OriginalMember(owner = "client!rf", name = "n", descriptor = "Z")
    public static boolean field4473 = false;

    @OriginalMember(owner = "client!rf", name = "o", descriptor = "Ljava/lang/String;")
    public static String field4474 = "Connecting to update server";

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "I")
    private int field4462;

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "I")
    public static int field4464;

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "I")
    public static int field4465;

    @OriginalMember(owner = "client!rf", name = "i", descriptor = "I")
    private int field4468;

    @OriginalMember(owner = "client!rf", name = "j", descriptor = "I")
    private int field4469;

    @OriginalMember(owner = "client!rf", name = "k", descriptor = "I")
    public static int field4470;

    @OriginalMember(owner = "client!rf", name = "l", descriptor = "I")
    public static int field4471;

    @OriginalMember(owner = "client!rf", name = "m", descriptor = "I")
    public static int field4472;

    @OriginalMember(owner = "client!rf", name = "r", descriptor = "I")
    private int field4477;

    @OriginalMember(owner = "client!rf", name = "q", descriptor = "Ljava/awt/Image;")
    public static Image field4476;

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "[Lea;")
    public static class37[] field4461;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(B)V")
    private final void method1898(byte arg0) {
        field4464++;
        if (arg0 <= 95) {
            this.method1901(-45);
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
            int var63 = var62 ^ var7 >>> 2;
            int var64 = var5 + var63;
            int var65 = var6 + var61;
            int var66 = var7 + var65;
            int var67 = var66 ^ var65 << 8;
            int var68 = var4 + var67;
            int var69 = var64 + var65;
            var6 = var69 ^ var64 >>> 16;
            int var70 = var64 + var68;
            int var71 = var3 + var6;
            var5 = var70 ^ var68 << 10;
            int var72 = var68 + var71;
            var4 = var72 ^ var71 >>> 4;
            int var73 = var2 + var5;
            int var74 = var4 + var61;
            int var75 = var71 + var73;
            var3 = var75 ^ var73 << 8;
            var8 = var3 + var63;
            int var76 = var73 + var74;
            var2 = var76 ^ var74 >>> 9;
            var9 = var8 + var74;
            var7 = var2 + var67;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field4475[var11 + 6] + var3;
            int var38 = this.field4475[var11 + 2] + var7;
            int var39 = this.field4475[var11 + 4] + var5;
            int var40 = this.field4475[var11 + 1] + var8;
            int var41 = this.field4475[var11 + 7] + var2;
            int var42 = this.field4475[var11 + 5] + var4;
            int var43 = this.field4475[var11] + var9;
            int var44 = var43 ^ var40 << 11;
            int var45 = this.field4475[var11 + 3] + var6;
            int var46 = var38 + var40;
            int var47 = var46 ^ var38 >>> 2;
            int var48 = var39 + var47;
            int var49 = var44 + var45;
            int var50 = var38 + var49;
            int var51 = var50 ^ var49 << 8;
            int var52 = var48 + var49;
            int var53 = var42 + var51;
            var6 = var52 ^ var48 >>> 16;
            int var54 = var6 + var37;
            int var55 = var48 + var53;
            var5 = var55 ^ var53 << 10;
            int var56 = var5 + var41;
            int var57 = var53 + var54;
            var4 = var57 ^ var54 >>> 4;
            int var58 = var4 + var44;
            int var59 = var54 + var56;
            var3 = var59 ^ var56 << 8;
            int var60 = var56 + var58;
            var8 = var3 + var47;
            var2 = var60 ^ var58 >>> 9;
            var9 = var8 + var58;
            var7 = var2 + var51;
            this.field4460[var11] = var9;
            this.field4460[var11 + 1] = var8;
            this.field4460[var11 + 2] = var7;
            this.field4460[var11 + 3] = var6;
            this.field4460[var11 + 4] = var5;
            this.field4460[var11 + 5] = var4;
            this.field4460[var11 + 6] = var3;
            this.field4460[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field4460[var12 + 4] + var5;
            int var14 = this.field4460[var12 + 2] + var7;
            int var15 = this.field4460[var12 + 7] + var2;
            int var16 = this.field4460[var12 + 3] + var6;
            int var17 = this.field4460[var12 + 5] + var4;
            int var18 = this.field4460[var12] + var9;
            int var19 = this.field4460[var12 + 1] + var8;
            int var20 = var18 ^ var19 << 11;
            int var21 = var16 + var20;
            int var22 = this.field4460[var12 + 6] + var3;
            int var23 = var14 + var19;
            int var24 = var23 ^ var14 >>> 2;
            int var25 = var14 + var21;
            int var26 = var25 ^ var21 << 8;
            int var27 = var13 + var24;
            int var28 = var21 + var27;
            var6 = var28 ^ var27 >>> 16;
            int var29 = var6 + var22;
            int var30 = var17 + var26;
            int var31 = var27 + var30;
            var5 = var31 ^ var30 << 10;
            int var32 = var5 + var15;
            int var33 = var29 + var30;
            var4 = var33 ^ var29 >>> 4;
            int var34 = var29 + var32;
            int var35 = var4 + var20;
            var3 = var34 ^ var32 << 8;
            var8 = var3 + var24;
            int var36 = var32 + var35;
            var2 = var36 ^ var35 >>> 9;
            var7 = var2 + var26;
            var9 = var8 + var35;
            this.field4460[var12] = var9;
            this.field4460[var12 + 1] = var8;
            this.field4460[var12 + 2] = var7;
            this.field4460[var12 + 3] = var6;
            this.field4460[var12 + 4] = var5;
            this.field4460[var12 + 5] = var4;
            this.field4460[var12 + 6] = var3;
            this.field4460[var12 + 7] = var2;
        }
        this.method1901(23913);
        this.field4462 = 256;
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(B)V")
    public static void method1899(byte arg0) {
        field4466 = null;
        int var1 = -19 / ((-arg0 - 29) / 32);
        field4461 = null;
        field4476 = null;
        field4467 = null;
        field4474 = null;
    }

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "(B)I")
    public final int method1900(byte arg0) {
        field4470++;
        if (arg0 != 55) {
            return -80;
        }
        if (this.field4462-- == 0) {
            this.method1901(23913);
            this.field4462 = 255;
        }
        return this.field4475[this.field4462];
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)V")
    private final void method1901(int arg0) {
        if (arg0 != 23913) {
            this.method1901(-50);
        }
        this.field4469 += ++this.field4477;
        field4465++;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field4460[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field4468 ^= this.field4468 << 13;
                } else {
                    this.field4468 ^= this.field4468 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field4468 ^= this.field4468 << 2;
            } else {
                this.field4468 ^= this.field4468 >>> 16;
            }
            this.field4468 += this.field4460[var2 + 128 & 0xFF];
            int var4;
            this.field4460[var2] = var4 = this.field4469 + this.field4460[class202.method1393(var3 >> 2, 255)] + this.field4468;
            this.field4475[var2] = this.field4469 = this.field4460[class202.method1393(var4 >> 8 >> 2, 255)] + var3;
        }
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "()V")
    private class282() {
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "([I)V")
    public class282(int[] arg0) {
        this.field4475 = new int[256];
        this.field4460 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field4475[var2] = arg0[var2];
        }
        this.method1898((byte) 116);
    }
}
