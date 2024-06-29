import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class212 extends class270 {

    @OriginalMember(owner = "client!bj", name = "S", descriptor = "I")
    private int field3552 = 0;

    @OriginalMember(owner = "client!bj", name = "Z", descriptor = "I")
    private int field3559 = 0;

    @OriginalMember(owner = "client!bj", name = "bb", descriptor = "I")
    private int field3561 = 0;

    @OriginalMember(owner = "client!bj", name = "X", descriptor = "[I")
    public static int[] field3557 = new int[500];

    @OriginalMember(owner = "client!bj", name = "cb", descriptor = "Lmh;")
    public static class62 field3562 = class201.method1405(true, "p12_full");

    @OriginalMember(owner = "client!bj", name = "ab", descriptor = "[Lmh;")
    public static class62[] field3560 = new class62[1000];

    @OriginalMember(owner = "client!bj", name = "ib", descriptor = "I")
    public static int field3568 = -1;

    @OriginalMember(owner = "client!bj", name = "U", descriptor = "Lmh;")
    public static class62 field3554 = class201.method1405(true, "Stufe)2");

    @OriginalMember(owner = "client!bj", name = "ob", descriptor = "Lmh;")
    public static class62 field3574 = class201.method1405(true, "<)4col> x");

    @OriginalMember(owner = "client!bj", name = "W", descriptor = "F")
    public static float field3556;

    @OriginalMember(owner = "client!bj", name = "T", descriptor = "I")
    private int field3553;

    @OriginalMember(owner = "client!bj", name = "V", descriptor = "I")
    public static int field3555;

    @OriginalMember(owner = "client!bj", name = "Y", descriptor = "I")
    private int field3558;

    @OriginalMember(owner = "client!bj", name = "db", descriptor = "I")
    private int field3563;

    @OriginalMember(owner = "client!bj", name = "eb", descriptor = "I")
    private int field3564;

    @OriginalMember(owner = "client!bj", name = "fb", descriptor = "I")
    public static int field3565;

    @OriginalMember(owner = "client!bj", name = "kb", descriptor = "I")
    private int field3570;

    @OriginalMember(owner = "client!bj", name = "lb", descriptor = "I")
    public static int field3571;

    @OriginalMember(owner = "client!bj", name = "mb", descriptor = "I")
    private int field3572;

    @OriginalMember(owner = "client!bj", name = "nb", descriptor = "I")
    public static int field3573;

    @OriginalMember(owner = "client!bj", name = "pb", descriptor = "I")
    public static int field3575;

    @OriginalMember(owner = "client!bj", name = "jb", descriptor = "Ljava/awt/Frame;")
    public static Frame field3569;

    @OriginalMember(owner = "client!bj", name = "gb", descriptor = "[I")
    public static int[] field3566;

    @OriginalMember(owner = "client!bj", name = "hb", descriptor = "[Lfd;")
    public static class61[] field3567;

    @OriginalMember(owner = "client!bj", name = "<init>", descriptor = "()V", line = 153)
    public class212() {
        super(1, false);
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lmi;II)V", line = 28)
    public final void method8(class92 arg0, int arg1, int arg2) {
        if (arg1 == 0) {
            this.field3559 = arg0.method699((byte) -49);
        } else if (arg1 == 1) {
            this.field3552 = (arg0.method743((byte) 17) << 12) / 100;
        } else if (arg1 == 2) {
            this.field3561 = (arg0.method743((byte) 27) << 12) / 100;
        }
        int var5 = 86 / ((-arg2 - 8) / 53);
        field3555++;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(ZI)[[I", line = 74)
    public final int[][] method11(boolean arg0, int arg1) {
        field3565++;
        if (arg0) {
            this.field3553 = 83;
        }
        int[][] var3 = this.field4589.method605(arg1, 19195);
        if (this.field4589.field1320) {
            int[][] var4 = this.method1855(false, arg1, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var3[0];
            int[] var10 = var4[1];
            for (int var11 = 0; var11 < class109.field1770; var11++) {
                this.method1476(var6[var11], arg0, var10[var11], var5[var11]);
                this.field3558 += this.field3552;
                this.field3553 += this.field3561;
                if (this.field3558 < 0) {
                    this.field3558 = 0;
                }
                if (this.field3558 > 4096) {
                    this.field3558 = 4096;
                }
                if (this.field3553 < 0) {
                    this.field3553 = 0;
                }
                if (this.field3553 > 4096) {
                    this.field3553 = 4096;
                }
                for (this.field3570 += this.field3559; this.field3570 < 0; this.field3570 += 4096) {
                }
                while (this.field3570 > 4096) {
                    this.field3570 -= 4096;
                }
                this.method1479(7579, this.field3558, this.field3553, this.field3570);
                var9[var11] = this.field3572;
                var7[var11] = this.field3563;
                var8[var11] = this.field3564;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IZII)V", line = 165)
    private final void method1476(int arg0, boolean arg1, int arg2, int arg3) {
        field3575++;
        if (arg1) {
            method1477(-113);
        }
        int var5 = arg2 < arg3 ? arg3 : arg2;
        int var6 = arg0 > var5 ? arg0 : var5;
        int var7 = arg3 < arg2 ? arg3 : arg2;
        int var8 = arg0 >= var7 ? var7 : arg0;
        this.field3553 = (var6 + var8) / 2;
        int var9 = var6 - var8;
        if (var9 > 0) {
            int var10 = (var6 - arg3 << 12) / var9;
            int var11 = (var6 - arg2 << 12) / var9;
            int var12 = (var6 - arg0 << 12) / var9;
            if (arg3 == var6) {
                this.field3570 = arg2 == var8 ? var12 + 20480 : 4096 - var11;
            } else if (arg2 == var6) {
                this.field3570 = arg0 == var8 ? var10 + 4096 : -var12 + 12288;
            } else {
                this.field3570 = arg3 == var8 ? var11 + 12288 : -var10 + 20480;
            }
            this.field3570 /= 6;
        } else {
            this.field3570 = 0;
        }
        if (this.field3553 > 0 && this.field3553 < 4096) {
            this.field3558 = (var9 << 12) / (this.field3553 > 2048 ? 8192 - (this.field3553 * 2) : this.field3553 * 2);
        } else {
            this.field3558 = 0;
        }
    }

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "(I)V", line = 220)
    public static void method1477(int arg0) {
        field3557 = null;
        if (arg0 != 4096) {
            method1477(-22);
        }
        field3574 = null;
        field3567 = null;
        field3569 = null;
        field3554 = null;
        field3560 = null;
        field3566 = null;
        field3562 = null;
    }

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "(II)V", line = 249)
    public static final void method1478(int arg0, int arg1) {
        if (arg0 <= 70) {
            field3556 = -1.8197832F;
        }
        field3573++;
        class151 var2 = class165.method1194((byte) 1, 3, arg1);
        var2.method1081(128);
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIII)V", line = 271)
    private final void method1479(int arg0, int arg1, int arg2, int arg3) {
        field3571++;
        int var5 = arg2 <= 2048 ? (arg1 + 4096) * arg2 >> 12 : arg2 + arg1 - (arg1 * arg2 >> 12);
        if (var5 <= 0) {
            this.field3572 = this.field3563 = this.field3564 = arg2;
        } else {
            int var6 = arg2 - (var5 - arg2);
            int var7 = arg3 * 6;
            int var8 = (var5 - var6 << 12) / var5;
            int var9 = var7 >> 12;
            int var11 = var8 * var5 >> 12;
            int var12 = var7 - (var9 << 12);
            int var13 = var11 * var12 >> 12;
            int var14 = var5 - var13;
            int var15 = var6 + var13;
            if (var9 == 0) {
                this.field3563 = var15;
                this.field3564 = var6;
                this.field3572 = var5;
            } else if (var9 == 1) {
                this.field3572 = var14;
                this.field3564 = var6;
                this.field3563 = var5;
            } else if (var9 == 2) {
                this.field3563 = var5;
                this.field3564 = var15;
                this.field3572 = var6;
            } else if (var9 == 3) {
                this.field3572 = var6;
                this.field3563 = var14;
                this.field3564 = var5;
            } else if (var9 == 4) {
                this.field3564 = var5;
                this.field3563 = var6;
                this.field3572 = var15;
            } else if (var9 == 5) {
                this.field3572 = var5;
                this.field3563 = var6;
                this.field3564 = var14;
            }
        }
        if (arg0 != 7579) {
            this.method1476(73, false, 55, -70);
        }
    }
}
