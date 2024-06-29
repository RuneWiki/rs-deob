import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class17 {

    @OriginalMember(owner = "client!cb", name = "s", descriptor = "[I")
    private int[] field274 = new int[256];

    @OriginalMember(owner = "client!cb", name = "p", descriptor = "[I")
    private int[] field271 = new int[256];

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "Lv;")
    public static class146 field256 = class159.method1226((byte) -37, "");

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "Lv;")
    public static class146 field262 = class159.method1226((byte) -37, "Diese Welt ist voll)3");

    @OriginalMember(owner = "client!cb", name = "i", descriptor = "I")
    public static int field264 = 0;

    @OriginalMember(owner = "client!cb", name = "j", descriptor = "Lv;")
    public static class146 field265 = class159.method1226((byte) -37, "Spiel)2Engine wird gestartet)3)3)3");

    @OriginalMember(owner = "client!cb", name = "h", descriptor = "Lv;")
    private static class146 field263 = class159.method1226((byte) -37, "Your profile will be transferred in:");

    @OriginalMember(owner = "client!cb", name = "z", descriptor = "Lv;")
    public static class146 field281 = class159.method1226((byte) -37, "Bitte wenden Sie sich an den Kundendienst)3");

    @OriginalMember(owner = "client!cb", name = "q", descriptor = "Lv;")
    private static class146 field272 = class159.method1226((byte) -37, "wave2:");

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "Lv;")
    public static class146 field261 = class159.method1226((byte) -37, "k");

    @OriginalMember(owner = "client!cb", name = "x", descriptor = "Lv;")
    public static class146 field279 = field272;

    @OriginalMember(owner = "client!cb", name = "m", descriptor = "Lv;")
    public static class146 field268 = field263;

    @OriginalMember(owner = "client!cb", name = "r", descriptor = "I")
    public static int field273 = 2301979;

    @OriginalMember(owner = "client!cb", name = "l", descriptor = "Lv;")
    public static class146 field267 = field272;

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "I")
    public static int field257;

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "I")
    public static int field258;

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "I")
    private int field260;

    @OriginalMember(owner = "client!cb", name = "k", descriptor = "I")
    private int field266;

    @OriginalMember(owner = "client!cb", name = "n", descriptor = "I")
    private int field269;

    @OriginalMember(owner = "client!cb", name = "o", descriptor = "I")
    public static int field270;

    @OriginalMember(owner = "client!cb", name = "t", descriptor = "I")
    private int field275;

    @OriginalMember(owner = "client!cb", name = "u", descriptor = "I")
    public static int field276;

    @OriginalMember(owner = "client!cb", name = "v", descriptor = "I")
    public static int field277;

    @OriginalMember(owner = "client!cb", name = "w", descriptor = "I")
    public static int field278;

    @OriginalMember(owner = "client!cb", name = "y", descriptor = "I")
    public static int field280;

    @OriginalMember(owner = "client!cb", name = "A", descriptor = "I")
    public static int field282;

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "[[S")
    public static short[][] field259;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V")
    private final void method101(int arg0) {
        field278++;
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
            var5 = var70 ^ var68 << 10;
            int var71 = var3 + var6;
            int var72 = var2 + var5;
            int var73 = var68 + var71;
            var4 = var73 ^ var71 >>> 4;
            int var74 = var71 + var72;
            var3 = var74 ^ var72 << 8;
            int var75 = var4 + var61;
            var8 = var3 + var64;
            int var76 = var72 + var75;
            var2 = var76 ^ var75 >>> 9;
            var7 = var2 + var67;
            var9 = var8 + var75;
        }
        for (int var11 = arg0; var11 < 256; var11 += 8) {
            int var37 = this.field274[var11 + 6] + var3;
            int var38 = this.field274[var11 + 3] + var6;
            int var39 = this.field274[var11 + 1] + var8;
            int var40 = this.field274[var11 + 7] + var2;
            int var41 = this.field274[var11] + var9;
            int var42 = this.field274[var11 + 5] + var4;
            int var43 = this.field274[var11 + 4] + var5;
            int var44 = var41 ^ var39 << 11;
            int var45 = this.field274[var11 + 2] + var7;
            int var46 = var38 + var44;
            int var47 = var39 + var45;
            int var48 = var47 ^ var45 >>> 2;
            int var49 = var43 + var48;
            int var50 = var45 + var46;
            int var51 = var50 ^ var46 << 8;
            int var52 = var42 + var51;
            int var53 = var46 + var49;
            var6 = var53 ^ var49 >>> 16;
            int var54 = var49 + var52;
            int var55 = var6 + var37;
            var5 = var54 ^ var52 << 10;
            int var56 = var52 + var55;
            var4 = var56 ^ var55 >>> 4;
            int var57 = var4 + var44;
            int var58 = var5 + var40;
            int var59 = var55 + var58;
            var3 = var59 ^ var58 << 8;
            var8 = var3 + var48;
            int var60 = var57 + var58;
            var2 = var60 ^ var57 >>> 9;
            var9 = var8 + var57;
            var7 = var2 + var51;
            this.field271[var11] = var9;
            this.field271[var11 + 1] = var8;
            this.field271[var11 + 2] = var7;
            this.field271[var11 + 3] = var6;
            this.field271[var11 + 4] = var5;
            this.field271[var11 + 5] = var4;
            this.field271[var11 + 6] = var3;
            this.field271[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field271[var12 + 3] + var6;
            int var14 = this.field271[var12] + var9;
            int var15 = this.field271[var12 + 2] + var7;
            int var16 = this.field271[var12 + 6] + var3;
            int var17 = this.field271[var12 + 7] + var2;
            int var18 = this.field271[var12 + 1] + var8;
            int var19 = this.field271[var12 + 4] + var5;
            int var20 = var14 ^ var18 << 11;
            int var21 = var15 + var18;
            int var22 = var21 ^ var15 >>> 2;
            int var23 = this.field271[var12 + 5] + var4;
            int var24 = var19 + var22;
            int var25 = var13 + var20;
            int var26 = var15 + var25;
            int var27 = var26 ^ var25 << 8;
            int var28 = var23 + var27;
            int var29 = var24 + var25;
            var6 = var29 ^ var24 >>> 16;
            int var30 = var24 + var28;
            var5 = var30 ^ var28 << 10;
            int var31 = var5 + var17;
            int var32 = var6 + var16;
            int var33 = var28 + var32;
            var4 = var33 ^ var32 >>> 4;
            int var34 = var4 + var20;
            int var35 = var31 + var32;
            var3 = var35 ^ var31 << 8;
            var8 = var3 + var22;
            int var36 = var31 + var34;
            var2 = var36 ^ var34 >>> 9;
            var7 = var2 + var27;
            var9 = var8 + var34;
            this.field271[var12] = var9;
            this.field271[var12 + 1] = var8;
            this.field271[var12 + 2] = var7;
            this.field271[var12 + 3] = var6;
            this.field271[var12 + 4] = var5;
            this.field271[var12 + 5] = var4;
            this.field271[var12 + 6] = var3;
            this.field271[var12 + 7] = var2;
        }
        this.method103((byte) -29);
        this.field275 = 256;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lla;Lla;B)V")
    public static final void method102(class77 arg0, class77 arg1, byte arg2) {
        class73.field1704 = arg0;
        field270++;
        if (arg2 > -22) {
            field259 = null;
        }
        class52.field1169 = arg1;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(B)V")
    private final void method103(byte arg0) {
        this.field266 += ++this.field269;
        if (arg0 != -29) {
            this.method101(-111);
        }
        field276++;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field271[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field260 ^= this.field260 << 13;
                } else {
                    this.field260 ^= this.field260 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field260 ^= this.field260 << 2;
            } else {
                this.field260 ^= this.field260 >>> 16;
            }
            this.field260 += this.field271[var2 + 128 & 0xFF];
            int var4;
            this.field271[var2] = var4 = this.field271[class90.method711(1020, var3) >> 2] + this.field260 + this.field266;
            this.field274[var2] = this.field266 = var3 + this.field271[class90.method711(255, var4 >> 8 >> 2)];
        }
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)I")
    public final int method104(int arg0) {
        field257++;
        if (this.field275-- == 0) {
            this.method103((byte) -29);
            this.field275 = 255;
        }
        if (arg0 != -21714) {
            this.field269 = 67;
        }
        return this.field274[this.field275];
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Z)V")
    public static final void method105(boolean arg0) {
        class12.field194.method13(false);
        if (!arg0) {
            field272 = null;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            class148.field3449[var1] = 0L;
        }
        field280++;
        for (int var2 = 0; var2 < 32; var2++) {
            class59.field1366[var2] = 0L;
        }
        class147.field3417 = 0;
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(B)V")
    public static void method106(byte arg0) {
        field279 = null;
        field281 = null;
        field268 = null;
        field263 = null;
        if (arg0 != 7) {
            return;
        }
        field261 = null;
        field262 = null;
        field259 = null;
        field256 = null;
        field272 = null;
        field267 = null;
        field265 = null;
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "([I)V")
    public class17(int[] arg0) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field274[var2] = arg0[var2];
        }
        this.method101(0);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(BIIII)V")
    public static final void method107(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field282++;
        int var5 = 15 % ((arg0 + 4) / 38);
        for (int var6 = arg4; var6 <= arg4 + arg2; var6++) {
            for (int var7 = arg1; var7 <= arg1 + arg3; var7++) {
                if (var7 >= 0 && var7 < 104 && var6 >= 0 && var6 < 104) {
                    class100.field2423[0][var7][var6] = 127;
                    if (arg1 == var7 && var7 > 0) {
                        class78.field1891[0][var7][var6] = class78.field1891[0][var7 - 1][var6];
                    }
                    if (arg1 + arg3 == var7 && var7 < 103) {
                        class78.field1891[0][var7][var6] = class78.field1891[0][var7 + 1][var6];
                    }
                    if (arg4 == var6 && var6 > 0) {
                        class78.field1891[0][var7][var6] = class78.field1891[0][var7][var6 - 1];
                    }
                    if (arg2 + arg4 == var6 && var6 < 103) {
                        class78.field1891[0][var7][var6] = class78.field1891[0][var7][var6 + 1];
                    }
                }
            }
        }
    }
}
