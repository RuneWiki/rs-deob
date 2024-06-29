import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class394 extends class642 {

    @OriginalMember(owner = "client!jm", name = "G", descriptor = "I")
    private int field5967 = 0;

    @OriginalMember(owner = "client!jm", name = "J", descriptor = "I")
    private int field5970 = 4096;

    @OriginalMember(owner = "client!jm", name = "I", descriptor = "[Z")
    public static boolean[] field5969 = new boolean[100];

    @OriginalMember(owner = "client!jm", name = "B", descriptor = "I")
    public static int field5963;

    @OriginalMember(owner = "client!jm", name = "C", descriptor = "I")
    public static int field5964;

    @OriginalMember(owner = "client!jm", name = "D", descriptor = "I")
    public static int field5965;

    @OriginalMember(owner = "client!jm", name = "F", descriptor = "I")
    public static int field5966;

    @OriginalMember(owner = "client!jm", name = "H", descriptor = "Lmv;")
    public static class295 field5968;

    @OriginalMember(owner = "client!jm", name = "f", descriptor = "(I)V", line = 5)
    public static void method2451(int arg0) {
        if (arg0 != 0) {
            method2451(15);
        }
        field5969 = null;
        field5968 = null;
    }

    @OriginalMember(owner = "client!jm", name = "<init>", descriptor = "()V", line = 17)
    public class394() {
        super(1, true);
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(ILgk;B)V", line = 26)
    public final void method1(int arg0, class540 arg1, byte arg2) {
        ++field5964;
        if (arg2 >= 29) {
            if (arg0 != 0) {
                if (arg0 == 1) {
                    this.field5970 = arg1.method3169(26488);
                }
            } else {
                this.field5967 = arg1.method3169(26488);
            }
        }
    }

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "(B)Lida;", line = 60)
    public static final class604 method2452(byte arg0) {
        ++field5966;
        if (arg0 >= -61) {
            field5969 = null;
        }
        return class55.field833;
    }

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "(II)[I", line = 77)
    public final int[] method3(int arg0, int arg1) {
        ++field5965;
        int[] var3 = super.field9216.method1185(arg0, arg1 ^ 83);
        if (arg1 != -9) {
            field5969 = null;
        }
        if (super.field9216.field2418) {
            int[] var4 = this.method3658((byte) 90, arg0, 0);
            for (int var5 = 0; class338.field4909 > var5; ++var5) {
                int var6 = var4[var5];
                var3[var5] = ~var6 <= ~this.field5967 && this.field5970 >= var6 ? 4096 : 0;
            }
        }
        return var3;
    }
}
