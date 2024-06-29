import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class765 extends class325 {

    @OriginalMember(owner = "client!fm", name = "G", descriptor = "I")
    private int field10573 = 4096;

    @OriginalMember(owner = "client!fm", name = "H", descriptor = "Lmga;")
    public static class739 field10574 = new class739(45, 7);

    @OriginalMember(owner = "client!fm", name = "I", descriptor = "Ltm;")
    public static class412 field10575 = new class412();

    @OriginalMember(owner = "client!fm", name = "D", descriptor = "I")
    public static int field10571;

    @OriginalMember(owner = "client!fm", name = "F", descriptor = "I")
    public static int field10572;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(Ljp;IB)V", line = 3)
    public final void method95(class376 arg0, int arg1, byte arg2) {
        if (~arg1 == -1) {
            this.field10573 = arg0.method2359(-1);
        }
        ++field10572;
        if (arg2 > -41) {
            method4246(-124);
        }
    }

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "(I)V", line = 21)
    public static void method4246(int arg0) {
        field10574 = null;
        if (arg0 == -1) {
            field10575 = null;
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(BI)[I", line = 33)
    public final int[] method100(byte arg0, int arg1) {
        ++field10571;
        if (arg0 <= 21) {
            this.field10573 = 34;
        }
        int[] var3 = super.field4727.method2603(arg1, -13476);
        if (super.field4727.field6067) {
            int[] var4 = this.method2062(arg1 + -1 & class566.field7574, 0, (byte) 33);
            int[] var5 = this.method2062(arg1, 0, (byte) 33);
            int[] var6 = this.method2062(arg1 + 1 & class566.field7574, 0, (byte) 33);
            for (int var7 = 0; ~var7 > ~class261.field3874; ++var7) {
                int var8 = (var6[var7] + -var4[var7]) * this.field10573;
                int var9 = (var5[class625.field8423 & var7 - -1] - var5[var7 + -1 & class625.field8423]) * this.field10573;
                int var10 = var9 >> 12;
                int var11 = var8 >> 12;
                int var12 = var10 * var10 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = (int) (4096.0D * Math.sqrt((double) ((float) (var12 + var13 + 4096) / 4096.0F)));
                int var15 = var14 != 0 ? 16777216 / var14 : 0;
                var3[var7] = -var15 + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIIII)V", line = 86)
    public static final void method4247(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class176.field2351 != null) {
            class176.field2351[arg0][arg1] = -16777216 | arg2;
        }
        if (class767.field10581 != null) {
            class767.field10581[arg0][arg1] = (short) arg3;
        }
        if (class261.field3883 != null) {
            class261.field3883[arg0][arg1] = (byte) arg4;
        }
    }

    @OriginalMember(owner = "client!fm", name = "<init>", descriptor = "()V", line = 107)
    public class765() {
        super(1, true);
    }
}
