import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class3 {

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "[I")
    private int[] field57 = new int[256];

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "[I")
    private int[] field54 = new int[256];

    @OriginalMember(owner = "client!ab", name = "m", descriptor = "Z")
    public static boolean field64 = false;

    @OriginalMember(owner = "client!ab", name = "i", descriptor = "Lpe;")
    public static class109 field60 = class141.method1120(" steht bereits auf Ihrer Ignorieren)2Liste(Q", 0);

    @OriginalMember(owner = "client!ab", name = "r", descriptor = "Lpe;")
    private static class109 field69 = class141.method1120("Select a world", 0);

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "Lpe;")
    public static class109 field56 = field69;

    @OriginalMember(owner = "client!ab", name = "h", descriptor = "Lbc;")
    public static class11 field59 = new class11(128);

    @OriginalMember(owner = "client!ab", name = "v", descriptor = "[I")
    public static int[] field73 = new int[1000];

    @OriginalMember(owner = "client!ab", name = "u", descriptor = "Lpe;")
    public static class109 field72 = class141.method1120("oberen Rand der Webseite ausw-=hlen)3", 0);

    @OriginalMember(owner = "client!ab", name = "y", descriptor = "Lpe;")
    public static class109 field76 = class141.method1120("titlebox", 0);

    @OriginalMember(owner = "client!ab", name = "w", descriptor = "Lpe;")
    public static class109 field74 = class141.method1120("scape main", 0);

    @OriginalMember(owner = "client!ab", name = "t", descriptor = "Lbc;")
    public static class11 field71 = new class11(64);

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "B")
    public static byte field52;

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "I")
    public static int field53;

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "I")
    private int field55;

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "I")
    public static int field58;

    @OriginalMember(owner = "client!ab", name = "k", descriptor = "I")
    public static int field62;

    @OriginalMember(owner = "client!ab", name = "l", descriptor = "I")
    private int field63;

    @OriginalMember(owner = "client!ab", name = "o", descriptor = "I")
    public static int field66;

    @OriginalMember(owner = "client!ab", name = "p", descriptor = "I")
    private int field67;

    @OriginalMember(owner = "client!ab", name = "q", descriptor = "I")
    private int field68;

    @OriginalMember(owner = "client!ab", name = "s", descriptor = "I")
    public static int field70;

    @OriginalMember(owner = "client!ab", name = "x", descriptor = "I")
    public static int field75;

    @OriginalMember(owner = "client!ab", name = "j", descriptor = "Lt;")
    public static class132 field61;

    @OriginalMember(owner = "client!ab", name = "n", descriptor = "Lbe;")
    public static class13 field65;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V")
    public static void method20(int arg0) {
        field61 = null;
        field76 = null;
        field74 = null;
        field59 = null;
        field71 = null;
        field60 = null;
        if (arg0 != 64) {
            method20(32);
        }
        field69 = null;
        field56 = null;
        field73 = null;
        field65 = null;
        field72 = null;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(BZZ)I")
    public static final int method21(byte arg0, boolean arg1, boolean arg2) {
        field53++;
        if (arg0 < 2) {
            field71 = null;
        }
        int var3 = 0;
        if (arg1) {
            var3 += class8.field205 + class61.field1248;
        }
        if (arg2) {
            var3 += class43.field908 + class23.field541;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)V")
    private final void method22(byte arg0) {
        if (arg0 != 37) {
            field71 = null;
        }
        field66++;
        this.field67 += ++this.field55;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field54[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field68 ^= this.field68 << 13;
                } else {
                    this.field68 ^= this.field68 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field68 ^= this.field68 << 2;
            } else {
                this.field68 ^= this.field68 >>> 16;
            }
            this.field68 += this.field54[var2 + 128 & 0xFF];
            int var4;
            this.field54[var2] = var4 = this.field67 + this.field54[class4.method34(var3 >> 2, 255)] + this.field68;
            this.field57[var2] = this.field67 = this.field54[class4.method34(var4, 261212) >> 8 >> 2] + var3;
        }
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(I)V")
    private final void method23(int arg0) {
        field58++;
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
            int var70 = var3 + var6;
            int var71 = var65 + var68;
            var5 = var71 ^ var68 << 10;
            int var72 = var68 + var70;
            var4 = var72 ^ var70 >>> 4;
            int var73 = var2 + var5;
            int var74 = var4 + var61;
            int var75 = var70 + var73;
            var3 = var75 ^ var73 << 8;
            var8 = var3 + var64;
            int var76 = var73 + var74;
            var2 = var76 ^ var74 >>> 9;
            var7 = var2 + var67;
            var9 = var8 + var74;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field57[var11 + 5] + var4;
            int var38 = this.field57[var11 + 7] + var2;
            int var39 = this.field57[var11 + 3] + var6;
            int var40 = this.field57[var11] + var9;
            int var41 = this.field57[var11 + 6] + var3;
            int var42 = this.field57[var11 + 2] + var7;
            int var43 = this.field57[var11 + 1] + var8;
            int var44 = this.field57[var11 + 4] + var5;
            int var45 = var40 ^ var43 << 11;
            int var46 = var42 + var43;
            int var47 = var39 + var45;
            int var48 = var46 ^ var42 >>> 2;
            int var49 = var42 + var47;
            int var50 = var44 + var48;
            int var51 = var49 ^ var47 << 8;
            int var52 = var37 + var51;
            int var53 = var47 + var50;
            var6 = var53 ^ var50 >>> 16;
            int var54 = var50 + var52;
            int var55 = var6 + var41;
            var5 = var54 ^ var52 << 10;
            int var56 = var5 + var38;
            int var57 = var52 + var55;
            var4 = var57 ^ var55 >>> 4;
            int var58 = var55 + var56;
            int var59 = var4 + var45;
            var3 = var58 ^ var56 << 8;
            int var60 = var56 + var59;
            var2 = var60 ^ var59 >>> 9;
            var8 = var3 + var48;
            var7 = var2 + var51;
            var9 = var8 + var59;
            this.field54[var11] = var9;
            this.field54[var11 + 1] = var8;
            this.field54[var11 + 2] = var7;
            this.field54[var11 + 3] = var6;
            this.field54[var11 + 4] = var5;
            this.field54[var11 + 5] = var4;
            this.field54[var11 + 6] = var3;
            this.field54[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field54[var12 + 2] + var7;
            int var14 = this.field54[var12] + var9;
            int var15 = this.field54[var12 + 6] + var3;
            int var16 = this.field54[var12 + 7] + var2;
            int var17 = this.field54[var12 + 1] + var8;
            int var18 = this.field54[var12 + 3] + var6;
            int var19 = var14 ^ var17 << 11;
            int var20 = var18 + var19;
            int var21 = this.field54[var12 + 5] + var4;
            int var22 = this.field54[var12 + 4] + var5;
            int var23 = var13 + var17;
            int var24 = var23 ^ var13 >>> 2;
            int var25 = var22 + var24;
            int var26 = var13 + var20;
            int var27 = var26 ^ var20 << 8;
            int var28 = var21 + var27;
            int var29 = var20 + var25;
            var6 = var29 ^ var25 >>> 16;
            int var30 = var25 + var28;
            var5 = var30 ^ var28 << 10;
            int var31 = var6 + var15;
            int var32 = var5 + var16;
            int var33 = var28 + var31;
            var4 = var33 ^ var31 >>> 4;
            int var34 = var4 + var19;
            int var35 = var31 + var32;
            var3 = var35 ^ var32 << 8;
            int var36 = var32 + var34;
            var2 = var36 ^ var34 >>> 9;
            var7 = var2 + var27;
            var8 = var3 + var24;
            var9 = var8 + var34;
            this.field54[var12] = var9;
            this.field54[var12 + 1] = var8;
            this.field54[var12 + 2] = var7;
            this.field54[var12 + 3] = var6;
            this.field54[var12 + 4] = var5;
            this.field54[var12 + 5] = var4;
            this.field54[var12 + 6] = var3;
            this.field54[var12 + 7] = var2;
        }
        this.method22((byte) 37);
        this.field63 = arg0;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IBII)Llc;")
    public static final class79 method24(int arg0, byte arg1, int arg2, int arg3) {
        field62++;
        if (arg1 > -104) {
            method24(112, (byte) -90, 13, 0);
        }
        class79 var4 = new class79();
        var4.field1652 = arg3;
        var4.field1655 = arg0;
        class134.field2916.method503(-1, var4, (long) arg2);
        class149.method1167(arg0, (byte) -105);
        class14.method165(arg0, false);
        class154 var5 = class44.method403(arg2, true);
        if (var5 != null) {
            class138.method1092(0, var5);
        }
        if (class121.field2679 != null) {
            class138.method1092(0, class121.field2679);
            class121.field2679 = null;
        }
        field64 = false;
        class63.field1302 = 0;
        class8.method76(class17.field435, class57.field1147, (byte) 105, class71.field1430, class91.field1945);
        if (class19.field472 != -1) {
            class38.method365(1, class19.field472, 2945);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "([I)V")
    public class3(int[] arg0) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field57[var2] = arg0[var2];
        }
        this.method23(256);
    }

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "(I)I")
    public final int method25(int arg0) {
        field70++;
        if (this.field63-- == 0) {
            this.method22((byte) 37);
            this.field63 = 255;
        }
        return arg0 > -69 ? 0 : this.field57[this.field63];
    }
}
