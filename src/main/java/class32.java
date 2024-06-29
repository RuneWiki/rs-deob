import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class32 extends class27 {

    @OriginalMember(owner = "client!db", name = "V", descriptor = "I")
    private int field524 = 1;

    @OriginalMember(owner = "client!db", name = "Y", descriptor = "I")
    private int field527 = 1;

    @OriginalMember(owner = "client!db", name = "R", descriptor = "Lh;")
    public static class65 field520 = null;

    @OriginalMember(owner = "client!db", name = "U", descriptor = "Lkb;")
    public static class93 field523 = class76.method390("gleiten:", 0);

    @OriginalMember(owner = "client!db", name = "S", descriptor = "Lkb;")
    private static class93 field521 = class76.method390("Select", 0);

    @OriginalMember(owner = "client!db", name = "O", descriptor = "Lkb;")
    private static class93 field517 = class76.method390("Loading fonts )2 ", 0);

    @OriginalMember(owner = "client!db", name = "P", descriptor = "Lkb;")
    public static class93 field518 = field517;

    @OriginalMember(owner = "client!db", name = "M", descriptor = "Lkb;")
    public static class93 field515 = field521;

    @OriginalMember(owner = "client!db", name = "X", descriptor = "I")
    public static int field526 = 3353893;

    @OriginalMember(owner = "client!db", name = "Z", descriptor = "Lkb;")
    private static class93 field528 = class76.method390("Cancel", 0);

    @OriginalMember(owner = "client!db", name = "cb", descriptor = "Lkb;")
    public static class93 field531 = class76.method390("headicons_hint", 0);

    @OriginalMember(owner = "client!db", name = "bb", descriptor = "Lkb;")
    public static class93 field530 = field528;

    @OriginalMember(owner = "client!db", name = "N", descriptor = "I")
    public static int field516;

    @OriginalMember(owner = "client!db", name = "Q", descriptor = "I")
    public static int field519;

    @OriginalMember(owner = "client!db", name = "T", descriptor = "I")
    public static int field522;

    @OriginalMember(owner = "client!db", name = "W", descriptor = "I")
    public static int field525;

    @OriginalMember(owner = "client!db", name = "ab", descriptor = "I")
    public static int field529;

    @OriginalMember(owner = "client!db", name = "d", descriptor = "(I)V")
    public static void method185(int arg0) {
        field523 = null;
        field520 = null;
        if (arg0 > -30) {
            field531 = null;
        }
        field515 = null;
        field517 = null;
        field521 = null;
        field531 = null;
        field528 = null;
        field530 = null;
        field518 = null;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(BILrd;)V")
    public final void method15(byte arg0, int arg1, class158 arg2) {
        if (arg0 < 106) {
            field531 = null;
        }
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (arg1 == 2) {
                    super.field435 = ~arg2.method1054(128) == -2;
                }
            } else {
                this.field527 = arg2.method1054(128);
            }
        } else {
            this.field524 = arg2.method1054(128);
        }
        ++field525;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IZ)[I")
    public final int[] method55(int arg0, boolean arg1) {
        ++field516;
        int[] var3 = super.field447.method1238(arg1, arg0);
        if (super.field447.field3737) {
            int var4 = this.field527 + this.field527 + 1;
            int var5 = this.field524 + 1 + this.field524;
            int[][] var6 = new int[var4][];
            for (int var7 = -this.field527 + arg0; ~var7 >= ~(this.field527 + arg0); ++var7) {
                int[] var11 = this.method145(0, (byte) 120, class190.field3715 & var7);
                int[] var12 = new int[class159.field3209];
                int var13 = 0;
                for (int var14 = -this.field524; ~var14 >= ~this.field524; ++var14) {
                    var13 += var11[var14 & class78.field1402];
                }
                int var15 = 0;
                while (~var15 > ~class159.field3209) {
                    var12[var15] = var13 / var5;
                    int var16 = var13 - var11[-this.field524 + var15 & class78.field1402];
                    ++var15;
                    var13 = var11[class78.field1402 & this.field524 + var15] + var16;
                }
                var6[-arg0 + this.field527 + var7] = var12;
            }
            for (int var8 = 0; ~class159.field3209 < ~var8; ++var8) {
                int var9 = 0;
                for (int var10 = 0; var4 > var10; ++var10) {
                    var9 += var6[var10][var8];
                }
                var3[var8] = var9 / var4;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(II)[[I")
    public final int[][] method19(int arg0, int arg1) {
        ++field529;
        int[][] var3 = super.field436.method537(0, arg1);
        int var4 = -111 % ((42 - arg0) / 54);
        if (super.field436.field1771) {
            int var5 = this.field527 + 1 + this.field527;
            int[][][] var6 = new int[var5][][];
            int var7 = this.field524 - (-this.field524 + -1);
            for (int var8 = -this.field527 + arg1; ~(arg1 - -this.field527) <= ~var8; ++var8) {
                int[][] var18 = this.method152(class190.field3715 & var8, 0, 103);
                int[][] var19 = new int[3][class159.field3209];
                int var20 = 0;
                int var21 = 0;
                int var22 = 0;
                int[] var23 = var18[0];
                int[] var24 = var18[2];
                int[] var25 = var18[1];
                for (int var26 = -this.field524; this.field524 >= var26; ++var26) {
                    int var36 = var26 & class78.field1402;
                    var21 += var23[var36];
                    var22 += var24[var36];
                    var20 += var25[var36];
                }
                int[] var27 = var19[0];
                int[] var28 = var19[1];
                int[] var29 = var19[2];
                int var30 = 0;
                while (var30 < class159.field3209) {
                    var27[var30] = var21 / var7;
                    var28[var30] = var20 / var7;
                    var29[var30] = var22 / var7;
                    int var31 = class78.field1402 & var30 - this.field524;
                    int var32 = var22 - var24[var31];
                    int var33 = var21 - var23[var31];
                    int var34 = var20 - var25[var31];
                    ++var30;
                    int var35 = this.field524 + var30 & class78.field1402;
                    var21 = var23[var35] + var33;
                    var20 = var25[var35] + var34;
                    var22 = var24[var35] + var32;
                }
                var6[this.field527 + var8 + -arg1] = var19;
            }
            int[] var9 = var3[0];
            int[] var10 = var3[2];
            int[] var11 = var3[1];
            for (int var12 = 0; var12 < class159.field3209; ++var12) {
                int var13 = 0;
                int var14 = 0;
                int var15 = 0;
                for (int var16 = 0; var5 > var16; ++var16) {
                    int[][] var17 = var6[var16];
                    var15 += var17[2][var12];
                    var13 += var17[1][var12];
                    var14 += var17[0][var12];
                }
                var9[var12] = var14 / var5;
                var11[var12] = var13 / var5;
                var10[var12] = var15 / var5;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "()V")
    public class32() {
        super(1, false);
    }

    @OriginalMember(owner = "client!db", name = "c", descriptor = "(Z)[Lob;")
    public static final class129[] method186(boolean arg0) {
        ++field519;
        class129[] var1 = new class129[class8.field131];
        for (int var2 = 0; ~class8.field131 < ~var2; ++var2) {
            class129 var3 = new class129();
            var3.field2448 = class189.field3700;
            var3.field2447 = class133.field2557;
            var3.field2449 = class153.field2993[var2];
            var3.field2445 = class82.field1513[var2];
            var3.field2446 = class64.field1010[var2];
            var3.field2451 = class100.field1844[var2];
            byte[] var4 = class35.field577[var2];
            int var5 = var3.field2451 * var3.field2446;
            var3.field2450 = new int[var5];
            for (int var6 = 0; var5 > var6; ++var6) {
                var3.field2450[var6] = class103.field1895[class91.method479(var4[var6], 255)];
            }
            var1[var2] = var3;
        }
        if (!arg0) {
            field531 = null;
        }
        class206.method1340(-23557);
        return var1;
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(IBI)I")
    public static final int method187(int arg0, byte arg1, int arg2) {
        ++field522;
        class36 var3 = (class36) client.field496.method616((long) arg2, -1);
        if (var3 == null) {
            return -1;
        } else if (arg0 >= 0 && arg0 < var3.field595.length) {
            int var4 = -68 / ((-61 - arg1) / 60);
            return var3.field595[arg0];
        } else {
            return -1;
        }
    }
}
