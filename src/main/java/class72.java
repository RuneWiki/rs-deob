import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class72 {

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "[[I")
    public static int[][] field1146 = new int[6][];

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "I")
    public static int field1144 = 104;

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "I")
    public static int field1145;

    @OriginalMember(owner = "client!kj", name = "e", descriptor = "I")
    public static int field1148;

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "Ljq;")
    public static class346 field1147;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(I)V")
    public static void method423(int arg0) {
        field1146 = null;
        if (arg0 == 13097) {
            field1147 = null;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lfa;ILmv;)V")
    public static final void method424(class615 arg0, int arg1, class295 arg2) {
        field1145++;
        if (arg1 != 6) {
            field1146 = null;
        }
        class470.field6758 = arg2;
        class537.field7891 = arg0;
    }
}
