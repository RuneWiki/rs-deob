import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tba")
public class class146 {

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "[I")
    public static int[] field1793 = new int[13];

    @OriginalMember(owner = "client!tba", name = "b", descriptor = "I")
    public static int field1794;

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(I)V")
    public static void method941(int arg0) {
        field1793 = null;
        if (arg0 != 337336776) {
            method942(-116, (byte) -97);
        }
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(IB)V")
    public static final void method942(int arg0, byte arg1) {
        if (arg1 != -89) {
            method942(-71, (byte) 106);
        }
        class642.field9170 = new int[arg0];
        class368.field4958 = new int[arg0];
        field1794++;
        class637.field9119 = new int[arg0];
        class137.field1736 = new int[arg0];
        class608.field8735 = new int[arg0];
    }
}
