import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class699 {

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "I")
    public static int field9262 = 1405;

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "[Lfi;")
    public static class13[] field9266 = new class13[300];

    @OriginalMember(owner = "client!mi", name = "j", descriptor = "I")
    public static int field9271 = 500;

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "I")
    public static int field9264;

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "I")
    public int field9265;

    @OriginalMember(owner = "client!mi", name = "f", descriptor = "I")
    public static int field9267;

    @OriginalMember(owner = "client!mi", name = "g", descriptor = "I")
    public int field9268;

    @OriginalMember(owner = "client!mi", name = "h", descriptor = "I")
    public int field9269;

    @OriginalMember(owner = "client!mi", name = "i", descriptor = "I")
    public int field9270;

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "Lha;")
    public static class570 field9263;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)V", line = 4)
    public static void method3797(int arg0) {
        field9266 = null;
        if (arg0 != 300) {
            method3797(-53);
        }
        field9263 = null;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(II)V", line = 24)
    public static final void method3798(int arg0, int arg1) {
        field9267++;
        class696.field9019 = arg1;
        if (arg0 == 300) {
            class366.field4470.method2919(0);
        }
    }
}
