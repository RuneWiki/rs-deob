import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class189 extends class129 {

    @OriginalMember(owner = "client!t", name = "P", descriptor = "I")
    public int field3701 = 0;

    @OriginalMember(owner = "client!t", name = "S", descriptor = "I")
    public int field3704 = -1;

    @OriginalMember(owner = "client!t", name = "B", descriptor = "Lrd;")
    public static class173 field3687 = class133.method843("Spieler kann nicht gefunden werden: ", -119);

    @OriginalMember(owner = "client!t", name = "t", descriptor = "Lrd;")
    public static class173 field3679 = class133.method843(" )2> <col=ffff00>", -83);

    @OriginalMember(owner = "client!t", name = "s", descriptor = "I")
    public static int field3678 = -1;

    @OriginalMember(owner = "client!t", name = "E", descriptor = "I")
    public static int field3690 = 50;

    @OriginalMember(owner = "client!t", name = "G", descriptor = "I")
    public static int field3692 = 0;

    @OriginalMember(owner = "client!t", name = "y", descriptor = "[I")
    public static int[] field3684 = new int[4000];

    @OriginalMember(owner = "client!t", name = "R", descriptor = "[I")
    public static int[] field3703 = new int[2048];

    @OriginalMember(owner = "client!t", name = "J", descriptor = "Lrd;")
    private static class173 field3695 = class133.method843(" more options", 16);

    @OriginalMember(owner = "client!t", name = "W", descriptor = "Lrd;")
    private static class173 field3708 = class133.method843("flash1:", 95);

    @OriginalMember(owner = "client!t", name = "Q", descriptor = "Lrd;")
    public static class173 field3702 = field3708;

    @OriginalMember(owner = "client!t", name = "U", descriptor = "Lrd;")
    private static class173 field3706 = class133.method843("Try again in 60 secs)3)3)3", -94);

    @OriginalMember(owner = "client!t", name = "X", descriptor = "[S")
    public static short[] field3709 = new short[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!t", name = "z", descriptor = "Lrd;")
    public static class173 field3685 = field3708;

    @OriginalMember(owner = "client!t", name = "Y", descriptor = "Lrd;")
    public static class173 field3710 = field3695;

    @OriginalMember(owner = "client!t", name = "D", descriptor = "Lrd;")
    public static class173 field3689 = field3706;

    @OriginalMember(owner = "client!t", name = "r", descriptor = "I")
    public static int field3677;

    @OriginalMember(owner = "client!t", name = "u", descriptor = "I")
    public static int field3680;

    @OriginalMember(owner = "client!t", name = "v", descriptor = "I")
    public int field3681;

    @OriginalMember(owner = "client!t", name = "w", descriptor = "I")
    public static int field3682;

    @OriginalMember(owner = "client!t", name = "x", descriptor = "I")
    public int field3683;

    @OriginalMember(owner = "client!t", name = "C", descriptor = "I")
    public int field3688;

    @OriginalMember(owner = "client!t", name = "F", descriptor = "I")
    public int field3691;

    @OriginalMember(owner = "client!t", name = "H", descriptor = "I")
    public static int field3693;

    @OriginalMember(owner = "client!t", name = "I", descriptor = "I")
    public int field3694;

    @OriginalMember(owner = "client!t", name = "K", descriptor = "I")
    public static int field3696;

    @OriginalMember(owner = "client!t", name = "L", descriptor = "I")
    public int field3697;

    @OriginalMember(owner = "client!t", name = "M", descriptor = "I")
    public int field3698;

    @OriginalMember(owner = "client!t", name = "N", descriptor = "I")
    public int field3699;

    @OriginalMember(owner = "client!t", name = "O", descriptor = "I")
    public int field3700;

    @OriginalMember(owner = "client!t", name = "V", descriptor = "I")
    public int field3707;

    @OriginalMember(owner = "client!t", name = "A", descriptor = "J")
    public static long field3686;

    @OriginalMember(owner = "client!t", name = "T", descriptor = "Lbc;")
    public static class14 field3705;

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(II)V")
    public static final void method1263(int arg0, int arg1) {
        if (arg1 >= -76) {
            field3709 = null;
        }
        if (class212.field4117 == null || arg0 > class212.field4117.length) {
            class212.field4117 = new int[arg0];
        }
        field3682++;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Z)V")
    public static void method1264(boolean arg0) {
        field3709 = null;
        field3679 = null;
        field3689 = null;
        field3687 = null;
        field3685 = null;
        field3702 = null;
        field3708 = null;
        field3705 = null;
        field3706 = null;
        if (arg0) {
            field3703 = null;
        }
        field3695 = null;
        field3703 = null;
        field3710 = null;
        field3684 = null;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(ILlh;)V")
    public static final void method1265(int arg0, class117 arg1) {
        if (arg0 != -3256) {
            field3703 = null;
        }
        class203.method1353(-104, 200000, arg1);
        field3693++;
    }

    @OriginalMember(owner = "client!t", name = "c", descriptor = "(II)I")
    public static final int method1266(int arg0, int arg1) {
        if (arg1 == 50) {
            field3696++;
            return arg0 >>> 8;
        } else {
            return 8;
        }
    }
}
