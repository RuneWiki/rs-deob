import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hfa")
public class class366 extends OutputStream {

    @OriginalMember(owner = "client!hfa", name = "b", descriptor = "Z")
    public static volatile boolean field5185 = true;

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "I")
    public static int field5184;

    @OriginalMember(owner = "client!hfa", name = "c", descriptor = "I")
    public static int field5186;

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(Z)V")
    public static final void method2196(boolean arg0) {
        if (!arg0) {
            return;
        }
        field5186++;
        if (!class405.field5580) {
            return;
        }
        while (true) {
            while (class213.field3123 < class556.field7710.length) {
                class422 var1 = class556.field7710[class213.field3123];
                if (var1 != null && var1.field5875 == -1) {
                    if (class138.field2288 == null) {
                        class138.field2288 = class224.field3278.method4263(var1.field5868, 1);
                    }
                    int var2 = class138.field2288.field5466;
                    if (var2 == -1) {
                        return;
                    }
                    var1.field5875 = var2;
                    class213.field3123++;
                    class138.field2288 = null;
                } else {
                    class213.field3123++;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!hfa", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field5184++;
        throw new IOException();
    }
}
