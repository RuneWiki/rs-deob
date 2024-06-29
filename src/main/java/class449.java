import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ou")
public class class449 extends class115 {

    @OriginalMember(owner = "client!ou", name = "i", descriptor = "Lfr;")
    public class497 field6612 = new class497();

    @OriginalMember(owner = "client!ou", name = "k", descriptor = "I")
    public static int field6614 = -1;

    @OriginalMember(owner = "client!ou", name = "l", descriptor = "I")
    public static int field6615 = -1;

    @OriginalMember(owner = "client!ou", name = "j", descriptor = "I")
    public static int field6613;

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(ZI)V", line = 15)
    public static final void method2623(boolean arg0, int arg1) {
        field6613++;
        class506 var2 = class14.method185(-1304589728, arg1, 12);
        if (!arg0) {
            var2.method2986(-68);
        }
    }
}
