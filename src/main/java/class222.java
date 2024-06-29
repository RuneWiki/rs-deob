import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qu")
public class class222 {

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "I")
    public static int field3278;

    @OriginalMember(owner = "client!qu", name = "b", descriptor = "I")
    public static int field3279;

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(Lka;IIII)Lro;")
    public static final class522 method1551(class282 arg0, int arg1, int arg2, int arg3, int arg4) {
        field3278++;
        if (arg0 == null) {
            return null;
        } else {
            if (arg4 != 34) {
                method1551(null, 65, -46, 110, 21);
            }
            return new class522(arg1, arg2, arg3, arg0.method514(), arg0.method539(), arg0.method522(), arg0.method511(), arg0.method542(), arg0.method534(), arg0.method519());
        }
    }
}
