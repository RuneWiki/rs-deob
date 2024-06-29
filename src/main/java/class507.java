import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public class class507 {

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "I")
    public static int field7548;

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "I")
    public static int field7549;

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(ZII)V", line = 5)
    public static final void method3035(boolean arg0, int arg1, int arg2) {
        field7549++;
        class621 var3 = class442.method2691(arg1, 6, !arg0);
        var3.method3592((byte) 109);
        if (arg0) {
            field7548 = 115;
        }
        var3.field9068 = arg2;
    }
}
