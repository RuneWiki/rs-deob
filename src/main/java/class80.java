import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class80 {

    @OriginalMember(owner = "client!ld", name = "o", descriptor = "[I")
    private int[] field1905 = new int[256];

    @OriginalMember(owner = "client!ld", name = "k", descriptor = "[I")
    private int[] field1901 = new int[256];

    @OriginalMember(owner = "client!ld", name = "m", descriptor = "Lu;")
    private static class135 field1903 = class87.method676((byte) -122, "Offline");

    @OriginalMember(owner = "client!ld", name = "s", descriptor = "Lu;")
    private static class135 field1909 = class87.method676((byte) -42, "Too many incorrect logins from your address)3");

    @OriginalMember(owner = "client!ld", name = "u", descriptor = "Lu;")
    public static class135 field1911 = field1903;

    @OriginalMember(owner = "client!ld", name = "h", descriptor = "Lu;")
    private static class135 field1898 = class87.method676((byte) -73, "shake:");

    @OriginalMember(owner = "client!ld", name = "t", descriptor = "Lu;")
    public static class135 field1910 = field1909;

    @OriginalMember(owner = "client!ld", name = "v", descriptor = "I")
    public static int field1912 = 0;

    @OriginalMember(owner = "client!ld", name = "x", descriptor = "Lu;")
    public static class135 field1914 = field1898;

    @OriginalMember(owner = "client!ld", name = "z", descriptor = "Lu;")
    private static class135 field1916 = class87.method676((byte) -59, "Invalid username or password)3");

    @OriginalMember(owner = "client!ld", name = "n", descriptor = "I")
    public static int field1904 = 0;

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "Lu;")
    public static class135 field1894 = field1916;

    @OriginalMember(owner = "client!ld", name = "y", descriptor = "Lu;")
    public static class135 field1915 = field1898;

    @OriginalMember(owner = "client!ld", name = "j", descriptor = "I")
    public static int field1900 = -1;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "I")
    public static int field1891;

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "I")
    public static int field1892;

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "I")
    public static int field1895;

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "I")
    private int field1896;

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "I")
    private int field1897;

    @OriginalMember(owner = "client!ld", name = "i", descriptor = "I")
    public static int field1899;

    @OriginalMember(owner = "client!ld", name = "l", descriptor = "I")
    public static int field1902;

    @OriginalMember(owner = "client!ld", name = "q", descriptor = "I")
    private int field1907;

    @OriginalMember(owner = "client!ld", name = "r", descriptor = "I")
    public static int field1908;

    @OriginalMember(owner = "client!ld", name = "w", descriptor = "I")
    public static int field1913;

    @OriginalMember(owner = "client!ld", name = "A", descriptor = "I")
    public static int field1917;

    @OriginalMember(owner = "client!ld", name = "B", descriptor = "I")
    public static int field1918;

    @OriginalMember(owner = "client!ld", name = "C", descriptor = "I")
    private int field1919;

    @OriginalMember(owner = "client!ld", name = "p", descriptor = "Lpe;")
    public static class109 field1906;

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "[Lae;")
    public static class6[] field1893;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V")
    public static void method628(int arg0) {
        field1909 = null;
        field1915 = null;
        field1911 = null;
        field1910 = null;
        field1914 = null;
        if (arg0 != -1640) {
            method632(-59, false, -29, 37, 85, null);
        }
        field1898 = null;
        field1894 = null;
        field1916 = null;
        field1906 = null;
        field1903 = null;
        field1893 = null;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(B)V")
    private final void method629(byte arg0) {
        if (arg0 <= 103) {
            this.field1896 = 102;
        }
        field1902++;
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
            int var68 = var64 + var65;
            int var69 = var4 + var67;
            var6 = var68 ^ var64 >>> 16;
            int var70 = var3 + var6;
            int var71 = var64 + var69;
            var5 = var71 ^ var69 << 10;
            int var72 = var69 + var70;
            int var73 = var2 + var5;
            var4 = var72 ^ var70 >>> 4;
            int var74 = var70 + var73;
            var3 = var74 ^ var73 << 8;
            int var75 = var4 + var61;
            int var76 = var73 + var75;
            var8 = var3 + var63;
            var2 = var76 ^ var75 >>> 9;
            var9 = var8 + var75;
            var7 = var2 + var67;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field1901[var11] + var9;
            int var38 = this.field1901[var11 + 3] + var6;
            int var39 = this.field1901[var11 + 5] + var4;
            int var40 = this.field1901[var11 + 4] + var5;
            int var41 = this.field1901[var11 + 1] + var8;
            int var42 = var37 ^ var41 << 11;
            int var43 = this.field1901[var11 + 2] + var7;
            int var44 = this.field1901[var11 + 7] + var2;
            int var45 = var41 + var43;
            int var46 = var38 + var42;
            int var47 = this.field1901[var11 + 6] + var3;
            int var48 = var45 ^ var43 >>> 2;
            int var49 = var43 + var46;
            int var50 = var40 + var48;
            int var51 = var49 ^ var46 << 8;
            int var52 = var39 + var51;
            int var53 = var46 + var50;
            var6 = var53 ^ var50 >>> 16;
            int var54 = var50 + var52;
            var5 = var54 ^ var52 << 10;
            int var55 = var5 + var44;
            int var56 = var6 + var47;
            int var57 = var52 + var56;
            var4 = var57 ^ var56 >>> 4;
            int var58 = var4 + var42;
            int var59 = var55 + var56;
            var3 = var59 ^ var55 << 8;
            int var60 = var55 + var58;
            var8 = var3 + var48;
            var2 = var60 ^ var58 >>> 9;
            var7 = var2 + var51;
            var9 = var8 + var58;
            this.field1905[var11] = var9;
            this.field1905[var11 + 1] = var8;
            this.field1905[var11 + 2] = var7;
            this.field1905[var11 + 3] = var6;
            this.field1905[var11 + 4] = var5;
            this.field1905[var11 + 5] = var4;
            this.field1905[var11 + 6] = var3;
            this.field1905[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field1905[var12] + var9;
            int var14 = this.field1905[var12 + 2] + var7;
            int var15 = this.field1905[var12 + 6] + var3;
            int var16 = this.field1905[var12 + 3] + var6;
            int var17 = this.field1905[var12 + 5] + var4;
            int var18 = this.field1905[var12 + 1] + var8;
            int var19 = this.field1905[var12 + 7] + var2;
            int var20 = this.field1905[var12 + 4] + var5;
            int var21 = var13 ^ var18 << 11;
            int var22 = var14 + var18;
            int var23 = var16 + var21;
            int var24 = var22 ^ var14 >>> 2;
            int var25 = var14 + var23;
            int var26 = var25 ^ var23 << 8;
            int var27 = var20 + var24;
            int var28 = var17 + var26;
            int var29 = var23 + var27;
            var6 = var29 ^ var27 >>> 16;
            int var30 = var6 + var15;
            int var31 = var27 + var28;
            var5 = var31 ^ var28 << 10;
            int var32 = var5 + var19;
            int var33 = var28 + var30;
            var4 = var33 ^ var30 >>> 4;
            int var34 = var4 + var21;
            int var35 = var30 + var32;
            var3 = var35 ^ var32 << 8;
            int var36 = var32 + var34;
            var8 = var3 + var24;
            var2 = var36 ^ var34 >>> 9;
            var7 = var2 + var26;
            var9 = var8 + var34;
            this.field1905[var12] = var9;
            this.field1905[var12 + 1] = var8;
            this.field1905[var12 + 2] = var7;
            this.field1905[var12 + 3] = var6;
            this.field1905[var12 + 4] = var5;
            this.field1905[var12 + 5] = var4;
            this.field1905[var12 + 6] = var3;
            this.field1905[var12 + 7] = var2;
        }
        this.method631(5);
        this.field1907 = 256;
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(I)I")
    public final int method630(int arg0) {
        if (this.field1907-- == 0) {
            this.method631(5);
            this.field1907 = 255;
        }
        if (arg0 >= -97) {
            field1910 = null;
        }
        field1899++;
        return this.field1901[this.field1907];
    }

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "(I)V")
    private final void method631(int arg0) {
        this.field1896 += ++this.field1897;
        if (arg0 != 5) {
            return;
        }
        field1891++;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field1905[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field1919 ^= this.field1919 << 13;
                } else {
                    this.field1919 ^= this.field1919 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field1919 ^= this.field1919 << 2;
            } else {
                this.field1919 ^= this.field1919 >>> 16;
            }
            this.field1919 += this.field1905[var2 + 128 & 0xFF];
            int var4;
            this.field1905[var2] = var4 = this.field1919 + this.field1896 + this.field1905[class4.method19(255, var3 >> 2)];
            this.field1901[var2] = this.field1896 = var3 + this.field1905[class4.method19(1020, var4 >> 8) >> 2];
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IZIIILrb;)V")
    public static final void method632(int arg0, boolean arg1, int arg2, int arg3, int arg4, class119 arg5) {
        field1913++;
        class58 var6 = new class58();
        var6.field1415 = arg5.field2883;
        var6.field1411 = arg5.field2826;
        var6.field1445 = arg0 * 128;
        var6.field1420 = arg4;
        var6.field1412 = arg5.field2858;
        int var7 = arg5.field2890;
        var6.field1432 = arg2 * 128;
        var6.field1426 = arg5.field2880;
        var6.field1423 = arg5.field2870 * 128;
        int var8 = arg5.field2860;
        if (arg3 == 1 || arg3 == 3) {
            var8 = arg5.field2890;
            var7 = arg5.field2860;
        }
        var6.field1441 = (arg0 + var8) * 128;
        var6.field1443 = (arg2 + var7) * 128;
        if (arg5.field2825 != null) {
            var6.field1439 = arg5;
            var6.method440(-5);
        }
        if (!arg1) {
            class41.field955.method185(var6, -27557);
            if (var6.field1411 != null) {
                var6.field1433 = (int) ((double) (var6.field1415 - var6.field1412) * Math.random()) + var6.field1412;
            }
        }
    }

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "([I)V")
    public class80(int[] arg0) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field1901[var2] = arg0[var2];
        }
        this.method629((byte) 125);
    }
}
