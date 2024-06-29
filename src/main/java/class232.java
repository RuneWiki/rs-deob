import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class232 extends class573 {

    @OriginalMember(owner = "client!jd", name = "s", descriptor = "Lcga;")
    public static class485 field3290 = new class485();

    @OriginalMember(owner = "client!jd", name = "t", descriptor = "I")
    public static int field3291;

    @OriginalMember(owner = "client!jd", name = "v", descriptor = "I")
    public static int field3293;

    @OriginalMember(owner = "client!jd", name = "w", descriptor = "I")
    public static int field3294;

    @OriginalMember(owner = "client!jd", name = "x", descriptor = "I")
    public static int field3295;

    @OriginalMember(owner = "client!jd", name = "y", descriptor = "I")
    public static int field3296;

    @OriginalMember(owner = "client!jd", name = "z", descriptor = "I")
    public static int field3297;

    @OriginalMember(owner = "client!jd", name = "A", descriptor = "I")
    public static int field3298;

    @OriginalMember(owner = "client!jd", name = "u", descriptor = "Lwu;")
    public static class376 field3292;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lwc;IB)V", line = 3)
    public final void method607(class67 arg0, int arg1, byte arg2) {
        super.field7517.method823(arg0, -8423);
        ++field3298;
        if (arg2 <= 68) {
            this.method610(true, 81);
        }
        super.field7517.method887((byte) 118, arg1);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ZI)V", line = 15)
    public final void method610(boolean arg0, int arg1) {
        ++field3297;
        if (arg1 < 109) {
            field3290 = null;
        }
    }

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(Lrv;)V", line = 25)
    public class232(class111 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(III)V", line = 29)
    public final void method602(int arg0, int arg1, int arg2) {
        if (arg0 == -26427) {
            ++field3291;
        }
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(I)Z", line = 40)
    public final boolean method605(int arg0) {
        if (arg0 != 4095) {
            this.method607((class67) null, 115, (byte) 3);
        }
        ++field3293;
        return false;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILee;)Lvn;", line = 57)
    public static final class316 method1471(int arg0, class677 arg1) {
        int var2 = -20 % ((37 - arg0) / 46);
        ++field3294;
        return new class316(arg1.method3771((byte) -10), arg1.method3771((byte) -10), arg1.method3771((byte) -10), arg1.method3771((byte) -10), arg1.method3833(255), arg1.method3821((byte) 112));
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(Z)V", line = 68)
    public final void method603(boolean arg0) {
        ++field3295;
        if (!arg0) {
            this.method611(true, false);
        }
    }

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "(B)V", line = 81)
    public static void method1472(byte arg0) {
        field3290 = null;
        field3292 = null;
        if (arg0 != -82) {
            field3290 = null;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ZZ)V", line = 92)
    public final void method611(boolean arg0, boolean arg1) {
        if (!arg0) {
            this.method603(false);
        }
        ++field3296;
    }
}
