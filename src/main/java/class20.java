import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class20 {

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "[I")
    private int[] field326;

    @OriginalMember(owner = "client!ak", name = "j", descriptor = "[I")
    private int[] field333;

    @OriginalMember(owner = "client!ak", name = "m", descriptor = "[I")
    public static int[] field336 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "Llm;")
    public static class150 field327 = new class150(16);

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "I")
    public static int field324;

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "I")
    public static int field325;

    @OriginalMember(owner = "client!ak", name = "f", descriptor = "I")
    private int field329;

    @OriginalMember(owner = "client!ak", name = "g", descriptor = "I")
    public static int field330;

    @OriginalMember(owner = "client!ak", name = "h", descriptor = "I")
    public static int field331;

    @OriginalMember(owner = "client!ak", name = "i", descriptor = "I")
    public static int field332;

    @OriginalMember(owner = "client!ak", name = "k", descriptor = "I")
    private int field334;

    @OriginalMember(owner = "client!ak", name = "l", descriptor = "I")
    private int field335;

    @OriginalMember(owner = "client!ak", name = "n", descriptor = "I")
    public static int field337;

    @OriginalMember(owner = "client!ak", name = "o", descriptor = "I")
    public static int field338;

    @OriginalMember(owner = "client!ak", name = "p", descriptor = "I")
    private int field339;

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "[I")
    public static int[] field328;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(BI)I")
    public static final int method131(byte arg0, int arg1) {
        if (arg0 <= 7) {
            method133(124, 85, (byte) 34);
        }
        field331++;
        if (arg1 > 0) {
            return 1;
        } else if (arg1 < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(B)V")
    public static void method132(byte arg0) {
        field328 = null;
        int var1 = 61 % ((-arg0 - 10) / 52);
        field327 = null;
        field336 = null;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIB)I")
    public static final int method133(int arg0, int arg1, byte arg2) {
        if (arg2 != -13) {
            return -120;
        }
        field337++;
        int var3 = class34.method232((byte) 16, arg0 - 1, arg1 + -1) + class34.method232((byte) 104, arg0 + 1, arg1 + -1) + class34.method232((byte) 35, arg0 + -1, arg1 + 1) + class34.method232((byte) 82, arg0 + 1, arg1 + 1);
        int var4 = class34.method232((byte) 41, arg0 - 1, arg1) - (-class34.method232((byte) 117, arg0 + 1, arg1) - class34.method232((byte) 34, arg0, arg1 - 1)) + class34.method232((byte) 68, arg0, arg1 - -1);
        int var5 = class34.method232((byte) 27, arg0, arg1);
        return var3 / 16 + var5 / 4 + (var4 / 8);
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Z)I")
    public final int method134(boolean arg0) {
        if ((this.field334--) == 0) {
            this.method137((byte) -115);
            this.field334 = 255;
        }
        if (!arg0) {
            method136((byte) -73, (int[][]) null);
        }
        field330++;
        return this.field326[this.field334];
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(I)V")
    private final void method135(int arg0) {
        field332++;
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
            int var63 = var62 ^ var7 >>> 2;
            int var64 = var6 + var61;
            int var65 = var7 + var64;
            int var66 = var65 ^ var64 << 8;
            int var67 = var5 + var63;
            int var68 = var64 + var67;
            var6 = var68 ^ var67 >>> 16;
            int var69 = var4 + var66;
            int var70 = var3 + var6;
            int var71 = var67 + var69;
            var5 = var71 ^ var69 << 10;
            int var72 = var69 + var70;
            var4 = var72 ^ var70 >>> 4;
            int var73 = var4 + var61;
            int var74 = var2 + var5;
            int var75 = var70 + var74;
            var3 = var75 ^ var74 << 8;
            int var76 = var73 + var74;
            var2 = var76 ^ var73 >>> 9;
            var7 = var2 + var66;
            var8 = var3 + var63;
            var9 = var8 + var73;
        }
        if (arg0 <= 79) {
            this.method137((byte) -80);
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field326[var11 + 7] + var2;
            int var38 = this.field326[var11 + 6] + var3;
            int var39 = this.field326[var11 + 5] + var4;
            int var40 = this.field326[var11] + var9;
            int var41 = this.field326[var11 + 3] + var6;
            int var42 = this.field326[var11 + 1] + var8;
            int var43 = this.field326[var11 + 4] + var5;
            int var44 = var40 ^ var42 << 11;
            int var45 = this.field326[var11 + 2] + var7;
            int var46 = var41 + var44;
            int var47 = var42 + var45;
            int var48 = var47 ^ var45 >>> 2;
            int var49 = var43 + var48;
            int var50 = var45 + var46;
            int var51 = var50 ^ var46 << 8;
            int var52 = var46 + var49;
            int var53 = var39 + var51;
            var6 = var52 ^ var49 >>> 16;
            int var54 = var49 + var53;
            var5 = var54 ^ var53 << 10;
            int var55 = var6 + var38;
            int var56 = var5 + var37;
            int var57 = var53 + var55;
            var4 = var57 ^ var55 >>> 4;
            int var58 = var55 + var56;
            var3 = var58 ^ var56 << 8;
            int var59 = var4 + var44;
            int var60 = var56 + var59;
            var2 = var60 ^ var59 >>> 9;
            var7 = var2 + var51;
            var8 = var3 + var48;
            var9 = var8 + var59;
            this.field333[var11] = var9;
            this.field333[var11 + 1] = var8;
            this.field333[var11 + 2] = var7;
            this.field333[var11 + 3] = var6;
            this.field333[var11 + 4] = var5;
            this.field333[var11 + 5] = var4;
            this.field333[var11 + 6] = var3;
            this.field333[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field333[var12 + 3] + var6;
            int var14 = this.field333[var12 + 1] + var8;
            int var15 = this.field333[var12 + 4] + var5;
            int var16 = this.field333[var12 + 6] + var3;
            int var17 = this.field333[var12 + 5] + var4;
            int var18 = this.field333[var12 + 2] + var7;
            int var19 = this.field333[var12] + var9;
            int var20 = this.field333[var12 + 7] + var2;
            int var21 = var19 ^ var14 << 11;
            int var22 = var14 + var18;
            int var23 = var13 + var21;
            int var24 = var22 ^ var18 >>> 2;
            int var25 = var15 + var24;
            int var26 = var18 + var23;
            int var27 = var26 ^ var23 << 8;
            int var28 = var17 + var27;
            int var29 = var23 + var25;
            var6 = var29 ^ var25 >>> 16;
            int var30 = var6 + var16;
            int var31 = var25 + var28;
            var5 = var31 ^ var28 << 10;
            int var32 = var28 + var30;
            int var33 = var5 + var20;
            var4 = var32 ^ var30 >>> 4;
            int var34 = var30 + var33;
            var3 = var34 ^ var33 << 8;
            var8 = var3 + var24;
            int var35 = var4 + var21;
            int var36 = var33 + var35;
            var2 = var36 ^ var35 >>> 9;
            var9 = var8 + var35;
            this.field333[var12] = var9;
            var7 = var2 + var27;
            this.field333[var12 + 1] = var8;
            this.field333[var12 + 2] = var7;
            this.field333[var12 + 3] = var6;
            this.field333[var12 + 4] = var5;
            this.field333[var12 + 5] = var4;
            this.field333[var12 + 6] = var3;
            this.field333[var12 + 7] = var2;
        }
        this.method137((byte) -118);
        this.field334 = 256;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(B[[I)V")
    public static final void method136(byte arg0, int[][] arg1) {
        if (arg0 == 0) {
            class247.field3876 = arg1;
            field324++;
        }
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(B)V")
    private final void method137(byte arg0) {
        this.field329 += ++this.field335;
        field325++;
        if (arg0 > -88) {
            return;
        }
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field333[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field339 ^= this.field339 << 13;
                } else {
                    this.field339 ^= this.field339 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field339 ^= this.field339 << 2;
            } else {
                this.field339 ^= this.field339 >>> 16;
            }
            this.field339 += this.field333[var2 + 128 & 0xFF];
            int var4;
            this.field333[var2] = var4 = this.field339 + this.field329 + this.field333[class32.method199(255, var3 >> 2)];
            this.field326[var2] = this.field329 = this.field333[class32.method199(var4 >> 8 >> 2, 255)] + var3;
        }
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(Z)V")
    public static final void method138(boolean arg0) {
        field338++;
        field327.method944(-77);
        if (!arg0) {
            method136((byte) -70, (int[][]) null);
        }
        class70.field1020.method944(104);
    }

    @OriginalMember(owner = "client!ak", name = "<init>", descriptor = "()V")
    private class20() {
    }

    @OriginalMember(owner = "client!ak", name = "<init>", descriptor = "([I)V")
    public class20(int[] arg0) {
        this.field326 = new int[256];
        this.field333 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field326[var2] = arg0[var2];
        }
        this.method135(90);
    }
}
