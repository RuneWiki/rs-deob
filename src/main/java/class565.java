import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qs")
public class class565 extends class615 {

    @OriginalMember(owner = "client!qs", name = "J", descriptor = "I")
    private int field7476 = 4096;

    @OriginalMember(owner = "client!qs", name = "M", descriptor = "I")
    private int field7479 = 0;

    @OriginalMember(owner = "client!qs", name = "L", descriptor = "Z")
    public static boolean field7478 = false;

    @OriginalMember(owner = "client!qs", name = "F", descriptor = "Ldb;")
    public static class298 field7472 = new class298(93, -1);

    @OriginalMember(owner = "client!qs", name = "G", descriptor = "I")
    public static int field7473;

    @OriginalMember(owner = "client!qs", name = "H", descriptor = "I")
    public static int field7474;

    @OriginalMember(owner = "client!qs", name = "I", descriptor = "I")
    public static int field7475;

    @OriginalMember(owner = "client!qs", name = "K", descriptor = "I")
    public static int field7477;

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(IIIII)V")
    public static final void method3096(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field7475;
        int var5 = -7 % ((24 - arg3) / 55);
        if (class310.field4279 <= arg0 && arg0 <= class442.field6058) {
            int var6 = class300.method1829(class600.field7959, arg4, 116, class366.field4956);
            int var7 = class300.method1829(class600.field7959, arg2, 124, class366.field4956);
            class370.method2179(var6, var7, 2, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(IB)[I")
    public final int[] method8(int arg0, byte arg1) {
        ++field7473;
        int[] var3 = super.field8125.method298(arg0, -122);
        if (arg1 != -18) {
            this.field7479 = -78;
        }
        if (super.field8125.field579) {
            int[] var4 = this.method3366(0, 997, arg0);
            for (int var5 = 0; ~class505.field6740 < ~var5; ++var5) {
                int var6 = var4[var5];
                var3[var5] = ~var6 <= ~this.field7479 && ~this.field7476 <= ~var6 ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qs", name = "<init>", descriptor = "()V")
    public class565() {
        super(1, true);
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(BILeh;)V")
    public final void method15(byte arg0, int arg1, class335 arg2) {
        ++field7477;
        if (arg0 >= 44) {
            if (arg1 != 0) {
                if (arg1 == 1) {
                    this.field7476 = arg2.method2001((byte) -83);
                }
            } else {
                this.field7479 = arg2.method2001((byte) -83);
            }
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(BII)Z")
    public static final boolean method3097(byte arg0, int arg1, int arg2) {
        if (arg0 != 17) {
            method3098((byte) 76);
        }
        ++field7474;
        return (class445.method2510((byte) -115, arg1, arg2) | class290.method1786(arg1, arg2, (byte) -86) | class480.method2679(arg1, arg0 + -18, arg2)) & class239.method1482(0, arg2, arg1);
    }

    @OriginalMember(owner = "client!qs", name = "d", descriptor = "(B)V")
    public static void method3098(byte arg0) {
        if (arg0 != 80) {
            field7472 = null;
        }
        field7472 = null;
    }
}
