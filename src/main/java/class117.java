import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class117 {

    @OriginalMember(owner = "client!td", name = "b", descriptor = "[I")
    private int[] field2880 = new int[256];

    @OriginalMember(owner = "client!td", name = "d", descriptor = "[I")
    private int[] field2882 = new int[256];

    @OriginalMember(owner = "client!td", name = "f", descriptor = "Lwb;")
    public static class130 field2884 = class26.method212("Lade Schrifts-=tze )2 ", -32376);

    @OriginalMember(owner = "client!td", name = "o", descriptor = "I")
    public static int field2893 = 0;

    @OriginalMember(owner = "client!td", name = "h", descriptor = "Lwb;")
    public static class130 field2886 = class26.method212("Geben Sie Ihren Benutzernamen", -32376);

    @OriginalMember(owner = "client!td", name = "r", descriptor = "I")
    public static int field2896 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!td", name = "k", descriptor = "Lwb;")
    public static class130 field2889 = class26.method212("Anmelde)2Zeitlimit -Uberschritten)3", -32376);

    @OriginalMember(owner = "client!td", name = "s", descriptor = "Lwb;")
    public static class130 field2897 = class26.method212("Bitte wenden Sie sich an den Kundendienst)3", -32376);

    @OriginalMember(owner = "client!td", name = "u", descriptor = "Lwb;")
    private static class130 field2899 = class26.method212("Too many connections from your address)3", -32376);

    @OriginalMember(owner = "client!td", name = "z", descriptor = "I")
    public static int field2904 = 0;

    @OriginalMember(owner = "client!td", name = "g", descriptor = "Lwb;")
    public static class130 field2885 = field2899;

    @OriginalMember(owner = "client!td", name = "v", descriptor = "Lwb;")
    public static class130 field2900 = class26.method212("cross", -32376);

    @OriginalMember(owner = "client!td", name = "c", descriptor = "I")
    private int field2881;

    @OriginalMember(owner = "client!td", name = "e", descriptor = "I")
    public static int field2883;

    @OriginalMember(owner = "client!td", name = "i", descriptor = "I")
    private int field2887;

    @OriginalMember(owner = "client!td", name = "j", descriptor = "I")
    private int field2888;

    @OriginalMember(owner = "client!td", name = "m", descriptor = "I")
    public static int field2891;

    @OriginalMember(owner = "client!td", name = "t", descriptor = "I")
    public static int field2898;

    @OriginalMember(owner = "client!td", name = "w", descriptor = "I")
    public static int field2901;

    @OriginalMember(owner = "client!td", name = "x", descriptor = "I")
    private int field2902;

    @OriginalMember(owner = "client!td", name = "y", descriptor = "I")
    public static int field2903;

    @OriginalMember(owner = "client!td", name = "p", descriptor = "Lqd;")
    public static class100 field2894;

    @OriginalMember(owner = "client!td", name = "n", descriptor = "Lbb;")
    public static class9 field2892;

    @OriginalMember(owner = "client!td", name = "l", descriptor = "[I")
    public static int[] field2890;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "[[[B")
    public static byte[][][] field2879;

    @OriginalMember(owner = "client!td", name = "q", descriptor = "[[[I")
    public static int[][][] field2895;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(B)I", line = 10)
    public final int method901(byte arg0) {
        if (this.field2881-- == 0) {
            this.method904((byte) 122);
            this.field2881 = 255;
        }
        int var2 = -6 / ((60 - arg0) / 39);
        field2903++;
        return this.field2880[this.field2881];
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(III)I", line = 29)
    public static final int method902(int arg0, int arg1, int arg2) {
        field2883++;
        int var3 = arg1 * 57 + arg0;
        if (arg2 != -1826975373) {
            method906((byte) 15);
        }
        int var4 = var3 ^ var3 << 13;
        int var5 = (var4 * var4 * 15731 + 789221) * var4 + 1376312589 & Integer.MAX_VALUE;
        return var5 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(I)V", line = 45)
    private final void method903(int arg0) {
        field2901++;
        int var2 = -1640531527;
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;
        int var9 = -1640531527;
        for (int var10 = 0; var10 < 4; var10++) {
            int var62 = var9 ^ var8 << 11;
            int var63 = var7 + var8;
            int var64 = var6 + var62;
            int var65 = var63 ^ var7 >>> 2;
            int var66 = var5 + var65;
            int var67 = var7 + var64;
            int var68 = var67 ^ var64 << 8;
            int var69 = var64 + var66;
            var6 = var69 ^ var66 >>> 16;
            int var70 = var4 + var68;
            int var71 = var3 + var6;
            int var72 = var66 + var70;
            var5 = var72 ^ var70 << 10;
            int var73 = var70 + var71;
            var4 = var73 ^ var71 >>> 4;
            int var74 = var4 + var62;
            int var75 = var2 + var5;
            int var76 = var71 + var75;
            var3 = var76 ^ var75 << 8;
            int var77 = var74 + var75;
            var8 = var3 + var65;
            var2 = var77 ^ var74 >>> 9;
            var7 = var2 + var68;
            var9 = var8 + var74;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var38 = this.field2880[var11 + 1] + var8;
            int var39 = this.field2880[var11 + 6] + var3;
            int var40 = this.field2880[var11 + 3] + var6;
            int var41 = this.field2880[var11 + 7] + var2;
            int var42 = this.field2880[var11 + 4] + var5;
            int var43 = this.field2880[var11] + var9;
            int var44 = var43 ^ var38 << 11;
            int var45 = this.field2880[var11 + 2] + var7;
            int var46 = this.field2880[var11 + 5] + var4;
            int var47 = var40 + var44;
            int var48 = var38 + var45;
            int var49 = var48 ^ var45 >>> 2;
            int var50 = var45 + var47;
            int var51 = var42 + var49;
            int var52 = var50 ^ var47 << 8;
            int var53 = var47 + var51;
            int var54 = var46 + var52;
            var6 = var53 ^ var51 >>> 16;
            int var55 = var6 + var39;
            int var56 = var51 + var54;
            var5 = var56 ^ var54 << 10;
            int var57 = var54 + var55;
            int var58 = var5 + var41;
            var4 = var57 ^ var55 >>> 4;
            int var59 = var4 + var44;
            int var60 = var55 + var58;
            var3 = var60 ^ var58 << 8;
            var8 = var3 + var49;
            int var61 = var58 + var59;
            var2 = var61 ^ var59 >>> 9;
            var9 = var8 + var59;
            this.field2882[var11] = var9;
            this.field2882[var11 + 1] = var8;
            var7 = var2 + var52;
            this.field2882[var11 + 2] = var7;
            this.field2882[var11 + 3] = var6;
            this.field2882[var11 + 4] = var5;
            this.field2882[var11 + 5] = var4;
            this.field2882[var11 + 6] = var3;
            this.field2882[var11 + 7] = var2;
        }
        int var12 = 34 / ((-arg0 - 34) / 34);
        for (int var13 = 0; var13 < 256; var13 += 8) {
            int var14 = this.field2882[var13 + 6] + var3;
            int var15 = this.field2882[var13] + var9;
            int var16 = this.field2882[var13 + 2] + var7;
            int var17 = this.field2882[var13 + 3] + var6;
            int var18 = this.field2882[var13 + 5] + var4;
            int var19 = this.field2882[var13 + 1] + var8;
            int var20 = var15 ^ var19 << 11;
            int var21 = this.field2882[var13 + 7] + var2;
            int var22 = this.field2882[var13 + 4] + var5;
            int var23 = var16 + var19;
            int var24 = var17 + var20;
            int var25 = var23 ^ var16 >>> 2;
            int var26 = var22 + var25;
            int var27 = var16 + var24;
            int var28 = var27 ^ var24 << 8;
            int var29 = var18 + var28;
            int var30 = var24 + var26;
            var6 = var30 ^ var26 >>> 16;
            int var31 = var6 + var14;
            int var32 = var26 + var29;
            var5 = var32 ^ var29 << 10;
            int var33 = var5 + var21;
            int var34 = var29 + var31;
            var4 = var34 ^ var31 >>> 4;
            int var35 = var4 + var20;
            int var36 = var31 + var33;
            var3 = var36 ^ var33 << 8;
            var8 = var3 + var25;
            int var37 = var33 + var35;
            var2 = var37 ^ var35 >>> 9;
            var9 = var8 + var35;
            this.field2882[var13] = var9;
            this.field2882[var13 + 1] = var8;
            var7 = var2 + var28;
            this.field2882[var13 + 2] = var7;
            this.field2882[var13 + 3] = var6;
            this.field2882[var13 + 4] = var5;
            this.field2882[var13 + 5] = var4;
            this.field2882[var13 + 6] = var3;
            this.field2882[var13 + 7] = var2;
        }
        this.method904((byte) 123);
        this.field2881 = 256;
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(B)V", line = 205)
    private final void method904(byte arg0) {
        this.field2887 += ++this.field2888;
        field2898++;
        if (arg0 <= 86) {
            this.method903(-101);
        }
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field2882[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field2902 ^= this.field2902 << 13;
                } else {
                    this.field2902 ^= this.field2902 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field2902 ^= this.field2902 << 2;
            } else {
                this.field2902 ^= this.field2902 >>> 16;
            }
            this.field2902 += this.field2882[var2 + 128 & 0xFF];
            int var4;
            this.field2882[var2] = var4 = this.field2887 + this.field2882[class32.method257(255, var3 >> 2)] + this.field2902;
            this.field2880[var2] = this.field2887 = var3 + this.field2882[class32.method257(261204, var4) >> 8 >> 2];
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(BI)Lba;", line = 269)
    public static final class8 method905(byte arg0, int arg1) {
        field2891++;
        class8 var2 = (class8) class120.field2930.method402((long) arg1, -124);
        if (var2 != null) {
            return var2;
        }
        if (arg0 != -21) {
            method902(-58, -39, 70);
        }
        byte[] var3 = class112.field2755.method508(arg1, 0, 3);
        class8 var4 = new class8();
        if (var3 != null) {
            var4.method59(new class36(var3), (byte) 59);
        }
        class120.field2930.method403((long) arg1, var4, (byte) -101);
        return var4;
    }

    @OriginalMember(owner = "client!td", name = "c", descriptor = "(B)V", line = 300)
    public static void method906(byte arg0) {
        field2892 = null;
        field2879 = null;
        field2885 = null;
        field2894 = null;
        field2889 = null;
        int var1 = 114 / ((arg0 - 18) / 55);
        field2884 = null;
        field2886 = null;
        field2900 = null;
        field2899 = null;
        field2895 = null;
        field2890 = null;
        field2897 = null;
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "([I)V", line = 322)
    public class117(int[] arg0) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field2880[var2] = arg0[var2];
        }
        this.method903(122);
    }
}
