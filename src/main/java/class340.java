import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class340 {

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "[Lwc;")
    public class64[] field5015 = new class64[8];

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "[I")
    public int[] field5017 = new int[100];

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "[I")
    public int[] field5013 = new int[3];

    @OriginalMember(owner = "client!nb", name = "h", descriptor = "[Lro;")
    public class407[] field5020 = new class407[100];

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "I")
    public int field5014;

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "I")
    public static int field5018;

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "I")
    public static int field5019;

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "Ljava/lang/Object;")
    public Object field5016;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(B)I")
    public static final int method2203(byte arg0) {
        field5018++;
        if (class211.field2872 != null) {
            return 3;
        } else if (arg0 <= 50) {
            return -91;
        } else if (class424.field6183) {
            return 2;
        } else {
            return 1;
        }
    }
}
