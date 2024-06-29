import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bv")
public class class277 {

    @OriginalMember(owner = "client!bv", name = "c", descriptor = "[I")
    private int[] field3880;

    @OriginalMember(owner = "client!bv", name = "l", descriptor = "[I")
    private int[] field3889;

    @OriginalMember(owner = "client!bv", name = "k", descriptor = "[I")
    public static int[] field3888 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "I")
    private int field3878;

    @OriginalMember(owner = "client!bv", name = "b", descriptor = "I")
    private int field3879;

    @OriginalMember(owner = "client!bv", name = "d", descriptor = "I")
    public static int field3881;

    @OriginalMember(owner = "client!bv", name = "f", descriptor = "I")
    private int field3883;

    @OriginalMember(owner = "client!bv", name = "g", descriptor = "I")
    public static int field3884;

    @OriginalMember(owner = "client!bv", name = "h", descriptor = "I")
    public static int field3885;

    @OriginalMember(owner = "client!bv", name = "i", descriptor = "I")
    public static int field3886;

    @OriginalMember(owner = "client!bv", name = "j", descriptor = "I")
    public static int field3887;

    @OriginalMember(owner = "client!bv", name = "m", descriptor = "I")
    private int field3890;

    @OriginalMember(owner = "client!bv", name = "e", descriptor = "Le;")
    public static class489 field3882;

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(B)V", line = 9)
    public static void method1679(byte arg0) {
        field3882 = null;
        if (arg0 <= 4) {
            method1679((byte) 102);
        }
        field3888 = null;
    }

    @OriginalMember(owner = "client!bv", name = "b", descriptor = "(B)V", line = 22)
    private final void method1680(byte arg0) {
        if (arg0 != 115) {
            this.field3889 = null;
        }
        field3886++;
        this.field3878 += ++this.field3890;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field3889[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field3879 ^= this.field3879 << 13;
                } else {
                    this.field3879 ^= this.field3879 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field3879 ^= this.field3879 << 2;
            } else {
                this.field3879 ^= this.field3879 >>> 16;
            }
            this.field3879 += this.field3889[var2 + 128 & 0xFF];
            int var4;
            this.field3889[var2] = var4 = this.field3878 + this.field3879 + this.field3889[class249.method1537(1020, var3) >> 2];
            this.field3880[var2] = this.field3878 = this.field3889[class249.method1537(var4 >> 8 >> 2, 255)] + var3;
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(I)V", line = 64)
    private final void method1681(int arg0) {
        field3887++;
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
            int var70 = var3 + var6;
            int var71 = var65 + var68;
            var5 = var71 ^ var68 << 10;
            int var72 = var68 + var70;
            int var73 = var2 + var5;
            var4 = var72 ^ var70 >>> 4;
            int var74 = var4 + var61;
            int var75 = var70 + var73;
            var3 = var75 ^ var73 << 8;
            int var76 = var73 + var74;
            var8 = var3 + var64;
            var2 = var76 ^ var74 >>> 9;
            var7 = var2 + var67;
            var9 = var8 + var74;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field3880[var11 + 4] + var5;
            int var38 = this.field3880[var11 + 1] + var8;
            int var39 = this.field3880[var11] + var9;
            int var40 = this.field3880[var11 + 3] + var6;
            int var41 = this.field3880[var11 + 7] + var2;
            int var42 = this.field3880[var11 + 2] + var7;
            int var43 = this.field3880[var11 + 6] + var3;
            int var44 = this.field3880[var11 + 5] + var4;
            int var45 = var39 ^ var38 << 11;
            int var46 = var40 + var45;
            int var47 = var38 + var42;
            int var48 = var47 ^ var42 >>> 2;
            int var49 = var37 + var48;
            int var50 = var42 + var46;
            int var51 = var50 ^ var46 << 8;
            int var52 = var46 + var49;
            int var53 = var44 + var51;
            var6 = var52 ^ var49 >>> 16;
            int var54 = var49 + var53;
            int var55 = var6 + var43;
            var5 = var54 ^ var53 << 10;
            int var56 = var5 + var41;
            int var57 = var53 + var55;
            var4 = var57 ^ var55 >>> 4;
            int var58 = var4 + var45;
            int var59 = var55 + var56;
            var3 = var59 ^ var56 << 8;
            var8 = var3 + var48;
            int var60 = var56 + var58;
            var2 = var60 ^ var58 >>> 9;
            var7 = var2 + var51;
            var9 = var8 + var58;
            this.field3889[var11] = var9;
            this.field3889[var11 + 1] = var8;
            this.field3889[var11 + 2] = var7;
            this.field3889[var11 + 3] = var6;
            this.field3889[var11 + 4] = var5;
            this.field3889[var11 + 5] = var4;
            this.field3889[var11 + 6] = var3;
            this.field3889[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field3889[var12 + 3] + var6;
            int var14 = this.field3889[var12 + 6] + var3;
            int var15 = this.field3889[var12 + 5] + var4;
            int var16 = this.field3889[var12] + var9;
            int var17 = this.field3889[var12 + 2] + var7;
            int var18 = this.field3889[var12 + 7] + var2;
            int var19 = this.field3889[var12 + 4] + var5;
            int var20 = this.field3889[var12 + 1] + var8;
            int var21 = var16 ^ var20 << 11;
            int var22 = var13 + var21;
            int var23 = var17 + var20;
            int var24 = var23 ^ var17 >>> 2;
            int var25 = var19 + var24;
            int var26 = var17 + var22;
            int var27 = var26 ^ var22 << 8;
            int var28 = var22 + var25;
            int var29 = var15 + var27;
            var6 = var28 ^ var25 >>> 16;
            int var30 = var25 + var29;
            int var31 = var6 + var14;
            var5 = var30 ^ var29 << 10;
            int var32 = var29 + var31;
            int var33 = var5 + var18;
            var4 = var32 ^ var31 >>> 4;
            int var34 = var31 + var33;
            int var35 = var4 + var21;
            var3 = var34 ^ var33 << 8;
            var8 = var3 + var24;
            int var36 = var33 + var35;
            var2 = var36 ^ var35 >>> 9;
            var9 = var8 + var35;
            var7 = var2 + var27;
            this.field3889[var12] = var9;
            this.field3889[var12 + 1] = var8;
            this.field3889[var12 + 2] = var7;
            this.field3889[var12 + 3] = var6;
            this.field3889[var12 + 4] = var5;
            this.field3889[var12 + 5] = var4;
            this.field3889[var12 + 6] = var3;
            this.field3889[var12 + 7] = var2;
        }
        this.method1680((byte) 115);
        this.field3883 = 256;
        if (arg0 != -270160725) {
            this.field3878 = 41;
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(Z)I", line = 212)
    public final int method1682(boolean arg0) {
        field3881++;
        if (this.field3883 == 0) {
            this.method1680((byte) 115);
            this.field3883 = 256;
        }
        if (arg0) {
            this.method1680((byte) -56);
        }
        return this.field3880[--this.field3883];
    }

    @OriginalMember(owner = "client!bv", name = "b", descriptor = "(Z)I", line = 230)
    public final int method1683(boolean arg0) {
        if (this.field3883 == 0) {
            this.method1680((byte) 115);
            this.field3883 = 256;
        }
        field3885++;
        if (arg0) {
            this.method1680((byte) 72);
        }
        return this.field3880[this.field3883 - 1];
    }

    @OriginalMember(owner = "client!bv", name = "<init>", descriptor = "()V", line = 254)
    private class277() {
    }

    @OriginalMember(owner = "client!bv", name = "<init>", descriptor = "([I)V", line = 260)
    public class277(int[] arg0) {
        this.field3880 = new int[256];
        this.field3889 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field3880[var2] = arg0[var2];
        }
        this.method1681(-270160725);
    }
}
