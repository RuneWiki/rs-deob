import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class128 {

    @OriginalMember(owner = "client!om", name = "k", descriptor = "[I")
    private int[] field1704;

    @OriginalMember(owner = "client!om", name = "l", descriptor = "[I")
    private int[] field1705;

    @OriginalMember(owner = "client!om", name = "g", descriptor = "F")
    public static float field1700 = 0.0F;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "I")
    public static int field1694;

    @OriginalMember(owner = "client!om", name = "b", descriptor = "I")
    public static int field1695;

    @OriginalMember(owner = "client!om", name = "c", descriptor = "I")
    private int field1696;

    @OriginalMember(owner = "client!om", name = "e", descriptor = "I")
    public static int field1698;

    @OriginalMember(owner = "client!om", name = "f", descriptor = "I")
    public static int field1699;

    @OriginalMember(owner = "client!om", name = "h", descriptor = "I")
    private int field1701;

    @OriginalMember(owner = "client!om", name = "i", descriptor = "I")
    public static int field1702;

    @OriginalMember(owner = "client!om", name = "m", descriptor = "I")
    private int field1706;

    @OriginalMember(owner = "client!om", name = "o", descriptor = "I")
    private int field1708;

    @OriginalMember(owner = "client!om", name = "n", descriptor = "Lqj;")
    public static class238 field1707;

    @OriginalMember(owner = "client!om", name = "d", descriptor = "[S")
    public static short[] field1697;

    @OriginalMember(owner = "client!om", name = "j", descriptor = "[[[I")
    public static int[][][] field1703;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Z)V")
    public static void method870(boolean arg0) {
        field1707 = null;
        field1697 = null;
        if (arg0) {
            method870(false);
        }
        field1703 = null;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(II)I")
    public static int method871(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(I)V")
    private final void method872(int arg0) {
        field1694++;
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
            int var66 = var5 + var64;
            int var67 = var65 ^ var62 << 8;
            int var68 = var62 + var66;
            int var69 = var4 + var67;
            var6 = var68 ^ var66 >>> 16;
            int var70 = var3 + var6;
            int var71 = var66 + var69;
            var5 = var71 ^ var69 << 10;
            int var72 = var2 + var5;
            int var73 = var69 + var70;
            var4 = var73 ^ var70 >>> 4;
            int var74 = var70 + var72;
            int var75 = var4 + var61;
            var3 = var74 ^ var72 << 8;
            int var76 = var72 + var75;
            var8 = var3 + var64;
            var2 = var76 ^ var75 >>> 9;
            var9 = var8 + var75;
            var7 = var2 + var67;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field1704[var11 + 3] + var6;
            int var38 = this.field1704[var11 + 6] + var3;
            int var39 = this.field1704[var11 + 4] + var5;
            int var40 = this.field1704[var11 + 5] + var4;
            int var41 = this.field1704[var11 + 7] + var2;
            int var42 = this.field1704[var11 + 2] + var7;
            int var43 = this.field1704[var11] + var9;
            int var44 = this.field1704[var11 + 1] + var8;
            int var45 = var43 ^ var44 << 11;
            int var46 = var37 + var45;
            int var47 = var42 + var44;
            int var48 = var47 ^ var42 >>> 2;
            int var49 = var39 + var48;
            int var50 = var42 + var46;
            int var51 = var50 ^ var46 << 8;
            int var52 = var46 + var49;
            int var53 = var40 + var51;
            var6 = var52 ^ var49 >>> 16;
            int var54 = var49 + var53;
            int var55 = var6 + var38;
            var5 = var54 ^ var53 << 10;
            int var56 = var53 + var55;
            int var57 = var5 + var41;
            var4 = var56 ^ var55 >>> 4;
            int var58 = var4 + var45;
            int var59 = var55 + var57;
            var3 = var59 ^ var57 << 8;
            int var60 = var57 + var58;
            var8 = var3 + var48;
            var2 = var60 ^ var58 >>> 9;
            var9 = var8 + var58;
            var7 = var2 + var51;
            this.field1705[var11] = var9;
            this.field1705[var11 + 1] = var8;
            this.field1705[var11 + 2] = var7;
            this.field1705[var11 + 3] = var6;
            this.field1705[var11 + 4] = var5;
            this.field1705[var11 + 5] = var4;
            this.field1705[var11 + 6] = var3;
            this.field1705[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field1705[var12 + 1] + var8;
            int var14 = this.field1705[var12 + 6] + var3;
            int var15 = this.field1705[var12 + 7] + var2;
            int var16 = this.field1705[var12] + var9;
            int var17 = this.field1705[var12 + 3] + var6;
            int var18 = this.field1705[var12 + 4] + var5;
            int var19 = this.field1705[var12 + 2] + var7;
            int var20 = this.field1705[var12 + 5] + var4;
            int var21 = var16 ^ var13 << 11;
            int var22 = var13 + var19;
            int var23 = var17 + var21;
            int var24 = var22 ^ var19 >>> 2;
            int var25 = var18 + var24;
            int var26 = var19 + var23;
            int var27 = var26 ^ var23 << 8;
            int var28 = var23 + var25;
            int var29 = var20 + var27;
            var6 = var28 ^ var25 >>> 16;
            int var30 = var6 + var14;
            int var31 = var25 + var29;
            var5 = var31 ^ var29 << 10;
            int var32 = var29 + var30;
            int var33 = var5 + var15;
            var4 = var32 ^ var30 >>> 4;
            int var34 = var30 + var33;
            int var35 = var4 + var21;
            var3 = var34 ^ var33 << 8;
            int var36 = var33 + var35;
            var8 = var3 + var24;
            var2 = var36 ^ var35 >>> 9;
            var9 = var8 + var35;
            var7 = var2 + var27;
            this.field1705[var12] = var9;
            this.field1705[var12 + 1] = var8;
            this.field1705[var12 + 2] = var7;
            this.field1705[var12 + 3] = var6;
            this.field1705[var12 + 4] = var5;
            this.field1705[var12 + 5] = var4;
            this.field1705[var12 + 6] = var3;
            this.field1705[var12 + 7] = var2;
        }
        if (arg0 == -2) {
            this.method875(25266);
            this.field1706 = 256;
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(B)I")
    public final int method873(byte arg0) {
        int var2 = -30 % ((arg0 - 14) / 50);
        if ((this.field1706--) == 0) {
            this.method875(25266);
            this.field1706 = 255;
        }
        field1702++;
        return this.field1704[this.field1706];
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method874(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg3 != 256) {
            field1700 = 1.2923709F;
        }
        if (class203.field2942 <= arg6 && arg2 <= class297.field4268 && class180.field2375 <= arg0 && arg7 <= class50.field695) {
            class367.method2421(arg5, arg4, arg0, arg2, arg6, 122, arg1, arg7);
        } else {
            class115.method800(arg1, arg7, -1, arg4, arg6, arg0, arg2, arg5);
        }
        field1695++;
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(I)V")
    private final void method875(int arg0) {
        field1698++;
        this.field1696 += ++this.field1701;
        int var2 = 0;
        if (arg0 != 25266) {
            return;
        }
        while (var2 < 256) {
            int var3 = this.field1705[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field1708 ^= this.field1708 << 13;
                } else {
                    this.field1708 ^= this.field1708 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field1708 ^= this.field1708 << 2;
            } else {
                this.field1708 ^= this.field1708 >>> 16;
            }
            this.field1708 += this.field1705[var2 + 128 & 0xFF];
            int var4;
            this.field1705[var2] = var4 = this.field1705[class401.method2606(var3 >> 2, 255)] + this.field1708 + this.field1696;
            this.field1704[var2] = this.field1696 = var3 + this.field1705[class401.method2606(var4 >> 8, 1020) >> 2];
            var2++;
        }
    }

    @OriginalMember(owner = "client!om", name = "<init>", descriptor = "()V")
    private class128() {
    }

    @OriginalMember(owner = "client!om", name = "<init>", descriptor = "([I)V")
    public class128(int[] arg0) {
        this.field1704 = new int[256];
        this.field1705 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field1704[var2] = arg0[var2];
        }
        this.method872(-2);
    }
}
