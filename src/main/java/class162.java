import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public class class162 {

    @OriginalMember(owner = "client!cr", name = "i", descriptor = "[I")
    private int[] field2291;

    @OriginalMember(owner = "client!cr", name = "n", descriptor = "[I")
    private int[] field2296;

    @OriginalMember(owner = "client!cr", name = "d", descriptor = "Liba;")
    public static class211 field2286 = new class211(77, -1);

    @OriginalMember(owner = "client!cr", name = "o", descriptor = "F")
    public static float field2297;

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "I")
    private int field2283;

    @OriginalMember(owner = "client!cr", name = "c", descriptor = "I")
    private int field2285;

    @OriginalMember(owner = "client!cr", name = "e", descriptor = "I")
    public static int field2287;

    @OriginalMember(owner = "client!cr", name = "f", descriptor = "I")
    public static int field2288;

    @OriginalMember(owner = "client!cr", name = "g", descriptor = "I")
    public static int field2289;

    @OriginalMember(owner = "client!cr", name = "h", descriptor = "I")
    public static int field2290;

    @OriginalMember(owner = "client!cr", name = "j", descriptor = "I")
    public static int field2292;

    @OriginalMember(owner = "client!cr", name = "k", descriptor = "I")
    private int field2293;

    @OriginalMember(owner = "client!cr", name = "l", descriptor = "I")
    private int field2294;

    @OriginalMember(owner = "client!cr", name = "m", descriptor = "I")
    public static int field2295;

    @OriginalMember(owner = "client!cr", name = "p", descriptor = "I")
    public static int field2298;

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "Lks;")
    public static class421 field2284;

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(B)V", line = 5)
    public static final void method1147(byte arg0) {
        class692 var1 = class449.field6502;
        synchronized (class449.field6502) {
            class449.field6502.method3890(-1);
        }
        field2288++;
        class692 var2 = class495.field7010;
        synchronized (class495.field7010) {
            class495.field7010.method3890(-1);
            if (arg0 > -52) {
                method1149(18, -107, 33);
            }
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(I)V", line = 21)
    private final void method1148(int arg0) {
        field2298++;
        this.field2293 += ++this.field2285;
        for (int var2 = arg0; var2 < 256; var2++) {
            int var3 = this.field2291[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field2294 ^= this.field2294 << 13;
                } else {
                    this.field2294 ^= this.field2294 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field2294 ^= this.field2294 << 2;
            } else {
                this.field2294 ^= this.field2294 >>> 16;
            }
            this.field2294 += this.field2291[var2 + 128 & 0xFF];
            int var4;
            this.field2291[var2] = var4 = this.field2294 + this.field2291[class425.method2563(var3, 1020) >> 2] + this.field2293;
            this.field2296[var2] = this.field2293 = var3 + this.field2291[class425.method2563(255, var4 >> 8 >> 2)];
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(III)Z", line = 62)
    public static final boolean method1149(int arg0, int arg1, int arg2) {
        field2290++;
        if (arg2 <= 79) {
            field2284 = null;
        }
        return (arg1 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(Z)V", line = 76)
    private final void method1150(boolean arg0) {
        if (arg0) {
            this.field2283 = -61;
        }
        field2292++;
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
            int var71 = var3 + var6;
            var5 = var70 ^ var68 << 10;
            int var72 = var2 + var5;
            int var73 = var68 + var71;
            var4 = var73 ^ var71 >>> 4;
            int var74 = var71 + var72;
            int var75 = var4 + var61;
            var3 = var74 ^ var72 << 8;
            var8 = var3 + var64;
            int var76 = var72 + var75;
            var2 = var76 ^ var75 >>> 9;
            var7 = var2 + var67;
            var9 = var8 + var75;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field2296[var11 + 3] + var6;
            int var38 = this.field2296[var11 + 5] + var4;
            int var39 = this.field2296[var11 + 6] + var3;
            int var40 = this.field2296[var11 + 2] + var7;
            int var41 = this.field2296[var11 + 1] + var8;
            int var42 = this.field2296[var11] + var9;
            int var43 = this.field2296[var11 + 4] + var5;
            int var44 = this.field2296[var11 + 7] + var2;
            int var45 = var42 ^ var41 << 11;
            int var46 = var37 + var45;
            int var47 = var40 + var41;
            int var48 = var47 ^ var40 >>> 2;
            int var49 = var40 + var46;
            int var50 = var43 + var48;
            int var51 = var49 ^ var46 << 8;
            int var52 = var46 + var50;
            int var53 = var38 + var51;
            var6 = var52 ^ var50 >>> 16;
            int var54 = var6 + var39;
            int var55 = var50 + var53;
            var5 = var55 ^ var53 << 10;
            int var56 = var5 + var44;
            int var57 = var53 + var54;
            var4 = var57 ^ var54 >>> 4;
            int var58 = var4 + var45;
            int var59 = var54 + var56;
            var3 = var59 ^ var56 << 8;
            var8 = var3 + var48;
            int var60 = var56 + var58;
            var2 = var60 ^ var58 >>> 9;
            var7 = var2 + var51;
            var9 = var8 + var58;
            this.field2291[var11] = var9;
            this.field2291[var11 + 1] = var8;
            this.field2291[var11 + 2] = var7;
            this.field2291[var11 + 3] = var6;
            this.field2291[var11 + 4] = var5;
            this.field2291[var11 + 5] = var4;
            this.field2291[var11 + 6] = var3;
            this.field2291[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field2291[var12 + 2] + var7;
            int var14 = this.field2291[var12 + 6] + var3;
            int var15 = this.field2291[var12 + 7] + var2;
            int var16 = this.field2291[var12 + 1] + var8;
            int var17 = this.field2291[var12] + var9;
            int var18 = this.field2291[var12 + 5] + var4;
            int var19 = this.field2291[var12 + 4] + var5;
            int var20 = this.field2291[var12 + 3] + var6;
            int var21 = var17 ^ var16 << 11;
            int var22 = var13 + var16;
            int var23 = var20 + var21;
            int var24 = var22 ^ var13 >>> 2;
            int var25 = var19 + var24;
            int var26 = var13 + var23;
            int var27 = var26 ^ var23 << 8;
            int var28 = var18 + var27;
            int var29 = var23 + var25;
            var6 = var29 ^ var25 >>> 16;
            int var30 = var25 + var28;
            int var31 = var6 + var14;
            var5 = var30 ^ var28 << 10;
            int var32 = var28 + var31;
            int var33 = var5 + var15;
            var4 = var32 ^ var31 >>> 4;
            int var34 = var31 + var33;
            int var35 = var4 + var21;
            var3 = var34 ^ var33 << 8;
            int var36 = var33 + var35;
            var8 = var3 + var24;
            var2 = var36 ^ var35 >>> 9;
            var7 = var2 + var27;
            var9 = var8 + var35;
            this.field2291[var12] = var9;
            this.field2291[var12 + 1] = var8;
            this.field2291[var12 + 2] = var7;
            this.field2291[var12 + 3] = var6;
            this.field2291[var12 + 4] = var5;
            this.field2291[var12 + 5] = var4;
            this.field2291[var12 + 6] = var3;
            this.field2291[var12 + 7] = var2;
        }
        this.method1148(0);
        this.field2283 = 256;
    }

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "(B)I", line = 229)
    public final int method1151(byte arg0) {
        field2287++;
        if (arg0 > -116) {
            this.method1151((byte) 70);
        }
        if (this.field2283 == 0) {
            this.method1148(0);
            this.field2283 = 256;
        }
        return this.field2296[this.field2283 - 1];
    }

    @OriginalMember(owner = "client!cr", name = "c", descriptor = "(B)I", line = 247)
    public final int method1152(byte arg0) {
        if (this.field2283 == 0) {
            this.method1148(0);
            this.field2283 = 256;
        }
        field2289++;
        int var2 = 88 / ((-arg0 - 12) / 62);
        return this.field2296[--this.field2283];
    }

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "(I)V", line = 266)
    public static void method1153(int arg0) {
        if (arg0 != 256) {
            field2297 = 0.89393467F;
        }
        field2284 = null;
        field2286 = null;
    }

    @OriginalMember(owner = "client!cr", name = "<init>", descriptor = "()V", line = 279)
    private class162() {
    }

    @OriginalMember(owner = "client!cr", name = "<init>", descriptor = "([I)V", line = 286)
    public class162(int[] arg0) {
        this.field2291 = new int[256];
        this.field2296 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field2296[var2] = arg0[var2];
        }
        this.method1150(false);
    }
}
