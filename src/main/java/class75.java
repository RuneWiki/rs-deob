import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class75 extends class72 {

    @OriginalMember(owner = "client!jk", name = "p", descriptor = "I")
    public static int field1232;

    @OriginalMember(owner = "client!jk", name = "q", descriptor = "I")
    public static int field1233;

    @OriginalMember(owner = "client!jk", name = "r", descriptor = "I")
    public static int field1234;

    @OriginalMember(owner = "client!jk", name = "o", descriptor = "Ldl;")
    public static class46 field1231;

    @OriginalMember(owner = "client!jk", name = "s", descriptor = "[[Z")
    public static boolean[][] field1235;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)V")
    public static void method459(int arg0) {
        field1231 = null;
        field1235 = null;
        if (arg0 != -4097) {
            field1231 = null;
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(BII)V")
    public static final void method460(byte arg0, int arg1, int arg2) {
        field1234++;
        class55 var3 = class62.method395(7, arg1, (byte) -66);
        var3.method340((byte) -110);
        int var4 = -125 % ((arg0 - 18) / 55);
        var3.field947 = arg2;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Lvh;I)V")
    public static final void method461(class108 arg0, int arg1) {
        if (arg1 != 0) {
            method460((byte) -80, 92, 2);
        }
        field1233++;
    }
}
