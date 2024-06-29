import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class495 {

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "I")
    public static int field7036;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IB)Lih;")
    public static final class702 method2947(int arg0, byte arg1) {
        field7036++;
        class702 var2 = (class702) class561.field8009.method803(arg1 + 199, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class268.field3837.method211(true, 0, arg0);
        class702 var4 = new class702();
        if (var3 != null) {
            var4.method3994(new class645(var3), arg1 + 83, arg0);
        }
        if (arg1 != -79) {
            method2947(102, (byte) -14);
        }
        class561.field8009.method801(1, var4, (long) arg0);
        return var4;
    }
}
