import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class464 extends class739 {

    @OriginalMember(owner = "client!id", name = "B", descriptor = "Lgr;")
    public static class530 field6620 = new class530(60, 15);

    @OriginalMember(owner = "client!id", name = "z", descriptor = "I")
    public static int field6619;

    @OriginalMember(owner = "client!id", name = "C", descriptor = "I")
    public static int field6621;

    @OriginalMember(owner = "client!id", name = "D", descriptor = "I")
    public static int field6622;

    @OriginalMember(owner = "client!id", name = "F", descriptor = "[I")
    public static int[] field6623;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Lsl;IB)V", line = 4)
    public final void method112(class479 arg0, int arg1, byte arg2) {
        if (~arg1 == -1) {
            super.field10320 = ~arg0.method2886(true) == -2;
        }
        ++field6622;
        if (arg2 != 1) {
            this.method113(-36, -117);
        }
    }

    @OriginalMember(owner = "client!id", name = "c", descriptor = "(I)V", line = 20)
    public static void method2814(int arg0) {
        if (arg0 != 0) {
            field6620 = null;
        }
        field6623 = null;
        field6620 = null;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ZI)[I", line = 32)
    public final int[] method445(boolean arg0, int arg1) {
        ++field6621;
        int[] var3 = super.field10317.method1042(0, arg1);
        if (arg0) {
            method2814(70);
        }
        if (super.field10317.field2170) {
            int[] var4 = this.method4127(arg1, 46, 0);
            for (int var5 = 0; class399.field5703 > var5; ++var5) {
                var3[var5] = -var4[var5] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(II)[[I", line = 66)
    public final int[][] method113(int arg0, int arg1) {
        if (arg1 != 8213) {
            return null;
        } else {
            ++field6619;
            int[][] var3 = super.field10328.method2106(arg0, true);
            if (super.field10328.field4727) {
                int[][] var4 = this.method4124(arg0, 0, true);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; ~class399.field5703 < ~var11; ++var11) {
                    var8[var11] = -var5[var11] + 4096;
                    var9[var11] = -var6[var11] + 4096;
                    var10[var11] = -var7[var11] + 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "()V", line = 113)
    public class464() {
        super(1, false);
    }
}
