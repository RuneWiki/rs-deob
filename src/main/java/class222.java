import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class222 extends class54 {

    @OriginalMember(owner = "client!ue", name = "v", descriptor = "Ldc;")
    public class37 field4122;

    @OriginalMember(owner = "client!ue", name = "o", descriptor = "Ldc;")
    public static class37 field4115 = class185.method1233((byte) 86, "sind fehlgeschlagen)3 Bitte warten Sie 5 Minuten)1");

    @OriginalMember(owner = "client!ue", name = "t", descriptor = "Ldc;")
    private static class37 field4120 = class185.method1233((byte) 86, "Username: ");

    @OriginalMember(owner = "client!ue", name = "s", descriptor = "I")
    public static volatile int field4119 = -1;

    @OriginalMember(owner = "client!ue", name = "r", descriptor = "Ldc;")
    public static class37 field4118 = field4120;

    @OriginalMember(owner = "client!ue", name = "w", descriptor = "I")
    public static int field4123 = 0;

    @OriginalMember(owner = "client!ue", name = "p", descriptor = "I")
    public static int field4116;

    @OriginalMember(owner = "client!ue", name = "q", descriptor = "I")
    public static int field4117;

    @OriginalMember(owner = "client!ue", name = "u", descriptor = "I")
    public static int field4121;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIIBIIII)V")
    public static final void method1463(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8) {
        field4121++;
        if (class39.method352(-10924, arg7)) {
            class70.field1263 = null;
            class218.method1444(arg1, arg0, class177.field3344[arg7], arg8, arg2, -1, arg6, arg3, arg5, -1);
            if (class70.field1263 != null) {
                class218.method1444(arg1, arg0, class70.field1263, class124.field2216, arg2, -1412584499, arg6, arg3, class32.field643, -1);
                class70.field1263 = null;
            }
            if (arg4 != 21) {
                field4115 = null;
            }
        } else if (arg3 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class211.field3948[var9] = true;
            }
        } else {
            class211.field3948[arg3] = true;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Z)V")
    public static final void method1464(boolean arg0) {
        if (!arg0) {
            method1464(true);
        }
        class233.field4242.method1183((byte) 110);
        field4116++;
    }

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "()V")
    public class222() {
    }

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(Ldc;)V")
    public class222(class37 arg0) {
        this.field4122 = arg0;
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(Z)V")
    public static void method1465(boolean arg0) {
        field4120 = null;
        field4115 = null;
        field4118 = null;
        if (!arg0) {
            method1465(false);
        }
    }
}
