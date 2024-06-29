import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cca")
public class class250 extends class601 {

    @OriginalMember(owner = "client!cca", name = "E", descriptor = "I")
    private int field3442 = 0;

    @OriginalMember(owner = "client!cca", name = "K", descriptor = "I")
    private int field3447 = 4096;

    @OriginalMember(owner = "client!cca", name = "G", descriptor = "I")
    public static int field3444 = 0;

    @OriginalMember(owner = "client!cca", name = "D", descriptor = "Lhda;")
    public static class752 field3441 = new class752(94, -2);

    @OriginalMember(owner = "client!cca", name = "C", descriptor = "I")
    public static int field3440;

    @OriginalMember(owner = "client!cca", name = "F", descriptor = "I")
    public static int field3443;

    @OriginalMember(owner = "client!cca", name = "I", descriptor = "Lwu;")
    public static class376 field3445;

    @OriginalMember(owner = "client!cca", name = "J", descriptor = "[I")
    public static int[] field3446;

    @OriginalMember(owner = "client!cca", name = "L", descriptor = "[Lhu;")
    public static class133[] field3448;

    @OriginalMember(owner = "client!cca", name = "e", descriptor = "(I)V", line = 6)
    public static void method1530(int arg0) {
        field3446 = null;
        field3441 = null;
        field3448 = null;
        if (arg0 != 4521) {
            field3448 = null;
        }
        field3445 = null;
    }

    @OriginalMember(owner = "client!cca", name = "<init>", descriptor = "()V", line = 62)
    public class250() {
        super(1, true);
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(BI)[I", line = 24)
    public final int[] method5(byte arg0, int arg1) {
        ++field3443;
        int[] var3 = super.field7902.method382(arg1, true);
        if (arg0 != -40) {
            method1530(-64);
        }
        if (super.field7902.field704) {
            int[] var4 = this.method3266((byte) 64, arg1, 0);
            for (int var5 = 0; ~class171.field2624 < ~var5; ++var5) {
                int var6 = var4[var5];
                var3[var5] = var6 >= this.field3442 && var6 <= this.field3447 ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(Lee;BI)V", line = 69)
    public final void method6(class677 arg0, byte arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 == -2) {
                this.field3447 = arg0.method3807(-1);
            }
        } else {
            this.field3442 = arg0.method3807(-1);
        }
        ++field3440;
        if (arg1 != -61) {
            field3448 = null;
        }
    }
}
