import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public class class21 extends class30 {

    @OriginalMember(owner = "client!qo", name = "z", descriptor = "I")
    private int field237 = 4096;

    @OriginalMember(owner = "client!qo", name = "F", descriptor = "I")
    private int field242 = 0;

    @OriginalMember(owner = "client!qo", name = "B", descriptor = "Z")
    public static boolean field239 = false;

    @OriginalMember(owner = "client!qo", name = "D", descriptor = "Lrg;")
    public static class596 field240 = new class596(1, 19);

    @OriginalMember(owner = "client!qo", name = "E", descriptor = "F")
    public static float field241;

    @OriginalMember(owner = "client!qo", name = "A", descriptor = "I")
    public static int field238;

    @OriginalMember(owner = "client!qo", name = "G", descriptor = "I")
    public static int field243;

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(BILac;)V", line = 4)
    public final void method27(byte arg0, int arg1, class501 arg2) {
        if (arg1 != 0) {
            if (~arg1 == -2) {
                this.field237 = arg2.method2845(-1);
            }
        } else {
            this.field242 = arg2.method2845(-1);
        }
        if (arg0 <= 100) {
            field240 = null;
        }
        ++field238;
    }

    @OriginalMember(owner = "client!qo", name = "d", descriptor = "(I)V", line = 38)
    public static void method228(int arg0) {
        field240 = null;
        int var1 = 101 % ((39 - arg0) / 55);
    }

    @OriginalMember(owner = "client!qo", name = "<init>", descriptor = "()V", line = 97)
    public class21() {
        super(1, true);
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(II)[I", line = 58)
    public final int[] method48(int arg0, int arg1) {
        ++field243;
        int[] var3 = super.field374.method3664(arg1, (byte) 8);
        if (super.field374.field9032) {
            int[] var4 = this.method294(arg1, 0, (byte) 104);
            for (int var5 = 0; ~class31.field399 < ~var5; ++var5) {
                int var6 = var4[var5];
                var3[var5] = this.field242 <= var6 && var6 <= this.field237 ? 4096 : 0;
            }
        }
        return arg0 != 1 ? null : var3;
    }
}
