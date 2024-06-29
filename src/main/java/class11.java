import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class11 {

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "[I")
    private int[] field236 = new int[256];

    @OriginalMember(owner = "client!ba", name = "g", descriptor = "[I")
    private int[] field239 = new int[256];

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "Lea;")
    public static class38 field233 = class9.method46((byte) 124, "Bitte versuchen Sie)1");

    @OriginalMember(owner = "client!ba", name = "h", descriptor = "Lea;")
    public static class38 field240 = class9.method46((byte) 117, "Verbindung mit Update)2Server)3)3)3");

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "Z")
    public static volatile boolean field235 = true;

    @OriginalMember(owner = "client!ba", name = "o", descriptor = "Lea;")
    public static class38 field247 = class9.method46((byte) 120, "titlebox");

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "Lu;")
    public static class179 field234 = new class179();

    @OriginalMember(owner = "client!ba", name = "q", descriptor = "Lea;")
    public static class38 field249 = class9.method46((byte) 105, "60 Sekunden noch einmal)3)3)3");

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "I")
    public static int field237;

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "I")
    private int field238;

    @OriginalMember(owner = "client!ba", name = "i", descriptor = "I")
    public static int field241;

    @OriginalMember(owner = "client!ba", name = "j", descriptor = "I")
    public static int field242;

    @OriginalMember(owner = "client!ba", name = "k", descriptor = "I")
    public static int field243;

    @OriginalMember(owner = "client!ba", name = "l", descriptor = "I")
    private int field244;

    @OriginalMember(owner = "client!ba", name = "m", descriptor = "I")
    private int field245;

    @OriginalMember(owner = "client!ba", name = "n", descriptor = "I")
    private int field246;

    @OriginalMember(owner = "client!ba", name = "p", descriptor = "I")
    public static int field248;

    @OriginalMember(owner = "client!ba", name = "r", descriptor = "J")
    public static long field250;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)V")
    public static void method56(int arg0) {
        field240 = null;
        field247 = null;
        field249 = null;
        field234 = null;
        if (arg0 != 7) {
            field240 = null;
        }
        field233 = null;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Z)I")
    public final int method57(boolean arg0) {
        field243++;
        if (!arg0) {
            field249 = null;
        }
        if (this.field244-- == 0) {
            this.method60(true);
            this.field244 = 255;
        }
        return this.field239[this.field244];
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(I)V")
    private final void method58(int arg0) {
        field237++;
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
            int var68 = var62 + var67;
            int var69 = var4 + var66;
            var6 = var68 ^ var67 >>> 16;
            int var70 = var67 + var69;
            int var71 = var3 + var6;
            var5 = var70 ^ var69 << 10;
            int var72 = var2 + var5;
            int var73 = var69 + var71;
            var4 = var73 ^ var71 >>> 4;
            int var74 = var4 + var61;
            int var75 = var71 + var72;
            var3 = var75 ^ var72 << 8;
            int var76 = var72 + var74;
            var2 = var76 ^ var74 >>> 9;
            var7 = var2 + var66;
            var8 = var3 + var64;
            var9 = var8 + var74;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field239[var11 + 7] + var2;
            int var38 = this.field239[var11 + 3] + var6;
            int var39 = this.field239[var11 + 6] + var3;
            int var40 = this.field239[var11] + var9;
            int var41 = this.field239[var11 + 4] + var5;
            int var42 = this.field239[var11 + 5] + var4;
            int var43 = this.field239[var11 + 1] + var8;
            int var44 = var40 ^ var43 << 11;
            int var45 = var38 + var44;
            int var46 = this.field239[var11 + 2] + var7;
            int var47 = var43 + var46;
            int var48 = var47 ^ var46 >>> 2;
            int var49 = var45 + var46;
            int var50 = var41 + var48;
            int var51 = var49 ^ var45 << 8;
            int var52 = var42 + var51;
            int var53 = var45 + var50;
            var6 = var53 ^ var50 >>> 16;
            int var54 = var50 + var52;
            var5 = var54 ^ var52 << 10;
            int var55 = var5 + var37;
            int var56 = var6 + var39;
            int var57 = var52 + var56;
            var4 = var57 ^ var56 >>> 4;
            int var58 = var4 + var44;
            int var59 = var55 + var56;
            var3 = var59 ^ var55 << 8;
            int var60 = var55 + var58;
            var8 = var3 + var48;
            var2 = var60 ^ var58 >>> 9;
            var7 = var2 + var51;
            var9 = var8 + var58;
            this.field236[var11] = var9;
            this.field236[var11 + 1] = var8;
            this.field236[var11 + 2] = var7;
            this.field236[var11 + 3] = var6;
            this.field236[var11 + 4] = var5;
            this.field236[var11 + 5] = var4;
            this.field236[var11 + 6] = var3;
            this.field236[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field236[var12 + 5] + var4;
            int var14 = this.field236[var12 + 2] + var7;
            int var15 = this.field236[var12 + 1] + var8;
            int var16 = this.field236[var12 + 3] + var6;
            int var17 = this.field236[var12 + 7] + var2;
            int var18 = this.field236[var12 + 4] + var5;
            int var19 = this.field236[var12 + 6] + var3;
            int var20 = this.field236[var12] + var9;
            int var21 = var20 ^ var15 << 11;
            int var22 = var14 + var15;
            int var23 = var16 + var21;
            int var24 = var22 ^ var14 >>> 2;
            int var25 = var18 + var24;
            int var26 = var14 + var23;
            int var27 = var26 ^ var23 << 8;
            int var28 = var23 + var25;
            int var29 = var13 + var27;
            var6 = var28 ^ var25 >>> 16;
            int var30 = var25 + var29;
            int var31 = var6 + var19;
            var5 = var30 ^ var29 << 10;
            int var32 = var29 + var31;
            int var33 = var5 + var17;
            var4 = var32 ^ var31 >>> 4;
            int var34 = var31 + var33;
            int var35 = var4 + var21;
            var3 = var34 ^ var33 << 8;
            int var36 = var33 + var35;
            var2 = var36 ^ var35 >>> 9;
            var7 = var2 + var27;
            var8 = var3 + var24;
            var9 = var8 + var35;
            this.field236[var12] = var9;
            this.field236[var12 + 1] = var8;
            this.field236[var12 + 2] = var7;
            this.field236[var12 + 3] = var6;
            this.field236[var12 + 4] = var5;
            this.field236[var12 + 5] = var4;
            this.field236[var12 + 6] = var3;
            this.field236[var12 + 7] = var2;
        }
        if (arg0 == 8) {
            this.method60(true);
            this.field244 = 256;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIZIILk;)V")
    public static final void method59(int arg0, int arg1, boolean arg2, int arg3, int arg4, class89 arg5) {
        field248++;
        if (arg2) {
            return;
        }
        int var6 = arg1 * arg1 + arg4 * arg4;
        if (var6 <= 4225 || var6 >= 90000) {
            class203.method1331(arg3, arg1, arg5, 94, arg0, arg4);
            return;
        }
        int var7 = class205.field4028 + class114.field2534 & 0x7FF;
        int var8 = class93.field2091[var7];
        int var9 = var8 * 256 / (class183.field3658 + 256);
        int var10 = class93.field2110[var7];
        int var11 = var10 * 256 / (class183.field3658 + 256);
        int var12 = arg4 * var9 + arg1 * var11 >> 16;
        int var13 = arg4 * var11 - arg1 * var9 >> 16;
        double var14 = Math.atan2((double) var12, (double) var13);
        int var16 = (int) (Math.sin(var14) * 63.0D);
        int var17 = (int) (Math.cos(var14) * 57.0D);
        class145.field3033.method749(var16 + arg0 + 94 + 4 - 10, -var17 + arg3 - -83 - 20, 20, 20, 15, 15, var14, 256);
    }

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "([I)V")
    public class11(int[] arg0) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field239[var2] = arg0[var2];
        }
        this.method58(8);
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(Z)V")
    private final void method60(boolean arg0) {
        this.field238 += ++this.field245;
        field241++;
        int var2 = 0;
        if (!arg0) {
            return;
        }
        while (var2 < 256) {
            int var3 = this.field236[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field246 ^= this.field246 << 13;
                } else {
                    this.field246 ^= this.field246 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field246 ^= this.field246 << 2;
            } else {
                this.field246 ^= this.field246 >>> 16;
            }
            this.field246 += this.field236[var2 + 128 & 0xFF];
            int var4;
            this.field236[var2] = var4 = this.field246 + this.field236[class52.method380(255, var3 >> 2)] + this.field238;
            this.field239[var2] = this.field238 = var3 + this.field236[class52.method380(var4 >> 8, 1020) >> 2];
            var2++;
        }
    }
}
