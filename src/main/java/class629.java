import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wca")
public class class629 extends class440 {

    @OriginalMember(owner = "client!wca", name = "D", descriptor = "Z")
    private boolean field8795 = true;

    @OriginalMember(owner = "client!wca", name = "K", descriptor = "Z")
    private boolean field8799 = true;

    @OriginalMember(owner = "client!wca", name = "F", descriptor = "[I")
    public static int[] field8796 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!wca", name = "M", descriptor = "[I")
    public static int[] field8801 = new int[2048];

    @OriginalMember(owner = "client!wca", name = "C", descriptor = "I")
    public static int field8794;

    @OriginalMember(owner = "client!wca", name = "H", descriptor = "I")
    public static int field8797;

    @OriginalMember(owner = "client!wca", name = "J", descriptor = "I")
    public static int field8798;

    @OriginalMember(owner = "client!wca", name = "L", descriptor = "I")
    public static int field8800;

    @OriginalMember(owner = "client!wca", name = "N", descriptor = "I")
    public static int field8802;

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(Lde;I)V", line = 3)
    public static final void method3506(class491 arg0, int arg1) {
        if (arg1 != 1) {
            method3506((class491) null, -103);
        }
        ++field8797;
        class28 var2 = (class28) class423.field6151.method1405((long) arg0.field6216, (byte) -96);
        if (var2 != null) {
            if (var2.field430 != null) {
                class627.field8780.method2114(var2.field430);
                var2.field430 = null;
            }
            var2.method3678(-1);
        }
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(BIII)Ld;", line = 30)
    public static final class135 method3507(byte arg0, int arg1, int arg2, int arg3) {
        ++field8800;
        class135 var4 = null;
        if (arg3 == 0) {
            ++class514.field7266;
            var4 = class688.method3794(class159.field2282, class583.field8198, (byte) 38);
        }
        if (~arg3 == -2) {
            ++class321.field4708;
            var4 = class688.method3794(class146.field2127, class583.field8198, (byte) 38);
        }
        var4.field1978.method3840(false, class203.field2874 + arg1);
        var4.field1978.method3840(false, class109.field1672 + arg2);
        var4.field1978.method3870(!class603.field8514.method1364(true, 82) ? 0 : 1, 2820);
        class535.field7508 = arg2;
        class674.field9547 = arg1;
        class627.field8775 = false;
        class640.method3566(3);
        if (arg0 > -82) {
            field8801 = null;
        }
        return var4;
    }

    @OriginalMember(owner = "client!wca", name = "g", descriptor = "(I)V", line = 64)
    public static void method3508(int arg0) {
        field8796 = null;
        if (arg0 != -2) {
            field8796 = null;
        }
        field8801 = null;
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(BI)[I", line = 76)
    public final int[] method229(byte arg0, int arg1) {
        ++field8802;
        int[] var3 = super.field6412.method3250((byte) 5, arg1);
        if (super.field6412.field8047) {
            int[] var4 = this.method2611(115, !this.field8795 ? arg1 : -arg1 + class651.field9116, 0);
            if (!this.field8799) {
                class476.method2793(var4, 0, var3, 0, class549.field7715);
            } else {
                for (int var5 = 0; var5 < class549.field7715; ++var5) {
                    var3[var5] = var4[class420.field6112 - var5];
                }
            }
        }
        int var6 = -89 / ((arg0 - -56) / 41);
        return var3;
    }

    @OriginalMember(owner = "client!wca", name = "<init>", descriptor = "()V", line = 116)
    public class629() {
        super(1, false);
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(II)[[I", line = 119)
    public final int[][] method763(int arg0, int arg1) {
        if (arg0 != -5766) {
            return null;
        } else {
            ++field8798;
            int[][] var3 = super.field6417.method3769(arg1, -26435);
            if (super.field6417.field9606) {
                int[][] var4 = this.method2606(this.field8795 ? -arg1 + class651.field9116 : arg1, 0, -1);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                if (this.field8799) {
                    for (int var11 = 0; ~class549.field7715 < ~var11; ++var11) {
                        var8[var11] = var5[-var11 + class420.field6112];
                        var9[var11] = var6[-var11 + class420.field6112];
                        var10[var11] = var7[-var11 + class420.field6112];
                    }
                } else {
                    for (int var12 = 0; ~class549.field7715 < ~var12; ++var12) {
                        var8[var12] = var5[var12];
                        var9[var12] = var6[var12];
                        var10[var12] = var7[var12];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(ILmo;I)V", line = 185)
    public final void method234(int arg0, class695 arg1, int arg2) {
        ++field8794;
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (~arg2 == -3) {
                    super.field6424 = ~arg1.method3826(false) == -2;
                }
            } else {
                this.field8795 = arg1.method3826(false) == 1;
            }
        } else {
            this.field8799 = ~arg1.method3826(false) == -2;
        }
        if (arg0 != 5) {
            this.method763(-94, -4);
        }
    }
}
