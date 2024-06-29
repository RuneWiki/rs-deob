import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public class class241 extends class423 {

    @OriginalMember(owner = "client!uq", name = "r", descriptor = "I")
    public static int field3575 = 0;

    @OriginalMember(owner = "client!uq", name = "m", descriptor = "I")
    public static int field3570 = 328;

    @OriginalMember(owner = "client!uq", name = "x", descriptor = "Lcb;")
    public static class399 field3581 = null;

    @OriginalMember(owner = "client!uq", name = "o", descriptor = "I")
    public static int field3572;

    @OriginalMember(owner = "client!uq", name = "q", descriptor = "I")
    public static int field3574;

    @OriginalMember(owner = "client!uq", name = "s", descriptor = "I")
    public int field3576;

    @OriginalMember(owner = "client!uq", name = "t", descriptor = "I")
    public int field3577;

    @OriginalMember(owner = "client!uq", name = "y", descriptor = "I")
    public int field3582;

    @OriginalMember(owner = "client!uq", name = "z", descriptor = "I")
    public static int field3583;

    @OriginalMember(owner = "client!uq", name = "w", descriptor = "Lct;")
    public static class104 field3580;

    @OriginalMember(owner = "client!uq", name = "n", descriptor = "Lae;")
    public static class285 field3571;

    @OriginalMember(owner = "client!uq", name = "v", descriptor = "Lqm;")
    public static class297 field3579;

    @OriginalMember(owner = "client!uq", name = "p", descriptor = "Lje;")
    public class309 field3573;

    @OriginalMember(owner = "client!uq", name = "u", descriptor = "[Loo;")
    public class396[] field3578;

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(II)V", line = 7)
    public static final void method1621(int arg0, int arg1) {
        field3583++;
        class4.field68 = -1;
        class134.field1843 = arg0;
        class4.field68 = -1;
        class132.method884(-1);
        if (arg1 <= 88) {
            method1621(97, 80);
        }
    }

    @OriginalMember(owner = "client!uq", name = "b", descriptor = "(Z)V", line = 21)
    public static void method1622(boolean arg0) {
        field3580 = null;
        field3571 = null;
        field3579 = null;
        field3581 = null;
        if (arg0) {
            field3572 = 98;
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(Lfp;BII)Z", line = 41)
    public final boolean method1623(class9 arg0, byte arg1, int arg2, int arg3) {
        field3574++;
        if (this.field3578 != null) {
            for (int var5 = 0; var5 < this.field3578.length; var5++) {
                if (this.field3578[var5].method2489(arg3, arg2) && this.field3573.method5(arg0, arg2, -754, arg3)) {
                    return true;
                }
            }
        }
        if (arg1 < 7) {
            method1621(83, 54);
        }
        return false;
    }
}
