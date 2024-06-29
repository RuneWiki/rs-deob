import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public class class10 extends class40 {

    @OriginalMember(owner = "client!ds", name = "M", descriptor = "I")
    private int field128 = 4096;

    @OriginalMember(owner = "client!ds", name = "P", descriptor = "I")
    private int field131 = 0;

    @OriginalMember(owner = "client!ds", name = "L", descriptor = "[[I")
    public static int[][] field127 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!ds", name = "N", descriptor = "I")
    public static int field129 = 0;

    @OriginalMember(owner = "client!ds", name = "Q", descriptor = "[Lrg;")
    public static class385[] field132 = new class385[14];

    @OriginalMember(owner = "client!ds", name = "K", descriptor = "I")
    public static int field126;

    @OriginalMember(owner = "client!ds", name = "R", descriptor = "I")
    public static int field133;

    @OriginalMember(owner = "client!ds", name = "S", descriptor = "I")
    public static int field134;

    @OriginalMember(owner = "client!ds", name = "O", descriptor = "[[[B")
    public static byte[][][] field130;

    @OriginalMember(owner = "client!ds", name = "<init>", descriptor = "()V", line = 5)
    public class10() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(BI)[I", line = 10)
    public final int[] method44(byte arg0, int arg1) {
        ++field134;
        int[] var3 = super.field551.method185(65280, arg1);
        if (arg0 >= -20) {
            method54(-48);
        }
        if (super.field551.field441) {
            int[] var4 = this.method266((byte) -116, arg1, 0);
            for (int var5 = 0; class410.field5886 > var5; ++var5) {
                int var6 = var4[var5];
                var3[var5] = ~this.field131 >= ~var6 && ~var6 >= ~this.field128 ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ds", name = "c", descriptor = "(I)V", line = 67)
    public static void method54(int arg0) {
        field127 = null;
        field132 = null;
        field130 = null;
        if (arg0 != 1) {
            field130 = null;
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(IILlf;)V", line = 82)
    public final void method43(int arg0, int arg1, class130 arg2) {
        if (~arg0 != -1) {
            if (arg0 == 1) {
                this.field128 = arg2.method798(false);
            }
        } else {
            this.field131 = arg2.method798(false);
        }
        if (arg1 < 79) {
            field127 = null;
        }
        ++field133;
    }
}
