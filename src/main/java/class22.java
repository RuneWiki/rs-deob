import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class22 extends class49 {

    @OriginalMember(owner = "client!d", name = "nb", descriptor = "I")
    private int field512 = 0;

    @OriginalMember(owner = "client!d", name = "mb", descriptor = "Z")
    private boolean field511 = false;

    @OriginalMember(owner = "client!d", name = "fb", descriptor = "I")
    private int field504 = 0;

    @OriginalMember(owner = "client!d", name = "ob", descriptor = "I")
    private int field513;

    @OriginalMember(owner = "client!d", name = "tb", descriptor = "I")
    private int field518;

    @OriginalMember(owner = "client!d", name = "X", descriptor = "I")
    private int field496;

    @OriginalMember(owner = "client!d", name = "vb", descriptor = "I")
    public int field520;

    @OriginalMember(owner = "client!d", name = "qb", descriptor = "I")
    public int field515;

    @OriginalMember(owner = "client!d", name = "jb", descriptor = "I")
    private int field508;

    @OriginalMember(owner = "client!d", name = "db", descriptor = "I")
    private int field502;

    @OriginalMember(owner = "client!d", name = "sb", descriptor = "I")
    public int field517;

    @OriginalMember(owner = "client!d", name = "Bb", descriptor = "I")
    public int field526;

    @OriginalMember(owner = "client!d", name = "kb", descriptor = "I")
    public int field509;

    @OriginalMember(owner = "client!d", name = "Cb", descriptor = "I")
    private int field527;

    @OriginalMember(owner = "client!d", name = "Ab", descriptor = "Lne;")
    private class95 field525;

    @OriginalMember(owner = "client!d", name = "T", descriptor = "Z")
    public static volatile boolean field492 = true;

    @OriginalMember(owner = "client!d", name = "eb", descriptor = "[I")
    public static int[] field503 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!d", name = "Y", descriptor = "[[S")
    public static short[][] field497 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!d", name = "lb", descriptor = "Lod;")
    private static class101 field510 = class46.method335(-104, "Loading config )2 ");

    @OriginalMember(owner = "client!d", name = "bb", descriptor = "Lod;")
    public static class101 field500 = field510;

    @OriginalMember(owner = "client!d", name = "wb", descriptor = "I")
    public static int field521 = 0;

    @OriginalMember(owner = "client!d", name = "xb", descriptor = "Lod;")
    public static class101 field522 = class46.method335(-107, "Abbrechen");

    @OriginalMember(owner = "client!d", name = "U", descriptor = "D")
    public double field493;

    @OriginalMember(owner = "client!d", name = "ab", descriptor = "D")
    private double field499;

    @OriginalMember(owner = "client!d", name = "cb", descriptor = "D")
    public double field501;

    @OriginalMember(owner = "client!d", name = "gb", descriptor = "D")
    private double field505;

    @OriginalMember(owner = "client!d", name = "ub", descriptor = "D")
    private double field519;

    @OriginalMember(owner = "client!d", name = "yb", descriptor = "D")
    public double field523;

    @OriginalMember(owner = "client!d", name = "zb", descriptor = "D")
    private double field524;

    @OriginalMember(owner = "client!d", name = "Eb", descriptor = "D")
    private double field529;

    @OriginalMember(owner = "client!d", name = "V", descriptor = "I")
    public static int field494;

    @OriginalMember(owner = "client!d", name = "W", descriptor = "I")
    public static int field495;

    @OriginalMember(owner = "client!d", name = "Z", descriptor = "I")
    private int field498;

    @OriginalMember(owner = "client!d", name = "hb", descriptor = "I")
    public static int field506;

    @OriginalMember(owner = "client!d", name = "ib", descriptor = "I")
    public static int field507;

    @OriginalMember(owner = "client!d", name = "pb", descriptor = "I")
    public int field514;

    @OriginalMember(owner = "client!d", name = "rb", descriptor = "I")
    public static int field516;

    @OriginalMember(owner = "client!d", name = "Db", descriptor = "I")
    public static int field528;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIII)V")
    public final void method176(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field528++;
        if (!this.field511) {
            double var6 = (double) (arg1 - this.field508);
            double var8 = (double) (arg0 - this.field502);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field501 = (double) this.field513 * var6 / var10 + (double) this.field508;
            this.field493 = (double) this.field513 * var8 / var10 + (double) this.field502;
            this.field523 = this.field527;
        }
        double var12 = (double) (this.field515 - arg4 - arg3);
        this.field499 = ((double) arg1 - this.field501) / var12;
        this.field505 = ((double) arg0 - this.field493) / var12;
        this.field529 = Math.sqrt(this.field505 * this.field505 + this.field499 * this.field499);
        if (!this.field511) {
            this.field519 = -this.field529 * Math.tan((double) this.field496 * 0.02454369D);
        }
        this.field524 = ((double) arg2 - this.field523 - this.field519 * var12) * 2.0D / (var12 * var12);
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IZ)V")
    public final void method177(int arg0, boolean arg1) {
        this.field501 += (double) arg0 * this.field499;
        if (arg1) {
            field521 = -34;
        }
        this.field493 += (double) arg0 * this.field505;
        this.field523 += this.field524 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field519;
        this.field519 += (double) arg0 * this.field524;
        this.field511 = true;
        this.field514 = (int) (Math.atan2(this.field505, this.field499) * 325.949D) + 1024 & 0x7FF;
        this.field498 = (int) (Math.atan2(this.field519, this.field529) * 325.949D) & 0x7FF;
        if (this.field525 != null) {
            this.field504 += arg0;
            label29: while (true) {
                do {
                    do {
                        if (this.field525.field2066[this.field512] >= this.field504) {
                            break label29;
                        }
                        this.field504 -= this.field525.field2066[this.field512];
                        this.field512++;
                    } while (this.field512 < this.field525.field2055.length);
                    this.field512 -= this.field525.field2057;
                } while (this.field512 >= 0 && this.field512 < this.field525.field2055.length);
                this.field512 = 0;
            }
        }
        field506++;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIBIIII)V")
    public static final void method178(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        field495++;
        if (arg2 != 19) {
            field510 = null;
        }
        int var7 = 2048 - arg4 & 0x7FF;
        int var8 = 2048 - arg3 & 0x7FF;
        int var9 = 0;
        int var10 = 0;
        int var11 = arg1;
        if (var7 != 0) {
            int var12 = class124.field2709[var7];
            int var13 = class124.field2717[var7];
            int var14 = var10 * var13 - arg1 * var12 >> 16;
            var11 = var10 * var12 + arg1 * var13 >> 16;
            var10 = var14;
        }
        if (var8 != 0) {
            int var15 = class124.field2709[var8];
            int var16 = class124.field2717[var8];
            int var17 = var9 * var16 + var11 * var15 >> 16;
            var11 = var11 * var16 - var9 * var15 >> 16;
            var9 = var17;
        }
        class26.field677 = arg4;
        class132.field3033 = arg3;
        class26.field692 = arg0 - var10;
        class133.field3048 = arg5 - var11;
        class120.field2637 = arg6 - var9;
    }

    @OriginalMember(owner = "client!d", name = "j", descriptor = "(I)V")
    public static final void method179(int arg0) {
        field507++;
        class157 var1 = (class157) class20.field425.method523(false);
        if (arg0 != 4626) {
            field503 = null;
        }
        while (var1 != null) {
            if (var1.field3615 != null) {
                class133.field3039.method509(var1.field3615);
                var1.field3615 = null;
            }
            if (var1.field3617 != null) {
                class133.field3039.method509(var1.field3617);
                var1.field3617 = null;
            }
            var1 = (class157) class20.field425.method527(true);
        }
        class20.field425.method525(true);
    }

    @OriginalMember(owner = "client!d", name = "k", descriptor = "(I)V")
    public static void method180(int arg0) {
        field500 = null;
        if (arg0 == -21757) {
            field522 = null;
            field503 = null;
            field497 = null;
            field510 = null;
        }
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(B)Lqb;")
    public final class113 method88(byte arg0) {
        field494++;
        class25 var2 = class52.method376(false, this.field518);
        class113 var3 = var2.method199((byte) 121, this.field512);
        if (var3 == null) {
            return null;
        } else {
            var3.method834(this.field498);
            return arg0 == -93 ? var3 : null;
        }
    }

    @OriginalMember(owner = "client!d", name = "<init>", descriptor = "(IIIIIIIIIII)V")
    public class22(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field513 = arg8;
        this.field518 = arg0;
        this.field496 = arg7;
        this.field520 = arg1;
        this.field515 = arg6;
        this.field508 = arg3;
        this.field502 = arg2;
        this.field511 = false;
        this.field517 = arg10;
        this.field526 = arg5;
        this.field509 = arg9;
        this.field527 = arg4;
        int var12 = class52.method376(false, this.field518).field643;
        if (var12 == -1) {
            this.field525 = null;
        } else {
            this.field525 = class8.method39(var12, (byte) -48);
        }
    }
}
