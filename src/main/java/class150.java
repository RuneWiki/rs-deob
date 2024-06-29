import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class150 {

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "[I")
    private int[] field2834;

    @OriginalMember(owner = "client!ni", name = "m", descriptor = "[I")
    private int[] field2844;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "I")
    public static int field2832 = -1;

    @OriginalMember(owner = "client!ni", name = "f", descriptor = "I")
    public static int field2837 = 0;

    @OriginalMember(owner = "client!ni", name = "n", descriptor = "Ldc;")
    public static class37 field2845 = class185.method1233((byte) 86, "Fallen lassen");

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "Ldc;")
    public static class37 field2833 = class185.method1233((byte) 86, "Keine Antwort vom Anmelde)2Server)3");

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "Ldc;")
    private static class37 field2835 = class185.method1233((byte) 86, "Please check your message)2centre for details)3");

    @OriginalMember(owner = "client!ni", name = "j", descriptor = "Ldc;")
    public static class37 field2841 = field2835;

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "I")
    private int field2836;

    @OriginalMember(owner = "client!ni", name = "g", descriptor = "I")
    public static int field2838;

    @OriginalMember(owner = "client!ni", name = "h", descriptor = "I")
    public static int field2839;

    @OriginalMember(owner = "client!ni", name = "i", descriptor = "I")
    public static int field2840;

    @OriginalMember(owner = "client!ni", name = "k", descriptor = "I")
    private int field2842;

    @OriginalMember(owner = "client!ni", name = "l", descriptor = "I")
    public static int field2843;

    @OriginalMember(owner = "client!ni", name = "o", descriptor = "I")
    private int field2846;

    @OriginalMember(owner = "client!ni", name = "p", descriptor = "I")
    public static int field2847;

    @OriginalMember(owner = "client!ni", name = "q", descriptor = "I")
    public static int field2848;

    @OriginalMember(owner = "client!ni", name = "r", descriptor = "I")
    public static int field2849;

    @OriginalMember(owner = "client!ni", name = "s", descriptor = "I")
    public static int field2850;

    @OriginalMember(owner = "client!ni", name = "t", descriptor = "I")
    private int field2851;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)V")
    public static final void method1028(int arg0) {
        field2839++;
        if (arg0 != -1) {
            field2835 = null;
        }
        for (class166 var1 = (class166) class20.field337.method1338(-9); var1 != null; var1 = (class166) class20.field337.method1332((byte) -89)) {
            if (var1.field3182 == -1) {
                var1.field3174 = 0;
                class113.method793(-21619, var1);
            } else {
                var1.method433(0);
            }
        }
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(I)V")
    public static void method1029(int arg0) {
        field2833 = null;
        field2841 = null;
        field2835 = null;
        field2845 = null;
        if (arg0 != -31834) {
            method1029(-72);
        }
    }

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "(I)I")
    public final int method1030(int arg0) {
        if (this.field2846-- == 0) {
            this.method1031(false);
            this.field2846 = 255;
        }
        if (arg0 != 256) {
            this.method1032((byte) 70);
        }
        field2847++;
        return this.field2834[this.field2846];
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Z)V")
    private final void method1031(boolean arg0) {
        field2843++;
        this.field2836 += ++this.field2851;
        if (arg0) {
            return;
        }
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field2844[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field2842 ^= this.field2842 << 13;
                } else {
                    this.field2842 ^= this.field2842 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field2842 ^= this.field2842 << 2;
            } else {
                this.field2842 ^= this.field2842 >>> 16;
            }
            this.field2842 += this.field2844[var2 + 128 & 0xFF];
            int var4;
            this.field2844[var2] = var4 = this.field2844[class58.method449(1020, var3) >> 2] + this.field2842 + this.field2836;
            this.field2834[var2] = this.field2836 = this.field2844[class58.method449(1020, var4 >> 8) >> 2] + var3;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(B)V")
    private final void method1032(byte arg0) {
        field2838++;
        if (arg0 != -3) {
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
            int var62 = var6 + var61;
            int var63 = var7 + var8;
            int var64 = var63 ^ var7 >>> 2;
            int var65 = var5 + var64;
            int var66 = var7 + var62;
            int var67 = var66 ^ var62 << 8;
            int var68 = var62 + var65;
            var6 = var68 ^ var65 >>> 16;
            int var69 = var3 + var6;
            int var70 = var4 + var67;
            int var71 = var65 + var70;
            var5 = var71 ^ var70 << 10;
            int var72 = var69 + var70;
            var4 = var72 ^ var69 >>> 4;
            int var73 = var4 + var61;
            int var74 = var2 + var5;
            int var75 = var69 + var74;
            var3 = var75 ^ var74 << 8;
            int var76 = var73 + var74;
            var8 = var3 + var64;
            var2 = var76 ^ var73 >>> 9;
            var9 = var8 + var73;
            var7 = var2 + var67;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field2834[var11 + 4] + var5;
            int var38 = this.field2834[var11 + 6] + var3;
            int var39 = this.field2834[var11] + var9;
            int var40 = this.field2834[var11 + 1] + var8;
            int var41 = this.field2834[var11 + 2] + var7;
            int var42 = this.field2834[var11 + 3] + var6;
            int var43 = var39 ^ var40 << 11;
            int var44 = this.field2834[var11 + 5] + var4;
            int var45 = this.field2834[var11 + 7] + var2;
            int var46 = var40 + var41;
            int var47 = var42 + var43;
            int var48 = var46 ^ var41 >>> 2;
            int var49 = var41 + var47;
            int var50 = var49 ^ var47 << 8;
            int var51 = var44 + var50;
            int var52 = var37 + var48;
            int var53 = var47 + var52;
            var6 = var53 ^ var52 >>> 16;
            int var54 = var6 + var38;
            int var55 = var51 + var52;
            var5 = var55 ^ var51 << 10;
            int var56 = var51 + var54;
            int var57 = var5 + var45;
            var4 = var56 ^ var54 >>> 4;
            int var58 = var54 + var57;
            var3 = var58 ^ var57 << 8;
            var8 = var3 + var48;
            int var59 = var4 + var43;
            int var60 = var57 + var59;
            var2 = var60 ^ var59 >>> 9;
            var7 = var2 + var50;
            var9 = var8 + var59;
            this.field2844[var11] = var9;
            this.field2844[var11 + 1] = var8;
            this.field2844[var11 + 2] = var7;
            this.field2844[var11 + 3] = var6;
            this.field2844[var11 + 4] = var5;
            this.field2844[var11 + 5] = var4;
            this.field2844[var11 + 6] = var3;
            this.field2844[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field2844[var12 + 4] + var5;
            int var14 = this.field2844[var12 + 3] + var6;
            int var15 = this.field2844[var12 + 7] + var2;
            int var16 = this.field2844[var12 + 6] + var3;
            int var17 = this.field2844[var12 + 2] + var7;
            int var18 = this.field2844[var12 + 1] + var8;
            int var19 = this.field2844[var12] + var9;
            int var20 = var19 ^ var18 << 11;
            int var21 = var17 + var18;
            int var22 = this.field2844[var12 + 5] + var4;
            int var23 = var21 ^ var17 >>> 2;
            int var24 = var13 + var23;
            int var25 = var14 + var20;
            int var26 = var17 + var25;
            int var27 = var26 ^ var25 << 8;
            int var28 = var24 + var25;
            var6 = var28 ^ var24 >>> 16;
            int var29 = var6 + var16;
            int var30 = var22 + var27;
            int var31 = var24 + var30;
            var5 = var31 ^ var30 << 10;
            int var32 = var29 + var30;
            int var33 = var5 + var15;
            var4 = var32 ^ var29 >>> 4;
            int var34 = var29 + var33;
            var3 = var34 ^ var33 << 8;
            int var35 = var4 + var20;
            var8 = var3 + var23;
            int var36 = var33 + var35;
            var2 = var36 ^ var35 >>> 9;
            var7 = var2 + var27;
            var9 = var8 + var35;
            this.field2844[var12] = var9;
            this.field2844[var12 + 1] = var8;
            this.field2844[var12 + 2] = var7;
            this.field2844[var12 + 3] = var6;
            this.field2844[var12 + 4] = var5;
            this.field2844[var12 + 5] = var4;
            this.field2844[var12 + 6] = var3;
            this.field2844[var12 + 7] = var2;
        }
        this.method1031(false);
        this.field2846 = 256;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIIIB)V")
    public static final void method1033(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field2850++;
        if (arg4 > -5) {
            method1028(9);
        }
        if (arg2 <= arg1) {
            for (int var5 = arg2; var5 < arg1; var5++) {
                class11.field156[var5][arg3] = arg0;
            }
        } else {
            for (int var6 = arg1; var6 < arg2; var6++) {
                class11.field156[var6][arg3] = arg0;
            }
        }
    }

    @OriginalMember(owner = "client!ni", name = "<init>", descriptor = "()V")
    private class150() {
    }

    @OriginalMember(owner = "client!ni", name = "<init>", descriptor = "([I)V")
    public class150(int[] arg0) {
        this.field2834 = new int[256];
        this.field2844 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field2834[var2] = arg0[var2];
        }
        this.method1032((byte) -3);
    }
}
