import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class101 {

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "Lpfa;")
    public static class295 field1046 = new class295(8);

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "Lnb;")
    public static class301 field1048 = new class301("runescape", 0);

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "I")
    public static int field1047;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(ILig;)Ljava/lang/String;", line = 3)
    public static final String method702(int arg0, class244 arg1) {
        field1047++;
        if (arg0 < 33) {
            field1046 = null;
        }
        return class472.method2851(32767, arg1, 0);
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(I)V", line = 14)
    public static void method703(int arg0) {
        field1046 = null;
        if (arg0 == 32767) {
            field1048 = null;
        }
    }
}
