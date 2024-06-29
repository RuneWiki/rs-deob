import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class335 {

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "I")
    public static int field5135;

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "I")
    public static int field5136;

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "I")
    public static int field5137;

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "Lvb;")
    public static class130 field5138;

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "Lhh;")
    public static class84 field5139;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIIIILqg;)Lls;")
    public static final class92 method2200(int arg0, int arg1, int arg2, int arg3, int arg4, class321 arg5) {
        field5137++;
        if (arg1 != 1) {
            field5139 = null;
        }
        if (!arg5.field4816 && (!class390.method2453(-2628, arg3) || !class390.method2453(-2628, arg0))) {
            return arg5.field4921 ? new class92(arg5, 34037, arg4, arg2, arg3, arg0, true) : new class92(arg5, arg4, arg2, arg3, arg0, class159.method1146(false, arg3), class159.method1146(false, arg0), true);
        } else {
            return new class92(arg5, 3553, arg4, arg2, arg3, arg0, true);
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(B)V")
    public static void method2201(byte arg0) {
        field5138 = null;
        field5139 = null;
        if (arg0 > -126) {
            method2200(-86, -70, -77, 77, 114, null);
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)V")
    public static final void method2202(int arg0) {
        field5135++;
        int var1 = class397.field5830.method1295(class399.field5865, 0);
        if (~var1 == arg0) {
            class275.field3993 = null;
            class222.method1466((byte) -93, 0);
        } else if (var1 == 1) {
            class210.method1400((byte) -107, (byte) 0);
            class222.method1466((byte) -39, 512);
            if (class364.field5475 != null) {
                class261.method1661(-1);
            }
        } else {
            class210.method1400((byte) -107, (byte) (class454.field6731 - 4 & 0xFF));
            class222.method1466((byte) -11, 2);
        }
        class169.field2537 = class434.field6317;
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(I)V")
    public static final void method2203(int arg0) {
        field5136++;
        class14.field242.method535(class188.field2789, class397.field5830.field153 ? class210.field3027 + 256 << 0 : -1, 256);
        if (arg0 != 1693) {
            field5138 = null;
        }
    }

    static {
        new class180("Invalid channel name entered!", "Ungültiger Chatraum-Name angegeben.", "Nom de canal incorrect !", "Nome de canal inválido!");
    }
}
