import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qha")
public class class234 {

    @OriginalMember(owner = "client!qha", name = "c", descriptor = "Z")
    public static boolean field3249 = false;

    @OriginalMember(owner = "client!qha", name = "a", descriptor = "I")
    public static int field3247;

    @OriginalMember(owner = "client!qha", name = "b", descriptor = "I")
    public static int field3248;

    @OriginalMember(owner = "client!qha", name = "a", descriptor = "(BIIII)V")
    public static final void method1499(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field3247++;
        class118 var5 = class126.method814(true, arg4, 8);
        var5.method771(-30559);
        var5.field1634 = arg3;
        var5.field1629 = arg2;
        if (arg0 >= 40) {
            var5.field1636 = arg1;
        }
    }
}
