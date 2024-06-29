import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class476 {

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "I")
    public static int field6997;

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "Lds;")
    public static class12 field6998;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(BI)V", line = 8)
    public static final void method2844(byte arg0, int arg1) {
        int var2 = 119 % ((arg0 + 61) / 57);
        field6997++;
        class434 var3 = class483.method2888(arg1, -120, 10);
        var3.method2628(41);
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(I)V", line = 20)
    public static void method2845(int arg0) {
        field6998 = null;
        if (arg0 != -51) {
            field6998 = null;
        }
    }
}
