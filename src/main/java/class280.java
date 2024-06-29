import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class280 {

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "Z")
    public boolean field3658 = true;

    @OriginalMember(owner = "client!ih", name = "h", descriptor = "I")
    public int field3663 = 512;

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "I")
    private int field3659 = 0;

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "I")
    public int field3661 = -1;

    @OriginalMember(owner = "client!ih", name = "j", descriptor = "Lfs;")
    public static class546 field3665 = new class546("LOCAL", 4);

    @OriginalMember(owner = "client!ih", name = "l", descriptor = "Lmv;")
    public static class297 field3667 = new class297(15, 0, 1, 0);

    @OriginalMember(owner = "client!ih", name = "n", descriptor = "[[I")
    public static int[][] field3669 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "I")
    public int field3656;

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "I")
    public int field3657;

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "I")
    public int field3660;

    @OriginalMember(owner = "client!ih", name = "g", descriptor = "I")
    public static int field3662;

    @OriginalMember(owner = "client!ih", name = "i", descriptor = "I")
    public static int field3664;

    @OriginalMember(owner = "client!ih", name = "k", descriptor = "I")
    public static int field3666;

    @OriginalMember(owner = "client!ih", name = "m", descriptor = "I")
    public int field3668;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(ILfd;)V")
    public final void method1684(int arg0, class418 arg1) {
        field3666++;
        while (true) {
            int var3 = arg1.method2396(arg0 ^ 0xFFFF9E0C);
            if (var3 == 0) {
                if (arg0 == -25067) {
                    return;
                } else {
                    this.field3659 = 115;
                    return;
                }
            }
            this.method1685(var3, arg1, 8);
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(ILfd;I)V")
    private final void method1685(int arg0, class418 arg1, int arg2) {
        if (arg0 == 1) {
            this.field3659 = arg1.method2364(arg2 - 119);
            this.method1686((byte) 11, this.field3659);
        } else if (arg0 == 2) {
            this.field3661 = arg1.method2393(-30727);
            if (this.field3661 == 65535) {
                this.field3661 = -1;
            }
        } else if (arg0 == 3) {
            this.field3663 = arg1.method2393(-30727) << 2;
        } else if (arg0 == 4) {
            this.field3658 = false;
        }
        if (arg2 != 8) {
            this.method1684(58, null);
        }
        field3664++;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(BI)V")
    private final void method1686(byte arg0, int arg1) {
        field3662++;
        double var3 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        int var7 = -64 % ((68 - arg0) / 43);
        double var8 = (double) (arg1 & 0xFF) / 256.0D;
        double var10 = var3;
        if (var5 < var3) {
            var10 = var5;
        }
        if (var8 < var10) {
            var10 = var8;
        }
        double var12 = var3;
        if (var3 < var5) {
            var12 = var5;
        }
        if (var8 > var12) {
            var12 = var8;
        }
        double var14 = 0.0D;
        double var16 = 0.0D;
        double var18 = (var10 + var12) / 2.0D;
        if (var10 != var12) {
            if (var18 < 0.5D) {
                var16 = (var12 - var10) / (var10 + var12);
            }
            if (var3 == var12) {
                var14 = (var5 - var8) / (var12 - var10);
            } else if (var5 == var12) {
                var14 = (var8 - var3) / (var12 - var10) + 2.0D;
            } else if (var8 == var12) {
                var14 = (var3 - var5) / (var12 - var10) + 4.0D;
            }
            if (var18 >= 0.5D) {
                var16 = (var12 - var10) / (2.0D - var12 - var10);
            }
        }
        this.field3657 = (int) (var18 * 256.0D);
        double var20 = var14 / 6.0D;
        this.field3668 = (int) (var16 * 256.0D);
        if (var18 > 0.5D) {
            this.field3656 = (int) ((1.0D - var18) * var16 * 512.0D);
        } else {
            this.field3656 = (int) (var16 * var18 * 512.0D);
        }
        if (this.field3668 < 0) {
            this.field3668 = 0;
        } else if (this.field3668 > 255) {
            this.field3668 = 255;
        }
        if (this.field3657 < 0) {
            this.field3657 = 0;
        } else if (this.field3657 > 255) {
            this.field3657 = 255;
        }
        if (this.field3656 < 1) {
            this.field3656 = 1;
        }
        this.field3660 = (int) ((double) this.field3656 * var20);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)V")
    public static void method1687(int arg0) {
        field3667 = null;
        int var1 = 51 / ((arg0 - 27) / 39);
        field3669 = null;
        field3665 = null;
    }
}
