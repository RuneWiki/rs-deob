import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rba")
public class class432 {

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "Lqfa;")
    public static class98 field6174 = new class98(1, 4);

    @OriginalMember(owner = "client!rba", name = "b", descriptor = "I")
    public static int field6175;

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(Ljava/lang/String;B)I")
    public static final int method2633(String arg0, byte arg1) {
        field6175++;
        int var2 = arg0.length();
        int var3 = 0;
        if (arg1 > -21) {
            method2633(null, (byte) -34);
        }
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = class272.method1774(arg0.charAt(var4), -8910) + (var3 << 5) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(B)V")
    public static void method2634(byte arg0) {
        field6174 = null;
        if (arg0 != 126) {
            method2634((byte) 75);
        }
    }
}
