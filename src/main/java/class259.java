import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jfa")
public class class259 extends class440 {

    @OriginalMember(owner = "client!jfa", name = "F", descriptor = "[[I")
    public static int[][] field3944 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!jfa", name = "D", descriptor = "J")
    public static long field3942 = 20000000L;

    @OriginalMember(owner = "client!jfa", name = "E", descriptor = "I")
    public static int field3943;

    @OriginalMember(owner = "client!jfa", name = "G", descriptor = "I")
    public static int field3945;

    @OriginalMember(owner = "client!jfa", name = "H", descriptor = "I")
    public static int field3946;

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(ILmo;I)V", line = 4)
    public final void method234(int arg0, class695 arg1, int arg2) {
        ++field3945;
        if (arg0 == 5) {
            if (arg2 == 0) {
                super.field6424 = arg1.method3826(false) == 1;
            }
        }
    }

    @OriginalMember(owner = "client!jfa", name = "b", descriptor = "(Z)V", line = 17)
    public static void method1712(boolean arg0) {
        if (!arg0) {
            method1712(true);
        }
        field3944 = null;
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(II)[[I", line = 28)
    public final int[][] method763(int arg0, int arg1) {
        ++field3943;
        int[][] var3 = super.field6417.method3769(arg1, -26435);
        if (arg0 != -5766) {
            this.method763(-25, -92);
        }
        if (super.field6417.field9606) {
            int[][] var4 = this.method2606(arg1, 0, -1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class549.field7715; ++var11) {
                var8[var11] = 4096 - var5[var11];
                var9[var11] = 4096 - var6[var11];
                var10[var11] = -var7[var11] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(BI)[I", line = 87)
    public final int[] method229(byte arg0, int arg1) {
        int var3 = 91 / ((arg0 - -56) / 41);
        ++field3946;
        int[] var4 = super.field6412.method3250((byte) 5, arg1);
        if (super.field6412.field8047) {
            int[] var5 = this.method2611(105, arg1, 0);
            for (int var6 = 0; ~class549.field7715 < ~var6; ++var6) {
                var4[var6] = -var5[var6] + 4096;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!jfa", name = "<init>", descriptor = "()V", line = 120)
    public class259() {
        super(1, false);
    }
}
