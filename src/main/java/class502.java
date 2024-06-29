import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class502 extends class404 {

    @OriginalMember(owner = "client!qc", name = "z", descriptor = "I")
    private int field7593 = 4096;

    @OriginalMember(owner = "client!qc", name = "B", descriptor = "I")
    private int field7595 = 409;

    @OriginalMember(owner = "client!qc", name = "E", descriptor = "[I")
    private int[] field7598 = new int[3];

    @OriginalMember(owner = "client!qc", name = "G", descriptor = "I")
    private int field7599 = 4096;

    @OriginalMember(owner = "client!qc", name = "I", descriptor = "I")
    private int field7601 = 4096;

    @OriginalMember(owner = "client!qc", name = "A", descriptor = "Lnd;")
    public static class366 field7594 = new class366(8, 7);

    @OriginalMember(owner = "client!qc", name = "C", descriptor = "I")
    public static int field7596;

    @OriginalMember(owner = "client!qc", name = "D", descriptor = "I")
    public static int field7597;

    @OriginalMember(owner = "client!qc", name = "H", descriptor = "I")
    public static int field7600;

    @OriginalMember(owner = "client!qc", name = "J", descriptor = "I")
    public static int field7602;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILha;I)V")
    public final void method87(int arg0, class40 arg1, int arg2) {
        if (arg0 == 0) {
            if (arg2 != 0) {
                if (arg2 != 1) {
                    if (arg2 != 2) {
                        if (arg2 != 3) {
                            if (~arg2 == -5) {
                                int var5 = arg1.method224(arg0 + -2);
                                this.field7598[1] = class330.method2050(var5 >> 4, 4080);
                                this.field7598[2] = class330.method2050(255, var5) >> 12;
                                this.field7598[0] = class330.method2050(var5, 16711680) << 4;
                            }
                        } else {
                            this.field7599 = arg1.method254((byte) -38);
                        }
                    } else {
                        this.field7601 = arg1.method254((byte) -66);
                    }
                } else {
                    this.field7593 = arg1.method254((byte) -31);
                }
            } else {
                this.field7595 = arg1.method254((byte) -108);
            }
            ++field7600;
        }
    }

    @OriginalMember(owner = "client!qc", name = "h", descriptor = "(I)V")
    public static void method3010(int arg0) {
        int var1 = -92 % ((arg0 - -42) / 37);
        field7594 = null;
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(II)[[I")
    public final int[][] method89(int arg0, int arg1) {
        ++field7597;
        int[][] var3 = super.field5869.method2819(arg1, 1);
        if (arg0 != -1) {
            this.field7599 = 38;
        }
        if (super.field5869.field7156) {
            int[][] var4 = this.method2400(arg0 + -11871, arg1, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class431.field6348; ++var11) {
                int var12 = var5[var11];
                int var13 = var12 - this.field7598[0];
                if (var13 < 0) {
                    var13 = -var13;
                }
                if (this.field7595 < var13) {
                    var8[var11] = var12;
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                } else {
                    int var14 = var6[var11];
                    int var15 = var14 - this.field7598[1];
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (this.field7595 < var15) {
                        var8[var11] = var12;
                        var9[var11] = var14;
                        var10[var11] = var7[var11];
                    } else {
                        int var16 = var7[var11];
                        int var17 = -this.field7598[2] + var16;
                        if (~var17 > -1) {
                            var17 = -var17;
                        }
                        if (~this.field7595 > ~var17) {
                            var8[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var16;
                        } else {
                            var8[var11] = this.field7599 * var12 >> 12;
                            var9[var11] = this.field7601 * var14 >> 12;
                            var10[var11] = this.field7593 * var16 >> 12;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(IBI)V")
    public static final void method3011(int arg0, byte arg1, int arg2) {
        if (arg1 >= -24) {
            field7602 = -114;
        }
        ++field7596;
        class64 var3 = class230.method1387(arg2, (byte) 40, 5);
        var3.method441((byte) 58);
        var3.field1051 = arg0;
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "()V")
    public class502() {
        super(1, false);
    }
}
