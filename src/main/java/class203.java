import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class203 {

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "Lof;")
    public static class620 field2402 = new class620(8);

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "I")
    public static int field2404 = -50;

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "[[Z")
    public static boolean[][] field2405 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "I")
    public static int field2399;

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "I")
    public static int field2400;

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "I")
    public static int field2403;

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "Loh;")
    public static class404 field2401;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIBLtp;)V", line = 5)
    public static final void method1223(int arg0, int arg1, byte arg2, class532 arg3) {
        int var4 = -22 / ((-arg2 - 64) / 38);
        class465.field6662 = arg3;
        class252.field3041 = arg0;
        field2399++;
        class3.field20 = arg1;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)[Lpea;", line = 20)
    public static final class722[] method1224(int arg0) {
        field2403++;
        return arg0 == 28543 ? new class722[] { class674.field9555, class340.field4391, class352.field4529 } : null;
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(I)V", line = 32)
    public static void method1225(int arg0) {
        if (arg0 == 12881) {
            field2405 = null;
            field2401 = null;
            field2402 = null;
        }
    }

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "(I)V", line = 45)
    public static final void method1226(int arg0) {
        class56.field568 = new class649(class486.field6908.method2936(class489.field6978, 115), "", class61.field627, 1004, -1, 0L, 0, 0, true, false, 0L, true);
        field2400++;
        if (arg0 != -11394) {
            method1226(84);
        }
    }
}
