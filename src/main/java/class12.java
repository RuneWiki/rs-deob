import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class12 {

    @OriginalMember(owner = "client!be", name = "l", descriptor = "[I")
    private int[] field238 = new int[256];

    @OriginalMember(owner = "client!be", name = "a", descriptor = "[I")
    private int[] field227 = new int[256];

    @OriginalMember(owner = "client!be", name = "b", descriptor = "Lo;")
    public static class84 field228 = class15.method124("Loading game screen )2 ", 255);

    @OriginalMember(owner = "client!be", name = "f", descriptor = "Lo;")
    public static class84 field232 = class15.method124("b12_full", 255);

    @OriginalMember(owner = "client!be", name = "p", descriptor = "I")
    public static int field242 = 0;

    @OriginalMember(owner = "client!be", name = "o", descriptor = "Lo;")
    public static class84 field241 = class15.method124("Jul", 255);

    @OriginalMember(owner = "client!be", name = "r", descriptor = "Lo;")
    public static class84 field244 = class15.method124("To create a new account you need to", 255);

    @OriginalMember(owner = "client!be", name = "c", descriptor = "I")
    private int field229;

    @OriginalMember(owner = "client!be", name = "d", descriptor = "I")
    public static int field230;

    @OriginalMember(owner = "client!be", name = "e", descriptor = "I")
    private int field231;

    @OriginalMember(owner = "client!be", name = "g", descriptor = "I")
    public static int field233;

    @OriginalMember(owner = "client!be", name = "h", descriptor = "I")
    public static int field234;

    @OriginalMember(owner = "client!be", name = "i", descriptor = "I")
    private int field235;

    @OriginalMember(owner = "client!be", name = "j", descriptor = "I")
    public static int field236;

    @OriginalMember(owner = "client!be", name = "k", descriptor = "I")
    private int field237;

    @OriginalMember(owner = "client!be", name = "n", descriptor = "I")
    public static int field240;

    @OriginalMember(owner = "client!be", name = "m", descriptor = "Lt;")
    public static class109 field239;

    @OriginalMember(owner = "client!be", name = "q", descriptor = "Lvb;")
    public static class121 field243;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IZ)V", line = 10)
    public static final void method106(int arg0, boolean arg1) {
        field240++;
        class111.field2417 += arg0;
        if (!arg1) {
            method110((byte) -124);
        }
        while (class14.field251 <= class111.field2417) {
            class111.field2417 -= class14.field251;
            class6.field105 -= class6.field105 >> 2;
        }
        class6.field105 -= arg0 * 1000;
        if (class6.field105 < 0) {
            class6.field105 = 0;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(I)I", line = 42)
    public final int method107(int arg0) {
        field234++;
        if (this.field229-- == 0) {
            this.method108((byte) 116);
            this.field229 = 255;
        }
        if (arg0 != 255) {
            this.method109(-121);
        }
        return this.field227[this.field229];
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(B)V", line = 72)
    private final void method108(byte arg0) {
        this.field235 += ++this.field231;
        field236++;
        if (arg0 <= 89) {
            method111(false);
        }
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field238[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field237 ^= this.field237 << 13;
                } else {
                    this.field237 ^= this.field237 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field237 ^= this.field237 << 2;
            } else {
                this.field237 ^= this.field237 >>> 16;
            }
            this.field237 += this.field238[var2 + 128 & 0xFF];
            int var4;
            this.field238[var2] = var4 = this.field237 + this.field238[class61.method486(255, var3 >> 2)] + this.field235;
            this.field227[var2] = this.field235 = this.field238[class61.method486(255, var4 >> 8 >> 2)] + var3;
        }
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(I)V", line = 117)
    private final void method109(int arg0) {
        field230++;
        if (arg0 <= 1) {
            this.field235 = -84;
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
            int var65 = var7 + var62;
            int var66 = var65 ^ var62 << 8;
            int var67 = var5 + var64;
            int var68 = var4 + var66;
            int var69 = var62 + var67;
            var6 = var69 ^ var67 >>> 16;
            int var70 = var3 + var6;
            int var71 = var67 + var68;
            var5 = var71 ^ var68 << 10;
            int var72 = var68 + var70;
            int var73 = var2 + var5;
            var4 = var72 ^ var70 >>> 4;
            int var74 = var70 + var73;
            int var75 = var4 + var61;
            var3 = var74 ^ var73 << 8;
            int var76 = var73 + var75;
            var8 = var3 + var64;
            var2 = var76 ^ var75 >>> 9;
            var9 = var8 + var75;
            var7 = var2 + var66;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field227[var11 + 5] + var4;
            int var38 = this.field227[var11 + 7] + var2;
            int var39 = this.field227[var11 + 3] + var6;
            int var40 = this.field227[var11 + 2] + var7;
            int var41 = this.field227[var11 + 6] + var3;
            int var42 = this.field227[var11 + 1] + var8;
            int var43 = this.field227[var11] + var9;
            int var44 = var43 ^ var42 << 11;
            int var45 = var39 + var44;
            int var46 = var40 + var42;
            int var47 = this.field227[var11 + 4] + var5;
            int var48 = var46 ^ var40 >>> 2;
            int var49 = var40 + var45;
            int var50 = var47 + var48;
            int var51 = var49 ^ var45 << 8;
            int var52 = var37 + var51;
            int var53 = var45 + var50;
            var6 = var53 ^ var50 >>> 16;
            int var54 = var50 + var52;
            int var55 = var6 + var41;
            var5 = var54 ^ var52 << 10;
            int var56 = var52 + var55;
            var4 = var56 ^ var55 >>> 4;
            int var57 = var5 + var38;
            int var58 = var4 + var44;
            int var59 = var55 + var57;
            var3 = var59 ^ var57 << 8;
            int var60 = var57 + var58;
            var2 = var60 ^ var58 >>> 9;
            var8 = var3 + var48;
            var7 = var2 + var51;
            var9 = var8 + var58;
            this.field238[var11] = var9;
            this.field238[var11 + 1] = var8;
            this.field238[var11 + 2] = var7;
            this.field238[var11 + 3] = var6;
            this.field238[var11 + 4] = var5;
            this.field238[var11 + 5] = var4;
            this.field238[var11 + 6] = var3;
            this.field238[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field238[var12 + 1] + var8;
            int var14 = this.field238[var12 + 3] + var6;
            int var15 = this.field238[var12 + 5] + var4;
            int var16 = this.field238[var12 + 6] + var3;
            int var17 = this.field238[var12] + var9;
            int var18 = this.field238[var12 + 2] + var7;
            int var19 = this.field238[var12 + 7] + var2;
            int var20 = this.field238[var12 + 4] + var5;
            int var21 = var17 ^ var13 << 11;
            int var22 = var13 + var18;
            int var23 = var14 + var21;
            int var24 = var22 ^ var18 >>> 2;
            int var25 = var18 + var23;
            int var26 = var20 + var24;
            int var27 = var25 ^ var23 << 8;
            int var28 = var15 + var27;
            int var29 = var23 + var26;
            var6 = var29 ^ var26 >>> 16;
            int var30 = var6 + var16;
            int var31 = var26 + var28;
            var5 = var31 ^ var28 << 10;
            int var32 = var5 + var19;
            int var33 = var28 + var30;
            var4 = var33 ^ var30 >>> 4;
            int var34 = var4 + var21;
            int var35 = var30 + var32;
            var3 = var35 ^ var32 << 8;
            int var36 = var32 + var34;
            var2 = var36 ^ var34 >>> 9;
            var8 = var3 + var24;
            var7 = var2 + var27;
            var9 = var8 + var34;
            this.field238[var12] = var9;
            this.field238[var12 + 1] = var8;
            this.field238[var12 + 2] = var7;
            this.field238[var12 + 3] = var6;
            this.field238[var12 + 4] = var5;
            this.field238[var12 + 5] = var4;
            this.field238[var12 + 6] = var3;
            this.field238[var12 + 7] = var2;
        }
        this.method108((byte) 100);
        this.field229 = 256;
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(B)V", line = 275)
    public static void method110(byte arg0) {
        field239 = null;
        field232 = null;
        if (arg0 < -117) {
            field241 = null;
            field228 = null;
            field243 = null;
            field244 = null;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Z)V", line = 293)
    public static final void method111(boolean arg0) {
        field233++;
        if (!arg0 || class127.field2813 == null) {
            return;
        }
        class75.method558((byte) 35);
        if (class21.field387 > 0) {
            class127.field2813.method439(1);
            class21.field387 = 0;
        }
        class127.field2813.method437(128);
        class127.field2813 = null;
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "([I)V", line = 316)
    public class12(int[] arg0) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field227[var2] = arg0[var2];
        }
        this.method109(25);
    }
}
