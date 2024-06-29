import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public class class424 {

    @OriginalMember(owner = "client!wm", name = "d", descriptor = "I")
    public int field6031 = 8;

    @OriginalMember(owner = "client!wm", name = "c", descriptor = "I")
    public int field6030 = 512;

    @OriginalMember(owner = "client!wm", name = "h", descriptor = "Z")
    public boolean field6035 = true;

    @OriginalMember(owner = "client!wm", name = "g", descriptor = "I")
    public int field6034 = 127;

    @OriginalMember(owner = "client!wm", name = "f", descriptor = "I")
    public int field6033 = 64;

    @OriginalMember(owner = "client!wm", name = "m", descriptor = "Z")
    public boolean field6040 = true;

    @OriginalMember(owner = "client!wm", name = "p", descriptor = "I")
    public int field6043 = 0;

    @OriginalMember(owner = "client!wm", name = "i", descriptor = "I")
    public int field6036 = -1;

    @OriginalMember(owner = "client!wm", name = "l", descriptor = "Z")
    public boolean field6039 = false;

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "I")
    public int field6029 = 1190717;

    @OriginalMember(owner = "client!wm", name = "t", descriptor = "I")
    public int field6047 = -1;

    @OriginalMember(owner = "client!wm", name = "r", descriptor = "[I")
    public static int[] field6045 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

    @OriginalMember(owner = "client!wm", name = "u", descriptor = "Z")
    public static boolean field6048 = false;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "I")
    public static int field6028;

    @OriginalMember(owner = "client!wm", name = "j", descriptor = "I")
    public int field6037;

    @OriginalMember(owner = "client!wm", name = "k", descriptor = "I")
    public static int field6038;

    @OriginalMember(owner = "client!wm", name = "n", descriptor = "I")
    public static int field6041;

    @OriginalMember(owner = "client!wm", name = "o", descriptor = "I")
    public static int field6042;

    @OriginalMember(owner = "client!wm", name = "q", descriptor = "Lwl;")
    public static class142 field6044;

    @OriginalMember(owner = "client!wm", name = "e", descriptor = "Luf;")
    public static class494 field6032;

    @OriginalMember(owner = "client!wm", name = "s", descriptor = "Lpe;")
    public class658 field6046;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(IILtn;)V", line = 21)
    private final void method2524(int arg0, int arg1, class179 arg2) {
        if (arg0 != -22819) {
            return;
        }
        if (arg1 == 1) {
            this.field6043 = class638.method3463((byte) -119, arg2.method1114(119));
        } else if (arg1 == 2) {
            this.field6047 = arg2.method1094(255);
        } else if (arg1 == 3) {
            this.field6047 = arg2.method1107(false);
            if (this.field6047 == 65535) {
                this.field6047 = -1;
            }
        } else if (arg1 == 5) {
            this.field6035 = false;
        } else if (arg1 == 7) {
            this.field6036 = class638.method3463((byte) 127, arg2.method1114(87));
        } else if (arg1 == 8) {
            this.field6046.field9046 = this.field6037;
        } else if (arg1 == 9) {
            this.field6030 = arg2.method1107(false) << 2;
        } else if (arg1 == 10) {
            this.field6040 = false;
        } else if (arg1 == 11) {
            this.field6031 = arg2.method1094(255);
        } else if (arg1 == 12) {
            this.field6039 = true;
        } else if (arg1 == 13) {
            this.field6029 = arg2.method1114(84);
        } else if (arg1 == 14) {
            this.field6033 = arg2.method1094(arg0 + 23074) << 2;
        } else if (arg1 == 16) {
            this.field6034 = arg2.method1094(255);
        }
        field6038++;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(Z)V", line = 96)
    public static void method2525(boolean arg0) {
        if (!arg0) {
            method2525(false);
        }
        field6032 = null;
        field6045 = null;
        field6044 = null;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(ILtn;)V", line = 114)
    public final void method2526(int arg0, class179 arg1) {
        field6041++;
        if (arg0 <= 50) {
            this.method2527(-84);
        }
        while (true) {
            int var3 = arg1.method1094(255);
            if (var3 == 0) {
                return;
            }
            this.method2524(-22819, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(I)V", line = 135)
    public final void method2527(int arg0) {
        field6028++;
        int var2 = -93 % ((arg0 - 23) / 61);
        this.field6031 = this.field6031 << 8 | this.field6037;
    }
}
