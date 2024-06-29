import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class475 extends class535 {

    @OriginalMember(owner = "client!fj", name = "J", descriptor = "I")
    private int field6923 = 20;

    @OriginalMember(owner = "client!fj", name = "I", descriptor = "I")
    private int field6922 = 0;

    @OriginalMember(owner = "client!fj", name = "P", descriptor = "I")
    private int field6928 = 0;

    @OriginalMember(owner = "client!fj", name = "K", descriptor = "I")
    private int field6924 = 1365;

    @OriginalMember(owner = "client!fj", name = "M", descriptor = "Lqv;")
    public static class316 field6925 = new class316(87, 0);

    @OriginalMember(owner = "client!fj", name = "R", descriptor = "Ldh;")
    public static class216 field6930 = new class216(5, 16);

    @OriginalMember(owner = "client!fj", name = "F", descriptor = "I")
    public static int field6919;

    @OriginalMember(owner = "client!fj", name = "G", descriptor = "I")
    public static int field6920;

    @OriginalMember(owner = "client!fj", name = "N", descriptor = "I")
    public static int field6926;

    @OriginalMember(owner = "client!fj", name = "O", descriptor = "I")
    public static int field6927;

    @OriginalMember(owner = "client!fj", name = "S", descriptor = "I")
    public static int field6931;

    @OriginalMember(owner = "client!fj", name = "H", descriptor = "Lci;")
    public static class320 field6921;

    @OriginalMember(owner = "client!fj", name = "Q", descriptor = "[I")
    public static int[] field6929;

    @OriginalMember(owner = "client!fj", name = "f", descriptor = "(B)V", line = 4)
    public static void method2816(byte arg0) {
        if (arg0 == 115) {
            field6925 = null;
            field6929 = null;
            field6930 = null;
            field6921 = null;
        }
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(II)[I", line = 21)
    public final int[] method65(int arg0, int arg1) {
        ++field6927;
        if (arg1 != 1) {
            method2817((byte) -41, (byte[][]) null, (class431) null);
        }
        int[] var3 = super.field7885.method974(arg1 + -30532, arg0);
        if (super.field7885.field2086) {
            for (int var4 = 0; ~class174.field2597 < ~var4; ++var4) {
                int var5 = (class539.field7939[var4] << 12) / this.field6924 + this.field6922;
                int var6 = (class448.field6442[arg0] << 12) / this.field6924 - -this.field6928;
                int var7 = var5;
                int var8 = var6;
                int var9 = var5;
                int var10 = var6;
                int var11 = var5 * var5 >> 12;
                int var12 = var6 * var6 >> 12;
                int var13;
                for (var13 = 0; ~(var11 - -var12) > -16385 && this.field6923 > var13; ++var13) {
                    var10 = (var9 * var10 >> 12) * 2 + var8;
                    var9 = var7 + var11 + -var12;
                    var11 = var9 * var9 >> 12;
                    var12 = var10 * var10 >> 12;
                }
                var3[var4] = var13 >= this.field6923 + -1 ? 0 : (var13 << 12) / this.field6923;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "()V", line = 118)
    public class475() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(B[[BLth;)V", line = 86)
    public static final void method2817(byte arg0, byte[][] arg1, class431 arg2) {
        ++field6926;
        int var3 = class25.field363.length;
        int var4 = 0;
        int var5 = -114 % ((arg0 - 26) / 39);
        while (var3 > var4) {
            byte[] var6 = arg1[var4];
            if (var6 != null) {
                int var7 = (field6929[var4] >> 8) * 64 + -class82.field1315;
                int var8 = (255 & field6929[var4]) * 64 - class501.field7240;
                class259.method1668(8101);
                arg2.method2559(var8, var6, var7, class19.field213, class76.field1256, -31596);
            }
            ++var4;
        }
    }

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "(II)I", line = 121)
    public static final int method2818(int arg0, int arg1) {
        ++field6919;
        if (~arg1 > -97) {
            return 0;
        } else if (arg1 < 128) {
            return 2;
        } else {
            if (arg0 != 0) {
                field6929 = null;
            }
            return 3;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(ILwn;I)V", line = 143)
    public final void method60(int arg0, class519 arg1, int arg2) {
        ++field6931;
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 != -3) {
                    if (~arg0 == -4) {
                        this.field6928 = arg1.method3018(566990904);
                    }
                } else {
                    this.field6922 = arg1.method3018(arg2 + 566997136);
                }
            } else {
                this.field6923 = arg1.method3018(566990904);
            }
        } else {
            this.field6924 = arg1.method3018(arg2 ^ -566984816);
        }
        if (arg2 != -6232) {
            field6930 = null;
        }
    }
}
