import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ws")
public abstract class class326 {

    @OriginalMember(owner = "client!ws", name = "d", descriptor = "F")
    public static float field4814;

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "I")
    public static int field4811;

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "I")
    public static int field4812;

    @OriginalMember(owner = "client!ws", name = "c", descriptor = "I")
    public static int field4813;

    @OriginalMember(owner = "client!ws", name = "f", descriptor = "I")
    public static int field4816;

    @OriginalMember(owner = "client!ws", name = "e", descriptor = "[[I")
    public static int[][] field4815;

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(BLjr;)Luba;", line = 4)
    public static final class394 method1971(byte arg0, class96 arg1) {
        if (arg0 <= 61) {
            return null;
        } else {
            field4816++;
            return new class394(arg1.method722(4), arg1.method722(4), arg1.method722(4), arg1.method722(4), arg1.method736(-119), arg1.method736(-124), arg1.method718(-118));
        }
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(I)V", line = 25)
    public static void method1973(int arg0) {
        field4815 = null;
        if (arg0 <= 57) {
            method1974((byte) -103, -120);
        }
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(BI)V", line = 35)
    public static final void method1974(byte arg0, int arg1) {
        if (arg0 >= -13) {
            return;
        }
        class328 var2 = class205.field3010;
        synchronized (class205.field3010) {
            class205.field3010.method1989(arg1, (byte) 98);
        }
        field4812++;
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(BLrd;)Lrd;")
    public abstract class306 method1972(byte arg0, class306 arg1);
}
