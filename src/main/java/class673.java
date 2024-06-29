import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class673 extends class694 {

    @OriginalMember(owner = "client!fm", name = "F", descriptor = "I")
    private int field9473 = 2048;

    @OriginalMember(owner = "client!fm", name = "I", descriptor = "I")
    private int field9476 = 3072;

    @OriginalMember(owner = "client!fm", name = "G", descriptor = "I")
    private int field9474 = 1024;

    @OriginalMember(owner = "client!fm", name = "L", descriptor = "Lof;")
    public static class568 field9479 = new class568(11, 6);

    @OriginalMember(owner = "client!fm", name = "M", descriptor = "I")
    public static int field9480 = 0;

    @OriginalMember(owner = "client!fm", name = "H", descriptor = "I")
    public static int field9475;

    @OriginalMember(owner = "client!fm", name = "J", descriptor = "I")
    public static int field9477;

    @OriginalMember(owner = "client!fm", name = "K", descriptor = "I")
    public static int field9478;

    @OriginalMember(owner = "client!fm", name = "N", descriptor = "I")
    public static int field9481;

    @OriginalMember(owner = "client!fm", name = "O", descriptor = "I")
    public static int field9482;

    @OriginalMember(owner = "client!fm", name = "c", descriptor = "(II)[[I")
    public final int[][] method15(int arg0, int arg1) {
        ++field9477;
        int[][] var3 = super.field9740.method3483(arg1, true);
        if (super.field9740.field8738) {
            int[][] var4 = this.method3812(arg1, 0, -14032);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class465.field6544; ++var11) {
                var8[var11] = (var5[var11] * this.field9473 >> 12) + this.field9474;
                var9[var11] = (var6[var11] * this.field9473 >> 12) + this.field9474;
                var10[var11] = (var7[var11] * this.field9473 >> 12) + this.field9474;
            }
        }
        return arg0 != -22151 ? null : var3;
    }

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "(Z)V")
    public static void method3723(boolean arg0) {
        if (arg0) {
            field9479 = null;
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(II)[I")
    public final int[] method39(int arg0, int arg1) {
        ++field9478;
        if (arg0 <= 112) {
            return null;
        } else {
            int[] var3 = super.field9751.method2712(arg1, (byte) 118);
            if (super.field9751.field6674) {
                int[] var4 = this.method3809(0, arg1, (byte) 35);
                for (int var5 = 0; class465.field6544 > var5; ++var5) {
                    var3[var5] = (var4[var5] * this.field9473 >> 12) + this.field9474;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!fm", name = "<init>", descriptor = "()V")
    public class673() {
        super(1, false);
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(ZIZ)I")
    public static final int method3724(boolean arg0, int arg1, boolean arg2) {
        ++field9481;
        if (arg0) {
            return 0;
        } else {
            class421 var3 = class172.method1175(arg2, arg0, arg1);
            if (var3 == null) {
                return class63.field837.method2053(arg1, -77).field9673;
            } else {
                int var4 = 0;
                for (int var5 = 0; ~var3.field5945.length < ~var5; ++var5) {
                    if (var3.field5945[var5] == -1) {
                        ++var4;
                    }
                }
                return var4 + (class63.field837.method2053(arg1, -61).field9673 - var3.field5945.length);
            }
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(ILjr;B)V")
    public final void method19(int arg0, class96 arg1, byte arg2) {
        ++field9482;
        int var4 = 11 / ((58 - arg2) / 63);
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 == -3) {
                    super.field9744 = arg1.method718(76) == 1;
                }
            } else {
                this.field9476 = arg1.method743((byte) -14);
            }
        } else {
            this.field9474 = arg1.method743((byte) -60);
        }
    }

    @OriginalMember(owner = "client!fm", name = "g", descriptor = "(I)V")
    public final void method40(int arg0) {
        this.field9473 = -this.field9474 + this.field9476;
        ++field9475;
        if (arg0 < 5) {
            this.method40(12);
        }
    }
}
