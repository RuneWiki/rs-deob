import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class5 {

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "[I")
    private int[] field59;

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "[I")
    private int[] field61;

    @OriginalMember(owner = "client!dc", name = "k", descriptor = "[I")
    public static int[] field69 = new int[5];

    @OriginalMember(owner = "client!dc", name = "m", descriptor = "I")
    public static int field71 = 0;

    @OriginalMember(owner = "client!dc", name = "n", descriptor = "[F")
    public static float[] field72 = new float[4];

    @OriginalMember(owner = "client!dc", name = "o", descriptor = "I")
    public static int field73 = 0;

    @OriginalMember(owner = "client!dc", name = "h", descriptor = "Lso;")
    public static class327 field66 = new class327(7, 4);

    @OriginalMember(owner = "client!dc", name = "q", descriptor = "I")
    public static int field75 = 0;

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "I")
    public static int field60;

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "I")
    public static int field62;

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "I")
    private int field63;

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "I")
    private int field64;

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "I")
    public static int field65;

    @OriginalMember(owner = "client!dc", name = "i", descriptor = "I")
    public static int field67;

    @OriginalMember(owner = "client!dc", name = "j", descriptor = "I")
    private int field68;

    @OriginalMember(owner = "client!dc", name = "l", descriptor = "I")
    private int field70;

    @OriginalMember(owner = "client!dc", name = "p", descriptor = "I")
    public static int field74;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)I")
    public final int method28(int arg0) {
        if (this.field68 == arg0) {
            this.method30((byte) 76);
            this.field68 = 256;
        }
        field67++;
        return this.field61[--this.field68];
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)V")
    public static void method29(int arg0) {
        field69 = null;
        field72 = null;
        field66 = null;
        if (arg0 != -26544) {
            method29(-85);
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(B)V")
    private final void method30(byte arg0) {
        if (arg0 < 64) {
            this.field63 = 12;
        }
        field60++;
        this.field63 += ++this.field64;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field59[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field70 ^= this.field70 << 13;
                } else {
                    this.field70 ^= this.field70 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field70 ^= this.field70 << 2;
            } else {
                this.field70 ^= this.field70 >>> 16;
            }
            this.field70 += this.field59[var2 + 128 & 0xFF];
            int var4;
            this.field59[var2] = var4 = this.field59[class286.method1847(1020, var3) >> 2] + this.field70 + this.field63;
            this.field61[var2] = this.field63 = var3 + this.field59[class286.method1847(var4 >> 8 >> 2, 255)];
        }
    }

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "(I)V")
    private final void method31(int arg0) {
        field62++;
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
            int var68 = var4 + var67;
            int var69 = var63 + var65;
            var6 = var69 ^ var65 >>> 16;
            int var70 = var65 + var68;
            int var71 = var3 + var6;
            var5 = var70 ^ var68 << 10;
            int var72 = var68 + var71;
            int var73 = var2 + var5;
            var4 = var72 ^ var71 >>> 4;
            int var74 = var71 + var73;
            int var75 = var4 + var61;
            var3 = var74 ^ var73 << 8;
            int var76 = var73 + var75;
            var8 = var3 + var64;
            var2 = var76 ^ var75 >>> 9;
            var9 = var8 + var75;
            var7 = var2 + var67;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field61[var11 + 5] + var4;
            int var38 = this.field61[var11 + 6] + var3;
            int var39 = this.field61[var11] + var9;
            int var40 = this.field61[var11 + 7] + var2;
            int var41 = this.field61[var11 + 4] + var5;
            int var42 = this.field61[var11 + 1] + var8;
            int var43 = this.field61[var11 + 3] + var6;
            int var44 = this.field61[var11 + 2] + var7;
            int var45 = var39 ^ var42 << 11;
            int var46 = var43 + var45;
            int var47 = var42 + var44;
            int var48 = var47 ^ var44 >>> 2;
            int var49 = var41 + var48;
            int var50 = var44 + var46;
            int var51 = var50 ^ var46 << 8;
            int var52 = var46 + var49;
            int var53 = var37 + var51;
            var6 = var52 ^ var49 >>> 16;
            int var54 = var6 + var38;
            int var55 = var49 + var53;
            var5 = var55 ^ var53 << 10;
            int var56 = var53 + var54;
            int var57 = var5 + var40;
            var4 = var56 ^ var54 >>> 4;
            int var58 = var4 + var45;
            int var59 = var54 + var57;
            var3 = var59 ^ var57 << 8;
            var8 = var3 + var48;
            int var60 = var57 + var58;
            var2 = var60 ^ var58 >>> 9;
            var7 = var2 + var51;
            var9 = var8 + var58;
            this.field59[var11] = var9;
            this.field59[var11 + 1] = var8;
            this.field59[var11 + 2] = var7;
            this.field59[var11 + 3] = var6;
            this.field59[var11 + 4] = var5;
            this.field59[var11 + 5] = var4;
            this.field59[var11 + 6] = var3;
            this.field59[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field59[var12 + 5] + var4;
            int var14 = this.field59[var12 + 6] + var3;
            int var15 = this.field59[var12 + 7] + var2;
            int var16 = this.field59[var12 + 4] + var5;
            int var17 = this.field59[var12] + var9;
            int var18 = this.field59[var12 + 3] + var6;
            int var19 = this.field59[var12 + 2] + var7;
            int var20 = this.field59[var12 + 1] + var8;
            int var21 = var17 ^ var20 << 11;
            int var22 = var18 + var21;
            int var23 = var19 + var20;
            int var24 = var23 ^ var19 >>> 2;
            int var25 = var16 + var24;
            int var26 = var19 + var22;
            int var27 = var26 ^ var22 << 8;
            int var28 = var22 + var25;
            int var29 = var13 + var27;
            var6 = var28 ^ var25 >>> 16;
            int var30 = var25 + var29;
            int var31 = var6 + var14;
            var5 = var30 ^ var29 << 10;
            int var32 = var5 + var15;
            int var33 = var29 + var31;
            var4 = var33 ^ var31 >>> 4;
            int var34 = var4 + var21;
            int var35 = var31 + var32;
            var3 = var35 ^ var32 << 8;
            int var36 = var32 + var34;
            var8 = var3 + var24;
            var2 = var36 ^ var34 >>> 9;
            var9 = var8 + var34;
            var7 = var2 + var27;
            this.field59[var12] = var9;
            this.field59[var12 + 1] = var8;
            this.field59[var12 + 2] = var7;
            this.field59[var12 + 3] = var6;
            this.field59[var12 + 4] = var5;
            this.field59[var12 + 5] = var4;
            this.field59[var12 + 6] = var3;
            this.field59[var12 + 7] = var2;
        }
        if (arg0 <= 107) {
            this.method31(-102);
        }
        this.method30((byte) 122);
        this.field68 = 256;
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(B)I")
    public final int method32(byte arg0) {
        field65++;
        if (arg0 != 64) {
            field75 = -7;
        }
        if (this.field68 == 0) {
            this.method30((byte) 94);
            this.field68 = 256;
        }
        return this.field61[this.field68 - 1];
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "()V")
    private class5() {
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "([I)V")
    public class5(int[] arg0) {
        this.field59 = new int[256];
        this.field61 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field61[var2] = arg0[var2];
        }
        this.method31(108);
    }
}
