import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("bd")
public class class15 {

    @OriginalMember(owner = "bd", name = "h", descriptor = "[I")
    private int[] field282 = new int[256];

    @OriginalMember(owner = "bd", name = "b", descriptor = "[I")
    private int[] field276 = new int[256];

    @OriginalMember(owner = "bd", name = "g", descriptor = "Lrc;")
    public static class160 field281 = new class160(50);

    @OriginalMember(owner = "bd", name = "o", descriptor = "I")
    public static int field289 = 0;

    @OriginalMember(owner = "bd", name = "p", descriptor = "Llf;")
    private static class109 field290 = class35.method275("Connecting to update server", 2);

    @OriginalMember(owner = "bd", name = "m", descriptor = "Llf;")
    public static class109 field287 = field290;

    @OriginalMember(owner = "bd", name = "n", descriptor = "Z")
    public static volatile boolean field288 = true;

    @OriginalMember(owner = "bd", name = "a", descriptor = "I")
    private int field275;

    @OriginalMember(owner = "bd", name = "c", descriptor = "I")
    private int field277;

    @OriginalMember(owner = "bd", name = "d", descriptor = "I")
    private int field278;

    @OriginalMember(owner = "bd", name = "e", descriptor = "I")
    private int field279;

    @OriginalMember(owner = "bd", name = "f", descriptor = "I")
    public static int field280;

    @OriginalMember(owner = "bd", name = "i", descriptor = "I")
    public static int field283;

    @OriginalMember(owner = "bd", name = "j", descriptor = "I")
    public static int field284;

    @OriginalMember(owner = "bd", name = "k", descriptor = "I")
    public static int field285;

    @OriginalMember(owner = "bd", name = "l", descriptor = "Lbg;")
    public static class18 field286;

    @OriginalMember(owner = "bd", name = "a", descriptor = "(Llf;Llf;BLbg;)Lkf;")
    public static final class100 method97(class109 arg0, class109 arg1, byte arg2, class18 arg3) {
        if (arg2 != -107) {
            field287 = null;
        }
        int var4 = arg3.method151((byte) 106, arg0);
        int var5 = arg3.method154((byte) -50, arg1, var4);
        field280++;
        return class162.method1100(var5, var4, (byte) 49, arg3);
    }

    @OriginalMember(owner = "bd", name = "a", descriptor = "(I)V")
    private final void method98(int arg0) {
        this.field277 += ++this.field278;
        if (arg0 != -640591166) {
            this.method98(-54);
        }
        field284++;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field276[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field279 ^= this.field279 << 13;
                } else {
                    this.field279 ^= this.field279 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field279 ^= this.field279 << 2;
            } else {
                this.field279 ^= this.field279 >>> 16;
            }
            this.field279 += this.field276[var2 + 128 & 0xFF];
            int var4;
            this.field276[var2] = var4 = this.field277 + this.field276[class170.method1140(var3 >> 2, 255)] + this.field279;
            this.field282[var2] = this.field277 = var3 + this.field276[class170.method1140(var4 >> 8 >> 2, 255)];
        }
    }

    @OriginalMember(owner = "bd", name = "<init>", descriptor = "([I)V")
    public class15(int[] arg0) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field282[var2] = arg0[var2];
        }
        this.method99(127);
    }

    @OriginalMember(owner = "bd", name = "b", descriptor = "(I)V")
    private final void method99(int arg0) {
        int var2 = -9 / ((arg0 + 18) / 55);
        field285++;
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;
        int var9 = -1640531527;
        int var10 = -1640531527;
        for (int var11 = 0; var11 < 4; var11++) {
            int var62 = var10 ^ var9 << 11;
            int var63 = var7 + var62;
            int var64 = var8 + var9;
            int var65 = var64 ^ var8 >>> 2;
            int var66 = var8 + var63;
            int var67 = var6 + var65;
            int var68 = var66 ^ var63 << 8;
            int var69 = var5 + var68;
            int var70 = var63 + var67;
            var7 = var70 ^ var67 >>> 16;
            int var71 = var4 + var7;
            int var72 = var67 + var69;
            var6 = var72 ^ var69 << 10;
            int var73 = var69 + var71;
            int var74 = var3 + var6;
            var5 = var73 ^ var71 >>> 4;
            int var75 = var5 + var62;
            int var76 = var71 + var74;
            var4 = var76 ^ var74 << 8;
            int var77 = var74 + var75;
            var3 = var77 ^ var75 >>> 9;
            var9 = var4 + var65;
            var8 = var3 + var68;
            var10 = var9 + var75;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var38 = this.field282[var12 + 5] + var5;
            int var39 = this.field282[var12] + var10;
            int var40 = this.field282[var12 + 4] + var6;
            int var41 = this.field282[var12 + 6] + var4;
            int var42 = this.field282[var12 + 1] + var9;
            int var43 = this.field282[var12 + 7] + var3;
            int var44 = var39 ^ var42 << 11;
            int var45 = this.field282[var12 + 2] + var8;
            int var46 = var42 + var45;
            int var47 = this.field282[var12 + 3] + var7;
            int var48 = var46 ^ var45 >>> 2;
            int var49 = var44 + var47;
            int var50 = var40 + var48;
            int var51 = var45 + var49;
            int var52 = var51 ^ var49 << 8;
            int var53 = var38 + var52;
            int var54 = var49 + var50;
            var7 = var54 ^ var50 >>> 16;
            int var55 = var50 + var53;
            var6 = var55 ^ var53 << 10;
            int var56 = var7 + var41;
            int var57 = var6 + var43;
            int var58 = var53 + var56;
            var5 = var58 ^ var56 >>> 4;
            int var59 = var56 + var57;
            var4 = var59 ^ var57 << 8;
            int var60 = var5 + var44;
            var9 = var4 + var48;
            int var61 = var57 + var60;
            var3 = var61 ^ var60 >>> 9;
            var10 = var9 + var60;
            var8 = var3 + var52;
            this.field276[var12] = var10;
            this.field276[var12 + 1] = var9;
            this.field276[var12 + 2] = var8;
            this.field276[var12 + 3] = var7;
            this.field276[var12 + 4] = var6;
            this.field276[var12 + 5] = var5;
            this.field276[var12 + 6] = var4;
            this.field276[var12 + 7] = var3;
        }
        for (int var13 = 0; var13 < 256; var13 += 8) {
            int var14 = this.field276[var13 + 2] + var8;
            int var15 = this.field276[var13 + 6] + var4;
            int var16 = this.field276[var13 + 3] + var7;
            int var17 = this.field276[var13] + var10;
            int var18 = this.field276[var13 + 4] + var6;
            int var19 = this.field276[var13 + 7] + var3;
            int var20 = this.field276[var13 + 5] + var5;
            int var21 = this.field276[var13 + 1] + var9;
            int var22 = var17 ^ var21 << 11;
            int var23 = var14 + var21;
            int var24 = var23 ^ var14 >>> 2;
            int var25 = var16 + var22;
            int var26 = var18 + var24;
            int var27 = var14 + var25;
            int var28 = var27 ^ var25 << 8;
            int var29 = var25 + var26;
            int var30 = var20 + var28;
            var7 = var29 ^ var26 >>> 16;
            int var31 = var7 + var15;
            int var32 = var26 + var30;
            var6 = var32 ^ var30 << 10;
            int var33 = var6 + var19;
            int var34 = var30 + var31;
            var5 = var34 ^ var31 >>> 4;
            int var35 = var5 + var22;
            int var36 = var31 + var33;
            var4 = var36 ^ var33 << 8;
            int var37 = var33 + var35;
            var3 = var37 ^ var35 >>> 9;
            var9 = var4 + var24;
            var10 = var9 + var35;
            this.field276[var13] = var10;
            this.field276[var13 + 1] = var9;
            var8 = var3 + var28;
            this.field276[var13 + 2] = var8;
            this.field276[var13 + 3] = var7;
            this.field276[var13 + 4] = var6;
            this.field276[var13 + 5] = var5;
            this.field276[var13 + 6] = var4;
            this.field276[var13 + 7] = var3;
        }
        this.method98(-640591166);
        this.field275 = 256;
    }

    @OriginalMember(owner = "bd", name = "a", descriptor = "(Z)V")
    public static void method100(boolean arg0) {
        field290 = null;
        if (!arg0) {
            method97(null, null, (byte) 124, null);
        }
        field281 = null;
        field286 = null;
        field287 = null;
    }

    @OriginalMember(owner = "bd", name = "c", descriptor = "(I)I")
    public final int method101(int arg0) {
        field283++;
        if (arg0 != -22198) {
            return 99;
        }
        if (this.field275-- == 0) {
            this.method98(-640591166);
            this.field275 = 255;
        }
        return this.field282[this.field275];
    }
}
