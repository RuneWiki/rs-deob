import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class101 {

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "I")
    public static int field1455 = 0;

    @OriginalMember(owner = "client!ue", name = "h", descriptor = "I")
    public static int field1461 = 0;

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "F")
    public static float field1456;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "I")
    public static int field1454;

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "I")
    public static int field1459;

    @OriginalMember(owner = "client!ue", name = "g", descriptor = "I")
    public static int field1460;

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "Lqh;")
    public static class35 field1458;

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "[[[I")
    public static int[][][] field1457;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(B)V", line = 18)
    public static void method658(byte arg0) {
        field1457 = (int[][][]) null;
        field1458 = null;
        if (arg0 != -126) {
            field1461 = -114;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(ZI)V", line = 29)
    public static final void method659(boolean arg0, int arg1) {
        class242.field3816 = arg0;
        field1459++;
        class51.field769 = !class261.method1836(arg1);
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lnm;I)V", line = 45)
    public static final void method660(class221 arg0, int arg1) {
        field1454++;
        class287.field4706 = arg0;
        if (arg1 != 0) {
            method659(true, -30);
        }
    }
}
