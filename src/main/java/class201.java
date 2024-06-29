import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class201 {

    @OriginalMember(owner = "client!ta", name = "g", descriptor = "[I")
    private int[] field3554;

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "[I")
    private int[] field3549;

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "Ldj;")
    private static class44 field3550 = class89.method650(255, "Please try using a different world)3");

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "Ldj;")
    public static class44 field3548 = field3550;

    @OriginalMember(owner = "client!ta", name = "f", descriptor = "Ldj;")
    public static class44 field3553 = field3550;

    @OriginalMember(owner = "client!ta", name = "j", descriptor = "Ldj;")
    public static class44 field3557 = field3550;

    @OriginalMember(owner = "client!ta", name = "s", descriptor = "Ldj;")
    public static class44 field3566 = class89.method650(255, "Bitte warten Sie eine Minute");

    @OriginalMember(owner = "client!ta", name = "i", descriptor = "Ldj;")
    public static class44 field3556 = field3550;

    @OriginalMember(owner = "client!ta", name = "n", descriptor = "Ldj;")
    public static class44 field3561 = class89.method650(255, "Ung-Ultiger Benutzername");

    @OriginalMember(owner = "client!ta", name = "r", descriptor = "Ldj;")
    private static class44 field3565 = class89.method650(255, "RuneScape has been updated(Q");

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "Ldj;")
    public static class44 field3551 = field3550;

    @OriginalMember(owner = "client!ta", name = "x", descriptor = "[I")
    public static int[] field3571 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @OriginalMember(owner = "client!ta", name = "p", descriptor = "Ldj;")
    public static class44 field3563 = field3550;

    @OriginalMember(owner = "client!ta", name = "t", descriptor = "Ldj;")
    public static class44 field3567 = null;

    @OriginalMember(owner = "client!ta", name = "v", descriptor = "Ldj;")
    public static class44 field3569 = field3565;

    @OriginalMember(owner = "client!ta", name = "C", descriptor = "I")
    public static int field3575 = -1;

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "I")
    public static int field3552;

    @OriginalMember(owner = "client!ta", name = "k", descriptor = "I")
    private int field3558;

    @OriginalMember(owner = "client!ta", name = "l", descriptor = "I")
    private int field3559;

    @OriginalMember(owner = "client!ta", name = "m", descriptor = "I")
    private int field3560;

    @OriginalMember(owner = "client!ta", name = "u", descriptor = "I")
    public static int field3568;

    @OriginalMember(owner = "client!ta", name = "w", descriptor = "I")
    private int field3570;

    @OriginalMember(owner = "client!ta", name = "y", descriptor = "I")
    public static int field3572;

    @OriginalMember(owner = "client!ta", name = "z", descriptor = "I")
    public static int field3573;

    @OriginalMember(owner = "client!ta", name = "B", descriptor = "I")
    public static int field3574;

    @OriginalMember(owner = "client!ta", name = "h", descriptor = "Lnf;")
    public static class147 field3555;

    @OriginalMember(owner = "client!ta", name = "o", descriptor = "Lve;")
    public static class225 field3562;

    @OriginalMember(owner = "client!ta", name = "q", descriptor = "[[[B")
    public static byte[][][] field3564;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(I)V")
    private final void method1295(int arg0) {
        this.field3560 += ++this.field3558;
        field3568++;
        if (arg0 != -2081550110) {
            return;
        }
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field3554[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field3559 ^= this.field3559 << 13;
                } else {
                    this.field3559 ^= this.field3559 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field3559 ^= this.field3559 << 2;
            } else {
                this.field3559 ^= this.field3559 >>> 16;
            }
            this.field3559 += this.field3554[var2 + 128 & 0xFF];
            int var4;
            this.field3554[var2] = var4 = this.field3560 + this.field3554[class29.method202(1020, var3) >> 2] + this.field3559;
            this.field3549[var2] = this.field3560 = this.field3554[class29.method202(var4, 261294) >> 8 >> 2] + var3;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIII)I")
    public static final int method1296(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 >= -124) {
            return 89;
        }
        field3572++;
        if (arg2 >= arg0) {
            return arg2 > arg3 ? arg3 : arg2;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(I)V")
    private final void method1297(int arg0) {
        field3552++;
        int var2 = -1640531527;
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;
        int var9 = -1640531527;
        int var10 = 0;
        if (arg0 != 1) {
            method1298((byte) -88);
        }
        while (var10 < 4) {
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
            int var70 = var65 + var69;
            var5 = var70 ^ var69 << 10;
            int var71 = var2 + var5;
            int var72 = var3 + var6;
            int var73 = var69 + var72;
            var4 = var73 ^ var72 >>> 4;
            int var74 = var4 + var61;
            int var75 = var71 + var72;
            var3 = var75 ^ var71 << 8;
            var8 = var3 + var64;
            int var76 = var71 + var74;
            var2 = var76 ^ var74 >>> 9;
            var7 = var2 + var67;
            var9 = var8 + var74;
            var10++;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field3549[var11 + 7] + var2;
            int var38 = this.field3549[var11] + var9;
            int var39 = this.field3549[var11 + 3] + var6;
            int var40 = this.field3549[var11 + 6] + var3;
            int var41 = this.field3549[var11 + 2] + var7;
            int var42 = this.field3549[var11 + 4] + var5;
            int var43 = this.field3549[var11 + 1] + var8;
            int var44 = var38 ^ var43 << 11;
            int var45 = var41 + var43;
            int var46 = var39 + var44;
            int var47 = var45 ^ var41 >>> 2;
            int var48 = var41 + var46;
            int var49 = this.field3549[var11 + 5] + var4;
            int var50 = var48 ^ var46 << 8;
            int var51 = var49 + var50;
            int var52 = var42 + var47;
            int var53 = var46 + var52;
            var6 = var53 ^ var52 >>> 16;
            int var54 = var6 + var40;
            int var55 = var51 + var52;
            var5 = var55 ^ var51 << 10;
            int var56 = var5 + var37;
            int var57 = var51 + var54;
            var4 = var57 ^ var54 >>> 4;
            int var58 = var54 + var56;
            var3 = var58 ^ var56 << 8;
            var8 = var3 + var47;
            int var59 = var4 + var44;
            int var60 = var56 + var59;
            var2 = var60 ^ var59 >>> 9;
            var7 = var2 + var50;
            var9 = var8 + var59;
            this.field3554[var11] = var9;
            this.field3554[var11 + 1] = var8;
            this.field3554[var11 + 2] = var7;
            this.field3554[var11 + 3] = var6;
            this.field3554[var11 + 4] = var5;
            this.field3554[var11 + 5] = var4;
            this.field3554[var11 + 6] = var3;
            this.field3554[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field3554[var12 + 7] + var2;
            int var14 = this.field3554[var12 + 4] + var5;
            int var15 = this.field3554[var12 + 3] + var6;
            int var16 = this.field3554[var12] + var9;
            int var17 = this.field3554[var12 + 1] + var8;
            int var18 = this.field3554[var12 + 6] + var3;
            int var19 = this.field3554[var12 + 5] + var4;
            int var20 = var16 ^ var17 << 11;
            int var21 = this.field3554[var12 + 2] + var7;
            int var22 = var15 + var20;
            int var23 = var17 + var21;
            int var24 = var23 ^ var21 >>> 2;
            int var25 = var21 + var22;
            int var26 = var25 ^ var22 << 8;
            int var27 = var19 + var26;
            int var28 = var14 + var24;
            int var29 = var22 + var28;
            var6 = var29 ^ var28 >>> 16;
            int var30 = var6 + var18;
            int var31 = var27 + var28;
            var5 = var31 ^ var27 << 10;
            int var32 = var5 + var13;
            int var33 = var27 + var30;
            var4 = var33 ^ var30 >>> 4;
            int var34 = var4 + var20;
            int var35 = var30 + var32;
            var3 = var35 ^ var32 << 8;
            var8 = var3 + var24;
            int var36 = var32 + var34;
            var2 = var36 ^ var34 >>> 9;
            var9 = var8 + var34;
            var7 = var2 + var26;
            this.field3554[var12] = var9;
            this.field3554[var12 + 1] = var8;
            this.field3554[var12 + 2] = var7;
            this.field3554[var12 + 3] = var6;
            this.field3554[var12 + 4] = var5;
            this.field3554[var12 + 5] = var4;
            this.field3554[var12 + 6] = var3;
            this.field3554[var12 + 7] = var2;
        }
        this.method1295(-2081550110);
        this.field3570 = 256;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(B)V")
    public static void method1298(byte arg0) {
        if (arg0 < 67) {
            field3575 = -10;
        }
        field3555 = null;
        field3557 = null;
        field3548 = null;
        field3562 = null;
        field3556 = null;
        field3571 = null;
        field3567 = null;
        field3553 = null;
        field3564 = null;
        field3565 = null;
        field3550 = null;
        field3566 = null;
        field3551 = null;
        field3563 = null;
        field3561 = null;
        field3569 = null;
    }

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "(I)I")
    public final int method1299(int arg0) {
        if (arg0 != -27588) {
            return -27;
        }
        if (this.field3570-- == 0) {
            this.method1295(-2081550110);
            this.field3570 = 255;
        }
        field3574++;
        return this.field3549[this.field3570];
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "()V")
    private class201() {
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "([I)V")
    public class201(int[] arg0) {
        this.field3554 = new int[256];
        this.field3549 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field3549[var2] = arg0[var2];
        }
        this.method1297(1);
    }
}
