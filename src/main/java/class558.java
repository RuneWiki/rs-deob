import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public class class558 {

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "I")
    public static int field7615;

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "I")
    public static int field7616;

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(Lio;B)Lpda;")
    public static final class302 method3101(class157 arg0, byte arg1) {
        field7616++;
        class703 var2 = class289.method1719(arg0, (byte) 81);
        int var3 = arg0.method947(-5360);
        int var4 = -110 / ((-arg1 - 53) / 36);
        return new class302(var2.field9883, var2.field9876, var2.field9882, var2.field9880, var2.field9881, var3);
    }
}
