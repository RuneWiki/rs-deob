import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class20 {

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "[I")
    private int[] field183;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "[I")
    private int[] field178;

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "[I")
    public static int[] field180 = new int[] { 3, 7, 15 };

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "[I")
    public static int[] field182 = new int[5];

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "I")
    private int field179;

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "I")
    private int field181;

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "I")
    public static int field184;

    @OriginalMember(owner = "client!ub", name = "h", descriptor = "I")
    public static int field185;

    @OriginalMember(owner = "client!ub", name = "i", descriptor = "I")
    public static int field186;

    @OriginalMember(owner = "client!ub", name = "j", descriptor = "I")
    public static int field187;

    @OriginalMember(owner = "client!ub", name = "k", descriptor = "I")
    private int field188;

    @OriginalMember(owner = "client!ub", name = "l", descriptor = "I")
    public static int field189;

    @OriginalMember(owner = "client!ub", name = "m", descriptor = "I")
    private int field190;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)V")
    private final void method89(byte arg0) {
        field186++;
        int var2 = -1640531527;
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;
        int var9 = -1640531527;
        int var10 = 0;
        if (arg0 < 8) {
            return;
        }
        while (var10 < 4) {
            int var61 = var9 ^ var8 << 11;
            int var62 = var7 + var8;
            int var63 = var6 + var61;
            int var64 = var62 ^ var7 >>> 2;
            int var65 = var7 + var63;
            int var66 = var5 + var64;
            int var67 = var65 ^ var63 << 8;
            int var68 = var4 + var67;
            int var69 = var63 + var66;
            var6 = var69 ^ var66 >>> 16;
            int var70 = var3 + var6;
            int var71 = var66 + var68;
            var5 = var71 ^ var68 << 10;
            int var72 = var68 + var70;
            int var73 = var2 + var5;
            var4 = var72 ^ var70 >>> 4;
            int var74 = var70 + var73;
            int var75 = var4 + var61;
            var3 = var74 ^ var73 << 8;
            var8 = var3 + var64;
            int var76 = var73 + var75;
            var2 = var76 ^ var75 >>> 9;
            var9 = var8 + var75;
            var7 = var2 + var67;
            var10++;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field183[var11 + 1] + var8;
            int var38 = this.field183[var11 + 6] + var3;
            int var39 = this.field183[var11 + 3] + var6;
            int var40 = this.field183[var11 + 2] + var7;
            int var41 = this.field183[var11 + 5] + var4;
            int var42 = this.field183[var11 + 7] + var2;
            int var43 = this.field183[var11] + var9;
            int var44 = this.field183[var11 + 4] + var5;
            int var45 = var43 ^ var37 << 11;
            int var46 = var37 + var40;
            int var47 = var39 + var45;
            int var48 = var46 ^ var40 >>> 2;
            int var49 = var44 + var48;
            int var50 = var40 + var47;
            int var51 = var50 ^ var47 << 8;
            int var52 = var47 + var49;
            int var53 = var41 + var51;
            var6 = var52 ^ var49 >>> 16;
            int var54 = var49 + var53;
            int var55 = var6 + var38;
            var5 = var54 ^ var53 << 10;
            int var56 = var5 + var42;
            int var57 = var53 + var55;
            var4 = var57 ^ var55 >>> 4;
            int var58 = var55 + var56;
            int var59 = var4 + var45;
            var3 = var58 ^ var56 << 8;
            int var60 = var56 + var59;
            var8 = var3 + var48;
            var2 = var60 ^ var59 >>> 9;
            var9 = var8 + var59;
            var7 = var2 + var51;
            this.field178[var11] = var9;
            this.field178[var11 + 1] = var8;
            this.field178[var11 + 2] = var7;
            this.field178[var11 + 3] = var6;
            this.field178[var11 + 4] = var5;
            this.field178[var11 + 5] = var4;
            this.field178[var11 + 6] = var3;
            this.field178[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field178[var12 + 7] + var2;
            int var14 = this.field178[var12 + 1] + var8;
            int var15 = this.field178[var12] + var9;
            int var16 = this.field178[var12 + 5] + var4;
            int var17 = this.field178[var12 + 6] + var3;
            int var18 = this.field178[var12 + 2] + var7;
            int var19 = this.field178[var12 + 3] + var6;
            int var20 = this.field178[var12 + 4] + var5;
            int var21 = var15 ^ var14 << 11;
            int var22 = var14 + var18;
            int var23 = var19 + var21;
            int var24 = var22 ^ var18 >>> 2;
            int var25 = var18 + var23;
            int var26 = var20 + var24;
            int var27 = var25 ^ var23 << 8;
            int var28 = var23 + var26;
            int var29 = var16 + var27;
            var6 = var28 ^ var26 >>> 16;
            int var30 = var6 + var17;
            int var31 = var26 + var29;
            var5 = var31 ^ var29 << 10;
            int var32 = var5 + var13;
            int var33 = var29 + var30;
            var4 = var33 ^ var30 >>> 4;
            int var34 = var4 + var21;
            int var35 = var30 + var32;
            var3 = var35 ^ var32 << 8;
            int var36 = var32 + var34;
            var8 = var3 + var24;
            var2 = var36 ^ var34 >>> 9;
            var9 = var8 + var34;
            var7 = var2 + var27;
            this.field178[var12] = var9;
            this.field178[var12 + 1] = var8;
            this.field178[var12 + 2] = var7;
            this.field178[var12 + 3] = var6;
            this.field178[var12 + 4] = var5;
            this.field178[var12 + 5] = var4;
            this.field178[var12 + 6] = var3;
            this.field178[var12 + 7] = var2;
        }
        this.method93(true);
        this.field188 = 256;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Z)I")
    public final int method90(boolean arg0) {
        if (arg0) {
            this.field181 = 83;
        }
        if (this.field188 == 0) {
            this.method93(true);
            this.field188 = 256;
        }
        field184++;
        return this.field183[this.field188 - 1];
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(B)V")
    public static void method91(byte arg0) {
        int var1 = 111 / ((-arg0 - 18) / 42);
        field182 = null;
        field180 = null;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(III)Z")
    public static final boolean method92(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            field182 = null;
        }
        field187++;
        return (arg0 & 0x70000) != 0 | class595.method3395(arg2, arg0, (byte) 109) || class713.method3987(arg0, 4, arg2);
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(Z)V")
    private final void method93(boolean arg0) {
        field185++;
        this.field181 += ++this.field190;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field178[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field179 ^= this.field179 << 13;
                } else {
                    this.field179 ^= this.field179 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field179 ^= this.field179 << 2;
            } else {
                this.field179 ^= this.field179 >>> 16;
            }
            this.field179 += this.field178[var2 + 128 & 0xFF];
            int var4;
            this.field178[var2] = var4 = this.field179 + this.field178[class327.method1956(var3 >> 2, 255)] + this.field181;
            this.field183[var2] = this.field181 = var3 + this.field178[class327.method1956(261263, var4) >> 8 >> 2];
        }
        if (!arg0) {
            this.method89((byte) 46);
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)I")
    public final int method94(int arg0) {
        field189++;
        if (arg0 != -5583) {
            return 37;
        }
        if (this.field188 == 0) {
            this.method93(true);
            this.field188 = 256;
        }
        return this.field183[--this.field188];
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "()V")
    private class20() {
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "([I)V")
    public class20(int[] arg0) {
        this.field183 = new int[256];
        this.field178 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field183[var2] = arg0[var2];
        }
        this.method89((byte) 111);
    }
}
