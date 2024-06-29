import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nca")
public class class628 {

    @OriginalMember(owner = "client!nca", name = "g", descriptor = "I")
    public int field8810 = 128;

    @OriginalMember(owner = "client!nca", name = "i", descriptor = "I")
    public int field8812 = 128;

    @OriginalMember(owner = "client!nca", name = "f", descriptor = "I")
    public int field8809;

    @OriginalMember(owner = "client!nca", name = "h", descriptor = "I")
    public int field8811;

    @OriginalMember(owner = "client!nca", name = "j", descriptor = "I")
    public int field8813;

    @OriginalMember(owner = "client!nca", name = "d", descriptor = "I")
    public int field8807;

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "I")
    public static int field8804;

    @OriginalMember(owner = "client!nca", name = "b", descriptor = "I")
    public static int field8805;

    @OriginalMember(owner = "client!nca", name = "c", descriptor = "I")
    public static int field8806;

    @OriginalMember(owner = "client!nca", name = "e", descriptor = "I")
    public static int field8808;

    @OriginalMember(owner = "client!nca", name = "k", descriptor = "I")
    public static int field8814;

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(B)Lnca;", line = 8)
    public final class628 method3562(byte arg0) {
        field8806++;
        return arg0 == -18 ? new class628(this.field8809, this.field8810, this.field8812, this.field8811, this.field8813, this.field8807) : null;
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(ILnca;)V", line = 21)
    public final void method3563(int arg0, class628 arg1) {
        this.field8810 = arg1.field8810;
        this.field8813 = arg1.field8813;
        this.field8809 = arg1.field8809;
        this.field8807 = arg1.field8807;
        this.field8812 = arg1.field8812;
        field8805++;
        this.field8811 = arg1.field8811;
        int var3 = 100 / ((arg0 + 31) / 60);
    }

    @OriginalMember(owner = "client!nca", name = "b", descriptor = "(B)V", line = 36)
    public static final void method3564(byte arg0) {
        field8804++;
        if (class510.field7397 != null) {
            return;
        }
        class510.field7397 = new int[65536];
        double var1 = (Math.random() * 0.03D - 0.015D) + 0.7D;
        int var3 = 0;
        if (arg0 < 114) {
            field8814 = 106;
        }
        while (var3 < 65536) {
            double var4 = (double) (var3 >> 10 & 0x3F) / 64.0D + 0.0078125D;
            double var6 = (double) (var3 >> 7 & 0x7) / 8.0D + 0.0625D;
            double var8 = (double) (var3 & 0x7F) / 128.0D;
            double var10 = var8;
            double var12 = var8;
            double var14 = var8;
            if (var6 != 0.0D) {
                double var16;
                if (var8 < 0.5D) {
                    var16 = (var6 + 1.0D) * var8;
                } else {
                    var16 = var6 + var8 - (var6 * var8);
                }
                double var18 = var8 * 2.0D - var16;
                double var20 = var4 + 0.3333333333333333D;
                if (var20 > 1.0D) {
                    var20--;
                }
                double var24 = var4 - 0.3333333333333333D;
                if (var24 < 0.0D) {
                    var24++;
                }
                if (var4 * 6.0D < 1.0D) {
                    var12 = (var16 - var18) * 6.0D * var4 + var18;
                } else if ((var4 * 2.0D < 1.0D)) {
                    var12 = var16;
                } else if ((var4 * 3.0D < 2.0D)) {
                    var12 = (var16 - var18) * (0.6666666666666666D - var4) * 6.0D + var18;
                } else {
                    var12 = var18;
                }
                if (var20 * 6.0D < 1.0D) {
                    var10 = (var16 - var18) * 6.0D * var20 + var18;
                } else if ((var20 * 2.0D < 1.0D)) {
                    var10 = var16;
                } else if (var20 * 3.0D < 2.0D) {
                    var10 = (var16 - var18) * (0.6666666666666666D - var20) * 6.0D + var18;
                } else {
                    var10 = var18;
                }
                if (var24 * 6.0D < 1.0D) {
                    var14 = (var16 - var18) * 6.0D * var24 + var18;
                } else if ((var24 * 2.0D < 1.0D)) {
                    var14 = var16;
                } else if ((var24 * 3.0D < 2.0D)) {
                    var14 = (0.6666666666666666D - var24) * (var16 - var18) * 6.0D + var18;
                } else {
                    var14 = var18;
                }
            }
            double var26 = Math.pow(var10, var1);
            double var28 = Math.pow(var12, var1);
            double var30 = Math.pow(var14, var1);
            int var32 = (int) (var26 * 256.0D);
            int var33 = (int) (var28 * 256.0D);
            int var34 = (int) (var30 * 256.0D);
            int var35 = (var33 << 8) + (var32 << 16) + var34;
            class510.field7397[var3] = var35;
            var3++;
        }
    }

    @OriginalMember(owner = "client!nca", name = "<init>", descriptor = "(I)V", line = 159)
    public class628(int arg0) {
        this.field8809 = arg0;
    }

    @OriginalMember(owner = "client!nca", name = "<init>", descriptor = "(IIIIII)V", line = 166)
    private class628(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field8809 = arg0;
        this.field8811 = arg3;
        this.field8812 = arg2;
        this.field8810 = arg1;
        this.field8813 = arg4;
        this.field8807 = arg5;
    }
}
