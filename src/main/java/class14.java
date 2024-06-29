import java.awt.Canvas;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class14 {

    @OriginalMember(owner = "client!bf", name = "r", descriptor = "[I")
    private int[] field284 = new int[256];

    @OriginalMember(owner = "client!bf", name = "s", descriptor = "[I")
    private int[] field285 = new int[256];

    @OriginalMember(owner = "client!bf", name = "n", descriptor = "Ltd;")
    public static class136 field280 = class145.method1172("scrollbar", 45);

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "I")
    public static int field274 = 0;

    @OriginalMember(owner = "client!bf", name = "p", descriptor = "I")
    public static int field282 = 3353893;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "I")
    public static int field267;

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "I")
    public static int field268;

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "I")
    public static int field269;

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "I")
    private int field270;

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "I")
    private int field271;

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "I")
    public static int field272;

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "I")
    public static int field273;

    @OriginalMember(owner = "client!bf", name = "i", descriptor = "I")
    public static int field275;

    @OriginalMember(owner = "client!bf", name = "j", descriptor = "I")
    public static int field276;

    @OriginalMember(owner = "client!bf", name = "k", descriptor = "I")
    public static int field277;

    @OriginalMember(owner = "client!bf", name = "l", descriptor = "I")
    private int field278;

    @OriginalMember(owner = "client!bf", name = "o", descriptor = "I")
    public static int field281;

    @OriginalMember(owner = "client!bf", name = "q", descriptor = "I")
    private int field283;

    @OriginalMember(owner = "client!bf", name = "m", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field279;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)V")
    private final void method97(int arg0) {
        field275++;
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
            int var73 = var2 + var5;
            int var74 = var69 + var73;
            var3 = var74 ^ var73 << 8;
            int var75 = var4 + var61;
            int var76 = var73 + var75;
            var8 = var3 + var64;
            var2 = var76 ^ var75 >>> 9;
            var7 = var2 + var67;
            var9 = var8 + var75;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field284[var11 + 7] + var2;
            int var38 = this.field284[var11 + 1] + var8;
            int var39 = this.field284[var11 + 5] + var4;
            int var40 = this.field284[var11 + 4] + var5;
            int var41 = this.field284[var11 + 6] + var3;
            int var42 = this.field284[var11 + 3] + var6;
            int var43 = this.field284[var11] + var9;
            int var44 = this.field284[var11 + 2] + var7;
            int var45 = var43 ^ var38 << 11;
            int var46 = var38 + var44;
            int var47 = var46 ^ var44 >>> 2;
            int var48 = var42 + var45;
            int var49 = var44 + var48;
            int var50 = var40 + var47;
            int var51 = var49 ^ var48 << 8;
            int var52 = var39 + var51;
            int var53 = var48 + var50;
            var6 = var53 ^ var50 >>> 16;
            int var54 = var6 + var41;
            int var55 = var50 + var52;
            var5 = var55 ^ var52 << 10;
            int var56 = var5 + var37;
            int var57 = var52 + var54;
            var4 = var57 ^ var54 >>> 4;
            int var58 = var4 + var45;
            int var59 = var54 + var56;
            var3 = var59 ^ var56 << 8;
            var8 = var3 + var47;
            int var60 = var56 + var58;
            var2 = var60 ^ var58 >>> 9;
            var9 = var8 + var58;
            var7 = var2 + var51;
            this.field285[var11] = var9;
            this.field285[var11 + 1] = var8;
            this.field285[var11 + 2] = var7;
            this.field285[var11 + 3] = var6;
            this.field285[var11 + 4] = var5;
            this.field285[var11 + 5] = var4;
            this.field285[var11 + 6] = var3;
            this.field285[var11 + 7] = var2;
        }
        for (int var12 = arg0; var12 < 256; var12 += 8) {
            int var13 = this.field285[var12] + var9;
            int var14 = this.field285[var12 + 2] + var7;
            int var15 = this.field285[var12 + 4] + var5;
            int var16 = this.field285[var12 + 1] + var8;
            int var17 = var13 ^ var16 << 11;
            int var18 = this.field285[var12 + 6] + var3;
            int var19 = this.field285[var12 + 3] + var6;
            int var20 = var14 + var16;
            int var21 = this.field285[var12 + 5] + var4;
            int var22 = this.field285[var12 + 7] + var2;
            int var23 = var20 ^ var14 >>> 2;
            int var24 = var17 + var19;
            int var25 = var14 + var24;
            int var26 = var15 + var23;
            int var27 = var25 ^ var24 << 8;
            int var28 = var21 + var27;
            int var29 = var24 + var26;
            var6 = var29 ^ var26 >>> 16;
            int var30 = var26 + var28;
            var5 = var30 ^ var28 << 10;
            int var31 = var6 + var18;
            int var32 = var5 + var22;
            int var33 = var28 + var31;
            var4 = var33 ^ var31 >>> 4;
            int var34 = var31 + var32;
            var3 = var34 ^ var32 << 8;
            int var35 = var4 + var17;
            var8 = var3 + var23;
            int var36 = var32 + var35;
            var2 = var36 ^ var35 >>> 9;
            var9 = var8 + var35;
            var7 = var2 + var27;
            this.field285[var12] = var9;
            this.field285[var12 + 1] = var8;
            this.field285[var12 + 2] = var7;
            this.field285[var12 + 3] = var6;
            this.field285[var12 + 4] = var5;
            this.field285[var12 + 5] = var4;
            this.field285[var12 + 6] = var3;
            this.field285[var12 + 7] = var2;
        }
        this.method98(arg0 + 119);
        this.field271 = 256;
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(I)V")
    private final void method98(int arg0) {
        field267++;
        this.field270 += ++this.field278;
        int var2 = 105 % ((arg0 - 23) / 53);
        for (int var3 = 0; var3 < 256; var3++) {
            int var4 = this.field285[var3];
            if ((var3 & 0x2) == 0) {
                if ((var3 & 0x1) == 0) {
                    this.field283 ^= this.field283 << 13;
                } else {
                    this.field283 ^= this.field283 >>> 6;
                }
            } else if ((var3 & 0x1) == 0) {
                this.field283 ^= this.field283 << 2;
            } else {
                this.field283 ^= this.field283 >>> 16;
            }
            this.field283 += this.field285[var3 + 128 & 0xFF];
            int var5;
            this.field285[var3] = var5 = this.field270 + this.field285[class154.method1207(255, var4 >> 2)] + this.field283;
            this.field284[var3] = this.field270 = this.field285[class154.method1207(255, var5 >> 8 >> 2)] + var4;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public static final void method99(byte arg0, Component arg1) {
        field281++;
        arg1.removeMouseListener(class90.field2132);
        arg1.removeMouseMotionListener(class90.field2132);
        if (arg0 > -12) {
            method101(-96, 103, -86, 78, (byte) -78);
        }
        arg1.removeFocusListener(class90.field2132);
        class54.field1205 = 0;
    }

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "(I)V")
    public static void method100(int arg0) {
        if (arg0 == 8) {
            field279 = null;
            field280 = null;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIIB)V")
    public static final void method101(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (arg4 >= -100) {
            field274 = 17;
        }
        field269++;
        for (int var5 = 0; var5 < class70.field1477; var5++) {
            if (arg3 < class100.field2408[var5] + class125.field2907[var5] && class100.field2408[var5] < arg0 + arg3 && class154.field3535[var5] + class133.field3137[var5] > arg1 && class154.field3535[var5] < arg1 + arg2) {
                class154.field3511[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lmd;B)V")
    public static final void method102(class87 arg0, byte arg1) {
        if (arg1 < 28) {
            method101(-84, 81, 92, 76, (byte) -62);
        }
        class107.field2527 = arg0;
        field276++;
    }

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "(I)I")
    public final int method103(int arg0) {
        if (arg0 < 39) {
            return -84;
        }
        if (this.field271-- == 0) {
            this.method98(-38);
            this.field271 = 255;
        }
        field273++;
        return this.field284[this.field271];
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "([I)V")
    public class14(int[] arg0) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field284[var2] = arg0[var2];
        }
        this.method97(0);
    }
}
