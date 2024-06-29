import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class115 {

    @OriginalMember(owner = "client!we", name = "d", descriptor = "[I")
    private int[] field1829;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "[I")
    private int[] field1826;

    @OriginalMember(owner = "client!we", name = "h", descriptor = "[[[I")
    public static int[][][] field1833 = new int[2][][];

    @OriginalMember(owner = "client!we", name = "b", descriptor = "I")
    private int field1827;

    @OriginalMember(owner = "client!we", name = "c", descriptor = "I")
    public static int field1828;

    @OriginalMember(owner = "client!we", name = "f", descriptor = "I")
    public static int field1831;

    @OriginalMember(owner = "client!we", name = "g", descriptor = "I")
    public static int field1832;

    @OriginalMember(owner = "client!we", name = "i", descriptor = "I")
    public static int field1834;

    @OriginalMember(owner = "client!we", name = "j", descriptor = "I")
    private int field1835;

    @OriginalMember(owner = "client!we", name = "k", descriptor = "I")
    private int field1836;

    @OriginalMember(owner = "client!we", name = "l", descriptor = "I")
    private int field1837;

    @OriginalMember(owner = "client!we", name = "m", descriptor = "I")
    public static int field1838;

    @OriginalMember(owner = "client!we", name = "e", descriptor = "Lll;")
    public static class490 field1830;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(B)V", line = 5)
    private final void method926(byte arg0) {
        if (arg0 != 38) {
            this.method930(4);
        }
        field1838++;
        this.field1827 += ++this.field1837;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field1829[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field1835 ^= this.field1835 << 13;
                } else {
                    this.field1835 ^= this.field1835 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field1835 ^= this.field1835 << 2;
            } else {
                this.field1835 ^= this.field1835 >>> 16;
            }
            this.field1835 += this.field1829[var2 + 128 & 0xFF];
            int var4;
            this.field1829[var2] = var4 = this.field1827 + this.field1829[class248.method1593(255, var3 >> 2)] + this.field1835;
            this.field1826[var2] = this.field1827 = var3 + this.field1829[class248.method1593(var4 >> 8, 1020) >> 2];
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(I)V", line = 50)
    public static void method927(int arg0) {
        field1833 = null;
        field1830 = null;
        if (arg0 != 1747281033) {
            method927(90);
        }
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(B)I", line = 62)
    public final int method928(byte arg0) {
        if (arg0 >= -70) {
            method927(-77);
        }
        if (this.field1836 == 0) {
            this.method926((byte) 38);
            this.field1836 = 256;
        }
        field1831++;
        return this.field1826[this.field1836 - 1];
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(I)I", line = 85)
    public final int method929(int arg0) {
        field1834++;
        if (this.field1836 == 0) {
            this.method926((byte) 38);
            this.field1836 = 256;
        }
        int var2 = -94 % ((arg0 - 63) / 53);
        return this.field1826[--this.field1836];
    }

    @OriginalMember(owner = "client!we", name = "c", descriptor = "(I)V", line = 102)
    private final void method930(int arg0) {
        field1828++;
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
            int var68 = var4 + var67;
            int var69 = var62 + var65;
            var6 = var69 ^ var65 >>> 16;
            int var70 = var65 + var68;
            int var71 = var3 + var6;
            var5 = var70 ^ var68 << 10;
            int var72 = var2 + var5;
            int var73 = var68 + var71;
            var4 = var73 ^ var71 >>> 4;
            int var74 = var71 + var72;
            int var75 = var4 + var61;
            var3 = var74 ^ var72 << 8;
            var8 = var3 + var64;
            int var76 = var72 + var75;
            var2 = var76 ^ var75 >>> 9;
            var9 = var8 + var75;
            var7 = var2 + var67;
        }
        if (arg0 != -1) {
            return;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field1826[var11 + 6] + var3;
            int var38 = this.field1826[var11 + 2] + var7;
            int var39 = this.field1826[var11 + 5] + var4;
            int var40 = this.field1826[var11 + 4] + var5;
            int var41 = this.field1826[var11 + 1] + var8;
            int var42 = this.field1826[var11 + 3] + var6;
            int var43 = this.field1826[var11 + 7] + var2;
            int var44 = this.field1826[var11] + var9;
            int var45 = var44 ^ var41 << 11;
            int var46 = var38 + var41;
            int var47 = var42 + var45;
            int var48 = var46 ^ var38 >>> 2;
            int var49 = var38 + var47;
            int var50 = var40 + var48;
            int var51 = var49 ^ var47 << 8;
            int var52 = var47 + var50;
            int var53 = var39 + var51;
            var6 = var52 ^ var50 >>> 16;
            int var54 = var6 + var37;
            int var55 = var50 + var53;
            var5 = var55 ^ var53 << 10;
            int var56 = var53 + var54;
            int var57 = var5 + var43;
            var4 = var56 ^ var54 >>> 4;
            int var58 = var54 + var57;
            int var59 = var4 + var45;
            var3 = var58 ^ var57 << 8;
            int var60 = var57 + var59;
            var8 = var3 + var48;
            var2 = var60 ^ var59 >>> 9;
            var7 = var2 + var51;
            var9 = var8 + var59;
            this.field1829[var11] = var9;
            this.field1829[var11 + 1] = var8;
            this.field1829[var11 + 2] = var7;
            this.field1829[var11 + 3] = var6;
            this.field1829[var11 + 4] = var5;
            this.field1829[var11 + 5] = var4;
            this.field1829[var11 + 6] = var3;
            this.field1829[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field1829[var12 + 4] + var5;
            int var14 = this.field1829[var12 + 6] + var3;
            int var15 = this.field1829[var12] + var9;
            int var16 = this.field1829[var12 + 7] + var2;
            int var17 = this.field1829[var12 + 1] + var8;
            int var18 = this.field1829[var12 + 3] + var6;
            int var19 = this.field1829[var12 + 5] + var4;
            int var20 = this.field1829[var12 + 2] + var7;
            int var21 = var15 ^ var17 << 11;
            int var22 = var18 + var21;
            int var23 = var17 + var20;
            int var24 = var23 ^ var20 >>> 2;
            int var25 = var13 + var24;
            int var26 = var20 + var22;
            int var27 = var26 ^ var22 << 8;
            int var28 = var19 + var27;
            int var29 = var22 + var25;
            var6 = var29 ^ var25 >>> 16;
            int var30 = var25 + var28;
            int var31 = var6 + var14;
            var5 = var30 ^ var28 << 10;
            int var32 = var5 + var16;
            int var33 = var28 + var31;
            var4 = var33 ^ var31 >>> 4;
            int var34 = var4 + var21;
            int var35 = var31 + var32;
            var3 = var35 ^ var32 << 8;
            int var36 = var32 + var34;
            var8 = var3 + var24;
            var2 = var36 ^ var34 >>> 9;
            var7 = var2 + var27;
            var9 = var8 + var34;
            this.field1829[var12] = var9;
            this.field1829[var12 + 1] = var8;
            this.field1829[var12 + 2] = var7;
            this.field1829[var12 + 3] = var6;
            this.field1829[var12 + 4] = var5;
            this.field1829[var12 + 5] = var4;
            this.field1829[var12 + 6] = var3;
            this.field1829[var12 + 7] = var2;
        }
        this.method926((byte) 38);
        this.field1836 = 256;
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "()V", line = 252)
    private class115() {
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ILod;)Ljava/lang/String;", line = 255)
    public static final String method931(int arg0, class673 arg1) {
        field1832++;
        if (arg0 != 0) {
            method927(-1);
        }
        return arg1.field9542 == null || arg1.field9542.length() <= 0 ? arg1.field9549 : arg1.field9549 + class343.field4781.method2059(class238.field3511, true) + arg1.field9542;
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "([I)V", line = 275)
    public class115(int[] arg0) {
        this.field1829 = new int[256];
        this.field1826 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field1826[var2] = arg0[var2];
        }
        this.method930(-1);
    }
}
