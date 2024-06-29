import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tfa")
public class class33 {

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "I")
    public static int field437;

    @OriginalMember(owner = "client!tfa", name = "b", descriptor = "I")
    public static int field438;

    @OriginalMember(owner = "client!tfa", name = "c", descriptor = "Z")
    public static boolean field439;

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(BI)V", line = 6)
    public static final void method217(byte arg0, int arg1) {
        field438++;
        class354 var2 = class501.method3012(arg1, 16, 2145997216);
        var2.method2216(0);
        if (arg0 >= -71) {
            method217((byte) -28, -50);
        }
    }
}
