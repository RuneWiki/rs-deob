import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class191 {

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "I")
    public static int field3019 = -1;

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "I")
    public static int field3020;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(ILef;)Lef;")
    public static final class214 method1339(int arg0, class214 arg1) {
        class214 var2 = client.method1032(arg1);
        int var3 = -32 / ((arg0 + 35) / 34);
        field3020++;
        if (var2 == null) {
            var2 = arg1.field3361;
        }
        return var2;
    }
}
