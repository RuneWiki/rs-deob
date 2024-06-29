import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class63 {

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "[I")
    private int[] field1184 = new int[256];

    @OriginalMember(owner = "client!gd", name = "j", descriptor = "[I")
    private int[] field1188 = new int[256];

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "I")
    public static int field1182 = 0;

    @OriginalMember(owner = "client!gd", name = "l", descriptor = "Ltg;")
    private static class184 field1190 = class135.method812("Username: ", 3);

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "Ltg;")
    public static class184 field1179 = field1190;

    @OriginalMember(owner = "client!gd", name = "s", descriptor = "Ltg;")
    public static class184 field1197 = class135.method812("mod_icons", 3);

    @OriginalMember(owner = "client!gd", name = "r", descriptor = "Ltg;")
    private static class184 field1196 = class135.method812("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R+R(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ", 3);

    @OriginalMember(owner = "client!gd", name = "m", descriptor = "Ltg;")
    public static class184 field1191 = field1196;

    @OriginalMember(owner = "client!gd", name = "u", descriptor = "I")
    public static int field1199 = 0;

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "I")
    public static int field1180;

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "I")
    private int field1181;

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "I")
    public static int field1183;

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "I")
    public static int field1185;

    @OriginalMember(owner = "client!gd", name = "i", descriptor = "I")
    private int field1187;

    @OriginalMember(owner = "client!gd", name = "k", descriptor = "I")
    public static int field1189;

    @OriginalMember(owner = "client!gd", name = "n", descriptor = "I")
    public static int field1192;

    @OriginalMember(owner = "client!gd", name = "o", descriptor = "I")
    public static int field1193;

    @OriginalMember(owner = "client!gd", name = "p", descriptor = "I")
    private int field1194;

    @OriginalMember(owner = "client!gd", name = "q", descriptor = "I")
    public static int field1195;

    @OriginalMember(owner = "client!gd", name = "t", descriptor = "I")
    private int field1198;

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "[[B")
    public static byte[][] field1186;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V")
    private final void method352(int arg0) {
        this.field1194 += ++this.field1198;
        field1192++;
        int var2 = 4 / ((-arg0 - 17) / 42);
        for (int var3 = 0; var3 < 256; var3++) {
            int var4 = this.field1184[var3];
            if ((var3 & 0x2) == 0) {
                if ((var3 & 0x1) == 0) {
                    this.field1181 ^= this.field1181 << 13;
                } else {
                    this.field1181 ^= this.field1181 >>> 6;
                }
            } else if ((var3 & 0x1) == 0) {
                this.field1181 ^= this.field1181 << 2;
            } else {
                this.field1181 ^= this.field1181 >>> 16;
            }
            this.field1181 += this.field1184[var3 + 128 & 0xFF];
            int var5;
            this.field1184[var3] = var5 = this.field1181 + this.field1184[class10.method61(var4, 1020) >> 2] + this.field1194;
            this.field1188[var3] = this.field1194 = this.field1184[class10.method61(var5 >> 8 >> 2, 255)] + var4;
        }
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(I)V")
    public static final void method353(int arg0) {
        class134.field2431++;
        class117.field2122.method106(204, 1);
        field1193++;
        if (arg0 == -20739) {
            class117.field2122.method607(0L, 73);
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)V")
    public static void method354(byte arg0) {
        field1196 = null;
        field1191 = null;
        field1186 = null;
        field1190 = null;
        field1197 = null;
        if (arg0 < 69) {
            field1179 = null;
        }
        field1179 = null;
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(B)V")
    private final void method355(byte arg0) {
        field1195++;
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
            int var66 = var5 + var64;
            int var67 = var65 ^ var62 << 8;
            int var68 = var4 + var67;
            int var69 = var62 + var66;
            var6 = var69 ^ var66 >>> 16;
            int var70 = var66 + var68;
            var5 = var70 ^ var68 << 10;
            int var71 = var2 + var5;
            int var72 = var3 + var6;
            int var73 = var68 + var72;
            var4 = var73 ^ var72 >>> 4;
            int var74 = var4 + var61;
            int var75 = var71 + var72;
            var3 = var75 ^ var71 << 8;
            int var76 = var71 + var74;
            var2 = var76 ^ var74 >>> 9;
            var7 = var2 + var67;
            var8 = var3 + var64;
            var9 = var8 + var74;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field1188[var11 + 6] + var3;
            int var38 = this.field1188[var11 + 1] + var8;
            int var39 = this.field1188[var11] + var9;
            int var40 = this.field1188[var11 + 3] + var6;
            int var41 = this.field1188[var11 + 2] + var7;
            int var42 = this.field1188[var11 + 5] + var4;
            int var43 = this.field1188[var11 + 7] + var2;
            int var44 = this.field1188[var11 + 4] + var5;
            int var45 = var39 ^ var38 << 11;
            int var46 = var40 + var45;
            int var47 = var38 + var41;
            int var48 = var47 ^ var41 >>> 2;
            int var49 = var41 + var46;
            int var50 = var49 ^ var46 << 8;
            int var51 = var42 + var50;
            int var52 = var44 + var48;
            int var53 = var46 + var52;
            var6 = var53 ^ var52 >>> 16;
            int var54 = var6 + var37;
            int var55 = var51 + var52;
            var5 = var55 ^ var51 << 10;
            int var56 = var5 + var43;
            int var57 = var51 + var54;
            var4 = var57 ^ var54 >>> 4;
            int var58 = var54 + var56;
            var3 = var58 ^ var56 << 8;
            int var59 = var4 + var45;
            var8 = var3 + var48;
            int var60 = var56 + var59;
            var2 = var60 ^ var59 >>> 9;
            var7 = var2 + var50;
            var9 = var8 + var59;
            this.field1184[var11] = var9;
            this.field1184[var11 + 1] = var8;
            this.field1184[var11 + 2] = var7;
            this.field1184[var11 + 3] = var6;
            this.field1184[var11 + 4] = var5;
            this.field1184[var11 + 5] = var4;
            this.field1184[var11 + 6] = var3;
            this.field1184[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field1184[var12 + 6] + var3;
            int var14 = this.field1184[var12 + 4] + var5;
            int var15 = this.field1184[var12 + 3] + var6;
            int var16 = this.field1184[var12 + 5] + var4;
            int var17 = this.field1184[var12 + 1] + var8;
            int var18 = this.field1184[var12 + 7] + var2;
            int var19 = this.field1184[var12] + var9;
            int var20 = this.field1184[var12 + 2] + var7;
            int var21 = var19 ^ var17 << 11;
            int var22 = var15 + var21;
            int var23 = var17 + var20;
            int var24 = var23 ^ var20 >>> 2;
            int var25 = var14 + var24;
            int var26 = var20 + var22;
            int var27 = var26 ^ var22 << 8;
            int var28 = var22 + var25;
            int var29 = var16 + var27;
            var6 = var28 ^ var25 >>> 16;
            int var30 = var6 + var13;
            int var31 = var25 + var29;
            var5 = var31 ^ var29 << 10;
            int var32 = var5 + var18;
            int var33 = var29 + var30;
            var4 = var33 ^ var30 >>> 4;
            int var34 = var30 + var32;
            int var35 = var4 + var21;
            var3 = var34 ^ var32 << 8;
            int var36 = var32 + var35;
            var8 = var3 + var24;
            var2 = var36 ^ var35 >>> 9;
            var9 = var8 + var35;
            this.field1184[var12] = var9;
            var7 = var2 + var27;
            this.field1184[var12 + 1] = var8;
            this.field1184[var12 + 2] = var7;
            this.field1184[var12 + 3] = var6;
            this.field1184[var12 + 4] = var5;
            this.field1184[var12 + 5] = var4;
            this.field1184[var12 + 6] = var3;
            this.field1184[var12 + 7] = var2;
        }
        if (arg0 > -36) {
            this.field1198 = -86;
        }
        this.method352(-96);
        this.field1187 = 256;
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(I)I")
    public final int method356(int arg0) {
        if (this.field1187-- == 0) {
            this.method352(arg0 ^ 0xFFFFE325);
            this.field1187 = 255;
        }
        field1180++;
        if (arg0 != -7310) {
            field1199 = 30;
        }
        return this.field1188[this.field1187];
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIII)I")
    public static final int method357(int arg0, int arg1, int arg2, int arg3) {
        field1185++;
        if (arg3 != -128) {
            method353(94);
        }
        int var4 = 256 - arg0;
        return ((arg1 & 0xFF00FF) * var4 + (arg2 & 0xFF00FF) * arg0 & 0xFF00FF00) + ((arg1 & 0xFF00) * var4 + (arg2 & 0xFF00) * arg0 & 0xFF0000) >> 8;
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "([I)V")
    public class63(int[] arg0) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field1188[var2] = arg0[var2];
        }
        this.method355((byte) -51);
    }
}
