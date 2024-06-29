import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ot")
public abstract class class240 {

    @OriginalMember(owner = "client!ot", name = "d", descriptor = "S")
    public static short field3150 = 205;

    @OriginalMember(owner = "client!ot", name = "b", descriptor = "I")
    public int field3148;

    @OriginalMember(owner = "client!ot", name = "c", descriptor = "I")
    public static int field3149;

    @OriginalMember(owner = "client!ot", name = "e", descriptor = "I")
    public static int field3151;

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "Llda;")
    public static class621 field3147;

    @OriginalMember(owner = "client!ot", name = "f", descriptor = "Ljava/lang/String;")
    public String field3152;

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(B)Ljava/net/Socket;")
    public final Socket method1484(byte arg0) throws IOException {
        if (arg0 <= 53) {
            return null;
        } else {
            field3151++;
            return new Socket(this.field3152, this.field3148);
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(I)Ljava/net/Socket;")
    public abstract Socket method458(int arg0) throws IOException;

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(Z)V")
    public static void method1485(boolean arg0) {
        if (arg0) {
            field3150 = 66;
        }
        field3147 = null;
    }
}
