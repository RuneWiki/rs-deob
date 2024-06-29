import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public class class592 {

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "Z")
    public static boolean field8485 = false;

    @OriginalMember(owner = "client!gn", name = "c", descriptor = "I")
    public static int field8487 = 0;

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "I")
    public static int field8486;

    @OriginalMember(owner = "client!gn", name = "d", descriptor = "I")
    public static int field8488;

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(IIIIII)V")
    public static final void method3467(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field8488++;
        if (arg4 != 29012) {
            field8486 = -94;
        }
        for (int var6 = arg1; var6 <= arg2; var6++) {
            class379.method2284(arg0, arg5, class74.field1144[var6], arg3, 2);
        }
    }
}
