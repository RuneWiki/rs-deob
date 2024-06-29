import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wq")
public class class548 {

    @OriginalMember(owner = "client!wq", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field7648 = new String[5];

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "[I")
    public static int[] field7647 = new int[2];

    @OriginalMember(owner = "client!wq", name = "e", descriptor = "[I")
    public static int[] field7651 = new int[14];

    @OriginalMember(owner = "client!wq", name = "c", descriptor = "I")
    public static int field7649;

    @OriginalMember(owner = "client!wq", name = "d", descriptor = "I")
    public static int field7650;

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(Lsha;I)Ljava/lang/String;", line = 4)
    public static final String method3244(class115 arg0, int arg1) {
        field7649++;
        if (client.method779(arg0).method1112((byte) 50) == 0) {
            return null;
        } else if (arg0.field1451 == null || arg0.field1451.trim().length() == 0) {
            return class635.field8860 ? "Hidden-use" : null;
        } else {
            if (arg1 != 11969) {
                method3245(-113);
            }
            return arg0.field1451;
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(I)V", line = 28)
    public static void method3245(int arg0) {
        field7648 = null;
        field7647 = null;
        field7651 = null;
        if (arg0 > -106) {
            field7651 = null;
        }
    }
}
