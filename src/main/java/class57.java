import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tt")
public class class57 {

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "I")
    public static int field885 = 0;

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "I")
    public static int field884;

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(BIZ)I")
    public static final int method422(byte arg0, int arg1, boolean arg2) {
        field884++;
        if (arg2) {
            return 0;
        }
        class220 var3 = class224.method1384(arg2, true, arg1);
        if (var3 == null) {
            return class456.field6646.method2546(5, arg1).field1164;
        }
        int var4 = 0;
        int var5 = 0;
        if (arg0 < 97) {
            field885 = 113;
        }
        while (var3.field3097.length > var5) {
            if (var3.field3097[var5] == -1) {
                var4++;
            }
            var5++;
        }
        return var4 + class456.field6646.method2546(5, arg1).field1164 - var3.field3097.length;
    }
}
