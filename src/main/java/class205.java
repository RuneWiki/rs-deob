import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sba")
public abstract class class205 {

    @OriginalMember(owner = "client!sba", name = "b", descriptor = "F")
    public static float field2370;

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "I")
    public static int field2369;

    @OriginalMember(owner = "client!sba", name = "c", descriptor = "I")
    public static int field2371;

    @OriginalMember(owner = "client!sba", name = "d", descriptor = "Z")
    public static boolean field2372;

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(I)V")
    public static final void method1188(int arg0) {
        class536.field6752 = -1;
        class666.field9038 = 0;
        field2371++;
        if (arg0 != 24527) {
            method1189(59, 93, 64, -64, -45, -96, -31, 89, 62, 45);
        }
        class295.field3763 = -1;
    }

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method1189(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field2369++;
        if (!class409.method2299((byte) -54, arg5) || arg9 != -1) {
            return;
        }
        if (class79.field1035[arg5] == null) {
            client.method1694(class325.field4062[arg5], -1, arg2, arg1, arg7, arg3, arg0, arg4, arg8, arg6);
        } else {
            client.method1694(class79.field1035[arg5], -1, arg2, arg1, arg7, arg3, arg0, arg4, arg8, arg6);
        }
    }

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(Laea;I)Laea;")
    public abstract class47 method1190(class47 arg0, int arg1);
}
