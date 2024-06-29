import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ku")
public class class377 {

    @OriginalMember(owner = "client!ku", name = "h", descriptor = "[I")
    private int[] field5339;

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "[I")
    private int[] field5332;

    @OriginalMember(owner = "client!ku", name = "b", descriptor = "I")
    public static int field5333 = 0;

    @OriginalMember(owner = "client!ku", name = "j", descriptor = "Luw;")
    public static class418 field5341 = new class418("", 16);

    @OriginalMember(owner = "client!ku", name = "c", descriptor = "I")
    private int field5334;

    @OriginalMember(owner = "client!ku", name = "d", descriptor = "I")
    private int field5335;

    @OriginalMember(owner = "client!ku", name = "e", descriptor = "I")
    private int field5336;

    @OriginalMember(owner = "client!ku", name = "f", descriptor = "I")
    private int field5337;

    @OriginalMember(owner = "client!ku", name = "g", descriptor = "I")
    public static int field5338;

    @OriginalMember(owner = "client!ku", name = "i", descriptor = "I")
    public static int field5340;

    @OriginalMember(owner = "client!ku", name = "k", descriptor = "I")
    public static int field5342;

    @OriginalMember(owner = "client!ku", name = "l", descriptor = "I")
    public static int field5343;

    @OriginalMember(owner = "client!ku", name = "m", descriptor = "I")
    public static int field5344;

    @OriginalMember(owner = "client!ku", name = "n", descriptor = "I")
    public static int field5345;

    @OriginalMember(owner = "client!ku", name = "o", descriptor = "[I")
    public static int[] field5346;

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(III)Z", line = 8)
    public static final boolean method2377(int arg0, int arg1, int arg2) {
        field5340++;
        if (arg2 != 65536) {
            method2381(-106, -24, 57);
        }
        boolean var3 = (arg0 & 0x37) == 0 ? class582.method3336(arg1, arg0, (byte) 111) : class646.method3670(arg1, arg0, -7);
        return var3 | class497.method2931(arg1, arg0, arg2 ^ 0x1003D) | (arg1 & 0x10000) != 0;
    }

    @OriginalMember(owner = "client!ku", name = "<init>", descriptor = "()V", line = 32)
    private class377() {
    }

    @OriginalMember(owner = "client!ku", name = "<init>", descriptor = "([I)V", line = 34)
    public class377(int[] arg0) {
        this.field5339 = new int[256];
        this.field5332 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field5332[var2] = arg0[var2];
        }
        this.method2378(-94);
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(I)V", line = 55)
    private final void method2378(int arg0) {
        field5345++;
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
            int var69 = var4 + var67;
            var6 = var68 ^ var65 >>> 16;
            int var70 = var3 + var6;
            int var71 = var65 + var69;
            var5 = var71 ^ var69 << 10;
            int var72 = var69 + var70;
            int var73 = var2 + var5;
            var4 = var72 ^ var70 >>> 4;
            int var74 = var4 + var61;
            int var75 = var70 + var73;
            var3 = var75 ^ var73 << 8;
            var8 = var3 + var64;
            int var76 = var73 + var74;
            var2 = var76 ^ var74 >>> 9;
            var9 = var8 + var74;
            var7 = var2 + var67;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field5332[var11 + 2] + var7;
            int var38 = this.field5332[var11 + 7] + var2;
            int var39 = this.field5332[var11 + 3] + var6;
            int var40 = this.field5332[var11 + 5] + var4;
            int var41 = this.field5332[var11 + 6] + var3;
            int var42 = this.field5332[var11 + 1] + var8;
            int var43 = this.field5332[var11 + 4] + var5;
            int var44 = this.field5332[var11] + var9;
            int var45 = var44 ^ var42 << 11;
            int var46 = var37 + var42;
            int var47 = var39 + var45;
            int var48 = var46 ^ var37 >>> 2;
            int var49 = var37 + var47;
            int var50 = var43 + var48;
            int var51 = var49 ^ var47 << 8;
            int var52 = var40 + var51;
            int var53 = var47 + var50;
            var6 = var53 ^ var50 >>> 16;
            int var54 = var6 + var41;
            int var55 = var50 + var52;
            var5 = var55 ^ var52 << 10;
            int var56 = var5 + var38;
            int var57 = var52 + var54;
            var4 = var57 ^ var54 >>> 4;
            int var58 = var54 + var56;
            int var59 = var4 + var45;
            var3 = var58 ^ var56 << 8;
            int var60 = var56 + var59;
            var8 = var3 + var48;
            var2 = var60 ^ var59 >>> 9;
            var7 = var2 + var51;
            var9 = var8 + var59;
            this.field5339[var11] = var9;
            this.field5339[var11 + 1] = var8;
            this.field5339[var11 + 2] = var7;
            this.field5339[var11 + 3] = var6;
            this.field5339[var11 + 4] = var5;
            this.field5339[var11 + 5] = var4;
            this.field5339[var11 + 6] = var3;
            this.field5339[var11 + 7] = var2;
        }
        int var12 = 0;
        if (arg0 > -72) {
            this.field5339 = null;
        }
        while (var12 < 256) {
            int var13 = this.field5339[var12 + 2] + var7;
            int var14 = this.field5339[var12 + 3] + var6;
            int var15 = this.field5339[var12 + 7] + var2;
            int var16 = this.field5339[var12 + 5] + var4;
            int var17 = this.field5339[var12 + 1] + var8;
            int var18 = this.field5339[var12 + 6] + var3;
            int var19 = this.field5339[var12] + var9;
            int var20 = this.field5339[var12 + 4] + var5;
            int var21 = var19 ^ var17 << 11;
            int var22 = var14 + var21;
            int var23 = var13 + var17;
            int var24 = var23 ^ var13 >>> 2;
            int var25 = var20 + var24;
            int var26 = var13 + var22;
            int var27 = var26 ^ var22 << 8;
            int var28 = var16 + var27;
            int var29 = var22 + var25;
            var6 = var29 ^ var25 >>> 16;
            int var30 = var6 + var18;
            int var31 = var25 + var28;
            var5 = var31 ^ var28 << 10;
            int var32 = var28 + var30;
            int var33 = var5 + var15;
            var4 = var32 ^ var30 >>> 4;
            int var34 = var30 + var33;
            int var35 = var4 + var21;
            var3 = var34 ^ var33 << 8;
            var8 = var3 + var24;
            int var36 = var33 + var35;
            var2 = var36 ^ var35 >>> 9;
            var7 = var2 + var27;
            var9 = var8 + var35;
            this.field5339[var12] = var9;
            this.field5339[var12 + 1] = var8;
            this.field5339[var12 + 2] = var7;
            this.field5339[var12 + 3] = var6;
            this.field5339[var12 + 4] = var5;
            this.field5339[var12 + 5] = var4;
            this.field5339[var12 + 6] = var3;
            this.field5339[var12 + 7] = var2;
            var12 += 8;
        }
        this.method2380(false);
        this.field5335 = 256;
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(B)I", line = 202)
    public final int method2379(byte arg0) {
        field5343++;
        if (this.field5335 == 0) {
            this.method2380(false);
            this.field5335 = 256;
        }
        return arg0 <= 12 ? 116 : this.field5332[this.field5335 - 1];
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(Z)V", line = 219)
    private final void method2380(boolean arg0) {
        field5344++;
        this.field5334 += ++this.field5337;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field5339[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field5336 ^= this.field5336 << 13;
                } else {
                    this.field5336 ^= this.field5336 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field5336 ^= this.field5336 << 2;
            } else {
                this.field5336 ^= this.field5336 >>> 16;
            }
            this.field5336 += this.field5339[var2 + 128 & 0xFF];
            int var4;
            this.field5339[var2] = var4 = this.field5339[class263.method1762(255, var3 >> 2)] - (-this.field5336 - this.field5334);
            this.field5332[var2] = this.field5334 = var3 + this.field5339[class263.method1762(261268, var4) >> 8 >> 2];
        }
        if (arg0) {
            method2377(-33, -56, 52);
        }
    }

    @OriginalMember(owner = "client!ku", name = "b", descriptor = "(III)Z", line = 261)
    public static final boolean method2381(int arg0, int arg1, int arg2) {
        if (arg1 == 0) {
            field5342++;
            return (arg2 & 0x400) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ku", name = "b", descriptor = "(B)I", line = 272)
    public final int method2382(byte arg0) {
        if (this.field5335 == 0) {
            this.method2380(false);
            this.field5335 = 256;
        }
        field5338++;
        if (arg0 >= -47) {
            this.method2380(false);
        }
        return this.field5332[--this.field5335];
    }

    @OriginalMember(owner = "client!ku", name = "b", descriptor = "(I)V", line = 289)
    public static void method2383(int arg0) {
        field5346 = null;
        if (arg0 != 1) {
            field5333 = 114;
        }
        field5341 = null;
    }
}
