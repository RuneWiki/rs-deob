import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class176 extends class52 {

    @OriginalMember(owner = "client!tf", name = "bb", descriptor = "I")
    private int field3555 = 0;

    @OriginalMember(owner = "client!tf", name = "lb", descriptor = "I")
    private int field3565 = 0;

    @OriginalMember(owner = "client!tf", name = "db", descriptor = "Z")
    public boolean field3557 = false;

    @OriginalMember(owner = "client!tf", name = "kb", descriptor = "I")
    public int field3564;

    @OriginalMember(owner = "client!tf", name = "tb", descriptor = "I")
    public int field3573;

    @OriginalMember(owner = "client!tf", name = "ub", descriptor = "I")
    public int field3574;

    @OriginalMember(owner = "client!tf", name = "gb", descriptor = "I")
    public int field3560;

    @OriginalMember(owner = "client!tf", name = "cb", descriptor = "I")
    private int field3556;

    @OriginalMember(owner = "client!tf", name = "sb", descriptor = "I")
    public int field3572;

    @OriginalMember(owner = "client!tf", name = "rb", descriptor = "Lpf;")
    private class140 field3571;

    @OriginalMember(owner = "client!tf", name = "fb", descriptor = "[I")
    public static int[] field3559 = new int[100];

    @OriginalMember(owner = "client!tf", name = "mb", descriptor = "I")
    public static int field3566 = 0;

    @OriginalMember(owner = "client!tf", name = "nb", descriptor = "I")
    public static int field3567 = 0;

    @OriginalMember(owner = "client!tf", name = "ob", descriptor = "I")
    public static int field3568 = 0;

    @OriginalMember(owner = "client!tf", name = "jb", descriptor = "Lea;")
    private static class38 field3563 = class9.method46((byte) 106, "Examine");

    @OriginalMember(owner = "client!tf", name = "hb", descriptor = "Lea;")
    public static class38 field3561 = field3563;

    @OriginalMember(owner = "client!tf", name = "eb", descriptor = "I")
    public static int field3558;

    @OriginalMember(owner = "client!tf", name = "ib", descriptor = "I")
    public static int field3562;

    @OriginalMember(owner = "client!tf", name = "pb", descriptor = "I")
    public static int field3569;

    @OriginalMember(owner = "client!tf", name = "ab", descriptor = "Ldd;")
    public static class32 field3554;

    @OriginalMember(owner = "client!tf", name = "qb", descriptor = "[Lfa;")
    public static class47[] field3570;

    @OriginalMember(owner = "client!tf", name = "i", descriptor = "(I)V")
    public static void method1220(int arg0) {
        field3570 = null;
        field3563 = null;
        if (arg0 == 6237) {
            field3554 = null;
            field3559 = null;
            field3561 = null;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IB)V")
    public final void method1221(int arg0, byte arg1) {
        field3562++;
        if (arg1 != 84) {
            this.field3555 = -4;
        }
        if (this.field3557) {
            return;
        }
        this.field3565 += arg0;
        while (this.field3571.field2938[this.field3555] < this.field3565) {
            this.field3565 -= this.field3571.field2938[this.field3555];
            this.field3555++;
            if (this.field3571.field2919.length <= this.field3555) {
                this.field3557 = true;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "(Z)Lrg;")
    public final class159 method220(boolean arg0) {
        field3569++;
        class198 var2 = class177.method1224((byte) 105, this.field3556);
        if (!arg0) {
            return null;
        }
        class159 var3;
        if (this.field3557) {
            var3 = var2.method1304(-1, true);
        } else {
            var3 = var2.method1304(this.field3555, arg0);
        }
        return var3 == null ? null : var3;
    }

    @OriginalMember(owner = "client!tf", name = "<init>", descriptor = "(IIIIIII)V")
    public class176(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field3564 = arg2;
        this.field3573 = arg3;
        this.field3574 = arg4;
        this.field3560 = arg5 + arg6;
        this.field3556 = arg0;
        this.field3572 = arg1;
        int var8 = class177.method1224((byte) 126, this.field3556).field3914;
        if (var8 == -1) {
            this.field3557 = true;
        } else {
            this.field3557 = false;
            this.field3571 = class139.method997(-107, var8);
        }
    }
}
