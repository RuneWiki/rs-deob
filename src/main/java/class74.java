import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class74 {

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "I")
    public static int field1175 = 0;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "I")
    public static int field1173;

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "I")
    public static int field1174;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)V")
    public static final void method600(int arg0) {
        field1173++;
        if (arg0 != 18) {
            field1174 = 36;
        }
        class449 var1 = class611.method3463(0, (byte) -126, 15);
        var1.method2614(123);
    }
}
