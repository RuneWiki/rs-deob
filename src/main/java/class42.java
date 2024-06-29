import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sca")
public class class42 {

    @OriginalMember(owner = "client!sca", name = "b", descriptor = "Lcb;")
    public static class483 field1079 = new class483();

    @OriginalMember(owner = "client!sca", name = "d", descriptor = "Lrg;")
    public static class597 field1081 = new class597();

    @OriginalMember(owner = "client!sca", name = "f", descriptor = "I")
    public static int field1083 = 0;

    @OriginalMember(owner = "client!sca", name = "g", descriptor = "F")
    public static float field1084;

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "I")
    public static int field1078;

    @OriginalMember(owner = "client!sca", name = "c", descriptor = "I")
    public static int field1080;

    @OriginalMember(owner = "client!sca", name = "e", descriptor = "I")
    public static int field1082;

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(Z)V")
    public static void method563(boolean arg0) {
        if (!arg0) {
            field1084 = -1.0344974F;
        }
        field1079 = null;
        field1081 = null;
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(IIIIIII)V")
    public static final void method564(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg4 != 0) {
            return;
        }
        field1078++;
        if (class704.field9911 <= arg5 && arg2 <= class379.field5612 && arg3 >= class309.field4556 && arg6 <= client.field4115) {
            if (arg1 == 1) {
                class612.method3519(arg6, arg2, arg3, arg5, arg0, 4);
            } else {
                class414.method2524(arg3, 2, arg5, arg6, arg0, arg2, arg1);
            }
        } else if (arg1 == 1) {
            class55.method639(arg6, -3820, arg5, arg0, arg2, arg3);
        } else {
            class643.method3662(arg5, arg6, arg3, arg0, arg1, arg2, (byte) 63);
        }
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "()V")
    public static final void method565() {
        for (int var0 = 0; var0 < class438.field6320.length; var0++) {
            class438.field6320[var0].method2458();
        }
        class438.field6320 = null;
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(II)I")
    public static final int method566(int arg0, int arg1) {
        return class177.field2893 == null ? 0 : class177.field2893[arg0][arg1] & 0xFFFF;
    }
}
