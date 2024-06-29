import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class596 extends class416 {

    @OriginalMember(owner = "client!rj", name = "B", descriptor = "[[S")
    public short[][] field7754;

    @OriginalMember(owner = "client!rj", name = "A", descriptor = "D")
    public double field7753;

    @OriginalMember(owner = "client!rj", name = "z", descriptor = "[I")
    public static int[] field7752 = new int[5];

    @OriginalMember(owner = "client!rj", name = "x", descriptor = "I")
    public static int field7750;

    @OriginalMember(owner = "client!rj", name = "y", descriptor = "I")
    public static int field7751;

    @OriginalMember(owner = "client!rj", name = "C", descriptor = "I")
    public static int field7755;

    @OriginalMember(owner = "client!rj", name = "D", descriptor = "I")
    public static int field7756;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(B)V", line = 4)
    public static final void method3236(byte arg0) {
        if (arg0 != -114) {
            field7752 = null;
        }
        class392.method2321(0);
        field7756++;
        int var1 = class411.field5711.field3870.method2335(true);
        if (var1 == 2) {
            class431.method2488(100, class341.field4807, class199.field2993, 100, class228.field3251, (byte) -115);
        } else if (var1 == 3) {
            class541.method3016(2, class315.field4502, 117, class341.field4807, class228.field3251, 2, class199.field2993, class630.field8395);
        }
        if (class411.field5711.field3870.method2333(2)) {
            class615.method3361(false, class295.field4217);
        }
        if (class341.field4807 != null) {
            class1.method2((byte) -115);
        }
        class540.field7159 = class411.field5711.field3870.method2335(true) != 0;
        class24.field412 = class411.field5711.field3870.method2333(2);
    }

    @OriginalMember(owner = "client!rj", name = "e", descriptor = "(B)V", line = 53)
    public static void method3237(byte arg0) {
        field7752 = null;
        if (arg0 <= 122) {
            method3240(false);
        }
    }

    @OriginalMember(owner = "client!rj", name = "f", descriptor = "(B)J", line = 68)
    public final long method3238(byte arg0) {
        if (arg0 <= 49) {
            return -98L;
        } else {
            field7750++;
            return (long) (this.field7754[0].length | this.field7754.length << 0);
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILvfa;)Ljava/lang/String;", line = 83)
    public static final String method3239(int arg0, class672 arg1) {
        field7751++;
        if (arg0 != -1) {
            field7752 = null;
        }
        if (client.method1875(arg1).method1351(2) == 0) {
            return null;
        } else if (arg1.field9238 == null || arg1.field9238.trim().length() == 0) {
            return class320.field4567 ? "Hidden-use" : null;
        } else {
            return arg1.field9238;
        }
    }

    @OriginalMember(owner = "client!rj", name = "<init>", descriptor = "([[SD)V", line = 110)
    public class596(short[][] arg0, double arg1) {
        this.field7754 = arg0;
        this.field7753 = arg1;
    }

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "(Z)V", line = 120)
    public static final void method3240(boolean arg0) {
        if (arg0) {
            method3239(82, null);
        }
        field7755++;
        class276.field3848.method561((byte) -78);
    }
}
