import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public abstract class class434 {

    @OriginalMember(owner = "client!re", name = "a", descriptor = "Lla;")
    public static class319 field6585 = new class319(98, 10);

    @OriginalMember(owner = "client!re", name = "d", descriptor = "Lni;")
    public static class367 field6588;

    @OriginalMember(owner = "client!re", name = "e", descriptor = "Lla;")
    public static class319 field6589;

    @OriginalMember(owner = "client!re", name = "g", descriptor = "I")
    public static int field6591;

    @OriginalMember(owner = "client!re", name = "c", descriptor = "I")
    public static int field6587;

    @OriginalMember(owner = "client!re", name = "f", descriptor = "I")
    public static int field6590;

    @OriginalMember(owner = "client!re", name = "b", descriptor = "[Laa;")
    public static class341[] field6586;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IBI)[B")
    public abstract byte[] method1523(int arg0, byte arg1, int arg2);

    @OriginalMember(owner = "client!re", name = "a", descriptor = "([BI)V")
    public abstract void method1522(byte[] arg0, int arg1);

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Z)V")
    public static void method2644(boolean arg0) {
        if (arg0) {
            field6586 = null;
            field6589 = null;
            field6588 = null;
            field6585 = null;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(II)Z")
    public static final boolean method2645(int arg0, int arg1) {
        if (arg1 != 0) {
            field6588 = null;
        }
        field6587++;
        return arg0 >= 12 && arg0 <= 17;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(B)[B")
    public abstract byte[] method1521(byte arg0);

    static {
        new class446("clan_chat", "clanchat", "conversation_clan", "clan_chat");
        field6588 = new class367(64, 7);
        field6589 = new class319(47, -1);
        field6591 = 0;
    }
}
