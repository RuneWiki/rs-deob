import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!av")
public class class253 extends class695 {

    @OriginalMember(owner = "client!av", name = "k", descriptor = "Lki;")
    public static class364 field3444 = new class364();

    @OriginalMember(owner = "client!av", name = "p", descriptor = "Lra;")
    public static class361 field3449 = new class361(49, 3);

    @OriginalMember(owner = "client!av", name = "j", descriptor = "I")
    public static int field3443;

    @OriginalMember(owner = "client!av", name = "l", descriptor = "I")
    public static int field3445;

    @OriginalMember(owner = "client!av", name = "m", descriptor = "I")
    public static int field3446;

    @OriginalMember(owner = "client!av", name = "n", descriptor = "I")
    public static int field3447;

    @OriginalMember(owner = "client!av", name = "o", descriptor = "I")
    public static int field3448;

    @OriginalMember(owner = "client!av", name = "q", descriptor = "I")
    public static int field3450;

    @OriginalMember(owner = "client!av", name = "r", descriptor = "I")
    public static int field3451;

    @OriginalMember(owner = "client!av", name = "s", descriptor = "Lpe;")
    public static class615 field3452;

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(Z)Z")
    public final boolean method494(boolean arg0) {
        if (!arg0) {
            return false;
        } else {
            ++field3448;
            return false;
        }
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(ZB)V")
    public final void method498(boolean arg0, byte arg1) {
        ++field3450;
        if (arg1 > -82) {
            field3451 = 51;
        }
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(IZ)V")
    public final void method495(int arg0, boolean arg1) {
        if (arg0 != 1) {
            field3452 = null;
        }
        ++field3447;
    }

    @OriginalMember(owner = "client!av", name = "<init>", descriptor = "(Lfc;)V")
    public class253(class575 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(Lnm;ZI)V")
    public final void method488(class391 arg0, boolean arg1, int arg2) {
        super.field9493.method3091(true, arg0);
        ++field3446;
        super.field9493.method3072((byte) -57, arg2);
        if (arg1) {
            field3444 = null;
        }
    }

    @OriginalMember(owner = "client!av", name = "b", descriptor = "(I)V")
    public final void method491(int arg0) {
        ++field3445;
        if (arg0 < 38) {
            field3451 = -72;
        }
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(III)V")
    public final void method489(int arg0, int arg1, int arg2) {
        ++field3443;
        if (arg2 <= 69) {
            field3449 = null;
        }
    }

    @OriginalMember(owner = "client!av", name = "e", descriptor = "(I)V")
    public static void method1603(int arg0) {
        field3452 = null;
        field3444 = null;
        if (arg0 > 79) {
            field3449 = null;
        }
    }
}
