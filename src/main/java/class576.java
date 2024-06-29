import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bha")
public class class576 extends class38 {

    @OriginalMember(owner = "client!bha", name = "D", descriptor = "I")
    private int field8147 = 4096;

    @OriginalMember(owner = "client!bha", name = "F", descriptor = "I")
    private int field8149 = 4096;

    @OriginalMember(owner = "client!bha", name = "I", descriptor = "I")
    private int field8152 = 4096;

    @OriginalMember(owner = "client!bha", name = "H", descriptor = "Ljm;")
    public static class691 field8151 = class30.method149((byte) 92);

    @OriginalMember(owner = "client!bha", name = "E", descriptor = "I")
    public static int field8148;

    @OriginalMember(owner = "client!bha", name = "G", descriptor = "I")
    public static int field8150;

    @OriginalMember(owner = "client!bha", name = "f", descriptor = "(B)V", line = 4)
    public static void method3337(byte arg0) {
        field8151 = null;
        if (arg0 > -58) {
            method3337((byte) -114);
        }
    }

    @OriginalMember(owner = "client!bha", name = "<init>", descriptor = "()V", line = 24)
    public class576() {
        super(1, false);
    }

    @OriginalMember(owner = "client!bha", name = "a", descriptor = "(IILrg;)V", line = 30)
    public final void method190(int arg0, int arg1, class645 arg2) {
        if (arg0 >= 34) {
            ++field8148;
            if (arg1 != 0) {
                if (~arg1 != -2) {
                    if (arg1 == 2) {
                        this.field8149 = arg2.method3712((byte) -112);
                    }
                } else {
                    this.field8147 = arg2.method3712((byte) -119);
                }
            } else {
                this.field8152 = arg2.method3712((byte) -1);
            }
        }
    }

    @OriginalMember(owner = "client!bha", name = "a", descriptor = "(II)[[I", line = 77)
    public final int[][] method196(int arg0, int arg1) {
        ++field8150;
        if (arg0 != -18210) {
            this.field8152 = -98;
        }
        int[][] var3 = super.field387.method2809(arg1, (byte) -48);
        if (super.field387.field6792) {
            int[][] var4 = this.method195(true, 0, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class729.field10216; ++var11) {
                int var12 = var5[var11];
                int var13 = var7[var11];
                int var14 = var6[var11];
                if (~var12 == ~var13 && ~var13 == ~var14) {
                    var8[var11] = this.field8152 * var12 >> 12;
                    var9[var11] = this.field8147 * var13 >> 12;
                    var10[var11] = this.field8149 * var14 >> 12;
                } else {
                    var8[var11] = this.field8152;
                    var9[var11] = this.field8147;
                    var10[var11] = this.field8149;
                }
            }
        }
        return var3;
    }
}
