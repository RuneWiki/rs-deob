import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class96 {

    @OriginalMember(owner = "client!eg", name = "g", descriptor = "I")
    public static int field1461 = -1;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "I")
    public static int field1455;

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "I")
    public int field1456;

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "I")
    public int field1457;

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "I")
    public int field1458;

    @OriginalMember(owner = "client!eg", name = "e", descriptor = "I")
    public int field1459;

    @OriginalMember(owner = "client!eg", name = "f", descriptor = "I")
    public static int field1460;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Leh;B)Lqp;")
    public static final class615 method747(class335 arg0, byte arg1) {
        arg0.method2034(255);
        field1455++;
        int var2 = arg0.method2034(255);
        class615 var3 = class379.method2222((byte) -110, var2);
        var3.field8121 = arg0.method2034(255);
        int var4 = arg0.method2034(255);
        if (arg1 >= -116) {
            return null;
        }
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = arg0.method2034(255);
            var3.method15((byte) 59, var6, arg0);
        }
        var3.method10(12404);
        return var3;
    }
}
