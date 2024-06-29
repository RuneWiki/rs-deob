import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class111 {

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field1800 = new String[200];

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "I")
    public static int field1799;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(B)[Lpu;", line = 4)
    public static final class559[] method937(byte arg0) {
        if (arg0 == -61) {
            field1799++;
            return new class559[] { class611.field8836, class532.field7533, class686.field9676, class640.field9112, class697.field9801, class63.field1143, class531.field7524, class742.field10407, class18.field235, class86.field1556, class252.field3597, class343.field4824, class193.field2780, class368.field5150 };
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(B)V", line = 19)
    public static void method938(byte arg0) {
        field1800 = null;
        if (arg0 <= 60) {
            field1800 = null;
        }
    }
}
