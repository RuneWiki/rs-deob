import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ur")
public class class358 {

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "Lid;")
    public static class224 field5087 = new class224("", 12);

    @OriginalMember(owner = "client!ur", name = "c", descriptor = "I")
    public static int field5089;

    @OriginalMember(owner = "client!ur", name = "d", descriptor = "I")
    public static int field5090;

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "[Lfo;")
    public static class22[] field5088;

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(BII)Z")
    public static final boolean method2169(byte arg0, int arg1, int arg2) {
        int var3 = -111 % ((arg0 + 77) / 39);
        field5089++;
        if (arg2 == 11) {
            arg2 = 10;
        }
        class370 var4 = class552.field7819.method2890(0, arg1);
        if (arg2 >= 5 && arg2 <= 8) {
            arg2 = 4;
        }
        return var4.method2242(arg2, 26188);
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(I)V")
    public static void method2170(int arg0) {
        field5087 = null;
        if (arg0 > -77) {
            field5090 = -128;
        }
        field5088 = null;
    }
}
