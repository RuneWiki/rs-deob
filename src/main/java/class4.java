import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class4 {

    @OriginalMember(owner = "client!vd", name = "o", descriptor = "[I")
    private int[] field83;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "[I")
    private int[] field69;

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "Loh;")
    public static class263 field75 = class253.method1681(-119, "::fpsoff");

    @OriginalMember(owner = "client!vd", name = "k", descriptor = "I")
    public static int field79 = 0;

    @OriginalMember(owner = "client!vd", name = "n", descriptor = "I")
    public static int field82 = 0;

    @OriginalMember(owner = "client!vd", name = "r", descriptor = "[B")
    public static byte[] field86 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "I")
    private int field70;

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "I")
    private int field71;

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "I")
    public static int field72;

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "I")
    private int field74;

    @OriginalMember(owner = "client!vd", name = "h", descriptor = "I")
    public static int field76;

    @OriginalMember(owner = "client!vd", name = "i", descriptor = "I")
    private int field77;

    @OriginalMember(owner = "client!vd", name = "j", descriptor = "I")
    public static int field78;

    @OriginalMember(owner = "client!vd", name = "l", descriptor = "I")
    public static int field80;

    @OriginalMember(owner = "client!vd", name = "m", descriptor = "I")
    public static int field81;

    @OriginalMember(owner = "client!vd", name = "p", descriptor = "I")
    public static int field84;

    @OriginalMember(owner = "client!vd", name = "q", descriptor = "I")
    public static int field85;

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "[I")
    public static int[] field73;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(B)V")
    private final void method20(byte arg0) {
        field80++;
        if (arg0 != -87) {
            return;
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
            int var64 = var6 + var61;
            int var65 = var7 + var64;
            int var66 = var65 ^ var64 << 8;
            int var67 = var5 + var63;
            int var68 = var64 + var67;
            int var69 = var4 + var66;
            var6 = var68 ^ var67 >>> 16;
            int var70 = var67 + var69;
            var5 = var70 ^ var69 << 10;
            int var71 = var2 + var5;
            int var72 = var3 + var6;
            int var73 = var69 + var72;
            var4 = var73 ^ var72 >>> 4;
            int var74 = var71 + var72;
            int var75 = var4 + var61;
            var3 = var74 ^ var71 << 8;
            int var76 = var71 + var75;
            var8 = var3 + var63;
            var2 = var76 ^ var75 >>> 9;
            var9 = var8 + var75;
            var7 = var2 + var66;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field83[var11 + 5] + var4;
            int var38 = this.field83[var11 + 7] + var2;
            int var39 = this.field83[var11 + 3] + var6;
            int var40 = this.field83[var11] + var9;
            int var41 = this.field83[var11 + 4] + var5;
            int var42 = this.field83[var11 + 1] + var8;
            int var43 = this.field83[var11 + 2] + var7;
            int var44 = this.field83[var11 + 6] + var3;
            int var45 = var40 ^ var42 << 11;
            int var46 = var42 + var43;
            int var47 = var46 ^ var43 >>> 2;
            int var48 = var39 + var45;
            int var49 = var43 + var48;
            int var50 = var49 ^ var48 << 8;
            int var51 = var41 + var47;
            int var52 = var48 + var51;
            int var53 = var37 + var50;
            var6 = var52 ^ var51 >>> 16;
            int var54 = var6 + var44;
            int var55 = var51 + var53;
            var5 = var55 ^ var53 << 10;
            int var56 = var53 + var54;
            int var57 = var5 + var38;
            var4 = var56 ^ var54 >>> 4;
            int var58 = var4 + var45;
            int var59 = var54 + var57;
            var3 = var59 ^ var57 << 8;
            int var60 = var57 + var58;
            var2 = var60 ^ var58 >>> 9;
            var7 = var2 + var50;
            var8 = var3 + var47;
            var9 = var8 + var58;
            this.field69[var11] = var9;
            this.field69[var11 + 1] = var8;
            this.field69[var11 + 2] = var7;
            this.field69[var11 + 3] = var6;
            this.field69[var11 + 4] = var5;
            this.field69[var11 + 5] = var4;
            this.field69[var11 + 6] = var3;
            this.field69[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field69[var12 + 3] + var6;
            int var14 = this.field69[var12 + 2] + var7;
            int var15 = this.field69[var12] + var9;
            int var16 = this.field69[var12 + 1] + var8;
            int var17 = var15 ^ var16 << 11;
            int var18 = var13 + var17;
            int var19 = this.field69[var12 + 6] + var3;
            int var20 = this.field69[var12 + 7] + var2;
            int var21 = this.field69[var12 + 4] + var5;
            int var22 = var14 + var16;
            int var23 = this.field69[var12 + 5] + var4;
            int var24 = var22 ^ var14 >>> 2;
            int var25 = var14 + var18;
            int var26 = var25 ^ var18 << 8;
            int var27 = var23 + var26;
            int var28 = var21 + var24;
            int var29 = var18 + var28;
            var6 = var29 ^ var28 >>> 16;
            int var30 = var27 + var28;
            var5 = var30 ^ var27 << 10;
            int var31 = var6 + var19;
            int var32 = var5 + var20;
            int var33 = var27 + var31;
            var4 = var33 ^ var31 >>> 4;
            int var34 = var31 + var32;
            int var35 = var4 + var17;
            var3 = var34 ^ var32 << 8;
            int var36 = var32 + var35;
            var8 = var3 + var24;
            var2 = var36 ^ var35 >>> 9;
            var9 = var8 + var35;
            var7 = var2 + var26;
            this.field69[var12] = var9;
            this.field69[var12 + 1] = var8;
            this.field69[var12 + 2] = var7;
            this.field69[var12 + 3] = var6;
            this.field69[var12 + 4] = var5;
            this.field69[var12 + 5] = var4;
            this.field69[var12 + 6] = var3;
            this.field69[var12 + 7] = var2;
        }
        this.method27(-123);
        this.field71 = 256;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)I")
    public final int method21(int arg0) {
        if (arg0 != -1640531527) {
            method22(17);
        }
        field78++;
        if ((this.field71--) == 0) {
            this.method27(-85);
            this.field71 = 255;
        }
        return this.field83[this.field71];
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(I)V")
    public static void method22(int arg0) {
        field86 = null;
        if (arg0 > 108) {
            field73 = null;
            field75 = null;
        }
    }

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "(I)Ldd;")
    public static final class130 method23(int arg0) {
        class241.field4233 = arg0;
        field72++;
        return class257.method1703(-3249);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IBI)I")
    public static final int method24(int arg0, byte arg1, int arg2) {
        field76++;
        if (arg0 == -1) {
            return 12345678;
        }
        int var3 = (arg0 & 0x7F) * arg2 >> 7;
        if (arg1 < 36) {
            method23(-24);
        }
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg0 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(ZLpc;)Z")
    public static final boolean method25(boolean arg0, class21 arg1) {
        if (!arg0) {
            field86 = null;
        }
        field84++;
        if (arg1.field516 == 205) {
            class118.field2194 = 250;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "()V")
    private class4() {
    }

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "(I)V")
    public static final void method26(int arg0) {
        if (arg0 != -3415) {
            return;
        }
        int var1 = 0;
        field81++;
        for (int var2 = 0; var2 < 104; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                if (class86.method601(var2, class18.field417, var3, true, (byte) 103, var1)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "(I)V")
    private final void method27(int arg0) {
        field85++;
        this.field77 += ++this.field74;
        int var2 = 26 % ((arg0 - 44) / 54);
        for (int var3 = 0; var3 < 256; var3++) {
            int var4 = this.field69[var3];
            if ((var3 & 0x2) == 0) {
                if ((var3 & 0x1) == 0) {
                    this.field70 ^= this.field70 << 13;
                } else {
                    this.field70 ^= this.field70 >>> 6;
                }
            } else if ((var3 & 0x1) == 0) {
                this.field70 ^= this.field70 << 2;
            } else {
                this.field70 ^= this.field70 >>> 16;
            }
            this.field70 += this.field69[var3 + 128 & 0xFF];
            int var5;
            this.field69[var3] = var5 = this.field69[class263.method1777(255, var4 >> 2)] + this.field70 + this.field77;
            this.field83[var3] = this.field77 = this.field69[class263.method1777(1020, var5 >> 8) >> 2] + var4;
        }
    }

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "([I)V")
    public class4(int[] arg0) {
        this.field83 = new int[256];
        this.field69 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field83[var2] = arg0[var2];
        }
        this.method20((byte) -87);
    }
}
