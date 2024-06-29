import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class103 {

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "I")
    public static int field1226 = 0;

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "I")
    public static int field1227;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IBLjava/lang/String;)V")
    public static final void method571(int arg0, byte arg1, String arg2) {
        int var3 = -29 % ((arg1 - 62) / 62);
        field1227++;
        class256 var4 = class592.method3279((byte) -109, 2, arg0);
        var4.method1549(-32042);
        var4.field3352 = arg2;
    }
}
