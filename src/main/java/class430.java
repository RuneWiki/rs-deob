import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sr")
public class class430 {

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "F")
    public static float field6305;

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "I")
    public static int field6306;

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(B)Ltg;", line = 17)
    public static final class621 method2638(byte arg0) {
        if (arg0 < 58) {
            method2638((byte) 122);
        }
        field6306++;
        class621 var1 = (class621) class218.field3230.method2333(-1);
        if (var1 != null) {
            var1.method2997(1);
            var1.method3225(-109);
            return var1;
        }
        class621 var2;
        do {
            var2 = (class621) class635.field9257.method2333(-1);
            if (var2 == null) {
                return null;
            }
            if (var2.method3594((byte) -24) > class450.method2719((byte) -49)) {
                return null;
            }
            var2.method2997(1);
            var2.method3225(-117);
        } while ((Long.MIN_VALUE & var2.field8204) == 0L);
        return var2;
    }
}
