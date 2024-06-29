import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pea")
public class class724 {

    @OriginalMember(owner = "client!pea", name = "h", descriptor = "[I")
    private int[] field10105;

    @OriginalMember(owner = "client!pea", name = "l", descriptor = "[I")
    private int[] field10109;

    @OriginalMember(owner = "client!pea", name = "e", descriptor = "Lsaa;")
    public static class326 field10102 = new class326("stellardawn", 1);

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "I")
    private int field10098;

    @OriginalMember(owner = "client!pea", name = "b", descriptor = "I")
    private int field10099;

    @OriginalMember(owner = "client!pea", name = "c", descriptor = "I")
    private int field10100;

    @OriginalMember(owner = "client!pea", name = "d", descriptor = "I")
    public static int field10101;

    @OriginalMember(owner = "client!pea", name = "f", descriptor = "I")
    private int field10103;

    @OriginalMember(owner = "client!pea", name = "i", descriptor = "I")
    public static int field10106;

    @OriginalMember(owner = "client!pea", name = "j", descriptor = "I")
    public static int field10107;

    @OriginalMember(owner = "client!pea", name = "k", descriptor = "I")
    public static int field10108;

    @OriginalMember(owner = "client!pea", name = "g", descriptor = "Lbg;")
    public static class464 field10104;

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(I)I", line = 4)
    public final int method4069(int arg0) {
        int var2 = 6 / ((55 - arg0) / 53);
        field10107++;
        if (this.field10098 == 0) {
            this.method4070(0);
            this.field10098 = 256;
        }
        return this.field10109[--this.field10098];
    }

    @OriginalMember(owner = "client!pea", name = "b", descriptor = "(I)V", line = 27)
    private final void method4070(int arg0) {
        field10106++;
        this.field10103 += ++this.field10100;
        for (int var2 = arg0; var2 < 256; var2++) {
            int var3 = this.field10105[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field10099 ^= this.field10099 << 13;
                } else {
                    this.field10099 ^= this.field10099 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field10099 ^= this.field10099 << 2;
            } else {
                this.field10099 ^= this.field10099 >>> 16;
            }
            this.field10099 += this.field10105[var2 + 128 & 0xFF];
            int var4;
            this.field10105[var2] = var4 = this.field10103 + this.field10099 + this.field10105[class286.method1877(1020, var3) >> 2];
            this.field10109[var2] = this.field10103 = var3 + this.field10105[class286.method1877(var4, 261282) >> 8 >> 2];
        }
    }

    @OriginalMember(owner = "client!pea", name = "c", descriptor = "(I)I", line = 66)
    public final int method4071(int arg0) {
        if (this.field10098 == 0) {
            this.method4070(arg0 ^ 0x100);
            this.field10098 = 256;
        }
        if (arg0 != 256) {
            field10102 = null;
        }
        field10101++;
        return this.field10109[this.field10098 - 1];
    }

    @OriginalMember(owner = "client!pea", name = "d", descriptor = "(I)V", line = 87)
    private final void method4072(int arg0) {
        field10108++;
        if (arg0 >= -91) {
            field10104 = null;
        }
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
            int var74 = var70 + var73;
            int var75 = var4 + var61;
            var3 = var74 ^ var73 << 8;
            var8 = var3 + var64;
            int var76 = var73 + var75;
            var2 = var76 ^ var75 >>> 9;
            var7 = var2 + var67;
            var9 = var8 + var75;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field10109[var11] + var9;
            int var38 = this.field10109[var11 + 6] + var3;
            int var39 = this.field10109[var11 + 3] + var6;
            int var40 = this.field10109[var11 + 2] + var7;
            int var41 = this.field10109[var11 + 5] + var4;
            int var42 = this.field10109[var11 + 4] + var5;
            int var43 = this.field10109[var11 + 7] + var2;
            int var44 = this.field10109[var11 + 1] + var8;
            int var45 = var37 ^ var44 << 11;
            int var46 = var39 + var45;
            int var47 = var40 + var44;
            int var48 = var47 ^ var40 >>> 2;
            int var49 = var42 + var48;
            int var50 = var40 + var46;
            int var51 = var50 ^ var46 << 8;
            int var52 = var41 + var51;
            int var53 = var46 + var49;
            var6 = var53 ^ var49 >>> 16;
            int var54 = var6 + var38;
            int var55 = var49 + var52;
            var5 = var55 ^ var52 << 10;
            int var56 = var52 + var54;
            int var57 = var5 + var43;
            var4 = var56 ^ var54 >>> 4;
            int var58 = var4 + var45;
            int var59 = var54 + var57;
            var3 = var59 ^ var57 << 8;
            int var60 = var57 + var58;
            var8 = var3 + var48;
            var2 = var60 ^ var58 >>> 9;
            var7 = var2 + var51;
            var9 = var8 + var58;
            this.field10105[var11] = var9;
            this.field10105[var11 + 1] = var8;
            this.field10105[var11 + 2] = var7;
            this.field10105[var11 + 3] = var6;
            this.field10105[var11 + 4] = var5;
            this.field10105[var11 + 5] = var4;
            this.field10105[var11 + 6] = var3;
            this.field10105[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field10105[var12 + 6] + var3;
            int var14 = this.field10105[var12 + 4] + var5;
            int var15 = this.field10105[var12 + 1] + var8;
            int var16 = this.field10105[var12 + 5] + var4;
            int var17 = this.field10105[var12] + var9;
            int var18 = this.field10105[var12 + 7] + var2;
            int var19 = this.field10105[var12 + 2] + var7;
            int var20 = this.field10105[var12 + 3] + var6;
            int var21 = var17 ^ var15 << 11;
            int var22 = var15 + var19;
            int var23 = var20 + var21;
            int var24 = var22 ^ var19 >>> 2;
            int var25 = var14 + var24;
            int var26 = var19 + var23;
            int var27 = var26 ^ var23 << 8;
            int var28 = var23 + var25;
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
            var8 = var3 + var24;
            int var36 = var32 + var35;
            var2 = var36 ^ var35 >>> 9;
            var9 = var8 + var35;
            var7 = var2 + var27;
            this.field10105[var12] = var9;
            this.field10105[var12 + 1] = var8;
            this.field10105[var12 + 2] = var7;
            this.field10105[var12 + 3] = var6;
            this.field10105[var12 + 4] = var5;
            this.field10105[var12 + 5] = var4;
            this.field10105[var12 + 6] = var3;
            this.field10105[var12 + 7] = var2;
        }
        this.method4070(0);
        this.field10098 = 256;
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(Z)V", line = 243)
    public static void method4073(boolean arg0) {
        field10102 = null;
        field10104 = null;
        if (arg0) {
            method4073(false);
        }
    }

    @OriginalMember(owner = "client!pea", name = "<init>", descriptor = "()V", line = 256)
    private class724() {
    }

    @OriginalMember(owner = "client!pea", name = "<init>", descriptor = "([I)V", line = 258)
    public class724(int[] arg0) {
        this.field10105 = new int[256];
        this.field10109 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field10109[var2] = arg0[var2];
        }
        this.method4072(-101);
    }
}
