import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class571 extends class164 {

    @OriginalMember(owner = "client!im", name = "s", descriptor = "Lgda;")
    public static class53 field8099 = new class53(51, 3);

    @OriginalMember(owner = "client!im", name = "o", descriptor = "I")
    public static int field8095;

    @OriginalMember(owner = "client!im", name = "p", descriptor = "I")
    public static int field8096;

    @OriginalMember(owner = "client!im", name = "r", descriptor = "I")
    public static int field8098;

    @OriginalMember(owner = "client!im", name = "q", descriptor = "Lfp;")
    public static class323 field8097;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(ZIBI)V")
    public final void method51(boolean arg0, int arg1, byte arg2, int arg3) {
        class268.field3831.method445(arg1 - 2, arg3, super.field2256.field2873 + 4, super.field2256.field2874 + 2, ((class273) super.field2256).field3893, 0);
        if (arg2 != -104) {
            field8099 = null;
        }
        ++field8098;
        class268.field3831.method445(arg1 + -1, arg3 - -1, super.field2256.field2873 - -2, super.field2256.field2874, 0, 0);
    }

    @OriginalMember(owner = "client!im", name = "<init>", descriptor = "(Lfp;Lfp;Lvea;)V")
    public class571(class323 arg0, class323 arg1, class273 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!im", name = "b", descriptor = "(B)V")
    public static void method3280(byte arg0) {
        if (arg0 != 82) {
            method3280((byte) -98);
        }
        field8097 = null;
        field8099 = null;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(IIZB)V")
    public final void method52(int arg0, int arg1, boolean arg2, byte arg3) {
        ++field8096;
        int var5 = this.method1081(2) * super.field2256.field2873 / 10000;
        class268.field3831.method431(arg1, arg0 - -2, var5, super.field2256.field2874 + -2, ((class273) super.field2256).field3899, 0);
        class268.field3831.method431(arg1 + var5, arg0 + 2, -var5 + super.field2256.field2873, super.field2256.field2874 + -2, 0, 0);
        if (arg3 >= -88) {
            field8099 = null;
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(Lee;B)Lhg;")
    public static final class690 method3281(class675 arg0, byte arg1) {
        ++field8095;
        int var2 = arg0.method3703(arg1 + -1);
        if (arg1 != 96) {
            field8099 = null;
        }
        return new class690(var2);
    }
}
