import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class615 extends class354 {

    @OriginalMember(owner = "client!te", name = "h", descriptor = "[I")
    public static int[] field8486 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!te", name = "o", descriptor = "Lhg;")
    public static class693 field8493 = new class693(34, 7);

    @OriginalMember(owner = "client!te", name = "k", descriptor = "D")
    public static double field8489;

    @OriginalMember(owner = "client!te", name = "i", descriptor = "I")
    public static int field8487;

    @OriginalMember(owner = "client!te", name = "j", descriptor = "I")
    public static int field8488;

    @OriginalMember(owner = "client!te", name = "l", descriptor = "I")
    public static int field8490;

    @OriginalMember(owner = "client!te", name = "m", descriptor = "I")
    public static int field8491;

    @OriginalMember(owner = "client!te", name = "n", descriptor = "I")
    public static int field8492;

    @OriginalMember(owner = "client!te", name = "q", descriptor = "I")
    public static int field8495;

    @OriginalMember(owner = "client!te", name = "p", descriptor = "[I")
    public static int[] field8494;

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(B)I", line = 3)
    public final int method3441(byte arg0) {
        ++field8491;
        int var2 = -118 % ((7 - arg0) / 45);
        return super.field4545;
    }

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "(ILwo;)V", line = 14)
    public class615(int arg0, class746 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(II)I", line = 19)
    public final int method391(int arg0, int arg1) {
        ++field8492;
        if (arg0 != 3) {
            field8493 = null;
        }
        return 1;
    }

    @OriginalMember(owner = "client!te", name = "c", descriptor = "(I)V", line = 30)
    public static void method3442(int arg0) {
        field8494 = null;
        field8486 = null;
        if (arg0 == 19004) {
            field8493 = null;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(I)V", line = 46)
    public final void method388(int arg0) {
        if (arg0 != 6384) {
            method3442(84);
        }
        if (super.field4545 < 1 || ~super.field4545 < -4) {
            super.field4545 = this.method393((byte) -35);
        }
        ++field8490;
    }

    @OriginalMember(owner = "client!te", name = "c", descriptor = "(II)V", line = 62)
    public final void method389(int arg0, int arg1) {
        super.field4545 = arg1;
        if (arg0 == -1) {
            ++field8488;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(B)I", line = 77)
    public final int method393(byte arg0) {
        int var2 = 39 / ((37 - arg0) / 63);
        ++field8487;
        return !super.field4544.method4148((byte) 104).method23(32) ? 2 : 3;
    }

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "(Lwo;)V", line = 87)
    public class615(class746 arg0) {
        super(arg0);
    }
}
