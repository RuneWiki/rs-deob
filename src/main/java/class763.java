import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vt")
public class class763 extends class747 {

    @OriginalMember(owner = "client!vt", name = "H", descriptor = "I")
    private int field10634 = 12288;

    @OriginalMember(owner = "client!vt", name = "P", descriptor = "I")
    private int field10641 = 0;

    @OriginalMember(owner = "client!vt", name = "L", descriptor = "I")
    private int field10637 = 4096;

    @OriginalMember(owner = "client!vt", name = "M", descriptor = "I")
    private int field10638 = 0;

    @OriginalMember(owner = "client!vt", name = "R", descriptor = "I")
    private int field10643 = 2048;

    @OriginalMember(owner = "client!vt", name = "N", descriptor = "I")
    private int field10639 = 8192;

    @OriginalMember(owner = "client!vt", name = "J", descriptor = "I")
    private int field10635 = 2048;

    @OriginalMember(owner = "client!vt", name = "F", descriptor = "I")
    public static int field10632 = 0;

    @OriginalMember(owner = "client!vt", name = "O", descriptor = "[I")
    public static int[] field10640 = new int[14];

    @OriginalMember(owner = "client!vt", name = "Q", descriptor = "[I")
    public static int[] field10642 = new int[1];

    @OriginalMember(owner = "client!vt", name = "E", descriptor = "I")
    public static int field10631;

    @OriginalMember(owner = "client!vt", name = "G", descriptor = "I")
    public static int field10633;

    @OriginalMember(owner = "client!vt", name = "K", descriptor = "I")
    public static int field10636;

    @OriginalMember(owner = "client!vt", name = "S", descriptor = "I")
    public static int field10644;

    @OriginalMember(owner = "client!vt", name = "T", descriptor = "I")
    public static int field10645;

    @OriginalMember(owner = "client!vt", name = "c", descriptor = "(B)V", line = 3)
    public static void method4254(byte arg0) {
        if (arg0 == 7) {
            field10642 = null;
            field10640 = null;
        }
    }

    @OriginalMember(owner = "client!vt", name = "c", descriptor = "(III)Z", line = 15)
    private final boolean method4255(int arg0, int arg1, int arg2) {
        ++field10644;
        if (arg2 < 6) {
            return true;
        } else {
            int var4 = (-arg0 + arg1) * this.field10634 >> 12;
            int var5 = class639.field8569[(1046712 & var4 * 255) >> 12];
            int var6 = (var5 << 12) / this.field10634;
            int var7 = (var6 << 12) / this.field10639;
            int var8 = this.field10637 * var7 >> 12;
            return ~(arg0 + arg1) > ~var8 && -var8 < arg0 + arg1;
        }
    }

    @OriginalMember(owner = "client!vt", name = "b", descriptor = "(I)V", line = 34)
    public final void method184(int arg0) {
        if (arg0 != -2) {
            this.field10634 = -89;
        }
        ++field10645;
        class654.method3655(54);
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(II)[I", line = 45)
    public final int[] method182(int arg0, int arg1) {
        if (arg1 >= -89) {
            return null;
        } else {
            ++field10633;
            int[] var3 = super.field10279.method3479(true, arg0);
            if (super.field10279.field8263) {
                int var4 = class515.field7103[arg0] + -2048;
                for (int var5 = 0; ~var5 > ~class73.field1095; ++var5) {
                    int var6 = class639.field8571[var5] + -2048;
                    int var7 = this.field10643 + var6;
                    int var8 = ~var7 <= 2047 ? var7 : var7 - -4096;
                    int var9 = ~var8 >= -2049 ? var8 : var8 + -4096;
                    int var10 = this.field10641 + var4;
                    int var11 = var10 >= -2048 ? var10 : var10 + 4096;
                    int var12 = ~var11 >= -2049 ? var11 : var11 + -4096;
                    int var13 = this.field10638 + var6;
                    int var14 = var13 < -2048 ? var13 + 4096 : var13;
                    int var15 = var14 > 2048 ? var14 + -4096 : var14;
                    int var16 = this.field10635 + var4;
                    int var17 = var16 < -2048 ? var16 + 4096 : var16;
                    int var18 = var17 <= 2048 ? var17 : var17 + -4096;
                    var3[var5] = !this.method4255(var9, var12, 105) && !this.method4256(var15, var18, (byte) -85) ? 0 : 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!vt", name = "b", descriptor = "(IIB)Z", line = 97)
    private final boolean method4256(int arg0, int arg1, byte arg2) {
        ++field10631;
        int var4 = (arg0 + arg1) * this.field10634 >> 12;
        int var5 = class639.field8569[(var4 * 255 & 1047054) >> 12];
        int var6 = (var5 << 12) / this.field10634;
        int var7 = (var6 << 12) / this.field10639;
        if (arg2 > -78) {
            this.method4256(113, -75, (byte) 69);
        }
        int var8 = this.field10637 * var7 >> 12;
        return var8 > -arg0 + arg1 && -var8 < -arg0 + arg1;
    }

    @OriginalMember(owner = "client!vt", name = "<init>", descriptor = "()V", line = 119)
    public class763() {
        super(0, true);
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(Ldc;II)V", line = 122)
    public final void method183(class63 arg0, int arg1, int arg2) {
        if (arg1 != 11608) {
            this.method183((class63) null, 72, 101);
        }
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (arg2 != 2) {
                    if (~arg2 != -4) {
                        if (arg2 != 4) {
                            if (arg2 != 5) {
                                if (~arg2 == -7) {
                                    this.field10639 = arg0.method482(-772591672);
                                }
                            } else {
                                this.field10637 = arg0.method482(-772591672);
                            }
                        } else {
                            this.field10634 = arg0.method482(-772591672);
                        }
                    } else {
                        this.field10635 = arg0.method482(-772591672);
                    }
                } else {
                    this.field10638 = arg0.method482(-772591672);
                }
            } else {
                this.field10641 = arg0.method482(-772591672);
            }
        } else {
            this.field10643 = arg0.method482(-772591672);
        }
        ++field10636;
    }
}
