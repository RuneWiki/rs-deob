import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vba")
public class class417 implements class444 {

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "I")
    public int field5789;

    @OriginalMember(owner = "client!vba", name = "b", descriptor = "I")
    public static int field5790;

    @OriginalMember(owner = "client!vba", name = "c", descriptor = "I")
    public static int field5791;

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(B)Lhl;")
    public final class353 method327(byte arg0) {
        if (arg0 <= 51) {
            return null;
        } else {
            field5790++;
            return class443.field6134;
        }
    }

    @OriginalMember(owner = "client!vba", name = "<init>", descriptor = "(I)V")
    public class417(int arg0) {
        this.field5789 = arg0;
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(I)Ljava/lang/String;")
    public static final String method2459(int arg0) {
        field5791++;
        if (class383.field5382 || class493.field6765 == null) {
            return "";
        } else if (arg0 == -11189) {
            return class493.field6765.field7694;
        } else {
            return null;
        }
    }
}
