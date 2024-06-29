import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vea")
public class class676 {

    @OriginalMember(owner = "client!vea", name = "c", descriptor = "Ljava/lang/String;")
    public String field8744;

    @OriginalMember(owner = "client!vea", name = "d", descriptor = "Ljava/lang/String;")
    public String field8745;

    @OriginalMember(owner = "client!vea", name = "b", descriptor = "Ljava/lang/String;")
    public String field8743;

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field8742 = new BigInteger("10001", 16);

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(I)V")
    public static void method3639(int arg0) {
        field8742 = null;
        if (arg0 <= 113) {
            field8742 = null;
        }
    }

    @OriginalMember(owner = "client!vea", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
    public class676(String arg0, String arg1, String arg2) {
        this.field8744 = arg0;
        this.field8745 = arg2;
        this.field8743 = arg1;
    }
}
