import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cca")
public class class229 {

    @OriginalMember(owner = "client!cca", name = "c", descriptor = "Ltga;")
    public static class54 field3207 = new class54("WTQA", 2);

    @OriginalMember(owner = "client!cca", name = "g", descriptor = "Z")
    public static boolean field3211 = false;

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "I")
    public static int field3205;

    @OriginalMember(owner = "client!cca", name = "b", descriptor = "I")
    public int field3206;

    @OriginalMember(owner = "client!cca", name = "d", descriptor = "I")
    public static int field3208;

    @OriginalMember(owner = "client!cca", name = "e", descriptor = "I")
    public int field3209;

    @OriginalMember(owner = "client!cca", name = "f", descriptor = "[Lqo;")
    public class21[] field3210;

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(Z)V")
    public static final void method1427(boolean arg0) {
        if (arg0) {
            class703.field9899 = class412.field5656;
            class218.field3099 = class467.field6283;
        } else {
            class703.field9899 = class705.field9916;
            class218.field3099 = class684.field9625;
        }
        class13.field218 = class703.field9899.length;
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(Leh;I)V")
    public final void method1428(class335 arg0, int arg1) {
        field3208++;
        this.field3206 = arg0.method2042((byte) 53);
        this.field3209 = arg0.method2001((byte) -83);
        this.field3210 = new class21[arg0.method2034(255)];
        class412[] var3 = class360.method2134((byte) -107);
        for (int var4 = 0; var4 < this.field3210.length; var4++) {
            this.field3210[var4] = this.method1429((byte) -103, arg0, var3[arg0.method2034(255)]);
        }
        if (arg1 >= -33) {
            this.field3210 = null;
        }
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(BLeh;Los;)Lqo;")
    private final class21 method1429(byte arg0, class335 arg1, class412 arg2) {
        field3205++;
        if (class258.field3560 == arg2) {
            return class101.method769(arg1, false);
        } else if (class137.field2224 == arg2) {
            return class672.method3762(0, arg1);
        } else if (class373.field5039 == arg2) {
            return class369.method2174(arg0 + 26674, arg1);
        } else if (class275.field3855 == arg2) {
            return class156.method1093(arg1, (byte) -86);
        } else {
            if (arg0 != -103) {
                method1427(true);
            }
            if (class273.field3797 == arg2) {
                return class578.method3176((byte) -78, arg1);
            } else if (class651.field8811 == arg2) {
                return class515.method2878(arg1, 86);
            } else if (class145.field2329 == arg2) {
                return class128.method983(true, arg1);
            } else if (class464.field6265 == arg2) {
                return class533.method2968(arg1, 19794);
            } else if (class625.field8374 == arg2) {
                return class312.method1863(arg1, (byte) -117);
            } else if (class515.field6882 == arg2) {
                return class228.method1425(arg1, arg0 ^ 0xFFF00066);
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(B)V")
    public static void method1430(byte arg0) {
        field3207 = null;
        if (arg0 != 93) {
            field3211 = true;
        }
    }
}
