import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class220 extends class204 {

    @OriginalMember(owner = "client!pl", name = "B", descriptor = "B")
    public byte field2862 = 5;

    @OriginalMember(owner = "client!pl", name = "A", descriptor = "[I")
    public static int[] field2861 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

    @OriginalMember(owner = "client!pl", name = "v", descriptor = "I")
    public int field2856;

    @OriginalMember(owner = "client!pl", name = "w", descriptor = "I")
    public static int field2857;

    @OriginalMember(owner = "client!pl", name = "x", descriptor = "I")
    public int field2858;

    @OriginalMember(owner = "client!pl", name = "y", descriptor = "I")
    public int field2859;

    @OriginalMember(owner = "client!pl", name = "z", descriptor = "I")
    public int field2860;

    @OriginalMember(owner = "client!pl", name = "C", descriptor = "I")
    public int field2863;

    @OriginalMember(owner = "client!pl", name = "D", descriptor = "I")
    public int field2864;

    @OriginalMember(owner = "client!pl", name = "E", descriptor = "Z")
    public boolean field2865;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Z)V", line = 3)
    public static void method1357(boolean arg0) {
        if (arg0) {
            method1357(false);
        }
        field2861 = null;
    }

    @OriginalMember(owner = "client!pl", name = "f", descriptor = "(I)I", line = 19)
    public static final int method1358(int arg0) {
        field2857++;
        if ((double) class561.field7650 == 3.0D) {
            return 37;
        }
        if (arg0 > -34) {
            field2861 = null;
        }
        if ((double) class561.field7650 == 4.0D) {
            return 50;
        } else if ((double) class561.field7650 == 6.0D) {
            return 75;
        } else if ((double) class561.field7650 == 8.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(JJ)J", line = 54)
    public static long method1359(long arg0, long arg1) {
        return arg0 | arg1;
    }
}
