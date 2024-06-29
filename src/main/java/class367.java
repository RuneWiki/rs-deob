import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qba")
public class class367 {

    @OriginalMember(owner = "client!qba", name = "b", descriptor = "Lcw;")
    public static class127 field5372 = new class127(2);

    @OriginalMember(owner = "client!qba", name = "c", descriptor = "Lvf;")
    public static class87 field5373 = new class87();

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "I")
    public static int field5371;

    @OriginalMember(owner = "client!qba", name = "d", descriptor = "I")
    public static int field5374;

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(II)Lcw;", line = 5)
    public static final class127 method2247(int arg0, int arg1) {
        field5371++;
        if (arg0 != -5630) {
            method2248(-21);
        }
        class127[] var2 = class360.method2215(arg0 ^ 0x15FD);
        for (int var3 = 0; var3 < var2.length; var3++) {
            class127 var4 = var2[var3];
            if (var4.field1838 == arg1) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(I)V", line = 34)
    public static void method2248(int arg0) {
        field5372 = null;
        if (arg0 == 0) {
            field5373 = null;
        }
    }
}
