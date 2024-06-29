import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class75 {

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "I")
    public static int field961 = 0;

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "I")
    public static int field962;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIII)V", line = 8)
    public static final void method453(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 != 0) {
            method453(31, 100, 79, 103, 81);
        }
        field962++;
        class96 var5 = class141.method935(arg0, 4, 126);
        var5.method581((byte) -104);
        var5.field1243 = arg2;
        var5.field1254 = arg3;
        var5.field1246 = arg4;
    }
}
