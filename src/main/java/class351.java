import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public abstract class class351 {

    @OriginalMember(owner = "client!bp", name = "c", descriptor = "I")
    public static int field5051 = -1;

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "I")
    public static int field5049;

    @OriginalMember(owner = "client!bp", name = "b", descriptor = "I")
    public int field5050;

    @OriginalMember(owner = "client!bp", name = "d", descriptor = "I")
    public static int field5052;

    @OriginalMember(owner = "client!bp", name = "e", descriptor = "Ljava/lang/String;")
    public String field5053;

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(B)Ljava/net/Socket;")
    public final Socket method2083(byte arg0) throws IOException {
        field5049++;
        int var2 = -69 / ((arg0 - 55) / 44);
        return new Socket(this.field5053, this.field5050);
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(IZ)I")
    public static final int method2084(int arg0, boolean arg1) {
        field5052++;
        if (class377.field5333 == null) {
            return 0;
        } else if (arg1 || class45.field669 == null) {
            int var2 = 0;
            for (int var3 = arg0; var3 < class377.field5333.length; var3++) {
                int var4 = class377.field5333[var3];
                if (class32.field384.method947(93, var4)) {
                    var2++;
                }
                if (class164.field2497.method947(-120, var4)) {
                    var2++;
                }
            }
            return var2;
        } else {
            return class377.field5333.length * 2;
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(I)Ljava/net/Socket;")
    public abstract Socket method1408(int arg0) throws IOException;
}
