import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public class class264 {

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "[I")
    private int[] field4021;

    @OriginalMember(owner = "client!ao", name = "e", descriptor = "[I")
    private int[] field4025;

    @OriginalMember(owner = "client!ao", name = "d", descriptor = "Lnn;")
    public static class151 field4024 = new class151("white:", "weiss:", "blanc:", "branco:");

    @OriginalMember(owner = "client!ao", name = "n", descriptor = "Lwl;")
    public static class452 field4034 = new class452(42, 10);

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "I")
    private int field4022;

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "I")
    public static int field4023;

    @OriginalMember(owner = "client!ao", name = "f", descriptor = "I")
    public static int field4026;

    @OriginalMember(owner = "client!ao", name = "g", descriptor = "I")
    public static int field4027;

    @OriginalMember(owner = "client!ao", name = "h", descriptor = "I")
    private int field4028;

    @OriginalMember(owner = "client!ao", name = "i", descriptor = "I")
    public static int field4029;

    @OriginalMember(owner = "client!ao", name = "j", descriptor = "I")
    private int field4030;

    @OriginalMember(owner = "client!ao", name = "k", descriptor = "I")
    public static int field4031;

    @OriginalMember(owner = "client!ao", name = "l", descriptor = "I")
    public static int field4032;

    @OriginalMember(owner = "client!ao", name = "m", descriptor = "I")
    private int field4033;

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(I)V")
    public static void method1634(int arg0) {
        if (arg0 <= 63) {
            method1634(122);
        }
        field4034 = null;
        field4024 = null;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(B)V")
    private final void method1635(byte arg0) {
        field4031++;
        if (arg0 != 27) {
            field4034 = null;
        }
        this.field4033 += ++this.field4028;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field4025[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field4030 ^= this.field4030 << 13;
                } else {
                    this.field4030 ^= this.field4030 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field4030 ^= this.field4030 << 2;
            } else {
                this.field4030 ^= this.field4030 >>> 16;
            }
            this.field4030 += this.field4025[var2 + 128 & 0xFF];
            int var4;
            this.field4025[var2] = var4 = this.field4025[class406.method2552(var3 >> 2, 255)] + this.field4030 + this.field4033;
            this.field4021[var2] = this.field4033 = this.field4025[class406.method2552(var4 >> 8, 1020) >> 2] + var3;
        }
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(B)I")
    public final int method1636(byte arg0) {
        if (arg0 != -39) {
            return 100;
        }
        field4027++;
        if (this.field4022 == 0) {
            this.method1635((byte) 27);
            this.field4022 = 256;
        }
        return this.field4021[--this.field4022];
    }

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "(B)I")
    public final int method1637(byte arg0) {
        field4026++;
        if (this.field4022 == 0) {
            this.method1635((byte) 27);
            this.field4022 = 256;
        }
        int var2 = 40 % ((arg0 - 16) / 53);
        return this.field4021[this.field4022 - 1];
    }

    @OriginalMember(owner = "client!ao", name = "<init>", descriptor = "()V")
    private class264() {
    }

    @OriginalMember(owner = "client!ao", name = "<init>", descriptor = "([I)V")
    public class264(int[] arg0) {
        this.field4021 = new int[256];
        this.field4025 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field4021[var2] = arg0[var2];
        }
        this.method1638(57);
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(I)V")
    private final void method1638(int arg0) {
        field4023++;
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
            int var63 = var6 + var61;
            int var64 = var62 ^ var7 >>> 2;
            int var65 = var5 + var64;
            int var66 = var7 + var63;
            int var67 = var66 ^ var63 << 8;
            int var68 = var4 + var67;
            int var69 = var63 + var65;
            var6 = var69 ^ var65 >>> 16;
            int var70 = var3 + var6;
            int var71 = var65 + var68;
            var5 = var71 ^ var68 << 10;
            int var72 = var68 + var70;
            int var73 = var2 + var5;
            var4 = var72 ^ var70 >>> 4;
            int var74 = var70 + var73;
            int var75 = var4 + var61;
            var3 = var74 ^ var73 << 8;
            int var76 = var73 + var75;
            var8 = var3 + var64;
            var2 = var76 ^ var75 >>> 9;
            var7 = var2 + var67;
            var9 = var8 + var75;
        }
        if (arg0 < 23) {
            this.method1637((byte) 50);
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field4021[var11 + 5] + var4;
            int var38 = this.field4021[var11 + 1] + var8;
            int var39 = this.field4021[var11 + 7] + var2;
            int var40 = this.field4021[var11] + var9;
            int var41 = this.field4021[var11 + 6] + var3;
            int var42 = this.field4021[var11 + 3] + var6;
            int var43 = this.field4021[var11 + 2] + var7;
            int var44 = this.field4021[var11 + 4] + var5;
            int var45 = var40 ^ var38 << 11;
            int var46 = var42 + var45;
            int var47 = var38 + var43;
            int var48 = var47 ^ var43 >>> 2;
            int var49 = var43 + var46;
            int var50 = var44 + var48;
            int var51 = var49 ^ var46 << 8;
            int var52 = var37 + var51;
            int var53 = var46 + var50;
            var6 = var53 ^ var50 >>> 16;
            int var54 = var6 + var41;
            int var55 = var50 + var52;
            var5 = var55 ^ var52 << 10;
            int var56 = var5 + var39;
            int var57 = var52 + var54;
            var4 = var57 ^ var54 >>> 4;
            int var58 = var4 + var45;
            int var59 = var54 + var56;
            var3 = var59 ^ var56 << 8;
            int var60 = var56 + var58;
            var8 = var3 + var48;
            var2 = var60 ^ var58 >>> 9;
            var7 = var2 + var51;
            var9 = var8 + var58;
            this.field4025[var11] = var9;
            this.field4025[var11 + 1] = var8;
            this.field4025[var11 + 2] = var7;
            this.field4025[var11 + 3] = var6;
            this.field4025[var11 + 4] = var5;
            this.field4025[var11 + 5] = var4;
            this.field4025[var11 + 6] = var3;
            this.field4025[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field4025[var12 + 4] + var5;
            int var14 = this.field4025[var12 + 7] + var2;
            int var15 = this.field4025[var12 + 2] + var7;
            int var16 = this.field4025[var12 + 5] + var4;
            int var17 = this.field4025[var12 + 6] + var3;
            int var18 = this.field4025[var12] + var9;
            int var19 = this.field4025[var12 + 1] + var8;
            int var20 = this.field4025[var12 + 3] + var6;
            int var21 = var18 ^ var19 << 11;
            int var22 = var15 + var19;
            int var23 = var20 + var21;
            int var24 = var22 ^ var15 >>> 2;
            int var25 = var13 + var24;
            int var26 = var15 + var23;
            int var27 = var26 ^ var23 << 8;
            int var28 = var23 + var25;
            int var29 = var16 + var27;
            var6 = var28 ^ var25 >>> 16;
            int var30 = var25 + var29;
            int var31 = var6 + var17;
            var5 = var30 ^ var29 << 10;
            int var32 = var5 + var14;
            int var33 = var29 + var31;
            var4 = var33 ^ var31 >>> 4;
            int var34 = var4 + var21;
            int var35 = var31 + var32;
            var3 = var35 ^ var32 << 8;
            var8 = var3 + var24;
            int var36 = var32 + var34;
            var2 = var36 ^ var34 >>> 9;
            var7 = var2 + var27;
            var9 = var8 + var34;
            this.field4025[var12] = var9;
            this.field4025[var12 + 1] = var8;
            this.field4025[var12 + 2] = var7;
            this.field4025[var12 + 3] = var6;
            this.field4025[var12 + 4] = var5;
            this.field4025[var12 + 5] = var4;
            this.field4025[var12 + 6] = var3;
            this.field4025[var12 + 7] = var2;
        }
        this.method1635((byte) 27);
        this.field4022 = 256;
    }
}
