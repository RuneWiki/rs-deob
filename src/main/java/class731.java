import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class731 extends class249 {

    @OriginalMember(owner = "client!cm", name = "f", descriptor = "I")
    public static int field10233;

    @OriginalMember(owner = "client!cm", name = "g", descriptor = "I")
    public static int field10234;

    @OriginalMember(owner = "client!cm", name = "h", descriptor = "I")
    public static int field10235;

    @OriginalMember(owner = "client!cm", name = "i", descriptor = "I")
    public static int field10236;

    @OriginalMember(owner = "client!cm", name = "j", descriptor = "I")
    public static int field10237;

    @OriginalMember(owner = "client!cm", name = "k", descriptor = "I")
    public static int field10238;

    @OriginalMember(owner = "client!cm", name = "l", descriptor = "I")
    public static int field10239;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(I)Z")
    public final boolean method605(int arg0) {
        ++field10234;
        if (arg0 != 2) {
            this.method603((class195) null, false, -39);
        }
        return true;
    }

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "(I)V")
    public final void method611(int arg0) {
        if (arg0 == 2) {
            super.field3613.method1030(false, -12341);
            ++field10236;
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(B)V")
    public static final void method4125(byte arg0) {
        ++field10233;
        if (arg0 != -126) {
            method4125((byte) -23);
        }
        if (class157.method1159(1)) {
            if (class146.field1946 == null) {
                class399.method2533((byte) -99);
            }
            class73.field1023 = 0;
            class596.field8442 = true;
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(ZZ)V")
    public final void method608(boolean arg0, boolean arg1) {
        if (arg0) {
            ++field10237;
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(Lme;ZI)V")
    public final void method603(class195 arg0, boolean arg1, int arg2) {
        ++field10239;
        super.field3613.method1088(arg0, -27749);
        if (arg1) {
            super.field3613.method1066(arg2, 260);
        }
    }

    @OriginalMember(owner = "client!cm", name = "<init>", descriptor = "(Lwh;)V")
    public class731(class148 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(III)V")
    public final void method607(int arg0, int arg1, int arg2) {
        if (arg1 != -13582) {
            this.method607(-45, -49, -114);
        }
        ++field10238;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IZ)V")
    public final void method610(int arg0, boolean arg1) {
        super.field3613.method1030(true, arg0 ^ -12342);
        if (arg0 == 1) {
            ++field10235;
        }
    }
}
