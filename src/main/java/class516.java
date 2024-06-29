import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public abstract class class516 {

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "Lcb;")
    public class444 field7353;

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "I")
    public static int field7354;

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "I")
    public static int field7355;

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "I")
    public static int field7356;

    @OriginalMember(owner = "client!gl", name = "e", descriptor = "I")
    public static int field7357;

    @OriginalMember(owner = "client!gl", name = "g", descriptor = "I")
    public static int field7359;

    @OriginalMember(owner = "client!gl", name = "h", descriptor = "I")
    public static int field7360;

    @OriginalMember(owner = "client!gl", name = "i", descriptor = "I")
    public static int field7361;

    @OriginalMember(owner = "client!gl", name = "j", descriptor = "I")
    public static int field7362;

    @OriginalMember(owner = "client!gl", name = "f", descriptor = "Lgb;")
    public static class183 field7358;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(B)V")
    public static void method3055(byte arg0) {
        field7358 = null;
        if (arg0 <= 119) {
            method3055((byte) -127);
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(III)V")
    public abstract void method200(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(B)V")
    public void method1195(byte arg0) {
        if (arg0 >= 117) {
            field7362++;
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Lpb;II)V")
    public abstract void method202(class563 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(III)Z")
    public static final boolean method3056(int arg0, int arg1, int arg2) {
        field7354++;
        if (arg0 != -1) {
            field7356 = -26;
        }
        return class397.method2358(arg2, 8468, arg1) | (arg1 & 0x60000) != 0 || class444.method2666(-13624, arg1, arg2) || class583.method3477(arg0 - 14992, arg2, arg1);
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(I)V")
    public void method1194(int arg0) {
        if (arg0 == 393216) {
            field7357++;
        }
    }

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "(B)Z")
    public abstract boolean method201(byte arg0);

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Z)V")
    public abstract void method197(boolean arg0);

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(Z)V")
    public void method1198(boolean arg0) {
        if (!arg0) {
            field7356 = -67;
        }
        field7359++;
    }

    @OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(Lcb;)V")
    public class516(class444 arg0) {
        this.field7353 = arg0;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(BZ)V")
    public abstract void method199(byte arg0, boolean arg1);

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIIII)V")
    public static final void method3057(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class188.field2797 != null) {
            class188.field2797[arg0][arg1] = arg2 | 0xFF000000;
        }
        if (class188.field2803 != null) {
            class188.field2803[arg0][arg1] = (short) arg3;
        }
        if (class557.field8282 != null) {
            class557.field8282[arg0][arg1] = (byte) arg4;
        }
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(I)V")
    public void method1197(int arg0) {
        field7355++;
        if (arg0 != 22908) {
            this.method1200((byte) -101);
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(ZZ)V")
    public abstract void method195(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "(B)V")
    public void method1200(byte arg0) {
        field7360++;
        int var2 = 26 / ((-arg0 - 31) / 61);
    }

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "(I)V")
    public void method1196(int arg0) {
        if (arg0 == -3385) {
            field7361++;
        }
    }
}
