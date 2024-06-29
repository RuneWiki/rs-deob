import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class197 extends class89 {

    @OriginalMember(owner = "client!sc", name = "J", descriptor = "[I")
    public int[] field3674 = new int[5];

    @OriginalMember(owner = "client!sc", name = "H", descriptor = "[Lpd;")
    public class167[] field3672 = new class167[5];

    @OriginalMember(owner = "client!sc", name = "V", descriptor = "I")
    public int field3686 = 0;

    @OriginalMember(owner = "client!sc", name = "F", descriptor = "I")
    public int field3670;

    @OriginalMember(owner = "client!sc", name = "v", descriptor = "I")
    public int field3661;

    @OriginalMember(owner = "client!sc", name = "z", descriptor = "I")
    public int field3665;

    @OriginalMember(owner = "client!sc", name = "R", descriptor = "I")
    public int field3682;

    @OriginalMember(owner = "client!sc", name = "m", descriptor = "Lqe;")
    public static class179 field3652 = class206.method1380("http:)4)4", (byte) -128);

    @OriginalMember(owner = "client!sc", name = "n", descriptor = "Lqe;")
    private static class179 field3653 = class206.method1380("red:", (byte) 74);

    @OriginalMember(owner = "client!sc", name = "o", descriptor = "Lqe;")
    public static class179 field3654 = field3653;

    @OriginalMember(owner = "client!sc", name = "p", descriptor = "Lqe;")
    public static class179 field3655 = class206.method1380("<br>(X", (byte) 127);

    @OriginalMember(owner = "client!sc", name = "s", descriptor = "Lqe;")
    public static class179 field3658 = class206.method1380("headicons_pk", (byte) -126);

    @OriginalMember(owner = "client!sc", name = "I", descriptor = "Lqe;")
    public static class179 field3673 = field3653;

    @OriginalMember(owner = "client!sc", name = "U", descriptor = "Lqe;")
    private static class179 field3685 = class206.method1380("Members only world", (byte) -126);

    @OriginalMember(owner = "client!sc", name = "y", descriptor = "Lqe;")
    public static class179 field3664 = class206.method1380("rot:", (byte) -126);

    @OriginalMember(owner = "client!sc", name = "q", descriptor = "Lqe;")
    public static class179 field3656 = field3685;

    @OriginalMember(owner = "client!sc", name = "r", descriptor = "I")
    public static int field3657;

    @OriginalMember(owner = "client!sc", name = "t", descriptor = "I")
    public static int field3659;

    @OriginalMember(owner = "client!sc", name = "u", descriptor = "I")
    public int field3660;

    @OriginalMember(owner = "client!sc", name = "w", descriptor = "I")
    public int field3662;

    @OriginalMember(owner = "client!sc", name = "E", descriptor = "I")
    public static int field3669;

    @OriginalMember(owner = "client!sc", name = "G", descriptor = "I")
    public int field3671;

    @OriginalMember(owner = "client!sc", name = "K", descriptor = "I")
    public int field3675;

    @OriginalMember(owner = "client!sc", name = "O", descriptor = "I")
    public int field3679;

    @OriginalMember(owner = "client!sc", name = "T", descriptor = "I")
    public int field3684;

    @OriginalMember(owner = "client!sc", name = "N", descriptor = "Lpf;")
    public class169 field3678;

    @OriginalMember(owner = "client!sc", name = "x", descriptor = "Lph;")
    public class171 field3663;

    @OriginalMember(owner = "client!sc", name = "M", descriptor = "Lsc;")
    public class197 field3677;

    @OriginalMember(owner = "client!sc", name = "D", descriptor = "Lvh;")
    public class232 field3668;

    @OriginalMember(owner = "client!sc", name = "P", descriptor = "Lwc;")
    public class237 field3680;

    @OriginalMember(owner = "client!sc", name = "Q", descriptor = "Lec;")
    public class47 field3681;

    @OriginalMember(owner = "client!sc", name = "S", descriptor = "Lh;")
    public class76 field3683;

    @OriginalMember(owner = "client!sc", name = "A", descriptor = "Z")
    public boolean field3666;

    @OriginalMember(owner = "client!sc", name = "B", descriptor = "Z")
    public boolean field3667;

    @OriginalMember(owner = "client!sc", name = "L", descriptor = "Z")
    public boolean field3676;

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "(B)V")
    public static void method1317(byte arg0) {
        field3664 = null;
        field3652 = null;
        field3656 = null;
        field3655 = null;
        field3685 = null;
        field3653 = null;
        field3654 = null;
        field3658 = null;
        if (arg0 >= -69) {
            field3652 = null;
        }
        field3673 = null;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IJ)V")
    public static final void method1318(int arg0, long arg1) {
        try {
            if (arg0 != 5) {
                return;
            }
            Thread.sleep(arg1);
        } catch (InterruptedException var3) {
        }
        field3669++;
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(III)V")
    public class197(int arg0, int arg1, int arg2) {
        this.field3670 = arg2;
        this.field3665 = this.field3661 = arg0;
        this.field3682 = arg1;
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(I)Z")
    public static final boolean method1319(int arg0) {
        field3657++;
        if (class107.field2000 == 0) {
            return arg0 == -6773 ? class237.field4378.method644((byte) 48) : false;
        } else {
            return true;
        }
    }
}
