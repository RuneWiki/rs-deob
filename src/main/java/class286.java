import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public abstract class class286 extends class325 {

    @OriginalMember(owner = "client!sn", name = "E", descriptor = "[I")
    public static int[] field4444 = new int[32];

    @OriginalMember(owner = "client!sn", name = "F", descriptor = "Z")
    public static boolean field4445 = false;

    @OriginalMember(owner = "client!sn", name = "H", descriptor = "Ljava/lang/String;")
    public static String field4447 = "Loading - please wait.";

    @OriginalMember(owner = "client!sn", name = "G", descriptor = "I")
    public static int field4446;

    @OriginalMember(owner = "client!sn", name = "d", descriptor = "(I)V", line = 9)
    public static void method1970(int arg0) {
        field4444 = null;
        field4447 = null;
        if (arg0 != 32) {
            field4445 = false;
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IIIIII)V", line = 39)
    public static final void method1971(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class94.field1334 = arg1;
        class309.field4821 = arg2;
        class38.field548 = arg3;
        field4446++;
        if (arg5 < -110) {
            class257.field3937 = arg4;
            class299.field4607 = arg0;
        }
    }

    @OriginalMember(owner = "client!sn", name = "c", descriptor = "(B)Ljava/lang/Object;")
    public abstract Object method724(byte arg0);

    @OriginalMember(owner = "client!sn", name = "d", descriptor = "(B)Z")
    public abstract boolean method728(byte arg0);
}
